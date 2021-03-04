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
package org.eclipse.stem.model.ui.wizards;

import org.eclipse.stem.model.metamodel.Package;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.stem.model.metamodel.Model;

public class NewModelWizard extends Wizard 
{

	protected ModelPropertiesPage propertiesPage;
	protected ModelParametersPage parametersPage;
	protected ModelCompartmentsPage compartmentsPage;
	protected ModelTransitionsPage transitionsPage;
	protected boolean showTransitionsPage = true;
	protected boolean forceUniqueName = true;
	
	protected Model newModel;
	protected Package metamodel;
	
	public NewModelWizard(Model model, Package metamodel) {
		this(model,metamodel,false,false);
	}
	
	public NewModelWizard(Model model, Package metamodel, boolean showTransitionsPage, boolean forceUniqueName) {
		super();
		setNeedsProgressMonitor(true);
		this.newModel = model;
		this.metamodel = metamodel;
		this.showTransitionsPage = showTransitionsPage;
		this.forceUniqueName = forceUniqueName;
	}
	
	
	public Model getModel()
	{
		return newModel;
	}

	@Override
	public void addPages() 
	{
		propertiesPage = new ModelPropertiesPage(newModel,metamodel,forceUniqueName);
		parametersPage = new ModelParametersPage(newModel);
		compartmentsPage = new ModelCompartmentsPage(newModel);

		addPage(propertiesPage);
		addPage(parametersPage);
		addPage(compartmentsPage);
		if (showTransitionsPage) {
			transitionsPage = new ModelTransitionsPage(newModel);
			addPage(transitionsPage);
		}
	}


	@Override
	public boolean performFinish() 
	{
		
		if (transitionsPage != null && !transitionsPage.validatePage()) {
			return false;
		}
		
		propertiesPage.formatTextFields();

		boolean valid = true;
		String errorMessage = null;
		if (valid && !propertiesPage.validatePage()) {
			// invalid Java name
			errorMessage = propertiesPage.getErrorMessage();
			valid = false;
		}

		
		if (valid && !compartmentsPage.validatePage()) {
			// no parent compartment
			errorMessage = compartmentsPage.getErrorMessage();
			valid = false;
		}
		
		if (!valid) {
			MessageDialog.openError(getShell(), "Error", "Error saving the model: "+ errorMessage);
			return false;
		} else {
			return true;
		}
	}
}
