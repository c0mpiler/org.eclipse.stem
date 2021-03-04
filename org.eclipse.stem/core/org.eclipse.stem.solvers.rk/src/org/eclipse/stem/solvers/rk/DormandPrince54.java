package org.eclipse.stem.solvers.rk;

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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dormand Prince54</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.solvers.rk.DormandPrince54#getRelativeTolerance <em>Relative Tolerance</em>}</li>
 *   <li>{@link org.eclipse.stem.solvers.rk.DormandPrince54#getAbsoluteTolerance <em>Absolute Tolerance</em>}</li>
 *   <li>{@link org.eclipse.stem.solvers.rk.DormandPrince54#getMinStep <em>Min Step</em>}</li>
 *   <li>{@link org.eclipse.stem.solvers.rk.DormandPrince54#getMaxStep <em>Max Step</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.solvers.rk.RkPackage#getDormandPrince54()
 * @model
 * @generated
 */
public interface DormandPrince54 extends ApacheCommonsMathODESolver {
	/**
	 * Returns the value of the '<em><b>Relative Tolerance</b></em>' attribute.
	 * The default value is <code>"1E-9"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Tolerance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Tolerance</em>' attribute.
	 * @see #setRelativeTolerance(double)
	 * @see org.eclipse.stem.solvers.rk.RkPackage#getDormandPrince54_RelativeTolerance()
	 * @model default="1E-9"
	 * @generated
	 */
	double getRelativeTolerance();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.solvers.rk.DormandPrince54#getRelativeTolerance <em>Relative Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Tolerance</em>' attribute.
	 * @see #getRelativeTolerance()
	 * @generated
	 */
	void setRelativeTolerance(double value);

	/**
	 * Returns the value of the '<em><b>Absolute Tolerance</b></em>' attribute.
	 * The default value is <code>"1E-5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Absolute Tolerance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Absolute Tolerance</em>' attribute.
	 * @see #setAbsoluteTolerance(double)
	 * @see org.eclipse.stem.solvers.rk.RkPackage#getDormandPrince54_AbsoluteTolerance()
	 * @model default="1E-5"
	 * @generated
	 */
	double getAbsoluteTolerance();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.solvers.rk.DormandPrince54#getAbsoluteTolerance <em>Absolute Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Absolute Tolerance</em>' attribute.
	 * @see #getAbsoluteTolerance()
	 * @generated
	 */
	void setAbsoluteTolerance(double value);

	/**
	 * Returns the value of the '<em><b>Min Step</b></em>' attribute.
	 * The default value is <code>"1E-8"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Step</em>' attribute.
	 * @see #setMinStep(double)
	 * @see org.eclipse.stem.solvers.rk.RkPackage#getDormandPrince54_MinStep()
	 * @model default="1E-8"
	 * @generated
	 */
	double getMinStep();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.solvers.rk.DormandPrince54#getMinStep <em>Min Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Step</em>' attribute.
	 * @see #getMinStep()
	 * @generated
	 */
	void setMinStep(double value);

	/**
	 * Returns the value of the '<em><b>Max Step</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Step</em>' attribute.
	 * @see #setMaxStep(double)
	 * @see org.eclipse.stem.solvers.rk.RkPackage#getDormandPrince54_MaxStep()
	 * @model default="1.0"
	 * @generated
	 */
	double getMaxStep();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.solvers.rk.DormandPrince54#getMaxStep <em>Max Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Step</em>' attribute.
	 * @see #getMaxStep()
	 * @generated
	 */
	void setMaxStep(double value);

} // DormandPrince54
