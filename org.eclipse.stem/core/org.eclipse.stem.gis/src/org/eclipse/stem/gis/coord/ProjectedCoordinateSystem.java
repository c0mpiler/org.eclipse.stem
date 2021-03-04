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

import java.util.Properties;

public class ProjectedCoordinateSystem extends CoordinateSystem
{
	private GeographicCoordinateSystem gcs;
	private String projectionName;
	private Properties props;
	private double unitScalar;
	
	public ProjectedCoordinateSystem(String name, GeographicCoordinateSystem gcs,
			String projectionName, double unitScalar,
			 Properties props) {
		super(name);
		this.gcs = gcs;
		this.name = name;
		this.projectionName = projectionName;
		this.props = props;
		this.unitScalar = unitScalar;
	}

	public GeographicCoordinateSystem getGeoCoordinateSystem() {
		return gcs;
	}

	public String getProjectionName() {
		return projectionName;
	}
	
	public Properties getProperties() {
		return props;
	}

	public double getUnitScalar() {
		return unitScalar;
	}

	@Override
	public String toString() {
		return "ProjectedCoordinateSystem [name=" + name + ", gcs=" + gcs
				+ ", projectionName=" + projectionName + ", props=" + props
				+ ", unitScalar=" + unitScalar + "]";
	}
	

	
}
