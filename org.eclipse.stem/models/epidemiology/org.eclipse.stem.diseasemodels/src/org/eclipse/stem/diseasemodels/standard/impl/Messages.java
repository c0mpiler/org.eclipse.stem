package org.eclipse.stem.diseasemodels.standard.impl;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.stem.diseasemodels.standard.impl.messages"; //$NON-NLS-1$
	public static String CANNOT_INOCULATE;
	public static String DISEASE_NOT_FOUND;
	public static String DM_MISSING_POP_MOD_LABELS;
	public static String INF_NODE_NOT_FOUND;
	public static String INFECTOR_NODE_NOT_FOUND;
	public static String INFECTOR_DISEASE_NOT_FOUND;
	public static String INITIALIZER_DISEASE_NOT_FOUND;
	public static String INITIALIZER_INVALID_POPULATION_COUNT;
	public static String INITIALIZER_NODE_NOT_FOUND;
	public static String UNABLE_TO_INFECT_STATE;
	public static String WRONG_PERCENT;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
