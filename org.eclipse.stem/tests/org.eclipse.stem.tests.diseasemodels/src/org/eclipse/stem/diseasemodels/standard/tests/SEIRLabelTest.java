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
import org.eclipse.stem.diseasemodels.standard.SEIRLabel;
import org.eclipse.stem.diseasemodels.standard.StandardFactory;
import org.eclipse.stem.tests.util.decorators.DecoratorsFactory;
import org.eclipse.stem.tests.util.decorators.TestNodeDecorator1;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>SEIR Label</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
@SuppressWarnings("all")
public class SEIRLabelTest extends StandardDiseaseModelLabelTest {
	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param args
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SEIRLabelTest.class);
	}

	/**
	 * Constructs a new SEIR Label test case with the given name. <!--
	 * begin-user-doc -->
	 * 
	 * @param name
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEIRLabelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this SEIR Label test case.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SEIRLabel getFixture() {
		return (SEIRLabel)fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(createFixture());
	} // setUp

	/**
	 * @return an SEIRLabel instance
	 */
	public static SEIRLabel createFixture() {
		final SEIRLabel retValue = StandardFactory.eINSTANCE.createSEIRLabel();
		final Region node = DiseaseModelTestUtil
				.createPopulationRegionNode(DiseaseModelTestUtil.TEST_POPULATION_IDENTIFIER);
		final TestNodeDecorator1 tnd = DecoratorsFactory.eINSTANCE
				.createTestNodeDecorator1();
		retValue.setDecorator(tnd);
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
	 * test that the fixture is sane
	 */
	public void testFixtureSanity() {
		final SEIRLabel seirLabel = getFixture();
		assertTrue(seirLabel.sane());
	} // testFixtureSanity

} // SEIRLabelTest
