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
import org.eclipse.stem.diseasemodels.standard.DeterministicSEIRDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.SEIRLabel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.StandardFactory;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Deterministic SEIR Disease Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
@SuppressWarnings("all")
public class DeterministicSEIRDiseaseModelTest extends SEIRTest {
	private static final String TEST_DETERMINISTIC_SEIR_DISEASE_NAME = "Deterministic SEIR Disease Model";
	
	private static final String DISEASE_IDENTIFIER = "DeterministicSEIRDiseaseModel";
	public static final URI DISEASE_URI = STEMURI.createURI("diseasemodel" + "/" + DISEASE_IDENTIFIER);
	
	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param args
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DeterministicSEIRDiseaseModelTest.class);
	}

	/**
	 * Constructs a new Deterministic SEIR Disease Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * 
	 * @param name
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeterministicSEIRDiseaseModelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Deterministic SEIR Disease Model test case.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DeterministicSEIRDiseaseModel getFixture() {
		return (DeterministicSEIRDiseaseModel)fixture;
	}

	/**
	 * @return the label value fixture
	 */
	SEIRLabel getLabelFixture() {
		return (SEIRLabel) labelFixture;
	} // getLabelValueFixture

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	protected void setUp() throws Exception {
		setFixture(createFixture());
		StandardDiseaseModelLabel dml = createLabelFixture();
		setLabelFixture(dml);
	} // setUp

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 * @generated NOT
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	} // tearDown

	/**
	 * Create disease model instance
	 * 
	 * @return a disease model instance for test purposes
	 */
	public static DeterministicSEIRDiseaseModel createFixture() {
		DeterministicSEIRDiseaseModel diseaseModel = StandardFactory.eINSTANCE.createDeterministicSEIRDiseaseModel();
		diseaseModel.setDiseaseName(TEST_DETERMINISTIC_SEIR_DISEASE_NAME);
		diseaseModel.getDublinCore().setTitle(TEST_DETERMINISTIC_SEIR_DISEASE_NAME);
		diseaseModel.setTimePeriod(TEST_TIME_PERIOD);
		diseaseModel.setPopulationIdentifier(TEST_POPULATION_IDENTIFIER);
		diseaseModel.setTransmissionRate(TRANSMISSION_RATE);
		diseaseModel.setRecoveryRate(RECOVERY_RATE);
		diseaseModel.setInfectiousMortalityRate(INFECTIOUS_MORTALITY_RATE);
		diseaseModel.setNonLinearityCoefficient(NON_LINEARITY_COEFFICIENT);
		diseaseModel.setImmunityLossRate(IMMUNITY_LOSS_RATE);
		diseaseModel.setIncubationRate(INCUBATION_RATE);
		
		final DublinCore dc = diseaseModel.getDublinCore();
		diseaseModel.setURI(DISEASE_URI);
		dc.setIdentifier(diseaseModel.getURI().toString());
		return diseaseModel;
	} // createFixture

} // DeterministicSEIRDiseaseModelTest