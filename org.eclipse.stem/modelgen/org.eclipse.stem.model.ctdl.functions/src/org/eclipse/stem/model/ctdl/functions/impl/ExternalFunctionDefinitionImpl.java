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
import java.util.Collection;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition;
import org.eclipse.stem.model.ctdl.functions.ExternalFunctionsPackage;
import org.eclipse.stem.model.ctdl.functions.FunctionArgument;
import org.eclipse.stem.model.ctdl.functions.JavaMethodArgument;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Function Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.ctdl.functions.impl.ExternalFunctionDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.functions.impl.ExternalFunctionDefinitionImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.functions.impl.ExternalFunctionDefinitionImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.functions.impl.ExternalFunctionDefinitionImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.functions.impl.ExternalFunctionDefinitionImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.functions.impl.ExternalFunctionDefinitionImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.functions.impl.ExternalFunctionDefinitionImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.functions.impl.ExternalFunctionDefinitionImpl#getContributingPlugin <em>Contributing Plugin</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.functions.impl.ExternalFunctionDefinitionImpl#getExtPointDefinition <em>Ext Point Definition</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.functions.impl.ExternalFunctionDefinitionImpl#getFunctionArguments <em>Function Arguments</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.functions.impl.ExternalFunctionDefinitionImpl#getJavaMethodArguments <em>Java Method Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalFunctionDefinitionImpl extends EObjectImpl implements ExternalFunctionDefinition {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected Class<?> class_;

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final Method METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected Method method = METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected String signature = SIGNATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected String className = CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodName()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodName()
	 * @generated
	 * @ordered
	 */
	protected String methodName = METHOD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getContributingPlugin() <em>Contributing Plugin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributingPlugin()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRIBUTING_PLUGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContributingPlugin() <em>Contributing Plugin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributingPlugin()
	 * @generated
	 * @ordered
	 */
	protected String contributingPlugin = CONTRIBUTING_PLUGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtPointDefinition() <em>Ext Point Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtPointDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final IConfigurationElement EXT_POINT_DEFINITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtPointDefinition() <em>Ext Point Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtPointDefinition()
	 * @generated
	 * @ordered
	 */
	protected IConfigurationElement extPointDefinition = EXT_POINT_DEFINITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFunctionArguments() <em>Function Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionArgument> functionArguments;

	/**
	 * The cached value of the '{@link #getJavaMethodArguments() <em>Java Method Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaMethodArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<JavaMethodArgument> javaMethodArguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalFunctionDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExternalFunctionsPackage.Literals.EXTERNAL_FUNCTION_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class<?> getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(Class<?> newClass) {
		Class<?> oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(Method newMethod) {
		Method oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Class<?> getReturnType() {
		if (getMethod() == null) {
			return null;
		}
		return getMethod().getReturnType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getSignature() {
		if (signature == null) {
			StringBuilder sb = new StringBuilder();
			sb.append(getName());
			sb.append("(");
			EList<FunctionArgument> args = getFunctionArguments();
			int paramCount = args.size();
			for (int idx=0; idx<args.size(); idx++) {
				sb.append(args.get(idx).getType());
				if (idx < paramCount-1) {
					sb.append(",");
				}
			}
			sb.append(")");
			signature = sb.toString();
		}
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName(String newClassName) {
		String oldClassName = className;
		className = newClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__CLASS_NAME, oldClassName, className));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethodName() {
		return methodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodName(String newMethodName) {
		String oldMethodName = methodName;
		methodName = newMethodName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__METHOD_NAME, oldMethodName, methodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContributingPlugin() {
		return contributingPlugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IConfigurationElement getExtPointDefinition() {
		return extPointDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtPointDefinition(IConfigurationElement newExtPointDefinition) {
		IConfigurationElement oldExtPointDefinition = extPointDefinition;
		extPointDefinition = newExtPointDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__EXT_POINT_DEFINITION, oldExtPointDefinition, extPointDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionArgument> getFunctionArguments() {
		if (functionArguments == null) {
			functionArguments = new EObjectContainmentEList<FunctionArgument>(FunctionArgument.class, this, ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__FUNCTION_ARGUMENTS);
		}
		return functionArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JavaMethodArgument> getJavaMethodArguments() {
		if (javaMethodArguments == null) {
			javaMethodArguments = new EObjectContainmentEList<JavaMethodArgument>(JavaMethodArgument.class, this, ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__JAVA_METHOD_ARGUMENTS);
		}
		return javaMethodArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__FUNCTION_ARGUMENTS:
				return ((InternalEList<?>)getFunctionArguments()).basicRemove(otherEnd, msgs);
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__JAVA_METHOD_ARGUMENTS:
				return ((InternalEList<?>)getJavaMethodArguments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__NAME:
				return getName();
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__CLASS:
				return getClass_();
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__METHOD:
				return getMethod();
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__RETURN_TYPE:
				return getReturnType();
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__SIGNATURE:
				return getSignature();
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__CLASS_NAME:
				return getClassName();
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__METHOD_NAME:
				return getMethodName();
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__CONTRIBUTING_PLUGIN:
				return getContributingPlugin();
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__EXT_POINT_DEFINITION:
				return getExtPointDefinition();
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__FUNCTION_ARGUMENTS:
				return getFunctionArguments();
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__JAVA_METHOD_ARGUMENTS:
				return getJavaMethodArguments();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__CLASS:
				setClass((Class<?>)newValue);
				return;
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__METHOD:
				setMethod((Method)newValue);
				return;
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__CLASS_NAME:
				setClassName((String)newValue);
				return;
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__METHOD_NAME:
				setMethodName((String)newValue);
				return;
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__EXT_POINT_DEFINITION:
				setExtPointDefinition((IConfigurationElement)newValue);
				return;
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__FUNCTION_ARGUMENTS:
				getFunctionArguments().clear();
				getFunctionArguments().addAll((Collection<? extends FunctionArgument>)newValue);
				return;
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__JAVA_METHOD_ARGUMENTS:
				getJavaMethodArguments().clear();
				getJavaMethodArguments().addAll((Collection<? extends JavaMethodArgument>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__CLASS:
				setClass((Class<?>)null);
				return;
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__METHOD:
				setMethod(METHOD_EDEFAULT);
				return;
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
				return;
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__METHOD_NAME:
				setMethodName(METHOD_NAME_EDEFAULT);
				return;
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__EXT_POINT_DEFINITION:
				setExtPointDefinition(EXT_POINT_DEFINITION_EDEFAULT);
				return;
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__FUNCTION_ARGUMENTS:
				getFunctionArguments().clear();
				return;
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__JAVA_METHOD_ARGUMENTS:
				getJavaMethodArguments().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__CLASS:
				return class_ != null;
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__METHOD:
				return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__RETURN_TYPE:
				return getReturnType() != null;
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__SIGNATURE:
				return SIGNATURE_EDEFAULT == null ? signature != null : !SIGNATURE_EDEFAULT.equals(signature);
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__METHOD_NAME:
				return METHOD_NAME_EDEFAULT == null ? methodName != null : !METHOD_NAME_EDEFAULT.equals(methodName);
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__CONTRIBUTING_PLUGIN:
				return CONTRIBUTING_PLUGIN_EDEFAULT == null ? contributingPlugin != null : !CONTRIBUTING_PLUGIN_EDEFAULT.equals(contributingPlugin);
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__EXT_POINT_DEFINITION:
				return EXT_POINT_DEFINITION_EDEFAULT == null ? extPointDefinition != null : !EXT_POINT_DEFINITION_EDEFAULT.equals(extPointDefinition);
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__FUNCTION_ARGUMENTS:
				return functionArguments != null && !functionArguments.isEmpty();
			case ExternalFunctionsPackage.EXTERNAL_FUNCTION_DEFINITION__JAVA_METHOD_ARGUMENTS:
				return javaMethodArguments != null && !javaMethodArguments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", class: ");
		result.append(class_);
		result.append(", method: ");
		result.append(method);
		result.append(", signature: ");
		result.append(signature);
		result.append(", className: ");
		result.append(className);
		result.append(", methodName: ");
		result.append(methodName);
		result.append(", contributingPlugin: ");
		result.append(contributingPlugin);
		result.append(", extPointDefinition: ");
		result.append(extPointDefinition);
		result.append(')');
		return result.toString();
	}

} //ExternalFunctionDefinitionImpl
