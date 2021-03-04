package org.eclipse.stem.core.scenario.impl;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.stem.core.scenario.impl.messages"; //$NON-NLS-1$
	public static String MISSING_MODEL;
	public static String MISSING_SEQUENCER;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
