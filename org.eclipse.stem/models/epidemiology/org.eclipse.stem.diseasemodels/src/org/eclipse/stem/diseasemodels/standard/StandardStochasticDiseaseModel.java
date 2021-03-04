// StandardStochastiDiseaseModel.java
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
 * This interface is an EMF model.
 * 
 * @model abstract="true"
 * @deprecated
 */
public interface StandardStochasticDiseaseModel extends StochasticDiseaseModel {


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model default="0.01"
	 */
	public double getGain();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.standard.StandardStochasticDiseaseModel#getGain <em>Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gain</em>' attribute.
	 * @see #getGain()
	 * @generated
	 */
	void setGain(double value);

	/**
	 * @model volatile="true" transient="true" changeable="false"
	 */
	public double computeNoise();
	
} // StandardStochastiDiseaseModel