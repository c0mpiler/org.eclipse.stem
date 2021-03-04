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
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gaussian Forcing Disease Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.forcing.GaussianForcingDiseaseModel#getSigma2 <em>Sigma2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.forcing.GaussianForcingDiseaseModel#getModulationPeriod <em>Modulation Period</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.forcing.GaussianForcingDiseaseModel#getModulationPhaseShift <em>Modulation Phase Shift</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.forcing.GaussianForcingDiseaseModel#getModulationFloor <em>Modulation Floor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.diseasemodels.forcing.ForcingPackage#getGaussianForcingDiseaseModel()
 * @model
 * @generated
 */
public interface GaussianForcingDiseaseModel extends SIR {

	/**
	 * Returns the value of the '<em><b>Sigma2</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sigma2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sigma2</em>' attribute.
	 * @see #setSigma2(double)
	 * @see org.eclipse.stem.diseasemodels.forcing.ForcingPackage#getGaussianForcingDiseaseModel_Sigma2()
	 * @model default="100"
	 * @generated
	 */
	double getSigma2();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.forcing.GaussianForcingDiseaseModel#getSigma2 <em>Sigma2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sigma2</em>' attribute.
	 * @see #getSigma2()
	 * @generated
	 */
	void setSigma2(double value);

	/**
	 * Returns the value of the '<em><b>Modulation Period</b></em>' attribute.
	 * The default value is <code>"365.25"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modulation Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modulation Period</em>' attribute.
	 * @see #setModulationPeriod(double)
	 * @see org.eclipse.stem.diseasemodels.forcing.ForcingPackage#getGaussianForcingDiseaseModel_ModulationPeriod()
	 * @model default="365.25"
	 * @generated
	 */
	double getModulationPeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.forcing.GaussianForcingDiseaseModel#getModulationPeriod <em>Modulation Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modulation Period</em>' attribute.
	 * @see #getModulationPeriod()
	 * @generated
	 */
	void setModulationPeriod(double value);

	/**
	 * Returns the value of the '<em><b>Modulation Phase Shift</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modulation Phase Shift</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modulation Phase Shift</em>' attribute.
	 * @see #setModulationPhaseShift(double)
	 * @see org.eclipse.stem.diseasemodels.forcing.ForcingPackage#getGaussianForcingDiseaseModel_ModulationPhaseShift()
	 * @model default="0"
	 * @generated
	 */
	double getModulationPhaseShift();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.forcing.GaussianForcingDiseaseModel#getModulationPhaseShift <em>Modulation Phase Shift</em>}' attribute.
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
	 * @see org.eclipse.stem.diseasemodels.forcing.ForcingPackage#getGaussianForcingDiseaseModel_ModulationFloor()
	 * @model default="0.6"
	 * @generated
	 */
	double getModulationFloor();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.forcing.GaussianForcingDiseaseModel#getModulationFloor <em>Modulation Floor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modulation Floor</em>' attribute.
	 * @see #getModulationFloor()
	 * @generated
	 */
	void setModulationFloor(double value);
} // GaussianForcingDiseaseModel
