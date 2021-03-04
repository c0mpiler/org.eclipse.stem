package org.eclipse.stem.diseasemodels.avianinfluenza.provider;

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
import org.eclipse.stem.diseasemodels.avianinfluenza.AvianinfluenzaPackage;
import org.eclipse.stem.diseasemodels.avianinfluenza.H7N9;
import org.eclipse.stem.diseasemodels.vector.provider.VectorDiseaseModelItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.stem.diseasemodels.avianinfluenza.H7N9} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class H7N9ItemProvider
	extends VectorDiseaseModelItemProvider
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
	public H7N9ItemProvider(AdapterFactory adapterFactory) {
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

			addAvianToAvianTransmissionRatePropertyDescriptor(object);
			addAvianRecoveryRatePropertyDescriptor(object);
			addAvianToHumanTransmissionRatePropertyDescriptor(object);
			addHumanToHumanTransmissionRatePropertyDescriptor(object);
			addAvianCharacteristicMixingDistancePropertyDescriptor(object);
			addHumanRecoveryRatePropertyDescriptor(object);
			addHumanImmunityLossRatePropertyDescriptor(object);
			addTemperatureFactorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Avian To Avian Transmission Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAvianToAvianTransmissionRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_H7N9_avianToAvianTransmissionRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_H7N9_avianToAvianTransmissionRate_feature", "_UI_H7N9_type"),
				 AvianinfluenzaPackage.Literals.H7N9__AVIAN_TO_AVIAN_TRANSMISSION_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Avian Recovery Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAvianRecoveryRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_H7N9_avianRecoveryRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_H7N9_avianRecoveryRate_feature", "_UI_H7N9_type"),
				 AvianinfluenzaPackage.Literals.H7N9__AVIAN_RECOVERY_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Avian To Human Transmission Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAvianToHumanTransmissionRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_H7N9_avianToHumanTransmissionRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_H7N9_avianToHumanTransmissionRate_feature", "_UI_H7N9_type"),
				 AvianinfluenzaPackage.Literals.H7N9__AVIAN_TO_HUMAN_TRANSMISSION_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Human To Human Transmission Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHumanToHumanTransmissionRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_H7N9_humanToHumanTransmissionRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_H7N9_humanToHumanTransmissionRate_feature", "_UI_H7N9_type"),
				 AvianinfluenzaPackage.Literals.H7N9__HUMAN_TO_HUMAN_TRANSMISSION_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Avian Characteristic Mixing Distance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAvianCharacteristicMixingDistancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_H7N9_avianCharacteristicMixingDistance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_H7N9_avianCharacteristicMixingDistance_feature", "_UI_H7N9_type"),
				 AvianinfluenzaPackage.Literals.H7N9__AVIAN_CHARACTERISTIC_MIXING_DISTANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Human Recovery Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHumanRecoveryRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_H7N9_humanRecoveryRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_H7N9_humanRecoveryRate_feature", "_UI_H7N9_type"),
				 AvianinfluenzaPackage.Literals.H7N9__HUMAN_RECOVERY_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Human Immunity Loss Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHumanImmunityLossRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_H7N9_humanImmunityLossRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_H7N9_humanImmunityLossRate_feature", "_UI_H7N9_type"),
				 AvianinfluenzaPackage.Literals.H7N9__HUMAN_IMMUNITY_LOSS_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Temperature Factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTemperatureFactorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_H7N9_temperatureFactor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_H7N9_temperatureFactor_feature", "_UI_H7N9_type"),
				 AvianinfluenzaPackage.Literals.H7N9__TEMPERATURE_FACTOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
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

		switch (notification.getFeatureID(H7N9.class)) {
			case AvianinfluenzaPackage.H7N9__AVIAN_TO_AVIAN_TRANSMISSION_RATE:
			case AvianinfluenzaPackage.H7N9__AVIAN_RECOVERY_RATE:
			case AvianinfluenzaPackage.H7N9__AVIAN_TO_HUMAN_TRANSMISSION_RATE:
			case AvianinfluenzaPackage.H7N9__HUMAN_TO_HUMAN_TRANSMISSION_RATE:
			case AvianinfluenzaPackage.H7N9__AVIAN_CHARACTERISTIC_MIXING_DISTANCE:
			case AvianinfluenzaPackage.H7N9__HUMAN_RECOVERY_RATE:
			case AvianinfluenzaPackage.H7N9__HUMAN_IMMUNITY_LOSS_RATE:
			case AvianinfluenzaPackage.H7N9__TEMPERATURE_FACTOR:
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
		return AvianinfluenzaEditPlugin.INSTANCE;
	}

}
