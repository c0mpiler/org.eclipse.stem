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

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.common.DublinCore;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.logger.Logger;
import org.eclipse.stem.core.logger.LoggerPackage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * This class is a Wizard for making new STEM {@link Logger} instances.
 */
public class NewLoggerWizard extends NewIdentifiableWizard {

	private NewLoggerPage nlp = null;
	

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#getWizardTitle()
	 */
	@Override
	protected String getWizardTitle() {
		return LoggerWizardMessages.getString("NLW_Title"); //$NON-NLS-1$
	}

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#createNewIdentifiablePage()
	 */
	@Override
	protected NewIdentifiablePage createNewIdentifiablePage() {
		nlp = new NewLoggerPage(LoggerWizardMessages.getString("NLW_PageTitle"), this); //$NON-NLS-1$
		nlp.setTitle(LoggerWizardMessages.getString("NLW_PageTitle")); //$NON-NLS-1$
		nlp.setDescription(LoggerWizardMessages.getString("NLW_PageDescription")); //$NON-NLS-1$
		
		return nlp;
	} // createNewIdentifiablePage

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#createDublinCorePage()
	 */
	@Override
	protected DublinCorePage createDublinCorePage() {
		return new DublinCorePage() {
			@Override
			protected void initializeDCAttributes() {
				super.initializeDCAttributes();
				format.setText(LoggerPackage.eNS_URI);
				format.setEnabled(false);
				type.setText(STEMURI.LOGGER_TYPE_URI.toString());
				type.setEnabled(false);

				// JHK get the preset Dublin Core fields from the plugin.xml
				final Logger logger = nlp.getSelectedLogger();
				DublinCore plugginDublinCore = logger.getDublinCore();
				this.updateDublinCorePage(plugginDublinCore);
			}
		};
	} // createDublinCorePage


	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#createIdentifiable()
	 */
	@Override
	protected Identifiable createIdentifiable() {
		final Logger retValue = nlp.getSelectedLogger();
		retValue.setDublinCore(newDublinCorePage.createDublinCore());
		return retValue;
	} // createSpecificIdentifiable

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#getSerializationFolderName()
	 */
	@Override
	protected String getSerializationFolderName() {
		return NewSTEMProjectWizard.LOGGERS_FOLDER_NAME;
	}

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#getSerializationFileNameExtension()
	 */
	@Override
	protected String getSerializationFileNameExtension() {
		return LoggerPackage.eNAME;
	} // getIdentifiableSerializationFileExtension

	protected static class NewLoggerPage extends NewIdentifiablePage {

		LoggerDefinitionControl ldc = null;
		NewLoggerWizard parentWizard = null;

		/**
		 * @param pageName
		 */
		protected NewLoggerPage(final String pageName, NewLoggerWizard newLoggerWizard) {
			super(pageName);
			parentWizard = newLoggerWizard;
		}

		@Override
		protected Composite createSpecificComposite(final Composite parent) {
			ldc = new LoggerDefinitionControl(parent, SWT.NONE,
					projectValidator, this.getSelectedProject(), parentWizard);
			return ldc;
		} // createSpecificComposite

		@Override
		protected boolean validatePage() {
			boolean retValue = super.validatePage();
			if (retValue) {
				setErrorMessage(null);
				retValue = ldc.validate();
				// Error?
				if (!retValue) {
					// Yes
					setErrorMessage(ldc.getErrorMessage());
				} // if
			}
			return retValue;
		} 

		Logger getSelectedLogger() {
			return ldc.getSelectedLogger();
		} 

	}

	/**
	 * This class is a {@link IHandler} for the command that creates a
	 * {@link NewDiseaseWizard}
	 */
	public static class NewLoggerWizardCommandHandler extends AbstractHandler
			implements IHandler {

		/**
		 * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
		 */
		public Object execute(final ExecutionEvent executionEvent)
				throws ExecutionException {
			final IWorkbenchWindow window = HandlerUtil
					.getActiveWorkbenchWindowChecked(executionEvent);
			final NewLoggerWizard wizard = new NewLoggerWizard();
			wizard.init(window.getWorkbench(), StructuredSelection.EMPTY);
			final WizardDialog wizardDialog = new STEMWizardDialog(window
					.getShell(), wizard);
			wizardDialog.open();
			return null;
		} // execute
	} 
} 
