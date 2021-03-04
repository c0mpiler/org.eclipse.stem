/**
 */
package org.eclipse.stem.interventions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.stem.interventions.InterventionsPackage;
import org.eclipse.stem.interventions.StandardPeriodicInterventionLabelValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard Periodic Intervention Label Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.interventions.impl.StandardPeriodicInterventionLabelValueImpl#isAbsolute <em>Absolute</em>}</li>
 *   <li>{@link org.eclipse.stem.interventions.impl.StandardPeriodicInterventionLabelValueImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.stem.interventions.impl.StandardPeriodicInterventionLabelValueImpl#getVaccinations <em>Vaccinations</em>}</li>
 *   <li>{@link org.eclipse.stem.interventions.impl.StandardPeriodicInterventionLabelValueImpl#getIsolations <em>Isolations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StandardPeriodicInterventionLabelValueImpl extends InterventionLabelValueImpl implements StandardPeriodicInterventionLabelValue {
	/**
	 * The default value of the '{@link #isAbsolute() <em>Absolute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbsolute()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSOLUTE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAbsolute() <em>Absolute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbsolute()
	 * @generated
	 * @ordered
	 */
	protected boolean absolute = ABSOLUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final long PERIOD_EDEFAULT = 86400000L;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected long period = PERIOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVaccinations() <em>Vaccinations</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaccinations()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> vaccinations;

	/**
	 * The cached value of the '{@link #getIsolations() <em>Isolations</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolations()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> isolations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardPeriodicInterventionLabelValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InterventionsPackage.Literals.STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbsolute() {
		return absolute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbsolute(boolean newAbsolute) {
		boolean oldAbsolute = absolute;
		absolute = newAbsolute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterventionsPackage.STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__ABSOLUTE, oldAbsolute, absolute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(long newPeriod) {
		long oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterventionsPackage.STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getVaccinations() {
		if (vaccinations == null) {
			vaccinations = new EDataTypeEList<Double>(Double.class, this, InterventionsPackage.STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__VACCINATIONS);
		}
		return vaccinations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getIsolations() {
		if (isolations == null) {
			isolations = new EDataTypeEList<Double>(Double.class, this, InterventionsPackage.STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__ISOLATIONS);
		}
		return isolations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InterventionsPackage.STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__ABSOLUTE:
				return isAbsolute();
			case InterventionsPackage.STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__PERIOD:
				return getPeriod();
			case InterventionsPackage.STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__VACCINATIONS:
				return getVaccinations();
			case InterventionsPackage.STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__ISOLATIONS:
				return getIsolations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InterventionsPackage.STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__ABSOLUTE:
				setAbsolute((Boolean)newValue);
				return;
			case InterventionsPackage.STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__PERIOD:
				setPeriod((Long)newValue);
				return;
			case InterventionsPackage.STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__VACCINATIONS:
				getVaccinations().clear();
				getVaccinations().addAll((Collection<? extends Double>)newValue);
				return;
			case InterventionsPackage.STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__ISOLATIONS:
				getIsolations().clear();
				getIsolations().addAll((Collection<? extends Double>)newValue);
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
			case InterventionsPackage.STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__ABSOLUTE:
				setAbsolute(ABSOLUTE_EDEFAULT);
				return;
			case InterventionsPackage.STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case InterventionsPackage.STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__VACCINATIONS:
				getVaccinations().clear();
				return;
			case InterventionsPackage.STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__ISOLATIONS:
				getIsolations().clear();
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
			case InterventionsPackage.STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__ABSOLUTE:
				return absolute != ABSOLUTE_EDEFAULT;
			case InterventionsPackage.STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__PERIOD:
				return period != PERIOD_EDEFAULT;
			case InterventionsPackage.STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__VACCINATIONS:
				return vaccinations != null && !vaccinations.isEmpty();
			case InterventionsPackage.STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__ISOLATIONS:
				return isolations != null && !isolations.isEmpty();
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
		result.append(" (absolute: ");
		result.append(absolute);
		result.append(", period: ");
		result.append(period);
		result.append(", vaccinations: ");
		result.append(vaccinations);
		result.append(", isolations: ");
		result.append(isolations);
		result.append(')');
		return result.toString();
	}

} //StandardPeriodicInterventionLabelValueImpl
