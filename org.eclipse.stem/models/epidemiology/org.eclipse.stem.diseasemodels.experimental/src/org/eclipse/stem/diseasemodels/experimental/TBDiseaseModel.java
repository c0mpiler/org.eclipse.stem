package org.eclipse.stem.diseasemodels.experimental;

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

import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TB Disease Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.experimental.TBDiseaseModel#getTransmissionRate <em>Transmission Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.experimental.TBDiseaseModel#getActiveInfProb <em>Active Inf Prob</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.diseasemodels.experimental.ExperimentalPackage#getTBDiseaseModel()
 * @model
 * @generated
 */
public interface TBDiseaseModel extends StandardDiseaseModel {

	/**
	 * Returns the value of the '<em><b>Transmission Rate</b></em>' attribute.
	 * The default value is <code>"1.2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Rate</em>' attribute.
	 * @see #setTransmissionRate(double)
	 * @see org.eclipse.stem.diseasemodels.experimental.ExperimentalPackage#getTBDiseaseModel_TransmissionRate()
	 * @model default="1.2"
	 * @generated
	 */
	double getTransmissionRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.experimental.TBDiseaseModel#getTransmissionRate <em>Transmission Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Rate</em>' attribute.
	 * @see #getTransmissionRate()
	 * @generated
	 */
	void setTransmissionRate(double value);

	/**
	 * Returns the value of the '<em><b>Active Inf Prob</b></em>' attribute.
	 * The default value is <code>"0.8"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Inf Prob</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Inf Prob</em>' attribute.
	 * @see #setActiveInfProb(double)
	 * @see org.eclipse.stem.diseasemodels.experimental.ExperimentalPackage#getTBDiseaseModel_ActiveInfProb()
	 * @model default="0.8"
	 * @generated
	 */
	double getActiveInfProb();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.experimental.TBDiseaseModel#getActiveInfProb <em>Active Inf Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Inf Prob</em>' attribute.
	 * @see #getActiveInfProb()
	 * @generated
	 */
	void setActiveInfProb(double value);
} // TBDiseaseModel
