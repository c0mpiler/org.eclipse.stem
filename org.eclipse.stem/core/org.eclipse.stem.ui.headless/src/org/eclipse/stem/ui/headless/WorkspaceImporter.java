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
package org.eclipse.stem.ui.headless;

import java.io.File;
import java.io.FileFilter;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Semaphore;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;

/**
 * Simple project importer that scans the root workspace
 * folder, determines which child folders are well-formed
 * projects that have not been imported, and imports the project
 * and folder to the workspace.
 *
 */
public class WorkspaceImporter 
{
	public static void importProjects()
	{
		refreshWorkspace();
		
		File[] projectFolders = getUnimportedProjectFoldersFromRoot();
		for (File projectFolder : projectFolders) {			
			importProjectForFolder(projectFolder);
		}
	}
	
	public static Set<File> getExistingProjectFolders()
	{
		Set<File> files = new HashSet<File>();
		IProject[] projects = getWorkspaceRoot().getProjects();
		for (IProject project : projects) {
			files.add(project.getLocation().toFile());
		}
		
		return files;
	}
	
	public static IWorkspaceRoot getWorkspaceRoot()
	{
		return ResourcesPlugin.getWorkspace().getRoot();
	}
	
	public static File[] getUnimportedProjectFoldersFromRoot()
	{
		File[] files = null;
		final File dir = getWorkspaceRoot().getLocation().toFile();
		final Set<File> projectDirs = getExistingProjectFolders();
		if (dir != null && dir.isDirectory()) {
			files = dir.listFiles(new FileFilter() {
				public boolean accept(File f) {
					if (!f.isDirectory() 
							|| f.getName().equals(".metadata") 
							|| projectDirs.contains(f)
							|| !getMetadataFileForProject(f).isFile()) {
						return false;
					}
					return true;
				}});

		}
		return files;
	}
	
	public static File getMetadataFileForProject(File dir)
	{
		return new File(dir, ".project");
	}

	public static IProject importProjectForFolder(File folder)
	{
		try {
			File projectFile = getMetadataFileForProject(folder);
			
	        IProjectDescription description = ResourcesPlugin.getWorkspace().loadProjectDescription(new Path(projectFile.getAbsolutePath()));
	        IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(description.getName());
	        project.create(description, null);
	        project.open(null);
	        
	        System.out.println("Imported project "+ project.getName());
	        
	        return project;
		} catch (CoreException ce) {
			//ce.printStackTrace(System.err);
		}
        return null;
	}
	
	public static void refreshWorkspace()
	{
		 
		final Semaphore s = new Semaphore(1);
		
		try { s.acquire(); } 
		catch (InterruptedException e1) { }
		
		
		IProgressMonitor pm = new NullProgressMonitor() {
			public void done() {
				s.release();
			}
		};
		
		try {
			ResourcesPlugin.getWorkspace().getRoot()
				.refreshLocal(IResource.DEPTH_INFINITE, pm);
		} catch (CoreException ce) {
			ce.printStackTrace();
		}
		
		/**
		 * SED 03/26/2020 commented out since it hangs headless runs 
		try { s.acquire(); } 
		catch (InterruptedException e) { }
		*/
		
	}
	
}
