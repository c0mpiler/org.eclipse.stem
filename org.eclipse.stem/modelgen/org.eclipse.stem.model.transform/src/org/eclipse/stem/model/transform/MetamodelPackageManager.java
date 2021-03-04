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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceProxy;
import org.eclipse.core.resources.IResourceProxyVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.InvalidRegistryObjectException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.stem.model.codegen.CodeGenConstants;
import org.eclipse.stem.model.metamodel.Package;

/**
 * Resource manager for finding, loading, and caching STEM Metamodel package
 * definitions. Handles loading Metamodel files via Extension Point definition
 * (for binary plugins) and by searching the local workspace for .metamodel
 * files.
 * 
 * This singleton class is not intended to be instantiated or subclassed. Use 
 * {@link #getInstance()}.
 */
public class MetamodelPackageManager {

	private static MetamodelPackageManager INSTANCE;
	private final Map<URI, Package> loadedPackages = new HashMap<URI, Package>();
	private Map<IProject, List<IFile>> workspaceMetamodels;
	private boolean isInitialized = false;
	
	private ResourceSet resourceSet;

	private MetamodelPackageManager() {
		resourceSet = new ResourceSetImpl();
		resourceSet.getURIConverter().getURIMap()
				.putAll(EcorePlugin.computePlatformURIMap(true));
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("metamodel", new MetamodelResourceFactory());

		//loadAll(new NullProgressMonitor());
	}

	public static synchronized MetamodelPackageManager getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new MetamodelPackageManager();
		}

		return INSTANCE;
	}
	
	public boolean isInitialized()
	{
		return isInitialized;
	}

	public ResourceSet getResourceSet() {
		return resourceSet;
	}

	private URI getPluginResourceURI(String container, String path) {
		StringBuilder sb = new StringBuilder();

		sb.append("/");
		sb.append(container);
		sb.append("/");
		sb.append(path);

		return URI.createPlatformPluginURI(sb.toString(), true);
	}

	public void loadAll(IProgressMonitor monitor) {
		
		SubMonitor subMonitor = SubMonitor.convert(monitor,"Loading Metamodels", 2);
		loadWorkspaceMetamodels(subMonitor.split(1));
		loadExtensionPointMetamodels(subMonitor.split(1));
		isInitialized = true;
	}

	public void loadExtensionPointMetamodels(IProgressMonitor monitor) 
	{
		IConfigurationElement[] elements = Platform.getExtensionRegistry().getConfigurationElementsFor(CodeGenConstants.METAMODEL_EXTENSION_POINT);
		
		monitor.beginTask("Loading Metamodels from Extensions", elements.length);
				
		for (IConfigurationElement element : elements) {

			String resourcePath = element.getAttribute("path");
			if (resourcePath != null) {
				try {
					URI uri = getPluginResourceURI(element.getContributor()
							.getName(), resourcePath);
					load(uri);
				} catch (InvalidRegistryObjectException e) {

				} catch (IOException e) {

				} finally {
					monitor.worked(1);
				}
			}

		}
		
		monitor.done();

	}

	public Map<URI, Package> getLoadedPackages() 
	{
		return loadedPackages;
	}

	private void load(URI uri, Package pkg) {
		loadedPackages.put(uri, pkg);
	}

	private Package load(URI uri) throws IOException {
		Resource resource = resourceSet.createResource(uri);
		resource.load(null);
		if (resource.getContents().size() > 0) {
			EObject obj = resource.getContents().get(0);
			EcoreUtil.resolveAll(obj);

			if (obj instanceof Package) {
				load(uri, (Package) obj);
				return (Package) obj;
			}
		}

		return null;
	}
	
	/**
	 * Loads an metamodel instance from the given IFIle
	 * and return the instance.
	 * @param file
	 * @return
	 * @throws IOException
	 */
	public Package load(IFile file) throws IOException
	{
		URI ecoreURI = URI.createPlatformResourceURI(file
				.getFullPath().toString(), true);
		return load(ecoreURI);
	}

	private Map<IProject, List<IFile>> groupFilesByProject(List<IFile> files) {
		Map<IProject, List<IFile>> projectsMap = new HashMap<IProject, List<IFile>>();
		if (files != null && files.size() > 0) {
			for (IFile file : files) {
				IProject project = file.getProject();
				List<IFile> projectFiles = projectsMap.get(project);
				if (projectFiles == null) {
					projectFiles = new ArrayList<IFile>();
					projectsMap.put(project, projectFiles);
				}
				projectFiles.add(file);
			}
		}
		return projectsMap;
	}

	public void loadWorkspaceMetamodels(IProgressMonitor monitor) {
		loadWorkspaceMetamodels(
				Arrays.asList(ResourcesPlugin.getWorkspace().getRoot()
						.getProjects()), monitor);
	}

	public void loadWorkspaceMetamodels(List<IProject> projects,
			IProgressMonitor monitor) {
		if (workspaceMetamodels == null) {
			workspaceMetamodels = findMetamodelsInWorkspace(monitor);
		}
		
		monitor.beginTask("Loading Workspacing Metamodels", workspaceMetamodels.size());
		
		for (Entry<IProject, List<IFile>> projectEntry : workspaceMetamodels
				.entrySet()) {
			// loadContainerGenModels(projectEntry.getKey(), monitor);
			for (IFile metamodel : projectEntry.getValue()) {
				if (projects.contains(metamodel.getProject())) {
					try {
						URI ecoreURI = URI.createPlatformResourceURI(metamodel
								.getFullPath().toString(), true);
						EObject obj = load(ecoreURI);
						if (obj != null) {

						}
					} catch (IOException ioe) {
						ioe.printStackTrace();
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						monitor.worked(1);
					}
				}
			}
		}
		monitor.done();
	}

	public void loadContainerMetamodels(final IResource container,
			final IProgressMonitor monitor) {
		for (IFile metamodelFile : findMetamodelsInContainer(container, monitor)) {
			try {
				load(URI.createPlatformResourceURI(metamodelFile.getFullPath()
						.toString(), true));
			} catch (IOException e) {

			}
		}
	}

	public Map<IProject, List<IFile>> findMetamodelsInWorkspace(
			final IProgressMonitor monitor) {
		return groupFilesByProject(findMetamodelsInContainer(ResourcesPlugin
				.getWorkspace().getRoot(), monitor));
	}

	private List<IFile> findMetamodelsInContainer(final IResource container,
			final IProgressMonitor monitor) {
		return findFilesInContainer(".metamodel", container, monitor);
	}

	private List<IFile> findFilesInContainer(final String extension,
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