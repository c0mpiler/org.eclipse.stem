/**
 */
package org.eclipse.stem.model.ctdl.ctdl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.stem.model.ctdl.ctdl.CtdlPackage;
import org.eclipse.stem.model.ctdl.ctdl.ExternalFunctionReference;

import org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Function Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.ctdl.ctdl.impl.ExternalFunctionReferenceImpl#getFunc <em>Func</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalFunctionReferenceImpl extends FunctionReferenceImpl implements ExternalFunctionReference
{
  /**
   * The cached value of the '{@link #getFunc() <em>Func</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunc()
   * @generated
   * @ordered
   */
  protected ExternalFunctionDefinition func;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExternalFunctionReferenceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CtdlPackage.Literals.EXTERNAL_FUNCTION_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalFunctionDefinition getFunc()
  {
    if (func != null && func.eIsProxy())
    {
      InternalEObject oldFunc = (InternalEObject)func;
      func = (ExternalFunctionDefinition)eResolveProxy(oldFunc);
      if (func != oldFunc)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CtdlPackage.EXTERNAL_FUNCTION_REFERENCE__FUNC, oldFunc, func));
      }
    }
    return func;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalFunctionDefinition basicGetFunc()
  {
    return func;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunc(ExternalFunctionDefinition newFunc)
  {
    ExternalFunctionDefinition oldFunc = func;
    func = newFunc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CtdlPackage.EXTERNAL_FUNCTION_REFERENCE__FUNC, oldFunc, func));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CtdlPackage.EXTERNAL_FUNCTION_REFERENCE__FUNC:
        if (resolve) return getFunc();
        return basicGetFunc();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CtdlPackage.EXTERNAL_FUNCTION_REFERENCE__FUNC:
        setFunc((ExternalFunctionDefinition)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CtdlPackage.EXTERNAL_FUNCTION_REFERENCE__FUNC:
        setFunc((ExternalFunctionDefinition)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CtdlPackage.EXTERNAL_FUNCTION_REFERENCE__FUNC:
        return func != null;
    }
    return super.eIsSet(featureID);
  }

} //ExternalFunctionReferenceImpl
