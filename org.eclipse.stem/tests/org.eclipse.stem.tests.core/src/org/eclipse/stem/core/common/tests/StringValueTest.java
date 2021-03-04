package org.eclipse.stem.core.common.tests;

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

import org.eclipse.stem.core.common.CommonFactory;
import org.eclipse.stem.core.common.StringValue;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>String Value</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StringValueTest extends TestCase {
	
	private static final String TEST_VALUE = "testStringValue";
	private static final String NEXT_VALUE = "testNextString";

	/**
	 * The fixture for this String Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringValue fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StringValueTest.class);
	}

	/**
	 * Constructs a new String Value test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringValueTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this String Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(StringValue fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this String Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringValue getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception { 
		StringValue testValue = CommonFactory.eINSTANCE.createStringValue();
		testValue.setValue(TEST_VALUE);
		setFixture(testValue);
	}
	

	/**
	 * 
	 */
	public void testIsValid() {
		StringValue fixture = getFixture();
		assertTrue(fixture.getValue().equals(TEST_VALUE));
		fixture.setValue(NEXT_VALUE);
		assertTrue(fixture.getValue().equals(NEXT_VALUE));
	} // testIsComplete

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //StringValueTest
