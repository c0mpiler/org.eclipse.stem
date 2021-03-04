// DiseaseModelInstanceTreeNode.java
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

import org.eclipse.stem.diseasemodels.standard.DiseaseModel;

/**
 * This class represents an instance of a serialized {@link DiseaseModel}.
 */
public class DiseaseModelInstanceTreeNode extends IdentifiableInstanceTreeNode {

	/**
	 * @param itn
	 * @param name
	 * @param extension
	 * 		the file name extension of the serialized file.
	 */
	public DiseaseModelInstanceTreeNode(final IdentifiableTreeNode itn,
			final String name, final String extension) {
		super(itn, name, extension);
	}

} // DiseaseModelInstanceTreeNode