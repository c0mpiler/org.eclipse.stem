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
import org.eclipse.stem.diseasemodels.standard.SIRLabel;
import org.eclipse.stem.diseasemodels.standard.StandardFactory;
import org.eclipse.stem.tests.util.decorators.DecoratorsFactory;
import org.eclipse.stem.tests.util.decorators.TestNodeDecorator1;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>SIR Label</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
@SuppressWarnings("all")
public class SIRLabelTest extends StandardDiseaseModelLabelTest {
	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param args
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SIRLabelTest.class);
	}

	/**
	 * Constructs a new SIR Label test case with the given name. <!--
	 * begin-user-doc -->
	 * 
	 * @param name
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SIRLabelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this SIR Label test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SIRLabel getFixture() {
		return (SIRLabel)fixture;
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
	 * @return an SIRLabel instance
	 */
	public static SIRLabel createFixture() {
		final SIRLabel retValue = StandardFactory.eINSTANCE.createSIRLabel();
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
	public void testFixtureSane() {
		final SIRLabel sirLabel = getFixture();
		assertTrue(sirLabel.sane());
	} // testFixtureSane

} // SIRLabelTest
