package org.eclipse.stem.util.analysis;

/*******************************************************************************
 * Copyright (c) 2007 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation and new features
 *     Bundesinstitut für Risikobewertung - Pajek Graph interface, new Veterinary Models
 *******************************************************************************/

import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.stem.util.analysis.Activator;
import org.osgi.service.prefs.BackingStoreException;

/**
 * This class represents
 */
public class MonitorPreferences {

	Plugin plugin = Activator.getDefault();

	/**
	 * the users preferences
	 */
	IPreferenceStore preferenceStore = Activator.getDefault().getPreferenceStore();

	/**
	 * the ID of the default location the location ID for the aggregated data at
	 * the world level
	 */
	private static final String DEFAULT_PREFERENCE = "PREVIOUS_FOLDER";
	
	/**
	 * the ID of the estimator method
	 */
	private static final String ESTIMATOR_PREFERENCE = "ESTIMATOR_METHOD";

	
	/**
	 * the default folder location
	 */
	private static final String DEFAULT_PREF_VALUE = "";
    
	String recentFolder = null;
	
	String recentEstimationMethod = null;
	

	/**
	 * 
	 */
	public MonitorPreferences() {
		if (preferenceStore.contains(DEFAULT_PREFERENCE)) {
			recentFolder = preferenceStore.getString(DEFAULT_PREFERENCE);
		}  else {
			// first time only
			recentFolder = DEFAULT_PREF_VALUE;
			setPreferences();
		}
		
		if (preferenceStore.contains(ESTIMATOR_PREFERENCE)) {
			recentEstimationMethod = preferenceStore.getString(ESTIMATOR_PREFERENCE);
		}  else {
			recentEstimationMethod = null;
			setPreferences();
		}
	} // constructor

	/**
	 *  set the preferences
	 */
	public void setPreferences() {
		preferenceStore.setValue(DEFAULT_PREFERENCE, recentFolder);
		if(recentEstimationMethod != null) preferenceStore.setValue(ESTIMATOR_PREFERENCE, recentEstimationMethod);
		try {
			InstanceScope.INSTANCE.getNode(Activator.getDefault().getBundle().getSymbolicName()).flush();
		} catch (BackingStoreException e) {
			Activator.logError("Not able to save preferences", e);
		}
	}
	
	

	

	/**
	 *  set the preferences based on user action
	 * @param consumer specific class that sets or gets this folder preference
	 * @param recent 
	 */
	public void setRecentFolder(String consumer, String recent) {
		recentFolder=recent;
		preferenceStore.setValue(consumer+"_"+DEFAULT_PREFERENCE, recentFolder);
		try {
			InstanceScope.INSTANCE.getNode(Activator.getDefault().getBundle().getSymbolicName()).flush();
		} catch (BackingStoreException e) {
			Activator.logError("Not able to save preferences", e);
		}
	}

	/**
	 *  set the preferences based on user action
	 * @param method 
	 */
	public void setEstimatorMethod(String method) {
		recentEstimationMethod=method;
		preferenceStore.setValue(ESTIMATOR_PREFERENCE, recentEstimationMethod);
		try {
			InstanceScope.INSTANCE.getNode(Activator.getDefault().getBundle().getSymbolicName()).flush();
		} catch (BackingStoreException e) {
			Activator.logError("Not able to save preferences", e);
		}
	}
	
	
	
	/**
	 * 
	 * @param consumer 
	 * @return recently used folder
	 */
	public String getRecentFolder(String consumer) {
		recentFolder = preferenceStore.getString(consumer+"_"+DEFAULT_PREFERENCE);
		if((recentFolder==null)||(recentFolder.length()==0)) {
			recentFolder = DEFAULT_PREF_VALUE;
			setRecentFolder(consumer, recentFolder);
			}
		return recentFolder;
	}
	
	
	
	
	/**
	 * 
	 * @return recently used estimation method
	 */
	public String getRecentEstimatorMethod() {
		return recentEstimationMethod;
	}
}// class
