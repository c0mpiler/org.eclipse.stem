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

import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.predicate.TimeTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Time Test</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public abstract class TimeTestTest extends TestTest {

	protected STEMTime currentTimeToTest = null;

	/**
	 * Constructs a new Time Test test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeTestTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Time Test test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TimeTest getFixture() {
		return (TimeTest)fixture;
	}

	/**
	 * @see org.eclipse.stem.core.predicate.tests.PredicateTest#getCurrentTimetoTest()
	 */
	@Override
	protected STEMTime getCurrentTimetoTest() {
		return currentTimeToTest;
	}

	/**
	 * @see org.eclipse.stem.core.predicate.tests.PredicateTest#getElapsedTimeToTest()
	 */
	@Override
	protected long getElapsedTimeToTest() {
		return STEMTime.Units.DAY.getMilliseconds();
	}

} // TimeTestTest
