package btccli;
import clojure.lang.IFn;
import static clojure.java.api.Clojure.var;
/**
  * Bitcoin core API on Umbrel via SSH. 
  */
public class BtcCli extends AbstractBtcCli {
   private final IFn decodepsbt;
   private final IFn stop;
   private final IFn logging;
   private final IFn listreceivedbylabel;
   private final IFn signmessagewithprivkey;
   private final IFn scantxoutset;
   private final IFn gettxoutproof;
   private final IFn getdescriptorinfo;
   private final IFn loadwallet;
   private final IFn getblockcount;
   private final IFn getmemoryinfo;
   private final IFn sendmany;
   private final IFn getunconfirmedbalance;
   private final IFn listreceivedbyaddress;
   private final IFn signrawtransactionwithkey;
   private final IFn settxfee;
   private final IFn listbanned;
   private final IFn createpsbt;
   private final IFn abandontransaction;
   private final IFn listaddressgroupings;
   private final IFn listlockunspent;
   private final IFn bumpfee;
   private final IFn dumpwallet;
   private final IFn getbalances;
   private final IFn generatetoaddress;
   private final IFn getindexinfo;
   private final IFn getrawtransaction;
   private final IFn removeprunedfunds;
   private final IFn getmempoolentry;
   private final IFn walletcreatefundedpsbt;
   private final IFn joinpsbts;
   private final IFn importwallet;
   private final IFn listwallets;
   private final IFn send;
   private final IFn getaddednodeinfo;
   private final IFn getblockhash;
   private final IFn verifytxoutproof;
   private final IFn generateblock;
   private final IFn getbestblockhash;
   private final IFn psbtbumpfee;
   private final IFn walletpassphrasechange;
   private final IFn ping;
   private final IFn createmultisig;
   private final IFn getreceivedbylabel;
   private final IFn fundrawtransaction;
   private final IFn getchaintxstats;
   private final IFn estimatesmartfee;
   private final IFn getmininginfo;
   private final IFn sethdseed;
   private final IFn encryptwallet;
   private final IFn getzmqnotifications;
   private final IFn uptime;
   private final IFn backupwallet;
   private final IFn enumeratesigners;
   private final IFn getbalance;
   private final IFn listtransactions;
   private final IFn addnode;
   private final IFn verifychain;
   private final IFn lockunspent;
   private final IFn analyzepsbt;
   private final IFn disconnectnode;
   private final IFn listlabels;
   private final IFn listunspent;
   private final IFn prioritisetransaction;
   private final IFn unloadwallet;
   private final IFn decoderawtransaction;
   private final IFn importmulti;
   private final IFn getnetworkhashps;
   private final IFn generatetodescriptor;
   private final IFn importdescriptors;
   private final IFn gettxoutsetinfo;
   private final IFn getwalletinfo;
   private final IFn walletpassphrase;
   private final IFn verifymessage;
   private final IFn upgradewallet;
   private final IFn createrawtransaction;
   private final IFn decodescript;
   private final IFn getaddressesbylabel;
   private final IFn getblockchaininfo;
   private final IFn getchaintips;
   private final IFn testmempoolaccept;
   private final IFn combinerawtransaction;
   private final IFn setban;
   private final IFn addmultisigaddress;
   private final IFn signmessage;
   private final IFn getrpcinfo;
   private final IFn getrawmempool;
   private final IFn setnetworkactive;
   private final IFn validateaddress;
   private final IFn sendrawtransaction;
   private final IFn preciousblock;
   private final IFn keypoolrefill;
   private final IFn getreceivedbyaddress;
   private final IFn dumpprivkey;
   private final IFn sendtoaddress;
   private final IFn getrawchangeaddress;
   private final IFn converttopsbt;
   private final IFn getaddressinfo;
   private final IFn getnetworkinfo;
   private final IFn importprivkey;
   private final IFn clearbanned;
   private final IFn listsinceblock;
   private final IFn pruneblockchain;
   private final IFn finalizepsbt;
   private final IFn submitblock;
   private final IFn signrawtransactionwithwallet;
   private final IFn help;
   private final IFn setwalletflag;
   private final IFn getmempoolancestors;
   private final IFn getblockstats;
   private final IFn getnewaddress;
   private final IFn submitheader;
   private final IFn getblockfilter;
   private final IFn setlabel;
   private final IFn getblockheader;
   private final IFn walletdisplayaddress;
   private final IFn getnodeaddresses;
   private final IFn walletlock;
   private final IFn savemempool;
   private final IFn getconnectioncount;
   private final IFn importpubkey;
   private final IFn rescanblockchain;
   private final IFn getnettotals;
   private final IFn getpeerinfo;
   private final IFn abortrescan;
   private final IFn getmempooldescendants;
   private final IFn walletprocesspsbt;
   private final IFn getmempoolinfo;
   private final IFn createwallet;
   private final IFn utxoupdatepsbt;
   private final IFn deriveaddresses;
   private final IFn getblocktemplate;
   private final IFn getdifficulty;
   private final IFn combinepsbt;
   private final IFn getblock;
   private final IFn importprunedfunds;
   private final IFn listwalletdir;
   private final IFn listdescriptors;
   private final IFn gettransaction;
   private final IFn gettxout;
   private final IFn importaddress;
   public static final BtcCli createUmbrel(final String password) {
      return new BtcCli(createUmbrelSession(password)); 
   } 
   public BtcCli(final IFn sessionFn) {
      super(sessionFn);
      decodepsbt = createFn("decodepsbt");
      stop = createFn("stop");
      logging = createFn("logging");
      listreceivedbylabel = createFn("listreceivedbylabel");
      signmessagewithprivkey = createFn("signmessagewithprivkey");
      scantxoutset = createFn("scantxoutset");
      gettxoutproof = createFn("gettxoutproof");
      getdescriptorinfo = createFn("getdescriptorinfo");
      loadwallet = createFn("loadwallet");
      getblockcount = createFn("getblockcount");
      getmemoryinfo = createFn("getmemoryinfo");
      sendmany = createFn("sendmany");
      getunconfirmedbalance = createFn("getunconfirmedbalance");
      listreceivedbyaddress = createFn("listreceivedbyaddress");
      signrawtransactionwithkey = createFn("signrawtransactionwithkey");
      settxfee = createFn("settxfee");
      listbanned = createFn("listbanned");
      createpsbt = createFn("createpsbt");
      abandontransaction = createFn("abandontransaction");
      listaddressgroupings = createFn("listaddressgroupings");
      listlockunspent = createFn("listlockunspent");
      bumpfee = createFn("bumpfee");
      dumpwallet = createFn("dumpwallet");
      getbalances = createFn("getbalances");
      generatetoaddress = createFn("generatetoaddress");
      getindexinfo = createFn("getindexinfo");
      getrawtransaction = createFn("getrawtransaction");
      removeprunedfunds = createFn("removeprunedfunds");
      getmempoolentry = createFn("getmempoolentry");
      walletcreatefundedpsbt = createFn("walletcreatefundedpsbt");
      joinpsbts = createFn("joinpsbts");
      importwallet = createFn("importwallet");
      listwallets = createFn("listwallets");
      send = createFn("send");
      getaddednodeinfo = createFn("getaddednodeinfo");
      getblockhash = createFn("getblockhash");
      verifytxoutproof = createFn("verifytxoutproof");
      generateblock = createFn("generateblock");
      getbestblockhash = createFn("getbestblockhash");
      psbtbumpfee = createFn("psbtbumpfee");
      walletpassphrasechange = createFn("walletpassphrasechange");
      ping = createFn("ping");
      createmultisig = createFn("createmultisig");
      getreceivedbylabel = createFn("getreceivedbylabel");
      fundrawtransaction = createFn("fundrawtransaction");
      getchaintxstats = createFn("getchaintxstats");
      estimatesmartfee = createFn("estimatesmartfee");
      getmininginfo = createFn("getmininginfo");
      sethdseed = createFn("sethdseed");
      encryptwallet = createFn("encryptwallet");
      getzmqnotifications = createFn("getzmqnotifications");
      uptime = createFn("uptime");
      backupwallet = createFn("backupwallet");
      enumeratesigners = createFn("enumeratesigners");
      getbalance = createFn("getbalance");
      listtransactions = createFn("listtransactions");
      addnode = createFn("addnode");
      verifychain = createFn("verifychain");
      lockunspent = createFn("lockunspent");
      analyzepsbt = createFn("analyzepsbt");
      disconnectnode = createFn("disconnectnode");
      listlabels = createFn("listlabels");
      listunspent = createFn("listunspent");
      prioritisetransaction = createFn("prioritisetransaction");
      unloadwallet = createFn("unloadwallet");
      decoderawtransaction = createFn("decoderawtransaction");
      importmulti = createFn("importmulti");
      getnetworkhashps = createFn("getnetworkhashps");
      generatetodescriptor = createFn("generatetodescriptor");
      importdescriptors = createFn("importdescriptors");
      gettxoutsetinfo = createFn("gettxoutsetinfo");
      getwalletinfo = createFn("getwalletinfo");
      walletpassphrase = createFn("walletpassphrase");
      verifymessage = createFn("verifymessage");
      upgradewallet = createFn("upgradewallet");
      createrawtransaction = createFn("createrawtransaction");
      decodescript = createFn("decodescript");
      getaddressesbylabel = createFn("getaddressesbylabel");
      getblockchaininfo = createFn("getblockchaininfo");
      getchaintips = createFn("getchaintips");
      testmempoolaccept = createFn("testmempoolaccept");
      combinerawtransaction = createFn("combinerawtransaction");
      setban = createFn("setban");
      addmultisigaddress = createFn("addmultisigaddress");
      signmessage = createFn("signmessage");
      getrpcinfo = createFn("getrpcinfo");
      getrawmempool = createFn("getrawmempool");
      setnetworkactive = createFn("setnetworkactive");
      validateaddress = createFn("validateaddress");
      sendrawtransaction = createFn("sendrawtransaction");
      preciousblock = createFn("preciousblock");
      keypoolrefill = createFn("keypoolrefill");
      getreceivedbyaddress = createFn("getreceivedbyaddress");
      dumpprivkey = createFn("dumpprivkey");
      sendtoaddress = createFn("sendtoaddress");
      getrawchangeaddress = createFn("getrawchangeaddress");
      converttopsbt = createFn("converttopsbt");
      getaddressinfo = createFn("getaddressinfo");
      getnetworkinfo = createFn("getnetworkinfo");
      importprivkey = createFn("importprivkey");
      clearbanned = createFn("clearbanned");
      listsinceblock = createFn("listsinceblock");
      pruneblockchain = createFn("pruneblockchain");
      finalizepsbt = createFn("finalizepsbt");
      submitblock = createFn("submitblock");
      signrawtransactionwithwallet = createFn("signrawtransactionwithwallet");
      help = createFn("help");
      setwalletflag = createFn("setwalletflag");
      getmempoolancestors = createFn("getmempoolancestors");
      getblockstats = createFn("getblockstats");
      getnewaddress = createFn("getnewaddress");
      submitheader = createFn("submitheader");
      getblockfilter = createFn("getblockfilter");
      setlabel = createFn("setlabel");
      getblockheader = createFn("getblockheader");
      walletdisplayaddress = createFn("walletdisplayaddress");
      getnodeaddresses = createFn("getnodeaddresses");
      walletlock = createFn("walletlock");
      savemempool = createFn("savemempool");
      getconnectioncount = createFn("getconnectioncount");
      importpubkey = createFn("importpubkey");
      rescanblockchain = createFn("rescanblockchain");
      getnettotals = createFn("getnettotals");
      getpeerinfo = createFn("getpeerinfo");
      abortrescan = createFn("abortrescan");
      getmempooldescendants = createFn("getmempooldescendants");
      walletprocesspsbt = createFn("walletprocesspsbt");
      getmempoolinfo = createFn("getmempoolinfo");
      createwallet = createFn("createwallet");
      utxoupdatepsbt = createFn("utxoupdatepsbt");
      deriveaddresses = createFn("deriveaddresses");
      getblocktemplate = createFn("getblocktemplate");
      getdifficulty = createFn("getdifficulty");
      combinepsbt = createFn("combinepsbt");
      getblock = createFn("getblock");
      importprunedfunds = createFn("importprunedfunds");
      listwalletdir = createFn("listwalletdir");
      listdescriptors = createFn("listdescriptors");
      gettransaction = createFn("gettransaction");
      gettxout = createFn("gettxout");
      importaddress = createFn("importaddress");
   }
   /**
    * decodepsbt "psbt"
    * 
    * Return a JSON object representing the serialized, base64-encoded partially signed Bitcoin transaction.
    * 
    * Arguments:
    * 1. psbt    (string, required) The PSBT base64 string
    * 
    * Result:
    * {                                          (json object)
    *   "tx" : {                                 (json object) The decoded network-serialized unsigned transaction.
    *     ...                                    The layout is the same as the output of decoderawtransaction.
    *   },
    *   "unknown" : {                            (json object) The unknown global fields
    *     "key" : "hex",                         (string) (key-value pair) An unknown key-value pair
    *     ...
    *   },
    *   "inputs" : [                             (json array)
    *     {                                      (json object)
    *       "non_witness_utxo" : {               (json object, optional) Decoded network transaction for non-witness UTXOs
    *         ...
    *       },
    *       "witness_utxo" : {                   (json object, optional) Transaction output for witness UTXOs
    *         "amount" : n,                      (numeric) The value in BTC
    *         "scriptPubKey" : {                 (json object)
    *           "asm" : "str",                   (string) The asm
    *           "hex" : "hex",                   (string) The hex
    *           "type" : "str",                  (string) The type, eg 'pubkeyhash'
    *           "address" : "str"                (string)  Bitcoin address if there is one
    *         }
    *       },
    *       "partial_signatures" : {             (json object, optional)
    *         "pubkey" : "str",                  (string) The public key and signature that corresponds to it.
    *         ...
    *       },
    *       "sighash" : "str",                   (string, optional) The sighash type to be used
    *       "redeem_script" : {                  (json object, optional)
    *         "asm" : "str",                     (string) The asm
    *         "hex" : "hex",                     (string) The hex
    *         "type" : "str"                     (string) The type, eg 'pubkeyhash'
    *       },
    *       "witness_script" : {                 (json object, optional)
    *         "asm" : "str",                     (string) The asm
    *         "hex" : "hex",                     (string) The hex
    *         "type" : "str"                     (string) The type, eg 'pubkeyhash'
    *       },
    *       "bip32_derivs" : [                   (json array, optional)
    *         {                                  (json object, optional) The public key with the derivation path as the value.
    *           "master_fingerprint" : "str",    (string) The fingerprint of the master key
    *           "path" : "str"                   (string) The path
    *         },
    *         ...
    *       ],
    *       "final_scriptsig" : {                (json object, optional)
    *         "asm" : "str",                     (string) The asm
    *         "hex" : "str"                      (string) The hex
    *       },
    *       "final_scriptwitness" : [            (json array)
    *         "hex",                             (string) hex-encoded witness data (if any)
    *         ...
    *       ],
    *       "unknown" : {                        (json object) The unknown global fields
    *         "key" : "hex",                     (string) (key-value pair) An unknown key-value pair
    *         ...
    *       }
    *     },
    *     ...
    *   ],
    *   "outputs" : [                            (json array)
    *     {                                      (json object)
    *       "redeem_script" : {                  (json object, optional)
    *         "asm" : "str",                     (string) The asm
    *         "hex" : "hex",                     (string) The hex
    *         "type" : "str"                     (string) The type, eg 'pubkeyhash'
    *       },
    *       "witness_script" : {                 (json object, optional)
    *         "asm" : "str",                     (string) The asm
    *         "hex" : "hex",                     (string) The hex
    *         "type" : "str"                     (string) The type, eg 'pubkeyhash'
    *       },
    *       "bip32_derivs" : [                   (json array, optional)
    *         {                                  (json object)
    *           "pubkey" : "str",                (string) The public key this path corresponds to
    *           "master_fingerprint" : "str",    (string) The fingerprint of the master key
    *           "path" : "str"                   (string) The path
    *         },
    *         ...
    *       ],
    *       "unknown" : {                        (json object) The unknown global fields
    *         "key" : "hex",                     (string) (key-value pair) An unknown key-value pair
    *         ...
    *       }
    *     },
    *     ...
    *   ],
    *   "fee" : n                                (numeric, optional) The transaction fee paid if all UTXOs slots in the PSBT have been filled.
    * }
    * 
    * Examples:
    * > bitcoin-cli decodepsbt "psbt"
    */
   public Object decodepsbt(Object psbt) { return decodepsbt.invoke(psbt); }

   /**
    * stop
    * 
    * Request a graceful shutdown of Bitcoin Core.
    * Result:
    * "str"    (string) A string with the content 'Bitcoin Core stopping'
    */
   public Object stop() { return stop.invoke(); }

   /**
    * logging ( ["include_category",...] ["exclude_category",...] )
    * Gets and sets the logging configuration.
    * When called without an argument, returns the list of categories with status that are currently being debug logged or not.
    * When called with arguments, adds or removes categories from debug logging and return the lists above.
    * The arguments are evaluated in order "include", "exclude".
    * If an item is both included and excluded, it will thus end up being excluded.
    * The valid logging categories are: net, tor, mempool, http, bench, zmq, walletdb, rpc, estimatefee, addrman, selectcoins, reindex, cmpctblock, rand, prune, proxy, mempoolrej, libevent, coindb, qt, leveldb, validation, i2p, ipc
    * In addition, the following are available as category names with special meanings:
    *   - "all",  "1" : represent all logging categories.
    *   - "none", "0" : even if other logging categories are specified, ignore all of them.
    * 
    * Arguments:
    * 1. include                    (json array, optional) The categories to add to debug logging
    *      [
    *        "include_category",    (string) the valid logging category
    *        ...
    *      ]
    * 2. exclude                    (json array, optional) The categories to remove from debug logging
    *      [
    *        "exclude_category",    (string) the valid logging category
    *        ...
    *      ]
    * 
    * Result:
    * {                             (json object) keys are the logging categories, and values indicates its status
    *   "category" : true|false,    (boolean) if being debug logged or not. false:inactive, true:active
    *   ...
    * }
    * 
    * Examples:
    * > bitcoin-cli logging "[\"all\"]" "[\"http\"]"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "logging", "params": [["all"], ["libevent"]]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object logging() { return logging.invoke(); }


   /**
    * logging ( ["include_category",...] ["exclude_category",...] )
    * Gets and sets the logging configuration.
    * When called without an argument, returns the list of categories with status that are currently being debug logged or not.
    * When called with arguments, adds or removes categories from debug logging and return the lists above.
    * The arguments are evaluated in order "include", "exclude".
    * If an item is both included and excluded, it will thus end up being excluded.
    * The valid logging categories are: net, tor, mempool, http, bench, zmq, walletdb, rpc, estimatefee, addrman, selectcoins, reindex, cmpctblock, rand, prune, proxy, mempoolrej, libevent, coindb, qt, leveldb, validation, i2p, ipc
    * In addition, the following are available as category names with special meanings:
    *   - "all",  "1" : represent all logging categories.
    *   - "none", "0" : even if other logging categories are specified, ignore all of them.
    * 
    * Arguments:
    * 1. include                    (json array, optional) The categories to add to debug logging
    *      [
    *        "include_category",    (string) the valid logging category
    *        ...
    *      ]
    * 2. exclude                    (json array, optional) The categories to remove from debug logging
    *      [
    *        "exclude_category",    (string) the valid logging category
    *        ...
    *      ]
    * 
    * Result:
    * {                             (json object) keys are the logging categories, and values indicates its status
    *   "category" : true|false,    (boolean) if being debug logged or not. false:inactive, true:active
    *   ...
    * }
    * 
    * Examples:
    * > bitcoin-cli logging "[\"all\"]" "[\"http\"]"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "logging", "params": [["all"], ["libevent"]]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object logging(Object include_category) { return logging.invoke(include_category); }


   /**
    * logging ( ["include_category",...] ["exclude_category",...] )
    * Gets and sets the logging configuration.
    * When called without an argument, returns the list of categories with status that are currently being debug logged or not.
    * When called with arguments, adds or removes categories from debug logging and return the lists above.
    * The arguments are evaluated in order "include", "exclude".
    * If an item is both included and excluded, it will thus end up being excluded.
    * The valid logging categories are: net, tor, mempool, http, bench, zmq, walletdb, rpc, estimatefee, addrman, selectcoins, reindex, cmpctblock, rand, prune, proxy, mempoolrej, libevent, coindb, qt, leveldb, validation, i2p, ipc
    * In addition, the following are available as category names with special meanings:
    *   - "all",  "1" : represent all logging categories.
    *   - "none", "0" : even if other logging categories are specified, ignore all of them.
    * 
    * Arguments:
    * 1. include                    (json array, optional) The categories to add to debug logging
    *      [
    *        "include_category",    (string) the valid logging category
    *        ...
    *      ]
    * 2. exclude                    (json array, optional) The categories to remove from debug logging
    *      [
    *        "exclude_category",    (string) the valid logging category
    *        ...
    *      ]
    * 
    * Result:
    * {                             (json object) keys are the logging categories, and values indicates its status
    *   "category" : true|false,    (boolean) if being debug logged or not. false:inactive, true:active
    *   ...
    * }
    * 
    * Examples:
    * > bitcoin-cli logging "[\"all\"]" "[\"http\"]"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "logging", "params": [["all"], ["libevent"]]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object logging(Object include_category, Object exclude_category) { return logging.invoke(include_category, exclude_category); }

   /**
    * listreceivedbylabel ( minconf include_empty include_watchonly )
    * 
    * List received transactions by label.
    * 
    * Arguments:
    * 1. minconf              (numeric, optional, default=1) The minimum number of confirmations before payments are included.
    * 2. include_empty        (boolean, optional, default=false) Whether to include labels that haven't received any payments.
    * 3. include_watchonly    (boolean, optional, default=true for watch-only wallets, otherwise false) Whether to include watch-only addresses (see 'importaddress')
    * 
    * Result:
    * [                                        (json array)
    *   {                                      (json object)
    *     "involvesWatchonly" : true|false,    (boolean) Only returns true if imported addresses were involved in transaction
    *     "amount" : n,                        (numeric) The total amount received by addresses with this label
    *     "confirmations" : n,                 (numeric) The number of confirmations of the most recent transaction included
    *     "label" : "str"                      (string) The label of the receiving address. The default label is ""
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * > bitcoin-cli listreceivedbylabel 
    * > bitcoin-cli listreceivedbylabel 6 true
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listreceivedbylabel", "params": [6, true, true]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object listreceivedbylabel() { return listreceivedbylabel.invoke(); }


   /**
    * listreceivedbylabel ( minconf include_empty include_watchonly )
    * 
    * List received transactions by label.
    * 
    * Arguments:
    * 1. minconf              (numeric, optional, default=1) The minimum number of confirmations before payments are included.
    * 2. include_empty        (boolean, optional, default=false) Whether to include labels that haven't received any payments.
    * 3. include_watchonly    (boolean, optional, default=true for watch-only wallets, otherwise false) Whether to include watch-only addresses (see 'importaddress')
    * 
    * Result:
    * [                                        (json array)
    *   {                                      (json object)
    *     "involvesWatchonly" : true|false,    (boolean) Only returns true if imported addresses were involved in transaction
    *     "amount" : n,                        (numeric) The total amount received by addresses with this label
    *     "confirmations" : n,                 (numeric) The number of confirmations of the most recent transaction included
    *     "label" : "str"                      (string) The label of the receiving address. The default label is ""
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * > bitcoin-cli listreceivedbylabel 
    * > bitcoin-cli listreceivedbylabel 6 true
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listreceivedbylabel", "params": [6, true, true]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object listreceivedbylabel(Object minconf) { return listreceivedbylabel.invoke(minconf); }


   /**
    * listreceivedbylabel ( minconf include_empty include_watchonly )
    * 
    * List received transactions by label.
    * 
    * Arguments:
    * 1. minconf              (numeric, optional, default=1) The minimum number of confirmations before payments are included.
    * 2. include_empty        (boolean, optional, default=false) Whether to include labels that haven't received any payments.
    * 3. include_watchonly    (boolean, optional, default=true for watch-only wallets, otherwise false) Whether to include watch-only addresses (see 'importaddress')
    * 
    * Result:
    * [                                        (json array)
    *   {                                      (json object)
    *     "involvesWatchonly" : true|false,    (boolean) Only returns true if imported addresses were involved in transaction
    *     "amount" : n,                        (numeric) The total amount received by addresses with this label
    *     "confirmations" : n,                 (numeric) The number of confirmations of the most recent transaction included
    *     "label" : "str"                      (string) The label of the receiving address. The default label is ""
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * > bitcoin-cli listreceivedbylabel 
    * > bitcoin-cli listreceivedbylabel 6 true
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listreceivedbylabel", "params": [6, true, true]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object listreceivedbylabel(Object minconf, Object include_empty) { return listreceivedbylabel.invoke(minconf, include_empty); }


   /**
    * listreceivedbylabel ( minconf include_empty include_watchonly )
    * 
    * List received transactions by label.
    * 
    * Arguments:
    * 1. minconf              (numeric, optional, default=1) The minimum number of confirmations before payments are included.
    * 2. include_empty        (boolean, optional, default=false) Whether to include labels that haven't received any payments.
    * 3. include_watchonly    (boolean, optional, default=true for watch-only wallets, otherwise false) Whether to include watch-only addresses (see 'importaddress')
    * 
    * Result:
    * [                                        (json array)
    *   {                                      (json object)
    *     "involvesWatchonly" : true|false,    (boolean) Only returns true if imported addresses were involved in transaction
    *     "amount" : n,                        (numeric) The total amount received by addresses with this label
    *     "confirmations" : n,                 (numeric) The number of confirmations of the most recent transaction included
    *     "label" : "str"                      (string) The label of the receiving address. The default label is ""
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * > bitcoin-cli listreceivedbylabel 
    * > bitcoin-cli listreceivedbylabel 6 true
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listreceivedbylabel", "params": [6, true, true]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object listreceivedbylabel(Object minconf, Object include_empty, Object include_watchonly) { return listreceivedbylabel.invoke(minconf, include_empty, include_watchonly); }

   /**
    * signmessagewithprivkey "privkey" "message"
    * 
    * Sign a message with the private key of an address
    * 
    * Arguments:
    * 1. privkey    (string, required) The private key to sign the message with.
    * 2. message    (string, required) The message to create a signature of.
    * 
    * Result:
    * "str"    (string) The signature of the message encoded in base 64
    * 
    * Examples:
    * 
    * Create the signature
    * > bitcoin-cli signmessagewithprivkey "privkey" "my message"
    * 
    * Verify the signature
    * > bitcoin-cli verifymessage "1D1ZrZNe3JUo7ZycKEYQQiQAWd9y54F4XX" "signature" "my message"
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "signmessagewithprivkey", "params": ["privkey", "my message"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object signmessagewithprivkey(Object privkey, Object message) { return signmessagewithprivkey.invoke(privkey, message); }

   /**
    * scantxoutset "action" ( [scanobjects,...] )
    * 
    * Scans the unspent transaction output set for entries that match certain output descriptors.
    * Examples of output descriptors are:
    *     addr(<address>)                      Outputs whose scriptPubKey corresponds to the specified address (does not include P2PK)
    *     raw(<hex script>)                    Outputs whose scriptPubKey equals the specified hex scripts
    *     combo(<pubkey>)                      P2PK, P2PKH, P2WPKH, and P2SH-P2WPKH outputs for the given pubkey
    *     pkh(<pubkey>)                        P2PKH outputs for the given pubkey
    *     sh(multi(<n>,<pubkey>,<pubkey>,...)) P2SH-multisig outputs for the given threshold and pubkeys
    * 
    * In the above, <pubkey> either refers to a fixed public key in hexadecimal notation, or to an xpub/xprv optionally followed by one
    * or more path elements separated by "/", and optionally ending in "/*" (unhardened), or "/*'" or "/*h" (hardened) to specify all
    * unhardened or hardened child keys.
    * In the latter case, a range needs to be specified by below if different from 1000.
    * For more information on output descriptors, see the documentation in the doc/descriptors.md file.
    * 
    * Arguments:
    * 1. action                        (string, required) The action to execute
    *                                  "start" for starting a scan
    *                                  "abort" for aborting the current scan (returns true when abort was successful)
    *                                  "status" for progress report (in %) of the current scan
    * 2. scanobjects                   (json array) Array of scan objects. Required for "start" action
    *                                  Every scan object is either a string descriptor or an object:
    *      [
    *        "descriptor",             (string) An output descriptor
    *        {                         (json object) An object with output descriptor and metadata
    *          "desc": "str",          (string, required) An output descriptor
    *          "range": n or [n,n],    (numeric or array, optional, default=1000) The range of HD chain indexes to explore (either end or [begin,end])
    *        },
    *        ...
    *      ]
    * 
    * Result (When action=='abort'):
    * true|false    (boolean)
    * 
    * Result (When action=='status' and no scan is in progress):
    * null    (json null)
    * 
    * Result (When action=='status' and scan is in progress):
    * {                    (json object)
    *   "progress" : n     (numeric) The scan progress
    * }
    * 
    * Result (When action=='start'):
    * {                                (json object)
    *   "success" : true|false,        (boolean) Whether the scan was completed
    *   "txouts" : n,                  (numeric) The number of unspent transaction outputs scanned
    *   "height" : n,                  (numeric) The current block height (index)
    *   "bestblock" : "hex",           (string) The hash of the block at the tip of the chain
    *   "unspents" : [                 (json array)
    *     {                            (json object)
    *       "txid" : "hex",            (string) The transaction id
    *       "vout" : n,                (numeric) The vout value
    *       "scriptPubKey" : "hex",    (string) The script key
    *       "desc" : "str",            (string) A specialized descriptor for the matched scriptPubKey
    *       "amount" : n,              (numeric) The total amount in BTC of the unspent output
    *       "height" : n               (numeric) Height of the unspent transaction output
    *     },
    *     ...
    *   ],
    *   "total_amount" : n             (numeric) The total amount of all found unspent outputs in BTC
    * }
    */
   public Object scantxoutset(Object action) { return scantxoutset.invoke(action); }


   /**
    * scantxoutset "action" ( [scanobjects,...] )
    * 
    * Scans the unspent transaction output set for entries that match certain output descriptors.
    * Examples of output descriptors are:
    *     addr(<address>)                      Outputs whose scriptPubKey corresponds to the specified address (does not include P2PK)
    *     raw(<hex script>)                    Outputs whose scriptPubKey equals the specified hex scripts
    *     combo(<pubkey>)                      P2PK, P2PKH, P2WPKH, and P2SH-P2WPKH outputs for the given pubkey
    *     pkh(<pubkey>)                        P2PKH outputs for the given pubkey
    *     sh(multi(<n>,<pubkey>,<pubkey>,...)) P2SH-multisig outputs for the given threshold and pubkeys
    * 
    * In the above, <pubkey> either refers to a fixed public key in hexadecimal notation, or to an xpub/xprv optionally followed by one
    * or more path elements separated by "/", and optionally ending in "/*" (unhardened), or "/*'" or "/*h" (hardened) to specify all
    * unhardened or hardened child keys.
    * In the latter case, a range needs to be specified by below if different from 1000.
    * For more information on output descriptors, see the documentation in the doc/descriptors.md file.
    * 
    * Arguments:
    * 1. action                        (string, required) The action to execute
    *                                  "start" for starting a scan
    *                                  "abort" for aborting the current scan (returns true when abort was successful)
    *                                  "status" for progress report (in %) of the current scan
    * 2. scanobjects                   (json array) Array of scan objects. Required for "start" action
    *                                  Every scan object is either a string descriptor or an object:
    *      [
    *        "descriptor",             (string) An output descriptor
    *        {                         (json object) An object with output descriptor and metadata
    *          "desc": "str",          (string, required) An output descriptor
    *          "range": n or [n,n],    (numeric or array, optional, default=1000) The range of HD chain indexes to explore (either end or [begin,end])
    *        },
    *        ...
    *      ]
    * 
    * Result (When action=='abort'):
    * true|false    (boolean)
    * 
    * Result (When action=='status' and no scan is in progress):
    * null    (json null)
    * 
    * Result (When action=='status' and scan is in progress):
    * {                    (json object)
    *   "progress" : n     (numeric) The scan progress
    * }
    * 
    * Result (When action=='start'):
    * {                                (json object)
    *   "success" : true|false,        (boolean) Whether the scan was completed
    *   "txouts" : n,                  (numeric) The number of unspent transaction outputs scanned
    *   "height" : n,                  (numeric) The current block height (index)
    *   "bestblock" : "hex",           (string) The hash of the block at the tip of the chain
    *   "unspents" : [                 (json array)
    *     {                            (json object)
    *       "txid" : "hex",            (string) The transaction id
    *       "vout" : n,                (numeric) The vout value
    *       "scriptPubKey" : "hex",    (string) The script key
    *       "desc" : "str",            (string) A specialized descriptor for the matched scriptPubKey
    *       "amount" : n,              (numeric) The total amount in BTC of the unspent output
    *       "height" : n               (numeric) Height of the unspent transaction output
    *     },
    *     ...
    *   ],
    *   "total_amount" : n             (numeric) The total amount of all found unspent outputs in BTC
    * }
    */
   public Object scantxoutset(Object action, Object scanobjects) { return scantxoutset.invoke(action, scanobjects); }

   /**
    * gettxoutproof ["txid",...] ( "blockhash" )
    * 
    * Returns a hex-encoded proof that "txid" was included in a block.
    * 
    * NOTE: By default this function only works sometimes. This is when there is an
    * unspent output in the utxo for this transaction. To make it always work,
    * you need to maintain a transaction index, using the -txindex command line option or
    * specify the block in which the transaction is included manually (by blockhash).
    * 
    * Arguments:
    * 1. txids          (json array, required) The txids to filter
    *      [
    *        "txid",    (string) A transaction hash
    *        ...
    *      ]
    * 2. blockhash      (string, optional) If specified, looks for txid in the block with this hash
    * 
    * Result:
    * "str"    (string) A string that is a serialized, hex-encoded data for the proof.
    */
   public Object gettxoutproof(Object txids) { return gettxoutproof.invoke(txids); }


   /**
    * gettxoutproof ["txid",...] ( "blockhash" )
    * 
    * Returns a hex-encoded proof that "txid" was included in a block.
    * 
    * NOTE: By default this function only works sometimes. This is when there is an
    * unspent output in the utxo for this transaction. To make it always work,
    * you need to maintain a transaction index, using the -txindex command line option or
    * specify the block in which the transaction is included manually (by blockhash).
    * 
    * Arguments:
    * 1. txids          (json array, required) The txids to filter
    *      [
    *        "txid",    (string) A transaction hash
    *        ...
    *      ]
    * 2. blockhash      (string, optional) If specified, looks for txid in the block with this hash
    * 
    * Result:
    * "str"    (string) A string that is a serialized, hex-encoded data for the proof.
    */
   public Object gettxoutproof(Object txids, Object blockhash) { return gettxoutproof.invoke(txids, blockhash); }

   /**
    * getdescriptorinfo "descriptor"
    * 
    * Analyses a descriptor.
    * 
    * Arguments:
    * 1. descriptor    (string, required) The descriptor.
    * 
    * Result:
    * {                                   (json object)
    *   "descriptor" : "str",             (string) The descriptor in canonical form, without private keys
    *   "checksum" : "str",               (string) The checksum for the input descriptor
    *   "isrange" : true|false,           (boolean) Whether the descriptor is ranged
    *   "issolvable" : true|false,        (boolean) Whether the descriptor is solvable
    *   "hasprivatekeys" : true|false     (boolean) Whether the input descriptor contained at least one private key
    * }
    * 
    * Examples:
    * Analyse a descriptor
    * > bitcoin-cli getdescriptorinfo "wpkh([d34db33f/84h/0h/0h]0279be667ef9dcbbac55a06295Ce870b07029Bfcdb2dce28d959f2815b16f81798)"
    */
   public Object getdescriptorinfo(Object descriptor) { return getdescriptorinfo.invoke(descriptor); }

   /**
    * loadwallet "filename" ( load_on_startup )
    * 
    * Loads a wallet from a wallet file or directory.
    * Note that all wallet command-line options used when starting bitcoind will be
    * applied to the new wallet (eg -rescan, etc).
    * 
    * Arguments:
    * 1. filename           (string, required) The wallet directory or .dat file.
    * 2. load_on_startup    (boolean, optional) Save wallet name to persistent settings and load on startup. True to add wallet to startup list, false to remove, null to leave unchanged.
    * 
    * Result:
    * {                       (json object)
    *   "name" : "str",       (string) The wallet name if loaded successfully.
    *   "warning" : "str"     (string) Warning message if wallet was not loaded cleanly.
    * }
    * 
    * Examples:
    * > bitcoin-cli loadwallet "test.dat"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "loadwallet", "params": ["test.dat"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object loadwallet(Object filename) { return loadwallet.invoke(filename); }


   /**
    * loadwallet "filename" ( load_on_startup )
    * 
    * Loads a wallet from a wallet file or directory.
    * Note that all wallet command-line options used when starting bitcoind will be
    * applied to the new wallet (eg -rescan, etc).
    * 
    * Arguments:
    * 1. filename           (string, required) The wallet directory or .dat file.
    * 2. load_on_startup    (boolean, optional) Save wallet name to persistent settings and load on startup. True to add wallet to startup list, false to remove, null to leave unchanged.
    * 
    * Result:
    * {                       (json object)
    *   "name" : "str",       (string) The wallet name if loaded successfully.
    *   "warning" : "str"     (string) Warning message if wallet was not loaded cleanly.
    * }
    * 
    * Examples:
    * > bitcoin-cli loadwallet "test.dat"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "loadwallet", "params": ["test.dat"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object loadwallet(Object filename, Object load_on_startup) { return loadwallet.invoke(filename, load_on_startup); }

   /**
    * getblockcount
    * 
    * Returns the height of the most-work fully-validated chain.
    * The genesis block has height 0.
    * 
    * Result:
    * n    (numeric) The current block count
    * 
    * Examples:
    * > bitcoin-cli getblockcount 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getblockcount", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getblockcount() { return getblockcount.invoke(); }

   /**
    * getmemoryinfo ( "mode" )
    * Returns an object containing information about memory usage.
    * 
    * Arguments:
    * 1. mode    (string, optional, default="stats") determines what kind of information is returned.
    *            - "stats" returns general statistics about memory usage in the daemon.
    *            - "mallocinfo" returns an XML string describing low-level heap state (only available if compiled with glibc 2.10+).
    * 
    * Result (mode "stats"):
    * {                         (json object)
    *   "locked" : {            (json object) Information about locked memory manager
    *     "used" : n,           (numeric) Number of bytes used
    *     "free" : n,           (numeric) Number of bytes available in current arenas
    *     "total" : n,          (numeric) Total number of bytes managed
    *     "locked" : n,         (numeric) Amount of bytes that succeeded locking. If this number is smaller than total, locking pages failed at some point and key data could be swapped to disk.
    *     "chunks_used" : n,    (numeric) Number allocated chunks
    *     "chunks_free" : n     (numeric) Number unused chunks
    *   }
    * }
    * 
    * Result (mode "mallocinfo"):
    * "str"    (string) "<malloc version="1">..."
    * 
    * Examples:
    * > bitcoin-cli getmemoryinfo 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getmemoryinfo", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getmemoryinfo() { return getmemoryinfo.invoke(); }


   /**
    * getmemoryinfo ( "mode" )
    * Returns an object containing information about memory usage.
    * 
    * Arguments:
    * 1. mode    (string, optional, default="stats") determines what kind of information is returned.
    *            - "stats" returns general statistics about memory usage in the daemon.
    *            - "mallocinfo" returns an XML string describing low-level heap state (only available if compiled with glibc 2.10+).
    * 
    * Result (mode "stats"):
    * {                         (json object)
    *   "locked" : {            (json object) Information about locked memory manager
    *     "used" : n,           (numeric) Number of bytes used
    *     "free" : n,           (numeric) Number of bytes available in current arenas
    *     "total" : n,          (numeric) Total number of bytes managed
    *     "locked" : n,         (numeric) Amount of bytes that succeeded locking. If this number is smaller than total, locking pages failed at some point and key data could be swapped to disk.
    *     "chunks_used" : n,    (numeric) Number allocated chunks
    *     "chunks_free" : n     (numeric) Number unused chunks
    *   }
    * }
    * 
    * Result (mode "mallocinfo"):
    * "str"    (string) "<malloc version="1">..."
    * 
    * Examples:
    * > bitcoin-cli getmemoryinfo 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getmemoryinfo", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getmemoryinfo(Object mode) { return getmemoryinfo.invoke(mode); }

   /**
    * sendmany "" {"address":amount,...} ( minconf "comment" ["address",...] replaceable conf_target "estimate_mode" fee_rate verbose )
    * 
    * Send multiple times. Amounts are double-precision floating point numbers.
    * Requires wallet passphrase to be set with walletpassphrase call if wallet is encrypted.
    * 
    * Arguments:
    * 1. dummy                     (string, required) Must be set to "" for backwards compatibility.
    * 2. amounts                   (json object, required) The addresses and amounts
    *      {
    *        "address": amount,    (numeric or string, required) The bitcoin address is the key, the numeric amount (can be string) in BTC is the value
    *        ...
    *      }
    * 3. minconf                   (numeric, optional) Ignored dummy value
    * 4. comment                   (string, optional) A comment
    * 5. subtractfeefrom           (json array, optional) The addresses.
    *                              The fee will be equally deducted from the amount of each selected address.
    *                              Those recipients will receive less bitcoins than you enter in their corresponding amount field.
    *                              If no addresses are specified here, the sender pays the fee.
    *      [
    *        "address",            (string) Subtract fee from this address
    *        ...
    *      ]
    * 6. replaceable               (boolean, optional, default=wallet default) Allow this transaction to be replaced by a transaction with higher fees via BIP 125
    * 7. conf_target               (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    * 8. estimate_mode             (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                              "unset"
    *                              "economical"
    *                              "conservative"
    * 9. fee_rate                  (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    * 10. verbose                  (boolean, optional, default=false) If true, return extra infomration about the transaction.
    * 
    * Result (if verbose is not set or set to false):
    * "hex"    (string) The transaction id for the send. Only 1 transaction is created regardless of
    *          the number of addresses.
    * 
    * Result (if verbose is set to true):
    * {                          (json object)
    *   "txid" : "hex",          (string) The transaction id for the send. Only 1 transaction is created regardless of
    *                            the number of addresses.
    *   "fee reason" : "str"     (string) The transaction fee reason.
    * }
    * 
    * Examples:
    * 
    * Send two amounts to two different addresses:
    * > bitcoin-cli sendmany "" "{\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\":0.01,\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\":0.02}"
    * 
    * Send two amounts to two different addresses setting the confirmation and comment:
    * > bitcoin-cli sendmany "" "{\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\":0.01,\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\":0.02}" 6 "testing"
    * 
    * Send two amounts to two different addresses, subtract fee from amount:
    * > bitcoin-cli sendmany "" "{\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\":0.01,\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\":0.02}" 1 "" "[\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\",\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\"]"
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "sendmany", "params": ["", {"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl":0.01,"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3":0.02}, 6, "testing"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object sendmany(Object address) { return sendmany.invoke(address); }


   /**
    * sendmany "" {"address":amount,...} ( minconf "comment" ["address",...] replaceable conf_target "estimate_mode" fee_rate verbose )
    * 
    * Send multiple times. Amounts are double-precision floating point numbers.
    * Requires wallet passphrase to be set with walletpassphrase call if wallet is encrypted.
    * 
    * Arguments:
    * 1. dummy                     (string, required) Must be set to "" for backwards compatibility.
    * 2. amounts                   (json object, required) The addresses and amounts
    *      {
    *        "address": amount,    (numeric or string, required) The bitcoin address is the key, the numeric amount (can be string) in BTC is the value
    *        ...
    *      }
    * 3. minconf                   (numeric, optional) Ignored dummy value
    * 4. comment                   (string, optional) A comment
    * 5. subtractfeefrom           (json array, optional) The addresses.
    *                              The fee will be equally deducted from the amount of each selected address.
    *                              Those recipients will receive less bitcoins than you enter in their corresponding amount field.
    *                              If no addresses are specified here, the sender pays the fee.
    *      [
    *        "address",            (string) Subtract fee from this address
    *        ...
    *      ]
    * 6. replaceable               (boolean, optional, default=wallet default) Allow this transaction to be replaced by a transaction with higher fees via BIP 125
    * 7. conf_target               (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    * 8. estimate_mode             (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                              "unset"
    *                              "economical"
    *                              "conservative"
    * 9. fee_rate                  (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    * 10. verbose                  (boolean, optional, default=false) If true, return extra infomration about the transaction.
    * 
    * Result (if verbose is not set or set to false):
    * "hex"    (string) The transaction id for the send. Only 1 transaction is created regardless of
    *          the number of addresses.
    * 
    * Result (if verbose is set to true):
    * {                          (json object)
    *   "txid" : "hex",          (string) The transaction id for the send. Only 1 transaction is created regardless of
    *                            the number of addresses.
    *   "fee reason" : "str"     (string) The transaction fee reason.
    * }
    * 
    * Examples:
    * 
    * Send two amounts to two different addresses:
    * > bitcoin-cli sendmany "" "{\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\":0.01,\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\":0.02}"
    * 
    * Send two amounts to two different addresses setting the confirmation and comment:
    * > bitcoin-cli sendmany "" "{\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\":0.01,\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\":0.02}" 6 "testing"
    * 
    * Send two amounts to two different addresses, subtract fee from amount:
    * > bitcoin-cli sendmany "" "{\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\":0.01,\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\":0.02}" 1 "" "[\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\",\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\"]"
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "sendmany", "params": ["", {"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl":0.01,"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3":0.02}, 6, "testing"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object sendmany(Object address, Object minconf) { return sendmany.invoke(address, minconf); }


   /**
    * sendmany "" {"address":amount,...} ( minconf "comment" ["address",...] replaceable conf_target "estimate_mode" fee_rate verbose )
    * 
    * Send multiple times. Amounts are double-precision floating point numbers.
    * Requires wallet passphrase to be set with walletpassphrase call if wallet is encrypted.
    * 
    * Arguments:
    * 1. dummy                     (string, required) Must be set to "" for backwards compatibility.
    * 2. amounts                   (json object, required) The addresses and amounts
    *      {
    *        "address": amount,    (numeric or string, required) The bitcoin address is the key, the numeric amount (can be string) in BTC is the value
    *        ...
    *      }
    * 3. minconf                   (numeric, optional) Ignored dummy value
    * 4. comment                   (string, optional) A comment
    * 5. subtractfeefrom           (json array, optional) The addresses.
    *                              The fee will be equally deducted from the amount of each selected address.
    *                              Those recipients will receive less bitcoins than you enter in their corresponding amount field.
    *                              If no addresses are specified here, the sender pays the fee.
    *      [
    *        "address",            (string) Subtract fee from this address
    *        ...
    *      ]
    * 6. replaceable               (boolean, optional, default=wallet default) Allow this transaction to be replaced by a transaction with higher fees via BIP 125
    * 7. conf_target               (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    * 8. estimate_mode             (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                              "unset"
    *                              "economical"
    *                              "conservative"
    * 9. fee_rate                  (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    * 10. verbose                  (boolean, optional, default=false) If true, return extra infomration about the transaction.
    * 
    * Result (if verbose is not set or set to false):
    * "hex"    (string) The transaction id for the send. Only 1 transaction is created regardless of
    *          the number of addresses.
    * 
    * Result (if verbose is set to true):
    * {                          (json object)
    *   "txid" : "hex",          (string) The transaction id for the send. Only 1 transaction is created regardless of
    *                            the number of addresses.
    *   "fee reason" : "str"     (string) The transaction fee reason.
    * }
    * 
    * Examples:
    * 
    * Send two amounts to two different addresses:
    * > bitcoin-cli sendmany "" "{\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\":0.01,\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\":0.02}"
    * 
    * Send two amounts to two different addresses setting the confirmation and comment:
    * > bitcoin-cli sendmany "" "{\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\":0.01,\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\":0.02}" 6 "testing"
    * 
    * Send two amounts to two different addresses, subtract fee from amount:
    * > bitcoin-cli sendmany "" "{\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\":0.01,\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\":0.02}" 1 "" "[\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\",\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\"]"
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "sendmany", "params": ["", {"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl":0.01,"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3":0.02}, 6, "testing"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object sendmany(Object address, Object minconf, Object comment) { return sendmany.invoke(address, minconf, comment); }


   /**
    * sendmany "" {"address":amount,...} ( minconf "comment" ["address",...] replaceable conf_target "estimate_mode" fee_rate verbose )
    * 
    * Send multiple times. Amounts are double-precision floating point numbers.
    * Requires wallet passphrase to be set with walletpassphrase call if wallet is encrypted.
    * 
    * Arguments:
    * 1. dummy                     (string, required) Must be set to "" for backwards compatibility.
    * 2. amounts                   (json object, required) The addresses and amounts
    *      {
    *        "address": amount,    (numeric or string, required) The bitcoin address is the key, the numeric amount (can be string) in BTC is the value
    *        ...
    *      }
    * 3. minconf                   (numeric, optional) Ignored dummy value
    * 4. comment                   (string, optional) A comment
    * 5. subtractfeefrom           (json array, optional) The addresses.
    *                              The fee will be equally deducted from the amount of each selected address.
    *                              Those recipients will receive less bitcoins than you enter in their corresponding amount field.
    *                              If no addresses are specified here, the sender pays the fee.
    *      [
    *        "address",            (string) Subtract fee from this address
    *        ...
    *      ]
    * 6. replaceable               (boolean, optional, default=wallet default) Allow this transaction to be replaced by a transaction with higher fees via BIP 125
    * 7. conf_target               (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    * 8. estimate_mode             (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                              "unset"
    *                              "economical"
    *                              "conservative"
    * 9. fee_rate                  (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    * 10. verbose                  (boolean, optional, default=false) If true, return extra infomration about the transaction.
    * 
    * Result (if verbose is not set or set to false):
    * "hex"    (string) The transaction id for the send. Only 1 transaction is created regardless of
    *          the number of addresses.
    * 
    * Result (if verbose is set to true):
    * {                          (json object)
    *   "txid" : "hex",          (string) The transaction id for the send. Only 1 transaction is created regardless of
    *                            the number of addresses.
    *   "fee reason" : "str"     (string) The transaction fee reason.
    * }
    * 
    * Examples:
    * 
    * Send two amounts to two different addresses:
    * > bitcoin-cli sendmany "" "{\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\":0.01,\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\":0.02}"
    * 
    * Send two amounts to two different addresses setting the confirmation and comment:
    * > bitcoin-cli sendmany "" "{\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\":0.01,\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\":0.02}" 6 "testing"
    * 
    * Send two amounts to two different addresses, subtract fee from amount:
    * > bitcoin-cli sendmany "" "{\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\":0.01,\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\":0.02}" 1 "" "[\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\",\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\"]"
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "sendmany", "params": ["", {"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl":0.01,"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3":0.02}, 6, "testing"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object sendmany(Object address, Object minconf, Object comment, Object addresses) { return sendmany.invoke(address, minconf, comment, addresses); }


   /**
    * sendmany "" {"address":amount,...} ( minconf "comment" ["address",...] replaceable conf_target "estimate_mode" fee_rate verbose )
    * 
    * Send multiple times. Amounts are double-precision floating point numbers.
    * Requires wallet passphrase to be set with walletpassphrase call if wallet is encrypted.
    * 
    * Arguments:
    * 1. dummy                     (string, required) Must be set to "" for backwards compatibility.
    * 2. amounts                   (json object, required) The addresses and amounts
    *      {
    *        "address": amount,    (numeric or string, required) The bitcoin address is the key, the numeric amount (can be string) in BTC is the value
    *        ...
    *      }
    * 3. minconf                   (numeric, optional) Ignored dummy value
    * 4. comment                   (string, optional) A comment
    * 5. subtractfeefrom           (json array, optional) The addresses.
    *                              The fee will be equally deducted from the amount of each selected address.
    *                              Those recipients will receive less bitcoins than you enter in their corresponding amount field.
    *                              If no addresses are specified here, the sender pays the fee.
    *      [
    *        "address",            (string) Subtract fee from this address
    *        ...
    *      ]
    * 6. replaceable               (boolean, optional, default=wallet default) Allow this transaction to be replaced by a transaction with higher fees via BIP 125
    * 7. conf_target               (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    * 8. estimate_mode             (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                              "unset"
    *                              "economical"
    *                              "conservative"
    * 9. fee_rate                  (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    * 10. verbose                  (boolean, optional, default=false) If true, return extra infomration about the transaction.
    * 
    * Result (if verbose is not set or set to false):
    * "hex"    (string) The transaction id for the send. Only 1 transaction is created regardless of
    *          the number of addresses.
    * 
    * Result (if verbose is set to true):
    * {                          (json object)
    *   "txid" : "hex",          (string) The transaction id for the send. Only 1 transaction is created regardless of
    *                            the number of addresses.
    *   "fee reason" : "str"     (string) The transaction fee reason.
    * }
    * 
    * Examples:
    * 
    * Send two amounts to two different addresses:
    * > bitcoin-cli sendmany "" "{\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\":0.01,\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\":0.02}"
    * 
    * Send two amounts to two different addresses setting the confirmation and comment:
    * > bitcoin-cli sendmany "" "{\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\":0.01,\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\":0.02}" 6 "testing"
    * 
    * Send two amounts to two different addresses, subtract fee from amount:
    * > bitcoin-cli sendmany "" "{\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\":0.01,\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\":0.02}" 1 "" "[\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\",\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\"]"
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "sendmany", "params": ["", {"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl":0.01,"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3":0.02}, 6, "testing"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object sendmany(Object address, Object minconf, Object comment, Object addresses, Object replaceable) { return sendmany.invoke(address, minconf, comment, addresses, replaceable); }


   /**
    * sendmany "" {"address":amount,...} ( minconf "comment" ["address",...] replaceable conf_target "estimate_mode" fee_rate verbose )
    * 
    * Send multiple times. Amounts are double-precision floating point numbers.
    * Requires wallet passphrase to be set with walletpassphrase call if wallet is encrypted.
    * 
    * Arguments:
    * 1. dummy                     (string, required) Must be set to "" for backwards compatibility.
    * 2. amounts                   (json object, required) The addresses and amounts
    *      {
    *        "address": amount,    (numeric or string, required) The bitcoin address is the key, the numeric amount (can be string) in BTC is the value
    *        ...
    *      }
    * 3. minconf                   (numeric, optional) Ignored dummy value
    * 4. comment                   (string, optional) A comment
    * 5. subtractfeefrom           (json array, optional) The addresses.
    *                              The fee will be equally deducted from the amount of each selected address.
    *                              Those recipients will receive less bitcoins than you enter in their corresponding amount field.
    *                              If no addresses are specified here, the sender pays the fee.
    *      [
    *        "address",            (string) Subtract fee from this address
    *        ...
    *      ]
    * 6. replaceable               (boolean, optional, default=wallet default) Allow this transaction to be replaced by a transaction with higher fees via BIP 125
    * 7. conf_target               (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    * 8. estimate_mode             (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                              "unset"
    *                              "economical"
    *                              "conservative"
    * 9. fee_rate                  (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    * 10. verbose                  (boolean, optional, default=false) If true, return extra infomration about the transaction.
    * 
    * Result (if verbose is not set or set to false):
    * "hex"    (string) The transaction id for the send. Only 1 transaction is created regardless of
    *          the number of addresses.
    * 
    * Result (if verbose is set to true):
    * {                          (json object)
    *   "txid" : "hex",          (string) The transaction id for the send. Only 1 transaction is created regardless of
    *                            the number of addresses.
    *   "fee reason" : "str"     (string) The transaction fee reason.
    * }
    * 
    * Examples:
    * 
    * Send two amounts to two different addresses:
    * > bitcoin-cli sendmany "" "{\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\":0.01,\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\":0.02}"
    * 
    * Send two amounts to two different addresses setting the confirmation and comment:
    * > bitcoin-cli sendmany "" "{\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\":0.01,\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\":0.02}" 6 "testing"
    * 
    * Send two amounts to two different addresses, subtract fee from amount:
    * > bitcoin-cli sendmany "" "{\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\":0.01,\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\":0.02}" 1 "" "[\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\",\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\"]"
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "sendmany", "params": ["", {"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl":0.01,"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3":0.02}, 6, "testing"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object sendmany(Object address, Object minconf, Object comment, Object addresses, Object replaceable, Object conf_target) { return sendmany.invoke(address, minconf, comment, addresses, replaceable, conf_target); }


   /**
    * sendmany "" {"address":amount,...} ( minconf "comment" ["address",...] replaceable conf_target "estimate_mode" fee_rate verbose )
    * 
    * Send multiple times. Amounts are double-precision floating point numbers.
    * Requires wallet passphrase to be set with walletpassphrase call if wallet is encrypted.
    * 
    * Arguments:
    * 1. dummy                     (string, required) Must be set to "" for backwards compatibility.
    * 2. amounts                   (json object, required) The addresses and amounts
    *      {
    *        "address": amount,    (numeric or string, required) The bitcoin address is the key, the numeric amount (can be string) in BTC is the value
    *        ...
    *      }
    * 3. minconf                   (numeric, optional) Ignored dummy value
    * 4. comment                   (string, optional) A comment
    * 5. subtractfeefrom           (json array, optional) The addresses.
    *                              The fee will be equally deducted from the amount of each selected address.
    *                              Those recipients will receive less bitcoins than you enter in their corresponding amount field.
    *                              If no addresses are specified here, the sender pays the fee.
    *      [
    *        "address",            (string) Subtract fee from this address
    *        ...
    *      ]
    * 6. replaceable               (boolean, optional, default=wallet default) Allow this transaction to be replaced by a transaction with higher fees via BIP 125
    * 7. conf_target               (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    * 8. estimate_mode             (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                              "unset"
    *                              "economical"
    *                              "conservative"
    * 9. fee_rate                  (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    * 10. verbose                  (boolean, optional, default=false) If true, return extra infomration about the transaction.
    * 
    * Result (if verbose is not set or set to false):
    * "hex"    (string) The transaction id for the send. Only 1 transaction is created regardless of
    *          the number of addresses.
    * 
    * Result (if verbose is set to true):
    * {                          (json object)
    *   "txid" : "hex",          (string) The transaction id for the send. Only 1 transaction is created regardless of
    *                            the number of addresses.
    *   "fee reason" : "str"     (string) The transaction fee reason.
    * }
    * 
    * Examples:
    * 
    * Send two amounts to two different addresses:
    * > bitcoin-cli sendmany "" "{\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\":0.01,\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\":0.02}"
    * 
    * Send two amounts to two different addresses setting the confirmation and comment:
    * > bitcoin-cli sendmany "" "{\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\":0.01,\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\":0.02}" 6 "testing"
    * 
    * Send two amounts to two different addresses, subtract fee from amount:
    * > bitcoin-cli sendmany "" "{\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\":0.01,\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\":0.02}" 1 "" "[\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\",\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\"]"
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "sendmany", "params": ["", {"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl":0.01,"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3":0.02}, 6, "testing"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object sendmany(Object address, Object minconf, Object comment, Object addresses, Object replaceable, Object conf_target, Object estimate_mode) { return sendmany.invoke(address, minconf, comment, addresses, replaceable, conf_target, estimate_mode); }


   /**
    * sendmany "" {"address":amount,...} ( minconf "comment" ["address",...] replaceable conf_target "estimate_mode" fee_rate verbose )
    * 
    * Send multiple times. Amounts are double-precision floating point numbers.
    * Requires wallet passphrase to be set with walletpassphrase call if wallet is encrypted.
    * 
    * Arguments:
    * 1. dummy                     (string, required) Must be set to "" for backwards compatibility.
    * 2. amounts                   (json object, required) The addresses and amounts
    *      {
    *        "address": amount,    (numeric or string, required) The bitcoin address is the key, the numeric amount (can be string) in BTC is the value
    *        ...
    *      }
    * 3. minconf                   (numeric, optional) Ignored dummy value
    * 4. comment                   (string, optional) A comment
    * 5. subtractfeefrom           (json array, optional) The addresses.
    *                              The fee will be equally deducted from the amount of each selected address.
    *                              Those recipients will receive less bitcoins than you enter in their corresponding amount field.
    *                              If no addresses are specified here, the sender pays the fee.
    *      [
    *        "address",            (string) Subtract fee from this address
    *        ...
    *      ]
    * 6. replaceable               (boolean, optional, default=wallet default) Allow this transaction to be replaced by a transaction with higher fees via BIP 125
    * 7. conf_target               (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    * 8. estimate_mode             (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                              "unset"
    *                              "economical"
    *                              "conservative"
    * 9. fee_rate                  (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    * 10. verbose                  (boolean, optional, default=false) If true, return extra infomration about the transaction.
    * 
    * Result (if verbose is not set or set to false):
    * "hex"    (string) The transaction id for the send. Only 1 transaction is created regardless of
    *          the number of addresses.
    * 
    * Result (if verbose is set to true):
    * {                          (json object)
    *   "txid" : "hex",          (string) The transaction id for the send. Only 1 transaction is created regardless of
    *                            the number of addresses.
    *   "fee reason" : "str"     (string) The transaction fee reason.
    * }
    * 
    * Examples:
    * 
    * Send two amounts to two different addresses:
    * > bitcoin-cli sendmany "" "{\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\":0.01,\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\":0.02}"
    * 
    * Send two amounts to two different addresses setting the confirmation and comment:
    * > bitcoin-cli sendmany "" "{\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\":0.01,\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\":0.02}" 6 "testing"
    * 
    * Send two amounts to two different addresses, subtract fee from amount:
    * > bitcoin-cli sendmany "" "{\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\":0.01,\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\":0.02}" 1 "" "[\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\",\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\"]"
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "sendmany", "params": ["", {"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl":0.01,"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3":0.02}, 6, "testing"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object sendmany(Object address, Object minconf, Object comment, Object addresses, Object replaceable, Object conf_target, Object estimate_mode, Object fee_rate) { return sendmany.invoke(address, minconf, comment, addresses, replaceable, conf_target, estimate_mode, fee_rate); }


   /**
    * sendmany "" {"address":amount,...} ( minconf "comment" ["address",...] replaceable conf_target "estimate_mode" fee_rate verbose )
    * 
    * Send multiple times. Amounts are double-precision floating point numbers.
    * Requires wallet passphrase to be set with walletpassphrase call if wallet is encrypted.
    * 
    * Arguments:
    * 1. dummy                     (string, required) Must be set to "" for backwards compatibility.
    * 2. amounts                   (json object, required) The addresses and amounts
    *      {
    *        "address": amount,    (numeric or string, required) The bitcoin address is the key, the numeric amount (can be string) in BTC is the value
    *        ...
    *      }
    * 3. minconf                   (numeric, optional) Ignored dummy value
    * 4. comment                   (string, optional) A comment
    * 5. subtractfeefrom           (json array, optional) The addresses.
    *                              The fee will be equally deducted from the amount of each selected address.
    *                              Those recipients will receive less bitcoins than you enter in their corresponding amount field.
    *                              If no addresses are specified here, the sender pays the fee.
    *      [
    *        "address",            (string) Subtract fee from this address
    *        ...
    *      ]
    * 6. replaceable               (boolean, optional, default=wallet default) Allow this transaction to be replaced by a transaction with higher fees via BIP 125
    * 7. conf_target               (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    * 8. estimate_mode             (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                              "unset"
    *                              "economical"
    *                              "conservative"
    * 9. fee_rate                  (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    * 10. verbose                  (boolean, optional, default=false) If true, return extra infomration about the transaction.
    * 
    * Result (if verbose is not set or set to false):
    * "hex"    (string) The transaction id for the send. Only 1 transaction is created regardless of
    *          the number of addresses.
    * 
    * Result (if verbose is set to true):
    * {                          (json object)
    *   "txid" : "hex",          (string) The transaction id for the send. Only 1 transaction is created regardless of
    *                            the number of addresses.
    *   "fee reason" : "str"     (string) The transaction fee reason.
    * }
    * 
    * Examples:
    * 
    * Send two amounts to two different addresses:
    * > bitcoin-cli sendmany "" "{\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\":0.01,\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\":0.02}"
    * 
    * Send two amounts to two different addresses setting the confirmation and comment:
    * > bitcoin-cli sendmany "" "{\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\":0.01,\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\":0.02}" 6 "testing"
    * 
    * Send two amounts to two different addresses, subtract fee from amount:
    * > bitcoin-cli sendmany "" "{\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\":0.01,\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\":0.02}" 1 "" "[\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\",\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\"]"
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "sendmany", "params": ["", {"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl":0.01,"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3":0.02}, 6, "testing"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object sendmany(Object address, Object minconf, Object comment, Object addresses, Object replaceable, Object conf_target, Object estimate_mode, Object fee_rate, Object verbose) { return sendmany.invoke(address, minconf, comment, addresses, replaceable, conf_target, estimate_mode, fee_rate, verbose); }

   /**
    * getunconfirmedbalance
    * DEPRECATED
    * Identical to getbalances().mine.untrusted_pending
    * 
    * Result:
    * n    (numeric) The balance
    */
   public Object getunconfirmedbalance() { return getunconfirmedbalance.invoke(); }

   /**
    * listreceivedbyaddress ( minconf include_empty include_watchonly "address_filter" )
    * 
    * List balances by receiving address.
    * 
    * Arguments:
    * 1. minconf              (numeric, optional, default=1) The minimum number of confirmations before payments are included.
    * 2. include_empty        (boolean, optional, default=false) Whether to include addresses that haven't received any payments.
    * 3. include_watchonly    (boolean, optional, default=true for watch-only wallets, otherwise false) Whether to include watch-only addresses (see 'importaddress')
    * 4. address_filter       (string, optional) If present, only return information on this address.
    * 
    * Result:
    * [                                        (json array)
    *   {                                      (json object)
    *     "involvesWatchonly" : true|false,    (boolean) Only returns true if imported addresses were involved in transaction
    *     "address" : "str",                   (string) The receiving address
    *     "amount" : n,                        (numeric) The total amount in BTC received by the address
    *     "confirmations" : n,                 (numeric) The number of confirmations of the most recent transaction included
    *     "label" : "str",                     (string) The label of the receiving address. The default label is ""
    *     "txids" : [                          (json array)
    *       "hex",                             (string) The ids of transactions received with the address
    *       ...
    *     ]
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * > bitcoin-cli listreceivedbyaddress 
    * > bitcoin-cli listreceivedbyaddress 6 true
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listreceivedbyaddress", "params": [6, true, true]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listreceivedbyaddress", "params": [6, true, true, "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object listreceivedbyaddress() { return listreceivedbyaddress.invoke(); }


   /**
    * listreceivedbyaddress ( minconf include_empty include_watchonly "address_filter" )
    * 
    * List balances by receiving address.
    * 
    * Arguments:
    * 1. minconf              (numeric, optional, default=1) The minimum number of confirmations before payments are included.
    * 2. include_empty        (boolean, optional, default=false) Whether to include addresses that haven't received any payments.
    * 3. include_watchonly    (boolean, optional, default=true for watch-only wallets, otherwise false) Whether to include watch-only addresses (see 'importaddress')
    * 4. address_filter       (string, optional) If present, only return information on this address.
    * 
    * Result:
    * [                                        (json array)
    *   {                                      (json object)
    *     "involvesWatchonly" : true|false,    (boolean) Only returns true if imported addresses were involved in transaction
    *     "address" : "str",                   (string) The receiving address
    *     "amount" : n,                        (numeric) The total amount in BTC received by the address
    *     "confirmations" : n,                 (numeric) The number of confirmations of the most recent transaction included
    *     "label" : "str",                     (string) The label of the receiving address. The default label is ""
    *     "txids" : [                          (json array)
    *       "hex",                             (string) The ids of transactions received with the address
    *       ...
    *     ]
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * > bitcoin-cli listreceivedbyaddress 
    * > bitcoin-cli listreceivedbyaddress 6 true
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listreceivedbyaddress", "params": [6, true, true]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listreceivedbyaddress", "params": [6, true, true, "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object listreceivedbyaddress(Object minconf) { return listreceivedbyaddress.invoke(minconf); }


   /**
    * listreceivedbyaddress ( minconf include_empty include_watchonly "address_filter" )
    * 
    * List balances by receiving address.
    * 
    * Arguments:
    * 1. minconf              (numeric, optional, default=1) The minimum number of confirmations before payments are included.
    * 2. include_empty        (boolean, optional, default=false) Whether to include addresses that haven't received any payments.
    * 3. include_watchonly    (boolean, optional, default=true for watch-only wallets, otherwise false) Whether to include watch-only addresses (see 'importaddress')
    * 4. address_filter       (string, optional) If present, only return information on this address.
    * 
    * Result:
    * [                                        (json array)
    *   {                                      (json object)
    *     "involvesWatchonly" : true|false,    (boolean) Only returns true if imported addresses were involved in transaction
    *     "address" : "str",                   (string) The receiving address
    *     "amount" : n,                        (numeric) The total amount in BTC received by the address
    *     "confirmations" : n,                 (numeric) The number of confirmations of the most recent transaction included
    *     "label" : "str",                     (string) The label of the receiving address. The default label is ""
    *     "txids" : [                          (json array)
    *       "hex",                             (string) The ids of transactions received with the address
    *       ...
    *     ]
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * > bitcoin-cli listreceivedbyaddress 
    * > bitcoin-cli listreceivedbyaddress 6 true
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listreceivedbyaddress", "params": [6, true, true]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listreceivedbyaddress", "params": [6, true, true, "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object listreceivedbyaddress(Object minconf, Object include_empty) { return listreceivedbyaddress.invoke(minconf, include_empty); }


   /**
    * listreceivedbyaddress ( minconf include_empty include_watchonly "address_filter" )
    * 
    * List balances by receiving address.
    * 
    * Arguments:
    * 1. minconf              (numeric, optional, default=1) The minimum number of confirmations before payments are included.
    * 2. include_empty        (boolean, optional, default=false) Whether to include addresses that haven't received any payments.
    * 3. include_watchonly    (boolean, optional, default=true for watch-only wallets, otherwise false) Whether to include watch-only addresses (see 'importaddress')
    * 4. address_filter       (string, optional) If present, only return information on this address.
    * 
    * Result:
    * [                                        (json array)
    *   {                                      (json object)
    *     "involvesWatchonly" : true|false,    (boolean) Only returns true if imported addresses were involved in transaction
    *     "address" : "str",                   (string) The receiving address
    *     "amount" : n,                        (numeric) The total amount in BTC received by the address
    *     "confirmations" : n,                 (numeric) The number of confirmations of the most recent transaction included
    *     "label" : "str",                     (string) The label of the receiving address. The default label is ""
    *     "txids" : [                          (json array)
    *       "hex",                             (string) The ids of transactions received with the address
    *       ...
    *     ]
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * > bitcoin-cli listreceivedbyaddress 
    * > bitcoin-cli listreceivedbyaddress 6 true
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listreceivedbyaddress", "params": [6, true, true]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listreceivedbyaddress", "params": [6, true, true, "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object listreceivedbyaddress(Object minconf, Object include_empty, Object include_watchonly) { return listreceivedbyaddress.invoke(minconf, include_empty, include_watchonly); }


   /**
    * listreceivedbyaddress ( minconf include_empty include_watchonly "address_filter" )
    * 
    * List balances by receiving address.
    * 
    * Arguments:
    * 1. minconf              (numeric, optional, default=1) The minimum number of confirmations before payments are included.
    * 2. include_empty        (boolean, optional, default=false) Whether to include addresses that haven't received any payments.
    * 3. include_watchonly    (boolean, optional, default=true for watch-only wallets, otherwise false) Whether to include watch-only addresses (see 'importaddress')
    * 4. address_filter       (string, optional) If present, only return information on this address.
    * 
    * Result:
    * [                                        (json array)
    *   {                                      (json object)
    *     "involvesWatchonly" : true|false,    (boolean) Only returns true if imported addresses were involved in transaction
    *     "address" : "str",                   (string) The receiving address
    *     "amount" : n,                        (numeric) The total amount in BTC received by the address
    *     "confirmations" : n,                 (numeric) The number of confirmations of the most recent transaction included
    *     "label" : "str",                     (string) The label of the receiving address. The default label is ""
    *     "txids" : [                          (json array)
    *       "hex",                             (string) The ids of transactions received with the address
    *       ...
    *     ]
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * > bitcoin-cli listreceivedbyaddress 
    * > bitcoin-cli listreceivedbyaddress 6 true
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listreceivedbyaddress", "params": [6, true, true]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listreceivedbyaddress", "params": [6, true, true, "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object listreceivedbyaddress(Object minconf, Object include_empty, Object include_watchonly, Object address_filter) { return listreceivedbyaddress.invoke(minconf, include_empty, include_watchonly, address_filter); }

   /**
    * signrawtransactionwithkey "hexstring" ["privatekey",...] ( [{"txid":"hex","vout":n,"scriptPubKey":"hex","redeemScript":"hex","witnessScript":"hex","amount":amount},...] "sighashtype" )
    * 
    * Sign inputs for raw transaction (serialized, hex-encoded).
    * The second argument is an array of base58-encoded private
    * keys that will be the only keys used to sign the transaction.
    * The third optional argument (may be null) is an array of previous transaction outputs that
    * this transaction depends on but may not yet be in the block chain.
    * 
    * Arguments:
    * 1. hexstring                        (string, required) The transaction hex string
    * 2. privkeys                         (json array, required) The base58-encoded private keys for signing
    *      [
    *        "privatekey",                (string) private key in base58-encoding
    *        ...
    *      ]
    * 3. prevtxs                          (json array, optional) The previous dependent transaction outputs
    *      [
    *        {                            (json object)
    *          "txid": "hex",             (string, required) The transaction id
    *          "vout": n,                 (numeric, required) The output number
    *          "scriptPubKey": "hex",     (string, required) script key
    *          "redeemScript": "hex",     (string) (required for P2SH) redeem script
    *          "witnessScript": "hex",    (string) (required for P2WSH or P2SH-P2WSH) witness script
    *          "amount": amount,          (numeric or string) (required for Segwit inputs) the amount spent
    *        },
    *        ...
    *      ]
    * 4. sighashtype                      (string, optional, default="DEFAULT") The signature hash type. Must be one of:
    *                                     "DEFAULT"
    *                                     "ALL"
    *                                     "NONE"
    *                                     "SINGLE"
    *                                     "ALL|ANYONECANPAY"
    *                                     "NONE|ANYONECANPAY"
    *                                     "SINGLE|ANYONECANPAY"
    *                                     
    * 
    * Result:
    * {                             (json object)
    *   "hex" : "hex",              (string) The hex-encoded raw transaction with signature(s)
    *   "complete" : true|false,    (boolean) If the transaction has a complete set of signatures
    *   "errors" : [                (json array, optional) Script verification errors (if there are any)
    *     {                         (json object)
    *       "txid" : "hex",         (string) The hash of the referenced, previous transaction
    *       "vout" : n,             (numeric) The index of the output to spent and used as input
    *       "scriptSig" : "hex",    (string) The hex-encoded signature script
    *       "sequence" : n,         (numeric) Script sequence number
    *       "error" : "str"         (string) Verification or signing error related to the input
    *     },
    *     ...
    *   ]
    * }
    * 
    * Examples:
    * > bitcoin-cli signrawtransactionwithkey "myhex" "[\"key1\",\"key2\"]"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "signrawtransactionwithkey", "params": ["myhex", "[\"key1\",\"key2\"]"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object signrawtransactionwithkey(Object hexstring, Object privatekeys) { return signrawtransactionwithkey.invoke(hexstring, privatekeys); }


   /**
    * signrawtransactionwithkey "hexstring" ["privatekey",...] ( [{"txid":"hex","vout":n,"scriptPubKey":"hex","redeemScript":"hex","witnessScript":"hex","amount":amount},...] "sighashtype" )
    * 
    * Sign inputs for raw transaction (serialized, hex-encoded).
    * The second argument is an array of base58-encoded private
    * keys that will be the only keys used to sign the transaction.
    * The third optional argument (may be null) is an array of previous transaction outputs that
    * this transaction depends on but may not yet be in the block chain.
    * 
    * Arguments:
    * 1. hexstring                        (string, required) The transaction hex string
    * 2. privkeys                         (json array, required) The base58-encoded private keys for signing
    *      [
    *        "privatekey",                (string) private key in base58-encoding
    *        ...
    *      ]
    * 3. prevtxs                          (json array, optional) The previous dependent transaction outputs
    *      [
    *        {                            (json object)
    *          "txid": "hex",             (string, required) The transaction id
    *          "vout": n,                 (numeric, required) The output number
    *          "scriptPubKey": "hex",     (string, required) script key
    *          "redeemScript": "hex",     (string) (required for P2SH) redeem script
    *          "witnessScript": "hex",    (string) (required for P2WSH or P2SH-P2WSH) witness script
    *          "amount": amount,          (numeric or string) (required for Segwit inputs) the amount spent
    *        },
    *        ...
    *      ]
    * 4. sighashtype                      (string, optional, default="DEFAULT") The signature hash type. Must be one of:
    *                                     "DEFAULT"
    *                                     "ALL"
    *                                     "NONE"
    *                                     "SINGLE"
    *                                     "ALL|ANYONECANPAY"
    *                                     "NONE|ANYONECANPAY"
    *                                     "SINGLE|ANYONECANPAY"
    *                                     
    * 
    * Result:
    * {                             (json object)
    *   "hex" : "hex",              (string) The hex-encoded raw transaction with signature(s)
    *   "complete" : true|false,    (boolean) If the transaction has a complete set of signatures
    *   "errors" : [                (json array, optional) Script verification errors (if there are any)
    *     {                         (json object)
    *       "txid" : "hex",         (string) The hash of the referenced, previous transaction
    *       "vout" : n,             (numeric) The index of the output to spent and used as input
    *       "scriptSig" : "hex",    (string) The hex-encoded signature script
    *       "sequence" : n,         (numeric) Script sequence number
    *       "error" : "str"         (string) Verification or signing error related to the input
    *     },
    *     ...
    *   ]
    * }
    * 
    * Examples:
    * > bitcoin-cli signrawtransactionwithkey "myhex" "[\"key1\",\"key2\"]"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "signrawtransactionwithkey", "params": ["myhex", "[\"key1\",\"key2\"]"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object signrawtransactionwithkey(Object hexstring, Object privatekeys, Object txid_vout_scriptPubKey_redeemScript_witnessScript_amounts) { return signrawtransactionwithkey.invoke(hexstring, privatekeys, txid_vout_scriptPubKey_redeemScript_witnessScript_amounts); }


   /**
    * signrawtransactionwithkey "hexstring" ["privatekey",...] ( [{"txid":"hex","vout":n,"scriptPubKey":"hex","redeemScript":"hex","witnessScript":"hex","amount":amount},...] "sighashtype" )
    * 
    * Sign inputs for raw transaction (serialized, hex-encoded).
    * The second argument is an array of base58-encoded private
    * keys that will be the only keys used to sign the transaction.
    * The third optional argument (may be null) is an array of previous transaction outputs that
    * this transaction depends on but may not yet be in the block chain.
    * 
    * Arguments:
    * 1. hexstring                        (string, required) The transaction hex string
    * 2. privkeys                         (json array, required) The base58-encoded private keys for signing
    *      [
    *        "privatekey",                (string) private key in base58-encoding
    *        ...
    *      ]
    * 3. prevtxs                          (json array, optional) The previous dependent transaction outputs
    *      [
    *        {                            (json object)
    *          "txid": "hex",             (string, required) The transaction id
    *          "vout": n,                 (numeric, required) The output number
    *          "scriptPubKey": "hex",     (string, required) script key
    *          "redeemScript": "hex",     (string) (required for P2SH) redeem script
    *          "witnessScript": "hex",    (string) (required for P2WSH or P2SH-P2WSH) witness script
    *          "amount": amount,          (numeric or string) (required for Segwit inputs) the amount spent
    *        },
    *        ...
    *      ]
    * 4. sighashtype                      (string, optional, default="DEFAULT") The signature hash type. Must be one of:
    *                                     "DEFAULT"
    *                                     "ALL"
    *                                     "NONE"
    *                                     "SINGLE"
    *                                     "ALL|ANYONECANPAY"
    *                                     "NONE|ANYONECANPAY"
    *                                     "SINGLE|ANYONECANPAY"
    *                                     
    * 
    * Result:
    * {                             (json object)
    *   "hex" : "hex",              (string) The hex-encoded raw transaction with signature(s)
    *   "complete" : true|false,    (boolean) If the transaction has a complete set of signatures
    *   "errors" : [                (json array, optional) Script verification errors (if there are any)
    *     {                         (json object)
    *       "txid" : "hex",         (string) The hash of the referenced, previous transaction
    *       "vout" : n,             (numeric) The index of the output to spent and used as input
    *       "scriptSig" : "hex",    (string) The hex-encoded signature script
    *       "sequence" : n,         (numeric) Script sequence number
    *       "error" : "str"         (string) Verification or signing error related to the input
    *     },
    *     ...
    *   ]
    * }
    * 
    * Examples:
    * > bitcoin-cli signrawtransactionwithkey "myhex" "[\"key1\",\"key2\"]"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "signrawtransactionwithkey", "params": ["myhex", "[\"key1\",\"key2\"]"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object signrawtransactionwithkey(Object hexstring, Object privatekeys, Object txid_vout_scriptPubKey_redeemScript_witnessScript_amounts, Object sighashtype) { return signrawtransactionwithkey.invoke(hexstring, privatekeys, txid_vout_scriptPubKey_redeemScript_witnessScript_amounts, sighashtype); }

   /**
    * settxfee amount
    * 
    * Set the transaction fee rate in BTC/kvB for this wallet. Overrides the global -paytxfee command line parameter.
    * Can be deactivated by passing 0 as the fee. In that case automatic fee selection will be used by default.
    * 
    * Arguments:
    * 1. amount    (numeric or string, required) The transaction fee rate in BTC/kvB
    * 
    * Result:
    * true|false    (boolean) Returns true if successful
    * 
    * Examples:
    * > bitcoin-cli settxfee 0.00001
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "settxfee", "params": [0.00001]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object settxfee(Object amount) { return settxfee.invoke(amount); }

   /**
    * listbanned
    * 
    * List all manually banned IPs/Subnets.
    * 
    * Result:
    * [                              (json array)
    *   {                            (json object)
    *     "address" : "str",         (string) The IP/Subnet of the banned node
    *     "ban_created" : xxx,       (numeric) The UNIX epoch time the ban was created
    *     "banned_until" : xxx,      (numeric) The UNIX epoch time the ban expires
    *     "ban_duration" : xxx,      (numeric) The ban duration, in seconds
    *     "time_remaining" : xxx     (numeric) The time remaining until the ban expires, in seconds
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * > bitcoin-cli listbanned 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listbanned", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object listbanned() { return listbanned.invoke(); }

   /**
    * createpsbt [{"txid":"hex","vout":n,"sequence":n},...] [{"address":amount,...},{"data":"hex"},...] ( locktime replaceable )
    * 
    * Creates a transaction in the Partially Signed Transaction format.
    * Implements the Creator role.
    * 
    * Arguments:
    * 1. inputs                      (json array, required) The json objects
    *      [
    *        {                       (json object)
    *          "txid": "hex",        (string, required) The transaction id
    *          "vout": n,            (numeric, required) The output number
    *          "sequence": n,        (numeric, optional, default=depends on the value of the 'replaceable' and 'locktime' arguments) The sequence number
    *        },
    *        ...
    *      ]
    * 2. outputs                     (json array, required) The outputs (key-value pairs), where none of the keys are duplicated.
    *                                That is, each address can only appear once and there can only be one 'data' object.
    *                                For compatibility reasons, a dictionary, which holds the key-value pairs directly, is also
    *                                accepted as second parameter.
    *      [
    *        {                       (json object)
    *          "address": amount,    (numeric or string, required) A key-value pair. The key (string) is the bitcoin address, the value (float or string) is the amount in BTC
    *          ...
    *        },
    *        {                       (json object)
    *          "data": "hex",        (string, required) A key-value pair. The key must be "data", the value is hex-encoded data
    *        },
    *        ...
    *      ]
    * 3. locktime                    (numeric, optional, default=0) Raw locktime. Non-0 value also locktime-activates inputs
    * 4. replaceable                 (boolean, optional, default=false) Marks this transaction as BIP125 replaceable.
    *                                Allows this transaction to be replaced by a transaction with higher fees. If provided, it is an error if explicit sequence numbers are incompatible.
    * 
    * Result:
    * "str"    (string) The resulting raw transaction (base64-encoded string)
    * 
    * Examples:
    * > bitcoin-cli createpsbt "[{\"txid\":\"myid\",\"vout\":0}]" "[{\"data\":\"00010203\"}]"
    */
   public Object createpsbt(Object utxos, Object address_amounts) { return createpsbt.invoke(utxos, address_amounts); }


   /**
    * createpsbt [{"txid":"hex","vout":n,"sequence":n},...] [{"address":amount,...},{"data":"hex"},...] ( locktime replaceable )
    * 
    * Creates a transaction in the Partially Signed Transaction format.
    * Implements the Creator role.
    * 
    * Arguments:
    * 1. inputs                      (json array, required) The json objects
    *      [
    *        {                       (json object)
    *          "txid": "hex",        (string, required) The transaction id
    *          "vout": n,            (numeric, required) The output number
    *          "sequence": n,        (numeric, optional, default=depends on the value of the 'replaceable' and 'locktime' arguments) The sequence number
    *        },
    *        ...
    *      ]
    * 2. outputs                     (json array, required) The outputs (key-value pairs), where none of the keys are duplicated.
    *                                That is, each address can only appear once and there can only be one 'data' object.
    *                                For compatibility reasons, a dictionary, which holds the key-value pairs directly, is also
    *                                accepted as second parameter.
    *      [
    *        {                       (json object)
    *          "address": amount,    (numeric or string, required) A key-value pair. The key (string) is the bitcoin address, the value (float or string) is the amount in BTC
    *          ...
    *        },
    *        {                       (json object)
    *          "data": "hex",        (string, required) A key-value pair. The key must be "data", the value is hex-encoded data
    *        },
    *        ...
    *      ]
    * 3. locktime                    (numeric, optional, default=0) Raw locktime. Non-0 value also locktime-activates inputs
    * 4. replaceable                 (boolean, optional, default=false) Marks this transaction as BIP125 replaceable.
    *                                Allows this transaction to be replaced by a transaction with higher fees. If provided, it is an error if explicit sequence numbers are incompatible.
    * 
    * Result:
    * "str"    (string) The resulting raw transaction (base64-encoded string)
    * 
    * Examples:
    * > bitcoin-cli createpsbt "[{\"txid\":\"myid\",\"vout\":0}]" "[{\"data\":\"00010203\"}]"
    */
   public Object createpsbt(Object utxos, Object address_amounts, Object locktime) { return createpsbt.invoke(utxos, address_amounts, locktime); }


   /**
    * createpsbt [{"txid":"hex","vout":n,"sequence":n},...] [{"address":amount,...},{"data":"hex"},...] ( locktime replaceable )
    * 
    * Creates a transaction in the Partially Signed Transaction format.
    * Implements the Creator role.
    * 
    * Arguments:
    * 1. inputs                      (json array, required) The json objects
    *      [
    *        {                       (json object)
    *          "txid": "hex",        (string, required) The transaction id
    *          "vout": n,            (numeric, required) The output number
    *          "sequence": n,        (numeric, optional, default=depends on the value of the 'replaceable' and 'locktime' arguments) The sequence number
    *        },
    *        ...
    *      ]
    * 2. outputs                     (json array, required) The outputs (key-value pairs), where none of the keys are duplicated.
    *                                That is, each address can only appear once and there can only be one 'data' object.
    *                                For compatibility reasons, a dictionary, which holds the key-value pairs directly, is also
    *                                accepted as second parameter.
    *      [
    *        {                       (json object)
    *          "address": amount,    (numeric or string, required) A key-value pair. The key (string) is the bitcoin address, the value (float or string) is the amount in BTC
    *          ...
    *        },
    *        {                       (json object)
    *          "data": "hex",        (string, required) A key-value pair. The key must be "data", the value is hex-encoded data
    *        },
    *        ...
    *      ]
    * 3. locktime                    (numeric, optional, default=0) Raw locktime. Non-0 value also locktime-activates inputs
    * 4. replaceable                 (boolean, optional, default=false) Marks this transaction as BIP125 replaceable.
    *                                Allows this transaction to be replaced by a transaction with higher fees. If provided, it is an error if explicit sequence numbers are incompatible.
    * 
    * Result:
    * "str"    (string) The resulting raw transaction (base64-encoded string)
    * 
    * Examples:
    * > bitcoin-cli createpsbt "[{\"txid\":\"myid\",\"vout\":0}]" "[{\"data\":\"00010203\"}]"
    */
   public Object createpsbt(Object utxos, Object address_amounts, Object locktime, Object replaceable) { return createpsbt.invoke(utxos, address_amounts, locktime, replaceable); }

   /**
    * abandontransaction "txid"
    * 
    * Mark in-wallet transaction <txid> as abandoned
    * This will mark this transaction and all its in-wallet descendants as abandoned which will allow
    * for their inputs to be respent.  It can be used to replace "stuck" or evicted transactions.
    * It only works on transactions which are not included in a block and are not currently in the mempool.
    * It has no effect on transactions which are already abandoned.
    * 
    * Arguments:
    * 1. txid    (string, required) The transaction id
    * 
    * Result:
    * null    (json null)
    * 
    * Examples:
    * > bitcoin-cli abandontransaction "1075db55d416d3ca199f55b6084e2115b9345e16c5cf302fc80e9d5fbf5d48d"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "abandontransaction", "params": ["1075db55d416d3ca199f55b6084e2115b9345e16c5cf302fc80e9d5fbf5d48d"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object abandontransaction(Object txid) { return abandontransaction.invoke(txid); }

   /**
    * listaddressgroupings
    * 
    * Lists groups of addresses which have had their common ownership
    * made public by common use as inputs or as the resulting change
    * in past transactions
    * 
    * Result:
    * [               (json array)
    *   [             (json array)
    *     [           (json array)
    *       "str",    (string) The bitcoin address
    *       n,        (numeric) The amount in BTC
    *       "str"     (string, optional) The label
    *     ],
    *     ...
    *   ],
    *   ...
    * ]
    * 
    * Examples:
    * > bitcoin-cli listaddressgroupings 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listaddressgroupings", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object listaddressgroupings() { return listaddressgroupings.invoke(); }

   /**
    * listlockunspent
    * 
    * Returns list of temporarily unspendable outputs.
    * See the lockunspent call to lock and unlock transactions for spending.
    * 
    * Result:
    * [                      (json array)
    *   {                    (json object)
    *     "txid" : "hex",    (string) The transaction id locked
    *     "vout" : n         (numeric) The vout value
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * 
    * List the unspent transactions
    * > bitcoin-cli listunspent 
    * 
    * Lock an unspent transaction
    * > bitcoin-cli lockunspent false "[{\"txid\":\"a08e6907dbbd3d809776dbfc5d82e371b764ed838b5655e72f463568df1aadf0\",\"vout\":1}]"
    * 
    * List the locked transactions
    * > bitcoin-cli listlockunspent 
    * 
    * Unlock the transaction again
    * > bitcoin-cli lockunspent true "[{\"txid\":\"a08e6907dbbd3d809776dbfc5d82e371b764ed838b5655e72f463568df1aadf0\",\"vout\":1}]"
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listlockunspent", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object listlockunspent() { return listlockunspent.invoke(); }

   /**
    * bumpfee "txid" ( options )
    * 
    * Bumps the fee of an opt-in-RBF transaction T, replacing it with a new transaction B.
    * An opt-in RBF transaction with the given txid must be in the wallet.
    * The command will pay the additional fee by reducing change outputs or adding inputs when necessary.
    * It may add a new change output if one does not already exist.
    * All inputs in the original transaction will be included in the replacement transaction.
    * The command will fail if the wallet or mempool contains a transaction that spends one of T's outputs.
    * By default, the new fee will be calculated automatically using the estimatesmartfee RPC.
    * The user can specify a confirmation target for estimatesmartfee.
    * Alternatively, the user can specify a fee rate in sat/vB for the new transaction.
    * At a minimum, the new fee rate must be high enough to pay an additional new relay fee (incrementalfee
    * returned by getnetworkinfo) to enter the node's mempool.
    * * WARNING: before version 0.21, fee_rate was in BTC/kvB. As of 0.21, fee_rate is in sat/vB. *
    * 
    * Arguments:
    * 1. txid                           (string, required) The txid to be bumped
    * 2. options                        (json object, optional)
    *      {
    *        "conf_target": n,          (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    *                                   
    *        "fee_rate": amount,        (numeric or string, optional, default=not set, fall back to wallet fee estimation) 
    *                                   Specify a fee rate in sat/vB instead of relying on the built-in fee estimator.
    *                                   Must be at least 1.000 sat/vB higher than the current transaction fee rate.
    *                                   WARNING: before version 0.21, fee_rate was in BTC/kvB. As of 0.21, fee_rate is in sat/vB.
    *                                   
    *        "replaceable": bool,       (boolean, optional, default=true) Whether the new transaction should still be
    *                                   marked bip-125 replaceable. If true, the sequence numbers in the transaction will
    *                                   be left unchanged from the original. If false, any input sequence numbers in the
    *                                   original transaction that were less than 0xfffffffe will be increased to 0xfffffffe
    *                                   so the new transaction will not be explicitly bip-125 replaceable (though it may
    *                                   still be replaceable in practice, for example if it has unconfirmed ancestors which
    *                                   are replaceable).
    *                                   
    *        "estimate_mode": "str",    (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                                   "unset"
    *                                   "economical"
    *                                   "conservative"
    *      }
    * 
    * Result:
    * {                    (json object)
    *   "txid" : "hex",    (string) The id of the new transaction.
    *   "origfee" : n,     (numeric) The fee of the replaced transaction.
    *   "fee" : n,         (numeric) The fee of the new transaction.
    *   "errors" : [       (json array) Errors encountered during processing (may be empty).
    *     "str",           (string)
    *     ...
    *   ]
    * }
    * 
    * Examples:
    * 
    * Bump the fee, get the new transaction's txid
    * > bitcoin-cli bumpfee <txid>
    */
   public Object bumpfee(Object txid) { return bumpfee.invoke(txid); }


   /**
    * bumpfee "txid" ( options )
    * 
    * Bumps the fee of an opt-in-RBF transaction T, replacing it with a new transaction B.
    * An opt-in RBF transaction with the given txid must be in the wallet.
    * The command will pay the additional fee by reducing change outputs or adding inputs when necessary.
    * It may add a new change output if one does not already exist.
    * All inputs in the original transaction will be included in the replacement transaction.
    * The command will fail if the wallet or mempool contains a transaction that spends one of T's outputs.
    * By default, the new fee will be calculated automatically using the estimatesmartfee RPC.
    * The user can specify a confirmation target for estimatesmartfee.
    * Alternatively, the user can specify a fee rate in sat/vB for the new transaction.
    * At a minimum, the new fee rate must be high enough to pay an additional new relay fee (incrementalfee
    * returned by getnetworkinfo) to enter the node's mempool.
    * * WARNING: before version 0.21, fee_rate was in BTC/kvB. As of 0.21, fee_rate is in sat/vB. *
    * 
    * Arguments:
    * 1. txid                           (string, required) The txid to be bumped
    * 2. options                        (json object, optional)
    *      {
    *        "conf_target": n,          (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    *                                   
    *        "fee_rate": amount,        (numeric or string, optional, default=not set, fall back to wallet fee estimation) 
    *                                   Specify a fee rate in sat/vB instead of relying on the built-in fee estimator.
    *                                   Must be at least 1.000 sat/vB higher than the current transaction fee rate.
    *                                   WARNING: before version 0.21, fee_rate was in BTC/kvB. As of 0.21, fee_rate is in sat/vB.
    *                                   
    *        "replaceable": bool,       (boolean, optional, default=true) Whether the new transaction should still be
    *                                   marked bip-125 replaceable. If true, the sequence numbers in the transaction will
    *                                   be left unchanged from the original. If false, any input sequence numbers in the
    *                                   original transaction that were less than 0xfffffffe will be increased to 0xfffffffe
    *                                   so the new transaction will not be explicitly bip-125 replaceable (though it may
    *                                   still be replaceable in practice, for example if it has unconfirmed ancestors which
    *                                   are replaceable).
    *                                   
    *        "estimate_mode": "str",    (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                                   "unset"
    *                                   "economical"
    *                                   "conservative"
    *      }
    * 
    * Result:
    * {                    (json object)
    *   "txid" : "hex",    (string) The id of the new transaction.
    *   "origfee" : n,     (numeric) The fee of the replaced transaction.
    *   "fee" : n,         (numeric) The fee of the new transaction.
    *   "errors" : [       (json array) Errors encountered during processing (may be empty).
    *     "str",           (string)
    *     ...
    *   ]
    * }
    * 
    * Examples:
    * 
    * Bump the fee, get the new transaction's txid
    * > bitcoin-cli bumpfee <txid>
    */
   public Object bumpfee(Object txid, Object options) { return bumpfee.invoke(txid, options); }

   /**
    * dumpwallet "filename"
    * 
    * Dumps all wallet keys in a human-readable format to a server-side file. This does not allow overwriting existing files.
    * Imported scripts are included in the dumpfile, but corresponding BIP173 addresses, etc. may not be added automatically by importwallet.
    * Note that if your wallet contains keys which are not derived from your HD seed (e.g. imported keys), these are not covered by
    * only backing up the seed itself, and must be backed up too (e.g. ensure you back up the whole dumpfile).
    * 
    * Arguments:
    * 1. filename    (string, required) The filename with path (absolute path recommended)
    * 
    * Result:
    * {                        (json object)
    *   "filename" : "str"     (string) The filename with full absolute path
    * }
    * 
    * Examples:
    * > bitcoin-cli dumpwallet "test"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "dumpwallet", "params": ["test"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object dumpwallet(Object filename) { return dumpwallet.invoke(filename); }

   /**
    * getbalances
    * Returns an object with all balances in BTC.
    * 
    * Result:
    * {                               (json object)
    *   "mine" : {                    (json object) balances from outputs that the wallet can sign
    *     "trusted" : n,              (numeric) trusted balance (outputs created by the wallet or confirmed outputs)
    *     "untrusted_pending" : n,    (numeric) untrusted pending balance (outputs created by others that are in the mempool)
    *     "immature" : n,             (numeric) balance from immature coinbase outputs
    *     "used" : n                  (numeric) (only present if avoid_reuse is set) balance from coins sent to addresses that were previously spent from (potentially privacy violating)
    *   },
    *   "watchonly" : {               (json object) watchonly balances (not present if wallet does not watch anything)
    *     "trusted" : n,              (numeric) trusted balance (outputs created by the wallet or confirmed outputs)
    *     "untrusted_pending" : n,    (numeric) untrusted pending balance (outputs created by others that are in the mempool)
    *     "immature" : n              (numeric) balance from immature coinbase outputs
    *   }
    * }
    * 
    * Examples:
    * > bitcoin-cli getbalances 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getbalances", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getbalances() { return getbalances.invoke(); }

   /**
    * generatetoaddress nblocks "address" ( maxtries )
    * 
    * Mine blocks immediately to a specified address (before the RPC call returns)
    * 
    * Arguments:
    * 1. nblocks     (numeric, required) How many blocks are generated immediately.
    * 2. address     (string, required) The address to send the newly generated bitcoin to.
    * 3. maxtries    (numeric, optional, default=1000000) How many iterations to try.
    * 
    * Result:
    * [           (json array) hashes of blocks generated
    *   "hex",    (string) blockhash
    *   ...
    * ]
    * 
    * Examples:
    * 
    * Generate 11 blocks to myaddress
    * > bitcoin-cli generatetoaddress 11 "myaddress"
    * If you are using the Bitcoin Core wallet, you can get a new address to send the newly generated bitcoin to with:
    * > bitcoin-cli getnewaddress 
    */
   public Object generatetoaddress(Object nblocks, Object address) { return generatetoaddress.invoke(nblocks, address); }


   /**
    * generatetoaddress nblocks "address" ( maxtries )
    * 
    * Mine blocks immediately to a specified address (before the RPC call returns)
    * 
    * Arguments:
    * 1. nblocks     (numeric, required) How many blocks are generated immediately.
    * 2. address     (string, required) The address to send the newly generated bitcoin to.
    * 3. maxtries    (numeric, optional, default=1000000) How many iterations to try.
    * 
    * Result:
    * [           (json array) hashes of blocks generated
    *   "hex",    (string) blockhash
    *   ...
    * ]
    * 
    * Examples:
    * 
    * Generate 11 blocks to myaddress
    * > bitcoin-cli generatetoaddress 11 "myaddress"
    * If you are using the Bitcoin Core wallet, you can get a new address to send the newly generated bitcoin to with:
    * > bitcoin-cli getnewaddress 
    */
   public Object generatetoaddress(Object nblocks, Object address, Object maxtries) { return generatetoaddress.invoke(nblocks, address, maxtries); }

   /**
    * getindexinfo ( "index_name" )
    * 
    * Returns the status of one or all available indices currently running in the node.
    * 
    * Arguments:
    * 1. index_name    (string, optional) Filter results for an index with a specific name.
    * 
    * Result:
    * {                               (json object)
    *   "name" : {                    (json object) The name of the index
    *     "synced" : true|false,      (boolean) Whether the index is synced or not
    *     "best_block_height" : n     (numeric) The block height to which the index is synced
    *   }
    * }
    * 
    * Examples:
    * > bitcoin-cli getindexinfo 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getindexinfo", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > bitcoin-cli getindexinfo txindex
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getindexinfo", "params": [txindex]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getindexinfo() { return getindexinfo.invoke(); }


   /**
    * getindexinfo ( "index_name" )
    * 
    * Returns the status of one or all available indices currently running in the node.
    * 
    * Arguments:
    * 1. index_name    (string, optional) Filter results for an index with a specific name.
    * 
    * Result:
    * {                               (json object)
    *   "name" : {                    (json object) The name of the index
    *     "synced" : true|false,      (boolean) Whether the index is synced or not
    *     "best_block_height" : n     (numeric) The block height to which the index is synced
    *   }
    * }
    * 
    * Examples:
    * > bitcoin-cli getindexinfo 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getindexinfo", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > bitcoin-cli getindexinfo txindex
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getindexinfo", "params": [txindex]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getindexinfo(Object index_name) { return getindexinfo.invoke(index_name); }

   /**
    * getrawtransaction "txid" ( verbose "blockhash" )
    * 
    * Return the raw transaction data.
    * 
    * By default this function only works for mempool transactions. When called with a blockhash
    * argument, getrawtransaction will return the transaction if the specified block is available and
    * the transaction is found in that block. When called without a blockhash argument, getrawtransaction
    * will return the transaction if it is in the mempool, or if -txindex is enabled and the transaction
    * is in a block in the blockchain.
    * 
    * Hint: Use gettransaction for wallet transactions.
    * 
    * If verbose is 'true', returns an Object with information about 'txid'.
    * If verbose is 'false' or omitted, returns a string that is serialized, hex-encoded data for 'txid'.
    * 
    * Arguments:
    * 1. txid         (string, required) The transaction id
    * 2. verbose      (boolean, optional, default=false) If false, return a string, otherwise return a json object
    * 3. blockhash    (string, optional) The block in which to look for the transaction
    * 
    * Result (if verbose is not set or set to false):
    * "str"    (string) The serialized, hex-encoded data for 'txid'
    * 
    * Result (if verbose is set to true):
    * {                                    (json object)
    *   "in_active_chain" : true|false,    (boolean) Whether specified block is in the active chain or not (only present with explicit "blockhash" argument)
    *   "hex" : "hex",                     (string) The serialized, hex-encoded data for 'txid'
    *   "txid" : "hex",                    (string) The transaction id (same as provided)
    *   "hash" : "hex",                    (string) The transaction hash (differs from txid for witness transactions)
    *   "size" : n,                        (numeric) The serialized transaction size
    *   "vsize" : n,                       (numeric) The virtual transaction size (differs from size for witness transactions)
    *   "weight" : n,                      (numeric) The transaction's weight (between vsize*4-3 and vsize*4)
    *   "version" : n,                     (numeric) The version
    *   "locktime" : xxx,                  (numeric) The lock time
    *   "vin" : [                          (json array)
    *     {                                (json object)
    *       "txid" : "hex",                (string) The transaction id
    *       "vout" : n,                    (numeric) The output number
    *       "scriptSig" : {                (json object) The script
    *         "asm" : "str",               (string) asm
    *         "hex" : "hex"                (string) hex
    *       },
    *       "sequence" : n,                (numeric) The script sequence number
    *       "txinwitness" : [              (json array)
    *         "hex",                       (string) hex-encoded witness data (if any)
    *         ...
    *       ]
    *     },
    *     ...
    *   ],
    *   "vout" : [                         (json array)
    *     {                                (json object)
    *       "value" : n,                   (numeric) The value in BTC
    *       "n" : n,                       (numeric) index
    *       "scriptPubKey" : {             (json object)
    *         "asm" : "str",               (string) the asm
    *         "hex" : "str",               (string) the hex
    *         "reqSigs" : n,               (numeric, optional) (DEPRECATED, returned only if config option -deprecatedrpc=addresses is passed) Number of required signatures
    *         "type" : "str",              (string) The type, eg 'pubkeyhash'
    *         "address" : "str",           (string, optional) bitcoin address (only if a well-defined address exists)
    *         "addresses" : [              (json array, optional) (DEPRECATED, returned only if config option -deprecatedrpc=addresses is passed) Array of bitcoin addresses
    *           "str",                     (string) bitcoin address
    *           ...
    *         ]
    *       }
    *     },
    *     ...
    *   ],
    *   "blockhash" : "hex",               (string) the block hash
    *   "confirmations" : n,               (numeric) The confirmations
    *   "blocktime" : xxx,                 (numeric) The block time expressed in UNIX epoch time
    *   "time" : n                         (numeric) Same as "blocktime"
    * }
    * 
    * Examples:
    * > bitcoin-cli getrawtransaction "mytxid"
    * > bitcoin-cli getrawtransaction "mytxid" true
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getrawtransaction", "params": ["mytxid", true]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > bitcoin-cli getrawtransaction "mytxid" false "myblockhash"
    * > bitcoin-cli getrawtransaction "mytxid" true "myblockhash"
    */
   public Object getrawtransaction(Object txid) { return getrawtransaction.invoke(txid); }


   /**
    * getrawtransaction "txid" ( verbose "blockhash" )
    * 
    * Return the raw transaction data.
    * 
    * By default this function only works for mempool transactions. When called with a blockhash
    * argument, getrawtransaction will return the transaction if the specified block is available and
    * the transaction is found in that block. When called without a blockhash argument, getrawtransaction
    * will return the transaction if it is in the mempool, or if -txindex is enabled and the transaction
    * is in a block in the blockchain.
    * 
    * Hint: Use gettransaction for wallet transactions.
    * 
    * If verbose is 'true', returns an Object with information about 'txid'.
    * If verbose is 'false' or omitted, returns a string that is serialized, hex-encoded data for 'txid'.
    * 
    * Arguments:
    * 1. txid         (string, required) The transaction id
    * 2. verbose      (boolean, optional, default=false) If false, return a string, otherwise return a json object
    * 3. blockhash    (string, optional) The block in which to look for the transaction
    * 
    * Result (if verbose is not set or set to false):
    * "str"    (string) The serialized, hex-encoded data for 'txid'
    * 
    * Result (if verbose is set to true):
    * {                                    (json object)
    *   "in_active_chain" : true|false,    (boolean) Whether specified block is in the active chain or not (only present with explicit "blockhash" argument)
    *   "hex" : "hex",                     (string) The serialized, hex-encoded data for 'txid'
    *   "txid" : "hex",                    (string) The transaction id (same as provided)
    *   "hash" : "hex",                    (string) The transaction hash (differs from txid for witness transactions)
    *   "size" : n,                        (numeric) The serialized transaction size
    *   "vsize" : n,                       (numeric) The virtual transaction size (differs from size for witness transactions)
    *   "weight" : n,                      (numeric) The transaction's weight (between vsize*4-3 and vsize*4)
    *   "version" : n,                     (numeric) The version
    *   "locktime" : xxx,                  (numeric) The lock time
    *   "vin" : [                          (json array)
    *     {                                (json object)
    *       "txid" : "hex",                (string) The transaction id
    *       "vout" : n,                    (numeric) The output number
    *       "scriptSig" : {                (json object) The script
    *         "asm" : "str",               (string) asm
    *         "hex" : "hex"                (string) hex
    *       },
    *       "sequence" : n,                (numeric) The script sequence number
    *       "txinwitness" : [              (json array)
    *         "hex",                       (string) hex-encoded witness data (if any)
    *         ...
    *       ]
    *     },
    *     ...
    *   ],
    *   "vout" : [                         (json array)
    *     {                                (json object)
    *       "value" : n,                   (numeric) The value in BTC
    *       "n" : n,                       (numeric) index
    *       "scriptPubKey" : {             (json object)
    *         "asm" : "str",               (string) the asm
    *         "hex" : "str",               (string) the hex
    *         "reqSigs" : n,               (numeric, optional) (DEPRECATED, returned only if config option -deprecatedrpc=addresses is passed) Number of required signatures
    *         "type" : "str",              (string) The type, eg 'pubkeyhash'
    *         "address" : "str",           (string, optional) bitcoin address (only if a well-defined address exists)
    *         "addresses" : [              (json array, optional) (DEPRECATED, returned only if config option -deprecatedrpc=addresses is passed) Array of bitcoin addresses
    *           "str",                     (string) bitcoin address
    *           ...
    *         ]
    *       }
    *     },
    *     ...
    *   ],
    *   "blockhash" : "hex",               (string) the block hash
    *   "confirmations" : n,               (numeric) The confirmations
    *   "blocktime" : xxx,                 (numeric) The block time expressed in UNIX epoch time
    *   "time" : n                         (numeric) Same as "blocktime"
    * }
    * 
    * Examples:
    * > bitcoin-cli getrawtransaction "mytxid"
    * > bitcoin-cli getrawtransaction "mytxid" true
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getrawtransaction", "params": ["mytxid", true]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > bitcoin-cli getrawtransaction "mytxid" false "myblockhash"
    * > bitcoin-cli getrawtransaction "mytxid" true "myblockhash"
    */
   public Object getrawtransaction(Object txid, Object verbose) { return getrawtransaction.invoke(txid, verbose); }


   /**
    * getrawtransaction "txid" ( verbose "blockhash" )
    * 
    * Return the raw transaction data.
    * 
    * By default this function only works for mempool transactions. When called with a blockhash
    * argument, getrawtransaction will return the transaction if the specified block is available and
    * the transaction is found in that block. When called without a blockhash argument, getrawtransaction
    * will return the transaction if it is in the mempool, or if -txindex is enabled and the transaction
    * is in a block in the blockchain.
    * 
    * Hint: Use gettransaction for wallet transactions.
    * 
    * If verbose is 'true', returns an Object with information about 'txid'.
    * If verbose is 'false' or omitted, returns a string that is serialized, hex-encoded data for 'txid'.
    * 
    * Arguments:
    * 1. txid         (string, required) The transaction id
    * 2. verbose      (boolean, optional, default=false) If false, return a string, otherwise return a json object
    * 3. blockhash    (string, optional) The block in which to look for the transaction
    * 
    * Result (if verbose is not set or set to false):
    * "str"    (string) The serialized, hex-encoded data for 'txid'
    * 
    * Result (if verbose is set to true):
    * {                                    (json object)
    *   "in_active_chain" : true|false,    (boolean) Whether specified block is in the active chain or not (only present with explicit "blockhash" argument)
    *   "hex" : "hex",                     (string) The serialized, hex-encoded data for 'txid'
    *   "txid" : "hex",                    (string) The transaction id (same as provided)
    *   "hash" : "hex",                    (string) The transaction hash (differs from txid for witness transactions)
    *   "size" : n,                        (numeric) The serialized transaction size
    *   "vsize" : n,                       (numeric) The virtual transaction size (differs from size for witness transactions)
    *   "weight" : n,                      (numeric) The transaction's weight (between vsize*4-3 and vsize*4)
    *   "version" : n,                     (numeric) The version
    *   "locktime" : xxx,                  (numeric) The lock time
    *   "vin" : [                          (json array)
    *     {                                (json object)
    *       "txid" : "hex",                (string) The transaction id
    *       "vout" : n,                    (numeric) The output number
    *       "scriptSig" : {                (json object) The script
    *         "asm" : "str",               (string) asm
    *         "hex" : "hex"                (string) hex
    *       },
    *       "sequence" : n,                (numeric) The script sequence number
    *       "txinwitness" : [              (json array)
    *         "hex",                       (string) hex-encoded witness data (if any)
    *         ...
    *       ]
    *     },
    *     ...
    *   ],
    *   "vout" : [                         (json array)
    *     {                                (json object)
    *       "value" : n,                   (numeric) The value in BTC
    *       "n" : n,                       (numeric) index
    *       "scriptPubKey" : {             (json object)
    *         "asm" : "str",               (string) the asm
    *         "hex" : "str",               (string) the hex
    *         "reqSigs" : n,               (numeric, optional) (DEPRECATED, returned only if config option -deprecatedrpc=addresses is passed) Number of required signatures
    *         "type" : "str",              (string) The type, eg 'pubkeyhash'
    *         "address" : "str",           (string, optional) bitcoin address (only if a well-defined address exists)
    *         "addresses" : [              (json array, optional) (DEPRECATED, returned only if config option -deprecatedrpc=addresses is passed) Array of bitcoin addresses
    *           "str",                     (string) bitcoin address
    *           ...
    *         ]
    *       }
    *     },
    *     ...
    *   ],
    *   "blockhash" : "hex",               (string) the block hash
    *   "confirmations" : n,               (numeric) The confirmations
    *   "blocktime" : xxx,                 (numeric) The block time expressed in UNIX epoch time
    *   "time" : n                         (numeric) Same as "blocktime"
    * }
    * 
    * Examples:
    * > bitcoin-cli getrawtransaction "mytxid"
    * > bitcoin-cli getrawtransaction "mytxid" true
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getrawtransaction", "params": ["mytxid", true]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > bitcoin-cli getrawtransaction "mytxid" false "myblockhash"
    * > bitcoin-cli getrawtransaction "mytxid" true "myblockhash"
    */
   public Object getrawtransaction(Object txid, Object verbose, Object blockhash) { return getrawtransaction.invoke(txid, verbose, blockhash); }

   /**
    * removeprunedfunds "txid"
    * 
    * Deletes the specified transaction from the wallet. Meant for use with pruned wallets and as a companion to importprunedfunds. This will affect wallet balances.
    * 
    * Arguments:
    * 1. txid    (string, required) The hex-encoded id of the transaction you are deleting
    * 
    * Result:
    * null    (json null)
    * 
    * Examples:
    * > bitcoin-cli removeprunedfunds "a8d0c0184dde994a09ec054286f1ce581bebf46446a512166eae7628734ea0a5"
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "removeprunedfunds", "params": ["a8d0c0184dde994a09ec054286f1ce581bebf46446a512166eae7628734ea0a5"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object removeprunedfunds(Object txid) { return removeprunedfunds.invoke(txid); }

   /**
    * getmempoolentry "txid"
    * 
    * Returns mempool data for given transaction
    * 
    * Arguments:
    * 1. txid    (string, required) The transaction id (must be in mempool)
    * 
    * Result:
    * {                                       (json object)
    *   "vsize" : n,                          (numeric) virtual transaction size as defined in BIP 141. This is different from actual serialized size for witness transactions as witness data is discounted.
    *   "weight" : n,                         (numeric) transaction weight as defined in BIP 141.
    *   "fee" : n,                            (numeric) transaction fee in BTC (DEPRECATED)
    *   "modifiedfee" : n,                    (numeric) transaction fee with fee deltas used for mining priority (DEPRECATED)
    *   "time" : xxx,                         (numeric) local time transaction entered pool in seconds since 1 Jan 1970 GMT
    *   "height" : n,                         (numeric) block height when transaction entered pool
    *   "descendantcount" : n,                (numeric) number of in-mempool descendant transactions (including this one)
    *   "descendantsize" : n,                 (numeric) virtual transaction size of in-mempool descendants (including this one)
    *   "descendantfees" : n,                 (numeric) modified fees (see above) of in-mempool descendants (including this one) (DEPRECATED)
    *   "ancestorcount" : n,                  (numeric) number of in-mempool ancestor transactions (including this one)
    *   "ancestorsize" : n,                   (numeric) virtual transaction size of in-mempool ancestors (including this one)
    *   "ancestorfees" : n,                   (numeric) modified fees (see above) of in-mempool ancestors (including this one) (DEPRECATED)
    *   "wtxid" : "hex",                      (string) hash of serialized transaction, including witness data
    *   "fees" : {                            (json object)
    *     "base" : n,                         (numeric) transaction fee in BTC
    *     "modified" : n,                     (numeric) transaction fee with fee deltas used for mining priority in BTC
    *     "ancestor" : n,                     (numeric) modified fees (see above) of in-mempool ancestors (including this one) in BTC
    *     "descendant" : n                    (numeric) modified fees (see above) of in-mempool descendants (including this one) in BTC
    *   },
    *   "depends" : [                         (json array) unconfirmed transactions used as inputs for this transaction
    *     "hex",                              (string) parent transaction id
    *     ...
    *   ],
    *   "spentby" : [                         (json array) unconfirmed transactions spending outputs from this transaction
    *     "hex",                              (string) child transaction id
    *     ...
    *   ],
    *   "bip125-replaceable" : true|false,    (boolean) Whether this transaction could be replaced due to BIP125 (replace-by-fee)
    *   "unbroadcast" : true|false            (boolean) Whether this transaction is currently unbroadcast (initial broadcast not yet acknowledged by any peers)
    * }
    * 
    * Examples:
    * > bitcoin-cli getmempoolentry "mytxid"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getmempoolentry", "params": ["mytxid"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getmempoolentry(Object txid) { return getmempoolentry.invoke(txid); }

   /**
    * walletcreatefundedpsbt ( [{"txid":"hex","vout":n,"sequence":n},...] ) [{"address":amount,...},{"data":"hex"},...] ( locktime options bip32derivs )
    * 
    * Creates and funds a transaction in the Partially Signed Transaction format.
    * Implements the Creator and Updater roles.
    * 
    * Arguments:
    * 1. inputs                             (json array, optional) Leave empty to add inputs automatically. See add_inputs option.
    *      [
    *        {                              (json object)
    *          "txid": "hex",               (string, required) The transaction id
    *          "vout": n,                   (numeric, required) The output number
    *          "sequence": n,               (numeric, optional, default=depends on the value of the 'locktime' and 'options.replaceable' arguments) The sequence number
    *        },
    *        ...
    *      ]
    * 2. outputs                            (json array, required) The outputs (key-value pairs), where none of the keys are duplicated.
    *                                       That is, each address can only appear once and there can only be one 'data' object.
    *                                       For compatibility reasons, a dictionary, which holds the key-value pairs directly, is also
    *                                       accepted as second parameter.
    *      [
    *        {                              (json object)
    *          "address": amount,           (numeric or string, required) A key-value pair. The key (string) is the bitcoin address, the value (float or string) is the amount in BTC
    *          ...
    *        },
    *        {                              (json object)
    *          "data": "hex",               (string, required) A key-value pair. The key must be "data", the value is hex-encoded data
    *        },
    *        ...
    *      ]
    * 3. locktime                           (numeric, optional, default=0) Raw locktime. Non-0 value also locktime-activates inputs
    * 4. options                            (json object, optional)
    *      {
    *        "add_inputs": bool,            (boolean, optional, default=false) If inputs are specified, automatically include more if they are not enough.
    *        "include_unsafe": bool,        (boolean, optional, default=false) Include inputs that are not safe to spend (unconfirmed transactions from outside keys and unconfirmed replacement transactions).
    *                                       Warning: the resulting transaction may become invalid if one of the unsafe inputs disappears.
    *                                       If that happens, you will need to fund the transaction with different inputs and republish it.
    *        "changeAddress": "hex",        (string, optional, default=pool address) The bitcoin address to receive the change
    *        "changePosition": n,           (numeric, optional, default=random) The index of the change output
    *        "change_type": "str",          (string, optional, default=set by -changetype) The output type to use. Only valid if changeAddress is not specified. Options are "legacy", "p2sh-segwit", and "bech32".
    *        "includeWatching": bool,       (boolean, optional, default=true for watch-only wallets, otherwise false) Also select inputs which are watch only
    *        "lockUnspents": bool,          (boolean, optional, default=false) Lock selected unspent outputs
    *        "fee_rate": amount,            (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    *        "feeRate": amount,             (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in BTC/kvB.
    *        "subtractFeeFromOutputs": [    (json array, optional, default=[]) The outputs to subtract the fee from.
    *                                       The fee will be equally deducted from the amount of each specified output.
    *                                       Those recipients will receive less bitcoins than you enter in their corresponding amount field.
    *                                       If no outputs are specified here, the sender pays the fee.
    *          vout_index,                  (numeric) The zero-based output index, before a change output is added.
    *          ...
    *        ],
    *        "replaceable": bool,           (boolean, optional, default=wallet default) Marks this transaction as BIP125 replaceable.
    *                                       Allows this transaction to be replaced by a transaction with higher fees
    *        "conf_target": n,              (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    *        "estimate_mode": "str",        (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                                       "unset"
    *                                       "economical"
    *                                       "conservative"
    *      }
    * 5. bip32derivs                        (boolean, optional, default=true) Include BIP 32 derivation paths for public keys if we know them
    * 
    * Result:
    * {                     (json object)
    *   "psbt" : "str",     (string) The resulting raw transaction (base64-encoded string)
    *   "fee" : n,          (numeric) Fee in BTC the resulting transaction pays
    *   "changepos" : n     (numeric) The position of the added change output, or -1
    * }
    * 
    * Examples:
    * 
    * Create a transaction with no inputs
    * > bitcoin-cli walletcreatefundedpsbt "[{\"txid\":\"myid\",\"vout\":0}]" "[{\"data\":\"00010203\"}]"
    */
   public Object walletcreatefundedpsbt(Object txid_vout_sequence, Object address_data) { return walletcreatefundedpsbt.invoke(txid_vout_sequence, address_data); }


   /**
    * walletcreatefundedpsbt ( [{"txid":"hex","vout":n,"sequence":n},...] ) [{"address":amount,...},{"data":"hex"},...] ( locktime options bip32derivs )
    * 
    * Creates and funds a transaction in the Partially Signed Transaction format.
    * Implements the Creator and Updater roles.
    * 
    * Arguments:
    * 1. inputs                             (json array, optional) Leave empty to add inputs automatically. See add_inputs option.
    *      [
    *        {                              (json object)
    *          "txid": "hex",               (string, required) The transaction id
    *          "vout": n,                   (numeric, required) The output number
    *          "sequence": n,               (numeric, optional, default=depends on the value of the 'locktime' and 'options.replaceable' arguments) The sequence number
    *        },
    *        ...
    *      ]
    * 2. outputs                            (json array, required) The outputs (key-value pairs), where none of the keys are duplicated.
    *                                       That is, each address can only appear once and there can only be one 'data' object.
    *                                       For compatibility reasons, a dictionary, which holds the key-value pairs directly, is also
    *                                       accepted as second parameter.
    *      [
    *        {                              (json object)
    *          "address": amount,           (numeric or string, required) A key-value pair. The key (string) is the bitcoin address, the value (float or string) is the amount in BTC
    *          ...
    *        },
    *        {                              (json object)
    *          "data": "hex",               (string, required) A key-value pair. The key must be "data", the value is hex-encoded data
    *        },
    *        ...
    *      ]
    * 3. locktime                           (numeric, optional, default=0) Raw locktime. Non-0 value also locktime-activates inputs
    * 4. options                            (json object, optional)
    *      {
    *        "add_inputs": bool,            (boolean, optional, default=false) If inputs are specified, automatically include more if they are not enough.
    *        "include_unsafe": bool,        (boolean, optional, default=false) Include inputs that are not safe to spend (unconfirmed transactions from outside keys and unconfirmed replacement transactions).
    *                                       Warning: the resulting transaction may become invalid if one of the unsafe inputs disappears.
    *                                       If that happens, you will need to fund the transaction with different inputs and republish it.
    *        "changeAddress": "hex",        (string, optional, default=pool address) The bitcoin address to receive the change
    *        "changePosition": n,           (numeric, optional, default=random) The index of the change output
    *        "change_type": "str",          (string, optional, default=set by -changetype) The output type to use. Only valid if changeAddress is not specified. Options are "legacy", "p2sh-segwit", and "bech32".
    *        "includeWatching": bool,       (boolean, optional, default=true for watch-only wallets, otherwise false) Also select inputs which are watch only
    *        "lockUnspents": bool,          (boolean, optional, default=false) Lock selected unspent outputs
    *        "fee_rate": amount,            (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    *        "feeRate": amount,             (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in BTC/kvB.
    *        "subtractFeeFromOutputs": [    (json array, optional, default=[]) The outputs to subtract the fee from.
    *                                       The fee will be equally deducted from the amount of each specified output.
    *                                       Those recipients will receive less bitcoins than you enter in their corresponding amount field.
    *                                       If no outputs are specified here, the sender pays the fee.
    *          vout_index,                  (numeric) The zero-based output index, before a change output is added.
    *          ...
    *        ],
    *        "replaceable": bool,           (boolean, optional, default=wallet default) Marks this transaction as BIP125 replaceable.
    *                                       Allows this transaction to be replaced by a transaction with higher fees
    *        "conf_target": n,              (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    *        "estimate_mode": "str",        (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                                       "unset"
    *                                       "economical"
    *                                       "conservative"
    *      }
    * 5. bip32derivs                        (boolean, optional, default=true) Include BIP 32 derivation paths for public keys if we know them
    * 
    * Result:
    * {                     (json object)
    *   "psbt" : "str",     (string) The resulting raw transaction (base64-encoded string)
    *   "fee" : n,          (numeric) Fee in BTC the resulting transaction pays
    *   "changepos" : n     (numeric) The position of the added change output, or -1
    * }
    * 
    * Examples:
    * 
    * Create a transaction with no inputs
    * > bitcoin-cli walletcreatefundedpsbt "[{\"txid\":\"myid\",\"vout\":0}]" "[{\"data\":\"00010203\"}]"
    */
   public Object walletcreatefundedpsbt(Object txid_vout_sequence, Object address_data, Object locktime) { return walletcreatefundedpsbt.invoke(txid_vout_sequence, address_data, locktime); }


   /**
    * walletcreatefundedpsbt ( [{"txid":"hex","vout":n,"sequence":n},...] ) [{"address":amount,...},{"data":"hex"},...] ( locktime options bip32derivs )
    * 
    * Creates and funds a transaction in the Partially Signed Transaction format.
    * Implements the Creator and Updater roles.
    * 
    * Arguments:
    * 1. inputs                             (json array, optional) Leave empty to add inputs automatically. See add_inputs option.
    *      [
    *        {                              (json object)
    *          "txid": "hex",               (string, required) The transaction id
    *          "vout": n,                   (numeric, required) The output number
    *          "sequence": n,               (numeric, optional, default=depends on the value of the 'locktime' and 'options.replaceable' arguments) The sequence number
    *        },
    *        ...
    *      ]
    * 2. outputs                            (json array, required) The outputs (key-value pairs), where none of the keys are duplicated.
    *                                       That is, each address can only appear once and there can only be one 'data' object.
    *                                       For compatibility reasons, a dictionary, which holds the key-value pairs directly, is also
    *                                       accepted as second parameter.
    *      [
    *        {                              (json object)
    *          "address": amount,           (numeric or string, required) A key-value pair. The key (string) is the bitcoin address, the value (float or string) is the amount in BTC
    *          ...
    *        },
    *        {                              (json object)
    *          "data": "hex",               (string, required) A key-value pair. The key must be "data", the value is hex-encoded data
    *        },
    *        ...
    *      ]
    * 3. locktime                           (numeric, optional, default=0) Raw locktime. Non-0 value also locktime-activates inputs
    * 4. options                            (json object, optional)
    *      {
    *        "add_inputs": bool,            (boolean, optional, default=false) If inputs are specified, automatically include more if they are not enough.
    *        "include_unsafe": bool,        (boolean, optional, default=false) Include inputs that are not safe to spend (unconfirmed transactions from outside keys and unconfirmed replacement transactions).
    *                                       Warning: the resulting transaction may become invalid if one of the unsafe inputs disappears.
    *                                       If that happens, you will need to fund the transaction with different inputs and republish it.
    *        "changeAddress": "hex",        (string, optional, default=pool address) The bitcoin address to receive the change
    *        "changePosition": n,           (numeric, optional, default=random) The index of the change output
    *        "change_type": "str",          (string, optional, default=set by -changetype) The output type to use. Only valid if changeAddress is not specified. Options are "legacy", "p2sh-segwit", and "bech32".
    *        "includeWatching": bool,       (boolean, optional, default=true for watch-only wallets, otherwise false) Also select inputs which are watch only
    *        "lockUnspents": bool,          (boolean, optional, default=false) Lock selected unspent outputs
    *        "fee_rate": amount,            (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    *        "feeRate": amount,             (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in BTC/kvB.
    *        "subtractFeeFromOutputs": [    (json array, optional, default=[]) The outputs to subtract the fee from.
    *                                       The fee will be equally deducted from the amount of each specified output.
    *                                       Those recipients will receive less bitcoins than you enter in their corresponding amount field.
    *                                       If no outputs are specified here, the sender pays the fee.
    *          vout_index,                  (numeric) The zero-based output index, before a change output is added.
    *          ...
    *        ],
    *        "replaceable": bool,           (boolean, optional, default=wallet default) Marks this transaction as BIP125 replaceable.
    *                                       Allows this transaction to be replaced by a transaction with higher fees
    *        "conf_target": n,              (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    *        "estimate_mode": "str",        (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                                       "unset"
    *                                       "economical"
    *                                       "conservative"
    *      }
    * 5. bip32derivs                        (boolean, optional, default=true) Include BIP 32 derivation paths for public keys if we know them
    * 
    * Result:
    * {                     (json object)
    *   "psbt" : "str",     (string) The resulting raw transaction (base64-encoded string)
    *   "fee" : n,          (numeric) Fee in BTC the resulting transaction pays
    *   "changepos" : n     (numeric) The position of the added change output, or -1
    * }
    * 
    * Examples:
    * 
    * Create a transaction with no inputs
    * > bitcoin-cli walletcreatefundedpsbt "[{\"txid\":\"myid\",\"vout\":0}]" "[{\"data\":\"00010203\"}]"
    */
   public Object walletcreatefundedpsbt(Object txid_vout_sequence, Object address_data, Object locktime, Object options) { return walletcreatefundedpsbt.invoke(txid_vout_sequence, address_data, locktime, options); }


   /**
    * walletcreatefundedpsbt ( [{"txid":"hex","vout":n,"sequence":n},...] ) [{"address":amount,...},{"data":"hex"},...] ( locktime options bip32derivs )
    * 
    * Creates and funds a transaction in the Partially Signed Transaction format.
    * Implements the Creator and Updater roles.
    * 
    * Arguments:
    * 1. inputs                             (json array, optional) Leave empty to add inputs automatically. See add_inputs option.
    *      [
    *        {                              (json object)
    *          "txid": "hex",               (string, required) The transaction id
    *          "vout": n,                   (numeric, required) The output number
    *          "sequence": n,               (numeric, optional, default=depends on the value of the 'locktime' and 'options.replaceable' arguments) The sequence number
    *        },
    *        ...
    *      ]
    * 2. outputs                            (json array, required) The outputs (key-value pairs), where none of the keys are duplicated.
    *                                       That is, each address can only appear once and there can only be one 'data' object.
    *                                       For compatibility reasons, a dictionary, which holds the key-value pairs directly, is also
    *                                       accepted as second parameter.
    *      [
    *        {                              (json object)
    *          "address": amount,           (numeric or string, required) A key-value pair. The key (string) is the bitcoin address, the value (float or string) is the amount in BTC
    *          ...
    *        },
    *        {                              (json object)
    *          "data": "hex",               (string, required) A key-value pair. The key must be "data", the value is hex-encoded data
    *        },
    *        ...
    *      ]
    * 3. locktime                           (numeric, optional, default=0) Raw locktime. Non-0 value also locktime-activates inputs
    * 4. options                            (json object, optional)
    *      {
    *        "add_inputs": bool,            (boolean, optional, default=false) If inputs are specified, automatically include more if they are not enough.
    *        "include_unsafe": bool,        (boolean, optional, default=false) Include inputs that are not safe to spend (unconfirmed transactions from outside keys and unconfirmed replacement transactions).
    *                                       Warning: the resulting transaction may become invalid if one of the unsafe inputs disappears.
    *                                       If that happens, you will need to fund the transaction with different inputs and republish it.
    *        "changeAddress": "hex",        (string, optional, default=pool address) The bitcoin address to receive the change
    *        "changePosition": n,           (numeric, optional, default=random) The index of the change output
    *        "change_type": "str",          (string, optional, default=set by -changetype) The output type to use. Only valid if changeAddress is not specified. Options are "legacy", "p2sh-segwit", and "bech32".
    *        "includeWatching": bool,       (boolean, optional, default=true for watch-only wallets, otherwise false) Also select inputs which are watch only
    *        "lockUnspents": bool,          (boolean, optional, default=false) Lock selected unspent outputs
    *        "fee_rate": amount,            (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    *        "feeRate": amount,             (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in BTC/kvB.
    *        "subtractFeeFromOutputs": [    (json array, optional, default=[]) The outputs to subtract the fee from.
    *                                       The fee will be equally deducted from the amount of each specified output.
    *                                       Those recipients will receive less bitcoins than you enter in their corresponding amount field.
    *                                       If no outputs are specified here, the sender pays the fee.
    *          vout_index,                  (numeric) The zero-based output index, before a change output is added.
    *          ...
    *        ],
    *        "replaceable": bool,           (boolean, optional, default=wallet default) Marks this transaction as BIP125 replaceable.
    *                                       Allows this transaction to be replaced by a transaction with higher fees
    *        "conf_target": n,              (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    *        "estimate_mode": "str",        (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                                       "unset"
    *                                       "economical"
    *                                       "conservative"
    *      }
    * 5. bip32derivs                        (boolean, optional, default=true) Include BIP 32 derivation paths for public keys if we know them
    * 
    * Result:
    * {                     (json object)
    *   "psbt" : "str",     (string) The resulting raw transaction (base64-encoded string)
    *   "fee" : n,          (numeric) Fee in BTC the resulting transaction pays
    *   "changepos" : n     (numeric) The position of the added change output, or -1
    * }
    * 
    * Examples:
    * 
    * Create a transaction with no inputs
    * > bitcoin-cli walletcreatefundedpsbt "[{\"txid\":\"myid\",\"vout\":0}]" "[{\"data\":\"00010203\"}]"
    */
   public Object walletcreatefundedpsbt(Object txid_vout_sequence, Object address_data, Object locktime, Object options, Object bip32derivs) { return walletcreatefundedpsbt.invoke(txid_vout_sequence, address_data, locktime, options, bip32derivs); }

   /**
    * joinpsbts ["psbt",...]
    * 
    * Joins multiple distinct PSBTs with different inputs and outputs into one PSBT with inputs and outputs from all of the PSBTs
    * No input in any of the PSBTs can be in more than one of the PSBTs.
    * 
    * Arguments:
    * 1. txs            (json array, required) The base64 strings of partially signed transactions
    *      [
    *        "psbt",    (string, required) A base64 string of a PSBT
    *        ...
    *      ]
    * 
    * Result:
    * "str"    (string) The base64-encoded partially signed transaction
    * 
    * Examples:
    * > bitcoin-cli joinpsbts "psbt"
    */
   public Object joinpsbts(Object psbts) { return joinpsbts.invoke(psbts); }

   /**
    * importwallet "filename"
    * 
    * Imports keys from a wallet dump file (see dumpwallet). Requires a new wallet backup to include imported keys.
    * Note: Use "getwalletinfo" to query the scanning progress.
    * 
    * Arguments:
    * 1. filename    (string, required) The wallet file
    * 
    * Result:
    * null    (json null)
    * 
    * Examples:
    * 
    * Dump the wallet
    * > bitcoin-cli dumpwallet "test"
    * 
    * Import the wallet
    * > bitcoin-cli importwallet "test"
    * 
    * Import using the json rpc call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "importwallet", "params": ["test"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object importwallet(Object filename) { return importwallet.invoke(filename); }

   /**
    * listwallets
    * Returns a list of currently loaded wallets.
    * For full information on the wallet, use "getwalletinfo"
    * 
    * Result:
    * [           (json array)
    *   "str",    (string) the wallet name
    *   ...
    * ]
    * 
    * Examples:
    * > bitcoin-cli listwallets 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listwallets", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object listwallets() { return listwallets.invoke(); }

   /**
    * send [{"address":amount,...},{"data":"hex"},...] ( conf_target "estimate_mode" fee_rate options )
    * 
    * EXPERIMENTAL warning: this call may be changed in future releases.
    * 
    * Send a transaction.
    * 
    * Arguments:
    * 1. outputs                               (json array, required) The outputs (key-value pairs), where none of the keys are duplicated.
    *                                          That is, each address can only appear once and there can only be one 'data' object.
    *                                          For convenience, a dictionary, which holds the key-value pairs directly, is also accepted.
    *      [
    *        {                                 (json object)
    *          "address": amount,              (numeric or string, required) A key-value pair. The key (string) is the bitcoin address, the value (float or string) is the amount in BTC
    *          ...
    *        },
    *        {                                 (json object)
    *          "data": "hex",                  (string, required) A key-value pair. The key must be "data", the value is hex-encoded data
    *        },
    *        ...
    *      ]
    * 2. conf_target                           (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    * 3. estimate_mode                         (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                                          "unset"
    *                                          "economical"
    *                                          "conservative"
    * 4. fee_rate                              (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    * 5. options                               (json object, optional)
    *      {
    *        "add_inputs": bool,               (boolean, optional, default=false) If inputs are specified, automatically include more if they are not enough.
    *        "include_unsafe": bool,           (boolean, optional, default=false) Include inputs that are not safe to spend (unconfirmed transactions from outside keys and unconfirmed replacement transactions).
    *                                          Warning: the resulting transaction may become invalid if one of the unsafe inputs disappears.
    *                                          If that happens, you will need to fund the transaction with different inputs and republish it.
    *        "add_to_wallet": bool,            (boolean, optional, default=true) When false, returns a serialized transaction which will not be added to the wallet or broadcast
    *        "change_address": "hex",          (string, optional, default=pool address) The bitcoin address to receive the change
    *        "change_position": n,             (numeric, optional, default=random) The index of the change output
    *        "change_type": "str",             (string, optional, default=set by -changetype) The output type to use. Only valid if change_address is not specified. Options are "legacy", "p2sh-segwit", and "bech32".
    *        "conf_target": n,                 (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    *        "estimate_mode": "str",           (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                                          "unset"
    *                                          "economical"
    *                                          "conservative"
    *        "fee_rate": amount,               (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    *        "include_watching": bool,         (boolean, optional, default=true for watch-only wallets, otherwise false) Also select inputs which are watch only.
    *                                          Only solvable inputs can be used. Watch-only destinations are solvable if the public key and/or output script was imported,
    *                                          e.g. with 'importpubkey' or 'importmulti' with the 'pubkeys' or 'desc' field.
    *        "inputs": [                       (json array, optional, default=[]) Specify inputs instead of adding them automatically. A JSON array of JSON objects
    *          "txid",                         (string, required) The transaction id
    *          vout,                           (numeric, required) The output number
    *          sequence,                       (numeric, required) The sequence number
    *          ...
    *        ],
    *        "locktime": n,                    (numeric, optional, default=0) Raw locktime. Non-0 value also locktime-activates inputs
    *        "lock_unspents": bool,            (boolean, optional, default=false) Lock selected unspent outputs
    *        "psbt": bool,                     (boolean, optional, default=automatic) Always return a PSBT, implies add_to_wallet=false.
    *        "subtract_fee_from_outputs": [    (json array, optional, default=[]) Outputs to subtract the fee from, specified as integer indices.
    *                                          The fee will be equally deducted from the amount of each specified output.
    *                                          Those recipients will receive less bitcoins than you enter in their corresponding amount field.
    *                                          If no outputs are specified here, the sender pays the fee.
    *          vout_index,                     (numeric) The zero-based output index, before a change output is added.
    *          ...
    *        ],
    *        "replaceable": bool,              (boolean, optional, default=wallet default) Marks this transaction as BIP125 replaceable.
    *                                          Allows this transaction to be replaced by a transaction with higher fees
    *      }
    * 
    * Result:
    * {                             (json object)
    *   "complete" : true|false,    (boolean) If the transaction has a complete set of signatures
    *   "txid" : "hex",             (string) The transaction id for the send. Only 1 transaction is created regardless of the number of addresses.
    *   "hex" : "hex",              (string) If add_to_wallet is false, the hex-encoded raw transaction with signature(s)
    *   "psbt" : "str"              (string) If more signatures are needed, or if add_to_wallet is false, the base64-encoded (partially) signed transaction
    * }
    * 
    * Examples:
    * 
    * Send 0.1 BTC with a confirmation target of 6 blocks in economical fee estimate mode
    * > bitcoin-cli send '{"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl": 0.1}' 6 economical
    * 
    * Send 0.2 BTC with a fee rate of 1.1 sat/vB using positional arguments
    * > bitcoin-cli send '{"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl": 0.2}' null "unset" 1.1
    * 
    * Send 0.2 BTC with a fee rate of 1 sat/vB using the options argument
    * > bitcoin-cli send '{"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl": 0.2}' null "unset" null '{"fee_rate": 1}'
    * 
    * Send 0.3 BTC with a fee rate of 25 sat/vB using named arguments
    * > bitcoin-cli -named send outputs='{"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl": 0.3}' fee_rate=25
    * 
    * Create a transaction that should confirm the next block, with a specific input, and return result without adding to wallet or broadcasting to the network
    * > bitcoin-cli send '{"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl": 0.1}' 1 economical '{"add_to_wallet": false, "inputs": [{"txid":"a08e6907dbbd3d809776dbfc5d82e371b764ed838b5655e72f463568df1aadf0", "vout":1}]}'
    */
   public Object send(Object address_datas) { return send.invoke(address_datas); }


   /**
    * send [{"address":amount,...},{"data":"hex"},...] ( conf_target "estimate_mode" fee_rate options )
    * 
    * EXPERIMENTAL warning: this call may be changed in future releases.
    * 
    * Send a transaction.
    * 
    * Arguments:
    * 1. outputs                               (json array, required) The outputs (key-value pairs), where none of the keys are duplicated.
    *                                          That is, each address can only appear once and there can only be one 'data' object.
    *                                          For convenience, a dictionary, which holds the key-value pairs directly, is also accepted.
    *      [
    *        {                                 (json object)
    *          "address": amount,              (numeric or string, required) A key-value pair. The key (string) is the bitcoin address, the value (float or string) is the amount in BTC
    *          ...
    *        },
    *        {                                 (json object)
    *          "data": "hex",                  (string, required) A key-value pair. The key must be "data", the value is hex-encoded data
    *        },
    *        ...
    *      ]
    * 2. conf_target                           (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    * 3. estimate_mode                         (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                                          "unset"
    *                                          "economical"
    *                                          "conservative"
    * 4. fee_rate                              (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    * 5. options                               (json object, optional)
    *      {
    *        "add_inputs": bool,               (boolean, optional, default=false) If inputs are specified, automatically include more if they are not enough.
    *        "include_unsafe": bool,           (boolean, optional, default=false) Include inputs that are not safe to spend (unconfirmed transactions from outside keys and unconfirmed replacement transactions).
    *                                          Warning: the resulting transaction may become invalid if one of the unsafe inputs disappears.
    *                                          If that happens, you will need to fund the transaction with different inputs and republish it.
    *        "add_to_wallet": bool,            (boolean, optional, default=true) When false, returns a serialized transaction which will not be added to the wallet or broadcast
    *        "change_address": "hex",          (string, optional, default=pool address) The bitcoin address to receive the change
    *        "change_position": n,             (numeric, optional, default=random) The index of the change output
    *        "change_type": "str",             (string, optional, default=set by -changetype) The output type to use. Only valid if change_address is not specified. Options are "legacy", "p2sh-segwit", and "bech32".
    *        "conf_target": n,                 (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    *        "estimate_mode": "str",           (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                                          "unset"
    *                                          "economical"
    *                                          "conservative"
    *        "fee_rate": amount,               (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    *        "include_watching": bool,         (boolean, optional, default=true for watch-only wallets, otherwise false) Also select inputs which are watch only.
    *                                          Only solvable inputs can be used. Watch-only destinations are solvable if the public key and/or output script was imported,
    *                                          e.g. with 'importpubkey' or 'importmulti' with the 'pubkeys' or 'desc' field.
    *        "inputs": [                       (json array, optional, default=[]) Specify inputs instead of adding them automatically. A JSON array of JSON objects
    *          "txid",                         (string, required) The transaction id
    *          vout,                           (numeric, required) The output number
    *          sequence,                       (numeric, required) The sequence number
    *          ...
    *        ],
    *        "locktime": n,                    (numeric, optional, default=0) Raw locktime. Non-0 value also locktime-activates inputs
    *        "lock_unspents": bool,            (boolean, optional, default=false) Lock selected unspent outputs
    *        "psbt": bool,                     (boolean, optional, default=automatic) Always return a PSBT, implies add_to_wallet=false.
    *        "subtract_fee_from_outputs": [    (json array, optional, default=[]) Outputs to subtract the fee from, specified as integer indices.
    *                                          The fee will be equally deducted from the amount of each specified output.
    *                                          Those recipients will receive less bitcoins than you enter in their corresponding amount field.
    *                                          If no outputs are specified here, the sender pays the fee.
    *          vout_index,                     (numeric) The zero-based output index, before a change output is added.
    *          ...
    *        ],
    *        "replaceable": bool,              (boolean, optional, default=wallet default) Marks this transaction as BIP125 replaceable.
    *                                          Allows this transaction to be replaced by a transaction with higher fees
    *      }
    * 
    * Result:
    * {                             (json object)
    *   "complete" : true|false,    (boolean) If the transaction has a complete set of signatures
    *   "txid" : "hex",             (string) The transaction id for the send. Only 1 transaction is created regardless of the number of addresses.
    *   "hex" : "hex",              (string) If add_to_wallet is false, the hex-encoded raw transaction with signature(s)
    *   "psbt" : "str"              (string) If more signatures are needed, or if add_to_wallet is false, the base64-encoded (partially) signed transaction
    * }
    * 
    * Examples:
    * 
    * Send 0.1 BTC with a confirmation target of 6 blocks in economical fee estimate mode
    * > bitcoin-cli send '{"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl": 0.1}' 6 economical
    * 
    * Send 0.2 BTC with a fee rate of 1.1 sat/vB using positional arguments
    * > bitcoin-cli send '{"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl": 0.2}' null "unset" 1.1
    * 
    * Send 0.2 BTC with a fee rate of 1 sat/vB using the options argument
    * > bitcoin-cli send '{"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl": 0.2}' null "unset" null '{"fee_rate": 1}'
    * 
    * Send 0.3 BTC with a fee rate of 25 sat/vB using named arguments
    * > bitcoin-cli -named send outputs='{"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl": 0.3}' fee_rate=25
    * 
    * Create a transaction that should confirm the next block, with a specific input, and return result without adding to wallet or broadcasting to the network
    * > bitcoin-cli send '{"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl": 0.1}' 1 economical '{"add_to_wallet": false, "inputs": [{"txid":"a08e6907dbbd3d809776dbfc5d82e371b764ed838b5655e72f463568df1aadf0", "vout":1}]}'
    */
   public Object send(Object address_datas, Object conf_target) { return send.invoke(address_datas, conf_target); }


   /**
    * send [{"address":amount,...},{"data":"hex"},...] ( conf_target "estimate_mode" fee_rate options )
    * 
    * EXPERIMENTAL warning: this call may be changed in future releases.
    * 
    * Send a transaction.
    * 
    * Arguments:
    * 1. outputs                               (json array, required) The outputs (key-value pairs), where none of the keys are duplicated.
    *                                          That is, each address can only appear once and there can only be one 'data' object.
    *                                          For convenience, a dictionary, which holds the key-value pairs directly, is also accepted.
    *      [
    *        {                                 (json object)
    *          "address": amount,              (numeric or string, required) A key-value pair. The key (string) is the bitcoin address, the value (float or string) is the amount in BTC
    *          ...
    *        },
    *        {                                 (json object)
    *          "data": "hex",                  (string, required) A key-value pair. The key must be "data", the value is hex-encoded data
    *        },
    *        ...
    *      ]
    * 2. conf_target                           (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    * 3. estimate_mode                         (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                                          "unset"
    *                                          "economical"
    *                                          "conservative"
    * 4. fee_rate                              (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    * 5. options                               (json object, optional)
    *      {
    *        "add_inputs": bool,               (boolean, optional, default=false) If inputs are specified, automatically include more if they are not enough.
    *        "include_unsafe": bool,           (boolean, optional, default=false) Include inputs that are not safe to spend (unconfirmed transactions from outside keys and unconfirmed replacement transactions).
    *                                          Warning: the resulting transaction may become invalid if one of the unsafe inputs disappears.
    *                                          If that happens, you will need to fund the transaction with different inputs and republish it.
    *        "add_to_wallet": bool,            (boolean, optional, default=true) When false, returns a serialized transaction which will not be added to the wallet or broadcast
    *        "change_address": "hex",          (string, optional, default=pool address) The bitcoin address to receive the change
    *        "change_position": n,             (numeric, optional, default=random) The index of the change output
    *        "change_type": "str",             (string, optional, default=set by -changetype) The output type to use. Only valid if change_address is not specified. Options are "legacy", "p2sh-segwit", and "bech32".
    *        "conf_target": n,                 (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    *        "estimate_mode": "str",           (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                                          "unset"
    *                                          "economical"
    *                                          "conservative"
    *        "fee_rate": amount,               (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    *        "include_watching": bool,         (boolean, optional, default=true for watch-only wallets, otherwise false) Also select inputs which are watch only.
    *                                          Only solvable inputs can be used. Watch-only destinations are solvable if the public key and/or output script was imported,
    *                                          e.g. with 'importpubkey' or 'importmulti' with the 'pubkeys' or 'desc' field.
    *        "inputs": [                       (json array, optional, default=[]) Specify inputs instead of adding them automatically. A JSON array of JSON objects
    *          "txid",                         (string, required) The transaction id
    *          vout,                           (numeric, required) The output number
    *          sequence,                       (numeric, required) The sequence number
    *          ...
    *        ],
    *        "locktime": n,                    (numeric, optional, default=0) Raw locktime. Non-0 value also locktime-activates inputs
    *        "lock_unspents": bool,            (boolean, optional, default=false) Lock selected unspent outputs
    *        "psbt": bool,                     (boolean, optional, default=automatic) Always return a PSBT, implies add_to_wallet=false.
    *        "subtract_fee_from_outputs": [    (json array, optional, default=[]) Outputs to subtract the fee from, specified as integer indices.
    *                                          The fee will be equally deducted from the amount of each specified output.
    *                                          Those recipients will receive less bitcoins than you enter in their corresponding amount field.
    *                                          If no outputs are specified here, the sender pays the fee.
    *          vout_index,                     (numeric) The zero-based output index, before a change output is added.
    *          ...
    *        ],
    *        "replaceable": bool,              (boolean, optional, default=wallet default) Marks this transaction as BIP125 replaceable.
    *                                          Allows this transaction to be replaced by a transaction with higher fees
    *      }
    * 
    * Result:
    * {                             (json object)
    *   "complete" : true|false,    (boolean) If the transaction has a complete set of signatures
    *   "txid" : "hex",             (string) The transaction id for the send. Only 1 transaction is created regardless of the number of addresses.
    *   "hex" : "hex",              (string) If add_to_wallet is false, the hex-encoded raw transaction with signature(s)
    *   "psbt" : "str"              (string) If more signatures are needed, or if add_to_wallet is false, the base64-encoded (partially) signed transaction
    * }
    * 
    * Examples:
    * 
    * Send 0.1 BTC with a confirmation target of 6 blocks in economical fee estimate mode
    * > bitcoin-cli send '{"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl": 0.1}' 6 economical
    * 
    * Send 0.2 BTC with a fee rate of 1.1 sat/vB using positional arguments
    * > bitcoin-cli send '{"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl": 0.2}' null "unset" 1.1
    * 
    * Send 0.2 BTC with a fee rate of 1 sat/vB using the options argument
    * > bitcoin-cli send '{"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl": 0.2}' null "unset" null '{"fee_rate": 1}'
    * 
    * Send 0.3 BTC with a fee rate of 25 sat/vB using named arguments
    * > bitcoin-cli -named send outputs='{"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl": 0.3}' fee_rate=25
    * 
    * Create a transaction that should confirm the next block, with a specific input, and return result without adding to wallet or broadcasting to the network
    * > bitcoin-cli send '{"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl": 0.1}' 1 economical '{"add_to_wallet": false, "inputs": [{"txid":"a08e6907dbbd3d809776dbfc5d82e371b764ed838b5655e72f463568df1aadf0", "vout":1}]}'
    */
   public Object send(Object address_datas, Object conf_target, Object estimate_mode) { return send.invoke(address_datas, conf_target, estimate_mode); }


   /**
    * send [{"address":amount,...},{"data":"hex"},...] ( conf_target "estimate_mode" fee_rate options )
    * 
    * EXPERIMENTAL warning: this call may be changed in future releases.
    * 
    * Send a transaction.
    * 
    * Arguments:
    * 1. outputs                               (json array, required) The outputs (key-value pairs), where none of the keys are duplicated.
    *                                          That is, each address can only appear once and there can only be one 'data' object.
    *                                          For convenience, a dictionary, which holds the key-value pairs directly, is also accepted.
    *      [
    *        {                                 (json object)
    *          "address": amount,              (numeric or string, required) A key-value pair. The key (string) is the bitcoin address, the value (float or string) is the amount in BTC
    *          ...
    *        },
    *        {                                 (json object)
    *          "data": "hex",                  (string, required) A key-value pair. The key must be "data", the value is hex-encoded data
    *        },
    *        ...
    *      ]
    * 2. conf_target                           (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    * 3. estimate_mode                         (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                                          "unset"
    *                                          "economical"
    *                                          "conservative"
    * 4. fee_rate                              (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    * 5. options                               (json object, optional)
    *      {
    *        "add_inputs": bool,               (boolean, optional, default=false) If inputs are specified, automatically include more if they are not enough.
    *        "include_unsafe": bool,           (boolean, optional, default=false) Include inputs that are not safe to spend (unconfirmed transactions from outside keys and unconfirmed replacement transactions).
    *                                          Warning: the resulting transaction may become invalid if one of the unsafe inputs disappears.
    *                                          If that happens, you will need to fund the transaction with different inputs and republish it.
    *        "add_to_wallet": bool,            (boolean, optional, default=true) When false, returns a serialized transaction which will not be added to the wallet or broadcast
    *        "change_address": "hex",          (string, optional, default=pool address) The bitcoin address to receive the change
    *        "change_position": n,             (numeric, optional, default=random) The index of the change output
    *        "change_type": "str",             (string, optional, default=set by -changetype) The output type to use. Only valid if change_address is not specified. Options are "legacy", "p2sh-segwit", and "bech32".
    *        "conf_target": n,                 (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    *        "estimate_mode": "str",           (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                                          "unset"
    *                                          "economical"
    *                                          "conservative"
    *        "fee_rate": amount,               (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    *        "include_watching": bool,         (boolean, optional, default=true for watch-only wallets, otherwise false) Also select inputs which are watch only.
    *                                          Only solvable inputs can be used. Watch-only destinations are solvable if the public key and/or output script was imported,
    *                                          e.g. with 'importpubkey' or 'importmulti' with the 'pubkeys' or 'desc' field.
    *        "inputs": [                       (json array, optional, default=[]) Specify inputs instead of adding them automatically. A JSON array of JSON objects
    *          "txid",                         (string, required) The transaction id
    *          vout,                           (numeric, required) The output number
    *          sequence,                       (numeric, required) The sequence number
    *          ...
    *        ],
    *        "locktime": n,                    (numeric, optional, default=0) Raw locktime. Non-0 value also locktime-activates inputs
    *        "lock_unspents": bool,            (boolean, optional, default=false) Lock selected unspent outputs
    *        "psbt": bool,                     (boolean, optional, default=automatic) Always return a PSBT, implies add_to_wallet=false.
    *        "subtract_fee_from_outputs": [    (json array, optional, default=[]) Outputs to subtract the fee from, specified as integer indices.
    *                                          The fee will be equally deducted from the amount of each specified output.
    *                                          Those recipients will receive less bitcoins than you enter in their corresponding amount field.
    *                                          If no outputs are specified here, the sender pays the fee.
    *          vout_index,                     (numeric) The zero-based output index, before a change output is added.
    *          ...
    *        ],
    *        "replaceable": bool,              (boolean, optional, default=wallet default) Marks this transaction as BIP125 replaceable.
    *                                          Allows this transaction to be replaced by a transaction with higher fees
    *      }
    * 
    * Result:
    * {                             (json object)
    *   "complete" : true|false,    (boolean) If the transaction has a complete set of signatures
    *   "txid" : "hex",             (string) The transaction id for the send. Only 1 transaction is created regardless of the number of addresses.
    *   "hex" : "hex",              (string) If add_to_wallet is false, the hex-encoded raw transaction with signature(s)
    *   "psbt" : "str"              (string) If more signatures are needed, or if add_to_wallet is false, the base64-encoded (partially) signed transaction
    * }
    * 
    * Examples:
    * 
    * Send 0.1 BTC with a confirmation target of 6 blocks in economical fee estimate mode
    * > bitcoin-cli send '{"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl": 0.1}' 6 economical
    * 
    * Send 0.2 BTC with a fee rate of 1.1 sat/vB using positional arguments
    * > bitcoin-cli send '{"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl": 0.2}' null "unset" 1.1
    * 
    * Send 0.2 BTC with a fee rate of 1 sat/vB using the options argument
    * > bitcoin-cli send '{"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl": 0.2}' null "unset" null '{"fee_rate": 1}'
    * 
    * Send 0.3 BTC with a fee rate of 25 sat/vB using named arguments
    * > bitcoin-cli -named send outputs='{"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl": 0.3}' fee_rate=25
    * 
    * Create a transaction that should confirm the next block, with a specific input, and return result without adding to wallet or broadcasting to the network
    * > bitcoin-cli send '{"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl": 0.1}' 1 economical '{"add_to_wallet": false, "inputs": [{"txid":"a08e6907dbbd3d809776dbfc5d82e371b764ed838b5655e72f463568df1aadf0", "vout":1}]}'
    */
   public Object send(Object address_datas, Object conf_target, Object estimate_mode, Object fee_rate) { return send.invoke(address_datas, conf_target, estimate_mode, fee_rate); }


   /**
    * send [{"address":amount,...},{"data":"hex"},...] ( conf_target "estimate_mode" fee_rate options )
    * 
    * EXPERIMENTAL warning: this call may be changed in future releases.
    * 
    * Send a transaction.
    * 
    * Arguments:
    * 1. outputs                               (json array, required) The outputs (key-value pairs), where none of the keys are duplicated.
    *                                          That is, each address can only appear once and there can only be one 'data' object.
    *                                          For convenience, a dictionary, which holds the key-value pairs directly, is also accepted.
    *      [
    *        {                                 (json object)
    *          "address": amount,              (numeric or string, required) A key-value pair. The key (string) is the bitcoin address, the value (float or string) is the amount in BTC
    *          ...
    *        },
    *        {                                 (json object)
    *          "data": "hex",                  (string, required) A key-value pair. The key must be "data", the value is hex-encoded data
    *        },
    *        ...
    *      ]
    * 2. conf_target                           (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    * 3. estimate_mode                         (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                                          "unset"
    *                                          "economical"
    *                                          "conservative"
    * 4. fee_rate                              (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    * 5. options                               (json object, optional)
    *      {
    *        "add_inputs": bool,               (boolean, optional, default=false) If inputs are specified, automatically include more if they are not enough.
    *        "include_unsafe": bool,           (boolean, optional, default=false) Include inputs that are not safe to spend (unconfirmed transactions from outside keys and unconfirmed replacement transactions).
    *                                          Warning: the resulting transaction may become invalid if one of the unsafe inputs disappears.
    *                                          If that happens, you will need to fund the transaction with different inputs and republish it.
    *        "add_to_wallet": bool,            (boolean, optional, default=true) When false, returns a serialized transaction which will not be added to the wallet or broadcast
    *        "change_address": "hex",          (string, optional, default=pool address) The bitcoin address to receive the change
    *        "change_position": n,             (numeric, optional, default=random) The index of the change output
    *        "change_type": "str",             (string, optional, default=set by -changetype) The output type to use. Only valid if change_address is not specified. Options are "legacy", "p2sh-segwit", and "bech32".
    *        "conf_target": n,                 (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    *        "estimate_mode": "str",           (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                                          "unset"
    *                                          "economical"
    *                                          "conservative"
    *        "fee_rate": amount,               (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    *        "include_watching": bool,         (boolean, optional, default=true for watch-only wallets, otherwise false) Also select inputs which are watch only.
    *                                          Only solvable inputs can be used. Watch-only destinations are solvable if the public key and/or output script was imported,
    *                                          e.g. with 'importpubkey' or 'importmulti' with the 'pubkeys' or 'desc' field.
    *        "inputs": [                       (json array, optional, default=[]) Specify inputs instead of adding them automatically. A JSON array of JSON objects
    *          "txid",                         (string, required) The transaction id
    *          vout,                           (numeric, required) The output number
    *          sequence,                       (numeric, required) The sequence number
    *          ...
    *        ],
    *        "locktime": n,                    (numeric, optional, default=0) Raw locktime. Non-0 value also locktime-activates inputs
    *        "lock_unspents": bool,            (boolean, optional, default=false) Lock selected unspent outputs
    *        "psbt": bool,                     (boolean, optional, default=automatic) Always return a PSBT, implies add_to_wallet=false.
    *        "subtract_fee_from_outputs": [    (json array, optional, default=[]) Outputs to subtract the fee from, specified as integer indices.
    *                                          The fee will be equally deducted from the amount of each specified output.
    *                                          Those recipients will receive less bitcoins than you enter in their corresponding amount field.
    *                                          If no outputs are specified here, the sender pays the fee.
    *          vout_index,                     (numeric) The zero-based output index, before a change output is added.
    *          ...
    *        ],
    *        "replaceable": bool,              (boolean, optional, default=wallet default) Marks this transaction as BIP125 replaceable.
    *                                          Allows this transaction to be replaced by a transaction with higher fees
    *      }
    * 
    * Result:
    * {                             (json object)
    *   "complete" : true|false,    (boolean) If the transaction has a complete set of signatures
    *   "txid" : "hex",             (string) The transaction id for the send. Only 1 transaction is created regardless of the number of addresses.
    *   "hex" : "hex",              (string) If add_to_wallet is false, the hex-encoded raw transaction with signature(s)
    *   "psbt" : "str"              (string) If more signatures are needed, or if add_to_wallet is false, the base64-encoded (partially) signed transaction
    * }
    * 
    * Examples:
    * 
    * Send 0.1 BTC with a confirmation target of 6 blocks in economical fee estimate mode
    * > bitcoin-cli send '{"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl": 0.1}' 6 economical
    * 
    * Send 0.2 BTC with a fee rate of 1.1 sat/vB using positional arguments
    * > bitcoin-cli send '{"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl": 0.2}' null "unset" 1.1
    * 
    * Send 0.2 BTC with a fee rate of 1 sat/vB using the options argument
    * > bitcoin-cli send '{"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl": 0.2}' null "unset" null '{"fee_rate": 1}'
    * 
    * Send 0.3 BTC with a fee rate of 25 sat/vB using named arguments
    * > bitcoin-cli -named send outputs='{"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl": 0.3}' fee_rate=25
    * 
    * Create a transaction that should confirm the next block, with a specific input, and return result without adding to wallet or broadcasting to the network
    * > bitcoin-cli send '{"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl": 0.1}' 1 economical '{"add_to_wallet": false, "inputs": [{"txid":"a08e6907dbbd3d809776dbfc5d82e371b764ed838b5655e72f463568df1aadf0", "vout":1}]}'
    */
   public Object send(Object address_datas, Object conf_target, Object estimate_mode, Object fee_rate, Object options) { return send.invoke(address_datas, conf_target, estimate_mode, fee_rate, options); }

   /**
    * getaddednodeinfo ( "node" )
    * 
    * Returns information about the given added node, or all added nodes
    * (note that onetry addnodes are not listed here)
    * 
    * Arguments:
    * 1. node    (string, optional, default=all nodes) If provided, return information about this specific node, otherwise all nodes are returned.
    * 
    * Result:
    * [                                (json array)
    *   {                              (json object)
    *     "addednode" : "str",         (string) The node IP address or name (as provided to addnode)
    *     "connected" : true|false,    (boolean) If connected
    *     "addresses" : [              (json array) Only when connected = true
    *       {                          (json object)
    *         "address" : "str",       (string) The bitcoin server IP and port we're connected to
    *         "connected" : "str"      (string) connection, inbound or outbound
    *       },
    *       ...
    *     ]
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * > bitcoin-cli getaddednodeinfo "192.168.0.201"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getaddednodeinfo", "params": ["192.168.0.201"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getaddednodeinfo() { return getaddednodeinfo.invoke(); }


   /**
    * getaddednodeinfo ( "node" )
    * 
    * Returns information about the given added node, or all added nodes
    * (note that onetry addnodes are not listed here)
    * 
    * Arguments:
    * 1. node    (string, optional, default=all nodes) If provided, return information about this specific node, otherwise all nodes are returned.
    * 
    * Result:
    * [                                (json array)
    *   {                              (json object)
    *     "addednode" : "str",         (string) The node IP address or name (as provided to addnode)
    *     "connected" : true|false,    (boolean) If connected
    *     "addresses" : [              (json array) Only when connected = true
    *       {                          (json object)
    *         "address" : "str",       (string) The bitcoin server IP and port we're connected to
    *         "connected" : "str"      (string) connection, inbound or outbound
    *       },
    *       ...
    *     ]
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * > bitcoin-cli getaddednodeinfo "192.168.0.201"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getaddednodeinfo", "params": ["192.168.0.201"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getaddednodeinfo(Object node) { return getaddednodeinfo.invoke(node); }

   /**
    * getblockhash height
    * 
    * Returns hash of block in best-block-chain at height provided.
    * 
    * Arguments:
    * 1. height    (numeric, required) The height index
    * 
    * Result:
    * "hex"    (string) The block hash
    * 
    * Examples:
    * > bitcoin-cli getblockhash 1000
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getblockhash", "params": [1000]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getblockhash(Object index) { return getblockhash.invoke(index); }

   /**
    * verifytxoutproof "proof"
    * 
    * Verifies that a proof points to a transaction in a block, returning the transaction it commits to
    * and throwing an RPC error if the block is not in our best chain
    * 
    * Arguments:
    * 1. proof    (string, required) The hex-encoded proof generated by gettxoutproof
    * 
    * Result:
    * [           (json array)
    *   "hex",    (string) The txid(s) which the proof commits to, or empty array if the proof can not be validated.
    *   ...
    * ]
    */
   public Object verifytxoutproof(Object proof) { return verifytxoutproof.invoke(proof); }

   /**
    * generateblock "output" ["rawtx/txid",...]
    * 
    * Mine a block with a set of ordered transactions immediately to a specified address or descriptor (before the RPC call returns)
    * 
    * Arguments:
    * 1. output               (string, required) The address or descriptor to send the newly generated bitcoin to.
    * 2. transactions         (json array, required) An array of hex strings which are either txids or raw transactions.
    *                         Txids must reference transactions currently in the mempool.
    *                         All transactions must be valid and in valid order, otherwise the block will be rejected.
    *      [
    *        "rawtx/txid",    (string)
    *        ...
    *      ]
    * 
    * Result:
    * {                    (json object)
    *   "hash" : "hex"     (string) hash of generated block
    * }
    * 
    * Examples:
    * 
    * Generate a block to myaddress, with txs rawtx and mempool_txid
    * > bitcoin-cli generateblock "myaddress" '["rawtx", "mempool_txid"]'
    */
   public Object generateblock(Object output, Object rawtx_txid) { return generateblock.invoke(output, rawtx_txid); }

   /**
    * getbestblockhash
    * 
    * Returns the hash of the best (tip) block in the most-work fully-validated chain.
    * 
    * Result:
    * "hex"    (string) the block hash, hex-encoded
    * 
    * Examples:
    * > bitcoin-cli getbestblockhash 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getbestblockhash", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getbestblockhash() { return getbestblockhash.invoke(); }

   /**
    * psbtbumpfee "txid" ( options )
    * 
    * Bumps the fee of an opt-in-RBF transaction T, replacing it with a new transaction B.
    * Returns a PSBT instead of creating and signing a new transaction.
    * An opt-in RBF transaction with the given txid must be in the wallet.
    * The command will pay the additional fee by reducing change outputs or adding inputs when necessary.
    * It may add a new change output if one does not already exist.
    * All inputs in the original transaction will be included in the replacement transaction.
    * The command will fail if the wallet or mempool contains a transaction that spends one of T's outputs.
    * By default, the new fee will be calculated automatically using the estimatesmartfee RPC.
    * The user can specify a confirmation target for estimatesmartfee.
    * Alternatively, the user can specify a fee rate in sat/vB for the new transaction.
    * At a minimum, the new fee rate must be high enough to pay an additional new relay fee (incrementalfee
    * returned by getnetworkinfo) to enter the node's mempool.
    * * WARNING: before version 0.21, fee_rate was in BTC/kvB. As of 0.21, fee_rate is in sat/vB. *
    * 
    * Arguments:
    * 1. txid                           (string, required) The txid to be bumped
    * 2. options                        (json object, optional)
    *      {
    *        "conf_target": n,          (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    *                                   
    *        "fee_rate": amount,        (numeric or string, optional, default=not set, fall back to wallet fee estimation) 
    *                                   Specify a fee rate in sat/vB instead of relying on the built-in fee estimator.
    *                                   Must be at least 1.000 sat/vB higher than the current transaction fee rate.
    *                                   WARNING: before version 0.21, fee_rate was in BTC/kvB. As of 0.21, fee_rate is in sat/vB.
    *                                   
    *        "replaceable": bool,       (boolean, optional, default=true) Whether the new transaction should still be
    *                                   marked bip-125 replaceable. If true, the sequence numbers in the transaction will
    *                                   be left unchanged from the original. If false, any input sequence numbers in the
    *                                   original transaction that were less than 0xfffffffe will be increased to 0xfffffffe
    *                                   so the new transaction will not be explicitly bip-125 replaceable (though it may
    *                                   still be replaceable in practice, for example if it has unconfirmed ancestors which
    *                                   are replaceable).
    *                                   
    *        "estimate_mode": "str",    (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                                   "unset"
    *                                   "economical"
    *                                   "conservative"
    *      }
    * 
    * Result:
    * {                    (json object)
    *   "psbt" : "str",    (string) The base64-encoded unsigned PSBT of the new transaction.
    *   "origfee" : n,     (numeric) The fee of the replaced transaction.
    *   "fee" : n,         (numeric) The fee of the new transaction.
    *   "errors" : [       (json array) Errors encountered during processing (may be empty).
    *     "str",           (string)
    *     ...
    *   ]
    * }
    * 
    * Examples:
    * 
    * Bump the fee, get the new transaction's psbt
    * > bitcoin-cli psbtbumpfee <txid>
    */
   public Object psbtbumpfee(Object txid) { return psbtbumpfee.invoke(txid); }


   /**
    * psbtbumpfee "txid" ( options )
    * 
    * Bumps the fee of an opt-in-RBF transaction T, replacing it with a new transaction B.
    * Returns a PSBT instead of creating and signing a new transaction.
    * An opt-in RBF transaction with the given txid must be in the wallet.
    * The command will pay the additional fee by reducing change outputs or adding inputs when necessary.
    * It may add a new change output if one does not already exist.
    * All inputs in the original transaction will be included in the replacement transaction.
    * The command will fail if the wallet or mempool contains a transaction that spends one of T's outputs.
    * By default, the new fee will be calculated automatically using the estimatesmartfee RPC.
    * The user can specify a confirmation target for estimatesmartfee.
    * Alternatively, the user can specify a fee rate in sat/vB for the new transaction.
    * At a minimum, the new fee rate must be high enough to pay an additional new relay fee (incrementalfee
    * returned by getnetworkinfo) to enter the node's mempool.
    * * WARNING: before version 0.21, fee_rate was in BTC/kvB. As of 0.21, fee_rate is in sat/vB. *
    * 
    * Arguments:
    * 1. txid                           (string, required) The txid to be bumped
    * 2. options                        (json object, optional)
    *      {
    *        "conf_target": n,          (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    *                                   
    *        "fee_rate": amount,        (numeric or string, optional, default=not set, fall back to wallet fee estimation) 
    *                                   Specify a fee rate in sat/vB instead of relying on the built-in fee estimator.
    *                                   Must be at least 1.000 sat/vB higher than the current transaction fee rate.
    *                                   WARNING: before version 0.21, fee_rate was in BTC/kvB. As of 0.21, fee_rate is in sat/vB.
    *                                   
    *        "replaceable": bool,       (boolean, optional, default=true) Whether the new transaction should still be
    *                                   marked bip-125 replaceable. If true, the sequence numbers in the transaction will
    *                                   be left unchanged from the original. If false, any input sequence numbers in the
    *                                   original transaction that were less than 0xfffffffe will be increased to 0xfffffffe
    *                                   so the new transaction will not be explicitly bip-125 replaceable (though it may
    *                                   still be replaceable in practice, for example if it has unconfirmed ancestors which
    *                                   are replaceable).
    *                                   
    *        "estimate_mode": "str",    (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                                   "unset"
    *                                   "economical"
    *                                   "conservative"
    *      }
    * 
    * Result:
    * {                    (json object)
    *   "psbt" : "str",    (string) The base64-encoded unsigned PSBT of the new transaction.
    *   "origfee" : n,     (numeric) The fee of the replaced transaction.
    *   "fee" : n,         (numeric) The fee of the new transaction.
    *   "errors" : [       (json array) Errors encountered during processing (may be empty).
    *     "str",           (string)
    *     ...
    *   ]
    * }
    * 
    * Examples:
    * 
    * Bump the fee, get the new transaction's psbt
    * > bitcoin-cli psbtbumpfee <txid>
    */
   public Object psbtbumpfee(Object txid, Object options) { return psbtbumpfee.invoke(txid, options); }

   /**
    * walletpassphrasechange "oldpassphrase" "newpassphrase"
    * 
    * Changes the wallet passphrase from 'oldpassphrase' to 'newpassphrase'.
    * 
    * Arguments:
    * 1. oldpassphrase    (string, required) The current passphrase
    * 2. newpassphrase    (string, required) The new passphrase
    * 
    * Result:
    * null    (json null)
    * 
    * Examples:
    * > bitcoin-cli walletpassphrasechange "old one" "new one"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "walletpassphrasechange", "params": ["old one", "new one"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object walletpassphrasechange(Object oldpassphrase, Object newpassphrase) { return walletpassphrasechange.invoke(oldpassphrase, newpassphrase); }

   /**
    * ping
    * 
    * Requests that a ping be sent to all other nodes, to measure ping time.
    * Results provided in getpeerinfo, pingtime and pingwait fields are decimal seconds.
    * Ping command is handled in queue with all other commands, so it measures processing backlog, not just network ping.
    * 
    * Result:
    * null    (json null)
    * 
    * Examples:
    * > bitcoin-cli ping 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "ping", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object ping() { return ping.invoke(); }

   /**
    * createmultisig nrequired ["key",...] ( "address_type" )
    * 
    * Creates a multi-signature address with n signature of m keys required.
    * It returns a json object with the address and redeemScript.
    * 
    * Arguments:
    * 1. nrequired       (numeric, required) The number of required signatures out of the n keys.
    * 2. keys            (json array, required) The hex-encoded public keys.
    *      [
    *        "key",      (string) The hex-encoded public key
    *        ...
    *      ]
    * 3. address_type    (string, optional, default="legacy") The address type to use. Options are "legacy", "p2sh-segwit", and "bech32".
    * 
    * Result:
    * {                            (json object)
    *   "address" : "str",         (string) The value of the new multisig address.
    *   "redeemScript" : "hex",    (string) The string value of the hex-encoded redemption script.
    *   "descriptor" : "str"       (string) The descriptor for this multisig
    * }
    * 
    * Examples:
    * 
    * Create a multisig address from 2 public keys
    * > bitcoin-cli createmultisig 2 "[\"03789ed0bb717d88f7d321a368d905e7430207ebbd82bd342cf11ae157a7ace5fd\",\"03dbc6764b8884a92e871274b87583e6d5c2a58819473e17e107ef3f6aa5a61626\"]"
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "createmultisig", "params": [2, "[\"03789ed0bb717d88f7d321a368d905e7430207ebbd82bd342cf11ae157a7ace5fd\",\"03dbc6764b8884a92e871274b87583e6d5c2a58819473e17e107ef3f6aa5a61626\"]"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object createmultisig(Object nrequired, Object keys) { return createmultisig.invoke(nrequired, keys); }


   /**
    * createmultisig nrequired ["key",...] ( "address_type" )
    * 
    * Creates a multi-signature address with n signature of m keys required.
    * It returns a json object with the address and redeemScript.
    * 
    * Arguments:
    * 1. nrequired       (numeric, required) The number of required signatures out of the n keys.
    * 2. keys            (json array, required) The hex-encoded public keys.
    *      [
    *        "key",      (string) The hex-encoded public key
    *        ...
    *      ]
    * 3. address_type    (string, optional, default="legacy") The address type to use. Options are "legacy", "p2sh-segwit", and "bech32".
    * 
    * Result:
    * {                            (json object)
    *   "address" : "str",         (string) The value of the new multisig address.
    *   "redeemScript" : "hex",    (string) The string value of the hex-encoded redemption script.
    *   "descriptor" : "str"       (string) The descriptor for this multisig
    * }
    * 
    * Examples:
    * 
    * Create a multisig address from 2 public keys
    * > bitcoin-cli createmultisig 2 "[\"03789ed0bb717d88f7d321a368d905e7430207ebbd82bd342cf11ae157a7ace5fd\",\"03dbc6764b8884a92e871274b87583e6d5c2a58819473e17e107ef3f6aa5a61626\"]"
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "createmultisig", "params": [2, "[\"03789ed0bb717d88f7d321a368d905e7430207ebbd82bd342cf11ae157a7ace5fd\",\"03dbc6764b8884a92e871274b87583e6d5c2a58819473e17e107ef3f6aa5a61626\"]"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object createmultisig(Object nrequired, Object keys, Object address_type) { return createmultisig.invoke(nrequired, keys, address_type); }

   /**
    * getreceivedbylabel "label" ( minconf )
    * 
    * Returns the total amount received by addresses with <label> in transactions with at least [minconf] confirmations.
    * 
    * Arguments:
    * 1. label      (string, required) The selected label, may be the default label using "".
    * 2. minconf    (numeric, optional, default=1) Only include transactions confirmed at least this many times.
    * 
    * Result:
    * n    (numeric) The total amount in BTC received for this label.
    * 
    * Examples:
    * 
    * Amount received by the default label with at least 1 confirmation
    * > bitcoin-cli getreceivedbylabel ""
    * 
    * Amount received at the tabby label including unconfirmed amounts with zero confirmations
    * > bitcoin-cli getreceivedbylabel "tabby" 0
    * 
    * The amount with at least 6 confirmations
    * > bitcoin-cli getreceivedbylabel "tabby" 6
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getreceivedbylabel", "params": ["tabby", 6]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getreceivedbylabel(Object label) { return getreceivedbylabel.invoke(label); }


   /**
    * getreceivedbylabel "label" ( minconf )
    * 
    * Returns the total amount received by addresses with <label> in transactions with at least [minconf] confirmations.
    * 
    * Arguments:
    * 1. label      (string, required) The selected label, may be the default label using "".
    * 2. minconf    (numeric, optional, default=1) Only include transactions confirmed at least this many times.
    * 
    * Result:
    * n    (numeric) The total amount in BTC received for this label.
    * 
    * Examples:
    * 
    * Amount received by the default label with at least 1 confirmation
    * > bitcoin-cli getreceivedbylabel ""
    * 
    * Amount received at the tabby label including unconfirmed amounts with zero confirmations
    * > bitcoin-cli getreceivedbylabel "tabby" 0
    * 
    * The amount with at least 6 confirmations
    * > bitcoin-cli getreceivedbylabel "tabby" 6
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getreceivedbylabel", "params": ["tabby", 6]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getreceivedbylabel(Object label, Object minconf) { return getreceivedbylabel.invoke(label, minconf); }

   /**
    * fundrawtransaction "hexstring" ( options iswitness )
    * 
    * If the transaction has no inputs, they will be automatically selected to meet its out value.
    * It will add at most one change output to the outputs.
    * No existing outputs will be modified unless "subtractFeeFromOutputs" is specified.
    * Note that inputs which were signed may need to be resigned after completion since in/outputs have been added.
    * The inputs added will not be signed, use signrawtransactionwithkey
    *  or signrawtransactionwithwallet for that.
    * Note that all existing inputs must have their previous output transaction be in the wallet.
    * Note that all inputs selected must be of standard form and P2SH scripts must be
    * in the wallet using importaddress or addmultisigaddress (to calculate fees).
    * You can see whether this is the case by checking the "solvable" field in the listunspent output.
    * Only pay-to-pubkey, multisig, and P2SH versions thereof are currently supported for watch-only
    * 
    * Arguments:
    * 1. hexstring                          (string, required) The hex string of the raw transaction
    * 2. options                            (json object, optional) for backward compatibility: passing in a true instead of an object will result in {"includeWatching":true}
    *      {
    *        "add_inputs": bool,            (boolean, optional, default=true) For a transaction with existing inputs, automatically include more if they are not enough.
    *        "include_unsafe": bool,        (boolean, optional, default=false) Include inputs that are not safe to spend (unconfirmed transactions from outside keys and unconfirmed replacement transactions).
    *                                       Warning: the resulting transaction may become invalid if one of the unsafe inputs disappears.
    *                                       If that happens, you will need to fund the transaction with different inputs and republish it.
    *        "changeAddress": "str",        (string, optional, default=pool address) The bitcoin address to receive the change
    *        "changePosition": n,           (numeric, optional, default=random) The index of the change output
    *        "change_type": "str",          (string, optional, default=set by -changetype) The output type to use. Only valid if changeAddress is not specified. Options are "legacy", "p2sh-segwit", and "bech32".
    *        "includeWatching": bool,       (boolean, optional, default=true for watch-only wallets, otherwise false) Also select inputs which are watch only.
    *                                       Only solvable inputs can be used. Watch-only destinations are solvable if the public key and/or output script was imported,
    *                                       e.g. with 'importpubkey' or 'importmulti' with the 'pubkeys' or 'desc' field.
    *        "lockUnspents": bool,          (boolean, optional, default=false) Lock selected unspent outputs
    *        "fee_rate": amount,            (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    *        "feeRate": amount,             (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in BTC/kvB.
    *        "subtractFeeFromOutputs": [    (json array, optional, default=[]) The integers.
    *                                       The fee will be equally deducted from the amount of each specified output.
    *                                       Those recipients will receive less bitcoins than you enter in their corresponding amount field.
    *                                       If no outputs are specified here, the sender pays the fee.
    *          vout_index,                  (numeric) The zero-based output index, before a change output is added.
    *          ...
    *        ],
    *        "replaceable": bool,           (boolean, optional, default=wallet default) Marks this transaction as BIP125 replaceable.
    *                                       Allows this transaction to be replaced by a transaction with higher fees
    *        "conf_target": n,              (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    *        "estimate_mode": "str",        (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                                       "unset"
    *                                       "economical"
    *                                       "conservative"
    *      }
    * 3. iswitness                          (boolean, optional, default=depends on heuristic tests) Whether the transaction hex is a serialized witness transaction.
    *                                       If iswitness is not present, heuristic tests will be used in decoding.
    *                                       If true, only witness deserialization will be tried.
    *                                       If false, only non-witness deserialization will be tried.
    *                                       This boolean should reflect whether the transaction has inputs
    *                                       (e.g. fully valid, or on-chain transactions), if known by the caller.
    * 
    * Result:
    * {                     (json object)
    *   "hex" : "hex",      (string) The resulting raw transaction (hex-encoded string)
    *   "fee" : n,          (numeric) Fee in BTC the resulting transaction pays
    *   "changepos" : n     (numeric) The position of the added change output, or -1
    * }
    * 
    * Examples:
    * 
    * Create a transaction with no inputs
    * > bitcoin-cli createrawtransaction "[]" "{\"myaddress\":0.01}"
    * 
    * Add sufficient unsigned inputs to meet the output value
    * > bitcoin-cli fundrawtransaction "rawtransactionhex"
    * 
    * Sign the transaction
    * > bitcoin-cli signrawtransactionwithwallet "fundedtransactionhex"
    * 
    * Send the transaction
    * > bitcoin-cli sendrawtransaction "signedtransactionhex"
    */
   public Object fundrawtransaction(Object hexstring) { return fundrawtransaction.invoke(hexstring); }


   /**
    * fundrawtransaction "hexstring" ( options iswitness )
    * 
    * If the transaction has no inputs, they will be automatically selected to meet its out value.
    * It will add at most one change output to the outputs.
    * No existing outputs will be modified unless "subtractFeeFromOutputs" is specified.
    * Note that inputs which were signed may need to be resigned after completion since in/outputs have been added.
    * The inputs added will not be signed, use signrawtransactionwithkey
    *  or signrawtransactionwithwallet for that.
    * Note that all existing inputs must have their previous output transaction be in the wallet.
    * Note that all inputs selected must be of standard form and P2SH scripts must be
    * in the wallet using importaddress or addmultisigaddress (to calculate fees).
    * You can see whether this is the case by checking the "solvable" field in the listunspent output.
    * Only pay-to-pubkey, multisig, and P2SH versions thereof are currently supported for watch-only
    * 
    * Arguments:
    * 1. hexstring                          (string, required) The hex string of the raw transaction
    * 2. options                            (json object, optional) for backward compatibility: passing in a true instead of an object will result in {"includeWatching":true}
    *      {
    *        "add_inputs": bool,            (boolean, optional, default=true) For a transaction with existing inputs, automatically include more if they are not enough.
    *        "include_unsafe": bool,        (boolean, optional, default=false) Include inputs that are not safe to spend (unconfirmed transactions from outside keys and unconfirmed replacement transactions).
    *                                       Warning: the resulting transaction may become invalid if one of the unsafe inputs disappears.
    *                                       If that happens, you will need to fund the transaction with different inputs and republish it.
    *        "changeAddress": "str",        (string, optional, default=pool address) The bitcoin address to receive the change
    *        "changePosition": n,           (numeric, optional, default=random) The index of the change output
    *        "change_type": "str",          (string, optional, default=set by -changetype) The output type to use. Only valid if changeAddress is not specified. Options are "legacy", "p2sh-segwit", and "bech32".
    *        "includeWatching": bool,       (boolean, optional, default=true for watch-only wallets, otherwise false) Also select inputs which are watch only.
    *                                       Only solvable inputs can be used. Watch-only destinations are solvable if the public key and/or output script was imported,
    *                                       e.g. with 'importpubkey' or 'importmulti' with the 'pubkeys' or 'desc' field.
    *        "lockUnspents": bool,          (boolean, optional, default=false) Lock selected unspent outputs
    *        "fee_rate": amount,            (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    *        "feeRate": amount,             (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in BTC/kvB.
    *        "subtractFeeFromOutputs": [    (json array, optional, default=[]) The integers.
    *                                       The fee will be equally deducted from the amount of each specified output.
    *                                       Those recipients will receive less bitcoins than you enter in their corresponding amount field.
    *                                       If no outputs are specified here, the sender pays the fee.
    *          vout_index,                  (numeric) The zero-based output index, before a change output is added.
    *          ...
    *        ],
    *        "replaceable": bool,           (boolean, optional, default=wallet default) Marks this transaction as BIP125 replaceable.
    *                                       Allows this transaction to be replaced by a transaction with higher fees
    *        "conf_target": n,              (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    *        "estimate_mode": "str",        (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                                       "unset"
    *                                       "economical"
    *                                       "conservative"
    *      }
    * 3. iswitness                          (boolean, optional, default=depends on heuristic tests) Whether the transaction hex is a serialized witness transaction.
    *                                       If iswitness is not present, heuristic tests will be used in decoding.
    *                                       If true, only witness deserialization will be tried.
    *                                       If false, only non-witness deserialization will be tried.
    *                                       This boolean should reflect whether the transaction has inputs
    *                                       (e.g. fully valid, or on-chain transactions), if known by the caller.
    * 
    * Result:
    * {                     (json object)
    *   "hex" : "hex",      (string) The resulting raw transaction (hex-encoded string)
    *   "fee" : n,          (numeric) Fee in BTC the resulting transaction pays
    *   "changepos" : n     (numeric) The position of the added change output, or -1
    * }
    * 
    * Examples:
    * 
    * Create a transaction with no inputs
    * > bitcoin-cli createrawtransaction "[]" "{\"myaddress\":0.01}"
    * 
    * Add sufficient unsigned inputs to meet the output value
    * > bitcoin-cli fundrawtransaction "rawtransactionhex"
    * 
    * Sign the transaction
    * > bitcoin-cli signrawtransactionwithwallet "fundedtransactionhex"
    * 
    * Send the transaction
    * > bitcoin-cli sendrawtransaction "signedtransactionhex"
    */
   public Object fundrawtransaction(Object hexstring, Object options) { return fundrawtransaction.invoke(hexstring, options); }


   /**
    * fundrawtransaction "hexstring" ( options iswitness )
    * 
    * If the transaction has no inputs, they will be automatically selected to meet its out value.
    * It will add at most one change output to the outputs.
    * No existing outputs will be modified unless "subtractFeeFromOutputs" is specified.
    * Note that inputs which were signed may need to be resigned after completion since in/outputs have been added.
    * The inputs added will not be signed, use signrawtransactionwithkey
    *  or signrawtransactionwithwallet for that.
    * Note that all existing inputs must have their previous output transaction be in the wallet.
    * Note that all inputs selected must be of standard form and P2SH scripts must be
    * in the wallet using importaddress or addmultisigaddress (to calculate fees).
    * You can see whether this is the case by checking the "solvable" field in the listunspent output.
    * Only pay-to-pubkey, multisig, and P2SH versions thereof are currently supported for watch-only
    * 
    * Arguments:
    * 1. hexstring                          (string, required) The hex string of the raw transaction
    * 2. options                            (json object, optional) for backward compatibility: passing in a true instead of an object will result in {"includeWatching":true}
    *      {
    *        "add_inputs": bool,            (boolean, optional, default=true) For a transaction with existing inputs, automatically include more if they are not enough.
    *        "include_unsafe": bool,        (boolean, optional, default=false) Include inputs that are not safe to spend (unconfirmed transactions from outside keys and unconfirmed replacement transactions).
    *                                       Warning: the resulting transaction may become invalid if one of the unsafe inputs disappears.
    *                                       If that happens, you will need to fund the transaction with different inputs and republish it.
    *        "changeAddress": "str",        (string, optional, default=pool address) The bitcoin address to receive the change
    *        "changePosition": n,           (numeric, optional, default=random) The index of the change output
    *        "change_type": "str",          (string, optional, default=set by -changetype) The output type to use. Only valid if changeAddress is not specified. Options are "legacy", "p2sh-segwit", and "bech32".
    *        "includeWatching": bool,       (boolean, optional, default=true for watch-only wallets, otherwise false) Also select inputs which are watch only.
    *                                       Only solvable inputs can be used. Watch-only destinations are solvable if the public key and/or output script was imported,
    *                                       e.g. with 'importpubkey' or 'importmulti' with the 'pubkeys' or 'desc' field.
    *        "lockUnspents": bool,          (boolean, optional, default=false) Lock selected unspent outputs
    *        "fee_rate": amount,            (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    *        "feeRate": amount,             (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in BTC/kvB.
    *        "subtractFeeFromOutputs": [    (json array, optional, default=[]) The integers.
    *                                       The fee will be equally deducted from the amount of each specified output.
    *                                       Those recipients will receive less bitcoins than you enter in their corresponding amount field.
    *                                       If no outputs are specified here, the sender pays the fee.
    *          vout_index,                  (numeric) The zero-based output index, before a change output is added.
    *          ...
    *        ],
    *        "replaceable": bool,           (boolean, optional, default=wallet default) Marks this transaction as BIP125 replaceable.
    *                                       Allows this transaction to be replaced by a transaction with higher fees
    *        "conf_target": n,              (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    *        "estimate_mode": "str",        (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                                       "unset"
    *                                       "economical"
    *                                       "conservative"
    *      }
    * 3. iswitness                          (boolean, optional, default=depends on heuristic tests) Whether the transaction hex is a serialized witness transaction.
    *                                       If iswitness is not present, heuristic tests will be used in decoding.
    *                                       If true, only witness deserialization will be tried.
    *                                       If false, only non-witness deserialization will be tried.
    *                                       This boolean should reflect whether the transaction has inputs
    *                                       (e.g. fully valid, or on-chain transactions), if known by the caller.
    * 
    * Result:
    * {                     (json object)
    *   "hex" : "hex",      (string) The resulting raw transaction (hex-encoded string)
    *   "fee" : n,          (numeric) Fee in BTC the resulting transaction pays
    *   "changepos" : n     (numeric) The position of the added change output, or -1
    * }
    * 
    * Examples:
    * 
    * Create a transaction with no inputs
    * > bitcoin-cli createrawtransaction "[]" "{\"myaddress\":0.01}"
    * 
    * Add sufficient unsigned inputs to meet the output value
    * > bitcoin-cli fundrawtransaction "rawtransactionhex"
    * 
    * Sign the transaction
    * > bitcoin-cli signrawtransactionwithwallet "fundedtransactionhex"
    * 
    * Send the transaction
    * > bitcoin-cli sendrawtransaction "signedtransactionhex"
    */
   public Object fundrawtransaction(Object hexstring, Object options, Object iswitness) { return fundrawtransaction.invoke(hexstring, options, iswitness); }

   /**
    * getchaintxstats ( nblocks "blockhash" )
    * 
    * Compute statistics about the total number and rate of transactions in the chain.
    * 
    * Arguments:
    * 1. nblocks      (numeric, optional, default=one month) Size of the window in number of blocks
    * 2. blockhash    (string, optional, default=chain tip) The hash of the block that ends the window.
    * 
    * Result:
    * {                                       (json object)
    *   "time" : xxx,                         (numeric) The timestamp for the final block in the window, expressed in UNIX epoch time
    *   "txcount" : n,                        (numeric) The total number of transactions in the chain up to that point
    *   "window_final_block_hash" : "hex",    (string) The hash of the final block in the window
    *   "window_final_block_height" : n,      (numeric) The height of the final block in the window.
    *   "window_block_count" : n,             (numeric) Size of the window in number of blocks
    *   "window_tx_count" : n,                (numeric, optional) The number of transactions in the window. Only returned if "window_block_count" is > 0
    *   "window_interval" : n,                (numeric, optional) The elapsed time in the window in seconds. Only returned if "window_block_count" is > 0
    *   "txrate" : n                          (numeric, optional) The average rate of transactions per second in the window. Only returned if "window_interval" is > 0
    * }
    * 
    * Examples:
    * > bitcoin-cli getchaintxstats 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getchaintxstats", "params": [2016]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getchaintxstats() { return getchaintxstats.invoke(); }


   /**
    * getchaintxstats ( nblocks "blockhash" )
    * 
    * Compute statistics about the total number and rate of transactions in the chain.
    * 
    * Arguments:
    * 1. nblocks      (numeric, optional, default=one month) Size of the window in number of blocks
    * 2. blockhash    (string, optional, default=chain tip) The hash of the block that ends the window.
    * 
    * Result:
    * {                                       (json object)
    *   "time" : xxx,                         (numeric) The timestamp for the final block in the window, expressed in UNIX epoch time
    *   "txcount" : n,                        (numeric) The total number of transactions in the chain up to that point
    *   "window_final_block_hash" : "hex",    (string) The hash of the final block in the window
    *   "window_final_block_height" : n,      (numeric) The height of the final block in the window.
    *   "window_block_count" : n,             (numeric) Size of the window in number of blocks
    *   "window_tx_count" : n,                (numeric, optional) The number of transactions in the window. Only returned if "window_block_count" is > 0
    *   "window_interval" : n,                (numeric, optional) The elapsed time in the window in seconds. Only returned if "window_block_count" is > 0
    *   "txrate" : n                          (numeric, optional) The average rate of transactions per second in the window. Only returned if "window_interval" is > 0
    * }
    * 
    * Examples:
    * > bitcoin-cli getchaintxstats 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getchaintxstats", "params": [2016]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getchaintxstats(Object nblocks) { return getchaintxstats.invoke(nblocks); }


   /**
    * getchaintxstats ( nblocks "blockhash" )
    * 
    * Compute statistics about the total number and rate of transactions in the chain.
    * 
    * Arguments:
    * 1. nblocks      (numeric, optional, default=one month) Size of the window in number of blocks
    * 2. blockhash    (string, optional, default=chain tip) The hash of the block that ends the window.
    * 
    * Result:
    * {                                       (json object)
    *   "time" : xxx,                         (numeric) The timestamp for the final block in the window, expressed in UNIX epoch time
    *   "txcount" : n,                        (numeric) The total number of transactions in the chain up to that point
    *   "window_final_block_hash" : "hex",    (string) The hash of the final block in the window
    *   "window_final_block_height" : n,      (numeric) The height of the final block in the window.
    *   "window_block_count" : n,             (numeric) Size of the window in number of blocks
    *   "window_tx_count" : n,                (numeric, optional) The number of transactions in the window. Only returned if "window_block_count" is > 0
    *   "window_interval" : n,                (numeric, optional) The elapsed time in the window in seconds. Only returned if "window_block_count" is > 0
    *   "txrate" : n                          (numeric, optional) The average rate of transactions per second in the window. Only returned if "window_interval" is > 0
    * }
    * 
    * Examples:
    * > bitcoin-cli getchaintxstats 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getchaintxstats", "params": [2016]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getchaintxstats(Object nblocks, Object blockhash) { return getchaintxstats.invoke(nblocks, blockhash); }

   /**
    * estimatesmartfee conf_target ( "estimate_mode" )
    * 
    * Estimates the approximate fee per kilobyte needed for a transaction to begin
    * confirmation within conf_target blocks if possible and return the number of blocks
    * for which the estimate is valid. Uses virtual transaction size as defined
    * in BIP 141 (witness data is discounted).
    * 
    * Arguments:
    * 1. conf_target      (numeric, required) Confirmation target in blocks (1 - 1008)
    * 2. estimate_mode    (string, optional, default="conservative") The fee estimate mode.
    *                     Whether to return a more conservative estimate which also satisfies
    *                     a longer history. A conservative estimate potentially returns a
    *                     higher feerate and is more likely to be sufficient for the desired
    *                     target, but is not as responsive to short term drops in the
    *                     prevailing fee market. Must be one of (case insensitive):
    *                     "unset"
    *                     "economical"
    *                     "conservative"
    * 
    * Result:
    * {                   (json object)
    *   "feerate" : n,    (numeric, optional) estimate fee rate in BTC/kvB (only present if no errors were encountered)
    *   "errors" : [      (json array, optional) Errors encountered during processing (if there are any)
    *     "str",          (string) error
    *     ...
    *   ],
    *   "blocks" : n      (numeric) block number where estimate was found
    *                     The request target will be clamped between 2 and the highest target
    *                     fee estimation is able to return based on how long it has been running.
    *                     An error is returned if not enough transactions and blocks
    *                     have been observed to make an estimate for any number of blocks.
    * }
    * 
    * Examples:
    * > bitcoin-cli estimatesmartfee 6
    */
   public Object estimatesmartfee(Object conf_target) { return estimatesmartfee.invoke(conf_target); }


   /**
    * estimatesmartfee conf_target ( "estimate_mode" )
    * 
    * Estimates the approximate fee per kilobyte needed for a transaction to begin
    * confirmation within conf_target blocks if possible and return the number of blocks
    * for which the estimate is valid. Uses virtual transaction size as defined
    * in BIP 141 (witness data is discounted).
    * 
    * Arguments:
    * 1. conf_target      (numeric, required) Confirmation target in blocks (1 - 1008)
    * 2. estimate_mode    (string, optional, default="conservative") The fee estimate mode.
    *                     Whether to return a more conservative estimate which also satisfies
    *                     a longer history. A conservative estimate potentially returns a
    *                     higher feerate and is more likely to be sufficient for the desired
    *                     target, but is not as responsive to short term drops in the
    *                     prevailing fee market. Must be one of (case insensitive):
    *                     "unset"
    *                     "economical"
    *                     "conservative"
    * 
    * Result:
    * {                   (json object)
    *   "feerate" : n,    (numeric, optional) estimate fee rate in BTC/kvB (only present if no errors were encountered)
    *   "errors" : [      (json array, optional) Errors encountered during processing (if there are any)
    *     "str",          (string) error
    *     ...
    *   ],
    *   "blocks" : n      (numeric) block number where estimate was found
    *                     The request target will be clamped between 2 and the highest target
    *                     fee estimation is able to return based on how long it has been running.
    *                     An error is returned if not enough transactions and blocks
    *                     have been observed to make an estimate for any number of blocks.
    * }
    * 
    * Examples:
    * > bitcoin-cli estimatesmartfee 6
    */
   public Object estimatesmartfee(Object conf_target, Object estimate_mode) { return estimatesmartfee.invoke(conf_target, estimate_mode); }

   /**
    * getmininginfo
    * 
    * Returns a json object containing mining-related information.
    * Result:
    * {                              (json object)
    *   "blocks" : n,                (numeric) The current block
    *   "currentblockweight" : n,    (numeric, optional) The block weight of the last assembled block (only present if a block was ever assembled)
    *   "currentblocktx" : n,        (numeric, optional) The number of block transactions of the last assembled block (only present if a block was ever assembled)
    *   "difficulty" : n,            (numeric) The current difficulty
    *   "networkhashps" : n,         (numeric) The network hashes per second
    *   "pooledtx" : n,              (numeric) The size of the mempool
    *   "chain" : "str",             (string) current network name (main, test, signet, regtest)
    *   "warnings" : "str"           (string) any network and blockchain warnings
    * }
    * 
    * Examples:
    * > bitcoin-cli getmininginfo 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getmininginfo", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getmininginfo() { return getmininginfo.invoke(); }

   /**
    * sethdseed ( newkeypool "seed" )
    * 
    * Set or generate a new HD wallet seed. Non-HD wallets will not be upgraded to being a HD wallet. Wallets that are already
    * HD will have a new HD seed set so that new keys added to the keypool will be derived from this new seed.
    * 
    * Note that you will need to MAKE A NEW BACKUP of your wallet after setting the HD wallet seed.
    * Requires wallet passphrase to be set with walletpassphrase call if wallet is encrypted.
    * 
    * Arguments:
    * 1. newkeypool    (boolean, optional, default=true) Whether to flush old unused addresses, including change addresses, from the keypool and regenerate it.
    *                  If true, the next address from getnewaddress and change address from getrawchangeaddress will be from this new seed.
    *                  If false, addresses (including change addresses if the wallet already had HD Chain Split enabled) from the existing
    *                  keypool will be used until it has been depleted.
    * 2. seed          (string, optional, default=random seed) The WIF private key to use as the new HD seed.
    *                  The seed value can be retrieved using the dumpwallet command. It is the private key marked hdseed=1
    * 
    * Result:
    * null    (json null)
    * 
    * Examples:
    * > bitcoin-cli sethdseed 
    * > bitcoin-cli sethdseed false
    * > bitcoin-cli sethdseed true "wifkey"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "sethdseed", "params": [true, "wifkey"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object sethdseed() { return sethdseed.invoke(); }


   /**
    * sethdseed ( newkeypool "seed" )
    * 
    * Set or generate a new HD wallet seed. Non-HD wallets will not be upgraded to being a HD wallet. Wallets that are already
    * HD will have a new HD seed set so that new keys added to the keypool will be derived from this new seed.
    * 
    * Note that you will need to MAKE A NEW BACKUP of your wallet after setting the HD wallet seed.
    * Requires wallet passphrase to be set with walletpassphrase call if wallet is encrypted.
    * 
    * Arguments:
    * 1. newkeypool    (boolean, optional, default=true) Whether to flush old unused addresses, including change addresses, from the keypool and regenerate it.
    *                  If true, the next address from getnewaddress and change address from getrawchangeaddress will be from this new seed.
    *                  If false, addresses (including change addresses if the wallet already had HD Chain Split enabled) from the existing
    *                  keypool will be used until it has been depleted.
    * 2. seed          (string, optional, default=random seed) The WIF private key to use as the new HD seed.
    *                  The seed value can be retrieved using the dumpwallet command. It is the private key marked hdseed=1
    * 
    * Result:
    * null    (json null)
    * 
    * Examples:
    * > bitcoin-cli sethdseed 
    * > bitcoin-cli sethdseed false
    * > bitcoin-cli sethdseed true "wifkey"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "sethdseed", "params": [true, "wifkey"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object sethdseed(Object newkeypool) { return sethdseed.invoke(newkeypool); }


   /**
    * sethdseed ( newkeypool "seed" )
    * 
    * Set or generate a new HD wallet seed. Non-HD wallets will not be upgraded to being a HD wallet. Wallets that are already
    * HD will have a new HD seed set so that new keys added to the keypool will be derived from this new seed.
    * 
    * Note that you will need to MAKE A NEW BACKUP of your wallet after setting the HD wallet seed.
    * Requires wallet passphrase to be set with walletpassphrase call if wallet is encrypted.
    * 
    * Arguments:
    * 1. newkeypool    (boolean, optional, default=true) Whether to flush old unused addresses, including change addresses, from the keypool and regenerate it.
    *                  If true, the next address from getnewaddress and change address from getrawchangeaddress will be from this new seed.
    *                  If false, addresses (including change addresses if the wallet already had HD Chain Split enabled) from the existing
    *                  keypool will be used until it has been depleted.
    * 2. seed          (string, optional, default=random seed) The WIF private key to use as the new HD seed.
    *                  The seed value can be retrieved using the dumpwallet command. It is the private key marked hdseed=1
    * 
    * Result:
    * null    (json null)
    * 
    * Examples:
    * > bitcoin-cli sethdseed 
    * > bitcoin-cli sethdseed false
    * > bitcoin-cli sethdseed true "wifkey"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "sethdseed", "params": [true, "wifkey"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object sethdseed(Object newkeypool, Object seed) { return sethdseed.invoke(newkeypool, seed); }

   /**
    * encryptwallet "passphrase"
    * 
    * Encrypts the wallet with 'passphrase'. This is for first time encryption.
    * After this, any calls that interact with private keys such as sending or signing 
    * will require the passphrase to be set prior the making these calls.
    * Use the walletpassphrase call for this, and then walletlock call.
    * If the wallet is already encrypted, use the walletpassphrasechange call.
    * 
    * Arguments:
    * 1. passphrase    (string, required) The pass phrase to encrypt the wallet with. It must be at least 1 character, but should be long.
    * 
    * Result:
    * "str"    (string) A string with further instructions
    * 
    * Examples:
    * 
    * Encrypt your wallet
    * > bitcoin-cli encryptwallet "my pass phrase"
    * 
    * Now set the passphrase to use the wallet, such as for signing or sending bitcoin
    * > bitcoin-cli walletpassphrase "my pass phrase"
    * 
    * Now we can do something like sign
    * > bitcoin-cli signmessage "address" "test message"
    * 
    * Now lock the wallet again by removing the passphrase
    * > bitcoin-cli walletlock 
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "encryptwallet", "params": ["my pass phrase"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object encryptwallet(Object passphrase) { return encryptwallet.invoke(passphrase); }

   /**
    * getzmqnotifications
    * 
    * Returns information about the active ZeroMQ notifications.
    * 
    * Result:
    * [                         (json array)
    *   {                       (json object)
    *     "type" : "str",       (string) Type of notification
    *     "address" : "str",    (string) Address of the publisher
    *     "hwm" : n             (numeric) Outbound message high water mark
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * > bitcoin-cli getzmqnotifications 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getzmqnotifications", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getzmqnotifications() { return getzmqnotifications.invoke(); }

   /**
    * uptime
    * 
    * Returns the total uptime of the server.
    * 
    * Result:
    * n    (numeric) The number of seconds that the server has been running
    * 
    * Examples:
    * > bitcoin-cli uptime 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "uptime", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object uptime() { return uptime.invoke(); }

   /**
    * backupwallet "destination"
    * 
    * Safely copies current wallet file to destination, which can be a directory or a path with filename.
    * 
    * Arguments:
    * 1. destination    (string, required) The destination directory or file
    * 
    * Result:
    * null    (json null)
    * 
    * Examples:
    * > bitcoin-cli backupwallet "backup.dat"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "backupwallet", "params": ["backup.dat"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object backupwallet(Object destination) { return backupwallet.invoke(destination); }

   /**
    * enumeratesigners
    * Returns a list of external signers from -signer.
    * Result:
    * {                  (json object)
    *   "signers" : [    (json array)
    *     "hex",         (string) Master key fingerprint
    *     "str",         (string) Device name
    *     ...
    *   ]
    * }
    * 
    * Examples:
    * > bitcoin-cli enumeratesigners 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "enumeratesigners", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object enumeratesigners() { return enumeratesigners.invoke(); }

   /**
    * getbalance ( "dummy" minconf include_watchonly avoid_reuse )
    * 
    * Returns the total available balance.
    * The available balance is what the wallet considers currently spendable, and is
    * thus affected by options which limit spendability such as -spendzeroconfchange.
    * 
    * Arguments:
    * 1. dummy                (string, optional) Remains for backward compatibility. Must be excluded or set to "*".
    * 2. minconf              (numeric, optional, default=0) Only include transactions confirmed at least this many times.
    * 3. include_watchonly    (boolean, optional, default=true for watch-only wallets, otherwise false) Also include balance in watch-only addresses (see 'importaddress')
    * 4. avoid_reuse          (boolean, optional, default=true) (only available if avoid_reuse wallet flag is set) Do not include balance in dirty outputs; addresses are considered dirty if they have previously been used in a transaction.
    * 
    * Result:
    * n    (numeric) The total amount in BTC received for this wallet.
    * 
    * Examples:
    * 
    * The total amount in the wallet with 0 or more confirmations
    * > bitcoin-cli getbalance 
    * 
    * The total amount in the wallet with at least 6 confirmations
    * > bitcoin-cli getbalance "*" 6
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getbalance", "params": ["*", 6]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getbalance() { return getbalance.invoke(); }


   /**
    * getbalance ( "dummy" minconf include_watchonly avoid_reuse )
    * 
    * Returns the total available balance.
    * The available balance is what the wallet considers currently spendable, and is
    * thus affected by options which limit spendability such as -spendzeroconfchange.
    * 
    * Arguments:
    * 1. dummy                (string, optional) Remains for backward compatibility. Must be excluded or set to "*".
    * 2. minconf              (numeric, optional, default=0) Only include transactions confirmed at least this many times.
    * 3. include_watchonly    (boolean, optional, default=true for watch-only wallets, otherwise false) Also include balance in watch-only addresses (see 'importaddress')
    * 4. avoid_reuse          (boolean, optional, default=true) (only available if avoid_reuse wallet flag is set) Do not include balance in dirty outputs; addresses are considered dirty if they have previously been used in a transaction.
    * 
    * Result:
    * n    (numeric) The total amount in BTC received for this wallet.
    * 
    * Examples:
    * 
    * The total amount in the wallet with 0 or more confirmations
    * > bitcoin-cli getbalance 
    * 
    * The total amount in the wallet with at least 6 confirmations
    * > bitcoin-cli getbalance "*" 6
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getbalance", "params": ["*", 6]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getbalance(Object dummy) { return getbalance.invoke(dummy); }


   /**
    * getbalance ( "dummy" minconf include_watchonly avoid_reuse )
    * 
    * Returns the total available balance.
    * The available balance is what the wallet considers currently spendable, and is
    * thus affected by options which limit spendability such as -spendzeroconfchange.
    * 
    * Arguments:
    * 1. dummy                (string, optional) Remains for backward compatibility. Must be excluded or set to "*".
    * 2. minconf              (numeric, optional, default=0) Only include transactions confirmed at least this many times.
    * 3. include_watchonly    (boolean, optional, default=true for watch-only wallets, otherwise false) Also include balance in watch-only addresses (see 'importaddress')
    * 4. avoid_reuse          (boolean, optional, default=true) (only available if avoid_reuse wallet flag is set) Do not include balance in dirty outputs; addresses are considered dirty if they have previously been used in a transaction.
    * 
    * Result:
    * n    (numeric) The total amount in BTC received for this wallet.
    * 
    * Examples:
    * 
    * The total amount in the wallet with 0 or more confirmations
    * > bitcoin-cli getbalance 
    * 
    * The total amount in the wallet with at least 6 confirmations
    * > bitcoin-cli getbalance "*" 6
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getbalance", "params": ["*", 6]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getbalance(Object dummy, Object minconf) { return getbalance.invoke(dummy, minconf); }


   /**
    * getbalance ( "dummy" minconf include_watchonly avoid_reuse )
    * 
    * Returns the total available balance.
    * The available balance is what the wallet considers currently spendable, and is
    * thus affected by options which limit spendability such as -spendzeroconfchange.
    * 
    * Arguments:
    * 1. dummy                (string, optional) Remains for backward compatibility. Must be excluded or set to "*".
    * 2. minconf              (numeric, optional, default=0) Only include transactions confirmed at least this many times.
    * 3. include_watchonly    (boolean, optional, default=true for watch-only wallets, otherwise false) Also include balance in watch-only addresses (see 'importaddress')
    * 4. avoid_reuse          (boolean, optional, default=true) (only available if avoid_reuse wallet flag is set) Do not include balance in dirty outputs; addresses are considered dirty if they have previously been used in a transaction.
    * 
    * Result:
    * n    (numeric) The total amount in BTC received for this wallet.
    * 
    * Examples:
    * 
    * The total amount in the wallet with 0 or more confirmations
    * > bitcoin-cli getbalance 
    * 
    * The total amount in the wallet with at least 6 confirmations
    * > bitcoin-cli getbalance "*" 6
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getbalance", "params": ["*", 6]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getbalance(Object dummy, Object minconf, Object include_watchonly) { return getbalance.invoke(dummy, minconf, include_watchonly); }


   /**
    * getbalance ( "dummy" minconf include_watchonly avoid_reuse )
    * 
    * Returns the total available balance.
    * The available balance is what the wallet considers currently spendable, and is
    * thus affected by options which limit spendability such as -spendzeroconfchange.
    * 
    * Arguments:
    * 1. dummy                (string, optional) Remains for backward compatibility. Must be excluded or set to "*".
    * 2. minconf              (numeric, optional, default=0) Only include transactions confirmed at least this many times.
    * 3. include_watchonly    (boolean, optional, default=true for watch-only wallets, otherwise false) Also include balance in watch-only addresses (see 'importaddress')
    * 4. avoid_reuse          (boolean, optional, default=true) (only available if avoid_reuse wallet flag is set) Do not include balance in dirty outputs; addresses are considered dirty if they have previously been used in a transaction.
    * 
    * Result:
    * n    (numeric) The total amount in BTC received for this wallet.
    * 
    * Examples:
    * 
    * The total amount in the wallet with 0 or more confirmations
    * > bitcoin-cli getbalance 
    * 
    * The total amount in the wallet with at least 6 confirmations
    * > bitcoin-cli getbalance "*" 6
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getbalance", "params": ["*", 6]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getbalance(Object dummy, Object minconf, Object include_watchonly, Object avoid_reuse) { return getbalance.invoke(dummy, minconf, include_watchonly, avoid_reuse); }

   /**
    * listtransactions ( "label" count skip include_watchonly )
    * 
    * If a label name is provided, this will return only incoming transactions paying to addresses with the specified label.
    * 
    * Returns up to 'count' most recent transactions skipping the first 'from' transactions.
    * 
    * Arguments:
    * 1. label                (string, optional) If set, should be a valid label name to return only incoming transactions
    *                         with the specified label, or "*" to disable filtering and return all transactions.
    * 2. count                (numeric, optional, default=10) The number of transactions to return
    * 3. skip                 (numeric, optional, default=0) The number of transactions to skip
    * 4. include_watchonly    (boolean, optional, default=true for watch-only wallets, otherwise false) Include transactions to watch-only addresses (see 'importaddress')
    * 
    * Result:
    * [                                        (json array)
    *   {                                      (json object)
    *     "involvesWatchonly" : true|false,    (boolean) Only returns true if imported addresses were involved in transaction.
    *     "address" : "str",                   (string) The bitcoin address of the transaction.
    *     "category" : "str",                  (string) The transaction category.
    *                                          "send"                  Transactions sent.
    *                                          "receive"               Non-coinbase transactions received.
    *                                          "generate"              Coinbase transactions received with more than 100 confirmations.
    *                                          "immature"              Coinbase transactions received with 100 or fewer confirmations.
    *                                          "orphan"                Orphaned coinbase transactions received.
    *     "amount" : n,                        (numeric) The amount in BTC. This is negative for the 'send' category, and is positive
    *                                          for all other categories
    *     "label" : "str",                     (string) A comment for the address/transaction, if any
    *     "vout" : n,                          (numeric) the vout value
    *     "fee" : n,                           (numeric) The amount of the fee in BTC. This is negative and only available for the
    *                                          'send' category of transactions.
    *     "confirmations" : n,                 (numeric) The number of confirmations for the transaction. Negative confirmations means the
    *                                          transaction conflicted that many blocks ago.
    *     "generated" : true|false,            (boolean) Only present if transaction only input is a coinbase one.
    *     "trusted" : true|false,              (boolean) Only present if we consider transaction to be trusted and so safe to spend from.
    *     "blockhash" : "hex",                 (string) The block hash containing the transaction.
    *     "blockheight" : n,                   (numeric) The block height containing the transaction.
    *     "blockindex" : n,                    (numeric) The index of the transaction in the block that includes it.
    *     "blocktime" : xxx,                   (numeric) The block time expressed in UNIX epoch time.
    *     "txid" : "hex",                      (string) The transaction id.
    *     "walletconflicts" : [                (json array) Conflicting transaction ids.
    *       "hex",                             (string) The transaction id.
    *       ...
    *     ],
    *     "time" : xxx,                        (numeric) The transaction time expressed in UNIX epoch time.
    *     "timereceived" : xxx,                (numeric) The time received expressed in UNIX epoch time.
    *     "comment" : "str",                   (string) If a comment is associated with the transaction, only present if not empty.
    *     "bip125-replaceable" : "str",        (string) ("yes|no|unknown") Whether this transaction could be replaced due to BIP125 (replace-by-fee);
    *                                          may be unknown for unconfirmed transactions not in the mempool
    *     "abandoned" : true|false             (boolean) 'true' if the transaction has been abandoned (inputs are respendable). Only available for the 
    *                                          'send' category of transactions.
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * 
    * List the most recent 10 transactions in the systems
    * > bitcoin-cli listtransactions 
    * 
    * List transactions 100 to 120
    * > bitcoin-cli listtransactions "*" 20 100
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listtransactions", "params": ["*", 20, 100]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object listtransactions() { return listtransactions.invoke(); }


   /**
    * listtransactions ( "label" count skip include_watchonly )
    * 
    * If a label name is provided, this will return only incoming transactions paying to addresses with the specified label.
    * 
    * Returns up to 'count' most recent transactions skipping the first 'from' transactions.
    * 
    * Arguments:
    * 1. label                (string, optional) If set, should be a valid label name to return only incoming transactions
    *                         with the specified label, or "*" to disable filtering and return all transactions.
    * 2. count                (numeric, optional, default=10) The number of transactions to return
    * 3. skip                 (numeric, optional, default=0) The number of transactions to skip
    * 4. include_watchonly    (boolean, optional, default=true for watch-only wallets, otherwise false) Include transactions to watch-only addresses (see 'importaddress')
    * 
    * Result:
    * [                                        (json array)
    *   {                                      (json object)
    *     "involvesWatchonly" : true|false,    (boolean) Only returns true if imported addresses were involved in transaction.
    *     "address" : "str",                   (string) The bitcoin address of the transaction.
    *     "category" : "str",                  (string) The transaction category.
    *                                          "send"                  Transactions sent.
    *                                          "receive"               Non-coinbase transactions received.
    *                                          "generate"              Coinbase transactions received with more than 100 confirmations.
    *                                          "immature"              Coinbase transactions received with 100 or fewer confirmations.
    *                                          "orphan"                Orphaned coinbase transactions received.
    *     "amount" : n,                        (numeric) The amount in BTC. This is negative for the 'send' category, and is positive
    *                                          for all other categories
    *     "label" : "str",                     (string) A comment for the address/transaction, if any
    *     "vout" : n,                          (numeric) the vout value
    *     "fee" : n,                           (numeric) The amount of the fee in BTC. This is negative and only available for the
    *                                          'send' category of transactions.
    *     "confirmations" : n,                 (numeric) The number of confirmations for the transaction. Negative confirmations means the
    *                                          transaction conflicted that many blocks ago.
    *     "generated" : true|false,            (boolean) Only present if transaction only input is a coinbase one.
    *     "trusted" : true|false,              (boolean) Only present if we consider transaction to be trusted and so safe to spend from.
    *     "blockhash" : "hex",                 (string) The block hash containing the transaction.
    *     "blockheight" : n,                   (numeric) The block height containing the transaction.
    *     "blockindex" : n,                    (numeric) The index of the transaction in the block that includes it.
    *     "blocktime" : xxx,                   (numeric) The block time expressed in UNIX epoch time.
    *     "txid" : "hex",                      (string) The transaction id.
    *     "walletconflicts" : [                (json array) Conflicting transaction ids.
    *       "hex",                             (string) The transaction id.
    *       ...
    *     ],
    *     "time" : xxx,                        (numeric) The transaction time expressed in UNIX epoch time.
    *     "timereceived" : xxx,                (numeric) The time received expressed in UNIX epoch time.
    *     "comment" : "str",                   (string) If a comment is associated with the transaction, only present if not empty.
    *     "bip125-replaceable" : "str",        (string) ("yes|no|unknown") Whether this transaction could be replaced due to BIP125 (replace-by-fee);
    *                                          may be unknown for unconfirmed transactions not in the mempool
    *     "abandoned" : true|false             (boolean) 'true' if the transaction has been abandoned (inputs are respendable). Only available for the 
    *                                          'send' category of transactions.
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * 
    * List the most recent 10 transactions in the systems
    * > bitcoin-cli listtransactions 
    * 
    * List transactions 100 to 120
    * > bitcoin-cli listtransactions "*" 20 100
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listtransactions", "params": ["*", 20, 100]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object listtransactions(Object label) { return listtransactions.invoke(label); }


   /**
    * listtransactions ( "label" count skip include_watchonly )
    * 
    * If a label name is provided, this will return only incoming transactions paying to addresses with the specified label.
    * 
    * Returns up to 'count' most recent transactions skipping the first 'from' transactions.
    * 
    * Arguments:
    * 1. label                (string, optional) If set, should be a valid label name to return only incoming transactions
    *                         with the specified label, or "*" to disable filtering and return all transactions.
    * 2. count                (numeric, optional, default=10) The number of transactions to return
    * 3. skip                 (numeric, optional, default=0) The number of transactions to skip
    * 4. include_watchonly    (boolean, optional, default=true for watch-only wallets, otherwise false) Include transactions to watch-only addresses (see 'importaddress')
    * 
    * Result:
    * [                                        (json array)
    *   {                                      (json object)
    *     "involvesWatchonly" : true|false,    (boolean) Only returns true if imported addresses were involved in transaction.
    *     "address" : "str",                   (string) The bitcoin address of the transaction.
    *     "category" : "str",                  (string) The transaction category.
    *                                          "send"                  Transactions sent.
    *                                          "receive"               Non-coinbase transactions received.
    *                                          "generate"              Coinbase transactions received with more than 100 confirmations.
    *                                          "immature"              Coinbase transactions received with 100 or fewer confirmations.
    *                                          "orphan"                Orphaned coinbase transactions received.
    *     "amount" : n,                        (numeric) The amount in BTC. This is negative for the 'send' category, and is positive
    *                                          for all other categories
    *     "label" : "str",                     (string) A comment for the address/transaction, if any
    *     "vout" : n,                          (numeric) the vout value
    *     "fee" : n,                           (numeric) The amount of the fee in BTC. This is negative and only available for the
    *                                          'send' category of transactions.
    *     "confirmations" : n,                 (numeric) The number of confirmations for the transaction. Negative confirmations means the
    *                                          transaction conflicted that many blocks ago.
    *     "generated" : true|false,            (boolean) Only present if transaction only input is a coinbase one.
    *     "trusted" : true|false,              (boolean) Only present if we consider transaction to be trusted and so safe to spend from.
    *     "blockhash" : "hex",                 (string) The block hash containing the transaction.
    *     "blockheight" : n,                   (numeric) The block height containing the transaction.
    *     "blockindex" : n,                    (numeric) The index of the transaction in the block that includes it.
    *     "blocktime" : xxx,                   (numeric) The block time expressed in UNIX epoch time.
    *     "txid" : "hex",                      (string) The transaction id.
    *     "walletconflicts" : [                (json array) Conflicting transaction ids.
    *       "hex",                             (string) The transaction id.
    *       ...
    *     ],
    *     "time" : xxx,                        (numeric) The transaction time expressed in UNIX epoch time.
    *     "timereceived" : xxx,                (numeric) The time received expressed in UNIX epoch time.
    *     "comment" : "str",                   (string) If a comment is associated with the transaction, only present if not empty.
    *     "bip125-replaceable" : "str",        (string) ("yes|no|unknown") Whether this transaction could be replaced due to BIP125 (replace-by-fee);
    *                                          may be unknown for unconfirmed transactions not in the mempool
    *     "abandoned" : true|false             (boolean) 'true' if the transaction has been abandoned (inputs are respendable). Only available for the 
    *                                          'send' category of transactions.
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * 
    * List the most recent 10 transactions in the systems
    * > bitcoin-cli listtransactions 
    * 
    * List transactions 100 to 120
    * > bitcoin-cli listtransactions "*" 20 100
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listtransactions", "params": ["*", 20, 100]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object listtransactions(Object label, Object count) { return listtransactions.invoke(label, count); }


   /**
    * listtransactions ( "label" count skip include_watchonly )
    * 
    * If a label name is provided, this will return only incoming transactions paying to addresses with the specified label.
    * 
    * Returns up to 'count' most recent transactions skipping the first 'from' transactions.
    * 
    * Arguments:
    * 1. label                (string, optional) If set, should be a valid label name to return only incoming transactions
    *                         with the specified label, or "*" to disable filtering and return all transactions.
    * 2. count                (numeric, optional, default=10) The number of transactions to return
    * 3. skip                 (numeric, optional, default=0) The number of transactions to skip
    * 4. include_watchonly    (boolean, optional, default=true for watch-only wallets, otherwise false) Include transactions to watch-only addresses (see 'importaddress')
    * 
    * Result:
    * [                                        (json array)
    *   {                                      (json object)
    *     "involvesWatchonly" : true|false,    (boolean) Only returns true if imported addresses were involved in transaction.
    *     "address" : "str",                   (string) The bitcoin address of the transaction.
    *     "category" : "str",                  (string) The transaction category.
    *                                          "send"                  Transactions sent.
    *                                          "receive"               Non-coinbase transactions received.
    *                                          "generate"              Coinbase transactions received with more than 100 confirmations.
    *                                          "immature"              Coinbase transactions received with 100 or fewer confirmations.
    *                                          "orphan"                Orphaned coinbase transactions received.
    *     "amount" : n,                        (numeric) The amount in BTC. This is negative for the 'send' category, and is positive
    *                                          for all other categories
    *     "label" : "str",                     (string) A comment for the address/transaction, if any
    *     "vout" : n,                          (numeric) the vout value
    *     "fee" : n,                           (numeric) The amount of the fee in BTC. This is negative and only available for the
    *                                          'send' category of transactions.
    *     "confirmations" : n,                 (numeric) The number of confirmations for the transaction. Negative confirmations means the
    *                                          transaction conflicted that many blocks ago.
    *     "generated" : true|false,            (boolean) Only present if transaction only input is a coinbase one.
    *     "trusted" : true|false,              (boolean) Only present if we consider transaction to be trusted and so safe to spend from.
    *     "blockhash" : "hex",                 (string) The block hash containing the transaction.
    *     "blockheight" : n,                   (numeric) The block height containing the transaction.
    *     "blockindex" : n,                    (numeric) The index of the transaction in the block that includes it.
    *     "blocktime" : xxx,                   (numeric) The block time expressed in UNIX epoch time.
    *     "txid" : "hex",                      (string) The transaction id.
    *     "walletconflicts" : [                (json array) Conflicting transaction ids.
    *       "hex",                             (string) The transaction id.
    *       ...
    *     ],
    *     "time" : xxx,                        (numeric) The transaction time expressed in UNIX epoch time.
    *     "timereceived" : xxx,                (numeric) The time received expressed in UNIX epoch time.
    *     "comment" : "str",                   (string) If a comment is associated with the transaction, only present if not empty.
    *     "bip125-replaceable" : "str",        (string) ("yes|no|unknown") Whether this transaction could be replaced due to BIP125 (replace-by-fee);
    *                                          may be unknown for unconfirmed transactions not in the mempool
    *     "abandoned" : true|false             (boolean) 'true' if the transaction has been abandoned (inputs are respendable). Only available for the 
    *                                          'send' category of transactions.
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * 
    * List the most recent 10 transactions in the systems
    * > bitcoin-cli listtransactions 
    * 
    * List transactions 100 to 120
    * > bitcoin-cli listtransactions "*" 20 100
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listtransactions", "params": ["*", 20, 100]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object listtransactions(Object label, Object count, Object skip) { return listtransactions.invoke(label, count, skip); }


   /**
    * listtransactions ( "label" count skip include_watchonly )
    * 
    * If a label name is provided, this will return only incoming transactions paying to addresses with the specified label.
    * 
    * Returns up to 'count' most recent transactions skipping the first 'from' transactions.
    * 
    * Arguments:
    * 1. label                (string, optional) If set, should be a valid label name to return only incoming transactions
    *                         with the specified label, or "*" to disable filtering and return all transactions.
    * 2. count                (numeric, optional, default=10) The number of transactions to return
    * 3. skip                 (numeric, optional, default=0) The number of transactions to skip
    * 4. include_watchonly    (boolean, optional, default=true for watch-only wallets, otherwise false) Include transactions to watch-only addresses (see 'importaddress')
    * 
    * Result:
    * [                                        (json array)
    *   {                                      (json object)
    *     "involvesWatchonly" : true|false,    (boolean) Only returns true if imported addresses were involved in transaction.
    *     "address" : "str",                   (string) The bitcoin address of the transaction.
    *     "category" : "str",                  (string) The transaction category.
    *                                          "send"                  Transactions sent.
    *                                          "receive"               Non-coinbase transactions received.
    *                                          "generate"              Coinbase transactions received with more than 100 confirmations.
    *                                          "immature"              Coinbase transactions received with 100 or fewer confirmations.
    *                                          "orphan"                Orphaned coinbase transactions received.
    *     "amount" : n,                        (numeric) The amount in BTC. This is negative for the 'send' category, and is positive
    *                                          for all other categories
    *     "label" : "str",                     (string) A comment for the address/transaction, if any
    *     "vout" : n,                          (numeric) the vout value
    *     "fee" : n,                           (numeric) The amount of the fee in BTC. This is negative and only available for the
    *                                          'send' category of transactions.
    *     "confirmations" : n,                 (numeric) The number of confirmations for the transaction. Negative confirmations means the
    *                                          transaction conflicted that many blocks ago.
    *     "generated" : true|false,            (boolean) Only present if transaction only input is a coinbase one.
    *     "trusted" : true|false,              (boolean) Only present if we consider transaction to be trusted and so safe to spend from.
    *     "blockhash" : "hex",                 (string) The block hash containing the transaction.
    *     "blockheight" : n,                   (numeric) The block height containing the transaction.
    *     "blockindex" : n,                    (numeric) The index of the transaction in the block that includes it.
    *     "blocktime" : xxx,                   (numeric) The block time expressed in UNIX epoch time.
    *     "txid" : "hex",                      (string) The transaction id.
    *     "walletconflicts" : [                (json array) Conflicting transaction ids.
    *       "hex",                             (string) The transaction id.
    *       ...
    *     ],
    *     "time" : xxx,                        (numeric) The transaction time expressed in UNIX epoch time.
    *     "timereceived" : xxx,                (numeric) The time received expressed in UNIX epoch time.
    *     "comment" : "str",                   (string) If a comment is associated with the transaction, only present if not empty.
    *     "bip125-replaceable" : "str",        (string) ("yes|no|unknown") Whether this transaction could be replaced due to BIP125 (replace-by-fee);
    *                                          may be unknown for unconfirmed transactions not in the mempool
    *     "abandoned" : true|false             (boolean) 'true' if the transaction has been abandoned (inputs are respendable). Only available for the 
    *                                          'send' category of transactions.
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * 
    * List the most recent 10 transactions in the systems
    * > bitcoin-cli listtransactions 
    * 
    * List transactions 100 to 120
    * > bitcoin-cli listtransactions "*" 20 100
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listtransactions", "params": ["*", 20, 100]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object listtransactions(Object label, Object count, Object skip, Object include_watchonly) { return listtransactions.invoke(label, count, skip, include_watchonly); }

   /**
    * addnode "node" "command"
    * 
    * Attempts to add or remove a node from the addnode list.
    * Or try a connection to a node once.
    * Nodes added using addnode (or -connect) are protected from DoS disconnection and are not required to be
    * full nodes/support SegWit as other outbound peers are (though such peers will not be synced from).
    * Addnode connections are limited to 8 at a time and are counted separately from the -maxconnections limit.
    * 
    * Arguments:
    * 1. node       (string, required) The node (see getpeerinfo for nodes)
    * 2. command    (string, required) 'add' to add a node to the list, 'remove' to remove a node from the list, 'onetry' to try a connection to the node once
    * 
    * Result:
    * null    (json null)
    * 
    * Examples:
    * > bitcoin-cli addnode "192.168.0.6:8333" "onetry"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "addnode", "params": ["192.168.0.6:8333", "onetry"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object addnode(Object node, Object command) { return addnode.invoke(node, command); }

   /**
    * verifychain ( checklevel nblocks )
    * 
    * Verifies blockchain database.
    * 
    * Arguments:
    * 1. checklevel    (numeric, optional, default=3, range=0-4) How thorough the block verification is:
    *                  - level 0 reads the blocks from disk
    *                  - level 1 verifies block validity
    *                  - level 2 verifies undo data
    *                  - level 3 checks disconnection of tip blocks
    *                  - level 4 tries to reconnect the blocks
    *                  - each level includes the checks of the previous levels
    * 2. nblocks       (numeric, optional, default=6, 0=all) The number of blocks to check.
    * 
    * Result:
    * true|false    (boolean) Verified or not
    * 
    * Examples:
    * > bitcoin-cli verifychain 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "verifychain", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object verifychain(Object checklevel, Object nblocks) { return verifychain.invoke(checklevel, nblocks); }

   /**
    * lockunspent unlock ( [{"txid":"hex","vout":n},...] )
    * 
    * Updates list of temporarily unspendable outputs.
    * Temporarily lock (unlock=false) or unlock (unlock=true) specified transaction outputs.
    * If no transaction outputs are specified when unlocking then all current locked transaction outputs are unlocked.
    * A locked transaction output will not be chosen by automatic coin selection, when spending bitcoins.
    * Manually selected coins are automatically unlocked.
    * Locks are stored in memory only. Nodes start with zero locked outputs, and the locked output list
    * is always cleared (by virtue of process exit) when a node stops or fails.
    * Also see the listunspent call
    * 
    * Arguments:
    * 1. unlock                  (boolean, required) Whether to unlock (true) or lock (false) the specified transactions
    * 2. transactions            (json array, optional, default=[]) The transaction outputs and within each, the txid (string) vout (numeric).
    *      [
    *        {                   (json object)
    *          "txid": "hex",    (string, required) The transaction id
    *          "vout": n,        (numeric, required) The output number
    *        },
    *        ...
    *      ]
    * 
    * Result:
    * true|false    (boolean) Whether the command was successful or not
    * 
    * Examples:
    * 
    * List the unspent transactions
    * > bitcoin-cli listunspent 
    * 
    * Lock an unspent transaction
    * > bitcoin-cli lockunspent false "[{\"txid\":\"a08e6907dbbd3d809776dbfc5d82e371b764ed838b5655e72f463568df1aadf0\",\"vout\":1}]"
    * 
    * List the locked transactions
    * > bitcoin-cli listlockunspent 
    * 
    * Unlock the transaction again
    * > bitcoin-cli lockunspent true "[{\"txid\":\"a08e6907dbbd3d809776dbfc5d82e371b764ed838b5655e72f463568df1aadf0\",\"vout\":1}]"
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "lockunspent", "params": [false, "[{\"txid\":\"a08e6907dbbd3d809776dbfc5d82e371b764ed838b5655e72f463568df1aadf0\",\"vout\":1}]"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object lockunspent(Object unlock) { return lockunspent.invoke(unlock); }


   /**
    * lockunspent unlock ( [{"txid":"hex","vout":n},...] )
    * 
    * Updates list of temporarily unspendable outputs.
    * Temporarily lock (unlock=false) or unlock (unlock=true) specified transaction outputs.
    * If no transaction outputs are specified when unlocking then all current locked transaction outputs are unlocked.
    * A locked transaction output will not be chosen by automatic coin selection, when spending bitcoins.
    * Manually selected coins are automatically unlocked.
    * Locks are stored in memory only. Nodes start with zero locked outputs, and the locked output list
    * is always cleared (by virtue of process exit) when a node stops or fails.
    * Also see the listunspent call
    * 
    * Arguments:
    * 1. unlock                  (boolean, required) Whether to unlock (true) or lock (false) the specified transactions
    * 2. transactions            (json array, optional, default=[]) The transaction outputs and within each, the txid (string) vout (numeric).
    *      [
    *        {                   (json object)
    *          "txid": "hex",    (string, required) The transaction id
    *          "vout": n,        (numeric, required) The output number
    *        },
    *        ...
    *      ]
    * 
    * Result:
    * true|false    (boolean) Whether the command was successful or not
    * 
    * Examples:
    * 
    * List the unspent transactions
    * > bitcoin-cli listunspent 
    * 
    * Lock an unspent transaction
    * > bitcoin-cli lockunspent false "[{\"txid\":\"a08e6907dbbd3d809776dbfc5d82e371b764ed838b5655e72f463568df1aadf0\",\"vout\":1}]"
    * 
    * List the locked transactions
    * > bitcoin-cli listlockunspent 
    * 
    * Unlock the transaction again
    * > bitcoin-cli lockunspent true "[{\"txid\":\"a08e6907dbbd3d809776dbfc5d82e371b764ed838b5655e72f463568df1aadf0\",\"vout\":1}]"
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "lockunspent", "params": [false, "[{\"txid\":\"a08e6907dbbd3d809776dbfc5d82e371b764ed838b5655e72f463568df1aadf0\",\"vout\":1}]"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object lockunspent(Object unlock, Object txid_vouts) { return lockunspent.invoke(unlock, txid_vouts); }

   /**
    * analyzepsbt "psbt"
    * 
    * Analyzes and provides information about the current status of a PSBT and its inputs
    * 
    * Arguments:
    * 1. psbt    (string, required) A base64 string of a PSBT
    * 
    * Result:
    * {                                   (json object)
    *   "inputs" : [                      (json array)
    *     {                               (json object)
    *       "has_utxo" : true|false,      (boolean) Whether a UTXO is provided
    *       "is_final" : true|false,      (boolean) Whether the input is finalized
    *       "missing" : {                 (json object, optional) Things that are missing that are required to complete this input
    *         "pubkeys" : [               (json array, optional)
    *           "hex",                    (string) Public key ID, hash160 of the public key, of a public key whose BIP 32 derivation path is missing
    *           ...
    *         ],
    *         "signatures" : [            (json array, optional)
    *           "hex",                    (string) Public key ID, hash160 of the public key, of a public key whose signature is missing
    *           ...
    *         ],
    *         "redeemscript" : "hex",     (string, optional) Hash160 of the redeemScript that is missing
    *         "witnessscript" : "hex"     (string, optional) SHA256 of the witnessScript that is missing
    *       },
    *       "next" : "str"                (string, optional) Role of the next person that this input needs to go to
    *     },
    *     ...
    *   ],
    *   "estimated_vsize" : n,            (numeric, optional) Estimated vsize of the final signed transaction
    *   "estimated_feerate" : n,          (numeric, optional) Estimated feerate of the final signed transaction in BTC/kvB. Shown only if all UTXO slots in the PSBT have been filled
    *   "fee" : n,                        (numeric, optional) The transaction fee paid. Shown only if all UTXO slots in the PSBT have been filled
    *   "next" : "str",                   (string) Role of the next person that this psbt needs to go to
    *   "error" : "str"                   (string, optional) Error message (if there is one)
    * }
    * 
    * Examples:
    * > bitcoin-cli analyzepsbt "psbt"
    */
   public Object analyzepsbt(Object psbt) { return analyzepsbt.invoke(psbt); }

   /**
    * disconnectnode ( "address" nodeid )
    * 
    * Immediately disconnects from the specified peer node.
    * 
    * Strictly one out of 'address' and 'nodeid' can be provided to identify the node.
    * 
    * To disconnect by nodeid, either set 'address' to the empty string, or call using the named 'nodeid' argument only.
    * 
    * Arguments:
    * 1. address    (string, optional, default=fallback to nodeid) The IP address/port of the node
    * 2. nodeid     (numeric, optional, default=fallback to address) The node ID (see getpeerinfo for node IDs)
    * 
    * Result:
    * null    (json null)
    * 
    * Examples:
    * > bitcoin-cli disconnectnode "192.168.0.6:8333"
    * > bitcoin-cli disconnectnode "" 1
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "disconnectnode", "params": ["192.168.0.6:8333"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "disconnectnode", "params": ["", 1]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object disconnectnode() { return disconnectnode.invoke(); }


   /**
    * disconnectnode ( "address" nodeid )
    * 
    * Immediately disconnects from the specified peer node.
    * 
    * Strictly one out of 'address' and 'nodeid' can be provided to identify the node.
    * 
    * To disconnect by nodeid, either set 'address' to the empty string, or call using the named 'nodeid' argument only.
    * 
    * Arguments:
    * 1. address    (string, optional, default=fallback to nodeid) The IP address/port of the node
    * 2. nodeid     (numeric, optional, default=fallback to address) The node ID (see getpeerinfo for node IDs)
    * 
    * Result:
    * null    (json null)
    * 
    * Examples:
    * > bitcoin-cli disconnectnode "192.168.0.6:8333"
    * > bitcoin-cli disconnectnode "" 1
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "disconnectnode", "params": ["192.168.0.6:8333"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "disconnectnode", "params": ["", 1]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object disconnectnode(Object address) { return disconnectnode.invoke(address); }


   /**
    * disconnectnode ( "address" nodeid )
    * 
    * Immediately disconnects from the specified peer node.
    * 
    * Strictly one out of 'address' and 'nodeid' can be provided to identify the node.
    * 
    * To disconnect by nodeid, either set 'address' to the empty string, or call using the named 'nodeid' argument only.
    * 
    * Arguments:
    * 1. address    (string, optional, default=fallback to nodeid) The IP address/port of the node
    * 2. nodeid     (numeric, optional, default=fallback to address) The node ID (see getpeerinfo for node IDs)
    * 
    * Result:
    * null    (json null)
    * 
    * Examples:
    * > bitcoin-cli disconnectnode "192.168.0.6:8333"
    * > bitcoin-cli disconnectnode "" 1
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "disconnectnode", "params": ["192.168.0.6:8333"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "disconnectnode", "params": ["", 1]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object disconnectnode(Object address, Object nodeid) { return disconnectnode.invoke(address, nodeid); }

   /**
    * listlabels ( "purpose" )
    * 
    * Returns the list of all labels, or labels that are assigned to addresses with a specific purpose.
    * 
    * Arguments:
    * 1. purpose    (string, optional) Address purpose to list labels for ('send','receive'). An empty string is the same as not providing this argument.
    * 
    * Result:
    * [           (json array)
    *   "str",    (string) Label name
    *   ...
    * ]
    * 
    * Examples:
    * 
    * List all labels
    * > bitcoin-cli listlabels 
    * 
    * List labels that have receiving addresses
    * > bitcoin-cli listlabels receive
    * 
    * List labels that have sending addresses
    * > bitcoin-cli listlabels send
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listlabels", "params": [receive]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object listlabels() { return listlabels.invoke(); }


   /**
    * listlabels ( "purpose" )
    * 
    * Returns the list of all labels, or labels that are assigned to addresses with a specific purpose.
    * 
    * Arguments:
    * 1. purpose    (string, optional) Address purpose to list labels for ('send','receive'). An empty string is the same as not providing this argument.
    * 
    * Result:
    * [           (json array)
    *   "str",    (string) Label name
    *   ...
    * ]
    * 
    * Examples:
    * 
    * List all labels
    * > bitcoin-cli listlabels 
    * 
    * List labels that have receiving addresses
    * > bitcoin-cli listlabels receive
    * 
    * List labels that have sending addresses
    * > bitcoin-cli listlabels send
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listlabels", "params": [receive]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object listlabels(Object purpose) { return listlabels.invoke(purpose); }

   /**
    * listunspent ( minconf maxconf ["address",...] include_unsafe query_options )
    * 
    * Returns array of unspent transaction outputs
    * with between minconf and maxconf (inclusive) confirmations.
    * Optionally filter to only include txouts paid to specified addresses.
    * 
    * Arguments:
    * 1. minconf                            (numeric, optional, default=1) The minimum confirmations to filter
    * 2. maxconf                            (numeric, optional, default=9999999) The maximum confirmations to filter
    * 3. addresses                          (json array, optional, default=[]) The bitcoin addresses to filter
    *      [
    *        "address",                     (string) bitcoin address
    *        ...
    *      ]
    * 4. include_unsafe                     (boolean, optional, default=true) Include outputs that are not safe to spend
    *                                       See description of "safe" attribute below.
    * 5. query_options                      (json object, optional) JSON with query options
    *      {
    *        "minimumAmount": amount,       (numeric or string, optional, default="0.00") Minimum value of each UTXO in BTC
    *        "maximumAmount": amount,       (numeric or string, optional, default=unlimited) Maximum value of each UTXO in BTC
    *        "maximumCount": n,             (numeric, optional, default=unlimited) Maximum number of UTXOs
    *        "minimumSumAmount": amount,    (numeric or string, optional, default=unlimited) Minimum sum value of all UTXOs in BTC
    *      }
    * 
    * Result:
    * [                                (json array)
    *   {                              (json object)
    *     "txid" : "hex",              (string) the transaction id
    *     "vout" : n,                  (numeric) the vout value
    *     "address" : "str",           (string) the bitcoin address
    *     "label" : "str",             (string) The associated label, or "" for the default label
    *     "scriptPubKey" : "str",      (string) the script key
    *     "amount" : n,                (numeric) the transaction output amount in BTC
    *     "confirmations" : n,         (numeric) The number of confirmations
    *     "redeemScript" : "hex",      (string) The redeemScript if scriptPubKey is P2SH
    *     "witnessScript" : "str",     (string) witnessScript if the scriptPubKey is P2WSH or P2SH-P2WSH
    *     "spendable" : true|false,    (boolean) Whether we have the private keys to spend this output
    *     "solvable" : true|false,     (boolean) Whether we know how to spend this output, ignoring the lack of keys
    *     "reused" : true|false,       (boolean) (only present if avoid_reuse is set) Whether this output is reused/dirty (sent to an address that was previously spent from)
    *     "desc" : "str",              (string) (only when solvable) A descriptor for spending this output
    *     "safe" : true|false          (boolean) Whether this output is considered safe to spend. Unconfirmed transactions
    *                                  from outside keys and unconfirmed replacement transactions are considered unsafe
    *                                  and are not eligible for spending by fundrawtransaction and sendtoaddress.
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * > bitcoin-cli listunspent 
    * > bitcoin-cli listunspent 6 9999999 "[\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\",\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\"]"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listunspent", "params": [6, 9999999 "[\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\",\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\"]"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > bitcoin-cli listunspent 6 9999999 '[]' true '{ "minimumAmount": 0.005 }'
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listunspent", "params": [6, 9999999, [] , true, { "minimumAmount": 0.005 } ]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object listunspent() { return listunspent.invoke(); }


   /**
    * listunspent ( minconf maxconf ["address",...] include_unsafe query_options )
    * 
    * Returns array of unspent transaction outputs
    * with between minconf and maxconf (inclusive) confirmations.
    * Optionally filter to only include txouts paid to specified addresses.
    * 
    * Arguments:
    * 1. minconf                            (numeric, optional, default=1) The minimum confirmations to filter
    * 2. maxconf                            (numeric, optional, default=9999999) The maximum confirmations to filter
    * 3. addresses                          (json array, optional, default=[]) The bitcoin addresses to filter
    *      [
    *        "address",                     (string) bitcoin address
    *        ...
    *      ]
    * 4. include_unsafe                     (boolean, optional, default=true) Include outputs that are not safe to spend
    *                                       See description of "safe" attribute below.
    * 5. query_options                      (json object, optional) JSON with query options
    *      {
    *        "minimumAmount": amount,       (numeric or string, optional, default="0.00") Minimum value of each UTXO in BTC
    *        "maximumAmount": amount,       (numeric or string, optional, default=unlimited) Maximum value of each UTXO in BTC
    *        "maximumCount": n,             (numeric, optional, default=unlimited) Maximum number of UTXOs
    *        "minimumSumAmount": amount,    (numeric or string, optional, default=unlimited) Minimum sum value of all UTXOs in BTC
    *      }
    * 
    * Result:
    * [                                (json array)
    *   {                              (json object)
    *     "txid" : "hex",              (string) the transaction id
    *     "vout" : n,                  (numeric) the vout value
    *     "address" : "str",           (string) the bitcoin address
    *     "label" : "str",             (string) The associated label, or "" for the default label
    *     "scriptPubKey" : "str",      (string) the script key
    *     "amount" : n,                (numeric) the transaction output amount in BTC
    *     "confirmations" : n,         (numeric) The number of confirmations
    *     "redeemScript" : "hex",      (string) The redeemScript if scriptPubKey is P2SH
    *     "witnessScript" : "str",     (string) witnessScript if the scriptPubKey is P2WSH or P2SH-P2WSH
    *     "spendable" : true|false,    (boolean) Whether we have the private keys to spend this output
    *     "solvable" : true|false,     (boolean) Whether we know how to spend this output, ignoring the lack of keys
    *     "reused" : true|false,       (boolean) (only present if avoid_reuse is set) Whether this output is reused/dirty (sent to an address that was previously spent from)
    *     "desc" : "str",              (string) (only when solvable) A descriptor for spending this output
    *     "safe" : true|false          (boolean) Whether this output is considered safe to spend. Unconfirmed transactions
    *                                  from outside keys and unconfirmed replacement transactions are considered unsafe
    *                                  and are not eligible for spending by fundrawtransaction and sendtoaddress.
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * > bitcoin-cli listunspent 
    * > bitcoin-cli listunspent 6 9999999 "[\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\",\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\"]"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listunspent", "params": [6, 9999999 "[\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\",\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\"]"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > bitcoin-cli listunspent 6 9999999 '[]' true '{ "minimumAmount": 0.005 }'
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listunspent", "params": [6, 9999999, [] , true, { "minimumAmount": 0.005 } ]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object listunspent(Object minconf) { return listunspent.invoke(minconf); }


   /**
    * listunspent ( minconf maxconf ["address",...] include_unsafe query_options )
    * 
    * Returns array of unspent transaction outputs
    * with between minconf and maxconf (inclusive) confirmations.
    * Optionally filter to only include txouts paid to specified addresses.
    * 
    * Arguments:
    * 1. minconf                            (numeric, optional, default=1) The minimum confirmations to filter
    * 2. maxconf                            (numeric, optional, default=9999999) The maximum confirmations to filter
    * 3. addresses                          (json array, optional, default=[]) The bitcoin addresses to filter
    *      [
    *        "address",                     (string) bitcoin address
    *        ...
    *      ]
    * 4. include_unsafe                     (boolean, optional, default=true) Include outputs that are not safe to spend
    *                                       See description of "safe" attribute below.
    * 5. query_options                      (json object, optional) JSON with query options
    *      {
    *        "minimumAmount": amount,       (numeric or string, optional, default="0.00") Minimum value of each UTXO in BTC
    *        "maximumAmount": amount,       (numeric or string, optional, default=unlimited) Maximum value of each UTXO in BTC
    *        "maximumCount": n,             (numeric, optional, default=unlimited) Maximum number of UTXOs
    *        "minimumSumAmount": amount,    (numeric or string, optional, default=unlimited) Minimum sum value of all UTXOs in BTC
    *      }
    * 
    * Result:
    * [                                (json array)
    *   {                              (json object)
    *     "txid" : "hex",              (string) the transaction id
    *     "vout" : n,                  (numeric) the vout value
    *     "address" : "str",           (string) the bitcoin address
    *     "label" : "str",             (string) The associated label, or "" for the default label
    *     "scriptPubKey" : "str",      (string) the script key
    *     "amount" : n,                (numeric) the transaction output amount in BTC
    *     "confirmations" : n,         (numeric) The number of confirmations
    *     "redeemScript" : "hex",      (string) The redeemScript if scriptPubKey is P2SH
    *     "witnessScript" : "str",     (string) witnessScript if the scriptPubKey is P2WSH or P2SH-P2WSH
    *     "spendable" : true|false,    (boolean) Whether we have the private keys to spend this output
    *     "solvable" : true|false,     (boolean) Whether we know how to spend this output, ignoring the lack of keys
    *     "reused" : true|false,       (boolean) (only present if avoid_reuse is set) Whether this output is reused/dirty (sent to an address that was previously spent from)
    *     "desc" : "str",              (string) (only when solvable) A descriptor for spending this output
    *     "safe" : true|false          (boolean) Whether this output is considered safe to spend. Unconfirmed transactions
    *                                  from outside keys and unconfirmed replacement transactions are considered unsafe
    *                                  and are not eligible for spending by fundrawtransaction and sendtoaddress.
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * > bitcoin-cli listunspent 
    * > bitcoin-cli listunspent 6 9999999 "[\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\",\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\"]"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listunspent", "params": [6, 9999999 "[\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\",\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\"]"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > bitcoin-cli listunspent 6 9999999 '[]' true '{ "minimumAmount": 0.005 }'
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listunspent", "params": [6, 9999999, [] , true, { "minimumAmount": 0.005 } ]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object listunspent(Object minconf, Object maxconf) { return listunspent.invoke(minconf, maxconf); }


   /**
    * listunspent ( minconf maxconf ["address",...] include_unsafe query_options )
    * 
    * Returns array of unspent transaction outputs
    * with between minconf and maxconf (inclusive) confirmations.
    * Optionally filter to only include txouts paid to specified addresses.
    * 
    * Arguments:
    * 1. minconf                            (numeric, optional, default=1) The minimum confirmations to filter
    * 2. maxconf                            (numeric, optional, default=9999999) The maximum confirmations to filter
    * 3. addresses                          (json array, optional, default=[]) The bitcoin addresses to filter
    *      [
    *        "address",                     (string) bitcoin address
    *        ...
    *      ]
    * 4. include_unsafe                     (boolean, optional, default=true) Include outputs that are not safe to spend
    *                                       See description of "safe" attribute below.
    * 5. query_options                      (json object, optional) JSON with query options
    *      {
    *        "minimumAmount": amount,       (numeric or string, optional, default="0.00") Minimum value of each UTXO in BTC
    *        "maximumAmount": amount,       (numeric or string, optional, default=unlimited) Maximum value of each UTXO in BTC
    *        "maximumCount": n,             (numeric, optional, default=unlimited) Maximum number of UTXOs
    *        "minimumSumAmount": amount,    (numeric or string, optional, default=unlimited) Minimum sum value of all UTXOs in BTC
    *      }
    * 
    * Result:
    * [                                (json array)
    *   {                              (json object)
    *     "txid" : "hex",              (string) the transaction id
    *     "vout" : n,                  (numeric) the vout value
    *     "address" : "str",           (string) the bitcoin address
    *     "label" : "str",             (string) The associated label, or "" for the default label
    *     "scriptPubKey" : "str",      (string) the script key
    *     "amount" : n,                (numeric) the transaction output amount in BTC
    *     "confirmations" : n,         (numeric) The number of confirmations
    *     "redeemScript" : "hex",      (string) The redeemScript if scriptPubKey is P2SH
    *     "witnessScript" : "str",     (string) witnessScript if the scriptPubKey is P2WSH or P2SH-P2WSH
    *     "spendable" : true|false,    (boolean) Whether we have the private keys to spend this output
    *     "solvable" : true|false,     (boolean) Whether we know how to spend this output, ignoring the lack of keys
    *     "reused" : true|false,       (boolean) (only present if avoid_reuse is set) Whether this output is reused/dirty (sent to an address that was previously spent from)
    *     "desc" : "str",              (string) (only when solvable) A descriptor for spending this output
    *     "safe" : true|false          (boolean) Whether this output is considered safe to spend. Unconfirmed transactions
    *                                  from outside keys and unconfirmed replacement transactions are considered unsafe
    *                                  and are not eligible for spending by fundrawtransaction and sendtoaddress.
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * > bitcoin-cli listunspent 
    * > bitcoin-cli listunspent 6 9999999 "[\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\",\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\"]"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listunspent", "params": [6, 9999999 "[\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\",\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\"]"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > bitcoin-cli listunspent 6 9999999 '[]' true '{ "minimumAmount": 0.005 }'
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listunspent", "params": [6, 9999999, [] , true, { "minimumAmount": 0.005 } ]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object listunspent(Object minconf, Object maxconf, Object addresses) { return listunspent.invoke(minconf, maxconf, addresses); }


   /**
    * listunspent ( minconf maxconf ["address",...] include_unsafe query_options )
    * 
    * Returns array of unspent transaction outputs
    * with between minconf and maxconf (inclusive) confirmations.
    * Optionally filter to only include txouts paid to specified addresses.
    * 
    * Arguments:
    * 1. minconf                            (numeric, optional, default=1) The minimum confirmations to filter
    * 2. maxconf                            (numeric, optional, default=9999999) The maximum confirmations to filter
    * 3. addresses                          (json array, optional, default=[]) The bitcoin addresses to filter
    *      [
    *        "address",                     (string) bitcoin address
    *        ...
    *      ]
    * 4. include_unsafe                     (boolean, optional, default=true) Include outputs that are not safe to spend
    *                                       See description of "safe" attribute below.
    * 5. query_options                      (json object, optional) JSON with query options
    *      {
    *        "minimumAmount": amount,       (numeric or string, optional, default="0.00") Minimum value of each UTXO in BTC
    *        "maximumAmount": amount,       (numeric or string, optional, default=unlimited) Maximum value of each UTXO in BTC
    *        "maximumCount": n,             (numeric, optional, default=unlimited) Maximum number of UTXOs
    *        "minimumSumAmount": amount,    (numeric or string, optional, default=unlimited) Minimum sum value of all UTXOs in BTC
    *      }
    * 
    * Result:
    * [                                (json array)
    *   {                              (json object)
    *     "txid" : "hex",              (string) the transaction id
    *     "vout" : n,                  (numeric) the vout value
    *     "address" : "str",           (string) the bitcoin address
    *     "label" : "str",             (string) The associated label, or "" for the default label
    *     "scriptPubKey" : "str",      (string) the script key
    *     "amount" : n,                (numeric) the transaction output amount in BTC
    *     "confirmations" : n,         (numeric) The number of confirmations
    *     "redeemScript" : "hex",      (string) The redeemScript if scriptPubKey is P2SH
    *     "witnessScript" : "str",     (string) witnessScript if the scriptPubKey is P2WSH or P2SH-P2WSH
    *     "spendable" : true|false,    (boolean) Whether we have the private keys to spend this output
    *     "solvable" : true|false,     (boolean) Whether we know how to spend this output, ignoring the lack of keys
    *     "reused" : true|false,       (boolean) (only present if avoid_reuse is set) Whether this output is reused/dirty (sent to an address that was previously spent from)
    *     "desc" : "str",              (string) (only when solvable) A descriptor for spending this output
    *     "safe" : true|false          (boolean) Whether this output is considered safe to spend. Unconfirmed transactions
    *                                  from outside keys and unconfirmed replacement transactions are considered unsafe
    *                                  and are not eligible for spending by fundrawtransaction and sendtoaddress.
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * > bitcoin-cli listunspent 
    * > bitcoin-cli listunspent 6 9999999 "[\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\",\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\"]"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listunspent", "params": [6, 9999999 "[\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\",\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\"]"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > bitcoin-cli listunspent 6 9999999 '[]' true '{ "minimumAmount": 0.005 }'
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listunspent", "params": [6, 9999999, [] , true, { "minimumAmount": 0.005 } ]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object listunspent(Object minconf, Object maxconf, Object addresses, Object include_unsafe) { return listunspent.invoke(minconf, maxconf, addresses, include_unsafe); }


   /**
    * listunspent ( minconf maxconf ["address",...] include_unsafe query_options )
    * 
    * Returns array of unspent transaction outputs
    * with between minconf and maxconf (inclusive) confirmations.
    * Optionally filter to only include txouts paid to specified addresses.
    * 
    * Arguments:
    * 1. minconf                            (numeric, optional, default=1) The minimum confirmations to filter
    * 2. maxconf                            (numeric, optional, default=9999999) The maximum confirmations to filter
    * 3. addresses                          (json array, optional, default=[]) The bitcoin addresses to filter
    *      [
    *        "address",                     (string) bitcoin address
    *        ...
    *      ]
    * 4. include_unsafe                     (boolean, optional, default=true) Include outputs that are not safe to spend
    *                                       See description of "safe" attribute below.
    * 5. query_options                      (json object, optional) JSON with query options
    *      {
    *        "minimumAmount": amount,       (numeric or string, optional, default="0.00") Minimum value of each UTXO in BTC
    *        "maximumAmount": amount,       (numeric or string, optional, default=unlimited) Maximum value of each UTXO in BTC
    *        "maximumCount": n,             (numeric, optional, default=unlimited) Maximum number of UTXOs
    *        "minimumSumAmount": amount,    (numeric or string, optional, default=unlimited) Minimum sum value of all UTXOs in BTC
    *      }
    * 
    * Result:
    * [                                (json array)
    *   {                              (json object)
    *     "txid" : "hex",              (string) the transaction id
    *     "vout" : n,                  (numeric) the vout value
    *     "address" : "str",           (string) the bitcoin address
    *     "label" : "str",             (string) The associated label, or "" for the default label
    *     "scriptPubKey" : "str",      (string) the script key
    *     "amount" : n,                (numeric) the transaction output amount in BTC
    *     "confirmations" : n,         (numeric) The number of confirmations
    *     "redeemScript" : "hex",      (string) The redeemScript if scriptPubKey is P2SH
    *     "witnessScript" : "str",     (string) witnessScript if the scriptPubKey is P2WSH or P2SH-P2WSH
    *     "spendable" : true|false,    (boolean) Whether we have the private keys to spend this output
    *     "solvable" : true|false,     (boolean) Whether we know how to spend this output, ignoring the lack of keys
    *     "reused" : true|false,       (boolean) (only present if avoid_reuse is set) Whether this output is reused/dirty (sent to an address that was previously spent from)
    *     "desc" : "str",              (string) (only when solvable) A descriptor for spending this output
    *     "safe" : true|false          (boolean) Whether this output is considered safe to spend. Unconfirmed transactions
    *                                  from outside keys and unconfirmed replacement transactions are considered unsafe
    *                                  and are not eligible for spending by fundrawtransaction and sendtoaddress.
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * > bitcoin-cli listunspent 
    * > bitcoin-cli listunspent 6 9999999 "[\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\",\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\"]"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listunspent", "params": [6, 9999999 "[\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\",\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\"]"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > bitcoin-cli listunspent 6 9999999 '[]' true '{ "minimumAmount": 0.005 }'
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listunspent", "params": [6, 9999999, [] , true, { "minimumAmount": 0.005 } ]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object listunspent(Object minconf, Object maxconf, Object addresses, Object include_unsafe, Object query_options) { return listunspent.invoke(minconf, maxconf, addresses, include_unsafe, query_options); }

   /**
    * prioritisetransaction "txid" ( dummy ) fee_delta
    * Accepts the transaction into mined blocks at a higher (or lower) priority
    * 
    * Arguments:
    * 1. txid         (string, required) The transaction id.
    * 2. dummy        (numeric, optional) API-Compatibility for previous API. Must be zero or null.
    *                 DEPRECATED. For forward compatibility use named arguments and omit this parameter.
    * 3. fee_delta    (numeric, required) The fee value (in satoshis) to add (or subtract, if negative).
    *                 Note, that this value is not a fee rate. It is a value to modify absolute fee of the TX.
    *                 The fee is not actually paid, only the algorithm for selecting transactions into a block
    *                 considers the transaction as it would have paid a higher (or lower) fee.
    * 
    * Result:
    * true|false    (boolean) Returns true
    * 
    * Examples:
    * > bitcoin-cli prioritisetransaction "txid" 0.0 10000
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "prioritisetransaction", "params": ["txid", 0.0, 10000]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object prioritisetransaction(Object txid, Object dummy, Object fee_delta) { return prioritisetransaction.invoke(txid, dummy, fee_delta); }

   /**
    * unloadwallet ( "wallet_name" load_on_startup )
    * Unloads the wallet referenced by the request endpoint otherwise unloads the wallet specified in the argument.
    * Specifying the wallet name on a wallet endpoint is invalid.
    * Arguments:
    * 1. wallet_name        (string, optional, default=the wallet name from the RPC endpoint) The name of the wallet to unload. If provided both here and in the RPC endpoint, the two must be identical.
    * 2. load_on_startup    (boolean, optional) Save wallet name to persistent settings and load on startup. True to add wallet to startup list, false to remove, null to leave unchanged.
    * 
    * Result:
    * {                       (json object)
    *   "warning" : "str"     (string) Warning message if wallet was not unloaded cleanly.
    * }
    * 
    * Examples:
    * > bitcoin-cli unloadwallet wallet_name
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "unloadwallet", "params": [wallet_name]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object unloadwallet() { return unloadwallet.invoke(); }


   /**
    * unloadwallet ( "wallet_name" load_on_startup )
    * Unloads the wallet referenced by the request endpoint otherwise unloads the wallet specified in the argument.
    * Specifying the wallet name on a wallet endpoint is invalid.
    * Arguments:
    * 1. wallet_name        (string, optional, default=the wallet name from the RPC endpoint) The name of the wallet to unload. If provided both here and in the RPC endpoint, the two must be identical.
    * 2. load_on_startup    (boolean, optional) Save wallet name to persistent settings and load on startup. True to add wallet to startup list, false to remove, null to leave unchanged.
    * 
    * Result:
    * {                       (json object)
    *   "warning" : "str"     (string) Warning message if wallet was not unloaded cleanly.
    * }
    * 
    * Examples:
    * > bitcoin-cli unloadwallet wallet_name
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "unloadwallet", "params": [wallet_name]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object unloadwallet(Object wallet_name) { return unloadwallet.invoke(wallet_name); }


   /**
    * unloadwallet ( "wallet_name" load_on_startup )
    * Unloads the wallet referenced by the request endpoint otherwise unloads the wallet specified in the argument.
    * Specifying the wallet name on a wallet endpoint is invalid.
    * Arguments:
    * 1. wallet_name        (string, optional, default=the wallet name from the RPC endpoint) The name of the wallet to unload. If provided both here and in the RPC endpoint, the two must be identical.
    * 2. load_on_startup    (boolean, optional) Save wallet name to persistent settings and load on startup. True to add wallet to startup list, false to remove, null to leave unchanged.
    * 
    * Result:
    * {                       (json object)
    *   "warning" : "str"     (string) Warning message if wallet was not unloaded cleanly.
    * }
    * 
    * Examples:
    * > bitcoin-cli unloadwallet wallet_name
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "unloadwallet", "params": [wallet_name]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object unloadwallet(Object wallet_name, Object load_on_startup) { return unloadwallet.invoke(wallet_name, load_on_startup); }

   /**
    * decoderawtransaction "hexstring" ( iswitness )
    * 
    * Return a JSON object representing the serialized, hex-encoded transaction.
    * 
    * Arguments:
    * 1. hexstring    (string, required) The transaction hex string
    * 2. iswitness    (boolean, optional, default=depends on heuristic tests) Whether the transaction hex is a serialized witness transaction.
    *                 If iswitness is not present, heuristic tests will be used in decoding.
    *                 If true, only witness deserialization will be tried.
    *                 If false, only non-witness deserialization will be tried.
    *                 This boolean should reflect whether the transaction has inputs
    *                 (e.g. fully valid, or on-chain transactions), if known by the caller.
    * 
    * Result:
    * {                             (json object)
    *   "txid" : "hex",             (string) The transaction id
    *   "hash" : "hex",             (string) The transaction hash (differs from txid for witness transactions)
    *   "size" : n,                 (numeric) The transaction size
    *   "vsize" : n,                (numeric) The virtual transaction size (differs from size for witness transactions)
    *   "weight" : n,               (numeric) The transaction's weight (between vsize*4 - 3 and vsize*4)
    *   "version" : n,              (numeric) The version
    *   "locktime" : xxx,           (numeric) The lock time
    *   "vin" : [                   (json array)
    *     {                         (json object)
    *       "txid" : "hex",         (string) The transaction id
    *       "vout" : n,             (numeric) The output number
    *       "scriptSig" : {         (json object) The script
    *         "asm" : "str",        (string) asm
    *         "hex" : "hex"         (string) hex
    *       },
    *       "txinwitness" : [       (json array)
    *         "hex",                (string) hex-encoded witness data (if any)
    *         ...
    *       ],
    *       "sequence" : n          (numeric) The script sequence number
    *     },
    *     ...
    *   ],
    *   "vout" : [                  (json array)
    *     {                         (json object)
    *       "value" : n,            (numeric) The value in BTC
    *       "n" : n,                (numeric) index
    *       "scriptPubKey" : {      (json object)
    *         "asm" : "str",        (string) the asm
    *         "hex" : "hex",        (string) the hex
    *         "reqSigs" : n,        (numeric, optional) (DEPRECATED, returned only if config option -deprecatedrpc=addresses is passed) Number of required signatures
    *         "type" : "str",       (string) The type, eg 'pubkeyhash'
    *         "address" : "str",    (string, optional) bitcoin address (only if a well-defined address exists)
    *         "addresses" : [       (json array, optional) (DEPRECATED, returned only if config option -deprecatedrpc=addresses is passed) Array of bitcoin addresses
    *           "str",              (string) bitcoin address
    *           ...
    *         ]
    *       }
    *     },
    *     ...
    *   ]
    * }
    * 
    * Examples:
    * > bitcoin-cli decoderawtransaction "hexstring"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "decoderawtransaction", "params": ["hexstring"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object decoderawtransaction(Object hexstring) { return decoderawtransaction.invoke(hexstring); }


   /**
    * decoderawtransaction "hexstring" ( iswitness )
    * 
    * Return a JSON object representing the serialized, hex-encoded transaction.
    * 
    * Arguments:
    * 1. hexstring    (string, required) The transaction hex string
    * 2. iswitness    (boolean, optional, default=depends on heuristic tests) Whether the transaction hex is a serialized witness transaction.
    *                 If iswitness is not present, heuristic tests will be used in decoding.
    *                 If true, only witness deserialization will be tried.
    *                 If false, only non-witness deserialization will be tried.
    *                 This boolean should reflect whether the transaction has inputs
    *                 (e.g. fully valid, or on-chain transactions), if known by the caller.
    * 
    * Result:
    * {                             (json object)
    *   "txid" : "hex",             (string) The transaction id
    *   "hash" : "hex",             (string) The transaction hash (differs from txid for witness transactions)
    *   "size" : n,                 (numeric) The transaction size
    *   "vsize" : n,                (numeric) The virtual transaction size (differs from size for witness transactions)
    *   "weight" : n,               (numeric) The transaction's weight (between vsize*4 - 3 and vsize*4)
    *   "version" : n,              (numeric) The version
    *   "locktime" : xxx,           (numeric) The lock time
    *   "vin" : [                   (json array)
    *     {                         (json object)
    *       "txid" : "hex",         (string) The transaction id
    *       "vout" : n,             (numeric) The output number
    *       "scriptSig" : {         (json object) The script
    *         "asm" : "str",        (string) asm
    *         "hex" : "hex"         (string) hex
    *       },
    *       "txinwitness" : [       (json array)
    *         "hex",                (string) hex-encoded witness data (if any)
    *         ...
    *       ],
    *       "sequence" : n          (numeric) The script sequence number
    *     },
    *     ...
    *   ],
    *   "vout" : [                  (json array)
    *     {                         (json object)
    *       "value" : n,            (numeric) The value in BTC
    *       "n" : n,                (numeric) index
    *       "scriptPubKey" : {      (json object)
    *         "asm" : "str",        (string) the asm
    *         "hex" : "hex",        (string) the hex
    *         "reqSigs" : n,        (numeric, optional) (DEPRECATED, returned only if config option -deprecatedrpc=addresses is passed) Number of required signatures
    *         "type" : "str",       (string) The type, eg 'pubkeyhash'
    *         "address" : "str",    (string, optional) bitcoin address (only if a well-defined address exists)
    *         "addresses" : [       (json array, optional) (DEPRECATED, returned only if config option -deprecatedrpc=addresses is passed) Array of bitcoin addresses
    *           "str",              (string) bitcoin address
    *           ...
    *         ]
    *       }
    *     },
    *     ...
    *   ]
    * }
    * 
    * Examples:
    * > bitcoin-cli decoderawtransaction "hexstring"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "decoderawtransaction", "params": ["hexstring"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object decoderawtransaction(Object hexstring, Object iswitness) { return decoderawtransaction.invoke(hexstring, iswitness); }

   /**
    * importmulti "requests" ( "options" )
    * 
    * Import addresses/scripts (with private or public keys, redeem script (P2SH)), optionally rescanning the blockchain from the earliest creation time of the imported scripts. Requires a new wallet backup.
    * If an address/script is imported without all of the private keys required to spend from that address, it will be watchonly. The 'watchonly' option must be set to true in this case or a warning will be returned.
    * Conversely, if all the private keys are provided and the address/script is spendable, the watchonly option must be set to false, or a warning will be returned.
    * 
    * Note: This call can take over an hour to complete if rescan is true, during that time, other rpc calls
    * may report that the imported keys, addresses or scripts exist but related transactions are still missing.
    * Note: Use "getwalletinfo" to query the scanning progress.
    * 
    * Arguments:
    * 1. requests                                                         (json array, required) Data to be imported
    *      [
    *        {                                                            (json object)
    *          "desc": "str",                                             (string) Descriptor to import. If using descriptor, do not also provide address/scriptPubKey, scripts, or pubkeys
    *          "scriptPubKey": "<script>" | { "address":"<address>" },    (string / json, required) Type of scriptPubKey (string for script, json for address). Should not be provided if using a descriptor
    *          "timestamp": timestamp | "now",                            (integer / string, required) Creation time of the key expressed in UNIX epoch time,
    *                                                                     or the string "now" to substitute the current synced blockchain time. The timestamp of the oldest
    *                                                                     key will determine how far back blockchain rescans need to begin for missing wallet transactions.
    *                                                                     "now" can be specified to bypass scanning, for keys which are known to never have been used, and
    *                                                                     0 can be specified to scan the entire blockchain. Blocks up to 2 hours before the earliest key
    *                                                                     creation time of all keys being imported by the importmulti call will be scanned.
    *          "redeemscript": "str",                                     (string) Allowed only if the scriptPubKey is a P2SH or P2SH-P2WSH address/scriptPubKey
    *          "witnessscript": "str",                                    (string) Allowed only if the scriptPubKey is a P2SH-P2WSH or P2WSH address/scriptPubKey
    *          "pubkeys": [                                               (json array, optional, default=[]) Array of strings giving pubkeys to import. They must occur in P2PKH or P2WPKH scripts. They are not required when the private key is also provided (see the "keys" argument).
    *            "pubKey",                                                (string)
    *            ...
    *          ],
    *          "keys": [                                                  (json array, optional, default=[]) Array of strings giving private keys to import. The corresponding public keys must occur in the output or redeemscript.
    *            "key",                                                   (string)
    *            ...
    *          ],
    *          "range": n or [n,n],                                       (numeric or array) If a ranged descriptor is used, this specifies the end or the range (in the form [begin,end]) to import
    *          "internal": bool,                                          (boolean, optional, default=false) Stating whether matching outputs should be treated as not incoming payments (also known as change)
    *          "watchonly": bool,                                         (boolean, optional, default=false) Stating whether matching outputs should be considered watchonly.
    *          "label": "str",                                            (string, optional, default="") Label to assign to the address, only allowed with internal=false
    *          "keypool": bool,                                           (boolean, optional, default=false) Stating whether imported public keys should be added to the keypool for when users request new addresses. Only allowed when wallet private keys are disabled
    *        },
    *        ...
    *      ]
    * 2. options                                                          (json object, optional)
    *      {
    *        "rescan": bool,                                              (boolean, optional, default=true) Stating if should rescan the blockchain after all imports
    *      }
    * 
    * Result:
    * [                              (json array) Response is an array with the same size as the input that has the execution result
    *   {                            (json object)
    *     "success" : true|false,    (boolean)
    *     "warnings" : [             (json array, optional)
    *       "str",                   (string)
    *       ...
    *     ],
    *     "error" : {                (json object, optional)
    *       ...                      JSONRPC error
    *     }
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * > bitcoin-cli importmulti '[{ "scriptPubKey": { "address": "<my address>" }, "timestamp":1455191478 }, { "scriptPubKey": { "address": "<my 2nd address>" }, "label": "example 2", "timestamp": 1455191480 }]'
    * > bitcoin-cli importmulti '[{ "scriptPubKey": { "address": "<my address>" }, "timestamp":1455191478 }]' '{ "rescan": false}'
    */
   public Object importmulti(Object requests) { return importmulti.invoke(requests); }


   /**
    * importmulti "requests" ( "options" )
    * 
    * Import addresses/scripts (with private or public keys, redeem script (P2SH)), optionally rescanning the blockchain from the earliest creation time of the imported scripts. Requires a new wallet backup.
    * If an address/script is imported without all of the private keys required to spend from that address, it will be watchonly. The 'watchonly' option must be set to true in this case or a warning will be returned.
    * Conversely, if all the private keys are provided and the address/script is spendable, the watchonly option must be set to false, or a warning will be returned.
    * 
    * Note: This call can take over an hour to complete if rescan is true, during that time, other rpc calls
    * may report that the imported keys, addresses or scripts exist but related transactions are still missing.
    * Note: Use "getwalletinfo" to query the scanning progress.
    * 
    * Arguments:
    * 1. requests                                                         (json array, required) Data to be imported
    *      [
    *        {                                                            (json object)
    *          "desc": "str",                                             (string) Descriptor to import. If using descriptor, do not also provide address/scriptPubKey, scripts, or pubkeys
    *          "scriptPubKey": "<script>" | { "address":"<address>" },    (string / json, required) Type of scriptPubKey (string for script, json for address). Should not be provided if using a descriptor
    *          "timestamp": timestamp | "now",                            (integer / string, required) Creation time of the key expressed in UNIX epoch time,
    *                                                                     or the string "now" to substitute the current synced blockchain time. The timestamp of the oldest
    *                                                                     key will determine how far back blockchain rescans need to begin for missing wallet transactions.
    *                                                                     "now" can be specified to bypass scanning, for keys which are known to never have been used, and
    *                                                                     0 can be specified to scan the entire blockchain. Blocks up to 2 hours before the earliest key
    *                                                                     creation time of all keys being imported by the importmulti call will be scanned.
    *          "redeemscript": "str",                                     (string) Allowed only if the scriptPubKey is a P2SH or P2SH-P2WSH address/scriptPubKey
    *          "witnessscript": "str",                                    (string) Allowed only if the scriptPubKey is a P2SH-P2WSH or P2WSH address/scriptPubKey
    *          "pubkeys": [                                               (json array, optional, default=[]) Array of strings giving pubkeys to import. They must occur in P2PKH or P2WPKH scripts. They are not required when the private key is also provided (see the "keys" argument).
    *            "pubKey",                                                (string)
    *            ...
    *          ],
    *          "keys": [                                                  (json array, optional, default=[]) Array of strings giving private keys to import. The corresponding public keys must occur in the output or redeemscript.
    *            "key",                                                   (string)
    *            ...
    *          ],
    *          "range": n or [n,n],                                       (numeric or array) If a ranged descriptor is used, this specifies the end or the range (in the form [begin,end]) to import
    *          "internal": bool,                                          (boolean, optional, default=false) Stating whether matching outputs should be treated as not incoming payments (also known as change)
    *          "watchonly": bool,                                         (boolean, optional, default=false) Stating whether matching outputs should be considered watchonly.
    *          "label": "str",                                            (string, optional, default="") Label to assign to the address, only allowed with internal=false
    *          "keypool": bool,                                           (boolean, optional, default=false) Stating whether imported public keys should be added to the keypool for when users request new addresses. Only allowed when wallet private keys are disabled
    *        },
    *        ...
    *      ]
    * 2. options                                                          (json object, optional)
    *      {
    *        "rescan": bool,                                              (boolean, optional, default=true) Stating if should rescan the blockchain after all imports
    *      }
    * 
    * Result:
    * [                              (json array) Response is an array with the same size as the input that has the execution result
    *   {                            (json object)
    *     "success" : true|false,    (boolean)
    *     "warnings" : [             (json array, optional)
    *       "str",                   (string)
    *       ...
    *     ],
    *     "error" : {                (json object, optional)
    *       ...                      JSONRPC error
    *     }
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * > bitcoin-cli importmulti '[{ "scriptPubKey": { "address": "<my address>" }, "timestamp":1455191478 }, { "scriptPubKey": { "address": "<my 2nd address>" }, "label": "example 2", "timestamp": 1455191480 }]'
    * > bitcoin-cli importmulti '[{ "scriptPubKey": { "address": "<my address>" }, "timestamp":1455191478 }]' '{ "rescan": false}'
    */
   public Object importmulti(Object requests, Object options) { return importmulti.invoke(requests, options); }

   /**
    * getnetworkhashps ( nblocks height )
    * 
    * Returns the estimated network hashes per second based on the last n blocks.
    * Pass in [blocks] to override # of blocks, -1 specifies since last difficulty change.
    * Pass in [height] to estimate the network speed at the time when a certain block was found.
    * 
    * Arguments:
    * 1. nblocks    (numeric, optional, default=120) The number of blocks, or -1 for blocks since last difficulty change.
    * 2. height     (numeric, optional, default=-1) To estimate at the time of the given height.
    * 
    * Result:
    * n    (numeric) Hashes per second estimated
    * 
    * Examples:
    * > bitcoin-cli getnetworkhashps 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getnetworkhashps", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getnetworkhashps() { return getnetworkhashps.invoke(); }


   /**
    * getnetworkhashps ( nblocks height )
    * 
    * Returns the estimated network hashes per second based on the last n blocks.
    * Pass in [blocks] to override # of blocks, -1 specifies since last difficulty change.
    * Pass in [height] to estimate the network speed at the time when a certain block was found.
    * 
    * Arguments:
    * 1. nblocks    (numeric, optional, default=120) The number of blocks, or -1 for blocks since last difficulty change.
    * 2. height     (numeric, optional, default=-1) To estimate at the time of the given height.
    * 
    * Result:
    * n    (numeric) Hashes per second estimated
    * 
    * Examples:
    * > bitcoin-cli getnetworkhashps 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getnetworkhashps", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getnetworkhashps(Object nblocks) { return getnetworkhashps.invoke(nblocks); }


   /**
    * getnetworkhashps ( nblocks height )
    * 
    * Returns the estimated network hashes per second based on the last n blocks.
    * Pass in [blocks] to override # of blocks, -1 specifies since last difficulty change.
    * Pass in [height] to estimate the network speed at the time when a certain block was found.
    * 
    * Arguments:
    * 1. nblocks    (numeric, optional, default=120) The number of blocks, or -1 for blocks since last difficulty change.
    * 2. height     (numeric, optional, default=-1) To estimate at the time of the given height.
    * 
    * Result:
    * n    (numeric) Hashes per second estimated
    * 
    * Examples:
    * > bitcoin-cli getnetworkhashps 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getnetworkhashps", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getnetworkhashps(Object nblocks, Object height) { return getnetworkhashps.invoke(nblocks, height); }

   /**
    * generatetodescriptor num_blocks "descriptor" ( maxtries )
    * 
    * Mine blocks immediately to a specified descriptor (before the RPC call returns)
    * 
    * Arguments:
    * 1. num_blocks    (numeric, required) How many blocks are generated immediately.
    * 2. descriptor    (string, required) The descriptor to send the newly generated bitcoin to.
    * 3. maxtries      (numeric, optional, default=1000000) How many iterations to try.
    * 
    * Result:
    * [           (json array) hashes of blocks generated
    *   "hex",    (string) blockhash
    *   ...
    * ]
    * 
    * Examples:
    * 
    * Generate 11 blocks to mydesc
    * > bitcoin-cli generatetodescriptor 11 "mydesc"
    */
   public Object generatetodescriptor(Object num_blocks, Object descriptor) { return generatetodescriptor.invoke(num_blocks, descriptor); }


   /**
    * generatetodescriptor num_blocks "descriptor" ( maxtries )
    * 
    * Mine blocks immediately to a specified descriptor (before the RPC call returns)
    * 
    * Arguments:
    * 1. num_blocks    (numeric, required) How many blocks are generated immediately.
    * 2. descriptor    (string, required) The descriptor to send the newly generated bitcoin to.
    * 3. maxtries      (numeric, optional, default=1000000) How many iterations to try.
    * 
    * Result:
    * [           (json array) hashes of blocks generated
    *   "hex",    (string) blockhash
    *   ...
    * ]
    * 
    * Examples:
    * 
    * Generate 11 blocks to mydesc
    * > bitcoin-cli generatetodescriptor 11 "mydesc"
    */
   public Object generatetodescriptor(Object num_blocks, Object descriptor, Object maxtries) { return generatetodescriptor.invoke(num_blocks, descriptor, maxtries); }

   /**
    * importdescriptors "requests"
    * 
    * Import descriptors. This will trigger a rescan of the blockchain based on the earliest timestamp of all descriptors being imported. Requires a new wallet backup.
    * 
    * Note: This call can take over an hour to complete if using an early timestamp; during that time, other rpc calls
    * may report that the imported keys, addresses or scripts exist but related transactions are still missing.
    * 
    * Arguments:
    * 1. requests                                 (json array, required) Data to be imported
    *      [
    *        {                                    (json object)
    *          "desc": "str",                     (string, required) Descriptor to import.
    *          "active": bool,                    (boolean, optional, default=false) Set this descriptor to be the active descriptor for the corresponding output type/externality
    *          "range": n or [n,n],               (numeric or array) If a ranged descriptor is used, this specifies the end or the range (in the form [begin,end]) to import
    *          "next_index": n,                   (numeric) If a ranged descriptor is set to active, this specifies the next index to generate addresses from
    *          "timestamp": timestamp | "now",    (integer / string, required) Time from which to start rescanning the blockchain for this descriptor, in UNIX epoch time
    *                                             Use the string "now" to substitute the current synced blockchain time.
    *                                             "now" can be specified to bypass scanning, for outputs which are known to never have been used, and
    *                                             0 can be specified to scan the entire blockchain. Blocks up to 2 hours before the earliest timestamp
    *                                             of all descriptors being imported will be scanned.
    *          "internal": bool,                  (boolean, optional, default=false) Whether matching outputs should be treated as not incoming payments (e.g. change)
    *          "label": "str",                    (string, optional, default="") Label to assign to the address, only allowed with internal=false
    *        },
    *        ...
    *      ]
    * 
    * Result:
    * [                              (json array) Response is an array with the same size as the input that has the execution result
    *   {                            (json object)
    *     "success" : true|false,    (boolean)
    *     "warnings" : [             (json array, optional)
    *       "str",                   (string)
    *       ...
    *     ],
    *     "error" : {                (json object, optional)
    *       ...                      JSONRPC error
    *     }
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * > bitcoin-cli importdescriptors '[{ "desc": "<my descriptor>", "timestamp":1455191478, "internal": true }, { "desc": "<my desccriptor 2>", "label": "example 2", "timestamp": 1455191480 }]'
    * > bitcoin-cli importdescriptors '[{ "desc": "<my descriptor>", "timestamp":1455191478, "active": true, "range": [0,100], "label": "<my bech32 wallet>" }]'
    */
   public Object importdescriptors(Object requests) { return importdescriptors.invoke(requests); }

   /**
    * gettxoutsetinfo ( "hash_type" hash_or_height use_index )
    * 
    * Returns statistics about the unspent transaction output set.
    * Note this call may take some time if you are not using coinstatsindex.
    * 
    * Arguments:
    * 1. hash_type         (string, optional, default="hash_serialized_2") Which UTXO set hash should be calculated. Options: 'hash_serialized_2' (the legacy algorithm), 'muhash', 'none'.
    * 2. hash_or_height    (string or numeric, optional) The block hash or height of the target height (only available with coinstatsindex).
    * 3. use_index         (boolean, optional, default=true) Use coinstatsindex, if available.
    * 
    * Result:
    * {                                     (json object)
    *   "height" : n,                       (numeric) The block height (index) of the returned statistics
    *   "bestblock" : "hex",                (string) The hash of the block at which these statistics are calculated
    *   "txouts" : n,                       (numeric) The number of unspent transaction outputs
    *   "bogosize" : n,                     (numeric) Database-independent, meaningless metric indicating the UTXO set size
    *   "hash_serialized_2" : "hex",        (string, optional) The serialized hash (only present if 'hash_serialized_2' hash_type is chosen)
    *   "muhash" : "hex",                   (string, optional) The serialized hash (only present if 'muhash' hash_type is chosen)
    *   "transactions" : n,                 (numeric) The number of transactions with unspent outputs (not available when coinstatsindex is used)
    *   "disk_size" : n,                    (numeric) The estimated size of the chainstate on disk (not available when coinstatsindex is used)
    *   "total_amount" : n,                 (numeric) The total amount of coins in the UTXO set
    *   "total_unspendable_amount" : n,     (numeric) The total amount of coins permanently excluded from the UTXO set (only available if coinstatsindex is used)
    *   "block_info" : {                    (json object) Info on amounts in the block at this block height (only available if coinstatsindex is used)
    *     "prevout_spent" : n,              (numeric)
    *     "coinbase" : n,                   (numeric)
    *     "new_outputs_ex_coinbase" : n,    (numeric)
    *     "unspendable" : n,                (numeric)
    *     "unspendables" : {                (json object) Detailed view of the unspendable categories
    *       "genesis_block" : n,            (numeric)
    *       "bip30" : n,                    (numeric) Transactions overridden by duplicates (no longer possible with BIP30)
    *       "scripts" : n,                  (numeric) Amounts sent to scripts that are unspendable (for example OP_RETURN outputs)
    *       "unclaimed_rewards" : n         (numeric) Fee rewards that miners did not claim in their coinbase transaction
    *     }
    *   }
    * }
    * 
    * Examples:
    * > bitcoin-cli gettxoutsetinfo 
    * > bitcoin-cli gettxoutsetinfo "none"
    * > bitcoin-cli gettxoutsetinfo "none" 1000
    * > bitcoin-cli gettxoutsetinfo "none" '"00000000c937983704a73af28acdec37b049d214adbda81d7e2a3dd146f6ed09"'
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "gettxoutsetinfo", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "gettxoutsetinfo", "params": ["none"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "gettxoutsetinfo", "params": ["none", 1000]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "gettxoutsetinfo", "params": ["none", "00000000c937983704a73af28acdec37b049d214adbda81d7e2a3dd146f6ed09"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object gettxoutsetinfo() { return gettxoutsetinfo.invoke(); }


   /**
    * gettxoutsetinfo ( "hash_type" hash_or_height use_index )
    * 
    * Returns statistics about the unspent transaction output set.
    * Note this call may take some time if you are not using coinstatsindex.
    * 
    * Arguments:
    * 1. hash_type         (string, optional, default="hash_serialized_2") Which UTXO set hash should be calculated. Options: 'hash_serialized_2' (the legacy algorithm), 'muhash', 'none'.
    * 2. hash_or_height    (string or numeric, optional) The block hash or height of the target height (only available with coinstatsindex).
    * 3. use_index         (boolean, optional, default=true) Use coinstatsindex, if available.
    * 
    * Result:
    * {                                     (json object)
    *   "height" : n,                       (numeric) The block height (index) of the returned statistics
    *   "bestblock" : "hex",                (string) The hash of the block at which these statistics are calculated
    *   "txouts" : n,                       (numeric) The number of unspent transaction outputs
    *   "bogosize" : n,                     (numeric) Database-independent, meaningless metric indicating the UTXO set size
    *   "hash_serialized_2" : "hex",        (string, optional) The serialized hash (only present if 'hash_serialized_2' hash_type is chosen)
    *   "muhash" : "hex",                   (string, optional) The serialized hash (only present if 'muhash' hash_type is chosen)
    *   "transactions" : n,                 (numeric) The number of transactions with unspent outputs (not available when coinstatsindex is used)
    *   "disk_size" : n,                    (numeric) The estimated size of the chainstate on disk (not available when coinstatsindex is used)
    *   "total_amount" : n,                 (numeric) The total amount of coins in the UTXO set
    *   "total_unspendable_amount" : n,     (numeric) The total amount of coins permanently excluded from the UTXO set (only available if coinstatsindex is used)
    *   "block_info" : {                    (json object) Info on amounts in the block at this block height (only available if coinstatsindex is used)
    *     "prevout_spent" : n,              (numeric)
    *     "coinbase" : n,                   (numeric)
    *     "new_outputs_ex_coinbase" : n,    (numeric)
    *     "unspendable" : n,                (numeric)
    *     "unspendables" : {                (json object) Detailed view of the unspendable categories
    *       "genesis_block" : n,            (numeric)
    *       "bip30" : n,                    (numeric) Transactions overridden by duplicates (no longer possible with BIP30)
    *       "scripts" : n,                  (numeric) Amounts sent to scripts that are unspendable (for example OP_RETURN outputs)
    *       "unclaimed_rewards" : n         (numeric) Fee rewards that miners did not claim in their coinbase transaction
    *     }
    *   }
    * }
    * 
    * Examples:
    * > bitcoin-cli gettxoutsetinfo 
    * > bitcoin-cli gettxoutsetinfo "none"
    * > bitcoin-cli gettxoutsetinfo "none" 1000
    * > bitcoin-cli gettxoutsetinfo "none" '"00000000c937983704a73af28acdec37b049d214adbda81d7e2a3dd146f6ed09"'
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "gettxoutsetinfo", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "gettxoutsetinfo", "params": ["none"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "gettxoutsetinfo", "params": ["none", 1000]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "gettxoutsetinfo", "params": ["none", "00000000c937983704a73af28acdec37b049d214adbda81d7e2a3dd146f6ed09"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object gettxoutsetinfo(Object hash_type) { return gettxoutsetinfo.invoke(hash_type); }


   /**
    * gettxoutsetinfo ( "hash_type" hash_or_height use_index )
    * 
    * Returns statistics about the unspent transaction output set.
    * Note this call may take some time if you are not using coinstatsindex.
    * 
    * Arguments:
    * 1. hash_type         (string, optional, default="hash_serialized_2") Which UTXO set hash should be calculated. Options: 'hash_serialized_2' (the legacy algorithm), 'muhash', 'none'.
    * 2. hash_or_height    (string or numeric, optional) The block hash or height of the target height (only available with coinstatsindex).
    * 3. use_index         (boolean, optional, default=true) Use coinstatsindex, if available.
    * 
    * Result:
    * {                                     (json object)
    *   "height" : n,                       (numeric) The block height (index) of the returned statistics
    *   "bestblock" : "hex",                (string) The hash of the block at which these statistics are calculated
    *   "txouts" : n,                       (numeric) The number of unspent transaction outputs
    *   "bogosize" : n,                     (numeric) Database-independent, meaningless metric indicating the UTXO set size
    *   "hash_serialized_2" : "hex",        (string, optional) The serialized hash (only present if 'hash_serialized_2' hash_type is chosen)
    *   "muhash" : "hex",                   (string, optional) The serialized hash (only present if 'muhash' hash_type is chosen)
    *   "transactions" : n,                 (numeric) The number of transactions with unspent outputs (not available when coinstatsindex is used)
    *   "disk_size" : n,                    (numeric) The estimated size of the chainstate on disk (not available when coinstatsindex is used)
    *   "total_amount" : n,                 (numeric) The total amount of coins in the UTXO set
    *   "total_unspendable_amount" : n,     (numeric) The total amount of coins permanently excluded from the UTXO set (only available if coinstatsindex is used)
    *   "block_info" : {                    (json object) Info on amounts in the block at this block height (only available if coinstatsindex is used)
    *     "prevout_spent" : n,              (numeric)
    *     "coinbase" : n,                   (numeric)
    *     "new_outputs_ex_coinbase" : n,    (numeric)
    *     "unspendable" : n,                (numeric)
    *     "unspendables" : {                (json object) Detailed view of the unspendable categories
    *       "genesis_block" : n,            (numeric)
    *       "bip30" : n,                    (numeric) Transactions overridden by duplicates (no longer possible with BIP30)
    *       "scripts" : n,                  (numeric) Amounts sent to scripts that are unspendable (for example OP_RETURN outputs)
    *       "unclaimed_rewards" : n         (numeric) Fee rewards that miners did not claim in their coinbase transaction
    *     }
    *   }
    * }
    * 
    * Examples:
    * > bitcoin-cli gettxoutsetinfo 
    * > bitcoin-cli gettxoutsetinfo "none"
    * > bitcoin-cli gettxoutsetinfo "none" 1000
    * > bitcoin-cli gettxoutsetinfo "none" '"00000000c937983704a73af28acdec37b049d214adbda81d7e2a3dd146f6ed09"'
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "gettxoutsetinfo", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "gettxoutsetinfo", "params": ["none"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "gettxoutsetinfo", "params": ["none", 1000]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "gettxoutsetinfo", "params": ["none", "00000000c937983704a73af28acdec37b049d214adbda81d7e2a3dd146f6ed09"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object gettxoutsetinfo(Object hash_type, Object hash_or_height) { return gettxoutsetinfo.invoke(hash_type, hash_or_height); }


   /**
    * gettxoutsetinfo ( "hash_type" hash_or_height use_index )
    * 
    * Returns statistics about the unspent transaction output set.
    * Note this call may take some time if you are not using coinstatsindex.
    * 
    * Arguments:
    * 1. hash_type         (string, optional, default="hash_serialized_2") Which UTXO set hash should be calculated. Options: 'hash_serialized_2' (the legacy algorithm), 'muhash', 'none'.
    * 2. hash_or_height    (string or numeric, optional) The block hash or height of the target height (only available with coinstatsindex).
    * 3. use_index         (boolean, optional, default=true) Use coinstatsindex, if available.
    * 
    * Result:
    * {                                     (json object)
    *   "height" : n,                       (numeric) The block height (index) of the returned statistics
    *   "bestblock" : "hex",                (string) The hash of the block at which these statistics are calculated
    *   "txouts" : n,                       (numeric) The number of unspent transaction outputs
    *   "bogosize" : n,                     (numeric) Database-independent, meaningless metric indicating the UTXO set size
    *   "hash_serialized_2" : "hex",        (string, optional) The serialized hash (only present if 'hash_serialized_2' hash_type is chosen)
    *   "muhash" : "hex",                   (string, optional) The serialized hash (only present if 'muhash' hash_type is chosen)
    *   "transactions" : n,                 (numeric) The number of transactions with unspent outputs (not available when coinstatsindex is used)
    *   "disk_size" : n,                    (numeric) The estimated size of the chainstate on disk (not available when coinstatsindex is used)
    *   "total_amount" : n,                 (numeric) The total amount of coins in the UTXO set
    *   "total_unspendable_amount" : n,     (numeric) The total amount of coins permanently excluded from the UTXO set (only available if coinstatsindex is used)
    *   "block_info" : {                    (json object) Info on amounts in the block at this block height (only available if coinstatsindex is used)
    *     "prevout_spent" : n,              (numeric)
    *     "coinbase" : n,                   (numeric)
    *     "new_outputs_ex_coinbase" : n,    (numeric)
    *     "unspendable" : n,                (numeric)
    *     "unspendables" : {                (json object) Detailed view of the unspendable categories
    *       "genesis_block" : n,            (numeric)
    *       "bip30" : n,                    (numeric) Transactions overridden by duplicates (no longer possible with BIP30)
    *       "scripts" : n,                  (numeric) Amounts sent to scripts that are unspendable (for example OP_RETURN outputs)
    *       "unclaimed_rewards" : n         (numeric) Fee rewards that miners did not claim in their coinbase transaction
    *     }
    *   }
    * }
    * 
    * Examples:
    * > bitcoin-cli gettxoutsetinfo 
    * > bitcoin-cli gettxoutsetinfo "none"
    * > bitcoin-cli gettxoutsetinfo "none" 1000
    * > bitcoin-cli gettxoutsetinfo "none" '"00000000c937983704a73af28acdec37b049d214adbda81d7e2a3dd146f6ed09"'
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "gettxoutsetinfo", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "gettxoutsetinfo", "params": ["none"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "gettxoutsetinfo", "params": ["none", 1000]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "gettxoutsetinfo", "params": ["none", "00000000c937983704a73af28acdec37b049d214adbda81d7e2a3dd146f6ed09"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object gettxoutsetinfo(Object hash_type, Object hash_or_height, Object use_index) { return gettxoutsetinfo.invoke(hash_type, hash_or_height, use_index); }

   /**
    * getwalletinfo
    * Returns an object containing various wallet state info.
    * 
    * Result:
    * {                                         (json object)
    *   "walletname" : "str",                   (string) the wallet name
    *   "walletversion" : n,                    (numeric) the wallet version
    *   "format" : "str",                       (string) the database format (bdb or sqlite)
    *   "balance" : n,                          (numeric) DEPRECATED. Identical to getbalances().mine.trusted
    *   "unconfirmed_balance" : n,              (numeric) DEPRECATED. Identical to getbalances().mine.untrusted_pending
    *   "immature_balance" : n,                 (numeric) DEPRECATED. Identical to getbalances().mine.immature
    *   "txcount" : n,                          (numeric) the total number of transactions in the wallet
    *   "keypoololdest" : xxx,                  (numeric) the UNIX epoch time of the oldest pre-generated key in the key pool. Legacy wallets only.
    *   "keypoolsize" : n,                      (numeric) how many new keys are pre-generated (only counts external keys)
    *   "keypoolsize_hd_internal" : n,          (numeric) how many new keys are pre-generated for internal use (used for change outputs, only appears if the wallet is using this feature, otherwise external keys are used)
    *   "unlocked_until" : xxx,                 (numeric, optional) the UNIX epoch time until which the wallet is unlocked for transfers, or 0 if the wallet is locked (only present for passphrase-encrypted wallets)
    *   "paytxfee" : n,                         (numeric) the transaction fee configuration, set in BTC/kvB
    *   "hdseedid" : "hex",                     (string, optional) the Hash160 of the HD seed (only present when HD is enabled)
    *   "private_keys_enabled" : true|false,    (boolean) false if privatekeys are disabled for this wallet (enforced watch-only wallet)
    *   "avoid_reuse" : true|false,             (boolean) whether this wallet tracks clean/dirty coins in terms of reuse
    *   "scanning" : {                          (json object) current scanning details, or false if no scan is in progress
    *     "duration" : n,                       (numeric) elapsed seconds since scan start
    *     "progress" : n                        (numeric) scanning progress percentage [0.0, 1.0]
    *   },
    *   "descriptors" : true|false              (boolean) whether this wallet uses descriptors for scriptPubKey management
    * }
    * 
    * Examples:
    * > bitcoin-cli getwalletinfo 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getwalletinfo", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getwalletinfo() { return getwalletinfo.invoke(); }

   /**
    * walletpassphrase "passphrase" timeout
    * 
    * Stores the wallet decryption key in memory for 'timeout' seconds.
    * This is needed prior to performing transactions related to private keys such as sending bitcoins
    * 
    * Note:
    * Issuing the walletpassphrase command while the wallet is already unlocked will set a new unlock
    * time that overrides the old one.
    * 
    * Arguments:
    * 1. passphrase    (string, required) The wallet passphrase
    * 2. timeout       (numeric, required) The time to keep the decryption key in seconds; capped at 100000000 (~3 years).
    * 
    * Result:
    * null    (json null)
    * 
    * Examples:
    * 
    * Unlock the wallet for 60 seconds
    * > bitcoin-cli walletpassphrase "my pass phrase" 60
    * 
    * Lock the wallet again (before 60 seconds)
    * > bitcoin-cli walletlock 
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "walletpassphrase", "params": ["my pass phrase", 60]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object walletpassphrase(Object passphrase, Object timeout) { return walletpassphrase.invoke(passphrase, timeout); }

   /**
    * verifymessage "address" "signature" "message"
    * 
    * Verify a signed message
    * 
    * Arguments:
    * 1. address      (string, required) The bitcoin address to use for the signature.
    * 2. signature    (string, required) The signature provided by the signer in base 64 encoding (see signmessage).
    * 3. message      (string, required) The message that was signed.
    * 
    * Result:
    * true|false    (boolean) If the signature is verified or not.
    * 
    * Examples:
    * 
    * Unlock the wallet for 30 seconds
    * > bitcoin-cli walletpassphrase "mypassphrase" 30
    * 
    * Create the signature
    * > bitcoin-cli signmessage "1D1ZrZNe3JUo7ZycKEYQQiQAWd9y54F4XX" "my message"
    * 
    * Verify the signature
    * > bitcoin-cli verifymessage "1D1ZrZNe3JUo7ZycKEYQQiQAWd9y54F4XX" "signature" "my message"
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "verifymessage", "params": ["1D1ZrZNe3JUo7ZycKEYQQiQAWd9y54F4XX", "signature", "my message"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object verifymessage(Object address, Object signature, Object message) { return verifymessage.invoke(address, signature, message); }

   /**
    * upgradewallet ( version )
    * 
    * Upgrade the wallet. Upgrades to the latest version if no version number is specified.
    * New keys may be generated and a new wallet backup will need to be made.
    * Arguments:
    * 1. version    (numeric, optional, default=169900) The version number to upgrade to. Default is the latest wallet version.
    * 
    * Result:
    * {                            (json object)
    *   "wallet_name" : "str",     (string) Name of wallet this operation was performed on
    *   "previous_version" : n,    (numeric) Version of wallet before this operation
    *   "current_version" : n,     (numeric) Version of wallet after this operation
    *   "result" : "str",          (string, optional) Description of result, if no error
    *   "error" : "str"            (string, optional) Error message (if there is one)
    * }
    * 
    * Examples:
    * > bitcoin-cli upgradewallet 169900
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "upgradewallet", "params": [169900]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object upgradewallet() { return upgradewallet.invoke(); }


   /**
    * upgradewallet ( version )
    * 
    * Upgrade the wallet. Upgrades to the latest version if no version number is specified.
    * New keys may be generated and a new wallet backup will need to be made.
    * Arguments:
    * 1. version    (numeric, optional, default=169900) The version number to upgrade to. Default is the latest wallet version.
    * 
    * Result:
    * {                            (json object)
    *   "wallet_name" : "str",     (string) Name of wallet this operation was performed on
    *   "previous_version" : n,    (numeric) Version of wallet before this operation
    *   "current_version" : n,     (numeric) Version of wallet after this operation
    *   "result" : "str",          (string, optional) Description of result, if no error
    *   "error" : "str"            (string, optional) Error message (if there is one)
    * }
    * 
    * Examples:
    * > bitcoin-cli upgradewallet 169900
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "upgradewallet", "params": [169900]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object upgradewallet(Object version) { return upgradewallet.invoke(version); }

   /**
    * createrawtransaction [{"txid":"hex","vout":n,"sequence":n},...] [{"address":amount,...},{"data":"hex"},...] ( locktime replaceable )
    * 
    * Create a transaction spending the given inputs and creating new outputs.
    * Outputs can be addresses or data.
    * Returns hex-encoded raw transaction.
    * Note that the transaction's inputs are not signed, and
    * it is not stored in the wallet or transmitted to the network.
    * 
    * Arguments:
    * 1. inputs                      (json array, required) The inputs
    *      [
    *        {                       (json object)
    *          "txid": "hex",        (string, required) The transaction id
    *          "vout": n,            (numeric, required) The output number
    *          "sequence": n,        (numeric, optional, default=depends on the value of the 'replaceable' and 'locktime' arguments) The sequence number
    *        },
    *        ...
    *      ]
    * 2. outputs                     (json array, required) The outputs (key-value pairs), where none of the keys are duplicated.
    *                                That is, each address can only appear once and there can only be one 'data' object.
    *                                For compatibility reasons, a dictionary, which holds the key-value pairs directly, is also
    *                                accepted as second parameter.
    *      [
    *        {                       (json object)
    *          "address": amount,    (numeric or string, required) A key-value pair. The key (string) is the bitcoin address, the value (float or string) is the amount in BTC
    *          ...
    *        },
    *        {                       (json object)
    *          "data": "hex",        (string, required) A key-value pair. The key must be "data", the value is hex-encoded data
    *        },
    *        ...
    *      ]
    * 3. locktime                    (numeric, optional, default=0) Raw locktime. Non-0 value also locktime-activates inputs
    * 4. replaceable                 (boolean, optional, default=false) Marks this transaction as BIP125-replaceable.
    *                                Allows this transaction to be replaced by a transaction with higher fees. If provided, it is an error if explicit sequence numbers are incompatible.
    * 
    * Result:
    * "hex"    (string) hex string of the transaction
    * 
    * Examples:
    * > bitcoin-cli createrawtransaction "[{\"txid\":\"myid\",\"vout\":0}]" "[{\"address\":0.01}]"
    * > bitcoin-cli createrawtransaction "[{\"txid\":\"myid\",\"vout\":0}]" "[{\"data\":\"00010203\"}]"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "createrawtransaction", "params": ["[{\"txid\":\"myid\",\"vout\":0}]", "[{\"address\":0.01}]"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "createrawtransaction", "params": ["[{\"txid\":\"myid\",\"vout\":0}]", "[{\"data\":\"00010203\"}]"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object createrawtransaction(Object utxos, Object address_amounts) { return createrawtransaction.invoke(utxos, address_amounts); }


   /**
    * createrawtransaction [{"txid":"hex","vout":n,"sequence":n},...] [{"address":amount,...},{"data":"hex"},...] ( locktime replaceable )
    * 
    * Create a transaction spending the given inputs and creating new outputs.
    * Outputs can be addresses or data.
    * Returns hex-encoded raw transaction.
    * Note that the transaction's inputs are not signed, and
    * it is not stored in the wallet or transmitted to the network.
    * 
    * Arguments:
    * 1. inputs                      (json array, required) The inputs
    *      [
    *        {                       (json object)
    *          "txid": "hex",        (string, required) The transaction id
    *          "vout": n,            (numeric, required) The output number
    *          "sequence": n,        (numeric, optional, default=depends on the value of the 'replaceable' and 'locktime' arguments) The sequence number
    *        },
    *        ...
    *      ]
    * 2. outputs                     (json array, required) The outputs (key-value pairs), where none of the keys are duplicated.
    *                                That is, each address can only appear once and there can only be one 'data' object.
    *                                For compatibility reasons, a dictionary, which holds the key-value pairs directly, is also
    *                                accepted as second parameter.
    *      [
    *        {                       (json object)
    *          "address": amount,    (numeric or string, required) A key-value pair. The key (string) is the bitcoin address, the value (float or string) is the amount in BTC
    *          ...
    *        },
    *        {                       (json object)
    *          "data": "hex",        (string, required) A key-value pair. The key must be "data", the value is hex-encoded data
    *        },
    *        ...
    *      ]
    * 3. locktime                    (numeric, optional, default=0) Raw locktime. Non-0 value also locktime-activates inputs
    * 4. replaceable                 (boolean, optional, default=false) Marks this transaction as BIP125-replaceable.
    *                                Allows this transaction to be replaced by a transaction with higher fees. If provided, it is an error if explicit sequence numbers are incompatible.
    * 
    * Result:
    * "hex"    (string) hex string of the transaction
    * 
    * Examples:
    * > bitcoin-cli createrawtransaction "[{\"txid\":\"myid\",\"vout\":0}]" "[{\"address\":0.01}]"
    * > bitcoin-cli createrawtransaction "[{\"txid\":\"myid\",\"vout\":0}]" "[{\"data\":\"00010203\"}]"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "createrawtransaction", "params": ["[{\"txid\":\"myid\",\"vout\":0}]", "[{\"address\":0.01}]"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "createrawtransaction", "params": ["[{\"txid\":\"myid\",\"vout\":0}]", "[{\"data\":\"00010203\"}]"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object createrawtransaction(Object utxos, Object address_amounts, Object locktime) { return createrawtransaction.invoke(utxos, address_amounts, locktime); }


   /**
    * createrawtransaction [{"txid":"hex","vout":n,"sequence":n},...] [{"address":amount,...},{"data":"hex"},...] ( locktime replaceable )
    * 
    * Create a transaction spending the given inputs and creating new outputs.
    * Outputs can be addresses or data.
    * Returns hex-encoded raw transaction.
    * Note that the transaction's inputs are not signed, and
    * it is not stored in the wallet or transmitted to the network.
    * 
    * Arguments:
    * 1. inputs                      (json array, required) The inputs
    *      [
    *        {                       (json object)
    *          "txid": "hex",        (string, required) The transaction id
    *          "vout": n,            (numeric, required) The output number
    *          "sequence": n,        (numeric, optional, default=depends on the value of the 'replaceable' and 'locktime' arguments) The sequence number
    *        },
    *        ...
    *      ]
    * 2. outputs                     (json array, required) The outputs (key-value pairs), where none of the keys are duplicated.
    *                                That is, each address can only appear once and there can only be one 'data' object.
    *                                For compatibility reasons, a dictionary, which holds the key-value pairs directly, is also
    *                                accepted as second parameter.
    *      [
    *        {                       (json object)
    *          "address": amount,    (numeric or string, required) A key-value pair. The key (string) is the bitcoin address, the value (float or string) is the amount in BTC
    *          ...
    *        },
    *        {                       (json object)
    *          "data": "hex",        (string, required) A key-value pair. The key must be "data", the value is hex-encoded data
    *        },
    *        ...
    *      ]
    * 3. locktime                    (numeric, optional, default=0) Raw locktime. Non-0 value also locktime-activates inputs
    * 4. replaceable                 (boolean, optional, default=false) Marks this transaction as BIP125-replaceable.
    *                                Allows this transaction to be replaced by a transaction with higher fees. If provided, it is an error if explicit sequence numbers are incompatible.
    * 
    * Result:
    * "hex"    (string) hex string of the transaction
    * 
    * Examples:
    * > bitcoin-cli createrawtransaction "[{\"txid\":\"myid\",\"vout\":0}]" "[{\"address\":0.01}]"
    * > bitcoin-cli createrawtransaction "[{\"txid\":\"myid\",\"vout\":0}]" "[{\"data\":\"00010203\"}]"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "createrawtransaction", "params": ["[{\"txid\":\"myid\",\"vout\":0}]", "[{\"address\":0.01}]"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "createrawtransaction", "params": ["[{\"txid\":\"myid\",\"vout\":0}]", "[{\"data\":\"00010203\"}]"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object createrawtransaction(Object utxos, Object address_amounts, Object locktime, Object replaceable) { return createrawtransaction.invoke(utxos, address_amounts, locktime, replaceable); }

   /**
    * decodescript "hexstring"
    * 
    * Decode a hex-encoded script.
    * 
    * Arguments:
    * 1. hexstring    (string, required) the hex-encoded script
    * 
    * Result:
    * {                             (json object)
    *   "asm" : "str",              (string) Script public key
    *   "type" : "str",             (string) The output type (e.g. nonstandard, pubkey, pubkeyhash, scripthash, multisig, nulldata, witness_v0_scripthash, witness_v0_keyhash, witness_v1_taproot, witness_unknown)
    *   "address" : "str",          (string, optional) bitcoin address (only if a well-defined address exists)
    *   "reqSigs" : n,              (numeric, optional) (DEPRECATED, returned only if config option -deprecatedrpc=addresses is passed) Number of required signatures
    *   "addresses" : [             (json array, optional) (DEPRECATED, returned only if config option -deprecatedrpc=addresses is passed) Array of bitcoin addresses
    *     "str",                    (string) bitcoin address
    *     ...
    *   ],
    *   "p2sh" : "str",             (string) address of P2SH script wrapping this redeem script (not returned if the script is already a P2SH)
    *   "segwit" : {                (json object) Result of a witness script public key wrapping this redeem script (not returned if the script is a P2SH or witness)
    *     "asm" : "str",            (string) String representation of the script public key
    *     "hex" : "hex",            (string) Hex string of the script public key
    *     "type" : "str",           (string) The type of the script public key (e.g. witness_v0_keyhash or witness_v0_scripthash)
    *     "address" : "str",        (string, optional) bitcoin address (only if a well-defined address exists)
    *     "reqSigs" : n,            (numeric, optional) (DEPRECATED, returned only if config option -deprecatedrpc=addresses is passed) Number of required signatures
    *     "addresses" : [           (json array, optional) (DEPRECATED, returned only if config option -deprecatedrpc=addresses is passed) Array of bitcoin addresses
    *       "str",                  (string) segwit address
    *       ...
    *     ],
    *     "p2sh-segwit" : "str"     (string) address of the P2SH script wrapping this witness redeem script
    *   }
    * }
    * 
    * Examples:
    * > bitcoin-cli decodescript "hexstring"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "decodescript", "params": ["hexstring"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object decodescript(Object hexstring) { return decodescript.invoke(hexstring); }

   /**
    * getaddressesbylabel "label"
    * 
    * Returns the list of addresses assigned the specified label.
    * 
    * Arguments:
    * 1. label    (string, required) The label.
    * 
    * Result:
    * {                         (json object) json object with addresses as keys
    *   "address" : {           (json object) json object with information about address
    *     "purpose" : "str"     (string) Purpose of address ("send" for sending address, "receive" for receiving address)
    *   },
    *   ...
    * }
    * 
    * Examples:
    * > bitcoin-cli getaddressesbylabel "tabby"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getaddressesbylabel", "params": ["tabby"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getaddressesbylabel(Object label) { return getaddressesbylabel.invoke(label); }

   /**
    * getblockchaininfo
    * Returns an object containing various state info regarding blockchain processing.
    * 
    * Result:
    * {                                         (json object)
    *   "chain" : "str",                        (string) current network name (main, test, signet, regtest)
    *   "blocks" : n,                           (numeric) the height of the most-work fully-validated chain. The genesis block has height 0
    *   "headers" : n,                          (numeric) the current number of headers we have validated
    *   "bestblockhash" : "str",                (string) the hash of the currently best block
    *   "difficulty" : n,                       (numeric) the current difficulty
    *   "mediantime" : n,                       (numeric) median time for the current best block
    *   "verificationprogress" : n,             (numeric) estimate of verification progress [0..1]
    *   "initialblockdownload" : true|false,    (boolean) (debug information) estimate of whether this node is in Initial Block Download mode
    *   "chainwork" : "hex",                    (string) total amount of work in active chain, in hexadecimal
    *   "size_on_disk" : n,                     (numeric) the estimated size of the block and undo files on disk
    *   "pruned" : true|false,                  (boolean) if the blocks are subject to pruning
    *   "pruneheight" : n,                      (numeric) lowest-height complete block stored (only present if pruning is enabled)
    *   "automatic_pruning" : true|false,       (boolean) whether automatic pruning is enabled (only present if pruning is enabled)
    *   "prune_target_size" : n,                (numeric) the target size used by pruning (only present if automatic pruning is enabled)
    *   "softforks" : {                         (json object) status of softforks
    *     "xxxx" : {                            (json object) name of the softfork
    *       "type" : "str",                     (string) one of "buried", "bip9"
    *       "bip9" : {                          (json object) status of bip9 softforks (only for "bip9" type)
    *         "status" : "str",                 (string) one of "defined", "started", "locked_in", "active", "failed"
    *         "bit" : n,                        (numeric) the bit (0-28) in the block version field used to signal this softfork (only for "started" status)
    *         "start_time" : xxx,               (numeric) the minimum median time past of a block at which the bit gains its meaning
    *         "timeout" : xxx,                  (numeric) the median time past of a block at which the deployment is considered failed if not yet locked in
    *         "since" : n,                      (numeric) height of the first block to which the status applies
    *         "min_activation_height" : n,      (numeric) minimum height of blocks for which the rules may be enforced
    *         "statistics" : {                  (json object) numeric statistics about BIP9 signalling for a softfork (only for "started" status)
    *           "period" : n,                   (numeric) the length in blocks of the BIP9 signalling period
    *           "threshold" : n,                (numeric) the number of blocks with the version bit set required to activate the feature
    *           "elapsed" : n,                  (numeric) the number of blocks elapsed since the beginning of the current period
    *           "count" : n,                    (numeric) the number of blocks with the version bit set in the current period
    *           "possible" : true|false         (boolean) returns false if there are not enough blocks left in this period to pass activation threshold
    *         }
    *       },
    *       "height" : n,                       (numeric) height of the first block which the rules are or will be enforced (only for "buried" type, or "bip9" type with "active" status)
    *       "active" : true|false               (boolean) true if the rules are enforced for the mempool and the next block
    *     },
    *     ...
    *   },
    *   "warnings" : "str"                      (string) any network and blockchain warnings
    * }
    * 
    * Examples:
    * > bitcoin-cli getblockchaininfo 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getblockchaininfo", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getblockchaininfo() { return getblockchaininfo.invoke(); }

   /**
    * getchaintips
    * Return information about all known tips in the block tree, including the main chain as well as orphaned branches.
    * 
    * Result:
    * [                        (json array)
    *   {                      (json object)
    *     "height" : n,        (numeric) height of the chain tip
    *     "hash" : "hex",      (string) block hash of the tip
    *     "branchlen" : n,     (numeric) zero for main chain, otherwise length of branch connecting the tip to the main chain
    *     "status" : "str"     (string) status of the chain, "active" for the main chain
    *                          Possible values for status:
    *                          1.  "invalid"               This branch contains at least one invalid block
    *                          2.  "headers-only"          Not all blocks for this branch are available, but the headers are valid
    *                          3.  "valid-headers"         All blocks are available for this branch, but they were never fully validated
    *                          4.  "valid-fork"            This branch is not part of the active chain, but is fully validated
    *                          5.  "active"                This is the tip of the active main chain, which is certainly valid
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * > bitcoin-cli getchaintips 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getchaintips", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getchaintips() { return getchaintips.invoke(); }

   /**
    * testmempoolaccept ["rawtx",...] ( maxfeerate )
    * 
    * Returns result of mempool acceptance tests indicating if raw transaction(s) (serialized, hex-encoded) would be accepted by mempool.
    * 
    * If multiple transactions are passed in, parents must come before children and package policies apply: the transactions cannot conflict with any mempool transactions or each other.
    * 
    * If one transaction fails, other transactions may not be fully validated (the 'allowed' key will be blank).
    * 
    * The maximum number of transactions allowed is 25.
    * 
    * This checks if transactions violate the consensus or policy rules.
    * 
    * See sendrawtransaction call.
    * 
    * Arguments:
    * 1. rawtxs          (json array, required) An array of hex strings of raw transactions.
    *      [
    *        "rawtx",    (string)
    *        ...
    *      ]
    * 2. maxfeerate      (numeric or string, optional, default="0.10") Reject transactions whose fee rate is higher than the specified value, expressed in BTC/kvB
    *                    
    * 
    * Result:
    * [                               (json array) The result of the mempool acceptance test for each raw transaction in the input array.
    *                                 Returns results for each transaction in the same order they were passed in.
    *                                 It is possible for transactions to not be fully validated ('allowed' unset) if another transaction failed.
    *                                 
    *   {                             (json object)
    *     "txid" : "hex",             (string) The transaction hash in hex
    *     "wtxid" : "hex",            (string) The transaction witness hash in hex
    *     "package-error" : "str",    (string) Package validation error, if any (only possible if rawtxs had more than 1 transaction).
    *     "allowed" : true|false,     (boolean) Whether this tx would be accepted to the mempool and pass client-specified maxfeerate.If not present, the tx was not fully validated due to a failure in another tx in the list.
    *     "vsize" : n,                (numeric) Virtual transaction size as defined in BIP 141. This is different from actual serialized size for witness transactions as witness data is discounted (only present when 'allowed' is true)
    *     "fees" : {                  (json object) Transaction fees (only present if 'allowed' is true)
    *       "base" : n                (numeric) transaction fee in BTC
    *     },
    *     "reject-reason" : "str"     (string) Rejection string (only present when 'allowed' is false)
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * 
    * Create a transaction
    * > bitcoin-cli createrawtransaction "[{\"txid\" : \"mytxid\",\"vout\":0}]" "{\"myaddress\":0.01}"
    * Sign the transaction, and get back the hex
    * > bitcoin-cli signrawtransactionwithwallet "myhex"
    * 
    * Test acceptance of the transaction (signed hex)
    * > bitcoin-cli testmempoolaccept '["signedhex"]'
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "testmempoolaccept", "params": [["signedhex"]]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object testmempoolaccept(Object rawtxs) { return testmempoolaccept.invoke(rawtxs); }


   /**
    * testmempoolaccept ["rawtx",...] ( maxfeerate )
    * 
    * Returns result of mempool acceptance tests indicating if raw transaction(s) (serialized, hex-encoded) would be accepted by mempool.
    * 
    * If multiple transactions are passed in, parents must come before children and package policies apply: the transactions cannot conflict with any mempool transactions or each other.
    * 
    * If one transaction fails, other transactions may not be fully validated (the 'allowed' key will be blank).
    * 
    * The maximum number of transactions allowed is 25.
    * 
    * This checks if transactions violate the consensus or policy rules.
    * 
    * See sendrawtransaction call.
    * 
    * Arguments:
    * 1. rawtxs          (json array, required) An array of hex strings of raw transactions.
    *      [
    *        "rawtx",    (string)
    *        ...
    *      ]
    * 2. maxfeerate      (numeric or string, optional, default="0.10") Reject transactions whose fee rate is higher than the specified value, expressed in BTC/kvB
    *                    
    * 
    * Result:
    * [                               (json array) The result of the mempool acceptance test for each raw transaction in the input array.
    *                                 Returns results for each transaction in the same order they were passed in.
    *                                 It is possible for transactions to not be fully validated ('allowed' unset) if another transaction failed.
    *                                 
    *   {                             (json object)
    *     "txid" : "hex",             (string) The transaction hash in hex
    *     "wtxid" : "hex",            (string) The transaction witness hash in hex
    *     "package-error" : "str",    (string) Package validation error, if any (only possible if rawtxs had more than 1 transaction).
    *     "allowed" : true|false,     (boolean) Whether this tx would be accepted to the mempool and pass client-specified maxfeerate.If not present, the tx was not fully validated due to a failure in another tx in the list.
    *     "vsize" : n,                (numeric) Virtual transaction size as defined in BIP 141. This is different from actual serialized size for witness transactions as witness data is discounted (only present when 'allowed' is true)
    *     "fees" : {                  (json object) Transaction fees (only present if 'allowed' is true)
    *       "base" : n                (numeric) transaction fee in BTC
    *     },
    *     "reject-reason" : "str"     (string) Rejection string (only present when 'allowed' is false)
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * 
    * Create a transaction
    * > bitcoin-cli createrawtransaction "[{\"txid\" : \"mytxid\",\"vout\":0}]" "{\"myaddress\":0.01}"
    * Sign the transaction, and get back the hex
    * > bitcoin-cli signrawtransactionwithwallet "myhex"
    * 
    * Test acceptance of the transaction (signed hex)
    * > bitcoin-cli testmempoolaccept '["signedhex"]'
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "testmempoolaccept", "params": [["signedhex"]]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object testmempoolaccept(Object rawtxs, Object maxfeerate) { return testmempoolaccept.invoke(rawtxs, maxfeerate); }

   /**
    * combinerawtransaction ["hexstring",...]
    * 
    * Combine multiple partially signed transactions into one transaction.
    * The combined transaction may be another partially signed transaction or a 
    * fully signed transaction.
    * Arguments:
    * 1. txs                 (json array, required) The hex strings of partially signed transactions
    *      [
    *        "hexstring",    (string) A hex-encoded raw transaction
    *        ...
    *      ]
    * 
    * Result:
    * "str"    (string) The hex-encoded raw transaction with signature(s)
    * 
    * Examples:
    * > bitcoin-cli combinerawtransaction '["myhex1", "myhex2", "myhex3"]'
    */
   public Object combinerawtransaction(Object hexstrings) { return combinerawtransaction.invoke(hexstrings); }

   /**
    * setban "subnet" "command" ( bantime absolute )
    * 
    * Attempts to add or remove an IP/Subnet from the banned list.
    * 
    * Arguments:
    * 1. subnet      (string, required) The IP/Subnet (see getpeerinfo for nodes IP) with an optional netmask (default is /32 = single IP)
    * 2. command     (string, required) 'add' to add an IP/Subnet to the list, 'remove' to remove an IP/Subnet from the list
    * 3. bantime     (numeric, optional, default=0) time in seconds how long (or until when if [absolute] is set) the IP is banned (0 or empty means using the default time of 24h which can also be overwritten by the -bantime startup argument)
    * 4. absolute    (boolean, optional, default=false) If set, the bantime must be an absolute timestamp expressed in UNIX epoch time
    * 
    * Result:
    * null    (json null)
    * 
    * Examples:
    * > bitcoin-cli setban "192.168.0.6" "add" 86400
    * > bitcoin-cli setban "192.168.0.0/24" "add"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "setban", "params": ["192.168.0.6", "add", 86400]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object setban(Object subnet, Object command) { return setban.invoke(subnet, command); }


   /**
    * setban "subnet" "command" ( bantime absolute )
    * 
    * Attempts to add or remove an IP/Subnet from the banned list.
    * 
    * Arguments:
    * 1. subnet      (string, required) The IP/Subnet (see getpeerinfo for nodes IP) with an optional netmask (default is /32 = single IP)
    * 2. command     (string, required) 'add' to add an IP/Subnet to the list, 'remove' to remove an IP/Subnet from the list
    * 3. bantime     (numeric, optional, default=0) time in seconds how long (or until when if [absolute] is set) the IP is banned (0 or empty means using the default time of 24h which can also be overwritten by the -bantime startup argument)
    * 4. absolute    (boolean, optional, default=false) If set, the bantime must be an absolute timestamp expressed in UNIX epoch time
    * 
    * Result:
    * null    (json null)
    * 
    * Examples:
    * > bitcoin-cli setban "192.168.0.6" "add" 86400
    * > bitcoin-cli setban "192.168.0.0/24" "add"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "setban", "params": ["192.168.0.6", "add", 86400]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object setban(Object subnet, Object command, Object bantime) { return setban.invoke(subnet, command, bantime); }


   /**
    * setban "subnet" "command" ( bantime absolute )
    * 
    * Attempts to add or remove an IP/Subnet from the banned list.
    * 
    * Arguments:
    * 1. subnet      (string, required) The IP/Subnet (see getpeerinfo for nodes IP) with an optional netmask (default is /32 = single IP)
    * 2. command     (string, required) 'add' to add an IP/Subnet to the list, 'remove' to remove an IP/Subnet from the list
    * 3. bantime     (numeric, optional, default=0) time in seconds how long (or until when if [absolute] is set) the IP is banned (0 or empty means using the default time of 24h which can also be overwritten by the -bantime startup argument)
    * 4. absolute    (boolean, optional, default=false) If set, the bantime must be an absolute timestamp expressed in UNIX epoch time
    * 
    * Result:
    * null    (json null)
    * 
    * Examples:
    * > bitcoin-cli setban "192.168.0.6" "add" 86400
    * > bitcoin-cli setban "192.168.0.0/24" "add"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "setban", "params": ["192.168.0.6", "add", 86400]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object setban(Object subnet, Object command, Object bantime, Object absolute) { return setban.invoke(subnet, command, bantime, absolute); }

   /**
    * addmultisigaddress nrequired ["key",...] ( "label" "address_type" )
    * 
    * Add an nrequired-to-sign multisignature address to the wallet. Requires a new wallet backup.
    * Each key is a Bitcoin address or hex-encoded public key.
    * This functionality is only intended for use with non-watchonly addresses.
    * See `importaddress` for watchonly p2sh address support.
    * If 'label' is specified, assign address to that label.
    * 
    * Arguments:
    * 1. nrequired       (numeric, required) The number of required signatures out of the n keys or addresses.
    * 2. keys            (json array, required) The bitcoin addresses or hex-encoded public keys
    *      [
    *        "key",      (string) bitcoin address or hex-encoded public key
    *        ...
    *      ]
    * 3. label           (string, optional) A label to assign the addresses to.
    * 4. address_type    (string, optional, default=set by -addresstype) The address type to use. Options are "legacy", "p2sh-segwit", and "bech32".
    * 
    * Result:
    * {                            (json object)
    *   "address" : "str",         (string) The value of the new multisig address
    *   "redeemScript" : "hex",    (string) The string value of the hex-encoded redemption script
    *   "descriptor" : "str"       (string) The descriptor for this multisig
    * }
    * 
    * Examples:
    * 
    * Add a multisig address from 2 addresses
    * > bitcoin-cli addmultisigaddress 2 "[\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\",\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\"]"
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "addmultisigaddress", "params": [2, "[\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\",\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\"]"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object addmultisigaddress(Object nrequired, Object keys) { return addmultisigaddress.invoke(nrequired, keys); }


   /**
    * addmultisigaddress nrequired ["key",...] ( "label" "address_type" )
    * 
    * Add an nrequired-to-sign multisignature address to the wallet. Requires a new wallet backup.
    * Each key is a Bitcoin address or hex-encoded public key.
    * This functionality is only intended for use with non-watchonly addresses.
    * See `importaddress` for watchonly p2sh address support.
    * If 'label' is specified, assign address to that label.
    * 
    * Arguments:
    * 1. nrequired       (numeric, required) The number of required signatures out of the n keys or addresses.
    * 2. keys            (json array, required) The bitcoin addresses or hex-encoded public keys
    *      [
    *        "key",      (string) bitcoin address or hex-encoded public key
    *        ...
    *      ]
    * 3. label           (string, optional) A label to assign the addresses to.
    * 4. address_type    (string, optional, default=set by -addresstype) The address type to use. Options are "legacy", "p2sh-segwit", and "bech32".
    * 
    * Result:
    * {                            (json object)
    *   "address" : "str",         (string) The value of the new multisig address
    *   "redeemScript" : "hex",    (string) The string value of the hex-encoded redemption script
    *   "descriptor" : "str"       (string) The descriptor for this multisig
    * }
    * 
    * Examples:
    * 
    * Add a multisig address from 2 addresses
    * > bitcoin-cli addmultisigaddress 2 "[\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\",\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\"]"
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "addmultisigaddress", "params": [2, "[\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\",\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\"]"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object addmultisigaddress(Object nrequired, Object keys, Object label) { return addmultisigaddress.invoke(nrequired, keys, label); }


   /**
    * addmultisigaddress nrequired ["key",...] ( "label" "address_type" )
    * 
    * Add an nrequired-to-sign multisignature address to the wallet. Requires a new wallet backup.
    * Each key is a Bitcoin address or hex-encoded public key.
    * This functionality is only intended for use with non-watchonly addresses.
    * See `importaddress` for watchonly p2sh address support.
    * If 'label' is specified, assign address to that label.
    * 
    * Arguments:
    * 1. nrequired       (numeric, required) The number of required signatures out of the n keys or addresses.
    * 2. keys            (json array, required) The bitcoin addresses or hex-encoded public keys
    *      [
    *        "key",      (string) bitcoin address or hex-encoded public key
    *        ...
    *      ]
    * 3. label           (string, optional) A label to assign the addresses to.
    * 4. address_type    (string, optional, default=set by -addresstype) The address type to use. Options are "legacy", "p2sh-segwit", and "bech32".
    * 
    * Result:
    * {                            (json object)
    *   "address" : "str",         (string) The value of the new multisig address
    *   "redeemScript" : "hex",    (string) The string value of the hex-encoded redemption script
    *   "descriptor" : "str"       (string) The descriptor for this multisig
    * }
    * 
    * Examples:
    * 
    * Add a multisig address from 2 addresses
    * > bitcoin-cli addmultisigaddress 2 "[\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\",\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\"]"
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "addmultisigaddress", "params": [2, "[\"bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl\",\"bc1q02ad21edsxd23d32dfgqqsz4vv4nmtfzuklhy3\"]"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object addmultisigaddress(Object nrequired, Object keys, Object label, Object address_type) { return addmultisigaddress.invoke(nrequired, keys, label, address_type); }

   /**
    * signmessage "address" "message"
    * 
    * Sign a message with the private key of an address
    * Requires wallet passphrase to be set with walletpassphrase call if wallet is encrypted.
    * 
    * Arguments:
    * 1. address    (string, required) The bitcoin address to use for the private key.
    * 2. message    (string, required) The message to create a signature of.
    * 
    * Result:
    * "str"    (string) The signature of the message encoded in base 64
    * 
    * Examples:
    * 
    * Unlock the wallet for 30 seconds
    * > bitcoin-cli walletpassphrase "mypassphrase" 30
    * 
    * Create the signature
    * > bitcoin-cli signmessage "1D1ZrZNe3JUo7ZycKEYQQiQAWd9y54F4XX" "my message"
    * 
    * Verify the signature
    * > bitcoin-cli verifymessage "1D1ZrZNe3JUo7ZycKEYQQiQAWd9y54F4XX" "signature" "my message"
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "signmessage", "params": ["1D1ZrZNe3JUo7ZycKEYQQiQAWd9y54F4XX", "my message"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object signmessage(Object address, Object message) { return signmessage.invoke(address, message); }

   /**
    * getrpcinfo
    * 
    * Returns details of the RPC server.
    * 
    * Result:
    * {                          (json object)
    *   "active_commands" : [    (json array) All active commands
    *     {                      (json object) Information about an active command
    *       "method" : "str",    (string) The name of the RPC command
    *       "duration" : n       (numeric) The running time in microseconds
    *     },
    *     ...
    *   ],
    *   "logpath" : "str"        (string) The complete file path to the debug log
    * }
    * 
    * Examples:
    * > bitcoin-cli getrpcinfo 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getrpcinfo", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getrpcinfo() { return getrpcinfo.invoke(); }

   /**
    * getrawmempool ( verbose mempool_sequence )
    * 
    * Returns all transaction ids in memory pool as a json array of string transaction ids.
    * 
    * Hint: use getmempoolentry to fetch a specific transaction from the mempool.
    * 
    * Arguments:
    * 1. verbose             (boolean, optional, default=false) True for a json object, false for array of transaction ids
    * 2. mempool_sequence    (boolean, optional, default=false) If verbose=false, returns a json object with transaction list and mempool sequence number attached.
    * 
    * Result (for verbose = false):
    * [           (json array)
    *   "hex",    (string) The transaction id
    *   ...
    * ]
    * 
    * Result (for verbose = true):
    * {                                         (json object)
    *   "transactionid" : {                     (json object)
    *     "vsize" : n,                          (numeric) virtual transaction size as defined in BIP 141. This is different from actual serialized size for witness transactions as witness data is discounted.
    *     "weight" : n,                         (numeric) transaction weight as defined in BIP 141.
    *     "fee" : n,                            (numeric) transaction fee in BTC (DEPRECATED)
    *     "modifiedfee" : n,                    (numeric) transaction fee with fee deltas used for mining priority (DEPRECATED)
    *     "time" : xxx,                         (numeric) local time transaction entered pool in seconds since 1 Jan 1970 GMT
    *     "height" : n,                         (numeric) block height when transaction entered pool
    *     "descendantcount" : n,                (numeric) number of in-mempool descendant transactions (including this one)
    *     "descendantsize" : n,                 (numeric) virtual transaction size of in-mempool descendants (including this one)
    *     "descendantfees" : n,                 (numeric) modified fees (see above) of in-mempool descendants (including this one) (DEPRECATED)
    *     "ancestorcount" : n,                  (numeric) number of in-mempool ancestor transactions (including this one)
    *     "ancestorsize" : n,                   (numeric) virtual transaction size of in-mempool ancestors (including this one)
    *     "ancestorfees" : n,                   (numeric) modified fees (see above) of in-mempool ancestors (including this one) (DEPRECATED)
    *     "wtxid" : "hex",                      (string) hash of serialized transaction, including witness data
    *     "fees" : {                            (json object)
    *       "base" : n,                         (numeric) transaction fee in BTC
    *       "modified" : n,                     (numeric) transaction fee with fee deltas used for mining priority in BTC
    *       "ancestor" : n,                     (numeric) modified fees (see above) of in-mempool ancestors (including this one) in BTC
    *       "descendant" : n                    (numeric) modified fees (see above) of in-mempool descendants (including this one) in BTC
    *     },
    *     "depends" : [                         (json array) unconfirmed transactions used as inputs for this transaction
    *       "hex",                              (string) parent transaction id
    *       ...
    *     ],
    *     "spentby" : [                         (json array) unconfirmed transactions spending outputs from this transaction
    *       "hex",                              (string) child transaction id
    *       ...
    *     ],
    *     "bip125-replaceable" : true|false,    (boolean) Whether this transaction could be replaced due to BIP125 (replace-by-fee)
    *     "unbroadcast" : true|false            (boolean) Whether this transaction is currently unbroadcast (initial broadcast not yet acknowledged by any peers)
    *   },
    *   ...
    * }
    * 
    * Result (for verbose = false and mempool_sequence = true):
    * {                            (json object)
    *   "txids" : [                (json array)
    *     "hex",                   (string) The transaction id
    *     ...
    *   ],
    *   "mempool_sequence" : n     (numeric) The mempool sequence value.
    * }
    * 
    * Examples:
    * > bitcoin-cli getrawmempool true
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getrawmempool", "params": [true]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getrawmempool() { return getrawmempool.invoke(); }


   /**
    * getrawmempool ( verbose mempool_sequence )
    * 
    * Returns all transaction ids in memory pool as a json array of string transaction ids.
    * 
    * Hint: use getmempoolentry to fetch a specific transaction from the mempool.
    * 
    * Arguments:
    * 1. verbose             (boolean, optional, default=false) True for a json object, false for array of transaction ids
    * 2. mempool_sequence    (boolean, optional, default=false) If verbose=false, returns a json object with transaction list and mempool sequence number attached.
    * 
    * Result (for verbose = false):
    * [           (json array)
    *   "hex",    (string) The transaction id
    *   ...
    * ]
    * 
    * Result (for verbose = true):
    * {                                         (json object)
    *   "transactionid" : {                     (json object)
    *     "vsize" : n,                          (numeric) virtual transaction size as defined in BIP 141. This is different from actual serialized size for witness transactions as witness data is discounted.
    *     "weight" : n,                         (numeric) transaction weight as defined in BIP 141.
    *     "fee" : n,                            (numeric) transaction fee in BTC (DEPRECATED)
    *     "modifiedfee" : n,                    (numeric) transaction fee with fee deltas used for mining priority (DEPRECATED)
    *     "time" : xxx,                         (numeric) local time transaction entered pool in seconds since 1 Jan 1970 GMT
    *     "height" : n,                         (numeric) block height when transaction entered pool
    *     "descendantcount" : n,                (numeric) number of in-mempool descendant transactions (including this one)
    *     "descendantsize" : n,                 (numeric) virtual transaction size of in-mempool descendants (including this one)
    *     "descendantfees" : n,                 (numeric) modified fees (see above) of in-mempool descendants (including this one) (DEPRECATED)
    *     "ancestorcount" : n,                  (numeric) number of in-mempool ancestor transactions (including this one)
    *     "ancestorsize" : n,                   (numeric) virtual transaction size of in-mempool ancestors (including this one)
    *     "ancestorfees" : n,                   (numeric) modified fees (see above) of in-mempool ancestors (including this one) (DEPRECATED)
    *     "wtxid" : "hex",                      (string) hash of serialized transaction, including witness data
    *     "fees" : {                            (json object)
    *       "base" : n,                         (numeric) transaction fee in BTC
    *       "modified" : n,                     (numeric) transaction fee with fee deltas used for mining priority in BTC
    *       "ancestor" : n,                     (numeric) modified fees (see above) of in-mempool ancestors (including this one) in BTC
    *       "descendant" : n                    (numeric) modified fees (see above) of in-mempool descendants (including this one) in BTC
    *     },
    *     "depends" : [                         (json array) unconfirmed transactions used as inputs for this transaction
    *       "hex",                              (string) parent transaction id
    *       ...
    *     ],
    *     "spentby" : [                         (json array) unconfirmed transactions spending outputs from this transaction
    *       "hex",                              (string) child transaction id
    *       ...
    *     ],
    *     "bip125-replaceable" : true|false,    (boolean) Whether this transaction could be replaced due to BIP125 (replace-by-fee)
    *     "unbroadcast" : true|false            (boolean) Whether this transaction is currently unbroadcast (initial broadcast not yet acknowledged by any peers)
    *   },
    *   ...
    * }
    * 
    * Result (for verbose = false and mempool_sequence = true):
    * {                            (json object)
    *   "txids" : [                (json array)
    *     "hex",                   (string) The transaction id
    *     ...
    *   ],
    *   "mempool_sequence" : n     (numeric) The mempool sequence value.
    * }
    * 
    * Examples:
    * > bitcoin-cli getrawmempool true
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getrawmempool", "params": [true]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getrawmempool(Object verbose) { return getrawmempool.invoke(verbose); }


   /**
    * getrawmempool ( verbose mempool_sequence )
    * 
    * Returns all transaction ids in memory pool as a json array of string transaction ids.
    * 
    * Hint: use getmempoolentry to fetch a specific transaction from the mempool.
    * 
    * Arguments:
    * 1. verbose             (boolean, optional, default=false) True for a json object, false for array of transaction ids
    * 2. mempool_sequence    (boolean, optional, default=false) If verbose=false, returns a json object with transaction list and mempool sequence number attached.
    * 
    * Result (for verbose = false):
    * [           (json array)
    *   "hex",    (string) The transaction id
    *   ...
    * ]
    * 
    * Result (for verbose = true):
    * {                                         (json object)
    *   "transactionid" : {                     (json object)
    *     "vsize" : n,                          (numeric) virtual transaction size as defined in BIP 141. This is different from actual serialized size for witness transactions as witness data is discounted.
    *     "weight" : n,                         (numeric) transaction weight as defined in BIP 141.
    *     "fee" : n,                            (numeric) transaction fee in BTC (DEPRECATED)
    *     "modifiedfee" : n,                    (numeric) transaction fee with fee deltas used for mining priority (DEPRECATED)
    *     "time" : xxx,                         (numeric) local time transaction entered pool in seconds since 1 Jan 1970 GMT
    *     "height" : n,                         (numeric) block height when transaction entered pool
    *     "descendantcount" : n,                (numeric) number of in-mempool descendant transactions (including this one)
    *     "descendantsize" : n,                 (numeric) virtual transaction size of in-mempool descendants (including this one)
    *     "descendantfees" : n,                 (numeric) modified fees (see above) of in-mempool descendants (including this one) (DEPRECATED)
    *     "ancestorcount" : n,                  (numeric) number of in-mempool ancestor transactions (including this one)
    *     "ancestorsize" : n,                   (numeric) virtual transaction size of in-mempool ancestors (including this one)
    *     "ancestorfees" : n,                   (numeric) modified fees (see above) of in-mempool ancestors (including this one) (DEPRECATED)
    *     "wtxid" : "hex",                      (string) hash of serialized transaction, including witness data
    *     "fees" : {                            (json object)
    *       "base" : n,                         (numeric) transaction fee in BTC
    *       "modified" : n,                     (numeric) transaction fee with fee deltas used for mining priority in BTC
    *       "ancestor" : n,                     (numeric) modified fees (see above) of in-mempool ancestors (including this one) in BTC
    *       "descendant" : n                    (numeric) modified fees (see above) of in-mempool descendants (including this one) in BTC
    *     },
    *     "depends" : [                         (json array) unconfirmed transactions used as inputs for this transaction
    *       "hex",                              (string) parent transaction id
    *       ...
    *     ],
    *     "spentby" : [                         (json array) unconfirmed transactions spending outputs from this transaction
    *       "hex",                              (string) child transaction id
    *       ...
    *     ],
    *     "bip125-replaceable" : true|false,    (boolean) Whether this transaction could be replaced due to BIP125 (replace-by-fee)
    *     "unbroadcast" : true|false            (boolean) Whether this transaction is currently unbroadcast (initial broadcast not yet acknowledged by any peers)
    *   },
    *   ...
    * }
    * 
    * Result (for verbose = false and mempool_sequence = true):
    * {                            (json object)
    *   "txids" : [                (json array)
    *     "hex",                   (string) The transaction id
    *     ...
    *   ],
    *   "mempool_sequence" : n     (numeric) The mempool sequence value.
    * }
    * 
    * Examples:
    * > bitcoin-cli getrawmempool true
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getrawmempool", "params": [true]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getrawmempool(Object verbose, Object mempool_sequence) { return getrawmempool.invoke(verbose, mempool_sequence); }

   /**
    * setnetworkactive state
    * 
    * Disable/enable all p2p network activity.
    * 
    * Arguments:
    * 1. state    (boolean, required) true to enable networking, false to disable
    * 
    * Result:
    * true|false    (boolean) The value that was passed in
    */
   public Object setnetworkactive(Object state) { return setnetworkactive.invoke(state); }

   /**
    * validateaddress "address"
    * 
    * Return information about the given bitcoin address.
    * 
    * Arguments:
    * 1. address    (string, required) The bitcoin address to validate
    * 
    * Result:
    * {                               (json object)
    *   "isvalid" : true|false,       (boolean) If the address is valid or not
    *   "address" : "str",            (string) The bitcoin address validated
    *   "scriptPubKey" : "hex",       (string) The hex-encoded scriptPubKey generated by the address
    *   "isscript" : true|false,      (boolean) If the key is a script
    *   "iswitness" : true|false,     (boolean) If the address is a witness address
    *   "witness_version" : n,        (numeric, optional) The version number of the witness program
    *   "witness_program" : "hex",    (string, optional) The hex value of the witness program
    *   "error" : "str"               (string, optional) Error message, if any
    * }
    * 
    * Examples:
    * > bitcoin-cli validateaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "validateaddress", "params": ["bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object validateaddress(Object address) { return validateaddress.invoke(address); }

   /**
    * sendrawtransaction "hexstring" ( maxfeerate )
    * 
    * Submit a raw transaction (serialized, hex-encoded) to local node and network.
    * 
    * The transaction will be sent unconditionally to all peers, so using sendrawtransaction
    * for manual rebroadcast may degrade privacy by leaking the transaction's origin, as
    * nodes will normally not rebroadcast non-wallet transactions already in their mempool.
    * 
    * A specific exception, RPC_TRANSACTION_ALREADY_IN_CHAIN, may throw if the transaction cannot be added to the mempool.
    * 
    * Related RPCs: createrawtransaction, signrawtransactionwithkey
    * 
    * Arguments:
    * 1. hexstring     (string, required) The hex string of the raw transaction
    * 2. maxfeerate    (numeric or string, optional, default="0.10") Reject transactions whose fee rate is higher than the specified value, expressed in BTC/kvB.
    *                  Set to 0 to accept any fee rate.
    *                  
    * 
    * Result:
    * "hex"    (string) The transaction hash in hex
    * 
    * Examples:
    * 
    * Create a transaction
    * > bitcoin-cli createrawtransaction "[{\"txid\" : \"mytxid\",\"vout\":0}]" "{\"myaddress\":0.01}"
    * Sign the transaction, and get back the hex
    * > bitcoin-cli signrawtransactionwithwallet "myhex"
    * 
    * Send the transaction (signed hex)
    * > bitcoin-cli sendrawtransaction "signedhex"
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "sendrawtransaction", "params": ["signedhex"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object sendrawtransaction(Object hexstring) { return sendrawtransaction.invoke(hexstring); }


   /**
    * sendrawtransaction "hexstring" ( maxfeerate )
    * 
    * Submit a raw transaction (serialized, hex-encoded) to local node and network.
    * 
    * The transaction will be sent unconditionally to all peers, so using sendrawtransaction
    * for manual rebroadcast may degrade privacy by leaking the transaction's origin, as
    * nodes will normally not rebroadcast non-wallet transactions already in their mempool.
    * 
    * A specific exception, RPC_TRANSACTION_ALREADY_IN_CHAIN, may throw if the transaction cannot be added to the mempool.
    * 
    * Related RPCs: createrawtransaction, signrawtransactionwithkey
    * 
    * Arguments:
    * 1. hexstring     (string, required) The hex string of the raw transaction
    * 2. maxfeerate    (numeric or string, optional, default="0.10") Reject transactions whose fee rate is higher than the specified value, expressed in BTC/kvB.
    *                  Set to 0 to accept any fee rate.
    *                  
    * 
    * Result:
    * "hex"    (string) The transaction hash in hex
    * 
    * Examples:
    * 
    * Create a transaction
    * > bitcoin-cli createrawtransaction "[{\"txid\" : \"mytxid\",\"vout\":0}]" "{\"myaddress\":0.01}"
    * Sign the transaction, and get back the hex
    * > bitcoin-cli signrawtransactionwithwallet "myhex"
    * 
    * Send the transaction (signed hex)
    * > bitcoin-cli sendrawtransaction "signedhex"
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "sendrawtransaction", "params": ["signedhex"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object sendrawtransaction(Object hexstring, Object maxfeerate) { return sendrawtransaction.invoke(hexstring, maxfeerate); }

   /**
    * preciousblock "blockhash"
    * 
    * Treats a block as if it were received before others with the same work.
    * 
    * A later preciousblock call can override the effect of an earlier one.
    * 
    * The effects of preciousblock are not retained across restarts.
    * 
    * Arguments:
    * 1. blockhash    (string, required) the hash of the block to mark as precious
    * 
    * Result:
    * null    (json null)
    * 
    * Examples:
    * > bitcoin-cli preciousblock "blockhash"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "preciousblock", "params": ["blockhash"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object preciousblock(Object blockhash) { return preciousblock.invoke(blockhash); }

   /**
    * keypoolrefill ( newsize )
    * 
    * Fills the keypool.
    * Requires wallet passphrase to be set with walletpassphrase call if wallet is encrypted.
    * 
    * Arguments:
    * 1. newsize    (numeric, optional, default=100) The new keypool size
    * 
    * Result:
    * null    (json null)
    * 
    * Examples:
    * > bitcoin-cli keypoolrefill 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "keypoolrefill", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object keypoolrefill() { return keypoolrefill.invoke(); }


   /**
    * keypoolrefill ( newsize )
    * 
    * Fills the keypool.
    * Requires wallet passphrase to be set with walletpassphrase call if wallet is encrypted.
    * 
    * Arguments:
    * 1. newsize    (numeric, optional, default=100) The new keypool size
    * 
    * Result:
    * null    (json null)
    * 
    * Examples:
    * > bitcoin-cli keypoolrefill 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "keypoolrefill", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object keypoolrefill(Object newsize) { return keypoolrefill.invoke(newsize); }

   /**
    * getreceivedbyaddress "address" ( minconf )
    * 
    * Returns the total amount received by the given address in transactions with at least minconf confirmations.
    * 
    * Arguments:
    * 1. address    (string, required) The bitcoin address for transactions.
    * 2. minconf    (numeric, optional, default=1) Only include transactions confirmed at least this many times.
    * 
    * Result:
    * n    (numeric) The total amount in BTC received at this address.
    * 
    * Examples:
    * 
    * The amount from transactions with at least 1 confirmation
    * > bitcoin-cli getreceivedbyaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl"
    * 
    * The amount including unconfirmed transactions, zero confirmations
    * > bitcoin-cli getreceivedbyaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 0
    * 
    * The amount with at least 6 confirmations
    * > bitcoin-cli getreceivedbyaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 6
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getreceivedbyaddress", "params": ["bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl", 6]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getreceivedbyaddress(Object address) { return getreceivedbyaddress.invoke(address); }


   /**
    * getreceivedbyaddress "address" ( minconf )
    * 
    * Returns the total amount received by the given address in transactions with at least minconf confirmations.
    * 
    * Arguments:
    * 1. address    (string, required) The bitcoin address for transactions.
    * 2. minconf    (numeric, optional, default=1) Only include transactions confirmed at least this many times.
    * 
    * Result:
    * n    (numeric) The total amount in BTC received at this address.
    * 
    * Examples:
    * 
    * The amount from transactions with at least 1 confirmation
    * > bitcoin-cli getreceivedbyaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl"
    * 
    * The amount including unconfirmed transactions, zero confirmations
    * > bitcoin-cli getreceivedbyaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 0
    * 
    * The amount with at least 6 confirmations
    * > bitcoin-cli getreceivedbyaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 6
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getreceivedbyaddress", "params": ["bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl", 6]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getreceivedbyaddress(Object address, Object minconf) { return getreceivedbyaddress.invoke(address, minconf); }

   /**
    * dumpprivkey "address"
    * 
    * Reveals the private key corresponding to 'address'.
    * Then the importprivkey can be used with this output
    * 
    * Arguments:
    * 1. address    (string, required) The bitcoin address for the private key
    * 
    * Result:
    * "str"    (string) The private key
    * 
    * Examples:
    * > bitcoin-cli dumpprivkey "myaddress"
    * > bitcoin-cli importprivkey "mykey"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "dumpprivkey", "params": ["myaddress"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object dumpprivkey(Object address) { return dumpprivkey.invoke(address); }

   /**
    * sendtoaddress "address" amount ( "comment" "comment_to" subtractfeefromamount replaceable conf_target "estimate_mode" avoid_reuse fee_rate verbose )
    * 
    * Send an amount to a given address.
    * Requires wallet passphrase to be set with walletpassphrase call if wallet is encrypted.
    * 
    * Arguments:
    * 1. address                  (string, required) The bitcoin address to send to.
    * 2. amount                   (numeric or string, required) The amount in BTC to send. eg 0.1
    * 3. comment                  (string, optional) A comment used to store what the transaction is for.
    *                             This is not part of the transaction, just kept in your wallet.
    * 4. comment_to               (string, optional) A comment to store the name of the person or organization
    *                             to which you're sending the transaction. This is not part of the 
    *                             transaction, just kept in your wallet.
    * 5. subtractfeefromamount    (boolean, optional, default=false) The fee will be deducted from the amount being sent.
    *                             The recipient will receive less bitcoins than you enter in the amount field.
    * 6. replaceable              (boolean, optional, default=wallet default) Allow this transaction to be replaced by a transaction with higher fees via BIP 125
    * 7. conf_target              (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    * 8. estimate_mode            (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                             "unset"
    *                             "economical"
    *                             "conservative"
    * 9. avoid_reuse              (boolean, optional, default=true) (only available if avoid_reuse wallet flag is set) Avoid spending from dirty addresses; addresses are considered
    *                             dirty if they have previously been used in a transaction. If true, this also activates avoidpartialspends, grouping outputs by their addresses.
    * 10. fee_rate                (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    * 11. verbose                 (boolean, optional, default=false) If true, return extra information about the transaction.
    * 
    * Result (if verbose is not set or set to false):
    * "hex"    (string) The transaction id.
    * 
    * Result (if verbose is set to true):
    * {                          (json object)
    *   "txid" : "hex",          (string) The transaction id.
    *   "fee reason" : "str"     (string) The transaction fee reason.
    * }
    * 
    * Examples:
    * 
    * Send 0.1 BTC
    * > bitcoin-cli sendtoaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 0.1
    * 
    * Send 0.1 BTC with a confirmation target of 6 blocks in economical fee estimate mode using positional arguments
    * > bitcoin-cli sendtoaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 0.1 "donation" "sean's outpost" false true 6 economical
    * 
    * Send 0.1 BTC with a fee rate of 1.1 sat/vB, subtract fee from amount, BIP125-replaceable, using positional arguments
    * > bitcoin-cli sendtoaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 0.1 "drinks" "room77" true true null "unset" null 1.1
    * 
    * Send 0.2 BTC with a confirmation target of 6 blocks in economical fee estimate mode using named arguments
    * > bitcoin-cli -named sendtoaddress address="bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" amount=0.2 conf_target=6 estimate_mode="economical"
    * 
    * Send 0.5 BTC with a fee rate of 25 sat/vB using named arguments
    * > bitcoin-cli -named sendtoaddress address="bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" amount=0.5 fee_rate=25
    * > bitcoin-cli -named sendtoaddress address="bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" amount=0.5 fee_rate=25 subtractfeefromamount=false replaceable=true avoid_reuse=true comment="2 pizzas" comment_to="jeremy" verbose=true
    */
   public Object sendtoaddress(Object address, Object amount) { return sendtoaddress.invoke(address, amount); }


   /**
    * sendtoaddress "address" amount ( "comment" "comment_to" subtractfeefromamount replaceable conf_target "estimate_mode" avoid_reuse fee_rate verbose )
    * 
    * Send an amount to a given address.
    * Requires wallet passphrase to be set with walletpassphrase call if wallet is encrypted.
    * 
    * Arguments:
    * 1. address                  (string, required) The bitcoin address to send to.
    * 2. amount                   (numeric or string, required) The amount in BTC to send. eg 0.1
    * 3. comment                  (string, optional) A comment used to store what the transaction is for.
    *                             This is not part of the transaction, just kept in your wallet.
    * 4. comment_to               (string, optional) A comment to store the name of the person or organization
    *                             to which you're sending the transaction. This is not part of the 
    *                             transaction, just kept in your wallet.
    * 5. subtractfeefromamount    (boolean, optional, default=false) The fee will be deducted from the amount being sent.
    *                             The recipient will receive less bitcoins than you enter in the amount field.
    * 6. replaceable              (boolean, optional, default=wallet default) Allow this transaction to be replaced by a transaction with higher fees via BIP 125
    * 7. conf_target              (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    * 8. estimate_mode            (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                             "unset"
    *                             "economical"
    *                             "conservative"
    * 9. avoid_reuse              (boolean, optional, default=true) (only available if avoid_reuse wallet flag is set) Avoid spending from dirty addresses; addresses are considered
    *                             dirty if they have previously been used in a transaction. If true, this also activates avoidpartialspends, grouping outputs by their addresses.
    * 10. fee_rate                (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    * 11. verbose                 (boolean, optional, default=false) If true, return extra information about the transaction.
    * 
    * Result (if verbose is not set or set to false):
    * "hex"    (string) The transaction id.
    * 
    * Result (if verbose is set to true):
    * {                          (json object)
    *   "txid" : "hex",          (string) The transaction id.
    *   "fee reason" : "str"     (string) The transaction fee reason.
    * }
    * 
    * Examples:
    * 
    * Send 0.1 BTC
    * > bitcoin-cli sendtoaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 0.1
    * 
    * Send 0.1 BTC with a confirmation target of 6 blocks in economical fee estimate mode using positional arguments
    * > bitcoin-cli sendtoaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 0.1 "donation" "sean's outpost" false true 6 economical
    * 
    * Send 0.1 BTC with a fee rate of 1.1 sat/vB, subtract fee from amount, BIP125-replaceable, using positional arguments
    * > bitcoin-cli sendtoaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 0.1 "drinks" "room77" true true null "unset" null 1.1
    * 
    * Send 0.2 BTC with a confirmation target of 6 blocks in economical fee estimate mode using named arguments
    * > bitcoin-cli -named sendtoaddress address="bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" amount=0.2 conf_target=6 estimate_mode="economical"
    * 
    * Send 0.5 BTC with a fee rate of 25 sat/vB using named arguments
    * > bitcoin-cli -named sendtoaddress address="bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" amount=0.5 fee_rate=25
    * > bitcoin-cli -named sendtoaddress address="bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" amount=0.5 fee_rate=25 subtractfeefromamount=false replaceable=true avoid_reuse=true comment="2 pizzas" comment_to="jeremy" verbose=true
    */
   public Object sendtoaddress(Object address, Object amount, Object comment) { return sendtoaddress.invoke(address, amount, comment); }


   /**
    * sendtoaddress "address" amount ( "comment" "comment_to" subtractfeefromamount replaceable conf_target "estimate_mode" avoid_reuse fee_rate verbose )
    * 
    * Send an amount to a given address.
    * Requires wallet passphrase to be set with walletpassphrase call if wallet is encrypted.
    * 
    * Arguments:
    * 1. address                  (string, required) The bitcoin address to send to.
    * 2. amount                   (numeric or string, required) The amount in BTC to send. eg 0.1
    * 3. comment                  (string, optional) A comment used to store what the transaction is for.
    *                             This is not part of the transaction, just kept in your wallet.
    * 4. comment_to               (string, optional) A comment to store the name of the person or organization
    *                             to which you're sending the transaction. This is not part of the 
    *                             transaction, just kept in your wallet.
    * 5. subtractfeefromamount    (boolean, optional, default=false) The fee will be deducted from the amount being sent.
    *                             The recipient will receive less bitcoins than you enter in the amount field.
    * 6. replaceable              (boolean, optional, default=wallet default) Allow this transaction to be replaced by a transaction with higher fees via BIP 125
    * 7. conf_target              (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    * 8. estimate_mode            (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                             "unset"
    *                             "economical"
    *                             "conservative"
    * 9. avoid_reuse              (boolean, optional, default=true) (only available if avoid_reuse wallet flag is set) Avoid spending from dirty addresses; addresses are considered
    *                             dirty if they have previously been used in a transaction. If true, this also activates avoidpartialspends, grouping outputs by their addresses.
    * 10. fee_rate                (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    * 11. verbose                 (boolean, optional, default=false) If true, return extra information about the transaction.
    * 
    * Result (if verbose is not set or set to false):
    * "hex"    (string) The transaction id.
    * 
    * Result (if verbose is set to true):
    * {                          (json object)
    *   "txid" : "hex",          (string) The transaction id.
    *   "fee reason" : "str"     (string) The transaction fee reason.
    * }
    * 
    * Examples:
    * 
    * Send 0.1 BTC
    * > bitcoin-cli sendtoaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 0.1
    * 
    * Send 0.1 BTC with a confirmation target of 6 blocks in economical fee estimate mode using positional arguments
    * > bitcoin-cli sendtoaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 0.1 "donation" "sean's outpost" false true 6 economical
    * 
    * Send 0.1 BTC with a fee rate of 1.1 sat/vB, subtract fee from amount, BIP125-replaceable, using positional arguments
    * > bitcoin-cli sendtoaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 0.1 "drinks" "room77" true true null "unset" null 1.1
    * 
    * Send 0.2 BTC with a confirmation target of 6 blocks in economical fee estimate mode using named arguments
    * > bitcoin-cli -named sendtoaddress address="bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" amount=0.2 conf_target=6 estimate_mode="economical"
    * 
    * Send 0.5 BTC with a fee rate of 25 sat/vB using named arguments
    * > bitcoin-cli -named sendtoaddress address="bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" amount=0.5 fee_rate=25
    * > bitcoin-cli -named sendtoaddress address="bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" amount=0.5 fee_rate=25 subtractfeefromamount=false replaceable=true avoid_reuse=true comment="2 pizzas" comment_to="jeremy" verbose=true
    */
   public Object sendtoaddress(Object address, Object amount, Object comment, Object comment_to) { return sendtoaddress.invoke(address, amount, comment, comment_to); }


   /**
    * sendtoaddress "address" amount ( "comment" "comment_to" subtractfeefromamount replaceable conf_target "estimate_mode" avoid_reuse fee_rate verbose )
    * 
    * Send an amount to a given address.
    * Requires wallet passphrase to be set with walletpassphrase call if wallet is encrypted.
    * 
    * Arguments:
    * 1. address                  (string, required) The bitcoin address to send to.
    * 2. amount                   (numeric or string, required) The amount in BTC to send. eg 0.1
    * 3. comment                  (string, optional) A comment used to store what the transaction is for.
    *                             This is not part of the transaction, just kept in your wallet.
    * 4. comment_to               (string, optional) A comment to store the name of the person or organization
    *                             to which you're sending the transaction. This is not part of the 
    *                             transaction, just kept in your wallet.
    * 5. subtractfeefromamount    (boolean, optional, default=false) The fee will be deducted from the amount being sent.
    *                             The recipient will receive less bitcoins than you enter in the amount field.
    * 6. replaceable              (boolean, optional, default=wallet default) Allow this transaction to be replaced by a transaction with higher fees via BIP 125
    * 7. conf_target              (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    * 8. estimate_mode            (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                             "unset"
    *                             "economical"
    *                             "conservative"
    * 9. avoid_reuse              (boolean, optional, default=true) (only available if avoid_reuse wallet flag is set) Avoid spending from dirty addresses; addresses are considered
    *                             dirty if they have previously been used in a transaction. If true, this also activates avoidpartialspends, grouping outputs by their addresses.
    * 10. fee_rate                (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    * 11. verbose                 (boolean, optional, default=false) If true, return extra information about the transaction.
    * 
    * Result (if verbose is not set or set to false):
    * "hex"    (string) The transaction id.
    * 
    * Result (if verbose is set to true):
    * {                          (json object)
    *   "txid" : "hex",          (string) The transaction id.
    *   "fee reason" : "str"     (string) The transaction fee reason.
    * }
    * 
    * Examples:
    * 
    * Send 0.1 BTC
    * > bitcoin-cli sendtoaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 0.1
    * 
    * Send 0.1 BTC with a confirmation target of 6 blocks in economical fee estimate mode using positional arguments
    * > bitcoin-cli sendtoaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 0.1 "donation" "sean's outpost" false true 6 economical
    * 
    * Send 0.1 BTC with a fee rate of 1.1 sat/vB, subtract fee from amount, BIP125-replaceable, using positional arguments
    * > bitcoin-cli sendtoaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 0.1 "drinks" "room77" true true null "unset" null 1.1
    * 
    * Send 0.2 BTC with a confirmation target of 6 blocks in economical fee estimate mode using named arguments
    * > bitcoin-cli -named sendtoaddress address="bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" amount=0.2 conf_target=6 estimate_mode="economical"
    * 
    * Send 0.5 BTC with a fee rate of 25 sat/vB using named arguments
    * > bitcoin-cli -named sendtoaddress address="bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" amount=0.5 fee_rate=25
    * > bitcoin-cli -named sendtoaddress address="bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" amount=0.5 fee_rate=25 subtractfeefromamount=false replaceable=true avoid_reuse=true comment="2 pizzas" comment_to="jeremy" verbose=true
    */
   public Object sendtoaddress(Object address, Object amount, Object comment, Object comment_to, Object subtractfeefromamount) { return sendtoaddress.invoke(address, amount, comment, comment_to, subtractfeefromamount); }


   /**
    * sendtoaddress "address" amount ( "comment" "comment_to" subtractfeefromamount replaceable conf_target "estimate_mode" avoid_reuse fee_rate verbose )
    * 
    * Send an amount to a given address.
    * Requires wallet passphrase to be set with walletpassphrase call if wallet is encrypted.
    * 
    * Arguments:
    * 1. address                  (string, required) The bitcoin address to send to.
    * 2. amount                   (numeric or string, required) The amount in BTC to send. eg 0.1
    * 3. comment                  (string, optional) A comment used to store what the transaction is for.
    *                             This is not part of the transaction, just kept in your wallet.
    * 4. comment_to               (string, optional) A comment to store the name of the person or organization
    *                             to which you're sending the transaction. This is not part of the 
    *                             transaction, just kept in your wallet.
    * 5. subtractfeefromamount    (boolean, optional, default=false) The fee will be deducted from the amount being sent.
    *                             The recipient will receive less bitcoins than you enter in the amount field.
    * 6. replaceable              (boolean, optional, default=wallet default) Allow this transaction to be replaced by a transaction with higher fees via BIP 125
    * 7. conf_target              (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    * 8. estimate_mode            (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                             "unset"
    *                             "economical"
    *                             "conservative"
    * 9. avoid_reuse              (boolean, optional, default=true) (only available if avoid_reuse wallet flag is set) Avoid spending from dirty addresses; addresses are considered
    *                             dirty if they have previously been used in a transaction. If true, this also activates avoidpartialspends, grouping outputs by their addresses.
    * 10. fee_rate                (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    * 11. verbose                 (boolean, optional, default=false) If true, return extra information about the transaction.
    * 
    * Result (if verbose is not set or set to false):
    * "hex"    (string) The transaction id.
    * 
    * Result (if verbose is set to true):
    * {                          (json object)
    *   "txid" : "hex",          (string) The transaction id.
    *   "fee reason" : "str"     (string) The transaction fee reason.
    * }
    * 
    * Examples:
    * 
    * Send 0.1 BTC
    * > bitcoin-cli sendtoaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 0.1
    * 
    * Send 0.1 BTC with a confirmation target of 6 blocks in economical fee estimate mode using positional arguments
    * > bitcoin-cli sendtoaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 0.1 "donation" "sean's outpost" false true 6 economical
    * 
    * Send 0.1 BTC with a fee rate of 1.1 sat/vB, subtract fee from amount, BIP125-replaceable, using positional arguments
    * > bitcoin-cli sendtoaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 0.1 "drinks" "room77" true true null "unset" null 1.1
    * 
    * Send 0.2 BTC with a confirmation target of 6 blocks in economical fee estimate mode using named arguments
    * > bitcoin-cli -named sendtoaddress address="bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" amount=0.2 conf_target=6 estimate_mode="economical"
    * 
    * Send 0.5 BTC with a fee rate of 25 sat/vB using named arguments
    * > bitcoin-cli -named sendtoaddress address="bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" amount=0.5 fee_rate=25
    * > bitcoin-cli -named sendtoaddress address="bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" amount=0.5 fee_rate=25 subtractfeefromamount=false replaceable=true avoid_reuse=true comment="2 pizzas" comment_to="jeremy" verbose=true
    */
   public Object sendtoaddress(Object address, Object amount, Object comment, Object comment_to, Object subtractfeefromamount, Object replaceable) { return sendtoaddress.invoke(address, amount, comment, comment_to, subtractfeefromamount, replaceable); }


   /**
    * sendtoaddress "address" amount ( "comment" "comment_to" subtractfeefromamount replaceable conf_target "estimate_mode" avoid_reuse fee_rate verbose )
    * 
    * Send an amount to a given address.
    * Requires wallet passphrase to be set with walletpassphrase call if wallet is encrypted.
    * 
    * Arguments:
    * 1. address                  (string, required) The bitcoin address to send to.
    * 2. amount                   (numeric or string, required) The amount in BTC to send. eg 0.1
    * 3. comment                  (string, optional) A comment used to store what the transaction is for.
    *                             This is not part of the transaction, just kept in your wallet.
    * 4. comment_to               (string, optional) A comment to store the name of the person or organization
    *                             to which you're sending the transaction. This is not part of the 
    *                             transaction, just kept in your wallet.
    * 5. subtractfeefromamount    (boolean, optional, default=false) The fee will be deducted from the amount being sent.
    *                             The recipient will receive less bitcoins than you enter in the amount field.
    * 6. replaceable              (boolean, optional, default=wallet default) Allow this transaction to be replaced by a transaction with higher fees via BIP 125
    * 7. conf_target              (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    * 8. estimate_mode            (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                             "unset"
    *                             "economical"
    *                             "conservative"
    * 9. avoid_reuse              (boolean, optional, default=true) (only available if avoid_reuse wallet flag is set) Avoid spending from dirty addresses; addresses are considered
    *                             dirty if they have previously been used in a transaction. If true, this also activates avoidpartialspends, grouping outputs by their addresses.
    * 10. fee_rate                (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    * 11. verbose                 (boolean, optional, default=false) If true, return extra information about the transaction.
    * 
    * Result (if verbose is not set or set to false):
    * "hex"    (string) The transaction id.
    * 
    * Result (if verbose is set to true):
    * {                          (json object)
    *   "txid" : "hex",          (string) The transaction id.
    *   "fee reason" : "str"     (string) The transaction fee reason.
    * }
    * 
    * Examples:
    * 
    * Send 0.1 BTC
    * > bitcoin-cli sendtoaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 0.1
    * 
    * Send 0.1 BTC with a confirmation target of 6 blocks in economical fee estimate mode using positional arguments
    * > bitcoin-cli sendtoaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 0.1 "donation" "sean's outpost" false true 6 economical
    * 
    * Send 0.1 BTC with a fee rate of 1.1 sat/vB, subtract fee from amount, BIP125-replaceable, using positional arguments
    * > bitcoin-cli sendtoaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 0.1 "drinks" "room77" true true null "unset" null 1.1
    * 
    * Send 0.2 BTC with a confirmation target of 6 blocks in economical fee estimate mode using named arguments
    * > bitcoin-cli -named sendtoaddress address="bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" amount=0.2 conf_target=6 estimate_mode="economical"
    * 
    * Send 0.5 BTC with a fee rate of 25 sat/vB using named arguments
    * > bitcoin-cli -named sendtoaddress address="bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" amount=0.5 fee_rate=25
    * > bitcoin-cli -named sendtoaddress address="bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" amount=0.5 fee_rate=25 subtractfeefromamount=false replaceable=true avoid_reuse=true comment="2 pizzas" comment_to="jeremy" verbose=true
    */
   public Object sendtoaddress(Object address, Object amount, Object comment, Object comment_to, Object subtractfeefromamount, Object replaceable, Object conf_target) { return sendtoaddress.invoke(address, amount, comment, comment_to, subtractfeefromamount, replaceable, conf_target); }


   /**
    * sendtoaddress "address" amount ( "comment" "comment_to" subtractfeefromamount replaceable conf_target "estimate_mode" avoid_reuse fee_rate verbose )
    * 
    * Send an amount to a given address.
    * Requires wallet passphrase to be set with walletpassphrase call if wallet is encrypted.
    * 
    * Arguments:
    * 1. address                  (string, required) The bitcoin address to send to.
    * 2. amount                   (numeric or string, required) The amount in BTC to send. eg 0.1
    * 3. comment                  (string, optional) A comment used to store what the transaction is for.
    *                             This is not part of the transaction, just kept in your wallet.
    * 4. comment_to               (string, optional) A comment to store the name of the person or organization
    *                             to which you're sending the transaction. This is not part of the 
    *                             transaction, just kept in your wallet.
    * 5. subtractfeefromamount    (boolean, optional, default=false) The fee will be deducted from the amount being sent.
    *                             The recipient will receive less bitcoins than you enter in the amount field.
    * 6. replaceable              (boolean, optional, default=wallet default) Allow this transaction to be replaced by a transaction with higher fees via BIP 125
    * 7. conf_target              (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    * 8. estimate_mode            (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                             "unset"
    *                             "economical"
    *                             "conservative"
    * 9. avoid_reuse              (boolean, optional, default=true) (only available if avoid_reuse wallet flag is set) Avoid spending from dirty addresses; addresses are considered
    *                             dirty if they have previously been used in a transaction. If true, this also activates avoidpartialspends, grouping outputs by their addresses.
    * 10. fee_rate                (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    * 11. verbose                 (boolean, optional, default=false) If true, return extra information about the transaction.
    * 
    * Result (if verbose is not set or set to false):
    * "hex"    (string) The transaction id.
    * 
    * Result (if verbose is set to true):
    * {                          (json object)
    *   "txid" : "hex",          (string) The transaction id.
    *   "fee reason" : "str"     (string) The transaction fee reason.
    * }
    * 
    * Examples:
    * 
    * Send 0.1 BTC
    * > bitcoin-cli sendtoaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 0.1
    * 
    * Send 0.1 BTC with a confirmation target of 6 blocks in economical fee estimate mode using positional arguments
    * > bitcoin-cli sendtoaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 0.1 "donation" "sean's outpost" false true 6 economical
    * 
    * Send 0.1 BTC with a fee rate of 1.1 sat/vB, subtract fee from amount, BIP125-replaceable, using positional arguments
    * > bitcoin-cli sendtoaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 0.1 "drinks" "room77" true true null "unset" null 1.1
    * 
    * Send 0.2 BTC with a confirmation target of 6 blocks in economical fee estimate mode using named arguments
    * > bitcoin-cli -named sendtoaddress address="bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" amount=0.2 conf_target=6 estimate_mode="economical"
    * 
    * Send 0.5 BTC with a fee rate of 25 sat/vB using named arguments
    * > bitcoin-cli -named sendtoaddress address="bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" amount=0.5 fee_rate=25
    * > bitcoin-cli -named sendtoaddress address="bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" amount=0.5 fee_rate=25 subtractfeefromamount=false replaceable=true avoid_reuse=true comment="2 pizzas" comment_to="jeremy" verbose=true
    */
   public Object sendtoaddress(Object address, Object amount, Object comment, Object comment_to, Object subtractfeefromamount, Object replaceable, Object conf_target, Object estimate_mode) { return sendtoaddress.invoke(address, amount, comment, comment_to, subtractfeefromamount, replaceable, conf_target, estimate_mode); }


   /**
    * sendtoaddress "address" amount ( "comment" "comment_to" subtractfeefromamount replaceable conf_target "estimate_mode" avoid_reuse fee_rate verbose )
    * 
    * Send an amount to a given address.
    * Requires wallet passphrase to be set with walletpassphrase call if wallet is encrypted.
    * 
    * Arguments:
    * 1. address                  (string, required) The bitcoin address to send to.
    * 2. amount                   (numeric or string, required) The amount in BTC to send. eg 0.1
    * 3. comment                  (string, optional) A comment used to store what the transaction is for.
    *                             This is not part of the transaction, just kept in your wallet.
    * 4. comment_to               (string, optional) A comment to store the name of the person or organization
    *                             to which you're sending the transaction. This is not part of the 
    *                             transaction, just kept in your wallet.
    * 5. subtractfeefromamount    (boolean, optional, default=false) The fee will be deducted from the amount being sent.
    *                             The recipient will receive less bitcoins than you enter in the amount field.
    * 6. replaceable              (boolean, optional, default=wallet default) Allow this transaction to be replaced by a transaction with higher fees via BIP 125
    * 7. conf_target              (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    * 8. estimate_mode            (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                             "unset"
    *                             "economical"
    *                             "conservative"
    * 9. avoid_reuse              (boolean, optional, default=true) (only available if avoid_reuse wallet flag is set) Avoid spending from dirty addresses; addresses are considered
    *                             dirty if they have previously been used in a transaction. If true, this also activates avoidpartialspends, grouping outputs by their addresses.
    * 10. fee_rate                (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    * 11. verbose                 (boolean, optional, default=false) If true, return extra information about the transaction.
    * 
    * Result (if verbose is not set or set to false):
    * "hex"    (string) The transaction id.
    * 
    * Result (if verbose is set to true):
    * {                          (json object)
    *   "txid" : "hex",          (string) The transaction id.
    *   "fee reason" : "str"     (string) The transaction fee reason.
    * }
    * 
    * Examples:
    * 
    * Send 0.1 BTC
    * > bitcoin-cli sendtoaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 0.1
    * 
    * Send 0.1 BTC with a confirmation target of 6 blocks in economical fee estimate mode using positional arguments
    * > bitcoin-cli sendtoaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 0.1 "donation" "sean's outpost" false true 6 economical
    * 
    * Send 0.1 BTC with a fee rate of 1.1 sat/vB, subtract fee from amount, BIP125-replaceable, using positional arguments
    * > bitcoin-cli sendtoaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 0.1 "drinks" "room77" true true null "unset" null 1.1
    * 
    * Send 0.2 BTC with a confirmation target of 6 blocks in economical fee estimate mode using named arguments
    * > bitcoin-cli -named sendtoaddress address="bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" amount=0.2 conf_target=6 estimate_mode="economical"
    * 
    * Send 0.5 BTC with a fee rate of 25 sat/vB using named arguments
    * > bitcoin-cli -named sendtoaddress address="bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" amount=0.5 fee_rate=25
    * > bitcoin-cli -named sendtoaddress address="bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" amount=0.5 fee_rate=25 subtractfeefromamount=false replaceable=true avoid_reuse=true comment="2 pizzas" comment_to="jeremy" verbose=true
    */
   public Object sendtoaddress(Object address, Object amount, Object comment, Object comment_to, Object subtractfeefromamount, Object replaceable, Object conf_target, Object estimate_mode, Object avoid_reuse) { return sendtoaddress.invoke(address, amount, comment, comment_to, subtractfeefromamount, replaceable, conf_target, estimate_mode, avoid_reuse); }


   /**
    * sendtoaddress "address" amount ( "comment" "comment_to" subtractfeefromamount replaceable conf_target "estimate_mode" avoid_reuse fee_rate verbose )
    * 
    * Send an amount to a given address.
    * Requires wallet passphrase to be set with walletpassphrase call if wallet is encrypted.
    * 
    * Arguments:
    * 1. address                  (string, required) The bitcoin address to send to.
    * 2. amount                   (numeric or string, required) The amount in BTC to send. eg 0.1
    * 3. comment                  (string, optional) A comment used to store what the transaction is for.
    *                             This is not part of the transaction, just kept in your wallet.
    * 4. comment_to               (string, optional) A comment to store the name of the person or organization
    *                             to which you're sending the transaction. This is not part of the 
    *                             transaction, just kept in your wallet.
    * 5. subtractfeefromamount    (boolean, optional, default=false) The fee will be deducted from the amount being sent.
    *                             The recipient will receive less bitcoins than you enter in the amount field.
    * 6. replaceable              (boolean, optional, default=wallet default) Allow this transaction to be replaced by a transaction with higher fees via BIP 125
    * 7. conf_target              (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    * 8. estimate_mode            (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                             "unset"
    *                             "economical"
    *                             "conservative"
    * 9. avoid_reuse              (boolean, optional, default=true) (only available if avoid_reuse wallet flag is set) Avoid spending from dirty addresses; addresses are considered
    *                             dirty if they have previously been used in a transaction. If true, this also activates avoidpartialspends, grouping outputs by their addresses.
    * 10. fee_rate                (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    * 11. verbose                 (boolean, optional, default=false) If true, return extra information about the transaction.
    * 
    * Result (if verbose is not set or set to false):
    * "hex"    (string) The transaction id.
    * 
    * Result (if verbose is set to true):
    * {                          (json object)
    *   "txid" : "hex",          (string) The transaction id.
    *   "fee reason" : "str"     (string) The transaction fee reason.
    * }
    * 
    * Examples:
    * 
    * Send 0.1 BTC
    * > bitcoin-cli sendtoaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 0.1
    * 
    * Send 0.1 BTC with a confirmation target of 6 blocks in economical fee estimate mode using positional arguments
    * > bitcoin-cli sendtoaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 0.1 "donation" "sean's outpost" false true 6 economical
    * 
    * Send 0.1 BTC with a fee rate of 1.1 sat/vB, subtract fee from amount, BIP125-replaceable, using positional arguments
    * > bitcoin-cli sendtoaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 0.1 "drinks" "room77" true true null "unset" null 1.1
    * 
    * Send 0.2 BTC with a confirmation target of 6 blocks in economical fee estimate mode using named arguments
    * > bitcoin-cli -named sendtoaddress address="bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" amount=0.2 conf_target=6 estimate_mode="economical"
    * 
    * Send 0.5 BTC with a fee rate of 25 sat/vB using named arguments
    * > bitcoin-cli -named sendtoaddress address="bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" amount=0.5 fee_rate=25
    * > bitcoin-cli -named sendtoaddress address="bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" amount=0.5 fee_rate=25 subtractfeefromamount=false replaceable=true avoid_reuse=true comment="2 pizzas" comment_to="jeremy" verbose=true
    */
   public Object sendtoaddress(Object address, Object amount, Object comment, Object comment_to, Object subtractfeefromamount, Object replaceable, Object conf_target, Object estimate_mode, Object avoid_reuse, Object fee_rate) { return sendtoaddress.invoke(address, amount, comment, comment_to, subtractfeefromamount, replaceable, conf_target, estimate_mode, avoid_reuse, fee_rate); }


   /**
    * sendtoaddress "address" amount ( "comment" "comment_to" subtractfeefromamount replaceable conf_target "estimate_mode" avoid_reuse fee_rate verbose )
    * 
    * Send an amount to a given address.
    * Requires wallet passphrase to be set with walletpassphrase call if wallet is encrypted.
    * 
    * Arguments:
    * 1. address                  (string, required) The bitcoin address to send to.
    * 2. amount                   (numeric or string, required) The amount in BTC to send. eg 0.1
    * 3. comment                  (string, optional) A comment used to store what the transaction is for.
    *                             This is not part of the transaction, just kept in your wallet.
    * 4. comment_to               (string, optional) A comment to store the name of the person or organization
    *                             to which you're sending the transaction. This is not part of the 
    *                             transaction, just kept in your wallet.
    * 5. subtractfeefromamount    (boolean, optional, default=false) The fee will be deducted from the amount being sent.
    *                             The recipient will receive less bitcoins than you enter in the amount field.
    * 6. replaceable              (boolean, optional, default=wallet default) Allow this transaction to be replaced by a transaction with higher fees via BIP 125
    * 7. conf_target              (numeric, optional, default=wallet -txconfirmtarget) Confirmation target in blocks
    * 8. estimate_mode            (string, optional, default="unset") The fee estimate mode, must be one of (case insensitive):
    *                             "unset"
    *                             "economical"
    *                             "conservative"
    * 9. avoid_reuse              (boolean, optional, default=true) (only available if avoid_reuse wallet flag is set) Avoid spending from dirty addresses; addresses are considered
    *                             dirty if they have previously been used in a transaction. If true, this also activates avoidpartialspends, grouping outputs by their addresses.
    * 10. fee_rate                (numeric or string, optional, default=not set, fall back to wallet fee estimation) Specify a fee rate in sat/vB.
    * 11. verbose                 (boolean, optional, default=false) If true, return extra information about the transaction.
    * 
    * Result (if verbose is not set or set to false):
    * "hex"    (string) The transaction id.
    * 
    * Result (if verbose is set to true):
    * {                          (json object)
    *   "txid" : "hex",          (string) The transaction id.
    *   "fee reason" : "str"     (string) The transaction fee reason.
    * }
    * 
    * Examples:
    * 
    * Send 0.1 BTC
    * > bitcoin-cli sendtoaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 0.1
    * 
    * Send 0.1 BTC with a confirmation target of 6 blocks in economical fee estimate mode using positional arguments
    * > bitcoin-cli sendtoaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 0.1 "donation" "sean's outpost" false true 6 economical
    * 
    * Send 0.1 BTC with a fee rate of 1.1 sat/vB, subtract fee from amount, BIP125-replaceable, using positional arguments
    * > bitcoin-cli sendtoaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 0.1 "drinks" "room77" true true null "unset" null 1.1
    * 
    * Send 0.2 BTC with a confirmation target of 6 blocks in economical fee estimate mode using named arguments
    * > bitcoin-cli -named sendtoaddress address="bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" amount=0.2 conf_target=6 estimate_mode="economical"
    * 
    * Send 0.5 BTC with a fee rate of 25 sat/vB using named arguments
    * > bitcoin-cli -named sendtoaddress address="bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" amount=0.5 fee_rate=25
    * > bitcoin-cli -named sendtoaddress address="bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" amount=0.5 fee_rate=25 subtractfeefromamount=false replaceable=true avoid_reuse=true comment="2 pizzas" comment_to="jeremy" verbose=true
    */
   public Object sendtoaddress(Object address, Object amount, Object comment, Object comment_to, Object subtractfeefromamount, Object replaceable, Object conf_target, Object estimate_mode, Object avoid_reuse, Object fee_rate, Object verbose) { return sendtoaddress.invoke(address, amount, comment, comment_to, subtractfeefromamount, replaceable, conf_target, estimate_mode, avoid_reuse, fee_rate, verbose); }

   /**
    * getrawchangeaddress ( "address_type" )
    * 
    * Returns a new Bitcoin address, for receiving change.
    * This is for use with raw transactions, NOT normal use.
    * 
    * Arguments:
    * 1. address_type    (string, optional, default=set by -changetype) The address type to use. Options are "legacy", "p2sh-segwit", and "bech32".
    * 
    * Result:
    * "str"    (string) The address
    * 
    * Examples:
    * > bitcoin-cli getrawchangeaddress 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getrawchangeaddress", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getrawchangeaddress() { return getrawchangeaddress.invoke(); }


   /**
    * getrawchangeaddress ( "address_type" )
    * 
    * Returns a new Bitcoin address, for receiving change.
    * This is for use with raw transactions, NOT normal use.
    * 
    * Arguments:
    * 1. address_type    (string, optional, default=set by -changetype) The address type to use. Options are "legacy", "p2sh-segwit", and "bech32".
    * 
    * Result:
    * "str"    (string) The address
    * 
    * Examples:
    * > bitcoin-cli getrawchangeaddress 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getrawchangeaddress", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getrawchangeaddress(Object address_type) { return getrawchangeaddress.invoke(address_type); }

   /**
    * converttopsbt "hexstring" ( permitsigdata iswitness )
    * 
    * Converts a network serialized transaction to a PSBT. This should be used only with createrawtransaction and fundrawtransaction
    * createpsbt and walletcreatefundedpsbt should be used for new applications.
    * 
    * Arguments:
    * 1. hexstring        (string, required) The hex string of a raw transaction
    * 2. permitsigdata    (boolean, optional, default=false) If true, any signatures in the input will be discarded and conversion
    *                     will continue. If false, RPC will fail if any signatures are present.
    * 3. iswitness        (boolean, optional, default=depends on heuristic tests) Whether the transaction hex is a serialized witness transaction.
    *                     If iswitness is not present, heuristic tests will be used in decoding.
    *                     If true, only witness deserialization will be tried.
    *                     If false, only non-witness deserialization will be tried.
    *                     This boolean should reflect whether the transaction has inputs
    *                     (e.g. fully valid, or on-chain transactions), if known by the caller.
    * 
    * Result:
    * "str"    (string) The resulting raw transaction (base64-encoded string)
    * 
    * Examples:
    * 
    * Create a transaction
    * > bitcoin-cli createrawtransaction "[{\"txid\":\"myid\",\"vout\":0}]" "[{\"data\":\"00010203\"}]"
    * 
    * Convert the transaction to a PSBT
    * > bitcoin-cli converttopsbt "rawtransaction"
    */
   public Object converttopsbt(Object hexstring) { return converttopsbt.invoke(hexstring); }


   /**
    * converttopsbt "hexstring" ( permitsigdata iswitness )
    * 
    * Converts a network serialized transaction to a PSBT. This should be used only with createrawtransaction and fundrawtransaction
    * createpsbt and walletcreatefundedpsbt should be used for new applications.
    * 
    * Arguments:
    * 1. hexstring        (string, required) The hex string of a raw transaction
    * 2. permitsigdata    (boolean, optional, default=false) If true, any signatures in the input will be discarded and conversion
    *                     will continue. If false, RPC will fail if any signatures are present.
    * 3. iswitness        (boolean, optional, default=depends on heuristic tests) Whether the transaction hex is a serialized witness transaction.
    *                     If iswitness is not present, heuristic tests will be used in decoding.
    *                     If true, only witness deserialization will be tried.
    *                     If false, only non-witness deserialization will be tried.
    *                     This boolean should reflect whether the transaction has inputs
    *                     (e.g. fully valid, or on-chain transactions), if known by the caller.
    * 
    * Result:
    * "str"    (string) The resulting raw transaction (base64-encoded string)
    * 
    * Examples:
    * 
    * Create a transaction
    * > bitcoin-cli createrawtransaction "[{\"txid\":\"myid\",\"vout\":0}]" "[{\"data\":\"00010203\"}]"
    * 
    * Convert the transaction to a PSBT
    * > bitcoin-cli converttopsbt "rawtransaction"
    */
   public Object converttopsbt(Object hexstring, Object permitsigdata) { return converttopsbt.invoke(hexstring, permitsigdata); }


   /**
    * converttopsbt "hexstring" ( permitsigdata iswitness )
    * 
    * Converts a network serialized transaction to a PSBT. This should be used only with createrawtransaction and fundrawtransaction
    * createpsbt and walletcreatefundedpsbt should be used for new applications.
    * 
    * Arguments:
    * 1. hexstring        (string, required) The hex string of a raw transaction
    * 2. permitsigdata    (boolean, optional, default=false) If true, any signatures in the input will be discarded and conversion
    *                     will continue. If false, RPC will fail if any signatures are present.
    * 3. iswitness        (boolean, optional, default=depends on heuristic tests) Whether the transaction hex is a serialized witness transaction.
    *                     If iswitness is not present, heuristic tests will be used in decoding.
    *                     If true, only witness deserialization will be tried.
    *                     If false, only non-witness deserialization will be tried.
    *                     This boolean should reflect whether the transaction has inputs
    *                     (e.g. fully valid, or on-chain transactions), if known by the caller.
    * 
    * Result:
    * "str"    (string) The resulting raw transaction (base64-encoded string)
    * 
    * Examples:
    * 
    * Create a transaction
    * > bitcoin-cli createrawtransaction "[{\"txid\":\"myid\",\"vout\":0}]" "[{\"data\":\"00010203\"}]"
    * 
    * Convert the transaction to a PSBT
    * > bitcoin-cli converttopsbt "rawtransaction"
    */
   public Object converttopsbt(Object hexstring, Object permitsigdata, Object iswitness) { return converttopsbt.invoke(hexstring, permitsigdata, iswitness); }

   /**
    * getaddressinfo "address"
    * 
    * Return information about the given bitcoin address.
    * Some of the information will only be present if the address is in the active wallet.
    * 
    * Arguments:
    * 1. address    (string, required) The bitcoin address for which to get information.
    * 
    * Result:
    * {                                   (json object)
    *   "address" : "str",                (string) The bitcoin address validated.
    *   "scriptPubKey" : "hex",           (string) The hex-encoded scriptPubKey generated by the address.
    *   "ismine" : true|false,            (boolean) If the address is yours.
    *   "iswatchonly" : true|false,       (boolean) If the address is watchonly.
    *   "solvable" : true|false,          (boolean) If we know how to spend coins sent to this address, ignoring the possible lack of private keys.
    *   "desc" : "str",                   (string, optional) A descriptor for spending coins sent to this address (only when solvable).
    *   "parent_desc" : "str",            (string, optional) The descriptor used to derive this address if this is a descriptor wallet
    *   "isscript" : true|false,          (boolean) If the key is a script.
    *   "ischange" : true|false,          (boolean) If the address was used for change output.
    *   "iswitness" : true|false,         (boolean) If the address is a witness address.
    *   "witness_version" : n,            (numeric, optional) The version number of the witness program.
    *   "witness_program" : "hex",        (string, optional) The hex value of the witness program.
    *   "script" : "str",                 (string, optional) The output script type. Only if isscript is true and the redeemscript is known. Possible
    *                                     types: nonstandard, pubkey, pubkeyhash, scripthash, multisig, nulldata, witness_v0_keyhash,
    *                                     witness_v0_scripthash, witness_unknown.
    *   "hex" : "hex",                    (string, optional) The redeemscript for the p2sh address.
    *   "pubkeys" : [                     (json array, optional) Array of pubkeys associated with the known redeemscript (only if script is multisig).
    *     "str",                          (string)
    *     ...
    *   ],
    *   "sigsrequired" : n,               (numeric, optional) The number of signatures required to spend multisig output (only if script is multisig).
    *   "pubkey" : "hex",                 (string, optional) The hex value of the raw public key for single-key addresses (possibly embedded in P2SH or P2WSH).
    *   "embedded" : {                    (json object, optional) Information about the address embedded in P2SH or P2WSH, if relevant and known.
    *     ...                             Includes all getaddressinfo output fields for the embedded address, excluding metadata (timestamp, hdkeypath, hdseedid)
    *                                     and relation to the wallet (ismine, iswatchonly).
    *   },
    *   "iscompressed" : true|false,      (boolean, optional) If the pubkey is compressed.
    *   "timestamp" : xxx,                (numeric, optional) The creation time of the key, if available, expressed in UNIX epoch time.
    *   "hdkeypath" : "str",              (string, optional) The HD keypath, if the key is HD and available.
    *   "hdseedid" : "hex",               (string, optional) The Hash160 of the HD seed.
    *   "hdmasterfingerprint" : "hex",    (string, optional) The fingerprint of the master key.
    *   "labels" : [                      (json array) Array of labels associated with the address. Currently limited to one label but returned
    *                                     as an array to keep the API stable if multiple labels are enabled in the future.
    *     "str",                          (string) Label name (defaults to "").
    *     ...
    *   ]
    * }
    * 
    * Examples:
    * > bitcoin-cli getaddressinfo "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getaddressinfo", "params": ["bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getaddressinfo(Object address) { return getaddressinfo.invoke(address); }

   /**
    * getnetworkinfo
    * Returns an object containing various state info regarding P2P networking.
    * 
    * Result:
    * {                                                    (json object)
    *   "version" : n,                                     (numeric) the server version
    *   "subversion" : "str",                              (string) the server subversion string
    *   "protocolversion" : n,                             (numeric) the protocol version
    *   "localservices" : "hex",                           (string) the services we offer to the network
    *   "localservicesnames" : [                           (json array) the services we offer to the network, in human-readable form
    *     "str",                                           (string) the service name
    *     ...
    *   ],
    *   "localrelay" : true|false,                         (boolean) true if transaction relay is requested from peers
    *   "timeoffset" : n,                                  (numeric) the time offset
    *   "connections" : n,                                 (numeric) the total number of connections
    *   "connections_in" : n,                              (numeric) the number of inbound connections
    *   "connections_out" : n,                             (numeric) the number of outbound connections
    *   "networkactive" : true|false,                      (boolean) whether p2p networking is enabled
    *   "networks" : [                                     (json array) information per network
    *     {                                                (json object)
    *       "name" : "str",                                (string) network (ipv4, ipv6, onion, i2p)
    *       "limited" : true|false,                        (boolean) is the network limited using -onlynet?
    *       "reachable" : true|false,                      (boolean) is the network reachable?
    *       "proxy" : "str",                               (string) ("host:port") the proxy that is used for this network, or empty if none
    *       "proxy_randomize_credentials" : true|false     (boolean) Whether randomized credentials are used
    *     },
    *     ...
    *   ],
    *   "relayfee" : n,                                    (numeric) minimum relay fee rate for transactions in BTC/kvB
    *   "incrementalfee" : n,                              (numeric) minimum fee rate increment for mempool limiting or BIP 125 replacement in BTC/kvB
    *   "localaddresses" : [                               (json array) list of local addresses
    *     {                                                (json object)
    *       "address" : "str",                             (string) network address
    *       "port" : n,                                    (numeric) network port
    *       "score" : n                                    (numeric) relative score
    *     },
    *     ...
    *   ],
    *   "warnings" : "str"                                 (string) any network and blockchain warnings
    * }
    * 
    * Examples:
    * > bitcoin-cli getnetworkinfo 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getnetworkinfo", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getnetworkinfo() { return getnetworkinfo.invoke(); }

   /**
    * importprivkey "privkey" ( "label" rescan )
    * 
    * Adds a private key (as returned by dumpprivkey) to your wallet. Requires a new wallet backup.
    * Hint: use importmulti to import more than one private key.
    * 
    * Note: This call can take over an hour to complete if rescan is true, during that time, other rpc calls
    * may report that the imported key exists but related transactions are still missing, leading to temporarily incorrect/bogus balances and unspent outputs until rescan completes.
    * Note: Use "getwalletinfo" to query the scanning progress.
    * 
    * Arguments:
    * 1. privkey    (string, required) The private key (see dumpprivkey)
    * 2. label      (string, optional, default=current label if address exists, otherwise "") An optional label
    * 3. rescan     (boolean, optional, default=true) Rescan the wallet for transactions
    * 
    * Result:
    * null    (json null)
    * 
    * Examples:
    * 
    * Dump a private key
    * > bitcoin-cli dumpprivkey "myaddress"
    * 
    * Import the private key with rescan
    * > bitcoin-cli importprivkey "mykey"
    * 
    * Import using a label and without rescan
    * > bitcoin-cli importprivkey "mykey" "testing" false
    * 
    * Import using default blank label and without rescan
    * > bitcoin-cli importprivkey "mykey" "" false
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "importprivkey", "params": ["mykey", "testing", false]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object importprivkey(Object privkey) { return importprivkey.invoke(privkey); }


   /**
    * importprivkey "privkey" ( "label" rescan )
    * 
    * Adds a private key (as returned by dumpprivkey) to your wallet. Requires a new wallet backup.
    * Hint: use importmulti to import more than one private key.
    * 
    * Note: This call can take over an hour to complete if rescan is true, during that time, other rpc calls
    * may report that the imported key exists but related transactions are still missing, leading to temporarily incorrect/bogus balances and unspent outputs until rescan completes.
    * Note: Use "getwalletinfo" to query the scanning progress.
    * 
    * Arguments:
    * 1. privkey    (string, required) The private key (see dumpprivkey)
    * 2. label      (string, optional, default=current label if address exists, otherwise "") An optional label
    * 3. rescan     (boolean, optional, default=true) Rescan the wallet for transactions
    * 
    * Result:
    * null    (json null)
    * 
    * Examples:
    * 
    * Dump a private key
    * > bitcoin-cli dumpprivkey "myaddress"
    * 
    * Import the private key with rescan
    * > bitcoin-cli importprivkey "mykey"
    * 
    * Import using a label and without rescan
    * > bitcoin-cli importprivkey "mykey" "testing" false
    * 
    * Import using default blank label and without rescan
    * > bitcoin-cli importprivkey "mykey" "" false
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "importprivkey", "params": ["mykey", "testing", false]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object importprivkey(Object privkey, Object label) { return importprivkey.invoke(privkey, label); }


   /**
    * importprivkey "privkey" ( "label" rescan )
    * 
    * Adds a private key (as returned by dumpprivkey) to your wallet. Requires a new wallet backup.
    * Hint: use importmulti to import more than one private key.
    * 
    * Note: This call can take over an hour to complete if rescan is true, during that time, other rpc calls
    * may report that the imported key exists but related transactions are still missing, leading to temporarily incorrect/bogus balances and unspent outputs until rescan completes.
    * Note: Use "getwalletinfo" to query the scanning progress.
    * 
    * Arguments:
    * 1. privkey    (string, required) The private key (see dumpprivkey)
    * 2. label      (string, optional, default=current label if address exists, otherwise "") An optional label
    * 3. rescan     (boolean, optional, default=true) Rescan the wallet for transactions
    * 
    * Result:
    * null    (json null)
    * 
    * Examples:
    * 
    * Dump a private key
    * > bitcoin-cli dumpprivkey "myaddress"
    * 
    * Import the private key with rescan
    * > bitcoin-cli importprivkey "mykey"
    * 
    * Import using a label and without rescan
    * > bitcoin-cli importprivkey "mykey" "testing" false
    * 
    * Import using default blank label and without rescan
    * > bitcoin-cli importprivkey "mykey" "" false
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "importprivkey", "params": ["mykey", "testing", false]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object importprivkey(Object privkey, Object label, Object rescan) { return importprivkey.invoke(privkey, label, rescan); }

   /**
    * clearbanned
    * 
    * Clear all banned IPs.
    * 
    * Result:
    * null    (json null)
    * 
    * Examples:
    * > bitcoin-cli clearbanned 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "clearbanned", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object clearbanned() { return clearbanned.invoke(); }

   /**
    * listsinceblock ( "blockhash" target_confirmations include_watchonly include_removed )
    * 
    * Get all transactions in blocks since block [blockhash], or all transactions if omitted.
    * If "blockhash" is no longer a part of the main chain, transactions from the fork point onward are included.
    * Additionally, if include_removed is set, transactions affecting the wallet which were removed are returned in the "removed" array.
    * 
    * Arguments:
    * 1. blockhash               (string, optional) If set, the block hash to list transactions since, otherwise list all transactions.
    * 2. target_confirmations    (numeric, optional, default=1) Return the nth block hash from the main chain. e.g. 1 would mean the best block hash. Note: this is not used as a filter, but only affects [lastblock] in the return value
    * 3. include_watchonly       (boolean, optional, default=true for watch-only wallets, otherwise false) Include transactions to watch-only addresses (see 'importaddress')
    * 4. include_removed         (boolean, optional, default=true) Show transactions that were removed due to a reorg in the "removed" array
    *                            (not guaranteed to work on pruned nodes)
    * 
    * Result:
    * {                                          (json object)
    *   "transactions" : [                       (json array)
    *     {                                      (json object)
    *       "involvesWatchonly" : true|false,    (boolean) Only returns true if imported addresses were involved in transaction.
    *       "address" : "str",                   (string) The bitcoin address of the transaction.
    *       "category" : "str",                  (string) The transaction category.
    *                                            "send"                  Transactions sent.
    *                                            "receive"               Non-coinbase transactions received.
    *                                            "generate"              Coinbase transactions received with more than 100 confirmations.
    *                                            "immature"              Coinbase transactions received with 100 or fewer confirmations.
    *                                            "orphan"                Orphaned coinbase transactions received.
    *       "amount" : n,                        (numeric) The amount in BTC. This is negative for the 'send' category, and is positive
    *                                            for all other categories
    *       "vout" : n,                          (numeric) the vout value
    *       "fee" : n,                           (numeric) The amount of the fee in BTC. This is negative and only available for the
    *                                            'send' category of transactions.
    *       "confirmations" : n,                 (numeric) The number of confirmations for the transaction. Negative confirmations means the
    *                                            transaction conflicted that many blocks ago.
    *       "generated" : true|false,            (boolean) Only present if transaction only input is a coinbase one.
    *       "trusted" : true|false,              (boolean) Only present if we consider transaction to be trusted and so safe to spend from.
    *       "blockhash" : "hex",                 (string) The block hash containing the transaction.
    *       "blockheight" : n,                   (numeric) The block height containing the transaction.
    *       "blockindex" : n,                    (numeric) The index of the transaction in the block that includes it.
    *       "blocktime" : xxx,                   (numeric) The block time expressed in UNIX epoch time.
    *       "txid" : "hex",                      (string) The transaction id.
    *       "walletconflicts" : [                (json array) Conflicting transaction ids.
    *         "hex",                             (string) The transaction id.
    *         ...
    *       ],
    *       "time" : xxx,                        (numeric) The transaction time expressed in UNIX epoch time.
    *       "timereceived" : xxx,                (numeric) The time received expressed in UNIX epoch time.
    *       "comment" : "str",                   (string) If a comment is associated with the transaction, only present if not empty.
    *       "bip125-replaceable" : "str",        (string) ("yes|no|unknown") Whether this transaction could be replaced due to BIP125 (replace-by-fee);
    *                                            may be unknown for unconfirmed transactions not in the mempool
    *       "abandoned" : true|false,            (boolean) 'true' if the transaction has been abandoned (inputs are respendable). Only available for the 
    *                                            'send' category of transactions.
    *       "label" : "str",                     (string) A comment for the address/transaction, if any
    *       "to" : "str"                         (string) If a comment to is associated with the transaction.
    *     },
    *     ...
    *   ],
    *   "removed" : [                            (json array) <structure is the same as "transactions" above, only present if include_removed=true>
    *                                            Note: transactions that were re-added in the active chain will appear as-is in this array, and may thus have a positive confirmation count.
    *     ...
    *   ],
    *   "lastblock" : "hex"                      (string) The hash of the block (target_confirmations-1) from the best block on the main chain, or the genesis hash if the referenced block does not exist yet. This is typically used to feed back into listsinceblock the next time you call it. So you would generally use a target_confirmations of say 6, so you will be continually re-notified of transactions until they've reached 6 confirmations plus any new ones
    * }
    * 
    * Examples:
    * > bitcoin-cli listsinceblock 
    * > bitcoin-cli listsinceblock "000000000000000bacf66f7497b7dc45ef753ee9a7d38571037cdb1a57f663ad" 6
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listsinceblock", "params": ["000000000000000bacf66f7497b7dc45ef753ee9a7d38571037cdb1a57f663ad", 6]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object listsinceblock() { return listsinceblock.invoke(); }


   /**
    * listsinceblock ( "blockhash" target_confirmations include_watchonly include_removed )
    * 
    * Get all transactions in blocks since block [blockhash], or all transactions if omitted.
    * If "blockhash" is no longer a part of the main chain, transactions from the fork point onward are included.
    * Additionally, if include_removed is set, transactions affecting the wallet which were removed are returned in the "removed" array.
    * 
    * Arguments:
    * 1. blockhash               (string, optional) If set, the block hash to list transactions since, otherwise list all transactions.
    * 2. target_confirmations    (numeric, optional, default=1) Return the nth block hash from the main chain. e.g. 1 would mean the best block hash. Note: this is not used as a filter, but only affects [lastblock] in the return value
    * 3. include_watchonly       (boolean, optional, default=true for watch-only wallets, otherwise false) Include transactions to watch-only addresses (see 'importaddress')
    * 4. include_removed         (boolean, optional, default=true) Show transactions that were removed due to a reorg in the "removed" array
    *                            (not guaranteed to work on pruned nodes)
    * 
    * Result:
    * {                                          (json object)
    *   "transactions" : [                       (json array)
    *     {                                      (json object)
    *       "involvesWatchonly" : true|false,    (boolean) Only returns true if imported addresses were involved in transaction.
    *       "address" : "str",                   (string) The bitcoin address of the transaction.
    *       "category" : "str",                  (string) The transaction category.
    *                                            "send"                  Transactions sent.
    *                                            "receive"               Non-coinbase transactions received.
    *                                            "generate"              Coinbase transactions received with more than 100 confirmations.
    *                                            "immature"              Coinbase transactions received with 100 or fewer confirmations.
    *                                            "orphan"                Orphaned coinbase transactions received.
    *       "amount" : n,                        (numeric) The amount in BTC. This is negative for the 'send' category, and is positive
    *                                            for all other categories
    *       "vout" : n,                          (numeric) the vout value
    *       "fee" : n,                           (numeric) The amount of the fee in BTC. This is negative and only available for the
    *                                            'send' category of transactions.
    *       "confirmations" : n,                 (numeric) The number of confirmations for the transaction. Negative confirmations means the
    *                                            transaction conflicted that many blocks ago.
    *       "generated" : true|false,            (boolean) Only present if transaction only input is a coinbase one.
    *       "trusted" : true|false,              (boolean) Only present if we consider transaction to be trusted and so safe to spend from.
    *       "blockhash" : "hex",                 (string) The block hash containing the transaction.
    *       "blockheight" : n,                   (numeric) The block height containing the transaction.
    *       "blockindex" : n,                    (numeric) The index of the transaction in the block that includes it.
    *       "blocktime" : xxx,                   (numeric) The block time expressed in UNIX epoch time.
    *       "txid" : "hex",                      (string) The transaction id.
    *       "walletconflicts" : [                (json array) Conflicting transaction ids.
    *         "hex",                             (string) The transaction id.
    *         ...
    *       ],
    *       "time" : xxx,                        (numeric) The transaction time expressed in UNIX epoch time.
    *       "timereceived" : xxx,                (numeric) The time received expressed in UNIX epoch time.
    *       "comment" : "str",                   (string) If a comment is associated with the transaction, only present if not empty.
    *       "bip125-replaceable" : "str",        (string) ("yes|no|unknown") Whether this transaction could be replaced due to BIP125 (replace-by-fee);
    *                                            may be unknown for unconfirmed transactions not in the mempool
    *       "abandoned" : true|false,            (boolean) 'true' if the transaction has been abandoned (inputs are respendable). Only available for the 
    *                                            'send' category of transactions.
    *       "label" : "str",                     (string) A comment for the address/transaction, if any
    *       "to" : "str"                         (string) If a comment to is associated with the transaction.
    *     },
    *     ...
    *   ],
    *   "removed" : [                            (json array) <structure is the same as "transactions" above, only present if include_removed=true>
    *                                            Note: transactions that were re-added in the active chain will appear as-is in this array, and may thus have a positive confirmation count.
    *     ...
    *   ],
    *   "lastblock" : "hex"                      (string) The hash of the block (target_confirmations-1) from the best block on the main chain, or the genesis hash if the referenced block does not exist yet. This is typically used to feed back into listsinceblock the next time you call it. So you would generally use a target_confirmations of say 6, so you will be continually re-notified of transactions until they've reached 6 confirmations plus any new ones
    * }
    * 
    * Examples:
    * > bitcoin-cli listsinceblock 
    * > bitcoin-cli listsinceblock "000000000000000bacf66f7497b7dc45ef753ee9a7d38571037cdb1a57f663ad" 6
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listsinceblock", "params": ["000000000000000bacf66f7497b7dc45ef753ee9a7d38571037cdb1a57f663ad", 6]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object listsinceblock(Object blockhash) { return listsinceblock.invoke(blockhash); }


   /**
    * listsinceblock ( "blockhash" target_confirmations include_watchonly include_removed )
    * 
    * Get all transactions in blocks since block [blockhash], or all transactions if omitted.
    * If "blockhash" is no longer a part of the main chain, transactions from the fork point onward are included.
    * Additionally, if include_removed is set, transactions affecting the wallet which were removed are returned in the "removed" array.
    * 
    * Arguments:
    * 1. blockhash               (string, optional) If set, the block hash to list transactions since, otherwise list all transactions.
    * 2. target_confirmations    (numeric, optional, default=1) Return the nth block hash from the main chain. e.g. 1 would mean the best block hash. Note: this is not used as a filter, but only affects [lastblock] in the return value
    * 3. include_watchonly       (boolean, optional, default=true for watch-only wallets, otherwise false) Include transactions to watch-only addresses (see 'importaddress')
    * 4. include_removed         (boolean, optional, default=true) Show transactions that were removed due to a reorg in the "removed" array
    *                            (not guaranteed to work on pruned nodes)
    * 
    * Result:
    * {                                          (json object)
    *   "transactions" : [                       (json array)
    *     {                                      (json object)
    *       "involvesWatchonly" : true|false,    (boolean) Only returns true if imported addresses were involved in transaction.
    *       "address" : "str",                   (string) The bitcoin address of the transaction.
    *       "category" : "str",                  (string) The transaction category.
    *                                            "send"                  Transactions sent.
    *                                            "receive"               Non-coinbase transactions received.
    *                                            "generate"              Coinbase transactions received with more than 100 confirmations.
    *                                            "immature"              Coinbase transactions received with 100 or fewer confirmations.
    *                                            "orphan"                Orphaned coinbase transactions received.
    *       "amount" : n,                        (numeric) The amount in BTC. This is negative for the 'send' category, and is positive
    *                                            for all other categories
    *       "vout" : n,                          (numeric) the vout value
    *       "fee" : n,                           (numeric) The amount of the fee in BTC. This is negative and only available for the
    *                                            'send' category of transactions.
    *       "confirmations" : n,                 (numeric) The number of confirmations for the transaction. Negative confirmations means the
    *                                            transaction conflicted that many blocks ago.
    *       "generated" : true|false,            (boolean) Only present if transaction only input is a coinbase one.
    *       "trusted" : true|false,              (boolean) Only present if we consider transaction to be trusted and so safe to spend from.
    *       "blockhash" : "hex",                 (string) The block hash containing the transaction.
    *       "blockheight" : n,                   (numeric) The block height containing the transaction.
    *       "blockindex" : n,                    (numeric) The index of the transaction in the block that includes it.
    *       "blocktime" : xxx,                   (numeric) The block time expressed in UNIX epoch time.
    *       "txid" : "hex",                      (string) The transaction id.
    *       "walletconflicts" : [                (json array) Conflicting transaction ids.
    *         "hex",                             (string) The transaction id.
    *         ...
    *       ],
    *       "time" : xxx,                        (numeric) The transaction time expressed in UNIX epoch time.
    *       "timereceived" : xxx,                (numeric) The time received expressed in UNIX epoch time.
    *       "comment" : "str",                   (string) If a comment is associated with the transaction, only present if not empty.
    *       "bip125-replaceable" : "str",        (string) ("yes|no|unknown") Whether this transaction could be replaced due to BIP125 (replace-by-fee);
    *                                            may be unknown for unconfirmed transactions not in the mempool
    *       "abandoned" : true|false,            (boolean) 'true' if the transaction has been abandoned (inputs are respendable). Only available for the 
    *                                            'send' category of transactions.
    *       "label" : "str",                     (string) A comment for the address/transaction, if any
    *       "to" : "str"                         (string) If a comment to is associated with the transaction.
    *     },
    *     ...
    *   ],
    *   "removed" : [                            (json array) <structure is the same as "transactions" above, only present if include_removed=true>
    *                                            Note: transactions that were re-added in the active chain will appear as-is in this array, and may thus have a positive confirmation count.
    *     ...
    *   ],
    *   "lastblock" : "hex"                      (string) The hash of the block (target_confirmations-1) from the best block on the main chain, or the genesis hash if the referenced block does not exist yet. This is typically used to feed back into listsinceblock the next time you call it. So you would generally use a target_confirmations of say 6, so you will be continually re-notified of transactions until they've reached 6 confirmations plus any new ones
    * }
    * 
    * Examples:
    * > bitcoin-cli listsinceblock 
    * > bitcoin-cli listsinceblock "000000000000000bacf66f7497b7dc45ef753ee9a7d38571037cdb1a57f663ad" 6
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listsinceblock", "params": ["000000000000000bacf66f7497b7dc45ef753ee9a7d38571037cdb1a57f663ad", 6]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object listsinceblock(Object blockhash, Object target_confirmations) { return listsinceblock.invoke(blockhash, target_confirmations); }


   /**
    * listsinceblock ( "blockhash" target_confirmations include_watchonly include_removed )
    * 
    * Get all transactions in blocks since block [blockhash], or all transactions if omitted.
    * If "blockhash" is no longer a part of the main chain, transactions from the fork point onward are included.
    * Additionally, if include_removed is set, transactions affecting the wallet which were removed are returned in the "removed" array.
    * 
    * Arguments:
    * 1. blockhash               (string, optional) If set, the block hash to list transactions since, otherwise list all transactions.
    * 2. target_confirmations    (numeric, optional, default=1) Return the nth block hash from the main chain. e.g. 1 would mean the best block hash. Note: this is not used as a filter, but only affects [lastblock] in the return value
    * 3. include_watchonly       (boolean, optional, default=true for watch-only wallets, otherwise false) Include transactions to watch-only addresses (see 'importaddress')
    * 4. include_removed         (boolean, optional, default=true) Show transactions that were removed due to a reorg in the "removed" array
    *                            (not guaranteed to work on pruned nodes)
    * 
    * Result:
    * {                                          (json object)
    *   "transactions" : [                       (json array)
    *     {                                      (json object)
    *       "involvesWatchonly" : true|false,    (boolean) Only returns true if imported addresses were involved in transaction.
    *       "address" : "str",                   (string) The bitcoin address of the transaction.
    *       "category" : "str",                  (string) The transaction category.
    *                                            "send"                  Transactions sent.
    *                                            "receive"               Non-coinbase transactions received.
    *                                            "generate"              Coinbase transactions received with more than 100 confirmations.
    *                                            "immature"              Coinbase transactions received with 100 or fewer confirmations.
    *                                            "orphan"                Orphaned coinbase transactions received.
    *       "amount" : n,                        (numeric) The amount in BTC. This is negative for the 'send' category, and is positive
    *                                            for all other categories
    *       "vout" : n,                          (numeric) the vout value
    *       "fee" : n,                           (numeric) The amount of the fee in BTC. This is negative and only available for the
    *                                            'send' category of transactions.
    *       "confirmations" : n,                 (numeric) The number of confirmations for the transaction. Negative confirmations means the
    *                                            transaction conflicted that many blocks ago.
    *       "generated" : true|false,            (boolean) Only present if transaction only input is a coinbase one.
    *       "trusted" : true|false,              (boolean) Only present if we consider transaction to be trusted and so safe to spend from.
    *       "blockhash" : "hex",                 (string) The block hash containing the transaction.
    *       "blockheight" : n,                   (numeric) The block height containing the transaction.
    *       "blockindex" : n,                    (numeric) The index of the transaction in the block that includes it.
    *       "blocktime" : xxx,                   (numeric) The block time expressed in UNIX epoch time.
    *       "txid" : "hex",                      (string) The transaction id.
    *       "walletconflicts" : [                (json array) Conflicting transaction ids.
    *         "hex",                             (string) The transaction id.
    *         ...
    *       ],
    *       "time" : xxx,                        (numeric) The transaction time expressed in UNIX epoch time.
    *       "timereceived" : xxx,                (numeric) The time received expressed in UNIX epoch time.
    *       "comment" : "str",                   (string) If a comment is associated with the transaction, only present if not empty.
    *       "bip125-replaceable" : "str",        (string) ("yes|no|unknown") Whether this transaction could be replaced due to BIP125 (replace-by-fee);
    *                                            may be unknown for unconfirmed transactions not in the mempool
    *       "abandoned" : true|false,            (boolean) 'true' if the transaction has been abandoned (inputs are respendable). Only available for the 
    *                                            'send' category of transactions.
    *       "label" : "str",                     (string) A comment for the address/transaction, if any
    *       "to" : "str"                         (string) If a comment to is associated with the transaction.
    *     },
    *     ...
    *   ],
    *   "removed" : [                            (json array) <structure is the same as "transactions" above, only present if include_removed=true>
    *                                            Note: transactions that were re-added in the active chain will appear as-is in this array, and may thus have a positive confirmation count.
    *     ...
    *   ],
    *   "lastblock" : "hex"                      (string) The hash of the block (target_confirmations-1) from the best block on the main chain, or the genesis hash if the referenced block does not exist yet. This is typically used to feed back into listsinceblock the next time you call it. So you would generally use a target_confirmations of say 6, so you will be continually re-notified of transactions until they've reached 6 confirmations plus any new ones
    * }
    * 
    * Examples:
    * > bitcoin-cli listsinceblock 
    * > bitcoin-cli listsinceblock "000000000000000bacf66f7497b7dc45ef753ee9a7d38571037cdb1a57f663ad" 6
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listsinceblock", "params": ["000000000000000bacf66f7497b7dc45ef753ee9a7d38571037cdb1a57f663ad", 6]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object listsinceblock(Object blockhash, Object target_confirmations, Object include_watchonly) { return listsinceblock.invoke(blockhash, target_confirmations, include_watchonly); }


   /**
    * listsinceblock ( "blockhash" target_confirmations include_watchonly include_removed )
    * 
    * Get all transactions in blocks since block [blockhash], or all transactions if omitted.
    * If "blockhash" is no longer a part of the main chain, transactions from the fork point onward are included.
    * Additionally, if include_removed is set, transactions affecting the wallet which were removed are returned in the "removed" array.
    * 
    * Arguments:
    * 1. blockhash               (string, optional) If set, the block hash to list transactions since, otherwise list all transactions.
    * 2. target_confirmations    (numeric, optional, default=1) Return the nth block hash from the main chain. e.g. 1 would mean the best block hash. Note: this is not used as a filter, but only affects [lastblock] in the return value
    * 3. include_watchonly       (boolean, optional, default=true for watch-only wallets, otherwise false) Include transactions to watch-only addresses (see 'importaddress')
    * 4. include_removed         (boolean, optional, default=true) Show transactions that were removed due to a reorg in the "removed" array
    *                            (not guaranteed to work on pruned nodes)
    * 
    * Result:
    * {                                          (json object)
    *   "transactions" : [                       (json array)
    *     {                                      (json object)
    *       "involvesWatchonly" : true|false,    (boolean) Only returns true if imported addresses were involved in transaction.
    *       "address" : "str",                   (string) The bitcoin address of the transaction.
    *       "category" : "str",                  (string) The transaction category.
    *                                            "send"                  Transactions sent.
    *                                            "receive"               Non-coinbase transactions received.
    *                                            "generate"              Coinbase transactions received with more than 100 confirmations.
    *                                            "immature"              Coinbase transactions received with 100 or fewer confirmations.
    *                                            "orphan"                Orphaned coinbase transactions received.
    *       "amount" : n,                        (numeric) The amount in BTC. This is negative for the 'send' category, and is positive
    *                                            for all other categories
    *       "vout" : n,                          (numeric) the vout value
    *       "fee" : n,                           (numeric) The amount of the fee in BTC. This is negative and only available for the
    *                                            'send' category of transactions.
    *       "confirmations" : n,                 (numeric) The number of confirmations for the transaction. Negative confirmations means the
    *                                            transaction conflicted that many blocks ago.
    *       "generated" : true|false,            (boolean) Only present if transaction only input is a coinbase one.
    *       "trusted" : true|false,              (boolean) Only present if we consider transaction to be trusted and so safe to spend from.
    *       "blockhash" : "hex",                 (string) The block hash containing the transaction.
    *       "blockheight" : n,                   (numeric) The block height containing the transaction.
    *       "blockindex" : n,                    (numeric) The index of the transaction in the block that includes it.
    *       "blocktime" : xxx,                   (numeric) The block time expressed in UNIX epoch time.
    *       "txid" : "hex",                      (string) The transaction id.
    *       "walletconflicts" : [                (json array) Conflicting transaction ids.
    *         "hex",                             (string) The transaction id.
    *         ...
    *       ],
    *       "time" : xxx,                        (numeric) The transaction time expressed in UNIX epoch time.
    *       "timereceived" : xxx,                (numeric) The time received expressed in UNIX epoch time.
    *       "comment" : "str",                   (string) If a comment is associated with the transaction, only present if not empty.
    *       "bip125-replaceable" : "str",        (string) ("yes|no|unknown") Whether this transaction could be replaced due to BIP125 (replace-by-fee);
    *                                            may be unknown for unconfirmed transactions not in the mempool
    *       "abandoned" : true|false,            (boolean) 'true' if the transaction has been abandoned (inputs are respendable). Only available for the 
    *                                            'send' category of transactions.
    *       "label" : "str",                     (string) A comment for the address/transaction, if any
    *       "to" : "str"                         (string) If a comment to is associated with the transaction.
    *     },
    *     ...
    *   ],
    *   "removed" : [                            (json array) <structure is the same as "transactions" above, only present if include_removed=true>
    *                                            Note: transactions that were re-added in the active chain will appear as-is in this array, and may thus have a positive confirmation count.
    *     ...
    *   ],
    *   "lastblock" : "hex"                      (string) The hash of the block (target_confirmations-1) from the best block on the main chain, or the genesis hash if the referenced block does not exist yet. This is typically used to feed back into listsinceblock the next time you call it. So you would generally use a target_confirmations of say 6, so you will be continually re-notified of transactions until they've reached 6 confirmations plus any new ones
    * }
    * 
    * Examples:
    * > bitcoin-cli listsinceblock 
    * > bitcoin-cli listsinceblock "000000000000000bacf66f7497b7dc45ef753ee9a7d38571037cdb1a57f663ad" 6
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listsinceblock", "params": ["000000000000000bacf66f7497b7dc45ef753ee9a7d38571037cdb1a57f663ad", 6]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object listsinceblock(Object blockhash, Object target_confirmations, Object include_watchonly, Object include_removed) { return listsinceblock.invoke(blockhash, target_confirmations, include_watchonly, include_removed); }

   /**
    * pruneblockchain height
    * 
    * Arguments:
    * 1. height    (numeric, required) The block height to prune up to. May be set to a discrete height, or to a UNIX epoch time
    *              to prune blocks whose block time is at least 2 hours older than the provided timestamp.
    * 
    * Result:
    * n    (numeric) Height of the last block pruned
    * 
    * Examples:
    * > bitcoin-cli pruneblockchain 1000
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "pruneblockchain", "params": [1000]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object pruneblockchain(Object height) { return pruneblockchain.invoke(height); }

   /**
    * finalizepsbt "psbt" ( extract )
    * Finalize the inputs of a PSBT. If the transaction is fully signed, it will produce a
    * network serialized transaction which can be broadcast with sendrawtransaction. Otherwise a PSBT will be
    * created which has the final_scriptSig and final_scriptWitness fields filled for inputs that are complete.
    * Implements the Finalizer and Extractor roles.
    * 
    * Arguments:
    * 1. psbt       (string, required) A base64 string of a PSBT
    * 2. extract    (boolean, optional, default=true) If true and the transaction is complete,
    *               extract and return the complete transaction in normal network serialization instead of the PSBT.
    * 
    * Result:
    * {                             (json object)
    *   "psbt" : "str",             (string) The base64-encoded partially signed transaction if not extracted
    *   "hex" : "hex",              (string) The hex-encoded network transaction if extracted
    *   "complete" : true|false     (boolean) If the transaction has a complete set of signatures
    * }
    * 
    * Examples:
    * > bitcoin-cli finalizepsbt "psbt"
    */
   public Object finalizepsbt(Object psbt) { return finalizepsbt.invoke(psbt); }


   /**
    * finalizepsbt "psbt" ( extract )
    * Finalize the inputs of a PSBT. If the transaction is fully signed, it will produce a
    * network serialized transaction which can be broadcast with sendrawtransaction. Otherwise a PSBT will be
    * created which has the final_scriptSig and final_scriptWitness fields filled for inputs that are complete.
    * Implements the Finalizer and Extractor roles.
    * 
    * Arguments:
    * 1. psbt       (string, required) A base64 string of a PSBT
    * 2. extract    (boolean, optional, default=true) If true and the transaction is complete,
    *               extract and return the complete transaction in normal network serialization instead of the PSBT.
    * 
    * Result:
    * {                             (json object)
    *   "psbt" : "str",             (string) The base64-encoded partially signed transaction if not extracted
    *   "hex" : "hex",              (string) The hex-encoded network transaction if extracted
    *   "complete" : true|false     (boolean) If the transaction has a complete set of signatures
    * }
    * 
    * Examples:
    * > bitcoin-cli finalizepsbt "psbt"
    */
   public Object finalizepsbt(Object psbt, Object extract) { return finalizepsbt.invoke(psbt, extract); }

   /**
    * submitblock "hexdata" ( "dummy" )
    * 
    * Attempts to submit new block to network.
    * See https://en.bitcoin.it/wiki/BIP_0022 for full specification.
    * 
    * Arguments:
    * 1. hexdata    (string, required) the hex-encoded block data to submit
    * 2. dummy      (string, optional, default=ignored) dummy value, for compatibility with BIP22. This value is ignored.
    * 
    * Result (If the block was accepted):
    * null    (json null)
    * 
    * Result (Otherwise):
    * "str"    (string) According to BIP22
    * 
    * Examples:
    * > bitcoin-cli submitblock "mydata"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "submitblock", "params": ["mydata"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object submitblock(Object hexdata) { return submitblock.invoke(hexdata); }


   /**
    * submitblock "hexdata" ( "dummy" )
    * 
    * Attempts to submit new block to network.
    * See https://en.bitcoin.it/wiki/BIP_0022 for full specification.
    * 
    * Arguments:
    * 1. hexdata    (string, required) the hex-encoded block data to submit
    * 2. dummy      (string, optional, default=ignored) dummy value, for compatibility with BIP22. This value is ignored.
    * 
    * Result (If the block was accepted):
    * null    (json null)
    * 
    * Result (Otherwise):
    * "str"    (string) According to BIP22
    * 
    * Examples:
    * > bitcoin-cli submitblock "mydata"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "submitblock", "params": ["mydata"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object submitblock(Object hexdata, Object dummy) { return submitblock.invoke(hexdata, dummy); }

   /**
    * signrawtransactionwithwallet "hexstring" ( [{"txid":"hex","vout":n,"scriptPubKey":"hex","redeemScript":"hex","witnessScript":"hex","amount":amount},...] "sighashtype" )
    * 
    * Sign inputs for raw transaction (serialized, hex-encoded).
    * The second optional argument (may be null) is an array of previous transaction outputs that
    * this transaction depends on but may not yet be in the block chain.
    * Requires wallet passphrase to be set with walletpassphrase call if wallet is encrypted.
    * 
    * Arguments:
    * 1. hexstring                        (string, required) The transaction hex string
    * 2. prevtxs                          (json array, optional) The previous dependent transaction outputs
    *      [
    *        {                            (json object)
    *          "txid": "hex",             (string, required) The transaction id
    *          "vout": n,                 (numeric, required) The output number
    *          "scriptPubKey": "hex",     (string, required) script key
    *          "redeemScript": "hex",     (string) (required for P2SH) redeem script
    *          "witnessScript": "hex",    (string) (required for P2WSH or P2SH-P2WSH) witness script
    *          "amount": amount,          (numeric or string) (required for Segwit inputs) the amount spent
    *        },
    *        ...
    *      ]
    * 3. sighashtype                      (string, optional, default="DEFAULT") The signature hash type. Must be one of
    *                                     "DEFAULT"
    *                                     "ALL"
    *                                     "NONE"
    *                                     "SINGLE"
    *                                     "ALL|ANYONECANPAY"
    *                                     "NONE|ANYONECANPAY"
    *                                     "SINGLE|ANYONECANPAY"
    * 
    * Result:
    * {                             (json object)
    *   "hex" : "hex",              (string) The hex-encoded raw transaction with signature(s)
    *   "complete" : true|false,    (boolean) If the transaction has a complete set of signatures
    *   "errors" : [                (json array, optional) Script verification errors (if there are any)
    *     {                         (json object)
    *       "txid" : "hex",         (string) The hash of the referenced, previous transaction
    *       "vout" : n,             (numeric) The index of the output to spent and used as input
    *       "scriptSig" : "hex",    (string) The hex-encoded signature script
    *       "sequence" : n,         (numeric) Script sequence number
    *       "error" : "str"         (string) Verification or signing error related to the input
    *     },
    *     ...
    *   ]
    * }
    * 
    * Examples:
    * > bitcoin-cli signrawtransactionwithwallet "myhex"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "signrawtransactionwithwallet", "params": ["myhex"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object signrawtransactionwithwallet(Object hexstring) { return signrawtransactionwithwallet.invoke(hexstring); }


   /**
    * signrawtransactionwithwallet "hexstring" ( [{"txid":"hex","vout":n,"scriptPubKey":"hex","redeemScript":"hex","witnessScript":"hex","amount":amount},...] "sighashtype" )
    * 
    * Sign inputs for raw transaction (serialized, hex-encoded).
    * The second optional argument (may be null) is an array of previous transaction outputs that
    * this transaction depends on but may not yet be in the block chain.
    * Requires wallet passphrase to be set with walletpassphrase call if wallet is encrypted.
    * 
    * Arguments:
    * 1. hexstring                        (string, required) The transaction hex string
    * 2. prevtxs                          (json array, optional) The previous dependent transaction outputs
    *      [
    *        {                            (json object)
    *          "txid": "hex",             (string, required) The transaction id
    *          "vout": n,                 (numeric, required) The output number
    *          "scriptPubKey": "hex",     (string, required) script key
    *          "redeemScript": "hex",     (string) (required for P2SH) redeem script
    *          "witnessScript": "hex",    (string) (required for P2WSH or P2SH-P2WSH) witness script
    *          "amount": amount,          (numeric or string) (required for Segwit inputs) the amount spent
    *        },
    *        ...
    *      ]
    * 3. sighashtype                      (string, optional, default="DEFAULT") The signature hash type. Must be one of
    *                                     "DEFAULT"
    *                                     "ALL"
    *                                     "NONE"
    *                                     "SINGLE"
    *                                     "ALL|ANYONECANPAY"
    *                                     "NONE|ANYONECANPAY"
    *                                     "SINGLE|ANYONECANPAY"
    * 
    * Result:
    * {                             (json object)
    *   "hex" : "hex",              (string) The hex-encoded raw transaction with signature(s)
    *   "complete" : true|false,    (boolean) If the transaction has a complete set of signatures
    *   "errors" : [                (json array, optional) Script verification errors (if there are any)
    *     {                         (json object)
    *       "txid" : "hex",         (string) The hash of the referenced, previous transaction
    *       "vout" : n,             (numeric) The index of the output to spent and used as input
    *       "scriptSig" : "hex",    (string) The hex-encoded signature script
    *       "sequence" : n,         (numeric) Script sequence number
    *       "error" : "str"         (string) Verification or signing error related to the input
    *     },
    *     ...
    *   ]
    * }
    * 
    * Examples:
    * > bitcoin-cli signrawtransactionwithwallet "myhex"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "signrawtransactionwithwallet", "params": ["myhex"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object signrawtransactionwithwallet(Object hexstring, Object json) { return signrawtransactionwithwallet.invoke(hexstring, json); }


   /**
    * signrawtransactionwithwallet "hexstring" ( [{"txid":"hex","vout":n,"scriptPubKey":"hex","redeemScript":"hex","witnessScript":"hex","amount":amount},...] "sighashtype" )
    * 
    * Sign inputs for raw transaction (serialized, hex-encoded).
    * The second optional argument (may be null) is an array of previous transaction outputs that
    * this transaction depends on but may not yet be in the block chain.
    * Requires wallet passphrase to be set with walletpassphrase call if wallet is encrypted.
    * 
    * Arguments:
    * 1. hexstring                        (string, required) The transaction hex string
    * 2. prevtxs                          (json array, optional) The previous dependent transaction outputs
    *      [
    *        {                            (json object)
    *          "txid": "hex",             (string, required) The transaction id
    *          "vout": n,                 (numeric, required) The output number
    *          "scriptPubKey": "hex",     (string, required) script key
    *          "redeemScript": "hex",     (string) (required for P2SH) redeem script
    *          "witnessScript": "hex",    (string) (required for P2WSH or P2SH-P2WSH) witness script
    *          "amount": amount,          (numeric or string) (required for Segwit inputs) the amount spent
    *        },
    *        ...
    *      ]
    * 3. sighashtype                      (string, optional, default="DEFAULT") The signature hash type. Must be one of
    *                                     "DEFAULT"
    *                                     "ALL"
    *                                     "NONE"
    *                                     "SINGLE"
    *                                     "ALL|ANYONECANPAY"
    *                                     "NONE|ANYONECANPAY"
    *                                     "SINGLE|ANYONECANPAY"
    * 
    * Result:
    * {                             (json object)
    *   "hex" : "hex",              (string) The hex-encoded raw transaction with signature(s)
    *   "complete" : true|false,    (boolean) If the transaction has a complete set of signatures
    *   "errors" : [                (json array, optional) Script verification errors (if there are any)
    *     {                         (json object)
    *       "txid" : "hex",         (string) The hash of the referenced, previous transaction
    *       "vout" : n,             (numeric) The index of the output to spent and used as input
    *       "scriptSig" : "hex",    (string) The hex-encoded signature script
    *       "sequence" : n,         (numeric) Script sequence number
    *       "error" : "str"         (string) Verification or signing error related to the input
    *     },
    *     ...
    *   ]
    * }
    * 
    * Examples:
    * > bitcoin-cli signrawtransactionwithwallet "myhex"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "signrawtransactionwithwallet", "params": ["myhex"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object signrawtransactionwithwallet(Object hexstring, Object json, Object sighashtype) { return signrawtransactionwithwallet.invoke(hexstring, json, sighashtype); }

   /**
    * help ( "command" )
    * 
    * List all commands, or get help for a specified command.
    * 
    * Arguments:
    * 1. command    (string, optional, default=all commands) The command to get help on
    * 
    * Result:
    * "str"    (string) The help text
    */
   public Object help() { return help.invoke(); }


   /**
    * help ( "command" )
    * 
    * List all commands, or get help for a specified command.
    * 
    * Arguments:
    * 1. command    (string, optional, default=all commands) The command to get help on
    * 
    * Result:
    * "str"    (string) The help text
    */
   public Object help(Object command) { return help.invoke(command); }

   /**
    * setwalletflag "flag" ( value )
    * 
    * Change the state of the given wallet flag for a wallet.
    * 
    * Arguments:
    * 1. flag     (string, required) The name of the flag to change. Current available flags: avoid_reuse
    * 2. value    (boolean, optional, default=true) The new state.
    * 
    * Result:
    * {                               (json object)
    *   "flag_name" : "str",          (string) The name of the flag that was modified
    *   "flag_state" : true|false,    (boolean) The new state of the flag
    *   "warnings" : "str"            (string) Any warnings associated with the change
    * }
    * 
    * Examples:
    * > bitcoin-cli setwalletflag avoid_reuse
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "setwalletflag", "params": ["avoid_reuse"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object setwalletflag(Object flag) { return setwalletflag.invoke(flag); }


   /**
    * setwalletflag "flag" ( value )
    * 
    * Change the state of the given wallet flag for a wallet.
    * 
    * Arguments:
    * 1. flag     (string, required) The name of the flag to change. Current available flags: avoid_reuse
    * 2. value    (boolean, optional, default=true) The new state.
    * 
    * Result:
    * {                               (json object)
    *   "flag_name" : "str",          (string) The name of the flag that was modified
    *   "flag_state" : true|false,    (boolean) The new state of the flag
    *   "warnings" : "str"            (string) Any warnings associated with the change
    * }
    * 
    * Examples:
    * > bitcoin-cli setwalletflag avoid_reuse
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "setwalletflag", "params": ["avoid_reuse"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object setwalletflag(Object flag, Object value) { return setwalletflag.invoke(flag, value); }

   /**
    * getmempoolancestors "txid" ( verbose )
    * 
    * If txid is in the mempool, returns all in-mempool ancestors.
    * 
    * Arguments:
    * 1. txid       (string, required) The transaction id (must be in mempool)
    * 2. verbose    (boolean, optional, default=false) True for a json object, false for array of transaction ids
    * 
    * Result (for verbose = false):
    * [           (json array)
    *   "hex",    (string) The transaction id of an in-mempool ancestor transaction
    *   ...
    * ]
    * 
    * Result (for verbose = true):
    * {                                         (json object)
    *   "transactionid" : {                     (json object)
    *     "vsize" : n,                          (numeric) virtual transaction size as defined in BIP 141. This is different from actual serialized size for witness transactions as witness data is discounted.
    *     "weight" : n,                         (numeric) transaction weight as defined in BIP 141.
    *     "fee" : n,                            (numeric) transaction fee in BTC (DEPRECATED)
    *     "modifiedfee" : n,                    (numeric) transaction fee with fee deltas used for mining priority (DEPRECATED)
    *     "time" : xxx,                         (numeric) local time transaction entered pool in seconds since 1 Jan 1970 GMT
    *     "height" : n,                         (numeric) block height when transaction entered pool
    *     "descendantcount" : n,                (numeric) number of in-mempool descendant transactions (including this one)
    *     "descendantsize" : n,                 (numeric) virtual transaction size of in-mempool descendants (including this one)
    *     "descendantfees" : n,                 (numeric) modified fees (see above) of in-mempool descendants (including this one) (DEPRECATED)
    *     "ancestorcount" : n,                  (numeric) number of in-mempool ancestor transactions (including this one)
    *     "ancestorsize" : n,                   (numeric) virtual transaction size of in-mempool ancestors (including this one)
    *     "ancestorfees" : n,                   (numeric) modified fees (see above) of in-mempool ancestors (including this one) (DEPRECATED)
    *     "wtxid" : "hex",                      (string) hash of serialized transaction, including witness data
    *     "fees" : {                            (json object)
    *       "base" : n,                         (numeric) transaction fee in BTC
    *       "modified" : n,                     (numeric) transaction fee with fee deltas used for mining priority in BTC
    *       "ancestor" : n,                     (numeric) modified fees (see above) of in-mempool ancestors (including this one) in BTC
    *       "descendant" : n                    (numeric) modified fees (see above) of in-mempool descendants (including this one) in BTC
    *     },
    *     "depends" : [                         (json array) unconfirmed transactions used as inputs for this transaction
    *       "hex",                              (string) parent transaction id
    *       ...
    *     ],
    *     "spentby" : [                         (json array) unconfirmed transactions spending outputs from this transaction
    *       "hex",                              (string) child transaction id
    *       ...
    *     ],
    *     "bip125-replaceable" : true|false,    (boolean) Whether this transaction could be replaced due to BIP125 (replace-by-fee)
    *     "unbroadcast" : true|false            (boolean) Whether this transaction is currently unbroadcast (initial broadcast not yet acknowledged by any peers)
    *   },
    *   ...
    * }
    * 
    * Examples:
    * > bitcoin-cli getmempoolancestors "mytxid"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getmempoolancestors", "params": ["mytxid"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getmempoolancestors(Object txid) { return getmempoolancestors.invoke(txid); }


   /**
    * getmempoolancestors "txid" ( verbose )
    * 
    * If txid is in the mempool, returns all in-mempool ancestors.
    * 
    * Arguments:
    * 1. txid       (string, required) The transaction id (must be in mempool)
    * 2. verbose    (boolean, optional, default=false) True for a json object, false for array of transaction ids
    * 
    * Result (for verbose = false):
    * [           (json array)
    *   "hex",    (string) The transaction id of an in-mempool ancestor transaction
    *   ...
    * ]
    * 
    * Result (for verbose = true):
    * {                                         (json object)
    *   "transactionid" : {                     (json object)
    *     "vsize" : n,                          (numeric) virtual transaction size as defined in BIP 141. This is different from actual serialized size for witness transactions as witness data is discounted.
    *     "weight" : n,                         (numeric) transaction weight as defined in BIP 141.
    *     "fee" : n,                            (numeric) transaction fee in BTC (DEPRECATED)
    *     "modifiedfee" : n,                    (numeric) transaction fee with fee deltas used for mining priority (DEPRECATED)
    *     "time" : xxx,                         (numeric) local time transaction entered pool in seconds since 1 Jan 1970 GMT
    *     "height" : n,                         (numeric) block height when transaction entered pool
    *     "descendantcount" : n,                (numeric) number of in-mempool descendant transactions (including this one)
    *     "descendantsize" : n,                 (numeric) virtual transaction size of in-mempool descendants (including this one)
    *     "descendantfees" : n,                 (numeric) modified fees (see above) of in-mempool descendants (including this one) (DEPRECATED)
    *     "ancestorcount" : n,                  (numeric) number of in-mempool ancestor transactions (including this one)
    *     "ancestorsize" : n,                   (numeric) virtual transaction size of in-mempool ancestors (including this one)
    *     "ancestorfees" : n,                   (numeric) modified fees (see above) of in-mempool ancestors (including this one) (DEPRECATED)
    *     "wtxid" : "hex",                      (string) hash of serialized transaction, including witness data
    *     "fees" : {                            (json object)
    *       "base" : n,                         (numeric) transaction fee in BTC
    *       "modified" : n,                     (numeric) transaction fee with fee deltas used for mining priority in BTC
    *       "ancestor" : n,                     (numeric) modified fees (see above) of in-mempool ancestors (including this one) in BTC
    *       "descendant" : n                    (numeric) modified fees (see above) of in-mempool descendants (including this one) in BTC
    *     },
    *     "depends" : [                         (json array) unconfirmed transactions used as inputs for this transaction
    *       "hex",                              (string) parent transaction id
    *       ...
    *     ],
    *     "spentby" : [                         (json array) unconfirmed transactions spending outputs from this transaction
    *       "hex",                              (string) child transaction id
    *       ...
    *     ],
    *     "bip125-replaceable" : true|false,    (boolean) Whether this transaction could be replaced due to BIP125 (replace-by-fee)
    *     "unbroadcast" : true|false            (boolean) Whether this transaction is currently unbroadcast (initial broadcast not yet acknowledged by any peers)
    *   },
    *   ...
    * }
    * 
    * Examples:
    * > bitcoin-cli getmempoolancestors "mytxid"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getmempoolancestors", "params": ["mytxid"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getmempoolancestors(Object txid, Object verbose) { return getmempoolancestors.invoke(txid, verbose); }

   /**
    * getblockstats hash_or_height ( stats )
    * 
    * Compute per block statistics for a given window. All amounts are in satoshis.
    * It won't work for some heights with pruning.
    * 
    * Arguments:
    * 1. hash_or_height    (string or numeric, required) The block hash or height of the target block
    * 2. stats             (json array, optional, default=all values) Values to plot (see result below)
    *      [
    *        "height",     (string) Selected statistic
    *        "time",       (string) Selected statistic
    *        ...
    *      ]
    * 
    * Result:
    * {                              (json object)
    *   "avgfee" : n,                (numeric) Average fee in the block
    *   "avgfeerate" : n,            (numeric) Average feerate (in satoshis per virtual byte)
    *   "avgtxsize" : n,             (numeric) Average transaction size
    *   "blockhash" : "hex",         (string) The block hash (to check for potential reorgs)
    *   "feerate_percentiles" : [    (json array) Feerates at the 10th, 25th, 50th, 75th, and 90th percentile weight unit (in satoshis per virtual byte)
    *     n,                         (numeric) The 10th percentile feerate
    *     n,                         (numeric) The 25th percentile feerate
    *     n,                         (numeric) The 50th percentile feerate
    *     n,                         (numeric) The 75th percentile feerate
    *     n                          (numeric) The 90th percentile feerate
    *   ],
    *   "height" : n,                (numeric) The height of the block
    *   "ins" : n,                   (numeric) The number of inputs (excluding coinbase)
    *   "maxfee" : n,                (numeric) Maximum fee in the block
    *   "maxfeerate" : n,            (numeric) Maximum feerate (in satoshis per virtual byte)
    *   "maxtxsize" : n,             (numeric) Maximum transaction size
    *   "medianfee" : n,             (numeric) Truncated median fee in the block
    *   "mediantime" : n,            (numeric) The block median time past
    *   "mediantxsize" : n,          (numeric) Truncated median transaction size
    *   "minfee" : n,                (numeric) Minimum fee in the block
    *   "minfeerate" : n,            (numeric) Minimum feerate (in satoshis per virtual byte)
    *   "mintxsize" : n,             (numeric) Minimum transaction size
    *   "outs" : n,                  (numeric) The number of outputs
    *   "subsidy" : n,               (numeric) The block subsidy
    *   "swtotal_size" : n,          (numeric) Total size of all segwit transactions
    *   "swtotal_weight" : n,        (numeric) Total weight of all segwit transactions
    *   "swtxs" : n,                 (numeric) The number of segwit transactions
    *   "time" : n,                  (numeric) The block time
    *   "total_out" : n,             (numeric) Total amount in all outputs (excluding coinbase and thus reward [ie subsidy + totalfee])
    *   "total_size" : n,            (numeric) Total size of all non-coinbase transactions
    *   "total_weight" : n,          (numeric) Total weight of all non-coinbase transactions
    *   "totalfee" : n,              (numeric) The fee total
    *   "txs" : n,                   (numeric) The number of transactions (including coinbase)
    *   "utxo_increase" : n,         (numeric) The increase/decrease in the number of unspent outputs
    *   "utxo_size_inc" : n          (numeric) The increase/decrease in size for the utxo index (not discounting op_return and similar)
    * }
    * 
    * Examples:
    * > bitcoin-cli getblockstats '"00000000c937983704a73af28acdec37b049d214adbda81d7e2a3dd146f6ed09"' '["minfeerate","avgfeerate"]'
    * > bitcoin-cli getblockstats 1000 '["minfeerate","avgfeerate"]'
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getblockstats", "params": ["00000000c937983704a73af28acdec37b049d214adbda81d7e2a3dd146f6ed09", ["minfeerate","avgfeerate"]]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getblockstats", "params": [1000, ["minfeerate","avgfeerate"]]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getblockstats(Object hash_or_height) { return getblockstats.invoke(hash_or_height); }


   /**
    * getblockstats hash_or_height ( stats )
    * 
    * Compute per block statistics for a given window. All amounts are in satoshis.
    * It won't work for some heights with pruning.
    * 
    * Arguments:
    * 1. hash_or_height    (string or numeric, required) The block hash or height of the target block
    * 2. stats             (json array, optional, default=all values) Values to plot (see result below)
    *      [
    *        "height",     (string) Selected statistic
    *        "time",       (string) Selected statistic
    *        ...
    *      ]
    * 
    * Result:
    * {                              (json object)
    *   "avgfee" : n,                (numeric) Average fee in the block
    *   "avgfeerate" : n,            (numeric) Average feerate (in satoshis per virtual byte)
    *   "avgtxsize" : n,             (numeric) Average transaction size
    *   "blockhash" : "hex",         (string) The block hash (to check for potential reorgs)
    *   "feerate_percentiles" : [    (json array) Feerates at the 10th, 25th, 50th, 75th, and 90th percentile weight unit (in satoshis per virtual byte)
    *     n,                         (numeric) The 10th percentile feerate
    *     n,                         (numeric) The 25th percentile feerate
    *     n,                         (numeric) The 50th percentile feerate
    *     n,                         (numeric) The 75th percentile feerate
    *     n                          (numeric) The 90th percentile feerate
    *   ],
    *   "height" : n,                (numeric) The height of the block
    *   "ins" : n,                   (numeric) The number of inputs (excluding coinbase)
    *   "maxfee" : n,                (numeric) Maximum fee in the block
    *   "maxfeerate" : n,            (numeric) Maximum feerate (in satoshis per virtual byte)
    *   "maxtxsize" : n,             (numeric) Maximum transaction size
    *   "medianfee" : n,             (numeric) Truncated median fee in the block
    *   "mediantime" : n,            (numeric) The block median time past
    *   "mediantxsize" : n,          (numeric) Truncated median transaction size
    *   "minfee" : n,                (numeric) Minimum fee in the block
    *   "minfeerate" : n,            (numeric) Minimum feerate (in satoshis per virtual byte)
    *   "mintxsize" : n,             (numeric) Minimum transaction size
    *   "outs" : n,                  (numeric) The number of outputs
    *   "subsidy" : n,               (numeric) The block subsidy
    *   "swtotal_size" : n,          (numeric) Total size of all segwit transactions
    *   "swtotal_weight" : n,        (numeric) Total weight of all segwit transactions
    *   "swtxs" : n,                 (numeric) The number of segwit transactions
    *   "time" : n,                  (numeric) The block time
    *   "total_out" : n,             (numeric) Total amount in all outputs (excluding coinbase and thus reward [ie subsidy + totalfee])
    *   "total_size" : n,            (numeric) Total size of all non-coinbase transactions
    *   "total_weight" : n,          (numeric) Total weight of all non-coinbase transactions
    *   "totalfee" : n,              (numeric) The fee total
    *   "txs" : n,                   (numeric) The number of transactions (including coinbase)
    *   "utxo_increase" : n,         (numeric) The increase/decrease in the number of unspent outputs
    *   "utxo_size_inc" : n          (numeric) The increase/decrease in size for the utxo index (not discounting op_return and similar)
    * }
    * 
    * Examples:
    * > bitcoin-cli getblockstats '"00000000c937983704a73af28acdec37b049d214adbda81d7e2a3dd146f6ed09"' '["minfeerate","avgfeerate"]'
    * > bitcoin-cli getblockstats 1000 '["minfeerate","avgfeerate"]'
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getblockstats", "params": ["00000000c937983704a73af28acdec37b049d214adbda81d7e2a3dd146f6ed09", ["minfeerate","avgfeerate"]]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getblockstats", "params": [1000, ["minfeerate","avgfeerate"]]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getblockstats(Object hash_or_height, Object stats) { return getblockstats.invoke(hash_or_height, stats); }

   /**
    * getnewaddress ( "label" "address_type" )
    * 
    * Returns a new Bitcoin address for receiving payments.
    * If 'label' is specified, it is added to the address book 
    * so payments received with the address will be associated with 'label'.
    * 
    * Arguments:
    * 1. label           (string, optional, default="") The label name for the address to be linked to. It can also be set to the empty string "" to represent the default label. The label does not need to exist, it will be created if there is no label by the given name.
    * 2. address_type    (string, optional, default=set by -addresstype) The address type to use. Options are "legacy", "p2sh-segwit", and "bech32".
    * 
    * Result:
    * "str"    (string) The new bitcoin address
    * 
    * Examples:
    * > bitcoin-cli getnewaddress 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getnewaddress", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getnewaddress() { return getnewaddress.invoke(); }


   /**
    * getnewaddress ( "label" "address_type" )
    * 
    * Returns a new Bitcoin address for receiving payments.
    * If 'label' is specified, it is added to the address book 
    * so payments received with the address will be associated with 'label'.
    * 
    * Arguments:
    * 1. label           (string, optional, default="") The label name for the address to be linked to. It can also be set to the empty string "" to represent the default label. The label does not need to exist, it will be created if there is no label by the given name.
    * 2. address_type    (string, optional, default=set by -addresstype) The address type to use. Options are "legacy", "p2sh-segwit", and "bech32".
    * 
    * Result:
    * "str"    (string) The new bitcoin address
    * 
    * Examples:
    * > bitcoin-cli getnewaddress 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getnewaddress", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getnewaddress(Object label) { return getnewaddress.invoke(label); }


   /**
    * getnewaddress ( "label" "address_type" )
    * 
    * Returns a new Bitcoin address for receiving payments.
    * If 'label' is specified, it is added to the address book 
    * so payments received with the address will be associated with 'label'.
    * 
    * Arguments:
    * 1. label           (string, optional, default="") The label name for the address to be linked to. It can also be set to the empty string "" to represent the default label. The label does not need to exist, it will be created if there is no label by the given name.
    * 2. address_type    (string, optional, default=set by -addresstype) The address type to use. Options are "legacy", "p2sh-segwit", and "bech32".
    * 
    * Result:
    * "str"    (string) The new bitcoin address
    * 
    * Examples:
    * > bitcoin-cli getnewaddress 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getnewaddress", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getnewaddress(Object label, Object address_type) { return getnewaddress.invoke(label, address_type); }

   /**
    * submitheader "hexdata"
    * 
    * Decode the given hexdata as a header and submit it as a candidate chain tip if valid.
    * Throws when the header is invalid.
    * 
    * Arguments:
    * 1. hexdata    (string, required) the hex-encoded block header data
    * 
    * Result:
    * null    (json null) None
    * 
    * Examples:
    * > bitcoin-cli submitheader "aabbcc"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "submitheader", "params": ["aabbcc"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object submitheader(Object hexdata) { return submitheader.invoke(hexdata); }

   /**
    * getblockfilter "blockhash" ( "filtertype" )
    * 
    * Retrieve a BIP 157 content filter for a particular block.
    * 
    * Arguments:
    * 1. blockhash     (string, required) The hash of the block
    * 2. filtertype    (string, optional, default="basic") The type name of the filter
    * 
    * Result:
    * {                      (json object)
    *   "filter" : "hex",    (string) the hex-encoded filter data
    *   "header" : "hex"     (string) the hex-encoded filter header
    * }
    * 
    * Examples:
    * > bitcoin-cli getblockfilter "00000000c937983704a73af28acdec37b049d214adbda81d7e2a3dd146f6ed09" "basic"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getblockfilter", "params": ["00000000c937983704a73af28acdec37b049d214adbda81d7e2a3dd146f6ed09", "basic"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getblockfilter(Object blockhash) { return getblockfilter.invoke(blockhash); }


   /**
    * getblockfilter "blockhash" ( "filtertype" )
    * 
    * Retrieve a BIP 157 content filter for a particular block.
    * 
    * Arguments:
    * 1. blockhash     (string, required) The hash of the block
    * 2. filtertype    (string, optional, default="basic") The type name of the filter
    * 
    * Result:
    * {                      (json object)
    *   "filter" : "hex",    (string) the hex-encoded filter data
    *   "header" : "hex"     (string) the hex-encoded filter header
    * }
    * 
    * Examples:
    * > bitcoin-cli getblockfilter "00000000c937983704a73af28acdec37b049d214adbda81d7e2a3dd146f6ed09" "basic"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getblockfilter", "params": ["00000000c937983704a73af28acdec37b049d214adbda81d7e2a3dd146f6ed09", "basic"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getblockfilter(Object blockhash, Object verbosity) { return getblockfilter.invoke(blockhash, verbosity); }

   /**
    * setlabel "address" "label"
    * 
    * Sets the label associated with the given address.
    * 
    * Arguments:
    * 1. address    (string, required) The bitcoin address to be associated with a label.
    * 2. label      (string, required) The label to assign to the address.
    * 
    * Result:
    * null    (json null)
    * 
    * Examples:
    * > bitcoin-cli setlabel "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" "tabby"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "setlabel", "params": ["bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl", "tabby"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object setlabel(Object address, Object label) { return setlabel.invoke(address, label); }

   /**
    * getblockheader "blockhash" ( verbose )
    * 
    * If verbose is false, returns a string that is serialized, hex-encoded data for blockheader 'hash'.
    * If verbose is true, returns an Object with information about blockheader <hash>.
    * 
    * Arguments:
    * 1. blockhash    (string, required) The block hash
    * 2. verbose      (boolean, optional, default=true) true for a json object, false for the hex-encoded data
    * 
    * Result (for verbose = true):
    * {                                 (json object)
    *   "hash" : "hex",                 (string) the block hash (same as provided)
    *   "confirmations" : n,            (numeric) The number of confirmations, or -1 if the block is not on the main chain
    *   "height" : n,                   (numeric) The block height or index
    *   "version" : n,                  (numeric) The block version
    *   "versionHex" : "hex",           (string) The block version formatted in hexadecimal
    *   "merkleroot" : "hex",           (string) The merkle root
    *   "time" : xxx,                   (numeric) The block time expressed in UNIX epoch time
    *   "mediantime" : xxx,             (numeric) The median block time expressed in UNIX epoch time
    *   "nonce" : n,                    (numeric) The nonce
    *   "bits" : "hex",                 (string) The bits
    *   "difficulty" : n,               (numeric) The difficulty
    *   "chainwork" : "hex",            (string) Expected number of hashes required to produce the current chain
    *   "nTx" : n,                      (numeric) The number of transactions in the block
    *   "previousblockhash" : "hex",    (string, optional) The hash of the previous block (if available)
    *   "nextblockhash" : "hex"         (string, optional) The hash of the next block (if available)
    * }
    * 
    * Result (for verbose=false):
    * "hex"    (string) A string that is serialized, hex-encoded data for block 'hash'
    * 
    * Examples:
    * > bitcoin-cli getblockheader "00000000c937983704a73af28acdec37b049d214adbda81d7e2a3dd146f6ed09"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getblockheader", "params": ["00000000c937983704a73af28acdec37b049d214adbda81d7e2a3dd146f6ed09"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getblockheader(Object blockhash) { return getblockheader.invoke(blockhash); }


   /**
    * getblockheader "blockhash" ( verbose )
    * 
    * If verbose is false, returns a string that is serialized, hex-encoded data for blockheader 'hash'.
    * If verbose is true, returns an Object with information about blockheader <hash>.
    * 
    * Arguments:
    * 1. blockhash    (string, required) The block hash
    * 2. verbose      (boolean, optional, default=true) true for a json object, false for the hex-encoded data
    * 
    * Result (for verbose = true):
    * {                                 (json object)
    *   "hash" : "hex",                 (string) the block hash (same as provided)
    *   "confirmations" : n,            (numeric) The number of confirmations, or -1 if the block is not on the main chain
    *   "height" : n,                   (numeric) The block height or index
    *   "version" : n,                  (numeric) The block version
    *   "versionHex" : "hex",           (string) The block version formatted in hexadecimal
    *   "merkleroot" : "hex",           (string) The merkle root
    *   "time" : xxx,                   (numeric) The block time expressed in UNIX epoch time
    *   "mediantime" : xxx,             (numeric) The median block time expressed in UNIX epoch time
    *   "nonce" : n,                    (numeric) The nonce
    *   "bits" : "hex",                 (string) The bits
    *   "difficulty" : n,               (numeric) The difficulty
    *   "chainwork" : "hex",            (string) Expected number of hashes required to produce the current chain
    *   "nTx" : n,                      (numeric) The number of transactions in the block
    *   "previousblockhash" : "hex",    (string, optional) The hash of the previous block (if available)
    *   "nextblockhash" : "hex"         (string, optional) The hash of the next block (if available)
    * }
    * 
    * Result (for verbose=false):
    * "hex"    (string) A string that is serialized, hex-encoded data for block 'hash'
    * 
    * Examples:
    * > bitcoin-cli getblockheader "00000000c937983704a73af28acdec37b049d214adbda81d7e2a3dd146f6ed09"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getblockheader", "params": ["00000000c937983704a73af28acdec37b049d214adbda81d7e2a3dd146f6ed09"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getblockheader(Object blockhash, Object verbosity) { return getblockheader.invoke(blockhash, verbosity); }

   /**
    * walletdisplayaddress bitcoin address to display
    * Display address on an external signer for verification.
    * Arguments:
    * 1. address    (string, required)
    * 
    * Result:
    * {                       (json object)
    *   "address" : "str"     (string) The address as confirmed by the signer
    * }
    */
   public Object walletdisplayaddress(Object address) { return walletdisplayaddress.invoke(address); }

   /**
    * getnodeaddresses ( count "network" )
    * 
    * Return known addresses, which can potentially be used to find new nodes in the network.
    * 
    * Arguments:
    * 1. count      (numeric, optional, default=1) The maximum number of addresses to return. Specify 0 to return all known addresses.
    * 2. network    (string, optional, default=all networks) Return only addresses of the specified network. Can be one of: ipv4, ipv6, onion, i2p.
    * 
    * Result:
    * [                         (json array)
    *   {                       (json object)
    *     "time" : xxx,         (numeric) The UNIX epoch time when the node was last seen
    *     "services" : n,       (numeric) The services offered by the node
    *     "address" : "str",    (string) The address of the node
    *     "port" : n,           (numeric) The port number of the node
    *     "network" : "str"     (string) The network (ipv4, ipv6, onion, i2p) the node connected through
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * > bitcoin-cli getnodeaddresses 8
    * > bitcoin-cli getnodeaddresses 4 "i2p"
    * > bitcoin-cli -named getnodeaddresses network=onion count=12
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getnodeaddresses", "params": [8]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getnodeaddresses", "params": [4, "i2p"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getnodeaddresses() { return getnodeaddresses.invoke(); }


   /**
    * getnodeaddresses ( count "network" )
    * 
    * Return known addresses, which can potentially be used to find new nodes in the network.
    * 
    * Arguments:
    * 1. count      (numeric, optional, default=1) The maximum number of addresses to return. Specify 0 to return all known addresses.
    * 2. network    (string, optional, default=all networks) Return only addresses of the specified network. Can be one of: ipv4, ipv6, onion, i2p.
    * 
    * Result:
    * [                         (json array)
    *   {                       (json object)
    *     "time" : xxx,         (numeric) The UNIX epoch time when the node was last seen
    *     "services" : n,       (numeric) The services offered by the node
    *     "address" : "str",    (string) The address of the node
    *     "port" : n,           (numeric) The port number of the node
    *     "network" : "str"     (string) The network (ipv4, ipv6, onion, i2p) the node connected through
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * > bitcoin-cli getnodeaddresses 8
    * > bitcoin-cli getnodeaddresses 4 "i2p"
    * > bitcoin-cli -named getnodeaddresses network=onion count=12
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getnodeaddresses", "params": [8]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getnodeaddresses", "params": [4, "i2p"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getnodeaddresses(Object count) { return getnodeaddresses.invoke(count); }


   /**
    * getnodeaddresses ( count "network" )
    * 
    * Return known addresses, which can potentially be used to find new nodes in the network.
    * 
    * Arguments:
    * 1. count      (numeric, optional, default=1) The maximum number of addresses to return. Specify 0 to return all known addresses.
    * 2. network    (string, optional, default=all networks) Return only addresses of the specified network. Can be one of: ipv4, ipv6, onion, i2p.
    * 
    * Result:
    * [                         (json array)
    *   {                       (json object)
    *     "time" : xxx,         (numeric) The UNIX epoch time when the node was last seen
    *     "services" : n,       (numeric) The services offered by the node
    *     "address" : "str",    (string) The address of the node
    *     "port" : n,           (numeric) The port number of the node
    *     "network" : "str"     (string) The network (ipv4, ipv6, onion, i2p) the node connected through
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * > bitcoin-cli getnodeaddresses 8
    * > bitcoin-cli getnodeaddresses 4 "i2p"
    * > bitcoin-cli -named getnodeaddresses network=onion count=12
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getnodeaddresses", "params": [8]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getnodeaddresses", "params": [4, "i2p"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getnodeaddresses(Object count, Object network) { return getnodeaddresses.invoke(count, network); }

   /**
    * walletlock
    * 
    * Removes the wallet encryption key from memory, locking the wallet.
    * After calling this method, you will need to call walletpassphrase again
    * before being able to call any methods which require the wallet to be unlocked.
    * 
    * Result:
    * null    (json null)
    * 
    * Examples:
    * 
    * Set the passphrase for 2 minutes to perform a transaction
    * > bitcoin-cli walletpassphrase "my pass phrase" 120
    * 
    * Perform a send (requires passphrase set)
    * > bitcoin-cli sendtoaddress "bc1q09vm5lfy0j5reeulh4x5752q25uqqvz34hufdl" 1.0
    * 
    * Clear the passphrase since we are done before 2 minutes is up
    * > bitcoin-cli walletlock 
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "walletlock", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object walletlock() { return walletlock.invoke(); }

   /**
    * savemempool
    * 
    * Dumps the mempool to disk. It will fail until the previous dump is fully loaded.
    * 
    * Result:
    * null    (json null)
    * 
    * Examples:
    * > bitcoin-cli savemempool 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "savemempool", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object savemempool() { return savemempool.invoke(); }

   /**
    * getconnectioncount
    * 
    * Returns the number of connections to other nodes.
    * 
    * Result:
    * n    (numeric) The connection count
    * 
    * Examples:
    * > bitcoin-cli getconnectioncount 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getconnectioncount", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getconnectioncount() { return getconnectioncount.invoke(); }

   /**
    * importpubkey "pubkey" ( "label" rescan )
    * 
    * Adds a public key (in hex) that can be watched as if it were in your wallet but cannot be used to spend. Requires a new wallet backup.
    * Hint: use importmulti to import more than one public key.
    * 
    * Note: This call can take over an hour to complete if rescan is true, during that time, other rpc calls
    * may report that the imported pubkey exists but related transactions are still missing, leading to temporarily incorrect/bogus balances and unspent outputs until rescan completes.
    * Note: Use "getwalletinfo" to query the scanning progress.
    * 
    * Arguments:
    * 1. pubkey    (string, required) The hex-encoded public key
    * 2. label     (string, optional, default="") An optional label
    * 3. rescan    (boolean, optional, default=true) Rescan the wallet for transactions
    * 
    * Result:
    * null    (json null)
    * 
    * Examples:
    * 
    * Import a public key with rescan
    * > bitcoin-cli importpubkey "mypubkey"
    * 
    * Import using a label without rescan
    * > bitcoin-cli importpubkey "mypubkey" "testing" false
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "importpubkey", "params": ["mypubkey", "testing", false]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object importpubkey(Object pubkey) { return importpubkey.invoke(pubkey); }


   /**
    * importpubkey "pubkey" ( "label" rescan )
    * 
    * Adds a public key (in hex) that can be watched as if it were in your wallet but cannot be used to spend. Requires a new wallet backup.
    * Hint: use importmulti to import more than one public key.
    * 
    * Note: This call can take over an hour to complete if rescan is true, during that time, other rpc calls
    * may report that the imported pubkey exists but related transactions are still missing, leading to temporarily incorrect/bogus balances and unspent outputs until rescan completes.
    * Note: Use "getwalletinfo" to query the scanning progress.
    * 
    * Arguments:
    * 1. pubkey    (string, required) The hex-encoded public key
    * 2. label     (string, optional, default="") An optional label
    * 3. rescan    (boolean, optional, default=true) Rescan the wallet for transactions
    * 
    * Result:
    * null    (json null)
    * 
    * Examples:
    * 
    * Import a public key with rescan
    * > bitcoin-cli importpubkey "mypubkey"
    * 
    * Import using a label without rescan
    * > bitcoin-cli importpubkey "mypubkey" "testing" false
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "importpubkey", "params": ["mypubkey", "testing", false]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object importpubkey(Object pubkey, Object label) { return importpubkey.invoke(pubkey, label); }


   /**
    * importpubkey "pubkey" ( "label" rescan )
    * 
    * Adds a public key (in hex) that can be watched as if it were in your wallet but cannot be used to spend. Requires a new wallet backup.
    * Hint: use importmulti to import more than one public key.
    * 
    * Note: This call can take over an hour to complete if rescan is true, during that time, other rpc calls
    * may report that the imported pubkey exists but related transactions are still missing, leading to temporarily incorrect/bogus balances and unspent outputs until rescan completes.
    * Note: Use "getwalletinfo" to query the scanning progress.
    * 
    * Arguments:
    * 1. pubkey    (string, required) The hex-encoded public key
    * 2. label     (string, optional, default="") An optional label
    * 3. rescan    (boolean, optional, default=true) Rescan the wallet for transactions
    * 
    * Result:
    * null    (json null)
    * 
    * Examples:
    * 
    * Import a public key with rescan
    * > bitcoin-cli importpubkey "mypubkey"
    * 
    * Import using a label without rescan
    * > bitcoin-cli importpubkey "mypubkey" "testing" false
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "importpubkey", "params": ["mypubkey", "testing", false]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object importpubkey(Object pubkey, Object label, Object rescan) { return importpubkey.invoke(pubkey, label, rescan); }

   /**
    * rescanblockchain ( start_height stop_height )
    * 
    * Rescan the local blockchain for wallet related transactions.
    * Note: Use "getwalletinfo" to query the scanning progress.
    * 
    * Arguments:
    * 1. start_height    (numeric, optional, default=0) block height where the rescan should start
    * 2. stop_height     (numeric, optional) the last block height that should be scanned. If none is provided it will rescan up to the tip at return time of this call.
    * 
    * Result:
    * {                        (json object)
    *   "start_height" : n,    (numeric) The block height where the rescan started (the requested height or 0)
    *   "stop_height" : n      (numeric) The height of the last rescanned block. May be null in rare cases if there was a reorg and the call didn't scan any blocks because they were already scanned in the background.
    * }
    * 
    * Examples:
    * > bitcoin-cli rescanblockchain 100000 120000
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "rescanblockchain", "params": [100000, 120000]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object rescanblockchain() { return rescanblockchain.invoke(); }


   /**
    * rescanblockchain ( start_height stop_height )
    * 
    * Rescan the local blockchain for wallet related transactions.
    * Note: Use "getwalletinfo" to query the scanning progress.
    * 
    * Arguments:
    * 1. start_height    (numeric, optional, default=0) block height where the rescan should start
    * 2. stop_height     (numeric, optional) the last block height that should be scanned. If none is provided it will rescan up to the tip at return time of this call.
    * 
    * Result:
    * {                        (json object)
    *   "start_height" : n,    (numeric) The block height where the rescan started (the requested height or 0)
    *   "stop_height" : n      (numeric) The height of the last rescanned block. May be null in rare cases if there was a reorg and the call didn't scan any blocks because they were already scanned in the background.
    * }
    * 
    * Examples:
    * > bitcoin-cli rescanblockchain 100000 120000
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "rescanblockchain", "params": [100000, 120000]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object rescanblockchain(Object start_height) { return rescanblockchain.invoke(start_height); }


   /**
    * rescanblockchain ( start_height stop_height )
    * 
    * Rescan the local blockchain for wallet related transactions.
    * Note: Use "getwalletinfo" to query the scanning progress.
    * 
    * Arguments:
    * 1. start_height    (numeric, optional, default=0) block height where the rescan should start
    * 2. stop_height     (numeric, optional) the last block height that should be scanned. If none is provided it will rescan up to the tip at return time of this call.
    * 
    * Result:
    * {                        (json object)
    *   "start_height" : n,    (numeric) The block height where the rescan started (the requested height or 0)
    *   "stop_height" : n      (numeric) The height of the last rescanned block. May be null in rare cases if there was a reorg and the call didn't scan any blocks because they were already scanned in the background.
    * }
    * 
    * Examples:
    * > bitcoin-cli rescanblockchain 100000 120000
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "rescanblockchain", "params": [100000, 120000]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object rescanblockchain(Object start_height, Object stop_height) { return rescanblockchain.invoke(start_height, stop_height); }

   /**
    * getnettotals
    * 
    * Returns information about network traffic, including bytes in, bytes out,
    * and current time.
    * 
    * Result:
    * {                                              (json object)
    *   "totalbytesrecv" : n,                        (numeric) Total bytes received
    *   "totalbytessent" : n,                        (numeric) Total bytes sent
    *   "timemillis" : xxx,                          (numeric) Current UNIX epoch time in milliseconds
    *   "uploadtarget" : {                           (json object)
    *     "timeframe" : n,                           (numeric) Length of the measuring timeframe in seconds
    *     "target" : n,                              (numeric) Target in bytes
    *     "target_reached" : true|false,             (boolean) True if target is reached
    *     "serve_historical_blocks" : true|false,    (boolean) True if serving historical blocks
    *     "bytes_left_in_cycle" : n,                 (numeric) Bytes left in current time cycle
    *     "time_left_in_cycle" : n                   (numeric) Seconds left in current time cycle
    *   }
    * }
    * 
    * Examples:
    * > bitcoin-cli getnettotals 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getnettotals", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getnettotals() { return getnettotals.invoke(); }

   /**
    * getpeerinfo
    * 
    * Returns data about each connected network node as a json array of objects.
    * 
    * Result:
    * [                                     (json array)
    *   {                                   (json object)
    *     "id" : n,                         (numeric) Peer index
    *     "addr" : "str",                   (string) (host:port) The IP address and port of the peer
    *     "addrbind" : "str",               (string) (ip:port) Bind address of the connection to the peer
    *     "addrlocal" : "str",              (string) (ip:port) Local address as reported by the peer
    *     "network" : "str",                (string) Network (ipv4, ipv6, onion, i2p, not_publicly_routable)
    *     "mapped_as" : n,                  (numeric) The AS in the BGP route to the peer used for diversifying
    *                                       peer selection (only available if the asmap config flag is set)
    *     "services" : "hex",               (string) The services offered
    *     "servicesnames" : [               (json array) the services offered, in human-readable form
    *       "str",                          (string) the service name if it is recognised
    *       ...
    *     ],
    *     "relaytxes" : true|false,         (boolean) Whether peer has asked us to relay transactions to it
    *     "lastsend" : xxx,                 (numeric) The UNIX epoch time of the last send
    *     "lastrecv" : xxx,                 (numeric) The UNIX epoch time of the last receive
    *     "last_transaction" : xxx,         (numeric) The UNIX epoch time of the last valid transaction received from this peer
    *     "last_block" : xxx,               (numeric) The UNIX epoch time of the last block received from this peer
    *     "bytessent" : n,                  (numeric) The total bytes sent
    *     "bytesrecv" : n,                  (numeric) The total bytes received
    *     "conntime" : xxx,                 (numeric) The UNIX epoch time of the connection
    *     "timeoffset" : n,                 (numeric) The time offset in seconds
    *     "pingtime" : n,                   (numeric) ping time (if available)
    *     "minping" : n,                    (numeric) minimum observed ping time (if any at all)
    *     "pingwait" : n,                   (numeric) ping wait (if non-zero)
    *     "version" : n,                    (numeric) The peer version, such as 70001
    *     "subver" : "str",                 (string) The string version
    *     "inbound" : true|false,           (boolean) Inbound (true) or Outbound (false)
    *     "bip152_hb_to" : true|false,      (boolean) Whether we selected peer as (compact blocks) high-bandwidth peer
    *     "bip152_hb_from" : true|false,    (boolean) Whether peer selected us as (compact blocks) high-bandwidth peer
    *     "startingheight" : n,             (numeric) The starting height (block) of the peer
    *     "synced_headers" : n,             (numeric) The last header we have in common with this peer
    *     "synced_blocks" : n,              (numeric) The last block we have in common with this peer
    *     "inflight" : [                    (json array)
    *       n,                              (numeric) The heights of blocks we're currently asking from this peer
    *       ...
    *     ],
    *     "permissions" : [                 (json array) Any special permissions that have been granted to this peer
    *       "str",                          (string) bloomfilter (allow requesting BIP37 filtered blocks and transactions),
    *                                       noban (do not ban for misbehavior; implies download),
    *                                       forcerelay (relay transactions that are already in the mempool; implies relay),
    *                                       relay (relay even in -blocksonly mode, and unlimited transaction announcements),
    *                                       mempool (allow requesting BIP35 mempool contents),
    *                                       download (allow getheaders during IBD, no disconnect after maxuploadtarget limit),
    *                                       addr (responses to GETADDR avoid hitting the cache and contain random records with the most up-to-date info).
    *                                       
    *       ...
    *     ],
    *     "minfeefilter" : n,               (numeric) The minimum fee rate for transactions this peer accepts
    *     "bytessent_per_msg" : {           (json object)
    *       "msg" : n,                      (numeric) The total bytes sent aggregated by message type
    *                                       When a message type is not listed in this json object, the bytes sent are 0.
    *                                       Only known message types can appear as keys in the object.
    *       ...
    *     },
    *     "bytesrecv_per_msg" : {           (json object)
    *       "msg" : n,                      (numeric) The total bytes received aggregated by message type
    *                                       When a message type is not listed in this json object, the bytes received are 0.
    *                                       Only known message types can appear as keys in the object and all bytes received
    *                                       of unknown message types are listed under '*other*'.
    *       ...
    *     },
    *     "connection_type" : "str"         (string) Type of connection: 
    *                                       outbound-full-relay (default automatic connections),
    *                                       block-relay-only (does not relay transactions or addresses),
    *                                       inbound (initiated by the peer),
    *                                       manual (added via addnode RPC or -addnode/-connect configuration options),
    *                                       addr-fetch (short-lived automatic connection for soliciting addresses),
    *                                       feeler (short-lived automatic connection for testing addresses).
    *                                       Please note this output is unlikely to be stable in upcoming releases as we iterate to
    *                                       best capture connection behaviors.
    *   },
    *   ...
    * ]
    * 
    * Examples:
    * > bitcoin-cli getpeerinfo 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getpeerinfo", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getpeerinfo() { return getpeerinfo.invoke(); }

   /**
    * abortrescan
    * 
    * Stops current wallet rescan triggered by an RPC call, e.g. by an importprivkey call.
    * Note: Use "getwalletinfo" to query the scanning progress.
    * 
    * Result:
    * true|false    (boolean) Whether the abort was successful
    * 
    * Examples:
    * 
    * Import a private key
    * > bitcoin-cli importprivkey "mykey"
    * 
    * Abort the running wallet rescan
    * > bitcoin-cli abortrescan 
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "abortrescan", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object abortrescan() { return abortrescan.invoke(); }

   /**
    * getmempooldescendants "txid" ( verbose )
    * 
    * If txid is in the mempool, returns all in-mempool descendants.
    * 
    * Arguments:
    * 1. txid       (string, required) The transaction id (must be in mempool)
    * 2. verbose    (boolean, optional, default=false) True for a json object, false for array of transaction ids
    * 
    * Result (for verbose = false):
    * [           (json array)
    *   "hex",    (string) The transaction id of an in-mempool descendant transaction
    *   ...
    * ]
    * 
    * Result (for verbose = true):
    * {                                         (json object)
    *   "transactionid" : {                     (json object)
    *     "vsize" : n,                          (numeric) virtual transaction size as defined in BIP 141. This is different from actual serialized size for witness transactions as witness data is discounted.
    *     "weight" : n,                         (numeric) transaction weight as defined in BIP 141.
    *     "fee" : n,                            (numeric) transaction fee in BTC (DEPRECATED)
    *     "modifiedfee" : n,                    (numeric) transaction fee with fee deltas used for mining priority (DEPRECATED)
    *     "time" : xxx,                         (numeric) local time transaction entered pool in seconds since 1 Jan 1970 GMT
    *     "height" : n,                         (numeric) block height when transaction entered pool
    *     "descendantcount" : n,                (numeric) number of in-mempool descendant transactions (including this one)
    *     "descendantsize" : n,                 (numeric) virtual transaction size of in-mempool descendants (including this one)
    *     "descendantfees" : n,                 (numeric) modified fees (see above) of in-mempool descendants (including this one) (DEPRECATED)
    *     "ancestorcount" : n,                  (numeric) number of in-mempool ancestor transactions (including this one)
    *     "ancestorsize" : n,                   (numeric) virtual transaction size of in-mempool ancestors (including this one)
    *     "ancestorfees" : n,                   (numeric) modified fees (see above) of in-mempool ancestors (including this one) (DEPRECATED)
    *     "wtxid" : "hex",                      (string) hash of serialized transaction, including witness data
    *     "fees" : {                            (json object)
    *       "base" : n,                         (numeric) transaction fee in BTC
    *       "modified" : n,                     (numeric) transaction fee with fee deltas used for mining priority in BTC
    *       "ancestor" : n,                     (numeric) modified fees (see above) of in-mempool ancestors (including this one) in BTC
    *       "descendant" : n                    (numeric) modified fees (see above) of in-mempool descendants (including this one) in BTC
    *     },
    *     "depends" : [                         (json array) unconfirmed transactions used as inputs for this transaction
    *       "hex",                              (string) parent transaction id
    *       ...
    *     ],
    *     "spentby" : [                         (json array) unconfirmed transactions spending outputs from this transaction
    *       "hex",                              (string) child transaction id
    *       ...
    *     ],
    *     "bip125-replaceable" : true|false,    (boolean) Whether this transaction could be replaced due to BIP125 (replace-by-fee)
    *     "unbroadcast" : true|false            (boolean) Whether this transaction is currently unbroadcast (initial broadcast not yet acknowledged by any peers)
    *   },
    *   ...
    * }
    * 
    * Examples:
    * > bitcoin-cli getmempooldescendants "mytxid"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getmempooldescendants", "params": ["mytxid"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getmempooldescendants(Object txid) { return getmempooldescendants.invoke(txid); }


   /**
    * getmempooldescendants "txid" ( verbose )
    * 
    * If txid is in the mempool, returns all in-mempool descendants.
    * 
    * Arguments:
    * 1. txid       (string, required) The transaction id (must be in mempool)
    * 2. verbose    (boolean, optional, default=false) True for a json object, false for array of transaction ids
    * 
    * Result (for verbose = false):
    * [           (json array)
    *   "hex",    (string) The transaction id of an in-mempool descendant transaction
    *   ...
    * ]
    * 
    * Result (for verbose = true):
    * {                                         (json object)
    *   "transactionid" : {                     (json object)
    *     "vsize" : n,                          (numeric) virtual transaction size as defined in BIP 141. This is different from actual serialized size for witness transactions as witness data is discounted.
    *     "weight" : n,                         (numeric) transaction weight as defined in BIP 141.
    *     "fee" : n,                            (numeric) transaction fee in BTC (DEPRECATED)
    *     "modifiedfee" : n,                    (numeric) transaction fee with fee deltas used for mining priority (DEPRECATED)
    *     "time" : xxx,                         (numeric) local time transaction entered pool in seconds since 1 Jan 1970 GMT
    *     "height" : n,                         (numeric) block height when transaction entered pool
    *     "descendantcount" : n,                (numeric) number of in-mempool descendant transactions (including this one)
    *     "descendantsize" : n,                 (numeric) virtual transaction size of in-mempool descendants (including this one)
    *     "descendantfees" : n,                 (numeric) modified fees (see above) of in-mempool descendants (including this one) (DEPRECATED)
    *     "ancestorcount" : n,                  (numeric) number of in-mempool ancestor transactions (including this one)
    *     "ancestorsize" : n,                   (numeric) virtual transaction size of in-mempool ancestors (including this one)
    *     "ancestorfees" : n,                   (numeric) modified fees (see above) of in-mempool ancestors (including this one) (DEPRECATED)
    *     "wtxid" : "hex",                      (string) hash of serialized transaction, including witness data
    *     "fees" : {                            (json object)
    *       "base" : n,                         (numeric) transaction fee in BTC
    *       "modified" : n,                     (numeric) transaction fee with fee deltas used for mining priority in BTC
    *       "ancestor" : n,                     (numeric) modified fees (see above) of in-mempool ancestors (including this one) in BTC
    *       "descendant" : n                    (numeric) modified fees (see above) of in-mempool descendants (including this one) in BTC
    *     },
    *     "depends" : [                         (json array) unconfirmed transactions used as inputs for this transaction
    *       "hex",                              (string) parent transaction id
    *       ...
    *     ],
    *     "spentby" : [                         (json array) unconfirmed transactions spending outputs from this transaction
    *       "hex",                              (string) child transaction id
    *       ...
    *     ],
    *     "bip125-replaceable" : true|false,    (boolean) Whether this transaction could be replaced due to BIP125 (replace-by-fee)
    *     "unbroadcast" : true|false            (boolean) Whether this transaction is currently unbroadcast (initial broadcast not yet acknowledged by any peers)
    *   },
    *   ...
    * }
    * 
    * Examples:
    * > bitcoin-cli getmempooldescendants "mytxid"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getmempooldescendants", "params": ["mytxid"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getmempooldescendants(Object txid, Object verbose) { return getmempooldescendants.invoke(txid, verbose); }

   /**
    * walletprocesspsbt "psbt" ( sign "sighashtype" bip32derivs )
    * 
    * Update a PSBT with input information from our wallet and then sign inputs
    * that we can sign for.
    * Requires wallet passphrase to be set with walletpassphrase call if wallet is encrypted.
    * 
    * Arguments:
    * 1. psbt           (string, required) The transaction base64 string
    * 2. sign           (boolean, optional, default=true) Also sign the transaction when updating
    * 3. sighashtype    (string, optional, default="DEFAULT") The signature hash type to sign with if not specified by the PSBT. Must be one of
    *                   "DEFAULT"
    *                   "ALL"
    *                   "NONE"
    *                   "SINGLE"
    *                   "ALL|ANYONECANPAY"
    *                   "NONE|ANYONECANPAY"
    *                   "SINGLE|ANYONECANPAY"
    * 4. bip32derivs    (boolean, optional, default=true) Include BIP 32 derivation paths for public keys if we know them
    * 
    * Result:
    * {                             (json object)
    *   "psbt" : "str",             (string) The base64-encoded partially signed transaction
    *   "complete" : true|false     (boolean) If the transaction has a complete set of signatures
    * }
    * 
    * Examples:
    * > bitcoin-cli walletprocesspsbt "psbt"
    */
   public Object walletprocesspsbt(Object psbt) { return walletprocesspsbt.invoke(psbt); }


   /**
    * walletprocesspsbt "psbt" ( sign "sighashtype" bip32derivs )
    * 
    * Update a PSBT with input information from our wallet and then sign inputs
    * that we can sign for.
    * Requires wallet passphrase to be set with walletpassphrase call if wallet is encrypted.
    * 
    * Arguments:
    * 1. psbt           (string, required) The transaction base64 string
    * 2. sign           (boolean, optional, default=true) Also sign the transaction when updating
    * 3. sighashtype    (string, optional, default="DEFAULT") The signature hash type to sign with if not specified by the PSBT. Must be one of
    *                   "DEFAULT"
    *                   "ALL"
    *                   "NONE"
    *                   "SINGLE"
    *                   "ALL|ANYONECANPAY"
    *                   "NONE|ANYONECANPAY"
    *                   "SINGLE|ANYONECANPAY"
    * 4. bip32derivs    (boolean, optional, default=true) Include BIP 32 derivation paths for public keys if we know them
    * 
    * Result:
    * {                             (json object)
    *   "psbt" : "str",             (string) The base64-encoded partially signed transaction
    *   "complete" : true|false     (boolean) If the transaction has a complete set of signatures
    * }
    * 
    * Examples:
    * > bitcoin-cli walletprocesspsbt "psbt"
    */
   public Object walletprocesspsbt(Object psbt, Object sign) { return walletprocesspsbt.invoke(psbt, sign); }


   /**
    * walletprocesspsbt "psbt" ( sign "sighashtype" bip32derivs )
    * 
    * Update a PSBT with input information from our wallet and then sign inputs
    * that we can sign for.
    * Requires wallet passphrase to be set with walletpassphrase call if wallet is encrypted.
    * 
    * Arguments:
    * 1. psbt           (string, required) The transaction base64 string
    * 2. sign           (boolean, optional, default=true) Also sign the transaction when updating
    * 3. sighashtype    (string, optional, default="DEFAULT") The signature hash type to sign with if not specified by the PSBT. Must be one of
    *                   "DEFAULT"
    *                   "ALL"
    *                   "NONE"
    *                   "SINGLE"
    *                   "ALL|ANYONECANPAY"
    *                   "NONE|ANYONECANPAY"
    *                   "SINGLE|ANYONECANPAY"
    * 4. bip32derivs    (boolean, optional, default=true) Include BIP 32 derivation paths for public keys if we know them
    * 
    * Result:
    * {                             (json object)
    *   "psbt" : "str",             (string) The base64-encoded partially signed transaction
    *   "complete" : true|false     (boolean) If the transaction has a complete set of signatures
    * }
    * 
    * Examples:
    * > bitcoin-cli walletprocesspsbt "psbt"
    */
   public Object walletprocesspsbt(Object psbt, Object sign, Object sighashtype) { return walletprocesspsbt.invoke(psbt, sign, sighashtype); }


   /**
    * walletprocesspsbt "psbt" ( sign "sighashtype" bip32derivs )
    * 
    * Update a PSBT with input information from our wallet and then sign inputs
    * that we can sign for.
    * Requires wallet passphrase to be set with walletpassphrase call if wallet is encrypted.
    * 
    * Arguments:
    * 1. psbt           (string, required) The transaction base64 string
    * 2. sign           (boolean, optional, default=true) Also sign the transaction when updating
    * 3. sighashtype    (string, optional, default="DEFAULT") The signature hash type to sign with if not specified by the PSBT. Must be one of
    *                   "DEFAULT"
    *                   "ALL"
    *                   "NONE"
    *                   "SINGLE"
    *                   "ALL|ANYONECANPAY"
    *                   "NONE|ANYONECANPAY"
    *                   "SINGLE|ANYONECANPAY"
    * 4. bip32derivs    (boolean, optional, default=true) Include BIP 32 derivation paths for public keys if we know them
    * 
    * Result:
    * {                             (json object)
    *   "psbt" : "str",             (string) The base64-encoded partially signed transaction
    *   "complete" : true|false     (boolean) If the transaction has a complete set of signatures
    * }
    * 
    * Examples:
    * > bitcoin-cli walletprocesspsbt "psbt"
    */
   public Object walletprocesspsbt(Object psbt, Object sign, Object sighashtype, Object bip32derivs) { return walletprocesspsbt.invoke(psbt, sign, sighashtype, bip32derivs); }

   /**
    * getmempoolinfo
    * 
    * Returns details on the active state of the TX memory pool.
    * 
    * Result:
    * {                            (json object)
    *   "loaded" : true|false,     (boolean) True if the mempool is fully loaded
    *   "size" : n,                (numeric) Current tx count
    *   "bytes" : n,               (numeric) Sum of all virtual transaction sizes as defined in BIP 141. Differs from actual serialized size because witness data is discounted
    *   "usage" : n,               (numeric) Total memory usage for the mempool
    *   "total_fee" : n,           (numeric) Total fees for the mempool in BTC, ignoring modified fees through prioritizetransaction
    *   "maxmempool" : n,          (numeric) Maximum memory usage for the mempool
    *   "mempoolminfee" : n,       (numeric) Minimum fee rate in BTC/kvB for tx to be accepted. Is the maximum of minrelaytxfee and minimum mempool fee
    *   "minrelaytxfee" : n,       (numeric) Current minimum relay fee for transactions
    *   "unbroadcastcount" : n     (numeric) Current number of transactions that haven't passed initial broadcast yet
    * }
    * 
    * Examples:
    * > bitcoin-cli getmempoolinfo 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getmempoolinfo", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getmempoolinfo() { return getmempoolinfo.invoke(); }

   /**
    * createwallet "wallet_name" ( disable_private_keys blank "passphrase" avoid_reuse descriptors load_on_startup external_signer )
    * 
    * Creates and loads a new wallet.
    * 
    * Arguments:
    * 1. wallet_name             (string, required) The name for the new wallet. If this is a path, the wallet will be created at the path location.
    * 2. disable_private_keys    (boolean, optional, default=false) Disable the possibility of private keys (only watchonlys are possible in this mode).
    * 3. blank                   (boolean, optional, default=false) Create a blank wallet. A blank wallet has no keys or HD seed. One can be set using sethdseed.
    * 4. passphrase              (string, optional) Encrypt the wallet with this passphrase.
    * 5. avoid_reuse             (boolean, optional, default=false) Keep track of coin reuse, and treat dirty and clean coins differently with privacy considerations in mind.
    * 6. descriptors             (boolean, optional, default=false) Create a native descriptor wallet. The wallet will use descriptors internally to handle address creation
    * 7. load_on_startup         (boolean, optional) Save wallet name to persistent settings and load on startup. True to add wallet to startup list, false to remove, null to leave unchanged.
    * 8. external_signer         (boolean, optional, default=false) Use an external signer such as a hardware wallet. Requires -signer to be configured. Wallet creation will fail if keys cannot be fetched. Requires disable_private_keys and descriptors set to true.
    * 
    * Result:
    * {                       (json object)
    *   "name" : "str",       (string) The wallet name if created successfully. If the wallet was created using a full path, the wallet_name will be the full path.
    *   "warning" : "str"     (string) Warning message if wallet was not loaded cleanly.
    * }
    * 
    * Examples:
    * > bitcoin-cli createwallet "testwallet"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "createwallet", "params": ["testwallet"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > bitcoin-cli -named createwallet wallet_name=descriptors avoid_reuse=true descriptors=true load_on_startup=true
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "createwallet", "params": {"wallet_name":"descriptors","avoid_reuse":true,"descriptors":true,"load_on_startup":true}}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object createwallet(Object wallet_name) { return createwallet.invoke(wallet_name); }


   /**
    * createwallet "wallet_name" ( disable_private_keys blank "passphrase" avoid_reuse descriptors load_on_startup external_signer )
    * 
    * Creates and loads a new wallet.
    * 
    * Arguments:
    * 1. wallet_name             (string, required) The name for the new wallet. If this is a path, the wallet will be created at the path location.
    * 2. disable_private_keys    (boolean, optional, default=false) Disable the possibility of private keys (only watchonlys are possible in this mode).
    * 3. blank                   (boolean, optional, default=false) Create a blank wallet. A blank wallet has no keys or HD seed. One can be set using sethdseed.
    * 4. passphrase              (string, optional) Encrypt the wallet with this passphrase.
    * 5. avoid_reuse             (boolean, optional, default=false) Keep track of coin reuse, and treat dirty and clean coins differently with privacy considerations in mind.
    * 6. descriptors             (boolean, optional, default=false) Create a native descriptor wallet. The wallet will use descriptors internally to handle address creation
    * 7. load_on_startup         (boolean, optional) Save wallet name to persistent settings and load on startup. True to add wallet to startup list, false to remove, null to leave unchanged.
    * 8. external_signer         (boolean, optional, default=false) Use an external signer such as a hardware wallet. Requires -signer to be configured. Wallet creation will fail if keys cannot be fetched. Requires disable_private_keys and descriptors set to true.
    * 
    * Result:
    * {                       (json object)
    *   "name" : "str",       (string) The wallet name if created successfully. If the wallet was created using a full path, the wallet_name will be the full path.
    *   "warning" : "str"     (string) Warning message if wallet was not loaded cleanly.
    * }
    * 
    * Examples:
    * > bitcoin-cli createwallet "testwallet"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "createwallet", "params": ["testwallet"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > bitcoin-cli -named createwallet wallet_name=descriptors avoid_reuse=true descriptors=true load_on_startup=true
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "createwallet", "params": {"wallet_name":"descriptors","avoid_reuse":true,"descriptors":true,"load_on_startup":true}}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object createwallet(Object wallet_name, Object disable_private_keys) { return createwallet.invoke(wallet_name, disable_private_keys); }


   /**
    * createwallet "wallet_name" ( disable_private_keys blank "passphrase" avoid_reuse descriptors load_on_startup external_signer )
    * 
    * Creates and loads a new wallet.
    * 
    * Arguments:
    * 1. wallet_name             (string, required) The name for the new wallet. If this is a path, the wallet will be created at the path location.
    * 2. disable_private_keys    (boolean, optional, default=false) Disable the possibility of private keys (only watchonlys are possible in this mode).
    * 3. blank                   (boolean, optional, default=false) Create a blank wallet. A blank wallet has no keys or HD seed. One can be set using sethdseed.
    * 4. passphrase              (string, optional) Encrypt the wallet with this passphrase.
    * 5. avoid_reuse             (boolean, optional, default=false) Keep track of coin reuse, and treat dirty and clean coins differently with privacy considerations in mind.
    * 6. descriptors             (boolean, optional, default=false) Create a native descriptor wallet. The wallet will use descriptors internally to handle address creation
    * 7. load_on_startup         (boolean, optional) Save wallet name to persistent settings and load on startup. True to add wallet to startup list, false to remove, null to leave unchanged.
    * 8. external_signer         (boolean, optional, default=false) Use an external signer such as a hardware wallet. Requires -signer to be configured. Wallet creation will fail if keys cannot be fetched. Requires disable_private_keys and descriptors set to true.
    * 
    * Result:
    * {                       (json object)
    *   "name" : "str",       (string) The wallet name if created successfully. If the wallet was created using a full path, the wallet_name will be the full path.
    *   "warning" : "str"     (string) Warning message if wallet was not loaded cleanly.
    * }
    * 
    * Examples:
    * > bitcoin-cli createwallet "testwallet"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "createwallet", "params": ["testwallet"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > bitcoin-cli -named createwallet wallet_name=descriptors avoid_reuse=true descriptors=true load_on_startup=true
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "createwallet", "params": {"wallet_name":"descriptors","avoid_reuse":true,"descriptors":true,"load_on_startup":true}}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object createwallet(Object wallet_name, Object disable_private_keys, Object blank) { return createwallet.invoke(wallet_name, disable_private_keys, blank); }


   /**
    * createwallet "wallet_name" ( disable_private_keys blank "passphrase" avoid_reuse descriptors load_on_startup external_signer )
    * 
    * Creates and loads a new wallet.
    * 
    * Arguments:
    * 1. wallet_name             (string, required) The name for the new wallet. If this is a path, the wallet will be created at the path location.
    * 2. disable_private_keys    (boolean, optional, default=false) Disable the possibility of private keys (only watchonlys are possible in this mode).
    * 3. blank                   (boolean, optional, default=false) Create a blank wallet. A blank wallet has no keys or HD seed. One can be set using sethdseed.
    * 4. passphrase              (string, optional) Encrypt the wallet with this passphrase.
    * 5. avoid_reuse             (boolean, optional, default=false) Keep track of coin reuse, and treat dirty and clean coins differently with privacy considerations in mind.
    * 6. descriptors             (boolean, optional, default=false) Create a native descriptor wallet. The wallet will use descriptors internally to handle address creation
    * 7. load_on_startup         (boolean, optional) Save wallet name to persistent settings and load on startup. True to add wallet to startup list, false to remove, null to leave unchanged.
    * 8. external_signer         (boolean, optional, default=false) Use an external signer such as a hardware wallet. Requires -signer to be configured. Wallet creation will fail if keys cannot be fetched. Requires disable_private_keys and descriptors set to true.
    * 
    * Result:
    * {                       (json object)
    *   "name" : "str",       (string) The wallet name if created successfully. If the wallet was created using a full path, the wallet_name will be the full path.
    *   "warning" : "str"     (string) Warning message if wallet was not loaded cleanly.
    * }
    * 
    * Examples:
    * > bitcoin-cli createwallet "testwallet"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "createwallet", "params": ["testwallet"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > bitcoin-cli -named createwallet wallet_name=descriptors avoid_reuse=true descriptors=true load_on_startup=true
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "createwallet", "params": {"wallet_name":"descriptors","avoid_reuse":true,"descriptors":true,"load_on_startup":true}}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object createwallet(Object wallet_name, Object disable_private_keys, Object blank, Object passphrase) { return createwallet.invoke(wallet_name, disable_private_keys, blank, passphrase); }


   /**
    * createwallet "wallet_name" ( disable_private_keys blank "passphrase" avoid_reuse descriptors load_on_startup external_signer )
    * 
    * Creates and loads a new wallet.
    * 
    * Arguments:
    * 1. wallet_name             (string, required) The name for the new wallet. If this is a path, the wallet will be created at the path location.
    * 2. disable_private_keys    (boolean, optional, default=false) Disable the possibility of private keys (only watchonlys are possible in this mode).
    * 3. blank                   (boolean, optional, default=false) Create a blank wallet. A blank wallet has no keys or HD seed. One can be set using sethdseed.
    * 4. passphrase              (string, optional) Encrypt the wallet with this passphrase.
    * 5. avoid_reuse             (boolean, optional, default=false) Keep track of coin reuse, and treat dirty and clean coins differently with privacy considerations in mind.
    * 6. descriptors             (boolean, optional, default=false) Create a native descriptor wallet. The wallet will use descriptors internally to handle address creation
    * 7. load_on_startup         (boolean, optional) Save wallet name to persistent settings and load on startup. True to add wallet to startup list, false to remove, null to leave unchanged.
    * 8. external_signer         (boolean, optional, default=false) Use an external signer such as a hardware wallet. Requires -signer to be configured. Wallet creation will fail if keys cannot be fetched. Requires disable_private_keys and descriptors set to true.
    * 
    * Result:
    * {                       (json object)
    *   "name" : "str",       (string) The wallet name if created successfully. If the wallet was created using a full path, the wallet_name will be the full path.
    *   "warning" : "str"     (string) Warning message if wallet was not loaded cleanly.
    * }
    * 
    * Examples:
    * > bitcoin-cli createwallet "testwallet"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "createwallet", "params": ["testwallet"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > bitcoin-cli -named createwallet wallet_name=descriptors avoid_reuse=true descriptors=true load_on_startup=true
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "createwallet", "params": {"wallet_name":"descriptors","avoid_reuse":true,"descriptors":true,"load_on_startup":true}}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object createwallet(Object wallet_name, Object disable_private_keys, Object blank, Object passphrase, Object avoid_reuse) { return createwallet.invoke(wallet_name, disable_private_keys, blank, passphrase, avoid_reuse); }


   /**
    * createwallet "wallet_name" ( disable_private_keys blank "passphrase" avoid_reuse descriptors load_on_startup external_signer )
    * 
    * Creates and loads a new wallet.
    * 
    * Arguments:
    * 1. wallet_name             (string, required) The name for the new wallet. If this is a path, the wallet will be created at the path location.
    * 2. disable_private_keys    (boolean, optional, default=false) Disable the possibility of private keys (only watchonlys are possible in this mode).
    * 3. blank                   (boolean, optional, default=false) Create a blank wallet. A blank wallet has no keys or HD seed. One can be set using sethdseed.
    * 4. passphrase              (string, optional) Encrypt the wallet with this passphrase.
    * 5. avoid_reuse             (boolean, optional, default=false) Keep track of coin reuse, and treat dirty and clean coins differently with privacy considerations in mind.
    * 6. descriptors             (boolean, optional, default=false) Create a native descriptor wallet. The wallet will use descriptors internally to handle address creation
    * 7. load_on_startup         (boolean, optional) Save wallet name to persistent settings and load on startup. True to add wallet to startup list, false to remove, null to leave unchanged.
    * 8. external_signer         (boolean, optional, default=false) Use an external signer such as a hardware wallet. Requires -signer to be configured. Wallet creation will fail if keys cannot be fetched. Requires disable_private_keys and descriptors set to true.
    * 
    * Result:
    * {                       (json object)
    *   "name" : "str",       (string) The wallet name if created successfully. If the wallet was created using a full path, the wallet_name will be the full path.
    *   "warning" : "str"     (string) Warning message if wallet was not loaded cleanly.
    * }
    * 
    * Examples:
    * > bitcoin-cli createwallet "testwallet"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "createwallet", "params": ["testwallet"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > bitcoin-cli -named createwallet wallet_name=descriptors avoid_reuse=true descriptors=true load_on_startup=true
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "createwallet", "params": {"wallet_name":"descriptors","avoid_reuse":true,"descriptors":true,"load_on_startup":true}}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object createwallet(Object wallet_name, Object disable_private_keys, Object blank, Object passphrase, Object avoid_reuse, Object descriptors) { return createwallet.invoke(wallet_name, disable_private_keys, blank, passphrase, avoid_reuse, descriptors); }


   /**
    * createwallet "wallet_name" ( disable_private_keys blank "passphrase" avoid_reuse descriptors load_on_startup external_signer )
    * 
    * Creates and loads a new wallet.
    * 
    * Arguments:
    * 1. wallet_name             (string, required) The name for the new wallet. If this is a path, the wallet will be created at the path location.
    * 2. disable_private_keys    (boolean, optional, default=false) Disable the possibility of private keys (only watchonlys are possible in this mode).
    * 3. blank                   (boolean, optional, default=false) Create a blank wallet. A blank wallet has no keys or HD seed. One can be set using sethdseed.
    * 4. passphrase              (string, optional) Encrypt the wallet with this passphrase.
    * 5. avoid_reuse             (boolean, optional, default=false) Keep track of coin reuse, and treat dirty and clean coins differently with privacy considerations in mind.
    * 6. descriptors             (boolean, optional, default=false) Create a native descriptor wallet. The wallet will use descriptors internally to handle address creation
    * 7. load_on_startup         (boolean, optional) Save wallet name to persistent settings and load on startup. True to add wallet to startup list, false to remove, null to leave unchanged.
    * 8. external_signer         (boolean, optional, default=false) Use an external signer such as a hardware wallet. Requires -signer to be configured. Wallet creation will fail if keys cannot be fetched. Requires disable_private_keys and descriptors set to true.
    * 
    * Result:
    * {                       (json object)
    *   "name" : "str",       (string) The wallet name if created successfully. If the wallet was created using a full path, the wallet_name will be the full path.
    *   "warning" : "str"     (string) Warning message if wallet was not loaded cleanly.
    * }
    * 
    * Examples:
    * > bitcoin-cli createwallet "testwallet"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "createwallet", "params": ["testwallet"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > bitcoin-cli -named createwallet wallet_name=descriptors avoid_reuse=true descriptors=true load_on_startup=true
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "createwallet", "params": {"wallet_name":"descriptors","avoid_reuse":true,"descriptors":true,"load_on_startup":true}}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object createwallet(Object wallet_name, Object disable_private_keys, Object blank, Object passphrase, Object avoid_reuse, Object descriptors, Object load_on_startup) { return createwallet.invoke(wallet_name, disable_private_keys, blank, passphrase, avoid_reuse, descriptors, load_on_startup); }


   /**
    * createwallet "wallet_name" ( disable_private_keys blank "passphrase" avoid_reuse descriptors load_on_startup external_signer )
    * 
    * Creates and loads a new wallet.
    * 
    * Arguments:
    * 1. wallet_name             (string, required) The name for the new wallet. If this is a path, the wallet will be created at the path location.
    * 2. disable_private_keys    (boolean, optional, default=false) Disable the possibility of private keys (only watchonlys are possible in this mode).
    * 3. blank                   (boolean, optional, default=false) Create a blank wallet. A blank wallet has no keys or HD seed. One can be set using sethdseed.
    * 4. passphrase              (string, optional) Encrypt the wallet with this passphrase.
    * 5. avoid_reuse             (boolean, optional, default=false) Keep track of coin reuse, and treat dirty and clean coins differently with privacy considerations in mind.
    * 6. descriptors             (boolean, optional, default=false) Create a native descriptor wallet. The wallet will use descriptors internally to handle address creation
    * 7. load_on_startup         (boolean, optional) Save wallet name to persistent settings and load on startup. True to add wallet to startup list, false to remove, null to leave unchanged.
    * 8. external_signer         (boolean, optional, default=false) Use an external signer such as a hardware wallet. Requires -signer to be configured. Wallet creation will fail if keys cannot be fetched. Requires disable_private_keys and descriptors set to true.
    * 
    * Result:
    * {                       (json object)
    *   "name" : "str",       (string) The wallet name if created successfully. If the wallet was created using a full path, the wallet_name will be the full path.
    *   "warning" : "str"     (string) Warning message if wallet was not loaded cleanly.
    * }
    * 
    * Examples:
    * > bitcoin-cli createwallet "testwallet"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "createwallet", "params": ["testwallet"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    * > bitcoin-cli -named createwallet wallet_name=descriptors avoid_reuse=true descriptors=true load_on_startup=true
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "createwallet", "params": {"wallet_name":"descriptors","avoid_reuse":true,"descriptors":true,"load_on_startup":true}}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object createwallet(Object wallet_name, Object disable_private_keys, Object blank, Object passphrase, Object avoid_reuse, Object descriptors, Object load_on_startup, Object external_signe) { return createwallet.invoke(wallet_name, disable_private_keys, blank, passphrase, avoid_reuse, descriptors, load_on_startup, external_signe); }

   /**
    * utxoupdatepsbt "psbt" ( ["",{"desc":"str","range":n or [n,n]},...] )
    * 
    * Updates all segwit inputs and outputs in a PSBT with data from output descriptors, the UTXO set or the mempool.
    * 
    * Arguments:
    * 1. psbt                          (string, required) A base64 string of a PSBT
    * 2. descriptors                   (json array, optional) An array of either strings or objects
    *      [
    *        "",                       (string) An output descriptor
    *        {                         (json object) An object with an output descriptor and extra information
    *          "desc": "str",          (string, required) An output descriptor
    *          "range": n or [n,n],    (numeric or array, optional, default=1000) Up to what index HD chains should be explored (either end or [begin,end])
    *        },
    *        ...
    *      ]
    * 
    * Result:
    * "str"    (string) The base64-encoded partially signed transaction with inputs updated
    * 
    * Examples:
    * > bitcoin-cli utxoupdatepsbt "psbt"
    */
   public Object utxoupdatepsbt(Object psbt) { return utxoupdatepsbt.invoke(psbt); }


   /**
    * utxoupdatepsbt "psbt" ( ["",{"desc":"str","range":n or [n,n]},...] )
    * 
    * Updates all segwit inputs and outputs in a PSBT with data from output descriptors, the UTXO set or the mempool.
    * 
    * Arguments:
    * 1. psbt                          (string, required) A base64 string of a PSBT
    * 2. descriptors                   (json array, optional) An array of either strings or objects
    *      [
    *        "",                       (string) An output descriptor
    *        {                         (json object) An object with an output descriptor and extra information
    *          "desc": "str",          (string, required) An output descriptor
    *          "range": n or [n,n],    (numeric or array, optional, default=1000) Up to what index HD chains should be explored (either end or [begin,end])
    *        },
    *        ...
    *      ]
    * 
    * Result:
    * "str"    (string) The base64-encoded partially signed transaction with inputs updated
    * 
    * Examples:
    * > bitcoin-cli utxoupdatepsbt "psbt"
    */
   public Object utxoupdatepsbt(Object psbt, Object json) { return utxoupdatepsbt.invoke(psbt, json); }

   /**
    * deriveaddresses "descriptor" ( range )
    * 
    * Derives one or more addresses corresponding to an output descriptor.
    * Examples of output descriptors are:
    *     pkh(<pubkey>)                        P2PKH outputs for the given pubkey
    *     wpkh(<pubkey>)                       Native segwit P2PKH outputs for the given pubkey
    *     sh(multi(<n>,<pubkey>,<pubkey>,...)) P2SH-multisig outputs for the given threshold and pubkeys
    *     raw(<hex script>)                    Outputs whose scriptPubKey equals the specified hex scripts
    * 
    * In the above, <pubkey> either refers to a fixed public key in hexadecimal notation, or to an xpub/xprv optionally followed by one
    * or more path elements separated by "/", where "h" represents a hardened child key.
    * For more information on output descriptors, see the documentation in the doc/descriptors.md file.
    * 
    * Arguments:
    * 1. descriptor    (string, required) The descriptor.
    * 2. range         (numeric or array, optional) If a ranged descriptor is used, this specifies the end or the range (in [begin,end] notation) to derive.
    * 
    * Result:
    * [           (json array)
    *   "str",    (string) the derived addresses
    *   ...
    * ]
    * 
    * Examples:
    * First three native segwit receive addresses
    * > bitcoin-cli deriveaddresses "wpkh([d34db33f/84h/0h/0h]xpub6DJ2dNUysrn5Vt36jH2KLBT2i1auw1tTSSomg8PhqNiUtx8QX2SvC9nrHu81fT41fvDUnhMjEzQgXnQjKEu3oaqMSzhSrHMxyyoEAmUHQbY/0/*)#cjjspncu" "[0,2]"
    */
   public Object deriveaddresses(Object descriptor) { return deriveaddresses.invoke(descriptor); }


   /**
    * deriveaddresses "descriptor" ( range )
    * 
    * Derives one or more addresses corresponding to an output descriptor.
    * Examples of output descriptors are:
    *     pkh(<pubkey>)                        P2PKH outputs for the given pubkey
    *     wpkh(<pubkey>)                       Native segwit P2PKH outputs for the given pubkey
    *     sh(multi(<n>,<pubkey>,<pubkey>,...)) P2SH-multisig outputs for the given threshold and pubkeys
    *     raw(<hex script>)                    Outputs whose scriptPubKey equals the specified hex scripts
    * 
    * In the above, <pubkey> either refers to a fixed public key in hexadecimal notation, or to an xpub/xprv optionally followed by one
    * or more path elements separated by "/", where "h" represents a hardened child key.
    * For more information on output descriptors, see the documentation in the doc/descriptors.md file.
    * 
    * Arguments:
    * 1. descriptor    (string, required) The descriptor.
    * 2. range         (numeric or array, optional) If a ranged descriptor is used, this specifies the end or the range (in [begin,end] notation) to derive.
    * 
    * Result:
    * [           (json array)
    *   "str",    (string) the derived addresses
    *   ...
    * ]
    * 
    * Examples:
    * First three native segwit receive addresses
    * > bitcoin-cli deriveaddresses "wpkh([d34db33f/84h/0h/0h]xpub6DJ2dNUysrn5Vt36jH2KLBT2i1auw1tTSSomg8PhqNiUtx8QX2SvC9nrHu81fT41fvDUnhMjEzQgXnQjKEu3oaqMSzhSrHMxyyoEAmUHQbY/0/*)#cjjspncu" "[0,2]"
    */
   public Object deriveaddresses(Object descriptor, Object range) { return deriveaddresses.invoke(descriptor, range); }

   /**
    * getblocktemplate ( "template_request" )
    * 
    * If the request parameters include a 'mode' key, that is used to explicitly select between the default 'template' request or a 'proposal'.
    * It returns data needed to construct a block to work on.
    * For full specification, see BIPs 22, 23, 9, and 145:
    *     https://github.com/bitcoin/bips/blob/master/bip-0022.mediawiki
    *     https://github.com/bitcoin/bips/blob/master/bip-0023.mediawiki
    *     https://github.com/bitcoin/bips/blob/master/bip-0009.mediawiki#getblocktemplate_changes
    *     https://github.com/bitcoin/bips/blob/master/bip-0145.mediawiki
    * 
    * Arguments:
    * 1. template_request         (json object, optional, default={}) Format of the template
    *      {
    *        "mode": "str",       (string, optional) This must be set to "template", "proposal" (see BIP 23), or omitted
    *        "capabilities": [    (json array, optional) A list of strings
    *          "str",             (string) client side supported feature, 'longpoll', 'coinbasevalue', 'proposal', 'serverlist', 'workid'
    *          ...
    *        ],
    *        "rules": [           (json array, required) A list of strings
    *          "segwit",          (string, required) (literal) indicates client side segwit support
    *          "str",             (string) other client side supported softfork deployment
    *          ...
    *        ],
    *      }
    * 
    * Result (If the proposal was accepted with mode=='proposal'):
    * null    (json null)
    * 
    * Result (If the proposal was not accepted with mode=='proposal'):
    * "str"    (string) According to BIP22
    * 
    * Result (Otherwise):
    * {                                          (json object)
    *   "version" : n,                           (numeric) The preferred block version
    *   "rules" : [                              (json array) specific block rules that are to be enforced
    *     "str",                                 (string) name of a rule the client must understand to some extent; see BIP 9 for format
    *     ...
    *   ],
    *   "vbavailable" : {                        (json object) set of pending, supported versionbit (BIP 9) softfork deployments
    *     "rulename" : n,                        (numeric) identifies the bit number as indicating acceptance and readiness for the named softfork rule
    *     ...
    *   },
    *   "vbrequired" : n,                        (numeric) bit mask of versionbits the server requires set in submissions
    *   "previousblockhash" : "str",             (string) The hash of current highest block
    *   "transactions" : [                       (json array) contents of non-coinbase transactions that should be included in the next block
    *     {                                      (json object)
    *       "data" : "hex",                      (string) transaction data encoded in hexadecimal (byte-for-byte)
    *       "txid" : "hex",                      (string) transaction id encoded in little-endian hexadecimal
    *       "hash" : "hex",                      (string) hash encoded in little-endian hexadecimal (including witness data)
    *       "depends" : [                        (json array) array of numbers
    *         n,                                 (numeric) transactions before this one (by 1-based index in 'transactions' list) that must be present in the final block if this one is
    *         ...
    *       ],
    *       "fee" : n,                           (numeric) difference in value between transaction inputs and outputs (in satoshis); for coinbase transactions, this is a negative Number of the total collected block fees (ie, not including the block subsidy); if key is not present, fee is unknown and clients MUST NOT assume there isn't one
    *       "sigops" : n,                        (numeric) total SigOps cost, as counted for purposes of block limits; if key is not present, sigop cost is unknown and clients MUST NOT assume it is zero
    *       "weight" : n                         (numeric) total transaction weight, as counted for purposes of block limits
    *     },
    *     ...
    *   ],
    *   "coinbaseaux" : {                        (json object) data that should be included in the coinbase's scriptSig content
    *     "key" : "hex",                         (string) values must be in the coinbase (keys may be ignored)
    *     ...
    *   },
    *   "coinbasevalue" : n,                     (numeric) maximum allowable input to coinbase transaction, including the generation award and transaction fees (in satoshis)
    *   "longpollid" : "str",                    (string) an id to include with a request to longpoll on an update to this template
    *   "target" : "str",                        (string) The hash target
    *   "mintime" : xxx,                         (numeric) The minimum timestamp appropriate for the next block time, expressed in UNIX epoch time
    *   "mutable" : [                            (json array) list of ways the block template may be changed
    *     "str",                                 (string) A way the block template may be changed, e.g. 'time', 'transactions', 'prevblock'
    *     ...
    *   ],
    *   "noncerange" : "hex",                    (string) A range of valid nonces
    *   "sigoplimit" : n,                        (numeric) limit of sigops in blocks
    *   "sizelimit" : n,                         (numeric) limit of block size
    *   "weightlimit" : n,                       (numeric) limit of block weight
    *   "curtime" : xxx,                         (numeric) current timestamp in UNIX epoch time
    *   "bits" : "str",                          (string) compressed target of next block
    *   "height" : n,                            (numeric) The height of the next block
    *   "default_witness_commitment" : "str"     (string, optional) a valid witness commitment for the unmodified block template
    * }
    * 
    * Examples:
    * > bitcoin-cli getblocktemplate '{"rules": ["segwit"]}'
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getblocktemplate", "params": [{"rules": ["segwit"]}]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getblocktemplate() { return getblocktemplate.invoke(); }


   /**
    * getblocktemplate ( "template_request" )
    * 
    * If the request parameters include a 'mode' key, that is used to explicitly select between the default 'template' request or a 'proposal'.
    * It returns data needed to construct a block to work on.
    * For full specification, see BIPs 22, 23, 9, and 145:
    *     https://github.com/bitcoin/bips/blob/master/bip-0022.mediawiki
    *     https://github.com/bitcoin/bips/blob/master/bip-0023.mediawiki
    *     https://github.com/bitcoin/bips/blob/master/bip-0009.mediawiki#getblocktemplate_changes
    *     https://github.com/bitcoin/bips/blob/master/bip-0145.mediawiki
    * 
    * Arguments:
    * 1. template_request         (json object, optional, default={}) Format of the template
    *      {
    *        "mode": "str",       (string, optional) This must be set to "template", "proposal" (see BIP 23), or omitted
    *        "capabilities": [    (json array, optional) A list of strings
    *          "str",             (string) client side supported feature, 'longpoll', 'coinbasevalue', 'proposal', 'serverlist', 'workid'
    *          ...
    *        ],
    *        "rules": [           (json array, required) A list of strings
    *          "segwit",          (string, required) (literal) indicates client side segwit support
    *          "str",             (string) other client side supported softfork deployment
    *          ...
    *        ],
    *      }
    * 
    * Result (If the proposal was accepted with mode=='proposal'):
    * null    (json null)
    * 
    * Result (If the proposal was not accepted with mode=='proposal'):
    * "str"    (string) According to BIP22
    * 
    * Result (Otherwise):
    * {                                          (json object)
    *   "version" : n,                           (numeric) The preferred block version
    *   "rules" : [                              (json array) specific block rules that are to be enforced
    *     "str",                                 (string) name of a rule the client must understand to some extent; see BIP 9 for format
    *     ...
    *   ],
    *   "vbavailable" : {                        (json object) set of pending, supported versionbit (BIP 9) softfork deployments
    *     "rulename" : n,                        (numeric) identifies the bit number as indicating acceptance and readiness for the named softfork rule
    *     ...
    *   },
    *   "vbrequired" : n,                        (numeric) bit mask of versionbits the server requires set in submissions
    *   "previousblockhash" : "str",             (string) The hash of current highest block
    *   "transactions" : [                       (json array) contents of non-coinbase transactions that should be included in the next block
    *     {                                      (json object)
    *       "data" : "hex",                      (string) transaction data encoded in hexadecimal (byte-for-byte)
    *       "txid" : "hex",                      (string) transaction id encoded in little-endian hexadecimal
    *       "hash" : "hex",                      (string) hash encoded in little-endian hexadecimal (including witness data)
    *       "depends" : [                        (json array) array of numbers
    *         n,                                 (numeric) transactions before this one (by 1-based index in 'transactions' list) that must be present in the final block if this one is
    *         ...
    *       ],
    *       "fee" : n,                           (numeric) difference in value between transaction inputs and outputs (in satoshis); for coinbase transactions, this is a negative Number of the total collected block fees (ie, not including the block subsidy); if key is not present, fee is unknown and clients MUST NOT assume there isn't one
    *       "sigops" : n,                        (numeric) total SigOps cost, as counted for purposes of block limits; if key is not present, sigop cost is unknown and clients MUST NOT assume it is zero
    *       "weight" : n                         (numeric) total transaction weight, as counted for purposes of block limits
    *     },
    *     ...
    *   ],
    *   "coinbaseaux" : {                        (json object) data that should be included in the coinbase's scriptSig content
    *     "key" : "hex",                         (string) values must be in the coinbase (keys may be ignored)
    *     ...
    *   },
    *   "coinbasevalue" : n,                     (numeric) maximum allowable input to coinbase transaction, including the generation award and transaction fees (in satoshis)
    *   "longpollid" : "str",                    (string) an id to include with a request to longpoll on an update to this template
    *   "target" : "str",                        (string) The hash target
    *   "mintime" : xxx,                         (numeric) The minimum timestamp appropriate for the next block time, expressed in UNIX epoch time
    *   "mutable" : [                            (json array) list of ways the block template may be changed
    *     "str",                                 (string) A way the block template may be changed, e.g. 'time', 'transactions', 'prevblock'
    *     ...
    *   ],
    *   "noncerange" : "hex",                    (string) A range of valid nonces
    *   "sigoplimit" : n,                        (numeric) limit of sigops in blocks
    *   "sizelimit" : n,                         (numeric) limit of block size
    *   "weightlimit" : n,                       (numeric) limit of block weight
    *   "curtime" : xxx,                         (numeric) current timestamp in UNIX epoch time
    *   "bits" : "str",                          (string) compressed target of next block
    *   "height" : n,                            (numeric) The height of the next block
    *   "default_witness_commitment" : "str"     (string, optional) a valid witness commitment for the unmodified block template
    * }
    * 
    * Examples:
    * > bitcoin-cli getblocktemplate '{"rules": ["segwit"]}'
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getblocktemplate", "params": [{"rules": ["segwit"]}]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getblocktemplate(Object template_request) { return getblocktemplate.invoke(template_request); }

   /**
    * getdifficulty
    * 
    * Returns the proof-of-work difficulty as a multiple of the minimum difficulty.
    * 
    * Result:
    * n    (numeric) the proof-of-work difficulty as a multiple of the minimum difficulty.
    * 
    * Examples:
    * > bitcoin-cli getdifficulty 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getdifficulty", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getdifficulty() { return getdifficulty.invoke(); }

   /**
    * combinepsbt ["psbt",...]
    * 
    * Combine multiple partially signed Bitcoin transactions into one transaction.
    * Implements the Combiner role.
    * 
    * Arguments:
    * 1. txs            (json array, required) The base64 strings of partially signed transactions
    *      [
    *        "psbt",    (string) A base64 string of a PSBT
    *        ...
    *      ]
    * 
    * Result:
    * "str"    (string) The base64-encoded partially signed transaction
    * 
    * Examples:
    * > bitcoin-cli combinepsbt '["mybase64_1", "mybase64_2", "mybase64_3"]'
    */
   public Object combinepsbt(Object psbts) { return combinepsbt.invoke(psbts); }

   /**
    * getblock "blockhash" ( verbosity )
    * 
    * If verbosity is 0, returns a string that is serialized, hex-encoded data for block 'hash'.
    * If verbosity is 1, returns an Object with information about block <hash>.
    * If verbosity is 2, returns an Object with information about block <hash> and information about each transaction. 
    * 
    * Arguments:
    * 1. blockhash    (string, required) The block hash
    * 2. verbosity    (numeric, optional, default=1) 0 for hex-encoded data, 1 for a json object, and 2 for json object with transaction data
    * 
    * Result (for verbosity = 0):
    * "hex"    (string) A string that is serialized, hex-encoded data for block 'hash'
    * 
    * Result (for verbosity = 1):
    * {                                 (json object)
    *   "hash" : "hex",                 (string) the block hash (same as provided)
    *   "confirmations" : n,            (numeric) The number of confirmations, or -1 if the block is not on the main chain
    *   "size" : n,                     (numeric) The block size
    *   "strippedsize" : n,             (numeric) The block size excluding witness data
    *   "weight" : n,                   (numeric) The block weight as defined in BIP 141
    *   "height" : n,                   (numeric) The block height or index
    *   "version" : n,                  (numeric) The block version
    *   "versionHex" : "hex",           (string) The block version formatted in hexadecimal
    *   "merkleroot" : "hex",           (string) The merkle root
    *   "tx" : [                        (json array) The transaction ids
    *     "hex",                        (string) The transaction id
    *     ...
    *   ],
    *   "time" : xxx,                   (numeric) The block time expressed in UNIX epoch time
    *   "mediantime" : xxx,             (numeric) The median block time expressed in UNIX epoch time
    *   "nonce" : n,                    (numeric) The nonce
    *   "bits" : "hex",                 (string) The bits
    *   "difficulty" : n,               (numeric) The difficulty
    *   "chainwork" : "hex",            (string) Expected number of hashes required to produce the chain up to this block (in hex)
    *   "nTx" : n,                      (numeric) The number of transactions in the block
    *   "previousblockhash" : "hex",    (string, optional) The hash of the previous block (if available)
    *   "nextblockhash" : "hex"         (string, optional) The hash of the next block (if available)
    * }
    * 
    * Result (for verbosity = 2):
    * {                   (json object)
    *   ...,              Same output as verbosity = 1
    *   "tx" : [          (json array)
    *     {               (json object)
    *       ...,          The transactions in the format of the getrawtransaction RPC. Different from verbosity = 1 "tx" result
    *       "fee" : n     (numeric) The transaction fee in BTC, omitted if block undo data is not available
    *     },
    *     ...
    *   ]
    * }
    * 
    * Examples:
    * > bitcoin-cli getblock "00000000c937983704a73af28acdec37b049d214adbda81d7e2a3dd146f6ed09"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getblock", "params": ["00000000c937983704a73af28acdec37b049d214adbda81d7e2a3dd146f6ed09"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getblock(Object blockhash) { return getblock.invoke(blockhash); }


   /**
    * getblock "blockhash" ( verbosity )
    * 
    * If verbosity is 0, returns a string that is serialized, hex-encoded data for block 'hash'.
    * If verbosity is 1, returns an Object with information about block <hash>.
    * If verbosity is 2, returns an Object with information about block <hash> and information about each transaction. 
    * 
    * Arguments:
    * 1. blockhash    (string, required) The block hash
    * 2. verbosity    (numeric, optional, default=1) 0 for hex-encoded data, 1 for a json object, and 2 for json object with transaction data
    * 
    * Result (for verbosity = 0):
    * "hex"    (string) A string that is serialized, hex-encoded data for block 'hash'
    * 
    * Result (for verbosity = 1):
    * {                                 (json object)
    *   "hash" : "hex",                 (string) the block hash (same as provided)
    *   "confirmations" : n,            (numeric) The number of confirmations, or -1 if the block is not on the main chain
    *   "size" : n,                     (numeric) The block size
    *   "strippedsize" : n,             (numeric) The block size excluding witness data
    *   "weight" : n,                   (numeric) The block weight as defined in BIP 141
    *   "height" : n,                   (numeric) The block height or index
    *   "version" : n,                  (numeric) The block version
    *   "versionHex" : "hex",           (string) The block version formatted in hexadecimal
    *   "merkleroot" : "hex",           (string) The merkle root
    *   "tx" : [                        (json array) The transaction ids
    *     "hex",                        (string) The transaction id
    *     ...
    *   ],
    *   "time" : xxx,                   (numeric) The block time expressed in UNIX epoch time
    *   "mediantime" : xxx,             (numeric) The median block time expressed in UNIX epoch time
    *   "nonce" : n,                    (numeric) The nonce
    *   "bits" : "hex",                 (string) The bits
    *   "difficulty" : n,               (numeric) The difficulty
    *   "chainwork" : "hex",            (string) Expected number of hashes required to produce the chain up to this block (in hex)
    *   "nTx" : n,                      (numeric) The number of transactions in the block
    *   "previousblockhash" : "hex",    (string, optional) The hash of the previous block (if available)
    *   "nextblockhash" : "hex"         (string, optional) The hash of the next block (if available)
    * }
    * 
    * Result (for verbosity = 2):
    * {                   (json object)
    *   ...,              Same output as verbosity = 1
    *   "tx" : [          (json array)
    *     {               (json object)
    *       ...,          The transactions in the format of the getrawtransaction RPC. Different from verbosity = 1 "tx" result
    *       "fee" : n     (numeric) The transaction fee in BTC, omitted if block undo data is not available
    *     },
    *     ...
    *   ]
    * }
    * 
    * Examples:
    * > bitcoin-cli getblock "00000000c937983704a73af28acdec37b049d214adbda81d7e2a3dd146f6ed09"
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "getblock", "params": ["00000000c937983704a73af28acdec37b049d214adbda81d7e2a3dd146f6ed09"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object getblock(Object blockhash, Object verbosity) { return getblock.invoke(blockhash, verbosity); }

   /**
    * importprunedfunds "rawtransaction" "txoutproof"
    * 
    * Imports funds without rescan. Corresponding address or script must previously be included in wallet. Aimed towards pruned wallets. The end-user is responsible to import additional transactions that subsequently spend the imported outputs or rescan after the point in the blockchain the transaction is included.
    * 
    * Arguments:
    * 1. rawtransaction    (string, required) A raw transaction in hex funding an already-existing address in wallet
    * 2. txoutproof        (string, required) The hex output from gettxoutproof that contains the transaction
    * 
    * Result:
    * null    (json null)
    */
   public Object importprunedfunds(Object rawtransaction, Object txoutproof) { return importprunedfunds.invoke(rawtransaction, txoutproof); }

   /**
    * listwalletdir
    * Returns a list of wallets in the wallet directory.
    * 
    * Result:
    * {                        (json object)
    *   "wallets" : [          (json array)
    *     {                    (json object)
    *       "name" : "str"     (string) The wallet name
    *     },
    *     ...
    *   ]
    * }
    * 
    * Examples:
    * > bitcoin-cli listwalletdir 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listwalletdir", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object listwalletdir() { return listwalletdir.invoke(); }

   /**
    * listdescriptors
    * 
    * List descriptors imported into a descriptor-enabled wallet.
    * Result:
    * {                                 (json object)
    *   "wallet_name" : "str",          (string) Name of wallet this operation was performed on
    *   "descriptors" : [               (json array) Array of descriptor objects
    *     {                             (json object)
    *       "desc" : "str",             (string) Descriptor string representation
    *       "timestamp" : n,            (numeric) The creation time of the descriptor
    *       "active" : true|false,      (boolean) Activeness flag
    *       "internal" : true|false,    (boolean, optional) Whether this is an internal or external descriptor; defined only for active descriptors
    *       "range" : [                 (json array, optional) Defined only for ranged descriptors
    *         n,                        (numeric) Range start inclusive
    *         n                         (numeric) Range end inclusive
    *       ],
    *       "next" : n                  (numeric, optional) The next index to generate addresses from; defined only for ranged descriptors
    *     },
    *     ...
    *   ]
    * }
    * 
    * Examples:
    * > bitcoin-cli listdescriptors 
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "listdescriptors", "params": []}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object listdescriptors() { return listdescriptors.invoke(); }

   /**
    * gettransaction "txid" ( include_watchonly verbose )
    * 
    * Get detailed information about in-wallet transaction <txid>
    * 
    * Arguments:
    * 1. txid                 (string, required) The transaction id
    * 2. include_watchonly    (boolean, optional, default=true for watch-only wallets, otherwise false) Whether to include watch-only addresses in balance calculation and details[]
    * 3. verbose              (boolean, optional, default=false) Whether to include a `decoded` field containing the decoded transaction (equivalent to RPC decoderawtransaction)
    * 
    * Result:
    * {                                          (json object)
    *   "amount" : n,                            (numeric) The amount in BTC
    *   "fee" : n,                               (numeric) The amount of the fee in BTC. This is negative and only available for the
    *                                            'send' category of transactions.
    *   "confirmations" : n,                     (numeric) The number of confirmations for the transaction. Negative confirmations means the
    *                                            transaction conflicted that many blocks ago.
    *   "generated" : true|false,                (boolean) Only present if transaction only input is a coinbase one.
    *   "trusted" : true|false,                  (boolean) Only present if we consider transaction to be trusted and so safe to spend from.
    *   "blockhash" : "hex",                     (string) The block hash containing the transaction.
    *   "blockheight" : n,                       (numeric) The block height containing the transaction.
    *   "blockindex" : n,                        (numeric) The index of the transaction in the block that includes it.
    *   "blocktime" : xxx,                       (numeric) The block time expressed in UNIX epoch time.
    *   "txid" : "hex",                          (string) The transaction id.
    *   "walletconflicts" : [                    (json array) Conflicting transaction ids.
    *     "hex",                                 (string) The transaction id.
    *     ...
    *   ],
    *   "time" : xxx,                            (numeric) The transaction time expressed in UNIX epoch time.
    *   "timereceived" : xxx,                    (numeric) The time received expressed in UNIX epoch time.
    *   "comment" : "str",                       (string) If a comment is associated with the transaction, only present if not empty.
    *   "bip125-replaceable" : "str",            (string) ("yes|no|unknown") Whether this transaction could be replaced due to BIP125 (replace-by-fee);
    *                                            may be unknown for unconfirmed transactions not in the mempool
    *   "details" : [                            (json array)
    *     {                                      (json object)
    *       "involvesWatchonly" : true|false,    (boolean) Only returns true if imported addresses were involved in transaction.
    *       "address" : "str",                   (string) The bitcoin address involved in the transaction.
    *       "category" : "str",                  (string) The transaction category.
    *                                            "send"                  Transactions sent.
    *                                            "receive"               Non-coinbase transactions received.
    *                                            "generate"              Coinbase transactions received with more than 100 confirmations.
    *                                            "immature"              Coinbase transactions received with 100 or fewer confirmations.
    *                                            "orphan"                Orphaned coinbase transactions received.
    *       "amount" : n,                        (numeric) The amount in BTC
    *       "label" : "str",                     (string) A comment for the address/transaction, if any
    *       "vout" : n,                          (numeric) the vout value
    *       "fee" : n,                           (numeric) The amount of the fee in BTC. This is negative and only available for the 
    *                                            'send' category of transactions.
    *       "abandoned" : true|false             (boolean) 'true' if the transaction has been abandoned (inputs are respendable). Only available for the 
    *                                            'send' category of transactions.
    *     },
    *     ...
    *   ],
    *   "hex" : "hex",                           (string) Raw data for transaction
    *   "decoded" : {                            (json object) Optional, the decoded transaction (only present when `verbose` is passed)
    *     ...                                    Equivalent to the RPC decoderawtransaction method, or the RPC getrawtransaction method when `verbose` is passed.
    *   }
    * }
    * 
    * Examples:
    * > bitcoin-cli gettransaction "1075db55d416d3ca199f55b6084e2115b9345e16c5cf302fc80e9d5fbf5d48d"
    * > bitcoin-cli gettransaction "1075db55d416d3ca199f55b6084e2115b9345e16c5cf302fc80e9d5fbf5d48d" true
    * > bitcoin-cli gettransaction "1075db55d416d3ca199f55b6084e2115b9345e16c5cf302fc80e9d5fbf5d48d" false true
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "gettransaction", "params": ["1075db55d416d3ca199f55b6084e2115b9345e16c5cf302fc80e9d5fbf5d48d"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object gettransaction(Object txid) { return gettransaction.invoke(txid); }


   /**
    * gettransaction "txid" ( include_watchonly verbose )
    * 
    * Get detailed information about in-wallet transaction <txid>
    * 
    * Arguments:
    * 1. txid                 (string, required) The transaction id
    * 2. include_watchonly    (boolean, optional, default=true for watch-only wallets, otherwise false) Whether to include watch-only addresses in balance calculation and details[]
    * 3. verbose              (boolean, optional, default=false) Whether to include a `decoded` field containing the decoded transaction (equivalent to RPC decoderawtransaction)
    * 
    * Result:
    * {                                          (json object)
    *   "amount" : n,                            (numeric) The amount in BTC
    *   "fee" : n,                               (numeric) The amount of the fee in BTC. This is negative and only available for the
    *                                            'send' category of transactions.
    *   "confirmations" : n,                     (numeric) The number of confirmations for the transaction. Negative confirmations means the
    *                                            transaction conflicted that many blocks ago.
    *   "generated" : true|false,                (boolean) Only present if transaction only input is a coinbase one.
    *   "trusted" : true|false,                  (boolean) Only present if we consider transaction to be trusted and so safe to spend from.
    *   "blockhash" : "hex",                     (string) The block hash containing the transaction.
    *   "blockheight" : n,                       (numeric) The block height containing the transaction.
    *   "blockindex" : n,                        (numeric) The index of the transaction in the block that includes it.
    *   "blocktime" : xxx,                       (numeric) The block time expressed in UNIX epoch time.
    *   "txid" : "hex",                          (string) The transaction id.
    *   "walletconflicts" : [                    (json array) Conflicting transaction ids.
    *     "hex",                                 (string) The transaction id.
    *     ...
    *   ],
    *   "time" : xxx,                            (numeric) The transaction time expressed in UNIX epoch time.
    *   "timereceived" : xxx,                    (numeric) The time received expressed in UNIX epoch time.
    *   "comment" : "str",                       (string) If a comment is associated with the transaction, only present if not empty.
    *   "bip125-replaceable" : "str",            (string) ("yes|no|unknown") Whether this transaction could be replaced due to BIP125 (replace-by-fee);
    *                                            may be unknown for unconfirmed transactions not in the mempool
    *   "details" : [                            (json array)
    *     {                                      (json object)
    *       "involvesWatchonly" : true|false,    (boolean) Only returns true if imported addresses were involved in transaction.
    *       "address" : "str",                   (string) The bitcoin address involved in the transaction.
    *       "category" : "str",                  (string) The transaction category.
    *                                            "send"                  Transactions sent.
    *                                            "receive"               Non-coinbase transactions received.
    *                                            "generate"              Coinbase transactions received with more than 100 confirmations.
    *                                            "immature"              Coinbase transactions received with 100 or fewer confirmations.
    *                                            "orphan"                Orphaned coinbase transactions received.
    *       "amount" : n,                        (numeric) The amount in BTC
    *       "label" : "str",                     (string) A comment for the address/transaction, if any
    *       "vout" : n,                          (numeric) the vout value
    *       "fee" : n,                           (numeric) The amount of the fee in BTC. This is negative and only available for the 
    *                                            'send' category of transactions.
    *       "abandoned" : true|false             (boolean) 'true' if the transaction has been abandoned (inputs are respendable). Only available for the 
    *                                            'send' category of transactions.
    *     },
    *     ...
    *   ],
    *   "hex" : "hex",                           (string) Raw data for transaction
    *   "decoded" : {                            (json object) Optional, the decoded transaction (only present when `verbose` is passed)
    *     ...                                    Equivalent to the RPC decoderawtransaction method, or the RPC getrawtransaction method when `verbose` is passed.
    *   }
    * }
    * 
    * Examples:
    * > bitcoin-cli gettransaction "1075db55d416d3ca199f55b6084e2115b9345e16c5cf302fc80e9d5fbf5d48d"
    * > bitcoin-cli gettransaction "1075db55d416d3ca199f55b6084e2115b9345e16c5cf302fc80e9d5fbf5d48d" true
    * > bitcoin-cli gettransaction "1075db55d416d3ca199f55b6084e2115b9345e16c5cf302fc80e9d5fbf5d48d" false true
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "gettransaction", "params": ["1075db55d416d3ca199f55b6084e2115b9345e16c5cf302fc80e9d5fbf5d48d"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object gettransaction(Object txid, Object include_watchonly) { return gettransaction.invoke(txid, include_watchonly); }


   /**
    * gettransaction "txid" ( include_watchonly verbose )
    * 
    * Get detailed information about in-wallet transaction <txid>
    * 
    * Arguments:
    * 1. txid                 (string, required) The transaction id
    * 2. include_watchonly    (boolean, optional, default=true for watch-only wallets, otherwise false) Whether to include watch-only addresses in balance calculation and details[]
    * 3. verbose              (boolean, optional, default=false) Whether to include a `decoded` field containing the decoded transaction (equivalent to RPC decoderawtransaction)
    * 
    * Result:
    * {                                          (json object)
    *   "amount" : n,                            (numeric) The amount in BTC
    *   "fee" : n,                               (numeric) The amount of the fee in BTC. This is negative and only available for the
    *                                            'send' category of transactions.
    *   "confirmations" : n,                     (numeric) The number of confirmations for the transaction. Negative confirmations means the
    *                                            transaction conflicted that many blocks ago.
    *   "generated" : true|false,                (boolean) Only present if transaction only input is a coinbase one.
    *   "trusted" : true|false,                  (boolean) Only present if we consider transaction to be trusted and so safe to spend from.
    *   "blockhash" : "hex",                     (string) The block hash containing the transaction.
    *   "blockheight" : n,                       (numeric) The block height containing the transaction.
    *   "blockindex" : n,                        (numeric) The index of the transaction in the block that includes it.
    *   "blocktime" : xxx,                       (numeric) The block time expressed in UNIX epoch time.
    *   "txid" : "hex",                          (string) The transaction id.
    *   "walletconflicts" : [                    (json array) Conflicting transaction ids.
    *     "hex",                                 (string) The transaction id.
    *     ...
    *   ],
    *   "time" : xxx,                            (numeric) The transaction time expressed in UNIX epoch time.
    *   "timereceived" : xxx,                    (numeric) The time received expressed in UNIX epoch time.
    *   "comment" : "str",                       (string) If a comment is associated with the transaction, only present if not empty.
    *   "bip125-replaceable" : "str",            (string) ("yes|no|unknown") Whether this transaction could be replaced due to BIP125 (replace-by-fee);
    *                                            may be unknown for unconfirmed transactions not in the mempool
    *   "details" : [                            (json array)
    *     {                                      (json object)
    *       "involvesWatchonly" : true|false,    (boolean) Only returns true if imported addresses were involved in transaction.
    *       "address" : "str",                   (string) The bitcoin address involved in the transaction.
    *       "category" : "str",                  (string) The transaction category.
    *                                            "send"                  Transactions sent.
    *                                            "receive"               Non-coinbase transactions received.
    *                                            "generate"              Coinbase transactions received with more than 100 confirmations.
    *                                            "immature"              Coinbase transactions received with 100 or fewer confirmations.
    *                                            "orphan"                Orphaned coinbase transactions received.
    *       "amount" : n,                        (numeric) The amount in BTC
    *       "label" : "str",                     (string) A comment for the address/transaction, if any
    *       "vout" : n,                          (numeric) the vout value
    *       "fee" : n,                           (numeric) The amount of the fee in BTC. This is negative and only available for the 
    *                                            'send' category of transactions.
    *       "abandoned" : true|false             (boolean) 'true' if the transaction has been abandoned (inputs are respendable). Only available for the 
    *                                            'send' category of transactions.
    *     },
    *     ...
    *   ],
    *   "hex" : "hex",                           (string) Raw data for transaction
    *   "decoded" : {                            (json object) Optional, the decoded transaction (only present when `verbose` is passed)
    *     ...                                    Equivalent to the RPC decoderawtransaction method, or the RPC getrawtransaction method when `verbose` is passed.
    *   }
    * }
    * 
    * Examples:
    * > bitcoin-cli gettransaction "1075db55d416d3ca199f55b6084e2115b9345e16c5cf302fc80e9d5fbf5d48d"
    * > bitcoin-cli gettransaction "1075db55d416d3ca199f55b6084e2115b9345e16c5cf302fc80e9d5fbf5d48d" true
    * > bitcoin-cli gettransaction "1075db55d416d3ca199f55b6084e2115b9345e16c5cf302fc80e9d5fbf5d48d" false true
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "gettransaction", "params": ["1075db55d416d3ca199f55b6084e2115b9345e16c5cf302fc80e9d5fbf5d48d"]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object gettransaction(Object txid, Object include_watchonly, Object verbose) { return gettransaction.invoke(txid, include_watchonly, verbose); }

   /**
    * gettxout "txid" n ( include_mempool )
    * 
    * Returns details about an unspent transaction output.
    * 
    * Arguments:
    * 1. txid               (string, required) The transaction id
    * 2. n                  (numeric, required) vout number
    * 3. include_mempool    (boolean, optional, default=true) Whether to include the mempool. Note that an unspent output that is spent in the mempool won't appear.
    * 
    * Result (If the UTXO was not found):
    * null    (json null)
    * 
    * Result (Otherwise):
    * {                             (json object)
    *   "bestblock" : "hex",        (string) The hash of the block at the tip of the chain
    *   "confirmations" : n,        (numeric) The number of confirmations
    *   "value" : n,                (numeric) The transaction value in BTC
    *   "scriptPubKey" : {          (json object)
    *     "asm" : "str",            (string)
    *     "hex" : "hex",            (string)
    *     "reqSigs" : n,            (numeric, optional) (DEPRECATED, returned only if config option -deprecatedrpc=addresses is passed) Number of required signatures
    *     "type" : "str",           (string) The type, eg pubkeyhash
    *     "address" : "str",        (string, optional) bitcoin address (only if a well-defined address exists)
    *     "addresses" : [           (json array, optional) (DEPRECATED, returned only if config option -deprecatedrpc=addresses is passed) Array of bitcoin addresses
    *       "str",                  (string) bitcoin address
    *       ...
    *     ]
    *   },
    *   "coinbase" : true|false     (boolean) Coinbase or not
    * }
    * 
    * Examples:
    * 
    * Get unspent transactions
    * > bitcoin-cli listunspent 
    * 
    * View the details
    * > bitcoin-cli gettxout "txid" 1
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "gettxout", "params": ["txid", 1]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object gettxout(Object txid, Object n) { return gettxout.invoke(txid, n); }


   /**
    * gettxout "txid" n ( include_mempool )
    * 
    * Returns details about an unspent transaction output.
    * 
    * Arguments:
    * 1. txid               (string, required) The transaction id
    * 2. n                  (numeric, required) vout number
    * 3. include_mempool    (boolean, optional, default=true) Whether to include the mempool. Note that an unspent output that is spent in the mempool won't appear.
    * 
    * Result (If the UTXO was not found):
    * null    (json null)
    * 
    * Result (Otherwise):
    * {                             (json object)
    *   "bestblock" : "hex",        (string) The hash of the block at the tip of the chain
    *   "confirmations" : n,        (numeric) The number of confirmations
    *   "value" : n,                (numeric) The transaction value in BTC
    *   "scriptPubKey" : {          (json object)
    *     "asm" : "str",            (string)
    *     "hex" : "hex",            (string)
    *     "reqSigs" : n,            (numeric, optional) (DEPRECATED, returned only if config option -deprecatedrpc=addresses is passed) Number of required signatures
    *     "type" : "str",           (string) The type, eg pubkeyhash
    *     "address" : "str",        (string, optional) bitcoin address (only if a well-defined address exists)
    *     "addresses" : [           (json array, optional) (DEPRECATED, returned only if config option -deprecatedrpc=addresses is passed) Array of bitcoin addresses
    *       "str",                  (string) bitcoin address
    *       ...
    *     ]
    *   },
    *   "coinbase" : true|false     (boolean) Coinbase or not
    * }
    * 
    * Examples:
    * 
    * Get unspent transactions
    * > bitcoin-cli listunspent 
    * 
    * View the details
    * > bitcoin-cli gettxout "txid" 1
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "gettxout", "params": ["txid", 1]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object gettxout(Object txid, Object n, Object include_mempool) { return gettxout.invoke(txid, n, include_mempool); }

   /**
    * importaddress "address" ( "label" rescan p2sh )
    * 
    * Adds an address or script (in hex) that can be watched as if it were in your wallet but cannot be used to spend. Requires a new wallet backup.
    * 
    * Note: This call can take over an hour to complete if rescan is true, during that time, other rpc calls
    * may report that the imported address exists but related transactions are still missing, leading to temporarily incorrect/bogus balances and unspent outputs until rescan completes.
    * If you have the full public key, you should call importpubkey instead of this.
    * Hint: use importmulti to import more than one address.
    * 
    * Note: If you import a non-standard raw script in hex form, outputs sending to it will be treated
    * as change, and not show up in many RPCs.
    * Note: Use "getwalletinfo" to query the scanning progress.
    * 
    * Arguments:
    * 1. address    (string, required) The Bitcoin address (or hex-encoded script)
    * 2. label      (string, optional, default="") An optional label
    * 3. rescan     (boolean, optional, default=true) Rescan the wallet for transactions
    * 4. p2sh       (boolean, optional, default=false) Add the P2SH version of the script as well
    * 
    * Result:
    * null    (json null)
    * 
    * Examples:
    * 
    * Import an address with rescan
    * > bitcoin-cli importaddress "myaddress"
    * 
    * Import using a label without rescan
    * > bitcoin-cli importaddress "myaddress" "testing" false
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "importaddress", "params": ["myaddress", "testing", false]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object importaddress(Object address) { return importaddress.invoke(address); }


   /**
    * importaddress "address" ( "label" rescan p2sh )
    * 
    * Adds an address or script (in hex) that can be watched as if it were in your wallet but cannot be used to spend. Requires a new wallet backup.
    * 
    * Note: This call can take over an hour to complete if rescan is true, during that time, other rpc calls
    * may report that the imported address exists but related transactions are still missing, leading to temporarily incorrect/bogus balances and unspent outputs until rescan completes.
    * If you have the full public key, you should call importpubkey instead of this.
    * Hint: use importmulti to import more than one address.
    * 
    * Note: If you import a non-standard raw script in hex form, outputs sending to it will be treated
    * as change, and not show up in many RPCs.
    * Note: Use "getwalletinfo" to query the scanning progress.
    * 
    * Arguments:
    * 1. address    (string, required) The Bitcoin address (or hex-encoded script)
    * 2. label      (string, optional, default="") An optional label
    * 3. rescan     (boolean, optional, default=true) Rescan the wallet for transactions
    * 4. p2sh       (boolean, optional, default=false) Add the P2SH version of the script as well
    * 
    * Result:
    * null    (json null)
    * 
    * Examples:
    * 
    * Import an address with rescan
    * > bitcoin-cli importaddress "myaddress"
    * 
    * Import using a label without rescan
    * > bitcoin-cli importaddress "myaddress" "testing" false
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "importaddress", "params": ["myaddress", "testing", false]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object importaddress(Object address, Object label) { return importaddress.invoke(address, label); }


   /**
    * importaddress "address" ( "label" rescan p2sh )
    * 
    * Adds an address or script (in hex) that can be watched as if it were in your wallet but cannot be used to spend. Requires a new wallet backup.
    * 
    * Note: This call can take over an hour to complete if rescan is true, during that time, other rpc calls
    * may report that the imported address exists but related transactions are still missing, leading to temporarily incorrect/bogus balances and unspent outputs until rescan completes.
    * If you have the full public key, you should call importpubkey instead of this.
    * Hint: use importmulti to import more than one address.
    * 
    * Note: If you import a non-standard raw script in hex form, outputs sending to it will be treated
    * as change, and not show up in many RPCs.
    * Note: Use "getwalletinfo" to query the scanning progress.
    * 
    * Arguments:
    * 1. address    (string, required) The Bitcoin address (or hex-encoded script)
    * 2. label      (string, optional, default="") An optional label
    * 3. rescan     (boolean, optional, default=true) Rescan the wallet for transactions
    * 4. p2sh       (boolean, optional, default=false) Add the P2SH version of the script as well
    * 
    * Result:
    * null    (json null)
    * 
    * Examples:
    * 
    * Import an address with rescan
    * > bitcoin-cli importaddress "myaddress"
    * 
    * Import using a label without rescan
    * > bitcoin-cli importaddress "myaddress" "testing" false
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "importaddress", "params": ["myaddress", "testing", false]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object importaddress(Object address, Object label, Object rescan) { return importaddress.invoke(address, label, rescan); }


   /**
    * importaddress "address" ( "label" rescan p2sh )
    * 
    * Adds an address or script (in hex) that can be watched as if it were in your wallet but cannot be used to spend. Requires a new wallet backup.
    * 
    * Note: This call can take over an hour to complete if rescan is true, during that time, other rpc calls
    * may report that the imported address exists but related transactions are still missing, leading to temporarily incorrect/bogus balances and unspent outputs until rescan completes.
    * If you have the full public key, you should call importpubkey instead of this.
    * Hint: use importmulti to import more than one address.
    * 
    * Note: If you import a non-standard raw script in hex form, outputs sending to it will be treated
    * as change, and not show up in many RPCs.
    * Note: Use "getwalletinfo" to query the scanning progress.
    * 
    * Arguments:
    * 1. address    (string, required) The Bitcoin address (or hex-encoded script)
    * 2. label      (string, optional, default="") An optional label
    * 3. rescan     (boolean, optional, default=true) Rescan the wallet for transactions
    * 4. p2sh       (boolean, optional, default=false) Add the P2SH version of the script as well
    * 
    * Result:
    * null    (json null)
    * 
    * Examples:
    * 
    * Import an address with rescan
    * > bitcoin-cli importaddress "myaddress"
    * 
    * Import using a label without rescan
    * > bitcoin-cli importaddress "myaddress" "testing" false
    * 
    * As a JSON-RPC call
    * > curl --user myusername --data-binary '{"jsonrpc": "1.0", "id": "curltest", "method": "importaddress", "params": ["myaddress", "testing", false]}' -H 'content-type: text/plain;' http://127.0.0.1:8332/
    */
   public Object importaddress(Object address, Object label, Object rescan, Object p2sh) { return importaddress.invoke(address, label, rescan, p2sh); }

}

