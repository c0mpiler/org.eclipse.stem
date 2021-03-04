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
package org.eclipse.stem.model.ui.editor.vismodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Canvas Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.ui.editor.vismodel.CanvasPackage#getModelElements <em>Model Elements</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ui.editor.vismodel.CanvasPackage#getMetamodel <em>Metamodel</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.model.ui.editor.vismodel.VisualMetamodelPackage#getCanvasPackage()
 * @model
 * @generated
 */
public interface CanvasPackage extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.stem.model.ui.editor.vismodel.ModelElement}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.stem.model.ui.editor.vismodel.ModelElement#getCanvas <em>Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Elements</em>' containment reference list.
	 * @see org.eclipse.stem.model.ui.editor.vismodel.VisualMetamodelPackage#getCanvasPackage_ModelElements()
	 * @see org.eclipse.stem.model.ui.editor.vismodel.ModelElement#getCanvas
	 * @model opposite="canvas" containment="true"
	 * @generated
	 */
	EList<ModelElement> getModelElements();

	/**
	 * Returns the value of the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel</em>' reference.
	 * @see #setMetamodel(org.eclipse.stem.model.metamodel.Package)
	 * @see org.eclipse.stem.model.ui.editor.vismodel.VisualMetamodelPackage#getCanvasPackage_Metamodel()
	 * @model
	 * @generated
	 */
	org.eclipse.stem.model.metamodel.Package getMetamodel();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.ui.editor.vismodel.CanvasPackage#getMetamodel <em>Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel</em>' reference.
	 * @see #getMetamodel()
	 * @generated
	 */
	void setMetamodel(org.eclipse.stem.model.metamodel.Package value);

} // CanvasPackage
