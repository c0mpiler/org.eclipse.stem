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
package org.eclipse.stem.evolvingcrossspeciesmodel.provider;


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

import org.eclipse.stem.diseasemodels.evolving.provider.EvolvingSIRDiseaseModelItemProvider;

import org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel;
import org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EvolvingCrossSpeciesModelItemProvider
	extends EvolvingSIRDiseaseModelItemProvider
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
	public EvolvingCrossSpeciesModelItemProvider(AdapterFactory adapterFactory) {
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

			addOtherToOtherTransmissionRatePropertyDescriptor(object);
			addOtherRecoveryRatePropertyDescriptor(object);
			addOtherToHostTransmissionRatePropertyDescriptor(object);
			addTemperatureFactorPropertyDescriptor(object);
			addOtherPopulationIdentifierPropertyDescriptor(object);
			addOtherImmunityLossRatePropertyDescriptor(object);
			addIncubationRatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Other To Other Transmission Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOtherToOtherTransmissionRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EvolvingCrossSpeciesModel_otherToOtherTransmissionRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EvolvingCrossSpeciesModel_otherToOtherTransmissionRate_feature", "_UI_EvolvingCrossSpeciesModel_type"),
				 EvolvingCrossSpeciesModelPackage.Literals.EVOLVING_CROSS_SPECIES_MODEL__OTHER_TO_OTHER_TRANSMISSION_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Other Recovery Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOtherRecoveryRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EvolvingCrossSpeciesModel_otherRecoveryRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EvolvingCrossSpeciesModel_otherRecoveryRate_feature", "_UI_EvolvingCrossSpeciesModel_type"),
				 EvolvingCrossSpeciesModelPackage.Literals.EVOLVING_CROSS_SPECIES_MODEL__OTHER_RECOVERY_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Other To Host Transmission Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOtherToHostTransmissionRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EvolvingCrossSpeciesModel_otherToHostTransmissionRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EvolvingCrossSpeciesModel_otherToHostTransmissionRate_feature", "_UI_EvolvingCrossSpeciesModel_type"),
				 EvolvingCrossSpeciesModelPackage.Literals.EVOLVING_CROSS_SPECIES_MODEL__OTHER_TO_HOST_TRANSMISSION_RATE,
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
				 getString("_UI_EvolvingCrossSpeciesModel_temperatureFactor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EvolvingCrossSpeciesModel_temperatureFactor_feature", "_UI_EvolvingCrossSpeciesModel_type"),
				 EvolvingCrossSpeciesModelPackage.Literals.EVOLVING_CROSS_SPECIES_MODEL__TEMPERATURE_FACTOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Other Population Identifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOtherPopulationIdentifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EvolvingCrossSpeciesModel_otherPopulationIdentifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EvolvingCrossSpeciesModel_otherPopulationIdentifier_feature", "_UI_EvolvingCrossSpeciesModel_type"),
				 EvolvingCrossSpeciesModelPackage.Literals.EVOLVING_CROSS_SPECIES_MODEL__OTHER_POPULATION_IDENTIFIER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Other Immunity Loss Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOtherImmunityLossRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EvolvingCrossSpeciesModel_otherImmunityLossRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EvolvingCrossSpeciesModel_otherImmunityLossRate_feature", "_UI_EvolvingCrossSpeciesModel_type"),
				 EvolvingCrossSpeciesModelPackage.Literals.EVOLVING_CROSS_SPECIES_MODEL__OTHER_IMMUNITY_LOSS_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incubation Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncubationRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EvolvingCrossSpeciesModel_incubationRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EvolvingCrossSpeciesModel_incubationRate_feature", "_UI_EvolvingCrossSpeciesModel_type"),
				 EvolvingCrossSpeciesModelPackage.Literals.EVOLVING_CROSS_SPECIES_MODEL__INCUBATION_RATE,
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
	 * @generated
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

		switch (notification.getFeatureID(EvolvingCrossSpeciesModel.class)) {
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__OTHER_TO_OTHER_TRANSMISSION_RATE:
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__OTHER_RECOVERY_RATE:
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__OTHER_TO_HOST_TRANSMISSION_RATE:
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__TEMPERATURE_FACTOR:
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__OTHER_POPULATION_IDENTIFIER:
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__OTHER_IMMUNITY_LOSS_RATE:
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL__INCUBATION_RATE:
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
		return EvolvingCrossSpeciesModelEditPlugin.INSTANCE;
	}

}
