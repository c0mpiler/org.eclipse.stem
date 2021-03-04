package org.eclipse.stem.model.ui.handlers;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleException;


/**
 * 
 * @author jhkauf
 *
 */
public class UnLoadBundleHandler extends AbstractHandler {

	/**
	 * 
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		 ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
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
		
		return null;
	}

	/**
	 * 
	 * @param project
	 */
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
