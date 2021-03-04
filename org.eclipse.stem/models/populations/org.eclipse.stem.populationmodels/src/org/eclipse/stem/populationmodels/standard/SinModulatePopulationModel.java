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
package org.eclipse.stem.populationmodels.standard;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sin Modulate Population Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.SinModulatePopulationModel#getPhaseShift <em>Phase Shift</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.SinModulatePopulationModel#getPeriodSin <em>Period Sin</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.SinModulatePopulationModel#getMaxBound <em>Max Bound</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.SinModulatePopulationModel#getMinBound <em>Min Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getSinModulatePopulationModel()
 * @model
 * @generated
 */
public interface SinModulatePopulationModel extends StandardPopulationModel {
	/**
	 * Returns the value of the '<em><b>Phase Shift</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Shift</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Shift</em>' attribute.
	 * @see #setPhaseShift(double)
	 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getSinModulatePopulationModel_PhaseShift()
	 * @model default="0.0"
	 * @generated
	 */
	double getPhaseShift();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.populationmodels.standard.SinModulatePopulationModel#getPhaseShift <em>Phase Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Shift</em>' attribute.
	 * @see #getPhaseShift()
	 * @generated
	 */
	void setPhaseShift(double value);

	/**
	 * Returns the value of the '<em><b>Period Sin</b></em>' attribute.
	 * The default value is <code>"365.25"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period Sin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period Sin</em>' attribute.
	 * @see #setPeriodSin(double)
	 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getSinModulatePopulationModel_PeriodSin()
	 * @model default="365.25"
	 * @generated
	 */
	double getPeriodSin();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.populationmodels.standard.SinModulatePopulationModel#getPeriodSin <em>Period Sin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Sin</em>' attribute.
	 * @see #getPeriodSin()
	 * @generated
	 */
	void setPeriodSin(double value);

	/**
	 * Returns the value of the '<em><b>Max Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Bound</em>' attribute.
	 * @see #setMaxBound(double)
	 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getSinModulatePopulationModel_MaxBound()
	 * @model default="1"
	 * @generated
	 */
	double getMaxBound();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.populationmodels.standard.SinModulatePopulationModel#getMaxBound <em>Max Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Bound</em>' attribute.
	 * @see #getMaxBound()
	 * @generated
	 */
	void setMaxBound(double value);

	/**
	 * Returns the value of the '<em><b>Min Bound</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Bound</em>' attribute.
	 * @see #setMinBound(double)
	 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getSinModulatePopulationModel_MinBound()
	 * @model default="0"
	 * @generated
	 */
	double getMinBound();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.populationmodels.standard.SinModulatePopulationModel#getMinBound <em>Min Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Bound</em>' attribute.
	 * @see #getMinBound()
	 * @generated
	 */
	void setMinBound(double value);

} // SinModulatePopulationModel
