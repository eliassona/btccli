(ns btccli.core
  (:use [clojure.pprint])
  (:require [clojure.data.json :as json]
            [clojure.repl :refer [source doc]]
            [clojure.java.shell :refer [sh]]
            [base58.core :as base58])
  (:import [java.io File]
           [com.jcraft.jsch JSch]
           [java.io ByteArrayOutputStream]
           ))

(defmacro dbg [body]
  `(let [x# ~body]
     (println "dbg:" '~body "=" x#)
     x#))


(defn ssh-session [user host port password]
  (let [session (.getSession (JSch.) user host port)
        out (ByteArrayOutputStream.)]
	  (.setPassword session password)
	  (.setConfig session "StrictHostKeyChecking" "no")
	  (.connect session)
    session))

(defn ssh-command [session command]
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
        (.disconnect channel)))))

(defn umbrel-cli [session cmd]
  (ssh-command session (format "cd ~/umbrel/bin; docker exec bitcoin bitcoin-cli %s" cmd)))


    
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
  (if (coll? arg) (json/json-str arg) arg))

(defn apply-json [args]
  (map (fn [a] `(apply-json-if-coll ~a)) args))


(defn arity-of [session cli cmd conv-fn args]
    `(~args
       (~conv-fn 
         (~cli ~session (escape-quotation (format ~(format-str-of (inc (count args))) ~(str cmd) ~@(apply-json args)))))))

(defn defn-of [session cli cmd conv-fn args]
  `(defn 
     ~cmd
     ~@(map (partial arity-of session cli cmd conv-fn) (args-of args))))

(defmacro def-api 
  ([session cli cmd conv-fn args]
    (defn-of session cli cmd conv-fn args))
  ([session cli cmd conv-fn]
    `(def-api ~session ~cli ~cmd ~conv-fn []))
  ([session cli cmd]
    `(def-api ~session ~cli ~cmd identity))
  )

(defn only-names [l]
  (let [l (.trim l)]
    (not (or (empty? l) (= (.indexOf l "==") 0)))))

(defn parse-names [s]
  (let [lines (.split s "\n")]
    (map (comp first #(.split % "[ \n]")) (filter only-names lines)))
  )




(defn create-api
  ([password]
    (create-api password umbrel-cli))
  ([password cli]
  
  (let [session (ssh-session "umbrel" "umbrel.local" 22 password)
        cmd-names (set (parse-names (cli session "help")))]    
    
	;   == Blockchain ==   
	  (def-api session cli getbestblockhash .trim)
	  (def-api session cli getblock json/read-str [blockhash [verbosity]])
	  (def-api session cli getblockchaininfo json/read-str)
	  (def-api session cli getblockcount json/read-str)
	  (def-api session cli getblockfilter identity [blockhash [verbosity]])
	  (def-api session cli getblockhash .trim [index])
	  (def-api session cli getblockheader json/read-str [blockhash [verbosity]])
	  (def-api session cli getblockstats identity [hash_or_height [stats]])
	  (def-api session cli getchaintips json/read-str)
	  (def-api session cli getchaintxstats json/read-str [[nblocks blockhash]])
	  (def-api session cli getdifficulty json/read-str)
	  (def-api session cli getmempoolancestors identity [txid [verbose]])
	  (def-api session cli getmempooldescendants identity [txid [verbose]])
	  (def-api session cli getmempoolentry identity [txid])
	  (def-api session cli getmempoolinfo json/read-str)
	  (def-api session cli getrawmempool json/read-str [[verbose mempool_sequence]])
	  (def-api session cli gettxout identity [txid n [include_mempool]])
	  (def-api session cli gettxoutproof identity [txids [blockhash]])
	  (def-api session cli gettxoutsetinfo json/read-str [[hash_type hash_or_height use_index]])
	  (def-api session cli preciousblock identity [blockhash])
	  (def-api session cli pruneblockchain identity [height])
	  (def-api session cli savemempool)
	  (def-api session cli scantxoutset identity [action [scanobjects]])
	  (def-api session cli verifychain identity [checklevel nblocks])
	  (def-api session cli verifytxoutproof identity [proof])
	  
	;  == Control == 
	  (def-api session cli getmemoryinfo json/read-str [[mode]])
	  (def-api session cli getrpcinfo json/read-str)
	  (def-api session cli help identity [[command]])
	  (def-api session cli logging json/read-str [[include_category exclude_category]])
	  (def-api session cli stop)
	  (def-api session cli uptime json/read-str)
	  
	;  == Generating ==
	  (def-api session cli generateblock identity [output rawtx-txid])
	  (def-api session cli generatetoaddress identity [nblocks address [maxtries]])
	  (def-api session cli generatetodescriptor identity [num_blocks descriptor [maxtries]])
	
	;  == Mining ==
	  (def-api session cli getblocktemplate identity [[template_request]])
	  (def-api session cli getmininginfo json/read-str) 
	  (def-api session cli getnetworkhashps json/read-str [[nblocks height]])
	  (def-api session cli prioritisetransaction identity [txid dummy fee_delta])
	  (def-api session cli submitblock identity [hexdata [dummy]])
	  (def-api session cli submitheader identity [hexdata])
	
	;  == Network ==
	  (def-api session cli addnode identity [node command])
	  (def-api session cli clearbanned identity) 
	  (def-api session cli disconnectnode identity [[address nodeid]])
	  (def-api session cli getaddednodeinfo json/read-str [[node]])
	  (def-api session cli getconnectioncount json/read-str) 
	  (def-api session cli getnettotals json/read-str) 
	  (def-api session cli getnetworkinfo json/read-str) 
	  (def-api session cli getnodeaddresses json/read-str [[count network]])
	  (def-api session cli getpeerinfo json/read-str) 
	  (def-api session cli listbanned json/read-str) 
	  (def-api session cli ping identity) 
	  (def-api session cli setban identity [subnet command [bantime absolute]])
	  (def-api session cli setnetworkactive identity [state])
	
	;  == Rawtransactions ==
	  (def-api session cli analyzepsbt json/read-str [psbt])
	  (def-api session cli combinepsbt identity [psbts])
	  (def-api session cli combinerawtransaction identity [hexstrings])
	  (def-api session cli converttopsbt identity [hexstring [permitsigdata iswitness]])
	  (def-api session cli createpsbt identity [utxos address-amounts [locktime replaceable]])
	  (def-api session cli createrawtransaction identity [utxos address-amounts [locktime replaceable]])
	  (def-api session cli decodepsbt identity [psbt])
	  (def-api session cli decoderawtransaction json/read-str [hexstring [iswitness]])
	  (def-api session cli decodescript identity [hexstring])
	  (def-api session cli finalizepsbt identity [psbt [extract]])
	  (def-api session cli fundrawtransaction identity [hexstring [options iswitness]])
	  (def-api session cli getrawtransaction .trim [txid [verbose blockhash]])
	  (def-api session cli joinpsbts identity [psbts])
	  (def-api session cli sendrawtransaction identity [hexstring [maxfeerate]])
	  (def-api session cli signrawtransactionwithkey identity [hexstring privatekeys [txid-vout-scriptPubKey-redeemScript-witnessScript-amounts sighashtype]])
	  (def-api session cli testmempoolaccept identity [rawtxs [maxfeerate]])
	  (def-api session cli utxoupdatepsbt identity [psbt [json]]) 
	
	;  == Signer ==
	  (def-api session cli enumeratesigners identity) 
	
	;  == Util ==
	  (def-api session cli createmultisig json/read-str [nrequired keys [address_type]])
	  (def-api session cli deriveaddresses identity [descriptor [range]])
	  (def-api session cli estimatesmartfee json/read-str [conf_target [estimate_mode]])
	  (def-api session cli getdescriptorinfo identity [descriptor])
	  (def-api session cli getindexinfo json/read-str [[index_name]])
	  (def-api session cli signmessagewithprivkey identity [privkey message])
	  (def-api session cli validateaddress json/read-str [address])
	  (def-api session cli verifymessage identity [address signature message])
	
	;  == Wallet ==
	  (def-api session cli abandontransaction identity [txid])
	  (def-api session cli abortrescan identity) 
	  (def-api session cli addmultisigaddress identity [nrequired keys [label address_type]])
	  (def-api session cli backupwallet identity [destination])
	  (def-api session cli bumpfee identity [txid [options]])
	  (def-api session cli createwallet json/read-str [wallet_name [disable_private_keys blank passphrase avoid_reuse descriptors load_on_startup external_signe]])
	  (def-api session cli dumpprivkey .trim [address])
	  (def-api session cli dumpwallet identity [filename])
	  (def-api session cli encryptwallet identity [passphrase])
	  (def-api session cli getaddressesbylabel identity [label])
	  (def-api session cli getaddressinfo json/read-str [address])
	  (def-api session cli getbalance json/read-str [[dummy minconf include_watchonly avoid_reuse]])
	  (def-api session cli getbalances json/read-str) 
	  (def-api session cli getnewaddress .trim [[label address_type]])
	  (def-api session cli getrawchangeaddress .trim [[address_type]])
	  (def-api session cli getreceivedbyaddress json/read-str [address [minconf]])
	  (def-api session cli getreceivedbylabel identity [label [minconf]])
	  (def-api session cli gettransaction identity [txid [include_watchonly verbose]])
	  (def-api session cli getunconfirmedbalance identity) 
	  (def-api session cli getwalletinfo json/read-str) 
	  (def-api session cli importaddress identity [address [label rescan p2sh]])
	  (def-api session cli importdescriptors identity [requests])
	  (def-api session cli importmulti identity [requests [options]])
	  (def-api session cli importprivkey identity [privkey [label rescan]])
	  (def-api session cli importprunedfunds identity [rawtransaction txoutproof])
	  (def-api session cli importpubkey identity [pubkey [label rescan]])
	  (def-api session cli importwallet identity [filename])
	  (def-api session cli keypoolrefill identity [[newsize]])
	  (def-api session cli listaddressgroupings identity) 
	  (def-api session cli listdescriptors identity) 
	  (def-api session cli listlabels identity [[purpose]])
	  (def-api session cli listlockunspent identity) 
	  (def-api session cli listreceivedbyaddress identity [[minconf include_empty include_watchonly address_filter]])
	  (def-api session cli listreceivedbylabel identity [[minconf include_empty include_watchonly]])
	  (def-api session cli listsinceblock identity [[blockhash target_confirmations include_watchonly include_removed]])
	  (def-api session cli listtransactions identity [[label count skip include_watchonly]])
	  (def-api session cli listunspent identity [[minconf maxconf addresses include_unsafe query_options]])
	  (def-api session cli listwalletdir json/read-str) 
	  (def-api session cli listwallets json/read-str) 
	  (def-api session cli loadwallet identity [filename [load_on_startup]])
	  (def-api session cli lockunspent identity [unlock [txid-vouts]]) 
	  (def-api session cli psbtbumpfee identity [txid [ options]])
	  (def-api session cli removeprunedfunds identity [txid])
	  (def-api session cli rescanblockchain identity [[start_height stop_height]])
	  (def-api session cli send identity [address-datas [conf_target estimate_mode fee_rate options]])
	  (def-api session cli sendmany identity [address [minconf comment addresses replaceable conf_target estimate_mode fee_rate verbose]])
	  (def-api session cli sendtoaddress identity [address amount [comment comment_to subtractfeefromamount replaceable conf_target estimate_mode avoid_reuse fee_rate verbose]])
	  (def-api session cli sethdseed identity [[newkeypool seed]])
	  (def-api session cli setlabel identity [address label])
	  (def-api session cli settxfee identity [amount])
	  (def-api session cli setwalletflag identity [flag [value]])
	  (def-api session cli signmessage identity [address message])
	  (def-api session cli signrawtransactionwithwallet identity [hexstring [json sighashtype]]) 
	  (def-api session cli unloadwallet identity [[wallet_name load_on_startup]])
	  (def-api session cli upgradewallet identity [[version]])
	  (def-api session cli walletcreatefundedpsbt identity [txid-vout-sequence address-data [locktime options bip32derivs]])
	  (def-api session cli walletdisplayaddress identity [bitcoin address to display])
	  (def-api session cli walletlock identity) 
	  (def-api session cli walletpassphrase identity [passphrase timeout])
	  (def-api session cli walletpassphrasechange identity [oldpassphrase newpassphrase])
	  (def-api session cli walletprocesspsbt identity [psbt [sign sighashtype bip32derivs]])
	
	;  == Zmq ==
	  (def-api session cli getzmqnotifications json/read-str)
	  
	  (defn _blocks 
	    ([block-fn] (_blocks block-fn 0 (getblockcount)))
	    ([block-fn i n] (if (< i n)
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
   
   (defmacro btc-doc [the-fn]
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
   
   (defn field-decl-of [name]
     (format "private final IFn %s;" name))
   
   (defn field-decls []
     (reduce (fn [acc v] (if acc (format "%s\n   %s" acc (field-decl-of v)) (format "   %s" (field-decl-of v)))) nil cmd-names))
   
   (defn init-field [name]
     (format "      %s = var(BTCCLI_CORE, \"%s\");" name name)
     )

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
           args (-> ((ns-publics *ns*) cmd-fn) meta :arglists)]
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
   public BtcCli(String password) {
      super(password);
%s
   }
%s
}

" (field-decls) 
  (init-fields)
  (init-methods))))

   
   session)))



(comment
  (decoderawtransaction (getrawtransaction (first ((getblock (getblockhash 1)) "tx"))))
  (createmultisig 2 ["03789ed0bb717d88f7d321a368d905e7430207ebbd82bd342cf11ae157a7ace5fd" 
                "03dbc6764b8884a92e871274b87583e6d5c2a58819473e17e107ef3f6aa5a61626"])
  (getblock (getblockhash 0))
  
  ;problem tx, it's too big for ssh?
  (def raw-tx (getrawtransaction (nth ((getblock (getblockhash 200000)) "tx") 384)))
  )



  
  
