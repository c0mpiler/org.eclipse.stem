package org.eclipse.stem.diseasemodels.forcing;

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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.stem.diseasemodels.forcing.ForcingFactory
 * @model kind="package"
 * @generated
 */
public interface ForcingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "forcing";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/stem/diseasemodels/forcing.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.stem.diseasemodels.forcing";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ForcingPackage eINSTANCE = org.eclipse.stem.diseasemodels.forcing.impl.ForcingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.forcing.impl.ForcingDiseaseModelImpl <em>Disease Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.forcing.impl.ForcingDiseaseModelImpl
	 * @see org.eclipse.stem.diseasemodels.forcing.impl.ForcingPackageImpl#getForcingDiseaseModel()
	 * @generated
	 */
	int FORCING_DISEASE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_DISEASE_MODEL__URI = StandardPackage.SIR__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_DISEASE_MODEL__TYPE_URI = StandardPackage.SIR__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_DISEASE_MODEL__DUBLIN_CORE = StandardPackage.SIR__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_DISEASE_MODEL__LABELS_TO_UPDATE = StandardPackage.SIR__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_DISEASE_MODEL__GRAPH = StandardPackage.SIR__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_DISEASE_MODEL__ENABLED = StandardPackage.SIR__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_DISEASE_MODEL__GRAPH_DECORATED = StandardPackage.SIR__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_DISEASE_MODEL__PROGRESS = StandardPackage.SIR__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_DISEASE_MODEL__ADD_STOCHASTIC_NOISE = StandardPackage.SIR__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_DISEASE_MODEL__RANDOM_SEED = StandardPackage.SIR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_DISEASE_MODEL__BINOMIAL_DISTRIBUTION = StandardPackage.SIR__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_DISEASE_MODEL__POPULATION_IDENTIFIER = StandardPackage.SIR__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_DISEASE_MODEL__TIME_PERIOD = StandardPackage.SIR__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_DISEASE_MODEL__DISEASE_NAME = StandardPackage.SIR__DISEASE_NAME;

	
	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_DISEASE_MODEL__FINITE_DIFFERENCE = StandardPackage.SIR__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_DISEASE_MODEL__FREQUENCY_DEPENDENT = StandardPackage.SIR__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY = StandardPackage.SIR__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = StandardPackage.SIR__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE = StandardPackage.SIR__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_DISEASE_MODEL__TRANSMISSION_RATE = StandardPackage.SIR__TRANSMISSION_RATE;

	/**
	 * The feature id for the '<em><b>Non Linearity Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_DISEASE_MODEL__NON_LINEARITY_COEFFICIENT = StandardPackage.SIR__NON_LINEARITY_COEFFICIENT;

	/**
	 * The feature id for the '<em><b>Recovery Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_DISEASE_MODEL__RECOVERY_RATE = StandardPackage.SIR__RECOVERY_RATE;

	/**
	 * The feature id for the '<em><b>Infectious Mortality Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE = StandardPackage.SIR__INFECTIOUS_MORTALITY_RATE;

	/**
	 * The feature id for the '<em><b>Immunity Loss Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_DISEASE_MODEL__IMMUNITY_LOSS_RATE = StandardPackage.SIR__IMMUNITY_LOSS_RATE;

	/**
	 * The feature id for the '<em><b>Modulation Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_DISEASE_MODEL__MODULATION_EXPONENT = StandardPackage.SIR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modulation Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_DISEASE_MODEL__MODULATION_PERIOD = StandardPackage.SIR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modulation Phase Shift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_DISEASE_MODEL__MODULATION_PHASE_SHIFT = StandardPackage.SIR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Modulation Floor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_DISEASE_MODEL__MODULATION_FLOOR = StandardPackage.SIR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Disease Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_DISEASE_MODEL_FEATURE_COUNT = StandardPackage.SIR_FEATURE_COUNT + 4;


	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.forcing.impl.GaussianForcingDiseaseModelImpl <em>Gaussian Forcing Disease Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.forcing.impl.GaussianForcingDiseaseModelImpl
	 * @see org.eclipse.stem.diseasemodels.forcing.impl.ForcingPackageImpl#getGaussianForcingDiseaseModel()
	 * @generated
	 */
	int GAUSSIAN_FORCING_DISEASE_MODEL = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_FORCING_DISEASE_MODEL__URI = StandardPackage.SIR__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_FORCING_DISEASE_MODEL__TYPE_URI = StandardPackage.SIR__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_FORCING_DISEASE_MODEL__DUBLIN_CORE = StandardPackage.SIR__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_FORCING_DISEASE_MODEL__LABELS_TO_UPDATE = StandardPackage.SIR__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_FORCING_DISEASE_MODEL__GRAPH = StandardPackage.SIR__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_FORCING_DISEASE_MODEL__ENABLED = StandardPackage.SIR__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_FORCING_DISEASE_MODEL__GRAPH_DECORATED = StandardPackage.SIR__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_FORCING_DISEASE_MODEL__PROGRESS = StandardPackage.SIR__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_FORCING_DISEASE_MODEL__ADD_STOCHASTIC_NOISE = StandardPackage.SIR__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_FORCING_DISEASE_MODEL__RANDOM_SEED = StandardPackage.SIR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_FORCING_DISEASE_MODEL__BINOMIAL_DISTRIBUTION = StandardPackage.SIR__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_FORCING_DISEASE_MODEL__POPULATION_IDENTIFIER = StandardPackage.SIR__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_FORCING_DISEASE_MODEL__TIME_PERIOD = StandardPackage.SIR__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_FORCING_DISEASE_MODEL__DISEASE_NAME = StandardPackage.SIR__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_FORCING_DISEASE_MODEL__FINITE_DIFFERENCE = StandardPackage.SIR__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_FORCING_DISEASE_MODEL__FREQUENCY_DEPENDENT = StandardPackage.SIR__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_FORCING_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY = StandardPackage.SIR__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_FORCING_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = StandardPackage.SIR__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_FORCING_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE = StandardPackage.SIR__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_FORCING_DISEASE_MODEL__TRANSMISSION_RATE = StandardPackage.SIR__TRANSMISSION_RATE;

	/**
	 * The feature id for the '<em><b>Non Linearity Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_FORCING_DISEASE_MODEL__NON_LINEARITY_COEFFICIENT = StandardPackage.SIR__NON_LINEARITY_COEFFICIENT;

	/**
	 * The feature id for the '<em><b>Recovery Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_FORCING_DISEASE_MODEL__RECOVERY_RATE = StandardPackage.SIR__RECOVERY_RATE;

	/**
	 * The feature id for the '<em><b>Infectious Mortality Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_FORCING_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE = StandardPackage.SIR__INFECTIOUS_MORTALITY_RATE;

	/**
	 * The feature id for the '<em><b>Immunity Loss Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_FORCING_DISEASE_MODEL__IMMUNITY_LOSS_RATE = StandardPackage.SIR__IMMUNITY_LOSS_RATE;

	/**
	 * The feature id for the '<em><b>Sigma2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_FORCING_DISEASE_MODEL__SIGMA2 = StandardPackage.SIR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modulation Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_FORCING_DISEASE_MODEL__MODULATION_PERIOD = StandardPackage.SIR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modulation Phase Shift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_FORCING_DISEASE_MODEL__MODULATION_PHASE_SHIFT = StandardPackage.SIR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Modulation Floor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_FORCING_DISEASE_MODEL__MODULATION_FLOOR = StandardPackage.SIR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Gaussian Forcing Disease Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_FORCING_DISEASE_MODEL_FEATURE_COUNT = StandardPackage.SIR_FEATURE_COUNT + 4;


	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.forcing.impl.Gaussian2ForcingDiseaseModelImpl <em>Gaussian2 Forcing Disease Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.forcing.impl.Gaussian2ForcingDiseaseModelImpl
	 * @see org.eclipse.stem.diseasemodels.forcing.impl.ForcingPackageImpl#getGaussian2ForcingDiseaseModel()
	 * @generated
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL = 2;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL__URI = GAUSSIAN_FORCING_DISEASE_MODEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL__TYPE_URI = GAUSSIAN_FORCING_DISEASE_MODEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL__DUBLIN_CORE = GAUSSIAN_FORCING_DISEASE_MODEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL__LABELS_TO_UPDATE = GAUSSIAN_FORCING_DISEASE_MODEL__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL__GRAPH = GAUSSIAN_FORCING_DISEASE_MODEL__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL__ENABLED = GAUSSIAN_FORCING_DISEASE_MODEL__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL__GRAPH_DECORATED = GAUSSIAN_FORCING_DISEASE_MODEL__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL__PROGRESS = GAUSSIAN_FORCING_DISEASE_MODEL__PROGRESS;

	
	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL__ADD_STOCHASTIC_NOISE = GAUSSIAN_FORCING_DISEASE_MODEL__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL__RANDOM_SEED = GAUSSIAN_FORCING_DISEASE_MODEL__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL__BINOMIAL_DISTRIBUTION = GAUSSIAN_FORCING_DISEASE_MODEL__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL__POPULATION_IDENTIFIER = GAUSSIAN_FORCING_DISEASE_MODEL__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL__TIME_PERIOD = GAUSSIAN_FORCING_DISEASE_MODEL__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL__DISEASE_NAME = GAUSSIAN_FORCING_DISEASE_MODEL__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL__FINITE_DIFFERENCE = GAUSSIAN_FORCING_DISEASE_MODEL__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL__FREQUENCY_DEPENDENT = GAUSSIAN_FORCING_DISEASE_MODEL__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY = GAUSSIAN_FORCING_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = GAUSSIAN_FORCING_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE = GAUSSIAN_FORCING_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL__TRANSMISSION_RATE = GAUSSIAN_FORCING_DISEASE_MODEL__TRANSMISSION_RATE;

	/**
	 * The feature id for the '<em><b>Non Linearity Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL__NON_LINEARITY_COEFFICIENT = GAUSSIAN_FORCING_DISEASE_MODEL__NON_LINEARITY_COEFFICIENT;

	/**
	 * The feature id for the '<em><b>Recovery Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL__RECOVERY_RATE = GAUSSIAN_FORCING_DISEASE_MODEL__RECOVERY_RATE;

	/**
	 * The feature id for the '<em><b>Infectious Mortality Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE = GAUSSIAN_FORCING_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE;

	/**
	 * The feature id for the '<em><b>Immunity Loss Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL__IMMUNITY_LOSS_RATE = GAUSSIAN_FORCING_DISEASE_MODEL__IMMUNITY_LOSS_RATE;

	/**
	 * The feature id for the '<em><b>Sigma2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL__SIGMA2 = GAUSSIAN_FORCING_DISEASE_MODEL__SIGMA2;

	/**
	 * The feature id for the '<em><b>Modulation Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL__MODULATION_PERIOD = GAUSSIAN_FORCING_DISEASE_MODEL__MODULATION_PERIOD;

	/**
	 * The feature id for the '<em><b>Modulation Phase Shift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL__MODULATION_PHASE_SHIFT = GAUSSIAN_FORCING_DISEASE_MODEL__MODULATION_PHASE_SHIFT;

	/**
	 * The feature id for the '<em><b>Modulation Floor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL__MODULATION_FLOOR = GAUSSIAN_FORCING_DISEASE_MODEL__MODULATION_FLOOR;

	/**
	 * The feature id for the '<em><b>Sigma2 2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL__SIGMA2_2 = GAUSSIAN_FORCING_DISEASE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Att1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL__ATT1 = GAUSSIAN_FORCING_DISEASE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Att2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL__ATT2 = GAUSSIAN_FORCING_DISEASE_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Att3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL__ATT3 = GAUSSIAN_FORCING_DISEASE_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Att4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL__ATT4 = GAUSSIAN_FORCING_DISEASE_MODEL_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Gaussian2 Forcing Disease Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN2_FORCING_DISEASE_MODEL_FEATURE_COUNT = GAUSSIAN_FORCING_DISEASE_MODEL_FEATURE_COUNT + 5;


	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.forcing.impl.Gaussian3ForcingDiseaseModelImpl <em>Gaussian3 Forcing Disease Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.forcing.impl.Gaussian3ForcingDiseaseModelImpl
	 * @see org.eclipse.stem.diseasemodels.forcing.impl.ForcingPackageImpl#getGaussian3ForcingDiseaseModel()
	 * @generated
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL = 3;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__URI = GAUSSIAN2_FORCING_DISEASE_MODEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__TYPE_URI = GAUSSIAN2_FORCING_DISEASE_MODEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__DUBLIN_CORE = GAUSSIAN2_FORCING_DISEASE_MODEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__LABELS_TO_UPDATE = GAUSSIAN2_FORCING_DISEASE_MODEL__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__GRAPH = GAUSSIAN2_FORCING_DISEASE_MODEL__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__ENABLED = GAUSSIAN2_FORCING_DISEASE_MODEL__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__GRAPH_DECORATED = GAUSSIAN2_FORCING_DISEASE_MODEL__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__PROGRESS = GAUSSIAN2_FORCING_DISEASE_MODEL__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__ADD_STOCHASTIC_NOISE = GAUSSIAN2_FORCING_DISEASE_MODEL__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__RANDOM_SEED = GAUSSIAN2_FORCING_DISEASE_MODEL__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__BINOMIAL_DISTRIBUTION = GAUSSIAN2_FORCING_DISEASE_MODEL__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__POPULATION_IDENTIFIER = GAUSSIAN2_FORCING_DISEASE_MODEL__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__TIME_PERIOD = GAUSSIAN2_FORCING_DISEASE_MODEL__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__DISEASE_NAME = GAUSSIAN2_FORCING_DISEASE_MODEL__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__FINITE_DIFFERENCE = GAUSSIAN2_FORCING_DISEASE_MODEL__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__FREQUENCY_DEPENDENT = GAUSSIAN2_FORCING_DISEASE_MODEL__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY = GAUSSIAN2_FORCING_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = GAUSSIAN2_FORCING_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE = GAUSSIAN2_FORCING_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__TRANSMISSION_RATE = GAUSSIAN2_FORCING_DISEASE_MODEL__TRANSMISSION_RATE;

	/**
	 * The feature id for the '<em><b>Non Linearity Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__NON_LINEARITY_COEFFICIENT = GAUSSIAN2_FORCING_DISEASE_MODEL__NON_LINEARITY_COEFFICIENT;

	/**
	 * The feature id for the '<em><b>Recovery Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__RECOVERY_RATE = GAUSSIAN2_FORCING_DISEASE_MODEL__RECOVERY_RATE;

	/**
	 * The feature id for the '<em><b>Infectious Mortality Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE = GAUSSIAN2_FORCING_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE;

	/**
	 * The feature id for the '<em><b>Immunity Loss Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__IMMUNITY_LOSS_RATE = GAUSSIAN2_FORCING_DISEASE_MODEL__IMMUNITY_LOSS_RATE;

	/**
	 * The feature id for the '<em><b>Sigma2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__SIGMA2 = GAUSSIAN2_FORCING_DISEASE_MODEL__SIGMA2;

	/**
	 * The feature id for the '<em><b>Modulation Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__MODULATION_PERIOD = GAUSSIAN2_FORCING_DISEASE_MODEL__MODULATION_PERIOD;

	/**
	 * The feature id for the '<em><b>Modulation Phase Shift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__MODULATION_PHASE_SHIFT = GAUSSIAN2_FORCING_DISEASE_MODEL__MODULATION_PHASE_SHIFT;

	/**
	 * The feature id for the '<em><b>Modulation Floor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__MODULATION_FLOOR = GAUSSIAN2_FORCING_DISEASE_MODEL__MODULATION_FLOOR;

	/**
	 * The feature id for the '<em><b>Sigma2 2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__SIGMA2_2 = GAUSSIAN2_FORCING_DISEASE_MODEL__SIGMA2_2;

	/**
	 * The feature id for the '<em><b>Att1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__ATT1 = GAUSSIAN2_FORCING_DISEASE_MODEL__ATT1;

	/**
	 * The feature id for the '<em><b>Att2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__ATT2 = GAUSSIAN2_FORCING_DISEASE_MODEL__ATT2;

	/**
	 * The feature id for the '<em><b>Att3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__ATT3 = GAUSSIAN2_FORCING_DISEASE_MODEL__ATT3;

	/**
	 * The feature id for the '<em><b>Att4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__ATT4 = GAUSSIAN2_FORCING_DISEASE_MODEL__ATT4;

	/**
	 * The feature id for the '<em><b>Sigma2 3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__SIGMA2_3 = GAUSSIAN2_FORCING_DISEASE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transmission Rate2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__TRANSMISSION_RATE2 = GAUSSIAN2_FORCING_DISEASE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transmission Rate3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__TRANSMISSION_RATE3 = GAUSSIAN2_FORCING_DISEASE_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Modulation Floor 2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL__MODULATION_FLOOR_2 = GAUSSIAN2_FORCING_DISEASE_MODEL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Gaussian3 Forcing Disease Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN3_FORCING_DISEASE_MODEL_FEATURE_COUNT = GAUSSIAN2_FORCING_DISEASE_MODEL_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.forcing.ForcingDiseaseModel <em>Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disease Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.forcing.ForcingDiseaseModel
	 * @generated
	 */
	EClass getForcingDiseaseModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.forcing.ForcingDiseaseModel#getModulationExponent <em>Modulation Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modulation Exponent</em>'.
	 * @see org.eclipse.stem.diseasemodels.forcing.ForcingDiseaseModel#getModulationExponent()
	 * @see #getForcingDiseaseModel()
	 * @generated
	 */
	EAttribute getForcingDiseaseModel_ModulationExponent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.forcing.ForcingDiseaseModel#getModulationPeriod <em>Modulation Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modulation Period</em>'.
	 * @see org.eclipse.stem.diseasemodels.forcing.ForcingDiseaseModel#getModulationPeriod()
	 * @see #getForcingDiseaseModel()
	 * @generated
	 */
	EAttribute getForcingDiseaseModel_ModulationPeriod();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.forcing.ForcingDiseaseModel#getModulationPhaseShift <em>Modulation Phase Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modulation Phase Shift</em>'.
	 * @see org.eclipse.stem.diseasemodels.forcing.ForcingDiseaseModel#getModulationPhaseShift()
	 * @see #getForcingDiseaseModel()
	 * @generated
	 */
	EAttribute getForcingDiseaseModel_ModulationPhaseShift();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.forcing.ForcingDiseaseModel#getModulationFloor <em>Modulation Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modulation Floor</em>'.
	 * @see org.eclipse.stem.diseasemodels.forcing.ForcingDiseaseModel#getModulationFloor()
	 * @see #getForcingDiseaseModel()
	 * @generated
	 */
	EAttribute getForcingDiseaseModel_ModulationFloor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.forcing.GaussianForcingDiseaseModel <em>Gaussian Forcing Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gaussian Forcing Disease Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.forcing.GaussianForcingDiseaseModel
	 * @generated
	 */
	EClass getGaussianForcingDiseaseModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.forcing.GaussianForcingDiseaseModel#getSigma2 <em>Sigma2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sigma2</em>'.
	 * @see org.eclipse.stem.diseasemodels.forcing.GaussianForcingDiseaseModel#getSigma2()
	 * @see #getGaussianForcingDiseaseModel()
	 * @generated
	 */
	EAttribute getGaussianForcingDiseaseModel_Sigma2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.forcing.GaussianForcingDiseaseModel#getModulationPeriod <em>Modulation Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modulation Period</em>'.
	 * @see org.eclipse.stem.diseasemodels.forcing.GaussianForcingDiseaseModel#getModulationPeriod()
	 * @see #getGaussianForcingDiseaseModel()
	 * @generated
	 */
	EAttribute getGaussianForcingDiseaseModel_ModulationPeriod();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.forcing.GaussianForcingDiseaseModel#getModulationPhaseShift <em>Modulation Phase Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modulation Phase Shift</em>'.
	 * @see org.eclipse.stem.diseasemodels.forcing.GaussianForcingDiseaseModel#getModulationPhaseShift()
	 * @see #getGaussianForcingDiseaseModel()
	 * @generated
	 */
	EAttribute getGaussianForcingDiseaseModel_ModulationPhaseShift();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.forcing.GaussianForcingDiseaseModel#getModulationFloor <em>Modulation Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modulation Floor</em>'.
	 * @see org.eclipse.stem.diseasemodels.forcing.GaussianForcingDiseaseModel#getModulationFloor()
	 * @see #getGaussianForcingDiseaseModel()
	 * @generated
	 */
	EAttribute getGaussianForcingDiseaseModel_ModulationFloor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.forcing.Gaussian2ForcingDiseaseModel <em>Gaussian2 Forcing Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gaussian2 Forcing Disease Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.forcing.Gaussian2ForcingDiseaseModel
	 * @generated
	 */
	EClass getGaussian2ForcingDiseaseModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.forcing.Gaussian2ForcingDiseaseModel#getSigma2_2 <em>Sigma2 2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sigma2 2</em>'.
	 * @see org.eclipse.stem.diseasemodels.forcing.Gaussian2ForcingDiseaseModel#getSigma2_2()
	 * @see #getGaussian2ForcingDiseaseModel()
	 * @generated
	 */
	EAttribute getGaussian2ForcingDiseaseModel_Sigma2_2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.forcing.Gaussian2ForcingDiseaseModel#getAtt1 <em>Att1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Att1</em>'.
	 * @see org.eclipse.stem.diseasemodels.forcing.Gaussian2ForcingDiseaseModel#getAtt1()
	 * @see #getGaussian2ForcingDiseaseModel()
	 * @generated
	 */
	EAttribute getGaussian2ForcingDiseaseModel_Att1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.forcing.Gaussian2ForcingDiseaseModel#getAtt2 <em>Att2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Att2</em>'.
	 * @see org.eclipse.stem.diseasemodels.forcing.Gaussian2ForcingDiseaseModel#getAtt2()
	 * @see #getGaussian2ForcingDiseaseModel()
	 * @generated
	 */
	EAttribute getGaussian2ForcingDiseaseModel_Att2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.forcing.Gaussian2ForcingDiseaseModel#getAtt3 <em>Att3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Att3</em>'.
	 * @see org.eclipse.stem.diseasemodels.forcing.Gaussian2ForcingDiseaseModel#getAtt3()
	 * @see #getGaussian2ForcingDiseaseModel()
	 * @generated
	 */
	EAttribute getGaussian2ForcingDiseaseModel_Att3();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.forcing.Gaussian2ForcingDiseaseModel#getAtt4 <em>Att4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Att4</em>'.
	 * @see org.eclipse.stem.diseasemodels.forcing.Gaussian2ForcingDiseaseModel#getAtt4()
	 * @see #getGaussian2ForcingDiseaseModel()
	 * @generated
	 */
	EAttribute getGaussian2ForcingDiseaseModel_Att4();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.forcing.Gaussian3ForcingDiseaseModel <em>Gaussian3 Forcing Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gaussian3 Forcing Disease Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.forcing.Gaussian3ForcingDiseaseModel
	 * @generated
	 */
	EClass getGaussian3ForcingDiseaseModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.forcing.Gaussian3ForcingDiseaseModel#getSigma2_3 <em>Sigma2 3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sigma2 3</em>'.
	 * @see org.eclipse.stem.diseasemodels.forcing.Gaussian3ForcingDiseaseModel#getSigma2_3()
	 * @see #getGaussian3ForcingDiseaseModel()
	 * @generated
	 */
	EAttribute getGaussian3ForcingDiseaseModel_Sigma2_3();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.forcing.Gaussian3ForcingDiseaseModel#getTransmissionRate2 <em>Transmission Rate2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transmission Rate2</em>'.
	 * @see org.eclipse.stem.diseasemodels.forcing.Gaussian3ForcingDiseaseModel#getTransmissionRate2()
	 * @see #getGaussian3ForcingDiseaseModel()
	 * @generated
	 */
	EAttribute getGaussian3ForcingDiseaseModel_TransmissionRate2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.forcing.Gaussian3ForcingDiseaseModel#getTransmissionRate3 <em>Transmission Rate3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transmission Rate3</em>'.
	 * @see org.eclipse.stem.diseasemodels.forcing.Gaussian3ForcingDiseaseModel#getTransmissionRate3()
	 * @see #getGaussian3ForcingDiseaseModel()
	 * @generated
	 */
	EAttribute getGaussian3ForcingDiseaseModel_TransmissionRate3();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.forcing.Gaussian3ForcingDiseaseModel#getModulationFloor_2 <em>Modulation Floor 2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modulation Floor 2</em>'.
	 * @see org.eclipse.stem.diseasemodels.forcing.Gaussian3ForcingDiseaseModel#getModulationFloor_2()
	 * @see #getGaussian3ForcingDiseaseModel()
	 * @generated
	 */
	EAttribute getGaussian3ForcingDiseaseModel_ModulationFloor_2();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ForcingFactory getForcingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.forcing.impl.ForcingDiseaseModelImpl <em>Disease Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.forcing.impl.ForcingDiseaseModelImpl
		 * @see org.eclipse.stem.diseasemodels.forcing.impl.ForcingPackageImpl#getForcingDiseaseModel()
		 * @generated
		 */
		EClass FORCING_DISEASE_MODEL = eINSTANCE.getForcingDiseaseModel();
		/**
		 * The meta object literal for the '<em><b>Modulation Exponent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORCING_DISEASE_MODEL__MODULATION_EXPONENT = eINSTANCE.getForcingDiseaseModel_ModulationExponent();
		/**
		 * The meta object literal for the '<em><b>Modulation Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORCING_DISEASE_MODEL__MODULATION_PERIOD = eINSTANCE.getForcingDiseaseModel_ModulationPeriod();
		/**
		 * The meta object literal for the '<em><b>Modulation Phase Shift</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORCING_DISEASE_MODEL__MODULATION_PHASE_SHIFT = eINSTANCE.getForcingDiseaseModel_ModulationPhaseShift();
		/**
		 * The meta object literal for the '<em><b>Modulation Floor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORCING_DISEASE_MODEL__MODULATION_FLOOR = eINSTANCE.getForcingDiseaseModel_ModulationFloor();
		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.forcing.impl.GaussianForcingDiseaseModelImpl <em>Gaussian Forcing Disease Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.forcing.impl.GaussianForcingDiseaseModelImpl
		 * @see org.eclipse.stem.diseasemodels.forcing.impl.ForcingPackageImpl#getGaussianForcingDiseaseModel()
		 * @generated
		 */
		EClass GAUSSIAN_FORCING_DISEASE_MODEL = eINSTANCE.getGaussianForcingDiseaseModel();
		/**
		 * The meta object literal for the '<em><b>Sigma2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAUSSIAN_FORCING_DISEASE_MODEL__SIGMA2 = eINSTANCE.getGaussianForcingDiseaseModel_Sigma2();
		/**
		 * The meta object literal for the '<em><b>Modulation Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAUSSIAN_FORCING_DISEASE_MODEL__MODULATION_PERIOD = eINSTANCE.getGaussianForcingDiseaseModel_ModulationPeriod();
		/**
		 * The meta object literal for the '<em><b>Modulation Phase Shift</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAUSSIAN_FORCING_DISEASE_MODEL__MODULATION_PHASE_SHIFT = eINSTANCE.getGaussianForcingDiseaseModel_ModulationPhaseShift();
		/**
		 * The meta object literal for the '<em><b>Modulation Floor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAUSSIAN_FORCING_DISEASE_MODEL__MODULATION_FLOOR = eINSTANCE.getGaussianForcingDiseaseModel_ModulationFloor();
		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.forcing.impl.Gaussian2ForcingDiseaseModelImpl <em>Gaussian2 Forcing Disease Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.forcing.impl.Gaussian2ForcingDiseaseModelImpl
		 * @see org.eclipse.stem.diseasemodels.forcing.impl.ForcingPackageImpl#getGaussian2ForcingDiseaseModel()
		 * @generated
		 */
		EClass GAUSSIAN2_FORCING_DISEASE_MODEL = eINSTANCE.getGaussian2ForcingDiseaseModel();
		/**
		 * The meta object literal for the '<em><b>Sigma2 2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAUSSIAN2_FORCING_DISEASE_MODEL__SIGMA2_2 = eINSTANCE.getGaussian2ForcingDiseaseModel_Sigma2_2();
		/**
		 * The meta object literal for the '<em><b>Att1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAUSSIAN2_FORCING_DISEASE_MODEL__ATT1 = eINSTANCE.getGaussian2ForcingDiseaseModel_Att1();
		/**
		 * The meta object literal for the '<em><b>Att2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAUSSIAN2_FORCING_DISEASE_MODEL__ATT2 = eINSTANCE.getGaussian2ForcingDiseaseModel_Att2();
		/**
		 * The meta object literal for the '<em><b>Att3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAUSSIAN2_FORCING_DISEASE_MODEL__ATT3 = eINSTANCE.getGaussian2ForcingDiseaseModel_Att3();
		/**
		 * The meta object literal for the '<em><b>Att4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAUSSIAN2_FORCING_DISEASE_MODEL__ATT4 = eINSTANCE.getGaussian2ForcingDiseaseModel_Att4();
		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.forcing.impl.Gaussian3ForcingDiseaseModelImpl <em>Gaussian3 Forcing Disease Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.forcing.impl.Gaussian3ForcingDiseaseModelImpl
		 * @see org.eclipse.stem.diseasemodels.forcing.impl.ForcingPackageImpl#getGaussian3ForcingDiseaseModel()
		 * @generated
		 */
		EClass GAUSSIAN3_FORCING_DISEASE_MODEL = eINSTANCE.getGaussian3ForcingDiseaseModel();
		/**
		 * The meta object literal for the '<em><b>Sigma2 3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAUSSIAN3_FORCING_DISEASE_MODEL__SIGMA2_3 = eINSTANCE.getGaussian3ForcingDiseaseModel_Sigma2_3();
		/**
		 * The meta object literal for the '<em><b>Transmission Rate2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAUSSIAN3_FORCING_DISEASE_MODEL__TRANSMISSION_RATE2 = eINSTANCE.getGaussian3ForcingDiseaseModel_TransmissionRate2();
		/**
		 * The meta object literal for the '<em><b>Transmission Rate3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAUSSIAN3_FORCING_DISEASE_MODEL__TRANSMISSION_RATE3 = eINSTANCE.getGaussian3ForcingDiseaseModel_TransmissionRate3();
		/**
		 * The meta object literal for the '<em><b>Modulation Floor 2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAUSSIAN3_FORCING_DISEASE_MODEL__MODULATION_FLOOR_2 = eINSTANCE.getGaussian3ForcingDiseaseModel_ModulationFloor_2();

	}

} //ExamplePackage
