// RecordedTreeNodeContentProvider.java
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
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.stem.ui.Utility;

/**
 * This class is a {@link IContentProvider} for the contributions to the
 * org.eclipse.ui,navigator.navigatorContents extension point that represent
 * recorded {@link Simulation} runs.
 */
public class RecordedTreeNodeContentProvider implements ITreeContentProvider {

	/**
	 * @see
	 * 	org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.
	 * 	Object)
	 */
	public Object[] getChildren(final Object parentElement) {
		Object[] retValue = null;
		if (parentElement instanceof IProject && 
				Utility.isSTEMProject(((IProject)parentElement))) {
			// Yes
			retValue = new Object[] { new RecordedTreeNode(
					(IProject) parentElement) }; // new Object
		} else if (parentElement instanceof RecordedTreeNode) {
			// Yes
			// final IdentifiableTreeNode ctn = (IdentifiableTreeNode)
			// parentElement;
			retValue = new Object[0]; // never null
		} // if IdentifiableTreeNode
		return retValue;
	} // getChildren

	/**
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.
	 * 	Object)
	 */
	public Object getParent(final Object element) {
		Object retValue = null;
		if (element instanceof RecordedTreeNode) {
			// Yes
			retValue = ((RecordedTreeNode) element).getProject();
		} // if IdentifiableTreeNode

		return retValue;
	}

	/**
	 * @see
	 * 	org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.
	 * 	Object)
	 */
	public boolean hasChildren(final Object element) {
		return false;
	}

	/**
	 * @see
	 * 	org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java
	 * 	.lang.Object)
	 */
	public Object[] getElements(final Object inputElement) {
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
	public void inputChanged(final Viewer viewer, final Object oldInput,
			final Object newInput) {
		// Nothing
	}

} // RecordedTreeNodeContentProvider