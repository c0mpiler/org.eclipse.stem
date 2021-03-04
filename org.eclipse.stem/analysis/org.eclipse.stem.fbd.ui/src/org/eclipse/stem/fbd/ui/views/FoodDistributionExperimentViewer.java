// AnalysisViewer.java
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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.stem.fbd.model.EmpiricalDataset;
import org.eclipse.stem.fbd.ui.Activator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;

/**
 * This class presents "views" of the running simulations.
 */
public class FoodDistributionExperimentViewer extends Viewer {
	/**
	 * This is the top-level control of the viewer. It contains the
	 * {@link MapControl}s that display the current state of the
	 * {@link org.eclipse.stem.jobs.simulation.Simulation}s.
	 */

	final Composite composite;

	public static final String ROOT_PATH = Platform.getLocation().toOSString();

	private TabFolder tabFolder;
	private BatchExperimentControl batchExpCtrl;
	private SimulationControl simulationControl;
	private Text populationDensityFileText;
	private Button populationDensityFileButton;
	private Text experimentDataFileText;
	private Button experimentDataFileButton;
	private Spinner modelErrorSpinner;
	private Combo contaminatedSourceCombo;
	private Observable dataReadyObservers;
	private boolean allowSourceSelection;

	/**
	 * @param parent
	 *            the SWT parent of the control that makes up the viewer
	 */
	public FoodDistributionExperimentViewer(Composite parent) {
		this.composite = new Composite(parent, SWT.NONE);
		this.dataReadyObservers = new Observable() {

			@Override
			public void notifyObservers() {
				this.setChanged();
				super.notifyObservers();
			}

			@Override
			public void notifyObservers(Object arg) {
				this.setChanged();
				super.notifyObservers(arg);
			}
		};

		this.createContents();
		this.refresh();
		this.composite.pack();
		this.allowSourceSelection = true;
	} // AnalysisViewer

	public void addDataReadyObserver(Observer obs) {
		this.dataReadyObservers.addObserver(obs);
	}

	public void removeDataReadyObserver(Observer obs) {
		this.dataReadyObservers.deleteObserver(obs);
	}

	/**
	 * @see org.eclipse.jface.viewers.Viewer#getControl()
	 */
	@Override
	public Control getControl() {
		return this.composite;
	} // getControl

	/**
	 * @see org.eclipse.jface.viewers.Viewer#refresh()
	 */
	@Override
	public void refresh() {
		populateView();
	} // refresh

	/**
	 * Create and dispose of MapControls as necessary to display the selected
	 * Simulations.
	 */
	private void populateView() {

		// problem here when we start up
		// Are we done?
		if (this.composite.isDisposed()) {
			// Yes
			return;
		} // if
		this.composite.layout(true, true);
		this.composite.redraw();
	} // populateView

	/**
	 * @see org.eclipse.jface.viewers.Viewer#getInput()
	 */
	@Override
	public Object getInput() {
		// not used
		return null;
	}

	/**
	 * @see org.eclipse.jface.viewers.Viewer#setInput(java.lang.Object)
	 */
	@Override
	public void setInput(Object input) {
		// not used
	}

	/**
	 * @see org.eclipse.jface.viewers.Viewer#setSelection(org.eclipse.jface.viewers.ISelection,
	 *      boolean)
	 */
	@Override
	public void setSelection(ISelection selection, boolean reveal) {
		// not used
	}

	/**
	 * @see org.eclipse.jface.viewers.Viewer#getSelection()
	 */
	@Override
	public ISelection getSelection() {
		// not used
		return null;
	}

	void createContents() {
		// Use form layout
		this.composite.setLayout(new FormLayout());

		// Display display = this.getDisplay();

		Composite expControlComposite = getExperimentControlComposite(composite);
		ModifyListener ml = new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				if (populationDensityFileText.getText().trim().isEmpty()
						|| experimentDataFileText.getText().trim().isEmpty()) {
					dataReadyObservers.notifyObservers(null);
					return;
				}
				Display display = Display.getCurrent();
				display.asyncExec(new Runnable() {

					@Override
					public void run() {

						try {
							EmpiricalDataset ed = EmpiricalDataset
									.createDatasetFromFiles(
											new File(populationDensityFileText
													.getText()),
											new File(experimentDataFileText
													.getText()));
							dataReadyObservers.notifyObservers(ed);
						} catch (Exception e1) {
							Activator
									.getDefault()
									.getLog()
									.log(new Status(
											Status.WARNING,
											Activator.PLUGIN_ID,
											String.format(
													"Unable to load data files %s, %s",
													populationDensityFileText
															.getText(),
													experimentDataFileText
															.getText()), e1));
						}
					}
				});

			}
		};
		this.populationDensityFileText.addModifyListener(ml);
		this.experimentDataFileText.addModifyListener(ml);
		final FormData expCFormData = new FormData();
		expCFormData.top = new FormAttachment(0, 0);
		expCFormData.left = new FormAttachment(0, 0);
		expCFormData.right = new FormAttachment(100, 0);
		expControlComposite.setLayoutData(expCFormData);

		this.tabFolder = new TabFolder(composite, SWT.BORDER);

		TabItem item0 = new TabItem(this.tabFolder, SWT.BORDER);
		item0.setText(Messages.getString("fdexperiment.batchexperiment"));
		this.batchExpCtrl = new BatchExperimentControl(tabFolder, this);
		item0.setControl(batchExpCtrl);

		final TabItem item1 = new TabItem(this.tabFolder, SWT.BORDER);
		item1.setText(Messages.getString("fdexperiment.simulationcontrol"));
		this.simulationControl = new SimulationControl(tabFolder, this);
		item1.setControl(simulationControl);

		this.tabFolder.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (tabFolder.getSelection()[0] == item1) {
					simulationControl.refresh();
				}
			}
		});

		final FormData tabFormData = new FormData();
		tabFormData.top = new FormAttachment(expControlComposite, 0);
		tabFormData.bottom = new FormAttachment(100, 0);
		tabFormData.left = new FormAttachment(0, 0);
		tabFormData.right = new FormAttachment(100, 0);
		this.tabFolder.setLayoutData(tabFormData);

	} // createContents

	Composite getExperimentControlComposite(Composite parent) {

		final Shell shell = this.composite.getShell();

		Composite experimentControl = new Composite(parent, SWT.NONE);
		FillLayout fillLayout = new FillLayout(SWT.HORIZONTAL);
		fillLayout.spacing = 5;
		experimentControl.setLayout(fillLayout);

		Group group0 = new Group(experimentControl, SWT.NONE);
		group0.setLayout(new GridLayout(3, false));
		group0.setText(Messages.getString("fdexperiment.import"));
		Label label0 = new Label(group0, SWT.PUSH);
		label0.setText(Messages
				.getString("fdexperiment.uploadpopulationdensity"));
		label0.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_CENTER));

		populationDensityFileText = new Text(group0, SWT.NONE);
		GridData gridData0 = new GridData(GridData.FILL_HORIZONTAL);
		gridData0.grabExcessHorizontalSpace = true;
		populationDensityFileText.setLayoutData(gridData0);
		populationDensityFileText.setEditable(false);
		populationDensityFileButton = new Button(group0, SWT.NONE);
		populationDensityFileButton.setLayoutData(new GridData(
				GridData.VERTICAL_ALIGN_CENTER));
		populationDensityFileButton.setText(Messages
				.getString("fdexperiment.selectfile"));
		populationDensityFileButton
				.addSelectionListener(new SelectionAdapter() {

					@Override
					public void widgetSelected(SelectionEvent e) {
						final FileDialog fd = new FileDialog(shell, SWT.OPEN);
						fd.setText(Messages
								.getString("fdexperiment.selectpopulationdensityfile"));
						String beginSearch = populationDensityFileText
								.getText();
						if ((beginSearch == null) || (beginSearch.length() < 1))
							beginSearch = ROOT_PATH;

						fd.setFilterPath(beginSearch);
						final String selected = fd.open();
						if (selected != null) {
							populationDensityFileText.setText(selected);
						}
					}

				});

		Label label1 = new Label(group0, SWT.PUSH);
		label1.setText(Messages
				.getString("fdexperiment.uploadexperimentaldata"));
		label1.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_CENTER));

		experimentDataFileText = new Text(group0, SWT.NONE);
		experimentDataFileText.setEditable(false);
		GridData gridData1 = new GridData(GridData.FILL_HORIZONTAL);
		gridData1.grabExcessHorizontalSpace = true;
		experimentDataFileText.setLayoutData(gridData1);
		experimentDataFileButton = new Button(group0, SWT.PUSH);
		experimentDataFileButton.setLayoutData(new GridData(
				GridData.VERTICAL_ALIGN_CENTER));
		experimentDataFileButton.setText(Messages
				.getString("fdexperiment.selectfile"));
		experimentDataFileButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				final FileDialog fd = new FileDialog(shell, SWT.OPEN);
				fd.setText(Messages
						.getString("fdexperiment.selectexperimentaldatafile"));
				String beginSearch = populationDensityFileText.getText();
				if ((beginSearch == null) || (beginSearch.length() < 1))
					beginSearch = ROOT_PATH;

				fd.setFilterPath(beginSearch);
				final String selected = fd.open();
				if (selected != null) {
					experimentDataFileText.setText(selected);
				}
			}

		});

		Group group1 = new Group(experimentControl, SWT.NONE);
		group1.setLayout(new GridLayout(2, false));
		group1.setText(Messages.getString("fdexperiment.experimentparams"));
		modelErrorSpinner = new Spinner(group1, SWT.NONE);
		modelErrorSpinner.setValues(0, 0, 100, 2, 1, 5);
		modelErrorSpinner.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		Label label2 = new Label(group1, SWT.NONE);
		label2.setText(Messages.getString("fdexperiment.modelerror"));
		label2.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_CENTER));

		contaminatedSourceCombo = new Combo(group1, SWT.PUSH);
		contaminatedSourceCombo.setLayoutData(new GridData(
				GridData.FILL_HORIZONTAL));
		contaminatedSourceCombo.setEnabled(false);
		Label label3 = new Label(group1, SWT.NONE);
		label3.setText(Messages.getString("fdexperiment.contaminatedsource"));
		label3.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_CENTER));

		// listen for new files to update combo selection
		experimentDataFileText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				String fName = ((Text) e.getSource()).getText();
				contaminatedSourceCombo.removeAll();
				if (fName.isEmpty()) {
					contaminatedSourceCombo.setEnabled(false);
				}

				File f = new File(fName);
				try {
					BufferedReader r = new BufferedReader(new FileReader(f));
					String line = r.readLine();
					while (line != null && line.trim().isEmpty()) {
						line = r.readLine();
					}
					if (line == null || !line.contains("\t")) {
						return;
					}
					String[] s = line.split("\t");
					for (int i = 1; i < s.length; i++) {
						contaminatedSourceCombo.add(s[i]);
					}
					contaminatedSourceCombo.select(0);
					contaminatedSourceCombo.setEnabled(allowSourceSelection);
				} catch (IOException e1) {
					Activator
							.getDefault()
							.getLog()
							.log(new Status(Status.ERROR, Activator.PLUGIN_ID,
									"Unable to read file " + fName, e1));
				}
			}
		});
		return experimentControl;
	}

	public String getResultsDir() {
		return new File(this.experimentDataFileText.getText()).getParent();
	}

	public int getContaminationSource() {
		return this.contaminatedSourceCombo.getSelectionIndex();
	}

	public double getNoise() {
		return this.modelErrorSpinner.getSelection()
				* Math.pow(10, -this.modelErrorSpinner.getDigits());
	}

	public void enableControls(boolean enabled) {
		contaminatedSourceCombo.setEnabled(this.allowSourceSelection && enabled);
		modelErrorSpinner.setEnabled(enabled);
		populationDensityFileButton.setEnabled(enabled);
		experimentDataFileButton.setEnabled(enabled);
	}
	
	public void allowContaminatedSourceSelection(boolean allowSelection){
		this.allowSourceSelection = allowSelection;
		contaminatedSourceCombo.setEnabled(allowSelection && this.contaminatedSourceCombo.getItemCount() > 0);
	}
	
} // Import Data Viewer
