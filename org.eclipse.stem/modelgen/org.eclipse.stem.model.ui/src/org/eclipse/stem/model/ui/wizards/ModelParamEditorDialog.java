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

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.stem.model.codegen.GeneratorUtils;
import org.eclipse.stem.model.metamodel.MetamodelFactory;
import org.eclipse.stem.model.metamodel.Model;
import org.eclipse.stem.model.metamodel.ModelParam;
import org.eclipse.stem.model.metamodel.ModelParamConstraint;
import org.eclipse.stem.model.ui.Constants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;

/**
 * UI Dialog for editing a ModelParam including formatting
 * and validation for best practice conformance and for
 * for narrow-value fields.
 *
 */
public class ModelParamEditorDialog extends TitleAreaDialog
{
	protected static final String[] CONSTRAINT_TABLE_COLUMNS = {"Constraint Name", "Constraint Value"};

	protected Text nameText, displayNameText, defaultValueText, helpMessageText, unitText, missingMessageText, invalidMessageText;
	protected ComboViewer dataTypeComboViewer;
	protected Table constraintTable;
	protected TableViewer constraintTableViewer;
	protected Button addConstraintButton, editConstraintButton, removeConstraintButton;
	
	protected Model model;
	protected ModelParam param, originalParam;
	protected boolean nameModified = false, displayNameModified = true;
	protected String errorMessage = null;
	
	public ModelParamEditorDialog(Shell parentShell, int style, Model model, ModelParam param, ModelParam originalParam) 
	{
		super(parentShell);
		this.param = param;
		this.originalParam = originalParam;
		this.model = model;
	}
	
	public void create()
	{
		super.create();
		setTitle("Edit Param");
		setMessage("Edit the Model Parameter");
		
		nameText.setText(WizardHelper.safeGet(param.getName()));
		displayNameText.setText(WizardHelper.safeGet(param.getDisplayName()));
		defaultValueText.setText(WizardHelper.safeGet(param.getDefaultValue()));
		unitText.setText(WizardHelper.safeGet(param.getUnit()));
		helpMessageText.setText(WizardHelper.safeGet(param.getHelpMessage()));
		missingMessageText.setText(WizardHelper.safeGet(param.getMissingMessage()));
		invalidMessageText.setText(WizardHelper.safeGet(param.getInvalidMessage()));
		
		EClassifier selectedType = param.getDataType();
		if (selectedType == null) {
			selectedType = WizardHelper.getDefaultModelParamDataTypes()[0];
		}
		
		dataTypeComboViewer.setSelection(new StructuredSelection(selectedType));
		
		setDefaultValueIfNeeded();
	}

	protected Control createDialogArea(Composite parent) {
		
		parent.setLayout( new GridLayout(2, false));
		Composite container = new Composite(parent, SWT.NONE);
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		data.grabExcessHorizontalSpace = true;
		data.horizontalSpan = 2;
		container.setLayoutData(data);
		
		GridLayout layout = new GridLayout(2, false);
		container.setLayout(layout);

		Label nameLabel = new Label(container, SWT.NONE);
		nameLabel.setText("Name");
		nameText = new Text(container, SWT.BORDER);
		nameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		nameText.addKeyListener(new KeyListener() {
			
			@Override
			public void keyReleased(org.eclipse.swt.events.KeyEvent e) {
				nameModified = true;
				displayNameModified = false;
			}
			
			@Override
			public void keyPressed(org.eclipse.swt.events.KeyEvent e) { }
		});
		nameText.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				formatTextFields();
			}
			
			@Override
			public void focusGained(FocusEvent e) { }
		});
		
		Label displayNameLabel = new Label(container, SWT.NONE);
		displayNameLabel.setText("Display Name");
		displayNameText = new Text(container, SWT.BORDER);
		displayNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		displayNameText.addKeyListener(new KeyListener() {

			@Override
			public void keyReleased(org.eclipse.swt.events.KeyEvent e) {
				displayNameModified = true;
			}
			
			@Override
			public void keyPressed(org.eclipse.swt.events.KeyEvent e) {}

		});
		createDataTypeList(container);
		
		Label defaultValueLabel = new Label(container, SWT.NONE);
		defaultValueLabel.setText("Default Value");
		defaultValueText = new Text(container, SWT.BORDER);
		defaultValueText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		createConstraintTable(container);
		
		Label unitLabel = new Label(container, SWT.NONE);
		unitLabel.setText("Units");
		unitText = new Text(container, SWT.BORDER);
		unitText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		Label helpMessageLabel = new Label(container, SWT.NONE);
		helpMessageLabel.setText("Help Message");
		helpMessageText = new Text(container, SWT.BORDER);
		helpMessageText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		Label missingMessageLabel = new Label(container, SWT.NONE);
		missingMessageLabel.setText("Missing Message");
		missingMessageText = new Text(container, SWT.BORDER);
		missingMessageText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		Label invalidMessageLabel = new Label(container, SWT.NONE);
		invalidMessageLabel.setText("Invalid Message");
		invalidMessageText = new Text(container, SWT.BORDER);
		invalidMessageText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		return parent;
	}
	
	private void formatTextFields()
	{
		nameText.setText(WizardHelper.formatToCamelCase(nameText.getText()));
		if (!displayNameModified) {
			displayNameText.setText(WizardHelper.formatToCapWords(nameText.getText()));
		}
		setDefaultValueIfNeeded();
	}
	
	private EClassifier getDataType()
	{
		return (EClassifier)((StructuredSelection)dataTypeComboViewer.getSelection()).getFirstElement();
	}
	
	private void setDefaultValueIfNeeded()
	{
		if (GeneratorUtils.isNullOrEmpty(defaultValueText.getText())) {
			defaultValueText.setText(WizardHelper.getDefaultValueForDataType(getDataType()));
		}
	}

	private void createDataTypeList(Composite container)
	{
		Label dataTypeLabel = new Label(container, SWT.NONE);
		dataTypeLabel.setText("Data Type");
		
		dataTypeComboViewer = new ComboViewer(container, SWT.READ_ONLY);
		dataTypeComboViewer.setContentProvider(ArrayContentProvider.getInstance());
		dataTypeComboViewer.setLabelProvider(new DataTypeViewerLabelProvider());
		dataTypeComboViewer.setInput(WizardHelper.getDefaultModelParamDataTypes());
	}
	
	private void createConstraintTable(Composite container)
	{
		Label unitLabel = new Label(container, SWT.NONE);
		unitLabel.setText("Constraints");
		GridData labelGridData = new GridData(SWT.LEFT, SWT.TOP, false, false);
		labelGridData.verticalIndent = 5;
		unitLabel.setLayoutData(labelGridData);
		
		Group constraintComposite = new Group(container, SWT.NONE);
		constraintComposite.setText(Constants.EMPTY_STRING);
		
		GridData compositeGridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.FILL_BOTH);
		compositeGridData.minimumHeight = 115;
		constraintComposite.setLayoutData(compositeGridData);
		constraintComposite.setLayout(new GridLayout(3, false));

		constraintTable = new Table(constraintComposite, SWT.SINGLE | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | 
				SWT.FULL_SELECTION | SWT.HIDE_SELECTION);
		constraintTable.setLinesVisible(true);
		constraintTable.setHeaderVisible(true);
		
		GridData tableGridData = new GridData(GridData.FILL_BOTH);
		//compositeGridData.minimumHeight = 115;
		tableGridData.horizontalSpan = 3;
		constraintTable.setLayoutData(tableGridData);

		for (String column : CONSTRAINT_TABLE_COLUMNS) {
			TableColumn constraintNameColumn = new TableColumn(constraintTable, SWT.NONE);
			constraintNameColumn.setText(column);
			constraintNameColumn.setResizable(true);
			constraintNameColumn.setWidth(200);
		}

		constraintTableViewer = new TableViewer(constraintTable);
		constraintTableViewer.setUseHashlookup(true);
		constraintTableViewer.setColumnProperties(CONSTRAINT_TABLE_COLUMNS);
		constraintTableViewer.setContentProvider(ArrayContentProvider.getInstance());
		constraintTableViewer.setLabelProvider(new ConstraintTableLabelProvider());
		constraintTableViewer.setInput(param.getConstraints());
		constraintTableViewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				editConstraint();
				
			}
		});
		
		constraintTableViewer.getTable().addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				toggleConstraintButtons(true);
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				toggleConstraintButtons(false);
			}
		});
		
		constraintTableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				toggleConstraintButtons(false);
			}
		});
		
		
		addConstraintButton = new Button(constraintComposite, SWT.PUSH);
		addConstraintButton.setText("Add");
		addConstraintButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				addConstraint();
			}
			
		});
		
		editConstraintButton = new Button(constraintComposite, SWT.PUSH);
		editConstraintButton.setText("Edit");
		editConstraintButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				editConstraint();
			}
			
		});
		
		removeConstraintButton = new Button(constraintComposite, SWT.PUSH);
		removeConstraintButton.setText("Remove");
		removeConstraintButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				removeConstraint();
			}
			
		});
		
		toggleConstraintButtons(false);
		
	}
	
	private void toggleConstraintButtons(boolean forceDisable)
	{
		boolean toggle = false;
		if (!forceDisable) {
			toggle = getSelectedConstraint() != null;
		}
		
		editConstraintButton.setEnabled(toggle);
		removeConstraintButton.setEnabled(toggle);
	}

	private ModelParamConstraint openConstraintEditorDialog(final ModelParamConstraint constraint)
	{
		ModelParamConstraint constraintToUse = null;
		if (constraint == null) {
			constraintToUse = MetamodelFactory.eINSTANCE.createModelParamConstraint();
		} else {
			constraintToUse = EcoreUtil.copy(constraint);
		}
		ModelParamConstraintEditorDialog editorDialog = new ModelParamConstraintEditorDialog(
				getShell(), SWT.NONE, param, constraintToUse);
		
		if (editorDialog.open() == Window.OK) {
			return constraintToUse;
		}
		
		return null;
	}
	
	private void addConstraint()
	{
		ModelParamConstraint constraint = openConstraintEditorDialog(null);
		if (constraint != null) {
			param.getConstraints().add(constraint);
			constraintTableViewer.refresh();
		}
	}
	
	private void editConstraint()
	{
		ModelParamConstraint previousConstraint = getSelectedConstraint();
		if (previousConstraint != null) {
			ModelParamConstraint constraint = openConstraintEditorDialog(previousConstraint);
			if (constraint != null) {
				param.getConstraints().remove(previousConstraint);
				param.getConstraints().add(constraint);
				constraintTableViewer.refresh();
			}

		}
	}
	
	private void removeConstraint()
	{
		ModelParamConstraint selected = getSelectedConstraint();
		if (selected != null) {
			param.getConstraints().remove(selected);
			constraintTableViewer.refresh();
		}
	}
	
	private ModelParamConstraint getSelectedConstraint()
	{
		return (ModelParamConstraint) ((StructuredSelection)constraintTableViewer.getSelection()).getFirstElement();
	}
	
	private class ConstraintTableLabelProvider extends LabelProvider implements ITableLabelProvider 
	{

		@Override
		public Image getColumnImage(Object element, int columnIndex) {
			return null;
		}

		@Override
		public String getColumnText(Object element, int columnIndex) {
			ModelParamConstraint constraint = (ModelParamConstraint)element;
			switch (columnIndex) {
			case 0: 
				return constraint.getName();
			case 1: 
				return constraint.getConstraint();
			}
			return Constants.EMPTY_STRING;
		}
	}
	
	
	private static class DataTypeViewerLabelProvider extends LabelProvider
	{
		@Override
		public String getText(Object element) {
			if (element instanceof EClassifier) {
				String name = ((EClassifier)element).getInstanceClassName();
				int lastIdx = name.lastIndexOf('.');
				if (lastIdx >= 0) {
					name = name.substring(lastIdx+1);
				}
				return name;
			}
			
			return Constants.EMPTY_STRING;
		}	
	}
	
	protected boolean hasNameConflict()
	{
		for (ModelParam param : WizardHelper.getAllParametersForModel(model)) {
			if (param != originalParam && param.getName().equals(nameText.getText())) {
				return true;
			}
		}
		return false;
	}

	protected boolean validate()
	{
		if (GeneratorUtils.isNullOrEmpty(nameText.getText())) {
			errorMessage = "Enter a name for this parameter";
			return false;
		}
		
		if (GeneratorUtils.isNullOrEmpty(displayNameText.getText())) {
			errorMessage = "Enter a display name for this parameter";
			return false;
		}

		if (hasNameConflict()) {
			errorMessage = "This model already contains a parameter named \""+ nameText.getText() +"\"";
			return false;
		}
		
		errorMessage = null;
		return true;
	}

	@Override
	protected void okPressed() 
	{
		formatTextFields();
		if (validate()) {
			param.setName(nameText.getText());
			param.setDisplayName(displayNameText.getText());
			param.setDefaultValue(defaultValueText.getText());
			param.setUnit(unitText.getText());
			param.setHelpMessage(helpMessageText.getText());
			param.setMissingMessage(missingMessageText.getText());
			param.setInvalidMessage(invalidMessageText.getText());
			param.setDataType(getDataType());
			super.okPressed();
		} else {
			MessageDialog.openError(getShell(), "Error", errorMessage);
		}
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	//public void
}
