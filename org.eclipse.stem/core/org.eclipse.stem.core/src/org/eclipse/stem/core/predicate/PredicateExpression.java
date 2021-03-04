// PredicateExpression.java
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
 * A <code>PredicateExpression</code> is a {@link BooleanExpression} whose value
 * is the result of evaluating a {@link Predicate}.
 * 
 * @model
 */
public interface PredicateExpression extends BooleanExpression {

	/**
	 * @return the {@link Predicate} that determines the value of this
	 *         expression.
	 * @model containment="true"
	 */
	Predicate getPredicate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.predicate.PredicateExpression#getPredicate <em>Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' containment reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(Predicate value);
} // PredicateExpression