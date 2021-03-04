package org.eclipse.stem.interventions.tests;

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

import junit.textui.TestRunner;

import org.eclipse.stem.interventions.InterventionsFactory;
import org.eclipse.stem.interventions.StandardInterventionLabel;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Standard Intervention Label</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StandardInterventionLabelTest extends InterventionLabelTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StandardInterventionLabelTest.class);
	}

	/**
	 * Constructs a new Standard Intervention Label test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardInterventionLabelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Standard Intervention Label test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StandardInterventionLabel getFixture() {
		return (StandardInterventionLabel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InterventionsFactory.eINSTANCE.createStandardInterventionLabel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //StandardInterventionLabelTest
