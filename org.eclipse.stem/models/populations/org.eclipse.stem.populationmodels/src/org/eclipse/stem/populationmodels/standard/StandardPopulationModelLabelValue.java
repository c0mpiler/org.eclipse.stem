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
 * A representation of the model object '<em><b>Population Model Label Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabelValue#getCount <em>Count</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabelValue#getBirths <em>Births</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabelValue#getDeaths <em>Deaths</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabelValue#getDensity <em>Density</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getStandardPopulationModelLabelValue()
 * @model
 * @generated
 */
public interface StandardPopulationModelLabelValue extends PopulationModelLabelValue {

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(double)
	 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getStandardPopulationModelLabelValue_Count()
	 * @model
	 * @generated
	 */
	double getCount();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabelValue#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(double value);

	/**
	 * Returns the value of the '<em><b>Births</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Births</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Births</em>' attribute.
	 * @see #setBirths(double)
	 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getStandardPopulationModelLabelValue_Births()
	 * @model
	 * @generated
	 */
	double getBirths();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabelValue#getBirths <em>Births</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Births</em>' attribute.
	 * @see #getBirths()
	 * @generated
	 */
	void setBirths(double value);

	/**
	 * Returns the value of the '<em><b>Deaths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deaths</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deaths</em>' attribute.
	 * @see #setDeaths(double)
	 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getStandardPopulationModelLabelValue_Deaths()
	 * @model
	 * @generated
	 */
	double getDeaths();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabelValue#getDeaths <em>Deaths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deaths</em>' attribute.
	 * @see #getDeaths()
	 * @generated
	 */
	void setDeaths(double value);

	/**
	 * Returns the value of the '<em><b>Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Density</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Density</em>' attribute.
	 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getStandardPopulationModelLabelValue_Density()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	double getDensity();
} // StandardPopulationModelLabelValue
