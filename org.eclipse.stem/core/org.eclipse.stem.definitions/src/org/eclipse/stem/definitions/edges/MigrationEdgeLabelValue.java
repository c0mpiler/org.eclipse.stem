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

import org.eclipse.stem.core.graph.LabelValue;

/**
 * Represents the rate of migration between two nodes. This is a 
 * number between 0 and infinity
 * 
 * @author jlessler
 *
 *@model
 */
public interface MigrationEdgeLabelValue extends LabelValue {
	
	/**Returns the migration rate
	 * @return a number between 0 and infinity
	 * 
	 * @model default="0.0"*/
	double getMigrationRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.definitions.edges.MigrationEdgeLabelValue#getMigrationRate <em>Migration Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Migration Rate</em>' attribute.
	 * @see #getMigrationRate()
	 * @generated
	 */
	void setMigrationRate(double value);

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
	 * @see org.eclipse.stem.definitions.edges.EdgesPackage#getMigrationEdgeLabelValue_TimePeriod()
	 * @model default="86400000"
	 * @generated
	 */
	long getTimePeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.definitions.edges.MigrationEdgeLabelValue#getTimePeriod <em>Time Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Period</em>' attribute.
	 * @see #getTimePeriod()
	 * @generated
	 */
	void setTimePeriod(long value);

}
