// RecordedInstanceTreeNodeLabelProvider.java
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
import org.eclipse.swt.graphics.Image;

/**
 * This class is a {@link ILabelProvider} for {@link RecordedInstanceTreeNode}s
 * which appear in the {@link CommonNavigator} framework that is used to explore
 * STEM Projects.
 * 
 * @see RecordedInstanceTreeNodeContentProvider
 */
public abstract class RecordedInstanceTreeNodeLabelProvider implements
		ILabelProvider {

	/**
	 * @see org.eclipse.jface.viewers.ILabelProvider#getImage(java.lang.Object)
	 */
	abstract public Image getImage(final Object element);

	/**
	 * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
	 */
	abstract public String getText(final Object element);

	/**
	 * @see
	 * 	org.eclipse.jface.viewers.IBaseLabelProvider#addListener(org.eclipse.
	 * 	jface.viewers.ILabelProviderListener)
	 */
	public void addListener(final ILabelProviderListener listener) {
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
	public boolean isLabelProperty(final Object element, final String property) {
		return false;
	}

	/**
	 * @see
	 * 	org.eclipse.jface.viewers.IBaseLabelProvider#removeListener(org.eclipse
	 * 	.jface.viewers.ILabelProviderListener)
	 */
	public void removeListener(final ILabelProviderListener listener) {
		// Nothing
	}

} // RecordedInstanceTreeNodeLabelProvider