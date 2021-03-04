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
package org.eclipse.stem.loggers.imagewriter.logger.projections;

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;


/**
 * Interface to provide support for multiple differing
 * types of map projections.  The main purpose of implementations
 * is to support point transformations from geo coordinates (latitude and longitude)
 * into a target projection coordinate system (and reverse, if possible).
 *
 */
public interface IMapProjection 
{
	/**
	 * Boundaries of the map projection
	 * @return
	 */
	public Rectangle2D getBounds();
	
	/**
	 * Sets the default origin point of the projection, if supported
	 * @param origin
	 */
	public void setOrigin(double lat, double lon);

	/**
	 * Transform a point from geo coordinates  into the target 
	 * coordinate system using a fixed projection.  If the projection
	 * is origin-dependent, then the default (or previously set) 
	 * origin is used.
	 * 
	 * @param coord Point value to transform
	 * @return New transformed point
	 */
	public double[] project(double lat, double lon);
	
	/**
	 * Transform and distort a point from geo coordinates into the target 
	 * coordinate system using a fixed projection.  If the projection
	 * is origin-dependent, use the specified origin.
	 * 
	 * @param coord Point value to transform
	 * @param origin Origin point of the projection (might be optional)
	 * @param distort Whether to perform additional distortion
	 * @return New transformed point
	 */
	public double[] project(double lat, double lon, double lat0, double lon0, boolean distort);
	
	/**
	 * Performs an inverse projection from the current projection 
	 * back to a base geographic coordinate.  If the projection is 
	 * origin-dependent, then use the default (or previously set)
	 * origin value.
	 * 
	 * WARNING
	 * If the value passed to {@link #inverseProject(Point2D)}inverseProject 
	 * is the result of a previous {@link #project(Point2D)} and the
	 * origin has changed, the values may not be equal.
	 * 
	 * @param coord Projected point to transform
	 * @return Unprojected geographic coordinate
	 */
	public double[] inverseProject(double lat, double lon);
	
	/**
	 * Performs an inverse projection from the current projection 
	 * back to a base geographic coordinate.  If the projection is 
	 * origin-dependent, then use specified origin parameter.
	 * 
	 * WARNING
	 * If the value passed to {@link #inverseProject(Point2D)}inverseProject 
	 * is the result of a previous {@link #project(Point2D)} and the
	 * origin has changed, the values may not be equal.
	 * 
	 * @param coord Projected point to transform
	 * @param origin Origin point of the projection (might be optional)
	 * @param distort Whether to perform additional distortion
	 * @return Unprojected geographic coordinate
	 */
	public double[] inverseProject(double lat, double lon, double lat0, double lon0, boolean distort);
}
