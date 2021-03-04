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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.stem.core.graph.GraphPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.stem.definitions.labels.LabelsFactory
 * @model kind="package"
 * @generated
 */
public interface LabelsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "labels";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/stem/definitions/labels.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.stem.definitions.labels";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LabelsPackage eINSTANCE = org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.stem.definitions.labels.impl.AreaLabelImpl <em>Area Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.definitions.labels.impl.AreaLabelImpl
	 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getAreaLabel()
	 * @generated
	 */
	int AREA_LABEL = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_LABEL__URI = GraphPackage.STATIC_NODE_LABEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_LABEL__TYPE_URI = GraphPackage.STATIC_NODE_LABEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_LABEL__DUBLIN_CORE = GraphPackage.STATIC_NODE_LABEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>URI Of Identifiable To Be Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED = GraphPackage.STATIC_NODE_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_LABEL__CURRENT_VALUE = GraphPackage.STATIC_NODE_LABEL__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Identifiable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_LABEL__IDENTIFIABLE = GraphPackage.STATIC_NODE_LABEL__IDENTIFIABLE;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_LABEL__NODE = GraphPackage.STATIC_NODE_LABEL__NODE;

	/**
	 * The feature id for the '<em><b>Current Area Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_LABEL__CURRENT_AREA_VALUE = GraphPackage.STATIC_NODE_LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Area Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_LABEL_FEATURE_COUNT = GraphPackage.STATIC_NODE_LABEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.definitions.labels.impl.AreaLabelValueImpl <em>Area Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.definitions.labels.impl.AreaLabelValueImpl
	 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getAreaLabelValue()
	 * @generated
	 */
	int AREA_LABEL_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_LABEL_VALUE__AREA = GraphPackage.LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Average Extent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_LABEL_VALUE__AVERAGE_EXTENT = GraphPackage.LABEL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Area Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_LABEL_VALUE_FEATURE_COUNT = GraphPackage.LABEL_VALUE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.definitions.labels.impl.PhysicalRelationshipLabelImpl <em>Physical Relationship Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.definitions.labels.impl.PhysicalRelationshipLabelImpl
	 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getPhysicalRelationshipLabel()
	 * @generated
	 */
	int PHYSICAL_RELATIONSHIP_LABEL = 4;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_RELATIONSHIP_LABEL__URI = GraphPackage.STATIC_EDGE_LABEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_RELATIONSHIP_LABEL__TYPE_URI = GraphPackage.STATIC_EDGE_LABEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_RELATIONSHIP_LABEL__DUBLIN_CORE = GraphPackage.STATIC_EDGE_LABEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>URI Of Identifiable To Be Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_RELATIONSHIP_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED = GraphPackage.STATIC_EDGE_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_RELATIONSHIP_LABEL__CURRENT_VALUE = GraphPackage.STATIC_EDGE_LABEL__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Identifiable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_RELATIONSHIP_LABEL__IDENTIFIABLE = GraphPackage.STATIC_EDGE_LABEL__IDENTIFIABLE;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_RELATIONSHIP_LABEL__EDGE = GraphPackage.STATIC_EDGE_LABEL__EDGE;

	/**
	 * The number of structural features of the '<em>Physical Relationship Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_RELATIONSHIP_LABEL_FEATURE_COUNT = GraphPackage.STATIC_EDGE_LABEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.definitions.labels.impl.RelativePhysicalRelationshipLabelImpl <em>Relative Physical Relationship Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.definitions.labels.impl.RelativePhysicalRelationshipLabelImpl
	 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getRelativePhysicalRelationshipLabel()
	 * @generated
	 */
	int RELATIVE_PHYSICAL_RELATIONSHIP_LABEL = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.definitions.labels.impl.CommonBorderRelationshipLabelImpl <em>Common Border Relationship Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.definitions.labels.impl.CommonBorderRelationshipLabelImpl
	 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getCommonBorderRelationshipLabel()
	 * @generated
	 */
	int COMMON_BORDER_RELATIONSHIP_LABEL = 2;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_BORDER_RELATIONSHIP_LABEL__URI = PHYSICAL_RELATIONSHIP_LABEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_BORDER_RELATIONSHIP_LABEL__TYPE_URI = PHYSICAL_RELATIONSHIP_LABEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_BORDER_RELATIONSHIP_LABEL__DUBLIN_CORE = PHYSICAL_RELATIONSHIP_LABEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>URI Of Identifiable To Be Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_BORDER_RELATIONSHIP_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED = PHYSICAL_RELATIONSHIP_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_BORDER_RELATIONSHIP_LABEL__CURRENT_VALUE = PHYSICAL_RELATIONSHIP_LABEL__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Identifiable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_BORDER_RELATIONSHIP_LABEL__IDENTIFIABLE = PHYSICAL_RELATIONSHIP_LABEL__IDENTIFIABLE;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_BORDER_RELATIONSHIP_LABEL__EDGE = PHYSICAL_RELATIONSHIP_LABEL__EDGE;

	/**
	 * The number of structural features of the '<em>Common Border Relationship Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_BORDER_RELATIONSHIP_LABEL_FEATURE_COUNT = PHYSICAL_RELATIONSHIP_LABEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.definitions.labels.impl.PhysicalRelationshipLabelValueImpl <em>Physical Relationship Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.definitions.labels.impl.PhysicalRelationshipLabelValueImpl
	 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getPhysicalRelationshipLabelValue()
	 * @generated
	 */
	int PHYSICAL_RELATIONSHIP_LABEL_VALUE = 11;

	/**
	 * The number of structural features of the '<em>Physical Relationship Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_RELATIONSHIP_LABEL_VALUE_FEATURE_COUNT = GraphPackage.LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.definitions.labels.impl.RelativePhysicalRelationshipLabelValueImpl <em>Relative Physical Relationship Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.definitions.labels.impl.RelativePhysicalRelationshipLabelValueImpl
	 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getRelativePhysicalRelationshipLabelValue()
	 * @generated
	 */
	int RELATIVE_PHYSICAL_RELATIONSHIP_LABEL_VALUE = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.definitions.labels.impl.CommonBorderRelationshipLabelValueImpl <em>Common Border Relationship Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.definitions.labels.impl.CommonBorderRelationshipLabelValueImpl
	 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getCommonBorderRelationshipLabelValue()
	 * @generated
	 */
	int COMMON_BORDER_RELATIONSHIP_LABEL_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Border Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_BORDER_RELATIONSHIP_LABEL_VALUE__BORDER_LENGTH = PHYSICAL_RELATIONSHIP_LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Common Border Relationship Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_BORDER_RELATIONSHIP_LABEL_VALUE_FEATURE_COUNT = PHYSICAL_RELATIONSHIP_LABEL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.definitions.labels.impl.PopulationLabelImpl <em>Population Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.definitions.labels.impl.PopulationLabelImpl
	 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getPopulationLabel()
	 * @generated
	 */
	int POPULATION_LABEL = 5;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_LABEL__URI = GraphPackage.STATIC_NODE_LABEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_LABEL__TYPE_URI = GraphPackage.STATIC_NODE_LABEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_LABEL__DUBLIN_CORE = GraphPackage.STATIC_NODE_LABEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>URI Of Identifiable To Be Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED = GraphPackage.STATIC_NODE_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_LABEL__CURRENT_VALUE = GraphPackage.STATIC_NODE_LABEL__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Identifiable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_LABEL__IDENTIFIABLE = GraphPackage.STATIC_NODE_LABEL__IDENTIFIABLE;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_LABEL__NODE = GraphPackage.STATIC_NODE_LABEL__NODE;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_LABEL__POPULATION_IDENTIFIER = GraphPackage.STATIC_NODE_LABEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Current Population Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_LABEL__CURRENT_POPULATION_VALUE = GraphPackage.STATIC_NODE_LABEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Populated Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_LABEL__POPULATED_AREA = GraphPackage.STATIC_NODE_LABEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Valid Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_LABEL__VALID_YEAR = GraphPackage.STATIC_NODE_LABEL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Population Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_LABEL_FEATURE_COUNT = GraphPackage.STATIC_NODE_LABEL_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.definitions.labels.impl.PopulationLabelValueImpl <em>Population Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.definitions.labels.impl.PopulationLabelValueImpl
	 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getPopulationLabelValue()
	 * @generated
	 */
	int POPULATION_LABEL_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_LABEL_VALUE__COUNT = GraphPackage.LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Population Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_LABEL_VALUE_FEATURE_COUNT = GraphPackage.LABEL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_PHYSICAL_RELATIONSHIP_LABEL__URI = PHYSICAL_RELATIONSHIP_LABEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_PHYSICAL_RELATIONSHIP_LABEL__TYPE_URI = PHYSICAL_RELATIONSHIP_LABEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_PHYSICAL_RELATIONSHIP_LABEL__DUBLIN_CORE = PHYSICAL_RELATIONSHIP_LABEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>URI Of Identifiable To Be Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_PHYSICAL_RELATIONSHIP_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED = PHYSICAL_RELATIONSHIP_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_PHYSICAL_RELATIONSHIP_LABEL__CURRENT_VALUE = PHYSICAL_RELATIONSHIP_LABEL__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Identifiable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_PHYSICAL_RELATIONSHIP_LABEL__IDENTIFIABLE = PHYSICAL_RELATIONSHIP_LABEL__IDENTIFIABLE;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_PHYSICAL_RELATIONSHIP_LABEL__EDGE = PHYSICAL_RELATIONSHIP_LABEL__EDGE;

	/**
	 * The feature id for the '<em><b>Current Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_PHYSICAL_RELATIONSHIP_LABEL__CURRENT_RELATIONSHIP = PHYSICAL_RELATIONSHIP_LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relative Physical Relationship Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_PHYSICAL_RELATIONSHIP_LABEL_FEATURE_COUNT = PHYSICAL_RELATIONSHIP_LABEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Adjacent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_PHYSICAL_RELATIONSHIP_LABEL_VALUE__ADJACENT = GraphPackage.LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_PHYSICAL_RELATIONSHIP_LABEL_VALUE__RELATIONSHIP = GraphPackage.LABEL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relative Physical Relationship Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_PHYSICAL_RELATIONSHIP_LABEL_VALUE_FEATURE_COUNT = GraphPackage.LABEL_VALUE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.definitions.labels.impl.TransportRelationshipLabelImpl <em>Transport Relationship Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.definitions.labels.impl.TransportRelationshipLabelImpl
	 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getTransportRelationshipLabel()
	 * @generated
	 */
	int TRANSPORT_RELATIONSHIP_LABEL = 9;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_RELATIONSHIP_LABEL__URI = GraphPackage.DYNAMIC_EDGE_LABEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_RELATIONSHIP_LABEL__TYPE_URI = GraphPackage.DYNAMIC_EDGE_LABEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_RELATIONSHIP_LABEL__DUBLIN_CORE = GraphPackage.DYNAMIC_EDGE_LABEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>URI Of Identifiable To Be Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_RELATIONSHIP_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED = GraphPackage.DYNAMIC_EDGE_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_RELATIONSHIP_LABEL__CURRENT_VALUE = GraphPackage.DYNAMIC_EDGE_LABEL__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Identifiable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_RELATIONSHIP_LABEL__IDENTIFIABLE = GraphPackage.DYNAMIC_EDGE_LABEL__IDENTIFIABLE;

	/**
	 * The feature id for the '<em><b>Next Value Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_RELATIONSHIP_LABEL__NEXT_VALUE_VALID = GraphPackage.DYNAMIC_EDGE_LABEL__NEXT_VALUE_VALID;

	/**
	 * The feature id for the '<em><b>Next Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_RELATIONSHIP_LABEL__NEXT_VALUE = GraphPackage.DYNAMIC_EDGE_LABEL__NEXT_VALUE;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_RELATIONSHIP_LABEL__DECORATOR = GraphPackage.DYNAMIC_EDGE_LABEL__DECORATOR;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_RELATIONSHIP_LABEL__EDGE = GraphPackage.DYNAMIC_EDGE_LABEL__EDGE;

	/**
	 * The feature id for the '<em><b>Transport Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_RELATIONSHIP_LABEL__TRANSPORT_MODE = GraphPackage.DYNAMIC_EDGE_LABEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_RELATIONSHIP_LABEL__POPULATION_IDENTIFIER = GraphPackage.DYNAMIC_EDGE_LABEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transport Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_RELATIONSHIP_LABEL__TRANSPORT_IDENTIFIER = GraphPackage.DYNAMIC_EDGE_LABEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Current Transport Relationship Label Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_RELATIONSHIP_LABEL__CURRENT_TRANSPORT_RELATIONSHIP_LABEL_VALUE = GraphPackage.DYNAMIC_EDGE_LABEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rate Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_RELATIONSHIP_LABEL__RATE_TIME_PERIOD = GraphPackage.DYNAMIC_EDGE_LABEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Departure Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_RELATIONSHIP_LABEL__DEPARTURE_CAPACITY = GraphPackage.DYNAMIC_EDGE_LABEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Maximum Departure Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_RELATIONSHIP_LABEL__MAXIMUM_DEPARTURE_CAPACITY = GraphPackage.DYNAMIC_EDGE_LABEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_RELATIONSHIP_LABEL__CAPACITY = GraphPackage.DYNAMIC_EDGE_LABEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Maximum Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_RELATIONSHIP_LABEL__MAXIMUM_CAPACITY = GraphPackage.DYNAMIC_EDGE_LABEL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Transit Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_RELATIONSHIP_LABEL__TRANSIT_TIME = GraphPackage.DYNAMIC_EDGE_LABEL_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Start Up Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_RELATIONSHIP_LABEL__START_UP_DELAY = GraphPackage.DYNAMIC_EDGE_LABEL_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Transport Relationship Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_RELATIONSHIP_LABEL_FEATURE_COUNT = GraphPackage.DYNAMIC_EDGE_LABEL_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.definitions.labels.impl.TransportRelationshipLabelValueImpl <em>Transport Relationship Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.definitions.labels.impl.TransportRelationshipLabelValueImpl
	 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getTransportRelationshipLabelValue()
	 * @generated
	 */
	int TRANSPORT_RELATIONSHIP_LABEL_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Available Departure Capacity Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_RELATIONSHIP_LABEL_VALUE__AVAILABLE_DEPARTURE_CAPACITY_PROPORTION = GraphPackage.LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transport Relationship Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_RELATIONSHIP_LABEL_VALUE_FEATURE_COUNT = GraphPackage.LABEL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.definitions.labels.impl.RoadTransportRelationshipLabelImpl <em>Road Transport Relationship Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.definitions.labels.impl.RoadTransportRelationshipLabelImpl
	 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getRoadTransportRelationshipLabel()
	 * @generated
	 */
	int ROAD_TRANSPORT_RELATIONSHIP_LABEL = 12;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TRANSPORT_RELATIONSHIP_LABEL__URI = PHYSICAL_RELATIONSHIP_LABEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TRANSPORT_RELATIONSHIP_LABEL__TYPE_URI = PHYSICAL_RELATIONSHIP_LABEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TRANSPORT_RELATIONSHIP_LABEL__DUBLIN_CORE = PHYSICAL_RELATIONSHIP_LABEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>URI Of Identifiable To Be Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TRANSPORT_RELATIONSHIP_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED = PHYSICAL_RELATIONSHIP_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TRANSPORT_RELATIONSHIP_LABEL__CURRENT_VALUE = PHYSICAL_RELATIONSHIP_LABEL__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Identifiable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TRANSPORT_RELATIONSHIP_LABEL__IDENTIFIABLE = PHYSICAL_RELATIONSHIP_LABEL__IDENTIFIABLE;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TRANSPORT_RELATIONSHIP_LABEL__EDGE = PHYSICAL_RELATIONSHIP_LABEL__EDGE;

	/**
	 * The number of structural features of the '<em>Road Transport Relationship Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TRANSPORT_RELATIONSHIP_LABEL_FEATURE_COUNT = PHYSICAL_RELATIONSHIP_LABEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.definitions.labels.impl.RoadTransportRelationshipLabelValueImpl <em>Road Transport Relationship Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.definitions.labels.impl.RoadTransportRelationshipLabelValueImpl
	 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getRoadTransportRelationshipLabelValue()
	 * @generated
	 */
	int ROAD_TRANSPORT_RELATIONSHIP_LABEL_VALUE = 13;

	/**
	 * The feature id for the '<em><b>Road Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TRANSPORT_RELATIONSHIP_LABEL_VALUE__ROAD_NAME = PHYSICAL_RELATIONSHIP_LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Road Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TRANSPORT_RELATIONSHIP_LABEL_VALUE__ROAD_CLASS = PHYSICAL_RELATIONSHIP_LABEL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Number Crossings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TRANSPORT_RELATIONSHIP_LABEL_VALUE__NUMBER_CROSSINGS = PHYSICAL_RELATIONSHIP_LABEL_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Road Transport Relationship Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TRANSPORT_RELATIONSHIP_LABEL_VALUE_FEATURE_COUNT = PHYSICAL_RELATIONSHIP_LABEL_VALUE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.definitions.labels.impl.EarthScienceLabelImpl <em>Earth Science Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.definitions.labels.impl.EarthScienceLabelImpl
	 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getEarthScienceLabel()
	 * @generated
	 */
	int EARTH_SCIENCE_LABEL = 14;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SCIENCE_LABEL__URI = GraphPackage.STATIC_NODE_LABEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SCIENCE_LABEL__TYPE_URI = GraphPackage.STATIC_NODE_LABEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SCIENCE_LABEL__DUBLIN_CORE = GraphPackage.STATIC_NODE_LABEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>URI Of Identifiable To Be Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SCIENCE_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED = GraphPackage.STATIC_NODE_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SCIENCE_LABEL__CURRENT_VALUE = GraphPackage.STATIC_NODE_LABEL__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Identifiable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SCIENCE_LABEL__IDENTIFIABLE = GraphPackage.STATIC_NODE_LABEL__IDENTIFIABLE;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SCIENCE_LABEL__NODE = GraphPackage.STATIC_NODE_LABEL__NODE;

	/**
	 * The feature id for the '<em><b>Current Earth Science Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SCIENCE_LABEL__CURRENT_EARTH_SCIENCE_VALUE = GraphPackage.STATIC_NODE_LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Earth Science Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SCIENCE_LABEL_FEATURE_COUNT = GraphPackage.STATIC_NODE_LABEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.definitions.labels.impl.EarthScienceLabelValueImpl <em>Earth Science Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.definitions.labels.impl.EarthScienceLabelValueImpl
	 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getEarthScienceLabelValue()
	 * @generated
	 */
	int EARTH_SCIENCE_LABEL_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SCIENCE_LABEL_VALUE__DATA_TYPE = GraphPackage.LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SCIENCE_LABEL_VALUE__UNITS = GraphPackage.LABEL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SCIENCE_LABEL_VALUE__MEAN = GraphPackage.LABEL_VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sd</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SCIENCE_LABEL_VALUE__SD = GraphPackage.LABEL_VALUE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SCIENCE_LABEL_VALUE__MIN = GraphPackage.LABEL_VALUE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SCIENCE_LABEL_VALUE__MAX = GraphPackage.LABEL_VALUE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Median</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SCIENCE_LABEL_VALUE__MEDIAN = GraphPackage.LABEL_VALUE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Skewness</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SCIENCE_LABEL_VALUE__SKEWNESS = GraphPackage.LABEL_VALUE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Kurtosis</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SCIENCE_LABEL_VALUE__KURTOSIS = GraphPackage.LABEL_VALUE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Rms</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SCIENCE_LABEL_VALUE__RMS = GraphPackage.LABEL_VALUE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Samplesize</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SCIENCE_LABEL_VALUE__SAMPLESIZE = GraphPackage.LABEL_VALUE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SCIENCE_LABEL_VALUE__RANGE = GraphPackage.LABEL_VALUE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Valid Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SCIENCE_LABEL_VALUE__VALID_YEAR = GraphPackage.LABEL_VALUE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Earth Science Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SCIENCE_LABEL_VALUE_FEATURE_COUNT = GraphPackage.LABEL_VALUE_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.definitions.labels.impl.GenericLabelValueImpl <em>Generic Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.definitions.labels.impl.GenericLabelValueImpl
	 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getGenericLabelValue()
	 * @generated
	 */
	int GENERIC_LABEL_VALUE = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_LABEL_VALUE__VALUE = GraphPackage.LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_LABEL_VALUE__UNIT = GraphPackage.LABEL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_LABEL_VALUE__MEASURE = GraphPackage.LABEL_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Generic Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_LABEL_VALUE_FEATURE_COUNT = GraphPackage.LABEL_VALUE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.definitions.labels.impl.DoubleLabelValueImpl <em>Double Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.definitions.labels.impl.DoubleLabelValueImpl
	 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getDoubleLabelValue()
	 * @generated
	 */
	int DOUBLE_LABEL_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LABEL_VALUE__VALUE = GENERIC_LABEL_VALUE__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LABEL_VALUE__UNIT = GENERIC_LABEL_VALUE__UNIT;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LABEL_VALUE__MEASURE = GENERIC_LABEL_VALUE__MEASURE;

	/**
	 * The number of structural features of the '<em>Double Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LABEL_VALUE_FEATURE_COUNT = GENERIC_LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.definitions.labels.impl.IntegerLabelValueImpl <em>Integer Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.definitions.labels.impl.IntegerLabelValueImpl
	 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getIntegerLabelValue()
	 * @generated
	 */
	int INTEGER_LABEL_VALUE = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LABEL_VALUE__VALUE = GENERIC_LABEL_VALUE__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LABEL_VALUE__UNIT = GENERIC_LABEL_VALUE__UNIT;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LABEL_VALUE__MEASURE = GENERIC_LABEL_VALUE__MEASURE;

	/**
	 * The number of structural features of the '<em>Integer Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LABEL_VALUE_FEATURE_COUNT = GENERIC_LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.definitions.labels.impl.LongLabelValueImpl <em>Long Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.definitions.labels.impl.LongLabelValueImpl
	 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getLongLabelValue()
	 * @generated
	 */
	int LONG_LABEL_VALUE = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_LABEL_VALUE__VALUE = GENERIC_LABEL_VALUE__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_LABEL_VALUE__UNIT = GENERIC_LABEL_VALUE__UNIT;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_LABEL_VALUE__MEASURE = GENERIC_LABEL_VALUE__MEASURE;

	/**
	 * The number of structural features of the '<em>Long Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_LABEL_VALUE_FEATURE_COUNT = GENERIC_LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.definitions.labels.impl.StringLabelValueImpl <em>String Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.definitions.labels.impl.StringLabelValueImpl
	 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getStringLabelValue()
	 * @generated
	 */
	int STRING_LABEL_VALUE = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LABEL_VALUE__VALUE = GENERIC_LABEL_VALUE__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LABEL_VALUE__UNIT = GENERIC_LABEL_VALUE__UNIT;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LABEL_VALUE__MEASURE = GENERIC_LABEL_VALUE__MEASURE;

	/**
	 * The number of structural features of the '<em>String Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LABEL_VALUE_FEATURE_COUNT = GENERIC_LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.definitions.labels.impl.KeyValueLabelValueImpl <em>Key Value Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.definitions.labels.impl.KeyValueLabelValueImpl
	 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getKeyValueLabelValue()
	 * @generated
	 */
	int KEY_VALUE_LABEL_VALUE = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_LABEL_VALUE__VALUE = GENERIC_LABEL_VALUE__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_LABEL_VALUE__UNIT = GENERIC_LABEL_VALUE__UNIT;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_LABEL_VALUE__MEASURE = GENERIC_LABEL_VALUE__MEASURE;

	/**
	 * The number of structural features of the '<em>Key Value Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_LABEL_VALUE_FEATURE_COUNT = GENERIC_LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.definitions.labels.RelativePhysicalRelationship <em>Relative Physical Relationship</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.definitions.labels.RelativePhysicalRelationship
	 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getRelativePhysicalRelationship()
	 * @generated
	 */
	int RELATIVE_PHYSICAL_RELATIONSHIP = 22;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.definitions.labels.TransportMode <em>Transport Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.definitions.labels.TransportMode
	 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getTransportMode()
	 * @generated
	 */
	int TRANSPORT_MODE = 23;


	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.definitions.labels.AreaLabel <em>Area Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area Label</em>'.
	 * @see org.eclipse.stem.definitions.labels.AreaLabel
	 * @generated
	 */
	EClass getAreaLabel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.definitions.labels.AreaLabel#getCurrentAreaValue <em>Current Area Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Area Value</em>'.
	 * @see org.eclipse.stem.definitions.labels.AreaLabel#getCurrentAreaValue()
	 * @see #getAreaLabel()
	 * @generated
	 */
	EReference getAreaLabel_CurrentAreaValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.definitions.labels.AreaLabelValue <em>Area Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area Label Value</em>'.
	 * @see org.eclipse.stem.definitions.labels.AreaLabelValue
	 * @generated
	 */
	EClass getAreaLabelValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.definitions.labels.AreaLabelValue#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area</em>'.
	 * @see org.eclipse.stem.definitions.labels.AreaLabelValue#getArea()
	 * @see #getAreaLabelValue()
	 * @generated
	 */
	EAttribute getAreaLabelValue_Area();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.definitions.labels.AreaLabelValue#getAverageExtent <em>Average Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average Extent</em>'.
	 * @see org.eclipse.stem.definitions.labels.AreaLabelValue#getAverageExtent()
	 * @see #getAreaLabelValue()
	 * @generated
	 */
	EAttribute getAreaLabelValue_AverageExtent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.definitions.labels.CommonBorderRelationshipLabel <em>Common Border Relationship Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Common Border Relationship Label</em>'.
	 * @see org.eclipse.stem.definitions.labels.CommonBorderRelationshipLabel
	 * @generated
	 */
	EClass getCommonBorderRelationshipLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.definitions.labels.CommonBorderRelationshipLabelValue <em>Common Border Relationship Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Common Border Relationship Label Value</em>'.
	 * @see org.eclipse.stem.definitions.labels.CommonBorderRelationshipLabelValue
	 * @generated
	 */
	EClass getCommonBorderRelationshipLabelValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.definitions.labels.CommonBorderRelationshipLabelValue#getBorderLength <em>Border Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Length</em>'.
	 * @see org.eclipse.stem.definitions.labels.CommonBorderRelationshipLabelValue#getBorderLength()
	 * @see #getCommonBorderRelationshipLabelValue()
	 * @generated
	 */
	EAttribute getCommonBorderRelationshipLabelValue_BorderLength();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.definitions.labels.PhysicalRelationshipLabel <em>Physical Relationship Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Relationship Label</em>'.
	 * @see org.eclipse.stem.definitions.labels.PhysicalRelationshipLabel
	 * @generated
	 */
	EClass getPhysicalRelationshipLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.definitions.labels.PopulationLabel <em>Population Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Population Label</em>'.
	 * @see org.eclipse.stem.definitions.labels.PopulationLabel
	 * @generated
	 */
	EClass getPopulationLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.definitions.labels.PopulationLabel#getPopulationIdentifier <em>Population Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Population Identifier</em>'.
	 * @see org.eclipse.stem.definitions.labels.PopulationLabel#getPopulationIdentifier()
	 * @see #getPopulationLabel()
	 * @generated
	 */
	EAttribute getPopulationLabel_PopulationIdentifier();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.definitions.labels.PopulationLabel#getCurrentPopulationValue <em>Current Population Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Population Value</em>'.
	 * @see org.eclipse.stem.definitions.labels.PopulationLabel#getCurrentPopulationValue()
	 * @see #getPopulationLabel()
	 * @generated
	 */
	EReference getPopulationLabel_CurrentPopulationValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.definitions.labels.PopulationLabel#getPopulatedArea <em>Populated Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Populated Area</em>'.
	 * @see org.eclipse.stem.definitions.labels.PopulationLabel#getPopulatedArea()
	 * @see #getPopulationLabel()
	 * @generated
	 */
	EAttribute getPopulationLabel_PopulatedArea();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.definitions.labels.PopulationLabel#getValidYear <em>Valid Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Year</em>'.
	 * @see org.eclipse.stem.definitions.labels.PopulationLabel#getValidYear()
	 * @see #getPopulationLabel()
	 * @generated
	 */
	EAttribute getPopulationLabel_ValidYear();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.definitions.labels.PopulationLabelValue <em>Population Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Population Label Value</em>'.
	 * @see org.eclipse.stem.definitions.labels.PopulationLabelValue
	 * @generated
	 */
	EClass getPopulationLabelValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.definitions.labels.PopulationLabelValue#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see org.eclipse.stem.definitions.labels.PopulationLabelValue#getCount()
	 * @see #getPopulationLabelValue()
	 * @generated
	 */
	EAttribute getPopulationLabelValue_Count();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.definitions.labels.RelativePhysicalRelationshipLabel <em>Relative Physical Relationship Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Physical Relationship Label</em>'.
	 * @see org.eclipse.stem.definitions.labels.RelativePhysicalRelationshipLabel
	 * @generated
	 */
	EClass getRelativePhysicalRelationshipLabel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.definitions.labels.RelativePhysicalRelationshipLabel#getCurrentRelationship <em>Current Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Relationship</em>'.
	 * @see org.eclipse.stem.definitions.labels.RelativePhysicalRelationshipLabel#getCurrentRelationship()
	 * @see #getRelativePhysicalRelationshipLabel()
	 * @generated
	 */
	EReference getRelativePhysicalRelationshipLabel_CurrentRelationship();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.definitions.labels.RelativePhysicalRelationshipLabelValue <em>Relative Physical Relationship Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Physical Relationship Label Value</em>'.
	 * @see org.eclipse.stem.definitions.labels.RelativePhysicalRelationshipLabelValue
	 * @generated
	 */
	EClass getRelativePhysicalRelationshipLabelValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.definitions.labels.RelativePhysicalRelationshipLabelValue#isAdjacent <em>Adjacent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adjacent</em>'.
	 * @see org.eclipse.stem.definitions.labels.RelativePhysicalRelationshipLabelValue#isAdjacent()
	 * @see #getRelativePhysicalRelationshipLabelValue()
	 * @generated
	 */
	EAttribute getRelativePhysicalRelationshipLabelValue_Adjacent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.definitions.labels.RelativePhysicalRelationshipLabelValue#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship</em>'.
	 * @see org.eclipse.stem.definitions.labels.RelativePhysicalRelationshipLabelValue#getRelationship()
	 * @see #getRelativePhysicalRelationshipLabelValue()
	 * @generated
	 */
	EAttribute getRelativePhysicalRelationshipLabelValue_Relationship();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.definitions.labels.TransportRelationshipLabel <em>Transport Relationship Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport Relationship Label</em>'.
	 * @see org.eclipse.stem.definitions.labels.TransportRelationshipLabel
	 * @generated
	 */
	EClass getTransportRelationshipLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.definitions.labels.TransportRelationshipLabel#getTransportMode <em>Transport Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transport Mode</em>'.
	 * @see org.eclipse.stem.definitions.labels.TransportRelationshipLabel#getTransportMode()
	 * @see #getTransportRelationshipLabel()
	 * @generated
	 */
	EAttribute getTransportRelationshipLabel_TransportMode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.definitions.labels.TransportRelationshipLabel#getPopulationIdentifier <em>Population Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Population Identifier</em>'.
	 * @see org.eclipse.stem.definitions.labels.TransportRelationshipLabel#getPopulationIdentifier()
	 * @see #getTransportRelationshipLabel()
	 * @generated
	 */
	EAttribute getTransportRelationshipLabel_PopulationIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.definitions.labels.TransportRelationshipLabel#getTransportIdentifier <em>Transport Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transport Identifier</em>'.
	 * @see org.eclipse.stem.definitions.labels.TransportRelationshipLabel#getTransportIdentifier()
	 * @see #getTransportRelationshipLabel()
	 * @generated
	 */
	EAttribute getTransportRelationshipLabel_TransportIdentifier();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.definitions.labels.TransportRelationshipLabel#getCurrentTransportRelationshipLabelValue <em>Current Transport Relationship Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Transport Relationship Label Value</em>'.
	 * @see org.eclipse.stem.definitions.labels.TransportRelationshipLabel#getCurrentTransportRelationshipLabelValue()
	 * @see #getTransportRelationshipLabel()
	 * @generated
	 */
	EReference getTransportRelationshipLabel_CurrentTransportRelationshipLabelValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.definitions.labels.TransportRelationshipLabel#getRateTimePeriod <em>Rate Time Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate Time Period</em>'.
	 * @see org.eclipse.stem.definitions.labels.TransportRelationshipLabel#getRateTimePeriod()
	 * @see #getTransportRelationshipLabel()
	 * @generated
	 */
	EAttribute getTransportRelationshipLabel_RateTimePeriod();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.definitions.labels.TransportRelationshipLabel#getDepartureCapacity <em>Departure Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Departure Capacity</em>'.
	 * @see org.eclipse.stem.definitions.labels.TransportRelationshipLabel#getDepartureCapacity()
	 * @see #getTransportRelationshipLabel()
	 * @generated
	 */
	EAttribute getTransportRelationshipLabel_DepartureCapacity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.definitions.labels.TransportRelationshipLabel#getMaximumDepartureCapacity <em>Maximum Departure Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Departure Capacity</em>'.
	 * @see org.eclipse.stem.definitions.labels.TransportRelationshipLabel#getMaximumDepartureCapacity()
	 * @see #getTransportRelationshipLabel()
	 * @generated
	 */
	EAttribute getTransportRelationshipLabel_MaximumDepartureCapacity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.definitions.labels.TransportRelationshipLabel#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see org.eclipse.stem.definitions.labels.TransportRelationshipLabel#getCapacity()
	 * @see #getTransportRelationshipLabel()
	 * @generated
	 */
	EAttribute getTransportRelationshipLabel_Capacity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.definitions.labels.TransportRelationshipLabel#getMaximumCapacity <em>Maximum Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Capacity</em>'.
	 * @see org.eclipse.stem.definitions.labels.TransportRelationshipLabel#getMaximumCapacity()
	 * @see #getTransportRelationshipLabel()
	 * @generated
	 */
	EAttribute getTransportRelationshipLabel_MaximumCapacity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.definitions.labels.TransportRelationshipLabel#getTransitTime <em>Transit Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transit Time</em>'.
	 * @see org.eclipse.stem.definitions.labels.TransportRelationshipLabel#getTransitTime()
	 * @see #getTransportRelationshipLabel()
	 * @generated
	 */
	EAttribute getTransportRelationshipLabel_TransitTime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.definitions.labels.TransportRelationshipLabel#getStartUpDelay <em>Start Up Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Up Delay</em>'.
	 * @see org.eclipse.stem.definitions.labels.TransportRelationshipLabel#getStartUpDelay()
	 * @see #getTransportRelationshipLabel()
	 * @generated
	 */
	EAttribute getTransportRelationshipLabel_StartUpDelay();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.definitions.labels.TransportRelationshipLabelValue <em>Transport Relationship Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport Relationship Label Value</em>'.
	 * @see org.eclipse.stem.definitions.labels.TransportRelationshipLabelValue
	 * @generated
	 */
	EClass getTransportRelationshipLabelValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.definitions.labels.TransportRelationshipLabelValue#getAvailableDepartureCapacityProportion <em>Available Departure Capacity Proportion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available Departure Capacity Proportion</em>'.
	 * @see org.eclipse.stem.definitions.labels.TransportRelationshipLabelValue#getAvailableDepartureCapacityProportion()
	 * @see #getTransportRelationshipLabelValue()
	 * @generated
	 */
	EAttribute getTransportRelationshipLabelValue_AvailableDepartureCapacityProportion();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.definitions.labels.PhysicalRelationshipLabelValue <em>Physical Relationship Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Relationship Label Value</em>'.
	 * @see org.eclipse.stem.definitions.labels.PhysicalRelationshipLabelValue
	 * @generated
	 */
	EClass getPhysicalRelationshipLabelValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.definitions.labels.RoadTransportRelationshipLabel <em>Road Transport Relationship Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Road Transport Relationship Label</em>'.
	 * @see org.eclipse.stem.definitions.labels.RoadTransportRelationshipLabel
	 * @generated
	 */
	EClass getRoadTransportRelationshipLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.definitions.labels.RoadTransportRelationshipLabelValue <em>Road Transport Relationship Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Road Transport Relationship Label Value</em>'.
	 * @see org.eclipse.stem.definitions.labels.RoadTransportRelationshipLabelValue
	 * @generated
	 */
	EClass getRoadTransportRelationshipLabelValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.definitions.labels.RoadTransportRelationshipLabelValue#getRoadName <em>Road Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Road Name</em>'.
	 * @see org.eclipse.stem.definitions.labels.RoadTransportRelationshipLabelValue#getRoadName()
	 * @see #getRoadTransportRelationshipLabelValue()
	 * @generated
	 */
	EAttribute getRoadTransportRelationshipLabelValue_RoadName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.definitions.labels.RoadTransportRelationshipLabelValue#getRoadClass <em>Road Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Road Class</em>'.
	 * @see org.eclipse.stem.definitions.labels.RoadTransportRelationshipLabelValue#getRoadClass()
	 * @see #getRoadTransportRelationshipLabelValue()
	 * @generated
	 */
	EAttribute getRoadTransportRelationshipLabelValue_RoadClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.definitions.labels.RoadTransportRelationshipLabelValue#getNumberCrossings <em>Number Crossings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Crossings</em>'.
	 * @see org.eclipse.stem.definitions.labels.RoadTransportRelationshipLabelValue#getNumberCrossings()
	 * @see #getRoadTransportRelationshipLabelValue()
	 * @generated
	 */
	EAttribute getRoadTransportRelationshipLabelValue_NumberCrossings();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.definitions.labels.EarthScienceLabel <em>Earth Science Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Earth Science Label</em>'.
	 * @see org.eclipse.stem.definitions.labels.EarthScienceLabel
	 * @generated
	 */
	EClass getEarthScienceLabel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.definitions.labels.EarthScienceLabel#getCurrentEarthScienceValue <em>Current Earth Science Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Earth Science Value</em>'.
	 * @see org.eclipse.stem.definitions.labels.EarthScienceLabel#getCurrentEarthScienceValue()
	 * @see #getEarthScienceLabel()
	 * @generated
	 */
	EReference getEarthScienceLabel_CurrentEarthScienceValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.definitions.labels.EarthScienceLabelValue <em>Earth Science Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Earth Science Label Value</em>'.
	 * @see org.eclipse.stem.definitions.labels.EarthScienceLabelValue
	 * @generated
	 */
	EClass getEarthScienceLabelValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getDataType()
	 * @see #getEarthScienceLabelValue()
	 * @generated
	 */
	EAttribute getEarthScienceLabelValue_DataType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units</em>'.
	 * @see org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getUnits()
	 * @see #getEarthScienceLabelValue()
	 * @generated
	 */
	EAttribute getEarthScienceLabelValue_Units();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mean</em>'.
	 * @see org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getMean()
	 * @see #getEarthScienceLabelValue()
	 * @generated
	 */
	EAttribute getEarthScienceLabelValue_Mean();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getSd <em>Sd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Sd</em>'.
	 * @see org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getSd()
	 * @see #getEarthScienceLabelValue()
	 * @generated
	 */
	EAttribute getEarthScienceLabelValue_Sd();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Min</em>'.
	 * @see org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getMin()
	 * @see #getEarthScienceLabelValue()
	 * @generated
	 */
	EAttribute getEarthScienceLabelValue_Min();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Max</em>'.
	 * @see org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getMax()
	 * @see #getEarthScienceLabelValue()
	 * @generated
	 */
	EAttribute getEarthScienceLabelValue_Max();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getMedian <em>Median</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Median</em>'.
	 * @see org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getMedian()
	 * @see #getEarthScienceLabelValue()
	 * @generated
	 */
	EAttribute getEarthScienceLabelValue_Median();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getSkewness <em>Skewness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Skewness</em>'.
	 * @see org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getSkewness()
	 * @see #getEarthScienceLabelValue()
	 * @generated
	 */
	EAttribute getEarthScienceLabelValue_Skewness();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getKurtosis <em>Kurtosis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Kurtosis</em>'.
	 * @see org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getKurtosis()
	 * @see #getEarthScienceLabelValue()
	 * @generated
	 */
	EAttribute getEarthScienceLabelValue_Kurtosis();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getRms <em>Rms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Rms</em>'.
	 * @see org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getRms()
	 * @see #getEarthScienceLabelValue()
	 * @generated
	 */
	EAttribute getEarthScienceLabelValue_Rms();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getSamplesize <em>Samplesize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Samplesize</em>'.
	 * @see org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getSamplesize()
	 * @see #getEarthScienceLabelValue()
	 * @generated
	 */
	EAttribute getEarthScienceLabelValue_Samplesize();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Range</em>'.
	 * @see org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getRange()
	 * @see #getEarthScienceLabelValue()
	 * @generated
	 */
	EAttribute getEarthScienceLabelValue_Range();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getValidYear <em>Valid Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Year</em>'.
	 * @see org.eclipse.stem.definitions.labels.EarthScienceLabelValue#getValidYear()
	 * @see #getEarthScienceLabelValue()
	 * @generated
	 */
	EAttribute getEarthScienceLabelValue_ValidYear();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.definitions.labels.GenericLabelValue <em>Generic Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Label Value</em>'.
	 * @see org.eclipse.stem.definitions.labels.GenericLabelValue
	 * @generated
	 */
	EClass getGenericLabelValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.definitions.labels.GenericLabelValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.stem.definitions.labels.GenericLabelValue#getValue()
	 * @see #getGenericLabelValue()
	 * @generated
	 */
	EAttribute getGenericLabelValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.definitions.labels.GenericLabelValue#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.eclipse.stem.definitions.labels.GenericLabelValue#getUnit()
	 * @see #getGenericLabelValue()
	 * @generated
	 */
	EAttribute getGenericLabelValue_Unit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.definitions.labels.GenericLabelValue#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measure</em>'.
	 * @see org.eclipse.stem.definitions.labels.GenericLabelValue#getMeasure()
	 * @see #getGenericLabelValue()
	 * @generated
	 */
	EAttribute getGenericLabelValue_Measure();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.definitions.labels.DoubleLabelValue <em>Double Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Label Value</em>'.
	 * @see org.eclipse.stem.definitions.labels.DoubleLabelValue
	 * @generated
	 */
	EClass getDoubleLabelValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.definitions.labels.IntegerLabelValue <em>Integer Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Label Value</em>'.
	 * @see org.eclipse.stem.definitions.labels.IntegerLabelValue
	 * @generated
	 */
	EClass getIntegerLabelValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.definitions.labels.LongLabelValue <em>Long Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Label Value</em>'.
	 * @see org.eclipse.stem.definitions.labels.LongLabelValue
	 * @generated
	 */
	EClass getLongLabelValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.definitions.labels.StringLabelValue <em>String Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Label Value</em>'.
	 * @see org.eclipse.stem.definitions.labels.StringLabelValue
	 * @generated
	 */
	EClass getStringLabelValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.definitions.labels.KeyValueLabelValue <em>Key Value Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Value Label Value</em>'.
	 * @see org.eclipse.stem.definitions.labels.KeyValueLabelValue
	 * @generated
	 */
	EClass getKeyValueLabelValue();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.stem.definitions.labels.RelativePhysicalRelationship <em>Relative Physical Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relative Physical Relationship</em>'.
	 * @see org.eclipse.stem.definitions.labels.RelativePhysicalRelationship
	 * @generated
	 */
	EEnum getRelativePhysicalRelationship();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.stem.definitions.labels.TransportMode <em>Transport Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transport Mode</em>'.
	 * @see org.eclipse.stem.definitions.labels.TransportMode
	 * @generated
	 */
	EEnum getTransportMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LabelsFactory getLabelsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals  {
		/**
		 * The meta object literal for the '{@link org.eclipse.stem.definitions.labels.impl.AreaLabelImpl <em>Area Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.definitions.labels.impl.AreaLabelImpl
		 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getAreaLabel()
		 * @generated
		 */
		EClass AREA_LABEL = eINSTANCE.getAreaLabel();

		/**
		 * The meta object literal for the '<em><b>Current Area Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA_LABEL__CURRENT_AREA_VALUE = eINSTANCE.getAreaLabel_CurrentAreaValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.definitions.labels.impl.AreaLabelValueImpl <em>Area Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.definitions.labels.impl.AreaLabelValueImpl
		 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getAreaLabelValue()
		 * @generated
		 */
		EClass AREA_LABEL_VALUE = eINSTANCE.getAreaLabelValue();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA_LABEL_VALUE__AREA = eINSTANCE.getAreaLabelValue_Area();

		/**
		 * The meta object literal for the '<em><b>Average Extent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA_LABEL_VALUE__AVERAGE_EXTENT = eINSTANCE.getAreaLabelValue_AverageExtent();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.definitions.labels.impl.CommonBorderRelationshipLabelImpl <em>Common Border Relationship Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.definitions.labels.impl.CommonBorderRelationshipLabelImpl
		 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getCommonBorderRelationshipLabel()
		 * @generated
		 */
		EClass COMMON_BORDER_RELATIONSHIP_LABEL = eINSTANCE.getCommonBorderRelationshipLabel();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.definitions.labels.impl.CommonBorderRelationshipLabelValueImpl <em>Common Border Relationship Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.definitions.labels.impl.CommonBorderRelationshipLabelValueImpl
		 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getCommonBorderRelationshipLabelValue()
		 * @generated
		 */
		EClass COMMON_BORDER_RELATIONSHIP_LABEL_VALUE = eINSTANCE.getCommonBorderRelationshipLabelValue();

		/**
		 * The meta object literal for the '<em><b>Border Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_BORDER_RELATIONSHIP_LABEL_VALUE__BORDER_LENGTH = eINSTANCE.getCommonBorderRelationshipLabelValue_BorderLength();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.definitions.labels.impl.PhysicalRelationshipLabelImpl <em>Physical Relationship Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.definitions.labels.impl.PhysicalRelationshipLabelImpl
		 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getPhysicalRelationshipLabel()
		 * @generated
		 */
		EClass PHYSICAL_RELATIONSHIP_LABEL = eINSTANCE.getPhysicalRelationshipLabel();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.definitions.labels.impl.PopulationLabelImpl <em>Population Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.definitions.labels.impl.PopulationLabelImpl
		 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getPopulationLabel()
		 * @generated
		 */
		EClass POPULATION_LABEL = eINSTANCE.getPopulationLabel();

		/**
		 * The meta object literal for the '<em><b>Population Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POPULATION_LABEL__POPULATION_IDENTIFIER = eINSTANCE.getPopulationLabel_PopulationIdentifier();

		/**
		 * The meta object literal for the '<em><b>Current Population Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POPULATION_LABEL__CURRENT_POPULATION_VALUE = eINSTANCE.getPopulationLabel_CurrentPopulationValue();

		/**
		 * The meta object literal for the '<em><b>Populated Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POPULATION_LABEL__POPULATED_AREA = eINSTANCE.getPopulationLabel_PopulatedArea();

		/**
		 * The meta object literal for the '<em><b>Valid Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POPULATION_LABEL__VALID_YEAR = eINSTANCE.getPopulationLabel_ValidYear();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.definitions.labels.impl.PopulationLabelValueImpl <em>Population Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.definitions.labels.impl.PopulationLabelValueImpl
		 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getPopulationLabelValue()
		 * @generated
		 */
		EClass POPULATION_LABEL_VALUE = eINSTANCE.getPopulationLabelValue();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POPULATION_LABEL_VALUE__COUNT = eINSTANCE.getPopulationLabelValue_Count();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.definitions.labels.impl.RelativePhysicalRelationshipLabelImpl <em>Relative Physical Relationship Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.definitions.labels.impl.RelativePhysicalRelationshipLabelImpl
		 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getRelativePhysicalRelationshipLabel()
		 * @generated
		 */
		EClass RELATIVE_PHYSICAL_RELATIONSHIP_LABEL = eINSTANCE.getRelativePhysicalRelationshipLabel();

		/**
		 * The meta object literal for the '<em><b>Current Relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIVE_PHYSICAL_RELATIONSHIP_LABEL__CURRENT_RELATIONSHIP = eINSTANCE.getRelativePhysicalRelationshipLabel_CurrentRelationship();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.definitions.labels.impl.RelativePhysicalRelationshipLabelValueImpl <em>Relative Physical Relationship Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.definitions.labels.impl.RelativePhysicalRelationshipLabelValueImpl
		 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getRelativePhysicalRelationshipLabelValue()
		 * @generated
		 */
		EClass RELATIVE_PHYSICAL_RELATIONSHIP_LABEL_VALUE = eINSTANCE.getRelativePhysicalRelationshipLabelValue();

		/**
		 * The meta object literal for the '<em><b>Adjacent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_PHYSICAL_RELATIONSHIP_LABEL_VALUE__ADJACENT = eINSTANCE.getRelativePhysicalRelationshipLabelValue_Adjacent();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_PHYSICAL_RELATIONSHIP_LABEL_VALUE__RELATIONSHIP = eINSTANCE.getRelativePhysicalRelationshipLabelValue_Relationship();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.definitions.labels.impl.TransportRelationshipLabelImpl <em>Transport Relationship Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.definitions.labels.impl.TransportRelationshipLabelImpl
		 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getTransportRelationshipLabel()
		 * @generated
		 */
		EClass TRANSPORT_RELATIONSHIP_LABEL = eINSTANCE.getTransportRelationshipLabel();

		/**
		 * The meta object literal for the '<em><b>Transport Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORT_RELATIONSHIP_LABEL__TRANSPORT_MODE = eINSTANCE.getTransportRelationshipLabel_TransportMode();

		/**
		 * The meta object literal for the '<em><b>Population Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORT_RELATIONSHIP_LABEL__POPULATION_IDENTIFIER = eINSTANCE.getTransportRelationshipLabel_PopulationIdentifier();

		/**
		 * The meta object literal for the '<em><b>Transport Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORT_RELATIONSHIP_LABEL__TRANSPORT_IDENTIFIER = eINSTANCE.getTransportRelationshipLabel_TransportIdentifier();

		/**
		 * The meta object literal for the '<em><b>Current Transport Relationship Label Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORT_RELATIONSHIP_LABEL__CURRENT_TRANSPORT_RELATIONSHIP_LABEL_VALUE = eINSTANCE.getTransportRelationshipLabel_CurrentTransportRelationshipLabelValue();

		/**
		 * The meta object literal for the '<em><b>Rate Time Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORT_RELATIONSHIP_LABEL__RATE_TIME_PERIOD = eINSTANCE.getTransportRelationshipLabel_RateTimePeriod();

		/**
		 * The meta object literal for the '<em><b>Departure Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORT_RELATIONSHIP_LABEL__DEPARTURE_CAPACITY = eINSTANCE.getTransportRelationshipLabel_DepartureCapacity();

		/**
		 * The meta object literal for the '<em><b>Maximum Departure Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORT_RELATIONSHIP_LABEL__MAXIMUM_DEPARTURE_CAPACITY = eINSTANCE.getTransportRelationshipLabel_MaximumDepartureCapacity();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORT_RELATIONSHIP_LABEL__CAPACITY = eINSTANCE.getTransportRelationshipLabel_Capacity();

		/**
		 * The meta object literal for the '<em><b>Maximum Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORT_RELATIONSHIP_LABEL__MAXIMUM_CAPACITY = eINSTANCE.getTransportRelationshipLabel_MaximumCapacity();

		/**
		 * The meta object literal for the '<em><b>Transit Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORT_RELATIONSHIP_LABEL__TRANSIT_TIME = eINSTANCE.getTransportRelationshipLabel_TransitTime();

		/**
		 * The meta object literal for the '<em><b>Start Up Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORT_RELATIONSHIP_LABEL__START_UP_DELAY = eINSTANCE.getTransportRelationshipLabel_StartUpDelay();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.definitions.labels.impl.TransportRelationshipLabelValueImpl <em>Transport Relationship Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.definitions.labels.impl.TransportRelationshipLabelValueImpl
		 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getTransportRelationshipLabelValue()
		 * @generated
		 */
		EClass TRANSPORT_RELATIONSHIP_LABEL_VALUE = eINSTANCE.getTransportRelationshipLabelValue();

		/**
		 * The meta object literal for the '<em><b>Available Departure Capacity Proportion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORT_RELATIONSHIP_LABEL_VALUE__AVAILABLE_DEPARTURE_CAPACITY_PROPORTION = eINSTANCE.getTransportRelationshipLabelValue_AvailableDepartureCapacityProportion();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.definitions.labels.impl.PhysicalRelationshipLabelValueImpl <em>Physical Relationship Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.definitions.labels.impl.PhysicalRelationshipLabelValueImpl
		 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getPhysicalRelationshipLabelValue()
		 * @generated
		 */
		EClass PHYSICAL_RELATIONSHIP_LABEL_VALUE = eINSTANCE.getPhysicalRelationshipLabelValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.definitions.labels.impl.RoadTransportRelationshipLabelImpl <em>Road Transport Relationship Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.definitions.labels.impl.RoadTransportRelationshipLabelImpl
		 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getRoadTransportRelationshipLabel()
		 * @generated
		 */
		EClass ROAD_TRANSPORT_RELATIONSHIP_LABEL = eINSTANCE.getRoadTransportRelationshipLabel();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.definitions.labels.impl.RoadTransportRelationshipLabelValueImpl <em>Road Transport Relationship Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.definitions.labels.impl.RoadTransportRelationshipLabelValueImpl
		 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getRoadTransportRelationshipLabelValue()
		 * @generated
		 */
		EClass ROAD_TRANSPORT_RELATIONSHIP_LABEL_VALUE = eINSTANCE.getRoadTransportRelationshipLabelValue();

		/**
		 * The meta object literal for the '<em><b>Road Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROAD_TRANSPORT_RELATIONSHIP_LABEL_VALUE__ROAD_NAME = eINSTANCE.getRoadTransportRelationshipLabelValue_RoadName();

		/**
		 * The meta object literal for the '<em><b>Road Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROAD_TRANSPORT_RELATIONSHIP_LABEL_VALUE__ROAD_CLASS = eINSTANCE.getRoadTransportRelationshipLabelValue_RoadClass();

		/**
		 * The meta object literal for the '<em><b>Number Crossings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROAD_TRANSPORT_RELATIONSHIP_LABEL_VALUE__NUMBER_CROSSINGS = eINSTANCE.getRoadTransportRelationshipLabelValue_NumberCrossings();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.definitions.labels.impl.EarthScienceLabelImpl <em>Earth Science Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.definitions.labels.impl.EarthScienceLabelImpl
		 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getEarthScienceLabel()
		 * @generated
		 */
		EClass EARTH_SCIENCE_LABEL = eINSTANCE.getEarthScienceLabel();

		/**
		 * The meta object literal for the '<em><b>Current Earth Science Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EARTH_SCIENCE_LABEL__CURRENT_EARTH_SCIENCE_VALUE = eINSTANCE.getEarthScienceLabel_CurrentEarthScienceValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.definitions.labels.impl.EarthScienceLabelValueImpl <em>Earth Science Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.definitions.labels.impl.EarthScienceLabelValueImpl
		 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getEarthScienceLabelValue()
		 * @generated
		 */
		EClass EARTH_SCIENCE_LABEL_VALUE = eINSTANCE.getEarthScienceLabelValue();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EARTH_SCIENCE_LABEL_VALUE__DATA_TYPE = eINSTANCE.getEarthScienceLabelValue_DataType();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EARTH_SCIENCE_LABEL_VALUE__UNITS = eINSTANCE.getEarthScienceLabelValue_Units();

		/**
		 * The meta object literal for the '<em><b>Mean</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EARTH_SCIENCE_LABEL_VALUE__MEAN = eINSTANCE.getEarthScienceLabelValue_Mean();

		/**
		 * The meta object literal for the '<em><b>Sd</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EARTH_SCIENCE_LABEL_VALUE__SD = eINSTANCE.getEarthScienceLabelValue_Sd();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EARTH_SCIENCE_LABEL_VALUE__MIN = eINSTANCE.getEarthScienceLabelValue_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EARTH_SCIENCE_LABEL_VALUE__MAX = eINSTANCE.getEarthScienceLabelValue_Max();

		/**
		 * The meta object literal for the '<em><b>Median</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EARTH_SCIENCE_LABEL_VALUE__MEDIAN = eINSTANCE.getEarthScienceLabelValue_Median();

		/**
		 * The meta object literal for the '<em><b>Skewness</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EARTH_SCIENCE_LABEL_VALUE__SKEWNESS = eINSTANCE.getEarthScienceLabelValue_Skewness();

		/**
		 * The meta object literal for the '<em><b>Kurtosis</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EARTH_SCIENCE_LABEL_VALUE__KURTOSIS = eINSTANCE.getEarthScienceLabelValue_Kurtosis();

		/**
		 * The meta object literal for the '<em><b>Rms</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EARTH_SCIENCE_LABEL_VALUE__RMS = eINSTANCE.getEarthScienceLabelValue_Rms();

		/**
		 * The meta object literal for the '<em><b>Samplesize</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EARTH_SCIENCE_LABEL_VALUE__SAMPLESIZE = eINSTANCE.getEarthScienceLabelValue_Samplesize();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EARTH_SCIENCE_LABEL_VALUE__RANGE = eINSTANCE.getEarthScienceLabelValue_Range();

		/**
		 * The meta object literal for the '<em><b>Valid Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EARTH_SCIENCE_LABEL_VALUE__VALID_YEAR = eINSTANCE.getEarthScienceLabelValue_ValidYear();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.definitions.labels.impl.GenericLabelValueImpl <em>Generic Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.definitions.labels.impl.GenericLabelValueImpl
		 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getGenericLabelValue()
		 * @generated
		 */
		EClass GENERIC_LABEL_VALUE = eINSTANCE.getGenericLabelValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_LABEL_VALUE__VALUE = eINSTANCE.getGenericLabelValue_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_LABEL_VALUE__UNIT = eINSTANCE.getGenericLabelValue_Unit();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_LABEL_VALUE__MEASURE = eINSTANCE.getGenericLabelValue_Measure();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.definitions.labels.impl.DoubleLabelValueImpl <em>Double Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.definitions.labels.impl.DoubleLabelValueImpl
		 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getDoubleLabelValue()
		 * @generated
		 */
		EClass DOUBLE_LABEL_VALUE = eINSTANCE.getDoubleLabelValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.definitions.labels.impl.IntegerLabelValueImpl <em>Integer Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.definitions.labels.impl.IntegerLabelValueImpl
		 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getIntegerLabelValue()
		 * @generated
		 */
		EClass INTEGER_LABEL_VALUE = eINSTANCE.getIntegerLabelValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.definitions.labels.impl.LongLabelValueImpl <em>Long Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.definitions.labels.impl.LongLabelValueImpl
		 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getLongLabelValue()
		 * @generated
		 */
		EClass LONG_LABEL_VALUE = eINSTANCE.getLongLabelValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.definitions.labels.impl.StringLabelValueImpl <em>String Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.definitions.labels.impl.StringLabelValueImpl
		 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getStringLabelValue()
		 * @generated
		 */
		EClass STRING_LABEL_VALUE = eINSTANCE.getStringLabelValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.definitions.labels.impl.KeyValueLabelValueImpl <em>Key Value Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.definitions.labels.impl.KeyValueLabelValueImpl
		 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getKeyValueLabelValue()
		 * @generated
		 */
		EClass KEY_VALUE_LABEL_VALUE = eINSTANCE.getKeyValueLabelValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.definitions.labels.RelativePhysicalRelationship <em>Relative Physical Relationship</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.definitions.labels.RelativePhysicalRelationship
		 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getRelativePhysicalRelationship()
		 * @generated
		 */
		EEnum RELATIVE_PHYSICAL_RELATIONSHIP = eINSTANCE.getRelativePhysicalRelationship();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.definitions.labels.TransportMode <em>Transport Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.definitions.labels.TransportMode
		 * @see org.eclipse.stem.definitions.labels.impl.LabelsPackageImpl#getTransportMode()
		 * @generated
		 */
		EEnum TRANSPORT_MODE = eINSTANCE.getTransportMode();

	}

} //LabelsPackage
