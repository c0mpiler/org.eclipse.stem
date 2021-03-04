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
package org.eclipse.stem.diseasemodels.poliodiseasemodel;

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
 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.PolioFactory
 * @model kind="package"
 * @generated
 */
public interface PolioPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "poliodiseasemodel"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/stem/diseasemodels/polio.ecore"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.stem.diseasemodels.poliodiseasemodel"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PolioPackage eINSTANCE = org.eclipse.stem.diseasemodels.poliodiseasemodel.impl.PolioPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.impl.OralPolioVaccineModelImpl <em>Oral Polio Vaccine Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.impl.OralPolioVaccineModelImpl
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.impl.PolioPackageImpl#getOralPolioVaccineModel()
	 * @generated
	 */
	int ORAL_POLIO_VACCINE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORAL_POLIO_VACCINE_MODEL__URI = StandardPackage.SEIR__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORAL_POLIO_VACCINE_MODEL__TYPE_URI = StandardPackage.SEIR__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORAL_POLIO_VACCINE_MODEL__DUBLIN_CORE = StandardPackage.SEIR__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORAL_POLIO_VACCINE_MODEL__LABELS_TO_UPDATE = StandardPackage.SEIR__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORAL_POLIO_VACCINE_MODEL__GRAPH = StandardPackage.SEIR__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORAL_POLIO_VACCINE_MODEL__ENABLED = StandardPackage.SEIR__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORAL_POLIO_VACCINE_MODEL__GRAPH_DECORATED = StandardPackage.SEIR__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORAL_POLIO_VACCINE_MODEL__PROGRESS = StandardPackage.SEIR__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORAL_POLIO_VACCINE_MODEL__ADD_STOCHASTIC_NOISE = StandardPackage.SEIR__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORAL_POLIO_VACCINE_MODEL__RANDOM_SEED = StandardPackage.SEIR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORAL_POLIO_VACCINE_MODEL__BINOMIAL_DISTRIBUTION = StandardPackage.SEIR__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORAL_POLIO_VACCINE_MODEL__POPULATION_IDENTIFIER = StandardPackage.SEIR__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORAL_POLIO_VACCINE_MODEL__TIME_PERIOD = StandardPackage.SEIR__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORAL_POLIO_VACCINE_MODEL__DISEASE_NAME = StandardPackage.SEIR__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORAL_POLIO_VACCINE_MODEL__FINITE_DIFFERENCE = StandardPackage.SEIR__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORAL_POLIO_VACCINE_MODEL__FREQUENCY_DEPENDENT = StandardPackage.SEIR__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORAL_POLIO_VACCINE_MODEL__REFERENCE_POPULATION_DENSITY = StandardPackage.SEIR__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORAL_POLIO_VACCINE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = StandardPackage.SEIR__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORAL_POLIO_VACCINE_MODEL__CHARACTERISTIC_MIXING_DISTANCE = StandardPackage.SEIR__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORAL_POLIO_VACCINE_MODEL__TRANSMISSION_RATE = StandardPackage.SEIR__TRANSMISSION_RATE;

	/**
	 * The feature id for the '<em><b>Non Linearity Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORAL_POLIO_VACCINE_MODEL__NON_LINEARITY_COEFFICIENT = StandardPackage.SEIR__NON_LINEARITY_COEFFICIENT;

	/**
	 * The feature id for the '<em><b>Recovery Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORAL_POLIO_VACCINE_MODEL__RECOVERY_RATE = StandardPackage.SEIR__RECOVERY_RATE;

	/**
	 * The feature id for the '<em><b>Infectious Mortality Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORAL_POLIO_VACCINE_MODEL__INFECTIOUS_MORTALITY_RATE = StandardPackage.SEIR__INFECTIOUS_MORTALITY_RATE;

	/**
	 * The feature id for the '<em><b>Immunity Loss Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORAL_POLIO_VACCINE_MODEL__IMMUNITY_LOSS_RATE = StandardPackage.SEIR__IMMUNITY_LOSS_RATE;

	/**
	 * The feature id for the '<em><b>Incubation Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORAL_POLIO_VACCINE_MODEL__INCUBATION_RATE = StandardPackage.SEIR__INCUBATION_RATE;

	/**
	 * The feature id for the '<em><b>Efficacy Vaccine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORAL_POLIO_VACCINE_MODEL__EFFICACY_VACCINE = StandardPackage.SEIR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reversion Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORAL_POLIO_VACCINE_MODEL__REVERSION_RATE = StandardPackage.SEIR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Partial Susceptibility Vaccine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORAL_POLIO_VACCINE_MODEL__PARTIAL_SUSCEPTIBILITY_VACCINE = StandardPackage.SEIR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trans Rate Vaccine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORAL_POLIO_VACCINE_MODEL__TRANS_RATE_VACCINE = StandardPackage.SEIR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Incub Rate Vaccine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORAL_POLIO_VACCINE_MODEL__INCUB_RATE_VACCINE = StandardPackage.SEIR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Infect Recovery Rate Vaccine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORAL_POLIO_VACCINE_MODEL__INFECT_RECOVERY_RATE_VACCINE = StandardPackage.SEIR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Paralytic Fraction Vaccine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORAL_POLIO_VACCINE_MODEL__PARALYTIC_FRACTION_VACCINE = StandardPackage.SEIR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Paralytic Fraction Wild</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORAL_POLIO_VACCINE_MODEL__PARALYTIC_FRACTION_WILD = StandardPackage.SEIR_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Oral Polio Vaccine Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORAL_POLIO_VACCINE_MODEL_FEATURE_COUNT = StandardPackage.SEIR_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.impl.OpvLabelImpl <em>Opv Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.impl.OpvLabelImpl
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.impl.PolioPackageImpl#getOpvLabel()
	 * @generated
	 */
	int OPV_LABEL = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPV_LABEL__URI = StandardPackage.SEIR_LABEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPV_LABEL__TYPE_URI = StandardPackage.SEIR_LABEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPV_LABEL__DUBLIN_CORE = StandardPackage.SEIR_LABEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>URI Of Identifiable To Be Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPV_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED = StandardPackage.SEIR_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPV_LABEL__CURRENT_VALUE = StandardPackage.SEIR_LABEL__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Identifiable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPV_LABEL__IDENTIFIABLE = StandardPackage.SEIR_LABEL__IDENTIFIABLE;

	/**
	 * The feature id for the '<em><b>Next Value Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPV_LABEL__NEXT_VALUE_VALID = StandardPackage.SEIR_LABEL__NEXT_VALUE_VALID;

	/**
	 * The feature id for the '<em><b>Next Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPV_LABEL__NEXT_VALUE = StandardPackage.SEIR_LABEL__NEXT_VALUE;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPV_LABEL__DECORATOR = StandardPackage.SEIR_LABEL__DECORATOR;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPV_LABEL__NODE = StandardPackage.SEIR_LABEL__NODE;

	/**
	 * The feature id for the '<em><b>Delta Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPV_LABEL__DELTA_VALUE = StandardPackage.SEIR_LABEL__DELTA_VALUE;

	/**
	 * The feature id for the '<em><b>Temp Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPV_LABEL__TEMP_VALUE = StandardPackage.SEIR_LABEL__TEMP_VALUE;

	/**
	 * The feature id for the '<em><b>Probe Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPV_LABEL__PROBE_VALUE = StandardPackage.SEIR_LABEL__PROBE_VALUE;

	/**
	 * The feature id for the '<em><b>Error Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPV_LABEL__ERROR_SCALE = StandardPackage.SEIR_LABEL__ERROR_SCALE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPV_LABEL__IDENTIFIER = StandardPackage.SEIR_LABEL__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Population Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPV_LABEL__POPULATION_LABEL = StandardPackage.SEIR_LABEL__POPULATION_LABEL;

	/**
	 * The feature id for the '<em><b>Population Model Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPV_LABEL__POPULATION_MODEL_LABEL = StandardPackage.SEIR_LABEL__POPULATION_MODEL_LABEL;

	/**
	 * The number of structural features of the '<em>Opv Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPV_LABEL_FEATURE_COUNT = StandardPackage.SEIR_LABEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.impl.OpvLabelValueImpl <em>Opv Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.impl.OpvLabelValueImpl
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.impl.PolioPackageImpl#getOpvLabelValue()
	 * @generated
	 */
	int OPV_LABEL_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Arrivals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPV_LABEL_VALUE__ARRIVALS = StandardPackage.SEIR_LABEL_VALUE__ARRIVALS;

	/**
	 * The feature id for the '<em><b>Departures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPV_LABEL_VALUE__DEPARTURES = StandardPackage.SEIR_LABEL_VALUE__DEPARTURES;

	/**
	 * The feature id for the '<em><b>Population Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPV_LABEL_VALUE__POPULATION_COUNT = StandardPackage.SEIR_LABEL_VALUE__POPULATION_COUNT;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPV_LABEL_VALUE__S = StandardPackage.SEIR_LABEL_VALUE__S;

	/**
	 * The feature id for the '<em><b>Incidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPV_LABEL_VALUE__INCIDENCE = StandardPackage.SEIR_LABEL_VALUE__INCIDENCE;

	/**
	 * The feature id for the '<em><b>Disease Deaths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPV_LABEL_VALUE__DISEASE_DEATHS = StandardPackage.SEIR_LABEL_VALUE__DISEASE_DEATHS;

	/**
	 * The feature id for the '<em><b>I</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPV_LABEL_VALUE__I = StandardPackage.SEIR_LABEL_VALUE__I;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPV_LABEL_VALUE__R = StandardPackage.SEIR_LABEL_VALUE__R;

	/**
	 * The feature id for the '<em><b>E</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPV_LABEL_VALUE__E = StandardPackage.SEIR_LABEL_VALUE__E;

	/**
	 * The feature id for the '<em><b>Sv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPV_LABEL_VALUE__SV = StandardPackage.SEIR_LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPV_LABEL_VALUE__EV = StandardPackage.SEIR_LABEL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>V</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPV_LABEL_VALUE__V = StandardPackage.SEIR_LABEL_VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPV_LABEL_VALUE__PV = StandardPackage.SEIR_LABEL_VALUE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPV_LABEL_VALUE__PW = StandardPackage.SEIR_LABEL_VALUE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Opv Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPV_LABEL_VALUE_FEATURE_COUNT = StandardPackage.SEIR_LABEL_VALUE_FEATURE_COUNT + 5;


	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel <em>Oral Polio Vaccine Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oral Polio Vaccine Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel
	 * @generated
	 */
	EClass getOralPolioVaccineModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel#getEfficacyVaccine <em>Efficacy Vaccine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Efficacy Vaccine</em>'.
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel#getEfficacyVaccine()
	 * @see #getOralPolioVaccineModel()
	 * @generated
	 */
	EAttribute getOralPolioVaccineModel_EfficacyVaccine();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel#getReversionRate <em>Reversion Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reversion Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel#getReversionRate()
	 * @see #getOralPolioVaccineModel()
	 * @generated
	 */
	EAttribute getOralPolioVaccineModel_ReversionRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel#getPartialSusceptibilityVaccine <em>Partial Susceptibility Vaccine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partial Susceptibility Vaccine</em>'.
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel#getPartialSusceptibilityVaccine()
	 * @see #getOralPolioVaccineModel()
	 * @generated
	 */
	EAttribute getOralPolioVaccineModel_PartialSusceptibilityVaccine();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel#getTransRateVaccine <em>Trans Rate Vaccine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trans Rate Vaccine</em>'.
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel#getTransRateVaccine()
	 * @see #getOralPolioVaccineModel()
	 * @generated
	 */
	EAttribute getOralPolioVaccineModel_TransRateVaccine();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel#getIncubRateVaccine <em>Incub Rate Vaccine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incub Rate Vaccine</em>'.
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel#getIncubRateVaccine()
	 * @see #getOralPolioVaccineModel()
	 * @generated
	 */
	EAttribute getOralPolioVaccineModel_IncubRateVaccine();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel#getInfectRecoveryRateVaccine <em>Infect Recovery Rate Vaccine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Infect Recovery Rate Vaccine</em>'.
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel#getInfectRecoveryRateVaccine()
	 * @see #getOralPolioVaccineModel()
	 * @generated
	 */
	EAttribute getOralPolioVaccineModel_InfectRecoveryRateVaccine();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel#getParalyticFractionVaccine <em>Paralytic Fraction Vaccine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paralytic Fraction Vaccine</em>'.
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel#getParalyticFractionVaccine()
	 * @see #getOralPolioVaccineModel()
	 * @generated
	 */
	EAttribute getOralPolioVaccineModel_ParalyticFractionVaccine();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel#getParalyticFractionWild <em>Paralytic Fraction Wild</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paralytic Fraction Wild</em>'.
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel#getParalyticFractionWild()
	 * @see #getOralPolioVaccineModel()
	 * @generated
	 */
	EAttribute getOralPolioVaccineModel_ParalyticFractionWild();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OpvLabel <em>Opv Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opv Label</em>'.
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.OpvLabel
	 * @generated
	 */
	EClass getOpvLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OpvLabelValue <em>Opv Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opv Label Value</em>'.
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.OpvLabelValue
	 * @generated
	 */
	EClass getOpvLabelValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OpvLabelValue#getSv <em>Sv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sv</em>'.
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.OpvLabelValue#getSv()
	 * @see #getOpvLabelValue()
	 * @generated
	 */
	EAttribute getOpvLabelValue_Sv();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OpvLabelValue#getEv <em>Ev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ev</em>'.
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.OpvLabelValue#getEv()
	 * @see #getOpvLabelValue()
	 * @generated
	 */
	EAttribute getOpvLabelValue_Ev();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OpvLabelValue#getV <em>V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>V</em>'.
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.OpvLabelValue#getV()
	 * @see #getOpvLabelValue()
	 * @generated
	 */
	EAttribute getOpvLabelValue_V();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OpvLabelValue#getPv <em>Pv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pv</em>'.
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.OpvLabelValue#getPv()
	 * @see #getOpvLabelValue()
	 * @generated
	 */
	EAttribute getOpvLabelValue_Pv();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OpvLabelValue#getPw <em>Pw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pw</em>'.
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.OpvLabelValue#getPw()
	 * @see #getOpvLabelValue()
	 * @generated
	 */
	EAttribute getOpvLabelValue_Pw();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PolioFactory getPolioFactory();

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
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.impl.OralPolioVaccineModelImpl <em>Oral Polio Vaccine Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.impl.OralPolioVaccineModelImpl
		 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.impl.PolioPackageImpl#getOralPolioVaccineModel()
		 * @generated
		 */
		EClass ORAL_POLIO_VACCINE_MODEL = eINSTANCE.getOralPolioVaccineModel();

		/**
		 * The meta object literal for the '<em><b>Efficacy Vaccine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORAL_POLIO_VACCINE_MODEL__EFFICACY_VACCINE = eINSTANCE.getOralPolioVaccineModel_EfficacyVaccine();

		/**
		 * The meta object literal for the '<em><b>Reversion Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORAL_POLIO_VACCINE_MODEL__REVERSION_RATE = eINSTANCE.getOralPolioVaccineModel_ReversionRate();

		/**
		 * The meta object literal for the '<em><b>Partial Susceptibility Vaccine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORAL_POLIO_VACCINE_MODEL__PARTIAL_SUSCEPTIBILITY_VACCINE = eINSTANCE.getOralPolioVaccineModel_PartialSusceptibilityVaccine();

		/**
		 * The meta object literal for the '<em><b>Trans Rate Vaccine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORAL_POLIO_VACCINE_MODEL__TRANS_RATE_VACCINE = eINSTANCE.getOralPolioVaccineModel_TransRateVaccine();

		/**
		 * The meta object literal for the '<em><b>Incub Rate Vaccine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORAL_POLIO_VACCINE_MODEL__INCUB_RATE_VACCINE = eINSTANCE.getOralPolioVaccineModel_IncubRateVaccine();

		/**
		 * The meta object literal for the '<em><b>Infect Recovery Rate Vaccine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORAL_POLIO_VACCINE_MODEL__INFECT_RECOVERY_RATE_VACCINE = eINSTANCE.getOralPolioVaccineModel_InfectRecoveryRateVaccine();

		/**
		 * The meta object literal for the '<em><b>Paralytic Fraction Vaccine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORAL_POLIO_VACCINE_MODEL__PARALYTIC_FRACTION_VACCINE = eINSTANCE.getOralPolioVaccineModel_ParalyticFractionVaccine();

		/**
		 * The meta object literal for the '<em><b>Paralytic Fraction Wild</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORAL_POLIO_VACCINE_MODEL__PARALYTIC_FRACTION_WILD = eINSTANCE.getOralPolioVaccineModel_ParalyticFractionWild();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.impl.OpvLabelImpl <em>Opv Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.impl.OpvLabelImpl
		 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.impl.PolioPackageImpl#getOpvLabel()
		 * @generated
		 */
		EClass OPV_LABEL = eINSTANCE.getOpvLabel();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.impl.OpvLabelValueImpl <em>Opv Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.impl.OpvLabelValueImpl
		 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.impl.PolioPackageImpl#getOpvLabelValue()
		 * @generated
		 */
		EClass OPV_LABEL_VALUE = eINSTANCE.getOpvLabelValue();

		/**
		 * The meta object literal for the '<em><b>Sv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPV_LABEL_VALUE__SV = eINSTANCE.getOpvLabelValue_Sv();

		/**
		 * The meta object literal for the '<em><b>Ev</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPV_LABEL_VALUE__EV = eINSTANCE.getOpvLabelValue_Ev();

		/**
		 * The meta object literal for the '<em><b>V</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPV_LABEL_VALUE__V = eINSTANCE.getOpvLabelValue_V();

		/**
		 * The meta object literal for the '<em><b>Pv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPV_LABEL_VALUE__PV = eINSTANCE.getOpvLabelValue_Pv();

		/**
		 * The meta object literal for the '<em><b>Pw</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPV_LABEL_VALUE__PW = eINSTANCE.getOpvLabelValue_Pw();

	}

} //PolioPackage
