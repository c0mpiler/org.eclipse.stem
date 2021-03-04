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
package org.eclipse.stem.model.ctdl.scoping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.stem.model.ctdl.CTDLUtils;
import org.eclipse.stem.model.ctdl.ctdl.CtdlFactory;
import org.eclipse.stem.model.ctdl.ctdl.ExternalFunctionReference;
import org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition;
import org.eclipse.stem.model.ctdl.functions.FunctionArgument;
import org.eclipse.stem.model.ctdl.functions.FunctionDefinitionLoader;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;

import com.google.common.collect.Sets;

public class ExtensionAwareScope extends AbstractScope
{
	final Map<String,List<ExternalFunctionDefinition>> functionDefinitions;
	final List<IEObjectDescription> addedOn;
	
	public ExtensionAwareScope(IScope delegate, EObject ctx) {
		super(delegate, true);
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.createResource(URI.createURI("empty.sctd"));
		
		functionDefinitions = FunctionDefinitionLoader.getInstance().getDefinitions();
		
		addedOn = new ArrayList<IEObjectDescription>();
		for (List<ExternalFunctionDefinition> functionsByName : functionDefinitions.values()) {
			for (ExternalFunctionDefinition function : functionsByName) {
				ExternalFunctionReference ref = CtdlFactory.eINSTANCE.createExternalFunctionReference();
				ref.setFunc(function);
				ref.setName(function.getName());
				resource.getContents().add(ref);
				addedOn.add(EObjectDescription.create(QualifiedName.create(getSignatureForFunctionDefinition(function)), ref));
			}
		}
	}
	
	private String getSignatureForFunctionDefinition(ExternalFunctionDefinition def)
	{
		StringBuilder sb = new StringBuilder();
		sb.append(def.getName());
		sb.append("(");
		EList<FunctionArgument> args = def.getFunctionArguments();
		int paramCount = args.size();
		for (int idx=0; idx<args.size(); idx++) {
			sb.append(CTDLUtils.getNormalizedTypeNameForClass(args.get(idx).getType()));
			if (idx < paramCount-1) {
				sb.append(",");
			}
		}
		sb.append(")");
		return sb.toString();		
	}
	
	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		return addedOn;
	}

	@Override
	protected Iterable<IEObjectDescription> getLocalElementsByEObject(
			EObject object, URI uri) {
		return super.getLocalElementsByEObject(object, uri);
	}
	
	@Override
	public IEObjectDescription getSingleElement(EObject object) {
		return super.getSingleElement(object);
	}

	@Override
	public IEObjectDescription getSingleElement(QualifiedName name) {
		IEObjectDescription element = null;
		for (QualifiedName candidate : getSearchCandidates(name)) {
			element = super.getSingleElement(candidate);
			if (element != null) break;
		}
		
		return element;
	}
	
	private List<String> splitSignatureSegments(QualifiedName name) {
		String signature = name.getLastSegment();
		int p1 = signature.indexOf('(');
		int p2 = signature.indexOf(')');
		
		List<String> segments = new ArrayList<String>();
		if (p1 < 0 || p2 < 0) {
			segments.add(signature);
			return segments;
		}
		String functionName = signature.substring(0,p1);
		segments.add(functionName);
		
		String args = signature.substring(p1+1, p2).trim();
		if (!"".equals(args)) {
			segments.addAll(Arrays.asList(args.split(",")));
		}
		return segments;
	}
	
	private List<QualifiedName> getSearchCandidates(QualifiedName name) {
		List<QualifiedName> candidates = new LinkedList<QualifiedName>();
		candidates.add(name);
		// Split the function signature into multiple segments
		List<String> segments = splitSignatureSegments(name);
		String functionName = segments.get(0);
		if (segments.size() > 1) {
			// Determine if alternate types exist for a given arg type
			List<Set<String>> segmentCandidates = new ArrayList<Set<String>>();
			for (int idx=1; idx<segments.size(); idx++) {
				String type = segments.get(idx);
				Set<String> alts = alternateTypes.get(type);
				if (alts != null) {
					segmentCandidates.add(alts);
				} else {
					segmentCandidates.add(Sets.newHashSet(type));
				}
			}
			
			// Calculate the Cartesian product resulting in all possible combinations for the candidate types
			Set<List<String>> combinations = Sets.cartesianProduct(segmentCandidates);
			for (List<String> combo : combinations) {
				StringBuilder sb = new StringBuilder();
				sb.append(functionName);
				sb.append("(");
				boolean first = true;
				for (String arg0 : combo) {
					if (!first) {
						sb.append(",");
					}
					sb.append(arg0);
				}
				sb.append(")");
				QualifiedName candidate = QualifiedName.create(sb.toString());
				candidates.add(candidate);
			}
		}
		return candidates;
	}
	 
	private static final Map<String,Set<String>> alternateTypes = new HashMap<String,Set<String>>();
	static {
		alternateTypes.put("compartment", Sets.newHashSet(new String[] {"compartment","number"}));
	}
	
	
//	private Collection<IEObjectDescription> addToIterable(final Iterable<IEObjectDescription> list, final Collection<IEObjectDescription> toAdd) {
//		
//		Collection<IEObjectDescription> retVal = null;
//		if (list instanceof Collection) {
//			retVal = (Collection<IEObjectDescription>)list;
//		} else {
//			retVal = new ArrayList<IEObjectDescription>();
//			for (IEObjectDescription desc : list) {
//				retVal.add(desc);
//			}
//		}
//
//		retVal.addAll(toAdd);
//		return retVal;
//	}
//
//	@Override
//	public Iterable<IEObjectDescription> getAllElements() {
//		return addToIterable(super.getAllElements(), addedOn);
//	}
//
//	@Override
//	public Iterable<IEObjectDescription> getElements(EObject object) {
//		List<IEObjectDescription> toAdd = new ArrayList<IEObjectDescription>();
//		for (IEObjectDescription obj : addedOn) {
//			if (obj.getEObjectOrProxy() != null && obj.getEObjectOrProxy().equals(object)) {
//				toAdd.add(obj);
//			}
//		}
//		return addToIterable(super.getElements(object), toAdd);
//	}
//
//	@Override
//	public Iterable<IEObjectDescription> getElements(QualifiedName name) {
//		List<IEObjectDescription> toAdd = new ArrayList<IEObjectDescription>();
//		for (IEObjectDescription obj : addedOn) {
//			if (obj.getQualifiedName() != null && obj.getQualifiedName().equals(name)) {
//				toAdd.add(obj);
//			}
//		}
//		
//		return addToIterable(super.getElements(name), toAdd);
//	}
//


	


}
