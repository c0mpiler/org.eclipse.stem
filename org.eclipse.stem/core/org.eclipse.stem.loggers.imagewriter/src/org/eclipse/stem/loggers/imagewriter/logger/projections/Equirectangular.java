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

import java.awt.geom.Rectangle2D;



/**
 * Implementation of Equirectangular map projection.  
 * In terms of the existing coordinate system implied
 * in the Globe system, this projection does nothing as
 * this is the implied base coordinate system
 * 
 * @see http://mathworld.wolfram.com/EquirectangularProjection.html
 *
 */
public class Equirectangular implements IMapProjection
{
	/**
	 * 
	 */
	public Equirectangular()
	{
		super();
	}

	/* (non-Javadoc)
	 * @see com.ibm.almaden.omniglobe.projection.IMapProjection#project(java.awt.geom.Point2D)
	 */
	public double[] project(double lat, double lon) 
	{
		return new double[] {lat,lon};
	}

	/* (non-Javadoc)
	 * @see com.ibm.almaden.omniglobe.projection.IMapProjection#project(java.awt.geom.Point2D, java.awt.geom.Point2D, boolean)
	 */
	public double[] project(double lat, double lon, double lat0, double lon0, boolean distort) 
	{
		return project(lat,lon);
	}

	/* (non-Javadoc)
	 * @see com.ibm.almaden.omniglobe.projection.IMapProjection#inverseProject(java.awt.geom.Point2D)
	 */
	public double[] inverseProject(double lat, double lon)
	{
		return new double[] {lat,lon};
	}
	
	/* (non-Javadoc)
	 * @see com.ibm.almaden.omniglobe.projection.IMapProjection#inverseProject(java.awt.geom.Point2D, java.awt.geom.Point2D, boolean)
	 */
	public double[] inverseProject(double lat, double lon, double lat0, double lon0, boolean distort)
	{
		return inverseProject(lat, lon);
	}
	
	/* (non-Javadoc)
	 * @see com.ibm.almaden.omniglobe.projection.IMapProjection#setOrigin(java.awt.geom.Point2D)
	 */
	public void setOrigin(double lat, double lon)
	{
		//projection is not origin-dependent
		//does nothing
	}
	
	/* (non-Javadoc)
	 * @see com.ibm.almaden.omniglobe.projection.IMapProjection#getBounds()
	 */
	public Rectangle2D getBounds() 
	{
		return new Rectangle2D.Double(-180.0,-90.0,360.0,180.0);
	}

}
