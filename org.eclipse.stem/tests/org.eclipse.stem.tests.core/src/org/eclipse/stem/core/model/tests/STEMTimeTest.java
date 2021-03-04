package org.eclipse.stem.core.model.tests;

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

import org.eclipse.stem.core.model.ModelFactory;
import org.eclipse.stem.core.model.STEMTime;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>STEM Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.stem.core.model.STEMTime#addIncrement(long) <em>Add Increment</em>}</li>
 *   <li>{@link org.eclipse.stem.core.model.STEMTime#valueEquals(org.eclipse.stem.core.model.STEMTime) <em>Value Equals</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
@SuppressWarnings("all")
public class STEMTimeTest extends TestCase {

	// One day's worth of milliseconds
	private static final long TEST_INCREMENT = 24 * 60 * 60 * 1000;

	/**
	 * The fixture for this STEM Time test case.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected STEMTime fixture = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(STEMTimeTest.class);
	}

	/**
	 * Constructs a new STEM Time test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public STEMTimeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this STEM Time test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(STEMTime fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this STEM Time test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected STEMTime getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createSTEMTime());
	}

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
	 * Tests the '{@link org.eclipse.stem.core.model.STEMTime#addIncrement(long) <em>Add Increment</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.stem.core.model.STEMTime#addIncrement(long)
	 * @generated NOT
	 */
	public void testAddIncrement__long() {
		final STEMTime startTime = getFixture();
		final STEMTime newTime = startTime.addIncrement(TEST_INCREMENT);
		assertTrue(newTime.getTime().compareTo(startTime.getTime()) > 0);
		assertTrue(newTime.getTime().getTime() - startTime.getTime().getTime() == TEST_INCREMENT);
	} // testAddIncrement__long

	/**
	 * Tests the '{@link org.eclipse.stem.core.model.STEMTime#valueEquals(org.eclipse.stem.core.model.STEMTime) <em>Value Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.core.model.STEMTime#valueEquals(org.eclipse.stem.core.model.STEMTime)
	 * @generated
	 */
	public void testValueEquals__STEMTime() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.stem.core.model.STEMTime#valueEquals(java.lang.Object) <em>Value Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.core.model.STEMTime#valueEquals(java.lang.Object)
	 * @generated NOT
	 */
	public void testValueEquals__Object() {
		final STEMTime time1 = getFixture();
		final STEMTime time1a = getFixture();
		assertTrue(time1.valueEquals( time1a));
		final STEMTime time2 = time1a.addIncrement(TEST_INCREMENT);
		assertFalse(time1.valueEquals( time2));
		
	}

} // STEMTimeTest
