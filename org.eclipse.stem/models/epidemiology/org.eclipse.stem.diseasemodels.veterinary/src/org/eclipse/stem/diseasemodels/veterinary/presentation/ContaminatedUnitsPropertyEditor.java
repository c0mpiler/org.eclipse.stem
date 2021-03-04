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
package org.eclipse.stem.diseasemodels.veterinary.presentation;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.core.resources.IProject;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import java.util.MissingResourceException;
import org.eclipse.stem.diseasemodels.veterinary.ContaminatedUnits;
import org.eclipse.stem.diseasemodels.veterinary.VeterinaryPackage;

import org.eclipse.stem.populationmodels.standard.PopulationModel;

import org.eclipse.stem.ui.populationmodels.adapters.PopulationModelPropertyEditor;

import org.eclipse.stem.ui.populationmodels.standard.wizards.StandardPropertyStringProviderAdapterFactory.StandardPropertyStringProviderAdapter;

/**
 * @generated
 */
public class ContaminatedUnitsPropertyEditor extends
		PopulationModelPropertyEditor {
	/**
	 * @param parent
	 * @param style
	 * @param model
	 * @param projectValidator
	 * @generated
	 */
	public ContaminatedUnitsPropertyEditor(Composite parent, int style,
			PopulationModel model, ModifyListener projectValidator,
			IProject project) {
		super(parent, style, model, projectValidator, project);
	}

	/**
	 * @generated
	 */
	@Override
	public void populate(PopulationModel object) {
		super.populate(object);

		ContaminatedUnits model = (ContaminatedUnits)object;

 		// Set value for Dissapation Rate (Double)
		try {
			Double dissapationRateValue = Double.parseDouble(
				map.get(VeterinaryPackage.Literals.CONTAMINATED_UNITS__DISSAPATION_RATE).getText());
			model.setDissapationRate(dissapationRateValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Shedding Factor (Double)
		try {
			Double sheddingFactorValue = Double.parseDouble(
				map.get(VeterinaryPackage.Literals.CONTAMINATED_UNITS__SHEDDING_FACTOR).getText());
			model.setSheddingFactor(sheddingFactorValue);
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

		valid = valid && validateFeatureConstraint(VeterinaryPackage.Literals.CONTAMINATED_UNITS__DISSAPATION_RATE);
		valid = valid && validateFeatureConstraint(VeterinaryPackage.Literals.CONTAMINATED_UNITS__SHEDDING_FACTOR);

		return valid;
	}


	/**
	 * @generated
	 */
	public static class ContaminatedUnitsPropertyStringProviderAdapter
		extends StandardPropertyStringProviderAdapter {
		/**
		 * @param descriptor
		 * @return the NLS'd name of the property to display to the user
		 * @generated
		 */
		public String getPropertyName(IItemPropertyDescriptor descriptor) {
			try {
				return VeterinaryWizardMessages
						.getString(((EStructuralFeature) descriptor
								.getFeature(null)).getName(), "ContaminatedUnits");
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
				return VeterinaryWizardMessages.getString(feature
						.getName() + TT_SUFFIX, "ContaminatedUnits");
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
				return VeterinaryWizardMessages.getString(feature
						.getName() + UNIT_SUFFIX, "ContaminatedUnits");
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
				return VeterinaryWizardMessages.getString(feature
						.getName() + MISSING_SUFFIX, "ContaminatedUnits");
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
				return VeterinaryWizardMessages.getString(feature
						.getName() + INVALID_SUFFIX, "ContaminatedUnits");
			} catch (MissingResourceException e) {	
				return super.getPropertyInvalid(descriptor);
			}
		} // getPropertyInvalid		
	}

}