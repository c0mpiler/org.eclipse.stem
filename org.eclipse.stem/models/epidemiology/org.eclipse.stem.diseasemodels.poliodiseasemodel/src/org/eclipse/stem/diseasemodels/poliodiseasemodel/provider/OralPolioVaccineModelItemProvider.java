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
package org.eclipse.stem.diseasemodels.poliodiseasemodel.provider;


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
import org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel;
import org.eclipse.stem.diseasemodels.poliodiseasemodel.PolioPackage;
import org.eclipse.stem.diseasemodels.standard.provider.SEIRItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OralPolioVaccineModelItemProvider
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
	public OralPolioVaccineModelItemProvider(AdapterFactory adapterFactory) {
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

			addEfficacyVaccinePropertyDescriptor(object);
			addReversionRatePropertyDescriptor(object);
			addPartialSusceptibilityVaccinePropertyDescriptor(object);
			addTransRateVaccinePropertyDescriptor(object);
			addIncubRateVaccinePropertyDescriptor(object);
			addInfectRecoveryRateVaccinePropertyDescriptor(object);
			addParalyticFractionVaccinePropertyDescriptor(object);
			addParalyticFractionWildPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Efficacy Vaccine feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEfficacyVaccinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OralPolioVaccineModel_efficacyVaccine_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_OralPolioVaccineModel_efficacyVaccine_feature", "_UI_OralPolioVaccineModel_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 PolioPackage.Literals.ORAL_POLIO_VACCINE_MODEL__EFFICACY_VACCINE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reversion Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReversionRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OralPolioVaccineModel_reversionRate_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_OralPolioVaccineModel_reversionRate_feature", "_UI_OralPolioVaccineModel_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 PolioPackage.Literals.ORAL_POLIO_VACCINE_MODEL__REVERSION_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Partial Susceptibility Vaccine feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPartialSusceptibilityVaccinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OralPolioVaccineModel_partialSusceptibilityVaccine_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_OralPolioVaccineModel_partialSusceptibilityVaccine_feature", "_UI_OralPolioVaccineModel_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 PolioPackage.Literals.ORAL_POLIO_VACCINE_MODEL__PARTIAL_SUSCEPTIBILITY_VACCINE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Trans Rate Vaccine feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransRateVaccinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OralPolioVaccineModel_transRateVaccine_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_OralPolioVaccineModel_transRateVaccine_feature", "_UI_OralPolioVaccineModel_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 PolioPackage.Literals.ORAL_POLIO_VACCINE_MODEL__TRANS_RATE_VACCINE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incub Rate Vaccine feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncubRateVaccinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OralPolioVaccineModel_incubRateVaccine_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_OralPolioVaccineModel_incubRateVaccine_feature", "_UI_OralPolioVaccineModel_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 PolioPackage.Literals.ORAL_POLIO_VACCINE_MODEL__INCUB_RATE_VACCINE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Infect Recovery Rate Vaccine feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInfectRecoveryRateVaccinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OralPolioVaccineModel_infectRecoveryRateVaccine_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_OralPolioVaccineModel_infectRecoveryRateVaccine_feature", "_UI_OralPolioVaccineModel_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 PolioPackage.Literals.ORAL_POLIO_VACCINE_MODEL__INFECT_RECOVERY_RATE_VACCINE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Paralytic Fraction Vaccine feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParalyticFractionVaccinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OralPolioVaccineModel_paralyticFractionVaccine_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_OralPolioVaccineModel_paralyticFractionVaccine_feature", "_UI_OralPolioVaccineModel_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 PolioPackage.Literals.ORAL_POLIO_VACCINE_MODEL__PARALYTIC_FRACTION_VACCINE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Paralytic Fraction Wild feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParalyticFractionWildPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OralPolioVaccineModel_paralyticFractionWild_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_OralPolioVaccineModel_paralyticFractionWild_feature", "_UI_OralPolioVaccineModel_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 PolioPackage.Literals.ORAL_POLIO_VACCINE_MODEL__PARALYTIC_FRACTION_WILD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns OralPolioVaccineModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/custom16/disease.gif")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((OralPolioVaccineModel)object).getDiseaseName();
		return label == null || label.length() == 0 ?
			getString("_UI_OralPolioVaccineModel_type") : //$NON-NLS-1$
			getString("_UI_OralPolioVaccineModel_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(OralPolioVaccineModel.class)) {
			case PolioPackage.ORAL_POLIO_VACCINE_MODEL__EFFICACY_VACCINE:
			case PolioPackage.ORAL_POLIO_VACCINE_MODEL__REVERSION_RATE:
			case PolioPackage.ORAL_POLIO_VACCINE_MODEL__PARTIAL_SUSCEPTIBILITY_VACCINE:
			case PolioPackage.ORAL_POLIO_VACCINE_MODEL__TRANS_RATE_VACCINE:
			case PolioPackage.ORAL_POLIO_VACCINE_MODEL__INCUB_RATE_VACCINE:
			case PolioPackage.ORAL_POLIO_VACCINE_MODEL__INFECT_RECOVERY_RATE_VACCINE:
			case PolioPackage.ORAL_POLIO_VACCINE_MODEL__PARALYTIC_FRACTION_VACCINE:
			case PolioPackage.ORAL_POLIO_VACCINE_MODEL__PARALYTIC_FRACTION_WILD:
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
		return PolioEditPlugin.INSTANCE;
	}

}
