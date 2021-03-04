/**
 */
package org.eclipse.stem.model.ctdl.ctdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.ctdl.ctdl.VariableReference#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.model.ctdl.ctdl.CtdlPackage#getVariableReference()
 * @model
 * @generated
 */
public interface VariableReference extends Expression
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(ScopedVariableReference)
   * @see org.eclipse.stem.model.ctdl.ctdl.CtdlPackage#getVariableReference_Ref()
   * @model
   * @generated
   */
  ScopedVariableReference getRef();

  /**
   * Sets the value of the '{@link org.eclipse.stem.model.ctdl.ctdl.VariableReference#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(ScopedVariableReference value);

} // VariableReference
