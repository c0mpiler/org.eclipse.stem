// STEMExecutionCommandHandler.java
package org.eclipse.stem.ui.handlers;

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

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.stem.adapters.file.File;
import org.eclipse.stem.core.Utility;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.ui.Activator;
import org.eclipse.stem.ui.views.explorer.IdentifiableTreeNode;
import org.eclipse.stem.ui.widgets.RefactorWizard;
import org.eclipse.stem.ui.widgets.ShowReferencesDialog;
import org.eclipse.stem.ui.wizards.Messages;
import org.eclipse.stem.ui.wizards.STEMWizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * This class is the top-level {@link IHandler} for the STEM Rename command
 * handlers 
 */
public abstract class RefactorHandler extends AbstractHandler
		implements IHandler {
	
	private static String COPY_PREFIX = "CopyOf";
	
	/**
	 * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	public Object execute(final ExecutionEvent executionEvent)
			throws ExecutionException {

		
		final ISelection selection = HandlerUtil
				.getCurrentSelectionChecked(executionEvent);
		
		// Structured Selection?
		if (selection instanceof StructuredSelection) {
			// Yes
			// Iterate through everything that's in the selection and put each
			// object into the appropriate collection.
			for (final Object obj : ((StructuredSelection) selection).toList()) {
				// IExecutable executable = (IExecutable) ExecutableAdapterFactory.INSTANCE
				// .adapt(obj, IExecutable.class);
				
				File file = (File) Platform
				.getAdapterManager().getAdapter(obj, File.class); 
		
				
				// Were we successful in adapting?
				if (file != null) {
					// Yes
					doit(file, executionEvent);
				} // if
				else {
					// Internal error
					Activator.logError(
							"STEM Internal error rename command applied to \""
									+ obj.getClass().getName() + "\"", null);
				}
			} // for each selection
		} // if StructuredSelection

		if(selection instanceof TreeSelection) {
			TreeSelection ts = (TreeSelection)selection;
			TreePath[] paths =  ts.getPaths();
			if(paths.length > 0) {
				TreePath parent = paths[0].getParentPath();
				Object parentSeg = parent.getLastSegment();
				if(parentSeg != null) {
					IProject project = null;
					if(parentSeg instanceof IdentifiableTreeNode) { 
						project =((IdentifiableTreeNode)parentSeg).getProject();
					} if(parentSeg instanceof IProject) project = (IProject)parentSeg;
					
					try {
						project.refreshLocal(IResource.DEPTH_INFINITE, null);
					} catch(Exception e) {
						Activator.logError(e.getMessage(), e);
					}
				}
			}
			
		}
		
		return null;
	} // execute

	
	abstract void doit(File file,final ExecutionEvent executionEvent);
	
	public static class RenameHandler  extends RefactorHandler {
		protected void doit(File file,final ExecutionEvent executionEvent) {
			// Display display = PlatformUI.getWorkbench().getDisplay();
			// Shell shell = new Shell(display);
			IWorkbenchWindow window=null;
			try {
				window = HandlerUtil.getActiveWorkbenchWindowChecked(executionEvent);
			} catch (ExecutionException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			RefactorWizard refWizard = new RefactorWizard(file.getIdentifiable(), file.getResource(), false);
			refWizard.init(window.getWorkbench(), StructuredSelection.EMPTY);
			final WizardDialog wizardDialog = new STEMWizardDialog(window
					.getShell(), refWizard);
			wizardDialog.open();
		}
	}
	
	public static class CopyHandler  extends RefactorHandler {
		protected void doit(File file,final ExecutionEvent executionEvent) {
			String newname = COPY_PREFIX+file.getIdentifiable().getURI().lastSegment();
			if(newname != null) {
				XMIResource resource = file.getResource();
				URI oldURI = resource.getURI();
				URI oldIdURI = file.getIdentifiable().getURI();
				String s_newURI = oldURI.toString().substring(0, oldURI.toString().indexOf(oldURI.lastSegment()));
				String s_newIdURI = oldIdURI.toString().substring(0, oldIdURI.toString().indexOf(oldIdURI.lastSegment()));
				
				
				URI newURI = URI.createURI(s_newURI+newname);
				URI newIDURI = URI.createURI(s_newIdURI+newname);
				
				try {
					ArrayList<Identifiable>newlist = new ArrayList<Identifiable>();
					Identifiable e = (Identifiable)EcoreUtil.copy(file.getIdentifiable());
					e.setURI(newIDURI);
					newlist.add(e);
					Utility.serializeIdentifiables(newlist, newURI);
				} catch(Exception e) {
					Activator.logError(e.getMessage(), e);
				}
			}
		}
	}
	
	/**
	 * 
	 * @author jhkauf
	 *
	 */
	public static class ShowReferencesHandler  extends RefactorHandler {
		@SuppressWarnings("unused")
		protected void doit(File file,final ExecutionEvent executionEvent) {
			Display display = PlatformUI.getWorkbench().getDisplay();
			Shell shell = new Shell(display);
			IWorkbenchWindow window=null;
			try {
				window = HandlerUtil.getActiveWorkbenchWindowChecked(executionEvent);
			} catch (ExecutionException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			ShowReferencesDialog showRefDialog = new ShowReferencesDialog(shell, SWT.NONE, file.getIdentifiable(), file.getResource(), Messages.getString("show.references.dialog.title"));
			
			showRefDialog.open();
		}
	}
} //  RefactorHandler
