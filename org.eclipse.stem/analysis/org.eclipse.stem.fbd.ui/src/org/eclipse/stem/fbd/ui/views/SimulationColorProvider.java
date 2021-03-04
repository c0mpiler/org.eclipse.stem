package org.eclipse.stem.fbd.ui.views;

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

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.fbd.model.ContaminatedFood;
import org.eclipse.stem.fbd.model.Food;
import org.eclipse.stem.ui.adapters.color.ColorProviderAdapter;
import org.eclipse.stem.ui.adapters.color.STEMColor;

public class SimulationColorProvider extends ColorProviderAdapter {

	private STEMColor[] colors;
	private Map<String, Food> consMap;

	public SimulationColorProvider() {
		this.consMap = new HashMap<String, Food>();
	}

	public void setNoOfDistributorIds(int noOfDists) {
		this.colors = new STEMColor[noOfDists];

		int[][] colors = this.generateRandomColors(noOfDists);
		for (int i = 0; i < noOfDists; i++) {
			this.colors[i] = STEMColor.toSTEMColor(new Color(colors[i][0],
					colors[i][1], colors[i][2]));
		}
	}

	public STEMColor[] getDistributorColors(){
		return this.colors;
	}
	
	private int[][] generateRandomColors(int n) {
		RandomGenerator r = new MersenneTwister();
		int[][] res = new int[n][3];
		for (int i = 0; i < n; i++) {
			res[i][0] = r.nextInt(255);
			res[i][1] = r.nextInt(255);
			res[i][2] = r.nextInt(255);
		}
		return res;
	}

	@Override
	public STEMColor getColor() {
		return STEMColor.toSTEMColor(Color.WHITE);
	}

	@Override
	public STEMColor getColor(float gainFactor, boolean useLogScaling) {
		String l = this.target.toString();
		if (this.consMap.containsKey(l)
				&& this.colors.length > this.consMap.get(l)
						.getDistributorId()) {
			Food f = this.consMap.get(l);
			if (f instanceof ContaminatedFood) {
				return STEMColor.toSTEMColor(Color.GREEN);
			} else {
				return this.colors[f.getDistributorId()];
			}
		}
		return STEMColor.toSTEMColor(Color.WHITE);
	}

	public void markConsumption(Map<String, Food> consMap) {
		this.consMap.clear();
		if (consMap != null) {
			this.consMap.putAll(consMap);
		}
	}

	@Override
	public STEMColor getBackgroundFillColor() {
		return STEMColor.toSTEMColor(Color.WHITE);
	}

	@Override
	public STEMColor getBorderColor() {
		return STEMColor.toSTEMColor(Color.BLACK);
	}

	@Override
	public void setSelectedDecorator(Decorator selectedDecorator) {
		throw new UnsupportedOperationException(
				"Function setSelectedDecorator(Decorator selectedDecorator) is not Implemented");
	}

	@Override
	public void setSelectedPopulationIdentifier(String selectedPopulationId) {
		throw new UnsupportedOperationException(
				"Function setSelectedPopulationIdentifier(String selectedPopulationId) is not Implemented");
	}

	@Override
	public void setSelectedProperty(ItemPropertyDescriptor selectedProperty) {
		throw new UnsupportedOperationException(
				"Function setSelectedProperty(ItemPropertyDescriptor selectedProperty) is not Implemented");
	}
}
