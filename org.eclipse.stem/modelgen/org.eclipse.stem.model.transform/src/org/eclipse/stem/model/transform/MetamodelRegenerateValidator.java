package org.eclipse.stem.model.transform;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.stem.model.metamodel.Package;

public class MetamodelRegenerateValidator 
{
	private Package metamodel;
	private IFile metamodelFile;
	
	public MetamodelRegenerateValidator(Package metamodel, IFile metamodelFile) {
		this.metamodel = metamodel;
		this.metamodelFile = metamodelFile;
	}
	
	private static URI getUriForPath(IPath path) {
		return URI.createPlatformResourceURI(path.toString(), true);
	}
	
	private static void safeClose(Reader r) {
		if (r == null) return;
		try {
			r.close();
		} catch (Throwable t) { }
	}
	
	private String getGenModelFileAsString(IProgressMonitor monitor) throws CoreException, IOException 
	{
		monitor.beginTask("Reading models", 1);
		BufferedReader reader = null;
		try {
			
			IFile genModelFile = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(
					metamodelFile.getLocation().removeFileExtension().addFileExtension("genmodel"));
			if (genModelFile == null) {
				return "";
			}
			
			reader = new BufferedReader(new InputStreamReader(genModelFile.getContents()));
			
			StringBuilder builder = new StringBuilder();
			String line = null;
			while ((line = reader.readLine()) != null) {
				builder.append(line);
			}
			monitor.worked(1);
			return builder.toString();
		} finally {
			safeClose(reader);
			monitor.done();
		}
	}
	
	
	private String getGenModelAsString(IProgressMonitor monitor) throws CoreException, IOException {
		
		SubMonitor subMonitor = SubMonitor.convert(monitor,"Serializing models", 100);
		try {
			URI genModelUri = getUriForPath(getGenModelPath());
			URI ecoreUri = getUriForPath(getEcorePath());
	
			ModelGenerator generator = new ModelGenerator(metamodel);
			generator.generateEcoreAndGenmodel(subMonitor.split(70));
			
			GenModel genModel = generator.getGenModel();
			EPackage ecore = generator.getEcore();
			
			subMonitor.subTask("Creating Ecore Resource");
			ResourceSet rs = generator.getResourceSet();
			Resource ecoreResource = rs.createResource(ecoreUri);
			ecoreResource.getContents().add(ecore);
			subMonitor.worked(10);
			
			subMonitor.subTask("Creating GenModel Resource");
			Resource genModelResource = rs.createResource(genModelUri);
			genModelResource.getContents().add(genModel);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			genModelResource.save(baos, null);
			subMonitor.worked(20);
			
			genModelResource.unload();
			ecoreResource.unload();
			return baos.toString();
		} finally {
			//monitor.done();
		}
	}
	
	private IPath getMetamodelPath() {
		return metamodelFile.getFullPath();
	}
	
	private IPath getGenModelPath() {
		return getMetamodelPath().removeFileExtension().addFileExtension("genmodel");
	}
	
	private IPath getEcorePath() {
		return getMetamodelPath().removeFileExtension().addFileExtension("ecore");
	}
	
	
	public boolean checkNeedRegeneration( IProgressMonitor monitor) throws IOException, CoreException
	{
		SubMonitor subMonitor = SubMonitor.convert(monitor, "Comparing Model Generator output", 50);
		try {
			String currentGenModel = getGenModelFileAsString(subMonitor.split(10));
			String newGenModel = getGenModelAsString(subMonitor.split(40));
			
			currentGenModel = currentGenModel.replaceAll("\\s","");
			newGenModel = newGenModel.replaceAll("\\s","");

			return (currentGenModel.compareTo(newGenModel) != 0);
		} finally {
			//monitor.done();
		}

	}

}
