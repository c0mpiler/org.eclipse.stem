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
import org.eclipse.stem.definitions.labels.TransportRelationshipLabelValue;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Transport Relationship Label Value</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
@SuppressWarnings("all")
public class TransportRelationshipLabelValueTest extends TestCase {
	/**
	 * The fixture for this Transport Relationship Label Value test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TransportRelationshipLabelValue fixture = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TransportRelationshipLabelValueTest.class);
	}

	/**
	 * Constructs a new Transport Relationship Label Value test case with the given name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TransportRelationshipLabelValueTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Transport Relationship Label Value test case.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TransportRelationshipLabelValue fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Transport Relationship Label Value test case.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TransportRelationshipLabelValue getFixture() {
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	public static TransportRelationshipLabelValue createFixture() {
		final TransportRelationshipLabelValue retValue = LabelsFactory.eINSTANCE
				.createTransportRelationshipLabelValue();
		return retValue;
	} // createFixture

	/**
	 * Test that the fixture is sane.
	 */
	public void testFixtureSanity() {
		final TransportRelationshipLabelValue fixture = getFixture();
		assertTrue(fixture.sane());
	} // testFixtureSanity
} // TransportRelationshipLabelValueTest