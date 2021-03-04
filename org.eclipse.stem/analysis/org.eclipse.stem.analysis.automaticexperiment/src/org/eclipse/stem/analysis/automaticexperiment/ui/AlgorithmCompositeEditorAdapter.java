package org.eclipse.stem.analysis.automaticexperiment.ui;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.swt.events.ModifyListener;

public abstract class AlgorithmCompositeEditorAdapter extends AdapterImpl implements
		Adapter {

	abstract public AlgorithmCompositeEditor createCompositeEditor(
			AlgorithmControl algControl,
			int style, ModifyListener projectValidator, IProject project);
}
