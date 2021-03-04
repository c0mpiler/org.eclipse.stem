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



import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.ui.Utility;
import org.eclipse.stem.ui.wizards.Messages;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;

public class IdentifiablePickerDialog extends Dialog {

	private String title;
	
	//String prevLoc = null;
	IProject project;
	
	//
	Class<?> restrictClass;
	boolean cancelPressed = false;
	protected Shell shell;
	Composite mainComposite;
	
	
	private ArrayList<Identifiable>projectObjects;
	
	private Identifiable selectedObject;
	
	public IdentifiablePickerDialog (Shell parent, int style, String title, IProject p, Class<?> restrictClass) {
		super (parent, style);
		//setShellStyle(SWT.DIALOG_TRIM | SWT.RESIZE | SWT.MAX | SWT.APPLICATION_MODAL);
		this.title = title;
		//this.prevLoc = prevLoc;
		this.project = p;
		this.restrictClass = restrictClass;
	}
	
	/**
	 * open the modal window. 
	 * @return The String[] with results, or null if cancel was pressed.
	 */
	public Object open () {
		Shell parent = getParent();
		shell = new Shell(parent, SWT.DIALOG_TRIM | SWT.MAX | SWT.APPLICATION_MODAL);
			
		GridLayout gl1 = new GridLayout();
		gl1.numColumns = 1;
		shell.setLayout(gl1);
		shell.setText(title);
		
		mainComposite = new Composite(shell, SWT.MAX);
		//mainComposite = new Composite(shell, SWT.RESIZE | SWT.MAX);
		
		
		shell.addListener(SWT.Resize, new Listener() {
		      public void handleEvent(Event e) {		        
		    	  shell.pack(); // resets the size back to the original !!
		      }
		    });
		
		GridLayout mainLayout = new GridLayout();
		mainLayout.numColumns = 2;
		
		mainComposite.setLayout(mainLayout);
		
		Label lab1 = new Label(mainComposite, SWT.NONE);
		lab1.setText(Messages.getString("IP.OBJECTS"));
		GridData gd = new GridData();
		gd.horizontalSpan = 2;
		lab1.setLayoutData(gd);
			
		final Table objectTable = new Table(mainComposite, SWT.NONE);
		GridData gd3 = new GridData();
		gd3.horizontalSpan = 2;
		gd3.grabExcessHorizontalSpace = true;
		gd3.horizontalAlignment = SWT.FILL;
		gd3.grabExcessVerticalSpace = true;
		gd3.verticalAlignment = SWT.FILL;
		objectTable.setLayoutData(gd3);
		projectObjects = getProjectObjects(null);
		for(Identifiable id:projectObjects) {
			TableItem newRow= new TableItem(objectTable, SWT.NONE);
			newRow.setText(id.getURI().lastSegment());
		}
					
		
		Button cancelButton = new Button(mainComposite, SWT.NONE);
		GridData cg = new GridData();
		cancelButton.setText(Messages.getString("NLocWizCancel"));
		cancelButton.setLayoutData(cg);
	
		final Button okayButton = new Button(mainComposite, SWT.NONE);
		GridData okg = new GridData();
		okayButton.setText(Messages.getString("NLocWizOk"));
		okayButton.setLayoutData(okg);
		okayButton.setEnabled(false);
	
		objectTable.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent e) {
				int index = objectTable.getSelectionIndex();
				selectedObject = projectObjects.get(index);
				okayButton.setEnabled(true);
			}
			
			public void widgetDefaultSelected(SelectionEvent e) {
				okayButton.setEnabled(false);
			}
		});

		// getShell().pack();
		shell.pack();
		shell.open();
		
		
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
		if(cancelPressed) return null;
		Object ret = selectedObject;
		return ret;
	}// open()	

	
	/**
	 * Traverse the project and retrieve all objects restricted to the specified class
	 * 
	 * @param folder Folder, or null for project root.
	 * @return ArrayList<Object> matchingObjects
	 */
	private ArrayList<Identifiable> getProjectObjects(IFolder folder) {
		ArrayList<Identifiable>result = new ArrayList<Identifiable>();
		try {
			
			IResource [] resources = null;
			if(folder == null) resources = project.members();
			else resources = folder.members();
			
			for(IResource re:resources) {
				if(re instanceof IFolder && !re.getName().equals("Recorded Simulations"))
					result.addAll(getProjectObjects((IFolder) re));
				else if(re instanceof IFile && !re.getResourceAttributes().isHidden() && !re.getName().startsWith(".")){
					// Retrieve identifiable
					
					Identifiable ident = Utility.getIdentifiableIgnoreException((IFile)re);
					if(ident != null && isClass(ident.getClass(), this.restrictClass))
						result.add(ident);
				}
			}
		
		} catch (CoreException e) { 
			e.printStackTrace();
		}
		return result;
	}
	
	private boolean isClass(Class<?> c, Class<?> target) {
		if(target.equals(c)) return true;
		Class<?> superC = c.getSuperclass();
		if(superC == null) return false;
		return isClass(superC, target);
	}
}