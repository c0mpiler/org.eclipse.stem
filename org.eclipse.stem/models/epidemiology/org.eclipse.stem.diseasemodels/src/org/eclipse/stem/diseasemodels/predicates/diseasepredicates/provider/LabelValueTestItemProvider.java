package org.eclipse.stem.diseasemodels.predicates.diseasepredicates.provider;

/******************************************************************************* 
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     IBM Corporation - initial API and implementation 
 *******************************************************************************/


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.stem.core.predicate.provider.TestItemProvider;
import org.eclipse.stem.diseasemodels.predicates.diseasepredicates.DiseasepredicatesPackage;
import org.eclipse.stem.diseasemodels.predicates.diseasepredicates.LabelValueTest;
import org.eclipse.stem.diseasemodels.standard.provider.DiseasemodelsEditPlugin;
import org.eclipse.stem.geography.names.GeographicNames;

/**
 * This is the item provider adapter for a {@link org.eclipse.stem.diseasemodels.predicates.diseasepredicates.LabelValueTest} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LabelValueTestItemProvider
	extends TestItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelValueTestItemProvider(AdapterFactory adapterFactory) {
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

			addModelNamePropertyDescriptor(object);
			addTargetURIPropertyDescriptor(object);
			addStatePropertyDescriptor(object);
			addThresholdPropertyDescriptor(object);
			addPredicatePropertyDescriptor(object);
			addPopulationIdentifierPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Model Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LabelValueTest_modelName_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_LabelValueTest_modelName_feature", "_UI_LabelValueTest_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 DiseasepredicatesPackage.Literals.LABEL_VALUE_TEST__MODEL_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target URI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetURIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LabelValueTest_targetURI_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_LabelValueTest_targetURI_feature", "_UI_LabelValueTest_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 DiseasepredicatesPackage.Literals.LABEL_VALUE_TEST__TARGET_URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LabelValueTest_state_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_LabelValueTest_state_feature", "_UI_LabelValueTest_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 DiseasepredicatesPackage.Literals.LABEL_VALUE_TEST__STATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Threshold feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThresholdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LabelValueTest_threshold_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_LabelValueTest_threshold_feature", "_UI_LabelValueTest_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 DiseasepredicatesPackage.Literals.LABEL_VALUE_TEST__THRESHOLD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Predicate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPredicatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LabelValueTest_predicate_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_LabelValueTest_predicate_feature", "_UI_LabelValueTest_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 DiseasepredicatesPackage.Literals.LABEL_VALUE_TEST__PREDICATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Population Identifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPopulationIdentifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LabelValueTest_populationIdentifier_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_LabelValueTest_populationIdentifier_feature", "_UI_LabelValueTest_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 DiseasepredicatesPackage.Literals.LABEL_VALUE_TEST__POPULATION_IDENTIFIER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns LabelValueTest.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/custom16/LabelValueTest.png")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextGen(Object object) {
		String label = ((LabelValueTest)object).getModelName();
		return label == null || label.length() == 0 ?
			getString("_UI_LabelValueTest_type") : //$NON-NLS-1$
			getString("_UI_LabelValueTest_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
	}
	
	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		LabelValueTest lvtest =  ((LabelValueTest) object);
		final URI targetURI = lvtest.getTargetURI();
		String geoName = "", ISOKey = "";
		if(targetURI != null) {
			final String lastSegment = targetURI.lastSegment();
			ISOKey = lastSegment;
			if(ISOKey != null && !ISOKey.trim().equals(""))
			geoName = GeographicNames.getName(ISOKey);
		}
		final StringBuilder sb = new StringBuilder(
				geoName.startsWith("!") ? ISOKey : geoName);
		sb.append(" ");
		sb.append(lvtest.getModelName());
		sb.append(" ");
		sb.append(lvtest.getState());
		sb.append(" ");
		sb.append(lvtest.getPredicate());
		sb.append(" ");
		sb.append(lvtest.getThreshold());
		return sb.toString();
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

		switch (notification.getFeatureID(LabelValueTest.class)) {
			case DiseasepredicatesPackage.LABEL_VALUE_TEST__MODEL_NAME:
			case DiseasepredicatesPackage.LABEL_VALUE_TEST__TARGET_URI:
			case DiseasepredicatesPackage.LABEL_VALUE_TEST__STATE:
			case DiseasepredicatesPackage.LABEL_VALUE_TEST__THRESHOLD:
			case DiseasepredicatesPackage.LABEL_VALUE_TEST__PREDICATE:
			case DiseasepredicatesPackage.LABEL_VALUE_TEST__POPULATION_IDENTIFIER:
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
		return DiseasemodelsEditPlugin.INSTANCE;
	}

}
