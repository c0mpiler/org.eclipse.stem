package org.eclipse.stem.ui.diseasemodels.example.presentation;

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

import org.eclipse.core.resources.IProject;
import org.eclipse.stem.diseasemodels.example.ExampleDiseaseModel;
import org.eclipse.stem.diseasemodels.example.ExamplePackage;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.ui.wizards.StandardDiseaseModelPropertyEditor;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

/**
 *
 */
public class ExampleDiseaseModelPropertyEditor extends
		StandardDiseaseModelPropertyEditor {

	/**
	 * @param parent
	 * @param style
	 * @param diseaseModel
	 * @param projectValidator
	 */
	public ExampleDiseaseModelPropertyEditor(Composite parent, int style,
			DiseaseModel diseaseModel, ModifyListener projectValidator,
			IProject project) {
		super(parent, style, diseaseModel, projectValidator, project);
	} // ExampleDiseaseModelPropertyEditor

	/**
	 * @see org.eclipse.stem.ui.wizards.StandardDiseaseModelPropertyEditor#populate(org.eclipse.stem.diseasemodels.standard.DiseaseModel)
	 */
	@Override
	public void populate(DiseaseModel diseaseModel) {
		super.populate(diseaseModel);

		if (diseaseModel instanceof ExampleDiseaseModel) {
			ExampleDiseaseModel model = (ExampleDiseaseModel) diseaseModel;

			model.setSeasonalModulationExponent(Double
					.parseDouble(map
							.get(ExamplePackage.Literals.EXAMPLE_DISEASE_MODEL__SEASONAL_MODULATION_EXPONENT)
							.getText()));
			model.setModulationPeriod(Double
					.parseDouble(map
							.get(ExamplePackage.Literals.EXAMPLE_DISEASE_MODEL__MODULATION_PERIOD)
							.getText()));
			model.setModulationPhaseShift(Double
					.parseDouble(map
							.get(ExamplePackage.Literals.EXAMPLE_DISEASE_MODEL__MODULATION_PHASE_SHIFT)
							.getText()));
			model.setSeasonalModulationFloor(Double
					.parseDouble(map
							.get(ExamplePackage.Literals.EXAMPLE_DISEASE_MODEL__SEASONAL_MODULATION_FLOOR)
							.getText()));
		}
	}

	/**
	 * @see org.eclipse.stem.ui.wizards.StandardDiseaseModelPropertyEditor#validate()
	 */
	@Override
	public boolean validate() {
		if (!super.validate()) {
			return false;
		}

		Text text;

		// Seasonal Modulation Exponent
		text = map
				.get(ExamplePackage.Literals.EXAMPLE_DISEASE_MODEL__SEASONAL_MODULATION_EXPONENT);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = ExampleDiseaseWizardMessages
						.getString("seasonalModulationExponentMISSING"); //$NON-NLS-1$
				return false;
			} else if (!isValidDoubleValue(text.getText())) {
				errorMessage = ExampleDiseaseWizardMessages
						.getString("seasonalModulationExponentINVALID"); //$NON-NLS-1$
				return false;
			}
		}

		// Modulation Period
		text = map
				.get(ExamplePackage.Literals.EXAMPLE_DISEASE_MODEL__MODULATION_PERIOD);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = ExampleDiseaseWizardMessages
						.getString("modulationPeriodMISSING"); //$NON-NLS-1$
				return false;
			} else if (!isValidDoubleValue(text.getText())) {
				errorMessage = ExampleDiseaseWizardMessages
						.getString("modulationPeriodINVALID"); //$NON-NLS-1$
				return false;
			}
		}

		// Modulation Phase Shift
		text = map
				.get(ExamplePackage.Literals.EXAMPLE_DISEASE_MODEL__MODULATION_PHASE_SHIFT);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = ExampleDiseaseWizardMessages
						.getString("modulationPhaseMISSING"); //$NON-NLS-1$
				return false;
			} else if (!isValidDoubleValue(text.getText())) {
				errorMessage = ExampleDiseaseWizardMessages
						.getString("modulationPhaseINVALID"); //$NON-NLS-1$
				return false;
			}
		}

		// Seasonal Modulation Floor
		text = map
				.get(ExamplePackage.Literals.EXAMPLE_DISEASE_MODEL__SEASONAL_MODULATION_FLOOR);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = ExampleDiseaseWizardMessages
						.getString("seasonalModulationFloorMISSING"); //$NON-NLS-1$
				return false;
			} else if (!isValidDoubleValue(text.getText())) {
				errorMessage = ExampleDiseaseWizardMessages
						.getString("seasonalModulationFloorINVALID"); //$NON-NLS-1$
				return false;
			}
		}

		return true;
	}

} // ExampleDiseaseModelPropertyEditor
