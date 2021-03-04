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
package org.eclipse.stem.model.ctdl.functions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionsPackage
 * @generated
 */
public interface ExternalFunctionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExternalFunctionsFactory eINSTANCE = org.eclipse.stem.model.ctdl.functions.impl.ExternalFunctionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>External Function Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Function Definition</em>'.
	 * @generated
	 */
	ExternalFunctionDefinition createExternalFunctionDefinition();

	/**
	 * Returns a new object of class '<em>Function Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Argument</em>'.
	 * @generated
	 */
	FunctionArgument createFunctionArgument();

	/**
	 * Returns a new object of class '<em>Java Method Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Method Argument</em>'.
	 * @generated
	 */
	JavaMethodArgument createJavaMethodArgument();

	/**
	 * Returns a new object of class '<em>System Argument Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Argument Reference</em>'.
	 * @generated
	 */
	SystemArgumentReference createSystemArgumentReference();

	/**
	 * Returns a new object of class '<em>Function Argument Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Argument Reference</em>'.
	 * @generated
	 */
	FunctionArgumentReference createFunctionArgumentReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExternalFunctionsPackage getExternalFunctionsPackage();

} //ExternalFunctionsFactory
