package org.eclipse.stem.diseasemodels.avianinfluenza;

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
import org.eclipse.stem.diseasemodels.vector.VectorPackage;

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
 * @see org.eclipse.stem.diseasemodels.avianinfluenza.AvianinfluenzaFactory
 * @model kind="package"
 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
 *        annotation="http:///org/eclipse/stem/modelgen/metamodel uri='platform:/resource/.stemgenerator/model/avianinfluenza.metamodel'"
 * @generated
 */
public interface AvianinfluenzaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "avianinfluenza";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/stem/diseasemodels/avianinfluenza/avianinfluenza.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.stem.diseasemodels.avianinfluenza";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AvianinfluenzaPackage eINSTANCE = org.eclipse.stem.diseasemodels.avianinfluenza.impl.AvianinfluenzaPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.avianinfluenza.impl.H7N9LabelImpl <em>H7N9 Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.avianinfluenza.impl.H7N9LabelImpl
	 * @see org.eclipse.stem.diseasemodels.avianinfluenza.impl.AvianinfluenzaPackageImpl#getH7N9Label()
	 * @generated
	 */
	int H7N9_LABEL = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9_LABEL__URI = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9_LABEL__TYPE_URI = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9_LABEL__DUBLIN_CORE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>URI Of Identifiable To Be Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9_LABEL__CURRENT_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Identifiable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9_LABEL__IDENTIFIABLE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__IDENTIFIABLE;

	/**
	 * The feature id for the '<em><b>Next Value Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9_LABEL__NEXT_VALUE_VALID = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NEXT_VALUE_VALID;

	/**
	 * The feature id for the '<em><b>Next Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9_LABEL__NEXT_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NEXT_VALUE;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9_LABEL__DECORATOR = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DECORATOR;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9_LABEL__NODE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__NODE;

	/**
	 * The feature id for the '<em><b>Delta Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9_LABEL__DELTA_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__DELTA_VALUE;

	/**
	 * The feature id for the '<em><b>Temp Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9_LABEL__TEMP_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__TEMP_VALUE;

	/**
	 * The feature id for the '<em><b>Probe Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9_LABEL__PROBE_VALUE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__PROBE_VALUE;

	/**
	 * The feature id for the '<em><b>Error Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9_LABEL__ERROR_SCALE = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__ERROR_SCALE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9_LABEL__IDENTIFIER = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Population Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9_LABEL__POPULATION_LABEL = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__POPULATION_LABEL;

	/**
	 * The feature id for the '<em><b>Population Model Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9_LABEL__POPULATION_MODEL_LABEL = StandardPackage.STANDARD_DISEASE_MODEL_LABEL__POPULATION_MODEL_LABEL;

	/**
	 * The number of structural features of the '<em>H7N9 Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9_LABEL_FEATURE_COUNT = StandardPackage.STANDARD_DISEASE_MODEL_LABEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.avianinfluenza.impl.H7N9LabelValueImpl <em>H7N9 Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.avianinfluenza.impl.H7N9LabelValueImpl
	 * @see org.eclipse.stem.diseasemodels.avianinfluenza.impl.AvianinfluenzaPackageImpl#getH7N9LabelValue()
	 * @generated
	 */
	int H7N9_LABEL_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Arrivals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9_LABEL_VALUE__ARRIVALS = StandardPackage.SIR_LABEL_VALUE__ARRIVALS;

	/**
	 * The feature id for the '<em><b>Departures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9_LABEL_VALUE__DEPARTURES = StandardPackage.SIR_LABEL_VALUE__DEPARTURES;

	/**
	 * The feature id for the '<em><b>Population Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9_LABEL_VALUE__POPULATION_COUNT = StandardPackage.SIR_LABEL_VALUE__POPULATION_COUNT;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9_LABEL_VALUE__S = StandardPackage.SIR_LABEL_VALUE__S;

	/**
	 * The feature id for the '<em><b>Incidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9_LABEL_VALUE__INCIDENCE = StandardPackage.SIR_LABEL_VALUE__INCIDENCE;

	/**
	 * The feature id for the '<em><b>Disease Deaths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9_LABEL_VALUE__DISEASE_DEATHS = StandardPackage.SIR_LABEL_VALUE__DISEASE_DEATHS;

	/**
	 * The feature id for the '<em><b>I</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9_LABEL_VALUE__I = StandardPackage.SIR_LABEL_VALUE__I;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9_LABEL_VALUE__R = StandardPackage.SIR_LABEL_VALUE__R;

	/**
	 * The number of structural features of the '<em>H7N9 Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9_LABEL_VALUE_FEATURE_COUNT = StandardPackage.SIR_LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.avianinfluenza.impl.H7N9Impl <em>H7N9</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.avianinfluenza.impl.H7N9Impl
	 * @see org.eclipse.stem.diseasemodels.avianinfluenza.impl.AvianinfluenzaPackageImpl#getH7N9()
	 * @generated
	 */
	int H7N9 = 2;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9__URI = VectorPackage.VECTOR_DISEASE_MODEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9__TYPE_URI = VectorPackage.VECTOR_DISEASE_MODEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9__DUBLIN_CORE = VectorPackage.VECTOR_DISEASE_MODEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9__LABELS_TO_UPDATE = VectorPackage.VECTOR_DISEASE_MODEL__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9__GRAPH = VectorPackage.VECTOR_DISEASE_MODEL__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9__ENABLED = VectorPackage.VECTOR_DISEASE_MODEL__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9__GRAPH_DECORATED = VectorPackage.VECTOR_DISEASE_MODEL__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9__PROGRESS = VectorPackage.VECTOR_DISEASE_MODEL__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9__ADD_STOCHASTIC_NOISE = VectorPackage.VECTOR_DISEASE_MODEL__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9__RANDOM_SEED = VectorPackage.VECTOR_DISEASE_MODEL__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9__BINOMIAL_DISTRIBUTION = VectorPackage.VECTOR_DISEASE_MODEL__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9__POPULATION_IDENTIFIER = VectorPackage.VECTOR_DISEASE_MODEL__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9__TIME_PERIOD = VectorPackage.VECTOR_DISEASE_MODEL__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9__DISEASE_NAME = VectorPackage.VECTOR_DISEASE_MODEL__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9__FINITE_DIFFERENCE = VectorPackage.VECTOR_DISEASE_MODEL__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9__FREQUENCY_DEPENDENT = VectorPackage.VECTOR_DISEASE_MODEL__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9__REFERENCE_POPULATION_DENSITY = VectorPackage.VECTOR_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9__ROAD_NETWORK_INFECTIOUS_PROPORTION = VectorPackage.VECTOR_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9__CHARACTERISTIC_MIXING_DISTANCE = VectorPackage.VECTOR_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Vector Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9__VECTOR_POPULATION_IDENTIFIER = VectorPackage.VECTOR_DISEASE_MODEL__VECTOR_POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Avian To Avian Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9__AVIAN_TO_AVIAN_TRANSMISSION_RATE = VectorPackage.VECTOR_DISEASE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Avian Recovery Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9__AVIAN_RECOVERY_RATE = VectorPackage.VECTOR_DISEASE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Avian To Human Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9__AVIAN_TO_HUMAN_TRANSMISSION_RATE = VectorPackage.VECTOR_DISEASE_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Human To Human Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9__HUMAN_TO_HUMAN_TRANSMISSION_RATE = VectorPackage.VECTOR_DISEASE_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Avian Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9__AVIAN_CHARACTERISTIC_MIXING_DISTANCE = VectorPackage.VECTOR_DISEASE_MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Human Recovery Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9__HUMAN_RECOVERY_RATE = VectorPackage.VECTOR_DISEASE_MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Human Immunity Loss Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9__HUMAN_IMMUNITY_LOSS_RATE = VectorPackage.VECTOR_DISEASE_MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Temperature Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9__TEMPERATURE_FACTOR = VectorPackage.VECTOR_DISEASE_MODEL_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>H7N9</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H7N9_FEATURE_COUNT = VectorPackage.VECTOR_DISEASE_MODEL_FEATURE_COUNT + 8;


	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.avianinfluenza.H7N9Label <em>H7N9 Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H7N9 Label</em>'.
	 * @see org.eclipse.stem.diseasemodels.avianinfluenza.H7N9Label
	 * @generated
	 */
	EClass getH7N9Label();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.avianinfluenza.H7N9LabelValue <em>H7N9 Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H7N9 Label Value</em>'.
	 * @see org.eclipse.stem.diseasemodels.avianinfluenza.H7N9LabelValue
	 * @generated
	 */
	EClass getH7N9LabelValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.avianinfluenza.H7N9 <em>H7N9</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H7N9</em>'.
	 * @see org.eclipse.stem.diseasemodels.avianinfluenza.H7N9
	 * @generated
	 */
	EClass getH7N9();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.avianinfluenza.H7N9#getAvianToAvianTransmissionRate <em>Avian To Avian Transmission Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avian To Avian Transmission Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.avianinfluenza.H7N9#getAvianToAvianTransmissionRate()
	 * @see #getH7N9()
	 * @generated
	 */
	EAttribute getH7N9_AvianToAvianTransmissionRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.avianinfluenza.H7N9#getAvianRecoveryRate <em>Avian Recovery Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avian Recovery Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.avianinfluenza.H7N9#getAvianRecoveryRate()
	 * @see #getH7N9()
	 * @generated
	 */
	EAttribute getH7N9_AvianRecoveryRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.avianinfluenza.H7N9#getAvianToHumanTransmissionRate <em>Avian To Human Transmission Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avian To Human Transmission Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.avianinfluenza.H7N9#getAvianToHumanTransmissionRate()
	 * @see #getH7N9()
	 * @generated
	 */
	EAttribute getH7N9_AvianToHumanTransmissionRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.avianinfluenza.H7N9#getHumanToHumanTransmissionRate <em>Human To Human Transmission Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Human To Human Transmission Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.avianinfluenza.H7N9#getHumanToHumanTransmissionRate()
	 * @see #getH7N9()
	 * @generated
	 */
	EAttribute getH7N9_HumanToHumanTransmissionRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.avianinfluenza.H7N9#getAvianCharacteristicMixingDistance <em>Avian Characteristic Mixing Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avian Characteristic Mixing Distance</em>'.
	 * @see org.eclipse.stem.diseasemodels.avianinfluenza.H7N9#getAvianCharacteristicMixingDistance()
	 * @see #getH7N9()
	 * @generated
	 */
	EAttribute getH7N9_AvianCharacteristicMixingDistance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.avianinfluenza.H7N9#getHumanRecoveryRate <em>Human Recovery Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Human Recovery Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.avianinfluenza.H7N9#getHumanRecoveryRate()
	 * @see #getH7N9()
	 * @generated
	 */
	EAttribute getH7N9_HumanRecoveryRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.avianinfluenza.H7N9#getHumanImmunityLossRate <em>Human Immunity Loss Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Human Immunity Loss Rate</em>'.
	 * @see org.eclipse.stem.diseasemodels.avianinfluenza.H7N9#getHumanImmunityLossRate()
	 * @see #getH7N9()
	 * @generated
	 */
	EAttribute getH7N9_HumanImmunityLossRate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.avianinfluenza.H7N9#getTemperatureFactor <em>Temperature Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature Factor</em>'.
	 * @see org.eclipse.stem.diseasemodels.avianinfluenza.H7N9#getTemperatureFactor()
	 * @see #getH7N9()
	 * @generated
	 */
	EAttribute getH7N9_TemperatureFactor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AvianinfluenzaFactory getAvianinfluenzaFactory();

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
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.avianinfluenza.impl.H7N9LabelImpl <em>H7N9 Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.avianinfluenza.impl.H7N9LabelImpl
		 * @see org.eclipse.stem.diseasemodels.avianinfluenza.impl.AvianinfluenzaPackageImpl#getH7N9Label()
		 * @generated
		 */
		EClass H7N9_LABEL = eINSTANCE.getH7N9Label();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.avianinfluenza.impl.H7N9LabelValueImpl <em>H7N9 Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.avianinfluenza.impl.H7N9LabelValueImpl
		 * @see org.eclipse.stem.diseasemodels.avianinfluenza.impl.AvianinfluenzaPackageImpl#getH7N9LabelValue()
		 * @generated
		 */
		EClass H7N9_LABEL_VALUE = eINSTANCE.getH7N9LabelValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.avianinfluenza.impl.H7N9Impl <em>H7N9</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.avianinfluenza.impl.H7N9Impl
		 * @see org.eclipse.stem.diseasemodels.avianinfluenza.impl.AvianinfluenzaPackageImpl#getH7N9()
		 * @generated
		 */
		EClass H7N9 = eINSTANCE.getH7N9();

		/**
		 * The meta object literal for the '<em><b>Avian To Avian Transmission Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H7N9__AVIAN_TO_AVIAN_TRANSMISSION_RATE = eINSTANCE.getH7N9_AvianToAvianTransmissionRate();

		/**
		 * The meta object literal for the '<em><b>Avian Recovery Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H7N9__AVIAN_RECOVERY_RATE = eINSTANCE.getH7N9_AvianRecoveryRate();

		/**
		 * The meta object literal for the '<em><b>Avian To Human Transmission Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H7N9__AVIAN_TO_HUMAN_TRANSMISSION_RATE = eINSTANCE.getH7N9_AvianToHumanTransmissionRate();

		/**
		 * The meta object literal for the '<em><b>Human To Human Transmission Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H7N9__HUMAN_TO_HUMAN_TRANSMISSION_RATE = eINSTANCE.getH7N9_HumanToHumanTransmissionRate();

		/**
		 * The meta object literal for the '<em><b>Avian Characteristic Mixing Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H7N9__AVIAN_CHARACTERISTIC_MIXING_DISTANCE = eINSTANCE.getH7N9_AvianCharacteristicMixingDistance();

		/**
		 * The meta object literal for the '<em><b>Human Recovery Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H7N9__HUMAN_RECOVERY_RATE = eINSTANCE.getH7N9_HumanRecoveryRate();

		/**
		 * The meta object literal for the '<em><b>Human Immunity Loss Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H7N9__HUMAN_IMMUNITY_LOSS_RATE = eINSTANCE.getH7N9_HumanImmunityLossRate();

		/**
		 * The meta object literal for the '<em><b>Temperature Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H7N9__TEMPERATURE_FACTOR = eINSTANCE.getH7N9_TemperatureFactor();

	}

} //AvianinfluenzaPackage
