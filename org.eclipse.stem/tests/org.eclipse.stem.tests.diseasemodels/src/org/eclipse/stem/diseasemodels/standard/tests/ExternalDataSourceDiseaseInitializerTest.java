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
package org.eclipse.stem.diseasemodels.standard.tests;

import junit.textui.TestRunner;

import org.eclipse.stem.diseasemodels.Activator;
import org.eclipse.stem.diseasemodels.standard.ExternalDataSourceDiseaseInitializer;
import org.eclipse.stem.diseasemodels.standard.StandardFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>External Data Source Disease Initializer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalDataSourceDiseaseInitializerTest extends DiseaseInitializerTest {

	
	public void testNeedsTests()
	{
		Activator.logInformation("ExternalDataSourceDiseaseInitializerTest tests need to be implemented.");
		assertTrue(true);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExternalDataSourceDiseaseInitializerTest.class);
	}

	/**
	 * Constructs a new External Data Source Disease Initializer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalDataSourceDiseaseInitializerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this External Data Source Disease Initializer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExternalDataSourceDiseaseInitializer getFixture() {
		return (ExternalDataSourceDiseaseInitializer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StandardFactory.eINSTANCE.createExternalDataSourceDiseaseInitializer());
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

} //ExternalDataSourceDiseaseInitializerTest
