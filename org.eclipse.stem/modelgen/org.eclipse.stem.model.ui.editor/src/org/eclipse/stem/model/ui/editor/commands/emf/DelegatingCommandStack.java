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

import java.util.EventObject;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.gef.commands.CommandStackEvent;

public class DelegatingCommandStack implements CommandStack, org.eclipse.gef.commands.CommandStackEventListener
{
	private org.eclipse.gef.commands.CommandStack gefStack;
	
	private List<CommandStackListener> listeners = new CopyOnWriteArrayList<CommandStackListener>();
	
	public DelegatingCommandStack(org.eclipse.gef.commands.CommandStack gefStack)
	{
		this.gefStack = gefStack;

		gefStack.addCommandStackEventListener(this);
	
	}
	
	@Override
	public void execute(Command command) {
		gefStack.execute(new EmfCommandWrapper(command));
	}

	@Override
	public boolean canUndo() {
		return gefStack.canUndo();
	}

	@Override
	public void undo() {
		gefStack.undo();
	}

	@Override
	public boolean canRedo() {
		return gefStack.canRedo();
	}

	@Override
	public Command getUndoCommand() {
		org.eclipse.gef.commands.Command gefCommand = gefStack.getUndoCommand();
		if (gefCommand instanceof EmfCommandWrapper) {
			return ((EmfCommandWrapper) gefCommand).getOriginalCommand();
		}
		return null;
	}

	@Override
	public Command getRedoCommand() {
		org.eclipse.gef.commands.Command gefCommand = gefStack.getRedoCommand();
		if (gefCommand instanceof EmfCommandWrapper) {
			return ((EmfCommandWrapper) gefCommand).getOriginalCommand();
		}
		return null;
	}

	@Override
	public Command getMostRecentCommand() {
		if (gefStack.getCommands().length > 0 && gefStack.getCommands()[0] instanceof EmfCommandWrapper) {
			return ((EmfCommandWrapper)(gefStack.getCommands()[0])).getOriginalCommand();
		}
		
		return null;
	}

	@Override
	public void redo() {
		gefStack.redo();
	}

	@Override
	public void flush() {
		gefStack.flush();
	}

	@Override
	public void addCommandStackListener(CommandStackListener listener) {
		listeners.add(listener);
	}

	@Override
	public void removeCommandStackListener(CommandStackListener listener) {
		listeners.remove(listener);
	}
	
	

	@Override
	public void stackChanged(CommandStackEvent event) {
		
		final EventObject wrappedEventObject = new EventObject(this);
		
		for (CommandStackListener listener : listeners) {
			listener.commandStackChanged(wrappedEventObject);
		}
		
	}

}
