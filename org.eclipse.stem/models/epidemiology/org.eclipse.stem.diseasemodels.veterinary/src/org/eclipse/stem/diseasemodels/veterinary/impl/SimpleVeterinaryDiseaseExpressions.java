package org.eclipse.stem.diseasemodels.veterinary.impl;


import org.eclipse.emf.common.util.EList;
import org.eclipse.stem.core.graph.Exchange;
import org.eclipse.stem.core.graph.ExchangePool;
import org.eclipse.stem.core.graph.ExchangeType;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;

import org.eclipse.stem.core.model.STEMTime;

import org.eclipse.stem.diseasemodels.Activator;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;

import org.eclipse.stem.diseasemodels.veterinary.SimpleVeterinaryDisease;
import org.eclipse.stem.diseasemodels.veterinary.SimpleVeterinaryDiseaseLabel;
import org.eclipse.stem.diseasemodels.veterinary.SimpleVeterinaryDiseaseLabelValue;

		/**
		 * Generated expressions class for  SimpleVeterinaryDisease.
		 * DO NOT EDIT DIRECTLY.  Use extended class and override methods for transitions as desired.
		 * @generated
		 */
		public class SimpleVeterinaryDiseaseExpressions {
	public void calculate(double t, long timeDelta, STEMTime time, SimpleVeterinaryDisease model, SimpleVeterinaryDiseaseLabel label, SimpleVeterinaryDiseaseLabelValue labelValue, Node node, SimpleVeterinaryDiseaseLabelValue deltaValue) {
		double deltaS = 0.0;
		double deltaI = 0.0;
		
		// 1. find the label for the population model
		ContaminatedUnitsLabelImpl contaminatedUnits = null;
		EList<NodeLabel> labelList = node.getLabels();
		for(NodeLabel n:labelList) {
			if(n instanceof ContaminatedUnitsLabelImpl) {
				contaminatedUnits = (ContaminatedUnitsLabelImpl)n;
				break;
			}
		}
		// 2.found it?
		if(contaminatedUnits != null) {
			ContaminatedUnitsLabelValueImpl feces = (ContaminatedUnitsLabelValueImpl)contaminatedUnits.getCurrentValue();
			// compute the transitions
			double effectiveInfections = (org.eclipse.stem.diseasemodels.functions.CTDLFunctions.computeEffective((org.eclipse.stem.diseasemodels.standard.StandardPackage.eINSTANCE.getSILabelValue_I()), model, node, label));
			
			deltaI += model.getTransmissionRate()*labelValue.getS()* effectiveInfections;
			deltaI += model.getEnvironmentalTransmissionRate()*labelValue.getS()*Math.pow(feces.getCount(),model.getNonLinearityCoefficient())/labelValue.getPopulationCount();
			deltaS -= deltaI;
			
		} else {
			// error !!!
			Activator.logInformation("Scenario Configuration Error: Need to create label and label initializer for Contaminated Units");
		}
		

		// Stochastic exchange for s -> i
		Exchange exchange_s_i = (Exchange)ExchangePool.POOL.get();
		//deltaValue.getDepartures().add(exchange_s_i);
		exchange_s_i.setType(ExchangeType.COMPARTMENT_TRANSITION);
		exchange_s_i.setSource(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
		exchange_s_i.setTarget(StandardPackage.eINSTANCE.getSILabelValue_I());
		exchange_s_i.setCount(deltaI);
				
		exchange_s_i.getForIncidence().add(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_Incidence());
		
		deltaValue.setS(deltaS);
		deltaValue.setI(deltaI);
		
		
		
			
	}
			




} //