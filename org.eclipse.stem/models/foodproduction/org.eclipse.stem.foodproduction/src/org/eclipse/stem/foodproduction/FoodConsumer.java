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
 * A representation of the model object '<em><b>Food Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.foodproduction.FoodConsumer#getConsumptionRate <em>Consumption Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.foodproduction.FoodConsumer#getConsumptionType <em>Consumption Type</em>}</li>
 *   <li>{@link org.eclipse.stem.foodproduction.FoodConsumer#getWasteRate <em>Waste Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.foodproduction.FoodConsumer#getMaxVolumeOfStocks <em>Max Volume Of Stocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.foodproduction.FoodproductionPackage#getFoodConsumer()
 * @model
 * @generated
 */
public interface FoodConsumer extends FoodTransformer, DiseaseCarryingTransformer {
	/**
	 * Returns the value of the '<em><b>Consumption Rate</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumption Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumption Rate</em>' attribute.
	 * @see #setConsumptionRate(double)
	 * @see org.eclipse.stem.foodproduction.FoodproductionPackage#getFoodConsumer_ConsumptionRate()
	 * @model default="0.1"
	 * @generated
	 */
	double getConsumptionRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.foodproduction.FoodConsumer#getConsumptionRate <em>Consumption Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumption Rate</em>' attribute.
	 * @see #getConsumptionRate()
	 * @generated
	 */
	void setConsumptionRate(double value);

	/**
	 * Returns the value of the '<em><b>Consumption Type</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * The literals are from the enumeration {@link org.eclipse.stem.foodproduction.ConsumptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumption Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumption Type</em>' attribute.
	 * @see org.eclipse.stem.foodproduction.ConsumptionType
	 * @see #setConsumptionType(ConsumptionType)
	 * @see org.eclipse.stem.foodproduction.FoodproductionPackage#getFoodConsumer_ConsumptionType()
	 * @model default="1"
	 * @generated
	 */
	ConsumptionType getConsumptionType();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.foodproduction.FoodConsumer#getConsumptionType <em>Consumption Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumption Type</em>' attribute.
	 * @see org.eclipse.stem.foodproduction.ConsumptionType
	 * @see #getConsumptionType()
	 * @generated
	 */
	void setConsumptionType(ConsumptionType value);

	/**
	 * Returns the value of the '<em><b>Waste Rate</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Waste Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waste Rate</em>' attribute.
	 * @see #setWasteRate(double)
	 * @see org.eclipse.stem.foodproduction.FoodproductionPackage#getFoodConsumer_WasteRate()
	 * @model default="0.0"
	 * @generated
	 */
	double getWasteRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.foodproduction.FoodConsumer#getWasteRate <em>Waste Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Waste Rate</em>' attribute.
	 * @see #getWasteRate()
	 * @generated
	 */
	void setWasteRate(double value);

	/**
	 * Returns the value of the '<em><b>Max Volume Of Stocks</b></em>' attribute.
	 * The default value is <code>"1000000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Volume Of Stocks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Volume Of Stocks</em>' attribute.
	 * @see #setMaxVolumeOfStocks(double)
	 * @see org.eclipse.stem.foodproduction.FoodproductionPackage#getFoodConsumer_MaxVolumeOfStocks()
	 * @model default="1000000"
	 * @generated
	 */
	double getMaxVolumeOfStocks();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.foodproduction.FoodConsumer#getMaxVolumeOfStocks <em>Max Volume Of Stocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Volume Of Stocks</em>' attribute.
	 * @see #getMaxVolumeOfStocks()
	 * @generated
	 */
	void setMaxVolumeOfStocks(double value);

} // FoodConsumer
