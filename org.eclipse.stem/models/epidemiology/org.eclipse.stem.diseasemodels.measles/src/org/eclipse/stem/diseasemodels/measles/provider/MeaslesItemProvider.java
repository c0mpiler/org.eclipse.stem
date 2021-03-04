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
package org.eclipse.stem.diseasemodels.measles.provider;


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
import org.eclipse.stem.core.common.CommonFactory;
import org.eclipse.stem.diseasemodels.measles.Measles;
import org.eclipse.stem.diseasemodels.measles.MeaslesPackage;
import org.eclipse.stem.diseasemodels.multipopulation.MultipopulationPackage;
import org.eclipse.stem.diseasemodels.multipopulation.provider.MultiPopulationSEIRDiseaseModelItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.stem.diseasemodels.measles.Measles} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MeaslesItemProvider
	extends MultiPopulationSEIRDiseaseModelItemProvider
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
	public MeaslesItemProvider(AdapterFactory adapterFactory) {
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

			addVaccineEfficacyPropertyDescriptor(object);
			addInoculationScalingPropertyDescriptor(object);
			addPhaseShiftPropertyDescriptor(object);
			addSeasonalModulationPropertyDescriptor(object);
			addSeasonalModulationPeriodPropertyDescriptor(object);
			addInoculatedImmunityRatePropertyDescriptor(object);
			addNewbornImmunityLossRatePropertyDescriptor(object);
			addTransmissionRateScalingPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Vaccine Efficacy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVaccineEfficacyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measles_vaccineEfficacy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Measles_vaccineEfficacy_feature", "_UI_Measles_type"),
				 MeaslesPackage.Literals.MEASLES__VACCINE_EFFICACY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inoculation Scaling feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInoculationScalingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measles_inoculationScaling_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Measles_inoculationScaling_feature", "_UI_Measles_type"),
				 MeaslesPackage.Literals.MEASLES__INOCULATION_SCALING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phase Shift feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhaseShiftPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measles_phaseShift_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Measles_phaseShift_feature", "_UI_Measles_type"),
				 MeaslesPackage.Literals.MEASLES__PHASE_SHIFT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Seasonal Modulation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSeasonalModulationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measles_seasonalModulation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Measles_seasonalModulation_feature", "_UI_Measles_type"),
				 MeaslesPackage.Literals.MEASLES__SEASONAL_MODULATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Seasonal Modulation Period feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSeasonalModulationPeriodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measles_seasonalModulationPeriod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Measles_seasonalModulationPeriod_feature", "_UI_Measles_type"),
				 MeaslesPackage.Literals.MEASLES__SEASONAL_MODULATION_PERIOD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inoculated Immunity Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInoculatedImmunityRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measles_inoculatedImmunityRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Measles_inoculatedImmunityRate_feature", "_UI_Measles_type"),
				 MeaslesPackage.Literals.MEASLES__INOCULATED_IMMUNITY_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Newborn Immunity Loss Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNewbornImmunityLossRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measles_newbornImmunityLossRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Measles_newbornImmunityLossRate_feature", "_UI_Measles_type"),
				 MeaslesPackage.Literals.MEASLES__NEWBORN_IMMUNITY_LOSS_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transmission Rate Scaling feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransmissionRateScalingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measles_transmissionRateScaling_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Measles_transmissionRateScaling_feature", "_UI_Measles_type"),
				 MeaslesPackage.Literals.MEASLES__TRANSMISSION_RATE_SCALING,
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

		switch (notification.getFeatureID(Measles.class)) {
			case MeaslesPackage.MEASLES__VACCINE_EFFICACY:
			case MeaslesPackage.MEASLES__INOCULATION_SCALING:
			case MeaslesPackage.MEASLES__PHASE_SHIFT:
			case MeaslesPackage.MEASLES__SEASONAL_MODULATION:
			case MeaslesPackage.MEASLES__SEASONAL_MODULATION_PERIOD:
			case MeaslesPackage.MEASLES__INOCULATED_IMMUNITY_RATE:
			case MeaslesPackage.MEASLES__NEWBORN_IMMUNITY_LOSS_RATE:
			case MeaslesPackage.MEASLES__TRANSMISSION_RATE_SCALING:
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

		newChildDescriptors.add
			(createChildParameter
				(MultipopulationPackage.Literals.MULTI_POPULATION_SI_DISEASE_MODEL__POPULATION_GROUPS,
				 CommonFactory.eINSTANCE.createStringValueList()));

		newChildDescriptors.add
			(createChildParameter
				(MultipopulationPackage.Literals.MULTI_POPULATION_SI_DISEASE_MODEL__TRANSMISSION_RATE,
				 CommonFactory.eINSTANCE.createDoubleValueMatrix()));

		newChildDescriptors.add
			(createChildParameter
				(MultipopulationPackage.Literals.MULTI_POPULATION_SI_DISEASE_MODEL__RECOVERY_RATE,
				 CommonFactory.eINSTANCE.createDoubleValueList()));

		newChildDescriptors.add
			(createChildParameter
				(MultipopulationPackage.Literals.MULTI_POPULATION_SI_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE,
				 CommonFactory.eINSTANCE.createDoubleValueList()));

		newChildDescriptors.add
			(createChildParameter
				(MultipopulationPackage.Literals.MULTI_POPULATION_SIR_DISEASE_MODEL__IMMUNITY_LOSS_RATE,
				 CommonFactory.eINSTANCE.createDoubleValueList()));

		newChildDescriptors.add
			(createChildParameter
				(MultipopulationPackage.Literals.MULTI_POPULATION_SEIR_DISEASE_MODEL__INCUBATION_RATE,
				 CommonFactory.eINSTANCE.createDoubleValueList()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == MultipopulationPackage.Literals.MULTI_POPULATION_SI_DISEASE_MODEL__RECOVERY_RATE ||
			childFeature == MultipopulationPackage.Literals.MULTI_POPULATION_SI_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE ||
			childFeature == MultipopulationPackage.Literals.MULTI_POPULATION_SIR_DISEASE_MODEL__IMMUNITY_LOSS_RATE ||
			childFeature == MultipopulationPackage.Literals.MULTI_POPULATION_SEIR_DISEASE_MODEL__INCUBATION_RATE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MeaslesEditPlugin.INSTANCE;
	}

}
