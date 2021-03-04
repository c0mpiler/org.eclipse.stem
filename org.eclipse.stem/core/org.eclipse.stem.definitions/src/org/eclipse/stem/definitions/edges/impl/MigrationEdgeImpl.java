package org.eclipse.stem.definitions.edges.impl;

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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.definitions.edges.EdgesFactory;
import org.eclipse.stem.definitions.edges.EdgesPackage;
import org.eclipse.stem.definitions.edges.MigrationEdge;
import org.eclipse.stem.definitions.edges.MigrationEdgeLabel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Migration Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.definitions.edges.impl.MigrationEdgeImpl#isUseAbsoluteValues <em>Use Absolute Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MigrationEdgeImpl extends PopulationEdgeImpl implements MigrationEdge {
	
	/**
	 * The default value of the '{@link #isUseAbsoluteValues() <em>Use Absolute Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseAbsoluteValues()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_ABSOLUTE_VALUES_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isUseAbsoluteValues() <em>Use Absolute Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseAbsoluteValues()
	 * @generated
	 * @ordered
	 */
	protected boolean useAbsoluteValues = USE_ABSOLUTE_VALUES_EDEFAULT;
	
	/**
	 * This is used to generate unique URI's for each MigrationEdge generated
	 */
	static int migrationEdgeCounter = 0;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected MigrationEdgeImpl() {
		super();
		
		//set the URI
		setURI(STEMURI.createURI(URI_TYPE_MIGRATION_EDGE_SEGMENT + "/"
				+ Integer.toString(migrationEdgeCounter++)));
		
		//Make a label
		setLabel(EdgesFactory.eINSTANCE.createMigrationEdgeLabel());				
		
		//this edge must be directed
		setDirected(true);
		
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdgesPackage.Literals.MIGRATION_EDGE;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseAbsoluteValues() {
		return useAbsoluteValues;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseAbsoluteValues(boolean newUseAbsoluteValues) {
		boolean oldUseAbsoluteValues = useAbsoluteValues;
		useAbsoluteValues = newUseAbsoluteValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdgesPackage.MIGRATION_EDGE__USE_ABSOLUTE_VALUES, oldUseAbsoluteValues, useAbsoluteValues));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("boxing")
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdgesPackage.MIGRATION_EDGE__USE_ABSOLUTE_VALUES:
				return isUseAbsoluteValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("boxing")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EdgesPackage.MIGRATION_EDGE__USE_ABSOLUTE_VALUES:
				setUseAbsoluteValues((Boolean)newValue);
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
			case EdgesPackage.MIGRATION_EDGE__USE_ABSOLUTE_VALUES:
				setUseAbsoluteValues(USE_ABSOLUTE_VALUES_EDEFAULT);
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
			case EdgesPackage.MIGRATION_EDGE__USE_ABSOLUTE_VALUES:
				return useAbsoluteValues != USE_ABSOLUTE_VALUES_EDEFAULT;
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
		result.append(" (useAbsoluteValues: "); //$NON-NLS-1$
		result.append(useAbsoluteValues);
		result.append(')');
		return result.toString();
	}


	/***
	 * Override setter for setDirected so that it will blow up if anyone tries to make it directed (when assertions are on).
	 */
	@Override
	public void setDirected(boolean isDirected) {
		assert(isDirected==true);
		super.setDirected(isDirected);
	}
	
	
	/**
	 * Override to make getEdge return the 
	 * correct type.
	 **/
	@Override
	public MigrationEdgeLabel getLabel() {
		return (MigrationEdgeLabel)super.getLabel();	
	}

	/**
	 * Override to make getEdge set the 
	 * correct type.
	 **/
	@Override
	public void setLabel(MigrationEdgeLabel lbl) {
		//just deal with making sure the URI labeling scheme is correct here.
		lbl.setURIOfIdentifiableToBeLabeled(this.getURI());
		
		super.setLabel(lbl);
	}
	
	
} //MigrationEdgeImpl
