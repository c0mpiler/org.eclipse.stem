// DeterministicSEIRDiseaseModel.java
package org.eclipse.stem.diseasemodels.standard;

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
 * This interface defines a class in an EMF model for an Deterministic SEIR
 * disease model.
 * 
 * @see SEIRLabel
 * @see SEIRLabelValue
 * 
 * @model
 * @deprecated
 */
public interface DeterministicSEIRDiseaseModel extends SEIR {

	/**
	 * This is the segment of the type URI that prefixes all other segments in a
	 * standard stochastic SEIR disease model type URI.
	 */
	String URI_TYPE_DETERMINISTIC_SEIR_DISEASE_MODEL_SEGMENT = URI_TYPE_STANDARD_SEIR_DISEASE_MODEL_SEGMENT
			+ "/stochastic";
} // DeterministicSEIRDiseaseModel
