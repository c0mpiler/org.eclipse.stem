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

import junit.textui.TestRunner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.common.DublinCore;
import org.eclipse.stem.diseasemodels.forcing.ForcingFactory;
import org.eclipse.stem.diseasemodels.forcing.Gaussian2ForcingDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.AggregatingSIDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.Infector;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Gaussian2 Forcing Disease Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Gaussian2ForcingDiseaseModelTest extends GaussianForcingDiseaseModelTest {
	
	public static final String DISEASE_IDENTIFIER="Gaussian2Forcing3DiseaseModel";
	public static final URI DISEASE_URI = STEMURI.createURI("diseasemodel" + "/" + DISEASE_IDENTIFIER);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Gaussian2ForcingDiseaseModelTest.class);
	}

	/**
	 * Constructs a new Gaussian2 Forcing Disease Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gaussian2ForcingDiseaseModelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Gaussian2 Forcing Disease Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Gaussian2ForcingDiseaseModel getFixture() {
		return (Gaussian2ForcingDiseaseModel)fixture;
	}
	
	/**
	 * Create disease model instance
	 * 
	 * @return a disease model instance for test purposes
	 */
	public static Gaussian2ForcingDiseaseModel createFixture() {
		Gaussian2ForcingDiseaseModel diseaseModel = ForcingFactory.eINSTANCE.createGaussian2ForcingDiseaseModel();
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
		setFixture(ForcingFactory.eINSTANCE.createGaussian2ForcingDiseaseModel());
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

	

} //Gaussian2ForcingDiseaseModelTest
