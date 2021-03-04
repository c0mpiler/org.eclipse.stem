// NaryBooleanOperator.java
package org.eclipse.stem.core.predicate;

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
 * A <code>NaryBooleanOperator</code> is a {@link BooleanOperator} whose value
 * is the result of evaluating a boolean operator that takes one or (usually)
 * more operands.
 * 
 * @see UnaryBooleanOperator
 * @model abstract="true"
 */
public interface NaryBooleanOperator extends BooleanOperator {
	/**
	 * @return the collection of operands to this operator
	 * @model type="Predicate" containment="true"
	 */
	EList<Predicate> getOperands();
} // NaryBooleanOperator