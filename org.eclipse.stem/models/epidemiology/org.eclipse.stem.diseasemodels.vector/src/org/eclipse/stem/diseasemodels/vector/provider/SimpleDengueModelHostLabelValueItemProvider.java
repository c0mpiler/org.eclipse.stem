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
import org.eclipse.stem.diseasemodels.standard.provider.StandardDiseaseModelLabelValueItemProvider;
import org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue;
import org.eclipse.stem.diseasemodels.vector.VectorPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleDengueModelHostLabelValueItemProvider
	extends StandardDiseaseModelLabelValueItemProvider
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
	public SimpleDengueModelHostLabelValueItemProvider(AdapterFactory adapterFactory) {
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

			addI1PropertyDescriptor(object);
			addI2PropertyDescriptor(object);
			addI3PropertyDescriptor(object);
			addI4PropertyDescriptor(object);
			addC1PropertyDescriptor(object);
			addC2PropertyDescriptor(object);
			addC3PropertyDescriptor(object);
			addC4PropertyDescriptor(object);
			addR1PropertyDescriptor(object);
			addR2PropertyDescriptor(object);
			addR3PropertyDescriptor(object);
			addR4PropertyDescriptor(object);
			addI12PropertyDescriptor(object);
			addI13PropertyDescriptor(object);
			addI14PropertyDescriptor(object);
			addI21PropertyDescriptor(object);
			addI23PropertyDescriptor(object);
			addI24PropertyDescriptor(object);
			addI31PropertyDescriptor(object);
			addI32PropertyDescriptor(object);
			addI34PropertyDescriptor(object);
			addI41PropertyDescriptor(object);
			addI42PropertyDescriptor(object);
			addI43PropertyDescriptor(object);
			addRPropertyDescriptor(object);
			addIncidence1PropertyDescriptor(object);
			addIncidence2PropertyDescriptor(object);
			addIncidence3PropertyDescriptor(object);
			addIncidence4PropertyDescriptor(object);
			addIncidence12PropertyDescriptor(object);
			addIncidence21PropertyDescriptor(object);
			addIncidence31PropertyDescriptor(object);
			addIncidence41PropertyDescriptor(object);
			addIncidence13PropertyDescriptor(object);
			addIncidence23PropertyDescriptor(object);
			addIncidence32PropertyDescriptor(object);
			addIncidence42PropertyDescriptor(object);
			addIncidence14PropertyDescriptor(object);
			addIncidence24PropertyDescriptor(object);
			addIncidence34PropertyDescriptor(object);
			addIncidence43PropertyDescriptor(object);
			addDiseaseDeaths1PropertyDescriptor(object);
			addDiseaseDeaths2PropertyDescriptor(object);
			addDiseaseDeaths3PropertyDescriptor(object);
			addDiseaseDeaths4PropertyDescriptor(object);
			addDiseaseDeaths12PropertyDescriptor(object);
			addDiseaseDeaths21PropertyDescriptor(object);
			addDiseaseDeaths31PropertyDescriptor(object);
			addDiseaseDeaths41PropertyDescriptor(object);
			addDiseaseDeaths13PropertyDescriptor(object);
			addDiseaseDeaths23PropertyDescriptor(object);
			addDiseaseDeaths32PropertyDescriptor(object);
			addDiseaseDeaths42PropertyDescriptor(object);
			addDiseaseDeaths14PropertyDescriptor(object);
			addDiseaseDeaths24PropertyDescriptor(object);
			addDiseaseDeaths34PropertyDescriptor(object);
			addDiseaseDeaths43PropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the I1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addI1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_I1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_I1_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the I2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addI2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_I2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_I2_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I2,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the I3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addI3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_I3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_I3_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I3,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the I4 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addI4PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_I4_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_I4_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I4,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the C1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addC1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_C1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_C1_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the C2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addC2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_C2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_C2_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C2,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the C3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addC3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_C3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_C3_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C3,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the C4 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addC4PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_C4_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_C4_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C4,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the R1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addR1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_R1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_R1_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the R2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addR2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_R2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_R2_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R2,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the R3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addR3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_R3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_R3_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R3,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the R4 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addR4PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_R4_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_R4_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R4,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the I12 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addI12PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_I12_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_I12_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I12,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the I13 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addI13PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_I13_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_I13_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I13,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the I14 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addI14PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_I14_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_I14_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I14,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the I21 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addI21PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_I21_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_I21_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I21,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the I23 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addI23PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_I23_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_I23_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I23,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the I24 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addI24PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_I24_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_I24_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I24,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the I31 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addI31PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_I31_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_I31_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I31,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the I32 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addI32PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_I32_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_I32_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I32,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the I34 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addI34PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_I34_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_I34_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I34,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the I41 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addI41PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_I41_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_I41_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I41,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the I42 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addI42PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_I42_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_I42_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I42,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the I43 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addI43PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_I43_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_I43_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I43,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the R feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_R_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_R_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incidence1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncidence1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_incidence1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_incidence1_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incidence2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncidence2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_incidence2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_incidence2_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE2,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incidence3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncidence3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_incidence3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_incidence3_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE3,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incidence4 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncidence4PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_incidence4_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_incidence4_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE4,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incidence12 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncidence12PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_incidence12_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_incidence12_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE12,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incidence21 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncidence21PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_incidence21_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_incidence21_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE21,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incidence31 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncidence31PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_incidence31_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_incidence31_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE31,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incidence41 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncidence41PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_incidence41_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_incidence41_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE41,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incidence13 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncidence13PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_incidence13_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_incidence13_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE13,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incidence23 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncidence23PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_incidence23_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_incidence23_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE23,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incidence32 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncidence32PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_incidence32_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_incidence32_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE32,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incidence42 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncidence42PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_incidence42_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_incidence42_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE42,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incidence14 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncidence14PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_incidence14_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_incidence14_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE14,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incidence24 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncidence24PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_incidence24_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_incidence24_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE24,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incidence34 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncidence34PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_incidence34_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_incidence34_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE34,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incidence43 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncidence43PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_incidence43_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_incidence43_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE43,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disease Deaths1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiseaseDeaths1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_diseaseDeaths1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_diseaseDeaths1_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disease Deaths2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiseaseDeaths2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_diseaseDeaths2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_diseaseDeaths2_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS2,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disease Deaths3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiseaseDeaths3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_diseaseDeaths3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_diseaseDeaths3_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS3,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disease Deaths4 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiseaseDeaths4PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_diseaseDeaths4_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_diseaseDeaths4_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS4,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disease Deaths12 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiseaseDeaths12PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_diseaseDeaths12_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_diseaseDeaths12_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS12,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disease Deaths21 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiseaseDeaths21PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_diseaseDeaths21_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_diseaseDeaths21_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS21,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disease Deaths31 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiseaseDeaths31PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_diseaseDeaths31_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_diseaseDeaths31_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS31,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disease Deaths41 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiseaseDeaths41PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_diseaseDeaths41_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_diseaseDeaths41_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS41,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disease Deaths13 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiseaseDeaths13PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_diseaseDeaths13_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_diseaseDeaths13_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS13,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disease Deaths23 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiseaseDeaths23PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_diseaseDeaths23_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_diseaseDeaths23_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS23,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disease Deaths32 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiseaseDeaths32PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_diseaseDeaths32_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_diseaseDeaths32_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS32,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disease Deaths42 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiseaseDeaths42PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_diseaseDeaths42_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_diseaseDeaths42_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS42,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disease Deaths14 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiseaseDeaths14PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_diseaseDeaths14_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_diseaseDeaths14_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS14,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disease Deaths24 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiseaseDeaths24PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_diseaseDeaths24_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_diseaseDeaths24_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS24,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disease Deaths34 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiseaseDeaths34PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_diseaseDeaths34_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_diseaseDeaths34_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS34,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disease Deaths43 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiseaseDeaths43PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleDengueModelHostLabelValue_diseaseDeaths43_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleDengueModelHostLabelValue_diseaseDeaths43_feature", "_UI_SimpleDengueModelHostLabelValue_type"),
				 VectorPackage.Literals.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS43,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns SimpleDengueModelHostLabelValue.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SimpleDengueModelHostLabelValue"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		SimpleDengueModelHostLabelValue simpleDengueModelHostLabelValue = (SimpleDengueModelHostLabelValue)object;
		return getString("_UI_SimpleDengueModelHostLabelValue_type") + " " + simpleDengueModelHostLabelValue.getPopulationCount();
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

		switch (notification.getFeatureID(SimpleDengueModelHostLabelValue.class)) {
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I1:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I2:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I3:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I4:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C1:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C2:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C3:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C4:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R1:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R2:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R3:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R4:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I12:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I13:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I14:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I21:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I23:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I24:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I31:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I32:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I34:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I41:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I42:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I43:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE1:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE2:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE3:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE4:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE12:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE21:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE31:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE41:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE13:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE23:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE32:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE42:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE14:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE24:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE34:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE43:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS1:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS2:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS3:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS4:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS12:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS21:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS31:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS41:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS13:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS23:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS32:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS42:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS14:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS24:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS34:
			case VectorPackage.SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS43:
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
