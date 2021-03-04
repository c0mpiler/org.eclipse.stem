// Simulation.java
package org.eclipse.stem.jobs.simulation;

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

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeListener;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.stem.core.Constants;
import org.eclipse.stem.core.CorePlugin;
import org.eclipse.stem.core.graph.GraphPartitioner;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.scenario.Scenario;
import org.eclipse.stem.core.scenario.ScenarioInitializationException;
import org.eclipse.stem.core.scenario.impl.ScenarioImpl;
import org.eclipse.stem.core.scenario.provider.ScenarioItemProviderAdapterFactory;
import org.eclipse.stem.core.sequencer.Sequencer;
import org.eclipse.stem.core.solver.Solver;
import org.eclipse.stem.core.solver.SolverException;
import org.eclipse.stem.jobs.Activator;
import org.eclipse.stem.jobs.DisplaySafeExecutor;
import org.eclipse.stem.jobs.execution.Executable;
import org.eclipse.stem.jobs.execution.IBaseListener;
import org.eclipse.stem.jobs.preferences.PreferenceConstants;
import org.eclipse.stem.jobs.preferences.SimulationManagementPreferencePage;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * This class implements the main simulation logic of the STEM system. It runs
 * in the background as a separate {@link Job} in eclipse.
 */
public class Simulation extends Executable implements ISimulation,
		IPropertyChangeListener {

	public final String DEFAULT_SOLVER_CLASS = "org.eclipse.stem.solvers.fd.impl.FiniteDifferenceImpl";

	/**
	 * The collection of {@link ISimulationListener}'s waiting to be told about
	 * {@link Simulation}'s events.
	 */
	// I think this should really be a {@link CopyOnWriteArrayList} like {@link
	// #listenersSync}
	private final List<ISimulationListener> listeners = new CopyOnWriteArrayList<ISimulationListener>();
	/**
	 * The collection of {@link IBatchManagerListenerSync}'s waiting to be told
	 * about {@link BatchManagerEvent}'s
	 */
	private final List<ISimulationListenerSync> listenersSync = new CopyOnWriteArrayList<ISimulationListenerSync>();

	/**
	 * Jobs for async listeners that are invoked for a given state
	 */
	private Map<String, SimulationListenerJob> listenerJobs = new HashMap<String, SimulationListenerJob>();

	/**
	 * Jobs for sync listeners that are invoked for a given state
	 */
	private Map<String, SimulationListenerJob> listenerJobsSync = new HashMap<String, SimulationListenerJob>();

	/**
	 * If <code>true</code> then the {@link Simulation} will sleep for a
	 * specified time period at the end of each simulation cycle.
	 */
	public boolean simulationSleep = SimulationManagementPreferencePage.DEFAULT_SIMULATION_SLEEP;

	/**
	 * If {@link simulationSleep} is <code>true</code>, then this is the number
	 * of milliseconds at the end of each cycle that the {@link Simulation}
	 * should sleep.
	 */
	private int sleepMilliseconds = SimulationManagementPreferencePage.MIN_SIMULATION_SLEEP_MILLISECONDS;

	/**
	 * The current state of the {@link Simulation}.
	 */
	private SimulationState simulationState;

	/**
	 * This is the {@link Scenario} being simulated. It contains all of the
	 * {@link SimulationState} information.
	 */
	private Scenario scenario = null;

	private Adapter adapter = null;

	private GraphPartitioner partitioner;

	/**
	 * This flag controls the execution of the {@link Simulation}. If it is
	 * <code>false</code> the {@link Simulation} stops running (sleeps) on the
	 * next cycle.
	 * 
	 * @see #pause()
	 */
	private boolean keepRunning = true;

	/**
	 * This flag controls the state of the {@link Simulation}. If
	 * <code>true</code> then the {@link Simulation} is stopped if it is running
	 * and the {@link Scenario} is reset to its initial state. The
	 * {@link Simulation} does NOT resume running after the reset.
	 * 
	 * @see #resetSimulation()
	 */
	private boolean reset = false;

	/**
	 * This flag indicates that the {@link Simulation} should complete a single
	 * step (cycle) and then pause.
	 */
	private boolean stepping = false;

	/**
	 * If <code>true</code> then the {@link Simulation} is stopping
	 */
	private boolean stopping = false;

	ScenarioItemProviderAdapterFactory scenarioItemProviderAdapterFactory = new ScenarioItemProviderAdapterFactory();

	/**
	 * Constructor
	 * 
	 * @param title
	 *            the title of the {@link Simulation}.
	 * @param sequenceNumber
	 *            the sequence number of the {@link Simulation}
	 */
	public Simulation(final String title, final int sequenceNumber) {
		super(title == null ? "" : title, sequenceNumber); //$NON-NLS-1$
		simulationState = SimulationState.PAUSED;
	} // Simulation

	/**
	 * Constructor
	 * 
	 * @param scenario
	 *            the {@link Scenario} to simulate
	 * @param sequenceNumber
	 *            the sequence number of the {@link Simulation}
	 */
	public Simulation(final Scenario scenario, final int sequenceNumber,
			GraphPartitioner p) {
		this(scenario.produceTitle(), sequenceNumber);
		this.scenario = scenario;
		this.partitioner = p;
		setPreferences();

		Activator.getDefault().getPreferenceStore()
				.addPropertyChangeListener(this);
	} // Simulation

	/**
	 * Set the preferences.
	 * 
	 * @see #simulationSleep
	 * @see #sleepMilliseconds
	 */
	protected void setPreferences() {

		IPreferenceStore preferenceStore = Activator.getDefault()
				.getPreferenceStore();

		simulationSleep = preferenceStore
				.getBoolean(PreferenceConstants.SIMULATION_SLEEP_BOOLEAN);
		sleepMilliseconds = preferenceStore
				.getInt(PreferenceConstants.SIMULATION_SLEEP_MILLISECONDS_INTEGER);
		ScenarioImpl.reportEachUnresolvedIdentifiable = preferenceStore
				.getBoolean(PreferenceConstants.REPORT_EACH_UNRESOLVED_IDENTIFIABLE_BOOLEAN);
		ScenarioImpl.reportDanglingAirTransportEdges = preferenceStore
				.getBoolean(PreferenceConstants.REPORT_DANGLING_AIR_TRANPORT_EDGES_BOOLEAN);

		ScenarioImpl.reportNumberofUnresolvedIdentifiables = preferenceStore
				.getBoolean(PreferenceConstants.REPORT_NUMBER_OF_UNRESOLVED_IDENTIFIABLES_BOOLEAN);

	} // setPerferences

	/**
	 * @return the state of the {@link Simulation}
	 */
	public final SimulationState getSimulationState() {
		return simulationState;
	} // getSimulationState

	/**
	 * @param simulationState
	 *            the {@link SimulationState} to set
	 */
	private final void setSimulationState(final SimulationState simulationState) {
		this.simulationState = simulationState;

		// If this method is called on the UI thread, then schedule a job
		// to run off the UI thread. Prevents deadlock with sync UI listeners.
		if (DisplaySafeExecutor.isRunningOnUIThread()) {
			new SimulationStateChangeJob(simulationState).schedule();
		} else {
			// Otherwise, just fire the listeners on the current thread
			fireSimulationChanged(simulationState);
		}

	} // setSimulationState

	/**
	 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected IStatus run(final IProgressMonitor monitor) {
		IStatus retValue = Status.OK_STATUS;

		try {

			// This will notify listeners, e.g. logger will write the log
			// headers and a first row of data (initial state)
			setSimulationState(SimulationState.RUNNING);

			keepRunning = true;

			// Did we get a request to reset?
			if (reset) {
				// Yes
				scenario.reset();
				reset = false;
			}

			assert scenario.sane();

			monitor.beginTask(scenario.produceTitle(), TOTAL_WORK);
			final Sequencer sequencer = scenario.getSequencer();

			// Figure out how much work has been performed for this scenario
			// already.
			// $ANALYSIS-IGNORE
			monitor.worked((int) sequencer.getWorkComplete());
			/*
			 * adapter = new AdapterImpl() {
			 * 
			 * @Override public void notifyChanged(Notification msg) { Scenario
			 * scenario = (Scenario)msg.getNotifier();
			 * switch(msg.getFeatureID(Scenario.class)) { case
			 * ScenarioPackage.SCENARIO__PROGRESS: SimulationEvent event = new
			 * SimulationEvent(self, SimulationState.RUNNING,
			 * scenario.getProgress()); self.fireSimulationChangedEvent(event);
			 * break; }
			 * 
			 * } };
			 * 
			 * scenario.eAdapters().add(adapter);
			 */

			// ScenarioItemProvider sip =
			// (ScenarioItemProvider)scenarioItemProviderAdapterFactory.adapt(this,
			// ScenarioItemProvider.class);

			// scenarioItemProviderAdapterFactory.addListener(this); // ugh

			// Does the sequencer say we've finished before we've started?

			if (scenario.getSolver() == null) {
				Solver[] solvers = this.getSolvers();
				// Use the default finite difference when not available
				for (Solver s : solvers)
					if (s.getClass().getName().equals(DEFAULT_SOLVER_CLASS)) {
						scenario.setSolver(s);
						break;
					}

			}

			scenario.getSolver().setPartitioner(partitioner);

			if (!sequencer.isTimeToStop()) {
				// No
				while (keepRunning && !reset) {
					final STEMTime currentTime = sequencer.getCurrentTime();
					monitor.subTask(currentTime.toString());

					// Attempt one step (cycle) in the simulation
					if (scenario.getCanonicalGraph() == null)
						scenario.initialize();

					// Make sure the decorators are set on the solver
					scenario.getSolver().setCanonicalGraph(
							scenario.getCanonicalGraph());

					// Step simulation one cycle
					boolean success = scenario.step();

					if (!success) {
						keepRunning = false;
						retValue = Status.CANCEL_STATUS;
					}
					assert scenario.sane();

					monitor.worked(sequencer.getWorkIncrement());

					// We stop when the sequencer tells us it is time
					if (sequencer.isTimeToStop()) {
						keepRunning = false;
						retValue = Status.OK_STATUS;
					}
					// Or, if things are canceled
					else if (monitor.isCanceled()) {
						keepRunning = false;
						retValue = Status.CANCEL_STATUS;
					}
					// Or, if we're stepping
					else if (stepping) {
						keepRunning = false;
					}

					setSimulationState(SimulationState.COMPLETED_CYCLE);

					// To sleep, per chance to dream?
					if (simulationSleep && keepRunning) {
						// Yes
						try {
							Thread.sleep(sleepMilliseconds);
						} catch (InterruptedException ie) {
							ie.printStackTrace(); // Unlikley
						}
					}
				} // while keepRunning

				// Was it time to stop?
				if (sequencer.isTimeToStop() && retValue == Status.OK_STATUS) {
					// Yes
					setSimulationState(SimulationState.COMPLETED_SEQUENCE);
				}
			} // if NOT time to stop before we start
			else {
				// Yes
				// The sequencer says we've finished before we started
				Activator.logInformation(MessageFormat.format(Messages
						.getString("Sim.Time_Error"), sequencer
						.getCurrentTime().toString(), sequencer.getEndTime()
						.toString()), null);
			} // else

			// Did we get a request to reset?
			if (reset) {
				// Yes
				scenario.reset();
				reset = false;
				setSimulationState(SimulationState.RESET);
			}

			monitor.done();

		} catch (final ScenarioInitializationException sie) {
			// Problem. We're out of here.
			handleException(sie, true);
			keepRunning = false;
			stopping = true;
		} catch(final SolverException se) {
			handleException(se, true);
			keepRunning = false;
			stopping = true;
		}

		// Are we stopping or just pausing?
		setSimulationState(stopping ? SimulationState.STOPPED
				: SimulationState.PAUSED);

		return retValue;

	} // run

	/**
	 * Start running the {@link Simulation}.
	 */
	public final void run() {
		stepping = false;
		schedule();
	} // run

	/**
	 * Pause the {@link Simulation}
	 */
	public final void pause() {
		keepRunning = false;
	} // pause

	/**
	 * Reset the {@link Simulation}.
	 */
	public final void reset() throws ScenarioInitializationException {
		reset = true;
		stepping = false;
		// Is the simulation currently paused?
		if (getSimulationState().equals(SimulationState.PAUSED)) {
			// Yes
			scenario.reset();
			reset = false;
			setSimulationState(SimulationState.RESET);
			setSimulationState(SimulationState.PAUSED);
		} // if
	} // reset

	/**
	 * Step the {@link Simulation} one step/cycle if it hasn't already ended
	 */
	public final void step() {
		stepping = true;
		schedule();
	} // stepSimulation

	/**
	 * Stop the {@link Simulation}.
	 */
	public final void stop() {
		stopping = true;
		keepRunning = false;
		// We need to set our state here, which will notify our listeners,
		// because we may not be scheduled and so the run(IProgressMonitor)
		// method may not be executing and so would not set the state to STOPPED
		// (and thus notify listeners)
		setSimulationState(SimulationState.STOPPED);
	} // stepSimulation

	/**
	 * @see org.eclipse.stem.jobs.execution.IExecutable#isRunning()
	 */
	public boolean isRunning() {
		return !simulationState.equals(SimulationState.PAUSED);
	}

	/**
	 * @return the {@link Scenario}
	 */
	public final Scenario getScenario() {
		return this.scenario;
	}

	/**
	 * @param scenario
	 *            the {@link Scenario} to set
	 */
	protected final void setScenario(final Scenario scenario) {
		this.scenario = scenario;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.stem.jobs.simulation.ISimulation#addSimulationListener(org
	 * .eclipse.stem.jobs.simulation.ISimulationListener)
	 */
	public void addSimulationListener(final ISimulationListener listener) {
		addSimulationListener(listener, false);
	} // addSimulationListener

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.stem.jobs.simulation.ISimulation#addSimulationListenerSync
	 * (org.eclipse.stem.jobs.simulation.ISimulationListenerSync)
	 */
	public void addSimulationListenerSync(final ISimulationListenerSync listener) {
		addSimulationListenerSync(listener, false);
	} // addSimulationListenerSync

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.stem.jobs.simulation.ISimulation#addSimulationListener(org
	 * .eclipse.stem.jobs.simulation.ISimulationListener, boolean)
	 */
	public void addSimulationListener(final ISimulationListener listener,
			final boolean headlessSafe) {
		if (!listeners.contains(listener)) {
			listeners.add(listener);
			createSimulationListenerJobs(listener, false, headlessSafe);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.stem.jobs.simulation.ISimulation#addSimulationListenerSync
	 * (org.eclipse.stem.jobs.simulation.ISimulationListenerSync, boolean)
	 */
	public void addSimulationListenerSync(
			final ISimulationListenerSync listener, final boolean headlessSafe) {
		if (!listenersSync.contains(listener)) {
			listenersSync.add(listener);
			createSimulationListenerJobs(listener, true, headlessSafe);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.stem.jobs.simulation.ISimulation#removeSimulationListener
	 * (org.eclipse.stem.jobs.simulation.ISimulationListener)
	 */
	public void removeSimulationListener(final ISimulationListener listener) {
		listeners.remove(listener);
		removeSimulationListenerJobs(listener, false);
	} // removeSimulationListener

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.stem.jobs.simulation.ISimulation#removeSimulationListenerSync
	 * (org.eclipse.stem.jobs.simulation.ISimulationListenerSync)
	 */
	public void removeSimulationListenerSync(
			final ISimulationListenerSync listener) {
		listenersSync.remove(listener);
		removeSimulationListenerJobs(listener, true);
	} // removeSimulationListenerSync

	/**
	 * Tell the listeners about the change in the {@link Simulation}'s state
	 * 
	 * @param simulationState
	 *            the new {@link SimulationState} of the {@link Simulation}
	 */
	protected void fireSimulationChanged(final SimulationState simulationState) {
		final SimulationEvent event = new SimulationEvent(this, simulationState);
		fireSimulationChangedEvent(event);
	} // fireSimulationManagerChanged

	/**
	 * Tell the listeners about the change in the {@link Simulation}'s state
	 * 
	 * @param simulationState
	 *            the new {@link SimulationState} of the {@link Simulation}
	 */
	void fireSimulationChangedEvent(final SimulationEvent event) {
		for (final ISimulationListener listener : listeners) {
			executeEvent(
					listenerJobs.get(getJobMapName(listener,
							event.getSimulationState())), event);
		} // for

		for (final ISimulationListenerSync listener : listenersSync) {
			executeEvent(
					listenerJobsSync.get(getJobMapName(listener,
							event.getSimulationState())), event);
		} // for
	} // fireSimulationManagerChanged

	/**
	 * Attempts to schedule a call to the given listener for this event. If the
	 * listener is synchronous, this method will attempt to wait until the
	 * listener finishes its job
	 * 
	 * @param listener
	 *            The simulation listener to invoke
	 * @param event
	 *            The simulation event to pass to the listener
	 */
	private void executeEvent(final SimulationListenerJob job,
			final SimulationEvent event) {
		// SimulationListenerJob job = listenerJobs.get(getJobMapName(listener,
		// event.getSimulationState()));
		if (job != null) {
			// Set the current simulation event and schedule the job
			job.setSimulationEvent(event);
			job.schedule();
			if (job.isSynchronous()) {
				// If job is synchronous, then wait until it's finished. If
				// interrupted during wait, then notify the user.
				try {
					job.join();
				} catch (InterruptedException ie) {
					Activator.logInformation(
							Messages.getString("Sim.Sync_Listener_Interrupt"),
							ie);
				}
			}
		}
	}

	/**
	 * Gets the assigned job name for this listener-state combination
	 * 
	 * @param listener
	 *            Simulation listener
	 * @param state
	 *            Simulation state
	 * @return Job name for this listener-state combination
	 */
	private String getJobMapName(IBaseListener listener, SimulationState state) {
		return listener.hashCode() + state.toString();
	}

	/**
	 * Creates the worker jobs that will invoke the simulation listener for each
	 * of the available simulation events. For each listener and simulation
	 * state, a Job is created that will be invoked for each event of the given
	 * state. If "headlessSafe" is false, the invoked job will be wrapped in a
	 * Display execution
	 * 
	 * @param listener
	 * @param isHeadlessSafe
	 */
	private void createSimulationListenerJobs(IBaseListener listener,
			boolean synchronous, boolean isHeadlessSafe) {
		// Loop through the available simulation states
		for (SimulationState state : SimulationState.values()) {
			SimulationListenerJob job = null;

			if (isHeadlessSafe) {
				// If the job is "headless safe", then create a non-UI job.
				job = new SimulationListenerJob(this, listener, state,
						synchronous);
			} else {
				// Otherwise, create a job that invokes on UI thread
				job = new SimulationListenerUIJob(this, listener, state,
						synchronous);
			}

			// If the listener implements the IJobChangeListener interface,
			// then add it as a job listener for notifications
			if (listener instanceof IJobChangeListener) {
				job.addJobChangeListener((IJobChangeListener) listener);
			}

			// Add to the correct map
			if (synchronous) {
				listenerJobsSync.put(getJobMapName(listener, state), job);
			} else {
				listenerJobs.put(getJobMapName(listener, state), job);
			}
		}
	}

	/**
	 * Removes and cancels (if scheduled/running) all listener jobs associated
	 * with this listener.
	 * 
	 * @param listener
	 *            The listener to remove associated jobs for
	 */
	private void removeSimulationListenerJobs(IBaseListener listener,
			boolean synchronous) {
		for (SimulationState state : SimulationState.values()) {
			SimulationListenerJob job = null;
			if (synchronous) {
				job = listenerJobsSync.remove(getJobMapName(listener, state));
			} else {
				job = listenerJobs.remove(getJobMapName(listener, state));
			}
			if (job != null) {
				// Should we cancel the job if it's? Hmm. TBD.
				// job.cancel();
				if (listener instanceof IJobChangeListener) {
					job.removeJobChangeListener((IJobChangeListener) listener);
				}
			}
		}
	}

	/**
	 * @see org.eclipse.core.runtime.Preferences.IPropertyChangeListener#propertyChange(org.eclipse.core.runtime.Preferences.PropertyChangeEvent)
	 */
	public void propertyChange(final PropertyChangeEvent event) {
		setPreferences();
	} // propertyChange

	/**
	 * @return the title of the {@link Scenario}
	 */
	@Override
	public String toString() {
		return scenario.produceTitle();
	}

	/**
	 * interruptRequested. Return true if this listener requests that a
	 * decorator stops updating labels
	 * 
	 * @return boolean True if stop
	 */

	public boolean interruptRequested() {
		return (!this.keepRunning && stopping);
	}

	public void destroy() {
		List<ISimulationListener> tempList = new ArrayList<ISimulationListener>();
		tempList.addAll(listeners);
		for (ISimulationListener listener : tempList) {
			this.removeSimulationListener(listener);
		}
		listeners.clear();
		List<ISimulationListenerSync> tempListSync = new ArrayList<ISimulationListenerSync>();
		tempListSync.addAll(listenersSync);
		for (ISimulationListenerSync listener : tempListSync) {
			this.removeSimulationListenerSync(listener);
		}
		listenersSync.clear();
		tempList.clear();
		tempListSync.clear();

		scenario.eAdapters().remove(adapter);

		Activator.getDefault().getPreferenceStore()
				.removePropertyChangeListener(this);
	}

	private org.eclipse.stem.core.solver.Solver[] getSolvers() {
		Solver[] solvers;
		final IExtensionRegistry registry = Platform.getExtensionRegistry();
		final IConfigurationElement[] solverConfigElements = registry
				.getConfigurationElementsFor(org.eclipse.stem.core.Constants.ID_SOLVER_EXTENSION_POINT);

		final List<Solver> temp = new ArrayList<Solver>();

		// solvers = new Solver[solverConfigElements.length];

		for (int i = 0; i < solverConfigElements.length; i++) {
			final IConfigurationElement element = solverConfigElements[i];
			// Does the element specify the class of the disease model?
			if (element.getName().equals(Constants.SOLVER_ELEMENT)) {
				// Yes
				try {
					temp.add((Solver) element
							.createExecutableExtension("class")); //$NON-NLS-1$
				} catch (final Exception e) {
					CorePlugin.logError("Can't create solver", e); //$NON-NLS-1$
				}
			} // if
		} // for each configuration element

		solvers = temp.toArray(new Solver[] {});

		return solvers;
	}

	/**
	 * Do the processing required to handle a {@link ScenarioInitializationException}
	 * 
	 * @param se The exception
	 * @param promptUser
	 *            if <code>true</code> then present the user with a dialog box
	 *            explaining the message.
	 */
	static public void handleException(
			final ScenarioInitializationException se, final boolean promptUser) {

		Activator.logError(se.getErrorMessage(), se.getOriginalException());

		// Prompt the user?
		if (promptUser) {
			// Yes
			try {
				Display d = DisplaySafeExecutor.safeGetDefaultDisplay();
				if (d != null) {
					d.syncExec(new Runnable() {
						public void run() {
							try {
								final IWorkbenchWindow window = PlatformUI
										.getWorkbench()
										.getActiveWorkbenchWindow();
								final IStatus warning = new Status(
										IStatus.WARNING, Activator.PLUGIN_ID,
										1, se.getErrorMessage(), null);
								ErrorDialog.openError(window.getShell(), null,
										null, warning);
							} catch (Exception e) {
								// If we get this exception, it is because we're
								// not running in
								// eclipse.
							}
						} // run
					});
				}
			} catch (final Error ncdfe) {
				// Empty
			} // catch
		} // if
	} // handleRuntimeException

	/**
	 * Do the processing required to handle a {@link SolverException}
	 * 
	 * @param se The exception
	 * @param promptUser
	 *            if <code>true</code> then present the user with a dialog box
	 *            explaining the message.
	 */
	static public void handleException(
			final SolverException se, final boolean promptUser) {

		Activator.logError(se.getErrorMessage(), se.getOriginalException());

		// Prompt the user?
		if (promptUser) {
			// Yes
			try {
				Display d = DisplaySafeExecutor.safeGetDefaultDisplay();
				if (d != null) {
					d.syncExec(new Runnable() {
						public void run() {
							try {
								final IWorkbenchWindow window = PlatformUI
										.getWorkbench()
										.getActiveWorkbenchWindow();
								final IStatus warning = new Status(
										IStatus.WARNING, Activator.PLUGIN_ID,
										1, se.getErrorMessage(), null);
								ErrorDialog.openError(window.getShell(), null,
										null, warning);
							} catch (Exception e) {
								// If we get this exception, it is because we're
								// not running in
								// eclipse.
							}
						} // run
					});
				}
			} catch (final Error ncdfe) {
				// Empty
			} // catch
		} // if
	} // handleRuntimeException

	
	/**
	 * Simple job to remove simulation listener notification from the UI job.
	 * This prevents UI thread deadlock with synchronous simulation listeners
	 * that must run on the UI thread.
	 * 
	 * This job is only used when a state change is invoked by the UI thread.
	 * Otherwise, listener notification runs on the calling thread.
	 */
	private class SimulationStateChangeJob extends Job {
		private SimulationState state;

		protected SimulationStateChangeJob(SimulationState state) {
			super(Messages.getString("Sim.StateChangeJobName"));
			this.state = state;
			setPriority(Job.INTERACTIVE);
		}

		protected IStatus run(IProgressMonitor monitor) {
			fireSimulationChanged(state);
			return Status.OK_STATUS;
		}
	}

} // Simulation