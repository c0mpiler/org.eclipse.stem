package org.eclipse.stem.analysis.automaticexperiment;

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
import org.eclipse.emf.ecore.EReference;
import org.eclipse.stem.core.common.CommonPackage;

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
 * @see org.eclipse.stem.analysis.automaticexperiment.AutomaticexperimentFactory
 * @model kind="package"
 * @generated
 */
public interface AutomaticexperimentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "automaticexperiment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/stem/core/automaticexperiment.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.stem.analysis.automaticexperiment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AutomaticexperimentPackage eINSTANCE = org.eclipse.stem.analysis.automaticexperiment.impl.AutomaticexperimentPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.stem.analysis.automaticexperiment.impl.OptimizerAlgorithmImpl <em>Optimizer Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.analysis.automaticexperiment.impl.OptimizerAlgorithmImpl
	 * @see org.eclipse.stem.analysis.automaticexperiment.impl.AutomaticexperimentPackageImpl#getOptimizerAlgorithm()
	 * @generated
	 */
	int OPTIMIZER_ALGORITHM = 2;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZER_ALGORITHM__URI = CommonPackage.IDENTIFIABLE__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZER_ALGORITHM__TYPE_URI = CommonPackage.IDENTIFIABLE__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZER_ALGORITHM__DUBLIN_CORE = CommonPackage.IDENTIFIABLE__DUBLIN_CORE;

	/**
	 * The number of structural features of the '<em>Optimizer Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZER_ALGORITHM_FEATURE_COUNT = CommonPackage.IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.analysis.automaticexperiment.impl.AutomaticExperimentImpl <em>Automatic Experiment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.analysis.automaticexperiment.impl.AutomaticExperimentImpl
	 * @see org.eclipse.stem.analysis.automaticexperiment.impl.AutomaticexperimentPackageImpl#getAutomaticExperiment()
	 * @generated
	 */
	int AUTOMATIC_EXPERIMENT = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_EXPERIMENT__URI = OPTIMIZER_ALGORITHM__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_EXPERIMENT__TYPE_URI = OPTIMIZER_ALGORITHM__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_EXPERIMENT__DUBLIN_CORE = OPTIMIZER_ALGORITHM__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Base Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_EXPERIMENT__BASE_SCENARIO = OPTIMIZER_ALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_EXPERIMENT__PARAMETERS = OPTIMIZER_ALGORITHM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Error Analysis Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_EXPERIMENT__ERROR_ANALYSIS_ALGORITHM = OPTIMIZER_ALGORITHM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Error Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_EXPERIMENT__ERROR_FUNCTION = OPTIMIZER_ALGORITHM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_EXPERIMENT__TOLERANCE = OPTIMIZER_ALGORITHM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Referance Data Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_EXPERIMENT__REFERANCE_DATA_DIR = OPTIMIZER_ALGORITHM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Maximum Number Of Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_EXPERIMENT__MAXIMUM_NUMBER_OF_ITERATIONS = OPTIMIZER_ALGORITHM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Re Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_EXPERIMENT__RE_INIT = OPTIMIZER_ALGORITHM_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Error Func</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_EXPERIMENT__ERROR_FUNC = OPTIMIZER_ALGORITHM_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Automatic Experiment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_EXPERIMENT_FEATURE_COUNT = OPTIMIZER_ALGORITHM_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.analysis.automaticexperiment.impl.ModifiableParameterImpl <em>Modifiable Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.analysis.automaticexperiment.impl.ModifiableParameterImpl
	 * @see org.eclipse.stem.analysis.automaticexperiment.impl.AutomaticexperimentPackageImpl#getModifiableParameter()
	 * @generated
	 */
	int MODIFIABLE_PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE_PARAMETER__INITIAL_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE_PARAMETER__FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE_PARAMETER__STEP = 2;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE_PARAMETER__FEATURE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE_PARAMETER__LOWER_BOUND = 4;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE_PARAMETER__UPPER_BOUND = 5;

	/**
	 * The feature id for the '<em><b>Target URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE_PARAMETER__TARGET_URI = 6;

	/**
	 * The number of structural features of the '<em>Modifiable Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIABLE_PARAMETER_FEATURE_COUNT = 7;


	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment <em>Automatic Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Automatic Experiment</em>'.
	 * @see org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment
	 * @generated
	 */
	EClass getAutomaticExperiment();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#getBaseScenario <em>Base Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Scenario</em>'.
	 * @see org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#getBaseScenario()
	 * @see #getAutomaticExperiment()
	 * @generated
	 */
	EReference getAutomaticExperiment_BaseScenario();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#getParameters()
	 * @see #getAutomaticExperiment()
	 * @generated
	 */
	EReference getAutomaticExperiment_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#getErrorAnalysisAlgorithm <em>Error Analysis Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Analysis Algorithm</em>'.
	 * @see org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#getErrorAnalysisAlgorithm()
	 * @see #getAutomaticExperiment()
	 * @generated
	 */
	EAttribute getAutomaticExperiment_ErrorAnalysisAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#getErrorFunction <em>Error Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Function</em>'.
	 * @see org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#getErrorFunction()
	 * @see #getAutomaticExperiment()
	 * @generated
	 */
	EAttribute getAutomaticExperiment_ErrorFunction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#getTolerance <em>Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tolerance</em>'.
	 * @see org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#getTolerance()
	 * @see #getAutomaticExperiment()
	 * @generated
	 */
	EAttribute getAutomaticExperiment_Tolerance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#getReferanceDataDir <em>Referance Data Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referance Data Dir</em>'.
	 * @see org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#getReferanceDataDir()
	 * @see #getAutomaticExperiment()
	 * @generated
	 */
	EAttribute getAutomaticExperiment_ReferanceDataDir();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#getMaximumNumberOfIterations <em>Maximum Number Of Iterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Number Of Iterations</em>'.
	 * @see org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#getMaximumNumberOfIterations()
	 * @see #getAutomaticExperiment()
	 * @generated
	 */
	EAttribute getAutomaticExperiment_MaximumNumberOfIterations();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#isReInit <em>Re Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Re Init</em>'.
	 * @see org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#isReInit()
	 * @see #getAutomaticExperiment()
	 * @generated
	 */
	EAttribute getAutomaticExperiment_ReInit();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#getErrorFunc <em>Error Func</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Func</em>'.
	 * @see org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#getErrorFunc()
	 * @see #getAutomaticExperiment()
	 * @generated
	 */
	EReference getAutomaticExperiment_ErrorFunc();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.analysis.automaticexperiment.ModifiableParameter <em>Modifiable Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modifiable Parameter</em>'.
	 * @see org.eclipse.stem.analysis.automaticexperiment.ModifiableParameter
	 * @generated
	 */
	EClass getModifiableParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.analysis.automaticexperiment.ModifiableParameter#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see org.eclipse.stem.analysis.automaticexperiment.ModifiableParameter#getInitialValue()
	 * @see #getModifiableParameter()
	 * @generated
	 */
	EAttribute getModifiableParameter_InitialValue();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.analysis.automaticexperiment.ModifiableParameter#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.eclipse.stem.analysis.automaticexperiment.ModifiableParameter#getFeature()
	 * @see #getModifiableParameter()
	 * @generated
	 */
	EReference getModifiableParameter_Feature();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.analysis.automaticexperiment.ModifiableParameter#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see org.eclipse.stem.analysis.automaticexperiment.ModifiableParameter#getStep()
	 * @see #getModifiableParameter()
	 * @generated
	 */
	EAttribute getModifiableParameter_Step();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.analysis.automaticexperiment.ModifiableParameter#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see org.eclipse.stem.analysis.automaticexperiment.ModifiableParameter#getFeatureName()
	 * @see #getModifiableParameter()
	 * @generated
	 */
	EAttribute getModifiableParameter_FeatureName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.analysis.automaticexperiment.ModifiableParameter#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see org.eclipse.stem.analysis.automaticexperiment.ModifiableParameter#getLowerBound()
	 * @see #getModifiableParameter()
	 * @generated
	 */
	EAttribute getModifiableParameter_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.analysis.automaticexperiment.ModifiableParameter#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see org.eclipse.stem.analysis.automaticexperiment.ModifiableParameter#getUpperBound()
	 * @see #getModifiableParameter()
	 * @generated
	 */
	EAttribute getModifiableParameter_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.analysis.automaticexperiment.ModifiableParameter#getTargetURI <em>Target URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target URI</em>'.
	 * @see org.eclipse.stem.analysis.automaticexperiment.ModifiableParameter#getTargetURI()
	 * @see #getModifiableParameter()
	 * @generated
	 */
	EAttribute getModifiableParameter_TargetURI();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.analysis.automaticexperiment.OptimizerAlgorithm <em>Optimizer Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optimizer Algorithm</em>'.
	 * @see org.eclipse.stem.analysis.automaticexperiment.OptimizerAlgorithm
	 * @generated
	 */
	EClass getOptimizerAlgorithm();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AutomaticexperimentFactory getAutomaticexperimentFactory();

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
		 * The meta object literal for the '{@link org.eclipse.stem.analysis.automaticexperiment.impl.AutomaticExperimentImpl <em>Automatic Experiment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.analysis.automaticexperiment.impl.AutomaticExperimentImpl
		 * @see org.eclipse.stem.analysis.automaticexperiment.impl.AutomaticexperimentPackageImpl#getAutomaticExperiment()
		 * @generated
		 */
		EClass AUTOMATIC_EXPERIMENT = eINSTANCE.getAutomaticExperiment();

		/**
		 * The meta object literal for the '<em><b>Base Scenario</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATIC_EXPERIMENT__BASE_SCENARIO = eINSTANCE.getAutomaticExperiment_BaseScenario();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATIC_EXPERIMENT__PARAMETERS = eINSTANCE.getAutomaticExperiment_Parameters();

		/**
		 * The meta object literal for the '<em><b>Error Analysis Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATIC_EXPERIMENT__ERROR_ANALYSIS_ALGORITHM = eINSTANCE.getAutomaticExperiment_ErrorAnalysisAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Error Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATIC_EXPERIMENT__ERROR_FUNCTION = eINSTANCE.getAutomaticExperiment_ErrorFunction();

		/**
		 * The meta object literal for the '<em><b>Tolerance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATIC_EXPERIMENT__TOLERANCE = eINSTANCE.getAutomaticExperiment_Tolerance();

		/**
		 * The meta object literal for the '<em><b>Referance Data Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATIC_EXPERIMENT__REFERANCE_DATA_DIR = eINSTANCE.getAutomaticExperiment_ReferanceDataDir();

		/**
		 * The meta object literal for the '<em><b>Maximum Number Of Iterations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATIC_EXPERIMENT__MAXIMUM_NUMBER_OF_ITERATIONS = eINSTANCE.getAutomaticExperiment_MaximumNumberOfIterations();

		/**
		 * The meta object literal for the '<em><b>Re Init</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATIC_EXPERIMENT__RE_INIT = eINSTANCE.getAutomaticExperiment_ReInit();

		/**
		 * The meta object literal for the '<em><b>Error Func</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATIC_EXPERIMENT__ERROR_FUNC = eINSTANCE.getAutomaticExperiment_ErrorFunc();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.analysis.automaticexperiment.impl.ModifiableParameterImpl <em>Modifiable Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.analysis.automaticexperiment.impl.ModifiableParameterImpl
		 * @see org.eclipse.stem.analysis.automaticexperiment.impl.AutomaticexperimentPackageImpl#getModifiableParameter()
		 * @generated
		 */
		EClass MODIFIABLE_PARAMETER = eINSTANCE.getModifiableParameter();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFIABLE_PARAMETER__INITIAL_VALUE = eINSTANCE.getModifiableParameter_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIABLE_PARAMETER__FEATURE = eINSTANCE.getModifiableParameter_Feature();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFIABLE_PARAMETER__STEP = eINSTANCE.getModifiableParameter_Step();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFIABLE_PARAMETER__FEATURE_NAME = eINSTANCE.getModifiableParameter_FeatureName();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFIABLE_PARAMETER__LOWER_BOUND = eINSTANCE.getModifiableParameter_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFIABLE_PARAMETER__UPPER_BOUND = eINSTANCE.getModifiableParameter_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Target URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFIABLE_PARAMETER__TARGET_URI = eINSTANCE.getModifiableParameter_TargetURI();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.analysis.automaticexperiment.impl.OptimizerAlgorithmImpl <em>Optimizer Algorithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.analysis.automaticexperiment.impl.OptimizerAlgorithmImpl
		 * @see org.eclipse.stem.analysis.automaticexperiment.impl.AutomaticexperimentPackageImpl#getOptimizerAlgorithm()
		 * @generated
		 */
		EClass OPTIMIZER_ALGORITHM = eINSTANCE.getOptimizerAlgorithm();

	}

} //AutomaticexperimentPackage
