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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.stem.model.ctdl.functions.ExternalFunctionsPackage;
import org.eclipse.stem.model.ctdl.functions.FunctionArgument;
import org.eclipse.stem.model.ctdl.functions.FunctionArgumentReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Argument Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.ctdl.functions.impl.FunctionArgumentReferenceImpl#getArgIndex <em>Arg Index</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.functions.impl.FunctionArgumentReferenceImpl#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionArgumentReferenceImpl extends JavaMethodArgumentImpl implements FunctionArgumentReference {
	/**
	 * The default value of the '{@link #getArgIndex() <em>Arg Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int ARG_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getArgIndex() <em>Arg Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgIndex()
	 * @generated
	 * @ordered
	 */
	protected int argIndex = ARG_INDEX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected FunctionArgument ref;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionArgumentReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExternalFunctionsPackage.Literals.FUNCTION_ARGUMENT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getArgIndex() {
		return argIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgIndex(int newArgIndex) {
		int oldArgIndex = argIndex;
		argIndex = newArgIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalFunctionsPackage.FUNCTION_ARGUMENT_REFERENCE__ARG_INDEX, oldArgIndex, argIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionArgument getRef() {
		if (ref != null && ref.eIsProxy()) {
			InternalEObject oldRef = (InternalEObject)ref;
			ref = (FunctionArgument)eResolveProxy(oldRef);
			if (ref != oldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExternalFunctionsPackage.FUNCTION_ARGUMENT_REFERENCE__REF, oldRef, ref));
			}
		}
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionArgument basicGetRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(FunctionArgument newRef) {
		FunctionArgument oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalFunctionsPackage.FUNCTION_ARGUMENT_REFERENCE__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExternalFunctionsPackage.FUNCTION_ARGUMENT_REFERENCE__ARG_INDEX:
				return getArgIndex();
			case ExternalFunctionsPackage.FUNCTION_ARGUMENT_REFERENCE__REF:
				if (resolve) return getRef();
				return basicGetRef();
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
			case ExternalFunctionsPackage.FUNCTION_ARGUMENT_REFERENCE__ARG_INDEX:
				setArgIndex((Integer)newValue);
				return;
			case ExternalFunctionsPackage.FUNCTION_ARGUMENT_REFERENCE__REF:
				setRef((FunctionArgument)newValue);
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
			case ExternalFunctionsPackage.FUNCTION_ARGUMENT_REFERENCE__ARG_INDEX:
				setArgIndex(ARG_INDEX_EDEFAULT);
				return;
			case ExternalFunctionsPackage.FUNCTION_ARGUMENT_REFERENCE__REF:
				setRef((FunctionArgument)null);
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
			case ExternalFunctionsPackage.FUNCTION_ARGUMENT_REFERENCE__ARG_INDEX:
				return argIndex != ARG_INDEX_EDEFAULT;
			case ExternalFunctionsPackage.FUNCTION_ARGUMENT_REFERENCE__REF:
				return ref != null;
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
		result.append(" (argIndex: ");
		result.append(argIndex);
		result.append(')');
		return result.toString();
	}

} //FunctionArgumentReferenceImpl
