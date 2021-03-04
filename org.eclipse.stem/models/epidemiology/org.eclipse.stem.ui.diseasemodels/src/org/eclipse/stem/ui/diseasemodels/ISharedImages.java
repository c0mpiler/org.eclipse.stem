// ISharedImages.java
package org.eclipse.stem.ui.diseasemodels;

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
import org.eclipse.stem.diseasemodels.standard.Infector;
import org.eclipse.stem.ui.views.explorer.RecordedCSVInstanceTreeNode;

/**
 * This interface contains identifiers used to mark images added to this
 * plug-in's image registry. This images are intended to be shared by
 * referencing the registry and using the identifiers defined here to select the
 * appropriate image.
 */
public interface ISharedImages {

	/**
	 * This image is the icon to represent a {@link DiseaseModel}
	 */
	String DISEASE_ICON = "disease_icon.image";

	/**
	 * This image is the icon to represent a {@link Infector}
	 */
	String INFECTOR_ICON = "infector_icon.image";

	/**
	 * This image is the icon to represent a {@link RecordedCSVInstanceTreeNode}
	 */
	String RECORDED_CSV_ICON = "recorded_cvs_icon.image";

} // ISharedImages