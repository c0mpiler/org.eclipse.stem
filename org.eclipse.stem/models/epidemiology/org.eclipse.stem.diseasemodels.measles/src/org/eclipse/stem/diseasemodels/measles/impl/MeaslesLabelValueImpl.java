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
package org.eclipse.stem.diseasemodels.measles.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.core.graph.IntegrationLabelValue;
import org.eclipse.stem.core.graph.LabelValue;
import org.eclipse.stem.diseasemodels.measles.MeaslesFactory;
import org.eclipse.stem.diseasemodels.measles.MeaslesLabelValue;
import org.eclipse.stem.diseasemodels.measles.MeaslesPackage;
import org.eclipse.stem.diseasemodels.standard.impl.SEIRLabelValueImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.measles.impl.MeaslesLabelValueImpl#getVaccinated <em>Vaccinated</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.measles.impl.MeaslesLabelValueImpl#getImmunisations <em>Immunisations</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.measles.impl.MeaslesLabelValueImpl#getM <em>M</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.measles.impl.MeaslesLabelValueImpl#getIncidenceV <em>Incidence V</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeaslesLabelValueImpl extends SEIRLabelValueImpl implements MeaslesLabelValue {
	/**
	 * The default value of the '{@link #getVaccinated() <em>Vaccinated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaccinated()
	 * @generated
	 * @ordered
	 */
	protected static final double VACCINATED_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getVaccinated() <em>Vaccinated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaccinated()
	 * @generated
	 * @ordered
	 */
	protected double vaccinated = VACCINATED_EDEFAULT;
	/**
	 * The default value of the '{@link #getImmunisations() <em>Immunisations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunisations()
	 * @generated
	 * @ordered
	 */
	protected static final double IMMUNISATIONS_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getImmunisations() <em>Immunisations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunisations()
	 * @generated
	 * @ordered
	 */
	protected double immunisations = IMMUNISATIONS_EDEFAULT;
	/**
	 * The default value of the '{@link #getM() <em>M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM()
	 * @generated
	 * @ordered
	 */
	protected static final double M_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getM() <em>M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM()
	 * @generated
	 * @ordered
	 */
	protected double m = M_EDEFAULT;
	/**
	 * The default value of the '{@link #getIncidenceV() <em>Incidence V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidenceV()
	 * @generated
	 * @ordered
	 */
	protected static final double INCIDENCE_V_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getIncidenceV() <em>Incidence V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidenceV()
	 * @generated
	 * @ordered
	 */
	protected double incidenceV = INCIDENCE_V_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeaslesLabelValueImpl() {
		super();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeaslesPackage.Literals.MEASLES_LABEL_VALUE;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVaccinated() {
		return vaccinated;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVaccinated(double newVaccinated) {
		vaccinated = newVaccinated;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getImmunisations() {
		return immunisations;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImmunisations(double newImmunisations) {
		immunisations = newImmunisations;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getM() {
		return m;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM(double newM) {
		m = newM;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIncidenceV() {
		return incidenceV;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncidenceV(double newIncidenceV) {
		incidenceV = newIncidenceV;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MeaslesPackage.MEASLES_LABEL_VALUE__VACCINATED:
				return getVaccinated();
			case MeaslesPackage.MEASLES_LABEL_VALUE__IMMUNISATIONS:
				return getImmunisations();
			case MeaslesPackage.MEASLES_LABEL_VALUE__M:
				return getM();
			case MeaslesPackage.MEASLES_LABEL_VALUE__INCIDENCE_V:
				return getIncidenceV();
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
			case MeaslesPackage.MEASLES_LABEL_VALUE__VACCINATED:
				setVaccinated((Double)newValue);
				return;
			case MeaslesPackage.MEASLES_LABEL_VALUE__IMMUNISATIONS:
				setImmunisations((Double)newValue);
				return;
			case MeaslesPackage.MEASLES_LABEL_VALUE__M:
				setM((Double)newValue);
				return;
			case MeaslesPackage.MEASLES_LABEL_VALUE__INCIDENCE_V:
				setIncidenceV((Double)newValue);
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
			case MeaslesPackage.MEASLES_LABEL_VALUE__VACCINATED:
				setVaccinated(VACCINATED_EDEFAULT);
				return;
			case MeaslesPackage.MEASLES_LABEL_VALUE__IMMUNISATIONS:
				setImmunisations(IMMUNISATIONS_EDEFAULT);
				return;
			case MeaslesPackage.MEASLES_LABEL_VALUE__M:
				setM(M_EDEFAULT);
				return;
			case MeaslesPackage.MEASLES_LABEL_VALUE__INCIDENCE_V:
				setIncidenceV(INCIDENCE_V_EDEFAULT);
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
			case MeaslesPackage.MEASLES_LABEL_VALUE__VACCINATED:
				return vaccinated != VACCINATED_EDEFAULT;
			case MeaslesPackage.MEASLES_LABEL_VALUE__IMMUNISATIONS:
				return immunisations != IMMUNISATIONS_EDEFAULT;
			case MeaslesPackage.MEASLES_LABEL_VALUE__M:
				return m != M_EDEFAULT;
			case MeaslesPackage.MEASLES_LABEL_VALUE__INCIDENCE_V:
				return incidenceV != INCIDENCE_V_EDEFAULT;
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
		result.append(" (vaccinated: ");
		result.append(vaccinated);
		result.append(", immunisations: ");
		result.append(immunisations);
		result.append(", m: ");
		result.append(m);
		result.append(", incidenceV: ");
		result.append(incidenceV);
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
		MeaslesLabelValue v = (MeaslesLabelValue)value;
		super.set(v);

		setVaccinated(v.getVaccinated());
		setImmunisations(v.getImmunisations());
		setM(v.getM());
		setIncidenceV(v.getIncidenceV());

		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegrationLabelValue add(IntegrationLabelValue value) {
		MeaslesLabelValue v = (MeaslesLabelValue)value;
		super.add(v);

		setVaccinated(getVaccinated() + v.getVaccinated());
		setImmunisations(getImmunisations() + v.getImmunisations());
		setM(getM() + v.getM());
		setIncidenceV(getIncidenceV() + v.getIncidenceV());

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

		setVaccinated((double)(getVaccinated() + value));
		setImmunisations((double)(getImmunisations() + value));
		setM((double)(getM() + value));
		setIncidenceV((double)(getIncidenceV() + value));

		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override	
	public IntegrationLabelValue sub(IntegrationLabelValue value) {
		MeaslesLabelValue v = (MeaslesLabelValue)value;
		super.sub(v);

		setVaccinated(getVaccinated() - v.getVaccinated());
		setImmunisations(getImmunisations() - v.getImmunisations());
		setM(getM() - v.getM());
		setIncidenceV(getIncidenceV() - v.getIncidenceV());

		return this;	
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegrationLabelValue divide(IntegrationLabelValue value) {
		MeaslesLabelValue v = (MeaslesLabelValue)value;
		super.divide(v);

		setVaccinated(getVaccinated() / v.getVaccinated());
		setImmunisations(getImmunisations() / v.getImmunisations());
		setM(getM() / v.getM());
		setIncidenceV(getIncidenceV() / v.getIncidenceV());

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

		setVaccinated((double)(getVaccinated() * scaleFactor));
		setImmunisations((double)(getImmunisations() * scaleFactor));
		setM((double)(getM() * scaleFactor));
		setIncidenceV((double)(getIncidenceV() * scaleFactor));

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

		setVaccinated(Math.abs(getVaccinated()));
		setImmunisations(Math.abs(getImmunisations()));
		setM(Math.abs(getM()));
		setIncidenceV(Math.abs(getIncidenceV()));
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

		maxValue = Math.max(maxValue, getVaccinated());
		maxValue = Math.max(maxValue, getM());
		return maxValue;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double computeDeltaAdjustment(IntegrationLabelValue value) {
		MeaslesLabelValue v = (MeaslesLabelValue)value;
		double factor = super.computeDeltaAdjustment(v);

		if ((double)(getVaccinated() + v.getVaccinated()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getVaccinated() / getVaccinated()));
		}
		if ((double)(getImmunisations() + v.getImmunisations()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getImmunisations() / getImmunisations()));
		}
		if ((double)(getM() + v.getM()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getM() / getM()));
		}
		if ((double)(getIncidenceV() + v.getIncidenceV()) < 0.0) {
			factor = Math.min(factor, (double)(-v.getIncidenceV() / getIncidenceV()));
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
		
		setVaccinated((double)0.0);
		setImmunisations((double)0.0);
		setM((double)0.0);
		setIncidenceV((double)0.0);
	} // reset

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */	
	@Override
	public double getPopulationCount() {
		double count = super.getPopulationCount();  
	
		count += (double)getVaccinated();
		count += (double)getM();

		return count;
	} // getPopulationCount

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean avoidNegative(IntegrationLabelValue value) {
		MeaslesLabelValue v = (MeaslesLabelValue)value;
		boolean adjusted = super.avoidNegative(v);

		if ((double)(getVaccinated() + v.getVaccinated()) < 0.0) {
			adjusted = true;
			setVaccinated(-v.getVaccinated());
		}

		if ((double)(getImmunisations() + v.getImmunisations()) < 0.0) {
			adjusted = true;
			setImmunisations(-v.getImmunisations());
		}

		if ((double)(getM() + v.getM()) < 0.0) {
			adjusted = true;
			setM(-v.getM());
		}

		if ((double)(getIncidenceV() + v.getIncidenceV()) < 0.0) {
			adjusted = true;
			setIncidenceV(-v.getIncidenceV());
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
		MeaslesLabelValue v = (MeaslesLabelValue)value;
		if (!super.sameValue(v)) {
			return false;
		}

		if (getVaccinated() != v.getVaccinated()) {
			return false;
		}
		if (getImmunisations() != v.getImmunisations()) {
			return false;
		}
		if (getM() != v.getM()) {
			return false;
		}
		if (getIncidenceV() != v.getIncidenceV()) {
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
		MeaslesLabelValue copy = MeaslesFactory.eINSTANCE.createMeaslesLabelValue();
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
		setImmunisations(0.0);
		setIncidenceV(0.0);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double eGetDouble(int featureID) {
		switch (featureID) {
			case MeaslesPackage.MEASLES_LABEL_VALUE__VACCINATED:
				return getVaccinated();
			case MeaslesPackage.MEASLES_LABEL_VALUE__IMMUNISATIONS:
				return getImmunisations();
			case MeaslesPackage.MEASLES_LABEL_VALUE__M:
				return getM();
			case MeaslesPackage.MEASLES_LABEL_VALUE__INCIDENCE_V:
				return getIncidenceV();
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
			case MeaslesPackage.MEASLES_LABEL_VALUE__VACCINATED:
				setVaccinated(newValue);
				return;
			case MeaslesPackage.MEASLES_LABEL_VALUE__IMMUNISATIONS:
				setImmunisations(newValue);
				return;
			case MeaslesPackage.MEASLES_LABEL_VALUE__M:
				setM(newValue);
				return;
			case MeaslesPackage.MEASLES_LABEL_VALUE__INCIDENCE_V:
				setIncidenceV(newValue);
				return;
		}
		
		super.eSetDouble(featureID,newValue);
	}
							

} //MeaslesLabelValueImpl
