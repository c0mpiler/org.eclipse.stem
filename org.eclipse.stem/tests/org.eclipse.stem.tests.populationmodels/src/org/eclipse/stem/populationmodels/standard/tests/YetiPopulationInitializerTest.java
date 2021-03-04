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

import junit.textui.TestRunner;

import org.eclipse.stem.populationmodels.standard.StandardFactory;
import org.eclipse.stem.populationmodels.standard.YetiPopulationInitializer;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Yeti Population Initializer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class YetiPopulationInitializerTest extends EarthSciencePopulationInitializerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(YetiPopulationInitializerTest.class);
	}

	/**
	 * Constructs a new Yeti Population Initializer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YetiPopulationInitializerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Yeti Population Initializer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	protected YetiPopulationInitializer getFixture() {
		YetiPopulationInitializer retValue = StandardFactory.eINSTANCE.createYetiPopulationInitializer();
		return retValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StandardFactory.eINSTANCE.createYetiPopulationInitializer());
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

	
	public void testInitializeRegion() {
		// TODO: Implement test
		assertTrue(true);
	}
} //YetiPopulationInitializerTest
