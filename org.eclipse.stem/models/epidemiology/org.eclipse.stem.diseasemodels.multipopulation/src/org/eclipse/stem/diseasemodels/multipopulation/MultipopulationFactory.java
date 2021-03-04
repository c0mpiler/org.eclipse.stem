package org.eclipse.stem.diseasemodels.multipopulation;

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
 * @see org.eclipse.stem.diseasemodels.multipopulation.MultipopulationPackage
 * @generated
 */
public interface MultipopulationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MultipopulationFactory eINSTANCE = org.eclipse.stem.diseasemodels.multipopulation.impl.MultipopulationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Multi Population SI Disease Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Population SI Disease Model</em>'.
	 * @generated
	 */
	MultiPopulationSIDiseaseModel createMultiPopulationSIDiseaseModel();

	/**
	 * Returns a new object of class '<em>Multi Population SIR Disease Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Population SIR Disease Model</em>'.
	 * @generated
	 */
	MultiPopulationSIRDiseaseModel createMultiPopulationSIRDiseaseModel();

	/**
	 * Returns a new object of class '<em>Multi Population SEIR Disease Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Population SEIR Disease Model</em>'.
	 * @generated
	 */
	MultiPopulationSEIRDiseaseModel createMultiPopulationSEIRDiseaseModel();

	/**
	 * Returns a new object of class '<em>Multi Population Seasonal Disease Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Population Seasonal Disease Model</em>'.
	 * @generated
	 */
	MultiPopulationSeasonalDiseaseModel createMultiPopulationSeasonalDiseaseModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MultipopulationPackage getMultipopulationPackage();

} //MultipopulationFactory
