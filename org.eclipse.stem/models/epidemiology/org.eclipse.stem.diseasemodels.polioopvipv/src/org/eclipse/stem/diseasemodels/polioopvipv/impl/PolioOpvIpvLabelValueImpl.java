/**
 * <copyright>
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
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.stem.diseasemodels.polioopvipv.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.core.graph.IntegrationLabelValue;
import org.eclipse.stem.core.graph.LabelValue;
import org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvFactory;
import org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue;
import org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage;
import org.eclipse.stem.diseasemodels.standard.impl.SEIRLabelValueImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvLabelValueImpl#getSopv <em>Sopv</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvLabelValueImpl#getEopv <em>Eopv</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvLabelValueImpl#getVopv <em>Vopv</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvLabelValueImpl#getPopv <em>Popv</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvLabelValueImpl#getPw <em>Pw</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvLabelValueImpl#getSipv <em>Sipv</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvLabelValueImpl#getEipv_w <em>Eipv w</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvLabelValueImpl#getCipv_w <em>Cipv w</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvLabelValueImpl#getEipv_opv <em>Eipv opv</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvLabelValueImpl#getCipv_opv <em>Cipv opv</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvLabelValueImpl#getIncidence_opv <em>Incidence opv</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvLabelValueImpl#getIncidence_ipv_w <em>Incidence ipv w</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.impl.PolioOpvIpvLabelValueImpl#getIncidence_ipv_opv <em>Incidence ipv opv</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolioOpvIpvLabelValueImpl extends SEIRLabelValueImpl implements PolioOpvIpvLabelValue {
	/**
	 * The default value of the '{@link #getSopv() <em>Sopv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSopv()
	 * @generated
	 * @ordered
	 */
	protected static final double SOPV_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSopv() <em>Sopv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSopv()
	 * @generated
	 * @ordered
	 */
	protected double sopv = SOPV_EDEFAULT;

	/**
	 * The default value of the '{@link #getEopv() <em>Eopv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEopv()
	 * @generated
	 * @ordered
	 */
	protected static final double EOPV_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEopv() <em>Eopv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEopv()
	 * @generated
	 * @ordered
	 */
	protected double eopv = EOPV_EDEFAULT;

	/**
	 * The default value of the '{@link #getVopv() <em>Vopv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVopv()
	 * @generated
	 * @ordered
	 */
	protected static final double VOPV_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVopv() <em>Vopv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVopv()
	 * @generated
	 * @ordered
	 */
	protected double vopv = VOPV_EDEFAULT;

	/**
	 * The default value of the '{@link #getPopv() <em>Popv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopv()
	 * @generated
	 * @ordered
	 */
	protected static final double POPV_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPopv() <em>Popv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopv()
	 * @generated
	 * @ordered
	 */
	protected double popv = POPV_EDEFAULT;

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
	 * The default value of the '{@link #getSipv() <em>Sipv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSipv()
	 * @generated
	 * @ordered
	 */
	protected static final double SIPV_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSipv() <em>Sipv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSipv()
	 * @generated
	 * @ordered
	 */
	protected double sipv = SIPV_EDEFAULT;

	/**
	 * The default value of the '{@link #getEipv_w() <em>Eipv w</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEipv_w()
	 * @generated
	 * @ordered
	 */
	protected static final double EIPV_W_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEipv_w() <em>Eipv w</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEipv_w()
	 * @generated
	 * @ordered
	 */
	protected double eipv_w = EIPV_W_EDEFAULT;

	/**
	 * The default value of the '{@link #getCipv_w() <em>Cipv w</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCipv_w()
	 * @generated
	 * @ordered
	 */
	protected static final double CIPV_W_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCipv_w() <em>Cipv w</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCipv_w()
	 * @generated
	 * @ordered
	 */
	protected double cipv_w = CIPV_W_EDEFAULT;

	/**
	 * The default value of the '{@link #getEipv_opv() <em>Eipv opv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEipv_opv()
	 * @generated
	 * @ordered
	 */
	protected static final double EIPV_OPV_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEipv_opv() <em>Eipv opv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEipv_opv()
	 * @generated
	 * @ordered
	 */
	protected double eipv_opv = EIPV_OPV_EDEFAULT;

	/**
	 * The default value of the '{@link #getCipv_opv() <em>Cipv opv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCipv_opv()
	 * @generated
	 * @ordered
	 */
	protected static final double CIPV_OPV_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCipv_opv() <em>Cipv opv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCipv_opv()
	 * @generated
	 * @ordered
	 */
	protected double cipv_opv = CIPV_OPV_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncidence_opv() <em>Incidence opv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence_opv()
	 * @generated
	 * @ordered
	 */
	protected static final double INCIDENCE_OPV_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIncidence_opv() <em>Incidence opv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence_opv()
	 * @generated
	 * @ordered
	 */
	protected double incidence_opv = INCIDENCE_OPV_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncidence_ipv_w() <em>Incidence ipv w</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence_ipv_w()
	 * @generated
	 * @ordered
	 */
	protected static final double INCIDENCE_IPV_W_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIncidence_ipv_w() <em>Incidence ipv w</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence_ipv_w()
	 * @generated
	 * @ordered
	 */
	protected double incidence_ipv_w = INCIDENCE_IPV_W_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncidence_ipv_opv() <em>Incidence ipv opv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence_ipv_opv()
	 * @generated
	 * @ordered
	 */
	protected static final double INCIDENCE_IPV_OPV_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIncidence_ipv_opv() <em>Incidence ipv opv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence_ipv_opv()
	 * @generated
	 * @ordered
	 */
	protected double incidence_ipv_opv = INCIDENCE_IPV_OPV_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolioOpvIpvLabelValueImpl() {
		super();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_LABEL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSopv() {
		return sopv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSopv(double newSopv) {
		sopv = newSopv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEopv() {
		return eopv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEopv(double newEopv) {
		eopv = newEopv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVopv() {
		return vopv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVopv(double newVopv) {
		vopv = newVopv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPopv() {
		return popv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopv(double newPopv) {
		popv = newPopv;
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
	public double getSipv() {
		return sipv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSipv(double newSipv) {
		sipv = newSipv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEipv_w() {
		return eipv_w;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEipv_w(double newEipv_w) {
		eipv_w = newEipv_w;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCipv_w() {
		return cipv_w;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCipv_w(double newCipv_w) {
		cipv_w = newCipv_w;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEipv_opv() {
		return eipv_opv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEipv_opv(double newEipv_opv) {
		eipv_opv = newEipv_opv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCipv_opv() {
		return cipv_opv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCipv_opv(double newCipv_opv) {
		cipv_opv = newCipv_opv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIncidence_opv() {
		return incidence_opv;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncidence_opv(double newIncidence_opv) {
		incidence_opv = newIncidence_opv;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIncidence_ipv_w() {
		return incidence_ipv_w;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncidence_ipv_w(double newIncidence_ipv_w) {
		incidence_ipv_w = newIncidence_ipv_w;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIncidence_ipv_opv() {
		return incidence_ipv_opv;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncidence_ipv_opv(double newIncidence_ipv_opv) {
		incidence_ipv_opv = newIncidence_ipv_opv;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__SOPV:
				return getSopv();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__EOPV:
				return getEopv();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__VOPV:
				return getVopv();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__POPV:
				return getPopv();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__PW:
				return getPw();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__SIPV:
				return getSipv();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__EIPV_W:
				return getEipv_w();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__CIPV_W:
				return getCipv_w();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__EIPV_OPV:
				return getEipv_opv();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__CIPV_OPV:
				return getCipv_opv();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__INCIDENCE_OPV:
				return getIncidence_opv();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__INCIDENCE_IPV_W:
				return getIncidence_ipv_w();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__INCIDENCE_IPV_OPV:
				return getIncidence_ipv_opv();
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
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__SOPV:
				setSopv((Double)newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__EOPV:
				setEopv((Double)newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__VOPV:
				setVopv((Double)newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__POPV:
				setPopv((Double)newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__PW:
				setPw((Double)newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__SIPV:
				setSipv((Double)newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__EIPV_W:
				setEipv_w((Double)newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__CIPV_W:
				setCipv_w((Double)newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__EIPV_OPV:
				setEipv_opv((Double)newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__CIPV_OPV:
				setCipv_opv((Double)newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__INCIDENCE_OPV:
				setIncidence_opv((Double)newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__INCIDENCE_IPV_W:
				setIncidence_ipv_w((Double)newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__INCIDENCE_IPV_OPV:
				setIncidence_ipv_opv((Double)newValue);
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
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__SOPV:
				setSopv(SOPV_EDEFAULT);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__EOPV:
				setEopv(EOPV_EDEFAULT);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__VOPV:
				setVopv(VOPV_EDEFAULT);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__POPV:
				setPopv(POPV_EDEFAULT);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__PW:
				setPw(PW_EDEFAULT);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__SIPV:
				setSipv(SIPV_EDEFAULT);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__EIPV_W:
				setEipv_w(EIPV_W_EDEFAULT);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__CIPV_W:
				setCipv_w(CIPV_W_EDEFAULT);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__EIPV_OPV:
				setEipv_opv(EIPV_OPV_EDEFAULT);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__CIPV_OPV:
				setCipv_opv(CIPV_OPV_EDEFAULT);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__INCIDENCE_OPV:
				setIncidence_opv(INCIDENCE_OPV_EDEFAULT);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__INCIDENCE_IPV_W:
				setIncidence_ipv_w(INCIDENCE_IPV_W_EDEFAULT);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__INCIDENCE_IPV_OPV:
				setIncidence_ipv_opv(INCIDENCE_IPV_OPV_EDEFAULT);
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
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__SOPV:
				return sopv != SOPV_EDEFAULT;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__EOPV:
				return eopv != EOPV_EDEFAULT;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__VOPV:
				return vopv != VOPV_EDEFAULT;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__POPV:
				return popv != POPV_EDEFAULT;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__PW:
				return pw != PW_EDEFAULT;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__SIPV:
				return sipv != SIPV_EDEFAULT;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__EIPV_W:
				return eipv_w != EIPV_W_EDEFAULT;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__CIPV_W:
				return cipv_w != CIPV_W_EDEFAULT;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__EIPV_OPV:
				return eipv_opv != EIPV_OPV_EDEFAULT;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__CIPV_OPV:
				return cipv_opv != CIPV_OPV_EDEFAULT;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__INCIDENCE_OPV:
				return incidence_opv != INCIDENCE_OPV_EDEFAULT;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__INCIDENCE_IPV_W:
				return incidence_ipv_w != INCIDENCE_IPV_W_EDEFAULT;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__INCIDENCE_IPV_OPV:
				return incidence_ipv_opv != INCIDENCE_IPV_OPV_EDEFAULT;
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
		result.append(" (Sopv: ");
		result.append(sopv);
		result.append(", Eopv: ");
		result.append(eopv);
		result.append(", Vopv: ");
		result.append(vopv);
		result.append(", Popv: ");
		result.append(popv);
		result.append(", Pw: ");
		result.append(pw);
		result.append(", Sipv: ");
		result.append(sipv);
		result.append(", Eipv_w: ");
		result.append(eipv_w);
		result.append(", Cipv_w: ");
		result.append(cipv_w);
		result.append(", Eipv_opv: ");
		result.append(eipv_opv);
		result.append(", Cipv_opv: ");
		result.append(cipv_opv);
		result.append(", Incidence_opv: ");
		result.append(incidence_opv);
		result.append(", Incidence_ipv_w: ");
		result.append(incidence_ipv_w);
		result.append(", Incidence_ipv_opv: ");
		result.append(incidence_ipv_opv);
		result.append(')');
		return result.toString();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegrationLabelValue set(IntegrationLabelValue value) {
		PolioOpvIpvLabelValue v = (PolioOpvIpvLabelValue)value;
		super.set(v);

		setSopv(v.getSopv());
		setEopv(v.getEopv());
		setVopv(v.getVopv());
		setPopv(v.getPopv());
		setPw(v.getPw());
		setSipv(v.getSipv());
		setEipv_w(v.getEipv_w());
		setCipv_w(v.getCipv_w());
		setEipv_opv(v.getEipv_opv());
		setCipv_opv(v.getCipv_opv());
		setIncidence_opv(v.getIncidence_opv());
		setIncidence_ipv_w(v.getIncidence_ipv_w());
		setIncidence_ipv_opv(v.getIncidence_ipv_opv());

		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegrationLabelValue add(IntegrationLabelValue value) {
		PolioOpvIpvLabelValue v = (PolioOpvIpvLabelValue)value;
		super.add(v);

		setSopv(getSopv() + v.getSopv());
		setEopv(getEopv() + v.getEopv());
		setVopv(getVopv() + v.getVopv());
		setPopv(getPopv() + v.getPopv());
		setPw(getPw() + v.getPw());
		setSipv(getSipv() + v.getSipv());
		setEipv_w(getEipv_w() + v.getEipv_w());
		setCipv_w(getCipv_w() + v.getCipv_w());
		setEipv_opv(getEipv_opv() + v.getEipv_opv());
		setCipv_opv(getCipv_opv() + v.getCipv_opv());
		setIncidence_opv(getIncidence_opv() + v.getIncidence_opv());
		setIncidence_ipv_w(getIncidence_ipv_w() + v.getIncidence_ipv_w());
		setIncidence_ipv_opv(getIncidence_ipv_opv() + v.getIncidence_ipv_opv());

		return this;	
	}	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegrationLabelValue add(double value) {
		super.add(value);

		setSopv((double)(getSopv() + value));
		setEopv((double)(getEopv() + value));
		setVopv((double)(getVopv() + value));
		setPopv((double)(getPopv() + value));
		setPw((double)(getPw() + value));
		setSipv((double)(getSipv() + value));
		setEipv_w((double)(getEipv_w() + value));
		setCipv_w((double)(getCipv_w() + value));
		setEipv_opv((double)(getEipv_opv() + value));
		setCipv_opv((double)(getCipv_opv() + value));
		setIncidence_opv((double)(getIncidence_opv() + value));
		setIncidence_ipv_w((double)(getIncidence_ipv_w() + value));
		setIncidence_ipv_opv((double)(getIncidence_ipv_opv() + value));

		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override	
	public IntegrationLabelValue sub(IntegrationLabelValue value) {
		PolioOpvIpvLabelValue v = (PolioOpvIpvLabelValue)value;
		super.sub(v);

		setSopv(getSopv() - v.getSopv());
		setEopv(getEopv() - v.getEopv());
		setVopv(getVopv() - v.getVopv());
		setPopv(getPopv() - v.getPopv());
		setPw(getPw() - v.getPw());
		setSipv(getSipv() - v.getSipv());
		setEipv_w(getEipv_w() - v.getEipv_w());
		setCipv_w(getCipv_w() - v.getCipv_w());
		setEipv_opv(getEipv_opv() - v.getEipv_opv());
		setCipv_opv(getCipv_opv() - v.getCipv_opv());
		setIncidence_opv(getIncidence_opv() - v.getIncidence_opv());
		setIncidence_ipv_w(getIncidence_ipv_w() - v.getIncidence_ipv_w());
		setIncidence_ipv_opv(getIncidence_ipv_opv() - v.getIncidence_ipv_opv());

		return this;	
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegrationLabelValue divide(IntegrationLabelValue value) {
		PolioOpvIpvLabelValue v = (PolioOpvIpvLabelValue)value;
		super.divide(v);

		setSopv(getSopv() / v.getSopv());
		setEopv(getEopv() / v.getEopv());
		setVopv(getVopv() / v.getVopv());
		setPopv(getPopv() / v.getPopv());
		setPw(getPw() / v.getPw());
		setSipv(getSipv() / v.getSipv());
		setEipv_w(getEipv_w() / v.getEipv_w());
		setCipv_w(getCipv_w() / v.getCipv_w());
		setEipv_opv(getEipv_opv() / v.getEipv_opv());
		setCipv_opv(getCipv_opv() / v.getCipv_opv());
		setIncidence_opv(getIncidence_opv() / v.getIncidence_opv());
		setIncidence_ipv_w(getIncidence_ipv_w() / v.getIncidence_ipv_w());
		setIncidence_ipv_opv(getIncidence_ipv_opv() / v.getIncidence_ipv_opv());

		return this;	
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegrationLabelValue scale(double scaleFactor) {
		super.scale(scaleFactor);

		setSopv((double)(getSopv() * scaleFactor));
		setEopv((double)(getEopv() * scaleFactor));
		setVopv((double)(getVopv() * scaleFactor));
		setPopv((double)(getPopv() * scaleFactor));
		setPw((double)(getPw() * scaleFactor));
		setSipv((double)(getSipv() * scaleFactor));
		setEipv_w((double)(getEipv_w() * scaleFactor));
		setCipv_w((double)(getCipv_w() * scaleFactor));
		setEipv_opv((double)(getEipv_opv() * scaleFactor));
		setCipv_opv((double)(getCipv_opv() * scaleFactor));
		setIncidence_opv((double)(getIncidence_opv() * scaleFactor));
		setIncidence_ipv_w((double)(getIncidence_ipv_w() * scaleFactor));
		setIncidence_ipv_opv((double)(getIncidence_ipv_opv() * scaleFactor));

		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegrationLabelValue abs() {
		super.abs();

		setSopv(Math.abs(getSopv()));
		setEopv(Math.abs(getEopv()));
		setVopv(Math.abs(getVopv()));
		setPopv(Math.abs(getPopv()));
		setPw(Math.abs(getPw()));
		setSipv(Math.abs(getSipv()));
		setEipv_w(Math.abs(getEipv_w()));
		setCipv_w(Math.abs(getCipv_w()));
		setEipv_opv(Math.abs(getEipv_opv()));
		setCipv_opv(Math.abs(getCipv_opv()));
		setIncidence_opv(Math.abs(getIncidence_opv()));
		setIncidence_ipv_w(Math.abs(getIncidence_ipv_w()));
		setIncidence_ipv_opv(Math.abs(getIncidence_ipv_opv()));
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double max() {
		double maxValue = super.max();

		maxValue = Math.max(maxValue, getSopv());
		maxValue = Math.max(maxValue, getEopv());
		maxValue = Math.max(maxValue, getVopv());
		maxValue = Math.max(maxValue, getPopv());
		maxValue = Math.max(maxValue, getPw());
		maxValue = Math.max(maxValue, getSipv());
		maxValue = Math.max(maxValue, getEipv_w());
		maxValue = Math.max(maxValue, getCipv_w());
		maxValue = Math.max(maxValue, getEipv_opv());
		maxValue = Math.max(maxValue, getCipv_opv());
		return maxValue;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double computeDeltaAdjustment(IntegrationLabelValue value) {
		PolioOpvIpvLabelValue v = (PolioOpvIpvLabelValue)value;
		double factor = super.computeDeltaAdjustment(v);

		if ((double)(getSopv() + v.getSopv()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getSopv() / getSopv()));
		}
		if ((double)(getEopv() + v.getEopv()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getEopv() / getEopv()));
		}
		if ((double)(getVopv() + v.getVopv()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getVopv() / getVopv()));
		}
		if ((double)(getPopv() + v.getPopv()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getPopv() / getPopv()));
		}
		if ((double)(getPw() + v.getPw()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getPw() / getPw()));
		}
		if ((double)(getSipv() + v.getSipv()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getSipv() / getSipv()));
		}
		if ((double)(getEipv_w() + v.getEipv_w()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getEipv_w() / getEipv_w()));
		}
		if ((double)(getCipv_w() + v.getCipv_w()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getCipv_w() / getCipv_w()));
		}
		if ((double)(getEipv_opv() + v.getEipv_opv()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getEipv_opv() / getEipv_opv()));
		}
		if ((double)(getCipv_opv() + v.getCipv_opv()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getCipv_opv() / getCipv_opv()));
		}
		if ((double)(getIncidence_opv() + v.getIncidence_opv()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getIncidence_opv() / getIncidence_opv()));
		}
		if ((double)(getIncidence_ipv_w() + v.getIncidence_ipv_w()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getIncidence_ipv_w() / getIncidence_ipv_w()));
		}
		if ((double)(getIncidence_ipv_opv() + v.getIncidence_ipv_opv()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getIncidence_ipv_opv() / getIncidence_ipv_opv()));
		}
		return factor;
	} // computeDeltaAdjustment
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */	
	@Override
	public void reset() {
		super.reset();
		
		setSopv((double)0.0);
		setEopv((double)0.0);
		setVopv((double)0.0);
		setPopv((double)0.0);
		setPw((double)0.0);
		setSipv((double)0.0);
		setEipv_w((double)0.0);
		setCipv_w((double)0.0);
		setEipv_opv((double)0.0);
		setCipv_opv((double)0.0);
		setIncidence_opv((double)0.0);
		setIncidence_ipv_w((double)0.0);
		setIncidence_ipv_opv((double)0.0);
	} // reset

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */	
	@Override
	public double getPopulationCount() {
		double count = super.getPopulationCount();
		
		count += (double)getSopv();
		count += (double)getEopv();
		count += (double)getVopv();
		count += (double)getPopv();
		count += (double)getPw();
		count += (double)getSipv();
		count += (double)getEipv_w();
		count += (double)getCipv_w();
		count += (double)getEipv_opv();
		count += (double)getCipv_opv();

		return count;
	} // getPopulationCount

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean avoidNegative(IntegrationLabelValue value) {
		PolioOpvIpvLabelValue v = (PolioOpvIpvLabelValue)value;
		boolean adjusted = super.avoidNegative(value);

		if ((double)(getSopv() + v.getSopv()) < 0.0) {
			adjusted = true;
			setSopv(-v.getSopv());
		}

		if ((double)(getEopv() + v.getEopv()) < 0.0) {
			adjusted = true;
			setEopv(-v.getEopv());
		}

		if ((double)(getVopv() + v.getVopv()) < 0.0) {
			adjusted = true;
			setVopv(-v.getVopv());
		}

		if ((double)(getPopv() + v.getPopv()) < 0.0) {
			adjusted = true;
			setPopv(-v.getPopv());
		}

		if ((double)(getPw() + v.getPw()) < 0.0) {
			adjusted = true;
			setPw(-v.getPw());
		}

		if ((double)(getSipv() + v.getSipv()) < 0.0) {
			adjusted = true;
			setSipv(-v.getSipv());
		}

		if ((double)(getEipv_w() + v.getEipv_w()) < 0.0) {
			adjusted = true;
			setEipv_w(-v.getEipv_w());
		}

		if ((double)(getCipv_w() + v.getCipv_w()) < 0.0) {
			adjusted = true;
			setCipv_w(-v.getCipv_w());
		}

		if ((double)(getEipv_opv() + v.getEipv_opv()) < 0.0) {
			adjusted = true;
			setEipv_opv(-v.getEipv_opv());
		}

		if ((double)(getCipv_opv() + v.getCipv_opv()) < 0.0) {
			adjusted = true;
			setCipv_opv(-v.getCipv_opv());
		}

		if ((double)(getIncidence_opv() + v.getIncidence_opv()) < 0.0) {
			adjusted = true;
			setIncidence_opv(-v.getIncidence_opv());
		}

		if ((double)(getIncidence_ipv_w() + v.getIncidence_ipv_w()) < 0.0) {
			adjusted = true;
			setIncidence_ipv_w(-v.getIncidence_ipv_w());
		}

		if ((double)(getIncidence_ipv_opv() + v.getIncidence_ipv_opv()) < 0.0) {
			adjusted = true;
			setIncidence_ipv_opv(-v.getIncidence_ipv_opv());
		}

		return adjusted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean sameValue(LabelValue value) {
		PolioOpvIpvLabelValue v = (PolioOpvIpvLabelValue)value;
		if (!super.sameValue(v)) {
			return false;
		}

		if (getSopv() != v.getSopv()) {
			return false;
		}
		if (getEopv() != v.getEopv()) {
			return false;
		}
		if (getVopv() != v.getVopv()) {
			return false;
		}
		if (getPopv() != v.getPopv()) {
			return false;
		}
		if (getPw() != v.getPw()) {
			return false;
		}
		if (getSipv() != v.getSipv()) {
			return false;
		}
		if (getEipv_w() != v.getEipv_w()) {
			return false;
		}
		if (getCipv_w() != v.getCipv_w()) {
			return false;
		}
		if (getEipv_opv() != v.getEipv_opv()) {
			return false;
		}
		if (getCipv_opv() != v.getCipv_opv()) {
			return false;
		}
		if (getIncidence_opv() != v.getIncidence_opv()) {
			return false;
		}
		if (getIncidence_ipv_w() != v.getIncidence_ipv_w()) {
			return false;
		}
		if (getIncidence_ipv_opv() != v.getIncidence_ipv_opv()) {
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegrationLabelValue copy() {
		PolioOpvIpvLabelValue copy = PolioOpvIpvFactory.eINSTANCE.createPolioOpvIpvLabelValue();
		copy.set(this);
		return copy;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */	
	@Override
	public void prepareCycle() {
		super.prepareCycle();
		setIncidence_opv(0.0);
		setIncidence_ipv_w(0.0);
		setIncidence_ipv_opv(0.0);
	}
		
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double eGetDouble(int featureID) {
		switch (featureID) {
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__SOPV:
				return getSopv();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__EOPV:
				return getEopv();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__VOPV:
				return getVopv();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__POPV:
				return getPopv();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__PW:
				return getPw();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__SIPV:
				return getSipv();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__EIPV_W:
				return getEipv_w();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__CIPV_W:
				return getCipv_w();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__EIPV_OPV:
				return getEipv_opv();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__CIPV_OPV:
				return getCipv_opv();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__INCIDENCE_OPV:
				return getIncidence_opv();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__INCIDENCE_IPV_W:
				return getIncidence_ipv_w();
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__INCIDENCE_IPV_OPV:
				return getIncidence_ipv_opv();
		}

		return super.eGetDouble(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSetDouble(int featureID, double newValue) {
		switch (featureID) {
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__SOPV:
				setSopv(newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__EOPV:
				setEopv(newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__VOPV:
				setVopv(newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__POPV:
				setPopv(newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__PW:
				setPw(newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__SIPV:
				setSipv(newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__EIPV_W:
				setEipv_w(newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__CIPV_W:
				setCipv_w(newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__EIPV_OPV:
				setEipv_opv(newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__CIPV_OPV:
				setCipv_opv(newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__INCIDENCE_OPV:
				setIncidence_opv(newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__INCIDENCE_IPV_W:
				setIncidence_ipv_w(newValue);
				return;
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__INCIDENCE_IPV_OPV:
				setIncidence_ipv_opv(newValue);
				return;
		}
		
		super.eSetDouble(featureID,newValue);
	}
					

} //PolioOpvIpvLabelValueImpl
