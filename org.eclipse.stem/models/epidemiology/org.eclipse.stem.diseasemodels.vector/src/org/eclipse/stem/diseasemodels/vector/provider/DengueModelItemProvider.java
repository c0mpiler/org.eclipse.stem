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
import org.eclipse.stem.diseasemodels.vector.DengueModel;
import org.eclipse.stem.diseasemodels.vector.VectorPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.stem.diseasemodels.vector.DengueModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DengueModelItemProvider
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
	public DengueModelItemProvider(AdapterFactory adapterFactory) {
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

			addBitingRateSVPropertyDescriptor(object);
			addBitingRateIVPropertyDescriptor(object);
			addHostInfectivity1PropertyDescriptor(object);
			addHostInfectivity2PropertyDescriptor(object);
			addHostInfectivity3PropertyDescriptor(object);
			addHostInfectivity4PropertyDescriptor(object);
			addHostPrimaryIncubationRate1PropertyDescriptor(object);
			addHostPrimaryIncubationRate2PropertyDescriptor(object);
			addHostPrimaryIncubationRate3PropertyDescriptor(object);
			addHostPrimaryIncubationRate4PropertyDescriptor(object);
			addHostPrimaryRecoveryRate1PropertyDescriptor(object);
			addHostPrimaryRecoveryRate2PropertyDescriptor(object);
			addHostPrimaryRecoveryRate3PropertyDescriptor(object);
			addHostPrimaryRecoveryRate4PropertyDescriptor(object);
			addHostPrimaryImmunityLossRate1PropertyDescriptor(object);
			addHostPrimaryImmunityLossRate2PropertyDescriptor(object);
			addHostPrimaryImmunityLossRate3PropertyDescriptor(object);
			addHostPrimaryImmunityLossRate4PropertyDescriptor(object);
			addHostPrimaryDiseaseDeathRate1PropertyDescriptor(object);
			addHostPrimaryDiseaseDeathRate2PropertyDescriptor(object);
			addHostPrimaryDiseaseDeathRate3PropertyDescriptor(object);
			addHostPrimaryDiseaseDeathRate4PropertyDescriptor(object);
			addHostADE12PropertyDescriptor(object);
			addHostADE13PropertyDescriptor(object);
			addHostADE14PropertyDescriptor(object);
			addHostADE21PropertyDescriptor(object);
			addHostADE23PropertyDescriptor(object);
			addHostADE24PropertyDescriptor(object);
			addHostADE31PropertyDescriptor(object);
			addHostADE32PropertyDescriptor(object);
			addHostADE34PropertyDescriptor(object);
			addHostADE41PropertyDescriptor(object);
			addHostADE42PropertyDescriptor(object);
			addHostADE43PropertyDescriptor(object);
			addHostSecondaryDiseaseDeathRate12PropertyDescriptor(object);
			addHostSecondaryDiseaseDeathRate13PropertyDescriptor(object);
			addHostSecondaryDiseaseDeathRate14PropertyDescriptor(object);
			addHostSecondaryDiseaseDeathRate21PropertyDescriptor(object);
			addHostSecondaryDiseaseDeathRate23PropertyDescriptor(object);
			addHostSecondaryDiseaseDeathRate24PropertyDescriptor(object);
			addHostSecondaryDiseaseDeathRate31PropertyDescriptor(object);
			addHostSecondaryDiseaseDeathRate32PropertyDescriptor(object);
			addHostSecondaryDiseaseDeathRate34PropertyDescriptor(object);
			addHostSecondaryDiseaseDeathRate41PropertyDescriptor(object);
			addHostSecondaryDiseaseDeathRate42PropertyDescriptor(object);
			addHostSecondaryDiseaseDeathRate43PropertyDescriptor(object);
			addHostSecondaryRecoveryRate12PropertyDescriptor(object);
			addHostSecondaryRecoveryRate13PropertyDescriptor(object);
			addHostSecondaryRecoveryRate14PropertyDescriptor(object);
			addHostSecondaryRecoveryRate21PropertyDescriptor(object);
			addHostSecondaryRecoveryRate23PropertyDescriptor(object);
			addHostSecondaryRecoveryRate24PropertyDescriptor(object);
			addHostSecondaryRecoveryRate31PropertyDescriptor(object);
			addHostSecondaryRecoveryRate32PropertyDescriptor(object);
			addHostSecondaryRecoveryRate34PropertyDescriptor(object);
			addHostSecondaryRecoveryRate41PropertyDescriptor(object);
			addHostSecondaryRecoveryRate42PropertyDescriptor(object);
			addHostSecondaryRecoveryRate43PropertyDescriptor(object);
			addHostSecondaryIncubationRate12PropertyDescriptor(object);
			addHostSecondaryIncubationRate13PropertyDescriptor(object);
			addHostSecondaryIncubationRate14PropertyDescriptor(object);
			addHostSecondaryIncubationRate21PropertyDescriptor(object);
			addHostSecondaryIncubationRate23PropertyDescriptor(object);
			addHostSecondaryIncubationRate24PropertyDescriptor(object);
			addHostSecondaryIncubationRate31PropertyDescriptor(object);
			addHostSecondaryIncubationRate32PropertyDescriptor(object);
			addHostSecondaryIncubationRate34PropertyDescriptor(object);
			addHostSecondaryIncubationRate41PropertyDescriptor(object);
			addHostSecondaryIncubationRate42PropertyDescriptor(object);
			addHostSecondaryIncubationRate43PropertyDescriptor(object);
			addVectorInfectivity1PropertyDescriptor(object);
			addVectorInfectivity2PropertyDescriptor(object);
			addVectorInfectivity3PropertyDescriptor(object);
			addVectorInfectivity4PropertyDescriptor(object);
			addVectorADE1PropertyDescriptor(object);
			addVectorADE2PropertyDescriptor(object);
			addVectorADE3PropertyDescriptor(object);
			addVectorADE4PropertyDescriptor(object);
			addVectorIncubationRate1PropertyDescriptor(object);
			addVectorIncubationRate2PropertyDescriptor(object);
			addVectorIncubationRate3PropertyDescriptor(object);
			addVectorIncubationRate4PropertyDescriptor(object);
			addEpisilon1PropertyDescriptor(object);
			addEpisilon2PropertyDescriptor(object);
			addEpisilon3PropertyDescriptor(object);
			addEpisilon4PropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Biting Rate SV feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBitingRateSVPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_bitingRateSV_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_bitingRateSV_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__BITING_RATE_SV,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Biting Rate IV feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBitingRateIVPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_bitingRateIV_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_bitingRateIV_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__BITING_RATE_IV,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Infectivity1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostInfectivity1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostInfectivity1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostInfectivity1_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_INFECTIVITY1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Infectivity2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostInfectivity2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostInfectivity2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostInfectivity2_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_INFECTIVITY2,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Infectivity3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostInfectivity3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostInfectivity3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostInfectivity3_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_INFECTIVITY3,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Infectivity4 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostInfectivity4PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostInfectivity4_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostInfectivity4_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_INFECTIVITY4,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Primary Incubation Rate1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostPrimaryIncubationRate1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostPrimaryIncubationRate1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostPrimaryIncubationRate1_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Primary Incubation Rate2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostPrimaryIncubationRate2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostPrimaryIncubationRate2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostPrimaryIncubationRate2_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE2,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Primary Incubation Rate3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostPrimaryIncubationRate3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostPrimaryIncubationRate3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostPrimaryIncubationRate3_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE3,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Primary Incubation Rate4 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostPrimaryIncubationRate4PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostPrimaryIncubationRate4_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostPrimaryIncubationRate4_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE4,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Primary Recovery Rate1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostPrimaryRecoveryRate1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostPrimaryRecoveryRate1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostPrimaryRecoveryRate1_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Primary Recovery Rate2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostPrimaryRecoveryRate2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostPrimaryRecoveryRate2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostPrimaryRecoveryRate2_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE2,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Primary Recovery Rate3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostPrimaryRecoveryRate3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostPrimaryRecoveryRate3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostPrimaryRecoveryRate3_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE3,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Primary Recovery Rate4 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostPrimaryRecoveryRate4PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostPrimaryRecoveryRate4_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostPrimaryRecoveryRate4_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE4,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Primary Immunity Loss Rate1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostPrimaryImmunityLossRate1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostPrimaryImmunityLossRate1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostPrimaryImmunityLossRate1_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Primary Immunity Loss Rate2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostPrimaryImmunityLossRate2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostPrimaryImmunityLossRate2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostPrimaryImmunityLossRate2_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE2,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Primary Immunity Loss Rate3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostPrimaryImmunityLossRate3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostPrimaryImmunityLossRate3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostPrimaryImmunityLossRate3_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE3,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Primary Immunity Loss Rate4 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostPrimaryImmunityLossRate4PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostPrimaryImmunityLossRate4_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostPrimaryImmunityLossRate4_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE4,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Primary Disease Death Rate1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostPrimaryDiseaseDeathRate1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostPrimaryDiseaseDeathRate1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostPrimaryDiseaseDeathRate1_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Primary Disease Death Rate2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostPrimaryDiseaseDeathRate2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostPrimaryDiseaseDeathRate2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostPrimaryDiseaseDeathRate2_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE2,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Primary Disease Death Rate3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostPrimaryDiseaseDeathRate3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostPrimaryDiseaseDeathRate3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostPrimaryDiseaseDeathRate3_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE3,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Primary Disease Death Rate4 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostPrimaryDiseaseDeathRate4PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostPrimaryDiseaseDeathRate4_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostPrimaryDiseaseDeathRate4_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE4,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host ADE12 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostADE12PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostADE12_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostADE12_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_ADE12,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host ADE13 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostADE13PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostADE13_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostADE13_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_ADE13,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host ADE14 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostADE14PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostADE14_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostADE14_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_ADE14,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host ADE21 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostADE21PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostADE21_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostADE21_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_ADE21,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host ADE23 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostADE23PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostADE23_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostADE23_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_ADE23,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host ADE24 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostADE24PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostADE24_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostADE24_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_ADE24,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host ADE31 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostADE31PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostADE31_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostADE31_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_ADE31,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host ADE32 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostADE32PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostADE32_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostADE32_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_ADE32,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host ADE34 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostADE34PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostADE34_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostADE34_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_ADE34,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host ADE41 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostADE41PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostADE41_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostADE41_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_ADE41,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host ADE42 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostADE42PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostADE42_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostADE42_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_ADE42,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host ADE43 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostADE43PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostADE43_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostADE43_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_ADE43,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Disease Death Rate12 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryDiseaseDeathRate12PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryDiseaseDeathRate12_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryDiseaseDeathRate12_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE12,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Disease Death Rate13 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryDiseaseDeathRate13PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryDiseaseDeathRate13_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryDiseaseDeathRate13_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE13,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Disease Death Rate14 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryDiseaseDeathRate14PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryDiseaseDeathRate14_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryDiseaseDeathRate14_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE14,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Disease Death Rate21 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryDiseaseDeathRate21PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryDiseaseDeathRate21_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryDiseaseDeathRate21_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE21,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Disease Death Rate23 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryDiseaseDeathRate23PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryDiseaseDeathRate23_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryDiseaseDeathRate23_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE23,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Disease Death Rate24 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryDiseaseDeathRate24PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryDiseaseDeathRate24_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryDiseaseDeathRate24_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE24,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Disease Death Rate31 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryDiseaseDeathRate31PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryDiseaseDeathRate31_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryDiseaseDeathRate31_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE31,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Disease Death Rate32 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryDiseaseDeathRate32PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryDiseaseDeathRate32_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryDiseaseDeathRate32_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE32,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Disease Death Rate34 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryDiseaseDeathRate34PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryDiseaseDeathRate34_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryDiseaseDeathRate34_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE34,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Disease Death Rate41 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryDiseaseDeathRate41PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryDiseaseDeathRate41_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryDiseaseDeathRate41_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE41,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Disease Death Rate42 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryDiseaseDeathRate42PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryDiseaseDeathRate42_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryDiseaseDeathRate42_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE42,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Disease Death Rate43 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryDiseaseDeathRate43PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryDiseaseDeathRate43_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryDiseaseDeathRate43_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE43,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Recovery Rate12 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryRecoveryRate12PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryRecoveryRate12_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryRecoveryRate12_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE12,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Recovery Rate13 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryRecoveryRate13PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryRecoveryRate13_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryRecoveryRate13_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE13,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Recovery Rate14 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryRecoveryRate14PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryRecoveryRate14_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryRecoveryRate14_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE14,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Recovery Rate21 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryRecoveryRate21PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryRecoveryRate21_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryRecoveryRate21_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE21,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Recovery Rate23 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryRecoveryRate23PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryRecoveryRate23_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryRecoveryRate23_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE23,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Recovery Rate24 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryRecoveryRate24PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryRecoveryRate24_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryRecoveryRate24_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE24,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Recovery Rate31 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryRecoveryRate31PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryRecoveryRate31_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryRecoveryRate31_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE31,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Recovery Rate32 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryRecoveryRate32PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryRecoveryRate32_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryRecoveryRate32_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE32,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Recovery Rate34 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryRecoveryRate34PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryRecoveryRate34_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryRecoveryRate34_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE34,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Recovery Rate41 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryRecoveryRate41PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryRecoveryRate41_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryRecoveryRate41_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE41,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Recovery Rate42 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryRecoveryRate42PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryRecoveryRate42_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryRecoveryRate42_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE42,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Recovery Rate43 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryRecoveryRate43PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryRecoveryRate43_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryRecoveryRate43_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE43,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Incubation Rate12 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryIncubationRate12PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryIncubationRate12_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryIncubationRate12_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE12,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Incubation Rate13 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryIncubationRate13PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryIncubationRate13_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryIncubationRate13_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE13,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Incubation Rate14 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryIncubationRate14PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryIncubationRate14_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryIncubationRate14_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE14,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Incubation Rate21 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryIncubationRate21PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryIncubationRate21_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryIncubationRate21_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE21,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Incubation Rate23 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryIncubationRate23PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryIncubationRate23_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryIncubationRate23_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE23,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Incubation Rate24 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryIncubationRate24PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryIncubationRate24_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryIncubationRate24_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE24,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Incubation Rate31 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryIncubationRate31PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryIncubationRate31_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryIncubationRate31_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE31,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Incubation Rate32 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryIncubationRate32PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryIncubationRate32_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryIncubationRate32_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE32,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Incubation Rate34 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryIncubationRate34PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryIncubationRate34_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryIncubationRate34_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE34,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Incubation Rate41 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryIncubationRate41PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryIncubationRate41_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryIncubationRate41_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE41,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Incubation Rate42 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryIncubationRate42PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryIncubationRate42_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryIncubationRate42_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE42,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Secondary Incubation Rate43 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostSecondaryIncubationRate43PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_hostSecondaryIncubationRate43_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_hostSecondaryIncubationRate43_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE43,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vector Infectivity1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVectorInfectivity1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_vectorInfectivity1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_vectorInfectivity1_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__VECTOR_INFECTIVITY1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vector Infectivity2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVectorInfectivity2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_vectorInfectivity2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_vectorInfectivity2_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__VECTOR_INFECTIVITY2,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vector Infectivity3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVectorInfectivity3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_vectorInfectivity3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_vectorInfectivity3_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__VECTOR_INFECTIVITY3,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vector Infectivity4 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVectorInfectivity4PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_vectorInfectivity4_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_vectorInfectivity4_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__VECTOR_INFECTIVITY4,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vector ADE1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVectorADE1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_vectorADE1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_vectorADE1_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__VECTOR_ADE1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vector ADE2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVectorADE2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_vectorADE2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_vectorADE2_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__VECTOR_ADE2,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vector ADE3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVectorADE3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_vectorADE3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_vectorADE3_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__VECTOR_ADE3,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vector ADE4 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVectorADE4PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_vectorADE4_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_vectorADE4_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__VECTOR_ADE4,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vector Incubation Rate1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVectorIncubationRate1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_vectorIncubationRate1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_vectorIncubationRate1_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__VECTOR_INCUBATION_RATE1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vector Incubation Rate2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVectorIncubationRate2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_vectorIncubationRate2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_vectorIncubationRate2_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__VECTOR_INCUBATION_RATE2,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vector Incubation Rate3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVectorIncubationRate3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_vectorIncubationRate3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_vectorIncubationRate3_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__VECTOR_INCUBATION_RATE3,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vector Incubation Rate4 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVectorIncubationRate4PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_vectorIncubationRate4_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_vectorIncubationRate4_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__VECTOR_INCUBATION_RATE4,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Episilon1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEpisilon1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_episilon1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_episilon1_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__EPISILON1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Episilon2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEpisilon2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_episilon2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_episilon2_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__EPISILON2,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Episilon3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEpisilon3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_episilon3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_episilon3_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__EPISILON3,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Episilon4 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEpisilon4PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DengueModel_episilon4_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DengueModel_episilon4_feature", "_UI_DengueModel_type"),
				 VectorPackage.Literals.DENGUE_MODEL__EPISILON4,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns DengueModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
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

		switch (notification.getFeatureID(DengueModel.class)) {
			case VectorPackage.DENGUE_MODEL__BITING_RATE_SV:
			case VectorPackage.DENGUE_MODEL__BITING_RATE_IV:
			case VectorPackage.DENGUE_MODEL__HOST_INFECTIVITY1:
			case VectorPackage.DENGUE_MODEL__HOST_INFECTIVITY2:
			case VectorPackage.DENGUE_MODEL__HOST_INFECTIVITY3:
			case VectorPackage.DENGUE_MODEL__HOST_INFECTIVITY4:
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE1:
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE2:
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE3:
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE4:
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE1:
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE2:
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE3:
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE4:
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE1:
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE2:
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE3:
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE4:
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE1:
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE2:
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE3:
			case VectorPackage.DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE4:
			case VectorPackage.DENGUE_MODEL__HOST_ADE12:
			case VectorPackage.DENGUE_MODEL__HOST_ADE13:
			case VectorPackage.DENGUE_MODEL__HOST_ADE14:
			case VectorPackage.DENGUE_MODEL__HOST_ADE21:
			case VectorPackage.DENGUE_MODEL__HOST_ADE23:
			case VectorPackage.DENGUE_MODEL__HOST_ADE24:
			case VectorPackage.DENGUE_MODEL__HOST_ADE31:
			case VectorPackage.DENGUE_MODEL__HOST_ADE32:
			case VectorPackage.DENGUE_MODEL__HOST_ADE34:
			case VectorPackage.DENGUE_MODEL__HOST_ADE41:
			case VectorPackage.DENGUE_MODEL__HOST_ADE42:
			case VectorPackage.DENGUE_MODEL__HOST_ADE43:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE12:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE13:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE14:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE21:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE23:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE24:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE31:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE32:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE34:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE41:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE42:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE43:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE12:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE13:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE14:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE21:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE23:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE24:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE31:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE32:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE34:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE41:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE42:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE43:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE12:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE13:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE14:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE21:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE23:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE24:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE31:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE32:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE34:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE41:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE42:
			case VectorPackage.DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE43:
			case VectorPackage.DENGUE_MODEL__VECTOR_INFECTIVITY1:
			case VectorPackage.DENGUE_MODEL__VECTOR_INFECTIVITY2:
			case VectorPackage.DENGUE_MODEL__VECTOR_INFECTIVITY3:
			case VectorPackage.DENGUE_MODEL__VECTOR_INFECTIVITY4:
			case VectorPackage.DENGUE_MODEL__VECTOR_ADE1:
			case VectorPackage.DENGUE_MODEL__VECTOR_ADE2:
			case VectorPackage.DENGUE_MODEL__VECTOR_ADE3:
			case VectorPackage.DENGUE_MODEL__VECTOR_ADE4:
			case VectorPackage.DENGUE_MODEL__VECTOR_INCUBATION_RATE1:
			case VectorPackage.DENGUE_MODEL__VECTOR_INCUBATION_RATE2:
			case VectorPackage.DENGUE_MODEL__VECTOR_INCUBATION_RATE3:
			case VectorPackage.DENGUE_MODEL__VECTOR_INCUBATION_RATE4:
			case VectorPackage.DENGUE_MODEL__EPISILON1:
			case VectorPackage.DENGUE_MODEL__EPISILON2:
			case VectorPackage.DENGUE_MODEL__EPISILON3:
			case VectorPackage.DENGUE_MODEL__EPISILON4:
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
