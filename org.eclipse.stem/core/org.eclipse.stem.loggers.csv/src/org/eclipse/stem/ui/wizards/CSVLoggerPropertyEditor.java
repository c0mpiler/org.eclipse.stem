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
package org.eclipse.stem.ui.wizards;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.stem.core.logger.Logger;
import org.eclipse.stem.loggers.csv.CSVLogger;
import org.eclipse.stem.loggers.csv.CSVPackage;
import org.eclipse.stem.ui.adapters.loggerpropertyeditor.SimulationLoggerPropertyEditor;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

/**
 * This class is a {@link Composite} that presents the properties of a
 * {@link CSVLogger} for editing.
 */
public class CSVLoggerPropertyEditor extends SimulationLoggerPropertyEditor 
{

	/**
	 * Create the composite
	 * 
	 * @param parent
	 * @param style
	 * @param projectValidator
	 */
	public CSVLoggerPropertyEditor(final Composite parent, final int style,
			final Logger logger,
			final ModifyListener projectValidator, final IProject project) {
		super(parent, style, logger, projectValidator, project);
	}

	/**
	 * @param feature
	 * @return <code>true</code> if the feature is a dublin core feature that
	 *         is specified by a user.
	 */
	@Override
	public boolean isUserSpecifiedProperty(final EStructuralFeature feature) {
		return super.isUserSpecifiedProperty(feature);
	} 

	
	
	/**
	 * @param logger
	 *            the {@link Logger} instance to populate.
	 */
	public void populate(final Logger logger) {
		super.populate(logger);

		// Set values for the base image writer logger
		if (logger instanceof CSVLogger) {
			CSVLogger obj = (CSVLogger)logger;

			obj.setLogInitialState(booleanMap
					.get(CSVPackage.Literals.CSV_LOGGER__LOG_INITIAL_STATE)
					.getSelection());
			
			obj.setDataPath(map
							.get(CSVPackage.Literals.CSV_LOGGER__DATA_PATH)
							.getText());
			
			obj.setUseDefaultLogDirectory(booleanMap
					.get(CSVPackage.Literals.CSV_LOGGER__USE_DEFAULT_LOG_DIRECTORY)
					.getSelection());
			
			obj.setLogRunParameters(booleanMap
					.get(CSVPackage.Literals.CSV_LOGGER__LOG_RUN_PARAMETERS)
					.getSelection());
			
			obj.setLogHtmlSummary(booleanMap
					.get(CSVPackage.Literals.CSV_LOGGER__LOG_HTML_SUMMARY)
					.getSelection());
			
			obj.setBufferSize(Integer.parseInt(map
							.get(CSVPackage.Literals.CSV_LOGGER__BUFFER_SIZE)
							.getText()));
			
			obj.setDelimeter(map
							.get(CSVPackage.Literals.CSV_LOGGER__DELIMETER)
							.getText());

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
		Button button;
		
		// If "use default log directory" is false, check that a string has been entered
		// for the log directory.
		button = booleanMap.get(CSVPackage.Literals.CSV_LOGGER__USE_DEFAULT_LOG_DIRECTORY);
		text = map
				.get(CSVPackage.Literals.CSV_LOGGER__DATA_PATH);
		if (text != null && button != null && !button.getSelection()) {
			if (text.getText().equals("")) { //$NON-NLS-1$
				errorMessage = CSVLoggerWizardMessages.getString("LPE_InvalidLogDirectory"); //$NON-NLS-1$
				return false;
			}
		}
		
		text = map
				.get(CSVPackage.Literals.CSV_LOGGER__BUFFER_SIZE);
		if (text != null && (text.getText().equals("") || !isValidIntValue(text.getText(), 0))) { //$NON-NLS-1$
			errorMessage = CSVLoggerWizardMessages.getString("LPE_InvalidBufferSize"); //$NON-NLS-1$
			return false;
		}

		text = map
				.get(CSVPackage.Literals.CSV_LOGGER__DELIMETER);
		if (text != null && (text.getText().equals(""))) { //$NON-NLS-1$
			errorMessage = CSVLoggerWizardMessages.getString("LPE_InvalidDelimeter"); //$NON-NLS-1$
			return false;
		}
		
		return true;
	} // validate

}
