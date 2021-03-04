// Utility.java
package org.eclipse.stem.core;

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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.internal.resources.Folder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.osgi.util.NLS;
import org.eclipse.stem.core.common.CommonFactory;
import org.eclipse.stem.core.common.DublinCore;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.scenario.Scenario;
import org.eclipse.stem.core.scenario.ScenarioInitializationException;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * This class contains common utility methods used in STEM.
 */
@SuppressWarnings("restriction")
public class Utility {

	/**
	 * EMF Save Options, for properly serializing to UTF-8
	 */
	public static final Map<String,String> EMF_SAVE_OPTIONS 
		= new HashMap<String,String>();
	/**
	 * EMF Save Options, for properly serializing to UTF-8 and keeping default values
	 */
	private static final Map<String,Object> EMF_SAVE_OPTIONS_KEEP_DEFAULTS 
		= new HashMap<String,Object>();
	static {
		EMF_SAVE_OPTIONS.put(XMLResource.OPTION_ENCODING, "UTF-8"); //$NON-NLS-1$
		EMF_SAVE_OPTIONS_KEEP_DEFAULTS.put(XMLResource.OPTION_ENCODING, "UTF-8"); //$NON-NLS-1$
		EMF_SAVE_OPTIONS_KEEP_DEFAULTS.put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE); //$NON-NLS-1$
	}
	
	public static String PLATFORM_PREFIX = "platform:/resource";
	
	/**
	 * Cached resource set
	 */

	public static ResourceSet resourceSet;
	
	static {
		resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", STEMXMIResourceFactoryImpl.INSTANCE); //$NON-NLS-1$
		resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put("platform", STEMXMIResourceFactoryImpl.INSTANCE); //$NON-NLS-1$
	}
	
	/**
	 * unloadAllResources
	 *
	 */
	
	public static void unloadAllResources() {
		synchronized(resourceSet) {
			for(Resource r:resourceSet.getResources()) {
				r.unload();
			}
		}
	}
	
	/**
	 * unloadResourcesInProject. When a project is deleted or closed we remove its resources from the shared resource set. 
	 * 
	 * @param p The project
	 */
	
	public static void unloadResourcesInProject(IProject p) {
		String path = p.getFullPath().toString();
		path = PLATFORM_PREFIX+path;
		for(Resource r:resourceSet.getResources()) {
			if(r.getURI().toString().startsWith(path)) {
				r.unload();
			}
		}
	}
	
	/**
	 * @param identifableURI
	 *            the {@link URI} of file with a serialized {@link Identifiable}
	 * @return the {@link Identifiable} de-serialized from the file, or
	 *         <code>null</code> if an error occurred.
	 */
	public static Identifiable getIdentifiable(final URI identifableURI) {
		Identifiable retValue = null;

		try {
			URI normalized = STEMURI.normalize(identifableURI);
			Resource resource = null;
			synchronized(resourceSet) { // Resource set is not thread safe
				resource = resourceSet.getResource(normalized,
					true);
			
				if(resource.isModified()) {				
					resource.unload();
					resource.load(null);
					if(resource.getErrors().size() > 0) {
						for(Resource.Diagnostic d: resource.getErrors()) 
							CorePlugin.logError(d.getMessage(), new Exception());
					}
				}
			} // Synchronized
			EList<EObject>cont = resource.getContents();
			if(cont.size() == 0) {
				int maxretry = 10;
				while(cont.size() == 0 && --maxretry > 0)
					Thread.yield(); // allow other thread to load resource
				if(cont.size() == 0) {
					CorePlugin.logError(NLS.bind(Messages.Utility_UNABLE_TO_LOAD_CONTENT, new Object[] {normalized}), new Exception());
					return null;
				}
			}
			retValue = (Identifiable) cont.get(0);
		} catch (final Exception e) {
			CorePlugin.logError(NLS.bind(Messages.Utility_BAD_SERIALIZED_INSTANCE, new Object [] {identifableURI.toString()}),e);
			retValue = null;
		}
		return retValue;
	} // getIdentifiable


	/**
	 * Load an identifiable in a new resource set (forcing it to be loaded)
	 *  
	 * @param identifableURI
	 *            the {@link URI} of file with a serialized {@link Identifiable}
	 * @return the {@link Identifiable} de-serialized from the file, or
	 *         <code>null</code> if an error occurred.
	 */
	public static Identifiable getIdentifiableForceLoad(final URI identifableURI) {
		Identifiable retValue = null;

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", STEMXMIResourceFactoryImpl.INSTANCE); //$NON-NLS-1$
		resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put("platform", STEMXMIResourceFactoryImpl.INSTANCE); //$NON-NLS-1$

		try {
			URI normalized = STEMURI.normalize(identifableURI);
			Resource resource = null;
			resource = resourceSet.getResource(normalized,
					true);

			if(resource.isModified()) {				
				resource.unload();
				resource.load(null);
				if(resource.getErrors().size() > 0) {
					for(Resource.Diagnostic d: resource.getErrors()) 
						CorePlugin.logError(d.getMessage(), new Exception());
				}
			}
			EList<EObject>cont = resource.getContents();
			if(cont.size() == 0) {
				int maxretry = 10;
				while(cont.size() == 0 && --maxretry > 0)
					Thread.yield(); // allow other thread to load resource
				if(cont.size() == 0) {
					CorePlugin.logError(NLS.bind(Messages.Utility_UNABLE_TO_LOAD_CONTENT, new Object[] {normalized}), new Exception());
					return null;
				}
			}
			retValue = (Identifiable) cont.get(0);
		} catch (final Exception e) {
			CorePlugin.logError(NLS.bind(Messages.Utility_BAD_SERIALIZED_INSTANCE, new Object [] {identifableURI.toString()}),e);
			retValue = null;
		}
		return retValue;
	} // getIdentifiable


	/**
	 * @param identifableURI
	 *            the {@link URI} of file with a serialized {@link Identifiable}
	 * @return the {@link Identifiable} de-serialized from the file, or
	 *         <code>null</code> if an error occurred.
	 */
	public static Identifiable getIdentifiableFromStream(final URI identifableURI, InputStream is, Map<String, Object>options, boolean binary) {
		Identifiable retValue = null;

		try {
			URI normalized = STEMURI.normalize(identifableURI);
			Resource resource = null;
			ResourceSet rs = new ResourceSetImpl();
			
			if(binary) {
				rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", STEMBinaryResourceFactoryImpl.INSTANCE); //$NON-NLS-1$
				rs.getResourceFactoryRegistry().getProtocolToFactoryMap().put("platform", STEMBinaryResourceFactoryImpl.INSTANCE); //$NON-NLS-1$
			} else {
				rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", STEMXMIResourceFactoryImpl.INSTANCE); //$NON-NLS-1$
				rs.getResourceFactoryRegistry().getProtocolToFactoryMap().put("platform", STEMXMIResourceFactoryImpl.INSTANCE); //$NON-NLS-1$
			}
			
			resource = rs.createResource(normalized, null);
			resource.unload();
			resource.load(is, options);
			if(resource.getErrors().size() > 0) {
				for(Resource.Diagnostic d: resource.getErrors()) 
					CorePlugin.logError(d.getMessage(), new Exception());
			}
			EList<EObject>cont = resource.getContents();
			if(cont.size() == 0) {
				int maxretry = 10;
				while(cont.size() == 0 && --maxretry > 0)
					Thread.yield(); // allow other thread to load resource
				if(cont.size() == 0) {
					CorePlugin.logError(NLS.bind(Messages.Utility_UNABLE_TO_LOAD_CONTENT, new Object[] {normalized}), new Exception());
					return null;
				}
			}
			retValue = (Identifiable) cont.get(0);
		} catch (final Exception e) {
			CorePlugin.logError(NLS.bind(Messages.Utility_BAD_SERIALIZED_INSTANCE, new Object [] {identifableURI.toString()}),e);
			retValue = null;
		}
		return retValue;
	} // getIdentifiable
	
	/**
	 *
	 */
	public static Resource getResource(final URI identifableURI) {
	
		try {
			URI normalized = STEMURI.normalize(identifableURI);
			Resource resource = null;
			synchronized(resourceSet) { // Resource set is not thread safe
				resource = resourceSet.getResource(normalized,
					true);
			
				if(resource.isModified()) {				
					resource.unload();
					resource.load(null);
					if(resource.getErrors().size() > 0) {
						for(Resource.Diagnostic d: resource.getErrors()) 
							CorePlugin.logError(d.getMessage(), new Exception());
					}
				}
			} // Synchronized
			return resource;
		} catch (final Exception e) {
			CorePlugin.logError(NLS.bind(Messages.Utility_BAD_SERIALIZED_INSTANCE, new Object [] {identifableURI.toString()}),e);
		}
		return null;
	} // getIdentifiable
	

	/**
	 * @param identifableURI
	 *            the {@link URI} of file with a serialized {@link Identifiable}
	 * @return the {@link Identifiable} de-serialized from the file, or
	 *         <code>null</code> if an error occurred.
	 */
	public static Identifiable getIdentifiableIgnoreException(final URI identifableURI) {
		Identifiable retValue = null;

		try {
			URI normalized = STEMURI.normalize(identifableURI);
			Resource resource = null;
			ResourceSet rs = new ResourceSetImpl(); // This method uses it's own resource set
			resource = rs.getResource(normalized, true);
			
			EList<EObject>cont = resource.getContents();
			if(cont.size() == 0) {
				int maxretry = 10;
				while(cont.size() == 0 && --maxretry > 0)
					Thread.yield(); // allow other thread to load resource
				if(cont.size() == 0) {
					return null;
				}
			}
			retValue = (Identifiable) cont.get(0);
		} catch (final Exception e) {
			retValue = null;
		}
		return retValue;
	} // getIdentifiable
	
	/**
	 * Serialize an {@link Identifiable}
	 * <p>
	 * Note this code is copied from
	 * org.eclipse.stem.internal.data.records.Record. That method should be
	 * removed and this one used instead.
	 * 
	 * @param identifiable
	 *            the {@link Identifiable} to be serialized.
	 * @param serializationURI
	 *            the {@link URI} that specifies where the {@link Identifiable}
	 *            is to be serialized.
	 * @throws IOException
	 *             if there is a problem serializing the {@link Identifiable}
	 */
	public static void serializeIdentifiable(final Identifiable identifiable,
			final URI serializationURI) throws IOException {
		final List<Identifiable> set = new ArrayList<Identifiable>();
		set.add(identifiable);
		serializeIdentifiables(set, serializationURI);
	} // serializeIdentifiable

	/**
	 * Serialize an {@link Identifiable} and also store default values
	 * <p>
	 * Note this code is copied from
	 * org.eclipse.stem.internal.data.records.Record. That method should be
	 * removed and this one used instead.
	 * 
	 * @param identifiable
	 *            the {@link Identifiable} to be serialized.
	 * @param serializationURI
	 *            the {@link URI} that specifies where the {@link Identifiable}
	 *            is to be serialized.
	 * @throws IOException
	 *             if there is a problem serializing the {@link Identifiable}
	 */
	public static void serializeIdentifiableKeepDefaults(final Identifiable identifiable,
			final URI serializationURI) throws IOException {
		final List<Identifiable> set = new ArrayList<Identifiable>();
		set.add(identifiable);
		serializeIdentifiablesKeepDefaults(set, serializationURI);
	} // serializeIdentifiable
	
	/**
	 * Serialize an {@link Identifiable}
	 * 
	 * @param identifiable
	 *            the {@link Identifiable} to be serialized.
	 * @param serializationURI
	 *            the {@link URI} that specifies where the {@link Identifiable}
	 *            is to be serialized.
	 * @throws IOException
	 *             if there is a problem serializing the {@link Identifiable}
	 */
	public static void serializeIdentifiables(final List<Identifiable> identifiables,
			final URI serializationURI) throws IOException {

		// This code could be running "stand alone" (i.e., not within eclipse),
		// thus the default factories for the extensions are not registered as
		// they would from their extension of
		// "org.eclipse.emf.ecore.extension_parser". So we need to register them
		// here.

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", //$NON-NLS-1$
				STEMXMIResourceFactoryImpl.INSTANCE);
		Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
				"platform", STEMXMIResourceFactoryImpl.INSTANCE); //$NON-NLS-1$

		final ResourceSet rs = new ResourceSetImpl();

		rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("*", STEMXMIResourceFactoryImpl.INSTANCE); //$NON-NLS-1$

		rs.getResourceFactoryRegistry().getProtocolToFactoryMap().put(
				"platform", STEMXMIResourceFactoryImpl.INSTANCE); //$NON-NLS-1$

		final Resource resource = rs.createResource(serializationURI);
		
		for (Identifiable id : identifiables) {
			resource.getContents().add(id);
		}
 
		resource.save(EMF_SAVE_OPTIONS);
	} // serializeIdentifiable
	
	/**
	 * Serialize a list of {@link Identifiable} and also keep the default values
	 * 
	 * @param identifiable
	 *            the {@link Identifiable} to be serialized.
	 * @param serializationURI
	 *            the {@link URI} that specifies where the {@link Identifiable}
	 *            is to be serialized.
	 * @throws IOException
	 *             if there is a problem serializing the {@link Identifiable}
	 */
	public static void serializeIdentifiablesKeepDefaults(final List<Identifiable> identifiables,
			final URI serializationURI) throws IOException {

		// This code could be running "stand alone" (i.e., not within eclipse),
		// thus the default factories for the extensions are not registered as
		// they would from their extension of
		// "org.eclipse.emf.ecore.extension_parser". So we need to register them
		// here.

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", //$NON-NLS-1$
				STEMXMIResourceFactoryImpl.INSTANCE);
		Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
				"platform", STEMXMIResourceFactoryImpl.INSTANCE); //$NON-NLS-1$

		final ResourceSet rs = new ResourceSetImpl();

		rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("*", STEMXMIResourceFactoryImpl.INSTANCE); //$NON-NLS-1$

		rs.getResourceFactoryRegistry().getProtocolToFactoryMap().put(
				"platform", STEMXMIResourceFactoryImpl.INSTANCE); //$NON-NLS-1$

		final Resource resource = rs.createResource(serializationURI);
		
		for (Identifiable id : identifiables) {
			resource.getContents().add(id);
		}

		resource.save(EMF_SAVE_OPTIONS_KEEP_DEFAULTS);
	} // serializeIdentifiable
	
	/**
	 * Serialize an {@link Identifiable}
	 * 
	 * @param identifiable
	 *            the {@link Identifiable} to be serialized.
	 * @param serializationURI
	 *            the {@link URI} that specifies where the {@link Identifiable}
	 *            is to be serialized.
	 * @param stream the stream to serialize to
	 * @throws IOException
	 *             if there is a problem serializing the {@link Identifiable}
	 */
	public static void serializeIdentifiableToStream(Identifiable identifiable,
			final URI serializationURI, OutputStream stream, Map<String,Object>options, boolean binary) throws IOException {

		// This code could be running "stand alone" (i.e., not within eclipse),
		// thus the default factories for the extensions are not registered as
		// they would from their extension of
		// "org.eclipse.emf.ecore.extension_parser". So we need to register them
		// here.

	
		final ResourceSet resourceSet = new ResourceSetImpl();

		if(binary) {
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
					.put("*", STEMBinaryResourceFactoryImpl.INSTANCE); //$NON-NLS-1$
	
			resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put(
					"platform", STEMBinaryResourceFactoryImpl.INSTANCE); //$NON-NLS-1$
		} else {
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("*", STEMXMIResourceFactoryImpl.INSTANCE); //$NON-NLS-1$

		resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put(
				"platform", STEMXMIResourceFactoryImpl.INSTANCE); //$NON-NLS-1$
		}
		
		final Resource resource = resourceSet.createResource(serializationURI);
		
		resource.getContents().add(identifiable);
		
		resource.save(stream, options);
	} // serializeIdentifiable
	
	
	/**
	 * Return the Dublin Core from a STEM extension point, e.g. disease model, population model, solver etc.
	 * @param extPointName Extension pointname
	 * @param className Class name of the instance
	 * @return Dublin Core The dublin core 
	 */
	
	public static DublinCore getPluginDublinCore(IConfigurationElement dcelement ) {

		String[] attrNames = dcelement.getAttributeNames();

		DublinCore dc = CommonFactory.eINSTANCE.createDublinCore();

		String[] keys = dcelement.getAttributeNames();
		for (int m = 0; m < keys.length; m ++) {
			String value = dcelement.getAttribute(keys[m]);

			EStructuralFeature feature = dc.getFeature(keys[m]);
			if((feature != null)&&(value!=null)) {
				dc.eSet(feature, value);
			}
		}  //for m name/value pairs
		return dc;
	}
	
	/**
	 * Common method for determining the geographic level of a geographic key (last segment of a URI)
	 * @param key
	 * @return the level of the key
	 */
	public  static int keyLevel(final String key) {
		// null means unspecified and truly global for population models.
		if(key == null || key.trim().equals("")) return -2; //$NON-NLS-1$
		// ZZZ is special, it means the world
		if(key.equalsIgnoreCase("ZZZ")) return -1; //$NON-NLS-1$
		
		int level = 0;
		int start = 0;
		for (int temp = key.indexOf("-"); temp > 0;) { //$NON-NLS-1$
			level++;
			start += temp + 1;
			temp = key.substring(start).indexOf("-"); //$NON-NLS-1$
		} // for
		return level;
	} // keyLevel
	
	/**
	 * Do the processing required to handle a {@link Exception}
	 * 
	 * @param scenario
	 *            the {@link Scenario} that caused the {@link Exception}
	 * @param name
	 *            the name to use in error messages that identifies the source
	 *            of the {@link Scenario}
	 * @param promptUser
	 *            if <code>true</code> then present the user with a dialog box
	 *            explaining the message.
	 * @param e
	 *            the {@link Exception}
	 */
	static public void handleException(final String message, boolean promptUser, final ScenarioInitializationException se) {
		if(se != null) 
			CorePlugin.logError(se.getErrorMessage(), se.getOriginalException());
		else CorePlugin.logError(message,  null);
		// Prompt the user?
		if (promptUser) {
			
			
			if(Display.getDefault() != null)
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						try {
							final IWorkbenchWindow window = PlatformUI
									.getWorkbench().getActiveWorkbenchWindow();
//							final IStatus warning = new Status(IStatus.WARNING,
//									CorePlugin.PLUGIN_ID, 1, message, null);
//							ErrorDialog.openError(window.getShell(), null, null,
//									warning);
							String [] labels = new String[1];
							labels[0] = Messages.Utility_OKAY;
							MessageDialog dialog = new MessageDialog(window.getShell(), "Warning", null, message, //$NON-NLS-1$
									MessageDialog.ERROR, labels, 0) {
//								@Override
//								protected void buttonPressed(int buttonId) {
//									if(buttonId == 1)
//										PlatformUI.getWorkbench().getHelpSystem().displayHelp("org.eclipse.stem.doc.invalidnesting_contextid");
//									else
//										super.buttonPressed(buttonId);
//								}
							};
							dialog.open();
						} catch(Exception e) {
							// If we get this exception, it is because we're not running in
							// eclipse.
						}
					} // run
				});

			
			// Yes
		} // if
	}
	
	private static ArrayList<String> INCLUDE_FOLDERS;
	static {
		INCLUDE_FOLDERS = new ArrayList<String>();
		INCLUDE_FOLDERS.add("decorators");
		INCLUDE_FOLDERS.add("experiments");
		//INCLUDE_FOLDERS.add("graphs"); skipping graphs since they don't contain anyting we can delete from the UI
		INCLUDE_FOLDERS.add("models");
		INCLUDE_FOLDERS.add("modifiers");
		INCLUDE_FOLDERS.add("predicates");
		INCLUDE_FOLDERS.add("scenarios");
		INCLUDE_FOLDERS.add("sequencers");
		INCLUDE_FOLDERS.add("triggers");
		INCLUDE_FOLDERS.add("loggers");
		INCLUDE_FOLDERS.add("solvers");
	}
	
	public static List<URI> findReferences(Identifiable ident) throws CoreException {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot workspaceRoot = workspace.getRoot();

		IProject [] allProjects = workspaceRoot.getProjects();
		ArrayList<URI> result = new ArrayList<URI>();
		for(IProject project:allProjects) {
			fetchDependenciesInProject(project, ident, result);
		}
		return result;
	}

	private static void fetchDependenciesInProject(IProject project, Identifiable ident, List<URI>result) throws CoreException {
		IResource[] members = project.members();
		for(IResource member:members) {
			if(member instanceof Folder && INCLUDE_FOLDERS.contains(member.getName())) 
				checkDependenciesInFolder(project, (Folder)member, ident, result);

		}
	}

	/**
	 * 
	 * @param project
	 * @param f
	 * @param ident
	 * @param result
	 * @throws CoreException
	 */
	private static void checkDependenciesInFolder(IProject project, Folder f, Identifiable ident, List<URI>result) throws CoreException {
		// Only check direct files inside folder, not sub-folders
		IResource [] members = f.members();
		for(IResource m:members) {
			if(m instanceof org.eclipse.core.internal.resources.File) {
				org.eclipse.core.internal.resources.File file = ( org.eclipse.core.internal.resources.File) m;
				String locationURI = file.getFullPath().toPortableString();
				if(!file.exists() || file.isHidden() || file.getName().startsWith(".") || file.getName().equals(ident.getURI().lastSegment()))
					continue;
				checkFile(project, file, ident, result);
			}
		}
	}

	private static void checkFile(IProject project, org.eclipse.core.internal.resources.File file, Identifiable ident, List<URI>result) throws CoreException {
		//Identifiable ident = Utility.getIdentifiableIgnoreException(STEMURI.createFromFile(file));
		//boolean needsUpdate = false;
		//if(ident != null)
		//	needsUpdate = checkIdentifiable(ident);

		// Load file and look for pattern inside the file
		InputStream content = file.getContents();
		BufferedReader bReader = new BufferedReader(new InputStreamReader(content));
        StringBuffer sbfFileContents = new StringBuffer();

        char []c = new char[1024];
         //read file line by line
        int nc=-1;
         do {
        	 try {
        		 nc = bReader.read(c);
        	 } catch(IOException ioe) {
        		 ioe.printStackTrace(); // bail!
        		 return;
        	 }

             if(nc != -1) {
            	 String s = new String(c, 0, nc);
            	 sbfFileContents.append(s);
             }
         } while(nc != -1);

         String fileContent = sbfFileContents.toString();

         boolean needsUpdate = fileContent.contains(ident.getURI().toString());
         /*fileContent
         String replStr = fileContent.replaceAll(escPattern, fullNewName);
         if(!replStr.equals(fileContent)) {
        	 String [] beforeAfter = new String[2];
        	 beforeAfter[0] = fileContent;
        	 beforeAfter[1] = replStr;
        	 changedResources.put(file, beforeAfter);
         }
         */
		if(needsUpdate) 
			result.add(STEMURI.createFromFile(file));
	}


	
} // Utility