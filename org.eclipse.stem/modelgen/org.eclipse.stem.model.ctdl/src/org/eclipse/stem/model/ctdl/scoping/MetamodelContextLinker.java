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

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.stem.model.ctdl.CTDLUtils;
import org.eclipse.stem.model.ctdl.ctdl.BooleanLiteral;
import org.eclipse.stem.model.ctdl.ctdl.CompartmentReference;
import org.eclipse.stem.model.ctdl.ctdl.CompartmentTransitionDefinitions;
import org.eclipse.stem.model.ctdl.ctdl.CtdlFactory;
import org.eclipse.stem.model.ctdl.ctdl.CtdlPackage;
import org.eclipse.stem.model.ctdl.ctdl.Expression;
import org.eclipse.stem.model.ctdl.ctdl.ExternalFunctionReference;
import org.eclipse.stem.model.ctdl.ctdl.FunctionCall;
import org.eclipse.stem.model.ctdl.ctdl.FunctionReference;
import org.eclipse.stem.model.ctdl.ctdl.GlobalVariableReference;
import org.eclipse.stem.model.ctdl.ctdl.LocalVariableReference;
import org.eclipse.stem.model.ctdl.ctdl.MetamodelResource;
import org.eclipse.stem.model.ctdl.ctdl.ModelParamReference;
import org.eclipse.stem.model.ctdl.ctdl.NumberLiteral;
import org.eclipse.stem.model.ctdl.ctdl.PrimaryExpression;
import org.eclipse.stem.model.ctdl.ctdl.ScopedVariableReference;
import org.eclipse.stem.model.ctdl.ctdl.StringLiteral;
import org.eclipse.stem.model.ctdl.ctdl.VariableReference;
import org.eclipse.stem.model.ctdl.functions.STEMDSLUtils;
import org.eclipse.stem.model.metamodel.Model;
import org.eclipse.stem.model.metamodel.Package;
import org.eclipse.stem.model.metamodel.Transition;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.nodemodel.INode;


public class MetamodelContextLinker extends DefaultLinkingService {
	
	private Package metamodel;
	private Model model;
	private Transition transition;
	
	public void setTransition(Transition transition)
	{
		this.transition = transition;
		
		if (transition != null) {
			model = transition.getContainerModel();
		} else {
			model = null;
		}
		
		if (model != null) {
			metamodel = model.getContainerPackage();
		} else {
			metamodel = null;
		}
	}
	
	
	@Override
	public List<EObject> getLinkedObjects(EObject context, EReference ref,
			INode node) throws IllegalNodeException {
		if (context instanceof CompartmentTransitionDefinitions && ref.getEReferenceType() == CtdlPackage.Literals.METAMODEL_RESOURCE) {
			
			MetamodelResource mmrs = CtdlFactory.eINSTANCE.createMetamodelResource();
			
			mmrs.setModel(model);
			mmrs.setPackage(metamodel);
			mmrs.setTransition(transition);
			
			return Collections.singletonList((EObject)mmrs);
			
//			if (ref.getEReferenceType() == MetamodelPackage.Literals.PACKAGE) {
//				if (metamodel != null) {
//					return Collections.singletonList((EObject)metamodel);
//				} else {
//					// if we're loading a metamodel package, skip scoping and load it directly
//					String path = getCrossRefNodeAsString(node);
//					
//					try { 
//						ResourceSet rs = new ResourceSetImpl();
//						Resource r = rs.createResource(URI.createURI(path));
//						r.load(Collections.emptyMap());
//						EcoreUtil.resolveAll(r);				
//						return Collections.singletonList(r.getContents().get(0));
//					} catch (IOException ioe) {
//						ioe.printStackTrace();
//					}
//				}
//			} else if (ref.getEReferenceType() == MetamodelPackage.Literals.MODEL
//					&& model != null) {
//				return Collections.singletonList((EObject)model);
//			} else if (ref.getEReferenceType() == MetamodelPackage.Literals.TRANSITION 
//					&& transition != null) {
//				return Collections.singletonList((EObject)transition);
//			}
		} 
			
		return super.getLinkedObjects(context, ref, node);

	}

	@Override
	public String getCrossRefNodeAsString(INode node) throws IllegalNodeException {
		String result = super.getCrossRefNodeAsString(node); 
		EObject element = node.getSemanticElement();
		if (element instanceof FunctionCall) {
			FunctionCall fc = (FunctionCall) element;
			
			StringBuilder sb = new StringBuilder(result);
			sb.append("(");
			boolean first = true;
			for(Expression expr : fc.getArgs()) {
				if (!first) {
					sb.append(",");
				}
				if (expr instanceof StringLiteral) {
					sb.append("string");
				} else if (expr instanceof BooleanLiteral) {
					sb.append("boolean");
				} else if (expr instanceof PrimaryExpression) {
					if (expr.getExp() instanceof VariableReference) {
						sb.append(getTypeForVariableReference((VariableReference)expr.getExp()));
					} else if (expr.getExp() instanceof NumberLiteral) {
						sb.append("number");
					}
				} else if (expr instanceof FunctionCall) {
					sb.append(getTypeForFunctionReference(((FunctionCall) expr).getRef()));
				} else {
					sb.append("number");
				}
				first = false;
			}
			sb.append(")");
			
			result = sb.toString();
		}
		return result;
	}
	
	private String getTypeForFunctionReference(FunctionReference var) {
		Class<?> refType = null;
		if (var instanceof ExternalFunctionReference) {
			refType = ((ExternalFunctionReference) var).getFunc().getReturnType();
		} else {
			refType = double.class;
		}
		return CTDLUtils.getNormalizedTypeNameForClass(refType);
	}
	
	private String getTypeForVariableReference(VariableReference var) {
		
		ScopedVariableReference ref = var.getRef();
		Class<?> refType = double.class;
		if (ref != null) {
			if (ref instanceof CompartmentReference) {
				return "compartment";
				//refType = ((CompartmentReference) ref).getObj().getDataType().getInstanceClass();
			} else if (ref instanceof ModelParamReference) {
				refType = ((ModelParamReference) ref).getObj().getDataType().getInstanceClass();
			} else if (ref instanceof LocalVariableReference) {
				// TODO handle non-double local vars
			} else if (ref instanceof GlobalVariableReference) {
				refType = STEMDSLUtils.getTypeForGlobalVariable(ref.getName());
			}
		}
		
		return CTDLUtils.getNormalizedTypeNameForClass(refType);
	}
}
