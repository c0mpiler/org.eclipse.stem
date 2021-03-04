/******************************************************************************* 
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     IBM Corporation - initial API and implementation 
 *******************************************************************************/

package org.eclipse.stem.foodproduction;



import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.stem.core.Constants;
import org.eclipse.stem.core.common.DublinCore;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	/**
	 * The plug-in ID
	 */
	public static final String PLUGIN_ID = Constants.ID_ROOT + ".foodproduction";
	
	public static final String CLASS_FIELD = "class";
	

	// The shared instance
	private static Activator plugin;

	/**
	 * The constructor
	 */
	public Activator() {
		plugin = this;
	}

	/**
	 * @param context
	 * @throws Exception
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
	} // start

	/**
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	
	/**
	 *
	 * @param diseaseModel
	 * @return
	 */
	public static DublinCore getPluginDublinCore(FoodTransformer foodTransformer ) {
		String diseaseModelClass = foodTransformer.getClass().getName();
		
		DublinCore dc = null;
		final IExtensionRegistry registry = Platform.getExtensionRegistry();
		
        IExtensionPoint[] extensionPoints = registry.getExtensionPoints(PLUGIN_ID);
        for(int k = 0; k < extensionPoints.length; k++){
        	
        	 IExtensionPoint extensionPoint = extensionPoints[k];
        	 IExtension[] extensions = extensionPoint.getExtensions();
        	 // For each extension ...
    	     for (int i = 0; i < extensions.length; i++) { 
    	         IExtension extension = extensions[i];
    	         IConfigurationElement[] elements = extension.getConfigurationElements();
    	            
    	         // For each member of the extension ...
    	         for (int j = 0; j < elements.length; j++) {
    	                IConfigurationElement element = elements[j];
    	             
    	                String[] keys = element.getAttributeNames();
    	                for (int m = 0; m < keys.length; m ++) {
    	                	String value = element.getAttribute(keys[m]);
    	                	
    	                	if((keys[m].equalsIgnoreCase(CLASS_FIELD)&&(value.equalsIgnoreCase(diseaseModelClass)))){
    	                		dc = foodTransformer.getDublinCore();
    	                	} else {
    	                		if(dc != null) {	
    	                			EStructuralFeature feature = dc.getFeature(keys[m]);
    	                			if((feature != null)&&(value!=null)) {
    	                					dc.eSet(feature, value);
    	                			}// if feature/value not null
    	                		}// if dc not null
    	                	}// if/else
    	                }  //for m name/value pairs
                }// for j elements
    	        // once it's set we are done
    	        if(dc != null) return dc;
            }
        }
        
		return null;
	}
	/**
	 * Log an error to the ILog for this plugin
	 * 
	 * @param message
	 *            the localized error message text
	 * @param exception
	 *            the associated exception, or null
	 */
	public static void logError(String message, Throwable exception) {
		// Running as a plugin?
		if (plugin != null) {
			// Yes
			plugin.getLog().log(
					new Status(IStatus.ERROR, plugin.getBundle()
							.getSymbolicName(), 0, message, exception));
		} else {
			System.err.println(message);
			// Exception?
			if (exception != null) {
				// Yes
				System.err.println(exception.getMessage());
				exception.printStackTrace(System.err);
			}
		}

	} // logError

	/**
	 * Log information to the ILog for this plugin
	 * 
	 * @param message
	 *            the localized information message text
	 * @param exception
	 *            the associated exception, or null
	 */
	public static void logInformation(String message, Throwable exception) {
		// Do we have a plugin?
		if (plugin != null) {
			// Yes
			plugin.getLog().log(
					new Status(IStatus.INFO, plugin.getBundle().getSymbolicName(),
							0, message, exception));
		}
		else {
			// No
			System.out.println(message);
			// Exception?
			if (exception != null) {
				// Yes
				System.out.println(exception.getMessage());
			} // if 
		}
	} // logInformation
	
	
	/**
	 * Log information to the ILog for this plugin
	 * The method is overloaded to allow for logInformation without an error 
	 * method sets the error to null. This should be used instead of System.out.println
	 * throughout the code.
	 * @param message
	 *            the localized information message text
	 *
	 */
	public static void logInformation(String message) {
		// Do we have a plugin?
		if (plugin != null) {
			// Yes
			plugin.getLog().log(
					new Status(IStatus.INFO, plugin.getBundle().getSymbolicName(),
							0, message, null));
		}
		else {
			// No
			System.out.println(message);
		}
	} // logInformation
	
} // Activator
