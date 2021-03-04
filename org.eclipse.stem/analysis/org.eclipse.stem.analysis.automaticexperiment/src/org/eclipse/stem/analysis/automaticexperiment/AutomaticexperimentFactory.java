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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.stem.analysis.automaticexperiment.AutomaticexperimentPackage
 * @generated
 */
public interface AutomaticexperimentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AutomaticexperimentFactory eINSTANCE = org.eclipse.stem.analysis.automaticexperiment.impl.AutomaticexperimentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Automatic Experiment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Automatic Experiment</em>'.
	 * @generated
	 */
	AutomaticExperiment createAutomaticExperiment();

	/**
	 * Returns a new object of class '<em>Modifiable Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modifiable Parameter</em>'.
	 * @generated
	 */
	ModifiableParameter createModifiableParameter();

	/**
	 * Returns a new object of class '<em>Optimizer Algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Optimizer Algorithm</em>'.
	 * @generated
	 */
	OptimizerAlgorithm createOptimizerAlgorithm();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AutomaticexperimentPackage getAutomaticexperimentPackage();

} //AutomaticexperimentFactory
