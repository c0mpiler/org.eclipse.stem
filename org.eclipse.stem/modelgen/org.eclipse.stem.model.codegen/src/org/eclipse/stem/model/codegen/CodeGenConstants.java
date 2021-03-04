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
package org.eclipse.stem.model.codegen;

import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.stem.model.codegen.descriptor.EClassDescriptor;

/**
 * Reference values for use within the code generator and metamodel
 * transformation components.
 * 
 */
public interface CodeGenConstants {
	/**
	 * Empty string
	 */
	public static final String EMPTY_STRING = "";

	/**
	 * Code Generator Version
	 */
	public static final String CODEGEN_VERSION = "1.0";

	/**
	 * EClass description of the STEM Integration Decorator class
	 */
	public static final EClassDescriptor INTEGRATION_DECORATOR_DESCRIPTOR = new EClassDescriptor(
			"http:///org/eclipse/stem/core/model.ecore", "IntegrationDecorator");

	/**
	 * EClass description of the STEM Integration Label class
	 */
	public static final EClassDescriptor INTEGRATION_LABEL_DESCRIPTOR = new EClassDescriptor(
			"http:///org/eclipse/stem/core/graph.ecore", "IntegrationLabel");

	/**
	 * EClass description of the STEM Integration Label Value class
	 */
	public static final EClassDescriptor INTEGRATION_LABEL_VALUE_DESCRIPTOR = new EClassDescriptor(
			"http:///org/eclipse/stem/core/graph.ecore",
			"IntegrationLabelValue");

	/**
	 * EClass description of the primitive type operations marker class
	 */
	public static final EClassDescriptor PRIMITIVE_TYPE_OPERATIONS_DESCRIPTOR = new EClassDescriptor(
			"http:///org/eclipse/stem/core/common.ecore",
			"PrimitiveTypeOperations");

	/**
	 * Default JVM support level, for use in the transformed GenModel definition
	 */
	public static final GenJDKLevel JVM_SUPPORT_LEVEL = GenJDKLevel.JDK60_LITERAL;

	/**
	 * Default STEM Code Generator ID, for use in the GenModel definition
	 */
	public static final String STEM_CODE_GENERATOR_ID = "http:///org/eclipse/stem/modelgen/"+CODEGEN_VERSION;

	/**
	 * Default template path for dynamic templates used in STEM Model Generator
	 */
	public static final String CODEGEN_TEMPLATES_PATH = "platform:/plugin/org.eclipse.stem.model.codegen/templates";

	/**
	 * Default primitive types defined by the STEM Model Generator
	 */
	public static final String[] PRIMITIVE_TYPES = new String[] { "long",
			"short", "double", "int", "byte", "float", "boolean" };

	/**
	 * Extension Point ID for Metamodel definitions
	 */
	public static final String METAMODEL_EXTENSION_POINT = "org.eclipse.stem.model.metamodel";

	/**
	 * Extension Point ID for model type descriptors
	 */
	public static final String MODEL_TYPE_DESCRIPTOR_EXTENSION_POINT_ID = "org.eclipse.stem.model.codegen.model_type";

	public static final String GENERATOR_MARKER_ANNOTATION_SOURCE = "http:///org/eclipse/stem/modelgen/generated";
	public static final String GENERATOR_MARKER_ANNOTATION_VERSION_KEY = "version";

	public static final String METAMODEL_URI_ANNOTATION_SOURCE = "http:///org/eclipse/stem/modelgen/metamodel";

	
	public static final String AUTHOR_DETAILS_ANNOTATION_SOURCE = "http:///org/eclipse/stem/modelgen/author";

	public static final String ADAPTERS_ANNOTATION_SOURCE = "http:///org/eclipse/stem/modelgen/model/adapters";
	public static final String INFECTOR_ANNOTATION_SOURCE = "http:///org/eclipse/stem/modelgen/model/infector";
	public static final String LABEL_ANNOTATION_SOURCE = "http:///org/eclipse/stem/modelgen/model/label";
	public static final String LABEL_VALUE_ANNOTATION_SOURCE = "http:///org/eclipse/stem/modelgen/model/labelvalue";
	public static final String COMPARTMENT_TYPE_ANNOTATION_SOURCE = "http:///org/eclipse/stem/modelgen/compartment/type";
	public static final String MESSAGES_ANNOTATION_SOURCE = "http:///org/eclipse/stem/modelgen/modelparam/messages";
	public static final String CONSTRAINT_ANNOTATION_SOURCE = "http:///org/eclipse/stem/modelgen/modelparam/constraints";

	public static final String TRANSITIONS_ANNOTATION_SOURCE = "http:///org/eclipse/stem/modelgen/model/transitions";

	
	public static final String PROPERTY_EDITOR_CLASS_KEY = "propertyEditorClass";
	public static final String PROPERTY_EDITOR_SUPER_CLASS_KEY = "propertyEditorSuperClass";

	public static final String STRING_PROVIDER_CLASS_KEY = "stringProviderClass";
	public static final String STRING_PROVIDER_SUPER_CLASS_KEY = "stringProviderSuperClass";

	public static final String LABEL_RV_PROVIDER_CLASS_KEY = "labelRelativeValueProviderClass";
	public static final String LABEL_RV_PROVIDER_SUPER_CLASS_KEY = "labelRelativeValueProviderSuperClass";

	public static final String LABEL_VALUE_RV_PROVIDER_CLASS_KEY = "labelValueRelativeValueProviderClass";
	public static final String LABEL_VALUE_RV_PROVIDER_SUPER_CLASS_KEY = "labelValueRelativeValueProviderSuperClass";

	
	
	public static final String INFECTOR_SOURCE_DEFAULT_KEY = "*";
	public static final String LABEL_SOURCE_DEFAULT_KEY = "*";
	public static final String LABEL_VALUE_SOURCE_DEFAULT_KEY = "*";

	public static final String COMPARTMENT_TYPE_ANNOTATION_KEY = "type";

	public static final String MESSAGES_ANNOTATION_NAME_KEY = "name";
	public static final String MESSAGES_ANNOTATION_UNIT_KEY = "unit";
	public static final String MESSAGES_ANNOTATION_TOOLTIP_KEY = "tooltip";
	public static final String MESSAGES_ANNOTATION_INVALID_KEY = "invalid";
	public static final String MESSAGES_ANNOTATION_MISSING_KEY = "missing";

}