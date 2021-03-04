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

import org.eclipse.emf.common.util.EList;
import org.eclipse.stem.analysis.ErrorFunction;
import org.eclipse.stem.core.scenario.Scenario;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Automatic Experiment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#getBaseScenario <em>Base Scenario</em>}</li>
 *   <li>{@link org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#getErrorAnalysisAlgorithm <em>Error Analysis Algorithm</em>}</li>
 *   <li>{@link org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#getErrorFunction <em>Error Function</em>}</li>
 *   <li>{@link org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#getTolerance <em>Tolerance</em>}</li>
 *   <li>{@link org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#getReferanceDataDir <em>Referance Data Dir</em>}</li>
 *   <li>{@link org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#getMaximumNumberOfIterations <em>Maximum Number Of Iterations</em>}</li>
 *   <li>{@link org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#isReInit <em>Re Init</em>}</li>
 *   <li>{@link org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#getErrorFunc <em>Error Func</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.analysis.automaticexperiment.AutomaticexperimentPackage#getAutomaticExperiment()
 * @model
 * @generated
 */
public interface AutomaticExperiment extends OptimizerAlgorithm {
	/**
	 * Returns the value of the '<em><b>Base Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Scenario</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Scenario</em>' reference.
	 * @see #setBaseScenario(Scenario)
	 * @see org.eclipse.stem.analysis.automaticexperiment.AutomaticexperimentPackage#getAutomaticExperiment_BaseScenario()
	 * @model required="true"
	 * @generated
	 */
	Scenario getBaseScenario();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#getBaseScenario <em>Base Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Scenario</em>' reference.
	 * @see #getBaseScenario()
	 * @generated
	 */
	void setBaseScenario(Scenario value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.stem.analysis.automaticexperiment.ModifiableParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.eclipse.stem.analysis.automaticexperiment.AutomaticexperimentPackage#getAutomaticExperiment_Parameters()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ModifiableParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Error Analysis Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Analysis Algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Analysis Algorithm</em>' attribute.
	 * @see #setErrorAnalysisAlgorithm(String)
	 * @see org.eclipse.stem.analysis.automaticexperiment.AutomaticexperimentPackage#getAutomaticExperiment_ErrorAnalysisAlgorithm()
	 * @model required="true"
	 * @generated NOT
	 * @deprecated
	 */
	String getErrorAnalysisAlgorithm();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#getErrorAnalysisAlgorithm <em>Error Analysis Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Analysis Algorithm</em>' attribute.
	 * @see #getErrorAnalysisAlgorithm()
	 * @generated NOT
	 * @deprecated
	 */
	void setErrorAnalysisAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Error Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Function</em>' attribute.
	 * @see #setErrorFunction(String)
	 * @see org.eclipse.stem.analysis.automaticexperiment.AutomaticexperimentPackage#getAutomaticExperiment_ErrorFunction()
	 * @model required="true"
	 * @generated NOT
	 * @deprecated
	 */
	String getErrorFunction();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#getErrorFunction <em>Error Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Function</em>' attribute.
	 * @see #getErrorFunction()
	 * @generated NOT
	 * @deprecated
	 */
	void setErrorFunction(String value);

	/**
	 * Returns the value of the '<em><b>Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tolerance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tolerance</em>' attribute.
	 * @see #setTolerance(double)
	 * @see org.eclipse.stem.analysis.automaticexperiment.AutomaticexperimentPackage#getAutomaticExperiment_Tolerance()
	 * @model required="true"
	 * @generated
	 */
	double getTolerance();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#getTolerance <em>Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tolerance</em>' attribute.
	 * @see #getTolerance()
	 * @generated
	 */
	void setTolerance(double value);

	/**
	 * Returns the value of the '<em><b>Referance Data Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referance Data Dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referance Data Dir</em>' attribute.
	 * @see #setReferanceDataDir(String)
	 * @see org.eclipse.stem.analysis.automaticexperiment.AutomaticexperimentPackage#getAutomaticExperiment_ReferanceDataDir()
	 * @model required="true"
	 * @generated
	 */
	String getReferanceDataDir();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#getReferanceDataDir <em>Referance Data Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referance Data Dir</em>' attribute.
	 * @see #getReferanceDataDir()
	 * @generated
	 */
	void setReferanceDataDir(String value);

	/**
	 * Returns the value of the '<em><b>Maximum Number Of Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Number Of Iterations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Number Of Iterations</em>' attribute.
	 * @see #setMaximumNumberOfIterations(long)
	 * @see org.eclipse.stem.analysis.automaticexperiment.AutomaticexperimentPackage#getAutomaticExperiment_MaximumNumberOfIterations()
	 * @model required="true"
	 * @generated
	 */
	long getMaximumNumberOfIterations();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#getMaximumNumberOfIterations <em>Maximum Number Of Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Number Of Iterations</em>' attribute.
	 * @see #getMaximumNumberOfIterations()
	 * @generated
	 */
	void setMaximumNumberOfIterations(long value);

	/**
	 * Returns the value of the '<em><b>Re Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Re Init</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Re Init</em>' attribute.
	 * @see #setReInit(boolean)
	 * @see org.eclipse.stem.analysis.automaticexperiment.AutomaticexperimentPackage#getAutomaticExperiment_ReInit()
	 * @model required="true"
	 * @generated
	 */
	boolean isReInit();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#isReInit <em>Re Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Re Init</em>' attribute.
	 * @see #isReInit()
	 * @generated
	 */
	void setReInit(boolean value);

	/**
	 * Returns the value of the '<em><b>Error Func</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Func</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Func</em>' containment reference.
	 * @see #setErrorFunc(ErrorFunction)
	 * @see org.eclipse.stem.analysis.automaticexperiment.AutomaticexperimentPackage#getAutomaticExperiment_ErrorFunc()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ErrorFunction getErrorFunc();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment#getErrorFunc <em>Error Func</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Func</em>' containment reference.
	 * @see #getErrorFunc()
	 * @generated
	 */
	void setErrorFunc(ErrorFunction value);

} // AutomaticExperiment
