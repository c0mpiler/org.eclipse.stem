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
import org.eclipse.stem.core.modifier.DoubleRangeModifier;
import org.eclipse.stem.core.modifier.ModifierPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Double Range Modifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.core.modifier.impl.DoubleRangeModifierImpl#getStartValue <em>Start Value</em>}</li>
 *   <li>{@link org.eclipse.stem.core.modifier.impl.DoubleRangeModifierImpl#getEndValue <em>End Value</em>}</li>
 *   <li>{@link org.eclipse.stem.core.modifier.impl.DoubleRangeModifierImpl#getIncrement <em>Increment</em>}</li>
 *   <li>{@link org.eclipse.stem.core.modifier.impl.DoubleRangeModifierImpl#getNextValue <em>Next Value</em>}</li>
 *   <li>{@link org.eclipse.stem.core.modifier.impl.DoubleRangeModifierImpl#getOriginalValue <em>Original Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("boxing")
public class DoubleRangeModifierImpl extends RangeModifierImpl implements
		DoubleRangeModifier {
	/**
	 * The default value of the '{@link #getStartValue() <em>Start Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStartValue()
	 * @generated
	 * @ordered
	 */
	protected static final double START_VALUE_EDEFAULT = -9.9999999E7;
	/**
	 * The cached value of the '{@link #getStartValue() <em>Start Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStartValue()
	 * @generated
	 * @ordered
	 */
	protected double startValue = START_VALUE_EDEFAULT;
	/**
	 * The default value of the '{@link #getEndValue() <em>End Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEndValue()
	 * @generated
	 * @ordered
	 */
	protected static final double END_VALUE_EDEFAULT = -9.9999999E7;
	/**
	 * The cached value of the '{@link #getEndValue() <em>End Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEndValue()
	 * @generated
	 * @ordered
	 */
	protected double endValue = END_VALUE_EDEFAULT;
	/**
	 * The default value of the '{@link #getIncrement() <em>Increment</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getIncrement()
	 * @generated
	 * @ordered
	 */
	protected static final double INCREMENT_EDEFAULT = -9.9999999E7;
	/**
	 * The cached value of the '{@link #getIncrement() <em>Increment</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getIncrement()
	 * @generated
	 * @ordered
	 */
	protected double increment = INCREMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNextValue() <em>Next Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextValue()
	 * @generated
	 * @ordered
	 */
	protected static final double NEXT_VALUE_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getNextValue() <em>Next Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextValue()
	 * @generated
	 * @ordered
	 */
	protected double nextValue = NEXT_VALUE_EDEFAULT;
	/**
	 * The default value of the '{@link #getOriginalValue() <em>Original Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalValue()
	 * @generated
	 * @ordered
	 */
	protected static final double ORIGINAL_VALUE_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getOriginalValue() <em>Original Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalValue()
	 * @generated
	 * @ordered
	 */
	protected double originalValue = ORIGINAL_VALUE_EDEFAULT;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DoubleRangeModifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModifierPackage.Literals.DOUBLE_RANGE_MODIFIER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getStartValue() {
		return startValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartValue(double newStartValue) {
		double oldStartValue = startValue;
		startValue = newStartValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModifierPackage.DOUBLE_RANGE_MODIFIER__START_VALUE, oldStartValue, startValue));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getEndValue() {
		return endValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndValue(double newEndValue) {
		double oldEndValue = endValue;
		endValue = newEndValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModifierPackage.DOUBLE_RANGE_MODIFIER__END_VALUE, oldEndValue, endValue));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getIncrement() {
		return increment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrement(double newIncrement) {
		double oldIncrement = increment;
		increment = newIncrement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModifierPackage.DOUBLE_RANGE_MODIFIER__INCREMENT, oldIncrement, increment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getNextValue() {
		// Unset?
		if (!eIsSet(ModifierPackage.DOUBLE_RANGE_MODIFIER__NEXT_VALUE)) {
			// Yes
			setNextValue(getStartValue());
		} // if
		
		final double retValue = nextValue;
		
		// We are done if the current value is closer to the end value than to
		// the value one step before the end value. It is done this way because
		// of numerical precision.
		complete = Math.abs(retValue - getEndValue()) < Math.abs(retValue - (getEndValue() - getIncrement()));
		
		// Still incrementing?
		if (!complete) {
			// Yes
			final double temp = retValue + getIncrement();
			// Would the new currentValue be equal or "past" the endValue?
			if ((getIncrement() >= 0 && temp < getEndValue()) || (getIncrement() < 0 && temp > getEndValue())) {
				// No
				setNextValue(temp);
			} // if
			else {
				// Yes
				setNextValue(getEndValue());
			} // else 
		} // if 
		currentValueText = Double.toString(retValue);
		return retValue;
	} // getNextValue

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextValue(double newNextValue) {
		double oldNextValue = nextValue;
		nextValue = newNextValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModifierPackage.DOUBLE_RANGE_MODIFIER__NEXT_VALUE, oldNextValue, nextValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOriginalValue() {
		return originalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalValue(double newOriginalValue) {
		double oldOriginalValue = originalValue;
		originalValue = newOriginalValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModifierPackage.DOUBLE_RANGE_MODIFIER__ORIGINAL_VALUE, oldOriginalValue, originalValue));
	}

	/**
	 * @see org.eclipse.stem.core.modifier.impl.FeatureModifierImpl#updateFeature()
	 */
	
	@Override
	public void updateFeature() {
		// Original value captured yet?
		if (!eIsSet(ModifierPackage.DOUBLE_RANGE_MODIFIER__ORIGINAL_VALUE)) {
			// No
			setOriginalValue((Double)getTarget().eGet(getEStructuralFeature()));
		} // if
		getTarget().eSet(getEStructuralFeature(), getNextValue());
	} // updateFeature

	
	/**
	 * @see org.eclipse.stem.core.modifier.impl.RangeModifierImpl#reset()
	 */
	@Override
	public void reset() {
		super.reset();
		eUnset(ModifierPackage.DOUBLE_RANGE_MODIFIER__NEXT_VALUE);
		getTarget().eSet(getEStructuralFeature(), getOriginalValue());
		setOriginalValue(ORIGINAL_VALUE_EDEFAULT); // To make sure we capture any new value next time simulation is run
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModifierPackage.DOUBLE_RANGE_MODIFIER__START_VALUE:
				return getStartValue();
			case ModifierPackage.DOUBLE_RANGE_MODIFIER__END_VALUE:
				return getEndValue();
			case ModifierPackage.DOUBLE_RANGE_MODIFIER__INCREMENT:
				return getIncrement();
			case ModifierPackage.DOUBLE_RANGE_MODIFIER__NEXT_VALUE:
				return getNextValue();
			case ModifierPackage.DOUBLE_RANGE_MODIFIER__ORIGINAL_VALUE:
				return getOriginalValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModifierPackage.DOUBLE_RANGE_MODIFIER__START_VALUE:
				setStartValue((Double)newValue);
				return;
			case ModifierPackage.DOUBLE_RANGE_MODIFIER__END_VALUE:
				setEndValue((Double)newValue);
				return;
			case ModifierPackage.DOUBLE_RANGE_MODIFIER__INCREMENT:
				setIncrement((Double)newValue);
				return;
			case ModifierPackage.DOUBLE_RANGE_MODIFIER__NEXT_VALUE:
				setNextValue((Double)newValue);
				return;
			case ModifierPackage.DOUBLE_RANGE_MODIFIER__ORIGINAL_VALUE:
				setOriginalValue((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModifierPackage.DOUBLE_RANGE_MODIFIER__START_VALUE:
				setStartValue(START_VALUE_EDEFAULT);
				return;
			case ModifierPackage.DOUBLE_RANGE_MODIFIER__END_VALUE:
				setEndValue(END_VALUE_EDEFAULT);
				return;
			case ModifierPackage.DOUBLE_RANGE_MODIFIER__INCREMENT:
				setIncrement(INCREMENT_EDEFAULT);
				return;
			case ModifierPackage.DOUBLE_RANGE_MODIFIER__NEXT_VALUE:
				setNextValue(NEXT_VALUE_EDEFAULT);
				return;
			case ModifierPackage.DOUBLE_RANGE_MODIFIER__ORIGINAL_VALUE:
				setOriginalValue(ORIGINAL_VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModifierPackage.DOUBLE_RANGE_MODIFIER__START_VALUE:
				return startValue != START_VALUE_EDEFAULT;
			case ModifierPackage.DOUBLE_RANGE_MODIFIER__END_VALUE:
				return endValue != END_VALUE_EDEFAULT;
			case ModifierPackage.DOUBLE_RANGE_MODIFIER__INCREMENT:
				return increment != INCREMENT_EDEFAULT;
			case ModifierPackage.DOUBLE_RANGE_MODIFIER__NEXT_VALUE:
				return nextValue != NEXT_VALUE_EDEFAULT;
			case ModifierPackage.DOUBLE_RANGE_MODIFIER__ORIGINAL_VALUE:
				return originalValue != ORIGINAL_VALUE_EDEFAULT;
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
		result.append(" (startValue: "); //$NON-NLS-1$
		result.append(startValue);
		result.append(", endValue: "); //$NON-NLS-1$
		result.append(endValue);
		result.append(", increment: "); //$NON-NLS-1$
		result.append(increment);
		result.append(", nextValue: "); //$NON-NLS-1$
		result.append(nextValue);
		result.append(", originalValue: "); //$NON-NLS-1$
		result.append(originalValue);
		result.append(')');
		return result.toString();
	}

	/**
	 * @see org.eclipse.stem.core.common.SanityChecker#sane()
	 */
	@Override
	public boolean sane() {
		boolean retValue = super.sane();
		assert retValue;

		retValue = retValue && (getEndValue() >= getStartValue());
		assert retValue;

		retValue = retValue && (getIncrement() > 0.0);
		assert retValue;

		return retValue;
	} // sane

} // DoubleRangeModifierImpl
