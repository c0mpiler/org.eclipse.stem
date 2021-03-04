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

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class STEMWizardDialog extends WizardDialog {

	private Button helpButton;

	public STEMWizardDialog(final Shell parentShell, final IWizard newWizard) {
		super(parentShell, newWizard);
	}

	@Override
	protected void buttonPressed(final int buttonId) {
		super.buttonPressed(buttonId);
		if (IDialogConstants.HELP_ID == buttonId) {
			if (this.getWizard() instanceof NewIdentifiableWizard) {
				PlatformUI.getWorkbench().getHelpSystem().displayHelp(
						((NewIdentifiableWizard) this.getWizard())
								.getHelpContextId());
			} else {
				PlatformUI.getWorkbench().getHelpSystem().displayHelp(
						((NewNonIdentifiableWizard) this.getWizard())
								.getHelpContextId());
			}
		}
	}

	@Override
	protected void createButtonsForButtonBar(final Composite parent) {
		super.createButtonsForButtonBar(parent);
		helpButton = super.getButton(IDialogConstants.HELP_ID);
		final ImageDescriptor helpIcon = AbstractUIPlugin
				.imageDescriptorFromPlugin("org.eclipse.stem.ui",
						"icons/full/customobj16/HelpIcon.gif");
		final Image image = helpIcon.createImage();
		final ImageDescriptor helpIconMacOS = AbstractUIPlugin.imageDescriptorFromPlugin("org.eclipse.stem.ui", "icons/full/customobj16/HelpIconMacOS.gif");
		helpButton.setText("");
		if(System.getProperties().getProperty("os.name").contains("Mac")){
			final Image imageMacOS = helpIconMacOS.createImage();
			helpButton.setImage(imageMacOS);
		}
		else{
			helpButton.setImage(image);
		}
		final GridData helpButtonLayout = new GridData();
		helpButtonLayout.verticalAlignment = GridData.FILL;
		helpButton.setLayoutData(helpButtonLayout);
	}
}