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
import org.eclipse.stem.model.metamodel.Compartment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartment Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.ui.editor.vismodel.CompartmentElement#getCompartment <em>Compartment</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ui.editor.vismodel.CompartmentElement#getModelElement <em>Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.model.ui.editor.vismodel.VisualMetamodelPackage#getCompartmentElement()
 * @model
 * @generated
 */
public interface CompartmentElement extends RectangleElement {
	/**
	 * Returns the value of the '<em><b>Compartment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartment</em>' reference.
	 * @see #setCompartment(Compartment)
	 * @see org.eclipse.stem.model.ui.editor.vismodel.VisualMetamodelPackage#getCompartmentElement_Compartment()
	 * @model
	 * @generated
	 */
	Compartment getCompartment();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.ui.editor.vismodel.CompartmentElement#getCompartment <em>Compartment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compartment</em>' reference.
	 * @see #getCompartment()
	 * @generated
	 */
	void setCompartment(Compartment value);

	/**
	 * Returns the value of the '<em><b>Model Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.stem.model.ui.editor.vismodel.ModelElement#getCompartmentElements <em>Compartment Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element</em>' container reference.
	 * @see #setModelElement(ModelElement)
	 * @see org.eclipse.stem.model.ui.editor.vismodel.VisualMetamodelPackage#getCompartmentElement_ModelElement()
	 * @see org.eclipse.stem.model.ui.editor.vismodel.ModelElement#getCompartmentElements
	 * @model opposite="compartmentElements"
	 * @generated
	 */
	ModelElement getModelElement();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.ui.editor.vismodel.CompartmentElement#getModelElement <em>Model Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Element</em>' container reference.
	 * @see #getModelElement()
	 * @generated
	 */
	void setModelElement(ModelElement value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TransitionElement> getSourceTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TransitionElement> getTargetTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isInherited();

} // CompartmentElement
