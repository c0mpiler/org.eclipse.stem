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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.stem.core.graph.GraphPackage;
import org.eclipse.stem.core.model.ModelPackage;

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
 * @see org.eclipse.stem.diseasemodels.standard.StandardFactory
 * @model kind="package"
 * @generated
 */
public interface StandardPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "standard";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/stem/diseasemodels/standard.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.stem.diseasemodels.standard";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StandardPackage eINSTANCE = org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.standard.impl.DiseaseModelImpl <em>Disease Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.impl.DiseaseModelImpl
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getDiseaseModel()
	 * @generated
	 */
	int DISEASE_MODEL = 3;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL__URI = ModelPackage.INTEGRATION_DECORATOR__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL__TYPE_URI = ModelPackage.INTEGRATION_DECORATOR__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL__DUBLIN_CORE = ModelPackage.INTEGRATION_DECORATOR__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL__LABELS_TO_UPDATE = ModelPackage.INTEGRATION_DECORATOR__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL__GRAPH = ModelPackage.INTEGRATION_DECORATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL__ENABLED = ModelPackage.INTEGRATION_DECORATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL__GRAPH_DECORATED = ModelPackage.INTEGRATION_DECORATOR__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL__PROGRESS = ModelPackage.INTEGRATION_DECORATOR__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL__ADD_STOCHASTIC_NOISE = ModelPackage.INTEGRATION_DECORATOR__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL__RANDOM_SEED = ModelPackage.INTEGRATION_DECORATOR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL__BINOMIAL_DISTRIBUTION = ModelPackage.INTEGRATION_DECORATOR__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL__POPULATION_IDENTIFIER = ModelPackage.INTEGRATION_DECORATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL__TIME_PERIOD = ModelPackage.INTEGRATION_DECORATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL__DISEASE_NAME = ModelPackage.INTEGRATION_DECORATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL__FINITE_DIFFERENCE = ModelPackage.INTEGRATION_DECORATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL__FREQUENCY_DEPENDENT = ModelPackage.INTEGRATION_DECORATOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Disease Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL_FEATURE_COUNT = ModelPackage.INTEGRATION_DECORATOR_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelImpl <em>Disease Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelImpl
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getStandardDiseaseModel()
	 * @generated
	 */
	int STANDARD_DISEASE_MODEL = 17;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL__URI = DISEASE_MODEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL__TYPE_URI = DISEASE_MODEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL__DUBLIN_CORE = DISEASE_MODEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL__LABELS_TO_UPDATE = DISEASE_MODEL__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL__GRAPH = DISEASE_MODEL__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL__ENABLED = DISEASE_MODEL__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL__GRAPH_DECORATED = DISEASE_MODEL__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL__PROGRESS = DISEASE_MODEL__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL__ADD_STOCHASTIC_NOISE = DISEASE_MODEL__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL__RANDOM_SEED = DISEASE_MODEL__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL__BINOMIAL_DISTRIBUTION = DISEASE_MODEL__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL__POPULATION_IDENTIFIER = DISEASE_MODEL__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL__TIME_PERIOD = DISEASE_MODEL__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL__DISEASE_NAME = DISEASE_MODEL__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL__FINITE_DIFFERENCE = DISEASE_MODEL__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL__FREQUENCY_DEPENDENT = DISEASE_MODEL__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY = DISEASE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = DISEASE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE = DISEASE_MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Disease Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL_FEATURE_COUNT = DISEASE_MODEL_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.standard.impl.SIImpl <em>SI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.impl.SIImpl
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getSI()
	 * @generated
	 */
	int SI = 10;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI__URI = STANDARD_DISEASE_MODEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI__TYPE_URI = STANDARD_DISEASE_MODEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI__DUBLIN_CORE = STANDARD_DISEASE_MODEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI__LABELS_TO_UPDATE = STANDARD_DISEASE_MODEL__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI__GRAPH = STANDARD_DISEASE_MODEL__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI__ENABLED = STANDARD_DISEASE_MODEL__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI__GRAPH_DECORATED = STANDARD_DISEASE_MODEL__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI__PROGRESS = STANDARD_DISEASE_MODEL__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI__ADD_STOCHASTIC_NOISE = STANDARD_DISEASE_MODEL__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI__RANDOM_SEED = STANDARD_DISEASE_MODEL__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI__BINOMIAL_DISTRIBUTION = STANDARD_DISEASE_MODEL__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI__POPULATION_IDENTIFIER = STANDARD_DISEASE_MODEL__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI__TIME_PERIOD = STANDARD_DISEASE_MODEL__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI__DISEASE_NAME = STANDARD_DISEASE_MODEL__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI__FINITE_DIFFERENCE = STANDARD_DISEASE_MODEL__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI__FREQUENCY_DEPENDENT = STANDARD_DISEASE_MODEL__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI__REFERENCE_POPULATION_DENSITY = STANDARD_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI__ROAD_NETWORK_INFECTIOUS_PROPORTION = STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI__CHARACTERISTIC_MIXING_DISTANCE = STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI__TRANSMISSION_RATE = STANDARD_DISEASE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Non Linearity Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI__NON_LINEARITY_COEFFICIENT = STANDARD_DISEASE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Recovery Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI__RECOVERY_RATE = STANDARD_DISEASE_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Infectious Mortality Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI__INFECTIOUS_MORTALITY_RATE = STANDARD_DISEASE_MODEL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>SI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_FEATURE_COUNT = STANDARD_DISEASE_MODEL_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.standard.impl.SIRImpl <em>SIR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.impl.SIRImpl
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getSIR()
	 * @generated
	 */
	int SIR = 14;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR__URI = SI__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR__TYPE_URI = SI__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR__DUBLIN_CORE = SI__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR__LABELS_TO_UPDATE = SI__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR__GRAPH = SI__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR__ENABLED = SI__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR__GRAPH_DECORATED = SI__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR__PROGRESS = SI__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR__ADD_STOCHASTIC_NOISE = SI__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR__RANDOM_SEED = SI__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR__BINOMIAL_DISTRIBUTION = SI__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR__POPULATION_IDENTIFIER = SI__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR__TIME_PERIOD = SI__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR__DISEASE_NAME = SI__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR__FINITE_DIFFERENCE = SI__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR__FREQUENCY_DEPENDENT = SI__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR__REFERENCE_POPULATION_DENSITY = SI__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR__ROAD_NETWORK_INFECTIOUS_PROPORTION = SI__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR__CHARACTERISTIC_MIXING_DISTANCE = SI__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR__TRANSMISSION_RATE = SI__TRANSMISSION_RATE;

	/**
	 * The feature id for the '<em><b>Non Linearity Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR__NON_LINEARITY_COEFFICIENT = SI__NON_LINEARITY_COEFFICIENT;

	/**
	 * The feature id for the '<em><b>Recovery Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR__RECOVERY_RATE = SI__RECOVERY_RATE;

	/**
	 * The feature id for the '<em><b>Infectious Mortality Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR__INFECTIOUS_MORTALITY_RATE = SI__INFECTIOUS_MORTALITY_RATE;

	/**
	 * The feature id for the '<em><b>Immunity Loss Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR__IMMUNITY_LOSS_RATE = SI_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SIR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_FEATURE_COUNT = SI_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.standard.impl.SEIRImpl <em>SEIR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.impl.SEIRImpl
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getSEIR()
	 * @generated
	 */
	int SEIR = 7;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR__URI = SIR__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR__TYPE_URI = SIR__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR__DUBLIN_CORE = SIR__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR__LABELS_TO_UPDATE = SIR__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR__GRAPH = SIR__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR__ENABLED = SIR__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR__GRAPH_DECORATED = SIR__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR__PROGRESS = SIR__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR__ADD_STOCHASTIC_NOISE = SIR__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR__RANDOM_SEED = SIR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR__BINOMIAL_DISTRIBUTION = SIR__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR__POPULATION_IDENTIFIER = SIR__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR__TIME_PERIOD = SIR__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR__DISEASE_NAME = SIR__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR__FINITE_DIFFERENCE = SIR__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR__FREQUENCY_DEPENDENT = SIR__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR__REFERENCE_POPULATION_DENSITY = SIR__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR__ROAD_NETWORK_INFECTIOUS_PROPORTION = SIR__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR__CHARACTERISTIC_MIXING_DISTANCE = SIR__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR__TRANSMISSION_RATE = SIR__TRANSMISSION_RATE;

	/**
	 * The feature id for the '<em><b>Non Linearity Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR__NON_LINEARITY_COEFFICIENT = SIR__NON_LINEARITY_COEFFICIENT;

	/**
	 * The feature id for the '<em><b>Recovery Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR__RECOVERY_RATE = SIR__RECOVERY_RATE;

	/**
	 * The feature id for the '<em><b>Infectious Mortality Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR__INFECTIOUS_MORTALITY_RATE = SIR__INFECTIOUS_MORTALITY_RATE;

	/**
	 * The feature id for the '<em><b>Immunity Loss Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR__IMMUNITY_LOSS_RATE = SIR__IMMUNITY_LOSS_RATE;

	/**
	 * The feature id for the '<em><b>Incubation Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR__INCUBATION_RATE = SIR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SEIR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR_FEATURE_COUNT = SIR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.standard.impl.DeterministicSEIRDiseaseModelImpl <em>Deterministic SEIR Disease Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.impl.DeterministicSEIRDiseaseModelImpl
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getDeterministicSEIRDiseaseModel()
	 * @generated
	 */
	int DETERMINISTIC_SEIR_DISEASE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SEIR_DISEASE_MODEL__URI = SEIR__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SEIR_DISEASE_MODEL__TYPE_URI = SEIR__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SEIR_DISEASE_MODEL__DUBLIN_CORE = SEIR__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SEIR_DISEASE_MODEL__LABELS_TO_UPDATE = SEIR__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SEIR_DISEASE_MODEL__GRAPH = SEIR__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SEIR_DISEASE_MODEL__ENABLED = SEIR__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SEIR_DISEASE_MODEL__GRAPH_DECORATED = SEIR__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SEIR_DISEASE_MODEL__PROGRESS = SEIR__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SEIR_DISEASE_MODEL__ADD_STOCHASTIC_NOISE = SEIR__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SEIR_DISEASE_MODEL__RANDOM_SEED = SEIR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SEIR_DISEASE_MODEL__BINOMIAL_DISTRIBUTION = SEIR__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SEIR_DISEASE_MODEL__POPULATION_IDENTIFIER = SEIR__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SEIR_DISEASE_MODEL__TIME_PERIOD = SEIR__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SEIR_DISEASE_MODEL__DISEASE_NAME = SEIR__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SEIR_DISEASE_MODEL__FINITE_DIFFERENCE = SEIR__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SEIR_DISEASE_MODEL__FREQUENCY_DEPENDENT = SEIR__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SEIR_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY = SEIR__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SEIR_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = SEIR__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SEIR_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE = SEIR__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SEIR_DISEASE_MODEL__TRANSMISSION_RATE = SEIR__TRANSMISSION_RATE;

	/**
	 * The feature id for the '<em><b>Non Linearity Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SEIR_DISEASE_MODEL__NON_LINEARITY_COEFFICIENT = SEIR__NON_LINEARITY_COEFFICIENT;

	/**
	 * The feature id for the '<em><b>Recovery Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SEIR_DISEASE_MODEL__RECOVERY_RATE = SEIR__RECOVERY_RATE;

	/**
	 * The feature id for the '<em><b>Infectious Mortality Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SEIR_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE = SEIR__INFECTIOUS_MORTALITY_RATE;

	/**
	 * The feature id for the '<em><b>Immunity Loss Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SEIR_DISEASE_MODEL__IMMUNITY_LOSS_RATE = SEIR__IMMUNITY_LOSS_RATE;

	/**
	 * The feature id for the '<em><b>Incubation Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SEIR_DISEASE_MODEL__INCUBATION_RATE = SEIR__INCUBATION_RATE;

	/**
	 * The number of structural features of the '<em>Deterministic SEIR Disease Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SEIR_DISEASE_MODEL_FEATURE_COUNT = SEIR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.standard.impl.DeterministicSIDiseaseModelImpl <em>Deterministic SI Disease Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.impl.DeterministicSIDiseaseModelImpl
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getDeterministicSIDiseaseModel()
	 * @generated
	 */
	int DETERMINISTIC_SI_DISEASE_MODEL = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SI_DISEASE_MODEL__URI = SI__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SI_DISEASE_MODEL__TYPE_URI = SI__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SI_DISEASE_MODEL__DUBLIN_CORE = SI__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SI_DISEASE_MODEL__LABELS_TO_UPDATE = SI__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SI_DISEASE_MODEL__GRAPH = SI__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SI_DISEASE_MODEL__ENABLED = SI__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SI_DISEASE_MODEL__GRAPH_DECORATED = SI__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SI_DISEASE_MODEL__PROGRESS = SI__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SI_DISEASE_MODEL__ADD_STOCHASTIC_NOISE = SI__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SI_DISEASE_MODEL__RANDOM_SEED = SI__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SI_DISEASE_MODEL__BINOMIAL_DISTRIBUTION = SI__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SI_DISEASE_MODEL__POPULATION_IDENTIFIER = SI__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SI_DISEASE_MODEL__TIME_PERIOD = SI__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SI_DISEASE_MODEL__DISEASE_NAME = SI__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SI_DISEASE_MODEL__FINITE_DIFFERENCE = SI__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SI_DISEASE_MODEL__FREQUENCY_DEPENDENT = SI__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SI_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY = SI__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SI_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = SI__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SI_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE = SI__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SI_DISEASE_MODEL__TRANSMISSION_RATE = SI__TRANSMISSION_RATE;

	/**
	 * The feature id for the '<em><b>Non Linearity Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SI_DISEASE_MODEL__NON_LINEARITY_COEFFICIENT = SI__NON_LINEARITY_COEFFICIENT;

	/**
	 * The feature id for the '<em><b>Recovery Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SI_DISEASE_MODEL__RECOVERY_RATE = SI__RECOVERY_RATE;

	/**
	 * The feature id for the '<em><b>Infectious Mortality Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SI_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE = SI__INFECTIOUS_MORTALITY_RATE;

	/**
	 * The number of structural features of the '<em>Deterministic SI Disease Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SI_DISEASE_MODEL_FEATURE_COUNT = SI_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.standard.impl.DeterministicSIRDiseaseModelImpl <em>Deterministic SIR Disease Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.impl.DeterministicSIRDiseaseModelImpl
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getDeterministicSIRDiseaseModel()
	 * @generated
	 */
	int DETERMINISTIC_SIR_DISEASE_MODEL = 2;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SIR_DISEASE_MODEL__URI = SIR__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SIR_DISEASE_MODEL__TYPE_URI = SIR__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SIR_DISEASE_MODEL__DUBLIN_CORE = SIR__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SIR_DISEASE_MODEL__LABELS_TO_UPDATE = SIR__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SIR_DISEASE_MODEL__GRAPH = SIR__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SIR_DISEASE_MODEL__ENABLED = SIR__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SIR_DISEASE_MODEL__GRAPH_DECORATED = SIR__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SIR_DISEASE_MODEL__PROGRESS = SIR__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SIR_DISEASE_MODEL__ADD_STOCHASTIC_NOISE = SIR__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SIR_DISEASE_MODEL__RANDOM_SEED = SIR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SIR_DISEASE_MODEL__BINOMIAL_DISTRIBUTION = SIR__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SIR_DISEASE_MODEL__POPULATION_IDENTIFIER = SIR__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SIR_DISEASE_MODEL__TIME_PERIOD = SIR__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SIR_DISEASE_MODEL__DISEASE_NAME = SIR__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SIR_DISEASE_MODEL__FINITE_DIFFERENCE = SIR__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SIR_DISEASE_MODEL__FREQUENCY_DEPENDENT = SIR__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SIR_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY = SIR__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SIR_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = SIR__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SIR_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE = SIR__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SIR_DISEASE_MODEL__TRANSMISSION_RATE = SIR__TRANSMISSION_RATE;

	/**
	 * The feature id for the '<em><b>Non Linearity Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SIR_DISEASE_MODEL__NON_LINEARITY_COEFFICIENT = SIR__NON_LINEARITY_COEFFICIENT;

	/**
	 * The feature id for the '<em><b>Recovery Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SIR_DISEASE_MODEL__RECOVERY_RATE = SIR__RECOVERY_RATE;

	/**
	 * The feature id for the '<em><b>Infectious Mortality Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SIR_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE = SIR__INFECTIOUS_MORTALITY_RATE;

	/**
	 * The feature id for the '<em><b>Immunity Loss Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SIR_DISEASE_MODEL__IMMUNITY_LOSS_RATE = SIR__IMMUNITY_LOSS_RATE;

	/**
	 * The number of structural features of the '<em>Deterministic SIR Disease Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERMINISTIC_SIR_DISEASE_MODEL_FEATURE_COUNT = SIR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.standard.impl.DiseaseModelLabelImpl <em>Disease Model Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.impl.DiseaseModelLabelImpl
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getDiseaseModelLabel()
	 * @generated
	 */
	int DISEASE_MODEL_LABEL = 4;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL_LABEL__URI = GraphPackage.INTEGRATION_LABEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL_LABEL__TYPE_URI = GraphPackage.INTEGRATION_LABEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL_LABEL__DUBLIN_CORE = GraphPackage.INTEGRATION_LABEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>URI Of Identifiable To Be Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED = GraphPackage.INTEGRATION_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL_LABEL__CURRENT_VALUE = GraphPackage.INTEGRATION_LABEL__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Identifiable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL_LABEL__IDENTIFIABLE = GraphPackage.INTEGRATION_LABEL__IDENTIFIABLE;

	/**
	 * The feature id for the '<em><b>Next Value Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL_LABEL__NEXT_VALUE_VALID = GraphPackage.INTEGRATION_LABEL__NEXT_VALUE_VALID;

	/**
	 * The feature id for the '<em><b>Next Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL_LABEL__NEXT_VALUE = GraphPackage.INTEGRATION_LABEL__NEXT_VALUE;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL_LABEL__DECORATOR = GraphPackage.INTEGRATION_LABEL__DECORATOR;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL_LABEL__NODE = GraphPackage.INTEGRATION_LABEL__NODE;

	/**
	 * The feature id for the '<em><b>Delta Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL_LABEL__DELTA_VALUE = GraphPackage.INTEGRATION_LABEL__DELTA_VALUE;

	/**
	 * The feature id for the '<em><b>Temp Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL_LABEL__TEMP_VALUE = GraphPackage.INTEGRATION_LABEL__TEMP_VALUE;

	/**
	 * The feature id for the '<em><b>Probe Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL_LABEL__PROBE_VALUE = GraphPackage.INTEGRATION_LABEL__PROBE_VALUE;

	/**
	 * The feature id for the '<em><b>Error Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL_LABEL__ERROR_SCALE = GraphPackage.INTEGRATION_LABEL__ERROR_SCALE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL_LABEL__IDENTIFIER = GraphPackage.INTEGRATION_LABEL__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Population Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL_LABEL__POPULATION_LABEL = GraphPackage.INTEGRATION_LABEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Population Model Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL_LABEL__POPULATION_MODEL_LABEL = GraphPackage.INTEGRATION_LABEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Disease Model Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL_LABEL_FEATURE_COUNT = GraphPackage.INTEGRATION_LABEL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.standard.impl.DiseaseModelLabelValueImpl <em>Disease Model Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.impl.DiseaseModelLabelValueImpl
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getDiseaseModelLabelValue()
	 * @generated
	 */
	int DISEASE_MODEL_LABEL_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Arrivals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL_LABEL_VALUE__ARRIVALS = GraphPackage.INTEGRATION_LABEL_VALUE__ARRIVALS;

	/**
	 * The feature id for the '<em><b>Departures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL_LABEL_VALUE__DEPARTURES = GraphPackage.INTEGRATION_LABEL_VALUE__DEPARTURES;

	/**
	 * The feature id for the '<em><b>Population Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL_LABEL_VALUE__POPULATION_COUNT = GraphPackage.INTEGRATION_LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Disease Model Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT = GraphPackage.INTEGRATION_LABEL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.standard.impl.InfectorImpl <em>Infector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.impl.InfectorImpl
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getInfector()
	 * @generated
	 */
	int INFECTOR = 6;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFECTOR__URI = ModelPackage.NODE_DECORATOR__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFECTOR__TYPE_URI = ModelPackage.NODE_DECORATOR__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFECTOR__DUBLIN_CORE = ModelPackage.NODE_DECORATOR__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFECTOR__LABELS_TO_UPDATE = ModelPackage.NODE_DECORATOR__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFECTOR__GRAPH = ModelPackage.NODE_DECORATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFECTOR__ENABLED = ModelPackage.NODE_DECORATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFECTOR__GRAPH_DECORATED = ModelPackage.NODE_DECORATOR__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFECTOR__PROGRESS = ModelPackage.NODE_DECORATOR__PROGRESS;

	/**
	 * The feature id for the '<em><b>Disease Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFECTOR__DISEASE_MODEL = ModelPackage.NODE_DECORATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFECTOR__TARGET_URI = ModelPackage.NODE_DECORATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFECTOR__DISEASE_NAME = ModelPackage.NODE_DECORATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target ISO Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFECTOR__TARGET_ISO_KEY = ModelPackage.NODE_DECORATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Labels To Infect</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFECTOR__LABELS_TO_INFECT = ModelPackage.NODE_DECORATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFECTOR__POPULATION_IDENTIFIER = ModelPackage.NODE_DECORATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Infect Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFECTOR__INFECT_PERCENTAGE = ModelPackage.NODE_DECORATOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Target Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFECTOR__TARGET_FEATURE = ModelPackage.NODE_DECORATOR_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Infector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFECTOR_FEATURE_COUNT = ModelPackage.NODE_DECORATOR_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelLabelImpl <em>Disease Model Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelLabelImpl
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getStandardDiseaseModelLabel()
	 * @generated
	 */
	int STANDARD_DISEASE_MODEL_LABEL = 18;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL_LABEL__URI = DISEASE_MODEL_LABEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL_LABEL__TYPE_URI = DISEASE_MODEL_LABEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL_LABEL__DUBLIN_CORE = DISEASE_MODEL_LABEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>URI Of Identifiable To Be Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED = DISEASE_MODEL_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL_LABEL__CURRENT_VALUE = DISEASE_MODEL_LABEL__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Identifiable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL_LABEL__IDENTIFIABLE = DISEASE_MODEL_LABEL__IDENTIFIABLE;

	/**
	 * The feature id for the '<em><b>Next Value Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL_LABEL__NEXT_VALUE_VALID = DISEASE_MODEL_LABEL__NEXT_VALUE_VALID;

	/**
	 * The feature id for the '<em><b>Next Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL_LABEL__NEXT_VALUE = DISEASE_MODEL_LABEL__NEXT_VALUE;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL_LABEL__DECORATOR = DISEASE_MODEL_LABEL__DECORATOR;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL_LABEL__NODE = DISEASE_MODEL_LABEL__NODE;

	/**
	 * The feature id for the '<em><b>Delta Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL_LABEL__DELTA_VALUE = DISEASE_MODEL_LABEL__DELTA_VALUE;

	/**
	 * The feature id for the '<em><b>Temp Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL_LABEL__TEMP_VALUE = DISEASE_MODEL_LABEL__TEMP_VALUE;

	/**
	 * The feature id for the '<em><b>Probe Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL_LABEL__PROBE_VALUE = DISEASE_MODEL_LABEL__PROBE_VALUE;

	/**
	 * The feature id for the '<em><b>Error Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL_LABEL__ERROR_SCALE = DISEASE_MODEL_LABEL__ERROR_SCALE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL_LABEL__IDENTIFIER = DISEASE_MODEL_LABEL__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Population Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL_LABEL__POPULATION_LABEL = DISEASE_MODEL_LABEL__POPULATION_LABEL;

	/**
	 * The feature id for the '<em><b>Population Model Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL_LABEL__POPULATION_MODEL_LABEL = DISEASE_MODEL_LABEL__POPULATION_MODEL_LABEL;

	/**
	 * The number of structural features of the '<em>Disease Model Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL_LABEL_FEATURE_COUNT = DISEASE_MODEL_LABEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.standard.impl.SILabelImpl <em>SI Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.impl.SILabelImpl
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getSILabel()
	 * @generated
	 */
	int SI_LABEL = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.standard.impl.SIRLabelImpl <em>SIR Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.impl.SIRLabelImpl
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getSIRLabel()
	 * @generated
	 */
	int SIR_LABEL = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.standard.impl.SEIRLabelImpl <em>SEIR Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.impl.SEIRLabelImpl
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getSEIRLabel()
	 * @generated
	 */
	int SEIR_LABEL = 8;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR_LABEL__URI = STANDARD_DISEASE_MODEL_LABEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR_LABEL__TYPE_URI = STANDARD_DISEASE_MODEL_LABEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR_LABEL__DUBLIN_CORE = STANDARD_DISEASE_MODEL_LABEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>URI Of Identifiable To Be Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED = STANDARD_DISEASE_MODEL_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR_LABEL__CURRENT_VALUE = STANDARD_DISEASE_MODEL_LABEL__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Identifiable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR_LABEL__IDENTIFIABLE = STANDARD_DISEASE_MODEL_LABEL__IDENTIFIABLE;

	/**
	 * The feature id for the '<em><b>Next Value Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR_LABEL__NEXT_VALUE_VALID = STANDARD_DISEASE_MODEL_LABEL__NEXT_VALUE_VALID;

	/**
	 * The feature id for the '<em><b>Next Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR_LABEL__NEXT_VALUE = STANDARD_DISEASE_MODEL_LABEL__NEXT_VALUE;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR_LABEL__DECORATOR = STANDARD_DISEASE_MODEL_LABEL__DECORATOR;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR_LABEL__NODE = STANDARD_DISEASE_MODEL_LABEL__NODE;

	/**
	 * The feature id for the '<em><b>Delta Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR_LABEL__DELTA_VALUE = STANDARD_DISEASE_MODEL_LABEL__DELTA_VALUE;

	/**
	 * The feature id for the '<em><b>Temp Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR_LABEL__TEMP_VALUE = STANDARD_DISEASE_MODEL_LABEL__TEMP_VALUE;

	/**
	 * The feature id for the '<em><b>Probe Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR_LABEL__PROBE_VALUE = STANDARD_DISEASE_MODEL_LABEL__PROBE_VALUE;

	/**
	 * The feature id for the '<em><b>Error Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR_LABEL__ERROR_SCALE = STANDARD_DISEASE_MODEL_LABEL__ERROR_SCALE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR_LABEL__IDENTIFIER = STANDARD_DISEASE_MODEL_LABEL__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Population Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR_LABEL__POPULATION_LABEL = STANDARD_DISEASE_MODEL_LABEL__POPULATION_LABEL;

	/**
	 * The feature id for the '<em><b>Population Model Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR_LABEL__POPULATION_MODEL_LABEL = STANDARD_DISEASE_MODEL_LABEL__POPULATION_MODEL_LABEL;

	/**
	 * The number of structural features of the '<em>SEIR Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR_LABEL_FEATURE_COUNT = STANDARD_DISEASE_MODEL_LABEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelLabelValueImpl <em>Disease Model Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelLabelValueImpl
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getStandardDiseaseModelLabelValue()
	 * @generated
	 */
	int STANDARD_DISEASE_MODEL_LABEL_VALUE = 19;

	/**
	 * The feature id for the '<em><b>Arrivals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL_LABEL_VALUE__ARRIVALS = DISEASE_MODEL_LABEL_VALUE__ARRIVALS;

	/**
	 * The feature id for the '<em><b>Departures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL_LABEL_VALUE__DEPARTURES = DISEASE_MODEL_LABEL_VALUE__DEPARTURES;

	/**
	 * The feature id for the '<em><b>Population Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL_LABEL_VALUE__POPULATION_COUNT = DISEASE_MODEL_LABEL_VALUE__POPULATION_COUNT;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL_LABEL_VALUE__S = DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL_LABEL_VALUE__INCIDENCE = DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Disease Deaths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL_LABEL_VALUE__DISEASE_DEATHS = DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Disease Model Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT = DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.standard.impl.SILabelValueImpl <em>SI Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.impl.SILabelValueImpl
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getSILabelValue()
	 * @generated
	 */
	int SI_LABEL_VALUE = 13;

	/**
	 * The feature id for the '<em><b>Arrivals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_LABEL_VALUE__ARRIVALS = STANDARD_DISEASE_MODEL_LABEL_VALUE__ARRIVALS;

	/**
	 * The feature id for the '<em><b>Departures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_LABEL_VALUE__DEPARTURES = STANDARD_DISEASE_MODEL_LABEL_VALUE__DEPARTURES;

	/**
	 * The feature id for the '<em><b>Population Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_LABEL_VALUE__POPULATION_COUNT = STANDARD_DISEASE_MODEL_LABEL_VALUE__POPULATION_COUNT;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_LABEL_VALUE__S = STANDARD_DISEASE_MODEL_LABEL_VALUE__S;

	/**
	 * The feature id for the '<em><b>Incidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_LABEL_VALUE__INCIDENCE = STANDARD_DISEASE_MODEL_LABEL_VALUE__INCIDENCE;

	/**
	 * The feature id for the '<em><b>Disease Deaths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_LABEL_VALUE__DISEASE_DEATHS = STANDARD_DISEASE_MODEL_LABEL_VALUE__DISEASE_DEATHS;

	/**
	 * The feature id for the '<em><b>I</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_LABEL_VALUE__I = STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SI Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_LABEL_VALUE_FEATURE_COUNT = STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.standard.impl.SIRLabelValueImpl <em>SIR Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.impl.SIRLabelValueImpl
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getSIRLabelValue()
	 * @generated
	 */
	int SIR_LABEL_VALUE = 16;

	/**
	 * The feature id for the '<em><b>Arrivals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_LABEL_VALUE__ARRIVALS = SI_LABEL_VALUE__ARRIVALS;

	/**
	 * The feature id for the '<em><b>Departures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_LABEL_VALUE__DEPARTURES = SI_LABEL_VALUE__DEPARTURES;

	/**
	 * The feature id for the '<em><b>Population Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_LABEL_VALUE__POPULATION_COUNT = SI_LABEL_VALUE__POPULATION_COUNT;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_LABEL_VALUE__S = SI_LABEL_VALUE__S;

	/**
	 * The feature id for the '<em><b>Incidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_LABEL_VALUE__INCIDENCE = SI_LABEL_VALUE__INCIDENCE;

	/**
	 * The feature id for the '<em><b>Disease Deaths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_LABEL_VALUE__DISEASE_DEATHS = SI_LABEL_VALUE__DISEASE_DEATHS;

	/**
	 * The feature id for the '<em><b>I</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_LABEL_VALUE__I = SI_LABEL_VALUE__I;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_LABEL_VALUE__R = SI_LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SIR Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_LABEL_VALUE_FEATURE_COUNT = SI_LABEL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.standard.impl.SEIRLabelValueImpl <em>SEIR Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.impl.SEIRLabelValueImpl
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getSEIRLabelValue()
	 * @generated
	 */
	int SEIR_LABEL_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Arrivals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR_LABEL_VALUE__ARRIVALS = SIR_LABEL_VALUE__ARRIVALS;

	/**
	 * The feature id for the '<em><b>Departures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR_LABEL_VALUE__DEPARTURES = SIR_LABEL_VALUE__DEPARTURES;

	/**
	 * The feature id for the '<em><b>Population Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR_LABEL_VALUE__POPULATION_COUNT = SIR_LABEL_VALUE__POPULATION_COUNT;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR_LABEL_VALUE__S = SIR_LABEL_VALUE__S;

	/**
	 * The feature id for the '<em><b>Incidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR_LABEL_VALUE__INCIDENCE = SIR_LABEL_VALUE__INCIDENCE;

	/**
	 * The feature id for the '<em><b>Disease Deaths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR_LABEL_VALUE__DISEASE_DEATHS = SIR_LABEL_VALUE__DISEASE_DEATHS;

	/**
	 * The feature id for the '<em><b>I</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR_LABEL_VALUE__I = SIR_LABEL_VALUE__I;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR_LABEL_VALUE__R = SIR_LABEL_VALUE__R;

	/**
	 * The feature id for the '<em><b>E</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR_LABEL_VALUE__E = SIR_LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SEIR Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEIR_LABEL_VALUE_FEATURE_COUNT = SIR_LABEL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.standard.impl.StandardInfectorImpl <em>Infector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardInfectorImpl
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getStandardInfector()
	 * @generated
	 */
	int STANDARD_INFECTOR = 20;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INFECTOR__URI = INFECTOR__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INFECTOR__TYPE_URI = INFECTOR__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INFECTOR__DUBLIN_CORE = INFECTOR__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INFECTOR__LABELS_TO_UPDATE = INFECTOR__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INFECTOR__GRAPH = INFECTOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INFECTOR__ENABLED = INFECTOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INFECTOR__GRAPH_DECORATED = INFECTOR__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INFECTOR__PROGRESS = INFECTOR__PROGRESS;

	/**
	 * The feature id for the '<em><b>Disease Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INFECTOR__DISEASE_MODEL = INFECTOR__DISEASE_MODEL;

	/**
	 * The feature id for the '<em><b>Target URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INFECTOR__TARGET_URI = INFECTOR__TARGET_URI;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INFECTOR__DISEASE_NAME = INFECTOR__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Target ISO Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INFECTOR__TARGET_ISO_KEY = INFECTOR__TARGET_ISO_KEY;

	/**
	 * The feature id for the '<em><b>Labels To Infect</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INFECTOR__LABELS_TO_INFECT = INFECTOR__LABELS_TO_INFECT;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INFECTOR__POPULATION_IDENTIFIER = INFECTOR__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Infect Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INFECTOR__INFECT_PERCENTAGE = INFECTOR__INFECT_PERCENTAGE;

	/**
	 * The feature id for the '<em><b>Target Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INFECTOR__TARGET_FEATURE = INFECTOR__TARGET_FEATURE;

	/**
	 * The number of structural features of the '<em>Infector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INFECTOR_FEATURE_COUNT = INFECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.standard.impl.SIInfectorImpl <em>SI Infector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.impl.SIInfectorImpl
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getSIInfector()
	 * @generated
	 */
	int SI_INFECTOR = 11;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INFECTOR__URI = STANDARD_INFECTOR__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INFECTOR__TYPE_URI = STANDARD_INFECTOR__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INFECTOR__DUBLIN_CORE = STANDARD_INFECTOR__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INFECTOR__LABELS_TO_UPDATE = STANDARD_INFECTOR__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INFECTOR__GRAPH = STANDARD_INFECTOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INFECTOR__ENABLED = STANDARD_INFECTOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INFECTOR__GRAPH_DECORATED = STANDARD_INFECTOR__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INFECTOR__PROGRESS = STANDARD_INFECTOR__PROGRESS;

	/**
	 * The feature id for the '<em><b>Disease Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INFECTOR__DISEASE_MODEL = STANDARD_INFECTOR__DISEASE_MODEL;

	/**
	 * The feature id for the '<em><b>Target URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INFECTOR__TARGET_URI = STANDARD_INFECTOR__TARGET_URI;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INFECTOR__DISEASE_NAME = STANDARD_INFECTOR__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Target ISO Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INFECTOR__TARGET_ISO_KEY = STANDARD_INFECTOR__TARGET_ISO_KEY;

	/**
	 * The feature id for the '<em><b>Labels To Infect</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INFECTOR__LABELS_TO_INFECT = STANDARD_INFECTOR__LABELS_TO_INFECT;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INFECTOR__POPULATION_IDENTIFIER = STANDARD_INFECTOR__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Infect Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INFECTOR__INFECT_PERCENTAGE = STANDARD_INFECTOR__INFECT_PERCENTAGE;

	/**
	 * The feature id for the '<em><b>Target Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INFECTOR__TARGET_FEATURE = STANDARD_INFECTOR__TARGET_FEATURE;

	/**
	 * The feature id for the '<em><b>Infectious Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INFECTOR__INFECTIOUS_COUNT = STANDARD_INFECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SI Infector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INFECTOR_FEATURE_COUNT = STANDARD_INFECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_LABEL__URI = STANDARD_DISEASE_MODEL_LABEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_LABEL__TYPE_URI = STANDARD_DISEASE_MODEL_LABEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_LABEL__DUBLIN_CORE = STANDARD_DISEASE_MODEL_LABEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>URI Of Identifiable To Be Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED = STANDARD_DISEASE_MODEL_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_LABEL__CURRENT_VALUE = STANDARD_DISEASE_MODEL_LABEL__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Identifiable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_LABEL__IDENTIFIABLE = STANDARD_DISEASE_MODEL_LABEL__IDENTIFIABLE;

	/**
	 * The feature id for the '<em><b>Next Value Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_LABEL__NEXT_VALUE_VALID = STANDARD_DISEASE_MODEL_LABEL__NEXT_VALUE_VALID;

	/**
	 * The feature id for the '<em><b>Next Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_LABEL__NEXT_VALUE = STANDARD_DISEASE_MODEL_LABEL__NEXT_VALUE;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_LABEL__DECORATOR = STANDARD_DISEASE_MODEL_LABEL__DECORATOR;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_LABEL__NODE = STANDARD_DISEASE_MODEL_LABEL__NODE;

	/**
	 * The feature id for the '<em><b>Delta Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_LABEL__DELTA_VALUE = STANDARD_DISEASE_MODEL_LABEL__DELTA_VALUE;

	/**
	 * The feature id for the '<em><b>Temp Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_LABEL__TEMP_VALUE = STANDARD_DISEASE_MODEL_LABEL__TEMP_VALUE;

	/**
	 * The feature id for the '<em><b>Probe Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_LABEL__PROBE_VALUE = STANDARD_DISEASE_MODEL_LABEL__PROBE_VALUE;

	/**
	 * The feature id for the '<em><b>Error Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_LABEL__ERROR_SCALE = STANDARD_DISEASE_MODEL_LABEL__ERROR_SCALE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_LABEL__IDENTIFIER = STANDARD_DISEASE_MODEL_LABEL__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Population Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_LABEL__POPULATION_LABEL = STANDARD_DISEASE_MODEL_LABEL__POPULATION_LABEL;

	/**
	 * The feature id for the '<em><b>Population Model Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_LABEL__POPULATION_MODEL_LABEL = STANDARD_DISEASE_MODEL_LABEL__POPULATION_MODEL_LABEL;

	/**
	 * The number of structural features of the '<em>SI Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_LABEL_FEATURE_COUNT = STANDARD_DISEASE_MODEL_LABEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_LABEL__URI = STANDARD_DISEASE_MODEL_LABEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_LABEL__TYPE_URI = STANDARD_DISEASE_MODEL_LABEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_LABEL__DUBLIN_CORE = STANDARD_DISEASE_MODEL_LABEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>URI Of Identifiable To Be Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED = STANDARD_DISEASE_MODEL_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_LABEL__CURRENT_VALUE = STANDARD_DISEASE_MODEL_LABEL__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Identifiable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_LABEL__IDENTIFIABLE = STANDARD_DISEASE_MODEL_LABEL__IDENTIFIABLE;

	/**
	 * The feature id for the '<em><b>Next Value Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_LABEL__NEXT_VALUE_VALID = STANDARD_DISEASE_MODEL_LABEL__NEXT_VALUE_VALID;

	/**
	 * The feature id for the '<em><b>Next Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_LABEL__NEXT_VALUE = STANDARD_DISEASE_MODEL_LABEL__NEXT_VALUE;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_LABEL__DECORATOR = STANDARD_DISEASE_MODEL_LABEL__DECORATOR;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_LABEL__NODE = STANDARD_DISEASE_MODEL_LABEL__NODE;

	/**
	 * The feature id for the '<em><b>Delta Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_LABEL__DELTA_VALUE = STANDARD_DISEASE_MODEL_LABEL__DELTA_VALUE;

	/**
	 * The feature id for the '<em><b>Temp Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_LABEL__TEMP_VALUE = STANDARD_DISEASE_MODEL_LABEL__TEMP_VALUE;

	/**
	 * The feature id for the '<em><b>Probe Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_LABEL__PROBE_VALUE = STANDARD_DISEASE_MODEL_LABEL__PROBE_VALUE;

	/**
	 * The feature id for the '<em><b>Error Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_LABEL__ERROR_SCALE = STANDARD_DISEASE_MODEL_LABEL__ERROR_SCALE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_LABEL__IDENTIFIER = STANDARD_DISEASE_MODEL_LABEL__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Population Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_LABEL__POPULATION_LABEL = STANDARD_DISEASE_MODEL_LABEL__POPULATION_LABEL;

	/**
	 * The feature id for the '<em><b>Population Model Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_LABEL__POPULATION_MODEL_LABEL = STANDARD_DISEASE_MODEL_LABEL__POPULATION_MODEL_LABEL;

	/**
	 * The number of structural features of the '<em>SIR Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_LABEL_FEATURE_COUNT = STANDARD_DISEASE_MODEL_LABEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.standard.impl.StochasticSEIRDiseaseModelImpl <em>Stochastic SEIR Disease Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StochasticSEIRDiseaseModelImpl
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getStochasticSEIRDiseaseModel()
	 * @generated
	 */
	int STOCHASTIC_SEIR_DISEASE_MODEL = 21;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SEIR_DISEASE_MODEL__URI = SEIR__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SEIR_DISEASE_MODEL__TYPE_URI = SEIR__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SEIR_DISEASE_MODEL__DUBLIN_CORE = SEIR__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SEIR_DISEASE_MODEL__LABELS_TO_UPDATE = SEIR__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SEIR_DISEASE_MODEL__GRAPH = SEIR__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SEIR_DISEASE_MODEL__ENABLED = SEIR__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SEIR_DISEASE_MODEL__GRAPH_DECORATED = SEIR__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SEIR_DISEASE_MODEL__PROGRESS = SEIR__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SEIR_DISEASE_MODEL__ADD_STOCHASTIC_NOISE = SEIR__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SEIR_DISEASE_MODEL__RANDOM_SEED = SEIR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SEIR_DISEASE_MODEL__BINOMIAL_DISTRIBUTION = SEIR__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SEIR_DISEASE_MODEL__POPULATION_IDENTIFIER = SEIR__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SEIR_DISEASE_MODEL__TIME_PERIOD = SEIR__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SEIR_DISEASE_MODEL__DISEASE_NAME = SEIR__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SEIR_DISEASE_MODEL__FINITE_DIFFERENCE = SEIR__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SEIR_DISEASE_MODEL__FREQUENCY_DEPENDENT = SEIR__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SEIR_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY = SEIR__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SEIR_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = SEIR__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SEIR_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE = SEIR__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SEIR_DISEASE_MODEL__TRANSMISSION_RATE = SEIR__TRANSMISSION_RATE;

	/**
	 * The feature id for the '<em><b>Non Linearity Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SEIR_DISEASE_MODEL__NON_LINEARITY_COEFFICIENT = SEIR__NON_LINEARITY_COEFFICIENT;

	/**
	 * The feature id for the '<em><b>Recovery Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SEIR_DISEASE_MODEL__RECOVERY_RATE = SEIR__RECOVERY_RATE;

	/**
	 * The feature id for the '<em><b>Infectious Mortality Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SEIR_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE = SEIR__INFECTIOUS_MORTALITY_RATE;

	/**
	 * The feature id for the '<em><b>Immunity Loss Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SEIR_DISEASE_MODEL__IMMUNITY_LOSS_RATE = SEIR__IMMUNITY_LOSS_RATE;

	/**
	 * The feature id for the '<em><b>Incubation Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SEIR_DISEASE_MODEL__INCUBATION_RATE = SEIR__INCUBATION_RATE;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SEIR_DISEASE_MODEL__SEED = SEIR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Random Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SEIR_DISEASE_MODEL__RANDOM_GENERATOR = SEIR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SEIR_DISEASE_MODEL__GAIN = SEIR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Stochastic SEIR Disease Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SEIR_DISEASE_MODEL_FEATURE_COUNT = SEIR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.standard.impl.StochasticSIDiseaseModelImpl <em>Stochastic SI Disease Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StochasticSIDiseaseModelImpl
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getStochasticSIDiseaseModel()
	 * @generated
	 */
	int STOCHASTIC_SI_DISEASE_MODEL = 22;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SI_DISEASE_MODEL__URI = SI__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SI_DISEASE_MODEL__TYPE_URI = SI__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SI_DISEASE_MODEL__DUBLIN_CORE = SI__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SI_DISEASE_MODEL__LABELS_TO_UPDATE = SI__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SI_DISEASE_MODEL__GRAPH = SI__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SI_DISEASE_MODEL__ENABLED = SI__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SI_DISEASE_MODEL__GRAPH_DECORATED = SI__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SI_DISEASE_MODEL__PROGRESS = SI__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SI_DISEASE_MODEL__ADD_STOCHASTIC_NOISE = SI__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SI_DISEASE_MODEL__RANDOM_SEED = SI__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SI_DISEASE_MODEL__BINOMIAL_DISTRIBUTION = SI__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SI_DISEASE_MODEL__POPULATION_IDENTIFIER = SI__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SI_DISEASE_MODEL__TIME_PERIOD = SI__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SI_DISEASE_MODEL__DISEASE_NAME = SI__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SI_DISEASE_MODEL__FINITE_DIFFERENCE = SI__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SI_DISEASE_MODEL__FREQUENCY_DEPENDENT = SI__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SI_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY = SI__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SI_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = SI__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SI_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE = SI__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SI_DISEASE_MODEL__TRANSMISSION_RATE = SI__TRANSMISSION_RATE;

	/**
	 * The feature id for the '<em><b>Non Linearity Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SI_DISEASE_MODEL__NON_LINEARITY_COEFFICIENT = SI__NON_LINEARITY_COEFFICIENT;

	/**
	 * The feature id for the '<em><b>Recovery Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SI_DISEASE_MODEL__RECOVERY_RATE = SI__RECOVERY_RATE;

	/**
	 * The feature id for the '<em><b>Infectious Mortality Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SI_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE = SI__INFECTIOUS_MORTALITY_RATE;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SI_DISEASE_MODEL__SEED = SI_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Random Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SI_DISEASE_MODEL__RANDOM_GENERATOR = SI_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SI_DISEASE_MODEL__GAIN = SI_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Stochastic SI Disease Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SI_DISEASE_MODEL_FEATURE_COUNT = SI_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.standard.impl.StochasticSIRDiseaseModelImpl <em>Stochastic SIR Disease Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StochasticSIRDiseaseModelImpl
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getStochasticSIRDiseaseModel()
	 * @generated
	 */
	int STOCHASTIC_SIR_DISEASE_MODEL = 23;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SIR_DISEASE_MODEL__URI = SIR__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SIR_DISEASE_MODEL__TYPE_URI = SIR__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SIR_DISEASE_MODEL__DUBLIN_CORE = SIR__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SIR_DISEASE_MODEL__LABELS_TO_UPDATE = SIR__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SIR_DISEASE_MODEL__GRAPH = SIR__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SIR_DISEASE_MODEL__ENABLED = SIR__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SIR_DISEASE_MODEL__GRAPH_DECORATED = SIR__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SIR_DISEASE_MODEL__PROGRESS = SIR__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SIR_DISEASE_MODEL__ADD_STOCHASTIC_NOISE = SIR__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SIR_DISEASE_MODEL__RANDOM_SEED = SIR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SIR_DISEASE_MODEL__BINOMIAL_DISTRIBUTION = SIR__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SIR_DISEASE_MODEL__POPULATION_IDENTIFIER = SIR__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SIR_DISEASE_MODEL__TIME_PERIOD = SIR__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SIR_DISEASE_MODEL__DISEASE_NAME = SIR__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SIR_DISEASE_MODEL__FINITE_DIFFERENCE = SIR__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SIR_DISEASE_MODEL__FREQUENCY_DEPENDENT = SIR__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SIR_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY = SIR__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SIR_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = SIR__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SIR_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE = SIR__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SIR_DISEASE_MODEL__TRANSMISSION_RATE = SIR__TRANSMISSION_RATE;

	/**
	 * The feature id for the '<em><b>Non Linearity Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SIR_DISEASE_MODEL__NON_LINEARITY_COEFFICIENT = SIR__NON_LINEARITY_COEFFICIENT;

	/**
	 * The feature id for the '<em><b>Recovery Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SIR_DISEASE_MODEL__RECOVERY_RATE = SIR__RECOVERY_RATE;

	/**
	 * The feature id for the '<em><b>Infectious Mortality Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SIR_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE = SIR__INFECTIOUS_MORTALITY_RATE;

	/**
	 * The feature id for the '<em><b>Immunity Loss Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SIR_DISEASE_MODEL__IMMUNITY_LOSS_RATE = SIR__IMMUNITY_LOSS_RATE;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SIR_DISEASE_MODEL__SEED = SIR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Random Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SIR_DISEASE_MODEL__RANDOM_GENERATOR = SIR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SIR_DISEASE_MODEL__GAIN = SIR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Stochastic SIR Disease Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_SIR_DISEASE_MODEL_FEATURE_COUNT = SIR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.standard.impl.StochasticDiseaseModelImpl <em>Stochastic Disease Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StochasticDiseaseModelImpl
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getStochasticDiseaseModel()
	 * @generated
	 */
	int STOCHASTIC_DISEASE_MODEL = 24;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_DISEASE_MODEL__SEED = 0;

	/**
	 * The feature id for the '<em><b>Random Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_DISEASE_MODEL__RANDOM_GENERATOR = 1;

	/**
	 * The number of structural features of the '<em>Stochastic Disease Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_DISEASE_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.standard.impl.StandardStochasticDiseaseModelImpl <em>Stochastic Disease Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardStochasticDiseaseModelImpl
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getStandardStochasticDiseaseModel()
	 * @generated
	 */
	int STANDARD_STOCHASTIC_DISEASE_MODEL = 25;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_STOCHASTIC_DISEASE_MODEL__SEED = STOCHASTIC_DISEASE_MODEL__SEED;

	/**
	 * The feature id for the '<em><b>Random Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_STOCHASTIC_DISEASE_MODEL__RANDOM_GENERATOR = STOCHASTIC_DISEASE_MODEL__RANDOM_GENERATOR;

	/**
	 * The feature id for the '<em><b>Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_STOCHASTIC_DISEASE_MODEL__GAIN = STOCHASTIC_DISEASE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stochastic Disease Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_STOCHASTIC_DISEASE_MODEL_FEATURE_COUNT = STOCHASTIC_DISEASE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.standard.impl.SIRInoculatorImpl <em>SIR Inoculator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.impl.SIRInoculatorImpl
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getSIRInoculator()
	 * @generated
	 */
	int SIR_INOCULATOR = 26;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_INOCULATOR__URI = SI_INFECTOR__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_INOCULATOR__TYPE_URI = SI_INFECTOR__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_INOCULATOR__DUBLIN_CORE = SI_INFECTOR__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_INOCULATOR__LABELS_TO_UPDATE = SI_INFECTOR__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_INOCULATOR__GRAPH = SI_INFECTOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_INOCULATOR__ENABLED = SI_INFECTOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_INOCULATOR__GRAPH_DECORATED = SI_INFECTOR__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_INOCULATOR__PROGRESS = SI_INFECTOR__PROGRESS;

	/**
	 * The feature id for the '<em><b>Disease Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_INOCULATOR__DISEASE_MODEL = SI_INFECTOR__DISEASE_MODEL;

	/**
	 * The feature id for the '<em><b>Target URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_INOCULATOR__TARGET_URI = SI_INFECTOR__TARGET_URI;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_INOCULATOR__DISEASE_NAME = SI_INFECTOR__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Target ISO Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_INOCULATOR__TARGET_ISO_KEY = SI_INFECTOR__TARGET_ISO_KEY;

	/**
	 * The feature id for the '<em><b>Labels To Infect</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_INOCULATOR__LABELS_TO_INFECT = SI_INFECTOR__LABELS_TO_INFECT;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_INOCULATOR__POPULATION_IDENTIFIER = SI_INFECTOR__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Infect Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_INOCULATOR__INFECT_PERCENTAGE = SI_INFECTOR__INFECT_PERCENTAGE;

	/**
	 * The feature id for the '<em><b>Target Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_INOCULATOR__TARGET_FEATURE = SI_INFECTOR__TARGET_FEATURE;

	/**
	 * The feature id for the '<em><b>Infectious Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_INOCULATOR__INFECTIOUS_COUNT = SI_INFECTOR__INFECTIOUS_COUNT;

	/**
	 * The feature id for the '<em><b>Inoculated Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_INOCULATOR__INOCULATED_PERCENTAGE = SI_INFECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inoculate Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_INOCULATOR__INOCULATE_PERCENTAGE = SI_INFECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SIR Inoculator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_INOCULATOR_FEATURE_COUNT = SI_INFECTOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.standard.impl.StochasticPoissonSIDiseaseModelImpl <em>Stochastic Poisson SI Disease Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StochasticPoissonSIDiseaseModelImpl
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getStochasticPoissonSIDiseaseModel()
	 * @generated
	 */
	int STOCHASTIC_POISSON_SI_DISEASE_MODEL = 27;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SI_DISEASE_MODEL__URI = SI__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SI_DISEASE_MODEL__TYPE_URI = SI__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SI_DISEASE_MODEL__DUBLIN_CORE = SI__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SI_DISEASE_MODEL__LABELS_TO_UPDATE = SI__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SI_DISEASE_MODEL__GRAPH = SI__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SI_DISEASE_MODEL__ENABLED = SI__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SI_DISEASE_MODEL__GRAPH_DECORATED = SI__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SI_DISEASE_MODEL__PROGRESS = SI__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SI_DISEASE_MODEL__ADD_STOCHASTIC_NOISE = SI__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SI_DISEASE_MODEL__RANDOM_SEED = SI__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SI_DISEASE_MODEL__BINOMIAL_DISTRIBUTION = SI__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SI_DISEASE_MODEL__POPULATION_IDENTIFIER = SI__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SI_DISEASE_MODEL__TIME_PERIOD = SI__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SI_DISEASE_MODEL__DISEASE_NAME = SI__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SI_DISEASE_MODEL__FINITE_DIFFERENCE = SI__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SI_DISEASE_MODEL__FREQUENCY_DEPENDENT = SI__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SI_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY = SI__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SI_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = SI__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SI_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE = SI__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SI_DISEASE_MODEL__TRANSMISSION_RATE = SI__TRANSMISSION_RATE;

	/**
	 * The feature id for the '<em><b>Non Linearity Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SI_DISEASE_MODEL__NON_LINEARITY_COEFFICIENT = SI__NON_LINEARITY_COEFFICIENT;

	/**
	 * The feature id for the '<em><b>Recovery Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SI_DISEASE_MODEL__RECOVERY_RATE = SI__RECOVERY_RATE;

	/**
	 * The feature id for the '<em><b>Infectious Mortality Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SI_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE = SI__INFECTIOUS_MORTALITY_RATE;

	/**
	 * The number of structural features of the '<em>Stochastic Poisson SI Disease Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SI_DISEASE_MODEL_FEATURE_COUNT = SI_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.standard.impl.StochasticPoissonSIRDiseaseModelImpl <em>Stochastic Poisson SIR Disease Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StochasticPoissonSIRDiseaseModelImpl
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getStochasticPoissonSIRDiseaseModel()
	 * @generated
	 */
	int STOCHASTIC_POISSON_SIR_DISEASE_MODEL = 28;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SIR_DISEASE_MODEL__URI = SIR__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SIR_DISEASE_MODEL__TYPE_URI = SIR__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SIR_DISEASE_MODEL__DUBLIN_CORE = SIR__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SIR_DISEASE_MODEL__LABELS_TO_UPDATE = SIR__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SIR_DISEASE_MODEL__GRAPH = SIR__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SIR_DISEASE_MODEL__ENABLED = SIR__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SIR_DISEASE_MODEL__GRAPH_DECORATED = SIR__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SIR_DISEASE_MODEL__PROGRESS = SIR__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SIR_DISEASE_MODEL__ADD_STOCHASTIC_NOISE = SIR__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SIR_DISEASE_MODEL__RANDOM_SEED = SIR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SIR_DISEASE_MODEL__BINOMIAL_DISTRIBUTION = SIR__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SIR_DISEASE_MODEL__POPULATION_IDENTIFIER = SIR__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SIR_DISEASE_MODEL__TIME_PERIOD = SIR__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SIR_DISEASE_MODEL__DISEASE_NAME = SIR__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SIR_DISEASE_MODEL__FINITE_DIFFERENCE = SIR__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SIR_DISEASE_MODEL__FREQUENCY_DEPENDENT = SIR__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SIR_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY = SIR__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SIR_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = SIR__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SIR_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE = SIR__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SIR_DISEASE_MODEL__TRANSMISSION_RATE = SIR__TRANSMISSION_RATE;

	/**
	 * The feature id for the '<em><b>Non Linearity Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SIR_DISEASE_MODEL__NON_LINEARITY_COEFFICIENT = SIR__NON_LINEARITY_COEFFICIENT;

	/**
	 * The feature id for the '<em><b>Recovery Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SIR_DISEASE_MODEL__RECOVERY_RATE = SIR__RECOVERY_RATE;

	/**
	 * The feature id for the '<em><b>Infectious Mortality Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SIR_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE = SIR__INFECTIOUS_MORTALITY_RATE;

	/**
	 * The feature id for the '<em><b>Immunity Loss Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SIR_DISEASE_MODEL__IMMUNITY_LOSS_RATE = SIR__IMMUNITY_LOSS_RATE;

	/**
	 * The number of structural features of the '<em>Stochastic Poisson SIR Disease Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SIR_DISEASE_MODEL_FEATURE_COUNT = SIR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.standard.impl.StochasticPoissonSEIRDiseaseModelImpl <em>Stochastic Poisson SEIR Disease Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StochasticPoissonSEIRDiseaseModelImpl
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getStochasticPoissonSEIRDiseaseModel()
	 * @generated
	 */
	int STOCHASTIC_POISSON_SEIR_DISEASE_MODEL = 29;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SEIR_DISEASE_MODEL__URI = SEIR__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SEIR_DISEASE_MODEL__TYPE_URI = SEIR__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SEIR_DISEASE_MODEL__DUBLIN_CORE = SEIR__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SEIR_DISEASE_MODEL__LABELS_TO_UPDATE = SEIR__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SEIR_DISEASE_MODEL__GRAPH = SEIR__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SEIR_DISEASE_MODEL__ENABLED = SEIR__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SEIR_DISEASE_MODEL__GRAPH_DECORATED = SEIR__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SEIR_DISEASE_MODEL__PROGRESS = SEIR__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SEIR_DISEASE_MODEL__ADD_STOCHASTIC_NOISE = SEIR__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SEIR_DISEASE_MODEL__RANDOM_SEED = SEIR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SEIR_DISEASE_MODEL__BINOMIAL_DISTRIBUTION = SEIR__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SEIR_DISEASE_MODEL__POPULATION_IDENTIFIER = SEIR__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SEIR_DISEASE_MODEL__TIME_PERIOD = SEIR__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SEIR_DISEASE_MODEL__DISEASE_NAME = SEIR__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SEIR_DISEASE_MODEL__FINITE_DIFFERENCE = SEIR__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SEIR_DISEASE_MODEL__FREQUENCY_DEPENDENT = SEIR__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SEIR_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY = SEIR__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SEIR_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = SEIR__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SEIR_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE = SEIR__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SEIR_DISEASE_MODEL__TRANSMISSION_RATE = SEIR__TRANSMISSION_RATE;

	/**
	 * The feature id for the '<em><b>Non Linearity Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SEIR_DISEASE_MODEL__NON_LINEARITY_COEFFICIENT = SEIR__NON_LINEARITY_COEFFICIENT;

	/**
	 * The feature id for the '<em><b>Recovery Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SEIR_DISEASE_MODEL__RECOVERY_RATE = SEIR__RECOVERY_RATE;

	/**
	 * The feature id for the '<em><b>Infectious Mortality Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SEIR_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE = SEIR__INFECTIOUS_MORTALITY_RATE;

	/**
	 * The feature id for the '<em><b>Immunity Loss Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SEIR_DISEASE_MODEL__IMMUNITY_LOSS_RATE = SEIR__IMMUNITY_LOSS_RATE;

	/**
	 * The feature id for the '<em><b>Incubation Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SEIR_DISEASE_MODEL__INCUBATION_RATE = SEIR__INCUBATION_RATE;

	/**
	 * The number of structural features of the '<em>Stochastic Poisson SEIR Disease Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_POISSON_SEIR_DISEASE_MODEL_FEATURE_COUNT = SEIR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.standard.impl.InfectorInoculatorCollectionImpl <em>Infector Inoculator Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.impl.InfectorInoculatorCollectionImpl
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getInfectorInoculatorCollection()
	 * @generated
	 */
	int INFECTOR_INOCULATOR_COLLECTION = 30;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFECTOR_INOCULATOR_COLLECTION__URI = ModelPackage.NODE_DECORATOR__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFECTOR_INOCULATOR_COLLECTION__TYPE_URI = ModelPackage.NODE_DECORATOR__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFECTOR_INOCULATOR_COLLECTION__DUBLIN_CORE = ModelPackage.NODE_DECORATOR__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFECTOR_INOCULATOR_COLLECTION__LABELS_TO_UPDATE = ModelPackage.NODE_DECORATOR__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFECTOR_INOCULATOR_COLLECTION__GRAPH = ModelPackage.NODE_DECORATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFECTOR_INOCULATOR_COLLECTION__ENABLED = ModelPackage.NODE_DECORATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFECTOR_INOCULATOR_COLLECTION__GRAPH_DECORATED = ModelPackage.NODE_DECORATOR__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFECTOR_INOCULATOR_COLLECTION__PROGRESS = ModelPackage.NODE_DECORATOR__PROGRESS;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFECTOR_INOCULATOR_COLLECTION__LIST = ModelPackage.NODE_DECORATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Import Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFECTOR_INOCULATOR_COLLECTION__IMPORT_FOLDER = ModelPackage.NODE_DECORATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Infector Inoculator Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFECTOR_INOCULATOR_COLLECTION_FEATURE_COUNT = ModelPackage.NODE_DECORATOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.standard.impl.DiseaseInitializerImpl <em>Disease Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.impl.DiseaseInitializerImpl
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getDiseaseInitializer()
	 * @generated
	 */
	int DISEASE_INITIALIZER = 32;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_INITIALIZER__URI = ModelPackage.NODE_DECORATOR__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_INITIALIZER__TYPE_URI = ModelPackage.NODE_DECORATOR__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_INITIALIZER__DUBLIN_CORE = ModelPackage.NODE_DECORATOR__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_INITIALIZER__LABELS_TO_UPDATE = ModelPackage.NODE_DECORATOR__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_INITIALIZER__GRAPH = ModelPackage.NODE_DECORATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_INITIALIZER__ENABLED = ModelPackage.NODE_DECORATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_INITIALIZER__GRAPH_DECORATED = ModelPackage.NODE_DECORATOR__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_INITIALIZER__PROGRESS = ModelPackage.NODE_DECORATOR__PROGRESS;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_INITIALIZER__DISEASE_NAME = ModelPackage.NODE_DECORATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_INITIALIZER__POPULATION_IDENTIFIER = ModelPackage.NODE_DECORATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Disease Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_INITIALIZER_FEATURE_COUNT = ModelPackage.NODE_DECORATOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseInitializerImpl <em>Disease Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseInitializerImpl
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getStandardDiseaseInitializer()
	 * @generated
	 */
	int STANDARD_DISEASE_INITIALIZER = 31;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_INITIALIZER__URI = DISEASE_INITIALIZER__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_INITIALIZER__TYPE_URI = DISEASE_INITIALIZER__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_INITIALIZER__DUBLIN_CORE = DISEASE_INITIALIZER__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_INITIALIZER__LABELS_TO_UPDATE = DISEASE_INITIALIZER__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_INITIALIZER__GRAPH = DISEASE_INITIALIZER__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_INITIALIZER__ENABLED = DISEASE_INITIALIZER__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_INITIALIZER__GRAPH_DECORATED = DISEASE_INITIALIZER__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_INITIALIZER__PROGRESS = DISEASE_INITIALIZER__PROGRESS;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_INITIALIZER__DISEASE_NAME = DISEASE_INITIALIZER__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_INITIALIZER__POPULATION_IDENTIFIER = DISEASE_INITIALIZER__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Target ISO Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_INITIALIZER__TARGET_ISO_KEY = DISEASE_INITIALIZER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_INITIALIZER__TARGET_URI = DISEASE_INITIALIZER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Compartments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_INITIALIZER__COMPARTMENTS = DISEASE_INITIALIZER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compartment Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_INITIALIZER__COMPARTMENT_VALUES = DISEASE_INITIALIZER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Use Fractions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_INITIALIZER__USE_FRACTIONS = DISEASE_INITIALIZER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Disease Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DISEASE_INITIALIZER_FEATURE_COUNT = DISEASE_INITIALIZER_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.standard.impl.ExternalDataSourceDiseaseInitializerImpl <em>External Data Source Disease Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.impl.ExternalDataSourceDiseaseInitializerImpl
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getExternalDataSourceDiseaseInitializer()
	 * @generated
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER = 33;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER__URI = DISEASE_INITIALIZER__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER__TYPE_URI = DISEASE_INITIALIZER__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER__DUBLIN_CORE = DISEASE_INITIALIZER__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER__LABELS_TO_UPDATE = DISEASE_INITIALIZER__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER__GRAPH = DISEASE_INITIALIZER__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER__ENABLED = DISEASE_INITIALIZER__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER__GRAPH_DECORATED = DISEASE_INITIALIZER__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER__PROGRESS = DISEASE_INITIALIZER__PROGRESS;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER__DISEASE_NAME = DISEASE_INITIALIZER__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER__POPULATION_IDENTIFIER = DISEASE_INITIALIZER__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Data Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER__DATA_PATH = DISEASE_INITIALIZER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER__ROW = DISEASE_INITIALIZER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Do Rescaling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER__DO_RESCALING = DISEASE_INITIALIZER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>External Data Source Disease Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER_FEATURE_COUNT = DISEASE_INITIALIZER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '<em>Random</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Random
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getRandom()
	 * @generated
	 */
	int RANDOM = 34;


	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.standard.DeterministicSEIRDiseaseModel <em>Deterministic SEIR Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deterministic SEIR Disease Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.DeterministicSEIRDiseaseModel
	 * @generated
	 */
	EClass getDeterministicSEIRDiseaseModel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.standard.DeterministicSIDiseaseModel <em>Deterministic SI Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deterministic SI Disease Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.DeterministicSIDiseaseModel
	 * @generated
	 */
	EClass getDeterministicSIDiseaseModel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.standard.DeterministicSIRDiseaseModel <em>Deterministic SIR Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deterministic SIR Disease Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.DeterministicSIRDiseaseModel
	 * @generated
	 */
	EClass getDeterministicSIRDiseaseModel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.standard.DiseaseModel <em>Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disease Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.DiseaseModel
	 * @generated
	 */
	EClass getDiseaseModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.DiseaseModel#getPopulationIdentifier <em>Population Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Population Identifier</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.DiseaseModel#getPopulationIdentifier()
	 * @see #getDiseaseModel()
	 * @generated
	 */
	EAttribute getDiseaseModel_PopulationIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.DiseaseModel#getTimePeriod <em>Time Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Period</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.DiseaseModel#getTimePeriod()
	 * @see #getDiseaseModel()
	 * @generated
	 */
	EAttribute getDiseaseModel_TimePeriod();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.DiseaseModel#getDiseaseName <em>Disease Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disease Name</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.DiseaseModel#getDiseaseName()
	 * @see #getDiseaseModel()
	 * @generated
	 */
	EAttribute getDiseaseModel_DiseaseName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.DiseaseModel#isFiniteDifference <em>Finite Difference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finite Difference</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.DiseaseModel#isFiniteDifference()
	 * @see #getDiseaseModel()
	 * @generated
	 */
	EAttribute getDiseaseModel_FiniteDifference();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.DiseaseModel#isFrequencyDependent <em>Frequency Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency Dependent</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.DiseaseModel#isFrequencyDependent()
	 * @see #getDiseaseModel()
	 * @generated
	 */
	EAttribute getDiseaseModel_FrequencyDependent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel <em>Disease Model Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disease Model Label</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel
	 * @generated
	 */
	EClass getDiseaseModelLabel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel#getPopulationLabel <em>Population Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Population Label</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel#getPopulationLabel()
	 * @see #getDiseaseModelLabel()
	 * @generated
	 */
	EReference getDiseaseModelLabel_PopulationLabel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel#getPopulationModelLabel <em>Population Model Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Population Model Label</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel#getPopulationModelLabel()
	 * @see #getDiseaseModelLabel()
	 * @generated
	 */
	EReference getDiseaseModelLabel_PopulationModelLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue <em>Disease Model Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disease Model Label Value</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue
	 * @generated
	 */
	EClass getDiseaseModelLabelValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue#getPopulationCount <em>Population Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Population Count</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue#getPopulationCount()
	 * @see #getDiseaseModelLabelValue()
	 * @generated
	 */
	EAttribute getDiseaseModelLabelValue_PopulationCount();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.standard.Infector <em>Infector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infector</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.Infector
	 * @generated
	 */
	EClass getInfector();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.diseasemodels.standard.Infector#getDiseaseModel <em>Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Disease Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.Infector#getDiseaseModel()
	 * @see #getInfector()
	 * @generated
	 */
	EReference getInfector_DiseaseModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.Infector#getTargetURI <em>Target URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target URI</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.Infector#getTargetURI()
	 * @see #getInfector()
	 * @generated
	 */
	EAttribute getInfector_TargetURI();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.Infector#getDiseaseName <em>Disease Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disease Name</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.Infector#getDiseaseName()
	 * @see #getInfector()
	 * @generated
	 */
	EAttribute getInfector_DiseaseName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.Infector#getTargetISOKey <em>Target ISO Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target ISO Key</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.Infector#getTargetISOKey()
	 * @see #getInfector()
	 * @generated
	 */
	EAttribute getInfector_TargetISOKey();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.stem.diseasemodels.standard.Infector#getLabelsToInfect <em>Labels To Infect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Labels To Infect</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.Infector#getLabelsToInfect()
	 * @see #getInfector()
	 * @generated
	 */
	EReference getInfector_LabelsToInfect();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.Infector#getPopulationIdentifier <em>Population Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Population Identifier</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.Infector#getPopulationIdentifier()
	 * @see #getInfector()
	 * @generated
	 */
	EAttribute getInfector_PopulationIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.Infector#isInfectPercentage <em>Infect Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Infect Percentage</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.Infector#isInfectPercentage()
	 * @see #getInfector()
	 * @generated
	 */
	EAttribute getInfector_InfectPercentage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.Infector#getTargetFeature <em>Target Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Feature</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.Infector#getTargetFeature()
	 * @see #getInfector()
	 * @generated
	 */
	EAttribute getInfector_TargetFeature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.standard.SEIR <em>SEIR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SEIR</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.SEIR
	 * @generated
	 */
	EClass getSEIR();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.SEIR#getIncubationRate <em>Incubation Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incubation Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.SEIR#getIncubationRate()
	 * @see #getSEIR()
	 * @generated
	 */
	EAttribute getSEIR_IncubationRate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.standard.SEIRLabel <em>SEIR Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SEIR Label</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.SEIRLabel
	 * @generated
	 */
	EClass getSEIRLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.standard.SEIRLabelValue <em>SEIR Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SEIR Label Value</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.SEIRLabelValue
	 * @generated
	 */
	EClass getSEIRLabelValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.SEIRLabelValue#getE <em>E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>E</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.SEIRLabelValue#getE()
	 * @see #getSEIRLabelValue()
	 * @generated
	 */
	EAttribute getSEIRLabelValue_E();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.standard.SI <em>SI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SI</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.SI
	 * @generated
	 */
	EClass getSI();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.SI#getTransmissionRate <em>Transmission Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transmission Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.SI#getTransmissionRate()
	 * @see #getSI()
	 * @generated
	 */
	EAttribute getSI_TransmissionRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.SI#getNonLinearityCoefficient <em>Non Linearity Coefficient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Non Linearity Coefficient</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.SI#getNonLinearityCoefficient()
	 * @see #getSI()
	 * @generated
	 */
	EAttribute getSI_NonLinearityCoefficient();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.SI#getRecoveryRate <em>Recovery Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recovery Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.SI#getRecoveryRate()
	 * @see #getSI()
	 * @generated
	 */
	EAttribute getSI_RecoveryRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.SI#getInfectiousMortalityRate <em>Infectious Mortality Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Infectious Mortality Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.SI#getInfectiousMortalityRate()
	 * @see #getSI()
	 * @generated
	 */
	EAttribute getSI_InfectiousMortalityRate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.standard.SIInfector <em>SI Infector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SI Infector</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.SIInfector
	 * @generated
	 */
	EClass getSIInfector();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.SIInfector#getInfectiousCount <em>Infectious Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Infectious Count</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.SIInfector#getInfectiousCount()
	 * @see #getSIInfector()
	 * @generated
	 */
	EAttribute getSIInfector_InfectiousCount();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.standard.SILabel <em>SI Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SI Label</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.SILabel
	 * @generated
	 */
	EClass getSILabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.standard.SILabelValue <em>SI Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SI Label Value</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.SILabelValue
	 * @generated
	 */
	EClass getSILabelValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.SILabelValue#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>I</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.SILabelValue#getI()
	 * @see #getSILabelValue()
	 * @generated
	 */
	EAttribute getSILabelValue_I();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.standard.SIR <em>SIR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SIR</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.SIR
	 * @generated
	 */
	EClass getSIR();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.SIR#getImmunityLossRate <em>Immunity Loss Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immunity Loss Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.SIR#getImmunityLossRate()
	 * @see #getSIR()
	 * @generated
	 */
	EAttribute getSIR_ImmunityLossRate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.standard.SIRLabel <em>SIR Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SIR Label</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.SIRLabel
	 * @generated
	 */
	EClass getSIRLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.standard.SIRLabelValue <em>SIR Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SIR Label Value</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.SIRLabelValue
	 * @generated
	 */
	EClass getSIRLabelValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.SIRLabelValue#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.SIRLabelValue#getR()
	 * @see #getSIRLabelValue()
	 * @generated
	 */
	EAttribute getSIRLabelValue_R();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel <em>Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disease Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel
	 * @generated
	 */
	EClass getStandardDiseaseModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel#getReferencePopulationDensity <em>Reference Population Density</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Population Density</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel#getReferencePopulationDensity()
	 * @see #getStandardDiseaseModel()
	 * @generated
	 */
	EAttribute getStandardDiseaseModel_ReferencePopulationDensity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel#getRoadNetworkInfectiousProportion <em>Road Network Infectious Proportion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Road Network Infectious Proportion</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel#getRoadNetworkInfectiousProportion()
	 * @see #getStandardDiseaseModel()
	 * @generated
	 */
	EAttribute getStandardDiseaseModel_RoadNetworkInfectiousProportion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel#getCharacteristicMixingDistance <em>Characteristic Mixing Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic Mixing Distance</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel#getCharacteristicMixingDistance()
	 * @see #getStandardDiseaseModel()
	 * @generated
	 */
	EAttribute getStandardDiseaseModel_CharacteristicMixingDistance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel <em>Disease Model Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disease Model Label</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel
	 * @generated
	 */
	EClass getStandardDiseaseModelLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue <em>Disease Model Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disease Model Label Value</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue
	 * @generated
	 */
	EClass getStandardDiseaseModelLabelValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>S</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue#getS()
	 * @see #getStandardDiseaseModelLabelValue()
	 * @generated
	 */
	EAttribute getStandardDiseaseModelLabelValue_S();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue#getIncidence <em>Incidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incidence</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue#getIncidence()
	 * @see #getStandardDiseaseModelLabelValue()
	 * @generated
	 */
	EAttribute getStandardDiseaseModelLabelValue_Incidence();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue#getDiseaseDeaths <em>Disease Deaths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disease Deaths</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue#getDiseaseDeaths()
	 * @see #getStandardDiseaseModelLabelValue()
	 * @generated
	 */
	EAttribute getStandardDiseaseModelLabelValue_DiseaseDeaths();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.standard.StandardInfector <em>Infector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infector</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.StandardInfector
	 * @generated
	 */
	EClass getStandardInfector();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.standard.StochasticSEIRDiseaseModel <em>Stochastic SEIR Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stochastic SEIR Disease Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.StochasticSEIRDiseaseModel
	 * @generated
	 */
	EClass getStochasticSEIRDiseaseModel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.standard.StochasticSIDiseaseModel <em>Stochastic SI Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stochastic SI Disease Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.StochasticSIDiseaseModel
	 * @generated
	 */
	EClass getStochasticSIDiseaseModel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.standard.StochasticSIRDiseaseModel <em>Stochastic SIR Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stochastic SIR Disease Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.StochasticSIRDiseaseModel
	 * @generated
	 */
	EClass getStochasticSIRDiseaseModel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.standard.StochasticDiseaseModel <em>Stochastic Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stochastic Disease Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.StochasticDiseaseModel
	 * @generated
	 */
	EClass getStochasticDiseaseModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.StochasticDiseaseModel#getSeed <em>Seed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seed</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.StochasticDiseaseModel#getSeed()
	 * @see #getStochasticDiseaseModel()
	 * @generated
	 */
	EAttribute getStochasticDiseaseModel_Seed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.StochasticDiseaseModel#getRandomGenerator <em>Random Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Random Generator</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.StochasticDiseaseModel#getRandomGenerator()
	 * @see #getStochasticDiseaseModel()
	 * @generated
	 */
	EAttribute getStochasticDiseaseModel_RandomGenerator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.standard.StandardStochasticDiseaseModel <em>Stochastic Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stochastic Disease Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.StandardStochasticDiseaseModel
	 * @generated
	 */
	EClass getStandardStochasticDiseaseModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.StandardStochasticDiseaseModel#getGain <em>Gain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gain</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.StandardStochasticDiseaseModel#getGain()
	 * @see #getStandardStochasticDiseaseModel()
	 * @generated
	 */
	EAttribute getStandardStochasticDiseaseModel_Gain();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.standard.SIRInoculator <em>SIR Inoculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SIR Inoculator</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.SIRInoculator
	 * @generated
	 */
	EClass getSIRInoculator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.SIRInoculator#getInoculatedPercentage <em>Inoculated Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inoculated Percentage</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.SIRInoculator#getInoculatedPercentage()
	 * @see #getSIRInoculator()
	 * @generated
	 */
	EAttribute getSIRInoculator_InoculatedPercentage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.SIRInoculator#isInoculatePercentage <em>Inoculate Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inoculate Percentage</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.SIRInoculator#isInoculatePercentage()
	 * @see #getSIRInoculator()
	 * @generated
	 */
	EAttribute getSIRInoculator_InoculatePercentage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.standard.StochasticPoissonSIDiseaseModel <em>Stochastic Poisson SI Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stochastic Poisson SI Disease Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.StochasticPoissonSIDiseaseModel
	 * @generated
	 */
	EClass getStochasticPoissonSIDiseaseModel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.standard.StochasticPoissonSIRDiseaseModel <em>Stochastic Poisson SIR Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stochastic Poisson SIR Disease Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.StochasticPoissonSIRDiseaseModel
	 * @generated
	 */
	EClass getStochasticPoissonSIRDiseaseModel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.standard.StochasticPoissonSEIRDiseaseModel <em>Stochastic Poisson SEIR Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stochastic Poisson SEIR Disease Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.StochasticPoissonSEIRDiseaseModel
	 * @generated
	 */
	EClass getStochasticPoissonSEIRDiseaseModel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.standard.InfectorInoculatorCollection <em>Infector Inoculator Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infector Inoculator Collection</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.InfectorInoculatorCollection
	 * @generated
	 */
	EClass getInfectorInoculatorCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.stem.diseasemodels.standard.InfectorInoculatorCollection#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.InfectorInoculatorCollection#getList()
	 * @see #getInfectorInoculatorCollection()
	 * @generated
	 */
	EReference getInfectorInoculatorCollection_List();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.InfectorInoculatorCollection#getImportFolder <em>Import Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import Folder</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.InfectorInoculatorCollection#getImportFolder()
	 * @see #getInfectorInoculatorCollection()
	 * @generated
	 */
	EAttribute getInfectorInoculatorCollection_ImportFolder();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseInitializer <em>Disease Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disease Initializer</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.StandardDiseaseInitializer
	 * @generated
	 */
	EClass getStandardDiseaseInitializer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseInitializer#getTargetISOKey <em>Target ISO Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target ISO Key</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.StandardDiseaseInitializer#getTargetISOKey()
	 * @see #getStandardDiseaseInitializer()
	 * @generated
	 */
	EAttribute getStandardDiseaseInitializer_TargetISOKey();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseInitializer#getTargetURI <em>Target URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target URI</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.StandardDiseaseInitializer#getTargetURI()
	 * @see #getStandardDiseaseInitializer()
	 * @generated
	 */
	EAttribute getStandardDiseaseInitializer_TargetURI();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseInitializer#getCompartments <em>Compartments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Compartments</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.StandardDiseaseInitializer#getCompartments()
	 * @see #getStandardDiseaseInitializer()
	 * @generated
	 */
	EAttribute getStandardDiseaseInitializer_Compartments();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseInitializer#getCompartmentValues <em>Compartment Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Compartment Values</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.StandardDiseaseInitializer#getCompartmentValues()
	 * @see #getStandardDiseaseInitializer()
	 * @generated
	 */
	EAttribute getStandardDiseaseInitializer_CompartmentValues();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseInitializer#isUseFractions <em>Use Fractions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Fractions</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.StandardDiseaseInitializer#isUseFractions()
	 * @see #getStandardDiseaseInitializer()
	 * @generated
	 */
	EAttribute getStandardDiseaseInitializer_UseFractions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.standard.DiseaseInitializer <em>Disease Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disease Initializer</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.DiseaseInitializer
	 * @generated
	 */
	EClass getDiseaseInitializer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.DiseaseInitializer#getDiseaseName <em>Disease Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disease Name</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.DiseaseInitializer#getDiseaseName()
	 * @see #getDiseaseInitializer()
	 * @generated
	 */
	EAttribute getDiseaseInitializer_DiseaseName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.DiseaseInitializer#getPopulationIdentifier <em>Population Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Population Identifier</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.DiseaseInitializer#getPopulationIdentifier()
	 * @see #getDiseaseInitializer()
	 * @generated
	 */
	EAttribute getDiseaseInitializer_PopulationIdentifier();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.standard.ExternalDataSourceDiseaseInitializer <em>External Data Source Disease Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Data Source Disease Initializer</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.ExternalDataSourceDiseaseInitializer
	 * @generated
	 */
	EClass getExternalDataSourceDiseaseInitializer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.ExternalDataSourceDiseaseInitializer#getDataPath <em>Data Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Path</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.ExternalDataSourceDiseaseInitializer#getDataPath()
	 * @see #getExternalDataSourceDiseaseInitializer()
	 * @generated
	 */
	EAttribute getExternalDataSourceDiseaseInitializer_DataPath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.ExternalDataSourceDiseaseInitializer#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.ExternalDataSourceDiseaseInitializer#getRow()
	 * @see #getExternalDataSourceDiseaseInitializer()
	 * @generated
	 */
	EAttribute getExternalDataSourceDiseaseInitializer_Row();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.standard.ExternalDataSourceDiseaseInitializer#isDoRescaling <em>Do Rescaling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Do Rescaling</em>'.
	 * @see org.eclipse.stem.diseasemodels.standard.ExternalDataSourceDiseaseInitializer#isDoRescaling()
	 * @see #getExternalDataSourceDiseaseInitializer()
	 * @generated
	 */
	EAttribute getExternalDataSourceDiseaseInitializer_DoRescaling();

	/**
	 * Returns the meta object for data type '{@link java.util.Random <em>Random</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Random</em>'.
	 * @see java.util.Random
	 * @model instanceClass="java.util.Random"
	 * @generated
	 */
	EDataType getRandom();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StandardFactory getStandardFactory();

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
	interface Literals  {
		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.standard.impl.DeterministicSEIRDiseaseModelImpl <em>Deterministic SEIR Disease Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.standard.impl.DeterministicSEIRDiseaseModelImpl
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getDeterministicSEIRDiseaseModel()
		 * @generated
		 */
		EClass DETERMINISTIC_SEIR_DISEASE_MODEL = eINSTANCE.getDeterministicSEIRDiseaseModel();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.standard.impl.DeterministicSIDiseaseModelImpl <em>Deterministic SI Disease Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.standard.impl.DeterministicSIDiseaseModelImpl
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getDeterministicSIDiseaseModel()
		 * @generated
		 */
		EClass DETERMINISTIC_SI_DISEASE_MODEL = eINSTANCE.getDeterministicSIDiseaseModel();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.standard.impl.DeterministicSIRDiseaseModelImpl <em>Deterministic SIR Disease Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.standard.impl.DeterministicSIRDiseaseModelImpl
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getDeterministicSIRDiseaseModel()
		 * @generated
		 */
		EClass DETERMINISTIC_SIR_DISEASE_MODEL = eINSTANCE.getDeterministicSIRDiseaseModel();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.standard.impl.DiseaseModelImpl <em>Disease Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.standard.impl.DiseaseModelImpl
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getDiseaseModel()
		 * @generated
		 */
		EClass DISEASE_MODEL = eINSTANCE.getDiseaseModel();

		/**
		 * The meta object literal for the '<em><b>Population Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISEASE_MODEL__POPULATION_IDENTIFIER = eINSTANCE.getDiseaseModel_PopulationIdentifier();

		/**
		 * The meta object literal for the '<em><b>Time Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISEASE_MODEL__TIME_PERIOD = eINSTANCE.getDiseaseModel_TimePeriod();

		/**
		 * The meta object literal for the '<em><b>Disease Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISEASE_MODEL__DISEASE_NAME = eINSTANCE.getDiseaseModel_DiseaseName();

		/**
		 * The meta object literal for the '<em><b>Finite Difference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISEASE_MODEL__FINITE_DIFFERENCE = eINSTANCE.getDiseaseModel_FiniteDifference();

		/**
		 * The meta object literal for the '<em><b>Frequency Dependent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISEASE_MODEL__FREQUENCY_DEPENDENT = eINSTANCE.getDiseaseModel_FrequencyDependent();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.standard.impl.DiseaseModelLabelImpl <em>Disease Model Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.standard.impl.DiseaseModelLabelImpl
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getDiseaseModelLabel()
		 * @generated
		 */
		EClass DISEASE_MODEL_LABEL = eINSTANCE.getDiseaseModelLabel();

		/**
		 * The meta object literal for the '<em><b>Population Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISEASE_MODEL_LABEL__POPULATION_LABEL = eINSTANCE.getDiseaseModelLabel_PopulationLabel();

		/**
		 * The meta object literal for the '<em><b>Population Model Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISEASE_MODEL_LABEL__POPULATION_MODEL_LABEL = eINSTANCE.getDiseaseModelLabel_PopulationModelLabel();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.standard.impl.DiseaseModelLabelValueImpl <em>Disease Model Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.standard.impl.DiseaseModelLabelValueImpl
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getDiseaseModelLabelValue()
		 * @generated
		 */
		EClass DISEASE_MODEL_LABEL_VALUE = eINSTANCE.getDiseaseModelLabelValue();

		/**
		 * The meta object literal for the '<em><b>Population Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISEASE_MODEL_LABEL_VALUE__POPULATION_COUNT = eINSTANCE.getDiseaseModelLabelValue_PopulationCount();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.standard.impl.InfectorImpl <em>Infector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.standard.impl.InfectorImpl
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getInfector()
		 * @generated
		 */
		EClass INFECTOR = eINSTANCE.getInfector();

		/**
		 * The meta object literal for the '<em><b>Disease Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFECTOR__DISEASE_MODEL = eINSTANCE.getInfector_DiseaseModel();

		/**
		 * The meta object literal for the '<em><b>Target URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFECTOR__TARGET_URI = eINSTANCE.getInfector_TargetURI();

		/**
		 * The meta object literal for the '<em><b>Disease Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFECTOR__DISEASE_NAME = eINSTANCE.getInfector_DiseaseName();

		/**
		 * The meta object literal for the '<em><b>Target ISO Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFECTOR__TARGET_ISO_KEY = eINSTANCE.getInfector_TargetISOKey();

		/**
		 * The meta object literal for the '<em><b>Labels To Infect</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFECTOR__LABELS_TO_INFECT = eINSTANCE.getInfector_LabelsToInfect();

		/**
		 * The meta object literal for the '<em><b>Population Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFECTOR__POPULATION_IDENTIFIER = eINSTANCE.getInfector_PopulationIdentifier();

		/**
		 * The meta object literal for the '<em><b>Infect Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFECTOR__INFECT_PERCENTAGE = eINSTANCE.getInfector_InfectPercentage();

		/**
		 * The meta object literal for the '<em><b>Target Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFECTOR__TARGET_FEATURE = eINSTANCE.getInfector_TargetFeature();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.standard.impl.SEIRImpl <em>SEIR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.standard.impl.SEIRImpl
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getSEIR()
		 * @generated
		 */
		EClass SEIR = eINSTANCE.getSEIR();

		/**
		 * The meta object literal for the '<em><b>Incubation Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEIR__INCUBATION_RATE = eINSTANCE.getSEIR_IncubationRate();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.standard.impl.SEIRLabelImpl <em>SEIR Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.standard.impl.SEIRLabelImpl
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getSEIRLabel()
		 * @generated
		 */
		EClass SEIR_LABEL = eINSTANCE.getSEIRLabel();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.standard.impl.SEIRLabelValueImpl <em>SEIR Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.standard.impl.SEIRLabelValueImpl
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getSEIRLabelValue()
		 * @generated
		 */
		EClass SEIR_LABEL_VALUE = eINSTANCE.getSEIRLabelValue();

		/**
		 * The meta object literal for the '<em><b>E</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEIR_LABEL_VALUE__E = eINSTANCE.getSEIRLabelValue_E();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.standard.impl.SIImpl <em>SI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.standard.impl.SIImpl
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getSI()
		 * @generated
		 */
		EClass SI = eINSTANCE.getSI();

		/**
		 * The meta object literal for the '<em><b>Transmission Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SI__TRANSMISSION_RATE = eINSTANCE.getSI_TransmissionRate();

		/**
		 * The meta object literal for the '<em><b>Non Linearity Coefficient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SI__NON_LINEARITY_COEFFICIENT = eINSTANCE.getSI_NonLinearityCoefficient();

		/**
		 * The meta object literal for the '<em><b>Recovery Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SI__RECOVERY_RATE = eINSTANCE.getSI_RecoveryRate();

		/**
		 * The meta object literal for the '<em><b>Infectious Mortality Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SI__INFECTIOUS_MORTALITY_RATE = eINSTANCE.getSI_InfectiousMortalityRate();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.standard.impl.SIInfectorImpl <em>SI Infector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.standard.impl.SIInfectorImpl
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getSIInfector()
		 * @generated
		 */
		EClass SI_INFECTOR = eINSTANCE.getSIInfector();

		/**
		 * The meta object literal for the '<em><b>Infectious Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SI_INFECTOR__INFECTIOUS_COUNT = eINSTANCE.getSIInfector_InfectiousCount();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.standard.impl.SILabelImpl <em>SI Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.standard.impl.SILabelImpl
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getSILabel()
		 * @generated
		 */
		EClass SI_LABEL = eINSTANCE.getSILabel();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.standard.impl.SILabelValueImpl <em>SI Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.standard.impl.SILabelValueImpl
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getSILabelValue()
		 * @generated
		 */
		EClass SI_LABEL_VALUE = eINSTANCE.getSILabelValue();

		/**
		 * The meta object literal for the '<em><b>I</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SI_LABEL_VALUE__I = eINSTANCE.getSILabelValue_I();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.standard.impl.SIRImpl <em>SIR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.standard.impl.SIRImpl
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getSIR()
		 * @generated
		 */
		EClass SIR = eINSTANCE.getSIR();

		/**
		 * The meta object literal for the '<em><b>Immunity Loss Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIR__IMMUNITY_LOSS_RATE = eINSTANCE.getSIR_ImmunityLossRate();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.standard.impl.SIRLabelImpl <em>SIR Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.standard.impl.SIRLabelImpl
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getSIRLabel()
		 * @generated
		 */
		EClass SIR_LABEL = eINSTANCE.getSIRLabel();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.standard.impl.SIRLabelValueImpl <em>SIR Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.standard.impl.SIRLabelValueImpl
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getSIRLabelValue()
		 * @generated
		 */
		EClass SIR_LABEL_VALUE = eINSTANCE.getSIRLabelValue();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIR_LABEL_VALUE__R = eINSTANCE.getSIRLabelValue_R();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelImpl <em>Disease Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelImpl
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getStandardDiseaseModel()
		 * @generated
		 */
		EClass STANDARD_DISEASE_MODEL = eINSTANCE.getStandardDiseaseModel();

		/**
		 * The meta object literal for the '<em><b>Reference Population Density</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY = eINSTANCE.getStandardDiseaseModel_ReferencePopulationDensity();

		/**
		 * The meta object literal for the '<em><b>Road Network Infectious Proportion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = eINSTANCE.getStandardDiseaseModel_RoadNetworkInfectiousProportion();

		/**
		 * The meta object literal for the '<em><b>Characteristic Mixing Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE = eINSTANCE.getStandardDiseaseModel_CharacteristicMixingDistance();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelLabelImpl <em>Disease Model Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelLabelImpl
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getStandardDiseaseModelLabel()
		 * @generated
		 */
		EClass STANDARD_DISEASE_MODEL_LABEL = eINSTANCE.getStandardDiseaseModelLabel();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelLabelValueImpl <em>Disease Model Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelLabelValueImpl
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getStandardDiseaseModelLabelValue()
		 * @generated
		 */
		EClass STANDARD_DISEASE_MODEL_LABEL_VALUE = eINSTANCE.getStandardDiseaseModelLabelValue();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_DISEASE_MODEL_LABEL_VALUE__S = eINSTANCE.getStandardDiseaseModelLabelValue_S();

		/**
		 * The meta object literal for the '<em><b>Incidence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_DISEASE_MODEL_LABEL_VALUE__INCIDENCE = eINSTANCE.getStandardDiseaseModelLabelValue_Incidence();

		/**
		 * The meta object literal for the '<em><b>Disease Deaths</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_DISEASE_MODEL_LABEL_VALUE__DISEASE_DEATHS = eINSTANCE.getStandardDiseaseModelLabelValue_DiseaseDeaths();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.standard.impl.StandardInfectorImpl <em>Infector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardInfectorImpl
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getStandardInfector()
		 * @generated
		 */
		EClass STANDARD_INFECTOR = eINSTANCE.getStandardInfector();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.standard.impl.StochasticSEIRDiseaseModelImpl <em>Stochastic SEIR Disease Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StochasticSEIRDiseaseModelImpl
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getStochasticSEIRDiseaseModel()
		 * @generated
		 */
		EClass STOCHASTIC_SEIR_DISEASE_MODEL = eINSTANCE.getStochasticSEIRDiseaseModel();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.standard.impl.StochasticSIDiseaseModelImpl <em>Stochastic SI Disease Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StochasticSIDiseaseModelImpl
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getStochasticSIDiseaseModel()
		 * @generated
		 */
		EClass STOCHASTIC_SI_DISEASE_MODEL = eINSTANCE.getStochasticSIDiseaseModel();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.standard.impl.StochasticSIRDiseaseModelImpl <em>Stochastic SIR Disease Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StochasticSIRDiseaseModelImpl
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getStochasticSIRDiseaseModel()
		 * @generated
		 */
		EClass STOCHASTIC_SIR_DISEASE_MODEL = eINSTANCE.getStochasticSIRDiseaseModel();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.standard.impl.StochasticDiseaseModelImpl <em>Stochastic Disease Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StochasticDiseaseModelImpl
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getStochasticDiseaseModel()
		 * @generated
		 */
		EClass STOCHASTIC_DISEASE_MODEL = eINSTANCE.getStochasticDiseaseModel();

		/**
		 * The meta object literal for the '<em><b>Seed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOCHASTIC_DISEASE_MODEL__SEED = eINSTANCE.getStochasticDiseaseModel_Seed();

		/**
		 * The meta object literal for the '<em><b>Random Generator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOCHASTIC_DISEASE_MODEL__RANDOM_GENERATOR = eINSTANCE.getStochasticDiseaseModel_RandomGenerator();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.standard.impl.StandardStochasticDiseaseModelImpl <em>Stochastic Disease Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardStochasticDiseaseModelImpl
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getStandardStochasticDiseaseModel()
		 * @generated
		 */
		EClass STANDARD_STOCHASTIC_DISEASE_MODEL = eINSTANCE.getStandardStochasticDiseaseModel();

		/**
		 * The meta object literal for the '<em><b>Gain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_STOCHASTIC_DISEASE_MODEL__GAIN = eINSTANCE.getStandardStochasticDiseaseModel_Gain();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.standard.impl.SIRInoculatorImpl <em>SIR Inoculator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.standard.impl.SIRInoculatorImpl
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getSIRInoculator()
		 * @generated
		 */
		EClass SIR_INOCULATOR = eINSTANCE.getSIRInoculator();

		/**
		 * The meta object literal for the '<em><b>Inoculated Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIR_INOCULATOR__INOCULATED_PERCENTAGE = eINSTANCE.getSIRInoculator_InoculatedPercentage();

		/**
		 * The meta object literal for the '<em><b>Inoculate Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIR_INOCULATOR__INOCULATE_PERCENTAGE = eINSTANCE.getSIRInoculator_InoculatePercentage();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.standard.impl.StochasticPoissonSIDiseaseModelImpl <em>Stochastic Poisson SI Disease Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StochasticPoissonSIDiseaseModelImpl
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getStochasticPoissonSIDiseaseModel()
		 * @generated
		 */
		EClass STOCHASTIC_POISSON_SI_DISEASE_MODEL = eINSTANCE.getStochasticPoissonSIDiseaseModel();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.standard.impl.StochasticPoissonSIRDiseaseModelImpl <em>Stochastic Poisson SIR Disease Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StochasticPoissonSIRDiseaseModelImpl
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getStochasticPoissonSIRDiseaseModel()
		 * @generated
		 */
		EClass STOCHASTIC_POISSON_SIR_DISEASE_MODEL = eINSTANCE.getStochasticPoissonSIRDiseaseModel();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.standard.impl.StochasticPoissonSEIRDiseaseModelImpl <em>Stochastic Poisson SEIR Disease Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StochasticPoissonSEIRDiseaseModelImpl
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getStochasticPoissonSEIRDiseaseModel()
		 * @generated
		 */
		EClass STOCHASTIC_POISSON_SEIR_DISEASE_MODEL = eINSTANCE.getStochasticPoissonSEIRDiseaseModel();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.standard.impl.InfectorInoculatorCollectionImpl <em>Infector Inoculator Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.standard.impl.InfectorInoculatorCollectionImpl
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getInfectorInoculatorCollection()
		 * @generated
		 */
		EClass INFECTOR_INOCULATOR_COLLECTION = eINSTANCE.getInfectorInoculatorCollection();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFECTOR_INOCULATOR_COLLECTION__LIST = eINSTANCE.getInfectorInoculatorCollection_List();

		/**
		 * The meta object literal for the '<em><b>Import Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFECTOR_INOCULATOR_COLLECTION__IMPORT_FOLDER = eINSTANCE.getInfectorInoculatorCollection_ImportFolder();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseInitializerImpl <em>Disease Initializer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseInitializerImpl
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getStandardDiseaseInitializer()
		 * @generated
		 */
		EClass STANDARD_DISEASE_INITIALIZER = eINSTANCE.getStandardDiseaseInitializer();

		/**
		 * The meta object literal for the '<em><b>Target ISO Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_DISEASE_INITIALIZER__TARGET_ISO_KEY = eINSTANCE.getStandardDiseaseInitializer_TargetISOKey();

		/**
		 * The meta object literal for the '<em><b>Target URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_DISEASE_INITIALIZER__TARGET_URI = eINSTANCE.getStandardDiseaseInitializer_TargetURI();

		/**
		 * The meta object literal for the '<em><b>Compartments</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_DISEASE_INITIALIZER__COMPARTMENTS = eINSTANCE.getStandardDiseaseInitializer_Compartments();

		/**
		 * The meta object literal for the '<em><b>Compartment Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_DISEASE_INITIALIZER__COMPARTMENT_VALUES = eINSTANCE.getStandardDiseaseInitializer_CompartmentValues();

		/**
		 * The meta object literal for the '<em><b>Use Fractions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_DISEASE_INITIALIZER__USE_FRACTIONS = eINSTANCE.getStandardDiseaseInitializer_UseFractions();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.standard.impl.DiseaseInitializerImpl <em>Disease Initializer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.standard.impl.DiseaseInitializerImpl
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getDiseaseInitializer()
		 * @generated
		 */
		EClass DISEASE_INITIALIZER = eINSTANCE.getDiseaseInitializer();

		/**
		 * The meta object literal for the '<em><b>Disease Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISEASE_INITIALIZER__DISEASE_NAME = eINSTANCE.getDiseaseInitializer_DiseaseName();

		/**
		 * The meta object literal for the '<em><b>Population Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISEASE_INITIALIZER__POPULATION_IDENTIFIER = eINSTANCE.getDiseaseInitializer_PopulationIdentifier();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.standard.impl.ExternalDataSourceDiseaseInitializerImpl <em>External Data Source Disease Initializer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.standard.impl.ExternalDataSourceDiseaseInitializerImpl
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getExternalDataSourceDiseaseInitializer()
		 * @generated
		 */
		EClass EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER = eINSTANCE.getExternalDataSourceDiseaseInitializer();

		/**
		 * The meta object literal for the '<em><b>Data Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER__DATA_PATH = eINSTANCE.getExternalDataSourceDiseaseInitializer_DataPath();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER__ROW = eINSTANCE.getExternalDataSourceDiseaseInitializer_Row();

		/**
		 * The meta object literal for the '<em><b>Do Rescaling</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER__DO_RESCALING = eINSTANCE.getExternalDataSourceDiseaseInitializer_DoRescaling();

		/**
		 * The meta object literal for the '<em>Random</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Random
		 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardPackageImpl#getRandom()
		 * @generated
		 */
		EDataType RANDOM = eINSTANCE.getRandom();

	}

} //StandardPackage
