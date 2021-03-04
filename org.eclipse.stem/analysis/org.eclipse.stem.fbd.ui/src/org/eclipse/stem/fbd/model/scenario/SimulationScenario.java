package org.eclipse.stem.fbd.model.scenario;

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
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

import org.eclipse.stem.fbd.model.ConsumptionEvent;
import org.eclipse.stem.fbd.model.ContaminatedFood;
import org.eclipse.stem.fbd.model.EmpiricalDataset;
import org.eclipse.stem.fbd.model.Food;
import org.eclipse.stem.fbd.model.HealthyFood;
import org.eclipse.stem.fbd.util.MagicTable;
import org.eclipse.stem.fbd.util.MagicTableException;
import org.eclipse.stem.fbd.util.MathOps;

public class SimulationScenario {
	private EmpiricalDataset data;
	private double[][] foodDistributions;
	private double[] populationDist;
	private MagicTable<Object> populationAlias;
	private Observable observable;
	int contaminationSource = -1;

	public SimulationScenario(EmpiricalDataset data) throws MagicTableException {
		this.observable = new Observable() {
			@Override
			public void notifyObservers() {
				this.setChanged();
				super.notifyObservers();
			}

			@Override
			public void notifyObservers(Object arg) {
				this.setChanged();
				super.notifyObservers(arg);
			}
		};

		this.data = data;
		// normalize data
		this.generateDistributionAry(data.getFoodDistributions(),
				this.data.getPopulationDensity());
		// create sample object
		this.populationAlias = new MagicTable<Object>(this.populationDist);
	}

	public int getContaminationSource() {
		return this.contaminationSource;
	}

	public void setContaminationSource(int contaminatedSource) {
		this.contaminationSource = contaminatedSource;
	}

	public void runExperiment(double noise, double contaminationRate) throws MagicTableException {
		Random rand = new Random();
		int k;
		if (noise >= rand.nextDouble()) {
			k = rand.nextInt(this.foodDistributions[0].length);
		} else {
			k = this.populationAlias.sampleIndex();
		}

		double[] prob2 = new double[this.foodDistributions.length];
		for (int i = 0; i < prob2.length; i++) {
			prob2[i] = this.foodDistributions[i][k];
		}
		double sV = MathOps.sum(prob2);
		for (int i = 0; i < prob2.length; i++) {
			prob2[i] /= sV;
		}
		MagicTable<Object> tmpAlias = new MagicTable<Object>(prob2);
		int s = tmpAlias.sampleIndex();
		Food f = null;
		if (s == this.contaminationSource
				&& contaminationRate <= rand.nextDouble()) {
			f = new ContaminatedFood(s);
		} else {
			f = new HealthyFood(s);
		}
		this.observable.notifyObservers(new ConsumptionEvent(k, f, null));
	}

	private void generateDistributionAry(Double[][] foodDist,
			Double[] populationDist) {

		List<List<Double>> fd = new ArrayList<List<Double>>();
		List<Double> popDist = new ArrayList<Double>();
		for (int i = 0; i < foodDist.length; i++) {
			fd.add(new ArrayList<Double>());
		}

		for (int j = 0; j < foodDist[0].length; j++) {
			boolean isZeroEverywhere = true;
			for (int i = 0; i < foodDist.length; i++) {
				if (foodDist[i][j] != null && foodDist[i][j] > 0D) {
					isZeroEverywhere = false;
				}
			}
			if (isZeroEverywhere) {
				continue;
			}
			// add population entry
			popDist.add(populationDist[j]);

			for (int i = 0; i < foodDist.length; i++) {
				if (foodDist[i][j] == null) {
					fd.get(i).add(0D);
				} else {
					fd.get(i).add(foodDist[i][j]);
				}
			}
		}

		this.populationDist = new double[popDist.size()];
		double sV = MathOps.sum(popDist);
		for (int i=0; i< this.populationDist.length;i++){
			this.populationDist[i] = popDist.get(i)/sV;
		}
		
		this.foodDistributions = new double[fd.size()][fd.get(0).size()];
		for (int i = 0; i < fd.size(); i++) {
			double s = MathOps.sum(fd.get(i));
			for (int j = 0; j < fd.get(i).size(); j++) {
				this.foodDistributions[i][j] = fd.get(i).get(j) / s;
			}
		}
	}

	public double[][] getFoodDistributions() {
		return this.foodDistributions;
	}

	public void registerContaminationEventObserver(Observer obs) {
		this.observable.addObserver(obs);
	}

	public void unregisterContaminationEventObserver(Observer obs) {
		this.observable.deleteObserver(obs);
	}

	public void unregisterAllContaminationEventObservers() {
		this.observable.deleteObservers();
	}

	public EmpiricalDataset getData() {
		return this.data;
	}
}
