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
package org.eclipse.stem.diseasemodels.veterinary;

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
 * @see org.eclipse.stem.diseasemodels.veterinary.VeterinaryFactory
 * @model kind="package"
 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
 *        annotation="http:///org/eclipse/stem/modelgen/metamodel uri='platform:/resource/.stemgenerator/model/veterinary.metamodel'"
 * @generated
 */
public interface VeterinaryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "veterinary";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/stem/diseasemodels/veterinary/veterinary.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.stem.diseasemodels.veterinary";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VeterinaryPackage eINSTANCE = org.eclipse.stem.diseasemodels.veterinary.impl.VeterinaryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.veterinary.impl.SimpleVeterinaryDiseaseLabelImpl <em>Simple Veterinary Disease Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.veterinary.impl.SimpleVeterinaryDiseaseLabelImpl
	 * @see org.eclipse.stem.diseasemodels.veterinary.impl.VeterinaryPackageImpl#getSimpleVeterinaryDiseaseLabel()
	 * @generated
	 */
	int SIMPLE_VETERINARY_DISEASE_LABEL = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE_LABEL__URI = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE_LABEL__TYPE_URI = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE_LABEL__DUBLIN_CORE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>URI Of Identifiable To Be Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE_LABEL__CURRENT_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Identifiable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE_LABEL__IDENTIFIABLE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__IDENTIFIABLE;

	/**
	 * The feature id for the '<em><b>Next Value Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE_LABEL__NEXT_VALUE_VALID = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NEXT_VALUE_VALID;

	/**
	 * The feature id for the '<em><b>Next Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE_LABEL__NEXT_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NEXT_VALUE;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE_LABEL__DECORATOR = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DECORATOR;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE_LABEL__NODE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NODE;

	/**
	 * The feature id for the '<em><b>Delta Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE_LABEL__DELTA_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DELTA_VALUE;

	/**
	 * The feature id for the '<em><b>Temp Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE_LABEL__TEMP_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__TEMP_VALUE;

	/**
	 * The feature id for the '<em><b>Probe Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE_LABEL__PROBE_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__PROBE_VALUE;

	/**
	 * The feature id for the '<em><b>Error Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE_LABEL__ERROR_SCALE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__ERROR_SCALE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE_LABEL__IDENTIFIER = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Population Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE_LABEL__POPULATION_LABEL = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__POPULATION_LABEL;

	/**
	 * The feature id for the '<em><b>Population Model Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE_LABEL__POPULATION_MODEL_LABEL = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__POPULATION_MODEL_LABEL;

	/**
	 * The number of structural features of the '<em>Simple Veterinary Disease Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE_LABEL_FEATURE_COUNT = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.veterinary.impl.SimpleVeterinaryDiseaseLabelValueImpl <em>Simple Veterinary Disease Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.veterinary.impl.SimpleVeterinaryDiseaseLabelValueImpl
	 * @see org.eclipse.stem.diseasemodels.veterinary.impl.VeterinaryPackageImpl#getSimpleVeterinaryDiseaseLabelValue()
	 * @generated
	 */
	int SIMPLE_VETERINARY_DISEASE_LABEL_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Arrivals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE_LABEL_VALUE__ARRIVALS = StandardPackage.SI_LABEL_VALUE__ARRIVALS;

	/**
	 * The feature id for the '<em><b>Departures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE_LABEL_VALUE__DEPARTURES = StandardPackage.SI_LABEL_VALUE__DEPARTURES;

	/**
	 * The feature id for the '<em><b>Population Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE_LABEL_VALUE__POPULATION_COUNT = StandardPackage.SI_LABEL_VALUE__POPULATION_COUNT;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE_LABEL_VALUE__S = StandardPackage.SI_LABEL_VALUE__S;

	/**
	 * The feature id for the '<em><b>Incidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE_LABEL_VALUE__INCIDENCE = StandardPackage.SI_LABEL_VALUE__INCIDENCE;

	/**
	 * The feature id for the '<em><b>Disease Deaths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE_LABEL_VALUE__DISEASE_DEATHS = StandardPackage.SI_LABEL_VALUE__DISEASE_DEATHS;

	/**
	 * The feature id for the '<em><b>I</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE_LABEL_VALUE__I = StandardPackage.SI_LABEL_VALUE__I;

	/**
	 * The number of structural features of the '<em>Simple Veterinary Disease Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE_LABEL_VALUE_FEATURE_COUNT = StandardPackage.SI_LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.veterinary.impl.SimpleVeterinaryDiseaseImpl <em>Simple Veterinary Disease</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.veterinary.impl.SimpleVeterinaryDiseaseImpl
	 * @see org.eclipse.stem.diseasemodels.veterinary.impl.VeterinaryPackageImpl#getSimpleVeterinaryDisease()
	 * @generated
	 */
	int SIMPLE_VETERINARY_DISEASE = 2;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE__URI = StandardPackage.SI__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE__TYPE_URI = StandardPackage.SI__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE__DUBLIN_CORE = StandardPackage.SI__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE__LABELS_TO_UPDATE = StandardPackage.SI__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE__GRAPH = StandardPackage.SI__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE__ENABLED = StandardPackage.SI__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE__GRAPH_DECORATED = StandardPackage.SI__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE__PROGRESS = StandardPackage.SI__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE__ADD_STOCHASTIC_NOISE = StandardPackage.SI__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE__RANDOM_SEED = StandardPackage.SI__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE__BINOMIAL_DISTRIBUTION = StandardPackage.SI__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE__POPULATION_IDENTIFIER = StandardPackage.SI__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE__TIME_PERIOD = StandardPackage.SI__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE__DISEASE_NAME = StandardPackage.SI__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE__FINITE_DIFFERENCE = StandardPackage.SI__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE__FREQUENCY_DEPENDENT = StandardPackage.SI__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE__REFERENCE_POPULATION_DENSITY = StandardPackage.SI__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE__ROAD_NETWORK_INFECTIOUS_PROPORTION = StandardPackage.SI__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE__CHARACTERISTIC_MIXING_DISTANCE = StandardPackage.SI__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE__TRANSMISSION_RATE = StandardPackage.SI__TRANSMISSION_RATE;

	/**
	 * The feature id for the '<em><b>Non Linearity Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE__NON_LINEARITY_COEFFICIENT = StandardPackage.SI__NON_LINEARITY_COEFFICIENT;

	/**
	 * The feature id for the '<em><b>Recovery Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE__RECOVERY_RATE = StandardPackage.SI__RECOVERY_RATE;

	/**
	 * The feature id for the '<em><b>Infectious Mortality Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE__INFECTIOUS_MORTALITY_RATE = StandardPackage.SI__INFECTIOUS_MORTALITY_RATE;

	/**
	 * The feature id for the '<em><b>Environmental Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE__ENVIRONMENTAL_TRANSMISSION_RATE = StandardPackage.SI_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Veterinary Disease</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VETERINARY_DISEASE_FEATURE_COUNT = StandardPackage.SI_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.veterinary.impl.ContaminatedUnitsLabelImpl <em>Contaminated Units Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.veterinary.impl.ContaminatedUnitsLabelImpl
	 * @see org.eclipse.stem.diseasemodels.veterinary.impl.VeterinaryPackageImpl#getContaminatedUnitsLabel()
	 * @generated
	 */
	int CONTAMINATED_UNITS_LABEL = 3;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS_LABEL__URI = org.eclipse.stem.populationmodels.standard.StandardPackage.STANDARD_POPULATION_MODEL_LABEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS_LABEL__TYPE_URI = org.eclipse.stem.populationmodels.standard.StandardPackage.STANDARD_POPULATION_MODEL_LABEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS_LABEL__DUBLIN_CORE = org.eclipse.stem.populationmodels.standard.StandardPackage.STANDARD_POPULATION_MODEL_LABEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>URI Of Identifiable To Be Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED = org.eclipse.stem.populationmodels.standard.StandardPackage.STANDARD_POPULATION_MODEL_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS_LABEL__CURRENT_VALUE = org.eclipse.stem.populationmodels.standard.StandardPackage.STANDARD_POPULATION_MODEL_LABEL__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Identifiable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS_LABEL__IDENTIFIABLE = org.eclipse.stem.populationmodels.standard.StandardPackage.STANDARD_POPULATION_MODEL_LABEL__IDENTIFIABLE;

	/**
	 * The feature id for the '<em><b>Next Value Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS_LABEL__NEXT_VALUE_VALID = org.eclipse.stem.populationmodels.standard.StandardPackage.STANDARD_POPULATION_MODEL_LABEL__NEXT_VALUE_VALID;

	/**
	 * The feature id for the '<em><b>Next Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS_LABEL__NEXT_VALUE = org.eclipse.stem.populationmodels.standard.StandardPackage.STANDARD_POPULATION_MODEL_LABEL__NEXT_VALUE;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS_LABEL__DECORATOR = org.eclipse.stem.populationmodels.standard.StandardPackage.STANDARD_POPULATION_MODEL_LABEL__DECORATOR;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS_LABEL__NODE = org.eclipse.stem.populationmodels.standard.StandardPackage.STANDARD_POPULATION_MODEL_LABEL__NODE;

	/**
	 * The feature id for the '<em><b>Delta Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS_LABEL__DELTA_VALUE = org.eclipse.stem.populationmodels.standard.StandardPackage.STANDARD_POPULATION_MODEL_LABEL__DELTA_VALUE;

	/**
	 * The feature id for the '<em><b>Temp Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS_LABEL__TEMP_VALUE = org.eclipse.stem.populationmodels.standard.StandardPackage.STANDARD_POPULATION_MODEL_LABEL__TEMP_VALUE;

	/**
	 * The feature id for the '<em><b>Probe Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS_LABEL__PROBE_VALUE = org.eclipse.stem.populationmodels.standard.StandardPackage.STANDARD_POPULATION_MODEL_LABEL__PROBE_VALUE;

	/**
	 * The feature id for the '<em><b>Error Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS_LABEL__ERROR_SCALE = org.eclipse.stem.populationmodels.standard.StandardPackage.STANDARD_POPULATION_MODEL_LABEL__ERROR_SCALE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS_LABEL__IDENTIFIER = org.eclipse.stem.populationmodels.standard.StandardPackage.STANDARD_POPULATION_MODEL_LABEL__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Population Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS_LABEL__POPULATION_LABEL = org.eclipse.stem.populationmodels.standard.StandardPackage.STANDARD_POPULATION_MODEL_LABEL__POPULATION_LABEL;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS_LABEL__POPULATION_IDENTIFIER = org.eclipse.stem.populationmodels.standard.StandardPackage.STANDARD_POPULATION_MODEL_LABEL__POPULATION_IDENTIFIER;

	/**
	 * The number of structural features of the '<em>Contaminated Units Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS_LABEL_FEATURE_COUNT = org.eclipse.stem.populationmodels.standard.StandardPackage.STANDARD_POPULATION_MODEL_LABEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.veterinary.impl.ContaminatedUnitsLabelValueImpl <em>Contaminated Units Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.veterinary.impl.ContaminatedUnitsLabelValueImpl
	 * @see org.eclipse.stem.diseasemodels.veterinary.impl.VeterinaryPackageImpl#getContaminatedUnitsLabelValue()
	 * @generated
	 */
	int CONTAMINATED_UNITS_LABEL_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Arrivals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS_LABEL_VALUE__ARRIVALS = org.eclipse.stem.populationmodels.standard.StandardPackage.STANDARD_POPULATION_MODEL_LABEL_VALUE__ARRIVALS;

	/**
	 * The feature id for the '<em><b>Departures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS_LABEL_VALUE__DEPARTURES = org.eclipse.stem.populationmodels.standard.StandardPackage.STANDARD_POPULATION_MODEL_LABEL_VALUE__DEPARTURES;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS_LABEL_VALUE__COUNT = org.eclipse.stem.populationmodels.standard.StandardPackage.STANDARD_POPULATION_MODEL_LABEL_VALUE__COUNT;

	/**
	 * The feature id for the '<em><b>Births</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS_LABEL_VALUE__BIRTHS = org.eclipse.stem.populationmodels.standard.StandardPackage.STANDARD_POPULATION_MODEL_LABEL_VALUE__BIRTHS;

	/**
	 * The feature id for the '<em><b>Deaths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS_LABEL_VALUE__DEATHS = org.eclipse.stem.populationmodels.standard.StandardPackage.STANDARD_POPULATION_MODEL_LABEL_VALUE__DEATHS;

	/**
	 * The feature id for the '<em><b>Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS_LABEL_VALUE__DENSITY = org.eclipse.stem.populationmodels.standard.StandardPackage.STANDARD_POPULATION_MODEL_LABEL_VALUE__DENSITY;

	/**
	 * The number of structural features of the '<em>Contaminated Units Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS_LABEL_VALUE_FEATURE_COUNT = org.eclipse.stem.populationmodels.standard.StandardPackage.STANDARD_POPULATION_MODEL_LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.veterinary.impl.ContaminatedUnitsImpl <em>Contaminated Units</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.veterinary.impl.ContaminatedUnitsImpl
	 * @see org.eclipse.stem.diseasemodels.veterinary.impl.VeterinaryPackageImpl#getContaminatedUnits()
	 * @generated
	 */
	int CONTAMINATED_UNITS = 5;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS__URI = org.eclipse.stem.populationmodels.standard.StandardPackage.POPULATION_MODEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS__TYPE_URI = org.eclipse.stem.populationmodels.standard.StandardPackage.POPULATION_MODEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS__DUBLIN_CORE = org.eclipse.stem.populationmodels.standard.StandardPackage.POPULATION_MODEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS__LABELS_TO_UPDATE = org.eclipse.stem.populationmodels.standard.StandardPackage.POPULATION_MODEL__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS__GRAPH = org.eclipse.stem.populationmodels.standard.StandardPackage.POPULATION_MODEL__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS__ENABLED = org.eclipse.stem.populationmodels.standard.StandardPackage.POPULATION_MODEL__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS__GRAPH_DECORATED = org.eclipse.stem.populationmodels.standard.StandardPackage.POPULATION_MODEL__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS__PROGRESS = org.eclipse.stem.populationmodels.standard.StandardPackage.POPULATION_MODEL__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS__ADD_STOCHASTIC_NOISE = org.eclipse.stem.populationmodels.standard.StandardPackage.POPULATION_MODEL__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS__RANDOM_SEED = org.eclipse.stem.populationmodels.standard.StandardPackage.POPULATION_MODEL__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS__BINOMIAL_DISTRIBUTION = org.eclipse.stem.populationmodels.standard.StandardPackage.POPULATION_MODEL__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS__POPULATION_IDENTIFIER = org.eclipse.stem.populationmodels.standard.StandardPackage.POPULATION_MODEL__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS__NAME = org.eclipse.stem.populationmodels.standard.StandardPackage.POPULATION_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Target ISO Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS__TARGET_ISO_KEY = org.eclipse.stem.populationmodels.standard.StandardPackage.POPULATION_MODEL__TARGET_ISO_KEY;

	/**
	 * The feature id for the '<em><b>Initial Rescaling Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS__INITIAL_RESCALING_FACTOR = org.eclipse.stem.populationmodels.standard.StandardPackage.POPULATION_MODEL__INITIAL_RESCALING_FACTOR;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS__TIME_PERIOD = org.eclipse.stem.populationmodels.standard.StandardPackage.POPULATION_MODEL__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Dissapation Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS__DISSAPATION_RATE = org.eclipse.stem.populationmodels.standard.StandardPackage.POPULATION_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shedding Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS__SHEDDING_FACTOR = org.eclipse.stem.populationmodels.standard.StandardPackage.POPULATION_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Contaminated Units</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINATED_UNITS_FEATURE_COUNT = org.eclipse.stem.populationmodels.standard.StandardPackage.POPULATION_MODEL_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.veterinary.SimpleVeterinaryDiseaseLabel <em>Simple Veterinary Disease Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Veterinary Disease Label</em>'.
	 * @see org.eclipse.stem.diseasemodels.veterinary.SimpleVeterinaryDiseaseLabel
	 * @generated
	 */
	EClass getSimpleVeterinaryDiseaseLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.veterinary.SimpleVeterinaryDiseaseLabelValue <em>Simple Veterinary Disease Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Veterinary Disease Label Value</em>'.
	 * @see org.eclipse.stem.diseasemodels.veterinary.SimpleVeterinaryDiseaseLabelValue
	 * @generated
	 */
	EClass getSimpleVeterinaryDiseaseLabelValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.veterinary.SimpleVeterinaryDisease <em>Simple Veterinary Disease</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Veterinary Disease</em>'.
	 * @see org.eclipse.stem.diseasemodels.veterinary.SimpleVeterinaryDisease
	 * @generated
	 */
	EClass getSimpleVeterinaryDisease();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.veterinary.SimpleVeterinaryDisease#getEnvironmentalTransmissionRate <em>Environmental Transmission Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Environmental Transmission Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.veterinary.SimpleVeterinaryDisease#getEnvironmentalTransmissionRate()
	 * @see #getSimpleVeterinaryDisease()
	 * @generated
	 */
	EAttribute getSimpleVeterinaryDisease_EnvironmentalTransmissionRate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.veterinary.ContaminatedUnitsLabel <em>Contaminated Units Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contaminated Units Label</em>'.
	 * @see org.eclipse.stem.diseasemodels.veterinary.ContaminatedUnitsLabel
	 * @generated
	 */
	EClass getContaminatedUnitsLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.veterinary.ContaminatedUnitsLabelValue <em>Contaminated Units Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contaminated Units Label Value</em>'.
	 * @see org.eclipse.stem.diseasemodels.veterinary.ContaminatedUnitsLabelValue
	 * @generated
	 */
	EClass getContaminatedUnitsLabelValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.veterinary.ContaminatedUnits <em>Contaminated Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contaminated Units</em>'.
	 * @see org.eclipse.stem.diseasemodels.veterinary.ContaminatedUnits
	 * @generated
	 */
	EClass getContaminatedUnits();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.veterinary.ContaminatedUnits#getDissapationRate <em>Dissapation Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dissapation Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.veterinary.ContaminatedUnits#getDissapationRate()
	 * @see #getContaminatedUnits()
	 * @generated
	 */
	EAttribute getContaminatedUnits_DissapationRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.veterinary.ContaminatedUnits#getSheddingFactor <em>Shedding Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shedding Factor</em>'.
	 * @see org.eclipse.stem.diseasemodels.veterinary.ContaminatedUnits#getSheddingFactor()
	 * @see #getContaminatedUnits()
	 * @generated
	 */
	EAttribute getContaminatedUnits_SheddingFactor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VeterinaryFactory getVeterinaryFactory();

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
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.veterinary.impl.SimpleVeterinaryDiseaseLabelImpl <em>Simple Veterinary Disease Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.veterinary.impl.SimpleVeterinaryDiseaseLabelImpl
		 * @see org.eclipse.stem.diseasemodels.veterinary.impl.VeterinaryPackageImpl#getSimpleVeterinaryDiseaseLabel()
		 * @generated
		 */
		EClass SIMPLE_VETERINARY_DISEASE_LABEL = eINSTANCE.getSimpleVeterinaryDiseaseLabel();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.veterinary.impl.SimpleVeterinaryDiseaseLabelValueImpl <em>Simple Veterinary Disease Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.veterinary.impl.SimpleVeterinaryDiseaseLabelValueImpl
		 * @see org.eclipse.stem.diseasemodels.veterinary.impl.VeterinaryPackageImpl#getSimpleVeterinaryDiseaseLabelValue()
		 * @generated
		 */
		EClass SIMPLE_VETERINARY_DISEASE_LABEL_VALUE = eINSTANCE.getSimpleVeterinaryDiseaseLabelValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.veterinary.impl.SimpleVeterinaryDiseaseImpl <em>Simple Veterinary Disease</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.veterinary.impl.SimpleVeterinaryDiseaseImpl
		 * @see org.eclipse.stem.diseasemodels.veterinary.impl.VeterinaryPackageImpl#getSimpleVeterinaryDisease()
		 * @generated
		 */
		EClass SIMPLE_VETERINARY_DISEASE = eINSTANCE.getSimpleVeterinaryDisease();

		/**
		 * The meta object literal for the '<em><b>Environmental Transmission Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_VETERINARY_DISEASE__ENVIRONMENTAL_TRANSMISSION_RATE = eINSTANCE.getSimpleVeterinaryDisease_EnvironmentalTransmissionRate();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.veterinary.impl.ContaminatedUnitsLabelImpl <em>Contaminated Units Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.veterinary.impl.ContaminatedUnitsLabelImpl
		 * @see org.eclipse.stem.diseasemodels.veterinary.impl.VeterinaryPackageImpl#getContaminatedUnitsLabel()
		 * @generated
		 */
		EClass CONTAMINATED_UNITS_LABEL = eINSTANCE.getContaminatedUnitsLabel();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.veterinary.impl.ContaminatedUnitsLabelValueImpl <em>Contaminated Units Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.veterinary.impl.ContaminatedUnitsLabelValueImpl
		 * @see org.eclipse.stem.diseasemodels.veterinary.impl.VeterinaryPackageImpl#getContaminatedUnitsLabelValue()
		 * @generated
		 */
		EClass CONTAMINATED_UNITS_LABEL_VALUE = eINSTANCE.getContaminatedUnitsLabelValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.veterinary.impl.ContaminatedUnitsImpl <em>Contaminated Units</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.veterinary.impl.ContaminatedUnitsImpl
		 * @see org.eclipse.stem.diseasemodels.veterinary.impl.VeterinaryPackageImpl#getContaminatedUnits()
		 * @generated
		 */
		EClass CONTAMINATED_UNITS = eINSTANCE.getContaminatedUnits();

		/**
		 * The meta object literal for the '<em><b>Dissapation Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAMINATED_UNITS__DISSAPATION_RATE = eINSTANCE.getContaminatedUnits_DissapationRate();

		/**
		 * The meta object literal for the '<em><b>Shedding Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAMINATED_UNITS__SHEDDING_FACTOR = eINSTANCE.getContaminatedUnits_SheddingFactor();

	}

} //VeterinaryPackage
