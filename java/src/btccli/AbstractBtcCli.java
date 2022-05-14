package btccli;

import static clojure.java.api.Clojure.read;
import static clojure.java.api.Clojure.var;

import clojure.lang.IFn;

abstract public class AbstractBtcCli {

	private static final String CLOJURE_CORE = "clojure.core";
	protected static final String BTCCLI_CORE = "btccli.core";
	static private final IFn require;
	static private final IFn createApi;
	private static final IFn createUmbrelSession;

	static {
		require = var(CLOJURE_CORE, "require");
		require.invoke(read(BTCCLI_CORE));
		createApi = createFn("create-api");
		createUmbrelSession = createFn("create-umbrel-session");
	}
	
	
	protected AbstractBtcCli(final IFn sessionFn) {
		createApi.invoke(sessionFn);
		
	}
	
	protected static IFn  createUmbrelSession(final String password) {
		return (IFn)createUmbrelSession.invoke(password);
	}
	
	protected final static IFn createFn(final String fnName) {
		return var(BTCCLI_CORE, fnName);
	}
	
}
