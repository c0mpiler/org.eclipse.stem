// RecordedInstanceTreeNodeContentProvider.java
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

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * This class is a {@link ITreeContentProvider} for {@link
 * RecordedInstanceTreeNode}s which appear in the {@link CommonNavigator}
 * framework that is used to explore STEM Projects.
 * 
 * @see RecordedInstanceTreeNodeLabelProvider
 */
public abstract class RecordedInstanceTreeNodeContentProvider implements
		ITreeContentProvider {

	/**
	 * @see
	 * 	org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.
	 * 	Object)
	 */
	abstract public Object[] getChildren(Object parentElement);

	/**
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.
	 * 	Object)
	 */
	public Object getParent(Object element) {
		Object retValue = null;
		if (element instanceof RecordedInstanceTreeNode) {
			retValue = ((RecordedInstanceTreeNode) element).getParent();
		} // if IdentifiableInstanceTreeNode
		return retValue;
	}

	/**
	 * @see
	 * 	org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.
	 * 	Object)
	 */
	abstract public boolean hasChildren(Object element);

	/**
	 * @see
	 * 	org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java
	 * 	.lang.Object)
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	public void dispose() {
		// Nothing
	}

	/**
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.
	 * 	jface.viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// Nothing
	}

} // RecordedInstanceTreeNodeContentProvider