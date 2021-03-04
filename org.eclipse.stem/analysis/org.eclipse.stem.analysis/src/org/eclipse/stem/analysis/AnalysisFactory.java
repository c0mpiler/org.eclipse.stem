package org.eclipse.stem.analysis;

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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.stem.analysis.AnalysisPackage
 * @generated
 */
public interface AnalysisFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnalysisFactory eINSTANCE = org.eclipse.stem.analysis.impl.AnalysisFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Error Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Function</em>'.
	 * @generated
	 */
	ErrorFunction createErrorFunction();

	/**
	 * Returns a new object of class '<em>Threshold Error Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Threshold Error Function</em>'.
	 * @generated
	 */
	ThresholdErrorFunction createThresholdErrorFunction();

	/**
	 * Returns a new object of class '<em>Reference Scenario Data Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Scenario Data Map</em>'.
	 * @generated
	 */
	ReferenceScenarioDataMap createReferenceScenarioDataMap();

	/**
	 * Returns a new object of class '<em>Simple Error Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Error Function</em>'.
	 * @generated
	 */
	SimpleErrorFunction createSimpleErrorFunction();

	/**
	 * Returns a new object of class '<em>Error Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Result</em>'.
	 * @generated
	 */
	ErrorResult createErrorResult();

	/**
	 * Returns a new object of class '<em>Compound Error Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compound Error Function</em>'.
	 * @generated
	 */
	CompoundErrorFunction createCompoundErrorFunction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AnalysisPackage getAnalysisPackage();

} //AnalysisFactory
