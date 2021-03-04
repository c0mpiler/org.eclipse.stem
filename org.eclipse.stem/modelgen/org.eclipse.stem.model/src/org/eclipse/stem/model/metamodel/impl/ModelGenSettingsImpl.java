/**
 * 
 * Copyright (c) 2012 Bundesinstitut für Risikobewertung and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Bundesinstitut für Risikobewertung - initial API and implementation
 */
package org.eclipse.stem.model.metamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.stem.model.metamodel.MetamodelPackage;
import org.eclipse.stem.model.metamodel.ModelGenSettings;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Gen Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.ModelGenSettingsImpl#getPropertyEditorClass <em>Property Editor Class</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.ModelGenSettingsImpl#getPropertyEditorParentClass <em>Property Editor Parent Class</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.ModelGenSettingsImpl#getStringProviderAdapterClass <em>String Provider Adapter Class</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.ModelGenSettingsImpl#getStringProviderAdapterParentClass <em>String Provider Adapter Parent Class</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.ModelGenSettingsImpl#getLabelRelativeValueProviderAdapterClass <em>Label Relative Value Provider Adapter Class</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.ModelGenSettingsImpl#getLabelRelativeValueProviderAdapterParentClass <em>Label Relative Value Provider Adapter Parent Class</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.ModelGenSettingsImpl#getLabelValueRelativeValueProviderAdapterClass <em>Label Value Relative Value Provider Adapter Class</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.ModelGenSettingsImpl#getLabelValueRelativeValueProviderAdapterParentClass <em>Label Value Relative Value Provider Adapter Parent Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelGenSettingsImpl extends EObjectImpl implements ModelGenSettings {
	/**
	 * The default value of the '{@link #getPropertyEditorClass() <em>Property Editor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyEditorClass()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_EDITOR_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyEditorClass() <em>Property Editor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyEditorClass()
	 * @generated
	 * @ordered
	 */
	protected String propertyEditorClass = PROPERTY_EDITOR_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropertyEditorParentClass() <em>Property Editor Parent Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyEditorParentClass()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_EDITOR_PARENT_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyEditorParentClass() <em>Property Editor Parent Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyEditorParentClass()
	 * @generated
	 * @ordered
	 */
	protected String propertyEditorParentClass = PROPERTY_EDITOR_PARENT_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStringProviderAdapterClass() <em>String Provider Adapter Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringProviderAdapterClass()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_PROVIDER_ADAPTER_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStringProviderAdapterClass() <em>String Provider Adapter Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringProviderAdapterClass()
	 * @generated
	 * @ordered
	 */
	protected String stringProviderAdapterClass = STRING_PROVIDER_ADAPTER_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStringProviderAdapterParentClass() <em>String Provider Adapter Parent Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringProviderAdapterParentClass()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_PROVIDER_ADAPTER_PARENT_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStringProviderAdapterParentClass() <em>String Provider Adapter Parent Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringProviderAdapterParentClass()
	 * @generated
	 * @ordered
	 */
	protected String stringProviderAdapterParentClass = STRING_PROVIDER_ADAPTER_PARENT_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelRelativeValueProviderAdapterClass() <em>Label Relative Value Provider Adapter Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelRelativeValueProviderAdapterClass()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_RELATIVE_VALUE_PROVIDER_ADAPTER_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelRelativeValueProviderAdapterClass() <em>Label Relative Value Provider Adapter Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelRelativeValueProviderAdapterClass()
	 * @generated
	 * @ordered
	 */
	protected String labelRelativeValueProviderAdapterClass = LABEL_RELATIVE_VALUE_PROVIDER_ADAPTER_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelRelativeValueProviderAdapterParentClass() <em>Label Relative Value Provider Adapter Parent Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelRelativeValueProviderAdapterParentClass()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_RELATIVE_VALUE_PROVIDER_ADAPTER_PARENT_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelRelativeValueProviderAdapterParentClass() <em>Label Relative Value Provider Adapter Parent Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelRelativeValueProviderAdapterParentClass()
	 * @generated
	 * @ordered
	 */
	protected String labelRelativeValueProviderAdapterParentClass = LABEL_RELATIVE_VALUE_PROVIDER_ADAPTER_PARENT_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelValueRelativeValueProviderAdapterClass() <em>Label Value Relative Value Provider Adapter Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelValueRelativeValueProviderAdapterClass()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_VALUE_RELATIVE_VALUE_PROVIDER_ADAPTER_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelValueRelativeValueProviderAdapterClass() <em>Label Value Relative Value Provider Adapter Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelValueRelativeValueProviderAdapterClass()
	 * @generated
	 * @ordered
	 */
	protected String labelValueRelativeValueProviderAdapterClass = LABEL_VALUE_RELATIVE_VALUE_PROVIDER_ADAPTER_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelValueRelativeValueProviderAdapterParentClass() <em>Label Value Relative Value Provider Adapter Parent Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelValueRelativeValueProviderAdapterParentClass()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_VALUE_RELATIVE_VALUE_PROVIDER_ADAPTER_PARENT_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelValueRelativeValueProviderAdapterParentClass() <em>Label Value Relative Value Provider Adapter Parent Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelValueRelativeValueProviderAdapterParentClass()
	 * @generated
	 * @ordered
	 */
	protected String labelValueRelativeValueProviderAdapterParentClass = LABEL_VALUE_RELATIVE_VALUE_PROVIDER_ADAPTER_PARENT_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelGenSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.MODEL_GEN_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyEditorClass() {
		return propertyEditorClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyEditorClass(String newPropertyEditorClass) {
		String oldPropertyEditorClass = propertyEditorClass;
		propertyEditorClass = newPropertyEditorClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MODEL_GEN_SETTINGS__PROPERTY_EDITOR_CLASS, oldPropertyEditorClass, propertyEditorClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyEditorParentClass() {
		return propertyEditorParentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyEditorParentClass(String newPropertyEditorParentClass) {
		String oldPropertyEditorParentClass = propertyEditorParentClass;
		propertyEditorParentClass = newPropertyEditorParentClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MODEL_GEN_SETTINGS__PROPERTY_EDITOR_PARENT_CLASS, oldPropertyEditorParentClass, propertyEditorParentClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStringProviderAdapterClass() {
		return stringProviderAdapterClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringProviderAdapterClass(String newStringProviderAdapterClass) {
		String oldStringProviderAdapterClass = stringProviderAdapterClass;
		stringProviderAdapterClass = newStringProviderAdapterClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MODEL_GEN_SETTINGS__STRING_PROVIDER_ADAPTER_CLASS, oldStringProviderAdapterClass, stringProviderAdapterClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStringProviderAdapterParentClass() {
		return stringProviderAdapterParentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringProviderAdapterParentClass(String newStringProviderAdapterParentClass) {
		String oldStringProviderAdapterParentClass = stringProviderAdapterParentClass;
		stringProviderAdapterParentClass = newStringProviderAdapterParentClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MODEL_GEN_SETTINGS__STRING_PROVIDER_ADAPTER_PARENT_CLASS, oldStringProviderAdapterParentClass, stringProviderAdapterParentClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabelRelativeValueProviderAdapterClass() {
		return labelRelativeValueProviderAdapterClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelRelativeValueProviderAdapterClass(String newLabelRelativeValueProviderAdapterClass) {
		String oldLabelRelativeValueProviderAdapterClass = labelRelativeValueProviderAdapterClass;
		labelRelativeValueProviderAdapterClass = newLabelRelativeValueProviderAdapterClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MODEL_GEN_SETTINGS__LABEL_RELATIVE_VALUE_PROVIDER_ADAPTER_CLASS, oldLabelRelativeValueProviderAdapterClass, labelRelativeValueProviderAdapterClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabelRelativeValueProviderAdapterParentClass() {
		return labelRelativeValueProviderAdapterParentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelRelativeValueProviderAdapterParentClass(String newLabelRelativeValueProviderAdapterParentClass) {
		String oldLabelRelativeValueProviderAdapterParentClass = labelRelativeValueProviderAdapterParentClass;
		labelRelativeValueProviderAdapterParentClass = newLabelRelativeValueProviderAdapterParentClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MODEL_GEN_SETTINGS__LABEL_RELATIVE_VALUE_PROVIDER_ADAPTER_PARENT_CLASS, oldLabelRelativeValueProviderAdapterParentClass, labelRelativeValueProviderAdapterParentClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabelValueRelativeValueProviderAdapterClass() {
		return labelValueRelativeValueProviderAdapterClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelValueRelativeValueProviderAdapterClass(String newLabelValueRelativeValueProviderAdapterClass) {
		String oldLabelValueRelativeValueProviderAdapterClass = labelValueRelativeValueProviderAdapterClass;
		labelValueRelativeValueProviderAdapterClass = newLabelValueRelativeValueProviderAdapterClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MODEL_GEN_SETTINGS__LABEL_VALUE_RELATIVE_VALUE_PROVIDER_ADAPTER_CLASS, oldLabelValueRelativeValueProviderAdapterClass, labelValueRelativeValueProviderAdapterClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabelValueRelativeValueProviderAdapterParentClass() {
		return labelValueRelativeValueProviderAdapterParentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelValueRelativeValueProviderAdapterParentClass(String newLabelValueRelativeValueProviderAdapterParentClass) {
		String oldLabelValueRelativeValueProviderAdapterParentClass = labelValueRelativeValueProviderAdapterParentClass;
		labelValueRelativeValueProviderAdapterParentClass = newLabelValueRelativeValueProviderAdapterParentClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MODEL_GEN_SETTINGS__LABEL_VALUE_RELATIVE_VALUE_PROVIDER_ADAPTER_PARENT_CLASS, oldLabelValueRelativeValueProviderAdapterParentClass, labelValueRelativeValueProviderAdapterParentClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodelPackage.MODEL_GEN_SETTINGS__PROPERTY_EDITOR_CLASS:
				return getPropertyEditorClass();
			case MetamodelPackage.MODEL_GEN_SETTINGS__PROPERTY_EDITOR_PARENT_CLASS:
				return getPropertyEditorParentClass();
			case MetamodelPackage.MODEL_GEN_SETTINGS__STRING_PROVIDER_ADAPTER_CLASS:
				return getStringProviderAdapterClass();
			case MetamodelPackage.MODEL_GEN_SETTINGS__STRING_PROVIDER_ADAPTER_PARENT_CLASS:
				return getStringProviderAdapterParentClass();
			case MetamodelPackage.MODEL_GEN_SETTINGS__LABEL_RELATIVE_VALUE_PROVIDER_ADAPTER_CLASS:
				return getLabelRelativeValueProviderAdapterClass();
			case MetamodelPackage.MODEL_GEN_SETTINGS__LABEL_RELATIVE_VALUE_PROVIDER_ADAPTER_PARENT_CLASS:
				return getLabelRelativeValueProviderAdapterParentClass();
			case MetamodelPackage.MODEL_GEN_SETTINGS__LABEL_VALUE_RELATIVE_VALUE_PROVIDER_ADAPTER_CLASS:
				return getLabelValueRelativeValueProviderAdapterClass();
			case MetamodelPackage.MODEL_GEN_SETTINGS__LABEL_VALUE_RELATIVE_VALUE_PROVIDER_ADAPTER_PARENT_CLASS:
				return getLabelValueRelativeValueProviderAdapterParentClass();
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
			case MetamodelPackage.MODEL_GEN_SETTINGS__PROPERTY_EDITOR_CLASS:
				setPropertyEditorClass((String)newValue);
				return;
			case MetamodelPackage.MODEL_GEN_SETTINGS__PROPERTY_EDITOR_PARENT_CLASS:
				setPropertyEditorParentClass((String)newValue);
				return;
			case MetamodelPackage.MODEL_GEN_SETTINGS__STRING_PROVIDER_ADAPTER_CLASS:
				setStringProviderAdapterClass((String)newValue);
				return;
			case MetamodelPackage.MODEL_GEN_SETTINGS__STRING_PROVIDER_ADAPTER_PARENT_CLASS:
				setStringProviderAdapterParentClass((String)newValue);
				return;
			case MetamodelPackage.MODEL_GEN_SETTINGS__LABEL_RELATIVE_VALUE_PROVIDER_ADAPTER_CLASS:
				setLabelRelativeValueProviderAdapterClass((String)newValue);
				return;
			case MetamodelPackage.MODEL_GEN_SETTINGS__LABEL_RELATIVE_VALUE_PROVIDER_ADAPTER_PARENT_CLASS:
				setLabelRelativeValueProviderAdapterParentClass((String)newValue);
				return;
			case MetamodelPackage.MODEL_GEN_SETTINGS__LABEL_VALUE_RELATIVE_VALUE_PROVIDER_ADAPTER_CLASS:
				setLabelValueRelativeValueProviderAdapterClass((String)newValue);
				return;
			case MetamodelPackage.MODEL_GEN_SETTINGS__LABEL_VALUE_RELATIVE_VALUE_PROVIDER_ADAPTER_PARENT_CLASS:
				setLabelValueRelativeValueProviderAdapterParentClass((String)newValue);
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
			case MetamodelPackage.MODEL_GEN_SETTINGS__PROPERTY_EDITOR_CLASS:
				setPropertyEditorClass(PROPERTY_EDITOR_CLASS_EDEFAULT);
				return;
			case MetamodelPackage.MODEL_GEN_SETTINGS__PROPERTY_EDITOR_PARENT_CLASS:
				setPropertyEditorParentClass(PROPERTY_EDITOR_PARENT_CLASS_EDEFAULT);
				return;
			case MetamodelPackage.MODEL_GEN_SETTINGS__STRING_PROVIDER_ADAPTER_CLASS:
				setStringProviderAdapterClass(STRING_PROVIDER_ADAPTER_CLASS_EDEFAULT);
				return;
			case MetamodelPackage.MODEL_GEN_SETTINGS__STRING_PROVIDER_ADAPTER_PARENT_CLASS:
				setStringProviderAdapterParentClass(STRING_PROVIDER_ADAPTER_PARENT_CLASS_EDEFAULT);
				return;
			case MetamodelPackage.MODEL_GEN_SETTINGS__LABEL_RELATIVE_VALUE_PROVIDER_ADAPTER_CLASS:
				setLabelRelativeValueProviderAdapterClass(LABEL_RELATIVE_VALUE_PROVIDER_ADAPTER_CLASS_EDEFAULT);
				return;
			case MetamodelPackage.MODEL_GEN_SETTINGS__LABEL_RELATIVE_VALUE_PROVIDER_ADAPTER_PARENT_CLASS:
				setLabelRelativeValueProviderAdapterParentClass(LABEL_RELATIVE_VALUE_PROVIDER_ADAPTER_PARENT_CLASS_EDEFAULT);
				return;
			case MetamodelPackage.MODEL_GEN_SETTINGS__LABEL_VALUE_RELATIVE_VALUE_PROVIDER_ADAPTER_CLASS:
				setLabelValueRelativeValueProviderAdapterClass(LABEL_VALUE_RELATIVE_VALUE_PROVIDER_ADAPTER_CLASS_EDEFAULT);
				return;
			case MetamodelPackage.MODEL_GEN_SETTINGS__LABEL_VALUE_RELATIVE_VALUE_PROVIDER_ADAPTER_PARENT_CLASS:
				setLabelValueRelativeValueProviderAdapterParentClass(LABEL_VALUE_RELATIVE_VALUE_PROVIDER_ADAPTER_PARENT_CLASS_EDEFAULT);
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
			case MetamodelPackage.MODEL_GEN_SETTINGS__PROPERTY_EDITOR_CLASS:
				return PROPERTY_EDITOR_CLASS_EDEFAULT == null ? propertyEditorClass != null : !PROPERTY_EDITOR_CLASS_EDEFAULT.equals(propertyEditorClass);
			case MetamodelPackage.MODEL_GEN_SETTINGS__PROPERTY_EDITOR_PARENT_CLASS:
				return PROPERTY_EDITOR_PARENT_CLASS_EDEFAULT == null ? propertyEditorParentClass != null : !PROPERTY_EDITOR_PARENT_CLASS_EDEFAULT.equals(propertyEditorParentClass);
			case MetamodelPackage.MODEL_GEN_SETTINGS__STRING_PROVIDER_ADAPTER_CLASS:
				return STRING_PROVIDER_ADAPTER_CLASS_EDEFAULT == null ? stringProviderAdapterClass != null : !STRING_PROVIDER_ADAPTER_CLASS_EDEFAULT.equals(stringProviderAdapterClass);
			case MetamodelPackage.MODEL_GEN_SETTINGS__STRING_PROVIDER_ADAPTER_PARENT_CLASS:
				return STRING_PROVIDER_ADAPTER_PARENT_CLASS_EDEFAULT == null ? stringProviderAdapterParentClass != null : !STRING_PROVIDER_ADAPTER_PARENT_CLASS_EDEFAULT.equals(stringProviderAdapterParentClass);
			case MetamodelPackage.MODEL_GEN_SETTINGS__LABEL_RELATIVE_VALUE_PROVIDER_ADAPTER_CLASS:
				return LABEL_RELATIVE_VALUE_PROVIDER_ADAPTER_CLASS_EDEFAULT == null ? labelRelativeValueProviderAdapterClass != null : !LABEL_RELATIVE_VALUE_PROVIDER_ADAPTER_CLASS_EDEFAULT.equals(labelRelativeValueProviderAdapterClass);
			case MetamodelPackage.MODEL_GEN_SETTINGS__LABEL_RELATIVE_VALUE_PROVIDER_ADAPTER_PARENT_CLASS:
				return LABEL_RELATIVE_VALUE_PROVIDER_ADAPTER_PARENT_CLASS_EDEFAULT == null ? labelRelativeValueProviderAdapterParentClass != null : !LABEL_RELATIVE_VALUE_PROVIDER_ADAPTER_PARENT_CLASS_EDEFAULT.equals(labelRelativeValueProviderAdapterParentClass);
			case MetamodelPackage.MODEL_GEN_SETTINGS__LABEL_VALUE_RELATIVE_VALUE_PROVIDER_ADAPTER_CLASS:
				return LABEL_VALUE_RELATIVE_VALUE_PROVIDER_ADAPTER_CLASS_EDEFAULT == null ? labelValueRelativeValueProviderAdapterClass != null : !LABEL_VALUE_RELATIVE_VALUE_PROVIDER_ADAPTER_CLASS_EDEFAULT.equals(labelValueRelativeValueProviderAdapterClass);
			case MetamodelPackage.MODEL_GEN_SETTINGS__LABEL_VALUE_RELATIVE_VALUE_PROVIDER_ADAPTER_PARENT_CLASS:
				return LABEL_VALUE_RELATIVE_VALUE_PROVIDER_ADAPTER_PARENT_CLASS_EDEFAULT == null ? labelValueRelativeValueProviderAdapterParentClass != null : !LABEL_VALUE_RELATIVE_VALUE_PROVIDER_ADAPTER_PARENT_CLASS_EDEFAULT.equals(labelValueRelativeValueProviderAdapterParentClass);
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
		result.append(" (propertyEditorClass: ");
		result.append(propertyEditorClass);
		result.append(", propertyEditorParentClass: ");
		result.append(propertyEditorParentClass);
		result.append(", stringProviderAdapterClass: ");
		result.append(stringProviderAdapterClass);
		result.append(", stringProviderAdapterParentClass: ");
		result.append(stringProviderAdapterParentClass);
		result.append(", labelRelativeValueProviderAdapterClass: ");
		result.append(labelRelativeValueProviderAdapterClass);
		result.append(", labelRelativeValueProviderAdapterParentClass: ");
		result.append(labelRelativeValueProviderAdapterParentClass);
		result.append(", labelValueRelativeValueProviderAdapterClass: ");
		result.append(labelValueRelativeValueProviderAdapterClass);
		result.append(", labelValueRelativeValueProviderAdapterParentClass: ");
		result.append(labelValueRelativeValueProviderAdapterParentClass);
		result.append(')');
		return result.toString();
	}

} //ModelGenSettingsImpl
