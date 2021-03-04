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
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.stem.diseasemodels.vector.SimpleDengueModel;
import org.eclipse.stem.diseasemodels.vector.VectorPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleDengueModelItemProvider
	extends AbstractDengueModelItemProvider
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
	public SimpleDengueModelItemProvider(AdapterFactory adapterFactory) {
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

			addHostTransmissionRatePropertyDescriptor(object);
			addAdeFactorPropertyDescriptor(object);
			addHostImmunityLossRatePropertyDescriptor(object);
			addHostPrimaryDeathRatePropertyDescriptor(object);
			addHostRecoveryRatePropertyDescriptor(object);
			addHostSecondaryDeathRatePropertyDescriptor(object);
			addVectorIncubationRatePropertyDescriptor(object);
			addVectorTransmissionRatePropertyDescriptor(object);
			addImmunityStrengthPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Host Transmission Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostTransmissionRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModel_hostTransmissionRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModel_hostTransmissionRate_feature", "_UI_SimpleDengueModel_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL__HOST_TRANSMISSION_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ade Factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdeFactorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModel_adeFactor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModel_adeFactor_feature", "_UI_SimpleDengueModel_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL__ADE_FACTOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Immunity Loss Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostImmunityLossRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModel_hostImmunityLossRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModel_hostImmunityLossRate_feature", "_UI_SimpleDengueModel_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL__HOST_IMMUNITY_LOSS_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Primary Death Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostPrimaryDeathRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModel_hostPrimaryDeathRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModel_hostPrimaryDeathRate_feature", "_UI_SimpleDengueModel_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL__HOST_PRIMARY_DEATH_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Recovery Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostRecoveryRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModel_hostRecoveryRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModel_hostRecoveryRate_feature", "_UI_SimpleDengueModel_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL__HOST_RECOVERY_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Death Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryDeathRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModel_hostSecondaryDeathRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModel_hostSecondaryDeathRate_feature", "_UI_SimpleDengueModel_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL__HOST_SECONDARY_DEATH_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vector Incubation Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVectorIncubationRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModel_vectorIncubationRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModel_vectorIncubationRate_feature", "_UI_SimpleDengueModel_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL__VECTOR_INCUBATION_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vector Transmission Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVectorTransmissionRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModel_vectorTransmissionRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModel_vectorTransmissionRate_feature", "_UI_SimpleDengueModel_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL__VECTOR_TRANSMISSION_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Immunity Strength feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImmunityStrengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModel_immunityStrength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModel_immunityStrength_feature", "_UI_SimpleDengueModel_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL__IMMUNITY_STRENGTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns SimpleDengueModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/custom16/DengueModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		return super.getText(object);
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

		switch (notification.getFeatureID(SimpleDengueModel.class)) {
			case VectorPackage.SIMPLE_DENGUE_MODEL__HOST_TRANSMISSION_RATE:
			case VectorPackage.SIMPLE_DENGUE_MODEL__ADE_FACTOR:
			case VectorPackage.SIMPLE_DENGUE_MODEL__HOST_IMMUNITY_LOSS_RATE:
			case VectorPackage.SIMPLE_DENGUE_MODEL__HOST_PRIMARY_DEATH_RATE:
			case VectorPackage.SIMPLE_DENGUE_MODEL__HOST_RECOVERY_RATE:
			case VectorPackage.SIMPLE_DENGUE_MODEL__HOST_SECONDARY_DEATH_RATE:
			case VectorPackage.SIMPLE_DENGUE_MODEL__VECTOR_INCUBATION_RATE:
			case VectorPackage.SIMPLE_DENGUE_MODEL__VECTOR_TRANSMISSION_RATE:
			case VectorPackage.SIMPLE_DENGUE_MODEL__IMMUNITY_STRENGTH:
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

}
