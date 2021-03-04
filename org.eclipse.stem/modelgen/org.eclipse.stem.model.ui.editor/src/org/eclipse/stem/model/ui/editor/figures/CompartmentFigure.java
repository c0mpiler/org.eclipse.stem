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

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.stem.model.ui.editor.vismodel.CompartmentElement;
import org.eclipse.stem.model.ui.editor.vismodel.provider.VisualMetamodelEditPlugin;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;

public class CompartmentFigure extends Figure {
	private Label labelName = new Label();
	private Label labelCompartmentType = new Label();
	private Label inheritedLabel;
	
	private RGB blackColor = new RGB(0, 0, 0);
	
	private CompartmentElement element;
	
	private static Image lockIcon;
	
	public CompartmentFigure(CompartmentElement element) {
		this.element = element;
		
		if (lockIcon == null) {

			lockIcon = ExtendedImageRegistry.INSTANCE.getImage(VisualMetamodelEditPlugin.INSTANCE.getImage("LockIcon12"));
		}
		
		BorderLayout layout = new BorderLayout();
		layout.setHorizontalSpacing(3);
		layout.setVerticalSpacing(3);
		layout.setObserveVisibility(true);
		setLayoutManager(layout);
		
		labelName.setForegroundColor(ColorConstants.black);
		add(labelName, BorderLayout.CENTER);
//		setConstraint(labelName, new Rectangle(5, 5, -1, -1));
		
		
		labelCompartmentType.setForegroundColor(ColorConstants.black);
		add(labelCompartmentType, BorderLayout.TOP);
//		setConstraint(labelCompartmentType, new Rectangle(5, 15, -1, -1));
		
		LineBorder border = new LineBorder();
		border.setStyle(Graphics.LINE_SOLID);
		border.setWidth(2);
		setBorder(border);
		
		if (element.isInherited()) {
			border.setStyle(Graphics.LINE_DASHDOT);
			border.setColor(ColorConstants.darkGray);
			labelName.setForegroundColor(ColorConstants.darkGray);
			labelCompartmentType.setForegroundColor(ColorConstants.darkGray);
			inheritedLabel = new Label();
			inheritedLabel.setIcon(lockIcon);
			add(inheritedLabel, BorderLayout.BOTTOM);

		}
		
		
		setForegroundColor(new Color(null, blackColor));
		setBackgroundColor(new Color(null, getCompartmentColor()));
		setOpaque(true);
		setName(element.getCompartment().getName());
		setCompartmentType(element.getCompartment().getType().getName());
	}

	public void setName(String text) {
		labelName.setText(text);
	}
	
	public void setCompartmentType(String type) {
		labelCompartmentType.setText(type);
	}

	public void setLayout(Rectangle rect) {
		getParent().setConstraint(this, rect);
	}
	
	private RGB getCompartmentColor()
	{
		switch (element.getCompartment().getType()) {
		case DEATHS:
			return new RGB(224,61,63);
		case INCIDENCE:
			return new RGB(51,204,102);
		case DERIVED:
			return new RGB(252,210,224);			
		case STANDARD:
		default:
			return new RGB(153,153,255);
		}
	}
	
}