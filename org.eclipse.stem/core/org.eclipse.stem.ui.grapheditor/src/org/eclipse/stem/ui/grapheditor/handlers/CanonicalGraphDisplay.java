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

public class CanonicalGraphDisplay extends AbstractHandler implements IHandler {

	public Object execute(final ExecutionEvent executionEvent)
			throws ExecutionException {
		TreeSelection selection = (TreeSelection) HandlerUtil
				.getCurrentSelectionChecked(executionEvent);
		Model model = (Model) selection.getFirstElement();
		List<Model> modelList = getAllContainedModels(Arrays.asList(model));
		List<Graph> graphList = new ArrayList<Graph>();
		List<IProject> projects = org.eclipse.stem.ui.Utility
				.getSTEMProjectsFromWorkspace(ResourcesPlugin.getWorkspace());
		IProject project = null;

		for (Model m : modelList) {
			graphList.addAll(m.getGraphs());
		}

		for (IProject stemProject : projects) {
			if (model.getURI().segment(1).equals(stemProject.getName())) {
				project = stemProject;
				break;
			}
		}

		new GraphEditorCanvas(model.getURI().lastSegment(), project, graphList,
				modelList);

		return null;
	}

	private List<Model> getAllContainedModels(List<Model> models) {
		List<Model> modelCollector = new ArrayList<Model>();

		modelCollector.addAll(models);

		for (Model model : models) {
			modelCollector.addAll(getAllContainedModels(model.getModels()));
		}

		return modelCollector;
	}

}
