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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.stem.model.codegen.GeneratorUtils;
import org.eclipse.stem.model.codegen.STEMGenFeature;
import org.eclipse.stem.model.metamodel.Compartment;
import org.eclipse.stem.model.metamodel.Transition;

public class ExpressionMethodDefinition 
{
	private final Transition transition;
	private final String methodBody;
	private STEMGenFeature sourceFeature, targetFeature;
	private List<STEMGenFeature> incidenceFeatures;
	
	public ExpressionMethodDefinition(Transition transition, String methodBody)
	{
		this.transition = transition;
		this.methodBody = methodBody;
	}
	
	public String getTransitionName()
	{
		return GeneratorUtils.getTransitionPrettyName(transition);
	}
	
	public Transition getTransition()
	{
		return transition;
	}
	
	public String getMethodBody()
	{
		return methodBody;
	}
	
	public String getMethodName()
	{
		return transition.getSource().getName() + "_" + transition.getTarget().getName();
	}
	
	public void setSourceFeature(STEMGenFeature feature) {
		this.sourceFeature = feature;
	}
	
	public void setTargetFeature(STEMGenFeature feature) {
		this.targetFeature = feature;
	}
	
	public void setForIncidenceFeatures(List<STEMGenFeature> features) {
		this.incidenceFeatures = features;
	}
	
	public STEMGenFeature getSourceFeature()
	{
		return sourceFeature;
	}
	
	public STEMGenFeature getTargetFeature()
	{
		return targetFeature;
	}
	
	public List<STEMGenFeature> getForIncidenceFeatures()
	{
		return incidenceFeatures;
	}
	
	public String getSourceAccessorName()
	{
		return GeneratorUtils.formatToUpperCaseWordsNoSpaces(transition.getSource().getName());
	}
	
	public String getTargetAccessorName()
	{
		return GeneratorUtils.formatToUpperCaseWordsNoSpaces(transition.getTarget().getName());
	}

	public List<String> getIncidenceCompartments()
	{
		List<String> incidences = new ArrayList<String>();
		if (transition.getForIncidence() != null) {
			for (Compartment incidence : transition.getForIncidence()) {
				incidences.add(GeneratorUtils.formatToUpperCaseWordsNoSpaces(
						incidence.getName()));
			}
		}
		return incidences;
	}
	
}
