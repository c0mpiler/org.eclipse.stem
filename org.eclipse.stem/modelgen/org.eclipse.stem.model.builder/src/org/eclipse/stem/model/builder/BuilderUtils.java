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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceProxy;
import org.eclipse.core.resources.IResourceProxyVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.stem.model.codegen.GeneratorUtils;
import org.eclipse.stem.model.ctdl.ContextSensitiveResourceWrapper;
import org.eclipse.stem.model.metamodel.Compartment;
import org.eclipse.stem.model.metamodel.Transition;
import org.eclipse.xtext.resource.XtextResource;

public final class BuilderUtils 
{
	private BuilderUtils() {}
	
	private static final String METAMODEL_FILE_EXTENSION = ".metamodel";
	
	public static boolean isNullOrEmpty(String s) {
		return s == null || s.length() == 0;
	}
	
	public static void safeUnload(EObject obj) {
		if (obj == null) return;
		safeUnload(obj.eResource());
	}
	
	public static void safeUnload(Resource resource) {
		if (resource == null) return;
		resource.unload();
	}
	
	private static String getTransitionName(Transition transition) {
		if (transition == null) {
			return "";
		}
		
		String sourceName = "?", targetName = "?";
		Compartment source = transition.getSource();
		if (source != null && !isNullOrEmpty(source.getName())) {
			sourceName = source.getName();
		}
		Compartment target = transition.getTarget();
		if (target != null && !isNullOrEmpty(target.getName())) {
			targetName = target.getName();
		}
		return sourceName +" -> "+ targetName;
	}
	
	public static void createGenericResourceMarker(IResource workspaceResource, String message, int severity)  throws CoreException {
		IMarker marker = workspaceResource.createMarker(IMarker.PROBLEM);
		if (marker.exists()) {
			marker.setAttribute(IMarker.SEVERITY, severity);
			marker.setAttribute(IMarker.MESSAGE, message);
		}
	}
	
	public static void createNeedsRegenerationMarker(IResource workspaceResource, String message, int severity)  throws CoreException {
		IMarker marker = workspaceResource.createMarker(ModelNeedsRegenerationErrorMarker.ID);
		if (marker.exists()) {
			marker.setAttribute(IMarker.SEVERITY, severity);
			marker.setAttribute(IMarker.MESSAGE, message);
		}
	}
	
	public static void createEmfResourceMarker(IResource workspaceResource, Resource emfResource, Resource.Diagnostic diagnostic, int severity) throws CoreException
	{
		createGenericResourceMarker(workspaceResource, diagnostic.getMessage(), severity);
	}
	
	public static void createXtextResourceMarker(IResource workspaceResource, XtextResource xtextResource, Resource.Diagnostic diagnostic, int severity) throws CoreException
	{
		String type = ExpressionCompileErrorMarker.ID;
		String message = diagnostic.getMessage();
		String location = diagnostic.getLocation();

		IMarker marker = workspaceResource.createMarker(type);
		if (marker.exists()) {
			marker.setAttribute(IMarker.SEVERITY, severity);
			marker.setAttribute(IMarker.MESSAGE, message);
			marker.setAttribute(IMarker.LOCATION, location);
			
			if (xtextResource instanceof ContextSensitiveResourceWrapper) {
				Transition transition = ((ContextSensitiveResourceWrapper) xtextResource).getTransition();
				String transitionName = getTransitionName(transition);
				String modelName = transition.getContainerModel().getName();
				location = modelName +" / "+ transitionName;
				
				marker.setAttribute(IMarker.LOCATION, location);
				marker.setAttribute(ExpressionCompileErrorMarker.MODEL_ATTRIBUTE, modelName);
				marker.setAttribute(ExpressionCompileErrorMarker.SOURCE_COMPARTMENT_ATTRIBUTE, transition.getSource().getName());
				marker.setAttribute(ExpressionCompileErrorMarker.TARGET_COMPARTMENT_ATTRIBUTE, transition.getTarget().getName());
			}	
		}
	}
	
	
	public static List<IFile> findMetamodelsInProject(IProject project, IProgressMonitor monitor) {		
		return findMetamodelsInContainer(project, monitor);
	}
	
	private static URI getUriForPath(IPath path) {
		return URI.createPlatformResourceURI(path.toString(), true);
	}
	
	public static org.eclipse.stem.model.metamodel.Package loadMetamodel(IFile file) throws IOException
	{
		return GeneratorUtils.loadMetamodel(getUriForPath(file.getFullPath()));
	}
	
	public static GenModel loadGenmodelForMetamodel(IFile metamodelFile) throws IOException
	{
		return GeneratorUtils.loadGenModel(getUriForPath(getGenModelFileForMetamodel(metamodelFile)));
	}
	
	private static IPath getGenModelFileForMetamodel(IFile metamodelFile)
	{
		IPath ext = metamodelFile.getFullPath().removeFileExtension().addFileExtension("genmodel");
		return ext;
	}
	
	
	private static List<IFile> findMetamodelsInContainer(final IResource container,
			final IProgressMonitor monitor) {
		return findFilesInContainer(METAMODEL_FILE_EXTENSION, container, monitor);
	}

	private static List<IFile> findFilesInContainer(final String extension,
			final IResource container, final IProgressMonitor monitor) {
		final List<IFile> files = new ArrayList<IFile>();

		try {
			container.accept(new IResourceProxyVisitor() {

				@Override
				public boolean visit(IResourceProxy proxy) throws CoreException {
					if (monitor.isCanceled() || proxy.getName().startsWith(".")) {
						return false;
					}
					if (proxy.getName().endsWith(extension)) {
						IResource file = proxy.requestResource();
						if (file instanceof IFile) {
							files.add((IFile) file);
						}
					}
					return true;
				}

			}, IResource.NONE);
		} catch (CoreException e) {

		}

		return files;
	}
	

}
