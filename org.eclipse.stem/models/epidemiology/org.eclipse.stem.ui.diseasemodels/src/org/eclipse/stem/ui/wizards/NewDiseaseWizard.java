// NewDiseaseWizard.java
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
import org.eclipse.stem.core.common.DublinCore;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * This class is a Wizard for making new STEM {@link DiseaseModel} instances.
 */
public class NewDiseaseWizard extends NewIdentifiableWizard {

	private NewDiseasePage ndp = null;
	

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#getWizardTitle()
	 */
	@Override
	protected String getWizardTitle() {
		return DiseaseWizardMessages.getString("NDiseaseWiz.wizard_title"); //$NON-NLS-1$
	}

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#createNewIdentifiablePage()
	 */
	@Override
	protected NewIdentifiablePage createNewIdentifiablePage() {
		ndp = new NewDiseasePage(DiseaseWizardMessages
				.getString("NDiseaseWiz.page_title"), this); //$NON-NLS-1$
		ndp.setTitle(DiseaseWizardMessages.getString("NDiseaseWiz.page_title")); //$NON-NLS-1$
		ndp.setDescription(DiseaseWizardMessages
				.getString("NDiseaseWiz.page_description")); //$NON-NLS-1$
		
		this.setHelpContextId("org.eclipse.stem.doc.newdisease_contextid");

		return ndp;
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
				
				format.setText(StandardPackage.eNS_URI);
				format.setEnabled(false);
				type.setText(STEMURI.createTypeURI(
						DiseaseModel.URI_TYPE_DISEASEMODEL_SEGMENT).toString());
				type.setEnabled(false);
				
				// JHK get the preset Dublin Core fields from the plugin.xml
				final DiseaseModel diseaseModel = ndp.getSelectedDiseaseModel();
				DublinCore plugginDublinCore = diseaseModel.getDublinCore();
				this.updateDublinCorePage(plugginDublinCore);
				
			}
		}; // DublinCorePage
	} // createDublinCorePage

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#createIdentifiable()
	 */
	@Override
	protected Identifiable createIdentifiable() {
		final DiseaseModel retValue = ndp.getSelectedDiseaseModel();
		retValue.setDublinCore(newDublinCorePage.createDublinCore());
		return retValue;
	} // createSpecificIdentifiable

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#getSerializationFolderName()
	 */
	@Override
	protected String getSerializationFolderName() {
		return NewSTEMProjectWizard.DECORATORS_FOLDER_NAME;
	}

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#getSerializationFileNameExtension()
	 */
	@Override
	protected String getSerializationFileNameExtension() {
		return StandardPackage.eNAME;
	} // getIdentifiableSerializationFileExtension

	protected static class NewDiseasePage extends NewIdentifiablePage {

		DiseaseDefinitionControl ddc = null;
		NewDiseaseWizard parentWizard = null;

		/**
		 * @param pageName
		 */
		protected NewDiseasePage(final String pageName, NewDiseaseWizard newDiseaseWizard) {
			super(pageName);
			parentWizard = newDiseaseWizard;
		}

		@Override
		protected Composite createSpecificComposite(final Composite parent) {
			ddc = new DiseaseDefinitionControl(parent, SWT.NONE,
					projectValidator, this.getSelectedProject(), parentWizard);
			return ddc;
		} // createSpecificComposite

		@Override
		protected boolean validatePage() {
			boolean retValue = super.validatePage();
			if (retValue) {
				setErrorMessage(null);
				retValue = ddc.validate();
				// Error?
				if (!retValue) {
					// Yes
					setErrorMessage(ddc.getErrorMessage());
				} // if
			}
			return retValue;
		} // validatePage

		DiseaseModel getSelectedDiseaseModel() {
			return ddc.getSelectedDiseaseModel();
		} // getSelectedDiseaseModel

	} // NewDiseasePage

	/**
	 * This class is a {@link IHandler} for the command that creates a
	 * {@link NewDiseaseWizard}
	 */
	public static class NewDiseaseWizardCommandHandler extends AbstractHandler
			implements IHandler {

		/**
		 * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
		 */
		public Object execute(final ExecutionEvent executionEvent)
				throws ExecutionException {
			final IWorkbenchWindow window = HandlerUtil
					.getActiveWorkbenchWindowChecked(executionEvent);
			final NewDiseaseWizard wizard = new NewDiseaseWizard();
			wizard.init(window.getWorkbench(), StructuredSelection.EMPTY);
			final WizardDialog wizardDialog = new STEMWizardDialog(window
					.getShell(), wizard);
			wizardDialog.open();
			return null;
		} // execute
	} // NewDiseaseWizardCommandHandler
} // NewDiseaseWizard