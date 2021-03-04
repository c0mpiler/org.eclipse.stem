/******************************************************************************* 
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     IBM Corporation - initial API and implementation 
 *******************************************************************************/

package org.eclipse.stem.foodproduction.presentation;


import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.eclipse.stem.core.Constants;

/**
 * This class is the Resource Bundle for this package.
 */
public class FoodProductionMessages {
	private static final String BUNDLE_NAME = Constants.ID_ROOT
			+ ".foodproduction.presentation.foodproductionmessages"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
			.getBundle(BUNDLE_NAME);

	private FoodProductionMessages() {
		// empty
	}

	/**
	 * @param key
	 *            the key for the message
	 * @return the string that matches the key
	 */
	public static String getString(final String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (final MissingResourceException e) {
			return '!' + key + '!';
		}
	} // getString
} // DiseaseWizardMessages
