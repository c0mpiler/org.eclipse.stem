package org.eclipse.stem.analysis.automaticexperiment.ui;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.events.ModifyListener;

public class AutomaticExperimentCompositeEditorAdapter extends
		AlgorithmCompositeEditorAdapter {

	@Override
	public AlgorithmCompositeEditor createCompositeEditor(
			AlgorithmControl algControl, int style,
			ModifyListener projectValidator, IProject project) {
		// TODO Auto-generated method stub
		return new AutomaticExperimentCompositeEditor(algControl, style, projectValidator, project);
	}

}
