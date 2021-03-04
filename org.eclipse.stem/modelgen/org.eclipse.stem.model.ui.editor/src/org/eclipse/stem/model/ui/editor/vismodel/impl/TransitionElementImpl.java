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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.stem.model.metamodel.Transition;

import org.eclipse.stem.model.ui.editor.vismodel.CompartmentElement;
import org.eclipse.stem.model.ui.editor.vismodel.ModelElement;
import org.eclipse.stem.model.ui.editor.vismodel.TransitionElement;
import org.eclipse.stem.model.ui.editor.vismodel.VisualMetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.ui.editor.vismodel.impl.TransitionElementImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ui.editor.vismodel.impl.TransitionElementImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ui.editor.vismodel.impl.TransitionElementImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ui.editor.vismodel.impl.TransitionElementImpl#getModelElement <em>Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionElementImpl extends ConnectorElementImpl implements TransitionElement {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected CompartmentElement source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected CompartmentElement target;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected Transition transition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualMetamodelPackage.Literals.TRANSITION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentElement getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (CompartmentElement)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisualMetamodelPackage.TRANSITION_ELEMENT__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentElement basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setSource(CompartmentElement newSource) {
		CompartmentElement oldSource = source;
		source = newSource;
		//getTransition().setSource(source.getCompartment());
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualMetamodelPackage.TRANSITION_ELEMENT__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentElement getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (CompartmentElement)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisualMetamodelPackage.TRANSITION_ELEMENT__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentElement basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(CompartmentElement newTarget) {
		CompartmentElement oldTarget = target;
		target = newTarget;
		//getTransition().setTarget(target.getCompartment());
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualMetamodelPackage.TRANSITION_ELEMENT__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getTransition() {
		if (transition != null && transition.eIsProxy()) {
			InternalEObject oldTransition = (InternalEObject)transition;
			transition = (Transition)eResolveProxy(oldTransition);
			if (transition != oldTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisualMetamodelPackage.TRANSITION_ELEMENT__TRANSITION, oldTransition, transition));
			}
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetTransition() {
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransition(Transition newTransition) {
		Transition oldTransition = transition;
		transition = newTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualMetamodelPackage.TRANSITION_ELEMENT__TRANSITION, oldTransition, transition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement getModelElement() {
		if (eContainerFeatureID() != VisualMetamodelPackage.TRANSITION_ELEMENT__MODEL_ELEMENT) return null;
		return (ModelElement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelElement(ModelElement newModelElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModelElement, VisualMetamodelPackage.TRANSITION_ELEMENT__MODEL_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelElement(ModelElement newModelElement) {
		if (newModelElement != eInternalContainer() || (eContainerFeatureID() != VisualMetamodelPackage.TRANSITION_ELEMENT__MODEL_ELEMENT && newModelElement != null)) {
			if (EcoreUtil.isAncestor(this, newModelElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModelElement != null)
				msgs = ((InternalEObject)newModelElement).eInverseAdd(this, VisualMetamodelPackage.MODEL_ELEMENT__TRANSITION_ELEMENTS, ModelElement.class, msgs);
			msgs = basicSetModelElement(newModelElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualMetamodelPackage.TRANSITION_ELEMENT__MODEL_ELEMENT, newModelElement, newModelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VisualMetamodelPackage.TRANSITION_ELEMENT__MODEL_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModelElement((ModelElement)otherEnd, msgs);
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
			case VisualMetamodelPackage.TRANSITION_ELEMENT__MODEL_ELEMENT:
				return basicSetModelElement(null, msgs);
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
			case VisualMetamodelPackage.TRANSITION_ELEMENT__MODEL_ELEMENT:
				return eInternalContainer().eInverseRemove(this, VisualMetamodelPackage.MODEL_ELEMENT__TRANSITION_ELEMENTS, ModelElement.class, msgs);
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
			case VisualMetamodelPackage.TRANSITION_ELEMENT__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case VisualMetamodelPackage.TRANSITION_ELEMENT__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case VisualMetamodelPackage.TRANSITION_ELEMENT__TRANSITION:
				if (resolve) return getTransition();
				return basicGetTransition();
			case VisualMetamodelPackage.TRANSITION_ELEMENT__MODEL_ELEMENT:
				return getModelElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VisualMetamodelPackage.TRANSITION_ELEMENT__SOURCE:
				setSource((CompartmentElement)newValue);
				return;
			case VisualMetamodelPackage.TRANSITION_ELEMENT__TARGET:
				setTarget((CompartmentElement)newValue);
				return;
			case VisualMetamodelPackage.TRANSITION_ELEMENT__TRANSITION:
				setTransition((Transition)newValue);
				return;
			case VisualMetamodelPackage.TRANSITION_ELEMENT__MODEL_ELEMENT:
				setModelElement((ModelElement)newValue);
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
			case VisualMetamodelPackage.TRANSITION_ELEMENT__SOURCE:
				setSource((CompartmentElement)null);
				return;
			case VisualMetamodelPackage.TRANSITION_ELEMENT__TARGET:
				setTarget((CompartmentElement)null);
				return;
			case VisualMetamodelPackage.TRANSITION_ELEMENT__TRANSITION:
				setTransition((Transition)null);
				return;
			case VisualMetamodelPackage.TRANSITION_ELEMENT__MODEL_ELEMENT:
				setModelElement((ModelElement)null);
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
			case VisualMetamodelPackage.TRANSITION_ELEMENT__SOURCE:
				return source != null;
			case VisualMetamodelPackage.TRANSITION_ELEMENT__TARGET:
				return target != null;
			case VisualMetamodelPackage.TRANSITION_ELEMENT__TRANSITION:
				return transition != null;
			case VisualMetamodelPackage.TRANSITION_ELEMENT__MODEL_ELEMENT:
				return getModelElement() != null;
		}
		return super.eIsSet(featureID);
	}
	
	public void updateConnections(CompartmentElement source, CompartmentElement target) {
		if (source == null || target == null) {
			return;
		}
		
		if (source != getSource()) {
			setSource(source);
			getTransition().setSource(source.getCompartment());
		}
		
		if (target != getTarget()) {
			setTarget(target);
			getTransition().setTarget(target.getCompartment());
		}
	}

} //TransitionElementImpl
