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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.definitions.labels.LabelsFactory;
import org.eclipse.stem.definitions.labels.LabelsPackage;
import org.eclipse.stem.definitions.labels.RelativePhysicalRelationshipLabel;
import org.eclipse.stem.definitions.labels.RelativePhysicalRelationshipLabelValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Relative Physical Relationship Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.definitions.labels.impl.RelativePhysicalRelationshipLabelImpl#getCurrentRelationship <em>Current Relationship</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelativePhysicalRelationshipLabelImpl extends
		PhysicalRelationshipLabelImpl implements
		RelativePhysicalRelationshipLabel {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected RelativePhysicalRelationshipLabelImpl() {
		super();
		setCurrentValue(LabelsFactory.eINSTANCE
				.createRelativePhysicalRelationshipLabelValue());
	} // RelativePhysicalRelationshipLabelImpl

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LabelsPackage.Literals.RELATIVE_PHYSICAL_RELATIONSHIP_LABEL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public RelativePhysicalRelationshipLabelValue getCurrentRelationship() {
		return (RelativePhysicalRelationshipLabelValue) getCurrentValue();
	} // getCurrentRelationship

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LabelsPackage.RELATIVE_PHYSICAL_RELATIONSHIP_LABEL__CURRENT_RELATIONSHIP:
				return getCurrentRelationship();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LabelsPackage.RELATIVE_PHYSICAL_RELATIONSHIP_LABEL__CURRENT_RELATIONSHIP:
				return getCurrentRelationship() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @see org.eclipse.stem.core.graph.impl.LabelImpl#toString()
	 */
	@Override
	public String toString() {
		return super.toString();
	}

} // RelativePhysicalRelationshipLabelImpl
