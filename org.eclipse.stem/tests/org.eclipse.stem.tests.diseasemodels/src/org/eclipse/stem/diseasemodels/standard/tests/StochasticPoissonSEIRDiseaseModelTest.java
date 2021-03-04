package org.eclipse.stem.diseasemodels.standard.tests;

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

import junit.textui.TestRunner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.common.DublinCore;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.StandardFactory;
import org.eclipse.stem.diseasemodels.standard.StochasticPoissonSEIRDiseaseModel;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Stochastic Poisson SEIR Disease Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StochasticPoissonSEIRDiseaseModelTest extends SEIRTest {

	public static final URI DISEASEMODEL_URI = STEMURI.createURI("diseaseModels/testStochasticPoissonSEIRDiseaseModel.decorator");
	public static final String DISEASE_NAME = "StochasticPoissonSIDiseaseModel";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StochasticPoissonSEIRDiseaseModelTest.class);
	}

	/**
	 * Constructs a new Stochastic Poisson SEIR Disease Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StochasticPoissonSEIRDiseaseModelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Stochastic Poisson SEIR Disease Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StochasticPoissonSEIRDiseaseModel getFixture() {
		return (StochasticPoissonSEIRDiseaseModel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StandardFactory.eINSTANCE.createStochasticPoissonSEIRDiseaseModel());
		StandardDiseaseModelLabel dml = createLabelFixture();
		setLabelFixture(dml);
		fixture.setDiseaseName(DISEASE_NAME);
		fixture.setURI(DISEASEMODEL_URI);
		DublinCore dc = fixture.getDublinCore();
		dc.setIdentifier(fixture.getURI().toString());
		
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

} //StochasticPoissonSEIRDiseaseModelTest
