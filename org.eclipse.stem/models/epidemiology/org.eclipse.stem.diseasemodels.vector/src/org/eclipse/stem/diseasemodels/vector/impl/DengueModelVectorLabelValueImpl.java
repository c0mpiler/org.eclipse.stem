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
import org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelLabelValueImpl;
import org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue;
import org.eclipse.stem.diseasemodels.vector.VectorFactory;
import org.eclipse.stem.diseasemodels.vector.VectorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dengue Model Vector Label Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelVectorLabelValueImpl#getE1 <em>E1</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelVectorLabelValueImpl#getE2 <em>E2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelVectorLabelValueImpl#getE3 <em>E3</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelVectorLabelValueImpl#getE4 <em>E4</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelVectorLabelValueImpl#getI1 <em>I1</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelVectorLabelValueImpl#getI2 <em>I2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelVectorLabelValueImpl#getI3 <em>I3</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelVectorLabelValueImpl#getI4 <em>I4</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelVectorLabelValueImpl#getIncidence1 <em>Incidence1</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelVectorLabelValueImpl#getIncidence2 <em>Incidence2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelVectorLabelValueImpl#getIncidence3 <em>Incidence3</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.DengueModelVectorLabelValueImpl#getIncidence4 <em>Incidence4</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DengueModelVectorLabelValueImpl extends StandardDiseaseModelLabelValueImpl implements DengueModelVectorLabelValue {
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
	 * The default value of the '{@link #getI1() <em>I1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI1()
	 * @generated
	 * @ordered
	 */
	protected static final double I1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getI1() <em>I1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI1()
	 * @generated
	 * @ordered
	 */
	protected double i1 = I1_EDEFAULT;

	/**
	 * The default value of the '{@link #getI2() <em>I2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI2()
	 * @generated
	 * @ordered
	 */
	protected static final double I2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getI2() <em>I2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI2()
	 * @generated
	 * @ordered
	 */
	protected double i2 = I2_EDEFAULT;

	/**
	 * The default value of the '{@link #getI3() <em>I3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI3()
	 * @generated
	 * @ordered
	 */
	protected static final double I3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getI3() <em>I3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI3()
	 * @generated
	 * @ordered
	 */
	protected double i3 = I3_EDEFAULT;

	/**
	 * The default value of the '{@link #getI4() <em>I4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI4()
	 * @generated
	 * @ordered
	 */
	protected static final double I4_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getI4() <em>I4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI4()
	 * @generated
	 * @ordered
	 */
	protected double i4 = I4_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncidence1() <em>Incidence1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence1()
	 * @generated
	 * @ordered
	 */
	protected static final double INCIDENCE1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIncidence1() <em>Incidence1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence1()
	 * @generated
	 * @ordered
	 */
	protected double incidence1 = INCIDENCE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncidence2() <em>Incidence2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence2()
	 * @generated
	 * @ordered
	 */
	protected static final double INCIDENCE2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIncidence2() <em>Incidence2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence2()
	 * @generated
	 * @ordered
	 */
	protected double incidence2 = INCIDENCE2_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncidence3() <em>Incidence3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence3()
	 * @generated
	 * @ordered
	 */
	protected static final double INCIDENCE3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIncidence3() <em>Incidence3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence3()
	 * @generated
	 * @ordered
	 */
	protected double incidence3 = INCIDENCE3_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncidence4() <em>Incidence4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence4()
	 * @generated
	 * @ordered
	 */
	protected static final double INCIDENCE4_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIncidence4() <em>Incidence4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence4()
	 * @generated
	 * @ordered
	 */
	protected double incidence4 = INCIDENCE4_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DengueModelVectorLabelValueImpl() {
		super();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VectorPackage.Literals.DENGUE_MODEL_VECTOR_LABEL_VALUE;
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
	public double getI1() {
		return i1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setI1(double newI1) {
		i1 = newI1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getI2() {
		return i2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setI2(double newI2) {
		i2 = newI2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getI3() {
		return i3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setI3(double newI3) {
		i3 = newI3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getI4() {
		return i4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setI4(double newI4) {
		i4 = newI4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIncidence1() {
		return incidence1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncidence1(double newIncidence1) {
		incidence1 = newIncidence1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIncidence2() {
		return incidence2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncidence2(double newIncidence2) {
		incidence2 = newIncidence2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIncidence3() {
		return incidence3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncidence3(double newIncidence3) {
		incidence3 = newIncidence3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIncidence4() {
		return incidence4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncidence4(double newIncidence4) {
		incidence4 = newIncidence4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__E1:
				return getE1();
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__E2:
				return getE2();
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__E3:
				return getE3();
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__E4:
				return getE4();
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__I1:
				return getI1();
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__I2:
				return getI2();
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__I3:
				return getI3();
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__I4:
				return getI4();
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE1:
				return getIncidence1();
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE2:
				return getIncidence2();
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE3:
				return getIncidence3();
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE4:
				return getIncidence4();
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
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__E1:
				setE1((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__E2:
				setE2((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__E3:
				setE3((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__E4:
				setE4((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__I1:
				setI1((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__I2:
				setI2((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__I3:
				setI3((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__I4:
				setI4((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE1:
				setIncidence1((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE2:
				setIncidence2((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE3:
				setIncidence3((Double)newValue);
				return;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE4:
				setIncidence4((Double)newValue);
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
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__E1:
				setE1(E1_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__E2:
				setE2(E2_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__E3:
				setE3(E3_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__E4:
				setE4(E4_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__I1:
				setI1(I1_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__I2:
				setI2(I2_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__I3:
				setI3(I3_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__I4:
				setI4(I4_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE1:
				setIncidence1(INCIDENCE1_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE2:
				setIncidence2(INCIDENCE2_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE3:
				setIncidence3(INCIDENCE3_EDEFAULT);
				return;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE4:
				setIncidence4(INCIDENCE4_EDEFAULT);
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
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__E1:
				return e1 != E1_EDEFAULT;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__E2:
				return e2 != E2_EDEFAULT;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__E3:
				return e3 != E3_EDEFAULT;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__E4:
				return e4 != E4_EDEFAULT;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__I1:
				return i1 != I1_EDEFAULT;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__I2:
				return i2 != I2_EDEFAULT;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__I3:
				return i3 != I3_EDEFAULT;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__I4:
				return i4 != I4_EDEFAULT;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE1:
				return incidence1 != INCIDENCE1_EDEFAULT;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE2:
				return incidence2 != INCIDENCE2_EDEFAULT;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE3:
				return incidence3 != INCIDENCE3_EDEFAULT;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE4:
				return incidence4 != INCIDENCE4_EDEFAULT;
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
		result.append(", I1: ");
		result.append(i1);
		result.append(", I2: ");
		result.append(i2);
		result.append(", I3: ");
		result.append(i3);
		result.append(", I4: ");
		result.append(i4);
		result.append(", incidence1: ");
		result.append(incidence1);
		result.append(", incidence2: ");
		result.append(incidence2);
		result.append(", incidence3: ");
		result.append(incidence3);
		result.append(", incidence4: ");
		result.append(incidence4);
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
		DengueModelVectorLabelValue v = (DengueModelVectorLabelValue)value;
		super.set(v);

		setE1(v.getE1());
		setE2(v.getE2());
		setE3(v.getE3());
		setE4(v.getE4());
		setI1(v.getI1());
		setI2(v.getI2());
		setI3(v.getI3());
		setI4(v.getI4());
		setIncidence1(v.getIncidence1());
		setIncidence2(v.getIncidence2());
		setIncidence3(v.getIncidence3());
		setIncidence4(v.getIncidence4());

		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegrationLabelValue add(IntegrationLabelValue value) {
		DengueModelVectorLabelValue v = (DengueModelVectorLabelValue)value;
		super.add(v);

		setE1(getE1() + v.getE1());
		setE2(getE2() + v.getE2());
		setE3(getE3() + v.getE3());
		setE4(getE4() + v.getE4());
		setI1(getI1() + v.getI1());
		setI2(getI2() + v.getI2());
		setI3(getI3() + v.getI3());
		setI4(getI4() + v.getI4());
		setIncidence1(getIncidence1() + v.getIncidence1());
		setIncidence2(getIncidence2() + v.getIncidence2());
		setIncidence3(getIncidence3() + v.getIncidence3());
		setIncidence4(getIncidence4() + v.getIncidence4());

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
		setI1((double)(getI1() + value));
		setI2((double)(getI2() + value));
		setI3((double)(getI3() + value));
		setI4((double)(getI4() + value));
		setIncidence1((double)(getIncidence1() + value));
		setIncidence2((double)(getIncidence2() + value));
		setIncidence3((double)(getIncidence3() + value));
		setIncidence4((double)(getIncidence4() + value));

		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override	
	public IntegrationLabelValue sub(IntegrationLabelValue value) {
		DengueModelVectorLabelValue v = (DengueModelVectorLabelValue)value;
		super.sub(v);

		setE1(getE1() - v.getE1());
		setE2(getE2() - v.getE2());
		setE3(getE3() - v.getE3());
		setE4(getE4() - v.getE4());
		setI1(getI1() - v.getI1());
		setI2(getI2() - v.getI2());
		setI3(getI3() - v.getI3());
		setI4(getI4() - v.getI4());
		setIncidence1(getIncidence1() - v.getIncidence1());
		setIncidence2(getIncidence2() - v.getIncidence2());
		setIncidence3(getIncidence3() - v.getIncidence3());
		setIncidence4(getIncidence4() - v.getIncidence4());

		return this;	
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegrationLabelValue divide(IntegrationLabelValue value) {
		DengueModelVectorLabelValue v = (DengueModelVectorLabelValue)value;
		super.divide(v);

		setE1(getE1() / v.getE1());
		setE2(getE2() / v.getE2());
		setE3(getE3() / v.getE3());
		setE4(getE4() / v.getE4());
		setI1(getI1() / v.getI1());
		setI2(getI2() / v.getI2());
		setI3(getI3() / v.getI3());
		setI4(getI4() / v.getI4());
		setIncidence1(getIncidence1() / v.getIncidence1());
		setIncidence2(getIncidence2() / v.getIncidence2());
		setIncidence3(getIncidence3() / v.getIncidence3());
		setIncidence4(getIncidence4() / v.getIncidence4());

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
		setI1((double)(getI1() * scaleFactor));
		setI2((double)(getI2() * scaleFactor));
		setI3((double)(getI3() * scaleFactor));
		setI4((double)(getI4() * scaleFactor));
		setIncidence1((double)(getIncidence1() * scaleFactor));
		setIncidence2((double)(getIncidence2() * scaleFactor));
		setIncidence3((double)(getIncidence3() * scaleFactor));
		setIncidence4((double)(getIncidence4() * scaleFactor));

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
		setI1(Math.abs(getI1()));
		setI2(Math.abs(getI2()));
		setI3(Math.abs(getI3()));
		setI4(Math.abs(getI4()));
		setIncidence1(Math.abs(getIncidence1()));
		setIncidence2(Math.abs(getIncidence2()));
		setIncidence3(Math.abs(getIncidence3()));
		setIncidence4(Math.abs(getIncidence4()));
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
		maxValue = Math.max(maxValue, getI1());
		maxValue = Math.max(maxValue, getI2());
		maxValue = Math.max(maxValue, getI3());
		maxValue = Math.max(maxValue, getI4());
		return maxValue;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double computeDeltaAdjustment(IntegrationLabelValue value) {
		DengueModelVectorLabelValue v = (DengueModelVectorLabelValue)value;
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
		if ((double)(getI1() + v.getI1()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getI1() / getI1()));
		}
		if ((double)(getI2() + v.getI2()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getI2() / getI2()));
		}
		if ((double)(getI3() + v.getI3()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getI3() / getI3()));
		}
		if ((double)(getI4() + v.getI4()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getI4() / getI4()));
		}
		if ((double)(getIncidence1() + v.getIncidence1()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getIncidence1() / getIncidence1()));
		}
		if ((double)(getIncidence2() + v.getIncidence2()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getIncidence2() / getIncidence2()));
		}
		if ((double)(getIncidence3() + v.getIncidence3()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getIncidence3() / getIncidence3()));
		}
		if ((double)(getIncidence4() + v.getIncidence4()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getIncidence4() / getIncidence4()));
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
		setI1((double)0.0);
		setI2((double)0.0);
		setI3((double)0.0);
		setI4((double)0.0);
		setIncidence1((double)0.0);
		setIncidence2((double)0.0);
		setIncidence3((double)0.0);
		setIncidence4((double)0.0);
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
		count += (double)getI1();
		count += (double)getI2();
		count += (double)getI3();
		count += (double)getI4();

		return count;
	} // getPopulationCount

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean avoidNegative(IntegrationLabelValue value) {
		DengueModelVectorLabelValue v = (DengueModelVectorLabelValue)value;
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

		if ((double)(getI1() + v.getI1()) < 0.0) {
			adjusted = true;
			setI1(-v.getI1());
		}

		if ((double)(getI2() + v.getI2()) < 0.0) {
			adjusted = true;
			setI2(-v.getI2());
		}

		if ((double)(getI3() + v.getI3()) < 0.0) {
			adjusted = true;
			setI3(-v.getI3());
		}

		if ((double)(getI4() + v.getI4()) < 0.0) {
			adjusted = true;
			setI4(-v.getI4());
		}

		if ((double)(getIncidence1() + v.getIncidence1()) < 0.0) {
			adjusted = true;
			setIncidence1(-v.getIncidence1());
		}

		if ((double)(getIncidence2() + v.getIncidence2()) < 0.0) {
			adjusted = true;
			setIncidence2(-v.getIncidence2());
		}

		if ((double)(getIncidence3() + v.getIncidence3()) < 0.0) {
			adjusted = true;
			setIncidence3(-v.getIncidence3());
		}

		if ((double)(getIncidence4() + v.getIncidence4()) < 0.0) {
			adjusted = true;
			setIncidence4(-v.getIncidence4());
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
		DengueModelVectorLabelValue v = (DengueModelVectorLabelValue)value;
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
		if (getI1() != v.getI1()) {
			return false;
		}
		if (getI2() != v.getI2()) {
			return false;
		}
		if (getI3() != v.getI3()) {
			return false;
		}
		if (getI4() != v.getI4()) {
			return false;
		}
		if (getIncidence1() != v.getIncidence1()) {
			return false;
		}
		if (getIncidence2() != v.getIncidence2()) {
			return false;
		}
		if (getIncidence3() != v.getIncidence3()) {
			return false;
		}
		if (getIncidence4() != v.getIncidence4()) {
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
		DengueModelVectorLabelValue copy = VectorFactory.eINSTANCE.createDengueModelVectorLabelValue();
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
		setIncidence1(0.0);
		setIncidence2(0.0);
		setIncidence3(0.0);
		setIncidence4(0.0);
	}
		
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double eGetDouble(int featureID) {
		switch (featureID) {
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__E1:
				return getE1();
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__E2:
				return getE2();
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__E3:
				return getE3();
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__E4:
				return getE4();
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__I1:
				return getI1();
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__I2:
				return getI2();
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__I3:
				return getI3();
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__I4:
				return getI4();
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE1:
				return getIncidence1();
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE2:
				return getIncidence2();
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE3:
				return getIncidence3();
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE4:
				return getIncidence4();
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
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__E1:
				setE1(newValue);
				return;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__E2:
				setE2(newValue);
				return;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__E3:
				setE3(newValue);
				return;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__E4:
				setE4(newValue);
				return;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__I1:
				setI1(newValue);
				return;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__I2:
				setI2(newValue);
				return;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__I3:
				setI3(newValue);
				return;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__I4:
				setI4(newValue);
				return;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE1:
				setIncidence1(newValue);
				return;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE2:
				setIncidence2(newValue);
				return;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE3:
				setIncidence3(newValue);
				return;
			case VectorPackage.DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE4:
				setIncidence4(newValue);
				return;
		}
		
		super.eSetDouble(featureID,newValue);
	}
					

} //DengueModelVectorLabelValueImpl
