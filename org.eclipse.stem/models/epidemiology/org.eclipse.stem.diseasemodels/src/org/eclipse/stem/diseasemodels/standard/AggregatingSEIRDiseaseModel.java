// AggregatingSEIRDiseaseModel.java
package org.eclipse.stem.diseasemodels.standard;

import org.eclipse.stem.core.model.Decorator;

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
 * This interface defines a class in an EMF model for an aggregating SEIR
 * disease model. This disease model determines its disease state values by
 * summing (aggregating) the (next) values of the labels of other SEIR disease
 * models. Typically, it is placed in a model that contains the target SEIR
 * disease model so that its
 * {@link Decorator#updateLabels(org.eclipse.stem.core.model.STEMTime, long)}
 * method will be called after the contained disease model. This ensures that
 * the "next" values that this model collects will be valid by the time it runs.
 * 
 * @see SEIRLabel
 * @see SEIRLabelValue
 * 
 * @model
 */
public interface AggregatingSEIRDiseaseModel extends AggregatingSIRDiseaseModel {
	/**
	 * This is the segment of the type URI that prefixes all other segments in a
	 * standard stochastic SEIR disease model type URI.
	 */
	String URI_TYPE_AGGREGATING_SEIR_DISEASE_MODEL_SEGMENT = URI_TYPE_AGGREGATING_SI_DISEASE_MODEL_SEGMENT
			+ "/SEIR";
} // AggregatingSEIRDiseaseModel
