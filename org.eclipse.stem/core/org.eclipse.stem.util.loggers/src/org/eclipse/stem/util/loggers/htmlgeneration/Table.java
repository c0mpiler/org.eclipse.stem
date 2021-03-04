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


public class Table extends HtmlElement {
	
	Tbody tbody = null;



	/**
	 * 
	 * @param attr
	 * @param val
	 */
	
	public Table(String attr, String val) {
		super("table",attr,val);
	}
	
	/**
	 * 
	 */
	
	public Table() {
		super("table");
	}

	/**
	 * 
	 * @return the tables body
	 */
	public Tbody getTbody() {
		return tbody;
	}

	/**
	 * 
	 * @param tbody
	 */
	public void setTbody(Tbody tbody) {
		this.tbody = tbody;
	}
}
