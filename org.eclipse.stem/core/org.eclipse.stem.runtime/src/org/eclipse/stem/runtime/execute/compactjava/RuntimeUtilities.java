package org.eclipse.stem.runtime.execute.compactjava;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.stem.runtime.compactjava.RuntimeEdge;
import org.eclipse.stem.runtime.compactjava.RuntimeLabel;
import org.eclipse.stem.runtime.compactjava.RuntimeNode;
import org.eclipse.stem.runtime.compactjava.RuntimeScenario;
import org.eclipse.stem.runtime.compactjava.RuntimeType;

public class RuntimeUtilities {

	
	// These are to speed up access to values

		private static short BORDER_LENGTH_INDEX = -1;
		private static short DISEASE_LABEL_TYPE_ID = -1;
		private static short AREA_LABEL_TYPE_ID = -1;
		private static short AREA_INDEX = -1;
		private static short IDENTIFIER_INDEX = -1;
		private static short NUM_CROSSINGS_INDEX = -1;


		public static double [] getEffectiveInfectious(RuntimeScenario runtimeScenario, RuntimeLabel rLabel, double [] localInfectious, double localP, double [] y, 
				String [] allCompartments, String [] infectiousCompartments,
				double characteristicMixingDistance, 
				double roadNetworkInfectiousProportion,
				Map<String, int[]> variable_position_offsets,
				int[] labelVectorPositions,
				Map<RuntimeLabel, Integer> labelSequenceNumberMap) {
			
			RuntimeNode n = runtimeScenario.getGraph().findNode(rLabel.getNodeId());
			double [] infectiousChangeFromMixing = new double[localInfectious.length];
			double populationChangeFromMixing = 0.0;

			if(DISEASE_LABEL_TYPE_ID == -1) {
				DISEASE_LABEL_TYPE_ID= rLabel.getTypeId();
				AREA_LABEL_TYPE_ID = runtimeScenario.getLabelTypeSystem().findTypeId(Names.AREALABEL);
			}
			
			RuntimeType type = runtimeScenario.getLabelTypeSystem().getRuntimeType(rLabel.getTypeId());
			String runtimeLabelName = type.getName();
			
			for(int ei=0;ei<n.getEdges().size();++ei) {
				RuntimeEdge e = n.getEdges().get(ei);

				if(e.getRuntimeType().getName().equals(Names.EDGE)) {
					// 
					if(e.getEdgeLabel().getRuntimeType().getName().equals(Names.COMMONBORDERRELATIONSHIPLABEL)) {

						final RuntimeNode otherNode = (e.getNodeA() == n.getId())? 
								runtimeScenario.getGraph().findNode(e.getNodeB()) : 
									runtimeScenario.getGraph().findNode(e.getNodeA());


								if(BORDER_LENGTH_INDEX == -1) 
									BORDER_LENGTH_INDEX = e.getEdgeLabel().getRuntimeType().getDoubleAttributeIndex(Names.BORDERLENGTH);
								double borderLength = e.getEdgeLabel().getDoubleAttributeValue(BORDER_LENGTH_INDEX);

								if (otherNode.getRuntimeType().getName().equals(Names.REGION)) {
									double otherArea = 0.0;
									double otherPopulation = 0.0;
									double [] otherInfective = new double[localInfectious.length];

									List<RuntimeLabel>areaLabels =  otherNode.getLabels(AREA_LABEL_TYPE_ID); // Should only be one
									if(areaLabels == null || areaLabels.size() == 0) {
										System.err.println("No area label found for node "+otherNode.getId());
									}

									if(AREA_INDEX == -1) 
										AREA_INDEX = areaLabels.get(0).getRuntimeType().getDoubleAttributeIndex(Names.AREA);

									otherArea = areaLabels.get(0).getDoubleAttributeValue(AREA_INDEX);

									if(IDENTIFIER_INDEX == -1) 
										IDENTIFIER_INDEX = rLabel.getRuntimeType().getAttributeIndex(Names.IDENTIFIER);

									List<RuntimeLabel> otherLabels = otherNode.getLabels(DISEASE_LABEL_TYPE_ID);
									for (int li=0;li<otherLabels.size();++li) {
										RuntimeLabel otherDiseaseLabel = otherLabels.get(li);

										if (//otherDiseaseLabel.getDecorator() == this   Not sure if possible
												(otherDiseaseLabel.getAttributeValue(IDENTIFIER_INDEX).equals(
														rLabel.getAttributeValue(IDENTIFIER_INDEX)))) {

											int otherLabelIndex = labelSequenceNumberMap.get(otherDiseaseLabel);
											int otherLabelStartPosition = labelVectorPositions[otherLabelIndex];

											
											for(String c:allCompartments)
												otherPopulation += y[otherLabelStartPosition+variable_position_offsets.get(c)[otherLabelIndex]];
													
										    

											//								if (frequencyDependent) {
										    for(int inf_c = 0;inf_c<localInfectious.length;++inf_c)
										    	otherInfective[inf_c] =  y[otherLabelStartPosition+variable_position_offsets.get(infectiousCompartments[inf_c])[otherLabelIndex]];
											//								} else {
											// TODO
											//								}
											break;

										}

									}

									double mixingFactor = Math.min(characteristicMixingDistance	* borderLength / otherArea, 1.0);

									for(int inf_c=0;inf_c<localInfectious.length;++inf_c)
										infectiousChangeFromMixing[inf_c] += mixingFactor * otherInfective[inf_c];
									
									populationChangeFromMixing += mixingFactor * otherPopulation;
								}
					} else if(e.getEdgeLabel().getRuntimeType().getName().equals(Names.ROADTRANSPORTRELATIONSHIPLABEL)) {
						if(NUM_CROSSINGS_INDEX == -1) 
							NUM_CROSSINGS_INDEX  = e.getEdgeLabel().getRuntimeType().getDoubleAttributeIndex(Names.NUMBERCROSSINGS);

						double numCrossings = e.getEdgeLabel().getDoubleAttributeValue(NUM_CROSSINGS_INDEX);
						double infectiousProportion = Math.min(roadNetworkInfectiousProportion*numCrossings, 1.0);

						final RuntimeNode otherNode = (e.getNodeA() == n.getId())? 
								runtimeScenario.getGraph().findNode(e.getNodeB()) : 
									runtimeScenario.getGraph().findNode(e.getNodeA());

								double otherPopulation = 0.0;
								double [] otherInfective = new double[localInfectious.length];

								List<RuntimeLabel> otherLabels = otherNode.getLabels(DISEASE_LABEL_TYPE_ID);
								for (int li=0;li<otherLabels.size();++li) {
									RuntimeLabel otherDiseaseLabel = otherLabels.get(li);

									if (//otherDiseaseLabel.getDecorator() == this   Not sure if possible
											(otherDiseaseLabel.getAttributeValue(IDENTIFIER_INDEX).equals(
													rLabel.getAttributeValue(IDENTIFIER_INDEX)))) {

										int otherLabelIndex = labelSequenceNumberMap.get(otherDiseaseLabel);
										int otherLabelStartPosition = labelVectorPositions[otherLabelIndex];

										for(String c:allCompartments)
											otherPopulation += y[otherLabelStartPosition+variable_position_offsets.get(c)[otherLabelIndex]];
										
																				//								if (frequencyDependent) {
									    for(int inf_c = 0;inf_c<localInfectious.length;++inf_c)
									    	otherInfective[inf_c] = y[otherLabelStartPosition+variable_position_offsets.get(infectiousCompartments[inf_c])[otherLabelIndex]];
										break;
									}
									for(int inf_c = 0;inf_c<localInfectious.length;++inf_c)
										infectiousChangeFromMixing[inf_c] += infectiousProportion * otherInfective[inf_c];
									populationChangeFromMixing += infectiousProportion * otherPopulation;

								} // for each border edge
					}
				} // It's an edge
			} // For each edge
			// return the sum normalized to the total population
			double totalPopulation =localP+ populationChangeFromMixing;
			double [] retVal = new double[localInfectious.length];

			if (totalPopulation > 0.0) 
				for(int inf_c = 0;inf_c<localInfectious.length;++inf_c)
					retVal[inf_c] = (localInfectious[inf_c] + infectiousChangeFromMixing[inf_c])
						/ totalPopulation;
			
			return retVal;

		}
}
