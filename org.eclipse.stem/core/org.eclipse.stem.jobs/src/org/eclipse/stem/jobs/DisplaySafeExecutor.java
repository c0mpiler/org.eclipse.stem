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

package org.eclipse.stem.jobs;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.swt.widgets.Display;

/**
 * Provides methods to safely get the SWT Display 
 * instance and invoke UI synchronous/asynchronous tasks
 * against the display.  If display is null - for example, when 
 * running in a system where there is no supported windowing system,
 * such as headless - then uses an alternative method for synchronous 
 * and asynchronous execution.
 * 
 */
public class DisplaySafeExecutor 
{
	private static Display display = null;
	private static boolean displayInit = false;
	
	
	/**
	 * @return Whether the current thread is the SWT/UI thread
	 */
	public static boolean isRunningOnUIThread()
	{
		Display d = safeGetDefaultDisplay();
		return (d != null && d.getThread() == Thread.currentThread());	
	}
	
	/**
	 * If the current display has already been cached, 
	 * removes and disposes the display and forces the 
	 * system to use the non-UI executors.
	 */
	public synchronized static void forceHeadless()
	{
		if (display != null) {
			try {
				display.dispose();
			} catch (Throwable t) {
				// catch errors/exceptions and ignore
			}
		}
		display = null;
		displayInit = true;
	}
	
	/**
	 * Safely gets the default Display for this SWT instance, 
	 * catching all exceptions/errors thrown and checking for 
	 * disposal.  For a currently valid default display that has
	 * not been disposed, returns the instance of the default display.
	 * Otherwise, returns null;
	 * 
	 * @return The default SWT Display or null if no valid display exists
	 */
	public static Display safeGetDefaultDisplay()
	{
		return safeGetDefaultDisplay(false);
	}
	
	/**
	 * Same as {@link DisplaySafeExecutor#safeGetDefaultDisplay()} excepts 
	 * reinitializes the stored instance.  Can be used if the default display
	 * changes (is that possible?) or a display is disposed & recreated.
	 * 
	 * @param reinit Whether to update the stored static instance
	 * @return The default SWT Display or null if no valid display exists
	 */
	public synchronized static Display safeGetDefaultDisplay(boolean reinit)
	{
		if (reinit || (display == null && !displayInit)) {
			try {
				display = Display.getDefault();
			} catch (Throwable t) {
				// catch exception, ignore
			}
			
			displayInit = true;
		}
	
		if (display != null && display.isDisposed()) {
			display = null;
		}
		
		return display;
	}
	
	
	/**
	 * Runs a UI synchronous task (runnable) in the default Display UI thread or,
	 * if no valid display exists, runs as synchronous task against the
	 * current thread.
	 * 
	 * @see {@link Display#syncExec(Runnable)}
	 * @param runnable Runnable instance to invoke synchronously
	 */
	public static void executeSync(final Runnable runnable)
	{
		executeSync(runnable, false);
	}
	
	/**
	 * Runs a UI synchronous task (runnable) in the default Display UI thread or,
	 * if no valid display exists, runs as synchronous task against the
	 * current thread. If useHeadless is true, task is run in a headless-safe
	 * way in the current thread.
	 * 
	 * @see {@link Display#syncExec(Runnable)}
	 * @param runnable Runnable instance to invoke synchronously
	 * @param headlessSafe Runs the task in a headless-safe mode (does not use UI Thread)
	 */
	public static void executeSync(final Runnable runnable, final boolean headlessSafe)
	{
		if (runnable == null) {
			return;
		}
		
		Display d = null;
		if (!headlessSafe) {
			d = safeGetDefaultDisplay();
		}
		
		
		if (d != null) {
			d.syncExec(runnable);
		} else {
			try {
				runnable.run();
			} catch (Throwable t) {
				// nothing
			}
		}
	}
	
	
	
	/**
	 * Runs a UI asynchronous task (runnable) in the default Display UI thread or,
	 * if no valid display exists, runs as an asynchronous Eclipse job.
	 * 
	 * @see {@link Display#asyncExec(Runnable)}
	 * @see {@link Job}
	 * @param runnable Runnable instance to invoke synchronously
	 */
	public static void executeAsync(final Runnable runnable)
	{
		executeAsync(runnable, false);
	}
	
	
	/**
	 * Runs a UI asynchronous task (runnable) in the default Display UI thread or,
	 * if no valid display exists, runs as an asynchronous Eclipse job.  Second 
	 * parameter headlessSafe forces into headless mode (does not use UI thread).
	 * 
	 * @see {@link Display#asyncExec(Runnable)}
	 * @see {@link Job}
	 * @param runnable Runnable instance to invoke synchronously
	 * @param headlessSafe Runs the task in a headless-safe mode (does not use UI Thread)
	 */
	public static void executeAsync(final Runnable runnable, final boolean headlessSafe)
	{
		if (runnable == null) {
			return;
		}
		
		Display d = null;
		if (!headlessSafe) {
			d = safeGetDefaultDisplay();
		}
		
		if (d != null) {
			d.asyncExec(runnable);
		} else {
			new Job(runnable.toString()) {		
				protected IStatus run(IProgressMonitor monitor) {
					runnable.run();
					return Status.OK_STATUS;
				}
			}.schedule();
		}
	}
	
}
