package org.eclipse.stem.definitions.edges.tests;

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
 * A test suite for the '<em><b>edges</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class EdgesTests extends TestSuite {

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
		TestSuite suite = new EdgesTests("edges Tests"); //$NON-NLS-1$
		suite.addTestSuite(MigrationEdgeTest.class);
		suite.addTestSuite(MigrationEdgeLabelTest.class);
		suite.addTestSuite(MigrationEdgeLabelValueTest.class);
		suite.addTestSuite(MixingEdgeTest.class);
		suite.addTestSuite(MixingEdgeLabelTest.class);
		suite.addTestSuite(MixingEdgeLabelValueTest.class);
		suite.addTestSuite(PopulationEdgeTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgesTests(String name) {
		super(name);
	}

} //EdgesTests
