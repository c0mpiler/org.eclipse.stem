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
 *     Bundesinstitut f�r Risikobewertung
 *******************************************************************************/

package org.eclipse.stem.ui.views.graphmap;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * This class gets NLS values.
 */
public class Messages {
	private static final String BUNDLE_NAME = "org.eclipse.stem.ui.views.graphmap.messages";
	
	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
			.getBundle(BUNDLE_NAME);

	private Messages() {
		// Nothing
	}

	/**
	 * @param key
	 * @return the string matching the key
	 */
	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
