/**
 */
package org.eclipse.stem.model.ctdl.ctdl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.stem.model.ctdl.ctdl.CtdlPackage;
import org.eclipse.stem.model.ctdl.ctdl.MetamodelResource;

import org.eclipse.stem.model.metamodel.Model;
import org.eclipse.stem.model.metamodel.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metamodel Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.ctdl.ctdl.impl.MetamodelResourceImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.ctdl.impl.MetamodelResourceImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.eclipse.stem.model.ctdl.ctdl.impl.MetamodelResourceImpl#getTransition <em>Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetamodelResourceImpl extends MinimalEObjectImpl.Container implements MetamodelResource
{
  /**
   * The cached value of the '{@link #getPackage() <em>Package</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected org.eclipse.stem.model.metamodel.Package package_;

  /**
   * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModel()
   * @generated
   * @ordered
   */
  protected Model model;

  /**
   * The cached value of the '{@link #getTransition() <em>Transition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransition()
   * @generated
   * @ordered
   */
  protected Transition transition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MetamodelResourceImpl()
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
    return CtdlPackage.Literals.METAMODEL_RESOURCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.eclipse.stem.model.metamodel.Package getPackage()
  {
    if (package_ != null && package_.eIsProxy())
    {
      InternalEObject oldPackage = (InternalEObject)package_;
      package_ = (org.eclipse.stem.model.metamodel.Package)eResolveProxy(oldPackage);
      if (package_ != oldPackage)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CtdlPackage.METAMODEL_RESOURCE__PACKAGE, oldPackage, package_));
      }
    }
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.eclipse.stem.model.metamodel.Package basicGetPackage()
  {
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackage(org.eclipse.stem.model.metamodel.Package newPackage)
  {
    org.eclipse.stem.model.metamodel.Package oldPackage = package_;
    package_ = newPackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CtdlPackage.METAMODEL_RESOURCE__PACKAGE, oldPackage, package_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model getModel()
  {
    if (model != null && model.eIsProxy())
    {
      InternalEObject oldModel = (InternalEObject)model;
      model = (Model)eResolveProxy(oldModel);
      if (model != oldModel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CtdlPackage.METAMODEL_RESOURCE__MODEL, oldModel, model));
      }
    }
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model basicGetModel()
  {
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModel(Model newModel)
  {
    Model oldModel = model;
    model = newModel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CtdlPackage.METAMODEL_RESOURCE__MODEL, oldModel, model));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition getTransition()
  {
    if (transition != null && transition.eIsProxy())
    {
      InternalEObject oldTransition = (InternalEObject)transition;
      transition = (Transition)eResolveProxy(oldTransition);
      if (transition != oldTransition)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CtdlPackage.METAMODEL_RESOURCE__TRANSITION, oldTransition, transition));
      }
    }
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition basicGetTransition()
  {
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTransition(Transition newTransition)
  {
    Transition oldTransition = transition;
    transition = newTransition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CtdlPackage.METAMODEL_RESOURCE__TRANSITION, oldTransition, transition));
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
      case CtdlPackage.METAMODEL_RESOURCE__PACKAGE:
        if (resolve) return getPackage();
        return basicGetPackage();
      case CtdlPackage.METAMODEL_RESOURCE__MODEL:
        if (resolve) return getModel();
        return basicGetModel();
      case CtdlPackage.METAMODEL_RESOURCE__TRANSITION:
        if (resolve) return getTransition();
        return basicGetTransition();
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
      case CtdlPackage.METAMODEL_RESOURCE__PACKAGE:
        setPackage((org.eclipse.stem.model.metamodel.Package)newValue);
        return;
      case CtdlPackage.METAMODEL_RESOURCE__MODEL:
        setModel((Model)newValue);
        return;
      case CtdlPackage.METAMODEL_RESOURCE__TRANSITION:
        setTransition((Transition)newValue);
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
      case CtdlPackage.METAMODEL_RESOURCE__PACKAGE:
        setPackage((org.eclipse.stem.model.metamodel.Package)null);
        return;
      case CtdlPackage.METAMODEL_RESOURCE__MODEL:
        setModel((Model)null);
        return;
      case CtdlPackage.METAMODEL_RESOURCE__TRANSITION:
        setTransition((Transition)null);
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
      case CtdlPackage.METAMODEL_RESOURCE__PACKAGE:
        return package_ != null;
      case CtdlPackage.METAMODEL_RESOURCE__MODEL:
        return model != null;
      case CtdlPackage.METAMODEL_RESOURCE__TRANSITION:
        return transition != null;
    }
    return super.eIsSet(featureID);
  }

} //MetamodelResourceImpl
