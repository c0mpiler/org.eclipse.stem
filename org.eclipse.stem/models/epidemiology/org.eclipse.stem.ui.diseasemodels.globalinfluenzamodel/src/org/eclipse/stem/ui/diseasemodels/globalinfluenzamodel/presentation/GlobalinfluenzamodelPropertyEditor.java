package org.eclipse.stem.ui.diseasemodels.globalinfluenzamodel.presentation;

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
import org.eclipse.stem.diseasemodels.globalinfluenzamodel.GlobalInfluenzaModel;
import org.eclipse.stem.diseasemodels.globalinfluenzamodel.GlobalinfluenzamodelPackage;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.ui.wizards.StandardDiseaseModelPropertyEditor;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;

/**
 *
 */
public class GlobalinfluenzamodelPropertyEditor extends
		StandardDiseaseModelPropertyEditor {

	/**
	 * @param parent
	 * @param style
	 * @param diseaseModel
	 * @param projectValidator
	 */
	public GlobalinfluenzamodelPropertyEditor(Composite parent, int style,
			DiseaseModel diseaseModel, ModifyListener projectValidator,
			IProject project) {
		super(parent, style, diseaseModel, projectValidator, project);

	} // GlobalinfluenzaModelPropertyEditor

	/**
	 * @see org.eclipse.stem.ui.wizards.StandardDiseaseModelPropertyEditor#populate(org.eclipse.stem.diseasemodels.standard.DiseaseModel)
	 */
	@Override
	public void populate(DiseaseModel diseaseModel) {
		super.populate(diseaseModel);

		if (diseaseModel instanceof GlobalInfluenzaModel) {
			GlobalInfluenzaModel model = (GlobalInfluenzaModel) diseaseModel;

			model.setLatitudeSigmoidWidth(Double
					.parseDouble(map
							.get(GlobalinfluenzamodelPackage.Literals.GLOBAL_INFLUENZA_MODEL__LATITUDE_SIGMOID_WIDTH)
							.getText()));
			model.setSeasonalModulationExponent(Double
					.parseDouble(map
							.get(GlobalinfluenzamodelPackage.Literals.GLOBAL_INFLUENZA_MODEL__SEASONAL_MODULATION_EXPONENT)
							.getText()));
			model.setModulationPeriod(Double
					.parseDouble(map
							.get(GlobalinfluenzamodelPackage.Literals.GLOBAL_INFLUENZA_MODEL__MODULATION_PERIOD)
							.getText()));
			model.setModulationPhaseShift(Double
					.parseDouble(map
							.get(GlobalinfluenzamodelPackage.Literals.GLOBAL_INFLUENZA_MODEL__MODULATION_PHASE_SHIFT)
							.getText()));
			model.setSeasonalModulationFloor(Double
					.parseDouble(map
							.get(GlobalinfluenzamodelPackage.Literals.GLOBAL_INFLUENZA_MODEL__SEASONAL_MODULATION_FLOOR)
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
		
		//TODO do validation

		return true;
	}

} // GlobalinfluenzaModelPropertyEditor
