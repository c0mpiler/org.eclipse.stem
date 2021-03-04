package org.eclipse.stem.fbd.ui.views;

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

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.Queue;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.stem.core.Utility;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLong;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLongProviderAdapter;
import org.eclipse.stem.definitions.adapters.spatial.geo.LatLongProviderAdapterFactory;
import org.eclipse.stem.fbd.model.ConsumptionEvent;
import org.eclipse.stem.fbd.model.EmpiricalDataset;
import org.eclipse.stem.fbd.model.Food;
import org.eclipse.stem.fbd.model.scenario.SimulationScenario;
import org.eclipse.stem.fbd.prediction.MLSourcePredictor;
import org.eclipse.stem.fbd.ui.Activator;
import org.eclipse.stem.fbd.util.MagicTableException;
import org.eclipse.stem.ui.adapters.color.STEMColor;
import org.eclipse.stem.ui.views.geographic.map.StemPolygon;
import org.eclipse.stem.ui.views.geographic.map.StemPolygonsList;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

public class SimulationControl extends Composite {

	private FoodDistributionExperimentViewer viewer;
	private MapCanvas mapCanvas;
	private StemPolygonsList spl;
	private URI mapURI;
	private Composite distNameContainer;
	private Label mlPredictionLabel;
	private Spinner contaminationPercentage;
	private Button graphLocationButton;
	private Button runButton;

	/**
	 * If <code>true</code> then there is a map refresh request pending.
	 */
	private boolean refreshPending = false;
	boolean isRunning = false;
	private EmpiricalDataset empData;

	/**
	 * This is the <code>Job</code> that computes the polygon values in the
	 * background.
	 */
	private Job refreshJob;
	private Simulation simulation;
	private SimulationColorProvider simCal;

	public SimulationControl(Composite parent,
			FoodDistributionExperimentViewer viewer) {
		super(parent, SWT.NONE);
		this.viewer = viewer;
		createContent();
	}

	private void createContent() {

		GridLayout gridLayout = new GridLayout(2, false);
		gridLayout.horizontalSpacing = 20;
		this.setLayout(gridLayout);
		this.mapCanvas = new MapCanvas(this, SWT.BORDER);
		this.mapCanvas.setLayoutData(new GridData(GridData.FILL_BOTH));
		this.simCal = new SimulationColorProvider();
		this.mapCanvas.setColorProvider(this.simCal);
		Composite controls = new Composite(this, SWT.NONE);
		GridData gd = new GridData(GridData.FILL_VERTICAL);
		gd.widthHint = 350;
		controls.setLayoutData(gd);

		GridLayout gridLayout1 = new GridLayout(1, true);
		gridLayout1.marginTop = 20;
		controls.setLayout(gridLayout1);
		Composite c0 = new Composite(controls, SWT.NONE);
		c0.setLayout(new GridLayout(2, false));
		c0.setLayoutData(new GridData(GridData.BEGINNING, GridData.BEGINNING,
				true, false));
		c0.setSize(400, 20);

		final Text graphLocationText = new Text(c0, SWT.NONE);
		graphLocationText.setEditable(false);
		GridData gridData1 = new GridData(GridData.BEGINNING,
				GridData.BEGINNING, true, false);
		gridData1.grabExcessHorizontalSpace = true;
		gridData1.widthHint = 400;
		graphLocationText.setLayoutData(gridData1);
		graphLocationButton = new Button(c0, SWT.PUSH);
		graphLocationButton.setLayoutData(new GridData(GridData.END,
				GridData.BEGINNING, false, false));
		graphLocationButton.setText(Messages
				.getString("fdexperiment.simulationcontrol.selectgraph"));
		graphLocationButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				final Shell shell = SimulationControl.this.getShell();
				ElementTreeSelectionDialog rd = new ElementTreeSelectionDialog(
						shell, new WorkbenchLabelProvider(),
						new BaseWorkbenchContentProvider());
				rd.setTitle(Messages
						.getString("fdexperiment.simulationcontrol.selectgraph"));
				String beginSearch = viewer.getResultsDir();
				if ((beginSearch == null) || (beginSearch.length() < 1))
					beginSearch = FoodDistributionExperimentViewer.ROOT_PATH;

				rd.setAllowMultiple(false);
				rd.setValidator(new ISelectionStatusValidator() {

					@Override
					public IStatus validate(Object[] selection) {
						if (selection != null
								&& selection.length != 0
								&& ((!(selection[0] instanceof IFile) || !(((IFile) selection[0])
										.getFileExtension().equals("graph"))))) {
							return new Status(
									IStatus.ERROR,
									Activator.PLUGIN_ID,
									String.format(
											"Selected Object \"%s\" is not a graph",
											selection[0]));
						}
						return Status.OK_STATUS;
					}
				});
				rd.setInput(ResourcesPlugin.getWorkspace().getRoot());
				final int res = rd.open();
				final Object selected = rd.getFirstResult();
				if (res == IStatus.OK && selected != null
						&& selected instanceof IFile) {
					IFile f = (IFile) selected;
					graphLocationText.setText(f.getFullPath().toString());
					spl = null;
					mapURI = URI.createURI(f.getLocationURI().toString());
					refresh();
					if (empData != null) {
						runButton.setEnabled(true);
					}
				}
			}

		});

		Composite c1 = new Composite(controls, SWT.NONE);
		c1.setLayout(new GridLayout(3, false));

		contaminationPercentage = new Spinner(c1, SWT.NONE);
		contaminationPercentage.setValues(100, 0, 100, 2, 1, 5);
		contaminationPercentage.setEnabled(false);

		Label label2 = new Label(c1, SWT.NONE);
		label2.setText(Messages
				.getString("fdexperiment.contaminationpercentage"));
		label2.setLayoutData(new GridData(GridData.BEGINNING,
				GridData.VERTICAL_ALIGN_CENTER, true, false));
		runButton = new Button(c1, SWT.PUSH);
		runButton.setText(Messages.getString("fdexperiment.start"));
		runButton.setEnabled(false);
		runButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (isRunning) {
					viewer.enableControls(true);
					contaminationPercentage.setEnabled(true);
					graphLocationButton.setEnabled(true);
					runButton.setText(Messages.getString("fdexperiment.start"));
					if (simulation != null) {
						simulation.cancel();
						simulation = null;
					}
				} else {

					viewer.enableControls(false);
					graphLocationButton.setEnabled(false);
					contaminationPercentage.setEnabled(false);
					runButton.setText(Messages.getString("fdexperiment.stop"));
					runExperiment();
				}
				isRunning = !isRunning;
			}
		});

		Composite c = new Composite(controls, SWT.NONE);
		c.setLayout(new GridLayout(2, false));
		Label l0 = new Label(c, SWT.NONE);
		l0.setText("Predicted contamination source: ");
		l0.setLayoutData(new GridData(GridData.BEGINNING, GridData.BEGINNING,
				false, false));
		mlPredictionLabel = new Label(c, SWT.NONE);
		GridData gl1 = new GridData(GridData.BEGINNING, GridData.BEGINNING,
				true, false);
		gl1.grabExcessHorizontalSpace = true;
		gl1.widthHint = 150;
		mlPredictionLabel.setLayoutData(gl1);

		final ScrolledComposite sc = new ScrolledComposite(controls, SWT.BORDER
				| SWT.V_SCROLL);
		sc.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		// sc.setLayout(new GridLayout());
		distNameContainer = new Composite(sc, SWT.NONE);
		distNameContainer.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true));

		sc.addControlListener(new ControlAdapter() {
			public void controlResized(ControlEvent e) {
				Rectangle r = sc.getClientArea();
				sc.setMinSize(distNameContainer.computeSize(r.width,
						SWT.DEFAULT));
			}
		});

		GridLayout gl = new GridLayout(2, false);
		distNameContainer.setLayout(gl);

		sc.setExpandHorizontal(true);
		sc.setExpandVertical(true);
		sc.setContent(distNameContainer);

		viewer.addDataReadyObserver(new Observer() {

			@Override
			public void update(Observable o, Object arg) {
				empData = (EmpiricalDataset) arg;
				mlPredictionLabel.setText("");
				if (empData != null) {
					if (spl != null) {
						runButton.setEnabled(true);
					}
					contaminationPercentage.setEnabled(true);
					simCal.setNoOfDistributorIds(empData
							.getFoodDistributionNames().length);
					updateDistNameList(empData.getFoodDistributionNames(),
							simCal.getDistributorColors());
				} else {
					runButton.setEnabled(false);
					updateDistNameList(null, null);
				}
			}
		});
	}

	private void updateDistNameList(String[] names, STEMColor[] colors) {
		// remove all previous entries
		for (Control c : this.distNameContainer.getChildren()) {
			c.dispose();
		}
		// don't do nothing if there's nothing to do...
		if (names == null || colors == null) {
			ScrolledComposite sc = (ScrolledComposite) this.distNameContainer
					.getParent();
			sc.setContent(this.distNameContainer);
			return;
		}

		Composite c0 = new Composite(this.distNameContainer, SWT.NONE);
		GridData d = new GridData(20, 20);
		d.grabExcessHorizontalSpace = true;
		d.grabExcessVerticalSpace = true;
		c0.setLayoutData(d);
		c0.setBackground(new Color(Display.getCurrent(), 0, 255, 0));
		Label l0 = new Label(this.distNameContainer, SWT.NONE);
		l0.setText(Messages.getString("fdexperiment.contaminationevent"));

		for (int i = 0; i < names.length; i++) {
			Composite c = new Composite(this.distNameContainer, SWT.NONE);
			c.setLayoutData(new GridData(20, 20));
			c.setBackground(colors[i].toSWTColor(Display.getCurrent()));
			Label l = new Label(this.distNameContainer, SWT.NONE);
			l.setText(names[i]);
			l.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING,
					GridData.VERTICAL_ALIGN_CENTER, true, false));
		}
		ScrolledComposite sc = (ScrolledComposite) this.distNameContainer
				.getParent();
		sc.setContent(this.distNameContainer);
		sc.layout(true, true);
		Rectangle r = sc.getClientArea();
		sc.setMinSize(distNameContainer.computeSize(r.width, SWT.DEFAULT));
	}

	private void runExperiment() {
		this.simulation = new Simulation(viewer.getContaminationSource(),
				viewer.getNoise(), contaminationPercentage.getSelection()
						* Math.pow(10, -contaminationPercentage.getDigits()),
				this.empData, this);
		this.simulation.schedule();
	}

	private StemPolygonsList createPolygonsToDraw(IProgressMonitor monitor) {

		if (this.spl != null || this.mapURI == null) {
			return this.spl;
		}

		monitor.beginTask(String.format("Read graph from url %s", this.mapURI),
				1);
		Graph g = (Graph) Utility.getIdentifiable(this.mapURI);
		monitor.worked(1);

		monitor.beginTask("Create STEM polygons", g.getNumNodes());
		this.spl = new StemPolygonsList();
		for (Map.Entry<URI, Node> e : g.getNodes()) {
			Node n = e.getValue();
			LatLongProviderAdapter a = (LatLongProviderAdapter) LatLongProviderAdapterFactory.INSTANCE
					.adapt(n, LatLongProviderAdapter.STEM_SPATIAL_SCHEME);
			LatLong ll = a.getLatLong();
			for (LatLong.Segment s : ll.getSegments()) {
				spl.add(new StemPolygon(s, e.getValue()));
			}
			monitor.worked(1);
		}

		return spl;
	}

	public void updateActiveCells() {
		if (!this.isRunning || this.empData == null || this.simulation == null) {
			return;
		}

		// update prediction label
		Display display = Display.getCurrent();
		display.asyncExec(new Runnable() {
			@Override
			public void run() {
				if (simulation == null) {
					mlPredictionLabel.setText("");
				} else if (simulation.getCurrentPrediction() < 0) {
					return;
				} else {
					int x = simulation.getCurrentPrediction();
					String n = empData.getFoodDistributionNames()[x];
					mlPredictionLabel.setText(String.format("%s (#cases: %s)",
							n, simulation.getNoOfContaminations()));
					mlPredictionLabel.setSize(200, 20);
					mlPredictionLabel.getParent().layout(true, true);
				}
			}
		});
		String[] names = this.empData.getCellLabels();
		Map<String, Food> location2Distribuor = new HashMap<String, Food>();
		for (ConsumptionEvent e : this.simulation.getCurrentConsumptionEvents()) {
			location2Distribuor.put(names[e.getPos()], e.getFood());
		}
		this.simCal.markConsumption(location2Distribuor);
	}

	/**
	 * Update the contents of {@link #geographicRenderer} from the contents of
	 * the {@link #simulation}. This method should only be called by the UI
	 * thread otherwise it contains a race condition that can lock up the
	 * refreshing of the map canvas.
	 */
	public void refresh() {
		// This is complex and potential confusing code. The basic idea is that
		// we want to determine what to draw on the mapCanvas in a thread
		// separate from the UI thread, but we also want to capture a request to
		// refresh the mapCanvas that comes while a background Job is already
		// running. This request could have been generated because something
		// significant like a decorator or a property has changed and
		// we don't want to lose that switch.
		// We have two fields that capture the state of the refresh. The first
		// is the flag refreshPending which if true indicates that a call to
		// refreshMapCanvas was processed while a background Job was executing.
		// This flag is set instead of creating another background Job. The
		// second is the field refreshJob which is set to the background Job if
		// it is present and running.
		//
		// If we enter the method and refreshPending is true then we immediately
		// exit because a refresh job will be created and there's nothing more
		// for us to request. If, instead, refreshPending is false, then we
		// check to see if a refreshJob is already running. If so, we set
		// refreshPending to true, and exit. If not, we create the background
		// refresh job and assign it to the field refreshJob.
		//
		// In the background refreshing job we process the Lat/Long data and
		// then when done we add a Runnable on to the UI thread to redraw the
		// mapCanvas. That Runnable also checks to see if the refresh pending
		// flag is set and if so, resets the flag and then adds another Runnable
		// to the UI thread to re-enter the refreshMapCanvas method.
		//
		// There is a race condition in the method if called by other than the
		// UI thread. If a thread different from the UI thread were to call this
		// method then it could reach position "RC #2" in the code below and
		// then be preempted. The UI thread could then execute the test at "RC
		// #1" below and find that there is no refresh pending. It would exit
		// and then the other thread would resume at "RC #2" and set the
		// refreshPending flag. This would cause all subsequent method
		// invocations to immediately exit and the map canvas would never be
		// refreshed again.

		// Is there a refresh pending?
		if (!refreshPending) {
			// No
			// Is there already a refresh job?
			if (refreshJob == null) {
				// No
				// Refresh the map canvas in the background
				refreshJob = new Job(Messages.getString("fdexperiment.refresh")) {
					/**
					 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor)
					 */
					@Override
					protected IStatus run(final IProgressMonitor monitor) {

						final StemPolygonsList polygonsToDraw = createPolygonsToDraw(monitor);
						// Still ok to run?
						if (polygonsToDraw == null) {
							refreshJob = null;
							refreshPending = false;
							return Status.OK_STATUS;
						}
						final Display display = Display.getDefault();
						if (!display.isDisposed()) {
							// Yes
							try {
								display.asyncExec(new Runnable() {
									public void run() {
										// This runs in the UI thread
										// Is the renderer still around?
										if (!mapCanvas.isDisposed()) {
											// Yes
											updateActiveCells();
											mapCanvas.render(polygonsToDraw);
											refreshJob = null;
											// RC #1
											// Is there a refresh pending?
											if (refreshPending) {
												// Yes
												refreshPending = false;
												// We create a new Runnable to
												// avoid recursion
												// Ok to run?
												final Display display2 = Display
														.getDefault();
												if (!display2.isDisposed()) {
													// Yes
													display2.asyncExec(new Runnable() {
														public void run() {
															// This runs
															// in the UI
															// thread
															refresh();
														} // asyncExec x
													});
												} // if ok to run
											} // if refresh pending
										} // if the mapCanvas still around?
									} // run (UI thread mapCanvas.redraw())
								});
							} // try
							catch (final NullPointerException npe) {
								// see 177966
								// We ignore the exception, there's nothing to
								// do
							} // catch NullPointerException
						} // if ok to run
						monitor.done();
						return Status.OK_STATUS;
					} // run (background polygon processing Job)

				};
				refreshPending = false;
				refreshJob.schedule();
			} // if not already a refresh job
			else {
				// Yes
				// There is already a refresh job so remember that a refresh is
				// pending
				// RC #2
				refreshPending = true;
			} // else
		} // if no refresh is pending

	} // refresh
}

class Simulation extends Job {
	private int contaminationSource;
	private double contaminationRate;
	private double noise;
	private Queue<ConsumptionEvent> consumptionEvents;
	private EmpiricalDataset empData;
	private SimulationControl ctrl;
	private MLSourcePredictor pred;

	public Simulation(int contaminationSource, double noise,
			double contaminationRate, EmpiricalDataset empData,
			SimulationControl ctrl) {
		super(Messages
				.getString("fdexperiment.simulationcontrol.simulationjob"));
		this.contaminationSource = contaminationSource;
		this.noise = noise;
		this.consumptionEvents = new ArrayDeque<ConsumptionEvent>(100);
		this.empData = empData;
		this.ctrl = ctrl;
	}

	@Override
	protected IStatus run(final IProgressMonitor monitor) {
		final Display display = Display.getDefault();
		if (display.isDisposed() || empData == null) {
			return Status.CANCEL_STATUS;
		}
		try {
			final SimulationScenario s = new SimulationScenario(empData);
			pred = new MLSourcePredictor(s.getFoodDistributions());
			s.registerContaminationEventObserver(pred);
			s.registerContaminationEventObserver(new Observer() {

				@Override
				public void update(Observable o, Object arg) {
					consumptionEvents.add((ConsumptionEvent) arg);
				}
			});

			s.setContaminationSource(contaminationSource);
			while (ctrl.isRunning) {
				s.runExperiment(noise, contaminationRate);
				ctrl.refresh();
			}
		} catch (MagicTableException e) {
			return new Status(Status.ERROR, Activator.PLUGIN_ID,
					e.getMessage(), e);
		}
		return Status.OK_STATUS;
	}

	public List<ConsumptionEvent> getCurrentConsumptionEvents() {
		ConsumptionEvent e = null;
		List<ConsumptionEvent> result = new ArrayList<ConsumptionEvent>();
		while ((e = consumptionEvents.poll()) != null) {
			result.add(e);
		}
		return result;
		// Display display = Display.getCurrent();
		// display.syncExec(new Runnable(){
		//
		// @Override
		// public void run() {
		// ConsumptionEvent e = null;
		// while((e = consumptionEvents.poll()) != null){
		// result.add(e);
		// }
		// }});
		// return result;
	}

	public int getCurrentPrediction() {
		if (this.pred == null) {
			return -1;
		}

		return pred.getMLDistributor();
	}

	public int getNoOfContaminations() {
		return pred.getHistory().size();
	}
}
