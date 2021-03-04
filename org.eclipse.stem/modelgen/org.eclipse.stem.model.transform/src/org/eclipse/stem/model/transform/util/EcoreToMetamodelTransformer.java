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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.stem.model.codegen.CodeGenConstants;
import org.eclipse.stem.model.codegen.ModelGeneratorDescriptors;
import org.eclipse.stem.model.codegen.descriptor.ModelGeneratorDescriptor;
import org.eclipse.stem.model.metamodel.Compartment;
import org.eclipse.stem.model.metamodel.CompartmentGroup;
import org.eclipse.stem.model.metamodel.CompartmentType;
import org.eclipse.stem.model.metamodel.MetamodelFactory;
import org.eclipse.stem.model.metamodel.Model;
import org.eclipse.stem.model.metamodel.ModelParam;
import org.eclipse.stem.model.metamodel.ModelType;
import org.eclipse.stem.model.metamodel.Package;
import org.eclipse.stem.model.transform.EPackageManager;

/**
 * Utility to transform EMF Ecore to STEM metamodel definitions.  
 * Scans all projects in the workspace (or from a given list) and
 * performs the transformation.
 *
 */
public class EcoreToMetamodelTransformer implements IApplication
{
	
	private Map<EClass,Model> modelMap = new HashMap<EClass,Model>();
	private Map<EClass,CompartmentGroup> labelMap = new HashMap<EClass,CompartmentGroup>();
//	private Map<EClass,CompartmentGroup> labelValueMap = new HashMap<EClass,CompartmentGroup>();

	@Override
	public Object start(IApplicationContext context) throws Exception 
	{
//		EPackageManager mgr = EPackageManager.getInstance();
		IWorkspaceRoot wsr = ResourcesPlugin.getWorkspace().getRoot();
		
		
		List<IProject> projects = new ArrayList<IProject>();
		projects.add(wsr.getProject("org.eclipse.stem.diseasemodels"));
		projects.add(wsr.getProject("org.eclipse.stem.populationmodels"));
		projects.add(wsr.getProject("org.eclipse.stem.diseasemodels.vector"));
		projects.add(wsr.getProject("org.eclipse.stem.diseasemodels.multipopulation"));
		projects.add(wsr.getProject("org.eclipse.stem.diseasemodels.globalinfluenzamodel"));
		projects.add(wsr.getProject("org.eclipse.stem.diseasemodels.forcing"));
		
		
//		mgr.loadECoresFromProjects(projects, new NullProgressMonitor());
		//mgr.loadECoresFromProjects(Arrays.asList(wsr.getProjects()), new NullProgressMonitor());

		
		List<EPackage> pkgs = loadProjectsInOrder(projects);
		
		System.out.println(pkgs);
		
		preProcess(pkgs);
		process(pkgs);
//		for (Entry<String,EPackage> entry : mgr.getLoadedPackages().entrySet()) {
//			System.out.println(entry.getKey());
//		}
//		
		Thread.sleep(1000);
		
		return Status.OK_STATUS;
		
	}
	
	private List<EPackage> loadProjectsInOrder(List<IProject> projects)
	{
		List<EPackage> pkgs = new ArrayList<EPackage>();
		Map<IProject, List<IFile>> files = EPackageManager.getInstance().findECoresInWorkspace(new NullProgressMonitor());
		for (IProject project : projects) {
			List<IFile> ecores = files.get(project);
			if (ecores != null) {
				for (IFile ecore : ecores) {
					URI ecoreURI = URI.createPlatformResourceURI(ecore.getFullPath().toString(), true);
					try {
						EObject obj = EPackageManager.getInstance().load(ecoreURI);
						if (obj instanceof EPackage) {
							pkgs.add((EPackage)obj);
						}
					} catch (Exception e) {
						
					}
				}
			}
		}
		return pkgs;
	}

	private void process(Collection<EPackage> pkgs)
	{
		for (EPackage pkg : pkgs) {
			process(pkg);
		}
	}

	private void serialize(Package pkg, EPackage ePkg)
	{
		URI eCoreURI = ePkg.eResource().getURI();
		
		URI metamodelURI = URI.createPlatformResourceURI(eCoreURI.toPlatformString(true).replace(".ecore", ".metamodel"), true);
		
//		System.out.println(eCoreURI +"/"+ metamodelURI);
		
		ResourceSet rs = EPackageManager.getInstance().getResourceSet();
		
		try {
			Resource r = rs.createResource(metamodelURI);
			r.getContents().add(pkg);
			r.save(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private void process(EPackage ePkg)
	{
		//System.out.println(ePkg.eResource().getURI());
		
		
		Package pkg = MetamodelFactory.eINSTANCE.createPackage();
		
		pkg.setName(ePkg.getName());
		pkg.setPackagePrefix(ePkg.getNsPrefix());
		
		for (EClassifier classifier : ePkg.getEClassifiers()) {
			if (classifier instanceof EClass) {
				process(pkg, (EClass)classifier);
			}
		}
		
		assignGroupsToModels(pkg);
		
		if (pkg.getModels().size() > 0) {
			serialize(pkg,ePkg);
		}
	}
	
	private void process(Package pkg, EClass eClass)
	{
		Model m = modelMap.get(eClass);
		if (m != null) {
			m = processModel(m);
			if (m != null) {
				pkg.getModels().add(m);
			}
			//return m;
		}
		CompartmentGroup cg = labelMap.get(eClass);
		if (cg != null) {
			cg = processCompartmentGroup(cg);
			if (cg != null) {
				pkg.getCompartmentGroups().add(cg);
			}
		}
		
		
	}
	
	private void assignGroupsToModels(Package pkg)
	{
		for (Model m : pkg.getModels()) {
			for (CompartmentGroup cg : pkg.getCompartmentGroups()) {
				if (cg.getName().equals(m.getName())) {
					m.setCompartments(cg);
					break;
				}
			}

		}
	}
	
	private CompartmentGroup processCompartmentGroup(CompartmentGroup cg)
	{
		EClass labelValueClass = cg.getValueClass();
		EClass labelClass = (EClass)labelValueClass.getEPackage().getEClassifier(labelValueClass.getName().replace("Value", ""));
		cg.setName(labelClass.getName().replace("Label", ""));
		cg.setClass(labelClass);
		//cg.setValueClass(labelValueClass);
		CompartmentGroup parentCG = getParentCGFromMap(cg);
		
		if (parentCG == null && !("PopulationModel".equals(cg.getName()) || "DiseaseModel".equals(cg.getName()))) {
			EClass parentClass = labelClass.getESuperTypes().get(0);
			System.err.println("Null CG parent: "+ cg +" <= "+ parentClass.getName() +" ("+ parentClass.eResource() +")");
			return null;
		}
		cg.setParentGroup(parentCG);
		
		collectCompartments(cg);
		
		return cg;
	}
	
	private CompartmentType getTypeForAttribute(EAttribute attr)
	{
		if (attr.getName().toLowerCase().contains("incidence")) {
			return CompartmentType.INCIDENCE;
		} else if (attr.getName().toLowerCase().contains("deaths")) {
			return CompartmentType.DEATHS;
		}
		return CompartmentType.STANDARD;
	}
	
	private void collectCompartments(CompartmentGroup cg) 
	{
		for (EAttribute attr : cg.getValueClass().getEAttributes()) {
			Compartment compartment = MetamodelFactory.eINSTANCE.createCompartment();
			compartment.setDataType(EcorePackage.Literals.EDOUBLE);
			compartment.setName(attr.getName());
			compartment.setType(getTypeForAttribute(attr));
			cg.getCompartments().add(compartment);
		}
	}
	
	private Model processModel(Model m)
	{
		EClass eClass = m.getClass_();
		m.setName(eClass.getName());
		Model parentModel = getParentModelFromMap(m);//modelMap.get(parentClass);
		
		if (m.getName().contains("Deterministic") || m.getName().contains("Stochastic")) { 
			System.out.println("Excluding "+ m.getName());
			return null;
		}
		
		if (parentModel == null && !("PopulationModel".equals(m.getName()) || "DiseaseModel".equals(m.getName()))) {
			EClass parentClass = eClass.getESuperTypes().get(0);
			System.err.println("Null Model Parent: "+ m +" <= "+ parentClass.getName() +" ("+ parentClass.eResource() +")");
			return null;
		}
		
		m.setParentModel(parentModel);
		
		ModelGeneratorDescriptor descriptor = ModelGeneratorDescriptors.getInstance().getDescriptorForEClass(eClass);
		if (descriptor != null) {
			ModelType type = ModelType.get(descriptor.getModelType());
			m.setModelType(type);
		}
		
		
		collectModelParams(m);
		
		return m;
		
		//System.out.println("Processing "+ m);
	}
	
	private void collectModelParams(Model model)
	{
		EClass eClass = model.getClass_();
		
		for (EAttribute attr : eClass.getEAttributes()) {
			ModelParam param = MetamodelFactory.eINSTANCE.createModelParam();
			if (attr.getEType() instanceof EDataType) {
				param.setDataType((EDataType)attr.getEType());
			} else {
				System.err.println("Unsupported data type for "+attr.getName() + ": "+ attr.getEType());
				param.setDataType(EcorePackage.Literals.EDOUBLE);
			}
			
			param.setName(attr.getName());
			param.setDefaultValue(attr.getDefaultValueLiteral());
			param.setDisplayName(formatString(attr.getName()));
			
			model.getParameters().add(param);
		}
		
		for (EReference ref : eClass.getEReferences()) {
			ModelParam param = MetamodelFactory.eINSTANCE.createModelParam();
			param.setName(ref.getName());
			param.setDataType(ref.getEType());
			param.setDefaultValue(ref.getDefaultValueLiteral());
			param.setDisplayName(formatString(ref.getName()));
			model.getParameters().add(param);
		}
		//System.out.println(model.getName() + " / "+ eClass.getEAttributes());
	}
	
	private String formatString(String data)
	{
		StringBuilder sb = new StringBuilder();
		
		char[] chars = data.toCharArray();
		
		sb.append(Character.toUpperCase(chars[0]));
		for (int idx=1; idx<chars.length; idx++) {
			if (Character.isUpperCase(chars[idx])) {
				if (Character.isLowerCase(chars[idx-1]) 
						|| (chars.length > idx+1 && Character.isLowerCase(chars[idx+1]))) {
					sb.append(" ");
				}
			}
			
			sb.append(chars[idx]);			
		}
		
		return sb.toString();
	}
	
	private Model getParentModelFromMap(Model m)
	{
		EClass parentClass = m.getClass_().getESuperTypes().get(0);
		Model parentModel = modelMap.get(parentClass);
		if (parentModel == null) {
			for (Entry<EClass,Model> entry : modelMap.entrySet()) {
				EClass eClass = entry.getKey();
				if (eClass.getEPackage().getNsURI().equals(parentClass.getEPackage().getNsURI()) &&
						eClass.getName().equals(parentClass.getName())) {
					parentModel = entry.getValue();
				}
			}
		}
		return parentModel;
	}
	
	private CompartmentGroup getParentCGFromMap(CompartmentGroup cg)
	{
		EClass parentClass = cg.getValueClass().getESuperTypes().get(0);
		CompartmentGroup parentGroup = labelMap.get(parentClass);
		if (parentGroup == null) {
			for (Entry<EClass,CompartmentGroup> entry : labelMap.entrySet()) {
				EClass eClass = entry.getKey();
				if (eClass.getEPackage().getNsURI().equals(parentClass.getEPackage().getNsURI()) &&
						eClass.getName().equals(parentClass.getName())) {
					parentGroup = entry.getValue();
				}
			}
		}
		return parentGroup;
	}
	
	@SuppressWarnings("unused")
	private String classToString(Object object)
	{
		return object.getClass().getName() + "@" + Integer.toHexString(object.hashCode());
	}
	
	private void preProcess(Collection<EPackage> pkgs)
	{
		for (EPackage pkg : pkgs) {
			for (EClassifier classifier : pkg.getEClassifiers()) {
				if (classifier instanceof EClass) {
					preProcessEClass((EClass)classifier);
				}
			}
		}
	}
	
	private void preProcessEClass(EClass eClass)
	{
		if (CodeGenConstants.INTEGRATION_DECORATOR_DESCRIPTOR.isSuperTypeOf(eClass)) {
			Model m = MetamodelFactory.eINSTANCE.createModel();
			m.setClass(eClass);
			
			modelMap.put(eClass, m);
		}
		
//		if (CodeGenConstants.INTEGRATION_LABEL_DESCRIPTOR.isSuperTypeOf(eClass)) {
//			CompartmentGroup cg = MetamodelFactory.eINSTANCE.createCompartmentGroup();
//			cg.setClass(eClass);
//			
//			labelMap.put(eClass, cg);
//		}
		
		if (CodeGenConstants.INTEGRATION_LABEL_VALUE_DESCRIPTOR.isSuperTypeOf(eClass)) {
			CompartmentGroup cg = MetamodelFactory.eINSTANCE.createCompartmentGroup();
			cg.setValueClass(eClass);
			
			labelMap.put(eClass, cg);
		}
	}

	@Override
	public void stop() 
	{

	}

}
