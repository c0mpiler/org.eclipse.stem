package org.eclipse.stem.diseasemodels.externaldatasource.presentation;

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

import java.io.File;

import org.eclipse.core.resources.IProject;
import org.eclipse.stem.diseasemodels.externaldatasource.ExternalDataSourceDiseaseModel;
import org.eclipse.stem.diseasemodels.externaldatasource.ExternalDataSourcePackage;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.ui.adapters.diseasemodelpropertyeditor.DiseaseModelPropertyEditor;
import org.eclipse.stem.ui.wizards.DiseaseWizardMessages;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

/**
 *
 */
public class ExternalDataSourceDiseaseModelPropertyEditor extends
		DiseaseModelPropertyEditor {

	/**
	 * @param parent
	 * @param style
	 * @param diseaseModel
	 * @param projectValidator
	 */
	public ExternalDataSourceDiseaseModelPropertyEditor(Composite parent,
			int style, DiseaseModel diseaseModel,
			ModifyListener projectValidator, IProject project) {
		super(parent, style, diseaseModel, projectValidator, project);
	} // ExternalDataSourceDiseaseModelPropertyEditor

	/**
	 * @see org.eclipse.stem.ui.wizards.StandardDiseaseModelPropertyEditor#populate(org.eclipse.stem.diseasemodels.standard.DiseaseModel)
	 */
	@Override
	public void populate(DiseaseModel diseaseModel) {
		super.populate(diseaseModel);

		if (diseaseModel instanceof ExternalDataSourceDiseaseModel) {
			ExternalDataSourceDiseaseModel model = (ExternalDataSourceDiseaseModel) diseaseModel;

			model.setDataPath(map
					.get(ExternalDataSourcePackage.Literals.EXTERNAL_DATA_SOURCE_DISEASE_MODEL__DATA_PATH)
					.getText());
			
			
			Button button = booleanMap.get(ExternalDataSourcePackage.Literals.EXTERNAL_DATA_SOURCE_DISEASE_MODEL__RESTART);
			if(button != null)
				model.setRestart(button.getSelection());
			
			Text txt = map.get(ExternalDataSourcePackage.Literals.EXTERNAL_DATA_SOURCE_DISEASE_MODEL__BUFFER_SIZE);
			if(txt!=null)
				model.setBufferSize(Integer.parseInt(txt.getText().trim()));
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

		// Data Path
		Text text = map
				.get(ExternalDataSourcePackage.Literals.EXTERNAL_DATA_SOURCE_DISEASE_MODEL__DATA_PATH);
		if (text != null) {
			String path = text.getText();
			
			if (!path.startsWith("platform") && !new File(path).exists()) {
				errorMessage = DiseaseWizardMessages.getString("NDizWizErr20"); //$NON-NLS-1$
				return false;
			}
		}	

		text = map
				.get(ExternalDataSourcePackage.Literals.EXTERNAL_DATA_SOURCE_DISEASE_MODEL__BUFFER_SIZE);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = DiseaseWizardMessages
						.getString("NDizWizErr32"); //$NON-NLS-1$
				return false;
			}
			String intText = text.getText();
			try {
				int r = Integer.parseInt(intText);
				if(r<1) {
					errorMessage = DiseaseWizardMessages
							.getString("NDizWizErr32"); //$NON-NLS-1$
					return false;
				}
			} catch(Exception e) {
				errorMessage = DiseaseWizardMessages
						.getString("NDizWizErr32"); //$NON-NLS-1$
				return false;
			}
		}
		return true;
	}

} // ExternalDataSourceDiseaseModelPropertyEditor
