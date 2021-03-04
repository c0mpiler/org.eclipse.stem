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
package org.eclipse.stem.ui.launcher;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.stem.core.common.presentation.CoreEditorAdvisor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.WorkbenchAdvisor;

/**
 * Standard STEM Workbench launcher.  This launches the full
 * STEM user interface and workbench, including RCP application.
 *
 */
public class WorkbenchLauncher extends Launcher
{
	/**
	 * Default constructor for workbench launcher
	 */
	public WorkbenchLauncher()
	{
		super();
	}
	
	
	private static final Integer EXIT_RELAUNCH = Integer.valueOf(24);
	
	private static final String PROP_EXIT_CODE = "eclipse.exitcode"; //$NON-NLS-1$
	
	/* (non-Javadoc)
	 * @see org.eclipse.stem.core.launcher.Launcher#launch()
	 */
	public Object launch()
	{
		WorkbenchAdvisor workbenchAdvisor = new CoreEditorAdvisor();
		Display display = PlatformUI.createDisplay();
		try {
			int returnCode = PlatformUI.createAndRunWorkbench(display, workbenchAdvisor);
			if (returnCode == PlatformUI.RETURN_RESTART) {
				
				// if the exit code property has been set to the relaunch code, then
				// return that code now, otherwise this is a normal restart
				// Note: this snippet taken from the Eclipse IDE Workbench launcher
				return EXIT_RELAUNCH.equals(Integer.getInteger(PROP_EXIT_CODE)) ? EXIT_RELAUNCH
						                    : IApplication.EXIT_RESTART;
			}

			return IApplication.EXIT_OK;
		} finally {
			display.dispose();
		}
	}
	
	

	
}
