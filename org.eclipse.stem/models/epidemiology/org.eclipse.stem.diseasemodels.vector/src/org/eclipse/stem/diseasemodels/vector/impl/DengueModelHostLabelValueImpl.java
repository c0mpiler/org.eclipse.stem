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
package org.eclipse.stem.diseasemodels.vector.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.core.graph.IntegrationLabelValue;
import org.eclipse.stem.core.graph.LabelValue;
import org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue;
import org.eclipse.stem.diseasemodels.vector.VectorFactory;
import org.eclipse.stem.diseasemodels.vector.VectorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dengue Model Host Label Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelHostLabelValueImpl#getE1 <em>E1</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelHostLabelValueImpl#getE2 <em>E2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelHostLabelValueImpl#getE3 <em>E3</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelHostLabelValueImpl#getE4 <em>E4</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelHostLabelValueImpl#getE12 <em>E12</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelHostLabelValueImpl#getE13 <em>E13</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelHostLabelValueImpl#getE14 <em>E14</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelHostLabelValueImpl#getE21 <em>E21</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelHostLabelValueImpl#getE23 <em>E23</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelHostLabelValueImpl#getE24 <em>E24</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelHostLabelValueImpl#getE31 <em>E31</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelHostLabelValueImpl#getE32 <em>E32</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelHostLabelValueImpl#getE34 <em>E34</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelHostLabelValueImpl#getE41 <em>E41</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelHostLabelValueImpl#getE42 <em>E42</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelHostLabelValueImpl#getE43 <em>E43</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DengueModelHostLabelValueImpl extends SimpleDengueModelHostLabelValueImpl implements DengueModelHostLabelValue {
	/**
	 * The default value of the '{@link #getE1() <em>E1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE1()
	 * @generated
	 * @ordered
	 */
	protected static final double E1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getE1() <em>E1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE1()
	 * @generated
	 * @ordered
	 */
	protected double e1 = E1_EDEFAULT;

	/**
	 * The default value of the '{@link #getE2() <em>E2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE2()
	 * @generated
	 * @ordered
	 */
	protected static final double E2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getE2() <em>E2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE2()
	 * @generated
	 * @ordered
	 */
	protected double e2 = E2_EDEFAULT;

	/**
	 * The default value of the '{@link #getE3() <em>E3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE3()
	 * @generated
	 * @ordered
	 */
	protected static final double E3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getE3() <em>E3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE3()
	 * @generated
	 * @ordered
	 */
	protected double e3 = E3_EDEFAULT;

	/**
	 * The default value of the '{@link #getE4() <em>E4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE4()
	 * @generated
	 * @ordered
	 */
	protected static final double E4_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getE4() <em>E4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE4()
	 * @generated
	 * @ordered
	 */
	protected double e4 = E4_EDEFAULT;

	/**
	 * The default value of the '{@link #getE12() <em>E12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE12()
	 * @generated
	 * @ordered
	 */
	protected static final double E12_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getE12() <em>E12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE12()
	 * @generated
	 * @ordered
	 */
	protected double e12 = E12_EDEFAULT;

	/**
	 * The default value of the '{@link #getE13() <em>E13</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE13()
	 * @generated
	 * @ordered
	 */
	protected static final double E13_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getE13() <em>E13</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE13()
	 * @generated
	 * @ordered
	 */
	protected double e13 = E13_EDEFAULT;

	/**
	 * The default value of the '{@link #getE14() <em>E14</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE14()
	 * @generated
	 * @ordered
	 */
	protected static final double E14_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getE14() <em>E14</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE14()
	 * @generated
	 * @ordered
	 */
	protected double e14 = E14_EDEFAULT;

	/**
	 * The default value of the '{@link #getE21() <em>E21</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE21()
	 * @generated
	 * @ordered
	 */
	protected static final double E21_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getE21() <em>E21</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE21()
	 * @generated
	 * @ordered
	 */
	protected double e21 = E21_EDEFAULT;

	/**
	 * The default value of the '{@link #getE23() <em>E23</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE23()
	 * @generated
	 * @ordered
	 */
	protected static final double E23_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getE23() <em>E23</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE23()
	 * @generated
	 * @ordered
	 */
	protected double e23 = E23_EDEFAULT;

	/**
	 * The default value of the '{@link #getE24() <em>E24</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE24()
	 * @generated
	 * @ordered
	 */
	protected static final double E24_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getE24() <em>E24</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE24()
	 * @generated
	 * @ordered
	 */
	protected double e24 = E24_EDEFAULT;

	/**
	 * The default value of the '{@link #getE31() <em>E31</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE31()
	 * @generated
	 * @ordered
	 */
	protected static final double E31_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getE31() <em>E31</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE31()
	 * @generated
	 * @ordered
	 */
	protected double e31 = E31_EDEFAULT;

	/**
	 * The default value of the '{@link #getE32() <em>E32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE32()
	 * @generated
	 * @ordered
	 */
	protected static final double E32_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getE32() <em>E32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE32()
	 * @generated
	 * @ordered
	 */
	protected double e32 = E32_EDEFAULT;

	/**
	 * The default value of the '{@link #getE34() <em>E34</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE34()
	 * @generated
	 * @ordered
	 */
	protected static final double E34_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getE34() <em>E34</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE34()
	 * @generated
	 * @ordered
	 */
	protected double e34 = E34_EDEFAULT;

	/**
	 * The default value of the '{@link #getE41() <em>E41</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE41()
	 * @generated
	 * @ordered
	 */
	protected static final double E41_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getE41() <em>E41</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE41()
	 * @generated
	 * @ordered
	 */
	protected double e41 = E41_EDEFAULT;

	/**
	 * The default value of the '{@link #getE42() <em>E42</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE42()
	 * @generated
	 * @ordered
	 */
	protected static final double E42_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getE42() <em>E42</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE42()
	 * @generated
	 * @ordered
	 */
	protected double e42 = E42_EDEFAULT;

	/**
	 * The default value of the '{@link #getE43() <em>E43</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE43()
	 * @generated
	 * @ordered
	 */
	protected static final double E43_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getE43() <em>E43</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE43()
	 * @generated
	 * @ordered
	 */
	protected double e43 = E43_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DengueModelHostLabelValueImpl() {
		super();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VectorPackage.Literals.DENGUE_MODEL_HOST_LABEL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getE1() {
		return e1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setE1(double newE1) {
		e1 = newE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getE2() {
		return e2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setE2(double newE2) {
		e2 = newE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getE3() {
		return e3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setE3(double newE3) {
		e3 = newE3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getE4() {
		return e4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setE4(double newE4) {
		e4 = newE4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getE12() {
		return e12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setE12(double newE12) {
		e12 = newE12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getE13() {
		return e13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setE13(double newE13) {
		e13 = newE13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getE14() {
		return e14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setE14(double newE14) {
		e14 = newE14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getE21() {
		return e21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setE21(double newE21) {
		e21 = newE21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getE23() {
		return e23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setE23(double newE23) {
		e23 = newE23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getE24() {
		return e24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setE24(double newE24) {
		e24 = newE24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getE31() {
		return e31;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setE31(double newE31) {
		e31 = newE31;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getE32() {
		return e32;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setE32(double newE32) {
		e32 = newE32;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getE34() {
		return e34;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setE34(double newE34) {
		e34 = newE34;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getE41() {
		return e41;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setE41(double newE41) {
		e41 = newE41;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getE42() {
		return e42;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setE42(double newE42) {
		e42 = newE42;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getE43() {
		return e43;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setE43(double newE43) {
		e43 = newE43;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E1:
				return getE1();
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E2:
				return getE2();
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E3:
				return getE3();
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E4:
				return getE4();
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E12:
				return getE12();
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E13:
				return getE13();
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E14:
				return getE14();
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E21:
				return getE21();
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E23:
				return getE23();
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E24:
				return getE24();
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E31:
				return getE31();
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E32:
				return getE32();
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E34:
				return getE34();
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E41:
				return getE41();
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E42:
				return getE42();
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E43:
				return getE43();
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
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E1:
				setE1((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E2:
				setE2((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E3:
				setE3((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E4:
				setE4((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E12:
				setE12((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E13:
				setE13((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E14:
				setE14((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E21:
				setE21((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E23:
				setE23((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E24:
				setE24((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E31:
				setE31((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E32:
				setE32((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E34:
				setE34((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E41:
				setE41((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E42:
				setE42((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E43:
				setE43((Double)newValue);
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
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E1:
				setE1(E1_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E2:
				setE2(E2_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E3:
				setE3(E3_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E4:
				setE4(E4_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E12:
				setE12(E12_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E13:
				setE13(E13_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E14:
				setE14(E14_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E21:
				setE21(E21_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E23:
				setE23(E23_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E24:
				setE24(E24_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E31:
				setE31(E31_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E32:
				setE32(E32_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E34:
				setE34(E34_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E41:
				setE41(E41_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E42:
				setE42(E42_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E43:
				setE43(E43_EDEFAULT);
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
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E1:
				return e1 != E1_EDEFAULT;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E2:
				return e2 != E2_EDEFAULT;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E3:
				return e3 != E3_EDEFAULT;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E4:
				return e4 != E4_EDEFAULT;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E12:
				return e12 != E12_EDEFAULT;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E13:
				return e13 != E13_EDEFAULT;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E14:
				return e14 != E14_EDEFAULT;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E21:
				return e21 != E21_EDEFAULT;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E23:
				return e23 != E23_EDEFAULT;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E24:
				return e24 != E24_EDEFAULT;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E31:
				return e31 != E31_EDEFAULT;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E32:
				return e32 != E32_EDEFAULT;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E34:
				return e34 != E34_EDEFAULT;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E41:
				return e41 != E41_EDEFAULT;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E42:
				return e42 != E42_EDEFAULT;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E43:
				return e43 != E43_EDEFAULT;
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
		result.append(" (E1: ");
		result.append(e1);
		result.append(", E2: ");
		result.append(e2);
		result.append(", E3: ");
		result.append(e3);
		result.append(", E4: ");
		result.append(e4);
		result.append(", E12: ");
		result.append(e12);
		result.append(", E13: ");
		result.append(e13);
		result.append(", E14: ");
		result.append(e14);
		result.append(", E21: ");
		result.append(e21);
		result.append(", E23: ");
		result.append(e23);
		result.append(", E24: ");
		result.append(e24);
		result.append(", E31: ");
		result.append(e31);
		result.append(", E32: ");
		result.append(e32);
		result.append(", E34: ");
		result.append(e34);
		result.append(", E41: ");
		result.append(e41);
		result.append(", E42: ");
		result.append(e42);
		result.append(", E43: ");
		result.append(e43);
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
		DengueModelHostLabelValue v = (DengueModelHostLabelValue)value;
		super.set(v);

		setE1(v.getE1());
		setE2(v.getE2());
		setE3(v.getE3());
		setE4(v.getE4());
		setE12(v.getE12());
		setE13(v.getE13());
		setE14(v.getE14());
		setE21(v.getE21());
		setE23(v.getE23());
		setE24(v.getE24());
		setE31(v.getE31());
		setE32(v.getE32());
		setE34(v.getE34());
		setE41(v.getE41());
		setE42(v.getE42());
		setE43(v.getE43());

		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegrationLabelValue add(IntegrationLabelValue value) {
		DengueModelHostLabelValue v = (DengueModelHostLabelValue)value;
		super.add(v);

		setE1(getE1() + v.getE1());
		setE2(getE2() + v.getE2());
		setE3(getE3() + v.getE3());
		setE4(getE4() + v.getE4());
		setE12(getE12() + v.getE12());
		setE13(getE13() + v.getE13());
		setE14(getE14() + v.getE14());
		setE21(getE21() + v.getE21());
		setE23(getE23() + v.getE23());
		setE24(getE24() + v.getE24());
		setE31(getE31() + v.getE31());
		setE32(getE32() + v.getE32());
		setE34(getE34() + v.getE34());
		setE41(getE41() + v.getE41());
		setE42(getE42() + v.getE42());
		setE43(getE43() + v.getE43());

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

		setE1((double)(getE1() + value));
		setE2((double)(getE2() + value));
		setE3((double)(getE3() + value));
		setE4((double)(getE4() + value));
		setE12((double)(getE12() + value));
		setE13((double)(getE13() + value));
		setE14((double)(getE14() + value));
		setE21((double)(getE21() + value));
		setE23((double)(getE23() + value));
		setE24((double)(getE24() + value));
		setE31((double)(getE31() + value));
		setE32((double)(getE32() + value));
		setE34((double)(getE34() + value));
		setE41((double)(getE41() + value));
		setE42((double)(getE42() + value));
		setE43((double)(getE43() + value));

		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override	
	public IntegrationLabelValue sub(IntegrationLabelValue value) {
		DengueModelHostLabelValue v = (DengueModelHostLabelValue)value;
		super.sub(v);

		setE1(getE1() - v.getE1());
		setE2(getE2() - v.getE2());
		setE3(getE3() - v.getE3());
		setE4(getE4() - v.getE4());
		setE12(getE12() - v.getE12());
		setE13(getE13() - v.getE13());
		setE14(getE14() - v.getE14());
		setE21(getE21() - v.getE21());
		setE23(getE23() - v.getE23());
		setE24(getE24() - v.getE24());
		setE31(getE31() - v.getE31());
		setE32(getE32() - v.getE32());
		setE34(getE34() - v.getE34());
		setE41(getE41() - v.getE41());
		setE42(getE42() - v.getE42());
		setE43(getE43() - v.getE43());

		return this;	
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegrationLabelValue divide(IntegrationLabelValue value) {
		DengueModelHostLabelValue v = (DengueModelHostLabelValue)value;
		super.divide(v);

		setE1(getE1() / v.getE1());
		setE2(getE2() / v.getE2());
		setE3(getE3() / v.getE3());
		setE4(getE4() / v.getE4());
		setE12(getE12() / v.getE12());
		setE13(getE13() / v.getE13());
		setE14(getE14() / v.getE14());
		setE21(getE21() / v.getE21());
		setE23(getE23() / v.getE23());
		setE24(getE24() / v.getE24());
		setE31(getE31() / v.getE31());
		setE32(getE32() / v.getE32());
		setE34(getE34() / v.getE34());
		setE41(getE41() / v.getE41());
		setE42(getE42() / v.getE42());
		setE43(getE43() / v.getE43());

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

		setE1((double)(getE1() * scaleFactor));
		setE2((double)(getE2() * scaleFactor));
		setE3((double)(getE3() * scaleFactor));
		setE4((double)(getE4() * scaleFactor));
		setE12((double)(getE12() * scaleFactor));
		setE13((double)(getE13() * scaleFactor));
		setE14((double)(getE14() * scaleFactor));
		setE21((double)(getE21() * scaleFactor));
		setE23((double)(getE23() * scaleFactor));
		setE24((double)(getE24() * scaleFactor));
		setE31((double)(getE31() * scaleFactor));
		setE32((double)(getE32() * scaleFactor));
		setE34((double)(getE34() * scaleFactor));
		setE41((double)(getE41() * scaleFactor));
		setE42((double)(getE42() * scaleFactor));
		setE43((double)(getE43() * scaleFactor));

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

		setE1(Math.abs(getE1()));
		setE2(Math.abs(getE2()));
		setE3(Math.abs(getE3()));
		setE4(Math.abs(getE4()));
		setE12(Math.abs(getE12()));
		setE13(Math.abs(getE13()));
		setE14(Math.abs(getE14()));
		setE21(Math.abs(getE21()));
		setE23(Math.abs(getE23()));
		setE24(Math.abs(getE24()));
		setE31(Math.abs(getE31()));
		setE32(Math.abs(getE32()));
		setE34(Math.abs(getE34()));
		setE41(Math.abs(getE41()));
		setE42(Math.abs(getE42()));
		setE43(Math.abs(getE43()));
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

		maxValue = Math.max(maxValue, getE1());
		maxValue = Math.max(maxValue, getE2());
		maxValue = Math.max(maxValue, getE3());
		maxValue = Math.max(maxValue, getE4());
		maxValue = Math.max(maxValue, getE12());
		maxValue = Math.max(maxValue, getE13());
		maxValue = Math.max(maxValue, getE14());
		maxValue = Math.max(maxValue, getE21());
		maxValue = Math.max(maxValue, getE23());
		maxValue = Math.max(maxValue, getE24());
		maxValue = Math.max(maxValue, getE31());
		maxValue = Math.max(maxValue, getE32());
		maxValue = Math.max(maxValue, getE34());
		maxValue = Math.max(maxValue, getE41());
		maxValue = Math.max(maxValue, getE42());
		maxValue = Math.max(maxValue, getE43());
		return maxValue;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double computeDeltaAdjustment(IntegrationLabelValue value) {
		DengueModelHostLabelValue v = (DengueModelHostLabelValue)value;
		double factor = super.computeDeltaAdjustment(v);

		if ((double)(getE1() + v.getE1()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getE1() / getE1()));
		}
		if ((double)(getE2() + v.getE2()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getE2() / getE2()));
		}
		if ((double)(getE3() + v.getE3()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getE3() / getE3()));
		}
		if ((double)(getE4() + v.getE4()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getE4() / getE4()));
		}
		if ((double)(getE12() + v.getE12()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getE12() / getE12()));
		}
		if ((double)(getE13() + v.getE13()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getE13() / getE13()));
		}
		if ((double)(getE14() + v.getE14()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getE14() / getE14()));
		}
		if ((double)(getE21() + v.getE21()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getE21() / getE21()));
		}
		if ((double)(getE23() + v.getE23()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getE23() / getE23()));
		}
		if ((double)(getE24() + v.getE24()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getE24() / getE24()));
		}
		if ((double)(getE31() + v.getE31()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getE31() / getE31()));
		}
		if ((double)(getE32() + v.getE32()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getE32() / getE32()));
		}
		if ((double)(getE34() + v.getE34()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getE34() / getE34()));
		}
		if ((double)(getE41() + v.getE41()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getE41() / getE41()));
		}
		if ((double)(getE42() + v.getE42()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getE42() / getE42()));
		}
		if ((double)(getE43() + v.getE43()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getE43() / getE43()));
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
		
		setE1((double)0.0);
		setE2((double)0.0);
		setE3((double)0.0);
		setE4((double)0.0);
		setE12((double)0.0);
		setE13((double)0.0);
		setE14((double)0.0);
		setE21((double)0.0);
		setE23((double)0.0);
		setE24((double)0.0);
		setE31((double)0.0);
		setE32((double)0.0);
		setE34((double)0.0);
		setE41((double)0.0);
		setE42((double)0.0);
		setE43((double)0.0);
	} // reset

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */	
	@Override
	public double getPopulationCount() {
		double count = super.getPopulationCount();
		
		count += (double)getE1();
		count += (double)getE2();
		count += (double)getE3();
		count += (double)getE4();
		count += (double)getE12();
		count += (double)getE13();
		count += (double)getE14();
		count += (double)getE21();
		count += (double)getE23();
		count += (double)getE24();
		count += (double)getE31();
		count += (double)getE32();
		count += (double)getE34();
		count += (double)getE41();
		count += (double)getE42();
		count += (double)getE43();

		return count;
	} // getPopulationCount

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean avoidNegative(IntegrationLabelValue value) {
		DengueModelHostLabelValue v = (DengueModelHostLabelValue)value;
		boolean adjusted = super.avoidNegative(value);

		if ((double)(getE1() + v.getE1()) < 0.0) {
			adjusted = true;
			setE1(-v.getE1());
		}

		if ((double)(getE2() + v.getE2()) < 0.0) {
			adjusted = true;
			setE2(-v.getE2());
		}

		if ((double)(getE3() + v.getE3()) < 0.0) {
			adjusted = true;
			setE3(-v.getE3());
		}

		if ((double)(getE4() + v.getE4()) < 0.0) {
			adjusted = true;
			setE4(-v.getE4());
		}

		if ((double)(getE12() + v.getE12()) < 0.0) {
			adjusted = true;
			setE12(-v.getE12());
		}

		if ((double)(getE13() + v.getE13()) < 0.0) {
			adjusted = true;
			setE13(-v.getE13());
		}

		if ((double)(getE14() + v.getE14()) < 0.0) {
			adjusted = true;
			setE14(-v.getE14());
		}

		if ((double)(getE21() + v.getE21()) < 0.0) {
			adjusted = true;
			setE21(-v.getE21());
		}

		if ((double)(getE23() + v.getE23()) < 0.0) {
			adjusted = true;
			setE23(-v.getE23());
		}

		if ((double)(getE24() + v.getE24()) < 0.0) {
			adjusted = true;
			setE24(-v.getE24());
		}

		if ((double)(getE31() + v.getE31()) < 0.0) {
			adjusted = true;
			setE31(-v.getE31());
		}

		if ((double)(getE32() + v.getE32()) < 0.0) {
			adjusted = true;
			setE32(-v.getE32());
		}

		if ((double)(getE34() + v.getE34()) < 0.0) {
			adjusted = true;
			setE34(-v.getE34());
		}

		if ((double)(getE41() + v.getE41()) < 0.0) {
			adjusted = true;
			setE41(-v.getE41());
		}

		if ((double)(getE42() + v.getE42()) < 0.0) {
			adjusted = true;
			setE42(-v.getE42());
		}

		if ((double)(getE43() + v.getE43()) < 0.0) {
			adjusted = true;
			setE43(-v.getE43());
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
		DengueModelHostLabelValue v = (DengueModelHostLabelValue)value;
		if (!super.sameValue(v)) {
			return false;
		}

		if (getE1() != v.getE1()) {
			return false;
		}
		if (getE2() != v.getE2()) {
			return false;
		}
		if (getE3() != v.getE3()) {
			return false;
		}
		if (getE4() != v.getE4()) {
			return false;
		}
		if (getE12() != v.getE12()) {
			return false;
		}
		if (getE13() != v.getE13()) {
			return false;
		}
		if (getE14() != v.getE14()) {
			return false;
		}
		if (getE21() != v.getE21()) {
			return false;
		}
		if (getE23() != v.getE23()) {
			return false;
		}
		if (getE24() != v.getE24()) {
			return false;
		}
		if (getE31() != v.getE31()) {
			return false;
		}
		if (getE32() != v.getE32()) {
			return false;
		}
		if (getE34() != v.getE34()) {
			return false;
		}
		if (getE41() != v.getE41()) {
			return false;
		}
		if (getE42() != v.getE42()) {
			return false;
		}
		if (getE43() != v.getE43()) {
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
		DengueModelHostLabelValue copy = VectorFactory.eINSTANCE.createDengueModelHostLabelValue();
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
	}
		
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double eGetDouble(int featureID) {
		switch (featureID) {
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E1:
				return getE1();
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E2:
				return getE2();
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E3:
				return getE3();
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E4:
				return getE4();
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E12:
				return getE12();
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E13:
				return getE13();
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E14:
				return getE14();
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E21:
				return getE21();
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E23:
				return getE23();
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E24:
				return getE24();
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E31:
				return getE31();
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E32:
				return getE32();
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E34:
				return getE34();
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E41:
				return getE41();
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E42:
				return getE42();
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E43:
				return getE43();
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
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E1:
				setE1(newValue);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E2:
				setE2(newValue);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E3:
				setE3(newValue);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E4:
				setE4(newValue);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E12:
				setE12(newValue);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E13:
				setE13(newValue);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E14:
				setE14(newValue);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E21:
				setE21(newValue);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E23:
				setE23(newValue);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E24:
				setE24(newValue);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E31:
				setE31(newValue);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E32:
				setE32(newValue);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E34:
				setE34(newValue);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E41:
				setE41(newValue);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E42:
				setE42(newValue);
				return;
			case VectorPackage.DENGUE_MODEL_HOST_LABEL_VALUE__E43:
				setE43(newValue);
				return;
		}
		
		super.eSetDouble(featureID,newValue);
	}
					

} //DengueModelHostLabelValueImpl
