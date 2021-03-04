package org.eclipse.stem.diseasemodels.multipopulation;

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
import org.eclipse.emf.ecore.EReference;
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
 * @see org.eclipse.stem.diseasemodels.multipopulation.MultipopulationFactory
 * @model kind="package"
 * @generated
 */
public interface MultipopulationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "multipopulation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/stem/diseasemodels/multipopulation.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.stem.diseasemodels.multipopulation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MultipopulationPackage eINSTANCE = org.eclipse.stem.diseasemodels.multipopulation.impl.MultipopulationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.multipopulation.impl.MultiPopulationSIDiseaseModelImpl <em>Multi Population SI Disease Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.multipopulation.impl.MultiPopulationSIDiseaseModelImpl
	 * @see org.eclipse.stem.diseasemodels.multipopulation.impl.MultipopulationPackageImpl#getMultiPopulationSIDiseaseModel()
	 * @generated
	 */
	int MULTI_POPULATION_SI_DISEASE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SI_DISEASE_MODEL__URI = StandardPackage.STANDARD_DISEASE_MODEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SI_DISEASE_MODEL__TYPE_URI = StandardPackage.STANDARD_DISEASE_MODEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SI_DISEASE_MODEL__DUBLIN_CORE = StandardPackage.STANDARD_DISEASE_MODEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SI_DISEASE_MODEL__LABELS_TO_UPDATE = StandardPackage.STANDARD_DISEASE_MODEL__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SI_DISEASE_MODEL__GRAPH = StandardPackage.STANDARD_DISEASE_MODEL__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SI_DISEASE_MODEL__ENABLED = StandardPackage.STANDARD_DISEASE_MODEL__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SI_DISEASE_MODEL__GRAPH_DECORATED = StandardPackage.STANDARD_DISEASE_MODEL__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SI_DISEASE_MODEL__PROGRESS = StandardPackage.STANDARD_DISEASE_MODEL__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SI_DISEASE_MODEL__ADD_STOCHASTIC_NOISE = StandardPackage.STANDARD_DISEASE_MODEL__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SI_DISEASE_MODEL__RANDOM_SEED = StandardPackage.STANDARD_DISEASE_MODEL__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SI_DISEASE_MODEL__BINOMIAL_DISTRIBUTION = StandardPackage.STANDARD_DISEASE_MODEL__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SI_DISEASE_MODEL__POPULATION_IDENTIFIER = StandardPackage.STANDARD_DISEASE_MODEL__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SI_DISEASE_MODEL__TIME_PERIOD = StandardPackage.STANDARD_DISEASE_MODEL__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SI_DISEASE_MODEL__DISEASE_NAME = StandardPackage.STANDARD_DISEASE_MODEL__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SI_DISEASE_MODEL__FINITE_DIFFERENCE = StandardPackage.STANDARD_DISEASE_MODEL__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SI_DISEASE_MODEL__FREQUENCY_DEPENDENT = StandardPackage.STANDARD_DISEASE_MODEL__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SI_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY = StandardPackage.STANDARD_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SI_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = StandardPackage.STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SI_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE = StandardPackage.STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Population Groups</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SI_DISEASE_MODEL__POPULATION_GROUPS = StandardPackage.STANDARD_DISEASE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transmission Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SI_DISEASE_MODEL__TRANSMISSION_RATE = StandardPackage.STANDARD_DISEASE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Recovery Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SI_DISEASE_MODEL__RECOVERY_RATE = StandardPackage.STANDARD_DISEASE_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Infectious Mortality Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SI_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE = StandardPackage.STANDARD_DISEASE_MODEL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Multi Population SI Disease Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SI_DISEASE_MODEL_FEATURE_COUNT = StandardPackage.STANDARD_DISEASE_MODEL_FEATURE_COUNT + 4;


	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.multipopulation.impl.MultiPopulationSIRDiseaseModelImpl <em>Multi Population SIR Disease Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.multipopulation.impl.MultiPopulationSIRDiseaseModelImpl
	 * @see org.eclipse.stem.diseasemodels.multipopulation.impl.MultipopulationPackageImpl#getMultiPopulationSIRDiseaseModel()
	 * @generated
	 */
	int MULTI_POPULATION_SIR_DISEASE_MODEL = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SIR_DISEASE_MODEL__URI = MULTI_POPULATION_SI_DISEASE_MODEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SIR_DISEASE_MODEL__TYPE_URI = MULTI_POPULATION_SI_DISEASE_MODEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SIR_DISEASE_MODEL__DUBLIN_CORE = MULTI_POPULATION_SI_DISEASE_MODEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SIR_DISEASE_MODEL__LABELS_TO_UPDATE = MULTI_POPULATION_SI_DISEASE_MODEL__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SIR_DISEASE_MODEL__GRAPH = MULTI_POPULATION_SI_DISEASE_MODEL__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SIR_DISEASE_MODEL__ENABLED = MULTI_POPULATION_SI_DISEASE_MODEL__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SIR_DISEASE_MODEL__GRAPH_DECORATED = MULTI_POPULATION_SI_DISEASE_MODEL__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SIR_DISEASE_MODEL__PROGRESS = MULTI_POPULATION_SI_DISEASE_MODEL__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SIR_DISEASE_MODEL__ADD_STOCHASTIC_NOISE = MULTI_POPULATION_SI_DISEASE_MODEL__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SIR_DISEASE_MODEL__RANDOM_SEED = MULTI_POPULATION_SI_DISEASE_MODEL__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SIR_DISEASE_MODEL__BINOMIAL_DISTRIBUTION = MULTI_POPULATION_SI_DISEASE_MODEL__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SIR_DISEASE_MODEL__POPULATION_IDENTIFIER = MULTI_POPULATION_SI_DISEASE_MODEL__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SIR_DISEASE_MODEL__TIME_PERIOD = MULTI_POPULATION_SI_DISEASE_MODEL__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SIR_DISEASE_MODEL__DISEASE_NAME = MULTI_POPULATION_SI_DISEASE_MODEL__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SIR_DISEASE_MODEL__FINITE_DIFFERENCE = MULTI_POPULATION_SI_DISEASE_MODEL__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SIR_DISEASE_MODEL__FREQUENCY_DEPENDENT = MULTI_POPULATION_SI_DISEASE_MODEL__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SIR_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY = MULTI_POPULATION_SI_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SIR_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = MULTI_POPULATION_SI_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SIR_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE = MULTI_POPULATION_SI_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Population Groups</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SIR_DISEASE_MODEL__POPULATION_GROUPS = MULTI_POPULATION_SI_DISEASE_MODEL__POPULATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Transmission Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SIR_DISEASE_MODEL__TRANSMISSION_RATE = MULTI_POPULATION_SI_DISEASE_MODEL__TRANSMISSION_RATE;

	/**
	 * The feature id for the '<em><b>Recovery Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SIR_DISEASE_MODEL__RECOVERY_RATE = MULTI_POPULATION_SI_DISEASE_MODEL__RECOVERY_RATE;

	/**
	 * The feature id for the '<em><b>Infectious Mortality Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SIR_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE = MULTI_POPULATION_SI_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE;

	/**
	 * The feature id for the '<em><b>Immunity Loss Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SIR_DISEASE_MODEL__IMMUNITY_LOSS_RATE = MULTI_POPULATION_SI_DISEASE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Population SIR Disease Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SIR_DISEASE_MODEL_FEATURE_COUNT = MULTI_POPULATION_SI_DISEASE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.multipopulation.impl.MultiPopulationSEIRDiseaseModelImpl <em>Multi Population SEIR Disease Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.multipopulation.impl.MultiPopulationSEIRDiseaseModelImpl
	 * @see org.eclipse.stem.diseasemodels.multipopulation.impl.MultipopulationPackageImpl#getMultiPopulationSEIRDiseaseModel()
	 * @generated
	 */
	int MULTI_POPULATION_SEIR_DISEASE_MODEL = 2;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEIR_DISEASE_MODEL__URI = MULTI_POPULATION_SIR_DISEASE_MODEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEIR_DISEASE_MODEL__TYPE_URI = MULTI_POPULATION_SIR_DISEASE_MODEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEIR_DISEASE_MODEL__DUBLIN_CORE = MULTI_POPULATION_SIR_DISEASE_MODEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEIR_DISEASE_MODEL__LABELS_TO_UPDATE = MULTI_POPULATION_SIR_DISEASE_MODEL__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEIR_DISEASE_MODEL__GRAPH = MULTI_POPULATION_SIR_DISEASE_MODEL__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEIR_DISEASE_MODEL__ENABLED = MULTI_POPULATION_SIR_DISEASE_MODEL__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEIR_DISEASE_MODEL__GRAPH_DECORATED = MULTI_POPULATION_SIR_DISEASE_MODEL__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEIR_DISEASE_MODEL__PROGRESS = MULTI_POPULATION_SIR_DISEASE_MODEL__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEIR_DISEASE_MODEL__ADD_STOCHASTIC_NOISE = MULTI_POPULATION_SIR_DISEASE_MODEL__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEIR_DISEASE_MODEL__RANDOM_SEED = MULTI_POPULATION_SIR_DISEASE_MODEL__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEIR_DISEASE_MODEL__BINOMIAL_DISTRIBUTION = MULTI_POPULATION_SIR_DISEASE_MODEL__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEIR_DISEASE_MODEL__POPULATION_IDENTIFIER = MULTI_POPULATION_SIR_DISEASE_MODEL__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEIR_DISEASE_MODEL__TIME_PERIOD = MULTI_POPULATION_SIR_DISEASE_MODEL__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEIR_DISEASE_MODEL__DISEASE_NAME = MULTI_POPULATION_SIR_DISEASE_MODEL__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEIR_DISEASE_MODEL__FINITE_DIFFERENCE = MULTI_POPULATION_SIR_DISEASE_MODEL__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEIR_DISEASE_MODEL__FREQUENCY_DEPENDENT = MULTI_POPULATION_SIR_DISEASE_MODEL__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEIR_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY = MULTI_POPULATION_SIR_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEIR_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = MULTI_POPULATION_SIR_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEIR_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE = MULTI_POPULATION_SIR_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Population Groups</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEIR_DISEASE_MODEL__POPULATION_GROUPS = MULTI_POPULATION_SIR_DISEASE_MODEL__POPULATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Transmission Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEIR_DISEASE_MODEL__TRANSMISSION_RATE = MULTI_POPULATION_SIR_DISEASE_MODEL__TRANSMISSION_RATE;

	/**
	 * The feature id for the '<em><b>Recovery Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEIR_DISEASE_MODEL__RECOVERY_RATE = MULTI_POPULATION_SIR_DISEASE_MODEL__RECOVERY_RATE;

	/**
	 * The feature id for the '<em><b>Infectious Mortality Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEIR_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE = MULTI_POPULATION_SIR_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE;

	/**
	 * The feature id for the '<em><b>Immunity Loss Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEIR_DISEASE_MODEL__IMMUNITY_LOSS_RATE = MULTI_POPULATION_SIR_DISEASE_MODEL__IMMUNITY_LOSS_RATE;

	/**
	 * The feature id for the '<em><b>Incubation Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEIR_DISEASE_MODEL__INCUBATION_RATE = MULTI_POPULATION_SIR_DISEASE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Population SEIR Disease Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEIR_DISEASE_MODEL_FEATURE_COUNT = MULTI_POPULATION_SIR_DISEASE_MODEL_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.multipopulation.impl.MultiPopulationSeasonalDiseaseModelImpl <em>Multi Population Seasonal Disease Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.multipopulation.impl.MultiPopulationSeasonalDiseaseModelImpl
	 * @see org.eclipse.stem.diseasemodels.multipopulation.impl.MultipopulationPackageImpl#getMultiPopulationSeasonalDiseaseModel()
	 * @generated
	 */
	int MULTI_POPULATION_SEASONAL_DISEASE_MODEL = 3;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEASONAL_DISEASE_MODEL__URI = MULTI_POPULATION_SEIR_DISEASE_MODEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEASONAL_DISEASE_MODEL__TYPE_URI = MULTI_POPULATION_SEIR_DISEASE_MODEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEASONAL_DISEASE_MODEL__DUBLIN_CORE = MULTI_POPULATION_SEIR_DISEASE_MODEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEASONAL_DISEASE_MODEL__LABELS_TO_UPDATE = MULTI_POPULATION_SEIR_DISEASE_MODEL__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEASONAL_DISEASE_MODEL__GRAPH = MULTI_POPULATION_SEIR_DISEASE_MODEL__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEASONAL_DISEASE_MODEL__ENABLED = MULTI_POPULATION_SEIR_DISEASE_MODEL__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEASONAL_DISEASE_MODEL__GRAPH_DECORATED = MULTI_POPULATION_SEIR_DISEASE_MODEL__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEASONAL_DISEASE_MODEL__PROGRESS = MULTI_POPULATION_SEIR_DISEASE_MODEL__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEASONAL_DISEASE_MODEL__ADD_STOCHASTIC_NOISE = MULTI_POPULATION_SEIR_DISEASE_MODEL__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEASONAL_DISEASE_MODEL__RANDOM_SEED = MULTI_POPULATION_SEIR_DISEASE_MODEL__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEASONAL_DISEASE_MODEL__BINOMIAL_DISTRIBUTION = MULTI_POPULATION_SEIR_DISEASE_MODEL__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEASONAL_DISEASE_MODEL__POPULATION_IDENTIFIER = MULTI_POPULATION_SEIR_DISEASE_MODEL__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEASONAL_DISEASE_MODEL__TIME_PERIOD = MULTI_POPULATION_SEIR_DISEASE_MODEL__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEASONAL_DISEASE_MODEL__DISEASE_NAME = MULTI_POPULATION_SEIR_DISEASE_MODEL__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEASONAL_DISEASE_MODEL__FINITE_DIFFERENCE = MULTI_POPULATION_SEIR_DISEASE_MODEL__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEASONAL_DISEASE_MODEL__FREQUENCY_DEPENDENT = MULTI_POPULATION_SEIR_DISEASE_MODEL__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEASONAL_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY = MULTI_POPULATION_SEIR_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEASONAL_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = MULTI_POPULATION_SEIR_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEASONAL_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE = MULTI_POPULATION_SEIR_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Population Groups</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEASONAL_DISEASE_MODEL__POPULATION_GROUPS = MULTI_POPULATION_SEIR_DISEASE_MODEL__POPULATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Transmission Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEASONAL_DISEASE_MODEL__TRANSMISSION_RATE = MULTI_POPULATION_SEIR_DISEASE_MODEL__TRANSMISSION_RATE;

	/**
	 * The feature id for the '<em><b>Recovery Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEASONAL_DISEASE_MODEL__RECOVERY_RATE = MULTI_POPULATION_SEIR_DISEASE_MODEL__RECOVERY_RATE;

	/**
	 * The feature id for the '<em><b>Infectious Mortality Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEASONAL_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE = MULTI_POPULATION_SEIR_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE;

	/**
	 * The feature id for the '<em><b>Immunity Loss Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEASONAL_DISEASE_MODEL__IMMUNITY_LOSS_RATE = MULTI_POPULATION_SEIR_DISEASE_MODEL__IMMUNITY_LOSS_RATE;

	/**
	 * The feature id for the '<em><b>Incubation Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEASONAL_DISEASE_MODEL__INCUBATION_RATE = MULTI_POPULATION_SEIR_DISEASE_MODEL__INCUBATION_RATE;

	/**
	 * The feature id for the '<em><b>Modulation Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEASONAL_DISEASE_MODEL__MODULATION_POINTS = MULTI_POPULATION_SEIR_DISEASE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Use Spline Interpolation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEASONAL_DISEASE_MODEL__USE_SPLINE_INTERPOLATION = MULTI_POPULATION_SEIR_DISEASE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multi Population Seasonal Disease Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POPULATION_SEASONAL_DISEASE_MODEL_FEATURE_COUNT = MULTI_POPULATION_SEIR_DISEASE_MODEL_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSIDiseaseModel <em>Multi Population SI Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Population SI Disease Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSIDiseaseModel
	 * @generated
	 */
	EClass getMultiPopulationSIDiseaseModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSIDiseaseModel#getTransmissionRate <em>Transmission Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transmission Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSIDiseaseModel#getTransmissionRate()
	 * @see #getMultiPopulationSIDiseaseModel()
	 * @generated
	 */
	EReference getMultiPopulationSIDiseaseModel_TransmissionRate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSIDiseaseModel#getRecoveryRate <em>Recovery Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recovery Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSIDiseaseModel#getRecoveryRate()
	 * @see #getMultiPopulationSIDiseaseModel()
	 * @generated
	 */
	EReference getMultiPopulationSIDiseaseModel_RecoveryRate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSIDiseaseModel#getInfectiousMortalityRate <em>Infectious Mortality Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Infectious Mortality Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSIDiseaseModel#getInfectiousMortalityRate()
	 * @see #getMultiPopulationSIDiseaseModel()
	 * @generated
	 */
	EReference getMultiPopulationSIDiseaseModel_InfectiousMortalityRate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSIRDiseaseModel <em>Multi Population SIR Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Population SIR Disease Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSIRDiseaseModel
	 * @generated
	 */
	EClass getMultiPopulationSIRDiseaseModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSIRDiseaseModel#getImmunityLossRate <em>Immunity Loss Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Immunity Loss Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSIRDiseaseModel#getImmunityLossRate()
	 * @see #getMultiPopulationSIRDiseaseModel()
	 * @generated
	 */
	EReference getMultiPopulationSIRDiseaseModel_ImmunityLossRate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSEIRDiseaseModel <em>Multi Population SEIR Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Population SEIR Disease Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSEIRDiseaseModel
	 * @generated
	 */
	EClass getMultiPopulationSEIRDiseaseModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSEIRDiseaseModel#getIncubationRate <em>Incubation Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Incubation Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSEIRDiseaseModel#getIncubationRate()
	 * @see #getMultiPopulationSEIRDiseaseModel()
	 * @generated
	 */
	EReference getMultiPopulationSEIRDiseaseModel_IncubationRate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSeasonalDiseaseModel <em>Multi Population Seasonal Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Population Seasonal Disease Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSeasonalDiseaseModel
	 * @generated
	 */
	EClass getMultiPopulationSeasonalDiseaseModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSeasonalDiseaseModel#getModulationPoints <em>Modulation Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modulation Points</em>'.
	 * @see org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSeasonalDiseaseModel#getModulationPoints()
	 * @see #getMultiPopulationSeasonalDiseaseModel()
	 * @generated
	 */
	EReference getMultiPopulationSeasonalDiseaseModel_ModulationPoints();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSeasonalDiseaseModel#isUseSplineInterpolation <em>Use Spline Interpolation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Spline Interpolation</em>'.
	 * @see org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSeasonalDiseaseModel#isUseSplineInterpolation()
	 * @see #getMultiPopulationSeasonalDiseaseModel()
	 * @generated
	 */
	EAttribute getMultiPopulationSeasonalDiseaseModel_UseSplineInterpolation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSIDiseaseModel#getPopulationGroups <em>Population Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Population Groups</em>'.
	 * @see org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSIDiseaseModel#getPopulationGroups()
	 * @see #getMultiPopulationSIDiseaseModel()
	 * @generated
	 */
	EReference getMultiPopulationSIDiseaseModel_PopulationGroups();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MultipopulationFactory getMultipopulationFactory();

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
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.multipopulation.impl.MultiPopulationSIDiseaseModelImpl <em>Multi Population SI Disease Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.multipopulation.impl.MultiPopulationSIDiseaseModelImpl
		 * @see org.eclipse.stem.diseasemodels.multipopulation.impl.MultipopulationPackageImpl#getMultiPopulationSIDiseaseModel()
		 * @generated
		 */
		EClass MULTI_POPULATION_SI_DISEASE_MODEL = eINSTANCE.getMultiPopulationSIDiseaseModel();
		/**
		 * The meta object literal for the '<em><b>Transmission Rate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_POPULATION_SI_DISEASE_MODEL__TRANSMISSION_RATE = eINSTANCE.getMultiPopulationSIDiseaseModel_TransmissionRate();
		/**
		 * The meta object literal for the '<em><b>Recovery Rate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_POPULATION_SI_DISEASE_MODEL__RECOVERY_RATE = eINSTANCE.getMultiPopulationSIDiseaseModel_RecoveryRate();
		/**
		 * The meta object literal for the '<em><b>Infectious Mortality Rate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_POPULATION_SI_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE = eINSTANCE.getMultiPopulationSIDiseaseModel_InfectiousMortalityRate();
		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.multipopulation.impl.MultiPopulationSIRDiseaseModelImpl <em>Multi Population SIR Disease Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.multipopulation.impl.MultiPopulationSIRDiseaseModelImpl
		 * @see org.eclipse.stem.diseasemodels.multipopulation.impl.MultipopulationPackageImpl#getMultiPopulationSIRDiseaseModel()
		 * @generated
		 */
		EClass MULTI_POPULATION_SIR_DISEASE_MODEL = eINSTANCE.getMultiPopulationSIRDiseaseModel();
		/**
		 * The meta object literal for the '<em><b>Immunity Loss Rate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_POPULATION_SIR_DISEASE_MODEL__IMMUNITY_LOSS_RATE = eINSTANCE.getMultiPopulationSIRDiseaseModel_ImmunityLossRate();
		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.multipopulation.impl.MultiPopulationSEIRDiseaseModelImpl <em>Multi Population SEIR Disease Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.multipopulation.impl.MultiPopulationSEIRDiseaseModelImpl
		 * @see org.eclipse.stem.diseasemodels.multipopulation.impl.MultipopulationPackageImpl#getMultiPopulationSEIRDiseaseModel()
		 * @generated
		 */
		EClass MULTI_POPULATION_SEIR_DISEASE_MODEL = eINSTANCE.getMultiPopulationSEIRDiseaseModel();
		/**
		 * The meta object literal for the '<em><b>Incubation Rate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_POPULATION_SEIR_DISEASE_MODEL__INCUBATION_RATE = eINSTANCE.getMultiPopulationSEIRDiseaseModel_IncubationRate();
		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.multipopulation.impl.MultiPopulationSeasonalDiseaseModelImpl <em>Multi Population Seasonal Disease Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.multipopulation.impl.MultiPopulationSeasonalDiseaseModelImpl
		 * @see org.eclipse.stem.diseasemodels.multipopulation.impl.MultipopulationPackageImpl#getMultiPopulationSeasonalDiseaseModel()
		 * @generated
		 */
		EClass MULTI_POPULATION_SEASONAL_DISEASE_MODEL = eINSTANCE.getMultiPopulationSeasonalDiseaseModel();
		/**
		 * The meta object literal for the '<em><b>Modulation Points</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_POPULATION_SEASONAL_DISEASE_MODEL__MODULATION_POINTS = eINSTANCE.getMultiPopulationSeasonalDiseaseModel_ModulationPoints();
		/**
		 * The meta object literal for the '<em><b>Use Spline Interpolation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_POPULATION_SEASONAL_DISEASE_MODEL__USE_SPLINE_INTERPOLATION = eINSTANCE.getMultiPopulationSeasonalDiseaseModel_UseSplineInterpolation();
		/**
		 * The meta object literal for the '<em><b>Population Groups</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_POPULATION_SI_DISEASE_MODEL__POPULATION_GROUPS = eINSTANCE.getMultiPopulationSIDiseaseModel_PopulationGroups();

	}

} //MultipopulationPackage
