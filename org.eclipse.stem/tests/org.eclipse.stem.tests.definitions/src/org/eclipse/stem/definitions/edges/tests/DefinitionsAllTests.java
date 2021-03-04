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

import org.eclipse.stem.definitions.labels.tests.LabelsTests;
import org.eclipse.stem.definitions.nodes.tests.NodesTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Definitions</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class DefinitionsAllTests extends TestSuite {

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
		TestSuite suite = new DefinitionsAllTests("Definitions Tests"); //$NON-NLS-1$
		suite.addTest(EdgesTests.suite());
		suite.addTest(LabelsTests.suite());
		suite.addTest(NodesTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionsAllTests(String name) {
		super(name);
	}

} //DefinitionsAllTests
