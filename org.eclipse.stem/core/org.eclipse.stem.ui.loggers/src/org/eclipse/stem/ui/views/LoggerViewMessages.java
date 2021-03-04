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
package org.eclipse.stem.ui.views;

import org.eclipse.osgi.util.NLS;

public class LoggerViewMessages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.stem.ui.views.loggerviewmessages"; //$NON-NLS-1$
	public static String ALV_disabled_message;
	public static String ALV_enabled_message;
	public static String ALV_logger;
	public static String ALV_status;
	public static String ALV_type;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, LoggerViewMessages.class);
	}

	private LoggerViewMessages() {
	}
}
