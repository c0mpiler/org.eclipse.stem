package org.eclipse.stem.ui.migration;


import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.stem.core.Constants;
import org.eclipse.stem.core.CorePlugin;
import org.eclipse.stem.ui.versioning.VersioningUtil;
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


public class MigrationUtil {

	public static boolean checkMigrationNeeded(IProject project) {
		
		if(!isValidProject(project)) return false;
		Version projectVersion = VersioningUtil.getSTEMProjectVersion(project);
		Version stemVersion = VersioningUtil.getSTEMVersion();
		
		return MigrationTasksScheduler.getInstance().getTasks(projectVersion, stemVersion).size() > 0;
		
	}


	private static boolean isValidProject(IProject project) {
		if(!project.isOpen()) return false;
		try {
			if(!project.hasNature(Constants.ID_STEM_PROJECT_NATURE))
				return false;
		} catch(CoreException ce) {
			CorePlugin.logError(ce.getMessage(), ce);
			return false;
		}
		return true;
	}
}
