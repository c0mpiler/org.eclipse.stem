// ExternalDataSourceDiseaseModelItemProvider
package org.eclipse.stem.diseasemodels.externaldatasource.provider;

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
import org.eclipse.stem.diseasemodels.externaldatasource.ExternalDataSourceDiseaseModel;
import org.eclipse.stem.diseasemodels.externaldatasource.ExternalDataSourcePackage;
import org.eclipse.stem.diseasemodels.standard.provider.StandardDiseaseModelItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.stem.diseasemodels.externaldatasource.ExternalDataSourceDiseaseModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalDataSourceDiseaseModelItemProvider
	extends StandardDiseaseModelItemProvider
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
	public ExternalDataSourceDiseaseModelItemProvider(AdapterFactory adapterFactory) {
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

			addDataPathPropertyDescriptor(object);
			addBufferSizePropertyDescriptor(object);
			addRestartPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Data Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExternalDataSourceDiseaseModel_dataPath_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ExternalDataSourceDiseaseModel_dataPath_feature", "_UI_ExternalDataSourceDiseaseModel_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ExternalDataSourcePackage.Literals.EXTERNAL_DATA_SOURCE_DISEASE_MODEL__DATA_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Buffer Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBufferSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExternalDataSourceDiseaseModel_bufferSize_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ExternalDataSourceDiseaseModel_bufferSize_feature", "_UI_ExternalDataSourceDiseaseModel_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ExternalDataSourcePackage.Literals.EXTERNAL_DATA_SOURCE_DISEASE_MODEL__BUFFER_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Restart feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRestartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExternalDataSourceDiseaseModel_restart_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ExternalDataSourceDiseaseModel_restart_feature", "_UI_ExternalDataSourceDiseaseModel_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ExternalDataSourcePackage.Literals.EXTERNAL_DATA_SOURCE_DISEASE_MODEL__RESTART,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ExternalDataSourceDiseaseModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/customobj16/ExternalDataSourceDiseaseModel")); //$NON-NLS-1$
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTextGen(Object object) {
		String label = ((ExternalDataSourceDiseaseModel)object).getDiseaseName();
		return label == null || label.length() == 0 ?
			getString("_UI_ExternalDataSourceDiseaseModel_type") : //$NON-NLS-1$
			getString("_UI_ExternalDataSourceDiseaseModel_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(ExternalDataSourceDiseaseModel.class)) {
			case ExternalDataSourcePackage.EXTERNAL_DATA_SOURCE_DISEASE_MODEL__DATA_PATH:
			case ExternalDataSourcePackage.EXTERNAL_DATA_SOURCE_DISEASE_MODEL__DISEASE_TYPE:
			case ExternalDataSourcePackage.EXTERNAL_DATA_SOURCE_DISEASE_MODEL__BUFFER_SIZE:
			case ExternalDataSourcePackage.EXTERNAL_DATA_SOURCE_DISEASE_MODEL__RESTART:
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
		return ExternalDataSourceEditPlugin.INSTANCE;
	}

}
