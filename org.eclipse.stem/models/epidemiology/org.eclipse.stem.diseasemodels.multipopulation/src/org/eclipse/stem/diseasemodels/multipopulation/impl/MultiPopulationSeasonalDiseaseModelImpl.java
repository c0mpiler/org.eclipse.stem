package org.eclipse.stem.diseasemodels.multipopulation.impl;

/******************************************************************************* 
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     IBM Corporation - initial API and implementation 
 *******************************************************************************/

import java.util.Calendar;

import org.apache.commons.math3.analysis.interpolation.SplineInterpolator;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.stem.core.common.DoubleValue;
import org.eclipse.stem.core.common.DoubleValueList;
import org.eclipse.stem.core.common.DoubleValueMatrix;
import org.eclipse.stem.core.common.StringValue;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.Exchange;
import org.eclipse.stem.core.graph.ExchangePool;
import org.eclipse.stem.core.graph.ExchangeType;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSeasonalDiseaseModel;
import org.eclipse.stem.diseasemodels.multipopulation.MultipopulationPackage;
import org.eclipse.stem.diseasemodels.standard.SEIRLabel;
import org.eclipse.stem.diseasemodels.standard.SEIRLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.diseasemodels.standard.impl.SEIRLabelValueImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Multi Population Seasonal Disease Model</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.eclipse.stem.diseasemodels.multipopulation.impl.MultiPopulationSeasonalDiseaseModelImpl#getModulationPoints
 * <em>Modulation Points</em>}</li>
 * <li>
 * {@link org.eclipse.stem.diseasemodels.multipopulation.impl.MultiPopulationSeasonalDiseaseModelImpl#getInterpolationType
 * <em>Interpolation Type</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MultiPopulationSeasonalDiseaseModelImpl extends
MultiPopulationSEIRDiseaseModelImpl implements
MultiPopulationSeasonalDiseaseModel {
	/**
	 * The cached value of the '{@link #getModulationPoints() <em>Modulation Points</em>}' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getModulationPoints()
	 * @generated
	 * @ordered
	 */
	protected DoubleValueMatrix modulationPoints;

	/**
	 * The default value of the '{@link #isUseSplineInterpolation() <em>Use Spline Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseSplineInterpolation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_SPLINE_INTERPOLATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseSplineInterpolation() <em>Use Spline Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseSplineInterpolation()
	 * @generated
	 * @ordered
	 */
	protected boolean useSplineInterpolation = USE_SPLINE_INTERPOLATION_EDEFAULT;

	private PolynomialSplineFunction splineFunction;

	private PolynomialSplineFunction linearFunction;

	private double[] x;

	private double[] y;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public MultiPopulationSeasonalDiseaseModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultipopulationPackage.Literals.MULTI_POPULATION_SEASONAL_DISEASE_MODEL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleValueMatrix getModulationPoints() {
		return modulationPoints;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModulationPoints(
			DoubleValueMatrix newModulationPoints, NotificationChain msgs) {
		// DoubleValueMatrix oldModulationPoints = modulationPoints;
		modulationPoints = newModulationPoints;
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setModulationPoints(DoubleValueMatrix newModulationPoints) {
		if (newModulationPoints != modulationPoints) {
			NotificationChain msgs = null;
			if (modulationPoints != null)
				msgs = ((InternalEObject)modulationPoints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MultipopulationPackage.MULTI_POPULATION_SEASONAL_DISEASE_MODEL__MODULATION_POINTS, null, msgs);
			if (newModulationPoints != null)
				msgs = ((InternalEObject)newModulationPoints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MultipopulationPackage.MULTI_POPULATION_SEASONAL_DISEASE_MODEL__MODULATION_POINTS, null, msgs);
			msgs = basicSetModulationPoints(newModulationPoints, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseSplineInterpolation() {
		return useSplineInterpolation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseSplineInterpolation(boolean newUseSplineInterpolation) {
		useSplineInterpolation = newUseSplineInterpolation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MultipopulationPackage.MULTI_POPULATION_SEASONAL_DISEASE_MODEL__MODULATION_POINTS:
			return basicSetModulationPoints(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MultipopulationPackage.MULTI_POPULATION_SEASONAL_DISEASE_MODEL__MODULATION_POINTS:
			return getModulationPoints();
		case MultipopulationPackage.MULTI_POPULATION_SEASONAL_DISEASE_MODEL__USE_SPLINE_INTERPOLATION:
			return isUseSplineInterpolation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MultipopulationPackage.MULTI_POPULATION_SEASONAL_DISEASE_MODEL__MODULATION_POINTS:
			setModulationPoints((DoubleValueMatrix)newValue);
			return;
		case MultipopulationPackage.MULTI_POPULATION_SEASONAL_DISEASE_MODEL__USE_SPLINE_INTERPOLATION:
			setUseSplineInterpolation((Boolean)newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MultipopulationPackage.MULTI_POPULATION_SEASONAL_DISEASE_MODEL__MODULATION_POINTS:
			setModulationPoints((DoubleValueMatrix)null);
			return;
		case MultipopulationPackage.MULTI_POPULATION_SEASONAL_DISEASE_MODEL__USE_SPLINE_INTERPOLATION:
			setUseSplineInterpolation(USE_SPLINE_INTERPOLATION_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MultipopulationPackage.MULTI_POPULATION_SEASONAL_DISEASE_MODEL__MODULATION_POINTS:
			return modulationPoints != null;
		case MultipopulationPackage.MULTI_POPULATION_SEASONAL_DISEASE_MODEL__USE_SPLINE_INTERPOLATION:
			return useSplineInterpolation != USE_SPLINE_INTERPOLATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (useSplineInterpolation: ");
		result.append(useSplineInterpolation);
		result.append(')');
		return result.toString();
	}

	@Override
	public void calculateDeltas(STEMTime time, double t, long timeDelta, EList<DynamicLabel> labels)  {
		for(int _i=0;_i<labels.size();++_i) {
			final DynamicLabel label =  labels.get(_i);
			IntegrationLabel ilabel = (IntegrationLabel)label;

			StandardDiseaseModelLabel diseaseLabel = (StandardDiseaseModelLabel)ilabel;
			StandardDiseaseModelLabelValue currentState = (StandardDiseaseModelLabelValue)ilabel.getProbeValue();
			StandardDiseaseModelLabelValue deltaValue = (StandardDiseaseModelLabelValue)ilabel.getDeltaValue();

			deltaValue.reset();
			
			final SEIRLabelValue currentSEIR = (SEIRLabelValue) currentState;
			String thisPopulation = diseaseLabel.getPopulationModelLabel()
					.getPopulationIdentifier();
			int populationIndex = this.getPopulationIndex(thisPopulation);
			double transmissionModulation = computeInterpolationFunctions(time);

			EList<DoubleValue> transmissionVector = getTransmissionRate()
					.getValueLists().get(populationIndex).getValues();
			double thisRecoveryRate = getRecoveryRate().getValues()
					.get(populationIndex).getValue();
			double thisImmunityLossRate = getImmunityLossRate().getValues()
					.get(populationIndex).getValue();
			double thisIncubationRate = getIncubationRate().getValues()
					.get(populationIndex).getValue();

			// iterate over every population (including this one) to compute new
			// infections
			double numberOfSusceptibleToExposed = 0.0;
			double numberSusceptible = currentSEIR.getS();
			Node thisNode = diseaseLabel.getNode();
			EList<StringValue> groupList = getPopulationGroups().getValues();

			for (int i = 0; i < transmissionVector.size(); i++) {
				double specificTransmission = transmissionVector.get(i).getValue();
				double adjustedTransmission = getAdjustedTransmissionRate(
						specificTransmission, timeDelta) * transmissionModulation;
				if (!this.isFrequencyDependent())
					adjustedTransmission *= getTransmissionRateScaleFactor(diseaseLabel);

				// we need to get the disease label for the other population
				// to get the on site number of infectious individuals
				String nextPop = groupList.get(i).getValue();

				for (NodeLabel nlabel : thisNode.getLabels()) {
					if (nlabel instanceof SEIRLabel
							&& ((SEIRLabel) nlabel).getDecorator() == this) {
						SEIRLabel otherDiseaseLabel = (SEIRLabel) nlabel;
						String otherPopulation = otherDiseaseLabel.getIdentifier();

						if (otherPopulation.equals(nextPop)) {
							double onsiteInfectious = ((SEIRLabelValue) otherDiseaseLabel
									.getTempValue()).getI();
							final double effectiveInfectious = getNormalizedEffectiveInfectious(
									thisNode, otherDiseaseLabel, onsiteInfectious,
									StandardPackage.Literals.SI_LABEL_VALUE__I, StandardPackage.Literals.STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE, StandardPackage.Literals.STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION);

							// add to the new incidence
							numberOfSusceptibleToExposed += adjustedTransmission
									* numberSusceptible * effectiveInfectious;
						}
					}
				}
			}

			double numberOfInfectedToRecovered = getAdjustedRecoveryRate(
					thisRecoveryRate, timeDelta) * currentSEIR.getI();
			double numberOfRecoveredToSusceptible = getAdjustedImmunityLossRate(
					thisImmunityLossRate, timeDelta) * currentSEIR.getR();
			double numberOfExposedToInfected = getAdjustedIncubationRate(
					thisIncubationRate, timeDelta) * currentSEIR.getE();
			double diseaseDeaths = getAdjustedInfectiousMortalityRate(
					timeDelta, thisPopulation) * currentSEIR.getI();

			final double deltaS = -numberOfSusceptibleToExposed
					+ numberOfRecoveredToSusceptible;
			final double deltaE = numberOfSusceptibleToExposed
					- numberOfExposedToInfected;
			final double deltaI = numberOfExposedToInfected
					- numberOfInfectedToRecovered - diseaseDeaths;
			final double deltaR = numberOfInfectedToRecovered
					- numberOfRecoveredToSusceptible;

			SEIRLabelValueImpl ret = (SEIRLabelValueImpl) deltaValue;
			
			
			/////////////////////////////////////////////////////////////////////////////
			// added to express the transitions. Necessary to support stochastic modeling
			// S->E
			Exchange seExchange = (Exchange)ExchangePool.POOL.get(); 
			seExchange.setSource(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
			seExchange.setTarget(StandardPackage.eINSTANCE.getSEIRLabelValue_E());
			seExchange.setCount(numberOfSusceptibleToExposed);
			seExchange.getForIncidence().add(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_Incidence());
			seExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(seExchange);
			
			// E->I
			Exchange eiExchange = (Exchange)ExchangePool.POOL.get(); 
			eiExchange.setSource(StandardPackage.eINSTANCE.getSEIRLabelValue_E());
			eiExchange.setTarget(StandardPackage.eINSTANCE.getSILabelValue_I());
			eiExchange.setCount(numberOfExposedToInfected);
			eiExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(eiExchange);
			
			// I->R
			Exchange irExchange = (Exchange)ExchangePool.POOL.get(); 
			irExchange.setSource(StandardPackage.eINSTANCE.getSILabelValue_I());
			irExchange.setTarget(StandardPackage.eINSTANCE.getSIRLabelValue_R());
			irExchange.setCount(numberOfInfectedToRecovered);
			irExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(irExchange);
			
			// R->S
			Exchange rsExchange = (Exchange)ExchangePool.POOL.get(); 
			rsExchange.setSource(StandardPackage.eINSTANCE.getSIRLabelValue_R());
			rsExchange.setTarget(StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S());
			rsExchange.setCount(numberOfRecoveredToSusceptible);
			rsExchange.setType(ExchangeType.COMPARTMENT_TRANSITION);
			deltaValue.getDepartures().add(rsExchange);
			// added to express the transitions. Necessary to support stochastic modeling
			/////////////////////////////////////////////////////////////////////////////
			
			ret.setS(deltaS);
			ret.setE(deltaE);
			ret.setI(deltaI);
			ret.setR(deltaR);
			ret.setIncidence(numberOfSusceptibleToExposed);
			ret.setDiseaseDeaths(diseaseDeaths);

			computeAdditionalDeltasAndExchanges(ilabel, time, t, timeDelta);
		}
	}

	private synchronized double computeInterpolationFunctions(STEMTime time) {
		boolean pointsChanged = false;
		EList<DoubleValueList> points = modulationPoints.getValueLists();
		int n = points.size();
		int m = 10;

		if (x == null || x.length != (2 * m + 1) * n) {
			x = new double[(2 * m + 1) * n];
			y = new double[(2 * m + 1) * n];
			pointsChanged = true;
		}

		int index = 0;

		for (DoubleValueList point : points) {
			double nx = point.getValues().get(0).getValue();
			double ny = point.getValues().get(1).getValue();

			if (x[index] != nx - m * 365.0 || y[index] != ny) {
				x[index] = nx - m * 365.0;
				y[index] = ny;
				pointsChanged = true;
			}

			index++;
		}

		if (pointsChanged) {
			// The value at 0.0 and 365.0 should be the same in order to have a
			// continuous transition between years. Therefore the same sampling
			// points are used for several years in a row which leads to a
			// periodic function.
			for (int j = 1; j <= 2 * m; j++) {
				for (int i = 0; i < n; i++) {
					x[j * n + i] = x[i] + j * 365.0;
					y[j * n + i] = y[i];
				}
			}

			n = (2 * m + 1) * n;

			// Spline Interpolation
			SplineInterpolator interpolator = new SplineInterpolator();

			splineFunction = interpolator.interpolate(x, y);

			// Linear Interpolation
			PolynomialFunction polynomials[] = new PolynomialFunction[n - 1];

			for (int i = 0; i < n - 1; i++) {
				final double coefficients[] = new double[2];

				coefficients[0] = y[i];
				coefficients[1] = (y[i + 1] - y[i]) / (x[i + 1] - x[i]);
				polynomials[i] = new PolynomialFunction(coefficients);
			}

			linearFunction = new PolynomialSplineFunction(x, polynomials);
		}

		//Date date = time.getTime();
		//Long now = date.getTime();
		//Date firstJanuary = new Date(date.getYear(), 0, 1);  // deprecated
		
		Calendar calJanOne = Calendar.getInstance(); // this is calendar NOW
		int currentYear = calJanOne.get(Calendar.YEAR);
		calJanOne.set(currentYear, 0, 1); // reset to January first
		
		double millisecondOfTheYear = Calendar.getInstance().getTimeInMillis() - calJanOne.getTimeInMillis();
		double dayOfTheYear = millisecondOfTheYear / (24 * 60 * 60 * 1000);

		// Maximum Day of the Year is 365, otherwise interpolation function may
		// not be continuous at transition to next year.
		dayOfTheYear = Math.min(dayOfTheYear, 365.0);

		if (useSplineInterpolation) {
				return Math.max(splineFunction.value(dayOfTheYear), 0.0);
		} else {
				return Math.max(linearFunction.value(dayOfTheYear), 0.0);
		}
	}

} // MultiPopulationSeasonalDiseaseModelImpl
