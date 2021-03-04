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

package org.eclipse.stem.foodproduction;

import org.eclipse.stem.diseasemodels.standard.DiseaseModel;

public interface Constants {

	/**
	 * This is the extension point id for the "food producer" extension point. A
	 * {@link DiseaseModel} defines the underlying computational model for how a
	 * food is created. * {@value}
	 */
	String ID_FOOD_TRANSFORMER_EXTENSION_POINT = org.eclipse.stem.core.Constants.ID_ROOT
			+ ".foodproduction.foodproducer";

	/**
	 * This is the identifier of the element in a
	 * <code>ConfigurationElement</code> that specifies the name and
	 * implementing class for STEM "food producers".
	 * 
	 * @see org.eclipse.stem.core.Constants#EXECUTABLE_NAME_ATTRIBUTE
	 */
	String FOOD_TRANSFORMER_MODEL_ELEMENT = "classdef";

	/**
	 * This is the segment of the type URI that prefixes all other segments in a
	 * disease model type URI.
	 */
	String URI_TYPE_FOODTRANSFORMER_SEGMENT = "foodproducer";

}
