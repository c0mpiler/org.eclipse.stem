package org.eclipse.stem.definitions.labels.tests;

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

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.eclipse.stem.definitions.labels.LabelsFactory;
import org.eclipse.stem.definitions.labels.PopulationLabel;
import org.eclipse.stem.definitions.labels.PopulationLabelValue;
import org.eclipse.stem.definitions.labels.impl.PopulationLabelImpl;
import org.eclipse.stem.definitions.nodes.Region;
import org.eclipse.stem.definitions.nodes.tests.RegionTest;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Population Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.stem.definitions.labels.PopulationLabel#getCurrentPopulationValue() <em>Current Population Value</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
@SuppressWarnings("all")
public class PopulationLabelTest extends TestCase {
	/**
	 * The fixture for this Population Label test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PopulationLabel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param args
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PopulationLabelTest.class);
	}

	/**
	 * Constructs a new Population Label test case with the given name. <!--
	 * begin-user-doc -->
	 * 
	 * @param name
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopulationLabelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Population Label test case.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PopulationLabel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Population Label test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PopulationLabel getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	protected void setUp() throws Exception {
		setFixture(createFixture());
	} // setUp

	/**
	 * @return a PopulationLabel with human population
	 */
	public static PopulationLabel createFixture() {
		return LabelsFactory.eINSTANCE.createPopulationLabel();
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
	 * Tests the '{@link org.eclipse.stem.definitions.labels.PopulationLabel#getCurrentPopulationValue() <em>Current Population Value</em>}'
	 * feature getter. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.stem.definitions.labels.PopulationLabel#getCurrentPopulationValue()
	 * @generated NOT
	 */
	public void testGetCurrentPopulationValue() {
		final PopulationLabel populationLabel = getFixture();

		final PopulationLabelValue value = populationLabel
				.getCurrentPopulationValue();
		assertTrue(value.getCount() == 0);
	} // testGetCurrentPopulationValue

	/**
	 * Make sure the fixture makes sense.
	 */
	public void testFixture() {
		final PopulationLabel populationLabel = getFixture();
		assertNotNull(populationLabel);
		assertTrue(populationLabel.sane());
		assertTrue(populationLabel.getPopulationIdentifier().equals(
				PopulationLabel.HUMAN));
		assertTrue(populationLabel.getPopulationIdentifier().equals(PopulationLabel.HUMAN));
	} // testFixture

	/**
	 * Test the the static method getPopulationLabel actually gets the
	 * population label
	 */
	public void testGetPopulationLabel() {
		final Region fixture = RegionTest.createFixture();
		final PopulationLabel populationLabel = PopulationLabelImpl
				.getPopulationLabel(createFixture().getPopulationIdentifier(),
						fixture);
		assertNotNull(populationLabel);
	} // testGetPopulationLabel

} // PopulationLabelTest
