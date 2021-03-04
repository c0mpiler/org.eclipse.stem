package org.eclipse.stem.diseasemodels.vector;



/**
*  This is the textbook Macdonald-Ross vector borne disease model. You can find a description of the model in Anderson & May "Infectious Diseases of Humans", chapter 14.4.
*  with the addition of a immune stage.
*
* @model
*/



public interface MacdonaldRossDiseaseModel extends VectorDiseaseModel{

	/**
	 * Returns the value of the '<em><b>Biting Rate</b></em>' attribute.
	 * The default value is <code>"0.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Biting Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Biting Rate</em>' attribute.
	 * @see #setBitingRate(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getMacdonaldRossDiseaseModel_BitingRate()
	 * @model default="0.5"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getBitingRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.MacdonaldRossDiseaseModel#getBitingRate <em>Biting Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Biting Rate</em>' attribute.
	 * @see #getBitingRate()
	 * @generated
	 */
	void setBitingRate(double value);

	/**
	 * Returns the value of the '<em><b>Infectious Biting Proportion Human</b></em>' attribute.
	 * The default value is <code>"0.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infectious Biting Proportion Human</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infectious Biting Proportion Human</em>' attribute.
	 * @see #setInfectiousBitingProportionHuman(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getMacdonaldRossDiseaseModel_InfectiousBitingProportionHuman()
	 * @model default="0.5"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0' maxValue='1'"
	 * @generated
	 */
	double getInfectiousBitingProportionHuman();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.MacdonaldRossDiseaseModel#getInfectiousBitingProportionHuman <em>Infectious Biting Proportion Human</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infectious Biting Proportion Human</em>' attribute.
	 * @see #getInfectiousBitingProportionHuman()
	 * @generated
	 */
	void setInfectiousBitingProportionHuman(double value);

	/**
	 * Returns the value of the '<em><b>Infectious Biting Proportion Vector</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infectious Biting Proportion Vector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infectious Biting Proportion Vector</em>' attribute.
	 * @see #setInfectiousBitingProportionVector(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getMacdonaldRossDiseaseModel_InfectiousBitingProportionVector()
	 * @model default="1.0"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0' maxValue='1'"
	 * @generated
	 */
	double getInfectiousBitingProportionVector();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.MacdonaldRossDiseaseModel#getInfectiousBitingProportionVector <em>Infectious Biting Proportion Vector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infectious Biting Proportion Vector</em>' attribute.
	 * @see #getInfectiousBitingProportionVector()
	 * @generated
	 */
	void setInfectiousBitingProportionVector(double value);

	/**
	 * Returns the value of the '<em><b>Recovery Rate</b></em>' attribute.
	 * The default value is <code>"3.33E-3"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recovery Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recovery Rate</em>' attribute.
	 * @see #setRecoveryRate(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getMacdonaldRossDiseaseModel_RecoveryRate()
	 * @model default="3.33E-3"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getRecoveryRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.MacdonaldRossDiseaseModel#getRecoveryRate <em>Recovery Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recovery Rate</em>' attribute.
	 * @see #getRecoveryRate()
	 * @generated
	 */
	void setRecoveryRate(double value);

	/**
	 * Returns the value of the '<em><b>Incubation Rate</b></em>' attribute.
	 * The default value is <code>"0.0625"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incubation Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incubation Rate</em>' attribute.
	 * @see #setIncubationRate(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getMacdonaldRossDiseaseModel_IncubationRate()
	 * @model default="0.0625"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getIncubationRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.MacdonaldRossDiseaseModel#getIncubationRate <em>Incubation Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incubation Rate</em>' attribute.
	 * @see #getIncubationRate()
	 * @generated
	 */
	void setIncubationRate(double value);

	/**
	 * Returns the value of the '<em><b>Vector Incubation Rate</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vector Incubation Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector Incubation Rate</em>' attribute.
	 * @see #setVectorIncubationRate(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getMacdonaldRossDiseaseModel_VectorIncubationRate()
	 * @model default="0.1"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getVectorIncubationRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.MacdonaldRossDiseaseModel#getVectorIncubationRate <em>Vector Incubation Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector Incubation Rate</em>' attribute.
	 * @see #getVectorIncubationRate()
	 * @generated
	 */
	void setVectorIncubationRate(double value);

	/**
	 * Returns the value of the '<em><b>Immunity Loss Rate</b></em>' attribute.
	 * The default value is <code>"0.02"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Immunity Loss Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Immunity Loss Rate</em>' attribute.
	 * @see #setImmunityLossRate(double)
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#getMacdonaldRossDiseaseModel_ImmunityLossRate()
	 * @model default="0.02"
	 *        annotation="http:///org/eclipse/stem/modelgen/modelparam/constraints minValue='0'"
	 * @generated
	 */
	double getImmunityLossRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.vector.MacdonaldRossDiseaseModel#getImmunityLossRate <em>Immunity Loss Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immunity Loss Rate</em>' attribute.
	 * @see #getImmunityLossRate()
	 * @generated
	 */
	void setImmunityLossRate(double value);

}
