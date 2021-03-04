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

import junit.framework.TestCase;

import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.predicate.Predicate;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.stem.core.predicate.Predicate#evaluate(org.eclipse.stem.core.model.STEMTime, long, org.eclipse.stem.core.graph.Graph) <em>Evaluate</em>}</li>
 *   <li>{@link org.eclipse.stem.core.predicate.Predicate#reset() <em>Reset</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class PredicateTest extends TestCase {

	/**
	 * The fixture for this Predicate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Predicate fixture = null;

	/**
	 * Constructs a new Predicate test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Predicate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Predicate fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Predicate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	//@Override
	protected Predicate getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.stem.core.predicate.Predicate#evaluate(org.eclipse.stem.core.model.STEMTime, long, org.eclipse.stem.core.graph.Graph) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.core.predicate.Predicate#evaluate(org.eclipse.stem.core.model.STEMTime, long, org.eclipse.stem.core.graph.Graph)
	 * @generated NOT
	 */
	public void testEvaluate__STEMTime_long_Graph() {
		final Predicate fixture = getFixture();
		final STEMTime currentTime = getCurrentTimetoTest();
		final long elapsedTime = getElapsedTimeToTest();
		final boolean result = fixture.evaluate(currentTime, elapsedTime,  null);
		assertTrue (result == getExpectedResult());
	} // testEvaluate__STEMTime_long_Graph
	
	/**
	 * Tests the '{@link org.eclipse.stem.core.predicate.Predicate#reset() <em>Reset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.core.predicate.Predicate#reset()
	 * @generated
	 */
	public void testReset() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.stem.core.predicate.Predicate#reset() <em>Reset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.core.predicate.Predicate#reset()
	 * @generated NOT
	 */
//	public void testReset() {
//		// TODO: implement this operation test method
//		// Ensure that you remove @generated or mark it @generated NOT
//		fail();
//	}

	/**
	 * @return
	 */
	protected long getElapsedTimeToTest() {
		return 0L;
	}

	/**
	 * @return
	 */
	protected STEMTime getCurrentTimetoTest() {
		return null;
	}

	/**
	 * @return the expected result of calling getFixture.evaluate();
	 */
	abstract protected boolean getExpectedResult();

} //PredicateTest
