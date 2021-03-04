package org.eclipse.stem.analysis.automaticexperiment.ui;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.stem.analysis.automaticexperiment.util.AutomaticexperimentAdapterFactory;

public class AutomaticExperimentCompositeEditorAdapterFactory extends
		AutomaticexperimentAdapterFactory implements
		AlgorithmCompositeEditorAdapterFactory {

	/**
	 * 
	 */
	public AutomaticExperimentCompositeEditorAdapterFactory() {
		super();
		AlgorithmCompositeEditorAdapterFactoryImpl.INSTANCE
				.addAdapterFactory(this);
	}

	/**
	 * 
	 */
	@Override
	public Adapter createAutomaticExperimentAdapter() {
		return new AutomaticExperimentCompositeEditorAdapter();
	}

	/**
	 * 
	 */
	public boolean isFactoryForType(Object type) {
		return type == AlgorithmCompositeEditorAdapter.class
				|| super.isFactoryForType(type);
	}
}
