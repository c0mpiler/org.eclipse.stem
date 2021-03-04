/**
 */
package org.eclipse.stem.model.ctdl.ctdl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.stem.model.ctdl.ctdl.Block;
import org.eclipse.stem.model.ctdl.ctdl.CtdlPackage;
import org.eclipse.stem.model.ctdl.ctdl.DefStatement;
import org.eclipse.stem.model.ctdl.ctdl.ReturnStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.ctdl.ctdl.impl.BlockImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.ctdl.impl.BlockImpl#getRet <em>Ret</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlockImpl extends MinimalEObjectImpl.Container implements Block
{
  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<DefStatement> statements;

  /**
   * The cached value of the '{@link #getRet() <em>Ret</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRet()
   * @generated
   * @ordered
   */
  protected ReturnStatement ret;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BlockImpl()
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
    return CtdlPackage.Literals.BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DefStatement> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList<DefStatement>(DefStatement.class, this, CtdlPackage.BLOCK__STATEMENTS);
    }
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnStatement getRet()
  {
    return ret;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRet(ReturnStatement newRet, NotificationChain msgs)
  {
    ReturnStatement oldRet = ret;
    ret = newRet;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CtdlPackage.BLOCK__RET, oldRet, newRet);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRet(ReturnStatement newRet)
  {
    if (newRet != ret)
    {
      NotificationChain msgs = null;
      if (ret != null)
        msgs = ((InternalEObject)ret).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CtdlPackage.BLOCK__RET, null, msgs);
      if (newRet != null)
        msgs = ((InternalEObject)newRet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CtdlPackage.BLOCK__RET, null, msgs);
      msgs = basicSetRet(newRet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CtdlPackage.BLOCK__RET, newRet, newRet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CtdlPackage.BLOCK__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
      case CtdlPackage.BLOCK__RET:
        return basicSetRet(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case CtdlPackage.BLOCK__STATEMENTS:
        return getStatements();
      case CtdlPackage.BLOCK__RET:
        return getRet();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CtdlPackage.BLOCK__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends DefStatement>)newValue);
        return;
      case CtdlPackage.BLOCK__RET:
        setRet((ReturnStatement)newValue);
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
      case CtdlPackage.BLOCK__STATEMENTS:
        getStatements().clear();
        return;
      case CtdlPackage.BLOCK__RET:
        setRet((ReturnStatement)null);
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
      case CtdlPackage.BLOCK__STATEMENTS:
        return statements != null && !statements.isEmpty();
      case CtdlPackage.BLOCK__RET:
        return ret != null;
    }
    return super.eIsSet(featureID);
  }

} //BlockImpl
