// DynamicLabel.java
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

import org.eclipse.emf.common.util.URI;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.model.Decorator;

/**
 * A <code>DynamicLabel</code> is a {@link Label} that has two
 * {@link LabelValue}s instead of one. The second value is called the "next"
 * value. It represents the values of the attributes of the {@link Label} in the
 * next state of the {@link Graph}. The other value is called the "current"
 * value and it represents the value of the attributes in the current state of
 * the {@link Graph}.
 * <p>
 * A <code>DynamicLabel</code> can exchange the "current" and "next' values
 * (see {@link #switchToNextValue()}. After such a switch, the next value is
 * marked as being "invalid" (see {@link #isNextValueValid()}).
 * </p>
 * 
 * @model abstract="true"
 */
public interface DynamicLabel extends Label {

	/**
	 * This is the top-level segment for all type URI's for dynamic labels.
	 */
	String URI_TYPE_DYNAMIC_LABEL_SEGMENT = URI_TYPE_LABEL_SEGMENT + "/dynamic";

	/**
	 * This is the type URI for a Dynamic Label
	 */
	URI URI_TYPE_DYNAMIC_LABEL = STEMURI
			.createTypeURI(URI_TYPE_DYNAMIC_LABEL_SEGMENT);

	/**
	 * 
	 * @return the {@link Decorator} that updates this <code>DynamicLabel</code>.
	 * @model opposite="labelsToUpdate"
	 */
	Decorator getDecorator();
	
	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.graph.DynamicLabel#getDecorator <em>Decorator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decorator</em>' reference.
	 * @see #getDecorator()
	 * @generated
	 */
	void setDecorator(Decorator value);

	/**
	 * Reset the dynamic label. This sets the {@link LabelValue}s back to their
	 * initial states.
	 * 
	 * @model volatile="true" transient="true" changeable="false"
	 */
	void reset();

	/**
	 * If the next value has been set since the last call to
	 * {@link #setNextValue(LabelValue)} and the <code>DynamicLabel</code> has
	 * not been "reset" then the next value is valid.
	 * 
	 * @return true if the next value is valid
	 * @model default="false"
	 */
	boolean isNextValueValid();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.graph.DynamicLabel#isNextValueValid <em>Next Value Valid</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Value Valid</em>' attribute.
	 * @see #isNextValueValid()
	 * @generated
	 */
	void setNextValueValid(boolean value);

	/**
	 * @return the "next" {@link LabelValue}.
	 * 
	 * @model containment="true" required="true"
	 */
	LabelValue getNextValue();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.graph.DynamicLabel#getNextValue <em>Next Value</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Value</em>' containment reference.
	 * @see #getNextValue()
	 * @generated
	 */
	void setNextValue(LabelValue value);

	/**
	 * Exchange the "next" and "current" {@link LabelValue}s. This is called when the
	 * {@link Graph} is ready to move to the next state (see
	 * {@link Graph#switchToNextValue()).
	 * 
	 * @model volatile="true" transient="true" changeable="false"
	 */
	void switchToNextValue();
} // DynamicLabel
