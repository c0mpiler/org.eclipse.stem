package org.eclipse.stem.diseasemodels.vector;

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
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dengue Model Host Lable Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getE1 <em>E1</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getE2 <em>E2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getE3 <em>E3</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getE4 <em>E4</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getI1 <em>I1</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getI2 <em>I2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getI3 <em>I3</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getI4 <em>I4</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getT1 <em>T1</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getT2 <em>T2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getT3 <em>T3</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getT4 <em>T4</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getR1 <em>R1</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getR2 <em>R2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getR3 <em>R3</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getR4 <em>R4</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getE12 <em>E12</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getE13 <em>E13</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getE14 <em>E14</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getE21 <em>E21</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getE23 <em>E23</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getE24 <em>E24</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getE31 <em>E31</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getE32 <em>E32</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getE34 <em>E34</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getE41 <em>E41</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getE42 <em>E42</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getE43 <em>E43</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getI12 <em>I12</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getI13 <em>I13</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getI14 <em>I14</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getI21 <em>I21</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getI23 <em>I23</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getI24 <em>I24</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getI31 <em>I31</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getI32 <em>I32</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getI34 <em>I34</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getI41 <em>I41</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getI42 <em>I42</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getI43 <em>I43</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getR <em>R</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getIncidence1 <em>Incidence1</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getIncidence2 <em>Incidence2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getIncidence3 <em>Incidence3</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getIncidence4 <em>Incidence4</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getIncidence12 <em>Incidence12</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getIncidence21 <em>Incidence21</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getIncidence31 <em>Incidence31</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getIncidence41 <em>Incidence41</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getIncidence13 <em>Incidence13</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getIncidence23 <em>Incidence23</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getIncidence32 <em>Incidence32</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getIncidence42 <em>Incidence42</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getIncidence14 <em>Incidence14</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getIncidence24 <em>Incidence24</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getIncidence34 <em>Incidence34</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getIncidence43 <em>Incidence43</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getDeaths1 <em>Deaths1</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getDeaths2 <em>Deaths2</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getDeaths3 <em>Deaths3</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getDeaths4 <em>Deaths4</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getDeaths12 <em>Deaths12</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getDeaths21 <em>Deaths21</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getDeaths31 <em>Deaths31</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getDeaths41 <em>Deaths41</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getDeaths13 <em>Deaths13</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getDeaths23 <em>Deaths23</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getDeaths32 <em>Deaths32</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getDeaths42 <em>Deaths42</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getDeaths14 <em>Deaths14</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getDeaths24 <em>Deaths24</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getDeaths34 <em>Deaths34</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getDeaths43 <em>Deaths43</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue()
 * @model
 * @generated
 */
public interface DengueModelHostLableValue extends StandardDiseaseModelLabelValue {
	/**
	 * Returns the value of the '<em><b>E1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>E1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>E1</em>' attribute.
	 * @see #setE1(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_E1()
	 * @model
	 * @generated
	 */
	double getE1();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getE1 <em>E1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>E1</em>' attribute.
	 * @see #getE1()
	 * @generated
	 */
	void setE1(double value);

	/**
	 * Returns the value of the '<em><b>E2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>E2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>E2</em>' attribute.
	 * @see #setE2(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_E2()
	 * @model
	 * @generated
	 */
	double getE2();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getE2 <em>E2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>E2</em>' attribute.
	 * @see #getE2()
	 * @generated
	 */
	void setE2(double value);

	/**
	 * Returns the value of the '<em><b>E3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>E3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>E3</em>' attribute.
	 * @see #setE3(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_E3()
	 * @model
	 * @generated
	 */
	double getE3();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getE3 <em>E3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>E3</em>' attribute.
	 * @see #getE3()
	 * @generated
	 */
	void setE3(double value);

	/**
	 * Returns the value of the '<em><b>E4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>E4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>E4</em>' attribute.
	 * @see #setE4(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_E4()
	 * @model
	 * @generated
	 */
	double getE4();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getE4 <em>E4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>E4</em>' attribute.
	 * @see #getE4()
	 * @generated
	 */
	void setE4(double value);

	/**
	 * Returns the value of the '<em><b>I1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>I1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I1</em>' attribute.
	 * @see #setI1(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_I1()
	 * @model
	 * @generated
	 */
	double getI1();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getI1 <em>I1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>I1</em>' attribute.
	 * @see #getI1()
	 * @generated
	 */
	void setI1(double value);

	/**
	 * Returns the value of the '<em><b>I2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>I2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I2</em>' attribute.
	 * @see #setI2(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_I2()
	 * @model
	 * @generated
	 */
	double getI2();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getI2 <em>I2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>I2</em>' attribute.
	 * @see #getI2()
	 * @generated
	 */
	void setI2(double value);

	/**
	 * Returns the value of the '<em><b>I3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>I3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I3</em>' attribute.
	 * @see #setI3(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_I3()
	 * @model
	 * @generated
	 */
	double getI3();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getI3 <em>I3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>I3</em>' attribute.
	 * @see #getI3()
	 * @generated
	 */
	void setI3(double value);

	/**
	 * Returns the value of the '<em><b>I4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>I4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I4</em>' attribute.
	 * @see #setI4(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_I4()
	 * @model
	 * @generated
	 */
	double getI4();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getI4 <em>I4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>I4</em>' attribute.
	 * @see #getI4()
	 * @generated
	 */
	void setI4(double value);

	/**
	 * Returns the value of the '<em><b>T1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>T1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>T1</em>' attribute.
	 * @see #setT1(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_T1()
	 * @model
	 * @generated
	 */
	double getT1();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getT1 <em>T1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>T1</em>' attribute.
	 * @see #getT1()
	 * @generated
	 */
	void setT1(double value);

	/**
	 * Returns the value of the '<em><b>T2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>T2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>T2</em>' attribute.
	 * @see #setT2(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_T2()
	 * @model
	 * @generated
	 */
	double getT2();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getT2 <em>T2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>T2</em>' attribute.
	 * @see #getT2()
	 * @generated
	 */
	void setT2(double value);

	/**
	 * Returns the value of the '<em><b>T3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>T3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>T3</em>' attribute.
	 * @see #setT3(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_T3()
	 * @model
	 * @generated
	 */
	double getT3();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getT3 <em>T3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>T3</em>' attribute.
	 * @see #getT3()
	 * @generated
	 */
	void setT3(double value);

	/**
	 * Returns the value of the '<em><b>T4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>T4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>T4</em>' attribute.
	 * @see #setT4(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_T4()
	 * @model
	 * @generated
	 */
	double getT4();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getT4 <em>T4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>T4</em>' attribute.
	 * @see #getT4()
	 * @generated
	 */
	void setT4(double value);

	/**
	 * Returns the value of the '<em><b>R1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R1</em>' attribute.
	 * @see #setR1(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_R1()
	 * @model
	 * @generated
	 */
	double getR1();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getR1 <em>R1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R1</em>' attribute.
	 * @see #getR1()
	 * @generated
	 */
	void setR1(double value);

	/**
	 * Returns the value of the '<em><b>R2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R2</em>' attribute.
	 * @see #setR2(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_R2()
	 * @model
	 * @generated
	 */
	double getR2();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getR2 <em>R2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R2</em>' attribute.
	 * @see #getR2()
	 * @generated
	 */
	void setR2(double value);

	/**
	 * Returns the value of the '<em><b>R3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R3</em>' attribute.
	 * @see #setR3(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_R3()
	 * @model
	 * @generated
	 */
	double getR3();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getR3 <em>R3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R3</em>' attribute.
	 * @see #getR3()
	 * @generated
	 */
	void setR3(double value);

	/**
	 * Returns the value of the '<em><b>R4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R4</em>' attribute.
	 * @see #setR4(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_R4()
	 * @model
	 * @generated
	 */
	double getR4();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getR4 <em>R4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R4</em>' attribute.
	 * @see #getR4()
	 * @generated
	 */
	void setR4(double value);

	/**
	 * Returns the value of the '<em><b>E12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>E12</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>E12</em>' attribute.
	 * @see #setE12(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_E12()
	 * @model
	 * @generated
	 */
	double getE12();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getE12 <em>E12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>E12</em>' attribute.
	 * @see #getE12()
	 * @generated
	 */
	void setE12(double value);

	/**
	 * Returns the value of the '<em><b>E13</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>E13</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>E13</em>' attribute.
	 * @see #setE13(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_E13()
	 * @model
	 * @generated
	 */
	double getE13();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getE13 <em>E13</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>E13</em>' attribute.
	 * @see #getE13()
	 * @generated
	 */
	void setE13(double value);

	/**
	 * Returns the value of the '<em><b>E14</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>E14</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>E14</em>' attribute.
	 * @see #setE14(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_E14()
	 * @model
	 * @generated
	 */
	double getE14();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getE14 <em>E14</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>E14</em>' attribute.
	 * @see #getE14()
	 * @generated
	 */
	void setE14(double value);

	/**
	 * Returns the value of the '<em><b>E21</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>E21</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>E21</em>' attribute.
	 * @see #setE21(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_E21()
	 * @model
	 * @generated
	 */
	double getE21();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getE21 <em>E21</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>E21</em>' attribute.
	 * @see #getE21()
	 * @generated
	 */
	void setE21(double value);

	/**
	 * Returns the value of the '<em><b>E23</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>E23</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>E23</em>' attribute.
	 * @see #setE23(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_E23()
	 * @model
	 * @generated
	 */
	double getE23();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getE23 <em>E23</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>E23</em>' attribute.
	 * @see #getE23()
	 * @generated
	 */
	void setE23(double value);

	/**
	 * Returns the value of the '<em><b>E24</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>E24</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>E24</em>' attribute.
	 * @see #setE24(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_E24()
	 * @model
	 * @generated
	 */
	double getE24();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getE24 <em>E24</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>E24</em>' attribute.
	 * @see #getE24()
	 * @generated
	 */
	void setE24(double value);

	/**
	 * Returns the value of the '<em><b>E31</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>E31</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>E31</em>' attribute.
	 * @see #setE31(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_E31()
	 * @model
	 * @generated
	 */
	double getE31();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getE31 <em>E31</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>E31</em>' attribute.
	 * @see #getE31()
	 * @generated
	 */
	void setE31(double value);

	/**
	 * Returns the value of the '<em><b>E32</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>E32</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>E32</em>' attribute.
	 * @see #setE32(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_E32()
	 * @model
	 * @generated
	 */
	double getE32();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getE32 <em>E32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>E32</em>' attribute.
	 * @see #getE32()
	 * @generated
	 */
	void setE32(double value);

	/**
	 * Returns the value of the '<em><b>E34</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>E34</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>E34</em>' attribute.
	 * @see #setE34(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_E34()
	 * @model
	 * @generated
	 */
	double getE34();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getE34 <em>E34</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>E34</em>' attribute.
	 * @see #getE34()
	 * @generated
	 */
	void setE34(double value);

	/**
	 * Returns the value of the '<em><b>E41</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>E41</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>E41</em>' attribute.
	 * @see #setE41(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_E41()
	 * @model
	 * @generated
	 */
	double getE41();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getE41 <em>E41</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>E41</em>' attribute.
	 * @see #getE41()
	 * @generated
	 */
	void setE41(double value);

	/**
	 * Returns the value of the '<em><b>E42</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>E42</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>E42</em>' attribute.
	 * @see #setE42(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_E42()
	 * @model
	 * @generated
	 */
	double getE42();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getE42 <em>E42</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>E42</em>' attribute.
	 * @see #getE42()
	 * @generated
	 */
	void setE42(double value);

	/**
	 * Returns the value of the '<em><b>E43</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>E43</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>E43</em>' attribute.
	 * @see #setE43(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_E43()
	 * @model
	 * @generated
	 */
	double getE43();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getE43 <em>E43</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>E43</em>' attribute.
	 * @see #getE43()
	 * @generated
	 */
	void setE43(double value);

	/**
	 * Returns the value of the '<em><b>I12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>I12</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I12</em>' attribute.
	 * @see #setI12(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_I12()
	 * @model
	 * @generated
	 */
	double getI12();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getI12 <em>I12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>I12</em>' attribute.
	 * @see #getI12()
	 * @generated
	 */
	void setI12(double value);

	/**
	 * Returns the value of the '<em><b>I13</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>I13</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I13</em>' attribute.
	 * @see #setI13(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_I13()
	 * @model
	 * @generated
	 */
	double getI13();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getI13 <em>I13</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>I13</em>' attribute.
	 * @see #getI13()
	 * @generated
	 */
	void setI13(double value);

	/**
	 * Returns the value of the '<em><b>I14</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>I14</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I14</em>' attribute.
	 * @see #setI14(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_I14()
	 * @model
	 * @generated
	 */
	double getI14();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getI14 <em>I14</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>I14</em>' attribute.
	 * @see #getI14()
	 * @generated
	 */
	void setI14(double value);

	/**
	 * Returns the value of the '<em><b>I21</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>I21</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I21</em>' attribute.
	 * @see #setI21(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_I21()
	 * @model
	 * @generated
	 */
	double getI21();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getI21 <em>I21</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>I21</em>' attribute.
	 * @see #getI21()
	 * @generated
	 */
	void setI21(double value);

	/**
	 * Returns the value of the '<em><b>I23</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>I23</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I23</em>' attribute.
	 * @see #setI23(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_I23()
	 * @model
	 * @generated
	 */
	double getI23();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getI23 <em>I23</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>I23</em>' attribute.
	 * @see #getI23()
	 * @generated
	 */
	void setI23(double value);

	/**
	 * Returns the value of the '<em><b>I24</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>I24</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I24</em>' attribute.
	 * @see #setI24(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_I24()
	 * @model
	 * @generated
	 */
	double getI24();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getI24 <em>I24</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>I24</em>' attribute.
	 * @see #getI24()
	 * @generated
	 */
	void setI24(double value);

	/**
	 * Returns the value of the '<em><b>I31</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>I31</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I31</em>' attribute.
	 * @see #setI31(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_I31()
	 * @model
	 * @generated
	 */
	double getI31();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getI31 <em>I31</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>I31</em>' attribute.
	 * @see #getI31()
	 * @generated
	 */
	void setI31(double value);

	/**
	 * Returns the value of the '<em><b>I32</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>I32</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I32</em>' attribute.
	 * @see #setI32(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_I32()
	 * @model
	 * @generated
	 */
	double getI32();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getI32 <em>I32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>I32</em>' attribute.
	 * @see #getI32()
	 * @generated
	 */
	void setI32(double value);

	/**
	 * Returns the value of the '<em><b>I34</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>I34</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I34</em>' attribute.
	 * @see #setI34(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_I34()
	 * @model
	 * @generated
	 */
	double getI34();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getI34 <em>I34</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>I34</em>' attribute.
	 * @see #getI34()
	 * @generated
	 */
	void setI34(double value);

	/**
	 * Returns the value of the '<em><b>I41</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>I41</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I41</em>' attribute.
	 * @see #setI41(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_I41()
	 * @model
	 * @generated
	 */
	double getI41();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getI41 <em>I41</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>I41</em>' attribute.
	 * @see #getI41()
	 * @generated
	 */
	void setI41(double value);

	/**
	 * Returns the value of the '<em><b>I42</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>I42</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I42</em>' attribute.
	 * @see #setI42(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_I42()
	 * @model
	 * @generated
	 */
	double getI42();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getI42 <em>I42</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>I42</em>' attribute.
	 * @see #getI42()
	 * @generated
	 */
	void setI42(double value);

	/**
	 * Returns the value of the '<em><b>I43</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>I43</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I43</em>' attribute.
	 * @see #setI43(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_I43()
	 * @model
	 * @generated
	 */
	double getI43();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getI43 <em>I43</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>I43</em>' attribute.
	 * @see #getI43()
	 * @generated
	 */
	void setI43(double value);

	/**
	 * Returns the value of the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R</em>' attribute.
	 * @see #setR(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_R()
	 * @model
	 * @generated
	 */
	double getR();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' attribute.
	 * @see #getR()
	 * @generated
	 */
	void setR(double value);

	/**
	 * Returns the value of the '<em><b>Incidence1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incidence1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incidence1</em>' attribute.
	 * @see #setIncidence1(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_Incidence1()
	 * @model
	 * @generated
	 */
	double getIncidence1();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getIncidence1 <em>Incidence1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incidence1</em>' attribute.
	 * @see #getIncidence1()
	 * @generated
	 */
	void setIncidence1(double value);

	/**
	 * Returns the value of the '<em><b>Incidence2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incidence2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incidence2</em>' attribute.
	 * @see #setIncidence2(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_Incidence2()
	 * @model
	 * @generated
	 */
	double getIncidence2();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getIncidence2 <em>Incidence2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incidence2</em>' attribute.
	 * @see #getIncidence2()
	 * @generated
	 */
	void setIncidence2(double value);

	/**
	 * Returns the value of the '<em><b>Incidence3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incidence3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incidence3</em>' attribute.
	 * @see #setIncidence3(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_Incidence3()
	 * @model
	 * @generated
	 */
	double getIncidence3();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getIncidence3 <em>Incidence3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incidence3</em>' attribute.
	 * @see #getIncidence3()
	 * @generated
	 */
	void setIncidence3(double value);

	/**
	 * Returns the value of the '<em><b>Incidence4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incidence4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incidence4</em>' attribute.
	 * @see #setIncidence4(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_Incidence4()
	 * @model
	 * @generated
	 */
	double getIncidence4();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getIncidence4 <em>Incidence4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incidence4</em>' attribute.
	 * @see #getIncidence4()
	 * @generated
	 */
	void setIncidence4(double value);

	/**
	 * Returns the value of the '<em><b>Incidence12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incidence12</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incidence12</em>' attribute.
	 * @see #setIncidence12(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_Incidence12()
	 * @model
	 * @generated
	 */
	double getIncidence12();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getIncidence12 <em>Incidence12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incidence12</em>' attribute.
	 * @see #getIncidence12()
	 * @generated
	 */
	void setIncidence12(double value);

	/**
	 * Returns the value of the '<em><b>Incidence21</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incidence21</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incidence21</em>' attribute.
	 * @see #setIncidence21(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_Incidence21()
	 * @model
	 * @generated
	 */
	double getIncidence21();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getIncidence21 <em>Incidence21</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incidence21</em>' attribute.
	 * @see #getIncidence21()
	 * @generated
	 */
	void setIncidence21(double value);

	/**
	 * Returns the value of the '<em><b>Incidence31</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incidence31</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incidence31</em>' attribute.
	 * @see #setIncidence31(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_Incidence31()
	 * @model
	 * @generated
	 */
	double getIncidence31();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getIncidence31 <em>Incidence31</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incidence31</em>' attribute.
	 * @see #getIncidence31()
	 * @generated
	 */
	void setIncidence31(double value);

	/**
	 * Returns the value of the '<em><b>Incidence41</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incidence41</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incidence41</em>' attribute.
	 * @see #setIncidence41(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_Incidence41()
	 * @model
	 * @generated
	 */
	double getIncidence41();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getIncidence41 <em>Incidence41</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incidence41</em>' attribute.
	 * @see #getIncidence41()
	 * @generated
	 */
	void setIncidence41(double value);

	/**
	 * Returns the value of the '<em><b>Incidence13</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incidence13</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incidence13</em>' attribute.
	 * @see #setIncidence13(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_Incidence13()
	 * @model
	 * @generated
	 */
	double getIncidence13();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getIncidence13 <em>Incidence13</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incidence13</em>' attribute.
	 * @see #getIncidence13()
	 * @generated
	 */
	void setIncidence13(double value);

	/**
	 * Returns the value of the '<em><b>Incidence23</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incidence23</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incidence23</em>' attribute.
	 * @see #setIncidence23(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_Incidence23()
	 * @model
	 * @generated
	 */
	double getIncidence23();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getIncidence23 <em>Incidence23</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incidence23</em>' attribute.
	 * @see #getIncidence23()
	 * @generated
	 */
	void setIncidence23(double value);

	/**
	 * Returns the value of the '<em><b>Incidence32</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incidence32</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incidence32</em>' attribute.
	 * @see #setIncidence32(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_Incidence32()
	 * @model
	 * @generated
	 */
	double getIncidence32();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getIncidence32 <em>Incidence32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incidence32</em>' attribute.
	 * @see #getIncidence32()
	 * @generated
	 */
	void setIncidence32(double value);

	/**
	 * Returns the value of the '<em><b>Incidence42</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incidence42</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incidence42</em>' attribute.
	 * @see #setIncidence42(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_Incidence42()
	 * @model
	 * @generated
	 */
	double getIncidence42();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getIncidence42 <em>Incidence42</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incidence42</em>' attribute.
	 * @see #getIncidence42()
	 * @generated
	 */
	void setIncidence42(double value);

	/**
	 * Returns the value of the '<em><b>Incidence14</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incidence14</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incidence14</em>' attribute.
	 * @see #setIncidence14(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_Incidence14()
	 * @model
	 * @generated
	 */
	double getIncidence14();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getIncidence14 <em>Incidence14</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incidence14</em>' attribute.
	 * @see #getIncidence14()
	 * @generated
	 */
	void setIncidence14(double value);

	/**
	 * Returns the value of the '<em><b>Incidence24</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incidence24</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incidence24</em>' attribute.
	 * @see #setIncidence24(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_Incidence24()
	 * @model
	 * @generated
	 */
	double getIncidence24();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getIncidence24 <em>Incidence24</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incidence24</em>' attribute.
	 * @see #getIncidence24()
	 * @generated
	 */
	void setIncidence24(double value);

	/**
	 * Returns the value of the '<em><b>Incidence34</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incidence34</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incidence34</em>' attribute.
	 * @see #setIncidence34(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_Incidence34()
	 * @model
	 * @generated
	 */
	double getIncidence34();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getIncidence34 <em>Incidence34</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incidence34</em>' attribute.
	 * @see #getIncidence34()
	 * @generated
	 */
	void setIncidence34(double value);

	/**
	 * Returns the value of the '<em><b>Incidence43</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incidence43</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incidence43</em>' attribute.
	 * @see #setIncidence43(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_Incidence43()
	 * @model
	 * @generated
	 */
	double getIncidence43();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getIncidence43 <em>Incidence43</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incidence43</em>' attribute.
	 * @see #getIncidence43()
	 * @generated
	 */
	void setIncidence43(double value);

	/**
	 * Returns the value of the '<em><b>Deaths1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deaths1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deaths1</em>' attribute.
	 * @see #setDeaths1(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_Deaths1()
	 * @model
	 * @generated
	 */
	double getDeaths1();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getDeaths1 <em>Deaths1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deaths1</em>' attribute.
	 * @see #getDeaths1()
	 * @generated
	 */
	void setDeaths1(double value);

	/**
	 * Returns the value of the '<em><b>Deaths2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deaths2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deaths2</em>' attribute.
	 * @see #setDeaths2(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_Deaths2()
	 * @model
	 * @generated
	 */
	double getDeaths2();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getDeaths2 <em>Deaths2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deaths2</em>' attribute.
	 * @see #getDeaths2()
	 * @generated
	 */
	void setDeaths2(double value);

	/**
	 * Returns the value of the '<em><b>Deaths3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deaths3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deaths3</em>' attribute.
	 * @see #setDeaths3(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_Deaths3()
	 * @model
	 * @generated
	 */
	double getDeaths3();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getDeaths3 <em>Deaths3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deaths3</em>' attribute.
	 * @see #getDeaths3()
	 * @generated
	 */
	void setDeaths3(double value);

	/**
	 * Returns the value of the '<em><b>Deaths4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deaths4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deaths4</em>' attribute.
	 * @see #setDeaths4(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_Deaths4()
	 * @model
	 * @generated
	 */
	double getDeaths4();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getDeaths4 <em>Deaths4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deaths4</em>' attribute.
	 * @see #getDeaths4()
	 * @generated
	 */
	void setDeaths4(double value);

	/**
	 * Returns the value of the '<em><b>Deaths12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deaths12</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deaths12</em>' attribute.
	 * @see #setDeaths12(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_Deaths12()
	 * @model
	 * @generated
	 */
	double getDeaths12();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getDeaths12 <em>Deaths12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deaths12</em>' attribute.
	 * @see #getDeaths12()
	 * @generated
	 */
	void setDeaths12(double value);

	/**
	 * Returns the value of the '<em><b>Deaths21</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deaths21</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deaths21</em>' attribute.
	 * @see #setDeaths21(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_Deaths21()
	 * @model
	 * @generated
	 */
	double getDeaths21();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getDeaths21 <em>Deaths21</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deaths21</em>' attribute.
	 * @see #getDeaths21()
	 * @generated
	 */
	void setDeaths21(double value);

	/**
	 * Returns the value of the '<em><b>Deaths31</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deaths31</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deaths31</em>' attribute.
	 * @see #setDeaths31(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_Deaths31()
	 * @model
	 * @generated
	 */
	double getDeaths31();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getDeaths31 <em>Deaths31</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deaths31</em>' attribute.
	 * @see #getDeaths31()
	 * @generated
	 */
	void setDeaths31(double value);

	/**
	 * Returns the value of the '<em><b>Deaths41</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deaths41</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deaths41</em>' attribute.
	 * @see #setDeaths41(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_Deaths41()
	 * @model
	 * @generated
	 */
	double getDeaths41();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getDeaths41 <em>Deaths41</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deaths41</em>' attribute.
	 * @see #getDeaths41()
	 * @generated
	 */
	void setDeaths41(double value);

	/**
	 * Returns the value of the '<em><b>Deaths13</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deaths13</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deaths13</em>' attribute.
	 * @see #setDeaths13(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_Deaths13()
	 * @model
	 * @generated
	 */
	double getDeaths13();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getDeaths13 <em>Deaths13</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deaths13</em>' attribute.
	 * @see #getDeaths13()
	 * @generated
	 */
	void setDeaths13(double value);

	/**
	 * Returns the value of the '<em><b>Deaths23</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deaths23</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deaths23</em>' attribute.
	 * @see #setDeaths23(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_Deaths23()
	 * @model
	 * @generated
	 */
	double getDeaths23();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getDeaths23 <em>Deaths23</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deaths23</em>' attribute.
	 * @see #getDeaths23()
	 * @generated
	 */
	void setDeaths23(double value);

	/**
	 * Returns the value of the '<em><b>Deaths32</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deaths32</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deaths32</em>' attribute.
	 * @see #setDeaths32(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_Deaths32()
	 * @model
	 * @generated
	 */
	double getDeaths32();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getDeaths32 <em>Deaths32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deaths32</em>' attribute.
	 * @see #getDeaths32()
	 * @generated
	 */
	void setDeaths32(double value);

	/**
	 * Returns the value of the '<em><b>Deaths42</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deaths42</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deaths42</em>' attribute.
	 * @see #setDeaths42(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_Deaths42()
	 * @model
	 * @generated
	 */
	double getDeaths42();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getDeaths42 <em>Deaths42</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deaths42</em>' attribute.
	 * @see #getDeaths42()
	 * @generated
	 */
	void setDeaths42(double value);

	/**
	 * Returns the value of the '<em><b>Deaths14</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deaths14</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deaths14</em>' attribute.
	 * @see #setDeaths14(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_Deaths14()
	 * @model
	 * @generated
	 */
	double getDeaths14();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getDeaths14 <em>Deaths14</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deaths14</em>' attribute.
	 * @see #getDeaths14()
	 * @generated
	 */
	void setDeaths14(double value);

	/**
	 * Returns the value of the '<em><b>Deaths24</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deaths24</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deaths24</em>' attribute.
	 * @see #setDeaths24(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_Deaths24()
	 * @model
	 * @generated
	 */
	double getDeaths24();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getDeaths24 <em>Deaths24</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deaths24</em>' attribute.
	 * @see #getDeaths24()
	 * @generated
	 */
	void setDeaths24(double value);

	/**
	 * Returns the value of the '<em><b>Deaths34</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deaths34</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deaths34</em>' attribute.
	 * @see #setDeaths34(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_Deaths34()
	 * @model
	 * @generated
	 */
	double getDeaths34();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getDeaths34 <em>Deaths34</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deaths34</em>' attribute.
	 * @see #getDeaths34()
	 * @generated
	 */
	void setDeaths34(double value);

	/**
	 * Returns the value of the '<em><b>Deaths43</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deaths43</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deaths43</em>' attribute.
	 * @see #setDeaths43(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getDengueModelHostLableValue_Deaths43()
	 * @model
	 * @generated
	 */
	double getDeaths43();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLableValue#getDeaths43 <em>Deaths43</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deaths43</em>' attribute.
	 * @see #getDeaths43()
	 * @generated
	 */
	void setDeaths43(double value);

} // DengueModelHostLableValue
