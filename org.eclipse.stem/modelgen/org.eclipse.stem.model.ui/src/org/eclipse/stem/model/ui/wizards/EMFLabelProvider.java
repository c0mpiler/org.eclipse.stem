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
package org.eclipse.stem.model.ui.wizards;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.stem.model.ui.Constants;

public class EMFLabelProvider extends LabelProvider
{
	@Override
	public String getText(Object element) {
		if (element instanceof Enumerator) {
			return ((Enumerator)element).getLiteral();
		}
		
		if (element instanceof EDataType) {
			return ((EDataType) element).getInstanceClassName();
		}
		
		return Constants.EMPTY_STRING;
	}
}
