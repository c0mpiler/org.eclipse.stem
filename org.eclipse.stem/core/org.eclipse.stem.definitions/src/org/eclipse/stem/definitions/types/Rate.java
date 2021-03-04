// Rate.java
package org.eclipse.stem.definitions.types;

import org.eclipse.emf.ecore.EObject;

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
 * A <code>Rate</code> is a type that specifies a rate of change of one unit of
 * measure with respect to another unit of measure.
 * 
 * @model abstract="true"
 */
public interface Rate extends EObject {
	/**
	 * @model
	 */
	double getRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.definitions.types.Rate#getRate <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' attribute.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(double value);
} // Rate
