package org.eclipse.stem.diseasemodels.experimental.impl;

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
import org.eclipse.stem.core.graph.IntegrationLabelValue;
import org.eclipse.stem.core.graph.LabelValue;
import org.eclipse.stem.diseasemodels.experimental.ExperimentalFactory;
import org.eclipse.stem.diseasemodels.experimental.ExperimentalPackage;
import org.eclipse.stem.diseasemodels.experimental.TBDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelLabelValueImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TB Disease Model Label Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.experimental.impl.TBDiseaseModelLabelValueImpl#getIl <em>Il</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.experimental.impl.TBDiseaseModelLabelValueImpl#getIa <em>Ia</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TBDiseaseModelLabelValueImpl extends StandardDiseaseModelLabelValueImpl implements TBDiseaseModelLabelValue {
	/**
	 * The default value of the '{@link #getIl() <em>Il</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIl()
	 * @generated
	 * @ordered
	 */
	protected static final double IL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIl() <em>Il</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIl()
	 * @generated
	 * @ordered
	 */
	protected double il = IL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIa() <em>Ia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIa()
	 * @generated
	 * @ordered
	 */
	protected static final double IA_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIa() <em>Ia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIa()
	 * @generated
	 * @ordered
	 */
	protected double ia = IA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TBDiseaseModelLabelValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExperimentalPackage.Literals.TB_DISEASE_MODEL_LABEL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIl() {
		return il;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIl(double newIl) {
		il = newIl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIa() {
		return ia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIa(double newIa) {
		ia = newIa;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExperimentalPackage.TB_DISEASE_MODEL_LABEL_VALUE__IL:
				return getIl();
			case ExperimentalPackage.TB_DISEASE_MODEL_LABEL_VALUE__IA:
				return getIa();
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
			case ExperimentalPackage.TB_DISEASE_MODEL_LABEL_VALUE__IL:
				setIl((Double)newValue);
				return;
			case ExperimentalPackage.TB_DISEASE_MODEL_LABEL_VALUE__IA:
				setIa((Double)newValue);
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
			case ExperimentalPackage.TB_DISEASE_MODEL_LABEL_VALUE__IL:
				setIl(IL_EDEFAULT);
				return;
			case ExperimentalPackage.TB_DISEASE_MODEL_LABEL_VALUE__IA:
				setIa(IA_EDEFAULT);
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
			case ExperimentalPackage.TB_DISEASE_MODEL_LABEL_VALUE__IL:
				return il != IL_EDEFAULT;
			case ExperimentalPackage.TB_DISEASE_MODEL_LABEL_VALUE__IA:
				return ia != IA_EDEFAULT;
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
		result.append(" (il: ");
		result.append(il);
		result.append(", ia: ");
		result.append(ia);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public IntegrationLabelValue set(IntegrationLabelValue value) {
		TBDiseaseModelLabelValue v = (TBDiseaseModelLabelValue) value;

		super.set(value);
		setIa(v.getIa());
		setIl(v.getIl());

		return this;
	}

	@Override
	public IntegrationLabelValue add(IntegrationLabelValue value) {
		TBDiseaseModelLabelValue v = (TBDiseaseModelLabelValue) value;

		super.add(value);
		setIa(getIa() + v.getIa());
		setIl(getIl() + v.getIl());

		return this;
	}

	@Override
	public IntegrationLabelValue sub(IntegrationLabelValue value) {
		TBDiseaseModelLabelValue v = (TBDiseaseModelLabelValue) value;

		super.sub(value);
		setIa(getIa() - v.getIa());
		setIl(getIl() - v.getIl());

		return this;
	}

	@Override
	public IntegrationLabelValue scale(double scaleFactor) {
		super.scale(scaleFactor);
		setIa(scaleFactor * getIa());
		setIl(scaleFactor * getIl());

		return this;
	}

	@Override
	public IntegrationLabelValue add(double addition) {
		super.add(addition);
		setIa(getIa() + addition);
		setIl(getIl() + addition);

		return this;
	}

	@Override
	public IntegrationLabelValue abs() {
		super.abs();
		setIa(Math.abs(getIa()));
		setIl(Math.abs(getIl()));

		return this;
	}

	@Override
	public boolean avoidNegative(IntegrationLabelValue value) {
		TBDiseaseModelLabelValue v = (TBDiseaseModelLabelValue) value;
		boolean adjusted = super.avoidNegative(value);

		if (getIa() + v.getIa() < 0.0) {
			setIa(-v.getIa());
		}
		
		if (getIl() + v.getIl() < 0.0) {
			setIl(-v.getIl());
		}

		return adjusted;
	}

	@Override
	public double computeDeltaAdjustment(IntegrationLabelValue value) {
		TBDiseaseModelLabelValue v = (TBDiseaseModelLabelValue) value;
		double factor = super.computeDeltaAdjustment(value);

		if (getIa() + v.getIa() < 0.0) {
			factor = Math.min(factor, -v.getIa() / getIa());
		}
		
		if (getIl() + v.getIl() < 0.0) {
			factor = Math.min(factor, -v.getIl() / getIl());
		}

		return factor;
	}

	@Override
	public IntegrationLabelValue divide(IntegrationLabelValue value) {
		TBDiseaseModelLabelValue v = (TBDiseaseModelLabelValue) value;

		super.add(value);
		setIa(getIa() / v.getIa());
		setIl(getIl() / v.getIl());

		return this;
	}

	@Override
	public double max() {
		double max = super.max();

		max = Math.max(max, getIa());
		max = Math.max(max, getIl());

		return max;
	}

	@Override
	public void reset() {
		super.reset();
		setIa(0.0);
		setIl(0.0);
	}

	@Override
	public boolean sameValue(LabelValue otherLabelValue) {
		TBDiseaseModelLabelValue v = (TBDiseaseModelLabelValue) otherLabelValue;

		if (!super.sameValue(otherLabelValue)) {
			return false;
		}
		
		if (getIa() != v.getIa()) {
			return false;
		}
		
		if (getIl() != v.getIl()) {
			return false;
		}

		return true;
	}
	
	@Override
	public double getPopulationCount() {
		return super.getPopulationCount() + getIa() + getIl();
	}

	@Override
	public IntegrationLabelValue copy() {
		IntegrationLabelValue ilv = ExperimentalFactory.eINSTANCE.createTBDiseaseModelLabelValue();
		ilv.set(this);
		return ilv;
	}
	
	/**
	 * Use this for enhanced performance (no boxing) instead of eSet
	 */
	@Override
	public void eSetDouble(int featureId, double newValue) {
		switch (featureId) {
			case ExperimentalPackage.TB_DISEASE_MODEL_LABEL_VALUE__IL:
				setIl(newValue);
				return;
			case ExperimentalPackage.TB_DISEASE_MODEL_LABEL_VALUE__IA:
				setIa(newValue);
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
		case ExperimentalPackage.TB_DISEASE_MODEL_LABEL_VALUE__IL:
			return getIl();
		case ExperimentalPackage.TB_DISEASE_MODEL_LABEL_VALUE__IA:
			return getIa();
		}
		return super.eGetDouble(featureId);
	}
	
} //TBDiseaseModelLabelValueImpl
