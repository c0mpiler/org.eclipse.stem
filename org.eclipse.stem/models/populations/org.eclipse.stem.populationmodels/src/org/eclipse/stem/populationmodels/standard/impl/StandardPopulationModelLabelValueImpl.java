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
import org.eclipse.stem.core.graph.LabelValue;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.definitions.labels.AreaLabel;
import org.eclipse.stem.populationmodels.standard.StandardFactory;
import org.eclipse.stem.populationmodels.standard.StandardPackage;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabel;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabelValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Population Model Label Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.StandardPopulationModelLabelValueImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.StandardPopulationModelLabelValueImpl#getBirths <em>Births</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.StandardPopulationModelLabelValueImpl#getDeaths <em>Deaths</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.StandardPopulationModelLabelValueImpl#getDensity <em>Density</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StandardPopulationModelLabelValueImpl extends PopulationModelLabelValueImpl implements StandardPopulationModelLabelValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardPopulationModelLabelValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.STANDARD_POPULATION_MODEL_LABEL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(double newCount) {
		count = newCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBirths() {
		return births;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirths(double newBirths) {
		births = newBirths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDeaths() {
		return deaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeaths(double newDeaths) {
		deaths = newDeaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getDensity() {
		double population = this.getCount();
		double area = 0.0;
		StandardPopulationModelLabel label = (StandardPopulationModelLabel)this.eContainer();
		if(label != null) {
			Node n= label.getNode();
			if((n!=null)&&(n.getLabels()!=null)) {
				for(NodeLabel nodeLab : n.getLabels()) {
					if(nodeLab instanceof AreaLabel) {
						area = ((AreaLabel)nodeLab).getCurrentAreaValue().getArea();
						break;
					}
				}
			} 
		}
		
		return (area > 0.0)? (population/area) : 0.0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetDensity() {
		return true; // Density always set
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean avoidNegative(IntegrationLabelValue value) {
		StandardPopulationModelLabelValue sval = (StandardPopulationModelLabelValue)value;
		boolean adjusted = false;
		double newCount = this.getCount() + sval.getCount();
		double newBirths = this.getBirths() + sval.getBirths();
		double newDeaths = this.getDeaths() + sval.getDeaths();
		
		if(newCount<0.0) {
			adjusted = true;
			this.setCount(-sval.getCount());
		}
		
		if(newBirths<0.0) {
			adjusted = true;
			this.setBirths(-sval.getBirths());
		}
		
		if(newDeaths<0.0) {
			adjusted = true;
			this.setDeaths(-sval.getDeaths());
		}
		
		return adjusted;

	}
	
	public double computeDeltaAdjustment(IntegrationLabelValue value) {
		StandardPopulationModelLabelValue sval = (StandardPopulationModelLabelValue)value;
		double newCount = this.getCount() + sval.getCount();
		double newBirths = this.getBirths() + sval.getBirths();
		double newDeaths = this.getDeaths() + sval.getDeaths();
		double factor = 1.0;
		
		if(newCount < 0.0) {
			factor = Math.min(factor, -sval.getCount()/this.getCount());
		}
		
		if(newBirths < 0.0) {
			factor = Math.min(factor, -sval.getBirths()/this.getBirths());
		}
		
		if (newDeaths < 0.0) {
			factor = Math.min(factor, -sval.getDeaths()/this.getDeaths());
		}
		
		return factor;
	}

	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final double COUNT_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected double count = COUNT_EDEFAULT;
	/**
	 * The default value of the '{@link #getBirths() <em>Births</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirths()
	 * @generated
	 * @ordered
	 */
	protected static final double BIRTHS_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getBirths() <em>Births</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirths()
	 * @generated
	 * @ordered
	 */
	protected double births = BIRTHS_EDEFAULT;
	/**
	 * The default value of the '{@link #getDeaths() <em>Deaths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeaths()
	 * @generated
	 * @ordered
	 */
	protected static final double DEATHS_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getDeaths() <em>Deaths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeaths()
	 * @generated
	 * @ordered
	 */
	protected double deaths = DEATHS_EDEFAULT;
	/**
	 * The default value of the '{@link #getDensity() <em>Density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDensity()
	 * @generated
	 * @ordered
	 */
	protected static final double DENSITY_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getDensity() <em>Density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDensity()
	 * @generated
	 * @ordered
	 */
	protected double density = DENSITY_EDEFAULT;
	
	public boolean sameValue(LabelValue otherValue) {
		if(!(otherValue instanceof StandardPopulationModelLabelValue)) return false;
		if(((StandardPopulationModelLabelValue)otherValue).getCount() == getCount() &&
				((StandardPopulationModelLabelValue)otherValue).getDeaths() == getDeaths())
			return true;
		return false;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StandardPackage.STANDARD_POPULATION_MODEL_LABEL_VALUE__COUNT:
				return getCount();
			case StandardPackage.STANDARD_POPULATION_MODEL_LABEL_VALUE__BIRTHS:
				return getBirths();
			case StandardPackage.STANDARD_POPULATION_MODEL_LABEL_VALUE__DEATHS:
				return getDeaths();
			case StandardPackage.STANDARD_POPULATION_MODEL_LABEL_VALUE__DENSITY:
				return getDensity();
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
			case StandardPackage.STANDARD_POPULATION_MODEL_LABEL_VALUE__COUNT:
				setCount((Double)newValue);
				return;
			case StandardPackage.STANDARD_POPULATION_MODEL_LABEL_VALUE__BIRTHS:
				setBirths((Double)newValue);
				return;
			case StandardPackage.STANDARD_POPULATION_MODEL_LABEL_VALUE__DEATHS:
				setDeaths((Double)newValue);
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
			case StandardPackage.STANDARD_POPULATION_MODEL_LABEL_VALUE__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case StandardPackage.STANDARD_POPULATION_MODEL_LABEL_VALUE__BIRTHS:
				setBirths(BIRTHS_EDEFAULT);
				return;
			case StandardPackage.STANDARD_POPULATION_MODEL_LABEL_VALUE__DEATHS:
				setDeaths(DEATHS_EDEFAULT);
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
			case StandardPackage.STANDARD_POPULATION_MODEL_LABEL_VALUE__COUNT:
				return count != COUNT_EDEFAULT;
			case StandardPackage.STANDARD_POPULATION_MODEL_LABEL_VALUE__BIRTHS:
				return births != BIRTHS_EDEFAULT;
			case StandardPackage.STANDARD_POPULATION_MODEL_LABEL_VALUE__DEATHS:
				return deaths != DEATHS_EDEFAULT;
			case StandardPackage.STANDARD_POPULATION_MODEL_LABEL_VALUE__DENSITY:
				return density != DENSITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer();
		result.append(" (count: ");
		result.append(getCount());
		result.append(", births: ");
		result.append(getBirths());
		result.append(", deaths: ");
		result.append(getDeaths());
		result.append(')');
		return result.toString();
	}

	public IntegrationLabelValue abs() {
		this.setCount(Math.abs(this.getCount()));
		this.setBirths(Math.abs(this.getBirths()));
		this.setDeaths(Math.abs(this.getDeaths()));
		return this;
	}

	public IntegrationLabelValue add(IntegrationLabelValue value) {
		StandardPopulationModelLabelValue v = (StandardPopulationModelLabelValue)value;
		this.setBirths(this.getBirths() + v.getBirths());
		this.setDeaths(this.getDeaths() + v.getDeaths());
		this.setCount(this.getCount() + v.getCount());
		return this;
	}

	public IntegrationLabelValue add(double addition) {
		this.setCount(this.getCount() + addition);
		this.setBirths(this.getBirths() + addition);
		this.setDeaths(this.getDeaths() + addition);
		return this;
	}

	public IntegrationLabelValue scale(double scaleFactor) {
		this.setCount(this.getCount() * scaleFactor);
		this.setBirths(this.getBirths() * scaleFactor);
		this.setDeaths(this.getDeaths() * scaleFactor);
		return this;
	}

	public IntegrationLabelValue set(IntegrationLabelValue value) {
		StandardPopulationModelLabelValue v = (StandardPopulationModelLabelValue)value;
		this.setCount(v.getCount());
		this.setBirths(v.getBirths());
		this.setDeaths(v.getDeaths());
		return this;
	}

	public IntegrationLabelValue sub(IntegrationLabelValue value) {
		StandardPopulationModelLabelValue v = (StandardPopulationModelLabelValue)value;
		this.setBirths(this.getBirths() - v.getBirths());
		this.setDeaths(this.getDeaths() - v.getDeaths());
		this.setCount(this.getCount() - v.getCount());
		return this;
	}

	public IntegrationLabelValue divide(IntegrationLabelValue d) {
		
		StandardPopulationModelLabelValue _scale = (StandardPopulationModelLabelValue)d;
		double cScaled = Math.abs(getCount()) / Math.abs(_scale.getCount());
		double bScaled = Math.abs(getBirths()) / Math.abs(_scale.getBirths());
		double dScaled = Math.abs(getDeaths()) / Math.abs(_scale.getDeaths());
		setCount(cScaled);
		setBirths(bScaled);
		setDeaths(dScaled);
		return this;
	}
	
	public double max() {
		if(getCount() > getBirths() && getCount() > getDeaths()) return getCount();
		else if(getBirths() > getDeaths()) return getBirths();
		else return getDeaths();
	}
	
	@Override
	public IntegrationLabelValue copy() {
		IntegrationLabelValue ilv = StandardFactory.eINSTANCE.createStandardPopulationModelLabelValue();
		ilv.set(this);
		return ilv;
	}
	
	/**
	 * Use this for enhanced performance (no boxing) instead of eSet
	 */
	
	@Override
	public void eSetDouble(int featureId, double newValue) {
		switch (featureId) {
			case StandardPackage.STANDARD_POPULATION_MODEL_LABEL_VALUE__COUNT:
				setCount(newValue);
				return;
			case StandardPackage.STANDARD_POPULATION_MODEL_LABEL_VALUE__BIRTHS:
				setBirths(newValue);
				return;
			case StandardPackage.STANDARD_POPULATION_MODEL_LABEL_VALUE__DEATHS:
				setDeaths(newValue);
				return;
		}
		super.eSetDouble(featureId, newValue);
	}
	
	/**
	 * For performance. Retrieve double attributes directly without boxing
	 * 
	 * @param doubleAttribute The attribute to retrieve (must be of type Double)
	 * @return double the value for the attribute
	 */
	@Override
	public double eGetDouble(int featureId) {
		switch (featureId) {
			case StandardPackage.STANDARD_POPULATION_MODEL_LABEL_VALUE__COUNT:
				return getCount();
			case StandardPackage.STANDARD_POPULATION_MODEL_LABEL_VALUE__BIRTHS:
				return getBirths();
			case StandardPackage.STANDARD_POPULATION_MODEL_LABEL_VALUE__DEATHS:
				return getDeaths();
			case StandardPackage.STANDARD_POPULATION_MODEL_LABEL_VALUE__DENSITY:
				return getDensity();
		}
		return super.eGetDouble(featureId);
	}
	
	@Override
	public void reset() {
		super.reset();
		this.setCount(COUNT_EDEFAULT);
		this.setBirths(BIRTHS_EDEFAULT);
		this.setDeaths(DEATHS_EDEFAULT);
		arrivals = null;
		departures = null;
	}
	
	/**
	 * Prepare for a new simulation cycle. Clear out the incidence
	 */
	public void prepareCycle() {
		// Nothing do to 
	}
	
} //StandardPopulationModelLabelValueImpl
