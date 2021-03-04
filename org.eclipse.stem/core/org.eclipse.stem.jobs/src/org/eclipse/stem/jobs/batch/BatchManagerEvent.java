// BatchManagerEvent.java
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
 * This class represents an event that has occurred in the operation of the
 * {@link BatchManager}.
 */
public class BatchManagerEvent extends EventObject {

	/**
	 * Default serial id.
	 */
	transient static final long serialVersionUID = 1L;

	transient IBatch[] batchesAdded = null;

	transient IBatch[] batchesRemoved = null;

	/**
	 * @param batchManager
	 *            the {@link BatchManager} that created the event.
	 * @param batchsRemoved
	 *            the {@link Batch}s removed from management by the
	 *            {@link BatchManager}.
	 * @param batchsAdded
	 *            the {@link Batch}s added to the management of the
	 *            {@link BatchManager}.
	 */
	public BatchManagerEvent(final BatchManager batchManager,
			final IBatch[] batchsAdded, final IBatch[] batchsRemoved) {
		super(batchManager);
		this.batchesAdded = batchsAdded.clone();
		this.batchesRemoved = batchsRemoved.clone();
	} // BatchManagerEvent

	/**
	 * @return the batchesAdded
	 */
	public final IBatch[] getBatchesAdded() {
		return batchesAdded;
	}

	/**
	 * @return the batchesRemoved
	 */
	public final IBatch[] getBatchesRemoved() {
		return batchesRemoved;
	}

} // BatchManagerEvent
