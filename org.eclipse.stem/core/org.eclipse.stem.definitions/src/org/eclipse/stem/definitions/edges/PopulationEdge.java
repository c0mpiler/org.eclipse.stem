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

import org.eclipse.stem.core.graph.Edge;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Population Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.definitions.edges.PopulationEdge#getPopulationIdentifier <em>Population Identifier</em>}</li>
 * </ul>
 *
 * @see org.eclipse.stem.definitions.edges.EdgesPackage#getPopulationEdge()
 * @model
 * @generated
 */
public interface PopulationEdge extends Edge {
	/**
	 * Returns the value of the '<em><b>Population Identifier</b></em>' attribute.
	 * The default value is <code>"human"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Population Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population Identifier</em>' attribute.
	 * @see #setPopulationIdentifier(String)
	 * @see org.eclipse.stem.definitions.edges.EdgesPackage#getPopulationEdge_PopulationIdentifier()
	 * @model default="human"
	 * @generated
	 */
	String getPopulationIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.definitions.edges.PopulationEdge#getPopulationIdentifier <em>Population Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population Identifier</em>' attribute.
	 * @see #getPopulationIdentifier()
	 * @generated
	 */
	void setPopulationIdentifier(String value);

} // PopulationEdge