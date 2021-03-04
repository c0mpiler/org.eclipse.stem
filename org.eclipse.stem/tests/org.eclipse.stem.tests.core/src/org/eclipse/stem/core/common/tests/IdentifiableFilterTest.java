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

import org.eclipse.stem.core.common.IdentifiableFilter;
import org.eclipse.stem.core.common.impl.IdentifiableFilterImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Identifiable Filter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdentifiableFilterTest extends TestCase {
	
	private static final String INITIAL_VALUE = "US";

	/**
	 * The fixture for this Identifiable Filter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifiableFilter fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IdentifiableFilterTest.class);
	}

	/**
	 * Constructs a new Identifiable Filter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifiableFilterTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Identifiable Filter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(IdentifiableFilter fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Identifiable Filter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifiableFilter getFixture() {
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
		// use the Impl for testing, should accept the String argument
		IdentifiableFilterImpl testValue = new IdentifiableFilterImpl(INITIAL_VALUE);
		setFixture(testValue);
	}
	
	/**
	 *
	 */
	public void testIsValid() {
		IdentifiableFilter filter = getFixture();
		//TODO what is there to test here?
		// Nothing to test. No Sane Method implemented yet
		assertTrue(true);
	}
	

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

} //IdentifiableFilterTest
