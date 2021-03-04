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

import org.eclipse.stem.model.metamodel.Model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.ui.editor.vismodel.ModelElement#getModel <em>Model</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ui.editor.vismodel.ModelElement#getCompartmentElements <em>Compartment Elements</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ui.editor.vismodel.ModelElement#getTransitionElements <em>Transition Elements</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ui.editor.vismodel.ModelElement#getCanvas <em>Canvas</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.model.ui.editor.vismodel.VisualMetamodelPackage#getModelElement()
 * @model
 * @generated
 */
public interface ModelElement extends VisualElement {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(Model)
	 * @see org.eclipse.stem.model.ui.editor.vismodel.VisualMetamodelPackage#getModelElement_Model()
	 * @model
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.ui.editor.vismodel.ModelElement#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

	/**
	 * Returns the value of the '<em><b>Compartment Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.stem.model.ui.editor.vismodel.CompartmentElement}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.stem.model.ui.editor.vismodel.CompartmentElement#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartment Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartment Elements</em>' containment reference list.
	 * @see org.eclipse.stem.model.ui.editor.vismodel.VisualMetamodelPackage#getModelElement_CompartmentElements()
	 * @see org.eclipse.stem.model.ui.editor.vismodel.CompartmentElement#getModelElement
	 * @model opposite="modelElement" containment="true"
	 * @generated
	 */
	EList<CompartmentElement> getCompartmentElements();

	/**
	 * Returns the value of the '<em><b>Transition Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.stem.model.ui.editor.vismodel.TransitionElement}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.stem.model.ui.editor.vismodel.TransitionElement#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Elements</em>' containment reference list.
	 * @see org.eclipse.stem.model.ui.editor.vismodel.VisualMetamodelPackage#getModelElement_TransitionElements()
	 * @see org.eclipse.stem.model.ui.editor.vismodel.TransitionElement#getModelElement
	 * @model opposite="modelElement" containment="true"
	 * @generated
	 */
	EList<TransitionElement> getTransitionElements();

	/**
	 * Returns the value of the '<em><b>Canvas</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.stem.model.ui.editor.vismodel.CanvasPackage#getModelElements <em>Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Canvas</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Canvas</em>' container reference.
	 * @see #setCanvas(CanvasPackage)
	 * @see org.eclipse.stem.model.ui.editor.vismodel.VisualMetamodelPackage#getModelElement_Canvas()
	 * @see org.eclipse.stem.model.ui.editor.vismodel.CanvasPackage#getModelElements
	 * @model opposite="modelElements"
	 * @generated
	 */
	CanvasPackage getCanvas();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.ui.editor.vismodel.ModelElement#getCanvas <em>Canvas</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Canvas</em>' container reference.
	 * @see #getCanvas()
	 * @generated
	 */
	void setCanvas(CanvasPackage value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addCompartment(CompartmentElement compartment);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeCompartment(CompartmentElement compartment);

} // ModelElement
