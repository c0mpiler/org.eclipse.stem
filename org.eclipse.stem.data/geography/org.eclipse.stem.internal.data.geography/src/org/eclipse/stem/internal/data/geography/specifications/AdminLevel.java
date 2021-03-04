package org.eclipse.stem.internal.data.geography.specifications;

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
 * This class represents an UN Administration Level.
 */
public class AdminLevel implements Comparable<AdminLevel> {

	/**
	 * Constant for administration level -1
	 */
	public static final AdminLevel LEVEL_M1 = new AdminLevel(-1);

	/**
	 * Constant for administration level 0
	 */
	public static final AdminLevel LEVEL_0 = new AdminLevel(0);

	private Integer level = Integer.valueOf(0);

	/**
	 * @param level
	 *            an administration level
	 */
	public AdminLevel(final int level) {
		this.level = Integer.valueOf(level);
	}

	/**
	 * @param adminLevelString
	 *            an administration level as a String (e.g., "0")
	 */
	public AdminLevel(final String adminLevelString) {
		this(Integer.parseInt(adminLevelString.trim()));
	}

	/**
	 * @return the int value of the level
	 */
	public int intValue() {
		return level.intValue();
	}

	/**
	 * @return the level
	 */
	public final Integer getLevel() {
		return level;
	}

	/**
	 * @param level
	 *            the level to set
	 */
	public final void setLevel(final Integer level) {
		this.level = level;
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return level.hashCode();
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
		final AdminLevel other = (AdminLevel) obj;
		if (level == null) {
			if (other.level != null) {
				return false;
			}
		} else if (!level.equals(other.level)) {
			return false;
		}
		return true;
	}

	/**
	 * @param level
	 *            the AdminLevel to compare to
	 * @return 0 if equal
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(final AdminLevel level) {
		return this.level.compareTo(level.getLevel());
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return level.toString();
	}

} // AdminLevel

