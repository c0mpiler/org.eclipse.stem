package org.eclipse.stem.fbd.model;


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

public class ConsumptionEvent {

	private int pos;
	private Food f;
	private String zip;
	
	public ConsumptionEvent(int pos, Food f, String zip){
		this.pos = pos;
		this.f = f;
		this.zip = zip;
	}
	
	public int getPos(){
		return this.pos;
	}
	
	public Food getFood(){
		return this.f;
	}
	
	public String getZip(){
		return this.zip;
	}
}
