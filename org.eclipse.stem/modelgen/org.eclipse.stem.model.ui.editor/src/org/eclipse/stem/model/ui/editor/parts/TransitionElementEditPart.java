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

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gef.editpolicies.ConnectionEditPolicy;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.eclipse.stem.model.metamodel.MetamodelPackage;
import org.eclipse.stem.model.ui.editor.commands.TransitionDeleteCommand;
import org.eclipse.stem.model.ui.editor.figures.TransitionFigure;
import org.eclipse.stem.model.ui.editor.vismodel.TransitionElement;

public class TransitionElementEditPart extends AbstractConnectionEditPart {


	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#activate()
	 */
	public void activate() {
		if (!isActive()) {
			super.activate();
			getCastedModel().eAdapters().add(transitionElementListener);
			getCastedModel().getTransition().eAdapters().add(transitionListener);
		}
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#deactivate()
	 */
	public void deactivate() {
		if (isActive()) {
			getCastedModel().eAdapters().remove(transitionElementListener);
			getCastedModel().getTransition().eAdapters().remove(transitionListener);
			super.deactivate();
		}
	}


	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
	 */
	protected void createEditPolicies() {
		// Selection handle edit policy.
		// Makes the connection show a feedback, when selected by the user.
		installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE,
				new ConnectionEndpointEditPolicy());
		// Allows the removal of the connection model element
		installEditPolicy(EditPolicy.CONNECTION_ROLE,
				new ConnectionEditPolicy() {
					protected Command getDeleteCommand(GroupRequest request) {
						return new TransitionDeleteCommand(getCastedModel());
					}
				});
	}


	/* (non-Javadoc)
	 * @see org.eclipse.gef.editparts.AbstractConnectionEditPart#createFigure()
	 */
	protected IFigure createFigure() {
		return new TransitionFigure(getCastedModel());
	}

	private TransitionElement getCastedModel() {
		return (TransitionElement)getModel();
	}
	
	private TransitionFigure getCastedFigure() {
		return (TransitionFigure)getFigure();
	}
	
	
	private Adapter transitionElementListener = new AdapterImpl() {
		@Override
		public void notifyChanged(Notification msg) {
			refreshSourceConnections();
			refreshTargetConnections();
			refresh();			
		}
	};
	
	private Adapter transitionListener = new AdapterImpl() {

		@Override
		public void notifyChanged(Notification msg) {
			if (msg.getFeature() == MetamodelPackage.Literals.TRANSITION__EXPRESSION
					|| msg.getFeature() == MetamodelPackage.Literals.TRANSITION__EXPRESSION_RESOURCE) {
				getCastedFigure().updateFlags();
				refresh();
			}
			
		}
		
	};

}