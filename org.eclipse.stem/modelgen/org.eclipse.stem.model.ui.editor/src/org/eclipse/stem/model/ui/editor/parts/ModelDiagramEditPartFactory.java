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
package org.eclipse.stem.model.ui.editor.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.stem.model.ui.editor.vismodel.CompartmentElement;
import org.eclipse.stem.model.ui.editor.vismodel.ModelElement;
import org.eclipse.stem.model.ui.editor.vismodel.TransitionElement;

public class ModelDiagramEditPartFactory implements EditPartFactory
{

	/* (non-Javadoc)
	 * @see org.eclipse.gef.EditPartFactory#createEditPart(org.eclipse.gef.EditPart, java.lang.Object)
	 */
	public EditPart createEditPart(EditPart context, Object modelElement) {
		EditPart part = getPartForElement(modelElement);
		part.setModel(modelElement);
		return part;
	}

	private EditPart getPartForElement(Object modelElement) {
		if (modelElement instanceof ModelElement) {
			return new ModelElementEditPart();
		}
		if (modelElement instanceof CompartmentElement) {
			return new CompartmentElementEditPart();
		}
		if (modelElement instanceof TransitionElement) {
			return new TransitionElementEditPart();
		}
		throw new RuntimeException("Unsupported object type");
	}

}