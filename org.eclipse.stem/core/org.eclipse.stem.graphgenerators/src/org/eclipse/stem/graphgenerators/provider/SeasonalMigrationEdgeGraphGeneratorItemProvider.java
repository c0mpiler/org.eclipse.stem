/**
 */
package org.eclipse.stem.graphgenerators.provider;


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
import org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator;

/**
 * This is the item provider adapter for a {@link org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SeasonalMigrationEdgeGraphGeneratorItemProvider
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
	public SeasonalMigrationEdgeGraphGeneratorItemProvider(AdapterFactory adapterFactory) {
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

			addLocationAPropertyDescriptor(object);
			addLocationBPropertyDescriptor(object);
			addMigrationRatePropertyDescriptor(object);
			addPopulationPropertyDescriptor(object);
			addToleranceAngleAPropertyDescriptor(object);
			addToleranceAngleBPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Location A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocationAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SeasonalMigrationEdgeGraphGenerator_locationA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SeasonalMigrationEdgeGraphGenerator_locationA_feature", "_UI_SeasonalMigrationEdgeGraphGenerator_type"),
				 GraphgeneratorsPackage.Literals.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__LOCATION_A,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Location B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocationBPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SeasonalMigrationEdgeGraphGenerator_locationB_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SeasonalMigrationEdgeGraphGenerator_locationB_feature", "_UI_SeasonalMigrationEdgeGraphGenerator_type"),
				 GraphgeneratorsPackage.Literals.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__LOCATION_B,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Migration Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMigrationRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SeasonalMigrationEdgeGraphGenerator_migrationRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SeasonalMigrationEdgeGraphGenerator_migrationRate_feature", "_UI_SeasonalMigrationEdgeGraphGenerator_type"),
				 GraphgeneratorsPackage.Literals.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__MIGRATION_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Population feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPopulationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SeasonalMigrationEdgeGraphGenerator_population_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SeasonalMigrationEdgeGraphGenerator_population_feature", "_UI_SeasonalMigrationEdgeGraphGenerator_type"),
				 GraphgeneratorsPackage.Literals.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__POPULATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tolerance Angle A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToleranceAngleAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SeasonalMigrationEdgeGraphGenerator_toleranceAngleA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SeasonalMigrationEdgeGraphGenerator_toleranceAngleA_feature", "_UI_SeasonalMigrationEdgeGraphGenerator_type"),
				 GraphgeneratorsPackage.Literals.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__TOLERANCE_ANGLE_A,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tolerance Angle B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToleranceAngleBPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SeasonalMigrationEdgeGraphGenerator_toleranceAngleB_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SeasonalMigrationEdgeGraphGenerator_toleranceAngleB_feature", "_UI_SeasonalMigrationEdgeGraphGenerator_type"),
				 GraphgeneratorsPackage.Literals.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__TOLERANCE_ANGLE_B,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns SeasonalMigrationEdgeGraphGenerator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SeasonalMigrationEdgeGraphGenerator"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		URI labelValue = ((SeasonalMigrationEdgeGraphGenerator)object).getURI();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_SeasonalMigrationEdgeGraphGenerator_type") :
			getString("_UI_SeasonalMigrationEdgeGraphGenerator_type") + " " + label;
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

		switch (notification.getFeatureID(SeasonalMigrationEdgeGraphGenerator.class)) {
			case GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__LOCATION_A:
			case GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__LOCATION_B:
			case GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__MIGRATION_RATE:
			case GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__POPULATION:
			case GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__TOLERANCE_ANGLE_A:
			case GraphgeneratorsPackage.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__TOLERANCE_ANGLE_B:
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
