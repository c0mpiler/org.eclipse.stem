package org.eclipse.stem.diseasemodels.avianinfluenza;

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
 * @see org.eclipse.stem.diseasemodels.avianinfluenza.AvianinfluenzaPackage
 * @generated
 */
public interface AvianinfluenzaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AvianinfluenzaFactory eINSTANCE = org.eclipse.stem.diseasemodels.avianinfluenza.impl.AvianinfluenzaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>H7N9 Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>H7N9 Label</em>'.
	 * @generated
	 */
	H7N9Label createH7N9Label();

	/**
	 * Returns a new object of class '<em>H7N9 Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>H7N9 Label Value</em>'.
	 * @generated
	 */
	H7N9LabelValue createH7N9LabelValue();

	/**
	 * Returns a new object of class '<em>H7N9</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>H7N9</em>'.
	 * @generated
	 */
	H7N9 createH7N9();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AvianinfluenzaPackage getAvianinfluenzaPackage();

} //AvianinfluenzaFactory
