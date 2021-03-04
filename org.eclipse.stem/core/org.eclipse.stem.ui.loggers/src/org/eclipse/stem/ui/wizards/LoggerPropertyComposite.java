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
package org.eclipse.stem.ui.wizards;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.stem.core.logger.Logger;
import org.eclipse.stem.ui.Activator;
import org.eclipse.stem.ui.adapters.loggerpropertyeditor.LoggerPropertyEditor;
import org.eclipse.stem.ui.adapters.loggerpropertyeditor.LoggerPropertyEditorAdapter;
import org.eclipse.stem.ui.adapters.loggerpropertyeditor.LoggerPropertyEditorAdapterFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * This class represents the editor screen of the new logger wizard
 */
public class LoggerPropertyComposite extends Composite {

	private Map<Logger, LoggerPropertyEditor> modelMap = new HashMap<Logger, LoggerPropertyEditor>();

	private StackLayout stackLayout = null;

	/**
	 * Create the composite
	 * 
	 * @param parent
	 * @param style
	 * @param projectValidator
	 */
	public LoggerPropertyComposite(final Composite parent,
			final int style, final Logger[] loggers,
			ModifyListener projectValidator, IProject project) {
		super(parent, style);
		stackLayout = new StackLayout();
		setLayout(stackLayout);

		Label label;
		label = new Label(this, SWT.NONE);
		label.setText(LoggerWizardMessages.getString("LPC.Label")); //$NON-NLS-1$
		LoggerPropertyEditor firstOne = null;
		// Any disease models?
		if (loggers != null) {
			// Yes
			for (int i = 0; i < loggers.length; i++) {

				LoggerPropertyEditorAdapter dmpea = (LoggerPropertyEditorAdapter) LoggerPropertyEditorAdapterFactory.INSTANCE
						.adapt(loggers[i],
								LoggerPropertyEditorAdapter.class);

				final LoggerPropertyEditor dmpe = dmpea
						.createLoggerPropertyEditor(this, SWT.NONE,
								projectValidator, project);

				modelMap.put(loggers[i], dmpe);
				if (firstOne == null) {
					// Yes
					firstOne = dmpe;
				} // if
			} // for i
		} // if any loggers?

		stackLayout.topControl = firstOne;
	} 

	void displayLogger(final Logger logger) {
		final LoggerPropertyEditor dmpe = modelMap.get(logger);
		// Did we find it?
		if (dmpe != null) {
			// Yes
			stackLayout.topControl = dmpe;
			layout();
		} // if
		else {
			Activator.logError(LoggerWizardMessages.getString("LPC.Error") //$NON-NLS-1$
					+ logger.getClass().getName() + "\"", null);  //$NON-NLS-1$
		}
	} 
	
	public void dispose() {
		super.dispose();
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents sub-classing of SWT components
	}

	/**
	 * @return <code>true</code> if the contents of the composite are valid,
	 *         <code>false</code> otherwise.
	 */
	public boolean validate() {
		return ((LoggerPropertyEditor) (stackLayout.topControl))
				.validate();
	} // validate

	/**
	 * @return
	 */
	public String getErrorMessage() {
		return ((LoggerPropertyEditor) (stackLayout.topControl))
				.getErrorMessage();
	}

	/**
	 * @param diseaseModel
	 */
	public void populateLogger(Logger logger) {
		((LoggerPropertyEditor) (stackLayout.topControl))
				.populate(logger);
	}

} 
