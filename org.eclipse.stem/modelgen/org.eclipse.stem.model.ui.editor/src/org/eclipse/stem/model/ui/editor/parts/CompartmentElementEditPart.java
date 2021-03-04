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

import java.util.List;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.stem.model.metamodel.Compartment;
import org.eclipse.stem.model.metamodel.CompartmentGroup;
import org.eclipse.stem.model.metamodel.Model;
import org.eclipse.stem.model.ui.editor.commands.TransitionCreateCommand;
import org.eclipse.stem.model.ui.editor.commands.TransitionReconnectCommand;
import org.eclipse.stem.model.ui.editor.controls.ModelCompartmentEditorDialog;
import org.eclipse.stem.model.ui.editor.figures.CompartmentFigure;
import org.eclipse.stem.model.ui.editor.vismodel.CompartmentElement;
import org.eclipse.stem.model.ui.editor.vismodel.ModelElement;
import org.eclipse.stem.model.ui.editor.vismodel.TransitionElement;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;

public class CompartmentElementEditPart extends AbstractGraphicalEditPart
		implements NodeEditPart, Adapter {

	private ConnectionAnchor anchor;

	public void activate() {
		if (!isActive()) {
			super.activate();
			getCastedModel().eAdapters().add(this);
			getCastedModel().getCompartment().eAdapters().add(this);
		}
	}
	
	public void deactivate() {
		if (isActive()) {
			getCastedModel().getCompartment().eAdapters().remove(this);
			getCastedModel().eAdapters().remove(this);
			super.deactivate();
		}
	}

	
	@Override
	public void performRequest(Request req) {
		super.performRequest(req);
		if (req.getType().equals(REQ_OPEN)) {
			// Execute open on the compartment
			CompartmentElement ce = getCastedModel();
			Compartment c = ce.getCompartment();
			ModelElement me = ce.getModelElement();
			Model m = me.getModel();
			CompartmentGroup cg = m.getCompartments();
			
			if (cg.getCompartments().contains(c)) {

				ModelCompartmentEditorDialog dialog = new ModelCompartmentEditorDialog(
						Display.getCurrent().getActiveShell(), SWT.NONE, cg, c);
				dialog.open();
				refreshVisuals();
			} else {
				
				MessageDialog.openInformation(Display.getCurrent().getActiveShell(), "Read only compartment", "You cannot edit inherited compartments in this model.");
				
			}
		}

	}


	protected void createEditPolicies() {
		// allow removal of the associated model element
		installEditPolicy(EditPolicy.COMPONENT_ROLE,
				new CompartmentComponentEditPolicy());

		//
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,
				new GraphicalNodeEditPolicy() {
					/*
					 * (non-Javadoc)
					 * 
					 * @see
					 * org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy#
					 * getConnectionCompleteCommand
					 * (org.eclipse.gef.requests.CreateConnectionRequest)
					 */
					protected Command getConnectionCompleteCommand(
							CreateConnectionRequest request) {
						TransitionCreateCommand cmd = (TransitionCreateCommand) request
								.getStartCommand();
						cmd.setTarget((CompartmentElement) getHost().getModel());
						return cmd;
					}

					/*
					 * (non-Javadoc)
					 * 
					 * @see
					 * org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy#
					 * getConnectionCreateCommand
					 * (org.eclipse.gef.requests.CreateConnectionRequest)
					 */
					protected Command getConnectionCreateCommand(
							CreateConnectionRequest request) {
						CompartmentElement source = (CompartmentElement) getHost()
								.getModel();
						// int style = ((Integer) request.getNewObjectType())
						// .intValue();
						TransitionCreateCommand cmd = new TransitionCreateCommand(source);
						request.setStartCommand(cmd);
						return cmd;
					}

					/*
					 * (non-Javadoc)
					 * 
					 * @see
					 * org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy#
					 * getReconnectSourceCommand
					 * (org.eclipse.gef.requests.ReconnectRequest)
					 */
					protected Command getReconnectSourceCommand(
							ReconnectRequest request) {
						TransitionElement conn = (TransitionElement) request
								.getConnectionEditPart().getModel();
						CompartmentElement newSource = (CompartmentElement) getHost()
								.getModel();
						TransitionReconnectCommand cmd = new TransitionReconnectCommand(conn);
						cmd.setNewSource(newSource);
						return cmd;
					}

					/*
					 * (non-Javadoc)
					 * 
					 * @see
					 * org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy#
					 * getReconnectTargetCommand
					 * (org.eclipse.gef.requests.ReconnectRequest)
					 */
					protected Command getReconnectTargetCommand(
							ReconnectRequest request) {
						TransitionElement conn = (TransitionElement) request
								.getConnectionEditPart().getModel();
						CompartmentElement newTarget = (CompartmentElement) getHost()
								.getModel();
						TransitionReconnectCommand cmd = new TransitionReconnectCommand(conn);
						cmd.setNewTarget(newTarget);
						return cmd;
					}
				});
	}

	protected IFigure createFigure() {
		return new CompartmentFigure(getCastedModel());
	}


	private CompartmentElement getCastedModel() {
		return (CompartmentElement) getModel();
	}

	protected ConnectionAnchor getConnectionAnchor() {
		if (anchor == null) {
			anchor = new ChopboxAnchor(getFigure());
		}
		return anchor;
	}

	protected List<TransitionElement> getModelSourceConnections() {
		return getCastedModel().getSourceTransitions();
	}

	protected List<TransitionElement> getModelTargetConnections() {
		return getCastedModel().getTargetTransitions();
	}

	public ConnectionAnchor getSourceConnectionAnchor(
			ConnectionEditPart connection) {
		return getConnectionAnchor();
	}

	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
		return getConnectionAnchor();
	}

	public ConnectionAnchor getTargetConnectionAnchor(
			ConnectionEditPart connection) {
		return getConnectionAnchor();
	}

	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
		return getConnectionAnchor();
	}

	public void refreshVisuals() {
		CompartmentElement ce = getCastedModel();

		Rectangle bounds = new Rectangle(ce.getX(), ce.getY(), ce.getWidth(),
				ce.getHeight());
		((GraphicalEditPart) getParent()).setLayoutConstraint(this,
				getFigure(), bounds);

		((CompartmentFigure) getFigure())
				.setName(ce.getCompartment().getName());
	}

	@Override
	public void notifyChanged(Notification notification) {
		refreshVisuals();
		refreshSourceConnections();
		refreshTargetConnections();
	}

	@Override
	public Notifier getTarget() {
		return getCastedModel();
	}

	@Override
	public void setTarget(Notifier newTarget) {
	}

	@Override
	public boolean isAdapterForType(Object type) {
		return type instanceof CompartmentElement;
	}
}