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
package org.eclipse.stem.diseasemodels.evolving;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingPackage
 * @generated
 */
public interface EvolvingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EvolvingFactory eINSTANCE = org.eclipse.stem.diseasemodels.evolving.impl.EvolvingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Disease Transformer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disease Transformer</em>'.
	 * @generated
	 */
	EvolvingDiseaseTransformer createEvolvingDiseaseTransformer();

	/**
	 * Returns a new object of class '<em>SI Disease Model Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SI Disease Model Label</em>'.
	 * @generated
	 */
	EvolvingSIDiseaseModelLabel createEvolvingSIDiseaseModelLabel();

	/**
	 * Returns a new object of class '<em>SI Disease Model Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SI Disease Model Label Value</em>'.
	 * @generated
	 */
	EvolvingSIDiseaseModelLabelValue createEvolvingSIDiseaseModelLabelValue();

	/**
	 * Returns a new object of class '<em>SI Disease Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SI Disease Model</em>'.
	 * @generated
	 */
	EvolvingSIDiseaseModel createEvolvingSIDiseaseModel();

	/**
	 * Returns a new object of class '<em>SIR Disease Model Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SIR Disease Model Label</em>'.
	 * @generated
	 */
	EvolvingSIRDiseaseModelLabel createEvolvingSIRDiseaseModelLabel();

	/**
	 * Returns a new object of class '<em>SIR Disease Model Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SIR Disease Model Label Value</em>'.
	 * @generated
	 */
	EvolvingSIRDiseaseModelLabelValue createEvolvingSIRDiseaseModelLabelValue();

	/**
	 * Returns a new object of class '<em>SIR Disease Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SIR Disease Model</em>'.
	 * @generated
	 */
	EvolvingSIRDiseaseModel createEvolvingSIRDiseaseModel();

	/**
	 * Returns a new object of class '<em>SEIR Disease Model Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SEIR Disease Model Label</em>'.
	 * @generated
	 */
	EvolvingSEIRDiseaseModelLabel createEvolvingSEIRDiseaseModelLabel();

	/**
	 * Returns a new object of class '<em>SEIR Disease Model Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SEIR Disease Model Label Value</em>'.
	 * @generated
	 */
	EvolvingSEIRDiseaseModelLabelValue createEvolvingSEIRDiseaseModelLabelValue();

	/**
	 * Returns a new object of class '<em>SEIR Disease Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SEIR Disease Model</em>'.
	 * @generated
	 */
	EvolvingSEIRDiseaseModel createEvolvingSEIRDiseaseModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EvolvingPackage getEvolvingPackage();

} //EvolvingFactory
