// NewScenarioWizard.java
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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.stem.core.Constants;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.Utility;
import org.eclipse.stem.core.common.DublinCore;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.scenario.ScenarioPackage;
import org.eclipse.stem.core.solver.Solver;
import org.eclipse.stem.core.solver.SolverPropertyComposite;
import org.eclipse.stem.ui.Activator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * This class is a {@link NewIdentifiableWizard} for that creates new STEM
 * {@link Solver}s.
 */
public class NewSolverWizard extends NewIdentifiableWizard {

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#getWizardTitle()
	 */
	@Override
	protected String getWizardTitle() {
		return Messages.getString("NSolverWiz.wizard_title"); //$NON-NLS-1$
	}

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#createNewIdentifiablePage()
	 */
	@Override
	protected NewIdentifiablePage createNewIdentifiablePage() {
		this.setHelpContextId("org.eclipse.stem.doc.newsolver_contextid");
		return new NewSolverPage();
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
				format.setText(ScenarioPackage.eNS_URI);
				format.setEnabled(false);
				type.setText(STEMURI.SCENARIO_TYPE_URI.toString());
				type.setEnabled(false);
				
				titleTextField.setText(Messages.getString("dc_title_solver"));
				source.setText(Messages.getString("dc_source_solver"));
				descriptionTextField.setText(Messages.getString("dc_desc_solver"));
				
			}
		};
	} // createDublinCorePage

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#createIdentifiable()
	 */
	@Override
	protected Identifiable createIdentifiable() {
		SolverPropertyComposite spc = ((NewSolverPage)newIdentifiablePage).solverPC;
		Solver solver = spc.createSolver();
		solver.setDublinCore(newDublinCorePage.createDublinCore());
		return solver;
	} // createSpecificIdentifiable

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#getSerializationFolderName()
	 */
	@Override
	protected String getSerializationFolderName() {
		return NewSTEMProjectWizard.SOLVERS_FOLDER_NAME;
	}

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#getSerializationFileNameExtension()
	 */
	@Override
	protected String getSerializationFileNameExtension() {
		SolverPropertyComposite spc = ((NewSolverPage)newIdentifiablePage).solverPC;
		Solver s = spc.getSelectedSolver();
		return s.eClass().getEPackage().getName();
	}

	protected static class NewSolverPage extends NewIdentifiablePage {

		private Solver [] solvers = null;
		
		SolverPropertyComposite solverPC;
		
		private Combo combo;
		/**
		 * Default Constructor
		 */
		protected NewSolverPage() {
			super(Messages.getString("NSolverWiz.page_title")); //$NON-NLS-1$
			setTitle(Messages.getString("NSolverWiz.page_title")); //$NON-NLS-1$
			setDescription(Messages.getString("NSolverWiz.page_description")); //$NON-NLS-1$
		} // NewScenarioPage

		/**
		 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard.NewIdentifiablePage#createSpecificComposite(org.eclipse.swt.widgets.Composite)
		 */
		@Override
		protected Composite createSpecificComposite(final Composite parent) {

			Solver [] solvers = getSolvers();
			
			final Composite composite = new Composite(parent, SWT.NONE);

			
			final GridLayout gridLayout = new GridLayout();
			gridLayout.marginWidth = 0;
			gridLayout.numColumns = 1;
			composite.setLayout(gridLayout);

			final Label solverLabel = new Label(composite, SWT.NONE);
			final GridData gd_solverLabel = new GridData(SWT.FILL, SWT.CENTER, true, false);
			gd_solverLabel.widthHint = 100;
			solverLabel.setLayoutData(gd_solverLabel);
			solverLabel.setText(Messages.getString("NSolverWiz.solver")); //$NON-NLS-1$

			combo = new Combo(composite, SWT.READ_ONLY);
			combo.setTextLimit(30);
			final GridData gd_combo = new GridData(SWT.FILL, SWT.CENTER, true,
					false);
			gd_combo.widthHint = 303;
			combo.setLayoutData(gd_combo);

			combo.setToolTipText(Messages.getString("NSolverWiz.solver")); //$NON-NLS-1$
			// Initialize the list of disease models available
			combo.setItems(getSolverNames(solvers));
			// Set the one from preferences
			
			final NewSolverPage self = this;
			combo.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					self.displaySolver(getSolvers()[combo.getSelectionIndex()]);
					setPageComplete(validatePage());
					// layout();
				} // widgetSelected
			});
			
			combo.select(0);
			
			combo.addModifyListener(projectValidator);

			solverPC = new SolverPropertyComposite(composite, 1, solvers, projectValidator);
			displaySolver(solvers[0]);
			PlatformUI.getWorkbench().getHelpSystem().setHelp(parent, "org.eclipse.stem.doc.newsolver_contextid");
			
			return composite;
		} // createSpecificComposite

		/**
		 * 
		 */
		
		private org.eclipse.stem.core.solver.Solver [] getSolvers() {
			final IPreferenceStore preferenceStore = org.eclipse.stem.ui.Activator.getDefault().getPreferenceStore();
			String prefSolver = preferenceStore.getString(org.eclipse.stem.ui.preferences.PreferenceConstants.DEFAULT_SOLVER);
			
			if (solvers == null) {
				final IExtensionRegistry registry = Platform.getExtensionRegistry();
				final IConfigurationElement[] solverConfigElements = registry
						.getConfigurationElementsFor(org.eclipse.stem.core.Constants.ID_SOLVER_EXTENSION_POINT);

				
				final List<Solver> temp = new ArrayList<Solver>();
				final List<DublinCore> dctemp = new ArrayList<DublinCore>();
				
				solvers = new Solver[solverConfigElements.length];
				boolean insertedTop = false;
				
				for (int i = 0; i < solverConfigElements.length; i++) {
					final IConfigurationElement element = solverConfigElements[i];
					// Does the element specify the class of the disease model?
					if (element.getName().equals(Constants.SOLVER_ELEMENT)) {
						// Yes
						try {
							Solver s = (Solver) element.createExecutableExtension("class");
								
							if(s.getClass().getName().equals(prefSolver)&& i > 0) {
									// Set the preference one on top
									Solver tmp = temp.get(0);
									temp.set(0, s);
									temp.add(tmp);
									insertedTop = true;
							} else {insertedTop = false;
								temp.add(s); //$NON-NLS-1$
							}
						} catch (final CoreException e) {
							Activator.logError(
									"Can't create solver", e); //$NON-NLS-1$
						}
					} else if (element.getName().equals(Constants.DUBLIN_CORE_ELEMENT)) {
						if(insertedTop) {
							DublinCore dc = Utility.getPluginDublinCore(element);
							DublinCore tmp = dctemp.get(0);
							dctemp.set(0,  dc);
							dctemp.add(tmp);
						} else dctemp.add(Utility.getPluginDublinCore(element));
					}
				}

				solvers = temp.toArray(new Solver[] {});
				int n=0;
				for(n=0;n<solvers.length;++n) solvers[n].setDublinCore(dctemp.get(n));
			} 

			// now update the dublin cores with the default plugin.xml info
			
			return solvers;
		}

		/**
		 * @return the names of the solvers
		 */
		private String[] getSolverNames(final Solver[] solvers) {
			final IPreferenceStore preferenceStore = org.eclipse.stem.ui.Activator.getDefault().getPreferenceStore();
			String prefSolver = preferenceStore.getString(org.eclipse.stem.ui.preferences.PreferenceConstants.DEFAULT_SOLVER);
			
			final String[] retValue = new String[solvers.length];
			// String firstOne = null;
			for (int i = 0; i < solvers.length; i++) {
				String name = solvers[i].getDublinCore().getTitle();
				// Was a name specified?
				if ((name == null) || name.equals("")) { //$NON-NLS-1$
					// No
					name = solvers[i].getClass().getSimpleName();
				} // if
				if(solvers[i].getClass().getName().equals(prefSolver)&& i > 0) {
					// Set the preference one on top
					String tmp = retValue[0];
					retValue[0] = name;
					retValue[i] = tmp;
				}
				else retValue[i] = name;
			} // for i
			return retValue;
		} // getDiseaseModelNames
		
		void displaySolver(final Solver solver) {
			solverPC.displaySolver(solver);
		} // displaySolver
		
		@Override
		protected boolean validatePage() {
			boolean retValue = super.validatePage();
			if (retValue) {
				setErrorMessage(null);
				retValue = solverPC.validate();
				// Error?
				if (!retValue) {
					// Yes
					setErrorMessage(solverPC.getErrorMessage());
				} // if
			}
			return retValue;
		} // validatePage
	} // NewScenarioPage

	/**
	 * This class is a {@link IHandler} for the command that creates a
	 * {@link NewSolverWizard}
	 */
	public static class NewSolverWizardCommandHandler extends AbstractHandler
			implements IHandler {

		/**
		 * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
		 */
		public Object execute(final ExecutionEvent executionEvent)
				throws ExecutionException {
			final IWorkbenchWindow window = HandlerUtil
					.getActiveWorkbenchWindowChecked(executionEvent);
			final NewSolverWizard wizard = new NewSolverWizard();
			wizard.init(window.getWorkbench(), StructuredSelection.EMPTY);
			final WizardDialog wizardDialog = new STEMWizardDialog(window
					.getShell(), wizard);
			wizardDialog.open();
			return null;
		} // execute
	} // NewSolverWizardCommandHandler
} // NewSolverWizard