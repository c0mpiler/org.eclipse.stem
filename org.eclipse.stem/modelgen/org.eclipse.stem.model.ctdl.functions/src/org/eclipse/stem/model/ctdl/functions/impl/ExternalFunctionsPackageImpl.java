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

import java.lang.reflect.Method;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition;
import org.eclipse.stem.model.ctdl.functions.ExternalFunctionsFactory;
import org.eclipse.stem.model.ctdl.functions.ExternalFunctionsPackage;
import org.eclipse.stem.model.ctdl.functions.FunctionArgument;
import org.eclipse.stem.model.ctdl.functions.FunctionArgumentReference;
import org.eclipse.stem.model.ctdl.functions.JavaMethodArgument;
import org.eclipse.stem.model.ctdl.functions.SystemArgumentReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalFunctionsPackageImpl extends EPackageImpl implements ExternalFunctionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalFunctionDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaMethodArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemArgumentReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionArgumentReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iConfigurationElementEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType methodEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExternalFunctionsPackageImpl() {
		super(eNS_URI, ExternalFunctionsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ExternalFunctionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExternalFunctionsPackage init() {
		if (isInited) return (ExternalFunctionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExternalFunctionsPackage.eNS_URI);

		// Obtain or create and register package
		ExternalFunctionsPackageImpl theExternalFunctionsPackage = (ExternalFunctionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExternalFunctionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExternalFunctionsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theExternalFunctionsPackage.createPackageContents();

		// Initialize created meta-data
		theExternalFunctionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExternalFunctionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExternalFunctionsPackage.eNS_URI, theExternalFunctionsPackage);
		return theExternalFunctionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalFunctionDefinition() {
		return externalFunctionDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalFunctionDefinition_Name() {
		return (EAttribute)externalFunctionDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalFunctionDefinition_Class() {
		return (EAttribute)externalFunctionDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalFunctionDefinition_Method() {
		return (EAttribute)externalFunctionDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalFunctionDefinition_ReturnType() {
		return (EAttribute)externalFunctionDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalFunctionDefinition_Signature() {
		return (EAttribute)externalFunctionDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalFunctionDefinition_ClassName() {
		return (EAttribute)externalFunctionDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalFunctionDefinition_MethodName() {
		return (EAttribute)externalFunctionDefinitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalFunctionDefinition_ContributingPlugin() {
		return (EAttribute)externalFunctionDefinitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalFunctionDefinition_ExtPointDefinition() {
		return (EAttribute)externalFunctionDefinitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalFunctionDefinition_FunctionArguments() {
		return (EReference)externalFunctionDefinitionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalFunctionDefinition_JavaMethodArguments() {
		return (EReference)externalFunctionDefinitionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionArgument() {
		return functionArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionArgument_Name() {
		return (EAttribute)functionArgumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionArgument_Type() {
		return (EAttribute)functionArgumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaMethodArgument() {
		return javaMethodArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaMethodArgument_MapsFrom() {
		return (EAttribute)javaMethodArgumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaMethodArgument_Type() {
		return (EAttribute)javaMethodArgumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaMethodArgument_JavaType() {
		return (EAttribute)javaMethodArgumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemArgumentReference() {
		return systemArgumentReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemArgumentReference_Ref() {
		return (EReference)systemArgumentReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionArgumentReference() {
		return functionArgumentReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionArgumentReference_ArgIndex() {
		return (EAttribute)functionArgumentReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionArgumentReference_Ref() {
		return (EReference)functionArgumentReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIConfigurationElement() {
		return iConfigurationElementEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMethod() {
		return methodEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalFunctionsFactory getExternalFunctionsFactory() {
		return (ExternalFunctionsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		externalFunctionDefinitionEClass = createEClass(EXTERNAL_FUNCTION_DEFINITION);
		createEAttribute(externalFunctionDefinitionEClass, EXTERNAL_FUNCTION_DEFINITION__NAME);
		createEAttribute(externalFunctionDefinitionEClass, EXTERNAL_FUNCTION_DEFINITION__CLASS);
		createEAttribute(externalFunctionDefinitionEClass, EXTERNAL_FUNCTION_DEFINITION__METHOD);
		createEAttribute(externalFunctionDefinitionEClass, EXTERNAL_FUNCTION_DEFINITION__RETURN_TYPE);
		createEAttribute(externalFunctionDefinitionEClass, EXTERNAL_FUNCTION_DEFINITION__SIGNATURE);
		createEAttribute(externalFunctionDefinitionEClass, EXTERNAL_FUNCTION_DEFINITION__CLASS_NAME);
		createEAttribute(externalFunctionDefinitionEClass, EXTERNAL_FUNCTION_DEFINITION__METHOD_NAME);
		createEAttribute(externalFunctionDefinitionEClass, EXTERNAL_FUNCTION_DEFINITION__CONTRIBUTING_PLUGIN);
		createEAttribute(externalFunctionDefinitionEClass, EXTERNAL_FUNCTION_DEFINITION__EXT_POINT_DEFINITION);
		createEReference(externalFunctionDefinitionEClass, EXTERNAL_FUNCTION_DEFINITION__FUNCTION_ARGUMENTS);
		createEReference(externalFunctionDefinitionEClass, EXTERNAL_FUNCTION_DEFINITION__JAVA_METHOD_ARGUMENTS);

		functionArgumentEClass = createEClass(FUNCTION_ARGUMENT);
		createEAttribute(functionArgumentEClass, FUNCTION_ARGUMENT__NAME);
		createEAttribute(functionArgumentEClass, FUNCTION_ARGUMENT__TYPE);

		javaMethodArgumentEClass = createEClass(JAVA_METHOD_ARGUMENT);
		createEAttribute(javaMethodArgumentEClass, JAVA_METHOD_ARGUMENT__MAPS_FROM);
		createEAttribute(javaMethodArgumentEClass, JAVA_METHOD_ARGUMENT__TYPE);
		createEAttribute(javaMethodArgumentEClass, JAVA_METHOD_ARGUMENT__JAVA_TYPE);

		systemArgumentReferenceEClass = createEClass(SYSTEM_ARGUMENT_REFERENCE);
		createEReference(systemArgumentReferenceEClass, SYSTEM_ARGUMENT_REFERENCE__REF);

		functionArgumentReferenceEClass = createEClass(FUNCTION_ARGUMENT_REFERENCE);
		createEAttribute(functionArgumentReferenceEClass, FUNCTION_ARGUMENT_REFERENCE__ARG_INDEX);
		createEReference(functionArgumentReferenceEClass, FUNCTION_ARGUMENT_REFERENCE__REF);

		// Create data types
		iConfigurationElementEDataType = createEDataType(ICONFIGURATION_ELEMENT);
		methodEDataType = createEDataType(METHOD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		systemArgumentReferenceEClass.getESuperTypes().add(this.getJavaMethodArgument());
		functionArgumentReferenceEClass.getESuperTypes().add(this.getJavaMethodArgument());

		// Initialize classes and features; add operations and parameters
		initEClass(externalFunctionDefinitionEClass, ExternalFunctionDefinition.class, "ExternalFunctionDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalFunctionDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExternalFunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getExternalFunctionDefinition_Class(), g1, "class", null, 0, 1, ExternalFunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalFunctionDefinition_Method(), this.getMethod(), "method", null, 0, 1, ExternalFunctionDefinition.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getExternalFunctionDefinition_ReturnType(), g1, "returnType", null, 0, 1, ExternalFunctionDefinition.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalFunctionDefinition_Signature(), ecorePackage.getEString(), "signature", null, 0, 1, ExternalFunctionDefinition.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalFunctionDefinition_ClassName(), ecorePackage.getEString(), "className", "", 0, 1, ExternalFunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalFunctionDefinition_MethodName(), ecorePackage.getEString(), "methodName", null, 0, 1, ExternalFunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalFunctionDefinition_ContributingPlugin(), ecorePackage.getEString(), "contributingPlugin", null, 0, 1, ExternalFunctionDefinition.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalFunctionDefinition_ExtPointDefinition(), this.getIConfigurationElement(), "extPointDefinition", null, 0, 1, ExternalFunctionDefinition.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExternalFunctionDefinition_FunctionArguments(), this.getFunctionArgument(), null, "functionArguments", null, 0, -1, ExternalFunctionDefinition.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExternalFunctionDefinition_JavaMethodArguments(), this.getJavaMethodArgument(), null, "javaMethodArguments", null, 0, -1, ExternalFunctionDefinition.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionArgumentEClass, FunctionArgument.class, "FunctionArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionArgument_Name(), ecorePackage.getEString(), "name", null, 0, 1, FunctionArgument.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionArgument_Type(), ecorePackage.getEString(), "type", null, 0, 1, FunctionArgument.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaMethodArgumentEClass, JavaMethodArgument.class, "JavaMethodArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaMethodArgument_MapsFrom(), ecorePackage.getEString(), "mapsFrom", null, 0, 1, JavaMethodArgument.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaMethodArgument_Type(), ecorePackage.getEString(), "type", null, 0, 1, JavaMethodArgument.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getJavaMethodArgument_JavaType(), g1, "javaType", null, 0, 1, JavaMethodArgument.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemArgumentReferenceEClass, SystemArgumentReference.class, "SystemArgumentReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemArgumentReference_Ref(), ecorePackage.getEObject(), null, "ref", null, 0, 1, SystemArgumentReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionArgumentReferenceEClass, FunctionArgumentReference.class, "FunctionArgumentReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionArgumentReference_ArgIndex(), ecorePackage.getEInt(), "argIndex", null, 0, 1, FunctionArgumentReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionArgumentReference_Ref(), this.getFunctionArgument(), null, "ref", null, 0, 1, FunctionArgumentReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(iConfigurationElementEDataType, IConfigurationElement.class, "IConfigurationElement", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(methodEDataType, Method.class, "Method", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ExternalFunctionsPackageImpl
