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

import org.eclipse.stem.ui.widgets.MatrixEditorWidget.MatrixEditorValidator;
import org.eclipse.stem.ui.wizards.Messages;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class MatrixEditorDialog extends Dialog {

	private short rows, columns;
	private String [] rowNames, colNames;
	private boolean fixedSize;
	private String title;
	MatrixEditorValidator validator = null;
	boolean cancelPressed = false;
	String [] existingVals = null;
	
	public MatrixEditorDialog (Shell parent, int style, String title, short rows, short columns, String[] rownames, String [] columnNames, String [] existingVals, boolean fixedSize, MatrixEditorValidator validator) {
		super (parent, style);
		this.rows = rows;
		this.columns = columns;
		this.rowNames = rownames;
		this.colNames = columnNames;
		this.validator = validator;
		this.title = title;
		this.fixedSize = fixedSize;
		this.existingVals = existingVals;
	}
	
	/**
	 * open the modal window. 
	 * @return The String[] with results, or null if cancel was pressed.
	 */
	public String [] open () {
		Shell parent = getParent();
		final Shell shell = new Shell(parent, SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
		shell.setText(title);
		GridLayout gl = new GridLayout();
		gl.numColumns = 2;
		shell.setLayout(gl);
		
		GridData gd = new GridData();
		gd.horizontalSpan = 2;
		final MatrixEditorWidget widget = new MatrixEditorWidget(shell, SWT.NONE, rows, columns, rowNames, colNames, existingVals, fixedSize, validator);
		widget.setLayoutData(gd);
		
		final Button okayButton = new Button(shell, SWT.NONE);
		gd = new GridData();
		okayButton.setText(Messages.getString("Matrix.dialog.okay"));
		okayButton.setLayoutData(gd);
		
		Button cancelButton = new Button(shell, SWT.NONE);
		gd = new GridData();
		cancelButton.setText(Messages.getString("Matrix.dialog.cancel"));
		cancelButton.setLayoutData(gd);
		
		shell.pack();
		shell.open();
		
		
		widget.addListener(new MatrixEditorWidget.MatrixEditorListener() {
			
			public void eventReceived(MatrixEditorWidget.MatrixEditorEvent event) {
				if(event.status == MatrixEditorWidget.STATUS.INVALID_VALUE)
					okayButton.setEnabled(false);
				else okayButton.setEnabled(true);
			}
		});
		
		okayButton.addSelectionListener( new SelectionListener() {
			
			public void widgetSelected(SelectionEvent arg0) {
				cancelPressed=false;
				shell.dispose();
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		cancelButton.addSelectionListener( new SelectionListener() {
			
			public void widgetSelected(SelectionEvent arg0) {
				cancelPressed=true;
				shell.dispose();
			}
			
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		Display display = parent.getDisplay();
		while (!shell.isDisposed()) {
		if (!display.readAndDispatch()) display.sleep();
		}
		
		
		if(!cancelPressed) {
			String [] res = new String[widget.getTextValues().size()];
			int i=0;
			for(String t:widget.getTextValues()) res[i++]=t;
			return res;
		}
		return null;
	}
	
	public static void main(String [] args) {
		Display display = new Display();
	    Shell shell = new Shell(display);
	    
//	    String [] rn = {"AGE0-10", "AGE11-35","AGE36-100"};
//		String [] cn = {"AGE0-10", "AGE11-35","AGE36-100"};
		
//		MatrixEditorDialog dialog = new MatrixEditorDialog(shell, SWT.PUSH, "Enter Values", (short)3, (short)3, rn, cn, new MatrixEditorValidator() {

	    String [] cn = {"Population Group"};
		
		MatrixEditorDialog dialog  = new MatrixEditorDialog(shell, SWT.PUSH, "Enter stuff", (short)1, (short)1, null, cn, null, false, new MatrixEditorValidator() {
		
	
			public boolean validateValue(String val) {
				if(val == null || val.trim().equals("")) return true;
				try {
					Double.parseDouble(val.trim());
				} catch(NumberFormatException nfe) {
					return false;
				}
				return true;
			}

			@Override
			public boolean validateAllValues(List<Text> vals) {
				return true; // not needed here
			}
		});
			 
	    dialog.open();
	    while (!shell.isDisposed()) {
	      if (!display.readAndDispatch()) {
	        display.sleep();
	      }
	    }
	    display.dispose();
	}
	
}
