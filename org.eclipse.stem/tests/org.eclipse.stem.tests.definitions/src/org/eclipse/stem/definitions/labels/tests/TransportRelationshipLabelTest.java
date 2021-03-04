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
import org.eclipse.stem.definitions.labels.TransportRelationshipLabel;
import org.eclipse.stem.tests.util.decorators.DecoratorsFactory;
import org.eclipse.stem.tests.util.decorators.TestEdgeDecorator1;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Transport Relationship Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.stem.definitions.labels.TransportRelationshipLabel#getCurrentTransportRelationshipLabelValue() <em>Current Transport Relationship Label Value</em>}</li>
 *   <li>{@link org.eclipse.stem.definitions.labels.TransportRelationshipLabel#getDepartureCapacity() <em>Departure Capacity</em>}</li>
 *   <li>{@link org.eclipse.stem.definitions.labels.TransportRelationshipLabel#getCapacity() <em>Capacity</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
@SuppressWarnings("all")
public class TransportRelationshipLabelTest extends TestCase {
	/**
	 * The fixture for this Transport Relationship Label test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TransportRelationshipLabel fixture = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TransportRelationshipLabelTest.class);
	}

	/**
	 * Constructs a new Transport Relationship Label test case with the given name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TransportRelationshipLabelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Transport Relationship Label test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void setFixture(TransportRelationshipLabel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Transport Relationship Label test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TransportRelationshipLabel getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
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

	/**
	 * Tests the '{@link org.eclipse.stem.definitions.labels.TransportRelationshipLabel#getCurrentTransportRelationshipLabelValue() <em>Current Transport Relationship Label Value</em>}'
	 * feature getter. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.stem.definitions.labels.TransportRelationshipLabel#getCurrentTransportRelationshipLabelValue()
	 * @generated NOT
	 */
	public void testGetCurrentTransportRelationshipLabelValue() {
		final TransportRelationshipLabel fixture = getFixture();
		assertTrue(fixture.getCurrentTransportRelationshipLabelValue() != null);
	} // testGetCurrentTransportRelationshipLabelValue

	/**
	 * Tests the '{@link org.eclipse.stem.definitions.labels.TransportRelationshipLabel#getDepartureCapacity() <em>Departure Capacity</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.definitions.labels.TransportRelationshipLabel#getDepartureCapacity()
	 * @generated NOT
	 */
	public void testGetDepartureCapacity() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		assertTrue(true);
	}

	/**
	 * Tests the '{@link org.eclipse.stem.definitions.labels.TransportRelationshipLabel#getCapacity() <em>Capacity</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.definitions.labels.TransportRelationshipLabel#getCapacity()
	 * @generated NOT
	 */
	public void testGetCapacity() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		assertTrue(true);
	}

	/**
	 * @return a fixture
	 */
	public static TransportRelationshipLabel createFixture() {
		final TransportRelationshipLabel temp = LabelsFactory.eINSTANCE
				.createTransportRelationshipLabel();
		final TestEdgeDecorator1 ted = DecoratorsFactory.eINSTANCE
		.createTestEdgeDecorator1();
		temp.setDecorator(ted);
		temp.setCurrentValue(TransportRelationshipLabelValueTest
				.createFixture());
		return temp;
	} // createFixture

	/**
	 * Test that the fixture is sane.
	 */
	public void testFixtureSanity() {
		final TransportRelationshipLabel fixture = getFixture();
		assertTrue(fixture.sane());
	} // testFixtureSanity

	/**
	 * test createTransportRelationship
	 */
	// public void testCreateTransportRelationship() {
	// fail();
	// } // testCreateTransportRelationship
	//
	// /**
	// * test createTransportRelationship (directed)
	// */
	// public void testCreateTransportRelationshipDirected() {
	// fail();
	// } // testCreateTransportRelationshipDirected
} // TransportRelationshipLabelTest
