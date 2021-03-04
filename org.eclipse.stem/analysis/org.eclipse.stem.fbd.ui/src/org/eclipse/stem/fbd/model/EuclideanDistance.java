package org.eclipse.stem.fbd.model;

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

public class EuclideanDistance implements Distance {

	private double travelFactor;

	public EuclideanDistance(double travelFactor) {
		this.travelFactor = travelFactor;
	}

	@Override
	public double calculateDistance(double[] x, double[] y) {
		if (x.length != y.length) {
			// vectors don't have same length - return error value
			return -1;
		}
		double d = 0;

		for (int i = 0; i < x.length; i++) {
			d += (x[i] - y[i]) * (x[i] - y[i]);
		}

		double z = 1;
		if (d != 0) {
			z = Math.pow(d, travelFactor / 2);
		}
		return z;
	}

}
