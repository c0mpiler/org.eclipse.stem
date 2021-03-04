
package org.eclipse.stem.populationmodels.standard.tests;

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

import org.eclipse.stem.populationmodels.Activator;
import org.eclipse.stem.populationmodels.standard.ExternalDataSourcePopulationInitializer;
import org.eclipse.stem.populationmodels.standard.StandardFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>External Data Source Population Initializer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalDataSourcePopulationInitializerTest extends PopulationInitializerTest {

	public void testNeedsTests()
	{
		Activator.logInformation("ExternalDataSourcePopulationInitializerTest tests need to be implemented.");
		assertTrue(true);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExternalDataSourcePopulationInitializerTest.class);
	}

	/**
	 * Constructs a new External Data Source Population Initializer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalDataSourcePopulationInitializerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this External Data Source Population Initializer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExternalDataSourcePopulationInitializer getFixture() {
		return (ExternalDataSourcePopulationInitializer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StandardFactory.eINSTANCE.createExternalDataSourcePopulationInitializer());
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

} //ExternalDataSourcePopulationInitializerTest
