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

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>standard</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class StandardTests extends TestSuite {

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
		TestSuite suite = new StandardTests("standard Tests");
		suite.addTestSuite(StandardPopulationModelTest.class);
		suite.addTestSuite(PopulationModelLabelTest.class);
		suite.addTestSuite(StandardPopulationModelLabelTest.class);
		suite.addTestSuite(PopulationModelLabelValueTest.class);
		suite.addTestSuite(StandardPopulationModelLabelValueTest.class);
		suite.addTestSuite(StochasticStandardPopulationModelTest.class);
		suite.addTestSuite(DemographicPopulationModelTest.class);
		suite.addTestSuite(StandardPopulationInitializerTest.class);
		suite.addTestSuite(SeasonalPopulationModelTest.class);
		suite.addTestSuite(YetiPopulationInitializerTest.class);
		suite.addTestSuite(MosquitoPopulationModelTest.class);
		suite.addTestSuite(AgingPopulationModelTest.class);
		suite.addTestSuite(ExternalDataSourcePopulationInitializerTest.class);
		suite.addTestSuite(ExternalDataSourcePopulationModelTest.class);
		suite.addTestSuite(SinModulatePopulationModelTest.class);
		suite.addTestSuite(SeasonalMigratoryPopulationModelTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardTests(String name) {
		super(name);
	}

} //StandardTests
