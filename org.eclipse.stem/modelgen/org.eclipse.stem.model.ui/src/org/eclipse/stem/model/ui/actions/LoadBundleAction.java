package org.eclipse.stem.model.ui.actions;

import java.util.Iterator;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.stem.model.ui.MetamodelEditorPlugin;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;

public class LoadBundleAction implements IObjectActionDelegate {


		private ISelection selection;

		public void run(IAction action) {
			if (selection instanceof IStructuredSelection) {
				for (Iterator<?> it = ((IStructuredSelection) selection).iterator(); it.hasNext();) {
					Object element = it.next();
					IProject project = null;
					if (element instanceof IProject) {
						project = (IProject) element;
					} else if (element instanceof IAdaptable) {
						project = (IProject) ((IAdaptable) element).getAdapter(IProject.class);
					}
					if (project != null) {
						installBundle(project);
					}
				}
			}
		}

		public void selectionChanged(IAction action, ISelection selection) {
			this.selection = selection;
		}

		public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		}
		
		protected void installBundle(IProject project)
		{
			System.out.println("Installing bundle from project "+ project.getName());
			
			BundleContext ctx = MetamodelEditorPlugin.getPlugin().getBundle().getBundleContext();
			
			Bundle b = Platform.getBundle(project.getName());
			if (b == null) {
				Bundle newBundle = null;
				try {
					newBundle = ctx.installBundle(project.getLocationURI().toString());
					newBundle.start();
				} catch (BundleException e) {
					
					if (newBundle != null) {
						try {
							System.err.println("Install and/or start failed, trying to uninstall.");
							newBundle.uninstall();
						} catch (BundleException e2) {
							
						}
					}
					IStatus status = new Status(Status.ERROR, project.getName(), "Error installing into OSGi container", e);
					
					ErrorDialog.openError(Display.getDefault().getActiveShell(), "Error", 
							"Error installing the project "+project.getName()+" into the OSGi constainer", status);
					
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}
		}


}
