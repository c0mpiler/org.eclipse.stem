// STEMExecutionCommandHandler.java
package org.eclipse.stem.ui.handlers;

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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.IJobManager;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.stem.core.Utility;
import org.eclipse.stem.core.common.presentation.CoreEditorPlugin;
import org.eclipse.stem.core.scenario.ScenarioInitializationException;
import org.eclipse.stem.jobs.execution.IExecutable;
import org.eclipse.stem.ui.Activator;
import org.eclipse.stem.ui.perspectives.Simulation;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.progress.IProgressService;

/**
 * This class is the top-level {@link IHandler} for the STEM "execution" command
 * handlers that begin and control the execution of
 * {@link org.eclipse.stem.core.experiment.Experiment}s and
 * {@link org.eclipse.stem.core.scenario.Scenario}s.
 * 
 * @see org.eclipse.stem.jobs.batch.BatchManager
 * @see org.eclipse.stem.jobs.simulation.SimulationManager
 */
abstract public class STEMExecutionCommandHandler extends AbstractHandler
		implements IHandler {
	
	/**
	 * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	public Object execute(final ExecutionEvent executionEvent)
			throws ExecutionException {

		boolean switchPerspective = false;
		
		//String name = executionEvent.getApplicationContext().getClass().getSimpleName();
		
		final ISelection selection = HandlerUtil
				.getCurrentSelectionChecked(executionEvent);
		
		boolean useSimulationPerspective = true;

		// Structured Selection?
		if (selection instanceof StructuredSelection) {
			// Yes
			// Iterate through everything that's in the selection and put each
			// object into the appropriate collection.
			for (final Object obj : ((StructuredSelection) selection).toList()) {
				// IExecutable executable = (IExecutable) ExecutableAdapterFactory.INSTANCE
				// .adapt(obj, IExecutable.class);
				IExecutable executable = (IExecutable) Platform
						.getAdapterManager().getAdapter(obj, IExecutable.class); 
				
				// Only switch to the Simulation Persepctive when the executable is a standard
				// run (scenario). For other executables we may want to stay in other special
				// perspectives
				if(executable instanceof Adapter) {
					Adapter a = (Adapter) executable;
					Object aObj = a.getTarget();
					if( aObj instanceof org.eclipse.stem.core.scenario.impl.ScenarioImpl ) {
						switchPerspective = true;
					} else {
						switchPerspective = false;
					}
				} // if adapter (usually true)
				
				// Were we successful in adapting?
				if (executable != null) {
					
					// Wait until any build job is complete
					
					waitOnBuildComplete();
					
					// Yes
					doit(executable);
				} // if
				else {
					// Internal error
					Activator.logError(
							"STEM Internal error execution command applied to \"" //$NON-NLS-1$
									+ obj.getClass().getName() + "\"", null); //$NON-NLS-1$
				}
			} // for each selection
		} // if StructuredSelection

		// Flip to Simulation Perspective?
		if (switchPerspective) {
			// Yes
			if(useSimulationPerspective) {
				Activator.switchToPerspective(Simulation.ID_STEM_SIMULATION_PERSPECTIVE);
			}else {
				// Nothing
				// Just don't switch Perspectives
				// so if running, e.g., in the automated experiment perspective just stay there
			}
			
		} // if flip

		return null;
	} // execute

	/**
	 * Wait for build to finish (blocks)
	 */
	private void waitOnBuildComplete() {
		final IJobManager jobManager = Job.getJobManager();
		IWorkbench workbench = PlatformUI.getWorkbench();
		IProgressService progressService = workbench.getProgressService();
				
		if (jobManager.find(ResourcesPlugin.FAMILY_AUTO_BUILD).length > 0 || jobManager.find(ResourcesPlugin.FAMILY_MANUAL_BUILD).length >0) {
			// Wait (with progress indication if needed)
				
			final IRunnableWithProgress runnable = new IRunnableWithProgress() {	
				public void run(IProgressMonitor monitor) throws InvocationTargetException {
			        SubMonitor subMonitor = SubMonitor.convert(monitor, Messages.STEMExecutionCommandHandler_2, 100);


					try {
						jobManager.join(ResourcesPlugin.FAMILY_MANUAL_BUILD, subMonitor.split(1));
						jobManager.join(ResourcesPlugin.FAMILY_AUTO_BUILD, subMonitor.split(1));
					}
					catch (InterruptedException e) {/* continue*/}
					
					// if (monitor.isCanceled()) // Todo						
				}
			};
			try {
				progressService.busyCursorWhile(runnable);
			}
			catch (InterruptedException e) {}
			catch (InvocationTargetException e2) {
				CoreEditorPlugin.INSTANCE.log(e2);
			}
		}
	}

	/**
	 * This method is implemented by subclasses to invoke the specific method of
	 * the {@link IExecutable} that implements their command for the
	 * {@link IExecutable}.
	 * 
	 * @param executable
	 *            the {@link IExecutable}
	 */
	abstract protected void doit(IExecutable executable);

	/**
	 * This class is a {@link STEMExecutionCommandHandler} that invokes
	 * {@link IExecutable#run()}.
	 */
	public static class RunCommandHandler extends STEMExecutionCommandHandler {

		/**
		 * @see org.eclipse.stem.ui.handlers.STEMExecutionCommandHandler#doit(org.eclipse.stem.jobs.execution.IExecutable)
		 */
		@Override
		protected void doit(IExecutable executable) {
			executable.run();
		}
	} // RunCommandHandler

	/**
	 * This class is a {@link STEMExecutionCommandHandler} that invokes
	 * {@link IExecutable#pause()}.
	 */
	public static class PauseCommandHandler extends STEMExecutionCommandHandler {

		/**
		 * @see org.eclipse.stem.ui.handlers.STEMExecutionCommandHandler#doit(org.eclipse.stem.jobs.execution.IExecutable)
		 */
		@Override
		protected void doit(IExecutable executable) {
			executable.pause();
		}
	} // PauseCommandHandler

	/**
	 * This class is a {@link STEMExecutionCommandHandler} that invokes
	 * {@link IExecutable#step()}.
	 */
	public static class StepCommandHandler extends STEMExecutionCommandHandler {

		/**
		 * @see org.eclipse.stem.ui.handlers.STEMExecutionCommandHandler#doit(org.eclipse.stem.jobs.execution.IExecutable)
		 */
		@Override
		protected void doit(IExecutable executable) {
			executable.step();
		}
	} // StepCommandHandler

	/**
	 * This class is a {@link STEMExecutionCommandHandler} that invokes
	 * {@link IExecutable#reset()}.
	 */
	public static class ResetCommandHandler extends STEMExecutionCommandHandler {

		/**
		 * @see org.eclipse.stem.ui.handlers.STEMExecutionCommandHandler#doit(org.eclipse.stem.jobs.execution.IExecutable)
		 */
		@Override
		protected void doit(IExecutable executable) {
			try {
				executable.reset();
			} catch(ScenarioInitializationException sie) {
				Utility.handleException(sie.getErrorMessage(), true, sie);
			}
		}
	} // ResetCommandHandler

	/**
	 * This class is a {@link STEMExecutionCommandHandler} that invokes
	 * {@link IExecutable#stop()}.
	 */
	public static class StopCommandHandler extends STEMExecutionCommandHandler {

		/**
		 * @see org.eclipse.stem.ui.handlers.STEMExecutionCommandHandler#doit(org.eclipse.stem.jobs.execution.IExecutable)
		 */
		@Override
		protected void doit(IExecutable executable) {
			executable.stop();
		}
	} // StopCommandHandler

} // STEMExecutionCommandHandler
