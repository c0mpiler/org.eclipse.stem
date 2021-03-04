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

import org.eclipse.stem.definitions.labels.AreaLabel;
import org.eclipse.stem.definitions.labels.LabelsFactory;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Area Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.stem.definitions.labels.AreaLabel#getCurrentAreaValue() <em>Current Area Value</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
@SuppressWarnings("all")
public class AreaLabelTest extends TestCase {
	/**
	 * The fixture for this Area Label test case.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected AreaLabel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param args
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AreaLabelTest.class);
	}

	/**
	 * Constructs a new Area Label test case with the given name. <!--
	 * begin-user-doc -->
	 * 
	 * @param name
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AreaLabelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Area Label test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AreaLabel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Area Label test case.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AreaLabel getFixture() {
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
	 * @return an AreaLabel
	 */
	public static AreaLabel createFixture() {
		final AreaLabel retValue = LabelsFactory.eINSTANCE.createAreaLabel();
		retValue.setCurrentValue(AreaLabelValueTest.createFixture());
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
	 * Tests the '{@link org.eclipse.stem.definitions.labels.AreaLabel#getCurrentAreaValue() <em>Current Area Value</em>}'
	 * feature getter. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.stem.definitions.labels.AreaLabel#getCurrentAreaValue()
	 * @generated NOT
	 */
	public void testGetCurrentAreaValue() {
		final AreaLabel areaLabel = getFixture();
		assertTrue(areaLabel.getCurrentAreaValue().getArea() == AreaLabelValueTest.TEST_AREA_VALUE);
	} // testGetCurrentAreaValue

	/**
	 * Test the sanity of the fixture
	 */
	public void testFixtureSanity() {
		final AreaLabel areaLabel = getFixture();
		assertTrue(areaLabel.sane());
	} // testFixtureSanity

} // AreaLabelTest
