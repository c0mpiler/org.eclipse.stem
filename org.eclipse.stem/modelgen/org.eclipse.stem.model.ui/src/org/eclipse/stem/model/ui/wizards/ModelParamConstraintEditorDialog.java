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

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.stem.model.metamodel.ModelParam;
import org.eclipse.stem.model.metamodel.ModelParamConstraint;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class ModelParamConstraintEditorDialog extends Dialog
{
	ModelParam param;
	ModelParamConstraint constraint;
	Text valueText;
	ComboViewer nameViewer;

	public ModelParamConstraintEditorDialog(Shell parentShell, int style, ModelParam param, ModelParamConstraint constraint) 
	{
		super(parentShell);
		this.param = param;
		this.constraint = constraint;
	}
	
	public void create()
	{
		super.create();
		
		valueText.setText(WizardHelper.safeGet(constraint.getConstraint()));
		
		String selectedConstraint = constraint.getName();
		if (selectedConstraint == null) {
			String[] constraints = WizardHelper.getAvailableConstraints(param, constraint);
			if (constraints != null && constraints.length > 0) {
				selectedConstraint = constraints[0];
			}
		}
		
		if (selectedConstraint != null) {
			nameViewer.setSelection(new StructuredSelection(selectedConstraint));
		}
	}

	protected Control createDialogArea(Composite parent) 
	{	
		parent.setLayout( new GridLayout(2, false));
		Composite container = new Composite(parent, SWT.NONE);
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		data.grabExcessHorizontalSpace = true;
		data.horizontalSpan = 2;
		container.setLayoutData(data);
		container.setLayout(new GridLayout(2, false));

		createConstraintNameList(container);
		
		Label nameLabel = new Label(container, SWT.NONE);
		nameLabel.setText("Constraint Value");

		valueText = new Text(container, SWT.BORDER);
		valueText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		

		return parent;
	}
		
	private void createConstraintNameList(Composite container)
	{
		Label dataTypeLabel = new Label(container, SWT.NONE);
		dataTypeLabel.setText("Constraint Type");
		
		nameViewer = new ComboViewer(container, SWT.READ_ONLY);
		nameViewer.getCombo().setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		nameViewer.setContentProvider(ArrayContentProvider.getInstance());
		nameViewer.setLabelProvider(new LabelProvider());
		nameViewer.setInput(WizardHelper.getAvailableConstraints(param,constraint));
	}
	
	protected boolean validate()
	{
		return true;
	}

	@Override
	protected void okPressed() 
	{
		if (validate()) {
			constraint.setName((String)((StructuredSelection)nameViewer.getSelection()).getFirstElement());
			constraint.setConstraint(WizardHelper.safeGet(valueText));
			super.okPressed();
		}
	}

	@Override
	protected boolean isResizable() {
		return true;
	}
	

}
