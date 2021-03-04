package org.eclipse.stem.core.common;

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
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Double Value Matrix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.core.common.DoubleValueMatrix#getValueLists <em>Value Lists</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.core.common.CommonPackage#getDoubleValueMatrix()
 * @model
 * @generated
 */
public interface DoubleValueMatrix extends EObject {
	/**
	 * Returns the value of the '<em><b>Value Lists</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.stem.core.common.DoubleValueList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Lists</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Lists</em>' containment reference list.
	 * @see org.eclipse.stem.core.common.CommonPackage#getDoubleValueMatrix_ValueLists()
	 * @model containment="true"
	 * @generated
	 */
	EList<DoubleValueList> getValueLists();

} // DoubleValueMatrix
