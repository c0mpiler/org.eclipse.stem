package org.eclipse.stem.interventions;

/******************************************************************************* 
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     IBM Corporation - initial API and implementation 
 *******************************************************************************/

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.stem.core.graph.GraphPackage;
import org.eclipse.stem.graphgenerators.GraphgeneratorsPackage;

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
 * @see org.eclipse.stem.interventions.InterventionsFactory
 * @model kind="package"
 * @generated
 */
public interface InterventionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "interventions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/stem/interventions.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.stem.interventions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InterventionsPackage eINSTANCE = org.eclipse.stem.interventions.impl.InterventionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.stem.interventions.impl.InterventionLabelImpl <em>Intervention Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.interventions.impl.InterventionLabelImpl
	 * @see org.eclipse.stem.interventions.impl.InterventionsPackageImpl#getInterventionLabel()
	 * @generated
	 */
	int INTERVENTION_LABEL = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENTION_LABEL__URI = GraphPackage.STATIC_NODE_LABEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENTION_LABEL__TYPE_URI = GraphPackage.STATIC_NODE_LABEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENTION_LABEL__DUBLIN_CORE = GraphPackage.STATIC_NODE_LABEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>URI Of Identifiable To Be Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENTION_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED = GraphPackage.STATIC_NODE_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENTION_LABEL__CURRENT_VALUE = GraphPackage.STATIC_NODE_LABEL__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Identifiable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENTION_LABEL__IDENTIFIABLE = GraphPackage.STATIC_NODE_LABEL__IDENTIFIABLE;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENTION_LABEL__NODE = GraphPackage.STATIC_NODE_LABEL__NODE;

	/**
	 * The number of structural features of the '<em>Intervention Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENTION_LABEL_FEATURE_COUNT = GraphPackage.STATIC_NODE_LABEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.interventions.impl.StandardInterventionLabelImpl <em>Standard Intervention Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.interventions.impl.StandardInterventionLabelImpl
	 * @see org.eclipse.stem.interventions.impl.InterventionsPackageImpl#getStandardInterventionLabel()
	 * @generated
	 */
	int STANDARD_INTERVENTION_LABEL = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INTERVENTION_LABEL__URI = INTERVENTION_LABEL__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INTERVENTION_LABEL__TYPE_URI = INTERVENTION_LABEL__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INTERVENTION_LABEL__DUBLIN_CORE = INTERVENTION_LABEL__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>URI Of Identifiable To Be Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INTERVENTION_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED = INTERVENTION_LABEL__URI_OF_IDENTIFIABLE_TO_BE_LABELED;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INTERVENTION_LABEL__CURRENT_VALUE = INTERVENTION_LABEL__CURRENT_VALUE;

	/**
	 * The feature id for the '<em><b>Identifiable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INTERVENTION_LABEL__IDENTIFIABLE = INTERVENTION_LABEL__IDENTIFIABLE;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INTERVENTION_LABEL__NODE = INTERVENTION_LABEL__NODE;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INTERVENTION_LABEL__POPULATION_IDENTIFIER = INTERVENTION_LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Standard Intervention Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INTERVENTION_LABEL_FEATURE_COUNT = INTERVENTION_LABEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.interventions.impl.ControlGraphGeneratorImpl <em>Control Graph Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.interventions.impl.ControlGraphGeneratorImpl
	 * @see org.eclipse.stem.interventions.impl.InterventionsPackageImpl#getControlGraphGenerator()
	 * @generated
	 */
	int CONTROL_GRAPH_GENERATOR = 2;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GRAPH_GENERATOR__URI = GraphgeneratorsPackage.GRAPH_GENERATOR__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GRAPH_GENERATOR__TYPE_URI = GraphgeneratorsPackage.GRAPH_GENERATOR__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GRAPH_GENERATOR__DUBLIN_CORE = GraphgeneratorsPackage.GRAPH_GENERATOR__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Vaccination Fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GRAPH_GENERATOR__VACCINATION_FRACTION = GraphgeneratorsPackage.GRAPH_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Isolation Fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GRAPH_GENERATOR__ISOLATION_FRACTION = GraphgeneratorsPackage.GRAPH_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GRAPH_GENERATOR__POPULATION_IDENTIFIER = GraphgeneratorsPackage.GRAPH_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GRAPH_GENERATOR__LOCATION = GraphgeneratorsPackage.GRAPH_GENERATOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Control Graph Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_GRAPH_GENERATOR_FEATURE_COUNT = GraphgeneratorsPackage.GRAPH_GENERATOR_FEATURE_COUNT + 4;


	/**
	 * The meta object id for the '{@link org.eclipse.stem.interventions.impl.InterventionLabelValueImpl <em>Intervention Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.interventions.impl.InterventionLabelValueImpl
	 * @see org.eclipse.stem.interventions.impl.InterventionsPackageImpl#getInterventionLabelValue()
	 * @generated
	 */
	int INTERVENTION_LABEL_VALUE = 3;

	/**
	 * The number of structural features of the '<em>Intervention Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENTION_LABEL_VALUE_FEATURE_COUNT = GraphPackage.LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.interventions.impl.StandardInterventionLabelValueImpl <em>Standard Intervention Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.interventions.impl.StandardInterventionLabelValueImpl
	 * @see org.eclipse.stem.interventions.impl.InterventionsPackageImpl#getStandardInterventionLabelValue()
	 * @generated
	 */
	int STANDARD_INTERVENTION_LABEL_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Vaccinations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INTERVENTION_LABEL_VALUE__VACCINATIONS = INTERVENTION_LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Isolations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INTERVENTION_LABEL_VALUE__ISOLATIONS = INTERVENTION_LABEL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Standard Intervention Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_INTERVENTION_LABEL_VALUE_FEATURE_COUNT = INTERVENTION_LABEL_VALUE_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link org.eclipse.stem.interventions.impl.StandardPeriodicInterventionLabelValueImpl <em>Standard Periodic Intervention Label Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.interventions.impl.StandardPeriodicInterventionLabelValueImpl
	 * @see org.eclipse.stem.interventions.impl.InterventionsPackageImpl#getStandardPeriodicInterventionLabelValue()
	 * @generated
	 */
	int STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Absolute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__ABSOLUTE = INTERVENTION_LABEL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__PERIOD = INTERVENTION_LABEL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vaccinations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__VACCINATIONS = INTERVENTION_LABEL_VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Isolations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__ISOLATIONS = INTERVENTION_LABEL_VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Standard Periodic Intervention Label Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE_FEATURE_COUNT = INTERVENTION_LABEL_VALUE_FEATURE_COUNT + 4;


	/**
	 * The meta object id for the '{@link org.eclipse.stem.interventions.impl.PeriodicControlGraphGeneratorImpl <em>Periodic Control Graph Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.interventions.impl.PeriodicControlGraphGeneratorImpl
	 * @see org.eclipse.stem.interventions.impl.InterventionsPackageImpl#getPeriodicControlGraphGenerator()
	 * @generated
	 */
	int PERIODIC_CONTROL_GRAPH_GENERATOR = 6;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_CONTROL_GRAPH_GENERATOR__URI = GraphgeneratorsPackage.GRAPH_GENERATOR__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_CONTROL_GRAPH_GENERATOR__TYPE_URI = GraphgeneratorsPackage.GRAPH_GENERATOR__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_CONTROL_GRAPH_GENERATOR__DUBLIN_CORE = GraphgeneratorsPackage.GRAPH_GENERATOR__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Population Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_CONTROL_GRAPH_GENERATOR__POPULATION_IDENTIFIER = GraphgeneratorsPackage.GRAPH_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_CONTROL_GRAPH_GENERATOR__DATA_PATH = GraphgeneratorsPackage.GRAPH_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_CONTROL_GRAPH_GENERATOR__PERIOD = GraphgeneratorsPackage.GRAPH_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Use Vaccinations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_CONTROL_GRAPH_GENERATOR__USE_VACCINATIONS = GraphgeneratorsPackage.GRAPH_GENERATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_CONTROL_GRAPH_GENERATOR__FRACTION = GraphgeneratorsPackage.GRAPH_GENERATOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Periodic Control Graph Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_CONTROL_GRAPH_GENERATOR_FEATURE_COUNT = GraphgeneratorsPackage.GRAPH_GENERATOR_FEATURE_COUNT + 5;


	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.interventions.InterventionLabel <em>Intervention Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intervention Label</em>'.
	 * @see org.eclipse.stem.interventions.InterventionLabel
	 * @generated
	 */
	EClass getInterventionLabel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.interventions.StandardInterventionLabel <em>Standard Intervention Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Intervention Label</em>'.
	 * @see org.eclipse.stem.interventions.StandardInterventionLabel
	 * @generated
	 */
	EClass getStandardInterventionLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.interventions.StandardInterventionLabel#getPopulationIdentifier <em>Population Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Population Identifier</em>'.
	 * @see org.eclipse.stem.interventions.StandardInterventionLabel#getPopulationIdentifier()
	 * @see #getStandardInterventionLabel()
	 * @generated
	 */
	EAttribute getStandardInterventionLabel_PopulationIdentifier();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.interventions.ControlGraphGenerator <em>Control Graph Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Graph Generator</em>'.
	 * @see org.eclipse.stem.interventions.ControlGraphGenerator
	 * @generated
	 */
	EClass getControlGraphGenerator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.interventions.ControlGraphGenerator#getVaccinationFraction <em>Vaccination Fraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vaccination Fraction</em>'.
	 * @see org.eclipse.stem.interventions.ControlGraphGenerator#getVaccinationFraction()
	 * @see #getControlGraphGenerator()
	 * @generated
	 */
	EAttribute getControlGraphGenerator_VaccinationFraction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.interventions.ControlGraphGenerator#getIsolationFraction <em>Isolation Fraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isolation Fraction</em>'.
	 * @see org.eclipse.stem.interventions.ControlGraphGenerator#getIsolationFraction()
	 * @see #getControlGraphGenerator()
	 * @generated
	 */
	EAttribute getControlGraphGenerator_IsolationFraction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.interventions.ControlGraphGenerator#getPopulationIdentifier <em>Population Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Population Identifier</em>'.
	 * @see org.eclipse.stem.interventions.ControlGraphGenerator#getPopulationIdentifier()
	 * @see #getControlGraphGenerator()
	 * @generated
	 */
	EAttribute getControlGraphGenerator_PopulationIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.interventions.ControlGraphGenerator#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.eclipse.stem.interventions.ControlGraphGenerator#getLocation()
	 * @see #getControlGraphGenerator()
	 * @generated
	 */
	EAttribute getControlGraphGenerator_Location();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.interventions.InterventionLabelValue <em>Intervention Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intervention Label Value</em>'.
	 * @see org.eclipse.stem.interventions.InterventionLabelValue
	 * @generated
	 */
	EClass getInterventionLabelValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.interventions.StandardInterventionLabelValue <em>Standard Intervention Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Intervention Label Value</em>'.
	 * @see org.eclipse.stem.interventions.StandardInterventionLabelValue
	 * @generated
	 */
	EClass getStandardInterventionLabelValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.interventions.StandardInterventionLabelValue#getVaccinations <em>Vaccinations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vaccinations</em>'.
	 * @see org.eclipse.stem.interventions.StandardInterventionLabelValue#getVaccinations()
	 * @see #getStandardInterventionLabelValue()
	 * @generated
	 */
	EAttribute getStandardInterventionLabelValue_Vaccinations();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.interventions.StandardInterventionLabelValue#getIsolations <em>Isolations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isolations</em>'.
	 * @see org.eclipse.stem.interventions.StandardInterventionLabelValue#getIsolations()
	 * @see #getStandardInterventionLabelValue()
	 * @generated
	 */
	EAttribute getStandardInterventionLabelValue_Isolations();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.interventions.StandardPeriodicInterventionLabelValue <em>Standard Periodic Intervention Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Periodic Intervention Label Value</em>'.
	 * @see org.eclipse.stem.interventions.StandardPeriodicInterventionLabelValue
	 * @generated
	 */
	EClass getStandardPeriodicInterventionLabelValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.interventions.StandardPeriodicInterventionLabelValue#isAbsolute <em>Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Absolute</em>'.
	 * @see org.eclipse.stem.interventions.StandardPeriodicInterventionLabelValue#isAbsolute()
	 * @see #getStandardPeriodicInterventionLabelValue()
	 * @generated
	 */
	EAttribute getStandardPeriodicInterventionLabelValue_Absolute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.interventions.StandardPeriodicInterventionLabelValue#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see org.eclipse.stem.interventions.StandardPeriodicInterventionLabelValue#getPeriod()
	 * @see #getStandardPeriodicInterventionLabelValue()
	 * @generated
	 */
	EAttribute getStandardPeriodicInterventionLabelValue_Period();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.stem.interventions.StandardPeriodicInterventionLabelValue#getVaccinations <em>Vaccinations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Vaccinations</em>'.
	 * @see org.eclipse.stem.interventions.StandardPeriodicInterventionLabelValue#getVaccinations()
	 * @see #getStandardPeriodicInterventionLabelValue()
	 * @generated
	 */
	EAttribute getStandardPeriodicInterventionLabelValue_Vaccinations();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.stem.interventions.StandardPeriodicInterventionLabelValue#getIsolations <em>Isolations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Isolations</em>'.
	 * @see org.eclipse.stem.interventions.StandardPeriodicInterventionLabelValue#getIsolations()
	 * @see #getStandardPeriodicInterventionLabelValue()
	 * @generated
	 */
	EAttribute getStandardPeriodicInterventionLabelValue_Isolations();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.interventions.PeriodicControlGraphGenerator <em>Periodic Control Graph Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periodic Control Graph Generator</em>'.
	 * @see org.eclipse.stem.interventions.PeriodicControlGraphGenerator
	 * @generated
	 */
	EClass getPeriodicControlGraphGenerator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.interventions.PeriodicControlGraphGenerator#getPopulationIdentifier <em>Population Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Population Identifier</em>'.
	 * @see org.eclipse.stem.interventions.PeriodicControlGraphGenerator#getPopulationIdentifier()
	 * @see #getPeriodicControlGraphGenerator()
	 * @generated
	 */
	EAttribute getPeriodicControlGraphGenerator_PopulationIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.interventions.PeriodicControlGraphGenerator#getDataPath <em>Data Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Path</em>'.
	 * @see org.eclipse.stem.interventions.PeriodicControlGraphGenerator#getDataPath()
	 * @see #getPeriodicControlGraphGenerator()
	 * @generated
	 */
	EAttribute getPeriodicControlGraphGenerator_DataPath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.interventions.PeriodicControlGraphGenerator#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see org.eclipse.stem.interventions.PeriodicControlGraphGenerator#getPeriod()
	 * @see #getPeriodicControlGraphGenerator()
	 * @generated
	 */
	EAttribute getPeriodicControlGraphGenerator_Period();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.interventions.PeriodicControlGraphGenerator#isUseVaccinations <em>Use Vaccinations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Vaccinations</em>'.
	 * @see org.eclipse.stem.interventions.PeriodicControlGraphGenerator#isUseVaccinations()
	 * @see #getPeriodicControlGraphGenerator()
	 * @generated
	 */
	EAttribute getPeriodicControlGraphGenerator_UseVaccinations();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.interventions.PeriodicControlGraphGenerator#isFraction <em>Fraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fraction</em>'.
	 * @see org.eclipse.stem.interventions.PeriodicControlGraphGenerator#isFraction()
	 * @see #getPeriodicControlGraphGenerator()
	 * @generated
	 */
	EAttribute getPeriodicControlGraphGenerator_Fraction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InterventionsFactory getInterventionsFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.stem.interventions.impl.InterventionLabelImpl <em>Intervention Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.interventions.impl.InterventionLabelImpl
		 * @see org.eclipse.stem.interventions.impl.InterventionsPackageImpl#getInterventionLabel()
		 * @generated
		 */
		EClass INTERVENTION_LABEL = eINSTANCE.getInterventionLabel();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.interventions.impl.StandardInterventionLabelImpl <em>Standard Intervention Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.interventions.impl.StandardInterventionLabelImpl
		 * @see org.eclipse.stem.interventions.impl.InterventionsPackageImpl#getStandardInterventionLabel()
		 * @generated
		 */
		EClass STANDARD_INTERVENTION_LABEL = eINSTANCE.getStandardInterventionLabel();

		/**
		 * The meta object literal for the '<em><b>Population Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_INTERVENTION_LABEL__POPULATION_IDENTIFIER = eINSTANCE.getStandardInterventionLabel_PopulationIdentifier();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.interventions.impl.ControlGraphGeneratorImpl <em>Control Graph Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.interventions.impl.ControlGraphGeneratorImpl
		 * @see org.eclipse.stem.interventions.impl.InterventionsPackageImpl#getControlGraphGenerator()
		 * @generated
		 */
		EClass CONTROL_GRAPH_GENERATOR = eINSTANCE.getControlGraphGenerator();

		/**
		 * The meta object literal for the '<em><b>Vaccination Fraction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_GRAPH_GENERATOR__VACCINATION_FRACTION = eINSTANCE.getControlGraphGenerator_VaccinationFraction();

		/**
		 * The meta object literal for the '<em><b>Isolation Fraction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_GRAPH_GENERATOR__ISOLATION_FRACTION = eINSTANCE.getControlGraphGenerator_IsolationFraction();

		/**
		 * The meta object literal for the '<em><b>Population Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_GRAPH_GENERATOR__POPULATION_IDENTIFIER = eINSTANCE.getControlGraphGenerator_PopulationIdentifier();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_GRAPH_GENERATOR__LOCATION = eINSTANCE.getControlGraphGenerator_Location();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.interventions.impl.InterventionLabelValueImpl <em>Intervention Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.interventions.impl.InterventionLabelValueImpl
		 * @see org.eclipse.stem.interventions.impl.InterventionsPackageImpl#getInterventionLabelValue()
		 * @generated
		 */
		EClass INTERVENTION_LABEL_VALUE = eINSTANCE.getInterventionLabelValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.interventions.impl.StandardInterventionLabelValueImpl <em>Standard Intervention Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.interventions.impl.StandardInterventionLabelValueImpl
		 * @see org.eclipse.stem.interventions.impl.InterventionsPackageImpl#getStandardInterventionLabelValue()
		 * @generated
		 */
		EClass STANDARD_INTERVENTION_LABEL_VALUE = eINSTANCE.getStandardInterventionLabelValue();

		/**
		 * The meta object literal for the '<em><b>Vaccinations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_INTERVENTION_LABEL_VALUE__VACCINATIONS = eINSTANCE.getStandardInterventionLabelValue_Vaccinations();

		/**
		 * The meta object literal for the '<em><b>Isolations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_INTERVENTION_LABEL_VALUE__ISOLATIONS = eINSTANCE.getStandardInterventionLabelValue_Isolations();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.interventions.impl.StandardPeriodicInterventionLabelValueImpl <em>Standard Periodic Intervention Label Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.interventions.impl.StandardPeriodicInterventionLabelValueImpl
		 * @see org.eclipse.stem.interventions.impl.InterventionsPackageImpl#getStandardPeriodicInterventionLabelValue()
		 * @generated
		 */
		EClass STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE = eINSTANCE.getStandardPeriodicInterventionLabelValue();

		/**
		 * The meta object literal for the '<em><b>Absolute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__ABSOLUTE = eINSTANCE.getStandardPeriodicInterventionLabelValue_Absolute();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__PERIOD = eINSTANCE.getStandardPeriodicInterventionLabelValue_Period();

		/**
		 * The meta object literal for the '<em><b>Vaccinations</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__VACCINATIONS = eINSTANCE.getStandardPeriodicInterventionLabelValue_Vaccinations();

		/**
		 * The meta object literal for the '<em><b>Isolations</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE__ISOLATIONS = eINSTANCE.getStandardPeriodicInterventionLabelValue_Isolations();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.interventions.impl.PeriodicControlGraphGeneratorImpl <em>Periodic Control Graph Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.interventions.impl.PeriodicControlGraphGeneratorImpl
		 * @see org.eclipse.stem.interventions.impl.InterventionsPackageImpl#getPeriodicControlGraphGenerator()
		 * @generated
		 */
		EClass PERIODIC_CONTROL_GRAPH_GENERATOR = eINSTANCE.getPeriodicControlGraphGenerator();

		/**
		 * The meta object literal for the '<em><b>Population Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODIC_CONTROL_GRAPH_GENERATOR__POPULATION_IDENTIFIER = eINSTANCE.getPeriodicControlGraphGenerator_PopulationIdentifier();

		/**
		 * The meta object literal for the '<em><b>Data Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODIC_CONTROL_GRAPH_GENERATOR__DATA_PATH = eINSTANCE.getPeriodicControlGraphGenerator_DataPath();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODIC_CONTROL_GRAPH_GENERATOR__PERIOD = eINSTANCE.getPeriodicControlGraphGenerator_Period();

		/**
		 * The meta object literal for the '<em><b>Use Vaccinations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODIC_CONTROL_GRAPH_GENERATOR__USE_VACCINATIONS = eINSTANCE.getPeriodicControlGraphGenerator_UseVaccinations();

		/**
		 * The meta object literal for the '<em><b>Fraction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODIC_CONTROL_GRAPH_GENERATOR__FRACTION = eINSTANCE.getPeriodicControlGraphGenerator_Fraction();

	}

} //InterventionsPackage
