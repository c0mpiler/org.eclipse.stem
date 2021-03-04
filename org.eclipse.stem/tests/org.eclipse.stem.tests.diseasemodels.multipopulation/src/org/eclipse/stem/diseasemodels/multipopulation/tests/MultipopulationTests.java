package org.eclipse.stem.diseasemodels.multipopulation.tests;

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

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>multipopulation</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultipopulationTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new MultipopulationTests("multipopulation Tests");
		suite.addTestSuite(MultiPopulationSIDiseaseModelTest.class);
		suite.addTestSuite(MultiPopulationSIRDiseaseModelTest.class);
		suite.addTestSuite(MultiPopulationSEIRDiseaseModelTest.class);
		suite.addTestSuite(MultiPopulationSeasonalDiseaseModelTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipopulationTests(String name) {
		super(name);
	}

} //MultipopulationTests
