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

import junit.textui.TestRunner;

import org.eclipse.stem.diseasemodels.vector.SimpleDengueModel;
import org.eclipse.stem.diseasemodels.vector.VectorFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple Dengue Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleDengueModelTest extends VectorDiseaseModelTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimpleDengueModelTest.class);
	}

	/**
	 * Constructs a new Simple Dengue Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleDengueModelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Simple Dengue Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SimpleDengueModel getFixture() {
		return (SimpleDengueModel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VectorFactory.eINSTANCE.createSimpleDengueModel());
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

} //SimpleDengueModelTest
