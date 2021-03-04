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
package org.eclipse.stem.diseasemodels.poliodiseasemodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.core.graph.ExchangePool;
import org.eclipse.stem.core.graph.IntegrationLabelValue;
import org.eclipse.stem.core.graph.LabelValue;
import org.eclipse.stem.diseasemodels.poliodiseasemodel.OpvLabelValue;
import org.eclipse.stem.diseasemodels.poliodiseasemodel.PolioFactory;
import org.eclipse.stem.diseasemodels.poliodiseasemodel.PolioPackage;
import org.eclipse.stem.diseasemodels.standard.impl.SEIRLabelValueImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opv Label Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.impl.OpvLabelValueImpl#getSv <em>Sv</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.impl.OpvLabelValueImpl#getEv <em>Ev</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.impl.OpvLabelValueImpl#getV <em>V</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.impl.OpvLabelValueImpl#getPv <em>Pv</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.impl.OpvLabelValueImpl#getPw <em>Pw</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpvLabelValueImpl extends SEIRLabelValueImpl implements OpvLabelValue {
	/**
	 * The default value of the '{@link #getSv() <em>Sv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSv()
	 * @generated
	 * @ordered
	 */
	protected static final double SV_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSv() <em>Sv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSv()
	 * @generated
	 * @ordered
	 */
	protected double sv = SV_EDEFAULT;

	/**
	 * The default value of the '{@link #getEv() <em>Ev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEv()
	 * @generated
	 * @ordered
	 */
	protected static final double EV_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEv() <em>Ev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEv()
	 * @generated
	 * @ordered
	 */
	protected double ev = EV_EDEFAULT;

	/**
	 * The default value of the '{@link #getV() <em>V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV()
	 * @generated
	 * @ordered
	 */
	protected static final double V_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getV() <em>V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV()
	 * @generated
	 * @ordered
	 */
	protected double v = V_EDEFAULT;

	/**
	 * The default value of the '{@link #getPv() <em>Pv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPv()
	 * @generated
	 * @ordered
	 */
	protected static final double PV_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPv() <em>Pv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPv()
	 * @generated
	 * @ordered
	 */
	protected double pv = PV_EDEFAULT;

	/**
	 * The default value of the '{@link #getPw() <em>Pw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPw()
	 * @generated
	 * @ordered
	 */
	protected static final double PW_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPw() <em>Pw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPw()
	 * @generated
	 * @ordered
	 */
	protected double pw = PW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpvLabelValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolioPackage.Literals.OPV_LABEL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSv() {
		return sv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSv(double newSv) {
		sv = newSv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEv() {
		return ev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEv(double newEv) {
		ev = newEv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getV() {
		return v;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setV(double newV) {
		v = newV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPv() {
		return pv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPv(double newPv) {
		pv = newPv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPw() {
		return pw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPw(double newPw) {
		pw = newPw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PolioPackage.OPV_LABEL_VALUE__SV:
				return getSv();
			case PolioPackage.OPV_LABEL_VALUE__EV:
				return getEv();
			case PolioPackage.OPV_LABEL_VALUE__V:
				return getV();
			case PolioPackage.OPV_LABEL_VALUE__PV:
				return getPv();
			case PolioPackage.OPV_LABEL_VALUE__PW:
				return getPw();
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
			case PolioPackage.OPV_LABEL_VALUE__SV:
				setSv((Double)newValue);
				return;
			case PolioPackage.OPV_LABEL_VALUE__EV:
				setEv((Double)newValue);
				return;
			case PolioPackage.OPV_LABEL_VALUE__V:
				setV((Double)newValue);
				return;
			case PolioPackage.OPV_LABEL_VALUE__PV:
				setPv((Double)newValue);
				return;
			case PolioPackage.OPV_LABEL_VALUE__PW:
				setPw((Double)newValue);
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
			case PolioPackage.OPV_LABEL_VALUE__SV:
				setSv(SV_EDEFAULT);
				return;
			case PolioPackage.OPV_LABEL_VALUE__EV:
				setEv(EV_EDEFAULT);
				return;
			case PolioPackage.OPV_LABEL_VALUE__V:
				setV(V_EDEFAULT);
				return;
			case PolioPackage.OPV_LABEL_VALUE__PV:
				setPv(PV_EDEFAULT);
				return;
			case PolioPackage.OPV_LABEL_VALUE__PW:
				setPw(PW_EDEFAULT);
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
			case PolioPackage.OPV_LABEL_VALUE__SV:
				return sv != SV_EDEFAULT;
			case PolioPackage.OPV_LABEL_VALUE__EV:
				return ev != EV_EDEFAULT;
			case PolioPackage.OPV_LABEL_VALUE__V:
				return v != V_EDEFAULT;
			case PolioPackage.OPV_LABEL_VALUE__PV:
				return pv != PV_EDEFAULT;
			case PolioPackage.OPV_LABEL_VALUE__PW:
				return pw != PW_EDEFAULT;
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
		result.append(" (sv: "); //$NON-NLS-1$
		result.append(sv);
		result.append(", ev: "); //$NON-NLS-1$
		result.append(ev);
		result.append(", v: "); //$NON-NLS-1$
		result.append(v);
		result.append(", pv: "); //$NON-NLS-1$
		result.append(pv);
		result.append(", pw: "); //$NON-NLS-1$
		result.append(pw);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public IntegrationLabelValue set(IntegrationLabelValue value) {
		OpvLabelValue v = (OpvLabelValue) value;

		super.set(value);

		setSv(v.getSv());
		setEv(v.getEv());
		setV(v.getV());
		setPv(v.getPv());
		setPw(v.getPw());
		
		return this;
	}

	@Override
	public IntegrationLabelValue add(IntegrationLabelValue value) {
		OpvLabelValue v = (OpvLabelValue) value;

		super.add(value);

		setSv(getSv() + v.getSv());
		setEv(getEv() + v.getEv());
		setV(getV() + v.getV());
		setPv(getPv() + v.getPv());
		setPw(getPw() + v.getPw());
		
		return this;
	}

	@Override
	public IntegrationLabelValue sub(IntegrationLabelValue value) {
		OpvLabelValue v = (OpvLabelValue) value;

		super.sub(value);

		setSv(getSv() - v.getSv());
		setEv(getEv() - v.getEv());
		setV(getV() - v.getV());
		setPv(getPv() - v.getPv());
		setPw(getPw() - v.getPw());
		
		return this;
	}

	@Override
	public IntegrationLabelValue scale(double scaleFactor) {
		super.scale(scaleFactor);

		setSv(scaleFactor * getSv());
		setEv(scaleFactor * getEv());
		setV(scaleFactor * getV());
		setPv(scaleFactor * getPv());
		setPw(scaleFactor * getPw());
		
		return this;
	}
	
	@Override
	public boolean avoidNegative(IntegrationLabelValue value) {
		OpvLabelValue v = (OpvLabelValue) value;
		boolean adjusted = super.avoidNegative(value);

		if (getSv() + v.getSv() < 0.0) {
			setSv(-v.getSv());
			adjusted = true;
		}
		if (getEv() + v.getEv() < 0.0) {
			setEv(-v.getEv());
			adjusted = true;
		}
		if (getV() + v.getV() < 0.0) {
			setV(-v.getV());
			adjusted = true;
		}
		if (getPv() + v.getPv() < 0.0) {
			setPv(-v.getPv());
			adjusted = true;
		}

		if (getPw() + v.getPw() < 0.0) {
			setPw(-v.getPw());
			adjusted = true;
		}
		
		return adjusted;
	}

	@Override
	public double computeDeltaAdjustment(IntegrationLabelValue value) {
		OpvLabelValue v = (OpvLabelValue) value;
		double factor = super.computeDeltaAdjustment(value);

		if (getSv() + v.getSv() < 0.0) {
			factor = Math.min(factor, -v.getSv() / getSv());
		}
		if (getEv() + v.getEv() < 0.0) {
			factor = Math.min(factor, -v.getEv() / getEv());
		}
		if (getV() + v.getV() < 0.0) {
			factor = Math.min(factor, -v.getV() / getV());
		}
		if (getPv() + v.getPv() < 0.0) {
			factor = Math.min(factor, -v.getPv() / getPv());
		}

		if (getPw() + v.getPw() < 0.0) {
			factor = Math.min(factor, -v.getPw() / getPw());
		}
		
		return factor;
	}


	@Override
	public void reset() {
		super.reset();

		setSv(0.0);
		setEv(0.0);
		setV(0.0);
		setPv(0.0);
		setPw(0.0);
		
		while(getArrivals().size()>0) ExchangePool.POOL.release(getArrivals().remove(0));
		while(getDepartures().size()>0) ExchangePool.POOL.release(getDepartures().remove(0));
	}

	@Override
	public double getPopulationCount() {
		double count = super.getPopulationCount();
		
		count += getSv();
		count += getEv();
		count += getV();
		count += getPv();
		count += getPw();
				
		return count;
	}
	
	@Override
	public IntegrationLabelValue add(double addition) {
		super.add(addition);

		setSv(getSv() + addition);
		setEv(getEv() + addition);
		setV(getV() + addition);
		setPv(getPv() + addition);
		setPw(getPw() + addition);
		
		return this;
	}

	@Override
	public IntegrationLabelValue abs() {
		super.abs();

		setSv(Math.abs(getSv()));
		setEv(Math.abs(getEv()));
		setV(Math.abs(getV()));
		setPv(Math.abs(getPv()));
		setPw(Math.abs(getPw()));
		
		return this;
	}

	@Override
	public IntegrationLabelValue divide(IntegrationLabelValue value) {
		OpvLabelValue v = (OpvLabelValue) value;

		super.divide(value);

		setSv(getSv() / v.getSv());
		setEv(getEv() / v.getEv());
		setV(getV() / v.getV());
		setV(getPv() / v.getPv());
		setPw(getPw() / v.getPw());
		
		return this;
	}

	@Override
	public double max() {
		double max = super.max();

		max = Math.max(max, getSv());
		max = Math.max(max, getEv());
		max = Math.max(max, getV());
		max = Math.max(max, getPv());
		max = Math.max(max, getPw());
		
		return max;
	}

	@Override
	public boolean sameValue(LabelValue otherLabelValue) {
		OpvLabelValue v = (OpvLabelValue) otherLabelValue;

		if (!super.sameValue(otherLabelValue)){
			return false;
		}

		if (getSv() != v.getSv()) {
			return false;
		}
		if (getEv() != v.getEv()) {
			return false;
		}
		if (getV() != v.getV()) {
			return false;
		}
		if (getPv() != v.getPv()) {
			return false;
		}
		if (getPw() != v.getPw()) {
			return false;
		}
		
		return true;
	}

	@Override
	public IntegrationLabelValue copy() {
		IntegrationLabelValue ilv = PolioFactory.eINSTANCE.createOpvLabelValue();
		ilv.set(this);
		return ilv;
	}
	/**
	 * Use this for enhanced performance (no boxing) instead of eSet
	 */
	@Override
	public void eSetDouble(int featureId, double newValue) {
		switch (featureId) {
			case PolioPackage.OPV_LABEL_VALUE__SV:
				setSv(newValue);
				return;
			case PolioPackage.OPV_LABEL_VALUE__EV:
				setEv(newValue);
				return;
			case PolioPackage.OPV_LABEL_VALUE__V:
				setV(newValue);
				return;
			case PolioPackage.OPV_LABEL_VALUE__PV:
				setPv(newValue);
				return;
			case PolioPackage.OPV_LABEL_VALUE__PW:
				setPw(newValue);
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
		case PolioPackage.OPV_LABEL_VALUE__SV:
			return getSv();
		case PolioPackage.OPV_LABEL_VALUE__EV:
			return getEv();
		case PolioPackage.OPV_LABEL_VALUE__V:
			return getV();
		case PolioPackage.OPV_LABEL_VALUE__PV:
			return getPv();
		case PolioPackage.OPV_LABEL_VALUE__PW:
			return getPw();
		}
		return super.eGetDouble(featureId);
	}
	
} //OpvLabelValueImpl


