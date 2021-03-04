// StandardDiseaseModelPropertyEditor.java
package org.eclipse.stem.ui.wizards;

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
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.diseasemodels.standard.SEIR;
import org.eclipse.stem.diseasemodels.standard.SI;
import org.eclipse.stem.diseasemodels.standard.SIR;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.diseasemodels.standard.StandardStochasticDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.StochasticDiseaseModel;
import org.eclipse.stem.ui.adapters.diseasemodelpropertyeditor.DiseaseModelPropertyEditor;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

/**
 * This class is a {@link Composite} that presents the properties of a
 * {@link DiseaseModel} for editing.
 */
@SuppressWarnings("deprecation")
public class StandardDiseaseModelPropertyEditor extends
		DiseaseModelPropertyEditor {

	/**
	 * Create the composite
	 * 
	 * @param parent
	 * @param style
	 * @param projectValidator
	 */
	public StandardDiseaseModelPropertyEditor(final Composite parent,
			final int style, final DiseaseModel diseaseModel,
			final ModifyListener projectValidator, IProject project) {
		super(parent, style, diseaseModel, projectValidator, project);

	} // StandardDiseaseModelPropertyEditor

	/**
	 * @param diseaseModel
	 *            the {@link DiseaseModel} instance to populate.
	 */
	public void populate(final DiseaseModel diseaseModel) {
		super.populate(diseaseModel);

		if (diseaseModel instanceof StandardDiseaseModel) {
			StandardDiseaseModel model = (StandardDiseaseModel) diseaseModel;

			model.setReferencePopulationDensity(Double
					.parseDouble(map
							.get(StandardPackage.Literals.STANDARD_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY)
							.getText()));
			model.setRoadNetworkInfectiousProportion(Double
					.parseDouble(map
							.get(StandardPackage.Literals.STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION)
							.getText()));
			model.setCharacteristicMixingDistance(Double
					.parseDouble(map
							.get(StandardPackage.Literals.STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE)
							.getText()));
		}

		if (diseaseModel instanceof StochasticDiseaseModel) {
			StochasticDiseaseModel model = (StochasticDiseaseModel) diseaseModel;

			if(map.get(StandardPackage.Literals.STOCHASTIC_DISEASE_MODEL__SEED) != null)
				model.setSeed(Long.parseLong(map.get(
					StandardPackage.Literals.STOCHASTIC_DISEASE_MODEL__SEED)
					.getText()));
		}

		if (diseaseModel instanceof StandardStochasticDiseaseModel) {
			StandardStochasticDiseaseModel model = (StandardStochasticDiseaseModel) diseaseModel;

			if(map.get(StandardPackage.Literals.STANDARD_STOCHASTIC_DISEASE_MODEL__GAIN) != null)
				model.setGain(Double
					.parseDouble(map
							.get(StandardPackage.Literals.STANDARD_STOCHASTIC_DISEASE_MODEL__GAIN)
							.getText()));
		}

		if (diseaseModel instanceof SI) {
			SI model = (SI) diseaseModel;

			model.setTransmissionRate(Double.parseDouble(map.get(
					StandardPackage.Literals.SI__TRANSMISSION_RATE).getText()));
			model.setNonLinearityCoefficient(Double.parseDouble(map.get(
					StandardPackage.Literals.SI__NON_LINEARITY_COEFFICIENT)
					.getText()));
			model.setRecoveryRate(Double.parseDouble(map.get(
					StandardPackage.Literals.SI__RECOVERY_RATE).getText()));
			model.setInfectiousMortalityRate(Double.parseDouble(map.get(
					StandardPackage.Literals.SI__INFECTIOUS_MORTALITY_RATE)
					.getText()));
		}

		if (diseaseModel instanceof SIR) {
			SIR model = (SIR) diseaseModel;

			model.setImmunityLossRate(Double
					.parseDouble(map.get(
							StandardPackage.Literals.SIR__IMMUNITY_LOSS_RATE)
							.getText()));
		}

		if (diseaseModel instanceof SEIR) {
			SEIR model = (SEIR) diseaseModel;

			model.setIncubationRate(Double.parseDouble(map.get(
					StandardPackage.Literals.SEIR__INCUBATION_RATE).getText()));
		}
	} // populate

	/**
	 * @return <code>true</code> if the contents are valid, <code>false</code>
	 *         otherwise.
	 */
	@Override
	public boolean validate() {
		if (!super.validate()) {
			return false;
		}

		Text text;

		// Characteristic Mixing Distance
		text = map
				.get(StandardPackage.Literals.STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = DiseaseWizardMessages.getString("NDizWizErr24"); //$NON-NLS-1$
				return false;
			} else if (!isValidValue(text.getText(), 0.0)) {
				errorMessage = DiseaseWizardMessages.getString("NDizWizErr25"); //$NON-NLS-1$
				return false;
			}
		}

		// Reference Population Density
		text = map
				.get(StandardPackage.Literals.STANDARD_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = DiseaseWizardMessages.getString("NDizWizErr26"); //$NON-NLS-1$
				return false;
			} else if (!isValidValue(text.getText(), 0.0)) {
				errorMessage = DiseaseWizardMessages.getString("NDizWizErr27"); //$NON-NLS-1$
				return false;
			}
		}

		// Road Network Infectious Proportion
		text = map
				.get(StandardPackage.Literals.STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = DiseaseWizardMessages.getString("NDizWizErr28"); //$NON-NLS-1$
				return false;
			} else if (!isValidValue(text.getText(), 0.0)) {
				errorMessage = DiseaseWizardMessages.getString("NDizWizErr29"); //$NON-NLS-1$
				return false;
			}
		}

		// StochasticDiseaseModel Seed
		text = map.get(StandardPackage.Literals.STOCHASTIC_DISEASE_MODEL__SEED);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = DiseaseWizardMessages.getString("NDizWizErr30"); //$NON-NLS-1$
				return false;
			}
		}

		// StandardStochasticDiseaseModel Gain
		text = map.get(StandardPackage.Literals.STANDARD_STOCHASTIC_DISEASE_MODEL__GAIN);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = DiseaseWizardMessages.getString("NDizWizErr31"); //$NON-NLS-1$
				return false;
			}
		}

		// Transmission Rate
		text = map.get(StandardPackage.Literals.SI__TRANSMISSION_RATE);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = DiseaseWizardMessages.getString("NDizWizErr6"); //$NON-NLS-1$
				return false;
			} else if (!isValidValue(text.getText(), 0.0)) {
				errorMessage = DiseaseWizardMessages.getString("NDizWizErr7"); //$NON-NLS-1$
				return false;
			}
		}

		// Non-Linearity Coefficient
		text = map.get(StandardPackage.Literals.SI__NON_LINEARITY_COEFFICIENT);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = DiseaseWizardMessages.getString("NDizWizErr8"); //$NON-NLS-1$
				return false;
			} else if (!isValidValue(text.getText(), 0.0)) {
				errorMessage = DiseaseWizardMessages.getString("NDizWizErr9"); //$NON-NLS-1$
				return false;
			}
		}

		// Infectious Recovery Rate
		text = map.get(StandardPackage.Literals.SI__RECOVERY_RATE);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = DiseaseWizardMessages.getString("NDizWizErr10"); //$NON-NLS-1$
				return false;
			} else if (!isValidValue(text.getText(), 0.0)) {
				errorMessage = DiseaseWizardMessages.getString("NDizWizErr11"); //$NON-NLS-1$
				return false;
			}
		}

		// Infectious Mortality Rate
		text = map.get(StandardPackage.Literals.SI__INFECTIOUS_MORTALITY_RATE);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = DiseaseWizardMessages.getString("NDizWizErr12"); //$NON-NLS-1$
				return false;
			} else if (!isValidValue(text.getText(), 0.0)) {
				errorMessage = DiseaseWizardMessages.getString("NDizWizErr13"); //$NON-NLS-1$
				return false;
			}
		}

		// Immunity Loss Rate
		text = map.get(StandardPackage.Literals.SIR__IMMUNITY_LOSS_RATE);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = DiseaseWizardMessages.getString("NDizWizErr16"); //$NON-NLS-1$
				return false;
			} else if (!isValidValue(text.getText(), 0.0)) {
				errorMessage = DiseaseWizardMessages.getString("NDizWizErr17"); //$NON-NLS-1$
				return false;
			}
		}

		// Incubation Rate
		text = map.get(StandardPackage.Literals.SEIR__INCUBATION_RATE);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = DiseaseWizardMessages.getString("NDizWizErr18"); //$NON-NLS-1$
				return false;
			} else if (!isValidValue(text.getText(), 0.0)) {
				errorMessage = DiseaseWizardMessages.getString("NDizWizErr19"); //$NON-NLS-1$
				return false;
			}
		}

		return true;
	} // validate
} // StandardDiseaseModelPropertyEditor
