package org.eclipse.stem.definitions.labels;

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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.stem.definitions.labels.LabelsPackage
 * @generated
 */
public interface LabelsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LabelsFactory eINSTANCE = org.eclipse.stem.definitions.labels.impl.LabelsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Area Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Area Label</em>'.
	 * @generated
	 */
	AreaLabel createAreaLabel();

	/**
	 * Returns a new object of class '<em>Area Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Area Label Value</em>'.
	 * @generated
	 */
	AreaLabelValue createAreaLabelValue();

	/**
	 * Returns a new object of class '<em>Common Border Relationship Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Common Border Relationship Label</em>'.
	 * @generated
	 */
	CommonBorderRelationshipLabel createCommonBorderRelationshipLabel();

	/**
	 * Returns a new object of class '<em>Common Border Relationship Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Common Border Relationship Label Value</em>'.
	 * @generated
	 */
	CommonBorderRelationshipLabelValue createCommonBorderRelationshipLabelValue();

	/**
	 * Returns a new object of class '<em>Population Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Population Label</em>'.
	 * @generated
	 */
	PopulationLabel createPopulationLabel();

	/**
	 * Returns a new object of class '<em>Population Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Population Label Value</em>'.
	 * @generated
	 */
	PopulationLabelValue createPopulationLabelValue();

	/**
	 * Returns a new object of class '<em>Relative Physical Relationship Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relative Physical Relationship Label</em>'.
	 * @generated
	 */
	RelativePhysicalRelationshipLabel createRelativePhysicalRelationshipLabel();

	/**
	 * Returns a new object of class '<em>Relative Physical Relationship Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relative Physical Relationship Label Value</em>'.
	 * @generated
	 */
	RelativePhysicalRelationshipLabelValue createRelativePhysicalRelationshipLabelValue();

	/**
	 * Returns a new object of class '<em>Transport Relationship Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transport Relationship Label</em>'.
	 * @generated
	 */
	TransportRelationshipLabel createTransportRelationshipLabel();

	/**
	 * Returns a new object of class '<em>Transport Relationship Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transport Relationship Label Value</em>'.
	 * @generated
	 */
	TransportRelationshipLabelValue createTransportRelationshipLabelValue();

	/**
	 * Returns a new object of class '<em>Physical Relationship Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Relationship Label Value</em>'.
	 * @generated
	 */
	PhysicalRelationshipLabelValue createPhysicalRelationshipLabelValue();

	/**
	 * Returns a new object of class '<em>Road Transport Relationship Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Road Transport Relationship Label</em>'.
	 * @generated
	 */
	RoadTransportRelationshipLabel createRoadTransportRelationshipLabel();

	/**
	 * Returns a new object of class '<em>Road Transport Relationship Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Road Transport Relationship Label Value</em>'.
	 * @generated
	 */
	RoadTransportRelationshipLabelValue createRoadTransportRelationshipLabelValue();

	/**
	 * Returns a new object of class '<em>Earth Science Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Earth Science Label</em>'.
	 * @generated
	 */
	EarthScienceLabel createEarthScienceLabel();

	/**
	 * Returns a new object of class '<em>Earth Science Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Earth Science Label Value</em>'.
	 * @generated
	 */
	EarthScienceLabelValue createEarthScienceLabelValue();

	/**
	 * Returns a new object of class '<em>Generic Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Label Value</em>'.
	 * @generated
	 */
	<T> GenericLabelValue<T> createGenericLabelValue();

	/**
	 * Returns a new object of class '<em>Double Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Label Value</em>'.
	 * @generated
	 */
	DoubleLabelValue createDoubleLabelValue();

	/**
	 * Returns a new object of class '<em>Integer Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Label Value</em>'.
	 * @generated
	 */
	IntegerLabelValue createIntegerLabelValue();

	/**
	 * Returns a new object of class '<em>Long Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long Label Value</em>'.
	 * @generated
	 */
	LongLabelValue createLongLabelValue();

	/**
	 * Returns a new object of class '<em>String Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Label Value</em>'.
	 * @generated
	 */
	StringLabelValue createStringLabelValue();

	/**
	 * Returns a new object of class '<em>Key Value Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Value Label Value</em>'.
	 * @generated
	 */
	KeyValueLabelValue createKeyValueLabelValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LabelsPackage getLabelsPackage();

} //LabelsFactory
