/**
 */
package org.eclipse.stem.model.ctdl.ctdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.ctdl.ctdl.PrimaryExpression#isNegate <em>Negate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.model.ctdl.ctdl.CtdlPackage#getPrimaryExpression()
 * @model
 * @generated
 */
public interface PrimaryExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Negate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Negate</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Negate</em>' attribute.
   * @see #setNegate(boolean)
   * @see org.eclipse.stem.model.ctdl.ctdl.CtdlPackage#getPrimaryExpression_Negate()
   * @model
   * @generated
   */
  boolean isNegate();

  /**
   * Sets the value of the '{@link org.eclipse.stem.model.ctdl.ctdl.PrimaryExpression#isNegate <em>Negate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Negate</em>' attribute.
   * @see #isNegate()
   * @generated
   */
  void setNegate(boolean value);

} // PrimaryExpression
