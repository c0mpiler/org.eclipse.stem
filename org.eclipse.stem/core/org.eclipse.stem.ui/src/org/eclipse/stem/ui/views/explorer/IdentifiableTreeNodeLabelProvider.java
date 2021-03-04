// IdentifiableTreeNodeLabelProvider.java
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

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.stem.ui.Activator;
import org.eclipse.swt.graphics.Image;

/**
 * This class is an {@link ILabelProvider} for the contributions to the
 * org.eclipse.ui,navigator.navigatorContents extension point that represent the
 * components of the STEM modeling framework. These contributions are instances
 * of {@link IdentifiableTreeNode} which are used to aggregate instances of a
 * single type of component in a STEM project. For instance, all of the
 * serialized {@link org.eclipse.stem.core.model.Decorator} instances, or all of
 * the {@link org.eclipse.stem.core.scenario.Scenario} instances.
 */
public class IdentifiableTreeNodeLabelProvider implements ILabelProvider {

	/**
	 * @see org.eclipse.jface.viewers.ILabelProvider#getImage(java.lang.Object)
	 */
	public Image getImage(Object element) {
		Image retValue = null;
		if (element instanceof IdentifiableTreeNode) {
			// Yes
			final IdentifiableTreeNode ctn = (IdentifiableTreeNode) element;
			retValue = Activator.getDefault().getImageRegistry().get(
					ctn.getImageKey());
		} // if IdentifiableTreeNode
		return retValue;
	} // getImage

	/**
	 * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
	 */
	public String getText(Object element) {
		return ((IdentifiableTreeNode) element).getComponentName();
	}

	/**
	 * @see
	 * 	org.eclipse.jface.viewers.IBaseLabelProvider#addListener(org.eclipse.
	 * 	jface.viewers.ILabelProviderListener)
	 */
	public void addListener(
			ILabelProviderListener listener) {
		// Nothing
	}

	/**
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#dispose()
	 */
	public void dispose() {
		// Nothing
	}

	/**
	 * @see
	 * 	org.eclipse.jface.viewers.IBaseLabelProvider#isLabelProperty(java.lang
	 * 	.Object, java.lang.String)
	 */
	public boolean isLabelProperty(Object element,
			String property) {
		return false;
	}

	/**
	 * @see
	 * 	org.eclipse.jface.viewers.IBaseLabelProvider#removeListener(org.eclipse
	 * 	.jface.viewers.ILabelProviderListener)
	 */
	public void removeListener(
			ILabelProviderListener listener) {
		// Nothing
	}

} // IdentifiableTreeNodeLabelProvider