// RecordedCSVInstanceTreeNodeLabelProvider.java
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
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.stem.diseasemodels.standard.presentation.DiseasemodelsEditorPlugin;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.navigator.CommonNavigator;

/**
 * This class is a {@link ILabelProvider} for {@link RecordedCSVInstanceTreeNode
 * }s which appear in the {@link CommonNavigator} framework that is used to
 * explore STEM Projects.
 * 
 * @see RecordedCSVInstanceTreeNodeContentProvider
 */
public class RecordedCSVInstanceTreeNodeLabelProvider extends
		RecordedInstanceTreeNodeLabelProvider {

	/**
	 * @see org.eclipse.stem.ui.views.explorer.
	 * 	RecordedInstanceTreeNodeLabelProvider#getImage(java.lang.Object)
	 */
	@Override
	public Image getImage(final Object element) {
		Image retValue = null;
		if (element instanceof RecordedCSVInstanceTreeNode) {
			// Yes
			retValue = DiseasemodelsEditorPlugin
					.getPlugin()
					.getImageRegistry()
					.get(org.eclipse.stem.ui.diseasemodels.ISharedImages.RECORDED_CSV_ICON);

		} // if IdentifiableInstanceTreeNode
		return retValue;
	}

	/**
	 * @see org.eclipse.stem.ui.views.explorer.
	 * 	RecordedInstanceTreeNodeLabelProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(final Object element) {
		String retValue = "nothing";
		if (element instanceof RecordedCSVInstanceTreeNode) {
			// Yes
			final RecordedCSVInstanceTreeNode node = (RecordedCSVInstanceTreeNode) element;
			retValue = node.getName();
		} // if RecordedCSVInstanceTreeNode
		else if(element instanceof IResource) {
			retValue = ((IResource)element).getName();
		}
		
		return retValue;
	}

} // RecordedCSVInstanceTreeNodeLabelProvider