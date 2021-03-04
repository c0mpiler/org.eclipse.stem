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
package org.eclipse.stem.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.stem.loggers.SimulationLogger;
import org.eclipse.ui.handlers.HandlerUtil;

public class LoggerCommandHandler {

	private static SimulationLogger getSelection(ExecutionEvent executionEvent)
			throws ExecutionException {
		final ISelection selection = HandlerUtil
				.getCurrentSelectionChecked(executionEvent);

		if (selection instanceof StructuredSelection) {
			StructuredSelection selection2 = (StructuredSelection) selection;
			Object selected = selection2.getFirstElement();
			if (selected instanceof SimulationLogger) {
				return (SimulationLogger) selected;
			}

		}
		return null;
	}
	
	
	private static void setLoggerState(final ExecutionEvent executionEvent, boolean enabled) throws ExecutionException
	{
		SimulationLogger logger = getSelection(executionEvent);
		if (logger != null) {
			logger.setEnabled(enabled);
		}
	}

	public static class EnableLoggerCommandHandler extends AbstractHandler implements IHandler 
	{
		/**
		 * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
		 */
		public Object execute(final ExecutionEvent executionEvent) throws ExecutionException {
			setLoggerState(executionEvent,true);
			return null;
		} // execute
	}

	public static class DisableLoggerCommandHandler extends AbstractHandler implements IHandler 
	{
		/**
		 * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
		 */
		public Object execute(final ExecutionEvent executionEvent) throws ExecutionException {
			setLoggerState(executionEvent,false);
			return null;
		} // execute

	}
}
