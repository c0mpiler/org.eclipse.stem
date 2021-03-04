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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.stem.core.common.DublinCore;
import org.eclipse.stem.core.logger.Logger;
import org.eclipse.stem.ui.loggers.Activator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * This class represents the SWT control for defining a logger.
 */
public class LoggerDefinitionControl extends Composite {

	private static Logger[] loggers = null;

	private final Combo combo;

	private final LoggerPropertyComposite loggerPropertyComposite;
	
	/**
	 * the DiseaseDefinitionControl combo must be able to update the NewDiseaseWizard
	 */
	private NewLoggerWizard newLoggerWizard = null;

	/**
	 * Create the composite
	 * 
	 * @param parent
	 * @param style
	 * @param projectValidator
	 * @param nlw new logger wizard
	 */
	public LoggerDefinitionControl(final Composite parent, final int style,
			ModifyListener projectValidator, IProject project, NewLoggerWizard nlw) {
		super(parent, style);
		newLoggerWizard = nlw;
		final GridLayout gridLayout = new GridLayout();
		gridLayout.marginWidth = 0;
		gridLayout.numColumns = 2;
		setLayout(gridLayout);

		final Label loggerLabel = new Label(this, SWT.NONE);
		final GridData gd_loggerLabel = new GridData(SWT.FILL, SWT.CENTER, true, false);
		gd_loggerLabel.widthHint = 100;
		loggerLabel.setLayoutData(gd_loggerLabel);
		loggerLabel.setText(LoggerWizardMessages.getString("LDC_Type")); //$NON-NLS-1$

		combo = new Combo(this, SWT.READ_ONLY);
		combo.setTextLimit(30);
		final GridData gd_combo = new GridData(SWT.FILL, SWT.CENTER, true,
				false);
		gd_combo.widthHint = 303;
		combo.setLayoutData(gd_combo);

		combo.setToolTipText(LoggerWizardMessages.getString("LDC_TypeTT")); //$NON-NLS-1$
		// Initialize the list of loggers available
		combo.setItems(getLoggerNames(getLoggers()));
		combo.select(0);
		combo.addModifyListener(projectValidator);


		loggerPropertyComposite = new LoggerPropertyComposite(this,
				SWT.NONE, getLoggers(), projectValidator, project);
		final GridData gd_diseaseModelPropertyControl = new GridData(SWT.FILL,
				SWT.CENTER, true, false, 2, 1);
		loggerPropertyComposite
				.setLayoutData(gd_diseaseModelPropertyControl);

		combo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				loggerPropertyComposite
						.displayLogger(getLoggers()[combo
								.getSelectionIndex()]);
				
				// update the dublin core from the plugin defaults for the
				// newly selected logger;
				newLoggerWizard.newDublinCorePage.updateDublinCorePage(getSelectedLogger().getDublinCore());
				
				// layout();
			} // widgetSelected

		});
		
		//PlatformUI.getWorkbench().getHelpSystem().setHelp(parent, "org.eclipse.stem.doc.newdisease_contextid");
	}


	
	/**
	 * @return an array of the {@link DiseaseModels}s defined in the system.
	 */
	private Logger[] getLoggers() {
		if (loggers == null) {
			final IExtensionRegistry registry = Platform.getExtensionRegistry();
			final IConfigurationElement[] loggerConfigElements = registry
					.getConfigurationElementsFor(org.eclipse.stem.core.Constants.ID_LOGGER_EXTENSION_POINT);

			final List<Logger> temp = new ArrayList<Logger>();

			loggers = new Logger[loggerConfigElements.length];

			for (IConfigurationElement element : loggerConfigElements) {
				Logger logger = null;
				// Does the element specify the class of the disease model?
				if (element.getName().equals(org.eclipse.stem.core.Constants.LOGGER_ELEMENT)) {
					// Yes
					try {
						logger = (Logger)element.createExecutableExtension("class");//$NON-NLS-1$
						temp.add(logger); 
					} catch (final CoreException e) {
						Activator.logError(
								LoggerWizardMessages.getString("LDC_CreateError"), e); //$NON-NLS-1$
					}
				} // if
			} // for each configuration element
			loggers = temp.toArray(new Logger[] {});
		} // if disesaeModels not created
		
		
		
		// now update the dublin cores with the default plugin.xml info
		for(Logger logger: loggers) {
			if(loggers != null) {
				// JHK getting DC info from the pluggin.xml
				DublinCore dublinCore = Activator.getPluginDublinCore(logger);
				if(dublinCore != null) {
					logger.setDublinCore(dublinCore);
				}
			}
		}

		return loggers;
	} 

	/**
	 * @return the names of the loggers
	 */
	private String[] getLoggerNames(final Logger[] loggers) {
		final String[] retValue = new String[loggers.length];
		for (int i = 0; i < loggers.length; i++) {
			String name = loggers[i].getDublinCore().getTitle();
			// Was a name specified?
			if ((name == null) || name.equals("")) { //$NON-NLS-1$
				// No
				name = loggers[i].getClass().getSimpleName();
			} // if

			retValue[i] = name;
		} // for i
		return retValue;
	}

	/**
	 * 
	 * @return
	 */
	Logger getSelectedLogger() {
		final Logger retValue = EcoreUtil.copy(getLoggers()[combo.getSelectionIndex()]);
		loggerPropertyComposite.populateLogger(retValue);
		return retValue;
	} // getSelectedDiseaseModel

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents sub-classing of SWT components
	}

	/**
	 * @return <code>true</code> if the contents of the control are valid,
	 *         <code>false</code> otherwise.
	 */
	public boolean validate() {
		return loggerPropertyComposite.validate();
	} // validate

	/**
	 * @return the error message set by {@link #validate()}
	 */
	public String getErrorMessage() {
		return loggerPropertyComposite.getErrorMessage();
	}

}
