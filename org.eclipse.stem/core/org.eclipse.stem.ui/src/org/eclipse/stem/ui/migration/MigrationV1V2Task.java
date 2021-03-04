package org.eclipse.stem.ui.migration;


import java.text.MessageFormat;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.stem.core.CorePlugin;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.Utility;
import org.eclipse.stem.core.scenario.Scenario;
import org.eclipse.stem.core.scenario.ScenarioPackage;
import org.eclipse.stem.core.solver.Solver;
import org.eclipse.stem.ui.Activator;
import org.eclipse.stem.ui.versioning.VersioningUtil;
import org.eclipse.stem.ui.wizards.Messages;
import org.eclipse.stem.ui.wizards.NewSTEMProjectWizard;
import org.osgi.framework.Version;

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


public class MigrationV1V2Task implements MigrationTask {

	public static MigrationV1V2Task INSTANCE = new MigrationV1V2Task();
	
	private MigrationV1V2Task() {
	}
	
	public void executeTask(IProject project) {
	
		// Between version 1.x and 2.x we need to remove solvers from the scenarios and put them in the new solver folder,
		// then update the scenario to point to the new solver file
				
		// Find all scenarios in scenarios folder
		
		try {
			IFolder scenariosFolder = project.getFolder(NewSTEMProjectWizard.SCEANARIOS_FOLDER_NAME);
		
			IResource [] scenarios = scenariosFolder.members();
			
			for(IResource resource:scenarios) {
				try {
					Scenario scenario = (Scenario)Utility.getIdentifiable(URI.createURI(resource.getLocationURI().toString()));
					scenario.eClass().getEStructuralFeature(ScenarioPackage.eINSTANCE.getScenario_Solver().getName());
					
					
					Solver s = scenario.getSolver();
					
					Solver movedSolver = EcoreUtil.copy(s);
					// Serialize the solver into new location
					
					IFolder solverFolder = project.getFolder(NewSTEMProjectWizard.SOLVERS_FOLDER_NAME);
					if(!solverFolder.exists())
						solverFolder.create(true, true, null);
					
					String shortSolverName = movedSolver.getClass().getSimpleName();
					boolean unique = false;
					int n=1;
					IFile solverFile=null;
					do {
						String solverName = shortSolverName + n+"."+s.eClass().getEPackage().getName();
						solverFile = solverFolder.getFile(solverName);
						if(solverFile.exists())
							unique = false;
						else unique = true;
						++n;
					} while(!unique);
					
					URI newURI = STEMURI.normalize(URI.createURI(solverFile.getLocationURI().toString()));
					movedSolver.setURI(newURI);
					
					Utility.serializeIdentifiable(movedSolver, newURI);
					scenario.setSolver(null);
					scenario.setSolver(movedSolver);
					Utility.serializeIdentifiable(scenario, scenario.getURI());
					
				} catch(Exception e) {
					// Skip
					continue;
				}
			}
			String versionString = VersioningUtil.getSTEMVersion().toString();
			VersioningUtil.setSTEMProjectVersion(project, versionString); 
			String logInfo = MessageFormat.format(Messages.getString("project.migrated"), project.getName(), versionString);
			Utility.unloadResourcesInProject(project);
			Activator.logInformation(logInfo);
		} catch(CoreException ce) {
			CorePlugin.logError(ce.getMessage(), ce);
		}
		
	}

	@Override
	public Version getFromVersion() {
		return new Version(1, VERSION_IRRELEVANT, VERSION_IRRELEVANT);
	}

	@Override
	public Version getToVersion() {
		return new Version(2, VERSION_IRRELEVANT, VERSION_IRRELEVANT);
	}

}
