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

import org.eclipse.stem.model.metamodel.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.ui.editor.vismodel.TransitionElement#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ui.editor.vismodel.TransitionElement#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ui.editor.vismodel.TransitionElement#getTransition <em>Transition</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ui.editor.vismodel.TransitionElement#getModelElement <em>Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.model.ui.editor.vismodel.VisualMetamodelPackage#getTransitionElement()
 * @model
 * @generated
 */
public interface TransitionElement extends ConnectorElement {
	
	
	void updateConnections(CompartmentElement source, CompartmentElement target);
	
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(CompartmentElement)
	 * @see org.eclipse.stem.model.ui.editor.vismodel.VisualMetamodelPackage#getTransitionElement_Source()
	 * @model
	 * @generated
	 */
	CompartmentElement getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.ui.editor.vismodel.TransitionElement#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(CompartmentElement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(CompartmentElement)
	 * @see org.eclipse.stem.model.ui.editor.vismodel.VisualMetamodelPackage#getTransitionElement_Target()
	 * @model
	 * @generated
	 */
	CompartmentElement getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.ui.editor.vismodel.TransitionElement#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(CompartmentElement value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' reference.
	 * @see #setTransition(Transition)
	 * @see org.eclipse.stem.model.ui.editor.vismodel.VisualMetamodelPackage#getTransitionElement_Transition()
	 * @model
	 * @generated
	 */
	Transition getTransition();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.ui.editor.vismodel.TransitionElement#getTransition <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transition value);

	/**
	 * Returns the value of the '<em><b>Model Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.stem.model.ui.editor.vismodel.ModelElement#getTransitionElements <em>Transition Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element</em>' container reference.
	 * @see #setModelElement(ModelElement)
	 * @see org.eclipse.stem.model.ui.editor.vismodel.VisualMetamodelPackage#getTransitionElement_ModelElement()
	 * @see org.eclipse.stem.model.ui.editor.vismodel.ModelElement#getTransitionElements
	 * @model opposite="transitionElements"
	 * @generated
	 */
	ModelElement getModelElement();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.model.ui.editor.vismodel.TransitionElement#getModelElement <em>Model Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Element</em>' container reference.
	 * @see #getModelElement()
	 * @generated
	 */
	void setModelElement(ModelElement value);

} // TransitionElement
