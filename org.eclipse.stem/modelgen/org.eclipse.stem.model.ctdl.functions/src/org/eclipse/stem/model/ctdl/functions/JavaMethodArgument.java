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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Method Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.ctdl.functions.JavaMethodArgument#getMapsFrom <em>Maps From</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.functions.JavaMethodArgument#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.functions.JavaMethodArgument#getJavaType <em>Java Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionsPackage#getJavaMethodArgument()
 * @model
 * @generated
 */
public interface JavaMethodArgument extends EObject {
	/**
	 * Returns the value of the '<em><b>Maps From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maps From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maps From</em>' attribute.
	 * @see #setMapsFrom(String)
	 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionsPackage#getJavaMethodArgument_MapsFrom()
	 * @model transient="true"
	 * @generated
	 */
	String getMapsFrom();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.ctdl.functions.JavaMethodArgument#getMapsFrom <em>Maps From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maps From</em>' attribute.
	 * @see #getMapsFrom()
	 * @generated
	 */
	void setMapsFrom(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionsPackage#getJavaMethodArgument_Type()
	 * @model transient="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.ctdl.functions.JavaMethodArgument#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Java Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Type</em>' attribute.
	 * @see #setJavaType(Class)
	 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionsPackage#getJavaMethodArgument_JavaType()
	 * @model transient="true"
	 * @generated
	 */
	Class<?> getJavaType();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.ctdl.functions.JavaMethodArgument#getJavaType <em>Java Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Type</em>' attribute.
	 * @see #getJavaType()
	 * @generated
	 */
	void setJavaType(Class<?> value);

} // JavaMethodArgument
