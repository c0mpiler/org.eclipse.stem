// UnaryBooleanOperator.java
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

/**
 * An <code>UnaryBooleanOperator</code> is a {@link BooleanOperator} whose value
 * is the result of evaluating a boolean operator that takes only a single
 * operand.
 * 
 * @see NaryBooleanOperator
 * @model abstract="true"
 */
public interface UnaryBooleanOperator extends BooleanOperator {
	/**
	 * @return the operand of the operator
	 * @model containment="true"
	 */
	Predicate getOperand();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.predicate.UnaryBooleanOperator#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(Predicate value);
} // UnaryBooleanOperator