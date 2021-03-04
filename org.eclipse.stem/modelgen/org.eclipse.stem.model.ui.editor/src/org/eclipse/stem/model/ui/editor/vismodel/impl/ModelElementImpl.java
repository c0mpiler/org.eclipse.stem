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
package org.eclipse.stem.model.ui.editor.vismodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.stem.model.metamodel.Model;

import org.eclipse.stem.model.ui.editor.vismodel.CanvasPackage;
import org.eclipse.stem.model.ui.editor.vismodel.CompartmentElement;
import org.eclipse.stem.model.ui.editor.vismodel.ModelElement;
import org.eclipse.stem.model.ui.editor.vismodel.TransitionElement;
import org.eclipse.stem.model.ui.editor.vismodel.VisualMetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.ui.editor.vismodel.impl.ModelElementImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ui.editor.vismodel.impl.ModelElementImpl#getCompartmentElements <em>Compartment Elements</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ui.editor.vismodel.impl.ModelElementImpl#getTransitionElements <em>Transition Elements</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ui.editor.vismodel.impl.ModelElementImpl#getCanvas <em>Canvas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelElementImpl extends VisualElementImpl implements ModelElement {
	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected Model model;

	/**
	 * The cached value of the '{@link #getCompartmentElements() <em>Compartment Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartmentElements()
	 * @generated
	 * @ordered
	 */
	protected EList<CompartmentElement> compartmentElements;

	/**
	 * The cached value of the '{@link #getTransitionElements() <em>Transition Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionElements()
	 * @generated
	 * @ordered
	 */
	protected EList<TransitionElement> transitionElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualMetamodelPackage.Literals.MODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (Model)eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisualMetamodelPackage.MODEL_ELEMENT__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Model newModel) {
		Model oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualMetamodelPackage.MODEL_ELEMENT__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompartmentElement> getCompartmentElements() {
		if (compartmentElements == null) {
			compartmentElements = new EObjectContainmentWithInverseEList<CompartmentElement>(CompartmentElement.class, this, VisualMetamodelPackage.MODEL_ELEMENT__COMPARTMENT_ELEMENTS, VisualMetamodelPackage.COMPARTMENT_ELEMENT__MODEL_ELEMENT);
		}
		return compartmentElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransitionElement> getTransitionElements() {
		if (transitionElements == null) {
			transitionElements = new EObjectContainmentWithInverseEList<TransitionElement>(TransitionElement.class, this, VisualMetamodelPackage.MODEL_ELEMENT__TRANSITION_ELEMENTS, VisualMetamodelPackage.TRANSITION_ELEMENT__MODEL_ELEMENT);
		}
		return transitionElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanvasPackage getCanvas() {
		if (eContainerFeatureID() != VisualMetamodelPackage.MODEL_ELEMENT__CANVAS) return null;
		return (CanvasPackage)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCanvas(CanvasPackage newCanvas, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCanvas, VisualMetamodelPackage.MODEL_ELEMENT__CANVAS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanvas(CanvasPackage newCanvas) {
		if (newCanvas != eInternalContainer() || (eContainerFeatureID() != VisualMetamodelPackage.MODEL_ELEMENT__CANVAS && newCanvas != null)) {
			if (EcoreUtil.isAncestor(this, newCanvas))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCanvas != null)
				msgs = ((InternalEObject)newCanvas).eInverseAdd(this, VisualMetamodelPackage.CANVAS_PACKAGE__MODEL_ELEMENTS, CanvasPackage.class, msgs);
			msgs = basicSetCanvas(newCanvas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualMetamodelPackage.MODEL_ELEMENT__CANVAS, newCanvas, newCanvas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addCompartment(CompartmentElement compartment) {
		getModel().getCompartments().getCompartments().add(compartment.getCompartment());
		getCompartmentElements().add(compartment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeCompartment(CompartmentElement compartment) {
		
		if (!getModel().getCompartments().getCompartments().remove(compartment.getCompartment())) {
			throw new IllegalArgumentException("Cannot remove derived compartment "+ compartment.getCompartment().getName() +" from this model");
		}
		
		getCompartmentElements().remove(compartment);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VisualMetamodelPackage.MODEL_ELEMENT__COMPARTMENT_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCompartmentElements()).basicAdd(otherEnd, msgs);
			case VisualMetamodelPackage.MODEL_ELEMENT__TRANSITION_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransitionElements()).basicAdd(otherEnd, msgs);
			case VisualMetamodelPackage.MODEL_ELEMENT__CANVAS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCanvas((CanvasPackage)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VisualMetamodelPackage.MODEL_ELEMENT__COMPARTMENT_ELEMENTS:
				return ((InternalEList<?>)getCompartmentElements()).basicRemove(otherEnd, msgs);
			case VisualMetamodelPackage.MODEL_ELEMENT__TRANSITION_ELEMENTS:
				return ((InternalEList<?>)getTransitionElements()).basicRemove(otherEnd, msgs);
			case VisualMetamodelPackage.MODEL_ELEMENT__CANVAS:
				return basicSetCanvas(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case VisualMetamodelPackage.MODEL_ELEMENT__CANVAS:
				return eInternalContainer().eInverseRemove(this, VisualMetamodelPackage.CANVAS_PACKAGE__MODEL_ELEMENTS, CanvasPackage.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisualMetamodelPackage.MODEL_ELEMENT__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case VisualMetamodelPackage.MODEL_ELEMENT__COMPARTMENT_ELEMENTS:
				return getCompartmentElements();
			case VisualMetamodelPackage.MODEL_ELEMENT__TRANSITION_ELEMENTS:
				return getTransitionElements();
			case VisualMetamodelPackage.MODEL_ELEMENT__CANVAS:
				return getCanvas();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VisualMetamodelPackage.MODEL_ELEMENT__MODEL:
				setModel((Model)newValue);
				return;
			case VisualMetamodelPackage.MODEL_ELEMENT__COMPARTMENT_ELEMENTS:
				getCompartmentElements().clear();
				getCompartmentElements().addAll((Collection<? extends CompartmentElement>)newValue);
				return;
			case VisualMetamodelPackage.MODEL_ELEMENT__TRANSITION_ELEMENTS:
				getTransitionElements().clear();
				getTransitionElements().addAll((Collection<? extends TransitionElement>)newValue);
				return;
			case VisualMetamodelPackage.MODEL_ELEMENT__CANVAS:
				setCanvas((CanvasPackage)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VisualMetamodelPackage.MODEL_ELEMENT__MODEL:
				setModel((Model)null);
				return;
			case VisualMetamodelPackage.MODEL_ELEMENT__COMPARTMENT_ELEMENTS:
				getCompartmentElements().clear();
				return;
			case VisualMetamodelPackage.MODEL_ELEMENT__TRANSITION_ELEMENTS:
				getTransitionElements().clear();
				return;
			case VisualMetamodelPackage.MODEL_ELEMENT__CANVAS:
				setCanvas((CanvasPackage)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VisualMetamodelPackage.MODEL_ELEMENT__MODEL:
				return model != null;
			case VisualMetamodelPackage.MODEL_ELEMENT__COMPARTMENT_ELEMENTS:
				return compartmentElements != null && !compartmentElements.isEmpty();
			case VisualMetamodelPackage.MODEL_ELEMENT__TRANSITION_ELEMENTS:
				return transitionElements != null && !transitionElements.isEmpty();
			case VisualMetamodelPackage.MODEL_ELEMENT__CANVAS:
				return getCanvas() != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelElementImpl
