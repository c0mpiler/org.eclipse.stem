package org.eclipse.stem.fbd.model.retail;

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

import java.util.ArrayList;
import java.util.List;

public class RetailManager {

	private int noOfRetailLocations;
	private List<RetailLocation> retailLocations;
	private static RetailManager instance;

	private RetailManager() {
		this.retailLocations = new ArrayList<RetailLocation>();
	}

	public static final synchronized RetailManager getInstance() {
		if (RetailManager.instance == null) {
			RetailManager.instance = new RetailManager();
		}
		return RetailManager.instance;
	}

	public RetailLocation getRetailLocation(int retailID) {
		return this.retailLocations.get(retailID);
	}

	public int getIdForRetailLocation(RetailLocation retLoc) {
		return this.retailLocations.indexOf(retLoc);
	}

	public RetailLocation createRetailLocation(int[] coordinates,
			double attractionFactor) {
		int id = this.retailLocations.size();
		RetailLocation retLoc = new RetailLocation(id, attractionFactor,
				coordinates, this.noOfRetailLocations);
		this.retailLocations.add(retLoc);
		return retLoc;
	}

	public void setNoOfRetailLocations(int no) {
		this.noOfRetailLocations = no;
	}

	public List<RetailLocation> getRetailLocations() {
		return this.retailLocations;
	}

	public int getNoOfRetailLocations() {
		return this.retailLocations.size();
	}

	public static final int[][] getRetailLocationAssignments(int gridSizeX,
			int gridSizeY, int[][] distPos) {
		int[][] retAssignments = new int[gridSizeX][gridSizeY];
		for (int x = 0; x < gridSizeX; x++) {
			for (int y = 0; y < gridSizeY; y++) {
				int minDist = (distPos[0][0] - x) * (distPos[0][0] - x)
						+ (distPos[0][1] - y) * (distPos[0][1] - y);
				int assignedDist = 0;
				for (int z = 1; z < distPos.length; z++) {
					int curDist = (distPos[z][0] - x) * (distPos[z][0] - x)
							+ (distPos[z][1] - y) * (distPos[z][1] - y);
					if (curDist < minDist) {
						minDist = curDist;
						assignedDist = z;
					}
				}
				retAssignments[x][y] = assignedDist;
			}
		}
		return retAssignments;
	}
}
