package org.eclipse.stem.interventions.impl;

/******************************************************************************* 
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     IBM Corporation - initial API and implementation 
 *******************************************************************************/

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.stem.interventions.InterventionsPackage;
import org.eclipse.stem.interventions.StandardInterventionLabelValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard Intervention Label Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.interventions.impl.StandardInterventionLabelValueImpl#getVaccinations <em>Vaccinations</em>}</li>
 *   <li>{@link org.eclipse.stem.interventions.impl.StandardInterventionLabelValueImpl#getIsolations <em>Isolations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StandardInterventionLabelValueImpl extends InterventionLabelValueImpl implements StandardInterventionLabelValue {
	/**
	 * The default value of the '{@link #getVaccinations() <em>Vaccinations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaccinations()
	 * @generated
	 * @ordered
	 */
	protected static final double VACCINATIONS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVaccinations() <em>Vaccinations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaccinations()
	 * @generated
	 * @ordered
	 */
	protected double vaccinations = VACCINATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsolations() <em>Isolations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolations()
	 * @generated
	 * @ordered
	 */
	protected static final double ISOLATIONS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIsolations() <em>Isolations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolations()
	 * @generated
	 * @ordered
	 */
	protected double isolations = ISOLATIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardInterventionLabelValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InterventionsPackage.Literals.STANDARD_INTERVENTION_LABEL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVaccinations() {
		return vaccinations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVaccinations(double newVaccinations) {
		double oldVaccinations = vaccinations;
		vaccinations = newVaccinations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterventionsPackage.STANDARD_INTERVENTION_LABEL_VALUE__VACCINATIONS, oldVaccinations, vaccinations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIsolations() {
		return isolations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsolations(double newIsolations) {
		double oldIsolations = isolations;
		isolations = newIsolations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterventionsPackage.STANDARD_INTERVENTION_LABEL_VALUE__ISOLATIONS, oldIsolations, isolations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InterventionsPackage.STANDARD_INTERVENTION_LABEL_VALUE__VACCINATIONS:
				return getVaccinations();
			case InterventionsPackage.STANDARD_INTERVENTION_LABEL_VALUE__ISOLATIONS:
				return getIsolations();
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
			case InterventionsPackage.STANDARD_INTERVENTION_LABEL_VALUE__VACCINATIONS:
				setVaccinations((Double)newValue);
				return;
			case InterventionsPackage.STANDARD_INTERVENTION_LABEL_VALUE__ISOLATIONS:
				setIsolations((Double)newValue);
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
			case InterventionsPackage.STANDARD_INTERVENTION_LABEL_VALUE__VACCINATIONS:
				setVaccinations(VACCINATIONS_EDEFAULT);
				return;
			case InterventionsPackage.STANDARD_INTERVENTION_LABEL_VALUE__ISOLATIONS:
				setIsolations(ISOLATIONS_EDEFAULT);
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
			case InterventionsPackage.STANDARD_INTERVENTION_LABEL_VALUE__VACCINATIONS:
				return vaccinations != VACCINATIONS_EDEFAULT;
			case InterventionsPackage.STANDARD_INTERVENTION_LABEL_VALUE__ISOLATIONS:
				return isolations != ISOLATIONS_EDEFAULT;
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
		result.append(" (vaccinations: ");
		result.append(vaccinations);
		result.append(", isolations: ");
		result.append(isolations);
		result.append(')');
		return result.toString();
	}

} //StandardInterventionLabelValueImpl
