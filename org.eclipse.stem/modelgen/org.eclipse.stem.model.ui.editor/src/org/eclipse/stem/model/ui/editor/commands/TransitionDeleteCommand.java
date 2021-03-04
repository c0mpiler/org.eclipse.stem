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
import org.eclipse.stem.model.ui.editor.vismodel.ModelElement;
import org.eclipse.stem.model.ui.editor.vismodel.TransitionElement;

/**
 * Delete Transition from list of transitions for this model
 *  - Remove TransitionElement from ModelElement list
 *  - Remove Transition from Model transitions
 *
 */
public class TransitionDeleteCommand extends Command {

	private final TransitionElement transition;

	public TransitionDeleteCommand(TransitionElement transition) {
		if (transition == null) {
			throw new IllegalArgumentException();
		}
		setLabel("Delete Transition");
		this.transition = transition;
	}

	public void execute() {
		redo();
	}

	public void redo() {
		ModelElement me = transition.getSource().getModelElement();
		me.getTransitionElements().remove(transition);
		me.getModel().getTransitions().remove(transition.getTransition());
		
		transition.getSource().eNotify(null);
		transition.getTarget().eNotify(null);
	}

	public void undo() {
		ModelElement me = transition.getSource().getModelElement();
		me.getModel().getTransitions().add(transition.getTransition());
		me.getTransitionElements().add(transition);
		
		transition.getSource().eNotify(null);
		transition.getTarget().eNotify(null);
	}
}
