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
package org.eclipse.stem.diseasemodels.vector.tests;

import junit.textui.TestRunner;

import org.eclipse.stem.diseasemodels.vector.MacdonaldRossDiseaseModel;
import org.eclipse.stem.diseasemodels.vector.VectorFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Macdonald Ross Disease Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MacdonaldRossDiseaseModelTest extends VectorDiseaseModelTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MacdonaldRossDiseaseModelTest.class);
	}

	/**
	 * Constructs a new Macdonald Ross Disease Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacdonaldRossDiseaseModelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Macdonald Ross Disease Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MacdonaldRossDiseaseModel getFixture() {
		return (MacdonaldRossDiseaseModel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VectorFactory.eINSTANCE.createMacdonaldRossDiseaseModel());
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

} //MacdonaldRossDiseaseModelTest
