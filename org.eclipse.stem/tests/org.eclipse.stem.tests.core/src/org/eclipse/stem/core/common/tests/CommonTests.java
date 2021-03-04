package org.eclipse.stem.core.common.tests;

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
 * A test suite for the '<em><b>common</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonTests extends TestSuite {
	/**
	 * <!-- begin-user-doc -->
	 * @param args 
	 * <!-- end-user-doc --> 
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * @return 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static Test suite() {
		TestSuite suite = new CommonTests("common Tests");
		suite.addTestSuite(DublinCoreTest.class);
		suite.addTestSuite(IdentifiableImplTest.class);
		return suite;
	} // suite

	/**
	 * <!-- begin-user-doc -->
	 * @param name 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonTests(String name) {
		super(name);
	}

} //CommonTests
