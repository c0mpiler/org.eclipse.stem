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

import java.util.Random;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.diseasemodels.standard.StandardStochasticDiseaseModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stochastic Disease Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.impl.StandardStochasticDiseaseModelImpl#getGain <em>Gain</em>}</li>
 * </ul>
 *
 * @generated
 */
@SuppressWarnings("deprecation")
public abstract class StandardStochasticDiseaseModelImpl extends StochasticDiseaseModelImpl implements StandardStochasticDiseaseModel {
	/**
	 * The default value of the '{@link #getGain() <em>Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGain()
	 * @generated NOT
	 * @ordered
	 */
	public static final double GAIN_EDEFAULT = 0.01;

	/**
	 * The cached value of the '{@link #getGain() <em>Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGain()
	 * @generated
	 * @ordered
	 */
	protected double gain = GAIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardStochasticDiseaseModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.STANDARD_STOCHASTIC_DISEASE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getGain() {
		return gain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGain(double newGain) {
		gain = newGain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * By default this calls the static method StandardStochasticDiseaseModelImpl.computeNoise(gain, rand)
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double computeNoise() {
		return computeNoise(getGain(), getRandomGenerator());
	}
	

	/**
	 * This method returns a double precision random noise variable
	 * r between (1.0+x) and (1.0-x)
	 * where x is a product G* Math.rand(), and G is a gain factor 0<G<max noise
	 * 
	 * @param gain
	 * @param rand
	 * @return noise
	 */
	public static double computeNoise(final double gain, final Random rand) {
     
	    assert (gain <= StochasticDiseaseModelImpl.getMAX_GAIN()):"STOCHASTIC NOISE must be 'small', therefore gain parameter must be < MAX_GAIN="+MAX_GAIN; // maximum noise should be 1%
		double x = (2.0*rand.nextDouble())-1.0; // +/- 1
		x *= gain;
		x += 1.0;
		assert ((x>0.0)&&(x<2.0)) : "random noise should be a small perturbation Gain factor, g,  must 0.0 < g << 1.0 ";
		return x;
		
	} // getNoise

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("boxing")
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StandardPackage.STANDARD_STOCHASTIC_DISEASE_MODEL__GAIN:
				return getGain();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("boxing")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StandardPackage.STANDARD_STOCHASTIC_DISEASE_MODEL__GAIN:
				setGain((Double)newValue);
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
			case StandardPackage.STANDARD_STOCHASTIC_DISEASE_MODEL__GAIN:
				setGain(GAIN_EDEFAULT);
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
			case StandardPackage.STANDARD_STOCHASTIC_DISEASE_MODEL__GAIN:
				return gain != GAIN_EDEFAULT;
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
		result.append(" (gain: "); //$NON-NLS-1$
		result.append(gain);
		result.append(')');
		return result.toString();
	}

} //StandardStochasticDiseaseModelImpl
