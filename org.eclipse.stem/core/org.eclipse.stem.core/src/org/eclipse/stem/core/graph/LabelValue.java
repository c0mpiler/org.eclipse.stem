// LabelValue.java
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

import org.eclipse.stem.core.common.SanityChecker;

/**
 * A <code>LabelValue</code> stores the attributes of a {@link Label}.
 * 
 * @see Label
 * @see DynamicLabel
 * @see DynamicNodeLabel
 * 
 * @model abstract="true"
 */
public interface LabelValue extends SanityChecker {

	/**
	 * @model volatile="true" transient="true" changeable="false"
	 */
	void reset();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean sameValue(LabelValue otherLabelValue);

} // LabelValue
