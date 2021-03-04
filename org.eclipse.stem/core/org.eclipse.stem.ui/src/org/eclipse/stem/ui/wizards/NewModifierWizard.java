// NewModifierWizard.java
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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.DelegatingWrapperItemProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.graph.Edge;
import org.eclipse.stem.core.modifier.FeatureModifier;
import org.eclipse.stem.core.modifier.Modifier;
import org.eclipse.stem.core.modifier.ModifierFactory;
import org.eclipse.stem.core.modifier.ModifierPackage;
import org.eclipse.stem.ui.Activator;
import org.eclipse.stem.ui.adapters.newmodifierpage.NewModifierPageAdapter;
import org.eclipse.stem.ui.adapters.newmodifierpage.NewModifierPageAdapterFactory;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * This class is a {@link NewIdentifiableWizard} for that creates new STEM
 * {@link Modifier}s.
 */
public class NewModifierWizard extends NewIdentifiableWizard {

	/**
	 * This is the {@link Identifiable} for which the wizard is creating a
	 * {@link Modifier}.
	 */
	private EObject target;
	private NewModifierPage newModifierPage;

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#getWizardTitle()
	 */
	@Override
	protected String getWizardTitle() {
		return Messages.getString("NModifierWiz.wizard_title"); //$NON-NLS-1$
	}

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#createNewIdentifiablePage()
	 */
	@Override
	protected NewIdentifiablePage createNewIdentifiablePage() {

		// We use an adapter factory to adapt the Identifiable into a
		// NewModifierPage. We do this because the universe of Identifiables is
		// unlimited. The number and types of fields can vary widely. The
		// adapter factory is Composable which means that it maintains an
		// extensible collection of other factories that can be used to perform
		// the adaption. For instance, a new Decorator (a type of Identifiable)
		// that implements a disease model computation can be adapted by the
		// addition of a factory that recognizes it.
		final NewModifierPageAdapter adapter = (NewModifierPageAdapter) NewModifierPageAdapterFactory.INSTANCE
				.adapt(target, NewModifierPageAdapter.class);
		// Were we successful in adapting?
		if (adapter != null) {
			// Yes
			adapter.setTarget(target);
			newModifierPage = adapter.createNewModifierPage();
		} // if
		else {
			// No
			Activator.logError(
					"Internal Error: could not create NewModifierPage for \""
							+ target.getClass().getName() + "\"", null);
			newModifierPage = new NewModifierPage(target) {
				@Override
				protected Composite createSpecificComposite(
						final Composite parent) {
					return null;
				}
			};
		} // else
		
		this.setHelpContextId("org.eclipse.stem.doc.newmodifier_contextid"); //HERE

		return newModifierPage;
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
				format.setText(ModifierPackage.eNS_URI);
				format.setEnabled(false);
				type.setText(STEMURI.MODIFIER_TYPE_URI.toString());
				type.setEnabled(false);
				
				titleTextField.setText(Messages.getString("dc_title_mod"));
				source.setText(Messages.getString("dc_source_mod"));
				descriptionTextField.setText(Messages.getString("dc_desc_mod"));
				
			}
		};
	} // createDublinCorePage

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#createIdentifiable()
	 */
	@Override
	protected Identifiable createIdentifiable() {
		final Modifier retValue = ModifierFactory.eINSTANCE.createModifier();
		retValue.setDublinCore(newDublinCorePage.createDublinCore());
		// We allow Edges to be considered to be "modifiable", but we really
		// mean that their labels can be modified. This is a convenience for the
		// user so that they can right-click on an Edge and create a modifier
		// for their label. The problem is that we've got to get the right
		// target URI, if we just get the URI of the Identifiable (which could
		// be an EdgeLabel) then we'd get the URI of the Edge and not its Label.

		// Is this an Edge?
		if (target instanceof Edge) {
			// Yes
			final Edge edge = (Edge) target;
			retValue.setTargetURI(edge.getLabel().getURI());
		} else if(target instanceof Identifiable){
			retValue.setTargetURI(((Identifiable)target).getURI());
		} else if(target instanceof FeatureModifier) { 
			// The actual file system persisted object is the Modifier,
			// containing a list of FeatureModifiers. We need to 
			// determine the index of the feature modifier in the list
			// and encode that in the URI. This way we can pull
			// out the correct one later when needed. 
			// DANGER. When modifiers are deleted the index is WRONG/
			// This is a TODO.
			Modifier mod = (Modifier)((FeatureModifier)target).eContainer();
			int index = mod.getFeatureModifiers().indexOf(target);
			URI uri = mod.getURI();
			retValue.setTargetURI(URI.createURI(uri+"?"+index));
		}
		else  retValue.setTargetURI(null); // String value or double value
		retValue.getFeatureModifiers().addAll(
				newModifierPage.getFeatureModifiers());
		return retValue;
	} // createSpecificIdentifiable

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#getSerializationFolderName()
	 */
	@Override
	protected String getSerializationFolderName() {
		return NewSTEMProjectWizard.MODIFIERS_FOLDER_NAME;
	} // getSerializationFolderName

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#getSerializationFileNameExtension()
	 */
	@Override
	protected String getSerializationFileNameExtension() {
		return ModifierPackage.eNAME;
	} // getIdentifiableSerializationFileExtension

	/**
	 * @param target
	 *            the target that the will
	 *            modify.
	 */
	final public void setTarget(final EObject target) {
		this.target = target;
	}

	/**
	 * This class is a {@link IHandler} for the command that creates a new
	 * ModifierWizard.
	 */
	public static class NewModifierWizardCommandHandler extends AbstractHandler
			implements IHandler {

		/**
		 * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
		 */
		public Object execute(final ExecutionEvent executionEvent)
				throws ExecutionException {

			final ISelection selection = HandlerUtil
					.getCurrentSelectionChecked(executionEvent);

			// Structured Selection?
			if (selection instanceof StructuredSelection) {
				// Yes
				try {
					final Object obj = ((StructuredSelection) selection).toArray()[0];
					EObject target = null;
					if(obj instanceof DelegatingWrapperItemProvider) 
						target = unravel((DelegatingWrapperItemProvider)obj);
					else if (obj instanceof EObject) 
						target = (EObject)obj;
					
					if(target != null) {
						final IWorkbenchWindow window = HandlerUtil
								.getActiveWorkbenchWindowChecked(executionEvent);
						final NewModifierWizard wizard = new NewModifierWizard();
						wizard.setTarget(target);
						wizard.init(window.getWorkbench(),
								StructuredSelection.EMPTY);
						final WizardDialog wizardDialog = new STEMWizardDialog(window
								.getShell(), wizard);
						wizardDialog.open();
					} else {
						// No
						Activator.logError(
								"Internal error: attempting to create Modifier Wizard for \""
										+ obj.getClass().getName() + "\"", null);
					} // else
				} catch (ArrayIndexOutOfBoundsException ioobe) {
					// Ignore, it just means there wasn't anything really selected.
				}
			} // if StructuredSelection

			return null;
		} // execute
		
		EObject unravel(DelegatingWrapperItemProvider obj) {
			if(obj.getValue() instanceof DelegatingWrapperItemProvider)
				return unravel((DelegatingWrapperItemProvider)obj.getValue());
			else return (EObject)obj.getValue();
		}
	} // NewModifierWizardCommandHandler
} // NewModifierWizard
