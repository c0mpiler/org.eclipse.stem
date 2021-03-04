package org.eclipse.stem.diseasemodels.standard.tests;

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
 * <!-- begin-user-doc --> A test suite for the '<em><b>standard</b></em>'
 * package. <!-- end-user-doc -->
 * @generated
 */
public class StandardTests extends TestSuite {
	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param args
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @return
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new StandardTests("standard Tests"); //$NON-NLS-1$
		suite.addTestSuite(DeterministicSEIRDiseaseModelTest.class);
		suite.addTestSuite(DeterministicSIDiseaseModelTest.class);
		suite.addTestSuite(DeterministicSIRDiseaseModelTest.class);
		suite.addTestSuite(SEIRTest.class);
		suite.addTestSuite(SEIRLabelTest.class);
		suite.addTestSuite(SEIRLabelValueTest.class);
		suite.addTestSuite(SITest.class);
		suite.addTestSuite(SIInfectorTest.class);
		suite.addTestSuite(SILabelTest.class);
		suite.addTestSuite(SILabelValueTest.class);
		suite.addTestSuite(SIRTest.class);
		suite.addTestSuite(SIRLabelTest.class);
		suite.addTestSuite(SIRLabelValueTest.class);
		suite.addTestSuite(StochasticSEIRDiseaseModelTest.class);
		suite.addTestSuite(StochasticSIDiseaseModelTest.class);
		suite.addTestSuite(StochasticSIRDiseaseModelTest.class);
		suite.addTestSuite(SIRInoculatorTest.class);
		suite.addTestSuite(StochasticPoissonSIDiseaseModelTest.class);
		suite.addTestSuite(StochasticPoissonSIRDiseaseModelTest.class);
		suite.addTestSuite(StochasticPoissonSEIRDiseaseModelTest.class);
		suite.addTestSuite(InfectorInoculatorCollectionTest.class);
		suite.addTestSuite(StandardDiseaseInitializerTest.class);
		suite.addTestSuite(ExternalDataSourceDiseaseInitializerTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param name
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardTests(String name) {
		super(name);
	}

} // StandardTests
