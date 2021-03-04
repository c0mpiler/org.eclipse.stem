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
package org.eclipse.stem.foodproduction;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Food Producer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.foodproduction.FoodProducer#getFoodYieldPopulationMultiplier <em>Food Yield Population Multiplier</em>}</li>
 *   <li>{@link org.eclipse.stem.foodproduction.FoodProducer#getSourceProcessingRate <em>Source Processing Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.foodproduction.FoodproductionPackage#getFoodProducer()
 * @model
 * @generated
 */
public interface FoodProducer extends FoodTransformer {
	/**
	 * Returns the value of the '<em><b>Food Yield Population Multiplier</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Food Yield Population Multiplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Food Yield Population Multiplier</em>' attribute.
	 * @see #setFoodYieldPopulationMultiplier(double)
	 * @see org.eclipse.stem.foodproduction.FoodproductionPackage#getFoodProducer_FoodYieldPopulationMultiplier()
	 * @model default="100"
	 * @generated
	 */
	double getFoodYieldPopulationMultiplier();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.foodproduction.FoodProducer#getFoodYieldPopulationMultiplier <em>Food Yield Population Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Food Yield Population Multiplier</em>' attribute.
	 * @see #getFoodYieldPopulationMultiplier()
	 * @generated
	 */
	void setFoodYieldPopulationMultiplier(double value);

	/**
	 * Returns the value of the '<em><b>Source Processing Rate</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Processing Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Processing Rate</em>' attribute.
	 * @see #setSourceProcessingRate(double)
	 * @see org.eclipse.stem.foodproduction.FoodproductionPackage#getFoodProducer_SourceProcessingRate()
	 * @model default="1.0"
	 * @generated
	 */
	double getSourceProcessingRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.foodproduction.FoodProducer#getSourceProcessingRate <em>Source Processing Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Processing Rate</em>' attribute.
	 * @see #getSourceProcessingRate()
	 * @generated
	 */
	void setSourceProcessingRate(double value);

} // FoodProducer
