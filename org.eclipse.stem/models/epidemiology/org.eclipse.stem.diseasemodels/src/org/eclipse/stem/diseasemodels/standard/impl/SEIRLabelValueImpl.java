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
import org.eclipse.stem.diseasemodels.standard.SEIRLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardFactory;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>SEIR Label Value</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.impl.SEIRLabelValueImpl#getE <em>E</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SEIRLabelValueImpl extends SIRLabelValueImpl implements
		SEIRLabelValue {
	/**
	 * The default value of the '{@link #getE() <em>E</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getE()
	 * @generated
	 * @ordered
	 */
	protected static final double E_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getE() <em>E</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getE()
	 * @generated
	 * @ordered
	 */
	protected double e = E_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SEIRLabelValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * This is used to create instances for testing purposes.
	 * 
	 * @param s
	 *            the number of susceptible population members
	 * @param e
	 *            the number of exposed population members
	 * @param iR
	 *            the number of recovering infectious population members
	 * @param iF
	 *            the number of fatally infectious population members
	 * 
	 * @param incidence
	 *            the new incidence from the interaction term in the compartment
	 *            model
	 * 
	 * @param r
	 *            the number of recovered population members
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
	public SEIRLabelValueImpl(final double s, final double e, final double i,
			double incidence, final double r, final double diseaseDeaths) {
		super(s, i, incidence, r, diseaseDeaths);
		this.setE(e);
	} // SEIRLabelValueImpl

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * This is used to create instances for testing purposes.
	 * 
	 * @param s
	 *            the number of susceptible population members
	 * @param e
	 *            the number of exposed population members
	 * @param iR
	 *            the number of recovering infectious population members
	 * @param iF
	 *            the number of fatally infectious population members
	 * 
	 * @param r
	 *            the number of recovered population members
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
	public SEIRLabelValueImpl(final double s, final double e, final double i,
			final double r, final double diseaseDeaths) {
		super(s, i, 0.0, r, diseaseDeaths);
		this.setE(e);
	} // SEIRLabelValueImpl

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.SEIR_LABEL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @return
	 * 
	 *         <!-- end-user-doc -->
	 * @generated
	 */
	public double getE() {
		return e;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param newE
	 * 
	 *            <!-- end-user-doc -->
	 * @generated
	 */
	public void setE(double newE) {
		e = newE;
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
			case StandardPackage.SEIR_LABEL_VALUE__E:
				return getE();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param featureID
	 * @param newValue
	 * 
	 *            <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("boxing")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StandardPackage.SEIR_LABEL_VALUE__E:
				setE((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param featureID
	 * 
	 *            <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StandardPackage.SEIR_LABEL_VALUE__E:
				setE(E_EDEFAULT);
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
			case StandardPackage.SEIR_LABEL_VALUE__E:
				return e != E_EDEFAULT;
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
		result.append(" (e: "); //$NON-NLS-1$
		result.append(e);
		result.append(')');
		return result.toString();
	}

	@Override
	public IntegrationLabelValue set(IntegrationLabelValue value) {
		SEIRLabelValue v = (SEIRLabelValue) value;

		super.set(value);
		setE(v.getE());

		return this;
	}

	@Override
	public IntegrationLabelValue add(IntegrationLabelValue value) {
		SEIRLabelValue v = (SEIRLabelValue) value;

		super.add(value);
		setE(getE() + v.getE());

		return this;
	}

	@Override
	public IntegrationLabelValue sub(IntegrationLabelValue value) {
		SEIRLabelValue v = (SEIRLabelValue) value;

		super.sub(value);
		setE(getE() - v.getE());

		return this;
	}

	@Override
	public IntegrationLabelValue scale(double scaleFactor) {
		super.scale(scaleFactor);
		setE(scaleFactor * getE());

		return this;
	}

	@Override
	public IntegrationLabelValue add(double addition) {
		super.add(addition);
		setE(getE() + addition);

		return this;
	}

	@Override
	public IntegrationLabelValue abs() {
		super.abs();
		setE(Math.abs(getE()));

		return this;
	}

	@Override
	public boolean avoidNegative(IntegrationLabelValue value) {
		SEIRLabelValue v = (SEIRLabelValue) value;
		boolean adjusted = super.avoidNegative(value);

		if (getE() + v.getE() < 0.0) {
			setE(-v.getE());
		}

		return adjusted;
	}

	@Override
	public double computeDeltaAdjustment(IntegrationLabelValue value) {
		SEIRLabelValue v = (SEIRLabelValue) value;
		double factor = super.computeDeltaAdjustment(value);

		if (getE() + v.getE() < 0.0) {
			factor = Math.min(factor, -v.getE() / getE());
		}

		return factor;
	}

	@Override
	public IntegrationLabelValue divide(IntegrationLabelValue value) {
		SEIRLabelValue v = (SEIRLabelValue) value;

		super.divide(value);
		setE(getE() / v.getE());

		return this;
	}

	@Override
	public double max() {
		double max = super.max();

		max = Math.max(max, getE());

		return max;
	}

	@Override
	public IntegrationLabelValue copy() {
		IntegrationLabelValue ilv = StandardFactory.eINSTANCE.createSEIRLabelValue();
		ilv.set(this);
		return ilv;
	}
	/**
	 * Use this for enhanced performance (no boxing) instead of eSet
	 */
	
	@Override
	public void eSetDouble(int featureId, double newValue) {
		switch (featureId) {
			case StandardPackage.SEIR_LABEL_VALUE__E:
				setE(newValue);
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
			case StandardPackage.SEIR_LABEL_VALUE__E:
				return getE();
		}
		return super.eGetDouble(featureId);
	}
	
	@Override
	public void reset() {
		super.reset();
		setE(0.0);
	}

	@Override
	public boolean sameValue(LabelValue otherLabelValue) {
		SEIRLabelValue v = (SEIRLabelValue) otherLabelValue;

		if (!super.sameValue(otherLabelValue)) {
			return false;
		}
		
		if (getE() != v.getE()) {
			return false;
		}

		return true;
	}
	
	@Override
	public double getPopulationCount() {
		return super.getPopulationCount() + getE();
	}
	
} // SEIRLabelValueImpl
