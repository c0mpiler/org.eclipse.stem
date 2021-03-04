// DiseaseModelLabelValue.java
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

import org.eclipse.stem.core.graph.IntegrationLabelValue;

/**
 * This interface defines a class in an EMF model for an disease model label
 * value. The values of this label record the number of population members who
 * have been "born" and who have "died".
 * 
 * @model abstract="true"
 */

public interface DiseaseModelLabelValue extends IntegrationLabelValue {

	/**
	 * This is the maximum value for any population.
	 */
	double MAX_POPULATION_VALUE = 1e12;

	/**
	 * @return the sum of the living population members in all states
	 * 
	 * @model volatile="true" transient="true" changeable="false"
	 */
	double getPopulationCount();
} // DiseaseModelLabelValue
