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
package org.eclipse.stem.model.metamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.stem.model.metamodel.MetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface MetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/stem/model/metamodel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.stem.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetamodelPackage eINSTANCE = org.eclipse.stem.model.metamodel.impl.MetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.stem.model.metamodel.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.model.metamodel.impl.PackageImpl
	 * @see org.eclipse.stem.model.metamodel.impl.MetamodelPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Package Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGE_PREFIX = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__MODELS = 2;

	/**
	 * The feature id for the '<em><b>Compartment Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__COMPARTMENT_GROUPS = 3;

	/**
	 * The feature id for the '<em><b>Generator Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__GENERATOR_SETTINGS = 4;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.model.metamodel.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.model.metamodel.impl.ModelImpl
	 * @see org.eclipse.stem.model.metamodel.impl.MetamodelPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Model Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MODEL_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CLASS = 2;

	/**
	 * The feature id for the '<em><b>Parent Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PARENT_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PARAMETERS = 4;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TRANSITIONS = 5;

	/**
	 * The feature id for the '<em><b>Compartments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__COMPARTMENTS = 6;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__AUTHOR = 7;

	/**
	 * The feature id for the '<em><b>Container Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONTAINER_PACKAGE = 8;

	/**
	 * The feature id for the '<em><b>Generator Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__GENERATOR_SETTINGS = 9;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.model.metamodel.impl.ModelParamImpl <em>Model Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.model.metamodel.impl.ModelParamImpl
	 * @see org.eclipse.stem.model.metamodel.impl.MetamodelPackageImpl#getModelParam()
	 * @generated
	 */
	int MODEL_PARAM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAM__DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAM__DEFAULT_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAM__CONSTRAINTS = 3;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAM__DISPLAY_NAME = 4;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAM__UNIT = 5;

	/**
	 * The feature id for the '<em><b>Help Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAM__HELP_MESSAGE = 6;

	/**
	 * The feature id for the '<em><b>Invalid Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAM__INVALID_MESSAGE = 7;

	/**
	 * The feature id for the '<em><b>Missing Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAM__MISSING_MESSAGE = 8;

	/**
	 * The feature id for the '<em><b>Container Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAM__CONTAINER_MODEL = 9;

	/**
	 * The number of structural features of the '<em>Model Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAM_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.model.metamodel.impl.ModelParamConstraintImpl <em>Model Param Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.model.metamodel.impl.ModelParamConstraintImpl
	 * @see org.eclipse.stem.model.metamodel.impl.MetamodelPackageImpl#getModelParamConstraint()
	 * @generated
	 */
	int MODEL_PARAM_CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAM_CONSTRAINT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAM_CONSTRAINT__CONSTRAINT = 1;

	/**
	 * The number of structural features of the '<em>Model Param Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PARAM_CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.model.metamodel.impl.CompartmentGroupImpl <em>Compartment Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.model.metamodel.impl.CompartmentGroupImpl
	 * @see org.eclipse.stem.model.metamodel.impl.MetamodelPackageImpl#getCompartmentGroup()
	 * @generated
	 */
	int COMPARTMENT_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_GROUP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_GROUP__CLASS = 1;

	/**
	 * The feature id for the '<em><b>Value Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_GROUP__VALUE_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Parent Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_GROUP__PARENT_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Compartments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_GROUP__COMPARTMENTS = 4;

	/**
	 * The number of structural features of the '<em>Compartment Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_GROUP_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.model.metamodel.impl.CompartmentImpl <em>Compartment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.model.metamodel.impl.CompartmentImpl
	 * @see org.eclipse.stem.model.metamodel.impl.MetamodelPackageImpl#getCompartment()
	 * @generated
	 */
	int COMPARTMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Container Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__CONTAINER_GROUP = 3;

	/**
	 * The number of structural features of the '<em>Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.model.metamodel.impl.AuthorDetailsImpl <em>Author Details</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.model.metamodel.impl.AuthorDetailsImpl
	 * @see org.eclipse.stem.model.metamodel.impl.MetamodelPackageImpl#getAuthorDetails()
	 * @generated
	 */
	int AUTHOR_DETAILS = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_DETAILS__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_DETAILS__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_DETAILS__CREATOR = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_DETAILS__SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_DETAILS__PUBLISHER = 4;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_DETAILS__LICENSE = 5;

	/**
	 * The number of structural features of the '<em>Author Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_DETAILS_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.model.metamodel.impl.ModelGenSettingsImpl <em>Model Gen Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.model.metamodel.impl.ModelGenSettingsImpl
	 * @see org.eclipse.stem.model.metamodel.impl.MetamodelPackageImpl#getModelGenSettings()
	 * @generated
	 */
	int MODEL_GEN_SETTINGS = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.model.metamodel.impl.PackageGenSettingsImpl <em>Package Gen Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.model.metamodel.impl.PackageGenSettingsImpl
	 * @see org.eclipse.stem.model.metamodel.impl.MetamodelPackageImpl#getPackageGenSettings()
	 * @generated
	 */
	int PACKAGE_GEN_SETTINGS = 7;

	/**
	 * The feature id for the '<em><b>Model Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_GEN_SETTINGS__MODEL_PLUGIN_ID = 0;

	/**
	 * The feature id for the '<em><b>Editor Plugin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_GEN_SETTINGS__EDITOR_PLUGIN_ID = 1;

	/**
	 * The number of structural features of the '<em>Package Gen Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_GEN_SETTINGS_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Property Editor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_GEN_SETTINGS__PROPERTY_EDITOR_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Property Editor Parent Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_GEN_SETTINGS__PROPERTY_EDITOR_PARENT_CLASS = 1;

	/**
	 * The feature id for the '<em><b>String Provider Adapter Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_GEN_SETTINGS__STRING_PROVIDER_ADAPTER_CLASS = 2;

	/**
	 * The feature id for the '<em><b>String Provider Adapter Parent Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_GEN_SETTINGS__STRING_PROVIDER_ADAPTER_PARENT_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Label Relative Value Provider Adapter Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_GEN_SETTINGS__LABEL_RELATIVE_VALUE_PROVIDER_ADAPTER_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Label Relative Value Provider Adapter Parent Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_GEN_SETTINGS__LABEL_RELATIVE_VALUE_PROVIDER_ADAPTER_PARENT_CLASS = 5;

	/**
	 * The feature id for the '<em><b>Label Value Relative Value Provider Adapter Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_GEN_SETTINGS__LABEL_VALUE_RELATIVE_VALUE_PROVIDER_ADAPTER_CLASS = 6;

	/**
	 * The feature id for the '<em><b>Label Value Relative Value Provider Adapter Parent Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_GEN_SETTINGS__LABEL_VALUE_RELATIVE_VALUE_PROVIDER_ADAPTER_PARENT_CLASS = 7;

	/**
	 * The number of structural features of the '<em>Model Gen Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_GEN_SETTINGS_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.model.metamodel.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.model.metamodel.impl.TransitionImpl
	 * @see org.eclipse.stem.model.metamodel.impl.MetamodelPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>For Incidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__FOR_INCIDENCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = 3;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Compiled Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__COMPILED_EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Container Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONTAINER_MODEL = 6;

	/**
	 * The feature id for the '<em><b>Expression Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EXPRESSION_RESOURCE = 7;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.model.metamodel.ModelType <em>Model Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.model.metamodel.ModelType
	 * @see org.eclipse.stem.model.metamodel.impl.MetamodelPackageImpl#getModelType()
	 * @generated
	 */
	int MODEL_TYPE = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.model.metamodel.CompartmentType <em>Compartment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.model.metamodel.CompartmentType
	 * @see org.eclipse.stem.model.metamodel.impl.MetamodelPackageImpl#getCompartmentType()
	 * @generated
	 */
	int COMPARTMENT_TYPE = 11;


	/**
	 * The meta object id for the '<em>Resource</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.resource.Resource
	 * @see org.eclipse.stem.model.metamodel.impl.MetamodelPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 12;


	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.model.metamodel.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see org.eclipse.stem.model.metamodel.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.Package#getPackagePrefix <em>Package Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Prefix</em>'.
	 * @see org.eclipse.stem.model.metamodel.Package#getPackagePrefix()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_PackagePrefix();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.Package#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.stem.model.metamodel.Package#getName()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.stem.model.metamodel.Package#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Models</em>'.
	 * @see org.eclipse.stem.model.metamodel.Package#getModels()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Models();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.stem.model.metamodel.Package#getCompartmentGroups <em>Compartment Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compartment Groups</em>'.
	 * @see org.eclipse.stem.model.metamodel.Package#getCompartmentGroups()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_CompartmentGroups();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.stem.model.metamodel.Package#getGeneratorSettings <em>Generator Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generator Settings</em>'.
	 * @see org.eclipse.stem.model.metamodel.Package#getGeneratorSettings()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_GeneratorSettings();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.model.metamodel.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.eclipse.stem.model.metamodel.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.stem.model.metamodel.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.Model#getModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Type</em>'.
	 * @see org.eclipse.stem.model.metamodel.Model#getModelType()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_ModelType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.model.metamodel.Model#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see org.eclipse.stem.model.metamodel.Model#getClass_()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Class();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.model.metamodel.Model#getParentModel <em>Parent Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Model</em>'.
	 * @see org.eclipse.stem.model.metamodel.Model#getParentModel()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_ParentModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.stem.model.metamodel.Model#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclipse.stem.model.metamodel.Model#getParameters()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.stem.model.metamodel.Model#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see org.eclipse.stem.model.metamodel.Model#getTransitions()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Transitions();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.model.metamodel.Model#getCompartments <em>Compartments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Compartments</em>'.
	 * @see org.eclipse.stem.model.metamodel.Model#getCompartments()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Compartments();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.stem.model.metamodel.Model#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Author</em>'.
	 * @see org.eclipse.stem.model.metamodel.Model#getAuthor()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Author();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.stem.model.metamodel.Model#getContainerPackage <em>Container Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Package</em>'.
	 * @see org.eclipse.stem.model.metamodel.Model#getContainerPackage()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_ContainerPackage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.stem.model.metamodel.Model#getGeneratorSettings <em>Generator Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generator Settings</em>'.
	 * @see org.eclipse.stem.model.metamodel.Model#getGeneratorSettings()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_GeneratorSettings();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.model.metamodel.ModelParam <em>Model Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Param</em>'.
	 * @see org.eclipse.stem.model.metamodel.ModelParam
	 * @generated
	 */
	EClass getModelParam();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.ModelParam#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.stem.model.metamodel.ModelParam#getName()
	 * @see #getModelParam()
	 * @generated
	 */
	EAttribute getModelParam_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.model.metamodel.ModelParam#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see org.eclipse.stem.model.metamodel.ModelParam#getDataType()
	 * @see #getModelParam()
	 * @generated
	 */
	EReference getModelParam_DataType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.ModelParam#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.eclipse.stem.model.metamodel.ModelParam#getDefaultValue()
	 * @see #getModelParam()
	 * @generated
	 */
	EAttribute getModelParam_DefaultValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.stem.model.metamodel.ModelParam#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see org.eclipse.stem.model.metamodel.ModelParam#getConstraints()
	 * @see #getModelParam()
	 * @generated
	 */
	EReference getModelParam_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.ModelParam#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.eclipse.stem.model.metamodel.ModelParam#getDisplayName()
	 * @see #getModelParam()
	 * @generated
	 */
	EAttribute getModelParam_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.ModelParam#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.eclipse.stem.model.metamodel.ModelParam#getUnit()
	 * @see #getModelParam()
	 * @generated
	 */
	EAttribute getModelParam_Unit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.ModelParam#getHelpMessage <em>Help Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help Message</em>'.
	 * @see org.eclipse.stem.model.metamodel.ModelParam#getHelpMessage()
	 * @see #getModelParam()
	 * @generated
	 */
	EAttribute getModelParam_HelpMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.ModelParam#getInvalidMessage <em>Invalid Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Message</em>'.
	 * @see org.eclipse.stem.model.metamodel.ModelParam#getInvalidMessage()
	 * @see #getModelParam()
	 * @generated
	 */
	EAttribute getModelParam_InvalidMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.ModelParam#getMissingMessage <em>Missing Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Missing Message</em>'.
	 * @see org.eclipse.stem.model.metamodel.ModelParam#getMissingMessage()
	 * @see #getModelParam()
	 * @generated
	 */
	EAttribute getModelParam_MissingMessage();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.stem.model.metamodel.ModelParam#getContainerModel <em>Container Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Model</em>'.
	 * @see org.eclipse.stem.model.metamodel.ModelParam#getContainerModel()
	 * @see #getModelParam()
	 * @generated
	 */
	EReference getModelParam_ContainerModel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.model.metamodel.ModelParamConstraint <em>Model Param Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Param Constraint</em>'.
	 * @see org.eclipse.stem.model.metamodel.ModelParamConstraint
	 * @generated
	 */
	EClass getModelParamConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.ModelParamConstraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.stem.model.metamodel.ModelParamConstraint#getName()
	 * @see #getModelParamConstraint()
	 * @generated
	 */
	EAttribute getModelParamConstraint_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.ModelParamConstraint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see org.eclipse.stem.model.metamodel.ModelParamConstraint#getConstraint()
	 * @see #getModelParamConstraint()
	 * @generated
	 */
	EAttribute getModelParamConstraint_Constraint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.model.metamodel.CompartmentGroup <em>Compartment Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compartment Group</em>'.
	 * @see org.eclipse.stem.model.metamodel.CompartmentGroup
	 * @generated
	 */
	EClass getCompartmentGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.CompartmentGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.stem.model.metamodel.CompartmentGroup#getName()
	 * @see #getCompartmentGroup()
	 * @generated
	 */
	EAttribute getCompartmentGroup_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.model.metamodel.CompartmentGroup#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see org.eclipse.stem.model.metamodel.CompartmentGroup#getClass_()
	 * @see #getCompartmentGroup()
	 * @generated
	 */
	EReference getCompartmentGroup_Class();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.model.metamodel.CompartmentGroup#getValueClass <em>Value Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Class</em>'.
	 * @see org.eclipse.stem.model.metamodel.CompartmentGroup#getValueClass()
	 * @see #getCompartmentGroup()
	 * @generated
	 */
	EReference getCompartmentGroup_ValueClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.model.metamodel.CompartmentGroup#getParentGroup <em>Parent Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Group</em>'.
	 * @see org.eclipse.stem.model.metamodel.CompartmentGroup#getParentGroup()
	 * @see #getCompartmentGroup()
	 * @generated
	 */
	EReference getCompartmentGroup_ParentGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.stem.model.metamodel.CompartmentGroup#getCompartments <em>Compartments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compartments</em>'.
	 * @see org.eclipse.stem.model.metamodel.CompartmentGroup#getCompartments()
	 * @see #getCompartmentGroup()
	 * @generated
	 */
	EReference getCompartmentGroup_Compartments();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.model.metamodel.Compartment <em>Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compartment</em>'.
	 * @see org.eclipse.stem.model.metamodel.Compartment
	 * @generated
	 */
	EClass getCompartment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.Compartment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.stem.model.metamodel.Compartment#getName()
	 * @see #getCompartment()
	 * @generated
	 */
	EAttribute getCompartment_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.model.metamodel.Compartment#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see org.eclipse.stem.model.metamodel.Compartment#getDataType()
	 * @see #getCompartment()
	 * @generated
	 */
	EReference getCompartment_DataType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.Compartment#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.stem.model.metamodel.Compartment#getType()
	 * @see #getCompartment()
	 * @generated
	 */
	EAttribute getCompartment_Type();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.stem.model.metamodel.Compartment#getContainerGroup <em>Container Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Group</em>'.
	 * @see org.eclipse.stem.model.metamodel.Compartment#getContainerGroup()
	 * @see #getCompartment()
	 * @generated
	 */
	EReference getCompartment_ContainerGroup();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.model.metamodel.AuthorDetails <em>Author Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Author Details</em>'.
	 * @see org.eclipse.stem.model.metamodel.AuthorDetails
	 * @generated
	 */
	EClass getAuthorDetails();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.AuthorDetails#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.stem.model.metamodel.AuthorDetails#getTitle()
	 * @see #getAuthorDetails()
	 * @generated
	 */
	EAttribute getAuthorDetails_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.AuthorDetails#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.stem.model.metamodel.AuthorDetails#getDescription()
	 * @see #getAuthorDetails()
	 * @generated
	 */
	EAttribute getAuthorDetails_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.AuthorDetails#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creator</em>'.
	 * @see org.eclipse.stem.model.metamodel.AuthorDetails#getCreator()
	 * @see #getAuthorDetails()
	 * @generated
	 */
	EAttribute getAuthorDetails_Creator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.AuthorDetails#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.eclipse.stem.model.metamodel.AuthorDetails#getSource()
	 * @see #getAuthorDetails()
	 * @generated
	 */
	EAttribute getAuthorDetails_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.AuthorDetails#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publisher</em>'.
	 * @see org.eclipse.stem.model.metamodel.AuthorDetails#getPublisher()
	 * @see #getAuthorDetails()
	 * @generated
	 */
	EAttribute getAuthorDetails_Publisher();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.AuthorDetails#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License</em>'.
	 * @see org.eclipse.stem.model.metamodel.AuthorDetails#getLicense()
	 * @see #getAuthorDetails()
	 * @generated
	 */
	EAttribute getAuthorDetails_License();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.model.metamodel.ModelGenSettings <em>Model Gen Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Gen Settings</em>'.
	 * @see org.eclipse.stem.model.metamodel.ModelGenSettings
	 * @generated
	 */
	EClass getModelGenSettings();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.ModelGenSettings#getPropertyEditorClass <em>Property Editor Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Editor Class</em>'.
	 * @see org.eclipse.stem.model.metamodel.ModelGenSettings#getPropertyEditorClass()
	 * @see #getModelGenSettings()
	 * @generated
	 */
	EAttribute getModelGenSettings_PropertyEditorClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.ModelGenSettings#getPropertyEditorParentClass <em>Property Editor Parent Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Editor Parent Class</em>'.
	 * @see org.eclipse.stem.model.metamodel.ModelGenSettings#getPropertyEditorParentClass()
	 * @see #getModelGenSettings()
	 * @generated
	 */
	EAttribute getModelGenSettings_PropertyEditorParentClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.ModelGenSettings#getStringProviderAdapterClass <em>String Provider Adapter Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Provider Adapter Class</em>'.
	 * @see org.eclipse.stem.model.metamodel.ModelGenSettings#getStringProviderAdapterClass()
	 * @see #getModelGenSettings()
	 * @generated
	 */
	EAttribute getModelGenSettings_StringProviderAdapterClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.ModelGenSettings#getStringProviderAdapterParentClass <em>String Provider Adapter Parent Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Provider Adapter Parent Class</em>'.
	 * @see org.eclipse.stem.model.metamodel.ModelGenSettings#getStringProviderAdapterParentClass()
	 * @see #getModelGenSettings()
	 * @generated
	 */
	EAttribute getModelGenSettings_StringProviderAdapterParentClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.ModelGenSettings#getLabelRelativeValueProviderAdapterClass <em>Label Relative Value Provider Adapter Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Relative Value Provider Adapter Class</em>'.
	 * @see org.eclipse.stem.model.metamodel.ModelGenSettings#getLabelRelativeValueProviderAdapterClass()
	 * @see #getModelGenSettings()
	 * @generated
	 */
	EAttribute getModelGenSettings_LabelRelativeValueProviderAdapterClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.ModelGenSettings#getLabelRelativeValueProviderAdapterParentClass <em>Label Relative Value Provider Adapter Parent Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Relative Value Provider Adapter Parent Class</em>'.
	 * @see org.eclipse.stem.model.metamodel.ModelGenSettings#getLabelRelativeValueProviderAdapterParentClass()
	 * @see #getModelGenSettings()
	 * @generated
	 */
	EAttribute getModelGenSettings_LabelRelativeValueProviderAdapterParentClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.ModelGenSettings#getLabelValueRelativeValueProviderAdapterClass <em>Label Value Relative Value Provider Adapter Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Value Relative Value Provider Adapter Class</em>'.
	 * @see org.eclipse.stem.model.metamodel.ModelGenSettings#getLabelValueRelativeValueProviderAdapterClass()
	 * @see #getModelGenSettings()
	 * @generated
	 */
	EAttribute getModelGenSettings_LabelValueRelativeValueProviderAdapterClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.ModelGenSettings#getLabelValueRelativeValueProviderAdapterParentClass <em>Label Value Relative Value Provider Adapter Parent Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Value Relative Value Provider Adapter Parent Class</em>'.
	 * @see org.eclipse.stem.model.metamodel.ModelGenSettings#getLabelValueRelativeValueProviderAdapterParentClass()
	 * @see #getModelGenSettings()
	 * @generated
	 */
	EAttribute getModelGenSettings_LabelValueRelativeValueProviderAdapterParentClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.model.metamodel.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.eclipse.stem.model.metamodel.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.model.metamodel.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.stem.model.metamodel.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.model.metamodel.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.stem.model.metamodel.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.stem.model.metamodel.Transition#getForIncidence <em>For Incidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>For Incidence</em>'.
	 * @see org.eclipse.stem.model.metamodel.Transition#getForIncidence()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_ForIncidence();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.stem.model.metamodel.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.Transition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.eclipse.stem.model.metamodel.Transition#getExpression()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Expression();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.model.metamodel.Transition#getCompiledExpression <em>Compiled Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Compiled Expression</em>'.
	 * @see org.eclipse.stem.model.metamodel.Transition#getCompiledExpression()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_CompiledExpression();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.stem.model.metamodel.Transition#getContainerModel <em>Container Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container Model</em>'.
	 * @see org.eclipse.stem.model.metamodel.Transition#getContainerModel()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_ContainerModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.Transition#getExpressionResource <em>Expression Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Resource</em>'.
	 * @see org.eclipse.stem.model.metamodel.Transition#getExpressionResource()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_ExpressionResource();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.model.metamodel.PackageGenSettings <em>Package Gen Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Gen Settings</em>'.
	 * @see org.eclipse.stem.model.metamodel.PackageGenSettings
	 * @generated
	 */
	EClass getPackageGenSettings();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.PackageGenSettings#getModelPluginId <em>Model Plugin Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Plugin Id</em>'.
	 * @see org.eclipse.stem.model.metamodel.PackageGenSettings#getModelPluginId()
	 * @see #getPackageGenSettings()
	 * @generated
	 */
	EAttribute getPackageGenSettings_ModelPluginId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.metamodel.PackageGenSettings#getEditorPluginId <em>Editor Plugin Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editor Plugin Id</em>'.
	 * @see org.eclipse.stem.model.metamodel.PackageGenSettings#getEditorPluginId()
	 * @see #getPackageGenSettings()
	 * @generated
	 */
	EAttribute getPackageGenSettings_EditorPluginId();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.stem.model.metamodel.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Model Type</em>'.
	 * @see org.eclipse.stem.model.metamodel.ModelType
	 * @generated
	 */
	EEnum getModelType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.stem.model.metamodel.CompartmentType <em>Compartment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compartment Type</em>'.
	 * @see org.eclipse.stem.model.metamodel.CompartmentType
	 * @generated
	 */
	EEnum getCompartmentType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.resource.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Resource</em>'.
	 * @see org.eclipse.emf.ecore.resource.Resource
	 * @model instanceClass="org.eclipse.emf.ecore.resource.Resource"
	 * @generated
	 */
	EDataType getResource();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetamodelFactory getMetamodelFactory();

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
		 * The meta object literal for the '{@link org.eclipse.stem.model.metamodel.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.model.metamodel.impl.PackageImpl
		 * @see org.eclipse.stem.model.metamodel.impl.MetamodelPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Package Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__PACKAGE_PREFIX = eINSTANCE.getPackage_PackagePrefix();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__MODELS = eINSTANCE.getPackage_Models();

		/**
		 * The meta object literal for the '<em><b>Compartment Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__COMPARTMENT_GROUPS = eINSTANCE.getPackage_CompartmentGroups();

		/**
		 * The meta object literal for the '<em><b>Generator Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__GENERATOR_SETTINGS = eINSTANCE.getPackage_GeneratorSettings();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.model.metamodel.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.model.metamodel.impl.ModelImpl
		 * @see org.eclipse.stem.model.metamodel.impl.MetamodelPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Model Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__MODEL_TYPE = eINSTANCE.getModel_ModelType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CLASS = eINSTANCE.getModel_Class();

		/**
		 * The meta object literal for the '<em><b>Parent Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PARENT_MODEL = eINSTANCE.getModel_ParentModel();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PARAMETERS = eINSTANCE.getModel_Parameters();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__TRANSITIONS = eINSTANCE.getModel_Transitions();

		/**
		 * The meta object literal for the '<em><b>Compartments</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__COMPARTMENTS = eINSTANCE.getModel_Compartments();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__AUTHOR = eINSTANCE.getModel_Author();

		/**
		 * The meta object literal for the '<em><b>Container Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CONTAINER_PACKAGE = eINSTANCE.getModel_ContainerPackage();

		/**
		 * The meta object literal for the '<em><b>Generator Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__GENERATOR_SETTINGS = eINSTANCE.getModel_GeneratorSettings();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.model.metamodel.impl.ModelParamImpl <em>Model Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.model.metamodel.impl.ModelParamImpl
		 * @see org.eclipse.stem.model.metamodel.impl.MetamodelPackageImpl#getModelParam()
		 * @generated
		 */
		EClass MODEL_PARAM = eINSTANCE.getModelParam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_PARAM__NAME = eINSTANCE.getModelParam_Name();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_PARAM__DATA_TYPE = eINSTANCE.getModelParam_DataType();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_PARAM__DEFAULT_VALUE = eINSTANCE.getModelParam_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_PARAM__CONSTRAINTS = eINSTANCE.getModelParam_Constraints();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_PARAM__DISPLAY_NAME = eINSTANCE.getModelParam_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_PARAM__UNIT = eINSTANCE.getModelParam_Unit();

		/**
		 * The meta object literal for the '<em><b>Help Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_PARAM__HELP_MESSAGE = eINSTANCE.getModelParam_HelpMessage();

		/**
		 * The meta object literal for the '<em><b>Invalid Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_PARAM__INVALID_MESSAGE = eINSTANCE.getModelParam_InvalidMessage();

		/**
		 * The meta object literal for the '<em><b>Missing Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_PARAM__MISSING_MESSAGE = eINSTANCE.getModelParam_MissingMessage();

		/**
		 * The meta object literal for the '<em><b>Container Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_PARAM__CONTAINER_MODEL = eINSTANCE.getModelParam_ContainerModel();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.model.metamodel.impl.ModelParamConstraintImpl <em>Model Param Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.model.metamodel.impl.ModelParamConstraintImpl
		 * @see org.eclipse.stem.model.metamodel.impl.MetamodelPackageImpl#getModelParamConstraint()
		 * @generated
		 */
		EClass MODEL_PARAM_CONSTRAINT = eINSTANCE.getModelParamConstraint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_PARAM_CONSTRAINT__NAME = eINSTANCE.getModelParamConstraint_Name();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_PARAM_CONSTRAINT__CONSTRAINT = eINSTANCE.getModelParamConstraint_Constraint();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.model.metamodel.impl.CompartmentGroupImpl <em>Compartment Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.model.metamodel.impl.CompartmentGroupImpl
		 * @see org.eclipse.stem.model.metamodel.impl.MetamodelPackageImpl#getCompartmentGroup()
		 * @generated
		 */
		EClass COMPARTMENT_GROUP = eINSTANCE.getCompartmentGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARTMENT_GROUP__NAME = eINSTANCE.getCompartmentGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARTMENT_GROUP__CLASS = eINSTANCE.getCompartmentGroup_Class();

		/**
		 * The meta object literal for the '<em><b>Value Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARTMENT_GROUP__VALUE_CLASS = eINSTANCE.getCompartmentGroup_ValueClass();

		/**
		 * The meta object literal for the '<em><b>Parent Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARTMENT_GROUP__PARENT_GROUP = eINSTANCE.getCompartmentGroup_ParentGroup();

		/**
		 * The meta object literal for the '<em><b>Compartments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARTMENT_GROUP__COMPARTMENTS = eINSTANCE.getCompartmentGroup_Compartments();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.model.metamodel.impl.CompartmentImpl <em>Compartment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.model.metamodel.impl.CompartmentImpl
		 * @see org.eclipse.stem.model.metamodel.impl.MetamodelPackageImpl#getCompartment()
		 * @generated
		 */
		EClass COMPARTMENT = eINSTANCE.getCompartment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARTMENT__NAME = eINSTANCE.getCompartment_Name();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARTMENT__DATA_TYPE = eINSTANCE.getCompartment_DataType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARTMENT__TYPE = eINSTANCE.getCompartment_Type();

		/**
		 * The meta object literal for the '<em><b>Container Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARTMENT__CONTAINER_GROUP = eINSTANCE.getCompartment_ContainerGroup();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.model.metamodel.impl.AuthorDetailsImpl <em>Author Details</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.model.metamodel.impl.AuthorDetailsImpl
		 * @see org.eclipse.stem.model.metamodel.impl.MetamodelPackageImpl#getAuthorDetails()
		 * @generated
		 */
		EClass AUTHOR_DETAILS = eINSTANCE.getAuthorDetails();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR_DETAILS__TITLE = eINSTANCE.getAuthorDetails_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR_DETAILS__DESCRIPTION = eINSTANCE.getAuthorDetails_Description();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR_DETAILS__CREATOR = eINSTANCE.getAuthorDetails_Creator();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR_DETAILS__SOURCE = eINSTANCE.getAuthorDetails_Source();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR_DETAILS__PUBLISHER = eINSTANCE.getAuthorDetails_Publisher();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR_DETAILS__LICENSE = eINSTANCE.getAuthorDetails_License();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.model.metamodel.impl.ModelGenSettingsImpl <em>Model Gen Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.model.metamodel.impl.ModelGenSettingsImpl
		 * @see org.eclipse.stem.model.metamodel.impl.MetamodelPackageImpl#getModelGenSettings()
		 * @generated
		 */
		EClass MODEL_GEN_SETTINGS = eINSTANCE.getModelGenSettings();

		/**
		 * The meta object literal for the '<em><b>Property Editor Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_GEN_SETTINGS__PROPERTY_EDITOR_CLASS = eINSTANCE.getModelGenSettings_PropertyEditorClass();

		/**
		 * The meta object literal for the '<em><b>Property Editor Parent Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_GEN_SETTINGS__PROPERTY_EDITOR_PARENT_CLASS = eINSTANCE.getModelGenSettings_PropertyEditorParentClass();

		/**
		 * The meta object literal for the '<em><b>String Provider Adapter Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_GEN_SETTINGS__STRING_PROVIDER_ADAPTER_CLASS = eINSTANCE.getModelGenSettings_StringProviderAdapterClass();

		/**
		 * The meta object literal for the '<em><b>String Provider Adapter Parent Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_GEN_SETTINGS__STRING_PROVIDER_ADAPTER_PARENT_CLASS = eINSTANCE.getModelGenSettings_StringProviderAdapterParentClass();

		/**
		 * The meta object literal for the '<em><b>Label Relative Value Provider Adapter Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_GEN_SETTINGS__LABEL_RELATIVE_VALUE_PROVIDER_ADAPTER_CLASS = eINSTANCE.getModelGenSettings_LabelRelativeValueProviderAdapterClass();

		/**
		 * The meta object literal for the '<em><b>Label Relative Value Provider Adapter Parent Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_GEN_SETTINGS__LABEL_RELATIVE_VALUE_PROVIDER_ADAPTER_PARENT_CLASS = eINSTANCE.getModelGenSettings_LabelRelativeValueProviderAdapterParentClass();

		/**
		 * The meta object literal for the '<em><b>Label Value Relative Value Provider Adapter Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_GEN_SETTINGS__LABEL_VALUE_RELATIVE_VALUE_PROVIDER_ADAPTER_CLASS = eINSTANCE.getModelGenSettings_LabelValueRelativeValueProviderAdapterClass();

		/**
		 * The meta object literal for the '<em><b>Label Value Relative Value Provider Adapter Parent Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_GEN_SETTINGS__LABEL_VALUE_RELATIVE_VALUE_PROVIDER_ADAPTER_PARENT_CLASS = eINSTANCE.getModelGenSettings_LabelValueRelativeValueProviderAdapterParentClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.model.metamodel.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.model.metamodel.impl.TransitionImpl
		 * @see org.eclipse.stem.model.metamodel.impl.MetamodelPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>For Incidence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__FOR_INCIDENCE = eINSTANCE.getTransition_ForIncidence();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__EXPRESSION = eINSTANCE.getTransition_Expression();

		/**
		 * The meta object literal for the '<em><b>Compiled Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__COMPILED_EXPRESSION = eINSTANCE.getTransition_CompiledExpression();

		/**
		 * The meta object literal for the '<em><b>Container Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__CONTAINER_MODEL = eINSTANCE.getTransition_ContainerModel();

		/**
		 * The meta object literal for the '<em><b>Expression Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__EXPRESSION_RESOURCE = eINSTANCE.getTransition_ExpressionResource();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.model.metamodel.impl.PackageGenSettingsImpl <em>Package Gen Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.model.metamodel.impl.PackageGenSettingsImpl
		 * @see org.eclipse.stem.model.metamodel.impl.MetamodelPackageImpl#getPackageGenSettings()
		 * @generated
		 */
		EClass PACKAGE_GEN_SETTINGS = eINSTANCE.getPackageGenSettings();

		/**
		 * The meta object literal for the '<em><b>Model Plugin Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_GEN_SETTINGS__MODEL_PLUGIN_ID = eINSTANCE.getPackageGenSettings_ModelPluginId();

		/**
		 * The meta object literal for the '<em><b>Editor Plugin Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_GEN_SETTINGS__EDITOR_PLUGIN_ID = eINSTANCE.getPackageGenSettings_EditorPluginId();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.model.metamodel.ModelType <em>Model Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.model.metamodel.ModelType
		 * @see org.eclipse.stem.model.metamodel.impl.MetamodelPackageImpl#getModelType()
		 * @generated
		 */
		EEnum MODEL_TYPE = eINSTANCE.getModelType();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.model.metamodel.CompartmentType <em>Compartment Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.model.metamodel.CompartmentType
		 * @see org.eclipse.stem.model.metamodel.impl.MetamodelPackageImpl#getCompartmentType()
		 * @generated
		 */
		EEnum COMPARTMENT_TYPE = eINSTANCE.getCompartmentType();

		/**
		 * The meta object literal for the '<em>Resource</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.resource.Resource
		 * @see org.eclipse.stem.model.metamodel.impl.MetamodelPackageImpl#getResource()
		 * @generated
		 */
		EDataType RESOURCE = eINSTANCE.getResource();

	}

} //MetamodelPackage
