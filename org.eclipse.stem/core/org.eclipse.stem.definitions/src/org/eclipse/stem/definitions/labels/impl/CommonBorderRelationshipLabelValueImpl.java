package org.eclipse.stem.definitions.labels.impl;

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
import org.eclipse.stem.definitions.labels.CommonBorderRelationshipLabelValue;
import org.eclipse.stem.definitions.labels.LabelsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Common Border Relationship Label Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.definitions.labels.impl.CommonBorderRelationshipLabelValueImpl#getBorderLength <em>Border Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommonBorderRelationshipLabelValueImpl extends
		PhysicalRelationshipLabelValueImpl implements
		CommonBorderRelationshipLabelValue {
	/**
	 * The default value of the '{@link #getBorderLength() <em>Border Length</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBorderLength()
	 * @generated
	 * @ordered
	 */
	protected static final double BORDER_LENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBorderLength() <em>Border Length</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBorderLength()
	 * @generated
	 * @ordered
	 */
	protected double borderLength = BORDER_LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CommonBorderRelationshipLabelValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LabelsPackage.Literals.COMMON_BORDER_RELATIONSHIP_LABEL_VALUE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getBorderLength() {
		return borderLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorderLength(double newBorderLength) {
		double oldBorderLength = borderLength;
		borderLength = newBorderLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LabelsPackage.COMMON_BORDER_RELATIONSHIP_LABEL_VALUE__BORDER_LENGTH, oldBorderLength, borderLength));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("boxing")
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LabelsPackage.COMMON_BORDER_RELATIONSHIP_LABEL_VALUE__BORDER_LENGTH:
				return getBorderLength();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("boxing")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LabelsPackage.COMMON_BORDER_RELATIONSHIP_LABEL_VALUE__BORDER_LENGTH:
				setBorderLength((Double)newValue);
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
			case LabelsPackage.COMMON_BORDER_RELATIONSHIP_LABEL_VALUE__BORDER_LENGTH:
				setBorderLength(BORDER_LENGTH_EDEFAULT);
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
			case LabelsPackage.COMMON_BORDER_RELATIONSHIP_LABEL_VALUE__BORDER_LENGTH:
				return borderLength != BORDER_LENGTH_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (borderLength: "); //$NON-NLS-1$
		result.append(borderLength);
		result.append(')');
		return result.toString();
	}

} // CommonBorderRelationshipLabelValueImpl
