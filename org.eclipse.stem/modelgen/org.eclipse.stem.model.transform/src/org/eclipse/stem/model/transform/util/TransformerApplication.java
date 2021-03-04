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
package org.eclipse.stem.model.transform.util;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceProxy;
import org.eclipse.core.resources.IResourceProxyVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.util.GenModelUtil;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.importer.util.ImporterUtil;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.stem.model.codegen.ModelGeneratorDescriptors;
import org.eclipse.stem.model.codegen.descriptor.ModelGeneratorDescriptor;
import org.eclipse.stem.model.metamodel.Compartment;
import org.eclipse.stem.model.metamodel.CompartmentGroup;
import org.eclipse.stem.model.metamodel.CompartmentType;
import org.eclipse.stem.model.metamodel.MetamodelFactory;
import org.eclipse.stem.model.metamodel.Model;
import org.eclipse.stem.model.metamodel.ModelGenSettings;
import org.eclipse.stem.model.metamodel.ModelParam;
import org.eclipse.stem.model.metamodel.ModelParamConstraint;
import org.eclipse.stem.model.metamodel.ModelType;
import org.eclipse.stem.model.metamodel.Package;
import org.eclipse.stem.model.transform.EcoreTransformSwitch;
import org.eclipse.stem.model.transform.GenModelTransformSwitch;
import org.eclipse.stem.model.transform.MetamodelResourceFactory;
import org.eclipse.stem.model.transform.ModelGenerator;

@SuppressWarnings("unused")
public class TransformerApplication implements IApplication {

	ResourceSet resourceSet = new ResourceSetImpl();

	// URI ecoreUri =
	// URI.createFileURI("/Users/mattadav/projects/STEM/workspaces/main/org.eclipse.stem.model.transform/data/test1.ecore");
	URI ecoreUri = URI.createPlatformResourceURI(
			"/testproject2/model/test1.ecore", true);
	URI genmodelUri = URI.createPlatformResourceURI(
			"/testproject2/model/test1.genmodel", true);
	URI ecoreProjectUri = URI.createPlatformResourceURI("/testproject2", true);

	public TransformerApplication() {

		
		//resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("genmodel", new MetamodelResourceFactory());
		//resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new MetamodelResourceFactory());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("metamodel", new MetamodelResourceFactory());
		resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put("stem", new MetamodelResourceFactory());
		
//		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());

//		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("metamodel", new MetamodelResourceFactory());
		
		
//		resourceSet.getResourceFactoryRegistry().
		
		
//		resourceSet
//				.getResourceFactoryRegistry()
//				.getExtensionToFactoryMap()
//				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
//						new MetamodelResourceFactory());

	}

	
	
	private Package loadModel(URI uri)
	{
		//URI modelUri = URI.createFileURI(uri);
	
		Resource modelResource = resourceSet.getResource(uri, true);
		for (Resource.Diagnostic d : modelResource.getErrors()) {
			System.err.println(d.getMessage());
		}
		
		return  (Package)modelResource.getContents().get(0);
	}
	
	private EPackage loadEcore(URI uri)
	{
		//URI modelUri = URI.createFileURI(uri);
	
		Resource modelResource = resourceSet.getResource(uri, true);
		return  (EPackage)modelResource.getContents().get(0);
	}
	
	
	
	
	private EClass getParentModel() throws Exception
	{
		final List<IResource> ecores = new ArrayList<IResource>();
		
		Job searchJob = new Job("asdf") {
			public IStatus run(IProgressMonitor monitor) {
				try {
					IWorkspace ws = ResourcesPlugin.getWorkspace();
					ws.getRoot().accept(new IResourceProxyVisitor() {
			
						@Override
						public boolean visit(IResourceProxy proxy) throws CoreException {
			
							if (proxy.getName().endsWith(".ecore")) {
								ecores.add(proxy.requestResource());
							}
			
							// TODO Auto-generated method stub
							return !proxy.getName().startsWith(".");
						}
						
					}, IResource.NONE);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				return Status.OK_STATUS;
			}
		};
		
		searchJob.schedule();
		searchJob.join();

		ResourceSet rs = new ResourceSetImpl();
		
		EClass cls = null;
		for (IResource ecore : ecores) {
			URI ecoreURI = URI.createPlatformResourceURI(ecore.getFullPath().toString(), true);
			Resource r = rs.createResource(ecoreURI);
			r.load(null);
			EPackage pkg = (EPackage)r.getContents().get(0);
			cls = (EClass)pkg.getEClassifier("PolioOpvIpvDiseaseModel");
			
			if (cls != null) {
				break;
			}
			
			if (pkg != null) {
//				EPackage.Registry.INSTANCE.put(pkg.getNsURI(), pkg);
			}
			
		}
		
		return cls;

	}
	
	
	
	private void setupWorkspace() throws CoreException
	{
		
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(".JETEmitters");
		project.delete(true, new NullProgressMonitor());
		project.create(new NullProgressMonitor());
		
//		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject("org.eclipse.stem.diseasemodels");
//		if (!project.exists()) {
//			project.create(new NullProgressMonitor());
//			
//		}
		
		project.open(null);
		//project.open(0, new NullProgressMonitor());
		
		for (IResource res : project.members()) {
			System.out.println(res);
		}
		
		ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
	}
	
	@Override
	public Object start(IApplicationContext arg0) throws Exception {

		setupWorkspace();
		
//		MetamodelPackageManager pkgMgr = MetamodelPackageManager.getInstance();
		
		
		List<ModelGeneratorDescriptor> ds = ModelGeneratorDescriptors.getInstance().getDescriptors();
		for (ModelGeneratorDescriptor d : ds) {
			System.out.println(d);
		}
		
		String basePath = "/Users/mattadav/projects/STEM/workspaces/main38/org.eclipse.stem.model/data/base.metamodel";
		String extenPath = "/Users/mattadav/projects/STEM/workspaces/main38/org.eclipse.stem.model.transform/data/extended.metamodel";
		
		String basePluginUri = "/org.eclipse.stem.diseasemodels/model/standard.metamodel";
		
		String extendedPluginUri = "/org.eclipse.stem.diseasemodels.swinesalmonella/model/swinesalmonella.metamodel";
//		setupWorkspace();
		
		URI extendURI = URI.createPlatformPluginURI(extendedPluginUri, true);
		URI baseURI = URI.createPlatformPluginURI(basePluginUri, true);

//		Package basePkg = loadModel(baseURI);
//		EcoreUtil.resolveAll(basePkg);
		
		Package extendPkg = loadModel(extendURI);
		EcoreUtil.resolveAll(extendPkg);
		
		ModelGenSettings settings = MetamodelFactory.eINSTANCE.createModelGenSettings();
		settings.setPropertyEditorParentClass("org.eclipse.stem.ui.wizards.StandardDiseaseModelPropertyEditor");
		
		extendPkg.getModels().get(0).setGeneratorSettings(settings);
		
//		Package extendPkg = createOPVModel(basePkg.getModels().get(3));
		
		ModelGenerator generator = new ModelGenerator(extendPkg);
		generator.transform(new NullProgressMonitor());
		generator.generate(new NullProgressMonitor());
		
		return IStatus.OK;
	}
	
	
	private GenModel loadGenModel(URI genModelUri, ResourceSet resourceSet)
			throws Exception {
		// GenModelPackage modelgenInstance = GenModelPackage.eINSTANCE;
		// ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getURIConverter().getURIMap()
				.putAll(EcorePlugin.computePlatformURIMap(true));
		Resource genModelResource = resourceSet.getResource(genModelUri, true);
		GenModel genModel = (GenModel) genModelResource.getContents().get(0);
		return genModel;
	}

	private EPackage loadEcore(URI ecoreUri, ResourceSet resourceSet)
			throws Exception {
		resourceSet.getURIConverter().getURIMap()
				.putAll(EcorePlugin.computePlatformURIMap(true));
		Resource ecoreResource = resourceSet.getResource(ecoreUri, true);
		EPackage ep = (EPackage) ecoreResource.getContents().get(0);
		return ep;
	}

	private boolean shouldIncludeGenModel(GenModel gm) {
		return !gm.getModelName().equals("GenModel");
	}

	private void addReferencedPackagesToGenModel(GenModel gm) {
		for (EPackage pkgRef : containedEPackages) {
			URI packageGenmodelUri = EcorePlugin
					.getEPackageNsURIToGenModelLocationMap(true).get(
							pkgRef.getNsURI());
			if (packageGenmodelUri != null) {
				try {
					GenModel gmToInclude = loadGenModel(packageGenmodelUri,
							resourceSet);
					if (shouldIncludeGenModel(gmToInclude)) {
						ImporterUtil.addUniqueGenPackages(
								gm.getUsedGenPackages(),
								gmToInclude.getGenPackages());
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	private void prepareWorkspace() throws Exception {
		IWorkspace ws = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot wsr = ws.getRoot();

		IProject modelProject = wsr
				.getProject("org.eclipse.stem.diseasemodels.testmodel");
		IProject codegenProject = wsr.getProject(".JETEmitters");
		IProject testProject = wsr.getProject("testproject2");

		try {
			modelProject.delete(true, new NullProgressMonitor());
			codegenProject.delete(true, new NullProgressMonitor());
			testProject.delete(true, new NullProgressMonitor());
		} catch (Throwable t) {
			t.printStackTrace();
		}

		testProject.create(new NullProgressMonitor());
		testProject.open(new NullProgressMonitor());

		ws.getDescription().setAutoBuilding(false);
		ResourcesPlugin
				.getWorkspace()
				.getRoot()
				.refreshLocal(IResource.DEPTH_INFINITE,
						new NullProgressMonitor());
	}

	private void generate(GenModel gm) throws Exception {
		// resourceSet.
		if (gm == null) {
			gm = loadGenModel(genmodelUri, resourceSet);
		}
		System.out.println("Got GenModel: " + gm);

		Generator g = GenModelUtil.createGenerator(gm);
		gm.setCanGenerate(true);
		g.setInput(gm);
		Diagnostic d1 = g.generate(gm,
				GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, "model project",
				BasicMonitor.toMonitor(new NullProgressMonitor()));
		g.generate(gm, GenBaseGeneratorAdapter.EDIT_PROJECT_TYPE,
				"edit project",
				BasicMonitor.toMonitor(new NullProgressMonitor()));
		g.generate(gm, GenBaseGeneratorAdapter.EDITOR_PROJECT_TYPE,
				"editor project",
				BasicMonitor.toMonitor(new NullProgressMonitor()));
	}

	private GenModel createGenModel(EPackage ePkg) {
		return new GenModelTransformSwitch().transform(ePkg);
	}

	Set<EPackage> containedEPackages = new HashSet<EPackage>();

	private void resolveCrossReferences(EObject eObject) {
		if (eObject == null) {
			return;
		}

		if (eObject instanceof EPackage) {
			containedEPackages.add((EPackage) eObject);
			resolveCrossReferences(((EPackage) eObject).getESuperPackage());
		}
		for (EObject obj : eObject.eCrossReferences()) {
			if (obj.eContainer() instanceof EPackage) {
				resolveCrossReferences(obj.eContainer());
			}
		}
	}

	private void resolveReferencedEPackages(EPackage ePkg) {
		ePkg.eContainer();
		resolveCrossReferences(ePkg);
		for (Iterator<EObject> i = ePkg.eAllContents(); i.hasNext();) {
			EObject childEObject = i.next();
			resolveCrossReferences(childEObject);
		}
	}

	private EPackage createEPackage(Package modelPackage)
	{
		EcoreTransformSwitch transformer = new EcoreTransformSwitch();
		return (EPackage) transformer.doSwitch(modelPackage);
	}
	
	

	public void print(EObject m) throws Exception {

		// URI fileURI =
		// URI.createPlatformResourceURI("/testproject/data/test1.ecore", true);
		// //).createFileURI("/Users/mattadav/projects/STEM/workspaces/main/org.eclipse.stem.model.transform/data/test1.ecore");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		Resource poResource = resourceSet.createResource(genmodelUri);
		poResource.getContents().add(m);
		
		Map<Object,Object> options = new HashMap<Object,Object>();
		options.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
		
		
		poResource.save(baos, options);

		System.out.println(baos.toString());
		// return ecoreUri;
	}

	public URI save(GenModel m, ResourceSet resourceSet) throws Exception {

		Resource poResource = resourceSet.createResource(genmodelUri);
		poResource.getContents().add(m);
		poResource.save(null);

		return ecoreUri;
	}

	public URI save(EPackage m, ResourceSet resourceSet) throws Exception {

		// URI fileURI =
		// URI.createPlatformResourceURI("/testproject/data/test1.ecore", true);
		// //).createFileURI("/Users/mattadav/projects/STEM/workspaces/main/org.eclipse.stem.model.transform/data/test1.ecore");

		Resource poResource = resourceSet.createResource(ecoreUri);
		poResource.getContents().add(m);
		poResource.save(null);

		return ecoreUri;
	}

	public void save(Package m, URI uri) throws Exception {

		Resource poResource = resourceSet.createResource(uri);
		poResource.getContents().add(m);
		poResource.save(null);
	}

	private void createProject() throws Exception {
		IProgressMonitor progressMonitor = new NullProgressMonitor();
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject("testproject");
		project.create(progressMonitor);
		project.open(progressMonitor);
	}

//	private void doSTEMSpecificAdjustments(EPackage ePkg) {
//		TreeIterator<Object> iter = EcoreUtil.getAllContents(Collections
//				.singletonList(ePkg));
//		while (iter.hasNext()) {
//			Object obj = iter.next();
//			if (obj instanceof EClass) {
//				EClass ecls = (EClass) obj;
//				if (ecls.getEAllSuperTypes().contains(
//						StandardPackage.Literals.STANDARD_DISEASE_MODEL_LABEL)) {
//					ecls.getESuperTypes().clear();
//					ecls.getESuperTypes()
//							.add(StandardPackage.Literals.STANDARD_DISEASE_MODEL_LABEL);
//				}
//
//				if (ecls.getEAllSuperTypes()
//						.contains(
//								org.eclipse.stem.populationmodels.standard.StandardPackage.Literals.STANDARD_POPULATION_MODEL)) {
//					ecls.getESuperTypes().clear();
//					ecls.getESuperTypes()
//							.add(org.eclipse.stem.populationmodels.standard.StandardPackage.Literals.STANDARD_POPULATION_MODEL);
//				}
//			}
//		}
//	}
	
	private Model getModelForName(String name, Package basePackage) {
		for (Model m : basePackage.getModels()) {
			if (m.getName().equals(name)) {
				return m;
			}
		}
		return null;
	}
	
	
	private Package createExtendedModel(Package basePackage) throws Exception
	{
		Model sirDM = getModelForName("SIR", basePackage);
		
		Package pkg = MetamodelFactory.eINSTANCE.createPackage();
		pkg.setName("Extended");
		pkg.setPackagePrefix("org.eclipse.stem.diseasemodels");
		
		Model extendedSIRDM = MetamodelFactory.eINSTANCE.createModel();
		extendedSIRDM.setName("ExtendedSIR");
		extendedSIRDM.setParentModel(sirDM);
		extendedSIRDM.setModelType(ModelType.DISEASE_MODEL);
		extendedSIRDM.setClass(null);
		
		CompartmentGroup extendedSIRCG = MetamodelFactory.eINSTANCE.createCompartmentGroup();
		extendedSIRCG.setName("ExtendedSIRLabel");
		extendedSIRCG.setParentGroup(sirDM.getCompartments());
		
		Compartment s2 = MetamodelFactory.eINSTANCE.createCompartment();
		s2.setDataType(EcorePackage.Literals.EDOUBLE);
		s2.setName("s2");
		
		Compartment i2 = MetamodelFactory.eINSTANCE.createCompartment();
		i2.setDataType(EcorePackage.Literals.EDOUBLE);
		i2.setName("i2");
		
		Compartment r2 = MetamodelFactory.eINSTANCE.createCompartment();
		r2.setDataType(EcorePackage.Literals.EDOUBLE);
		r2.setName("r2");
		
		extendedSIRCG.getCompartments().add(s2);
		extendedSIRCG.getCompartments().add(i2);
		extendedSIRCG.getCompartments().add(r2);
		extendedSIRDM.setCompartments(extendedSIRCG);
		
		pkg.getModels().add(extendedSIRDM);
		
		
		
		Model extendedAgainSIRDM = MetamodelFactory.eINSTANCE.createModel();
		extendedAgainSIRDM.setName("ExtendedAgainSIR");
		extendedAgainSIRDM.setParentModel(extendedSIRDM);
		extendedAgainSIRDM.setModelType(ModelType.DISEASE_MODEL);
		extendedAgainSIRDM.setClass(null);
		
		CompartmentGroup extendedAgainSIRCG = MetamodelFactory.eINSTANCE.createCompartmentGroup();
		extendedAgainSIRCG.setName("ExtendedAgainSIRLabel");
		extendedAgainSIRCG.setParentGroup(extendedSIRCG);
		
		Compartment s3 = MetamodelFactory.eINSTANCE.createCompartment();
		s3.setDataType(EcorePackage.Literals.EDOUBLE);
		s3.setName("s3");
		
		Compartment i3 = MetamodelFactory.eINSTANCE.createCompartment();
		i3.setDataType(EcorePackage.Literals.EDOUBLE);
		i3.setName("i3");
		
		Compartment r3 = MetamodelFactory.eINSTANCE.createCompartment();
		r3.setDataType(EcorePackage.Literals.EDOUBLE);
		r3.setName("r3");
		
		extendedAgainSIRCG.getCompartments().add(s3);
		extendedAgainSIRCG.getCompartments().add(i3);
		extendedAgainSIRCG.getCompartments().add(r3);
		extendedAgainSIRDM.setCompartments(extendedAgainSIRCG);
		
		pkg.getModels().add(extendedAgainSIRDM);
		
		
		return pkg;
	}
	
	private Package createBaseModel() throws Exception
	{

		EPackage ePackage = loadEcore(URI.createPlatformPluginURI("/org.eclipse.stem.diseasemodels/model/standard.ecore", true));
		EcoreUtil.resolveAll(ePackage);
		
		ePackage.getEClassifier("StandardDiseaseModel");
		
		Package pkg = MetamodelFactory.eINSTANCE.createPackage();
		pkg.setName("DiseaseModels");
		pkg.setPackagePrefix("org.eclipse.stem");
		
		Model stdDM = MetamodelFactory.eINSTANCE.createModel();
		stdDM.setName("StandardDiseaseModel");
		stdDM.setParentModel(null);
		stdDM.setModelType(ModelType.DISEASE_MODEL);
		stdDM.setClass((EClass)ePackage.getEClassifier("StandardDiseaseModel"));
		
		CompartmentGroup stdCG = MetamodelFactory.eINSTANCE.createCompartmentGroup();
		stdCG.setName("StandardDiseaseModelLabel");
		stdCG.setClass((EClass)ePackage.getEClassifier("StandardDiseaseModelLabel"));
		stdCG.setValueClass((EClass)ePackage.getEClassifier("StandardDiseaseModelLabelValue"));
		
		Compartment s = MetamodelFactory.eINSTANCE.createCompartment();
		s.setDataType(EcorePackage.Literals.EDOUBLE);
		s.setName("s");
		
		stdCG.getCompartments().add(s);
		stdDM.setCompartments(stdCG);
		
		pkg.getModels().add(stdDM);
		
		
		Model siDM = MetamodelFactory.eINSTANCE.createModel();
		siDM.setName("SI");
		siDM.setParentModel(stdDM);
		siDM.setModelType(ModelType.DISEASE_MODEL);
		siDM.setClass((EClass)ePackage.getEClassifier("SI"));
		
		CompartmentGroup siCG = MetamodelFactory.eINSTANCE.createCompartmentGroup();
		siCG.setName("SILabel");
		siCG.setClass((EClass)ePackage.getEClassifier("SILabel"));
		siCG.setValueClass((EClass)ePackage.getEClassifier("SILabelValue"));
		siCG.setParentGroup(stdCG);
		
		Compartment i = MetamodelFactory.eINSTANCE.createCompartment();
		i.setDataType(EcorePackage.Literals.EDOUBLE);
		i.setName("i");
		
		siCG.getCompartments().add(i);
		siDM.setCompartments(siCG);
		
		pkg.getModels().add(siDM);
		
		
		Model sirDM = MetamodelFactory.eINSTANCE.createModel();
		sirDM.setName("SIR");
		sirDM.setParentModel(siDM);
		sirDM.setModelType(ModelType.DISEASE_MODEL);
		sirDM.setClass((EClass)ePackage.getEClassifier("SIR"));
		
		CompartmentGroup sirCG = MetamodelFactory.eINSTANCE.createCompartmentGroup();
		sirCG.setName("SIRLabel");
		sirCG.setParentGroup(siCG);
		sirCG.setClass((EClass)ePackage.getEClassifier("SIRLabel"));
		sirCG.setValueClass((EClass)ePackage.getEClassifier("SIRLabelValue"));
		
		Compartment r = MetamodelFactory.eINSTANCE.createCompartment();
		r.setDataType(EcorePackage.Literals.EDOUBLE);
		r.setName("r");
		
		sirCG.getCompartments().add(r);
		sirDM.setCompartments(sirCG);
		
		pkg.getModels().add(sirDM);
		
		
		Model seirDM = MetamodelFactory.eINSTANCE.createModel();
		seirDM.setName("SEIR");
		seirDM.setParentModel(sirDM);
		seirDM.setModelType(ModelType.DISEASE_MODEL);
		seirDM.setClass((EClass)ePackage.getEClassifier("SEIR"));
		
		CompartmentGroup seirCG = MetamodelFactory.eINSTANCE.createCompartmentGroup();
		seirCG.setName("SEIRLabel");
		seirCG.setParentGroup(sirCG);
		seirCG.setClass((EClass)ePackage.getEClassifier("SEIRLabel"));
		seirCG.setValueClass((EClass)ePackage.getEClassifier("SEIRLabelValue"));
		
		Compartment e = MetamodelFactory.eINSTANCE.createCompartment();
		e.setDataType(EcorePackage.Literals.EDOUBLE);
		e.setName("e");
		
		seirCG.getCompartments().add(e);
		seirDM.setCompartments(seirCG);
		
		pkg.getModels().add(seirDM);
		
		return pkg;
		
	}

//	private EPackage createEcore() throws Exception {
//
//		Package pkg = MetamodelFactory.eINSTANCE.createPackage();
//		pkg.setName("TestModel");
//		pkg.setPackagePrefix("org.eclipse.stem.diseasemodels");
//
//		Model model3 = MetamodelFactory.eINSTANCE.createModel();
//		model3.setName("TransformedMultiPopulationModel");
//		//model3.setParentModel(MultipopulationPackage.Literals.MULTI_POPULATION_SI_DISEASE_MODEL);
//		pkg.getModels().add(model3);
//
//		Model model2 = MetamodelFactory.eINSTANCE.createModel();
//		model2.setName("TransformedPopulationModel");
//		model2.setParentModel(org.eclipse.stem.populationmodels.standard.StandardPackage.Literals.STANDARD_POPULATION_MODEL);
//		pkg.getModels().add(model2);
//
//		Model model = MetamodelFactory.eINSTANCE.createModel();
//		model.setName("TransformedDiseaseModel");
//		model.setParentModel(StandardPackage.Literals.SI);
//
//		AuthorDetails author = MetamodelFactory.eINSTANCE.createAuthorDetails();
//		author.setTitle("Test Transformed Disease Model");
//		author.setDescription("this is a test description for this DM");
//		author.setLicense("Eclipse Public License v1");
//		model.setAuthor(author);
//
//		ModelParamConstraint mpc1 = MetamodelFactory.eINSTANCE
//				.createModelParamConstraint();
//		mpc1.setName("minValue");
//		mpc1.setConstraint("-50.0");
//
//		ModelParamConstraint mpc2 = MetamodelFactory.eINSTANCE
//				.createModelParamConstraint();
//		mpc2.setName("maxValue");
//		mpc2.setConstraint("50.0");
//
//		ModelParam param = MetamodelFactory.eINSTANCE.createModelParam();
//		param.setName("param1");
//		param.setDisplayName("Parameter 1");
//		param.setDataType(EcorePackage.Literals.EDOUBLE);
//		param.setDefaultValue("0.0");
//
//		param.getConstraints().add(EcoreUtil.copy(mpc1));
//		param.getConstraints().add(EcoreUtil.copy(mpc2));
//
//		ModelParam param2 = MetamodelFactory.eINSTANCE.createModelParam();
//		param2.setName("param2");
//		param2.setDisplayName("Parameter 2");
//		param2.setDefaultValue("0.0");
//
//		param2.setDataType(EcorePackage.Literals.ESTRING);
//		param2.getConstraints().add(EcoreUtil.copy(mpc1));
//		param2.getConstraints().add(EcoreUtil.copy(mpc2));
//
//		model.getParameters().add(param);
//		model.getParameters().add(param2);
//
//		model2.getParameters().add(EcoreUtil.copy(param));
//		model2.getParameters().add(EcoreUtil.copy(param2));
//
//		CompartmentGroup ld2 = MetamodelFactory.eINSTANCE
//				.createCompartmentGroup();
//		ld2.setName("TransformedPopulation");
//		ld2.setParentGroup(org.eclipse.stem.populationmodels.standard.StandardPackage.Literals.STANDARD_POPULATION_MODEL_LABEL);
//
//		Compartment ld21 = MetamodelFactory.eINSTANCE.createCompartment();
//		ld21.setDataType(EcorePackage.Literals.EDOUBLE);
//		ld21.setName("ld21");
//
//		ld2.getCompartments().add(ld21);
//
//		CompartmentGroup ld = MetamodelFactory.eINSTANCE
//				.createCompartmentGroup();
//		ld.setName("Transformed");
//		ld.setParentGroup(StandardPackage.Literals.SI_LABEL);
//
//		Compartment c1 = MetamodelFactory.eINSTANCE.createCompartment();
//		c1.setName("s1");
//		c1.setDataType(EcorePackage.Literals.EDOUBLE);
//
//		Compartment c2 = MetamodelFactory.eINSTANCE.createCompartment();
//		c2.setName("s2");
//		c2.setDataType(EcorePackage.Literals.EDOUBLE);
//
//		Compartment c3 = MetamodelFactory.eINSTANCE.createCompartment();
//		c3.setName("dd1");
//		c3.setType(CompartmentType.DEATHS);
//		c3.setDataType(EcorePackage.Literals.EDOUBLE);
//
//		Compartment c4 = MetamodelFactory.eINSTANCE.createCompartment();
//		c4.setName("icd2");
//		c4.setType(CompartmentType.INCIDENCE);
//		c4.setDataType(EcorePackage.Literals.EDOUBLE);
//
//		Compartment c5 = MetamodelFactory.eINSTANCE.createCompartment();
//		c5.setName("icd1");
//		c5.setType(CompartmentType.INCIDENCE);
//		c5.setDataType(EcorePackage.Literals.EDOUBLE);
//
//		ld.getCompartments().add(c1);
//		ld.getCompartments().add(c2);
//		ld.getCompartments().add(c3);
//		ld.getCompartments().add(c4);
//		ld.getCompartments().add(c5);
//
//		model.setCompartments(ld);
//
//		model2.setCompartments(ld2);
//
//		pkg.getModels().add(model);
//
//		save(pkg);
//
//		EcoreTransformSwitch transformer = new EcoreTransformSwitch();
//
//		return (EPackage) transformer.doSwitch(pkg);
//
//		// System.out.println(uri.toPlatformString(true));
//		// return ePkg;
//
//	}
	
	static final MetamodelFactory factory = MetamodelFactory.eINSTANCE;
	
	public Package createOPVModel(Model parent) {

		Package polioPackage = factory.createPackage();
		polioPackage.setName("PolioOpvIpv");
		polioPackage.setPackagePrefix("org.eclipse.stem.diseasemodels");

		// Polio OPV Disease Model
		Model polioOPVDiseaseModel = factory.createModel();
		polioOPVDiseaseModel.setParentModel(parent);
		polioOPVDiseaseModel.setName("PolioOpvIpvDiseaseModel");
		polioOPVDiseaseModel.setModelType(ModelType.DISEASE_MODEL);

		setupOPVParameters(polioOPVDiseaseModel);
		setupOPVLabel(polioOPVDiseaseModel);
		
		polioPackage.getModels().add(polioOPVDiseaseModel);
		
		return polioPackage;

	}
	
	private void setupOPVParameters(Model model)
	{
		ModelParam a = factory.createModelParam();
		a.setDataType(EcorePackage.Literals.EDOUBLE);
		a.setName("opvEfficacy");
		a.setDefaultValue("0.9");
		a.setDisplayName("Efficacy of live-attenuated vaccine (a)");
		addZeroOneConstraint(a);
		
		model.getParameters().add(a);
		
//		ModelParam p = factory.createModelParam();
//		p.setDataType(EcorePackage.Literals.EDOUBLE);
//		p.setName("vaccinatedPopulation");
//		p.setDefaultValue("0.0");
//		p.setDisplayName("Vaccinated Population (p)");
//		addZeroOneConstraint(p);
//		
//		model.getParameters().add(p);
		
		ModelParam phi = factory.createModelParam();
		phi.setDataType(EcorePackage.Literals.EDOUBLE);
		phi.setName("reversionRateOPV");
		phi.setDefaultValue("10e-4");
		phi.setDisplayName("OPV Reversion Rate (φ)");
		addZeroOneConstraint(phi);
		
		model.getParameters().add(phi);
		
//		ModelParam mu1 = factory.createModelParam();
//		mu1.setDataType(EcorePackage.Literals.EDOUBLE);
//		mu1.setName("birthDeathRateDeveloped");
//		mu1.setDefaultValue("0.02");
//		mu1.setDisplayName("Birth-Death Rate - Developed Countries (μ1)");
//		addZeroOneConstraint(mu1);
//		
//		model.getParameters().add(mu1);
		
		ModelParam mu2 = factory.createModelParam();
		mu2.setDataType(EcorePackage.Literals.EDOUBLE);
		mu2.setName("birthDeathRateDeveloping");
		mu2.setDefaultValue("0.04");
		mu2.setDisplayName("Birth-Death Rate - Developing Countries (μ)");
		addZeroOneConstraint(mu2);
		
		model.getParameters().add(mu2);
		
		ModelParam betaOPV = factory.createModelParam();
		betaOPV.setDataType(EcorePackage.Literals.EDOUBLE);
		betaOPV.setName("transmissionRateOPV");
		betaOPV.setDefaultValue("0.1");
		betaOPV.setDisplayName("Transmission Rate - OPV Derived Virus (βopv)");
		addZeroOneConstraint(betaOPV);
		
		model.getParameters().add(betaOPV);
		
		ModelParam betaW = factory.createModelParam();
		betaW.setDataType(EcorePackage.Literals.EDOUBLE);
		betaW.setName("transmissionRateWild");
		betaW.setDefaultValue("0.5");
		betaW.setDisplayName("Transmission Rate - Wild Virus (βw)");
		addZeroOneConstraint(betaW);
		
		model.getParameters().add(betaW);
		
		ModelParam fr = factory.createModelParam();
		fr.setDataType(EcorePackage.Literals.EDOUBLE);
		fr.setName("relativeSusceptibilityRecentOPV");
		fr.setDefaultValue("0.25");
		fr.setDisplayName("Relative Susceptibility - Recent OPV Infection (fr)");
		addZeroOneConstraint(fr);
		
		model.getParameters().add(fr);
		
		
		ModelParam fi = factory.createModelParam();
		fi.setDataType(EcorePackage.Literals.EDOUBLE);
		fi.setName("relativeSusceptibilityIPV");
		fi.setDefaultValue("0.95");
		fi.setDisplayName("Relative Susceptibility - IPV Only (fi)");
		addZeroOneConstraint(fi);
		
		model.getParameters().add(fi);		
		
		ModelParam sigmaV = factory.createModelParam();
		sigmaV.setDataType(EcorePackage.Literals.EDOUBLE);
		sigmaV.setName("incubationRateVaccine");
		sigmaV.setDefaultValue("0.1");
		sigmaV.setDisplayName("Incubation Rate - Vaccine (σv)");
		sigmaV.setHelpMessage("Incubation rate of vaccine-derived poliovirus");
		addZeroOneConstraint(sigmaV);
		
		model.getParameters().add(sigmaV);
		
		ModelParam sigmaW = factory.createModelParam();
		sigmaW.setDataType(EcorePackage.Literals.EDOUBLE);
		sigmaW.setName("incubationRateWild");
		sigmaW.setDefaultValue("0.5");
		sigmaW.setDisplayName("Incubation Rate - Wild (σw)");
		sigmaW.setHelpMessage("Incubation rate of wild poliovirus");
		addZeroOneConstraint(sigmaW);
		
		model.getParameters().add(sigmaW);
		
		ModelParam gammaV = factory.createModelParam();
		gammaV.setDataType(EcorePackage.Literals.EDOUBLE);
		gammaV.setName("recoveryRateVaccine");
		gammaV.setDefaultValue("0.143");
		gammaV.setDisplayName("Recovery Rate - Vaccine (γv)");
		gammaV.setHelpMessage("Recovery Rate of vaccine-derived poliovirus");
		addZeroOneConstraint(gammaV);
		model.getParameters().add(gammaV);
		
		ModelParam gammaW = factory.createModelParam();
		gammaW.setDataType(EcorePackage.Literals.EDOUBLE);
		gammaW.setName("recoveryRateWild");
		gammaW.setDefaultValue("0.625");
		gammaW.setDisplayName("Recovery Rate - Wild (γw)");
		gammaW.setHelpMessage("Recovery Rate of wild poliovirus");
		addZeroOneConstraint(gammaW);
		
		model.getParameters().add(gammaW);
		
		ModelParam epsilon = factory.createModelParam();
		epsilon.setDataType(EcorePackage.Literals.EDOUBLE);
		epsilon.setName("paralyticIncidenceFromVaccine");
		epsilon.setDefaultValue("7.14e-7");
		epsilon.setDisplayName("Paralytic Incidences in Newly Vaccinated (ε)");
		addZeroOneConstraint(epsilon);
		
		model.getParameters().add(epsilon);
		
		ModelParam pipara = factory.createModelParam();
		pipara.setDataType(EcorePackage.Literals.EDOUBLE);
		pipara.setName("paralyticCaseProportion");
		pipara.setDefaultValue("0.005");
		pipara.setDisplayName("Proportion of Paralytic Polio cases (πpara)");
		addZeroOneConstraint(pipara);
		
		model.getParameters().add(pipara);
		
//		ModelParam dp = factory.createModelParam();
//		dp.setDataType(EcorePackage.Literals.EDOUBLE);
//		dp.setName("deathRateParalytic");
//		dp.setDefaultValue("0.05");
//		dp.setDisplayName("Death rate - Paralytic Cases (dp)");
//		
//		model.getParameters().add(dp);
		
	}

	private void addMinMaxValueConstraint(ModelParam param, double minValue, double maxValue)
	{
		ModelParamConstraint min = factory.createModelParamConstraint();
		min.setConstraint(String.valueOf(minValue));
		min.setName("minValue");
		
		ModelParamConstraint max = factory.createModelParamConstraint();
		max.setConstraint(String.valueOf(maxValue));
		max.setName("maxValue");
		
		param.getConstraints().add(min);
		param.getConstraints().add(max);
	}
	
	private void addZeroOneConstraint(ModelParam param)
	{
		addMinMaxValueConstraint(param, 0.0, 1.0);
	}
	
	private void setupOPVLabel(Model model) {
		// Setup compartment group / label
		CompartmentGroup polioOPVLabel = factory.createCompartmentGroup();

		polioOPVLabel.setParentGroup(model.getParentModel().getCompartments());
		polioOPVLabel.setName("PolioOpvIpv");

		Compartment Sopv = factory.createCompartment();
		Sopv.setDataType(EcorePackage.Literals.EDOUBLE);
		Sopv.setName("Sopv");

		Compartment Eopv = factory.createCompartment();
		Eopv.setDataType(EcorePackage.Literals.EDOUBLE);
		Eopv.setName("Eopv");

		Compartment Vopv = factory.createCompartment();
		Vopv.setDataType(EcorePackage.Literals.EDOUBLE);
		Vopv.setName("Vopv");

		Compartment Popv = factory.createCompartment();
		Popv.setDataType(EcorePackage.Literals.EDOUBLE);
		Popv.setName("Popv");

		Compartment Pw = factory.createCompartment();
		Pw.setDataType(EcorePackage.Literals.EDOUBLE);
		Pw.setName("Pw");

		
		Compartment Sipv = factory.createCompartment();
		Sipv.setDataType(EcorePackage.Literals.EDOUBLE);
		Sipv.setName("Sipv");

		// IPV-W
		Compartment Eipv_w = factory.createCompartment();
		Eipv_w.setDataType(EcorePackage.Literals.EDOUBLE);
		Eipv_w.setName("Eipv_w");

		Compartment Cipv_w = factory.createCompartment();
		Cipv_w.setDataType(EcorePackage.Literals.EDOUBLE);
		Cipv_w.setName("Cipv_w");

		// IPV-OPV
		Compartment Eipv_opv = factory.createCompartment();
		Eipv_opv.setDataType(EcorePackage.Literals.EDOUBLE);
		Eipv_opv.setName("Eipv_opv");

		Compartment Cipv_opv = factory.createCompartment();
		Cipv_opv.setDataType(EcorePackage.Literals.EDOUBLE);
		Cipv_opv.setName("Cipv_opv");
		
		// In parent model:  S, E(w), I(w), R
		
		polioOPVLabel.getCompartments().add(Sopv);
		polioOPVLabel.getCompartments().add(Eopv);
		polioOPVLabel.getCompartments().add(Vopv);
		polioOPVLabel.getCompartments().add(Popv);
		polioOPVLabel.getCompartments().add(Pw);
		
		polioOPVLabel.getCompartments().add(Sipv);
		polioOPVLabel.getCompartments().add(Eipv_w);
		polioOPVLabel.getCompartments().add(Cipv_w);
		polioOPVLabel.getCompartments().add(Eipv_opv);
		polioOPVLabel.getCompartments().add(Cipv_opv);

		
		// Incidence Compartments
		Compartment Incidence_opv = factory.createCompartment();
		Incidence_opv.setDataType(EcorePackage.Literals.EDOUBLE);
		Incidence_opv.setType(CompartmentType.INCIDENCE);
		Incidence_opv.setName("Incidence_opv");
		
		Compartment Incidence_ipvw = factory.createCompartment();
		Incidence_ipvw.setDataType(EcorePackage.Literals.EDOUBLE);
		Incidence_ipvw.setType(CompartmentType.INCIDENCE);
		Incidence_ipvw.setName("Incidence_ipv_w");
		
		Compartment Incidence_ipv_opv = factory.createCompartment();
		Incidence_ipv_opv.setDataType(EcorePackage.Literals.EDOUBLE);
		Incidence_ipv_opv.setType(CompartmentType.INCIDENCE);
		Incidence_ipv_opv.setName("Incidence_ipv_opv");
		
		polioOPVLabel.getCompartments().add(Incidence_opv);
		polioOPVLabel.getCompartments().add(Incidence_ipvw);
		polioOPVLabel.getCompartments().add(Incidence_ipv_opv);
		
		model.setCompartments(polioOPVLabel);
	}

	// private void transform(EPackage ePkg) throws Exception {
	//
	// // URI fileURI = ;
	// //
	// //).createFileURI("/Users/mattadav/projects/STEM/workspaces/main/org.eclipse.stem.model.transform/data/test1.ecore");
	// System.out.println(ecoreUri);
	//
	// IFile ecoreFile = ResourcesPlugin.getWorkspace().getRoot()
	// .getFile(new Path(ecoreUri.toPlatformString(true)));
	// IPath genmodelProject = ResourcesPlugin.getWorkspace().getRoot()
	// .getProject("testproject").getFullPath();
	//
	// System.out.println(ecoreFile);
	//
	// EcoreImporter importer = new EcoreImporter();
	// // importer.setModelFile(ecoreFile);
	// // importer.setModelProjectName("testproject");
	//
	// IPath containerPath = importer
	// .computeGenModelContainerPath(genmodelProject);
	//
	// importer.setGenModelContainerPath(containerPath);
	// importer.setModelProjectName(containerPath.segment(0));
	//
	// importer.addToResource(ePkg, resourceSet);
	// importer.getEPackages().add(ePkg);
	//
	// importer.setGenModelFileName("test1.genmodel");
	// importer.setGenModelProjectLocation(genmodelProject);
	//
	// importer.getEPackageImportInfo(ePkg).setConvert(true);
	// importer.getEPackageImportInfo(ePkg).setConvertData("test1.ecore");
	// importer.addGenModelToResource(true);
	// // importer.
	//
	// importer.setUsePlatformURI(true);
	//
	// for (Entry<String, Object> asdf : EPackage.Registry.INSTANCE.entrySet())
	// {
	// if (asdf.getValue() instanceof EPackage) {
	//
	// EPackage ipkg = ((EPackage) asdf.getValue());
	// URI u2 = EcorePlugin.getEPackageNsURIToGenModelLocationMap()
	// .get(asdf.getKey());
	// if (u2 == null) {
	// continue;
	// }
	//
	// GenModel gm = loadGenModel(u2);
	//
	// importer.addToResource(ipkg, resourceSet);
	// importer.getReferencedGenPackages().addAll(gm.getGenPackages());
	// importer.getExternalGenModels().add(gm);
	//
	// // ipkg.
	// // System.out.println(asdf.getValue());
	// }
	// }
	//
	// // /importer.getReferencedGenPackages();
	//
	// // importer
	//
	// IProgressMonitor progressMonitor = new NullProgressMonitor();
	// Monitor monitor = BasicMonitor.toMonitor(new NullProgressMonitor());
	// importer.adjustEPackages(monitor);
	// monitor = BasicMonitor.toMonitor(new NullProgressMonitor());
	// importer.prepareGenModelAndEPackages(monitor);
	//
	// GenModel gm = importer.getGenModel();
	//
	// for (Entry<String, Object> asdf : EPackage.Registry.INSTANCE.entrySet())
	// {
	// if (asdf.getValue() instanceof EPackage) {
	//
	// EPackage ipkg = ((EPackage) asdf.getValue());
	// URI u2 = EcorePlugin.getEPackageNsURIToGenModelLocationMap()
	// .get(asdf.getKey());
	// if (u2 == null) {
	//
	// System.err.println("no genmodel for " + asdf.getKey());
	//
	// continue;
	// }
	//
	// GenModel gm2 = loadGenModel(u2);
	// // System.out.println(u2);
	// gm.getUsedGenPackages().addAll(gm2.getGenPackages());
	//
	// // ipkg.
	// // System.out.println(asdf.getValue());
	// } else {
	// System.err.println("no epackage for " + asdf.getKey());
	// }
	//
	// }
	//
	// // gm.reconcile();
	// // write(gm);
	//
	// IProgressMonitor progressMonitor2 = new NullProgressMonitor();
	// Monitor monitor2 = BasicMonitor.toMonitor(progressMonitor2);
	//
	// Generator g = GenModelUtil.createGenerator(importer.getGenModel());
	//
	// // gm.reconcile();
	// gm.setCanGenerate(true);
	// g.setInput(gm);
	// g.generate(
	// gm,
	// "org.eclipse.emf.codegen.ecore.genmodel.generator.ModelProject",
	// "model project", monitor2);
	//
	// // object GenModelImpl (id=9596)
	// // projectType
	// // "org.eclipse.emf.codegen.ecore.genmodel.generator.ModelProject"
	// // (id=9550)
	// // projectTypeName "model project" (id=9551)
	// // monitor BasicMonitor$EclipseDelegating (id=9730)
	//
	// // System.out.println(importer.getGenModel());
	//
	// }

	// GenModel gm = createGenmodel();

	// for (Entry<String, Object> asdf : EPackage.Registry.INSTANCE
	// .entrySet()) {
	// if (asdf.getValue() instanceof EPackage) {
	//
	// EPackage ipkg = ((EPackage) asdf.getValue());
	// if (ipkg.eResource() != null && gm.eResource() != null) {
	// URI ePackageURI = ipkg.eResource().getURI();
	// URI genModelURI = gm.eResource().getURI();
	//
	// if (!ePackageURI.trimSegments(1).equals(
	// genModelURI.trimSegments(1))) {
	// ipkg.eResource().getContents().add(ipkg);
	// }
	// }
	//
	// }
	// }
	//
	// resourceSet = new ResourceSetImpl();
	// resourceSet
	// .getResourceFactoryRegistry()
	// .getExtensionToFactoryMap()
	// .put(Resource.Factory.Registry.DEFAULT_EXTENSION,
	// new XMIResourceFactoryImpl());

	// transform(ePkg);
	// transform2();

	// String[] args = new String[] {
	// "/Users/mattadav/projects/STEM/modeltmp/model/test1.ecore",
	// "/Users/mattadav/projects/STEM/modeltmp/model/test1.genmodel",
	// "-refGenModel",
	// "/Users/mattadav/projects/STEM/workspaces/main/org.eclipse.stem.core/model/core.genmodel",
	// "http:///org/eclipse/stem/core/common.ecore",
	// "http:///org/eclipse/stem/core/experiment.ecore",
	// "http:///org/eclipse/stem/core/graph.ecore",
	// "http:///org/eclipse/stem/core/logger.ecore",
	// "http:///org/eclipse/stem/core/model.ecore",
	// "http:///org/eclipse/stem/core/modifier.ecore",
	// "http:///org/eclipse/stem/core/predicate.ecore",
	// "http:///org/eclipse/stem/core/scenario.ecore",
	// "http:///org/eclipse/stem/core/sequencer.ecore",
	// "http:///org/eclipse/stem/core/solver.ecore",
	// "http:///org/eclipse/stem/core/trigger.ecore",
	// "-refGenModel",
	// "/Users/mattadav/projects/STEM/workspaces/main/org.eclipse.stem.diseasemodels/model/diseasemodels.genmodel",
	// "http:///org/eclipse/stem/diseasemodels/standard.ecore",
	//
	//
	// };
	//
	//
	//
	// EcoreImporterApplication app = new EcoreImporterApplication();
	// app.run(new NullProgressMonitor(), args);
	// private GenModel createGenmodel() throws Exception {
	// IFile ecoreFile = ResourcesPlugin.getWorkspace().getRoot()
	// .getFile(new Path(ecoreUri.toPlatformString(true)));
	// IPath genmodelProject = ResourcesPlugin.getWorkspace().getRoot()
	// .getProject("testproject").getFullPath();
	//
	//
	// EPackage ePkg = loadEcore(ecoreUri,resourceSet);
	//
	// EcoreImporter importer = new EcoreImporter();
	// // importer.setModelFile(ecoreFile);
	// // importer.setModelProjectName("testproject");
	// importer.setUsePlatformURI(true);
	// //
	//
	// IPath containerPath = importer
	// .computeGenModelContainerPath(genmodelProject);
	//
	// importer.setGenModelContainerPath(containerPath);
	// importer.setModelProjectName(containerPath.segment(0));
	//
	// importer.addToResource(ePkg, importer.getGenModelResourceSet());
	// importer.getEPackages().add(ePkg);
	//
	// importer.setGenModelFileName("test1.genmodel");
	// importer.setGenModelProjectLocation(genmodelProject);
	//
	// importer.getEPackageImportInfo(ePkg).setConvert(true);
	// importer.getEPackageImportInfo(ePkg).setConvertData("test1.ecore");
	//
	// importer.addGenModelToResource(true);
	//
	// for (Entry<String, Object> asdf : EPackage.Registry.INSTANCE.entrySet())
	// {
	// if (asdf.getValue() instanceof EPackage) {
	//
	// EPackage ipkg = ((EPackage) asdf.getValue());
	// URI u2 = EcorePlugin.getEPackageNsURIToGenModelLocationMap()
	// .get(asdf.getKey());
	// if (u2 == null) {
	// continue;
	// }
	//
	// GenModel gm = loadGenModel(u2, importer.getGenModelResourceSet());
	//
	// // importer.
	// if (ipkg.eResource() == null) {
	// importer.addToResource(ipkg, importer.getGenModelResourceSet());
	// }
	//
	//
	// // if (EcorePackage.eNS_URI.equals(ipkg.getNsURI()))
	// // {
	// // if (gm.getGenPackages().size() == 1)
	// // {
	// // gm.setModelName("ecore");
	// // gm.setBooleanFlagsField("eFlags");
	// // gm.setBooleanFlagsReservedBits(8);
	// // }
	// // else
	// // {
	// // i.remove();
	// //
	// ImporterUtil.addUniqueGenPackages(referencedGenModel.getUsedGenPackages(),
	// Collections.singletonList(genPackage));
	// // GenModel ecoreGenModel =
	// (GenModel)EcoreUtil.create(genModel.eClass());
	// // genModel.eResource().getContents().add(ecoreGenModel);
	// // ecoreGenModel.getGenPackages().add(genPackage);
	// // ecoreGenModel.setBooleanFlagsField("eFlags");
	// // ecoreGenModel.setBooleanFlagsReservedBits(8);
	// // ecoreGenModel.getForeignModel().addAll(genModel.getForeignModel());
	// // ecoreGenModel.setModelName("ecore");
	// // }
	// // }
	// // else if (referencedGenModel.getModelName() == null)
	// // {
	// // referencedGenModel.setModelName(genPackage.getPackageName());
	// // }
	// //
	//
	//
	// importer.getReferencedGenPackages().addAll(gm.getGenPackages());
	// importer.getExternalGenModels().add(gm);
	// }
	// }
	//
	// IProgressMonitor progressMonitor = new NullProgressMonitor();
	// Monitor monitor = BasicMonitor.toMonitor(new NullProgressMonitor());
	// importer.adjustEPackages(monitor);
	//
	// monitor = BasicMonitor.toMonitor(new NullProgressMonitor());
	// importer.prepareGenModelAndEPackages(monitor);
	//
	// GenModel gm = importer.getGenModel();
	// for (Entry<String, Object> asdf : EPackage.Registry.INSTANCE.entrySet())
	// {
	// if (asdf.getValue() instanceof EPackage) {
	//
	// EPackage ipkg = ((EPackage) asdf.getValue());
	// URI u2 = EcorePlugin.getEPackageNsURIToGenModelLocationMap()
	// .get(asdf.getKey());
	// if (u2 == null) {
	//
	// System.err.println("no genmodel for " + asdf.getKey());
	//
	// continue;
	// }
	//
	// GenModel gm2 = loadGenModel(u2, importer.getGenModelResourceSet());
	// // System.out.println(u2);
	// gm.getUsedGenPackages().addAll(gm2.getGenPackages());
	//
	// // ipkg.
	// // System.out.println(asdf.getValue());
	// } else {
	// System.err.println("no epackage for " + asdf.getKey());
	// }
	//
	// }
	//
	// write(gm);
	// // save(gm);
	// return gm;
	//
	// }

	// private void addRegisteredModelsToGenModel(GenModel gm)
	// {
	// for (Entry<String, Object> packages :
	// EPackage.Registry.INSTANCE.entrySet()) {
	// System.out.println(packages.getKey());
	//
	// if (packages.getValue() instanceof EPackage) {
	// URI packageGenmodelUri =
	// EcorePlugin.getEPackageNsURIToGenModelLocationMap()
	// .get(packages.getKey());
	// if (packageGenmodelUri != null) {
	// try {
	// GenModel gmToInclude = loadGenModel(packageGenmodelUri, resourceSet);
	// if (shouldIncludeGenModel(gmToInclude)) {
	// ImporterUtil.addUniqueGenPackages(gm.getUsedGenPackages(),
	// gmToInclude.getGenPackages());
	// //gm.getUsedGenPackages().addAll(gmToInclude.getGenPackages());
	// }
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
	// }
	// }
	// }

	// private void getParentEPackagesFromEPackage(EPackage pkg, Set<EPackage>
	// pkgs)
	// {
	// TreeIterator<Object> ti = EcoreUtil.getAllContents(pkg, true);
	//
	//
	// while (ti.hasNext()) {
	// Object next = ti.next();
	// if (next instanceof E)
	//
	//
	// System.out.println(next);
	//
	// }
	//
	// }

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}
