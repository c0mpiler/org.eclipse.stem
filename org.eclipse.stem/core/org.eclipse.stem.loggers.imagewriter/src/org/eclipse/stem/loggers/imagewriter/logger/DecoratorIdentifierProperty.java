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
package org.eclipse.stem.loggers.imagewriter.logger;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.ui.adapters.color.ColorProviderAdapter;

public class DecoratorIdentifierProperty {
	private Decorator decorator;
	private String identifier;
	private IItemPropertyDescriptor property;
	private ColorProviderAdapter colorProvider;
	
	
	public DecoratorIdentifierProperty(Decorator decorator, String identifier,
			IItemPropertyDescriptor property) {
		super();
		this.decorator = decorator;
		this.identifier = identifier;
		this.property = property;
	}


	public Decorator getDecorator() {
		return decorator;
	}


	public void setDecorator(Decorator decorator) {
		this.decorator = decorator;
	}


	public String getIdentifier() {
		return identifier;
	}


	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}


	public IItemPropertyDescriptor getProperty() {
		return property;
	}


	public void setProperty(IItemPropertyDescriptor property) {
		this.property = property;
	}


	public ColorProviderAdapter getColorProvider() {
		return colorProvider;
	}


	public void setColorProvider(ColorProviderAdapter colorProvider) {
		this.colorProvider = colorProvider;
	}


}