package org.eclipse.stem.ui.views.disease;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.stem.ui.views.disease.messages"; //$NON-NLS-1$
	public static String DiseaseView_HelpText;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
