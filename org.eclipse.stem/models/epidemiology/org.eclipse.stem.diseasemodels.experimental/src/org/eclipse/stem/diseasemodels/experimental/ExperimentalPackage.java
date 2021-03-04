package org.eclipse.stem.diseasemodels.experimental;

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
 * @see org.eclipse.stem.diseasemodels.experimental.ExperimentalFactory
 * @model kind="package"
 * @generated
 */
public interface ExperimentalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "experimental";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/stem/diseasemodels/experimental.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.stem.diseasemodels.experimental";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExperimentalPackage eINSTANCE = org.eclipse.stem.diseasemodels.experimental.impl.ExperimentalPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.experimental.impl.PercolationDiseaseModelImpl <em>Percolation Disease Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.experimental.impl.PercolationDiseaseModelImpl
	 * @see org.eclipse.stem.diseasemodels.experimental.impl.ExperimentalPackageImpl#getPercolationDiseaseModel()
	 * @generated
	 */
	int PERCOLATION_DISEASE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCOLATION_DISEASE_MODEL__URI = StandardPackage.SEIR__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCOLATION_DISEASE_MODEL__TYPE_URI = StandardPackage.SEIR__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCOLATION_DISEASE_MODEL__DUBLIN_CORE = StandardPackage.SEIR__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCOLATION_DISEASE_MODEL__LABELS_TO_UPDATE = StandardPackage.SEIR__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCOLATION_DISEASE_MODEL__GRAPH = StandardPackage.SEIR__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCOLATION_DISEASE_MODEL__ENABLED = StandardPackage.SEIR__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCOLATION_DISEASE_MODEL__GRAPH_DECORATED = StandardPackage.SEIR__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCOLATION_DISEASE_MODEL__PROGRESS = StandardPackage.SEIR__PROGRESS;

	
	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCOLATION_DISEASE_MODEL__ADD_STOCHASTIC_NOISE = StandardPackage.SEIR__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCOLATION_DISEASE_MODEL__RANDOM_SEED = StandardPackage.SEIR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCOLATION_DISEASE_MODEL__BINOMIAL_DISTRIBUTION = StandardPackage.SEIR__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCOLATION_DISEASE_MODEL__POPULATION_IDENTIFIER = StandardPackage.SEIR__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCOLATION_DISEASE_MODEL__TIME_PERIOD = StandardPackage.SEIR__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCOLATION_DISEASE_MODEL__DISEASE_NAME = StandardPackage.SEIR__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCOLATION_DISEASE_MODEL__FINITE_DIFFERENCE = StandardPackage.SEIR__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCOLATION_DISEASE_MODEL__FREQUENCY_DEPENDENT = StandardPackage.SEIR__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCOLATION_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY = StandardPackage.SEIR__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCOLATION_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = StandardPackage.SEIR__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCOLATION_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE = StandardPackage.SEIR__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCOLATION_DISEASE_MODEL__TRANSMISSION_RATE = StandardPackage.SEIR__TRANSMISSION_RATE;

	/**
	 * The feature id for the '<em><b>Non Linearity Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCOLATION_DISEASE_MODEL__NON_LINEARITY_COEFFICIENT = StandardPackage.SEIR__NON_LINEARITY_COEFFICIENT;

	/**
	 * The feature id for the '<em><b>Recovery Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCOLATION_DISEASE_MODEL__RECOVERY_RATE = StandardPackage.SEIR__RECOVERY_RATE;

	/**
	 * The feature id for the '<em><b>Infectious Mortality Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCOLATION_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE = StandardPackage.SEIR__INFECTIOUS_MORTALITY_RATE;

	/**
	 * The feature id for the '<em><b>Immunity Loss Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCOLATION_DISEASE_MODEL__IMMUNITY_LOSS_RATE = StandardPackage.SEIR__IMMUNITY_LOSS_RATE;

	/**
	 * The feature id for the '<em><b>Incubation Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCOLATION_DISEASE_MODEL__INCUBATION_RATE = StandardPackage.SEIR__INCUBATION_RATE;

	/**
	 * The number of structural features of the '<em>Percolation Disease Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCOLATION_DISEASE_MODEL_FEATURE_COUNT = StandardPackage.SEIR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.experimental.impl.TBDiseaseModelLabelImpl <em>TB Disease Model Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.experimental.impl.TBDiseaseModelLabelImpl
	 * @see org.eclipse.stem.diseasemodels.experimental.impl.ExperimentalPackageImpl#getTBDiseaseModelLabel()
	 * @generated
	 */
	int TB_DISEASE_MODEL_LABEL = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL_LABEL__URI = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL_LABEL__TYPE_URI = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL_LABEL__DUBLIN_CORE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>URI Of Identifiable To Be Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL_LABEL__CURRENT_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Identifiable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL_LABEL__IDENTIFIABLE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__IDENTIFIABLE;

	/**
	 * The feature id for the '<em><b>Next Value Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL_LABEL__NEXT_VALUE_VALID = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NEXT_VALUE_VALID;

	/**
	 * The feature id for the '<em><b>Next Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL_LABEL__NEXT_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NEXT_VALUE;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL_LABEL__DECORATOR = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DECORATOR;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL_LABEL__NODE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NODE;

	/**
	 * The feature id for the '<em><b>Delta Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL_LABEL__DELTA_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DELTA_VALUE;

	/**
	 * The feature id for the '<em><b>Temp Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL_LABEL__TEMP_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__TEMP_VALUE;

	/**
	 * The feature id for the '<em><b>Probe Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL_LABEL__PROBE_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__PROBE_VALUE;

	/**
	 * The feature id for the '<em><b>Error Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL_LABEL__ERROR_SCALE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__ERROR_SCALE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL_LABEL__IDENTIFIER = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Population Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL_LABEL__POPULATION_LABEL = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__POPULATION_LABEL;

	/**
	 * The feature id for the '<em><b>Population Model Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL_LABEL__POPULATION_MODEL_LABEL = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__POPULATION_MODEL_LABEL;

	/**
	 * The number of structural features of the '<em>TB Disease Model Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL_LABEL_FEATURE_COUNT = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.experimental.impl.TBDiseaseModelLabelValueImpl <em>TB Disease Model Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.experimental.impl.TBDiseaseModelLabelValueImpl
	 * @see org.eclipse.stem.diseasemodels.experimental.impl.ExperimentalPackageImpl#getTBDiseaseModelLabelValue()
	 * @generated
	 */
	int TB_DISEASE_MODEL_LABEL_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Arrivals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL_LABEL_VALUE__ARRIVALS = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__ARRIVALS;

	/**
	 * The feature id for the '<em><b>Departures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL_LABEL_VALUE__DEPARTURES = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__DEPARTURES;

	/**
	 * The feature id for the '<em><b>Population Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL_LABEL_VALUE__POPULATION_COUNT = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__POPULATION_COUNT;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL_LABEL_VALUE__S = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__S;

	/**
	 * The feature id for the '<em><b>Incidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL_LABEL_VALUE__INCIDENCE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__INCIDENCE;

	/**
	 * The feature id for the '<em><b>Disease Deaths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL_LABEL_VALUE__DISEASE_DEATHS = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__DISEASE_DEATHS;

	/**
	 * The feature id for the '<em><b>Il</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL_LABEL_VALUE__IL = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL_LABEL_VALUE__IA = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TB Disease Model Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.experimental.impl.TBDiseaseModelImpl <em>TB Disease Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.experimental.impl.TBDiseaseModelImpl
	 * @see org.eclipse.stem.diseasemodels.experimental.impl.ExperimentalPackageImpl#getTBDiseaseModel()
	 * @generated
	 */
	int TB_DISEASE_MODEL = 3;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL__URI = StandardPackage.STANDARD_DISEASE_MODEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL__TYPE_URI = StandardPackage.STANDARD_DISEASE_MODEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL__DUBLIN_CORE = StandardPackage.STANDARD_DISEASE_MODEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL__LABELS_TO_UPDATE = StandardPackage.STANDARD_DISEASE_MODEL__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL__GRAPH = StandardPackage.STANDARD_DISEASE_MODEL__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL__ENABLED = StandardPackage.STANDARD_DISEASE_MODEL__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL__GRAPH_DECORATED = StandardPackage.STANDARD_DISEASE_MODEL__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL__PROGRESS = StandardPackage.STANDARD_DISEASE_MODEL__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL__ADD_STOCHASTIC_NOISE = StandardPackage.STANDARD_DISEASE_MODEL__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL__RANDOM_SEED = StandardPackage.STANDARD_DISEASE_MODEL__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL__BINOMIAL_DISTRIBUTION = StandardPackage.STANDARD_DISEASE_MODEL__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL__POPULATION_IDENTIFIER = StandardPackage.STANDARD_DISEASE_MODEL__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL__TIME_PERIOD = StandardPackage.STANDARD_DISEASE_MODEL__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL__DISEASE_NAME = StandardPackage.STANDARD_DISEASE_MODEL__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL__FINITE_DIFFERENCE = StandardPackage.STANDARD_DISEASE_MODEL__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL__FREQUENCY_DEPENDENT = StandardPackage.STANDARD_DISEASE_MODEL__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY = StandardPackage.STANDARD_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = StandardPackage.STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE = StandardPackage.STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL__TRANSMISSION_RATE = StandardPackage.STANDARD_DISEASE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Active Inf Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL__ACTIVE_INF_PROB = StandardPackage.STANDARD_DISEASE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TB Disease Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_DISEASE_MODEL_FEATURE_COUNT = StandardPackage.STANDARD_DISEASE_MODEL_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.experimental.PercolationDiseaseModel <em>Percolation Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Percolation Disease Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.experimental.PercolationDiseaseModel
	 * @generated
	 */
	EClass getPercolationDiseaseModel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.experimental.TBDiseaseModelLabel <em>TB Disease Model Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TB Disease Model Label</em>'.
	 * @see org.eclipse.stem.diseasemodels.experimental.TBDiseaseModelLabel
	 * @generated
	 */
	EClass getTBDiseaseModelLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.experimental.TBDiseaseModelLabelValue <em>TB Disease Model Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TB Disease Model Label Value</em>'.
	 * @see org.eclipse.stem.diseasemodels.experimental.TBDiseaseModelLabelValue
	 * @generated
	 */
	EClass getTBDiseaseModelLabelValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.experimental.TBDiseaseModelLabelValue#getIl <em>Il</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Il</em>'.
	 * @see org.eclipse.stem.diseasemodels.experimental.TBDiseaseModelLabelValue#getIl()
	 * @see #getTBDiseaseModelLabelValue()
	 * @generated
	 */
	EAttribute getTBDiseaseModelLabelValue_Il();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.experimental.TBDiseaseModelLabelValue#getIa <em>Ia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ia</em>'.
	 * @see org.eclipse.stem.diseasemodels.experimental.TBDiseaseModelLabelValue#getIa()
	 * @see #getTBDiseaseModelLabelValue()
	 * @generated
	 */
	EAttribute getTBDiseaseModelLabelValue_Ia();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.experimental.TBDiseaseModel <em>TB Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TB Disease Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.experimental.TBDiseaseModel
	 * @generated
	 */
	EClass getTBDiseaseModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.experimental.TBDiseaseModel#getTransmissionRate <em>Transmission Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transmission Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.experimental.TBDiseaseModel#getTransmissionRate()
	 * @see #getTBDiseaseModel()
	 * @generated
	 */
	EAttribute getTBDiseaseModel_TransmissionRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.experimental.TBDiseaseModel#getActiveInfProb <em>Active Inf Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Inf Prob</em>'.
	 * @see org.eclipse.stem.diseasemodels.experimental.TBDiseaseModel#getActiveInfProb()
	 * @see #getTBDiseaseModel()
	 * @generated
	 */
	EAttribute getTBDiseaseModel_ActiveInfProb();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExperimentalFactory getExperimentalFactory();

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
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.experimental.impl.PercolationDiseaseModelImpl <em>Percolation Disease Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.experimental.impl.PercolationDiseaseModelImpl
		 * @see org.eclipse.stem.diseasemodels.experimental.impl.ExperimentalPackageImpl#getPercolationDiseaseModel()
		 * @generated
		 */
		EClass PERCOLATION_DISEASE_MODEL = eINSTANCE.getPercolationDiseaseModel();
		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.experimental.impl.TBDiseaseModelLabelImpl <em>TB Disease Model Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.experimental.impl.TBDiseaseModelLabelImpl
		 * @see org.eclipse.stem.diseasemodels.experimental.impl.ExperimentalPackageImpl#getTBDiseaseModelLabel()
		 * @generated
		 */
		EClass TB_DISEASE_MODEL_LABEL = eINSTANCE.getTBDiseaseModelLabel();
		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.experimental.impl.TBDiseaseModelLabelValueImpl <em>TB Disease Model Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.experimental.impl.TBDiseaseModelLabelValueImpl
		 * @see org.eclipse.stem.diseasemodels.experimental.impl.ExperimentalPackageImpl#getTBDiseaseModelLabelValue()
		 * @generated
		 */
		EClass TB_DISEASE_MODEL_LABEL_VALUE = eINSTANCE.getTBDiseaseModelLabelValue();
		/**
		 * The meta object literal for the '<em><b>Il</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TB_DISEASE_MODEL_LABEL_VALUE__IL = eINSTANCE.getTBDiseaseModelLabelValue_Il();
		/**
		 * The meta object literal for the '<em><b>Ia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TB_DISEASE_MODEL_LABEL_VALUE__IA = eINSTANCE.getTBDiseaseModelLabelValue_Ia();
		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.experimental.impl.TBDiseaseModelImpl <em>TB Disease Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.experimental.impl.TBDiseaseModelImpl
		 * @see org.eclipse.stem.diseasemodels.experimental.impl.ExperimentalPackageImpl#getTBDiseaseModel()
		 * @generated
		 */
		EClass TB_DISEASE_MODEL = eINSTANCE.getTBDiseaseModel();
		/**
		 * The meta object literal for the '<em><b>Transmission Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TB_DISEASE_MODEL__TRANSMISSION_RATE = eINSTANCE.getTBDiseaseModel_TransmissionRate();
		/**
		 * The meta object literal for the '<em><b>Active Inf Prob</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TB_DISEASE_MODEL__ACTIVE_INF_PROB = eINSTANCE.getTBDiseaseModel_ActiveInfProb();

	}

} //ExperimentalPackage
