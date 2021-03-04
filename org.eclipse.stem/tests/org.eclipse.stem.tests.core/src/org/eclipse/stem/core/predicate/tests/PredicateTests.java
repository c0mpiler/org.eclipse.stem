package org.eclipse.stem.core.predicate.tests;

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
 * A test suite for the '<em><b>predicate</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class PredicateTests extends TestSuite {

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
		TestSuite suite = new PredicateTests("predicate Tests"); //$NON-NLS-1$
		suite.addTestSuite(AndTest.class);
		suite.addTestSuite(FalseTest.class);
		suite.addTestSuite(NotTest.class);
		suite.addTestSuite(OrTest.class);
		suite.addTestSuite(PredicateReferenceTest.class);
		suite.addTestSuite(TrueTest.class);
		suite.addTestSuite(PredicateExpressionTest.class);
		suite.addTestSuite(IdentifiablePredicateExpressionTest.class);
		suite.addTestSuite(ElapsedTimeTestTest.class);
		suite.addTestSuite(ModulusTimeTestTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateTests(String name) {
		super(name);
	}

} //PredicateTests
