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
package org.eclipse.stem.model.ui.editor.commands.emf;

import org.eclipse.gef.commands.Command;

public class EmfCommandWrapper extends Command
{
	private org.eclipse.emf.common.command.Command emfCommand;
	
	public EmfCommandWrapper(org.eclipse.emf.common.command.Command emfCommand) {
		this.emfCommand = emfCommand;
	}
	
	public org.eclipse.emf.common.command.Command getOriginalCommand()
	{
		return emfCommand;
	}

	@Override
	public void execute() {
		if (emfCommand.canExecute()) {
			emfCommand.execute();
		}
	}

	@Override
	public void redo() {
		execute();
	}

	@Override
	public void undo() {
		if (emfCommand.canUndo()) {
			emfCommand.undo();
		}
	}
	
	
}
