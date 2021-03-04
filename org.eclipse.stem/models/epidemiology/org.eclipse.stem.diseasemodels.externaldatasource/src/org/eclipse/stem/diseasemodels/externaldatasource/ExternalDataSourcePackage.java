// ExternalDataSourcePackage 
package org.eclipse.stem.diseasemodels.externaldatasource;

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
 * @see org.eclipse.stem.diseasemodels.externaldatasource.ExternalDataSourceFactory
 * @model kind="package"
 * @generated
 */
public interface ExternalDataSourcePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "externaldatasource";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/stem/diseasemodels/externaldatasource.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.stem.diseasemodels.externaldatasource";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExternalDataSourcePackage eINSTANCE = org.eclipse.stem.diseasemodels.externaldatasource.impl.ExternalDataSourcePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.externaldatasource.impl.ExternalDataSourceDiseaseModelImpl <em>Disease Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.externaldatasource.impl.ExternalDataSourceDiseaseModelImpl
	 * @see org.eclipse.stem.diseasemodels.externaldatasource.impl.ExternalDataSourcePackageImpl#getExternalDataSourceDiseaseModel()
	 * @generated
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_MODEL__URI = StandardPackage.STANDARD_DISEASE_MODEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_MODEL__TYPE_URI = StandardPackage.STANDARD_DISEASE_MODEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_MODEL__DUBLIN_CORE = StandardPackage.STANDARD_DISEASE_MODEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Labels To Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_MODEL__LABELS_TO_UPDATE = StandardPackage.STANDARD_DISEASE_MODEL__LABELS_TO_UPDATE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_MODEL__GRAPH = StandardPackage.STANDARD_DISEASE_MODEL__GRAPH;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_MODEL__ENABLED = StandardPackage.STANDARD_DISEASE_MODEL__ENABLED;

	/**
	 * The feature id for the '<em><b>Graph Decorated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_MODEL__GRAPH_DECORATED = StandardPackage.STANDARD_DISEASE_MODEL__GRAPH_DECORATED;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_MODEL__PROGRESS = StandardPackage.STANDARD_DISEASE_MODEL__PROGRESS;

	/**
	 * The feature id for the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_MODEL__ADD_STOCHASTIC_NOISE = StandardPackage.STANDARD_DISEASE_MODEL__ADD_STOCHASTIC_NOISE;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_MODEL__RANDOM_SEED = StandardPackage.STANDARD_DISEASE_MODEL__RANDOM_SEED;

	/**
	 * The feature id for the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_MODEL__BINOMIAL_DISTRIBUTION = StandardPackage.STANDARD_DISEASE_MODEL__BINOMIAL_DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_MODEL__POPULATION_IDENTIFIER = StandardPackage.STANDARD_DISEASE_MODEL__POPULATION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_MODEL__TIME_PERIOD = StandardPackage.STANDARD_DISEASE_MODEL__TIME_PERIOD;

	/**
	 * The feature id for the '<em><b>Disease Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_MODEL__DISEASE_NAME = StandardPackage.STANDARD_DISEASE_MODEL__DISEASE_NAME;

	/**
	 * The feature id for the '<em><b>Finite Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_MODEL__FINITE_DIFFERENCE = StandardPackage.STANDARD_DISEASE_MODEL__FINITE_DIFFERENCE;

	/**
	 * The feature id for the '<em><b>Frequency Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_MODEL__FREQUENCY_DEPENDENT = StandardPackage.STANDARD_DISEASE_MODEL__FREQUENCY_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Reference Population Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY = StandardPackage.STANDARD_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY;

	/**
	 * The feature id for the '<em><b>Road Network Infectious Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION = StandardPackage.STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION;

	/**
	 * The feature id for the '<em><b>Characteristic Mixing Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE = StandardPackage.STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE;

	/**
	 * The feature id for the '<em><b>Data Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_MODEL__DATA_PATH = StandardPackage.STANDARD_DISEASE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disease Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_MODEL__DISEASE_TYPE = StandardPackage.STANDARD_DISEASE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_MODEL__BUFFER_SIZE = StandardPackage.STANDARD_DISEASE_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Restart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_MODEL__RESTART = StandardPackage.STANDARD_DISEASE_MODEL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Disease Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_SOURCE_DISEASE_MODEL_FEATURE_COUNT = StandardPackage.STANDARD_DISEASE_MODEL_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.externaldatasource.ExternalDataSourceDiseaseModel <em>Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disease Model</em>'.
	 * @see org.eclipse.stem.diseasemodels.externaldatasource.ExternalDataSourceDiseaseModel
	 * @generated
	 */
	EClass getExternalDataSourceDiseaseModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.externaldatasource.ExternalDataSourceDiseaseModel#getDataPath <em>Data Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Path</em>'.
	 * @see org.eclipse.stem.diseasemodels.externaldatasource.ExternalDataSourceDiseaseModel#getDataPath()
	 * @see #getExternalDataSourceDiseaseModel()
	 * @generated
	 */
	EAttribute getExternalDataSourceDiseaseModel_DataPath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.externaldatasource.ExternalDataSourceDiseaseModel#getDiseaseType <em>Disease Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disease Type</em>'.
	 * @see org.eclipse.stem.diseasemodels.externaldatasource.ExternalDataSourceDiseaseModel#getDiseaseType()
	 * @see #getExternalDataSourceDiseaseModel()
	 * @generated
	 */
	EAttribute getExternalDataSourceDiseaseModel_DiseaseType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.externaldatasource.ExternalDataSourceDiseaseModel#getBufferSize <em>Buffer Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffer Size</em>'.
	 * @see org.eclipse.stem.diseasemodels.externaldatasource.ExternalDataSourceDiseaseModel#getBufferSize()
	 * @see #getExternalDataSourceDiseaseModel()
	 * @generated
	 */
	EAttribute getExternalDataSourceDiseaseModel_BufferSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.externaldatasource.ExternalDataSourceDiseaseModel#isRestart <em>Restart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart</em>'.
	 * @see org.eclipse.stem.diseasemodels.externaldatasource.ExternalDataSourceDiseaseModel#isRestart()
	 * @see #getExternalDataSourceDiseaseModel()
	 * @generated
	 */
	EAttribute getExternalDataSourceDiseaseModel_Restart();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExternalDataSourceFactory getExternalDataSourceFactory();

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
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.externaldatasource.impl.ExternalDataSourceDiseaseModelImpl <em>Disease Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.externaldatasource.impl.ExternalDataSourceDiseaseModelImpl
		 * @see org.eclipse.stem.diseasemodels.externaldatasource.impl.ExternalDataSourcePackageImpl#getExternalDataSourceDiseaseModel()
		 * @generated
		 */
		EClass EXTERNAL_DATA_SOURCE_DISEASE_MODEL = eINSTANCE.getExternalDataSourceDiseaseModel();

		/**
		 * The meta object literal for the '<em><b>Data Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_DATA_SOURCE_DISEASE_MODEL__DATA_PATH = eINSTANCE.getExternalDataSourceDiseaseModel_DataPath();

		/**
		 * The meta object literal for the '<em><b>Disease Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_DATA_SOURCE_DISEASE_MODEL__DISEASE_TYPE = eINSTANCE.getExternalDataSourceDiseaseModel_DiseaseType();

		/**
		 * The meta object literal for the '<em><b>Buffer Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_DATA_SOURCE_DISEASE_MODEL__BUFFER_SIZE = eINSTANCE.getExternalDataSourceDiseaseModel_BufferSize();

		/**
		 * The meta object literal for the '<em><b>Restart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_DATA_SOURCE_DISEASE_MODEL__RESTART = eINSTANCE.getExternalDataSourceDiseaseModel_Restart();

	}

} //ExternalDataSourcePackage
