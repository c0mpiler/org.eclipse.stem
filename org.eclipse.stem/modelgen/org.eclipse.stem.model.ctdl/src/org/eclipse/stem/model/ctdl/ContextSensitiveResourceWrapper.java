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
package org.eclipse.stem.model.ctdl;

import org.eclipse.stem.model.metamodel.Model;
import org.eclipse.stem.model.metamodel.Transition;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;

public class ContextSensitiveResourceWrapper extends LazyLinkingResource
{
	protected Model model;
	protected Transition transition;
	
	public ContextSensitiveResourceWrapper()
	{
	}
	
	public Model getModel()
	{
		return model;
	}
	
	public Transition getTransition()
	{
		return transition;
	}
	
	
	public void setTransition(Transition transition)
	{
		this.transition = transition;
		
		if (transition != null) {
			model = transition.getContainerModel();
		} else {
			model = null;
		}
	}
	
	
}
