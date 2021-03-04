package org.eclipse.stem.ui.migration;

import java.util.ArrayList;
import java.util.List;

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


public class MigrationTasksScheduler {
	
	static MigrationTasksScheduler instance = null;
	static ArrayList<MigrationTask> allTasks;
	{
		allTasks = new ArrayList<MigrationTask>();
		
		// Add tasks in the correct order here
		allTasks.add(MigrationV1V2Task.INSTANCE);
	}
	
	private MigrationTasksScheduler() {
	}
	
	
	public static MigrationTasksScheduler getInstance() {
		if(instance == null) instance = new MigrationTasksScheduler();
		return instance;
	}
	
	/**
	 * Retieve all the migration tasks needed to go from the 'from' version to the 'to' version. These are any tasks intersecting the two version numbers
	 * @param from
	 * @param to
	 * @return
	 */
	public List<MigrationTask> getTasks(Version from, Version to) {
		ArrayList<MigrationTask> result = new ArrayList<MigrationTask>();
		
		if(from.compareTo(to) == 0) return result; // same version, nothing to do
		
		for(MigrationTask mt:allTasks) {
			Version taskFromV = mt.getFromVersion();
			Version taskToV = mt.getToVersion();
			
			taskFromV.compareTo(from);
			int compFromEnd = taskToV.compareTo(from);
			int compToStart = taskFromV.compareTo(to);
			taskToV.compareTo(to);
			
			// If the end version of the task is before the 'from' version in the argument, nothing to do
			if(compFromEnd < 0) continue;
			// if the start version in the task is after the 'to' version in the argument, nothing to do
			if(compToStart > 0) continue;
			
			// We must be intersecting the asked for version interval
			result.add(mt);
		}
		return result;
	}
	
	
}
