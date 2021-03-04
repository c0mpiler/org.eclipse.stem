package org.eclipse.stem.core.modifier.tests;

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
 * A test suite for the '<em><b>modifier</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModifierTests extends TestSuite {

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
		TestSuite suite = new ModifierTests("modifier Tests"); //$NON-NLS-1$
		suite.addTestSuite(DoubleNOPModifierTest.class);
		suite.addTestSuite(DoubleRangeModifierTest.class);
		suite.addTestSuite(DoubleSequenceModifierTest.class);
		suite.addTestSuite(IntegerNOPModifierTest.class);
		suite.addTestSuite(IntegerRangeModifierTest.class);
		suite.addTestSuite(IntegerSequenceModifierTest.class);
		suite.addTestSuite(LongNOPModifierTest.class);
		suite.addTestSuite(LongRangeModifierTest.class);
		suite.addTestSuite(LongSequenceModifierTest.class);
		suite.addTestSuite(ModifierTest.class);
		suite.addTestSuite(NOPModifierTest.class);
		suite.addTestSuite(STEMTimeNOPModifierTest.class);
		suite.addTestSuite(STEMTimeRangeModifierTest.class);
		suite.addTestSuite(STEMTimeSequenceModifierTest.class);
		suite.addTestSuite(StringNOPModifierTest.class);
		suite.addTestSuite(StringSequenceModifierTest.class);
		suite.addTestSuite(DoubleModifierTest.class);
		suite.addTestSuite(IntegerModifierTest.class);
		suite.addTestSuite(LongModifierTest.class);
		suite.addTestSuite(STEMTimeModifierTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifierTests(String name) {
		super(name);
	}

} //ModifierTests