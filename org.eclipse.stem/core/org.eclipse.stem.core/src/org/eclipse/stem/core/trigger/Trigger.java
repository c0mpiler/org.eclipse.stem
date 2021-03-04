// Trigger.java
package org.eclipse.stem.core.trigger;

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
import org.eclipse.emf.common.util.URI;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.predicate.Predicate;

/**
 * A <code>Trigger</code> is a {@link Decorator} that allows for conditional
 * execution of another {@link Decorator}. It combines a reference to a
 * conditional {@link Predicate} with a reference to another {@link Decorator}
 * called the "action" ({@link #getAction()}. When the <code>Trigger</code>'s
 * {@link #updateLabels(org.eclipse.stem.core.model.STEMTime, long)} method
 * is called it invokes the {@link Predicate} and if it returns
 * <code>true</code> then the <code>Trigger</code> calls the
 * {@link #updateLabels(org.eclipse.stem.core.model.STEMTime, long)} method
 * of the referenced {@link Decorator}.
 * <p>
 * Frequently, the action will be an instance of
 * {@link org.eclipse.stem.core.modifier.Modifier} which will then alter
 * some aspect of the running Simulation.
 * <p>
 * This interface definition is also an "Annotated Java Interface" that defines
 * one class in a <a href="http://www.uml.org/">UML</a> "model". The UML class
 * diagram for the model is in the <code>documentation</code> folder of the
 * project. This file and the other interfaces in this Java package are
 * processed by the Eclipse Modeling Framework (aka EMF <a
 * href="http://org.eclipse/emf">http://org.eclipse/emf</a>). to automatically
 * generate an implementation of the model. EMF is documented in the book <a
 * href="http://www.awprofessional.com/bookstore/product.asp?isbn=0131425420&rl=1">Eclipse
 * Modeling Framework </a> by Budinsky, et al.
 * </p>
 * @model
 */
public interface Trigger extends Decorator {
	/**
	 * This is the segment of the type {@link URI} that prefixes all other
	 * segments in a {@link Trigger} {@link URI}.
	 */
	String URI_TYPE_TRIGGER_SEGMENT = "trigger";

	/**
	 * @return the {@link Trigger}'s Predicate
	 * @model containment="false"
	 */
	Predicate getPredicate();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.stem.core.trigger.Trigger#getPredicate
	 * <em>Predicate</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Predicate</em>' reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(Predicate value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.stem.core.model.Decorator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' reference list.
	 * @see org.eclipse.stem.core.trigger.TriggerPackage#getTrigger_Actions()
	 * @model
	 * @generated
	 */
	EList<Decorator> getActions();

} // Trigger