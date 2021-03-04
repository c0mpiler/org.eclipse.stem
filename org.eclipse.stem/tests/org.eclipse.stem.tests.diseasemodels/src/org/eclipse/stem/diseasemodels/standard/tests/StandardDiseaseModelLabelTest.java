package org.eclipse.stem.diseasemodels.standard.tests;

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

import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Disease Model Label</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public abstract class StandardDiseaseModelLabelTest extends
		DiseaseModelLabelTest {
	/**
	 * Constructs a new Disease Model Label test case with the given name. <!--
	 * begin-user-doc -->
	 * 
	 * @param name
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardDiseaseModelLabelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Disease Model Label test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected StandardDiseaseModelLabel getFixture() {
		return (StandardDiseaseModelLabel)fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel#getCurrentStandardDiseaseModelLabelValue() <em>Current Standard Disease Model Label Value</em>}'
	 * feature getter. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel#getCurrentStandardDiseaseModelLabelValue()
	 * @generated NOT
	 */
	public void testGetCurrentStandardDiseaseModelLabelValue() {
		final StandardDiseaseModelLabel standardLabel = getFixture();
		final StandardDiseaseModelLabelValue value = (StandardDiseaseModelLabelValue)standardLabel
				.getCurrentValue();
		assertNotNull(value);
	} // testGetCurrentStandardDiseaseModelLabelValue

	/**
	 * Tests the '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel#getNextStandardDiseaseModelLabelValue() <em>Next Standard Disease Model Label Value</em>}'
	 * feature getter. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel#getNextStandardDiseaseModelLabelValue()
	 * @generated NOT
	 */
	public void testGetNextStandardDiseaseModelLabelValue() {
		final StandardDiseaseModelLabel standardLabel = getFixture();
		final StandardDiseaseModelLabelValue value = (StandardDiseaseModelLabelValue)standardLabel
				.getNextValue();
		assertNotNull(value);
	} // testGetNextStandardDiseaseModelLabelValue

} // StandardDiseaseModelLabelTest
