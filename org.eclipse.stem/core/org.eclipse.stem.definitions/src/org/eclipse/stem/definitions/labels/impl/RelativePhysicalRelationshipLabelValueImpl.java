package org.eclipse.stem.definitions.labels.impl;

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
import org.eclipse.stem.core.graph.impl.LabelValueImpl;
import org.eclipse.stem.definitions.labels.LabelsPackage;
import org.eclipse.stem.definitions.labels.RelativePhysicalRelationship;
import org.eclipse.stem.definitions.labels.RelativePhysicalRelationshipLabelValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Relative Physical Relationship Label Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.definitions.labels.impl.RelativePhysicalRelationshipLabelValueImpl#isAdjacent <em>Adjacent</em>}</li>
 *   <li>{@link org.eclipse.stem.definitions.labels.impl.RelativePhysicalRelationshipLabelValueImpl#getRelationship <em>Relationship</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelativePhysicalRelationshipLabelValueImpl extends LabelValueImpl
		implements RelativePhysicalRelationshipLabelValue {
	/**
	 * The default value of the '{@link #isAdjacent() <em>Adjacent</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isAdjacent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ADJACENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAdjacent() <em>Adjacent</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isAdjacent()
	 * @generated
	 * @ordered
	 */
	protected boolean adjacent = ADJACENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelationship() <em>Relationship</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected static final RelativePhysicalRelationship RELATIONSHIP_EDEFAULT = RelativePhysicalRelationship.UNSPECIFIED_LITERAL;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected RelativePhysicalRelationship relationship = RELATIONSHIP_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RelativePhysicalRelationshipLabelValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LabelsPackage.Literals.RELATIVE_PHYSICAL_RELATIONSHIP_LABEL_VALUE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAdjacent() {
		return adjacent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdjacent(boolean newAdjacent) {
		boolean oldAdjacent = adjacent;
		adjacent = newAdjacent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LabelsPackage.RELATIVE_PHYSICAL_RELATIONSHIP_LABEL_VALUE__ADJACENT, oldAdjacent, adjacent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelativePhysicalRelationship getRelationship() {
		return relationship;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelationship(RelativePhysicalRelationship newRelationship) {
		RelativePhysicalRelationship oldRelationship = relationship;
		relationship = newRelationship == null ? RELATIONSHIP_EDEFAULT : newRelationship;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LabelsPackage.RELATIVE_PHYSICAL_RELATIONSHIP_LABEL_VALUE__RELATIONSHIP, oldRelationship, relationship));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("boxing")
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LabelsPackage.RELATIVE_PHYSICAL_RELATIONSHIP_LABEL_VALUE__ADJACENT:
				return isAdjacent();
			case LabelsPackage.RELATIVE_PHYSICAL_RELATIONSHIP_LABEL_VALUE__RELATIONSHIP:
				return getRelationship();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("boxing")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LabelsPackage.RELATIVE_PHYSICAL_RELATIONSHIP_LABEL_VALUE__ADJACENT:
				setAdjacent((Boolean)newValue);
				return;
			case LabelsPackage.RELATIVE_PHYSICAL_RELATIONSHIP_LABEL_VALUE__RELATIONSHIP:
				setRelationship((RelativePhysicalRelationship)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LabelsPackage.RELATIVE_PHYSICAL_RELATIONSHIP_LABEL_VALUE__ADJACENT:
				setAdjacent(ADJACENT_EDEFAULT);
				return;
			case LabelsPackage.RELATIVE_PHYSICAL_RELATIONSHIP_LABEL_VALUE__RELATIONSHIP:
				setRelationship(RELATIONSHIP_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LabelsPackage.RELATIVE_PHYSICAL_RELATIONSHIP_LABEL_VALUE__ADJACENT:
				return adjacent != ADJACENT_EDEFAULT;
			case LabelsPackage.RELATIVE_PHYSICAL_RELATIONSHIP_LABEL_VALUE__RELATIONSHIP:
				return relationship != RELATIONSHIP_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer("");
		result.append("adjacent: ");
		result.append(isAdjacent());
		result.append(", relationship: ");
		result.append(getRelationship());
		return result.toString();
	} // toString

	/**
	 * @see org.eclipse.stem.core.graph.impl.LabelValueImpl#reset()
	 */
	@Override
	public void reset() {
		// Nothing to reset.
	}

	/**
	 * @see org.eclipse.stem.core.common.SanityChecker#sane()
	 */
	@Override
	public boolean sane() {
		return true;
	}

} // RelativePhysicalRelationshipLabelValueImpl
