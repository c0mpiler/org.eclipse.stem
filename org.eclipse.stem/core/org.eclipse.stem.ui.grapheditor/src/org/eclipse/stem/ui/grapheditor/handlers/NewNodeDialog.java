/******************************************************************************* 
 * Copyright (c) 2012 Bundesinstitut f�r Risikobewertung. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     Bundesinstitut f�r Risikobewertung - initial API and implementation 
 *******************************************************************************/

package org.eclipse.stem.ui.grapheditor.handlers;

import org.eclipse.stem.ui.grapheditor.GraphEditorMessages;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;

public class NewNodeDialog implements SelectionListener, ModifyListener {

	private String identifier;

	private double size;

	private Shell shell;

	private Text identifierText;

	private Text sizeText;

	private Button okButton;

	private Button cancelButton;

	public NewNodeDialog(Shell parent) {
		shell = new Shell(parent, SWT.TITLE | SWT.BORDER | SWT.PRIMARY_MODAL);
		shell.setText(GraphEditorMessages.getString("newNodeDialog"));
		shell.setLayout(new GridLayout(3, false));

		Label identifierLabel = new Label(shell, SWT.NONE);
		identifierLabel.setText(GraphEditorMessages.getString("identifier")
				+ ":");
		identifierLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true));

		identifierText = new Text(shell, SWT.BORDER);
		identifierText.setText("");
		identifierText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 2, 1));
		identifierText.addModifyListener(this);

		Label inputLabel = new Label(shell, SWT.NONE);
		inputLabel.setText(GraphEditorMessages.getString("nodeSize") + ":");
		inputLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		sizeText = new Text(shell, SWT.BORDER);
		sizeText.setText("1.0");
		sizeText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2,
				1));
		sizeText.addModifyListener(this);

		Label noLabel = new Label(shell, SWT.NONE);
		noLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		okButton = new Button(shell, SWT.NONE);
		okButton.setText(GraphEditorMessages.getString("ok"));
		okButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		okButton.addSelectionListener(this);
		okButton.setEnabled(false);

		cancelButton = new Button(shell, SWT.NONE);
		cancelButton.setText(GraphEditorMessages.getString("cancel"));
		cancelButton
				.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		cancelButton.addSelectionListener(this);

		shell.pack();
		shell.open();

		while (!shell.isDisposed()) {
			while (!PlatformUI.getWorkbench().getDisplay()
					.readAndDispatch()) {
				PlatformUI.getWorkbench().getDisplay().sleep();
			}
		}
	}

	public boolean hasResult() {
		return identifier != null && !Double.isNaN(size);
	}

	public String getIdentifier() {
		return identifier;
	}

	public double getSize() {
		return size;
	}

	public void widgetSelected(SelectionEvent e) {
		if (e.getSource() == okButton) {
			identifier = identifierText.getText();
			size = Double.parseDouble(sizeText.getText());
		} else if (e.getSource() == cancelButton) {
			identifier = null;
			size = Double.NaN;
		}

		shell.close();
	}

	public void widgetDefaultSelected(SelectionEvent e) {
	}

	public void modifyText(ModifyEvent e) {
		boolean correctInput = true;

		try {
			double value = Double.parseDouble(sizeText.getText());

			if (value < 0.0) {
				correctInput = false;
			}
		} catch (NumberFormatException ex) {
			correctInput = false;
		}

		if (identifierText.getText().isEmpty()) {
			correctInput = false;
		}

		okButton.setEnabled(correctInput);
	}

}
