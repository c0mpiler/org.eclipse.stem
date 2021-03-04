package org.eclipse.stem.diseasemodels.predicates.diseasepredicates.tests;

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

import org.eclipse.stem.diseasemodels.predicates.diseasepredicates.DiseasepredicatesFactory;
import org.eclipse.stem.diseasemodels.predicates.diseasepredicates.LabelValueTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Label Value Test</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LabelValueTestTest extends TestCase {

	/**
	 * The fixture for this Label Value Test test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelValueTest fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LabelValueTestTest.class);
	}

	/**
	 * Constructs a new Label Value Test test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelValueTestTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Label Value Test test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LabelValueTest fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Label Value Test test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelValueTest getFixture() {
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
		setFixture(DiseasepredicatesFactory.eINSTANCE.createLabelValueTest());
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
	
	public void testEmpty()
	{
		assertTrue(true);
	}

} //LabelValueTestTest
