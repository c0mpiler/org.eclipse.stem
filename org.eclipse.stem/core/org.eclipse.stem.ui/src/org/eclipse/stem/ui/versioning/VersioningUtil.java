package org.eclipse.stem.ui.versioning;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.stem.core.Constants;
import org.eclipse.stem.core.CorePlugin;
import org.osgi.framework.Bundle;
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


public class VersioningUtil {

	final public static String VERSION_FILE_NAME = ".version";
	
	final public static Version STEM_VERSION_1 = new Version(1, 0, 0);
	final public static Version STEM_VERSION_2 = new Version(2, 0, 0);
	
	public static Version getSTEMProjectVersion(IProject project) {
		try {
			if(!project.hasNature(Constants.ID_STEM_PROJECT_NATURE))
				return null;
		} catch(CoreException ce) {
			return null;
		}
		
		IFile versionFile= project.getFile(VERSION_FILE_NAME);
			
		if(!versionFile.exists())
			return STEM_VERSION_1; // If no .version file we must be on version 1.x

		String  versionString=null;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(versionFile.getContents()));
			
			versionString = br.readLine();
			br.close();
		} catch(IOException ioe) {
			CorePlugin.logError(ioe.getMessage(), ioe);
		} catch(CoreException ce) {
			return STEM_VERSION_1; //  For some reason the check whether file exists above doesn't always return false
			//CorePlugin.logError(ce.getMessage(), ce);
		}
		
		return new Version(versionString);
	}
	
	public static void setSTEMProjectVersion(IProject project, String version) {
		// Safe
		try {
			if(!project.hasNature(Constants.ID_STEM_PROJECT_NATURE))
				return;
		} catch(CoreException ce) {
			return;
		}
		
		
//		IFolder projectRootFolder = project.getFolder(".");
		
		IFile newVersionFile = project.getFile(VERSION_FILE_NAME);
		
		ByteArrayInputStream bais = new ByteArrayInputStream(version.getBytes(Charset.forName("UTF-8")));
		try {
			if(newVersionFile.exists())
				newVersionFile.setContents(bais, true, false, null);
			else
				newVersionFile.create(bais, true, null);
		} catch(CoreException ce) {
			CorePlugin.logError(ce.getMessage(), ce);
		}
	}
	
	public static Version getSTEMVersion() {
		// Return the current version of STEM
		
		// Use the plugin version
		
		Bundle thisBundle = CorePlugin.getDefault().getBundle();
		
		Version STEMVersion = thisBundle.getVersion();
		
		return STEMVersion;
	}
	
}
