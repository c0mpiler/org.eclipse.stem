// TransportRelationshipLabelValue.java
package org.eclipse.stem.definitions.labels;

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
 * The value of a transportation relationship label is the current available
 * capacity expressed as a proportion of the maximum capacity of the
 * transportation mode/identifier. Typically, this value will be 1.0 (100%), but
 * it could be reduced by travel restrictions.
 * 
 * @see TransportRelationshipLabel#getMaximumCapacity()
 * 
 * @model
 */
public interface TransportRelationshipLabelValue extends LabelValue {

	/**
	 * @return the proportion (i.e., 0.0-1.0) of the departure transportation
	 *         capacity that is available.
	 * @see TransportRelationshipLabel#getDepartureCapacity()
	 * @model default="1.0"
	 */
	double getAvailableDepartureCapacityProportion();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.definitions.labels.TransportRelationshipLabelValue#getAvailableDepartureCapacityProportion <em>Available Departure Capacity Proportion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Departure Capacity Proportion</em>' attribute.
	 * @see #getAvailableDepartureCapacityProportion()
	 * @generated
	 */
	void setAvailableDepartureCapacityProportion(double value);

} // TransportRelationshipLabelValue
