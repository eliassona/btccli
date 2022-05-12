package btccli;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class TestBtcCli {

	/**
	 * 
	 * @param args
	 */
	public static void main(final String[] args) {
		final BtcCli cli = new BtcCli(args[0]);
		try {
			
			//display how many blocks currently
			System.out.println(cli.getblockcount());
			
//			  (decoderawtransaction (getrawtransaction (first ((getblock (getblockhash 1)) "tx"))))
//			  (createmultisig 2 ["03789ed0bb717d88f7d321a368d905e7430207ebbd82bd342cf11ae157a7ace5fd" 
//			                "03dbc6764b8884a92e871274b87583e6d5c2a58819473e17e107ef3f6aa5a61626"])

			//display the first transaction in the second block
			final Map block = (Map)cli.getblock(cli.getblockhash(1));
			final List txIds = (List)block.get("tx");
			System.out.println(cli.decoderawtransaction(cli.getrawtransaction(txIds.get(0))));
			
			//create a 2-of-2 multisig
			System.out.println(cli.createmultisig(2, 
				Arrays.asList("03789ed0bb717d88f7d321a368d905e7430207ebbd82bd342cf11ae157a7ace5fd", 
	                          "03dbc6764b8884a92e871274b87583e6d5c2a58819473e17e107ef3f6aa5a61626")));
			
		} finally {
			cli.disconnect();
		}
	}
}
