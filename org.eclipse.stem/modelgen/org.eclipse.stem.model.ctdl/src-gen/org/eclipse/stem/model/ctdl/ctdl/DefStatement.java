/**
 */
package org.eclipse.stem.model.ctdl.ctdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Def Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.ctdl.ctdl.DefStatement#getVarname <em>Varname</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.ctdl.DefStatement#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.model.ctdl.ctdl.CtdlPackage#getDefStatement()
 * @model
 * @generated
 */
public interface DefStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Varname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Varname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Varname</em>' attribute.
   * @see #setVarname(String)
   * @see org.eclipse.stem.model.ctdl.ctdl.CtdlPackage#getDefStatement_Varname()
   * @model
   * @generated
   */
  String getVarname();

  /**
   * Sets the value of the '{@link org.eclipse.stem.model.ctdl.ctdl.DefStatement#getVarname <em>Varname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Varname</em>' attribute.
   * @see #getVarname()
   * @generated
   */
  void setVarname(String value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Evaluation)
   * @see org.eclipse.stem.model.ctdl.ctdl.CtdlPackage#getDefStatement_Expr()
   * @model containment="true"
   * @generated
   */
  Evaluation getExpr();

  /**
   * Sets the value of the '{@link org.eclipse.stem.model.ctdl.ctdl.DefStatement#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Evaluation value);

} // DefStatement
