/*******************************************************************************
 * Copyright (c) 2012 Bundesinstitut für Risikobewertung and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *     Bundesinstitut für Risikobewertung - initial API and implementation
 *******************************************************************************/
package org.eclipse.stem.model.metamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.stem.model.metamodel.AuthorDetails;
import org.eclipse.stem.model.metamodel.CompartmentGroup;
import org.eclipse.stem.model.metamodel.MetamodelPackage;
import org.eclipse.stem.model.metamodel.Model;
import org.eclipse.stem.model.metamodel.ModelGenSettings;
import org.eclipse.stem.model.metamodel.ModelParam;
import org.eclipse.stem.model.metamodel.ModelType;
import org.eclipse.stem.model.metamodel.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.ModelImpl#getModelType <em>Model Type</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.ModelImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.ModelImpl#getParentModel <em>Parent Model</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.ModelImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.ModelImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.ModelImpl#getCompartments <em>Compartments</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.ModelImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.ModelImpl#getContainerPackage <em>Container Package</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.ModelImpl#getGeneratorSettings <em>Generator Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends EObjectImpl implements Model {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelType() <em>Model Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelType()
	 * @generated
	 * @ordered
	 */
	protected static final ModelType MODEL_TYPE_EDEFAULT = ModelType.DISEASE_MODEL;

	/**
	 * The cached value of the '{@link #getModelType() <em>Model Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelType()
	 * @generated
	 * @ordered
	 */
	protected ModelType modelType = MODEL_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected EClass class_;

	/**
	 * The cached value of the '{@link #getParentModel() <em>Parent Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentModel()
	 * @generated
	 * @ordered
	 */
	protected Model parentModel;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelParam> parameters;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getCompartments() <em>Compartments</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartments()
	 * @generated
	 * @ordered
	 */
	protected CompartmentGroup compartments;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected AuthorDetails author;

	/**
	 * The cached value of the '{@link #getGeneratorSettings() <em>Generator Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratorSettings()
	 * @generated
	 * @ordered
	 */
	protected ModelGenSettings generatorSettings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelType getModelType() {
		return modelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelType(ModelType newModelType) {
		ModelType oldModelType = modelType;
		modelType = newModelType == null ? MODEL_TYPE_EDEFAULT : newModelType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MODEL__MODEL_TYPE, oldModelType, modelType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		if (class_ != null && class_.eIsProxy()) {
			InternalEObject oldClass = (InternalEObject)class_;
			class_ = (EClass)eResolveProxy(oldClass);
			if (class_ != oldClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.MODEL__CLASS, oldClass, class_));
			}
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetClass() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(EClass newClass) {
		EClass oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MODEL__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getParentModel() {
		if (parentModel != null && parentModel.eIsProxy()) {
			InternalEObject oldParentModel = (InternalEObject)parentModel;
			parentModel = (Model)eResolveProxy(oldParentModel);
			if (parentModel != oldParentModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.MODEL__PARENT_MODEL, oldParentModel, parentModel));
			}
		}
		return parentModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetParentModel() {
		return parentModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentModel(Model newParentModel) {
		Model oldParentModel = parentModel;
		parentModel = newParentModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MODEL__PARENT_MODEL, oldParentModel, parentModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelParam> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentWithInverseEList<ModelParam>(ModelParam.class, this, MetamodelPackage.MODEL__PARAMETERS, MetamodelPackage.MODEL_PARAM__CONTAINER_MODEL);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this, MetamodelPackage.MODEL__TRANSITIONS, MetamodelPackage.TRANSITION__CONTAINER_MODEL);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentGroup getCompartments() {
		if (compartments != null && compartments.eIsProxy()) {
			InternalEObject oldCompartments = (InternalEObject)compartments;
			compartments = (CompartmentGroup)eResolveProxy(oldCompartments);
			if (compartments != oldCompartments) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.MODEL__COMPARTMENTS, oldCompartments, compartments));
			}
		}
		return compartments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentGroup basicGetCompartments() {
		return compartments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompartments(CompartmentGroup newCompartments) {
		CompartmentGroup oldCompartments = compartments;
		compartments = newCompartments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MODEL__COMPARTMENTS, oldCompartments, compartments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorDetails getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(AuthorDetails newAuthor, NotificationChain msgs) {
		AuthorDetails oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodelPackage.MODEL__AUTHOR, oldAuthor, newAuthor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(AuthorDetails newAuthor) {
		if (newAuthor != author) {
			NotificationChain msgs = null;
			if (author != null)
				msgs = ((InternalEObject)author).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.MODEL__AUTHOR, null, msgs);
			if (newAuthor != null)
				msgs = ((InternalEObject)newAuthor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.MODEL__AUTHOR, null, msgs);
			msgs = basicSetAuthor(newAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MODEL__AUTHOR, newAuthor, newAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.stem.model.metamodel.Package getContainerPackage() {
		if (eContainerFeatureID() != MetamodelPackage.MODEL__CONTAINER_PACKAGE) return null;
		return (org.eclipse.stem.model.metamodel.Package)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelGenSettings getGeneratorSettings() {
		return generatorSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneratorSettings(ModelGenSettings newGeneratorSettings, NotificationChain msgs) {
		ModelGenSettings oldGeneratorSettings = generatorSettings;
		generatorSettings = newGeneratorSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodelPackage.MODEL__GENERATOR_SETTINGS, oldGeneratorSettings, newGeneratorSettings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratorSettings(ModelGenSettings newGeneratorSettings) {
		if (newGeneratorSettings != generatorSettings) {
			NotificationChain msgs = null;
			if (generatorSettings != null)
				msgs = ((InternalEObject)generatorSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.MODEL__GENERATOR_SETTINGS, null, msgs);
			if (newGeneratorSettings != null)
				msgs = ((InternalEObject)newGeneratorSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.MODEL__GENERATOR_SETTINGS, null, msgs);
			msgs = basicSetGeneratorSettings(newGeneratorSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MODEL__GENERATOR_SETTINGS, newGeneratorSettings, newGeneratorSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodelPackage.MODEL__PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameters()).basicAdd(otherEnd, msgs);
			case MetamodelPackage.MODEL__TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransitions()).basicAdd(otherEnd, msgs);
			case MetamodelPackage.MODEL__CONTAINER_PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, MetamodelPackage.MODEL__CONTAINER_PACKAGE, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodelPackage.MODEL__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case MetamodelPackage.MODEL__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case MetamodelPackage.MODEL__AUTHOR:
				return basicSetAuthor(null, msgs);
			case MetamodelPackage.MODEL__CONTAINER_PACKAGE:
				return eBasicSetContainer(null, MetamodelPackage.MODEL__CONTAINER_PACKAGE, msgs);
			case MetamodelPackage.MODEL__GENERATOR_SETTINGS:
				return basicSetGeneratorSettings(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MetamodelPackage.MODEL__CONTAINER_PACKAGE:
				return eInternalContainer().eInverseRemove(this, MetamodelPackage.PACKAGE__MODELS, org.eclipse.stem.model.metamodel.Package.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodelPackage.MODEL__NAME:
				return getName();
			case MetamodelPackage.MODEL__MODEL_TYPE:
				return getModelType();
			case MetamodelPackage.MODEL__CLASS:
				if (resolve) return getClass_();
				return basicGetClass();
			case MetamodelPackage.MODEL__PARENT_MODEL:
				if (resolve) return getParentModel();
				return basicGetParentModel();
			case MetamodelPackage.MODEL__PARAMETERS:
				return getParameters();
			case MetamodelPackage.MODEL__TRANSITIONS:
				return getTransitions();
			case MetamodelPackage.MODEL__COMPARTMENTS:
				if (resolve) return getCompartments();
				return basicGetCompartments();
			case MetamodelPackage.MODEL__AUTHOR:
				return getAuthor();
			case MetamodelPackage.MODEL__CONTAINER_PACKAGE:
				return getContainerPackage();
			case MetamodelPackage.MODEL__GENERATOR_SETTINGS:
				return getGeneratorSettings();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetamodelPackage.MODEL__NAME:
				setName((String)newValue);
				return;
			case MetamodelPackage.MODEL__MODEL_TYPE:
				setModelType((ModelType)newValue);
				return;
			case MetamodelPackage.MODEL__CLASS:
				setClass((EClass)newValue);
				return;
			case MetamodelPackage.MODEL__PARENT_MODEL:
				setParentModel((Model)newValue);
				return;
			case MetamodelPackage.MODEL__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends ModelParam>)newValue);
				return;
			case MetamodelPackage.MODEL__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case MetamodelPackage.MODEL__COMPARTMENTS:
				setCompartments((CompartmentGroup)newValue);
				return;
			case MetamodelPackage.MODEL__AUTHOR:
				setAuthor((AuthorDetails)newValue);
				return;
			case MetamodelPackage.MODEL__GENERATOR_SETTINGS:
				setGeneratorSettings((ModelGenSettings)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case MetamodelPackage.MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MetamodelPackage.MODEL__MODEL_TYPE:
				setModelType(MODEL_TYPE_EDEFAULT);
				return;
			case MetamodelPackage.MODEL__CLASS:
				setClass((EClass)null);
				return;
			case MetamodelPackage.MODEL__PARENT_MODEL:
				setParentModel((Model)null);
				return;
			case MetamodelPackage.MODEL__PARAMETERS:
				getParameters().clear();
				return;
			case MetamodelPackage.MODEL__TRANSITIONS:
				getTransitions().clear();
				return;
			case MetamodelPackage.MODEL__COMPARTMENTS:
				setCompartments((CompartmentGroup)null);
				return;
			case MetamodelPackage.MODEL__AUTHOR:
				setAuthor((AuthorDetails)null);
				return;
			case MetamodelPackage.MODEL__GENERATOR_SETTINGS:
				setGeneratorSettings((ModelGenSettings)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MetamodelPackage.MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MetamodelPackage.MODEL__MODEL_TYPE:
				return modelType != MODEL_TYPE_EDEFAULT;
			case MetamodelPackage.MODEL__CLASS:
				return class_ != null;
			case MetamodelPackage.MODEL__PARENT_MODEL:
				return parentModel != null;
			case MetamodelPackage.MODEL__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case MetamodelPackage.MODEL__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case MetamodelPackage.MODEL__COMPARTMENTS:
				return compartments != null;
			case MetamodelPackage.MODEL__AUTHOR:
				return author != null;
			case MetamodelPackage.MODEL__CONTAINER_PACKAGE:
				return getContainerPackage() != null;
			case MetamodelPackage.MODEL__GENERATOR_SETTINGS:
				return generatorSettings != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", modelType: ");
		result.append(modelType);
		result.append(')');
		return result.toString();
	}

} //ModelImpl
