package org.eclipse.stem.populationmodels.standard;
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
 * A representation of the model object '<em><b>Population Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.StandardPopulationModel#getBirthRate <em>Birth Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.StandardPopulationModel#getDeathRate <em>Death Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getStandardPopulationModel()
 * @model
 * @generated
 */
public interface StandardPopulationModel extends PopulationModel {
	/**
	 * Returns the value of the '<em><b>Birth Rate</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Birth Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birth Rate</em>' attribute.
	 * @see #setBirthRate(double)
	 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getStandardPopulationModel_BirthRate()
	 * @model default="0.0"
	 * @generated
	 */
	double getBirthRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.populationmodels.standard.StandardPopulationModel#getBirthRate <em>Birth Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birth Rate</em>' attribute.
	 * @see #getBirthRate()
	 * @generated
	 */
	void setBirthRate(double value);

	/**
	 * Returns the value of the '<em><b>Death Rate</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Death Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Death Rate</em>' attribute.
	 * @see #setDeathRate(double)
	 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getStandardPopulationModel_DeathRate()
	 * @model default="0.0"
	 * @generated
	 */
	double getDeathRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.populationmodels.standard.StandardPopulationModel#getDeathRate <em>Death Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Death Rate</em>' attribute.
	 * @see #getDeathRate()
	 * @generated
	 */
	void setDeathRate(double value);

} // StandardPopulationModel
