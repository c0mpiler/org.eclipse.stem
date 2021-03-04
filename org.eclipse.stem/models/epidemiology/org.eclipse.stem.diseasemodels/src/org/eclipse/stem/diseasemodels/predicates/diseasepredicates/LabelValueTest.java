package org.eclipse.stem.diseasemodels.predicates.diseasepredicates;

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

import org.eclipse.emf.common.util.URI;
import org.eclipse.stem.core.predicate.Test;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Value Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.predicates.diseasepredicates.LabelValueTest#getModelName <em>Model Name</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.predicates.diseasepredicates.LabelValueTest#getTargetURI <em>Target URI</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.predicates.diseasepredicates.LabelValueTest#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.predicates.diseasepredicates.LabelValueTest#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.predicates.diseasepredicates.LabelValueTest#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.predicates.diseasepredicates.LabelValueTest#getPopulationIdentifier <em>Population Identifier</em>}</li>
 * </ul>
 *
 * @see org.eclipse.stem.diseasemodels.predicates.diseasepredicates.DiseasepredicatesPackage#getLabelValueTest()
 * @model
 * @generated
 */
public interface LabelValueTest extends Test {
	/**
	 * Returns the value of the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Name</em>' attribute.
	 * @see #setModelName(String)
	 * @see org.eclipse.stem.diseasemodels.predicates.diseasepredicates.DiseasepredicatesPackage#getLabelValueTest_ModelName()
	 * @model
	 * @generated
	 */
	String getModelName();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.predicates.diseasepredicates.LabelValueTest#getModelName <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Name</em>' attribute.
	 * @see #getModelName()
	 * @generated
	 */
	void setModelName(String value);

	/**
	 * Returns the value of the '<em><b>Target URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target URI</em>' attribute.
	 * @see #setTargetURI(URI)
	 * @see org.eclipse.stem.diseasemodels.predicates.diseasepredicates.DiseasepredicatesPackage#getLabelValueTest_TargetURI()
	 * @model dataType="org.eclipse.stem.core.common.URI"
	 * @generated
	 */
	URI getTargetURI();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.predicates.diseasepredicates.LabelValueTest#getTargetURI <em>Target URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target URI</em>' attribute.
	 * @see #getTargetURI()
	 * @generated
	 */
	void setTargetURI(URI value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The default value is <code>"incidence"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see org.eclipse.stem.diseasemodels.predicates.diseasepredicates.DiseasepredicatesPackage#getLabelValueTest_State()
	 * @model default="incidence"
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.predicates.diseasepredicates.LabelValueTest#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' attribute.
	 * @see #setThreshold(double)
	 * @see org.eclipse.stem.diseasemodels.predicates.diseasepredicates.DiseasepredicatesPackage#getLabelValueTest_Threshold()
	 * @model default="100"
	 * @generated
	 */
	double getThreshold();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.predicates.diseasepredicates.LabelValueTest#getThreshold <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' attribute.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(double value);

	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' attribute.
	 * The default value is <code>">"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' attribute.
	 * @see #setPredicate(String)
	 * @see org.eclipse.stem.diseasemodels.predicates.diseasepredicates.DiseasepredicatesPackage#getLabelValueTest_Predicate()
	 * @model default=">"
	 * @generated
	 */
	String getPredicate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.predicates.diseasepredicates.LabelValueTest#getPredicate <em>Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' attribute.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(String value);

	/**
	 * Returns the value of the '<em><b>Population Identifier</b></em>' attribute.
	 * The default value is <code>"human"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Population Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population Identifier</em>' attribute.
	 * @see #setPopulationIdentifier(String)
	 * @see org.eclipse.stem.diseasemodels.predicates.diseasepredicates.DiseasepredicatesPackage#getLabelValueTest_PopulationIdentifier()
	 * @model default="human"
	 * @generated
	 */
	String getPopulationIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.predicates.diseasepredicates.LabelValueTest#getPopulationIdentifier <em>Population Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population Identifier</em>' attribute.
	 * @see #getPopulationIdentifier()
	 * @generated
	 */
	void setPopulationIdentifier(String value);

} // LabelValueTest
