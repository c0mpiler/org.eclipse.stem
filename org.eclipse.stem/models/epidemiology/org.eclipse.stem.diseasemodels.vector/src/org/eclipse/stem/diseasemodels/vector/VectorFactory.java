package org.eclipse.stem.diseasemodels.vector;

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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage
 * @generated
 */
public interface VectorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VectorFactory eINSTANCE = org.eclipse.stem.diseasemodels.vector.impl.VectorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Macdonald Ross Disease Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Macdonald Ross Disease Model</em>'.
	 * @generated
	 */
	MacdonaldRossDiseaseModel createMacdonaldRossDiseaseModel();

	/**
	 * Returns a new object of class '<em>Dengue Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dengue Model</em>'.
	 * @generated
	 */
	DengueModel createDengueModel();

	/**
	 * Returns a new object of class '<em>Simple Dengue Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Dengue Model</em>'.
	 * @generated
	 */
	SimpleDengueModel createSimpleDengueModel();

	/**
	 * Returns a new object of class '<em>Very Simple Dengue Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Very Simple Dengue Model</em>'.
	 * @generated
	 */
	VerySimpleDengueModel createVerySimpleDengueModel();

	/**
	 * Returns a new object of class '<em>Dengue Model Host Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dengue Model Host Label</em>'.
	 * @generated
	 */
	DengueModelHostLabel createDengueModelHostLabel();

	/**
	 * Returns a new object of class '<em>Dengue Model Host Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dengue Model Host Label Value</em>'.
	 * @generated
	 */
	DengueModelHostLabelValue createDengueModelHostLabelValue();

	/**
	 * Returns a new object of class '<em>Dengue Model Vector Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dengue Model Vector Label</em>'.
	 * @generated
	 */
	DengueModelVectorLabel createDengueModelVectorLabel();

	/**
	 * Returns a new object of class '<em>Dengue Model Vector Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dengue Model Vector Label Value</em>'.
	 * @generated
	 */
	DengueModelVectorLabelValue createDengueModelVectorLabelValue();

	/**
	 * Returns a new object of class '<em>Simple Dengue Model Host Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Dengue Model Host Label</em>'.
	 * @generated
	 */
	SimpleDengueModelHostLabel createSimpleDengueModelHostLabel();

	/**
	 * Returns a new object of class '<em>Simple Dengue Model Host Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Dengue Model Host Label Value</em>'.
	 * @generated
	 */
	SimpleDengueModelHostLabelValue createSimpleDengueModelHostLabelValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VectorPackage getVectorPackage();

} //VectorFactory
