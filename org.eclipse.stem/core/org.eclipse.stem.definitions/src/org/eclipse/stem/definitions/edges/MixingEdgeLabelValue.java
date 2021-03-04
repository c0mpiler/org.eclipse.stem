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
package org.eclipse.stem.definitions.edges;

import org.eclipse.stem.core.graph.LabelValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mixing Edge Label Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.definitions.edges.MixingEdgeLabelValue#getMixingRate <em>Mixing Rate</em>}</li>
 * </ul>
 *
 * @see org.eclipse.stem.definitions.edges.EdgesPackage#getMixingEdgeLabelValue()
 * @model
 * @generated
 */
public interface MixingEdgeLabelValue extends LabelValue {
	/**
	 * Returns the value of the '<em><b>Mixing Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixing Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixing Rate</em>' attribute.
	 * @see #setMixingRate(double)
	 * @see org.eclipse.stem.definitions.edges.EdgesPackage#getMixingEdgeLabelValue_MixingRate()
	 * @model
	 * @generated
	 */
	double getMixingRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.definitions.edges.MixingEdgeLabelValue#getMixingRate <em>Mixing Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mixing Rate</em>' attribute.
	 * @see #getMixingRate()
	 * @generated
	 */
	void setMixingRate(double value);

} // MixingEdgeLabelValue
