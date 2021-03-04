/*******************************************************************************
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation and new features
 *     Bundesinstitut für Risikobewertung - Pajek Graph interface, new Veterinary Models
 *******************************************************************************/
package org.eclipse.stem.model.builder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.stem.model.codegen.GeneratorUtils;
import org.eclipse.stem.model.codegen.STEMGenClass;
import org.eclipse.stem.model.metamodel.Model;
import org.eclipse.stem.model.metamodel.Package;
import org.eclipse.stem.model.transform.MetamodelRegenerateValidator;
import org.eclipse.stem.model.xtext.XtextUtils;
import org.eclipse.xtext.resource.XtextResource;

public class MetamodelBuilder extends IncrementalProjectBuilder
{
	
	protected void runGenerator(List<XtextResource> resources, Model model, GenModel genModel) {
		GenClass genClass = GeneratorUtils.getGenClassForMetamodelModel(model, genModel);
		if (genClass != null) {
			STEMGenClass modelWrapper = STEMGenClass.get(genClass);
			GenClass labelGenClass = modelWrapper.getDefaultLabelGenClass();
			GenClass labelValueGenClass = modelWrapper.getDefaultLabelValueGenClass();
			ExpressionMethodGenerator generator = new ExpressionMethodGenerator(getProject(), genClass, labelGenClass, labelValueGenClass);
			generator.generate(resources);
		}
	}
	
	protected boolean hasErrors(IResource resource) {
		int severity = -1;
		try {
			severity = resource.findMaxProblemSeverity(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE);
		} catch (CoreException ce) {
			
		}
		return severity == IMarker.SEVERITY_ERROR;
	}
	
	protected void compileAndValidate(Package metamodel, IResource workspaceResource, GenModel genModel) throws CoreException {
		if (hasErrors(workspaceResource)) {
			return;
		}
		for (Model model : metamodel.getModels()) {
			List<XtextResource> resources = XtextUtils.getXtextResourcesForModel(model);
			for (XtextResource expressionResource : resources) {
				checkXtextResourceForErrorsAndWarnings(workspaceResource, expressionResource);
			}
			
			
			if (!hasErrors(workspaceResource)) { 
				runGenerator(resources, model, genModel);
			}
			
			for (XtextResource expressionResource : resources) {
				BuilderUtils.safeUnload(expressionResource);
			}
		}		
	}
		
	
	protected void clearAllProblemMarkers(IResource workspaceResource) {
		
		try {
			workspaceResource.getProject().deleteMarkers(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE);
		} catch (CoreException ce) {
			ce.printStackTrace();
		}
	}
	
	protected void checkEmfResourceForErrorsAndWarnings(IResource workspaceResource, Resource emfResource) throws CoreException
	{
		for (Diagnostic error : emfResource.getErrors()) {
			BuilderUtils.createEmfResourceMarker(workspaceResource, emfResource, error, IMarker.SEVERITY_ERROR);
		}
		
		for (Diagnostic error : emfResource.getWarnings()) {
			BuilderUtils.createEmfResourceMarker(workspaceResource, emfResource, error, IMarker.SEVERITY_WARNING);
		}
	}
	
	protected void checkXtextResourceForErrorsAndWarnings(IResource workspaceResource, XtextResource xtextResource) throws CoreException
	{
		for (Diagnostic error : xtextResource.getErrors()) {
			BuilderUtils.createXtextResourceMarker(workspaceResource, xtextResource, error, IMarker.SEVERITY_ERROR);
		}
		
		for (Diagnostic error : xtextResource.getWarnings()) {
			BuilderUtils.createXtextResourceMarker(workspaceResource, xtextResource, error, IMarker.SEVERITY_WARNING);
		}
	}
	
	protected void checkMetamodelNeedsRegeneration(Package metamodel, IFile metamodelFile, final IProgressMonitor monitor) throws CoreException, IOException
	{
		SubMonitor subMonitor = SubMonitor.convert(monitor, "Checking if model needs regeneration", 100);
		
		MetamodelRegenerateValidator regenValidator = new MetamodelRegenerateValidator(metamodel, metamodelFile);
		if (regenValidator.checkNeedRegeneration(subMonitor.split(1))) {
			BuilderUtils.createNeedsRegenerationMarker(metamodelFile, "Model project requires regeneration", IMarker.SEVERITY_ERROR);
		}
	}
	
	protected void loadAndBuildMetamodel(IFile metamodelFile, final IProgressMonitor monitor)
	{
		SubMonitor subMonitor = SubMonitor.convert(monitor , "Building Metamodel "+ metamodelFile.getFullPath(), 6);
		GenModel genModel = null;
		Package metamodel = null;
		try {
			// Load the metamodel from file
			metamodel = BuilderUtils.loadMetamodel(metamodelFile);
			subMonitor.worked(1);
			// Check if metamodel needs to be regenerated before building
			checkMetamodelNeedsRegeneration(metamodel, metamodelFile, subMonitor.split(1));
			
			// Check for EMF errors / warnings in the metamodel resource
			checkEmfResourceForErrorsAndWarnings(metamodelFile, metamodel.eResource());
			subMonitor.worked(1);
			
			// Load the GenModel for this metamodel
			genModel = BuilderUtils.loadGenmodelForMetamodel(metamodelFile);
			subMonitor.worked(1);

			// Run Xtext compiler and code generafor the metamodel's transitions
			compileAndValidate(metamodel, metamodelFile, genModel);
			subMonitor.worked(1);

		} catch (CoreException ce) {
			handleError(ce);
		} catch (IOException ioe) {
			handleError(ioe);
		} finally {
			// Unload resources
			BuilderUtils.safeUnload(metamodel);
			BuilderUtils.safeUnload(genModel);
			subMonitor.worked(1);
		}

	}
	
	private void handleError(final Throwable t) {
		final IStatus status = new Status(Status.ERROR,
				Activator.PLUGIN_ID,
				t.getMessage(), t);
		
		Activator.log(status);
		
//		Display.getDefault().asyncExec(new Runnable() {
//			
//			@Override
//			public void run() {
//				MessageDialog.openError(Display.getDefault().getActiveShell(), "Error", status.getMessage());
//			}
//		});
	}
	
	private List<IFile> getMetamodelsDelta() throws CoreException {
		IResourceDelta delta = getDelta(getProject());
		final List<IFile> metamodelsInDelta = new ArrayList<IFile>();
		delta.accept(new IResourceDeltaVisitor() {
			
			@Override
			public boolean visit(IResourceDelta delta) throws CoreException {
				if (delta.getResource() instanceof IFile) {
					IFile file = (IFile)delta.getResource();
					if (delta.getResource().getFileExtension().equals("metamodel")) {
						metamodelsInDelta.add(file);
					}
				}
				return true;
			}
		});
		
		return metamodelsInDelta;
	}
	
	@Override
	protected IProject[] build(int kind, Map<String, String> args, final IProgressMonitor monitor) throws CoreException 
	{
        SubMonitor subMonitor = SubMonitor.convert(monitor,"Building Metamodels for "+ getProject().getName(), 105);

		IResourceDelta delta = getDelta(getProject());
		List<IFile> metamodels = null;
		if (delta != null) {
			metamodels = getMetamodelsDelta();			
		} else if (kind == FULL_BUILD) {
			metamodels = BuilderUtils.findMetamodelsInProject(getProject(), subMonitor.split(5));			
		}
		
		try {
			if (!monitor.isCanceled() && metamodels.size() > 0) {
				int perTick = (int)(100.0 / metamodels.size());
				for (IFile metamodel : metamodels) {
					if (monitor.isCanceled()) {
						break;
					}
					clearAllProblemMarkers(metamodel);
					loadAndBuildMetamodel(metamodel, subMonitor.split( perTick/2));
				}
			}
		} catch (Throwable t) {
			handleError(t);
		} finally {
			//monitor.done();
		}

		return null;
	}
}
