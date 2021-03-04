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
import org.eclipse.stem.definitions.labels.RelativePhysicalRelationshipLabelValue;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Relative Physical Relationship Label Value</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
@SuppressWarnings("all")
public class RelativePhysicalRelationshipLabelValueTest extends TestCase {
	/**
	 * The fixture for this Relative Physical Relationship Label Value test case.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RelativePhysicalRelationshipLabelValue fixture = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelativePhysicalRelationshipLabelValueTest.class);
	}

	/**
	 * Constructs a new Relative Physical Relationship Label Value test case with the given name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RelativePhysicalRelationshipLabelValueTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Relative Physical Relationship Label Value test case.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RelativePhysicalRelationshipLabelValue fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Relative Physical Relationship Label Value test case.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RelativePhysicalRelationshipLabelValue getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LabelsFactory.eINSTANCE.createRelativePhysicalRelationshipLabelValue());
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
	 * Test that the fixture is sane.
	 */
	public void testFixtureSanity() {
		final RelativePhysicalRelationshipLabelValue fixture = getFixture();
		assertTrue(fixture.sane());
	} // testFixtureSanity

} // RelativePhysicalRelationshipLabelValueTest
