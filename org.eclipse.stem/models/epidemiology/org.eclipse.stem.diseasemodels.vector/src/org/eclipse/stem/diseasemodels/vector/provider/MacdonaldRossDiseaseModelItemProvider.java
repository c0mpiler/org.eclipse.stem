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
import org.eclipse.stem.diseasemodels.vector.MacdonaldRossDiseaseModel;
import org.eclipse.stem.diseasemodels.vector.VectorPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.stem.diseasemodels.vector.MacdonaldRossDiseaseModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MacdonaldRossDiseaseModelItemProvider
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
	public MacdonaldRossDiseaseModelItemProvider(AdapterFactory adapterFactory) {
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

			addBitingRatePropertyDescriptor(object);
			addInfectiousBitingProportionHumanPropertyDescriptor(object);
			addInfectiousBitingProportionVectorPropertyDescriptor(object);
			addRecoveryRatePropertyDescriptor(object);
			addIncubationRatePropertyDescriptor(object);
			addVectorIncubationRatePropertyDescriptor(object);
			addImmunityLossRatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Biting Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBitingRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MacdonaldRossDiseaseModel_bitingRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MacdonaldRossDiseaseModel_bitingRate_feature", "_UI_MacdonaldRossDiseaseModel_type"),
				 VectorPackage.Literals.MACDONALD_ROSS_DISEASE_MODEL__BITING_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Infectious Biting Proportion Human feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInfectiousBitingProportionHumanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MacdonaldRossDiseaseModel_infectiousBitingProportionHuman_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MacdonaldRossDiseaseModel_infectiousBitingProportionHuman_feature", "_UI_MacdonaldRossDiseaseModel_type"),
				 VectorPackage.Literals.MACDONALD_ROSS_DISEASE_MODEL__INFECTIOUS_BITING_PROPORTION_HUMAN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Infectious Biting Proportion Vector feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInfectiousBitingProportionVectorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MacdonaldRossDiseaseModel_infectiousBitingProportionVector_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MacdonaldRossDiseaseModel_infectiousBitingProportionVector_feature", "_UI_MacdonaldRossDiseaseModel_type"),
				 VectorPackage.Literals.MACDONALD_ROSS_DISEASE_MODEL__INFECTIOUS_BITING_PROPORTION_VECTOR,
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
				 getString("_UI_MacdonaldRossDiseaseModel_recoveryRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MacdonaldRossDiseaseModel_recoveryRate_feature", "_UI_MacdonaldRossDiseaseModel_type"),
				 VectorPackage.Literals.MACDONALD_ROSS_DISEASE_MODEL__RECOVERY_RATE,
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
				 getString("_UI_MacdonaldRossDiseaseModel_incubationRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MacdonaldRossDiseaseModel_incubationRate_feature", "_UI_MacdonaldRossDiseaseModel_type"),
				 VectorPackage.Literals.MACDONALD_ROSS_DISEASE_MODEL__INCUBATION_RATE,
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
				 getString("_UI_MacdonaldRossDiseaseModel_vectorIncubationRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MacdonaldRossDiseaseModel_vectorIncubationRate_feature", "_UI_MacdonaldRossDiseaseModel_type"),
				 VectorPackage.Literals.MACDONALD_ROSS_DISEASE_MODEL__VECTOR_INCUBATION_RATE,
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
				 getString("_UI_MacdonaldRossDiseaseModel_immunityLossRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MacdonaldRossDiseaseModel_immunityLossRate_feature", "_UI_MacdonaldRossDiseaseModel_type"),
				 VectorPackage.Literals.MACDONALD_ROSS_DISEASE_MODEL__IMMUNITY_LOSS_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns MacdonaldRossDiseaseModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/custom16/MacdonaldRossDiseaseModel"));
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

		switch (notification.getFeatureID(MacdonaldRossDiseaseModel.class)) {
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__BITING_RATE:
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__INFECTIOUS_BITING_PROPORTION_HUMAN:
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__INFECTIOUS_BITING_PROPORTION_VECTOR:
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__RECOVERY_RATE:
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__INCUBATION_RATE:
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__VECTOR_INCUBATION_RATE:
			case VectorPackage.MACDONALD_ROSS_DISEASE_MODEL__IMMUNITY_LOSS_RATE:
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
