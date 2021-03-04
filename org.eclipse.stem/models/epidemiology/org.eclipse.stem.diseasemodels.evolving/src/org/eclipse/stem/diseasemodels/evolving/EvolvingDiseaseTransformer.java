/**
 */
package org.eclipse.stem.diseasemodels.evolving;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.model.TransformationDecorator;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disease Transformer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseTransformer#getBaseDisease <em>Base Disease</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseTransformer#getEvolvedDiseases <em>Evolved Diseases</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseTransformer#getEvolutionCount <em>Evolution Count</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseTransformer#getEvolutionCountHardLimit <em>Evolution Count Hard Limit</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseTransformer#isStopAllEvolution <em>Stop All Evolution</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingPackage#getEvolvingDiseaseTransformer()
 * @model
 * @generated
 */
public interface EvolvingDiseaseTransformer extends TransformationDecorator {

    /**
     * This is the top-level segment for all type URI's for labels.
     * @generated NOT
     */
    String URI_TYPE_TRANSFORMER_SEGMENT = "transformer";

    /**
     * This is the type URI for a Label
     * @generated NOT
     */
    URI URI_TYPE_TRANSFORMER = STEMURI.createTypeURI(URI_TYPE_TRANSFORMER_SEGMENT);
    
    
	/**
	 * Returns the value of the '<em><b>Base Disease</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Disease</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Disease</em>' reference.
	 * @see #setBaseDisease(DiseaseModel)
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingPackage#getEvolvingDiseaseTransformer_BaseDisease()
	 * @model required="true"
	 * @generated
	 */
	DiseaseModel getBaseDisease();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseTransformer#getBaseDisease <em>Base Disease</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Disease</em>' reference.
	 * @see #getBaseDisease()
	 * @generated
	 */
	void setBaseDisease(DiseaseModel value);

	/**
	 * Returns the value of the '<em><b>Evolved Diseases</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.stem.diseasemodels.standard.DiseaseModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evolved Diseases</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evolved Diseases</em>' reference list.
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingPackage#getEvolvingDiseaseTransformer_EvolvedDiseases()
	 * @model transient="true"
	 * @generated
	 */
	EList<DiseaseModel> getEvolvedDiseases();

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
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingPackage#getEvolvingDiseaseTransformer_EvolutionCount()
	 * @model default="0"
	 * @generated
	 */
	int getEvolutionCount();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseTransformer#getEvolutionCount <em>Evolution Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evolution Count</em>' attribute.
	 * @see #getEvolutionCount()
	 * @generated
	 */
	void setEvolutionCount(int value);

	/**
	 * Returns the value of the '<em><b>Evolution Count Hard Limit</b></em>' attribute.
	 * The default value is <code>"256"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evolution Count Hard Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evolution Count Hard Limit</em>' attribute.
	 * @see #setEvolutionCountHardLimit(int)
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingPackage#getEvolvingDiseaseTransformer_EvolutionCountHardLimit()
	 * @model default="256"
	 * @generated
	 */
	int getEvolutionCountHardLimit();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseTransformer#getEvolutionCountHardLimit <em>Evolution Count Hard Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evolution Count Hard Limit</em>' attribute.
	 * @see #getEvolutionCountHardLimit()
	 * @generated
	 */
	void setEvolutionCountHardLimit(int value);

	/**
	 * Returns the value of the '<em><b>Stop All Evolution</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop All Evolution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop All Evolution</em>' attribute.
	 * @see #setStopAllEvolution(boolean)
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingPackage#getEvolvingDiseaseTransformer_StopAllEvolution()
	 * @model default="false" transient="true"
	 * @generated
	 */
	boolean isStopAllEvolution();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseTransformer#isStopAllEvolution <em>Stop All Evolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop All Evolution</em>' attribute.
	 * @see #isStopAllEvolution()
	 * @generated
	 */
	void setStopAllEvolution(boolean value);
} // EvolvingDiseaseTransformer
