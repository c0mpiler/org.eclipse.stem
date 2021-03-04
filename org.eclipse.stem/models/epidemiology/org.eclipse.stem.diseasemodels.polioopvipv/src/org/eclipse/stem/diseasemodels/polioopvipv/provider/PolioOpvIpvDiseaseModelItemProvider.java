/**
 * <copyright>
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
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.stem.diseasemodels.polioopvipv.provider;


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
import org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel;
import org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage;
import org.eclipse.stem.diseasemodels.standard.provider.SEIRItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PolioOpvIpvDiseaseModelItemProvider
	extends SEIRItemProvider
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
	public PolioOpvIpvDiseaseModelItemProvider(AdapterFactory adapterFactory) {
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

			addOpvEfficacyPropertyDescriptor(object);
			addReversionRateOPVPropertyDescriptor(object);
			addBirthDeathRateDevelopingPropertyDescriptor(object);
			addTransmissionRateOPVPropertyDescriptor(object);
			addTransmissionRateWildPropertyDescriptor(object);
			addRelativeSusceptibilityRecentOPVPropertyDescriptor(object);
			addRelativeSusceptibilityIPVPropertyDescriptor(object);
			addIncubationRateVaccinePropertyDescriptor(object);
			addIncubationRateWildPropertyDescriptor(object);
			addRecoveryRateVaccinePropertyDescriptor(object);
			addRecoveryRateWildPropertyDescriptor(object);
			addParalyticIncidenceFromVaccinePropertyDescriptor(object);
			addParalyticCaseProportionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Opv Efficacy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOpvEfficacyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolioOpvIpvDiseaseModel_opvEfficacy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolioOpvIpvDiseaseModel_opvEfficacy_feature", "_UI_PolioOpvIpvDiseaseModel_type"),
				 PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__OPV_EFFICACY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reversion Rate OPV feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReversionRateOPVPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolioOpvIpvDiseaseModel_reversionRateOPV_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolioOpvIpvDiseaseModel_reversionRateOPV_feature", "_UI_PolioOpvIpvDiseaseModel_type"),
				 PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__REVERSION_RATE_OPV,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Birth Death Rate Developing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBirthDeathRateDevelopingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolioOpvIpvDiseaseModel_birthDeathRateDeveloping_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolioOpvIpvDiseaseModel_birthDeathRateDeveloping_feature", "_UI_PolioOpvIpvDiseaseModel_type"),
				 PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__BIRTH_DEATH_RATE_DEVELOPING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transmission Rate OPV feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransmissionRateOPVPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolioOpvIpvDiseaseModel_transmissionRateOPV_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolioOpvIpvDiseaseModel_transmissionRateOPV_feature", "_UI_PolioOpvIpvDiseaseModel_type"),
				 PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__TRANSMISSION_RATE_OPV,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transmission Rate Wild feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransmissionRateWildPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolioOpvIpvDiseaseModel_transmissionRateWild_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolioOpvIpvDiseaseModel_transmissionRateWild_feature", "_UI_PolioOpvIpvDiseaseModel_type"),
				 PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__TRANSMISSION_RATE_WILD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Relative Susceptibility Recent OPV feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelativeSusceptibilityRecentOPVPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolioOpvIpvDiseaseModel_relativeSusceptibilityRecentOPV_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolioOpvIpvDiseaseModel_relativeSusceptibilityRecentOPV_feature", "_UI_PolioOpvIpvDiseaseModel_type"),
				 PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__RELATIVE_SUSCEPTIBILITY_RECENT_OPV,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Relative Susceptibility IPV feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelativeSusceptibilityIPVPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolioOpvIpvDiseaseModel_relativeSusceptibilityIPV_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolioOpvIpvDiseaseModel_relativeSusceptibilityIPV_feature", "_UI_PolioOpvIpvDiseaseModel_type"),
				 PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__RELATIVE_SUSCEPTIBILITY_IPV,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incubation Rate Vaccine feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncubationRateVaccinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolioOpvIpvDiseaseModel_incubationRateVaccine_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolioOpvIpvDiseaseModel_incubationRateVaccine_feature", "_UI_PolioOpvIpvDiseaseModel_type"),
				 PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__INCUBATION_RATE_VACCINE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incubation Rate Wild feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncubationRateWildPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolioOpvIpvDiseaseModel_incubationRateWild_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolioOpvIpvDiseaseModel_incubationRateWild_feature", "_UI_PolioOpvIpvDiseaseModel_type"),
				 PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__INCUBATION_RATE_WILD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Recovery Rate Vaccine feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecoveryRateVaccinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolioOpvIpvDiseaseModel_recoveryRateVaccine_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolioOpvIpvDiseaseModel_recoveryRateVaccine_feature", "_UI_PolioOpvIpvDiseaseModel_type"),
				 PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__RECOVERY_RATE_VACCINE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Recovery Rate Wild feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecoveryRateWildPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolioOpvIpvDiseaseModel_recoveryRateWild_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolioOpvIpvDiseaseModel_recoveryRateWild_feature", "_UI_PolioOpvIpvDiseaseModel_type"),
				 PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__RECOVERY_RATE_WILD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Paralytic Incidence From Vaccine feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParalyticIncidenceFromVaccinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolioOpvIpvDiseaseModel_paralyticIncidenceFromVaccine_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolioOpvIpvDiseaseModel_paralyticIncidenceFromVaccine_feature", "_UI_PolioOpvIpvDiseaseModel_type"),
				 PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__PARALYTIC_INCIDENCE_FROM_VACCINE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Paralytic Case Proportion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParalyticCaseProportionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolioOpvIpvDiseaseModel_paralyticCaseProportion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolioOpvIpvDiseaseModel_paralyticCaseProportion_feature", "_UI_PolioOpvIpvDiseaseModel_type"),
				 PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__PARALYTIC_CASE_PROPORTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns PolioOpvIpvDiseaseModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PolioOpvIpvDiseaseModel"));
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

		switch (notification.getFeatureID(PolioOpvIpvDiseaseModel.class)) {
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__OPV_EFFICACY:
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__REVERSION_RATE_OPV:
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__BIRTH_DEATH_RATE_DEVELOPING:
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__TRANSMISSION_RATE_OPV:
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__TRANSMISSION_RATE_WILD:
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__RELATIVE_SUSCEPTIBILITY_RECENT_OPV:
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__RELATIVE_SUSCEPTIBILITY_IPV:
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__INCUBATION_RATE_VACCINE:
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__INCUBATION_RATE_WILD:
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__RECOVERY_RATE_VACCINE:
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__RECOVERY_RATE_WILD:
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__PARALYTIC_INCIDENCE_FROM_VACCINE:
			case PolioOpvIpvPackage.POLIO_OPV_IPV_DISEASE_MODEL__PARALYTIC_CASE_PROPORTION:
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
		return PolioOpvIpvEditPlugin.INSTANCE;
	}

}
