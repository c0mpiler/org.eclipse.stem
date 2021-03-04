package org.eclipse.stem.analysis.automaticexperiment.ui;

import org.eclipse.stem.analysis.automaticexperiment.OptimizerAlgorithm;
import org.eclipse.swt.widgets.Composite;

public abstract class AlgorithmCompositeEditor extends Composite {

	AlgorithmCompositeEditor(final Composite parent, final int style) {
		super(parent, style);
	}

	public abstract boolean validate();
	
	public abstract String getErrorMessage();
	
	public abstract OptimizerAlgorithm createAlgorithm();
}
