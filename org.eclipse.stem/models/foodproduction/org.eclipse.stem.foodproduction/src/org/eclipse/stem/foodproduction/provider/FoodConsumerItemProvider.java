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
package org.eclipse.stem.foodproduction.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.stem.core.common.CommonFactory;
import org.eclipse.stem.foodproduction.FoodConsumer;
import org.eclipse.stem.foodproduction.FoodproductionPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.stem.foodproduction.FoodConsumer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FoodConsumerItemProvider
	extends FoodTransformerItemProvider
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
	public FoodConsumerItemProvider(AdapterFactory adapterFactory) {
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

			addSourceDecoratorPropertyDescriptor(object);
			addTargetDecoratorPropertyDescriptor(object);
			addStateTransitionsMapPropertyDescriptor(object);
			addSourceAttributesPropertyDescriptor(object);
			addTargetAttributesPropertyDescriptor(object);
			addConsumptionRatePropertyDescriptor(object);
			addConsumptionTypePropertyDescriptor(object);
			addWasteRatePropertyDescriptor(object);
			addMaxVolumeOfStocksPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Source Decorator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceDecoratorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiseaseCarryingTransformer_sourceDecorator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiseaseCarryingTransformer_sourceDecorator_feature", "_UI_DiseaseCarryingTransformer_type"),
				 FoodproductionPackage.Literals.DISEASE_CARRYING_TRANSFORMER__SOURCE_DECORATOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Decorator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetDecoratorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiseaseCarryingTransformer_targetDecorator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiseaseCarryingTransformer_targetDecorator_feature", "_UI_DiseaseCarryingTransformer_type"),
				 FoodproductionPackage.Literals.DISEASE_CARRYING_TRANSFORMER__TARGET_DECORATOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the State Transitions Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStateTransitionsMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiseaseCarryingTransformer_stateTransitionsMap_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiseaseCarryingTransformer_stateTransitionsMap_feature", "_UI_DiseaseCarryingTransformer_type"),
				 FoodproductionPackage.Literals.DISEASE_CARRYING_TRANSFORMER__STATE_TRANSITIONS_MAP,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Attributes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceAttributesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiseaseCarryingTransformer_sourceAttributes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiseaseCarryingTransformer_sourceAttributes_feature", "_UI_DiseaseCarryingTransformer_type"),
				 FoodproductionPackage.Literals.DISEASE_CARRYING_TRANSFORMER__SOURCE_ATTRIBUTES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Attributes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetAttributesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DiseaseCarryingTransformer_targetAttributes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DiseaseCarryingTransformer_targetAttributes_feature", "_UI_DiseaseCarryingTransformer_type"),
				 FoodproductionPackage.Literals.DISEASE_CARRYING_TRANSFORMER__TARGET_ATTRIBUTES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Consumption Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConsumptionRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FoodConsumer_consumptionRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FoodConsumer_consumptionRate_feature", "_UI_FoodConsumer_type"),
				 FoodproductionPackage.Literals.FOOD_CONSUMER__CONSUMPTION_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Consumption Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConsumptionTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FoodConsumer_consumptionType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FoodConsumer_consumptionType_feature", "_UI_FoodConsumer_type"),
				 FoodproductionPackage.Literals.FOOD_CONSUMER__CONSUMPTION_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Waste Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWasteRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FoodConsumer_wasteRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FoodConsumer_wasteRate_feature", "_UI_FoodConsumer_type"),
				 FoodproductionPackage.Literals.FOOD_CONSUMER__WASTE_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Volume Of Stocks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxVolumeOfStocksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FoodConsumer_maxVolumeOfStocks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FoodConsumer_maxVolumeOfStocks_feature", "_UI_FoodConsumer_type"),
				 FoodproductionPackage.Literals.FOOD_CONSUMER__MAX_VOLUME_OF_STOCKS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(FoodproductionPackage.Literals.DISEASE_CARRYING_TRANSFORMER__STATE_TRANSITIONS_MAP);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns FoodConsumer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/customobj16/FoodConsumer.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FoodConsumer)object).getSourcePopulationName();
		return label == null || label.length() == 0 ?
			getString("_UI_FoodConsumer_type") :
			getString("_UI_FoodConsumer_type") + " " + label;
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

		switch (notification.getFeatureID(FoodConsumer.class)) {
			case FoodproductionPackage.FOOD_CONSUMER__CONSUMPTION_RATE:
			case FoodproductionPackage.FOOD_CONSUMER__CONSUMPTION_TYPE:
			case FoodproductionPackage.FOOD_CONSUMER__WASTE_RATE:
			case FoodproductionPackage.FOOD_CONSUMER__MAX_VOLUME_OF_STOCKS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FoodproductionPackage.FOOD_CONSUMER__STATE_TRANSITIONS_MAP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(FoodproductionPackage.Literals.DISEASE_CARRYING_TRANSFORMER__STATE_TRANSITIONS_MAP,
				 CommonFactory.eINSTANCE.createDoubleValueMatrix()));
	}

}
