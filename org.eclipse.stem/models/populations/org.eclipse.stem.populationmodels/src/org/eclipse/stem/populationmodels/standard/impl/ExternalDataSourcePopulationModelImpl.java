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
package org.eclipse.stem.populationmodels.standard.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.stem.analysis.util.CSVScenarioStreamer;
import org.eclipse.stem.analysis.util.CSVscenarioLoader;
import org.eclipse.stem.core.Utility;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.common.util.LogInitializationException;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.ExchangePool;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.scenario.ScenarioInitializationException;
import org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProvider;
import org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProviderAdapter;
import org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProviderAdapterFactory;
import org.eclipse.stem.definitions.labels.PopulationLabel;
import org.eclipse.stem.populationmodels.Activator;
import org.eclipse.stem.populationmodels.standard.ExternalDataSourcePopulationModel;
import org.eclipse.stem.populationmodels.standard.PopulationModel;
import org.eclipse.stem.populationmodels.standard.PopulationModelLabel;
import org.eclipse.stem.populationmodels.standard.PopulationModelLabelValue;
import org.eclipse.stem.populationmodels.standard.StandardFactory;
import org.eclipse.stem.populationmodels.standard.StandardPackage;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabel;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabelValue;
import org.eclipse.stem.populationmodels.standard.provider.StandardItemProviderAdapterFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Datasource Population Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.ExternalDataSourcePopulationModelImpl#getDataPath <em>Data Path</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.ExternalDataSourcePopulationModelImpl#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.ExternalDataSourcePopulationModelImpl#isRestart <em>Restart</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalDataSourcePopulationModelImpl extends PopulationModelImpl implements ExternalDataSourcePopulationModel {


	protected Set<String> BIRTH_KEY_SET = new HashSet<String>();
	protected Set<String> DEATHS_KEY_SET = new HashSet<String>();
	protected Set<String> COUNT_KEY_SET = new HashSet<String>();

	public static String labelBirths  = null ;
	public static String labelDeaths  = null ;
	public static String labelCount = null ;  

	// We need to tell the streamer which states are cumulative (so that it can restart streaming and keep adding).
	private String[] cumulativeStates = {"Births", "Deaths"};
	
	// When we know the population model that generated the data (stored in the runparameters file),
	// the descriptors of the properties are stored here, mapped by the population id

	protected Map<String, List<IItemPropertyDescriptor>> propertyDescriptors;


	// Used to detect when the user has restarted a simulation.
	@SuppressWarnings("unused")
	private STEMTime previousTime = null;
	
	// The streamer

	CSVScenarioStreamer streamer;

	private double fileLineCounter = 0.0;

	private String populationType;

	private Decorator populationModel;
	
	/**
	 * This prefix precedes the node id and must be removed in the 
	 * filterFilename method to auto-generate the output file name.
	 */
	public static final String LOCATIONID_PREFIX = "/node/geo/region/";


	/**
	 * The default value of the '{@link #getDataPath() <em>Data Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPath()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataPath() <em>Data Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPath()
	 * @generated
	 * @ordered
	 */
	protected String dataPath = DATA_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getBufferSize() <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferSize()
	 * @generated
	 * @ordered
	 */
	protected static final int BUFFER_SIZE_EDEFAULT = 250;
	/**
	 * The cached value of the '{@link #getBufferSize() <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferSize()
	 * @generated
	 * @ordered
	 */
	protected int bufferSize = BUFFER_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #isRestart() <em>Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRestart()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESTART_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isRestart() <em>Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRestart()
	 * @generated
	 * @ordered
	 */
	protected boolean restart = RESTART_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ExternalDataSourcePopulationModelImpl() {
		super();
	}

	
	/**
	 * Override this method to return static population labels with identifiers found in logged files
	 * 
	 * @param populationIdentifier
	 *            the population being labeled Only used if not found in logged files
	 * @param graph
	 *            the graph to search
	 * @return the PopulationLabel instances of the graph that match the
	 *         identifier.
	 */
	@Override
	protected Collection<PopulationLabel> getPopulationLabels(
			final String populationIdentifier, final Graph graph) {
		final List<PopulationLabel> retValue = new ArrayList<PopulationLabel>();

		// If already done nothing will happen here
		setupStreaming();

		// Iterate through all of the population labels in the graph
		EList<NodeLabel> labels = graph.getNodeLabelsByTypeURI(
				PopulationLabel.URI_TYPE_POPULATION_LABEL);
		for (NodeLabel pl:labels) {
			if(getTargetISOKey() != null && !getTargetISOKey().trim().equals("") && pl.getNode() != null &&  //$NON-NLS-1$
					!isContained(pl.getNode(), getTargetISOKey()) &&
					!pl.getNode().getURI().lastSegment().equals("ZZZ")) //$NON-NLS-1$
				continue;

			final PopulationLabel populationLabel = (PopulationLabel) pl;

			List<String>pops = this.streamer.getPopulationIdentifiers();

			// Is this label for the population we're looking for?
			if(pops == null) {
				if (populationLabel.getPopulationIdentifier().equals(
						populationIdentifier)) {
					// Yes
					// If there is a problem with the "node uri" of the population
					// label then it would not have been associated with a node
					// instance in the graph at this point. This is a problem for
					// disease models that are trying to label the node (there isn't
					// one!). So filter out those mistakes here.

					// Does the population label have an associated node?
					if (populationLabel.getNode() != null) 
						retValue.add(populationLabel);

				} // if the population we're looking for
			} else for(String p:pops)
					if (populationLabel.getPopulationIdentifier().equals(p)) {
						if (populationLabel.getNode() != null) {
							// Yes
							retValue.add(populationLabel);
						} // if the population label has a node

					} // for each population label
			} //  For each label
			return retValue;
		} // getPopulationLabels

	/**
	 * Need to override this to set the initial value to the first row in the log file
	 * @generated NOT
	 */
	
	public void resetLabels() throws ScenarioInitializationException {
		super.resetLabels();
		
		fileLineCounter = 0.0;
		
		try {
			if(streamer != null)
				streamer.close();
		} catch(IOException ioe) {
			throw new ScenarioInitializationException("IOException closing streamer", this, ioe);
		}
		streamer = null;
		setupStreaming();
		
		for (final Iterator<DynamicLabel> labelIter = getLabelsToUpdate()
				.iterator(); labelIter.hasNext();) {
			final StandardPopulationModelLabel popLabel = (StandardPopulationModelLabel) labelIter.next();
			final StandardPopulationModelLabelValue deltaState = (StandardPopulationModelLabelValue)popLabel.getDeltaValue();
			importPopulationData(deltaState, popLabel, null, 0); // last params not used
			while(deltaState.getArrivals().size()>0) ExchangePool.POOL.release(deltaState.getArrivals().remove(0));
			while(deltaState.getDepartures().size()>0) ExchangePool.POOL.release(deltaState.getDepartures().remove(0));
			((StandardPopulationModelLabelValue)((StandardPopulationModelLabel)popLabel).getCurrentValue()).add(deltaState);
			
		}
	} // resetLabels

	
		/**
		 * get the constants which identify the disease label state variables
		 * @param diseaseLabel
		 */
		private  void setPropertyLabels() {
			StandardItemProviderAdapterFactory itemProviderFactory = new StandardItemProviderAdapterFactory();
			if(populationModel == null) {
				// We do not know the disease model and hence the label values needed
				StandardPopulationModelLabelValue popLabelValue = (StandardPopulationModelLabelValue) StandardFactory.eINSTANCE.createStandardPopulationModelLabel().getCurrentValue();
				IItemPropertySource propertySource = (IItemPropertySource) itemProviderFactory.adapt(popLabelValue, PropertySource.class);
				List<IItemPropertyDescriptor> properties = propertySource.getPropertyDescriptors(null);

				IItemPropertyDescriptor propertyBirths = properties.get(StandardPackage.STANDARD_POPULATION_MODEL_LABEL_VALUE__BIRTHS);
				IItemPropertyDescriptor propertyDeaths = properties.get(StandardPackage.STANDARD_POPULATION_MODEL_LABEL_VALUE__DEATHS);
				IItemPropertyDescriptor propertyCount = properties.get(StandardPackage.STANDARD_POPULATION_MODEL_LABEL_VALUE__COUNT);

				labelBirths = propertyBirths.getDisplayName(propertyBirths);
				labelDeaths = propertyDeaths.getDisplayName(propertyDeaths);
				labelCount = propertyCount.getDisplayName(propertyCount);
			} else {
				PopulationModel pm = (PopulationModel)populationModel;
				for(String popId:streamer.getPopulationIdentifiers()) {

					PopulationModelLabel spml = pm.createPopulationModelLabel(popId);

					final RelativeValueProviderAdapter rvp = (RelativeValueProviderAdapter) RelativeValueProviderAdapterFactory.INSTANCE
							.adapt(spml, RelativeValueProvider.class);
					rvp.setTarget(spml);

					List<IItemPropertyDescriptor> properties = rvp.getProperties();

					//				IItemPropertySource propertySource = (IItemPropertySource) itemProviderFactory.adapt(dmlv, PropertySource.class);
					//				List<IItemPropertyDescriptor> properties = propertySource.getPropertyDescriptors(null);
					if(propertyDescriptors == null) propertyDescriptors = new HashMap<String, List<IItemPropertyDescriptor>>();
					propertyDescriptors.put(popId,  properties);
				}
			}
		}// setPropertyLabels

		@Override
		public synchronized void calculateDeltas(STEMTime time,double t, long timeDelta,
				EList<DynamicLabel> labels) {


/*			if(firstSTEMTime == null || time.getTime().equals(firstSTEMTime.getTime()))
				fileLineCounter = 1;
			else
				fileLineCounter = (int)((time.getTime().getTime() - firstSTEMTime.getTime().getTime()) / timeDelta)+1;

			if(firstSTEMTime == null) firstSTEMTime = time;

			if(previousTime != null && time.getTime().before(previousTime.getTime()))
					try {
						restartStreaming();
					} catch(IOException ioe) {
						Activator.logError("IOException closing streaming files", ioe);
					}
			
			if(previousTime == null) previousTime = ModelFactory.eINSTANCE.createSTEMTime();
			previousTime.setTime(time.getTime());
	
*/
			// Determine how many rows in the log file one step of the sequencer corresponds to
			
			double rowsPerSequencerStep = (double)timeDelta/(double)streamer.getTimeStepMS();

			fileLineCounter = t * rowsPerSequencerStep;
			
			for (final DynamicLabel dynLabel : labels) {
				final StandardPopulationModelLabel popLabel = (StandardPopulationModelLabel) dynLabel;
				assert popLabel.getIdentifier().equals(getPopulationIdentifier());
				final StandardPopulationModelLabelValue deltaState = (StandardPopulationModelLabelValue)popLabel.getDeltaValue();

				importPopulationData(deltaState, popLabel, time, timeDelta);

				// Check that the counts match the births and deaths reported.
				
				double births = deltaState.getBirths();
				double deaths = deltaState.getDeaths();
				double deltaCount = deltaState.getCount();
				
				if(births - deaths != deltaCount) {
					double diff = deltaCount - (births-deaths);
					if(diff > 0)
						births = births + diff;
					else
						deaths = deaths + diff;
				}
				
				computeAdditionalDeltasAndExchanges((IntegrationLabel)dynLabel, time, t, timeDelta);
				
			} // for
		}


		/**
		 * 
		 * This method reads the next state data from the external dataFile
		 * 
		 * @param deltaState
		 * @param diseaseLabel
		 * @param time
		 * @param timeDelta
		 * @return
		 */
		public StandardPopulationModelLabelValue importPopulationData(
				final StandardPopulationModelLabelValue deltaState,
				final StandardPopulationModelLabel popLabel, 
				final STEMTime time, 
				final long timeDelta) {

			try {

				// Will only be set up first time called
				setupStreaming();

				// 
				if(labelCount==null && propertyDescriptors == null) 
					setPropertyLabels();

				Identifiable ident = popLabel.getIdentifiable();
				String fileName = ident.getURI().toString();
				int last = fileName.lastIndexOf(LOCATIONID_PREFIX);
				last += LOCATIONID_PREFIX.length();
				String location = fileName.substring(last,fileName.length());

				int adminLevel = Utility.keyLevel(location);
				String population = popLabel.getPopulationIdentifier();

				StandardPopulationModelLabelValue currentValue = (StandardPopulationModelLabelValue)popLabel.getCurrentValue();
				//		String id = ident.getURI().toString();
				//		int strt = id.indexOf(URI_PREFIX_PATTERN);
				//		if(strt>=0) {
				//			id = id.substring(strt+URI_PREFIX_PATTERN.length(),id.length());
				//		}

				//		if((dataInstance!=null)&&(dataInstance.instance.containsKey(id))) {

				//if(dataInstance!=null) {
				// compute the changes
				if(adminLevel > -1) {
					// First, if we do not know the various compartments etc used for the disease
					// assume it's an SI, SIR or SEIR
					double fraction = this.fileLineCounter - Math.floor(this.fileLineCounter);
					int row = (int)Math.floor(this.fileLineCounter);
					
					if(streamer.getDecorator() == null) {
						double deltaCount  = 0.0;
						double deltaBirths  = 0.0;
						double deltaDeaths = 0.0;

						// Population is not known so use the unknown key
						population = CSVscenarioLoader.UNKNOWN_POP_IDENTIFIER_KEY;

						//List<Double>data = null;
						if(populationType.equals(IMPORT_TYPE_STANDARD_POPULATION)) {
							
							List<Double>data1 = null;
							List<Double>data2 = null;
							while(streamer.getCurrentRow(population, adminLevel, labelCount) <= fileLineCounter)
								streamer.streamRow(population, adminLevel, labelCount);
							
							data1 = streamer.getNthFetchedRow(population, adminLevel, labelCount, row);
							data2 = streamer.getNthFetchedRow(population, adminLevel, labelCount, row+1);
							
							int pos = streamer.getDataPosition(population, adminLevel, location);
							
							if(pos >=0) {
								double d = interpolate((data1.size()>pos)? data1.get(pos):null, data2.get(pos), fraction);
								deltaCount = d - currentValue.getCount();
							}// 
							
							
							while(streamer.getCurrentRow(population, adminLevel, labelBirths) <= fileLineCounter)
								streamer.streamRow(population, adminLevel, labelBirths);
							data1 = streamer.getNthFetchedRow(population, adminLevel, labelBirths, row);
							data2 = streamer.getNthFetchedRow(population, adminLevel, labelBirths, row+1);
							
							if(pos >=0) {
								double d = interpolate((data1.size()>pos)? data1.get(pos):null, data2.get(pos), fraction);
								deltaBirths = d - currentValue.getBirths();
								if(deltaBirths < 0)
									System.out.println(deltaBirths);
							}//
		
							while(streamer.getCurrentRow(population, adminLevel, labelDeaths) <= fileLineCounter)
								streamer.streamRow(population, adminLevel, labelDeaths);
							data1 = streamer.getNthFetchedRow(population, adminLevel, labelDeaths, row);
							data2 = streamer.getNthFetchedRow(population, adminLevel, labelDeaths, row+1);
							
							if(pos >=0) {
								double d = interpolate((data1.size()>pos)? data1.get(pos):null, data2.get(pos), fraction);
								deltaDeaths= d - currentValue.getDeaths();
							}// 
						}

						if (populationType.equals(IMPORT_TYPE_STANDARD_POPULATION)) {
							((StandardPopulationModelLabelValue)deltaState).setCount(deltaCount);
							((StandardPopulationModelLabelValue)deltaState).setBirths(deltaBirths);
							((StandardPopulationModelLabelValue)deltaState).setDeaths(deltaDeaths);
							return new StandardPopulationModelLabelValueImpl();
						} else {
							throw new UnsupportedOperationException("ExternalDataSource Invalid Type "+populationType+" must be Standard Population Model");
						}
					} else {
						List<Double>data1 = null;
						List<Double>data2 = null;
						// We have the property descriptors for the label value we need to set.
						for(IItemPropertyDescriptor propDesc:propertyDescriptors.get(population)) {
							// This is the name used in the CSV files
							String dispName = propDesc.getDisplayName(propDesc);

							if(!streamer.containsState(population, adminLevel, dispName)) 
								continue; // Skip properties that are missing in the log files (Display Warning?)
							
							int pos = streamer.getDataPosition(population, adminLevel, location);

							while(streamer.getCurrentRow(population, adminLevel, dispName) <= fileLineCounter)
								streamer.streamRow(population, adminLevel, dispName);
							data1 = streamer.getNthFetchedRow(population, adminLevel, dispName, row);
							data2 = streamer.getNthFetchedRow(population, adminLevel, dispName, row+1);
							
							if(pos >=0) {
								double d = interpolate((data1.size()>pos)? data1.get(pos):null, data2.get(pos), fraction);
								EStructuralFeature feature = (EStructuralFeature)propDesc.getFeature(null);
								double currentVal = (Double)currentValue.eGet(feature);
								if(!feature.isDerived() && feature.isChangeable())
									deltaState.eSet(feature, d - currentVal);
								
							}// 
							
						}
					}
				}// admin level > -1

			} catch(IOException ioe) {
				Activator.logError("Exception streaming data", ioe);
			}
			return null;
		} 

		
		/**
		 * interpolate. Linearly interpolate the two values
		 * @param double1
		 * @param double2
		 * @param fraction
		 * @return
		 */
		private double interpolate(Double double1, Double double2, double fraction) {
			if(double1 == null ) return double2;
			return double1+fraction*(double2-double1);
		}

		/**
		 * 
		 */
		private synchronized void setupStreaming() {
			if(streamer == null) {
				try {
					streamer = new CSVScenarioStreamer(this.dataPath, this.getBufferSize(), this.isRestart(), cumulativeStates);
					this.populationModel = streamer.getDecorator();
					if(this.populationModel == null) {
						streamer.prepareForStreaming(CSVscenarioLoader.UNKNOWN_POP_IDENTIFIER_KEY, -1);

						// Set the disease type here since we don't need that
						// input from the end-user any longer
						this.populationType = streamer.getType(CSVscenarioLoader.UNKNOWN_POP_IDENTIFIER_KEY).name();
					} else {
						for(String pop:streamer.getPopulationIdentifiers())
							streamer.prepareForStreaming(pop, -1);
					}
				} catch(LogInitializationException sie) {
					Activator.logError("Error reading scenario files", sie);
				} catch(IOException ioe) {
					Activator.logError("IOExceptopn reading scenario files", ioe);
				}
			}
		}

		
		/**
	 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
	 * @generated
	 */
		@Override
		protected EClass eStaticClass() {
		return StandardPackage.Literals.EXTERNAL_DATA_SOURCE_POPULATION_MODEL;
	}

		/**
	 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
	 * @generated
	 */
		public String getDataPath() {
		return dataPath;
	}

		/**
	 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
	 * @generated
	 */
		public void setDataPath(String newDataPath) {
		dataPath = newDataPath;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBufferSize() {
		return bufferSize;
	}


		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBufferSize(int newBufferSize) {
		bufferSize = newBufferSize;
	}


		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRestart() {
		return restart;
	}


		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestart(boolean newRestart) {
		restart = newRestart;
	}


		/**
	 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
	 * @generated
	 */
		@Override
		public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StandardPackage.EXTERNAL_DATA_SOURCE_POPULATION_MODEL__DATA_PATH:
				return getDataPath();
			case StandardPackage.EXTERNAL_DATA_SOURCE_POPULATION_MODEL__BUFFER_SIZE:
				return getBufferSize();
			case StandardPackage.EXTERNAL_DATA_SOURCE_POPULATION_MODEL__RESTART:
				return isRestart();
		}
		return super.eGet(featureID, resolve, coreType);
	}

		/**
	 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
	 * @generated
	 */
		@Override
		public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StandardPackage.EXTERNAL_DATA_SOURCE_POPULATION_MODEL__DATA_PATH:
				setDataPath((String)newValue);
				return;
			case StandardPackage.EXTERNAL_DATA_SOURCE_POPULATION_MODEL__BUFFER_SIZE:
				setBufferSize((Integer)newValue);
				return;
			case StandardPackage.EXTERNAL_DATA_SOURCE_POPULATION_MODEL__RESTART:
				setRestart((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

		/**
	 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
	 * @generated
	 */
		@Override
		public void eUnset(int featureID) {
		switch (featureID) {
			case StandardPackage.EXTERNAL_DATA_SOURCE_POPULATION_MODEL__DATA_PATH:
				setDataPath(DATA_PATH_EDEFAULT);
				return;
			case StandardPackage.EXTERNAL_DATA_SOURCE_POPULATION_MODEL__BUFFER_SIZE:
				setBufferSize(BUFFER_SIZE_EDEFAULT);
				return;
			case StandardPackage.EXTERNAL_DATA_SOURCE_POPULATION_MODEL__RESTART:
				setRestart(RESTART_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

		/**
	 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
	 * @generated
	 */
		@Override
		public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StandardPackage.EXTERNAL_DATA_SOURCE_POPULATION_MODEL__DATA_PATH:
				return DATA_PATH_EDEFAULT == null ? dataPath != null : !DATA_PATH_EDEFAULT.equals(dataPath);
			case StandardPackage.EXTERNAL_DATA_SOURCE_POPULATION_MODEL__BUFFER_SIZE:
				return bufferSize != BUFFER_SIZE_EDEFAULT;
			case StandardPackage.EXTERNAL_DATA_SOURCE_POPULATION_MODEL__RESTART:
				return restart != RESTART_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

		/**
	 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
	 * @generated
	 */
		@Override
		public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dataPath: ");
		result.append(dataPath);
		result.append(", bufferSize: ");
		result.append(bufferSize);
		result.append(", restart: ");
		result.append(restart);
		result.append(')');
		return result.toString();
	}


		@Override
		public PopulationModelLabel createPopulationModelLabel(String populationIdentifier) {
			PopulationModelLabel retValue = null;
			setupStreaming();
			if(streamer.getDecorator() == null) {
				if (populationType==IMPORT_TYPE_STANDARD_POPULATION) retValue =  StandardFactory.eINSTANCE.createStandardPopulationModelLabel();
				else retValue = StandardFactory.eINSTANCE.createStandardPopulationModelLabel();
			} else {
				// We know the actual disease model used, call its methods to create the label
				retValue =  ((PopulationModel)streamer.getDecorator()).createPopulationModelLabel(populationIdentifier);
			}
			retValue.setTypeURI(PopulationModelLabel.URI_TYPE_DYNAMIC_POPULATION_LABEL);
			return retValue;
		}


		@Override
		public PopulationModelLabelValue createPopulationModelLabelValue(String populationIdentifier) {
			PopulationModelLabelValue retValue = null;
			if(streamer.getDecorator() == null) {
				if (populationType==IMPORT_TYPE_STANDARD_POPULATION) retValue =  StandardFactory.eINSTANCE.createStandardPopulationModelLabelValue();
				else retValue = StandardFactory.eINSTANCE.createStandardPopulationModelLabelValue();
			} else {
				// We know the actual disease model used, call its methods to create the label
				retValue =  ((PopulationModel)streamer.getDecorator()).createPopulationModelLabelValue(populationIdentifier);
			}
			return retValue;
		}

	} //ExternalDatasourcePopulationModelImpl
