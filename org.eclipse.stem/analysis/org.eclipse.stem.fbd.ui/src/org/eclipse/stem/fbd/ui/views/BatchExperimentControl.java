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

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import org.eclipse.birt.chart.device.IDeviceRenderer;
import org.eclipse.birt.chart.exception.ChartException;
import org.eclipse.birt.chart.factory.Generator;
import org.eclipse.birt.chart.model.ChartWithAxes;
import org.eclipse.birt.chart.model.attribute.Anchor;
import org.eclipse.birt.chart.model.attribute.AxisType;
import org.eclipse.birt.chart.model.attribute.Bounds;
import org.eclipse.birt.chart.model.attribute.ChartDimension;
import org.eclipse.birt.chart.model.attribute.TickStyle;
import org.eclipse.birt.chart.model.attribute.impl.BoundsImpl;
import org.eclipse.birt.chart.model.attribute.impl.ColorDefinitionImpl;
import org.eclipse.birt.chart.model.attribute.impl.NumberFormatSpecifierImpl;
import org.eclipse.birt.chart.model.attribute.impl.TextImpl;
import org.eclipse.birt.chart.model.component.Axis;
import org.eclipse.birt.chart.model.component.Series;
import org.eclipse.birt.chart.model.component.impl.LabelImpl;
import org.eclipse.birt.chart.model.component.impl.SeriesImpl;
import org.eclipse.birt.chart.model.data.SeriesDefinition;
import org.eclipse.birt.chart.model.data.impl.NumberDataElementImpl;
import org.eclipse.birt.chart.model.data.impl.NumberDataSetImpl;
import org.eclipse.birt.chart.model.data.impl.SeriesDefinitionImpl;
import org.eclipse.birt.chart.model.impl.ChartWithAxesImpl;
import org.eclipse.birt.chart.model.layout.Legend;
import org.eclipse.birt.chart.model.layout.Plot;
import org.eclipse.birt.chart.model.type.LineSeries;
import org.eclipse.birt.chart.model.type.impl.LineSeriesImpl;
import org.eclipse.birt.chart.util.PluginSettings;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.stem.fbd.model.EmpiricalDataset;
import org.eclipse.stem.fbd.model.scenario.BatchExperimentScenario;
import org.eclipse.stem.fbd.prediction.MLSourcePredictor;
import org.eclipse.stem.fbd.ui.Activator;
import org.eclipse.stem.fbd.util.MagicTableException;
import org.eclipse.stem.fbd.util.MathOps;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Spinner;

public class BatchExperimentControl extends Composite {

	private final String CHART_TITLE = "Maximum Likelihood Estimation for distribution of \"%s\"";
	private ChartWithAxes chart;
	private Image imgChart;
	private Generator gr;
	private IDeviceRenderer idr;
	private Spinner noOfRepeatsSpinner;
	private Spinner noOfReportsSpinner;
	private Composite chartArea;
	private EmpiricalDataset empData;
	private BatchExperimentScenario bExpScenario;
	private Button saveButtonRaw;
	private Button saveButtonSuccessRate;
	private Button saveBatchButton;
	private Button runButton;
	private Button runAllCheckBox;

	private int INITIAL_REPEATS = 100;
	private int INITIAL_NO_OF_REPORTS = 10;
	private FoodDistributionExperimentViewer viewer;

	public BatchExperimentControl(Composite parent, FoodDistributionExperimentViewer viewer) {
		super(parent, SWT.NONE);
		this.viewer = viewer;
		createContent();
	}

	private void createContent() {
		FillLayout fillLayout = new FillLayout(SWT.HORIZONTAL);
		fillLayout.spacing = 5;
		this.setLayout(fillLayout);
		this.chartArea = new Composite(this, SWT.NONE);
		this.chart = createChart();
		this.gr = Generator.instance();

		try {
			idr = PluginSettings.instance().getDevice("dv.SWT");
		} catch (final ChartException pex) {
			Activator
					.getDefault()
					.getLog()
					.log(new Status(Status.ERROR, Activator.PLUGIN_ID,
							"Problem initializing chart", pex));
			return;
		}

		this.chartArea.addPaintListener(new PaintListener() {
			public void paintControl(final PaintEvent pe) {
				final org.eclipse.swt.graphics.Rectangle d = chartArea.getClientArea();
				if (imgChart != null) {
					imgChart.dispose();
				}
				imgChart = new Image(chartArea.getDisplay(), d);
				idr.setProperty(IDeviceRenderer.GRAPHICS_CONTEXT, new GC(imgChart));
				final Bounds bounds = BoundsImpl.create(d.x, d.y, d.width, d.height);
				bounds.scale(72d / idr.getDisplayServer().getDpiResolution());
				// BOUNDS MUST BE SPECIFIED IN POINTS

				try {
					gr.render(idr,
							gr.build(idr.getDisplayServer(), chart, bounds, null, null, null));
					pe.gc.drawImage(imgChart, d.x, d.y);
				} catch (final ChartException ce) {
					Activator
							.getDefault()
							.getLog()
							.log(new Status(Status.ERROR, Activator.PLUGIN_ID,
									"Problem rendering chart", ce));
				}

			} // paintControl
		} // PaintListener
				);
		final Composite c = new Composite(this, SWT.NONE);
		c.setLayout(new GridLayout(1, false));
		Group group0 = new Group(c, SWT.NONE);
		group0.setText(Messages.getString("fdexperiment.batchexperiment.parameters"));
		group0.setLayout(new GridLayout(2, false));
		noOfRepeatsSpinner = new Spinner(group0, SWT.NONE);
		noOfRepeatsSpinner.setValues(INITIAL_REPEATS, 1, 10000000, 0, 1, 10);
		noOfRepeatsSpinner.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		Label label0 = new Label(group0, SWT.NONE);
		label0.setText(Messages.getString("fdexperiment.batchexperiment.noofrepeats"));
		label0.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_CENTER));
		noOfReportsSpinner = new Spinner(group0, SWT.NONE);
		noOfReportsSpinner.setValues(INITIAL_NO_OF_REPORTS, 1, 10000000, 0, 1, 5);
		noOfReportsSpinner.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		this.noOfReportsSpinner.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Spinner s = (Spinner) e.getSource();
				Axis xAxisPrimary = chart.getPrimaryBaseAxes()[0];
				xAxisPrimary.getScale().setMax(NumberDataElementImpl.create(s.getSelection()));
				chartArea.redraw();
			}

		});
		Label label1 = new Label(group0, SWT.NONE);
		label1.setText(Messages.getString("fdexperiment.batchexperiment.noofreports"));
		label1.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_CENTER));

		runAllCheckBox = new Button(group0, SWT.CHECK);
		runAllCheckBox.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				boolean isRunAll = runAllCheckBox.getSelection();
				viewer.allowContaminatedSourceSelection(!isRunAll);
				saveButtonRaw.setVisible(!isRunAll);
				saveButtonSuccessRate.setVisible(!isRunAll);
				saveBatchButton.setVisible(isRunAll);
			}
		});

		Label label2 = new Label(group0, SWT.NONE);
		label2.setText(Messages.getString("fdexperiment.batchexperiment.runall"));
		label2.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_CENTER));

		Composite c0 = new Composite(c, SWT.NONE);
		c0.setLayout(new RowLayout(SWT.HORIZONTAL));

		runButton = new Button(c0, SWT.PUSH);
		runButton.setText(Messages.getString("fdexperiment.start"));
		runButton.setEnabled(false);
		runButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (runAllCheckBox.getSelection()) {
					runExperimentAll();
				} else {
					runExperiment();
				}
			}
		});

		saveButtonRaw = new Button(c0, SWT.PUSH);
		saveButtonRaw.setText(Messages
				.getString("fdexperiment.batchexperiment.saveexperimentalresults.raw"));
		saveButtonRaw.setEnabled(false);
		saveButtonRaw.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				@SuppressWarnings("unchecked")
				List<List<Integer>> results = (List<List<Integer>>) saveButtonRaw.getData();
				final FileDialog fd = new FileDialog(c.getShell(), SWT.SAVE);
				fd.setText(Messages
						.getString("fdexperiment.batchexperiment.saveexperimentalresults.raw"));
				String beginSearch = viewer.getResultsDir();
				if ((beginSearch == null) || (beginSearch.length() < 1))
					beginSearch = FoodDistributionExperimentViewer.ROOT_PATH;
				fd.setFilterPath(beginSearch);
				fd.setFileName("experimental_results_raw.csv");
				fd.setFilterExtensions(new String[] { "*.csv", "*.txt", "*.*" });
				final String selected = fd.open();
				if (selected == null) {
					return;
				}
				try {
					FileWriter out = new FileWriter(new File(selected));
					out.append(String.format("time step", viewer.getContaminationSource()));
					for (int i = 0; i < noOfReportsSpinner.getSelection(); i++) {
						out.append(String.format("\t%s", i + 1));
					}
					out.write('\n');
					for (int k = 0; k < results.size(); k++) {
						List<Integer> res = results.get(k);
						out.append(String.format("distribution predicted in run %s", k));
						for (int i = 0; i < BatchExperimentScenario.MAX_NO_OF_REPORTS; i++) {
							out.append(String.format("\t%s", res.get(i)));
						}
						out.write('\n');
					}
					out.flush();
					out.close();
				} catch (IOException e1) {
					Activator
							.getDefault()
							.getLog()
							.log(new Status(Status.ERROR, Activator.PLUGIN_ID, String.format(
									"Unable to write results into file %s", selected)));
				}

			}
		});

		saveButtonSuccessRate = new Button(c0, SWT.PUSH);
		saveButtonSuccessRate.setText(Messages
				.getString("fdexperiment.batchexperiment.saveexperimentalresults.successrate"));
		saveButtonSuccessRate.setEnabled(false);
		saveButtonSuccessRate.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				double[] results = (double[]) saveButtonSuccessRate.getData();
				final FileDialog fd = new FileDialog(c.getShell(), SWT.SAVE);
				fd.setText(Messages
						.getString("fdexperiment.batchexperiment.saveexperimentalresults.successrate"));
				String beginSearch = viewer.getResultsDir();
				if ((beginSearch == null) || (beginSearch.length() < 1))
					beginSearch = FoodDistributionExperimentViewer.ROOT_PATH;
				fd.setFilterPath(beginSearch);
				fd.setFileName("experimental_results_successrates.csv");
				fd.setFilterExtensions(new String[] { "*.csv", "*.txt", "*.*" });
				final String selected = fd.open();
				if (selected == null) {
					return;
				}
				try {
					FileWriter out = new FileWriter(new File(selected));
					for (double res : results) {
						out.write(String.format("%s\n", res));
					}
					out.flush();
					out.close();
				} catch (IOException e1) {
					Activator
							.getDefault()
							.getLog()
							.log(new Status(Status.ERROR, Activator.PLUGIN_ID, String.format(
									"Unable to write results into file %s", selected)));
				}
			}
		});

		saveBatchButton = new Button(c0, SWT.PUSH);
		saveBatchButton.setText(Messages
				.getString("fdexperiment.batchexperiment.saveexperimentalresults.savebatch"));
		saveBatchButton.setVisible(false);
		saveBatchButton.setEnabled(false);
		saveBatchButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				double[] results = (double[]) saveBatchButton.getData();
				final FileDialog fd = new FileDialog(c.getShell(), SWT.SAVE);
				fd.setText(Messages
						.getString("fdexperiment.batchexperiment.saveexperimentalresults.savebatch"));
				String beginSearch = viewer.getResultsDir();
				if ((beginSearch == null) || (beginSearch.length() < 1))
					beginSearch = FoodDistributionExperimentViewer.ROOT_PATH;
				fd.setFilterPath(beginSearch);
				fd.setFileName("experimental_results_all_successrates.csv");
				fd.setFilterExtensions(new String[] { "*.csv", "*.txt", "*.*" });
				final String selected = fd.open();
				if (selected == null) {
					return;
				}
				try {
					FileWriter out = new FileWriter(new File(selected));
					int m = results.length / 2;
					for (int i = 0; i < m; i++) {
						out.write(String.format("%s\t%s\n", results[i], results[m + i]));
					}
					out.flush();
					out.close();
				} catch (IOException e1) {
					Activator
							.getDefault()
							.getLog()
							.log(new Status(Status.ERROR, Activator.PLUGIN_ID, String.format(
									"Unable to write results into file %s", selected)));
				}
			}
		});

		this.viewer.addDataReadyObserver(new Observer() {

			@Override
			public void update(Observable o, Object arg) {
				empData = (EmpiricalDataset) arg;
				saveButtonRaw.setEnabled(false);
				saveButtonSuccessRate.setEnabled(false);
				if (arg != null) {
					runButton.setEnabled(true);
				} else {
					runButton.setEnabled(false);
					bExpScenario = null;
				}
			}
		});
	}

	public ChartWithAxes createChart() {
		// ChartWithAxes = new ChartWithAxes();
		ChartWithAxes chart = ChartWithAxesImpl.create();
		// BAR CHARTS ARE BASED ON CHARTS THAT CONTAIN AXES
		chart.getBlock().setBackground(ColorDefinitionImpl.WHITE());
		chart.getBlock().getOutline().setVisible(true);
		chart.setDimension(ChartDimension.TWO_DIMENSIONAL_WITH_DEPTH_LITERAL);

		// CUSTOMIZE THE PLOT
		Plot p = chart.getPlot();
		p.getClientArea().setBackground(ColorDefinitionImpl.create(255, 255, 225));
		p.getOutline().setVisible(false);
		//chart.getTitle().getLabel().getCaption().setValue(CHART_TITLE);
		chart.getTitle().getLabel().getCaption().setValue("");

		// CUSTOMIZE THE LEGEND
		Legend lg = chart.getLegend();
		lg.getText().getFont().setSize(16);
		lg.getInsets().set(10, 5, 0, 0);
		lg.setAnchor(Anchor.NORTH_LITERAL);

		// CUSTOMIZE THE X-AXIS
		final Axis xAxisPrimary = chart.getPrimaryBaseAxes()[0];
		xAxisPrimary.getMajorGrid().setTickStyle(TickStyle.BELOW_LITERAL);
		xAxisPrimary.setType(AxisType.LINEAR_LITERAL);
		org.eclipse.birt.chart.model.component.Label xLabel = LabelImpl.create();
		xLabel.setCaption(TextImpl.create(Messages.getString("fdexperiment.mlchart.xaxis")));
		xAxisPrimary.setTitle(xLabel);
		xAxisPrimary.getScale().setMin(NumberDataElementImpl.create(1));
		xAxisPrimary.getScale().setMax(NumberDataElementImpl.create(INITIAL_NO_OF_REPORTS));
		xAxisPrimary.setCategoryAxis(false);
		xAxisPrimary.getScale().setStep(1);

		// CUSTOMIZE THE Y-AXIS
		final Axis yAxisPrimary = chart.getPrimaryOrthogonalAxis(xAxisPrimary);
		yAxisPrimary.getMajorGrid().setTickStyle(TickStyle.LEFT_LITERAL);
		yAxisPrimary.setType(AxisType.LINEAR_LITERAL);
		org.eclipse.birt.chart.model.component.Label yLabel = LabelImpl.create();
		yLabel.setCaption(TextImpl.create(Messages.getString("fdexperiment.mlchart.yaxis")));
		yAxisPrimary.setTitle(yLabel);
		yAxisPrimary.getLabel().getCaption().getFont().setRotation(90);
		yAxisPrimary.setCategoryAxis(false);
		yAxisPrimary.setFormatSpecifier(NumberFormatSpecifierImpl.create());
		yAxisPrimary.getScale().setMin(NumberDataElementImpl.create(0));
		yAxisPrimary.getScale().setMax(NumberDataElementImpl.create(1));
		yAxisPrimary.getScale().setStep(0.1);
		yAxisPrimary.setType(AxisType.LINEAR_LITERAL);

		return chart;
	}

	public void runExperiment() {
		runButton.setEnabled(false);
		saveButtonRaw.setEnabled(false);
		saveButtonSuccessRate.setEnabled(false);
		noOfRepeatsSpinner.setEnabled(false);
		noOfReportsSpinner.setEnabled(false);
		viewer.enableControls(false);

		// should never happen
		if (this.empData == null) {
			return;
		}

		final int currContaminationSource = this.viewer.getContaminationSource();

		BatchJob j = new BatchJob(this.bExpScenario, this.empData,
				this.noOfRepeatsSpinner.getSelection(), this.noOfReportsSpinner.getSelection(),
				viewer.getNoise(), currContaminationSource);

		j.addJobChangeListener(new JobChangeAdapter() {
			@Override
			public void done(IJobChangeEvent event) {
				final BatchJob j = (BatchJob) event.getJob();
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						double[] res = getSuccessRates(j.getResults(), currContaminationSource);
						// store scenario for future use
						bExpScenario = j.getScenario();
						saveButtonRaw.setData(j.getResults());
						saveButtonRaw.setEnabled(true);
						saveButtonSuccessRate.setData(res);
						saveButtonSuccessRate.setEnabled(true);
						runButton.setEnabled(true);
						noOfRepeatsSpinner.setEnabled(true);
						noOfReportsSpinner.setEnabled(true);
						viewer.enableControls(true);
						plotResults(res,
								empData.getFoodDistributionNames()[currContaminationSource]);
					}
				});
			}
		});
		j.schedule();

	}

	public void runExperimentAll() {
		runButton.setEnabled(false);
		saveBatchButton.setEnabled(false);
		noOfRepeatsSpinner.setEnabled(false);
		noOfReportsSpinner.setEnabled(false);
		viewer.enableControls(false);

		// should never happen
		if (this.empData == null) {
			return;
		}

		final int noOfRepeats = noOfRepeatsSpinner.getSelection();
		final int noOfReports = noOfReportsSpinner.getSelection();
		final double noise = viewer.getNoise();

		Job job = new Job("Run batch experiment") {

			boolean isCanceled = false;

			@Override
			protected void canceling() {
				this.isCanceled = true;
				super.canceling();
			}

			@Override
			protected IStatus run(final IProgressMonitor monitor) {

				final Double[][] foodDistributions = empData.getFoodDistributions();

				// store result in array, where the first half are success
				// rates, and the second relative probabilities

				final double[] batch_results = new double[2 * foodDistributions.length];
				final String[] names = empData.getFoodDistributionNames();

				for (int i = 0; i < foodDistributions.length; i++) {
					if (isCanceled) {
						break;
					}
					monitor.beginTask(String.format(
							"Initializing batch job for food distribution %s", names[i]),
							foodDistributions.length * 2);

					BatchJob j = new BatchJob(bExpScenario, empData, noOfRepeats, noOfReports,
							noise, i);

					monitor.worked(1);

					j.schedule();
					try {
						monitor.beginTask(String.format(
								"Waiting for batch job with food distribution %s to complete.",
								names[i]), foodDistributions.length * 2);
						j.join();
						monitor.worked(1);
					} catch (InterruptedException e) {
						IStatus error = new Status(Status.ERROR, Activator.PLUGIN_ID,
								String.format("Unable to join threads %s and %si", this, j, e));
						Activator.getDefault().getLog().log(error);
						return error;
					}
					// store scenario for future use
					bExpScenario = j.getScenario();
					final double[] res = getSuccessRates(j.getResults(), j.getContaminationSource());
					final String distributionName = names[j.getContaminationSource()];
					batch_results[j.getContaminationSource()] = res[noOfRepeats];
					batch_results[foodDistributions.length + j.getContaminationSource()] = j
							.getRelativeSuccessRate();
					Display.getDefault().syncExec(new Runnable() {
						@Override
						public void run() {
							plotResults(res, distributionName);
						}
					});

				}
				
				if (this.isCanceled) {
					Display.getDefault().syncExec(new Runnable() {
						@Override
						public void run() {
							runButton.setEnabled(true);
							noOfRepeatsSpinner.setEnabled(true);
							noOfReportsSpinner.setEnabled(true);
							viewer.enableControls(true);
						}
					});
					
					return Status.CANCEL_STATUS;
				}

				Display.getDefault().syncExec(new Runnable() {

					@Override
					public void run() {
						saveBatchButton.setData(batch_results);
						saveBatchButton.setEnabled(true);
						runButton.setEnabled(true);
						noOfRepeatsSpinner.setEnabled(true);
						noOfReportsSpinner.setEnabled(true);
						viewer.enableControls(true);
					}
				});
				return Status.OK_STATUS;
			}
		};
		job.schedule();
	}

	private double[] getSuccessRates(List<List<Integer>> data, int contaminationSource) {
		// process results
		double[] res = new double[BatchExperimentScenario.MAX_NO_OF_REPORTS];
		double noOfExp = (double) data.size();
		// initialize
		boolean[] conv = new boolean[data.size()];
		Arrays.fill(conv, true);
		// continue
		for (int i = res.length; i > 0; i--) {
			int c = 0;
			for (int j = 0; j < data.size(); j++) {
				if (conv[j] && data.get(j).get(i - 1) == contaminationSource) {
					c++;
				} else {
					conv[j] = false;
				}
			}
			res[i - 1] = c / noOfExp;
		}
		return res;
	}

	private void plotResults(double[] res, String distributionName) {

		this.chart.getTitle().getLabel().getCaption()
				.setValue(String.format(CHART_TITLE, distributionName));
		// setup Y axis
		LineSeries seriesY = (LineSeries) LineSeriesImpl.create();
		seriesY.setDataSet(NumberDataSetImpl.create(Arrays.copyOf(res,
				this.noOfReportsSpinner.getSelection())));
		seriesY.setSeriesIdentifier("ML estimator");
		seriesY.getLineAttributes().setColor(ColorDefinitionImpl.BLUE());
		for (int i = 0; i < seriesY.getMarkers().size(); i++) {
			seriesY.getMarkers().get(i).setType(null);
		}

		// setup Xaxis
		double xaxis[] = new double[this.noOfReportsSpinner.getSelection()];
		for (int i = 0; i < xaxis.length; i++) {
			xaxis[i] = i + 1;
		}
		Series seriesX = SeriesImpl.create();
		seriesX.setDataSet(NumberDataSetImpl.create(xaxis));

		final Axis xAxisPrimary = chart.getPrimaryBaseAxes()[0];
		xAxisPrimary.getSeriesDefinitions().clear();
		SeriesDefinition sdX = SeriesDefinitionImpl.create();
		xAxisPrimary.getSeriesDefinitions().add(sdX);
		sdX.getSeries().add(seriesX);

		final Axis yAxisPrimary = chart.getPrimaryOrthogonalAxis(xAxisPrimary);
		yAxisPrimary.getSeriesDefinitions().clear();
		SeriesDefinition sdY = SeriesDefinitionImpl.create();
		yAxisPrimary.getSeriesDefinitions().add(sdY);
		sdY.getSeries().add(seriesY);
		chartArea.redraw();
	}
}

class BatchJob extends Job {
	private BatchExperimentScenario scenario;
	private List<List<Integer>> results;
	private List<Double> relativeSuccessRates;
	private int repeats;
	private double noise;
	private int contaminationSource;
	private EmpiricalDataset empData;
	private int reports;

	public BatchJob(BatchExperimentScenario scenario, EmpiricalDataset empData, int repeats,
			int reports, double noise, int contaminationSource) {
		super("Run batch experiment");
		this.scenario = scenario;
		this.repeats = repeats;
		this.noise = noise;
		this.contaminationSource = contaminationSource;
		this.empData = empData;
		this.reports = reports;

	}

	public synchronized List<List<Integer>> getResults() {
		return this.results;
	}

	public synchronized double getRelativeSuccessRate() {
		return Math.exp(MathOps.sumLogs(this.relativeSuccessRates))
				/ this.relativeSuccessRates.size();
	}

	public synchronized BatchExperimentScenario getScenario() {
		return this.scenario;
	}

	public synchronized int getContaminationSource() {
		return this.contaminationSource;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		this.results = new ArrayList<List<Integer>>();
		this.relativeSuccessRates = new ArrayList<Double>();

		monitor.beginTask("Gather distributions", this.repeats + 2);
		if (this.scenario == null) {
			this.scenario = new BatchExperimentScenario(this.empData);
		}
		monitor.worked(1);
		monitor.beginTask("Initialize scenario", this.repeats + 2);
		try {
			if (this.scenario.getContaminationSource() != this.contaminationSource) {
				this.scenario.init(this.contaminationSource, this.contaminationSource);
			}
			monitor.worked(1);
			for (int i = 0; i < this.repeats; i++) {
				monitor.beginTask(
						String.format("Run batch experiment %s of %s repeats", i, this.repeats),
						this.repeats + 2);
				MLSourcePredictor pred = new MLSourcePredictor(scenario.getFoodDistributions());
				scenario.registerContaminationEventObserver(pred);
				scenario.runExperiment(noise, i);
				scenario.unregisterContaminationEventObserver(pred);
				results.add(pred.getHistory());
				this.relativeSuccessRates
						.add(pred.getRelativeProbabilityFor(this.reports)[this.contaminationSource]);
				monitor.worked(1);
			}
		} catch (MagicTableException e) {
			return new Status(Status.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
		}
		return Status.OK_STATUS;
	}
}
