package org.eclipse.stem.analysis.automaticexperiment.ui;

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

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.stem.analysis.automaticexperiment.AutomaticexperimentPackage;
import org.eclipse.stem.analysis.automaticexperiment.OptimizerAlgorithm;
import org.eclipse.stem.analysis.automaticexperiment.views.Messages;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.experiment.ExperimentPackage;
import org.eclipse.stem.ui.Activator;
import org.eclipse.stem.ui.wizards.DublinCorePage;
import org.eclipse.stem.ui.wizards.NewIdentifiablePage;
import org.eclipse.stem.ui.wizards.NewIdentifiableWizard;
import org.eclipse.stem.ui.wizards.NewSTEMProjectWizard;
import org.eclipse.stem.ui.wizards.STEMWizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;


public class NewAutomaticExperimentWizard 
	extends NewIdentifiableWizard {
	
	
	public NewAutomaticExperimentWizard() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#addPages()
	 */
	@Override
	public void addPages() {
		setForcePreviousAndNextButtons(false);
		newIdentifiablePage = createNewIdentifiablePage();
		// Were we successful in creating the page?
		if (newIdentifiablePage == null) {
			// No
			return;
		}
		newDublinCorePage = createDublinCorePage();
		// Were we successful in creating the page?
		if (newDublinCorePage == null) {
			// No
			return;
		}
		addPage(newIdentifiablePage);
		addPage(newDublinCorePage);
	}

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#getNextPage(org.eclipse.jface.wizard.IWizardPage)
	 */
	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		final IWizardPage nextPage = super.getNextPage(page);
		return nextPage;
	}

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
				

				titleTextField.setText(Messages.getString("dc_title_a_exp"));
				source.setText(Messages.getString("dc_source_a_exp"));
				descriptionTextField.setText(Messages.getString("dc_desc_a_exp"));
						
			}
		};
	}

	@Override
	protected Identifiable createIdentifiable() {
		return createAutomaticExperiment();
	}
	NewAutomaticExperimentPage page;
	
	@Override
	protected NewIdentifiablePage createNewIdentifiablePage() {
		this.setHelpContextId("org.eclipse.stem.doc.newautomaticexp_contextid");
		page = new NewAutomaticExperimentPage(getShell(), "New Automatic Experiment Wizard"); //$NON-NLS-1$
		page.setTitle(""); //$NON-NLS-1$
		return page;
	}
	

	@Override
	protected String getSerializationFileNameExtension() {
		return AutomaticexperimentPackage.eNAME;
	}

	@Override
	protected String getSerializationFolderName() {
		return NewSTEMProjectWizard.EXPERIMENTS_FOLDER_NAME;
	}

	@Override
	protected String getWizardTitle() {
		// TODO Externalise this string
		return "Automatic Experiment Wizard";
	}
	
	protected OptimizerAlgorithm createAutomaticExperiment() {
		OptimizerAlgorithm ret = page.algControl.createAutomaticExperiment();
		ret.setDublinCore(newDublinCorePage.createDublinCore());
		return ret;
	}
	
	
	
	protected static class NewAutomaticExperimentPage extends NewIdentifiablePage {
		
		public List parametersList = null;
		public Combo algorithmCombo = null;		
		public Combo errorFunctionCombo = null;
		public Spinner numOfIterationsSpinner = null;
		public Text refDirText = null;
		public Text scenarioText = null;
		protected Shell shell = null;
//		public NewAutomaticExperimentPage2 page2 = null;
		
		AlgorithmControl algControl;
		
		/**
		 * @param pageName
		 *            the name of the page
		 */
		protected NewAutomaticExperimentPage(final Shell shell, final String pageName) {
			super(pageName);
			this.shell = shell;
//			page2 = new NewAutomaticExperimentPage2("Page 2");
//			page2.setPreviousPage(this);
		}

		protected ModifyListener projectValidator = new ModifyListener() {
			public void modifyText(final ModifyEvent e) {
				setPageComplete(validatePage());
			}
		};
		/**
		 * @see org.eclipse.stem.ui.wizards.NewIdentifiablePage#createSpecificComposite(org.eclipse.swt.widgets.Composite)
		 */
		@Override
		protected Composite createSpecificComposite(Composite parent) {
			
			PlatformUI.getWorkbench().getHelpSystem().setHelp(parent, "org.eclipse.stem.doc.newautomaticexp_contextid");
			
			final Composite composite = new Composite(parent, SWT.NONE);
			final GridLayout gridLayout = new GridLayout();
			gridLayout.numColumns = 2;
			composite.setLayout(gridLayout);
			
			final Label label21 = new Label(composite, SWT.NONE);
			label21.setText((Messages.getString("WIZ.ALGORITHM")));					
			algorithmCombo = new Combo(composite, SWT.READ_ONLY);
			initializeAlgorithmsCombo();
			GridData gridData21 = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
			gridData21.horizontalSpan = 1;
			algorithmCombo.setLayoutData(gridData21);

			GridData gridDataCombo = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
			gridDataCombo.horizontalSpan = 1;
			algorithmCombo.setLayoutData(gridDataCombo);

			Label separator = new Label(composite, SWT.SEPARATOR | SWT.HORIZONTAL);
			GridData sepData = new GridData(SWT.FILL, SWT.TOP, true, false);
			sepData.horizontalSpan = 2;
			separator.setLayoutData(sepData);

			algControl = new AlgorithmControl(composite, SWT.NONE, projectValidator, this.getSelectedProject(), algorithms);
			
			GridData gridDataAControl = new GridData(SWT.FILL,SWT.CENTER, true, false, 2, 1);
//			gridDataAControl.horizontalAlignment = 2;
			algControl.setLayoutData(gridDataAControl);
							
			return composite;
		}
		
		private OptimizerAlgorithm[] algorithms;
		
		private void initializeAlgorithmsCombo() {
			
			final IExtensionRegistry registry = Platform.getExtensionRegistry();
			final IConfigurationElement[] algorithmsConfigElements = registry
					.getConfigurationElementsFor(org.eclipse.stem.analysis.automaticexperiment.Constants.ID_ALGORITHM_EXTENSION_POINT);

				final java.util.List<Identifiable> temp = new ArrayList<Identifiable>();

				algorithms = new OptimizerAlgorithm[algorithmsConfigElements.length];

				for (int i = 0; i < algorithmsConfigElements.length; i++) {
					final IConfigurationElement element = algorithmsConfigElements[i];
					// Does the element specify the class of the disease model?
					if (element.getName().equals(org.eclipse.stem.analysis.automaticexperiment.Constants.ALGORITHM_ELEMENT)) {
						// Yes
						try {
							temp.add((OptimizerAlgorithm) element
									.createExecutableExtension(Messages.getString("ALG.1"))); //$NON-NLS-1$
						} catch (final CoreException e) {
							Activator.logError(
									Messages.getString("ALG.3"), e); //$NON-NLS-1$
						}
					} // if
				} // for each configuration element

				algorithms = temp.toArray(new OptimizerAlgorithm[] {});
		

			for(int i=0;i<algorithms.length;++i)
				algorithmCombo.add(algorithms[i].eClass().getName());
			algorithmCombo.select(0);
		}



		/**
		 * @see org.eclipse.stem.ui.wizards.NewIdentifiablePage#validatePage()
		 */
		@Override
		protected boolean validatePage() {
			boolean retValue = super.validatePage();
			if(retValue) {
				setErrorMessage(null);
				retValue = algControl.validate();
				// Error?
				if (!retValue) {
					// Yes
					setErrorMessage(algControl.getErrorMessage());
				} // if
				
			}
			return retValue;
		}
		
	}
	
	
	/**
	 * This class is a {@link IHandler} for the command that creates a
	 * {@link NewAutomaticExperimentWizard}
	 */
	public static class NewAutomaticExperimentWizardCommandHandler extends AbstractHandler
			implements IHandler {

		/**
		 * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
		 */
		public Object execute(final ExecutionEvent executionEvent)
				throws ExecutionException {
			final IWorkbenchWindow window = HandlerUtil
					.getActiveWorkbenchWindowChecked(executionEvent);
			final NewAutomaticExperimentWizard wizard = new NewAutomaticExperimentWizard();
			wizard.init(window.getWorkbench(), StructuredSelection.EMPTY);
			final WizardDialog wizardDialog = new STEMWizardDialog(window
					.getShell(), wizard);
			wizardDialog.open();
			return null;
		} // execute
	}
}
