/**
 */
package org.eclipse.stem.diseasemodels.evolving.provider;


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
import org.eclipse.stem.core.model.provider.TransformationDecoratorItemProvider;
import org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseTransformer;
import org.eclipse.stem.diseasemodels.evolving.EvolvingPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseTransformer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EvolvingDiseaseTransformerItemProvider extends TransformationDecoratorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolvingDiseaseTransformerItemProvider(AdapterFactory adapterFactory) {
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

			addBaseDiseasePropertyDescriptor(object);
			addEvolvedDiseasesPropertyDescriptor(object);
			addEvolutionCountPropertyDescriptor(object);
			addEvolutionCountHardLimitPropertyDescriptor(object);
			addStopAllEvolutionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Base Disease feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseDiseasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EvolvingDiseaseTransformer_baseDisease_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EvolvingDiseaseTransformer_baseDisease_feature", "_UI_EvolvingDiseaseTransformer_type"),
				 EvolvingPackage.Literals.EVOLVING_DISEASE_TRANSFORMER__BASE_DISEASE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Evolved Diseases feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEvolvedDiseasesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EvolvingDiseaseTransformer_evolvedDiseases_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EvolvingDiseaseTransformer_evolvedDiseases_feature", "_UI_EvolvingDiseaseTransformer_type"),
				 EvolvingPackage.Literals.EVOLVING_DISEASE_TRANSFORMER__EVOLVED_DISEASES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Evolution Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEvolutionCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EvolvingDiseaseTransformer_evolutionCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EvolvingDiseaseTransformer_evolutionCount_feature", "_UI_EvolvingDiseaseTransformer_type"),
				 EvolvingPackage.Literals.EVOLVING_DISEASE_TRANSFORMER__EVOLUTION_COUNT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Evolution Count Hard Limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEvolutionCountHardLimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EvolvingDiseaseTransformer_evolutionCountHardLimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EvolvingDiseaseTransformer_evolutionCountHardLimit_feature", "_UI_EvolvingDiseaseTransformer_type"),
				 EvolvingPackage.Literals.EVOLVING_DISEASE_TRANSFORMER__EVOLUTION_COUNT_HARD_LIMIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stop All Evolution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStopAllEvolutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EvolvingDiseaseTransformer_stopAllEvolution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EvolvingDiseaseTransformer_stopAllEvolution_feature", "_UI_EvolvingDiseaseTransformer_type"),
				 EvolvingPackage.Literals.EVOLVING_DISEASE_TRANSFORMER__STOP_ALL_EVOLUTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns EvolvingDiseaseTransformer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EvolvingDiseaseTransformer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		URI labelValue = ((EvolvingDiseaseTransformer)object).getURI();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_EvolvingDiseaseTransformer_type") :
			getString("_UI_EvolvingDiseaseTransformer_type") + " " + label;
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

		switch (notification.getFeatureID(EvolvingDiseaseTransformer.class)) {
			case EvolvingPackage.EVOLVING_DISEASE_TRANSFORMER__EVOLUTION_COUNT:
			case EvolvingPackage.EVOLVING_DISEASE_TRANSFORMER__EVOLUTION_COUNT_HARD_LIMIT:
			case EvolvingPackage.EVOLVING_DISEASE_TRANSFORMER__STOP_ALL_EVOLUTION:
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
		return EvolvingEditPlugin.INSTANCE;
	}

}
