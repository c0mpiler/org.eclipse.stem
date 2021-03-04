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

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.stem.model.metamodel.MetamodelFactory;
import org.eclipse.stem.model.metamodel.Package;
import org.eclipse.stem.model.ui.MetamodelEditorPlugin;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class CreatePackagePage extends WizardPage 
{
	private Composite resourceLoaderContainer;
	private Button createNewPackageRadio, loadPackageRadio;
	private Button browseFileSystemButton, browseWorkspaceButton;
	private Button resourceLoadButton;
	private Text resourcePathText;
	
	private Package loadedPackage;
	
	public CreatePackagePage()
	{
		super("New Project Page");
		setTitle("New Project");
		setDescription("Create a new STEM Model Project");
	}
	
	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout(1, true));
		
		
		createNewPackageRadio = new Button(container, SWT.RADIO);
		GridData createNewPackageRadioData = new GridData(GridData.FILL_HORIZONTAL);
		//createNewPackageRadioData.horizontalSpan = 2;
		createNewPackageRadioData.grabExcessHorizontalSpace = true;
		createNewPackageRadio.setLayoutData(createNewPackageRadioData);
		createNewPackageRadio.setText("Create and configure a new STEM Model Package");
		createNewPackageRadio.setSelection(true);
		createNewPackageRadio.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				radioToggled();
			}
			
		});

		
		/*loadPackageRadio = new Button(container, SWT.RADIO);
		loadPackageRadio.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));	
		loadPackageRadio.setText("Load a Module Package definition from a STEM Metamodel file");
		loadPackageRadio.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				radioToggled();
			}
			
		});
		
		resourceLoaderContainer = createResourceLoaderContainer(container);	
		resourceLoaderContainer.setVisible(false);
		*/
		validatePage();
		
		setControl(container);
	}
	
	@SuppressWarnings("unused")
	private Composite createResourceLoaderContainer(Composite parent)
	{
		Composite resourceLoaderContainer = new Composite(parent, SWT.NONE);
		resourceLoaderContainer.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		resourceLoaderContainer.setLayout(new GridLayout(1, false));
		
		Composite resourceButtonContainer = new Composite(resourceLoaderContainer, SWT.NONE);
		resourceButtonContainer.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
		resourceButtonContainer.setLayout(new GridLayout(2, false));
		
		browseFileSystemButton = new Button(resourceButtonContainer, SWT.PUSH);
		browseFileSystemButton.setText("Browse File System");
		browseFileSystemButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
		browseFileSystemButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog selectFileDialog = new FileDialog(getShell(), SWT.OPEN);
				selectFileDialog.setFilterExtensions(new String [] {"*.metamodel"});
				selectFileDialog.open();
				String path = selectFileDialog.getFilterPath();
				String fileName = selectFileDialog.getFileName();
				if (!WizardHelper.isNullOrEmpty(path) && !WizardHelper.isNullOrEmpty(fileName)) {
					resourcePathText.setText(URI.createFileURI(path + File.separator + fileName).toString());
				}
			}
			
		});
		
		browseWorkspaceButton = new Button(resourceButtonContainer, SWT.PUSH);
		browseWorkspaceButton.setText("Browse Workspace");
		browseWorkspaceButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
		browseWorkspaceButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				IFile file = WorkspaceResourceDialog.openNewFile(getShell(), null, null, null, null);
			}
			
		});
		
		Composite resourcePathContainer = new Composite(resourceLoaderContainer, SWT.NONE);
		resourcePathContainer.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
		resourcePathContainer.setLayout(new GridLayout(3, false));
		
		Label fileToLoadLabel = new Label(resourcePathContainer, SWT.NONE);
		fileToLoadLabel.setText("File To Load");
		
		resourcePathText = new Text(resourcePathContainer, SWT.BORDER);
		resourcePathText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		resourceLoadButton = new Button(resourcePathContainer, SWT.PUSH);
		resourceLoadButton.setText("Load");
		resourceLoadButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				String uri = resourcePathText.getText();
				IStatus status = null;
				
				if (!WizardHelper.isNullOrEmpty(uri)) {
					try {
						load(URI.createURI(uri));
						MessageDialog.openInformation(getShell(), "Model loaded", "The selected model is loaded");
					} catch (Exception exp) {
						status = new Status(IStatus.ERROR, MetamodelEditorPlugin.PLUGIN_ID, 0,
					            "An error occurred while loading the model definition file", exp);
					}
				} else {
					status = new Status(IStatus.ERROR, MetamodelEditorPlugin.PLUGIN_ID, 0,
							"You must specify file to load", null);
				}
				
				if (status != null) {
					ErrorDialog.openError(getShell(),  "Load Error", "Error loading the Model Package definition", status);
				}
			}
			
		});
	
		return resourceLoaderContainer;
	}

	protected void load(URI uri) throws Exception
	{
		loadedPackage = WizardHelper.loadPackageFromUri(uri);
		validatePage();
	}
	
	protected void radioToggled()
	{
		if (loadPackageRadio.getSelection()) {
			resourceLoaderContainer.setVisible(true);
		} else {
			resourceLoaderContainer.setVisible(false);
		}
		validatePage();
	}
	
	protected Package getPackage()
	{
		if (createNewPackageRadio.getSelection()) {
			return MetamodelFactory.eINSTANCE.createPackage();
		} else {
			return loadedPackage;
		}
	}
	
	protected void validatePage()
	{
		Package selectedPackage = getPackage();
		
		if (selectedPackage != null) {
			setPageComplete(true);
			if (getWizard() instanceof ModelGeneratorWizard) {
				((ModelGeneratorWizard)getWizard()).setPackage(selectedPackage);
			}
		} else {
			setPageComplete(false);
		}
	}
}
