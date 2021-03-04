// StochasticDiseaseModel.java
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

import java.util.Random;

import org.eclipse.emf.ecore.EObject;

/**
 * This interface defines an EMF model
 * @model abstract="true"
 * @deprecated
 */
public interface StochasticDiseaseModel extends EObject {

	
	/**
	 * @return the seed used to initialize the random number generator.
	 * @model default="0"
	 */
	long getSeed();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.standard.StochasticDiseaseModel#getSeed <em>Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seed</em>' attribute.
	 * @see #getSeed()
	 * @generated
	 */
	void setSeed(long value);

	/**
	 * @model changeable="false" default="0"
	 */
	Random getRandomGenerator();
} // StochasticDiseaseModel