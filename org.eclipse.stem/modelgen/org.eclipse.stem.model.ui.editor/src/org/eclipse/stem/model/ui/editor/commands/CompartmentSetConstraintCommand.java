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
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.stem.model.ui.editor.vismodel.CompartmentElement;


public class CompartmentSetConstraintCommand extends Command {
	private Rectangle newBounds;
	private Rectangle oldBounds;
	private ChangeBoundsRequest request;
	private CompartmentElement compartment;

	public CompartmentSetConstraintCommand(CompartmentElement compartment, ChangeBoundsRequest request,
			Rectangle newBounds) {
		this.compartment = compartment;
		this.request = request;
		this.newBounds = newBounds.getCopy();
		setLabel("move / resize");
	}

	public boolean canExecute() {
		Object type = request.getType();
		return (RequestConstants.REQ_MOVE.equals(type)
				|| RequestConstants.REQ_MOVE_CHILDREN.equals(type)
				|| RequestConstants.REQ_RESIZE.equals(type) 
				|| RequestConstants.REQ_RESIZE_CHILDREN
				.equals(type));
	}

	public void execute() {
		oldBounds = new Rectangle(compartment.getX(), compartment.getY(), compartment.getWidth(), compartment.getHeight());
		redo();
	}

	public void redo() {
		compartment.setX(newBounds.x());
		compartment.setY(newBounds.y());
		compartment.setWidth(newBounds.width());
		compartment.setHeight(newBounds.height());		
	}

	public void undo() {
		compartment.setX(oldBounds.x());
		compartment.setY(oldBounds.y());
		compartment.setWidth(oldBounds.width());
		compartment.setHeight(oldBounds.height());		
	}
}
