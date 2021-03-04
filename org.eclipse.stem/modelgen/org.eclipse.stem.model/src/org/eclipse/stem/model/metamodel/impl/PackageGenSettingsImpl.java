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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.stem.model.metamodel.MetamodelPackage;
import org.eclipse.stem.model.metamodel.PackageGenSettings;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Gen Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.PackageGenSettingsImpl#getModelPluginId <em>Model Plugin Id</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.PackageGenSettingsImpl#getEditorPluginId <em>Editor Plugin Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageGenSettingsImpl extends EObjectImpl implements PackageGenSettings {
	/**
	 * The default value of the '{@link #getModelPluginId() <em>Model Plugin Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelPluginId()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_PLUGIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelPluginId() <em>Model Plugin Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelPluginId()
	 * @generated
	 * @ordered
	 */
	protected String modelPluginId = MODEL_PLUGIN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditorPluginId() <em>Editor Plugin Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditorPluginId()
	 * @generated
	 * @ordered
	 */
	protected static final String EDITOR_PLUGIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditorPluginId() <em>Editor Plugin Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditorPluginId()
	 * @generated
	 * @ordered
	 */
	protected String editorPluginId = EDITOR_PLUGIN_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageGenSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.PACKAGE_GEN_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelPluginId() {
		return modelPluginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelPluginId(String newModelPluginId) {
		String oldModelPluginId = modelPluginId;
		modelPluginId = newModelPluginId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.PACKAGE_GEN_SETTINGS__MODEL_PLUGIN_ID, oldModelPluginId, modelPluginId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditorPluginId() {
		return editorPluginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditorPluginId(String newEditorPluginId) {
		String oldEditorPluginId = editorPluginId;
		editorPluginId = newEditorPluginId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.PACKAGE_GEN_SETTINGS__EDITOR_PLUGIN_ID, oldEditorPluginId, editorPluginId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodelPackage.PACKAGE_GEN_SETTINGS__MODEL_PLUGIN_ID:
				return getModelPluginId();
			case MetamodelPackage.PACKAGE_GEN_SETTINGS__EDITOR_PLUGIN_ID:
				return getEditorPluginId();
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
			case MetamodelPackage.PACKAGE_GEN_SETTINGS__MODEL_PLUGIN_ID:
				setModelPluginId((String)newValue);
				return;
			case MetamodelPackage.PACKAGE_GEN_SETTINGS__EDITOR_PLUGIN_ID:
				setEditorPluginId((String)newValue);
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
			case MetamodelPackage.PACKAGE_GEN_SETTINGS__MODEL_PLUGIN_ID:
				setModelPluginId(MODEL_PLUGIN_ID_EDEFAULT);
				return;
			case MetamodelPackage.PACKAGE_GEN_SETTINGS__EDITOR_PLUGIN_ID:
				setEditorPluginId(EDITOR_PLUGIN_ID_EDEFAULT);
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
			case MetamodelPackage.PACKAGE_GEN_SETTINGS__MODEL_PLUGIN_ID:
				return MODEL_PLUGIN_ID_EDEFAULT == null ? modelPluginId != null : !MODEL_PLUGIN_ID_EDEFAULT.equals(modelPluginId);
			case MetamodelPackage.PACKAGE_GEN_SETTINGS__EDITOR_PLUGIN_ID:
				return EDITOR_PLUGIN_ID_EDEFAULT == null ? editorPluginId != null : !EDITOR_PLUGIN_ID_EDEFAULT.equals(editorPluginId);
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
		result.append(" (modelPluginId: ");
		result.append(modelPluginId);
		result.append(", editorPluginId: ");
		result.append(editorPluginId);
		result.append(')');
		return result.toString();
	}

} //PackageGenSettingsImpl
