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

import org.eclipse.emf.common.util.URI;
import org.eclipse.stem.core.model.TransformationDecorator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Food Transformer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.foodproduction.FoodTransformer#getSourcePopulationName <em>Source Population Name</em>}</li>
 *   <li>{@link org.eclipse.stem.foodproduction.FoodTransformer#getTargetPopulationName <em>Target Population Name</em>}</li>
 *   <li>{@link org.eclipse.stem.foodproduction.FoodTransformer#getTargetURI <em>Target URI</em>}</li>
 *   <li>{@link org.eclipse.stem.foodproduction.FoodTransformer#getTimePeriod <em>Time Period</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.foodproduction.FoodproductionPackage#getFoodTransformer()
 * @model abstract="true"
 * @generated
 */
public interface FoodTransformer extends TransformationDecorator {
	/**
	 * Returns the value of the '<em><b>Source Population Name</b></em>' attribute.
	 * The default value is <code>"cattle"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Population Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Population Name</em>' attribute.
	 * @see #setSourcePopulationName(String)
	 * @see org.eclipse.stem.foodproduction.FoodproductionPackage#getFoodTransformer_SourcePopulationName()
	 * @model default="cattle"
	 * @generated
	 */
	String getSourcePopulationName();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.foodproduction.FoodTransformer#getSourcePopulationName <em>Source Population Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Population Name</em>' attribute.
	 * @see #getSourcePopulationName()
	 * @generated
	 */
	void setSourcePopulationName(String value);

	/**
	 * Returns the value of the '<em><b>Target Population Name</b></em>' attribute.
	 * The default value is <code>"beef"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Population Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Population Name</em>' attribute.
	 * @see #setTargetPopulationName(String)
	 * @see org.eclipse.stem.foodproduction.FoodproductionPackage#getFoodTransformer_TargetPopulationName()
	 * @model default="beef"
	 * @generated
	 */
	String getTargetPopulationName();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.foodproduction.FoodTransformer#getTargetPopulationName <em>Target Population Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Population Name</em>' attribute.
	 * @see #getTargetPopulationName()
	 * @generated
	 */
	void setTargetPopulationName(String value);

	/**
	 * Returns the value of the '<em><b>Target URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target URI</em>' attribute.
	 * @see #setTargetURI(URI)
	 * @see org.eclipse.stem.foodproduction.FoodproductionPackage#getFoodTransformer_TargetURI()
	 * @model dataType="org.eclipse.stem.core.common.URI"
	 * @generated
	 */
	URI getTargetURI();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.foodproduction.FoodTransformer#getTargetURI <em>Target URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target URI</em>' attribute.
	 * @see #getTargetURI()
	 * @generated
	 */
	void setTargetURI(URI value);

	/**
	 * Returns the value of the '<em><b>Time Period</b></em>' attribute.
	 * The default value is <code>"86400000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Period</em>' attribute.
	 * @see #setTimePeriod(long)
	 * @see org.eclipse.stem.foodproduction.FoodproductionPackage#getFoodTransformer_TimePeriod()
	 * @model default="86400000"
	 * @generated
	 */
	long getTimePeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.foodproduction.FoodTransformer#getTimePeriod <em>Time Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Period</em>' attribute.
	 * @see #getTimePeriod()
	 * @generated
	 */
	void setTimePeriod(long value);

} // FoodTransformer
