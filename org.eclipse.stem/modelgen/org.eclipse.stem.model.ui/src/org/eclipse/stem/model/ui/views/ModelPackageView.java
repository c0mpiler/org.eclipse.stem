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
package org.eclipse.stem.model.ui.views;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.stem.model.metamodel.MetamodelFactory;
import org.eclipse.stem.model.metamodel.Model;
import org.eclipse.stem.model.metamodel.Package;
import org.eclipse.stem.model.transform.MetamodelResourceFactory;
import org.eclipse.stem.model.ui.wizards.ModelGeneratorWizard;
import org.eclipse.stem.model.ui.wizards.NewModelWizard;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class ModelPackageView extends ViewPart
{
	Package basePackage;
	
	private void loadModel()
	{
		URI modelUri = URI.createURI("platform:/plugin/org.eclipse.stem.model.transform/data/polioopvipv.metamodel");
	
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap(true));
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("genmodel", new MetamodelResourceFactory());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new MetamodelResourceFactory());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("metamodel", new MetamodelResourceFactory());
		
		
		
		Resource modelResource = resourceSet.getResource(modelUri, true);
		basePackage =  (Package)modelResource.getContents().get(0);
		
		EcoreUtil.resolveAll(basePackage);
	}
	
	TreeViewer viewer;
	Button addModelButton, editModelButton, removeModelButton, generateButton;
	
	@Override
	public void createPartControl(Composite parent) 
	{
		loadModel();
		
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout(3, false));

		viewer = new TreeViewer(container, SWT.VIRTUAL | SWT.BORDER);
		
		GridData viewGridData = new GridData(GridData.FILL_BOTH);
		viewGridData.horizontalSpan = 3;
		viewer.getTree().setLayoutData(viewGridData);
		
		viewer.setUseHashlookup(true);
		
		viewer.setContentProvider(new ITreeContentProvider() {

			@Override
			public void dispose() {
			}

			@Override
			public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			}

			@Override
			public Object[] getElements(Object inputElement) {
				return getChildren(inputElement);
//				return new Object[] {inputElement};
			}

			@Override
			public Object[] getChildren(Object parentElement) {
				if (parentElement instanceof Package) {
					return ((Package) parentElement).getModels().toArray();
				}
				if (parentElement instanceof Model) {
					return ((Model) parentElement).getCompartments().getCompartments().toArray();
				}
				return new Object[0];
			}

			@Override
			public Object getParent(Object element) {
				return new Object[0];
			}

			@Override
			public boolean hasChildren(Object element) {
				if (element instanceof Package || element instanceof Model) {
					return true;
				}
				return false;
			}
			
		});
		
		viewer.setLabelProvider(new LabelProvider());
		viewer.setInput(basePackage);
		
		addModelButton = new Button(container, SWT.PUSH);
		addModelButton.setText("Add Model");
		addModelButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				
				NewModelWizard wizard = new NewModelWizard(MetamodelFactory.eINSTANCE.createModel(),basePackage);
				WizardDialog wizardDialog = new WizardDialog(getSite().getShell(),wizard);
					if (wizardDialog.open() == Window.OK) {
						basePackage.getModels().add(wizard.getModel());
						viewer.refresh();
					}
			}
			
		});
		
		editModelButton = new Button(container, SWT.PUSH);
		editModelButton.setText("Edit Model");
		editModelButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				super.widgetSelected(e);
			}
			
		});
		
		removeModelButton = new Button(container, SWT.PUSH);
		removeModelButton.setText("Remove Model");
		removeModelButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				super.widgetSelected(e);
			}
			
		});
		
		
		generateButton = new Button(container, SWT.PUSH);
		generateButton.setText("Generate");
		generateButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				ModelGeneratorWizard wizard = new ModelGeneratorWizard(basePackage);
				WizardDialog wizardDialog = new WizardDialog(getSite().getShell(),wizard);
					if (wizardDialog.open() == Window.OK) {

					} else {

					   }
				
				
			}
			
		});
	}

	@Override
	public void setFocus() 
	{

	}

}
