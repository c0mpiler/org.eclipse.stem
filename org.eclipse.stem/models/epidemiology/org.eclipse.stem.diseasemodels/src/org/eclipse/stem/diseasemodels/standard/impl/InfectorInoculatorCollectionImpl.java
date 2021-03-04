/*******************************************************************************
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation and new features
 *     Bundesinstitut für Risikobewertung - Pajek Graph interface, new Veterinary Models
 *******************************************************************************/
package org.eclipse.stem.diseasemodels.standard.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.model.impl.NodeDecoratorImpl;
import org.eclipse.stem.core.scenario.ScenarioInitializationException;
import org.eclipse.stem.diseasemodels.standard.Infector;
import org.eclipse.stem.diseasemodels.standard.InfectorInoculatorCollection;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infector Inoculator Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.impl.InfectorInoculatorCollectionImpl#getList <em>List</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.impl.InfectorInoculatorCollectionImpl#getImportFolder <em>Import Folder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfectorInoculatorCollectionImpl extends NodeDecoratorImpl implements InfectorInoculatorCollection {
	/**
	 * The cached value of the '{@link #getList() <em>List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getList()
	 * @generated
	 * @ordered
	 */
	protected EList<Infector> list;

	/**
	 * The default value of the '{@link #getImportFolder() <em>Import Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORT_FOLDER_EDEFAULT = ""; //$NON-NLS-1$
	/**
	 * The cached value of the '{@link #getImportFolder() <em>Import Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportFolder()
	 * @generated
	 * @ordered
	 */
	protected String importFolder = IMPORT_FOLDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfectorInoculatorCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.INFECTOR_INOCULATOR_COLLECTION;
	}

	/**
	 * @see org.eclipse.stem.core.model.impl.DecoratorImpl#decorateGraph(org.eclipse.stem.core.graph.Graph)
	 */
	@Override
	public void decorateGraph(STEMTime time) throws ScenarioInitializationException {
		if(this.isGraphDecorated()) return;
		boolean success = true;
		if(this.getList() != null)
			for(Infector i:this.getList())
				i.decorateGraph(time);
	}
	
	/**
	 * @see org.eclipse.stem.core.model.impl.DecoratorImpl#resetLabels(org.eclipse.stem.core.graph.Graph)
	 */
	@Override
	public void resetLabels() throws ScenarioInitializationException{
		if(this.getList() != null)
			for(Infector i:this.getList()) i.resetLabels();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Infector> getList() {
		if (list == null) {
			list = new BasicInternalEList<Infector>(Infector.class);
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImportFolder() {
		return importFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportFolder(String newImportFolder) {
		importFolder = newImportFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StandardPackage.INFECTOR_INOCULATOR_COLLECTION__LIST:
				return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
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
			case StandardPackage.INFECTOR_INOCULATOR_COLLECTION__LIST:
				return getList();
			case StandardPackage.INFECTOR_INOCULATOR_COLLECTION__IMPORT_FOLDER:
				return getImportFolder();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StandardPackage.INFECTOR_INOCULATOR_COLLECTION__LIST:
				getList().clear();
				getList().addAll((Collection<? extends Infector>)newValue);
				return;
			case StandardPackage.INFECTOR_INOCULATOR_COLLECTION__IMPORT_FOLDER:
				setImportFolder((String)newValue);
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
			case StandardPackage.INFECTOR_INOCULATOR_COLLECTION__LIST:
				getList().clear();
				return;
			case StandardPackage.INFECTOR_INOCULATOR_COLLECTION__IMPORT_FOLDER:
				setImportFolder(IMPORT_FOLDER_EDEFAULT);
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
			case StandardPackage.INFECTOR_INOCULATOR_COLLECTION__LIST:
				return list != null && !list.isEmpty();
			case StandardPackage.INFECTOR_INOCULATOR_COLLECTION__IMPORT_FOLDER:
				return IMPORT_FOLDER_EDEFAULT == null ? importFolder != null : !IMPORT_FOLDER_EDEFAULT.equals(importFolder);
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
		result.append(" (importFolder: "); //$NON-NLS-1$
		result.append(importFolder);
		result.append(')');
		return result.toString();
	}

} //InfectorInoculatorCollectionImpl
