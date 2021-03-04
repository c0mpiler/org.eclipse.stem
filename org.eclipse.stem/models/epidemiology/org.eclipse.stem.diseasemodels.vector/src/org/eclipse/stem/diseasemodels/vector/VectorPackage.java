package org.eclipse.stem.diseasemodels.vector;

/******************************************************************************* 
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     IBM Corporation - initial API and implementation 
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
 * @see org.eclipse.stem.diseasemodels.vector.VectorFactory
 * @model kind="package"
 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
 * @generated
 */
public interface VectorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vector";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/stem/diseasemodels/vector.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.stem.diseasemodels.vector";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VectorPackage eINSTANCE = org.eclipse.stem.diseasemodels.vector.impl.VectorPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.vector.impl.VectorDiseaseModelImpl <em>Disease Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.vector.impl.VectorDiseaseModelImpl
	 * @see org.eclipse.stem.diseasemodels.vector.impl.VectorPackageImpl#getVectorDiseaseModel()
	 * @generated
	 */
	int VECTOR_DISEASE_MODEL = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_DISEASE_MODEL__URI = StandardPackage.STANDARD_DISEASE_MODEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_DISEASE_MODEL__TYPE_URI = StandardPackage.STANDARD_DISEASE_MODEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_DISEASE_MODEL__DUBLIN_CORE = StandardPackage.STANDARD_DISEASE_MODEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_DISEASE_MODEL__LABELS_TO_UPDATE = StandardPackage.STANDARD_DISEASE_MODEL__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_DISEASE_MODEL__GRAPH = StandardPackage.STANDARD_DISEASE_MODEL__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_DISEASE_MODEL__ENABLED = StandardPackage.STANDARD_DISEASE_MODEL__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_DISEASE_MODEL__GRAPH_DECORATED = StandardPackage.STANDARD_DISEASE_MODEL__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_DISEASE_MODEL__PROGRESS = StandardPackage.STANDARD_DISEASE_MODEL__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_DISEASE_MODEL__ADD_STOCHASTIC_NOISE = StandardPackage.STANDARD_DISEASE_MODEL__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_DISEASE_MODEL__RANDOM_SEED = StandardPackage.STANDARD_DISEASE_MODEL__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_DISEASE_MODEL__BINOMIAL_DISTRIBUTION = StandardPackage.STANDARD_DISEASE_MODEL__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_DISEASE_MODEL__POPULATION_IDENTIFIER = StandardPackage.STANDARD_DISEASE_MODEL__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_DISEASE_MODEL__TIME_PERIOD = StandardPackage.STANDARD_DISEASE_MODEL__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_DISEASE_MODEL__DISEASE_NAME = StandardPackage.STANDARD_DISEASE_MODEL__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_DISEASE_MODEL__FINITE_DIFFERENCE = StandardPackage.STANDARD_DISEASE_MODEL__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_DISEASE_MODEL__FREQUENCY_DEPENDENT = StandardPackage.STANDARD_DISEASE_MODEL__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY = StandardPackage.STANDARD_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = StandardPackage.STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE = StandardPackage.STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Vector Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_DISEASE_MODEL__VECTOR_POPULATION_IDENTIFIER = StandardPackage.STANDARD_DISEASE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Disease Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_DISEASE_MODEL_FEATURE_COUNT = StandardPackage.STANDARD_DISEASE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.vector.impl.MacdonaldRossDiseaseModelImpl <em>Macdonald Ross Disease Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.vector.impl.MacdonaldRossDiseaseModelImpl
	 * @see org.eclipse.stem.diseasemodels.vector.impl.VectorPackageImpl#getMacdonaldRossDiseaseModel()
	 * @generated
	 */
	int MACDONALD_ROSS_DISEASE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACDONALD_ROSS_DISEASE_MODEL__URI = VECTOR_DISEASE_MODEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACDONALD_ROSS_DISEASE_MODEL__TYPE_URI = VECTOR_DISEASE_MODEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACDONALD_ROSS_DISEASE_MODEL__DUBLIN_CORE = VECTOR_DISEASE_MODEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACDONALD_ROSS_DISEASE_MODEL__LABELS_TO_UPDATE = VECTOR_DISEASE_MODEL__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACDONALD_ROSS_DISEASE_MODEL__GRAPH = VECTOR_DISEASE_MODEL__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACDONALD_ROSS_DISEASE_MODEL__ENABLED = VECTOR_DISEASE_MODEL__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACDONALD_ROSS_DISEASE_MODEL__GRAPH_DECORATED = VECTOR_DISEASE_MODEL__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACDONALD_ROSS_DISEASE_MODEL__PROGRESS = VECTOR_DISEASE_MODEL__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACDONALD_ROSS_DISEASE_MODEL__ADD_STOCHASTIC_NOISE = VECTOR_DISEASE_MODEL__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACDONALD_ROSS_DISEASE_MODEL__RANDOM_SEED = VECTOR_DISEASE_MODEL__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACDONALD_ROSS_DISEASE_MODEL__BINOMIAL_DISTRIBUTION = VECTOR_DISEASE_MODEL__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACDONALD_ROSS_DISEASE_MODEL__POPULATION_IDENTIFIER = VECTOR_DISEASE_MODEL__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACDONALD_ROSS_DISEASE_MODEL__TIME_PERIOD = VECTOR_DISEASE_MODEL__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACDONALD_ROSS_DISEASE_MODEL__DISEASE_NAME = VECTOR_DISEASE_MODEL__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACDONALD_ROSS_DISEASE_MODEL__FINITE_DIFFERENCE = VECTOR_DISEASE_MODEL__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACDONALD_ROSS_DISEASE_MODEL__FREQUENCY_DEPENDENT = VECTOR_DISEASE_MODEL__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACDONALD_ROSS_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY = VECTOR_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACDONALD_ROSS_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = VECTOR_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACDONALD_ROSS_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE = VECTOR_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Vector Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACDONALD_ROSS_DISEASE_MODEL__VECTOR_POPULATION_IDENTIFIER = VECTOR_DISEASE_MODEL__VECTOR_POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Biting Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACDONALD_ROSS_DISEASE_MODEL__BITING_RATE = VECTOR_DISEASE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Infectious Biting Proportion Human</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACDONALD_ROSS_DISEASE_MODEL__INFECTIOUS_BITING_PROPORTION_HUMAN = VECTOR_DISEASE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Infectious Biting Proportion Vector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACDONALD_ROSS_DISEASE_MODEL__INFECTIOUS_BITING_PROPORTION_VECTOR = VECTOR_DISEASE_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Recovery Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACDONALD_ROSS_DISEASE_MODEL__RECOVERY_RATE = VECTOR_DISEASE_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Incubation Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACDONALD_ROSS_DISEASE_MODEL__INCUBATION_RATE = VECTOR_DISEASE_MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Vector Incubation Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACDONALD_ROSS_DISEASE_MODEL__VECTOR_INCUBATION_RATE = VECTOR_DISEASE_MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Immunity Loss Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACDONALD_ROSS_DISEASE_MODEL__IMMUNITY_LOSS_RATE = VECTOR_DISEASE_MODEL_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Macdonald Ross Disease Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACDONALD_ROSS_DISEASE_MODEL_FEATURE_COUNT = VECTOR_DISEASE_MODEL_FEATURE_COUNT + 7;


	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.vector.impl.AbstractDengueModelImpl <em>Abstract Dengue Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.vector.impl.AbstractDengueModelImpl
	 * @see org.eclipse.stem.diseasemodels.vector.impl.VectorPackageImpl#getAbstractDengueModel()
	 * @generated
	 */
	int ABSTRACT_DENGUE_MODEL = 9;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DENGUE_MODEL__URI = VECTOR_DISEASE_MODEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DENGUE_MODEL__TYPE_URI = VECTOR_DISEASE_MODEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DENGUE_MODEL__DUBLIN_CORE = VECTOR_DISEASE_MODEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DENGUE_MODEL__LABELS_TO_UPDATE = VECTOR_DISEASE_MODEL__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DENGUE_MODEL__GRAPH = VECTOR_DISEASE_MODEL__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DENGUE_MODEL__ENABLED = VECTOR_DISEASE_MODEL__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DENGUE_MODEL__GRAPH_DECORATED = VECTOR_DISEASE_MODEL__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DENGUE_MODEL__PROGRESS = VECTOR_DISEASE_MODEL__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DENGUE_MODEL__ADD_STOCHASTIC_NOISE = VECTOR_DISEASE_MODEL__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DENGUE_MODEL__RANDOM_SEED = VECTOR_DISEASE_MODEL__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DENGUE_MODEL__BINOMIAL_DISTRIBUTION = VECTOR_DISEASE_MODEL__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DENGUE_MODEL__POPULATION_IDENTIFIER = VECTOR_DISEASE_MODEL__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DENGUE_MODEL__TIME_PERIOD = VECTOR_DISEASE_MODEL__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DENGUE_MODEL__DISEASE_NAME = VECTOR_DISEASE_MODEL__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DENGUE_MODEL__FINITE_DIFFERENCE = VECTOR_DISEASE_MODEL__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DENGUE_MODEL__FREQUENCY_DEPENDENT = VECTOR_DISEASE_MODEL__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DENGUE_MODEL__REFERENCE_POPULATION_DENSITY = VECTOR_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DENGUE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = VECTOR_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DENGUE_MODEL__CHARACTERISTIC_MIXING_DISTANCE = VECTOR_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Vector Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DENGUE_MODEL__VECTOR_POPULATION_IDENTIFIER = VECTOR_DISEASE_MODEL__VECTOR_POPULATION_IDENTIFIER;

	/**
	 * The number of structural features of the '<em>Abstract Dengue Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DENGUE_MODEL_FEATURE_COUNT = VECTOR_DISEASE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl <em>Dengue Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl
	 * @see org.eclipse.stem.diseasemodels.vector.impl.VectorPackageImpl#getDengueModel()
	 * @generated
	 */
	int DENGUE_MODEL = 2;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__URI = ABSTRACT_DENGUE_MODEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__TYPE_URI = ABSTRACT_DENGUE_MODEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__DUBLIN_CORE = ABSTRACT_DENGUE_MODEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__LABELS_TO_UPDATE = ABSTRACT_DENGUE_MODEL__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__GRAPH = ABSTRACT_DENGUE_MODEL__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__ENABLED = ABSTRACT_DENGUE_MODEL__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__GRAPH_DECORATED = ABSTRACT_DENGUE_MODEL__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__PROGRESS = ABSTRACT_DENGUE_MODEL__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__ADD_STOCHASTIC_NOISE = ABSTRACT_DENGUE_MODEL__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__RANDOM_SEED = ABSTRACT_DENGUE_MODEL__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__BINOMIAL_DISTRIBUTION = ABSTRACT_DENGUE_MODEL__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__POPULATION_IDENTIFIER = ABSTRACT_DENGUE_MODEL__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__TIME_PERIOD = ABSTRACT_DENGUE_MODEL__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__DISEASE_NAME = ABSTRACT_DENGUE_MODEL__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__FINITE_DIFFERENCE = ABSTRACT_DENGUE_MODEL__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__FREQUENCY_DEPENDENT = ABSTRACT_DENGUE_MODEL__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__REFERENCE_POPULATION_DENSITY = ABSTRACT_DENGUE_MODEL__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = ABSTRACT_DENGUE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__CHARACTERISTIC_MIXING_DISTANCE = ABSTRACT_DENGUE_MODEL__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Vector Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__VECTOR_POPULATION_IDENTIFIER = ABSTRACT_DENGUE_MODEL__VECTOR_POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Biting Rate SV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__BITING_RATE_SV = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Biting Rate IV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__BITING_RATE_IV = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Host Infectivity1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_INFECTIVITY1 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Host Infectivity2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_INFECTIVITY2 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Host Infectivity3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_INFECTIVITY3 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Host Infectivity4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_INFECTIVITY4 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Host Primary Incubation Rate1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE1 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Host Primary Incubation Rate2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE2 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Host Primary Incubation Rate3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE3 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Host Primary Incubation Rate4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE4 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Host Primary Recovery Rate1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE1 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Host Primary Recovery Rate2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE2 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Host Primary Recovery Rate3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE3 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Host Primary Recovery Rate4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE4 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Host Primary Immunity Loss Rate1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE1 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Host Primary Immunity Loss Rate2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE2 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Host Primary Immunity Loss Rate3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE3 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Host Primary Immunity Loss Rate4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE4 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Host Primary Disease Death Rate1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE1 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Host Primary Disease Death Rate2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE2 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Host Primary Disease Death Rate3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE3 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Host Primary Disease Death Rate4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE4 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Host ADE12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_ADE12 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Host ADE13</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_ADE13 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Host ADE14</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_ADE14 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Host ADE21</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_ADE21 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Host ADE23</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_ADE23 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Host ADE24</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_ADE24 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Host ADE31</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_ADE31 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Host ADE32</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_ADE32 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Host ADE34</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_ADE34 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Host ADE41</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_ADE41 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Host ADE42</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_ADE42 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Host ADE43</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_ADE43 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Host Secondary Disease Death Rate12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE12 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Host Secondary Disease Death Rate13</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE13 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Host Secondary Disease Death Rate14</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE14 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Host Secondary Disease Death Rate21</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE21 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Host Secondary Disease Death Rate23</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE23 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Host Secondary Disease Death Rate24</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE24 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Host Secondary Disease Death Rate31</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE31 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Host Secondary Disease Death Rate32</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE32 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>Host Secondary Disease Death Rate34</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE34 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>Host Secondary Disease Death Rate41</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE41 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 43;

	/**
	 * The feature id for the '<em><b>Host Secondary Disease Death Rate42</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE42 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 44;

	/**
	 * The feature id for the '<em><b>Host Secondary Disease Death Rate43</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE43 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 45;

	/**
	 * The feature id for the '<em><b>Host Secondary Recovery Rate12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE12 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 46;

	/**
	 * The feature id for the '<em><b>Host Secondary Recovery Rate13</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE13 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 47;

	/**
	 * The feature id for the '<em><b>Host Secondary Recovery Rate14</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE14 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 48;

	/**
	 * The feature id for the '<em><b>Host Secondary Recovery Rate21</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE21 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 49;

	/**
	 * The feature id for the '<em><b>Host Secondary Recovery Rate23</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE23 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 50;

	/**
	 * The feature id for the '<em><b>Host Secondary Recovery Rate24</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE24 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 51;

	/**
	 * The feature id for the '<em><b>Host Secondary Recovery Rate31</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE31 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 52;

	/**
	 * The feature id for the '<em><b>Host Secondary Recovery Rate32</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE32 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 53;

	/**
	 * The feature id for the '<em><b>Host Secondary Recovery Rate34</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE34 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 54;

	/**
	 * The feature id for the '<em><b>Host Secondary Recovery Rate41</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE41 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 55;

	/**
	 * The feature id for the '<em><b>Host Secondary Recovery Rate42</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE42 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 56;

	/**
	 * The feature id for the '<em><b>Host Secondary Recovery Rate43</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE43 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 57;

	/**
	 * The feature id for the '<em><b>Host Secondary Incubation Rate12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE12 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 58;

	/**
	 * The feature id for the '<em><b>Host Secondary Incubation Rate13</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE13 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 59;

	/**
	 * The feature id for the '<em><b>Host Secondary Incubation Rate14</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE14 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 60;

	/**
	 * The feature id for the '<em><b>Host Secondary Incubation Rate21</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE21 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 61;

	/**
	 * The feature id for the '<em><b>Host Secondary Incubation Rate23</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE23 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 62;

	/**
	 * The feature id for the '<em><b>Host Secondary Incubation Rate24</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE24 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 63;

	/**
	 * The feature id for the '<em><b>Host Secondary Incubation Rate31</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE31 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 64;

	/**
	 * The feature id for the '<em><b>Host Secondary Incubation Rate32</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE32 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 65;

	/**
	 * The feature id for the '<em><b>Host Secondary Incubation Rate34</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE34 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 66;

	/**
	 * The feature id for the '<em><b>Host Secondary Incubation Rate41</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE41 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 67;

	/**
	 * The feature id for the '<em><b>Host Secondary Incubation Rate42</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE42 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 68;

	/**
	 * The feature id for the '<em><b>Host Secondary Incubation Rate43</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE43 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 69;

	/**
	 * The feature id for the '<em><b>Vector Infectivity1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__VECTOR_INFECTIVITY1 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 70;

	/**
	 * The feature id for the '<em><b>Vector Infectivity2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__VECTOR_INFECTIVITY2 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 71;

	/**
	 * The feature id for the '<em><b>Vector Infectivity3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__VECTOR_INFECTIVITY3 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 72;

	/**
	 * The feature id for the '<em><b>Vector Infectivity4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__VECTOR_INFECTIVITY4 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 73;

	/**
	 * The feature id for the '<em><b>Vector ADE1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__VECTOR_ADE1 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 74;

	/**
	 * The feature id for the '<em><b>Vector ADE2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__VECTOR_ADE2 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 75;

	/**
	 * The feature id for the '<em><b>Vector ADE3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__VECTOR_ADE3 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 76;

	/**
	 * The feature id for the '<em><b>Vector ADE4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__VECTOR_ADE4 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 77;

	/**
	 * The feature id for the '<em><b>Vector Incubation Rate1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__VECTOR_INCUBATION_RATE1 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 78;

	/**
	 * The feature id for the '<em><b>Vector Incubation Rate2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__VECTOR_INCUBATION_RATE2 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 79;

	/**
	 * The feature id for the '<em><b>Vector Incubation Rate3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__VECTOR_INCUBATION_RATE3 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 80;

	/**
	 * The feature id for the '<em><b>Vector Incubation Rate4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__VECTOR_INCUBATION_RATE4 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 81;

	/**
	 * The feature id for the '<em><b>Episilon1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__EPISILON1 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 82;

	/**
	 * The feature id for the '<em><b>Episilon2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__EPISILON2 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 83;

	/**
	 * The feature id for the '<em><b>Episilon3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__EPISILON3 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 84;

	/**
	 * The feature id for the '<em><b>Episilon4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL__EPISILON4 = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 85;

	/**
	 * The number of structural features of the '<em>Dengue Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_FEATURE_COUNT = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 86;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelImpl <em>Simple Dengue Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelImpl
	 * @see org.eclipse.stem.diseasemodels.vector.impl.VectorPackageImpl#getSimpleDengueModel()
	 * @generated
	 */
	int SIMPLE_DENGUE_MODEL = 3;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL__URI = ABSTRACT_DENGUE_MODEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL__TYPE_URI = ABSTRACT_DENGUE_MODEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL__DUBLIN_CORE = ABSTRACT_DENGUE_MODEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL__LABELS_TO_UPDATE = ABSTRACT_DENGUE_MODEL__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL__GRAPH = ABSTRACT_DENGUE_MODEL__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL__ENABLED = ABSTRACT_DENGUE_MODEL__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL__GRAPH_DECORATED = ABSTRACT_DENGUE_MODEL__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL__PROGRESS = ABSTRACT_DENGUE_MODEL__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL__ADD_STOCHASTIC_NOISE = ABSTRACT_DENGUE_MODEL__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL__RANDOM_SEED = ABSTRACT_DENGUE_MODEL__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL__BINOMIAL_DISTRIBUTION = ABSTRACT_DENGUE_MODEL__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL__POPULATION_IDENTIFIER = ABSTRACT_DENGUE_MODEL__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL__TIME_PERIOD = ABSTRACT_DENGUE_MODEL__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL__DISEASE_NAME = ABSTRACT_DENGUE_MODEL__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL__FINITE_DIFFERENCE = ABSTRACT_DENGUE_MODEL__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL__FREQUENCY_DEPENDENT = ABSTRACT_DENGUE_MODEL__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL__REFERENCE_POPULATION_DENSITY = ABSTRACT_DENGUE_MODEL__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = ABSTRACT_DENGUE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL__CHARACTERISTIC_MIXING_DISTANCE = ABSTRACT_DENGUE_MODEL__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Vector Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL__VECTOR_POPULATION_IDENTIFIER = ABSTRACT_DENGUE_MODEL__VECTOR_POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Host Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL__HOST_TRANSMISSION_RATE = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ade Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL__ADE_FACTOR = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Host Immunity Loss Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL__HOST_IMMUNITY_LOSS_RATE = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Host Primary Death Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL__HOST_PRIMARY_DEATH_RATE = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Host Recovery Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL__HOST_RECOVERY_RATE = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Host Secondary Death Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL__HOST_SECONDARY_DEATH_RATE = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Vector Incubation Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL__VECTOR_INCUBATION_RATE = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Vector Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL__VECTOR_TRANSMISSION_RATE = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Immunity Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL__IMMUNITY_STRENGTH = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Simple Dengue Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_FEATURE_COUNT = ABSTRACT_DENGUE_MODEL_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.vector.impl.VerySimpleDengueModelImpl <em>Very Simple Dengue Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.vector.impl.VerySimpleDengueModelImpl
	 * @see org.eclipse.stem.diseasemodels.vector.impl.VectorPackageImpl#getVerySimpleDengueModel()
	 * @generated
	 */
	int VERY_SIMPLE_DENGUE_MODEL = 4;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERY_SIMPLE_DENGUE_MODEL__URI = StandardPackage.STANDARD_DISEASE_MODEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERY_SIMPLE_DENGUE_MODEL__TYPE_URI = StandardPackage.STANDARD_DISEASE_MODEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERY_SIMPLE_DENGUE_MODEL__DUBLIN_CORE = StandardPackage.STANDARD_DISEASE_MODEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERY_SIMPLE_DENGUE_MODEL__LABELS_TO_UPDATE = StandardPackage.STANDARD_DISEASE_MODEL__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERY_SIMPLE_DENGUE_MODEL__GRAPH = StandardPackage.STANDARD_DISEASE_MODEL__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERY_SIMPLE_DENGUE_MODEL__ENABLED = StandardPackage.STANDARD_DISEASE_MODEL__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERY_SIMPLE_DENGUE_MODEL__GRAPH_DECORATED = StandardPackage.STANDARD_DISEASE_MODEL__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERY_SIMPLE_DENGUE_MODEL__PROGRESS = StandardPackage.STANDARD_DISEASE_MODEL__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERY_SIMPLE_DENGUE_MODEL__ADD_STOCHASTIC_NOISE = StandardPackage.STANDARD_DISEASE_MODEL__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERY_SIMPLE_DENGUE_MODEL__RANDOM_SEED = StandardPackage.STANDARD_DISEASE_MODEL__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERY_SIMPLE_DENGUE_MODEL__BINOMIAL_DISTRIBUTION = StandardPackage.STANDARD_DISEASE_MODEL__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERY_SIMPLE_DENGUE_MODEL__POPULATION_IDENTIFIER = StandardPackage.STANDARD_DISEASE_MODEL__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERY_SIMPLE_DENGUE_MODEL__TIME_PERIOD = StandardPackage.STANDARD_DISEASE_MODEL__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERY_SIMPLE_DENGUE_MODEL__DISEASE_NAME = StandardPackage.STANDARD_DISEASE_MODEL__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERY_SIMPLE_DENGUE_MODEL__FINITE_DIFFERENCE = StandardPackage.STANDARD_DISEASE_MODEL__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERY_SIMPLE_DENGUE_MODEL__FREQUENCY_DEPENDENT = StandardPackage.STANDARD_DISEASE_MODEL__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERY_SIMPLE_DENGUE_MODEL__REFERENCE_POPULATION_DENSITY = StandardPackage.STANDARD_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERY_SIMPLE_DENGUE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = StandardPackage.STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERY_SIMPLE_DENGUE_MODEL__CHARACTERISTIC_MIXING_DISTANCE = StandardPackage.STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERY_SIMPLE_DENGUE_MODEL__TRANSMISSION_RATE = StandardPackage.STANDARD_DISEASE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Recovery Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERY_SIMPLE_DENGUE_MODEL__RECOVERY_RATE = StandardPackage.STANDARD_DISEASE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Immunity Loss Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERY_SIMPLE_DENGUE_MODEL__IMMUNITY_LOSS_RATE = StandardPackage.STANDARD_DISEASE_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ade Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERY_SIMPLE_DENGUE_MODEL__ADE_FACTOR = StandardPackage.STANDARD_DISEASE_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Immunity Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERY_SIMPLE_DENGUE_MODEL__IMMUNITY_STRENGTH = StandardPackage.STANDARD_DISEASE_MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Primary Death Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERY_SIMPLE_DENGUE_MODEL__PRIMARY_DEATH_RATE = StandardPackage.STANDARD_DISEASE_MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Secondary Death Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERY_SIMPLE_DENGUE_MODEL__SECONDARY_DEATH_RATE = StandardPackage.STANDARD_DISEASE_MODEL_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Very Simple Dengue Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERY_SIMPLE_DENGUE_MODEL_FEATURE_COUNT = StandardPackage.STANDARD_DISEASE_MODEL_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelHostLabelImpl <em>Dengue Model Host Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.vector.impl.DengueModelHostLabelImpl
	 * @see org.eclipse.stem.diseasemodels.vector.impl.VectorPackageImpl#getDengueModelHostLabel()
	 * @generated
	 */
	int DENGUE_MODEL_HOST_LABEL = 5;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL__URI = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL__TYPE_URI = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL__DUBLIN_CORE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>URI Of Identifiable To Be Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL__CURRENT_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Identifiable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL__IDENTIFIABLE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__IDENTIFIABLE;

	/**
	 * The feature id for the '<em><b>Next Value Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL__NEXT_VALUE_VALID = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NEXT_VALUE_VALID;

	/**
	 * The feature id for the '<em><b>Next Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL__NEXT_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NEXT_VALUE;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL__DECORATOR = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DECORATOR;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL__NODE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NODE;

	/**
	 * The feature id for the '<em><b>Delta Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL__DELTA_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DELTA_VALUE;

	/**
	 * The feature id for the '<em><b>Temp Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL__TEMP_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__TEMP_VALUE;

	/**
	 * The feature id for the '<em><b>Probe Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL__PROBE_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__PROBE_VALUE;

	/**
	 * The feature id for the '<em><b>Error Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL__ERROR_SCALE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__ERROR_SCALE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL__IDENTIFIER = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Population Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL__POPULATION_LABEL = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__POPULATION_LABEL;

	/**
	 * The feature id for the '<em><b>Population Model Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL__POPULATION_MODEL_LABEL = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__POPULATION_MODEL_LABEL;

	/**
	 * The number of structural features of the '<em>Dengue Model Host Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_FEATURE_COUNT = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelHostLabelValueImpl <em>Dengue Model Host Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.vector.impl.DengueModelHostLabelValueImpl
	 * @see org.eclipse.stem.diseasemodels.vector.impl.VectorPackageImpl#getDengueModelHostLabelValue()
	 * @generated
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelVectorLabelImpl <em>Dengue Model Vector Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.vector.impl.DengueModelVectorLabelImpl
	 * @see org.eclipse.stem.diseasemodels.vector.impl.VectorPackageImpl#getDengueModelVectorLabel()
	 * @generated
	 */
	int DENGUE_MODEL_VECTOR_LABEL = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelVectorLabelValueImpl <em>Dengue Model Vector Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.vector.impl.DengueModelVectorLabelValueImpl
	 * @see org.eclipse.stem.diseasemodels.vector.impl.VectorPackageImpl#getDengueModelVectorLabelValue()
	 * @generated
	 */
	int DENGUE_MODEL_VECTOR_LABEL_VALUE = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelImpl <em>Simple Dengue Model Host Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelImpl
	 * @see org.eclipse.stem.diseasemodels.vector.impl.VectorPackageImpl#getSimpleDengueModelHostLabel()
	 * @generated
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl <em>Simple Dengue Model Host Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl
	 * @see org.eclipse.stem.diseasemodels.vector.impl.VectorPackageImpl#getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE = 11;

	/**
	 * The feature id for the '<em><b>Arrivals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__ARRIVALS = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__ARRIVALS;

	/**
	 * The feature id for the '<em><b>Departures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DEPARTURES = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__DEPARTURES;

	/**
	 * The feature id for the '<em><b>Population Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__POPULATION_COUNT = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__POPULATION_COUNT;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__S = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__S;

	/**
	 * The feature id for the '<em><b>Incidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__INCIDENCE;

	/**
	 * The feature id for the '<em><b>Disease Deaths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__DISEASE_DEATHS;

	/**
	 * The feature id for the '<em><b>I1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I1 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>I2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I2 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>I3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I3 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>I4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I4 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>C1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C1 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>C2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C2 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>C3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C3 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>C4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C4 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>R1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R1 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>R2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R2 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>R3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R3 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>R4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R4 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>I12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I12 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>I13</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I13 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>I14</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I14 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>I21</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I21 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>I23</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I23 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>I24</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I24 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>I31</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I31 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>I32</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I32 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>I34</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I34 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>I41</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I41 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>I42</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I42 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>I43</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I43 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Incidence1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE1 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Incidence2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE2 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Incidence3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE3 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Incidence4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE4 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Incidence12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE12 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Incidence21</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE21 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Incidence31</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE31 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Incidence41</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE41 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Incidence13</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE13 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Incidence23</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE23 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Incidence32</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE32 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Incidence42</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE42 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Incidence14</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE14 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Incidence24</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE24 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Incidence34</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE34 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Incidence43</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE43 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Disease Deaths1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS1 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>Disease Deaths2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS2 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>Disease Deaths3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS3 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 43;

	/**
	 * The feature id for the '<em><b>Disease Deaths4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS4 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 44;

	/**
	 * The feature id for the '<em><b>Disease Deaths12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS12 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 45;

	/**
	 * The feature id for the '<em><b>Disease Deaths21</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS21 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 46;

	/**
	 * The feature id for the '<em><b>Disease Deaths31</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS31 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 47;

	/**
	 * The feature id for the '<em><b>Disease Deaths41</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS41 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 48;

	/**
	 * The feature id for the '<em><b>Disease Deaths13</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS13 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 49;

	/**
	 * The feature id for the '<em><b>Disease Deaths23</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS23 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 50;

	/**
	 * The feature id for the '<em><b>Disease Deaths32</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS32 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 51;

	/**
	 * The feature id for the '<em><b>Disease Deaths42</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS42 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 52;

	/**
	 * The feature id for the '<em><b>Disease Deaths14</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS14 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 53;

	/**
	 * The feature id for the '<em><b>Disease Deaths24</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS24 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 54;

	/**
	 * The feature id for the '<em><b>Disease Deaths34</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS34 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 55;

	/**
	 * The feature id for the '<em><b>Disease Deaths43</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS43 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 56;

	/**
	 * The number of structural features of the '<em>Simple Dengue Model Host Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE_FEATURE_COUNT = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 57;

	/**
	 * The feature id for the '<em><b>Arrivals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__ARRIVALS = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__ARRIVALS;

	/**
	 * The feature id for the '<em><b>Departures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__DEPARTURES = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DEPARTURES;

	/**
	 * The feature id for the '<em><b>Population Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__POPULATION_COUNT = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__POPULATION_COUNT;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__S = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__S;

	/**
	 * The feature id for the '<em><b>Incidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE;

	/**
	 * The feature id for the '<em><b>Disease Deaths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS;

	/**
	 * The feature id for the '<em><b>I1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__I1 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I1;

	/**
	 * The feature id for the '<em><b>I2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__I2 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I2;

	/**
	 * The feature id for the '<em><b>I3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__I3 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I3;

	/**
	 * The feature id for the '<em><b>I4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__I4 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I4;

	/**
	 * The feature id for the '<em><b>C1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__C1 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C1;

	/**
	 * The feature id for the '<em><b>C2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__C2 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C2;

	/**
	 * The feature id for the '<em><b>C3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__C3 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C3;

	/**
	 * The feature id for the '<em><b>C4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__C4 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C4;

	/**
	 * The feature id for the '<em><b>R1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__R1 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R1;

	/**
	 * The feature id for the '<em><b>R2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__R2 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R2;

	/**
	 * The feature id for the '<em><b>R3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__R3 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R3;

	/**
	 * The feature id for the '<em><b>R4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__R4 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R4;

	/**
	 * The feature id for the '<em><b>I12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__I12 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I12;

	/**
	 * The feature id for the '<em><b>I13</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__I13 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I13;

	/**
	 * The feature id for the '<em><b>I14</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__I14 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I14;

	/**
	 * The feature id for the '<em><b>I21</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__I21 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I21;

	/**
	 * The feature id for the '<em><b>I23</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__I23 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I23;

	/**
	 * The feature id for the '<em><b>I24</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__I24 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I24;

	/**
	 * The feature id for the '<em><b>I31</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__I31 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I31;

	/**
	 * The feature id for the '<em><b>I32</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__I32 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I32;

	/**
	 * The feature id for the '<em><b>I34</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__I34 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I34;

	/**
	 * The feature id for the '<em><b>I41</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__I41 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I41;

	/**
	 * The feature id for the '<em><b>I42</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__I42 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I42;

	/**
	 * The feature id for the '<em><b>I43</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__I43 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I43;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__R = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R;

	/**
	 * The feature id for the '<em><b>Incidence1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE1 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE1;

	/**
	 * The feature id for the '<em><b>Incidence2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE2 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE2;

	/**
	 * The feature id for the '<em><b>Incidence3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE3 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE3;

	/**
	 * The feature id for the '<em><b>Incidence4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE4 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE4;

	/**
	 * The feature id for the '<em><b>Incidence12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE12 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE12;

	/**
	 * The feature id for the '<em><b>Incidence21</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE21 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE21;

	/**
	 * The feature id for the '<em><b>Incidence31</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE31 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE31;

	/**
	 * The feature id for the '<em><b>Incidence41</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE41 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE41;

	/**
	 * The feature id for the '<em><b>Incidence13</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE13 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE13;

	/**
	 * The feature id for the '<em><b>Incidence23</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE23 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE23;

	/**
	 * The feature id for the '<em><b>Incidence32</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE32 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE32;

	/**
	 * The feature id for the '<em><b>Incidence42</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE42 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE42;

	/**
	 * The feature id for the '<em><b>Incidence14</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE14 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE14;

	/**
	 * The feature id for the '<em><b>Incidence24</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE24 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE24;

	/**
	 * The feature id for the '<em><b>Incidence34</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE34 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE34;

	/**
	 * The feature id for the '<em><b>Incidence43</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE43 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE43;

	/**
	 * The feature id for the '<em><b>Disease Deaths1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS1 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS1;

	/**
	 * The feature id for the '<em><b>Disease Deaths2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS2 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS2;

	/**
	 * The feature id for the '<em><b>Disease Deaths3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS3 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS3;

	/**
	 * The feature id for the '<em><b>Disease Deaths4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS4 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS4;

	/**
	 * The feature id for the '<em><b>Disease Deaths12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS12 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS12;

	/**
	 * The feature id for the '<em><b>Disease Deaths21</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS21 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS21;

	/**
	 * The feature id for the '<em><b>Disease Deaths31</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS31 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS31;

	/**
	 * The feature id for the '<em><b>Disease Deaths41</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS41 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS41;

	/**
	 * The feature id for the '<em><b>Disease Deaths13</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS13 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS13;

	/**
	 * The feature id for the '<em><b>Disease Deaths23</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS23 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS23;

	/**
	 * The feature id for the '<em><b>Disease Deaths32</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS32 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS32;

	/**
	 * The feature id for the '<em><b>Disease Deaths42</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS42 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS42;

	/**
	 * The feature id for the '<em><b>Disease Deaths14</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS14 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS14;

	/**
	 * The feature id for the '<em><b>Disease Deaths24</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS24 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS24;

	/**
	 * The feature id for the '<em><b>Disease Deaths34</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS34 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS34;

	/**
	 * The feature id for the '<em><b>Disease Deaths43</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS43 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS43;

	/**
	 * The feature id for the '<em><b>E1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__E1 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>E2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__E2 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>E3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__E3 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>E4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__E4 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>E12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__E12 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>E13</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__E13 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>E14</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__E14 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>E21</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__E21 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>E23</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__E23 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>E24</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__E24 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>E31</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__E31 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>E32</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__E32 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>E34</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__E34 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>E41</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__E41 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>E42</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__E42 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>E43</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE__E43 = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Dengue Model Host Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_HOST_LABEL_VALUE_FEATURE_COUNT = SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL__URI = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL__TYPE_URI = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL__DUBLIN_CORE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>URI Of Identifiable To Be Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL__CURRENT_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Identifiable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL__IDENTIFIABLE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__IDENTIFIABLE;

	/**
	 * The feature id for the '<em><b>Next Value Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL__NEXT_VALUE_VALID = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NEXT_VALUE_VALID;

	/**
	 * The feature id for the '<em><b>Next Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL__NEXT_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NEXT_VALUE;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL__DECORATOR = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DECORATOR;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL__NODE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NODE;

	/**
	 * The feature id for the '<em><b>Delta Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL__DELTA_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DELTA_VALUE;

	/**
	 * The feature id for the '<em><b>Temp Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL__TEMP_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__TEMP_VALUE;

	/**
	 * The feature id for the '<em><b>Probe Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL__PROBE_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__PROBE_VALUE;

	/**
	 * The feature id for the '<em><b>Error Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL__ERROR_SCALE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__ERROR_SCALE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL__IDENTIFIER = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Population Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL__POPULATION_LABEL = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__POPULATION_LABEL;

	/**
	 * The feature id for the '<em><b>Population Model Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL__POPULATION_MODEL_LABEL = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__POPULATION_MODEL_LABEL;

	/**
	 * The number of structural features of the '<em>Dengue Model Vector Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL_FEATURE_COUNT = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arrivals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL_VALUE__ARRIVALS = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__ARRIVALS;

	/**
	 * The feature id for the '<em><b>Departures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL_VALUE__DEPARTURES = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__DEPARTURES;

	/**
	 * The feature id for the '<em><b>Population Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL_VALUE__POPULATION_COUNT = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__POPULATION_COUNT;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL_VALUE__S = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__S;

	/**
	 * The feature id for the '<em><b>Incidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__INCIDENCE;

	/**
	 * The feature id for the '<em><b>Disease Deaths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL_VALUE__DISEASE_DEATHS = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__DISEASE_DEATHS;

	/**
	 * The feature id for the '<em><b>E1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL_VALUE__E1 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>E2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL_VALUE__E2 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>E3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL_VALUE__E3 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>E4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL_VALUE__E4 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>I1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL_VALUE__I1 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>I2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL_VALUE__I2 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>I3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL_VALUE__I3 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>I4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL_VALUE__I4 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Incidence1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE1 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Incidence2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE2 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Incidence3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE3 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Incidence4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE4 = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Dengue Model Vector Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENGUE_MODEL_VECTOR_LABEL_VALUE_FEATURE_COUNT = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL__URI = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL__TYPE_URI = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL__DUBLIN_CORE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>URI Of Identifiable To Be Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL__CURRENT_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Identifiable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL__IDENTIFIABLE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__IDENTIFIABLE;

	/**
	 * The feature id for the '<em><b>Next Value Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL__NEXT_VALUE_VALID = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NEXT_VALUE_VALID;

	/**
	 * The feature id for the '<em><b>Next Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL__NEXT_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NEXT_VALUE;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL__DECORATOR = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DECORATOR;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL__NODE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NODE;

	/**
	 * The feature id for the '<em><b>Delta Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL__DELTA_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DELTA_VALUE;

	/**
	 * The feature id for the '<em><b>Temp Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL__TEMP_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__TEMP_VALUE;

	/**
	 * The feature id for the '<em><b>Probe Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL__PROBE_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__PROBE_VALUE;

	/**
	 * The feature id for the '<em><b>Error Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL__ERROR_SCALE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__ERROR_SCALE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL__IDENTIFIER = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Population Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL__POPULATION_LABEL = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__POPULATION_LABEL;

	/**
	 * The feature id for the '<em><b>Population Model Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL__POPULATION_MODEL_LABEL = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__POPULATION_MODEL_LABEL;

	/**
	 * The number of structural features of the '<em>Simple Dengue Model Host Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DENGUE_MODEL_HOST_LABEL_FEATURE_COUNT = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.vector.MacdonaldRossDiseaseModel <em>Macdonald Ross Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Macdonald Ross Disease Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.MacdonaldRossDiseaseModel
	 * @generated
	 */
	EClass getMacdonaldRossDiseaseModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.MacdonaldRossDiseaseModel#getBitingRate <em>Biting Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Biting Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.MacdonaldRossDiseaseModel#getBitingRate()
	 * @see #getMacdonaldRossDiseaseModel()
	 * @generated
	 */
	EAttribute getMacdonaldRossDiseaseModel_BitingRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.MacdonaldRossDiseaseModel#getInfectiousBitingProportionHuman <em>Infectious Biting Proportion Human</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Infectious Biting Proportion Human</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.MacdonaldRossDiseaseModel#getInfectiousBitingProportionHuman()
	 * @see #getMacdonaldRossDiseaseModel()
	 * @generated
	 */
	EAttribute getMacdonaldRossDiseaseModel_InfectiousBitingProportionHuman();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.MacdonaldRossDiseaseModel#getInfectiousBitingProportionVector <em>Infectious Biting Proportion Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Infectious Biting Proportion Vector</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.MacdonaldRossDiseaseModel#getInfectiousBitingProportionVector()
	 * @see #getMacdonaldRossDiseaseModel()
	 * @generated
	 */
	EAttribute getMacdonaldRossDiseaseModel_InfectiousBitingProportionVector();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.MacdonaldRossDiseaseModel#getRecoveryRate <em>Recovery Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recovery Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.MacdonaldRossDiseaseModel#getRecoveryRate()
	 * @see #getMacdonaldRossDiseaseModel()
	 * @generated
	 */
	EAttribute getMacdonaldRossDiseaseModel_RecoveryRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.MacdonaldRossDiseaseModel#getIncubationRate <em>Incubation Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incubation Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.MacdonaldRossDiseaseModel#getIncubationRate()
	 * @see #getMacdonaldRossDiseaseModel()
	 * @generated
	 */
	EAttribute getMacdonaldRossDiseaseModel_IncubationRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.MacdonaldRossDiseaseModel#getVectorIncubationRate <em>Vector Incubation Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vector Incubation Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.MacdonaldRossDiseaseModel#getVectorIncubationRate()
	 * @see #getMacdonaldRossDiseaseModel()
	 * @generated
	 */
	EAttribute getMacdonaldRossDiseaseModel_VectorIncubationRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.MacdonaldRossDiseaseModel#getImmunityLossRate <em>Immunity Loss Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immunity Loss Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.MacdonaldRossDiseaseModel#getImmunityLossRate()
	 * @see #getMacdonaldRossDiseaseModel()
	 * @generated
	 */
	EAttribute getMacdonaldRossDiseaseModel_ImmunityLossRate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.vector.VectorDiseaseModel <em>Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disease Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.VectorDiseaseModel
	 * @generated
	 */
	EClass getVectorDiseaseModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.VectorDiseaseModel#getVectorPopulationIdentifier <em>Vector Population Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vector Population Identifier</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.VectorDiseaseModel#getVectorPopulationIdentifier()
	 * @see #getVectorDiseaseModel()
	 * @generated
	 */
	EAttribute getVectorDiseaseModel_VectorPopulationIdentifier();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.vector.DengueModel <em>Dengue Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dengue Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel
	 * @generated
	 */
	EClass getDengueModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getBitingRateSV <em>Biting Rate SV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Biting Rate SV</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getBitingRateSV()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_BitingRateSV();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getBitingRateIV <em>Biting Rate IV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Biting Rate IV</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getBitingRateIV()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_BitingRateIV();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostInfectivity1 <em>Host Infectivity1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Infectivity1</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostInfectivity1()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostInfectivity1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostInfectivity2 <em>Host Infectivity2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Infectivity2</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostInfectivity2()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostInfectivity2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostInfectivity3 <em>Host Infectivity3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Infectivity3</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostInfectivity3()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostInfectivity3();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostInfectivity4 <em>Host Infectivity4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Infectivity4</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostInfectivity4()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostInfectivity4();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryIncubationRate1 <em>Host Primary Incubation Rate1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Primary Incubation Rate1</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryIncubationRate1()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostPrimaryIncubationRate1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryIncubationRate2 <em>Host Primary Incubation Rate2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Primary Incubation Rate2</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryIncubationRate2()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostPrimaryIncubationRate2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryIncubationRate3 <em>Host Primary Incubation Rate3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Primary Incubation Rate3</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryIncubationRate3()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostPrimaryIncubationRate3();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryIncubationRate4 <em>Host Primary Incubation Rate4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Primary Incubation Rate4</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryIncubationRate4()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostPrimaryIncubationRate4();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryRecoveryRate1 <em>Host Primary Recovery Rate1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Primary Recovery Rate1</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryRecoveryRate1()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostPrimaryRecoveryRate1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryRecoveryRate2 <em>Host Primary Recovery Rate2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Primary Recovery Rate2</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryRecoveryRate2()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostPrimaryRecoveryRate2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryRecoveryRate3 <em>Host Primary Recovery Rate3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Primary Recovery Rate3</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryRecoveryRate3()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostPrimaryRecoveryRate3();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryRecoveryRate4 <em>Host Primary Recovery Rate4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Primary Recovery Rate4</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryRecoveryRate4()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostPrimaryRecoveryRate4();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryImmunityLossRate1 <em>Host Primary Immunity Loss Rate1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Primary Immunity Loss Rate1</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryImmunityLossRate1()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostPrimaryImmunityLossRate1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryImmunityLossRate2 <em>Host Primary Immunity Loss Rate2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Primary Immunity Loss Rate2</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryImmunityLossRate2()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostPrimaryImmunityLossRate2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryImmunityLossRate3 <em>Host Primary Immunity Loss Rate3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Primary Immunity Loss Rate3</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryImmunityLossRate3()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostPrimaryImmunityLossRate3();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryImmunityLossRate4 <em>Host Primary Immunity Loss Rate4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Primary Immunity Loss Rate4</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryImmunityLossRate4()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostPrimaryImmunityLossRate4();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryDiseaseDeathRate1 <em>Host Primary Disease Death Rate1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Primary Disease Death Rate1</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryDiseaseDeathRate1()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostPrimaryDiseaseDeathRate1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryDiseaseDeathRate2 <em>Host Primary Disease Death Rate2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Primary Disease Death Rate2</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryDiseaseDeathRate2()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostPrimaryDiseaseDeathRate2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryDiseaseDeathRate3 <em>Host Primary Disease Death Rate3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Primary Disease Death Rate3</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryDiseaseDeathRate3()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostPrimaryDiseaseDeathRate3();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryDiseaseDeathRate4 <em>Host Primary Disease Death Rate4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Primary Disease Death Rate4</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostPrimaryDiseaseDeathRate4()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostPrimaryDiseaseDeathRate4();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE12 <em>Host ADE12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host ADE12</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE12()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostADE12();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE13 <em>Host ADE13</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host ADE13</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE13()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostADE13();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE14 <em>Host ADE14</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host ADE14</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE14()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostADE14();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE21 <em>Host ADE21</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host ADE21</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE21()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostADE21();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE23 <em>Host ADE23</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host ADE23</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE23()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostADE23();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE24 <em>Host ADE24</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host ADE24</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE24()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostADE24();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE31 <em>Host ADE31</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host ADE31</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE31()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostADE31();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE32 <em>Host ADE32</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host ADE32</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE32()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostADE32();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE34 <em>Host ADE34</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host ADE34</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE34()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostADE34();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE41 <em>Host ADE41</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host ADE41</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE41()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostADE41();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE42 <em>Host ADE42</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host ADE42</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE42()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostADE42();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE43 <em>Host ADE43</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host ADE43</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostADE43()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostADE43();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate12 <em>Host Secondary Disease Death Rate12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Disease Death Rate12</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate12()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryDiseaseDeathRate12();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate13 <em>Host Secondary Disease Death Rate13</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Disease Death Rate13</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate13()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryDiseaseDeathRate13();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate14 <em>Host Secondary Disease Death Rate14</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Disease Death Rate14</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate14()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryDiseaseDeathRate14();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate21 <em>Host Secondary Disease Death Rate21</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Disease Death Rate21</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate21()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryDiseaseDeathRate21();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate23 <em>Host Secondary Disease Death Rate23</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Disease Death Rate23</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate23()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryDiseaseDeathRate23();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate24 <em>Host Secondary Disease Death Rate24</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Disease Death Rate24</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate24()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryDiseaseDeathRate24();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate31 <em>Host Secondary Disease Death Rate31</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Disease Death Rate31</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate31()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryDiseaseDeathRate31();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate32 <em>Host Secondary Disease Death Rate32</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Disease Death Rate32</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate32()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryDiseaseDeathRate32();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate34 <em>Host Secondary Disease Death Rate34</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Disease Death Rate34</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate34()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryDiseaseDeathRate34();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate41 <em>Host Secondary Disease Death Rate41</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Disease Death Rate41</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate41()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryDiseaseDeathRate41();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate42 <em>Host Secondary Disease Death Rate42</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Disease Death Rate42</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate42()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryDiseaseDeathRate42();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate43 <em>Host Secondary Disease Death Rate43</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Disease Death Rate43</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryDiseaseDeathRate43()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryDiseaseDeathRate43();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate12 <em>Host Secondary Recovery Rate12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Recovery Rate12</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate12()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryRecoveryRate12();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate13 <em>Host Secondary Recovery Rate13</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Recovery Rate13</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate13()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryRecoveryRate13();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate14 <em>Host Secondary Recovery Rate14</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Recovery Rate14</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate14()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryRecoveryRate14();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate21 <em>Host Secondary Recovery Rate21</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Recovery Rate21</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate21()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryRecoveryRate21();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate23 <em>Host Secondary Recovery Rate23</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Recovery Rate23</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate23()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryRecoveryRate23();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate24 <em>Host Secondary Recovery Rate24</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Recovery Rate24</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate24()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryRecoveryRate24();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate31 <em>Host Secondary Recovery Rate31</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Recovery Rate31</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate31()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryRecoveryRate31();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate32 <em>Host Secondary Recovery Rate32</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Recovery Rate32</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate32()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryRecoveryRate32();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate34 <em>Host Secondary Recovery Rate34</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Recovery Rate34</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate34()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryRecoveryRate34();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate41 <em>Host Secondary Recovery Rate41</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Recovery Rate41</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate41()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryRecoveryRate41();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate42 <em>Host Secondary Recovery Rate42</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Recovery Rate42</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate42()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryRecoveryRate42();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate43 <em>Host Secondary Recovery Rate43</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Recovery Rate43</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryRecoveryRate43()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryRecoveryRate43();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate12 <em>Host Secondary Incubation Rate12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Incubation Rate12</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate12()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryIncubationRate12();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate13 <em>Host Secondary Incubation Rate13</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Incubation Rate13</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate13()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryIncubationRate13();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate14 <em>Host Secondary Incubation Rate14</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Incubation Rate14</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate14()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryIncubationRate14();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate21 <em>Host Secondary Incubation Rate21</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Incubation Rate21</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate21()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryIncubationRate21();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate23 <em>Host Secondary Incubation Rate23</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Incubation Rate23</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate23()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryIncubationRate23();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate24 <em>Host Secondary Incubation Rate24</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Incubation Rate24</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate24()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryIncubationRate24();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate31 <em>Host Secondary Incubation Rate31</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Incubation Rate31</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate31()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryIncubationRate31();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate32 <em>Host Secondary Incubation Rate32</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Incubation Rate32</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate32()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryIncubationRate32();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate34 <em>Host Secondary Incubation Rate34</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Incubation Rate34</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate34()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryIncubationRate34();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate41 <em>Host Secondary Incubation Rate41</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Incubation Rate41</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate41()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryIncubationRate41();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate42 <em>Host Secondary Incubation Rate42</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Incubation Rate42</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate42()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryIncubationRate42();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate43 <em>Host Secondary Incubation Rate43</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Incubation Rate43</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getHostSecondaryIncubationRate43()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_HostSecondaryIncubationRate43();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorInfectivity1 <em>Vector Infectivity1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vector Infectivity1</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorInfectivity1()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_VectorInfectivity1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorInfectivity2 <em>Vector Infectivity2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vector Infectivity2</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorInfectivity2()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_VectorInfectivity2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorInfectivity3 <em>Vector Infectivity3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vector Infectivity3</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorInfectivity3()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_VectorInfectivity3();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorInfectivity4 <em>Vector Infectivity4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vector Infectivity4</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorInfectivity4()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_VectorInfectivity4();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorADE1 <em>Vector ADE1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vector ADE1</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorADE1()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_VectorADE1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorADE2 <em>Vector ADE2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vector ADE2</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorADE2()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_VectorADE2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorADE3 <em>Vector ADE3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vector ADE3</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorADE3()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_VectorADE3();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorADE4 <em>Vector ADE4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vector ADE4</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorADE4()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_VectorADE4();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorIncubationRate1 <em>Vector Incubation Rate1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vector Incubation Rate1</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorIncubationRate1()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_VectorIncubationRate1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorIncubationRate2 <em>Vector Incubation Rate2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vector Incubation Rate2</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorIncubationRate2()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_VectorIncubationRate2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorIncubationRate3 <em>Vector Incubation Rate3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vector Incubation Rate3</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorIncubationRate3()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_VectorIncubationRate3();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorIncubationRate4 <em>Vector Incubation Rate4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vector Incubation Rate4</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getVectorIncubationRate4()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_VectorIncubationRate4();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getEpisilon1 <em>Episilon1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Episilon1</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getEpisilon1()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_Episilon1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getEpisilon2 <em>Episilon2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Episilon2</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getEpisilon2()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_Episilon2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getEpisilon3 <em>Episilon3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Episilon3</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getEpisilon3()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_Episilon3();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModel#getEpisilon4 <em>Episilon4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Episilon4</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel#getEpisilon4()
	 * @see #getDengueModel()
	 * @generated
	 */
	EAttribute getDengueModel_Episilon4();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModel <em>Simple Dengue Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Dengue Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModel
	 * @generated
	 */
	EClass getSimpleDengueModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getHostTransmissionRate <em>Host Transmission Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Transmission Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getHostTransmissionRate()
	 * @see #getSimpleDengueModel()
	 * @generated
	 */
	EAttribute getSimpleDengueModel_HostTransmissionRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getAdeFactor <em>Ade Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ade Factor</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getAdeFactor()
	 * @see #getSimpleDengueModel()
	 * @generated
	 */
	EAttribute getSimpleDengueModel_AdeFactor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getHostImmunityLossRate <em>Host Immunity Loss Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Immunity Loss Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getHostImmunityLossRate()
	 * @see #getSimpleDengueModel()
	 * @generated
	 */
	EAttribute getSimpleDengueModel_HostImmunityLossRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getHostPrimaryDeathRate <em>Host Primary Death Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Primary Death Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getHostPrimaryDeathRate()
	 * @see #getSimpleDengueModel()
	 * @generated
	 */
	EAttribute getSimpleDengueModel_HostPrimaryDeathRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getHostRecoveryRate <em>Host Recovery Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Recovery Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getHostRecoveryRate()
	 * @see #getSimpleDengueModel()
	 * @generated
	 */
	EAttribute getSimpleDengueModel_HostRecoveryRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getHostSecondaryDeathRate <em>Host Secondary Death Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Secondary Death Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getHostSecondaryDeathRate()
	 * @see #getSimpleDengueModel()
	 * @generated
	 */
	EAttribute getSimpleDengueModel_HostSecondaryDeathRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getVectorIncubationRate <em>Vector Incubation Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vector Incubation Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getVectorIncubationRate()
	 * @see #getSimpleDengueModel()
	 * @generated
	 */
	EAttribute getSimpleDengueModel_VectorIncubationRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getVectorTransmissionRate <em>Vector Transmission Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vector Transmission Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getVectorTransmissionRate()
	 * @see #getSimpleDengueModel()
	 * @generated
	 */
	EAttribute getSimpleDengueModel_VectorTransmissionRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getImmunityStrength <em>Immunity Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immunity Strength</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModel#getImmunityStrength()
	 * @see #getSimpleDengueModel()
	 * @generated
	 */
	EAttribute getSimpleDengueModel_ImmunityStrength();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel <em>Very Simple Dengue Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Very Simple Dengue Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel
	 * @generated
	 */
	EClass getVerySimpleDengueModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel#getTransmissionRate <em>Transmission Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transmission Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel#getTransmissionRate()
	 * @see #getVerySimpleDengueModel()
	 * @generated
	 */
	EAttribute getVerySimpleDengueModel_TransmissionRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel#getRecoveryRate <em>Recovery Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recovery Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel#getRecoveryRate()
	 * @see #getVerySimpleDengueModel()
	 * @generated
	 */
	EAttribute getVerySimpleDengueModel_RecoveryRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel#getImmunityLossRate <em>Immunity Loss Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immunity Loss Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel#getImmunityLossRate()
	 * @see #getVerySimpleDengueModel()
	 * @generated
	 */
	EAttribute getVerySimpleDengueModel_ImmunityLossRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel#getAdeFactor <em>Ade Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ade Factor</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel#getAdeFactor()
	 * @see #getVerySimpleDengueModel()
	 * @generated
	 */
	EAttribute getVerySimpleDengueModel_AdeFactor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel#getImmunityStrength <em>Immunity Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immunity Strength</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel#getImmunityStrength()
	 * @see #getVerySimpleDengueModel()
	 * @generated
	 */
	EAttribute getVerySimpleDengueModel_ImmunityStrength();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel#getPrimaryDeathRate <em>Primary Death Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Death Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel#getPrimaryDeathRate()
	 * @see #getVerySimpleDengueModel()
	 * @generated
	 */
	EAttribute getVerySimpleDengueModel_PrimaryDeathRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel#getSecondaryDeathRate <em>Secondary Death Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secondary Death Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel#getSecondaryDeathRate()
	 * @see #getVerySimpleDengueModel()
	 * @generated
	 */
	EAttribute getVerySimpleDengueModel_SecondaryDeathRate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLabel <em>Dengue Model Host Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dengue Model Host Label</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelHostLabel
	 * @generated
	 */
	EClass getDengueModelHostLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue <em>Dengue Model Host Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dengue Model Host Label Value</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue
	 * @generated
	 */
	EClass getDengueModelHostLabelValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue#getE1 <em>E1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>E1</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue#getE1()
	 * @see #getDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getDengueModelHostLabelValue_E1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue#getE2 <em>E2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>E2</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue#getE2()
	 * @see #getDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getDengueModelHostLabelValue_E2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue#getE3 <em>E3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>E3</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue#getE3()
	 * @see #getDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getDengueModelHostLabelValue_E3();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue#getE4 <em>E4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>E4</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue#getE4()
	 * @see #getDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getDengueModelHostLabelValue_E4();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue#getE12 <em>E12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>E12</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue#getE12()
	 * @see #getDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getDengueModelHostLabelValue_E12();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue#getE13 <em>E13</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>E13</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue#getE13()
	 * @see #getDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getDengueModelHostLabelValue_E13();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue#getE14 <em>E14</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>E14</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue#getE14()
	 * @see #getDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getDengueModelHostLabelValue_E14();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue#getE21 <em>E21</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>E21</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue#getE21()
	 * @see #getDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getDengueModelHostLabelValue_E21();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue#getE23 <em>E23</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>E23</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue#getE23()
	 * @see #getDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getDengueModelHostLabelValue_E23();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue#getE24 <em>E24</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>E24</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue#getE24()
	 * @see #getDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getDengueModelHostLabelValue_E24();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue#getE31 <em>E31</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>E31</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue#getE31()
	 * @see #getDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getDengueModelHostLabelValue_E31();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue#getE32 <em>E32</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>E32</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue#getE32()
	 * @see #getDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getDengueModelHostLabelValue_E32();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue#getE34 <em>E34</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>E34</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue#getE34()
	 * @see #getDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getDengueModelHostLabelValue_E34();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue#getE41 <em>E41</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>E41</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue#getE41()
	 * @see #getDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getDengueModelHostLabelValue_E41();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue#getE42 <em>E42</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>E42</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue#getE42()
	 * @see #getDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getDengueModelHostLabelValue_E42();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue#getE43 <em>E43</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>E43</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue#getE43()
	 * @see #getDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getDengueModelHostLabelValue_E43();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabel <em>Dengue Model Vector Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dengue Model Vector Label</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabel
	 * @generated
	 */
	EClass getDengueModelVectorLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue <em>Dengue Model Vector Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dengue Model Vector Label Value</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue
	 * @generated
	 */
	EClass getDengueModelVectorLabelValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue#getE1 <em>E1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>E1</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue#getE1()
	 * @see #getDengueModelVectorLabelValue()
	 * @generated
	 */
	EAttribute getDengueModelVectorLabelValue_E1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue#getE2 <em>E2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>E2</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue#getE2()
	 * @see #getDengueModelVectorLabelValue()
	 * @generated
	 */
	EAttribute getDengueModelVectorLabelValue_E2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue#getE3 <em>E3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>E3</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue#getE3()
	 * @see #getDengueModelVectorLabelValue()
	 * @generated
	 */
	EAttribute getDengueModelVectorLabelValue_E3();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue#getE4 <em>E4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>E4</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue#getE4()
	 * @see #getDengueModelVectorLabelValue()
	 * @generated
	 */
	EAttribute getDengueModelVectorLabelValue_E4();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue#getI1 <em>I1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>I1</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue#getI1()
	 * @see #getDengueModelVectorLabelValue()
	 * @generated
	 */
	EAttribute getDengueModelVectorLabelValue_I1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue#getI2 <em>I2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>I2</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue#getI2()
	 * @see #getDengueModelVectorLabelValue()
	 * @generated
	 */
	EAttribute getDengueModelVectorLabelValue_I2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue#getI3 <em>I3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>I3</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue#getI3()
	 * @see #getDengueModelVectorLabelValue()
	 * @generated
	 */
	EAttribute getDengueModelVectorLabelValue_I3();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue#getI4 <em>I4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>I4</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue#getI4()
	 * @see #getDengueModelVectorLabelValue()
	 * @generated
	 */
	EAttribute getDengueModelVectorLabelValue_I4();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue#getIncidence1 <em>Incidence1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incidence1</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue#getIncidence1()
	 * @see #getDengueModelVectorLabelValue()
	 * @generated
	 */
	EAttribute getDengueModelVectorLabelValue_Incidence1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue#getIncidence2 <em>Incidence2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incidence2</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue#getIncidence2()
	 * @see #getDengueModelVectorLabelValue()
	 * @generated
	 */
	EAttribute getDengueModelVectorLabelValue_Incidence2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue#getIncidence3 <em>Incidence3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incidence3</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue#getIncidence3()
	 * @see #getDengueModelVectorLabelValue()
	 * @generated
	 */
	EAttribute getDengueModelVectorLabelValue_Incidence3();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue#getIncidence4 <em>Incidence4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incidence4</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue#getIncidence4()
	 * @see #getDengueModelVectorLabelValue()
	 * @generated
	 */
	EAttribute getDengueModelVectorLabelValue_Incidence4();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.vector.AbstractDengueModel <em>Abstract Dengue Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Dengue Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.AbstractDengueModel
	 * @generated
	 */
	EClass getAbstractDengueModel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabel <em>Simple Dengue Model Host Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Dengue Model Host Label</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabel
	 * @generated
	 */
	EClass getSimpleDengueModelHostLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue <em>Simple Dengue Model Host Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Dengue Model Host Label Value</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue
	 * @generated
	 */
	EClass getSimpleDengueModelHostLabelValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getI1 <em>I1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>I1</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getI1()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_I1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getI2 <em>I2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>I2</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getI2()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_I2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getI3 <em>I3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>I3</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getI3()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_I3();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getI4 <em>I4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>I4</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getI4()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_I4();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getC1 <em>C1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>C1</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getC1()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_C1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getC2 <em>C2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>C2</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getC2()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_C2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getC3 <em>C3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>C3</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getC3()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_C3();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getC4 <em>C4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>C4</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getC4()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_C4();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getR1 <em>R1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R1</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getR1()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_R1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getR2 <em>R2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R2</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getR2()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_R2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getR3 <em>R3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R3</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getR3()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_R3();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getR4 <em>R4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R4</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getR4()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_R4();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getI12 <em>I12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>I12</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getI12()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_I12();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getI13 <em>I13</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>I13</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getI13()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_I13();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getI14 <em>I14</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>I14</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getI14()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_I14();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getI21 <em>I21</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>I21</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getI21()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_I21();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getI23 <em>I23</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>I23</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getI23()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_I23();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getI24 <em>I24</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>I24</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getI24()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_I24();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getI31 <em>I31</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>I31</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getI31()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_I31();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getI32 <em>I32</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>I32</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getI32()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_I32();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getI34 <em>I34</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>I34</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getI34()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_I34();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getI41 <em>I41</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>I41</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getI41()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_I41();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getI42 <em>I42</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>I42</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getI42()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_I42();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getI43 <em>I43</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>I43</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getI43()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_I43();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getR()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_R();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getIncidence1 <em>Incidence1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incidence1</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getIncidence1()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_Incidence1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getIncidence2 <em>Incidence2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incidence2</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getIncidence2()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_Incidence2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getIncidence3 <em>Incidence3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incidence3</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getIncidence3()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_Incidence3();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getIncidence4 <em>Incidence4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incidence4</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getIncidence4()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_Incidence4();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getIncidence12 <em>Incidence12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incidence12</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getIncidence12()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_Incidence12();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getIncidence21 <em>Incidence21</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incidence21</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getIncidence21()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_Incidence21();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getIncidence31 <em>Incidence31</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incidence31</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getIncidence31()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_Incidence31();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getIncidence41 <em>Incidence41</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incidence41</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getIncidence41()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_Incidence41();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getIncidence13 <em>Incidence13</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incidence13</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getIncidence13()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_Incidence13();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getIncidence23 <em>Incidence23</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incidence23</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getIncidence23()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_Incidence23();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getIncidence32 <em>Incidence32</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incidence32</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getIncidence32()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_Incidence32();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getIncidence42 <em>Incidence42</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incidence42</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getIncidence42()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_Incidence42();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getIncidence14 <em>Incidence14</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incidence14</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getIncidence14()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_Incidence14();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getIncidence24 <em>Incidence24</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incidence24</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getIncidence24()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_Incidence24();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getIncidence34 <em>Incidence34</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incidence34</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getIncidence34()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_Incidence34();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getIncidence43 <em>Incidence43</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incidence43</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getIncidence43()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_Incidence43();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getDiseaseDeaths1 <em>Disease Deaths1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disease Deaths1</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getDiseaseDeaths1()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_DiseaseDeaths1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getDiseaseDeaths2 <em>Disease Deaths2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disease Deaths2</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getDiseaseDeaths2()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_DiseaseDeaths2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getDiseaseDeaths3 <em>Disease Deaths3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disease Deaths3</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getDiseaseDeaths3()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_DiseaseDeaths3();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getDiseaseDeaths4 <em>Disease Deaths4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disease Deaths4</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getDiseaseDeaths4()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_DiseaseDeaths4();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getDiseaseDeaths12 <em>Disease Deaths12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disease Deaths12</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getDiseaseDeaths12()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_DiseaseDeaths12();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getDiseaseDeaths21 <em>Disease Deaths21</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disease Deaths21</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getDiseaseDeaths21()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_DiseaseDeaths21();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getDiseaseDeaths31 <em>Disease Deaths31</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disease Deaths31</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getDiseaseDeaths31()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_DiseaseDeaths31();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getDiseaseDeaths41 <em>Disease Deaths41</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disease Deaths41</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getDiseaseDeaths41()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_DiseaseDeaths41();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getDiseaseDeaths13 <em>Disease Deaths13</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disease Deaths13</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getDiseaseDeaths13()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_DiseaseDeaths13();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getDiseaseDeaths23 <em>Disease Deaths23</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disease Deaths23</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getDiseaseDeaths23()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_DiseaseDeaths23();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getDiseaseDeaths32 <em>Disease Deaths32</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disease Deaths32</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getDiseaseDeaths32()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_DiseaseDeaths32();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getDiseaseDeaths42 <em>Disease Deaths42</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disease Deaths42</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getDiseaseDeaths42()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_DiseaseDeaths42();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getDiseaseDeaths14 <em>Disease Deaths14</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disease Deaths14</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getDiseaseDeaths14()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_DiseaseDeaths14();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getDiseaseDeaths24 <em>Disease Deaths24</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disease Deaths24</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getDiseaseDeaths24()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_DiseaseDeaths24();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getDiseaseDeaths34 <em>Disease Deaths34</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disease Deaths34</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getDiseaseDeaths34()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_DiseaseDeaths34();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getDiseaseDeaths43 <em>Disease Deaths43</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disease Deaths43</em>'.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue#getDiseaseDeaths43()
	 * @see #getSimpleDengueModelHostLabelValue()
	 * @generated
	 */
	EAttribute getSimpleDengueModelHostLabelValue_DiseaseDeaths43();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VectorFactory getVectorFactory();

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
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.vector.impl.MacdonaldRossDiseaseModelImpl <em>Macdonald Ross Disease Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.vector.impl.MacdonaldRossDiseaseModelImpl
		 * @see org.eclipse.stem.diseasemodels.vector.impl.VectorPackageImpl#getMacdonaldRossDiseaseModel()
		 * @generated
		 */
		EClass MACDONALD_ROSS_DISEASE_MODEL = eINSTANCE.getMacdonaldRossDiseaseModel();
		/**
		 * The meta object literal for the '<em><b>Biting Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACDONALD_ROSS_DISEASE_MODEL__BITING_RATE = eINSTANCE.getMacdonaldRossDiseaseModel_BitingRate();
		/**
		 * The meta object literal for the '<em><b>Infectious Biting Proportion Human</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACDONALD_ROSS_DISEASE_MODEL__INFECTIOUS_BITING_PROPORTION_HUMAN = eINSTANCE.getMacdonaldRossDiseaseModel_InfectiousBitingProportionHuman();
		/**
		 * The meta object literal for the '<em><b>Infectious Biting Proportion Vector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACDONALD_ROSS_DISEASE_MODEL__INFECTIOUS_BITING_PROPORTION_VECTOR = eINSTANCE.getMacdonaldRossDiseaseModel_InfectiousBitingProportionVector();
		/**
		 * The meta object literal for the '<em><b>Recovery Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACDONALD_ROSS_DISEASE_MODEL__RECOVERY_RATE = eINSTANCE.getMacdonaldRossDiseaseModel_RecoveryRate();
		/**
		 * The meta object literal for the '<em><b>Incubation Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACDONALD_ROSS_DISEASE_MODEL__INCUBATION_RATE = eINSTANCE.getMacdonaldRossDiseaseModel_IncubationRate();
		/**
		 * The meta object literal for the '<em><b>Vector Incubation Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACDONALD_ROSS_DISEASE_MODEL__VECTOR_INCUBATION_RATE = eINSTANCE.getMacdonaldRossDiseaseModel_VectorIncubationRate();
		/**
		 * The meta object literal for the '<em><b>Immunity Loss Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACDONALD_ROSS_DISEASE_MODEL__IMMUNITY_LOSS_RATE = eINSTANCE.getMacdonaldRossDiseaseModel_ImmunityLossRate();
		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.vector.impl.VectorDiseaseModelImpl <em>Disease Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.vector.impl.VectorDiseaseModelImpl
		 * @see org.eclipse.stem.diseasemodels.vector.impl.VectorPackageImpl#getVectorDiseaseModel()
		 * @generated
		 */
		EClass VECTOR_DISEASE_MODEL = eINSTANCE.getVectorDiseaseModel();
		/**
		 * The meta object literal for the '<em><b>Vector Population Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR_DISEASE_MODEL__VECTOR_POPULATION_IDENTIFIER = eINSTANCE.getVectorDiseaseModel_VectorPopulationIdentifier();
		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl <em>Dengue Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.vector.impl.DengueModelImpl
		 * @see org.eclipse.stem.diseasemodels.vector.impl.VectorPackageImpl#getDengueModel()
		 * @generated
		 */
		EClass DENGUE_MODEL = eINSTANCE.getDengueModel();
		/**
		 * The meta object literal for the '<em><b>Biting Rate SV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__BITING_RATE_SV = eINSTANCE.getDengueModel_BitingRateSV();
		/**
		 * The meta object literal for the '<em><b>Biting Rate IV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__BITING_RATE_IV = eINSTANCE.getDengueModel_BitingRateIV();
		/**
		 * The meta object literal for the '<em><b>Host Infectivity1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_INFECTIVITY1 = eINSTANCE.getDengueModel_HostInfectivity1();
		/**
		 * The meta object literal for the '<em><b>Host Infectivity2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_INFECTIVITY2 = eINSTANCE.getDengueModel_HostInfectivity2();
		/**
		 * The meta object literal for the '<em><b>Host Infectivity3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_INFECTIVITY3 = eINSTANCE.getDengueModel_HostInfectivity3();
		/**
		 * The meta object literal for the '<em><b>Host Infectivity4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_INFECTIVITY4 = eINSTANCE.getDengueModel_HostInfectivity4();
		/**
		 * The meta object literal for the '<em><b>Host Primary Incubation Rate1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE1 = eINSTANCE.getDengueModel_HostPrimaryIncubationRate1();
		/**
		 * The meta object literal for the '<em><b>Host Primary Incubation Rate2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE2 = eINSTANCE.getDengueModel_HostPrimaryIncubationRate2();
		/**
		 * The meta object literal for the '<em><b>Host Primary Incubation Rate3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE3 = eINSTANCE.getDengueModel_HostPrimaryIncubationRate3();
		/**
		 * The meta object literal for the '<em><b>Host Primary Incubation Rate4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE4 = eINSTANCE.getDengueModel_HostPrimaryIncubationRate4();
		/**
		 * The meta object literal for the '<em><b>Host Primary Recovery Rate1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE1 = eINSTANCE.getDengueModel_HostPrimaryRecoveryRate1();
		/**
		 * The meta object literal for the '<em><b>Host Primary Recovery Rate2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE2 = eINSTANCE.getDengueModel_HostPrimaryRecoveryRate2();
		/**
		 * The meta object literal for the '<em><b>Host Primary Recovery Rate3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE3 = eINSTANCE.getDengueModel_HostPrimaryRecoveryRate3();
		/**
		 * The meta object literal for the '<em><b>Host Primary Recovery Rate4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE4 = eINSTANCE.getDengueModel_HostPrimaryRecoveryRate4();
		/**
		 * The meta object literal for the '<em><b>Host Primary Immunity Loss Rate1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE1 = eINSTANCE.getDengueModel_HostPrimaryImmunityLossRate1();
		/**
		 * The meta object literal for the '<em><b>Host Primary Immunity Loss Rate2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE2 = eINSTANCE.getDengueModel_HostPrimaryImmunityLossRate2();
		/**
		 * The meta object literal for the '<em><b>Host Primary Immunity Loss Rate3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE3 = eINSTANCE.getDengueModel_HostPrimaryImmunityLossRate3();
		/**
		 * The meta object literal for the '<em><b>Host Primary Immunity Loss Rate4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE4 = eINSTANCE.getDengueModel_HostPrimaryImmunityLossRate4();
		/**
		 * The meta object literal for the '<em><b>Host Primary Disease Death Rate1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE1 = eINSTANCE.getDengueModel_HostPrimaryDiseaseDeathRate1();
		/**
		 * The meta object literal for the '<em><b>Host Primary Disease Death Rate2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE2 = eINSTANCE.getDengueModel_HostPrimaryDiseaseDeathRate2();
		/**
		 * The meta object literal for the '<em><b>Host Primary Disease Death Rate3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE3 = eINSTANCE.getDengueModel_HostPrimaryDiseaseDeathRate3();
		/**
		 * The meta object literal for the '<em><b>Host Primary Disease Death Rate4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE4 = eINSTANCE.getDengueModel_HostPrimaryDiseaseDeathRate4();
		/**
		 * The meta object literal for the '<em><b>Host ADE12</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_ADE12 = eINSTANCE.getDengueModel_HostADE12();
		/**
		 * The meta object literal for the '<em><b>Host ADE13</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_ADE13 = eINSTANCE.getDengueModel_HostADE13();
		/**
		 * The meta object literal for the '<em><b>Host ADE14</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_ADE14 = eINSTANCE.getDengueModel_HostADE14();
		/**
		 * The meta object literal for the '<em><b>Host ADE21</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_ADE21 = eINSTANCE.getDengueModel_HostADE21();
		/**
		 * The meta object literal for the '<em><b>Host ADE23</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_ADE23 = eINSTANCE.getDengueModel_HostADE23();
		/**
		 * The meta object literal for the '<em><b>Host ADE24</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_ADE24 = eINSTANCE.getDengueModel_HostADE24();
		/**
		 * The meta object literal for the '<em><b>Host ADE31</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_ADE31 = eINSTANCE.getDengueModel_HostADE31();
		/**
		 * The meta object literal for the '<em><b>Host ADE32</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_ADE32 = eINSTANCE.getDengueModel_HostADE32();
		/**
		 * The meta object literal for the '<em><b>Host ADE34</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_ADE34 = eINSTANCE.getDengueModel_HostADE34();
		/**
		 * The meta object literal for the '<em><b>Host ADE41</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_ADE41 = eINSTANCE.getDengueModel_HostADE41();
		/**
		 * The meta object literal for the '<em><b>Host ADE42</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_ADE42 = eINSTANCE.getDengueModel_HostADE42();
		/**
		 * The meta object literal for the '<em><b>Host ADE43</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_ADE43 = eINSTANCE.getDengueModel_HostADE43();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Disease Death Rate12</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE12 = eINSTANCE.getDengueModel_HostSecondaryDiseaseDeathRate12();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Disease Death Rate13</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE13 = eINSTANCE.getDengueModel_HostSecondaryDiseaseDeathRate13();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Disease Death Rate14</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE14 = eINSTANCE.getDengueModel_HostSecondaryDiseaseDeathRate14();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Disease Death Rate21</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE21 = eINSTANCE.getDengueModel_HostSecondaryDiseaseDeathRate21();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Disease Death Rate23</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE23 = eINSTANCE.getDengueModel_HostSecondaryDiseaseDeathRate23();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Disease Death Rate24</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE24 = eINSTANCE.getDengueModel_HostSecondaryDiseaseDeathRate24();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Disease Death Rate31</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE31 = eINSTANCE.getDengueModel_HostSecondaryDiseaseDeathRate31();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Disease Death Rate32</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE32 = eINSTANCE.getDengueModel_HostSecondaryDiseaseDeathRate32();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Disease Death Rate34</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE34 = eINSTANCE.getDengueModel_HostSecondaryDiseaseDeathRate34();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Disease Death Rate41</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE41 = eINSTANCE.getDengueModel_HostSecondaryDiseaseDeathRate41();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Disease Death Rate42</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE42 = eINSTANCE.getDengueModel_HostSecondaryDiseaseDeathRate42();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Disease Death Rate43</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE43 = eINSTANCE.getDengueModel_HostSecondaryDiseaseDeathRate43();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Recovery Rate12</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE12 = eINSTANCE.getDengueModel_HostSecondaryRecoveryRate12();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Recovery Rate13</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE13 = eINSTANCE.getDengueModel_HostSecondaryRecoveryRate13();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Recovery Rate14</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE14 = eINSTANCE.getDengueModel_HostSecondaryRecoveryRate14();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Recovery Rate21</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE21 = eINSTANCE.getDengueModel_HostSecondaryRecoveryRate21();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Recovery Rate23</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE23 = eINSTANCE.getDengueModel_HostSecondaryRecoveryRate23();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Recovery Rate24</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE24 = eINSTANCE.getDengueModel_HostSecondaryRecoveryRate24();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Recovery Rate31</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE31 = eINSTANCE.getDengueModel_HostSecondaryRecoveryRate31();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Recovery Rate32</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE32 = eINSTANCE.getDengueModel_HostSecondaryRecoveryRate32();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Recovery Rate34</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE34 = eINSTANCE.getDengueModel_HostSecondaryRecoveryRate34();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Recovery Rate41</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE41 = eINSTANCE.getDengueModel_HostSecondaryRecoveryRate41();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Recovery Rate42</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE42 = eINSTANCE.getDengueModel_HostSecondaryRecoveryRate42();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Recovery Rate43</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE43 = eINSTANCE.getDengueModel_HostSecondaryRecoveryRate43();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Incubation Rate12</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE12 = eINSTANCE.getDengueModel_HostSecondaryIncubationRate12();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Incubation Rate13</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE13 = eINSTANCE.getDengueModel_HostSecondaryIncubationRate13();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Incubation Rate14</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE14 = eINSTANCE.getDengueModel_HostSecondaryIncubationRate14();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Incubation Rate21</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE21 = eINSTANCE.getDengueModel_HostSecondaryIncubationRate21();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Incubation Rate23</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE23 = eINSTANCE.getDengueModel_HostSecondaryIncubationRate23();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Incubation Rate24</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE24 = eINSTANCE.getDengueModel_HostSecondaryIncubationRate24();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Incubation Rate31</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE31 = eINSTANCE.getDengueModel_HostSecondaryIncubationRate31();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Incubation Rate32</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE32 = eINSTANCE.getDengueModel_HostSecondaryIncubationRate32();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Incubation Rate34</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE34 = eINSTANCE.getDengueModel_HostSecondaryIncubationRate34();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Incubation Rate41</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE41 = eINSTANCE.getDengueModel_HostSecondaryIncubationRate41();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Incubation Rate42</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE42 = eINSTANCE.getDengueModel_HostSecondaryIncubationRate42();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Incubation Rate43</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE43 = eINSTANCE.getDengueModel_HostSecondaryIncubationRate43();
		/**
		 * The meta object literal for the '<em><b>Vector Infectivity1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__VECTOR_INFECTIVITY1 = eINSTANCE.getDengueModel_VectorInfectivity1();
		/**
		 * The meta object literal for the '<em><b>Vector Infectivity2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__VECTOR_INFECTIVITY2 = eINSTANCE.getDengueModel_VectorInfectivity2();
		/**
		 * The meta object literal for the '<em><b>Vector Infectivity3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__VECTOR_INFECTIVITY3 = eINSTANCE.getDengueModel_VectorInfectivity3();
		/**
		 * The meta object literal for the '<em><b>Vector Infectivity4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__VECTOR_INFECTIVITY4 = eINSTANCE.getDengueModel_VectorInfectivity4();
		/**
		 * The meta object literal for the '<em><b>Vector ADE1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__VECTOR_ADE1 = eINSTANCE.getDengueModel_VectorADE1();
		/**
		 * The meta object literal for the '<em><b>Vector ADE2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__VECTOR_ADE2 = eINSTANCE.getDengueModel_VectorADE2();
		/**
		 * The meta object literal for the '<em><b>Vector ADE3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__VECTOR_ADE3 = eINSTANCE.getDengueModel_VectorADE3();
		/**
		 * The meta object literal for the '<em><b>Vector ADE4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__VECTOR_ADE4 = eINSTANCE.getDengueModel_VectorADE4();
		/**
		 * The meta object literal for the '<em><b>Vector Incubation Rate1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__VECTOR_INCUBATION_RATE1 = eINSTANCE.getDengueModel_VectorIncubationRate1();
		/**
		 * The meta object literal for the '<em><b>Vector Incubation Rate2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__VECTOR_INCUBATION_RATE2 = eINSTANCE.getDengueModel_VectorIncubationRate2();
		/**
		 * The meta object literal for the '<em><b>Vector Incubation Rate3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__VECTOR_INCUBATION_RATE3 = eINSTANCE.getDengueModel_VectorIncubationRate3();
		/**
		 * The meta object literal for the '<em><b>Vector Incubation Rate4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__VECTOR_INCUBATION_RATE4 = eINSTANCE.getDengueModel_VectorIncubationRate4();
		/**
		 * The meta object literal for the '<em><b>Episilon1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__EPISILON1 = eINSTANCE.getDengueModel_Episilon1();
		/**
		 * The meta object literal for the '<em><b>Episilon2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__EPISILON2 = eINSTANCE.getDengueModel_Episilon2();
		/**
		 * The meta object literal for the '<em><b>Episilon3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__EPISILON3 = eINSTANCE.getDengueModel_Episilon3();
		/**
		 * The meta object literal for the '<em><b>Episilon4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL__EPISILON4 = eINSTANCE.getDengueModel_Episilon4();
		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelImpl <em>Simple Dengue Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelImpl
		 * @see org.eclipse.stem.diseasemodels.vector.impl.VectorPackageImpl#getSimpleDengueModel()
		 * @generated
		 */
		EClass SIMPLE_DENGUE_MODEL = eINSTANCE.getSimpleDengueModel();
		/**
		 * The meta object literal for the '<em><b>Host Transmission Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL__HOST_TRANSMISSION_RATE = eINSTANCE.getSimpleDengueModel_HostTransmissionRate();
		/**
		 * The meta object literal for the '<em><b>Ade Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL__ADE_FACTOR = eINSTANCE.getSimpleDengueModel_AdeFactor();
		/**
		 * The meta object literal for the '<em><b>Host Immunity Loss Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL__HOST_IMMUNITY_LOSS_RATE = eINSTANCE.getSimpleDengueModel_HostImmunityLossRate();
		/**
		 * The meta object literal for the '<em><b>Host Primary Death Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL__HOST_PRIMARY_DEATH_RATE = eINSTANCE.getSimpleDengueModel_HostPrimaryDeathRate();
		/**
		 * The meta object literal for the '<em><b>Host Recovery Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL__HOST_RECOVERY_RATE = eINSTANCE.getSimpleDengueModel_HostRecoveryRate();
		/**
		 * The meta object literal for the '<em><b>Host Secondary Death Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL__HOST_SECONDARY_DEATH_RATE = eINSTANCE.getSimpleDengueModel_HostSecondaryDeathRate();
		/**
		 * The meta object literal for the '<em><b>Vector Incubation Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL__VECTOR_INCUBATION_RATE = eINSTANCE.getSimpleDengueModel_VectorIncubationRate();
		/**
		 * The meta object literal for the '<em><b>Vector Transmission Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL__VECTOR_TRANSMISSION_RATE = eINSTANCE.getSimpleDengueModel_VectorTransmissionRate();
		/**
		 * The meta object literal for the '<em><b>Immunity Strength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL__IMMUNITY_STRENGTH = eINSTANCE.getSimpleDengueModel_ImmunityStrength();
		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.vector.impl.VerySimpleDengueModelImpl <em>Very Simple Dengue Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.vector.impl.VerySimpleDengueModelImpl
		 * @see org.eclipse.stem.diseasemodels.vector.impl.VectorPackageImpl#getVerySimpleDengueModel()
		 * @generated
		 */
		EClass VERY_SIMPLE_DENGUE_MODEL = eINSTANCE.getVerySimpleDengueModel();
		/**
		 * The meta object literal for the '<em><b>Transmission Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERY_SIMPLE_DENGUE_MODEL__TRANSMISSION_RATE = eINSTANCE.getVerySimpleDengueModel_TransmissionRate();
		/**
		 * The meta object literal for the '<em><b>Recovery Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERY_SIMPLE_DENGUE_MODEL__RECOVERY_RATE = eINSTANCE.getVerySimpleDengueModel_RecoveryRate();
		/**
		 * The meta object literal for the '<em><b>Immunity Loss Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERY_SIMPLE_DENGUE_MODEL__IMMUNITY_LOSS_RATE = eINSTANCE.getVerySimpleDengueModel_ImmunityLossRate();
		/**
		 * The meta object literal for the '<em><b>Ade Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERY_SIMPLE_DENGUE_MODEL__ADE_FACTOR = eINSTANCE.getVerySimpleDengueModel_AdeFactor();
		/**
		 * The meta object literal for the '<em><b>Immunity Strength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERY_SIMPLE_DENGUE_MODEL__IMMUNITY_STRENGTH = eINSTANCE.getVerySimpleDengueModel_ImmunityStrength();
		/**
		 * The meta object literal for the '<em><b>Primary Death Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERY_SIMPLE_DENGUE_MODEL__PRIMARY_DEATH_RATE = eINSTANCE.getVerySimpleDengueModel_PrimaryDeathRate();
		/**
		 * The meta object literal for the '<em><b>Secondary Death Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERY_SIMPLE_DENGUE_MODEL__SECONDARY_DEATH_RATE = eINSTANCE.getVerySimpleDengueModel_SecondaryDeathRate();
		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelHostLabelImpl <em>Dengue Model Host Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.vector.impl.DengueModelHostLabelImpl
		 * @see org.eclipse.stem.diseasemodels.vector.impl.VectorPackageImpl#getDengueModelHostLabel()
		 * @generated
		 */
		EClass DENGUE_MODEL_HOST_LABEL = eINSTANCE.getDengueModelHostLabel();
		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelHostLabelValueImpl <em>Dengue Model Host Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.vector.impl.DengueModelHostLabelValueImpl
		 * @see org.eclipse.stem.diseasemodels.vector.impl.VectorPackageImpl#getDengueModelHostLabelValue()
		 * @generated
		 */
		EClass DENGUE_MODEL_HOST_LABEL_VALUE = eINSTANCE.getDengueModelHostLabelValue();
		/**
		 * The meta object literal for the '<em><b>E1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL_HOST_LABEL_VALUE__E1 = eINSTANCE.getDengueModelHostLabelValue_E1();
		/**
		 * The meta object literal for the '<em><b>E2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL_HOST_LABEL_VALUE__E2 = eINSTANCE.getDengueModelHostLabelValue_E2();
		/**
		 * The meta object literal for the '<em><b>E3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL_HOST_LABEL_VALUE__E3 = eINSTANCE.getDengueModelHostLabelValue_E3();
		/**
		 * The meta object literal for the '<em><b>E4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL_HOST_LABEL_VALUE__E4 = eINSTANCE.getDengueModelHostLabelValue_E4();
		/**
		 * The meta object literal for the '<em><b>E12</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL_HOST_LABEL_VALUE__E12 = eINSTANCE.getDengueModelHostLabelValue_E12();
		/**
		 * The meta object literal for the '<em><b>E13</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL_HOST_LABEL_VALUE__E13 = eINSTANCE.getDengueModelHostLabelValue_E13();
		/**
		 * The meta object literal for the '<em><b>E14</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL_HOST_LABEL_VALUE__E14 = eINSTANCE.getDengueModelHostLabelValue_E14();
		/**
		 * The meta object literal for the '<em><b>E21</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL_HOST_LABEL_VALUE__E21 = eINSTANCE.getDengueModelHostLabelValue_E21();
		/**
		 * The meta object literal for the '<em><b>E23</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL_HOST_LABEL_VALUE__E23 = eINSTANCE.getDengueModelHostLabelValue_E23();
		/**
		 * The meta object literal for the '<em><b>E24</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL_HOST_LABEL_VALUE__E24 = eINSTANCE.getDengueModelHostLabelValue_E24();
		/**
		 * The meta object literal for the '<em><b>E31</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL_HOST_LABEL_VALUE__E31 = eINSTANCE.getDengueModelHostLabelValue_E31();
		/**
		 * The meta object literal for the '<em><b>E32</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL_HOST_LABEL_VALUE__E32 = eINSTANCE.getDengueModelHostLabelValue_E32();
		/**
		 * The meta object literal for the '<em><b>E34</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL_HOST_LABEL_VALUE__E34 = eINSTANCE.getDengueModelHostLabelValue_E34();
		/**
		 * The meta object literal for the '<em><b>E41</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL_HOST_LABEL_VALUE__E41 = eINSTANCE.getDengueModelHostLabelValue_E41();
		/**
		 * The meta object literal for the '<em><b>E42</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL_HOST_LABEL_VALUE__E42 = eINSTANCE.getDengueModelHostLabelValue_E42();
		/**
		 * The meta object literal for the '<em><b>E43</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL_HOST_LABEL_VALUE__E43 = eINSTANCE.getDengueModelHostLabelValue_E43();
		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelVectorLabelImpl <em>Dengue Model Vector Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.vector.impl.DengueModelVectorLabelImpl
		 * @see org.eclipse.stem.diseasemodels.vector.impl.VectorPackageImpl#getDengueModelVectorLabel()
		 * @generated
		 */
		EClass DENGUE_MODEL_VECTOR_LABEL = eINSTANCE.getDengueModelVectorLabel();
		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelVectorLabelValueImpl <em>Dengue Model Vector Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.vector.impl.DengueModelVectorLabelValueImpl
		 * @see org.eclipse.stem.diseasemodels.vector.impl.VectorPackageImpl#getDengueModelVectorLabelValue()
		 * @generated
		 */
		EClass DENGUE_MODEL_VECTOR_LABEL_VALUE = eINSTANCE.getDengueModelVectorLabelValue();
		/**
		 * The meta object literal for the '<em><b>E1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL_VECTOR_LABEL_VALUE__E1 = eINSTANCE.getDengueModelVectorLabelValue_E1();
		/**
		 * The meta object literal for the '<em><b>E2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL_VECTOR_LABEL_VALUE__E2 = eINSTANCE.getDengueModelVectorLabelValue_E2();
		/**
		 * The meta object literal for the '<em><b>E3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL_VECTOR_LABEL_VALUE__E3 = eINSTANCE.getDengueModelVectorLabelValue_E3();
		/**
		 * The meta object literal for the '<em><b>E4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL_VECTOR_LABEL_VALUE__E4 = eINSTANCE.getDengueModelVectorLabelValue_E4();
		/**
		 * The meta object literal for the '<em><b>I1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL_VECTOR_LABEL_VALUE__I1 = eINSTANCE.getDengueModelVectorLabelValue_I1();
		/**
		 * The meta object literal for the '<em><b>I2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL_VECTOR_LABEL_VALUE__I2 = eINSTANCE.getDengueModelVectorLabelValue_I2();
		/**
		 * The meta object literal for the '<em><b>I3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL_VECTOR_LABEL_VALUE__I3 = eINSTANCE.getDengueModelVectorLabelValue_I3();
		/**
		 * The meta object literal for the '<em><b>I4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL_VECTOR_LABEL_VALUE__I4 = eINSTANCE.getDengueModelVectorLabelValue_I4();
		/**
		 * The meta object literal for the '<em><b>Incidence1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE1 = eINSTANCE.getDengueModelVectorLabelValue_Incidence1();
		/**
		 * The meta object literal for the '<em><b>Incidence2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE2 = eINSTANCE.getDengueModelVectorLabelValue_Incidence2();
		/**
		 * The meta object literal for the '<em><b>Incidence3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE3 = eINSTANCE.getDengueModelVectorLabelValue_Incidence3();
		/**
		 * The meta object literal for the '<em><b>Incidence4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE4 = eINSTANCE.getDengueModelVectorLabelValue_Incidence4();
		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.vector.impl.AbstractDengueModelImpl <em>Abstract Dengue Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.vector.impl.AbstractDengueModelImpl
		 * @see org.eclipse.stem.diseasemodels.vector.impl.VectorPackageImpl#getAbstractDengueModel()
		 * @generated
		 */
		EClass ABSTRACT_DENGUE_MODEL = eINSTANCE.getAbstractDengueModel();
		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelImpl <em>Simple Dengue Model Host Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelImpl
		 * @see org.eclipse.stem.diseasemodels.vector.impl.VectorPackageImpl#getSimpleDengueModelHostLabel()
		 * @generated
		 */
		EClass SIMPLE_DENGUE_MODEL_HOST_LABEL = eINSTANCE.getSimpleDengueModelHostLabel();
		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl <em>Simple Dengue Model Host Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl
		 * @see org.eclipse.stem.diseasemodels.vector.impl.VectorPackageImpl#getSimpleDengueModelHostLabelValue()
		 * @generated
		 */
		EClass SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE = eINSTANCE.getSimpleDengueModelHostLabelValue();
		/**
		 * The meta object literal for the '<em><b>I1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I1 = eINSTANCE.getSimpleDengueModelHostLabelValue_I1();
		/**
		 * The meta object literal for the '<em><b>I2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I2 = eINSTANCE.getSimpleDengueModelHostLabelValue_I2();
		/**
		 * The meta object literal for the '<em><b>I3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I3 = eINSTANCE.getSimpleDengueModelHostLabelValue_I3();
		/**
		 * The meta object literal for the '<em><b>I4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I4 = eINSTANCE.getSimpleDengueModelHostLabelValue_I4();
		/**
		 * The meta object literal for the '<em><b>C1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C1 = eINSTANCE.getSimpleDengueModelHostLabelValue_C1();
		/**
		 * The meta object literal for the '<em><b>C2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C2 = eINSTANCE.getSimpleDengueModelHostLabelValue_C2();
		/**
		 * The meta object literal for the '<em><b>C3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C3 = eINSTANCE.getSimpleDengueModelHostLabelValue_C3();
		/**
		 * The meta object literal for the '<em><b>C4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C4 = eINSTANCE.getSimpleDengueModelHostLabelValue_C4();
		/**
		 * The meta object literal for the '<em><b>R1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R1 = eINSTANCE.getSimpleDengueModelHostLabelValue_R1();
		/**
		 * The meta object literal for the '<em><b>R2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R2 = eINSTANCE.getSimpleDengueModelHostLabelValue_R2();
		/**
		 * The meta object literal for the '<em><b>R3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R3 = eINSTANCE.getSimpleDengueModelHostLabelValue_R3();
		/**
		 * The meta object literal for the '<em><b>R4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R4 = eINSTANCE.getSimpleDengueModelHostLabelValue_R4();
		/**
		 * The meta object literal for the '<em><b>I12</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I12 = eINSTANCE.getSimpleDengueModelHostLabelValue_I12();
		/**
		 * The meta object literal for the '<em><b>I13</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I13 = eINSTANCE.getSimpleDengueModelHostLabelValue_I13();
		/**
		 * The meta object literal for the '<em><b>I14</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I14 = eINSTANCE.getSimpleDengueModelHostLabelValue_I14();
		/**
		 * The meta object literal for the '<em><b>I21</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I21 = eINSTANCE.getSimpleDengueModelHostLabelValue_I21();
		/**
		 * The meta object literal for the '<em><b>I23</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I23 = eINSTANCE.getSimpleDengueModelHostLabelValue_I23();
		/**
		 * The meta object literal for the '<em><b>I24</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I24 = eINSTANCE.getSimpleDengueModelHostLabelValue_I24();
		/**
		 * The meta object literal for the '<em><b>I31</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I31 = eINSTANCE.getSimpleDengueModelHostLabelValue_I31();
		/**
		 * The meta object literal for the '<em><b>I32</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I32 = eINSTANCE.getSimpleDengueModelHostLabelValue_I32();
		/**
		 * The meta object literal for the '<em><b>I34</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I34 = eINSTANCE.getSimpleDengueModelHostLabelValue_I34();
		/**
		 * The meta object literal for the '<em><b>I41</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I41 = eINSTANCE.getSimpleDengueModelHostLabelValue_I41();
		/**
		 * The meta object literal for the '<em><b>I42</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I42 = eINSTANCE.getSimpleDengueModelHostLabelValue_I42();
		/**
		 * The meta object literal for the '<em><b>I43</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I43 = eINSTANCE.getSimpleDengueModelHostLabelValue_I43();
		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R = eINSTANCE.getSimpleDengueModelHostLabelValue_R();
		/**
		 * The meta object literal for the '<em><b>Incidence1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE1 = eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence1();
		/**
		 * The meta object literal for the '<em><b>Incidence2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE2 = eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence2();
		/**
		 * The meta object literal for the '<em><b>Incidence3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE3 = eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence3();
		/**
		 * The meta object literal for the '<em><b>Incidence4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE4 = eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence4();
		/**
		 * The meta object literal for the '<em><b>Incidence12</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE12 = eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence12();
		/**
		 * The meta object literal for the '<em><b>Incidence21</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE21 = eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence21();
		/**
		 * The meta object literal for the '<em><b>Incidence31</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE31 = eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence31();
		/**
		 * The meta object literal for the '<em><b>Incidence41</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE41 = eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence41();
		/**
		 * The meta object literal for the '<em><b>Incidence13</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE13 = eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence13();
		/**
		 * The meta object literal for the '<em><b>Incidence23</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE23 = eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence23();
		/**
		 * The meta object literal for the '<em><b>Incidence32</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE32 = eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence32();
		/**
		 * The meta object literal for the '<em><b>Incidence42</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE42 = eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence42();
		/**
		 * The meta object literal for the '<em><b>Incidence14</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE14 = eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence14();
		/**
		 * The meta object literal for the '<em><b>Incidence24</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE24 = eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence24();
		/**
		 * The meta object literal for the '<em><b>Incidence34</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE34 = eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence34();
		/**
		 * The meta object literal for the '<em><b>Incidence43</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE43 = eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence43();
		/**
		 * The meta object literal for the '<em><b>Disease Deaths1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS1 = eINSTANCE.getSimpleDengueModelHostLabelValue_DiseaseDeaths1();
		/**
		 * The meta object literal for the '<em><b>Disease Deaths2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS2 = eINSTANCE.getSimpleDengueModelHostLabelValue_DiseaseDeaths2();
		/**
		 * The meta object literal for the '<em><b>Disease Deaths3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS3 = eINSTANCE.getSimpleDengueModelHostLabelValue_DiseaseDeaths3();
		/**
		 * The meta object literal for the '<em><b>Disease Deaths4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS4 = eINSTANCE.getSimpleDengueModelHostLabelValue_DiseaseDeaths4();
		/**
		 * The meta object literal for the '<em><b>Disease Deaths12</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS12 = eINSTANCE.getSimpleDengueModelHostLabelValue_DiseaseDeaths12();
		/**
		 * The meta object literal for the '<em><b>Disease Deaths21</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS21 = eINSTANCE.getSimpleDengueModelHostLabelValue_DiseaseDeaths21();
		/**
		 * The meta object literal for the '<em><b>Disease Deaths31</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS31 = eINSTANCE.getSimpleDengueModelHostLabelValue_DiseaseDeaths31();
		/**
		 * The meta object literal for the '<em><b>Disease Deaths41</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS41 = eINSTANCE.getSimpleDengueModelHostLabelValue_DiseaseDeaths41();
		/**
		 * The meta object literal for the '<em><b>Disease Deaths13</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS13 = eINSTANCE.getSimpleDengueModelHostLabelValue_DiseaseDeaths13();
		/**
		 * The meta object literal for the '<em><b>Disease Deaths23</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS23 = eINSTANCE.getSimpleDengueModelHostLabelValue_DiseaseDeaths23();
		/**
		 * The meta object literal for the '<em><b>Disease Deaths32</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS32 = eINSTANCE.getSimpleDengueModelHostLabelValue_DiseaseDeaths32();
		/**
		 * The meta object literal for the '<em><b>Disease Deaths42</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS42 = eINSTANCE.getSimpleDengueModelHostLabelValue_DiseaseDeaths42();
		/**
		 * The meta object literal for the '<em><b>Disease Deaths14</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS14 = eINSTANCE.getSimpleDengueModelHostLabelValue_DiseaseDeaths14();
		/**
		 * The meta object literal for the '<em><b>Disease Deaths24</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS24 = eINSTANCE.getSimpleDengueModelHostLabelValue_DiseaseDeaths24();
		/**
		 * The meta object literal for the '<em><b>Disease Deaths34</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS34 = eINSTANCE.getSimpleDengueModelHostLabelValue_DiseaseDeaths34();
		/**
		 * The meta object literal for the '<em><b>Disease Deaths43</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS43 = eINSTANCE.getSimpleDengueModelHostLabelValue_DiseaseDeaths43();

	}

} //VectorPackage
