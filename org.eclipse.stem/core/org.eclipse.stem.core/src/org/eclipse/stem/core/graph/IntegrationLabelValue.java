package org.eclipse.stem.core.graph;
/******************************************************************************* 
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     IBM Corporation - initial API and implementation 
 *******************************************************************************/

import org.eclipse.emf.common.util.EList;
import org.eclipse.stem.core.common.PrimitiveTypeOperations;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integration Label Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.core.graph.IntegrationLabelValue#getArrivals <em>Arrivals</em>}</li>
 *   <li>{@link org.eclipse.stem.core.graph.IntegrationLabelValue#getDepartures <em>Departures</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.core.graph.GraphPackage#getIntegrationLabelValue()
 * @model abstract="true"
 * @generated
 */
public interface IntegrationLabelValue extends LabelValue, PrimitiveTypeOperations {
	/**
	 * Returns the value of the '<em><b>Arrivals</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.stem.core.graph.Exchange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrivals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrivals</em>' reference list.
	 * @see org.eclipse.stem.core.graph.GraphPackage#getIntegrationLabelValue_Arrivals()
	 * @model changeable="false"
	 * @generated
	 */
	EList<Exchange> getArrivals();

	/**
	 * Returns the value of the '<em><b>Departures</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.stem.core.graph.Exchange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Departures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departures</em>' reference list.
	 * @see org.eclipse.stem.core.graph.GraphPackage#getIntegrationLabelValue_Departures()
	 * @model changeable="false"
	 * @generated
	 */
	EList<Exchange> getDepartures();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IntegrationLabelValue set(IntegrationLabelValue value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IntegrationLabelValue add(IntegrationLabelValue value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IntegrationLabelValue sub(IntegrationLabelValue value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IntegrationLabelValue scale(double scaleFactor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IntegrationLabelValue add(double addition);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IntegrationLabelValue abs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean avoidNegative(IntegrationLabelValue value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double computeDeltaAdjustment(IntegrationLabelValue value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IntegrationLabelValue divide(IntegrationLabelValue value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double max();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void prepareCycle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IntegrationLabelValue copy();

} // IntegrationLabelValue
