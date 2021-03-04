package org.eclipse.stem.analysis.automaticexperiment.executable;

/*******************************************************************************
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation and new features
 *     Bundesinstitut für Risikobewertung - Pajek Graph interface, new Veterinary Models
 *******************************************************************************/

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment;
import org.eclipse.stem.analysis.automaticexperiment.AutomaticExperimentManager;
import org.eclipse.stem.analysis.automaticexperiment.ErrorAnalysisAlgorithm;
import org.eclipse.stem.analysis.automaticexperiment.OptimizerAlgorithm;
import org.eclipse.stem.analysis.automaticexperiment.util.AutomaticexperimentAdapterFactory;
import org.eclipse.stem.core.Utility;
import org.eclipse.stem.core.common.util.LogInitializationException;
import org.eclipse.stem.jobs.adapters.executable.emf.ExecutableAdapter;
import org.eclipse.stem.jobs.adapters.executable.emf.ExecutableAdapterFactory;
import org.eclipse.stem.jobs.execution.IExecutable;


/**
 * This class is an {@link ExecutableAdapterFactory} that creates adapters that
 * adapt {@link AutomaticExperiment}s to {@link IExecutable}s.
 */
public class AutomaticExperimentExecutableAdapterFactory 
	extends	AutomaticexperimentAdapterFactory 
	implements ExecutableAdapterFactory 
{

	/**
	 * Default Constructor
	 */
	public AutomaticExperimentExecutableAdapterFactory() {
		super();
		ExecutableAdapterFactory.INSTANCE.addAdapterFactory(this);
	}
	
	/**
	 * @see org.eclipse.stem.analysis.automaticexperiment.util.AutomaticexperimentAdapterFactory#createAutomaticExperimentAdapter()
	 */
	@Override
	public Adapter createAutomaticExperimentAdapter() {
		return new AutomaticExperimentExecutableAdapter();
	}

	/**
	 * @see org.eclipse.stem.analysis.automaticexperiment.util.AutomaticexperimentAdapterFactory#isFactoryForType(java.lang.Object)
	 */
	@Override
	public boolean isFactoryForType(final Object type) {
		return type == IExecutable.class || super.isFactoryForType(type);
	}
	
	/**
	 * This class adapts an {@link AutomaticExperiment} to an {@link IExecutable}.
	 */
	protected static class AutomaticExperimentExecutableAdapter extends
			ExecutableAdapter implements Adapter {

		/**
		 * @see org.eclipse.stem.jobs.adapters.executable.emf.ExecutableAdapter#run()
		 */
		@Override
		public void run() {
			org.eclipse.stem.ui.Activator.switchToPerspective(org.eclipse.stem.analysis.automaticexperiment.perspectives.AutomaticExperiment.ID_STEM_AUTOMATIC_EXPERIMENT_PERSPECTIVE);
			AutomaticExperimentManager manager = AutomaticExperimentManager.getInstance();
			OptimizerAlgorithm alg = (OptimizerAlgorithm)getTarget();
			ErrorAnalysisAlgorithm algorithm = manager.createAlgorithm(alg);
			try {
				manager.executeAlgorithm(algorithm, (AutomaticExperiment)alg);
			} catch(LogInitializationException lie) {
				Utility.handleException(lie.getMessage(), true, null);
			}
		}
	}
}
