/**
 */
package org.eclipse.stem.model.ctdl.ctdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartment Transition Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.ctdl.ctdl.CompartmentTransitionDefinitions#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.ctdl.CompartmentTransitionDefinitions#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.model.ctdl.ctdl.CtdlPackage#getCompartmentTransitionDefinitions()
 * @model
 * @generated
 */
public interface CompartmentTransitionDefinitions extends EObject
{
  /**
   * Returns the value of the '<em><b>Metamodel</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metamodel</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metamodel</em>' reference.
   * @see #setMetamodel(MetamodelResource)
   * @see org.eclipse.stem.model.ctdl.ctdl.CtdlPackage#getCompartmentTransitionDefinitions_Metamodel()
   * @model
   * @generated
   */
  MetamodelResource getMetamodel();

  /**
   * Sets the value of the '{@link org.eclipse.stem.model.ctdl.ctdl.CompartmentTransitionDefinitions#getMetamodel <em>Metamodel</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Metamodel</em>' reference.
   * @see #getMetamodel()
   * @generated
   */
  void setMetamodel(MetamodelResource value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(TransitionBlock)
   * @see org.eclipse.stem.model.ctdl.ctdl.CtdlPackage#getCompartmentTransitionDefinitions_Expression()
   * @model containment="true"
   * @generated
   */
  TransitionBlock getExpression();

  /**
   * Sets the value of the '{@link org.eclipse.stem.model.ctdl.ctdl.CompartmentTransitionDefinitions#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(TransitionBlock value);

} // CompartmentTransitionDefinitions
