// RangeModifier.java
package org.eclipse.stem.core.modifier;

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

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * A <code>RangeModifier</code> modifies the value of a numeric
 * {@link EStructuralFeature} over a specific range of values. A
 * <code>RangeModifier</code> specifies a starting value, an ending value and an
 * increment. The increment is successively applied to the starting value until
 * the result exceeds the end value. If the increment is negative, the end value
 * must be less than the starting value.
 * 
 * @model abstract="true"
 */
public interface RangeModifier extends FeatureModifier {
	// Nothing
} // RangeModifier
