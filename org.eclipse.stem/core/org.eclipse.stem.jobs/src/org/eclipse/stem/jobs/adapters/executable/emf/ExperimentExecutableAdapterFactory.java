// ExperimentExecutableAdapterFactory.java
package org.eclipse.stem.jobs.adapters.executable.emf;

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
import org.eclipse.stem.core.experiment.Experiment;
import org.eclipse.stem.core.experiment.util.ExperimentAdapterFactory;
import org.eclipse.stem.jobs.batch.BatchManager;
import org.eclipse.stem.jobs.execution.IExecutable;

/**
 * This class is an {@link ExecutableAdapterFactory} that creates adapters that
 * adapt {@link Experiment}s to {@link IExecutable}s.
 */
public class ExperimentExecutableAdapterFactory extends
		ExperimentAdapterFactory implements ExecutableAdapterFactory {

	/**
	 * Default Constructor
	 */
	public ExperimentExecutableAdapterFactory() {
		super();
		ExecutableAdapterFactory.INSTANCE.addAdapterFactory(this);
	}

	/**
	 * @see org.eclipse.stem.core.experiment.util.ExperimentAdapterFactory#createExperimentAdapter()
	 */
	@Override
	public Adapter createExperimentAdapter() {
		return new ExperimentExecutableAdapter();
	}

	/**
	 * @see org.eclipse.stem.core.scenario.util.ScenarioAdapterFactory#isFactoryForType(java.lang.Object)
	 */
	@Override
	public boolean isFactoryForType(final Object type) {
		return type == IExecutable.class || super.isFactoryForType(type);
	}

	/**
	 * This class adapts an {@link Experiment} to an {@link IExecutable}.
	 */
	protected static class ExperimentExecutableAdapter extends
			ExecutableAdapter implements Adapter {

		/**
		 * @see org.eclipse.stem.jobs.adapters.executable.emf.ExecutableAdapter#run()
		 */
		@Override
		public void run() {
			BatchManager.INSTANCE.createAndRunBatch((Experiment) getTarget());
		}

		/**
		 * @see org.eclipse.stem.jobs.adapters.executable.emf.ExecutableAdapter#step()
		 */
		@Override
		public void step() {
			super.step();
			// TODO implement ExperimentExecutableAdapter.step()
			// BatchManager.INSTANCE.createAndStepBatch((Experiment)
			// getTarget());
		}
	} // ExperimentExecutableAdapter
} // ExperimentExecutableAdapterFactory
