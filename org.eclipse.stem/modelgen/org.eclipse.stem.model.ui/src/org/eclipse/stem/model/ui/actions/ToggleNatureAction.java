package org.eclipse.stem.model.ui.actions;

import java.util.Iterator;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.stem.model.common.ModelProjectNature;
import org.eclipse.stem.model.ui.MetamodelEditorPlugin;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class ToggleNatureAction implements IObjectActionDelegate {
	private ISelection selection;

	public void run(IAction action) {
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
	}

	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

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