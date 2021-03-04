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
package org.eclipse.stem.diseasemodels.polio.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel;
import org.eclipse.stem.diseasemodels.poliodiseasemodel.PolioFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Oral Polio Vaccine Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OralPolioVaccineModelTest extends TestCase {

	/**
	 * The fixture for this Oral Polio Vaccine Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OralPolioVaccineModel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OralPolioVaccineModelTest.class);
	}

	/**
	 * Constructs a new Oral Polio Vaccine Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OralPolioVaccineModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Oral Polio Vaccine Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(OralPolioVaccineModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Oral Polio Vaccine Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OralPolioVaccineModel getFixture() {
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
		setFixture(PolioFactory.eINSTANCE.createOralPolioVaccineModel());
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

} //OralPolioVaccineModelTest