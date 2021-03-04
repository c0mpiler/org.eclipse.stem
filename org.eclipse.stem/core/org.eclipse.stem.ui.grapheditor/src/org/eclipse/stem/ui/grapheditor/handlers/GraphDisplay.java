package org.eclipse.stem.ui.grapheditor.handlers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.model.Model;
import org.eclipse.stem.ui.grapheditor.GraphEditorCanvas;
import org.eclipse.ui.handlers.HandlerUtil;

public class GraphDisplay extends AbstractHandler implements IHandler {

	public Object execute(final ExecutionEvent executionEvent)
			throws ExecutionException {
		TreeSelection selection = (TreeSelection) HandlerUtil
				.getCurrentSelectionChecked(executionEvent);
		Graph graph = (Graph) selection.getFirstElement();
		List<IProject> projects = org.eclipse.stem.ui.Utility
				.getSTEMProjectsFromWorkspace(ResourcesPlugin.getWorkspace());
		IProject project = null;

		for (IProject stemProject : projects) {
			if (graph.getURI().segment(1).equals(stemProject.getName())) {
				project = stemProject;
				break;
			}
		}

		new GraphEditorCanvas(graph.getURI().lastSegment(), project,
				Arrays.asList(graph), new ArrayList<Model>());

		return null;
	}

}
