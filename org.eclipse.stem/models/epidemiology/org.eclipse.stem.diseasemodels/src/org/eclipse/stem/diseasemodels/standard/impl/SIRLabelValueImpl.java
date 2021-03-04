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
import org.eclipse.stem.diseasemodels.standard.SIRLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardFactory;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>SIR Label Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.impl.SIRLabelValueImpl#getR <em>R</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SIRLabelValueImpl extends SILabelValueImpl implements
		SIRLabelValue {
	/**
	 * The default value of the '{@link #getR() <em>R</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected static final double R_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getR() <em>R</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected double r = R_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SIRLabelValueImpl() {
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
	 *            the new incidence from the interaction term in the compartment model
	 * 
	 * @param r
	 *            the number of recovered population members
	 * @param births
	 *            the number of births that have occured in the population
	 * @param deaths
	 *            the total number of deaths that have occured in the population
	 * @param diseaseDeaths
	 *            the number of deaths due to the disease that have occured in
	 *            the population
	 * 
	 * <!-- end-user-doc -->
	 */
	public SIRLabelValueImpl(final double s, final double i, 
			final double incidence, final double r,
			final double diseaseDeaths) {
		super(s, i, incidence, diseaseDeaths);
		this.setR(r);
	} // SIRLabelValueImpl


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
	 * @param r
	 *            the number of recovered population members
	 * @param births
	 *            the number of births that have occured in the population
	 * @param deaths
	 *            the total number of deaths that have occured in the population
	 * @param diseaseDeaths
	 *            the number of deaths due to the disease that have occured in
	 *            the population
	 * 
	 * <!-- end-user-doc -->
	 */
	public SIRLabelValueImpl(final double s, final double i, 
			final double r,  final double diseaseDeaths) {
		super(s, i, 0.0, diseaseDeaths);
		this.setR(r);
	} // SIRLabelValueImpl

	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.SIR_LABEL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @return the number of Infectious population members.
	 * 
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getR() {
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param newR
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR(double newR) {
		r = newR;
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
	@SuppressWarnings("boxing")
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StandardPackage.SIR_LABEL_VALUE__R:
				return getR();
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
	@SuppressWarnings("boxing")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StandardPackage.SIR_LABEL_VALUE__R:
				setR((Double)newValue);
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
			case StandardPackage.SIR_LABEL_VALUE__R:
				setR(R_EDEFAULT);
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
			case StandardPackage.SIR_LABEL_VALUE__R:
				return r != R_EDEFAULT;
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
		result.append(" (r: "); //$NON-NLS-1$
		result.append(r);
		result.append(')');
		return result.toString();
	}

	@Override
	public IntegrationLabelValue set(IntegrationLabelValue value) {
		SIRLabelValue v = (SIRLabelValue) value;

		super.set(value);
		setR(v.getR());

		return this;
	}

	@Override
	public IntegrationLabelValue add(IntegrationLabelValue value) {
		SIRLabelValue v = (SIRLabelValue) value;

		super.add(value);
		setR(getR() + v.getR());

		return this;
	}

	@Override
	public IntegrationLabelValue sub(IntegrationLabelValue value) {
		SIRLabelValue v = (SIRLabelValue) value;

		super.sub(value);
		setR(getR() - v.getR());

		return this;
	}

	@Override
	public IntegrationLabelValue scale(double scaleFactor) {
		super.scale(scaleFactor);
		setR(scaleFactor * getR());

		return this;
	}

	@Override
	public IntegrationLabelValue add(double addition) {
		super.add(addition);
		setR(getR() + addition);

		return this;
	}

	@Override
	public IntegrationLabelValue abs() {
		super.abs();
		setR(Math.abs(getR()));

		return this;
	}

	@Override
	public boolean avoidNegative(IntegrationLabelValue value) {
		SIRLabelValue v = (SIRLabelValue) value;
		boolean adjusted = super.avoidNegative(value);

		if (getR() + v.getR() < 0.0) {
			setR(-v.getR());
		}

		return adjusted;
	}

	@Override
	public double computeDeltaAdjustment(IntegrationLabelValue value) {
		SIRLabelValue v = (SIRLabelValue) value;
		double factor = super.computeDeltaAdjustment(value);

		if (getR() + v.getR() < 0.0) {
			factor = Math.min(factor, -v.getR() / getR());
		}

		return factor;
	}

	@Override
	public IntegrationLabelValue divide(IntegrationLabelValue value) {
		SIRLabelValue v = (SIRLabelValue) value;

		super.divide(value);
		setR(getR() / v.getR());

		return this;
	}

	@Override
	public double max() {
		double max = super.max();

		max = Math.max(max, getR());

		return max;
	}

	@Override
	public void reset() {
		super.reset();
		setR(0.0);
	}

	@Override
	public boolean sameValue(LabelValue otherLabelValue) {
		SIRLabelValue v = (SIRLabelValue) otherLabelValue;

		if (!super.sameValue(otherLabelValue)) {
			return false;
		}
		
		if (getR() != v.getR()) {
			return false;
		}

		return true;
	}
	
	@Override
	public double getPopulationCount() {
		return super.getPopulationCount() + getR();
	}
	
	@Override
	public IntegrationLabelValue copy() {
		IntegrationLabelValue ilv = StandardFactory.eINSTANCE.createSIRLabelValue();
		ilv.set(this);
		return ilv;
	}
	
	/**
	 * Use this for enhanced performance (no boxing) instead of eSet
	 */
	
	@Override
	public void eSetDouble(int featureId, double newValue) {
		switch (featureId) {
			case StandardPackage.SIR_LABEL_VALUE__R:
				setR(newValue);
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
			case StandardPackage.SIR_LABEL_VALUE__R:
				return getR();
		}
		return super.eGetDouble(featureId);
	}
} // SIRLabelValueImpl
