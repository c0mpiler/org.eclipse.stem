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

import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLong.Segment;

/**
 * A sub-class of java.awt.Polygon that has an extra field saving the relative
 * value of the polygon. The relative values could be used for intensity values
 * of the labels.
 */
public class StemPolygon {

	/**
	 * An array of all points (better used by SWT drawing)
	 */
	public double[] points = null;
	/**
	 * An array of all points, transformed to scale and offsets
	 */
	public int[] transformedPoints = null;

	/**
	 * This is the {@link Identifiable} instance associated with the polygon.
	 */
	private Identifiable identifiable;

	private double valueToDisplay;

	private double minX = Double.POSITIVE_INFINITY;
	private double minY = Double.POSITIVE_INFINITY;
	private double maxX = Double.NEGATIVE_INFINITY;
	private double maxY = Double.NEGATIVE_INFINITY;
	private double area;

	/**
	 * Gets a list of a latLongData arrays, and transforms it into a Polygon.
	 * 
	 * @param latLongSegment
	 * @param identifiable
	 *            the {@link Identifiable} associated with the polygon.
	 */
	public StemPolygon(Segment latLongSegment, Identifiable identifiable) {
		int size = latLongSegment.size();

		this.identifiable = identifiable;
		valueToDisplay = Double.NaN;
		points = new double[2 * size];
		area = 0.0;

		for (int i = 0; i < size; i++) {
			double x1 = latLongSegment.longitude(i);
			double y1 = latLongSegment.latitude(i);

			points[2 * i] = x1;
			points[2 * i + 1] = y1;
			maxX = Math.max(x1, maxX);
			maxY = Math.max(y1, maxY);
			minX = Math.min(x1, minX);
			minY = Math.min(y1, minY);

			if (i < size - 1) {
				double x2 = latLongSegment.longitude(i + 1);
				double y2 = latLongSegment.latitude(i + 1);

				area += x1 * y2 - x2 * y1;
			}
		}

		area = Math.abs(area / 2.0);
	}

	/**
	 * @param pointsTransformer
	 *            the pointsTransformer to set
	 */
	public void computeTransformedPoints(double offsetX, double offsetY,
			double scaleX, double scaleY) {
		transformedPoints = new int[getNumberOfPoints() * 2];

		for (int i = 0; i < getNumberOfPoints(); i++) {
			transformedPoints[2 * i] = (int) (points[2 * i] * scaleX + offsetX);
			transformedPoints[2 * i + 1] = (int) (points[2 * i + 1] * scaleY + offsetY);
		}
	}

	/**
	 * @return the <code>Identifiable</code>
	 */
	public Identifiable getIdentifiable() {
		return identifiable;
	}

	public double getValueToDisplay() {
		return valueToDisplay;
	}

	public void setValueToDisplay(double valueToDisplay) {
		this.valueToDisplay = valueToDisplay;
	}

	/**
	 * The method returns the smallest {@link Rectangle} that bounds of the
	 * polygon.
	 * 
	 * @return {@link Rectangle} of the bounds of the polygon
	 */
	public Rectangle2D.Double getBounds() {
		if (minX == Integer.MAX_VALUE || maxX == Integer.MIN_VALUE
				|| minY == Integer.MAX_VALUE || maxY == Integer.MIN_VALUE) {
			return null;
		}

		return new Rectangle2D.Double(minX, minY, (maxX - minX), (maxY - minY));
	}

	public double getArea() {
		return area;
	}

	/**
	 * Returns whether the point (x,y) is contained inside this polygon.
	 * 
	 * @param point
	 *            the X and Y coordinates
	 * @return whether the point (x,y) is contained in this polygon
	 */
	public boolean containsPoint(Point2D.Double point) {
		int n = getNumberOfPoints();
		double[] xs = new double[n];
		double[] ys = new double[n];
		double x = point.x;
		double y = point.y;

		for (int i = 0; i < n; i++) {
			xs[i] = points[2 * i];
			ys[i] = points[2 * i + 1];
		}

		int hits = 0;
		double x1 = xs[n - 1];
		double y1 = ys[n - 1];

		for (int i = 0; i < n; i++) {
			double x2 = xs[i];
			double y2 = ys[i];

			if (y == y2) {
				if (x < x2) {
					double y3 = ys[(i + 1) % n];

					if (y > Math.min(y1, y3) && y < Math.max(y1, y3)) {
						hits++;
					}
				}
			} else {
				if (y > Math.min(y1, y2) && y < Math.max(y1, y2)) {
					double xProjection = (x2 - x1) / (y2 - y1) * (y - y1) + x1;

					if (x < xProjection) {
						hits++;
					}
				}
			}

			x1 = x2;
			y1 = y2;
		}

		return hits % 2 != 0;
	}

	/**
	 * Returns the number of lat/long points that this polygon has
	 * 
	 * @return the number of lat/long points
	 */
	public int getNumberOfPoints() {
		if (points == null) {
			return 0;
		}

		return points.length / 2;
	}

	public boolean isSquare() {
		final double EPSILON = 1e-2;

		if (getNumberOfPoints() != 5) {
			return false;
		}

		Point2D.Double p1 = new Point2D.Double(points[0], points[1]);
		Point2D.Double p2 = new Point2D.Double(points[2], points[3]);
		Point2D.Double p3 = new Point2D.Double(points[4], points[5]);
		Point2D.Double p4 = new Point2D.Double(points[6], points[7]);
		double d1 = p1.distance(p2);
		double d2 = p2.distance(p3);
		double d3 = p3.distance(p4);
		double d4 = p4.distance(p1);
		double dot = (p2.x - p1.x) * (p3.x - p2.x) + (p2.y - p1.y)
				* (p3.y - p2.y);

		return Math.abs(d1 - d2) < EPSILON && Math.abs(d2 - d3) < EPSILON
				&& Math.abs(d3 - d4) < EPSILON && Math.abs(dot) < EPSILON;
	}

}
