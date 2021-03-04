package org.eclipse.stem.analysis.automaticexperiment.ui;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

/**
 * This class represents
 */
public interface AlgorithmCompositeEditorAdapterFactory {

	AlgorithmCompositeEditorAdapterFactoryImpl INSTANCE = new AlgorithmCompositeEditorAdapterFactoryImpl();

	public class AlgorithmCompositeEditorAdapterFactoryImpl extends
			ComposedAdapterFactory implements
			AlgorithmCompositeEditorAdapterFactory {

		@Override
		public boolean isFactoryForType(Object type) {
			return type == AlgorithmCompositeEditorAdapter.class;
		}

	} 
} 
