// IExecutable.java
package org.eclipse.stem.jobs.execution;

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

import java.util.Date;

import org.eclipse.stem.core.scenario.ScenarioInitializationException;

/**
 * This interface is implemented by classes that can are executable.
 */
public interface IExecutable {

	/**
	 * The units of work (100) that represents complete execution.
	 */
	int TOTAL_WORK = 100;

	/**
	 * @return the unique sequence number of the {@link IExecutable}.
	 * @see #getNameWithSequenceNumber()
	 */
	int getSequenceNumber();

	/**
	 * @return the name of the {@link IExecutable}.
	 */
	String getName();

	/**
	 * @return a {@link String} that contains the sequence number of the
	 *         {@link IExecutable} and it's name.
	 * @see #getName()
	 */
	String getNameWithSequenceNumber();

	/**
	 * @return a {@link String} without spaces that is unique to this
	 *         {@link Executable} instance.
	 */
	String getUniqueIDString();

	/**
	 * @return the time (wall clock) that the {@link Executable} was created.
	 */
	Date getCreationTime();

	/**
	 * Start running the {@link IExecutable}.
	 */
	void run();

	/**
	 * Pause the {@link IExecutable}.
	 */
	void pause();

	/**
	 * Reset the {@link IExecutable}.
	 */
	void reset() throws ScenarioInitializationException;

	/**
	 * Step the {@link IExecutable} one step/cycle if it hasn't already ended.
	 */
	void step();

	/**
	 * Stop the {@link IExecutable}.
	 */
	void stop();

	/**
	 * @return <code>true</code> if the {@link IExecutable} is running.
	 */
	boolean isRunning();

	/**
	 * @return <code>true</code> if the {@link IExecutable} can be stopped.
	 *         This is only <code>true</code> for {@link IExecutable}s for
	 *         which {@link #isRunning()} can be <code>true</code>.
	 */
	boolean isStoppable();
} // IExecutable
