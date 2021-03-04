package org.eclipse.stem.solvers.rk.provider;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.stem.solvers.rk.provider.messages"; //$NON-NLS-1$
	public static String DormandPrince853ItemProvider_1;
	public static String DormandPrince54ItemProvider_1;
	public static String GraggBulirschStoerItemProvider_1;
	public static String HighamHall54ItemProvider_1;
	public static String RungeKuttaItemProvider_1;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
