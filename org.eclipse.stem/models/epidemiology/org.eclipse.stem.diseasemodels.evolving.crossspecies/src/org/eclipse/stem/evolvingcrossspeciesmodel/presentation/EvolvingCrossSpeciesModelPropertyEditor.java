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
package org.eclipse.stem.evolvingcrossspeciesmodel.presentation;

import java.util.MissingResourceException;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.stem.diseasemodels.evolving.presentation.EvolvingSIRDiseaseModelPropertyEditor;
import org.eclipse.stem.diseasemodels.evolving.presentation.EvolvingSIRDiseaseModelPropertyEditor.EvolvingSIRDiseaseModelPropertyStringProviderAdapter;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModel;
import org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelPackage;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;

/**
 * @generated
 */
public class EvolvingCrossSpeciesModelPropertyEditor extends
		EvolvingSIRDiseaseModelPropertyEditor {
	/**
	 * @param parent
	 * @param style
	 * @param model
	 * @param projectValidator
	 * @generated
	 */
	public EvolvingCrossSpeciesModelPropertyEditor(Composite parent, int style,
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

		EvolvingCrossSpeciesModel model = (EvolvingCrossSpeciesModel)object;

 		// Set value for Other To Other Transmission Rate (Double)
		try {
			Double otherToOtherTransmissionRateValue = Double.parseDouble(
				map.get(EvolvingCrossSpeciesModelPackage.Literals.EVOLVING_CROSS_SPECIES_MODEL__OTHER_TO_OTHER_TRANSMISSION_RATE).getText());
			model.setOtherToOtherTransmissionRate(otherToOtherTransmissionRateValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Other Recovery Rate (Double)
		try {
			Double otherRecoveryRateValue = Double.parseDouble(
				map.get(EvolvingCrossSpeciesModelPackage.Literals.EVOLVING_CROSS_SPECIES_MODEL__OTHER_RECOVERY_RATE).getText());
			model.setOtherRecoveryRate(otherRecoveryRateValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Other To Host Transmission Rate (Double)
		try {
			Double otherToHostTransmissionRateValue = Double.parseDouble(
				map.get(EvolvingCrossSpeciesModelPackage.Literals.EVOLVING_CROSS_SPECIES_MODEL__OTHER_TO_HOST_TRANSMISSION_RATE).getText());
			model.setOtherToHostTransmissionRate(otherToHostTransmissionRateValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Temperature Factor (Double)
		try {
			Double temperatureFactorValue = Double.parseDouble(
				map.get(EvolvingCrossSpeciesModelPackage.Literals.EVOLVING_CROSS_SPECIES_MODEL__TEMPERATURE_FACTOR).getText());
			model.setTemperatureFactor(temperatureFactorValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Other Population Identifier (String)
  		String otherPopulationIdentifierValue = map.get(EvolvingCrossSpeciesModelPackage.Literals.EVOLVING_CROSS_SPECIES_MODEL__OTHER_POPULATION_IDENTIFIER).getText();
		model.setOtherPopulationIdentifier(otherPopulationIdentifierValue);
 		// Set value for Other Immunity Loss Rate (Double)
		try {
			Double otherImmunityLossRateValue = Double.parseDouble(
				map.get(EvolvingCrossSpeciesModelPackage.Literals.EVOLVING_CROSS_SPECIES_MODEL__OTHER_IMMUNITY_LOSS_RATE).getText());
			model.setOtherImmunityLossRate(otherImmunityLossRateValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Incubation Rate (Double)
		try {
			Double incubationRateValue = Double.parseDouble(
				map.get(EvolvingCrossSpeciesModelPackage.Literals.EVOLVING_CROSS_SPECIES_MODEL__INCUBATION_RATE).getText());
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

		valid = valid && validateFeatureConstraint(EvolvingCrossSpeciesModelPackage.Literals.EVOLVING_CROSS_SPECIES_MODEL__OTHER_TO_OTHER_TRANSMISSION_RATE);
		valid = valid && validateFeatureConstraint(EvolvingCrossSpeciesModelPackage.Literals.EVOLVING_CROSS_SPECIES_MODEL__OTHER_RECOVERY_RATE);
		valid = valid && validateFeatureConstraint(EvolvingCrossSpeciesModelPackage.Literals.EVOLVING_CROSS_SPECIES_MODEL__OTHER_TO_HOST_TRANSMISSION_RATE);
		valid = valid && validateFeatureConstraint(EvolvingCrossSpeciesModelPackage.Literals.EVOLVING_CROSS_SPECIES_MODEL__TEMPERATURE_FACTOR);
		valid = valid && validateFeatureConstraint(EvolvingCrossSpeciesModelPackage.Literals.EVOLVING_CROSS_SPECIES_MODEL__OTHER_POPULATION_IDENTIFIER);
		valid = valid && validateFeatureConstraint(EvolvingCrossSpeciesModelPackage.Literals.EVOLVING_CROSS_SPECIES_MODEL__OTHER_IMMUNITY_LOSS_RATE);
		valid = valid && validateFeatureConstraint(EvolvingCrossSpeciesModelPackage.Literals.EVOLVING_CROSS_SPECIES_MODEL__INCUBATION_RATE);

		return valid;
	}


	/**
	 * @generated
	 */
	public static class EvolvingCrossSpeciesModelPropertyStringProviderAdapter
		extends EvolvingSIRDiseaseModelPropertyStringProviderAdapter {
		/**
		 * @param descriptor
		 * @return the NLS'd name of the property to display to the user
		 * @generated
		 */
		public String getPropertyName(IItemPropertyDescriptor descriptor) {
			try {
				return EvolvingCrossSpeciesModelWizardMessages
						.getString(((EStructuralFeature) descriptor
								.getFeature(null)).getName(), "EvolvingCrossSpeciesModel");
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
				return EvolvingCrossSpeciesModelWizardMessages.getString(feature
						.getName() + TT_SUFFIX, "EvolvingCrossSpeciesModel");
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
				return EvolvingCrossSpeciesModelWizardMessages.getString(feature
						.getName() + UNIT_SUFFIX, "EvolvingCrossSpeciesModel");
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
				return EvolvingCrossSpeciesModelWizardMessages.getString(feature
						.getName() + MISSING_SUFFIX, "EvolvingCrossSpeciesModel");
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
				return EvolvingCrossSpeciesModelWizardMessages.getString(feature
						.getName() + INVALID_SUFFIX, "EvolvingCrossSpeciesModel");
			} catch (MissingResourceException e) {	
				return super.getPropertyInvalid(descriptor);
			}
		} // getPropertyInvalid		
	}

}