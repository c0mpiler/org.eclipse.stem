package org.eclipse.stem.populationmodels.standard.tests;

/******************************************************************************* 
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     IBM Corporation - initial API and implementation 
 *******************************************************************************/

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.eclipse.stem.populationmodels.standard.PopulationGroup;
import org.eclipse.stem.populationmodels.standard.StandardFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Population Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PopulationGroupTest extends TestCase {

	/**
	 * The fixture for this Population Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PopulationGroup fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PopulationGroupTest.class);
	}

	/**
	 * Constructs a new Population Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopulationGroupTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Population Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PopulationGroup fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Population Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PopulationGroup getFixture() {
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
		setFixture(StandardFactory.eINSTANCE.createPopulationGroup());
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

	public void testPopulationGroup() {
		// TODO: Implement test
		assertTrue(true);
	}
} //PopulationGroupTest
