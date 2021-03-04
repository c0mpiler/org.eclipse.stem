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
package org.eclipse.stem.model.metamodel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.stem.model.metamodel.MetamodelPackage;
import org.eclipse.stem.model.metamodel.ModelGenSettings;

/**
 * This is the item provider adapter for a {@link org.eclipse.stem.model.metamodel.ModelGenSettings} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelGenSettingsItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelGenSettingsItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPropertyEditorClassPropertyDescriptor(object);
			addPropertyEditorParentClassPropertyDescriptor(object);
			addStringProviderAdapterClassPropertyDescriptor(object);
			addStringProviderAdapterParentClassPropertyDescriptor(object);
			addLabelRelativeValueProviderAdapterClassPropertyDescriptor(object);
			addLabelRelativeValueProviderAdapterParentClassPropertyDescriptor(object);
			addLabelValueRelativeValueProviderAdapterClassPropertyDescriptor(object);
			addLabelValueRelativeValueProviderAdapterParentClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Property Editor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyEditorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelGenSettings_propertyEditorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelGenSettings_propertyEditorClass_feature", "_UI_ModelGenSettings_type"),
				 MetamodelPackage.Literals.MODEL_GEN_SETTINGS__PROPERTY_EDITOR_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Property Editor Parent Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyEditorParentClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelGenSettings_propertyEditorParentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelGenSettings_propertyEditorParentClass_feature", "_UI_ModelGenSettings_type"),
				 MetamodelPackage.Literals.MODEL_GEN_SETTINGS__PROPERTY_EDITOR_PARENT_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the String Provider Adapter Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStringProviderAdapterClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelGenSettings_stringProviderAdapterClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelGenSettings_stringProviderAdapterClass_feature", "_UI_ModelGenSettings_type"),
				 MetamodelPackage.Literals.MODEL_GEN_SETTINGS__STRING_PROVIDER_ADAPTER_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the String Provider Adapter Parent Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStringProviderAdapterParentClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelGenSettings_stringProviderAdapterParentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelGenSettings_stringProviderAdapterParentClass_feature", "_UI_ModelGenSettings_type"),
				 MetamodelPackage.Literals.MODEL_GEN_SETTINGS__STRING_PROVIDER_ADAPTER_PARENT_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Label Relative Value Provider Adapter Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelRelativeValueProviderAdapterClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelGenSettings_labelRelativeValueProviderAdapterClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelGenSettings_labelRelativeValueProviderAdapterClass_feature", "_UI_ModelGenSettings_type"),
				 MetamodelPackage.Literals.MODEL_GEN_SETTINGS__LABEL_RELATIVE_VALUE_PROVIDER_ADAPTER_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Label Relative Value Provider Adapter Parent Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelRelativeValueProviderAdapterParentClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelGenSettings_labelRelativeValueProviderAdapterParentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelGenSettings_labelRelativeValueProviderAdapterParentClass_feature", "_UI_ModelGenSettings_type"),
				 MetamodelPackage.Literals.MODEL_GEN_SETTINGS__LABEL_RELATIVE_VALUE_PROVIDER_ADAPTER_PARENT_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Label Value Relative Value Provider Adapter Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelValueRelativeValueProviderAdapterClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelGenSettings_labelValueRelativeValueProviderAdapterClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelGenSettings_labelValueRelativeValueProviderAdapterClass_feature", "_UI_ModelGenSettings_type"),
				 MetamodelPackage.Literals.MODEL_GEN_SETTINGS__LABEL_VALUE_RELATIVE_VALUE_PROVIDER_ADAPTER_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Label Value Relative Value Provider Adapter Parent Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelValueRelativeValueProviderAdapterParentClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelGenSettings_labelValueRelativeValueProviderAdapterParentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelGenSettings_labelValueRelativeValueProviderAdapterParentClass_feature", "_UI_ModelGenSettings_type"),
				 MetamodelPackage.Literals.MODEL_GEN_SETTINGS__LABEL_VALUE_RELATIVE_VALUE_PROVIDER_ADAPTER_PARENT_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ModelGenSettings.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ModelGenSettings"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ModelGenSettings)object).getPropertyEditorClass();
		return label == null || label.length() == 0 ?
			getString("_UI_ModelGenSettings_type") :
			getString("_UI_ModelGenSettings_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ModelGenSettings.class)) {
			case MetamodelPackage.MODEL_GEN_SETTINGS__PROPERTY_EDITOR_CLASS:
			case MetamodelPackage.MODEL_GEN_SETTINGS__PROPERTY_EDITOR_PARENT_CLASS:
			case MetamodelPackage.MODEL_GEN_SETTINGS__STRING_PROVIDER_ADAPTER_CLASS:
			case MetamodelPackage.MODEL_GEN_SETTINGS__STRING_PROVIDER_ADAPTER_PARENT_CLASS:
			case MetamodelPackage.MODEL_GEN_SETTINGS__LABEL_RELATIVE_VALUE_PROVIDER_ADAPTER_CLASS:
			case MetamodelPackage.MODEL_GEN_SETTINGS__LABEL_RELATIVE_VALUE_PROVIDER_ADAPTER_PARENT_CLASS:
			case MetamodelPackage.MODEL_GEN_SETTINGS__LABEL_VALUE_RELATIVE_VALUE_PROVIDER_ADAPTER_CLASS:
			case MetamodelPackage.MODEL_GEN_SETTINGS__LABEL_VALUE_RELATIVE_VALUE_PROVIDER_ADAPTER_PARENT_CLASS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MetamodelEditPlugin.INSTANCE;
	}

}
