/**
 */
package org.eclipse.stem.model.ctdl.ctdl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.stem.model.ctdl.ctdl.CompartmentReference;
import org.eclipse.stem.model.ctdl.ctdl.CtdlPackage;

import org.eclipse.stem.model.metamodel.Compartment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compartment Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.ctdl.ctdl.impl.CompartmentReferenceImpl#getObj <em>Obj</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompartmentReferenceImpl extends ScopedVariableReferenceImpl implements CompartmentReference
{
  /**
   * The cached value of the '{@link #getObj() <em>Obj</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObj()
   * @generated
   * @ordered
   */
  protected Compartment obj;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompartmentReferenceImpl()
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
    return CtdlPackage.Literals.COMPARTMENT_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Compartment getObj()
  {
    if (obj != null && obj.eIsProxy())
    {
      InternalEObject oldObj = (InternalEObject)obj;
      obj = (Compartment)eResolveProxy(oldObj);
      if (obj != oldObj)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CtdlPackage.COMPARTMENT_REFERENCE__OBJ, oldObj, obj));
      }
    }
    return obj;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Compartment basicGetObj()
  {
    return obj;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObj(Compartment newObj)
  {
    Compartment oldObj = obj;
    obj = newObj;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CtdlPackage.COMPARTMENT_REFERENCE__OBJ, oldObj, obj));
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
      case CtdlPackage.COMPARTMENT_REFERENCE__OBJ:
        if (resolve) return getObj();
        return basicGetObj();
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
      case CtdlPackage.COMPARTMENT_REFERENCE__OBJ:
        setObj((Compartment)newValue);
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
      case CtdlPackage.COMPARTMENT_REFERENCE__OBJ:
        setObj((Compartment)null);
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
      case CtdlPackage.COMPARTMENT_REFERENCE__OBJ:
        return obj != null;
    }
    return super.eIsSet(featureID);
  }

} //CompartmentReferenceImpl
