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

import org.eclipse.stem.definitions.labels.PopulationLabel;
import org.eclipse.stem.definitions.labels.impl.PopulationLabelImpl;
import org.eclipse.stem.definitions.nodes.Region;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Disease Model Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel#toTooltipString() <em>To Tooltip String</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class DiseaseModelLabelTest extends TestCase {
	/**
	 * The fixture for this Disease Model Label test case.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DiseaseModelLabel fixture = null;

	/**
	 * Constructs a new Disease Model Label test case with the given name. <!--
	 * begin-user-doc -->
	 * 
	 * @param name
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiseaseModelLabelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Disease Model Label test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void setFixture(DiseaseModelLabel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Disease Model Label test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@SuppressWarnings("unused")
	private DiseaseModelLabel getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel#toTooltipString() <em>To Tooltip String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel#toTooltipString()
	 * @generated NOT
	 */
	public void testToTooltipString() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		//fail();
	}

	/**
	 * Tests the '{@link org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel#getCurrentDiseaseModelLabelValue() <em>Current Disease Model Label Value</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel#getCurrentDiseaseModelLabelValue()
	 * @generated NOT
	 */
	public void testGetCurrentDiseaseModelLabelValue() {
		assertTrue(true);
	}

	/**
	 * Tests the '{@link org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel#getNextDiseaseModelLabelValue() <em>Next Disease Model Label Value</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel#getNextDiseaseModelLabelValue()
	 * @generated NOT
	 */
	public void testGetNextDiseaseModelLabelValue() {
		assertTrue(true);
	}

	protected static void labelRegion(final DiseaseModelLabel diseaseLabel,
			final String populationIdentifier, final Region region) {
		diseaseLabel.setURIOfIdentifiableToBeLabeled(region.getURI());
		final PopulationLabel populationLabel = PopulationLabelImpl
				.getPopulationLabel(populationIdentifier, region);
		diseaseLabel.setPopulationLabel(populationLabel);
		
		diseaseLabel.setPopulationModelLabel(
				org.eclipse.stem.populationmodels.standard.StandardFactory.eINSTANCE.createPopulationModelLabel());
		
		
		
		region.getLabels().add(diseaseLabel);
	} // labelRegion

} // DiseaseModelLabelTest
