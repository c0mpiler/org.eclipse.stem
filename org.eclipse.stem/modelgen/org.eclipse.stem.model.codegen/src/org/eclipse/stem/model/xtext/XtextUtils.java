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
package org.eclipse.stem.model.xtext;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.stem.model.codegen.GeneratorUtils;
import org.eclipse.stem.model.ctdl.ContextSensitiveResourceWrapper;
import org.eclipse.stem.model.ctdl.ctdl.CompartmentTransitionDefinitions;
import org.eclipse.stem.model.ctdl.ctdl.CtdlFactory;
import org.eclipse.stem.model.ctdl.ctdl.ExternalFunctionReference;
import org.eclipse.stem.model.ctdl.ctdl.FunctionCall;
import org.eclipse.stem.model.ctdl.ctdl.MetamodelResource;
import org.eclipse.stem.model.metamodel.Model;
import org.eclipse.stem.model.metamodel.Transition;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.StringInputStream;

public class XtextUtils 
{
	public static boolean isNullOrEmpty(String s)
	{
		return s == null || "".equals(s.trim());
	}
	
	public static Set<String> getContributingPluginsForMetamodel(org.eclipse.stem.model.metamodel.Package metamodel)
	{
		Set<String> plugins = new HashSet<String>();
		for (Model model : metamodel.getModels()) {
			List<XtextResource> resources = getXtextResourcesForModel(model);
			for (XtextResource resource : resources) {
				plugins.addAll(getContributingPluginsForExpression(resource));
			}
		}
		return plugins;
	}
	
	public static Set<String> getContributingPluginsForExpression(XtextResource resource)
	{
		Set<String> plugins = new HashSet<String>();
		TreeIterator<EObject> iter = resource.getAllContents();
		while (iter.hasNext()) {
			EObject obj = iter.next();
			if (obj instanceof FunctionCall && ((FunctionCall) obj).getRef() instanceof ExternalFunctionReference) {
				ExternalFunctionReference ref = (ExternalFunctionReference)((FunctionCall) obj).getRef();
				if (ref.getFunc() != null) {
					plugins.add(ref.getFunc().getContributingPlugin());
				}
			}
		}
		
		return plugins;
	}

	public static List<XtextResource> getXtextResourcesForModel(Model model)
	{
		List<XtextResource> resources = new ArrayList<XtextResource>(model.getTransitions().size());
		for (Transition transition : model.getTransitions()) {
			XtextResource resource = loadAndResolveXtextResourceForTransition(transition);
			if (resource != null) {
				resources.add(resource);
			}
		}
		return resources;
	}
	
	public static XtextResource loadAndResolveXtextResourceForTransition(Transition transition)
	{
		if (transition == null || isNullOrEmpty(transition.getExpression())) {
			return null;
		}
		ResourceSet resourceSet = new ResourceSetImpl();
		XtextResource resource = (XtextResource) resourceSet.createResource(URI.createURI("empty.sctd"));
		resourceSet.getResources().add(resource);
		InputStream is = new StringInputStream(transition.getExpression());
		
		try {
			resource.load(is, Collections.emptyMap());
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		} finally {
			GeneratorUtils.safeClose(is);
		}
		
		if (resource instanceof ContextSensitiveResourceWrapper) {
			((ContextSensitiveResourceWrapper) resource).setTransition(transition);
		}
		
		EcoreUtil2.resolveLazyCrossReferences(resource, new CancelIndicator() {
			
			@Override
			public boolean isCanceled() {
				// TODO Auto-generated method stub
				return false;
			}
		});
		
		if (resource.getContents().size() > 0 && 
				resource.getContents().get(0) instanceof CompartmentTransitionDefinitions) {
			CompartmentTransitionDefinitions ctd = (CompartmentTransitionDefinitions)resource.getContents().get(0);
			MetamodelResource mmrs = CtdlFactory.eINSTANCE.createMetamodelResource();
			mmrs.setTransition(transition);
			mmrs.setModel(transition.getContainerModel());
			ctd.setMetamodel(mmrs);
		}
		
		transition.setExpressionResource(resource);
		return resource;
	}
}
