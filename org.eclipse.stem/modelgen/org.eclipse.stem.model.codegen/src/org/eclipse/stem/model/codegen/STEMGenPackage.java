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

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.stem.model.codegen.descriptor.ModelGeneratorDescriptor;
import org.eclipse.stem.model.xtext.XtextUtils;

/**
 * Wrapper for GenPackage. Provides STEM-specific methods for STEM's Model
 * Generator.
 * 
 */
public class STEMGenPackage {

	/**
	 * TODO This should be permanently relocated to metamodel
	 */
	public static final Map<String, String> FIXED_DEFAULT_PACKAGE_STRING_PROVIDERS = new HashMap<String, String>();
	public static final Map<String, String> FIXED_DEFAULT_PACKAGE_PROPERTY_EDITORS = new HashMap<String, String>();
	static {
		FIXED_DEFAULT_PACKAGE_PROPERTY_EDITORS
				.put("org.eclipse.stem.diseasemodels.multipopulation",
						"org.eclipse.stem.diseasemodels.multipopulation.presentation.MultiPopulationDiseaseModelPropertyEditor");

		FIXED_DEFAULT_PACKAGE_STRING_PROVIDERS
				.put("org.eclipse.stem.diseasemodels.multipopulation",
						"org.eclipse.stem.diseasemodels.multipopulation.presentation.MultiPopulationPropertyStringProviderAdapterFactory.MultiPopulationPropertyStringProviderAdapter");
	}

	protected GenPackage pkg;
	protected List<ModelGeneratorDescriptor> descriptors;

	public STEMGenPackage(GenPackage pkg) {
		this.pkg = pkg;
	}

	public static STEMGenPackage get(GenPackage pkg) {
		return new STEMGenPackage(pkg);
	}

	public GenPackage getGenPackage() {
		return pkg;
	}

	public List<ModelGeneratorDescriptor> getPackageDescriptors() {
		if (descriptors == null) {
			descriptors = ModelGeneratorDescriptors.getInstance()
					.getDescriptorsForGenPackage(pkg);
		}
		return descriptors;
	}

	public boolean usesSTEMGenerator() {
		return (pkg.getEcorePackage().getEAnnotation(
				CodeGenConstants.GENERATOR_MARKER_ANNOTATION_SOURCE) != null);
	}

	public String getDefaultStringProviderClassName() {
		String stringProviderAdapter = FIXED_DEFAULT_PACKAGE_STRING_PROVIDERS
				.get(pkg.getNSName());

		// Get the string provider adapter from the default model generator
		// definition.
		// We should never get here. This is an evacuation when all else fails.
		// Compile errors are possible
		if (stringProviderAdapter == null) {
			System.err
					.println("WARNING: String Provider Adapter is not found through normal procedures.  Trying best guess.  This may cause compile errors.");

			List<ModelGeneratorDescriptor> descriptors = getPackageDescriptors();
			if (descriptors != null && descriptors.size() > 0) {
				stringProviderAdapter = GeneratorUtils
						.getQualifiedJavaNameForDescriptor(descriptors.get(0)
								.getPropertyStringAdapter());
			}

			if (stringProviderAdapter == null) {
				System.err
						.println("FATAL: String Provider Adapter lookup failed. "
								+ pkg.getNSURI());

			}

			// if (hasPopulationModel()) {
			// editorClassName =
			// "org.eclipse.stem.ui.populationmodels.standard.wizards.StandardPropertyStringProviderAdapterFactory.StandardPropertyStringProviderAdapter";
			// } else {
			// editorClassName =
			// "org.eclipse.stem.ui.wizards.StandardPropertyStringProviderAdapterFactory.StandardPropertyStringProviderAdapter";
			// }
		}

		return stringProviderAdapter;
	}

	public String getDefaultPropertyEditorClassName() {
		String propertyEditor = FIXED_DEFAULT_PACKAGE_PROPERTY_EDITORS.get(pkg
				.getNSName());

		// Get the property editor from the default model generator definition.
		// We should never get here. This is an evacuation when all else fails.
		// Compile errors are possible
		if (propertyEditor == null) {
			System.err
					.println("WARNING: Property Editor is not found through normal procedures.  Trying best guess.  This may cause compile errors.");

			List<ModelGeneratorDescriptor> descriptors = getPackageDescriptors();
			if (descriptors != null && descriptors.size() > 0) {
				propertyEditor = GeneratorUtils
						.getQualifiedJavaNameForDescriptor(descriptors.get(0)
								.getPropertyEditor());
			}

			if (propertyEditor == null) {
				System.err.println("FATAL: Property Editor lookup failed. "
						+ pkg.getNSURI());

			}

			// if (hasPopulationModel()) {
			// editorClassName =
			// "org.eclipse.stem.ui.populationmodels.standard.wizards.StandardPopulationModelPropertyEditor";
			// } else {
			// editorClassName =
			// "org.eclipse.stem.ui.wizards.StandardDiseaseModelPropertyEditor";
			// }
		}

		return propertyEditor;
	}

	public boolean hasComputationalModel() {
		return getComputationalModelClasses().size() > 0;
	}

	public List<STEMGenClass> getComputationalModelClasses() {
		return GeneratorUtils.getSTEMGenClasses(GeneratorUtils
				.findGenClassesThatExtendBaseType(pkg,
						CodeGenConstants.INTEGRATION_DECORATOR_DESCRIPTOR));
	}

	public List<STEMGenClass> getIntegrationLabelClasses() {
		return GeneratorUtils.getSTEMGenClasses(GeneratorUtils
				.findGenClassesThatExtendBaseType(pkg,
						CodeGenConstants.INTEGRATION_LABEL_DESCRIPTOR));
	}

	public List<STEMGenClass> getIntegrationLabelValueClasses() {
		return GeneratorUtils.getSTEMGenClasses(GeneratorUtils
				.findGenClassesThatExtendBaseType(pkg,
						CodeGenConstants.INTEGRATION_LABEL_VALUE_DESCRIPTOR));
	}

	public Map<String, String> getPropertyEditorAdapterFactoryBaseTypes() {
		Map<String, String> types = new HashMap<String, String>();
		for (ModelGeneratorDescriptor descriptor : getPackageDescriptors()) {
			String className = GeneratorUtils
					.getQualifiedJavaNameForDescriptor(descriptor
							.getPropertyEditorAdapterFactory());
			if (className != null) {
				types.put(descriptor.getModelType(), className);
			}
		}
		return types;
	}

	public Map<String, String> getPropertyEditorAdapterBaseTypes() {
		Map<String, String> types = new HashMap<String, String>();
		for (ModelGeneratorDescriptor descriptor : getPackageDescriptors()) {
			String className = GeneratorUtils
					.getQualifiedJavaNameForDescriptor(descriptor
							.getPropertyEditorAdapter());
			if (className != null) {
				types.put(descriptor.getModelType(), className);
			}
		}
		return types;
	}

	public Map<String, String> getPropertyStringAdapterFactoryBaseTypes() {
		Map<String, String> types = new HashMap<String, String>();
		for (ModelGeneratorDescriptor descriptor : getPackageDescriptors()) {
			String className = GeneratorUtils
					.getQualifiedJavaNameForDescriptor(descriptor
							.getPropertyStringAdapterFactory());
			if (className != null) {
				types.put(descriptor.getModelType(), className);
			}
		}
		return types;
	}
	
	public org.eclipse.stem.model.metamodel.Package getMetamodel()
	{
		// get metamodel
		
		EPackage ePackage = pkg.getEcorePackage();
		
		EAnnotation annotation = ePackage.getEAnnotation(CodeGenConstants.METAMODEL_URI_ANNOTATION_SOURCE);
		
		if (annotation != null) {
			String uri = annotation.getDetails().get("uri");
			try {
				return GeneratorUtils.loadMetamodel(URI.createURI(uri));
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
		return null;
	}
	
	public Set<String> getContributingPlugins()
	{
		return XtextUtils.getContributingPluginsForMetamodel(getMetamodel());
	}

	// public List<STEMGenClass> getClassesThatExtendByQualifiedName(String
	// className)
	// {
	//
	// GeneratorUtils.
	// List<STEMGenClass> classes = new ArrayList<STEMGenClass>();
	// for (GenClass genClass : pkg.getGenClasses()) {
	// for (GenClass g2 : genClass.getAllBaseGenClasses()) {
	// if (g2 != null && g2.getQualifiedInterfaceName().equals(className)) {
	// classes.add(STEMGenClass.get(genClass));
	// break;
	// }
	// }
	// }
	//
	// return classes;
	// }
	//
	// public static String getPrimitiveObjectName(String primitiveName)
	// {
	// if ("long".equals(primitiveName)) {
	// return "Long";
	// } else if ("short".equals(primitiveName)) {
	// return "Short";
	// } else if ("double".equals(primitiveName)) {
	// return "Double";
	// } else if ("int".equals(primitiveName)) {
	// return "Integer";
	// } else if ("byte".equals(primitiveName)) {
	// return "Byte";
	// } else if ("float".equals(primitiveName)) {
	// return "Float";
	// } else if ("boolean".equals(primitiveName)) {
	// return "Boolean";
	// }
	//
	// return primitiveName;
	// }
	//
	// public String getModelTypeQualifiedClassName()
	// {
	// if (hasPopulationModel()) {
	// return "org.eclipse.stem.populationmodels.standard.PopulationModel";
	// } else {
	// return "org.eclipse.stem.diseasemodels.standard.DiseaseModel";
	// }
	// }
	//
	// public String getModelTypeClassName()
	// {
	// if (hasPopulationModel()) {
	// return "PopulationModel";
	// } else {
	// return "DiseaseModel";
	// }
	// }
	//
	// public String getModelType()
	// {
	// if (hasPopulationModel()) {
	// return "Population";
	// } else {
	// return "Disease";
	// }
	// }
	//
	// public boolean extendsQualifiedClass(String className)
	// {
	// for (GenClass genClass : pkg.getGenClasses()) {
	// for (GenClass g2 : genClass.getAllBaseGenClasses()) {
	// if (g2.getQualifiedInterfaceName().equals(className)) {
	// return true;
	// }
	// }
	// }
	// return false;
	// }
	//
	//
	// public boolean hasDiseaseModel()
	// {
	// return getDiseaseModelClasses().size() > 0;
	// }
	//
	// public boolean hasPopulationModel()
	// {
	// return getPopulationModelClasses().size() > 0;
	// }
	//
	//
	// public List<STEMGenClass> getDiseaseModelClasses()
	// {
	// return getClassesThatExtendByQualifiedName(DISEASE_MODEL_BASE_CLASS);
	// }
	//
	// public List<STEMGenClass> getPopulationModelClasses()
	// {
	// return getClassesThatExtendByQualifiedName(POPULATION_MODEL_BASE_CLASS);
	// }
}