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

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.stem.model.ui.editor.ModelDiagramEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;

public class VisualEditorComposite extends Composite implements ISelectionListener, ISelectionChangedListener
{
	VisualEditorToolbar toolbarComposite;
	VisualEditorCanvas canvasComposite;
	TransitionEditorComposite expressionEditor;
	
	public VisualEditorComposite(ModelDiagramEditor editor, Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(1,true));	
		
		// Set the top toolbar controls
		toolbarComposite = new VisualEditorToolbar(editor, this, style);
		toolbarComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		SashForm separator = new SashForm(this, SWT.VERTICAL);
		separator.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		// Setup the canvas for the GEF editor controls
		canvasComposite = new VisualEditorCanvas(editor, separator, style);
		CTabFolder editorTabs = new CTabFolder(separator, SWT.NONE);
		editorTabs.setUnselectedCloseVisible(false);

		separator.setWeights(new int[] {60,40});
		separator.setSashWidth(5);		
		
//		CTabItem modelEditorTab = new CTabItem(editorTabs, SWT.NONE);
//		modelEditorTab.setText("Model Properties");
//		CTabItem compartmentEditorTab = new CTabItem(editorTabs, SWT.NONE);
//		compartmentEditorTab.setText("Compartment Properties");
		CTabItem expressionEditorTab = new CTabItem(editorTabs, SWT.NONE);
		expressionEditorTab.setText("Expression Editor");
		
//		ModelPropertiesComposite modelPropertiesEditor = new ModelPropertiesComposite(editor, editorTabs, SWT.NONE);
//		modelEditorTab.setControl(modelPropertiesEditor);
		
		expressionEditor = new TransitionEditorComposite(editor, editorTabs, SWT.NONE);
		expressionEditorTab.setControl(expressionEditor);
		
		editorTabs.setSelection(expressionEditorTab);
		
		editor.getEditorSite().getPage().addSelectionListener(this);
	}

	public void dispose() {
		toolbarComposite.dispose();
		canvasComposite.dispose();
		expressionEditor.dispose();
		super.dispose();
	}
	
	public void inputChanged() {
		toolbarComposite.setInput();
	}
	
	public VisualEditorToolbar getToolbarComposite()
	{
		return toolbarComposite;
	}
	
	public VisualEditorCanvas getCanvasComposite()
	{
		return canvasComposite;
	}

	@Override
	public void selectionChanged(SelectionChangedEvent event) {
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
	}

}
