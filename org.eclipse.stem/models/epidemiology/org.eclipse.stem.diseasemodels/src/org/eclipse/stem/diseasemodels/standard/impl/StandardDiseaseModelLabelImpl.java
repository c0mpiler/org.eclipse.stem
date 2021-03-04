package org.eclipse.stem.diseasemodels.standard.impl;

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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.core.graph.IntegrationLabelValue;
import org.eclipse.stem.definitions.labels.PopulationLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.populationmodels.standard.DemographicPopulationModel;
import org.eclipse.stem.populationmodels.standard.PopulationGroup;
import org.eclipse.stem.populationmodels.standard.PopulationModel;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Disease Model Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class StandardDiseaseModelLabelImpl extends
		DiseaseModelLabelImpl implements StandardDiseaseModelLabel {
	
	/**
	 * This is the top-level segment for all type URI's for standard disease
	 * model labels.
	 */
	String URI_TYPE_STANDARD_DISEASE_MODEL_LABEL_SEGMENT = URI_TYPE_DISEASE_MODEL_LABEL_SEGMENT
			+ "/standard";
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public StandardDiseaseModelLabelImpl() {
		super();
	}

	/**
	 * @see org.eclipse.stem.core.graph.impl.DynamicLabelImpl#reset()
	 */
	@Override
	public void reset() {
		// The call to super.reset will reset the label value of this label
		// which will zero out all of the disease state values.
		super.reset();
		getTempValue().reset();
		getDeltaValue().reset();
		getErrorScale().reset();
		getProbeValue().reset();
		// Is there a population instance associated with this instance?
		if (getPopulationModelLabel() != null) {
			// Yes
			// Ok, set the susceptible population to the count of the number of
			// population members
			final StandardDiseaseModelLabelValue sValue = (StandardDiseaseModelLabelValue)getCurrentValue();
			
			// Get the fraction of the population group if DemographicPopulationModel is used
			double fraction = 1.0;
			double initialRescaling = ((PopulationModel)getPopulationModelLabel().getDecorator()).getInitialRescalingFactor();
			if (getPopulationModelLabel().getDecorator() instanceof DemographicPopulationModel) {
				DemographicPopulationModel model = (DemographicPopulationModel) getPopulationModelLabel().getDecorator();
				
				for (PopulationGroup group : model.getPopulationGroups()) {
					if (group.getIdentifier() == getPopulationModelLabel().getPopulationIdentifier()) {
						fraction = group.getFraction();
					}
				}
			}
			
			// Use the population label (not population model label).
			sValue.setS(((PopulationLabelValue)getPopulationModelLabel().getPopulationLabel().getCurrentValue()).getCount() * fraction * initialRescaling);
			
			// Set the next value too. This is to avoid switching between zero values and non-zero values
			// when the graph updates to the next value for nodes that are not being updated by this instance
			
			((IntegrationLabelValue)getNextValue()).set((IntegrationLabelValue)getCurrentValue());
		} // if

	} // reset

	/**
	 * Return the identifier for the label, i.e. the population identifier
	 * 
	 * @return String The identifier
	 */
	
	public String getIdentifier() {
		return this.getPopulationModelLabel().getPopulationIdentifier();
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.STANDARD_DISEASE_MODEL_LABEL;
	}

	/*public void reset(STEMTime time) {
		// Adjust current value by adding/substracting deltas by other models (population models).
		// We do this to set the right counts to match the population numbers at the beginning
		// of the simulation.
		
		for(Label l:this.getNode().getLabels()) {
			if(l instanceof IntegrationLabel) {
				if(!((IntegrationLabel)l).getIdentifier().equals(this.getPopulationModelLabel().getPopulationIdentifier()))
					continue;
				IntegrationLabel il = (IntegrationLabel)l;
				if(l == this) continue;
				IntegrationLabelValue delta = (IntegrationLabelValue)il.getDeltaValue();
				
				EList<Exchange> arrivals = delta.getArrivals();
				EList<Exchange> departures = delta.getDepartures();
				
				// We scale the label values back since at this point the innoculators/infectors
				// have already been applied and we need to modify all states of the disease
				
				double popCount = ((StandardDiseaseModelLabelValue)this.getCurrentValue()).getPopulationCount();
				if(arrivals != null && arrivals.size() == 1) {
					assert(arrivals.get(0).getType() == ExchangeType.BIRTHS_AND_DEATHS);
					double factor = arrivals.get(0).getCount() / popCount;
					if(Double.isNaN(factor) || Double.isInfinite(factor)) factor = 0.0;// do nothing
					IntegrationLabelValue addV = (IntegrationLabelValue)EcoreUtil.copy(this.getCurrentValue());
					addV.scale(factor);
					((IntegrationLabelValue)this.getCurrentValue()).add((IntegrationLabelValue)addV);
				}
				if(departures != null && departures.size() == 1) {
					assert(departures.get(0).getType() == ExchangeType.BIRTHS_AND_DEATHS);
					double factor = departures.get(0).getCount() / popCount;
					if(Double.isNaN(factor) || Double.isInfinite(factor)) factor = 0.0;// do nothing
					IntegrationLabelValue subV = (IntegrationLabelValue)EcoreUtil.copy(this.getCurrentValue());
					subV.scale(factor);
					((IntegrationLabelValue)this.getCurrentValue()).sub((IntegrationLabelValue)subV);
				}
				
					
			}
		}
	}
	*/
	
} // StandardDiseaseModelLabelImpl
