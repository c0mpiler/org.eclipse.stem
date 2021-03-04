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
package org.eclipse.stem.diseasemodels.vector.presentation;

import java.util.MissingResourceException;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.diseasemodels.vector.VectorPackage;
import org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel;
import org.eclipse.stem.ui.wizards.StandardDiseaseModelPropertyEditor;
import org.eclipse.stem.ui.wizards.StandardPropertyStringProviderAdapterFactory.StandardPropertyStringProviderAdapter;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;

/**
 * @generated
 */
public class VerySimpleDengueModelPropertyEditor extends
		StandardDiseaseModelPropertyEditor {
	/**
	 * @param parent
	 * @param style
	 * @param model
	 * @param projectValidator
	 * @generated
	 */
	public VerySimpleDengueModelPropertyEditor(Composite parent, int style,
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

		VerySimpleDengueModel model = (VerySimpleDengueModel)object;
 		// Set value for Transmission Rate (Double)
		try {
			Double transmissionRateValue = Double.parseDouble(
				map.get(VectorPackage.Literals.VERY_SIMPLE_DENGUE_MODEL__TRANSMISSION_RATE).getText());
			model.setTransmissionRate(transmissionRateValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Recovery Rate (Double)
		try {
			Double recoveryRateValue = Double.parseDouble(
				map.get(VectorPackage.Literals.VERY_SIMPLE_DENGUE_MODEL__RECOVERY_RATE).getText());
			model.setRecoveryRate(recoveryRateValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Immunity Loss Rate (Double)
		try {
			Double immunityLossRateValue = Double.parseDouble(
				map.get(VectorPackage.Literals.VERY_SIMPLE_DENGUE_MODEL__IMMUNITY_LOSS_RATE).getText());
			model.setImmunityLossRate(immunityLossRateValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Ade Factor (Double)
		try {
			Double adeFactorValue = Double.parseDouble(
				map.get(VectorPackage.Literals.VERY_SIMPLE_DENGUE_MODEL__ADE_FACTOR).getText());
			model.setAdeFactor(adeFactorValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Immunity Strength (Double)
		try {
			Double immunityStrengthValue = Double.parseDouble(
				map.get(VectorPackage.Literals.VERY_SIMPLE_DENGUE_MODEL__IMMUNITY_STRENGTH).getText());
			model.setImmunityStrength(immunityStrengthValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Primary Death Rate (Double)
		try {
			Double primaryDeathRateValue = Double.parseDouble(
				map.get(VectorPackage.Literals.VERY_SIMPLE_DENGUE_MODEL__PRIMARY_DEATH_RATE).getText());
			model.setPrimaryDeathRate(primaryDeathRateValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Secondary Death Rate (Double)
		try {
			Double secondaryDeathRateValue = Double.parseDouble(
				map.get(VectorPackage.Literals.VERY_SIMPLE_DENGUE_MODEL__SECONDARY_DEATH_RATE).getText());
			model.setSecondaryDeathRate(secondaryDeathRateValue);
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

		valid = valid && validateFeatureConstraint(VectorPackage.Literals.VERY_SIMPLE_DENGUE_MODEL__TRANSMISSION_RATE);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.VERY_SIMPLE_DENGUE_MODEL__RECOVERY_RATE);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.VERY_SIMPLE_DENGUE_MODEL__IMMUNITY_LOSS_RATE);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.VERY_SIMPLE_DENGUE_MODEL__ADE_FACTOR);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.VERY_SIMPLE_DENGUE_MODEL__IMMUNITY_STRENGTH);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.VERY_SIMPLE_DENGUE_MODEL__PRIMARY_DEATH_RATE);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.VERY_SIMPLE_DENGUE_MODEL__SECONDARY_DEATH_RATE);

		return valid;
	}


	/**
	 * @generated
	 */
	public static class VerySimpleDengueModelPropertyStringProviderAdapter
		extends StandardPropertyStringProviderAdapter {
		/**
		 * @param descriptor
		 * @return the NLS'd name of the property to display to the user
		 * @generated
		 */
		public String getPropertyName(IItemPropertyDescriptor descriptor) {
			try {
				return VectorWizardMessages
						.getString(((EStructuralFeature) descriptor
								.getFeature(null)).getName(), "VerySimpleDengueModel");
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
				return VectorWizardMessages.getString(feature
						.getName() + TT_SUFFIX, "VerySimpleDengueModel");
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
				return VectorWizardMessages.getString(feature
						.getName() + UNIT_SUFFIX, "VerySimpleDengueModel");
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
				return VectorWizardMessages.getString(feature
						.getName() + MISSING_SUFFIX, "VerySimpleDengueModel");
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
				return VectorWizardMessages.getString(feature
						.getName() + INVALID_SUFFIX, "VerySimpleDengueModel");
			} catch (MissingResourceException e) {	
				return super.getPropertyInvalid(descriptor);
			}
		} // getPropertyInvalid		
	}

}