package org.eclipse.stem.diseasemodels.experimental.tests;

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

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.eclipse.stem.diseasemodels.experimental.ExperimentalFactory;
import org.eclipse.stem.diseasemodels.experimental.TBDiseaseModelLabelValue;
import org.eclipse.stem.tests.diseasemodels.Activator;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TB Disease Model Label Value</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TBDiseaseModelLabelValueTest extends TestCase {

	/**
	 * The fixture for this TB Disease Model Label Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TBDiseaseModelLabelValue fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TBDiseaseModelLabelValueTest.class);
	}

	/**
	 * Constructs a new TB Disease Model Label Value test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBDiseaseModelLabelValueTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this TB Disease Model Label Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TBDiseaseModelLabelValue fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this TB Disease Model Label Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TBDiseaseModelLabelValue getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExperimentalFactory.eINSTANCE.createTBDiseaseModelLabelValue());
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
	
	public void testNeedsTests()
	{
		Activator.logInformation("TBDiseaseModelLabelValueTest tests need to be implemented.");
		assertTrue(true);
	}


} //TBDiseaseModelLabelValueTest
