package org.eclipse.stem.diseasemodels.vector;

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

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.impl.BasicEObjectImpl;
import org.eclipse.stem.core.STEMObjectPool;
import org.eclipse.stem.core.graph.Edge;
import org.eclipse.stem.core.graph.EdgeLabel;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.definitions.edges.MixingEdge;
import org.eclipse.stem.definitions.edges.impl.MixingEdgeLabelImpl;
import org.eclipse.stem.definitions.labels.AreaLabel;
import org.eclipse.stem.definitions.labels.CommonBorderRelationshipLabelValue;
import org.eclipse.stem.definitions.labels.RoadTransportRelationshipLabelValue;
import org.eclipse.stem.definitions.labels.impl.CommonBorderRelationshipLabelImpl;
import org.eclipse.stem.definitions.labels.impl.RoadTransportRelationshipLabelImpl;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;

public class DengueUtil {

	public STEMObjectPool dArrayObjectPool = new STEMObjectPool(5, 5) {
		protected Object createNewObject() {
			return new double[16];
		}

		@Override
		protected void resetObject(Object o) {
			//Nothing to reset
		}
	};

	
	/**
	 * Returns the effective infectious fraction for all infectious compartments
	 * in the following order: I1, I12, I13, I14, I2, I21, I23, I24, I3, I31,
	 * I32, I34, I4, I41, I42, I43.
	 * {@link StandardDiseaseModel#getNormalizedEffectiveInfectious(StandardDiseaseModelLabel, EList)}
	 * can also be used to do, but uses more memory, since {@link Double}
	 * objects are created for
	 * {@link BasicEObjectImpl#eGet(org.eclipse.emf.ecore.EStructuralFeature)}
	 * and
	 * {@link BasicEObjectImpl#eSet(org.eclipse.emf.ecore.EStructuralFeature, Object)}
	 * .
	 * 
	 * @param diseaseLabel
	 *            label to compute the fractions for
	 * @param totalInfectious Total infectious 
	 * @param doCommonBorderMixing 
	 * 
	 * @return effective infectious fraction for all infectious compartments
	 */
	@SuppressWarnings("unchecked")
	public void getNormalizedEffectiveInfectious(StandardDiseaseModel diseaseModel,
			StandardDiseaseModelLabel diseaseLabel, double[] totalInfectious, boolean doCommonBorderMixing, STEMObjectPool edgeListObjectPool, double characteristicMixingDistance, double roadNetworkInfectiousProportion, String populationIdentifier, boolean frequencyDependent) {
		
		// It's safe to use the probe value here since it's been set before reaching this code
		
		SimpleDengueModelHostLabelValue value = (SimpleDengueModelHostLabelValue) diseaseLabel
				.getProbeValue();

		totalInfectious[0] = value.getI1();
		totalInfectious[1] = value.getI12();
		totalInfectious[2] = value.getI13();
		totalInfectious[3] = value.getI14();
		totalInfectious[4] = value.getI2();
		totalInfectious[5] = value.getI21();
		totalInfectious[6] = value.getI23();
		totalInfectious[7] = value.getI24();
		totalInfectious[8] = value.getI3();
		totalInfectious[9] = value.getI31();
		totalInfectious[10] = value.getI32();
		totalInfectious[11] = value.getI34();
		totalInfectious[12] = value.getI4();
		totalInfectious[13] = value.getI41();
		totalInfectious[14] = value.getI42();
		totalInfectious[15] = value.getI43();
		
			// If nothing to do, return right away
		if(characteristicMixingDistance == 0.0 && roadNetworkInfectiousProportion == 0)
			return;
		
				// Determine whether to use mixing edges or common border edges
				
				Node node = diseaseLabel.getNode();
				
				
				double totalPopulation = value.getPopulationCount();

				

				if(doCommonBorderMixing) {
					List<Edge>cEdges = (List<Edge>)edgeListObjectPool.get();
					cEdges.clear();
					CommonBorderRelationshipLabelImpl.getCommonBorderEdgesFromNode(node, cEdges);
					for(int i=0;i<cEdges.size();++i) {
						Edge borderEdge = cEdges.get(i);
					// If it exists, we're looking for the label this disease model
						// updates on the node at the other end of the border edge.
						// sum up the changes from each connected node.
						// NOTE: some of these changes could be negative
			
						final Node otherNode = borderEdge.getOtherNode(node);
						double borderLength = ((CommonBorderRelationshipLabelValue) borderEdge
								.getLabel().getCurrentValue()).getBorderLength();
			
						double otherArea = 0.0;
			
						for (NodeLabel otherLabel : otherNode.getLabels()) {
							if (otherLabel instanceof AreaLabel) {
								otherArea = ((AreaLabel) otherLabel).getCurrentAreaValue()
										.getArea();
								break;
							}
						}
			
						double mixingFactor = Math.min(characteristicMixingDistance
								* borderLength / otherArea, 1.0);
			
						for (NodeLabel otherLabel : otherNode.getLabels()) {
							if (otherLabel instanceof StandardDiseaseModelLabel) {
								StandardDiseaseModelLabel otherDiseaseLabel = (StandardDiseaseModelLabel) otherLabel;
			
								if (otherDiseaseLabel.getDecorator() == diseaseModel
										&& otherDiseaseLabel.getIdentifier().equals(
												diseaseLabel.getIdentifier()) &&
												otherDiseaseLabel.getTempValue() instanceof SimpleDengueModelHostLabelValue) {
									SimpleDengueModelHostLabelValue otherValue = (SimpleDengueModelHostLabelValue) otherDiseaseLabel
											.getTempValue();

									totalInfectious[0] += mixingFactor
											* otherValue.getI1();
									totalInfectious[1] += mixingFactor
											* otherValue.getI12();
									totalInfectious[2] += mixingFactor
											* otherValue.getI13();
									totalInfectious[3] += mixingFactor
											* otherValue.getI14();
									totalInfectious[4] += mixingFactor
											* otherValue.getI2();
									totalInfectious[5] += mixingFactor
											* otherValue.getI21();
									totalInfectious[6] += mixingFactor
											* otherValue.getI23();
									totalInfectious[7] += mixingFactor
											* otherValue.getI24();
									totalInfectious[8] += mixingFactor
											* otherValue.getI3();
									totalInfectious[9] += mixingFactor
											* otherValue.getI31();
									totalInfectious[10] += mixingFactor
											* otherValue.getI32();
									totalInfectious[11] += mixingFactor
											* otherValue.getI34();
									totalInfectious[12] += mixingFactor
											* otherValue.getI4();
									totalInfectious[13] += mixingFactor
											* otherValue.getI41();
									totalInfectious[14] += mixingFactor
											* otherValue.getI42();
									totalInfectious[15] += mixingFactor
											* otherValue.getI43();

									totalPopulation += mixingFactor
											* otherValue.getPopulationCount();
									break;
								}
							}
						}
					} // for each border edge
					edgeListObjectPool.release(cEdges);
				} else { // Mixing edge mixing
					List<Edge>mEdges = (List<Edge>)edgeListObjectPool.get();
					mEdges.clear();
					MixingEdgeLabelImpl.getMixingEdgesFromNode(node, populationIdentifier, mEdges);
					for(int i=0;i<mEdges.size();++i) {
						MixingEdge mixingEdge = (MixingEdge)mEdges.get(i);
						
						final Node otherNode = mixingEdge.getOtherNode(node);
					
						for (NodeLabel otherLabel : otherNode.getLabels()) {
							if (otherLabel instanceof DengueModelHostLabel) {
								DengueModelHostLabel otherDiseaseLabel = (DengueModelHostLabel) otherLabel;
			
								if (otherDiseaseLabel.getDecorator() == this
										&& otherDiseaseLabel.getIdentifier().equals(
												diseaseLabel.getIdentifier())) {
									DengueModelHostLabelValue otherValue = (DengueModelHostLabelValue) otherDiseaseLabel
											.getTempValue();
			
									double otherPopulation = otherValue.getPopulationCount();
									boolean useAbsoluteValue = mixingEdge.isUseAbsoluteValues();
									double mixingRateOrAbs = mixingEdge.getLabel().getCurrentValue().getMixingRate();
									
									if(useAbsoluteValue && otherPopulation > 0.0) {
										if(mixingRateOrAbs > otherPopulation) // Cannot mix with more people than currently available
											mixingRateOrAbs = otherPopulation;
										double fraction = mixingRateOrAbs / otherPopulation; // Do get the right scaling for the population change we need this
										totalInfectious[0] += fraction
												* otherValue.getI1();
										totalInfectious[1] += fraction
												* otherValue.getI12();
										totalInfectious[2] += fraction
												* otherValue.getI13();
										totalInfectious[3] += fraction
												* otherValue.getI14();
										totalInfectious[4] += fraction
												* otherValue.getI2();
										totalInfectious[5] += fraction
												* otherValue.getI21();
										totalInfectious[6] += fraction
												* otherValue.getI23();
										totalInfectious[7] += fraction
												* otherValue.getI24();
										totalInfectious[8] += fraction
												* otherValue.getI3();
										totalInfectious[9] += fraction
												* otherValue.getI31();
										totalInfectious[10] += fraction
												* otherValue.getI32();
										totalInfectious[11] += fraction
												* otherValue.getI34();
										totalInfectious[12] += fraction
												* otherValue.getI4();
										totalInfectious[13] += fraction
												* otherValue.getI41();
										totalInfectious[14] += fraction
												* otherValue.getI42();
										totalInfectious[15] += fraction
												* otherValue.getI43();
									} else {
										if (frequencyDependent) {
											totalInfectious[0] += mixingRateOrAbs
													* otherValue.getI1();
											totalInfectious[1] += mixingRateOrAbs
													* otherValue.getI12();
											totalInfectious[2] += mixingRateOrAbs
													* otherValue.getI13();
											totalInfectious[3] += mixingRateOrAbs
													* otherValue.getI14();
											totalInfectious[4] += mixingRateOrAbs
													* otherValue.getI2();
											totalInfectious[5] += mixingRateOrAbs
													* otherValue.getI21();
											totalInfectious[6] += mixingRateOrAbs
													* otherValue.getI23();
											totalInfectious[7] += mixingRateOrAbs
													* otherValue.getI24();
											totalInfectious[8] += mixingRateOrAbs
													* otherValue.getI3();
											totalInfectious[9] += mixingRateOrAbs
													* otherValue.getI31();
											totalInfectious[10] += mixingRateOrAbs
													* otherValue.getI32();
											totalInfectious[11] += mixingRateOrAbs
													* otherValue.getI34();
											totalInfectious[12] += mixingRateOrAbs
													* otherValue.getI4();
											totalInfectious[13] += mixingRateOrAbs
													* otherValue.getI41();
											totalInfectious[14] += mixingRateOrAbs
													* otherValue.getI42();
											totalInfectious[15] += mixingRateOrAbs
													* otherValue.getI43();
										} else {
											// TODO
										}
										totalPopulation += mixingRateOrAbs * otherPopulation;
									}
									
									break;
								}
							}
						}
					} // for each border edge
					edgeListObjectPool.release(mEdges);
				} // Mixing edge strategy

				List<Edge>rEdges = (List<Edge>)edgeListObjectPool.get();
				rEdges.clear();
				RoadTransportRelationshipLabelImpl.getRoadEdgesFromNode(node, rEdges);
				for(int i=0;i<rEdges.size();++i) {
					Edge roadEdge = rEdges.get(i);
					// find the number of edges from the road edge - could be more than
					// one
					// also, roads have differenct capacities
					EdgeLabel edgeLabel = roadEdge.getLabel();
					double numCrossings = ((RoadTransportRelationshipLabelValue) edgeLabel
							.getCurrentValue()).getNumberCrossings();
					double infectiousProportion = Math.min(
							roadNetworkInfectiousProportion * numCrossings, 1.0);

					// If it exists, we're looking for the label this disease model
					// updates on the node at the other end of the border edge.
					Node otherNode = roadEdge.getOtherNode(node);

					for (NodeLabel otherLabel : otherNode.getLabels()) {
						if (otherLabel instanceof DengueModelHostLabel) {
							DengueModelHostLabel otherDiseaseLabel = (DengueModelHostLabel) otherLabel;

							if (otherDiseaseLabel.getDecorator() == this
									&& otherDiseaseLabel.getIdentifier().equals(
											diseaseLabel.getIdentifier())) {
								DengueModelHostLabelValue otherValue = (DengueModelHostLabelValue) otherDiseaseLabel
										.getTempValue();

								if (frequencyDependent) {
									totalInfectious[0] += infectiousProportion
											* otherValue.getI1();
									totalInfectious[1] += infectiousProportion
											* otherValue.getI12();
									totalInfectious[2] += infectiousProportion
											* otherValue.getI13();
									totalInfectious[3] += infectiousProportion
											* otherValue.getI14();
									totalInfectious[4] += infectiousProportion
											* otherValue.getI2();
									totalInfectious[5] += infectiousProportion
											* otherValue.getI21();
									totalInfectious[6] += infectiousProportion
											* otherValue.getI23();
									totalInfectious[7] += infectiousProportion
											* otherValue.getI24();
									totalInfectious[8] += infectiousProportion
											* otherValue.getI3();
									totalInfectious[9] += infectiousProportion
											* otherValue.getI31();
									totalInfectious[10] += infectiousProportion
											* otherValue.getI32();
									totalInfectious[11] += infectiousProportion
											* otherValue.getI34();
									totalInfectious[12] += infectiousProportion
											* otherValue.getI4();
									totalInfectious[13] += infectiousProportion
											* otherValue.getI41();
									totalInfectious[14] += infectiousProportion
											* otherValue.getI42();
									totalInfectious[15] += infectiousProportion
											* otherValue.getI43();
								} else {
									// TODO
								}

								totalPopulation += infectiousProportion
										* otherValue.getPopulationCount();
								break;
							}
						}
					}
				} // for each road edge

				edgeListObjectPool.release(rEdges);

				if (totalPopulation > 0.0) {
					for(int i=0;i<totalInfectious.length;++i)
						totalInfectious[i] = totalInfectious[i]/totalPopulation;
				} else {
					for(int i=0;i<totalInfectious.length;++i)
						totalInfectious[i] = 0;
				}

		
	}

}
