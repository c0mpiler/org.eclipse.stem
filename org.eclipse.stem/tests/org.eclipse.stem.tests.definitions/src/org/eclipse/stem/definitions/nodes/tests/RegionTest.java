package org.eclipse.stem.definitions.nodes.tests;

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

import org.eclipse.emf.common.util.URI;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.definitions.labels.PopulationLabel;
import org.eclipse.stem.definitions.labels.tests.PopulationLabelTest;
import org.eclipse.stem.definitions.nodes.NodesFactory;
import org.eclipse.stem.definitions.nodes.Region;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * @generated NOT
 */
@SuppressWarnings("all")
public class RegionTest extends GeographicFeatureTest {
	
	/**
	 * Node URI
	 */
	public static URI NODE_URI = STEMURI.createURI("NODE/testNode");
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RegionTest.class);
	}

	/**
	 * Constructs a new Region test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RegionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Region test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Region getFixture() {
		return (Region)fixture;
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
	 * @return a region node with a population label
	 */
	public static Region createFixture() {
		final Region retValue = NodesFactory.eINSTANCE.createRegion();
		final PopulationLabel populationLabel = PopulationLabelTest
				.createFixture();
		retValue.getLabels().add(populationLabel);
		retValue.setURI(NODE_URI);
		return retValue;
	} // createFixture

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
		final Region fixture = getFixture();
		assertTrue(fixture.sane());
	} // testFixtureSanity

} // RegionTest
