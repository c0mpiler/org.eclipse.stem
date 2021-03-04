package org.eclipse.stem.diseasemodels.standard.impl;

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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.core.graph.IntegrationLabelValue;
import org.eclipse.stem.core.graph.LabelValue;
import org.eclipse.stem.diseasemodels.standard.SILabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardFactory;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>SI Label Value</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.impl.SILabelValueImpl#getI <em>I</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SILabelValueImpl extends StandardDiseaseModelLabelValueImpl
		implements SILabelValue {
	/**
	 * The default value of the '{@link #getI() <em>I</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getI()
	 * @generated
	 * @ordered
	 */
	protected static final double I_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getI() <em>I</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getI()
	 * @generated
	 * @ordered
	 */
	protected double i = I_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SILabelValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * This is used to create instances for testing purposes.
	 * 
	 * @param s
	 *            the number of susceptible population members
	 * 
	 * @param iR
	 *            the number of recovering infectious population members
	 * 
	 * @param iF
	 *            the number of fatally infectious population members
	 * 
	 * @param incidence
	 *            the new incidence from the interaction term in the compartment
	 *            model
	 * 
	 * @param births
	 *            the number of births that have occurred in the population
	 * @param deaths
	 *            the total number of deaths that have occurred in the
	 *            population
	 * @param diseaseDeaths
	 *            the number of deaths due to the disease that have occurred in
	 *            the population
	 * 
	 *            <!-- end-user-doc -->
	 */
	public SILabelValueImpl(final double s, final double i,
			final double incidence, final double diseaseDeaths) {
		super(s, incidence, diseaseDeaths);
		this.setI(i);
	} // SILabelValueImpl

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * This is used to create instances for testing purposes.
	 * 
	 * @param s
	 *            the number of susceptible population members
	 * 
	 * @param iR
	 *            the number of recovering infectious population members
	 * 
	 * @param iF
	 *            the number of fatally infectious population members
	 * 
	 * @param births
	 *            the number of births that have occurred in the population
	 * @param deaths
	 *            the total number of deaths that have occurred in the
	 *            population
	 * @param diseaseDeaths
	 *            the number of deaths due to the disease that have occurred in
	 *            the population
	 * 
	 *            <!-- end-user-doc -->
	 */
	public SILabelValueImpl(final double s, final double i,
			final double diseaseDeaths) {
		super(s, 0, diseaseDeaths);
		this.setI(i);
		this.setDiseaseDeaths(diseaseDeaths);
	} // SILabelValueImpl

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.SI_LABEL_VALUE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getI() {
		return i;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setI(double newI) {
		i = newI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param featureID
	 * @param resolve
	 * @param coreType
	 * @return
	 * 
	 *         <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("boxing")
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StandardPackage.SI_LABEL_VALUE__I:
				return getI();
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
			case StandardPackage.SI_LABEL_VALUE__I:
				setI((Double)newValue);
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
			case StandardPackage.SI_LABEL_VALUE__I:
				setI(I_EDEFAULT);
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
	 *         <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StandardPackage.SI_LABEL_VALUE__I:
				return i != I_EDEFAULT;
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
		result.append(" (i: "); //$NON-NLS-1$
		result.append(i);
		result.append(')');
		return result.toString();
	}

	@Override
	public IntegrationLabelValue set(IntegrationLabelValue value) {
		SILabelValue v = (SILabelValue) value;

		super.set(value);
		setI(v.getI());

		return this;
	}

	@Override
	public IntegrationLabelValue add(IntegrationLabelValue value) {
		SILabelValue v = (SILabelValue) value;

		super.add(value);
		setI(getI() + v.getI());

		return this;
	}

	@Override
	public IntegrationLabelValue sub(IntegrationLabelValue value) {
		SILabelValue v = (SILabelValue) value;

		super.sub(value);
		setI(getI() - v.getI());

		return this;
	}

	@Override
	public IntegrationLabelValue scale(double scaleFactor) {
		super.scale(scaleFactor);
		setI(scaleFactor * getI());

		return this;
	}

	@Override
	public IntegrationLabelValue add(double addition) {
		super.add(addition);
		setI(getI() + addition);

		return this;
	}

	@Override
	public IntegrationLabelValue abs() {
		super.abs();
		setI(Math.abs(getI()));

		return this;
	}

	@Override
	public boolean avoidNegative(IntegrationLabelValue value) {
		SILabelValue v = (SILabelValue) value;
		boolean adjusted = super.avoidNegative(value);

		if (getI() + v.getI() < 0.0) {
			setI(-v.getI());
		}

		return adjusted;
	}

	@Override
	public double computeDeltaAdjustment(IntegrationLabelValue value) {
		SILabelValue v = (SILabelValue) value;
		double factor = super.computeDeltaAdjustment(value);

		if (getI() + v.getI() < 0.0) {
			factor = Math.min(factor, -v.getI() / getI());
		}

		return factor;
	}

	@Override
	public IntegrationLabelValue divide(IntegrationLabelValue value) {
		SILabelValue v = (SILabelValue) value;

		super.divide(value);
		setI(getI() / v.getI());

		return this;
	}

	@Override
	public double max() {
		double max = super.max();

		max = Math.max(max, getI());

		return max;
	}

	@Override
	public void reset() {
		super.reset();
		setI(0.0);
	}

	@Override
	public boolean sameValue(LabelValue otherLabelValue) {
		SILabelValue v = (SILabelValue) otherLabelValue;

		if (!super.sameValue(otherLabelValue)) {
			return false;
		}
		
		if (getI() != v.getI()) {
			return false;
		}

		return true;
	}
	
	@Override
	public double getPopulationCount() {
		return super.getPopulationCount() + getI();
	}

	@Override
	public IntegrationLabelValue copy() {
		IntegrationLabelValue ilv = StandardFactory.eINSTANCE.createSILabelValue();
		ilv.set(this);
		return ilv;
	}
	/**
	 * Use this for enhanced performance (no boxing) instead of eSet
	 */
	
	@Override
	public void eSetDouble(int featureId, double newValue) {
		switch (featureId) {
		case StandardPackage.SI_LABEL_VALUE__I:
			setI(newValue);
			return;
		}
		super.eSetDouble(featureId, newValue);
	}
	
	/**
	 * For performance. Retrieve double attributes directly without boxing
	 * 
	 * @param doubleAttribute The attribute to retrieve (must be of type Double)
	 * @return double the value for the attribute
	 */
	@Override
	public double eGetDouble(int featureId) {
		switch (featureId) {
		case StandardPackage.SI_LABEL_VALUE__I:
			return getI();
		}
		return super.eGetDouble(featureId);
	}
} // SILabelValueImpl
