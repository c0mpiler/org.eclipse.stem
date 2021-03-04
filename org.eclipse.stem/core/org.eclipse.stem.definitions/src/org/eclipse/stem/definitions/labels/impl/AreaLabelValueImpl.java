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
import org.eclipse.stem.core.graph.impl.LabelValueImpl;
import org.eclipse.stem.definitions.labels.AreaLabelValue;
import org.eclipse.stem.definitions.labels.LabelsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Area Label Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.definitions.labels.impl.AreaLabelValueImpl#getArea <em>Area</em>}</li>
 *   <li>{@link org.eclipse.stem.definitions.labels.impl.AreaLabelValueImpl#getAverageExtent <em>Average Extent</em>}</li>
 * </ul>
 *
 * @generated
 */
@SuppressWarnings("boxing")
public class AreaLabelValueImpl extends LabelValueImpl implements
		AreaLabelValue {
	/**
	 * The default value of the '{@link #getArea() <em>Area</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected static final double AREA_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getArea() <em>Area</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected double area = AREA_EDEFAULT;

	/**
	 * The default value of the '{@link #getAverageExtent() <em>Average Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageExtent()
	 * @generated
	 * @ordered
	 */
	protected static final double AVERAGE_EXTENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAverageExtent() <em>Average Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageExtent()
	 * @generated
	 * @ordered
	 */
	protected double averageExtent = AVERAGE_EXTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AreaLabelValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LabelsPackage.Literals.AREA_LABEL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @return
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getArea() {
		return area;
	}

	/**
	 * @see org.eclipse.stem.core.graph.impl.LabelValueImpl#reset()
	 */
	@Override
	public void reset() {
		// We don't reset
	} // reset

	/**
	 * @see org.eclipse.stem.core.common.SanityChecker#sane()
	 */
	@Override
	public boolean sane() {
		boolean retValue = true;

		// The area should be greater than zero
		retValue = retValue && getArea() > 0;
		//assert retValue;

		return retValue;
	} // sane

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param newArea
	 * 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setArea(double newArea) {
		double oldArea = getArea();
		area = newArea;
		if(getArea() >= 1.0) {
			setAverageExtent(Math.sqrt(getArea()));
		} else {
			setAverageExtent(1.0);
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LabelsPackage.AREA_LABEL_VALUE__AREA, oldArea, getArea()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getAverageExtent() {
		return averageExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAverageExtent(double newAverageExtent) {
		double oldAverageExtent = averageExtent;
		averageExtent = newAverageExtent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LabelsPackage.AREA_LABEL_VALUE__AVERAGE_EXTENT, oldAverageExtent, averageExtent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param featureID
	 * @param resolve
	 * @param coreType
	 * @return
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LabelsPackage.AREA_LABEL_VALUE__AREA:
				return getArea();
			case LabelsPackage.AREA_LABEL_VALUE__AVERAGE_EXTENT:
				return getAverageExtent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param featureID
	 * @param newValue
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LabelsPackage.AREA_LABEL_VALUE__AREA:
				setArea((Double)newValue);
				return;
			case LabelsPackage.AREA_LABEL_VALUE__AVERAGE_EXTENT:
				setAverageExtent((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param featureID
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LabelsPackage.AREA_LABEL_VALUE__AREA:
				setArea(AREA_EDEFAULT);
				return;
			case LabelsPackage.AREA_LABEL_VALUE__AVERAGE_EXTENT:
				setAverageExtent(AVERAGE_EXTENT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param featureID
	 * @return
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LabelsPackage.AREA_LABEL_VALUE__AREA:
				return area != AREA_EDEFAULT;
			case LabelsPackage.AREA_LABEL_VALUE__AVERAGE_EXTENT:
				return averageExtent != AVERAGE_EXTENT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @return
	 * 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer();
		result.append(getArea());
		result.append(" km^2");
		return result.toString();
	}

} // AreaLabelValueImpl
