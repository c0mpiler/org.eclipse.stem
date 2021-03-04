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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.stem.model.ui.editor.vismodel.CanvasPackage;
import org.eclipse.stem.model.ui.editor.vismodel.ModelElement;
import org.eclipse.stem.model.ui.editor.vismodel.VisualMetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Canvas Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.ui.editor.vismodel.impl.CanvasPackageImpl#getModelElements <em>Model Elements</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ui.editor.vismodel.impl.CanvasPackageImpl#getMetamodel <em>Metamodel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CanvasPackageImpl extends EObjectImpl implements CanvasPackage {
	/**
	 * The cached value of the '{@link #getModelElements() <em>Model Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> modelElements;

	/**
	 * The cached value of the '{@link #getMetamodel() <em>Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodel()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.stem.model.metamodel.Package metamodel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CanvasPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualMetamodelPackage.Literals.CANVAS_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElement> getModelElements() {
		if (modelElements == null) {
			modelElements = new EObjectContainmentWithInverseEList<ModelElement>(ModelElement.class, this, VisualMetamodelPackage.CANVAS_PACKAGE__MODEL_ELEMENTS, VisualMetamodelPackage.MODEL_ELEMENT__CANVAS);
		}
		return modelElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.stem.model.metamodel.Package getMetamodel() {
		if (metamodel != null && metamodel.eIsProxy()) {
			InternalEObject oldMetamodel = (InternalEObject)metamodel;
			metamodel = (org.eclipse.stem.model.metamodel.Package)eResolveProxy(oldMetamodel);
			if (metamodel != oldMetamodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisualMetamodelPackage.CANVAS_PACKAGE__METAMODEL, oldMetamodel, metamodel));
			}
		}
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.stem.model.metamodel.Package basicGetMetamodel() {
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodel(org.eclipse.stem.model.metamodel.Package newMetamodel) {
		org.eclipse.stem.model.metamodel.Package oldMetamodel = metamodel;
		metamodel = newMetamodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualMetamodelPackage.CANVAS_PACKAGE__METAMODEL, oldMetamodel, metamodel));
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
			case VisualMetamodelPackage.CANVAS_PACKAGE__MODEL_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getModelElements()).basicAdd(otherEnd, msgs);
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
			case VisualMetamodelPackage.CANVAS_PACKAGE__MODEL_ELEMENTS:
				return ((InternalEList<?>)getModelElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisualMetamodelPackage.CANVAS_PACKAGE__MODEL_ELEMENTS:
				return getModelElements();
			case VisualMetamodelPackage.CANVAS_PACKAGE__METAMODEL:
				if (resolve) return getMetamodel();
				return basicGetMetamodel();
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
			case VisualMetamodelPackage.CANVAS_PACKAGE__MODEL_ELEMENTS:
				getModelElements().clear();
				getModelElements().addAll((Collection<? extends ModelElement>)newValue);
				return;
			case VisualMetamodelPackage.CANVAS_PACKAGE__METAMODEL:
				setMetamodel((org.eclipse.stem.model.metamodel.Package)newValue);
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
			case VisualMetamodelPackage.CANVAS_PACKAGE__MODEL_ELEMENTS:
				getModelElements().clear();
				return;
			case VisualMetamodelPackage.CANVAS_PACKAGE__METAMODEL:
				setMetamodel((org.eclipse.stem.model.metamodel.Package)null);
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
			case VisualMetamodelPackage.CANVAS_PACKAGE__MODEL_ELEMENTS:
				return modelElements != null && !modelElements.isEmpty();
			case VisualMetamodelPackage.CANVAS_PACKAGE__METAMODEL:
				return metamodel != null;
		}
		return super.eIsSet(featureID);
	}

} //CanvasPackageImpl
