// SimulationManagerEventTest.java
package org.eclipse.stem.jobs.simulation;

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

import junit.framework.TestCase;

/**
 * This class is a JUnit test of SimulationManagerEvent
 */
public class SimulationManagerEventTest extends TestCase {

	/**
	 * The fixture for this SimulationEvent test.
	 */
	protected SimulationManagerEvent fixture;

	/**
	 * Sets the fixture for this SimulationEvent test case.
	 */
	protected void setFixture(SimulationManagerEvent fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this SimulationEvent test case.
	 */
	private SimulationManagerEvent getFixture() {
		return this.fixture;
	} // getFixture

	/**
	 * @return a SimulationEvent for testing
	 */
	public static SimulationManagerEvent createFixture() {
		SimulationManager simulationManager = SimulationManager.getManager();
		return new SimulationManagerEvent(simulationManager,
				SimulationManager.NONE, SimulationManager.NONE);
	} // createFixture

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(createFixture());
	} // setUp

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Test method for
	 * {@link org.eclipse.stem.jobs.simulation.SimulationManagerEvent#SimulationManagerEvent(org.eclipse.stem.jobs.simulation.SimulationManager, org.eclipse.stem.jobs.simulation.ISimulation[], org.eclipse.stem.jobs.simulation.ISimulation[])}.
	 */
	public void testSimulationManagerEvent() {
		final SimulationManagerEvent simulationManagerEvent = getFixture();
		assertTrue(simulationManagerEvent.getSimulationsAdded().length == 0);
		assertTrue(simulationManagerEvent.getSimulationsRemoved().length == 0);
		// assertTrue(simulationManagerEvent.getSimulationsAdded().equals(
		// SimulationManager.NONE));
		// assertTrue(simulationManagerEvent.getSimulationsRemoved().equals(
		// SimulationManager.NONE));
	} // testSimulationManagerEvent

	/**
	 * Test method for
	 * {@link org.eclipse.stem.jobs.simulation.SimulationManagerEvent#getSimulationsAdded()}.
	 */
	public void testGetSimulationsAdded() {
		final SimulationManagerEvent simulationManagerEvent = getFixture();
		assertTrue(simulationManagerEvent.getSimulationsAdded().length == 0);
		// assertTrue(simulationManagerEvent.getSimulationsAdded().equals(
		//				SimulationManager.NONE));
	} // testGetSimulationsAdded

	/**
	 * Test method for
	 * {@link org.eclipse.stem.jobs.simulation.SimulationManagerEvent#getSimulationsRemoved()}.
	 */
	public void testGetSimulationsRemoved() {
		final SimulationManagerEvent simulationManagerEvent = getFixture();
		assertTrue(simulationManagerEvent.getSimulationsRemoved().length == 0);
		// assertTrue(simulationManagerEvent.getSimulationsRemoved().equals(
		// SimulationManager.NONE));
	}

} // SimulationManagerEventTest
