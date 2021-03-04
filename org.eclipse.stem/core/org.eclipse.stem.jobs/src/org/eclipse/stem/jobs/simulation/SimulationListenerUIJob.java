/*******************************************************************************
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *     IBM - Initial API and implementation
 *******************************************************************************/
package org.eclipse.stem.jobs.simulation;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.stem.jobs.Activator;
import org.eclipse.stem.jobs.DisplaySafeExecutor;
import org.eclipse.stem.jobs.execution.IBaseListener;
import org.eclipse.swt.widgets.Display;

/**
 * An Eclipse-managed Job to invoke a simulation listener for a simulation event 
 * for use with listeners that contain UI controls.  The simulation listener will 
 * be invoked on the UI thread.
 * 
 * Note:  The majority of this class is copied from {@link org.eclipse.ui.progress.UIJob}
 * 
 * @see {@link org.eclipse.ui.progress.UIJob}
 * @see {@link SimulationListenerJob}
 */
public class SimulationListenerUIJob extends SimulationListenerJob 
{

	private Display cachedDisplay;

	SimulationListenerUIJob(Simulation simulation, IBaseListener listener,
			SimulationState state, boolean synchronous) {
		super(simulation, listener, state, synchronous);
	}

	/**
	 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor)
	 *      Note: this message is marked final. Implementors should use
	 *      runInUIThread() instead.
	 */
	public final IStatus run(final IProgressMonitor monitor) {
		if (monitor.isCanceled()) {
			return Status.CANCEL_STATUS;
		}
		Display asyncDisplay = getDisplay();
		if (asyncDisplay == null || asyncDisplay.isDisposed()) {
			return Status.CANCEL_STATUS;
		}
		asyncDisplay.asyncExec(new Runnable() {
			public void run() {
				IStatus result = null;
				Throwable throwable = null;
				try {
					// As we are in the UI Thread we can
					// always know what to tell the job.
					setThread(Thread.currentThread());
					if (monitor.isCanceled()) {
						result = Status.CANCEL_STATUS;
					} else {
						result = runInUIThread(monitor);
					}

				} catch (Throwable t) {
					throwable = t;
				} finally {
					if (result == null) {
						result = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
								IStatus.ERROR,
								"An internal error has occurred", throwable);
					}
					done(result);
				}
			}
		});
		return Job.ASYNC_FINISH;
	}

	/**
	 * Run the job in the UI Thread.
	 * 
	 * @param monitor
	 * @return IStatus
	 */
	public IStatus runInUIThread(IProgressMonitor monitor) {
		return super.run(monitor);
	}

	/**
	 * Sets the display to execute the asyncExec in. Generally this is not' used
	 * if there is a valid display available via
	 * PlatformUI.isWorkbenchRunning().
	 * 
	 * @param runDisplay
	 *            Display
	 * @see UIJob#getDisplay()
	 * @see PlatformUI#isWorkbenchRunning()
	 */
	public void setDisplay(Display runDisplay) {
		Assert.isNotNull(runDisplay);
		cachedDisplay = runDisplay;
	}

	/**
	 * Returns the display for use by the receiver when running in an asyncExec.
	 * If it is not set then the display set in the workbench is used. If the
	 * display is null the job will not be run.
	 * 
	 * @return Display or <code>null</code>.
	 */
	public Display getDisplay() {
		// If it was not set get it from the workbench
		if (cachedDisplay == null) {
			cachedDisplay = DisplaySafeExecutor.safeGetDefaultDisplay();
		}
		return cachedDisplay;
	}

}
