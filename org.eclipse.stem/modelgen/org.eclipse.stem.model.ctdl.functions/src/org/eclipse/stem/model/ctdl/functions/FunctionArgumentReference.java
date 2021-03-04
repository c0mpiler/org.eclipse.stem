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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Argument Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.ctdl.functions.FunctionArgumentReference#getArgIndex <em>Arg Index</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.functions.FunctionArgumentReference#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionsPackage#getFunctionArgumentReference()
 * @model
 * @generated
 */
public interface FunctionArgumentReference extends JavaMethodArgument {
	/**
	 * Returns the value of the '<em><b>Arg Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arg Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg Index</em>' attribute.
	 * @see #setArgIndex(int)
	 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionsPackage#getFunctionArgumentReference_ArgIndex()
	 * @model
	 * @generated
	 */
	int getArgIndex();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.ctdl.functions.FunctionArgumentReference#getArgIndex <em>Arg Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg Index</em>' attribute.
	 * @see #getArgIndex()
	 * @generated
	 */
	void setArgIndex(int value);

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(FunctionArgument)
	 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionsPackage#getFunctionArgumentReference_Ref()
	 * @model
	 * @generated
	 */
	FunctionArgument getRef();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.ctdl.functions.FunctionArgumentReference#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(FunctionArgument value);

} // FunctionArgumentReference
