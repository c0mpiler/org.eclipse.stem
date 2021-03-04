/******************************************************************************* 
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     IBM Corporation - initial API and implementation
 *     Bundesinstitut f�r Risikobewertung
 *******************************************************************************/

package org.eclipse.stem.ui.views.graphmap;

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import org.eclipse.emf.common.util.URI;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.graph.Edge;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLong;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLong.Segment;
import org.eclipse.stem.definitions.nodes.Region;

/**
 * A class that extends the LinkedList<stemPolygon> class. It has some fields
 * that help in managing the polygons list of a map, such as the offset needed
 * to be made in order to centralize the map, the optimum values of the map
 * coordinates, etc.
 * 
 */
public class StemPolygonList extends ArrayList<StemPolygon> {

	private static final long serialVersionUID = 1L;

	/**
	 * Empty Constructor
	 */
	public StemPolygonList() {
		super();
	}

	/**
	 * Constructor which gets a LatLong object and constructs a list of polygons
	 * 
	 * @param latLongData
	 * @param identifiable
	 *            the <code>Identifiable</code> that is associated with the
	 *            polygon data.
	 */
	public StemPolygonList(LatLong latLongData, Identifiable identifiable) {
		super();

		for (Segment latLongSegment : latLongData.getSegments()) {
			add(new StemPolygon(latLongSegment, identifiable));
		}
	}

	/**
	 * @return the bounding box that contains all of the polygons in the list.
	 */
	public Rectangle2D.Double getBounds() {
		Rectangle2D.Double bounds = null;

		for (StemPolygon polygon : this) {
			// Only update the bounds for polygon of nodes
			if (polygon.getIdentifiable() instanceof Edge) {
				continue;
			}

			if (bounds != null) {
				bounds = (Rectangle2D.Double) bounds.createUnion(polygon
						.getBounds());
			} else {
				bounds = polygon.getBounds();
			}
		}

		return bounds;
	}

	/**
	 * @param latLongPosition
	 *            the position contained by a polygon (or not)
	 * @return the polygon that contains the point, or <code>null</code> if the
	 *         point lies outside of a polygon.
	 */
	public StemPolygon getContainingRegionPolygon(Point2D.Double latLongPosition) {
		StemPolygon polygon = null;
		double minArea = Double.POSITIVE_INFINITY;

		for (StemPolygon p : this) {
			if (p.getIdentifiable() instanceof Region
					&& p.containsPoint(latLongPosition)) {
				if (p.getArea() < minArea) {
					polygon = p;
					minArea = p.getArea();
				}
			}
		}

		return polygon;
	}

	public void setValueToDisplay(double valueToDisplay) {
		for (StemPolygon p : this) {
			p.setValueToDisplay(valueToDisplay);
		}
	}

	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}

		if (!(o instanceof StemPolygonList)) {
			return false;
		}

		StemPolygonList list = (StemPolygonList) o;
		int n = size();

		if (n != list.size()) {
			return false;
		}

		for (int i = 0; i < n; i++) {
			URI uri1 = get(i).getIdentifiable().getURI();
			URI uri2 = list.get(i).getIdentifiable().getURI();
			
			if (!uri1.equals(uri2))  {
				return false;
			}
		}
		
		return true;
	}

}
