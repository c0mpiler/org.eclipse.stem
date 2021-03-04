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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.Status;
import org.eclipse.stem.fbd.ui.Activator;

public class EmpiricalDataset {

	private String[] cellLabels;
	private Double[] populationDensity;
	private Double[][] locations;
	private String[] foodDistributionNames;
	private Double[][] foodDistributions;

	private static String DELIMITER = "\t";

	public EmpiricalDataset(String[] cellLabels, Double[] populationDensity,
			Double[][] locations, String[] foodDistributionNames,
			Double[][] foodDistributions) {
		this.cellLabels = cellLabels;
		this.populationDensity = populationDensity;
		this.foodDistributionNames = foodDistributionNames;
		this.foodDistributions = foodDistributions;
		this.locations = locations;
	}

	public static final EmpiricalDataset createDatasetFromFiles(
			File populationFile, File foodDistributionFile) throws IOException {
		BufferedReader br0 = new BufferedReader(new FileReader(populationFile));
		Map<String, Integer> name2index = new HashMap<String, Integer>();
		List<Double> populationDensity = new ArrayList<Double>();
		List<String> cellLabels = new ArrayList<String>();
		List<Double[]> locations = new ArrayList<Double[]>();
		for (String line = br0.readLine(); line != null; line = br0.readLine()) {
			String[] row = line.split(DELIMITER);
			cellLabels.add(row[0]);
			locations.add(new Double[] { Double.parseDouble(row[1]),
					Double.parseDouble(row[2]) });
			populationDensity.add(Double.parseDouble(row[3]));
			name2index.put(row[0], cellLabels.size() - 1);
		}

		BufferedReader br1 = new BufferedReader(new FileReader(
				foodDistributionFile));
		String[] foodDistributionNames = null;
		Double[][] foodDistributions = null;
		for (String line = br1.readLine(); line != null; line = br1.readLine()) {
			String[] row = line.split(DELIMITER);
			if (foodDistributionNames == null) {
				foodDistributionNames = Arrays.copyOfRange(row, 1, row.length);
				foodDistributions = new Double[foodDistributionNames.length][cellLabels
						.size()];
				continue;
			}
			if (name2index.get(row[0]) == null) {
				Activator a = Activator.getDefault();
				if(a != null)
						a
						.getLog()
						.log(new Status(
								Status.ERROR,
								Activator.PLUGIN_ID,
								String.format(
										"Area with id %s not contained in population data file. Ignoring this data point.",
										row[0])));
				else System.err.println(String.format("Area with id %s not contained in population data file. Ignoring this data point.",row[0]));
				continue;
			}
			for (int i = 1; i < row.length; i++) {
				foodDistributions[i - 1][name2index.get(row[0])] = Double
						.parseDouble(row[i]);
			}
		}
		return new EmpiricalDataset(cellLabels.toArray(new String[] {}),
				populationDensity.toArray(new Double[] {}),
				locations.toArray(new Double[][] {}), foodDistributionNames,
				foodDistributions);
	}

	public Double[][] getLocations() {
		return this.locations;
	}

	public void setLocations(Double[][] locations) {
		this.locations = locations;
	}

	public String[] getCellLabels() {
		return cellLabels;
	}

	public void setCellLabels(String[] cellLabels) {
		this.cellLabels = cellLabels;
	}

	public Double[] getPopulationDensity() {
		return populationDensity;
	}

	public void setPopulationDensity(Double[] populationDensity) {
		this.populationDensity = populationDensity;
	}

	public String[] getFoodDistributionNames() {
		return foodDistributionNames;
	}

	public void setFoodDistributionNames(String[] foodDistributionNames) {
		this.foodDistributionNames = foodDistributionNames;
	}

	public Double[][] getFoodDistributions() {
		return foodDistributions;
	}

	public void setFoodDistributions(Double[][] foodDistributions) {
		this.foodDistributions = foodDistributions;
	}
}
