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

import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.stem.model.codegen.STEMGenFeature;
import org.eclipse.stem.model.ctdl.generator.CTDLGenerator;
import org.eclipse.stem.model.metamodel.Transition;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.resource.XtextResource;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ExpressionMethodGenerator 
{
	private Injector injector;
	
	private IGenerator generator;
	
	private GenClass modelGenClass;
	
	private GenClass labelValueGenClass;
	
	public ExpressionMethodGenerator(GenClass modelGenClass, GenClass labelValueGenClass)
	{
		this.modelGenClass = modelGenClass;
		this.labelValueGenClass = labelValueGenClass;
		init();
	}
	
	private void init()
	{
		injector = Guice.createInjector(new org.eclipse.stem.model.ctdl.CTDLRuntimeModule());
		generator = injector.getInstance(IGenerator.class);
	}
	
	private CTDLGenerator getExpressionMethodGenerator()
	{
		return (CTDLGenerator)generator;
	}

	public ExpressionMethodDefinition generateExpressionMethod(Transition transition, STEMGenFeature sourceFeature, STEMGenFeature targetFeature, List<STEMGenFeature> forIncidenceFeatures)
	{
		XtextResource r = XtextUtils.loadAndResolveXtextResourceForTransition(transition);
		if (r == null) {
			return null;
		}
		InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
		
		CTDLGenerator gen = getExpressionMethodGenerator();
		gen.setModelGenClass(modelGenClass);
		gen.setLabelValueGenClass(labelValueGenClass);
		
		try {
			gen.doGenerate(r, fsa);
		} catch (Throwable t0) {
			t0.printStackTrace();
		}
		
		ExpressionMethodDefinition definition = null;
		if (fsa.getTextFiles().size() > 0) {
			String methodBody = fsa.getTextFiles().values().iterator().next().toString();
			definition = new ExpressionMethodDefinition(transition, methodBody);
		}
		
		definition.setSourceFeature(sourceFeature);
		definition.setTargetFeature(targetFeature);
		definition.setForIncidenceFeatures(forIncidenceFeatures);
		
		return definition;
	}
}
