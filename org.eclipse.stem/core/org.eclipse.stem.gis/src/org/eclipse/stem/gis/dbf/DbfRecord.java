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
package org.eclipse.stem.gis.dbf;

import java.util.ArrayList;
import java.util.List;

public class DbfRecord
{
	protected boolean deletedFlag = false;
	protected List<Object> data = new ArrayList<Object>();

	public boolean isDeletedFlag() {
		return deletedFlag;
	}

	public List<Object> getData() {
		return data;
	}

	@Override
	public String toString() {
		final int maxLen = 20;
		return "DbfRecord [data="
				+ (data != null ? data.subList(0,
						Math.min(data.size(), maxLen)) : null) + "]";
	}
	
}