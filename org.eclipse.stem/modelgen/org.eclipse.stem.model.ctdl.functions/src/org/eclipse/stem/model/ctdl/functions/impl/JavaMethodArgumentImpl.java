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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.stem.model.ctdl.functions.ExternalFunctionsPackage;
import org.eclipse.stem.model.ctdl.functions.JavaMethodArgument;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Method Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.ctdl.functions.impl.JavaMethodArgumentImpl#getMapsFrom <em>Maps From</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.functions.impl.JavaMethodArgumentImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.functions.impl.JavaMethodArgumentImpl#getJavaType <em>Java Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaMethodArgumentImpl extends EObjectImpl implements JavaMethodArgument {
	/**
	 * The default value of the '{@link #getMapsFrom() <em>Maps From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapsFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String MAPS_FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMapsFrom() <em>Maps From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapsFrom()
	 * @generated
	 * @ordered
	 */
	protected String mapsFrom = MAPS_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getJavaType() <em>Java Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaType()
	 * @generated
	 * @ordered
	 */
	protected Class<?> javaType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaMethodArgumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExternalFunctionsPackage.Literals.JAVA_METHOD_ARGUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMapsFrom() {
		return mapsFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapsFrom(String newMapsFrom) {
		String oldMapsFrom = mapsFrom;
		mapsFrom = newMapsFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalFunctionsPackage.JAVA_METHOD_ARGUMENT__MAPS_FROM, oldMapsFrom, mapsFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalFunctionsPackage.JAVA_METHOD_ARGUMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class<?> getJavaType() {
		return javaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaType(Class<?> newJavaType) {
		Class<?> oldJavaType = javaType;
		javaType = newJavaType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalFunctionsPackage.JAVA_METHOD_ARGUMENT__JAVA_TYPE, oldJavaType, javaType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExternalFunctionsPackage.JAVA_METHOD_ARGUMENT__MAPS_FROM:
				return getMapsFrom();
			case ExternalFunctionsPackage.JAVA_METHOD_ARGUMENT__TYPE:
				return getType();
			case ExternalFunctionsPackage.JAVA_METHOD_ARGUMENT__JAVA_TYPE:
				return getJavaType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExternalFunctionsPackage.JAVA_METHOD_ARGUMENT__MAPS_FROM:
				setMapsFrom((String)newValue);
				return;
			case ExternalFunctionsPackage.JAVA_METHOD_ARGUMENT__TYPE:
				setType((String)newValue);
				return;
			case ExternalFunctionsPackage.JAVA_METHOD_ARGUMENT__JAVA_TYPE:
				setJavaType((Class<?>)newValue);
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
			case ExternalFunctionsPackage.JAVA_METHOD_ARGUMENT__MAPS_FROM:
				setMapsFrom(MAPS_FROM_EDEFAULT);
				return;
			case ExternalFunctionsPackage.JAVA_METHOD_ARGUMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ExternalFunctionsPackage.JAVA_METHOD_ARGUMENT__JAVA_TYPE:
				setJavaType((Class<?>)null);
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
			case ExternalFunctionsPackage.JAVA_METHOD_ARGUMENT__MAPS_FROM:
				return MAPS_FROM_EDEFAULT == null ? mapsFrom != null : !MAPS_FROM_EDEFAULT.equals(mapsFrom);
			case ExternalFunctionsPackage.JAVA_METHOD_ARGUMENT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ExternalFunctionsPackage.JAVA_METHOD_ARGUMENT__JAVA_TYPE:
				return javaType != null;
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
		result.append(" (mapsFrom: ");
		result.append(mapsFrom);
		result.append(", type: ");
		result.append(type);
		result.append(", javaType: ");
		result.append(javaType);
		result.append(')');
		return result.toString();
	}

} //JavaMethodArgumentImpl
