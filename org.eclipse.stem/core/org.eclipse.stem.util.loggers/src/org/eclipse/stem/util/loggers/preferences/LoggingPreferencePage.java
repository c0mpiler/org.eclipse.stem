package org.eclipse.stem.util.loggers.preferences;

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

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * This class represents a preference page that is contributed to the
 * Preferences dialog. By sub-classing <samp>FieldEditorPreferencePage</samp>,
 * we can use the field support built into JFace that allows us to create a page
 * that is small and knows how to save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They are stored in the
 * preference store that belongs to the main plug-in class. That way,
 * preferences can be accessed directly via the preference store.
 */

public class LoggingPreferencePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {

	/**
	 * Default logging setting
	 */
	public static boolean DEFAULT_LOGGING_FLAG = false;
	
	/**
	 * The ID of the STEM Preference page.
	 */
	public static final String ID_LOGGING_PREFERENCE_PAGE = "org.eclipse.stem.ui.preferences.LoggingPreferencePage";

	/**
	 * Constructor
	 */
	public LoggingPreferencePage() {
		super(GRID);
		setPreferenceStore(org.eclipse.stem.util.loggers.Activator.getDefault().getPreferenceStore());
		setDescription(Messages.getString("LoggingPPage.Logging")); //$NON-NLS-1$
	} // STEMPreferencePage

	/**
	 * Creates the field editors. Field editors are abstractions of the common
	 * GUI blocks needed to manipulate various types of preferences. Each field
	 * editor knows how to save and restore itself.
	 */
	public void createFieldEditors() {
		final BooleanFieldEditor integerFieldEditor = new BooleanFieldEditor(
				PreferenceConstants.LOG_INTEGER_PREFERENCE,
				Messages.getString("LPageInteger"), getFieldEditorParent()); //$NON-NLS-1$

		addField(integerFieldEditor);
	} // createFieldEditors

	/**
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(@SuppressWarnings("unused")//$NON-NLS-1$
			IWorkbench workbench) {
		// Nothing
	} // init

} // STEMPreferencePage
