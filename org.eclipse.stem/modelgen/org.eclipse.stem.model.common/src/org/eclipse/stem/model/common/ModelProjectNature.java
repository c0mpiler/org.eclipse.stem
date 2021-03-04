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
import java.util.Iterator;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

public class ModelProjectNature implements IProjectNature {
	public static final String ID = "org.eclipse.stem.model.common.ModelProjectNature";

	public static final String BUILDER_ID = "org.eclipse.stem.model.builder.MetamodelBuilder";

	public static final String OLD_BUILDER_ID = "org.eclipse.stem.model.codegen.MetamodelBuilder";

	
	private IProject project;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IProjectNature#configure()
	 */
	public void configure() throws CoreException {
		// Shamelessly copied from Xtext (@see
		// org.eclipse.xtext.builder.nature.XtextNature#configure)
		updateBuilders(getProject());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IProjectNature#deconfigure()
	 */
	public void deconfigure() throws CoreException {
		// Shamelessly copied from Xtext (@see
		// org.eclipse.xtext.builder.nature.XtextNature#deconfigure)
		IProjectDescription description = getProject().getDescription();
		ICommand[] commands = description.getBuildSpec();
		for (int i = 0; i < commands.length; ++i) {
			if (commands[i].getBuilderName().equals(BUILDER_ID)) {
				ICommand[] newCommands = new ICommand[commands.length - 1];
				System.arraycopy(commands, 0, newCommands, 0, i);
				System.arraycopy(commands, i + 1, newCommands, i,
						commands.length - i - 1);
				description.setBuildSpec(newCommands);
				project.setDescription(description, null);
				project.deleteMarkers(IMarker.PROBLEM, true,
						IResource.DEPTH_INFINITE);
				return;
			}
		}
	}

	@Override
	public IProject getProject() {
		return project;
	}

	@Override
	public void setProject(IProject project) {
		this.project = project;
	}
	
	public static void updateBuilders(final IProject project) throws CoreException {
		IProjectDescription desc = project.getDescription();
		ICommand[] commands = desc.getBuildSpec();

		ArrayList<ICommand> builders = new ArrayList<ICommand>(commands.length);
		builders.addAll(Arrays.asList(commands));
		
		boolean hasCurrentBuilder = false;
		Iterator<ICommand> iterator = builders.listIterator();
		while (iterator.hasNext()) {
			ICommand builder = iterator.next();
			if (builder.getBuilderName().equals(BUILDER_ID)) {
				hasCurrentBuilder = true;
			}
			if (builder.getBuilderName().equals(OLD_BUILDER_ID)) {
				iterator.remove();
			}
		}
		
		if (!hasCurrentBuilder) {
			ICommand command = desc.newCommand();
			command.setBuilderName(BUILDER_ID);
			builders.add(0, command);
		}
		desc.setBuildSpec(builders.toArray(new ICommand[builders.size()]));
		project.setDescription(desc, null);
	}

	public static void addNature(final IProject project) throws CoreException {
		ModelProjectUtils.addProjectNature(project, ID);
	}

	public static void removeNature(final IProject project)
			throws CoreException {
		ModelProjectUtils.removeProjectNature(project, ID);
	}

	public static boolean hasNature(final IProject project)
			throws CoreException {
		return project.hasNature(ID);
	}

}
