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

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.stem.model.metamodel.Package;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class GeneratorOptionsPage extends WizardPage
{
	@SuppressWarnings("unused")
	private Package modelPackage;
	
	public GeneratorOptionsPage(Package pkg) {
		super("Generator Options");
		setTitle("Generator Options");
		setDescription("Set advanced options for the model code generator");
		
		this.modelPackage = pkg;
	}
	
	public void setPackage(Package pkg)
	{
		this.modelPackage = pkg;
	}

	@Override
	public void createControl(Composite parent) {		
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout(2, false));

		Label noneLabel = new Label(container, SWT.NONE);
		noneLabel.setText("No advanced generator settings implemented yet.");
		
		setControl(container);
	}
	
}