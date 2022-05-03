(ns btccli.core
  (:use [clojure.pprint])
  (:require [clojure.data.json :as json]
            [clojure.repl :refer [source doc]]
            [clojure.java.shell :refer [sh]])
  (:import [com.jcraft.jsch JSch]
           [java.io ByteArrayOutputStream]))

(defmacro dbg [body]
  `(let [x# ~body]
     (println "dbg:" '~body "=" x#)
     x#))

(defn ssh [user host port password command]
  (let [session (.getSession (JSch.) user host port)
        out (ByteArrayOutputStream.)]
    (try 
	    (.setPassword session password)
	    (.setConfig session "StrictHostKeyChecking" "no")
	    (.connect session)
	    (let [channel (.openChannel session "exec")]
        (try 
		      (.setCommand channel command)
		      (.setOutputStream channel out)
		      (.connect channel)
		      (while (.isConnected channel)
		        (Thread/sleep 100))
		      (String. (.toByteArray out))
          (finally 
            (.disconnect channel))))
     (finally
       (.disconnect session)))))

(def umbrel (partial ssh "umbrel" "umbrel.local" 22))

(defn umbrel-cli [password cmd]
  (umbrel password (format "cd ~/umbrel/bin; docker exec bitcoin bitcoin-cli %s" cmd)))

(defn bitcoin-core-cli [password cmd]
  (let [res (sh (format "bitcoin-cli %s" cmd))]
    (if (= (:exit res) 0)
      (:out res)
      (throw (IllegalStateException.)))))
    
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

(defn apply-json [args]
  (map (fn [a] `(json/json-str ~a)) args))


(defn arity-of [password cli cmd conv-fn args]
    `(~args
       (~conv-fn 
         (~cli ~password (escape-quotation (format ~(format-str-of (inc (count args))) ~(str cmd) ~@(apply-json args)))))))

(defn defn-of [password cli cmd conv-fn args]
  `(defn 
     ~cmd
     ~@(map (partial arity-of password cli cmd conv-fn) (args-of args))))

(defmacro def-api 
  ([password cli cmd conv-fn args]
    (defn-of password cli cmd conv-fn args))
  ([password cli cmd conv-fn]
    `(def-api ~password ~cli ~cmd ~conv-fn []))
  ([password cli cmd]
    `(def-api ~password ~cli ~cmd identity))
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
  #_(def cmd-map 
     (let [cmd-names (parse-names (cli password "help"))]
       (apply merge (map (fn [c] {c (cli password (format "help %s" c))}) cmd-names))))
    
    
;   == Blockchain ==   
  (def-api password cli getbestblockhash .trim)
  (def-api password cli getblock json/read-str [blockhash [verbosity]])
  (def-api password cli getblockchaininfo json/read-str)
  (def-api password cli getblockcount json/read-str)
  (def-api password cli getblockfilter identity [blockhash [verbosity]])
  (def-api password cli getblockhash .trim [index])
  (def-api password cli getblockheader json/read-str [blockhash [verbosity]])
  (def-api password cli getblockstats identity [hash_or_height [stats]])
  (def-api password cli getchaintips json/read-str)
  (def-api password cli getchaintxstats json/read-str [[nblocks blockhash]])
  (def-api password cli getdifficulty json/read-str)
  (def-api password cli getmempoolancestors identity [txid [verbose]])
  (def-api password cli getmempooldescendants identity [txid [verbose]])
  (def-api password cli getmempoolentry identity [txid])
  (def-api password cli getmempoolinfo json/read-str)
  (def-api password cli getrawmempool json/read-str [[verbose mempool_sequence]])
  (def-api password cli gettxout identity [txid n [include_mempool]])
  (def-api password cli gettxoutproof identity [txids [blockhash]]);["txid",...] ( "blockhash" )
  (def-api password cli gettxoutsetinfo json/read-str [[hash_type hash_or_height use_index]])
  (def-api password cli preciousblock identity [blockhash])
  (def-api password cli pruneblockchain identity [height])
  (def-api password cli savemempool)
  (def-api password cli scantxoutset identity [action [scanobjects]])
  (def-api password cli verifychain identity [checklevel nblocks])
  (def-api password cli verifytxoutproof identity [proof])
  
;  == Control == 
  (def-api password cli getmemoryinfo json/read-str [[mode]])
  (def-api password cli getrpcinfo json/read-str)
  (def-api password cli help identity [[command]])
  (def-api password cli logging json/read-str [[include_category exclude_category]])
  (def-api password cli stop)
  (def-api password cli uptime json/read-str)
  
;  == Generating ==
  (def-api password cli generateblock identity [output rawtx-txid])
  (def-api password cli generatetoaddress identity [nblocks address [maxtries]])
  (def-api password cli generatetodescriptor identity [num_blocks descriptor [maxtries]])

;  == Mining ==
  (def-api password cli getblocktemplate identity [[template_request]])
  (def-api password cli getmininginfo json/read-str) 
  (def-api password cli getnetworkhashps json/read-str [[nblocks height]])
  (def-api password cli prioritisetransaction identity [txid dummy fee_delta])
  (def-api password cli submitblock identity [hexdata [dummy]])
  (def-api password cli submitheader identity [hexdata])

;  == Network ==
  (def-api password cli addnode identity [node command])
  (def-api password cli clearbanned identity) 
  (def-api password cli disconnectnode identity [[address nodeid]])
  (def-api password cli getaddednodeinfo json/read-str [[node]])
  (def-api password cli getconnectioncount json/read-str) 
  (def-api password cli getnettotals json/read-str) 
  (def-api password cli getnetworkinfo json/read-str) 
  (def-api password cli getnodeaddresses json/read-str [[count network]])
  (def-api password cli getpeerinfo json/read-str) 
  (def-api password cli listbanned json/read-str) 
  (def-api password cli ping identity) 
  (def-api password cli setban identity [subnet command [bantime absolute]])
  (def-api password cli setnetworkactive identity [state])

;  == Rawtransactions ==
  (def-api password cli analyzepsbt identity [psbt])
  (def-api password cli combinepsbt identity [psbts])
  (def-api password cli combinerawtransaction identity [hexstrings])
  (def-api password cli converttopsbt identity [hexstring [permitsigdata iswitness]])
  (def-api password cli createpsbt identity) ;[{txid:hex,vout:n,sequence:n},...] [{address:amount,...},{data:hex},...] ( locktime replaceable )
  (def-api password cli createrawtransaction identity); [{txid:hex,vout:n,sequence:n},...] [{address:amount,...},{data:hex},...] ( locktime replaceable )
  (def-api password cli decodepsbt identity [psbt])
  (def-api password cli decoderawtransaction json/read-str [hexstring [iswitness]])
  (def-api password cli decodescript identity [hexstring])
  (def-api password cli finalizepsbt identity [psbt [extract]])
  (def-api password cli fundrawtransaction identity [hexstring [options iswitness]])
  (def-api password cli getrawtransaction identity [txid [verbose blockhash]])
  (def-api password cli joinpsbts identity [psbts])
  (def-api password cli sendrawtransaction identity [hexstring [maxfeerate]])
  (def-api password cli signrawtransactionwithkey identity [hexstring privatekeys]) ;[( [{txid:hex,vout:n,scriptPubKey:hex,redeemScript:hex,witnessScript:hex,amount:amount},...] sighashtype )
  (def-api password cli testmempoolaccept identity [rawtxs [maxfeerate]])
  (def-api password cli utxoupdatepsbt identity [psbt]) ; ( [,{desc:str,range:n or [n,n]},...] )

;  == Signer ==
  (def-api password cli enumeratesigners identity) 

;  == Util ==
  (def-api password cli createmultisig json/read-str [nrequired keys [address_type]])
  (def-api password cli deriveaddresses identity [descriptor [range]])
  (def-api password cli estimatesmartfee identity [conf_target [estimate_mode]])
  (def-api password cli getdescriptorinfo identity [descriptor])
  (def-api password cli getindexinfo identity [[index_name]])
  (def-api password cli signmessagewithprivkey identity [privkey message])
  (def-api password cli validateaddress identity [address])
  (def-api password cli verifymessage identity [address signature message])

;  == Wallet ==
  (def-api password cli abandontransaction identity [txid])
  (def-api password cli abortrescan identity) 
  (def-api password cli addmultisigaddress identity [nrequired keys [label address_type]])
  (def-api password cli backupwallet identity [destination])
  (def-api password cli bumpfee identity [txid [options]])
  (def-api password cli createwallet json/read-str [wallet_name [disable_private_keys blank passphrase avoid_reuse descriptors load_on_startup external_signe]])
  (def-api password cli dumpprivkey identity [address])
  (def-api password cli dumpwallet identity [filename])
  (def-api password cli encryptwallet identity [passphrase])
  (def-api password cli getaddressesbylabel identity [label])
  (def-api password cli getaddressinfo identity [address])
  (def-api password cli getbalance identity [[dummy minconf include_watchonly avoid_reuse]])
  (def-api password cli getbalances identity) 
  (def-api password cli getnewaddress .trim [[label address_type]])
  (def-api password cli getrawchangeaddress identity [[address_type]])
  (def-api password cli getreceivedbyaddress identity [address [minconf]])
  (def-api password cli getreceivedbylabel identity [label [minconf]])
  (def-api password cli gettransaction identity [txid [include_watchonly verbose]])
  (def-api password cli getunconfirmedbalance identity) 
  (def-api password cli getwalletinfo identity) 
  (def-api password cli importaddress identity [address [label rescan p2sh]])
  (def-api password cli importdescriptors identity [requests])
  (def-api password cli importmulti identity [requests [options]])
  (def-api password cli importprivkey identity [privkey [label rescan]])
  (def-api password cli importprunedfunds identity [rawtransaction txoutproof])
  (def-api password cli importpubkey identity [pubkey [label rescan]])
  (def-api password cli importwallet identity [filename])
  (def-api password cli keypoolrefill identity [[newsize]])
  (def-api password cli listaddressgroupings identity) 
  (def-api password cli listdescriptors identity) 
  (def-api password cli listlabels identity [[purpose]])
  (def-api password cli listlockunspent identity) 
  (def-api password cli listreceivedbyaddress identity [[minconf include_empty include_watchonly address_filter]])
  (def-api password cli listreceivedbylabel identity [[minconf include_empty include_watchonly]])
  (def-api password cli listsinceblock identity [[blockhash target_confirmations include_watchonly include_removed]])
  (def-api password cli listtransactions identity [[label count skip include_watchonly]])
  (def-api password cli listunspent identity [[minconf maxconf addresses include_unsafe query_options]])
  (def-api password cli listwalletdir json/read-str) 
  (def-api password cli listwallets json/read-str) 
  (def-api password cli loadwallet identity [filename [load_on_startup]])
  (def-api password cli lockunspent identity [unlock]) ;( [{txid:hex,vout:n},...] )
  (def-api password cli psbtbumpfee identity [txid [ options]])
  (def-api password cli removeprunedfunds identity [txid])
  (def-api password cli rescanblockchain identity [[start_height stop_height]])
  (def-api password cli _send identity)  ;[{address:amount,...},{data:hex},...] ( conf_target estimate_mode fee_rate options )
  (def-api password cli sendmany identity) ;  {address:amount,...} ( minconf comment [address,...] replaceable conf_target estimate_mode fee_rate verbose )
  (def-api password cli sendtoaddress identity [address amount [comment comment_to subtractfeefromamount replaceable conf_target estimate_mode avoid_reuse fee_rate verbose]])
  (def-api password cli sethdseed identity [[newkeypool seed]])
  (def-api password cli setlabel identity [address label])
  (def-api password cli settxfee identity [amount])
  (def-api password cli setwalletflag identity [flag [value]])
  (def-api password cli signmessage identity [address message])
  (def-api password cli signrawtransactionwithwallet identity [hexstring]) ;( [{txid:hex,vout:n,scriptPubKey:hex,redeemScript:hex,witnessScript:hex,amount:amount},...] sighashtype )
  (def-api password cli unloadwallet identity [[wallet_name load_on_startup]])
  (def-api password cli upgradewallet identity [[version]])
  (def-api password cli walletcreatefundedpsbt identity)  ;( [{txid:hex,vout:n,sequence:n},...] ) [{address:amount,...},{data:hex},...] ( locktime options bip32derivs )
  (def-api password cli walletdisplayaddress identity [bitcoin address to display])
  (def-api password cli walletlock identity) 
  (def-api password cli walletpassphrase identity [passphrase timeout])
  (def-api password cli walletpassphrasechange identity [oldpassphrase newpassphrase])
  (def-api password cli walletprocesspsbt identity [psbt [sign sighashtype bip32derivs]])

;  == Zmq ==
  (def-api password cli getzmqnotifications json/read-str)
))


(comment
  (defn tx-of [block] (block "tx"))
  (pprint (decoderawtransaction (getrawtransaction (first ((getblock (getblockhash 1)) "tx")))))
  (addmultisigaddress 2 [(getnewaddress) (getnewaddress) (getnewaddress)])
  )
