package btccli;

public class TestBtcCli {

	
	public static void main(final String[] args) {
		final BtcCli cli = new BtcCli(args[0]);
		try {
			System.out.println(cli.getblockcount());
		} finally {
			cli.disconnect();
		}
	}
}
