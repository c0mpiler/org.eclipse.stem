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
package org.eclipse.stem.ui.adapters.loggerpropertyeditor;

import org.eclipse.core.resources.IProject;
import org.eclipse.stem.core.logger.Logger;
import org.eclipse.stem.ui.editors.GenericPropertyEditor;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;

abstract public class LoggerPropertyEditor extends GenericPropertyEditor {


	public LoggerPropertyEditor(Composite parent, int style, IProject project) {
		super(parent,style, project);
	}

	/**
	 * Create the composite
	 * 
	 * @param parent
	 * @param style
	 * @param projectValidator
	 */
	public LoggerPropertyEditor(final Composite parent, final int style,
			final Logger logger,
			final ModifyListener projectValidator, final IProject project) {
		super(parent, style, logger, projectValidator, project);
	}
	
	public void populate(Logger logger) {
	}

	@Override
	public boolean validate() {
		// Nothing to validate in the base logger
		return true;
	} // validate


	
	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents sub-classing of SWT components
	}


}
