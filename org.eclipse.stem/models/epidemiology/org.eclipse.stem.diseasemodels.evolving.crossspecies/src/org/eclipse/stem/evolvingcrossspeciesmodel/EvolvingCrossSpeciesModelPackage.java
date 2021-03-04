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
package org.eclipse.stem.evolvingcrossspeciesmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.stem.diseasemodels.evolving.EvolvingPackage;

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
 * @see org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelFactory
 * @model kind="package"
 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
 *        annotation="http:///org/eclipse/stem/modelgen/metamodel uri='platform:/resource/.stemgenerator/model/evolvingcrossspeciesmodel.metamodel'"
 * @generated
 */
public interface EvolvingCrossSpeciesModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "evolvingcrossspeciesmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/stem/evolvingcrossspeciesmodel/evolvingcrossspeciesmodel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.stem.evolvingcrossspeciesmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EvolvingCrossSpeciesModelPackage eINSTANCE = org.eclipse.stem.evolvingcrossspeciesmodel.impl.EvolvingCrossSpeciesModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.stem.evolvingcrossspeciesmodel.impl.EvolvingCrossSpeciesModelLabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.evolvingcrossspeciesmodel.impl.EvolvingCrossSpeciesModelLabelImpl
	 * @see org.eclipse.stem.evolvingcrossspeciesmodel.impl.EvolvingCrossSpeciesModelPackageImpl#getEvolvingCrossSpeciesModelLabel()
	 * @generated
	 */
	int EVOLVING_CROSS_SPECIES_MODEL_LABEL = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL_LABEL__URI = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL_LABEL__TYPE_URI = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL_LABEL__DUBLIN_CORE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>URI Of Identifiable To Be Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL_LABEL__CURRENT_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Identifiable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL_LABEL__IDENTIFIABLE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__IDENTIFIABLE;

	/**
	 * The feature id for the '<em><b>Next Value Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL_LABEL__NEXT_VALUE_VALID = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NEXT_VALUE_VALID;

	/**
	 * The feature id for the '<em><b>Next Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL_LABEL__NEXT_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NEXT_VALUE;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL_LABEL__DECORATOR = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DECORATOR;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL_LABEL__NODE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NODE;

	/**
	 * The feature id for the '<em><b>Delta Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL_LABEL__DELTA_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DELTA_VALUE;

	/**
	 * The feature id for the '<em><b>Temp Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL_LABEL__TEMP_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__TEMP_VALUE;

	/**
	 * The feature id for the '<em><b>Probe Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL_LABEL__PROBE_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__PROBE_VALUE;

	/**
	 * The feature id for the '<em><b>Error Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL_LABEL__ERROR_SCALE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__ERROR_SCALE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL_LABEL__IDENTIFIER = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Population Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL_LABEL__POPULATION_LABEL = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__POPULATION_LABEL;

	/**
	 * The feature id for the '<em><b>Population Model Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL_LABEL__POPULATION_MODEL_LABEL = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__POPULATION_MODEL_LABEL;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL_LABEL_FEATURE_COUNT = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.evolvingcrossspeciesmodel.impl.EvolvingCrossSpeciesModelLabelValueImpl <em>Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.evolvingcrossspeciesmodel.impl.EvolvingCrossSpeciesModelLabelValueImpl
	 * @see org.eclipse.stem.evolvingcrossspeciesmodel.impl.EvolvingCrossSpeciesModelPackageImpl#getEvolvingCrossSpeciesModelLabelValue()
	 * @generated
	 */
	int EVOLVING_CROSS_SPECIES_MODEL_LABEL_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Arrivals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL_LABEL_VALUE__ARRIVALS = StandardPackage.SIR_LABEL_VALUE__ARRIVALS;

	/**
	 * The feature id for the '<em><b>Departures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL_LABEL_VALUE__DEPARTURES = StandardPackage.SIR_LABEL_VALUE__DEPARTURES;

	/**
	 * The feature id for the '<em><b>Population Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL_LABEL_VALUE__POPULATION_COUNT = StandardPackage.SIR_LABEL_VALUE__POPULATION_COUNT;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL_LABEL_VALUE__S = StandardPackage.SIR_LABEL_VALUE__S;

	/**
	 * The feature id for the '<em><b>Incidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL_LABEL_VALUE__INCIDENCE = StandardPackage.SIR_LABEL_VALUE__INCIDENCE;

	/**
	 * The feature id for the '<em><b>Disease Deaths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL_LABEL_VALUE__DISEASE_DEATHS = StandardPackage.SIR_LABEL_VALUE__DISEASE_DEATHS;

	/**
	 * The feature id for the '<em><b>I</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL_LABEL_VALUE__I = StandardPackage.SIR_LABEL_VALUE__I;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL_LABEL_VALUE__R = StandardPackage.SIR_LABEL_VALUE__R;

	/**
	 * The feature id for the '<em><b>E</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL_LABEL_VALUE__E = StandardPackage.SIR_LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Seff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL_LABEL_VALUE__SEFF = StandardPackage.SIR_LABEL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL_LABEL_VALUE_FEATURE_COUNT = StandardPackage.SIR_LABEL_VALUE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.evolvingcrossspeciesmodel.impl.EvolvingCrossSpeciesModelImpl <em>Evolving Cross Species Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.evolvingcrossspeciesmodel.impl.EvolvingCrossSpeciesModelImpl
	 * @see org.eclipse.stem.evolvingcrossspeciesmodel.impl.EvolvingCrossSpeciesModelPackageImpl#getEvolvingCrossSpeciesModel()
	 * @generated
	 */
	int EVOLVING_CROSS_SPECIES_MODEL = 2;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__URI = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__TYPE_URI = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__DUBLIN_CORE = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__LABELS_TO_UPDATE = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__GRAPH = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__ENABLED = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__GRAPH_DECORATED = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__PROGRESS = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__ADD_STOCHASTIC_NOISE = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__RANDOM_SEED = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__BINOMIAL_DISTRIBUTION = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__POPULATION_IDENTIFIER = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__TIME_PERIOD = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__DISEASE_NAME = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__FINITE_DIFFERENCE = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__FREQUENCY_DEPENDENT = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__REFERENCE_POPULATION_DENSITY = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__CHARACTERISTIC_MIXING_DISTANCE = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__TRANSMISSION_RATE = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__TRANSMISSION_RATE;

	/**
	 * The feature id for the '<em><b>Non Linearity Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__NON_LINEARITY_COEFFICIENT = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__NON_LINEARITY_COEFFICIENT;

	/**
	 * The feature id for the '<em><b>Recovery Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__RECOVERY_RATE = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__RECOVERY_RATE;

	/**
	 * The feature id for the '<em><b>Infectious Mortality Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__INFECTIOUS_MORTALITY_RATE = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE;

	/**
	 * The feature id for the '<em><b>Parent Disease</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__PARENT_DISEASE = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__PARENT_DISEASE;

	/**
	 * The feature id for the '<em><b>Transformer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__TRANSFORMER = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__TRANSFORMER;

	/**
	 * The feature id for the '<em><b>Evolved At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__EVOLVED_AT = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__EVOLVED_AT;

	/**
	 * The feature id for the '<em><b>Genome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__GENOME = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__GENOME;

	/**
	 * The feature id for the '<em><b>Evolution Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__EVOLUTION_COUNT = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__EVOLUTION_COUNT;

	/**
	 * The feature id for the '<em><b>Case Mutation Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__CASE_MUTATION_RATE = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__CASE_MUTATION_RATE;

	/**
	 * The feature id for the '<em><b>Genome Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__GENOME_LENGTH = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__GENOME_LENGTH;

	/**
	 * The feature id for the '<em><b>Genetic Dist Nonlin Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__GENETIC_DIST_NONLIN_EXPONENT = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__GENETIC_DIST_NONLIN_EXPONENT;

	/**
	 * The feature id for the '<em><b>Immunity Loss Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__IMMUNITY_LOSS_RATE = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__IMMUNITY_LOSS_RATE;

	/**
	 * The feature id for the '<em><b>Cross Immunity Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__CROSS_IMMUNITY_RATE = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL__CROSS_IMMUNITY_RATE;

	/**
	 * The feature id for the '<em><b>Other To Other Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__OTHER_TO_OTHER_TRANSMISSION_RATE = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Other Recovery Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__OTHER_RECOVERY_RATE = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Other To Host Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__OTHER_TO_HOST_TRANSMISSION_RATE = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Temperature Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__TEMPERATURE_FACTOR = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Other Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__OTHER_POPULATION_IDENTIFIER = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Other Immunity Loss Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__OTHER_IMMUNITY_LOSS_RATE = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Incubation Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL__INCUBATION_RATE = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Evolving Cross Species Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLVING_CROSS_SPECIES_MODEL_FEATURE_COUNT = EvolvingPackage.EVOLVING_SIR_DISEASE_MODEL_FEATURE_COUNT + 7;


	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelLabel
	 * @generated
	 */
	EClass getEvolvingCrossSpeciesModelLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelLabelValue <em>Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Value</em>'.
	 * @see org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelLabelValue
	 * @generated
	 */
	EClass getEvolvingCrossSpeciesModelLabelValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelLabelValue#getE <em>E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>E</em>'.
	 * @see org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelLabelValue#getE()
	 * @see #getEvolvingCrossSpeciesModelLabelValue()
	 * @generated
	 */
	EAttribute getEvolvingCrossSpeciesModelLabelValue_E();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelLabelValue#getSeff <em>Seff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seff</em>'.
	 * @see org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelLabelValue#getSeff()
	 * @see #getEvolvingCrossSpeciesModelLabelValue()
	 * @generated
	 */
	EAttribute getEvolvingCrossSpeciesModelLabelValue_Seff();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel <em>Evolving Cross Species Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evolving Cross Species Model</em>'.
	 * @see org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel
	 * @generated
	 */
	EClass getEvolvingCrossSpeciesModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel#getOtherToOtherTransmissionRate <em>Other To Other Transmission Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other To Other Transmission Rate</em>'.
	 * @see org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel#getOtherToOtherTransmissionRate()
	 * @see #getEvolvingCrossSpeciesModel()
	 * @generated
	 */
	EAttribute getEvolvingCrossSpeciesModel_OtherToOtherTransmissionRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel#getOtherRecoveryRate <em>Other Recovery Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other Recovery Rate</em>'.
	 * @see org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel#getOtherRecoveryRate()
	 * @see #getEvolvingCrossSpeciesModel()
	 * @generated
	 */
	EAttribute getEvolvingCrossSpeciesModel_OtherRecoveryRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel#getOtherToHostTransmissionRate <em>Other To Host Transmission Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other To Host Transmission Rate</em>'.
	 * @see org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel#getOtherToHostTransmissionRate()
	 * @see #getEvolvingCrossSpeciesModel()
	 * @generated
	 */
	EAttribute getEvolvingCrossSpeciesModel_OtherToHostTransmissionRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel#getTemperatureFactor <em>Temperature Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature Factor</em>'.
	 * @see org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel#getTemperatureFactor()
	 * @see #getEvolvingCrossSpeciesModel()
	 * @generated
	 */
	EAttribute getEvolvingCrossSpeciesModel_TemperatureFactor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel#getOtherPopulationIdentifier <em>Other Population Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other Population Identifier</em>'.
	 * @see org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel#getOtherPopulationIdentifier()
	 * @see #getEvolvingCrossSpeciesModel()
	 * @generated
	 */
	EAttribute getEvolvingCrossSpeciesModel_OtherPopulationIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel#getOtherImmunityLossRate <em>Other Immunity Loss Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other Immunity Loss Rate</em>'.
	 * @see org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel#getOtherImmunityLossRate()
	 * @see #getEvolvingCrossSpeciesModel()
	 * @generated
	 */
	EAttribute getEvolvingCrossSpeciesModel_OtherImmunityLossRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel#getIncubationRate <em>Incubation Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incubation Rate</em>'.
	 * @see org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel#getIncubationRate()
	 * @see #getEvolvingCrossSpeciesModel()
	 * @generated
	 */
	EAttribute getEvolvingCrossSpeciesModel_IncubationRate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EvolvingCrossSpeciesModelFactory getEvolvingCrossSpeciesModelFactory();

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
		 * The meta object literal for the '{@link org.eclipse.stem.evolvingcrossspeciesmodel.impl.EvolvingCrossSpeciesModelLabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.evolvingcrossspeciesmodel.impl.EvolvingCrossSpeciesModelLabelImpl
		 * @see org.eclipse.stem.evolvingcrossspeciesmodel.impl.EvolvingCrossSpeciesModelPackageImpl#getEvolvingCrossSpeciesModelLabel()
		 * @generated
		 */
		EClass EVOLVING_CROSS_SPECIES_MODEL_LABEL = eINSTANCE.getEvolvingCrossSpeciesModelLabel();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.evolvingcrossspeciesmodel.impl.EvolvingCrossSpeciesModelLabelValueImpl <em>Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.evolvingcrossspeciesmodel.impl.EvolvingCrossSpeciesModelLabelValueImpl
		 * @see org.eclipse.stem.evolvingcrossspeciesmodel.impl.EvolvingCrossSpeciesModelPackageImpl#getEvolvingCrossSpeciesModelLabelValue()
		 * @generated
		 */
		EClass EVOLVING_CROSS_SPECIES_MODEL_LABEL_VALUE = eINSTANCE.getEvolvingCrossSpeciesModelLabelValue();

		/**
		 * The meta object literal for the '<em><b>E</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVOLVING_CROSS_SPECIES_MODEL_LABEL_VALUE__E = eINSTANCE.getEvolvingCrossSpeciesModelLabelValue_E();

		/**
		 * The meta object literal for the '<em><b>Seff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVOLVING_CROSS_SPECIES_MODEL_LABEL_VALUE__SEFF = eINSTANCE.getEvolvingCrossSpeciesModelLabelValue_Seff();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.evolvingcrossspeciesmodel.impl.EvolvingCrossSpeciesModelImpl <em>Evolving Cross Species Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.evolvingcrossspeciesmodel.impl.EvolvingCrossSpeciesModelImpl
		 * @see org.eclipse.stem.evolvingcrossspeciesmodel.impl.EvolvingCrossSpeciesModelPackageImpl#getEvolvingCrossSpeciesModel()
		 * @generated
		 */
		EClass EVOLVING_CROSS_SPECIES_MODEL = eINSTANCE.getEvolvingCrossSpeciesModel();

		/**
		 * The meta object literal for the '<em><b>Other To Other Transmission Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVOLVING_CROSS_SPECIES_MODEL__OTHER_TO_OTHER_TRANSMISSION_RATE = eINSTANCE.getEvolvingCrossSpeciesModel_OtherToOtherTransmissionRate();

		/**
		 * The meta object literal for the '<em><b>Other Recovery Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVOLVING_CROSS_SPECIES_MODEL__OTHER_RECOVERY_RATE = eINSTANCE.getEvolvingCrossSpeciesModel_OtherRecoveryRate();

		/**
		 * The meta object literal for the '<em><b>Other To Host Transmission Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVOLVING_CROSS_SPECIES_MODEL__OTHER_TO_HOST_TRANSMISSION_RATE = eINSTANCE.getEvolvingCrossSpeciesModel_OtherToHostTransmissionRate();

		/**
		 * The meta object literal for the '<em><b>Temperature Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVOLVING_CROSS_SPECIES_MODEL__TEMPERATURE_FACTOR = eINSTANCE.getEvolvingCrossSpeciesModel_TemperatureFactor();

		/**
		 * The meta object literal for the '<em><b>Other Population Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVOLVING_CROSS_SPECIES_MODEL__OTHER_POPULATION_IDENTIFIER = eINSTANCE.getEvolvingCrossSpeciesModel_OtherPopulationIdentifier();

		/**
		 * The meta object literal for the '<em><b>Other Immunity Loss Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVOLVING_CROSS_SPECIES_MODEL__OTHER_IMMUNITY_LOSS_RATE = eINSTANCE.getEvolvingCrossSpeciesModel_OtherImmunityLossRate();

		/**
		 * The meta object literal for the '<em><b>Incubation Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVOLVING_CROSS_SPECIES_MODEL__INCUBATION_RATE = eINSTANCE.getEvolvingCrossSpeciesModel_IncubationRate();

	}

} //EvolvingCrossSpeciesModelPackage
