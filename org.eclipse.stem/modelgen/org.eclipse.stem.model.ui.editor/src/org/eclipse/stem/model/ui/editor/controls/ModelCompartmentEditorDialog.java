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

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.stem.model.metamodel.Compartment;
import org.eclipse.stem.model.metamodel.CompartmentGroup;
import org.eclipse.stem.model.metamodel.CompartmentType;
import org.eclipse.stem.model.ui.Constants;
import org.eclipse.stem.model.ui.editor.VisualModelUtils;
import org.eclipse.stem.model.ui.wizards.WizardHelper;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class ModelCompartmentEditorDialog extends Dialog {
	protected Text nameText;
	protected ComboViewer dataTypeComboViewer, compartmentTypeComboViewer;

	protected Compartment compartment;
	protected CompartmentGroup compartmentGroup;

	protected String errorMessage = null;

	public ModelCompartmentEditorDialog(Shell parentShell, int style,
			CompartmentGroup compartmentGroup, Compartment compartment) {
		super(parentShell);
		this.compartment = compartment;
		this.compartmentGroup = compartmentGroup;
	}

	public void create() {
		super.create();

		nameText.setText(VisualModelUtils.safeGet(compartment.getName()));

		EDataType selectedDataType = compartment.getDataType();
		if (selectedDataType == null) {
			selectedDataType = VisualModelUtils
					.getDefaultCompartmentDataTypes()[0];
		}

		dataTypeComboViewer.setSelection(new StructuredSelection(
				selectedDataType));

		CompartmentType selectedCompartmentType = compartment.getType();
		if (selectedCompartmentType == null) {
			selectedCompartmentType = CompartmentType.values()[0];
		}
		compartmentTypeComboViewer.setSelection(new StructuredSelection(
				selectedCompartmentType));
	}

	protected Control createDialogArea(Composite parent) {
		parent.setLayout(new GridLayout(2, false));
		Composite container = new Composite(parent, SWT.NONE);
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		data.grabExcessHorizontalSpace = true;
		data.horizontalSpan = 2;
		container.setLayoutData(data);
		container.setLayout(new GridLayout(2, false));

		Label nameLabel = new Label(container, SWT.NONE);
		nameLabel.setText("Name");

		nameText = new Text(container, SWT.BORDER);
		nameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		nameText.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				formatTextFields();
			}

			@Override
			public void focusGained(FocusEvent e) {
			}
		});

		createCompartmentTypeList(container);
		createDataTypeList(container);

		return parent;
	}

	private void createCompartmentTypeList(Composite container) {
		Label dataTypeLabel = new Label(container, SWT.NONE);
		dataTypeLabel.setText("Compartment Type");

		compartmentTypeComboViewer = new ComboViewer(container, SWT.READ_ONLY);

		compartmentTypeComboViewer.setContentProvider(ArrayContentProvider
				.getInstance());
		compartmentTypeComboViewer
				.setLabelProvider(new EMFDataTypeLabelProvider());

		compartmentTypeComboViewer.setInput(CompartmentType.values());

	}

	private void createDataTypeList(Composite container) {
		Label dataTypeLabel = new Label(container, SWT.NONE);
		dataTypeLabel.setText("Data Type");

		dataTypeComboViewer = new ComboViewer(container, SWT.READ_ONLY);

		dataTypeComboViewer.setContentProvider(ArrayContentProvider
				.getInstance());
		dataTypeComboViewer.setLabelProvider(new EMFDataTypeLabelProvider());

		dataTypeComboViewer.setInput(WizardHelper
				.getDefaultCompartmentDataTypes());

		dataTypeComboViewer.getCombo().setLayoutData(
				new GridData(GridData.FILL_HORIZONTAL));
	}

	protected void formatTextFields() {
		nameText.setText(WizardHelper.formatToCamelCase(nameText.getText()));
	}

	protected boolean validate() {
		if (WizardHelper.isNullOrEmpty(nameText.getText())) {
			errorMessage = "Please enter a name for this compartment";
			return false;
		}

		if (hasNameConflict()) {
			errorMessage = "A compartment named \"" + nameText.getText()
					+ "\" already exists in this model.";
			return false;
		}

		return true;
	}

	private boolean hasNameConflict() {
		for (Compartment compartment : WizardHelper
				.getAllCompartmentsForGroup(compartmentGroup)) {
			if (this.compartment != compartment
					&& compartment.getName().equals(nameText.getText())) {
				return true;
			}
		}
		return false;
	}

	@Override
	protected void okPressed() {
		formatTextFields();
		if (validate()) {
			compartment.setName(WizardHelper.safeGet(nameText.getText()));
			compartment
					.setType((CompartmentType) ((StructuredSelection) compartmentTypeComboViewer
							.getSelection()).getFirstElement());
			compartment
					.setDataType((EDataType) ((StructuredSelection) dataTypeComboViewer
							.getSelection()).getFirstElement());
			super.okPressed();
		} else {
			MessageDialog.openError(getShell(), "Error", errorMessage);
		}
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	private static class EMFDataTypeLabelProvider extends LabelProvider {
		@Override
		public String getText(Object element) {
			if (element instanceof Enumerator) {
				return ((Enumerator) element).getLiteral();
			}

			if (element instanceof EDataType) {
				return ((EDataType) element).getInstanceClassName();
			}

			return Constants.EMPTY_STRING;
		}
	}

}
