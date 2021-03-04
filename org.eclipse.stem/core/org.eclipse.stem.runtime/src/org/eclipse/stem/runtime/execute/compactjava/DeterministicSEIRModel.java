package org.eclipse.stem.runtime.execute.compactjava;


import java.util.List;

import org.apache.commons.math.ode.DerivativeException;
import org.eclipse.stem.runtime.compactjava.RuntimeDecorator;
import org.eclipse.stem.runtime.compactjava.RuntimeLabel;
import org.eclipse.stem.runtime.compactjava.RuntimeScenario;

public class DeterministicSEIRModel extends RuntimeDiffEquation {
	double transmissionRate;
	double recoveryRate;
	double incubationRate;
	double immunityLossRate;
	double characteristicMixingDistance;
	double roadNetworkInfectiousProportion;

	long timePeriod;

	public final String COMPARTMENT_S = "s";
	public final String COMPARTMENT_E = "e";
	public final String COMPARTMENT_I = "i";
	public final String COMPARTMENT_R = "r";
	public final String COMPARTMENT_INCIDENCE = "incidence";

	public DeterministicSEIRModel(RuntimeScenario s, RuntimeDecorator rd, Integer d) {
		super(s, rd, d);
		transmissionRate = runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("transmissionRate"));
		recoveryRate = runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("recoveryRate"));
		incubationRate = runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("incubationRate"));
		immunityLossRate = runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("immunityLossRate"));
		characteristicMixingDistance = runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("characteristicMixingDistance"));
		roadNetworkInfectiousProportion = runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("roadNetworkInfectiousProportion"));
		timePeriod = (Long)runtimeDecorator.getAttributeValue(runtimeDecorator.getRuntimeType().getAttributeIndex("timePeriod"));

		double adjustFactor = runtimeScenario.getRuntimeSequencer().getStepSize()/(((double)timePeriod)/86400000.0);

		transmissionRate = transmissionRate * adjustFactor;
		recoveryRate = recoveryRate * adjustFactor;
		incubationRate = incubationRate * adjustFactor;
		immunityLossRate = immunityLossRate * adjustFactor;

	}

	/**
	 * Remember the positions of the variables we need for fast access below
	 * @param y
	 */
	public void initialize(double [] y) {
		super.initialize(y);
		String [] vars = {COMPARTMENT_S, COMPARTMENT_E, COMPARTMENT_I, COMPARTMENT_R, COMPARTMENT_INCIDENCE};

		extractVariablePositions(vars);
	}

	@Override
	public int getDimension() {
		return dimensions;
	}


	@Override
	public void computeDerivatives(double t, double[] y, double[] yDot)
			throws DerivativeException {

		int index = 0;
		int labelIndex = 0;
		List<Integer> labsToUpdate = runtimeDecorator.getLabelsToUpdate();
		for(int li=0;li<labsToUpdate.size();++li) {
			Integer rLabelId = labsToUpdate.get(li);
			RuntimeLabel rLabel = runtimeScenario.getGraph().findLabel(rLabelId);
			int sz = rLabel.getNumDoubleAttributes();
			double s = y[index+variable_position_offsets.get(COMPARTMENT_S)[labelIndex]];
			double e = y[index+variable_position_offsets.get(COMPARTMENT_E)[labelIndex]];
			double i = y[index+variable_position_offsets.get(COMPARTMENT_I)[labelIndex]];
			double r = y[index+variable_position_offsets.get(COMPARTMENT_R)[labelIndex]];

			double P = s+e+i+r;

			String [] allComps = {COMPARTMENT_S, COMPARTMENT_E, COMPARTMENT_I, COMPARTMENT_R};
			String [] infComps = {COMPARTMENT_I};
			double [] localInfs = {i};
			double [] effI;
			if (characteristicMixingDistance != 0.0 || roadNetworkInfectiousProportion != 0)
				effI = RuntimeUtilities.getEffectiveInfectious(this.runtimeScenario, rLabel, localInfs, P, y, allComps, 
					infComps, characteristicMixingDistance, roadNetworkInfectiousProportion, 
					variable_position_offsets, labelVectorPositions, labelSequenceNumberMap);
			else {
				effI = new double[1];
				effI[0] = i/P;
			}
			//double effI = i/P;

			// Math stuff
			double ds = -s*effI[0]*transmissionRate+r*immunityLossRate/P;
			double de = s*effI[0]*transmissionRate-e*incubationRate/P;
			double di = e*incubationRate/P-i*recoveryRate/P;
			double dr = i*recoveryRate/P-r*immunityLossRate/P;

			double inc = s*i*transmissionRate/P;

			yDot[index+variable_position_offsets.get(COMPARTMENT_S)[labelIndex]] = ds;
			yDot[index+variable_position_offsets.get(COMPARTMENT_E)[labelIndex]] = de;
			yDot[index+variable_position_offsets.get(COMPARTMENT_I)[labelIndex]] = di;
			yDot[index+variable_position_offsets.get(COMPARTMENT_R)[labelIndex]] = dr;
			yDot[index+variable_position_offsets.get(COMPARTMENT_INCIDENCE)[labelIndex]] = inc;

			index += sz;	
			++labelIndex;
		}
	}

	
}
