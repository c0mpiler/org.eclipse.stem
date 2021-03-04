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
import java.util.List;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.stem.model.metamodel.CompartmentGroup;
import org.eclipse.stem.model.metamodel.MetamodelFactory;
import org.eclipse.stem.model.metamodel.Model;
import org.eclipse.stem.model.metamodel.ModelType;
import org.eclipse.stem.model.ui.Constants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * Properites Page for the Model Editor Wizard
 *
 */
public class ModelPropertiesPage extends WizardPage 
{
	private Text modelNameText;
	private Combo modelTypeCombo;
	private ComboViewer modelParentViewer;
	
	private Composite container;
	private Button loadModelsButton;
	
	private Model model;
	private Package metamodel;
	private boolean forceUniqueName = false;
	
	public ModelPropertiesPage(Model model, Package metamodel, boolean forceUniqueName) 
	{
		super("Model Properties");
		setTitle("Model Properties");
		setDescription("Configure a computational model");

		this.model = model;
		this.metamodel = metamodel;
		this.forceUniqueName = forceUniqueName;
	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		
		
		Label modelNameLabel = new Label(container, SWT.NULL);
		modelNameLabel.setText("Model Name");

		modelNameText = new Text(container, SWT.BORDER | SWT.SINGLE);
		modelNameText.setText(WizardHelper.safeGet(model.getName()));
		
		GridData modelNameTextData = new GridData(GridData.FILL_HORIZONTAL);
		modelNameTextData.horizontalSpan = 2;
		modelNameText.setLayoutData(modelNameTextData);
		modelNameText.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				formatTextFields();
				validatePage();
			}
			
			@Override
			public void focusGained(FocusEvent e) {}
		});
		
		modelNameText.addKeyListener(new KeyAdapter() {

			@Override
			public void keyReleased(KeyEvent e) {
				validatePage();
			}

		});
		
		String[] modelTypes = WizardHelper.getModelTypes();

		
		Label modelTypeLabel = new Label(container, SWT.NONE);
		modelTypeLabel.setText("Model Type");
		
		modelTypeCombo = new Combo(container, SWT.READ_ONLY);
		
		GridData modelTypeComboData = new GridData();
		modelTypeComboData.horizontalSpan = 2;
		modelTypeCombo.setLayoutData(modelTypeComboData);
		modelTypeCombo.setItems(modelTypes);
		modelTypeCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				doSelectModelType();
				validatePage();
			}
		});
		
		
		Label modelParentLabel = new Label(container, SWT.NONE);
		modelParentLabel.setText("Parent Model");
		
		modelParentViewer = new ComboViewer(container,  SWT.READ_ONLY);
		modelParentViewer.setContentProvider(new ModelParentContentProvider());
		modelParentViewer.setLabelProvider(new ModelParentLabelProvider());
		modelParentViewer.setComparator(new ViewerComparator() {

			@Override
			public int compare(Viewer viewer, Object e1, Object e2) {
				if (e1 instanceof EClass && e2 instanceof EClass) {
					return ((EClass)e1).getName().compareTo(((EClass)e2).getName());
				}
				return super.compare(viewer, e1, e2);
			}

		});
		modelParentViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				validatePage();
			}
		});
		
		loadModelsButton = new Button(container, SWT.PUSH);
		loadModelsButton.setEnabled(true);
		loadModelsButton.setText("Reload Model List");
		loadModelsButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				
				
				WizardHelper.loadMetamodels(true, getContainer());
				//WizardHelper.displayEcoreProjectSelectorDialog(getShell(), getContainer());
				modelParentViewer.refresh();
				//modelParentViewer.setInput(WizardHelper.getModelsForModelType(model.getModelType(), true, null));
			}
			
		});
		
		modelTypeCombo.select(0);
		for (int idx = 0; idx<modelTypes.length; idx++) {
			if (modelTypes[idx].equals(model.getModelType().getLiteral())) {
				modelTypeCombo.select(idx);
				break;
			}
		}
		
		doSelectModelType();
		doSelectParentModel();
		
		
		
		setControl(container);
		validatePage();
	}
	
	private void doSelectParentModel()
	{
		if (model.getParentModel() != null) {
			
			String[] items = modelParentViewer.getCombo().getItems();
			for (int idx=0; idx<items.length; idx++) {
				if (items[idx].equals(model.getParentModel().getName())) {
					Object selected = modelParentViewer.getElementAt(idx);
					if (selected != null) {
						modelParentViewer.setSelection(new StructuredSelection(selected));
						break;
					}
				}
			}	
		}
	}

	private class ModelParentContentProvider implements IStructuredContentProvider
	{

		@Override
		public void dispose() { }

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) { }

		@Override
		public Object[] getElements(Object inputElement) 
		{
			List<Model> data = WizardHelper.getModelsForModelType((ModelType)inputElement, false, new NullProgressMonitor());
			if (data != null) {
				return data.toArray();
			}
			return new Object[0];
		}
		
	}
	
	private class ModelParentLabelProvider extends LabelProvider
	{
		@Override
		public String getText(Object element) {
			if (element instanceof Model) {
				return ((Model) element).getName();
			}
			
			return Constants.EMPTY_STRING;
		}
	}
	
	
	private void doSelectModelType()
	{
		ModelType selectedType = getModelType();
		modelParentViewer.setInput(selectedType);
	}
	

	
	public String getModelName()
	{
		return modelNameText.getText();
	}
	
	public ModelType getModelType()
	{
		return ModelType.get(modelTypeCombo.getItem(modelTypeCombo.getSelectionIndex()));
	}
	
	public Model getParentModel()
	{
		StructuredSelection selection = (StructuredSelection)modelParentViewer.getSelection();
		
		if (selection.getFirstElement() instanceof Model) {
			Model selectedModel = (Model)selection.getFirstElement();
			if (model.getParentModel() != null && model.getParentModel().getName() != null && model.getParentModel().getName().equals(selectedModel.getName())) {
				return model.getParentModel();
			}
			return selectedModel;
		}

		return null;
	}
	
	private void loadModelPackages()
	{
		WizardHelper.loadMetamodels(false, getContainer());
		//WizardHelper.loadModelsForModelType(getModelType(), true, getContainer());
	}

	boolean validatePage()
	{
		String errorMessage = null;
		boolean valid = true;
		
		if (valid && WizardHelper.isNullOrEmpty(getModelName())) {
			errorMessage = "Please enter a name for this model";
			valid = false;
		}
		
		if (valid && forceUniqueName) {
			for (Model m : metamodel.getModels()) {
				if (m.getName().equals(getModelName())) {
					errorMessage = "A model with this name already exists in the metamodel";
					valid = false;
				}
			}
		}
		
		if (valid && !WizardHelper.isValidJavaName(
				WizardHelper.formatToUpperCaseWordsNoSpaces(getModelName()))) {
			errorMessage = "The model name is invalid.  Please check that it contains only alphanumeric characters and the first letter is non-numeric.";
			valid = false;
		}
		
		if (valid && getParentModel() == null) {
			errorMessage = "Please select a parent model for this model";
			valid = false;
		}
		
		if (valid) {
			model.setModelType(getModelType());
			model.setName(getModelName());

			if (model.getCompartments() == null) {
				CompartmentGroup cg = MetamodelFactory.eINSTANCE.createCompartmentGroup();
				model.setCompartments(cg);
				//model.getContainerPackage().getCompartmentGroups().add(cg);
			}
			model.getCompartments().setName(getModelName());
			
			Model parentModel = getParentModel();
			if (parentModel != null && parentModel != model.getParentModel()) {
				model.setParentModel(parentModel);
				model.getCompartments().setParentGroup(parentModel.getCompartments());
			}
		}

		setPageComplete(valid);
		setErrorMessage(errorMessage);
		
		return valid;
	}

	void formatTextFields()
	{
		modelNameText.setText(WizardHelper.formatToUpperCaseWordsNoSpaces(modelNameText.getText()));
	}

	public void setVisible(boolean visible) 
	{
		super.setVisible(visible);
		if (visible) {
			loadModelPackages();
			doSelectParentModel();
		} else {
			formatTextFields();
		}
	}

}
