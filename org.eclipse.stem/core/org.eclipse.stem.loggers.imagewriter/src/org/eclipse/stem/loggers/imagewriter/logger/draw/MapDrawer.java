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
package org.eclipse.stem.loggers.imagewriter.logger.draw;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.imageio.ImageIO;

import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.DynamicNodeLabel;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.loggers.imagewriter.ProjectedMapImageLogger;
import org.eclipse.stem.loggers.imagewriter.logger.PolygonHandler;
import org.eclipse.stem.loggers.imagewriter.logger.PolygonHandler.ProjectedPolygons;
import org.eclipse.stem.loggers.imagewriter.logger.projections.IMapProjection;
import org.eclipse.stem.ui.adapters.color.ColorProviderAdapter;
import org.eclipse.stem.ui.adapters.color.STEMColor;

public class MapDrawer 
{
	private static final float MAX_ALPHA_VALUE = 0.75f;
	
	private final ProjectedMapImageLogger logger;
	
	private BufferedImage img;
	private Graphics2D gc;
	private AffineTransform tx;
	
	private ColorProviderAdapter colorProvider;
	private Decorator decorator;
	
	private List<ProjectedPolygons> cachedProjectedPolygons = new LinkedList<ProjectedPolygons>();
	
	private IMapProjection projection;
	private Rectangle2D mapBounds;
	
	// Image Size Parameters
	private int imageWidth;
	private int imageHeight;
	
	// Projection parameters
	//private boolean useProjectionBounds = false;
	//private boolean forceAspectRatio = true;

	
	// Canvas color parameters
	private Color defaultBorderColor = Color.yellow;
	private Color defaultBackgroundColor = Color.black;
	
	private float borderTransparency = 0.25f;
	//private boolean useTransparentBackground = false;

	// Simulation color parameters
	//private boolean useLogScaling = true;
	private float gainFactor = 1.0f;
	
	private AlphaComposite borderCompositeAlpha;
	
	private boolean running = true;
	
	public MapDrawer(Decorator decorator, ProjectedMapImageLogger logger, IMapProjection projection)
	{
		this.projection = projection;
		this.logger = logger;
		this.decorator = decorator;
		
		init();
	}
	
	
	private void prepareShapes()
	{
		for (DynamicLabel label : decorator.getLabelsToUpdate()) {
			if (label instanceof DynamicNodeLabel) {
				ProjectedPolygons pp = PolygonHandler.getPolygonsForProjection(projection, (DynamicNodeLabel)label);
				if (pp != null) {
					cachedProjectedPolygons.add(pp);
				}
			}
		}
	}
	
	private Rectangle2D getBoundsForProjection()
	{
		return projection.getBounds();
	}
	
	private Rectangle2D getBoundsForPolygons()
	{
		Rectangle2D bounds = null;
		for (ProjectedPolygons pp : cachedProjectedPolygons) {
			Rectangle2D shapeBounds = pp.getBoundingBox();
			if (shapeBounds != null) {
				if (bounds == null) {
					bounds = shapeBounds;
				} else {
					bounds = bounds.createUnion(shapeBounds);
				}
			}
		}
		
		if (bounds == null) {
			return getBoundsForProjection();
		}
		
		return bounds;
	}
	
	private void init()
	{
		prepareShapes();

		// Get the boundaries for the map space
		if (logger.isFitToShapeBounds()) {
			// Otherwise, we want to fit the bounds to the bounding box of the
			// polygons to be drawn
			mapBounds = getBoundsForPolygons();
		} else {
			// If configured to show the "whole earth", then we want to 
			// get the projection boundaries from the map projection
			mapBounds = getBoundsForProjection();
		}
				
		imageWidth = logger.getWidth();
		imageHeight = logger.getHeight();

		// If configured to hold aspect, then re-calculate the image width/height based on the shortest
		// edge of the map projection boundaries
		if (logger.isForceAspectRatio()) {
			double aspect = Math.min(imageWidth / mapBounds.getWidth(), imageHeight / mapBounds.getHeight());
			imageWidth = (int)(mapBounds.getWidth() * aspect);
			imageHeight = (int)(mapBounds.getHeight() * aspect);
		}
		
		// Calculate the transform from map (projected geographic) coordinates to image coordinates
		tx = new AffineTransform();
		tx.scale(imageWidth / mapBounds.getWidth(), imageHeight / mapBounds.getHeight());
		tx.translate(-mapBounds.getX(), -mapBounds.getY());
		
		// Create the buffered image to back the drawing
		img = new BufferedImage(imageWidth,imageHeight, BufferedImage.TYPE_INT_ARGB);
		gc = img.createGraphics();



		gainFactor = logger.getGain();
		if (gainFactor <= 0f) {
			gainFactor = 1.0f;
		}
		
		int borderTransparency = logger.getBorderTransparency();
		if (borderTransparency < 1) {
			borderTransparency = 1;
		}
		if (borderTransparency > 99) {
			borderTransparency = 99;
		}

		this.borderTransparency = (float)borderTransparency / 100.0f;

		// Set the border transparency level
		borderCompositeAlpha = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f - this.borderTransparency);
		
		reset();
	}
	
	
	public void setColorProvider(ColorProviderAdapter cp)
	{
		this.colorProvider = cp;
	}
	
	public void reset()
	{
		if (gc != null && img != null) {
			gc.setBackground(Color.white);
			gc.clearRect(0,0, img.getWidth(), img.getHeight());
		}
		
//		gc.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f));
//		gc.setBackground(Color.black);
//		gc.setPaint(Color.black);
//		gc.fillRect(0, 0, imageWidth,imageHeight);
	}
	

	public void save(File imagePath, String imageFormat)
	{
		if (img != null) {
			try {
				ImageIO.write(img, imageFormat, imagePath);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public void close()
	{
		running = false;
	}
	

	private void drawBackground()
	{
		if (logger.isTransparentBackground()) {
			return;
		}
		
		Color backgroundColor;
		STEMColor backgroundColorStem = colorProvider.getBackgroundFillColor();
		if (backgroundColorStem != null) {
			backgroundColor = backgroundColorStem.toAWTColor();
		} else {
			backgroundColor = defaultBackgroundColor;
		}
		
		
		gc.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f));
		gc.setBackground(backgroundColor);
		gc.setPaint(backgroundColor);
		gc.fillRect(0, 0, imageWidth,imageHeight);
		
	}
	
	private Color getBorderColor()
	{
		Color borderColor;
		STEMColor borderColorStem = colorProvider.getBorderColor();
		if (borderColorStem != null) {
			borderColor = borderColorStem.toAWTColor();
		} else {
			borderColor = defaultBorderColor;
		}
		
		return borderColor;
	}
	
	public void draw()
	{
		if (running) {
			reset();
			Composite heldComposite = gc.getComposite();
			drawBackground();
			
			Color borderColor = getBorderColor();
			
			for (ProjectedPolygons node : cachedProjectedPolygons) {
				if (!running) {
					break;
				}
				for (Shape polygon : node.polygons) {	
					if (!running) {
						break;
					}
					Shape projectedShape = tx.createTransformedShape(polygon);
					colorProvider.setTarget(node.identifiable);
					STEMColor color = colorProvider.getColor(gainFactor, logger.isLogScaling());
					
					gc.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, color.getAlpha() * MAX_ALPHA_VALUE));
					gc.setColor(color.toAWTColor());
					gc.fill(projectedShape);
					
					gc.setComposite(borderCompositeAlpha);
					gc.setColor(borderColor);
					gc.draw(projectedShape);
				}
			}	
			
			gc.setComposite(heldComposite);
		}
		
		if (!running) {
			if (img != null) {
				img.flush();
				img = null;
			}
			if (gc != null) {
				gc.dispose();
				gc = null;
			}			
		}
	}

	
}
