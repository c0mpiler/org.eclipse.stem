package org.eclipse.stem.interventions;

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
 * @see org.eclipse.stem.interventions.InterventionsPackage
 * @generated
 */
public interface InterventionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InterventionsFactory eINSTANCE = org.eclipse.stem.interventions.impl.InterventionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Standard Intervention Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard Intervention Label</em>'.
	 * @generated
	 */
	StandardInterventionLabel createStandardInterventionLabel();

	/**
	 * Returns a new object of class '<em>Control Graph Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Graph Generator</em>'.
	 * @generated
	 */
	ControlGraphGenerator createControlGraphGenerator();

	/**
	 * Returns a new object of class '<em>Standard Intervention Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard Intervention Label Value</em>'.
	 * @generated
	 */
	StandardInterventionLabelValue createStandardInterventionLabelValue();

	/**
	 * Returns a new object of class '<em>Standard Periodic Intervention Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard Periodic Intervention Label Value</em>'.
	 * @generated
	 */
	StandardPeriodicInterventionLabelValue createStandardPeriodicInterventionLabelValue();

	/**
	 * Returns a new object of class '<em>Periodic Control Graph Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Periodic Control Graph Generator</em>'.
	 * @generated
	 */
	PeriodicControlGraphGenerator createPeriodicControlGraphGenerator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InterventionsPackage getInterventionsPackage();

} //InterventionsFactory
