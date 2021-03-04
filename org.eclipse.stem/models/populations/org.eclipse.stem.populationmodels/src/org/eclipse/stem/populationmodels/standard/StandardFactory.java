package org.eclipse.stem.populationmodels.standard;

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


import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.stem.populationmodels.standard.StandardPackage
 * @generated
 */
public interface StandardFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StandardFactory eINSTANCE = org.eclipse.stem.populationmodels.standard.impl.StandardFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Population Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Population Model</em>'.
	 * @generated
	 */
	StandardPopulationModel createStandardPopulationModel();

	/**
	 * Returns a new object of class '<em>Population Model Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Population Model Label</em>'.
	 * @generated
	 */
	PopulationModelLabel createPopulationModelLabel();

	/**
	 * Returns a new object of class '<em>Population Model Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Population Model Label</em>'.
	 * @generated
	 */
	StandardPopulationModelLabel createStandardPopulationModelLabel();

	/**
	 * Returns a new object of class '<em>Population Model Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Population Model Label Value</em>'.
	 * @generated
	 */
	PopulationModelLabelValue createPopulationModelLabelValue();

	/**
	 * Returns a new object of class '<em>Population Model Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Population Model Label Value</em>'.
	 * @generated
	 */
	StandardPopulationModelLabelValue createStandardPopulationModelLabelValue();

	/**
	 * Returns a new object of class '<em>Stochastic Standard Population Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stochastic Standard Population Model</em>'.
	 * @generated
	 */
	StochasticStandardPopulationModel createStochasticStandardPopulationModel();

	/**
	 * Returns a new object of class '<em>Demographic Population Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Demographic Population Model</em>'.
	 * @generated
	 */
	DemographicPopulationModel createDemographicPopulationModel();

	/**
	 * Returns a new object of class '<em>Population Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Population Group</em>'.
	 * @generated
	 */
	PopulationGroup createPopulationGroup();

	/**
	 * Returns a new object of class '<em>Population Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Population Initializer</em>'.
	 * @generated
	 */
	StandardPopulationInitializer createStandardPopulationInitializer();

	/**
	 * Returns a new object of class '<em>Seasonal Population Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Seasonal Population Model</em>'.
	 * @generated
	 */
	SeasonalPopulationModel createSeasonalPopulationModel();

	/**
	 * Returns a new object of class '<em>Yeti Population Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Yeti Population Initializer</em>'.
	 * @generated
	 */
	YetiPopulationInitializer createYetiPopulationInitializer();

	/**
	 * Returns a new object of class '<em>Mosquito Population Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mosquito Population Model</em>'.
	 * @generated
	 */
	MosquitoPopulationModel createMosquitoPopulationModel();

	/**
	 * Returns a new object of class '<em>Aging Population Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aging Population Model</em>'.
	 * @generated
	 */
	AgingPopulationModel createAgingPopulationModel();

	/**
	 * Returns a new object of class '<em>Age Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Age Group</em>'.
	 * @generated
	 */
	AgeGroup createAgeGroup();

	/**
	 * Returns a new object of class '<em>External Data Source Population Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Data Source Population Initializer</em>'.
	 * @generated
	 */
	ExternalDataSourcePopulationInitializer createExternalDataSourcePopulationInitializer();

	/**
	 * Returns a new object of class '<em>External Data Source Population Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Data Source Population Model</em>'.
	 * @generated
	 */
	ExternalDataSourcePopulationModel createExternalDataSourcePopulationModel();

	/**
	 * Returns a new object of class '<em>Sin Modulate Population Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sin Modulate Population Model</em>'.
	 * @generated
	 */
	SinModulatePopulationModel createSinModulatePopulationModel();

	/**
	 * Returns a new object of class '<em>Seasonal Migratory Population Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Seasonal Migratory Population Model</em>'.
	 * @generated
	 */
	SeasonalMigratoryPopulationModel createSeasonalMigratoryPopulationModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StandardPackage getStandardPackage();

} //StandardFactory
