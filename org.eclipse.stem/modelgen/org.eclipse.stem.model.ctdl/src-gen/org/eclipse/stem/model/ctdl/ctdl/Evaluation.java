/**
 */
package org.eclipse.stem.model.ctdl.ctdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.ctdl.ctdl.Evaluation#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.model.ctdl.ctdl.CtdlPackage#getEvaluation()
 * @model
 * @generated
 */
public interface Evaluation extends ReturnStatement
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.eclipse.stem.model.ctdl.ctdl.CtdlPackage#getEvaluation_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.eclipse.stem.model.ctdl.ctdl.Evaluation#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // Evaluation