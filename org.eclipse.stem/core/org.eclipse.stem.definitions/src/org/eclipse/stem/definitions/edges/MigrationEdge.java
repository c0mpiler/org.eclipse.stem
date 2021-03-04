package org.eclipse.stem.definitions.edges;

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
 * An edge representing migration between 
 * two areas. These edges have the following restrictions:
 * -getLabel() must return a migration edge label
 * -isDirected() must return true
 * 
 * @author jlessler
 *
 * @model
 */
public interface MigrationEdge extends PopulationEdge {

	/**
	 * Returns the value of the '<em><b>Use Absolute Values</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Absolute Values</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Absolute Values</em>' attribute.
	 * @see #setUseAbsoluteValues(boolean)
	 * @see org.eclipse.stem.definitions.edges.EdgesPackage#getMigrationEdge_UseAbsoluteValues()
	 * @model default="0"
	 * @generated
	 */
	boolean isUseAbsoluteValues();
	/**
	 * Sets the value of the '{@link org.eclipse.stem.definitions.edges.MigrationEdge#isUseAbsoluteValues <em>Use Absolute Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Absolute Values</em>' attribute.
	 * @see #isUseAbsoluteValues()
	 * @generated
	 */
	void setUseAbsoluteValues(boolean value);
	/**
	 * This is the segment of the type URI that prefixes all other segments in a
	 * migration edge URI.
	 */
	public String URI_TYPE_MIGRATION_EDGE_SEGMENT = URI_TYPE_EDGE_SEGMENT + "/migration";
	
	
	
	/**
	 * Overrides getLabel() to enforce the returning of a migration edge label
	 **/
	@Override
	MigrationEdgeLabel getLabel();
	
	/**
	 * Overrides setLabel() to enforce setting of a migration edge label
	 * @param lbl
	 */
	void setLabel(MigrationEdgeLabel lbl);
				
}
