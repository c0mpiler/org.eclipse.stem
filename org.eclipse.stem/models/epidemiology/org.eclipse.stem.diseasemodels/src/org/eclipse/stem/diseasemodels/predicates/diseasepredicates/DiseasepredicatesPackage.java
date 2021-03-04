package org.eclipse.stem.diseasemodels.predicates.diseasepredicates;

/******************************************************************************* 
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     IBM Corporation - initial API and implementation 
 *******************************************************************************/

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.stem.core.predicate.PredicatePackage;

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
 * @see org.eclipse.stem.diseasemodels.predicates.diseasepredicates.DiseasepredicatesFactory
 * @model kind="package"
 * @generated
 */
public interface DiseasepredicatesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "diseasepredicates"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/stem/diseasemodels/diseasepredicates.ecore"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.stem.diseasemodels.diseasepredicates"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiseasepredicatesPackage eINSTANCE = org.eclipse.stem.diseasemodels.predicates.diseasepredicates.impl.DiseasepredicatesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.stem.diseasemodels.predicates.diseasepredicates.impl.LabelValueTestImpl <em>Label Value Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.predicates.diseasepredicates.impl.LabelValueTestImpl
	 * @see org.eclipse.stem.diseasemodels.predicates.diseasepredicates.impl.DiseasepredicatesPackageImpl#getLabelValueTest()
	 * @generated
	 */
	int LABEL_VALUE_TEST = 0;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_VALUE_TEST__MODEL_NAME = PredicatePackage.TEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_VALUE_TEST__TARGET_URI = PredicatePackage.TEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_VALUE_TEST__STATE = PredicatePackage.TEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_VALUE_TEST__THRESHOLD = PredicatePackage.TEST_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_VALUE_TEST__PREDICATE = PredicatePackage.TEST_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_VALUE_TEST__POPULATION_IDENTIFIER = PredicatePackage.TEST_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Label Value Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_VALUE_TEST_FEATURE_COUNT = PredicatePackage.TEST_FEATURE_COUNT + 6;


	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.diseasemodels.predicates.diseasepredicates.LabelValueTest <em>Label Value Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Value Test</em>'.
	 * @see org.eclipse.stem.diseasemodels.predicates.diseasepredicates.LabelValueTest
	 * @generated
	 */
	EClass getLabelValueTest();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.predicates.diseasepredicates.LabelValueTest#getModelName <em>Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Name</em>'.
	 * @see org.eclipse.stem.diseasemodels.predicates.diseasepredicates.LabelValueTest#getModelName()
	 * @see #getLabelValueTest()
	 * @generated
	 */
	EAttribute getLabelValueTest_ModelName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.predicates.diseasepredicates.LabelValueTest#getTargetURI <em>Target URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target URI</em>'.
	 * @see org.eclipse.stem.diseasemodels.predicates.diseasepredicates.LabelValueTest#getTargetURI()
	 * @see #getLabelValueTest()
	 * @generated
	 */
	EAttribute getLabelValueTest_TargetURI();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.predicates.diseasepredicates.LabelValueTest#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.eclipse.stem.diseasemodels.predicates.diseasepredicates.LabelValueTest#getState()
	 * @see #getLabelValueTest()
	 * @generated
	 */
	EAttribute getLabelValueTest_State();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.predicates.diseasepredicates.LabelValueTest#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threshold</em>'.
	 * @see org.eclipse.stem.diseasemodels.predicates.diseasepredicates.LabelValueTest#getThreshold()
	 * @see #getLabelValueTest()
	 * @generated
	 */
	EAttribute getLabelValueTest_Threshold();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.predicates.diseasepredicates.LabelValueTest#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predicate</em>'.
	 * @see org.eclipse.stem.diseasemodels.predicates.diseasepredicates.LabelValueTest#getPredicate()
	 * @see #getLabelValueTest()
	 * @generated
	 */
	EAttribute getLabelValueTest_Predicate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.diseasemodels.predicates.diseasepredicates.LabelValueTest#getPopulationIdentifier <em>Population Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Population Identifier</em>'.
	 * @see org.eclipse.stem.diseasemodels.predicates.diseasepredicates.LabelValueTest#getPopulationIdentifier()
	 * @see #getLabelValueTest()
	 * @generated
	 */
	EAttribute getLabelValueTest_PopulationIdentifier();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DiseasepredicatesFactory getDiseasepredicatesFactory();

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
		 * The meta object literal for the '{@link org.eclipse.stem.diseasemodels.predicates.diseasepredicates.impl.LabelValueTestImpl <em>Label Value Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.diseasemodels.predicates.diseasepredicates.impl.LabelValueTestImpl
		 * @see org.eclipse.stem.diseasemodels.predicates.diseasepredicates.impl.DiseasepredicatesPackageImpl#getLabelValueTest()
		 * @generated
		 */
		EClass LABEL_VALUE_TEST = eINSTANCE.getLabelValueTest();

		/**
		 * The meta object literal for the '<em><b>Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_VALUE_TEST__MODEL_NAME = eINSTANCE.getLabelValueTest_ModelName();

		/**
		 * The meta object literal for the '<em><b>Target URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_VALUE_TEST__TARGET_URI = eINSTANCE.getLabelValueTest_TargetURI();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_VALUE_TEST__STATE = eINSTANCE.getLabelValueTest_State();

		/**
		 * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_VALUE_TEST__THRESHOLD = eINSTANCE.getLabelValueTest_Threshold();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_VALUE_TEST__PREDICATE = eINSTANCE.getLabelValueTest_Predicate();

		/**
		 * The meta object literal for the '<em><b>Population Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_VALUE_TEST__POPULATION_IDENTIFIER = eINSTANCE.getLabelValueTest_PopulationIdentifier();

	}

} //DiseasepredicatesPackage
