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

import java.util.List;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.stem.model.metamodel.Compartment;
import org.eclipse.stem.model.metamodel.Model;
import org.eclipse.stem.model.metamodel.Transition;
import org.eclipse.stem.model.ui.Constants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class TransitionEditorDialog extends Dialog
{
	protected ComboViewer sourceCompartmentComboViewer, targetCompartmentComboViewer, incidenceCompartmentComboViewer;
	
	protected Transition transition, originalTransition;
	protected Model parentModel;
	
	protected String errorMessage = null;
	
	public TransitionEditorDialog(Shell parentShell, int style, Model model, Transition transition, Transition originalTransition) 
	{
		super(parentShell);
		this.transition = transition;
		this.originalTransition = originalTransition;
		this.parentModel = model;
	}
	
	public void create()
	{
		super.create();

		if (transition.getSource() != null) {
			sourceCompartmentComboViewer.setSelection(new StructuredSelection(transition.getSource()));
		}
		
		if (transition.getTarget() != null) {
			targetCompartmentComboViewer.setSelection(new StructuredSelection(transition.getTarget()));
		}
		
		if (transition.getForIncidence() != null) {
			incidenceCompartmentComboViewer.setSelection(new StructuredSelection(transition.getForIncidence()));
		}
	}

	protected Control createDialogArea(Composite parent) 
	{	
		Composite container = new Composite(parent, SWT.NONE);
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		data.grabExcessHorizontalSpace = true;
		data.horizontalSpan = 1;
		container.setLayoutData(data);
		container.setLayout(new GridLayout(2, false));

//		Label descriptionLabel = new Label(container, SWT.NONE);
//		GridData descriptionData = new GridData();
//		descriptionData.horizontalSpan = 3;
//		descriptionLabel.setData(descriptionData);
//		descriptionLabel.setText("Select a source and target compartment to create a transition");

		createCompartmentViewers(container);

		return parent;
	}
		
	private void createCompartmentViewers(Composite container)
	{
		Label sourceCompartmentLabel = new Label(container, SWT.NONE);
		sourceCompartmentLabel.setText("Source Compartment");
		
		sourceCompartmentComboViewer = new ComboViewer(container, SWT.READ_ONLY);
		sourceCompartmentComboViewer.setContentProvider(ArrayContentProvider.getInstance());
		sourceCompartmentComboViewer.setLabelProvider(new CompartmentNameLabelProvider());
		sourceCompartmentComboViewer.setInput(WizardHelper.getAllCompartmentsForModel(parentModel));
		
		Label targetCompartmentLabel = new Label(container, SWT.NONE);
		targetCompartmentLabel.setText("Target Compartment");
		
		targetCompartmentComboViewer = new ComboViewer(container, SWT.READ_ONLY);
		targetCompartmentComboViewer.setContentProvider(ArrayContentProvider.getInstance());
		targetCompartmentComboViewer.setLabelProvider(new CompartmentNameLabelProvider());
		targetCompartmentComboViewer.setInput(WizardHelper.getAllCompartmentsForModel(parentModel));
		
		Label incidenceForLabel = new Label(container, SWT.NONE);
		incidenceForLabel.setText("For Incidence");
		
		List<Compartment> incidenceCompartments = WizardHelper.getAllIncidenceCompartmentsForModel(parentModel);
		//incidenceCompartments.add(0, null);
		
		incidenceCompartmentComboViewer = new ComboViewer(container, SWT.READ_ONLY);
		incidenceCompartmentComboViewer.setContentProvider(ArrayContentProvider.getInstance());
		incidenceCompartmentComboViewer.setLabelProvider(new CompartmentNameLabelProvider(false));
		incidenceCompartmentComboViewer.setInput(incidenceCompartments);
		incidenceCompartmentComboViewer.getCombo().setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	}

	protected boolean validate()
	{
		if (getSelectedSourceCompartment() == null || getSelectedTargetCompartment() == null) {
			errorMessage = "Please select a source and target compartment for this transition";
			return false;
		}
		
		if (hasSourceTargetConflict()) {
			errorMessage = "A transition already exists for the selected source-target pair.";
			return false;
		}
		
		return true;
	}
	
	protected Compartment getSelectedSourceCompartment() 
	{
		return (Compartment)((StructuredSelection)sourceCompartmentComboViewer.getSelection()).getFirstElement();
	}
	
	protected Compartment getSelectedTargetCompartment() 
	{
		return (Compartment)((StructuredSelection)targetCompartmentComboViewer.getSelection()).getFirstElement();
	}
	
	protected Compartment getSelectedIncidenceCompartment() 
	{
		Object obj = ((StructuredSelection)incidenceCompartmentComboViewer.getSelection()).getFirstElement();
		if (obj == null) {
			return null;
		}
		return (Compartment)obj;
	}
	
	private boolean hasSourceTargetConflict()
	{
		if (originalTransition != null && 
				originalTransition.getSource() == getSelectedSourceCompartment() &&
				originalTransition.getTarget() == getSelectedTargetCompartment()) {
			return false;
		}
			
		for (Transition existingTransition : parentModel.getTransitions()) {
			if (existingTransition.getSource() == getSelectedSourceCompartment() && 
					existingTransition.getTarget() == getSelectedTargetCompartment()) {
				return true;
			}
		}
		return false;
	}

	@Override
	protected void okPressed() 
	{
		if (validate()) {
			Compartment source = getSelectedSourceCompartment();
			Compartment target = getSelectedTargetCompartment();
			transition.setName(source.getName() + " -> "+ target.getName());
			transition.setSource(source);
			transition.setTarget(target);
			transition.getForIncidence().clear();
			transition.getForIncidence().add(getSelectedIncidenceCompartment());
			super.okPressed();
		} else {
			MessageDialog.openError(getShell(), "Error", errorMessage);
		}
	}

	@Override
	protected boolean isResizable() {
		return true;
	}
	
	private static class CompartmentNameLabelProvider extends LabelProvider
	{
		boolean showType = true;
		CompartmentNameLabelProvider()
		{
			
		}
		
		CompartmentNameLabelProvider(boolean showType)
		{
			this.showType = showType;
		}
		
		@Override
		public String getText(Object element) {
			if (element instanceof Compartment) {
				Compartment c = (Compartment)element;
				String s =  c.getName();
				if (showType) {
					s = s + " ("+ c.getType() +")";
				}
				return s;
			}
			
			return Constants.EMPTY_STRING;
		}
		
	}

}
