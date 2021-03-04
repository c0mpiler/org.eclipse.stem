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

import org.eclipse.gef.commands.Command;
import org.eclipse.stem.model.ui.editor.vismodel.CompartmentElement;
import org.eclipse.stem.model.ui.editor.vismodel.ModelElement;

/**
 * GEF command to remove an existing CompartmentElement from a Model
 *
 */
public class CompartmentDeleteCommand extends Command {
	private final CompartmentElement compartment;
	private final ModelElement model;

	public CompartmentDeleteCommand(ModelElement model, CompartmentElement compartment) {
		setLabel("Delete Compartment");
		this.model = model;
		this.compartment = compartment;
	}

	public void execute() {
		redo();
	}

	public void redo() {
		model.removeCompartment(compartment);
	}

	public void undo() {
		// TODO implement undo delete compartment
	}
	
	public boolean canUndo() {
		// for now, we won't allow undo
		return false;
	}
}