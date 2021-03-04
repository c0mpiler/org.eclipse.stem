// DiseaseModelTreeNodeContentProvider.java
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

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.ui.navigator.CommonNavigator;

/**
 * This class is a {@link IdentifiableTreeNodeContentProvider} for {@link
 * DiseaseModelTreeNode}s which appear in the {@link CommonNavigator} framework
 * that is used to explore STEM Projects.
 * 
 * @see DiseaseModelTreeNodeLabelProvider
 */
public class DiseaseModelTreeNodeContentProvider extends
		IdentifiableTreeNodeContentProvider implements ITreeContentProvider {

	/**
	 * @see org.eclipse.stem.ui.views.explorer.
	 * 	IdentifiableTreeNodeContentProvider#getChildren(java.lang.Object)
	 */
	@Override
	public Object[] getChildren(final Object parentElement) {
		Object[] retValue = null;
		if (parentElement instanceof IProject) {
			// Yes
			retValue = new Object[] { new DiseaseModelTreeNode(
					(IProject) parentElement) }; // new Object
		} // if IProject
		return retValue;
	}

} // DiseaseModelTreeNodeContentProvider