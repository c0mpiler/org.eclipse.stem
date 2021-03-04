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
package org.eclipse.stem.diseasemodels.measles;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.stem.diseasemodels.multipopulation.MultipopulationPackage;
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
 * @see org.eclipse.stem.diseasemodels.measles.MeaslesFactory
 * @model kind="package"
 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
 *        annotation="http:///org/eclipse/stem/modelgen/metamodel uri='platform:/resource/.stemgenerator/model/measles.metamodel'"
 * @generated
 */
public interface MeaslesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "measles";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/stem/diseasemodels/measles/measles.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.stem.diseasemodels.measles";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MeaslesPackage eINSTANCE = org.eclipse.stem.diseasemodels.measles.impl.MeaslesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.measles.impl.MeaslesLabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.measles.impl.MeaslesLabelImpl
	 * @see org.eclipse.stem.diseasemodels.measles.impl.MeaslesPackageImpl#getMeaslesLabel()
	 * @generated
	 */
	int MEASLES_LABEL = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES_LABEL__URI = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES_LABEL__TYPE_URI = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES_LABEL__DUBLIN_CORE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>URI Of Identifiable To Be Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES_LABEL__CURRENT_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Identifiable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES_LABEL__IDENTIFIABLE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__IDENTIFIABLE;

	/**
	 * The feature id for the '<em><b>Next Value Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES_LABEL__NEXT_VALUE_VALID = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NEXT_VALUE_VALID;

	/**
	 * The feature id for the '<em><b>Next Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES_LABEL__NEXT_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NEXT_VALUE;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES_LABEL__DECORATOR = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DECORATOR;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES_LABEL__NODE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NODE;

	/**
	 * The feature id for the '<em><b>Delta Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES_LABEL__DELTA_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DELTA_VALUE;

	/**
	 * The feature id for the '<em><b>Temp Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES_LABEL__TEMP_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__TEMP_VALUE;

	/**
	 * The feature id for the '<em><b>Probe Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES_LABEL__PROBE_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__PROBE_VALUE;

	/**
	 * The feature id for the '<em><b>Error Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES_LABEL__ERROR_SCALE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__ERROR_SCALE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES_LABEL__IDENTIFIER = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Population Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES_LABEL__POPULATION_LABEL = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__POPULATION_LABEL;

	/**
	 * The feature id for the '<em><b>Population Model Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES_LABEL__POPULATION_MODEL_LABEL = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__POPULATION_MODEL_LABEL;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES_LABEL_FEATURE_COUNT = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.measles.impl.MeaslesLabelValueImpl <em>Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.measles.impl.MeaslesLabelValueImpl
	 * @see org.eclipse.stem.diseasemodels.measles.impl.MeaslesPackageImpl#getMeaslesLabelValue()
	 * @generated
	 */
	int MEASLES_LABEL_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Arrivals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES_LABEL_VALUE__ARRIVALS = StandardPackage.SEIR_LABEL_VALUE__ARRIVALS;

	/**
	 * The feature id for the '<em><b>Departures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES_LABEL_VALUE__DEPARTURES = StandardPackage.SEIR_LABEL_VALUE__DEPARTURES;

	/**
	 * The feature id for the '<em><b>Population Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES_LABEL_VALUE__POPULATION_COUNT = StandardPackage.SEIR_LABEL_VALUE__POPULATION_COUNT;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES_LABEL_VALUE__S = StandardPackage.SEIR_LABEL_VALUE__S;

	/**
	 * The feature id for the '<em><b>Incidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES_LABEL_VALUE__INCIDENCE = StandardPackage.SEIR_LABEL_VALUE__INCIDENCE;

	/**
	 * The feature id for the '<em><b>Disease Deaths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES_LABEL_VALUE__DISEASE_DEATHS = StandardPackage.SEIR_LABEL_VALUE__DISEASE_DEATHS;

	/**
	 * The feature id for the '<em><b>I</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES_LABEL_VALUE__I = StandardPackage.SEIR_LABEL_VALUE__I;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES_LABEL_VALUE__R = StandardPackage.SEIR_LABEL_VALUE__R;

	/**
	 * The feature id for the '<em><b>E</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES_LABEL_VALUE__E = StandardPackage.SEIR_LABEL_VALUE__E;

	/**
	 * The feature id for the '<em><b>Vaccinated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES_LABEL_VALUE__VACCINATED = StandardPackage.SEIR_LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Immunisations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES_LABEL_VALUE__IMMUNISATIONS = StandardPackage.SEIR_LABEL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES_LABEL_VALUE__M = StandardPackage.SEIR_LABEL_VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Incidence V</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES_LABEL_VALUE__INCIDENCE_V = StandardPackage.SEIR_LABEL_VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES_LABEL_VALUE_FEATURE_COUNT = StandardPackage.SEIR_LABEL_VALUE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.measles.impl.MeaslesImpl <em>Measles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.measles.impl.MeaslesImpl
	 * @see org.eclipse.stem.diseasemodels.measles.impl.MeaslesPackageImpl#getMeasles()
	 * @generated
	 */
	int MEASLES = 2;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES__URI = MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES__TYPE_URI = MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES__DUBLIN_CORE = MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES__LABELS_TO_UPDATE = MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES__GRAPH = MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES__ENABLED = MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES__GRAPH_DECORATED = MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES__PROGRESS = MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES__ADD_STOCHASTIC_NOISE = MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES__RANDOM_SEED = MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES__BINOMIAL_DISTRIBUTION = MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES__POPULATION_IDENTIFIER = MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES__TIME_PERIOD = MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES__DISEASE_NAME = MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES__FINITE_DIFFERENCE = MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES__FREQUENCY_DEPENDENT = MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES__REFERENCE_POPULATION_DENSITY = MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES__ROAD_NETWORK_INFECTIOUS_PROPORTION = MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES__CHARACTERISTIC_MIXING_DISTANCE = MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Population Groups</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES__POPULATION_GROUPS = MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__POPULATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Transmission Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES__TRANSMISSION_RATE = MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__TRANSMISSION_RATE;

	/**
	 * The feature id for the '<em><b>Recovery Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES__RECOVERY_RATE = MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__RECOVERY_RATE;

	/**
	 * The feature id for the '<em><b>Infectious Mortality Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES__INFECTIOUS_MORTALITY_RATE = MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE;

	/**
	 * The feature id for the '<em><b>Immunity Loss Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES__IMMUNITY_LOSS_RATE = MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__IMMUNITY_LOSS_RATE;

	/**
	 * The feature id for the '<em><b>Incubation Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES__INCUBATION_RATE = MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL__INCUBATION_RATE;

	/**
	 * The feature id for the '<em><b>Vaccine Efficacy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES__VACCINE_EFFICACY = MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inoculation Scaling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES__INOCULATION_SCALING = MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Phase Shift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES__PHASE_SHIFT = MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Seasonal Modulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES__SEASONAL_MODULATION = MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Seasonal Modulation Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES__SEASONAL_MODULATION_PERIOD = MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Inoculated Immunity Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES__INOCULATED_IMMUNITY_RATE = MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Newborn Immunity Loss Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES__NEWBORN_IMMUNITY_LOSS_RATE = MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Transmission Rate Scaling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES__TRANSMISSION_RATE_SCALING = MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Measles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASLES_FEATURE_COUNT = MultipopulationPackage.MULTI_POPULATION_SEIR_DISEASE_MODEL_FEATURE_COUNT + 8;


	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.measles.MeaslesLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see org.eclipse.stem.diseasemodels.measles.MeaslesLabel
	 * @generated
	 */
	EClass getMeaslesLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.measles.MeaslesLabelValue <em>Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Value</em>'.
	 * @see org.eclipse.stem.diseasemodels.measles.MeaslesLabelValue
	 * @generated
	 */
	EClass getMeaslesLabelValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.measles.MeaslesLabelValue#getVaccinated <em>Vaccinated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vaccinated</em>'.
	 * @see org.eclipse.stem.diseasemodels.measles.MeaslesLabelValue#getVaccinated()
	 * @see #getMeaslesLabelValue()
	 * @generated
	 */
	EAttribute getMeaslesLabelValue_Vaccinated();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.measles.MeaslesLabelValue#getImmunisations <em>Immunisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immunisations</em>'.
	 * @see org.eclipse.stem.diseasemodels.measles.MeaslesLabelValue#getImmunisations()
	 * @see #getMeaslesLabelValue()
	 * @generated
	 */
	EAttribute getMeaslesLabelValue_Immunisations();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.measles.MeaslesLabelValue#getM <em>M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M</em>'.
	 * @see org.eclipse.stem.diseasemodels.measles.MeaslesLabelValue#getM()
	 * @see #getMeaslesLabelValue()
	 * @generated
	 */
	EAttribute getMeaslesLabelValue_M();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.measles.MeaslesLabelValue#getIncidenceV <em>Incidence V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incidence V</em>'.
	 * @see org.eclipse.stem.diseasemodels.measles.MeaslesLabelValue#getIncidenceV()
	 * @see #getMeaslesLabelValue()
	 * @generated
	 */
	EAttribute getMeaslesLabelValue_IncidenceV();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.measles.Measles <em>Measles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measles</em>'.
	 * @see org.eclipse.stem.diseasemodels.measles.Measles
	 * @generated
	 */
	EClass getMeasles();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.measles.Measles#getVaccineEfficacy <em>Vaccine Efficacy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vaccine Efficacy</em>'.
	 * @see org.eclipse.stem.diseasemodels.measles.Measles#getVaccineEfficacy()
	 * @see #getMeasles()
	 * @generated
	 */
	EAttribute getMeasles_VaccineEfficacy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.measles.Measles#getInoculationScaling <em>Inoculation Scaling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inoculation Scaling</em>'.
	 * @see org.eclipse.stem.diseasemodels.measles.Measles#getInoculationScaling()
	 * @see #getMeasles()
	 * @generated
	 */
	EAttribute getMeasles_InoculationScaling();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.measles.Measles#getPhaseShift <em>Phase Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Shift</em>'.
	 * @see org.eclipse.stem.diseasemodels.measles.Measles#getPhaseShift()
	 * @see #getMeasles()
	 * @generated
	 */
	EAttribute getMeasles_PhaseShift();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.measles.Measles#getSeasonalModulation <em>Seasonal Modulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seasonal Modulation</em>'.
	 * @see org.eclipse.stem.diseasemodels.measles.Measles#getSeasonalModulation()
	 * @see #getMeasles()
	 * @generated
	 */
	EAttribute getMeasles_SeasonalModulation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.measles.Measles#getSeasonalModulationPeriod <em>Seasonal Modulation Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seasonal Modulation Period</em>'.
	 * @see org.eclipse.stem.diseasemodels.measles.Measles#getSeasonalModulationPeriod()
	 * @see #getMeasles()
	 * @generated
	 */
	EAttribute getMeasles_SeasonalModulationPeriod();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.measles.Measles#getInoculatedImmunityRate <em>Inoculated Immunity Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inoculated Immunity Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.measles.Measles#getInoculatedImmunityRate()
	 * @see #getMeasles()
	 * @generated
	 */
	EAttribute getMeasles_InoculatedImmunityRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.measles.Measles#getNewbornImmunityLossRate <em>Newborn Immunity Loss Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Newborn Immunity Loss Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.measles.Measles#getNewbornImmunityLossRate()
	 * @see #getMeasles()
	 * @generated
	 */
	EAttribute getMeasles_NewbornImmunityLossRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.measles.Measles#getTransmissionRateScaling <em>Transmission Rate Scaling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transmission Rate Scaling</em>'.
	 * @see org.eclipse.stem.diseasemodels.measles.Measles#getTransmissionRateScaling()
	 * @see #getMeasles()
	 * @generated
	 */
	EAttribute getMeasles_TransmissionRateScaling();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MeaslesFactory getMeaslesFactory();

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
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.measles.impl.MeaslesLabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.measles.impl.MeaslesLabelImpl
		 * @see org.eclipse.stem.diseasemodels.measles.impl.MeaslesPackageImpl#getMeaslesLabel()
		 * @generated
		 */
		EClass MEASLES_LABEL = eINSTANCE.getMeaslesLabel();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.measles.impl.MeaslesLabelValueImpl <em>Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.measles.impl.MeaslesLabelValueImpl
		 * @see org.eclipse.stem.diseasemodels.measles.impl.MeaslesPackageImpl#getMeaslesLabelValue()
		 * @generated
		 */
		EClass MEASLES_LABEL_VALUE = eINSTANCE.getMeaslesLabelValue();

		/**
		 * The meta object literal for the '<em><b>Vaccinated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASLES_LABEL_VALUE__VACCINATED = eINSTANCE.getMeaslesLabelValue_Vaccinated();

		/**
		 * The meta object literal for the '<em><b>Immunisations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASLES_LABEL_VALUE__IMMUNISATIONS = eINSTANCE.getMeaslesLabelValue_Immunisations();

		/**
		 * The meta object literal for the '<em><b>M</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASLES_LABEL_VALUE__M = eINSTANCE.getMeaslesLabelValue_M();

		/**
		 * The meta object literal for the '<em><b>Incidence V</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASLES_LABEL_VALUE__INCIDENCE_V = eINSTANCE.getMeaslesLabelValue_IncidenceV();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.measles.impl.MeaslesImpl <em>Measles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.measles.impl.MeaslesImpl
		 * @see org.eclipse.stem.diseasemodels.measles.impl.MeaslesPackageImpl#getMeasles()
		 * @generated
		 */
		EClass MEASLES = eINSTANCE.getMeasles();

		/**
		 * The meta object literal for the '<em><b>Vaccine Efficacy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASLES__VACCINE_EFFICACY = eINSTANCE.getMeasles_VaccineEfficacy();

		/**
		 * The meta object literal for the '<em><b>Inoculation Scaling</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASLES__INOCULATION_SCALING = eINSTANCE.getMeasles_InoculationScaling();

		/**
		 * The meta object literal for the '<em><b>Phase Shift</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASLES__PHASE_SHIFT = eINSTANCE.getMeasles_PhaseShift();

		/**
		 * The meta object literal for the '<em><b>Seasonal Modulation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASLES__SEASONAL_MODULATION = eINSTANCE.getMeasles_SeasonalModulation();

		/**
		 * The meta object literal for the '<em><b>Seasonal Modulation Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASLES__SEASONAL_MODULATION_PERIOD = eINSTANCE.getMeasles_SeasonalModulationPeriod();

		/**
		 * The meta object literal for the '<em><b>Inoculated Immunity Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASLES__INOCULATED_IMMUNITY_RATE = eINSTANCE.getMeasles_InoculatedImmunityRate();

		/**
		 * The meta object literal for the '<em><b>Newborn Immunity Loss Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASLES__NEWBORN_IMMUNITY_LOSS_RATE = eINSTANCE.getMeasles_NewbornImmunityLossRate();

		/**
		 * The meta object literal for the '<em><b>Transmission Rate Scaling</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASLES__TRANSMISSION_RATE_SCALING = eINSTANCE.getMeasles_TransmissionRateScaling();

	}

} //MeaslesPackage
