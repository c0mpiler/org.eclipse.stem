package org.eclipse.stem.diseasemodels.vector.impl;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.stem.diseasemodels.vector.impl.messages"; //$NON-NLS-1$
	public static String HOST_POP_MOD_LABEL_NOT_FOUND;
	public static String VECTOR_POP_MOD_LABEL_NOT_FOUND;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
