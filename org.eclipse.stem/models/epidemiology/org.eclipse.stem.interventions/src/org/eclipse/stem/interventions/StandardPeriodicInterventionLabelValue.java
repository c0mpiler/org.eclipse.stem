/**
 */
package org.eclipse.stem.interventions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard Periodic Intervention Label Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.interventions.StandardPeriodicInterventionLabelValue#isAbsolute <em>Absolute</em>}</li>
 *   <li>{@link org.eclipse.stem.interventions.StandardPeriodicInterventionLabelValue#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.stem.interventions.StandardPeriodicInterventionLabelValue#getVaccinations <em>Vaccinations</em>}</li>
 *   <li>{@link org.eclipse.stem.interventions.StandardPeriodicInterventionLabelValue#getIsolations <em>Isolations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.interventions.InterventionsPackage#getStandardPeriodicInterventionLabelValue()
 * @model
 * @generated
 */
public interface StandardPeriodicInterventionLabelValue extends InterventionLabelValue {
	/**
	 * Returns the value of the '<em><b>Absolute</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Absolute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Absolute</em>' attribute.
	 * @see #setAbsolute(boolean)
	 * @see org.eclipse.stem.interventions.InterventionsPackage#getStandardPeriodicInterventionLabelValue_Absolute()
	 * @model default="true"
	 * @generated
	 */
	boolean isAbsolute();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.interventions.StandardPeriodicInterventionLabelValue#isAbsolute <em>Absolute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Absolute</em>' attribute.
	 * @see #isAbsolute()
	 * @generated
	 */
	void setAbsolute(boolean value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * The default value is <code>"86400000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(long)
	 * @see org.eclipse.stem.interventions.InterventionsPackage#getStandardPeriodicInterventionLabelValue_Period()
	 * @model default="86400000"
	 * @generated
	 */
	long getPeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.interventions.StandardPeriodicInterventionLabelValue#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(long value);

	/**
	 * Returns the value of the '<em><b>Vaccinations</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vaccinations</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vaccinations</em>' attribute list.
	 * @see org.eclipse.stem.interventions.InterventionsPackage#getStandardPeriodicInterventionLabelValue_Vaccinations()
	 * @model unique="false"
	 * @generated
	 */
	EList<Double> getVaccinations();

	/**
	 * Returns the value of the '<em><b>Isolations</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isolations</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isolations</em>' attribute list.
	 * @see org.eclipse.stem.interventions.InterventionsPackage#getStandardPeriodicInterventionLabelValue_Isolations()
	 * @model unique="false"
	 * @generated
	 */
	EList<Double> getIsolations();

} // StandardPeriodicInterventionLabelValue
