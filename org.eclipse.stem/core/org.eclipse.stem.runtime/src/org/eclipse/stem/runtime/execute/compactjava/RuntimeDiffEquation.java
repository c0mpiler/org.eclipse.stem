package org.eclipse.stem.runtime.execute.compactjava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.eclipse.stem.runtime.compactjava.RuntimeDecorator;
import org.eclipse.stem.runtime.compactjava.RuntimeLabel;
import org.eclipse.stem.runtime.compactjava.RuntimeScenario;

public abstract class RuntimeDiffEquation  implements FirstOrderDifferentialEquations{

	protected RuntimeScenario runtimeScenario;
	protected RuntimeDecorator runtimeDecorator;
	protected int dimensions;
	protected Map<String, int[]> variable_position_offsets = new HashMap<String, int[]>(); // Keeps track of the offset from the labelVectorPositions a given variable is located 
	protected int[] labelVectorPositions; // Keeps track of the position in the y vector (current value) a given label is located
	protected Map<RuntimeLabel, Integer> labelSequenceNumberMap; // Keeps track of which position in the list of labels the decorator updates a label is
	
	public RuntimeDiffEquation(RuntimeScenario s, RuntimeDecorator rd, Integer d) {
		runtimeScenario = s;
		runtimeDecorator = rd;
		dimensions = d;
		labelSequenceNumberMap = new HashMap<RuntimeLabel, Integer>();
	}

	/**
	 * Initialize the y vector from the inital values
	 * of the labels
	 * @param y
	 */
	public void initialize(double [] y) {
		int pos = 0, labInd = 0;
		labelVectorPositions = new int[runtimeDecorator.getLabelsToUpdate().size()];
		
		for(int rLabelId:runtimeDecorator.getLabelsToUpdate()) {
			labelVectorPositions[labInd] = pos;
			RuntimeLabel rLabel = runtimeScenario.getGraph().findLabel(rLabelId);
			labelSequenceNumberMap.put(rLabel, labInd++);
			double [] allAttrVals = rLabel.getAllDoubleAttributeValues();
			if(allAttrVals != null)
				for(double d:allAttrVals) 
					y[pos++] = d;
		}
	}
	
	protected void extractVariablePositions(String [] vars) {
		int numLabs = runtimeDecorator.getLabelsToUpdate().size();
		for(String v:vars) 
			variable_position_offsets.put(v, new int[numLabs]);
		
		int ind = 0;
		for(int rLabelId:runtimeDecorator.getLabelsToUpdate()) {
			RuntimeLabel rLabel = runtimeScenario.getGraph().findLabel(rLabelId);
			for(String v:vars)
				variable_position_offsets.get(v)[ind] = -1;
			Set<String> allAttrNames = rLabel.getRuntimeType().getDoubleAttributeNames();
			int labInd = 0;
			for(String name:allAttrNames) {
				for(String v:vars)
					if(name.equals(v)) variable_position_offsets.get(v)[ind] = labInd;
				++labInd;
			}
			++ind;
		}

	}
}
