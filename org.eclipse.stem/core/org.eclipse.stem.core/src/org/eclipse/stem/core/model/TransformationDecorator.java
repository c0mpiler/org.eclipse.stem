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
package org.eclipse.stem.core.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.stem.core.graph.DynamicLabel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation Decorator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.core.model.TransformationDecorator#getSourceLabels <em>Source Labels</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.core.model.ModelPackage#getTransformationDecorator()
 * @model abstract="true"
 * @generated
 */
public interface TransformationDecorator extends NodeDecorator {

	/**
	 * Returns the value of the '<em><b>Source Labels</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.stem.core.graph.DynamicLabel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Labels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Labels</em>' reference list.
	 * @see org.eclipse.stem.core.model.ModelPackage#getTransformationDecorator_SourceLabels()
	 * @model
	 * @generated
	 */
	EList<DynamicLabel> getSourceLabels();

} // TransformationDecorator
