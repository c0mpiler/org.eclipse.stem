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
package org.eclipse.stem.foodproduction;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
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
 * @see org.eclipse.stem.foodproduction.FoodproductionFactory
 * @model kind="package"
 * @generated
 */
public interface FoodproductionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "foodproduction";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/stem/foodproduction/foodproduction.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.stem.foodproduction";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FoodproductionPackage eINSTANCE = org.eclipse.stem.foodproduction.impl.FoodproductionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.stem.foodproduction.impl.FoodTransformerImpl <em>Food Transformer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.foodproduction.impl.FoodTransformerImpl
	 * @see org.eclipse.stem.foodproduction.impl.FoodproductionPackageImpl#getFoodTransformer()
	 * @generated
	 */
	int FOOD_TRANSFORMER = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_TRANSFORMER__URI = ModelPackage.TRANSFORMATION_DECORATOR__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_TRANSFORMER__TYPE_URI = ModelPackage.TRANSFORMATION_DECORATOR__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_TRANSFORMER__DUBLIN_CORE = ModelPackage.TRANSFORMATION_DECORATOR__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_TRANSFORMER__LABELS_TO_UPDATE = ModelPackage.TRANSFORMATION_DECORATOR__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_TRANSFORMER__GRAPH = ModelPackage.TRANSFORMATION_DECORATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_TRANSFORMER__ENABLED = ModelPackage.TRANSFORMATION_DECORATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_TRANSFORMER__GRAPH_DECORATED = ModelPackage.TRANSFORMATION_DECORATOR__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_TRANSFORMER__PROGRESS = ModelPackage.TRANSFORMATION_DECORATOR__PROGRESS;

	/**
	 * The feature id for the '<em><b>Source Labels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_TRANSFORMER__SOURCE_LABELS = ModelPackage.TRANSFORMATION_DECORATOR__SOURCE_LABELS;

	/**
	 * The feature id for the '<em><b>Source Population Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_TRANSFORMER__SOURCE_POPULATION_NAME = ModelPackage.TRANSFORMATION_DECORATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Population Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_TRANSFORMER__TARGET_POPULATION_NAME = ModelPackage.TRANSFORMATION_DECORATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_TRANSFORMER__TARGET_URI = ModelPackage.TRANSFORMATION_DECORATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_TRANSFORMER__TIME_PERIOD = ModelPackage.TRANSFORMATION_DECORATOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Food Transformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_TRANSFORMER_FEATURE_COUNT = ModelPackage.TRANSFORMATION_DECORATOR_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.foodproduction.impl.FoodProducerImpl <em>Food Producer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.foodproduction.impl.FoodProducerImpl
	 * @see org.eclipse.stem.foodproduction.impl.FoodproductionPackageImpl#getFoodProducer()
	 * @generated
	 */
	int FOOD_PRODUCER = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_PRODUCER__URI = FOOD_TRANSFORMER__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_PRODUCER__TYPE_URI = FOOD_TRANSFORMER__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_PRODUCER__DUBLIN_CORE = FOOD_TRANSFORMER__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_PRODUCER__LABELS_TO_UPDATE = FOOD_TRANSFORMER__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_PRODUCER__GRAPH = FOOD_TRANSFORMER__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_PRODUCER__ENABLED = FOOD_TRANSFORMER__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_PRODUCER__GRAPH_DECORATED = FOOD_TRANSFORMER__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_PRODUCER__PROGRESS = FOOD_TRANSFORMER__PROGRESS;

	/**
	 * The feature id for the '<em><b>Source Labels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_PRODUCER__SOURCE_LABELS = FOOD_TRANSFORMER__SOURCE_LABELS;

	/**
	 * The feature id for the '<em><b>Source Population Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_PRODUCER__SOURCE_POPULATION_NAME = FOOD_TRANSFORMER__SOURCE_POPULATION_NAME;

	/**
	 * The feature id for the '<em><b>Target Population Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_PRODUCER__TARGET_POPULATION_NAME = FOOD_TRANSFORMER__TARGET_POPULATION_NAME;

	/**
	 * The feature id for the '<em><b>Target URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_PRODUCER__TARGET_URI = FOOD_TRANSFORMER__TARGET_URI;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_PRODUCER__TIME_PERIOD = FOOD_TRANSFORMER__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Food Yield Population Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_PRODUCER__FOOD_YIELD_POPULATION_MULTIPLIER = FOOD_TRANSFORMER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Processing Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_PRODUCER__SOURCE_PROCESSING_RATE = FOOD_TRANSFORMER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Food Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_PRODUCER_FEATURE_COUNT = FOOD_TRANSFORMER_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link org.eclipse.stem.foodproduction.impl.SlaughterHouseImpl <em>Slaughter House</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.foodproduction.impl.SlaughterHouseImpl
	 * @see org.eclipse.stem.foodproduction.impl.FoodproductionPackageImpl#getSlaughterHouse()
	 * @generated
	 */
	int SLAUGHTER_HOUSE = 2;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAUGHTER_HOUSE__URI = FOOD_PRODUCER__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAUGHTER_HOUSE__TYPE_URI = FOOD_PRODUCER__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAUGHTER_HOUSE__DUBLIN_CORE = FOOD_PRODUCER__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAUGHTER_HOUSE__LABELS_TO_UPDATE = FOOD_PRODUCER__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAUGHTER_HOUSE__GRAPH = FOOD_PRODUCER__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAUGHTER_HOUSE__ENABLED = FOOD_PRODUCER__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAUGHTER_HOUSE__GRAPH_DECORATED = FOOD_PRODUCER__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAUGHTER_HOUSE__PROGRESS = FOOD_PRODUCER__PROGRESS;

	/**
	 * The feature id for the '<em><b>Source Labels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAUGHTER_HOUSE__SOURCE_LABELS = FOOD_PRODUCER__SOURCE_LABELS;

	/**
	 * The feature id for the '<em><b>Source Population Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAUGHTER_HOUSE__SOURCE_POPULATION_NAME = FOOD_PRODUCER__SOURCE_POPULATION_NAME;

	/**
	 * The feature id for the '<em><b>Target Population Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAUGHTER_HOUSE__TARGET_POPULATION_NAME = FOOD_PRODUCER__TARGET_POPULATION_NAME;

	/**
	 * The feature id for the '<em><b>Target URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAUGHTER_HOUSE__TARGET_URI = FOOD_PRODUCER__TARGET_URI;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAUGHTER_HOUSE__TIME_PERIOD = FOOD_PRODUCER__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Food Yield Population Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAUGHTER_HOUSE__FOOD_YIELD_POPULATION_MULTIPLIER = FOOD_PRODUCER__FOOD_YIELD_POPULATION_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Source Processing Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAUGHTER_HOUSE__SOURCE_PROCESSING_RATE = FOOD_PRODUCER__SOURCE_PROCESSING_RATE;

	/**
	 * The feature id for the '<em><b>Source Decorator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAUGHTER_HOUSE__SOURCE_DECORATOR = FOOD_PRODUCER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Decorator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAUGHTER_HOUSE__TARGET_DECORATOR = FOOD_PRODUCER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>State Transitions Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAUGHTER_HOUSE__STATE_TRANSITIONS_MAP = FOOD_PRODUCER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAUGHTER_HOUSE__SOURCE_ATTRIBUTES = FOOD_PRODUCER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAUGHTER_HOUSE__TARGET_ATTRIBUTES = FOOD_PRODUCER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Slaughter House</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAUGHTER_HOUSE_FEATURE_COUNT = FOOD_PRODUCER_FEATURE_COUNT + 5;


	/**
	 * The meta object id for the '{@link org.eclipse.stem.foodproduction.DiseaseCarryingTransformer <em>Disease Carrying Transformer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.foodproduction.DiseaseCarryingTransformer
	 * @see org.eclipse.stem.foodproduction.impl.FoodproductionPackageImpl#getDiseaseCarryingTransformer()
	 * @generated
	 */
	int DISEASE_CARRYING_TRANSFORMER = 3;

	/**
	 * The feature id for the '<em><b>Source Decorator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_CARRYING_TRANSFORMER__SOURCE_DECORATOR = 0;

	/**
	 * The feature id for the '<em><b>Target Decorator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_CARRYING_TRANSFORMER__TARGET_DECORATOR = 1;

	/**
	 * The feature id for the '<em><b>State Transitions Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_CARRYING_TRANSFORMER__STATE_TRANSITIONS_MAP = 2;

	/**
	 * The feature id for the '<em><b>Source Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_CARRYING_TRANSFORMER__SOURCE_ATTRIBUTES = 3;

	/**
	 * The feature id for the '<em><b>Target Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_CARRYING_TRANSFORMER__TARGET_ATTRIBUTES = 4;

	/**
	 * The number of structural features of the '<em>Disease Carrying Transformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISEASE_CARRYING_TRANSFORMER_FEATURE_COUNT = 5;


	/**
	 * The meta object id for the '{@link org.eclipse.stem.foodproduction.impl.FoodConsumerImpl <em>Food Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.foodproduction.impl.FoodConsumerImpl
	 * @see org.eclipse.stem.foodproduction.impl.FoodproductionPackageImpl#getFoodConsumer()
	 * @generated
	 */
	int FOOD_CONSUMER = 4;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_CONSUMER__URI = FOOD_TRANSFORMER__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_CONSUMER__TYPE_URI = FOOD_TRANSFORMER__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_CONSUMER__DUBLIN_CORE = FOOD_TRANSFORMER__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_CONSUMER__LABELS_TO_UPDATE = FOOD_TRANSFORMER__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_CONSUMER__GRAPH = FOOD_TRANSFORMER__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_CONSUMER__ENABLED = FOOD_TRANSFORMER__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_CONSUMER__GRAPH_DECORATED = FOOD_TRANSFORMER__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_CONSUMER__PROGRESS = FOOD_TRANSFORMER__PROGRESS;

	/**
	 * The feature id for the '<em><b>Source Labels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_CONSUMER__SOURCE_LABELS = FOOD_TRANSFORMER__SOURCE_LABELS;

	/**
	 * The feature id for the '<em><b>Source Population Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_CONSUMER__SOURCE_POPULATION_NAME = FOOD_TRANSFORMER__SOURCE_POPULATION_NAME;

	/**
	 * The feature id for the '<em><b>Target Population Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_CONSUMER__TARGET_POPULATION_NAME = FOOD_TRANSFORMER__TARGET_POPULATION_NAME;

	/**
	 * The feature id for the '<em><b>Target URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_CONSUMER__TARGET_URI = FOOD_TRANSFORMER__TARGET_URI;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_CONSUMER__TIME_PERIOD = FOOD_TRANSFORMER__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Source Decorator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_CONSUMER__SOURCE_DECORATOR = FOOD_TRANSFORMER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Decorator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_CONSUMER__TARGET_DECORATOR = FOOD_TRANSFORMER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>State Transitions Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_CONSUMER__STATE_TRANSITIONS_MAP = FOOD_TRANSFORMER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_CONSUMER__SOURCE_ATTRIBUTES = FOOD_TRANSFORMER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_CONSUMER__TARGET_ATTRIBUTES = FOOD_TRANSFORMER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Consumption Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_CONSUMER__CONSUMPTION_RATE = FOOD_TRANSFORMER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Consumption Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_CONSUMER__CONSUMPTION_TYPE = FOOD_TRANSFORMER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Waste Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_CONSUMER__WASTE_RATE = FOOD_TRANSFORMER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Max Volume Of Stocks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_CONSUMER__MAX_VOLUME_OF_STOCKS = FOOD_TRANSFORMER_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Food Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_CONSUMER_FEATURE_COUNT = FOOD_TRANSFORMER_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.foodproduction.ConsumptionType <em>Consumption Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.foodproduction.ConsumptionType
	 * @see org.eclipse.stem.foodproduction.impl.FoodproductionPackageImpl#getConsumptionType()
	 * @generated
	 */
	int CONSUMPTION_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.foodproduction.FoodTransformer <em>Food Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Food Transformer</em>'.
	 * @see org.eclipse.stem.foodproduction.FoodTransformer
	 * @generated
	 */
	EClass getFoodTransformer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.foodproduction.FoodTransformer#getSourcePopulationName <em>Source Population Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Population Name</em>'.
	 * @see org.eclipse.stem.foodproduction.FoodTransformer#getSourcePopulationName()
	 * @see #getFoodTransformer()
	 * @generated
	 */
	EAttribute getFoodTransformer_SourcePopulationName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.foodproduction.FoodTransformer#getTargetPopulationName <em>Target Population Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Population Name</em>'.
	 * @see org.eclipse.stem.foodproduction.FoodTransformer#getTargetPopulationName()
	 * @see #getFoodTransformer()
	 * @generated
	 */
	EAttribute getFoodTransformer_TargetPopulationName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.foodproduction.FoodTransformer#getTargetURI <em>Target URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target URI</em>'.
	 * @see org.eclipse.stem.foodproduction.FoodTransformer#getTargetURI()
	 * @see #getFoodTransformer()
	 * @generated
	 */
	EAttribute getFoodTransformer_TargetURI();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.foodproduction.FoodTransformer#getTimePeriod <em>Time Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Period</em>'.
	 * @see org.eclipse.stem.foodproduction.FoodTransformer#getTimePeriod()
	 * @see #getFoodTransformer()
	 * @generated
	 */
	EAttribute getFoodTransformer_TimePeriod();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.foodproduction.FoodProducer <em>Food Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Food Producer</em>'.
	 * @see org.eclipse.stem.foodproduction.FoodProducer
	 * @generated
	 */
	EClass getFoodProducer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.foodproduction.FoodProducer#getFoodYieldPopulationMultiplier <em>Food Yield Population Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Food Yield Population Multiplier</em>'.
	 * @see org.eclipse.stem.foodproduction.FoodProducer#getFoodYieldPopulationMultiplier()
	 * @see #getFoodProducer()
	 * @generated
	 */
	EAttribute getFoodProducer_FoodYieldPopulationMultiplier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.foodproduction.FoodProducer#getSourceProcessingRate <em>Source Processing Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Processing Rate</em>'.
	 * @see org.eclipse.stem.foodproduction.FoodProducer#getSourceProcessingRate()
	 * @see #getFoodProducer()
	 * @generated
	 */
	EAttribute getFoodProducer_SourceProcessingRate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.foodproduction.SlaughterHouse <em>Slaughter House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slaughter House</em>'.
	 * @see org.eclipse.stem.foodproduction.SlaughterHouse
	 * @generated
	 */
	EClass getSlaughterHouse();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.foodproduction.DiseaseCarryingTransformer <em>Disease Carrying Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disease Carrying Transformer</em>'.
	 * @see org.eclipse.stem.foodproduction.DiseaseCarryingTransformer
	 * @generated
	 */
	EClass getDiseaseCarryingTransformer();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.foodproduction.DiseaseCarryingTransformer#getSourceDecorator <em>Source Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Decorator</em>'.
	 * @see org.eclipse.stem.foodproduction.DiseaseCarryingTransformer#getSourceDecorator()
	 * @see #getDiseaseCarryingTransformer()
	 * @generated
	 */
	EReference getDiseaseCarryingTransformer_SourceDecorator();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.foodproduction.DiseaseCarryingTransformer#getTargetDecorator <em>Target Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Decorator</em>'.
	 * @see org.eclipse.stem.foodproduction.DiseaseCarryingTransformer#getTargetDecorator()
	 * @see #getDiseaseCarryingTransformer()
	 * @generated
	 */
	EReference getDiseaseCarryingTransformer_TargetDecorator();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.stem.foodproduction.DiseaseCarryingTransformer#getStateTransitionsMap <em>State Transitions Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State Transitions Map</em>'.
	 * @see org.eclipse.stem.foodproduction.DiseaseCarryingTransformer#getStateTransitionsMap()
	 * @see #getDiseaseCarryingTransformer()
	 * @generated
	 */
	EReference getDiseaseCarryingTransformer_StateTransitionsMap();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.stem.foodproduction.DiseaseCarryingTransformer#getSourceAttributes <em>Source Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Attributes</em>'.
	 * @see org.eclipse.stem.foodproduction.DiseaseCarryingTransformer#getSourceAttributes()
	 * @see #getDiseaseCarryingTransformer()
	 * @generated
	 */
	EReference getDiseaseCarryingTransformer_SourceAttributes();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.stem.foodproduction.DiseaseCarryingTransformer#getTargetAttributes <em>Target Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Attributes</em>'.
	 * @see org.eclipse.stem.foodproduction.DiseaseCarryingTransformer#getTargetAttributes()
	 * @see #getDiseaseCarryingTransformer()
	 * @generated
	 */
	EReference getDiseaseCarryingTransformer_TargetAttributes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.foodproduction.FoodConsumer <em>Food Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Food Consumer</em>'.
	 * @see org.eclipse.stem.foodproduction.FoodConsumer
	 * @generated
	 */
	EClass getFoodConsumer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.foodproduction.FoodConsumer#getConsumptionRate <em>Consumption Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumption Rate</em>'.
	 * @see org.eclipse.stem.foodproduction.FoodConsumer#getConsumptionRate()
	 * @see #getFoodConsumer()
	 * @generated
	 */
	EAttribute getFoodConsumer_ConsumptionRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.foodproduction.FoodConsumer#getConsumptionType <em>Consumption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumption Type</em>'.
	 * @see org.eclipse.stem.foodproduction.FoodConsumer#getConsumptionType()
	 * @see #getFoodConsumer()
	 * @generated
	 */
	EAttribute getFoodConsumer_ConsumptionType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.foodproduction.FoodConsumer#getWasteRate <em>Waste Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Waste Rate</em>'.
	 * @see org.eclipse.stem.foodproduction.FoodConsumer#getWasteRate()
	 * @see #getFoodConsumer()
	 * @generated
	 */
	EAttribute getFoodConsumer_WasteRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.foodproduction.FoodConsumer#getMaxVolumeOfStocks <em>Max Volume Of Stocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Volume Of Stocks</em>'.
	 * @see org.eclipse.stem.foodproduction.FoodConsumer#getMaxVolumeOfStocks()
	 * @see #getFoodConsumer()
	 * @generated
	 */
	EAttribute getFoodConsumer_MaxVolumeOfStocks();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.stem.foodproduction.ConsumptionType <em>Consumption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Consumption Type</em>'.
	 * @see org.eclipse.stem.foodproduction.ConsumptionType
	 * @generated
	 */
	EEnum getConsumptionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FoodproductionFactory getFoodproductionFactory();

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
		 * The meta object literal for the '{@link org.eclipse.stem.foodproduction.impl.FoodTransformerImpl <em>Food Transformer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.foodproduction.impl.FoodTransformerImpl
		 * @see org.eclipse.stem.foodproduction.impl.FoodproductionPackageImpl#getFoodTransformer()
		 * @generated
		 */
		EClass FOOD_TRANSFORMER = eINSTANCE.getFoodTransformer();

		/**
		 * The meta object literal for the '<em><b>Source Population Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOD_TRANSFORMER__SOURCE_POPULATION_NAME = eINSTANCE.getFoodTransformer_SourcePopulationName();

		/**
		 * The meta object literal for the '<em><b>Target Population Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOD_TRANSFORMER__TARGET_POPULATION_NAME = eINSTANCE.getFoodTransformer_TargetPopulationName();

		/**
		 * The meta object literal for the '<em><b>Target URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOD_TRANSFORMER__TARGET_URI = eINSTANCE.getFoodTransformer_TargetURI();

		/**
		 * The meta object literal for the '<em><b>Time Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOD_TRANSFORMER__TIME_PERIOD = eINSTANCE.getFoodTransformer_TimePeriod();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.foodproduction.impl.FoodProducerImpl <em>Food Producer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.foodproduction.impl.FoodProducerImpl
		 * @see org.eclipse.stem.foodproduction.impl.FoodproductionPackageImpl#getFoodProducer()
		 * @generated
		 */
		EClass FOOD_PRODUCER = eINSTANCE.getFoodProducer();

		/**
		 * The meta object literal for the '<em><b>Food Yield Population Multiplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOD_PRODUCER__FOOD_YIELD_POPULATION_MULTIPLIER = eINSTANCE.getFoodProducer_FoodYieldPopulationMultiplier();

		/**
		 * The meta object literal for the '<em><b>Source Processing Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOD_PRODUCER__SOURCE_PROCESSING_RATE = eINSTANCE.getFoodProducer_SourceProcessingRate();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.foodproduction.impl.SlaughterHouseImpl <em>Slaughter House</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.foodproduction.impl.SlaughterHouseImpl
		 * @see org.eclipse.stem.foodproduction.impl.FoodproductionPackageImpl#getSlaughterHouse()
		 * @generated
		 */
		EClass SLAUGHTER_HOUSE = eINSTANCE.getSlaughterHouse();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.foodproduction.DiseaseCarryingTransformer <em>Disease Carrying Transformer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.foodproduction.DiseaseCarryingTransformer
		 * @see org.eclipse.stem.foodproduction.impl.FoodproductionPackageImpl#getDiseaseCarryingTransformer()
		 * @generated
		 */
		EClass DISEASE_CARRYING_TRANSFORMER = eINSTANCE.getDiseaseCarryingTransformer();

		/**
		 * The meta object literal for the '<em><b>Source Decorator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISEASE_CARRYING_TRANSFORMER__SOURCE_DECORATOR = eINSTANCE.getDiseaseCarryingTransformer_SourceDecorator();

		/**
		 * The meta object literal for the '<em><b>Target Decorator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISEASE_CARRYING_TRANSFORMER__TARGET_DECORATOR = eINSTANCE.getDiseaseCarryingTransformer_TargetDecorator();

		/**
		 * The meta object literal for the '<em><b>State Transitions Map</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISEASE_CARRYING_TRANSFORMER__STATE_TRANSITIONS_MAP = eINSTANCE.getDiseaseCarryingTransformer_StateTransitionsMap();

		/**
		 * The meta object literal for the '<em><b>Source Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISEASE_CARRYING_TRANSFORMER__SOURCE_ATTRIBUTES = eINSTANCE.getDiseaseCarryingTransformer_SourceAttributes();

		/**
		 * The meta object literal for the '<em><b>Target Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISEASE_CARRYING_TRANSFORMER__TARGET_ATTRIBUTES = eINSTANCE.getDiseaseCarryingTransformer_TargetAttributes();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.foodproduction.impl.FoodConsumerImpl <em>Food Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.foodproduction.impl.FoodConsumerImpl
		 * @see org.eclipse.stem.foodproduction.impl.FoodproductionPackageImpl#getFoodConsumer()
		 * @generated
		 */
		EClass FOOD_CONSUMER = eINSTANCE.getFoodConsumer();

		/**
		 * The meta object literal for the '<em><b>Consumption Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOD_CONSUMER__CONSUMPTION_RATE = eINSTANCE.getFoodConsumer_ConsumptionRate();

		/**
		 * The meta object literal for the '<em><b>Consumption Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOD_CONSUMER__CONSUMPTION_TYPE = eINSTANCE.getFoodConsumer_ConsumptionType();

		/**
		 * The meta object literal for the '<em><b>Waste Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOD_CONSUMER__WASTE_RATE = eINSTANCE.getFoodConsumer_WasteRate();

		/**
		 * The meta object literal for the '<em><b>Max Volume Of Stocks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOD_CONSUMER__MAX_VOLUME_OF_STOCKS = eINSTANCE.getFoodConsumer_MaxVolumeOfStocks();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.foodproduction.ConsumptionType <em>Consumption Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.foodproduction.ConsumptionType
		 * @see org.eclipse.stem.foodproduction.impl.FoodproductionPackageImpl#getConsumptionType()
		 * @generated
		 */
		EEnum CONSUMPTION_TYPE = eINSTANCE.getConsumptionType();

	}

} //FoodproductionPackage
