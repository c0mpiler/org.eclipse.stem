package org.eclipse.stem.populationmodels.standard.impl;

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

import java.util.HashMap;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.Exchange;
import org.eclipse.stem.core.graph.ExchangePool;
import org.eclipse.stem.core.graph.ExchangeType;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.populationmodels.standard.AgeGroup;
import org.eclipse.stem.populationmodels.standard.AgingPopulationModel;
import org.eclipse.stem.populationmodels.standard.PopulationGroup;
import org.eclipse.stem.populationmodels.standard.StandardPackage;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabel;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabelValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Aging Population Model</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.AgingPopulationModelImpl#isHasMaxAge <em>Has Max Age</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgingPopulationModelImpl extends DemographicPopulationModelImpl
		implements AgingPopulationModel {
	/**
	 * The default value of the '{@link #isHasMaxAge() <em>Has Max Age</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isHasMaxAge()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_MAX_AGE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isHasMaxAge() <em>Has Max Age</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isHasMaxAge()
	 * @generated
	 * @ordered
	 */
	protected boolean hasMaxAge = HAS_MAX_AGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public AgingPopulationModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.AGING_POPULATION_MODEL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasMaxAge() {
		return hasMaxAge;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasMaxAge(boolean newHasMaxAge) {
		hasMaxAge = newHasMaxAge;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StandardPackage.AGING_POPULATION_MODEL__HAS_MAX_AGE:
				return isHasMaxAge();
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
			case StandardPackage.AGING_POPULATION_MODEL__HAS_MAX_AGE:
				setHasMaxAge((Boolean)newValue);
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
			case StandardPackage.AGING_POPULATION_MODEL__HAS_MAX_AGE:
				setHasMaxAge(HAS_MAX_AGE_EDEFAULT);
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
			case StandardPackage.AGING_POPULATION_MODEL__HAS_MAX_AGE:
				return hasMaxAge != HAS_MAX_AGE_EDEFAULT;
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
		result.append(" (hasMaxAge: ");
		result.append(hasMaxAge);
		result.append(')');
		return result.toString();
	}

	@Override
	public void calculateDeltas(STEMTime time, double t, long timeDelta,
			EList<DynamicLabel> labels) {
		double adjustedBirthRate = adjustRate(this.getBirthRate(),
				this.getTimePeriod(), timeDelta);
		double adjustedDeathRate = adjustRate(this.getDeathRate(),
				this.getTimePeriod(), timeDelta);
		double years = (double) timeDelta / 31556952216.0;
		HashMap<String, AgeGroup> groups = new HashMap<String, AgeGroup>();

		for (PopulationGroup group : getPopulationGroups()) {
			groups.put(group.getIdentifier(), (AgeGroup) group);
		}

		for (DynamicLabel lab1 : labels) {
			StandardPopulationModelLabel currentLabel = (StandardPopulationModelLabel) lab1;
			StandardPopulationModelLabel previousLabel = null;
			StandardPopulationModelLabel nextLabel = null;

			AgeGroup currentGroup = groups.get(currentLabel
					.getPopulationIdentifier());
			Node node = (Node) currentLabel.getIdentifiable();
			EList<NodeLabel> nodeLabels = node.getLabels();
			double currentCount = ((StandardPopulationModelLabelValue) currentLabel
					.getProbeValue()).getCount();
			double births = 0.0;
			double deaths = adjustedDeathRate * currentGroup.getDeathFactor()
					* currentCount;
			double agedIn = 0.0;
			double agedOut = 0.0;
			double population = 0.0;

			for (NodeLabel lab2 : nodeLabels) {
				if (lab2 instanceof StandardPopulationModelLabel) {
					StandardPopulationModelLabel label = (StandardPopulationModelLabel) lab2;
					AgeGroup group = groups
							.get(label.getPopulationIdentifier());

					if (group != null) {
						double count = ((StandardPopulationModelLabelValue) label
								.getTempValue()).getCount();

						population += count;

						if (currentGroup.getFromAge() == group.getToAge() + 1) {
							agedIn = years
									/ (group.getToAge() - group.getFromAge() + 1)
									* count;
							previousLabel = label;
						} else if (group.getFromAge() == currentGroup
								.getToAge() + 1) {
							nextLabel = label;
						}
					}
				}
			}

			if (currentGroup.getFromAge() == 0) {
				births = adjustedBirthRate * population;
			}

			if (currentGroup.isLimited()) {
				if (nextLabel != null) {
					agedOut = years
							/ (currentGroup.getToAge()
									- currentGroup.getFromAge() + 1)
							* currentCount;
				} else {
					deaths += years
							/ (currentGroup.getToAge()
									- currentGroup.getFromAge() + 1)
							* currentCount;
				}
			}

			StandardPopulationModelLabelValue delta = (StandardPopulationModelLabelValue) currentLabel
					.getDeltaValue();

			delta.setCount(births + agedIn - deaths - agedOut);
			delta.setBirths(births);
			delta.setDeaths(deaths);

			computeAdditionalDeltasAndExchanges(currentLabel, time, t, timeDelta);
			
			// We need to add additional exchanges for aging here 
			Exchange agedInExchange = (Exchange)ExchangePool.POOL.get();
			Exchange agedOutExchange = (Exchange)ExchangePool.POOL.get();

			if (previousLabel != null) {
				agedInExchange.setType(ExchangeType.AGING);
				agedInExchange.getOtherLabels().add(previousLabel);
				agedInExchange.setCount(agedIn);
				delta.getArrivals().add(agedInExchange);
			}

			if (nextLabel != null) {
				agedOutExchange.setType(ExchangeType.AGING);
				agedOutExchange.getOtherLabels().add(nextLabel);
				agedOutExchange.setCount(agedOut);
				delta.getDepartures().add(agedOutExchange);
			}

			ECollections.sort(delta.getArrivals());
			ECollections.sort(delta.getDepartures());
		}
	}
} // AgingPopulationModelImpl
