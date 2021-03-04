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
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;

public class ModelFigure extends Figure {
	private Label labelName = new Label();
	private Label labelModelType = new Label();

	private XYLayout layout;

	public ModelFigure() {
		layout = new XYLayout();
		setLayoutManager(layout);
		
		labelName.setForegroundColor(ColorConstants.blue);
		add(labelName);
		setConstraint(labelName, new Rectangle(5, 5, -1, -1));
		
		labelModelType.setForegroundColor(ColorConstants.lightBlue);
		add(labelModelType);
		setConstraint(labelModelType, new Rectangle(5, 17, -1, -1));
	
		setForegroundColor(ColorConstants.black);
		setBorder(new LineBorder(5));
	}

	public void setLayout(Rectangle rect) {
		setBounds(rect);
	}

	public void setName(String text) {
		labelName.setText(text);
	}

	public void setModelType(String text) {
		labelModelType.setText(text);
	}

	

}// ModelFigure
