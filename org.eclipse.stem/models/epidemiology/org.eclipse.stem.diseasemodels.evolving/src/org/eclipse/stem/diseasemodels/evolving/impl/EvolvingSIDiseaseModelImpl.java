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
package org.eclipse.stem.diseasemodels.evolving.impl;

import java.util.Arrays;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.Exchange;
import org.eclipse.stem.core.graph.ExchangePool;
import org.eclipse.stem.core.graph.ExchangeType;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.model.Model;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseModel;
import org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseTransformer;
import org.eclipse.stem.diseasemodels.evolving.EvolvingFactory;
import org.eclipse.stem.diseasemodels.evolving.EvolvingPackage;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSIDiseaseModel;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSIDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSIDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.SILabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.diseasemodels.standard.impl.SIImpl;
import org.eclipse.stem.diseasemodels.standard.impl.SILabelValueImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SI Disease Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIDiseaseModelImpl#getParentDisease <em>Parent Disease</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIDiseaseModelImpl#getTransformer <em>Transformer</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIDiseaseModelImpl#getEvolvedAt <em>Evolved At</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIDiseaseModelImpl#getGenome <em>Genome</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIDiseaseModelImpl#getEvolutionCount <em>Evolution Count</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIDiseaseModelImpl#getCaseMutationRate <em>Case Mutation Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIDiseaseModelImpl#getGenomeLength <em>Genome Length</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.evolving.impl.EvolvingSIDiseaseModelImpl#getGeneticDistNonlinExponent <em>Genetic Dist Nonlin Exponent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvolvingSIDiseaseModelImpl extends SIImpl implements EvolvingSIDiseaseModel {
	/**
	 * The cached value of the '{@link #getParentDisease() <em>Parent Disease</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentDisease()
	 * @generated
	 * @ordered
	 */
	protected EvolvingDiseaseModel parentDisease;
	/**
	 * The cached value of the '{@link #getTransformer() <em>Transformer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformer()
	 * @generated
	 * @ordered
	 */
	protected EvolvingDiseaseTransformer transformer;
	/**
	 * The cached value of the '{@link #getEvolvedAt() <em>Evolved At</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvolvedAt()
	 * @generated
	 * @ordered
	 */
	protected DiseaseModelLabel evolvedAt;
	/**
	 * The default value of the '{@link #getGenome() <em>Genome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenome()
	 * @generated
	 * @ordered
	 */
	protected static final boolean[] GENOME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGenome() <em>Genome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenome()
	 * @generated
	 * @ordered
	 */
	protected boolean[] genome = GENOME_EDEFAULT;
	/**
	 * The default value of the '{@link #getEvolutionCount() <em>Evolution Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvolutionCount()
	 * @generated
	 * @ordered
	 */
	protected static final int EVOLUTION_COUNT_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getEvolutionCount() <em>Evolution Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvolutionCount()
	 * @generated
	 * @ordered
	 */
	protected int evolutionCount = EVOLUTION_COUNT_EDEFAULT;
	/**
	 * The default value of the '{@link #getCaseMutationRate() <em>Case Mutation Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseMutationRate()
	 * @generated
	 * @ordered
	 */
	protected static final double CASE_MUTATION_RATE_EDEFAULT = 1.0E-5;
	/**
	 * The cached value of the '{@link #getCaseMutationRate() <em>Case Mutation Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseMutationRate()
	 * @generated
	 * @ordered
	 */
	protected double caseMutationRate = CASE_MUTATION_RATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getGenomeLength() <em>Genome Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenomeLength()
	 * @generated
	 * @ordered
	 */
	protected static final int GENOME_LENGTH_EDEFAULT = 5;
	/**
	 * The cached value of the '{@link #getGenomeLength() <em>Genome Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenomeLength()
	 * @generated
	 * @ordered
	 */
	protected int genomeLength = GENOME_LENGTH_EDEFAULT;
	/**
	 * The default value of the '{@link #getGeneticDistNonlinExponent() <em>Genetic Dist Nonlin Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneticDistNonlinExponent()
	 * @generated
	 * @ordered
	 */
	protected static final double GENETIC_DIST_NONLIN_EXPONENT_EDEFAULT = 1.0;
	/**
	 * The cached value of the '{@link #getGeneticDistNonlinExponent() <em>Genetic Dist Nonlin Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneticDistNonlinExponent()
	 * @generated
	 * @ordered
	 */
	protected double geneticDistNonlinExponent = GENETIC_DIST_NONLIN_EXPONENT_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EvolvingSIDiseaseModelImpl() {
		super();
		setTransformer(new EvolvingDiseaseTransformerImpl());
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvolvingPackage.Literals.EVOLVING_SI_DISEASE_MODEL;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolvingDiseaseModel getParentDisease() {
		if (parentDisease != null && parentDisease.eIsProxy()) {
			InternalEObject oldParentDisease = (InternalEObject)parentDisease;
			parentDisease = (EvolvingDiseaseModel)eResolveProxy(oldParentDisease);
			if (parentDisease != oldParentDisease) {
			}
		}
		return parentDisease;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolvingDiseaseModel basicGetParentDisease() {
		return parentDisease;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentDisease(EvolvingDiseaseModel newParentDisease) {
		parentDisease = newParentDisease;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolvingDiseaseTransformer getTransformer() {
		if (transformer != null && transformer.eIsProxy()) {
			InternalEObject oldTransformer = (InternalEObject)transformer;
			transformer = (EvolvingDiseaseTransformer)eResolveProxy(oldTransformer);
			if (transformer != oldTransformer) {
			}
		}
		return transformer;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolvingDiseaseTransformer basicGetTransformer() {
		return transformer;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformer(EvolvingDiseaseTransformer newTransformer) {
		transformer = newTransformer;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiseaseModelLabel getEvolvedAt() {
		if (evolvedAt != null && evolvedAt.eIsProxy()) {
			InternalEObject oldEvolvedAt = (InternalEObject)evolvedAt;
			evolvedAt = (DiseaseModelLabel)eResolveProxy(oldEvolvedAt);
			if (evolvedAt != oldEvolvedAt) {
			}
		}
		return evolvedAt;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiseaseModelLabel basicGetEvolvedAt() {
		return evolvedAt;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvolvedAt(DiseaseModelLabel newEvolvedAt) {
		evolvedAt = newEvolvedAt;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEvolutionCount() {
		return evolutionCount;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvolutionCount(int newEvolutionCount) {
		evolutionCount = newEvolutionCount;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCaseMutationRate() {
		return caseMutationRate;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaseMutationRate(double newCaseMutationRate) {
		caseMutationRate = newCaseMutationRate;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGenomeLength() {
		return genomeLength;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenomeLength(int newGenomeLength) {
		genomeLength = newGenomeLength;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getGeneticDistNonlinExponent() {
		return geneticDistNonlinExponent;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneticDistNonlinExponent(double newGeneticDistNonlinExponent) {
		geneticDistNonlinExponent = newGeneticDistNonlinExponent;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean[] getGenome() {
		if (genome == null) {
			genome = new boolean[genomeLength];
			for(int i = 0; i < genome.length; i ++) {
				genome[i] = true;
			}
		}
		return genome;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenome(boolean[] newGenome) {
		genome = newGenome;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__PARENT_DISEASE:
				if (resolve) return getParentDisease();
				return basicGetParentDisease();
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__TRANSFORMER:
				if (resolve) return getTransformer();
				return basicGetTransformer();
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__EVOLVED_AT:
				if (resolve) return getEvolvedAt();
				return basicGetEvolvedAt();
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__GENOME:
				return getGenome();
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__EVOLUTION_COUNT:
				return getEvolutionCount();
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__CASE_MUTATION_RATE:
				return getCaseMutationRate();
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__GENOME_LENGTH:
				return getGenomeLength();
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__GENETIC_DIST_NONLIN_EXPONENT:
				return getGeneticDistNonlinExponent();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__PARENT_DISEASE:
				setParentDisease((EvolvingDiseaseModel)newValue);
				return;
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__TRANSFORMER:
				setTransformer((EvolvingDiseaseTransformer)newValue);
				return;
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__EVOLVED_AT:
				setEvolvedAt((DiseaseModelLabel)newValue);
				return;
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__GENOME:
				setGenome((boolean[])newValue);
				return;
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__EVOLUTION_COUNT:
				setEvolutionCount((Integer)newValue);
				return;
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__CASE_MUTATION_RATE:
				setCaseMutationRate((Double)newValue);
				return;
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__GENOME_LENGTH:
				setGenomeLength((Integer)newValue);
				return;
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__GENETIC_DIST_NONLIN_EXPONENT:
				setGeneticDistNonlinExponent((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__PARENT_DISEASE:
				setParentDisease((EvolvingDiseaseModel)null);
				return;
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__TRANSFORMER:
				setTransformer((EvolvingDiseaseTransformer)null);
				return;
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__EVOLVED_AT:
				setEvolvedAt((DiseaseModelLabel)null);
				return;
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__GENOME:
				setGenome(GENOME_EDEFAULT);
				return;
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__EVOLUTION_COUNT:
				setEvolutionCount(EVOLUTION_COUNT_EDEFAULT);
				return;
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__CASE_MUTATION_RATE:
				setCaseMutationRate(CASE_MUTATION_RATE_EDEFAULT);
				return;
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__GENOME_LENGTH:
				setGenomeLength(GENOME_LENGTH_EDEFAULT);
				return;
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__GENETIC_DIST_NONLIN_EXPONENT:
				setGeneticDistNonlinExponent(GENETIC_DIST_NONLIN_EXPONENT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__PARENT_DISEASE:
				return parentDisease != null;
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__TRANSFORMER:
				return transformer != null;
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__EVOLVED_AT:
				return evolvedAt != null;
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__GENOME:
				return GENOME_EDEFAULT == null ? genome != null : !GENOME_EDEFAULT.equals(genome);
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__EVOLUTION_COUNT:
				return evolutionCount != EVOLUTION_COUNT_EDEFAULT;
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__CASE_MUTATION_RATE:
				return caseMutationRate != CASE_MUTATION_RATE_EDEFAULT;
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__GENOME_LENGTH:
				return genomeLength != GENOME_LENGTH_EDEFAULT;
			case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__GENETIC_DIST_NONLIN_EXPONENT:
				return geneticDistNonlinExponent != GENETIC_DIST_NONLIN_EXPONENT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EvolvingDiseaseModel.class) {
			switch (derivedFeatureID) {
				case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__PARENT_DISEASE: return EvolvingPackage.EVOLVING_DISEASE_MODEL__PARENT_DISEASE;
				case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__TRANSFORMER: return EvolvingPackage.EVOLVING_DISEASE_MODEL__TRANSFORMER;
				case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__EVOLVED_AT: return EvolvingPackage.EVOLVING_DISEASE_MODEL__EVOLVED_AT;
				case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__GENOME: return EvolvingPackage.EVOLVING_DISEASE_MODEL__GENOME;
				case EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__EVOLUTION_COUNT: return EvolvingPackage.EVOLVING_DISEASE_MODEL__EVOLUTION_COUNT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EvolvingDiseaseModel.class) {
			switch (baseFeatureID) {
				case EvolvingPackage.EVOLVING_DISEASE_MODEL__PARENT_DISEASE: return EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__PARENT_DISEASE;
				case EvolvingPackage.EVOLVING_DISEASE_MODEL__TRANSFORMER: return EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__TRANSFORMER;
				case EvolvingPackage.EVOLVING_DISEASE_MODEL__EVOLVED_AT: return EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__EVOLVED_AT;
				case EvolvingPackage.EVOLVING_DISEASE_MODEL__GENOME: return EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__GENOME;
				case EvolvingPackage.EVOLVING_DISEASE_MODEL__EVOLUTION_COUNT: return EvolvingPackage.EVOLVING_SI_DISEASE_MODEL__EVOLUTION_COUNT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (genome: ");
		result.append(genome);
		result.append(", evolutionCount: ");
		result.append(evolutionCount);
		result.append(", caseMutationRate: ");
		result.append(caseMutationRate);
		result.append(", genomeLength: ");
		result.append(genomeLength);
		result.append(", geneticDistNonlinExponent: ");
		result.append(geneticDistNonlinExponent);
		result.append(')');
		return result.toString();
	}


	/**
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelImpl#computeTransitions(org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue,
	 *      long, double, long)
	 * @generated NOT
	 */
	@Override
	public void calculateDeltas(STEMTime time, double t, long timeDelta, EList<DynamicLabel> labels)  {
		
		
		final double adjustedInfectiousMortalityRate = getAdjustedInfectiousMortalityRate(timeDelta);
		double transmissionRate = getAdjustedTransmissionRate(timeDelta);
		final double adjustedRecoveryRate =  getAdjustedRecoveryRate(timeDelta);
		
		for(int _i=0;_i<labels.size();++_i) {
			final DynamicLabel label =  labels.get(_i);
			IntegrationLabel ilabel = (IntegrationLabel)label;

			StandardDiseaseModelLabel diseaseLabel = (StandardDiseaseModelLabel)ilabel;
			StandardDiseaseModelLabelValue currentState = (StandardDiseaseModelLabelValue)ilabel.getProbeValue();
			StandardDiseaseModelLabelValue deltaValue = (StandardDiseaseModelLabelValue)ilabel.getDeltaValue();

			deltaValue.reset();
			
			final SILabelValue currentSI = (SILabelValue) currentState;

			// Compute deaths
			
			final double diseaseDeaths = adjustedInfectiousMortalityRate
					* currentSI.getI();

			// This is beta*
			

			if(!this.isFrequencyDependent()) transmissionRate *= getTransmissionRateScaleFactor(diseaseLabel);

			// The effective Infectious population  is a dimensionles number normalize by total
			// population used in teh computation of bets*S*i where i = Ieffective/Pop.
			// This includes a correction to the current
			// infectious population (Ieffective) based on the conserved exchange of people (circulation)
			// between regions. Note that this is no the "arrivals" and "departures" which are
			// a different process.
			final double effectiveInfectious = getNormalizedEffectiveInfectious(diseaseLabel.getNode(), diseaseLabel, currentSI.getI(), StandardPackage.Literals.SI_LABEL_VALUE__I, StandardPackage.Literals.STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE, StandardPackage.Literals.STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION);

			/*
			 * Compute state transitions
			 * 
			 * Regarding computing the number of transitions from Susceptible to Exposed:
			 * In a linear model the "effective" number of infectious people is just
			 * the number of infectious people In a nonlinear model we have a
			 * nonLinearity exponent that is > 1 this models the effect of immune
			 * system saturation when Susceptible people are exposed to large
			 * numbers of infectious people. then the "effective" number of
			 * infectious people is I^nonLinearity exponent to allow for either
			 * linear or nonlinear models we always calculate I^nonLinearity
			 * exponent and allow nonLinearity exponent >= 1.0
			 */

			// Need to checked what do do here. If non linear coefficient is not 1 and
			// the effective infectious is negative (which is possible), what do do? 
			// Let's fall back on the linear method for now.
			double numberOfSusceptibleToInfected = 0.0;
			
			
			
			
			
			if(getNonLinearityCoefficient() != 1.0 && effectiveInfectious >= 0.0)
				numberOfSusceptibleToInfected = transmissionRate
				* currentSI.getS()* Math.pow(effectiveInfectious, getNonLinearityCoefficient());
			else
				numberOfSusceptibleToInfected = transmissionRate
				* currentSI.getS()* effectiveInfectious;

			double numberOfInfectedToSusceptible = adjustedRecoveryRate
					* currentSI.getI();


			// Determine delta S
			final double deltaS = - numberOfSusceptibleToInfected + numberOfInfectedToSusceptible;
			// Determine delta I
			final double deltaI = numberOfSusceptibleToInfected - numberOfInfectedToSusceptible - diseaseDeaths;	

			SILabelValueImpl ret = (SILabelValueImpl)deltaValue;
			
			// Store transitions (for stochastic models)
			
			/////////////////////////////////////////////////////////////////////////////
			// added to express the transitions. Necessary to support stochastic modeling
			// S->I
			Exchange siExchange = (Exchange)ExchangePool.POOL.get(); 
			siExchange.setSource(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
			siExchange.setTarget(StandardPackage.eINSTANCE.getSILabelValue_I());
			siExchange.setCount(numberOfSusceptibleToInfected);
			siExchange.getForIncidence().add(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_Incidence());
			siExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			ret.getDepartures().add(siExchange);
			
			// I->S
			Exchange isExchange = (Exchange)ExchangePool.POOL.get(); 
			isExchange.setSource(StandardPackage.eINSTANCE.getSILabelValue_I());
			isExchange.setTarget(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
			isExchange.setCount(numberOfInfectedToSusceptible);
			isExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			ret.getDepartures().add(isExchange);
			// added to express the transitions. Necessary to support stochastic modeling
			/////////////////////////////////////////////////////////////////////////////
			
			ret.setS(deltaS);
			ret.setI(deltaI);
			ret.setIncidence(numberOfSusceptibleToInfected);
			ret.setDiseaseDeaths(diseaseDeaths);

			computeAdditionalDeltasAndExchanges(ilabel, time, t, timeDelta);
		}
	} // 

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EvolvingDiseaseModel evolve(DiseaseModelLabel label) {
		
		
		// test
		SILabelValue siValues = (SILabelValue)label.getCurrentValue();
		double incidence = siValues.getIncidence();
		 
		if(incidence > 1) {
			
			double pic = Math.random();
			double threshold = (incidence*caseMutationRate);
			 
			if(pic < threshold) {
				
				final boolean[] newGenome = mutateGenome(getGenome());
				
				// check that the genome does not already exist!!
				// if we have mutated back to an existing genome we just
				// return null (because that disease is already defined everywhere
				String evolutionKey = String.valueOf(Arrays.hashCode(newGenome));
				
				for (DiseaseModel dm : getTransformer().getEvolvedDiseases()) {
					
					// If the disease model's URI query string contains the evolved genome's hash key,
					// then the disease already exists in the simulation
					
					// platform://resource/MyProject/decorators/MyEvolvingDiseaseModel.standard?genomehash
					
					if (evolutionKey.equals(dm.getURI().query())) {
						return null;
					}
				}
				
				int evolutions = getEvolutionCount();
				setEvolutionCount(++evolutions);
				
				String genomeSTR = getGenomeSTR(newGenome);
				String phyloDieaseName = getPhyloDiseaseName(getDiseaseName());
				String uniqueIdentifier = phyloDieaseName + ":"+ evolutions+"_["+genomeSTR+"]";
				
				
				EvolvingSIDiseaseModel dm = EcoreUtil.copy(this);
				dm.setGenome(newGenome);
				getTransformer().getEvolvedDiseases().add(dm);
				dm.setGraphDecorated(false);
				dm.setDiseaseName(uniqueIdentifier);
				dm.setTransformer(getTransformer());
				dm.setParentDisease(this);
				dm.setURI(getURI().appendQuery(evolutionKey));
				dm.setEvolvedAt(label);
				
//				totalEvolved++;
//				System.out.println(" ********** Evolutions = "+totalEvolved );
				
				return dm;
			}
		}
		
		return null;
	}// evolve
	
	/**
	 * mutate a parent genome
	 * @param parentGenome
	 * @return
	 */
	public boolean[] mutateGenome(boolean[] parentGenome) {
		// Update the genome
		genomeLength = parentGenome.length;
		boolean[] genome = new boolean[genomeLength];
		
		double dMute = Math.random()*genome.length;
		int iMute = (int)Math.round(dMute);
		        
		for(int i = 0; i < genome.length; i ++) {
			genome[i] = parentGenome[i];
			if(i==iMute) genome[i] = (!parentGenome[i]);
		}
		return genome;
	}
	/**
	 * 
	 * @param genome
	 * @return
	 */
	public static String getGenomeSTR(boolean[] genome) {
		String retval = "";
		for(int i = 0; i < genome.length; i ++) {
			if(genome[i]) {
				retval += "1";
			} else {
				retval += "0";
			}
		}
		return retval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void calculateEvolvedInitialState() {
		

		EvolvingSIDiseaseModelImpl parentDiseaseModel = (EvolvingSIDiseaseModelImpl)getParentDisease();
		DiseaseModelLabel parentEvolutionSource = getEvolvedAt();
		if (parentDiseaseModel == null && parentEvolutionSource == null) {
			// The evolution wasn't initialized correctly.  
			// This should be unreachable but who knows.
			System.err.println("Trying to calculate label state from an improperly initialized evolved model.  Do something.");
			return;	
		} 
		
		Node currentNode = parentEvolutionSource.getNode();
		URI evolutionLocation = currentNode.getURI();
		

		boolean[] genome = getGenome();
		boolean[] parentGenome = parentDiseaseModel.getGenome();
		
		// Update the genome
		if(genome != null && genome.length > 1) {
			double dMute = Math.random()*genome.length;
			int iMute = (int)Math.round(dMute);
			for(int i = 0; i < genome.length; i ++) {
				genome[i] = parentGenome[i];
				if (i == iMute) {
					genome[i] = !genome[i];
				}
			}
		}
		setGenome(genome);
		
//		// Matt, we have not decorated the graph at this point right??
		for (DynamicLabel dl : this.getLabelsToUpdate()) {
			if (dl instanceof EvolvingSIDiseaseModelLabel) {
				double s = 0.0;
				double i = 0.0;
				double diseaseDeaths = 0.0;
				
				// this is the new label we need to set
				EvolvingSIDiseaseModelLabel childLabel = (EvolvingSIDiseaseModelLabel)dl;
				EvolvingSIDiseaseModelLabelValue childLabelValues = (EvolvingSIDiseaseModelLabelValue)childLabel.getCurrentValue();
				// this is the new label we need to set
				EvolvingSIDiseaseModelLabel parentSIlabel = (EvolvingSIDiseaseModelLabel) parentEvolutionSource;
				// same parent population
				childLabel.setPopulationLabel(parentSIlabel.getPopulationLabel());
				childLabel.setPopulationModelLabel(parentSIlabel.getPopulationModelLabel());
				
				// get the parent label value - we need this to know the current population
				EvolvingSIDiseaseModelLabelValue lv = (EvolvingSIDiseaseModelLabelValue)parentSIlabel.getCurrentValue();
				double popCount = lv.getPopulationCount();
				s = popCount;
				
				// Do something interesting here to initialize disease state
				// TODO performance question
				// TODO we are looking through the entire graphs to find THIS label. 
				if (childLabel.getNode().getURI().equals(evolutionLocation)) {
					// This is where the evolution happened, so you probably need to set your
					// infectious state differently
					System.out.println("initializing child disease at evolution location");
					if(parentEvolutionSource instanceof EvolvingSIDiseaseModelLabel) {
						// should be true
						if(popCount > 1.0) {
							// init the child diseases values
							i = 1.0;
							s = s - 1.0;
						} else {
							System.err.println("Likely ERROR: Zero population detected on node "+currentNode.getURI().lastSegment()+" ...  Do something.");
						}
					}
					
				} else {
					// This is everywhere else
					// for now we are already set
				} // if else
				
				childLabelValues.setS(s);
				childLabelValues.setI(i);
				childLabelValues.setDiseaseDeaths(diseaseDeaths);
			}
		}
		

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getGeneticDistance(EvolvingDiseaseModel otherDieaseStrain) {
		boolean[] genome = getGenome();
		if(genome==null || genome.length <= 1) {
			// In this version we just return 1.0 since we do not implement a genome yet
			return 1.0;
		} else {
			boolean[] otherGenome = otherDieaseStrain.getGenome();
			double ntDistance = 0;
			for(int i = 0; i < genome.length; i ++) {
			   if(genome[i] != otherGenome[i]) {
				   ntDistance ++;
			   }
			}
			//double cmDistance = getCMdistance(otherDieaseStrain);
			return Math.pow(ntDistance,geneticDistNonlinExponent);
		}
	}

	/**
	 * 
	 * @param genome1
	 * @param genome2
	 * @return
	 */
	protected double getCMdistance(EvolvingDiseaseModel otherStrain) {
		double cm1 = getGeneticCenterOfMass(this);
		//double cm2 = getGeneticCenterOfMass(otherStrain);
		double diff = Math.abs(cm1-cm1);
		if(diff >= 1.0) {
			return diff;
		} else {
			return 1.0;
		}
	}


	/**
	 *  NOT USED
	 * @return
	 */
	protected double getGeneticCenterOfMass(EvolvingDiseaseModel otherStrain) {
		double cm = 0;
		
		boolean[] genome = getGenome();
		boolean[] otherGenome = otherStrain.getGenome();
		
		for(int i = 0; i < genome.length; i ++) {
			if(otherGenome[i]) cm += i;	  	   
		}
		cm /= genome.length;
		return cm;
	}


	/**
	 * 
	 * @param rootName
	 * @return
	 */
	protected String getPhyloDiseaseName(String rootName) {
		String retVal = rootName;
		int idx1 = retVal.indexOf("_[");
		if(idx1>=0) {
			retVal=rootName.substring(0, idx1);
		}
		return retVal;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.stem.diseasemodels.standard.impl.DiseaseModelImpl#prepare(org.eclipse.stem.core.model.Model, org.eclipse.stem.core.model.STEMTime)
	 */
	@Override
	public void prepare(Model model, STEMTime time) {
		super.prepare(model, time);
		
		// Get and set the disease model's transformer as a node decorator
		EvolvingDiseaseTransformer transformer = getTransformer();
		if (transformer != null) {
			model.getNodeDecorators().add(transformer);
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DiseaseModelLabel createDiseaseModelLabel(String populationIdentifier) {	
		DiseaseModelLabel label = EvolvingFactory.eINSTANCE.createEvolvingSIDiseaseModelLabel(); 
		label.setTypeURI(DiseaseModelLabel.URI_TYPE_DYNAMIC_DISEASE_LABEL);

		return label;
	} // createDiseaseModelLabel


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DiseaseModelLabelValue createDiseaseModelLabelValue(String populationIdentifier) {
		return EvolvingFactory.eINSTANCE.createEvolvingSIDiseaseModelLabelValue(); 
	}

	
} //EvolvingSIDiseaseModelImpl
