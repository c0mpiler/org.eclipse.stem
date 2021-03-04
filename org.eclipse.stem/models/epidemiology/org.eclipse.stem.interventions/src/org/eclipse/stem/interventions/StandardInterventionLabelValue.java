package org.eclipse.stem.interventions;

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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard Intervention Label Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.interventions.StandardInterventionLabelValue#getVaccinations <em>Vaccinations</em>}</li>
 *   <li>{@link org.eclipse.stem.interventions.StandardInterventionLabelValue#getIsolations <em>Isolations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.interventions.InterventionsPackage#getStandardInterventionLabelValue()
 * @model
 * @generated
 */
public interface StandardInterventionLabelValue extends InterventionLabelValue {
	/**
	 * Returns the value of the '<em><b>Vaccinations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vaccinations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vaccinations</em>' attribute.
	 * @see #setVaccinations(double)
	 * @see org.eclipse.stem.interventions.InterventionsPackage#getStandardInterventionLabelValue_Vaccinations()
	 * @model
	 * @generated
	 */
	double getVaccinations();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.interventions.StandardInterventionLabelValue#getVaccinations <em>Vaccinations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vaccinations</em>' attribute.
	 * @see #getVaccinations()
	 * @generated
	 */
	void setVaccinations(double value);

	/**
	 * Returns the value of the '<em><b>Isolations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isolations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isolations</em>' attribute.
	 * @see #setIsolations(double)
	 * @see org.eclipse.stem.interventions.InterventionsPackage#getStandardInterventionLabelValue_Isolations()
	 * @model
	 * @generated
	 */
	double getIsolations();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.interventions.StandardInterventionLabelValue#getIsolations <em>Isolations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isolations</em>' attribute.
	 * @see #getIsolations()
	 * @generated
	 */
	void setIsolations(double value);

} // StandardInterventionLabelValue
