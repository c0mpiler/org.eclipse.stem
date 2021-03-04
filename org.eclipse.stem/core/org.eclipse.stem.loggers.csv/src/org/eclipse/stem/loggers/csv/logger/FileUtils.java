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
package org.eclipse.stem.loggers.csv.logger;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;


/**
 * Utilitie methods for handling paths and streams in the logger
 *
 */
public class FileUtils
{
	/**
	 * Given a scenario, return the folder where recorded simulations are stored.
	 * 
	 * @param scenarioURL
	 * @return String Folder to store recorded simulations
	 */
	public static String getRootLoggingFolderForScenario(String scenarioURL) 
	{
		final IPath workspacePath = ResourcesPlugin.getWorkspace().getRoot().getLocation();
		
		boolean stemProjectScenario = scenarioURL.startsWith(Constants.SCENARIOS_URL_PREFIX);
		IPath path1;
		if(stemProjectScenario) {
			// Scenario is contained in a STEM Project
			String scenarioRelativePath = scenarioURL.substring(Constants.SCENARIOS_URL_PREFIX.length());
			path1 = workspacePath.append(scenarioRelativePath).removeLastSegments(2);
		} else {
			// Scenario is from the built-in scenarios list
			path1 = workspacePath.append(Constants.BUILD_IN_SCENARIOS_PROJECT_FOLDER);
		}
		String path = path1.append(Constants.SYSTEM_PATH_SEPARATOR).append(Constants.RECORDED_SIMULATIONS_FOLDER).toOSString();
		return path;
	}
	
	/**
	 * Safely close a writer, ignoring all thrown errors and exceptions
	 * @param w The writer to close
	 */
	public static void safeClose(final Writer w)
	{
		try {
			w.close();
		} catch (Throwable t) {
			// don't care
		}
	}
	
	/**
	 * Safely close an output stream, ignoring all thrown errors and exceptions
	 * @param os Output stream to close
	 */
	public static void safeClose(final OutputStream os)
	{
		try {
			os.close();
		} catch (Throwable t) {
			// don't care
		}
	}
	
	/**
	 * Safely close an input stream, ignoring all exceptions through
	 * @param is Input stream to close
	 */
	public static void safeClose(final InputStream is)
	{
		try {
			is.close();
		} catch (Throwable t) {
			// don't care
		}
	}
}
