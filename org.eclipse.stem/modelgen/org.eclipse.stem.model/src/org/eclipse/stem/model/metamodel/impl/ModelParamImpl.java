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
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.stem.model.metamodel.MetamodelPackage;
import org.eclipse.stem.model.metamodel.Model;
import org.eclipse.stem.model.metamodel.ModelParam;
import org.eclipse.stem.model.metamodel.ModelParamConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.ModelParamImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.ModelParamImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.ModelParamImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.ModelParamImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.ModelParamImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.ModelParamImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.ModelParamImpl#getHelpMessage <em>Help Message</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.ModelParamImpl#getInvalidMessage <em>Invalid Message</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.ModelParamImpl#getMissingMessage <em>Missing Message</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.ModelParamImpl#getContainerModel <em>Container Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelParamImpl extends EObjectImpl implements ModelParam {
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
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected EClassifier dataType;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelParamConstraint> constraints;

	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHelpMessage() <em>Help Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelpMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String HELP_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHelpMessage() <em>Help Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelpMessage()
	 * @generated
	 * @ordered
	 */
	protected String helpMessage = HELP_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInvalidMessage() <em>Invalid Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvalidMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String INVALID_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvalidMessage() <em>Invalid Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvalidMessage()
	 * @generated
	 * @ordered
	 */
	protected String invalidMessage = INVALID_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMissingMessage() <em>Missing Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissingMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MISSING_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMissingMessage() <em>Missing Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissingMessage()
	 * @generated
	 * @ordered
	 */
	protected String missingMessage = MISSING_MESSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.MODEL_PARAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MODEL_PARAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier getDataType() {
		if (dataType != null && dataType.eIsProxy()) {
			InternalEObject oldDataType = (InternalEObject)dataType;
			dataType = (EClassifier)eResolveProxy(oldDataType);
			if (dataType != oldDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.MODEL_PARAM__DATA_TYPE, oldDataType, dataType));
			}
		}
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier basicGetDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(EClassifier newDataType) {
		EClassifier oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MODEL_PARAM__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MODEL_PARAM__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelParamConstraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<ModelParamConstraint>(ModelParamConstraint.class, this, MetamodelPackage.MODEL_PARAM__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MODEL_PARAM__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MODEL_PARAM__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHelpMessage() {
		return helpMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHelpMessage(String newHelpMessage) {
		String oldHelpMessage = helpMessage;
		helpMessage = newHelpMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MODEL_PARAM__HELP_MESSAGE, oldHelpMessage, helpMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInvalidMessage() {
		return invalidMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvalidMessage(String newInvalidMessage) {
		String oldInvalidMessage = invalidMessage;
		invalidMessage = newInvalidMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MODEL_PARAM__INVALID_MESSAGE, oldInvalidMessage, invalidMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMissingMessage() {
		return missingMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMissingMessage(String newMissingMessage) {
		String oldMissingMessage = missingMessage;
		missingMessage = newMissingMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MODEL_PARAM__MISSING_MESSAGE, oldMissingMessage, missingMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getContainerModel() {
		if (eContainerFeatureID() != MetamodelPackage.MODEL_PARAM__CONTAINER_MODEL) return null;
		return (Model)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodelPackage.MODEL_PARAM__CONTAINER_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, MetamodelPackage.MODEL_PARAM__CONTAINER_MODEL, msgs);
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
			case MetamodelPackage.MODEL_PARAM__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case MetamodelPackage.MODEL_PARAM__CONTAINER_MODEL:
				return eBasicSetContainer(null, MetamodelPackage.MODEL_PARAM__CONTAINER_MODEL, msgs);
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
			case MetamodelPackage.MODEL_PARAM__CONTAINER_MODEL:
				return eInternalContainer().eInverseRemove(this, MetamodelPackage.MODEL__PARAMETERS, Model.class, msgs);
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
			case MetamodelPackage.MODEL_PARAM__NAME:
				return getName();
			case MetamodelPackage.MODEL_PARAM__DATA_TYPE:
				if (resolve) return getDataType();
				return basicGetDataType();
			case MetamodelPackage.MODEL_PARAM__DEFAULT_VALUE:
				return getDefaultValue();
			case MetamodelPackage.MODEL_PARAM__CONSTRAINTS:
				return getConstraints();
			case MetamodelPackage.MODEL_PARAM__DISPLAY_NAME:
				return getDisplayName();
			case MetamodelPackage.MODEL_PARAM__UNIT:
				return getUnit();
			case MetamodelPackage.MODEL_PARAM__HELP_MESSAGE:
				return getHelpMessage();
			case MetamodelPackage.MODEL_PARAM__INVALID_MESSAGE:
				return getInvalidMessage();
			case MetamodelPackage.MODEL_PARAM__MISSING_MESSAGE:
				return getMissingMessage();
			case MetamodelPackage.MODEL_PARAM__CONTAINER_MODEL:
				return getContainerModel();
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
			case MetamodelPackage.MODEL_PARAM__NAME:
				setName((String)newValue);
				return;
			case MetamodelPackage.MODEL_PARAM__DATA_TYPE:
				setDataType((EClassifier)newValue);
				return;
			case MetamodelPackage.MODEL_PARAM__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case MetamodelPackage.MODEL_PARAM__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends ModelParamConstraint>)newValue);
				return;
			case MetamodelPackage.MODEL_PARAM__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case MetamodelPackage.MODEL_PARAM__UNIT:
				setUnit((String)newValue);
				return;
			case MetamodelPackage.MODEL_PARAM__HELP_MESSAGE:
				setHelpMessage((String)newValue);
				return;
			case MetamodelPackage.MODEL_PARAM__INVALID_MESSAGE:
				setInvalidMessage((String)newValue);
				return;
			case MetamodelPackage.MODEL_PARAM__MISSING_MESSAGE:
				setMissingMessage((String)newValue);
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
			case MetamodelPackage.MODEL_PARAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MetamodelPackage.MODEL_PARAM__DATA_TYPE:
				setDataType((EClassifier)null);
				return;
			case MetamodelPackage.MODEL_PARAM__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case MetamodelPackage.MODEL_PARAM__CONSTRAINTS:
				getConstraints().clear();
				return;
			case MetamodelPackage.MODEL_PARAM__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case MetamodelPackage.MODEL_PARAM__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case MetamodelPackage.MODEL_PARAM__HELP_MESSAGE:
				setHelpMessage(HELP_MESSAGE_EDEFAULT);
				return;
			case MetamodelPackage.MODEL_PARAM__INVALID_MESSAGE:
				setInvalidMessage(INVALID_MESSAGE_EDEFAULT);
				return;
			case MetamodelPackage.MODEL_PARAM__MISSING_MESSAGE:
				setMissingMessage(MISSING_MESSAGE_EDEFAULT);
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
			case MetamodelPackage.MODEL_PARAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MetamodelPackage.MODEL_PARAM__DATA_TYPE:
				return dataType != null;
			case MetamodelPackage.MODEL_PARAM__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case MetamodelPackage.MODEL_PARAM__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case MetamodelPackage.MODEL_PARAM__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case MetamodelPackage.MODEL_PARAM__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
			case MetamodelPackage.MODEL_PARAM__HELP_MESSAGE:
				return HELP_MESSAGE_EDEFAULT == null ? helpMessage != null : !HELP_MESSAGE_EDEFAULT.equals(helpMessage);
			case MetamodelPackage.MODEL_PARAM__INVALID_MESSAGE:
				return INVALID_MESSAGE_EDEFAULT == null ? invalidMessage != null : !INVALID_MESSAGE_EDEFAULT.equals(invalidMessage);
			case MetamodelPackage.MODEL_PARAM__MISSING_MESSAGE:
				return MISSING_MESSAGE_EDEFAULT == null ? missingMessage != null : !MISSING_MESSAGE_EDEFAULT.equals(missingMessage);
			case MetamodelPackage.MODEL_PARAM__CONTAINER_MODEL:
				return getContainerModel() != null;
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
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", displayName: ");
		result.append(displayName);
		result.append(", unit: ");
		result.append(unit);
		result.append(", helpMessage: ");
		result.append(helpMessage);
		result.append(", invalidMessage: ");
		result.append(invalidMessage);
		result.append(", missingMessage: ");
		result.append(missingMessage);
		result.append(')');
		return result.toString();
	}

} //ModelParamImpl
