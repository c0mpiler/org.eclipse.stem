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
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.stem.model.ctdl.CTDLUtils;
import org.eclipse.stem.model.ctdl.ContextSensitiveResourceWrapper;
import org.eclipse.stem.model.ctdl.ctdl.Block;
import org.eclipse.stem.model.ctdl.ctdl.CompartmentReference;
import org.eclipse.stem.model.ctdl.ctdl.CompartmentTransitionDefinitions;
import org.eclipse.stem.model.ctdl.ctdl.CtdlFactory;
import org.eclipse.stem.model.ctdl.ctdl.DefStatement;
import org.eclipse.stem.model.ctdl.ctdl.DefStatementReference;
import org.eclipse.stem.model.ctdl.ctdl.GlobalVariableReference;
import org.eclipse.stem.model.ctdl.ctdl.MetamodelResource;
import org.eclipse.stem.model.ctdl.ctdl.ModelParamReference;
import org.eclipse.stem.model.ctdl.ctdl.TransitionBlock;
import org.eclipse.stem.model.metamodel.Compartment;
import org.eclipse.stem.model.metamodel.Model;
import org.eclipse.stem.model.metamodel.ModelParam;
import org.eclipse.stem.model.metamodel.Transition;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.FilteringScope;
import org.eclipse.xtext.scoping.impl.MultimapBasedScope;

import com.google.common.base.Predicate;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class CTDLScopeProvider extends AbstractDeclarativeScopeProvider {

	
//	private Package metamodel;
	private Model model;
	//private Transition transition;
	
	public void setTransition(Transition transition)
	{
		//this.transition = transition;
		
		if (transition != null) {
			model = transition.getContainerModel();
		} else {
			model = null;
		}
		
//		if (model != null) {
//			metamodel = model.getContainerPackage();
//		} else {
//			metamodel = null;
//		}
	}
	
	
	@Override
	public IScope getScope(final EObject context, final EReference reference) {
		IScope scope = super.getScope(context, reference);
		return scope;
		
	}
	
	
	IScope scope_ScopedVariableReference(final Block context, final EReference reference)
	{		
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.createResource(URI.createURI("empty.sctd"));

		List<IEObjectDescription> objs = new ArrayList<IEObjectDescription>();
		
		for (DefStatement s : context.getStatements()) {
			DefStatementReference ref = CtdlFactory.eINSTANCE.createDefStatementReference();
			ref.setName(s.getVarname());
			ref.setObj(s);
			objs.add(new EObjectDescription(QualifiedName.create(s.getVarname()), ref, Collections.<String,String>emptyMap()));
			resource.getContents().add(ref);
		}
		
		for (Map.Entry<String, Class<?>> param : CTDLUtils.getGlobalUserVariables().entrySet()) {
			GlobalVariableReference ref = CtdlFactory.eINSTANCE.createGlobalVariableReference();
			ref.setName(param.getKey());
			objs.add(new EObjectDescription(QualifiedName.create(param.getKey()), ref, Collections.<String,String>emptyMap()));
			resource.getContents().add(ref);
		}
		
		Model model = getModelForContext(context);
		if (model == null) {
			model = this.model;
		}
		
		if (model != null) {
			for (ModelParam param : CTDLUtils.getAllParametersForModel(model)) {
				ModelParamReference ref = CtdlFactory.eINSTANCE.createModelParamReference();
				ref.setObj(param);
				ref.setName(param.getName());
				objs.add(new EObjectDescription(QualifiedName.create(param.getName()), ref, Collections.<String,String>emptyMap()));
				resource.getContents().add(ref);
			}
			
			for (Compartment compartment : CTDLUtils.getAllCompartmentsForModel(model)) {
				CompartmentReference rcvRef = CtdlFactory.eINSTANCE.createRelativeCompartmentValueReference();
				rcvRef.setObj(compartment);
				rcvRef.setName(CTDLUtils.lcfirst(compartment.getName()));
				objs.add(new EObjectDescription(QualifiedName.create(rcvRef.getName()), rcvRef, Collections.<String,String>emptyMap()));
				resource.getContents().add(rcvRef);
				
				CompartmentReference avcRef = CtdlFactory.eINSTANCE.createAbsoluteCompartmentValueReference();
				avcRef.setObj(compartment);
				avcRef.setName(CTDLUtils.ucfirst(compartment.getName()));
				objs.add(new EObjectDescription(QualifiedName.create(avcRef.getName()), avcRef, Collections.<String,String>emptyMap()));
				resource.getContents().add(avcRef);
			}
		}
		
		
		
		//System.out.println(context.getClass() +"/"+ reference);
		
		return new FilteringScope(MultimapBasedScope.createScope(getDelegate().getScope(context, reference), objs, false),
				new Predicate<IEObjectDescription>() {
			public boolean apply(IEObjectDescription input) {
				return true;
			};
		});
	}
	
	IScope scope_FunctionReference(final Block context, final EReference reference) {
		
		IScope parent = getDelegate().getScope(context, reference);
		return new ExtensionAwareScope(parent, context);
//		return new FilteringScope(,
//				new Predicate<IEObjectDescription>() {
//			public boolean apply(IEObjectDescription input) {
//				return input!=null && input.getName()!=null && input.getName().getSegmentCount()==1;
//			};
//		});
	}
	
	private Model getModelForContext(EObject context) {
		EObject root = context;
		while (root.eContainer() != null) {
			root = root.eContainer();
		}
		
		CompartmentTransitionDefinitions def = null;
		if (root instanceof CompartmentTransitionDefinitions) {
			def = (CompartmentTransitionDefinitions)root;
		} else {
			TreeIterator<EObject> te = root.eAllContents();
			while (te.hasNext()) {
				EObject obj = te.next();
				if (obj instanceof CompartmentTransitionDefinitions) {
					return ((CompartmentTransitionDefinitions)obj).getMetamodel().getModel();
				}
			}
		}
		
		Model model = null;
		if (def != null && def.getMetamodel() != null) {
			model = def.getMetamodel().getModel();
		}
		if (model == null && context.eResource() instanceof ContextSensitiveResourceWrapper) {
			model = ((ContextSensitiveResourceWrapper)context.eResource()).getModel();
		}
		return model;
	}
	
	IScope scope_Transition(final TransitionBlock context, final EReference reference) 
	{
		Model model = ((CompartmentTransitionDefinitions)context.eContainer()).getMetamodel().getModel();
		
		List<IEObjectDescription> objs = new ArrayList<IEObjectDescription>();
		if (model != null) {
			for (Transition t : model.getTransitions()) {
				objs.add(new EObjectDescription(QualifiedName.create(t.getSource().getName() +"->"+ t.getTarget().getName()), t, Collections.<String,String>emptyMap()));
				
			}
		}
		return MultimapBasedScope.createScope(IScope.NULLSCOPE, objs, true);
	}
	
	/*IScope scope_Compartment(final Transition context, final EReference reference) {

		// TODO Evil. There has to be a better way.
		Model model = ((CompartmentTransitionDefinitions)((TransitionBlock)context.eContainer()).eContainer()).getMetamodel().getModel();
		
		List<IEObjectDescription> objs = new ArrayList<IEObjectDescription>();
		if (model != null) {
			for (Compartment c : STEMDSLUtils.getAllCompartmentsForModel(model)) {
				objs.add(new EObjectDescription(QualifiedName.create(c.getName()), c, Collections.<String,String>emptyMap()));
			}
		}
		
		return MultimapBasedScope.createScope(IScope.NULLSCOPE, objs, true);
		//return getScope(context,reference);
	}*/
		
	IScope scope_Package(final MetamodelResource context, final EReference reference) {
		
		//EObject obj = ((InternalEObject)MetamodelFactory.eINSTANCE.createPackage()).eSetProxyURI(uri);
		List<IEObjectDescription> objs = new ArrayList<IEObjectDescription>();

		return MultimapBasedScope.createScope(IScope.NULLSCOPE, objs, true);
	}
	
	
	IScope scope_Model(final MetamodelResource context, final EReference reference) {
		
		List<IEObjectDescription> objs = new ArrayList<IEObjectDescription>();
		
		if (context.getPackage() != null) {
			for (Model model : context.getPackage().getModels()) {
				objs.add(new EObjectDescription(QualifiedName.create(model.getName()), model, Collections.<String,String>emptyMap()));
			}
		}

		return MultimapBasedScope.createScope(IScope.NULLSCOPE, objs, true);
		
		//return getScope(context,reference);
	}
}
