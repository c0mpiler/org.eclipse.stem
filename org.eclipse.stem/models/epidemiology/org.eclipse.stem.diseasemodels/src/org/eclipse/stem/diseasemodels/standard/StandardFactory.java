package org.eclipse.stem.diseasemodels.standard;

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
 * @see org.eclipse.stem.diseasemodels.standard.StandardPackage
 * @generated
 */
@SuppressWarnings("deprecation")
public interface StandardFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StandardFactory eINSTANCE = org.eclipse.stem.diseasemodels.standard.impl.StandardFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Deterministic SEIR Disease Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deterministic SEIR Disease Model</em>'.
	 * @generated
	 */
	DeterministicSEIRDiseaseModel createDeterministicSEIRDiseaseModel();

	/**
	 * Returns a new object of class '<em>Deterministic SI Disease Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deterministic SI Disease Model</em>'.
	 * @generated
	 */
	DeterministicSIDiseaseModel createDeterministicSIDiseaseModel();

	/**
	 * Returns a new object of class '<em>Deterministic SIR Disease Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deterministic SIR Disease Model</em>'.
	 * @generated
	 */
	DeterministicSIRDiseaseModel createDeterministicSIRDiseaseModel();

	/**
	 * Returns a new object of class '<em>SEIR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SEIR</em>'.
	 * @generated
	 */
	SEIR createSEIR();

	/**
	 * Returns a new object of class '<em>SEIR Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SEIR Label</em>'.
	 * @generated
	 */
	SEIRLabel createSEIRLabel();

	/**
	 * Returns a new object of class '<em>SEIR Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SEIR Label Value</em>'.
	 * @generated
	 */
	SEIRLabelValue createSEIRLabelValue();

	/**
	 * Returns a new object of class '<em>SI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SI</em>'.
	 * @generated
	 */
	SI createSI();

	/**
	 * Returns a new object of class '<em>SI Infector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SI Infector</em>'.
	 * @generated
	 */
	SIInfector createSIInfector();

	/**
	 * Returns a new object of class '<em>SI Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SI Label</em>'.
	 * @generated
	 */
	SILabel createSILabel();

	/**
	 * Returns a new object of class '<em>SI Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SI Label Value</em>'.
	 * @generated
	 */
	SILabelValue createSILabelValue();

	/**
	 * Returns a new object of class '<em>SIR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SIR</em>'.
	 * @generated
	 */
	SIR createSIR();

	/**
	 * Returns a new object of class '<em>SIR Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SIR Label</em>'.
	 * @generated
	 */
	SIRLabel createSIRLabel();

	/**
	 * Returns a new object of class '<em>SIR Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SIR Label Value</em>'.
	 * @generated
	 */
	SIRLabelValue createSIRLabelValue();

	/**
	 * Returns a new object of class '<em>Stochastic SEIR Disease Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stochastic SEIR Disease Model</em>'.
	 * @generated
	 */
	StochasticSEIRDiseaseModel createStochasticSEIRDiseaseModel();

	/**
	 * Returns a new object of class '<em>Stochastic SI Disease Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stochastic SI Disease Model</em>'.
	 * @generated
	 */
	StochasticSIDiseaseModel createStochasticSIDiseaseModel();

	/**
	 * Returns a new object of class '<em>Stochastic SIR Disease Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stochastic SIR Disease Model</em>'.
	 * @generated
	 */
	StochasticSIRDiseaseModel createStochasticSIRDiseaseModel();

	

	/**
	 * Returns a new object of class '<em>SIR Inoculator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SIR Inoculator</em>'.
	 * @generated
	 */
	SIRInoculator createSIRInoculator();

	/**
	 * Returns a new object of class '<em>Stochastic Poisson SI Disease Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stochastic Poisson SI Disease Model</em>'.
	 * @generated
	 */
	StochasticPoissonSIDiseaseModel createStochasticPoissonSIDiseaseModel();

	/**
	 * Returns a new object of class '<em>Stochastic Poisson SIR Disease Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stochastic Poisson SIR Disease Model</em>'.
	 * @generated
	 */
	StochasticPoissonSIRDiseaseModel createStochasticPoissonSIRDiseaseModel();

	/**
	 * Returns a new object of class '<em>Stochastic Poisson SEIR Disease Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stochastic Poisson SEIR Disease Model</em>'.
	 * @generated
	 */
	StochasticPoissonSEIRDiseaseModel createStochasticPoissonSEIRDiseaseModel();

	/**
	 * Returns a new object of class '<em>Infector Inoculator Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infector Inoculator Collection</em>'.
	 * @generated
	 */
	InfectorInoculatorCollection createInfectorInoculatorCollection();

	/**
	 * Returns a new object of class '<em>Disease Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disease Initializer</em>'.
	 * @generated
	 */
	StandardDiseaseInitializer createStandardDiseaseInitializer();

	/**
	 * Returns a new object of class '<em>External Data Source Disease Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Data Source Disease Initializer</em>'.
	 * @generated
	 */
	ExternalDataSourceDiseaseInitializer createExternalDataSourceDiseaseInitializer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StandardPackage getStandardPackage();

} //StandardFactory
