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
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.stem.model.ctdl.ui.embed.EmbeddedExpressionEditorComposite;
import org.eclipse.stem.model.metamodel.MetamodelFactory;
import org.eclipse.stem.model.metamodel.Model;
import org.eclipse.stem.model.metamodel.Transition;
import org.eclipse.stem.model.ui.Constants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class ModelTransitionsPage extends WizardPage
{
	protected EmbeddedExpressionEditorComposite editor;
	protected Composite container;
	protected ComboViewer transitionsComboViewer;
	protected Button addTransitionButton, editTransitionButton, removeTransitionButton;
	protected Label transitionsInformationLabel;
	protected Model model;
	
	public ModelTransitionsPage(Model model) {
		super("Model Transitions");
		setTitle("Model Compartment Transitions");
		setDescription("Define the transitions between compartments for your model");

		this.model = model;
	}

	@Override
	public void createControl(Composite parent) 
	{
		container = new Composite(parent, SWT.NULL);
		container.setLayout(new GridLayout(3, false));
		
		transitionsInformationLabel = new Label(container, SWT.NONE);
		transitionsInformationLabel.setText("Define the transitions and expressions for the model compartments");
		
		GridData labelGridData = new GridData(GridData.FILL);
		labelGridData.horizontalSpan = 3;
		transitionsInformationLabel.setLayoutData(labelGridData);
				
		
		createTransitionViewer(container);
		createExpressionEditor(container);
		
		setControl(container);
	}
	
	protected void createTransitionViewer(Composite parent)
	{
		Label dataTypeLabel = new Label(parent, SWT.NONE);
		dataTypeLabel.setText("Transition");
		
		transitionsComboViewer = new ComboViewer(parent, SWT.READ_ONLY);
		transitionsComboViewer.getCombo().setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		transitionsComboViewer.setContentProvider(ArrayContentProvider.getInstance());
		transitionsComboViewer.setLabelProvider(new TransitionsNameLabelProvider());
		transitionsComboViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				// Change what's displayed in editor
				selectTransition();
			}
		});
		
		transitionsComboViewer.setInput(model.getTransitions());
		
		Composite transitionsButtonComposite = new Composite(parent, SWT.NONE);
		GridLayout transitionButtonCompositeLayout = new GridLayout(3,false);
		transitionButtonCompositeLayout.horizontalSpacing = 2;
		transitionsButtonComposite.setLayout(transitionButtonCompositeLayout);
		addTransitionButton = new Button(transitionsButtonComposite, SWT.PUSH);
		addTransitionButton.setText("Add");
		addTransitionButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				addTransition();
			}
			
		});
		
		editTransitionButton = new Button(transitionsButtonComposite, SWT.PUSH);
		editTransitionButton.setText("Edit");
		editTransitionButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				editTransition();
			}
			
		});
		
		removeTransitionButton = new Button(transitionsButtonComposite, SWT.PUSH);
		removeTransitionButton.setText("Remove");
		removeTransitionButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				removeTransition();
			}
			
		});
		
		transitionsButtonComposite.pack();
	}
	
	private Transition openTransitionEditorDialog(final Transition previousTransition)
	{
		Transition transitionToUse = null;
		if (previousTransition == null) {
			transitionToUse = MetamodelFactory.eINSTANCE.createTransition();
		} else {
			transitionToUse = EcoreUtil.copy(previousTransition);
		}
		TransitionEditorDialog editorDialog = new TransitionEditorDialog(
				getShell(), SWT.NONE,
				model, transitionToUse, previousTransition);
		
		if (editorDialog.open() == Window.OK) {
			return transitionToUse;
		}
		
		return null;
	}
	
	private void addTransition()
	{
		Transition transition = openTransitionEditorDialog(null);
		if (transition != null) {
			model.getTransitions().add(transition);
			transitionsComboViewer.refresh();
			setSelectedTransition(transition);
		}
	}
	
	private void editTransition()
	{
		Transition selected = getSelectedTransition();
		if (selected != null) {
			Transition previous = selected;
			Transition edited = openTransitionEditorDialog(previous);
			if (edited != null) {
				Collections.replaceAll(model.getTransitions(), previous, edited);
				transitionsComboViewer.refresh();
				setSelectedTransition(edited);
			}

		}
	}
	
	private void removeTransition()
	{
		Transition selected = getSelectedTransition();
		if (selected != null) {
			model.getTransitions().remove(selected);
			transitionsComboViewer.refresh();
		}
	}
	
	protected void selectTransition()
	{
		editor.setTransition(getSelectedTransition());
	}
	
	private void setSelectedTransition(Transition transition)
	{
		transitionsComboViewer.setSelection(new StructuredSelection(transition));
	}
	
	private Transition getSelectedTransition()
	{
		return (Transition) ((StructuredSelection)transitionsComboViewer.getSelection()).getFirstElement();
	}
	
	protected void createExpressionEditor(Composite parent)
	{
		editor = new EmbeddedExpressionEditorComposite(parent, SWT.NONE);
		GridData editorData = new GridData(GridData.FILL_BOTH);
		editorData.horizontalSpan = 3;
		editor.setLayoutData(editorData);
		//editor.setEnabled(false);
	}
	
	boolean validatePage()
	{
		editor.verifySaveChanges();
		return true;
	}
	
	private static class TransitionsNameLabelProvider extends LabelProvider
	{
		@Override
		public String getText(Object element) {
			if (element instanceof Transition) {
				Transition t = (Transition)element;
				return t.getSource().getName() + " -> " + t.getTarget().getName();
			}
			
			return Constants.EMPTY_STRING;
		}		
	}

}
