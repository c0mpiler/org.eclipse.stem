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
package org.eclipse.stem.diseasemodels.evolving.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.stem.diseasemodels.evolving.EvolvingPackage;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSIDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.provider.SIItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.stem.diseasemodels.evolving.EvolvingSIDiseaseModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EvolvingSIDiseaseModelItemProvider
	extends SIItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolvingSIDiseaseModelItemProvider(AdapterFactory adapterFactory) {
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

			addCaseMutationRatePropertyDescriptor(object);
			addGenomeLengthPropertyDescriptor(object);
			addGeneticDistNonlinExponentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Case Mutation Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCaseMutationRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EvolvingSIDiseaseModel_caseMutationRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EvolvingSIDiseaseModel_caseMutationRate_feature", "_UI_EvolvingSIDiseaseModel_type"),
				 EvolvingPackage.Literals.EVOLVING_SI_DISEASE_MODEL__CASE_MUTATION_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Genome Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenomeLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EvolvingSIDiseaseModel_genomeLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EvolvingSIDiseaseModel_genomeLength_feature", "_UI_EvolvingSIDiseaseModel_type"),
				 EvolvingPackage.Literals.EVOLVING_SI_DISEASE_MODEL__GENOME_LENGTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Genetic Dist Nonlin Exponent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeneticDistNonlinExponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EvolvingSIDiseaseModel_geneticDistNonlinExponent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EvolvingSIDiseaseModel_geneticDistNonlinExponent_feature", "_UI_EvolvingSIDiseaseModel_type"),
				 EvolvingPackage.Literals.EVOLVING_SI_DISEASE_MODEL__GENETIC_DIST_NONLIN_EXPONENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EvolvingSIDiseaseModel)object).getDiseaseName();
		return label == null || label.length() == 0 ?
			getString("_UI_EvolvingSIDiseaseModel_type") :
			getString("_UI_EvolvingSIDiseaseModel_type") + " " + label;
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

		switch (notification.getFeatureID(EvolvingSIDiseaseModel.class)) {
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__GENOME:
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__EVOLUTION_COUNT:
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__CASE_MUTATION_RATE:
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__GENOME_LENGTH:
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__GENETIC_DIST_NONLIN_EXPONENT:
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
