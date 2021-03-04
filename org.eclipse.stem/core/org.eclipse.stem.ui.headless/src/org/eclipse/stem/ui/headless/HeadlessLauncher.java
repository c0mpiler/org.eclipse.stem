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
package org.eclipse.stem.ui.headless;

import java.io.OutputStream;
import java.io.PrintStream;

import org.eclipse.core.runtime.Platform;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.stem.jobs.DisplaySafeExecutor;
import org.eclipse.stem.ui.launcher.Launcher;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleListener;


/**
 * Launcher that starts STEM in a non-GUI "headless" mode.  The purpose
 * of this class is to enable command line execution of specific 
 * STEM operations, such as running individual simulations and experiments.
 *
 */
public class HeadlessLauncher extends Launcher
{
	private static final String DISTRIBUTED_CONTROLLER_PLUGIN_NAME = "org.eclipse.stem.graphsynchronizer";
	
	private Boolean workspacePluginsLoadSuccess = Boolean.valueOf(false);
	
	BundleListener workspaceLoadBundleListener = new BundleListener() {
		public void bundleChanged(BundleEvent event) {
			if (event.getType() == BundleEvent.STARTED && event.getBundle().getLocation().contains("org.eclipse.stem.model.common")) { 
				workspacePluginsLoadSuccess = Boolean.TRUE;
				// System.out.println("received event BundleEvent.STARTED= " + event.getType());
			}
		}
	};
	
	
	/**
	 * STEM Launcher for headless mode.
	 * @param ctx Eclipse Application Context
	 * @param args Command line arguments
	 */
	public HeadlessLauncher()
	{
		super();
	}
	
	/**
	 * Checks for the presence of the -distributed command line option
	 * and enables distributed STEM by issue a transient start to the
	 * implementing OSGi bundle.
	 */
	protected void checkDistributed()
	{
		if (args.containsKey("distributed")) {
			try {
				System.out.println("Enabling STEM distributed mode.");
				Bundle distBundle = Platform.getBundle(DISTRIBUTED_CONTROLLER_PLUGIN_NAME);
				if (distBundle != null) {
					distBundle.start(Bundle.START_TRANSIENT);
				} else {
					System.err.println("Distributed STEM plugin not found.  Distributed mode not enabled.");
				}
			} catch (Exception e) {
				System.err.println("Error launching distributed STEM plugin.  Will continue in standalone.");
				e.printStackTrace(System.err);
			}
		}
	}
	
	/**
	 * Sets the correct System streams based on command line options
	 */
	protected void setStreams()
	{
		if (args.containsKey("quiet")) {
			System.setOut(new PrintStream(new NullOutputStream()));
		}
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.stem.core.launcher.Launcher#launch()
	 */
	public Object launch()
	{	
		// Tell the display executor to use non-UI execution controls
		DisplaySafeExecutor.forceHeadless();
		
		// model generator's bundle loader activator 
		org.eclipse.stem.model.common.Activator plugin = null;
		
		if (args.containsKey("loadWorkspacePlugins")) {
			
			// Set up a bundle listener
			Activator.getContext().addBundleListener(workspaceLoadBundleListener);
			
			System.out.println("Loading workspace plugins");
			// Touch the model generator's bundle loader activator to force workspace bundles to load
			plugin = org.eclipse.stem.model.common.Activator.getPlugin();
			
			if (plugin != null) {
						
				// wait at most 30 seconds for the bundle to load
				try {
					for (int i = 0; i < 60; i++) {
						if (workspacePluginsLoadSuccess.booleanValue()) {
							System.out.println("**** success loading plugin after attempts = " + i);
							break;
						}
						Thread.sleep(500);
					}
				} catch (InterruptedException ie) {
					// nothing
				}

				if (!workspacePluginsLoadSuccess.booleanValue()) {
					System.out.println("Loading workspace plugins: Warning plugin not loaded. Possible Race Condition");
				} else {
					System.out.println("Loading workspace plugins SUCCESS");
				}
			} // if plugin not null
			Activator.getContext().removeBundleListener(workspaceLoadBundleListener);
			workspaceLoadBundleListener = null;
			
			// context.applicationRunning() should be called once the application is completely initialized and running.
			// This method will perform certain operations that are needed once an application is running.  
			// One example is bringing down a splash screen if it exists.
			context.applicationRunning();
			

		} //loadWorkspacePlugins
		
		
		
		setStreams();

		try {
			// Check for and enable distributed mode if requested
			checkDistributed();
			
			// Check if we should enable the simulation logger
			boolean log = args.containsKey("log");
			String logDir = null;
			if (log && args.get("log").size() > 0) {
				logDir = args.get("log").get(0);
			}
			
			// Collect scenarios to simulate and run
			HeadlessSimulationRunner runner = new HeadlessSimulationRunner(log, logDir);
			runner.run(args);
		
			return IApplication.EXIT_OK;
		} finally {
			//display.dispose();
		}
		
		
	}
	
	/**
	 * SWT Display synchronizer to fix issues with using Display.syncExec
	 * and Display.asyncExec when no UI is present.  Highly non-kosher.
	 *
	 */
//	private class HeadlessDisplaySynchronizer extends Synchronizer
//	{
//		public HeadlessDisplaySynchronizer(Display d)
//		{
//			super(d);
//		}
//		
//		/* (non-Javadoc)
//		 * @see org.eclipse.swt.widgets.Synchronizer#asyncExec(java.lang.Runnable)
//		 */
//		protected void asyncExec(final Runnable runnable) 
//		{
//			// For asynchronous execution, schedule and run
//			// an asynchronous job to execute the runnable instance.
//			if (runnable != null) {
//				new Job(runnable.toString()) {		
//					protected IStatus run(IProgressMonitor monitor) {
//						runnable.run();
//						return Status.OK_STATUS;
//					}
//				}.schedule();
//			}
//		}
//
//		/* (non-Javadoc)
//		 * @see org.eclipse.swt.widgets.Synchronizer#syncExec(java.lang.Runnable)
//		 */
//		protected void syncExec(final Runnable runnable) 
//		{
//			// For synchronous execution, just call the 
//			// runnable instance directly.  Should block
//			// on execution to complete.
//			if (runnable != null) {
//				runnable.run();
//			}
//		}
//		
//	}
	
	/**
	 * Null output stream for ignoring all output
	 */
	private class NullOutputStream extends OutputStream
	{
		NullOutputStream() {}
		public void close() {}
		public void flush() {}
		public void write( byte[] b, int off, int len) {}
		public void write(byte[] b) {}
		public void write(int b) {}
	}
}
