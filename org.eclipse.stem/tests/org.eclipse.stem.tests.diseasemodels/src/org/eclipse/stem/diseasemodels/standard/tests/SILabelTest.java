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

import junit.textui.TestRunner;

import org.eclipse.stem.definitions.nodes.Region;
import org.eclipse.stem.diseasemodels.standard.SILabel;
import org.eclipse.stem.diseasemodels.standard.SILabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardFactory;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>SI Label</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
@SuppressWarnings("all")
public class SILabelTest extends StandardDiseaseModelLabelTest {
	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param args
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SILabelTest.class);
	}

	/**
	 * Constructs a new SI Label test case with the given name. <!--
	 * begin-user-doc -->
	 * 
	 * @param name
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SILabelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this SI Label test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SILabel getFixture() {
		return (SILabel)fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	protected void setUp() throws Exception {
		setFixture(createFixture());
	}

	/**
	 * @return an SILabel instance
	 */
	public static SILabel createFixture() {
		final SILabel retValue = StandardFactory.eINSTANCE.createSILabel();
		final Region node = DiseaseModelTestUtil
				.createPopulationRegionNode(DiseaseModelTestUtil.TEST_POPULATION_IDENTIFIER);

		DiseaseModelLabelTest.labelRegion(retValue,
				DiseaseModelTestUtil.TEST_POPULATION_IDENTIFIER, node);
		return retValue;
	} // createFixture

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link org.eclipse.stem.diseasemodels.standard.SILabel#getCurrentSIValue() <em>Current SI Value</em>}'
	 * feature getter. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.stem.diseasemodels.standard.SILabel#getCurrentSIValue()
	 * @generated NOT
	 */
	public void testGetCurrentSIValue() {
		final SILabel standardLabel = getFixture();
		final SILabelValue value = (SILabelValue)standardLabel.getCurrentValue();
		assertNotNull(value);
	} // testGetCurrentSIValue

	/**
	 * Tests the '{@link org.eclipse.stem.diseasemodels.standard.SILabel#getNextSIValue() <em>Next SI Value</em>}'
	 * feature getter. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.stem.diseasemodels.standard.SILabel#getNextSIValue()
	 * @generated NOT
	 */
	public void testGetNextSIValue() {
		final SILabel standardLabel = getFixture();
		final SILabelValue value = (SILabelValue)standardLabel.getNextValue();
		assertNotNull(value);
	} // testGetNextSIValue

} // SILabelTest