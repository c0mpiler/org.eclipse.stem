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
import org.eclipse.stem.diseasemodels.vector.MacdonaldRossDiseaseModel;
import org.eclipse.stem.diseasemodels.vector.VectorPackage;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;

/**
 * @generated
 */
public class MacdonaldRossDiseaseModelPropertyEditor extends
		VectorDiseaseModelPropertyEditor {
	/**
	 * @param parent
	 * @param style
	 * @param model
	 * @param projectValidator
	 * @generated
	 */
	public MacdonaldRossDiseaseModelPropertyEditor(Composite parent, int style,
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

		MacdonaldRossDiseaseModel model = (MacdonaldRossDiseaseModel)object;
 		// Set value for Biting Rate (Double)
		try {
			Double bitingRateValue = Double.parseDouble(
				map.get(VectorPackage.Literals.MACDONALD_ROSS_DISEASE_MODEL__BITING_RATE).getText());
			model.setBitingRate(bitingRateValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Infectious Biting Proportion Human (Double)
		try {
			Double infectiousBitingProportionHumanValue = Double.parseDouble(
				map.get(VectorPackage.Literals.MACDONALD_ROSS_DISEASE_MODEL__INFECTIOUS_BITING_PROPORTION_HUMAN).getText());
			model.setInfectiousBitingProportionHuman(infectiousBitingProportionHumanValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Infectious Biting Proportion Vector (Double)
		try {
			Double infectiousBitingProportionVectorValue = Double.parseDouble(
				map.get(VectorPackage.Literals.MACDONALD_ROSS_DISEASE_MODEL__INFECTIOUS_BITING_PROPORTION_VECTOR).getText());
			model.setInfectiousBitingProportionVector(infectiousBitingProportionVectorValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Recovery Rate (Double)
		try {
			Double recoveryRateValue = Double.parseDouble(
				map.get(VectorPackage.Literals.MACDONALD_ROSS_DISEASE_MODEL__RECOVERY_RATE).getText());
			model.setRecoveryRate(recoveryRateValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Incubation Rate (Double)
		try {
			Double incubationRateValue = Double.parseDouble(
				map.get(VectorPackage.Literals.MACDONALD_ROSS_DISEASE_MODEL__INCUBATION_RATE).getText());
			model.setIncubationRate(incubationRateValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Vector Incubation Rate (Double)
		try {
			Double vectorIncubationRateValue = Double.parseDouble(
				map.get(VectorPackage.Literals.MACDONALD_ROSS_DISEASE_MODEL__VECTOR_INCUBATION_RATE).getText());
			model.setVectorIncubationRate(vectorIncubationRateValue);
		} catch (NumberFormatException nfe) {
			// empty
		}
 		// Set value for Immunity Loss Rate (Double)
		try {
			Double immunityLossRateValue = Double.parseDouble(
				map.get(VectorPackage.Literals.MACDONALD_ROSS_DISEASE_MODEL__IMMUNITY_LOSS_RATE).getText());
			model.setImmunityLossRate(immunityLossRateValue);
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

		valid = valid && validateFeatureConstraint(VectorPackage.Literals.MACDONALD_ROSS_DISEASE_MODEL__BITING_RATE);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.MACDONALD_ROSS_DISEASE_MODEL__INFECTIOUS_BITING_PROPORTION_HUMAN);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.MACDONALD_ROSS_DISEASE_MODEL__INFECTIOUS_BITING_PROPORTION_VECTOR);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.MACDONALD_ROSS_DISEASE_MODEL__RECOVERY_RATE);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.MACDONALD_ROSS_DISEASE_MODEL__INCUBATION_RATE);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.MACDONALD_ROSS_DISEASE_MODEL__VECTOR_INCUBATION_RATE);
		valid = valid && validateFeatureConstraint(VectorPackage.Literals.MACDONALD_ROSS_DISEASE_MODEL__IMMUNITY_LOSS_RATE);

		return valid;
	}


	/**
	 * @generated
	 */
	public static class MacdonaldRossDiseaseModelPropertyStringProviderAdapter
		extends VectorDiseaseModelPropertyStringProviderAdapter {
		/**
		 * @param descriptor
		 * @return the NLS'd name of the property to display to the user
		 * @generated
		 */
		public String getPropertyName(IItemPropertyDescriptor descriptor) {
			try {
				return VectorWizardMessages
						.getString(((EStructuralFeature) descriptor
								.getFeature(null)).getName(), "MacdonaldRossDiseaseModel");
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
						.getName() + TT_SUFFIX, "MacdonaldRossDiseaseModel");
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
						.getName() + UNIT_SUFFIX, "MacdonaldRossDiseaseModel");
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
						.getName() + MISSING_SUFFIX, "MacdonaldRossDiseaseModel");
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
						.getName() + INVALID_SUFFIX, "MacdonaldRossDiseaseModel");
			} catch (MissingResourceException e) {	
				return super.getPropertyInvalid(descriptor);
			}
		} // getPropertyInvalid		
	}

}