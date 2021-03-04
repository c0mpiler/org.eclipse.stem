package org.eclipse.stem.ui.widgets;

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

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.stem.core.Utility;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.ui.Activator;
import org.eclipse.stem.ui.wizards.Messages;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;

/**
 * Shows references in a dialog window to a given Identifiable.
 * 
 */

public class ShowReferencesDialog extends Dialog {

	private String title;
	XMIResource resource;
	Identifiable identifiable;
	
	public ShowReferencesDialog (Shell parent, int style, Identifiable ident, XMIResource resource, String title) {
		super (parent, style);
		this.title = title;
		this.resource = resource;
		this.identifiable = ident;
	}
	
	/**
	 * open the modal window. 
	 * @return The String[] with results, or null if cancel was pressed.
	 */
	public String  open () {
		Shell parent = getParent();
		final Shell shell = new Shell(parent, SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
		shell.setText(title);
		GridLayout gl = new GridLayout();
		gl.numColumns = 1;
		shell.setLayout(gl);
		
		GridData lgd = new GridData();
		lgd.horizontalSpan = 1;
		Label refLabel = new Label(shell, SWT.NONE);
		refLabel.setText(Messages.getString("show.references.refs.found"));
		refLabel.setLayoutData(lgd);
				
		
		Table refTable = new Table(shell, SWT.NONE);
		GridData tGD = new GridData();
		tGD.horizontalSpan = 1;
		refTable.setLayoutData(tGD);
		
		List<URI> refs = null;
		try {
			refs = Utility.findReferences(this.identifiable);
		} catch(CoreException ce) {
			Activator.logError(ce.getMessage(), ce);
		}
		if(refs != null && refs.size() > 0)
			for(URI u:refs) {
				TableItem ti = new TableItem(refTable, SWT.NONE);
				ti.setText(u.toString());
			}
		else refTable.dispose();
		
		final Button okayButton = new Button(shell, SWT.NONE);
		GridData gd = new GridData();
		gd.horizontalSpan = 1;
		okayButton.setText(Messages.getString("show.references.dialog.okay"));
		okayButton.setLayoutData(gd);
		okayButton.setEnabled(true);
		
		okayButton.addSelectionListener( new SelectionListener() {
			
			public void widgetSelected(SelectionEvent arg0) {
				shell.dispose();
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		shell.pack();
		shell.open();
		
		Display display = parent.getDisplay();
		while (!shell.isDisposed()) {
		if (!display.readAndDispatch()) display.sleep();
		}
		return null;
	}
}
