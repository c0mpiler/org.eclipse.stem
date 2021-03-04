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
import org.eclipse.stem.model.metamodel.MetamodelFactory;
import org.eclipse.stem.model.metamodel.Transition;
import org.eclipse.stem.model.ui.editor.vismodel.CompartmentElement;
import org.eclipse.stem.model.ui.editor.vismodel.ModelElement;
import org.eclipse.stem.model.ui.editor.vismodel.TransitionElement;
import org.eclipse.stem.model.ui.editor.vismodel.VisualMetamodelFactory;


public class TransitionCreateCommand extends Command {
	private TransitionElement transitionElement;
	private CompartmentElement source;
	private CompartmentElement target;


	public TransitionCreateCommand(CompartmentElement source) {
		if (source == null) {
			throw new IllegalArgumentException();
		}
		setLabel("Create Transition");
		this.source = source;
	}

	public void setTarget(CompartmentElement target) {
		if (target == null) {
			throw new IllegalArgumentException();
		}
		this.target = target;
	}
	
	public boolean canExecute() {
		if (target == null) {
			return false;
		}

		if (source.equals(target)) {
			return false;
		}
		if (source.getModelElement() != target.getModelElement()) {
			return false;
		}

		if (source.getCompartment().getType() != CompartmentType.STANDARD) {
			return false;
		}
		
		if (target.getCompartment().getType() != CompartmentType.STANDARD && 
				target.getCompartment().getType() != CompartmentType.DEATHS) {
			return false;
		}

		ModelElement model = source.getModelElement();
		for (TransitionElement te : model.getTransitionElements()) {
			if (te.getSource() != null && te.getTarget() != null) {
				if (te.getSource().equals(source) && te.getTarget().equals(target)) {
					return false;
				}
			}
		}
		
		return true;
	}

	public void execute() {
		
		// TODO this needs to happen elsewhere
		transitionElement = VisualMetamodelFactory.eINSTANCE.createTransitionElement();
		Transition t = MetamodelFactory.eINSTANCE.createTransition();
		
		
		t.setSource(source.getCompartment());
		t.setTarget(target.getCompartment());
		t.setExpression("delta 0;");
		
		source.getModelElement().getModel().getTransitions().add(t);
		
		transitionElement.setTransition(t);
		transitionElement.setSource(source);
		transitionElement.setTarget(target);
		
		source.getModelElement().getTransitionElements().add(transitionElement);
		
		source.eNotify(null);
		target.eNotify(null);
		
	}


	public void redo() {
		//connection.reconnect();
	}


	public void undo() {
		//connection.disconnect();
	}
}
