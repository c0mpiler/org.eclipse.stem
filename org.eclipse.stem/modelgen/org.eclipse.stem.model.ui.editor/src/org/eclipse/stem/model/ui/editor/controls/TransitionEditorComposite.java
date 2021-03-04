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
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ICheckStateProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.stem.model.ctdl.ui.embed.EmbeddedExpressionEditorComposite;
import org.eclipse.stem.model.metamodel.Compartment;
import org.eclipse.stem.model.metamodel.MetamodelPackage;
import org.eclipse.stem.model.metamodel.Model;
import org.eclipse.stem.model.metamodel.Transition;
import org.eclipse.stem.model.metamodel.provider.ModelItemProvider;
import org.eclipse.stem.model.ui.Constants;
import org.eclipse.stem.model.ui.editor.ModelDiagramEditor;
import org.eclipse.stem.model.ui.editor.parts.ModelElementEditPart;
import org.eclipse.stem.model.ui.editor.parts.TransitionElementEditPart;
import org.eclipse.stem.model.ui.editor.vismodel.ModelElement;
import org.eclipse.stem.model.ui.editor.vismodel.TransitionElement;
import org.eclipse.stem.model.ui.wizards.WizardHelper;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;

public class TransitionEditorComposite extends Composite implements ISelectionListener, ISelectionChangedListener
{
	private ModelDiagramEditor diagramEditor;
	private TransitionElement selectedTransition;
	private ModelElement selectedModel;
	private EmbeddedExpressionEditorComposite embeddedEditor;
	private ComboViewer transitionsComboViewer;
	private CheckboxTableViewer forIncidenceViewer;
	
	public TransitionEditorComposite(ModelDiagramEditor editor, Composite parent, int style) 
	{
		super(parent, style);
		this.diagramEditor = editor;
		setLayout(new GridLayout(3,false));
		
		setupTransitionCombo();
		setupForIncidenceTable();
		setupExpressionEditor();
		
		diagramEditor.getSite().getPage().addSelectionListener(this);
		diagramEditor.addModelSelectionListener(this);
	}
	
	protected void setupTransitionCombo()
	{
		Label transitionLabel = new Label(this, SWT.NONE);
		transitionLabel.setText("Transition");
		
		transitionsComboViewer = new ComboViewer(this, SWT.READ_ONLY);
		GridData comboGD = new GridData();
		comboGD.minimumWidth = 100;
		comboGD.widthHint = 100;
		comboGD.horizontalSpan = 2;
		transitionsComboViewer.getCombo().setLayoutData(comboGD);
		transitionsComboViewer.setContentProvider(ArrayContentProvider.getInstance());
		transitionsComboViewer.setLabelProvider(new TransitionNameLabelProvider());
		transitionsComboViewer.addSelectionChangedListener(this);
		transitionsComboViewer.setInput(Collections.emptyList());
	}
	
	protected void setupForIncidenceTable()
	{

		

		
		
	}
	
	protected void setupExpressionEditor()
	{
		// Expression label
		Label expressionLabel = new Label(this, SWT.NONE);
		expressionLabel.setText("Expression");
		GridData labelGD = new GridData();
		labelGD.horizontalSpan = 2;
		expressionLabel.setLayoutData(labelGD);
		
		Label forIncidenceLabel = new Label(this, SWT.NONE);
		forIncidenceLabel.setText("For Incidence");
		
		// Embedded Xtext Editor
		embeddedEditor = new EmbeddedExpressionEditorComposite(this, SWT.NONE);
		GridData editorGD = new GridData(GridData.FILL_BOTH);
		editorGD.horizontalSpan = 2;
		embeddedEditor.setLayoutData(editorGD);
		
		forIncidenceViewer = CheckboxTableViewer.newCheckList(this, SWT.BORDER | SWT.V_SCROLL | SWT.SINGLE); //new CheckboxTableViewer(this, SWT.CHECK | SWT.BORDER | SWT.V_SCROLL | SWT.SINGLE);
		GridData forIncidenceGD = new GridData(GridData.FILL_VERTICAL);
		forIncidenceGD.minimumWidth = 100;
		forIncidenceGD.widthHint = 100;
		forIncidenceGD.heightHint = 25;
		forIncidenceGD.minimumHeight = 25;
		forIncidenceViewer.getControl().setLayoutData(forIncidenceGD);
		
		forIncidenceViewer.setContentProvider(new IncidenceCompartmentContentProvider());
		forIncidenceViewer.setLabelProvider(new CompartmentNameLabelProvider());
		forIncidenceViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				setIncidenceCompartments();
			}
		});
		
		forIncidenceViewer.addCheckStateListener(new ICheckStateListener() {
			
			@Override
			public void checkStateChanged(CheckStateChangedEvent event) {
				setIncidenceCompartments();
			}
		});
		
		forIncidenceViewer.setCheckStateProvider(new ICheckStateProvider() {
			
			@Override
			public boolean isGrayed(Object element) {
				if (selectedTransition == null) {
					return true;
				}
				return false;
			}
			
			@Override
			public boolean isChecked(Object element) {
				return (selectedTransition != null 
						&& selectedTransition.getTransition().getForIncidence() != null 
						&& selectedTransition.getTransition().getForIncidence().contains(element));
			}
		});
		
		forIncidenceViewer.getTable().setEnabled(false);
		forIncidenceViewer.setInput(new Object());
	}
	
	private void setIncidenceCompartments()
	{
		Object[] elements = forIncidenceViewer.getCheckedElements();
		
		List<Object> selected = null;
		if (elements != null && elements.length > 0) {
			selected = Arrays.asList(elements);
		} else {
			selected = Collections.emptyList();
		}

		//StructuredSelection selected = (StructuredSelection)forIncidenceViewer.getSelection();
		EditingDomain domain = diagramEditor.getMetamodelEditingDomain();
		domain.getCommandStack().execute(
				SetCommand.create(domain, selectedTransition.getTransition(), MetamodelPackage.Literals.TRANSITION__FOR_INCIDENCE, selected)
				);
		
	}

	@Override
	public void dispose()
	{
		diagramEditor.removeModelSelectionListener(this);
		diagramEditor.getSite().getPage().removeSelectionListener(this);
		embeddedEditor.dispose();
		embeddedEditor = null;
		diagramEditor = null;
	}
	
	@Override
	public void selectionChanged(SelectionChangedEvent event) {
		Object selected = ((StructuredSelection)event.getSelection()).getFirstElement();
		if (selected instanceof TransitionElement) {
			setTransition((TransitionElement)selected);
		}
	}
	
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) 
	{
		if (selection instanceof StructuredSelection) {
			Object selected = ((StructuredSelection)selection).getFirstElement();
			if (selected instanceof TransitionElementEditPart) {
				setTransition((TransitionElement)((TransitionElementEditPart) selected).getModel());
			} else if (selected instanceof ModelElementEditPart) {
				setModel((ModelElement)((ModelElementEditPart) selected).getModel());
			} else if (selected instanceof ModelElement) {
				setModel((ModelElement)selected);
			}
		}
	}
	
	ModelItemProvider modelProvider;
	
	protected void setModel(ModelElement model) {
		if (selectedModel == model || transitionsComboViewer.getCombo().isDisposed()) {
			return;
		}
		
		
		
		selectedModel = model;
		if (selectedModel != null) {
			
			AdapterFactoryEditingDomain domain = (AdapterFactoryEditingDomain)diagramEditor.getMetamodelEditingDomain();
			modelProvider = (ModelItemProvider)domain.getAdapterFactory().adapt(model.getModel(), IItemPropertySource.class);
			
			modelProvider.addListener(new INotifyChangedListener() {
				
				@Override
				public void notifyChanged(Notification notification) {
					if (notification.getFeatureID(null) == MetamodelPackage.MODEL__TRANSITIONS) {
						Display.getDefault().asyncExec(new  Runnable() {
							
							@Override
							public void run() {
								refresh();
							}
						});
					}
					
				}
			});
			
			transitionsComboViewer.setInput(model.getTransitionElements());
			forIncidenceViewer.setInput(model.getModel());
			

			
		} else {
			transitionsComboViewer.setInput(Collections.emptyList());
		}
		
		
		refresh();
		forIncidenceViewer.getTable().setEnabled(false);
		
		TransitionElement nextTransition = null;
		if (selectedTransition != null && selectedTransition.getTransition() != null) {
			for (TransitionElement te : model.getTransitionElements()) {
				if (matchesSelectedTransition(te)) {
					nextTransition = te;
					break;
				}
			}
		}
		if (nextTransition == null && model.getTransitionElements().size() > 0) {
			nextTransition = model.getTransitionElements().iterator().next();
		}
		if (nextTransition != null) {
			setTransition(nextTransition);
		}
	}
	
	final Adapter notifier = new AdapterImpl() {

		@Override
		public void notifyChanged(Notification msg) {
			//diagramEditor.flagDirty();
		}
		
	};
	
	protected boolean matchesSelectedTransition(TransitionElement te) {
		if (selectedTransition == null || selectedTransition.getTransition() == null || te == null || te.getTransition() == null) {
			return false;
		}
		
		Compartment source1 = selectedTransition.getTransition().getSource();
		Compartment source2 = te.getTransition().getSource();
		Compartment target1 = selectedTransition.getTransition().getTarget();
		Compartment target2 = te.getTransition().getTarget();
		
		if (source1 == null || source2 == null || target1 == null || target2 == null) {
			return false;
		}
		
		return source1.getName().equals(source2.getName()) && target1.getName().equals(target2.getName());
	}
	
	protected void setTransition(TransitionElement transition)
	{
		if (selectedTransition == transition) {
			return;
		}
		
		
		if (selectedTransition != null && selectedTransition.getTransition() != null) {
			selectedTransition.getTransition().eAdapters().remove(notifier);
		}
		
		
		selectedTransition = transition;
		if (selectedTransition != null) {
			forIncidenceViewer.getControl().setEnabled(true);
			transitionsComboViewer.setSelection(new StructuredSelection(selectedTransition));
			embeddedEditor.setTransition(transition.getTransition(), diagramEditor.getMetamodelEditingDomain());
			selectedTransition.getTransition().eAdapters().add(notifier);
//			if (selectedTransition.getTransition().getForIncidence() != null) {
//				forIncidenceViewer.setCheckedElements(new Object[] {selectedTransition.getTransition().getForIncidence()});
//			} else {
//				forIncidenceViewer.setCheckedElements(new Object[0]);
//			}
			
		} else {
			embeddedEditor.setTransition(null, null);
			forIncidenceViewer.setCheckedElements(new Object[0]);
			forIncidenceViewer.getTable().setEnabled(false);
		}
		
		refresh();
	}
	
	public void refresh()
	{
		transitionsComboViewer.refresh();
		forIncidenceViewer.refresh();
	}
	
	private static class TransitionNameLabelProvider extends LabelProvider
	{
		@Override
		public String getText(Object element) {
			if (element instanceof TransitionElement) {
				Transition t = ((TransitionElement)element).getTransition();

				String source = "?", target = "?";
				if (t != null) {
					
					if (t.getSource() != null) {
						source = t.getSource().getName();
					}
					if (t.getTarget() != null) {
						target = t.getTarget().getName();
					}
				}
				
				return source + " -> " + target;
			}
			
			return Constants.EMPTY_STRING;
		}		
	}
	
	private static class IncidenceCompartmentContentProvider implements IStructuredContentProvider {

		@Override
		public void dispose() { }

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) { }

		@Override
		public Object[] getElements(Object inputElement) {
			if (inputElement instanceof Model) {
				List<Compartment> incidenceCompartments = WizardHelper.getAllIncidenceCompartmentsForModel((Model)inputElement);
				return incidenceCompartments.toArray();
			}
			return new Object[0];
		}
	}
	
	private static class CompartmentNameLabelProvider extends LabelProvider
	{

		@Override
		public String getText(Object element) {
			if (element instanceof Compartment) {
				return ((Compartment) element).getName();
			}
			return "";
		}
		
	}
	
}
