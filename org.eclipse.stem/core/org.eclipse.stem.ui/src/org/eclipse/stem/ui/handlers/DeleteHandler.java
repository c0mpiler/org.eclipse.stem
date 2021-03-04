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

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.stem.adapters.file.File;
import org.eclipse.stem.ui.Activator;
import org.eclipse.stem.ui.views.explorer.IdentifiableTreeNode;
import org.eclipse.stem.ui.widgets.RefactorWizard;
import org.eclipse.stem.ui.wizards.STEMWizardDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * This class is the top-level {@link IHandler} for the STEM Delete command
 * handlers 
 */
public class DeleteHandler extends AbstractHandler
		implements IHandler {
	
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
							"STEM Internal error delete command applied to \""
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

	/**
	 * Delete the identifiable
	 */
	protected void doit(File file, ExecutionEvent executionEvent) {
		
		// Display display = PlatformUI.getWorkbench().getDisplay();
		// Shell shell = new Shell(display);
		IWorkbenchWindow window=null;
		try {
			window = HandlerUtil.getActiveWorkbenchWindowChecked(executionEvent);
		} catch (ExecutionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		RefactorWizard refWizard = new RefactorWizard(file.getIdentifiable(), file.getResource(), true);
		refWizard.init(window.getWorkbench(), StructuredSelection.EMPTY);
		final WizardDialog wizardDialog = new STEMWizardDialog(window
				.getShell(), refWizard);
		wizardDialog.open();
	}
} //  DeleteHandler
