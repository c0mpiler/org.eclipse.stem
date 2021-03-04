package org.eclipse.stem.populationmodels.standard.impl;

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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.populationmodels.standard.AgeGroup;
import org.eclipse.stem.populationmodels.standard.StandardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Age Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.AgeGroupImpl#getFromAge <em>From Age</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.AgeGroupImpl#getToAge <em>To Age</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.AgeGroupImpl#getDeathFactor <em>Death Factor</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.AgeGroupImpl#isLimited <em>Limited</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgeGroupImpl extends PopulationGroupImpl implements AgeGroup {
	/**
	 * The default value of the '{@link #getFromAge() <em>From Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromAge()
	 * @generated
	 * @ordered
	 */
	protected static final int FROM_AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFromAge() <em>From Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromAge()
	 * @generated
	 * @ordered
	 */
	protected int fromAge = FROM_AGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getToAge() <em>To Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToAge()
	 * @generated
	 * @ordered
	 */
	protected static final int TO_AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getToAge() <em>To Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToAge()
	 * @generated
	 * @ordered
	 */
	protected int toAge = TO_AGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeathFactor() <em>Death Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeathFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double DEATH_FACTOR_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getDeathFactor() <em>Death Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeathFactor()
	 * @generated
	 * @ordered
	 */
	protected double deathFactor = DEATH_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isLimited() <em>Limited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLimited()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LIMITED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLimited() <em>Limited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLimited()
	 * @generated
	 * @ordered
	 */
	protected boolean limited = LIMITED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.AGE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFromAge() {
		return fromAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromAge(int newFromAge) {
		fromAge = newFromAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getToAge() {
		return toAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToAge(int newToAge) {
		toAge = newToAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDeathFactor() {
		return deathFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeathFactor(double newDeathFactor) {
		deathFactor = newDeathFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLimited() {
		return limited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimited(boolean newLimited) {
		limited = newLimited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StandardPackage.AGE_GROUP__FROM_AGE:
				return getFromAge();
			case StandardPackage.AGE_GROUP__TO_AGE:
				return getToAge();
			case StandardPackage.AGE_GROUP__DEATH_FACTOR:
				return getDeathFactor();
			case StandardPackage.AGE_GROUP__LIMITED:
				return isLimited();
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
			case StandardPackage.AGE_GROUP__FROM_AGE:
				setFromAge((Integer)newValue);
				return;
			case StandardPackage.AGE_GROUP__TO_AGE:
				setToAge((Integer)newValue);
				return;
			case StandardPackage.AGE_GROUP__DEATH_FACTOR:
				setDeathFactor((Double)newValue);
				return;
			case StandardPackage.AGE_GROUP__LIMITED:
				setLimited((Boolean)newValue);
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
			case StandardPackage.AGE_GROUP__FROM_AGE:
				setFromAge(FROM_AGE_EDEFAULT);
				return;
			case StandardPackage.AGE_GROUP__TO_AGE:
				setToAge(TO_AGE_EDEFAULT);
				return;
			case StandardPackage.AGE_GROUP__DEATH_FACTOR:
				setDeathFactor(DEATH_FACTOR_EDEFAULT);
				return;
			case StandardPackage.AGE_GROUP__LIMITED:
				setLimited(LIMITED_EDEFAULT);
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
			case StandardPackage.AGE_GROUP__FROM_AGE:
				return fromAge != FROM_AGE_EDEFAULT;
			case StandardPackage.AGE_GROUP__TO_AGE:
				return toAge != TO_AGE_EDEFAULT;
			case StandardPackage.AGE_GROUP__DEATH_FACTOR:
				return deathFactor != DEATH_FACTOR_EDEFAULT;
			case StandardPackage.AGE_GROUP__LIMITED:
				return limited != LIMITED_EDEFAULT;
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
		result.append(" (fromAge: ");
		result.append(fromAge);
		result.append(", toAge: ");
		result.append(toAge);
		result.append(", deathFactor: ");
		result.append(deathFactor);
		result.append(", limited: ");
		result.append(limited);
		result.append(')');
		return result.toString();
	}

} //AgeGroupImpl
