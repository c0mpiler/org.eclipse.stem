package org.eclipse.stem.ui.diseasemodels.experimental.adapters;

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
import org.eclipse.stem.diseasemodels.experimental.ExperimentalPackage;
import org.eclipse.stem.diseasemodels.experimental.TBDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.ui.wizards.StandardDiseaseModelPropertyEditor;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

/**
 *
 */
public class ExperimentalDiseaseModelPropertyEditor extends
		StandardDiseaseModelPropertyEditor {

	/**
	 * @param parent
	 * @param style
	 * @param diseaseModel
	 * @param projectValidator
	 */
	public ExperimentalDiseaseModelPropertyEditor(Composite parent, int style,
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

		if (diseaseModel instanceof TBDiseaseModel) {
			TBDiseaseModel model = (TBDiseaseModel) diseaseModel;

			model.setTransmissionRate(Double
					.parseDouble(map
							.get(ExperimentalPackage.Literals.TB_DISEASE_MODEL__TRANSMISSION_RATE)
							.getText()));
			
			model.setActiveInfProb(Double
					.parseDouble(map
							.get(ExperimentalPackage.Literals.TB_DISEASE_MODEL__ACTIVE_INF_PROB)
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
				.get(ExperimentalPackage.Literals.TB_DISEASE_MODEL__TRANSMISSION_RATE);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = ExperimentalDiseaseWizardMessages
						.getString("transmissionRateMissing"); //$NON-NLS-1$
				return false;
			} else if (!isValidDoubleValue(text.getText(), 0)) {
				errorMessage = ExperimentalDiseaseWizardMessages
						.getString("transmissionRateInvalid"); //$NON-NLS-1$
				return false;
			}
		}

		// Seasonal Modulation Exponent
		text = map
				.get(ExperimentalPackage.Literals.TB_DISEASE_MODEL__ACTIVE_INF_PROB);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = ExperimentalDiseaseWizardMessages
						.getString("activeInfProbMissing"); //$NON-NLS-1$
				return false;
			} else if (!isValidDoubleValue(text.getText(), 0, 1)) {
				errorMessage = ExperimentalDiseaseWizardMessages
						.getString("activeInfProbInvalid"); //$NON-NLS-1$
				return false;
			}
		}
				
		return true;
	}

} 
