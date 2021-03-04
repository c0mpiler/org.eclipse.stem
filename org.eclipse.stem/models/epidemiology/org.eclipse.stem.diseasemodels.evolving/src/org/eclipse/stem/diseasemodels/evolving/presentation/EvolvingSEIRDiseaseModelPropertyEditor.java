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
package org.eclipse.stem.diseasemodels.evolving.presentation;

import java.util.MissingResourceException;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.stem.diseasemodels.evolving.EvolvingPackage;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSEIRDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.ui.wizards.StandardPropertyStringProviderAdapterFactory.StandardPropertyStringProviderAdapter;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;

/**
 * @generated
 */
public class EvolvingSEIRDiseaseModelPropertyEditor extends
		EvolvingSIRDiseaseModelPropertyEditor {
	/**
	 * @param parent
	 * @param style
	 * @param model
	 * @param projectValidator
	 * @generated
	 */
	public EvolvingSEIRDiseaseModelPropertyEditor(Composite parent, int style,
			DiseaseModel model, ModifyListener projectValidator,
			IProject project) {
		super(parent, style, model, projectValidator, project);
	}

	/**
	 * @generated
	 */
	@Override
	public void populate(DiseaseModel object) {
		super.populate(object);

		EvolvingSEIRDiseaseModel model = (EvolvingSEIRDiseaseModel)object;

 		// Set value for Incubation Rate (Double)
		try {
			Double incubationRateValue = Double.parseDouble(
				map.get(EvolvingPackage.Literals.EVOLVING_SEIR_DISEASE_MODEL__INCUBATION_RATE).getText());
			model.setIncubationRate(incubationRateValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
	}

	/**
	 * @generated
	 */
	@Override
	public boolean validate() {
		boolean valid = super.validate();

		valid = valid && validateFeatureConstraint(EvolvingPackage.Literals.EVOLVING_SEIR_DISEASE_MODEL__INCUBATION_RATE);

		return valid;
	}


	/**
	 * @generated
	 */
	public static class EvolvingSEIRDiseaseModelPropertyStringProviderAdapter
		extends StandardPropertyStringProviderAdapter {
		/**
		 * @param descriptor
		 * @return the NLS'd name of the property to display to the user
		 * @generated
		 */
		public String getPropertyName(IItemPropertyDescriptor descriptor) {
			try {
				return EvolvingWizardMessages
						.getString(((EStructuralFeature) descriptor
								.getFeature(null)).getName(), "EvolvingSEIRDiseaseModel");
			} catch (MissingResourceException e) {
				return super.getPropertyName(descriptor);
			}
		} // getPropertyName

		/**
		 * @param descriptor
		 * @return the NLS'd tool tip text that describes the property
		 * @generated
		 */
		public String getPropertyToolTip(
				IItemPropertyDescriptor descriptor) {
			try {
				final EStructuralFeature feature = (EStructuralFeature) descriptor
						.getFeature(null);
				return EvolvingWizardMessages.getString(feature
						.getName() + TT_SUFFIX, "EvolvingSEIRDiseaseModel");
			} catch (MissingResourceException e) {
				return super.getPropertyToolTip(descriptor);
			}
		} // getPropertyToolTip

		/**
		 * @param descriptor
		 * @return the NLS'd text that represents the units of the
		 *         property
		 * @generated
		 */
		public String getPropertyUnits(
				IItemPropertyDescriptor descriptor) {
			try {
				final EStructuralFeature feature = (EStructuralFeature) descriptor
						.getFeature(null);
				return EvolvingWizardMessages.getString(feature
						.getName() + UNIT_SUFFIX, "EvolvingSEIRDiseaseModel");
			} catch (MissingResourceException e) {
				return super.getPropertyUnits(descriptor);
			}
		} // getPropertyUnits
		
		/**
		 * @param descriptor
		 * @return the NLS'd text for a missing property error message
		 * @generated
		 */
		public String getPropertyMissing(
				IItemPropertyDescriptor descriptor) {
			try {
				final EStructuralFeature feature = (EStructuralFeature) descriptor
						.getFeature(null);
				return EvolvingWizardMessages.getString(feature
						.getName() + MISSING_SUFFIX, "EvolvingSEIRDiseaseModel");
			} catch (MissingResourceException e) {
				return super.getPropertyMissing(descriptor);
			}
		} // getPropertyMissing
		
		/**
		 * @param descriptor
		 * @return the NLS'd text for a missing property error message
		 * @generated
		 */
		public String getPropertyInvalid(
				IItemPropertyDescriptor descriptor) {
			try {
				final EStructuralFeature feature = (EStructuralFeature) descriptor
						.getFeature(null);
				return EvolvingWizardMessages.getString(feature
						.getName() + INVALID_SUFFIX, "EvolvingSEIRDiseaseModel");
			} catch (MissingResourceException e) {	
				return super.getPropertyInvalid(descriptor);
			}
		} // getPropertyInvalid		
	}

}