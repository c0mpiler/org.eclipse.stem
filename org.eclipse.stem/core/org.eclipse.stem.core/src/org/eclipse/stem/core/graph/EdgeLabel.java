// EdgeLabel.java
package org.eclipse.stem.core.graph;

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

/**
 * An <code>EdgeLabel</code> is a {@link Label} that provides attributes to an
 * {@link Edge}.
 * 
 * @model abstract="true"
 */
public interface EdgeLabel extends Label {

	/**
	 * @return the {@link Edge} that this <code>EdgeLabel</code> labels.
	 * 
	 * @model containment="false"
	 */
	Edge getEdge();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.graph.EdgeLabel#getEdge <em>Edge</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge</em>' container reference.
	 * @see #getEdge()
	 * @generated
	 */
	void setEdge(Edge value);

} // EdgeLabel
