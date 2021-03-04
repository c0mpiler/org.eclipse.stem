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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionsFactory
 * @model kind="package"
 * @generated
 */
public interface ExternalFunctionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "functions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/stem/model/ctdl/functions.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.stem.model.ctdl.functions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExternalFunctionsPackage eINSTANCE = org.eclipse.stem.model.ctdl.functions.impl.ExternalFunctionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.stem.model.ctdl.functions.impl.ExternalFunctionDefinitionImpl <em>External Function Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.model.ctdl.functions.impl.ExternalFunctionDefinitionImpl
	 * @see org.eclipse.stem.model.ctdl.functions.impl.ExternalFunctionsPackageImpl#getExternalFunctionDefinition()
	 * @generated
	 */
	int EXTERNAL_FUNCTION_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FUNCTION_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FUNCTION_DEFINITION__CLASS = 1;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FUNCTION_DEFINITION__METHOD = 2;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FUNCTION_DEFINITION__RETURN_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FUNCTION_DEFINITION__SIGNATURE = 4;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FUNCTION_DEFINITION__CLASS_NAME = 5;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FUNCTION_DEFINITION__METHOD_NAME = 6;

	/**
	 * The feature id for the '<em><b>Contributing Plugin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FUNCTION_DEFINITION__CONTRIBUTING_PLUGIN = 7;

	/**
	 * The feature id for the '<em><b>Ext Point Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FUNCTION_DEFINITION__EXT_POINT_DEFINITION = 8;

	/**
	 * The feature id for the '<em><b>Function Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FUNCTION_DEFINITION__FUNCTION_ARGUMENTS = 9;

	/**
	 * The feature id for the '<em><b>Java Method Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FUNCTION_DEFINITION__JAVA_METHOD_ARGUMENTS = 10;

	/**
	 * The number of structural features of the '<em>External Function Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FUNCTION_DEFINITION_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.model.ctdl.functions.impl.FunctionArgumentImpl <em>Function Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.model.ctdl.functions.impl.FunctionArgumentImpl
	 * @see org.eclipse.stem.model.ctdl.functions.impl.ExternalFunctionsPackageImpl#getFunctionArgument()
	 * @generated
	 */
	int FUNCTION_ARGUMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ARGUMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ARGUMENT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Function Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ARGUMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.model.ctdl.functions.impl.JavaMethodArgumentImpl <em>Java Method Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.model.ctdl.functions.impl.JavaMethodArgumentImpl
	 * @see org.eclipse.stem.model.ctdl.functions.impl.ExternalFunctionsPackageImpl#getJavaMethodArgument()
	 * @generated
	 */
	int JAVA_METHOD_ARGUMENT = 2;

	/**
	 * The feature id for the '<em><b>Maps From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_METHOD_ARGUMENT__MAPS_FROM = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_METHOD_ARGUMENT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Java Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_METHOD_ARGUMENT__JAVA_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Java Method Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_METHOD_ARGUMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.model.ctdl.functions.impl.SystemArgumentReferenceImpl <em>System Argument Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.model.ctdl.functions.impl.SystemArgumentReferenceImpl
	 * @see org.eclipse.stem.model.ctdl.functions.impl.ExternalFunctionsPackageImpl#getSystemArgumentReference()
	 * @generated
	 */
	int SYSTEM_ARGUMENT_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Maps From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ARGUMENT_REFERENCE__MAPS_FROM = JAVA_METHOD_ARGUMENT__MAPS_FROM;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ARGUMENT_REFERENCE__TYPE = JAVA_METHOD_ARGUMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Java Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ARGUMENT_REFERENCE__JAVA_TYPE = JAVA_METHOD_ARGUMENT__JAVA_TYPE;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ARGUMENT_REFERENCE__REF = JAVA_METHOD_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Argument Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ARGUMENT_REFERENCE_FEATURE_COUNT = JAVA_METHOD_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.model.ctdl.functions.impl.FunctionArgumentReferenceImpl <em>Function Argument Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.model.ctdl.functions.impl.FunctionArgumentReferenceImpl
	 * @see org.eclipse.stem.model.ctdl.functions.impl.ExternalFunctionsPackageImpl#getFunctionArgumentReference()
	 * @generated
	 */
	int FUNCTION_ARGUMENT_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Maps From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ARGUMENT_REFERENCE__MAPS_FROM = JAVA_METHOD_ARGUMENT__MAPS_FROM;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ARGUMENT_REFERENCE__TYPE = JAVA_METHOD_ARGUMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Java Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ARGUMENT_REFERENCE__JAVA_TYPE = JAVA_METHOD_ARGUMENT__JAVA_TYPE;

	/**
	 * The feature id for the '<em><b>Arg Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ARGUMENT_REFERENCE__ARG_INDEX = JAVA_METHOD_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ARGUMENT_REFERENCE__REF = JAVA_METHOD_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Argument Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ARGUMENT_REFERENCE_FEATURE_COUNT = JAVA_METHOD_ARGUMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '<em>IConfiguration Element</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.IConfigurationElement
	 * @see org.eclipse.stem.model.ctdl.functions.impl.ExternalFunctionsPackageImpl#getIConfigurationElement()
	 * @generated
	 */
	int ICONFIGURATION_ELEMENT = 5;

	/**
	 * The meta object id for the '<em>Method</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.reflect.Method
	 * @see org.eclipse.stem.model.ctdl.functions.impl.ExternalFunctionsPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 6;


	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition <em>External Function Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Function Definition</em>'.
	 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition
	 * @generated
	 */
	EClass getExternalFunctionDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getName()
	 * @see #getExternalFunctionDefinition()
	 * @generated
	 */
	EAttribute getExternalFunctionDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getClass_()
	 * @see #getExternalFunctionDefinition()
	 * @generated
	 */
	EAttribute getExternalFunctionDefinition_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getMethod()
	 * @see #getExternalFunctionDefinition()
	 * @generated
	 */
	EAttribute getExternalFunctionDefinition_Method();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getReturnType()
	 * @see #getExternalFunctionDefinition()
	 * @generated
	 */
	EAttribute getExternalFunctionDefinition_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getSignature()
	 * @see #getExternalFunctionDefinition()
	 * @generated
	 */
	EAttribute getExternalFunctionDefinition_Signature();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getClassName()
	 * @see #getExternalFunctionDefinition()
	 * @generated
	 */
	EAttribute getExternalFunctionDefinition_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getMethodName()
	 * @see #getExternalFunctionDefinition()
	 * @generated
	 */
	EAttribute getExternalFunctionDefinition_MethodName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getContributingPlugin <em>Contributing Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contributing Plugin</em>'.
	 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getContributingPlugin()
	 * @see #getExternalFunctionDefinition()
	 * @generated
	 */
	EAttribute getExternalFunctionDefinition_ContributingPlugin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getExtPointDefinition <em>Ext Point Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ext Point Definition</em>'.
	 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getExtPointDefinition()
	 * @see #getExternalFunctionDefinition()
	 * @generated
	 */
	EAttribute getExternalFunctionDefinition_ExtPointDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getFunctionArguments <em>Function Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function Arguments</em>'.
	 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getFunctionArguments()
	 * @see #getExternalFunctionDefinition()
	 * @generated
	 */
	EReference getExternalFunctionDefinition_FunctionArguments();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getJavaMethodArguments <em>Java Method Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Java Method Arguments</em>'.
	 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition#getJavaMethodArguments()
	 * @see #getExternalFunctionDefinition()
	 * @generated
	 */
	EReference getExternalFunctionDefinition_JavaMethodArguments();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.model.ctdl.functions.FunctionArgument <em>Function Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Argument</em>'.
	 * @see org.eclipse.stem.model.ctdl.functions.FunctionArgument
	 * @generated
	 */
	EClass getFunctionArgument();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.ctdl.functions.FunctionArgument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.stem.model.ctdl.functions.FunctionArgument#getName()
	 * @see #getFunctionArgument()
	 * @generated
	 */
	EAttribute getFunctionArgument_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.ctdl.functions.FunctionArgument#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.stem.model.ctdl.functions.FunctionArgument#getType()
	 * @see #getFunctionArgument()
	 * @generated
	 */
	EAttribute getFunctionArgument_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.model.ctdl.functions.JavaMethodArgument <em>Java Method Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Method Argument</em>'.
	 * @see org.eclipse.stem.model.ctdl.functions.JavaMethodArgument
	 * @generated
	 */
	EClass getJavaMethodArgument();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.ctdl.functions.JavaMethodArgument#getMapsFrom <em>Maps From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maps From</em>'.
	 * @see org.eclipse.stem.model.ctdl.functions.JavaMethodArgument#getMapsFrom()
	 * @see #getJavaMethodArgument()
	 * @generated
	 */
	EAttribute getJavaMethodArgument_MapsFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.ctdl.functions.JavaMethodArgument#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.stem.model.ctdl.functions.JavaMethodArgument#getType()
	 * @see #getJavaMethodArgument()
	 * @generated
	 */
	EAttribute getJavaMethodArgument_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.ctdl.functions.JavaMethodArgument#getJavaType <em>Java Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Type</em>'.
	 * @see org.eclipse.stem.model.ctdl.functions.JavaMethodArgument#getJavaType()
	 * @see #getJavaMethodArgument()
	 * @generated
	 */
	EAttribute getJavaMethodArgument_JavaType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.model.ctdl.functions.SystemArgumentReference <em>System Argument Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Argument Reference</em>'.
	 * @see org.eclipse.stem.model.ctdl.functions.SystemArgumentReference
	 * @generated
	 */
	EClass getSystemArgumentReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.model.ctdl.functions.SystemArgumentReference#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see org.eclipse.stem.model.ctdl.functions.SystemArgumentReference#getRef()
	 * @see #getSystemArgumentReference()
	 * @generated
	 */
	EReference getSystemArgumentReference_Ref();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.model.ctdl.functions.FunctionArgumentReference <em>Function Argument Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Argument Reference</em>'.
	 * @see org.eclipse.stem.model.ctdl.functions.FunctionArgumentReference
	 * @generated
	 */
	EClass getFunctionArgumentReference();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.ctdl.functions.FunctionArgumentReference#getArgIndex <em>Arg Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arg Index</em>'.
	 * @see org.eclipse.stem.model.ctdl.functions.FunctionArgumentReference#getArgIndex()
	 * @see #getFunctionArgumentReference()
	 * @generated
	 */
	EAttribute getFunctionArgumentReference_ArgIndex();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.model.ctdl.functions.FunctionArgumentReference#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see org.eclipse.stem.model.ctdl.functions.FunctionArgumentReference#getRef()
	 * @see #getFunctionArgumentReference()
	 * @generated
	 */
	EReference getFunctionArgumentReference_Ref();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.runtime.IConfigurationElement <em>IConfiguration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IConfiguration Element</em>'.
	 * @see org.eclipse.core.runtime.IConfigurationElement
	 * @model instanceClass="org.eclipse.core.runtime.IConfigurationElement" serializeable="false"
	 * @generated
	 */
	EDataType getIConfigurationElement();

	/**
	 * Returns the meta object for data type '{@link java.lang.reflect.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Method</em>'.
	 * @see java.lang.reflect.Method
	 * @model instanceClass="java.lang.reflect.Method" serializeable="false"
	 * @generated
	 */
	EDataType getMethod();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExternalFunctionsFactory getExternalFunctionsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.stem.model.ctdl.functions.impl.ExternalFunctionDefinitionImpl <em>External Function Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.model.ctdl.functions.impl.ExternalFunctionDefinitionImpl
		 * @see org.eclipse.stem.model.ctdl.functions.impl.ExternalFunctionsPackageImpl#getExternalFunctionDefinition()
		 * @generated
		 */
		EClass EXTERNAL_FUNCTION_DEFINITION = eINSTANCE.getExternalFunctionDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_FUNCTION_DEFINITION__NAME = eINSTANCE.getExternalFunctionDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_FUNCTION_DEFINITION__CLASS = eINSTANCE.getExternalFunctionDefinition_Class();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_FUNCTION_DEFINITION__METHOD = eINSTANCE.getExternalFunctionDefinition_Method();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_FUNCTION_DEFINITION__RETURN_TYPE = eINSTANCE.getExternalFunctionDefinition_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_FUNCTION_DEFINITION__SIGNATURE = eINSTANCE.getExternalFunctionDefinition_Signature();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_FUNCTION_DEFINITION__CLASS_NAME = eINSTANCE.getExternalFunctionDefinition_ClassName();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_FUNCTION_DEFINITION__METHOD_NAME = eINSTANCE.getExternalFunctionDefinition_MethodName();

		/**
		 * The meta object literal for the '<em><b>Contributing Plugin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_FUNCTION_DEFINITION__CONTRIBUTING_PLUGIN = eINSTANCE.getExternalFunctionDefinition_ContributingPlugin();

		/**
		 * The meta object literal for the '<em><b>Ext Point Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_FUNCTION_DEFINITION__EXT_POINT_DEFINITION = eINSTANCE.getExternalFunctionDefinition_ExtPointDefinition();

		/**
		 * The meta object literal for the '<em><b>Function Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_FUNCTION_DEFINITION__FUNCTION_ARGUMENTS = eINSTANCE.getExternalFunctionDefinition_FunctionArguments();

		/**
		 * The meta object literal for the '<em><b>Java Method Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_FUNCTION_DEFINITION__JAVA_METHOD_ARGUMENTS = eINSTANCE.getExternalFunctionDefinition_JavaMethodArguments();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.model.ctdl.functions.impl.FunctionArgumentImpl <em>Function Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.model.ctdl.functions.impl.FunctionArgumentImpl
		 * @see org.eclipse.stem.model.ctdl.functions.impl.ExternalFunctionsPackageImpl#getFunctionArgument()
		 * @generated
		 */
		EClass FUNCTION_ARGUMENT = eINSTANCE.getFunctionArgument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_ARGUMENT__NAME = eINSTANCE.getFunctionArgument_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_ARGUMENT__TYPE = eINSTANCE.getFunctionArgument_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.model.ctdl.functions.impl.JavaMethodArgumentImpl <em>Java Method Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.model.ctdl.functions.impl.JavaMethodArgumentImpl
		 * @see org.eclipse.stem.model.ctdl.functions.impl.ExternalFunctionsPackageImpl#getJavaMethodArgument()
		 * @generated
		 */
		EClass JAVA_METHOD_ARGUMENT = eINSTANCE.getJavaMethodArgument();

		/**
		 * The meta object literal for the '<em><b>Maps From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_METHOD_ARGUMENT__MAPS_FROM = eINSTANCE.getJavaMethodArgument_MapsFrom();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_METHOD_ARGUMENT__TYPE = eINSTANCE.getJavaMethodArgument_Type();

		/**
		 * The meta object literal for the '<em><b>Java Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_METHOD_ARGUMENT__JAVA_TYPE = eINSTANCE.getJavaMethodArgument_JavaType();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.model.ctdl.functions.impl.SystemArgumentReferenceImpl <em>System Argument Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.model.ctdl.functions.impl.SystemArgumentReferenceImpl
		 * @see org.eclipse.stem.model.ctdl.functions.impl.ExternalFunctionsPackageImpl#getSystemArgumentReference()
		 * @generated
		 */
		EClass SYSTEM_ARGUMENT_REFERENCE = eINSTANCE.getSystemArgumentReference();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_ARGUMENT_REFERENCE__REF = eINSTANCE.getSystemArgumentReference_Ref();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.model.ctdl.functions.impl.FunctionArgumentReferenceImpl <em>Function Argument Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.model.ctdl.functions.impl.FunctionArgumentReferenceImpl
		 * @see org.eclipse.stem.model.ctdl.functions.impl.ExternalFunctionsPackageImpl#getFunctionArgumentReference()
		 * @generated
		 */
		EClass FUNCTION_ARGUMENT_REFERENCE = eINSTANCE.getFunctionArgumentReference();

		/**
		 * The meta object literal for the '<em><b>Arg Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_ARGUMENT_REFERENCE__ARG_INDEX = eINSTANCE.getFunctionArgumentReference_ArgIndex();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_ARGUMENT_REFERENCE__REF = eINSTANCE.getFunctionArgumentReference_Ref();

		/**
		 * The meta object literal for the '<em>IConfiguration Element</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.IConfigurationElement
		 * @see org.eclipse.stem.model.ctdl.functions.impl.ExternalFunctionsPackageImpl#getIConfigurationElement()
		 * @generated
		 */
		EDataType ICONFIGURATION_ELEMENT = eINSTANCE.getIConfigurationElement();

		/**
		 * The meta object literal for the '<em>Method</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.reflect.Method
		 * @see org.eclipse.stem.model.ctdl.functions.impl.ExternalFunctionsPackageImpl#getMethod()
		 * @generated
		 */
		EDataType METHOD = eINSTANCE.getMethod();

	}

} //ExternalFunctionsPackage
