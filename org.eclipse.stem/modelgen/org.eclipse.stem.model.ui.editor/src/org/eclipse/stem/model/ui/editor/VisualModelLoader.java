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
package org.eclipse.stem.model.ui.editor;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.stem.model.metamodel.Package;
import org.eclipse.stem.model.metamodel.Transition;
import org.eclipse.stem.model.ui.editor.vismodel.CanvasPackage;
import org.eclipse.stem.model.xtext.XtextUtils;
import org.eclipse.ui.IFileEditorInput;

public class VisualModelLoader 
{
	private ResourceSet rs = new ResourceSetImpl();
	private IFileEditorInput input;
	
	private Package metamodel;
	private CanvasPackage vismodel;
	
	private IPath metamodelFile, vismodelFile;
	private Resource metamodelResource, vismodelResource;
	
//	private EditingDomain metamodelEditingDomain;
	
	public VisualModelLoader(IFileEditorInput input)
	{
		this.input = input;
	}
	
//	public EditingDomain getMetamodelEditingDomain()
//	{
//		return metamodelEditingDomain;
//	}
	
	public void destroy()
	{
		for (Resource r : rs.getResources()) {
			r.unload();
		}
		rs = null;
		input = null;
		metamodel = null;
		vismodel = null;
		vismodelResource = null;
		metamodelResource = null;
	}
	
	public Package getMetamodel()
	{
		return metamodel;
	}
	
	public CanvasPackage getVisualModel()
	{
		return vismodel;
	}
	
	public void load() throws ModelLoadException
	{
		IFile file = input.getFile();
		if (file.getName().endsWith(".metamodel")) {
			metamodelFile = file.getFullPath();
			// Load for metamodel
			loadForMetamodel();
		}
		if (file.getName().endsWith(".vmm")) {
			// load for visual model
			loadForVismodel(file);
		}
	}
	
	private static URI getUriForPath(IPath path) {
		return URI.createPlatformResourceURI(path.toString(), true);
	}
	
	private void initializeXtextExpressions(Package pkg) {
		TreeIterator<EObject> iterator = pkg.eAllContents();
		while (iterator.hasNext()) {
			EObject obj = iterator.next();
			if (obj instanceof Transition) {
				XtextUtils.loadAndResolveXtextResourceForTransition((Transition)obj);
			}
		}
	}
	
	private Package loadMetamodel(IPath file) throws ModelLoadException
	{
		URI mmURI = getUriForPath(file);
				
		try {	
			metamodelResource = rs.getResource(mmURI, true);
		} catch (Exception ioe) {
			throw new ModelLoadException("Error loading metamodel for "+ mmURI.toString(), metamodelResource, ioe);
		}
		
		if (metamodelResource.getContents().size() > 0) {
			EObject obj = metamodelResource.getContents().get(0);
			EcoreUtil.resolveAll(obj);
			if (obj instanceof Package) {
				initializeXtextExpressions((Package)obj);
				return (Package) obj;
			}
		}
		
		throw new ModelLoadException("The metamodel file did not contain a model package.  Check for parse errors.", metamodelResource);
	}
	
	private CanvasPackage loadVisualModel(URI visualModelUri) throws ModelLoadException
	{
		vismodelResource = rs.createResource(visualModelUri);
		try {	
			vismodelResource.load(null);
		} catch (IOException ioe) {
			throw new ModelLoadException("Error loading visual model for "+ visualModelUri.toString(), vismodelResource, ioe);
		}
		
		if (vismodelResource.getContents().size() > 0) {
			EObject obj = vismodelResource.getContents().get(0);
			EcoreUtil.resolveAll(obj);
			if (obj instanceof CanvasPackage) {
				return (CanvasPackage) obj;
			}
		}
		
		throw new ModelLoadException("The visual model file did not contain a canvas package.  Check for parse errors.", vismodelResource);
	}
	
	private CanvasPackage loadVisualModel(IFile file) throws ModelLoadException
	{
		return loadVisualModel(getUriForPath(file.getFullPath()));
	}
	
	private IPath[] getVisualModelSearchPaths(IPath metamodelFile)
	{
		IPath[] paths = new IPath[2];
		
		paths[0] = metamodelFile.removeFileExtension().addFileExtension("vmm");
		String hiddenVmmFile = "."+paths[0].lastSegment();
		paths[1] = metamodelFile.removeLastSegments(1).append(hiddenVmmFile);
		
		return paths;
	}
	
	
	private void findAndLoadVisualModelForMetamodel()
	{
		
		// Load from metamodel reference
		/*if (metamodel.getVisualModel() != null) {
			URI vismodelUri = metamodel.getVisualModel();
		}*/
		
		final IWorkspaceRoot wsr = ResourcesPlugin.getWorkspace().getRoot();
		for (IPath path : getVisualModelSearchPaths(metamodelFile)) {
			IResource resource = wsr.findMember(path);
			if (resource instanceof IFile) {
				// we have something.  Try and load
				try {
					CanvasPackage vismodel = loadVisualModel((IFile)resource);
					if (vismodel != null) {
						this.vismodelFile = resource.getFullPath();
						this.vismodel = vismodel;
					}
				} catch (ModelLoadException mle) {
					// continue
				}
				
			}
		}
	}
	
	private void initializeVisualModelForMetamodel() throws ModelLoadException {
		vismodel = VisualModelReconciler.initializeForMetamodel(metamodel);
		vismodelFile = getDefaultVisualModelPath();
		try {
			if (vismodelFile != null) {
				// Add vismodel to resource set
				vismodelResource = rs.createResource(getUriForPath(vismodelFile));
				vismodelResource.getContents().add(vismodel);
				saveVisualModel();
				print(vismodelResource);
			} else {
				throw new IOException("Coldn't find serialization path for the visual model file");
			}
		} catch (IOException ioe) {
			throw new ModelLoadException("Unable to initialize the visual model", null, ioe);
		}
	}
	
	private IPath getDefaultVisualModelPath() {
		if (metamodelFile != null) {
			IPath path = metamodelFile;
			String filename = path.removeFileExtension().lastSegment();
			return path.removeLastSegments(1).append("."+filename+".vmm");	
		}
		if (input != null && metamodel != null) {
			return input.getFile().getFullPath().removeLastSegments(1).append("."+metamodel.getName() +".vmm");
		}
		return null;
	}
	
	
	private void loadForMetamodel() throws ModelLoadException
	{
		metamodel = loadMetamodel(metamodelFile);
		findAndLoadVisualModelForMetamodel();
		if (vismodel == null) {
			initializeVisualModelForMetamodel();
		} else {
			reconcileVisualModel();
			print(vismodelResource);
		}
		
	}
	
	private void reconcileVisualModel() throws ModelLoadException {
		VisualModelReconciler reconciler = new VisualModelReconciler(metamodel, vismodel);
		reconciler.reconcile();
		if (reconciler.isVismodelChanged()) {
			try {
				saveVisualModel();
			} catch (IOException ioe) {
				throw new ModelLoadException("Error saving reconciled visual model", null, ioe);
			}	
		}
	}
	
	private void loadForVismodel(IFile file) throws ModelLoadException
	{
		
	}
	
	public void save() throws IOException
	{
		saveMetamodel();
		saveVisualModel();
		//((BasicCommandStack)metamodelEditingDomain.getCommandStack()).saveIsDone();
	}
	
	private void saveMetamodel() throws IOException {
		if (metamodelResource != null) {
			metamodelResource.save(Collections.EMPTY_MAP);
			//print(metamodelResource);
		}
	}
	
	private void saveVisualModel() throws IOException {
		if (vismodelResource != null) {
			vismodelResource.save(Collections.EMPTY_MAP);
			//print(vismodelResource);
		}
	}
	
	private static void print(Resource r) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			r.save(baos, Collections.EMPTY_MAP);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	public static class ModelLoadException extends Exception
	{
		Resource resource;
		/**
		 * 
		 */
		private static final long serialVersionUID = -3367244339543539764L;

		public ModelLoadException(String message)
		{
			this(message,(Resource)null,(Throwable)null);
		}
		
		public ModelLoadException(String message, Resource resource)
		{
			this(message,resource,null);
		}
		
		public ModelLoadException(String message, Resource resource, Throwable cause)
		{
			super(message,cause);
			this.resource = resource;
		}
	}
}
