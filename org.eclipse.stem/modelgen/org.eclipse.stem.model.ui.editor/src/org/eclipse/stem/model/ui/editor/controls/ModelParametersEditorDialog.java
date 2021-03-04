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

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.window.Window;
import org.eclipse.stem.model.metamodel.MetamodelFactory;
import org.eclipse.stem.model.metamodel.Model;
import org.eclipse.stem.model.metamodel.ModelParam;
import org.eclipse.stem.model.ui.Constants;
import org.eclipse.stem.model.ui.wizards.InheritedColumnLabelProvider;
import org.eclipse.stem.model.ui.wizards.ModelParamEditorDialog;
import org.eclipse.stem.model.ui.wizards.WizardHelper;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

/**
 * Wizard Page viewing / editing the parameters of a Model
 *
 */
public class ModelParametersEditorDialog extends TitleAreaDialog
{
	//protected Composite container;

	protected TableViewer modelParamViewer;
	protected Label modelParamInformationLabel;
	protected Button addParamButton, editParamButton, removeParamButton;

	protected Model modelOriginal, modelCopy;
	
	public ModelParametersEditorDialog(Shell parentShell, Model model) {
		super(parentShell);
		this.modelOriginal = model;
		this.modelCopy = EcoreUtil.copy(model);
	}
	
	@Override
	public void create() {
		super.create();
		setTitle("Edit Model");
		setMessage("Edit the parameters for the computational model");
		
		modelParamViewer.setInput(modelCopy);
	}
	
	@Override
	protected void okPressed() {
		modelOriginal.getParameters().clear();
		modelOriginal.getParameters().addAll(modelCopy.getParameters());
		super.okPressed();
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		container.setLayout(new GridLayout(3, false));
		
		createModelParamsTable(container);
		
		addParamButton = new Button(container, SWT.PUSH);
		addParamButton.setEnabled(true);
		addParamButton.setText("Add Parameter");
		addParamButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				addParam();
			}
			
		});

		editParamButton = new Button(container, SWT.PUSH);
		editParamButton.setEnabled(false);
		editParamButton.setText("Edit Parameter");
		editParamButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				editParam();
			}
			
		});

		removeParamButton = new Button(container, SWT.PUSH);
		removeParamButton.setEnabled(false);
		removeParamButton.setText("Remove Parameter");
		removeParamButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				removeParam();
			}
			
		});
		
		return parent;
	}
	
	private ModelParam openModelParamDialog(ModelParam param)
	{
		ModelParam originalParam = param;
		if (param == null) {
			param = MetamodelFactory.eINSTANCE.createModelParam();
		} else {
			param = EcoreUtil.copy(param);
		}
		ModelParamEditorDialog editorDialog = new ModelParamEditorDialog(
				getShell(), SWT.NONE, modelCopy, param, originalParam);
		
		if (editorDialog.open() == Window.OK) {
			return param;
		}
		
		return null;
	}
	
	private void addParam()
	{
		ModelParam param = openModelParamDialog(null);
		if (param != null) {
			modelCopy.getParameters().add(param);
			modelParamViewer.refresh();
		}
	}
	
	private void editParam()
	{
		ModelParam selected = getSelectedParameter();
		if (selected != null) {
			if (!inherited(selected)) {
				ModelParam param = openModelParamDialog(selected);
				if (param != null) {
					Collections.replaceAll(modelCopy.getParameters(), selected, param);
					modelParamViewer.refresh();
				}
				
				if (param != null) {
					modelCopy.getParameters().remove(selected);
					modelCopy.getParameters().add(param);
					modelParamViewer.refresh();
				}
			} else {
				MessageDialog.openWarning(getShell(), "Edit Parameter", "You cannot edit a parameter inherited from another model.");
			}
		}
	}
	
	private void removeParam()
	{
		ModelParam selected = getSelectedParameter();
		if (selected != null) {
			modelCopy.getParameters().remove(selected);
			modelParamViewer.refresh();
		}
	}
	
	private void toggleButtons(boolean forceDisable)
	{
		boolean toggle = false;
		if (!forceDisable) {
			ModelParam param = getSelectedParameter();
			toggle = param != null && !inherited(param);
		}
		
		editParamButton.setEnabled(toggle);
		removeParamButton.setEnabled(toggle);
	}
	
	private ModelParam getSelectedParameter()
	{
		return (ModelParam) ((StructuredSelection)modelParamViewer.getSelection()).getFirstElement();
	}
	
	private void createModelParamsTable(Composite container)
	{
		modelParamViewer = new TableViewer(container, SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
		modelParamViewer.setUseHashlookup(true);
		
		GridData gridData = new GridData();
		gridData.verticalAlignment = GridData.FILL;
		gridData.horizontalSpan = 3;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		modelParamViewer.getControl().setLayoutData(gridData);
		modelParamViewer.setContentProvider(new ModelParamTableContentProvider());
		
		modelParamViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				toggleButtons(false);
			}
		});
		
		modelParamViewer.addDoubleClickListener(new IDoubleClickListener() {
			
			@Override
			public void doubleClick(DoubleClickEvent event) {
				editParam();
			}
		});
		
		final Table table = modelParamViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		TableViewerColumn viewerColumn = null;
		TableColumn column = null;
		
		viewerColumn = new TableViewerColumn(modelParamViewer,
				SWT.NONE);
		column = viewerColumn.getColumn();
		column.setText("Name");
		column.setWidth(200);
		column.setResizable(true);
		column.setMoveable(false);

		viewerColumn.setLabelProvider(new ModelParamColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((ModelParam)element).getName();
			}
		});
		
		viewerColumn = new TableViewerColumn(modelParamViewer,
				SWT.NONE);
		column = viewerColumn.getColumn();
		column.setText("Type");
		column.setWidth(100);
		column.setResizable(true);
		column.setMoveable(false);

		viewerColumn.setLabelProvider(new ModelParamColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((ModelParam)element).getDataType().getName();
			}
		});
		
		viewerColumn = new TableViewerColumn(modelParamViewer,
				SWT.NONE);
		column = viewerColumn.getColumn();
		column.setText("Default Value");
		column.setWidth(100);
		column.setResizable(true);
		column.setMoveable(false);

		viewerColumn.setLabelProvider(new ModelParamColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				ModelParam mp = (ModelParam)element;
				if (mp.getDefaultValue() != null) {
					return mp.getDefaultValue();
				}
				return Constants.EMPTY_STRING;
			}
		});
		
		viewerColumn = new TableViewerColumn(modelParamViewer,
				SWT.NONE);
		column = viewerColumn.getColumn();
		column.setText("Inherited From");
		column.setWidth(100);
		column.setResizable(true);
		column.setMoveable(false);

		viewerColumn.setLabelProvider(new ModelParamColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				ModelParam mp = (ModelParam)element;
				if (inherited(mp) && mp.getContainerModel() != null) {
					return mp.getContainerModel().getName();
				}
				return Constants.EMPTY_STRING;
			}
		});
		
		
		modelParamViewer.setComparator(new ViewerComparator() {
			@Override
			public void sort(Viewer viewer, Object[] elements) {
				Arrays.sort(elements, new Comparator<Object>() {

					@Override
					public int compare(Object o1, Object o2) {
						if ((o1 instanceof ModelParam) && (o2 instanceof ModelParam)) {
							ModelParam p1 = (ModelParam)o1;
							ModelParam p2 = (ModelParam)o2;
							if (!inherited(p1) && inherited(p2)) {
								return -1;
							} else if (inherited(p1) && !inherited(p2)) {
								return 1;
							}
						}
						return 0;
					}
					
				});
			}
		});
	}
	
	private boolean inherited(ModelParam param)
	{
		return param.getContainerModel() != modelCopy;
	}

	private class ModelParamColumnLabelProvider extends InheritedColumnLabelProvider
	{
		protected ModelParamColumnLabelProvider()
		{
			super(SWT.COLOR_DARK_GRAY, SWT.NONE);
		}
		
		protected Shell getShell()
		{
			return ModelParametersEditorDialog.this.getShell();
		}
		
		protected boolean isInherited(Object obj)
		{
			if (obj instanceof ModelParam) {
				return inherited((ModelParam)obj);
			}
			return false;
		}
	}

	private class ModelParamTableContentProvider implements IStructuredContentProvider
	{

		@Override
		public void dispose() { }

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) { }

		@Override
		public Object[] getElements(Object inputElement) {		
			return WizardHelper.getAllParametersForModel((Model)inputElement).toArray();
		}
		
	}
}