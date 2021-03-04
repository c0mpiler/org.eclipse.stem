/**
 */
package org.eclipse.stem.interventions.provider;


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
import org.eclipse.stem.interventions.InterventionsPackage;
import org.eclipse.stem.interventions.StandardPeriodicInterventionLabelValue;

/**
 * This is the item provider adapter for a {@link org.eclipse.stem.interventions.StandardPeriodicInterventionLabelValue} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StandardPeriodicInterventionLabelValueItemProvider
	extends InterventionLabelValueItemProvider
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
	public StandardPeriodicInterventionLabelValueItemProvider(AdapterFactory adapterFactory) {
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

			addAbsolutePropertyDescriptor(object);
			addPeriodPropertyDescriptor(object);
			addVaccinationsPropertyDescriptor(object);
			addIsolationsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Absolute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbsolutePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StandardPeriodicInterventionLabelValue_absolute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StandardPeriodicInterventionLabelValue_absolute_feature", "_UI_StandardPeriodicInterventionLabelValue_type"),
				 InterventionsPackage.Literals.STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__ABSOLUTE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Period feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPeriodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StandardPeriodicInterventionLabelValue_period_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StandardPeriodicInterventionLabelValue_period_feature", "_UI_StandardPeriodicInterventionLabelValue_type"),
				 InterventionsPackage.Literals.STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__PERIOD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vaccinations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVaccinationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StandardPeriodicInterventionLabelValue_vaccinations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StandardPeriodicInterventionLabelValue_vaccinations_feature", "_UI_StandardPeriodicInterventionLabelValue_type"),
				 InterventionsPackage.Literals.STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__VACCINATIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Isolations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsolationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StandardPeriodicInterventionLabelValue_isolations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StandardPeriodicInterventionLabelValue_isolations_feature", "_UI_StandardPeriodicInterventionLabelValue_type"),
				 InterventionsPackage.Literals.STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__ISOLATIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns StandardPeriodicInterventionLabelValue.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/StandardPeriodicInterventionLabelValue"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		StandardPeriodicInterventionLabelValue standardPeriodicInterventionLabelValue = (StandardPeriodicInterventionLabelValue)object;
		return getString("_UI_StandardPeriodicInterventionLabelValue_type") + " " + standardPeriodicInterventionLabelValue.isAbsolute();
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

		switch (notification.getFeatureID(StandardPeriodicInterventionLabelValue.class)) {
			case InterventionsPackage.STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__ABSOLUTE:
			case InterventionsPackage.STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__PERIOD:
			case InterventionsPackage.STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__VACCINATIONS:
			case InterventionsPackage.STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__ISOLATIONS:
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
