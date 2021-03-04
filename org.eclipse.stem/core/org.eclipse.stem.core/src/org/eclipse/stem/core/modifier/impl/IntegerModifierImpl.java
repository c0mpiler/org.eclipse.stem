package org.eclipse.stem.core.modifier.impl;

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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.stem.core.modifier.IntegerModifier;
import org.eclipse.stem.core.modifier.ModifierPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Modifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.core.modifier.impl.IntegerModifierImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.stem.core.modifier.impl.IntegerModifierImpl#getOriginalValue <em>Original Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntegerModifierImpl extends SingleValueModifierImpl implements IntegerModifier {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;
	/**
	 * The default value of the '{@link #getOriginalValue() <em>Original Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalValue()
	 * @generated
	 * @ordered
	 */
	protected static final int ORIGINAL_VALUE_EDEFAULT = -2000000000;
	/**
	 * The cached value of the '{@link #getOriginalValue() <em>Original Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalValue()
	 * @generated
	 * @ordered
	 */
	protected int originalValue = ORIGINAL_VALUE_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerModifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModifierPackage.Literals.INTEGER_MODIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModifierPackage.INTEGER_MODIFIER__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOriginalValue() {
		return originalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalValue(int newOriginalValue) {
		int oldOriginalValue = originalValue;
		originalValue = newOriginalValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModifierPackage.INTEGER_MODIFIER__ORIGINAL_VALUE, oldOriginalValue, originalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("boxing")
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModifierPackage.INTEGER_MODIFIER__VALUE:
				return getValue();
			case ModifierPackage.INTEGER_MODIFIER__ORIGINAL_VALUE:
				return getOriginalValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("boxing")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModifierPackage.INTEGER_MODIFIER__VALUE:
				setValue((Integer)newValue);
				return;
			case ModifierPackage.INTEGER_MODIFIER__ORIGINAL_VALUE:
				setOriginalValue((Integer)newValue);
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
			case ModifierPackage.INTEGER_MODIFIER__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ModifierPackage.INTEGER_MODIFIER__ORIGINAL_VALUE:
				setOriginalValue(ORIGINAL_VALUE_EDEFAULT);
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
			case ModifierPackage.INTEGER_MODIFIER__VALUE:
				return value != VALUE_EDEFAULT;
			case ModifierPackage.INTEGER_MODIFIER__ORIGINAL_VALUE:
				return originalValue != ORIGINAL_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @see org.eclipse.stem.core.modifier.impl.FeatureModifierImpl#updateFeature()
	 */
	
	@SuppressWarnings("boxing")
	@Override
	public void updateFeature() {
		// Original value captured yet?
		if (!eIsSet(ModifierPackage.DOUBLE_MODIFIER__ORIGINAL_VALUE)) {
			// No
			setOriginalValue((Integer)target.eGet(getEStructuralFeature()));
		} // if
		target.eSet(getEStructuralFeature(), getValue());
		complete = true;
	} // updateFeature

	
	/**
	 *reset
	 */
	@Override
	public void reset() {
		complete = false;
		double originalValue = getOriginalValue();
		if(originalValue != ORIGINAL_VALUE_EDEFAULT) // We don't want to set it if it hasn't been captured yet. 
			target.eSet(getEStructuralFeature(), Double.valueOf(originalValue));
		target.eSet(getEStructuralFeature(), Double.valueOf(getOriginalValue()));
		//setOriginalValue(ORIGINAL_VALUE_EDEFAULT); // To make sure we capture any new value next time simulation is run
	}
	
	
	private boolean complete = false;
	/**
	 * isComplete
	 */
	@Override
	public boolean isComplete() {
		return complete;
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
		result.append(" (value: "); //$NON-NLS-1$
		result.append(value);
		result.append(", originalValue: "); //$NON-NLS-1$
		result.append(originalValue);
		result.append(')');
		return result.toString();
	}

} //IntegerModifierImpl
