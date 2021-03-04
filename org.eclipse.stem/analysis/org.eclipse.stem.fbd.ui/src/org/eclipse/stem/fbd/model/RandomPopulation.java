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

import java.util.Arrays;

import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;

public class RandomPopulation implements Population {

	private int[][] world;
	private int gridSizeX;
	private int gridSizeY;
	private int minPopulation;
	private int maxPopulation;
	private int actualMax;
	int[][] popCenters;
	private double spreadFactor;

	public RandomPopulation(int gridSizeX, int gridSizeY, int minPopulation,
			int maxPopulation, int[][] populationCenters, double spreadFactor) {
		this.gridSizeX = gridSizeX;
		this.gridSizeY = gridSizeY;
		this.minPopulation = minPopulation;
		this.maxPopulation = maxPopulation;
		this.actualMax = minPopulation;
		this.popCenters = populationCenters;
		this.spreadFactor = spreadFactor;
		this.init();
	}

	private void init() {
		this.world = new int[this.gridSizeX][this.gridSizeY];
		for (int i = 0; i < this.gridSizeX; i++) {
			Arrays.fill(this.world[i], minPopulation);
		}

		RandomGenerator r = new MersenneTwister();
		for (int i = 0; i < this.popCenters.length; i++) {
			int popMax = this.minPopulation
					+ (int) Math.ceil(r.nextDouble()
							* (this.maxPopulation - this.minPopulation));
			int range = (int) Math.round(this.spreadFactor
					* Math.pow(popMax - this.minPopulation, .75));
			for (int x = Math.max(0, this.popCenters[i][0] - range); x < Math
					.min(this.gridSizeX, this.popCenters[i][0] + range); x++) {
				for (int y = Math.max(0, this.popCenters[i][1] - range); y < Math
						.min(this.gridSizeY, this.popCenters[i][1] + range); y++) {
					int r2 = (int) Math.round(Math
							.sqrt((this.popCenters[i][0] - x)
									* (this.popCenters[i][0] - x)
									+ (this.popCenters[i][1] - y)
									* (this.popCenters[i][1] - y)));
					int v = (int) this.world[x][y];
					this.world[x][y] = (int) Math.min(
							this.maxPopulation,
							Math.max(
									v,
									Math.round(v + (range - r2)
											/ (double) range * popMax)));
					if (this.world[x][y] > this.actualMax) {
						this.actualMax = this.world[x][y];
					}
				}
			}
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.stem.fbd.steadystate.model.Population#getSizeX()
	 */
	@Override
	public int getSizeX() {
		return this.gridSizeX;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.stem.fbd.steadystate.model.Population#getSizeY()
	 */
	@Override
	public int getSizeY() {
		return this.gridSizeY;
	}

	public int[][] getPopulatedWorld() {
		return this.world;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.stem.fbd.steadystate.model.Population#getActualMax()
	 */
	@Override
	public int getActualMax() {
		return this.actualMax;
	}
}
