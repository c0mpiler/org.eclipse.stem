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
package org.eclipse.stem.foodproduction.presentation;


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
import org.eclipse.stem.foodproduction.Constants;
import org.eclipse.stem.foodproduction.FoodTransformer;
import org.eclipse.stem.foodproduction.FoodproductionPackage;
import org.eclipse.stem.ui.wizards.DublinCorePage;
import org.eclipse.stem.ui.wizards.NewIdentifiablePage;
import org.eclipse.stem.ui.wizards.NewIdentifiableWizard;
import org.eclipse.stem.ui.wizards.NewSTEMProjectWizard;
import org.eclipse.stem.ui.wizards.STEMWizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * This class is a Wizard for making new STEM {@link DiseaseModel} instances.
 */
public class NewFoodTransformerWizard extends NewIdentifiableWizard {

	private NewFoodTransformerPage nfpp = null;
	

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#getWizardTitle()
	 */
	@Override
	protected String getWizardTitle() {
		return FoodProductionMessages.getString("NFPWiz.wizard_title"); //$NON-NLS-1$
	}

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#createNewIdentifiablePage()
	 */
	@Override
	protected NewIdentifiablePage createNewIdentifiablePage() {
		nfpp = new NewFoodTransformerPage(FoodProductionMessages
				.getString("NFPWiz.page_title"), this); //$NON-NLS-1$
		nfpp.setTitle(FoodProductionMessages.getString("NFPWiz.page_title")); //$NON-NLS-1$
		nfpp.setDescription(FoodProductionMessages
				.getString("NFPWiz.page_description")); //$NON-NLS-1$
		
		this.setHelpContextId("org.eclipse.stem.doc.newfoodproduction_contextid");

		return nfpp;
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
				
				format.setText(FoodproductionPackage.eNS_URI);
				format.setEnabled(false);
				type.setText(STEMURI.createTypeURI(
						Constants.URI_TYPE_FOODTRANSFORMER_SEGMENT).toString());
				type.setEnabled(false);
				
				// JHK get the preset Dublin Core fields from the plugin.xml
				final FoodTransformer foodTransformer = nfpp.getSelectedFoodTransformer();
				DublinCore plugginDublinCore = foodTransformer.getDublinCore();
				this.updateDublinCorePage(plugginDublinCore);
				
			}
		}; // DublinCorePage
	} // createDublinCorePage

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#createIdentifiable()
	 */
	@Override
	protected Identifiable createIdentifiable() {
		final FoodTransformer retValue = nfpp.getSelectedFoodTransformer();
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
		return FoodproductionPackage.eNAME;
	} // getIdentifiableSerializationFileExtension

	protected static class NewFoodTransformerPage extends NewIdentifiablePage {

		FoodProductionDefinitionControl fpc = null;
		NewFoodTransformerWizard parentWizard = null;

		/**
		 * @param pageName
		 */
		protected NewFoodTransformerPage(final String pageName, NewFoodTransformerWizard newFPWizard) {
			super(pageName);
			parentWizard = newFPWizard;
		}

		@Override
		protected Composite createSpecificComposite(final Composite parent) {
			fpc = new FoodProductionDefinitionControl(parent, SWT.NONE,
					projectValidator, this.getSelectedProject(), parentWizard);
			return fpc;
		} // createSpecificComposite

		@Override
		protected boolean validatePage() {
			boolean retValue = super.validatePage();
			if (retValue) {
				setErrorMessage(null);
				retValue = fpc.validate();
				// Error?
				if (!retValue) {
					// Yes
					setErrorMessage(fpc.getErrorMessage());
				} // if
			}
			return retValue;
		} // validatePage

		FoodTransformer getSelectedFoodTransformer() {
			return fpc.getSelectedFoodTransformer();
		} // getSelectedDiseaseModel

	} // NewDiseasePage

	/**
	 * This class is a {@link IHandler} for the command that creates a
	 * {@link NewFoodTransformerWizard}
	 */
	public static class NewFoodTransformerWizardCommandHandler extends AbstractHandler
			implements IHandler {

		/**
		 * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
		 */
		public Object execute(final ExecutionEvent executionEvent)
				throws ExecutionException {
			final IWorkbenchWindow window = HandlerUtil
					.getActiveWorkbenchWindowChecked(executionEvent);
			final NewFoodTransformerWizard wizard = new NewFoodTransformerWizard();
			wizard.init(window.getWorkbench(), StructuredSelection.EMPTY);
			final WizardDialog wizardDialog = new STEMWizardDialog(window
					.getShell(), wizard);
			wizardDialog.open();
			return null;
		} // execute
	} 
} // NewFoodProducerWizard
