/**
 */
package org.eclipse.stem.model.ctdl.ctdl;

import org.eclipse.stem.model.metamodel.ModelParam;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Param Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.ctdl.ctdl.ModelParamReference#getObj <em>Obj</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.model.ctdl.ctdl.CtdlPackage#getModelParamReference()
 * @model
 * @generated
 */
public interface ModelParamReference extends ScopedVariableReference
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
   * @see #setObj(ModelParam)
   * @see org.eclipse.stem.model.ctdl.ctdl.CtdlPackage#getModelParamReference_Obj()
   * @model
   * @generated
   */
  ModelParam getObj();

  /**
   * Sets the value of the '{@link org.eclipse.stem.model.ctdl.ctdl.ModelParamReference#getObj <em>Obj</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Obj</em>' reference.
   * @see #getObj()
   * @generated
   */
  void setObj(ModelParam value);

} // ModelParamReference
