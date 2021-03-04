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
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.stem.diseasemodels.standard.provider.StandardDiseaseModelLabelValueItemProvider;
import org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue;
import org.eclipse.stem.diseasemodels.vector.VectorPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DengueModelVectorLabelValueItemProvider
	extends StandardDiseaseModelLabelValueItemProvider
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
	public DengueModelVectorLabelValueItemProvider(AdapterFactory adapterFactory) {
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
			addI1PropertyDescriptor(object);
			addI2PropertyDescriptor(object);
			addI3PropertyDescriptor(object);
			addI4PropertyDescriptor(object);
			addIncidence1PropertyDescriptor(object);
			addIncidence2PropertyDescriptor(object);
			addIncidence3PropertyDescriptor(object);
			addIncidence4PropertyDescriptor(object);
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
				 getString("_UI_DengueModelVectorLabelValue_E1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModelVectorLabelValue_E1_feature", "_UI_DengueModelVectorLabelValue_type"),
				 VectorPackage.Literals.DENGUE_MODEL_VECTOR_LABEL_VALUE__E1,
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
				 getString("_UI_DengueModelVectorLabelValue_E2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModelVectorLabelValue_E2_feature", "_UI_DengueModelVectorLabelValue_type"),
				 VectorPackage.Literals.DENGUE_MODEL_VECTOR_LABEL_VALUE__E2,
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
				 getString("_UI_DengueModelVectorLabelValue_E3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModelVectorLabelValue_E3_feature", "_UI_DengueModelVectorLabelValue_type"),
				 VectorPackage.Literals.DENGUE_MODEL_VECTOR_LABEL_VALUE__E3,
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
				 getString("_UI_DengueModelVectorLabelValue_E4_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModelVectorLabelValue_E4_feature", "_UI_DengueModelVectorLabelValue_type"),
				 VectorPackage.Literals.DENGUE_MODEL_VECTOR_LABEL_VALUE__E4,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the I1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addI1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModelVectorLabelValue_I1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModelVectorLabelValue_I1_feature", "_UI_DengueModelVectorLabelValue_type"),
				 VectorPackage.Literals.DENGUE_MODEL_VECTOR_LABEL_VALUE__I1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the I2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addI2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModelVectorLabelValue_I2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModelVectorLabelValue_I2_feature", "_UI_DengueModelVectorLabelValue_type"),
				 VectorPackage.Literals.DENGUE_MODEL_VECTOR_LABEL_VALUE__I2,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the I3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addI3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModelVectorLabelValue_I3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModelVectorLabelValue_I3_feature", "_UI_DengueModelVectorLabelValue_type"),
				 VectorPackage.Literals.DENGUE_MODEL_VECTOR_LABEL_VALUE__I3,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the I4 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addI4PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModelVectorLabelValue_I4_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModelVectorLabelValue_I4_feature", "_UI_DengueModelVectorLabelValue_type"),
				 VectorPackage.Literals.DENGUE_MODEL_VECTOR_LABEL_VALUE__I4,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incidence1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncidence1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModelVectorLabelValue_incidence1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModelVectorLabelValue_incidence1_feature", "_UI_DengueModelVectorLabelValue_type"),
				 VectorPackage.Literals.DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incidence2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncidence2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModelVectorLabelValue_incidence2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModelVectorLabelValue_incidence2_feature", "_UI_DengueModelVectorLabelValue_type"),
				 VectorPackage.Literals.DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE2,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incidence3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncidence3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModelVectorLabelValue_incidence3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModelVectorLabelValue_incidence3_feature", "_UI_DengueModelVectorLabelValue_type"),
				 VectorPackage.Literals.DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE3,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incidence4 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncidence4PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModelVectorLabelValue_incidence4_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModelVectorLabelValue_incidence4_feature", "_UI_DengueModelVectorLabelValue_type"),
				 VectorPackage.Literals.DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE4,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns DengueModelVectorLabelValue.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DengueModelVectorLabelValue"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		DengueModelVectorLabelValue dengueModelVectorLabelValue = (DengueModelVectorLabelValue)object;
		return getString("_UI_DengueModelVectorLabelValue_type") + " " + dengueModelVectorLabelValue.getPopulationCount();
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return VectorEditPlugin.INSTANCE;
	}

}
