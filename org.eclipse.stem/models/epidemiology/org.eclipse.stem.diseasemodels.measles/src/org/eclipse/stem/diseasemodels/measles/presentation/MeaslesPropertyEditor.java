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
package org.eclipse.stem.diseasemodels.measles.presentation;

import java.util.MissingResourceException;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.stem.diseasemodels.measles.Measles;
import org.eclipse.stem.diseasemodels.measles.MeaslesPackage;
import org.eclipse.stem.diseasemodels.multipopulation.presentation.MultiPopulationDiseaseModelPropertyEditor;
import org.eclipse.stem.diseasemodels.multipopulation.presentation.MultiPopulationPropertyStringProviderAdapterFactory.MultiPopulationPropertyStringProviderAdapter;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;

/**
 * @generated
 */
public class MeaslesPropertyEditor extends
		MultiPopulationDiseaseModelPropertyEditor {
	/**
	 * @param parent
	 * @param style
	 * @param model
	 * @param projectValidator
	 * @generated
	 */
	public MeaslesPropertyEditor(Composite parent, int style,
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

		Measles model = (Measles)object;

 		// Set value for Vaccine Efficacy (Double)
		try {
			Double vaccineEfficacyValue = Double.parseDouble(
				map.get(MeaslesPackage.Literals.MEASLES__VACCINE_EFFICACY).getText());
			model.setVaccineEfficacy(vaccineEfficacyValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Inoculation Scaling (Double)
		try {
			Double inoculationScalingValue = Double.parseDouble(
				map.get(MeaslesPackage.Literals.MEASLES__INOCULATION_SCALING).getText());
			model.setInoculationScaling(inoculationScalingValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Phase Shift (Double)
		try {
			Double phaseShiftValue = Double.parseDouble(
				map.get(MeaslesPackage.Literals.MEASLES__PHASE_SHIFT).getText());
			model.setPhaseShift(phaseShiftValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Seasonal Modulation (Double)
		try {
			Double seasonalModulationValue = Double.parseDouble(
				map.get(MeaslesPackage.Literals.MEASLES__SEASONAL_MODULATION).getText());
			model.setSeasonalModulation(seasonalModulationValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Seasonal Modulation Period (Long)
		try {
			Long seasonalModulationPeriodValue = Long.parseLong(
				map.get(MeaslesPackage.Literals.MEASLES__SEASONAL_MODULATION_PERIOD).getText());
			model.setSeasonalModulationPeriod(seasonalModulationPeriodValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Inoculated Immunity Rate (Double)
		try {
			Double inoculatedImmunityRateValue = Double.parseDouble(
				map.get(MeaslesPackage.Literals.MEASLES__INOCULATED_IMMUNITY_RATE).getText());
			model.setInoculatedImmunityRate(inoculatedImmunityRateValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Newborn Immunity Loss Rate (Double)
		try {
			Double newbornImmunityLossRateValue = Double.parseDouble(
				map.get(MeaslesPackage.Literals.MEASLES__NEWBORN_IMMUNITY_LOSS_RATE).getText());
			model.setNewbornImmunityLossRate(newbornImmunityLossRateValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Transmission Rate Scaling (Double)
		try {
			Double transmissionRateScalingValue = Double.parseDouble(
				map.get(MeaslesPackage.Literals.MEASLES__TRANSMISSION_RATE_SCALING).getText());
			model.setTransmissionRateScaling(transmissionRateScalingValue);
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

		valid = valid && validateFeatureConstraint(MeaslesPackage.Literals.MEASLES__VACCINE_EFFICACY);
		valid = valid && validateFeatureConstraint(MeaslesPackage.Literals.MEASLES__INOCULATION_SCALING);
		valid = valid && validateFeatureConstraint(MeaslesPackage.Literals.MEASLES__PHASE_SHIFT);
		valid = valid && validateFeatureConstraint(MeaslesPackage.Literals.MEASLES__SEASONAL_MODULATION);
		valid = valid && validateFeatureConstraint(MeaslesPackage.Literals.MEASLES__SEASONAL_MODULATION_PERIOD);
		valid = valid && validateFeatureConstraint(MeaslesPackage.Literals.MEASLES__INOCULATED_IMMUNITY_RATE);
		valid = valid && validateFeatureConstraint(MeaslesPackage.Literals.MEASLES__NEWBORN_IMMUNITY_LOSS_RATE);
		valid = valid && validateFeatureConstraint(MeaslesPackage.Literals.MEASLES__TRANSMISSION_RATE_SCALING);

		return valid;
	}


	/**
	 * @generated
	 */
	public static class MeaslesPropertyStringProviderAdapter
		extends MultiPopulationPropertyStringProviderAdapter {
		/**
		 * @param descriptor
		 * @return the NLS'd name of the property to display to the user
		 * @generated
		 */
		public String getPropertyName(IItemPropertyDescriptor descriptor) {
			try {
				return MeaslesWizardMessages
						.getString(((EStructuralFeature) descriptor
								.getFeature(null)).getName(), "Measles");
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
				return MeaslesWizardMessages.getString(feature
						.getName() + TT_SUFFIX, "Measles");
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
				return MeaslesWizardMessages.getString(feature
						.getName() + UNIT_SUFFIX, "Measles");
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
				return MeaslesWizardMessages.getString(feature
						.getName() + MISSING_SUFFIX, "Measles");
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
				return MeaslesWizardMessages.getString(feature
						.getName() + INVALID_SUFFIX, "Measles");
			} catch (MissingResourceException e) {	
				return super.getPropertyInvalid(descriptor);
			}
		} // getPropertyInvalid		
	}

}