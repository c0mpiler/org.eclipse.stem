/**
 * <copyright>
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
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.stem.diseasemodels.polioopvipv.presentation;

import java.util.MissingResourceException;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel;
import org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.ui.wizards.StandardDiseaseModelPropertyEditor;
import org.eclipse.stem.ui.wizards.StandardPropertyStringProviderAdapterFactory.StandardPropertyStringProviderAdapter;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;

/**
 * @generated
 */
public class PolioOpvIpvDiseaseModelPropertyEditor extends
		StandardDiseaseModelPropertyEditor {
	/**
	 * @param parent
	 * @param style
	 * @param model
	 * @param projectValidator
	 * @generated
	 */
	public PolioOpvIpvDiseaseModelPropertyEditor(Composite parent, int style,
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

		PolioOpvIpvDiseaseModel model = (PolioOpvIpvDiseaseModel)object;
 		// Set value for Opv Efficacy (Double)
		try {
			Double opvEfficacyValue = Double.parseDouble(
				map.get(PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__OPV_EFFICACY).getText());
			model.setOpvEfficacy(opvEfficacyValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Reversion Rate OPV (Double)
		try {
			Double reversionRateOPVValue = Double.parseDouble(
				map.get(PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__REVERSION_RATE_OPV).getText());
			model.setReversionRateOPV(reversionRateOPVValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Birth Death Rate Developing (Double)
		try {
			Double birthDeathRateDevelopingValue = Double.parseDouble(
				map.get(PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__BIRTH_DEATH_RATE_DEVELOPING).getText());
			model.setBirthDeathRateDeveloping(birthDeathRateDevelopingValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Transmission Rate OPV (Double)
		try {
			Double transmissionRateOPVValue = Double.parseDouble(
				map.get(PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__TRANSMISSION_RATE_OPV).getText());
			model.setTransmissionRateOPV(transmissionRateOPVValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Transmission Rate Wild (Double)
		try {
			Double transmissionRateWildValue = Double.parseDouble(
				map.get(PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__TRANSMISSION_RATE_WILD).getText());
			model.setTransmissionRateWild(transmissionRateWildValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Relative Susceptibility Recent OPV (Double)
		try {
			Double relativeSusceptibilityRecentOPVValue = Double.parseDouble(
				map.get(PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__RELATIVE_SUSCEPTIBILITY_RECENT_OPV).getText());
			model.setRelativeSusceptibilityRecentOPV(relativeSusceptibilityRecentOPVValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Relative Susceptibility IPV (Double)
		try {
			Double relativeSusceptibilityIPVValue = Double.parseDouble(
				map.get(PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__RELATIVE_SUSCEPTIBILITY_IPV).getText());
			model.setRelativeSusceptibilityIPV(relativeSusceptibilityIPVValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Incubation Rate Vaccine (Double)
		try {
			Double incubationRateVaccineValue = Double.parseDouble(
				map.get(PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__INCUBATION_RATE_VACCINE).getText());
			model.setIncubationRateVaccine(incubationRateVaccineValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Incubation Rate Wild (Double)
		try {
			Double incubationRateWildValue = Double.parseDouble(
				map.get(PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__INCUBATION_RATE_WILD).getText());
			model.setIncubationRateWild(incubationRateWildValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Recovery Rate Vaccine (Double)
		try {
			Double recoveryRateVaccineValue = Double.parseDouble(
				map.get(PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__RECOVERY_RATE_VACCINE).getText());
			model.setRecoveryRateVaccine(recoveryRateVaccineValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Recovery Rate Wild (Double)
		try {
			Double recoveryRateWildValue = Double.parseDouble(
				map.get(PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__RECOVERY_RATE_WILD).getText());
			model.setRecoveryRateWild(recoveryRateWildValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Paralytic Incidence From Vaccine (Double)
		try {
			Double paralyticIncidenceFromVaccineValue = Double.parseDouble(
				map.get(PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__PARALYTIC_INCIDENCE_FROM_VACCINE).getText());
			model.setParalyticIncidenceFromVaccine(paralyticIncidenceFromVaccineValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Paralytic Case Proportion (Double)
		try {
			Double paralyticCaseProportionValue = Double.parseDouble(
				map.get(PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__PARALYTIC_CASE_PROPORTION).getText());
			model.setParalyticCaseProportion(paralyticCaseProportionValue);
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

		valid = valid && validateFeatureConstraint(PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__OPV_EFFICACY);
		valid = valid && validateFeatureConstraint(PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__REVERSION_RATE_OPV);
		valid = valid && validateFeatureConstraint(PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__BIRTH_DEATH_RATE_DEVELOPING);
		valid = valid && validateFeatureConstraint(PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__TRANSMISSION_RATE_OPV);
		valid = valid && validateFeatureConstraint(PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__TRANSMISSION_RATE_WILD);
		valid = valid && validateFeatureConstraint(PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__RELATIVE_SUSCEPTIBILITY_RECENT_OPV);
		valid = valid && validateFeatureConstraint(PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__RELATIVE_SUSCEPTIBILITY_IPV);
		valid = valid && validateFeatureConstraint(PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__INCUBATION_RATE_VACCINE);
		valid = valid && validateFeatureConstraint(PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__INCUBATION_RATE_WILD);
		valid = valid && validateFeatureConstraint(PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__RECOVERY_RATE_VACCINE);
		valid = valid && validateFeatureConstraint(PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__RECOVERY_RATE_WILD);
		valid = valid && validateFeatureConstraint(PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__PARALYTIC_INCIDENCE_FROM_VACCINE);
		valid = valid && validateFeatureConstraint(PolioOpvIpvPackage.Literals.POLIO_OPV_IPV_DISEASE_MODEL__PARALYTIC_CASE_PROPORTION);

		return valid;
	}


	/**
	 * @generated
	 */
	public static class PolioOpvIpvDiseaseModelPropertyStringProviderAdapter
		extends StandardPropertyStringProviderAdapter {
		/**
		 * @param descriptor
		 * @return the NLS'd name of the property to display to the user
		 * @generated
		 */
		public String getPropertyName(IItemPropertyDescriptor descriptor) {
			try {
				return PolioOpvIpvWizardMessages
						.getString(((EStructuralFeature) descriptor
								.getFeature(null)).getName(), "PolioOpvIpvDiseaseModel");
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
				return PolioOpvIpvWizardMessages.getString(feature
						.getName() + TT_SUFFIX, "PolioOpvIpvDiseaseModel");
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
				return PolioOpvIpvWizardMessages.getString(feature
						.getName() + UNIT_SUFFIX, "PolioOpvIpvDiseaseModel");
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
				return PolioOpvIpvWizardMessages.getString(feature
						.getName() + MISSING_SUFFIX, "PolioOpvIpvDiseaseModel");
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
				return PolioOpvIpvWizardMessages.getString(feature
						.getName() + INVALID_SUFFIX, "PolioOpvIpvDiseaseModel");
			} catch (MissingResourceException e) {	
				return super.getPropertyInvalid(descriptor);
			}
		} // getPropertyInvalid		
	}

}