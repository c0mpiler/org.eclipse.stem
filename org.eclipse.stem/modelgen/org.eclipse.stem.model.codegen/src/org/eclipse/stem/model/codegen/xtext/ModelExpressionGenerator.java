package org.eclipse.stem.model.codegen.xtext;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.util.ImportManager;
import org.eclipse.stem.model.codegen.GeneratorUtils;
import org.eclipse.stem.model.codegen.STEMGenClass;
import org.eclipse.stem.model.codegen.STEMGenFeature;
import org.eclipse.stem.model.ctdl.ContextSensitiveResourceWrapper;
import org.eclipse.stem.model.metamodel.Compartment;
import org.eclipse.stem.model.metamodel.Transition;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.resource.XtextResource;

public abstract class ModelExpressionGenerator implements IGenerator
{
	protected ImportManager importManager;
	
	protected GenClass modelGenClass;

	protected GenClass labelGenClass;
	
	protected GenClass labelValueGenClass;
	
	

	public ModelExpressionGenerator() {
		
	}
	
	public abstract void doGenerate(List<XtextResource> resources, IFileSystemAccess fsa);

	public GenClass getModelGenClass() {
		return modelGenClass;
	}

	public void setModelGenClass(GenClass modelGenClass) {
		this.modelGenClass = modelGenClass;
	}

	public GenClass getLabelGenClass() {
		return labelGenClass;
	}

	public void setLabelGenClass(GenClass labelGenClass) {
		this.labelGenClass = labelGenClass;
	}

	public GenClass getLabelValueGenClass() {
		return labelValueGenClass;
	}

	public void setLabelValueGenClass(GenClass labelValueGenClass) {
		this.labelValueGenClass = labelValueGenClass;
	}
	
	public void setImportManager(ImportManager manager) {
		this.importManager = manager;
	}
	
	public String importGenClassInterface(GenClass gc)
	{
		String interfacePackage = gc.getGenPackage().getInterfacePackageName();
		String interfaceName = gc.getName();
		
		return getImportedName(interfacePackage +"."+ interfaceName);
	}
	
	public String getFormattedName(Transition transition) {
		return transition.getSource().getName() + " -> " + transition.getTarget().getName();
	}
	
	public String getMethodName(Transition transition) {
		return transition.getSource().getName() + "_" + transition.getTarget().getName();
	}
	
	public GenFeature getGenFeature(Compartment compartment) {
		STEMGenClass gc = STEMGenClass.get(labelValueGenClass);
		for (STEMGenFeature stemGF : gc.getAllCompartmentFeatures()) {
			GenFeature genFeature = stemGF.getGenFeature();
			if (genFeature.getName().equals(compartment.getName())) {
				return genFeature;
			}
		}
		return null;
	}
	
	public String getPackageAccessorName(GenFeature feature) {
		//<%=sourceGenFeaturePackageImport%>.eINSTANCE.get<%=sourceGenFeature.getFeatureAccessorName()%>());
		if (feature != null) {
			GenPackage featureGenPackage = feature.getGenPackage();
			String packageImportedName = getImportedName(featureGenPackage.getReflectionPackageName() +"."+ featureGenPackage.getPackageInterfaceName());
			String accessor = packageImportedName +".eINSTANCE.get"+ feature.getFeatureAccessorName() +"()";
			return accessor;
		}
		return "null";
	}
	
	public String getImportedName(String qualifiedName)
	{
		return importManager.getImportedName(qualifiedName, true);
	}
	
	public String getSortedImports()
	{
		return importManager.computeSortedImports();
	}
	
	protected String getAccessorName(Compartment compartment) {
		return GeneratorUtils.formatToUpperCaseWordsNoSpaces(compartment.getName());
	}
	
	protected Set<Compartment> getAffectedCompartments(List<XtextResource> resources)
	{
		Set<Compartment> compartments = new HashSet<Compartment>();		
		for (XtextResource resource : resources) {	
			if (!(resource instanceof ContextSensitiveResourceWrapper)) {
				continue;
			}
			Transition transition = ((ContextSensitiveResourceWrapper)resource).getTransition();
			compartments.add(transition.getSource());
			compartments.add(transition.getTarget());
//			compartments.add(GeneratorUtils.formatToUpperCaseWordsNoSpaces(
//					transition.getSource().getName()));
//			compartments.add(GeneratorUtils.formatToUpperCaseWordsNoSpaces(
//					transition.getTarget().getName()));
			for (Compartment incidence : transition.getForIncidence()) {
				compartments.add(incidence);
				
//				compartments.add(GeneratorUtils.formatToUpperCaseWordsNoSpaces(incidence.getName()));
			}
		}
		return compartments;
	}
}
