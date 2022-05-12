(ns btccli.core-test
  (:require [clojure.test :refer :all]
            [btccli.core :refer :all])
  )

;;Note, will only work if create-api has been called previously



(deftest test-genesis-block
  (is (= "000000000019d6689c085ae165831e934ff763ae46a2a6c172b3f1b60a8ce26f" (getblockhash 0))))

(deftest test-genesis-block-header
  (is (= {"nTx" 1, "height" 0, "hash" "000000000019d6689c085ae165831e934ff763ae46a2a6c172b3f1b60a8ce26f", "versionHex" "00000001", "bits" "1d00ffff", "time" 1231006505, "difficulty" 1, "version" 1, "merkleroot" "4a5e1e4baab89f3a32518a88c31bc87f618f76673e2cc77ab2127b7afdeda33b", "nonce" 2083236893, "nextblockhash" "00000000839a8e6886ab5951d76f411475428afc90947ee320161bbf18eb6048", "chainwork" "0000000000000000000000000000000000000000000000000000000100010001", "mediantime" 1231006505} 
         (-> 0 getblockhash getblockheader (dissoc "confirmations")))))

(deftest test-block-one
  (is (= {"nTx" 1, "height" 1, "previousblockhash" "000000000019d6689c085ae165831e934ff763ae46a2a6c172b3f1b60a8ce26f", "hash" "00000000839a8e6886ab5951d76f411475428afc90947ee320161bbf18eb6048", "strippedsize" 215, "versionHex" "00000001", "bits" "1d00ffff", "time" 1231469665, "difficulty" 1, "tx" ["0e3e2357e806b6cdb1f70b54c3a3a17b6714ee1f0e68bebb44a74b1efd512098"], "version" 1, "merkleroot" "0e3e2357e806b6cdb1f70b54c3a3a17b6714ee1f0e68bebb44a74b1efd512098", "nonce" 2573394689, "size" 215, "nextblockhash" "000000006a625f06636b8bb6ac7b960a8d03705d1ace08b1a19da3fdcc99ddbd", "chainwork" "0000000000000000000000000000000000000000000000000000000200020002", "weight" 860, "mediantime" 1231469665} 
         (-> 1 getblockhash getblock (dissoc "confirmations")))))

(deftest test-decode-tx-0-in-block-1
  (is (= {"vsize" 134, "hash" "0e3e2357e806b6cdb1f70b54c3a3a17b6714ee1f0e68bebb44a74b1efd512098", "vout" [{"value" 50.0, "n" 0, "scriptPubKey" {"asm" "0496b538e853519c726a2c91e61ec11600ae1390813a627c66fb8be7947be63c52da7589379515d4e0a604f8141781e62294721166bf621e73a82cbf2342c858ee OP_CHECKSIG", "hex" "410496b538e853519c726a2c91e61ec11600ae1390813a627c66fb8be7947be63c52da7589379515d4e0a604f8141781e62294721166bf621e73a82cbf2342c858eeac", "type" "pubkey"}}], "locktime" 0, "version" 1, "size" 134, "txid" "0e3e2357e806b6cdb1f70b54c3a3a17b6714ee1f0e68bebb44a74b1efd512098", "vin" [{"coinbase" "04ffff001d0104", "sequence" 4294967295}], "weight" 536} 
         (decoderawtransaction (getrawtransaction (first ((getblock (getblockhash 1)) "tx")))))
  ))

(deftest test-createmultisig
  (is (= {"address" "3QsFXpFJf2ZY6GLWVoNFFd2xSDwdS713qX", "redeemScript" "522103789ed0bb717d88f7d321a368d905e7430207ebbd82bd342cf11ae157a7ace5fd2103dbc6764b8884a92e871274b87583e6d5c2a58819473e17e107ef3f6aa5a6162652ae", "descriptor" "sh(multi(2,03789ed0bb717d88f7d321a368d905e7430207ebbd82bd342cf11ae157a7ace5fd,03dbc6764b8884a92e871274b87583e6d5c2a58819473e17e107ef3f6aa5a61626))#4djp057k"} 
         (createmultisig 2 ["03789ed0bb717d88f7d321a368d905e7430207ebbd82bd342cf11ae157a7ace5fd" 
                       "03dbc6764b8884a92e871274b87583e6d5c2a58819473e17e107ef3f6aa5a61626"]))))
(deftest test-output-sum-of
  (is (= 50.0 (output-sum-of 1)))
  (is (= 103.01 (output-sum-of 100000)))
  )