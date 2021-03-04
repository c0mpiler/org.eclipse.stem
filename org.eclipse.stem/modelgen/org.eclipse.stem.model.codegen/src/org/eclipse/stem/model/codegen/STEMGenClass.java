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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.stem.model.codegen.descriptor.ModelGeneratorDescriptor;
import org.eclipse.stem.model.metamodel.Compartment;
import org.eclipse.stem.model.metamodel.Model;
import org.eclipse.stem.model.metamodel.Package;
import org.eclipse.stem.model.metamodel.Transition;
import org.eclipse.stem.model.xtext.ExpressionMethodDefinition;
import org.eclipse.stem.model.xtext.ExpressionMethodGenerator;

/**
 * Wrapper for GenClass. Provides STEM-specific methods for STEM's Model
 * Generator.
 * 
 */
public class STEMGenClass {
	private ModelGeneratorDescriptor descriptor;
	private GenClass genClass;

	public STEMGenClass(GenClass genClass) {
		this.genClass = genClass;
		this.descriptor = ModelGeneratorDescriptors.getInstance()
				.getDescriptorForGenClass(genClass);
	}

	public static STEMGenClass get(GenClass genClass) {
		return new STEMGenClass(genClass);
	}

	public ModelGeneratorDescriptor getDescriptor() {
		return descriptor;
	}

	public STEMGenPackage getSTEMGenPackage() {
		return STEMGenPackage.get(genClass.getGenPackage());
	}

	public GenClass getGenClass() {
		return genClass;
	}
	
	public URI getIcon()
	{
		return descriptor.getIconURI();
	}

	public boolean isComputationalModel() {
		return GeneratorUtils.classExtends(genClass,
				CodeGenConstants.INTEGRATION_DECORATOR_DESCRIPTOR);
	}

	public boolean isIntegrationLabel() {
		return GeneratorUtils.classExtends(genClass,
				CodeGenConstants.INTEGRATION_LABEL_DESCRIPTOR);
	}

	public boolean isIntegrationLabelValue() {
		return GeneratorUtils.classExtends(genClass,
				CodeGenConstants.INTEGRATION_LABEL_VALUE_DESCRIPTOR);
	}

	public String getLabelValueClassName() {
		if (isIntegrationLabel()) {
			return genClass.getName() + "Value";
		}

		return null;
	}

	/**
	 * !!!! TODO DO SOMETHING ABOUT THIS !!!!
	 */
	public String getLabelTypeURI() {
		if ("PopulationModel".equals(getComputationalModelType())) {
			return "URI_TYPE_DYNAMIC_POPULATION_LABEL";
		} else {
			return "URI_TYPE_DYNAMIC_DISEASE_LABEL";
		}
	}

	public String getModelTypeClassName() {
		return GeneratorUtils.getQualifiedJavaNameForDescriptor(
				genClass.getGenPackage(), descriptor.getBaseModel());
	}

	public String getComputationalModelType() {
		return getDescriptor().getModelType();
	}

	public String getExtensionPointName() {
		return getDescriptor().getExtensionPointId();
	}

	public List<STEMGenFeature> getSTEMGenFeatures() {
		List<STEMGenFeature> features = new ArrayList<STEMGenFeature>();
		for (GenFeature genFeature : genClass.getDeclaredGenFeatures()) {
			features.add(STEMGenFeature.get(genFeature, genClass));
		}
		return features;
	}
	
	public List<STEMGenFeature> getAllCompartmentFeatures() {
		List<STEMGenFeature> features = new ArrayList<STEMGenFeature>();
		if (isIntegrationLabelValue()) {
			if (genClass.getBaseGenClass() != null) {
				features.addAll(STEMGenClass.get(genClass.getBaseGenClass()).getAllCompartmentFeatures());
			}
			features.addAll(getSTEMGenFeatures());
		}
		return features;
	}
	
	public STEMGenFeature getSTEMGenFeatureForName(String name)
	{		
		for (GenFeature genFeature : genClass.getDeclaredGenFeatures()) {
			if (genFeature.getName().equals(name)) {
				return STEMGenFeature.get(genFeature, genClass);
			}
		}
		return null;
	}
	

	public List<String> getPrimitiveAccessorTypes() {
		return STEMGenFeature.getPrimitiveAccessorTypes();
	}

	public String getPrimitiveGetterName(String primitive) {
		return STEMGenFeature.getPrimitiveAccessorName("eGet", primitive);
	}

	public String getPrimitiveSetterName(String primitive) {
		return STEMGenFeature.getPrimitiveAccessorName("eSet", primitive);
	}

	public boolean shouldGeneratePrimitiveAccessors(String primitiveType) {
		if (GeneratorUtils.classExtends(genClass,
				CodeGenConstants.PRIMITIVE_TYPE_OPERATIONS_DESCRIPTOR)) {
			for (GenFeature genFeature : genClass.getEGetGenFeatures()) {
				if (genFeature.getImportedType(genClass).equals(primitiveType)) {
					return true;
				}
			}
		}
		return false;
	}

	public static String getPrimitiveObjectName(String primitiveName) {
		if ("long".equals(primitiveName)) {
			return "Long";
		} else if ("short".equals(primitiveName)) {
			return "Short";
		} else if ("double".equals(primitiveName)) {
			return "Double";
		} else if ("int".equals(primitiveName)) {
			return "Integer";
		} else if ("byte".equals(primitiveName)) {
			return "Byte";
		} else if ("float".equals(primitiveName)) {
			return "Float";
		} else if ("boolean".equals(primitiveName)) {
			return "Boolean";
		}

		return primitiveName;
	}

	public String getDefaultStringProviderClassName() {
		return getDefaultPropertyEditorClassName() + "." + genClass.getName()
				+ "PropertyStringProviderAdapter";
	}

	public String getDefaultPropertyEditorClassName() {
		return getAdaptersPackageName() + "." + genClass.getName()
				+ "PropertyEditor";
	}

	public String getAdaptersPackageName() {
		return genClass.getGenPackage().getPresentationPackageName();
	}

	public String getDefaultStringProviderSuperClassName() {
		GenClass superClass = genClass.getBaseGenClass();
		GenPackage superGenPkg = superClass.getGenPackage();
		STEMGenPackage pkg = STEMGenPackage.get(superGenPkg);

		if (pkg.usesSTEMGenerator()) {
			STEMGenClass superGenClass = STEMGenClass.get(superClass);
			return superGenClass.getStringProviderClassName();
		}

		return pkg.getDefaultStringProviderClassName();
	}

	public String getDefaultPropertyEditorSuperClassName() {
		GenClass superClass = genClass.getBaseGenClass();
		GenPackage superGenPkg = superClass.getGenPackage();
		STEMGenPackage pkg = STEMGenPackage.get(superGenPkg);

		if (pkg.usesSTEMGenerator()) {
			STEMGenClass superGenClass = STEMGenClass.get(superClass);
			return superGenClass.getPropertyEditorClassName();
		}

		return pkg.getDefaultPropertyEditorClassName();
	}

	public String getStringProviderClassName() {
		EAnnotation annotation = getAdaptersAnnotation();
		if (annotation != null) {
			String editorClass = annotation.getDetails().get(
					CodeGenConstants.STRING_PROVIDER_CLASS_KEY);
			if (!GeneratorUtils.isNullOrEmpty(editorClass)) {
				if (editorClass.indexOf('.') > -1) {
					return editorClass;
				} else {
					return genClass.getGenPackage()
							.getPresentationPackageName() + "." + editorClass;
				}
			}
		}
		
		return getDefaultStringProviderClassName();
	}

	public String getStringProviderSuperClassName() {
		EAnnotation annotation = getAdaptersAnnotation();
		if (annotation != null) {
			String editorClass = annotation.getDetails().get(
					CodeGenConstants.STRING_PROVIDER_SUPER_CLASS_KEY);
			if (!GeneratorUtils.isNullOrEmpty(editorClass)) {
				if (editorClass.indexOf('.') > -1) {
					return editorClass;
				} else {
					return genClass.getGenPackage()
							.getPresentationPackageName() + "." + editorClass;
				}
			}
		}
		
		return getDefaultStringProviderSuperClassName();
	}

	public String getPropertyEditorClassName() {
		EAnnotation annotation = getAdaptersAnnotation();
		if (annotation != null) {
			String editorClass = annotation.getDetails().get(
					CodeGenConstants.PROPERTY_EDITOR_CLASS_KEY);
			if (!GeneratorUtils.isNullOrEmpty(editorClass)) {
				if (editorClass.indexOf('.') > -1) {
					return editorClass;
				} else {
					return genClass.getGenPackage()
							.getPresentationPackageName() + "." + editorClass;
				}
			}
		}

		return getDefaultPropertyEditorClassName();
	}

	public String getPropertyEditorSuperClassName() {
		String className = null;
		EAnnotation annotation = getAdaptersAnnotation();
		if (annotation != null) {
			String editorClass = annotation.getDetails().get(
					CodeGenConstants.PROPERTY_EDITOR_SUPER_CLASS_KEY);
			if (!GeneratorUtils.isNullOrEmpty(editorClass)) {
				if (editorClass.indexOf('.') > -1) {
					className = editorClass;
				} else {
					className = genClass.getGenPackage()
							.getPresentationPackageName() + "." + editorClass;
				}
			}
		}

		if (className == null) {
			className = getDefaultPropertyEditorSuperClassName();
		}

		return className;
	}

	private EAnnotation getAdaptersAnnotation() {
		return genClass.getEcoreClass().getEAnnotation(
				CodeGenConstants.ADAPTERS_ANNOTATION_SOURCE);
	}

	private EAnnotation getLabelAnnotation() {
		return genClass.getEcoreClass().getEAnnotation(
				CodeGenConstants.LABEL_ANNOTATION_SOURCE);
	}

	private EAnnotation getLabelValueAnnotation() {
		return genClass.getEcoreClass().getEAnnotation(
				CodeGenConstants.LABEL_VALUE_ANNOTATION_SOURCE);
	}

	public String getDefaultModelLabelType() {
		GenClass gc = getDefaultLabelGenClass();
		return gc.getGenPackage().getInterfacePackageName() + "."
				+ gc.getName();
	}

	public String getDefaultModelLabelValueType() {
		GenClass gc = getDefaultLabelValueGenClass();
		return gc.getGenPackage().getInterfacePackageName() + "."
				+ gc.getName();
	}

	public GenClass getDefaultLabelGenClass() {
		return GeneratorUtils.getDefaultEntryFromMap(getLabelGenClasses(),
				CodeGenConstants.LABEL_SOURCE_DEFAULT_KEY);
	}

	public GenClass getDefaultLabelValueGenClass() {
		return GeneratorUtils.getDefaultEntryFromMap(getLabelValueGenClasses(),
				CodeGenConstants.LABEL_VALUE_SOURCE_DEFAULT_KEY);
	}

	public Map<String, GenClass> getLabelGenClasses() {
		EAnnotation annotation = getLabelAnnotation();
		if (annotation == null) {
			return null;
		}

		return GeneratorUtils.getGenClassesForAnnotations(genClass, annotation);
	}

	public Map<String, GenClass> getLabelValueGenClasses() {
		EAnnotation annotation = getLabelValueAnnotation();
		if (annotation == null) {
			return null;
		}

		return GeneratorUtils.getGenClassesForAnnotations(genClass, annotation);
	}

	public String getLabelBaseType() {
		return GeneratorUtils.getQualifiedJavaNameForDescriptor(
				genClass.getGenPackage(), getDescriptor().getBaseLabel());
	}

	public String getLabelValueBaseType() {
		return GeneratorUtils.getQualifiedJavaNameForDescriptor(
				genClass.getGenPackage(), getDescriptor().getBaseLabelValue());
	}

	public String getPropertyEditorAdapterBaseType() {
		return GeneratorUtils.getQualifiedJavaNameForDescriptor(getDescriptor()
				.getPropertyEditorAdapter());
	}

	public String getPropertyEditorBaseType() {
		return GeneratorUtils.getQualifiedJavaNameForDescriptor(getDescriptor()
				.getPropertyEditor());
	}

	public String getPropertyEditorCompositeBaseType() {
		return GeneratorUtils.getQualifiedJavaNameForDescriptor(getDescriptor()
				.getPropertyEditorComposite());
	}

	public String getLabelRelativeValueProviderSuperClassName() {
		EAnnotation annotation = getAdaptersAnnotation();
		if (annotation != null) {
			String labelRVPClass = annotation.getDetails().get(
					CodeGenConstants.LABEL_RV_PROVIDER_SUPER_CLASS_KEY);
			if (!GeneratorUtils.isNullOrEmpty(labelRVPClass)) {
				if (labelRVPClass.indexOf('.') > -1) {
					return labelRVPClass;
				} else {
					return genClass.getGenPackage()
							.getPresentationPackageName() + "." + labelRVPClass;
				}
			}
		}		
		
		return GeneratorUtils.getQualifiedJavaNameForDescriptor(getDescriptor()
				.getLabelRelativeValueProvider());
	}

	public String getLabelValueRelativeValueProviderSuperClassName() {
		EAnnotation annotation = getAdaptersAnnotation();
		if (annotation != null) {
			String labelRVPClass = annotation.getDetails().get(
					CodeGenConstants.LABEL_VALUE_RV_PROVIDER_SUPER_CLASS_KEY);
			if (!GeneratorUtils.isNullOrEmpty(labelRVPClass)) {
				if (labelRVPClass.indexOf('.') > -1) {
					return labelRVPClass;
				} else {
					return genClass.getGenPackage()
							.getPresentationPackageName() + "." + labelRVPClass;
				}
			}
		}	
		
		return GeneratorUtils.getQualifiedJavaNameForDescriptor(getDescriptor()
				.getLabelValueRelativeValueProvider());
	}
	
	public String getFormattedModelName()
	{
		return GeneratorUtils.formatToCapWords(genClass.getName());
	}
	
	public Model getMetamodelModel(Package metamodel)
	{
		if (isComputationalModel()) {
			return GeneratorUtils.getMetamodelModelForGenClass(genClass, metamodel);
		}
		return null;
	}
	
	private List<STEMGenFeature> getCompartmentsForComputationalModelFromLabelValue()
	{
		GenClass labelValue = getDefaultLabelValueGenClass();
		if (labelValue != null) {
			return STEMGenClass.get(labelValue).getAllCompartmentFeatures();
		}
		return null;
	}
	
	public List<ExpressionMethodDefinition> getGeneratedExpressionMethods()
	{
		Package metamodel = getSTEMGenPackage().getMetamodel();
		ExpressionMethodGenerator gen = new ExpressionMethodGenerator(genClass, getDefaultLabelValueGenClass());
		List<ExpressionMethodDefinition> expressions = new ArrayList<ExpressionMethodDefinition>();
		List<STEMGenFeature> compartments = getCompartmentsForComputationalModelFromLabelValue();
		
		Model model = getMetamodelModel(metamodel);
		if (model != null) {
			for (Transition t : model.getTransitions()) {
				String sourceName = t.getSource().getName();
				String targetName = t.getTarget().getName();

				STEMGenFeature sourceFeature = GeneratorUtils.findGenFeatureForEClass(sourceName, compartments);
				STEMGenFeature targetFeature = GeneratorUtils.findGenFeatureForEClass(targetName, compartments);
				List<STEMGenFeature> forIncidences = new ArrayList<STEMGenFeature>();
				
				
				for (Compartment forIncidenceCompartment : t.getForIncidence()) {
					forIncidences.add(GeneratorUtils.findGenFeatureForEClass(forIncidenceCompartment.getName(), compartments));
				}

				ExpressionMethodDefinition expression = gen.generateExpressionMethod(t, sourceFeature, targetFeature, forIncidences);
				if (expression != null) {
					expressions.add(expression);
				}
			}
		}
		
		return expressions;
	}
	
	public Set<String> getGeneratorAffectedCompartments(List<ExpressionMethodDefinition> transitionExpressions)
	{
		Set<String> compartments = new HashSet<String>();
		for (ExpressionMethodDefinition expr : transitionExpressions) {			
			compartments.add(GeneratorUtils.formatToUpperCaseWordsNoSpaces(
					expr.getTransition().getSource().getName()));
			compartments.add(GeneratorUtils.formatToUpperCaseWordsNoSpaces(
					expr.getTransition().getTarget().getName()));
			for (String incidence : expr.getIncidenceCompartments()) {
				compartments.add(incidence);
			}
		}
		return compartments;
	}
	
	public String getExpressionsClassName()
	{
		return genClass.getName() + "Expressions";
	}
}
