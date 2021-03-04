package org.eclipse.stem.diseasemodels.forcing.tests;
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

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.common.DublinCore;
import org.eclipse.stem.diseasemodels.forcing.ForcingFactory;
import org.eclipse.stem.diseasemodels.forcing.GaussianForcingDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.AggregatingSIDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.Infector;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;


/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Gaussian Forcing Disease Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GaussianForcingDiseaseModelTest extends TestCase {
	
	public static final String DISEASE_IDENTIFIER="GaussianForcingDiseaseModel";
	public static final URI DISEASE_URI = STEMURI.createURI("diseasemodel" + "/" + DISEASE_IDENTIFIER);
	
	

	/**
	 * The fixture for this Gaussian Forcing Disease Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GaussianForcingDiseaseModel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GaussianForcingDiseaseModelTest.class);
	}

	/**
	 * Constructs a new Gaussian Forcing Disease Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaussianForcingDiseaseModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Gaussian Forcing Disease Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(GaussianForcingDiseaseModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Gaussian Forcing Disease Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GaussianForcingDiseaseModel getFixture() {
		return fixture;
	}
	
	/**
	 * Create disease model instance
	 * 
	 * @return a disease model instance for test purposes
	 */
	public static GaussianForcingDiseaseModel createFixture() {
		GaussianForcingDiseaseModel diseaseModel = ForcingFactory.eINSTANCE.createGaussianForcingDiseaseModel();
		diseaseModel.setDiseaseName(DISEASE_IDENTIFIER);
		diseaseModel.setInfectiousMortalityRate(GaussianDiseaseModelTestUtil.MORTALITY_RATE);
		diseaseModel.setModulationFloor(GaussianDiseaseModelTestUtil.MODULATION_FLOUR);
		diseaseModel.setImmunityLossRate(GaussianDiseaseModelTestUtil.IMMUNITY_LOSS_RATE);
		diseaseModel.setTransmissionRate(GaussianDiseaseModelTestUtil.TRANSMISSION_RATE);
		diseaseModel.setRecoveryRate(GaussianDiseaseModelTestUtil.RECOVERY_RATE);
		diseaseModel.setTimePeriod(GaussianDiseaseModelTestUtil.TIME_PERIOD);
		diseaseModel.setPopulationIdentifier(GaussianDiseaseModelTestUtil.TEST_POPULATION_IDENTIFIER);

		
		final DublinCore dc = diseaseModel.getDublinCore();
		diseaseModel.setURI(DISEASE_URI);
		dc.setIdentifier(diseaseModel.getURI().toString());
		return diseaseModel;
	} // createFixture

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ForcingFactory.eINSTANCE.createGaussianForcingDiseaseModel());
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
	
	/**
	 * Tests the '{@link org.eclipse.stem.diseasemodels.standard.DiseaseModel#createDiseaseModelLabel() <em>Create Disease Model Label</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.stem.diseasemodels.standard.DiseaseModel#createDiseaseModelLabel()
	 * @generated NOT
	 */
	public void testCreateDiseaseModelLabel() {
		final DiseaseModel diseaseModel = getFixture();
		if (!(diseaseModel instanceof AggregatingSIDiseaseModel)) {
		final DiseaseModelLabel dml = diseaseModel.createDiseaseModelLabel(diseaseModel.getPopulationIdentifier());
		
		assertTrue(dml.eClass().equals(StandardPackage.eINSTANCE.getSIRLabel()));
		}
	} // testCreateDiseaseModelLabel

	

	/**
	 * Tests the '{@link org.eclipse.stem.diseasemodels.standard.DiseaseModel#createInfector() <em>Create Infector</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.stem.diseasemodels.standard.DiseaseModel#createInfector()
	 * @generated NOT
	 */
	public void testCreateInfector() {
		final DiseaseModel diseaseModel = getFixture();
		if (!(diseaseModel instanceof AggregatingSIDiseaseModel)) {
			final Infector infector = diseaseModel.createInfector();
			assertNotNull(infector);
			assertTrue(infector.getDiseaseName().equals(
					fixture.getDiseaseName()));
			assertTrue(infector.getPopulationIdentifier().equalsIgnoreCase(
					fixture.getPopulationIdentifier()));
		}

	} // testCreateInfector

	

} //GaussianForcingDiseaseModelTest
