package org.eclipse.stem.definitions.transport.provider;

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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.stem.core.graph.Edge;
import org.eclipse.stem.core.graph.EdgeLabel;
import org.eclipse.stem.core.graph.provider.EdgeLabelItemProvider;
import org.eclipse.stem.definitions.transport.PipeTransportEdgeLabel;
import org.eclipse.stem.geography.names.GeographicNames;

/**
 * This is the item provider adapter for a {@link org.eclipse.stem.definitions.transport.PipeTransportEdgeLabel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PipeTransportEdgeLabelItemProvider
	extends EdgeLabelItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	
	private static String AIR_TRANSPORT_SYSTEM_STRING = "(S)";
	
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipeTransportEdgeLabelItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This returns PipeTransportEdgeLabel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/custom16/airEdge.png"));
	}


	
	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTextGen(Object object) {
		URI labelValue = ((PipeTransportEdgeLabel)object).getURI();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_PipeTransportEdgeLabel_type") :
			getString("_UI_PipeTransportEdgeLabel_type") + " " + label;
	}
	
	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		final URI labelURI = ((PipeTransportEdgeLabel)object).getURI();
		final String lastSegment = labelURI.lastSegment().toString();
		final int i = lastSegment.indexOf("_");
		String firstISOKey = lastSegment.substring(0, i);
		String secondISOKey = lastSegment.substring(i+1);
		String firstPrefix = "";
		String secondPrefix = "";		
		
		if(firstISOKey.startsWith(AIR_TRANSPORT_SYSTEM_STRING)) {
			firstISOKey = firstISOKey.substring(3);
			firstPrefix = AIR_TRANSPORT_SYSTEM_STRING;
		}

		if(secondISOKey.startsWith(AIR_TRANSPORT_SYSTEM_STRING)) {
			secondISOKey = secondISOKey.substring(3);
			secondPrefix = AIR_TRANSPORT_SYSTEM_STRING;
		}

		
		final String firstGeoName = GeographicNames.getName(firstISOKey);
		final String secondGeoName = GeographicNames.getName(secondISOKey);
		
		final StringBuilder sb = new StringBuilder(
				firstGeoName.startsWith("!") ? firstPrefix+firstISOKey : firstPrefix+firstGeoName);
		final Edge edge = ((EdgeLabel) object).getEdge();
		sb.append(edge.isDirected() ? " -> " : " <-> ");
		
		// Find Bugs identified an error.  secondGeoName was used 
		// for both conditions off the ternary
		sb.append(secondGeoName.startsWith("!") ? secondPrefix+secondISOKey
						: secondPrefix+secondGeoName);

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
		return TransportEditPlugin.INSTANCE;
	}

}
