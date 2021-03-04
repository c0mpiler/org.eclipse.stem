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
package org.eclipse.stem.definitions.edges.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.stem.core.graph.impl.LabelValueImpl;
import org.eclipse.stem.definitions.edges.EdgesPackage;
import org.eclipse.stem.definitions.edges.MixingEdgeLabelValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mixing Edge Label Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.definitions.edges.impl.MixingEdgeLabelValueImpl#getMixingRate <em>Mixing Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MixingEdgeLabelValueImpl extends LabelValueImpl implements MixingEdgeLabelValue {
	/**
	 * The default value of the '{@link #getMixingRate() <em>Mixing Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixingRate()
	 * @generated
	 * @ordered
	 */
	protected static final double MIXING_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMixingRate() <em>Mixing Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixingRate()
	 * @generated
	 * @ordered
	 */
	protected double mixingRate = MIXING_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MixingEdgeLabelValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdgesPackage.Literals.MIXING_EDGE_LABEL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMixingRate() {
		return mixingRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMixingRate(double newMixingRate) {
		double oldMixingRate = mixingRate;
		mixingRate = newMixingRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdgesPackage.MIXING_EDGE_LABEL_VALUE__MIXING_RATE, oldMixingRate, mixingRate));
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
			case EdgesPackage.MIXING_EDGE_LABEL_VALUE__MIXING_RATE:
				return getMixingRate();
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
			case EdgesPackage.MIXING_EDGE_LABEL_VALUE__MIXING_RATE:
				setMixingRate((Double)newValue);
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
			case EdgesPackage.MIXING_EDGE_LABEL_VALUE__MIXING_RATE:
				setMixingRate(MIXING_RATE_EDEFAULT);
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
			case EdgesPackage.MIXING_EDGE_LABEL_VALUE__MIXING_RATE:
				return mixingRate != MIXING_RATE_EDEFAULT;
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
		result.append(" (mixingRate: "); //$NON-NLS-1$
		result.append(mixingRate);
		result.append(')');
		return result.toString();
	}

} //MixingEdgeLabelValueImpl
