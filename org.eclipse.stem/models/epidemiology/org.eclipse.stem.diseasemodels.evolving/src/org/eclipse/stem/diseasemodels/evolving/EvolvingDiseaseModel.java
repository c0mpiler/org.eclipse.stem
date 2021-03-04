/**
 */
package org.eclipse.stem.diseasemodels.evolving;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disease Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseModel#getParentDisease <em>Parent Disease</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseModel#getTransformer <em>Transformer</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseModel#getEvolvedAt <em>Evolved At</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseModel#getGenome <em>Genome</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseModel#getEvolutionCount <em>Evolution Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingPackage#getEvolvingDiseaseModel()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface EvolvingDiseaseModel extends EObject {

	/**
	 * Returns the value of the '<em><b>Parent Disease</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Disease</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Disease</em>' reference.
	 * @see #setParentDisease(EvolvingDiseaseModel)
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingPackage#getEvolvingDiseaseModel_ParentDisease()
	 * @model transient="true"
	 * @generated
	 */
	EvolvingDiseaseModel getParentDisease();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseModel#getParentDisease <em>Parent Disease</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Disease</em>' reference.
	 * @see #getParentDisease()
	 * @generated
	 */
	void setParentDisease(EvolvingDiseaseModel value);

	/**
	 * Returns the value of the '<em><b>Transformer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer</em>' reference.
	 * @see #setTransformer(EvolvingDiseaseTransformer)
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingPackage#getEvolvingDiseaseModel_Transformer()
	 * @model transient="true"
	 * @generated
	 */
	EvolvingDiseaseTransformer getTransformer();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseModel#getTransformer <em>Transformer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer</em>' reference.
	 * @see #getTransformer()
	 * @generated
	 */
	void setTransformer(EvolvingDiseaseTransformer value);

	/**
	 * Returns the value of the '<em><b>Evolved At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evolved At</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evolved At</em>' reference.
	 * @see #setEvolvedAt(DiseaseModelLabel)
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingPackage#getEvolvingDiseaseModel_EvolvedAt()
	 * @model transient="true"
	 * @generated
	 */
	DiseaseModelLabel getEvolvedAt();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseModel#getEvolvedAt <em>Evolved At</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evolved At</em>' reference.
	 * @see #getEvolvedAt()
	 * @generated
	 */
	void setEvolvedAt(DiseaseModelLabel value);

	/**
	 * Returns the value of the '<em><b>Evolution Count</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evolution Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evolution Count</em>' attribute.
	 * @see #setEvolutionCount(int)
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingPackage#getEvolvingDiseaseModel_EvolutionCount()
	 * @model default="0" transient="true"
	 * @generated
	 */
	int getEvolutionCount();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseModel#getEvolutionCount <em>Evolution Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evolution Count</em>' attribute.
	 * @see #getEvolutionCount()
	 * @generated
	 */
	void setEvolutionCount(int value);

	/**
	 * Returns the value of the '<em><b>Genome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Genome</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genome</em>' attribute.
	 * @see #setGenome(boolean[])
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingPackage#getEvolvingDiseaseModel_Genome()
	 * @model dataType="org.eclipse.stem.diseasemodels.evolving.BooleanArray" transient="true" derived="true"
	 * @generated
	 */
	boolean[] getGenome();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseModel#getGenome <em>Genome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genome</em>' attribute.
	 * @see #getGenome()
	 * @generated
	 */
	void setGenome(boolean[] value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EvolvingDiseaseModel evolve(DiseaseModelLabel label);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void calculateEvolvedInitialState();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double getGeneticDistance(EvolvingDiseaseModel otherDiseaseStrain);
} // EvolvingDiseaseModel
