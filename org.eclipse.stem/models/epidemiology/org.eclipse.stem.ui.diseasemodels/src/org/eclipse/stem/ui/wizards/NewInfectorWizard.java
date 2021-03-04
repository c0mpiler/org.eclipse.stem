// NewInfectorWizard.java
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

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.stem.analysis.impl.ReferenceScenarioDataMapImpl;
import org.eclipse.stem.analysis.impl.ReferenceScenarioDataMapImpl.ReferenceScenarioDataInstance;
import org.eclipse.stem.analysis.util.CSVscenarioLoader;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.common.util.LogInitializationException;
import org.eclipse.stem.core.model.NodeDecorator;
import org.eclipse.stem.diseasemodels.standard.InfectorInoculatorCollection;
import org.eclipse.stem.diseasemodels.standard.SIInfector;
import org.eclipse.stem.diseasemodels.standard.SIRInoculator;
import org.eclipse.stem.diseasemodels.standard.StandardFactory;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.diseasemodels.standard.impl.SIRInoculatorImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * This class represents
 */
public class NewInfectorWizard extends NewIdentifiableWizard {

	private NewInfectorPage nip = null;

	/**
	 * Constructor
	 */
	public NewInfectorWizard() {
		// Nothing
	}

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#getWizardTitle()
	 */
	@Override
	protected String getWizardTitle() {
		return DiseaseWizardMessages.getString("NInfectorWiz.wizard_title"); //$NON-NLS-1$
	}

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#createNewIdentifiablePage()
	 */
	@Override
	protected NewIdentifiablePage createNewIdentifiablePage() {
		nip = new NewInfectorPage(DiseaseWizardMessages.getString("NInfectorWiz.page_title")); //$NON-NLS-1$
		nip.setTitle(DiseaseWizardMessages.getString("NInfectorWiz.page_title")); //$NON-NLS-1$
		nip.setDescription(DiseaseWizardMessages.getString("NInfectorWiz.page_description")); //$NON-NLS-1$
		
		this.setHelpContextId("org.eclipse.stem.doc.newinfectorinoculator_contextid");

		return nip;
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
				// type.setText("undefined");
				// type.setText(STEMURI.SCENARIO_TYPE_URI.toString());
				type.setEnabled(false);
			}
		}; // DublinCorePage
	}

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#createIdentifiable()
	 */
	@Override
	protected Identifiable createIdentifiable() {
		final NodeDecorator retValue = nip.getInfector();
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
	}

	protected static class NewInfectorPage extends NewIdentifiablePage {

		private InfectorDefinitionComposite idc;

		/**
		 * @param pageName
		 */
		protected NewInfectorPage(String pageName) {
			super(pageName);
		}

		/**
		 * @return
		 */
		public NodeDecorator getInfector() {
			if(!idc.isFromFile()) {
				SIInfector retValue = null;
				if(idc.isInfectorMode()) {
					retValue = StandardFactory.eINSTANCE.createSIInfector();
					retValue.setTargetFeature("i"); // default for infector
				} else {
					retValue = StandardFactory.eINSTANCE.createSIRInoculator();
					retValue.setTargetFeature("r"); // default for inoculator
				}
				retValue.setDiseaseName(idc.getDiseaseName());
				retValue.setPopulationIdentifier(idc.getPopulation());
				retValue.setTargetISOKey(idc.getIsoKey());
				retValue.setTargetURI(idc.getTargetURI());
				if(idc.isInfectorMode() && idc.isPercentage()) {
					retValue.setInfectPercentage(true);
					retValue.setInfectiousCount(idc.getNumber());
				} else if(idc.isInfectorMode() && !idc.isPercentage()) {
					retValue.setInfectPercentage(false);
					retValue.setInfectiousCount(idc.getNumber());
				} else if( idc.isPercentage()){
					((SIRInoculatorImpl) retValue).setInoculatedPercentage(idc.getNumber());
					
					((SIRInoculatorImpl) retValue).setInoculatePercentage(true);
					// just to be sure - since this is NOT and Infector
					retValue.setInfectiousCount(0.0);
				} else {
					((SIRInoculatorImpl) retValue).setInoculatedPercentage(idc.getNumber());
					((SIRInoculatorImpl) retValue).setInoculatePercentage(false);
					// just to be sure - since this is NOT and Infector
					retValue.setInfectiousCount(0.0);
				}
				return retValue;
			} else {
				// We need to create a InfectorInoculatorList object
				// and read the data from file
				
				String folder = idc.getImportFolder();
				ReferenceScenarioDataMapImpl  map = null;
				List<Integer>resolutions = null;
				try {
					CSVscenarioLoader loader = new CSVscenarioLoader(folder);
					//resolutions = loader.getResolutions();
					map = loader.parseAllFiles();
				} catch(LogInitializationException sie) {
					org.eclipse.stem.diseasemodels.Activator.logError(sie.getMessage(), sie);
					return null;
				}
				InfectorInoculatorCollection iic = StandardFactory.eINSTANCE.createInfectorInoculatorCollection();
				iic.setImportFolder(folder);
				for(String location : map.getLocations()) {
					ReferenceScenarioDataInstance instance = map.getLocation(location);
					List<String>counts = null;
					List<String>denom = null;
					if(idc.isInfectorMode()) 
						counts = instance.getData(CSVscenarioLoader.I_TYPE);
					else
						counts = instance.getData(CSVscenarioLoader.R_TYPE);
					if(idc.isPercentage())
						denom = instance.getData(CSVscenarioLoader.POP_COUNT_KEY);
					
					// Use first row only 
					double dcount = 0.0;
						
					if(idc.isFirstRow())	
						dcount = Double.parseDouble(counts.get(0));
					else if(idc.isLastRow())
						dcount = Double.parseDouble(counts.get(counts.size()-1));
					else
						dcount = Double.parseDouble(counts.get(idc.getSelectecRow()));
					
					double ddenom = 1.0;
					if(idc.isPercentage())
						if(idc.isFirstRow())
							ddenom = (Double.parseDouble(denom.get(0)) / 100.0);
						else if(idc.isLastRow())
							ddenom = (Double.parseDouble(denom.get(counts.size()-1)) / 100.0);
						else
							ddenom = (Double.parseDouble(denom.get(idc.getSelectecRow())) / 100.0);
					
					SIInfector infector = null;
					if(idc.isInfectorMode()) {
						infector = StandardFactory.eINSTANCE.createSIInfector();
						infector.setInfectPercentage(idc.isPercentage());
						infector.setInfectiousCount(dcount/ddenom);
						infector.setURI(STEMURI.createURI(STEMURI.generateUniquePart()+"/infect_"+location));
					}
					else {
						infector = StandardFactory.eINSTANCE.createSIRInoculator();
						((SIRInoculator)infector).setInoculatePercentage(idc.isPercentage());
						((SIRInoculator)infector).setInoculatedPercentage(dcount/ddenom);
						infector.setURI(STEMURI.createURI(STEMURI.generateUniquePart()+"/inoculate_"+location));
					}
					infector.setDiseaseName(idc.getDiseaseName());
					infector.setPopulationIdentifier(idc.getPopulation());
					infector.setTargetISOKey(location);
					iic.getList().add(infector);
				}
				return iic;
			}
		} // getInfector

		@Override
		protected Composite createSpecificComposite(final Composite parent) {
			idc = new InfectorDefinitionComposite(parent, SWT.NONE,
					projectValidator, super.getSelectedProject());
			
			final NewInfectorWizard.NewInfectorPage self = this;
			
			this.projectNamesCombo.addSelectionListener(new SelectionListener() {
				
				public void widgetSelected(SelectionEvent arg0) {
					idc.setProject(self.getSelectedProject());
				}
				
				public void widgetDefaultSelected(SelectionEvent arg0) {
					
				}
			});
			
			return idc;
		} // createSpecificComposite

		@Override
		protected boolean validatePage() {
			boolean retValue = super.validatePage();
			if (retValue) {
				setErrorMessage(null);
				retValue = idc.validate();
				// Error?
				if (!retValue) {
					// Yes
					setErrorMessage(idc.getErrorMessage());
				} // if
			}
			return retValue;
		} // validatePage
	} // NewInfectorPage

	/**
	 * This class is a {@link IHandler} for the command that creates a
	 * {@link NewInfectorWizard}
	 */
	public static class NewInfectorWizardCommandHandler extends AbstractHandler
			implements IHandler {

		/**
		 * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
		 */
		public Object execute(final ExecutionEvent executionEvent)
				throws ExecutionException {
			final IWorkbenchWindow window = HandlerUtil
					.getActiveWorkbenchWindowChecked(executionEvent);
			final NewInfectorWizard wizard = new NewInfectorWizard();
			wizard.init(window.getWorkbench(), StructuredSelection.EMPTY);
			final WizardDialog wizardDialog = new STEMWizardDialog(window
					.getShell(), wizard);
			wizardDialog.open();
			return null;
		} // execute
	} // NewInfectorWizardCommandHandler
} // NewInfectorWizard