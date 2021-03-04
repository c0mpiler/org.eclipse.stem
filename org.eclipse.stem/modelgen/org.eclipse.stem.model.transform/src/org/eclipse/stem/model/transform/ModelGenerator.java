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

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.util.GenModelUtil;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.importer.util.ImporterUtil;
import org.eclipse.stem.model.codegen.CodeGenConstants;
import org.eclipse.stem.model.common.ModelProjectNature;
import org.eclipse.stem.model.metamodel.Package;
import org.eclipse.stem.model.metamodel.util.MetamodelSwitch;
import org.eclipse.stem.model.transform.MetamodelResourceFactory.MetamodelURIHandler;

/**
 * STEM Model Generator pipeline implementation. This class handles the
 * transformation pipeline of the STEM Metamodel to EMF Ecore to EMF GenModel
 * then invocation of the EMF code generator.
 */
public class ModelGenerator {
	private ResourceSet resourceSet;

	// private URI ecoreTempUri;
	// private URI genModelTempUri;

	private GenModelTransformSwitch genModelTransformer = new GenModelTransformSwitch();
	private MetamodelSwitch<Object> ecoreTransformer = new EcoreTransformSwitch();

	private EPackage ecore;
	private GenModel genModel;
	private Package metamodel;

	Set<EPackage> containedPackages;

	Map<String, Object> loadOptions = new HashMap<String, Object>();

	public ModelGenerator(URI modelUri) {

	}
	
	

	

	public ModelGenerator(Package model) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"ecore", new MetamodelResourceFactory());

		this.metamodel = model;
		this.resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("genmodel", new MetamodelResourceFactory());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("ecore", new MetamodelResourceFactory());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("metamodel", new MetamodelResourceFactory());
		resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap()
				.put("platform", new MetamodelResourceFactory());

		loadOptions.put(XMLResource.OPTION_URI_HANDLER,
				new MetamodelURIHandler());
	}
	
	public static void run(Package metamodel, IProgressMonitor monitor) throws CoreException, IOException
	{
		monitor.beginTask("Running Model Generator", 100);
        SubMonitor subMonitor = SubMonitor.convert(monitor,"Running Model Generator", 100);

		try {
			final ModelGenerator generator = new ModelGenerator(metamodel);
			generator.transform(subMonitor.split(10));
			generator.generate(subMonitor.split(90));
		} finally {
			//monitor.done();
		}
	}
	
	
	public ResourceSet getResourceSet()
	{
		return resourceSet;
	}

	public GenModel getGenModel() {
		return genModel;
	}

	public EPackage getEcore() {
		return ecore;
	}

	public Package getMetaModel() {
		return metamodel;
	}

	public void setGenModelTransformer(GenModelTransformSwitch transformer) {
		genModelTransformer = transformer;
	}

	public void setEcoreTransformer(MetamodelSwitch<Object> transformer) {
		ecoreTransformer = transformer;
	}

	public String getGeneratedModelPluginID()
	{
		if (genModel != null) {
			return genModel.getModelPluginID();
		}
		return null;
	}
	
	private void applyGenModelSettings() {
		String project = ecore.getNsPrefix();
		String projectSource = "/" + project + "/src";

		genModel.setModelPluginID(project);
		genModel.setModelDirectory(projectSource);
		genModel.setModelName(metamodel.getName());

		genModel.setEditPluginID(project);
		genModel.setEditDirectory(projectSource);

		genModel.setEditorPluginID(project);
		genModel.setEditorDirectory(projectSource);

		genModel.setImporterID(CodeGenConstants.STEM_CODE_GENERATOR_ID);

		genModel.setTemplateDirectory(CodeGenConstants.CODEGEN_TEMPLATES_PATH);
		genModel.getTemplatePluginVariables().add(
				"STEM_CODEGEN=org.eclipse.stem.model.codegen");
		genModel.getTemplatePluginVariables().add(
				"STEM_METAMODEL=org.eclipse.stem.model");
		
		genModel.setDynamicTemplates(true);
		genModel.setForceOverwrite(true);
		genModel.setPublicConstructors(true);
		genModel.setSuppressNotification(true);

		genModel.setComplianceLevel(CodeGenConstants.JVM_SUPPORT_LEVEL);
	}

	private void resolveEPackageCrossReferences(EObject eObject,
			Set<EPackage> containedEPackages) {
		if (eObject == null) {
			return;
		}
		if (eObject instanceof EPackage) {
			containedEPackages.add((EPackage) eObject);
			resolveEPackageCrossReferences(
					((EPackage) eObject).getESuperPackage(), containedEPackages);
		}
		for (EObject obj : eObject.eCrossReferences()) {
			if (obj.eContainer() instanceof EPackage) {
				resolveEPackageCrossReferences(obj.eContainer(),
						containedEPackages);
			}
		}
	}

	private void resolveReferencedEPackages() {
		containedPackages = new HashSet<EPackage>();

		ecore.eContainer();
		resolveEPackageCrossReferences(ecore, containedPackages);
		for (Iterator<EObject> i = ecore.eAllContents(); i.hasNext();) {
			EObject childEObject = i.next();
			resolveEPackageCrossReferences(childEObject, containedPackages);
		}
	}

	private void addReferencedEPackagesToGenModel() {
		for (EPackage pkgRef : containedPackages) {
			URI packageGenmodelUri = EcorePlugin
					.getEPackageNsURIToGenModelLocationMap(true).get(
							pkgRef.getNsURI());

			GenModel gmToInclude = null;

			if (packageGenmodelUri != null) {
				try {
					if (packageGenmodelUri.isPlatformResource()) {
						packageGenmodelUri = URI.createPlatformPluginURI(packageGenmodelUri.toPlatformString(true), true);
					}
					
					gmToInclude = loadGenModel(packageGenmodelUri, resourceSet);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			if (gmToInclude == null) {
				gmToInclude = EPackageManager.getInstance()
						.findGenModelForPackage(pkgRef);
			}

			if (gmToInclude == null && pkgRef.eResource() != null) {
				EPackageManager.getInstance().loadGenModelsForResource(
						pkgRef.eResource(), new NullProgressMonitor());
				gmToInclude = EPackageManager.getInstance()
						.findGenModelForPackage(pkgRef);
			}

			if (gmToInclude != null) {

				ImporterUtil.addUniqueGenPackages(
						genModel.getUsedGenPackages(),
						gmToInclude.getGenPackages());
			} else {
				//System.err.println("No GM for " + pkgRef.getName());
			}
		}
		
		ECollections.sort(genModel.getUsedGenPackages(), new Comparator<GenPackage>() {

			@Override
			public int compare(GenPackage arg0, GenPackage arg1) {
				return arg0.getNSURI().compareTo(arg1.getNSURI());
			}
			
		});
	}

	private void findAndReplaceSuperType(EClass eClass, String packageUri,
			String className) {
		EClass foundSuperType = null;
		for (EClass superType : eClass.getEAllSuperTypes()) {
			if (superType.eIsProxy()) {
				superType = (EClass) EcoreUtil.resolve(superType, resourceSet);
			}
			if (superType.getEPackage() != null
					&& packageUri.equals(superType.getEPackage().getNsURI())
					&& className.equals(superType.getName())) {
				foundSuperType = superType;
			}
		}

		if (foundSuperType != null) {
			eClass.getESuperTypes().clear();
			eClass.getESuperTypes().add(foundSuperType);
		}
	}

	private void doSTEMSpecificECoreAdjustments() {
		TreeIterator<Object> iter = EcoreUtil.getAllContents(Collections
				.singletonList(ecore));
		while (iter.hasNext()) {
			Object obj = iter.next();
			if (obj instanceof EClass) {
				EClass ecls = (EClass) obj;

				findAndReplaceSuperType(
						ecls,
						"http:///org/eclipse/stem/diseasemodels/standard.ecore",
						"StandardDiseaseModelLabel");
				findAndReplaceSuperType(ecls,
						"http:///org/eclipse/stem/populationmodels/standard",
						"StandardPopulationModelLabel");
			}
		}
	}

	private GenModel loadGenModel(URI uri, ResourceSet resourceSet)
			throws IOException {
		return (GenModel) load(uri, resourceSet);
	}

	private EObject load(URI uri, ResourceSet resourceSet) throws IOException {
		resourceSet.getURIConverter().getURIMap()
				.putAll(EcorePlugin.computePlatformURIMap(true));
		Resource genModelResource = resourceSet.createResource(uri);
		genModelResource.load(loadOptions);
		return genModelResource.getContents().get(0);
	}

	// private EPackage loadEcore(URI ecoreUri, ResourceSet resourceSet)
	// throws IOException {
	// return (EPackage) load(ecoreUri, resourceSet);
	// }

	public void generateEcoreAndGenmodel(IProgressMonitor monitor) throws CoreException {
		try {
			monitor.beginTask("Generating Ecore and Metamodel Metamodel", 2);
			monitor.subTask("Generating ECore");
			// Generate Ecore
			ecore = createEPackage(metamodel);
			resolveReferencedEPackages();
			doSTEMSpecificECoreAdjustments();
			monitor.worked(1);
			
			monitor.subTask("Generating GenModel");
			// Generate GenModel
			genModel = createGenModel(ecore);
			applyGenModelSettings();
			addReferencedEPackagesToGenModel();
			monitor.worked(1);
		} finally {
			monitor.done();
		}
	}
	
	public void transform(IProgressMonitor monitor) throws CoreException, IOException {
		try {
			
	        SubMonitor subMonitor = SubMonitor.convert(monitor, "Transforming Metamodel", 4);

			setupWorkspace(subMonitor.split(1));

			generateEcoreAndGenmodel(subMonitor.split(2));

			subMonitor.subTask("Serializing ECore and GenModel");
			serializeModels(TMP_PROJECT_NAME);
			subMonitor.worked(1);
		} finally {
			//monitor.done();
		}
	}
	
	private void serializeModels(String projectName) throws IOException {
		String modelName = ecore.getName();

		saveResource(ecore, getEcoreUri(projectName, modelName), resourceSet);
		saveResource(genModel, getGenModelUri(projectName, modelName),
				resourceSet);
		saveResource(metamodel, getMetamodelUri(projectName, modelName),
				resourceSet);
		
		EAnnotation metamodelPath = EcoreFactory.eINSTANCE.createEAnnotation();
		metamodelPath.setSource(CodeGenConstants.METAMODEL_URI_ANNOTATION_SOURCE);
		metamodelPath.getDetails().put("uri", metamodel.eResource().getURI().toString());
		ecore.getEAnnotations().add(metamodelPath);
		
		saveResource(ecore, getEcoreUri(projectName, modelName), resourceSet);
	}

	private static final String JET_PROJECT_NAME = ".JETEmitters";

	private static final String TMP_PROJECT_NAME = ".stemgenerator";
	private static final String DEFAULT_ECORE_PATH = "model";

	protected void setupWorkspace(IProgressMonitor monitor)
			throws CoreException {
        SubMonitor subMonitor = SubMonitor.convert(monitor, "Workspace Setup", 4);

		IWorkspaceRoot wsr = ResourcesPlugin.getWorkspace().getRoot();

		// Remove existing JET Emitters project
		IProject jetProject = wsr.getProject(JET_PROJECT_NAME);
		if (jetProject.exists()) {
			jetProject.delete(true, true, subMonitor.split(1));
		}

		// Create the STEM Temporary models project
		IProject tmpProject = wsr.getProject(TMP_PROJECT_NAME);
		if (tmpProject.exists()) {
			tmpProject.delete(true, true, subMonitor.split(1));
		}
		tmpProject.create(subMonitor.split(1));
		tmpProject.open(subMonitor.split(1));
		//monitor.done();
	}

	protected URI getModelUri(String projectName, String modelName,
			String extension) {
		return URI.createPlatformResourceURI("/" + projectName + "/"
				+ DEFAULT_ECORE_PATH + "/" + modelName.toLowerCase() + "."
				+ extension, true);
	}

	protected URI getMetamodelUri(String projectName, String modelName) {
		return getModelUri(projectName, modelName, "metamodel");
	}

	protected URI getEcoreUri(String projectName, String modelName) {
		return getModelUri(projectName, modelName, "ecore");
	}

	protected URI getGenModelUri(String projectName, String modelName) {
		return getModelUri(projectName, modelName, "genmodel");
	}

	public Diagnostic generate(IProgressMonitor monitor) throws CoreException, IOException {

		BasicDiagnostic diagnosticResponse = new BasicDiagnostic();

		try {
			
	        SubMonitor subMonitor = SubMonitor.convert(monitor, "Generation", 6);


	        subMonitor.subTask("Configuring Code Generator");
			Generator g = createGenerator(genModel);
			genModel.setCanGenerate(true);
			g.setInput(genModel);
			subMonitor.worked(1);

			subMonitor.subTask("Generating Model Code");
			Diagnostic modelResult = g.generate(genModel,
					GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE,
					"model project",
					BasicMonitor.toMonitor(subMonitor.split(1)));

			diagnosticResponse.merge(modelResult);

			subMonitor.subTask("Generating Edit Code");
			Diagnostic editResult = g.generate(genModel,
					GenBaseGeneratorAdapter.EDIT_PROJECT_TYPE, "edit project",
					BasicMonitor.toMonitor(subMonitor.split(1)));

			diagnosticResponse.merge(editResult);

			subMonitor.subTask("Generating Editor Code");
			Diagnostic editorResult = g.generate(genModel,
					GenBaseGeneratorAdapter.EDITOR_PROJECT_TYPE,
					"editor project",
					BasicMonitor.toMonitor(subMonitor.split(1)));

			diagnosticResponse.merge(editorResult);

			subMonitor.subTask("Saving Models and Cleanup");
			serializeModels(genModel.getModelPluginID());
			
			try {
				addModelNature(genModel.getModelPluginID());
				
				
			} catch (CoreException ce) {
				Activator.log(new Status(
						Status.WARNING, Activator.PLUGIN_ID, "Unable to add model project nature to generated project.", ce));
			}
			subMonitor.worked(1);
			
			subMonitor.subTask("Cleaning up workspace");
			cleanupWorkspace(subMonitor.split(1));
			
		} finally {
			//monitor.done();
		}

		return diagnosticResponse;
	}

	private void addModelNature(String projectId) throws CoreException {
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectId);
		ModelProjectNature.addNature(project);
		ModelProjectNature.updateBuilders(project);
	}
	
	private void cleanupWorkspace(final IProgressMonitor monitor) throws CoreException {
		monitor.beginTask("Cleaning up workspace", 2);
        SubMonitor subMonitor = SubMonitor.convert(monitor,"Cleaning up workspace", 2);
        
		IWorkspaceRoot wsr = ResourcesPlugin.getWorkspace().getRoot();

		IProject tmpProject = wsr.getProject(TMP_PROJECT_NAME);
		if (tmpProject.exists()) {
			tmpProject.delete(true, true, subMonitor.split(1));
		}
		
		IProject jetProject = wsr.getProject(JET_PROJECT_NAME);
		if (jetProject.exists()) {
			jetProject.delete(true, true, subMonitor.split(1));
		}
		//monitor.done();
	}

	private EPackage createEPackage(Package modelPackage) {
		return (EPackage) ecoreTransformer.doSwitch(modelPackage);
	}

	private GenModel createGenModel(EPackage ePkg) {
		return genModelTransformer.transform(ePkg);
	}

	@SuppressWarnings("unused")
	private void printReferencedPackages() {
		System.out.println("Referenced EPackages\n-----------");
		if (containedPackages != null) {
			for (EPackage pkgRef : containedPackages) {
				System.out.println(pkgRef.getNsURI());
			}
		}
		System.out.println("\n-----------\n");
	}

	public void saveResource(EObject model, URI locationUri,
			ResourceSet resourceSet) throws IOException {
		Resource r = resourceSet.createResource(locationUri);
		r.getContents().add(model);
		r.save(null);
	}

	private boolean splitModelAndEditorPlugins = false;
	private boolean generateCode = true;

	public boolean isGenerateCode() {
		return generateCode;
	}

	public void setGenerateCode(boolean generate) {
		this.generateCode = generate;
	}

	public void setSplitModelAndEditorPlugins(boolean split) {
		splitModelAndEditorPlugins = split;
	}

	public boolean isSplitModelAndEditorPlugins() {
		return splitModelAndEditorPlugins;
	}

	public static Generator createGenerator(GenModel genModel) {
		return GenModelUtil.createGenerator(genModel);

		// DelegatingRegistry overrideRegistry = new DelegatingRegistry();
		// overrideRegistry.addDescriptor("http://www.eclipse.org/emf/2002/GenModel",
		// new Descriptor() {
		//
		// @Override
		// public GeneratorAdapterFactory createAdapterFactory() {
		// return new CustomGeneratorAdapterFactory();
		// }
		//
		// });
		//
		// Generator generator = new Generator(overrideRegistry);
		// generator.getOptions();
		// generator.setInput(genModel);
		// JControlModel jControlModel = generator.getJControlModel();
		//
		// if (genModel.isCodeFormatting()) {
		// jControlModel.setLeadingTabReplacement(null);
		// jControlModel.setConvertToStandardBraceStyle(false);
		// } else {
		// Map<?, ?> options = JavaCore.getOptions();
		// String tabSize = (String) options
		// .get(DefaultCodeFormatterConstants.FORMATTER_TAB_SIZE);
		// String braceStyle = (String) options
		// .get(DefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_TYPE_DECLARATION);
		// String tabCharacter = (String) options
		// .get(DefaultCodeFormatterConstants.FORMATTER_TAB_CHAR);
		// if (JavaCore.TAB.equals(tabCharacter)) {
		// jControlModel.setLeadingTabReplacement("\t");
		// } else {
		// String spaces = "";
		// for (int i = Integer.parseInt(tabSize); i > 0; --i) {
		// spaces += " ";
		// }
		// jControlModel.setLeadingTabReplacement(spaces);
		// }
		// jControlModel
		// .setConvertToStandardBraceStyle(DefaultCodeFormatterConstants.END_OF_LINE
		// .equals(braceStyle));
		// }
		// return generator;
	}
}
