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

import org.eclipse.draw2d.ConnectionLayer;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.ShortestPathConnectionRouter;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.RootComponentEditPolicy;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.stem.model.metamodel.Model;
import org.eclipse.stem.model.ui.editor.commands.CompartmentCreateCommand;
import org.eclipse.stem.model.ui.editor.commands.CompartmentSetConstraintCommand;
import org.eclipse.stem.model.ui.editor.controls.ModelParametersEditorDialog;
import org.eclipse.stem.model.ui.editor.vismodel.CompartmentElement;
import org.eclipse.stem.model.ui.editor.vismodel.ModelElement;
import org.eclipse.swt.widgets.Display;

public class ModelElementEditPart extends AbstractGraphicalEditPart implements
		Adapter {

	@Override
	public void performRequest(Request req) {
		super.performRequest(req);
		if (req.getType().equals(REQ_OPEN)) {
			// Execute open on the model
			ModelElement me = getCastedModel();
			Model m = me.getModel();
			ModelParametersEditorDialog dialog = new ModelParametersEditorDialog(
					Display.getCurrent().getActiveShell(), m);
			dialog.open();
			refreshVisuals();
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#activate()
	 */
	public void activate() {
		if (!isActive()) {
			super.activate();
			getCastedModel().eAdapters().add(this);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#deactivate()
	 */
	public void deactivate() {
		if (isActive()) {
			super.deactivate();
			getCastedModel().eAdapters().remove(this);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
	 */
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.COMPONENT_ROLE,
				new RootComponentEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new ShapesXYLayoutEditPolicy());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
	 */
	protected IFigure createFigure() {
		final Figure canvas = new FreeformLayer();
		canvas.setBorder(new MarginBorder(3));
		canvas.setLayoutManager(new FreeformLayout());

		ConnectionLayer connLayer = (ConnectionLayer) getLayer(LayerConstants.CONNECTION_LAYER);
		connLayer.setConnectionRouter(new ShortestPathConnectionRouter(canvas));

		return canvas;
	}

	private ModelElement getCastedModel() {
		return (ModelElement) getModel();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.AbstractEditPart#getModelChildren()
	 */
	protected List<CompartmentElement> getModelChildren() {
		return getCastedModel().getCompartmentElements();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.common.notify.Adapter#notifyChanged(org.eclipse.emf.common
	 * .notify.Notification)
	 */
	@Override
	public void notifyChanged(Notification notification) {
		refreshChildren();
		refreshSourceConnections();
		refreshTargetConnections();
		refreshVisuals();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.common.notify.Adapter#getTarget()
	 */
	@Override
	public Notifier getTarget() {
		return getCastedModel();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.common.notify.Adapter#setTarget(org.eclipse.emf.common
	 * .notify.Notifier)
	 */
	@Override
	public void setTarget(Notifier newTarget) {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.common.notify.Adapter#isAdapterForType(java.lang.Object)
	 */
	@Override
	public boolean isAdapterForType(Object type) {
		return type instanceof ModelElement;
	}

	private static class ShapesXYLayoutEditPolicy extends XYLayoutEditPolicy {

		protected Command createChangeConstraintCommand(
				ChangeBoundsRequest request, EditPart child, Object constraint) {
			if (child instanceof CompartmentElementEditPart
					&& constraint instanceof Rectangle) {
				return new CompartmentSetConstraintCommand(
						(CompartmentElement) child.getModel(), request,
						(Rectangle) constraint);
			}
			return super.createChangeConstraintCommand(request, child,
					constraint);
		}

		protected Command createChangeConstraintCommand(EditPart child,
				Object constraint) {
			return null;
		}

		protected Command getCreateCommand(CreateRequest request) {
			Object childClass = request.getNewObjectType();
			if (childClass == CompartmentElement.class) {
				return new CompartmentCreateCommand(
						(CompartmentElement) request.getNewObject(),
						(ModelElement) getHost().getModel(),
						(Rectangle) getConstraintFor(request));
			}
			return null;
		}

	}
}