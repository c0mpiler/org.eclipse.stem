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
package org.eclipse.stem.loggers.csv.logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.stem.adapters.time.TimeProvider;
import org.eclipse.stem.adapters.time.TimeProviderAdapterFactory;
import org.eclipse.stem.core.common.CommonPackage;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.graph.IntegrationLabelValue;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.model.IntegrationDecorator;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.sequencer.Sequencer;
import org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProvider;
import org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProviderAdapter;
import org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProviderAdapterFactory;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.loggers.csv.Activator;
import org.eclipse.stem.loggers.csv.CSVLogger;
import org.eclipse.stem.populationmodels.standard.PopulationModel;
import org.eclipse.stem.populationmodels.standard.PopulationModelLabel;

/**
 * STEM Decorator logger that writes the output values of node labels for the
 * decorator's properties to a entry-delimeted log file.  This class can be 
 * used to create various types of "separated-value" log files, including
 * comma and tab separated.
 *
 */
public class DelimetedFileDecoratorLogger 
{
	public static final Comparator<Node> NODE_SORTER = new Comparator<Node>() {
		public int compare(Node n1, Node n2) {
			String s1 = n1.getURI().toString();
			String s2 = n2.getURI().toString();
			return s1.compareTo(s2);
		}
	};
	
	
	private final List<String> EXCLUDED_NODES = new ArrayList<String>(Arrays.asList(Constants.EXCLUDED_NODE_DEFAULTS));
	
	private final Map<StateLevelMap, DelimetedWriter> logWriters = new HashMap<StateLevelMap, DelimetedWriter>();
	
	private final Map<Integer, List<Node>> sortedNodeList = new HashMap<Integer, List<Node>>();
	
	private final DelimetedFileSimulationLogger simulationLogger;
	
	protected final IntegrationDecorator decorator;
	
	private final CSVLogger logger;


	private File logDirectory;
	
	private Map<Node,Integer> nodeLevels;
	
	private String decoratorName;
	
	private TimeProvider timeProvider;
	
	private static final String NOT_SET = "null";
	
	//private int interationCount = 0;

	private boolean logIntegers = false;
	private boolean beforeStart = true;

	private List<Integer> resolutionLevels;
	private Map<String,EList<String>> identifierProperties;

	private boolean setupComplete = false;
	
	/**
	 * 
	 * @param simulationLogger
	 * @param decorator
	 */
	public DelimetedFileDecoratorLogger(DelimetedFileSimulationLogger simulationLogger, IntegrationDecorator decorator) {
		this.simulationLogger = simulationLogger;
		this.decorator = decorator;
		this.logger = simulationLogger.getLogger();
		
//		decorator.getURI().trimQuery()
		URI baseDecoratorURI = decorator.getURI().trimQuery();
		identifierProperties = logger.getDecoratorProperties(baseDecoratorURI);
		
	}

	/**
	 * This constructor is only used when "cloning" a logger from a parent logger to log evolving disease models
	 * @param simulationLogger
	 * @param decorator
	 * @param noSummaries
	 */
	public DelimetedFileDecoratorLogger(DelimetedFileSimulationLogger simulationLogger, IntegrationDecorator decorator, boolean noSummaries) {
		
		this.simulationLogger = simulationLogger;
		this.decorator = decorator;
		this.logger = simulationLogger.getLogger();
		
//		decorator.getURI().trimQuery()
		URI baseDecoratorURI = decorator.getURI().trimQuery();
		identifierProperties = logger.getDecoratorProperties(baseDecoratorURI);
		if(noSummaries) {
			this.logger.setLogHtmlSummary(false);// only true for the first parent - not the children
			this.logger.setLogRunParameters(false); // only true for the first parent - not the children
		}
		
		/*this.simulationLogger = parentLogger.simulationLogger;
		this.decorator = decorator;
		this.logger = simulationLogger.getLogger();
		this.identifierProperties = new HashMap<String,EList<String>>();
		this.identifierProperties.putAll(parentLogger.identifierProperties); 
		
		// clone from parent
		this.getDecoratorName(); // private String decoratorName;
		EXCLUDED_NODES.addAll(parentLogger.EXCLUDED_NODES);
		//sortedNodeList.putAll(parentLogger.sortedNodeList);
		
		this.getLogDirectory(); // private File logDirectory;
		
		this.logIntegers = parentLogger.logIntegers;
		this.beforeStart = parentLogger.beforeStart;
		
		this.getTimeProvider(); //private TimeProvider timeProvider;
		this.logger.setLogHtmlSummary(false);// only true for the first parent - not the children
		this.logger.setLogRunParameters(false); // only true for the first parent - not the children
		//logWriters.putAll(parentLogger.logWriters);  => done by logger.start
		this.start();
		//nodeLevels.putAll(parentLogger.nodeLevels);
		//this.resolutionLevels.addAll(parentLogger.resolutionLevels);
		//this.identifierProperties.putAll(parentLogger.identifierProperties);
*/	
	}
	

	/**
	 * Starts the decorator logger.  If enabled, writes the 
	 * simulation parameters then sets up each log writer for the given properties
	 */
	public void start() 
	{
		
		setupPropertyLoggers();
		
		
		
		setupComplete = true;
	}

	/**
	 * Stops the decorator logger.  Flushes and closes each log writer
	 */
	public void stop() 
	{
		flush();
		for (DelimetedWriter fw : logWriters.values()) {
			FileUtils.safeClose(fw);
		}
		logWriters.clear();
		nodeLevels = null;
	}
	
	/**
	 * Flushes the buffer on each of the log writers
	 */
	public void flush()
	{
		for (DelimetedWriter fw : logWriters.values()) {
			try {
				fw.flush();
			} catch (IOException e) {
			}
		}
	}
	
	/**
	 * Writes the current label property values for each node at the given simulation step time
	 * 
	 * @param event
	 */
	public void log() 
	{
		if (!setupComplete) {
			start();
		}
		
		
		//interationCount++;
		
		int stepNumber = getSequencer().getCycle();

		Set<String> decoratorPopulations = identifierProperties.keySet();
		
		for (Integer resolution : getResolutionLevels()) {
			for (Node node : getSortedNodesForAdminlevel(resolution, nodeLevels)) {
				for (String populationIdentifier : decoratorPopulations) {
					
					EList<String> itemPropertiesToLog = identifierProperties.get(populationIdentifier);
					
					NodeLabel label = getMatchingLabel(node, populationIdentifier);
					if(label == null || !(label instanceof IntegrationLabel)) {
						continue;
					}

					IntegrationLabel dmLabel = (IntegrationLabel)label;					
					IntegrationLabelValue labelValue = (IntegrationLabelValue)dmLabel.getCurrentValue();					

					for (IItemPropertyDescriptor itemDescriptor : getPropertiesForLabel(dmLabel)) {
						if (!itemPropertiesToLog.contains(itemDescriptor.getId(null))) {
							continue;
						}
						
						StateLevelMap key = new StateLevelMap(populationIdentifier, itemDescriptor.getDisplayName(itemDescriptor), resolution);
						DelimetedWriter fw = logWriters.get(key);
						if(fw == null) {
							continue;
						}
						
						try {
							// Before writing the values for the first location,
							// add iteration, time columns
							if(fw.isEmptyLine()) {
								fw.writeEntry(stepNumber);
								fw.writeEntry(Constants.LOG_DATE_FORMATTER.format(getScenarioTime().getTime()));
							}
							
							// Get the feature and label value for the feature
							EStructuralFeature feature = (EStructuralFeature) itemDescriptor.getFeature(null);
							double value = ((Double)labelValue.eGet(feature)).doubleValue();

							if(logIntegers) {
								fw.writeEntry((int)Math.rint(value));
							} else {
								fw.writeEntry(value);
							}
						} catch (IOException ioe) {
							// If an IO Exception occurs, then close the log file
							Activator.logError(Messages.DFDL_LogFileWriteError, ioe);
							FileUtils.safeClose(fw);
							logWriters.remove(key);
						}
					} // For each property in label
				} // For each population identifier
			} // For each node				
		} //  For each node resolution
		
		// After all iteration data is written, add a new line to the log files where needed
		appendLineToLogWriters();
		
		if (beforeStart) {
			beforeStart = false;
		}
	}
	

	
	/**
	 * Adds a new line character to each log file writer if there is content on the line
	 */
	private void appendLineToLogWriters()
	{
		Iterator<Entry<StateLevelMap, DelimetedWriter>> writers = logWriters.entrySet().iterator();
		
		// Make sure we're at a new line for each log writer that was modified
		while (writers.hasNext()) {
			DelimetedWriter fw = writers.next().getValue();
			if (!fw.isEmptyLine()) {
				try {
					fw.newLine();
				} catch (IOException ioe) {
					// If an IO Exception occurs, then close the log file
					Activator.logError(Messages.DFDL_LogFileWriteError, ioe);
					FileUtils.safeClose(fw);
					writers.remove();
				}
			}
		}
	}

	/**
	 * @return The human readable name of the decorator
	 */
	private String getDecoratorName()
	{
		if (decoratorName == null) {
			if(decorator instanceof DiseaseModel) {
				decoratorName = ((DiseaseModel)decorator).getDiseaseName().trim();
			} else if (decorator instanceof PopulationModel) {
				decoratorName = ((PopulationModel)decorator).getName().trim();
			} else {
				decoratorName = decorator.eClass().toString();
			}
		}
		return decoratorName;
	}

	/**
	 * accessor for the CSV logger
	 * @return
	 */
	public CSVLogger getLogger() {
		return logger;
	}

	/**
	 * @return The base directory for all log files for this simulation & decorator
	 */
	protected File getLogDirectory()
	{
		if (logDirectory == null) {
			logDirectory = new File(simulationLogger.getLogDirectory(), getDecoratorName());
			if (!logDirectory.exists() && !logDirectory.mkdirs()) {
				Activator.logError(Messages.DFDL_CreateDirectoryError+ getDecoratorName(), new IOException(Messages.DFDL_CreateDirectoryException+ logDirectory.getAbsolutePath()));
			}
		}
		
		return logDirectory;
	}

	/**
	 * @return The path to the file containing simulation parameters
	 */
	private File getRunParametersFile() 
	{
		return new File(getLogDirectory(), Constants.RUN_PARAMETER_FILE_NAME);
	}

	/**
	 * @return The correct sequencer time for the simulation
	 */
	private STEMTime getScenarioTime()
	{
		STEMTime time = getTimeProvider().getTime();
		if(time == null) {
			time = getSequencer().getStartTime();
		}
		if(!beforeStart) {
			time = time.addIncrement(getSequencer().getTimeDelta());
		}
		return time;
	}

	
	private Sequencer getSequencer()
	{
		return simulationLogger.getSimulation().getScenario().getSequencer();
	}

	/**
	 * Create and write the parameters for this simulation
	 */
	protected void writeRunParameters() 
	{
		if (decorator == null) {
			return;
		}

		DelimetedWriter fwp = null;
		try {
			fwp = new DelimetedWriter(logger.getDelimeter(), logger.getBufferSize(), new FileWriter(getRunParametersFile()));

			final ComposedAdapterFactory itemProviderFactory = new ComposedAdapterFactory(
					ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
			final IItemPropertySource propertySource = (IItemPropertySource) itemProviderFactory
					.adapt(decorator, IItemPropertySource.class);
			final List<IItemPropertyDescriptor> properties = propertySource
					.getPropertyDescriptors(decorator);

			List<String> header = new ArrayList<String>();
			List<String> values = new ArrayList<String>();

			for (IItemPropertyDescriptor descriptor : properties) {
				final EStructuralFeature feature = (EStructuralFeature) descriptor.getFeature(null);
				
				// Omit Dublin Core values from the log file
				if (CommonPackage.eINSTANCE.getDublinCore().equals(feature.getEContainingClass())) {
					continue;
				}
				header.add(feature.getName());
				Object target = ((EObject) decorator).eGet(feature);
				if(target!=null) {
					String nextValue = target.toString().replace(",","_"); // make sure we do nto write commas in the csvLog
					values.add(nextValue);
				} else {
					values.add(NOT_SET);
				}
				
				
				
			}

			fwp.writeLine(header);
			fwp.writeLine(values);

		} catch (final IOException e) {
			Activator.logError(Messages.DFDL_WriteRunParametersError, e);
		} finally {
			FileUtils.safeClose(fwp);
		}
	}

	
	/**
	 * Get the path to the log file to write for the simulation/population/decorator property/admin level
	 * 
	 * @param populationIdentifier
	 * @param decoratoryPropertyName
	 * @param adminLevel
	 * @return
	 */
	private File getLogFileForProperty(String populationIdentifier, String decoratoryPropertyName, int adminLevel)
	{
		File populationDirectory = new File(getLogDirectory(), populationIdentifier);
		if (!populationDirectory.exists() && !populationDirectory.mkdirs()) {
			Activator.logWarning(Messages.DFDL_CreatePopulationDirectoryError+ populationDirectory.toString(), null);
		}
		
		StringBuilder fileName = new StringBuilder();
		fileName.append(decoratoryPropertyName);
		fileName.append("_"); //$NON-NLS-1$
		fileName.append(adminLevel);
		fileName.append("."); //$NON-NLS-1$
		fileName.append(Constants.LOG_FILE_SUFFIX);
		
		return new File(populationDirectory, fileName.toString());
	}
	

	
	/**
	 * Creates a log file writer for a Property and Population for a given admin level.  Creates the
	 * log file and 
	 * @param populationIdentifier
	 * @param propertyDisplayName
	 * @param adminLevel
	 * @return
	 */
	private DelimetedWriter createLogger(String populationIdentifier, String propertyDisplayName, int adminLevel)
	{
		File propertyLogFile = getLogFileForProperty(populationIdentifier, propertyDisplayName, adminLevel);
		
		DelimetedWriter fw = null;
		boolean fileHasData = false;
		try {
			fw = new DelimetedWriter(logger.getDelimeter(), logger.getBufferSize(),  new FileWriter(propertyLogFile));

			fw.writeEntry(Constants.ITERATION_LABEL);
			fw.writeEntry(Constants.TIME_LABEL);
			
			for (Node node : getSortedNodesForAdminlevel(adminLevel, nodeLevels)) {
				NodeLabel labelToWrite = getMatchingLabel(node, populationIdentifier);
				if(labelToWrite != null) {
					fileHasData = true;
					fw.writeEntry(filterLocationId(node.getURI().toString()));
				}
			}

			fw.newLine();
		} catch (IOException ioe) {
			Activator.logError(Messages.DFDL_LoggerCreateError+ propertyLogFile.toString(), ioe);
			fileHasData = false;
		} finally {
			if (!fileHasData) {
				FileUtils.safeClose(fw);
				fw = null;
				try {
					propertyLogFile.delete();
				} catch (Throwable t) {
					// do nothing
				}
			}
		}
		return fw;
	}
	
	/**
	 * Setup and create log file writers for each individual property in 
	 * the decorator that contains data to write.
	 */
	private void setupPropertyLoggers()
	{
		nodeLevels = SimulationUtils.getNodeLevelsForScenario(simulationLogger.getSimulation().getScenario());

		// Get the first label we'll write for the decorator
		IntegrationLabel label = getFirstLabelForDecorator();
		if (label == null) {
			Activator.logError(Messages.DFDL_NoDecoratorLabels+ getDecoratorName(), new Exception());
			return;
		}
		
		// Get the properties for that label
		List<IItemPropertyDescriptor>properties = getPropertiesForLabel(label);
		if (properties == null) {
			Activator.logError(Messages.DFDL_NoLabelProperties+label, null);
			return;
		}
			
		// Get the population identifiers for the label
		Set<String> populationIdentifiers = identifierProperties.keySet();
		if (populationIdentifiers == null) {
			Activator.logError(Messages.DFDL_NoDecoratorPopulations+ getDecoratorName(), null);
			return;
		}
		
		// The log file is setup as:
		// Population / Level / Decorator
		// Iterate through the individual lists to setup the individual log files		
		for (String populationIdentifier : populationIdentifiers) {
			for (Integer level : getResolutionLevels()) {
				EList<String> itemPropertiesToLog = identifierProperties.get(populationIdentifier);
				for (IItemPropertyDescriptor decoratorProperty : properties) {
					if (itemPropertiesToLog.contains(decoratorProperty.getId(null))) {
						String propertyName = decoratorProperty.getDisplayName(decoratorProperty);
						DelimetedWriter fw = createLogger(populationIdentifier, propertyName, level);
						if (fw != null) {
							logWriters.put(new StateLevelMap(populationIdentifier, propertyName, level), fw);
						}
					}
				}
			}
		}
	}
	
	/**
	 * @return The first log-able label for the decorator
	 */
	private IntegrationLabel getFirstLabelForDecorator()
	{
		for (DynamicLabel label : ((Decorator)decorator).getLabelsToUpdate()) {
			if(label instanceof IntegrationLabel) {
				return (IntegrationLabel)label;
			}
		}
		return null;
	}
	

	/**
	 * Gets the relative value properties for the given label
	 * @param label
	 * @return
	 */
	private List<IItemPropertyDescriptor> getPropertiesForLabel(DynamicLabel label)
	{
		final RelativeValueProviderAdapter rvp = (RelativeValueProviderAdapter) RelativeValueProviderAdapterFactory.INSTANCE.adapt(label, RelativeValueProvider.class);
		return rvp.getProperties();
	}
	
	
	/**
	 * @return The population identifiers for the decorator
	 */
//	private List<String> getPopulationIdentifiers() {
//		if (decorator instanceof DiseaseModel) {
//			return ((DiseaseModel) decorator).getAllLabelIdentifiers();
//		} else if (decorator instanceof PopulationModel) {
//			return ((PopulationModel) decorator).getAllLabelIdentifiers();
//		}
//		
//		return new ArrayList<String>();
//	}
	
	/**
	 * @return The list of admin levels in the list of nodes
	 */
	private List<Integer> getResolutionLevels() {
		if(resolutionLevels == null) {
			resolutionLevels = new ArrayList<Integer>();
			for(Integer level : nodeLevels.values()) {
				if(!resolutionLevels.contains(level)) {
					resolutionLevels.add(level);
				}
			}
		}
		
		return resolutionLevels;
	}
	

	/**
	 * @param node The node to test
	 * @return Whether the node is to be excluded from logging
	 */
	private boolean isExcludedNode(Node node)
	{
		for (String key : EXCLUDED_NODES) {
			if (node.getURI().toString().contains(key)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Gets and sorts all nodes assigned to a specific administrative level.
	 * 
	 * @param level The admin level to get nodes for
	 * @param nodeLevels The node level list to scan
	 * @return
	 */
	private List<Node> getSortedNodesForAdminlevel(int level, Map<Node, Integer>nodeLevels)
	{
		List<Node> list = sortedNodeList.get(level);
		if (list == null) {
			list = new ArrayList<Node>();
			// Iterate through the list of nodes
			for (Entry<Node,Integer> entry : nodeLevels.entrySet()) {
				// If node level is equal to the current level
				if (entry.getValue() == level) {
					Node node = entry.getKey();
					
					// Look through the labels to determin if we're going to write this node
					for (NodeLabel s : node.getLabels()) {
						if (s instanceof IntegrationLabel) {
							// If the node contains an integration label and is 
							// not in the exclusion list, then add to the list for writing
							if (!isExcludedNode(node)) {
								list.add(entry.getKey());
							}
							break;
						}
					}
				}
			}
			// Sort the list by applying the comparator
			Collections.sort(list, NODE_SORTER);
			
			sortedNodeList.put(level, list);
		}
		return list;
	}
	
	
	
	/**
	 * Gets the correct label for the given node, decorator, and population identifier
	 * 
	 * @param n Node to get label from
	 * @param popId Population identifier to test
	 * @return The matching node label
	 */
	private NodeLabel getMatchingLabel(Node n, String popId) {
		for(NodeLabel label:n.getLabels()) {
			if (decorator instanceof DiseaseModel 
					&& label instanceof DiseaseModelLabel 
						&& ((DiseaseModelLabel)label).getDecorator().equals(decorator) 
							&& ((DiseaseModelLabel)label).getPopulationModelLabel().getPopulationIdentifier().equals(popId)) {
				return label;		
			} else if (decorator instanceof PopulationModel 
						&& label instanceof PopulationModelLabel
							&& ((PopulationModelLabel)label).getDecorator().equals(decorator) 
								&& ((PopulationModelLabel)label).getPopulationIdentifier().equals(popId)) {
				return label;
			}
		
		}
		return null;
	}
	
	/**
	 * filters the location id prefix from the beginning of
	 *  a nodes ID for generation of a file name
	 * @param unfiltered
	 * @return the filtered file name using location id.
	 */
	private String filterLocationId(String unfiltered) {
		int last = unfiltered.indexOf(Constants.LOCATION_ID_PREFIX);
		if (last >= 0) {
			last += Constants.LOCATION_ID_PREFIX.length();
			return unfiltered.substring(last, unfiltered.length());
		} 
		return unfiltered;
	}
	
	
	/**
	 * @return The time provider for the canonical graph
	 */
	private TimeProvider getTimeProvider()
	{
		if (timeProvider == null) {
			timeProvider = (TimeProvider) TimeProviderAdapterFactory.INSTANCE
					.adapt(simulationLogger.getSimulation().getScenario().getCanonicalGraph(), TimeProvider.class);
		}
		
		return timeProvider;
	}
	
	
	/**
	 * Used as key in map with FileWriters. FileWriters are key'd by
	 * the label (i.e. disease state) and by 
	 */
	private static class StateLevelMap {
		private final String popId;
		private final String state;
		private final int level;
		
		public StateLevelMap(String popId,String state, int level) {
			this.popId = popId;
			this.state = state;
			this.level = level;
		}
		
		public String getPopulationId() {return this.popId;}
		public int getLevel() {return this.level;}
		public String getState() {return this.state;}
		
		@Override
		public int hashCode() {
			return state.hashCode()+popId.hashCode() + level; // ugh
		}
		
		@Override
		public boolean equals(Object o) {
			if(!(o instanceof StateLevelMap)) return false;
			StateLevelMap slm = (StateLevelMap)o;
			return (slm.getState().equals(this.state) && slm.getPopulationId().equals(this.popId) && slm.getLevel() == level);
		}
		
		@Override
		public String toString() {
			return this.popId+" - "+this.state+"_"+this.level; //$NON-NLS-1$ //$NON-NLS-2$
		}
	}
}
