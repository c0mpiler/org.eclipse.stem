package org.eclipse.stem.diseasemodels.example;

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
 * @see org.eclipse.stem.diseasemodels.example.ExampleFactory
 * @model kind="package"
 * @generated
 */
public interface ExamplePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "example";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/stem/diseasemodels/example.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.stem.diseasemodels.example";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExamplePackage eINSTANCE = org.eclipse.stem.diseasemodels.example.impl.ExamplePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.example.impl.ExampleDiseaseModelImpl <em>Disease Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.example.impl.ExampleDiseaseModelImpl
	 * @see org.eclipse.stem.diseasemodels.example.impl.ExamplePackageImpl#getExampleDiseaseModel()
	 * @generated
	 */
	int EXAMPLE_DISEASE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DISEASE_MODEL__URI = StandardPackage.SIR__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DISEASE_MODEL__TYPE_URI = StandardPackage.SIR__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DISEASE_MODEL__DUBLIN_CORE = StandardPackage.SIR__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DISEASE_MODEL__LABELS_TO_UPDATE = StandardPackage.SIR__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DISEASE_MODEL__GRAPH = StandardPackage.SIR__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DISEASE_MODEL__ENABLED = StandardPackage.SIR__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DISEASE_MODEL__GRAPH_DECORATED = StandardPackage.SIR__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DISEASE_MODEL__PROGRESS = StandardPackage.SIR__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DISEASE_MODEL__ADD_STOCHASTIC_NOISE = StandardPackage.SIR__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DISEASE_MODEL__RANDOM_SEED = StandardPackage.SIR__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DISEASE_MODEL__BINOMIAL_DISTRIBUTION = StandardPackage.SIR__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DISEASE_MODEL__POPULATION_IDENTIFIER = StandardPackage.SIR__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DISEASE_MODEL__TIME_PERIOD = StandardPackage.SIR__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DISEASE_MODEL__DISEASE_NAME = StandardPackage.SIR__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DISEASE_MODEL__FINITE_DIFFERENCE = StandardPackage.SIR__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DISEASE_MODEL__FREQUENCY_DEPENDENT = StandardPackage.SIR__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY = StandardPackage.SIR__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = StandardPackage.SIR__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE = StandardPackage.SIR__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DISEASE_MODEL__TRANSMISSION_RATE = StandardPackage.SIR__TRANSMISSION_RATE;

	/**
	 * The feature id for the '<em><b>Non Linearity Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DISEASE_MODEL__NON_LINEARITY_COEFFICIENT = StandardPackage.SIR__NON_LINEARITY_COEFFICIENT;

	/**
	 * The feature id for the '<em><b>Recovery Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DISEASE_MODEL__RECOVERY_RATE = StandardPackage.SIR__RECOVERY_RATE;

	/**
	 * The feature id for the '<em><b>Infectious Mortality Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE = StandardPackage.SIR__INFECTIOUS_MORTALITY_RATE;

	/**
	 * The feature id for the '<em><b>Immunity Loss Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DISEASE_MODEL__IMMUNITY_LOSS_RATE = StandardPackage.SIR__IMMUNITY_LOSS_RATE;

	/**
	 * The feature id for the '<em><b>Seasonal Modulation Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DISEASE_MODEL__SEASONAL_MODULATION_EXPONENT = StandardPackage.SIR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modulation Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DISEASE_MODEL__MODULATION_PERIOD = StandardPackage.SIR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modulation Phase Shift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DISEASE_MODEL__MODULATION_PHASE_SHIFT = StandardPackage.SIR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Seasonal Modulation Floor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DISEASE_MODEL__SEASONAL_MODULATION_FLOOR = StandardPackage.SIR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Disease Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_DISEASE_MODEL_FEATURE_COUNT = StandardPackage.SIR_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.example.ExampleDiseaseModel <em>Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disease Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.example.ExampleDiseaseModel
	 * @generated
	 */
	EClass getExampleDiseaseModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.example.ExampleDiseaseModel#getSeasonalModulationExponent <em>Seasonal Modulation Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seasonal Modulation Exponent</em>'.
	 * @see org.eclipse.stem.diseasemodels.example.ExampleDiseaseModel#getSeasonalModulationExponent()
	 * @see #getExampleDiseaseModel()
	 * @generated
	 */
	EAttribute getExampleDiseaseModel_SeasonalModulationExponent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.example.ExampleDiseaseModel#getModulationPeriod <em>Modulation Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modulation Period</em>'.
	 * @see org.eclipse.stem.diseasemodels.example.ExampleDiseaseModel#getModulationPeriod()
	 * @see #getExampleDiseaseModel()
	 * @generated
	 */
	EAttribute getExampleDiseaseModel_ModulationPeriod();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.example.ExampleDiseaseModel#getModulationPhaseShift <em>Modulation Phase Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modulation Phase Shift</em>'.
	 * @see org.eclipse.stem.diseasemodels.example.ExampleDiseaseModel#getModulationPhaseShift()
	 * @see #getExampleDiseaseModel()
	 * @generated
	 */
	EAttribute getExampleDiseaseModel_ModulationPhaseShift();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.example.ExampleDiseaseModel#getSeasonalModulationFloor <em>Seasonal Modulation Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seasonal Modulation Floor</em>'.
	 * @see org.eclipse.stem.diseasemodels.example.ExampleDiseaseModel#getSeasonalModulationFloor()
	 * @see #getExampleDiseaseModel()
	 * @generated
	 */
	EAttribute getExampleDiseaseModel_SeasonalModulationFloor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExampleFactory getExampleFactory();

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
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.example.impl.ExampleDiseaseModelImpl <em>Disease Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.example.impl.ExampleDiseaseModelImpl
		 * @see org.eclipse.stem.diseasemodels.example.impl.ExamplePackageImpl#getExampleDiseaseModel()
		 * @generated
		 */
		EClass EXAMPLE_DISEASE_MODEL = eINSTANCE.getExampleDiseaseModel();
		/**
		 * The meta object literal for the '<em><b>Seasonal Modulation Exponent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE_DISEASE_MODEL__SEASONAL_MODULATION_EXPONENT = eINSTANCE.getExampleDiseaseModel_SeasonalModulationExponent();
		/**
		 * The meta object literal for the '<em><b>Modulation Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE_DISEASE_MODEL__MODULATION_PERIOD = eINSTANCE.getExampleDiseaseModel_ModulationPeriod();
		/**
		 * The meta object literal for the '<em><b>Modulation Phase Shift</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE_DISEASE_MODEL__MODULATION_PHASE_SHIFT = eINSTANCE.getExampleDiseaseModel_ModulationPhaseShift();
		/**
		 * The meta object literal for the '<em><b>Seasonal Modulation Floor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE_DISEASE_MODEL__SEASONAL_MODULATION_FLOOR = eINSTANCE.getExampleDiseaseModel_SeasonalModulationFloor();

	}

} //ExamplePackage
