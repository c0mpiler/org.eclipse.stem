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

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>vector</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class VectorTests extends TestSuite {

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
		TestSuite suite = new VectorTests("vector Tests");
		suite.addTestSuite(MacdonaldRossDiseaseModelTest.class);
		suite.addTestSuite(DengueModelTest.class);
		suite.addTestSuite(SimpleDengueModelTest.class);		
		suite.addTestSuite(DengueModelHostLabelTest.class);
		suite.addTestSuite(DengueModelHostLabelValueTest.class);
		suite.addTestSuite(DengueModelVectorLabelTest.class);
		suite.addTestSuite(DengueModelVectorLabelValueTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorTests(String name) {
		super(name);
	}

} //VectorTests
