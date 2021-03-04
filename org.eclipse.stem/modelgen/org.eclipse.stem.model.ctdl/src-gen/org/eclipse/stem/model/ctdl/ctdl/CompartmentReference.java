/**
 */
package org.eclipse.stem.model.ctdl.ctdl;

import org.eclipse.stem.model.metamodel.Compartment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartment Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.ctdl.ctdl.CompartmentReference#getObj <em>Obj</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.model.ctdl.ctdl.CtdlPackage#getCompartmentReference()
 * @model
 * @generated
 */
public interface CompartmentReference extends ScopedVariableReference
{
  /**
   * Returns the value of the '<em><b>Obj</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Obj</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Obj</em>' reference.
   * @see #setObj(Compartment)
   * @see org.eclipse.stem.model.ctdl.ctdl.CtdlPackage#getCompartmentReference_Obj()
   * @model
   * @generated
   */
  Compartment getObj();

  /**
   * Sets the value of the '{@link org.eclipse.stem.model.ctdl.ctdl.CompartmentReference#getObj <em>Obj</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Obj</em>' reference.
   * @see #getObj()
   * @generated
   */
  void setObj(Compartment value);

} // CompartmentReference
