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
package org.eclipse.stem.model.ui.editor.controls;

import java.util.List;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.stem.model.metamodel.Model;
import org.eclipse.stem.model.metamodel.ModelType;
import org.eclipse.stem.model.ui.Constants;
import org.eclipse.stem.model.ui.editor.ModelDiagramEditor;
import org.eclipse.stem.model.ui.editor.vismodel.ModelElement;
import org.eclipse.stem.model.ui.wizards.WizardHelper;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;

public class ModelPropertiesComposite extends Composite implements ISelectionListener
{
	ModelDiagramEditor editor;
	

	
	//private Text modelNameText;
	//private Combo modelTypeCombo;
	private Label modelNameTextLabel, modelTypeTextLabel;
	private ComboViewer modelParentViewer;

	private Button loadModelsButton;
	
	private ModelElement selectedModelElement;
	private Model selectedModel;
	
	public ModelPropertiesComposite(ModelDiagramEditor editor, Composite parent, int style) {
		super(parent, style);
		this.editor = editor;
		
		setLayout(new GridLayout(3, false));
		init();
		
		editor.addModelSelectionListener(this);
	}
	
	@Override public void dispose()
	{
		editor.removeModelSelectionListener(this);
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (selection instanceof StructuredSelection) {
			setModel((ModelElement)((StructuredSelection)selection).getFirstElement());
		}
	}
	
	public void setModel(ModelElement me) {
		if (selectedModelElement == me) {
			return;
		}
		
		selectedModelElement = me;
		if (selectedModelElement != null) {
			setModel(selectedModelElement.getModel());
		} else {
			setModel((Model)null);
		}
	}
	
	private void setModel(Model model) {
		this.selectedModel = model;
		setFields();
		
	}

	protected void init() {
		Label modelNameLabel = new Label(this, SWT.NULL);
		modelNameLabel.setText("Model Name");

		modelNameTextLabel = new Label(this, SWT.NONE);
		modelNameTextLabel.setText("");
		
		GridData modelNameTextData = new GridData();
		modelNameTextData.horizontalSpan = 2;
		modelNameTextLabel.setLayoutData(modelNameTextData);
		
		GridData modelNameLabelData = new GridData();
		modelNameLabelData.horizontalSpan = 2;
		modelNameTextLabel.setLayoutData(modelNameLabelData);
		
//		modelNameText.addFocusListener(new FocusListener() {
//			
//			@Override
//			public void focusLost(FocusEvent e) {
//				formatTextFields();
//				validatePage();
//			}
//			
//			@Override
//			public void focusGained(FocusEvent e) {}
//		});
//		modelNameText.addKeyListener(new KeyAdapter() {
//
//			@Override
//			public void keyReleased(KeyEvent e) {
//				validatePage();
//			}
//
//		});
		
		
		Label modelTypeLabel = new Label(this, SWT.NONE);
		modelTypeLabel.setText("Model Type");
		
		modelTypeTextLabel = new Label(this, SWT.NONE);
		modelTypeTextLabel.setText("");
		
		GridData modelTypeComboData = new GridData();
		modelTypeComboData.horizontalSpan = 2;
		modelTypeTextLabel.setLayoutData(modelTypeComboData);
		
//		String[] modelTypes = WizardHelper.getModelTypes();
//		modelTypeCombo = new Combo(this, SWT.READ_ONLY);
//		
//		GridData modelTypeComboData = new GridData();
//		modelTypeComboData.horizontalSpan = 2;
//		modelTypeCombo.setLayoutData(modelTypeComboData);
//		modelTypeCombo.setItems(modelTypes);
//		modelTypeCombo.addSelectionListener(new SelectionAdapter() {
//			@Override
//			public void widgetSelected(SelectionEvent e) {
//				doSelectModelType();
//				validatePage();
//			}
//		});
		
		
		Label modelParentLabel = new Label(this, SWT.NONE);
		modelParentLabel.setText("Parent Model");
		
		modelParentViewer = new ComboViewer(this,  SWT.READ_ONLY);
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
//				validatePage();
			}
		});
		
		loadModelsButton = new Button(this, SWT.PUSH);
		loadModelsButton.setEnabled(true);
		loadModelsButton.setText("Reload Model List");
		loadModelsButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				loadModelPackages();
				modelParentViewer.refresh();
			}
			
		});
		
//		modelTypeCombo.select(0);
//		for (int idx = 0; idx<modelTypes.length; idx++) {
//			if (modelTypes[idx].equals(model.getModelType().getLiteral())) {
//				modelTypeCombo.select(idx);
//				break;
//			}
//		}	
//		doSelectModelType();
		doSelectParentModel();
	}
	
	private void setFields()
	{
		if (selectedModel != null) {
			modelNameTextLabel.setText(selectedModel.getName());
			modelTypeTextLabel.setText(selectedModel.getModelType().getLiteral());
			modelParentViewer.setInput(selectedModel.getModelType());
			modelParentViewer.refresh();
			loadModelsButton.setEnabled(true);
			doSelectParentModel();
		} else {
			modelNameTextLabel.setText("");
			modelTypeTextLabel.setText("");
			modelParentViewer.setInput(null);
			loadModelsButton.setEnabled(false);
			modelParentViewer.refresh();
		}

	}
	
	private void doSelectParentModel()
	{
		if (selectedModel != null && selectedModel.getParentModel() != null) {
			
			String[] items = modelParentViewer.getCombo().getItems();
			for (int idx=0; idx<items.length; idx++) {
				if (items[idx].equals(selectedModel.getParentModel().getName())) {
					Object selected = modelParentViewer.getElementAt(idx);
					if (selected != null) {
						modelParentViewer.setSelection(new StructuredSelection(selected));
						break;
					}
				}
			}	
		}
	}


	
	
//	private void doSelectModelType()
//	{
//		ModelType selectedType = getModelType();
//		modelParentViewer.setInput(selectedType);
//	}
	
	public Model getParentModel()
	{
		StructuredSelection selection = (StructuredSelection)modelParentViewer.getSelection();
		
		if (selection.getFirstElement() instanceof Model) {
			Model selectedModel = (Model)selection.getFirstElement();
			if (selectedModel.getParentModel() != null && 
					selectedModel.getParentModel().getName() != null && 
					selectedModel.getParentModel().getName().equals(selectedModel.getName())) {
				return selectedModel.getParentModel();
			}
			return selectedModel;
		}

		return null;
	}
	
	private void loadModelPackages()
	{
		WizardHelper.loadMetamodels(true, new ProgressMonitorDialog(getShell()));
		//WizardHelper.loadModelsForModelType(getModelType(), true, getContainer());
	}

//	boolean validatePage()
//	{
//		String errorMessage = null;
//		boolean valid = true;
//		
//		if (valid && WizardHelper.isNullOrEmpty(getModelName())) {
//			errorMessage = "Please enter a name for this model";
//			valid = false;
//		}
//		
//		if (valid && !WizardHelper.isValidJavaName(
//				WizardHelper.formatToUpperCaseWordsNoSpaces(getModelName()))) {
//			errorMessage = "The model name is invalid.  Please check that it contains only alphanumeric characters and the first letter is non-numeric.";
//			valid = false;
//		}
//		
//		if (valid && getParentModel() == null) {
//			errorMessage = "Please select a parent model for this model";
//			valid = false;
//		}
//		
//		if (valid) {
//			model.setModelType(getModelType());
//			model.setName(getModelName());
//
//			if (model.getCompartments() == null) {
//				CompartmentGroup cg = MetamodelFactory.eINSTANCE.createCompartmentGroup();
//				model.setCompartments(cg);
//				//model.getContainerPackage().getCompartmentGroups().add(cg);
//			}
//			model.getCompartments().setName(getModelName());
//			
//			Model parentModel = getParentModel();
//			if (parentModel != null && parentModel != model.getParentModel()) {
//				model.setParentModel(parentModel);
//				model.getCompartments().setParentGroup(parentModel.getCompartments());
//			}
//		}
//
//		return valid;
//	}

//	void formatTextFields()
//	{
//		modelNameText.setText(WizardHelper.formatToUpperCaseWordsNoSpaces(modelNameText.getText()));
//	}

//	public void setVisible(boolean visible) 
//	{
//		super.setVisible(visible);
//		if (visible) {
//			loadModelPackages();
//			doSelectParentModel();
//		} else {
//			formatTextFields();
//		}
//	}
	
	private class ModelParentContentProvider implements IStructuredContentProvider
	{

		@Override
		public void dispose() { }

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) { }

		@Override
		public Object[] getElements(Object inputElement) 
		{
			if (inputElement != null) {
				List<Model> data = WizardHelper.getModelsForModelType((ModelType)inputElement, false, new NullProgressMonitor());
				if (data != null) {
					return data.toArray();
				}
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


	
}
