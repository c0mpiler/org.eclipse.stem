// DiseaseDefinitionControl.java
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

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.stem.core.Utility;
import org.eclipse.stem.core.common.DublinCore;
import org.eclipse.stem.diseasemodels.Constants;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.ui.Activator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.PlatformUI;

/**
 * This class represents the SWT control for defining a disease.
 */
public class DiseaseDefinitionControl extends Composite {

	private DiseaseModel[] diseaseModels = null;

	private final Combo combo;

	private final DiseaseModelPropertyComposite diseaseModelPropertyComposite;
	
	/**
	 * the DiseaseDefinitionControl combo must be able to update the NewDiseaseWizard
	 */
	private NewDiseaseWizard newDiseaseWizard = null;

	/**
	 * Create the composite
	 * 
	 * @param parent
	 * @param style
	 * @param projectValidator
	 * @param ndw a NewDiseaseWizard
	 */
	public DiseaseDefinitionControl(final Composite parent, final int style,
			final ModifyListener projectValidator, IProject project, NewDiseaseWizard ndw) {
		super(parent, style);
		newDiseaseWizard = ndw;
		final GridLayout gridLayout = new GridLayout();
		gridLayout.marginWidth = 0;
		gridLayout.numColumns = 2;
		setLayout(gridLayout);

		final Label diseaseModelLabel = new Label(this, SWT.NONE);
		final GridData gd_diseaseModelLabel = new GridData(SWT.FILL, SWT.CENTER, true, false);
		gd_diseaseModelLabel.widthHint = 100;
		diseaseModelLabel.setLayoutData(gd_diseaseModelLabel);
		diseaseModelLabel.setText(DiseaseWizardMessages.getString("DDC.0")); //$NON-NLS-1$

		combo = new Combo(this, SWT.READ_ONLY);
		combo.setTextLimit(30);
		final GridData gd_combo = new GridData(SWT.FILL, SWT.CENTER, true,
				false);
		gd_combo.widthHint = 303;
		combo.setLayoutData(gd_combo);

		combo.setToolTipText(DiseaseWizardMessages.getString("DDC.1")); //$NON-NLS-1$
		// Initialize the list of disease models available
		combo.setItems(getDiseaseModelNames(getDiseaseModels()));
		combo.select(0);
		combo.addModifyListener(projectValidator);

		
		diseaseModelPropertyComposite = new DiseaseModelPropertyComposite(this,
				SWT.NONE, getDiseaseModels(), projectValidator, project);
		final GridData gd_diseaseModelPropertyControl = new GridData(SWT.FILL,
				SWT.CENTER, true, false, 2, 1);
		diseaseModelPropertyComposite
				.setLayoutData(gd_diseaseModelPropertyControl);

		final NewDiseaseWizard wizard = ndw;
		combo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				diseaseModelPropertyComposite
						.displayDiseaseModel(getDiseaseModels()[combo
								.getSelectionIndex()]);
				
				projectValidator.modifyText(null);
				// update the dublin core from the plugin defaults for the
				// newly selected disease model;
				newDiseaseWizard.newDublinCorePage.updateDublinCorePage(getSelectedDiseaseModel().getDublinCore());
				
				// layout();
			} // widgetSelected

		});
		//final DiseaseDefinitionControl self = this;
		
		PlatformUI.getWorkbench().getHelpSystem().setHelp(parent, "org.eclipse.stem.doc.newdisease_contextid");
	}// DiseaseDefinitionControl

	
	
	/**
	 * @return an array of the {@link DiseaseModels}s defined in the system.
	 */
	private DiseaseModel[] getDiseaseModels() {
		if (diseaseModels == null) {
			final IExtensionRegistry registry = Platform.getExtensionRegistry();
			final IConfigurationElement[] diseaseModelConfigElements = registry
					.getConfigurationElementsFor(org.eclipse.stem.diseasemodels.Constants.ID_DISEASE_MODEL_EXTENSION_POINT);

			final List<DiseaseModel> temp = new ArrayList<DiseaseModel>();
			final List<DublinCore> dctemp = new ArrayList<DublinCore>();
			
			diseaseModels = new DiseaseModel[diseaseModelConfigElements.length];

			for (int i = 0; i < diseaseModelConfigElements.length; i++) {
				final IConfigurationElement element = diseaseModelConfigElements[i];
				DiseaseModel diseaseModel = null;
				// Does the element specify the class of the disease model?
				if (element.getName().equals(Constants.DISEASE_MODEL_ELEMENT)) {
					// Yes
					try {
						diseaseModel = (DiseaseModel) element.createExecutableExtension("class");
						temp.add(diseaseModel); //$NON-NLS-1$
					} catch (final CoreException e) {
						Activator.logError(
								DiseaseWizardMessages.getString("DDC.3"), e); //$NON-NLS-1$
					}
				} else if(element.getName().equals(org.eclipse.stem.core.Constants.DUBLIN_CORE_ELEMENT)) 
					dctemp.add(Utility.getPluginDublinCore(element));
			} // for each configuration element
			diseaseModels = temp.toArray(new DiseaseModel[] {});
			for(int n=0;n<diseaseModels.length;++n)
				diseaseModels[n].setDublinCore(dctemp.get(n));

		} // if disesaeModels not created
		
		return diseaseModels;
	} // getDiseaseModels

	/**
	 * @return the names of the disease models
	 */
	private String[] getDiseaseModelNames(final DiseaseModel[] diseaseModels) {
		final String[] retValue = new String[diseaseModels.length];
		for (int i = 0; i < diseaseModels.length; i++) {
			String name = diseaseModels[i].getDublinCore().getTitle();
			// Was a name specified?
			if ((name == null) || name.equals("")) { //$NON-NLS-1$
				// No
				name = diseaseModels[i].getClass().getSimpleName();
			} // if

			retValue[i] = name;
		} // for i
		return retValue;
	} // getDiseaseModelNames

	/**
	 * 
	 * @return
	 */
	DiseaseModel getSelectedDiseaseModel() {
		final DiseaseModel retValue = EcoreUtil.copy(getDiseaseModels()[combo.getSelectionIndex()]);
		diseaseModelPropertyComposite.populateDiseaseModel(retValue);
		return retValue;
	} // getSelectedDiseaseModel

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents sub-classing of SWT components
	}

	/**
	 * @return <code>true</code> if the contents of the control are valid,
	 *         <code>false</code> otherwise.
	 */
	public boolean validate() {
		return diseaseModelPropertyComposite.validate();
	} // validate

	/**
	 * @return the error message set by {@link #validate()}
	 */
	public String getErrorMessage() {
		return diseaseModelPropertyComposite.getErrorMessage();
	}

} // DiseaseDefinitionControl
