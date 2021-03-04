// ExampleDiseaseModel.java
package org.eclipse.stem.diseasemodels.forcing;

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

import org.eclipse.stem.diseasemodels.standard.SIR;

/**
 * This interface is an EMF Model.
 * 
 * @model
 */
public interface ForcingDiseaseModel extends SIR {
	/**
	 * Returns the value of the '<em><b>Modulation Exponent</b></em>' attribute.
	 * The default value is <code>"2.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modulation Exponent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modulation Exponent</em>' attribute.
	 * @see #setModulationExponent(double)
	 * @see org.eclipse.stem.diseasemodels.forcing.ForcingPackage#getForcingDiseaseModel_ModulationExponent()
	 * @model default="2.0"
	 * @generated
	 */
	double getModulationExponent();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.forcing.ForcingDiseaseModel#getModulationExponent <em>Modulation Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modulation Exponent</em>' attribute.
	 * @see #getModulationExponent()
	 * @generated
	 */
	void setModulationExponent(double value);

	/**
	 * @return the default modulation period is 1 year. This default value assumes time steps in days. Note that one year = 365.256363051 days 
	 * @model default="365.256363051"
	 */
	double getModulationPeriod();
	
	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.forcing.ForcingDiseaseModel#getModulationPeriod <em>Modulation Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modulation Period</em>' attribute.
	 * @see #getModulationPeriod()
	 * @generated
	 */
	void setModulationPeriod(double value);

	/**
	 * @return the modulation phase shift shift. 
	 * @model default="0.0"
	 */
	double getModulationPhaseShift();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.forcing.ForcingDiseaseModel#getModulationPhaseShift <em>Modulation Phase Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modulation Phase Shift</em>' attribute.
	 * @see #getModulationPhaseShift()
	 * @generated
	 */
	void setModulationPhaseShift(double value);

	/**
	 * Returns the value of the '<em><b>Modulation Floor</b></em>' attribute.
	 * The default value is <code>"0.6"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modulation Floor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modulation Floor</em>' attribute.
	 * @see #setModulationFloor(double)
	 * @see org.eclipse.stem.diseasemodels.forcing.ForcingPackage#getForcingDiseaseModel_ModulationFloor()
	 * @model default="0.6"
	 * @generated
	 */
	double getModulationFloor();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.forcing.ForcingDiseaseModel#getModulationFloor <em>Modulation Floor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modulation Floor</em>' attribute.
	 * @see #getModulationFloor()
	 * @generated
	 */
	void setModulationFloor(double value);
} // ExampleDiseaseModel
