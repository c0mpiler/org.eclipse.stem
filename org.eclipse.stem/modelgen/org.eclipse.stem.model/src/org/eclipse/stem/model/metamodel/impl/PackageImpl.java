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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.stem.model.metamodel.CompartmentGroup;
import org.eclipse.stem.model.metamodel.MetamodelPackage;
import org.eclipse.stem.model.metamodel.Model;
import org.eclipse.stem.model.metamodel.PackageGenSettings;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.PackageImpl#getPackagePrefix <em>Package Prefix</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.PackageImpl#getModels <em>Models</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.PackageImpl#getCompartmentGroups <em>Compartment Groups</em>}</li>
 *   <li>{@link org.eclipse.stem.model.metamodel.impl.PackageImpl#getGeneratorSettings <em>Generator Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends EObjectImpl implements org.eclipse.stem.model.metamodel.Package {
	/**
	 * The default value of the '{@link #getPackagePrefix() <em>Package Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagePrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackagePrefix() <em>Package Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagePrefix()
	 * @generated
	 * @ordered
	 */
	protected String packagePrefix = PACKAGE_PREFIX_EDEFAULT;

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
	 * The cached value of the '{@link #getModels() <em>Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModels()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> models;

	/**
	 * The cached value of the '{@link #getCompartmentGroups() <em>Compartment Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartmentGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<CompartmentGroup> compartmentGroups;

	/**
	 * The cached value of the '{@link #getGeneratorSettings() <em>Generator Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratorSettings()
	 * @generated
	 * @ordered
	 */
	protected PackageGenSettings generatorSettings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackagePrefix() {
		return packagePrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackagePrefix(String newPackagePrefix) {
		String oldPackagePrefix = packagePrefix;
		packagePrefix = newPackagePrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.PACKAGE__PACKAGE_PREFIX, oldPackagePrefix, packagePrefix));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.PACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Model> getModels() {
		if (models == null) {
			models = new EObjectContainmentWithInverseEList<Model>(Model.class, this, MetamodelPackage.PACKAGE__MODELS, MetamodelPackage.MODEL__CONTAINER_PACKAGE);
		}
		return models;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompartmentGroup> getCompartmentGroups() {
		if (compartmentGroups == null) {
			compartmentGroups = new EObjectContainmentEList<CompartmentGroup>(CompartmentGroup.class, this, MetamodelPackage.PACKAGE__COMPARTMENT_GROUPS);
		}
		return compartmentGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageGenSettings getGeneratorSettings() {
		return generatorSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneratorSettings(PackageGenSettings newGeneratorSettings, NotificationChain msgs) {
		PackageGenSettings oldGeneratorSettings = generatorSettings;
		generatorSettings = newGeneratorSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodelPackage.PACKAGE__GENERATOR_SETTINGS, oldGeneratorSettings, newGeneratorSettings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratorSettings(PackageGenSettings newGeneratorSettings) {
		if (newGeneratorSettings != generatorSettings) {
			NotificationChain msgs = null;
			if (generatorSettings != null)
				msgs = ((InternalEObject)generatorSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.PACKAGE__GENERATOR_SETTINGS, null, msgs);
			if (newGeneratorSettings != null)
				msgs = ((InternalEObject)newGeneratorSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.PACKAGE__GENERATOR_SETTINGS, null, msgs);
			msgs = basicSetGeneratorSettings(newGeneratorSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.PACKAGE__GENERATOR_SETTINGS, newGeneratorSettings, newGeneratorSettings));
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
			case MetamodelPackage.PACKAGE__MODELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getModels()).basicAdd(otherEnd, msgs);
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
			case MetamodelPackage.PACKAGE__MODELS:
				return ((InternalEList<?>)getModels()).basicRemove(otherEnd, msgs);
			case MetamodelPackage.PACKAGE__COMPARTMENT_GROUPS:
				return ((InternalEList<?>)getCompartmentGroups()).basicRemove(otherEnd, msgs);
			case MetamodelPackage.PACKAGE__GENERATOR_SETTINGS:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodelPackage.PACKAGE__PACKAGE_PREFIX:
				return getPackagePrefix();
			case MetamodelPackage.PACKAGE__NAME:
				return getName();
			case MetamodelPackage.PACKAGE__MODELS:
				return getModels();
			case MetamodelPackage.PACKAGE__COMPARTMENT_GROUPS:
				return getCompartmentGroups();
			case MetamodelPackage.PACKAGE__GENERATOR_SETTINGS:
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
			case MetamodelPackage.PACKAGE__PACKAGE_PREFIX:
				setPackagePrefix((String)newValue);
				return;
			case MetamodelPackage.PACKAGE__NAME:
				setName((String)newValue);
				return;
			case MetamodelPackage.PACKAGE__MODELS:
				getModels().clear();
				getModels().addAll((Collection<? extends Model>)newValue);
				return;
			case MetamodelPackage.PACKAGE__COMPARTMENT_GROUPS:
				getCompartmentGroups().clear();
				getCompartmentGroups().addAll((Collection<? extends CompartmentGroup>)newValue);
				return;
			case MetamodelPackage.PACKAGE__GENERATOR_SETTINGS:
				setGeneratorSettings((PackageGenSettings)newValue);
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
			case MetamodelPackage.PACKAGE__PACKAGE_PREFIX:
				setPackagePrefix(PACKAGE_PREFIX_EDEFAULT);
				return;
			case MetamodelPackage.PACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MetamodelPackage.PACKAGE__MODELS:
				getModels().clear();
				return;
			case MetamodelPackage.PACKAGE__COMPARTMENT_GROUPS:
				getCompartmentGroups().clear();
				return;
			case MetamodelPackage.PACKAGE__GENERATOR_SETTINGS:
				setGeneratorSettings((PackageGenSettings)null);
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
			case MetamodelPackage.PACKAGE__PACKAGE_PREFIX:
				return PACKAGE_PREFIX_EDEFAULT == null ? packagePrefix != null : !PACKAGE_PREFIX_EDEFAULT.equals(packagePrefix);
			case MetamodelPackage.PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MetamodelPackage.PACKAGE__MODELS:
				return models != null && !models.isEmpty();
			case MetamodelPackage.PACKAGE__COMPARTMENT_GROUPS:
				return compartmentGroups != null && !compartmentGroups.isEmpty();
			case MetamodelPackage.PACKAGE__GENERATOR_SETTINGS:
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
		result.append(" (packagePrefix: ");
		result.append(packagePrefix);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PackageImpl
