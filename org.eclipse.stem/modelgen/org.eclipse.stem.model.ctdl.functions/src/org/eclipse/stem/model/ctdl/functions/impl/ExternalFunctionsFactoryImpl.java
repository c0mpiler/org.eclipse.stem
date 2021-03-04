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
package org.eclipse.stem.model.ctdl.functions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition;
import org.eclipse.stem.model.ctdl.functions.ExternalFunctionsFactory;
import org.eclipse.stem.model.ctdl.functions.ExternalFunctionsPackage;
import org.eclipse.stem.model.ctdl.functions.FunctionArgument;
import org.eclipse.stem.model.ctdl.functions.FunctionArgumentReference;
import org.eclipse.stem.model.ctdl.functions.JavaMethodArgument;
import org.eclipse.stem.model.ctdl.functions.SystemArgumentReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalFunctionsFactoryImpl extends EFactoryImpl implements ExternalFunctionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExternalFunctionsFactory init() {
		try {
			ExternalFunctionsFactory theExternalFunctionsFactory = (ExternalFunctionsFactory)EPackage.Registry.INSTANCE.getEFactory("http:///org/eclipse/stem/model/ctdl/functions.ecore"); 
			if (theExternalFunctionsFactory != null) {
				return theExternalFunctionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExternalFunctionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalFunctionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION: return createExternalFunctionDefinition();
			case ExternalFunctionsPackage.FUNCTION_ARGUMENT: return createFunctionArgument();
			case ExternalFunctionsPackage.JAVA_METHOD_ARGUMENT: return createJavaMethodArgument();
			case ExternalFunctionsPackage.SYSTEM_ARGUMENT_REFERENCE: return createSystemArgumentReference();
			case ExternalFunctionsPackage.FUNCTION_ARGUMENT_REFERENCE: return createFunctionArgumentReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalFunctionDefinition createExternalFunctionDefinition() {
		ExternalFunctionDefinitionImpl externalFunctionDefinition = new ExternalFunctionDefinitionImpl();
		return externalFunctionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionArgument createFunctionArgument() {
		FunctionArgumentImpl functionArgument = new FunctionArgumentImpl();
		return functionArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaMethodArgument createJavaMethodArgument() {
		JavaMethodArgumentImpl javaMethodArgument = new JavaMethodArgumentImpl();
		return javaMethodArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemArgumentReference createSystemArgumentReference() {
		SystemArgumentReferenceImpl systemArgumentReference = new SystemArgumentReferenceImpl();
		return systemArgumentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionArgumentReference createFunctionArgumentReference() {
		FunctionArgumentReferenceImpl functionArgumentReference = new FunctionArgumentReferenceImpl();
		return functionArgumentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalFunctionsPackage getExternalFunctionsPackage() {
		return (ExternalFunctionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExternalFunctionsPackage getPackage() {
		return ExternalFunctionsPackage.eINSTANCE;
	}

} //ExternalFunctionsFactoryImpl
