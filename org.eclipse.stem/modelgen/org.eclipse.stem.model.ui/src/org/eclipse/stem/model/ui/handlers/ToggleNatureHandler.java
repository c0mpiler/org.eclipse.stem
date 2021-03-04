package org.eclipse.stem.model.ui.handlers;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.stem.model.common.ModelProjectNature;
import org.eclipse.stem.model.ui.MetamodelEditorPlugin;
import org.eclipse.ui.handlers.HandlerUtil;


/**
 * 
 * @author jhkauf
 *
 */
public class ToggleNatureHandler extends AbstractHandler {

	/**
	 * 
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		 ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		 if (selection instanceof IStructuredSelection) {
				for (Iterator<?> it = ((IStructuredSelection) selection).iterator(); it
						.hasNext();) {
					Object element = it.next();
					IProject project = null;
					if (element instanceof IProject) {
						project = (IProject) element;
					} else if (element instanceof IAdaptable) {
						project = (IProject) ((IAdaptable) element)
								.getAdapter(IProject.class);
					}
					if (project != null) {
						toggleNature(project);
					}
				}
			}
		
		return null;
	}

	/**
	 * 
	 * @param project
	 */
	public static void toggleNature(IProject project) {
		try {
			if (ModelProjectNature.hasNature(project)) {
				ModelProjectNature.removeNature(project);
			} else {
				ModelProjectNature.addNature(project);
			}

		} catch (CoreException ce) {
			MetamodelEditorPlugin
					.log(new Status(Status.ERROR,
							MetamodelEditorPlugin.PLUGIN_ID,
							"Error toggling nature", ce));
		}
	}

}
