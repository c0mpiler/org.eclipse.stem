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
package org.eclipse.stem.loggers.imagewriter.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
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
import org.eclipse.stem.loggers.imagewriter.ImagewriterPackage;
import org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger;
import org.eclipse.stem.loggers.provider.SynchronousDecoratorPropertyLoggerItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectedMapImageLoggerItemProvider
	extends SynchronousDecoratorPropertyLoggerItemProvider
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
	public ProjectedMapImageLoggerItemProvider(AdapterFactory adapterFactory) {
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

			addUseDefaultLogDirectoryPropertyDescriptor(object);
			addDataPathPropertyDescriptor(object);
			addProjectionPropertyDescriptor(object);
			addWidthPropertyDescriptor(object);
			addHeightPropertyDescriptor(object);
			addForceAspectRatioPropertyDescriptor(object);
			addFitToShapeBoundsPropertyDescriptor(object);
			addLogScalingPropertyDescriptor(object);
			addGainPropertyDescriptor(object);
			addColorProviderPropertyDescriptor(object);
			addTransparentBackgroundPropertyDescriptor(object);
			addBorderTransparencyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Use Default Log Directory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseDefaultLogDirectoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageWriterLogger_useDefaultLogDirectory_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageWriterLogger_useDefaultLogDirectory_feature", "_UI_ImageWriterLogger_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ImagewriterPackage.Literals.IMAGE_WRITER_LOGGER__USE_DEFAULT_LOG_DIRECTORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_ImageWriterLogger_dataPath_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageWriterLogger_dataPath_feature", "_UI_ImageWriterLogger_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ImagewriterPackage.Literals.IMAGE_WRITER_LOGGER__DATA_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gain feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectedMapImageLogger_gain_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectedMapImageLogger_gain_feature", "_UI_ProjectedMapImageLogger_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ImagewriterPackage.Literals.PROJECTED_MAP_IMAGE_LOGGER__GAIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Color Provider feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColorProviderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectedMapImageLogger_colorProvider_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectedMapImageLogger_colorProvider_feature", "_UI_ProjectedMapImageLogger_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ImagewriterPackage.Literals.PROJECTED_MAP_IMAGE_LOGGER__COLOR_PROVIDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transparent Background feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransparentBackgroundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectedMapImageLogger_transparentBackground_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectedMapImageLogger_transparentBackground_feature", "_UI_ProjectedMapImageLogger_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ImagewriterPackage.Literals.PROJECTED_MAP_IMAGE_LOGGER__TRANSPARENT_BACKGROUND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Border Transparency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBorderTransparencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectedMapImageLogger_borderTransparency_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectedMapImageLogger_borderTransparency_feature", "_UI_ProjectedMapImageLogger_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ImagewriterPackage.Literals.PROJECTED_MAP_IMAGE_LOGGER__BORDER_TRANSPARENCY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectedMapImageLogger_width_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectedMapImageLogger_width_feature", "_UI_ProjectedMapImageLogger_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ImagewriterPackage.Literals.PROJECTED_MAP_IMAGE_LOGGER__WIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectedMapImageLogger_height_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectedMapImageLogger_height_feature", "_UI_ProjectedMapImageLogger_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ImagewriterPackage.Literals.PROJECTED_MAP_IMAGE_LOGGER__HEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Force Aspect Ratio feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForceAspectRatioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectedMapImageLogger_forceAspectRatio_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectedMapImageLogger_forceAspectRatio_feature", "_UI_ProjectedMapImageLogger_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ImagewriterPackage.Literals.PROJECTED_MAP_IMAGE_LOGGER__FORCE_ASPECT_RATIO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fit To Shape Bounds feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFitToShapeBoundsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectedMapImageLogger_fitToShapeBounds_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectedMapImageLogger_fitToShapeBounds_feature", "_UI_ProjectedMapImageLogger_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ImagewriterPackage.Literals.PROJECTED_MAP_IMAGE_LOGGER__FIT_TO_SHAPE_BOUNDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Log Scaling feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogScalingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectedMapImageLogger_logScaling_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectedMapImageLogger_logScaling_feature", "_UI_ProjectedMapImageLogger_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ImagewriterPackage.Literals.PROJECTED_MAP_IMAGE_LOGGER__LOG_SCALING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Projection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProjectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectedMapImageLogger_projection_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectedMapImageLogger_projection_feature", "_UI_ProjectedMapImageLogger_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ImagewriterPackage.Literals.PROJECTED_MAP_IMAGE_LOGGER__PROJECTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ProjectedMapImageLogger.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ProjectedMapImageLogger")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		URI labelValue = ((ProjectedMapImageLogger)object).getURI();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_ProjectedMapImageLogger_type") : //$NON-NLS-1$
			getString("_UI_ProjectedMapImageLogger_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(ProjectedMapImageLogger.class)) {
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__USE_DEFAULT_LOG_DIRECTORY:
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__DATA_PATH:
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__PROJECTION:
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__WIDTH:
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__HEIGHT:
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__FORCE_ASPECT_RATIO:
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__FIT_TO_SHAPE_BOUNDS:
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__LOG_SCALING:
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__GAIN:
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__COLOR_PROVIDER:
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__TRANSPARENT_BACKGROUND:
			case ImagewriterPackage.PROJECTED_MAP_IMAGE_LOGGER__BORDER_TRANSPARENCY:
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
		return ImageWriterLoggerEditPlugin.INSTANCE;
	}

}
