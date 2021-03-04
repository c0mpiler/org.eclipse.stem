package org.eclipse.stem.diseasemodels.functions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.stem.core.graph.Edge;
import org.eclipse.stem.core.graph.EdgeLabel;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.graph.Label;
import org.eclipse.stem.core.graph.LabelValue;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.IntegrationDecorator;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.definitions.edges.MixingEdge;
import org.eclipse.stem.definitions.edges.MixingEdgeLabelValue;
import org.eclipse.stem.definitions.edges.impl.MixingEdgeLabelImpl;
import org.eclipse.stem.definitions.labels.AreaLabel;
import org.eclipse.stem.definitions.labels.CommonBorderRelationshipLabelValue;
import org.eclipse.stem.definitions.labels.RoadTransportRelationshipLabelValue;
import org.eclipse.stem.definitions.labels.impl.CommonBorderRelationshipLabelImpl;
import org.eclipse.stem.definitions.labels.impl.RoadTransportRelationshipLabelImpl;
import org.eclipse.stem.definitions.nodes.Region;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue;
import org.eclipse.stem.interventions.InterventionLabelValue;
import org.eclipse.stem.interventions.StandardInterventionLabel;
import org.eclipse.stem.interventions.StandardInterventionLabelValue;
import org.eclipse.stem.interventions.StandardPeriodicInterventionLabelValue;

public class CTDLFunctions {

	
	/**
	 * Get the total number of vaccinations for the region at this time and time step.
	 * 
	 * @param node
	 * @param time
	 * @param timeDelta
	 * @param t
	 * @return double Total number of vaccinations
	 */
	public static double vaccinations(Node node, Label label, LabelValue diseaseLabelValue, STEMTime time, long timeDelta, double t)
	{
		
		return getInteventionResult(node, (StandardDiseaseModelLabel)label, (StandardDiseaseModelLabelValue) diseaseLabelValue, time, timeDelta, t, true);
	}
	
	/**
	 * Get the total number of isolations for the region at this time and time step.
	 * 
	 * @param node
	 * @param time
	 * @param timeDelta
	 * @param t
	 * @return double Total number of vaccinations
	 */
	public static double isolations(Node node, Label label, LabelValue diseaseLabelValue, STEMTime time, long timeDelta, double t)
	{
		
		return getInteventionResult(node, (StandardDiseaseModelLabel)label, (StandardDiseaseModelLabelValue)diseaseLabelValue, time, timeDelta, t, false);
	}
	
	
	/**
	 * Get intervention data
	 * 
	 * @param node
	 * @param time
	 * @param timeDelta
	 * @param t
	 * @param vaccinations
	 * @return double Total number of vaccinations/isolations
	 */
	private static double getInteventionResult(Node node, StandardDiseaseModelLabel label, StandardDiseaseModelLabelValue diseaseLabelValue, STEMTime time, long timeDelta, double t, boolean vaccinations)
	{
		EList<NodeLabel>labels = node.getLabels();
		for(int i=0;i<labels.size();++i) {
			NodeLabel lab = labels.get(i);
			if(lab instanceof StandardInterventionLabel) {
				StandardInterventionLabel iLab = (StandardInterventionLabel)lab;
				if(iLab.getPopulationIdentifier().equals(label.getPopulationModelLabel().getPopulationIdentifier())) {
					// Alright we found it.
					InterventionLabelValue iLabVal = (InterventionLabelValue)iLab.getCurrentValue();
					if(iLabVal instanceof StandardInterventionLabelValue) {
						// Just use the constant number
						if(vaccinations)
							return ((StandardInterventionLabelValue)iLabVal).getVaccinations();
						else return ((StandardInterventionLabelValue)iLabVal).getIsolations();
					} else if(iLabVal instanceof StandardPeriodicInterventionLabelValue) {
						// Aggregate or interpolate to get the answer
						StandardPeriodicInterventionLabelValue spilv = (StandardPeriodicInterventionLabelValue)iLabVal;
						EList<Double> data = null;
						if(vaccinations) data = spilv.getVaccinations();
						else data = spilv.getIsolations();
						return interpolateOrAggregateResults(data,spilv, label, diseaseLabelValue, t, timeDelta, spilv.getPeriod());
					}
				}
			}
		}
		return 0.0;
	}
	
	@SuppressWarnings("boxing")
	private static double interpolateOrAggregateResults(EList<Double> data, StandardPeriodicInterventionLabelValue spilv, StandardDiseaseModelLabel label, StandardDiseaseModelLabelValue diseaseLabelValue, double t, long timeDelta, long period) {
		if(timeDelta > period) {
			// aggregate
			double dataItemsPerTimeStep = (double)timeDelta/(double)period; 
			int pos = (int)t;
			double fraction = t - pos;
			int ipos = pos % data.size();
			double d1 = data.get(ipos);
			
			double d= d1*(1-fraction);
			
			double end_t = t+dataItemsPerTimeStep;
			int end_pos = (int)end_t;
			double end_fraction = end_t - end_pos;
			
			for(int i=ipos+1;i<end_pos;++i) 
				if(i < data.size()) d = d + data.get(i);
				else d = d + data.get(i-data.size());
			
			end_pos = (end_pos >=data.size())?0:end_pos;
			double d2 = data.get(end_pos)*end_fraction;
			d = d + d2;
			return d;
		} else {
			// Figure out which record in the data file to use
			double simulationStepsPerDataFileStep = (double)period/(double)timeDelta;
			double preciseDataFilePos = t/simulationStepsPerDataFileStep;
			int dataFilePos = (int)preciseDataFilePos;
			if(dataFilePos >= data.size())
				dataFilePos = dataFilePos % data.size();
			
			double num = data.get(dataFilePos);
			if(!spilv.isAbsolute()) { // fraction
				num = num*diseaseLabelValue.getPopulationCount();
			}
			// Return a fraction of the recorded record
			return num/simulationStepsPerDataFileStep;
		}
	}
	
	/**
	 * Compute the effective infectious count from common border edges and road networks using the standard mixing/road network parameters
	 * 
	 * @param infectiousAttribute Which infectious attribute
	 * @param disease The disease model
	 * @param node The node 
	 * @param diseaseLabel The disease label
	 * @return double The effective infectious
	 */
	public static double computeEffective( EAttribute infectiousAttribute, IntegrationDecorator decorator, Node node, Label label) {
		if (!(decorator instanceof StandardDiseaseModel)) {
			return 0.0;
		}
		StandardDiseaseModel disease = (StandardDiseaseModel)decorator;
		return computeEffective(infectiousAttribute, disease.getCharacteristicMixingDistance(), disease.getRoadNetworkInfectiousProportion(), disease, node, label);
	}
	
	/**
	 * Compute the effective infectious count from common border edges and road networks using the passed in standard mixing/road network parameters.
	 * 
	 * @param infectiousAttribute
	 * @param mixingParam
	 * @param roadParam
	 * @param disease
	 * @param node
	 * @param diseaseLabel
	 * @return
	 */
	public static double computeEffective( EAttribute infectiousAttribute, double mixingParam, double roadParam, IntegrationDecorator decorator, Node node, Label label) {
		if (!(decorator instanceof StandardDiseaseModel && label instanceof IntegrationLabel)) {
			return 0.0;
		}
		
		StandardDiseaseModel disease = (StandardDiseaseModel)decorator;
		IntegrationLabel diseaseLabel = (IntegrationLabel)label;
		
		
		double onsiteInfectious = diseaseLabel.getProbeValue().eGetDouble(infectiousAttribute.getFeatureID());
		
		
		// For performance, check if mixing parameters are zero. If so, just
		// return the unmixed result
				
		if(mixingParam == 0.0 && roadParam == 0.0) {
			double totalPopulation = ((StandardDiseaseModelLabelValue) diseaseLabel
					.getTempValue()).getPopulationCount();
			double retVal = 0.0;

			if (totalPopulation > 0.0) 
				retVal = onsiteInfectious 	/ totalPopulation;
			return retVal;
		}
									
		double infectiousChangeFromMixing = 0.0;
		double populationChangeFromMixing = 0.0;

		List<Edge>cEdges = new ArrayList<Edge>();
		boolean useMixingEdges = false;
		MixingEdgeLabelImpl.getMixingEdgesFromNode(node, disease.getPopulationIdentifier(), cEdges);
		if(cEdges.size() > 0) {
			useMixingEdges = true;
		} else {
			CommonBorderRelationshipLabelImpl.getCommonBorderEdgesFromNode(node, cEdges);
		}
		
		for(int i=0;i<cEdges.size();++i) {
			Edge borderEdge = cEdges.get(i);
			// If it exists, we're looking for the label this disease model
			// updates on the node at the other end of the border edge.
			// sum up the changes from each connected node.
			// NOTE: some of these changes could be negative

			final Node otherNode = borderEdge.getOtherNode(node);
			
			if (otherNode instanceof Region) {
				double otherArea = 0.0;
				double otherPopulation = 0.0;
				double otherInfective = 0.0;

				EList<NodeLabel>labs = otherNode.getLabels();
				for(int j=0;j<labs.size();++j) {
					NodeLabel otherLabel = labs.get(j);
					if (otherLabel instanceof AreaLabel) {
						otherArea = ((AreaLabel) otherLabel)
								.getCurrentAreaValue().getArea();
					} else if (otherLabel instanceof StandardDiseaseModelLabel) {
						StandardDiseaseModelLabel otherDiseaseLabel = (StandardDiseaseModelLabel) otherLabel;

						if (otherDiseaseLabel.getDecorator() == disease
								&& otherDiseaseLabel.getIdentifier().equals(
										diseaseLabel.getIdentifier())) {
							otherPopulation = ((StandardDiseaseModelLabelValue) otherDiseaseLabel
									.getTempValue()).getPopulationCount();

							otherInfective = otherDiseaseLabel
									.getTempValue().eGetDouble(
											infectiousAttribute.getFeatureID());
						}
					}
				}

				if(!useMixingEdges) {
					double borderLength = ((CommonBorderRelationshipLabelValue) borderEdge
							.getLabel().getCurrentValue()).getBorderLength();

					double mixingFactor = Math.min(mixingParam
							* borderLength / otherArea, 1.0);
				
					if (otherArea == 0.0) {
						mixingFactor = 0.0;
					}

					infectiousChangeFromMixing += mixingFactor * otherInfective;
					populationChangeFromMixing += mixingFactor * otherPopulation;
				} else {
					// use mixing edge
					MixingEdge mixingEdge =(MixingEdge)cEdges.get(i);
					MixingEdgeLabelValue mixingLabelValue = mixingEdge.getLabel().getCurrentValue();
					double mixingRateOrAbs = mixingLabelValue.getMixingRate();
					boolean useAbsoluteValue = mixingEdge.isUseAbsoluteValues();
					
					if(useAbsoluteValue && otherPopulation > 0.0) {
						if(mixingRateOrAbs > otherPopulation) // Cannot mix with more people than currently available
							mixingRateOrAbs = otherPopulation;
						double fraction = mixingRateOrAbs / otherPopulation; // Do get the right scaling for the population change we need this
						infectiousChangeFromMixing += fraction * otherInfective;
						populationChangeFromMixing += fraction * otherPopulation;
					} else {
						infectiousChangeFromMixing += mixingRateOrAbs * otherInfective;
						populationChangeFromMixing += mixingRateOrAbs * otherPopulation;
					}
				}
			}
		} // for each border edge
		
		
		List<Edge>rEdges = new ArrayList<Edge>();
		RoadTransportRelationshipLabelImpl.getRoadEdgesFromNode(node, rEdges);
		for(int i=0;i<rEdges.size();++i) {
			Edge roadEdge = rEdges.get(i);
			// find the number of edges from the road edge - could be more than
			// one
			// also, roads have differenct capacities
			EdgeLabel edgeLabel = roadEdge.getLabel();
			double numCrossings = ((RoadTransportRelationshipLabelValue) edgeLabel
					.getCurrentValue()).getNumberCrossings();
			double infectiousProportion = Math.min(roadParam * numCrossings, 1.0);

			// If it exists, we're looking for the label this disease model
			// updates on the node at the other end of the border edge.
			Node otherNode = roadEdge.getOtherNode(node);
			double otherPopulation = 0.0;
			double otherInfective = 0.0;

			EList<NodeLabel>labs = otherNode.getLabels();
			for(int j=0;j<labs.size();++j) {
				NodeLabel otherLabel = labs.get(j);
				if (otherLabel instanceof StandardDiseaseModelLabel) {
					StandardDiseaseModelLabel otherDiseaseLabel = (StandardDiseaseModelLabel) otherLabel;

					if (otherDiseaseLabel.getDecorator() == disease
							&& otherDiseaseLabel.getIdentifier().equals(
									diseaseLabel.getIdentifier())) {
						otherPopulation = ((StandardDiseaseModelLabelValue) otherDiseaseLabel
								.getTempValue()).getPopulationCount();

						otherInfective =  otherDiseaseLabel
								.getTempValue().eGetDouble(infectiousAttribute.getFeatureID());
					}
				}
			}

			infectiousChangeFromMixing += infectiousProportion * otherInfective;
			populationChangeFromMixing += infectiousProportion
					* otherPopulation;
		} // for each road edge

		
		// return the sum normalized to the total population
		double totalPopulation = ((StandardDiseaseModelLabelValue) diseaseLabel
				.getTempValue()).getPopulationCount()
				+ populationChangeFromMixing;
		double retVal = 0.0;

		if (totalPopulation > 0.0) {
			retVal = (onsiteInfectious + infectiousChangeFromMixing)
					/ totalPopulation;
		}

		return retVal;		
	}
	

}