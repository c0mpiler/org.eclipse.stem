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
package org.eclipse.stem.diseasemodels.standard;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disease Initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseInitializer#getTargetISOKey <em>Target ISO Key</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseInitializer#getTargetURI <em>Target URI</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseInitializer#getCompartments <em>Compartments</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseInitializer#getCompartmentValues <em>Compartment Values</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseInitializer#isUseFractions <em>Use Fractions</em>}</li>
 * </ul>
 *
 * @see org.eclipse.stem.diseasemodels.standard.StandardPackage#getStandardDiseaseInitializer()
 * @model
 * @generated
 */
public interface StandardDiseaseInitializer extends DiseaseInitializer {
	/**
	 * Returns the value of the '<em><b>Target ISO Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target ISO Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target ISO Key</em>' attribute.
	 * @see #setTargetISOKey(String)
	 * @see org.eclipse.stem.diseasemodels.standard.StandardPackage#getStandardDiseaseInitializer_TargetISOKey()
	 * @model
	 * @generated
	 */
	String getTargetISOKey();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseInitializer#getTargetISOKey <em>Target ISO Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target ISO Key</em>' attribute.
	 * @see #getTargetISOKey()
	 * @generated
	 */
	void setTargetISOKey(String value);

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
	 * @see org.eclipse.stem.diseasemodels.standard.StandardPackage#getStandardDiseaseInitializer_TargetURI()
	 * @model dataType="org.eclipse.stem.core.common.URI"
	 * @generated
	 */
	URI getTargetURI();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseInitializer#getTargetURI <em>Target URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target URI</em>' attribute.
	 * @see #getTargetURI()
	 * @generated
	 */
	void setTargetURI(URI value);

	/**
	 * Returns the value of the '<em><b>Compartments</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartments</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartments</em>' attribute list.
	 * @see org.eclipse.stem.diseasemodels.standard.StandardPackage#getStandardDiseaseInitializer_Compartments()
	 * @model default=""
	 * @generated
	 */
	EList<String> getCompartments();

	/**
	 * Returns the value of the '<em><b>Compartment Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartment Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartment Values</em>' attribute list.
	 * @see org.eclipse.stem.diseasemodels.standard.StandardPackage#getStandardDiseaseInitializer_CompartmentValues()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	EList<Double> getCompartmentValues();

	/**
	 * Returns the value of the '<em><b>Use Fractions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Fractions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Fractions</em>' attribute.
	 * @see #setUseFractions(boolean)
	 * @see org.eclipse.stem.diseasemodels.standard.StandardPackage#getStandardDiseaseInitializer_UseFractions()
	 * @model
	 * @generated
	 */
	boolean isUseFractions();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseInitializer#isUseFractions <em>Use Fractions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Fractions</em>' attribute.
	 * @see #isUseFractions()
	 * @generated
	 */
	void setUseFractions(boolean value);

} // StandardDiseaseInitializer
