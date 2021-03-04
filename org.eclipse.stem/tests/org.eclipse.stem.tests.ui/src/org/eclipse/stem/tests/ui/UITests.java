package org.eclipse.stem.tests.ui;

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

import org.eclipse.stem.ui.views.map.StemPolygonTest;
import org.eclipse.stem.ui.views.map.StemPolygonsListTest;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>standard</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class UITests extends TestSuite {

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
		TestSuite suite = new UITests("STEM UI Tests");
		suite.addTestSuite(StemPolygonsListTest.class);
		suite.addTestSuite(StemPolygonTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UITests(String name) {
		super(name);
	}

} //StandardTests
