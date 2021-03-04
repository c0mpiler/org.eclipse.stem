package org.eclipse.stem.ui.reports.views;

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
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.eclipse.birt.chart.device.IDeviceRenderer;
import org.eclipse.birt.chart.exception.ChartException;
import org.eclipse.birt.chart.factory.Generator;
import org.eclipse.birt.chart.model.Chart;
import org.eclipse.birt.chart.model.ChartWithAxes;
import org.eclipse.birt.chart.model.attribute.Anchor;
import org.eclipse.birt.chart.model.attribute.AxisType;
import org.eclipse.birt.chart.model.attribute.Bounds;
import org.eclipse.birt.chart.model.attribute.ColorDefinition;
import org.eclipse.birt.chart.model.attribute.IntersectionType;
import org.eclipse.birt.chart.model.attribute.JavaNumberFormatSpecifier;
import org.eclipse.birt.chart.model.attribute.LineAttributes;
import org.eclipse.birt.chart.model.attribute.LineStyle;
import org.eclipse.birt.chart.model.attribute.Marker;
import org.eclipse.birt.chart.model.attribute.NumberFormatSpecifier;
import org.eclipse.birt.chart.model.attribute.Position;
import org.eclipse.birt.chart.model.attribute.SortOption;
import org.eclipse.birt.chart.model.attribute.TickStyle;
import org.eclipse.birt.chart.model.attribute.impl.BoundsImpl;
import org.eclipse.birt.chart.model.attribute.impl.ColorDefinitionImpl;
import org.eclipse.birt.chart.model.attribute.impl.JavaNumberFormatSpecifierImpl;
import org.eclipse.birt.chart.model.attribute.impl.NumberFormatSpecifierImpl;
import org.eclipse.birt.chart.model.component.Axis;
import org.eclipse.birt.chart.model.component.Series;
import org.eclipse.birt.chart.model.component.impl.SeriesImpl;
import org.eclipse.birt.chart.model.data.NumberDataSet;
import org.eclipse.birt.chart.model.data.SeriesDefinition;
import org.eclipse.birt.chart.model.data.impl.NumberDataElementImpl;
import org.eclipse.birt.chart.model.data.impl.NumberDataSetImpl;
import org.eclipse.birt.chart.model.data.impl.SeriesDefinitionImpl;
import org.eclipse.birt.chart.model.impl.ChartWithAxesImpl;
import org.eclipse.birt.chart.model.layout.Legend;
import org.eclipse.birt.chart.model.layout.Plot;
import org.eclipse.birt.chart.model.type.LineSeries;
import org.eclipse.birt.chart.model.type.ScatterSeries;
import org.eclipse.birt.chart.model.type.impl.ScatterSeriesImpl;
import org.eclipse.birt.chart.util.PluginSettings;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.definitions.adapters.relativevalue.history.RelativeValueHistoryProvider;
import org.eclipse.stem.definitions.adapters.relativevalue.history.RelativeValueHistoryProviderAdapter;
import org.eclipse.stem.jobs.simulation.ISimulation;
import org.eclipse.stem.ui.adapters.color.STEMColor;
import org.eclipse.stem.ui.preferences.VisualizationPreferencePage;
import org.eclipse.stem.ui.reports.Activator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.IWorkbenchActionConstants;

/**
 * TimeSeriesCanvas is a subclass of {@link Canvas} suitable for chart drawings.
 */
public class TimeSeriesCanvas extends Canvas {

	protected IDeviceRenderer idr = null;

	/**
	 * This is the {@link Chart} that plots the relative values.
	 */
	protected Chart cm = null;

	/**
	 * The provider of relative values.
	 */
	private RelativeValueHistoryProvider rvhp;

	private ReportControl control = null;
	
	/**
	 * some extra colors
	 */	
	protected final ColorDefinition[] colorDefault = {
															ColorDefinitionImpl.RED(),
															ColorDefinitionImpl.ORANGE(), 
															ColorDefinitionImpl.YELLOW(),
															ColorDefinitionImpl.GREEN(),
															ColorDefinitionImpl.BLUE(), 
															ColorDefinitionImpl.CYAN(),
															ColorDefinitionImpl.PINK()
															};
	
	
	// these are the default colors
	// TODO we should make these user preferences
	final ColorDefinition TEXT_COLOR =       ColorDefinitionImpl.create(0, 0, 0);
	final ColorDefinition FRAME_COLOR =      ColorDefinitionImpl.create(150, 150, 150);
	final ColorDefinition BACKGROUND_COLOR = ColorDefinitionImpl.create(255, 255, 255);
	
	/**
	 * used to index the line series so we can step through default colors
	 * when a user custom color is not yet assigned
	 */
	protected int seriesCount  = 0;

	/**
	 * Log of zero is negative infinity so for each location we will cut off the minimum value
	 * of log(y) at 0.1/POPULATION for display purposes only
	 */
	private double minLogScaleValue = 1.0;
	
	/**
	 * once time > DEFAULT_AUTOAXIS_THRESHOLD we start to autoreset the time axis 
	 * tick marks and scale so we don't have too many tick marks
	 */
	private static final int DEFAULT_AUTOAXIS_THRESHOLD = 5;
	
	/**
	 * the max value for the time (x) axis
	 */
	private int maxTimeAxisValue = DEFAULT_AUTOAXIS_THRESHOLD;
	
	/**
	 * the minimum number of time axis ticks 
	 */
	private static final int MIN_TICKS = 5;
	
	/**
	 * the maximum number of time axis ticks  after time=DEFAULT_AUTOAXIS_THRESHOLD;
	 */
	private static final int MAX_TICKS = 10;
	
	/**
	 * used to set the autoaxis tick
	 */
	private static final int TICK_TRIGGER = MAX_TICKS/MIN_TICKS;

	Comparator<ItemPropertyDescriptor> comparator = new Comparator<ItemPropertyDescriptor>() {

		public int compare(ItemPropertyDescriptor arg0,
				ItemPropertyDescriptor arg1) {
			return arg0.getDisplayName(arg0).compareTo(arg1.getDisplayName(arg1));
		}
		
	};
	/**
	 * This is a map of properties of the label updated by the selected
	 * {@link Decorator} whose relative value might be plotted (context menu allows us to toggle the individual
	 * properties to plot
	 */
	protected TreeMap<ItemPropertyDescriptor,Boolean> propertiesToPlot = new TreeMap<ItemPropertyDescriptor,Boolean>(comparator);

	/**
	 * TODO this is temporary code and should be in user preferences
	 * we want to hide a few of the possible line-series on start up
	 */
	private static final String[] HIDE_ON_STARTUP = {"IR","IF","Incidence","Births","Deaths","Population Count", "Disease Deaths"};
	private static final Set<String> defaultHideSet = new HashSet<String>();

	/**
	 * this is a map of the DataSeries object (keyed by property name)
	 */
	protected final Map<String,DataSeries> dataSeriesMap = new HashMap<String,DataSeries>();
	
	
	/**
	 * These are the cycle numbers that match the relative values that will be
	 * plotted
	 *
	 * @see #relativeValues
	 */
	private final List<Double> cycleNumbers = new ArrayList<Double>();

	/**
	 * Chart generator instance (reference to a singleton)
	 */
	Generator gr;

	
	Axis yAxisPrimary;
	Axis xAxisPrimary;

	
	/**
	 * A context menu for this view
	 */
	Menu popUpMenu = null;
	
	// Init a Context Menu Manager
	final MenuManager contextMenuManager = new MenuManager();

	/**
	 * set y axis to a linear scale
	 */
	private LinearScaleAction linearTimeAction;
	/**
	 * set y axis to a log scale
	 */
	private LogScaleAction logTimeAction;
	protected boolean useLinearTimeScale = true;
	
	/**
	 * show the legend (true by default)
	 */
	private LegendViewAction viewLegend;

	/**
	 * Clear the properties from the time series
	 */
	
	private ClearAction clearAction;
	
	List<DisplayableProperty> displayableProperties;
	
	/**
	 * hide the legend 
	 */
	private LegendHideAction hideLegend;
	protected boolean showLegend = true;
	
	protected Legend legend = null;
	
	/**
	 * this empty string is only used to initialize time series on startup.
	 * It is removed when displaying actual data
	 */
	private static final String defaultKey = "";

	Image imgChart = null;
	
	/**
	 * Constructor.
	 *
	 * @param parent
	 *            the SWT parent of the {@link Widget}
	 */
	public TimeSeriesCanvas(final Composite parent) {
		super(parent, SWT.DOUBLE_BUFFERED | SWT.BORDER);
		
		// init
	 	for (int i = 0; i < HIDE_ON_STARTUP.length; i ++) {
	 		defaultHideSet.add(HIDE_ON_STARTUP[i]);
	 	}
	

		gr = Generator.instance();

		try {
			idr = PluginSettings.instance().getDevice("dv.SWT"); //$NON-NLS-1$
		} catch (final ChartException pex) {
			Activator.logError("Problem initializing chart", pex); //$NON-NLS-1$
			return;
		}

		control = (ReportControl) parent;
		rvhp = control.rvhp;
		
		cm = createSimpleLineChart(dataSeriesMap, cycleNumbers, Messages
				.getString("CC.title")); //$NON-NLS-1$
		resetData();
		addPaintListener(new PaintListener() {
			public void paintControl(final PaintEvent pe) {
				final Composite source = (Composite) pe.getSource();
				final org.eclipse.swt.graphics.Rectangle d = source
						.getClientArea();
				
				if(imgChart != null) imgChart.dispose();
				imgChart = new Image(source.getDisplay(), d);
				idr.setProperty(IDeviceRenderer.GRAPHICS_CONTEXT, new GC(
						imgChart));
				final Bounds bounds = BoundsImpl.create(d.x, d.y, d.width,
						d.height);
				bounds.scale(72d / idr.getDisplayServer().getDpiResolution());
				// BOUNDS MUST BE SPECIFIED IN POINTS

				try {
					gr.render(idr, gr.build(idr.getDisplayServer(), cm, bounds,
							null, null, null));
					pe.gc.drawImage(imgChart, d.x, d.y);
				} catch (final ChartException ce) {
					Activator.logError("Problem rendering chart", ce); //$NON-NLS-1$
				}

			} // paintControl
		} // PaintListener

		);

		//Create a context menu for the canvas
		createContextMenu(this);

	} // TimeSeriesCanvas

	/**
	 * The method which gets the {@link TimeSeriesCanvas}' reports list, and
	 * draws it on the {@link TimeSeriesCanvas}.
	 *
	 */
	@SuppressWarnings("boxing")
	public synchronized void draw() {

		
		
		// Has a relative value provider been provided?
		if (rvhp != null) {
			double maxY = Double.MIN_VALUE;
			double minY = Double.MAX_VALUE;

			// Yes
			// build up the set of properties to plot
			
			// First we disable all series so that we only turn on the ones that are enabled.
			for(DataSeries d: dataSeriesMap.values())
				d.hide();
					
			List<ItemPropertyDescriptor> itemList = new ArrayList<ItemPropertyDescriptor>();
			itemList.addAll(propertiesToPlot.keySet());		
			Collections.sort(itemList, new Comparator<ItemPropertyDescriptor>() {

				public int compare(ItemPropertyDescriptor o1,
						ItemPropertyDescriptor o2) {
					return o1.getDisplayName(o1).compareTo(o2.getDisplayName(o2));
				}
			});
				
			
			List<ItemPropertyDescriptor> displayedPropertyList = new ArrayList<ItemPropertyDescriptor>();
			for(ItemPropertyDescriptor property: itemList){
				boolean visible = propertiesToPlot.get(property).booleanValue();
				displayedPropertyList.add(property);
				if(visible) {
					if(dataSeriesMap.containsKey(property.getDisplayName(property))) {
						DataSeries series = dataSeriesMap.get(property.getDisplayName(property));
						// remove it
						if(!series.isVisible()) {
							series.show();
						}
					}
				} else {
					if(dataSeriesMap.containsKey(property.getDisplayName(property))) {
						DataSeries series = dataSeriesMap.get(property.getDisplayName(property));
						// remove it
						if(series.isVisible()) {
							series.hide();
						}
					}
				}// visible?
			}// all displayedProperties


			/////////////////////////////////////////////////////////////
			// Log(0.0) is negative infinity so for display purposes only
			// we set the minimum axis value at 0.1/POPULATION
			double denom = rvhp.getDenominator(null);
			if(denom <=0.0) denom = 1.0;
			minLogScaleValue = 0.1/denom;
			/////////////////////////////////////////////////////////////

			// clear
			resetData();
			
			
			
			boolean setCycles = false;
			// Get the values for the property to be plotted
			int maxPoints = 0;
			STEMTime[] time = rvhp.getAllHistoricTimeValues();
			cycleNumbers.clear();
			cycleNumbers.add(0.0);
			
			
			for (int i = 0; i < displayedPropertyList.size(); i++) {
				ItemPropertyDescriptor property = displayedPropertyList.get(i);
				String propertyName = property.getDisplayName(property);
				
				//TESTING
				//System.out.println("looking for "+property.getDisplayName(property));
				final double[] doubleValues = rvhp.getHistoricInstances(property,time);

				// Any values?
				if (doubleValues.length > 0) {
					if (maxPoints < doubleValues.length) {
						maxPoints = doubleValues.length;
					}

					// this might be a new display
					// so we have to fill any empty data set
					if (!dataSeriesMap.containsKey(property.getDisplayName(property))) {
						
						// if the key is not there we are just starting up the run
						// before adding the missing key, remove the "defaultKey" as this 
						// may not be a valid key
						if(dataSeriesMap.containsKey(defaultKey)) {
							// remove the default key, we are actually running now
							removeDataSeries(defaultKey);
						}
						
						// now go ahead and add the real keys based on the properties for this graph
						DataSeries series = new DataSeries(propertyName, seriesCount);
						dataSeriesMap.put(propertyName, series);
					}

					
					final int earliestCycleNumber = rvhp.getEarliestCycleNumber();
					DataSeries series = dataSeriesMap.get(property.getDisplayName(property));
					
					for (int cycleNumber = 0; cycleNumber < doubleValues.length; cycleNumber++) {
						Double value;
						double displayValue = doubleValues[cycleNumber];
						if (displayValue <= minLogScaleValue && !useLinearTimeScale) {
							// Log(0.0) is negative infinity so for display purposes only
							// we set the minimum axis value at 0.1/POPULATION
							displayValue = minLogScaleValue;
						}
						if (useLinearTimeScale) {
							value = Double.valueOf(displayValue);
						} else {
							value = Double.valueOf(Math.log(displayValue));
						}
						if(maxY < displayValue && series.isVisible()) {
							maxY = displayValue;
						}
						
						if(minY > displayValue && series.isVisible()) {
							minY = displayValue;
						}
					
						series.addValue(cycleNumber, value);
						
						if (!setCycles) {
							if(this.cycleNumbers.size() < series.relativeValues.size()) {
								this.cycleNumbers.add((double)(earliestCycleNumber + cycleNumber));
							}
							
							
							/*
							 * We don't want to add x (time) axis ticks ad infinitum so we we need to dynamically
							 * change the scale. This will toggle between 5-10 ticks every time the max time doubles
							 * past an initial value of maxTimeAxisValue = DEFAULT_AUTOAXIS_THRESHOLD (= 25)
							 */
							if(this.cycleNumbers.size()>TICK_TRIGGER*maxTimeAxisValue) {
								maxTimeAxisValue = this.cycleNumbers.size()+1 ;
								int stepX = maxTimeAxisValue / MIN_TICKS;
								xAxisPrimary.getScale().setStep(stepX);
							}
						}
						
						
					} // for cycleNumber
					//Activator.logInformation("  "+series.propertyName+"cycles = "+this.cycleNumbers.size()+" datasize = "+series.getDataSize());
					setCycles = true; // we set them only once
				} else {
					resetData();
				}

				
			} // for i properties


			// Set the new min/max but only for linear scale
			if(useLinearTimeScale) {
				if(maxY == Double.MIN_VALUE) {
					// No plots
					yAxisPrimary.getScale().setMax(NumberDataElementImpl.create(1.0));
					yAxisPrimary.getScale().setMin(NumberDataElementImpl.create(0.0));
					yAxisPrimary.getScale().setStep(0.25);
					setYAxisNumberFormatFromMaxY(1.0);
				} else if(maxY-minY != 0.0) {
					yAxisPrimary.getScale().setMax(NumberDataElementImpl.create(maxY));
					yAxisPrimary.getScale().setMin(NumberDataElementImpl.create(0.0));
					yAxisPrimary.getScale().setStep((maxY)/MIN_TICKS);
					setYAxisNumberFormatFromMaxY(maxY);
 				} else if(maxY == minY && maxY > 0.0) {
					yAxisPrimary.getScale().setMax(NumberDataElementImpl.create(maxY));
					yAxisPrimary.getScale().setMin(NumberDataElementImpl.create(0.0));
					yAxisPrimary.getScale().setStep((maxY)/MIN_TICKS);
					setYAxisNumberFormatFromMaxY(maxY);
				} else {
					yAxisPrimary.getScale().setMax(NumberDataElementImpl.create(1.0));
					yAxisPrimary.getScale().setMin(NumberDataElementImpl.create(0.0));
					yAxisPrimary.getScale().setStep(0.25);
					setYAxisNumberFormatFromMaxY(1.0);
				}
			} else setYAxisLogNumberFormat();
			
		} // if a relative value provider has been provided
		else {
			// No
			// Need to clear everything
			resetData();
		}

		// Check each data series in the map to make sure they have enough Y values in them 
		for(DataSeries ds:this.dataSeriesMap.values()) {
			if(ds.relativeValues.size() < this.cycleNumbers.size()) {
				ds.relativeValues.clear();
				for(int n=0;n<this.cycleNumbers.size();++n) ds.addValue(0, Double.valueOf(0.0));
			}
		}
		
		if (!this.isDisposed()) {
			redraw();
		}
	} // paintControl

	private void setYAxisLogNumberFormat() {
		NumberFormatSpecifier jnfs = null;
		jnfs = NumberFormatSpecifierImpl.create();
		yAxisPrimary.setFormatSpecifier(jnfs);
	}

	/**
	 * Create the view's context menu and add the action handlers to it.
	 */
	private void createContextMenu(final Composite parent) {

		

		// ---------------------------------------------------------------------
		linearTimeAction = new LinearScaleAction();
		logTimeAction = new LogScaleAction();
		contextMenuManager.add(linearTimeAction);
		contextMenuManager.add(logTimeAction);
		// Place Holder for Menu Additions
		contextMenuManager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
		// ---------------------------------------------------------------------
		viewLegend = new LegendViewAction();
		hideLegend = new LegendHideAction();
		contextMenuManager.add(viewLegend);
		contextMenuManager.add(hideLegend);
		// ---------------------------------------------------------------------
		// Place Holder for Menu Additions
		contextMenuManager.add(new Separator(
				IWorkbenchActionConstants.MB_ADDITIONS));
		popUpMenu = contextMenuManager.createContextMenu(parent);
		// Set the context menu for the viewer
		parent.setMenu(popUpMenu);

	} // createContextMenu


	/**
	 * Update the view's context menu and add the action handlers to it.
	 */
	private void updateContextMenu(final Composite parent) {

		popUpMenu.dispose();
		
		// Init a Context Menu Manager
		contextMenuManager.removeAll();
		// ---------------------------------------------------------------------
		if(linearTimeAction==null) linearTimeAction = new LinearScaleAction();
		if(logTimeAction==null) logTimeAction = new LogScaleAction();
		contextMenuManager.add(linearTimeAction);
		contextMenuManager.add(logTimeAction);
		contextMenuManager.update();
		
		// ---------------------------------------------------------------------
		// Place Holder for Menu Additions
		contextMenuManager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
		// ---------------------------------------------------------------------
		viewLegend = new LegendViewAction();
		hideLegend = new LegendHideAction();
		contextMenuManager.add(viewLegend);
		contextMenuManager.add(hideLegend);
		contextMenuManager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));

		// ---------------------------------------------------------------------
		
		clearAction = new ClearAction();
		contextMenuManager.add(clearAction);

		// ---------------------------------------------------------------------
		// Place Holder for Menu Additions
		contextMenuManager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
		// ---------------------------------------------------------------------
		// add the displayable properties
		if(displayableProperties == null) {
			displayableProperties = new ArrayList<DisplayableProperty>();
		}
		else {
			displayableProperties.clear();
		}
		if(rvhp!= null) {
					//List<IItemPropertyDescriptor>  properties = rvhp.getProperties();
					contextMenuManager.update();
					Iterator<ItemPropertyDescriptor> iter = propertiesToPlot.keySet().iterator();
					
					//for(int i = 0; i < properties.size(); i ++) {
					while((iter!=null)&&(iter.hasNext()))  {
						ItemPropertyDescriptor nextProp = iter.next();
						DisplayableProperty property = new DisplayableProperty(nextProp);
						displayableProperties.add(property);
						contextMenuManager.add(property);
					}// for all properties
					contextMenuManager.updateAll(true);
				}// rvhp not null
		
		// ---------------------------------------------------------------------

		// Place Holder for Menu Additions
		contextMenuManager.update();
		contextMenuManager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
		final Menu popUpMenu = contextMenuManager.createContextMenu(parent);

		// Set the context menu for the viewer
		parent.setMenu(popUpMenu);


	} // updateContextMenu


	/**
	 * @param dataSeriesMap the {@link Map} that will contain the relative values
	 *            (0.0-1.0) to plot
	 * @param cycleNumbers
	 *            the {@link List} of simulation cycle numbers that match the
	 *            relative values
	 * @param seriesIdentifier
	 *            the title of the chart
	 * @return a <code>Chart</code>
	 */
	public final Chart createSimpleLineChart(
			final Map<String, DataSeries> dataSeriesMap,
			final List<Double> cycleNumbers, final String seriesIdentifier) {
		
		
		final ChartWithAxes chartWithAxes = ChartWithAxesImpl.create();

	
		// Plot
		chartWithAxes.getBlock().setBackground(FRAME_COLOR);
		final Plot p = chartWithAxes.getPlot();
		p.getClientArea().setBackground(BACKGROUND_COLOR );

		// Title
		// cwaLine.getTitle( ).getLabel( ).getCaption( ).setValue( "Line Chart"
		// );//$NON-NLS-1$
		chartWithAxes.getTitle().setVisible(false);

		// Legend
		legend = chartWithAxes.getLegend();
		final LineAttributes lia = legend.getOutline();
		legend.getText().getFont().setSize(8);
		lia.setStyle(LineStyle.SOLID_LITERAL);
		legend.getInsets().set(10, 5, 0, 0);
		legend.getOutline().setVisible(false);
		legend.setAnchor(Anchor.NORTH_LITERAL);
		legend.setPosition(Position.BELOW_LITERAL);
		legend.getText().setColor(TEXT_COLOR);
		legend.getOutline().setColor(TEXT_COLOR);

		// /////////
		// X-Axis
		xAxisPrimary = chartWithAxes.getPrimaryBaseAxes()[0];
		xAxisPrimary.getMajorGrid().setTickStyle(TickStyle.BELOW_LITERAL);
		xAxisPrimary.getOrigin().setType(IntersectionType.VALUE_LITERAL);
		xAxisPrimary.getTitle().setVisible(false);
		xAxisPrimary.getTitle().getCaption().getFont().setSize(9);
		xAxisPrimary.getTitle().getCaption().setColor(TEXT_COLOR);
		xAxisPrimary.getLabel().getCaption().setColor(TEXT_COLOR);
		xAxisPrimary.setType(AxisType.LINEAR_LITERAL);
		xAxisPrimary.getScale().setTickBetweenCategories(false);
		final Series seCategory = SeriesImpl.create();

		// new colors
		seCategory.getLabel().getCaption().setColor(TEXT_COLOR);
		seCategory.getLabel().getOutline().setColor(TEXT_COLOR);
		//
		// X-AXIS data
		final NumberDataSet orthoValuesX = NumberDataSetImpl.create(cycleNumbers);
		// X-Series
		final Series lsx = SeriesImpl.create();
		// final LineSeries lsx = (ScatterSeries) ScatterSeriesImpl.create();
		// seCategory.setDataSet(orthoValuesX);
		lsx.setDataSet(orthoValuesX);
		final SeriesDefinition sdX = SeriesDefinitionImpl.create();
		sdX.setSorting(SortOption.ASCENDING_LITERAL);
		xAxisPrimary.getSeriesDefinitions().add(sdX);
		xAxisPrimary.setCategoryAxis(false);
		sdX.getSeries().add(lsx);
		
		// ////////
		// Y-Axis
		this.yAxisPrimary = chartWithAxes.getPrimaryOrthogonalAxis(xAxisPrimary);
		yAxisPrimary.getMajorGrid().setTickStyle(TickStyle.LEFT_LITERAL);
		// end Y-Series

		xAxisPrimary.getScale().setMin(NumberDataElementImpl.create(0.0));
		xAxisPrimary.getScale().setStep(10);
		
		//xAxisPrimary.getScale().setMax(NumberDataElementImpl.create(TICK_TRIGGER*DEFAULT_AUTOAXIS_THRESHOLD));
		//int numTicks = TICK_TRIGGER*DEFAULT_AUTOAXIS_THRESHOLD/MIN_TICKS;
		//
		
		
		
		xAxisPrimary.getLabel().getCaption().getFont().setSize(9);
//		xAxisPrimary.getLabel().getCaption().setColor(foreGround);
		setTimeLabel();

		yAxisPrimary.getScale().setMin(NumberDataElementImpl.create(0.0));
		yAxisPrimary.getScale().setMax(NumberDataElementImpl.create(1.0));
		yAxisPrimary.getScale().setStep(0.25);
		yAxisPrimary.getLabel().getCaption().getFont().setSize(9);
		yAxisPrimary.getLabel().getCaption().setColor(TEXT_COLOR);
		yAxisPrimary.getTitle().getCaption().setColor(TEXT_COLOR);
		setYAxisNumberFormatFromMaxY(1.0);
		
		
		// yAxisPrimary.getMajorGrid().getLineAttributes().setColor(foreGround);
		
		// for now get ready to create only one line - we have no data yet.
		// we will add more lines as we need them
		// handle null
		if(dataSeriesMap.size()==0) {
			DataSeries series = new DataSeries(defaultKey, seriesCount);
			dataSeriesMap.put(defaultKey, series);
		}

		return chartWithAxes;
	} // createSimpleLineChart

	private void setYAxisNumberFormatFromMaxY(double maxY) {
		JavaNumberFormatSpecifier jnfs = null;
		if(maxY < 0.001) 
			jnfs = JavaNumberFormatSpecifierImpl.create("0.####E0");
		else
			jnfs = JavaNumberFormatSpecifierImpl.create("0.#####");
		yAxisPrimary.setFormatSpecifier(jnfs);
		
	}

	/**
	 * 
	 */
	void setTimeLabel() {
		String val = "";
		if (control != null) {
			final ISimulation sim = control.simulation;
			if (sim != null) {
				final long timeDelta = sim.getScenario().getSequencer()
						.getTimeDelta();

				if (timeDelta < STEMTime.Units.MINUTE.getMilliseconds()) {
					val = "secs";
					xAxisPrimary.getTitle().setVisible(true);
					xAxisPrimary.getTitle().getCaption().setValue(val);
					return;
				} else if (timeDelta < STEMTime.Units.HOUR.getMilliseconds()) {
					val = "mins";
					xAxisPrimary.getTitle().setVisible(true);
					xAxisPrimary.getTitle().getCaption().setValue(val);
					return;
				} else if (timeDelta < STEMTime.Units.DAY.getMilliseconds()) {
					val = "hrs";
					xAxisPrimary.getTitle().setVisible(true);
					xAxisPrimary.getTitle().getCaption().setValue(val);
					return;

				} else if (timeDelta <= STEMTime.Units.WEEK.getMilliseconds()) {
					val = "days";
					xAxisPrimary.getTitle().setVisible(true);
					xAxisPrimary.getTitle().getCaption().setValue(val);
					return;

				} else if (timeDelta < 4 * STEMTime.Units.WEEK
						.getMilliseconds()) {
					val = "weeks";
					xAxisPrimary.getTitle().setVisible(true);
					xAxisPrimary.getTitle().getCaption().setValue(val);
					return;
				} else if (timeDelta < STEMTime.Units.YEAR.getMilliseconds()) {
					val = "months";
					xAxisPrimary.getTitle().setVisible(true);
					xAxisPrimary.getTitle().getCaption().setValue(val);
					return;
				} else {
					val = "years";
					xAxisPrimary.getTitle().setVisible(true);
					xAxisPrimary.getTitle().getCaption().setValue(val);
					return;
				}

			} // sim ! null
		}// control ! null

	} // setTimeLabel()

	
	
	
	/**
	 * @param rvhp
	 * @param propertiesToPlotList
	 */
	public synchronized void setDataSourceAndRedraw(
			final RelativeValueHistoryProviderAdapter rvhp,
			final List<IItemPropertyDescriptor> propertiesToPlotList) {
		
		
		
		if(rvhp!=this.rvhp) {
			this.rvhp= rvhp;
			// Check if there's a new property to plot that was not on the list already. If so
			// we clear out the list and builds a new one.
			for(IItemPropertyDescriptor ipd:propertiesToPlotList)
				if(!propertiesToPlot.containsKey(ipd)) {
					removeDataSeries();
					break;
				}

			this.propertiesToPlot = addProperties(propertiesToPlotList);
		}
		
		updateContextMenu(this);
		draw();
	} // setDataSourceAndRedraw

	/**
	 * Filters a list of ItemPropertyDescriptors to show preferred properties if
	 * at least one exists. If not, just returns the entire list.
	 *
	 * @return filteredList<ItemPropertyDescriptor>
	 */
	protected List<ItemPropertyDescriptor> filterPreferredProperties(
			final List<ItemPropertyDescriptor> fullList) {
		final List<ItemPropertyDescriptor> propertyList = new ArrayList<ItemPropertyDescriptor>();
		// Are any of the labels in the preference set?
		final Set<String> prefSet = VisualizationPreferencePage
				.getPreferenceSet();

		for (int i = 0; i < fullList.size(); i++) {
			final ItemPropertyDescriptor property = fullList.get(i);
			if (prefSet.contains(property.getDisplayName(property))) {
				propertyList.add(property);
			}
		}
		// if we didn't find any in the preferences then just add them all
		if (propertyList.size() == 0) {
			propertyList.addAll(fullList);
		}
		return propertyList;
	}


	/**
	 * Filters a list of ItemPropertyDescriptors to show preferred properties if
	 * at least one exists. If not, just returns the entire list.
	 *
	 * @return filteredList<ItemPropertyDescriptor>
	 */
	protected TreeMap<ItemPropertyDescriptor,Boolean> addProperties(final List<IItemPropertyDescriptor> propertiesToPlotList) {

		for (int i = 0; i < propertiesToPlotList.size(); i++) {
			final ItemPropertyDescriptor property = (ItemPropertyDescriptor)propertiesToPlotList.get(i);
			if(!propertiesToPlot.containsKey(property)) {
				boolean visible = true;
				if(defaultHideSet.contains(property.getDisplayName(property))) visible = false;
				Boolean bObj = Boolean.valueOf(visible); //default visibility
				this.propertiesToPlot.put(property,bObj);
			}
		}

		return this.propertiesToPlot;
	}

	/**
	 * Disposes the Color objects
	 */
	@Override
	public void dispose() {
		super.dispose();
	}

	/**
	 * 
	 */
	protected void resetData() {
		clearData();
		// for now get ready to create only one line - we have no data yet.
		// we will add more lines as we need them
		
		//if(!dataSeriesMap.containsKey(defaultKey)) {
		if(dataSeriesMap.size()==0) {
			DataSeries series = new DataSeries(defaultKey, seriesCount);	
			dataSeriesMap.put(defaultKey, series);
		} 
		// handle null
		
		cycleNumbers.add(Double.valueOf(0.0));
	}

	/**
	 * clearsAllData
	 */
	private void clearData() {
		
		Iterator<String> iter = dataSeriesMap.keySet().iterator();
		while((iter!=null)&&(iter.hasNext())) {
			String key = iter.next();
			DataSeries series = dataSeriesMap.get(key);
			series.relativeValues.clear();
			series.addValue(0,Double.valueOf(0.0));
			xAxisPrimary.getScale().setMin(NumberDataElementImpl.create(0.0));
			maxTimeAxisValue = DEFAULT_AUTOAXIS_THRESHOLD;
			//xAxisPrimary.getScale().setMax(NumberDataElementImpl.create(TICK_TRIGGER*DEFAULT_AUTOAXIS_THRESHOLD));
			//int numTicks = TICK_TRIGGER*DEFAULT_AUTOAXIS_THRESHOLD/MIN_TICKS;
			xAxisPrimary.getScale().setStep(1);
		}
		cycleNumbers.clear();
	}
	
	/**
	 * removeData is called when switching between decorators. For example, when switching from display of a disease to dispaly of a population,
	 * the properties are different and the lineSeries, propetries, and axis labels must be removed. SEE also: DataSeries.removeLineSeries()
	 */
	private void removeDataSeries() {
		if(displayableProperties!=null) displayableProperties.clear();
		Iterator<ItemPropertyDescriptor> iter = propertiesToPlot.keySet().iterator();
		while((iter!=null)&&(iter.hasNext())) {
			ItemPropertyDescriptor propertyToRemove = iter.next();
			String key = propertyToRemove.getDisplayName(propertyToRemove);
			DataSeries series = dataSeriesMap.get(key);
		    //series.hide();
			if(series != null) {
				 series.removeLineSeries(key);
			    //series.lineSeries.setVisible(false);
				 dataSeriesMap.remove(key);
			    series = null;
			} // if series not null
		}
		propertiesToPlot.clear();
	}//removeDataSeries
	
	/**
	 * Use to remove the default key before plotting actual data
	 * removeData is called when switching between decorators. For example, when switching from display of a disease to dispaly of a population,
	 * the properties are different and the lineSeries, propetries, and axis labels must be removed. SEE also: DataSeries.removeLineSeries()
	 */
	private void removeDataSeries(String key) {
			DataSeries series = dataSeriesMap.get(key);
		    //series.hide();
			if(series != null) {
				 series.removeLineSeries(key);
			    //series.lineSeries.setVisible(false);
				 dataSeriesMap.remove(key);
			    series = null;
			} // if series not null
	}//removeDataSeries
	
	

	/**
	 * toggle the scale from logarithmic to linear
	 */
	void toggleAxisScale() {
		if (useLinearTimeScale) { //Switch to logarithmic scale
			logTimeAction.setChecked(true);
			linearTimeAction.setChecked(false);
			//Just using the following axis type, to move to log scale, didn't work
			//yAxisPrimary.setType(AxisType.LOGARITHMIC_LITERAL);
			yAxisPrimary.getScale().setMin(null);
			yAxisPrimary.getScale().setMax(null);
			yAxisPrimary.getScale().unsetStep();
			yAxisPrimary.getScale().unsetStepNumber();
		}
		else { //Switch to linear scale
			logTimeAction.setChecked(false);
			linearTimeAction.setChecked(true);
			//yAxisPrimary.setType(AxisType.LINEAR_LITERAL);
			yAxisPrimary.getScale().setMin(NumberDataElementImpl.create(0.0));
			yAxisPrimary.getScale().setMax(NumberDataElementImpl.create(1.0));
			yAxisPrimary.getScale().setStep(0.25);
		}
		useLinearTimeScale = !useLinearTimeScale;
		this.draw();
	}
	
	
	
	
	/**
	 * toggle the scale from logarithmic to linear
	 */
	void toggleLegend() {
		if (showLegend) { //Switch to hide
			viewLegend.setChecked(false);
			hideLegend.setChecked(true);
			legend.setVisible(false);
		}
		else { //Switch to view
			viewLegend.setChecked(true);
			hideLegend.setChecked(false);
			legend.setVisible(true);
		}
		showLegend = !showLegend;
		this.draw();
	}

	/**
	 * switch to linear plot 
	 * 
	 */
	protected class LinearScaleAction extends Action {
		public LinearScaleAction()
		{
			super(Messages.getString("ContextMenu.LinearTimeScale"), IAction.AS_CHECK_BOX);
			setChecked(useLinearTimeScale);
		}

		/**
		 * @see org.eclipse.jface.action.Action#getText()
		 */
		@Override
		public String getText() {
			return Messages.getString("ContextMenu.LinearTimeScale");
		}

		/**
		 * @see org.eclipse.jface.action.Action#run()
		 */
		@Override
		public void run() {
			if (useLinearTimeScale) {
				setChecked(true);
				//Nothing to do. It's already linear-time.
			}
			else {
				toggleAxisScale();
			}
		}
	} //LinearScaleAction

	/**
	 * switch to semi-log plot (log scale on y axis)
	 * 
	 */
	class LogScaleAction extends Action 	{
		public LogScaleAction()
		{
			super(Messages.getString("ContextMenu.LogTimeScale"), IAction.AS_CHECK_BOX);
			setChecked(!useLinearTimeScale);
		}

		/**
		 * @see org.eclipse.jface.action.Action#getText()
		 */
		@Override
		public String getText() {
			return Messages.getString("ContextMenu.LogTimeScale");
		}

		/**
		 * @see org.eclipse.jface.action.Action#run()
		 */
		@Override
		public void run() {
			if (!useLinearTimeScale) {
				setChecked(true);
				//Nothing to do. It's already log-time.
			}
			else {
				toggleAxisScale();
			}
		}
	}//LogScaleAction

	/**
	 * Action to show the legend
	 */
	protected class LegendViewAction extends Action {
		public LegendViewAction()
		{
			super(Messages.getString("ContextMenu.ShowLegend"), IAction.AS_CHECK_BOX);
			setChecked(showLegend);
		}

		/**
		 * @see org.eclipse.jface.action.Action#getText()
		 */
		@Override
		public String getText() {
			return Messages.getString("ContextMenu.ShowLegend");
		}

		/**
		 * @see org.eclipse.jface.action.Action#run()
		 */
		@Override
		public void run() {
			if (showLegend) {
				setChecked(true);
				//Nothing to do. It's already linear-time.
			}
			else {
				toggleLegend();
			}
		}
	} //LegendViewAction
	
	/**
	 * Action to hide the legend
	 */
	class LegendHideAction extends Action 	{
		public LegendHideAction()
		{
			super(Messages.getString("ContextMenu.HideLegend"), IAction.AS_CHECK_BOX);
			setChecked(!showLegend);
		}

		/**
		 * @see org.eclipse.jface.action.Action#getText()
		 */
		@Override
		public String getText() {
			return Messages.getString("ContextMenu.HideLegend");
		}

		/**
		 * @see org.eclipse.jface.action.Action#run()
		 */
		@Override
		public void run() {
			if (!showLegend) {
				setChecked(true);
				//Nothing to do. It's already log-time.
			}
			else {
				toggleLegend();
			}
		}
	}//LegendHideAction


	/**
	 * DisplayableProperty
	 *
	 */
	protected class DisplayableProperty extends Action
	{
		ItemPropertyDescriptor property = null;
		public DisplayableProperty(ItemPropertyDescriptor property)
		{
					super(property.getDisplayName(property), IAction.AS_CHECK_BOX);
					this.property = property;
					if(propertiesToPlot.containsKey(property)) {
						setChecked(propertiesToPlot.get(property).booleanValue());
					} else {
						propertiesToPlot.put(property,Boolean.valueOf(true));
						setChecked(propertiesToPlot.get(property).booleanValue());
					}
					
		}

		/**
		 * @see org.eclipse.jface.action.Action#getText()
		 */
		@Override
		public String getText() {
			return property.getDisplayName(property);
		}

		/**
		 * Toggle the state
		 * @see org.eclipse.jface.action.Action#run()
		 */
		@Override
		public void run() {
			    boolean state = !propertiesToPlot.get(property).booleanValue();
			    propertiesToPlot.put(property, Boolean.valueOf(state));
				setChecked(state);
				
				draw();
		}
		public ItemPropertyDescriptor getProperty() {
			return property;
		}
	}// DisplayableProperty
	

	/**
	 * Action to show the legend
	 */
	protected class ClearAction extends Action {
		public ClearAction()
		{
			super(Messages.getString("ContextMenu.Clear"), IAction.AS_PUSH_BUTTON);
		}

		/**
		 * @see org.eclipse.jface.action.Action#getText()
		 */
		@Override
		public String getText() {
			return Messages.getString("ContextMenu.Clear");
		}

		/**
		 * @see org.eclipse.jface.action.Action#run()
		 */
		@SuppressWarnings("boxing")
		@Override
		public void run() {
			for(ItemPropertyDescriptor ipd:propertiesToPlot.keySet()) {
				// boolean state = !propertiesToPlot.get(ipd).booleanValue();
			    propertiesToPlot.put(ipd, false);
			    for(DisplayableProperty dp:displayableProperties) 
			    	if(dp.getProperty().equals(ipd)) {dp.setChecked(false);break;}
				draw();
			}
		}
	} //ClearAction
	
	
	protected class DataSeries 
	{
		public String propertyName = "";
		
		public List<Double> relativeValues = new ArrayList<Double>();
		public LineSeries lineSeries = null;
		private boolean visible = true;
		private SeriesDefinition sdY = null;
		
		private int seriesIndex = 0;
		
		
		public boolean isVisible() {
			return visible;
		}

		/**
		 * 
		 * @param propertyName
		 * @param index
		 */
		public DataSeries(String propertyName, int index) {
			this.propertyName = propertyName;
			this.seriesIndex = index;
			seriesCount ++;
			relativeValues = new ArrayList<Double>();
			relativeValues.add(Double.valueOf(0.0));
			addLineSeries(propertyName);
		}
		
		public void addValue(int cycle, Double val) {
			if(relativeValues==null) relativeValues = new ArrayList<Double>();
			if(cycle >= relativeValues.size()) {
				relativeValues.add(val);
			}else {
				// for example we want to overwrite the default entry val = 0 at cycle=0 with real data
				// if we have it
				relativeValues.set(cycle,val);
			}
		}// add value
		
		/**
		 * @param propertyName
		 * 
		 */
		@SuppressWarnings("cast")
		public void addLineSeries(final String propertyName) {
			final NumberDataSet orthoValues = NumberDataSetImpl.create(relativeValues);
			if(lineSeries == null) lineSeries = (ScatterSeries) ScatterSeriesImpl.create();
			lineSeries.setDataSet(orthoValues);

			lineSeries.getLineAttributes().setVisible(true);
			
			// replaces deprecated code: lineSeries.getMarker().setVisible(false);
			if (!lineSeries.getMarkers().isEmpty()) {
				Marker marker = (Marker)lineSeries.getMarkers().get(0);
				marker.setVisible(false);
			}
			
			// the series def
			sdY = SeriesDefinitionImpl.create();
			//sdY.getSeriesPalette().update(-2);
			sdY.getSeries().add(lineSeries);
			yAxisPrimary.getSeriesDefinitions().add(sdY);
			setTimeLabel();
			// Assign the line color
			// based on selected property. Default is Blue
			setColorDefs(propertyName);
						
			return;
		}
		
		/**
		 * 
		 * @param propertyName
		 */
		public void removeLineSeries(final String propertyName) {
			//visible = false;
			seriesIndex = 0;
			// ?? relativeValues.clear();
			if(lineSeries!=null) lineSeries.getLineAttributes().setVisible(false);
			if(yAxisPrimary !=null) yAxisPrimary.getSeriesDefinitions().remove(sdY);
			if(sdY != null) sdY.getSeries().remove(lineSeries);
			lineSeries = null;
			sdY = null;
			
			return;
		}
		
		
		
		/** 
		 * in response to user action temporarily remove the line series from the graph
		 */
		public void hide() {
			lineSeries.setVisible(false);
			visible = false;
		}// hide
		
		/** 
		 * in response to user action add back the line series to the graph
		 */
		public void show() {
			lineSeries.setVisible(true);
			visible = true;
		}// show
		

		/**
		 * Sets the colors for a n array of LineSeries given the property to Plot
		 * for each. Try to set color from the preferences (if specified for that
		 * property) otherwise sets line color to blue.
		 * @param propertyName 
		 *
		 */
		private void setColorDefs(String propertyName) {
		    			
			this.lineSeries.setSeriesIdentifier(propertyName);
			
			// fix to bug 375126
			// The latest version of birt uses Palette colors by default. In order to set the color the way we want
			// we must first issue:
			this.lineSeries.setPaletteLineColor(false);
			
			// if possible get color from preferences
			final Map<String, STEMColor> colorMap = VisualizationPreferencePage.getColorMapping();
			
			boolean colorSet = false;
			// 1. If we have a valid set of preferences and a valid property
			if((colorMap!=null)&&(colorMap.size()>=1)&&(propertyName!=null)&&(propertyName.length()>=1)) {
				//2. is there a perfect match?
				if (colorMap.containsKey(propertyName)) {
					final STEMColor c = colorMap.get(propertyName);
					ColorDefinition color = ColorDefinitionImpl.create((int)(c.getRed() * 255.0), (int)(c.getGreen() * 255.0), (int)(c.getBlue()  * 255.0));
					this.lineSeries.getLineAttributes().setColor(color);
					colorSet = true;
				} else {
					//3. Try for a first letter match
					for (String key : colorMap.keySet()) {
						if(key.length() >= 1) {
							if(propertyName.substring(0, 1).equalsIgnoreCase(key.substring(0,1))) {
								// might be right
								final STEMColor c = colorMap.get(key);
								ColorDefinition color = ColorDefinitionImpl.create((int)(c.getRed() * 255.0), (int)(c.getGreen() * 255.0), (int)(c.getBlue()  * 255.0));
								this.lineSeries.getLineAttributes().setColor(color);
								colorSet = true;
								break;
							}
						}
					}
				}
			}
			
			// default
			if(!colorSet) {
				// pick a default color
				int colorIndex = seriesIndex % colorDefault.length;
				ColorDefinition color = colorDefault[colorIndex];
				this.lineSeries.getLineAttributes().setColor(color);
			} 
			return;
			
			
			
		}// setColorDefs
		



		/**
		 * length of the series
		 * @return number of data points
		 */
		public int getDataSize() {
			return relativeValues.size();
		}
		// Accessors
		public String getPropertyName() {
			return propertyName;
		}

		public void setPropertyName(String propertyName) {
			this.propertyName = propertyName;
		}

		public List<Double> getRelativeValues() {
			return relativeValues;
		}

		public void setRelativeValues(List<Double> relativeValues) {
			this.relativeValues = relativeValues;
		}

		public LineSeries getLineSeries() {
			return lineSeries;
		}

		public void setLineSeries(LineSeries lineSeries) {
			this.lineSeries = lineSeries;
		}

	
	}// DataSeries
	
} // TimeSeriesCanvas
