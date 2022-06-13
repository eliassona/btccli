(ns btccli.core
  (:use [clojure.pprint])
  (:require [clojure.data.json :as json]
            [clojure.repl :refer [source doc]]
            [clojure.java.shell :refer [sh]]
            [base58.core :as base58]
            [clojure.set :refer [difference]]
            [instaparse.core :as insta]
            )
  (:import [java.io File]
           [com.jcraft.jsch JSch]
           [java.io ByteArrayOutputStream]
           [java.net Socket]
           
           ))




(defmacro dbg [body]
  `(let [x# ~body]
     (println "dbg:" '~body "=" x#)
     x#))

(def parser (insta/parser (clojure.java.io/resource "btccli.bnf")))

(def ast->clj-map 
  {:argname (fn [& args] (apply str args))
   :cmdname (fn [& args] (symbol (apply str args)))
   :cmdline (fn [cmd & args] `(def-api ~cmd ~@args))
   :arg identity
   :regulararg symbol
   :stringarg symbol
   :reqarg identity
   :optarg (fn [& args] `[~@args])
   })

(defn ast->clj [ast]
  (insta/transform ast->clj-map ast))


(defn ssh-session [user host port password]
  (let [session (.getSession (JSch.) user host port)
        out (ByteArrayOutputStream.)]
	  (.setPassword session password)
	  (.setConfig session "StrictHostKeyChecking" "no")
	  (.connect session)
    session))

(defn ssh-command [session]
  (fn [command]
    (let [out (ByteArrayOutputStream.)
          channel (.openChannel session "exec")]
      (try 
	      (.setCommand channel command)
	      (.setOutputStream channel out)
	      (.connect channel)
	      (while (.isConnected channel)
	        (Thread/sleep 100))
	      (String. (.toByteArray out))
        (finally 
          (.disconnect channel))))))

(def umbrel-session (partial ssh-session "umbrel" "umbrel.local" 22))

(defn umbrel-cli [session]
  (fn [cmd]
    (session (format "cd ~/umbrel/bin; docker exec bitcoin bitcoin-cli %s" cmd))))

(defn cmdline [cmd]
  (let [res (sh (format "bitcoin-cli %s" cmd))]
    (if (= :exit 0)
      (:out cmd)
      (throw (RuntimeException. "cmd error")))))
    
(defn format-str-of [n]
  (reduce 
    (fn [acc _] 
      (if acc 
        (str acc " %s") 
        (str "%s"))) 
    nil (range n)))

(defn args-of [args]
  (if-let [opt (last args)]
    (if (vector? opt)
      (loop [res [(vec (butlast args))]
             opt opt]
        (if (empty? opt)
          res
          (recur (conj res (conj (last res) (first opt))) (rest opt))))
     [args])
    [args]))

(def double-quote 34)
(def backslash 92)

(def escaped-double-quoute [backslash double-quote])

(defn escape-quotation [s]
  (let [ba (.getBytes s)]
    (String. 
      (byte-array 
        (reduce 
          (fn [acc v] (if (= v double-quote) (vec (concat acc escaped-double-quoute)) (conj acc v))) 
          [] 
          ba)))))

(defn apply-json-if-coll [arg]
  (if (instance? java.util.List arg) (json/json-str arg) arg))

(defn apply-json [args]
  (map (fn [a] `(apply-json-if-coll ~a)) args))


(defn arity-of [session cmd conv-fn args]
    `(~args
       (~conv-fn 
         (~session (escape-quotation (format ~(format-str-of (inc (count args))) ~(str cmd) ~@(apply-json args)))))))

(defn defn-of [session cmd conv-fn args]
  `(defn 
     ~cmd
     ~@(map (partial arity-of session cmd conv-fn) (args-of args))))

(defmacro def-api 
  ([session cmd conv-fn args]
    (defn-of session cmd conv-fn args))
  ([session cmd conv-fn]
    `(def-api ~session ~cmd ~conv-fn []))
  ([session cmd]
    `(def-api ~session ~cmd identity))
  )

(defn only-names [l]
  (let [l (.trim l)]
    (not (or (empty? l) (= (.indexOf l "==") 0)))))

(defn parse-names [s]
  (let [lines (.split s "\n")]
    (map (comp first #(.split % "[ \n]")) (filter only-names lines)))
  )

(defn proper-arg-of [index arg]
  (if (= arg "\"\"")
    (symbol (str "dummy" index))
    (let [ix0 (.indexOf arg "[")
          ix1 (.indexOf arg "{")]
      (if (or (= ix0 0) (= ix1 0))
        (symbol (str "jsonarg" index))
        arg))))



(defn change-json-arg [l]
  (let [args (rest l)]
    (clojure.string/join " " (conj (map-indexed proper-arg-of args) (first l)))))

(defn parse-names2 [s]
  (let [lines (.split s "\n")]
    (clojure.string/join "\n" (map (comp change-json-arg #(.split % "[ \n]")) (filter only-names lines))))
  )




(defn create-api
  ([session]
  (let [cmd-names (set (parse-names (session "help")))]    
    
	;   == Blockchain ==   
	  (def-api session getbestblockhash .trim)
	  (def-api session getblock json/read-str [blockhash [verbosity]])
	  (def-api session getblockchaininfo json/read-str)
	  (def-api session getblockcount json/read-str)
	  (def-api session getblockfilter identity [blockhash [verbosity]])
	  (def-api session getblockhash .trim [index])
	  (def-api session getblockheader json/read-str [blockhash [verbosity]])
	  (def-api session getblockstats identity [hash_or_height [stats]])
	  (def-api session getchaintips json/read-str)
	  (def-api session getchaintxstats json/read-str [[nblocks blockhash]])
	  (def-api session getdifficulty json/read-str)
	  (def-api session getmempoolancestors identity [txid [verbose]])
	  (def-api session getmempooldescendants identity [txid [verbose]])
	  (def-api session getmempoolentry identity [txid])
	  (def-api session getmempoolinfo json/read-str)
	  (def-api session getrawmempool json/read-str [[verbose mempool_sequence]])
	  (def-api session gettxout identity [txid n [include_mempool]])
	  (def-api session gettxoutproof identity [txids [blockhash]])
	  (def-api session gettxoutsetinfo json/read-str [[hash_type hash_or_height use_index]])
	  (def-api session preciousblock identity [blockhash])
	  (def-api session pruneblockchain identity [height])
	  (def-api session savemempool)
	  (def-api session scantxoutset identity [action [scanobjects]])
	  (def-api session verifychain identity [checklevel nblocks])
	  (def-api session verifytxoutproof identity [proof])
	  
	;  == Control == 
	  (def-api session getmemoryinfo json/read-str [[mode]])
	  (def-api session getrpcinfo json/read-str)
	  (def-api session help identity [[command]])
	  (def-api session logging json/read-str [[include_category exclude_category]])
	  (def-api session stop)
	  (def-api session uptime json/read-str)
	  
	;  == Generating ==
	  (def-api session generateblock identity [output rawtx-txid])
	  (def-api session generatetoaddress identity [nblocks address [maxtries]])
	  (def-api session generatetodescriptor identity [num_blocks descriptor [maxtries]])
	
	;  == Mining ==
	  (def-api session getblocktemplate identity [[template_request]])
	  (def-api session getmininginfo json/read-str) 
	  (def-api session getnetworkhashps json/read-str [[nblocks height]])
	  (def-api session prioritisetransaction identity [txid dummy fee_delta])
	  (def-api session submitblock identity [hexdata [dummy]])
	  (def-api session submitheader identity [hexdata])
	
	;  == Network ==
	  (def-api session addnode identity [node command])
	  (def-api session clearbanned identity) 
	  (def-api session disconnectnode identity [[address nodeid]])
	  (def-api session getaddednodeinfo json/read-str [[node]])
	  (def-api session getconnectioncount json/read-str) 
	  (def-api session getnettotals json/read-str) 
	  (def-api session getnetworkinfo json/read-str) 
	  (def-api session getnodeaddresses json/read-str [[count network]])
	  (def-api session getpeerinfo json/read-str) 
	  (def-api session listbanned json/read-str) 
	  (def-api session ping identity) 
	  (def-api session setban identity [subnet command [bantime absolute]])
	  (def-api session setnetworkactive identity [state])
	
	;  == Rawtransactions ==
	  (def-api session analyzepsbt json/read-str [psbt])
	  (def-api session combinepsbt identity [psbts])
	  (def-api session combinerawtransaction identity [hexstrings])
	  (def-api session converttopsbt identity [hexstring [permitsigdata iswitness]])
	  (def-api session createpsbt identity [utxos address-amounts [locktime replaceable]])
	  (def-api session createrawtransaction identity [utxos address-amounts [locktime replaceable]])
	  (def-api session decodepsbt identity [psbt])
	  (def-api session decoderawtransaction json/read-str [hexstring [iswitness]])
	  (def-api session decodescript json/read-str [hexstring])
	  (def-api session finalizepsbt identity [psbt [extract]])
	  (def-api session fundrawtransaction identity [hexstring [options iswitness]])
	  (def-api session getrawtransaction .trim [txid [verbose blockhash]])
	  (def-api session joinpsbts identity [psbts])
	  (def-api session sendrawtransaction identity [hexstring [maxfeerate]])
	  (def-api session signrawtransactionwithkey identity [hexstring privatekeys [txid-vout-scriptPubKey-redeemScript-witnessScript-amounts sighashtype]])
	  (def-api session testmempoolaccept identity [rawtxs [maxfeerate]])
	  (def-api session utxoupdatepsbt identity [psbt [json]]) 
	
	;  == Signer ==
	  (def-api session enumeratesigners identity) 
	
	;  == Util ==
	  (def-api session createmultisig json/read-str [nrequired keys [address_type]])
	  (def-api session deriveaddresses identity [descriptor [range]])
	  (def-api session estimatesmartfee json/read-str [conf_target [estimate_mode]])
	  (def-api session getdescriptorinfo identity [descriptor])
	  (def-api session getindexinfo json/read-str [[index_name]])
	  (def-api session signmessagewithprivkey identity [privkey message])
	  (def-api session validateaddress json/read-str [address])
	  (def-api session verifymessage identity [address signature message])
	
	;  == Wallet ==
	  (def-api session abandontransaction identity [txid])
	  (def-api session abortrescan identity) 
	  (def-api session addmultisigaddress identity [nrequired keys [label address_type]])
	  (def-api session backupwallet identity [destination])
	  (def-api session bumpfee identity [txid [options]])
	  (def-api session createwallet json/read-str [wallet_name [disable_private_keys blank passphrase avoid_reuse descriptors load_on_startup external_signe]])
	  (def-api session dumpprivkey .trim [address])
	  (def-api session dumpwallet identity [filename])
	  (def-api session encryptwallet identity [passphrase])
	  (def-api session getaddressesbylabel identity [label])
	  (def-api session getaddressinfo json/read-str [address])
	  (def-api session getbalance json/read-str [[dummy minconf include_watchonly avoid_reuse]])
	  (def-api session getbalances json/read-str) 
	  (def-api session getnewaddress .trim [[label address_type]])
	  (def-api session getrawchangeaddress .trim [[address_type]])
	  (def-api session getreceivedbyaddress json/read-str [address [minconf]])
	  (def-api session getreceivedbylabel identity [label [minconf]])
	  (def-api session gettransaction identity [txid [include_watchonly verbose]])
	  (def-api session getunconfirmedbalance identity) 
	  (def-api session getwalletinfo json/read-str) 
	  (def-api session importaddress identity [address [label rescan p2sh]])
	  (def-api session importdescriptors identity [requests])
	  (def-api session importmulti identity [requests [options]])
	  (def-api session importprivkey identity [privkey [label rescan]])
	  (def-api session importprunedfunds identity [rawtransaction txoutproof])
	  (def-api session importpubkey identity [pubkey [label rescan]])
	  (def-api session importwallet identity [filename])
	  (def-api session keypoolrefill identity [[newsize]])
	  (def-api session listaddressgroupings identity) 
	  (def-api session listdescriptors identity) 
	  (def-api session listlabels identity [[purpose]])
	  (def-api session listlockunspent identity) 
	  (def-api session listreceivedbyaddress identity [[minconf include_empty include_watchonly address_filter]])
	  (def-api session listreceivedbylabel identity [[minconf include_empty include_watchonly]])
	  (def-api session listsinceblock identity [[blockhash target_confirmations include_watchonly include_removed]])
	  (def-api session listtransactions identity [[label count skip include_watchonly]])
	  (def-api session listunspent identity [[minconf maxconf addresses include_unsafe query_options]])
	  (def-api session listwalletdir json/read-str) 
	  (def-api session listwallets json/read-str) 
	  (def-api session loadwallet identity [filename [load_on_startup]])
	  (def-api session lockunspent identity [unlock [txid-vouts]]) 
	  (def-api session psbtbumpfee identity [txid [ options]])
	  (def-api session removeprunedfunds identity [txid])
	  (def-api session rescanblockchain identity [[start_height stop_height]])
	  (def-api session send identity [address-datas [conf_target estimate_mode fee_rate options]])
	  (def-api session sendmany identity [address [minconf comment addresses replaceable conf_target estimate_mode fee_rate verbose]])
	  (def-api session sendtoaddress identity [address amount [comment comment_to subtractfeefromamount replaceable conf_target estimate_mode avoid_reuse fee_rate verbose]])
	  (def-api session sethdseed identity [[newkeypool seed]])
	  (def-api session setlabel identity [address label])
	  (def-api session settxfee identity [amount])
	  (def-api session setwalletflag identity [flag [value]])
	  (def-api session signmessage identity [address message])
	  (def-api session signrawtransactionwithwallet identity [hexstring [json sighashtype]]) 
	  (def-api session unloadwallet identity [[wallet_name load_on_startup]])
	  (def-api session upgradewallet identity [[version]])
	  (def-api session walletcreatefundedpsbt identity [txid-vout-sequence address-data [locktime options bip32derivs]])
	  (def-api session walletdisplayaddress identity [address])
	  (def-api session walletlock identity) 
	  (def-api session walletpassphrase identity [passphrase timeout])
	  (def-api session walletpassphrasechange identity [oldpassphrase newpassphrase])
	  (def-api session walletprocesspsbt identity [psbt [sign sighashtype bip32derivs]])
	
	;  == Zmq ==
	  (def-api session getzmqnotifications json/read-str)
	  
   
   
    (let [d (difference (set (map symbol cmd-names)) (set (keys (ns-publics (create-ns 'btccli.core)))))]
      (when (not (empty? d))
        (println (format "Warning! Definitions for %s are missing" d))))
   
    
    
    
;; some functions using the API   
	  (defn _blocks 
	    ([block-fn] (_blocks block-fn 0 (getblockcount)))
	    ([block-fn i n] (if (<= i n)
	             (lazy-seq (cons (block-fn (getblockhash i)) (_blocks block-fn (inc i) n)))
	             '())))
	  
	  (defn blocks 
	    "get all blocks as a lazy seq, remember don't type (blocks) in the repl, it will take forever"
	    []
	    (_blocks getblock))
	  
	  (defn block-headers 
	    "get all block headers as a lazy seq, remember don't type (blockheaders) in the repl, it will take forever"
	    []
	    (_blocks getblockheader))
	  
    (def counter (atom 0))
   
	  (defn add-vout [acc v]
	    (pprint @counter)
      (swap! counter inc) 
	    (let [values (map #(% "value") v)]
	      (+ acc (reduce + values))))
	  
	  (defn output-sum-of [block-height]
	    (let [b (getblock (getblockhash block-height))
	          txs (b "tx")
	          decoded-txs (map (comp decoderawtransaction getrawtransaction) txs)
	          outs (map #(% "vout") decoded-txs)]
	      (reduce add-vout 0.0 outs)))
   
   (defmacro btc-doc
     "documentation for each cmd"
     [the-fn]
     `(let [m# (-> ~the-fn var meta)
            name# (:name m#)]
        (if (contains? ~cmd-names (str name#))
          (println (format 
                     "%s/%s\n%s\n\n%s" 
                     (-> m# :ns str) 
                     name#
                     (:arglists m#)
                     (help name#)
                     ))
          (throw (IllegalArgumentException. (format "%s is not a bitcoin function" name#))))))

;; javagen
   
   (defn field-decl-of [name]
     (format "private final IFn %s;" name))
   
   (defn field-decls []
     (reduce (fn [acc v] (if acc (format "%s\n   %s" acc (field-decl-of v)) (format "   %s" (field-decl-of v)))) nil cmd-names))
   
   (defn init-field [name]
     (format "      %s = createFn(\"%s\");" name name))

   (defn inits [the-fn]
     (reduce (fn [acc v] (if acc (format "%s\n%s" acc v) v)) nil (map the-fn cmd-names))
     )

   
   (defn init-fields []
     (inits init-field)
     )
   
   (defn java-args-of [arg]
     (format "Object %s" arg))
   
   (defn java-call-args-of [args]
     (if (empty? args)
       ""
       (reduce (fn [acc v] (if acc (format "%s, %s" acc v) v)) nil args)))     
   
   (defn java-call-of [name args]
     (format "%s.invoke(%s)" name (java-call-args-of args))
     )
   
   (defn tabbed-of [doc]
     (reduce (fn [acc v] (if acc (format "%s\n%s" acc v) v)) nil (map #(format "    * %s" %) (.split doc "\n"))))
   
   (defn doc-of [name args]
     (format "   /**\n%s\n    */" (tabbed-of (help name))) 
     )
   
   (defn init-arity [name args]
     (let [args (map (comp #(.replaceAll % "-" "_") str) args)]
       (format "%s\n   public Object %s(%s) { return %s; }\n" 
               (doc-of name args)
               name 
               (if (empty? args)
                 ""
                 (reduce (fn [acc v] (if acc (format "%s, %s" acc v) v)) nil (map java-args-of args)))
               (java-call-of name args))))
     
   
   (defn init-method [name]
     (let [cmd-fn (symbol name)
           args (-> ((ns-publics (create-ns 'btccli.core)) cmd-fn) meta :arglists)]
       (reduce (fn [acc v] (if acc (format "%s\n\n%s" acc v) v)) nil (map (partial init-arity name) args))))
   
   (defn init-methods []
     (inits init-method)
     )
   
   (defn java-gen [dir]
     (spit (File. dir "BtcCli.java") 
(format "package btccli;
import clojure.lang.IFn;
import static clojure.java.api.Clojure.var;
/**
  * Bitcoin core API on Umbrel via SSH. 
  */
public class BtcCli extends AbstractBtcCli {
%s

   /**
    * Create a btc api that uses umbrel via ssh
    */
   public static final BtcCli createUmbrel(final String password) {
      return new BtcCli(createUmbrelSession(password)); 
   }
   
   /**
    * Create a btc api that uses the command line locally
    */
   public static final BtcCli createCmdLine() {
      return new BtcCli(cmdLine()); 
   } 

   public BtcCli(final IFn sessionFn) {
      super(sessionFn);
%s
   }
%s
}

" (field-decls) 
  (init-fields)
  (init-methods))))

   
   session)))

(defn create-umbrel-session [password]
  (create-api (-> password umbrel-session ssh-command umbrel-cli)))

(comment
  ;problem tx, it's too big for ssh?
  (def raw-tx (getrawtransaction (nth ((getblock (getblockhash 200000)) "tx") 384)))
  (* 29666 370(/ ((estimatesmartfee 6) "feerate") 1000))

  )


  
;May 31 17:02:11: 31/05 17:02:11, UltraTypeConverter#tryRefreshUltraPersistent, (#97, PGW.WFL_32329_recreate.01: Workflow pool 15)
;May 31 17:02:11: WARNING: Refreshing UltraPersistent
;May 31 17:02:11: 31/05 17:02:11, UltraTypeConverter#tryRefreshUltraPersistent, (#97, PGW.WFL_32329_recreate.01: Workflow pool 15)
;May 31 17:02:11: WARNING: class=java.lang.RuntimeException, message=RCP is locked while running ECSA workflows
;May 31 17:02:11: 31/05 17:02:11, UltraTypeConverter#tryRefreshUltraPersistent, (#97, PGW.WFL_32329_recreate.01: Workflow pool 15)
;May 31 17:02:11: WARNING: _ultraPersistent is null
  



