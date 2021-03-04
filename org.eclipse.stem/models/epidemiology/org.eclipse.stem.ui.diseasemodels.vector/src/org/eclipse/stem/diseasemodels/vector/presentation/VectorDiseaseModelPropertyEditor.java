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
import org.eclipse.stem.diseasemodels.vector.VectorDiseaseModel;
import org.eclipse.stem.diseasemodels.vector.VectorPackage;
import org.eclipse.stem.ui.wizards.StandardDiseaseModelPropertyEditor;
import org.eclipse.stem.ui.wizards.StandardPropertyStringProviderAdapterFactory.StandardPropertyStringProviderAdapter;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;

/**
 * @generated
 */
public class VectorDiseaseModelPropertyEditor extends
		StandardDiseaseModelPropertyEditor {
	/**
	 * @param parent
	 * @param style
	 * @param model
	 * @param projectValidator
	 * @generated
	 */
	public VectorDiseaseModelPropertyEditor(Composite parent, int style,
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

		VectorDiseaseModel model = (VectorDiseaseModel)object;
 		// Set value for Vector Population Identifier (String)
  		String vectorPopulationIdentifierValue = map.get(VectorPackage.Literals.VECTOR_DISEASE_MODEL__VECTOR_POPULATION_IDENTIFIER).getText();
		model.setVectorPopulationIdentifier(vectorPopulationIdentifierValue);
	}

	/**
	 * @generated
	 */
	@Override
	public boolean validate() {
		boolean valid = super.validate();

		valid = valid && validateFeatureConstraint(VectorPackage.Literals.VECTOR_DISEASE_MODEL__VECTOR_POPULATION_IDENTIFIER);

		return valid;
	}


	/**
	 * @generated
	 */
	public static class VectorDiseaseModelPropertyStringProviderAdapter
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
								.getFeature(null)).getName(), "VectorDiseaseModel");
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
						.getName() + TT_SUFFIX, "VectorDiseaseModel");
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
						.getName() + UNIT_SUFFIX, "VectorDiseaseModel");
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
						.getName() + MISSING_SUFFIX, "VectorDiseaseModel");
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
						.getName() + INVALID_SUFFIX, "VectorDiseaseModel");
			} catch (MissingResourceException e) {	
				return super.getPropertyInvalid(descriptor);
			}
		} // getPropertyInvalid		
	}

}