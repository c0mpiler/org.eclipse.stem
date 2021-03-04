package org.eclipse.stem.runtime.execute.compactjava;


import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math.ode.DerivativeException;
import org.eclipse.stem.runtime.compactjava.RuntimeDecorator;
import org.eclipse.stem.runtime.compactjava.RuntimeLabel;
import org.eclipse.stem.runtime.compactjava.RuntimeNode;
import org.eclipse.stem.runtime.compactjava.RuntimeScenario;

public class DengueModel extends RuntimeDiffEquation {
	
	short hostLabelTypeId;
	short vectorLabelTypeId;
	
	double bitingRateSV;
	double bitingRateIV;
	double hostInfectivity1;
	double hostInfectivity2;
	double hostInfectivity3;
	double hostInfectivity4;
	double hostPrimaryIncubationRate1;
	double hostPrimaryIncubationRate2;
	double hostPrimaryIncubationRate3;
	double hostPrimaryIncubationRate4;
	double hostPrimaryRecoveryRate1;
	double hostPrimaryRecoveryRate2;
	double hostPrimaryRecoveryRate3;
	double hostPrimaryRecoveryRate4;
	double hostPrimaryImmunityLossRate1;
	double hostPrimaryImmunityLossRate2;
	double hostPrimaryImmunityLossRate3;
	double hostPrimaryImmunityLossRate4;
	double hostPrimaryDiseaseDeathRate1;
	double hostPrimaryDiseaseDeathRate2;
	double hostPrimaryDiseaseDeathRate3;
	double hostPrimaryDiseaseDeathRate4;
	double hostADE12;
	double hostADE13;
	double hostADE14;
	double hostADE21;
	double hostADE23;
	double hostADE24;
	double hostADE31;
	double hostADE32;
	double hostADE34;
	double hostADE41;
	double hostADE42;
	double hostADE43;
	double hostSecondaryDiseaseDeathRate12;
	double hostSecondaryDiseaseDeathRate13;
	double hostSecondaryDiseaseDeathRate14;
	double hostSecondaryDiseaseDeathRate21;
	double hostSecondaryDiseaseDeathRate23;
	double hostSecondaryDiseaseDeathRate24;
	double hostSecondaryDiseaseDeathRate31;
	double hostSecondaryDiseaseDeathRate32;
	double hostSecondaryDiseaseDeathRate34;
	double hostSecondaryDiseaseDeathRate41;
	double hostSecondaryDiseaseDeathRate42;
	double hostSecondaryDiseaseDeathRate43;
	double hostSecondaryRecoveryRate12;
	double hostSecondaryRecoveryRate13;
	double hostSecondaryRecoveryRate14;
	double hostSecondaryRecoveryRate21;
	double hostSecondaryRecoveryRate23;
	double hostSecondaryRecoveryRate24;
	double hostSecondaryRecoveryRate31;
	double hostSecondaryRecoveryRate32;
	double hostSecondaryRecoveryRate34;
	double hostSecondaryRecoveryRate41;
	double hostSecondaryRecoveryRate42;
	double hostSecondaryRecoveryRate43;
	double hostSecondaryIncubationRate12;
	double hostSecondaryIncubationRate13;
	double hostSecondaryIncubationRate14;
	double hostSecondaryIncubationRate21;
	double hostSecondaryIncubationRate23;
	double hostSecondaryIncubationRate24;
	double hostSecondaryIncubationRate31;
	double hostSecondaryIncubationRate32;
	double hostSecondaryIncubationRate34;
	double hostSecondaryIncubationRate41;
	double hostSecondaryIncubationRate42;
	double hostSecondaryIncubationRate43;
	double vectorInfectivity1;
	double vectorInfectivity2;
	double vectorInfectivity3;
	double vectorInfectivity4;
	double vectorADE1;
	double vectorADE2;
	double vectorADE3;
	double vectorADE4;
	double vectorIncubationRate1;
	double vectorIncubationRate2;
	double vectorIncubationRate3;
	double vectorIncubationRate4;
	double episilon1;
	double episilon2;
	double episilon3;
	double episilon4;
	long timePeriod;
	
	double characteristicMixingDistance;
	double roadNetworkInfectiousProportion;
	
	String hostPopulationIdentifier;
	String vectorPopulationIdentifier;
	
	public DengueModel(RuntimeScenario s, RuntimeDecorator rd, Integer d) {
		super(s, rd, d);
		timePeriod = (Long)runtimeDecorator.getAttributeValue(runtimeDecorator.getRuntimeType().getAttributeIndex("timePeriod"));
		double adjustFactor = runtimeScenario.getRuntimeSequencer().getStepSize()/(((double)timePeriod)/86400000.0);

		bitingRateSV= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("bitingRateSV"))*adjustFactor;
		bitingRateIV= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("bitingRateIV"))*adjustFactor;
		hostInfectivity1= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostInfectivity1"))*adjustFactor;
		hostInfectivity2= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostInfectivity2"))*adjustFactor;
		hostInfectivity3= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostInfectivity3"))*adjustFactor;
		hostInfectivity4= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostInfectivity4"))*adjustFactor;
		hostPrimaryIncubationRate1= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostPrimaryIncubationRate1"))*adjustFactor;
		hostPrimaryIncubationRate2= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostPrimaryIncubationRate2"))*adjustFactor;
		hostPrimaryIncubationRate3= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostPrimaryIncubationRate3"))*adjustFactor;
		hostPrimaryIncubationRate4= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostPrimaryIncubationRate4"))*adjustFactor;
		hostPrimaryRecoveryRate1= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostPrimaryRecoveryRate1"))*adjustFactor;
		hostPrimaryRecoveryRate2= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostPrimaryRecoveryRate2"))*adjustFactor;
		hostPrimaryRecoveryRate3= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostPrimaryRecoveryRate3"))*adjustFactor;
		hostPrimaryRecoveryRate4= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostPrimaryRecoveryRate4"))*adjustFactor;
		hostPrimaryImmunityLossRate1= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostPrimaryImmunityLossRate1"))*adjustFactor;
		hostPrimaryImmunityLossRate2= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostPrimaryImmunityLossRate2"))*adjustFactor;
		hostPrimaryImmunityLossRate3= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostPrimaryImmunityLossRate3"))*adjustFactor;
		hostPrimaryImmunityLossRate4= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostPrimaryImmunityLossRate4"))*adjustFactor;
		hostPrimaryDiseaseDeathRate1= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostPrimaryDiseaseDeathRate1"))*adjustFactor;
		hostPrimaryDiseaseDeathRate2= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostPrimaryDiseaseDeathRate2"))*adjustFactor;
		hostPrimaryDiseaseDeathRate3= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostPrimaryDiseaseDeathRate3"))*adjustFactor;
		hostPrimaryDiseaseDeathRate4= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostPrimaryDiseaseDeathRate4"))*adjustFactor;
		hostADE12= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostADE12"))*adjustFactor;
		hostADE13= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostADE13"))*adjustFactor;
		hostADE14= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostADE14"))*adjustFactor;
		hostADE21= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostADE21"))*adjustFactor;
		hostADE23= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostADE23"))*adjustFactor;
		hostADE24= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostADE24"))*adjustFactor;
		hostADE31= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostADE31"))*adjustFactor;
		hostADE32= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostADE32"))*adjustFactor;
		hostADE34= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostADE34"))*adjustFactor;
		hostADE41= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostADE41"))*adjustFactor;
		hostADE42= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostADE42"))*adjustFactor;
		hostADE43= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostADE43"))*adjustFactor;
		hostSecondaryDiseaseDeathRate12= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryDiseaseDeathRate12"))*adjustFactor;
		hostSecondaryDiseaseDeathRate13= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryDiseaseDeathRate13"))*adjustFactor;
		hostSecondaryDiseaseDeathRate14= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryDiseaseDeathRate14"))*adjustFactor;
		hostSecondaryDiseaseDeathRate21= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryDiseaseDeathRate21"))*adjustFactor;
		hostSecondaryDiseaseDeathRate23= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryDiseaseDeathRate23"))*adjustFactor;
		hostSecondaryDiseaseDeathRate24= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryDiseaseDeathRate24"))*adjustFactor;
		hostSecondaryDiseaseDeathRate31= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryDiseaseDeathRate31"))*adjustFactor;
		hostSecondaryDiseaseDeathRate32= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryDiseaseDeathRate32"))*adjustFactor;
		hostSecondaryDiseaseDeathRate34= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryDiseaseDeathRate34"))*adjustFactor;
		hostSecondaryDiseaseDeathRate41= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryDiseaseDeathRate41"))*adjustFactor;
		hostSecondaryDiseaseDeathRate42= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryDiseaseDeathRate42"))*adjustFactor;
		hostSecondaryDiseaseDeathRate43= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryDiseaseDeathRate43"))*adjustFactor;
		hostSecondaryRecoveryRate12= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryRecoveryRate12"))*adjustFactor;
		hostSecondaryRecoveryRate13= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryRecoveryRate13"))*adjustFactor;
		hostSecondaryRecoveryRate13= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryRecoveryRate14"))*adjustFactor;
		hostSecondaryRecoveryRate21= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryRecoveryRate21"))*adjustFactor;
		hostSecondaryRecoveryRate21= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryRecoveryRate23"))*adjustFactor;
		hostSecondaryRecoveryRate24= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryRecoveryRate24"))*adjustFactor;
		hostSecondaryRecoveryRate31= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryRecoveryRate31"))*adjustFactor;
		hostSecondaryRecoveryRate32= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryRecoveryRate32"))*adjustFactor;
		hostSecondaryRecoveryRate34= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryRecoveryRate34"))*adjustFactor;
		hostSecondaryRecoveryRate41= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryRecoveryRate41"))*adjustFactor;
		hostSecondaryRecoveryRate42= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryRecoveryRate42"))*adjustFactor;
		hostSecondaryRecoveryRate43= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryRecoveryRate43"))*adjustFactor;
		hostSecondaryIncubationRate12= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryIncubationRate12"))*adjustFactor;
		hostSecondaryIncubationRate13= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryIncubationRate13"))*adjustFactor;
		hostSecondaryIncubationRate14= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryIncubationRate14"))*adjustFactor;
		hostSecondaryIncubationRate21= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryIncubationRate21"))*adjustFactor;
		hostSecondaryIncubationRate23= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryIncubationRate23"))*adjustFactor;
		hostSecondaryIncubationRate23= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryIncubationRate24"))*adjustFactor;
		hostSecondaryIncubationRate31= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryIncubationRate31"))*adjustFactor;
		hostSecondaryIncubationRate32= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryIncubationRate32"))*adjustFactor;
		hostSecondaryIncubationRate34= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryIncubationRate34"))*adjustFactor;
		hostSecondaryIncubationRate41= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryIncubationRate41"))*adjustFactor;
		hostSecondaryIncubationRate42= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryIncubationRate42"))*adjustFactor;
		hostSecondaryIncubationRate43= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("hostSecondaryIncubationRate43"))*adjustFactor;
		vectorInfectivity1= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("vectorInfectivity1"))*adjustFactor;
		vectorInfectivity2= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("vectorInfectivity2"))*adjustFactor;
		vectorInfectivity3= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("vectorInfectivity3"))*adjustFactor;
		vectorInfectivity3= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("vectorInfectivity4"))*adjustFactor;
		vectorInfectivity3= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("vectorADE1"))*adjustFactor;
		vectorADE2= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("vectorADE2"))*adjustFactor;
		vectorADE3= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("vectorADE3"))*adjustFactor;
		vectorADE4= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("vectorADE4"))*adjustFactor;
		vectorIncubationRate1= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("vectorIncubationRate1"))*adjustFactor;
		vectorIncubationRate2= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("vectorIncubationRate2"))*adjustFactor;
		vectorIncubationRate3= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("vectorIncubationRate3"))*adjustFactor;
		vectorIncubationRate4= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("vectorIncubationRate4"))*adjustFactor;
		vectorIncubationRate4= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("episilon1"))*adjustFactor;
		vectorIncubationRate4= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("episilon2"))*adjustFactor;
		vectorIncubationRate4= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("episilon3"))*adjustFactor;
		episilon4= runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("episilon4"))*adjustFactor;
		
		characteristicMixingDistance = runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("characteristicMixingDistance"));
		roadNetworkInfectiousProportion = runtimeDecorator.getDoubleAttributeValue(runtimeDecorator.getRuntimeType().getDoubleAttributeIndex("roadNetworkInfectiousProportion"));
		
		
		hostPopulationIdentifier = (String)runtimeDecorator.getAttributeValue(runtimeDecorator.getRuntimeType().getAttributeIndex("populationIdentifier"));
		vectorPopulationIdentifier = (String)runtimeDecorator.getAttributeValue(runtimeDecorator.getRuntimeType().getAttributeIndex("vectorPopulationIdentifier"));
		// Find the type ids for the two type of labels the model use
		
		hostLabelTypeId = runtimeScenario.getLabelTypeSystem().findTypeId("DengueModelHostLabel");
		vectorLabelTypeId = runtimeScenario.getLabelTypeSystem().findTypeId("DengueModelVectorLabel");
	}
	
	/**
	 * Remember the positions of the variables we need for fast access below
	 * @param y
	 */
	public void initialize(double [] y) {
		super.initialize(y);
		String [] vars = {
				"s",
				"E1",
				"E2",
				"E3",
				"E4",
				"I1",
			 	"I2",
				"I3",
				"I4",
				"T1",
				"T2",
				"T3",
				"T4",
				"R1",
				"R2",
				"R3",
				"R4",
				"E12",
				"E13",
				"E14",
				"E21",
				"E23",
				"E24",
				"E31",
				"E32",
				"E34",
				"E41",
				"E42",
				"E43",
				"I12",
				"I13",
				"I14",
				"I21",
				"I23",
				"I24",
				"I31",
				"I32",
				"I34",
				"I41",
				"I42",
				"I43",
				"R",
				"incidence",
				"incidence1",
				"incidence2",
				"incidence3",
				"incidence4",
				"incidence12",
				"incidence21",
				"incidence31",
				"incidence41",
				"incidence13",
				"incidence23",
				"incidence32",
				"incidence42",
				"incidence14",
				"incidence24",
				"incidence34",
				"incidence43",
				"diseaseDeaths",
				"diseaseDeaths1",
				"diseaseDeaths2",
				"diseaseDeaths3",
				"diseaseDeaths4",
				"diseaseDeaths12",
				"diseaseDeaths21",
				"diseaseDeaths31",
				"diseaseDeaths41",
				"diseaseDeaths13",
				"diseaseDeaths23",
				"diseaseDeaths32",
				"diseaseDeaths42",
				"diseaseDeaths14",
				"diseaseDeaths24",
				"diseaseDeaths34",
				"diseaseDeaths43"
		};
		
		extractVariablePositions(vars);
	}
		
	@Override
	public int getDimension() {
		return dimensions;
	}

	// For performance
	private short IDENTIFIER_ATTR_INDEX=-1;
	private short IDENTIFIER_HOST_ATTR_INDEX=-1;
	private short I1_ATTR_INDEX=-1;
	private short I2_ATTR_INDEX=-1;
	private short I3_ATTR_INDEX=-1;
	private short I4_ATTR_INDEX=-1;
	String [] allComps = {"s", "E1", "E2", "E3", "E4", "I1", "I2", "I3", "I4", "T1", "T2", "T3", "T4", "R1", "R2", "R3", "R4", "E12", "E13", "E14", "E21", "E23", "E24", "E31", "E32", "E34", "E41", "E42", "E43", 
			"I12", "I13", "I14", "I21", "I23", "I24", "I31", "I32", "I34", "I41", "I42", "I43"};
	
	String [] infComps = {"I1", "I2", "I3", "I4", "I12", "I13", "I14", "I21", "I23", "I24", "I31", "I32", "I34", "I41", "I42", "I43"};
	
	@Override
	public void computeDerivatives(double t, double[] y, double[] yDot)
			throws DerivativeException {
		
		int index = 0;
		int labelIndex = 0;
		for(Integer rLabelId:runtimeDecorator.getLabelsToUpdate()) {
			RuntimeLabel rLabel = runtimeScenario.getGraph().findLabel(rLabelId);
			RuntimeNode rNode = runtimeScenario.getGraph().findNode(rLabel.getNodeId());
		
			if (rLabel.getRuntimeType().getName().equals("DengueModelHostLabel")) {
				double s = y[index+variable_position_offsets.get("s")[labelIndex]];
				double e1 = y[index+variable_position_offsets.get("E1")[labelIndex]];
				double e2 = y[index+variable_position_offsets.get("E2")[labelIndex]];
				double e3 = y[index+variable_position_offsets.get("E3")[labelIndex]];
				double e4 = y[index+variable_position_offsets.get("E4")[labelIndex]];
				double i1 = y[index+variable_position_offsets.get("I1")[labelIndex]];
			 	double i2 = y[index+variable_position_offsets.get("I2")[labelIndex]];
				double i3 = y[index+variable_position_offsets.get("I3")[labelIndex]];
				double i4 = y[index+variable_position_offsets.get("I4")[labelIndex]];
				double t1 = y[index+variable_position_offsets.get("T1")[labelIndex]];
				double t2 = y[index+variable_position_offsets.get("T2")[labelIndex]];
				double t3 = y[index+variable_position_offsets.get("T3")[labelIndex]];
				double t4 = y[index+variable_position_offsets.get("T4")[labelIndex]];
				double r1 = y[index+variable_position_offsets.get("R1")[labelIndex]];
				double r2 = y[index+variable_position_offsets.get("R2")[labelIndex]];
				double r3 = y[index+variable_position_offsets.get("R3")[labelIndex]];
				double r4 = y[index+variable_position_offsets.get("R4")[labelIndex]];
				double e12 = y[index+variable_position_offsets.get("E12")[labelIndex]];
				double e13 = y[index+variable_position_offsets.get("E13")[labelIndex]];
				double e14 = y[index+variable_position_offsets.get("E14")[labelIndex]];
				double e21 = y[index+variable_position_offsets.get("E21")[labelIndex]];
				double e23 = y[index+variable_position_offsets.get("E23")[labelIndex]];
				double e24 = y[index+variable_position_offsets.get("E24")[labelIndex]];
				double e31 = y[index+variable_position_offsets.get("E31")[labelIndex]];
				double e32 = y[index+variable_position_offsets.get("E32")[labelIndex]];
				double e34 = y[index+variable_position_offsets.get("E34")[labelIndex]];
				double e41 = y[index+variable_position_offsets.get("E41")[labelIndex]];
				double e42 = y[index+variable_position_offsets.get("E42")[labelIndex]];
				double e43 = y[index+variable_position_offsets.get("E43")[labelIndex]];
				double i12 = y[index+variable_position_offsets.get("I12")[labelIndex]];
				double i13 = y[index+variable_position_offsets.get("I13")[labelIndex]];
				double i14 = y[index+variable_position_offsets.get("I14")[labelIndex]];
				double i21 = y[index+variable_position_offsets.get("I21")[labelIndex]];
				double i23 = y[index+variable_position_offsets.get("I23")[labelIndex]];
				double i24 = y[index+variable_position_offsets.get("I24")[labelIndex]];
				double i31 = y[index+variable_position_offsets.get("I31")[labelIndex]];
				double i32 = y[index+variable_position_offsets.get("I32")[labelIndex]];
				double i34 = y[index+variable_position_offsets.get("I34")[labelIndex]];
				double i41 = y[index+variable_position_offsets.get("I41")[labelIndex]];
				double i42 = y[index+variable_position_offsets.get("I42")[labelIndex]];
				double i43 = y[index+variable_position_offsets.get("I43")[labelIndex]];
				double r = y[index+variable_position_offsets.get("R")[labelIndex]];
				double hostPopulationCount = s+e1+e2+e3+e4+i1+i2+i3+i4+t1+t2+t3+t4+r1+r2+r3+r4+e12+e13+e14+e21+e23+e24+e31+e32+e34+e41+e42+e43+i12+i13+i14+i21+i23+i24+i31+i32+i34+i41+i42+i43+r;
				
				if (hostPopulationCount == 0.0) {
					continue;
				}

				RuntimeLabel vectorRLabel = null;
				List<RuntimeLabel> allLabels = rNode.getLabels(vectorLabelTypeId);

				if(allLabels == null) {
					System.err.println("Cannot find vector label");
					continue;
				}

				for (RuntimeLabel label : allLabels) {
					if(IDENTIFIER_ATTR_INDEX == -1)
						IDENTIFIER_ATTR_INDEX = label.getRuntimeType().getAttributeIndex(Names.IDENTIFIER);
					if(label.getAttributeValue(IDENTIFIER_ATTR_INDEX).equals(vectorPopulationIdentifier))
						{vectorRLabel = label;break;}
				}
				if(vectorRLabel == null) {
					System.err.println("Cannot find vector label");
					continue;
				}
				
				int vectorLabelIndex =labelSequenceNumberMap.get(vectorRLabel); 
				int vectorLabelStartPosition = labelVectorPositions[vectorLabelIndex];
				double vector_i1 = y[vectorLabelStartPosition+variable_position_offsets.get("I1")[vectorLabelIndex]];
			 	double vector_i2 = y[vectorLabelStartPosition+variable_position_offsets.get("I2")[vectorLabelIndex]];
				double vector_i3 = y[vectorLabelStartPosition+variable_position_offsets.get("I3")[vectorLabelIndex]];
				double vector_i4 = y[vectorLabelStartPosition+variable_position_offsets.get("I4")[vectorLabelIndex]];

				
						// define the transition between the compartments
				double toE1 = hostInfectivity1 * bitingRateIV
						* vector_i1 * s / hostPopulationCount;
				double toE2 = hostInfectivity2 * bitingRateIV
						* vector_i2 * s / hostPopulationCount;
				double toE3 = hostInfectivity3 * bitingRateIV
						* vector_i3 * s / hostPopulationCount;
				double toE4 = hostInfectivity4 * bitingRateIV
						* vector_i4 * s / hostPopulationCount;

				double toI1 = hostPrimaryIncubationRate1 * e1;
				double toI2 = hostPrimaryIncubationRate2 * e2;
				double toI3 = hostPrimaryIncubationRate3 * e3;
				double toI4 = hostPrimaryIncubationRate4 * e4;

				double toT1 = episilon1 * hostPrimaryRecoveryRate1 * i1;
				double toT2 = episilon2 * hostPrimaryRecoveryRate2 * i2;
				double toT3 = episilon3 * hostPrimaryRecoveryRate3 * i3;
				double toT4 = episilon4 * hostPrimaryRecoveryRate4 * i4;
				
				//imperfect cross immunity - 20110818
				double fromI1toR1 = (1 - episilon1) * hostPrimaryRecoveryRate1 * i1;
				double fromI2toR2 = (1 - episilon2) * hostPrimaryRecoveryRate2 * i2;
				double fromI3toR3 = (1 - episilon3) * hostPrimaryRecoveryRate3 * i3;
				double fromI4toR4 = (1 - episilon4) * hostPrimaryRecoveryRate4 * i4;

				double toR1 = hostPrimaryImmunityLossRate1 * t1;
				double toR2 = hostPrimaryImmunityLossRate2 * t2;
				double toR3 = hostPrimaryImmunityLossRate3 * t3;
				double toR4 = hostPrimaryImmunityLossRate4 * t3;

				if(I1_ATTR_INDEX == -1) {
					I1_ATTR_INDEX = vectorRLabel.getRuntimeType().getDoubleAttributeIndex("I1");
					I2_ATTR_INDEX = vectorRLabel.getRuntimeType().getDoubleAttributeIndex("I2");
					I3_ATTR_INDEX = vectorRLabel.getRuntimeType().getDoubleAttributeIndex("I3");
					I4_ATTR_INDEX = vectorRLabel.getRuntimeType().getDoubleAttributeIndex("I4");
					
				}
				//the formula is revised due to the wrong definition - 20110818
				
				double toE12 = vectorADE2 * hostInfectivity2 * bitingRateIV
						* vectorRLabel.getDoubleAttributeValue(I2_ATTR_INDEX) * r1 / hostPopulationCount;
				double toE13 = vectorADE3 * hostInfectivity3 * bitingRateIV
						* vectorRLabel.getDoubleAttributeValue(I3_ATTR_INDEX) * r1 / hostPopulationCount;
				double toE14 = vectorADE4 * hostInfectivity4 * bitingRateIV
						* vectorRLabel.getDoubleAttributeValue(I4_ATTR_INDEX) * r1 / hostPopulationCount;
				double toE21 = vectorADE1 * hostInfectivity1 * bitingRateIV
						* vectorRLabel.getDoubleAttributeValue(I1_ATTR_INDEX) * r2 / hostPopulationCount;
				double toE23 = vectorADE3 * hostInfectivity3 * bitingRateIV
						* vectorRLabel.getDoubleAttributeValue(I3_ATTR_INDEX) * r2 / hostPopulationCount;
				double toE24 = vectorADE4 * hostInfectivity4 * bitingRateIV
						* vectorRLabel.getDoubleAttributeValue(I4_ATTR_INDEX) * r2 / hostPopulationCount;
				double toE31 = vectorADE1 * hostInfectivity1 * bitingRateIV
						* vectorRLabel.getDoubleAttributeValue(I1_ATTR_INDEX) * r3 / hostPopulationCount;
				double toE32 = vectorADE2 * hostInfectivity2 * bitingRateIV
						* vectorRLabel.getDoubleAttributeValue(I2_ATTR_INDEX) * r3 / hostPopulationCount;
				double toE34 = vectorADE4 * hostInfectivity4 * bitingRateIV
						* vectorRLabel.getDoubleAttributeValue(I4_ATTR_INDEX) * r3 / hostPopulationCount;
				double toE41 = vectorADE1 * hostInfectivity1 * bitingRateIV
						* vectorRLabel.getDoubleAttributeValue(I1_ATTR_INDEX) * r4 / hostPopulationCount;
				double toE42 = vectorADE2 * hostInfectivity2 * bitingRateIV
						* vectorRLabel.getDoubleAttributeValue(I2_ATTR_INDEX) * r4 / hostPopulationCount;
				double toE43 = vectorADE3 * hostInfectivity3 * bitingRateIV
						* vectorRLabel.getDoubleAttributeValue(I3_ATTR_INDEX) * r4 / hostPopulationCount;

				double toI12 = hostSecondaryIncubationRate12
						* e12;
				double toI13 = hostSecondaryIncubationRate13
						* e13;
				double toI14 = hostSecondaryIncubationRate14
						* e14;
				double toI21 = hostSecondaryIncubationRate21
						* e21;
				double toI23 = hostSecondaryIncubationRate23
						* e23;
				double toI24 = hostSecondaryIncubationRate24
						* e24;
				double toI31 = hostSecondaryIncubationRate31
						* e31;
				double toI32 = hostSecondaryIncubationRate32
						* e32;
				double toI34 = hostSecondaryIncubationRate34
						* e34;
				double toI41 = hostSecondaryIncubationRate41
						* e41;
				double toI42 = hostSecondaryIncubationRate42
						* e42;
				double toI43 = hostSecondaryIncubationRate43
						* e43;

				double toR12 = hostSecondaryRecoveryRate12 * i12;
				double toR13 = hostSecondaryRecoveryRate13 * i13;
				double toR14 = hostSecondaryRecoveryRate14 * i14;
				double toR21 = hostSecondaryRecoveryRate21 * i21;
				double toR23 = hostSecondaryRecoveryRate23 * i23;
				double toR24 = hostSecondaryRecoveryRate24 * i24;
				double toR31 = hostSecondaryRecoveryRate31 * i31;
				double toR32 = hostSecondaryRecoveryRate32 * i32;
				double toR34 = hostSecondaryRecoveryRate34 * i34;
				double toR41 = hostSecondaryRecoveryRate41 * i41;
				double toR42 = hostSecondaryRecoveryRate42 * i42;
				double toR43 = hostSecondaryRecoveryRate43 * i43;

				double deathsI1 = hostPrimaryDiseaseDeathRate1
						* i1;
				double deathsI2 = hostPrimaryDiseaseDeathRate2
						* i2;
				double deathsI3 = hostPrimaryDiseaseDeathRate3
						* i3;
				double deathsI4 = hostPrimaryDiseaseDeathRate4
						* i4;

				double deathsI12 = hostSecondaryDiseaseDeathRate12
						* i12;
				double deathsI13 = hostSecondaryDiseaseDeathRate13
						* i13;
				double deathsI14 = hostSecondaryDiseaseDeathRate14
						* i14;
				double deathsI21 = hostSecondaryDiseaseDeathRate21
						* i21;
				double deathsI23 = hostSecondaryDiseaseDeathRate23
						* i23;
				double deathsI24 = hostSecondaryDiseaseDeathRate24
						* i24;
				double deathsI31 = hostSecondaryDiseaseDeathRate31
						* i31;
				double deathsI32 = hostSecondaryDiseaseDeathRate32
						* i32;
				double deathsI34 = hostSecondaryDiseaseDeathRate34
						* i34;
				double deathsI41 = hostSecondaryDiseaseDeathRate41
						* i41;
				double deathsI42 = hostSecondaryDiseaseDeathRate42
						* i42;
				double deathsI43 = hostSecondaryDiseaseDeathRate43
						* i43;

				double deltaS =-toE1 - toE2 - toE3 - toE4;
				yDot[index+variable_position_offsets.get("s")[labelIndex]] = deltaS;
				double deltaE1 =toE1 - toI1;
				yDot[index+variable_position_offsets.get("E1")[labelIndex]] = deltaE1;
				double deltaE2 =toE2 - toI2;
				yDot[index+variable_position_offsets.get("E2")[labelIndex]] = deltaE2;
				double deltaE3 = toE3 - toI3;
				yDot[index+variable_position_offsets.get("E3")[labelIndex]] = deltaE3;
				double deltaE4 = toE4 - toI4;
				yDot[index+variable_position_offsets.get("E4")[labelIndex]] = deltaE4;

				double deltaI1 =(toI1 - toT1 - deathsI1 - fromI1toR1);
				yDot[index+variable_position_offsets.get("I1")[labelIndex]] = deltaI1;
				double deltaI2 =(toI2 - toT2 - deathsI2 - fromI2toR2);
				yDot[index+variable_position_offsets.get("I2")[labelIndex]] = deltaI2;
				double deltaI3 =(toI3 - toT3 - deathsI3 - fromI3toR3);
				yDot[index+variable_position_offsets.get("I3")[labelIndex]] = deltaI3;
				double deltaI4 =(toI4 - toT4 - deathsI4 - fromI4toR4);
				yDot[index+variable_position_offsets.get("I4")[labelIndex]] = deltaI4;

				double deltaT1 =(toT1 - toR1);
				yDot[index+variable_position_offsets.get("T1")[labelIndex]] = deltaT1;
				double deltaT2 =(toT2 - toR2);
				yDot[index+variable_position_offsets.get("T2")[labelIndex]] = deltaT2;
				double deltaT3 =(toT3 - toR3);
				yDot[index+variable_position_offsets.get("T3")[labelIndex]] = deltaT3;
				double deltaT4 =(toT4 - toR4);
				yDot[index+variable_position_offsets.get("T4")[labelIndex]] = deltaT4;

				double deltaR1 =(fromI1toR1 + toR1 - toE12 - toE13 - toE14);
				yDot[index+variable_position_offsets.get("R1")[labelIndex]] = deltaR1;
				double deltaR2 =(fromI2toR2 + toR2 - toE21 - toE23 - toE24);
				yDot[index+variable_position_offsets.get("R2")[labelIndex]] = deltaR2;
				double deltaR3 =(fromI3toR3 + toR3 - toE31 - toE32 - toE34);
				yDot[index+variable_position_offsets.get("E3")[labelIndex]] = deltaR3;
				double deltaR4 =(fromI4toR4 + toR4 - toE41 - toE42 - toE43);
				yDot[index+variable_position_offsets.get("R4")[labelIndex]] = deltaR4;

				double deltaE12 =(toE12 - toI12);
				yDot[index+variable_position_offsets.get("E12")[labelIndex]] = deltaE12;
				double deltaE13 =(toE13 - toI13);
				yDot[index+variable_position_offsets.get("E13")[labelIndex]] = deltaE13;
				double deltaE14 =(toE14 - toI14);
				yDot[index+variable_position_offsets.get("E14")[labelIndex]] = deltaE14;
				double deltaE21 =(toE21 - toI21);
				yDot[index+variable_position_offsets.get("E21")[labelIndex]] = deltaE21;
				double deltaE23 =(toE23 - toI23);
				yDot[index+variable_position_offsets.get("E23")[labelIndex]] = deltaE23;
				double deltaE24 =(toE24 - toI24);
				yDot[index+variable_position_offsets.get("E24")[labelIndex]] = deltaE24;
				double deltaE31 =(toE31 - toI31);
				yDot[index+variable_position_offsets.get("E31")[labelIndex]] = deltaE31;
				double deltaE32 =(toE32 - toI32);
				yDot[index+variable_position_offsets.get("E32")[labelIndex]] = deltaE32;
				double deltaE34 =(toE34 - toI34);
				yDot[index+variable_position_offsets.get("E34")[labelIndex]] = deltaE34;
				double deltaE41 =(toE41 - toI41);
				yDot[index+variable_position_offsets.get("E41")[labelIndex]] = deltaE41;
				double deltaE42 =(toE42 - toI42);
				yDot[index+variable_position_offsets.get("E42")[labelIndex]] = deltaE42;
				double deltaE43 =(toE43 - toI43);
				yDot[index+variable_position_offsets.get("E43")[labelIndex]] = deltaE43;

				double deltaI12 =(toI12 - toR12);
				yDot[index+variable_position_offsets.get("I12")[labelIndex]] = deltaI12;
				double deltaI13 =(toI13 - toR13);
				yDot[index+variable_position_offsets.get("I13")[labelIndex]] = deltaI13;
				double deltaI14 =(toI14 - toR14);
				yDot[index+variable_position_offsets.get("I14")[labelIndex]] = deltaI14;
				double deltaI21 =(toI21 - toR21);
				yDot[index+variable_position_offsets.get("I21")[labelIndex]] = deltaI21;
				double deltaI23 =(toI23 - toR23);
				yDot[index+variable_position_offsets.get("I23")[labelIndex]] = deltaI23;
				double deltaI24 =(toI24 - toR24);
				yDot[index+variable_position_offsets.get("I24")[labelIndex]] = deltaI24;
				double deltaI31 =(toI31 - toR31);
				yDot[index+variable_position_offsets.get("I31")[labelIndex]] = deltaI31;
				double deltaI32 =(toI32 - toR32);
				yDot[index+variable_position_offsets.get("I32")[labelIndex]] = deltaI32;
				double deltaI34 =(toI34 - toR34);
				yDot[index+variable_position_offsets.get("I34")[labelIndex]] = deltaI34;
				double deltaI41 =(toI41 - toR41);
				yDot[index+variable_position_offsets.get("I41")[labelIndex]] = deltaI41;
				double deltaI42 =(toI42 - toR42);
				yDot[index+variable_position_offsets.get("I42")[labelIndex]] = deltaI42;
				double deltaI43 =(toI43 - toR43);
				yDot[index+variable_position_offsets.get("I43")[labelIndex]] = deltaI43;

				double deltaR =(toR12 + toR13 + toR14 + toR21 + toR23 + toR24
						+ toR31 + toR32 + toR34 + toR41 + toR42 + toR43);
				yDot[index+variable_position_offsets.get("R")[labelIndex]] = deltaR;
				
				double newIncidence1 = (toE1);
				yDot[index+variable_position_offsets.get("incidence1")[labelIndex]] = newIncidence1;
				double newIncidence2 = (toE2);
				yDot[index+variable_position_offsets.get("incidence2")[labelIndex]] = newIncidence2;
				double newIncidence3 = (toE3);
				yDot[index+variable_position_offsets.get("incidence3")[labelIndex]] = newIncidence3;
				double newIncidence4 = (toE4);
				yDot[index+variable_position_offsets.get("incidence4")[labelIndex]] = newIncidence4;

				double newIncidence12 = (toE12);
				yDot[index+variable_position_offsets.get("incidence12")[labelIndex]] = newIncidence12;
				double newIncidence13 = (toE13);
				yDot[index+variable_position_offsets.get("incidence13")[labelIndex]] = newIncidence13;
				double newIncidence14 = (toE14);
				yDot[index+variable_position_offsets.get("incidence14")[labelIndex]] = newIncidence14;
				double newIncidence21 = (toE21);
				yDot[index+variable_position_offsets.get("incidence21")[labelIndex]] = newIncidence21;
				double newIncidence23 = (toE23);
				yDot[index+variable_position_offsets.get("incidence23")[labelIndex]] = newIncidence23;
				double newIncidence24 = (toE24);
				yDot[index+variable_position_offsets.get("incidence24")[labelIndex]] = newIncidence24;
				double newIncidence31 = (toE31);
				yDot[index+variable_position_offsets.get("incidence31")[labelIndex]] = newIncidence31;
				double newIncidence32 = (toE32);
				yDot[index+variable_position_offsets.get("incidence32")[labelIndex]] = newIncidence32;
				double newIncidence34 = (toE34);
				yDot[index+variable_position_offsets.get("incidence34")[labelIndex]] = newIncidence34;
				double newIncidence41 = (toE41);
				yDot[index+variable_position_offsets.get("incidence41")[labelIndex]] = newIncidence41;
				double newIncidence42 = (toE42);
				yDot[index+variable_position_offsets.get("incidence42")[labelIndex]] = newIncidence42;
				double newIncidence43 = (toE43);
				yDot[index+variable_position_offsets.get("incidence43")[labelIndex]] = newIncidence43;

				double newIncidence = (toE1 + toE2 + toE3 + toE4 + toE12 + toE13
						+ toE14 + toE21 + toE23 + toE24 + toE31 + toE32 + toE34
						+ toE41 + toE42 + toE43);

				yDot[index+variable_position_offsets.get("incidence")[labelIndex]] = newIncidence;
				double newDiseaseDeaths1 = (deathsI1);
				yDot[index+variable_position_offsets.get("diseaseDeaths1")[labelIndex]] = newDiseaseDeaths1;
				double newDiseaseDeaths2 = (deathsI2);
				yDot[index+variable_position_offsets.get("diseaseDeaths2")[labelIndex]] = newDiseaseDeaths2;
				double newDiseaseDeaths3 = (deathsI3);
				yDot[index+variable_position_offsets.get("diseaseDeaths3")[labelIndex]] = newDiseaseDeaths3;
				double newDiseaseDeaths4 = (deathsI4);
				yDot[index+variable_position_offsets.get("diseaseDeaths4")[labelIndex]] = newDiseaseDeaths4;

				double newDiseaseDeaths12 = (deathsI12);
				yDot[index+variable_position_offsets.get("diseaseDeaths12")[labelIndex]] = newDiseaseDeaths12;
				double newDiseaseDeaths13 = (deathsI13);
				yDot[index+variable_position_offsets.get("diseaseDeaths13")[labelIndex]] = newDiseaseDeaths13;
				double newDiseaseDeaths14 = (deathsI14);
				yDot[index+variable_position_offsets.get("diseaseDeaths14")[labelIndex]] = newDiseaseDeaths14;
				double newDiseaseDeaths21 = (deathsI21);
				yDot[index+variable_position_offsets.get("diseaseDeaths21")[labelIndex]] = newDiseaseDeaths21;
				double newDiseaseDeaths23 = (deathsI23);
				yDot[index+variable_position_offsets.get("diseaseDeaths23")[labelIndex]] = newDiseaseDeaths23;
				double newDiseaseDeaths24 = (deathsI24);
				yDot[index+variable_position_offsets.get("diseaseDeaths24")[labelIndex]] = newDiseaseDeaths24;
				double newDiseaseDeaths31 = (deathsI31);
				yDot[index+variable_position_offsets.get("diseaseDeaths31")[labelIndex]] = newDiseaseDeaths31;
				double newDiseaseDeaths32 = (deathsI32);
				yDot[index+variable_position_offsets.get("diseaseDeaths32")[labelIndex]] = newDiseaseDeaths32;
				double newDiseaseDeaths34 = (deathsI34);
				yDot[index+variable_position_offsets.get("diseaseDeaths34")[labelIndex]] = newDiseaseDeaths34;
				double newDiseaseDeaths41 = (deathsI41);
				yDot[index+variable_position_offsets.get("diseaseDeaths41")[labelIndex]] = newDiseaseDeaths41;
				double newDiseaseDeaths42 = (deathsI42);
				yDot[index+variable_position_offsets.get("diseaseDeaths42")[labelIndex]] = newDiseaseDeaths42;
				double newDiseaseDeaths43 = (deathsI43);
				yDot[index+variable_position_offsets.get("diseaseDeaths43")[labelIndex]] = newDiseaseDeaths43;

				double newDiseaseDeaths = (deathsI1 + deathsI2 + deathsI3
						+ deathsI4 + deathsI12 + deathsI13 + deathsI14 + deathsI21
						+ deathsI23 + deathsI24 + deathsI31 + deathsI32 + deathsI34
						+ deathsI41 + deathsI42 + deathsI43);
				yDot[index+variable_position_offsets.get("diseaseDeaths")[labelIndex]] = newDiseaseDeaths;
			}
			// else if the current population is vector population
			else if (rLabel.getRuntimeType().getName().equals("DengueModelVectorLabel")) {
			
				double s = y[index+variable_position_offsets.get("s")[labelIndex]];
				double e1 = y[index+variable_position_offsets.get("E1")[labelIndex]];
				double e2 = y[index+variable_position_offsets.get("E2")[labelIndex]];
				double e3 = y[index+variable_position_offsets.get("E3")[labelIndex]];
				double e4 = y[index+variable_position_offsets.get("E4")[labelIndex]];
				double i1 = y[index+variable_position_offsets.get("I1")[labelIndex]];
			 	double i2 = y[index+variable_position_offsets.get("I2")[labelIndex]];
				double i3 = y[index+variable_position_offsets.get("I3")[labelIndex]];
				double i4 = y[index+variable_position_offsets.get("I4")[labelIndex]];
				double vectorPopulationCount = s+e1+e2+e3+e4+i1+i2+i3+i4;

				
				if (vectorPopulationCount == 0.0) {
					continue;
				}

				RuntimeLabel hostRLabel = null;
				List<RuntimeLabel> allLabels = rNode.getLabels(hostLabelTypeId);

				for (RuntimeLabel label : allLabels) {
					if(IDENTIFIER_HOST_ATTR_INDEX == -1)
						IDENTIFIER_HOST_ATTR_INDEX = label.getRuntimeType().getAttributeIndex("identifier");
					if(label.getAttributeValue(IDENTIFIER_HOST_ATTR_INDEX).equals(hostPopulationIdentifier))
						{hostRLabel = label;break;}
				}
				if(hostRLabel == null) {
					System.err.println("Cannot find host label");
					continue;
				}
				
				
				double toE1 = 0.0;
				double toE2 = 0.0;
				double toE3 = 0.0;
				double toE4 = 0.0;

				int hostLabelIndex = runtimeDecorator.getLabelsToUpdate().indexOf(hostRLabel.getId()); // expensive?
				int hostLabelStartPosition = labelVectorPositions[hostLabelIndex];
				double host_s = y[hostLabelStartPosition+variable_position_offsets.get("s")[labelIndex]];
				double host_e1 = y[hostLabelStartPosition+variable_position_offsets.get("E1")[labelIndex]];
				double host_e2 = y[hostLabelStartPosition+variable_position_offsets.get("E2")[labelIndex]];
				double host_e3 = y[hostLabelStartPosition+variable_position_offsets.get("E3")[labelIndex]];
				double host_e4 = y[hostLabelStartPosition+variable_position_offsets.get("E4")[labelIndex]];
				double host_i1 = y[hostLabelStartPosition+variable_position_offsets.get("I1")[labelIndex]];
			 	double host_i2 = y[hostLabelStartPosition+variable_position_offsets.get("I2")[labelIndex]];
				double host_i3 = y[hostLabelStartPosition+variable_position_offsets.get("I3")[labelIndex]];
				double host_i4 = y[hostLabelStartPosition+variable_position_offsets.get("I4")[labelIndex]];
				double host_t1 = y[hostLabelStartPosition+variable_position_offsets.get("T1")[labelIndex]];
				double host_t2 = y[hostLabelStartPosition+variable_position_offsets.get("T2")[labelIndex]];
				double host_t3 = y[hostLabelStartPosition+variable_position_offsets.get("T3")[labelIndex]];
				double host_t4 = y[hostLabelStartPosition+variable_position_offsets.get("T4")[labelIndex]];
				double host_r1 = y[hostLabelStartPosition+variable_position_offsets.get("R1")[labelIndex]];
				double host_r2 = y[hostLabelStartPosition+variable_position_offsets.get("R2")[labelIndex]];
				double host_r3 = y[hostLabelStartPosition+variable_position_offsets.get("R3")[labelIndex]];
				double host_r4 = y[hostLabelStartPosition+variable_position_offsets.get("R4")[labelIndex]];
				double host_e12 = y[hostLabelStartPosition+variable_position_offsets.get("E12")[labelIndex]];
				double host_e13 = y[hostLabelStartPosition+variable_position_offsets.get("E13")[labelIndex]];
				double host_e14 = y[hostLabelStartPosition+variable_position_offsets.get("E14")[labelIndex]];
				double host_e21 = y[hostLabelStartPosition+variable_position_offsets.get("E21")[labelIndex]];
				double host_e23 = y[hostLabelStartPosition+variable_position_offsets.get("E23")[labelIndex]];
				double host_e24 = y[hostLabelStartPosition+variable_position_offsets.get("E24")[labelIndex]];
				double host_e31 = y[hostLabelStartPosition+variable_position_offsets.get("E31")[labelIndex]];
				double host_e32 = y[hostLabelStartPosition+variable_position_offsets.get("E32")[labelIndex]];
				double host_e34 = y[hostLabelStartPosition+variable_position_offsets.get("E34")[labelIndex]];
				double host_e41 = y[hostLabelStartPosition+variable_position_offsets.get("E41")[labelIndex]];
				double host_e42 = y[hostLabelStartPosition+variable_position_offsets.get("E42")[labelIndex]];
				double host_e43 = y[hostLabelStartPosition+variable_position_offsets.get("E43")[labelIndex]];
				double host_i12 = y[hostLabelStartPosition+variable_position_offsets.get("I12")[labelIndex]];
				double host_i13 = y[hostLabelStartPosition+variable_position_offsets.get("I13")[labelIndex]];
				double host_i14 = y[hostLabelStartPosition+variable_position_offsets.get("I14")[labelIndex]];
				double host_i21 = y[hostLabelStartPosition+variable_position_offsets.get("I21")[labelIndex]];
				double host_i23 = y[hostLabelStartPosition+variable_position_offsets.get("I23")[labelIndex]];
				double host_i24 = y[hostLabelStartPosition+variable_position_offsets.get("I24")[labelIndex]];
				double host_i31 = y[hostLabelStartPosition+variable_position_offsets.get("I31")[labelIndex]];
				double host_i32 = y[hostLabelStartPosition+variable_position_offsets.get("I32")[labelIndex]];
				double host_i34 = y[hostLabelStartPosition+variable_position_offsets.get("I34")[labelIndex]];
				double host_i41 = y[hostLabelStartPosition+variable_position_offsets.get("I41")[labelIndex]];
				double host_i42 = y[hostLabelStartPosition+variable_position_offsets.get("I42")[labelIndex]];
				double host_i43 = y[hostLabelStartPosition+variable_position_offsets.get("I43")[labelIndex]];
				double host_r = y[hostLabelStartPosition+variable_position_offsets.get("R")[labelIndex]];
				double hostPopulationCount = host_s+host_e1+host_e2+host_e3+host_e4+host_i1+host_i2+host_i3+host_i4+host_t1+host_t2+host_t3+host_t4+host_r1+host_r2+host_r3+host_r4+host_e12+host_e13+host_e14+host_e21+host_e23+host_e24+host_e31+host_e32+host_e34+host_e41+host_e42+host_e43+host_i12+host_i13+host_i14+host_i21+host_i23+host_i24+host_i31+host_i32+host_i34+host_i41+host_i42+host_i43+host_r;

				if(hostPopulationCount == 0) continue;
				
				
				double [] localInf = {host_i1, host_i2, host_i3, host_i4, host_i12, host_i13, host_i14, host_i21, host_i23, host_i24, host_i31, host_i32, host_i34, host_i41, host_i42, host_i43};
				
				double effectiveI1;
				double effectiveI2;
				double effectiveI3;
				double effectiveI4;
				double effectiveI12;
				double effectiveI13;
				double effectiveI14;
				double effectiveI21;
				double effectiveI23;
				double effectiveI24;
				double effectiveI31;
				double effectiveI32;
				double effectiveI34;
				double effectiveI41;
				double effectiveI42;
				double effectiveI43;

				double [] effectives;
				if (characteristicMixingDistance != 0.0 || roadNetworkInfectiousProportion != 0) {
					effectives = RuntimeUtilities.getEffectiveInfectious(this.runtimeScenario, rLabel, localInf, hostPopulationCount, y, allComps, 
						infComps, characteristicMixingDistance, roadNetworkInfectiousProportion, 
						variable_position_offsets, labelVectorPositions, labelSequenceNumberMap);
					 effectiveI1 = effectives[0];
					 effectiveI2 = effectives[1];
					 effectiveI3 = effectives[2];
					 effectiveI4 = effectives[3];
					 effectiveI12 = effectives[4];
					 effectiveI13 = effectives[5];
					 effectiveI14 = effectives[6];
					 effectiveI21 = effectives[7];
					 effectiveI23 = effectives[8];
					 effectiveI24 = effectives[9];
					 effectiveI31 = effectives[10];
					 effectiveI32 = effectives[11];
					 effectiveI34 = effectives[12];
					 effectiveI41 = effectives[13];
					 effectiveI42 = effectives[14];
					 effectiveI43 = effectives[15];
				}
				else {
					 effectiveI1 = host_i1/hostPopulationCount;
					 effectiveI2 = host_i2/hostPopulationCount;
					 effectiveI3 = host_i3/hostPopulationCount;
					 effectiveI4 = host_i4/hostPopulationCount;
					 effectiveI12 = host_i12/hostPopulationCount;
					 effectiveI13 = host_i13/hostPopulationCount;
					 effectiveI14 = host_i14/hostPopulationCount;
					 effectiveI21 = host_i21/hostPopulationCount;
					 effectiveI23 = host_i23/hostPopulationCount;
					 effectiveI24 = host_i24/hostPopulationCount;
					 effectiveI31 = host_i31/hostPopulationCount;
					 effectiveI32 = host_i32/hostPopulationCount;
					 effectiveI34 = host_i34/hostPopulationCount;
					 effectiveI41 = host_i41/hostPopulationCount;
					 effectiveI42 = host_i42/hostPopulationCount;
					 effectiveI43 = host_i43/hostPopulationCount;
				}

				// include all primary and secondary infectious compartments of host


				toE1 = vectorInfectivity1 * bitingRateSV * effectiveI1
						* s;
				toE1 += vectorInfectivity1 * bitingRateSV
						* (hostADE21 * effectiveI21 + hostADE31 * effectiveI31 + hostADE41 * effectiveI41)
						* s;
				toE2 = vectorInfectivity2 * bitingRateSV * effectiveI2
						* s;
				toE2 += vectorInfectivity2 * bitingRateSV
						* (hostADE12 * effectiveI12 + hostADE32 * effectiveI32 + hostADE42 * effectiveI42)
						* s;
				toE3 = vectorInfectivity3 * bitingRateSV * effectiveI3
						* s;
				toE3 += vectorInfectivity3 * bitingRateSV
						* (hostADE13 * effectiveI13 + hostADE23 * effectiveI23 + hostADE43 * effectiveI43)
						* s;
				toE4 = vectorInfectivity4 * bitingRateSV * effectiveI4
						* s;
				toE4 += vectorInfectivity4 * bitingRateSV
						* (hostADE14 * effectiveI14 + hostADE24 * effectiveI24 + hostADE34 * effectiveI34)
						* s;


				double toI1 = vectorIncubationRate1 * e1;
				double toI2 = vectorIncubationRate2 * e2;
				double toI3 = vectorIncubationRate3 * e3;
				double toI4 = vectorIncubationRate4 * e4;

				double deltaS =(-toE1 - toE2 - toE3 - toE4);
				yDot[index+variable_position_offsets.get("s")[labelIndex]] = deltaS;

				double deltaE1 = (toE1 - toI1);
				yDot[index+variable_position_offsets.get("E1")[labelIndex]] = deltaE1;
				double deltaE2 = (toE2 - toI2);
				yDot[index+variable_position_offsets.get("E2")[labelIndex]] = deltaE2;
				double deltaE3 = (toE3 - toI3);
				yDot[index+variable_position_offsets.get("E3")[labelIndex]] = deltaE3;
				double deltaE4 = (toE4 - toI4);
				yDot[index+variable_position_offsets.get("E3")[labelIndex]] = deltaE4;

				double deltaI1=(toI1);
				yDot[index+variable_position_offsets.get("I1")[labelIndex]] = deltaI1;
				double deltaI2=(toI2);
				yDot[index+variable_position_offsets.get("I2")[labelIndex]] = deltaI2;
				double deltaI3=(toI3);
				yDot[index+variable_position_offsets.get("I3")[labelIndex]] = deltaI3;
				double deltaI4=(toI4);
				yDot[index+variable_position_offsets.get("I4")[labelIndex]] = deltaI4;

				double incidence1=(toE1);
				yDot[index+variable_position_offsets.get("incidence1")[labelIndex]] = incidence1;
				double incidence2=(toE2);
				yDot[index+variable_position_offsets.get("incidence2")[labelIndex]] = incidence2;
				double incidence3=(toE3);
				yDot[index+variable_position_offsets.get("incidence3")[labelIndex]] = incidence3;
				double incidence4=(toE4);
				yDot[index+variable_position_offsets.get("incidence4")[labelIndex]] = incidence4;

				double incidence = (toE1 + toE2 + toE3 + toE4);
				yDot[index+variable_position_offsets.get("incidence")[labelIndex]] = incidence;
				double diseaseDeaths = 0.0;
				yDot[index+variable_position_offsets.get("diseaseDeaths")[labelIndex]] = diseaseDeaths;

			}
		
			int sz = rLabel.getNumDoubleAttributes();
			index += sz;	
			++labelIndex;
		}
	}

	
}
