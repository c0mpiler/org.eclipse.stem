// IdentifiableTreeNodeContentProvider.java
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
 * org.eclipse.ui,navigator.navigatorContents extension point that represent the
 * components of the STEM modeling framework. These contributions are instances
 * of {@link IdentifiableTreeNode} which are used to aggregate instances of a
 * single type of component in a STEM project. For instance, all of the
 * serialized {@link org.eclipse.stem.core.model.Decorator} instances, or all of
 * the {@link org.eclipse.stem.core.scenario.Scenario} instances.
 */
public class IdentifiableTreeNodeContentProvider implements
		ITreeContentProvider {

	protected Object input = null;

	/**
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.
	 *      Object)
	 */
	public Object[] getChildren(Object parentElement) {
		Object[] retValue = null;
			if (parentElement instanceof IProject 
					&& Utility.isSTEMProject(((IProject)parentElement))) { 
				retValue = new Object[] {
						new IdentifiableTreeNode.ScenariosTreeNode(
								(IProject) parentElement),

						new IdentifiableTreeNode.ExperimentsTreeNode(
								(IProject) parentElement),
								
						new IdentifiableTreeNode.SolversTreeNode(
										(IProject) parentElement),

						new IdentifiableTreeNode.SequencersTreeNode(
								(IProject) parentElement),

						new IdentifiableTreeNode.ModelsTreeNode(
								(IProject) parentElement),

						new IdentifiableTreeNode.GraphsTreeNode(
								(IProject) parentElement),

						new IdentifiableTreeNode.DecoratorsTreeNode(
								(IProject) parentElement),

						new IdentifiableTreeNode.TriggersTreeNode(
								(IProject) parentElement),

						new IdentifiableTreeNode.PredicatesTreeNode(
								(IProject) parentElement),
								
						new IdentifiableTreeNode.ModifiersTreeNode(
										(IProject) parentElement),

						new IdentifiableTreeNode.LoggersTreeNode(
								(IProject) parentElement),
						
				}; // new Object
			} // if IProject
			else if (parentElement instanceof IdentifiableTreeNode) {
				// Yes
				// final IdentifiableTreeNode ctn = (IdentifiableTreeNode)
				// parentElement;
				retValue = new Object[0]; // never null

			}
		return retValue;
	} // getChildren

	/**
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.
	 *      Object)
	 */
	public Object getParent(Object element) {
		Object retValue = null;
		if (element instanceof IdentifiableTreeNode) {
			// Yes
			final IdentifiableTreeNode ctn = (IdentifiableTreeNode) element;
			retValue = ctn.getProject();
		} // if IdentifiableTreeNode

		return retValue;
	} // getParent

	/**
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java
	 *      .lang.Object)
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.
	 *      Object)
	 */
	public boolean hasChildren(Object element) {
		return false;
	}

	/**
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	public void dispose() {
		// Nothing
	}

	/**
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.
	 *      jface.viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		input = newInput;
	}

} // IdentifiableTreeNodeContentProvider