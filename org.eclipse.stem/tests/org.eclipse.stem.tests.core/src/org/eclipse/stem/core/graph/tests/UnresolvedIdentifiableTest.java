package org.eclipse.stem.core.graph.tests;

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

import org.eclipse.stem.core.graph.GraphFactory;
import org.eclipse.stem.core.graph.UnresolvedIdentifiable;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unresolved Identifiable</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
@SuppressWarnings("all")
public class UnresolvedIdentifiableTest extends TestCase {
	/**
	 * The fixture for this Unresolved Identifiable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnresolvedIdentifiable fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UnresolvedIdentifiableTest.class);
	}

	/**
	 * Constructs a new Unresolved Identifiable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnresolvedIdentifiableTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Unresolved Identifiable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(UnresolvedIdentifiable fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Unresolved Identifiable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnresolvedIdentifiable getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GraphFactory.eINSTANCE.createUnresolvedIdentifiable());
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
	 * Keep JUnit quiet
	 */
	public void testKeepJUnitQuiet() {
		assertTrue(true);
	}
} //UnresolvedIdentifiableTest
