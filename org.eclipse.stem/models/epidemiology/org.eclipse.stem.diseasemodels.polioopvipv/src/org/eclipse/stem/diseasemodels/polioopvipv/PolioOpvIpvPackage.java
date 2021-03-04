/**
 * <copyright>
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
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.stem.diseasemodels.polioopvipv;

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
 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvFactory
 * @model kind="package"
 *        annotation="org.eclipse.stem.model.generated version='1.0'"
 * @generated
 */
public interface PolioOpvIpvPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "polioopvipv";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/stem/diseasemodels/polioopvipv/polioopvipv.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.stem.diseasemodels.polioopvipv";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PolioOpvIpvPackage eINSTANCE = org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvLabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvLabelImpl
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvPackageImpl#getPolioOpvIpvLabel()
	 * @generated
	 */
	int POLIO_OPV_IPV_LABEL = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL__URI = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL__TYPE_URI = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL__DUBLIN_CORE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>URI Of Identifiable To Be Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL__CURRENT_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Identifiable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL__IDENTIFIABLE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__IDENTIFIABLE;

	/**
	 * The feature id for the '<em><b>Next Value Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL__NEXT_VALUE_VALID = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NEXT_VALUE_VALID;

	/**
	 * The feature id for the '<em><b>Next Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL__NEXT_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NEXT_VALUE;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL__DECORATOR = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DECORATOR;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL__NODE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NODE;

	/**
	 * The feature id for the '<em><b>Delta Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL__DELTA_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DELTA_VALUE;

	/**
	 * The feature id for the '<em><b>Temp Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL__TEMP_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__TEMP_VALUE;

	/**
	 * The feature id for the '<em><b>Probe Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL__PROBE_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__PROBE_VALUE;

	/**
	 * The feature id for the '<em><b>Error Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL__ERROR_SCALE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__ERROR_SCALE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL__IDENTIFIER = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Population Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL__POPULATION_LABEL = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__POPULATION_LABEL;

	/**
	 * The feature id for the '<em><b>Population Model Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL__POPULATION_MODEL_LABEL = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__POPULATION_MODEL_LABEL;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL_FEATURE_COUNT = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvLabelValueImpl <em>Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvLabelValueImpl
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvPackageImpl#getPolioOpvIpvLabelValue()
	 * @generated
	 */
	int POLIO_OPV_IPV_LABEL_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Arrivals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL_VALUE__ARRIVALS = StandardPackage.SEIR_LABEL_VALUE__ARRIVALS;

	/**
	 * The feature id for the '<em><b>Departures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL_VALUE__DEPARTURES = StandardPackage.SEIR_LABEL_VALUE__DEPARTURES;

	/**
	 * The feature id for the '<em><b>Population Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL_VALUE__POPULATION_COUNT = StandardPackage.SEIR_LABEL_VALUE__POPULATION_COUNT;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL_VALUE__S = StandardPackage.SEIR_LABEL_VALUE__S;

	/**
	 * The feature id for the '<em><b>Incidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL_VALUE__INCIDENCE = StandardPackage.SEIR_LABEL_VALUE__INCIDENCE;

	/**
	 * The feature id for the '<em><b>Disease Deaths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL_VALUE__DISEASE_DEATHS = StandardPackage.SEIR_LABEL_VALUE__DISEASE_DEATHS;

	/**
	 * The feature id for the '<em><b>I</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL_VALUE__I = StandardPackage.SEIR_LABEL_VALUE__I;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL_VALUE__R = StandardPackage.SEIR_LABEL_VALUE__R;

	/**
	 * The feature id for the '<em><b>E</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL_VALUE__E = StandardPackage.SEIR_LABEL_VALUE__E;

	/**
	 * The feature id for the '<em><b>Sopv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL_VALUE__SOPV = StandardPackage.SEIR_LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Eopv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL_VALUE__EOPV = StandardPackage.SEIR_LABEL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vopv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL_VALUE__VOPV = StandardPackage.SEIR_LABEL_VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Popv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL_VALUE__POPV = StandardPackage.SEIR_LABEL_VALUE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL_VALUE__PW = StandardPackage.SEIR_LABEL_VALUE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sipv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL_VALUE__SIPV = StandardPackage.SEIR_LABEL_VALUE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Eipv w</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL_VALUE__EIPV_W = StandardPackage.SEIR_LABEL_VALUE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cipv w</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL_VALUE__CIPV_W = StandardPackage.SEIR_LABEL_VALUE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Eipv opv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL_VALUE__EIPV_OPV = StandardPackage.SEIR_LABEL_VALUE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Cipv opv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL_VALUE__CIPV_OPV = StandardPackage.SEIR_LABEL_VALUE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Incidence opv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL_VALUE__INCIDENCE_OPV = StandardPackage.SEIR_LABEL_VALUE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Incidence ipv w</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL_VALUE__INCIDENCE_IPV_W = StandardPackage.SEIR_LABEL_VALUE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Incidence ipv opv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL_VALUE__INCIDENCE_IPV_OPV = StandardPackage.SEIR_LABEL_VALUE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_LABEL_VALUE_FEATURE_COUNT = StandardPackage.SEIR_LABEL_VALUE_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvDiseaseModelImpl <em>Disease Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvDiseaseModelImpl
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvPackageImpl#getPolioOpvIpvDiseaseModel()
	 * @generated
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL = 2;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__URI = StandardPackage.SEIR__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__TYPE_URI = StandardPackage.SEIR__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__DUBLIN_CORE = StandardPackage.SEIR__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__LABELS_TO_UPDATE = StandardPackage.SEIR__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__GRAPH = StandardPackage.SEIR__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__ENABLED = StandardPackage.SEIR__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__GRAPH_DECORATED = StandardPackage.SEIR__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__PROGRESS = StandardPackage.SEIR__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__ADD_STOCHASTIC_NOISE = StandardPackage.SEIR__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__RANDOM_SEED = StandardPackage.SEIR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__BINOMIAL_DISTRIBUTION = StandardPackage.SEIR__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__POPULATION_IDENTIFIER = StandardPackage.SEIR__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__TIME_PERIOD = StandardPackage.SEIR__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__DISEASE_NAME = StandardPackage.SEIR__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__FINITE_DIFFERENCE = StandardPackage.SEIR__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__FREQUENCY_DEPENDENT = StandardPackage.SEIR__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY = StandardPackage.SEIR__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = StandardPackage.SEIR__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE = StandardPackage.SEIR__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__TRANSMISSION_RATE = StandardPackage.SEIR__TRANSMISSION_RATE;

	/**
	 * The feature id for the '<em><b>Non Linearity Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__NON_LINEARITY_COEFFICIENT = StandardPackage.SEIR__NON_LINEARITY_COEFFICIENT;

	/**
	 * The feature id for the '<em><b>Recovery Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__RECOVERY_RATE = StandardPackage.SEIR__RECOVERY_RATE;

	/**
	 * The feature id for the '<em><b>Infectious Mortality Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE = StandardPackage.SEIR__INFECTIOUS_MORTALITY_RATE;

	/**
	 * The feature id for the '<em><b>Immunity Loss Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__IMMUNITY_LOSS_RATE = StandardPackage.SEIR__IMMUNITY_LOSS_RATE;

	/**
	 * The feature id for the '<em><b>Incubation Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__INCUBATION_RATE = StandardPackage.SEIR__INCUBATION_RATE;

	/**
	 * The feature id for the '<em><b>Opv Efficacy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__OPV_EFFICACY = StandardPackage.SEIR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reversion Rate OPV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__REVERSION_RATE_OPV = StandardPackage.SEIR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Birth Death Rate Developing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__BIRTH_DEATH_RATE_DEVELOPING = StandardPackage.SEIR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transmission Rate OPV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__TRANSMISSION_RATE_OPV = StandardPackage.SEIR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transmission Rate Wild</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__TRANSMISSION_RATE_WILD = StandardPackage.SEIR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Relative Susceptibility Recent OPV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__RELATIVE_SUSCEPTIBILITY_RECENT_OPV = StandardPackage.SEIR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Relative Susceptibility IPV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__RELATIVE_SUSCEPTIBILITY_IPV = StandardPackage.SEIR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Incubation Rate Vaccine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__INCUBATION_RATE_VACCINE = StandardPackage.SEIR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Incubation Rate Wild</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__INCUBATION_RATE_WILD = StandardPackage.SEIR_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Recovery Rate Vaccine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__RECOVERY_RATE_VACCINE = StandardPackage.SEIR_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Recovery Rate Wild</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__RECOVERY_RATE_WILD = StandardPackage.SEIR_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Paralytic Incidence From Vaccine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__PARALYTIC_INCIDENCE_FROM_VACCINE = StandardPackage.SEIR_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Paralytic Case Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL__PARALYTIC_CASE_PROPORTION = StandardPackage.SEIR_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Disease Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIO_OPV_IPV_DISEASE_MODEL_FEATURE_COUNT = StandardPackage.SEIR_FEATURE_COUNT + 13;


	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabel
	 * @generated
	 */
	EClass getPolioOpvIpvLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue <em>Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Value</em>'.
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue
	 * @generated
	 */
	EClass getPolioOpvIpvLabelValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getSopv <em>Sopv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sopv</em>'.
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getSopv()
	 * @see #getPolioOpvIpvLabelValue()
	 * @generated
	 */
	EAttribute getPolioOpvIpvLabelValue_Sopv();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getEopv <em>Eopv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eopv</em>'.
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getEopv()
	 * @see #getPolioOpvIpvLabelValue()
	 * @generated
	 */
	EAttribute getPolioOpvIpvLabelValue_Eopv();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getVopv <em>Vopv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vopv</em>'.
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getVopv()
	 * @see #getPolioOpvIpvLabelValue()
	 * @generated
	 */
	EAttribute getPolioOpvIpvLabelValue_Vopv();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getPopv <em>Popv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Popv</em>'.
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getPopv()
	 * @see #getPolioOpvIpvLabelValue()
	 * @generated
	 */
	EAttribute getPolioOpvIpvLabelValue_Popv();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getPw <em>Pw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pw</em>'.
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getPw()
	 * @see #getPolioOpvIpvLabelValue()
	 * @generated
	 */
	EAttribute getPolioOpvIpvLabelValue_Pw();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getSipv <em>Sipv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sipv</em>'.
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getSipv()
	 * @see #getPolioOpvIpvLabelValue()
	 * @generated
	 */
	EAttribute getPolioOpvIpvLabelValue_Sipv();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getEipv_w <em>Eipv w</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eipv w</em>'.
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getEipv_w()
	 * @see #getPolioOpvIpvLabelValue()
	 * @generated
	 */
	EAttribute getPolioOpvIpvLabelValue_Eipv_w();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getCipv_w <em>Cipv w</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cipv w</em>'.
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getCipv_w()
	 * @see #getPolioOpvIpvLabelValue()
	 * @generated
	 */
	EAttribute getPolioOpvIpvLabelValue_Cipv_w();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getEipv_opv <em>Eipv opv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eipv opv</em>'.
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getEipv_opv()
	 * @see #getPolioOpvIpvLabelValue()
	 * @generated
	 */
	EAttribute getPolioOpvIpvLabelValue_Eipv_opv();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getCipv_opv <em>Cipv opv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cipv opv</em>'.
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getCipv_opv()
	 * @see #getPolioOpvIpvLabelValue()
	 * @generated
	 */
	EAttribute getPolioOpvIpvLabelValue_Cipv_opv();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getIncidence_opv <em>Incidence opv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incidence opv</em>'.
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getIncidence_opv()
	 * @see #getPolioOpvIpvLabelValue()
	 * @generated
	 */
	EAttribute getPolioOpvIpvLabelValue_Incidence_opv();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getIncidence_ipv_w <em>Incidence ipv w</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incidence ipv w</em>'.
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getIncidence_ipv_w()
	 * @see #getPolioOpvIpvLabelValue()
	 * @generated
	 */
	EAttribute getPolioOpvIpvLabelValue_Incidence_ipv_w();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getIncidence_ipv_opv <em>Incidence ipv opv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incidence ipv opv</em>'.
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getIncidence_ipv_opv()
	 * @see #getPolioOpvIpvLabelValue()
	 * @generated
	 */
	EAttribute getPolioOpvIpvLabelValue_Incidence_ipv_opv();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel <em>Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disease Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel
	 * @generated
	 */
	EClass getPolioOpvIpvDiseaseModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getOpvEfficacy <em>Opv Efficacy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opv Efficacy</em>'.
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getOpvEfficacy()
	 * @see #getPolioOpvIpvDiseaseModel()
	 * @generated
	 */
	EAttribute getPolioOpvIpvDiseaseModel_OpvEfficacy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getReversionRateOPV <em>Reversion Rate OPV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reversion Rate OPV</em>'.
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getReversionRateOPV()
	 * @see #getPolioOpvIpvDiseaseModel()
	 * @generated
	 */
	EAttribute getPolioOpvIpvDiseaseModel_ReversionRateOPV();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getBirthDeathRateDeveloping <em>Birth Death Rate Developing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birth Death Rate Developing</em>'.
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getBirthDeathRateDeveloping()
	 * @see #getPolioOpvIpvDiseaseModel()
	 * @generated
	 */
	EAttribute getPolioOpvIpvDiseaseModel_BirthDeathRateDeveloping();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getTransmissionRateOPV <em>Transmission Rate OPV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transmission Rate OPV</em>'.
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getTransmissionRateOPV()
	 * @see #getPolioOpvIpvDiseaseModel()
	 * @generated
	 */
	EAttribute getPolioOpvIpvDiseaseModel_TransmissionRateOPV();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getTransmissionRateWild <em>Transmission Rate Wild</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transmission Rate Wild</em>'.
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getTransmissionRateWild()
	 * @see #getPolioOpvIpvDiseaseModel()
	 * @generated
	 */
	EAttribute getPolioOpvIpvDiseaseModel_TransmissionRateWild();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getRelativeSusceptibilityRecentOPV <em>Relative Susceptibility Recent OPV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Susceptibility Recent OPV</em>'.
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getRelativeSusceptibilityRecentOPV()
	 * @see #getPolioOpvIpvDiseaseModel()
	 * @generated
	 */
	EAttribute getPolioOpvIpvDiseaseModel_RelativeSusceptibilityRecentOPV();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getRelativeSusceptibilityIPV <em>Relative Susceptibility IPV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Susceptibility IPV</em>'.
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getRelativeSusceptibilityIPV()
	 * @see #getPolioOpvIpvDiseaseModel()
	 * @generated
	 */
	EAttribute getPolioOpvIpvDiseaseModel_RelativeSusceptibilityIPV();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getIncubationRateVaccine <em>Incubation Rate Vaccine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incubation Rate Vaccine</em>'.
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getIncubationRateVaccine()
	 * @see #getPolioOpvIpvDiseaseModel()
	 * @generated
	 */
	EAttribute getPolioOpvIpvDiseaseModel_IncubationRateVaccine();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getIncubationRateWild <em>Incubation Rate Wild</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incubation Rate Wild</em>'.
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getIncubationRateWild()
	 * @see #getPolioOpvIpvDiseaseModel()
	 * @generated
	 */
	EAttribute getPolioOpvIpvDiseaseModel_IncubationRateWild();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getRecoveryRateVaccine <em>Recovery Rate Vaccine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recovery Rate Vaccine</em>'.
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getRecoveryRateVaccine()
	 * @see #getPolioOpvIpvDiseaseModel()
	 * @generated
	 */
	EAttribute getPolioOpvIpvDiseaseModel_RecoveryRateVaccine();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getRecoveryRateWild <em>Recovery Rate Wild</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recovery Rate Wild</em>'.
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getRecoveryRateWild()
	 * @see #getPolioOpvIpvDiseaseModel()
	 * @generated
	 */
	EAttribute getPolioOpvIpvDiseaseModel_RecoveryRateWild();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getParalyticIncidenceFromVaccine <em>Paralytic Incidence From Vaccine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paralytic Incidence From Vaccine</em>'.
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getParalyticIncidenceFromVaccine()
	 * @see #getPolioOpvIpvDiseaseModel()
	 * @generated
	 */
	EAttribute getPolioOpvIpvDiseaseModel_ParalyticIncidenceFromVaccine();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getParalyticCaseProportion <em>Paralytic Case Proportion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paralytic Case Proportion</em>'.
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel#getParalyticCaseProportion()
	 * @see #getPolioOpvIpvDiseaseModel()
	 * @generated
	 */
	EAttribute getPolioOpvIpvDiseaseModel_ParalyticCaseProportion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PolioOpvIpvFactory getPolioOpvIpvFactory();

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
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvLabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvLabelImpl
		 * @see org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvPackageImpl#getPolioOpvIpvLabel()
		 * @generated
		 */
		EClass POLIO_OPV_IPV_LABEL = eINSTANCE.getPolioOpvIpvLabel();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvLabelValueImpl <em>Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvLabelValueImpl
		 * @see org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvPackageImpl#getPolioOpvIpvLabelValue()
		 * @generated
		 */
		EClass POLIO_OPV_IPV_LABEL_VALUE = eINSTANCE.getPolioOpvIpvLabelValue();

		/**
		 * The meta object literal for the '<em><b>Sopv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLIO_OPV_IPV_LABEL_VALUE__SOPV = eINSTANCE.getPolioOpvIpvLabelValue_Sopv();

		/**
		 * The meta object literal for the '<em><b>Eopv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLIO_OPV_IPV_LABEL_VALUE__EOPV = eINSTANCE.getPolioOpvIpvLabelValue_Eopv();

		/**
		 * The meta object literal for the '<em><b>Vopv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLIO_OPV_IPV_LABEL_VALUE__VOPV = eINSTANCE.getPolioOpvIpvLabelValue_Vopv();

		/**
		 * The meta object literal for the '<em><b>Popv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLIO_OPV_IPV_LABEL_VALUE__POPV = eINSTANCE.getPolioOpvIpvLabelValue_Popv();

		/**
		 * The meta object literal for the '<em><b>Pw</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLIO_OPV_IPV_LABEL_VALUE__PW = eINSTANCE.getPolioOpvIpvLabelValue_Pw();

		/**
		 * The meta object literal for the '<em><b>Sipv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLIO_OPV_IPV_LABEL_VALUE__SIPV = eINSTANCE.getPolioOpvIpvLabelValue_Sipv();

		/**
		 * The meta object literal for the '<em><b>Eipv w</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLIO_OPV_IPV_LABEL_VALUE__EIPV_W = eINSTANCE.getPolioOpvIpvLabelValue_Eipv_w();

		/**
		 * The meta object literal for the '<em><b>Cipv w</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLIO_OPV_IPV_LABEL_VALUE__CIPV_W = eINSTANCE.getPolioOpvIpvLabelValue_Cipv_w();

		/**
		 * The meta object literal for the '<em><b>Eipv opv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLIO_OPV_IPV_LABEL_VALUE__EIPV_OPV = eINSTANCE.getPolioOpvIpvLabelValue_Eipv_opv();

		/**
		 * The meta object literal for the '<em><b>Cipv opv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLIO_OPV_IPV_LABEL_VALUE__CIPV_OPV = eINSTANCE.getPolioOpvIpvLabelValue_Cipv_opv();

		/**
		 * The meta object literal for the '<em><b>Incidence opv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLIO_OPV_IPV_LABEL_VALUE__INCIDENCE_OPV = eINSTANCE.getPolioOpvIpvLabelValue_Incidence_opv();

		/**
		 * The meta object literal for the '<em><b>Incidence ipv w</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLIO_OPV_IPV_LABEL_VALUE__INCIDENCE_IPV_W = eINSTANCE.getPolioOpvIpvLabelValue_Incidence_ipv_w();

		/**
		 * The meta object literal for the '<em><b>Incidence ipv opv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLIO_OPV_IPV_LABEL_VALUE__INCIDENCE_IPV_OPV = eINSTANCE.getPolioOpvIpvLabelValue_Incidence_ipv_opv();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvDiseaseModelImpl <em>Disease Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvDiseaseModelImpl
		 * @see org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvPackageImpl#getPolioOpvIpvDiseaseModel()
		 * @generated
		 */
		EClass POLIO_OPV_IPV_DISEASE_MODEL = eINSTANCE.getPolioOpvIpvDiseaseModel();

		/**
		 * The meta object literal for the '<em><b>Opv Efficacy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLIO_OPV_IPV_DISEASE_MODEL__OPV_EFFICACY = eINSTANCE.getPolioOpvIpvDiseaseModel_OpvEfficacy();

		/**
		 * The meta object literal for the '<em><b>Reversion Rate OPV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLIO_OPV_IPV_DISEASE_MODEL__REVERSION_RATE_OPV = eINSTANCE.getPolioOpvIpvDiseaseModel_ReversionRateOPV();

		/**
		 * The meta object literal for the '<em><b>Birth Death Rate Developing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLIO_OPV_IPV_DISEASE_MODEL__BIRTH_DEATH_RATE_DEVELOPING = eINSTANCE.getPolioOpvIpvDiseaseModel_BirthDeathRateDeveloping();

		/**
		 * The meta object literal for the '<em><b>Transmission Rate OPV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLIO_OPV_IPV_DISEASE_MODEL__TRANSMISSION_RATE_OPV = eINSTANCE.getPolioOpvIpvDiseaseModel_TransmissionRateOPV();

		/**
		 * The meta object literal for the '<em><b>Transmission Rate Wild</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLIO_OPV_IPV_DISEASE_MODEL__TRANSMISSION_RATE_WILD = eINSTANCE.getPolioOpvIpvDiseaseModel_TransmissionRateWild();

		/**
		 * The meta object literal for the '<em><b>Relative Susceptibility Recent OPV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLIO_OPV_IPV_DISEASE_MODEL__RELATIVE_SUSCEPTIBILITY_RECENT_OPV = eINSTANCE.getPolioOpvIpvDiseaseModel_RelativeSusceptibilityRecentOPV();

		/**
		 * The meta object literal for the '<em><b>Relative Susceptibility IPV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLIO_OPV_IPV_DISEASE_MODEL__RELATIVE_SUSCEPTIBILITY_IPV = eINSTANCE.getPolioOpvIpvDiseaseModel_RelativeSusceptibilityIPV();

		/**
		 * The meta object literal for the '<em><b>Incubation Rate Vaccine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLIO_OPV_IPV_DISEASE_MODEL__INCUBATION_RATE_VACCINE = eINSTANCE.getPolioOpvIpvDiseaseModel_IncubationRateVaccine();

		/**
		 * The meta object literal for the '<em><b>Incubation Rate Wild</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLIO_OPV_IPV_DISEASE_MODEL__INCUBATION_RATE_WILD = eINSTANCE.getPolioOpvIpvDiseaseModel_IncubationRateWild();

		/**
		 * The meta object literal for the '<em><b>Recovery Rate Vaccine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLIO_OPV_IPV_DISEASE_MODEL__RECOVERY_RATE_VACCINE = eINSTANCE.getPolioOpvIpvDiseaseModel_RecoveryRateVaccine();

		/**
		 * The meta object literal for the '<em><b>Recovery Rate Wild</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLIO_OPV_IPV_DISEASE_MODEL__RECOVERY_RATE_WILD = eINSTANCE.getPolioOpvIpvDiseaseModel_RecoveryRateWild();

		/**
		 * The meta object literal for the '<em><b>Paralytic Incidence From Vaccine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLIO_OPV_IPV_DISEASE_MODEL__PARALYTIC_INCIDENCE_FROM_VACCINE = eINSTANCE.getPolioOpvIpvDiseaseModel_ParalyticIncidenceFromVaccine();

		/**
		 * The meta object literal for the '<em><b>Paralytic Case Proportion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLIO_OPV_IPV_DISEASE_MODEL__PARALYTIC_CASE_PROPORTION = eINSTANCE.getPolioOpvIpvDiseaseModel_ParalyticCaseProportion();

	}

} //PolioOpvIpvPackage
