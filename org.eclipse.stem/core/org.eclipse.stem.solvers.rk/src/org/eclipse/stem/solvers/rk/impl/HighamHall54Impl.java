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
package org.eclipse.stem.solvers.rk.impl;

import org.apache.commons.math3.ode.FirstOrderIntegrator;
import org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.stem.solvers.rk.HighamHall54;
import org.eclipse.stem.solvers.rk.RkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Higham Hall54</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.solvers.rk.impl.HighamHall54Impl#getRelativeTolerance <em>Relative Tolerance</em>}</li>
 *   <li>{@link org.eclipse.stem.solvers.rk.impl.HighamHall54Impl#getAbsoluteTolerance <em>Absolute Tolerance</em>}</li>
 *   <li>{@link org.eclipse.stem.solvers.rk.impl.HighamHall54Impl#getMinStep <em>Min Step</em>}</li>
 *   <li>{@link org.eclipse.stem.solvers.rk.impl.HighamHall54Impl#getMaxStep <em>Max Step</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HighamHall54Impl extends ApacheCommonsMathODESolverImpl implements HighamHall54 {
	/**
	 * The default value of the '{@link #getRelativeTolerance() <em>Relative Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeTolerance()
	 * @generated
	 * @ordered
	 */
	protected static final double RELATIVE_TOLERANCE_EDEFAULT = 1.0E-9;

	/**
	 * The cached value of the '{@link #getRelativeTolerance() <em>Relative Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeTolerance()
	 * @generated
	 * @ordered
	 */
	protected double relativeTolerance = RELATIVE_TOLERANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbsoluteTolerance() <em>Absolute Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsoluteTolerance()
	 * @generated
	 * @ordered
	 */
	protected static final double ABSOLUTE_TOLERANCE_EDEFAULT = 1.0E-5;

	/**
	 * The cached value of the '{@link #getAbsoluteTolerance() <em>Absolute Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsoluteTolerance()
	 * @generated
	 * @ordered
	 */
	protected double absoluteTolerance = ABSOLUTE_TOLERANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinStep() <em>Min Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinStep()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_STEP_EDEFAULT = 1.0E-8;

	/**
	 * The cached value of the '{@link #getMinStep() <em>Min Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinStep()
	 * @generated
	 * @ordered
	 */
	protected double minStep = MIN_STEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxStep() <em>Max Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxStep()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_STEP_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getMaxStep() <em>Max Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxStep()
	 * @generated
	 * @ordered
	 */
	protected double maxStep = MAX_STEP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public HighamHall54Impl() {
		super();
	}

	/**
	 * Create a new HighamHall54 integrator
	 * 
	 * @return FirstOrderIntergrator  New HighamHall54Integrator 
	 * @generated NOT
	 */
	public FirstOrderIntegrator createIntegrator() {
		return new HighamHall54Integrator(getMinStep(), getMaxStep(), getAbsoluteTolerance(), getRelativeTolerance());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RkPackage.Literals.HIGHAM_HALL54;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRelativeTolerance() {
		return relativeTolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativeTolerance(double newRelativeTolerance) {
		double oldRelativeTolerance = relativeTolerance;
		relativeTolerance = newRelativeTolerance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RkPackage.HIGHAM_HALL54__RELATIVE_TOLERANCE, oldRelativeTolerance, relativeTolerance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAbsoluteTolerance() {
		return absoluteTolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbsoluteTolerance(double newAbsoluteTolerance) {
		double oldAbsoluteTolerance = absoluteTolerance;
		absoluteTolerance = newAbsoluteTolerance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RkPackage.HIGHAM_HALL54__ABSOLUTE_TOLERANCE, oldAbsoluteTolerance, absoluteTolerance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinStep() {
		return minStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinStep(double newMinStep) {
		double oldMinStep = minStep;
		minStep = newMinStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RkPackage.HIGHAM_HALL54__MIN_STEP, oldMinStep, minStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxStep() {
		return maxStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxStep(double newMaxStep) {
		double oldMaxStep = maxStep;
		maxStep = newMaxStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RkPackage.HIGHAM_HALL54__MAX_STEP, oldMaxStep, maxStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RkPackage.HIGHAM_HALL54__RELATIVE_TOLERANCE:
				return getRelativeTolerance();
			case RkPackage.HIGHAM_HALL54__ABSOLUTE_TOLERANCE:
				return getAbsoluteTolerance();
			case RkPackage.HIGHAM_HALL54__MIN_STEP:
				return getMinStep();
			case RkPackage.HIGHAM_HALL54__MAX_STEP:
				return getMaxStep();
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
			case RkPackage.HIGHAM_HALL54__RELATIVE_TOLERANCE:
				setRelativeTolerance((Double)newValue);
				return;
			case RkPackage.HIGHAM_HALL54__ABSOLUTE_TOLERANCE:
				setAbsoluteTolerance((Double)newValue);
				return;
			case RkPackage.HIGHAM_HALL54__MIN_STEP:
				setMinStep((Double)newValue);
				return;
			case RkPackage.HIGHAM_HALL54__MAX_STEP:
				setMaxStep((Double)newValue);
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
			case RkPackage.HIGHAM_HALL54__RELATIVE_TOLERANCE:
				setRelativeTolerance(RELATIVE_TOLERANCE_EDEFAULT);
				return;
			case RkPackage.HIGHAM_HALL54__ABSOLUTE_TOLERANCE:
				setAbsoluteTolerance(ABSOLUTE_TOLERANCE_EDEFAULT);
				return;
			case RkPackage.HIGHAM_HALL54__MIN_STEP:
				setMinStep(MIN_STEP_EDEFAULT);
				return;
			case RkPackage.HIGHAM_HALL54__MAX_STEP:
				setMaxStep(MAX_STEP_EDEFAULT);
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
			case RkPackage.HIGHAM_HALL54__RELATIVE_TOLERANCE:
				return relativeTolerance != RELATIVE_TOLERANCE_EDEFAULT;
			case RkPackage.HIGHAM_HALL54__ABSOLUTE_TOLERANCE:
				return absoluteTolerance != ABSOLUTE_TOLERANCE_EDEFAULT;
			case RkPackage.HIGHAM_HALL54__MIN_STEP:
				return minStep != MIN_STEP_EDEFAULT;
			case RkPackage.HIGHAM_HALL54__MAX_STEP:
				return maxStep != MAX_STEP_EDEFAULT;
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
		result.append(" (relativeTolerance: ");
		result.append(relativeTolerance);
		result.append(", absoluteTolerance: ");
		result.append(absoluteTolerance);
		result.append(", minStep: ");
		result.append(minStep);
		result.append(", maxStep: ");
		result.append(maxStep);
		result.append(')');
		return result.toString();
	}

} //HighamHall54Impl
