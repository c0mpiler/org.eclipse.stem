// RecordedCSVInstanceTreeNode.java
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

import org.eclipse.core.resources.IResource;

/**
 * This class represents simulation runs serialized using comma separated values
 * (CSV).
 */
public class RecordedCSVInstanceTreeNode extends RecordedInstanceTreeNode {

	private final IResource file;

	/**
	 * @param parent
	 * @param file
	 */
	public RecordedCSVInstanceTreeNode(final RecordedTreeNode parent,
			final IResource file) {
		super(parent, file.getName());
		this.file = file;
	}

	/**
	 * @param parent
	 * @param file
	 */
	public RecordedCSVInstanceTreeNode(final RecordedInstanceTreeNode parent,
			final IResource file) {
		super(parent, file.getName());
		this.file = file;
	}
	/**
	 * @return the file
	 */
	public IResource getFile() {
		return file;
	}

} // RecordedCSVInstanceTreeNode