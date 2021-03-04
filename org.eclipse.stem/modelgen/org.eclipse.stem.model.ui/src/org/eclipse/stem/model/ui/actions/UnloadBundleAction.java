package org.eclipse.stem.model.ui.actions;

import java.util.Iterator;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleException;

public class UnloadBundleAction implements IObjectActionDelegate {


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
						uninstallBundle(project);
					}
				}
			}
		}

		public void selectionChanged(IAction action, ISelection selection) {
			this.selection = selection;
		}

		public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		}
		
		protected void uninstallBundle(IProject project)
		{
			Bundle b = Platform.getBundle(project.getName());
			if (b != null) {
				
				try {
					b.stop();
				} catch (BundleException e) {
					e.printStackTrace();
				}
				
				try {
					b.uninstall();
				} catch (BundleException e) {
					e.printStackTrace();
				}
			}
		}
}
