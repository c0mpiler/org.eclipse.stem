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
import java.util.HashSet;
import java.util.List;

import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;
import org.eclipse.stem.fbd.model.ContaminatedFood;
import org.eclipse.stem.fbd.model.Distance;
import org.eclipse.stem.fbd.model.Food;
import org.eclipse.stem.fbd.model.HealthyFood;
import org.eclipse.stem.fbd.model.Population;
import org.eclipse.stem.fbd.util.MathOps;

public class RetailDistributor implements IDistributor {

	private int distributorID;
	private List<RetailLocation> retailers;
	private double contaminatedFoodProb;
	private RandomGenerator r;

	public RetailDistributor(int distributorID) {
		this.distributorID = distributorID;
		this.retailers = new ArrayList<RetailLocation>();
		this.r = new MersenneTwister();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.stem.fbd.ui.model.IDistributor#setContaminatedFoodProb(double
	 * )
	 */
	@Override
	public void setContaminatedFoodProb(double contaminatedFoodProb) {
		this.contaminatedFoodProb = contaminatedFoodProb;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.stem.fbd.ui.model.IDistributor#getDistributorID()
	 */
	@Override
	public int getDistributorID() {
		return distributorID;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.stem.fbd.ui.model.IDistributor#getSize()
	 */
	@Override
	public double getSize() {
		// XXX does not consider that differential contributions of more than
		// one distributor to a retail store.
		double res = 0;
		for (RetailLocation r : new HashSet<RetailLocation>(this.retailers)) {
			res += r.getAttractionFactor();
		}
		return res;
	}

	public void addRetailLocation(RetailLocation l) {
		this.retailers.add(l);
	}

	public List<RetailLocation> getRetailLocations() {
		return this.retailers;
	}

	public void deliverFood() {
		Food f = this.produceFood();
		if (this.retailers.size() > 0) {
			this.retailers.get(r.nextInt(this.retailers.size())).deliverFood(f);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.stem.fbd.ui.model.IDistributor#produceFood()
	 */
	@Override
	public Food produceFood() {
		Food f = new HealthyFood(this);
		if (r.nextDouble() < this.contaminatedFoodProb) {
			f = new ContaminatedFood(this);
		}
		return f;
	}

	public double[][] getFoodDistribution() {
		if (this.retailers.isEmpty()) {
			return null;
		}
		double[][] res = new double[this.retailers.get(0).getFoodDistribution().length][this.retailers
				.get(0).getFoodDistribution()[0].length];
		double sV = 0;
		for (RetailLocation r : this.retailers) {
			double[][] foodDistR = r.getFoodDistribution();
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[0].length; j++) {
					res[i][j] += foodDistR[i][j];
					sV += foodDistR[i][j];
				}
			}
		}

		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				res[i][j] /= sV;
			}
		}
		return res;
	}

	// public static double[][] getDistributorDists(
	// List<Distributor> distributors, Population pop,
	// double distanceFactor, double distanceFactor2) {
	// double[][] res = new double[distributors.size()][pop.getSizeX()
	// * pop.getSizeY()];
	//
	// for (int k = 0; k < distributors.size(); k++) {
	// Distributor ds = (Distributor) distributors.get(k);
	// for (int i = 0; i < pop.getSizeX(); i++) {
	// for (int j = 0; j < pop.getSizeY(); j++) {
	// for (RetailLocation r : ds.getRetailLocations()) {
	// int[] c = r.getCoordinates();
	// double d = (i - c[0]) * (i - c[0]) + (j - c[1])
	// * (j - c[1]);
	// double x = r.getAttractionFactor();
	// if (d != 0.0d) {
	// x = r.getAttractionFactor()
	// * Math.pow(distanceFactor2 * d,
	// -distanceFactor / 2.0D);
	// }
	// res[k][(i * pop.getSizeY() + j)] += x;
	// }
	// }
	// }
	// double sV = MathOps.sum(res[k]);
	// if (MathOps.approxEqual(sV, 0.0d)) {
	// continue;
	// }
	// for (int i = 0; i < res[k].length; i++) {
	// res[k][i] /= sV;
	// }
	// }
	// return res;
	// }
	public static double[][] getDistributorDists(
			List<RetailDistributor> distributors, Population pop,
			Distance distance) {
		double[][] res = new double[distributors.size()][pop.getSizeX()
				* pop.getSizeY()];

		for (int k = 0; k < distributors.size(); k++) {
			RetailDistributor ds = distributors.get(k);
			for (RetailLocation r : ds.getRetailLocations()) {
				double[] c = new double[] { r.getCoordinates()[0],
						r.getCoordinates()[1] };
				double rdist[] = new double[pop.getSizeX() * pop.getSizeY()];
				double rV = 0;
				for (int i = 0; i < pop.getSizeX(); i++) {
					for (int j = 0; j < pop.getSizeY(); j++) {
						double d = 1. / distance.calculateDistance(
								new double[] { i, j }, c);
						rdist[i * pop.getSizeY() + j] += d;
						rV += d;
					}
				}
				for (int i = 0; i < rdist.length; i++) {
					res[k][i] += rdist[i] / rV * r.getAttractionFactor();
				}
			}
			double sV = MathOps.sum(res[k]);
			if (MathOps.approxEqual(sV, 0)) {
				continue;
			}
			for (int i = 0; i < res[k].length; i++) {
				res[k][i] /= sV;
			}
		}
		return res;
	}

}
