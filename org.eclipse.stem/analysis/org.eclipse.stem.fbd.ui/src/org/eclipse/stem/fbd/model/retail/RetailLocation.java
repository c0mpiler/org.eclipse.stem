package org.eclipse.stem.fbd.model.retail;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import org.apache.commons.math3.random.RandomGenerator;
import org.eclipse.stem.fbd.model.ConsumptionEvent;
import org.eclipse.stem.fbd.model.Food;
import org.eclipse.stem.fbd.model.Population;
import org.eclipse.stem.fbd.util.MagicTable;
import org.eclipse.stem.fbd.util.MagicTableException;
import org.eclipse.stem.fbd.util.MathOps;

public class RetailLocation extends Observable {

	private double attractionFactor;
	private int retailID;
	private MagicTable<Object> consumerDist;
	private List<Food> foodQueue;
	private int[] coords;
	private double[][] foodDistribution;

	public RetailLocation(int retailID, double attractionFactor, int[] coords,
			int noOfRetailers) {
		this.attractionFactor = attractionFactor;
		this.retailID = retailID;
		this.foodQueue = new ArrayList<Food>();
		this.coords = coords;
	}

	public int[] getCoordinates() {
		return this.coords;
	}

	public int getRetailID() {
		return this.retailID;
	}

	public double getAttractionFactor() {
		return this.attractionFactor;
	}

	public void distributeFoods(RandomGenerator r, Population pop) {
		while (!this.foodQueue.isEmpty()) {
			Food f = this.foodQueue.remove(r.nextInt(this.foodQueue.size()));
			ConsumptionEvent e = new ConsumptionEvent(
					this.consumerDist.sampleIndex(), f, null);
			this.setChanged();
			this.notifyObservers(e);
		}
	}

	public void deliverFood(Food f) {
		this.foodQueue.add(f);
	}

	public double[][] getFoodDistribution() {
		return this.foodDistribution;
	}

	public void generateConsumerDist(double[] popDistribution, Population pop) throws MagicTableException {

		this.foodDistribution = new double[pop.getSizeX()][pop.getSizeY()];
		int noOfRetailers = RetailManager.getInstance()
				.getNoOfRetailLocations();
		double[] consDist = new double[popDistribution.length / noOfRetailers];

		for (int i = 0; i < consDist.length; i++) {
			consDist[i] = popDistribution[i * noOfRetailers + this.retailID];
		}

		double sV = MathOps.sum(consDist);
		for (int i = 0; i < consDist.length; i++) {
			consDist[i] /= sV;
			int x = i / pop.getSizeY();
			int y = i % pop.getSizeY();
			this.foodDistribution[x][y] = consDist[i];
		}

		this.consumerDist = new MagicTable<Object>(consDist);
	}

}