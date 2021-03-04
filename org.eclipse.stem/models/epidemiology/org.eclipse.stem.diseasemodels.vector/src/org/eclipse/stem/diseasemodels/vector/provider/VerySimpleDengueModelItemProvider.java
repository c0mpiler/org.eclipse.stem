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
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.stem.diseasemodels.standard.provider.StandardDiseaseModelItemProvider;
import org.eclipse.stem.diseasemodels.vector.VectorPackage;
import org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel;

/**
 * This is the item provider adapter for a {@link org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VerySimpleDengueModelItemProvider
	extends StandardDiseaseModelItemProvider
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
	public VerySimpleDengueModelItemProvider(AdapterFactory adapterFactory) {
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

			addTransmissionRatePropertyDescriptor(object);
			addRecoveryRatePropertyDescriptor(object);
			addImmunityLossRatePropertyDescriptor(object);
			addAdeFactorPropertyDescriptor(object);
			addImmunityStrengthPropertyDescriptor(object);
			addPrimaryDeathRatePropertyDescriptor(object);
			addSecondaryDeathRatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Transmission Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransmissionRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VerySimpleDengueModel_transmissionRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VerySimpleDengueModel_transmissionRate_feature", "_UI_VerySimpleDengueModel_type"),
				 VectorPackage.Literals.VERY_SIMPLE_DENGUE_MODEL__TRANSMISSION_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Recovery Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecoveryRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VerySimpleDengueModel_recoveryRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VerySimpleDengueModel_recoveryRate_feature", "_UI_VerySimpleDengueModel_type"),
				 VectorPackage.Literals.VERY_SIMPLE_DENGUE_MODEL__RECOVERY_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Immunity Loss Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImmunityLossRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VerySimpleDengueModel_immunityLossRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VerySimpleDengueModel_immunityLossRate_feature", "_UI_VerySimpleDengueModel_type"),
				 VectorPackage.Literals.VERY_SIMPLE_DENGUE_MODEL__IMMUNITY_LOSS_RATE,
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
				 getString("_UI_VerySimpleDengueModel_adeFactor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VerySimpleDengueModel_adeFactor_feature", "_UI_VerySimpleDengueModel_type"),
				 VectorPackage.Literals.VERY_SIMPLE_DENGUE_MODEL__ADE_FACTOR,
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
				 getString("_UI_VerySimpleDengueModel_immunityStrength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VerySimpleDengueModel_immunityStrength_feature", "_UI_VerySimpleDengueModel_type"),
				 VectorPackage.Literals.VERY_SIMPLE_DENGUE_MODEL__IMMUNITY_STRENGTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Primary Death Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrimaryDeathRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VerySimpleDengueModel_primaryDeathRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VerySimpleDengueModel_primaryDeathRate_feature", "_UI_VerySimpleDengueModel_type"),
				 VectorPackage.Literals.VERY_SIMPLE_DENGUE_MODEL__PRIMARY_DEATH_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Secondary Death Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecondaryDeathRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VerySimpleDengueModel_secondaryDeathRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VerySimpleDengueModel_secondaryDeathRate_feature", "_UI_VerySimpleDengueModel_type"),
				 VectorPackage.Literals.VERY_SIMPLE_DENGUE_MODEL__SECONDARY_DEATH_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns VerySimpleDengueModel.gif.
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

		switch (notification.getFeatureID(VerySimpleDengueModel.class)) {
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__TRANSMISSION_RATE:
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__RECOVERY_RATE:
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__IMMUNITY_LOSS_RATE:
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__ADE_FACTOR:
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__IMMUNITY_STRENGTH:
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__PRIMARY_DEATH_RATE:
			case VectorPackage.VERY_SIMPLE_DENGUE_MODEL__SECONDARY_DEATH_RATE:
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
		return VectorEditPlugin.INSTANCE;
	}

}
