// CSVLogWriter
package org.eclipse.stem.util.loggers.views;

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

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.stem.adapters.time.TimeProvider;
import org.eclipse.stem.core.STEMObjectPool;
import org.eclipse.stem.core.Utility;
import org.eclipse.stem.core.common.CommonPackage;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.graph.IntegrationLabelValue;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.model.IntegrationDecorator;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProvider;
import org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProviderAdapter;
import org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProviderAdapterFactory;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.jobs.simulation.ISimulation;
import org.eclipse.stem.populationmodels.standard.PopulationModel;
import org.eclipse.stem.populationmodels.standard.PopulationModelLabel;
import org.eclipse.stem.util.loggers.Activator;
import org.eclipse.stem.util.loggers.preferences.PreferenceConstants;

/**
 * A log writer writing CSV files containing data for a single state of the
 * simulation. Columns contain location IDs as well as simulation time and
 * iteration id.
 */

public class NewCSVLogWriter extends LogWriter {

	// The buffer size (per log file) to use.
	private final static int BUFSZ = 1024 * 1024; // 1 MB
	
	private static final String CSV_EXT = ".csv";

	private static final String AIR_TRANSPORT_URI_DUPLICATE_FEATURE = "node/transport/pipe";

	/**
	 * 
	 */
	private String directoryName;

	/**
	 * 
	 */
	private String logDataObjectName;

	// private final static String DUBLIN_CORE_CLASS = "DublinCore";

	private static SimpleDateFormat dateFormat = new SimpleDateFormat(
			"EEE d MMM yy", Locale.getDefault());

	/**
	 * CSV Header Label for time column
	 */
	public static final String TIME_LABEL = "time";

	/**
	 * CSV Header Label for iteration column
	 */
	public static final String ITERATION_LABEL = "iteration";

	/**
	 * Name of all run parameter files (one per scenario folder)
	 */
	public static final String RUN_PARAMETER_FILE_NAME = "runparameters.csv";

	/**
	 * File name for the EMF serialized decorator
	 */
	public static final String DECORATOR_FILE_NAME = "decorator.XMI";

	
	/**
	 * Header in runparameters.csv file for column containing decorator class name
	 */
	
	public static final String DECORATOR_RUNPARAM_COLUMN_HEADER = "decorator";
	
	private int icount = 0;

	/**
	 * FileWriters are stored here, organized by state (e.g. S, E, I, R) and
	 * geographic level
	 */

	private final Map<StateLevelMap, BufferedWriter> fileWriters;

	private boolean logIntegers;

	// Pool string builders.
	
	STEMObjectPool sbPool = new STEMObjectPool(5, 5) {
			
		@Override
		protected Object createNewObject() {
			return new StringBuilder();
		}

		@Override
		protected void resetObject(@SuppressWarnings("unused") Object o) {
			// Nothing to do 
			
		}
	};
		
	
	// Keep a map to determine what type of relative value provider each label value needs (avoids creating a new one for each label value!)
	Map<IntegrationLabelValue, RelativeValueProviderAdapter> labelRelativeValueProviderMap = new HashMap<IntegrationLabelValue, RelativeValueProviderAdapter>();
	
	/**
	 * 
	 * @param dirName
	 * @param simulation
	 * @param dm
	 * @param logParameters
	 */
	public NewCSVLogWriter(final String dirName, final ISimulation simulation,
			IntegrationDecorator dm, boolean logParameters) {
		logIntegers = Activator.getDefault().getPreferenceStore()
				.getBoolean(PreferenceConstants.LOG_INTEGER_PREFERENCE);
		fileWriters = new HashMap<StateLevelMap, BufferedWriter>();
		this.directoryName = dirName;

		needsHeader = true;
		done = false;
		icount = 0;

		// append the disease name or population type
		if (dm instanceof DiseaseModel) {
			logDataObjectName = ((DiseaseModel) dm).getDiseaseName().trim();
		} else if (dm instanceof PopulationModel) {
			logDataObjectName = ((PopulationModel) dm).getName().trim();
		}

		if (logDataObjectName == null) {
			Activator
					.logError(
							"Failed to find a disease or population model.  Cannot create CSV Logger",
							null);
			return;
		}

		this.directoryName += logDataObjectName + sep;

		// remove illegal strings
		directoryName = directoryName.replaceAll("\"", "");

		final File dir = new File(this.directoryName);

		if ((!dir.exists()) || (!dir.isDirectory())) {
			// create it.
			boolean success = dir.mkdirs();
			if (!success) {
				Activator.logError(
						"Failed to Create Driectory" + directoryName,
						new IOException("Failed to Create Driectory"
								+ directoryName));
			}

		}

		if (logParameters) {
			logRunParameters(dm);
		}

	} // NewCSVLogWriter

	/**
	 * Must implement this method to log data in run thread
	 * 
	 * @param rvp
	 * 
	 */
	@Override
	public void logHeader(final RelativeValueProviderAdapter rvp) {
		/*
		 * TODO do we need a header?
		 */
	}// log header

	/**
	 * logHeader New method
	 * 
	 * @param sim
	 *            Simulation to log
	 * @param dm
	 *            Disease Model
	 * @param nodeLevels
	 *            Level information for each node in the simulation
	 * @param timeProvider
	 *            Time provider
	 */

	@SuppressWarnings("unused")
	@Override
	public void logHeader(ISimulation sim, IntegrationDecorator dm,
			Map<Node, Integer> nodeLevels, TimeProvider timeProvider) {

		int headerItemCount = 0;

		String dirs = this.directoryName;
		File dir = new File(dirs);
		if (!dir.exists()) {
			boolean success = dir.mkdirs();
			if (!success) {
				Activator.logError(
						"Failed to Create Driectory" + directoryName,
						new IOException("Failed to Create Driectory"
								+ directoryName));
			}
		}
		// Find min/max level
		int minLevel = Integer.MAX_VALUE;
		int maxLevel = -1;
		for (int level : nodeLevels.values()) {
			if (level < minLevel)
				minLevel = level;
			if (level > maxLevel)
				maxLevel = level;
		}
		try {
			List<String> populationIdentifiers = getPopulationIdentifiers(dm);

			for (String pid : populationIdentifiers) {
				// Get the first node in the canonical graph and look at the
				// labels.
				// We will generate one log file for each label
				// Find the first node that has some labels and use those as
				// representative labels
				// for every node

				IntegrationLabel label = null;
				Iterator<DynamicLabel> it = ((Decorator) dm)
						.getLabelsToUpdate().iterator();
				while (it.hasNext()) {
					DynamicLabel l = it.next();
					if (l instanceof IntegrationLabel) {
						label = (IntegrationLabel) getMatchingLabel(dm, ((IntegrationLabel) l).getNode(), pid);
						break;
					}
				}
				
				if (label == null) {
					// We couldn't find any labels. PANIC!
					Activator.logError(
							"Cannot log, no label found for decorator!",
							new Exception());
					return;
				}

				IntegrationLabelValue lval = (IntegrationLabelValue)label.getCurrentValue();
				final RelativeValueProviderAdapter rvp = (RelativeValueProviderAdapter) RelativeValueProviderAdapterFactory.INSTANCE
						.adapt(lval, RelativeValueProvider.class);
				
				rvp.setTarget(lval);
				List<IItemPropertyDescriptor> properties = rvp.getProperties();
				
				lval.eAdapters().clear(); // Get rid of notifications being generated!
				
				if (properties == null)
					Activator.logError("Cannot retrieve properties for "
							+ label, null);
				
				 
				
				for (IItemPropertyDescriptor property : properties) {
					for (int level = minLevel; level <= maxLevel; ++level) {

						boolean fileHasData = false;
						StateLevelMap slm = new StateLevelMap(pid,
								property.getDisplayName(property), level);
						File pdir = new File(dirs + pid + sep);
						if (!pdir.exists()) {
							if (!pdir.mkdir()) {
								throw new IOException(
										"Error creating log store directories: "
												+ pdir.getAbsolutePath());
							}
						}
						String file = dirs + pid + sep
								+ property.getDisplayName(property) + "_"
								+ level + CSV_EXT;
						BufferedWriter fw = new BufferedWriter(new FileWriter(
								file), BUFSZ); // 10 MB

						List<Node> nodeList = this.getNodeList(
								level, nodeLevels);
						// Iterate over nodes for a given resolution
						fw.write(ITERATION_LABEL);
						fw.write(",");
						fw.write(TIME_LABEL);

						int nodeCount = 0;

						for(int i=0;i<nodeList.size();++i) {
							Node node = nodeList.get(i);
							NodeLabel mLabel = getMatchingLabel(dm, node, pid);
							if (mLabel == null)
								continue;
							labelRelativeValueProviderMap.put((IntegrationLabelValue)mLabel.getCurrentValue(), rvp);
							String nodeURI = node.getURI().toString();
							if (nodeURI
									.indexOf(AIR_TRANSPORT_URI_DUPLICATE_FEATURE) >= 0)
								continue;
							fileHasData = true;
							String id = this.filterLocationId(node.getURI()
									.toString());
							fw.write(",");
							fw.write(id);
							headerItemCount++;
							nodeCount++;
						}

						fw.write("\n");
						if (fileHasData) {
							// register the writer
							fileWriters.put(slm, fw);
						} else {
							// don't ever write empty files
							fw.flush();
							fw.close();
							File toDelete = new File(file);
							toDelete.delete();
							fw = null;
						}
					}
				}
			}// all properties

			needsHeader = false;
		} catch (IOException ioe) {
			Activator.logError("Error writing log header ", ioe);
		}

	}

	/**
	 * Returns true if the node has a label that is updated by the decorator.
	 * 
	 * @param dm
	 * @param n
	 * @param popId
	 * @return The label of the correct type matching the population identifier,
	 *         or null if not found
	 */
	private NodeLabel getMatchingLabel(IntegrationDecorator dm, Node n,
			String popId) {
		for (NodeLabel label : n.getLabels())
			if (dm instanceof DiseaseModel
					&& label instanceof DiseaseModelLabel
					&& ((DiseaseModelLabel) label).getDecorator().equals(dm)
					&& ((DiseaseModelLabel) label).getPopulationModelLabel()
							.getPopulationIdentifier().equals(popId))
				return label;
			else if (dm instanceof PopulationModel
					&& label instanceof PopulationModelLabel
					&& ((PopulationModelLabel) label).getDecorator().equals(dm)
					&& ((PopulationModelLabel) label).getPopulationIdentifier()
							.equals(popId))
				return label;
		return null;
	}

	/**
	 * Return all the population identifiers the decorator manages
	 * 
	 * @param id
	 * @return ArrayList<String> The population identifiers
	 */

	private List<String> getPopulationIdentifiers(IntegrationDecorator id) {
		if (id instanceof DiseaseModel) {
			return ((DiseaseModel) id).getAllLabelIdentifiers();
		} else if (id instanceof PopulationModel) {
			return ((PopulationModel) id).getAllLabelIdentifiers();
		}

		return null;
	}

	/**
	 * Creates a log file for run parameters. Only one of these is created per
	 * diseaseFolder
	 * 
	 * @param dm
	 *            Disease Model
	 */

	public void logRunParameters(IntegrationDecorator dm) {
		if (dm == null) { // check
			return;
		}

		try {
			final FileWriter fwp = new FileWriter(directoryName
					+ RUN_PARAMETER_FILE_NAME);

			final ComposedAdapterFactory itemProviderFactory = new ComposedAdapterFactory(
					ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

			final IItemPropertySource propertySource = (IItemPropertySource) itemProviderFactory
					.adapt(dm, IItemPropertySource.class);

			final List<IItemPropertyDescriptor> properties = propertySource
					.getPropertyDescriptors(dm);

			StringBuilder header = new StringBuilder();
			StringBuilder values = new StringBuilder();

			for (int i = 0; i < properties.size(); ++i) {
				IItemPropertyDescriptor descriptor = properties.get(i);
				final EStructuralFeature feature = (EStructuralFeature) descriptor
						.getFeature(null);

				EClass containingClass = feature.getEContainingClass();
				if (containingClass.equals(CommonPackage.eINSTANCE
						.getDublinCore()))
					continue;

				Object value = ((EObject) dm).eGet(feature);
				header.append(feature.getName());
				header.append(",");
				value = value.toString().replace(',', ' ');
				value = value.toString().replace('\n', ' ');
				values.append(value.toString().replace(',', ' '));
				values.append(",");
			}
			header.setLength(header.length() - 1); // drop last ,
			values.setLength(values.length() - 1); // drop last ,
			
			// Insert first column containing class name of the decorator
			header.insert(0,  DECORATOR_RUNPARAM_COLUMN_HEADER+",");
			String className = dm.getClass().getName();
			values.insert(0,  className+",");
			
			fwp.write(header.toString());
			fwp.write("\n");
			fwp.write(values.toString());
			fwp.flush();
			fwp.close();
			
			// Serialize the decorator using EMF serialization as well
			// to capture the complete picture
			
			URI serializationURI = URI.createFileURI(directoryName+DECORATOR_FILE_NAME);
			Decorator copyDM = EcoreUtil.copy(dm);
			Utility.serializeIdentifiableKeepDefaults(copyDM, serializationURI);
			copyDM = null;
		} catch (final IOException e) {
			// debugging for now
			Activator.logError("Error creating file writer for RUNPARAMETER ",
					e);

		}

	}// logRunParameters

	/**
	 * Must implement this method to log data in run thread Need to implement
	 * TimeProviderAdapterFactory.INSTANCE.adapt().....only Graph will work
	 * right now....later in CORE
	 * 
	 * @param rvp
	 * @param timeProvider
	 */
	@Override
	public void logData(final RelativeValueProviderAdapter rvp,
			final TimeProvider timeProvider) {
		// Not used
	}// log data

	// We need to do some caching here to speed up execution
	Map<Node, Integer> currentNodeLevels = null;
	List<Integer> currentResolutionList = null;
	Map<Integer, List<Node>> currentSortedNodeListMap = null;

	
	
	/**
	 * Log data from from a simulation after cycle
	 * 
	 * @param sim
	 *            Simulation
	 * @param dm
	 *            DiseaseModel
	 * @param nodeLevels
	 *            Node levels
	 * @param timeProvider
	 * @param beforeStart
	 */

	@SuppressWarnings("boxing")
	@Override
	public void logData(ISimulation sim, IntegrationDecorator dm,
			Map<Node, Integer> nodeLevels, TimeProvider timeProvider,
			boolean beforeStart) {
	
		// Increment iteration count
		this.icount++;

		List<String> decoratorPopulations = this.getPopulationIdentifiers(dm);
		Set<StateLevelMap> firstNode = new HashSet<StateLevelMap>();
		
		firstNode.addAll(fileWriters.keySet());		

		try {
			// Iterate over the map resolutions
			List<Integer> resolutionList = this.getResolutionList(nodeLevels);
			for(int i=0;i<resolutionList.size();++i) {
				int resolution = resolutionList.get(i);

				List<Node> nodeList = this.getNodeList(resolution,
						nodeLevels);
				
				// Iterate over nodes for a given resolution

				for(int j=0;j<nodeList.size();++j) { 
					Node n = nodeList.get(j);

					for (String popId : decoratorPopulations) {						
						NodeLabel mLabel = getMatchingLabel(dm, n, popId);
						if (mLabel == null)
							continue;

						if (!(mLabel instanceof IntegrationLabel))
							continue; // Check

						IntegrationLabel dmLabel = (IntegrationLabel) mLabel;

						IntegrationLabelValue dmlv = (IntegrationLabelValue) dmLabel.getCurrentValue();
						final RelativeValueProviderAdapter rvp = labelRelativeValueProviderMap.get(dmlv);
						if(rvp == null) {
							Activator.logError("Error no rvp found for label "+mLabel, new Exception());
						}
						
//						final RelativeValueProviderAdapter rvp = (RelativeValueProviderAdapter) RelativeValueProviderAdapterFactory.INSTANCE
//								.adapt(mLabel, RelativeValueProvider.class);
						rvp.setTarget(dmlv);
						List<IItemPropertyDescriptor> properties = rvp
								.getProperties();
						dmlv.eAdapters().clear();
						

						StringBuilder sb = (StringBuilder)sbPool.get();
						
						for(int k=0;k<properties.size();++k) {
							sb.setLength(0);
							IItemPropertyDescriptor itemDescriptor = properties.get(k);
							StateLevelMap slm = new StateLevelMap(popId,
									itemDescriptor.getDisplayName(itemDescriptor),
									resolution);
							BufferedWriter fw = fileWriters.get(slm);
							if (fw == null) {
								Activator.logError(
										"Error, no file writer found for "
												+ slm, null);
								continue;
							}
							// Before writing the values for the first location,
							// add iteration, time columns

							if (firstNode.contains(slm)) {
								firstNode.remove(slm);
								sb.append(this.icount);
								sb.append(",");
								STEMTime time = timeProvider.getTime();
								if (time == null) {
									time = sim.getScenario().getSequencer()
											.getStartTime();
								}
								if (!beforeStart)
									// Add increment
									time = time.addIncrement(sim.getScenario()
											.getSequencer().getTimeDelta());

								String timeString;
								timeString = dateFormat.format(time.getTime());

								sb.append(timeString);
							}

							EStructuralFeature feature = (EStructuralFeature) itemDescriptor
									.getFeature(null);

							double value =dmlv.eGetDouble(((EAttribute)feature).getFeatureID());

							sb.append(",");
							if (logIntegers)
								sb.append(Math.rint(value));
							else
								sb.append(value);

							int sbLength = sb.length();
							for(int l=0;l<sbLength;++l)
								fw.write(sb.charAt(l)); // Avoids toString() creating uncessecary objects
				
						} // For each property in label
						sbPool.release(sb);
					} // For each node label					
				} // For each node

			} // For each node resolution

			// We need to add the end-of-line characters to each log file
			resolutionList = this.getResolutionList(nodeLevels);
			for(int i=0;i<resolutionList.size();++i) {
				int resolution = resolutionList.get(i);

				List<Node> nodeList = this.getNodeList(resolution,
						nodeLevels);

				for(int j=0;j<nodeList.size();++j) {
					Node n = nodeList.get(j);
					boolean wroteEOL = false;
					for (String popId : decoratorPopulations) {
						NodeLabel mLabel = getMatchingLabel(dm, n, popId);
						if (mLabel == null)
							continue;
						if (!(mLabel instanceof IntegrationLabel))
							continue; // Check
						
						IntegrationLabelValue lval = (IntegrationLabelValue)mLabel.getCurrentValue();
						final RelativeValueProviderAdapter rvp = labelRelativeValueProviderMap.get(lval);
						if(rvp == null) {
							Activator.logError("Error no rvp found for label "+mLabel, new Exception());
						}
						rvp.setTarget(lval);
						List<IItemPropertyDescriptor> properties = rvp
								.getProperties();
						for(int k=0;k<properties.size();++k) {
							StateLevelMap slm = new StateLevelMap(popId,
									properties.get(k).getDisplayName(properties.get(k)),
									resolution);
							BufferedWriter fw = fileWriters.get(slm);
							fw.write("\n");
						}
						wroteEOL = true;
					}
					if (wroteEOL)
						break; // We only need a sample of a node to find the
								// file writers
				}
			}
			needsHeader = false;
		} catch (IOException ioe) {
			Activator.logError("Error writing log header ", ioe);
		}

		// Safe to set the current node levels here
		currentNodeLevels = nodeLevels;
	}

	/*
	 * private Graph getGraph(final Node node) { return (Graph)
	 * node.eContainer().eContainer(); } // getGraph
	 */

	/**
	 * Flush and Close the file
	 */
	@Override
	public void flushLoggerData() {
		Collection<BufferedWriter> writers = fileWriters.values();
		for (BufferedWriter writer : writers) {
			try {
				writer.flush();
			} catch (IOException ioe) {
				//Activator.logError("Cannot flush log file", ioe);
			}
		}

	} // flush All Data

	/**
	 * Flush and Close the file
	 */
	@Override
	public void closeLoggerData() {
		Collection<BufferedWriter> writers = fileWriters.values();
		for (BufferedWriter writer : writers) {
			try {
				writer.close();
			} catch (IOException ioe) {
				Activator.logError("Cannot close log file", ioe);
			}
		}
	} // closeLoggerData

	/**
	 * 
	 * @param nodeLevels
	 * @return
	 */
	@SuppressWarnings("boxing")
	private List<Integer> getResolutionList(
			Map<Node, Integer> nodeLevels) {
		if (nodeLevels == currentNodeLevels)
			return currentResolutionList;
		ArrayList<Integer> list = new ArrayList();
		Collection<Integer> vals = nodeLevels.values();
		for (int level : vals) {
			if (!list.contains(level))
				list.add(level);
		}
		currentResolutionList = list;
		return list;
	}

	// Return all nodes at the same level
	// Sort by the name alphabetically for convenience

	@SuppressWarnings("boxing")
	private List<Node> getNodeList(int level,
			Map<Node, Integer> nodeLevels) {
		if (nodeLevels == currentNodeLevels)
			return currentSortedNodeListMap.get(level);

		ArrayList<Node> list = new ArrayList<Node>();
		// Set<Node>ns = nodeLevels.keySet();
		// for(Node n:ns) {
		for (Entry<Node, Integer> entry : nodeLevels.entrySet()) {
			if (entry.getValue() == level) {

				boolean write = false;
				for (NodeLabel s : entry.getKey().getLabels()) {
					if (s instanceof IntegrationLabel) {

						write = true;
						break;
					}
				}
				if (!write) {
					continue;
				}

				// Skip air transport nodes
				if (entry.getKey().getURI().toString()
						.indexOf(AIR_TRANSPORT_URI_DUPLICATE_FEATURE) == -1)
					list.add(entry.getKey());
			}
		}
		Collections.sort(list, new Comparator<Node>() {

			public int compare(Node n1, Node n2) {
				String s1 = n1.getURI().toString();
				String s2 = n2.getURI().toString();
				return s1.compareTo(s2);
			}

		});
		if (currentSortedNodeListMap == null)
			currentSortedNodeListMap = new HashMap<Integer, List<Node>>();
		currentSortedNodeListMap.put(level, list);
		return list;
	}

	/**
	 * filters the location id prefix from the beginning of a nodes ID for
	 * generation of a file name
	 * 
	 * @param unfiltered
	 * @return the filtered file name using location id.
	 */
	private String filterLocationId(String unfiltered) {
		int last = unfiltered.indexOf(LOCATIONID_PREFIX);
		if (last >= 0) {
			last += LOCATIONID_PREFIX.length();
			return unfiltered.substring(last, unfiltered.length());
		}
		return unfiltered;
	}

	/**
	 * Used as key in map with FileWriters. FileWriters are key'd by the label
	 * (i.e. disease state) and by
	 */
	private static class StateLevelMap {
		private final String popId;
		private final String state;
		private final int level;

		public StateLevelMap(String popId, String state, int level) {
			this.popId = popId;
			this.state = state;
			this.level = level;
		}

		public String getPopulationId() {
			return this.popId;
		}

		public int getLevel() {
			return this.level;
		}

		public String getState() {
			return this.state;
		}

		@Override
		public int hashCode() {
			return state.hashCode() + popId.hashCode() + level; // ugh
		}

		@Override
		public boolean equals(Object o) {
			if (!(o instanceof StateLevelMap))
				return false;
			StateLevelMap slm = (StateLevelMap) o;
			return (slm.getState().equals(this.state)
					&& slm.getPopulationId().equals(this.popId) && slm
						.getLevel() == level);
		}

		@Override
		public String toString() {
			return this.popId + " - " + this.state + "_" + this.level;
		}
	}

	/**
	 * get the output folder name
	 * 
	 * @return the log directory name
	 */
	public String getDirectoryName() {
		return directoryName;
	}

	/**
	 * name of the data object being logged. e.g. The Disease Name
	 * 
	 * @return the logged object name
	 */

	public String getLogDataObjectName() {
		return logDataObjectName;
	}
}
