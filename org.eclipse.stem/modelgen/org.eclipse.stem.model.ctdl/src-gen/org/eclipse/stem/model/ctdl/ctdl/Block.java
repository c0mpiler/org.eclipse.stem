/**
 */
package org.eclipse.stem.model.ctdl.ctdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.ctdl.ctdl.Block#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.ctdl.Block#getRet <em>Ret</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.model.ctdl.ctdl.CtdlPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends EObject
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.stem.model.ctdl.ctdl.DefStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.eclipse.stem.model.ctdl.ctdl.CtdlPackage#getBlock_Statements()
   * @model containment="true"
   * @generated
   */
  EList<DefStatement> getStatements();

  /**
   * Returns the value of the '<em><b>Ret</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ret</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ret</em>' containment reference.
   * @see #setRet(ReturnStatement)
   * @see org.eclipse.stem.model.ctdl.ctdl.CtdlPackage#getBlock_Ret()
   * @model containment="true"
   * @generated
   */
  ReturnStatement getRet();

  /**
   * Sets the value of the '{@link org.eclipse.stem.model.ctdl.ctdl.Block#getRet <em>Ret</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ret</em>' containment reference.
   * @see #getRet()
   * @generated
   */
  void setRet(ReturnStatement value);

} // Block
