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
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class EPackageManager {

	private static EPackageManager INSTANCE;
	private final Map<String, EPackage> loadedPackages = new HashMap<String, EPackage>();
	private final Map<String, GenModel> loadedGenModels = new HashMap<String, GenModel>();
	private ResourceSet resourceSet;
	private Map<IProject, List<IFile>> workspaceEcores;
	
	private EPackageManager() {
		resourceSet = new ResourceSetImpl();
		resourceSet.getURIConverter().getURIMap()
				.putAll(EcorePlugin.computePlatformURIMap(true));
	}

	public static synchronized EPackageManager getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new EPackageManager();
		}

		return INSTANCE;
	}
	
	public ResourceSet getResourceSet() {
		return resourceSet;
	}
	
	public void loadGenModelsForResource(Resource resource,
			IProgressMonitor monitor) {
		if (resource.getURI() != null) {
			if (resource.getURI().lastSegment().endsWith(".ecore")) {
				URI uri = resource.getResourceSet().getURIConverter()
						.normalize(resource.getURI());
				String scheme = uri.scheme();
				if ("platform".equals(scheme) && uri.segmentCount() > 1
						&& "resource".equals(uri.segment(0))) {
					StringBuffer platformResourcePath = new StringBuffer();
					for (int j = 1, size = uri.segmentCount(); j < size; ++j) {
						platformResourcePath.append('/');
						platformResourcePath.append(uri.segment(j));
					}
					IFile resourceFile = ResourcesPlugin.getWorkspace()
							.getRoot()
							.getFile(new Path(platformResourcePath.toString()));
					if (resourceFile != null && resourceFile.exists()) {
						loadContainerGenModels(resourceFile.getProject(),
								monitor);
					}
				}
			}
		}
	}

	public Map<String, EPackage> getLoadedPackages() {
		return loadedPackages;
	}

	public GenModel findGenModelForPackage(EPackage pkg) {
		for (GenModel gm : loadedGenModels.values()) {
			GenPackage gp = gm.findGenPackage(pkg);
			if (gp != null) {
				return gp.getGenModel();
			}
		}

		return null;
	}

	private void load(GenModel gm) {
		loadedGenModels.put(gm.toString(), gm);
	}

	private void load(EPackage pkg) {
		GenModel gm = findGenModelForPackage(pkg);
		if (gm == null) {
			System.err.println("Warning, GM is null for " + pkg.getNsURI());
			return;
		}

		loadedPackages.put(pkg.getNsURI(), pkg);
		for (EPackage subPkg : pkg.getESubpackages()) {
			load(subPkg);
		}
	}

	public EObject load(URI uri) throws IOException {
		Resource resource = resourceSet.createResource(uri);
		resource.load(null);
		if (resource.getContents().size() > 0) {
			EObject obj = resource.getContents().get(0);
			EcoreUtil.resolveAll(obj);

			if (obj instanceof EPackage) {
				load((EPackage) obj);
			}

			if (obj instanceof GenModel) {
				load((GenModel) obj);
			}

			return obj;
		}

		return null;
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

	public void loadECoresFromProjects(List<IProject> projects,
			IProgressMonitor monitor) {
		if (workspaceEcores == null) {
			workspaceEcores = findECoresInWorkspace(monitor);
		}

		for (Entry<IProject, List<IFile>> projectEntry : workspaceEcores
				.entrySet()) {
			loadContainerGenModels(projectEntry.getKey(), monitor);
			for (IFile ecore : projectEntry.getValue()) {
				if (projects.contains(ecore.getProject())) {
					try {
						URI ecoreURI = URI.createPlatformResourceURI(ecore
								.getFullPath().toString(), true);
						EObject obj = load(ecoreURI);
						if (obj != null) {

						}
					} catch (IOException ioe) {

					}
				}
			}
		}
	}

	private void loadContainerGenModels(final IResource container,
			final IProgressMonitor monitor) {
		for (IFile genModel : findGenModelsInContainer(container, monitor)) {
			try {
				load(URI.createPlatformResourceURI(genModel.getFullPath()
						.toString(), true));
			} catch (IOException e) {
			}
		}
	}

	public Map<IProject, List<IFile>> findECoresInWorkspace(
			final IProgressMonitor monitor) {
		return groupFilesByProject(findECoresInContainer(ResourcesPlugin
				.getWorkspace().getRoot(), monitor));
	}

	private List<IFile> findECoresInContainer(final IResource container,
			final IProgressMonitor monitor) {
		return findFilesInContainer(".ecore", container, monitor);
	}

	private List<IFile> findGenModelsInContainer(final IResource container,
			final IProgressMonitor monitor) {
		return findFilesInContainer(".genmodel", container, monitor);
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