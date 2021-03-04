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
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exchange</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.core.graph.Exchange#getOtherLabels <em>Other Labels</em>}</li>
 *   <li>{@link org.eclipse.stem.core.graph.Exchange#getCount <em>Count</em>}</li>
 *   <li>{@link org.eclipse.stem.core.graph.Exchange#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.stem.core.graph.Exchange#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.stem.core.graph.Exchange#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.stem.core.graph.Exchange#getForIncidence <em>For Incidence</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.core.graph.GraphPackage#getExchange()
 * @model superTypes="org.eclipse.stem.core.common.Comparable<org.eclipse.stem.core.graph.Exchange>"
 * @generated
 */
public interface Exchange extends EObject, Comparable<Exchange> {
	/**
	 * Returns the value of the '<em><b>Other Labels</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.stem.core.graph.Label}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Labels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Labels</em>' reference list.
	 * @see org.eclipse.stem.core.graph.GraphPackage#getExchange_OtherLabels()
	 * @model
	 * @generated
	 */
	EList<Label> getOtherLabels();

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
	 * @see org.eclipse.stem.core.graph.GraphPackage#getExchange_Count()
	 * @model
	 * @generated
	 */
	double getCount();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.graph.Exchange#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(double value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.stem.core.graph.ExchangeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.stem.core.graph.ExchangeType
	 * @see #setType(ExchangeType)
	 * @see org.eclipse.stem.core.graph.GraphPackage#getExchange_Type()
	 * @model
	 * @generated
	 */
	ExchangeType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.graph.Exchange#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.stem.core.graph.ExchangeType
	 * @see #getType()
	 * @generated
	 */
	void setType(ExchangeType value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(EAttribute)
	 * @see org.eclipse.stem.core.graph.GraphPackage#getExchange_Source()
	 * @model
	 * @generated
	 */
	EAttribute getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.graph.Exchange#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(EAttribute value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(EAttribute)
	 * @see org.eclipse.stem.core.graph.GraphPackage#getExchange_Target()
	 * @model
	 * @generated
	 */
	EAttribute getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.graph.Exchange#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(EAttribute value);

	/**
	 * Returns the value of the '<em><b>For Incidence</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Incidence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Incidence</em>' reference list.
	 * @see org.eclipse.stem.core.graph.GraphPackage#getExchange_ForIncidence()
	 * @model
	 * @generated
	 */
	EList<EAttribute> getForIncidence();

} // Exchange
