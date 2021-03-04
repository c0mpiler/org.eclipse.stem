// Constants.java
package org.eclipse.stem.diseasemodels;

import org.eclipse.stem.diseasemodels.standard.DiseaseModel;

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

/**
 * This interface contains constants that are significant to the STEM disease
 * model definitions.
 */
public interface Constants {

	/**
	 * This is the extension point id for the "disease model" extension point. A
	 * {@link DiseaseModel} defines the underlying computational model for how a
	 * disease propagates.
	 * {@value}
	 */
	String ID_DISEASE_MODEL_EXTENSION_POINT = org.eclipse.stem.core.Constants.ID_ROOT
	+ ".diseasemodels.diseasemodel";

	
	/**
	 * This is the extension point id for the "disease" extension point.
	 * {@value}
	 */
	String ID_DISEASE_EXTENSION_POINT = org.eclipse.stem.core.Constants.ID_ROOT
			+ ".diseasemodels.disease";

	/**
	 * This is the identifier of the element in a
	 * <code>ConfigurationElement</code> that specifies the name and
	 * implementing class for STEM "disease models".
	 * 
	 * @see org.eclipse.stem.core.Constants#EXECUTABLE_NAME_ATTRIBUTE
	 */
	String DISEASE_MODEL_ELEMENT = "classdef";

	
	
	public String COMPARTMENT_TYPE_ANNOTATION_SOURCE = "org.eclipse.stem.model.compartmentType";
	
	public String COMPARTMENT_TYPE_INCIDENCE = "Incidence";
	public String COMPARTMENT_TYPE_DEATHS = "Deaths";
	
	
} // Constants
