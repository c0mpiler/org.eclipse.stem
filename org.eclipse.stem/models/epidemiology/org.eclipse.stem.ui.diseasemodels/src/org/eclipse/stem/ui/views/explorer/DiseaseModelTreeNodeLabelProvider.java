// DiseaseModelTreeNodeLabelProvider.java
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
import org.eclipse.stem.diseasemodels.standard.presentation.DiseasemodelsEditorPlugin;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.navigator.CommonNavigator;

/**
 * This class is a {@link ILabelProvider} for {@link DiseaseModelTreeNode}s
 * which appear in the {@link CommonNavigator} framework that is used to explore
 * STEM Projects.
 * 
 * @see DiseaseModelTreeNodeContentProvider
 */
public class DiseaseModelTreeNodeLabelProvider extends
		IdentifiableTreeNodeLabelProvider implements ILabelProvider {

	/**
	 * @see org.eclipse.stem.ui.views.explorer.
	 * 	IdentifiableInstanceTreeNodeLabelProvider#getImage(java.lang.Object)
	 */
	@Override
	public Image getImage(final Object element) {
		Image retValue = null;
		if (element instanceof DiseaseModelTreeNode) {
			// Yes
			final DiseaseModelTreeNode dmtn = (DiseaseModelTreeNode) element;

			retValue = DiseasemodelsEditorPlugin.getPlugin().getImageRegistry()
					.get(dmtn.getImageKey());

		} // if IdentifiableInstanceTreeNode
		return retValue;
	}
} // DiseaseModelTreeNodeLabelProvider