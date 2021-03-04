/*******************************************************************************
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation and new features
 *     Bundesinstitut für Risikobewertung - Pajek Graph interface, new Veterinary Models
 *******************************************************************************/
package org.eclipse.stem.ui.handlers;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.stem.ui.handlers.messages"; //$NON-NLS-1$
	public static String STEMExecutionCommandHandler_2;
	public static String SwitchLocaleAction_CommandLineError;
	public static String SwitchLocaleAction_CommandLineErrorMessage;
	public static String SwitchLocaleAction_ConfirmRestart;
	public static String SwitchLocaleAction_ConfirmRestartMessage;
	public static String SwitchLocaleAction_DefaultSetting;
	public static String SwitchLocaleAction_SwitchLangaugeMenu;
	public static String SwitchLocaleAction_SwitchLangaugeMenuTT;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
