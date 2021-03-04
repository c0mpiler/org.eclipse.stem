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
package org.eclipse.stem.loggers.csv.logger;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.stem.loggers.csv.logger.messages"; //$NON-NLS-1$
	public static String DFDL_CreateDirectoryError;
	public static String DFDL_CreateDirectoryException;
	public static String DFDL_CreatePopulationDirectoryError;
	public static String DFDL_LogFileWriteError;
	public static String DFDL_LoggerCreateError;
	public static String DFDL_NoDecoratorLabels;
	public static String DFDL_NoDecoratorPopulations;
	public static String DFDL_NoLabelProperties;
	public static String DFDL_WriteRunParametersError;
	public static String DFSL_WriteScenarioSummaryError;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
