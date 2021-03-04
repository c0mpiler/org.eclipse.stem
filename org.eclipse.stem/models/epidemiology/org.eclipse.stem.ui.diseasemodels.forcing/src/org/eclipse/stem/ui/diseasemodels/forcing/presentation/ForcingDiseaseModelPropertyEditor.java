package org.eclipse.stem.ui.diseasemodels.forcing.presentation;

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
import org.eclipse.stem.diseasemodels.forcing.ForcingDiseaseModel;
import org.eclipse.stem.diseasemodels.forcing.ForcingPackage;
import org.eclipse.stem.diseasemodels.forcing.Gaussian2ForcingDiseaseModel;
import org.eclipse.stem.diseasemodels.forcing.Gaussian3ForcingDiseaseModel;
import org.eclipse.stem.diseasemodels.forcing.GaussianForcingDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.ui.wizards.StandardDiseaseModelPropertyEditor;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

/**
 *
 */
public class ForcingDiseaseModelPropertyEditor extends
		StandardDiseaseModelPropertyEditor {

	/**
	 * @param parent
	 * @param style
	 * @param diseaseModel
	 * @param projectValidator
	 */
	public ForcingDiseaseModelPropertyEditor(Composite parent, int style,
			DiseaseModel diseaseModel, ModifyListener projectValidator,
			IProject project) {
		super(parent, style, diseaseModel, projectValidator, project);
	} // ForcingDiseaseModelPropertyEditor

	/**
	 * @see org.eclipse.stem.ui.wizards.StandardDiseaseModelPropertyEditor#populate(org.eclipse.stem.diseasemodels.standard.DiseaseModel)
	 */
	@Override
	public void populate(DiseaseModel diseaseModel) {
		super.populate(diseaseModel);

		if (diseaseModel instanceof ForcingDiseaseModel) {
			ForcingDiseaseModel model = (ForcingDiseaseModel) diseaseModel;

			model.setModulationExponent(Double
					.parseDouble(map
							.get(ForcingPackage.Literals.FORCING_DISEASE_MODEL__MODULATION_EXPONENT)
							.getText()));
			model.setModulationPeriod(Double
					.parseDouble(map
							.get(ForcingPackage.Literals.FORCING_DISEASE_MODEL__MODULATION_PERIOD)
							.getText()));
			model.setModulationPhaseShift(Double
					.parseDouble(map
							.get(ForcingPackage.Literals.FORCING_DISEASE_MODEL__MODULATION_PHASE_SHIFT)
							.getText()));
			model.setModulationFloor(Double
					.parseDouble(map
							.get(ForcingPackage.Literals.FORCING_DISEASE_MODEL__MODULATION_FLOOR)
							.getText()));
		}

		if (diseaseModel instanceof GaussianForcingDiseaseModel) {
			GaussianForcingDiseaseModel model = (GaussianForcingDiseaseModel) diseaseModel;

			model.setSigma2(Double
					.parseDouble(map
							.get(ForcingPackage.Literals.GAUSSIAN_FORCING_DISEASE_MODEL__SIGMA2)
							.getText()));
			model.setModulationPeriod(Double
					.parseDouble(map
							.get(ForcingPackage.Literals.GAUSSIAN_FORCING_DISEASE_MODEL__MODULATION_PERIOD)
							.getText()));
			model.setModulationPhaseShift(Double
					.parseDouble(map
							.get(ForcingPackage.Literals.GAUSSIAN_FORCING_DISEASE_MODEL__MODULATION_PHASE_SHIFT)
							.getText()));
			model.setModulationFloor(Double
					.parseDouble(map
							.get(ForcingPackage.Literals.GAUSSIAN_FORCING_DISEASE_MODEL__MODULATION_FLOOR)
							.getText()));
		}

		if (diseaseModel instanceof Gaussian2ForcingDiseaseModel) {
			Gaussian2ForcingDiseaseModel model = (Gaussian2ForcingDiseaseModel) diseaseModel;

			model.setSigma2_2(Double
					.parseDouble(map
							.get(ForcingPackage.Literals.GAUSSIAN2_FORCING_DISEASE_MODEL__SIGMA2_2)
							.getText()));
			model.setAtt1(Double
					.parseDouble(map
							.get(ForcingPackage.Literals.GAUSSIAN2_FORCING_DISEASE_MODEL__ATT1)
							.getText()));
			model.setAtt2(Double
					.parseDouble(map
							.get(ForcingPackage.Literals.GAUSSIAN2_FORCING_DISEASE_MODEL__ATT2)
							.getText()));
			model.setAtt3(Double
					.parseDouble(map
							.get(ForcingPackage.Literals.GAUSSIAN2_FORCING_DISEASE_MODEL__ATT3)
							.getText()));
			model.setAtt4(Double
					.parseDouble(map
							.get(ForcingPackage.Literals.GAUSSIAN2_FORCING_DISEASE_MODEL__ATT4)
							.getText()));
		}

		if (diseaseModel instanceof Gaussian3ForcingDiseaseModel) {
			Gaussian3ForcingDiseaseModel model = (Gaussian3ForcingDiseaseModel) diseaseModel;

			model.setSigma2_3(Double
					.parseDouble(map
							.get(ForcingPackage.Literals.GAUSSIAN3_FORCING_DISEASE_MODEL__SIGMA2_3)
							.getText()));
			model.setTransmissionRate2(Double
					.parseDouble(map
							.get(ForcingPackage.Literals.GAUSSIAN3_FORCING_DISEASE_MODEL__TRANSMISSION_RATE2)
							.getText()));
			model.setTransmissionRate3(Double
					.parseDouble(map
							.get(ForcingPackage.Literals.GAUSSIAN3_FORCING_DISEASE_MODEL__TRANSMISSION_RATE3)
							.getText()));
			model.setModulationFloor_2(Double
					.parseDouble(map
							.get(ForcingPackage.Literals.GAUSSIAN3_FORCING_DISEASE_MODEL__MODULATION_FLOOR_2)
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

		// FORCING_DISEASE_MODEL__SEASONAL_MODULATION_EXPONENT
		text = map
				.get(ForcingPackage.Literals.FORCING_DISEASE_MODEL__MODULATION_EXPONENT);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = ForcingDiseaseWizardMessages
						.getString("modulationExponentMISSING"); //$NON-NLS-1$
				return false;
			} else if (!isValidDoubleValue(text.getText())) {
				errorMessage = ForcingDiseaseWizardMessages
						.getString("modulationExponentINVALID"); //$NON-NLS-1$
				return false;
			}
		}

		// FORCING_DISEASE_MODEL__MODULATION_PERIOD
		text = map
				.get(ForcingPackage.Literals.FORCING_DISEASE_MODEL__MODULATION_PERIOD);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = ForcingDiseaseWizardMessages
						.getString("modulationPeriodMISSING"); //$NON-NLS-1$
				return false;
			} else if (!isValidDoubleValue(text.getText())) {
				errorMessage = ForcingDiseaseWizardMessages
						.getString("modulationPeriodINVALID"); //$NON-NLS-1$
				return false;
			}
		}

		// FORCING_DISEASE_MODEL__MODULATION_PHASE_SHIFT
		text = map
				.get(ForcingPackage.Literals.FORCING_DISEASE_MODEL__MODULATION_PHASE_SHIFT);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = ForcingDiseaseWizardMessages
						.getString("modulationPhaseMISSING"); //$NON-NLS-1$
				return false;
			} else if (!isValidDoubleValue(text.getText())) {
				errorMessage = ForcingDiseaseWizardMessages
						.getString("modulationPhaseINVALID"); //$NON-NLS-1$
				return false;
			}
		}

		// FORCING_DISEASE_MODEL__SEASONAL_MODULATION_FLOOR
		text = map
				.get(ForcingPackage.Literals.FORCING_DISEASE_MODEL__MODULATION_FLOOR);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = ForcingDiseaseWizardMessages
						.getString("modulationFloorMISSING"); //$NON-NLS-1$
				return false;
			} else if (!isValidDoubleValue(text.getText())) {
				errorMessage = ForcingDiseaseWizardMessages
						.getString("modulationFloorINVALID"); //$NON-NLS-1$
				return false;
			}
		}

		// GAUSSIAN_FORCING_DISEASE_MODEL__SIGMA2
		text = map
				.get(ForcingPackage.Literals.GAUSSIAN_FORCING_DISEASE_MODEL__SIGMA2);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = ForcingDiseaseWizardMessages
						.getString("sigma2MISSING"); //$NON-NLS-1$
				return false;
			} else if (!isValidDoubleValue(text.getText())) {
				errorMessage = ForcingDiseaseWizardMessages
						.getString("sigma2INVALID"); //$NON-NLS-1$
				return false;
			}
		}

		// GAUSSIAN_FORCING_DISEASE_MODEL__MODULATION_PERIOD
		text = map
				.get(ForcingPackage.Literals.GAUSSIAN_FORCING_DISEASE_MODEL__MODULATION_PERIOD);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = ForcingDiseaseWizardMessages
						.getString("modulationPeriodMISSING"); //$NON-NLS-1$
				return false;
			} else if (!isValidDoubleValue(text.getText())) {
				errorMessage = ForcingDiseaseWizardMessages
						.getString("modulationPeriodINVALID"); //$NON-NLS-1$
				return false;
			}
		}

		// GAUSSIAN_FORCING_DISEASE_MODEL__MODULATION_PHASE_SHIFT
		text = map
				.get(ForcingPackage.Literals.GAUSSIAN_FORCING_DISEASE_MODEL__MODULATION_PHASE_SHIFT);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = ForcingDiseaseWizardMessages
						.getString("modulationPhaseMISSING"); //$NON-NLS-1$
				return false;
			} else if (!isValidDoubleValue(text.getText())) {
				errorMessage = ForcingDiseaseWizardMessages
						.getString("modulationPhaseINVALID"); //$NON-NLS-1$
				return false;
			}
		}

		// GAUSSIAN_FORCING_DISEASE_MODEL__SEASONAL_MODULATION_FLOOR
		text = map
				.get(ForcingPackage.Literals.GAUSSIAN_FORCING_DISEASE_MODEL__MODULATION_FLOOR);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = ForcingDiseaseWizardMessages
						.getString("modulationFloorMISSING"); //$NON-NLS-1$
				return false;
			} else if (!isValidDoubleValue(text.getText())) {
				errorMessage = ForcingDiseaseWizardMessages
						.getString("modulationFloorINVALID"); //$NON-NLS-1$
				return false;
			}
		}

		// GAUSSIAN2_FORCING_DISEASE_MODEL__ATT1
		text = map
				.get(ForcingPackage.Literals.GAUSSIAN2_FORCING_DISEASE_MODEL__ATT1);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = ForcingDiseaseWizardMessages
						.getString("att1MISSING"); //$NON-NLS-1$
				return false;
			} else if (!isValidDoubleValue(text.getText())) {
				errorMessage = ForcingDiseaseWizardMessages
						.getString("att1INVALID"); //$NON-NLS-1$
				return false;
			}
		}

		// GAUSSIAN2_FORCING_DISEASE_MODEL__ATT2
		text = map
				.get(ForcingPackage.Literals.GAUSSIAN2_FORCING_DISEASE_MODEL__ATT2);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = ForcingDiseaseWizardMessages
						.getString("att2MISSING"); //$NON-NLS-1$
				return false;
			} else if (!isValidDoubleValue(text.getText())) {
				errorMessage = ForcingDiseaseWizardMessages
						.getString("att2INVALID"); //$NON-NLS-1$
				return false;
			}
		}

		// GAUSSIAN2_FORCING_DISEASE_MODEL__ATT3
		text = map
				.get(ForcingPackage.Literals.GAUSSIAN2_FORCING_DISEASE_MODEL__ATT3);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = ForcingDiseaseWizardMessages
						.getString("att3MISSING"); //$NON-NLS-1$
				return false;
			} else if (!isValidDoubleValue(text.getText())) {
				errorMessage = ForcingDiseaseWizardMessages
						.getString("att3INVALID"); //$NON-NLS-1$
				return false;
			}
		}

		// GAUSSIAN2_FORCING_DISEASE_MODEL__ATT4
		text = map
				.get(ForcingPackage.Literals.GAUSSIAN2_FORCING_DISEASE_MODEL__ATT4);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = ForcingDiseaseWizardMessages
						.getString("att4MISSING"); //$NON-NLS-1$
				return false;
			} else if (!isValidDoubleValue(text.getText())) {
				errorMessage = ForcingDiseaseWizardMessages
						.getString("att4INVALID"); //$NON-NLS-1$
				return false;
			}
		}

		// GAUSSIAN2_FORCING_DISEASE_MODEL__SIGMA2_2
		text = map
				.get(ForcingPackage.Literals.GAUSSIAN2_FORCING_DISEASE_MODEL__SIGMA2_2);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = ForcingDiseaseWizardMessages
						.getString("sigma2_2MISSING"); //$NON-NLS-1$
				return false;
			} else if (!isValidDoubleValue(text.getText())) {
				errorMessage = ForcingDiseaseWizardMessages
						.getString("sigma2_2INVALID"); //$NON-NLS-1$
				return false;
			}
		}

		// GAUSSIAN2_FORCING_DISEASE_MODEL__SIGMA2_3
		text = map
				.get(ForcingPackage.Literals.GAUSSIAN3_FORCING_DISEASE_MODEL__SIGMA2_3);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = ForcingDiseaseWizardMessages
						.getString("sigma2_3MISSING"); //$NON-NLS-1$
				return false;
			} else if (!isValidDoubleValue(text.getText())) {
				errorMessage = ForcingDiseaseWizardMessages
						.getString("sigma2_3INVALID"); //$NON-NLS-1$
				return false;
			}
		}

		// GAUSSIAN3_FORCING_DISEASE_MODEL__TRANSMISSION_RATE2
		text = map
				.get(ForcingPackage.Literals.GAUSSIAN3_FORCING_DISEASE_MODEL__TRANSMISSION_RATE2);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = ForcingDiseaseWizardMessages
						.getString("transmissionRate2MISSING"); //$NON-NLS-1$
				return false;
			} else if (!isValidDoubleValue(text.getText())) {
				errorMessage = ForcingDiseaseWizardMessages
						.getString("transmissionRate2INVALID"); //$NON-NLS-1$
				return false;
			}
		}

		// GAUSSIAN3_FORCING_DISEASE_MODEL__TRANSMISSION_RATE3
		text = map
				.get(ForcingPackage.Literals.GAUSSIAN3_FORCING_DISEASE_MODEL__TRANSMISSION_RATE3);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = ForcingDiseaseWizardMessages
						.getString("transmissionRate3MISSING"); //$NON-NLS-1$
				return false;
			} else if (!isValidDoubleValue(text.getText())) {
				errorMessage = ForcingDiseaseWizardMessages
						.getString("transmissionRate3INVALID"); //$NON-NLS-1$
				return false;
			}
		}

		// GAUSSIAN3_FORCING_DISEASE_MODEL__MODULATION_FLOOR_2
		text = map
				.get(ForcingPackage.Literals.GAUSSIAN3_FORCING_DISEASE_MODEL__MODULATION_FLOOR_2);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = ForcingDiseaseWizardMessages
						.getString("modulationFloor_2MISSING"); //$NON-NLS-1$
				return false;
			} else if (!isValidDoubleValue(text.getText())) {
				errorMessage = ForcingDiseaseWizardMessages
						.getString("modulationFloor_2INVALID"); //$NON-NLS-1$
				return false;
			}
		}

		return true;
	}

} // ForcingDiseaseModelPropertyEditor
