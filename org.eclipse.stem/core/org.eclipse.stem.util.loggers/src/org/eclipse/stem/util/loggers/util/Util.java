package org.eclipse.stem.util.loggers.util;

import java.io.File;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;

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

public class Util {
	
	// Get the path from the workspace location
	private static final IPath PATH = ResourcesPlugin.getWorkspace().getRoot().getLocation();
	private static final String sep = File.separator;
	private static final String scenariosURLPrefix = "platform:/resource/";
	private static final String builtInScenarioProjectFolder = "BuiltInScenarios";
	private static final String recordedSimulationsFolderName = "Recorded Simulations";
	
	/**
	 * Given a scenario, return the folder where recorded simulations are stored.
	 * 
	 * @param scenarioURL
	 * @return String Folder to store recorded simulations
	 */
	public static String getLoggingFolder(String scenarioURL) {
		
		boolean builtInScenario = scenarioURL.startsWith(scenariosURLPrefix);
		IPath path1;
		if(builtInScenario) {
			String scenarioRelativePath = scenarioURL.substring(scenariosURLPrefix.length());
			String project = scenarioRelativePath.substring(0 ,scenarioRelativePath.indexOf("/"));
			IProject proj = ResourcesPlugin.getWorkspace().getRoot().getProject(project);
			IPath rawLocation = proj.getRawLocation();
			if(rawLocation == null)
				rawLocation = proj.getLocation();
			
			IPath absPath = rawLocation.makeAbsolute(); // Fix for 324242
			path1 = absPath;
			//path1 = PATH.append(scenarioRelativePath).removeLastSegments(2);
		} else {
			path1 = PATH.append(builtInScenarioProjectFolder);
		}
		String path = path1.append(sep).append(recordedSimulationsFolderName).toOSString();
		return path;
	}
}
