// NewPredicateWizard.java
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
import org.eclipse.stem.core.predicate.IdentifiablePredicateExpression;
import org.eclipse.stem.core.predicate.PredicateFactory;
import org.eclipse.stem.core.predicate.PredicatePackage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * This class is a {@link NewIdentifiableWizard} for that creates new STEM
 * {@link org.eclipse.stem.core.predicate.Predicate}s
 */
public class NewPredicateWizard extends NewIdentifiableWizard {

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#getWizardTitle()
	 */
	@Override
	protected String getWizardTitle() {
		return Messages.getString("NPredicateWiz.wizard_title"); //$NON-NLS-1$
	}

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#createNewIdentifiablePage()
	 */
	@Override
	protected NewIdentifiablePage createNewIdentifiablePage() {
		this.setHelpContextId("org.eclipse.stem.doc.newpredicate_contextid");
		return new NewPredicatePage();
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
				format.setText(PredicatePackage.eNS_URI);
				format.setEnabled(false);
				type.setText(STEMURI.PREDICATE_TYPE_URI.toString());
				type.setEnabled(false);
				
				titleTextField.setText(Messages.getString("dc_title_pred"));
				source.setText(Messages.getString("dc_source_pred"));
				descriptionTextField.setText(Messages.getString("dc_desc_pred"));
				
			}
		};
	} // createDublinCorePage

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#createIdentifiable()
	 */
	@Override
	protected Identifiable createIdentifiable() {
		final IdentifiablePredicateExpression retValue = PredicateFactory.eINSTANCE
				.createIdentifiablePredicateExpression();
		retValue.setDublinCore(newDublinCorePage.createDublinCore());
		return retValue;
	} // createIdentifiable

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#getSerializationFolderName()
	 */
	@Override
	protected String getSerializationFolderName() {
		return NewSTEMProjectWizard.PREDICATES_FOLDER_NAME;
	}

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#getSerializationFileNameExtension()
	 */
	@Override
	protected String getSerializationFileNameExtension() {
		return PredicatePackage.eNAME;
	}

	protected static class NewPredicatePage extends NewIdentifiablePage {

		/**
		 * Default Constructor
		 */
		protected NewPredicatePage() {
			super(Messages.getString("NPredicateWiz.page_title")); //$NON-NLS-1$
			setTitle(Messages.getString("NPredicateWiz.page_title")); //$NON-NLS-1$
			setDescription(Messages.getString("NPredicateWiz.page_description")); //$NON-NLS-1$
		} // NewPredicatePage

		@Override
		protected Composite createSpecificComposite(final Composite parent) {
			PlatformUI.getWorkbench().getHelpSystem().setHelp(parent, "org.eclipse.stem.doc.newpredicate_contextid");
			return new Composite(parent, SWT.NONE);
		} // createSpecificComposite

	} // NewPredicatePage

	/**
	 * This class is a {@link IHandler} for the command that creates a
	 * {@link NewPredicateWizard}
	 */
	public static class NewPredicateWizardCommandHandler extends
			AbstractHandler implements IHandler {

		/**
		 * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
		 */
		public Object execute(final ExecutionEvent executionEvent)
				throws ExecutionException {
			final IWorkbenchWindow window = HandlerUtil
					.getActiveWorkbenchWindowChecked(executionEvent);
			final NewPredicateWizard wizard = new NewPredicateWizard();
			wizard.init(window.getWorkbench(), StructuredSelection.EMPTY);
			final WizardDialog wizardDialog = new STEMWizardDialog(window
					.getShell(), wizard);
			wizardDialog.open();
			return null;
		} // execute
	} // NewPredicateWizardCommandHandler
} // NewPredicateWizard