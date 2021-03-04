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
package org.eclipse.stem.model.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;

public class ModelProjectUtils 
{
	private ModelProjectUtils() {}
	
	public static boolean isValidProject(final IProject project)
	{
		try {
			return project.exists() && project.isOpen()
				&& project.hasNature("org.eclipse.pde.PluginNature")
				&& project.hasNature(ModelProjectNature.ID);
		} catch (CoreException ce) {
			// Ignore exception, does not matter for this context
		}
		return false;
	}
	
	
	public static void removeProjectNature(final IProject project, final String natureId) throws CoreException
	{
		if (project.exists() && project.hasNature(natureId)) {
			IProjectDescription description = project.getDescription();
			
			List<String> natures = new ArrayList<String>();
			natures.addAll(Arrays.asList(description.getNatureIds()));
			natures.remove(natureId);
			description.setNatureIds(natures.toArray(new String[natures.size()]));
			project.setDescription(description, new NullProgressMonitor());
		}
	}
	
	public static void addProjectNature(final IProject project, final String natureId) throws CoreException
	{
		if (project.exists() && !project.hasNature(natureId)) {
			IProjectDescription description = project.getDescription();
			
			List<String> natures = new ArrayList<String>();
			natures.addAll(Arrays.asList(description.getNatureIds()));
			natures.add(natureId);
			description.setNatureIds(natures.toArray(new String[natures.size()]));
			project.setDescription(description, new NullProgressMonitor());
		}
	}
}
