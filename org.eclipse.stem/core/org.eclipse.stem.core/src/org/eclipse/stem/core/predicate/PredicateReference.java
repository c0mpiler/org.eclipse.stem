// PredicateReference.java
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
 * An <code>PredicateReference</code> is a {@link Predicate} whose value is the
 * result of evaluating a referenced (i.e., non-containment) {@link Predicate}.
 * 
 * @see Test
 * @see BooleanExpression
 * @model
 */
public interface PredicateReference extends Predicate {
	/**
	 * @model containment="false"
	 */
	Predicate getPredicate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.predicate.PredicateReference#getPredicate <em>Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(Predicate value);
} // PredicateReference