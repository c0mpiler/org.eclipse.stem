package org.eclipse.stem.diseasemodels.forcing.provider;
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
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.stem.diseasemodels.forcing.ForcingPackage;
import org.eclipse.stem.diseasemodels.forcing.Gaussian2ForcingDiseaseModel;

/**
 * This is the item provider adapter for a {@link org.eclipse.stem.diseasemodels.forcing.Gaussian2ForcingDiseaseModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Gaussian2ForcingDiseaseModelItemProvider
	extends GaussianForcingDiseaseModelItemProvider
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
	public Gaussian2ForcingDiseaseModelItemProvider(AdapterFactory adapterFactory) {
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

			addSigma2_2PropertyDescriptor(object);
			addAtt1PropertyDescriptor(object);
			addAtt2PropertyDescriptor(object);
			addAtt3PropertyDescriptor(object);
			addAtt4PropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Sigma2 2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSigma2_2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Gaussian2ForcingDiseaseModel_sigma2_2_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Gaussian2ForcingDiseaseModel_sigma2_2_feature", "_UI_Gaussian2ForcingDiseaseModel_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ForcingPackage.Literals.GAUSSIAN2_FORCING_DISEASE_MODEL__SIGMA2_2,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Att1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAtt1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Gaussian2ForcingDiseaseModel_att1_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Gaussian2ForcingDiseaseModel_att1_feature", "_UI_Gaussian2ForcingDiseaseModel_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ForcingPackage.Literals.GAUSSIAN2_FORCING_DISEASE_MODEL__ATT1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Att2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAtt2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Gaussian2ForcingDiseaseModel_att2_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Gaussian2ForcingDiseaseModel_att2_feature", "_UI_Gaussian2ForcingDiseaseModel_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ForcingPackage.Literals.GAUSSIAN2_FORCING_DISEASE_MODEL__ATT2,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Att3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAtt3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Gaussian2ForcingDiseaseModel_att3_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Gaussian2ForcingDiseaseModel_att3_feature", "_UI_Gaussian2ForcingDiseaseModel_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ForcingPackage.Literals.GAUSSIAN2_FORCING_DISEASE_MODEL__ATT3,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Att4 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAtt4PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Gaussian2ForcingDiseaseModel_att4_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Gaussian2ForcingDiseaseModel_att4_feature", "_UI_Gaussian2ForcingDiseaseModel_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ForcingPackage.Literals.GAUSSIAN2_FORCING_DISEASE_MODEL__ATT4,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Gaussian2ForcingDiseaseModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Gaussian2ForcingDiseaseModel")); //$NON-NLS-1$
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

		switch (notification.getFeatureID(Gaussian2ForcingDiseaseModel.class)) {
			case ForcingPackage.GAUSSIAN2_FORCING_DISEASE_MODEL__SIGMA2_2:
			case ForcingPackage.GAUSSIAN2_FORCING_DISEASE_MODEL__ATT1:
			case ForcingPackage.GAUSSIAN2_FORCING_DISEASE_MODEL__ATT2:
			case ForcingPackage.GAUSSIAN2_FORCING_DISEASE_MODEL__ATT3:
			case ForcingPackage.GAUSSIAN2_FORCING_DISEASE_MODEL__ATT4:
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