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
package org.eclipse.stem.populationmodels.standard.tests;

import junit.textui.TestRunner;

import org.eclipse.stem.populationmodels.standard.SinModulatePopulationModel;
import org.eclipse.stem.populationmodels.standard.StandardFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sin Modulate Population Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SinModulatePopulationModelTest extends StandardPopulationModelTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SinModulatePopulationModelTest.class);
	}

	/**
	 * Constructs a new Sin Modulate Population Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinModulatePopulationModelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sin Modulate Population Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SinModulatePopulationModel getFixture() {
		return (SinModulatePopulationModel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StandardFactory.eINSTANCE.createSinModulatePopulationModel());
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

} //SinModulatePopulationModelTest
