package org.eclipse.stem.diseasemodels.experimental;

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
 * @see org.eclipse.stem.diseasemodels.experimental.ExperimentalPackage
 * @generated
 */
public interface ExperimentalFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExperimentalFactory eINSTANCE = org.eclipse.stem.diseasemodels.experimental.impl.ExperimentalFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Percolation Disease Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Percolation Disease Model</em>'.
	 * @generated
	 */
	PercolationDiseaseModel createPercolationDiseaseModel();

	/**
	 * Returns a new object of class '<em>TB Disease Model Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TB Disease Model Label</em>'.
	 * @generated
	 */
	TBDiseaseModelLabel createTBDiseaseModelLabel();

	/**
	 * Returns a new object of class '<em>TB Disease Model Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TB Disease Model Label Value</em>'.
	 * @generated
	 */
	TBDiseaseModelLabelValue createTBDiseaseModelLabelValue();

	/**
	 * Returns a new object of class '<em>TB Disease Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TB Disease Model</em>'.
	 * @generated
	 */
	TBDiseaseModel createTBDiseaseModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExperimentalPackage getExperimentalPackage();

} //ExperimentalFactory