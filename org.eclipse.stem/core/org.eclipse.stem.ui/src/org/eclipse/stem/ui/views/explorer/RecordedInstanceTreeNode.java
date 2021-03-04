// RecordedInstanceTreeNode.java
package org.eclipse.stem.ui.views.explorer;

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

/**
 * This class represents an instance of a recorded
 * {@link org.eclipse.stem.jobs.simulation.Simulation}.
 */
public class RecordedInstanceTreeNode {

	private final RecordedTreeNode parent;
	private final RecordedInstanceTreeNode instanceParent;
	private final String name;

	/**
	 * @param parent
	 * @param name
	 */
	public RecordedInstanceTreeNode(final RecordedTreeNode parent,
			final String name) {
		super();
		this.parent = parent;
		this.name = name;
		this.instanceParent = null;
	}

	/**
	 * @param parent
	 * @param name
	 */
	public RecordedInstanceTreeNode(final RecordedInstanceTreeNode parent,
			final String name) {
		super();
		this.parent = null;
		this.name = name;
		this.instanceParent = parent;
	}
	/**
	 * @return the parent
	 */
	public Object getParent() {
		return parent;
	}
	/**
	 * @return the instance parent
	 */
	public Object getInstanceParent() {
		return instanceParent;
	}

	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getName();
	}

} // RecordedInstanceTreeNode