package org.eclipse.stem.diseasemodels.forcing;

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
 * @see org.eclipse.stem.diseasemodels.forcing.ForcingPackage
 * @generated
 */
public interface ForcingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ForcingFactory eINSTANCE = org.eclipse.stem.diseasemodels.forcing.impl.ForcingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Disease Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disease Model</em>'.
	 * @generated
	 */
	ForcingDiseaseModel createForcingDiseaseModel();

	/**
	 * Returns a new object of class '<em>Gaussian Forcing Disease Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gaussian Forcing Disease Model</em>'.
	 * @generated
	 */
	GaussianForcingDiseaseModel createGaussianForcingDiseaseModel();

	/**
	 * Returns a new object of class '<em>Gaussian2 Forcing Disease Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gaussian2 Forcing Disease Model</em>'.
	 * @generated
	 */
	Gaussian2ForcingDiseaseModel createGaussian2ForcingDiseaseModel();

	/**
	 * Returns a new object of class '<em>Gaussian3 Forcing Disease Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gaussian3 Forcing Disease Model</em>'.
	 * @generated
	 */
	Gaussian3ForcingDiseaseModel createGaussian3ForcingDiseaseModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ForcingPackage getForcingPackage();

} //ExampleFactory
