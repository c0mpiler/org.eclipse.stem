/******************************************************************************
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
package org.eclipse.stem.ui.adapters.loggerpropertyeditor;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.stem.ui.adapters.loggerpropertyeditor.messages"; //$NON-NLS-1$
	public static String DecoratorPickerDialog_CancelButton;
	public static String DecoratorPickerDialog_DoneButton;
	public static String DPD_AddAllButton;
	public static String DPD_AddButton;
	public static String DPD_AvailableProperties;
	public static String DPD_Decorator;
	public static String DPD_Project;
	public static String DPD_RemoveAllButton;
	public static String DPD_RemoveButton;
	public static String DPD_SelectedProperties;
	public static String DPD_Title;
	public static String SLPE_CompartmentsToLog;
	public static String SLPE_PropertyStepMod;
	public static String SLPE_PropertyStartStep;
	public static String SLPE_SelectCompartments;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
