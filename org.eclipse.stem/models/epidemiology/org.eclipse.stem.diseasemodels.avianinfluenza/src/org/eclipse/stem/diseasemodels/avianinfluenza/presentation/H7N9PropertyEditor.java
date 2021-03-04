package org.eclipse.stem.diseasemodels.avianinfluenza.presentation;

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

import java.util.MissingResourceException;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.stem.diseasemodels.avianinfluenza.AvianinfluenzaPackage;
import org.eclipse.stem.diseasemodels.avianinfluenza.H7N9;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.diseasemodels.vector.presentation.VectorDiseaseModelPropertyEditor;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;

/**
 * @generated
 */
public class H7N9PropertyEditor extends
		VectorDiseaseModelPropertyEditor {
	/**
	 * @param parent
	 * @param style
	 * @param model
	 * @param projectValidator
	 * @generated
	 */
	public H7N9PropertyEditor(Composite parent, int style,
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

		H7N9 model = (H7N9)object;

 		// Set value for Avian To Avian Transmission Rate (Double)
		try {
			Double avianToAvianTransmissionRateValue = Double.parseDouble(
				map.get(AvianinfluenzaPackage.Literals.H7N9__AVIAN_TO_AVIAN_TRANSMISSION_RATE).getText());
			model.setAvianToAvianTransmissionRate(avianToAvianTransmissionRateValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Avian Recovery Rate (Double)
		try {
			Double avianRecoveryRateValue = Double.parseDouble(
				map.get(AvianinfluenzaPackage.Literals.H7N9__AVIAN_RECOVERY_RATE).getText());
			model.setAvianRecoveryRate(avianRecoveryRateValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Avian To Human Transmission Rate (Double)
		try {
			Double avianToHumanTransmissionRateValue = Double.parseDouble(
				map.get(AvianinfluenzaPackage.Literals.H7N9__AVIAN_TO_HUMAN_TRANSMISSION_RATE).getText());
			model.setAvianToHumanTransmissionRate(avianToHumanTransmissionRateValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Human To Human Transmission Rate (Double)
		try {
			Double humanToHumanTransmissionRateValue = Double.parseDouble(
				map.get(AvianinfluenzaPackage.Literals.H7N9__HUMAN_TO_HUMAN_TRANSMISSION_RATE).getText());
			model.setHumanToHumanTransmissionRate(humanToHumanTransmissionRateValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Avian Characteristic Mixing Distance (Double)
		try {
			Double avianCharacteristicMixingDistanceValue = Double.parseDouble(
				map.get(AvianinfluenzaPackage.Literals.H7N9__AVIAN_CHARACTERISTIC_MIXING_DISTANCE).getText());
			model.setAvianCharacteristicMixingDistance(avianCharacteristicMixingDistanceValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Human Recovery Rate (Double)
		try {
			Double humanRecoveryRateValue = Double.parseDouble(
				map.get(AvianinfluenzaPackage.Literals.H7N9__HUMAN_RECOVERY_RATE).getText());
			model.setHumanRecoveryRate(humanRecoveryRateValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Human Immunity Loss Rate (Double)
		try {
			Double humanImmunityLossRateValue = Double.parseDouble(
				map.get(AvianinfluenzaPackage.Literals.H7N9__HUMAN_IMMUNITY_LOSS_RATE).getText());
			model.setHumanImmunityLossRate(humanImmunityLossRateValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Temperature Factor (Double)
		try {
			Double temperatureFactorValue = Double.parseDouble(
				map.get(AvianinfluenzaPackage.Literals.H7N9__TEMPERATURE_FACTOR).getText());
			model.setTemperatureFactor(temperatureFactorValue);
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

		valid = valid && validateFeatureConstraint(AvianinfluenzaPackage.Literals.H7N9__AVIAN_TO_AVIAN_TRANSMISSION_RATE);
		valid = valid && validateFeatureConstraint(AvianinfluenzaPackage.Literals.H7N9__AVIAN_RECOVERY_RATE);
		valid = valid && validateFeatureConstraint(AvianinfluenzaPackage.Literals.H7N9__AVIAN_TO_HUMAN_TRANSMISSION_RATE);
		valid = valid && validateFeatureConstraint(AvianinfluenzaPackage.Literals.H7N9__HUMAN_TO_HUMAN_TRANSMISSION_RATE);
		valid = valid && validateFeatureConstraint(AvianinfluenzaPackage.Literals.H7N9__AVIAN_CHARACTERISTIC_MIXING_DISTANCE);
		valid = valid && validateFeatureConstraint(AvianinfluenzaPackage.Literals.H7N9__HUMAN_RECOVERY_RATE);
		valid = valid && validateFeatureConstraint(AvianinfluenzaPackage.Literals.H7N9__HUMAN_IMMUNITY_LOSS_RATE);
		valid = valid && validateFeatureConstraint(AvianinfluenzaPackage.Literals.H7N9__TEMPERATURE_FACTOR);

		return valid;
	}


	/**
	 * @generated
	 */
	public static class H7N9PropertyStringProviderAdapter
		extends VectorDiseaseModelPropertyStringProviderAdapter {
		/**
		 * @param descriptor
		 * @return the NLS'd name of the property to display to the user
		 * @generated
		 */
		public String getPropertyName(IItemPropertyDescriptor descriptor) {
			try {
				return AvianinfluenzaWizardMessages
						.getString(((EStructuralFeature) descriptor
								.getFeature(null)).getName(), "H7N9");
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
				return AvianinfluenzaWizardMessages.getString(feature
						.getName() + TT_SUFFIX, "H7N9");
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
				return AvianinfluenzaWizardMessages.getString(feature
						.getName() + UNIT_SUFFIX, "H7N9");
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
				return AvianinfluenzaWizardMessages.getString(feature
						.getName() + MISSING_SUFFIX, "H7N9");
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
				return AvianinfluenzaWizardMessages.getString(feature
						.getName() + INVALID_SUFFIX, "H7N9");
			} catch (MissingResourceException e) {	
				return super.getPropertyInvalid(descriptor);
			}
		} // getPropertyInvalid		
	}

}