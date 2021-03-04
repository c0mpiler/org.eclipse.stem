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
import org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue;
import org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage;
import org.eclipse.stem.diseasemodels.standard.provider.SEIRLabelValueItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PolioOpvIpvLabelValueItemProvider
	extends SEIRLabelValueItemProvider
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
	public PolioOpvIpvLabelValueItemProvider(AdapterFactory adapterFactory) {
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

			addSopvPropertyDescriptor(object);
			addEopvPropertyDescriptor(object);
			addVopvPropertyDescriptor(object);
			addPopvPropertyDescriptor(object);
			addPwPropertyDescriptor(object);
			addSipvPropertyDescriptor(object);
			addEipv_wPropertyDescriptor(object);
			addCipv_wPropertyDescriptor(object);
			addEipv_opvPropertyDescriptor(object);
			addCipv_opvPropertyDescriptor(object);
			addIncidence_opvPropertyDescriptor(object);
			addIncidence_ipv_wPropertyDescriptor(object);
			addIncidence_ipv_opvPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Sopv feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSopvPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolioOpvIpvLabelValue_Sopv_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolioOpvIpvLabelValue_Sopv_feature", "_UI_PolioOpvIpvLabelValue_type"),
				 PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_LABEL_VALUE__SOPV,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Eopv feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEopvPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolioOpvIpvLabelValue_Eopv_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolioOpvIpvLabelValue_Eopv_feature", "_UI_PolioOpvIpvLabelValue_type"),
				 PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_LABEL_VALUE__EOPV,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vopv feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVopvPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolioOpvIpvLabelValue_Vopv_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolioOpvIpvLabelValue_Vopv_feature", "_UI_PolioOpvIpvLabelValue_type"),
				 PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_LABEL_VALUE__VOPV,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Popv feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPopvPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolioOpvIpvLabelValue_Popv_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolioOpvIpvLabelValue_Popv_feature", "_UI_PolioOpvIpvLabelValue_type"),
				 PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_LABEL_VALUE__POPV,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pw feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPwPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolioOpvIpvLabelValue_Pw_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolioOpvIpvLabelValue_Pw_feature", "_UI_PolioOpvIpvLabelValue_type"),
				 PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_LABEL_VALUE__PW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sipv feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSipvPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolioOpvIpvLabelValue_Sipv_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolioOpvIpvLabelValue_Sipv_feature", "_UI_PolioOpvIpvLabelValue_type"),
				 PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_LABEL_VALUE__SIPV,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Eipv w feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEipv_wPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolioOpvIpvLabelValue_Eipv_w_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolioOpvIpvLabelValue_Eipv_w_feature", "_UI_PolioOpvIpvLabelValue_type"),
				 PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_LABEL_VALUE__EIPV_W,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cipv w feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCipv_wPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolioOpvIpvLabelValue_Cipv_w_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolioOpvIpvLabelValue_Cipv_w_feature", "_UI_PolioOpvIpvLabelValue_type"),
				 PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_LABEL_VALUE__CIPV_W,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Eipv opv feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEipv_opvPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolioOpvIpvLabelValue_Eipv_opv_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolioOpvIpvLabelValue_Eipv_opv_feature", "_UI_PolioOpvIpvLabelValue_type"),
				 PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_LABEL_VALUE__EIPV_OPV,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cipv opv feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCipv_opvPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolioOpvIpvLabelValue_Cipv_opv_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolioOpvIpvLabelValue_Cipv_opv_feature", "_UI_PolioOpvIpvLabelValue_type"),
				 PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_LABEL_VALUE__CIPV_OPV,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incidence opv feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncidence_opvPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolioOpvIpvLabelValue_Incidence_opv_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolioOpvIpvLabelValue_Incidence_opv_feature", "_UI_PolioOpvIpvLabelValue_type"),
				 PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_LABEL_VALUE__INCIDENCE_OPV,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incidence ipv w feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncidence_ipv_wPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolioOpvIpvLabelValue_Incidence_ipv_w_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolioOpvIpvLabelValue_Incidence_ipv_w_feature", "_UI_PolioOpvIpvLabelValue_type"),
				 PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_LABEL_VALUE__INCIDENCE_IPV_W,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incidence ipv opv feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncidence_ipv_opvPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PolioOpvIpvLabelValue_Incidence_ipv_opv_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PolioOpvIpvLabelValue_Incidence_ipv_opv_feature", "_UI_PolioOpvIpvLabelValue_type"),
				 PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_LABEL_VALUE__INCIDENCE_IPV_OPV,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns PolioOpvIpvLabelValue.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PolioOpvIpvLabelValue"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		PolioOpvIpvLabelValue polioOpvIpvLabelValue = (PolioOpvIpvLabelValue)object;
		return getString("_UI_PolioOpvIpvLabelValue_type") + " " + polioOpvIpvLabelValue.getPopulationCount();
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

		switch (notification.getFeatureID(PolioOpvIpvLabelValue.class)) {
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__SOPV:
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__EOPV:
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__VOPV:
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__POPV:
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__PW:
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__SIPV:
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__EIPV_W:
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__CIPV_W:
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__EIPV_OPV:
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__CIPV_OPV:
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__INCIDENCE_OPV:
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__INCIDENCE_IPV_W:
			case PolioOpvIpvPackage.POLIO_OPV_IPV_LABEL_VALUE__INCIDENCE_IPV_OPV:
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
