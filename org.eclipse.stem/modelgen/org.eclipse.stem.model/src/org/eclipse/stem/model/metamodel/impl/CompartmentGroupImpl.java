/*******************************************************************************
 * Copyright (c) 2012 Bundesinstitut für Risikobewertung and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *     Bundesinstitut für Risikobewertung - initial API and implementation
 *******************************************************************************/
package org.eclipse.stem.model.metamodel.impl;

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
import org.eclipse.stem.model.metamodel.Compartment;
import org.eclipse.stem.model.metamodel.CompartmentGroup;
import org.eclipse.stem.model.metamodel.MetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compartment Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.CompartmentGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.CompartmentGroupImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.CompartmentGroupImpl#getValueClass <em>Value Class</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.CompartmentGroupImpl#getParentGroup <em>Parent Group</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.CompartmentGroupImpl#getCompartments <em>Compartments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompartmentGroupImpl extends EObjectImpl implements CompartmentGroup {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected EClass class_;

	/**
	 * The cached value of the '{@link #getValueClass() <em>Value Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueClass()
	 * @generated
	 * @ordered
	 */
	protected EClass valueClass;

	/**
	 * The cached value of the '{@link #getParentGroup() <em>Parent Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentGroup()
	 * @generated
	 * @ordered
	 */
	protected CompartmentGroup parentGroup;

	/**
	 * The cached value of the '{@link #getCompartments() <em>Compartments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartments()
	 * @generated
	 * @ordered
	 */
	protected EList<Compartment> compartments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompartmentGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.COMPARTMENT_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.COMPARTMENT_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		if (class_ != null && class_.eIsProxy()) {
			InternalEObject oldClass = (InternalEObject)class_;
			class_ = (EClass)eResolveProxy(oldClass);
			if (class_ != oldClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.COMPARTMENT_GROUP__CLASS, oldClass, class_));
			}
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetClass() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(EClass newClass) {
		EClass oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.COMPARTMENT_GROUP__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueClass() {
		if (valueClass != null && valueClass.eIsProxy()) {
			InternalEObject oldValueClass = (InternalEObject)valueClass;
			valueClass = (EClass)eResolveProxy(oldValueClass);
			if (valueClass != oldValueClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.COMPARTMENT_GROUP__VALUE_CLASS, oldValueClass, valueClass));
			}
		}
		return valueClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetValueClass() {
		return valueClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueClass(EClass newValueClass) {
		EClass oldValueClass = valueClass;
		valueClass = newValueClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.COMPARTMENT_GROUP__VALUE_CLASS, oldValueClass, valueClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentGroup getParentGroup() {
		if (parentGroup != null && parentGroup.eIsProxy()) {
			InternalEObject oldParentGroup = (InternalEObject)parentGroup;
			parentGroup = (CompartmentGroup)eResolveProxy(oldParentGroup);
			if (parentGroup != oldParentGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.COMPARTMENT_GROUP__PARENT_GROUP, oldParentGroup, parentGroup));
			}
		}
		return parentGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentGroup basicGetParentGroup() {
		return parentGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentGroup(CompartmentGroup newParentGroup) {
		CompartmentGroup oldParentGroup = parentGroup;
		parentGroup = newParentGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.COMPARTMENT_GROUP__PARENT_GROUP, oldParentGroup, parentGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Compartment> getCompartments() {
		if (compartments == null) {
			compartments = new EObjectContainmentWithInverseEList<Compartment>(Compartment.class, this, MetamodelPackage.COMPARTMENT_GROUP__COMPARTMENTS, MetamodelPackage.COMPARTMENT__CONTAINER_GROUP);
		}
		return compartments;
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
			case MetamodelPackage.COMPARTMENT_GROUP__COMPARTMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCompartments()).basicAdd(otherEnd, msgs);
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
			case MetamodelPackage.COMPARTMENT_GROUP__COMPARTMENTS:
				return ((InternalEList<?>)getCompartments()).basicRemove(otherEnd, msgs);
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
			case MetamodelPackage.COMPARTMENT_GROUP__NAME:
				return getName();
			case MetamodelPackage.COMPARTMENT_GROUP__CLASS:
				if (resolve) return getClass_();
				return basicGetClass();
			case MetamodelPackage.COMPARTMENT_GROUP__VALUE_CLASS:
				if (resolve) return getValueClass();
				return basicGetValueClass();
			case MetamodelPackage.COMPARTMENT_GROUP__PARENT_GROUP:
				if (resolve) return getParentGroup();
				return basicGetParentGroup();
			case MetamodelPackage.COMPARTMENT_GROUP__COMPARTMENTS:
				return getCompartments();
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
			case MetamodelPackage.COMPARTMENT_GROUP__NAME:
				setName((String)newValue);
				return;
			case MetamodelPackage.COMPARTMENT_GROUP__CLASS:
				setClass((EClass)newValue);
				return;
			case MetamodelPackage.COMPARTMENT_GROUP__VALUE_CLASS:
				setValueClass((EClass)newValue);
				return;
			case MetamodelPackage.COMPARTMENT_GROUP__PARENT_GROUP:
				setParentGroup((CompartmentGroup)newValue);
				return;
			case MetamodelPackage.COMPARTMENT_GROUP__COMPARTMENTS:
				getCompartments().clear();
				getCompartments().addAll((Collection<? extends Compartment>)newValue);
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
			case MetamodelPackage.COMPARTMENT_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MetamodelPackage.COMPARTMENT_GROUP__CLASS:
				setClass((EClass)null);
				return;
			case MetamodelPackage.COMPARTMENT_GROUP__VALUE_CLASS:
				setValueClass((EClass)null);
				return;
			case MetamodelPackage.COMPARTMENT_GROUP__PARENT_GROUP:
				setParentGroup((CompartmentGroup)null);
				return;
			case MetamodelPackage.COMPARTMENT_GROUP__COMPARTMENTS:
				getCompartments().clear();
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
			case MetamodelPackage.COMPARTMENT_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MetamodelPackage.COMPARTMENT_GROUP__CLASS:
				return class_ != null;
			case MetamodelPackage.COMPARTMENT_GROUP__VALUE_CLASS:
				return valueClass != null;
			case MetamodelPackage.COMPARTMENT_GROUP__PARENT_GROUP:
				return parentGroup != null;
			case MetamodelPackage.COMPARTMENT_GROUP__COMPARTMENTS:
				return compartments != null && !compartments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CompartmentGroupImpl
