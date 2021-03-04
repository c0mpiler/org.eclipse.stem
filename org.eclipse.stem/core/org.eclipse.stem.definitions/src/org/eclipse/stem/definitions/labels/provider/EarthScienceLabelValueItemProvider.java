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
package org.eclipse.stem.definitions.labels.provider;


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
import org.eclipse.stem.core.graph.provider.LabelValueItemProvider;
import org.eclipse.stem.definitions.edges.provider.DefinitionsEditPlugin;
import org.eclipse.stem.definitions.labels.EarthScienceLabelValue;
import org.eclipse.stem.definitions.labels.LabelsPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.stem.definitions.labels.EarthScienceLabelValue} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EarthScienceLabelValueItemProvider
	extends LabelValueItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthScienceLabelValueItemProvider(AdapterFactory adapterFactory) {
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

			addDataTypePropertyDescriptor(object);
			addUnitsPropertyDescriptor(object);
			addMeanPropertyDescriptor(object);
			addSdPropertyDescriptor(object);
			addMinPropertyDescriptor(object);
			addMaxPropertyDescriptor(object);
			addMedianPropertyDescriptor(object);
			addSkewnessPropertyDescriptor(object);
			addKurtosisPropertyDescriptor(object);
			addRmsPropertyDescriptor(object);
			addSamplesizePropertyDescriptor(object);
			addRangePropertyDescriptor(object);
			addValidYearPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Data Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EarthScienceLabelValue_dataType_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_EarthScienceLabelValue_dataType_feature", "_UI_EarthScienceLabelValue_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 LabelsPackage.Literals.EARTH_SCIENCE_LABEL_VALUE__DATA_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EarthScienceLabelValue_units_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_EarthScienceLabelValue_units_feature", "_UI_EarthScienceLabelValue_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 LabelsPackage.Literals.EARTH_SCIENCE_LABEL_VALUE__UNITS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mean feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EarthScienceLabelValue_mean_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_EarthScienceLabelValue_mean_feature", "_UI_EarthScienceLabelValue_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 LabelsPackage.Literals.EARTH_SCIENCE_LABEL_VALUE__MEAN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sd feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EarthScienceLabelValue_sd_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_EarthScienceLabelValue_sd_feature", "_UI_EarthScienceLabelValue_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 LabelsPackage.Literals.EARTH_SCIENCE_LABEL_VALUE__SD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EarthScienceLabelValue_min_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_EarthScienceLabelValue_min_feature", "_UI_EarthScienceLabelValue_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 LabelsPackage.Literals.EARTH_SCIENCE_LABEL_VALUE__MIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EarthScienceLabelValue_max_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_EarthScienceLabelValue_max_feature", "_UI_EarthScienceLabelValue_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 LabelsPackage.Literals.EARTH_SCIENCE_LABEL_VALUE__MAX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Median feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMedianPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EarthScienceLabelValue_median_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_EarthScienceLabelValue_median_feature", "_UI_EarthScienceLabelValue_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 LabelsPackage.Literals.EARTH_SCIENCE_LABEL_VALUE__MEDIAN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Skewness feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSkewnessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EarthScienceLabelValue_skewness_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_EarthScienceLabelValue_skewness_feature", "_UI_EarthScienceLabelValue_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 LabelsPackage.Literals.EARTH_SCIENCE_LABEL_VALUE__SKEWNESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Kurtosis feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKurtosisPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EarthScienceLabelValue_kurtosis_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_EarthScienceLabelValue_kurtosis_feature", "_UI_EarthScienceLabelValue_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 LabelsPackage.Literals.EARTH_SCIENCE_LABEL_VALUE__KURTOSIS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rms feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRmsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EarthScienceLabelValue_rms_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_EarthScienceLabelValue_rms_feature", "_UI_EarthScienceLabelValue_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 LabelsPackage.Literals.EARTH_SCIENCE_LABEL_VALUE__RMS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Samplesize feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSamplesizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EarthScienceLabelValue_samplesize_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_EarthScienceLabelValue_samplesize_feature", "_UI_EarthScienceLabelValue_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 LabelsPackage.Literals.EARTH_SCIENCE_LABEL_VALUE__SAMPLESIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Range feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRangePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EarthScienceLabelValue_range_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_EarthScienceLabelValue_range_feature", "_UI_EarthScienceLabelValue_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 LabelsPackage.Literals.EARTH_SCIENCE_LABEL_VALUE__RANGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Valid Year feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidYearPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EarthScienceLabelValue_validYear_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_EarthScienceLabelValue_validYear_feature", "_UI_EarthScienceLabelValue_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 LabelsPackage.Literals.EARTH_SCIENCE_LABEL_VALUE__VALID_YEAR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns EarthScienceLabelValue.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EarthScienceLabelValue")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EarthScienceLabelValue)object).getDataType();
		return label == null || label.length() == 0 ?
			getString("_UI_EarthScienceLabelValue_type") : //$NON-NLS-1$
			getString("_UI_EarthScienceLabelValue_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(EarthScienceLabelValue.class)) {
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__DATA_TYPE:
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__UNITS:
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__MEAN:
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__SD:
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__MIN:
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__MAX:
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__MEDIAN:
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__SKEWNESS:
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__KURTOSIS:
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__RMS:
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__SAMPLESIZE:
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__RANGE:
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE__VALID_YEAR:
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
		return DefinitionsEditPlugin.INSTANCE;
	}

}
