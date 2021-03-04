// IdentifiableInstanceTreeNode.java
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
 * This class represents {@link org.eclipse.stem.core.common.Identifiable}s in
 * the STEM Project Explorer view that is implemented using the
 * {@link org.eclipse.ui.navigator.CommonNavigator} framework. An instance
 * typically serves as a proxy for the file that serializes the
 * {@link Identifiable}.
 * 
 * @see IdentifiableInstanceTreeNodeContentProvider
 * @see IdentifiableInstanceTreeNodeLabelProvider
 */
public class IdentifiableInstanceTreeNode {

	private final IdentifiableTreeNode parent;
	private final String name;
	private final String extension;

	/**
	 * @param itn
	 * @param name
	 * @param extension
	 * 		the file name extension of the serialized file.
	 */
	public IdentifiableInstanceTreeNode(IdentifiableTreeNode itn, String name,
			String extension) {
		this.parent = itn;
		this.name = name;
		this.extension = extension;
	}

	/**
	 * @return the {@link IdentifiableTreeNode} that is the parent of this node.
	 */
	public final IdentifiableTreeNode getParent() {
		return parent;
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
		return name;
	}

	/**
	 * @return the extension
	 */
	public final String getExtension() {
		return extension;
	}

} // IdentifiableInstanceTreeNode