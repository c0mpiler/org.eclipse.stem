// StandardDiseaseModelPropertyEditor.java
package org.eclipse.stem.ui.populationmodels.standard.wizards;

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

import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.populationmodels.standard.ExternalDataSourcePopulationInitializer;
import org.eclipse.stem.populationmodels.standard.PopulationInitializer;
import org.eclipse.stem.populationmodels.standard.StandardPackage;
import org.eclipse.stem.populationmodels.standard.StandardPopulationInitializer;
import org.eclipse.stem.ui.populationmodels.adapters.PopulationInitializerPropertyEditor;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

/**
 * This class is a {@link Composite} that presents the properties of a
 * {@link PopulationInitializer} for editing.
 */
public class StandardPopulationInitializerPropertyEditor extends PopulationInitializerPropertyEditor {
	
	/**
	 * Create the composite
	 * 
	 * @param parent
	 * @param style
	 * @param projectValidator
	 */
	public StandardPopulationInitializerPropertyEditor(final Composite parent, final int style,
			final PopulationInitializer populationInitializer,
			final ModifyListener projectValidator, IProject project) {
		super(parent, style, populationInitializer, projectValidator, project);
		
	} // StandardPopulationInitializerPropertyEditor

	/**
	 * @param diseaseModel
	 *            the {@link DiseaseModel} instance to populate.
	 */
	@Override
	public void populate(final PopulationInitializer populationInitializer) {
		super.populate(populationInitializer);
		
		for (final Map.Entry<EStructuralFeature, Text> entry : map.entrySet()) {
			if(populationInitializer instanceof StandardPopulationInitializer) {
				switch (entry.getKey().getFeatureID()) {
					case StandardPackage.POPULATION_INITIALIZER__POPULATION_IDENTIFIER:
						((PopulationInitializer)populationInitializer).setPopulationIdentifier(entry.getValue().getText());
						break;
					case StandardPackage.STANDARD_POPULATION_INITIALIZER__INDIVIDUALS:
						((StandardPopulationInitializer)populationInitializer)
								.setIndividuals((Double.parseDouble(entry.getValue().getText().trim())));
						break;
					case StandardPackage.STANDARD_POPULATION_INITIALIZER__TARGET_URI:
						URI uri = STEMURI.createURI(entry.getValue().getText().trim());
						((StandardPopulationInitializer)populationInitializer)
							.setTargetURI(uri);
						((StandardPopulationInitializer)populationInitializer)
							.setTargetISOKey(uri.lastSegment());
						break;
					default:
						break;
				} // switch
			} else if(populationInitializer instanceof ExternalDataSourcePopulationInitializer) {
				switch (entry.getKey().getFeatureID()) {
					case StandardPackage.EXTERNAL_DATA_SOURCE_POPULATION_INITIALIZER__DATA_PATH:
						((ExternalDataSourcePopulationInitializer)populationInitializer).setDataPath(entry.getValue().getText());
						break;
					case StandardPackage.EXTERNAL_DATA_SOURCE_POPULATION_INITIALIZER__POPULATION_IDENTIFIER:
					    ((PopulationInitializer)populationInitializer).setPopulationIdentifier(entry.getValue().getText());
					    break;
					case StandardPackage.EXTERNAL_DATA_SOURCE_POPULATION_INITIALIZER__ROW:
					    ((ExternalDataSourcePopulationInitializer)populationInitializer).setRow(Integer.parseInt(entry.getValue().getText()));
					    break;
					default:
						break;
				}
			} else if(populationInitializer instanceof PopulationInitializer) {
				switch(entry.getKey().getFeatureID()) {
				case StandardPackage.POPULATION_INITIALIZER__POPULATION_IDENTIFIER:
					((PopulationInitializer)populationInitializer).setPopulationIdentifier(entry.getValue().getText().trim());
						break;
					default:
						break;
				}
			}
		} // for each Map.entry

		for (final Map.Entry<EStructuralFeature, Button> entry : booleanMap.entrySet()) {
			if(populationInitializer instanceof StandardPopulationInitializer) {
				switch (entry.getKey().getFeatureID()) {
				case StandardPackage.STANDARD_POPULATION_INITIALIZER__USE_DENSITY:
					((StandardPopulationInitializer)populationInitializer).setUseDensity(entry.getValue().getSelection());
					break;
				default:
					break;
				} // switch
			}
		} // for each Map.entry

	} // populate

	/**
	 * @return <code>true</code> if the contents are valid, <code>false</code>
	 *         otherwise.
	 */
	@Override
	public boolean validate() {
		boolean retValue = super.validate();

		if (retValue) {
			// Yes
			final Text text = map
					.get(StandardPackage.Literals.POPULATION_INITIALIZER__POPULATION_IDENTIFIER);
			retValue = !text.getText().equals(""); //$NON-NLS-1$
			// nothing?
			if (!retValue) {
				// Yes
				errorMessage = PopulationModelWizardMessages.getString("NDizWizErr15"); //$NON-NLS-1$
			} // if
		} // if

		// 
		if (retValue) {
			// Yes
			final Text text = map
					.get(StandardPackage.Literals.STANDARD_POPULATION_INITIALIZER__INDIVIDUALS);
			if(text != null) {
				retValue = !text.getText().equals(""); //$NON-NLS-1$
				// nothing?
				if (!retValue) {
					// Yes
					errorMessage = PopulationModelWizardMessages.getString("NDizWizErr16"); //$NON-NLS-1$
				} // if
				else {
					// No
					// Is it a valid value > 0?
					retValue = isValidValue(text.getText(), 0.0);
					if (!retValue) {
						// No
						errorMessage = PopulationModelWizardMessages
								.getString("NDizWizErr17"); //$NON-NLS-1$
					} // if
				}
			}
		} 
		
		if(retValue) {
			final Text text = map.get(StandardPackage.Literals.EXTERNAL_DATA_SOURCE_POPULATION_INITIALIZER__DATA_PATH);
			if(text != null) {
				retValue = !text.getText().equals(""); //$NON-NLS-1$
				if (!retValue) {
					// Yes
					errorMessage = PopulationModelWizardMessages.getString("NDizWizErr24"); //$NON-NLS-1$
				} // if
			}
		}
			
		if(retValue) {
			final Text text = map.get(StandardPackage.Literals.EXTERNAL_DATA_SOURCE_POPULATION_INITIALIZER__ROW);
			if(text != null) {
				retValue = isValidIntValue(text.getText().trim(), 1);
				if (!retValue) {
					// Yes
					errorMessage = PopulationModelWizardMessages.getString("NDizWizErr25"); //$NON-NLS-1$
				} // if
			}
		}
		
		return retValue;
	} // validate

} // StandardPropertyModelPropertyEditor
