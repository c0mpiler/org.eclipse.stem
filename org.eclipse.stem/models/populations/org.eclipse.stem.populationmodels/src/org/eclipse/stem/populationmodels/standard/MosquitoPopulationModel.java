package org.eclipse.stem.populationmodels.standard;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mosquito Population Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.MosquitoPopulationModel#getScalingFactor <em>Scaling Factor</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.MosquitoPopulationModel#getMortalityRate <em>Mortality Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.MosquitoPopulationModel#getHost <em>Host</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getMosquitoPopulationModel()
 * @model
 * @generated
 */
public interface MosquitoPopulationModel extends PopulationModel {
	/**
	 * Returns the value of the '<em><b>Scaling Factor</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scaling Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scaling Factor</em>' attribute.
	 * @see #setScalingFactor(double)
	 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getMosquitoPopulationModel_ScalingFactor()
	 * @model default="1.0"
	 * @generated
	 */
	double getScalingFactor();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.populationmodels.standard.MosquitoPopulationModel#getScalingFactor <em>Scaling Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaling Factor</em>' attribute.
	 * @see #getScalingFactor()
	 * @generated
	 */
	void setScalingFactor(double value);

	/**
	 * Returns the value of the '<em><b>Mortality Rate</b></em>' attribute.
	 * The default value is <code>"0.05"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mortality Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mortality Rate</em>' attribute.
	 * @see #setMortalityRate(double)
	 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getMosquitoPopulationModel_MortalityRate()
	 * @model default="0.05"
	 * @generated
	 */
	double getMortalityRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.populationmodels.standard.MosquitoPopulationModel#getMortalityRate <em>Mortality Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mortality Rate</em>' attribute.
	 * @see #getMortalityRate()
	 * @generated
	 */
	void setMortalityRate(double value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * The default value is <code>"human"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#getMosquitoPopulationModel_Host()
	 * @model default="human"
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.populationmodels.standard.MosquitoPopulationModel#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

} // MosquitoPopulationModel
