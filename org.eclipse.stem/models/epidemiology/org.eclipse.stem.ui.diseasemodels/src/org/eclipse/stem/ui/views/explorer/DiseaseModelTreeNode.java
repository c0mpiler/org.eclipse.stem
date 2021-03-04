// DiseaseModelTreeNode.java
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
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.ui.diseasemodels.ISharedImages;
import org.eclipse.stem.ui.wizards.NewSTEMProjectWizard;
import org.eclipse.ui.navigator.CommonNavigator;

/**
 * This class is used in the {@link CommonNavigator} based STEM Project Explorer
 * view to represent a group of {@link DiseaseModel}s that belong to a
 * particular STEM Project instance.
 */
public class DiseaseModelTreeNode extends IdentifiableTreeNode {

	/**
	 * @param project
	 */
	public DiseaseModelTreeNode(final IProject project) {
		super(project, "Disease Models",
				NewSTEMProjectWizard.DECORATORS_FOLDER_NAME,
				ISharedImages.DISEASE_ICON);
	} // DiseaseModelTreeNode

} // DiseaseModelTreeNode