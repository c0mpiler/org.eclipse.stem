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
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.stem.model.metamodel.Compartment;
import org.eclipse.stem.model.metamodel.Model;
import org.eclipse.stem.model.ui.editor.vismodel.CompartmentElement;
import org.eclipse.stem.model.ui.editor.vismodel.ModelElement;
import org.eclipse.stem.model.ui.editor.vismodel.TransitionElement;
import org.eclipse.stem.model.ui.editor.vismodel.VisualMetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compartment Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.ui.editor.vismodel.impl.CompartmentElementImpl#getCompartment <em>Compartment</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ui.editor.vismodel.impl.CompartmentElementImpl#getModelElement <em>Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompartmentElementImpl extends RectangleElementImpl implements CompartmentElement {
	/**
	 * The cached value of the '{@link #getCompartment() <em>Compartment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartment()
	 * @generated
	 * @ordered
	 */
	protected Compartment compartment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompartmentElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualMetamodelPackage.Literals.COMPARTMENT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compartment getCompartment() {
		if (compartment != null && compartment.eIsProxy()) {
			InternalEObject oldCompartment = (InternalEObject)compartment;
			compartment = (Compartment)eResolveProxy(oldCompartment);
			if (compartment != oldCompartment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisualMetamodelPackage.COMPARTMENT_ELEMENT__COMPARTMENT, oldCompartment, compartment));
			}
		}
		return compartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compartment basicGetCompartment() {
		return compartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompartment(Compartment newCompartment) {
		Compartment oldCompartment = compartment;
		compartment = newCompartment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualMetamodelPackage.COMPARTMENT_ELEMENT__COMPARTMENT, oldCompartment, compartment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement getModelElement() {
		if (eContainerFeatureID() != VisualMetamodelPackage.COMPARTMENT_ELEMENT__MODEL_ELEMENT) return null;
		return (ModelElement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelElement(ModelElement newModelElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModelElement, VisualMetamodelPackage.COMPARTMENT_ELEMENT__MODEL_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelElement(ModelElement newModelElement) {
		if (newModelElement != eInternalContainer() || (eContainerFeatureID() != VisualMetamodelPackage.COMPARTMENT_ELEMENT__MODEL_ELEMENT && newModelElement != null)) {
			if (EcoreUtil.isAncestor(this, newModelElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModelElement != null)
				msgs = ((InternalEObject)newModelElement).eInverseAdd(this, VisualMetamodelPackage.MODEL_ELEMENT__COMPARTMENT_ELEMENTS, ModelElement.class, msgs);
			msgs = basicSetModelElement(newModelElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualMetamodelPackage.COMPARTMENT_ELEMENT__MODEL_ELEMENT, newModelElement, newModelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<TransitionElement> getSourceTransitions() {
		EList<TransitionElement> transitions = new BasicEList<TransitionElement>();
		for (TransitionElement te : getModelElement().getTransitionElements()) {
			if (equals(te.getSource())) {
				transitions.add(te);
			}
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<TransitionElement> getTargetTransitions() {
		EList<TransitionElement> transitions = new BasicEList<TransitionElement>();
		for (TransitionElement te : getModelElement().getTransitionElements()) {
			if (equals(te.getTarget())) {
				transitions.add(te);
			}
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isInherited() {
		Model m = getModelElement().getModel();
		return !m.getCompartments().getCompartments().contains(getCompartment());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VisualMetamodelPackage.COMPARTMENT_ELEMENT__MODEL_ELEMENT:
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
			case VisualMetamodelPackage.COMPARTMENT_ELEMENT__MODEL_ELEMENT:
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
			case VisualMetamodelPackage.COMPARTMENT_ELEMENT__MODEL_ELEMENT:
				return eInternalContainer().eInverseRemove(this, VisualMetamodelPackage.MODEL_ELEMENT__COMPARTMENT_ELEMENTS, ModelElement.class, msgs);
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
			case VisualMetamodelPackage.COMPARTMENT_ELEMENT__COMPARTMENT:
				if (resolve) return getCompartment();
				return basicGetCompartment();
			case VisualMetamodelPackage.COMPARTMENT_ELEMENT__MODEL_ELEMENT:
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
			case VisualMetamodelPackage.COMPARTMENT_ELEMENT__COMPARTMENT:
				setCompartment((Compartment)newValue);
				return;
			case VisualMetamodelPackage.COMPARTMENT_ELEMENT__MODEL_ELEMENT:
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
			case VisualMetamodelPackage.COMPARTMENT_ELEMENT__COMPARTMENT:
				setCompartment((Compartment)null);
				return;
			case VisualMetamodelPackage.COMPARTMENT_ELEMENT__MODEL_ELEMENT:
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
			case VisualMetamodelPackage.COMPARTMENT_ELEMENT__COMPARTMENT:
				return compartment != null;
			case VisualMetamodelPackage.COMPARTMENT_ELEMENT__MODEL_ELEMENT:
				return getModelElement() != null;
		}
		return super.eIsSet(featureID);
	}

} //CompartmentElementImpl
