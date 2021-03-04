/**
 */
package org.eclipse.stem.model.ctdl.ctdl;

import org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Function Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.ctdl.ctdl.ExternalFunctionReference#getFunc <em>Func</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.model.ctdl.ctdl.CtdlPackage#getExternalFunctionReference()
 * @model
 * @generated
 */
public interface ExternalFunctionReference extends FunctionReference
{
  /**
   * Returns the value of the '<em><b>Func</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Func</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Func</em>' reference.
   * @see #setFunc(ExternalFunctionDefinition)
   * @see org.eclipse.stem.model.ctdl.ctdl.CtdlPackage#getExternalFunctionReference_Func()
   * @model
   * @generated
   */
  ExternalFunctionDefinition getFunc();

  /**
   * Sets the value of the '{@link org.eclipse.stem.model.ctdl.ctdl.ExternalFunctionReference#getFunc <em>Func</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Func</em>' reference.
   * @see #getFunc()
   * @generated
   */
  void setFunc(ExternalFunctionDefinition value);

} // ExternalFunctionReference
