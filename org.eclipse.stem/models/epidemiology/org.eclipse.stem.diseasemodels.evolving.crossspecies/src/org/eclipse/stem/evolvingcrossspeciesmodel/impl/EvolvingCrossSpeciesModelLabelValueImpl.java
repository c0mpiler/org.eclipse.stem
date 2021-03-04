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
package org.eclipse.stem.evolvingcrossspeciesmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.core.graph.IntegrationLabelValue;
import org.eclipse.stem.core.graph.LabelValue;
import org.eclipse.stem.diseasemodels.standard.impl.SIRLabelValueImpl;
import org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelFactory;
import org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelLabelValue;
import org.eclipse.stem.evolvingcrossspeciesmodel.EvolvingCrossSpeciesModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.evolvingcrossspeciesmodel.impl.EvolvingCrossSpeciesModelLabelValueImpl#getE <em>E</em>}</li>
 *   <li>{@link org.eclipse.stem.evolvingcrossspeciesmodel.impl.EvolvingCrossSpeciesModelLabelValueImpl#getSeff <em>Seff</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvolvingCrossSpeciesModelLabelValueImpl extends SIRLabelValueImpl implements EvolvingCrossSpeciesModelLabelValue {
	/**
	 * The default value of the '{@link #getE() <em>E</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE()
	 * @generated
	 * @ordered
	 */
	protected static final double E_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getE() <em>E</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE()
	 * @generated
	 * @ordered
	 */
	protected double e = E_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeff() <em>Seff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeff()
	 * @generated
	 * @ordered
	 */
	protected static final double SEFF_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getSeff() <em>Seff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeff()
	 * @generated
	 * @ordered
	 */
	protected double seff = SEFF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolvingCrossSpeciesModelLabelValueImpl() {
		super();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvolvingCrossSpeciesModelPackage.Literals.EVOLVING_CROSS_SPECIES_MODEL_LABEL_VALUE;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getE() {
		return e;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setE(double newE) {
		e = newE;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSeff() {
		return seff;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeff(double newSeff) {
		seff = newSeff;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL_LABEL_VALUE__E:
				return getE();
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL_LABEL_VALUE__SEFF:
				return getSeff();
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
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL_LABEL_VALUE__E:
				setE((Double)newValue);
				return;
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL_LABEL_VALUE__SEFF:
				setSeff((Double)newValue);
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
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL_LABEL_VALUE__E:
				setE(E_EDEFAULT);
				return;
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL_LABEL_VALUE__SEFF:
				setSeff(SEFF_EDEFAULT);
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
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL_LABEL_VALUE__E:
				return e != E_EDEFAULT;
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL_LABEL_VALUE__SEFF:
				return seff != SEFF_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (e: ");
		result.append(e);
		result.append(", seff: ");
		result.append(seff);
		result.append(')');
		return result.toString();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegrationLabelValue set(IntegrationLabelValue value) {
		EvolvingCrossSpeciesModelLabelValue v = (EvolvingCrossSpeciesModelLabelValue)value;
		super.set(v);

		setE(v.getE());
		setSeff(v.getSeff());

		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegrationLabelValue add(IntegrationLabelValue value) {
		EvolvingCrossSpeciesModelLabelValue v = (EvolvingCrossSpeciesModelLabelValue)value;
		super.add(v);

		setE(getE() + v.getE());
		setSeff(getSeff() + v.getSeff());

		return this;	
	}	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegrationLabelValue add(double value) {
		super.add(value);

		setE((double)(getE() + value));
		setSeff((double)(getSeff() + value));

		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override	
	public IntegrationLabelValue sub(IntegrationLabelValue value) {
		EvolvingCrossSpeciesModelLabelValue v = (EvolvingCrossSpeciesModelLabelValue)value;
		super.sub(v);

		setE(getE() - v.getE());
		setSeff(getSeff() - v.getSeff());

		return this;	
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegrationLabelValue divide(IntegrationLabelValue value) {
		EvolvingCrossSpeciesModelLabelValue v = (EvolvingCrossSpeciesModelLabelValue)value;
		super.divide(v);

		setE(getE() / v.getE());
		setSeff(getSeff() / v.getSeff());

		return this;	
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegrationLabelValue scale(double scaleFactor) {
		super.scale(scaleFactor);

		setE((double)(getE() * scaleFactor));
		setSeff((double)(getSeff() * scaleFactor));

		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegrationLabelValue abs() {
		super.abs();

		setE(Math.abs(getE()));
		setSeff(Math.abs(getSeff()));
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double max() {
		double maxValue = super.max();

		maxValue = Math.max(maxValue, getE());
		maxValue = Math.max(maxValue, getSeff());
		return maxValue;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double computeDeltaAdjustment(IntegrationLabelValue value) {
		EvolvingCrossSpeciesModelLabelValue v = (EvolvingCrossSpeciesModelLabelValue)value;
		double factor = super.computeDeltaAdjustment(v);

		if ((double)(getE() + v.getE()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getE() / getE()));
		}
		if ((double)(getSeff() + v.getSeff()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getSeff() / getSeff()));
		}
		return factor;
	} // computeDeltaAdjustment
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */	
	@Override
	public void reset() {
		super.reset();
		
		setE((double)0.0);
		setSeff((double)0.0);
	} // reset

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */	
	@Override
	public double getPopulationCount() {
		double count = super.getPopulationCount();  
	
		count += (double)getE();
		count += (double)getSeff();

		return count;
	} // getPopulationCount

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean avoidNegative(IntegrationLabelValue value) {
		EvolvingCrossSpeciesModelLabelValue v = (EvolvingCrossSpeciesModelLabelValue)value;
		boolean adjusted = super.avoidNegative(v);

		if ((double)(getE() + v.getE()) < 0.0) {
			adjusted = true;
			setE(-v.getE());
		}

		if ((double)(getSeff() + v.getSeff()) < 0.0) {
			adjusted = true;
			setSeff(-v.getSeff());
		}

		return adjusted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean sameValue(LabelValue value) {
		EvolvingCrossSpeciesModelLabelValue v = (EvolvingCrossSpeciesModelLabelValue)value;
		if (!super.sameValue(v)) {
			return false;
		}

		if (getE() != v.getE()) {
			return false;
		}
		if (getSeff() != v.getSeff()) {
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegrationLabelValue copy() {
		EvolvingCrossSpeciesModelLabelValue copy = EvolvingCrossSpeciesModelFactory.eINSTANCE.createEvolvingCrossSpeciesModelLabelValue();
		copy.set(this);
		return copy;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */	
	@Override
	public void prepareCycle() {
		super.prepareCycle();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double eGetDouble(int featureID) {
		switch (featureID) {
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL_LABEL_VALUE__E:
				return getE();
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL_LABEL_VALUE__SEFF:
				return getSeff();
		}

		return super.eGetDouble(featureID);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSetDouble(int featureID, double newValue) {
		switch (featureID) {
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL_LABEL_VALUE__E:
				setE(newValue);
				return;
			case EvolvingCrossSpeciesModelPackage.EVOLVING_CROSS_SPECIES_MODEL_LABEL_VALUE__SEFF:
				setSeff(newValue);
				return;
		}
		
		super.eSetDouble(featureID,newValue);
	}
							

} //EvolvingCrossSpeciesModelLabelValueImpl
