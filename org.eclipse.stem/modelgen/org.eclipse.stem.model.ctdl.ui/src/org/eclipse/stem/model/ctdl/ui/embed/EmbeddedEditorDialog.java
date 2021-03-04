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
package org.eclipse.stem.model.ctdl.ui.embed;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.stem.model.metamodel.Package;
import org.eclipse.stem.model.metamodel.Transition;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;

public class EmbeddedEditorDialog extends Dialog
{
	Shell shell;
	
	public EmbeddedEditorDialog(Shell parent, int style) {
		super(parent, style);		
		
	}
	
	public boolean open()
	{
		
		Shell parent = getParent();
		shell = new Shell(parent, SWT.DIALOG_TRIM | SWT.MAX | SWT.APPLICATION_MODAL);
		
		shell.setMinimumSize( new Point(600, 400));
		shell.setLayout(new FillLayout());
		shell.setText("Xtext Editor Embed");
		
		shell.addListener(SWT.Resize, new Listener() {
		      public void handleEvent(Event e) {
		      }
		    });
		
		
		createLayout();
		
		shell.pack();
		shell.open();

		Display display = parent.getDisplay();
		while (!shell.isDisposed()) {
		if (!display.readAndDispatch()) display.sleep();
		}
		return true;
		
	}


	private void createLayout()
	{
		Composite page = new Composite(shell, SWT.NONE);
		page.setLayout(new FillLayout());
		
		List<Transition> transitions = getTransitionsFromFirstModel(loadMetamodel());
		EmbeddedExpressionEditorComposite editor = new EmbeddedExpressionEditorComposite(page, SWT.NONE);
		if (transitions != null && transitions.size() > 0) {
			editor.setTransition(transitions.get(0));
		}
		
		
	}
	
	private List<Transition> getTransitionsFromFirstModel(Package pkg)
	{
		
		if (pkg != null && pkg.getModels().size() > 0) {
			return pkg.getModels().get(0).getTransitions();
		}
		return null;
	}
	
	private Package loadMetamodel()
	{
		String uri = "platform:/resource/org.eclipse.stem.dm.example1/model/example1.metamodel";
		
		
		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.createResource(URI.createURI(uri));
		
		try {
			r.load(Collections.emptyMap());
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		Package pkg = null;
		if (r.getContents().size() > 0) {
			pkg = (Package)r.getContents().get(0);
		}
		return pkg;
		
	}

//	private String getDocument()
//	{
//		try {
//			URI u = URI.createURI("platform:/resource/org.eclipse.stem.");
//			URIConverter conv = new ExtensibleURIConverterImpl();
//			InputStream is = conv.createInputStream(u);
//	
//			ByteArrayOutputStream baos = new ByteArrayOutputStream();
//			
//			byte[] buf = new byte[256];
//			
//			while (is.read(buf) > -1) {
//				baos.write(buf);
//			}
//			
//			return new String(baos.toByteArray());
//		} catch (Exception e) {
//			e.printStackTrace();
//			return "";
//		}
//	}
	
}
