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
import org.eclipse.stem.core.graph.ExchangePool;
import org.eclipse.stem.core.graph.IntegrationLabelValue;
import org.eclipse.stem.core.graph.LabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Disease Model Label Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelLabelValueImpl#getS <em>S</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelLabelValueImpl#getIncidence <em>Incidence</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelLabelValueImpl#getDiseaseDeaths <em>Disease Deaths</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StandardDiseaseModelLabelValueImpl extends
		DiseaseModelLabelValueImpl implements StandardDiseaseModelLabelValue {
	
	/**
	 * The default value of the '{@link #getS() <em>S</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getS()
	 * @generated
	 * @ordered
	 */
	protected static final double S_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getS() <em>S</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getS()
	 * @generated
	 * @ordered
	 */
	protected double s = S_EDEFAULT;

	
	/**
	 * The default value of the '{@link #getIncidence() <em>Incidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence()
	 * @generated
	 * @ordered
	 */
	protected static final double INCIDENCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIncidence() <em>Incidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence()
	 * @generated
	 * @ordered
	 */
	protected double incidence = INCIDENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiseaseDeaths() <em>Disease Deaths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseDeaths()
	 * @generated
	 * @ordered
	 */
	protected static final double DISEASE_DEATHS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiseaseDeaths() <em>Disease Deaths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseDeaths()
	 * @generated
	 * @ordered
	 */
	protected double diseaseDeaths = DISEASE_DEATHS_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public StandardDiseaseModelLabelValueImpl() {
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
	public StandardDiseaseModelLabelValueImpl(final double s, final double incidence, final double diseaseDeaths) {
		super();
		this.setS(s);
		this.setIncidence(incidence);
		this.setDiseaseDeaths(diseaseDeaths);
	} // StandardDiseaseModelLabelValueImpl

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.STANDARD_DISEASE_MODEL_LABEL_VALUE;
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @return
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getS() {
		return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param newS
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setS(double newS) {
		s = newS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIncidence() {
		return incidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncidence(double newIncidence) {
		incidence = newIncidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDiseaseDeaths() {
		return diseaseDeaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiseaseDeaths(double newDiseaseDeaths) {
		diseaseDeaths = newDiseaseDeaths;
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
			case StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__S:
				return getS();
			case StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__INCIDENCE:
				return getIncidence();
			case StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__DISEASE_DEATHS:
				return getDiseaseDeaths();
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
			case StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__S:
				setS((Double)newValue);
				return;
			case StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__INCIDENCE:
				setIncidence((Double)newValue);
				return;
			case StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__DISEASE_DEATHS:
				setDiseaseDeaths((Double)newValue);
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
			case StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__S:
				setS(S_EDEFAULT);
				return;
			case StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__INCIDENCE:
				setIncidence(INCIDENCE_EDEFAULT);
				return;
			case StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__DISEASE_DEATHS:
				setDiseaseDeaths(DISEASE_DEATHS_EDEFAULT);
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
			case StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__S:
				return s != S_EDEFAULT;
			case StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__INCIDENCE:
				return incidence != INCIDENCE_EDEFAULT;
			case StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__DISEASE_DEATHS:
				return diseaseDeaths != DISEASE_DEATHS_EDEFAULT;
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
		result.append(" (s: "); //$NON-NLS-1$
		result.append(s);
		result.append(", incidence: "); //$NON-NLS-1$
		result.append(incidence);
		result.append(", diseaseDeaths: "); //$NON-NLS-1$
		result.append(diseaseDeaths);
		result.append(')');
		return result.toString();
	}

	@Override
	public IntegrationLabelValue set(IntegrationLabelValue value) {
		StandardDiseaseModelLabelValue v = (StandardDiseaseModelLabelValue) value;
		
		setS(v.getS());
		setIncidence(v.getIncidence());
		setDiseaseDeaths(v.getDiseaseDeaths());
		
		return this;
	}

	@Override
	public IntegrationLabelValue add(IntegrationLabelValue value) {
		StandardDiseaseModelLabelValue v = (StandardDiseaseModelLabelValue) value;
		
		setS(getS() + v.getS());
		setIncidence(getIncidence() + v.getIncidence());
		setDiseaseDeaths(getDiseaseDeaths() + v.getDiseaseDeaths());
		
		return this;
	}

	@Override
	public IntegrationLabelValue sub(IntegrationLabelValue value) {
		StandardDiseaseModelLabelValue v = (StandardDiseaseModelLabelValue) value;
		
		setS(getS() - v.getS());
		setIncidence(getIncidence() - v.getIncidence());
		setDiseaseDeaths(getDiseaseDeaths() - v.getDiseaseDeaths());
		
		return this;
	}

	@Override
	public IntegrationLabelValue scale(double scaleFactor) {
		setS(scaleFactor * getS());
		setIncidence(scaleFactor * getIncidence());
		setDiseaseDeaths(scaleFactor * getDiseaseDeaths());
		
		return this;
	}

	@Override
	public IntegrationLabelValue add(double addition) {
		setS(getS() + addition);
		setDiseaseDeaths(getDiseaseDeaths() + addition);
		setIncidence(getIncidence() + addition);
		return this;
	}

	@Override
	public IntegrationLabelValue abs() {
		setS(Math.abs(getS()));
		setDiseaseDeaths(Math.abs(getDiseaseDeaths()));
		setIncidence(Math.abs(getIncidence()));
		return this;
	}

	@Override
	public boolean avoidNegative(IntegrationLabelValue value) {
		StandardDiseaseModelLabelValue v = (StandardDiseaseModelLabelValue) value;
		boolean adjusted = false;
		
		if (getS() + v.getS() < 0.0) {
			setS(-v.getS());
			adjusted = true;
		}
		
		if (getIncidence() + v.getIncidence() < 0.0) {
			setIncidence(-v.getIncidence());
			adjusted = true;
		}
		
		if (getDiseaseDeaths() + v.getDiseaseDeaths() < 0.0) {
			setDiseaseDeaths(-v.getDiseaseDeaths());
			adjusted = true;
		}
		
		return adjusted;
	}

	@Override
	public double computeDeltaAdjustment(IntegrationLabelValue value) {
		StandardDiseaseModelLabelValue v = (StandardDiseaseModelLabelValue) value;
		double factor = 1.0;

		if (getS() + v.getS() < 0.0) {
			factor = Math.min(factor, -v.getS() / getS());
		}
		if (getIncidence() + v.getIncidence() < 0.0) {
			factor = Math.min(factor, -v.getIncidence() / getIncidence());
		}
		if (getDiseaseDeaths() + v.getDiseaseDeaths() < 0.0) {
			factor = Math.min(factor, -v.getDiseaseDeaths()
					/ getDiseaseDeaths());
		}
		
		return factor;
	}

	@Override
	public IntegrationLabelValue divide(IntegrationLabelValue value) {
		StandardDiseaseModelLabelValue v = (StandardDiseaseModelLabelValue) value;
		
		setS(getS() / v.getS());
		setDiseaseDeaths(getDiseaseDeaths() / v.getDiseaseDeaths());
		setIncidence(getIncidence() / v.getIncidence());
		return this;
	}

	@Override
	public double max() {
		double max = 0.0;

		max = Math.max(max, getS());
		max = Math.max(max, getDiseaseDeaths());
		//max = Math.max(max, getIncidence()); Breaks integration tests. TODO. Investigate
		return max;
	}

	/**
	 * Use this for enhanced performance (no boxing) instead of eSet
	 */
	
	@Override
	public void eSetDouble(int featureId, double newValue) {
		switch (featureId) {
			case StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__S:
				setS(newValue);
				return;
			case StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__INCIDENCE:
				setIncidence(newValue);
				return;
			case StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__DISEASE_DEATHS:
				setDiseaseDeaths(newValue);
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
			case StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__S:
				return getS();
			case StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__INCIDENCE:
				return getIncidence();
			case StandardPackage.STANDARD_DISEASE_MODEL_LABEL_VALUE__DISEASE_DEATHS:
				return getDiseaseDeaths();
		}
		return super.eGetDouble(featureId);
	}
	
	@Override
	public void prepareCycle() {
		setIncidence(0.0);
	}

	@Override
	public void reset() {
		setS(0.0);
		setIncidence(0.0);
		setDiseaseDeaths(0.0);
		
		while(getArrivals().size()>0) ExchangePool.POOL.release(getArrivals().remove(0));
		while(getDepartures().size()>0) ExchangePool.POOL.release(getDepartures().remove(0));
	}

	@Override
	public boolean sameValue(LabelValue otherLabelValue) {
		StandardDiseaseModelLabelValue v = (StandardDiseaseModelLabelValue) otherLabelValue;

		if (getS() != v.getS()) {
			return false;
		}
		
		if (getIncidence() != v.getIncidence()) {
			return false;
		}
		
		if (getDiseaseDeaths() != v.getDiseaseDeaths()) {
			return false;
		}
		
		return true;
	}

	public double getPopulationCount() {
		return getS();
	}

} // StandardDiseaseModelLabelValueImpl
