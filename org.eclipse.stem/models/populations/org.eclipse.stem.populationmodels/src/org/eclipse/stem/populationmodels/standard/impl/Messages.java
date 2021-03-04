package org.eclipse.stem.populationmodels.standard.impl;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.stem.populationmodels.standard.impl.messages"; //$NON-NLS-1$
	public static String DUPLICATE_POP_INIT;
	public static String EDGE_POP_MODEL_MISSING;
	public static String ERR_LOADING_DATA;
	public static String EXT_DS_INIT_REGION_NOT_FOUND;
	public static String MIGRATION_EXCEEDS_AVAILABLE_POPULATION;
	public static String NO_DATA_FOUND;
	public static String POP_MODEL_MISSING_POP_LABELS;
	public static String ROW_NOT_FOUND;
	public static String StandardPopulationInitializerImpl_CANNOT_INIT_POPULATION;
	public static String StandardPopulationInitializerImpl_ERR_POP_INIT_NODE_NOT_FOUND;
	public static String StandardPopulationInitializerImpl_UNABLE_TO_FIND_AREA;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
