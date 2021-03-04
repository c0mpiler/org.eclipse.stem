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
package org.eclipse.stem.ui.adapters.loggerpropertyeditor;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.stem.core.logger.Logger;
import org.eclipse.stem.loggers.SimulationLogger;
import org.eclipse.stem.loggers.SimulationLoggerPackage;
import org.eclipse.stem.loggers.SynchronousDecoratorPropertyLogger;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * This class is a {@link Composite} that presents the properties of a
 * {@link SimulationLogger} for editing.
 */
public class SimulationLoggerPropertyEditor extends LoggerPropertyEditor {
	
	
	Set<String> selectedDecoratorProperties = new HashSet<String>();

	
	/**
	 * Create the composite
	 * 
	 * @param parent
	 * @param style
	 * @param projectValidator
	 */
	public SimulationLoggerPropertyEditor(final Composite parent, final int style,
			final Logger logger,
			final ModifyListener projectValidator, final IProject project) {
		super(parent, style, logger, projectValidator, project);
		
		if (logger instanceof SynchronousDecoratorPropertyLogger) {
		
			final Label label = new Label(this, SWT.NONE);
			label.setText(Messages.SLPE_CompartmentsToLog);
			
			final GridData labelGD = new GridData(GridData.BEGINNING);
			labelGD.grabExcessHorizontalSpace = true;
			labelGD.horizontalAlignment = SWT.FILL;
			labelGD.horizontalIndent = 0;
			label.setLayoutData(labelGD);
			
			Button selectDecoratorsButton = new Button(this, SWT.PUSH);
			selectDecoratorsButton.setText(Messages.SLPE_SelectCompartments);
	
	
			final GridData textGD = new GridData(GridData.END);
			textGD.grabExcessHorizontalSpace = false;
			textGD.horizontalAlignment = SWT.FILL;
			selectDecoratorsButton.setLayoutData(textGD);
			
			selectDecoratorsButton.addSelectionListener(new SelectionListener() {
	
				public void widgetSelected(SelectionEvent arg0) {
					DecoratorPickerDialog lpDialog = new DecoratorPickerDialog(
							getShell(),
							SWT.NONE,
							project,
							selectedDecoratorProperties);
	
					if (lpDialog.open()) {
						selectedDecoratorProperties = lpDialog.getSelectedProperties();
					}
				}
	
				public void widgetDefaultSelected(SelectionEvent arg0) {
	
				}
			});
			
			final Label labelSpacer = new Label(this, SWT.NONE);
			labelSpacer.setText(""); //$NON-NLS-1$
			final GridData labelSpacerGD = new GridData(GridData.END);
			labelSpacerGD.verticalAlignment = GridData.CENTER;
			labelSpacer.setLayoutData(labelSpacerGD);
		}
	}

	/**
	 * @param feature
	 * @return <code>true</code> if the feature is a dublin core feature that
	 *         is specified by a user.
	 */
	@Override
	public boolean isUserSpecifiedProperty(final EStructuralFeature feature) {
		boolean retValue = false;
		final EClass containingClass = feature.getEContainingClass();
		if (containingClass.equals(SimulationLoggerPackage.eINSTANCE.getSimulationLogger())
				|| containingClass.getEAllSuperTypes().contains(
						SimulationLoggerPackage.eINSTANCE.getSimulationLogger())) {

			retValue = true;
		}
		if (feature.getName().equals("properties")) { //$NON-NLS-1$
			retValue = false;
		}
		
		
		return retValue;
	} 

	
	
	/**
	 * @param logger
	 *            the {@link Logger} instance to populate.
	 */
	public void populate(final Logger logger) 
	{
		super.populate(logger);

		if (logger instanceof SimulationLogger) {
			SimulationLogger obj = (SimulationLogger)logger;
			
			obj.setEnabled(booleanMap
					.get(SimulationLoggerPackage.Literals.SIMULATION_LOGGER__ENABLED)
					.getSelection());
			
			obj.setStepMod(Integer.parseInt(map
					.get(SimulationLoggerPackage.Literals.SIMULATION_LOGGER__STEP_MOD)
					.getText()));
			
			obj.setStartStep(Long.parseLong(map
					.get(SimulationLoggerPackage.Literals.SIMULATION_LOGGER__START_STEP)
					.getText()));
		}

		if (logger instanceof SynchronousDecoratorPropertyLogger) {
			((SynchronousDecoratorPropertyLogger) logger).getProperties().clear();
			((SynchronousDecoratorPropertyLogger) logger).getProperties().addAll(selectedDecoratorProperties);
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

		Text text = map
				.get(SimulationLoggerPackage.Literals.SIMULATION_LOGGER__START_STEP);
		if (text != null && (text.getText().equals("") || !isValidLongValue(text.getText(), 0))) { //$NON-NLS-1$
			errorMessage = Messages.SLPE_PropertyStartStep;
			return false;
		}
		

		text = map
				.get(SimulationLoggerPackage.Literals.SIMULATION_LOGGER__STEP_MOD);
		if (text != null && (text.getText().equals("") || !isValidIntValue(text.getText(), 1))) { //$NON-NLS-1$
			errorMessage = Messages.SLPE_PropertyStepMod;
			return false;
		}
		
		return true;
	} // validate

} 
