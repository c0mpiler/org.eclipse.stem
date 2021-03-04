package org.eclipse.stem.diseasemodels.vector.impl;

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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.graph.IntegrationLabelValue;
import org.eclipse.stem.core.math.BinomialDistributionUtil;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.diseasemodels.vector.AbstractDengueModel;
import org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue;
import org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue;
import org.eclipse.stem.diseasemodels.vector.DengueUtil;
import org.eclipse.stem.diseasemodels.vector.VectorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Dengue Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class AbstractDengueModelImpl extends VectorDiseaseModelImpl implements AbstractDengueModel {
	
	protected DengueUtil dengueUtil = new DengueUtil();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractDengueModelImpl() {
		super();
	}

	
	/**
	 * Add stochastic noise if the flag is set. Noise is added to all incidences in the dengue model. The next value has already been set to its deterministic solution when this method is called,
	 * and this method changes it to add the noise.
	 * This method calls BinomialDistributionUtil.fastPickFromBinomialDist which uses org.apache.commons.math.distribution.BinomialDistributionImpl;
	 * 
	 * This method is used for the SimpleDengueModel and VerySimpleDengueModel only. The full model (DengueModelImpl) needs special handling to support the cross immunity effect.
	 * @generated NOT
	 */
	@Override
	public void doStochasticProcess(IntegrationLabel iLabel, long timeDelta) {
		//Turn next value into integers
		IntegrationLabelValue nextVal = (IntegrationLabelValue)iLabel.getNextValue();
		EList<EAttribute> attrs = nextVal.eClass().getEAllAttributes();

		for(int i=0;i<attrs.size();++i) {
			EAttribute attr = attrs.get(i);
			if(attr.getEType().getClassifierID() == EcorePackage.EDOUBLE && attr.isChangeable()) {
				nextVal.eSetDouble(attr.getFeatureID(), Math.round(nextVal.eGetDouble(attr.getFeatureID())));
			}
		}

		if(this.getBinomialDistribution() == null)
			this.setBinomialDistribution(new BinomialDistributionUtil(this.getRandomSeed()));

		// Add stochastic noise to incidences and adjust the next value	
		if(iLabel.getNextValue() instanceof DengueModelHostLabelValue) {
			DengueModelHostLabelValue nextDHLV = (DengueModelHostLabelValue)iLabel.getNextValue(); // NOW 
			DengueModelHostLabelValue previousDHLV = (DengueModelHostLabelValue)iLabel.getCurrentValue(); // before the last integration step

			// S -> E1
			addNoise(previousDHLV, nextDHLV, StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence1(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E1(), 1.0);
			// S -> E2
			addNoise(previousDHLV, nextDHLV, StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence2(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E2(), 1.0);
			// S -> E3
			addNoise(previousDHLV, nextDHLV, StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence3(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E3(), 1.0);
			// S -> E3
			addNoise(previousDHLV, nextDHLV, StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence4(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E4(), 1.0);
			
			// The second infection incidences comes from two places, T and R. We determine which fraction of the total incidence reported comes from each compartment by looking at the disease parameters epsilon (cross immunity) and
			// the total counts in those compartments at the previous time step
			
			// R1
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R1(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence12(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E12(), 1.0);
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R1(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence13(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E13(), 1.0);
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R1(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence14(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E14(), 1.0);
			
			// R2
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R2(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence21(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E21(), 1.0);
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R2(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence23(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E23(), 1.0);
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R2(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence24(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E24(), 1.0);
			
			// R3
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R3(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence31(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E31(), 1.0);
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R3(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence32(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E32(), 1.0);
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R3(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence34(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E34(), 1.0);

			// R4
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R4(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence41(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E41(), 1.0);
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R4(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence42(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E42(), 1.0);
			addNoise(previousDHLV, nextDHLV, VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_R4(), VectorPackage.eINSTANCE.getSimpleDengueModelHostLabelValue_Incidence43(), VectorPackage.eINSTANCE.getDengueModelHostLabelValue_E43(), 1.0);
									
			// Correct the total incidence reported 
			nextDHLV.setIncidence(nextDHLV.getIncidence1()+nextDHLV.getIncidence2()+nextDHLV.getIncidence3()+nextDHLV.getIncidence4()+
			nextDHLV.getIncidence12()+nextDHLV.getIncidence13()+nextDHLV.getIncidence14()+
			nextDHLV.getIncidence21()+nextDHLV.getIncidence23()+nextDHLV.getIncidence24()+
			nextDHLV.getIncidence31()+nextDHLV.getIncidence32()+nextDHLV.getIncidence34()+
			nextDHLV.getIncidence41()+nextDHLV.getIncidence42()+nextDHLV.getIncidence43());
			
		} else if(iLabel.getNextValue() instanceof DengueModelVectorLabelValue) {
			DengueModelVectorLabelValue nextDVLV = (DengueModelVectorLabelValue)iLabel.getNextValue(); // NOW 
			DengueModelVectorLabelValue previousDVLV = (DengueModelVectorLabelValue)iLabel.getCurrentValue(); // before the last integration step

			// S -> E1
			addNoise(previousDVLV, nextDVLV, StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S(), VectorPackage.eINSTANCE.getDengueModelVectorLabelValue_Incidence1(), VectorPackage.eINSTANCE.getDengueModelVectorLabelValue_E1(), 1.0);
			// S -> E2
			addNoise(previousDVLV, nextDVLV, StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S(), VectorPackage.eINSTANCE.getDengueModelVectorLabelValue_Incidence2(), VectorPackage.eINSTANCE.getDengueModelVectorLabelValue_E2(), 1.0);
			// S -> E3
			addNoise(previousDVLV, nextDVLV, StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S(), VectorPackage.eINSTANCE.getDengueModelVectorLabelValue_Incidence3(), VectorPackage.eINSTANCE.getDengueModelVectorLabelValue_E3(), 1.0);
			// S -> E4
			addNoise(previousDVLV, nextDVLV, StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S(), VectorPackage.eINSTANCE.getDengueModelVectorLabelValue_Incidence4(), VectorPackage.eINSTANCE.getDengueModelVectorLabelValue_E4(), 1.0);
				
			// Correct total incidence
			nextDVLV.setIncidence(nextDVLV.getIncidence1()+nextDVLV.getIncidence2()+nextDVLV.getIncidence3()+nextDVLV.getIncidence4());
		} //else 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VectorPackage.Literals.ABSTRACT_DENGUE_MODEL;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void applyExternalDeltas(STEMTime currentTime, double continuousTime, long timeDelta, EList<DynamicLabel> labels) {
		// TODO Auto-generated stub. Implement applyExternalDeltas(...) for AbstractDengueModelImpl.
		super.applyExternalDeltas(currentTime, continuousTime, timeDelta, labels);
	} // applyExternalDeltas

} //AbstractDengueModelImpl
