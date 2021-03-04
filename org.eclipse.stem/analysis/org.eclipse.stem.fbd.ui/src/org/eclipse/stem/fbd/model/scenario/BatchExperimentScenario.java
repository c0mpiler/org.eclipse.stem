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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

import org.eclipse.stem.fbd.model.ConsumptionEvent;
import org.eclipse.stem.fbd.model.ContaminatedFood;
import org.eclipse.stem.fbd.model.EmpiricalDataset;
import org.eclipse.stem.fbd.model.Food;
import org.eclipse.stem.fbd.util.MagicTable;
import org.eclipse.stem.fbd.util.MagicTableException;
import org.eclipse.stem.fbd.util.MathOps;


public class BatchExperimentScenario {
	private EmpiricalDataset data;
	private double[][] foodDistributions;
	private MagicTable<Object> aliasContSrc;
	//public static final int MAX_NO_OF_REPORTS = 4000;
	public static final int MAX_NO_OF_REPORTS = 100;
	private Observable observable;
	int contaminationSource = -1;

	public BatchExperimentScenario(EmpiricalDataset data) {
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
		List<List<Double>> fd = this.generateDistributionAry(data
				.getFoodDistributions());
		this.foodDistributions = new double[fd.size()][fd.get(0).size()];
		for (int i = 0; i < fd.size(); i++) {
			double s = MathOps.sum(fd.get(i));
			for (int j = 0; j < fd.get(i).size(); j++) {
				this.foodDistributions[i][j] = fd.get(i).get(j) / s;
			}
		}
	}

	public int getContaminationSource() {
		return this.contaminationSource;
	}

	public void init(int contaminatedSource, int iterNo) throws MagicTableException {
		this.aliasContSrc = new MagicTable<Object>(new Random(iterNo), this.foodDistributions[contaminatedSource]);
		this.contaminationSource = contaminatedSource;
	}

	public void runExperiment(double noise, long seed) {
		Random rand = new Random(seed);
		for (int i = 0; i < MAX_NO_OF_REPORTS; i++) {
			Food contaminatedFood = new ContaminatedFood(contaminationSource);
			int location = 0;
			if (noise >= rand.nextDouble()) {
				location = rand.nextInt(this.foodDistributions[0].length);
			} else {
				location = this.aliasContSrc.sampleIndex();
			}
			this.observable.notifyObservers(new ConsumptionEvent(location, contaminatedFood, this.data.getCellLabels()[mapToCellArrayIndexForCompressedDistAry.get(location)]));
		}
	}

	private Map<Integer, Integer> mapToCellArrayIndexForCompressedDistAry = new HashMap<Integer, Integer>();
	
	private List<List<Double>> generateDistributionAry(Double[][] foodDist) {
		List<List<Double>> res = new ArrayList<List<Double>>();
		for (int i = 0; i < foodDist.length; i++) {
			res.add(new ArrayList<Double>());
		}

		int n=0;
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
			mapToCellArrayIndexForCompressedDistAry.put(n, j);
			++n;
			for (int i = 0; i < foodDist.length; i++) {
				if (foodDist[i][j] == null) {
					res.get(i).add(0D);
				} else {
					res.get(i).add(foodDist[i][j]);
				}
			}
		}
		return res;
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
