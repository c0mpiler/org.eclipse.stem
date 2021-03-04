// NewExperimentWizard.java
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

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.experiment.ExperimentFactory;
import org.eclipse.stem.core.experiment.ExperimentPackage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * This class is a Wizard for making new STEM
 * {@link org.eclipse.stem.core.experiment.Experiment}s.
 * 
 * @see org.eclipse.stem.core.model.Model
 * @see org.eclipse.stem.ui.wizards.NewGraphWizard
 */
public class NewExperimentWizard extends NewIdentifiableWizard {

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#getWizardTitle()
	 */
	@Override
	protected String getWizardTitle() {
		return Messages.getString("NExperimentWiz.wizard_title"); //$NON-NLS-1$
	}

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#createNewIdentifiablePage()
	 */
	@Override
	protected NewIdentifiablePage createNewIdentifiablePage() {
		final NewExperimentPage retValue = new NewExperimentPage(Messages
				.getString("NExperimentWiz.page_title")); //$NON-NLS-1$
		retValue.setTitle(Messages.getString("NExperimentWiz.page_title")); //$NON-NLS-1$
		retValue.setDescription(Messages
				.getString("NExperimentWiz.page_description")); //$NON-NLS-1$

		this.setHelpContextId("org.eclipse.stem.doc.newexperiment_contextid");
		return retValue;
	} // createNewIdentifiablePage

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#createDublinCorePage()
	 */
	@Override
	protected DublinCorePage createDublinCorePage() {
		return new DublinCorePage() {
			/**
			 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard.DublinCorePage#initializeDCFields()
			 */
			@Override
			protected void initializeDCAttributes() {
				super.initializeDCAttributes();
				format.setText(ExperimentPackage.eNS_URI);
				format.setEnabled(false);
				type.setText(STEMURI.EXPERIMENT_TYPE_URI.toString());
				type.setEnabled(false);

				titleTextField.setText(Messages.getString("dc_title_exp"));
				source.setText(Messages.getString("dc_source_exp"));
				descriptionTextField.setText(Messages.getString("dc_desc_exp"));
						
			}
		};
	} // createDublinCorePage

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#createIdentifiable()
	 */
	@Override
	protected Identifiable createIdentifiable() {
		Identifiable retValue = ExperimentFactory.eINSTANCE.createExperiment();
		retValue.setDublinCore(newDublinCorePage.createDublinCore());
		return retValue;
	} // createSpecificIdentifiable

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#getSerializationFolderName()
	 */
	@Override
	protected String getSerializationFolderName() {
		return NewSTEMProjectWizard.EXPERIMENTS_FOLDER_NAME;
	} // getFolderName

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#getSerializationFileNameExtension()
	 */
	@Override
	protected String getSerializationFileNameExtension() {
		return ExperimentPackage.eNAME;
	}

	protected static class NewExperimentPage extends NewIdentifiablePage {

		/**
		 * @param pageName
		 */
		protected NewExperimentPage(final String pageName) {
			super(pageName);
		}
		
		@Override
		protected Composite createSpecificComposite(final Composite parent) {
			PlatformUI.getWorkbench().getHelpSystem().setHelp(parent, "org.eclipse.stem.doc.newexperiment_contextid");
			return new Composite(parent, SWT.NONE);
		} // createSpecificComposite

	} // NewExperimentPage

	/**
	 * This class is a {@link IHandler} for the command that creates a
	 * {@link NewExperimentWizard}
	 */
	public static class NewExperimentWizardCommandHandler extends AbstractHandler
			implements IHandler {

		/**
		 * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
		 */
		public Object execute(final ExecutionEvent executionEvent)
				throws ExecutionException {
			final IWorkbenchWindow window = HandlerUtil
					.getActiveWorkbenchWindowChecked(executionEvent);
			final NewExperimentWizard wizard = new NewExperimentWizard();
			wizard.init(window.getWorkbench(), StructuredSelection.EMPTY);
			final WizardDialog wizardDialog = new STEMWizardDialog(window
					.getShell(), wizard);
			wizardDialog.open();
			return null;
		} // execute
	} // NewExperimentWizardCommandHandler

} // NewExperimentWizard