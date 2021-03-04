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
package org.eclipse.stem.model.ui.editor.commands;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
import org.eclipse.stem.model.ui.editor.vismodel.CompartmentElement;
import org.eclipse.stem.model.ui.editor.vismodel.ModelElement;

/**
 * GEF command to add a new CompartmentElement to the existing Model
 */
public class CompartmentCreateCommand extends Command 
{
	private CompartmentElement comaprtment;
	private ModelElement model;
	private Rectangle bounds;

	public CompartmentCreateCommand(CompartmentElement comaprtment, ModelElement model,
			Rectangle bounds) {
		this.comaprtment = comaprtment;
		this.model = model;
		this.bounds = bounds;
		setLabel("Create Compartment");
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#canExecute()
	 */
	public boolean canExecute() {
		return comaprtment != null && model != null && bounds != null;
	}


	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	public void execute() {
		comaprtment.setX(bounds.x());
		comaprtment.setY(bounds.y());
		comaprtment.setWidth(bounds.width());
		comaprtment.setHeight(bounds.height());
		redo();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#redo()
	 */
	public void redo() {
		model.addCompartment(comaprtment);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	public void undo() {
		model.removeCompartment(comaprtment);
	}

}