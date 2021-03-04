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

import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TB Disease Model Label Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.experimental.TBDiseaseModelLabelValue#getIl <em>Il</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.experimental.TBDiseaseModelLabelValue#getIa <em>Ia</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.diseasemodels.experimental.ExperimentalPackage#getTBDiseaseModelLabelValue()
 * @model
 * @generated
 */
public interface TBDiseaseModelLabelValue extends StandardDiseaseModelLabelValue {
	/**
	 * Returns the value of the '<em><b>Il</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Il</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Il</em>' attribute.
	 * @see #setIl(double)
	 * @see org.eclipse.stem.diseasemodels.experimental.ExperimentalPackage#getTBDiseaseModelLabelValue_Il()
	 * @model default="0.0"
	 * @generated
	 */
	double getIl();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.experimental.TBDiseaseModelLabelValue#getIl <em>Il</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Il</em>' attribute.
	 * @see #getIl()
	 * @generated
	 */
	void setIl(double value);

	/**
	 * Returns the value of the '<em><b>Ia</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ia</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ia</em>' attribute.
	 * @see #setIa(double)
	 * @see org.eclipse.stem.diseasemodels.experimental.ExperimentalPackage#getTBDiseaseModelLabelValue_Ia()
	 * @model default="0.0"
	 * @generated
	 */
	double getIa();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.experimental.TBDiseaseModelLabelValue#getIa <em>Ia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ia</em>' attribute.
	 * @see #getIa()
	 * @generated
	 */
	void setIa(double value);

} // TBDiseaseModelLabelValue
