/**
 */
package org.eclipse.stem.populationmodels.standard;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seasonal Migratory Population Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.SeasonalMigratoryPopulationModel#getPhase <em>Phase</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.SeasonalMigratoryPopulationModel#getPeriod <em>Period</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getSeasonalMigratoryPopulationModel()
 * @model
 * @generated
 */
public interface SeasonalMigratoryPopulationModel extends StandardPopulationModel {
	/**
	 * Returns the value of the '<em><b>Phase</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase</em>' attribute.
	 * @see #setPhase(double)
	 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getSeasonalMigratoryPopulationModel_Phase()
	 * @model default="0.0"
	 * @generated
	 */
	double getPhase();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.populationmodels.standard.SeasonalMigratoryPopulationModel#getPhase <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase</em>' attribute.
	 * @see #getPhase()
	 * @generated
	 */
	void setPhase(double value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * The default value is <code>"365.25"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getSeasonalMigratoryPopulationModel_Period()
	 * @model default="365.25" changeable="false"
	 * @generated
	 */
	double getPeriod();

} // SeasonalMigratoryPopulationModel
