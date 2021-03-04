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

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.core.common.DublinCore;
import org.eclipse.stem.definitions.labels.PopulationLabel;
import org.eclipse.stem.diseasemodels.standard.AggregatingSIDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.Infector;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Disease Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.DiseaseModel#createDiseaseModelLabel(java.lang.String) <em>Create Disease Model Label</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.DiseaseModel#createDiseaseModelLabelValue(java.lang.String) <em>Create Disease Model Label Value</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.DiseaseModel#createInfector() <em>Create Infector</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.DiseaseModel#getAllLabelIdentifiers() <em>Get All Label Identifiers</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.DiseaseModel#getPopulationModelLabels(java.lang.String, org.eclipse.stem.core.graph.Graph) <em>Get Population Model Labels</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class DiseaseModelTest extends TestCase {

	/**
	 * The population identifier to use for testing disease models.
	 */
	final public static String TEST_POPULATION_IDENTIFIER = PopulationLabel.HUMAN;

	/**
	 * This is the rate at which population members (on average) transition from
	 * all of the other states (except <em>Pre-Born</em>) to the state
	 * <em>Dead</em>, per time period. Units: population members
	 * 
	 * @see StandardDiseaseModel#getBackgroundMortalityRate()
	 */
	public static final double MORTALITY_RATE = 0.01;

	/**
	 * The fixture for this Disease Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiseaseModel fixture = null;

	/**
	 * Constructs a new Disease Model test case with the given name. <!--
	 * begin-user-doc -->
	 * 
	 * @param name
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiseaseModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Disease Model test case.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DiseaseModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Disease Model test case.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DiseaseModel getFixture() {
		return fixture;
	}

	
	/**
	 * Tests the '{@link org.eclipse.stem.diseasemodels.standard.DiseaseModel#createDiseaseModelLabel(java.lang.String) <em>Create Disease Model Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.DiseaseModel#createDiseaseModelLabel(java.lang.String)
	 * @generated NOT
	 */
	public void testCreateDiseaseModelLabel__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		//fail();
	}

	/**
	 * Tests the '{@link org.eclipse.stem.diseasemodels.standard.DiseaseModel#createDiseaseModelLabelValue(java.lang.String) <em>Create Disease Model Label Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.DiseaseModel#createDiseaseModelLabelValue(java.lang.String)
	 * @generated NOT
	 */
	public void testCreateDiseaseModelLabelValue__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		//fail();
	}

	/**
	 * test the sanity of the fixture
	 */
	public void testFixtureSanity() {
		final DiseaseModel dModel = getFixture();
		/// must set the dublin core and URI to pass sanity
		// TODO each model fixture should probably do this.
		if(dModel.getURI()==null) {
			dModel.setURI(DiseaseModelTestUtil.DEFAULT_URI);
			DublinCore dc = dModel.getDublinCore();
			dc.setIdentifier(dModel.getURI().toString());
		}
		assertTrue(fixture.sane());
	} // testFixtureSanity

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
		assertTrue(dml.eClass().equals(getDiseaseModelLabelClass()));
		}
	} // testCreateDiseaseModelLabel

	/**
	 * Tests the '{@link org.eclipse.stem.diseasemodels.standard.DiseaseModel#createDiseaseModelLabelValue() <em>Create Disease Model Label Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.DiseaseModel#createDiseaseModelLabelValue()
	 * @generated NOT
	 */
	public void testCreateDiseaseModelLabelValue() {
		// TODO: implement this operation test method
		assertTrue(true);
	}

	

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

	

	/**
	 * Tests the '{@link org.eclipse.stem.diseasemodels.standard.DiseaseModel#getAllLabelIdentifiers() <em>Get All Label Identifiers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.DiseaseModel#getAllLabelIdentifiers()
	 * @generated NOT
	 */
	public void testGetAllLabelIdentifiers() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		//fail();
	}

	/**
	 * Tests the '{@link org.eclipse.stem.diseasemodels.standard.DiseaseModel#getPopulationModelLabels(java.lang.String, org.eclipse.stem.core.graph.Graph) <em>Get Population Model Labels</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.DiseaseModel#getPopulationModelLabels(java.lang.String, org.eclipse.stem.core.graph.Graph)
	 * @generated NOT
	 */
	public void testGetPopulationModelLabels__String_Graph() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		//fail();
	}

	/**
	 * Tests the '{@link org.eclipse.stem.diseasemodels.standard.DiseaseModel#getPopulationModelLabels(java.lang.String, org.eclipse.stem.core.graph.Graph) <em>Get Population Model Labels</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.DiseaseModel#getPopulationModelLabels(java.lang.String, org.eclipse.stem.core.graph.Graph)
	 * @generated
	 */
//	public void testGetPopulationModelLabels__String_Graph() {
//		assertNotNull(null);
//	}

	/**
	 * @return the EClass of the class this disease model updates
	 */
	protected abstract EClass getDiseaseModelLabelClass();

	

} // DiseaseModelTest
