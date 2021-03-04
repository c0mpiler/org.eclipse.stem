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
package org.eclipse.stem.model.transform;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.stem.model.codegen.CodeGenConstants;
import org.eclipse.stem.model.codegen.GeneratorUtils;
import org.eclipse.stem.model.metamodel.AuthorDetails;
import org.eclipse.stem.model.metamodel.Compartment;
import org.eclipse.stem.model.metamodel.CompartmentGroup;
import org.eclipse.stem.model.metamodel.CompartmentType;
import org.eclipse.stem.model.metamodel.Model;
import org.eclipse.stem.model.metamodel.ModelGenSettings;
import org.eclipse.stem.model.metamodel.ModelParam;
import org.eclipse.stem.model.metamodel.ModelParamConstraint;
import org.eclipse.stem.model.metamodel.Package;
import org.eclipse.stem.model.metamodel.PackageGenSettings;
import org.eclipse.stem.model.metamodel.Transition;
import org.eclipse.stem.model.metamodel.util.MetamodelSwitch;

/**
 * Transformation utility to convert STEM Metamodel definitions to EMF Ecore.
 */
public class EcoreTransformSwitch extends MetamodelSwitch<Object> {

	/**
	 * EMF Ecore Factory
	 */
	protected static final EcoreFactory FACTORY = EcoreFactory.eINSTANCE;

	/**
	 * EPackage
	 */
	protected EPackage parentPackage;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.stem.model.metamodel.util.MetamodelSwitch#casePackage(org
	 * .eclipse.stem.model.metamodel.Package)
	 */
	@Override
	public EPackage casePackage(Package object) {
		parentPackage = FACTORY.createEPackage();

		// Allocate EClass instances for EClass-equivalent objects
		// in the metamodel
		allocateEClassInstances(object);

		parentPackage.setName(object.getName());
		parentPackage.setNsPrefix(getNSPrefixForPackage(object));
		parentPackage.setNsURI(getNSURIForPackage(object));

		for (Model model : object.getModels()) {
			parentPackage.getEClassifiers().add(caseModel(model));
		}

		// Add codegen marker
		addCodeGenMarkerAnnotation(parentPackage);

		return parentPackage;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.stem.model.metamodel.util.MetamodelSwitch#caseModel(org.eclipse
	 * .stem.model.metamodel.Model)
	 */
	@Override
	public EClass caseModel(Model object) {
		EClass modelClass = object.getClass_(); // factory.createEClass();
		modelClass.setName(object.getName());
		if (object.getParentModel() != null) {
			modelClass.getESuperTypes()
					.add(object.getParentModel().getClass_());
		}

		object.setClass(modelClass);

		if (object.getCompartments() != null) {
			modelClass.getEAnnotations().addAll(
					caseCompartmentGroup(object.getCompartments()));
		}

		for (ModelParam param : object.getParameters()) {
			modelClass.getEStructuralFeatures().add(caseModelParam(param));
		}

//		modelClass.getEAnnotations().
//			add(getTransitionEAnnotations(object.getTransitions()));
		
		if (object.getAuthor() != null) {
			modelClass.getEAnnotations().add(
					caseAuthorDetails(object.getAuthor()));
		}

		modelClass.getEAnnotations().add(createAdaptersAnnotation(object));

		addCodeGenMarkerAnnotation(modelClass);

		return modelClass;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.stem.model.metamodel.util.MetamodelSwitch#caseModelParam(
	 * org.eclipse.stem.model.metamodel.ModelParam)
	 */
	@Override
	public EStructuralFeature caseModelParam(ModelParam object) {
		EStructuralFeature modelFeature = null;
		if (object.getDataType() instanceof EDataType) {
			// Create the EAttribute for the model param if type EDataType
			modelFeature = FACTORY.createEAttribute();
		} else if (object.getDataType() instanceof EClass) {
			// create EReference for the model param if type EClass
			modelFeature = FACTORY.createEReference();
			((EReference) modelFeature).setContainment(true);
		} else {
			return null;
		}
		modelFeature.setName(object.getName());
		modelFeature.setEType(object.getDataType());
		modelFeature.setDefaultValueLiteral(object.getDefaultValue());

		if (object.getConstraints().size() > 0) {
			EAnnotation constraintAnnotation = FACTORY.createEAnnotation();
			constraintAnnotation
					.setSource(CodeGenConstants.CONSTRAINT_ANNOTATION_SOURCE);
			modelFeature.getEAnnotations().add(constraintAnnotation);
			for (ModelParamConstraint c : object.getConstraints()) {
				constraintAnnotation.getDetails().put(c.getName(),
						c.getConstraint());
			}
		}

		// Create and apply the annotation for the string messages
		EAnnotation messagesAnnotation = createMessagesAnnotation(object);
		if (messagesAnnotation != null) {
			modelFeature.getEAnnotations().add(messagesAnnotation);
		}

		// Add code generator marker annotation
		addCodeGenMarkerAnnotation(modelFeature);

		return modelFeature;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.stem.model.metamodel.util.MetamodelSwitch#
	 * caseModelParamConstraint
	 * (org.eclipse.stem.model.metamodel.ModelParamConstraint)
	 */
	@Override
	public EAnnotation caseModelParamConstraint(ModelParamConstraint object) {
		EAnnotation modelAnnotation = FACTORY.createEAnnotation();
		modelAnnotation
				.setSource(CodeGenConstants.CONSTRAINT_ANNOTATION_SOURCE);
		modelAnnotation.getDetails().put(object.getName(),
				object.getConstraint());

		return modelAnnotation;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.stem.model.metamodel.util.MetamodelSwitch#caseCompartmentGroup
	 * (org.eclipse.stem.model.metamodel.CompartmentGroup)
	 */
	@Override
	public List<EAnnotation> caseCompartmentGroup(CompartmentGroup object) {
		// Get the pre-initialized EClass instance
		EClass labelClass = object.getClass_(); // factory.createEClass();
		EClass labelValueClass = object.getValueClass(); // factory.createEClass();

		// Add EClass to the EPackage's classifier list
		parentPackage.getEClassifiers().add(labelClass);
		parentPackage.getEClassifiers().add(labelValueClass);

		// Apply the EClass reference to metamodel package
		// object.setClass(labelClass);
		// object.setValueClass(labelValueClass);

		// Set the names for the label/labe value classes
		labelClass.setName(object.getName() + "Label");
		labelValueClass.setName(object.getName() + "LabelValue");

		// Apply the super types from the metamodel's parent
		EClass parentLabel = object.getParentGroup().getClass_();
		if (parentLabel != null) {
			labelClass.getESuperTypes().add(parentLabel);
		}

		EClass parentLabelValue = object.getParentGroup().getValueClass();
		if (parentLabelValue != null) {
			labelValueClass.getESuperTypes().add(parentLabelValue);
		}

		// Create and add the EAttributes for each compartment def
		for (Compartment c : object.getCompartments()) {
			labelValueClass.getEStructuralFeatures().add(caseCompartment(c));
		}

		// Add CodeGen Marker annotation
		addCodeGenMarkerAnnotation(labelClass);
		addCodeGenMarkerAnnotation(labelValueClass);

		// Create and return the Label/LabelValue marker annotations for the
		// parent model
		EAnnotation labelAnnotation = FACTORY.createEAnnotation();
		labelAnnotation.setSource(CodeGenConstants.LABEL_ANNOTATION_SOURCE);
		labelAnnotation.getDetails()
				.put(CodeGenConstants.LABEL_SOURCE_DEFAULT_KEY,
						labelClass.getName());

		EAnnotation labelValueAnnotation = FACTORY.createEAnnotation();
		labelValueAnnotation
				.setSource(CodeGenConstants.LABEL_VALUE_ANNOTATION_SOURCE);
		labelValueAnnotation.getDetails().put(
				CodeGenConstants.LABEL_VALUE_SOURCE_DEFAULT_KEY,
				labelValueClass.getName());

		return Arrays.asList(new EAnnotation[] { labelAnnotation,
				labelValueAnnotation });
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.stem.model.metamodel.util.MetamodelSwitch#caseCompartment
	 * (org.eclipse.stem.model.metamodel.Compartment)
	 */
	@Override
	public EAttribute caseCompartment(Compartment object) {
		EAttribute modelAttribute = FACTORY.createEAttribute();

		modelAttribute.setName(object.getName());
		modelAttribute.setEType(object.getDataType());

		EAnnotation typeAnnotation = createCompartmentTypeAnnotation(object
				.getType());
		if (typeAnnotation != null) {
			modelAttribute.getEAnnotations().add(typeAnnotation);
		}

		// Add CodeGen Marker annotation
		addCodeGenMarkerAnnotation(modelAttribute);

		return modelAttribute;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.stem.model.metamodel.util.MetamodelSwitch#caseAuthorDetails
	 * (org.eclipse.stem.model.metamodel.AuthorDetails)
	 */
	@Override
	public EAnnotation caseAuthorDetails(AuthorDetails object) {
		EAnnotation authorAnnotation = FACTORY.createEAnnotation();
		authorAnnotation
				.setSource(CodeGenConstants.AUTHOR_DETAILS_ANNOTATION_SOURCE);

		for (EAttribute attribute : object.eClass().getEAttributes()) {
			Object value = object.eGet(attribute);
			if (value != null) {
				authorAnnotation.getDetails().put(attribute.getName(),
						value.toString());
			}
		}

		return authorAnnotation;
	}

	/**
	 * Creates an EAnnotation that contains various adapter settings for the
	 * model's generator settings.
	 * 
	 * @param object
	 *            Model with generator settings
	 * @return Adapters definition EAnnotation
	 */
	private EAnnotation createAdaptersAnnotation(Model object) {
		EAnnotation annotation = FACTORY.createEAnnotation();
		annotation.setSource(CodeGenConstants.ADAPTERS_ANNOTATION_SOURCE);

		ModelGenSettings settings = object.getGeneratorSettings();
		ModelGenSettings parentSettings = object.getParentModel()
				.getGeneratorSettings();
		if (settings != null) {
			// Set Property Editor Class
			if (!GeneratorUtils
					.isNullOrEmpty(settings.getPropertyEditorClass())) {
				annotation.getDetails().put(
						CodeGenConstants.PROPERTY_EDITOR_CLASS_KEY,
						settings.getPropertyEditorClass());
			}
			
			// Set String Provider Class
			if (!GeneratorUtils
					.isNullOrEmpty(settings.getStringProviderAdapterClass())) {
				annotation.getDetails().put(
						CodeGenConstants.STRING_PROVIDER_CLASS_KEY,
						settings.getStringProviderAdapterClass());
			}
			
			// Set Label Relative Value Provider Class
			if (!GeneratorUtils
					.isNullOrEmpty(settings.getLabelRelativeValueProviderAdapterClass())) {
				annotation.getDetails().put(
						CodeGenConstants.LABEL_RV_PROVIDER_CLASS_KEY,
						settings.getLabelRelativeValueProviderAdapterClass());
			}
			
			// Set Label Value Relative Value Provider Class
			if (!GeneratorUtils
					.isNullOrEmpty(settings.getLabelValueRelativeValueProviderAdapterClass())) {
				annotation.getDetails().put(
						CodeGenConstants.LABEL_VALUE_RV_PROVIDER_CLASS_KEY,
						settings.getLabelValueRelativeValueProviderAdapterClass());
			}
		}

		// Set Property Editor Super Class
		if (settings != null
				&& !GeneratorUtils.isNullOrEmpty(settings
						.getPropertyEditorParentClass())) {
			annotation.getDetails().put(
					CodeGenConstants.PROPERTY_EDITOR_SUPER_CLASS_KEY,
					settings.getPropertyEditorParentClass());
		} else if (parentSettings != null
				&& !GeneratorUtils.isNullOrEmpty(parentSettings
						.getPropertyEditorClass())) {
			annotation.getDetails().put(
					CodeGenConstants.PROPERTY_EDITOR_SUPER_CLASS_KEY,
					parentSettings.getPropertyEditorClass());
		} else {
			// Do we want the codegen default? hmm
		}
		
		// Set String Provider Super Class
		if (settings != null
				&& !GeneratorUtils.isNullOrEmpty(settings
						.getStringProviderAdapterParentClass())) {
			annotation.getDetails().put(
					CodeGenConstants.STRING_PROVIDER_SUPER_CLASS_KEY,
					settings.getStringProviderAdapterParentClass());
		} else if (parentSettings != null
				&& !GeneratorUtils.isNullOrEmpty(parentSettings
						.getStringProviderAdapterClass())) {
			annotation.getDetails().put(
					CodeGenConstants.STRING_PROVIDER_SUPER_CLASS_KEY,
					parentSettings.getStringProviderAdapterClass());
		} else {
			// Do we want the codegen default? hmm
		}
		
		// Set Label RVP Super Class
		if (settings != null
				&& !GeneratorUtils.isNullOrEmpty(settings
						.getLabelRelativeValueProviderAdapterParentClass())) {
			annotation.getDetails().put(
					CodeGenConstants.LABEL_RV_PROVIDER_SUPER_CLASS_KEY,
					settings.getLabelRelativeValueProviderAdapterParentClass());
		} else if (parentSettings != null
				&& !GeneratorUtils.isNullOrEmpty(parentSettings
						.getLabelRelativeValueProviderAdapterClass())) {
			annotation.getDetails().put(
					CodeGenConstants.LABEL_RV_PROVIDER_SUPER_CLASS_KEY,
					parentSettings.getLabelRelativeValueProviderAdapterClass());
		} else {
			// Do we want the codegen default? hmm
		}

		// Set Label Value RVP Super Class
		if (settings != null
				&& !GeneratorUtils.isNullOrEmpty(settings
						.getLabelValueRelativeValueProviderAdapterParentClass())) {
			annotation.getDetails().put(
					CodeGenConstants.LABEL_VALUE_RV_PROVIDER_SUPER_CLASS_KEY,
					settings.getLabelValueRelativeValueProviderAdapterParentClass());
		} else if (parentSettings != null
				&& !GeneratorUtils.isNullOrEmpty(parentSettings
						.getLabelValueRelativeValueProviderAdapterClass())) {
			annotation.getDetails().put(
					CodeGenConstants.LABEL_VALUE_RV_PROVIDER_SUPER_CLASS_KEY,
					parentSettings.getLabelValueRelativeValueProviderAdapterClass());
		} else {
			// Do we want the codegen default? hmm
		}
		
		
		// object.get
		return annotation;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.stem.model.metamodel.util.MetamodelSwitch#casePackageGenSettings
	 * (org.eclipse.stem.model.metamodel.PackageGenSettings)
	 */
	@Override
	public EAnnotation casePackageGenSettings(PackageGenSettings object) {
		EAnnotation annotation = FACTORY.createEAnnotation();
		return annotation;
	}

	/**
	 * Creates an EAnnotation with for the Model Param strings
	 * 
	 * @param object
	 * @return
	 */
	private EAnnotation createMessagesAnnotation(ModelParam object) {
		if (GeneratorUtils.isNullOrEmpty(object.getDisplayName())
				&& GeneratorUtils.isNullOrEmpty(object.getUnit())
				&& GeneratorUtils.isNullOrEmpty(object.getHelpMessage())
				&& GeneratorUtils.isNullOrEmpty(object.getInvalidMessage())
				&& GeneratorUtils.isNullOrEmpty(object.getMissingMessage())) {

			return null;
		}

		EAnnotation modelAnnotation = FACTORY.createEAnnotation();
		modelAnnotation.setSource(CodeGenConstants.MESSAGES_ANNOTATION_SOURCE);
		if (!GeneratorUtils.isNullOrEmpty(object.getDisplayName())) {
			modelAnnotation.getDetails().put(
					CodeGenConstants.MESSAGES_ANNOTATION_NAME_KEY,
					object.getDisplayName());
		}

		if (!GeneratorUtils.isNullOrEmpty(object.getUnit())) {
			modelAnnotation.getDetails().put(
					CodeGenConstants.MESSAGES_ANNOTATION_UNIT_KEY,
					object.getUnit());
		}

		if (!GeneratorUtils.isNullOrEmpty(object.getHelpMessage())) {
			modelAnnotation.getDetails().put(
					CodeGenConstants.MESSAGES_ANNOTATION_TOOLTIP_KEY,
					object.getHelpMessage());
		}

		if (!GeneratorUtils.isNullOrEmpty(object.getInvalidMessage())) {
			modelAnnotation.getDetails().put(
					CodeGenConstants.MESSAGES_ANNOTATION_INVALID_KEY,
					object.getInvalidMessage());
		}

		if (!GeneratorUtils.isNullOrEmpty(object.getMissingMessage())) {
			modelAnnotation.getDetails().put(
					CodeGenConstants.MESSAGES_ANNOTATION_MISSING_KEY,
					object.getMissingMessage());
		}

		return modelAnnotation;
	}

	/**
	 * Creates the EAnnotation that defines the compartment's type
	 * 
	 * @param type
	 *            The compartment type to assign
	 * @return The EAnnotation for the compartment type
	 */
	private EAnnotation createCompartmentTypeAnnotation(CompartmentType type) {
		EAnnotation annotation = null;
		if (type != CompartmentType.STANDARD) {
			annotation = FACTORY.createEAnnotation();
			annotation
					.setSource(CodeGenConstants.COMPARTMENT_TYPE_ANNOTATION_SOURCE);
			annotation.getDetails().put(
					CodeGenConstants.COMPARTMENT_TYPE_ANNOTATION_KEY,
					type.getLiteral());
		}

		return annotation;
	}
	
	

	@Override
	public EAnnotation caseTransition(Transition object) 
	{	
		Compartment source = object.getSource();
		Compartment target = object.getTarget();
		EAnnotation annotation = FACTORY.createEAnnotation();
		annotation.setSource(source.getName() +"/"+ target.getName());
		annotation.getDetails().put("expression", object.getExpression());
		annotation.getDetails().put("source", object.getSource().getName());
		annotation.getDetails().put("target", object.getTarget().getName());
		return annotation;
	}
	
//	private EAnnotation getTransitionEAnnotations(EList<Transition> transitions)
//	{
//		EAnnotation base = FACTORY.createEAnnotation();
//		base.setSource(CodeGenConstants.TRANSITIONS_ANNOTATION_SOURCE);
//		EMap<String,String> map = base.getDetails();
//		for (Transition t : transitions) {
//			map.put(t.getSource().getName() +"/"+ t.getTarget().getName(), t.getExpression());
//		}
//		return base;
//	}

	/**
	 * Adds a code generator marker annotation to the given Ecore model object
	 * 
	 * @param obj
	 *            Ecore model object
	 */
	private void addCodeGenMarkerAnnotation(EModelElement obj) {
		EAnnotation annotation = FACTORY.createEAnnotation();
		annotation
				.setSource(CodeGenConstants.GENERATOR_MARKER_ANNOTATION_SOURCE);
		annotation.getDetails().put(
				CodeGenConstants.GENERATOR_MARKER_ANNOTATION_VERSION_KEY,
				CodeGenConstants.CODEGEN_VERSION);

		obj.getEAnnotations().add(annotation);
		// return annotation;
	}

	/**
	 * Creates Ecore EClass instances for the type equivalents in this metamodel
	 * package. This includes
	 * 
	 * @param object
	 */
	private void allocateEClassInstances(Package object) {
		TreeIterator<EObject> it = object.eAllContents();
		while (it.hasNext()) {
			EObject obj = it.next();
			ALLOCATION_SWITCH.doSwitch(obj);
		}
	}

	/**
	 * Gets the EPackage Namespace Prefix for the metamodel package
	 * 
	 * @param pkg
	 * @return
	 */
	private String getNSPrefixForPackage(Package pkg) {
		StringBuilder sb = new StringBuilder();
		sb.append(pkg.getPackagePrefix());
		sb.append(".");
		sb.append(pkg.getName());
		return sb.toString().toLowerCase();
	}

	/**
	 * Gets the EPackage Namepsace URI for the metamodel package
	 * 
	 * @param pkg
	 * @return
	 */
	private String getNSURIForPackage(Package pkg) {
		StringBuilder sb = new StringBuilder();
		sb.append("http:///");
		sb.append(getNSPrefixForPackage(pkg).replace('.', '/'));
		sb.append("/");
		sb.append(pkg.getName());
		sb.append(".ecore");
		return sb.toString().toLowerCase();
	}

	/**
	 * Simple Metamodel switch that allocates EClass instances for all model and
	 * compartment groups
	 */
	private static final MetamodelSwitch<EObject> ALLOCATION_SWITCH = new MetamodelSwitch<EObject>() {

		@Override
		public EObject caseModel(Model object) {
			object.setClass(EcoreFactory.eINSTANCE.createEClass());
			caseCompartmentGroup(object.getCompartments());
			return null;
		}

		@Override
		public EObject caseCompartmentGroup(CompartmentGroup object) {
			object.setClass(EcoreFactory.eINSTANCE.createEClass());
			object.setValueClass(EcoreFactory.eINSTANCE.createEClass());
			return null;
		}

	};
}
