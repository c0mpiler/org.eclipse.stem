// ScenarioExecutableAdapterFactory.java
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
import org.eclipse.stem.core.Utility;
import org.eclipse.stem.core.scenario.Scenario;
import org.eclipse.stem.core.scenario.util.ScenarioAdapterFactory;
import org.eclipse.stem.jobs.execution.IExecutable;
import org.eclipse.stem.jobs.simulation.SimulationManager;

/**
 * This class is an {@link ExecutableAdapterFactory} that creates adapters that
 * adapt {@link Scenario}s to {@link IExecutable}s.
 */
public class ScenarioExecutableAdapterFactory extends ScenarioAdapterFactory
		implements ExecutableAdapterFactory {

	/**
	 * Default Constructor
	 */
	public ScenarioExecutableAdapterFactory() {
		super();
		ExecutableAdapterFactory.INSTANCE.addAdapterFactory(this);
	}

	/**
	 * @see org.eclipse.stem.core.scenario.util.ScenarioAdapterFactory#createScenarioAdapter()
	 */
	@Override
	public Adapter createScenarioAdapter() {
		return new ScenarioExecutableAdapter();
	} // createScenarioAdapter

	/**
	 * @see org.eclipse.stem.core.scenario.util.ScenarioAdapterFactory#isFactoryForType(java.lang.Object)
	 */
	@Override
	public boolean isFactoryForType(final Object type) {
		return type == IExecutable.class || super.isFactoryForType(type);
	}

	/**
	 * This class adapts a {@link Scenario} to an {@link IExecutable}.
	 */
	protected static class ScenarioExecutableAdapter extends ExecutableAdapter {

		/**
		 * @see org.eclipse.stem.jobs.adapters.executable.emf.ExecutableAdapter#run()
		 */
		@Override
		public void run() {
			Scenario newScenario = (Scenario)Utility.getIdentifiableForceLoad(((Scenario) getTarget()).getURI());
			SimulationManager.getManager().createAndRunSimulation(newScenario);
		}

		/**
		 * @see org.eclipse.stem.jobs.adapters.executable.emf.ExecutableAdapter#step()
		 */
		@Override
		public void step() {
			Scenario newScenario = (Scenario)Utility.getIdentifiableForceLoad(((Scenario) getTarget()).getURI());
			SimulationManager.getManager().createAndStepSimulation(newScenario);
		}
	} // ScenarioExecutableAdapter

} // ScenarioExecutableAdapterFactory
