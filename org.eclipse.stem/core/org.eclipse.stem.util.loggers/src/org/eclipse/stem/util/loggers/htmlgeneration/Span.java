package org.eclipse.stem.util.loggers.htmlgeneration;

/*******************************************************************************
 * Copyright (c) 2011 IBM Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation and new features
 *     Bundesinstitut für Risikobewertung - Pajek Graph interface, new Veterinary Models
 *******************************************************************************/


public class Span extends HtmlElement {

	/**
	 * 
	 * @param attr
	 * @param val
	 */
	
	public Span(String attr, String val) {
		super("span",attr,val);
	}

}
