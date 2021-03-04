// ExternalDataSourceDiseaseModelImpl
package org.eclipse.stem.diseasemodels.externaldatasource.impl;


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

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
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
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.scenario.ScenarioInitializationException;
import org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProvider;
import org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProviderAdapter;
import org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProviderAdapterFactory;
import org.eclipse.stem.definitions.labels.AreaLabel;
import org.eclipse.stem.definitions.labels.PopulationLabel;
import org.eclipse.stem.diseasemodels.Activator;
import org.eclipse.stem.diseasemodels.externaldatasource.ExternalDataSourceDiseaseModel;
import org.eclipse.stem.diseasemodels.externaldatasource.ExternalDataSourcePackage;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.Infector;
import org.eclipse.stem.diseasemodels.standard.SEIRLabelValue;
import org.eclipse.stem.diseasemodels.standard.SILabelValue;
import org.eclipse.stem.diseasemodels.standard.SIRLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardFactory;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.diseasemodels.standard.impl.SEIRLabelValueImpl;
import org.eclipse.stem.diseasemodels.standard.impl.SILabelValueImpl;
import org.eclipse.stem.diseasemodels.standard.impl.SIRLabelValueImpl;
import org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelImpl;
import org.eclipse.stem.diseasemodels.standard.provider.StandardItemProviderAdapterFactory;
import org.eclipse.stem.populationmodels.standard.PopulationModelLabel;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disease Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.externaldatasource.impl.ExternalDataSourceDiseaseModelImpl#getDataPath <em>Data Path</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.externaldatasource.impl.ExternalDataSourceDiseaseModelImpl#getDiseaseType <em>Disease Type</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.externaldatasource.impl.ExternalDataSourceDiseaseModelImpl#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.externaldatasource.impl.ExternalDataSourceDiseaseModelImpl#isRestart <em>Restart</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalDataSourceDiseaseModelImpl extends StandardDiseaseModelImpl implements ExternalDataSourceDiseaseModel {

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

	//private final static String URI_PREFIX_PATTERN = "geo/region/";

	/**
	 * The default value of the '{@link #getDiseaseType() <em>Disease Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiseaseType()
	 * @generated
	 * @ordered
	 */
	protected static final String DISEASE_TYPE_EDEFAULT = null;
	/**
	 * This prefix precedes the node id and must be removed in the 
	 * filterFilename method to auto-generate the output file name.
	 */
	public static final String LOCATIONID_PREFIX = "/node/geo/region/";


	/**
	 * Directory containing the scenario to import and play back
	 */
	public String dirName = DEFAULT_DIR;

	/**
	 * The line counter into the log file. A double so we can interpolate if necessary
	 */
	private double fileLineCounter = 0;

	// These are only used when we do not know which disease model
	// generated the logged data. We can handle only S, E, I and R
	// compartments in such cases. 
	protected Set<String> S_KEY_SET = new HashSet<String>();
	protected Set<String> E_KEY_SET = new HashSet<String>();
	protected Set<String> I_KEY_SET = new HashSet<String>();	
	protected Set<String> R_KEY_SET = new HashSet<String>();
	protected Set<String> INCIDENCE_KEY_SET = new HashSet<String>();
	
	public static String labelS  = null ;
	public static String labelE  = null ;
	public static String labelI = null ;  
	public static String labelR  = null ;
	public static String labelIncidence = null;
	
	// We need to tell the streamer which states are cumulative (so that it can restart streaming and keep adding).
	// ToDo. Detect these from the meta model disease states
	private String[] cumulativeStates = {"diseaseDeaths"};

	
	// When we know the disease model that generated the data (stored in the runparameters file),
	// the descriptors of the properties are stored here, mapped by the population id
	
	protected Map<String, List<IItemPropertyDescriptor>> propertyDescriptors;
		
	// The streamer
	
	CSVScenarioStreamer streamer;
	
	/**
	 * not used
	 */
	@SuppressWarnings("unused")
	private double totalPopulationCount = 0.0;
	@SuppressWarnings("unused")
	private double totalArea = 0.0;

	private String diseaseType;

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
	protected static final boolean RESTART_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isRestart() <em>Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRestart()
	 * @generated
	 * @ordered
	 */
	protected boolean restart = RESTART_EDEFAULT;
	private Decorator diseaseModel;
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ExternalDataSourceDiseaseModelImpl() {
		super();
	}




	/**
	 * We need to override this method to return all population model labels found in the logged files
	 * 
	 * @param populationIdentifier
	 *            the population being labeled. Only used if we do not know the name of the population.
	 * @param graph
	 *            the graph to search
	 * @return the PopulationLabel instances of the graph that match the
	 *         identifier.
	 */
	@Override
	public EList<PopulationModelLabel> getPopulationModelLabels(
			String populationIdentifier, Graph graph)  {
		final EList<PopulationModelLabel> retValue = new BasicEList<PopulationModelLabel>();

		// If already done nothing will happen here
		setupStreaming();
		
		// Iterate through all of the population labels in the graph
		EList<NodeLabel> labels = graph.getNodeLabelsByTypeURI(
			PopulationModelLabel.URI_TYPE_DYNAMIC_POPULATION_LABEL);
						
		boolean found = false;
		for (NodeLabel pl:labels) {
			final PopulationModelLabel populationLabel = (PopulationModelLabel) pl;
			// Is this label for the population we're looking for?
			boolean keep = false;
			if(this.streamer.getDecorator() != null) {
				// We have read the runparameters file and hence we know the names of the
				// populations we're looking for
				for(String loggedPopulation:this.streamer.getPopulationIdentifiers())
					if(populationLabel.getPopulationIdentifier().equals(loggedPopulation)) keep = true;
			} else {
				// We do not know the population, use the popultion specified in this model
				if(populationLabel.getPopulationIdentifier().equals(populationIdentifier)) keep = true;
			}
				
			if (keep) {
				// Yes
				// If there is a problem with the "node uri" of the population
				// label then it would not have been associated with a node
				// instance in the graph at this point. This is a problem for
				// disease models that are trying to label the node (there isn't
				// one!). So filter out those mistakes here.

				// Does the population label have an associated node?
				if (populationLabel.getNode() != null) {
					// Yes
					retValue.add(populationLabel);
				} // if the population label has a node
			} // if the population we're looking for
		} // for each population label

		return retValue;
	}
	
	/**
	 * Need to override this to set the initial value to the first row in the log file
	 * @generated NOT
	 */
	
	public void resetLabels() throws ScenarioInitializationException {
		super.resetLabels();
		
		try {
			if(streamer != null)
				streamer.close();
		} catch(IOException ioe) {
			throw new ScenarioInitializationException("IOException closing streamer", this, ioe);
		}
		streamer = null;
		fileLineCounter = 0;
		setupStreaming();
		
		
		for (final Iterator<DynamicLabel> labelIter = getLabelsToUpdate()
				.iterator(); labelIter.hasNext();) {
			final StandardDiseaseModelLabel diseaseLabel = (StandardDiseaseModelLabel)labelIter.next();
			// This is the current state of the disease for this label
			final StandardDiseaseModelLabelValue deltaState = (StandardDiseaseModelLabelValue)diseaseLabel.getDeltaValue();

			importDiseaseData(deltaState, diseaseLabel, null, 0); // last params not used

			((StandardDiseaseModelLabelValue)diseaseLabel.getCurrentValue()).add(deltaState);
			
		}
	} // resetLabels
	
	
	/**
	 * get the constants which identify the disease label state variables
	 * @param diseaseLabel
	 */
	private  void setPropertyLabels() {
		StandardItemProviderAdapterFactory itemProviderFactory = new StandardItemProviderAdapterFactory();
		if(diseaseModel == null) {
			// We do not know the disease model and hence the label values needed
			SEIRLabelValue diseaseLabel = (SEIRLabelValue) StandardFactory.eINSTANCE.createSEIRLabel().getCurrentValue();
			IItemPropertySource propertySource = (IItemPropertySource) itemProviderFactory.adapt(diseaseLabel, PropertySource.class);
			List<IItemPropertyDescriptor> properties = propertySource.getPropertyDescriptors(null);
	
			IItemPropertyDescriptor propertyS = properties.get(StandardPackage.SEIR_LABEL_VALUE__S);
			IItemPropertyDescriptor propertyE = properties.get(StandardPackage.SEIR_LABEL_VALUE__E);
			IItemPropertyDescriptor propertyI = properties.get(StandardPackage.SEIR_LABEL_VALUE__I);
			IItemPropertyDescriptor propertyR = properties.get(StandardPackage.SEIR_LABEL_VALUE__R);
			IItemPropertyDescriptor propertyIncidence = properties.get(StandardPackage.SEIR_LABEL_VALUE__INCIDENCE);
			labelS = propertyS.getDisplayName(propertyS);
			labelE = propertyE.getDisplayName(propertyE);
			labelI = propertyI.getDisplayName(propertyI);
			labelR = propertyR.getDisplayName(propertyR);
			labelIncidence = propertyIncidence.getDisplayName(propertyIncidence);
		} else {
			DiseaseModel dm = (DiseaseModel)diseaseModel;
			for(String popId:streamer.getPopulationIdentifiers()) {
				
				DiseaseModelLabel dml = dm.createDiseaseModelLabel(popId);
				
				final RelativeValueProviderAdapter rvp = (RelativeValueProviderAdapter) RelativeValueProviderAdapterFactory.INSTANCE
						.adapt(dml, RelativeValueProvider.class);
				rvp.setTarget(dml);
				List<IItemPropertyDescriptor> properties = rvp.getProperties();
				
//				IItemPropertySource propertySource = (IItemPropertySource) itemProviderFactory.adapt(dmlv, PropertySource.class);
//				List<IItemPropertyDescriptor> properties = propertySource.getPropertyDescriptors(null);
				if(propertyDescriptors == null) propertyDescriptors = new HashMap<String, List<IItemPropertyDescriptor>>();
				propertyDescriptors.put(popId,  properties);
			}
		}
	}// setPropertyLabels

	
/**
 * 
 */
	private synchronized void setupStreaming() {
		if(streamer == null) {
			try {
				streamer = new CSVScenarioStreamer(this.dataPath, this.getBufferSize(), this.isRestart(), cumulativeStates);
				this.diseaseModel = streamer.getDecorator();
				if(this.diseaseModel == null) {
					streamer.prepareForStreaming(CSVscenarioLoader.UNKNOWN_POP_IDENTIFIER_KEY, -1);
					
					// Set the disease type here since we don't need that
					// input from the end-user any longer
					this.diseaseType = streamer.getType(CSVscenarioLoader.UNKNOWN_POP_IDENTIFIER_KEY).name();
					this.S_KEY_SET = CSVscenarioLoader.getsKeySet();
					this.E_KEY_SET = CSVscenarioLoader.geteKeySet();
					this.I_KEY_SET = CSVscenarioLoader.getiKeySet();
					this.R_KEY_SET = CSVscenarioLoader.getrKeySet();
					this.INCIDENCE_KEY_SET = CSVscenarioLoader.getIncidenceKeySet();
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
	 * 
	 * This method reads the next state data from the external dataFile
	 * 
	 * @param deltaState
	 * @param diseaseLabel
	 * @param time
	 * @param timeDelta
	 * @param streamNextRow True if we should fetch the next row from stream
	 * @return
	 */
	@SuppressWarnings("boxing")
	public StandardDiseaseModelLabelValue importDiseaseData(
			final StandardDiseaseModelLabelValue deltaState,
			final StandardDiseaseModelLabel diseaseLabel, 
			final STEMTime time, 
			final long timeDelta) {

		try {
						
			// Will only be set up first time called
			setupStreaming();
			
			if(labelS==null && propertyDescriptors == null) 
				setPropertyLabels();
	
			// TODO
			// the filename actually comes from the node itself
			// we need to regen the code with a scenarioDirectory 
			// specification as every node maps to a different data file. for now we will test
			// with only one node and one file
			// need a map of maps keyed by location name
	
	
			Identifiable ident = diseaseLabel.getIdentifiable();
			String fileName = ident.getURI().toString();
			String location;
			
			if (fileName.contains(LOCATIONID_PREFIX)) {
				int last = fileName.lastIndexOf(LOCATIONID_PREFIX);
				
				last += LOCATIONID_PREFIX.length();				
				location = fileName.substring(last,fileName.length());
			} else {
				location = fileName;
			}
	
			int adminLevel = Utility.keyLevel(location);
			String population = diseaseLabel.getPopulationModelLabel().getPopulationIdentifier();
			
			// if no data
	/*		if((data==null)||(data.size() == 0)) {
				// no data for location in questions
				if (diseaseType.equals(IMPORT_TYPE_SI)) {
					return new SILabelValueImpl(0.0 , 0.0, 0.0, 0.0);
				} else if (diseaseType.equals(IMPORT_TYPE_SIR)) {
					return new SIRLabelValueImpl(0.0, 0.0 , 0.0, 0.0, 0.0);
				} else if (diseaseType.equals(IMPORT_TYPE_SEIR)) {
					return new SEIRLabelValueImpl( 0.0, 0.0, 0.0 , 0.0, 0.0, 0.0);
				} else {
					throw new UnsupportedOperationException("ExternalDataSource Invalid Type "+diseaseType+" must be SI, SIR, or SEIR");
				}
			}
	*/
			// JHK Notes: HOW DO I GET THE CURRENT STEP??
			//  
			// node >> graph
			// graph >> scenario using SimulationManger method
			// SimulationManger.getManger()
			// then call manager.mapGraphToSimulation(final Graph graph) {
			// to get the rvhp you just have to adapt it again.
	
			// csv diseases read from file know their own
			// time period property in millisecs
			// This method is called by "updateLabels"
			// should really override that instead fo compute transitions
			// updateLabels has the TIME.
	
			// TODO
			// remove filter in StandardRelativeValueProviderAdapterFactory 
			// which is preventing disease deaths from being logged.
			// method is StandardRelativeValueProviderAdapterFactory List<IItemPropertyDescriptor> getProperties()
	
		
			StandardDiseaseModelLabelValue currentValue = (StandardDiseaseModelLabelValue)diseaseLabel.getCurrentValue();
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
				if(streamer.getDecorator() == null) {
					double deltaS  = 0.0;
					double deltaE  = 0.0;
					double deltaI = 0.0;
					double deltaR  = 0.0;
					double incidence = 0.0;
					
					// Population is not known so use the unknown key
					population = CSVscenarioLoader.UNKNOWN_POP_IDENTIFIER_KEY;
					
					List<Double>result = null;
					int pos = streamer.getDataPosition(population, adminLevel, location);
					if(pos == -1) return null; // Location not available in data
					// S
					result = streamData(population, adminLevel,labelS);
						
					double d = result.get(pos);
					deltaS = d - currentValue.getS();
					
					// Incidence
					result = streamData(population, adminLevel,labelIncidence);
					d = result.get(pos);
					incidence = d-currentValue.getIncidence();
					 
		
					// E
					if (diseaseType.equals(IMPORT_TYPE_SEIR)) {
						result = streamData(population, adminLevel,labelE);
						d = result.get(pos);
						deltaE = d-((SEIRLabelValue)currentValue).getE();
				 
					}
					
					//////////////////////////////////////////////////////
					// I
					// May be more than one type of I state (Ia, Il, etc)
					// for now just add them all up
					//
					int numIstates = I_KEY_SET.size();
					if(I_KEY_SET!=null) {
						Iterator<String> iter = I_KEY_SET.iterator();
						double dI = 0;
						while(iter.hasNext()) {
							String iKey = iter.next();
				
							result = streamData(population, adminLevel,iKey);
							d = result.get(pos);
							dI += d;
						}
						deltaI = dI - ((SILabelValue)currentValue).getI();
					} else {
						Activator.logInformation("I Keys are all Null !!");
					}
					//i
					//////////////////////////////////////////////////////
					
			
					if (diseaseType.equals(IMPORT_TYPE_SIR) || diseaseType.equals(IMPORT_TYPE_SEIR)) {
						result = streamData(population, adminLevel,labelR);
						d = result.get(pos);
						deltaR = d-((SIRLabelValue)currentValue).getR();

					}
				
			
				
					if (diseaseType.equals(IMPORT_TYPE_SI)) {
						((SILabelValue)deltaState).setS(deltaS);
						((SILabelValue)deltaState).setI(deltaI);
						((SILabelValue)deltaState).setIncidence(incidence);
						return new SILabelValueImpl( 0.0 , 0.0, 0.0, 0.0);
					} else if (diseaseType.equals(IMPORT_TYPE_SIR)) {
						((SIRLabelValue)deltaState).setS(deltaS);
						((SIRLabelValue)deltaState).setI(deltaI);
						((SIRLabelValue)deltaState).setR(deltaR);
						((SIRLabelValue)deltaState).setIncidence(incidence);
						return new SIRLabelValueImpl(0.0, 0.0 , 0.0, 0.0, 0.0);
					} else if (diseaseType.equals(IMPORT_TYPE_SEIR)) {
						((SEIRLabelValue)deltaState).setS(deltaS);
						((SEIRLabelValue)deltaState).setE(deltaE);
						((SEIRLabelValue)deltaState).setI(deltaI);
						((SEIRLabelValue)deltaState).setR(deltaR);
						((SEIRLabelValue)deltaState).setIncidence(incidence);
						return new SEIRLabelValueImpl(0.0, 0.0, 0.0 , 0.0, 0.0, 0.0);
					} else {
						throw new UnsupportedOperationException("ExternalDataSource Invalid Type "+diseaseType+" must be SI, SIR, or SEIR");
					}
				} else {
					List<Double>result = null;
					// We have the property descriptors for the label value we need to set.
					for(IItemPropertyDescriptor propDesc:propertyDescriptors.get(population)) {
						// This is the name used in the CSV files
						String dispName = propDesc.getDisplayName(propDesc);
						
						int pos = streamer.getDataPosition(population, adminLevel, location);
						
						
						result = streamData(population, adminLevel,dispName);
						double d = result.get(pos);
												
						if(pos >=0) {		
							EStructuralFeature feature = (EStructuralFeature)propDesc.getFeature(null);
							double currentVal = (Double)currentValue.eGet(feature);
							if(!feature.isDerived() && feature.isChangeable())
								deltaState.eSet(feature, d - currentVal);
						}
					}
				}
			}// admin level > -1
			
			
			//		}else {
			//			// if data == null
			//			// no data for location in questions
			//			if (diseaseType.equals(IMPORT_TYPE_SI)) {
			//				return new SILabelValueImpl(0.0 , 0.0, 0.0, 0.0);
			//			} else if (diseaseType.equals(IMPORT_TYPE_SIR)) {
			//				return new SIRLabelValueImpl(0.0, 0.0 , 0.0, 0.0, 0.0);
			//			} else if (diseaseType.equals(IMPORT_TYPE_SEIR)) {
			//				return new SEIRLabelValueImpl( 0.0, 0.0, 0.0 , 0.0, 0.0, 0.0);
			//			} else {
			//				throw new UnsupportedOperationException("ExternalDataSource Invalid Type "+diseaseType+" must be SI, SIR, or SEIR");
			//			}
			//		}

		} catch(IOException ioe) {
			Activator.logError("Exception streaming data", ioe);
		}
		return null;
	} // importDiseaseData


	
	/**
	 * Stream data from the file. If the file is already at the correct position no IO is done, and the last results are returned (interpolated with new fraction if so)
	 * 
	 * @param population The population
	 * @param adminLevel Admin level
	 * @param compartment Which compartment
	 * @param data1 The second last result
	 * @param data2 The last result
	 * @return Aggregated or interpolated result
	 * @exception IOException
	 */
	@SuppressWarnings("boxing")
	private List<Double> streamData(String population, int adminLevel, String compartment) throws IOException {
		double fraction = this.fileLineCounter - Math.floor(this.fileLineCounter);
		List<Double>data1;
		List<Double>data2;
		List<Double>result = new ArrayList<Double>();
		boolean fetchedMoreData = false;
		
		int row = (int)fileLineCounter;
		while(streamer.getCurrentRow(population, adminLevel, compartment) <= fileLineCounter) 
			streamer.streamRow(population, adminLevel, compartment);
		
		data1 = streamer.getNthFetchedRow(population, adminLevel, compartment, row);
		data2 = streamer.getNthFetchedRow(population, adminLevel, compartment, row+1);
		for(int n=0;n<data1.size();++n) result.add(interpolate(data1.get(n), data2.get(n), fraction));
		return result;
	}
	
	/**
	 * interpolate. Linearly interpolate the two values. 
	 * 
	 * @param double1
	 * @param double2
	 * @param fraction
	 * @return
	 */
	@SuppressWarnings("boxing")
	private double interpolate(Double double1, Double double2, double fraction) {
		if(double1 == null) return double2;
		return double1+(fraction)*(double2-double1);
	}

	/**
	 * interpolateAggregate. Substract the last part of an aggregate count by the fraction 
	 * 
	 * @param double1
	 * @param double2
	 * @param fraction
	 * @return
	 */
	/*@SuppressWarnings("boxing")
	private double interpolateAggregate(Double double1, Double double2, double fraction) {
		return double1-(1-fraction)*double2;
	}*/



	/**
	 * @see org.eclipse.stem.diseasemodels.standard.impl.DiseaseModelImpl#createDiseaseModelLabel()
	 */
	@Override
	public DiseaseModelLabel createDiseaseModelLabel(String populationIdentifier) {
		if(streamer.getDecorator() == null) {
			if (diseaseType==IMPORT_TYPE_SI) return StandardFactory.eINSTANCE.createSILabel();
			if (diseaseType==IMPORT_TYPE_SIR) return StandardFactory.eINSTANCE.createSIRLabel();
			// else default
			return StandardFactory.eINSTANCE.createSEIRLabel();
		} else {
			// We know the actual disease model used, call its methods to create the label
			return ((DiseaseModel)streamer.getDecorator()).createDiseaseModelLabel(populationIdentifier);
		}
	} // createDiseaseModelLabel

	/**
	 * 
	 */
	@Override
	public DiseaseModelLabelValue createDiseaseModelLabelValue(String populationIdentifier) {
		if(streamer.getDecorator() == null) {
			if(diseaseType==IMPORT_TYPE_SI) return StandardFactory.eINSTANCE.createSILabelValue();
			if(diseaseType==IMPORT_TYPE_SIR) return StandardFactory.eINSTANCE.createSIRLabelValue();
			return StandardFactory.eINSTANCE.createSEIRLabelValue();
		} else {
			// We know the actual disease model used, call its methods to create the label
			return ((DiseaseModel)streamer.getDecorator()).createDiseaseModelLabelValue(populationIdentifier);
		}
	} // createDiseaseModelLabelValue

	
	/**
	 * @see org.eclipse.stem.diseasemodels.standard.impl.DiseaseModelImpl#createInfector()
	 */
	@Override
	public Infector createInfector() {
		throw new UnsupportedOperationException();
	} // createInfector

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void addToTotalArea(double area) {
		totalArea += area;
	} // addToTotalArea



	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void addToTotalPopulationCount(double populationCount) {
		totalPopulationCount += populationCount;
	} // addToTotalPopulationCount

	/**
	 * @param populationLabel
	 *            the population label that labels the node
	 * @return the area of the node associated with the label
	 */
	public double getArea(final PopulationLabel populationLabel) {
		double retValue = 0.0;

		// The population label could have an area specified for the population
		// that we should use instead of the area of the region labeled by the
		// population label. This value would be specified if the population was
		// densely packed into a small area of the larger region, for instance
		// like a city in an otherwise large desert.

		retValue = populationLabel.getPopulatedArea();

		// Is there an area specified for the population?
		if (retValue == 0.0) {
			// No
			// Ok, go find the area label and return the area of the region
			for (final Iterator<NodeLabel> labelIter = populationLabel.getNode()
					.getLabels().iterator(); labelIter.hasNext();) {
				final NodeLabel nodeLabel = labelIter.next();
				// Is this an area label?
				if (nodeLabel instanceof AreaLabel) {
					// Yes
					final AreaLabel areaLabel = (AreaLabel) nodeLabel;
					retValue = areaLabel.getCurrentAreaValue().getArea();
					break;
				}
			} // for
		} // If no population area specified

		return retValue;
	} // getArea


	/**
	 * @param populationLabel
	 * @param area
	 */
	/*private void reportBadAreaValue(final PopulationLabel populationLabel,
			double area) {
		// The bad value could be specified for the node or be an overide
		// value specified for the population.
		// Is the bad value from the node?
		if (populationLabel.getPopulatedArea() == 0.0) {
			// Yes
			Activator.logError("The area value of \"" + area
					+ "\" specified for \""
					+ populationLabel.getNode().toString()
					+ "\" is not greater than zero (0.0)", null);
		} // if bad value for node area
		else {
			Activator.logError("The area value of \"" + area
					+ "\" specified for the population \""
					+ populationLabel.getPopulationIdentifier() + "\" for the region \""
					+ populationLabel.getNode().toString()
					+ "\" is not greater than zero (0.0)", null);
		}
	} */// reportBadAreaValue

	
	@Override
	public EList<String> getAllLabelIdentifiers() {
		List<String> popIds = this.streamer.getPopulationIdentifiers();
		EList<String> identifiers = new BasicEList<String>();
		if(popIds != null)
			for (String pop : popIds) {
				identifiers.add(pop);
			}
		else identifiers.add(this.getPopulationIdentifier());
		return identifiers;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExternalDataSourcePackage.Literals.EXTERNAL_DATA_SOURCE_DISEASE_MODEL;
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
	public String getDiseaseType() {
		return diseaseType;
	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiseaseType(String newDiseaseType) {
		diseaseType = newDiseaseType;
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
	@SuppressWarnings("boxing")
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExternalDataSourcePackage.EXTERNAL_DATA_SOURCE_DISEASE_MODEL__DATA_PATH:
				return getDataPath();
			case ExternalDataSourcePackage.EXTERNAL_DATA_SOURCE_DISEASE_MODEL__DISEASE_TYPE:
				return getDiseaseType();
			case ExternalDataSourcePackage.EXTERNAL_DATA_SOURCE_DISEASE_MODEL__BUFFER_SIZE:
				return getBufferSize();
			case ExternalDataSourcePackage.EXTERNAL_DATA_SOURCE_DISEASE_MODEL__RESTART:
				return isRestart();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("boxing")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExternalDataSourcePackage.EXTERNAL_DATA_SOURCE_DISEASE_MODEL__DATA_PATH:
				setDataPath((String)newValue);
				return;
			case ExternalDataSourcePackage.EXTERNAL_DATA_SOURCE_DISEASE_MODEL__DISEASE_TYPE:
				setDiseaseType((String)newValue);
				return;
			case ExternalDataSourcePackage.EXTERNAL_DATA_SOURCE_DISEASE_MODEL__BUFFER_SIZE:
				setBufferSize((Integer)newValue);
				return;
			case ExternalDataSourcePackage.EXTERNAL_DATA_SOURCE_DISEASE_MODEL__RESTART:
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
			case ExternalDataSourcePackage.EXTERNAL_DATA_SOURCE_DISEASE_MODEL__DATA_PATH:
				setDataPath(DATA_PATH_EDEFAULT);
				return;
			case ExternalDataSourcePackage.EXTERNAL_DATA_SOURCE_DISEASE_MODEL__DISEASE_TYPE:
				setDiseaseType(DISEASE_TYPE_EDEFAULT);
				return;
			case ExternalDataSourcePackage.EXTERNAL_DATA_SOURCE_DISEASE_MODEL__BUFFER_SIZE:
				setBufferSize(BUFFER_SIZE_EDEFAULT);
				return;
			case ExternalDataSourcePackage.EXTERNAL_DATA_SOURCE_DISEASE_MODEL__RESTART:
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
			case ExternalDataSourcePackage.EXTERNAL_DATA_SOURCE_DISEASE_MODEL__DATA_PATH:
				return DATA_PATH_EDEFAULT == null ? dataPath != null : !DATA_PATH_EDEFAULT.equals(dataPath);
			case ExternalDataSourcePackage.EXTERNAL_DATA_SOURCE_DISEASE_MODEL__DISEASE_TYPE:
				return DISEASE_TYPE_EDEFAULT == null ? diseaseType != null : !DISEASE_TYPE_EDEFAULT.equals(diseaseType);
			case ExternalDataSourcePackage.EXTERNAL_DATA_SOURCE_DISEASE_MODEL__BUFFER_SIZE:
				return bufferSize != BUFFER_SIZE_EDEFAULT;
			case ExternalDataSourcePackage.EXTERNAL_DATA_SOURCE_DISEASE_MODEL__RESTART:
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
		result.append(" (dataPath: "); //$NON-NLS-1$
		result.append(dataPath);
		result.append(", diseaseType: "); //$NON-NLS-1$
		result.append(diseaseType);
		result.append(", bufferSize: "); //$NON-NLS-1$
		result.append(bufferSize);
		result.append(", restart: "); //$NON-NLS-1$
		result.append(restart);
		result.append(')');
		return result.toString();
	}


	/**
	 *  Since data is read from a file we don't have to take into account
	 *   birth/deaths etc from other decorators, the data is already supposed
	 *	 to handle that.
	 */

	public void applyExternalDeltas(STEMTime time, long timeDelta,
			EList<DynamicLabel> labels) {
		// Nothing to do.

	}

	@Override
	public synchronized  void calculateDeltas(STEMTime time, double t, long timeDelta, EList<DynamicLabel> labels) {
		
		// Determine how many rows in the log file one step of the sequencer corresponds to
		
		double rowsPerSequencerStep = (double)timeDelta/(double)streamer.getTimeStepMS();
		
		
/*		if(firstSTEMTime == null || time.getTime().equals(firstSTEMTime.getTime()))
			fileLineCounter = 1;
		else
			fileLineCounter = (int)((time.getTime().getTime() - firstSTEMTime.getTime().getTime()) / timeDelta)+1;

		if(firstSTEMTime == null) firstSTEMTime = time;
*/
		
		fileLineCounter = t * rowsPerSequencerStep;
		
		// Iterate through each of the labels we need to update.
		for (final DynamicLabel dynLabel : labels) {
			final StandardDiseaseModelLabel diseaseLabel = (StandardDiseaseModelLabel) dynLabel;
			// This is the current state of the disease for this label
			final StandardDiseaseModelLabelValue deltaState = (StandardDiseaseModelLabelValue)diseaseLabel
			.getDeltaValue();
			// 2) This will set the delta
			final StandardDiseaseModelLabelValue nullAdditions = importDiseaseData(deltaState, diseaseLabel, time, timeDelta);
			
			computeAdditionalDeltasAndExchanges((IntegrationLabel)dynLabel, time, t, timeDelta);
		} // for
	}
} //ExternalDataSourceDiseaseModelImpl
