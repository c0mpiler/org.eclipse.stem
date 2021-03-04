package org.eclipse.stem.definitions.lattice;

import org.eclipse.stem.core.graph.Graph;


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



public interface GraphLatticeGeneratorInterface {
	
	/**
	 * By convention all Lattices will use URI's that begin with
	 * "LAT_".
	 * The type of lattice will then be appended. For example a Square Lattice
	 * will have a URI that begins
	 * "LAT_SQR_"
	 * and a Triangle Lattice will have nodes with URI
	 * "LAT_TRI".
	 * The separator character is "_" instead of "-" as used in geo URI's because
	 * all nodes in any lattice are level 0 nodes (there is no containment relationship regardless
	 * of lattice size).
	 */
	public static final String URI_PREFIX="LAT_";
	
	/** 
	 * Lattice type
	 */
	public static final String SQR_LATTICE_TYPE="Square Lattice";
	
	/** 
	 * Lattice type
	 */
	public static final String GLOBE_LATTICE_TYPE="Plate Carree";
	
	
	/** 
	 * Lattice type
	 */
	public static final String TRI_LATTICE_TYPE="Triangle Lattice";
	
	/**
	 *
	 * returns a square lattice of specified size as a graph
	 *
	 * @param xSize
	 * @param ySize
	 * @param area
	 * @param addNearestNeighbors
	 * @param addNextNearestNeighbors
	 * @param periodicBoundaries
	 * @return
	 */
	public abstract Graph getGraph(int xSize, int ySize, double area, boolean addNearestNeighbors, boolean addNextNearestNeighbors, boolean periodicBoundaries);

}