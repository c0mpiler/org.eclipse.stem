package org.eclipse.stem.graphgenerators.provider;

/*******************************************************************************
* Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors: Armin Weiser, Matthias Filter
* Bundesinstitut für Risikobewertung
* FG 43 - Epidemiologie und Zoonosen
* Diedersdorfer Weg 1, 12277 Berlin
* 
* IBM Corporation - initial API and implementation
*******************************************************************************/

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.stem.graphgenerators.GraphgeneratorsPackage;
import org.eclipse.stem.graphgenerators.PajekNetGraphGenerator;

/**
 * This is the item provider adapter for a {@link org.eclipse.stem.graphgenerators.PajekNetGraphGenerator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PajekNetGraphGeneratorItemProvider
	extends GraphGeneratorItemProvider
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
	public PajekNetGraphGeneratorItemProvider(AdapterFactory adapterFactory) {
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

			addDataFilePropertyDescriptor(object);
			addScalingFactorPropertyDescriptor(object);
			addNodeSizePropertyDescriptor(object);
			addUseRegionURIPropertyDescriptor(object);
			addMoveNodesToContainersPropertyDescriptor(object);
			addUseAbsoluteRatesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Data File feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataFilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PajekNetGraphGenerator_dataFile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PajekNetGraphGenerator_dataFile_feature", "_UI_PajekNetGraphGenerator_type"),
				 GraphgeneratorsPackage.Literals.PAJEK_NET_GRAPH_GENERATOR__DATA_FILE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scaling Factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScalingFactorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PajekNetGraphGenerator_scalingFactor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PajekNetGraphGenerator_scalingFactor_feature", "_UI_PajekNetGraphGenerator_type"),
				 GraphgeneratorsPackage.Literals.PAJEK_NET_GRAPH_GENERATOR__SCALING_FACTOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Node Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNodeSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PajekNetGraphGenerator_nodeSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PajekNetGraphGenerator_nodeSize_feature", "_UI_PajekNetGraphGenerator_type"),
				 GraphgeneratorsPackage.Literals.PAJEK_NET_GRAPH_GENERATOR__NODE_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Use Region URI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseRegionURIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PajekNetGraphGenerator_useRegionURI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PajekNetGraphGenerator_useRegionURI_feature", "_UI_PajekNetGraphGenerator_type"),
				 GraphgeneratorsPackage.Literals.PAJEK_NET_GRAPH_GENERATOR__USE_REGION_URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Move Nodes To Containers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMoveNodesToContainersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PajekNetGraphGenerator_moveNodesToContainers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PajekNetGraphGenerator_moveNodesToContainers_feature", "_UI_PajekNetGraphGenerator_type"),
				 GraphgeneratorsPackage.Literals.PAJEK_NET_GRAPH_GENERATOR__MOVE_NODES_TO_CONTAINERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Use Absolute Rates feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseAbsoluteRatesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PajekNetGraphGenerator_useAbsoluteRates_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PajekNetGraphGenerator_useAbsoluteRates_feature", "_UI_PajekNetGraphGenerator_type"),
				 GraphgeneratorsPackage.Literals.PAJEK_NET_GRAPH_GENERATOR__USE_ABSOLUTE_RATES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns PajekNetGraphGenerator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PajekNetGraphGenerator"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		URI labelValue = ((PajekNetGraphGenerator)object).getURI();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_PajekNetGraphGenerator_type") :
			getString("_UI_PajekNetGraphGenerator_type") + " " + label;
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

		switch (notification.getFeatureID(PajekNetGraphGenerator.class)) {
			case GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__DATA_FILE:
			case GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__SCALING_FACTOR:
			case GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__NODE_SIZE:
			case GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__USE_REGION_URI:
			case GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__MOVE_NODES_TO_CONTAINERS:
			case GraphgeneratorsPackage.PAJEK_NET_GRAPH_GENERATOR__USE_ABSOLUTE_RATES:
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
