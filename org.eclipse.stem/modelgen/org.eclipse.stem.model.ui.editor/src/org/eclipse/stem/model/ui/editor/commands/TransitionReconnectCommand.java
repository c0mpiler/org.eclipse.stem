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
import org.eclipse.stem.model.metamodel.CompartmentType;
import org.eclipse.stem.model.ui.editor.vismodel.CompartmentElement;
import org.eclipse.stem.model.ui.editor.vismodel.TransitionElement;

public class TransitionReconnectCommand extends Command {
	private TransitionElement transition;
	private CompartmentElement newSource;
	private CompartmentElement newTarget;
	private CompartmentElement oldSource;
	private CompartmentElement oldTarget;

	public TransitionReconnectCommand(TransitionElement transition) {
		this.transition = transition;
		this.oldSource = transition.getSource();
		this.oldTarget = transition.getTarget();
	}

	public boolean canExecute() {
		if (newSource != null) {
			return checkSourceReconnection();
		} else if (newTarget != null) {
			return checkTargetReconnection();
		}
		return false;
	}

	/**
	 * Return true, if reconnecting the connection-instance to newSource is
	 * allowed.
	 */
	private boolean checkSourceReconnection() {
		if (newSource.equals(oldTarget)) {
			return false;
		}

		for (TransitionElement te : newSource.getSourceTransitions()) {
			if (te.getSource() != null && te.getTarget() != null) {
				if (te != transition && te.getTarget().equals(oldTarget)) {
					return false;
				}
			}
		}
		
		return isValid(newSource, oldTarget);
	}


	private boolean checkTargetReconnection() {
		if (newTarget.equals(oldSource)) {
			return false;
		}

		for (TransitionElement te : newTarget.getSourceTransitions()) {
			if (te.getSource() != null && te.getSource() != null) {
				if (te != transition && te.getSource().equals(oldSource)) {
					return false;
				}
			}
		}
		return isValid(oldSource, newTarget);
	}

	public void execute() {
		if (newSource != null && isValid(newSource, oldTarget)) {
			transition.updateConnections(newSource, oldTarget);
			oldSource.eNotify(null);
			oldTarget.eNotify(null);
			newSource.eNotify(null);
		} else if (newTarget != null && isValid(oldSource, newTarget)) {
			transition.updateConnections(oldSource, newTarget);
			oldSource.eNotify(null);
			oldTarget.eNotify(null);
			newTarget.eNotify(null);
		}
	}
	
	private boolean isValid(CompartmentElement source, CompartmentElement target) {
		if (source.getCompartment().getType() != CompartmentType.STANDARD) {
			return false;
		}
		
		if (target.getCompartment().getType() != CompartmentType.STANDARD && 
				target.getCompartment().getType() != CompartmentType.DEATHS) {
			return false;
		}
		
		return true;
	}


	public void setNewSource(CompartmentElement connectionSource) {
		if (connectionSource == null) {
			throw new IllegalArgumentException();
		}
		setLabel("move connection startpoint");
		newSource = connectionSource;
		newTarget = null;
	}

	public void setNewTarget(CompartmentElement connectionTarget) {
		if (connectionTarget == null) {
			throw new IllegalArgumentException();
		}
		setLabel("move connection endpoint");
		newSource = null;
		newTarget = connectionTarget;
	}

	/**
	 * Reconnect the connection to its original source and target endpoints.
	 */
	public void undo() {
		transition.setSource(oldSource);
		transition.setTarget(oldTarget);
	}

}
