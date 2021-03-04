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
package org.eclipse.stem.core.trigger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.predicate.Predicate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.core.trigger.TriggerList#getPredicateList <em>Predicate List</em>}</li>
 *   <li>{@link org.eclipse.stem.core.trigger.TriggerList#getActionList <em>Action List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.core.trigger.TriggerPackage#getTriggerList()
 * @model
 * @generated
 */
public interface TriggerList extends Decorator {
	/**
	 * Returns the value of the '<em><b>Predicate List</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.stem.core.predicate.Predicate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate List</em>' containment reference list.
	 * @see org.eclipse.stem.core.trigger.TriggerPackage#getTriggerList_PredicateList()
	 * @model containment="true"
	 * @generated
	 */
	EList<Predicate> getPredicateList();

	/**
	 * Returns the value of the '<em><b>Action List</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.stem.core.model.Decorator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action List</em>' containment reference list.
	 * @see org.eclipse.stem.core.trigger.TriggerPackage#getTriggerList_ActionList()
	 * @model containment="true"
	 * @generated
	 */
	EList<Decorator> getActionList();

} // TriggerList
