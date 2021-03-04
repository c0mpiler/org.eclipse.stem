/******************************************************************************* 
 * Copyright (c) 2012 Bundesinstitut für Risikobewertung. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     Bundesinstitut für Risikobewertung - initial API and implementation 
 *******************************************************************************/

package org.eclipse.stem.ui.wizards;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.modifier.Modifier;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.diseasemodels.standard.ExternalDataSourceDiseaseInitializer;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * This class is a {@link NewIdentifiableWizard} for that creates new STEM
 * {@link Modifier}s.
 */
public class NewExternalDataSourceDiseaseInitializerWizard extends NewIdentifiableWizard {

	/**
	 * This is the {@link Identifiable} for which the wizard is creating a
	 * {@link Modifier}.
	 */
	private DiseaseModel target;

	protected NewExternalDataSourceDiseaseInitializerPage newInitializerPage;

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#getWizardTitle()
	 */
	@Override
	protected String getWizardTitle() {
		return DiseaseWizardMessages.getString("NExternalDataSourceDiseaseInitializerWiz.wizard_title"); //$NON-NLS-1$
	}

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#createNewIdentifiablePage()
	 */
	@Override
	protected NewIdentifiablePage createNewIdentifiablePage() {
		newInitializerPage = new NewExternalDataSourceDiseaseInitializerPage(target);
		// TODO setHelpContextId("org.eclipse.stem.doc.newmodifier_contextid");

		return newInitializerPage;
	}

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#createDublinCorePage()
	 */
	@Override
	protected DublinCorePage createDublinCorePage() {
		return new DublinCorePage() {
			@Override
			protected void initializeDCAttributes() {
				super.initializeDCAttributes();

				format.setText(StandardPackage.eNS_URI);
				format.setEnabled(false);
				type.setText(STEMURI.createTypeURI("Initializer").toString());
				type.setEnabled(false);
				titleTextField.setText(DiseaseWizardMessages
						.getString("dc_title_external_initializer"));
				source.setText(DiseaseWizardMessages
						.getString("dc_source_external_initializer"));
				descriptionTextField.setText(DiseaseWizardMessages
						.getString("dc_desc_external_initializer"));
			}
		};
	}

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#createIdentifiable()
	 */
	@Override
	protected Identifiable createIdentifiable() {
		ExternalDataSourceDiseaseInitializer retValue = newInitializerPage.getExternalDataSourceDiseaseInitializer();

		retValue.setDublinCore(newDublinCorePage.createDublinCore());

		return retValue;
	}

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
	}

	public void setTarget(final DiseaseModel target) {
		this.target = target;
	}

	/**
	 * This class is a {@link IHandler} for the command that creates a new
	 * ModifierWizard.
	 */
	public static class NewInitializerWizardCommandHandler extends
			AbstractHandler implements IHandler {

		/**
		 * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
		 */
		public Object execute(final ExecutionEvent executionEvent)
				throws ExecutionException {
			ISelection selection = HandlerUtil
					.getCurrentSelectionChecked(executionEvent);
			DiseaseModel target = (DiseaseModel) ((StructuredSelection) selection)
					.toArray()[0];
			IWorkbenchWindow window = HandlerUtil
					.getActiveWorkbenchWindowChecked(executionEvent);
			NewExternalDataSourceDiseaseInitializerWizard wizard = new NewExternalDataSourceDiseaseInitializerWizard();
			WizardDialog wizardDialog = new STEMWizardDialog(window.getShell(),
					wizard);

			wizard.setTarget(target);
			wizard.init(window.getWorkbench(), StructuredSelection.EMPTY);
			wizardDialog.open();

			return null;
		}

	}

}
