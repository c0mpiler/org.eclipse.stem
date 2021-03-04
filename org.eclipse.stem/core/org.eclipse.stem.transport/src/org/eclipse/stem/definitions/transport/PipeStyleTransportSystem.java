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

import org.eclipse.emf.common.util.EList;

/**
 * A pipe style transport system is much like a geographical region. Disease
 * processes work within the system based on its on population density, etc. It
 * is connected to the geographical areas it links by a series of both in
 * migration and out migration edges. The sum of the rates of out migration on
 * the out migration edges should some to the average time that an individual
 * spends within the transport system.
 * 
 * @author jlessler
 * 
 * @model
 * 
 */
public interface PipeStyleTransportSystem extends TransportSystem {

	/**
	 * Returns the value of the '<em><b>In Transport Edges</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.stem.definitions.transport.PipeTransportEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Transport Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Transport Edges</em>' reference list.
	 * @see org.eclipse.stem.definitions.transport.TransportPackage#getPipeStyleTransportSystem_InTransportEdges()
	 * @model
	 * @generated
	 */
	EList<PipeTransportEdge> getInTransportEdges();

	/**
	 * Returns the value of the '<em><b>Out Transport Edges</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.stem.definitions.transport.PipeTransportEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Transport Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Transport Edges</em>' reference list.
	 * @see org.eclipse.stem.definitions.transport.TransportPackage#getPipeStyleTransportSystem_OutTransportEdges()
	 * @model
	 * @generated
	 */
	EList<PipeTransportEdge> getOutTransportEdges();

	/**
	 * Returns the value of the '<em><b>Max Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Capacity</em>' attribute.
	 * @see #setMaxCapacity(double)
	 * @see org.eclipse.stem.definitions.transport.TransportPackage#getPipeStyleTransportSystem_MaxCapacity()
	 * @model
	 * @generated
	 */
	double getMaxCapacity();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.definitions.transport.PipeStyleTransportSystem#getMaxCapacity <em>Max Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Capacity</em>' attribute.
	 * @see #getMaxCapacity()
	 * @generated
	 */
	void setMaxCapacity(double value);

	/**
	 * 
	 */
	String URI_TYPE_PIPE_STYLE_TRANSPORT_SYSTEM = URI_TYPE_TRANSPORT_SYSTEM_NODE_SEGMENT
			+ "/pipe";

}
