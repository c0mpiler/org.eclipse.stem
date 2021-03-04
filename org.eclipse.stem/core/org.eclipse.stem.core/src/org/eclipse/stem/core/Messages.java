package org.eclipse.stem.core;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.stem.core.messages"; //$NON-NLS-1$
	public static String Utility_BAD_SERIALIZED_INSTANCE;
	public static String Utility_OKAY;
	public static String Utility_UNABLE_TO_LOAD_CONTENT;
	public static String DUPLICATE_DECORATOR;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
