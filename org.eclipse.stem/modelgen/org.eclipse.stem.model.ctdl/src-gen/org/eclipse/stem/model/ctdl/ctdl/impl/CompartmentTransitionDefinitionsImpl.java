/**
 */
package org.eclipse.stem.model.ctdl.ctdl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.stem.model.ctdl.ctdl.CompartmentTransitionDefinitions;
import org.eclipse.stem.model.ctdl.ctdl.CtdlPackage;
import org.eclipse.stem.model.ctdl.ctdl.MetamodelResource;
import org.eclipse.stem.model.ctdl.ctdl.TransitionBlock;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compartment Transition Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.ctdl.ctdl.impl.CompartmentTransitionDefinitionsImpl#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.ctdl.impl.CompartmentTransitionDefinitionsImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompartmentTransitionDefinitionsImpl extends MinimalEObjectImpl.Container implements CompartmentTransitionDefinitions
{
  /**
   * The cached value of the '{@link #getMetamodel() <em>Metamodel</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetamodel()
   * @generated
   * @ordered
   */
  protected MetamodelResource metamodel;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected TransitionBlock expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompartmentTransitionDefinitionsImpl()
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
    return CtdlPackage.Literals.COMPARTMENT_TRANSITION_DEFINITIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetamodelResource getMetamodel()
  {
    if (metamodel != null && metamodel.eIsProxy())
    {
      InternalEObject oldMetamodel = (InternalEObject)metamodel;
      metamodel = (MetamodelResource)eResolveProxy(oldMetamodel);
      if (metamodel != oldMetamodel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CtdlPackage.COMPARTMENT_TRANSITION_DEFINITIONS__METAMODEL, oldMetamodel, metamodel));
      }
    }
    return metamodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetamodelResource basicGetMetamodel()
  {
    return metamodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMetamodel(MetamodelResource newMetamodel)
  {
    MetamodelResource oldMetamodel = metamodel;
    metamodel = newMetamodel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CtdlPackage.COMPARTMENT_TRANSITION_DEFINITIONS__METAMODEL, oldMetamodel, metamodel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionBlock getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(TransitionBlock newExpression, NotificationChain msgs)
  {
    TransitionBlock oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CtdlPackage.COMPARTMENT_TRANSITION_DEFINITIONS__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(TransitionBlock newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CtdlPackage.COMPARTMENT_TRANSITION_DEFINITIONS__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CtdlPackage.COMPARTMENT_TRANSITION_DEFINITIONS__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CtdlPackage.COMPARTMENT_TRANSITION_DEFINITIONS__EXPRESSION, newExpression, newExpression));
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
      case CtdlPackage.COMPARTMENT_TRANSITION_DEFINITIONS__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case CtdlPackage.COMPARTMENT_TRANSITION_DEFINITIONS__METAMODEL:
        if (resolve) return getMetamodel();
        return basicGetMetamodel();
      case CtdlPackage.COMPARTMENT_TRANSITION_DEFINITIONS__EXPRESSION:
        return getExpression();
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
      case CtdlPackage.COMPARTMENT_TRANSITION_DEFINITIONS__METAMODEL:
        setMetamodel((MetamodelResource)newValue);
        return;
      case CtdlPackage.COMPARTMENT_TRANSITION_DEFINITIONS__EXPRESSION:
        setExpression((TransitionBlock)newValue);
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
      case CtdlPackage.COMPARTMENT_TRANSITION_DEFINITIONS__METAMODEL:
        setMetamodel((MetamodelResource)null);
        return;
      case CtdlPackage.COMPARTMENT_TRANSITION_DEFINITIONS__EXPRESSION:
        setExpression((TransitionBlock)null);
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
      case CtdlPackage.COMPARTMENT_TRANSITION_DEFINITIONS__METAMODEL:
        return metamodel != null;
      case CtdlPackage.COMPARTMENT_TRANSITION_DEFINITIONS__EXPRESSION:
        return expression != null;
    }
    return super.eIsSet(featureID);
  }

} //CompartmentTransitionDefinitionsImpl
