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
import java.util.Collections;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.stem.model.metamodel.MetamodelFactory;
import org.eclipse.stem.model.metamodel.Model;
import org.eclipse.stem.model.metamodel.Package;
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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;


public class PackagePropertiesPage extends WizardPage {
	private Package modelPackage;

	private Text pkgNameText, pkgPrefixText;
	private TableViewer pkgModelsViewer;

	private Button addModelButton, editModelButton, removeModelButton;

	private boolean initialized = false;

	protected PackagePropertiesPage(Package pkg) {
		super("Model Package Options");
		setTitle("Model Package Options");
		setDescription("Configure the model package");

		this.modelPackage = pkg;
	}
	
	public void setPackage(Package pkg)
	{
		this.modelPackage = pkg;
		populate();
		validatePage();
	}
	
	private void populate()
	{
		if (initialized && modelPackage != null) {
			pkgNameText.setText(WizardHelper.safeGet(modelPackage.getName()));
			pkgPrefixText.setText(WizardHelper.safeGet(modelPackage.getPackagePrefix()));
			pkgModelsViewer.setInput(modelPackage.getModels());
		}
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout(2, false));

		Label pkgNameLabel = new Label(container, SWT.NONE);
		pkgNameLabel.setText("Package Name");

		pkgNameText = new Text(container, SWT.BORDER | SWT.SINGLE);
		pkgNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		pkgNameText.setText(WizardHelper.safeGet(modelPackage.getName()));
		pkgNameText.addKeyListener(new KeyAdapter() {

			@Override
			public void keyReleased(KeyEvent e) {
				validatePage();
			}

		});
		
		pkgNameText.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				formatTextFields();
			}
			
			@Override
			public void focusGained(FocusEvent e) { }
		});

		Label pkgPrefixLabel = new Label(container, SWT.NONE);
		pkgPrefixLabel.setText("Package Prefix");

		pkgPrefixText = new Text(container, SWT.BORDER | SWT.SINGLE);
		pkgPrefixText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		pkgPrefixText.setText(WizardHelper.safeGet(modelPackage
				.getPackagePrefix()));
		pkgPrefixText.addKeyListener(new KeyAdapter() {

			@Override
			public void keyReleased(KeyEvent e) {
				validatePage();
			}

		});

		pkgPrefixText.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				formatTextFields();
			}
			
			@Override
			public void focusGained(FocusEvent e) { }
		});
		
		createPackageModelsViewer(container);
		setControl(container);
		initialized = true;
	}

	private void createPackageModelsViewer(Composite container) {

		Label pkgModelsLabel = new Label(container, SWT.NONE);
		pkgModelsLabel.setText("Contained models");
		GridData pkgModelsLabelData = new GridData();
		pkgModelsLabelData.horizontalSpan = 2;
		pkgModelsLabel.setLayoutData(pkgModelsLabelData);

		pkgModelsViewer = new TableViewer(container, SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
		pkgModelsViewer.setUseHashlookup(true);

		GridData gridData = new GridData(GridData.FILL_BOTH);
		gridData.horizontalSpan = 2;
		pkgModelsViewer.getControl().setLayoutData(gridData);
		pkgModelsViewer.setContentProvider(ArrayContentProvider.getInstance());

		pkgModelsViewer.getTable().setHeaderVisible(true);
		pkgModelsViewer.getTable().setLinesVisible(true);

		pkgModelsViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				boolean selected = (getSelectedModel() != null);
				editModelButton.setEnabled(selected);
				removeModelButton.setEnabled(selected);
			}
		});

		pkgModelsViewer.addDoubleClickListener(new IDoubleClickListener() {

			@Override
			public void doubleClick(DoubleClickEvent event) {
				editModel();
			}
		});

		TableViewerColumn viewerColumn = null;
		TableColumn column = null;

		viewerColumn = new TableViewerColumn(pkgModelsViewer, SWT.NONE);
		column = viewerColumn.getColumn();
		column.setText("Name");
		column.setWidth(200);
		column.setResizable(true);
		column.setMoveable(false);

		viewerColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (element != null) {
					return ((Model) element).getName();
				}
				return Constants.EMPTY_STRING;
			}
		});
		
		viewerColumn = new TableViewerColumn(pkgModelsViewer, SWT.NONE);
		column = viewerColumn.getColumn();
		column.setText("Model Type");
		column.setWidth(200);
		column.setResizable(true);
		column.setMoveable(false);

		viewerColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Model model = (Model)element;
				if (model != null) {
					return model.getModelType().getLiteral();
				}
				return Constants.EMPTY_STRING;
			}
		});


		viewerColumn = new TableViewerColumn(pkgModelsViewer, SWT.NONE);
		column = viewerColumn.getColumn();
		column.setText("Parent Model");
		column.setWidth(200);
		column.setResizable(true);
		column.setMoveable(false);

		viewerColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Model model = (Model)element;
				if (model != null && model.getParentModel() != null) {
					return model.getParentModel().getName();
				}
				return Constants.EMPTY_STRING;
			}
		});

		Composite buttonBarComposite = new Composite(container, SWT.NONE);
		GridData buttonBarGridData = new GridData(GridData.FILL_HORIZONTAL);
		buttonBarGridData.horizontalSpan = 2;
		buttonBarComposite.setLayoutData(buttonBarGridData);
		buttonBarComposite.setLayout(new GridLayout(3, false));

		addModelButton = new Button(buttonBarComposite, SWT.PUSH);
		addModelButton.setEnabled(true);
		addModelButton.setText("Add Model");
		addModelButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				addModel();
			}

		});

		editModelButton = new Button(buttonBarComposite, SWT.PUSH);
		editModelButton.setEnabled(false);
		editModelButton.setText("Edit Model");
		editModelButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				editModel();
			}

		});

		removeModelButton = new Button(buttonBarComposite, SWT.PUSH);
		removeModelButton.setEnabled(false);
		removeModelButton.setText("Remove Model");
		removeModelButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				removeModel();
			}

		});

		pkgModelsViewer.setInput(modelPackage.getModels());

	}

	private Model openModelEditorDialog(final Model existingModel) {
		Model modelToUse = null;
		if (existingModel == null) {
			modelToUse = MetamodelFactory.eINSTANCE.createModel();
		} else {
			modelToUse = EcoreUtil.copy(existingModel);
		}

		try {
			NewModelWizard wizard = new NewModelWizard(modelToUse, modelPackage);
			WizardDialog wizardDialog = new WizardDialog(getShell(), wizard);
			if (wizardDialog.open() == Window.OK) {
				return modelToUse;
	
			}
		} catch (Throwable t) {
			t.printStackTrace();
		}

		return null;
	}

	private void addModel() {
		try {
			Model newModel = openModelEditorDialog(null);
			if (newModel != null) {
				modelPackage.getModels().add(newModel);
				modelPackage.getCompartmentGroups().add(newModel.getCompartments());
				pkgModelsViewer.refresh();
			}
			validatePage();
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	private void editModel() {
		Model selectedModel = getSelectedModel();
		if (selectedModel != null) {
			Model newModel = openModelEditorDialog(selectedModel);
			if (newModel != null) {
				Collections.replaceAll(modelPackage.getModels(), selectedModel,
						newModel);
				Collections.replaceAll(modelPackage.getCompartmentGroups(), selectedModel.getCompartments(),
						newModel.getCompartments());
				pkgModelsViewer.refresh();
			}
		}
		validatePage();
	}

	private void removeModel() {
		Model selected = getSelectedModel();
		if (selected != null) {
			modelPackage.getModels().remove(selected);
			modelPackage.getCompartmentGroups().remove(selected.getCompartments());
			pkgModelsViewer.refresh();
		}
		validatePage();
	}

	private Model getSelectedModel() {
		return (Model) ((StructuredSelection) pkgModelsViewer.getSelection())
				.getFirstElement();
	}

	public void applyChanges() {
		modelPackage.setName(WizardHelper.safeGet(pkgNameText));
		modelPackage.setPackagePrefix(WizardHelper.safeGet(pkgPrefixText));
	}

	protected void validatePage() {
		boolean valid = initialized && modelPackage != null;

		String errorMessage = null;		
		if (valid && WizardHelper.isNullOrEmpty(pkgNameText.getText())) {
			errorMessage = "Enter a name for the package";
			valid = false;
		}
	
		if (valid && !WizardHelper.isValidJavaName(
				WizardHelper.formatToUpperCaseWordsNoSpaces(pkgNameText.getText()))) {
			errorMessage = "The package name \""+pkgNameText.getText()+"\" is invalid.  Please ensure it contains only alphanumeric characters and does not begin with a number.";
			valid = false;
		}
		
		if (valid && WizardHelper.isNullOrEmpty(pkgPrefixText.getText())) {
			errorMessage = "Enter a package prefix";
			valid = false;
		}
		
		if (valid && !WizardHelper.isValidJavaPackageName(
						WizardHelper.formatToJavaPackageName(pkgPrefixText.getText()))) {
			errorMessage = "The package prefix \""+pkgPrefixText.getText()+"\" is invalid.  A valid example is \"org.eclipse.stem.models\".";
			valid = false;
		}
		
		if (valid && modelPackage.getModels().size() == 0) {
			errorMessage = "Please add one or more models to this package.";
			valid = false;
		}
		
		String matchingName = WizardHelper.getFirstMatchingModelName(modelPackage);
		if (valid && matchingName != null) {
			errorMessage = "More than one model named \""+matchingName+"\" in this package";
			valid = false;
		}
		
		setPageComplete(valid);
		setErrorMessage(errorMessage);
	}
	
	private void formatTextFields()
	{
		pkgNameText.setText(WizardHelper.formatToUpperCaseWordsNoSpaces(pkgNameText.getText()));
		pkgPrefixText.setText(WizardHelper.formatToJavaPackageName(pkgPrefixText.getText()));
	}

	@Override
	public void setVisible(boolean visible) {
		validatePage();
		super.setVisible(visible);
	}
	
	

}