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
package org.eclipse.stem.gis.coord;

public class GeographicCoordinateSystem extends CoordinateSystem
{
	private Ellipsoid datum;
	private double primeMerdianOffset;
	private double unitScalar;
	
	public GeographicCoordinateSystem(String name, Ellipsoid geodesy,
			double primeMerdianOffset, double unitScalar) {
		super(name);
		this.datum = geodesy;
		this.primeMerdianOffset = primeMerdianOffset;
		this.unitScalar = unitScalar;
	}

	public Ellipsoid getDatum() {
		return datum;
	}

	public double getPrimeMerdianOffset() {
		return primeMerdianOffset;
	}

	public double getUnitScalar() {
		return unitScalar;
	}

	@Override
	public String toString() {
		return "GeographicCoordinateSystem [name=" + name + ", datum="
				+ datum + ", primeMerdianOffset=" + primeMerdianOffset
				+ ", unitScalar=" + unitScalar + "]";
	}
	

}
