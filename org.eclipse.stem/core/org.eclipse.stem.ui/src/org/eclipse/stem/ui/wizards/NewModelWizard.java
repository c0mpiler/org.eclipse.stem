// NewModelWizard.java
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
import org.eclipse.stem.core.model.Model;
import org.eclipse.stem.core.model.ModelFactory;
import org.eclipse.stem.core.model.ModelPackage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * This class is a {@link NewIdentifiableWizard} for that creates new STEM
 * {@link Model}s.
 */
public class NewModelWizard extends NewIdentifiableWizard {

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#getWizardTitle()
	 */
	@Override
	protected String getWizardTitle() {
		return Messages.getString("NModelWiz.wizard_title"); //$NON-NLS-1$
	} // getWizardTitle

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#createNewIdentifiablePage()
	 */
	@Override
	protected NewIdentifiablePage createNewIdentifiablePage() {
		this.setHelpContextId("org.eclipse.stem.doc.newmodel_contextid");
		return new NewModelPage();
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
	
				format.setText(ModelPackage.eNS_URI);
				format.setEnabled(false);
				type.setText(STEMURI.MODEL_TYPE_URI.toString());
				type.setEnabled(false);
				
				titleTextField.setText(Messages.getString("dc_title_model"));
				source.setText(Messages.getString("dc_source_model"));
				descriptionTextField.setText(Messages.getString("dc_desc_model"));
						
			}
		};
	} // createDublinCorePage

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#createIdentifiable()
	 */
	@Override
	protected Identifiable createIdentifiable() {
		final Model retValue = ModelFactory.eINSTANCE.createModel();
		retValue.setDublinCore(newDublinCorePage.createDublinCore());
		return retValue;
	} // createSpecificIdentifiable

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#getSerializationFolderName()
	 */
	@Override
	protected String getSerializationFolderName() {
		return NewSTEMProjectWizard.MODELS_FOLDER_NAME;
	}

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#getSerializationFileNameExtension()
	 */
	@Override
	protected String getSerializationFileNameExtension() {
		return ModelPackage.eNAME;
	}

	protected static class NewModelPage extends NewIdentifiablePage {

		/**
		 * Default Constructor
		 */
		protected NewModelPage() {
			super(Messages.getString("NModelWiz.page_title")); //$NON-NLS-1$
			setTitle(Messages.getString("NModelWiz.page_title")); //$NON-NLS-1$
			setDescription(Messages.getString("NModelWiz.page_description")); //$NON-NLS-1$
		} // NewModelPage

		@Override
		protected Composite createSpecificComposite(final Composite parent) {
			PlatformUI.getWorkbench().getHelpSystem().setHelp(parent, "org.eclipse.stem.doc.newmodel_contextid");
			return new Composite(parent, SWT.NONE);
		} // createSpecificComposite

	} // NewModelPage

	/**
	 * This class is a {@link IHandler} for the command that creates a
	 * {@link NewModelWizard}
	 */
	public static class NewModelWizardCommandHandler extends AbstractHandler
			implements IHandler {

		/**
		 * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
		 */
		public Object execute(final ExecutionEvent executionEvent)
				throws ExecutionException {
			final IWorkbenchWindow window = HandlerUtil
					.getActiveWorkbenchWindowChecked(executionEvent);
			final NewModelWizard wizard = new NewModelWizard();
			wizard.init(window.getWorkbench(), StructuredSelection.EMPTY);
			final WizardDialog wizardDialog = new STEMWizardDialog(window
					.getShell(), wizard);
			wizardDialog.open();
			return null;
		} // execute
	} // NewModelWizardCommandHandler

} // NewModelWizard
