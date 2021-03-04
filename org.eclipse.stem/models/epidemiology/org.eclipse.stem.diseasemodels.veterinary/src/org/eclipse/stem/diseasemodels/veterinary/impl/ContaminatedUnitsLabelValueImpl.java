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
package org.eclipse.stem.diseasemodels.veterinary.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.stem.core.graph.IntegrationLabelValue;
import org.eclipse.stem.core.graph.LabelValue;

import org.eclipse.stem.diseasemodels.veterinary.ContaminatedUnitsLabelValue;
import org.eclipse.stem.diseasemodels.veterinary.VeterinaryFactory;
import org.eclipse.stem.diseasemodels.veterinary.VeterinaryPackage;

import org.eclipse.stem.populationmodels.standard.impl.StandardPopulationModelLabelValueImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contaminated Units Label Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ContaminatedUnitsLabelValueImpl extends StandardPopulationModelLabelValueImpl implements ContaminatedUnitsLabelValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContaminatedUnitsLabelValueImpl() {
		super();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VeterinaryPackage.Literals.CONTAMINATED_UNITS_LABEL_VALUE;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegrationLabelValue set(IntegrationLabelValue value) {
		ContaminatedUnitsLabelValue v = (ContaminatedUnitsLabelValue)value;
		super.set(v);


		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegrationLabelValue add(IntegrationLabelValue value) {
		ContaminatedUnitsLabelValue v = (ContaminatedUnitsLabelValue)value;
		super.add(v);


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


		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override	
	public IntegrationLabelValue sub(IntegrationLabelValue value) {
		ContaminatedUnitsLabelValue v = (ContaminatedUnitsLabelValue)value;
		super.sub(v);


		return this;	
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegrationLabelValue divide(IntegrationLabelValue value) {
		ContaminatedUnitsLabelValue v = (ContaminatedUnitsLabelValue)value;
		super.divide(v);


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

		return maxValue;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double computeDeltaAdjustment(IntegrationLabelValue value) {
		ContaminatedUnitsLabelValue v = (ContaminatedUnitsLabelValue)value;
		double factor = super.computeDeltaAdjustment(v);

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
		
	} // reset


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean avoidNegative(IntegrationLabelValue value) {
		ContaminatedUnitsLabelValue v = (ContaminatedUnitsLabelValue)value;
		boolean adjusted = super.avoidNegative(v);

		return adjusted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean sameValue(LabelValue value) {
		ContaminatedUnitsLabelValue v = (ContaminatedUnitsLabelValue)value;
		if (!super.sameValue(v)) {
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
		ContaminatedUnitsLabelValue copy = VeterinaryFactory.eINSTANCE.createContaminatedUnitsLabelValue();
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
							

} //ContaminatedUnitsLabelValueImpl
