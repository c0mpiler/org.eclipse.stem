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

import java.lang.reflect.Method;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Function Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getContributingPlugin <em>Contributing Plugin</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getExtPointDefinition <em>Ext Point Definition</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getFunctionArguments <em>Function Arguments</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getJavaMethodArguments <em>Java Method Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionsPackage#getExternalFunctionDefinition()
 * @model
 * @generated
 */
public interface ExternalFunctionDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionsPackage#getExternalFunctionDefinition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(Class)
	 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionsPackage#getExternalFunctionDefinition_Class()
	 * @model
	 * @generated
	 */
	Class<?> getClass_();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(Class<?> value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(Method)
	 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionsPackage#getExternalFunctionDefinition_Method()
	 * @model dataType="org.eclipse.stem.model.ctdl.functions.Method" transient="true"
	 * @generated
	 */
	Method getMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Method value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionsPackage#getExternalFunctionDefinition_ReturnType()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Class<?> getReturnType();

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionsPackage#getExternalFunctionDefinition_Signature()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	String getSignature();

	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionsPackage#getExternalFunctionDefinition_ClassName()
	 * @model default=""
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Name</em>' attribute.
	 * @see #setMethodName(String)
	 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionsPackage#getExternalFunctionDefinition_MethodName()
	 * @model
	 * @generated
	 */
	String getMethodName();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getMethodName <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Name</em>' attribute.
	 * @see #getMethodName()
	 * @generated
	 */
	void setMethodName(String value);

	/**
	 * Returns the value of the '<em><b>Contributing Plugin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contributing Plugin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributing Plugin</em>' attribute.
	 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionsPackage#getExternalFunctionDefinition_ContributingPlugin()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	String getContributingPlugin();

	/**
	 * Returns the value of the '<em><b>Ext Point Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ext Point Definition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext Point Definition</em>' attribute.
	 * @see #setExtPointDefinition(IConfigurationElement)
	 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionsPackage#getExternalFunctionDefinition_ExtPointDefinition()
	 * @model dataType="org.eclipse.stem.model.ctdl.functions.IConfigurationElement" transient="true"
	 * @generated
	 */
	IConfigurationElement getExtPointDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getExtPointDefinition <em>Ext Point Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ext Point Definition</em>' attribute.
	 * @see #getExtPointDefinition()
	 * @generated
	 */
	void setExtPointDefinition(IConfigurationElement value);

	/**
	 * Returns the value of the '<em><b>Function Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.stem.model.ctdl.functions.FunctionArgument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Arguments</em>' containment reference list.
	 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionsPackage#getExternalFunctionDefinition_FunctionArguments()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	EList<FunctionArgument> getFunctionArguments();

	/**
	 * Returns the value of the '<em><b>Java Method Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.stem.model.ctdl.functions.JavaMethodArgument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Method Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Method Arguments</em>' containment reference list.
	 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionsPackage#getExternalFunctionDefinition_JavaMethodArguments()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	EList<JavaMethodArgument> getJavaMethodArguments();

} // ExternalFunctionDefinition
