package org.eclipse.stem.fbd.prediction;

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
import java.util.Arrays;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import org.eclipse.stem.fbd.model.ConsumptionEvent;
import org.eclipse.stem.fbd.model.ContaminatedFood;
import org.eclipse.stem.fbd.util.MathOps;

public class MLSourcePredictor implements Observer {

	private List<double[]> sumProbDist;
	private double[][] distDist;
	private List<Integer> history;
	private static final int MAX_ACCURACY = 200;
	private int contaminationSource;
	
	public MLSourcePredictor(double[][] distributorDists) {
		this.sumProbDist = new ArrayList<double[]>();
		this.distDist = distributorDists;
		this.history = new ArrayList<Integer>();
	}
	
	public MLSourcePredictor(double[][] distributorDists, int cs) {
		this.sumProbDist = new ArrayList<double[]>();
		this.distDist = distributorDists;
		this.history = new ArrayList<Integer>();
		this.contaminationSource = cs;
	}

	@Override
	public void update(Observable o, Object arg) {
		ConsumptionEvent e = (ConsumptionEvent) arg;
		if (!(e.getFood() instanceof ContaminatedFood)) {
			// do nothing if food is not contaminated
			return;
		}
		int mlc = -1;
		double[] curDist = null;
		if (this.sumProbDist.size() > 0) {
			curDist = Arrays.copyOf(
					this.sumProbDist.get(this.sumProbDist.size() - 1),
					this.distDist.length);
		} else {
			curDist = new double[this.distDist.length];
		}
		double mlv = -MAX_ACCURACY * this.distDist[0].length;
		for (int k = 0; k < this.distDist.length; k++) {
			double val = this.distDist[k][e.getPos()];
			if (!MathOps.approxEqual(val, 0)) {
				curDist[k] += Math.log(val);
			} else {
				curDist[k] -= MAX_ACCURACY;
			}
			if (curDist[k] > mlv) {
				mlv = curDist[k];
				mlc = k;
			}
		}
		this.sumProbDist.add(curDist);
		this.history.add(mlc);
	}

	public double[] getProbabilityDistribution() {
		double[] res = Arrays.copyOf(
				this.sumProbDist.get(this.sumProbDist.size() - 1),
				this.distDist.length);
		double sV = MathOps.sum(res);
		if (Double.isInfinite(sV)) {
			sV = Double.MAX_VALUE;
		}
		for (int i = 0; i < this.distDist.length; i++) {
			res[i] /= sV;
		}
		return res;
	}

	public double[] getRelativeProbabilityFor(int report_no) {
		// if not enough reports have been generated, then this function
		// shouldn't be called

		if (this.sumProbDist.size() < report_no) {
			return null;
		}
		double[] dist = this.sumProbDist.get(report_no);
		double s = MathOps.sumLogs(dist);
		double[] res = new double[dist.length];
		for (int i = 0; i < dist.length; i++) {
			res[i] = dist[i] - s;
		}
		return res;
	}

	public int getMLDistributor() {
		int x = this.history.size();
		if (x == 0) {
			return -1;
		}
		return this.history.get(x - 1);
	}

	public List<Integer> getHistory() {
		return this.history;
	}
}
