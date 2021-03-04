/**
 */
package org.eclipse.stem.interventions;

import org.eclipse.stem.graphgenerators.GraphGenerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Periodic Control Graph Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.interventions.PeriodicControlGraphGenerator#getPopulationIdentifier <em>Population Identifier</em>}</li>
 *   <li>{@link org.eclipse.stem.interventions.PeriodicControlGraphGenerator#getDataPath <em>Data Path</em>}</li>
 *   <li>{@link org.eclipse.stem.interventions.PeriodicControlGraphGenerator#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.stem.interventions.PeriodicControlGraphGenerator#isUseVaccinations <em>Use Vaccinations</em>}</li>
 *   <li>{@link org.eclipse.stem.interventions.PeriodicControlGraphGenerator#isFraction <em>Fraction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.interventions.InterventionsPackage#getPeriodicControlGraphGenerator()
 * @model
 * @generated
 */
public interface PeriodicControlGraphGenerator extends GraphGenerator {
	/**
	 * Returns the value of the '<em><b>Population Identifier</b></em>' attribute.
	 * The default value is <code>"human"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Population Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population Identifier</em>' attribute.
	 * @see #setPopulationIdentifier(String)
	 * @see org.eclipse.stem.interventions.InterventionsPackage#getPeriodicControlGraphGenerator_PopulationIdentifier()
	 * @model default="human"
	 * @generated
	 */
	String getPopulationIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.interventions.PeriodicControlGraphGenerator#getPopulationIdentifier <em>Population Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population Identifier</em>' attribute.
	 * @see #getPopulationIdentifier()
	 * @generated
	 */
	void setPopulationIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Data Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Path</em>' attribute.
	 * @see #setDataPath(String)
	 * @see org.eclipse.stem.interventions.InterventionsPackage#getPeriodicControlGraphGenerator_DataPath()
	 * @model
	 * @generated
	 */
	String getDataPath();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.interventions.PeriodicControlGraphGenerator#getDataPath <em>Data Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Path</em>' attribute.
	 * @see #getDataPath()
	 * @generated
	 */
	void setDataPath(String value);

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
	 * @see org.eclipse.stem.interventions.InterventionsPackage#getPeriodicControlGraphGenerator_Period()
	 * @model default="86400000"
	 * @generated
	 */
	long getPeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.interventions.PeriodicControlGraphGenerator#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(long value);

	/**
	 * Returns the value of the '<em><b>Use Vaccinations</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Vaccinations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Vaccinations</em>' attribute.
	 * @see #setUseVaccinations(boolean)
	 * @see org.eclipse.stem.interventions.InterventionsPackage#getPeriodicControlGraphGenerator_UseVaccinations()
	 * @model default="true"
	 * @generated
	 */
	boolean isUseVaccinations();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.interventions.PeriodicControlGraphGenerator#isUseVaccinations <em>Use Vaccinations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Vaccinations</em>' attribute.
	 * @see #isUseVaccinations()
	 * @generated
	 */
	void setUseVaccinations(boolean value);

	/**
	 * Returns the value of the '<em><b>Fraction</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fraction</em>' attribute.
	 * @see #setFraction(boolean)
	 * @see org.eclipse.stem.interventions.InterventionsPackage#getPeriodicControlGraphGenerator_Fraction()
	 * @model default="true"
	 * @generated
	 */
	boolean isFraction();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.interventions.PeriodicControlGraphGenerator#isFraction <em>Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fraction</em>' attribute.
	 * @see #isFraction()
	 * @generated
	 */
	void setFraction(boolean value);

} // PeriodicControlGraphGenerator
