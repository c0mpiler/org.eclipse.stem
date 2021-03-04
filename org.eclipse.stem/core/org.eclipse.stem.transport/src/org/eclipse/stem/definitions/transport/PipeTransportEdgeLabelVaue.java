package org.eclipse.stem.definitions.transport;

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

import org.eclipse.stem.core.graph.LabelValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pipe Transport Edge Label Vaue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.definitions.transport.PipeTransportEdgeLabelVaue#getMaxFlow <em>Max Flow</em>}</li>
 * </ul>
 * </p>
 *
 * @model
 * @generated
 */
public interface PipeTransportEdgeLabelVaue extends LabelValue {
	/**
	 * Returns the value of the '<em><b>Max Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Flow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Flow</em>' attribute.
	 * @see #setMaxFlow(double)
	 * @model
	 * @generated
	 */
	double getMaxFlow();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.definitions.transport.PipeTransportEdgeLabelVaue#getMaxFlow <em>Max Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Flow</em>' attribute.
	 * @see #getMaxFlow()
	 * @generated
	 */
	void setMaxFlow(double value);

} // PipeTransportEdgeLabelVaue
