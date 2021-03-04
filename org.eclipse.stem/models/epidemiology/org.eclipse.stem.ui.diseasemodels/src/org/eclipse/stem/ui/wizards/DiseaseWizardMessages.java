// DiseaseWizardMessages.java
package org.eclipse.stem.ui.wizards;

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

import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.eclipse.stem.core.Constants;

/**
 * This class is the Resource Bundle for this package.
 */
public class DiseaseWizardMessages {
	private static final String BUNDLE_NAME = Constants.ID_ROOT
			+ ".ui.wizards.diseasewizardmessages"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
			.getBundle(BUNDLE_NAME);

	private DiseaseWizardMessages() {
		// empty
	}

	/**
	 * @param key
	 *            the key for the message
	 * @return the string that matches the key
	 */
	public static String getString(final String key) throws MissingResourceException {
		return RESOURCE_BUNDLE.getString(key);
	} // getString
} // DiseaseWizardMessages