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

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.stem.model.metamodel.Compartment;
import org.eclipse.stem.model.metamodel.CompartmentGroup;
import org.eclipse.stem.model.metamodel.MetamodelFactory;
import org.eclipse.stem.model.metamodel.Model;
import org.eclipse.stem.model.ui.Constants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class ModelCompartmentsPage extends WizardPage
{
	protected Composite container;
	
	protected ComboViewer parentLabelComboViewer;
	protected TableViewer compartmentViewer;
	protected Label modelParamInformationLabel;
	protected Button addCompartmentButton, editCompartmentButton, removeCompartmentButton;
	
	protected Model model;

	public ModelCompartmentsPage(Model model) {
		super("Model Compartments Page");
		setTitle("Model Compartments");
		setDescription("Define the compartments for your model");

		this.model = model;
	}

	@Override
	public void createControl(Composite parent) {		
		container = new Composite(parent, SWT.NULL);
		container.setLayout(new GridLayout(3, false));

		modelParamInformationLabel = new Label(container, SWT.NONE);
		modelParamInformationLabel.setText("Select compartments for your model");
		
		GridData labelGridData = new GridData(GridData.FILL);
		labelGridData.horizontalSpan = 3;
		modelParamInformationLabel.setLayoutData(labelGridData);
		
		createParentLabelList(container);
		createModelParamsTable(container);
		
		setControl(container);
	}
	
	
	private void createParentLabelList(Composite container)
	{
		Label dataTypeLabel = new Label(container, SWT.NONE);
		dataTypeLabel.setText("Parent Compartment Group");
		
		parentLabelComboViewer = new ComboViewer(container, SWT.READ_ONLY);
		parentLabelComboViewer.getCombo().setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		parentLabelComboViewer.setContentProvider(ArrayContentProvider.getInstance());
		parentLabelComboViewer.setLabelProvider(new CompartmentGroupNameLabelProvider());
		parentLabelComboViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				Object obj = ((StructuredSelection)parentLabelComboViewer.getSelection()).getFirstElement();
				if (obj instanceof CompartmentGroup) {
					//EClass labelValue = WizardHelper.getLabelValueForLabel((EClass)obj);
					model.getCompartments().setParentGroup((CompartmentGroup)obj);
					compartmentViewer.refresh();
					validatePage();
				}
			}
		});

		
//		reloadLabelsButton = new Button(container, SWT.PUSH);
//		reloadLabelsButton.setEnabled(true);
//		reloadLabelsButton.setText("Reload Labels");
//		reloadLabelsButton.addSelectionListener(new SelectionAdapter() {
//
//			@Override
//			public void widgetSelected(SelectionEvent e) {
//
//				
//				WizardHelper.displayEcoreProjectSelectorDialog(getShell(), getContainer());
//				parentLabelComboViewer.setInput(WizardHelper.getCompartmentGroupsForModelType(model.getModelType(), true, null));
//				if (model.getCompartments().getParentGroup() != null) {
//					parentLabelComboViewer.setSelection(new StructuredSelection(model.getCompartments().getParentGroup()));
//				}
//			}
//			
//		});
	}
		
	private Compartment openCompartmentsEditorDialog(final Compartment compartment)
	{
		Compartment compartmentToUse = null;
		if (compartment == null) {
			compartmentToUse = MetamodelFactory.eINSTANCE.createCompartment();
		} else {
			compartmentToUse = EcoreUtil.copy(compartment);
		}
		ModelCompartmentEditorDialog editorDialog = new ModelCompartmentEditorDialog(
				getShell(),
				SWT.NONE,
				model.getCompartments(),
				compartmentToUse,
				compartment);
		
		if (editorDialog.open() == Window.OK) {
			return compartmentToUse;
		}
		
		return null;
	}
	
	private void addCompartment()
	{
		Compartment compartment = openCompartmentsEditorDialog(null);
		if (compartment != null) {
			model.getCompartments().getCompartments().add(compartment);
			compartmentViewer.refresh();
		}
	}
	
	private void editCompartment()
	{
		Compartment selected = getSelectedCompartment();
		if (selected != null) {
			if (!inherited(selected)) {
				Compartment previousCompartment = selected;
				Compartment compartment = openCompartmentsEditorDialog(previousCompartment);
				if (compartment != null) {
					Collections.replaceAll(model.getCompartments().getCompartments(), previousCompartment, compartment);
					compartmentViewer.refresh();
				}
			} else {
				MessageDialog.openWarning(getShell(), "Edit Compartment", "You cannot edit a compartment inherited from another model.");
			}
		}
	}
	
	private void removeCompartment()
	{
		Compartment selected = getSelectedCompartment();
		if (selected != null && !inherited(selected)) {
			model.getCompartments().getCompartments().remove(selected);
			compartmentViewer.refresh();
		}
	}
	
	private Compartment getSelectedCompartment()
	{
		return (Compartment) ((StructuredSelection)compartmentViewer.getSelection()).getFirstElement();
	}
	
	private void toggleButtons(boolean forceDisable)
	{
		boolean toggle = false;
		if (!forceDisable) {
			Compartment selected = getSelectedCompartment();
			toggle = selected != null && !inherited(selected);
		}
		
		editCompartmentButton.setEnabled(toggle);
		removeCompartmentButton.setEnabled(toggle);
	}
	
	private void createModelParamsTable(Composite container)
	{
		compartmentViewer = new TableViewer(container, SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
		compartmentViewer.setUseHashlookup(true);

		compartmentViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				toggleButtons(false);
			}
		});
		
		compartmentViewer.addDoubleClickListener(new IDoubleClickListener() {
			
			@Override
			public void doubleClick(DoubleClickEvent event) {
				editCompartment();
			}
		});
		
		final Table table = compartmentViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
//		table.addFocusListener(new FocusListener() {
//			
//			@Override
//			public void focusLost(FocusEvent e) {
//				toggleButtons(true);
//			}
//			
//			@Override
//			public void focusGained(FocusEvent e) {
//				toggleButtons(false);
//			}
//		});
		
		
		GridData gridData = new GridData(GridData.FILL_BOTH);
		gridData.horizontalSpan = 3;
		compartmentViewer.getControl().setLayoutData(gridData);
		compartmentViewer.setContentProvider(new CompartmentContentProvider());
		
		
		TableViewerColumn viewerColumn = null;
		TableColumn column = null;
		
		viewerColumn = new TableViewerColumn(compartmentViewer,
				SWT.NONE);
		column = viewerColumn.getColumn();
		column.setText("Name");
		column.setWidth(175);
		column.setResizable(true);
		column.setMoveable(false);

		viewerColumn.setLabelProvider(new ModelCompartmentColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((Compartment)element).getName();
			}
		});
		
		viewerColumn = new TableViewerColumn(compartmentViewer,
				SWT.NONE);
		column = viewerColumn.getColumn();
		column.setText("Compartment Type");
		column.setWidth(130);
		column.setResizable(true);
		column.setMoveable(false);

		viewerColumn.setLabelProvider(new ModelCompartmentColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((Compartment)element).getType().getLiteral();
			}
		});
		
//		viewerColumn = new TableViewerColumn(compartmentViewer,
//				SWT.NONE);
//		column = viewerColumn.getColumn();
//		column.setText("Data Type");
//		column.setWidth(100);
//		column.setResizable(true);
//		column.setMoveable(false);
//
//		viewerColumn.setLabelProvider(new ModelCompartmentColumnLabelProvider() {
//			@Override
//			public String getText(Object element) {
//				return ((Compartment)element).getDataType().getName();
//			}
//		});
		
		viewerColumn = new TableViewerColumn(compartmentViewer,
				SWT.NONE);
		column = viewerColumn.getColumn();
		column.setText("Inherited From");
		column.setWidth(250);
		column.setResizable(true);
		column.setMoveable(false);

		viewerColumn.setLabelProvider(new ModelCompartmentColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Compartment compartment = (Compartment)element;
				if (compartment.getContainerGroup() != null) {
					String name = compartment.getContainerGroup().getName();
					name = name.replace("LabelValue", Constants.EMPTY_STRING);
					return name;
				}
				return Constants.EMPTY_STRING;
			}
		});
		
		compartmentViewer.setComparator(new ViewerComparator() {

			@Override
			public void sort(Viewer viewer, Object[] elements) {
				Arrays.sort(elements, new Comparator<Object>() {

					@Override
					public int compare(Object o1, Object o2) {
						if ((o1 instanceof Compartment) && (o2 instanceof Compartment)) {
							Compartment c1 = (Compartment)o1;
							Compartment c2 = (Compartment)o2;
							if (inherited(c1) && !inherited(c2)) {
								return 1;
							} else if (!inherited(c1) && inherited(c2)) {
								return -1;
							}
						}
						return 0;
					}
					
				});

			}
			
		});
		
		
		Composite buttonBarComposite = new Composite(container, SWT.NONE);
		GridData buttonBarGridData = new GridData(GridData.FILL_HORIZONTAL);
		buttonBarGridData.horizontalSpan = 3;
		buttonBarComposite.setLayoutData(buttonBarGridData);
		
		buttonBarComposite.setLayout(new GridLayout(3, false));
		
		addCompartmentButton = new Button(buttonBarComposite, SWT.PUSH);
		addCompartmentButton.setEnabled(true);
		addCompartmentButton.setText("Add Compartment");
		addCompartmentButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				addCompartment();
			}
			
		});

		editCompartmentButton = new Button(buttonBarComposite, SWT.PUSH);
		editCompartmentButton.setEnabled(false);
		editCompartmentButton.setText("Edit Compartment");
		editCompartmentButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				editCompartment();
			}
			
		});
		
		removeCompartmentButton = new Button(buttonBarComposite, SWT.PUSH);
		removeCompartmentButton.setEnabled(false);
		removeCompartmentButton.setText("Remove Compartment");
		removeCompartmentButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				removeCompartment();
			}
			
		});
		
		
		compartmentViewer.setInput(model);
	}
	
	private class ModelCompartmentColumnLabelProvider extends InheritedColumnLabelProvider
	{
		ModelCompartmentColumnLabelProvider()
		{
			super(SWT.COLOR_DARK_GRAY, SWT.NONE);
		}
		
		protected Shell getShell()
		{
			return ModelCompartmentsPage.this.getShell();
		}
		
		protected boolean isInherited(Object obj)
		{
			if (obj instanceof Compartment) {
				return inherited((Compartment)obj);
			}
			return false;
		}
	}

	private class CompartmentContentProvider implements IStructuredContentProvider
	{

		@Override
		public void dispose() { }

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) { }

		@Override
		public Object[] getElements(Object inputElement) {
			return WizardHelper.getAllCompartmentsForModel((Model)inputElement).toArray();
		}
		
	}
	
	private static class CompartmentGroupNameLabelProvider extends LabelProvider
	{
		@Override
		public String getText(Object element) {
			if (element instanceof CompartmentGroup) {
				return ((CompartmentGroup)element).getName().replace("Label", Constants.EMPTY_STRING);
			}
			
			return Constants.EMPTY_STRING;
		}
	}
	
	public void setVisible(boolean visible)
	{		
		if (visible) {
			
			compartmentViewer.setInput(model);
			compartmentViewer.refresh();

			parentLabelComboViewer.setInput(WizardHelper.getCompartmentGroupsForModelType(model.getModelType(), false, new NullProgressMonitor()).toArray());
			parentLabelComboViewer.refresh();
			if (model.getCompartments().getParentGroup() != null) {
				parentLabelComboViewer.setSelection(new StructuredSelection(model.getCompartments().getParentGroup()));
			}
			validatePage();
		}
		
		super.setVisible(visible);
	}
	
	boolean validatePage()
	{
		boolean valid = true;
		String errorMessage = null;
		
		if (model.getCompartments() != null && 
				model.getCompartments().getParentGroup() == null) {
			valid = false;
			errorMessage = "Select a parent compartment group for this model";
			
		}
		
		setPageComplete(valid);
		setErrorMessage(errorMessage);
		return valid;
	}
	
	private boolean inherited(Compartment compartment)
	{
		return compartment.getContainerGroup() != model.getCompartments();
	}

}
