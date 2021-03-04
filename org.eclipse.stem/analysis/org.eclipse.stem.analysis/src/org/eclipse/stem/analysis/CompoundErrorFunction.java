/**
 */
package org.eclipse.stem.analysis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound Error Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.analysis.CompoundErrorFunction#isUseDeaths <em>Use Deaths</em>}</li>
 *   <li>{@link org.eclipse.stem.analysis.CompoundErrorFunction#isUseCumSum <em>Use Cum Sum</em>}</li>
 *   <li>{@link org.eclipse.stem.analysis.CompoundErrorFunction#isUseDaily <em>Use Daily</em>}</li>
 * </ul>
 *
 * @see org.eclipse.stem.analysis.AnalysisPackage#getCompoundErrorFunction()
 * @model
 * @generated
 */
@SuppressWarnings("all")
public interface CompoundErrorFunction extends ErrorFunction {
	/**
	 * Returns the value of the '<em><b>Use Deaths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Deaths</em>' attribute.
	 * @see #setUseDeaths(boolean)
	 * @see org.eclipse.stem.analysis.AnalysisPackage#getCompoundErrorFunction_UseDeaths()
	 * @model
	 * @generated
	 */
	boolean isUseDeaths();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.analysis.CompoundErrorFunction#isUseDeaths <em>Use Deaths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Deaths</em>' attribute.
	 * @see #isUseDeaths()
	 * @generated
	 */
	void setUseDeaths(boolean value);

	/**
	 * Returns the value of the '<em><b>Use Cum Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Cum Sum</em>' attribute.
	 * @see #setUseCumSum(boolean)
	 * @see org.eclipse.stem.analysis.AnalysisPackage#getCompoundErrorFunction_UseCumSum()
	 * @model
	 * @generated
	 */
	boolean isUseCumSum();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.analysis.CompoundErrorFunction#isUseCumSum <em>Use Cum Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Cum Sum</em>' attribute.
	 * @see #isUseCumSum()
	 * @generated
	 */
	void setUseCumSum(boolean value);

	/**
	 * Returns the value of the '<em><b>Use Daily</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Daily</em>' attribute.
	 * @see #setUseDaily(boolean)
	 * @see org.eclipse.stem.analysis.AnalysisPackage#getCompoundErrorFunction_UseDaily()
	 * @model
	 * @generated
	 */
	boolean isUseDaily();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.analysis.CompoundErrorFunction#isUseDaily <em>Use Daily</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Daily</em>' attribute.
	 * @see #isUseDaily()
	 * @generated
	 */
	void setUseDaily(boolean value);

} // CompoundErrorFunction
