// BatchManagerTest.java
package org.eclipse.stem.jobs.batch;

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

import static org.junit.Assert.assertTrue;

import org.eclipse.stem.core.experiment.tests.ExperimentTest;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is a JUnit4 test case for the the {@link BatchManager}.
 */
public class BatchManagerTest {

	// The current BatchManager under test.
	protected BatchManager fixture;

	private BatchManager getFixture() {
		return fixture;
	} // getFixture

	private void setFixture(final BatchManager fixture) {
		this.fixture = fixture;
	} // setFixture

	/**
	 * @return the {@link BatchManager} to be used for testing.
	 */
	public static BatchManager createFixture() {
		BatchManager.resetBatchManager();
		return BatchManager.INSTANCE;
	} // createFixture

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		setFixture(createFixture());
	}

	/**
	 * Test method for
	 * {@link org.eclipse.stem.jobs.batch.BatchManager#getActiveBatches()}.
	 */
	@Test
	public void testGetBatches() {
		// This isn't much of a test.
		final BatchManager fixture = getFixture();
		assertTrue(fixture.getActiveBatches().size() == 0);
	} // testGetBatches

	/**
	 * Test method for
	 * {@link org.eclipse.stem.jobs.batch.BatchManager#getSequenceNumber()}.
	 */
	@Test
	public void testGetSequenceNumber() {
		// Test that the sequence number is incremented.
		final BatchManager fixture = getFixture();
		assertTrue(fixture.getSequenceNumber() == 0);
		fixture.createBatch(ExperimentTest.createFixture());
		assertTrue(fixture.getSequenceNumber() == 1);
	} // testGetSequenceNumber
} // BatchManagerTest
