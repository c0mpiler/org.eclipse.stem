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
import org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue;
import org.eclipse.stem.diseasemodels.vector.VectorFactory;
import org.eclipse.stem.diseasemodels.vector.VectorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Dengue Model Host Label Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getI1 <em>I1</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getI2 <em>I2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getI3 <em>I3</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getI4 <em>I4</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getC1 <em>C1</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getC2 <em>C2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getC3 <em>C3</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getC4 <em>C4</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getR1 <em>R1</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getR2 <em>R2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getR3 <em>R3</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getR4 <em>R4</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getI12 <em>I12</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getI13 <em>I13</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getI14 <em>I14</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getI21 <em>I21</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getI23 <em>I23</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getI24 <em>I24</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getI31 <em>I31</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getI32 <em>I32</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getI34 <em>I34</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getI41 <em>I41</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getI42 <em>I42</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getI43 <em>I43</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getR <em>R</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getIncidence1 <em>Incidence1</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getIncidence2 <em>Incidence2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getIncidence3 <em>Incidence3</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getIncidence4 <em>Incidence4</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getIncidence12 <em>Incidence12</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getIncidence21 <em>Incidence21</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getIncidence31 <em>Incidence31</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getIncidence41 <em>Incidence41</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getIncidence13 <em>Incidence13</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getIncidence23 <em>Incidence23</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getIncidence32 <em>Incidence32</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getIncidence42 <em>Incidence42</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getIncidence14 <em>Incidence14</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getIncidence24 <em>Incidence24</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getIncidence34 <em>Incidence34</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getIncidence43 <em>Incidence43</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getDiseaseDeaths1 <em>Disease Deaths1</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getDiseaseDeaths2 <em>Disease Deaths2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getDiseaseDeaths3 <em>Disease Deaths3</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getDiseaseDeaths4 <em>Disease Deaths4</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getDiseaseDeaths12 <em>Disease Deaths12</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getDiseaseDeaths21 <em>Disease Deaths21</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getDiseaseDeaths31 <em>Disease Deaths31</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getDiseaseDeaths41 <em>Disease Deaths41</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getDiseaseDeaths13 <em>Disease Deaths13</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getDiseaseDeaths23 <em>Disease Deaths23</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getDiseaseDeaths32 <em>Disease Deaths32</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getDiseaseDeaths42 <em>Disease Deaths42</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getDiseaseDeaths14 <em>Disease Deaths14</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getDiseaseDeaths24 <em>Disease Deaths24</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getDiseaseDeaths34 <em>Disease Deaths34</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.SimpleDengueModelHostLabelValueImpl#getDiseaseDeaths43 <em>Disease Deaths43</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleDengueModelHostLabelValueImpl extends StandardDiseaseModelLabelValueImpl implements SimpleDengueModelHostLabelValue {
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
	 * The default value of the '{@link #getC1() <em>C1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC1()
	 * @generated
	 * @ordered
	 */
	protected static final double C1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getC1() <em>C1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC1()
	 * @generated
	 * @ordered
	 */
	protected double c1 = C1_EDEFAULT;

	/**
	 * The default value of the '{@link #getC2() <em>C2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC2()
	 * @generated
	 * @ordered
	 */
	protected static final double C2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getC2() <em>C2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC2()
	 * @generated
	 * @ordered
	 */
	protected double c2 = C2_EDEFAULT;

	/**
	 * The default value of the '{@link #getC3() <em>C3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC3()
	 * @generated
	 * @ordered
	 */
	protected static final double C3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getC3() <em>C3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC3()
	 * @generated
	 * @ordered
	 */
	protected double c3 = C3_EDEFAULT;

	/**
	 * The default value of the '{@link #getC4() <em>C4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC4()
	 * @generated
	 * @ordered
	 */
	protected static final double C4_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getC4() <em>C4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC4()
	 * @generated
	 * @ordered
	 */
	protected double c4 = C4_EDEFAULT;

	/**
	 * The default value of the '{@link #getR1() <em>R1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR1()
	 * @generated
	 * @ordered
	 */
	protected static final double R1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getR1() <em>R1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR1()
	 * @generated
	 * @ordered
	 */
	protected double r1 = R1_EDEFAULT;

	/**
	 * The default value of the '{@link #getR2() <em>R2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR2()
	 * @generated
	 * @ordered
	 */
	protected static final double R2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getR2() <em>R2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR2()
	 * @generated
	 * @ordered
	 */
	protected double r2 = R2_EDEFAULT;

	/**
	 * The default value of the '{@link #getR3() <em>R3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR3()
	 * @generated
	 * @ordered
	 */
	protected static final double R3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getR3() <em>R3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR3()
	 * @generated
	 * @ordered
	 */
	protected double r3 = R3_EDEFAULT;

	/**
	 * The default value of the '{@link #getR4() <em>R4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR4()
	 * @generated
	 * @ordered
	 */
	protected static final double R4_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getR4() <em>R4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR4()
	 * @generated
	 * @ordered
	 */
	protected double r4 = R4_EDEFAULT;

	/**
	 * The default value of the '{@link #getI12() <em>I12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI12()
	 * @generated
	 * @ordered
	 */
	protected static final double I12_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getI12() <em>I12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI12()
	 * @generated
	 * @ordered
	 */
	protected double i12 = I12_EDEFAULT;

	/**
	 * The default value of the '{@link #getI13() <em>I13</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI13()
	 * @generated
	 * @ordered
	 */
	protected static final double I13_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getI13() <em>I13</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI13()
	 * @generated
	 * @ordered
	 */
	protected double i13 = I13_EDEFAULT;

	/**
	 * The default value of the '{@link #getI14() <em>I14</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI14()
	 * @generated
	 * @ordered
	 */
	protected static final double I14_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getI14() <em>I14</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI14()
	 * @generated
	 * @ordered
	 */
	protected double i14 = I14_EDEFAULT;

	/**
	 * The default value of the '{@link #getI21() <em>I21</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI21()
	 * @generated
	 * @ordered
	 */
	protected static final double I21_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getI21() <em>I21</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI21()
	 * @generated
	 * @ordered
	 */
	protected double i21 = I21_EDEFAULT;

	/**
	 * The default value of the '{@link #getI23() <em>I23</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI23()
	 * @generated
	 * @ordered
	 */
	protected static final double I23_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getI23() <em>I23</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI23()
	 * @generated
	 * @ordered
	 */
	protected double i23 = I23_EDEFAULT;

	/**
	 * The default value of the '{@link #getI24() <em>I24</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI24()
	 * @generated
	 * @ordered
	 */
	protected static final double I24_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getI24() <em>I24</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI24()
	 * @generated
	 * @ordered
	 */
	protected double i24 = I24_EDEFAULT;

	/**
	 * The default value of the '{@link #getI31() <em>I31</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI31()
	 * @generated
	 * @ordered
	 */
	protected static final double I31_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getI31() <em>I31</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI31()
	 * @generated
	 * @ordered
	 */
	protected double i31 = I31_EDEFAULT;

	/**
	 * The default value of the '{@link #getI32() <em>I32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI32()
	 * @generated
	 * @ordered
	 */
	protected static final double I32_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getI32() <em>I32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI32()
	 * @generated
	 * @ordered
	 */
	protected double i32 = I32_EDEFAULT;

	/**
	 * The default value of the '{@link #getI34() <em>I34</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI34()
	 * @generated
	 * @ordered
	 */
	protected static final double I34_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getI34() <em>I34</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI34()
	 * @generated
	 * @ordered
	 */
	protected double i34 = I34_EDEFAULT;

	/**
	 * The default value of the '{@link #getI41() <em>I41</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI41()
	 * @generated
	 * @ordered
	 */
	protected static final double I41_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getI41() <em>I41</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI41()
	 * @generated
	 * @ordered
	 */
	protected double i41 = I41_EDEFAULT;

	/**
	 * The default value of the '{@link #getI42() <em>I42</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI42()
	 * @generated
	 * @ordered
	 */
	protected static final double I42_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getI42() <em>I42</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI42()
	 * @generated
	 * @ordered
	 */
	protected double i42 = I42_EDEFAULT;

	/**
	 * The default value of the '{@link #getI43() <em>I43</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI43()
	 * @generated
	 * @ordered
	 */
	protected static final double I43_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getI43() <em>I43</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI43()
	 * @generated
	 * @ordered
	 */
	protected double i43 = I43_EDEFAULT;

	/**
	 * The default value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected static final double R_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected double r = R_EDEFAULT;

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
	 * The default value of the '{@link #getIncidence12() <em>Incidence12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence12()
	 * @generated
	 * @ordered
	 */
	protected static final double INCIDENCE12_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIncidence12() <em>Incidence12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence12()
	 * @generated
	 * @ordered
	 */
	protected double incidence12 = INCIDENCE12_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncidence21() <em>Incidence21</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence21()
	 * @generated
	 * @ordered
	 */
	protected static final double INCIDENCE21_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIncidence21() <em>Incidence21</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence21()
	 * @generated
	 * @ordered
	 */
	protected double incidence21 = INCIDENCE21_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncidence31() <em>Incidence31</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence31()
	 * @generated
	 * @ordered
	 */
	protected static final double INCIDENCE31_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIncidence31() <em>Incidence31</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence31()
	 * @generated
	 * @ordered
	 */
	protected double incidence31 = INCIDENCE31_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncidence41() <em>Incidence41</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence41()
	 * @generated
	 * @ordered
	 */
	protected static final double INCIDENCE41_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIncidence41() <em>Incidence41</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence41()
	 * @generated
	 * @ordered
	 */
	protected double incidence41 = INCIDENCE41_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncidence13() <em>Incidence13</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence13()
	 * @generated
	 * @ordered
	 */
	protected static final double INCIDENCE13_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIncidence13() <em>Incidence13</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence13()
	 * @generated
	 * @ordered
	 */
	protected double incidence13 = INCIDENCE13_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncidence23() <em>Incidence23</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence23()
	 * @generated
	 * @ordered
	 */
	protected static final double INCIDENCE23_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIncidence23() <em>Incidence23</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence23()
	 * @generated
	 * @ordered
	 */
	protected double incidence23 = INCIDENCE23_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncidence32() <em>Incidence32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence32()
	 * @generated
	 * @ordered
	 */
	protected static final double INCIDENCE32_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIncidence32() <em>Incidence32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence32()
	 * @generated
	 * @ordered
	 */
	protected double incidence32 = INCIDENCE32_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncidence42() <em>Incidence42</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence42()
	 * @generated
	 * @ordered
	 */
	protected static final double INCIDENCE42_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIncidence42() <em>Incidence42</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence42()
	 * @generated
	 * @ordered
	 */
	protected double incidence42 = INCIDENCE42_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncidence14() <em>Incidence14</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence14()
	 * @generated
	 * @ordered
	 */
	protected static final double INCIDENCE14_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIncidence14() <em>Incidence14</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence14()
	 * @generated
	 * @ordered
	 */
	protected double incidence14 = INCIDENCE14_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncidence24() <em>Incidence24</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence24()
	 * @generated
	 * @ordered
	 */
	protected static final double INCIDENCE24_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIncidence24() <em>Incidence24</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence24()
	 * @generated
	 * @ordered
	 */
	protected double incidence24 = INCIDENCE24_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncidence34() <em>Incidence34</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence34()
	 * @generated
	 * @ordered
	 */
	protected static final double INCIDENCE34_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIncidence34() <em>Incidence34</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence34()
	 * @generated
	 * @ordered
	 */
	protected double incidence34 = INCIDENCE34_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncidence43() <em>Incidence43</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence43()
	 * @generated
	 * @ordered
	 */
	protected static final double INCIDENCE43_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIncidence43() <em>Incidence43</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidence43()
	 * @generated
	 * @ordered
	 */
	protected double incidence43 = INCIDENCE43_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiseaseDeaths1() <em>Disease Deaths1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseDeaths1()
	 * @generated
	 * @ordered
	 */
	protected static final double DISEASE_DEATHS1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiseaseDeaths1() <em>Disease Deaths1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseDeaths1()
	 * @generated
	 * @ordered
	 */
	protected double diseaseDeaths1 = DISEASE_DEATHS1_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiseaseDeaths2() <em>Disease Deaths2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseDeaths2()
	 * @generated
	 * @ordered
	 */
	protected static final double DISEASE_DEATHS2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiseaseDeaths2() <em>Disease Deaths2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseDeaths2()
	 * @generated
	 * @ordered
	 */
	protected double diseaseDeaths2 = DISEASE_DEATHS2_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiseaseDeaths3() <em>Disease Deaths3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseDeaths3()
	 * @generated
	 * @ordered
	 */
	protected static final double DISEASE_DEATHS3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiseaseDeaths3() <em>Disease Deaths3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseDeaths3()
	 * @generated
	 * @ordered
	 */
	protected double diseaseDeaths3 = DISEASE_DEATHS3_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiseaseDeaths4() <em>Disease Deaths4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseDeaths4()
	 * @generated
	 * @ordered
	 */
	protected static final double DISEASE_DEATHS4_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiseaseDeaths4() <em>Disease Deaths4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseDeaths4()
	 * @generated
	 * @ordered
	 */
	protected double diseaseDeaths4 = DISEASE_DEATHS4_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiseaseDeaths12() <em>Disease Deaths12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseDeaths12()
	 * @generated
	 * @ordered
	 */
	protected static final double DISEASE_DEATHS12_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiseaseDeaths12() <em>Disease Deaths12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseDeaths12()
	 * @generated
	 * @ordered
	 */
	protected double diseaseDeaths12 = DISEASE_DEATHS12_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiseaseDeaths21() <em>Disease Deaths21</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseDeaths21()
	 * @generated
	 * @ordered
	 */
	protected static final double DISEASE_DEATHS21_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiseaseDeaths21() <em>Disease Deaths21</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseDeaths21()
	 * @generated
	 * @ordered
	 */
	protected double diseaseDeaths21 = DISEASE_DEATHS21_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiseaseDeaths31() <em>Disease Deaths31</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseDeaths31()
	 * @generated
	 * @ordered
	 */
	protected static final double DISEASE_DEATHS31_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiseaseDeaths31() <em>Disease Deaths31</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseDeaths31()
	 * @generated
	 * @ordered
	 */
	protected double diseaseDeaths31 = DISEASE_DEATHS31_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiseaseDeaths41() <em>Disease Deaths41</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseDeaths41()
	 * @generated
	 * @ordered
	 */
	protected static final double DISEASE_DEATHS41_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiseaseDeaths41() <em>Disease Deaths41</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseDeaths41()
	 * @generated
	 * @ordered
	 */
	protected double diseaseDeaths41 = DISEASE_DEATHS41_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiseaseDeaths13() <em>Disease Deaths13</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseDeaths13()
	 * @generated
	 * @ordered
	 */
	protected static final double DISEASE_DEATHS13_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiseaseDeaths13() <em>Disease Deaths13</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseDeaths13()
	 * @generated
	 * @ordered
	 */
	protected double diseaseDeaths13 = DISEASE_DEATHS13_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiseaseDeaths23() <em>Disease Deaths23</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseDeaths23()
	 * @generated
	 * @ordered
	 */
	protected static final double DISEASE_DEATHS23_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiseaseDeaths23() <em>Disease Deaths23</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseDeaths23()
	 * @generated
	 * @ordered
	 */
	protected double diseaseDeaths23 = DISEASE_DEATHS23_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiseaseDeaths32() <em>Disease Deaths32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseDeaths32()
	 * @generated
	 * @ordered
	 */
	protected static final double DISEASE_DEATHS32_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiseaseDeaths32() <em>Disease Deaths32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseDeaths32()
	 * @generated
	 * @ordered
	 */
	protected double diseaseDeaths32 = DISEASE_DEATHS32_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiseaseDeaths42() <em>Disease Deaths42</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseDeaths42()
	 * @generated
	 * @ordered
	 */
	protected static final double DISEASE_DEATHS42_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiseaseDeaths42() <em>Disease Deaths42</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseDeaths42()
	 * @generated
	 * @ordered
	 */
	protected double diseaseDeaths42 = DISEASE_DEATHS42_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiseaseDeaths14() <em>Disease Deaths14</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseDeaths14()
	 * @generated
	 * @ordered
	 */
	protected static final double DISEASE_DEATHS14_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiseaseDeaths14() <em>Disease Deaths14</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseDeaths14()
	 * @generated
	 * @ordered
	 */
	protected double diseaseDeaths14 = DISEASE_DEATHS14_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiseaseDeaths24() <em>Disease Deaths24</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseDeaths24()
	 * @generated
	 * @ordered
	 */
	protected static final double DISEASE_DEATHS24_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiseaseDeaths24() <em>Disease Deaths24</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseDeaths24()
	 * @generated
	 * @ordered
	 */
	protected double diseaseDeaths24 = DISEASE_DEATHS24_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiseaseDeaths34() <em>Disease Deaths34</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseDeaths34()
	 * @generated
	 * @ordered
	 */
	protected static final double DISEASE_DEATHS34_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiseaseDeaths34() <em>Disease Deaths34</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseDeaths34()
	 * @generated
	 * @ordered
	 */
	protected double diseaseDeaths34 = DISEASE_DEATHS34_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiseaseDeaths43() <em>Disease Deaths43</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseDeaths43()
	 * @generated
	 * @ordered
	 */
	protected static final double DISEASE_DEATHS43_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiseaseDeaths43() <em>Disease Deaths43</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseDeaths43()
	 * @generated
	 * @ordered
	 */
	protected double diseaseDeaths43 = DISEASE_DEATHS43_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleDengueModelHostLabelValueImpl() {
		super();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE;
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
	public double getC1() {
		return c1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC1(double newC1) {
		c1 = newC1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getC2() {
		return c2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC2(double newC2) {
		c2 = newC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getC3() {
		return c3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC3(double newC3) {
		c3 = newC3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getC4() {
		return c4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC4(double newC4) {
		c4 = newC4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getR1() {
		return r1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR1(double newR1) {
		r1 = newR1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getR2() {
		return r2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR2(double newR2) {
		r2 = newR2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getR3() {
		return r3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR3(double newR3) {
		r3 = newR3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getR4() {
		return r4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR4(double newR4) {
		r4 = newR4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getI12() {
		return i12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setI12(double newI12) {
		i12 = newI12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getI13() {
		return i13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setI13(double newI13) {
		i13 = newI13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getI14() {
		return i14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setI14(double newI14) {
		i14 = newI14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getI21() {
		return i21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setI21(double newI21) {
		i21 = newI21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getI23() {
		return i23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setI23(double newI23) {
		i23 = newI23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getI24() {
		return i24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setI24(double newI24) {
		i24 = newI24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getI31() {
		return i31;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setI31(double newI31) {
		i31 = newI31;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getI32() {
		return i32;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setI32(double newI32) {
		i32 = newI32;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getI34() {
		return i34;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setI34(double newI34) {
		i34 = newI34;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getI41() {
		return i41;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setI41(double newI41) {
		i41 = newI41;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getI42() {
		return i42;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setI42(double newI42) {
		i42 = newI42;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getI43() {
		return i43;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setI43(double newI43) {
		i43 = newI43;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getR() {
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR(double newR) {
		r = newR;
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
	public double getIncidence12() {
		return incidence12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncidence12(double newIncidence12) {
		incidence12 = newIncidence12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIncidence21() {
		return incidence21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncidence21(double newIncidence21) {
		incidence21 = newIncidence21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIncidence31() {
		return incidence31;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncidence31(double newIncidence31) {
		incidence31 = newIncidence31;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIncidence41() {
		return incidence41;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncidence41(double newIncidence41) {
		incidence41 = newIncidence41;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIncidence13() {
		return incidence13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncidence13(double newIncidence13) {
		incidence13 = newIncidence13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIncidence23() {
		return incidence23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncidence23(double newIncidence23) {
		incidence23 = newIncidence23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIncidence32() {
		return incidence32;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncidence32(double newIncidence32) {
		incidence32 = newIncidence32;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIncidence42() {
		return incidence42;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncidence42(double newIncidence42) {
		incidence42 = newIncidence42;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIncidence14() {
		return incidence14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncidence14(double newIncidence14) {
		incidence14 = newIncidence14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIncidence24() {
		return incidence24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncidence24(double newIncidence24) {
		incidence24 = newIncidence24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIncidence34() {
		return incidence34;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncidence34(double newIncidence34) {
		incidence34 = newIncidence34;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIncidence43() {
		return incidence43;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncidence43(double newIncidence43) {
		incidence43 = newIncidence43;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDiseaseDeaths1() {
		return diseaseDeaths1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiseaseDeaths1(double newDiseaseDeaths1) {
		diseaseDeaths1 = newDiseaseDeaths1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDiseaseDeaths2() {
		return diseaseDeaths2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiseaseDeaths2(double newDiseaseDeaths2) {
		diseaseDeaths2 = newDiseaseDeaths2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDiseaseDeaths3() {
		return diseaseDeaths3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiseaseDeaths3(double newDiseaseDeaths3) {
		diseaseDeaths3 = newDiseaseDeaths3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDiseaseDeaths4() {
		return diseaseDeaths4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiseaseDeaths4(double newDiseaseDeaths4) {
		diseaseDeaths4 = newDiseaseDeaths4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDiseaseDeaths12() {
		return diseaseDeaths12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiseaseDeaths12(double newDiseaseDeaths12) {
		diseaseDeaths12 = newDiseaseDeaths12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDiseaseDeaths21() {
		return diseaseDeaths21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiseaseDeaths21(double newDiseaseDeaths21) {
		diseaseDeaths21 = newDiseaseDeaths21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDiseaseDeaths31() {
		return diseaseDeaths31;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiseaseDeaths31(double newDiseaseDeaths31) {
		diseaseDeaths31 = newDiseaseDeaths31;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDiseaseDeaths41() {
		return diseaseDeaths41;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiseaseDeaths41(double newDiseaseDeaths41) {
		diseaseDeaths41 = newDiseaseDeaths41;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDiseaseDeaths13() {
		return diseaseDeaths13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiseaseDeaths13(double newDiseaseDeaths13) {
		diseaseDeaths13 = newDiseaseDeaths13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDiseaseDeaths23() {
		return diseaseDeaths23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiseaseDeaths23(double newDiseaseDeaths23) {
		diseaseDeaths23 = newDiseaseDeaths23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDiseaseDeaths32() {
		return diseaseDeaths32;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiseaseDeaths32(double newDiseaseDeaths32) {
		diseaseDeaths32 = newDiseaseDeaths32;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDiseaseDeaths42() {
		return diseaseDeaths42;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiseaseDeaths42(double newDiseaseDeaths42) {
		diseaseDeaths42 = newDiseaseDeaths42;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDiseaseDeaths14() {
		return diseaseDeaths14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiseaseDeaths14(double newDiseaseDeaths14) {
		diseaseDeaths14 = newDiseaseDeaths14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDiseaseDeaths24() {
		return diseaseDeaths24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiseaseDeaths24(double newDiseaseDeaths24) {
		diseaseDeaths24 = newDiseaseDeaths24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDiseaseDeaths34() {
		return diseaseDeaths34;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiseaseDeaths34(double newDiseaseDeaths34) {
		diseaseDeaths34 = newDiseaseDeaths34;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDiseaseDeaths43() {
		return diseaseDeaths43;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiseaseDeaths43(double newDiseaseDeaths43) {
		diseaseDeaths43 = newDiseaseDeaths43;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I1:
				return getI1();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I2:
				return getI2();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I3:
				return getI3();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I4:
				return getI4();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C1:
				return getC1();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C2:
				return getC2();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C3:
				return getC3();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C4:
				return getC4();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R1:
				return getR1();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R2:
				return getR2();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R3:
				return getR3();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R4:
				return getR4();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I12:
				return getI12();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I13:
				return getI13();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I14:
				return getI14();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I21:
				return getI21();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I23:
				return getI23();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I24:
				return getI24();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I31:
				return getI31();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I32:
				return getI32();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I34:
				return getI34();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I41:
				return getI41();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I42:
				return getI42();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I43:
				return getI43();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R:
				return getR();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE1:
				return getIncidence1();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE2:
				return getIncidence2();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE3:
				return getIncidence3();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE4:
				return getIncidence4();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE12:
				return getIncidence12();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE21:
				return getIncidence21();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE31:
				return getIncidence31();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE41:
				return getIncidence41();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE13:
				return getIncidence13();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE23:
				return getIncidence23();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE32:
				return getIncidence32();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE42:
				return getIncidence42();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE14:
				return getIncidence14();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE24:
				return getIncidence24();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE34:
				return getIncidence34();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE43:
				return getIncidence43();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS1:
				return getDiseaseDeaths1();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS2:
				return getDiseaseDeaths2();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS3:
				return getDiseaseDeaths3();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS4:
				return getDiseaseDeaths4();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS12:
				return getDiseaseDeaths12();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS21:
				return getDiseaseDeaths21();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS31:
				return getDiseaseDeaths31();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS41:
				return getDiseaseDeaths41();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS13:
				return getDiseaseDeaths13();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS23:
				return getDiseaseDeaths23();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS32:
				return getDiseaseDeaths32();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS42:
				return getDiseaseDeaths42();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS14:
				return getDiseaseDeaths14();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS24:
				return getDiseaseDeaths24();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS34:
				return getDiseaseDeaths34();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS43:
				return getDiseaseDeaths43();
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
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I1:
				setI1((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I2:
				setI2((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I3:
				setI3((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I4:
				setI4((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C1:
				setC1((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C2:
				setC2((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C3:
				setC3((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C4:
				setC4((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R1:
				setR1((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R2:
				setR2((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R3:
				setR3((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R4:
				setR4((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I12:
				setI12((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I13:
				setI13((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I14:
				setI14((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I21:
				setI21((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I23:
				setI23((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I24:
				setI24((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I31:
				setI31((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I32:
				setI32((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I34:
				setI34((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I41:
				setI41((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I42:
				setI42((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I43:
				setI43((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R:
				setR((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE1:
				setIncidence1((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE2:
				setIncidence2((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE3:
				setIncidence3((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE4:
				setIncidence4((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE12:
				setIncidence12((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE21:
				setIncidence21((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE31:
				setIncidence31((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE41:
				setIncidence41((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE13:
				setIncidence13((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE23:
				setIncidence23((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE32:
				setIncidence32((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE42:
				setIncidence42((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE14:
				setIncidence14((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE24:
				setIncidence24((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE34:
				setIncidence34((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE43:
				setIncidence43((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS1:
				setDiseaseDeaths1((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS2:
				setDiseaseDeaths2((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS3:
				setDiseaseDeaths3((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS4:
				setDiseaseDeaths4((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS12:
				setDiseaseDeaths12((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS21:
				setDiseaseDeaths21((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS31:
				setDiseaseDeaths31((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS41:
				setDiseaseDeaths41((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS13:
				setDiseaseDeaths13((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS23:
				setDiseaseDeaths23((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS32:
				setDiseaseDeaths32((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS42:
				setDiseaseDeaths42((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS14:
				setDiseaseDeaths14((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS24:
				setDiseaseDeaths24((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS34:
				setDiseaseDeaths34((Double)newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS43:
				setDiseaseDeaths43((Double)newValue);
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
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I1:
				setI1(I1_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I2:
				setI2(I2_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I3:
				setI3(I3_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I4:
				setI4(I4_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C1:
				setC1(C1_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C2:
				setC2(C2_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C3:
				setC3(C3_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C4:
				setC4(C4_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R1:
				setR1(R1_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R2:
				setR2(R2_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R3:
				setR3(R3_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R4:
				setR4(R4_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I12:
				setI12(I12_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I13:
				setI13(I13_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I14:
				setI14(I14_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I21:
				setI21(I21_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I23:
				setI23(I23_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I24:
				setI24(I24_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I31:
				setI31(I31_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I32:
				setI32(I32_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I34:
				setI34(I34_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I41:
				setI41(I41_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I42:
				setI42(I42_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I43:
				setI43(I43_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R:
				setR(R_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE1:
				setIncidence1(INCIDENCE1_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE2:
				setIncidence2(INCIDENCE2_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE3:
				setIncidence3(INCIDENCE3_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE4:
				setIncidence4(INCIDENCE4_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE12:
				setIncidence12(INCIDENCE12_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE21:
				setIncidence21(INCIDENCE21_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE31:
				setIncidence31(INCIDENCE31_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE41:
				setIncidence41(INCIDENCE41_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE13:
				setIncidence13(INCIDENCE13_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE23:
				setIncidence23(INCIDENCE23_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE32:
				setIncidence32(INCIDENCE32_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE42:
				setIncidence42(INCIDENCE42_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE14:
				setIncidence14(INCIDENCE14_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE24:
				setIncidence24(INCIDENCE24_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE34:
				setIncidence34(INCIDENCE34_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE43:
				setIncidence43(INCIDENCE43_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS1:
				setDiseaseDeaths1(DISEASE_DEATHS1_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS2:
				setDiseaseDeaths2(DISEASE_DEATHS2_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS3:
				setDiseaseDeaths3(DISEASE_DEATHS3_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS4:
				setDiseaseDeaths4(DISEASE_DEATHS4_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS12:
				setDiseaseDeaths12(DISEASE_DEATHS12_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS21:
				setDiseaseDeaths21(DISEASE_DEATHS21_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS31:
				setDiseaseDeaths31(DISEASE_DEATHS31_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS41:
				setDiseaseDeaths41(DISEASE_DEATHS41_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS13:
				setDiseaseDeaths13(DISEASE_DEATHS13_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS23:
				setDiseaseDeaths23(DISEASE_DEATHS23_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS32:
				setDiseaseDeaths32(DISEASE_DEATHS32_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS42:
				setDiseaseDeaths42(DISEASE_DEATHS42_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS14:
				setDiseaseDeaths14(DISEASE_DEATHS14_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS24:
				setDiseaseDeaths24(DISEASE_DEATHS24_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS34:
				setDiseaseDeaths34(DISEASE_DEATHS34_EDEFAULT);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS43:
				setDiseaseDeaths43(DISEASE_DEATHS43_EDEFAULT);
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
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I1:
				return i1 != I1_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I2:
				return i2 != I2_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I3:
				return i3 != I3_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I4:
				return i4 != I4_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C1:
				return c1 != C1_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C2:
				return c2 != C2_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C3:
				return c3 != C3_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C4:
				return c4 != C4_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R1:
				return r1 != R1_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R2:
				return r2 != R2_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R3:
				return r3 != R3_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R4:
				return r4 != R4_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I12:
				return i12 != I12_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I13:
				return i13 != I13_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I14:
				return i14 != I14_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I21:
				return i21 != I21_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I23:
				return i23 != I23_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I24:
				return i24 != I24_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I31:
				return i31 != I31_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I32:
				return i32 != I32_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I34:
				return i34 != I34_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I41:
				return i41 != I41_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I42:
				return i42 != I42_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I43:
				return i43 != I43_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R:
				return r != R_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE1:
				return incidence1 != INCIDENCE1_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE2:
				return incidence2 != INCIDENCE2_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE3:
				return incidence3 != INCIDENCE3_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE4:
				return incidence4 != INCIDENCE4_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE12:
				return incidence12 != INCIDENCE12_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE21:
				return incidence21 != INCIDENCE21_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE31:
				return incidence31 != INCIDENCE31_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE41:
				return incidence41 != INCIDENCE41_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE13:
				return incidence13 != INCIDENCE13_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE23:
				return incidence23 != INCIDENCE23_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE32:
				return incidence32 != INCIDENCE32_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE42:
				return incidence42 != INCIDENCE42_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE14:
				return incidence14 != INCIDENCE14_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE24:
				return incidence24 != INCIDENCE24_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE34:
				return incidence34 != INCIDENCE34_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE43:
				return incidence43 != INCIDENCE43_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS1:
				return diseaseDeaths1 != DISEASE_DEATHS1_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS2:
				return diseaseDeaths2 != DISEASE_DEATHS2_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS3:
				return diseaseDeaths3 != DISEASE_DEATHS3_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS4:
				return diseaseDeaths4 != DISEASE_DEATHS4_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS12:
				return diseaseDeaths12 != DISEASE_DEATHS12_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS21:
				return diseaseDeaths21 != DISEASE_DEATHS21_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS31:
				return diseaseDeaths31 != DISEASE_DEATHS31_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS41:
				return diseaseDeaths41 != DISEASE_DEATHS41_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS13:
				return diseaseDeaths13 != DISEASE_DEATHS13_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS23:
				return diseaseDeaths23 != DISEASE_DEATHS23_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS32:
				return diseaseDeaths32 != DISEASE_DEATHS32_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS42:
				return diseaseDeaths42 != DISEASE_DEATHS42_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS14:
				return diseaseDeaths14 != DISEASE_DEATHS14_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS24:
				return diseaseDeaths24 != DISEASE_DEATHS24_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS34:
				return diseaseDeaths34 != DISEASE_DEATHS34_EDEFAULT;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS43:
				return diseaseDeaths43 != DISEASE_DEATHS43_EDEFAULT;
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
		result.append(" (I1: ");
		result.append(i1);
		result.append(", I2: ");
		result.append(i2);
		result.append(", I3: ");
		result.append(i3);
		result.append(", I4: ");
		result.append(i4);
		result.append(", C1: ");
		result.append(c1);
		result.append(", C2: ");
		result.append(c2);
		result.append(", C3: ");
		result.append(c3);
		result.append(", C4: ");
		result.append(c4);
		result.append(", R1: ");
		result.append(r1);
		result.append(", R2: ");
		result.append(r2);
		result.append(", R3: ");
		result.append(r3);
		result.append(", R4: ");
		result.append(r4);
		result.append(", I12: ");
		result.append(i12);
		result.append(", I13: ");
		result.append(i13);
		result.append(", I14: ");
		result.append(i14);
		result.append(", I21: ");
		result.append(i21);
		result.append(", I23: ");
		result.append(i23);
		result.append(", I24: ");
		result.append(i24);
		result.append(", I31: ");
		result.append(i31);
		result.append(", I32: ");
		result.append(i32);
		result.append(", I34: ");
		result.append(i34);
		result.append(", I41: ");
		result.append(i41);
		result.append(", I42: ");
		result.append(i42);
		result.append(", I43: ");
		result.append(i43);
		result.append(", R: ");
		result.append(r);
		result.append(", incidence1: ");
		result.append(incidence1);
		result.append(", incidence2: ");
		result.append(incidence2);
		result.append(", incidence3: ");
		result.append(incidence3);
		result.append(", incidence4: ");
		result.append(incidence4);
		result.append(", incidence12: ");
		result.append(incidence12);
		result.append(", incidence21: ");
		result.append(incidence21);
		result.append(", incidence31: ");
		result.append(incidence31);
		result.append(", incidence41: ");
		result.append(incidence41);
		result.append(", incidence13: ");
		result.append(incidence13);
		result.append(", incidence23: ");
		result.append(incidence23);
		result.append(", incidence32: ");
		result.append(incidence32);
		result.append(", incidence42: ");
		result.append(incidence42);
		result.append(", incidence14: ");
		result.append(incidence14);
		result.append(", incidence24: ");
		result.append(incidence24);
		result.append(", incidence34: ");
		result.append(incidence34);
		result.append(", incidence43: ");
		result.append(incidence43);
		result.append(", diseaseDeaths1: ");
		result.append(diseaseDeaths1);
		result.append(", diseaseDeaths2: ");
		result.append(diseaseDeaths2);
		result.append(", diseaseDeaths3: ");
		result.append(diseaseDeaths3);
		result.append(", diseaseDeaths4: ");
		result.append(diseaseDeaths4);
		result.append(", diseaseDeaths12: ");
		result.append(diseaseDeaths12);
		result.append(", diseaseDeaths21: ");
		result.append(diseaseDeaths21);
		result.append(", diseaseDeaths31: ");
		result.append(diseaseDeaths31);
		result.append(", diseaseDeaths41: ");
		result.append(diseaseDeaths41);
		result.append(", diseaseDeaths13: ");
		result.append(diseaseDeaths13);
		result.append(", diseaseDeaths23: ");
		result.append(diseaseDeaths23);
		result.append(", diseaseDeaths32: ");
		result.append(diseaseDeaths32);
		result.append(", diseaseDeaths42: ");
		result.append(diseaseDeaths42);
		result.append(", diseaseDeaths14: ");
		result.append(diseaseDeaths14);
		result.append(", diseaseDeaths24: ");
		result.append(diseaseDeaths24);
		result.append(", diseaseDeaths34: ");
		result.append(diseaseDeaths34);
		result.append(", diseaseDeaths43: ");
		result.append(diseaseDeaths43);
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
		SimpleDengueModelHostLabelValue v = (SimpleDengueModelHostLabelValue)value;
		super.set(v);

		setI1(v.getI1());
		setI2(v.getI2());
		setI3(v.getI3());
		setI4(v.getI4());
		setC1(v.getC1());
		setC2(v.getC2());
		setC3(v.getC3());
		setC4(v.getC4());
		setR1(v.getR1());
		setR2(v.getR2());
		setR3(v.getR3());
		setR4(v.getR4());
		setI12(v.getI12());
		setI13(v.getI13());
		setI14(v.getI14());
		setI21(v.getI21());
		setI23(v.getI23());
		setI24(v.getI24());
		setI31(v.getI31());
		setI32(v.getI32());
		setI34(v.getI34());
		setI41(v.getI41());
		setI42(v.getI42());
		setI43(v.getI43());
		setR(v.getR());
		setIncidence1(v.getIncidence1());
		setIncidence2(v.getIncidence2());
		setIncidence3(v.getIncidence3());
		setIncidence4(v.getIncidence4());
		setIncidence12(v.getIncidence12());
		setIncidence21(v.getIncidence21());
		setIncidence31(v.getIncidence31());
		setIncidence41(v.getIncidence41());
		setIncidence13(v.getIncidence13());
		setIncidence23(v.getIncidence23());
		setIncidence32(v.getIncidence32());
		setIncidence42(v.getIncidence42());
		setIncidence14(v.getIncidence14());
		setIncidence24(v.getIncidence24());
		setIncidence34(v.getIncidence34());
		setIncidence43(v.getIncidence43());
		setDiseaseDeaths1(v.getDiseaseDeaths1());
		setDiseaseDeaths2(v.getDiseaseDeaths2());
		setDiseaseDeaths3(v.getDiseaseDeaths3());
		setDiseaseDeaths4(v.getDiseaseDeaths4());
		setDiseaseDeaths12(v.getDiseaseDeaths12());
		setDiseaseDeaths21(v.getDiseaseDeaths21());
		setDiseaseDeaths31(v.getDiseaseDeaths31());
		setDiseaseDeaths41(v.getDiseaseDeaths41());
		setDiseaseDeaths13(v.getDiseaseDeaths13());
		setDiseaseDeaths23(v.getDiseaseDeaths23());
		setDiseaseDeaths32(v.getDiseaseDeaths32());
		setDiseaseDeaths42(v.getDiseaseDeaths42());
		setDiseaseDeaths14(v.getDiseaseDeaths14());
		setDiseaseDeaths24(v.getDiseaseDeaths24());
		setDiseaseDeaths34(v.getDiseaseDeaths34());
		setDiseaseDeaths43(v.getDiseaseDeaths43());

		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegrationLabelValue add(IntegrationLabelValue value) {
		SimpleDengueModelHostLabelValue v = (SimpleDengueModelHostLabelValue)value;
		super.add(v);

		setI1(getI1() + v.getI1());
		setI2(getI2() + v.getI2());
		setI3(getI3() + v.getI3());
		setI4(getI4() + v.getI4());
		setC1(getC1() + v.getC1());
		setC2(getC2() + v.getC2());
		setC3(getC3() + v.getC3());
		setC4(getC4() + v.getC4());
		setR1(getR1() + v.getR1());
		setR2(getR2() + v.getR2());
		setR3(getR3() + v.getR3());
		setR4(getR4() + v.getR4());
		setI12(getI12() + v.getI12());
		setI13(getI13() + v.getI13());
		setI14(getI14() + v.getI14());
		setI21(getI21() + v.getI21());
		setI23(getI23() + v.getI23());
		setI24(getI24() + v.getI24());
		setI31(getI31() + v.getI31());
		setI32(getI32() + v.getI32());
		setI34(getI34() + v.getI34());
		setI41(getI41() + v.getI41());
		setI42(getI42() + v.getI42());
		setI43(getI43() + v.getI43());
		setR(getR() + v.getR());
		setIncidence1(getIncidence1() + v.getIncidence1());
		setIncidence2(getIncidence2() + v.getIncidence2());
		setIncidence3(getIncidence3() + v.getIncidence3());
		setIncidence4(getIncidence4() + v.getIncidence4());
		setIncidence12(getIncidence12() + v.getIncidence12());
		setIncidence21(getIncidence21() + v.getIncidence21());
		setIncidence31(getIncidence31() + v.getIncidence31());
		setIncidence41(getIncidence41() + v.getIncidence41());
		setIncidence13(getIncidence13() + v.getIncidence13());
		setIncidence23(getIncidence23() + v.getIncidence23());
		setIncidence32(getIncidence32() + v.getIncidence32());
		setIncidence42(getIncidence42() + v.getIncidence42());
		setIncidence14(getIncidence14() + v.getIncidence14());
		setIncidence24(getIncidence24() + v.getIncidence24());
		setIncidence34(getIncidence34() + v.getIncidence34());
		setIncidence43(getIncidence43() + v.getIncidence43());
		setDiseaseDeaths1(getDiseaseDeaths1() + v.getDiseaseDeaths1());
		setDiseaseDeaths2(getDiseaseDeaths2() + v.getDiseaseDeaths2());
		setDiseaseDeaths3(getDiseaseDeaths3() + v.getDiseaseDeaths3());
		setDiseaseDeaths4(getDiseaseDeaths4() + v.getDiseaseDeaths4());
		setDiseaseDeaths12(getDiseaseDeaths12() + v.getDiseaseDeaths12());
		setDiseaseDeaths21(getDiseaseDeaths21() + v.getDiseaseDeaths21());
		setDiseaseDeaths31(getDiseaseDeaths31() + v.getDiseaseDeaths31());
		setDiseaseDeaths41(getDiseaseDeaths41() + v.getDiseaseDeaths41());
		setDiseaseDeaths13(getDiseaseDeaths13() + v.getDiseaseDeaths13());
		setDiseaseDeaths23(getDiseaseDeaths23() + v.getDiseaseDeaths23());
		setDiseaseDeaths32(getDiseaseDeaths32() + v.getDiseaseDeaths32());
		setDiseaseDeaths42(getDiseaseDeaths42() + v.getDiseaseDeaths42());
		setDiseaseDeaths14(getDiseaseDeaths14() + v.getDiseaseDeaths14());
		setDiseaseDeaths24(getDiseaseDeaths24() + v.getDiseaseDeaths24());
		setDiseaseDeaths34(getDiseaseDeaths34() + v.getDiseaseDeaths34());
		setDiseaseDeaths43(getDiseaseDeaths43() + v.getDiseaseDeaths43());

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

		setI1((double)(getI1() + value));
		setI2((double)(getI2() + value));
		setI3((double)(getI3() + value));
		setI4((double)(getI4() + value));
		setC1((double)(getC1() + value));
		setC2((double)(getC2() + value));
		setC3((double)(getC3() + value));
		setC4((double)(getC4() + value));
		setR1((double)(getR1() + value));
		setR2((double)(getR2() + value));
		setR3((double)(getR3() + value));
		setR4((double)(getR4() + value));
		setI12((double)(getI12() + value));
		setI13((double)(getI13() + value));
		setI14((double)(getI14() + value));
		setI21((double)(getI21() + value));
		setI23((double)(getI23() + value));
		setI24((double)(getI24() + value));
		setI31((double)(getI31() + value));
		setI32((double)(getI32() + value));
		setI34((double)(getI34() + value));
		setI41((double)(getI41() + value));
		setI42((double)(getI42() + value));
		setI43((double)(getI43() + value));
		setR((double)(getR() + value));
		setIncidence1((double)(getIncidence1() + value));
		setIncidence2((double)(getIncidence2() + value));
		setIncidence3((double)(getIncidence3() + value));
		setIncidence4((double)(getIncidence4() + value));
		setIncidence12((double)(getIncidence12() + value));
		setIncidence21((double)(getIncidence21() + value));
		setIncidence31((double)(getIncidence31() + value));
		setIncidence41((double)(getIncidence41() + value));
		setIncidence13((double)(getIncidence13() + value));
		setIncidence23((double)(getIncidence23() + value));
		setIncidence32((double)(getIncidence32() + value));
		setIncidence42((double)(getIncidence42() + value));
		setIncidence14((double)(getIncidence14() + value));
		setIncidence24((double)(getIncidence24() + value));
		setIncidence34((double)(getIncidence34() + value));
		setIncidence43((double)(getIncidence43() + value));
		setDiseaseDeaths1((double)(getDiseaseDeaths1() + value));
		setDiseaseDeaths2((double)(getDiseaseDeaths2() + value));
		setDiseaseDeaths3((double)(getDiseaseDeaths3() + value));
		setDiseaseDeaths4((double)(getDiseaseDeaths4() + value));
		setDiseaseDeaths12((double)(getDiseaseDeaths12() + value));
		setDiseaseDeaths21((double)(getDiseaseDeaths21() + value));
		setDiseaseDeaths31((double)(getDiseaseDeaths31() + value));
		setDiseaseDeaths41((double)(getDiseaseDeaths41() + value));
		setDiseaseDeaths13((double)(getDiseaseDeaths13() + value));
		setDiseaseDeaths23((double)(getDiseaseDeaths23() + value));
		setDiseaseDeaths32((double)(getDiseaseDeaths32() + value));
		setDiseaseDeaths42((double)(getDiseaseDeaths42() + value));
		setDiseaseDeaths14((double)(getDiseaseDeaths14() + value));
		setDiseaseDeaths24((double)(getDiseaseDeaths24() + value));
		setDiseaseDeaths34((double)(getDiseaseDeaths34() + value));
		setDiseaseDeaths43((double)(getDiseaseDeaths43() + value));

		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override	
	public IntegrationLabelValue sub(IntegrationLabelValue value) {
		SimpleDengueModelHostLabelValue v = (SimpleDengueModelHostLabelValue)value;
		super.sub(v);

		setI1(getI1() - v.getI1());
		setI2(getI2() - v.getI2());
		setI3(getI3() - v.getI3());
		setI4(getI4() - v.getI4());
		setC1(getC1() - v.getC1());
		setC2(getC2() - v.getC2());
		setC3(getC3() - v.getC3());
		setC4(getC4() - v.getC4());
		setR1(getR1() - v.getR1());
		setR2(getR2() - v.getR2());
		setR3(getR3() - v.getR3());
		setR4(getR4() - v.getR4());
		setI12(getI12() - v.getI12());
		setI13(getI13() - v.getI13());
		setI14(getI14() - v.getI14());
		setI21(getI21() - v.getI21());
		setI23(getI23() - v.getI23());
		setI24(getI24() - v.getI24());
		setI31(getI31() - v.getI31());
		setI32(getI32() - v.getI32());
		setI34(getI34() - v.getI34());
		setI41(getI41() - v.getI41());
		setI42(getI42() - v.getI42());
		setI43(getI43() - v.getI43());
		setR(getR() - v.getR());
		setIncidence1(getIncidence1() - v.getIncidence1());
		setIncidence2(getIncidence2() - v.getIncidence2());
		setIncidence3(getIncidence3() - v.getIncidence3());
		setIncidence4(getIncidence4() - v.getIncidence4());
		setIncidence12(getIncidence12() - v.getIncidence12());
		setIncidence21(getIncidence21() - v.getIncidence21());
		setIncidence31(getIncidence31() - v.getIncidence31());
		setIncidence41(getIncidence41() - v.getIncidence41());
		setIncidence13(getIncidence13() - v.getIncidence13());
		setIncidence23(getIncidence23() - v.getIncidence23());
		setIncidence32(getIncidence32() - v.getIncidence32());
		setIncidence42(getIncidence42() - v.getIncidence42());
		setIncidence14(getIncidence14() - v.getIncidence14());
		setIncidence24(getIncidence24() - v.getIncidence24());
		setIncidence34(getIncidence34() - v.getIncidence34());
		setIncidence43(getIncidence43() - v.getIncidence43());
		setDiseaseDeaths1(getDiseaseDeaths1() - v.getDiseaseDeaths1());
		setDiseaseDeaths2(getDiseaseDeaths2() - v.getDiseaseDeaths2());
		setDiseaseDeaths3(getDiseaseDeaths3() - v.getDiseaseDeaths3());
		setDiseaseDeaths4(getDiseaseDeaths4() - v.getDiseaseDeaths4());
		setDiseaseDeaths12(getDiseaseDeaths12() - v.getDiseaseDeaths12());
		setDiseaseDeaths21(getDiseaseDeaths21() - v.getDiseaseDeaths21());
		setDiseaseDeaths31(getDiseaseDeaths31() - v.getDiseaseDeaths31());
		setDiseaseDeaths41(getDiseaseDeaths41() - v.getDiseaseDeaths41());
		setDiseaseDeaths13(getDiseaseDeaths13() - v.getDiseaseDeaths13());
		setDiseaseDeaths23(getDiseaseDeaths23() - v.getDiseaseDeaths23());
		setDiseaseDeaths32(getDiseaseDeaths32() - v.getDiseaseDeaths32());
		setDiseaseDeaths42(getDiseaseDeaths42() - v.getDiseaseDeaths42());
		setDiseaseDeaths14(getDiseaseDeaths14() - v.getDiseaseDeaths14());
		setDiseaseDeaths24(getDiseaseDeaths24() - v.getDiseaseDeaths24());
		setDiseaseDeaths34(getDiseaseDeaths34() - v.getDiseaseDeaths34());
		setDiseaseDeaths43(getDiseaseDeaths43() - v.getDiseaseDeaths43());

		return this;	
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegrationLabelValue divide(IntegrationLabelValue value) {
		SimpleDengueModelHostLabelValue v = (SimpleDengueModelHostLabelValue)value;
		super.divide(v);

		setI1(getI1() / v.getI1());
		setI2(getI2() / v.getI2());
		setI3(getI3() / v.getI3());
		setI4(getI4() / v.getI4());
		setC1(getC1() / v.getC1());
		setC2(getC2() / v.getC2());
		setC3(getC3() / v.getC3());
		setC4(getC4() / v.getC4());
		setR1(getR1() / v.getR1());
		setR2(getR2() / v.getR2());
		setR3(getR3() / v.getR3());
		setR4(getR4() / v.getR4());
		setI12(getI12() / v.getI12());
		setI13(getI13() / v.getI13());
		setI14(getI14() / v.getI14());
		setI21(getI21() / v.getI21());
		setI23(getI23() / v.getI23());
		setI24(getI24() / v.getI24());
		setI31(getI31() / v.getI31());
		setI32(getI32() / v.getI32());
		setI34(getI34() / v.getI34());
		setI41(getI41() / v.getI41());
		setI42(getI42() / v.getI42());
		setI43(getI43() / v.getI43());
		setR(getR() / v.getR());
		setIncidence1(getIncidence1() / v.getIncidence1());
		setIncidence2(getIncidence2() / v.getIncidence2());
		setIncidence3(getIncidence3() / v.getIncidence3());
		setIncidence4(getIncidence4() / v.getIncidence4());
		setIncidence12(getIncidence12() / v.getIncidence12());
		setIncidence21(getIncidence21() / v.getIncidence21());
		setIncidence31(getIncidence31() / v.getIncidence31());
		setIncidence41(getIncidence41() / v.getIncidence41());
		setIncidence13(getIncidence13() / v.getIncidence13());
		setIncidence23(getIncidence23() / v.getIncidence23());
		setIncidence32(getIncidence32() / v.getIncidence32());
		setIncidence42(getIncidence42() / v.getIncidence42());
		setIncidence14(getIncidence14() / v.getIncidence14());
		setIncidence24(getIncidence24() / v.getIncidence24());
		setIncidence34(getIncidence34() / v.getIncidence34());
		setIncidence43(getIncidence43() / v.getIncidence43());
		setDiseaseDeaths1(getDiseaseDeaths1() / v.getDiseaseDeaths1());
		setDiseaseDeaths2(getDiseaseDeaths2() / v.getDiseaseDeaths2());
		setDiseaseDeaths3(getDiseaseDeaths3() / v.getDiseaseDeaths3());
		setDiseaseDeaths4(getDiseaseDeaths4() / v.getDiseaseDeaths4());
		setDiseaseDeaths12(getDiseaseDeaths12() / v.getDiseaseDeaths12());
		setDiseaseDeaths21(getDiseaseDeaths21() / v.getDiseaseDeaths21());
		setDiseaseDeaths31(getDiseaseDeaths31() / v.getDiseaseDeaths31());
		setDiseaseDeaths41(getDiseaseDeaths41() / v.getDiseaseDeaths41());
		setDiseaseDeaths13(getDiseaseDeaths13() / v.getDiseaseDeaths13());
		setDiseaseDeaths23(getDiseaseDeaths23() / v.getDiseaseDeaths23());
		setDiseaseDeaths32(getDiseaseDeaths32() / v.getDiseaseDeaths32());
		setDiseaseDeaths42(getDiseaseDeaths42() / v.getDiseaseDeaths42());
		setDiseaseDeaths14(getDiseaseDeaths14() / v.getDiseaseDeaths14());
		setDiseaseDeaths24(getDiseaseDeaths24() / v.getDiseaseDeaths24());
		setDiseaseDeaths34(getDiseaseDeaths34() / v.getDiseaseDeaths34());
		setDiseaseDeaths43(getDiseaseDeaths43() / v.getDiseaseDeaths43());

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

		setI1((double)(getI1() * scaleFactor));
		setI2((double)(getI2() * scaleFactor));
		setI3((double)(getI3() * scaleFactor));
		setI4((double)(getI4() * scaleFactor));
		setC1((double)(getC1() * scaleFactor));
		setC2((double)(getC2() * scaleFactor));
		setC3((double)(getC3() * scaleFactor));
		setC4((double)(getC4() * scaleFactor));
		setR1((double)(getR1() * scaleFactor));
		setR2((double)(getR2() * scaleFactor));
		setR3((double)(getR3() * scaleFactor));
		setR4((double)(getR4() * scaleFactor));
		setI12((double)(getI12() * scaleFactor));
		setI13((double)(getI13() * scaleFactor));
		setI14((double)(getI14() * scaleFactor));
		setI21((double)(getI21() * scaleFactor));
		setI23((double)(getI23() * scaleFactor));
		setI24((double)(getI24() * scaleFactor));
		setI31((double)(getI31() * scaleFactor));
		setI32((double)(getI32() * scaleFactor));
		setI34((double)(getI34() * scaleFactor));
		setI41((double)(getI41() * scaleFactor));
		setI42((double)(getI42() * scaleFactor));
		setI43((double)(getI43() * scaleFactor));
		setR((double)(getR() * scaleFactor));
		setIncidence1((double)(getIncidence1() * scaleFactor));
		setIncidence2((double)(getIncidence2() * scaleFactor));
		setIncidence3((double)(getIncidence3() * scaleFactor));
		setIncidence4((double)(getIncidence4() * scaleFactor));
		setIncidence12((double)(getIncidence12() * scaleFactor));
		setIncidence21((double)(getIncidence21() * scaleFactor));
		setIncidence31((double)(getIncidence31() * scaleFactor));
		setIncidence41((double)(getIncidence41() * scaleFactor));
		setIncidence13((double)(getIncidence13() * scaleFactor));
		setIncidence23((double)(getIncidence23() * scaleFactor));
		setIncidence32((double)(getIncidence32() * scaleFactor));
		setIncidence42((double)(getIncidence42() * scaleFactor));
		setIncidence14((double)(getIncidence14() * scaleFactor));
		setIncidence24((double)(getIncidence24() * scaleFactor));
		setIncidence34((double)(getIncidence34() * scaleFactor));
		setIncidence43((double)(getIncidence43() * scaleFactor));
		setDiseaseDeaths1((double)(getDiseaseDeaths1() * scaleFactor));
		setDiseaseDeaths2((double)(getDiseaseDeaths2() * scaleFactor));
		setDiseaseDeaths3((double)(getDiseaseDeaths3() * scaleFactor));
		setDiseaseDeaths4((double)(getDiseaseDeaths4() * scaleFactor));
		setDiseaseDeaths12((double)(getDiseaseDeaths12() * scaleFactor));
		setDiseaseDeaths21((double)(getDiseaseDeaths21() * scaleFactor));
		setDiseaseDeaths31((double)(getDiseaseDeaths31() * scaleFactor));
		setDiseaseDeaths41((double)(getDiseaseDeaths41() * scaleFactor));
		setDiseaseDeaths13((double)(getDiseaseDeaths13() * scaleFactor));
		setDiseaseDeaths23((double)(getDiseaseDeaths23() * scaleFactor));
		setDiseaseDeaths32((double)(getDiseaseDeaths32() * scaleFactor));
		setDiseaseDeaths42((double)(getDiseaseDeaths42() * scaleFactor));
		setDiseaseDeaths14((double)(getDiseaseDeaths14() * scaleFactor));
		setDiseaseDeaths24((double)(getDiseaseDeaths24() * scaleFactor));
		setDiseaseDeaths34((double)(getDiseaseDeaths34() * scaleFactor));
		setDiseaseDeaths43((double)(getDiseaseDeaths43() * scaleFactor));

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

		setI1(Math.abs(getI1()));
		setI2(Math.abs(getI2()));
		setI3(Math.abs(getI3()));
		setI4(Math.abs(getI4()));
		setC1(Math.abs(getC1()));
		setC2(Math.abs(getC2()));
		setC3(Math.abs(getC3()));
		setC4(Math.abs(getC4()));
		setR1(Math.abs(getR1()));
		setR2(Math.abs(getR2()));
		setR3(Math.abs(getR3()));
		setR4(Math.abs(getR4()));
		setI12(Math.abs(getI12()));
		setI13(Math.abs(getI13()));
		setI14(Math.abs(getI14()));
		setI21(Math.abs(getI21()));
		setI23(Math.abs(getI23()));
		setI24(Math.abs(getI24()));
		setI31(Math.abs(getI31()));
		setI32(Math.abs(getI32()));
		setI34(Math.abs(getI34()));
		setI41(Math.abs(getI41()));
		setI42(Math.abs(getI42()));
		setI43(Math.abs(getI43()));
		setR(Math.abs(getR()));
		setIncidence1(Math.abs(getIncidence1()));
		setIncidence2(Math.abs(getIncidence2()));
		setIncidence3(Math.abs(getIncidence3()));
		setIncidence4(Math.abs(getIncidence4()));
		setIncidence12(Math.abs(getIncidence12()));
		setIncidence21(Math.abs(getIncidence21()));
		setIncidence31(Math.abs(getIncidence31()));
		setIncidence41(Math.abs(getIncidence41()));
		setIncidence13(Math.abs(getIncidence13()));
		setIncidence23(Math.abs(getIncidence23()));
		setIncidence32(Math.abs(getIncidence32()));
		setIncidence42(Math.abs(getIncidence42()));
		setIncidence14(Math.abs(getIncidence14()));
		setIncidence24(Math.abs(getIncidence24()));
		setIncidence34(Math.abs(getIncidence34()));
		setIncidence43(Math.abs(getIncidence43()));
		setDiseaseDeaths1(Math.abs(getDiseaseDeaths1()));
		setDiseaseDeaths2(Math.abs(getDiseaseDeaths2()));
		setDiseaseDeaths3(Math.abs(getDiseaseDeaths3()));
		setDiseaseDeaths4(Math.abs(getDiseaseDeaths4()));
		setDiseaseDeaths12(Math.abs(getDiseaseDeaths12()));
		setDiseaseDeaths21(Math.abs(getDiseaseDeaths21()));
		setDiseaseDeaths31(Math.abs(getDiseaseDeaths31()));
		setDiseaseDeaths41(Math.abs(getDiseaseDeaths41()));
		setDiseaseDeaths13(Math.abs(getDiseaseDeaths13()));
		setDiseaseDeaths23(Math.abs(getDiseaseDeaths23()));
		setDiseaseDeaths32(Math.abs(getDiseaseDeaths32()));
		setDiseaseDeaths42(Math.abs(getDiseaseDeaths42()));
		setDiseaseDeaths14(Math.abs(getDiseaseDeaths14()));
		setDiseaseDeaths24(Math.abs(getDiseaseDeaths24()));
		setDiseaseDeaths34(Math.abs(getDiseaseDeaths34()));
		setDiseaseDeaths43(Math.abs(getDiseaseDeaths43()));
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

		maxValue = Math.max(maxValue, getI1());
		maxValue = Math.max(maxValue, getI2());
		maxValue = Math.max(maxValue, getI3());
		maxValue = Math.max(maxValue, getI4());
		maxValue = Math.max(maxValue, getC1());
		maxValue = Math.max(maxValue, getC2());
		maxValue = Math.max(maxValue, getC3());
		maxValue = Math.max(maxValue, getC4());
		maxValue = Math.max(maxValue, getR1());
		maxValue = Math.max(maxValue, getR2());
		maxValue = Math.max(maxValue, getR3());
		maxValue = Math.max(maxValue, getR4());
		maxValue = Math.max(maxValue, getI12());
		maxValue = Math.max(maxValue, getI13());
		maxValue = Math.max(maxValue, getI14());
		maxValue = Math.max(maxValue, getI21());
		maxValue = Math.max(maxValue, getI23());
		maxValue = Math.max(maxValue, getI24());
		maxValue = Math.max(maxValue, getI31());
		maxValue = Math.max(maxValue, getI32());
		maxValue = Math.max(maxValue, getI34());
		maxValue = Math.max(maxValue, getI41());
		maxValue = Math.max(maxValue, getI42());
		maxValue = Math.max(maxValue, getI43());
		maxValue = Math.max(maxValue, getR());
		maxValue = Math.max(maxValue, getDiseaseDeaths1());
		maxValue = Math.max(maxValue, getDiseaseDeaths2());
		maxValue = Math.max(maxValue, getDiseaseDeaths3());
		maxValue = Math.max(maxValue, getDiseaseDeaths4());
		maxValue = Math.max(maxValue, getDiseaseDeaths12());
		maxValue = Math.max(maxValue, getDiseaseDeaths21());
		maxValue = Math.max(maxValue, getDiseaseDeaths31());
		maxValue = Math.max(maxValue, getDiseaseDeaths41());
		maxValue = Math.max(maxValue, getDiseaseDeaths13());
		maxValue = Math.max(maxValue, getDiseaseDeaths23());
		maxValue = Math.max(maxValue, getDiseaseDeaths32());
		maxValue = Math.max(maxValue, getDiseaseDeaths42());
		maxValue = Math.max(maxValue, getDiseaseDeaths14());
		maxValue = Math.max(maxValue, getDiseaseDeaths24());
		maxValue = Math.max(maxValue, getDiseaseDeaths34());
		maxValue = Math.max(maxValue, getDiseaseDeaths43());
		return maxValue;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double computeDeltaAdjustment(IntegrationLabelValue value) {
		SimpleDengueModelHostLabelValue v = (SimpleDengueModelHostLabelValue)value;
		double factor = super.computeDeltaAdjustment(v);

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
		if ((double)(getC1() + v.getC1()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getC1() / getC1()));
		}
		if ((double)(getC2() + v.getC2()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getC2() / getC2()));
		}
		if ((double)(getC3() + v.getC3()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getC3() / getC3()));
		}
		if ((double)(getC4() + v.getC4()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getC4() / getC4()));
		}
		if ((double)(getR1() + v.getR1()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getR1() / getR1()));
		}
		if ((double)(getR2() + v.getR2()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getR2() / getR2()));
		}
		if ((double)(getR3() + v.getR3()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getR3() / getR3()));
		}
		if ((double)(getR4() + v.getR4()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getR4() / getR4()));
		}
		if ((double)(getI12() + v.getI12()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getI12() / getI12()));
		}
		if ((double)(getI13() + v.getI13()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getI13() / getI13()));
		}
		if ((double)(getI14() + v.getI14()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getI14() / getI14()));
		}
		if ((double)(getI21() + v.getI21()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getI21() / getI21()));
		}
		if ((double)(getI23() + v.getI23()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getI23() / getI23()));
		}
		if ((double)(getI24() + v.getI24()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getI24() / getI24()));
		}
		if ((double)(getI31() + v.getI31()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getI31() / getI31()));
		}
		if ((double)(getI32() + v.getI32()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getI32() / getI32()));
		}
		if ((double)(getI34() + v.getI34()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getI34() / getI34()));
		}
		if ((double)(getI41() + v.getI41()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getI41() / getI41()));
		}
		if ((double)(getI42() + v.getI42()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getI42() / getI42()));
		}
		if ((double)(getI43() + v.getI43()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getI43() / getI43()));
		}
		if ((double)(getR() + v.getR()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getR() / getR()));
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
		if ((double)(getIncidence12() + v.getIncidence12()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getIncidence12() / getIncidence12()));
		}
		if ((double)(getIncidence21() + v.getIncidence21()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getIncidence21() / getIncidence21()));
		}
		if ((double)(getIncidence31() + v.getIncidence31()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getIncidence31() / getIncidence31()));
		}
		if ((double)(getIncidence41() + v.getIncidence41()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getIncidence41() / getIncidence41()));
		}
		if ((double)(getIncidence13() + v.getIncidence13()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getIncidence13() / getIncidence13()));
		}
		if ((double)(getIncidence23() + v.getIncidence23()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getIncidence23() / getIncidence23()));
		}
		if ((double)(getIncidence32() + v.getIncidence32()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getIncidence32() / getIncidence32()));
		}
		if ((double)(getIncidence42() + v.getIncidence42()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getIncidence42() / getIncidence42()));
		}
		if ((double)(getIncidence14() + v.getIncidence14()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getIncidence14() / getIncidence14()));
		}
		if ((double)(getIncidence24() + v.getIncidence24()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getIncidence24() / getIncidence24()));
		}
		if ((double)(getIncidence34() + v.getIncidence34()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getIncidence34() / getIncidence34()));
		}
		if ((double)(getIncidence43() + v.getIncidence43()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getIncidence43() / getIncidence43()));
		}
		if ((double)(getDiseaseDeaths1() + v.getDiseaseDeaths1()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getDiseaseDeaths1() / getDiseaseDeaths1()));
		}
		if ((double)(getDiseaseDeaths2() + v.getDiseaseDeaths2()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getDiseaseDeaths2() / getDiseaseDeaths2()));
		}
		if ((double)(getDiseaseDeaths3() + v.getDiseaseDeaths3()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getDiseaseDeaths3() / getDiseaseDeaths3()));
		}
		if ((double)(getDiseaseDeaths4() + v.getDiseaseDeaths4()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getDiseaseDeaths4() / getDiseaseDeaths4()));
		}
		if ((double)(getDiseaseDeaths12() + v.getDiseaseDeaths12()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getDiseaseDeaths12() / getDiseaseDeaths12()));
		}
		if ((double)(getDiseaseDeaths21() + v.getDiseaseDeaths21()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getDiseaseDeaths21() / getDiseaseDeaths21()));
		}
		if ((double)(getDiseaseDeaths31() + v.getDiseaseDeaths31()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getDiseaseDeaths31() / getDiseaseDeaths31()));
		}
		if ((double)(getDiseaseDeaths41() + v.getDiseaseDeaths41()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getDiseaseDeaths41() / getDiseaseDeaths41()));
		}
		if ((double)(getDiseaseDeaths13() + v.getDiseaseDeaths13()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getDiseaseDeaths13() / getDiseaseDeaths13()));
		}
		if ((double)(getDiseaseDeaths23() + v.getDiseaseDeaths23()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getDiseaseDeaths23() / getDiseaseDeaths23()));
		}
		if ((double)(getDiseaseDeaths32() + v.getDiseaseDeaths32()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getDiseaseDeaths32() / getDiseaseDeaths32()));
		}
		if ((double)(getDiseaseDeaths42() + v.getDiseaseDeaths42()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getDiseaseDeaths42() / getDiseaseDeaths42()));
		}
		if ((double)(getDiseaseDeaths14() + v.getDiseaseDeaths14()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getDiseaseDeaths14() / getDiseaseDeaths14()));
		}
		if ((double)(getDiseaseDeaths24() + v.getDiseaseDeaths24()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getDiseaseDeaths24() / getDiseaseDeaths24()));
		}
		if ((double)(getDiseaseDeaths34() + v.getDiseaseDeaths34()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getDiseaseDeaths34() / getDiseaseDeaths34()));
		}
		if ((double)(getDiseaseDeaths43() + v.getDiseaseDeaths43()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getDiseaseDeaths43() / getDiseaseDeaths43()));
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
		
		setI1((double)0.0);
		setI2((double)0.0);
		setI3((double)0.0);
		setI4((double)0.0);
		setC1((double)0.0);
		setC2((double)0.0);
		setC3((double)0.0);
		setC4((double)0.0);
		setR1((double)0.0);
		setR2((double)0.0);
		setR3((double)0.0);
		setR4((double)0.0);
		setI12((double)0.0);
		setI13((double)0.0);
		setI14((double)0.0);
		setI21((double)0.0);
		setI23((double)0.0);
		setI24((double)0.0);
		setI31((double)0.0);
		setI32((double)0.0);
		setI34((double)0.0);
		setI41((double)0.0);
		setI42((double)0.0);
		setI43((double)0.0);
		setR((double)0.0);
		setIncidence1((double)0.0);
		setIncidence2((double)0.0);
		setIncidence3((double)0.0);
		setIncidence4((double)0.0);
		setIncidence12((double)0.0);
		setIncidence21((double)0.0);
		setIncidence31((double)0.0);
		setIncidence41((double)0.0);
		setIncidence13((double)0.0);
		setIncidence23((double)0.0);
		setIncidence32((double)0.0);
		setIncidence42((double)0.0);
		setIncidence14((double)0.0);
		setIncidence24((double)0.0);
		setIncidence34((double)0.0);
		setIncidence43((double)0.0);
		setDiseaseDeaths1((double)0.0);
		setDiseaseDeaths2((double)0.0);
		setDiseaseDeaths3((double)0.0);
		setDiseaseDeaths4((double)0.0);
		setDiseaseDeaths12((double)0.0);
		setDiseaseDeaths21((double)0.0);
		setDiseaseDeaths31((double)0.0);
		setDiseaseDeaths41((double)0.0);
		setDiseaseDeaths13((double)0.0);
		setDiseaseDeaths23((double)0.0);
		setDiseaseDeaths32((double)0.0);
		setDiseaseDeaths42((double)0.0);
		setDiseaseDeaths14((double)0.0);
		setDiseaseDeaths24((double)0.0);
		setDiseaseDeaths34((double)0.0);
		setDiseaseDeaths43((double)0.0);
	} // reset

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */	
	@Override
	public double getPopulationCount() {
		double count = super.getPopulationCount();
		
		count += (double)getI1();
		count += (double)getI2();
		count += (double)getI3();
		count += (double)getI4();
		count += (double)getC1();
		count += (double)getC2();
		count += (double)getC3();
		count += (double)getC4();
		count += (double)getR1();
		count += (double)getR2();
		count += (double)getR3();
		count += (double)getR4();
		count += (double)getI12();
		count += (double)getI13();
		count += (double)getI14();
		count += (double)getI21();
		count += (double)getI23();
		count += (double)getI24();
		count += (double)getI31();
		count += (double)getI32();
		count += (double)getI34();
		count += (double)getI41();
		count += (double)getI42();
		count += (double)getI43();
		count += (double)getR();

		return count;
	} // getPopulationCount

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean avoidNegative(IntegrationLabelValue value) {
		SimpleDengueModelHostLabelValue v = (SimpleDengueModelHostLabelValue)value;
		boolean adjusted = super.avoidNegative(value);

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

		if ((double)(getC1() + v.getC1()) < 0.0) {
			adjusted = true;
			setC1(-v.getC1());
		}

		if ((double)(getC2() + v.getC2()) < 0.0) {
			adjusted = true;
			setC2(-v.getC2());
		}

		if ((double)(getC3() + v.getC3()) < 0.0) {
			adjusted = true;
			setC3(-v.getC3());
		}

		if ((double)(getC4() + v.getC4()) < 0.0) {
			adjusted = true;
			setC4(-v.getC4());
		}

		if ((double)(getR1() + v.getR1()) < 0.0) {
			adjusted = true;
			setR1(-v.getR1());
		}

		if ((double)(getR2() + v.getR2()) < 0.0) {
			adjusted = true;
			setR2(-v.getR2());
		}

		if ((double)(getR3() + v.getR3()) < 0.0) {
			adjusted = true;
			setR3(-v.getR3());
		}

		if ((double)(getR4() + v.getR4()) < 0.0) {
			adjusted = true;
			setR4(-v.getR4());
		}

		if ((double)(getI12() + v.getI12()) < 0.0) {
			adjusted = true;
			setI12(-v.getI12());
		}

		if ((double)(getI13() + v.getI13()) < 0.0) {
			adjusted = true;
			setI13(-v.getI13());
		}

		if ((double)(getI14() + v.getI14()) < 0.0) {
			adjusted = true;
			setI14(-v.getI14());
		}

		if ((double)(getI21() + v.getI21()) < 0.0) {
			adjusted = true;
			setI21(-v.getI21());
		}

		if ((double)(getI23() + v.getI23()) < 0.0) {
			adjusted = true;
			setI23(-v.getI23());
		}

		if ((double)(getI24() + v.getI24()) < 0.0) {
			adjusted = true;
			setI24(-v.getI24());
		}

		if ((double)(getI31() + v.getI31()) < 0.0) {
			adjusted = true;
			setI31(-v.getI31());
		}

		if ((double)(getI32() + v.getI32()) < 0.0) {
			adjusted = true;
			setI32(-v.getI32());
		}

		if ((double)(getI34() + v.getI34()) < 0.0) {
			adjusted = true;
			setI34(-v.getI34());
		}

		if ((double)(getI41() + v.getI41()) < 0.0) {
			adjusted = true;
			setI41(-v.getI41());
		}

		if ((double)(getI42() + v.getI42()) < 0.0) {
			adjusted = true;
			setI42(-v.getI42());
		}

		if ((double)(getI43() + v.getI43()) < 0.0) {
			adjusted = true;
			setI43(-v.getI43());
		}

		if ((double)(getR() + v.getR()) < 0.0) {
			adjusted = true;
			setR(-v.getR());
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

		if ((double)(getIncidence12() + v.getIncidence12()) < 0.0) {
			adjusted = true;
			setIncidence12(-v.getIncidence12());
		}

		if ((double)(getIncidence21() + v.getIncidence21()) < 0.0) {
			adjusted = true;
			setIncidence21(-v.getIncidence21());
		}

		if ((double)(getIncidence31() + v.getIncidence31()) < 0.0) {
			adjusted = true;
			setIncidence31(-v.getIncidence31());
		}

		if ((double)(getIncidence41() + v.getIncidence41()) < 0.0) {
			adjusted = true;
			setIncidence41(-v.getIncidence41());
		}

		if ((double)(getIncidence13() + v.getIncidence13()) < 0.0) {
			adjusted = true;
			setIncidence13(-v.getIncidence13());
		}

		if ((double)(getIncidence23() + v.getIncidence23()) < 0.0) {
			adjusted = true;
			setIncidence23(-v.getIncidence23());
		}

		if ((double)(getIncidence32() + v.getIncidence32()) < 0.0) {
			adjusted = true;
			setIncidence32(-v.getIncidence32());
		}

		if ((double)(getIncidence42() + v.getIncidence42()) < 0.0) {
			adjusted = true;
			setIncidence42(-v.getIncidence42());
		}

		if ((double)(getIncidence14() + v.getIncidence14()) < 0.0) {
			adjusted = true;
			setIncidence14(-v.getIncidence14());
		}

		if ((double)(getIncidence24() + v.getIncidence24()) < 0.0) {
			adjusted = true;
			setIncidence24(-v.getIncidence24());
		}

		if ((double)(getIncidence34() + v.getIncidence34()) < 0.0) {
			adjusted = true;
			setIncidence34(-v.getIncidence34());
		}

		if ((double)(getIncidence43() + v.getIncidence43()) < 0.0) {
			adjusted = true;
			setIncidence43(-v.getIncidence43());
		}

		if ((double)(getDiseaseDeaths1() + v.getDiseaseDeaths1()) < 0.0) {
			adjusted = true;
			setDiseaseDeaths1(-v.getDiseaseDeaths1());
		}

		if ((double)(getDiseaseDeaths2() + v.getDiseaseDeaths2()) < 0.0) {
			adjusted = true;
			setDiseaseDeaths2(-v.getDiseaseDeaths2());
		}

		if ((double)(getDiseaseDeaths3() + v.getDiseaseDeaths3()) < 0.0) {
			adjusted = true;
			setDiseaseDeaths3(-v.getDiseaseDeaths3());
		}

		if ((double)(getDiseaseDeaths4() + v.getDiseaseDeaths4()) < 0.0) {
			adjusted = true;
			setDiseaseDeaths4(-v.getDiseaseDeaths4());
		}

		if ((double)(getDiseaseDeaths12() + v.getDiseaseDeaths12()) < 0.0) {
			adjusted = true;
			setDiseaseDeaths12(-v.getDiseaseDeaths12());
		}

		if ((double)(getDiseaseDeaths21() + v.getDiseaseDeaths21()) < 0.0) {
			adjusted = true;
			setDiseaseDeaths21(-v.getDiseaseDeaths21());
		}

		if ((double)(getDiseaseDeaths31() + v.getDiseaseDeaths31()) < 0.0) {
			adjusted = true;
			setDiseaseDeaths31(-v.getDiseaseDeaths31());
		}

		if ((double)(getDiseaseDeaths41() + v.getDiseaseDeaths41()) < 0.0) {
			adjusted = true;
			setDiseaseDeaths41(-v.getDiseaseDeaths41());
		}

		if ((double)(getDiseaseDeaths13() + v.getDiseaseDeaths13()) < 0.0) {
			adjusted = true;
			setDiseaseDeaths13(-v.getDiseaseDeaths13());
		}

		if ((double)(getDiseaseDeaths23() + v.getDiseaseDeaths23()) < 0.0) {
			adjusted = true;
			setDiseaseDeaths23(-v.getDiseaseDeaths23());
		}

		if ((double)(getDiseaseDeaths32() + v.getDiseaseDeaths32()) < 0.0) {
			adjusted = true;
			setDiseaseDeaths32(-v.getDiseaseDeaths32());
		}

		if ((double)(getDiseaseDeaths42() + v.getDiseaseDeaths42()) < 0.0) {
			adjusted = true;
			setDiseaseDeaths42(-v.getDiseaseDeaths42());
		}

		if ((double)(getDiseaseDeaths14() + v.getDiseaseDeaths14()) < 0.0) {
			adjusted = true;
			setDiseaseDeaths14(-v.getDiseaseDeaths14());
		}

		if ((double)(getDiseaseDeaths24() + v.getDiseaseDeaths24()) < 0.0) {
			adjusted = true;
			setDiseaseDeaths24(-v.getDiseaseDeaths24());
		}

		if ((double)(getDiseaseDeaths34() + v.getDiseaseDeaths34()) < 0.0) {
			adjusted = true;
			setDiseaseDeaths34(-v.getDiseaseDeaths34());
		}

		if ((double)(getDiseaseDeaths43() + v.getDiseaseDeaths43()) < 0.0) {
			adjusted = true;
			setDiseaseDeaths43(-v.getDiseaseDeaths43());
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
		SimpleDengueModelHostLabelValue v = (SimpleDengueModelHostLabelValue)value;
		if (!super.sameValue(v)) {
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
		if (getC1() != v.getC1()) {
			return false;
		}
		if (getC2() != v.getC2()) {
			return false;
		}
		if (getC3() != v.getC3()) {
			return false;
		}
		if (getC4() != v.getC4()) {
			return false;
		}
		if (getR1() != v.getR1()) {
			return false;
		}
		if (getR2() != v.getR2()) {
			return false;
		}
		if (getR3() != v.getR3()) {
			return false;
		}
		if (getR4() != v.getR4()) {
			return false;
		}
		if (getI12() != v.getI12()) {
			return false;
		}
		if (getI13() != v.getI13()) {
			return false;
		}
		if (getI14() != v.getI14()) {
			return false;
		}
		if (getI21() != v.getI21()) {
			return false;
		}
		if (getI23() != v.getI23()) {
			return false;
		}
		if (getI24() != v.getI24()) {
			return false;
		}
		if (getI31() != v.getI31()) {
			return false;
		}
		if (getI32() != v.getI32()) {
			return false;
		}
		if (getI34() != v.getI34()) {
			return false;
		}
		if (getI41() != v.getI41()) {
			return false;
		}
		if (getI42() != v.getI42()) {
			return false;
		}
		if (getI43() != v.getI43()) {
			return false;
		}
		if (getR() != v.getR()) {
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
		if (getIncidence12() != v.getIncidence12()) {
			return false;
		}
		if (getIncidence21() != v.getIncidence21()) {
			return false;
		}
		if (getIncidence31() != v.getIncidence31()) {
			return false;
		}
		if (getIncidence41() != v.getIncidence41()) {
			return false;
		}
		if (getIncidence13() != v.getIncidence13()) {
			return false;
		}
		if (getIncidence23() != v.getIncidence23()) {
			return false;
		}
		if (getIncidence32() != v.getIncidence32()) {
			return false;
		}
		if (getIncidence42() != v.getIncidence42()) {
			return false;
		}
		if (getIncidence14() != v.getIncidence14()) {
			return false;
		}
		if (getIncidence24() != v.getIncidence24()) {
			return false;
		}
		if (getIncidence34() != v.getIncidence34()) {
			return false;
		}
		if (getIncidence43() != v.getIncidence43()) {
			return false;
		}
		if (getDiseaseDeaths1() != v.getDiseaseDeaths1()) {
			return false;
		}
		if (getDiseaseDeaths2() != v.getDiseaseDeaths2()) {
			return false;
		}
		if (getDiseaseDeaths3() != v.getDiseaseDeaths3()) {
			return false;
		}
		if (getDiseaseDeaths4() != v.getDiseaseDeaths4()) {
			return false;
		}
		if (getDiseaseDeaths12() != v.getDiseaseDeaths12()) {
			return false;
		}
		if (getDiseaseDeaths21() != v.getDiseaseDeaths21()) {
			return false;
		}
		if (getDiseaseDeaths31() != v.getDiseaseDeaths31()) {
			return false;
		}
		if (getDiseaseDeaths41() != v.getDiseaseDeaths41()) {
			return false;
		}
		if (getDiseaseDeaths13() != v.getDiseaseDeaths13()) {
			return false;
		}
		if (getDiseaseDeaths23() != v.getDiseaseDeaths23()) {
			return false;
		}
		if (getDiseaseDeaths32() != v.getDiseaseDeaths32()) {
			return false;
		}
		if (getDiseaseDeaths42() != v.getDiseaseDeaths42()) {
			return false;
		}
		if (getDiseaseDeaths14() != v.getDiseaseDeaths14()) {
			return false;
		}
		if (getDiseaseDeaths24() != v.getDiseaseDeaths24()) {
			return false;
		}
		if (getDiseaseDeaths34() != v.getDiseaseDeaths34()) {
			return false;
		}
		if (getDiseaseDeaths43() != v.getDiseaseDeaths43()) {
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
		SimpleDengueModelHostLabelValue copy = VectorFactory.eINSTANCE.createSimpleDengueModelHostLabelValue();
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
		setIncidence12(0.0);
		setIncidence21(0.0);
		setIncidence31(0.0);
		setIncidence41(0.0);
		setIncidence13(0.0);
		setIncidence23(0.0);
		setIncidence32(0.0);
		setIncidence42(0.0);
		setIncidence14(0.0);
		setIncidence24(0.0);
		setIncidence34(0.0);
		setIncidence43(0.0);
	}
		
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double eGetDouble(int featureID) {
		switch (featureID) {
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I1:
				return getI1();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I2:
				return getI2();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I3:
				return getI3();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I4:
				return getI4();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C1:
				return getC1();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C2:
				return getC2();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C3:
				return getC3();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C4:
				return getC4();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R1:
				return getR1();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R2:
				return getR2();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R3:
				return getR3();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R4:
				return getR4();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I12:
				return getI12();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I13:
				return getI13();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I14:
				return getI14();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I21:
				return getI21();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I23:
				return getI23();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I24:
				return getI24();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I31:
				return getI31();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I32:
				return getI32();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I34:
				return getI34();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I41:
				return getI41();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I42:
				return getI42();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I43:
				return getI43();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R:
				return getR();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE1:
				return getIncidence1();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE2:
				return getIncidence2();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE3:
				return getIncidence3();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE4:
				return getIncidence4();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE12:
				return getIncidence12();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE21:
				return getIncidence21();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE31:
				return getIncidence31();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE41:
				return getIncidence41();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE13:
				return getIncidence13();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE23:
				return getIncidence23();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE32:
				return getIncidence32();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE42:
				return getIncidence42();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE14:
				return getIncidence14();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE24:
				return getIncidence24();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE34:
				return getIncidence34();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE43:
				return getIncidence43();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS1:
				return getDiseaseDeaths1();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS2:
				return getDiseaseDeaths2();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS3:
				return getDiseaseDeaths3();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS4:
				return getDiseaseDeaths4();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS12:
				return getDiseaseDeaths12();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS21:
				return getDiseaseDeaths21();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS31:
				return getDiseaseDeaths31();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS41:
				return getDiseaseDeaths41();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS13:
				return getDiseaseDeaths13();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS23:
				return getDiseaseDeaths23();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS32:
				return getDiseaseDeaths32();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS42:
				return getDiseaseDeaths42();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS14:
				return getDiseaseDeaths14();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS24:
				return getDiseaseDeaths24();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS34:
				return getDiseaseDeaths34();
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS43:
				return getDiseaseDeaths43();
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
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I1:
				setI1(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I2:
				setI2(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I3:
				setI3(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I4:
				setI4(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C1:
				setC1(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C2:
				setC2(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C3:
				setC3(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C4:
				setC4(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R1:
				setR1(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R2:
				setR2(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R3:
				setR3(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R4:
				setR4(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I12:
				setI12(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I13:
				setI13(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I14:
				setI14(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I21:
				setI21(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I23:
				setI23(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I24:
				setI24(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I31:
				setI31(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I32:
				setI32(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I34:
				setI34(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I41:
				setI41(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I42:
				setI42(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I43:
				setI43(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R:
				setR(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE1:
				setIncidence1(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE2:
				setIncidence2(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE3:
				setIncidence3(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE4:
				setIncidence4(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE12:
				setIncidence12(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE21:
				setIncidence21(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE31:
				setIncidence31(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE41:
				setIncidence41(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE13:
				setIncidence13(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE23:
				setIncidence23(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE32:
				setIncidence32(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE42:
				setIncidence42(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE14:
				setIncidence14(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE24:
				setIncidence24(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE34:
				setIncidence34(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE43:
				setIncidence43(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS1:
				setDiseaseDeaths1(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS2:
				setDiseaseDeaths2(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS3:
				setDiseaseDeaths3(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS4:
				setDiseaseDeaths4(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS12:
				setDiseaseDeaths12(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS21:
				setDiseaseDeaths21(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS31:
				setDiseaseDeaths31(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS41:
				setDiseaseDeaths41(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS13:
				setDiseaseDeaths13(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS23:
				setDiseaseDeaths23(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS32:
				setDiseaseDeaths32(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS42:
				setDiseaseDeaths42(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS14:
				setDiseaseDeaths14(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS24:
				setDiseaseDeaths24(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS34:
				setDiseaseDeaths34(newValue);
				return;
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS43:
				setDiseaseDeaths43(newValue);
				return;
		}
		
		super.eSetDouble(featureID,newValue);
	}
					

} //SimpleDengueModelHostLabelValueImpl
