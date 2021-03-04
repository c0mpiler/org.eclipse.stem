package org.eclipse.stem.core.predicate.tests;

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

import org.eclipse.stem.core.predicate.ModulusTimeTest;
import org.eclipse.stem.core.predicate.PredicateFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Modulus Time Test</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModulusTimeTestTest extends TimeTestTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModulusTimeTestTest.class);
	}

	/**
	 * Constructs a new Modulus Time Test test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModulusTimeTestTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Modulus Time Test test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ModulusTimeTest getFixture() {
		return (ModulusTimeTest)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PredicateFactory.eINSTANCE.createModulusTimeTest());
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

	/**
	 * @see org.eclipse.stem.core.predicate.tests.PredicateTest#getExpectedResult()
	 */
	@Override
	protected boolean getExpectedResult() {
		return true;
	}

} //ModulusTimeTestTest
