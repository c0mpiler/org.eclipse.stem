package org.eclipse.stem.analysis;
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

import org.eclipse.emf.ecore.EObject;


/**
 * 
 * @author edlund
 * @model
 */
public interface ErrorFunction extends EObject {

	/**
	 * Returns the value of the '<em><b>Reference Data Compartment</b></em>' attribute.
	 * The default value is <code>"Incidence"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Data Compartment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Data Compartment</em>' attribute.
	 * @see #setReferenceDataCompartment(String)
	 * @see org.eclipse.stem.analysis.AnalysisPackage#getErrorFunction_ReferenceDataCompartment()
	 * @model default="Incidence"
	 * @generated
	 */
	String getReferenceDataCompartment();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.analysis.ErrorFunction#getReferenceDataCompartment <em>Reference Data Compartment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Data Compartment</em>' attribute.
	 * @see #getReferenceDataCompartment()
	 * @generated
	 */
	void setReferenceDataCompartment(String value);

	/**
	 * Returns the value of the '<em><b>Comparison Compartment</b></em>' attribute.
	 * The default value is <code>"Incidence"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparison Compartment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Compartment</em>' attribute.
	 * @see #setComparisonCompartment(String)
	 * @see org.eclipse.stem.analysis.AnalysisPackage#getErrorFunction_ComparisonCompartment()
	 * @model default="Incidence"
	 * @generated
	 */
	String getComparisonCompartment();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.analysis.ErrorFunction#getComparisonCompartment <em>Comparison Compartment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison Compartment</em>' attribute.
	 * @see #getComparisonCompartment()
	 * @generated
	 */
	void setComparisonCompartment(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ErrorResult calculateError(ReferenceScenarioDataMap reference, ReferenceScenarioDataMap data);

}
