// EstimatorControl.java
package org.eclipse.stem.util.analysis.views;

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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.birt.chart.model.attribute.ColorDefinition;
import org.eclipse.birt.chart.model.attribute.impl.ColorDefinitionImpl;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.stem.analysis.impl.ReferenceScenarioDataMapImpl;
import org.eclipse.stem.analysis.impl.ReferenceScenarioDataMapImpl.ReferenceScenarioDataInstance;
import org.eclipse.stem.analysis.util.CSVscenarioLoader;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.common.util.LogInitializationException;
import org.eclipse.stem.util.analysis.Activator;
import org.eclipse.stem.util.analysis.AggregateDataWriter;
import org.eclipse.stem.util.analysis.ScenarioAnalysisSuite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * GUI for aggregate view
 */
public class EpidemicControl extends AnalysisControl {

	
	/**
	 * used to identify user preferences for this class
	 * This String is not human readable so does not need to be NLS'd. It is a key in a map
	 */
	private static final String CONSUMER = "EPIDEMIC_CONTROL";
	
	/**
	 * used to remember the aggregate directory in the user preferences
	 * This String is not human readable so does not need to be NLS'd. It is a key in a map
	 */
	private static final String AGGREGATE_FOLDER_KEY = CONSUMER+"_AGGREGATE";
	
	/**
	 * used to remember the reference directory in the user preferences
	 * This String is not human readable so does not need to be NLS'd. It is a key in a map
	 */
	private static final String REFERENCE_FOLDER_KEY = CONSUMER+"_REFERENCE";
	
	/**
	 * A label to report status (not yet used)
	 */
	static Label statusLabel;
	
	/**
	 *  Label for current scenario folder
	 */
	static Label scenarioFolderLabel;
	
	
	
	/**
	 * Label for aggregate file
	 */
	
	static Label aggregateFileLabel;
	
	/**
	 * Input text field for the scenario folder of data to aggregate
	 */
	public static Text aggregateDirtext;
	
	/**
	 * Input text field for the reference scenario folder that filters the locations to aggregate
	 */
	public static Text referenceDirtext;
	
	
	/**
	 * Input text field for the aggregate data file
	 */
	public static Text filetextAggregate;
	
	/**
	 * alpha is the Immunity Loss Rate
	 * TODO this needs to be set in the GUI
	 */
	protected static double alpha = 0.003;
	/**
	 * Time series canvas
	 */
	TimeSeriesCanvas aggregateDataCanvas;
	
	/**
	 * New Incidence canvas
	 */
	TimeSeriesCanvas newIncidenceCanvas;
	
	/**
     * possible states with parameters to fit
     */
	protected static final String[] incidenceStates = {AnalysisControl.INCIDENCE,AnalysisControl.DELTABIRTHS,AnalysisControl.DELTADEATHS};
	
	
	
	// these are not y axis numeric data and should not be plotted in the aggregate plot
	private static final String[] OMIT_LIST = {AnalysisControl.TIME,AnalysisControl.ITERATION,AnalysisControl.INCIDENCE};
		
	
	/**
	 * Colors for the time series chart
	 */
	static final ColorDefinition foreGround = ColorDefinitionImpl.create(180, 0, 0);
	static final ColorDefinition backgroundGround = ColorDefinitionImpl.create(255, 255, 225);
	static final ColorDefinition frameColor = ColorDefinitionImpl.WHITE();
	final Color white= this.getDisplay().getSystemColor(SWT.COLOR_WHITE);
	final Color grey= this.getDisplay().getSystemColor(SWT.COLOR_GRAY);
	
	
	
	ScenarioAnalysisSuite analyzer = new ScenarioAnalysisSuite(this);
	
	private static String TITLE_TEXT = Messages.getString("COMMON.AGGREGATE_TITLE");
	
	/**
	 * Store the aggregate data for the states
	 */
	public List<List<Double>> aggregateData = new ArrayList<List<Double>>();
	
	/**
	 * Store the incidence data for the states
	 */
	public List<List<Double>> incidenceData = new ArrayList<List<Double>>();
	
	/**
	 * The identifier of each data List<Double> in the primary time series
	 */
	public List<String> primaryPropertiesToPlot = new ArrayList<String>();
	
	/**
	 * The identifier of each data List<Double> in the secondary time series
	 */
	public List<String> secondaryPropertiesToPlot = new ArrayList<String>();
	
	/**
	 * button to aggregate data
	 */
	private Button aggregateButton;
	

	
	/**
	 * checkbox to use a reference data set for filtering locations to aggregate
	 */
	protected Button useReferenceCheckbox;
	
	protected Button pickRefButton;
	
	
	/**
	 * button to plot the data
	 */
	private Button plotButton;
	
	/**
	 * 
	 * @param parent
	 */
	public EpidemicControl(final Composite parent) {
		super(parent, SWT.None);
		createContents();
	} // EstimatorControl

	/**
	 * Create the contents of the plotter
	 */
	void createContents() {
		// Use form layout
		setLayout(new FormLayout());

		Display display = this.getDisplay();
		
		identifiableTitle = new Label(this, SWT.NONE);
		identifiableTitle.setText(TITLE_TEXT);
		final Font newFont = getLargerFont(18, display);
		identifiableTitle.setFont(newFont);
		
		final FormData titleFormData = new FormData();
		identifiableTitle.setLayoutData(titleFormData);
		titleFormData.top = new FormAttachment(0, 0);
		titleFormData.left = new FormAttachment(0, 0);
		titleFormData.right = new FormAttachment(100, 0);
		
		
		int spacer =  10;
		int buttonspacer = 5;
		scenarioFolderLabel = new Label(this, SWT.BORDER);
		
		scenarioFolderLabel.setText(Messages.getString("EPIVIEW.SCENARIOFOLDERLABEL"));

		final FormData scenarioLabelFormData = new FormData();
		scenarioFolderLabel.setLayoutData(scenarioLabelFormData);
		scenarioLabelFormData.top = new FormAttachment(identifiableTitle, spacer);
		scenarioLabelFormData.left = new FormAttachment(0, 0);
		scenarioLabelFormData.right = new FormAttachment(15, 0);
		
		aggregateDirtext = new Text(this, SWT.BORDER);
	    aggregateDirtext.setBounds(10, 10, 100, 20);
	    String recentFolder = prefs.getRecentFolder(CONSUMER);
	    if(recentFolder== null) {
	    	recentFolder = ScenarioAnalysisSuite.REFERENCE_TESTING_DIRECTORY;
	    }
	    aggregateDirtext.setText(recentFolder);
	    final FormData dirTextFormData = new FormData();
	    aggregateDirtext.setLayoutData(dirTextFormData);
	    dirTextFormData.top = new FormAttachment(identifiableTitle, spacer);
	    dirTextFormData.left = new FormAttachment(scenarioFolderLabel, 5);
	    dirTextFormData.right = new FormAttachment(80, 0);
		
	    Button pickDirButton = new Button(this, SWT.NONE);
	    pickDirButton.setText(Messages.getString("EPIVIEW.SELECTDIR"));
	    final FormData pickDirButtonFormData = new FormData();
	    pickDirButtonFormData.top = new FormAttachment(identifiableTitle, buttonspacer);
	    pickDirButtonFormData.left = new FormAttachment(aggregateDirtext, 5);
	    pickDirButton.setLayoutData(pickDirButtonFormData);
	    pickDirButton.setEnabled(true);
		
	    final Shell shell = this.getShell();
	    pickDirButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(@SuppressWarnings("unused")
			final SelectionEvent e) {
				final DirectoryDialog dd = new DirectoryDialog(
						shell, SWT.OPEN);
					dd.setText(Messages.getString("EPIVIEW.SELECTSCENARIOFOLDER")); //$NON-NLS-1$
					String beginSearch = aggregateDirtext.getText();
					if((beginSearch==null)||(beginSearch.length()<1)) beginSearch = ROOT_PATH;
					
					dd.setFilterPath(beginSearch);
					final String selected = dd.open();
					if(selected!=null) aggregateDirtext.setText(selected);
			}
		});
	   
	    
	    //////////// REFERENCE FOLDER//////////
	    /////////////////////
	    
	    useReferenceCheckbox= new Button(this, SWT.CHECK);
	    useReferenceCheckbox.setText(Messages.getString("EPIVIEW.REFERENCEFOLDERLABEL"));
	    useReferenceCheckbox.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(@SuppressWarnings("unused")
			final SelectionEvent e) {
				if(useReferenceCheckbox.getSelection()) {
					referenceDirtext.setBackground(white);
					 String refFolder = prefs.getRecentFolder(REFERENCE_FOLDER_KEY);
					    if(refFolder== null) {
					    	refFolder = aggregateDirtext.getText();
					    	if((refFolder==null)||(refFolder.length()<1)) refFolder = ROOT_PATH;
					    }
					referenceDirtext.setText(refFolder);
					pickRefButton.setEnabled(true);
				} else {
					referenceDirtext.setBackground(grey);
					pickRefButton.setEnabled(false);
				}
			}
		});

		final FormData referenceLabelFormData = new FormData();
		useReferenceCheckbox.setLayoutData(referenceLabelFormData);
		referenceLabelFormData.top = new FormAttachment(scenarioFolderLabel, spacer);
		referenceLabelFormData.left = new FormAttachment(0, 0);
		referenceLabelFormData.right = new FormAttachment(15, 0);
		
		referenceDirtext = new Text(this, SWT.BORDER);
	    referenceDirtext.setBounds(10, 10, 100, 20);
	    String refFolder = prefs.getRecentFolder(REFERENCE_FOLDER_KEY);
	    if(refFolder== null) {
	    	refFolder = recentFolder;
	    }
	 
	    referenceDirtext.setText(refFolder);
	    final FormData refDirTextFormData = new FormData();
	    referenceDirtext.setLayoutData(refDirTextFormData);
	    refDirTextFormData.top = new FormAttachment(scenarioFolderLabel, spacer);
	    refDirTextFormData.left = new FormAttachment(useReferenceCheckbox, 5);
	    refDirTextFormData.right = new FormAttachment(80, 0);
		
	    pickRefButton = new Button(this, SWT.NONE);
	    pickRefButton.setText(Messages.getString("EPIVIEW.SELECTDIR"));
	    final FormData pickRefButtonFormData = new FormData();
	    pickRefButtonFormData.top = new FormAttachment(scenarioFolderLabel, buttonspacer);
	    pickRefButtonFormData.left = new FormAttachment(referenceDirtext, 5);
	    pickRefButton.setLayoutData(pickRefButtonFormData);
	    pickRefButton.setEnabled(true);
		
	    pickRefButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(@SuppressWarnings("unused")
			final SelectionEvent e) {
				final DirectoryDialog dd = new DirectoryDialog(
						shell, SWT.OPEN);
					dd.setText(Messages.getString("EPIVIEW.SELECTREFERENCEFOLDER")); //$NON-NLS-1$
					String beginSearch = referenceDirtext.getText();
					if((beginSearch==null)||(beginSearch.length()<1)) beginSearch = ROOT_PATH;
					dd.setFilterPath(beginSearch);
					final String selected = dd.open();
					if(selected!=null) referenceDirtext.setText(selected);
			}
		});
	  
	    // default not selected
	    useReferenceCheckbox.setSelection(false);
	    referenceDirtext.setBackground(grey);
		pickRefButton.setEnabled(false);
		
	    //////////// END REFERENCE FOLDER ////////
	    
	    Composite aggregateComposite = getAggregateButtonComposite(this, Messages.getString("EPIVIEW.AGGREGATEDATA"));

	    final FormData aggregateButtonFormData = new FormData();
	    aggregateButtonFormData.top = new FormAttachment(useReferenceCheckbox, spacer);
	    aggregateButtonFormData.left = new FormAttachment(0, 0);
	    aggregateButtonFormData.right = new FormAttachment(100, 0);
	    aggregateComposite.setLayoutData(aggregateButtonFormData);
	    
	    final ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(this.getShell());
	    
	    aggregateButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(@SuppressWarnings("unused")
			final SelectionEvent e) {
				String referenceDirectory = aggregateDirtext.getText();
				
				if(!analyzer.validate(referenceDirectory)) {
					identifiableTitle.setText(ScenarioAnalysisSuite.NOT_FOUND_MSG);
					updateMessage(ScenarioAnalysisSuite.NOT_FOUND_MSG);
					return;
				}
				updateMessage(ScenarioAnalysisSuite.WORKING_MSG);
				String aggregateFilename = null;
				try {				
					if(useReferenceCheckbox.getSelection()) {
						aggregateFilename = analyzer.aggregateByFilter(referenceDirtext.getText(),aggregateDirtext.getText(), progressDialog, alpha);
					} else {
						aggregateFilename = analyzer.aggregateData(aggregateDirtext.getText(), progressDialog, alpha);
					}
				    // valid so remember the preferences
					prefs.setRecentFolder(CONSUMER,aggregateDirtext.getText());
					prefs.setRecentFolder(REFERENCE_FOLDER_KEY,referenceDirtext.getText());
					// remember the output files as well
					prefs.setRecentFolder(AGGREGATE_FOLDER_KEY,aggregateFilename);
				} catch(LogInitializationException sie) {
					updateMessage(ScenarioAnalysisSuite.INVALID_DATA_MSG);
					Activator.logError(sie.getMessage(), sie);
				}
				
				filetextAggregate.setText(aggregateFilename);
				updateMessage(ScenarioAnalysisSuite.READY_MSG);
			}
		});
	    
	    
		aggregateFileLabel = new Label(this, SWT.BORDER);
		aggregateFileLabel.setText(Messages.getString("EPIVIEW.AGGFILELABEL"));
		final FormData aggregateFileLabelFormData = new FormData();
		aggregateFileLabel.setLayoutData(aggregateFileLabelFormData);
		aggregateFileLabelFormData.top = new FormAttachment(aggregateComposite, spacer);
		aggregateFileLabelFormData.left = new FormAttachment(0, 0);
		aggregateFileLabelFormData.right = new FormAttachment(15, 0);
		
		filetextAggregate = new Text(this, SWT.BORDER);
		filetextAggregate.setBounds(10, 10, 100, 20);
		String aggregateDir=prefs.getRecentFolder(AGGREGATE_FOLDER_KEY);
		filetextAggregate.setText(aggregateDir);
	    final FormData fileTextAggregateFormData = new FormData();
	    filetextAggregate.setLayoutData(fileTextAggregateFormData);
	    fileTextAggregateFormData.top = new FormAttachment(aggregateComposite, spacer);
	    fileTextAggregateFormData.left = new FormAttachment(aggregateFileLabel, 5);
	    fileTextAggregateFormData.right = new FormAttachment(80, 0);
		
	    Button pickAggregateFileButton = new Button(this, SWT.NONE);
	    
	    pickAggregateFileButton.setText(Messages.getString("EPIVIEW.SELECTAGGFILE"));
	    final FormData pickAggregateFileButtonFormData = new FormData();
	    pickAggregateFileButtonFormData.top = new FormAttachment(aggregateComposite, buttonspacer);
	    pickAggregateFileButtonFormData.left = new FormAttachment(filetextAggregate, 5);
	    pickAggregateFileButton.setLayoutData(pickAggregateFileButtonFormData);
	    pickAggregateFileButton.setEnabled(true);
	    pickAggregateFileButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(@SuppressWarnings("unused")
			final SelectionEvent e) {
				final FileDialog dd = new FileDialog(
						shell, SWT.OPEN);
					dd.setText(Messages.getString("EPIVIEW.SELECTAGGFILE"));
					String beginSearch = filetextAggregate.getText();
					if((beginSearch==null)||(beginSearch.length()<1)) beginSearch = ROOT_PATH;
					dd.setFilterPath(beginSearch);
					
					final String selected = dd.open();
					if(selected!=null) filetextAggregate.setText(selected);
			}
		});
	    
	    Composite plotButtonComposite = getPlotButtonComposite(this, Messages.getString("EPIVIEW.PLOTTEXT"));
	    
	    final FormData plotButtonFormData = new FormData();
	    plotButtonFormData.top = new FormAttachment(aggregateFileLabel, spacer);
	    plotButtonFormData.left = new FormAttachment(0, 0);
	    plotButtonFormData.right = new FormAttachment(100, 0);
	    plotButtonComposite.setLayoutData(plotButtonFormData);
	 
	    final EpidemicControl aCtrl = this;
	    plotButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(@SuppressWarnings("unused")
			final SelectionEvent e) {
				
				
				/*
				 * reinitialize the graph
				 */
				aggregateData.clear();
				primaryPropertiesToPlot.clear();
				secondaryPropertiesToPlot.clear();
				aggregateDataCanvas.reset();
				newIncidenceCanvas.reset();
				
				
				// and plot again
				CSVscenarioLoader loader = new CSVscenarioLoader();
				ReferenceScenarioDataMapImpl aggregateMap = null;
				try {
					aggregateMap = loader.parseAggregateFile(filetextAggregate.getText());
				} catch (LogInitializationException e1) {
					Activator.logError(e1.getMessage(), e1);
				}
				
				for(String location : aggregateMap.getLocations()) {
					ReferenceScenarioDataInstance instance = aggregateMap.getLocation(location);
					Map<String, List<Double>> rawdata = instance.getData();
			
					String[] states = filterDisplayableStates(rawdata.keySet());
					
					Arrays.sort(states);
					//TODO add selection method for states
					for (int i = 0; i < states.length; i ++ ) {
						if(rawdata.get(states[i])!=null) {
							aggregateData.add(rawdata.get(states[i]));
							primaryPropertiesToPlot.add(states[i]);
						}
					}
					
					aCtrl.aggregateDataCanvas.draw();
				}// for all locations in aggregateMap (only one for aggregate data)
				
				
				
				
				// and now plot the incidence data
				
				Map<String, List<String>> dataMap = null;
				try {
					dataMap = loader.processIncidenceFile(filetextAggregate.getText());
				} catch (LogInitializationException e1) {
					Activator.logError(e1.getMessage(), e1);
				}
				
					incidenceData = new ArrayList<List<Double>>();
					
					
					
					// validate and add data
					for (int i = 0; i < incidenceStates.length; i ++ ) {
						if(dataMap.get(incidenceStates[i])!=null) {
							
							List<Double> nextData = new ArrayList<Double>();
							List<String> dataList = dataMap.get(incidenceStates[i]);
							
							for (int j = 0; j < dataList.size(); j ++) {
								try {
									Double dbl = Double.valueOf(dataList.get(j));
									if (dbl!=null) nextData.add(dbl);
								} catch(Exception eIgnore) {
									// nothing if not double data we just don't use it.
								}
							}
							if(nextData.size() >=1) incidenceData.add(nextData);
							secondaryPropertiesToPlot.add(incidenceStates[i]);
						}
					}	
					aCtrl.newIncidenceCanvas.draw();
				
			}
		});
	    
		statusLabel = new Label(this, SWT.BORDER);
		statusLabel.setText("");
		
		// Plot
		
		// aggregate time series data
		aggregateDataCanvas = new TimeSeriesCanvas(this,
				Messages.getString("EPIVIEW.AGGREGATELEGEND"),
				Messages.getString("EPIVIEW.YAXIS"),
				AggregateDataWriter.getKeyS(),
				foreGround,
				backgroundGround,
				frameColor, 0);
		
		final FormData analysisChartFormData = new FormData();
		aggregateDataCanvas.setLayoutData(analysisChartFormData);
		analysisChartFormData.top = new FormAttachment(pickAggregateFileButton, spacer);
		analysisChartFormData.bottom = new FormAttachment(100, 0);
		analysisChartFormData.left = new FormAttachment(0, 0);
		analysisChartFormData.right = new FormAttachment(50, 0);
		
		// new Incidence Canvas series data
		newIncidenceCanvas = new TimeSeriesCanvas(this,
				Messages.getString("INCVIEW.INCIDENCELEGEND"),
				Messages.getString("INCVIEW.YAXIS"),
				incidenceStates[0],
				foreGround,
				backgroundGround,
				frameColor, 1);
		
		final FormData incidenceChartFormData = new FormData();
		newIncidenceCanvas.setLayoutData(incidenceChartFormData);
		incidenceChartFormData.top = new FormAttachment(pickAggregateFileButton, 0);
		incidenceChartFormData.bottom = new FormAttachment(100, 0);
		incidenceChartFormData.left = new FormAttachment(50, 0);
		incidenceChartFormData.right = new FormAttachment(100, 0);
	
	} // createContents
	
	/**
	 * creates a Aggregate Button composite and its composite container
	 * @param control
	 * @param the Aggregate button label
	 * @return the Aggregate composite
	 */
	Composite getAggregateButtonComposite(AnalysisControl control, String label) {
		Composite aggregateComposite = new Composite(control, SWT.BORDER);
	    FillLayout fillLayout = new FillLayout();
	    fillLayout.type = SWT.HORIZONTAL;
	    aggregateComposite.setLayout(fillLayout);
	    Label leftLabel = new Label(aggregateComposite, SWT.NONE);
	    leftLabel.setText(" ");// just a spacer
	    aggregateButton = new Button(aggregateComposite, SWT.NONE);
	    aggregateButton .setText(label);
		Label rightLabel = new Label(aggregateComposite, SWT.NONE);
		rightLabel.setText(" ");// just a spacer
		aggregateButton.setEnabled(true);
	    return aggregateComposite;
	}//getAggregateButtonComposite
	
	
	
	
	/**
	 * creates a PlotButton composite and its composite container
	 * @param control
	 * @param the plot button label
	 * @return the composite
	 */
	Composite getPlotButtonComposite(AnalysisControl control, String label) {
		Composite plotComposite = new Composite(control, SWT.BORDER);
	    FillLayout fillLayout = new FillLayout();
	    fillLayout.type = SWT.HORIZONTAL;
	    plotComposite.setLayout(fillLayout);
	    userMessageLabel = new Label(plotComposite, SWT.NONE);
	    userMessageLabel.setText(userMessage);// just a spacer
	    plotButton = new Button(plotComposite, SWT.NONE);
	    plotButton .setText(label);
		Label rightLabel = new Label(plotComposite, SWT.NONE);
		rightLabel.setText(" ");// just a spacer
		plotButton.setEnabled(true);
	    return plotComposite;
	}//getPlotButtonComposite
	
	
	/**
	 * Enable or disable the analysis button
	 * 
	 * @param b
	 */
	
	public void enableAnalysis(boolean b) {
		if(b) this.analyzeButton.setEnabled(true);
		else this.analyzeButton.setEnabled(false);
	}
	
	
	/**
	 * to remove the control e.g. by a remove button event
	 */
	@Override
	public void remove() {
		
		updateStatusLabel();
	}

	
	

	protected void updateStatusLabel() {
		statusLabel.setText(Messages.getString("COMMON.STATUS"));
	}
	

	/**
	 * Initialize the header label
	 * 
	 * @param folderName
	 */
	@Override
	protected void initializeHeader(String folderName) {
		simulationNameLabel.setText("analyzing "+folderName);

	} // initializeFromSimulation


	
	
	

	/**
	 * @see org.eclipse.swt.widgets.Widget#dispose()
	 */
	@Override
	public void dispose() {
						
		super.dispose();
		
	} // dispose

	
	/**
	 * not used
	 * @return null
	 */
	public Identifiable getIdentifiable() {
		return null;
	}

	

	/**
	 * Returns the aggregate data
	 * @param chartIndex 
	 * @param state
	 * @return Cumulative deviation from reference trajectory
	 */
	@Override
	public double[] getValues(int chartIndex, int state) {
		// pick the right data for the right chart
		List<List<Double>> data = aggregateData;
		if(chartIndex >= 1) data = incidenceData;
		
		double [] result = new double[data.get(state).size()];
		int i=0;
		for(double d:data.get(state))
			result[i++]=d;
		return result;
	}
	
	/**
	 * get the name of the data time series
	 * @param chartIndex 
	 * @param state
	 * @return property name
	 */
	@Override
	public String getProperty(int chartIndex,int state) {
		// return the right property for the requested chart
		if(chartIndex==0) {
			return primaryPropertiesToPlot.get(state);
		}
		return secondaryPropertiesToPlot.get(state);			
	}
	
	/**
	 * returns the number of properties to plot
	 * @param chartIndex 
	 * @return the number of properties
	 * @see org.eclipse.stem.util.analysis.views.AnalysisControl#getNumProperties(int chartIndex)
	 */
	@Override
	public int getNumProperties(int chartIndex) {
		// return the right number of properties for the requested chart
		if(chartIndex==0) {
			return primaryPropertiesToPlot.size();
		}
		return secondaryPropertiesToPlot.size();	
	}
	
	protected String[] filterDisplayableStates(Set<String> inputSet) {
		
		// remove non y-axis data items
		for (int i = 0; i < OMIT_LIST.length; i ++) {
			inputSet.remove(OMIT_LIST[i]);
		}
		
		String[] retVal = new String[inputSet.size()];
		int icount = 0;
		Iterator<String> iter = inputSet.iterator();
		while((iter!=null)&&(iter.hasNext())) {
			String key = iter.next();
			retVal[icount] = key;
		    icount ++;	
		}
		Arrays.sort(retVal);
		
		return retVal;
	}
	
	 /**
	 * Each Control class may add objects to this map
	 * @return the control parameters maps
	 */
	public Map<String, Object> getControlParametersMap() {
		// add nothing for now
		return controlParametersMap;
	}
	
} // EstimatorControl
