package btccli;

import static clojure.java.api.Clojure.read;
import static clojure.java.api.Clojure.var;

import clojure.lang.IFn;

abstract public class AbstractBtcCli {

	private static final String CLOJURE_CORE = "clojure.core";
	protected static final String BTCCLI_CORE = "btccli.core";
	static private final IFn require;
	static private final IFn createApi;
	protected final Object session;

	static {
		require = var(CLOJURE_CORE, "require");
		require.invoke(read(BTCCLI_CORE));
		createApi = var(BTCCLI_CORE, "create-api");
	}
	
	
	protected AbstractBtcCli(final String password) {
		session = createApi.invoke(password);
		
	}
	@Override
	public String toString() {
		return session.toString();
	}
}
