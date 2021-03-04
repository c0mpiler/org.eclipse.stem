package org.eclipse.stem.diseasemodels.veterinary.impl;


import org.eclipse.emf.common.util.EList;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.diseasemodels.Activator;
import org.eclipse.stem.diseasemodels.veterinary.ContaminatedUnits;
import org.eclipse.stem.diseasemodels.veterinary.ContaminatedUnitsLabel;
import org.eclipse.stem.diseasemodels.veterinary.ContaminatedUnitsLabelValue;

		/**
		 * Generated expressions class for  ContaminatedUnits.
		 * DO NOT EDIT DIRECTLY.  Use extended class and override methods for transitions as desired.
		 * @generated
		 */
		public class ContaminatedUnitsExpressions {
	public void calculate(double t, long timeDelta, STEMTime time, ContaminatedUnits model, ContaminatedUnitsLabel label, ContaminatedUnitsLabelValue labelValue, Node node, ContaminatedUnitsLabelValue deltaValue) {
		
		double deltaQ = 0;
		double deaths = 0;
		double births = 0; 
				// 1. find the label for the population model
				SimpleVeterinaryDiseaseLabelImpl campy = null;
				EList<NodeLabel> labelList = node.getLabels();
				for(NodeLabel n:labelList) {
					if(n instanceof SimpleVeterinaryDiseaseLabelImpl) {
						campy = (SimpleVeterinaryDiseaseLabelImpl)n;
						break;
					}
				}
				// 2.found it?
				if(campy != null) {
					SimpleVeterinaryDiseaseLabelValueImpl campyValue = (SimpleVeterinaryDiseaseLabelValueImpl)campy.getCurrentValue();
					// compute the transition
					
					deaths += model.getDissapationRate()*labelValue.getCount();
					births += model.getSheddingFactor()*campyValue.getI();
					
					
				} else {
					// error !!!
					Activator.logInformation("Scenario Configuration Error: Need to create label and label initializer for Contaminated Units");
				}
				
				deltaQ = births-deaths;
				deltaValue.setCount(deltaQ);
				deltaValue.setBirths(births);
				deltaValue.setDeaths(deaths);
	}// claculate
			
} //