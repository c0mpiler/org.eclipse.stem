// BatchEvent.java
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

import java.util.EventObject;

/**
 * This class represents the occurrence of an event in a {@link Batch}.
 */
public class BatchEvent extends EventObject {

	/**
	 * Default serial id
	 */
	private static final long serialVersionUID = 1L;
	private BatchState batchState;

	/**
	 * @param batchState
	 *            the new state of a {@link IBatch}.
	 * @param batch
	 *            the source of the event.
	 */
	public BatchEvent(final IBatch batch, final BatchState batchState) {
		super(batch);
		this.batchState = batchState;
	}

	/**
	 * @return the batchState
	 */
	public final BatchState getBatchState() {
		return batchState;
	}

	/**
	 * @return the {@link IBatch} that is the source of the event.
	 */
	public final IBatch getBatch() {
		return (IBatch) getSource();
	}

	/**
	 * @see java.util.EventObject#toString()
	 */
	@Override
	public String toString() {
		return batchState.toString();
	}

} // BatchEvent
