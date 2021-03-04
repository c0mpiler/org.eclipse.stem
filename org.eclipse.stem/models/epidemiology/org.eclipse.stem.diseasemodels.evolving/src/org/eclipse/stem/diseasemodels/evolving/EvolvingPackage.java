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
package org.eclipse.stem.diseasemodels.evolving;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.stem.core.model.ModelPackage;
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
 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingFactory
 * @model kind="package"
 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
 *        annotation="http:///org/eclipse/stem/modelgen/metamodel uri='platform:/resource/org.eclipse.stem.diseasemodels.evolving/model/evolving.metamodel'"
 * @generated
 */
public interface EvolvingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "evolving";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/stem/diseasemodels/evolving/evolving.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.stem.diseasemodels.evolving";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EvolvingPackage eINSTANCE = org.eclipse.stem.diseasemodels.evolving.impl.EvolvingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingDiseaseTransformerImpl <em>Disease Transformer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingDiseaseTransformerImpl
	 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingPackageImpl#getEvolvingDiseaseTransformer()
	 * @generated
	 */
	int EVOLVING_DISEASE_TRANSFORMER = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_DISEASE_TRANSFORMER__URI = ModelPackage.TRANSFORMATION_DECORATOR__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_DISEASE_TRANSFORMER__TYPE_URI = ModelPackage.TRANSFORMATION_DECORATOR__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_DISEASE_TRANSFORMER__DUBLIN_CORE = ModelPackage.TRANSFORMATION_DECORATOR__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_DISEASE_TRANSFORMER__LABELS_TO_UPDATE = ModelPackage.TRANSFORMATION_DECORATOR__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_DISEASE_TRANSFORMER__GRAPH = ModelPackage.TRANSFORMATION_DECORATOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_DISEASE_TRANSFORMER__ENABLED = ModelPackage.TRANSFORMATION_DECORATOR__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_DISEASE_TRANSFORMER__GRAPH_DECORATED = ModelPackage.TRANSFORMATION_DECORATOR__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_DISEASE_TRANSFORMER__PROGRESS = ModelPackage.TRANSFORMATION_DECORATOR__PROGRESS;

	/**
	 * The feature id for the '<em><b>Source Labels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_DISEASE_TRANSFORMER__SOURCE_LABELS = ModelPackage.TRANSFORMATION_DECORATOR__SOURCE_LABELS;

	/**
	 * The feature id for the '<em><b>Base Disease</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_DISEASE_TRANSFORMER__BASE_DISEASE = ModelPackage.TRANSFORMATION_DECORATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Evolved Diseases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_DISEASE_TRANSFORMER__EVOLVED_DISEASES = ModelPackage.TRANSFORMATION_DECORATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Evolution Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_DISEASE_TRANSFORMER__EVOLUTION_COUNT = ModelPackage.TRANSFORMATION_DECORATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Evolution Count Hard Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_DISEASE_TRANSFORMER__EVOLUTION_COUNT_HARD_LIMIT = ModelPackage.TRANSFORMATION_DECORATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Stop All Evolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_DISEASE_TRANSFORMER__STOP_ALL_EVOLUTION = ModelPackage.TRANSFORMATION_DECORATOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Disease Transformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_DISEASE_TRANSFORMER_FEATURE_COUNT = ModelPackage.TRANSFORMATION_DECORATOR_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseModel <em>Disease Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseModel
	 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingPackageImpl#getEvolvingDiseaseModel()
	 * @generated
	 */
	int EVOLVING_DISEASE_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Parent Disease</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_DISEASE_MODEL__PARENT_DISEASE = 0;

	/**
	 * The feature id for the '<em><b>Transformer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_DISEASE_MODEL__TRANSFORMER = 1;

	/**
	 * The feature id for the '<em><b>Evolved At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_DISEASE_MODEL__EVOLVED_AT = 2;

	/**
	 * The feature id for the '<em><b>Genome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_DISEASE_MODEL__GENOME = 3;

	/**
	 * The feature id for the '<em><b>Evolution Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_DISEASE_MODEL__EVOLUTION_COUNT = 4;

	/**
	 * The number of structural features of the '<em>Disease Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_DISEASE_MODEL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIDiseaseModelLabelImpl <em>SI Disease Model Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIDiseaseModelLabelImpl
	 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingPackageImpl#getEvolvingSIDiseaseModelLabel()
	 * @generated
	 */
	int EVOLVING_SI_DISEASE_MODEL_LABEL = 2;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL_LABEL__URI = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL_LABEL__TYPE_URI = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL_LABEL__DUBLIN_CORE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>URI Of Identifiable To Be Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL_LABEL__CURRENT_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Identifiable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL_LABEL__IDENTIFIABLE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__IDENTIFIABLE;

	/**
	 * The feature id for the '<em><b>Next Value Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL_LABEL__NEXT_VALUE_VALID = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NEXT_VALUE_VALID;

	/**
	 * The feature id for the '<em><b>Next Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL_LABEL__NEXT_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NEXT_VALUE;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL_LABEL__DECORATOR = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DECORATOR;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL_LABEL__NODE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NODE;

	/**
	 * The feature id for the '<em><b>Delta Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL_LABEL__DELTA_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DELTA_VALUE;

	/**
	 * The feature id for the '<em><b>Temp Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL_LABEL__TEMP_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__TEMP_VALUE;

	/**
	 * The feature id for the '<em><b>Probe Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL_LABEL__PROBE_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__PROBE_VALUE;

	/**
	 * The feature id for the '<em><b>Error Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL_LABEL__ERROR_SCALE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__ERROR_SCALE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL_LABEL__IDENTIFIER = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Population Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL_LABEL__POPULATION_LABEL = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__POPULATION_LABEL;

	/**
	 * The feature id for the '<em><b>Population Model Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL_LABEL__POPULATION_MODEL_LABEL = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__POPULATION_MODEL_LABEL;

	/**
	 * The number of structural features of the '<em>SI Disease Model Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL_LABEL_FEATURE_COUNT = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIDiseaseModelLabelValueImpl <em>SI Disease Model Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIDiseaseModelLabelValueImpl
	 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingPackageImpl#getEvolvingSIDiseaseModelLabelValue()
	 * @generated
	 */
	int EVOLVING_SI_DISEASE_MODEL_LABEL_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Arrivals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL_LABEL_VALUE__ARRIVALS = StandardPackage.SI_LABEL_VALUE__ARRIVALS;

	/**
	 * The feature id for the '<em><b>Departures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL_LABEL_VALUE__DEPARTURES = StandardPackage.SI_LABEL_VALUE__DEPARTURES;

	/**
	 * The feature id for the '<em><b>Population Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL_LABEL_VALUE__POPULATION_COUNT = StandardPackage.SI_LABEL_VALUE__POPULATION_COUNT;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL_LABEL_VALUE__S = StandardPackage.SI_LABEL_VALUE__S;

	/**
	 * The feature id for the '<em><b>Incidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL_LABEL_VALUE__INCIDENCE = StandardPackage.SI_LABEL_VALUE__INCIDENCE;

	/**
	 * The feature id for the '<em><b>Disease Deaths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL_LABEL_VALUE__DISEASE_DEATHS = StandardPackage.SI_LABEL_VALUE__DISEASE_DEATHS;

	/**
	 * The feature id for the '<em><b>I</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL_LABEL_VALUE__I = StandardPackage.SI_LABEL_VALUE__I;

	/**
	 * The number of structural features of the '<em>SI Disease Model Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT = StandardPackage.SI_LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIDiseaseModelImpl <em>SI Disease Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIDiseaseModelImpl
	 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingPackageImpl#getEvolvingSIDiseaseModel()
	 * @generated
	 */
	int EVOLVING_SI_DISEASE_MODEL = 4;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL__URI = StandardPackage.SI__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL__TYPE_URI = StandardPackage.SI__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL__DUBLIN_CORE = StandardPackage.SI__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL__LABELS_TO_UPDATE = StandardPackage.SI__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL__GRAPH = StandardPackage.SI__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL__ENABLED = StandardPackage.SI__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL__GRAPH_DECORATED = StandardPackage.SI__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL__PROGRESS = StandardPackage.SI__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL__ADD_STOCHASTIC_NOISE = StandardPackage.SI__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL__RANDOM_SEED = StandardPackage.SI__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL__BINOMIAL_DISTRIBUTION = StandardPackage.SI__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL__POPULATION_IDENTIFIER = StandardPackage.SI__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL__TIME_PERIOD = StandardPackage.SI__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL__DISEASE_NAME = StandardPackage.SI__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL__FINITE_DIFFERENCE = StandardPackage.SI__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL__FREQUENCY_DEPENDENT = StandardPackage.SI__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY = StandardPackage.SI__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = StandardPackage.SI__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE = StandardPackage.SI__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL__TRANSMISSION_RATE = StandardPackage.SI__TRANSMISSION_RATE;

	/**
	 * The feature id for the '<em><b>Non Linearity Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL__NON_LINEARITY_COEFFICIENT = StandardPackage.SI__NON_LINEARITY_COEFFICIENT;

	/**
	 * The feature id for the '<em><b>Recovery Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL__RECOVERY_RATE = StandardPackage.SI__RECOVERY_RATE;

	/**
	 * The feature id for the '<em><b>Infectious Mortality Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE = StandardPackage.SI__INFECTIOUS_MORTALITY_RATE;

	/**
	 * The feature id for the '<em><b>Parent Disease</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL__PARENT_DISEASE = StandardPackage.SI_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transformer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL__TRANSFORMER = StandardPackage.SI_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Evolved At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL__EVOLVED_AT = StandardPackage.SI_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Genome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL__GENOME = StandardPackage.SI_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Evolution Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL__EVOLUTION_COUNT = StandardPackage.SI_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Case Mutation Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL__CASE_MUTATION_RATE = StandardPackage.SI_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Genome Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL__GENOME_LENGTH = StandardPackage.SI_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Genetic Dist Nonlin Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL__GENETIC_DIST_NONLIN_EXPONENT = StandardPackage.SI_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>SI Disease Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SI_DISEASE_MODEL_FEATURE_COUNT = StandardPackage.SI_FEATURE_COUNT + 8;


	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIRDiseaseModelLabelImpl <em>SIR Disease Model Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIRDiseaseModelLabelImpl
	 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingPackageImpl#getEvolvingSIRDiseaseModelLabel()
	 * @generated
	 */
	int EVOLVING_SIR_DISEASE_MODEL_LABEL = 5;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL_LABEL__URI = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL_LABEL__TYPE_URI = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL_LABEL__DUBLIN_CORE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>URI Of Identifiable To Be Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL_LABEL__CURRENT_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Identifiable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL_LABEL__IDENTIFIABLE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__IDENTIFIABLE;

	/**
	 * The feature id for the '<em><b>Next Value Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL_LABEL__NEXT_VALUE_VALID = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NEXT_VALUE_VALID;

	/**
	 * The feature id for the '<em><b>Next Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL_LABEL__NEXT_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NEXT_VALUE;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL_LABEL__DECORATOR = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DECORATOR;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL_LABEL__NODE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NODE;

	/**
	 * The feature id for the '<em><b>Delta Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL_LABEL__DELTA_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DELTA_VALUE;

	/**
	 * The feature id for the '<em><b>Temp Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL_LABEL__TEMP_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__TEMP_VALUE;

	/**
	 * The feature id for the '<em><b>Probe Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL_LABEL__PROBE_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__PROBE_VALUE;

	/**
	 * The feature id for the '<em><b>Error Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL_LABEL__ERROR_SCALE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__ERROR_SCALE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL_LABEL__IDENTIFIER = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Population Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL_LABEL__POPULATION_LABEL = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__POPULATION_LABEL;

	/**
	 * The feature id for the '<em><b>Population Model Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL_LABEL__POPULATION_MODEL_LABEL = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__POPULATION_MODEL_LABEL;

	/**
	 * The number of structural features of the '<em>SIR Disease Model Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL_LABEL_FEATURE_COUNT = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIRDiseaseModelLabelValueImpl <em>SIR Disease Model Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIRDiseaseModelLabelValueImpl
	 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingPackageImpl#getEvolvingSIRDiseaseModelLabelValue()
	 * @generated
	 */
	int EVOLVING_SIR_DISEASE_MODEL_LABEL_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Arrivals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL_LABEL_VALUE__ARRIVALS = StandardPackage.SIR_LABEL_VALUE__ARRIVALS;

	/**
	 * The feature id for the '<em><b>Departures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL_LABEL_VALUE__DEPARTURES = StandardPackage.SIR_LABEL_VALUE__DEPARTURES;

	/**
	 * The feature id for the '<em><b>Population Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL_LABEL_VALUE__POPULATION_COUNT = StandardPackage.SIR_LABEL_VALUE__POPULATION_COUNT;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL_LABEL_VALUE__S = StandardPackage.SIR_LABEL_VALUE__S;

	/**
	 * The feature id for the '<em><b>Incidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL_LABEL_VALUE__INCIDENCE = StandardPackage.SIR_LABEL_VALUE__INCIDENCE;

	/**
	 * The feature id for the '<em><b>Disease Deaths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL_LABEL_VALUE__DISEASE_DEATHS = StandardPackage.SIR_LABEL_VALUE__DISEASE_DEATHS;

	/**
	 * The feature id for the '<em><b>I</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL_LABEL_VALUE__I = StandardPackage.SIR_LABEL_VALUE__I;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL_LABEL_VALUE__R = StandardPackage.SIR_LABEL_VALUE__R;

	/**
	 * The number of structural features of the '<em>SIR Disease Model Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT = StandardPackage.SIR_LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIRDiseaseModelImpl <em>SIR Disease Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIRDiseaseModelImpl
	 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingPackageImpl#getEvolvingSIRDiseaseModel()
	 * @generated
	 */
	int EVOLVING_SIR_DISEASE_MODEL = 7;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL__URI = EVOLVING_SI_DISEASE_MODEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL__TYPE_URI = EVOLVING_SI_DISEASE_MODEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL__DUBLIN_CORE = EVOLVING_SI_DISEASE_MODEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL__LABELS_TO_UPDATE = EVOLVING_SI_DISEASE_MODEL__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL__GRAPH = EVOLVING_SI_DISEASE_MODEL__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL__ENABLED = EVOLVING_SI_DISEASE_MODEL__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL__GRAPH_DECORATED = EVOLVING_SI_DISEASE_MODEL__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL__PROGRESS = EVOLVING_SI_DISEASE_MODEL__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL__ADD_STOCHASTIC_NOISE = EVOLVING_SI_DISEASE_MODEL__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL__RANDOM_SEED = EVOLVING_SI_DISEASE_MODEL__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL__BINOMIAL_DISTRIBUTION = EVOLVING_SI_DISEASE_MODEL__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL__POPULATION_IDENTIFIER = EVOLVING_SI_DISEASE_MODEL__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL__TIME_PERIOD = EVOLVING_SI_DISEASE_MODEL__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL__DISEASE_NAME = EVOLVING_SI_DISEASE_MODEL__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL__FINITE_DIFFERENCE = EVOLVING_SI_DISEASE_MODEL__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL__FREQUENCY_DEPENDENT = EVOLVING_SI_DISEASE_MODEL__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY = EVOLVING_SI_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = EVOLVING_SI_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE = EVOLVING_SI_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL__TRANSMISSION_RATE = EVOLVING_SI_DISEASE_MODEL__TRANSMISSION_RATE;

	/**
	 * The feature id for the '<em><b>Non Linearity Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL__NON_LINEARITY_COEFFICIENT = EVOLVING_SI_DISEASE_MODEL__NON_LINEARITY_COEFFICIENT;

	/**
	 * The feature id for the '<em><b>Recovery Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL__RECOVERY_RATE = EVOLVING_SI_DISEASE_MODEL__RECOVERY_RATE;

	/**
	 * The feature id for the '<em><b>Infectious Mortality Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE = EVOLVING_SI_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE;

	/**
	 * The feature id for the '<em><b>Parent Disease</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL__PARENT_DISEASE = EVOLVING_SI_DISEASE_MODEL__PARENT_DISEASE;

	/**
	 * The feature id for the '<em><b>Transformer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL__TRANSFORMER = EVOLVING_SI_DISEASE_MODEL__TRANSFORMER;

	/**
	 * The feature id for the '<em><b>Evolved At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL__EVOLVED_AT = EVOLVING_SI_DISEASE_MODEL__EVOLVED_AT;

	/**
	 * The feature id for the '<em><b>Genome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL__GENOME = EVOLVING_SI_DISEASE_MODEL__GENOME;

	/**
	 * The feature id for the '<em><b>Evolution Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL__EVOLUTION_COUNT = EVOLVING_SI_DISEASE_MODEL__EVOLUTION_COUNT;

	/**
	 * The feature id for the '<em><b>Case Mutation Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL__CASE_MUTATION_RATE = EVOLVING_SI_DISEASE_MODEL__CASE_MUTATION_RATE;

	/**
	 * The feature id for the '<em><b>Genome Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL__GENOME_LENGTH = EVOLVING_SI_DISEASE_MODEL__GENOME_LENGTH;

	/**
	 * The feature id for the '<em><b>Genetic Dist Nonlin Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL__GENETIC_DIST_NONLIN_EXPONENT = EVOLVING_SI_DISEASE_MODEL__GENETIC_DIST_NONLIN_EXPONENT;

	/**
	 * The feature id for the '<em><b>Immunity Loss Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL__IMMUNITY_LOSS_RATE = EVOLVING_SI_DISEASE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cross Immunity Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL__CROSS_IMMUNITY_RATE = EVOLVING_SI_DISEASE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SIR Disease Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SIR_DISEASE_MODEL_FEATURE_COUNT = EVOLVING_SI_DISEASE_MODEL_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSEIRDiseaseModelLabelImpl <em>SEIR Disease Model Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSEIRDiseaseModelLabelImpl
	 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingPackageImpl#getEvolvingSEIRDiseaseModelLabel()
	 * @generated
	 */
	int EVOLVING_SEIR_DISEASE_MODEL_LABEL = 8;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL_LABEL__URI = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL_LABEL__TYPE_URI = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL_LABEL__DUBLIN_CORE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>URI Of Identifiable To Be Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL_LABEL__CURRENT_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Identifiable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL_LABEL__IDENTIFIABLE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__IDENTIFIABLE;

	/**
	 * The feature id for the '<em><b>Next Value Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL_LABEL__NEXT_VALUE_VALID = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NEXT_VALUE_VALID;

	/**
	 * The feature id for the '<em><b>Next Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL_LABEL__NEXT_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NEXT_VALUE;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL_LABEL__DECORATOR = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DECORATOR;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL_LABEL__NODE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NODE;

	/**
	 * The feature id for the '<em><b>Delta Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL_LABEL__DELTA_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DELTA_VALUE;

	/**
	 * The feature id for the '<em><b>Temp Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL_LABEL__TEMP_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__TEMP_VALUE;

	/**
	 * The feature id for the '<em><b>Probe Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL_LABEL__PROBE_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__PROBE_VALUE;

	/**
	 * The feature id for the '<em><b>Error Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL_LABEL__ERROR_SCALE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__ERROR_SCALE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL_LABEL__IDENTIFIER = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Population Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL_LABEL__POPULATION_LABEL = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__POPULATION_LABEL;

	/**
	 * The feature id for the '<em><b>Population Model Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL_LABEL__POPULATION_MODEL_LABEL = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__POPULATION_MODEL_LABEL;

	/**
	 * The number of structural features of the '<em>SEIR Disease Model Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL_LABEL_FEATURE_COUNT = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSEIRDiseaseModelLabelValueImpl <em>SEIR Disease Model Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSEIRDiseaseModelLabelValueImpl
	 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingPackageImpl#getEvolvingSEIRDiseaseModelLabelValue()
	 * @generated
	 */
	int EVOLVING_SEIR_DISEASE_MODEL_LABEL_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Arrivals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL_LABEL_VALUE__ARRIVALS = StandardPackage.SEIR_LABEL_VALUE__ARRIVALS;

	/**
	 * The feature id for the '<em><b>Departures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL_LABEL_VALUE__DEPARTURES = StandardPackage.SEIR_LABEL_VALUE__DEPARTURES;

	/**
	 * The feature id for the '<em><b>Population Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL_LABEL_VALUE__POPULATION_COUNT = StandardPackage.SEIR_LABEL_VALUE__POPULATION_COUNT;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL_LABEL_VALUE__S = StandardPackage.SEIR_LABEL_VALUE__S;

	/**
	 * The feature id for the '<em><b>Incidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL_LABEL_VALUE__INCIDENCE = StandardPackage.SEIR_LABEL_VALUE__INCIDENCE;

	/**
	 * The feature id for the '<em><b>Disease Deaths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL_LABEL_VALUE__DISEASE_DEATHS = StandardPackage.SEIR_LABEL_VALUE__DISEASE_DEATHS;

	/**
	 * The feature id for the '<em><b>I</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL_LABEL_VALUE__I = StandardPackage.SEIR_LABEL_VALUE__I;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL_LABEL_VALUE__R = StandardPackage.SEIR_LABEL_VALUE__R;

	/**
	 * The feature id for the '<em><b>E</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL_LABEL_VALUE__E = StandardPackage.SEIR_LABEL_VALUE__E;

	/**
	 * The number of structural features of the '<em>SEIR Disease Model Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL_LABEL_VALUE_FEATURE_COUNT = StandardPackage.SEIR_LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSEIRDiseaseModelImpl <em>SEIR Disease Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSEIRDiseaseModelImpl
	 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingPackageImpl#getEvolvingSEIRDiseaseModel()
	 * @generated
	 */
	int EVOLVING_SEIR_DISEASE_MODEL = 10;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL__URI = EVOLVING_SIR_DISEASE_MODEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL__TYPE_URI = EVOLVING_SIR_DISEASE_MODEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL__DUBLIN_CORE = EVOLVING_SIR_DISEASE_MODEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL__LABELS_TO_UPDATE = EVOLVING_SIR_DISEASE_MODEL__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL__GRAPH = EVOLVING_SIR_DISEASE_MODEL__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL__ENABLED = EVOLVING_SIR_DISEASE_MODEL__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL__GRAPH_DECORATED = EVOLVING_SIR_DISEASE_MODEL__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL__PROGRESS = EVOLVING_SIR_DISEASE_MODEL__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL__ADD_STOCHASTIC_NOISE = EVOLVING_SIR_DISEASE_MODEL__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL__RANDOM_SEED = EVOLVING_SIR_DISEASE_MODEL__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL__BINOMIAL_DISTRIBUTION = EVOLVING_SIR_DISEASE_MODEL__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL__POPULATION_IDENTIFIER = EVOLVING_SIR_DISEASE_MODEL__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL__TIME_PERIOD = EVOLVING_SIR_DISEASE_MODEL__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL__DISEASE_NAME = EVOLVING_SIR_DISEASE_MODEL__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL__FINITE_DIFFERENCE = EVOLVING_SIR_DISEASE_MODEL__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL__FREQUENCY_DEPENDENT = EVOLVING_SIR_DISEASE_MODEL__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY = EVOLVING_SIR_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = EVOLVING_SIR_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE = EVOLVING_SIR_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL__TRANSMISSION_RATE = EVOLVING_SIR_DISEASE_MODEL__TRANSMISSION_RATE;

	/**
	 * The feature id for the '<em><b>Non Linearity Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL__NON_LINEARITY_COEFFICIENT = EVOLVING_SIR_DISEASE_MODEL__NON_LINEARITY_COEFFICIENT;

	/**
	 * The feature id for the '<em><b>Recovery Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL__RECOVERY_RATE = EVOLVING_SIR_DISEASE_MODEL__RECOVERY_RATE;

	/**
	 * The feature id for the '<em><b>Infectious Mortality Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE = EVOLVING_SIR_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE;

	/**
	 * The feature id for the '<em><b>Parent Disease</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL__PARENT_DISEASE = EVOLVING_SIR_DISEASE_MODEL__PARENT_DISEASE;

	/**
	 * The feature id for the '<em><b>Transformer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL__TRANSFORMER = EVOLVING_SIR_DISEASE_MODEL__TRANSFORMER;

	/**
	 * The feature id for the '<em><b>Evolved At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL__EVOLVED_AT = EVOLVING_SIR_DISEASE_MODEL__EVOLVED_AT;

	/**
	 * The feature id for the '<em><b>Genome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL__GENOME = EVOLVING_SIR_DISEASE_MODEL__GENOME;

	/**
	 * The feature id for the '<em><b>Evolution Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL__EVOLUTION_COUNT = EVOLVING_SIR_DISEASE_MODEL__EVOLUTION_COUNT;

	/**
	 * The feature id for the '<em><b>Case Mutation Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL__CASE_MUTATION_RATE = EVOLVING_SIR_DISEASE_MODEL__CASE_MUTATION_RATE;

	/**
	 * The feature id for the '<em><b>Genome Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL__GENOME_LENGTH = EVOLVING_SIR_DISEASE_MODEL__GENOME_LENGTH;

	/**
	 * The feature id for the '<em><b>Genetic Dist Nonlin Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL__GENETIC_DIST_NONLIN_EXPONENT = EVOLVING_SIR_DISEASE_MODEL__GENETIC_DIST_NONLIN_EXPONENT;

	/**
	 * The feature id for the '<em><b>Immunity Loss Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL__IMMUNITY_LOSS_RATE = EVOLVING_SIR_DISEASE_MODEL__IMMUNITY_LOSS_RATE;

	/**
	 * The feature id for the '<em><b>Cross Immunity Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL__CROSS_IMMUNITY_RATE = EVOLVING_SIR_DISEASE_MODEL__CROSS_IMMUNITY_RATE;

	/**
	 * The feature id for the '<em><b>Incubation Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL__INCUBATION_RATE = EVOLVING_SIR_DISEASE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SEIR Disease Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_SEIR_DISEASE_MODEL_FEATURE_COUNT = EVOLVING_SIR_DISEASE_MODEL_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '<em>Boolean Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingPackageImpl#getBooleanArray()
	 * @generated
	 */
	int BOOLEAN_ARRAY = 11;


	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseTransformer <em>Disease Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disease Transformer</em>'.
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseTransformer
	 * @generated
	 */
	EClass getEvolvingDiseaseTransformer();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseTransformer#getBaseDisease <em>Base Disease</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Disease</em>'.
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseTransformer#getBaseDisease()
	 * @see #getEvolvingDiseaseTransformer()
	 * @generated
	 */
	EReference getEvolvingDiseaseTransformer_BaseDisease();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseTransformer#getEvolvedDiseases <em>Evolved Diseases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Evolved Diseases</em>'.
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseTransformer#getEvolvedDiseases()
	 * @see #getEvolvingDiseaseTransformer()
	 * @generated
	 */
	EReference getEvolvingDiseaseTransformer_EvolvedDiseases();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseTransformer#getEvolutionCount <em>Evolution Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Evolution Count</em>'.
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseTransformer#getEvolutionCount()
	 * @see #getEvolvingDiseaseTransformer()
	 * @generated
	 */
	EAttribute getEvolvingDiseaseTransformer_EvolutionCount();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseTransformer#getEvolutionCountHardLimit <em>Evolution Count Hard Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Evolution Count Hard Limit</em>'.
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseTransformer#getEvolutionCountHardLimit()
	 * @see #getEvolvingDiseaseTransformer()
	 * @generated
	 */
	EAttribute getEvolvingDiseaseTransformer_EvolutionCountHardLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseTransformer#isStopAllEvolution <em>Stop All Evolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop All Evolution</em>'.
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseTransformer#isStopAllEvolution()
	 * @see #getEvolvingDiseaseTransformer()
	 * @generated
	 */
	EAttribute getEvolvingDiseaseTransformer_StopAllEvolution();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseModel <em>Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disease Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseModel
	 * @generated
	 */
	EClass getEvolvingDiseaseModel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseModel#getParentDisease <em>Parent Disease</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Disease</em>'.
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseModel#getParentDisease()
	 * @see #getEvolvingDiseaseModel()
	 * @generated
	 */
	EReference getEvolvingDiseaseModel_ParentDisease();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseModel#getTransformer <em>Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformer</em>'.
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseModel#getTransformer()
	 * @see #getEvolvingDiseaseModel()
	 * @generated
	 */
	EReference getEvolvingDiseaseModel_Transformer();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseModel#getEvolvedAt <em>Evolved At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Evolved At</em>'.
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseModel#getEvolvedAt()
	 * @see #getEvolvingDiseaseModel()
	 * @generated
	 */
	EReference getEvolvingDiseaseModel_EvolvedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseModel#getEvolutionCount <em>Evolution Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Evolution Count</em>'.
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseModel#getEvolutionCount()
	 * @see #getEvolvingDiseaseModel()
	 * @generated
	 */
	EAttribute getEvolvingDiseaseModel_EvolutionCount();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingSIDiseaseModelLabel <em>SI Disease Model Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SI Disease Model Label</em>'.
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingSIDiseaseModelLabel
	 * @generated
	 */
	EClass getEvolvingSIDiseaseModelLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingSIDiseaseModelLabelValue <em>SI Disease Model Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SI Disease Model Label Value</em>'.
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingSIDiseaseModelLabelValue
	 * @generated
	 */
	EClass getEvolvingSIDiseaseModelLabelValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseModel#getGenome <em>Genome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Genome</em>'.
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseModel#getGenome()
	 * @see #getEvolvingDiseaseModel()
	 * @generated
	 */
	EAttribute getEvolvingDiseaseModel_Genome();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingSIDiseaseModel <em>SI Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SI Disease Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingSIDiseaseModel
	 * @generated
	 */
	EClass getEvolvingSIDiseaseModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingSIDiseaseModel#getCaseMutationRate <em>Case Mutation Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case Mutation Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingSIDiseaseModel#getCaseMutationRate()
	 * @see #getEvolvingSIDiseaseModel()
	 * @generated
	 */
	EAttribute getEvolvingSIDiseaseModel_CaseMutationRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingSIDiseaseModel#getGenomeLength <em>Genome Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Genome Length</em>'.
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingSIDiseaseModel#getGenomeLength()
	 * @see #getEvolvingSIDiseaseModel()
	 * @generated
	 */
	EAttribute getEvolvingSIDiseaseModel_GenomeLength();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingSIDiseaseModel#getGeneticDistNonlinExponent <em>Genetic Dist Nonlin Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Genetic Dist Nonlin Exponent</em>'.
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingSIDiseaseModel#getGeneticDistNonlinExponent()
	 * @see #getEvolvingSIDiseaseModel()
	 * @generated
	 */
	EAttribute getEvolvingSIDiseaseModel_GeneticDistNonlinExponent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingSIRDiseaseModelLabel <em>SIR Disease Model Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SIR Disease Model Label</em>'.
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingSIRDiseaseModelLabel
	 * @generated
	 */
	EClass getEvolvingSIRDiseaseModelLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingSIRDiseaseModelLabelValue <em>SIR Disease Model Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SIR Disease Model Label Value</em>'.
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingSIRDiseaseModelLabelValue
	 * @generated
	 */
	EClass getEvolvingSIRDiseaseModelLabelValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingSIRDiseaseModel <em>SIR Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SIR Disease Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingSIRDiseaseModel
	 * @generated
	 */
	EClass getEvolvingSIRDiseaseModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingSIRDiseaseModel#getImmunityLossRate <em>Immunity Loss Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immunity Loss Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingSIRDiseaseModel#getImmunityLossRate()
	 * @see #getEvolvingSIRDiseaseModel()
	 * @generated
	 */
	EAttribute getEvolvingSIRDiseaseModel_ImmunityLossRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingSIRDiseaseModel#getCrossImmunityRate <em>Cross Immunity Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cross Immunity Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingSIRDiseaseModel#getCrossImmunityRate()
	 * @see #getEvolvingSIRDiseaseModel()
	 * @generated
	 */
	EAttribute getEvolvingSIRDiseaseModel_CrossImmunityRate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingSEIRDiseaseModelLabel <em>SEIR Disease Model Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SEIR Disease Model Label</em>'.
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingSEIRDiseaseModelLabel
	 * @generated
	 */
	EClass getEvolvingSEIRDiseaseModelLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingSEIRDiseaseModelLabelValue <em>SEIR Disease Model Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SEIR Disease Model Label Value</em>'.
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingSEIRDiseaseModelLabelValue
	 * @generated
	 */
	EClass getEvolvingSEIRDiseaseModelLabelValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingSEIRDiseaseModel <em>SEIR Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SEIR Disease Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingSEIRDiseaseModel
	 * @generated
	 */
	EClass getEvolvingSEIRDiseaseModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingSEIRDiseaseModel#getIncubationRate <em>Incubation Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incubation Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingSEIRDiseaseModel#getIncubationRate()
	 * @see #getEvolvingSEIRDiseaseModel()
	 * @generated
	 */
	EAttribute getEvolvingSEIRDiseaseModel_IncubationRate();

	/**
	 * Returns the meta object for data type '<em>Boolean Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean Array</em>'.
	 * @model instanceClass="boolean[]"
	 * @generated
	 */
	EDataType getBooleanArray();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EvolvingFactory getEvolvingFactory();

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
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingDiseaseTransformerImpl <em>Disease Transformer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingDiseaseTransformerImpl
		 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingPackageImpl#getEvolvingDiseaseTransformer()
		 * @generated
		 */
		EClass EVOLVING_DISEASE_TRANSFORMER = eINSTANCE.getEvolvingDiseaseTransformer();

		/**
		 * The meta object literal for the '<em><b>Base Disease</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVOLVING_DISEASE_TRANSFORMER__BASE_DISEASE = eINSTANCE.getEvolvingDiseaseTransformer_BaseDisease();

		/**
		 * The meta object literal for the '<em><b>Evolved Diseases</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVOLVING_DISEASE_TRANSFORMER__EVOLVED_DISEASES = eINSTANCE.getEvolvingDiseaseTransformer_EvolvedDiseases();

		/**
		 * The meta object literal for the '<em><b>Evolution Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVOLVING_DISEASE_TRANSFORMER__EVOLUTION_COUNT = eINSTANCE.getEvolvingDiseaseTransformer_EvolutionCount();

		/**
		 * The meta object literal for the '<em><b>Evolution Count Hard Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVOLVING_DISEASE_TRANSFORMER__EVOLUTION_COUNT_HARD_LIMIT = eINSTANCE.getEvolvingDiseaseTransformer_EvolutionCountHardLimit();

		/**
		 * The meta object literal for the '<em><b>Stop All Evolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVOLVING_DISEASE_TRANSFORMER__STOP_ALL_EVOLUTION = eINSTANCE.getEvolvingDiseaseTransformer_StopAllEvolution();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseModel <em>Disease Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseModel
		 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingPackageImpl#getEvolvingDiseaseModel()
		 * @generated
		 */
		EClass EVOLVING_DISEASE_MODEL = eINSTANCE.getEvolvingDiseaseModel();

		/**
		 * The meta object literal for the '<em><b>Parent Disease</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVOLVING_DISEASE_MODEL__PARENT_DISEASE = eINSTANCE.getEvolvingDiseaseModel_ParentDisease();

		/**
		 * The meta object literal for the '<em><b>Transformer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVOLVING_DISEASE_MODEL__TRANSFORMER = eINSTANCE.getEvolvingDiseaseModel_Transformer();

		/**
		 * The meta object literal for the '<em><b>Evolved At</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVOLVING_DISEASE_MODEL__EVOLVED_AT = eINSTANCE.getEvolvingDiseaseModel_EvolvedAt();

		/**
		 * The meta object literal for the '<em><b>Evolution Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVOLVING_DISEASE_MODEL__EVOLUTION_COUNT = eINSTANCE.getEvolvingDiseaseModel_EvolutionCount();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIDiseaseModelLabelImpl <em>SI Disease Model Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIDiseaseModelLabelImpl
		 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingPackageImpl#getEvolvingSIDiseaseModelLabel()
		 * @generated
		 */
		EClass EVOLVING_SI_DISEASE_MODEL_LABEL = eINSTANCE.getEvolvingSIDiseaseModelLabel();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIDiseaseModelLabelValueImpl <em>SI Disease Model Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIDiseaseModelLabelValueImpl
		 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingPackageImpl#getEvolvingSIDiseaseModelLabelValue()
		 * @generated
		 */
		EClass EVOLVING_SI_DISEASE_MODEL_LABEL_VALUE = eINSTANCE.getEvolvingSIDiseaseModelLabelValue();

		/**
		 * The meta object literal for the '<em><b>Genome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVOLVING_DISEASE_MODEL__GENOME = eINSTANCE.getEvolvingDiseaseModel_Genome();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIDiseaseModelImpl <em>SI Disease Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIDiseaseModelImpl
		 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingPackageImpl#getEvolvingSIDiseaseModel()
		 * @generated
		 */
		EClass EVOLVING_SI_DISEASE_MODEL = eINSTANCE.getEvolvingSIDiseaseModel();

		/**
		 * The meta object literal for the '<em><b>Case Mutation Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVOLVING_SI_DISEASE_MODEL__CASE_MUTATION_RATE = eINSTANCE.getEvolvingSIDiseaseModel_CaseMutationRate();

		/**
		 * The meta object literal for the '<em><b>Genome Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVOLVING_SI_DISEASE_MODEL__GENOME_LENGTH = eINSTANCE.getEvolvingSIDiseaseModel_GenomeLength();

		/**
		 * The meta object literal for the '<em><b>Genetic Dist Nonlin Exponent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVOLVING_SI_DISEASE_MODEL__GENETIC_DIST_NONLIN_EXPONENT = eINSTANCE.getEvolvingSIDiseaseModel_GeneticDistNonlinExponent();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIRDiseaseModelLabelImpl <em>SIR Disease Model Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIRDiseaseModelLabelImpl
		 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingPackageImpl#getEvolvingSIRDiseaseModelLabel()
		 * @generated
		 */
		EClass EVOLVING_SIR_DISEASE_MODEL_LABEL = eINSTANCE.getEvolvingSIRDiseaseModelLabel();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIRDiseaseModelLabelValueImpl <em>SIR Disease Model Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIRDiseaseModelLabelValueImpl
		 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingPackageImpl#getEvolvingSIRDiseaseModelLabelValue()
		 * @generated
		 */
		EClass EVOLVING_SIR_DISEASE_MODEL_LABEL_VALUE = eINSTANCE.getEvolvingSIRDiseaseModelLabelValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIRDiseaseModelImpl <em>SIR Disease Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIRDiseaseModelImpl
		 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingPackageImpl#getEvolvingSIRDiseaseModel()
		 * @generated
		 */
		EClass EVOLVING_SIR_DISEASE_MODEL = eINSTANCE.getEvolvingSIRDiseaseModel();

		/**
		 * The meta object literal for the '<em><b>Immunity Loss Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVOLVING_SIR_DISEASE_MODEL__IMMUNITY_LOSS_RATE = eINSTANCE.getEvolvingSIRDiseaseModel_ImmunityLossRate();

		/**
		 * The meta object literal for the '<em><b>Cross Immunity Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVOLVING_SIR_DISEASE_MODEL__CROSS_IMMUNITY_RATE = eINSTANCE.getEvolvingSIRDiseaseModel_CrossImmunityRate();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSEIRDiseaseModelLabelImpl <em>SEIR Disease Model Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSEIRDiseaseModelLabelImpl
		 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingPackageImpl#getEvolvingSEIRDiseaseModelLabel()
		 * @generated
		 */
		EClass EVOLVING_SEIR_DISEASE_MODEL_LABEL = eINSTANCE.getEvolvingSEIRDiseaseModelLabel();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSEIRDiseaseModelLabelValueImpl <em>SEIR Disease Model Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSEIRDiseaseModelLabelValueImpl
		 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingPackageImpl#getEvolvingSEIRDiseaseModelLabelValue()
		 * @generated
		 */
		EClass EVOLVING_SEIR_DISEASE_MODEL_LABEL_VALUE = eINSTANCE.getEvolvingSEIRDiseaseModelLabelValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSEIRDiseaseModelImpl <em>SEIR Disease Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSEIRDiseaseModelImpl
		 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingPackageImpl#getEvolvingSEIRDiseaseModel()
		 * @generated
		 */
		EClass EVOLVING_SEIR_DISEASE_MODEL = eINSTANCE.getEvolvingSEIRDiseaseModel();

		/**
		 * The meta object literal for the '<em><b>Incubation Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVOLVING_SEIR_DISEASE_MODEL__INCUBATION_RATE = eINSTANCE.getEvolvingSEIRDiseaseModel_IncubationRate();

		/**
		 * The meta object literal for the '<em>Boolean Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.evolving.impl.EvolvingPackageImpl#getBooleanArray()
		 * @generated
		 */
		EDataType BOOLEAN_ARRAY = eINSTANCE.getBooleanArray();

	}

} //EvolvingPackage
