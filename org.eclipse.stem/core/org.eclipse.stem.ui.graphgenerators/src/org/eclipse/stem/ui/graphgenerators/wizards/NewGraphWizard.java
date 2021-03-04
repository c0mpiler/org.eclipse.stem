// NewGraphWizard.java
package org.eclipse.stem.ui.graphgenerators.wizards;

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

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.common.DublinCore;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.GraphPackage;
import org.eclipse.stem.graphgenerators.GraphGenerator;
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
 * This class is a {@link NewIdentifiableWizard} for that creates new STEM
 * {@link Graph}s.
 */
public class NewGraphWizard extends NewIdentifiableWizard {

	private NewGraphPage ngp = null;

	
	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#getWizardTitle()
	 */
	@Override
	protected String getWizardTitle() {
		return Messages.getString("NGraphWiz.wizard_title"); //$NON-NLS-1$
	} // getWizardTitle

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#createNewIdentifiablePage()
	 */
	
	@Override
	protected NewIdentifiablePage createNewIdentifiablePage() {
		ngp = new NewGraphPage(Messages
				.getString("NGraphWiz.page_title"), this); //$NON-NLS-1$
		ngp.setTitle(Messages.getString("NGraphWiz.page_title")); //$NON-NLS-1$
		ngp.setDescription(Messages
				.getString("NGraphWiz.page_description")); //$NON-NLS-1$

		this.setHelpContextId("org.eclipse.stem.doc.newgraph_contextid");
		return ngp;

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
				format.setText(GraphPackage.eNS_URI);
				format.setEnabled(false);
				type.setText(STEMURI.GRAPH_TYPE_URI.toString());
				type.setEnabled(false);
				
				Calendar c = Calendar.getInstance();
		        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd"); 
		        String dateStr = dateFormatter.format(c.getTime());
		
				titleTextField.setText(Messages.getString("NGGWiz.DC_TITLE"));
				titleTextField.setEnabled(true);
				
				descriptionTextField.setText(Messages.getString("NGGWiz.DC_DESCRIPTION"));
				descriptionTextField.setEnabled(true);
				
				// TODO the SOURCE should really return the specific generator CLASS e.g., Square for Square
				source.setText(Messages.getString("NGGWiz.DC_SOURCE"));
				source.setEnabled(true);
				date.setText(dateStr);
				date.setEnabled(true);


				// JHK get the preset Dublin Core fields from the plugin.xml
				final GraphGenerator graphGenerator = ngp.getSelectedGraphGenerator();
				DublinCore plugginDublinCore = graphGenerator.getDublinCore();
				this.updateDublinCorePage(plugginDublinCore);
				
				
			}
		};
	} // createDublinCorePage

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#createIdentifiable()
	 */
	@Override
	protected Identifiable createIdentifiable() {
		final Graph retValue = ngp.getGraph();
		retValue.setDublinCore(newDublinCorePage.createDublinCore());
		
		return retValue;
	} // createIdentifiable

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#getSerializationFolderName()
	 */
	@Override
	protected String getSerializationFolderName() {
		return NewSTEMProjectWizard.GRAPHS_FOLDER_NAME;
	}

	/**
	 * @see org.eclipse.stem.ui.wizards.NewIdentifiableWizard#getSerializationFileNameExtension()
	 */
	@Override
	protected String getSerializationFileNameExtension() {
		return GraphPackage.eNAME;
	} // getSerializationFileNameExtension

	/**
	 * This class is a {@link NewIdentifiablePage} that contains the interface
	 * components needed to define a new {@link Graph}.
	 */
	protected static class NewGraphPage extends NewIdentifiablePage {

		GraphGeneratorDefinitionControl ggdc = null;
		NewGraphWizard parentWizard = null;

		/**
		 * @param pageName
		 * @param ngw the NewGraphWizard
		 */
		protected NewGraphPage(final String pageName, NewGraphWizard ngw) {
			super(pageName);
			parentWizard = ngw;
		}
		
		GraphGenerator getSelectedGraphGenerator() {
			return ggdc.getSelectedGraphGenerator();
		} // getSelectedDiseaseModel

		@Override
		protected Composite createSpecificComposite(final Composite parent) {
			ggdc = new GraphGeneratorDefinitionControl(parent, SWT.NONE,
					projectValidator, this.getSelectedProject(), parentWizard);
			return ggdc;
		} // createSpecificComposite

		@Override
		protected boolean validatePage() {
			boolean retValue = super.validatePage();
			if (retValue) {
				setErrorMessage(null);
				retValue = ggdc.validate();
				// Error?
				if (!retValue) {
					// Yes
					setErrorMessage(ggdc.getErrorMessage());
				} // if
			}
			return retValue;
		} // validatePage

		Graph getGraph() {					
			return ggdc.getGraph(parentWizard.getSerializationFileName());			
		} // getSelectedDiseaseModel

	} // NewGraphPage

	
	
	/**
	 * This class is a {@link IHandler} for the command that creates a
	 * {@link NewGraphWizard}
	 */
	public static class NewGraphWizardCommandHandler extends AbstractHandler
			implements IHandler {

		/**
		 * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
		 */
		public Object execute(final ExecutionEvent executionEvent)
				throws ExecutionException {
			final IWorkbenchWindow window = HandlerUtil
					.getActiveWorkbenchWindowChecked(executionEvent);
			final NewGraphWizard wizard = new NewGraphWizard();
			wizard.init(window.getWorkbench(), StructuredSelection.EMPTY);
			final WizardDialog wizardDialog = new STEMWizardDialog(window
					.getShell(), wizard);
			wizardDialog.open();
			return null;
		} // execute
	} // NewGraphWizardCommandHandler

} // NewGraphWizard