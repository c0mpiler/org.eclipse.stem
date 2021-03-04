/**
 */
package org.eclipse.stem.model.ctdl.ctdl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.stem.model.metamodel.Model;
import org.eclipse.stem.model.metamodel.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodel Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.ctdl.ctdl.MetamodelResource#getPackage <em>Package</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.ctdl.MetamodelResource#getModel <em>Model</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.ctdl.MetamodelResource#getTransition <em>Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.model.ctdl.ctdl.CtdlPackage#getMetamodelResource()
 * @model
 * @generated
 */
public interface MetamodelResource extends EObject
{
  /**
   * Returns the value of the '<em><b>Package</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package</em>' reference.
   * @see #setPackage(org.eclipse.stem.model.metamodel.Package)
   * @see org.eclipse.stem.model.ctdl.ctdl.CtdlPackage#getMetamodelResource_Package()
   * @model
   * @generated
   */
  org.eclipse.stem.model.metamodel.Package getPackage();

  /**
   * Sets the value of the '{@link org.eclipse.stem.model.ctdl.ctdl.MetamodelResource#getPackage <em>Package</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package</em>' reference.
   * @see #getPackage()
   * @generated
   */
  void setPackage(org.eclipse.stem.model.metamodel.Package value);

  /**
   * Returns the value of the '<em><b>Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model</em>' reference.
   * @see #setModel(Model)
   * @see org.eclipse.stem.model.ctdl.ctdl.CtdlPackage#getMetamodelResource_Model()
   * @model
   * @generated
   */
  Model getModel();

  /**
   * Sets the value of the '{@link org.eclipse.stem.model.ctdl.ctdl.MetamodelResource#getModel <em>Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model</em>' reference.
   * @see #getModel()
   * @generated
   */
  void setModel(Model value);

  /**
   * Returns the value of the '<em><b>Transition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transition</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transition</em>' reference.
   * @see #setTransition(Transition)
   * @see org.eclipse.stem.model.ctdl.ctdl.CtdlPackage#getMetamodelResource_Transition()
   * @model
   * @generated
   */
  Transition getTransition();

  /**
   * Sets the value of the '{@link org.eclipse.stem.model.ctdl.ctdl.MetamodelResource#getTransition <em>Transition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transition</em>' reference.
   * @see #getTransition()
   * @generated
   */
  void setTransition(Transition value);

} // MetamodelResource
