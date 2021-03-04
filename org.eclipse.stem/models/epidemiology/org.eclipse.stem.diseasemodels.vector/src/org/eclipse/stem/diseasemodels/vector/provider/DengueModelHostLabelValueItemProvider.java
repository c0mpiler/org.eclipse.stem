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
package org.eclipse.stem.diseasemodels.vector.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue;
import org.eclipse.stem.diseasemodels.vector.VectorPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DengueModelHostLabelValueItemProvider
	extends SimpleDengueModelHostLabelValueItemProvider
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
	public DengueModelHostLabelValueItemProvider(AdapterFactory adapterFactory) {
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

			addE1PropertyDescriptor(object);
			addE2PropertyDescriptor(object);
			addE3PropertyDescriptor(object);
			addE4PropertyDescriptor(object);
			addE12PropertyDescriptor(object);
			addE13PropertyDescriptor(object);
			addE14PropertyDescriptor(object);
			addE21PropertyDescriptor(object);
			addE23PropertyDescriptor(object);
			addE24PropertyDescriptor(object);
			addE31PropertyDescriptor(object);
			addE32PropertyDescriptor(object);
			addE34PropertyDescriptor(object);
			addE41PropertyDescriptor(object);
			addE42PropertyDescriptor(object);
			addE43PropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the E1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addE1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModelHostLabelValue_E1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModelHostLabelValue_E1_feature", "_UI_DengueModelHostLabelValue_type"),
				 VectorPackage.Literals.DENGUE_MODEL_HOST_LABEL_VALUE__E1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the E2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addE2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModelHostLabelValue_E2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModelHostLabelValue_E2_feature", "_UI_DengueModelHostLabelValue_type"),
				 VectorPackage.Literals.DENGUE_MODEL_HOST_LABEL_VALUE__E2,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the E3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addE3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModelHostLabelValue_E3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModelHostLabelValue_E3_feature", "_UI_DengueModelHostLabelValue_type"),
				 VectorPackage.Literals.DENGUE_MODEL_HOST_LABEL_VALUE__E3,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the E4 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addE4PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModelHostLabelValue_E4_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModelHostLabelValue_E4_feature", "_UI_DengueModelHostLabelValue_type"),
				 VectorPackage.Literals.DENGUE_MODEL_HOST_LABEL_VALUE__E4,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the E12 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addE12PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModelHostLabelValue_E12_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModelHostLabelValue_E12_feature", "_UI_DengueModelHostLabelValue_type"),
				 VectorPackage.Literals.DENGUE_MODEL_HOST_LABEL_VALUE__E12,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the E13 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addE13PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModelHostLabelValue_E13_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModelHostLabelValue_E13_feature", "_UI_DengueModelHostLabelValue_type"),
				 VectorPackage.Literals.DENGUE_MODEL_HOST_LABEL_VALUE__E13,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the E14 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addE14PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModelHostLabelValue_E14_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModelHostLabelValue_E14_feature", "_UI_DengueModelHostLabelValue_type"),
				 VectorPackage.Literals.DENGUE_MODEL_HOST_LABEL_VALUE__E14,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the E21 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addE21PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModelHostLabelValue_E21_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModelHostLabelValue_E21_feature", "_UI_DengueModelHostLabelValue_type"),
				 VectorPackage.Literals.DENGUE_MODEL_HOST_LABEL_VALUE__E21,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the E23 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addE23PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModelHostLabelValue_E23_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModelHostLabelValue_E23_feature", "_UI_DengueModelHostLabelValue_type"),
				 VectorPackage.Literals.DENGUE_MODEL_HOST_LABEL_VALUE__E23,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the E24 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addE24PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModelHostLabelValue_E24_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModelHostLabelValue_E24_feature", "_UI_DengueModelHostLabelValue_type"),
				 VectorPackage.Literals.DENGUE_MODEL_HOST_LABEL_VALUE__E24,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the E31 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addE31PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModelHostLabelValue_E31_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModelHostLabelValue_E31_feature", "_UI_DengueModelHostLabelValue_type"),
				 VectorPackage.Literals.DENGUE_MODEL_HOST_LABEL_VALUE__E31,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the E32 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addE32PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModelHostLabelValue_E32_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModelHostLabelValue_E32_feature", "_UI_DengueModelHostLabelValue_type"),
				 VectorPackage.Literals.DENGUE_MODEL_HOST_LABEL_VALUE__E32,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the E34 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addE34PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModelHostLabelValue_E34_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModelHostLabelValue_E34_feature", "_UI_DengueModelHostLabelValue_type"),
				 VectorPackage.Literals.DENGUE_MODEL_HOST_LABEL_VALUE__E34,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the E41 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addE41PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModelHostLabelValue_E41_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModelHostLabelValue_E41_feature", "_UI_DengueModelHostLabelValue_type"),
				 VectorPackage.Literals.DENGUE_MODEL_HOST_LABEL_VALUE__E41,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the E42 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addE42PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModelHostLabelValue_E42_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModelHostLabelValue_E42_feature", "_UI_DengueModelHostLabelValue_type"),
				 VectorPackage.Literals.DENGUE_MODEL_HOST_LABEL_VALUE__E42,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the E43 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addE43PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModelHostLabelValue_E43_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModelHostLabelValue_E43_feature", "_UI_DengueModelHostLabelValue_type"),
				 VectorPackage.Literals.DENGUE_MODEL_HOST_LABEL_VALUE__E43,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns DengueModelHostLabelValue.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DengueModelHostLabelValue"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		DengueModelHostLabelValue dengueModelHostLabelValue = (DengueModelHostLabelValue)object;
		return getString("_UI_DengueModelHostLabelValue_type") + " " + dengueModelHostLabelValue.getPopulationCount();
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

}
