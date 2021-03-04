/**
 * <copyright>
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
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.stem.diseasemodels.polioopvipv.presentation;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * @generated
 */
public class PolioOpvIpvWizardMessages {
	/**
	 * @generated
	 */
	private static final String BUNDLE_NAME = "org.eclipse.stem.diseasemodels.polioopvipv.presentation.messages"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

	/**
	 * @generated
	 */
	public PolioOpvIpvWizardMessages() {
		// empty
	}

	/**
	 * @param key the key for the message
	 * @return the string that matches the key
	 * @throws MissingResourceException if the key cannot be found
	 * @generated
	 */
	public static String getString(String key) throws MissingResourceException {
		return RESOURCE_BUNDLE.getString(key);
	}
	
	/**
	 * @param key the key for the message
	 * @param context the class name for which this key resides
	 * @return the string that matches the key
	 * @throws MissingResourceException if the key cannot be found
	 * @generated
	 */
	public static String getString(String key, String context) throws MissingResourceException {
		return RESOURCE_BUNDLE.getString(context +"."+ key);
	}	
	
}
