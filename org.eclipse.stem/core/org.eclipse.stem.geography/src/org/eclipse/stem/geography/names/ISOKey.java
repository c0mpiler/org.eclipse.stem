// ISOKey.java
package org.eclipse.stem.geography.names;

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
 * This class represents an ISO-3166-1 alpha3 or alpha2 country key (or
 * combination).
 */
public class ISOKey implements Comparable<ISOKey> {
	/**
	 * This is the ISO key used to represent The Earth
	 */
	public static final ISOKey EARTH = new ISOKey("ZZZ"); //$NON-NLS-1$

	private String key = null;

	/**
	 * @param key
	 *            the key
	 */
	public ISOKey(final String key) {
		this.key = key.trim();
	}

	/**
	 * @return the key
	 */
	public final String getKey() {
		return key;
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return key.hashCode();
	}

	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final ISOKey other = (ISOKey) obj;
		if (key == null) {
			if (other.key != null) {
				return false;
			}
		} else if (!key.equals(other.key)) {
			return false;
		}
		return true;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return key;
	}

	/**
	 * @param isoKey
	 *            the key to compare to
	 * @return the value of string compareTo
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(final ISOKey isoKey) {
		return this.key.compareTo(isoKey.key);
	}

} // ISOKey
