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
package org.eclipse.stem.model.ui.editor.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.stem.model.metamodel.Transition;
import org.eclipse.stem.model.ui.editor.vismodel.TransitionElement;

public class TransitionFigure extends PolylineConnection
{
	protected TransitionElement element;
	
	public TransitionFigure(TransitionElement transitionElement) {
		this.element = transitionElement;
		setTargetDecoration(new PolygonDecoration());
		setLineWidth(2);
		setOutline(true);
		updateFlags();
	}
	
	public void updateFlags() {
		setForegroundColor(ColorConstants.black);
		Transition transition = element.getTransition();
		if (transition != null) {
			Resource resource = transition.getExpressionResource();
			
			if (resource != null) {
				if (resource.getErrors().size() > 0) {
					setForegroundColor(ColorConstants.red);
				} else if (resource.getWarnings().size() > 0) {
					setForegroundColor(ColorConstants.orange);
				} else {
					setForegroundColor(ColorConstants.black);
				}
			} else {
				setForegroundColor(ColorConstants.black);
			}
		} else {
			setForegroundColor(ColorConstants.black);
		}
		
	}
}
