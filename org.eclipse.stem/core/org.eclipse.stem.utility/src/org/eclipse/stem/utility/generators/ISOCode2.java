package org.eclipse.stem.utility.generators;

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

/**
 * STEM II Data Migration/Generation Utilities : Instances of this class are
 * just a convenience container for ISO3166-2 data.
 * 
 */

public class ISOCode2 {

	/**
	 * The three data items describing our ISO3166-1 object.
	 * 
	 */
	private String alpha2 = null;

	private String id = null;

	private String name = null;

	private String index = null;

	/**
	 * Constructor
	 * 
	 * @param alpha2
	 * @param id
	 * @param name
	 * @param index
	 */
	public ISOCode2(String alpha2, String id, String name, String index) {
		this.alpha2 = alpha2;
		this.id = id;
		this.name = name.replace("-", " "); //$NON-NLS-1$ //$NON-NLS-2$
		this.index = index;
	}

	/**
	 * Get the alpha 2 code
	 * 
	 * @return the alpha 2 code
	 */
	public String getAlpha2() {
		return alpha2;
	}

	/**
	 * Get the id (if any) for this country
	 * 
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Get the name
	 * 
	 * @return the name
	 */
	public String getName() {
		return name.toUpperCase();
	}

	/**
	 * Get the relative position of this entity within the list of ISO codes
	 * 
	 * @return this code relative index
	 */
	public String getIndex() {
		return String.valueOf(index);
	}

	/**
	 * Clear the object
	 */
	public void clear() {
		this.alpha2 = null;
		this.id = null;
		this.name = null;
		this.index = null;
	}
}
