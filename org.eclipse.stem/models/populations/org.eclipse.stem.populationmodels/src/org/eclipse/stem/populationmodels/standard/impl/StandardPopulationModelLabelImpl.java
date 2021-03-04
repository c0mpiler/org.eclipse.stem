package org.eclipse.stem.populationmodels.standard.impl;

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
import org.eclipse.stem.populationmodels.standard.DemographicPopulationModel;
import org.eclipse.stem.populationmodels.standard.PopulationGroup;
import org.eclipse.stem.populationmodels.standard.PopulationModel;
import org.eclipse.stem.populationmodels.standard.StandardFactory;
import org.eclipse.stem.populationmodels.standard.StandardPackage;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabel;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabelValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Population Model Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StandardPopulationModelLabelImpl extends PopulationModelLabelImpl implements StandardPopulationModelLabel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected StandardPopulationModelLabelImpl() {
		super();
		setCurrentValue(StandardFactory.eINSTANCE.createStandardPopulationModelLabelValue());
		setNextValue(StandardFactory.eINSTANCE.createStandardPopulationModelLabelValue());
		setTempValue(StandardFactory.eINSTANCE.createStandardPopulationModelLabelValue());
		setProbeValue(StandardFactory.eINSTANCE.createStandardPopulationModelLabelValue());
		setErrorScale(StandardFactory.eINSTANCE.createStandardPopulationModelLabelValue());
		setDeltaValue(StandardFactory.eINSTANCE.createStandardPopulationModelLabelValue());
	}
	
	/**
	 * Return the identifier for the label, i.e. the population identifier
	 * 
	 * @return String The identifier
	 */
	
	public String getIdentifier() {
		return this.getPopulationIdentifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.STANDARD_POPULATION_MODEL_LABEL;
	}

	/**
	 * Reset the dynamic label. This sets the {@link LabelValue}s back to their
	 * initial states.
	 * 
	 * @model volatile="true" transient="true" changeable="false"
	 */
	@Override
	public void reset() {
		super.reset();
		((StandardPopulationModelLabelValue)this.getCurrentValue()).reset();
		((StandardPopulationModelLabelValue)this.getNextValue()).reset();
		this.getDeltaValue().reset();
		this.getTempValue().reset();
		this.getProbeValue().reset();
		this.getErrorScale().reset();
		
		// Get the fraction of the population group if DemographicPopulationModel is used
		double fraction = 1.0;
		double initialRescaling = ((PopulationModel)getDecorator()).getInitialRescalingFactor();
		if (getDecorator() instanceof DemographicPopulationModel) {
			DemographicPopulationModel model = (DemographicPopulationModel) getDecorator();
			
			for (PopulationGroup group : model.getPopulationGroups()) {
				if (group.getIdentifier() == getPopulationIdentifier()) {
					fraction = group.getFraction();
				}
			}
		}
		
		double originalCount = this.getPopulationLabel().getCurrentPopulationValue().getCount() * fraction * initialRescaling;
		((StandardPopulationModelLabelValue)this.getCurrentValue()).setCount(originalCount);
		
		// Set the next value too. This is to avoid switching between zero values and non-zero values
		// when the graph updates to the next value for nodes that are not being updated by this instance
		((IntegrationLabelValue)getNextValue()).set((IntegrationLabelValue)getCurrentValue());
		
	}
	
	/**
	 * Reset to the correct population value for the
	 * passed in time
	 * 
	 * @param time Reference time
	 */
	/*public void reset(STEMTime time) {
		// Only rewind population if it's a standard population model
		if(this.getDecorator() instanceof StandardPopulationModel) {
			StandardPopulationModel spm = (StandardPopulationModel)this.getDecorator();
			PopulationLabel plabel = this.getPopulationLabel();
			int year = plabel.getValidYear();
			Calendar c = Calendar.getInstance();
			c.setTime(time.getTime());
			int startYear = c.get(Calendar.YEAR);
			double growth = spm.getBirthRate() - spm.getDeathRate();
			double dailyGrowth = (spm.getTimePeriod() / 86400000.0)*growth;
			double diff = ((double)startYear - (double)year)*365.25; // approx
			double currentPopulation = ((StandardPopulationModelLabelValue)this.getCurrentValue()).getCount();
			dailyGrowth = 1.0 + dailyGrowth;
			double newPopulation = currentPopulation * Math.pow(dailyGrowth, diff);
			((StandardPopulationModelLabelValue)this.getCurrentValue()).setCount(newPopulation);	
			// Store the additions/substractions in the delta value so that disease models can
			// adjust their counts
			double popdiff = newPopulation - currentPopulation;
			if(popdiff > 0.0) {
				Exchange exchange = GraphFactory.eINSTANCE.createExchange();
				
				exchange.setType(ExchangeType.BIRTHS_AND_DEATHS);
				exchange.setCount(popdiff);
				((IntegrationLabelValue)this.getDeltaValue()).getArrivals().add(exchange);
				((StandardPopulationModelLabelValue)this.getDeltaValue()).setBirths(popdiff);
			}
			else {
				Exchange exchange = GraphFactory.eINSTANCE.createExchange();
				
				exchange.setType(ExchangeType.BIRTHS_AND_DEATHS);
				exchange.setCount(-popdiff);
				((IntegrationLabelValue)this.getDeltaValue()).getDepartures().add(exchange);
				((StandardPopulationModelLabelValue)this.getDeltaValue()).setDeaths(-popdiff);
			}

		}
	}
*/
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(
				getPopulationIdentifier() == null ? "null" : getPopulationIdentifier());
		result.append(" [");
		result.append(Math.floor(((StandardPopulationModelLabelValue)getCurrentValue()).getCount()));
		result.append("]");
		return result.toString();
	}
} //StandardPopulationModelLabelImpl
