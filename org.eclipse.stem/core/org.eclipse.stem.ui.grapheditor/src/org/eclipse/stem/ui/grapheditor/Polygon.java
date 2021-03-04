/******************************************************************************* 
 * Copyright (c) 2012 Bundesinstitut für Risikobewertung. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     Bundesinstitut für Risikobewertung - initial API and implementation 
 *******************************************************************************/

package org.eclipse.stem.ui.grapheditor;

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import org.eclipse.stem.definitions.adapters.spatial.geo.LatLong.Segment;

public class Polygon {

	public int npoints;
	public double[] x;
	public double[] y;

	private double area;
	private double cx;
	private double cy;
	private double xMin;
	private double yMin;
	private double xMax;
	private double yMax;

	public Polygon(Segment segment) {
		getPolygon(segment);
		computeAreaAndCentroid();
		computeMinAndMax();
	}

	public double getArea() {
		return area;
	}

	public Point2D.Double getCentroid() {
		return new Point2D.Double(cx, cy);
	}

	public Rectangle2D.Double getBounds() {
		return new Rectangle2D.Double(xMin, yMin, xMax - xMin, yMax - yMin);
	}

	/**
	 * all lat long data as a single string for file output
	 * 
	 * @return all lat long data as a single string
	 */
	public String getData() {
		StringBuffer sb = new StringBuffer(npoints * 24);

		for (int i = 0; i < npoints; i++) {
			sb.append(y[i] + " " + x[i] + " ");
		}		

		return sb.substring(0, sb.length() - 1);
	}

	private void getPolygon(Segment segment) {
		npoints = segment.size();
		y = new double[npoints];
		x = new double[npoints];

		for (int i = 0; i < npoints; i++) {
			y[i] = segment.latitude(i);
			x[i] = segment.longitude(i);
		}

		// check if it is a polygon, repair if necessary
		if (y[0] != y[npoints - 1] || x[0] != x[npoints - 1]) {
			double[] y_new = new double[npoints + 1];
			double[] x_new = new double[npoints + 1];

			for (int i = 0; i < npoints; i++) {
				y_new[i] = y[i];
				x_new[i] = x[i];
			}

			y_new[npoints] = y[0];
			x_new[npoints] = x[0];
			x = x_new;
			y = y_new;
			npoints++;
		}
	}

	private void computeAreaAndCentroid() {
		area = 0.0;
		cx = 0.0;
		cy = 0.0;

		for (int i = 0; i < npoints - 1; i++) {
			double mem = x[i] * y[i + 1] - x[i + 1] * y[i];

			area += mem;
			cx += (x[i] + x[i + 1]) * mem;
			cy += (y[i] + y[i + 1]) * mem;
		}

		area /= 2.0;
		cx /= 6 * area;
		cy /= 6 * area;

		// area is negative if points are ordered clockwise, nevertheless cx and
		// cy are correct
		area = Math.abs(area);
	}

	private void computeMinAndMax() {
		xMin = x[0];
		yMin = y[0];
		xMax = x[0];
		yMax = y[0];

		for (int i = 1; i < npoints; i++) {
			xMin = Math.min(xMin, x[i]);
			yMin = Math.min(yMin, y[i]);
			xMax = Math.max(xMax, x[i]);
			yMax = Math.max(yMax, y[i]);
		}
	}

}
