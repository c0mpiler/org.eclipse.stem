package org.eclipse.stem.model.ctdl.generator;

import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.util.ImportManager;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.resource.XtextResource;

public abstract class ModelExpressionGenerator implements IGenerator
{
	protected ImportManager importManager;
	
	public ModelExpressionGenerator() {
		
	}
	
	public abstract void doGenerate(List<XtextResource> resources, IFileSystemAccess fsa);

	public void setImportManager(ImportManager manager) {
		this.importManager = manager;
	}
	
	public String importGenClassInterface(GenClass gc)
	{
		String interfacePackage = gc.getGenPackage().getInterfacePackageName();
		String interfaceName = gc.getName();
		
		return getImportedName(interfacePackage +"."+ interfaceName);
	}
	
	public String getImportedName(String qualifiedName)
	{
		return importManager.getImportedName(qualifiedName, true);
	}
	
	public String getSortedImports()
	{
		return importManager.computeSortedImports();
	}
}
