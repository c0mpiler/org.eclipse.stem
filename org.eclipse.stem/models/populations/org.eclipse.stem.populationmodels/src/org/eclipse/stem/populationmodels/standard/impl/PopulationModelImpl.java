package org.eclipse.stem.populationmodels.standard.impl;

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
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.osgi.util.NLS;
import org.eclipse.stem.core.STEMObjectPool;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.Utility;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.Edge;
import org.eclipse.stem.core.graph.Exchange;
import org.eclipse.stem.core.graph.ExchangePool;
import org.eclipse.stem.core.graph.ExchangeType;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.graph.IntegrationLabelValue;
import org.eclipse.stem.core.graph.Label;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.model.impl.IntegrationDecoratorImpl;
import org.eclipse.stem.core.scenario.ScenarioInitializationException;
import org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProvider;
import org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProviderAdapter;
import org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProviderAdapterFactory;
import org.eclipse.stem.definitions.edges.MigrationEdge;
import org.eclipse.stem.definitions.labels.PopulationLabel;
import org.eclipse.stem.definitions.labels.PopulationLabelValue;
import org.eclipse.stem.definitions.labels.RelativePhysicalRelationshipLabel;
import org.eclipse.stem.definitions.transport.PipeStyleTransportSystem;
import org.eclipse.stem.definitions.transport.PipeTransportEdge;
import org.eclipse.stem.definitions.transport.PipeTransportEdgeLabel;
import org.eclipse.stem.definitions.transport.PipeTransportEdgeLabelValue;
import org.eclipse.stem.populationmodels.Activator;
import org.eclipse.stem.populationmodels.standard.PopulationModel;
import org.eclipse.stem.populationmodels.standard.PopulationModelLabel;
import org.eclipse.stem.populationmodels.standard.PopulationModelLabelValue;
import org.eclipse.stem.populationmodels.standard.StandardPackage;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabel;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabelValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Population Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.PopulationModelImpl#getPopulationIdentifier <em>Population Identifier</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.PopulationModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.PopulationModelImpl#getTargetISOKey <em>Target ISO Key</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.PopulationModelImpl#getInitialRescalingFactor <em>Initial Rescaling Factor</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.PopulationModelImpl#getTimePeriod <em>Time Period</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PopulationModelImpl extends IntegrationDecoratorImpl implements PopulationModel {
	/**
	 * The default value of the '{@link #getPopulationIdentifier() <em>Population Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulationIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String POPULATION_IDENTIFIER_EDEFAULT = "human"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getPopulationIdentifier() <em>Population Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulationIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String populationIdentifier = POPULATION_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "HumanPopulationModel"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetISOKey() <em>Target ISO Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetISOKey()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_ISO_KEY_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getTargetISOKey() <em>Target ISO Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetISOKey()
	 * @generated
	 * @ordered
	 */
	protected String targetISOKey = TARGET_ISO_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialRescalingFactor() <em>Initial Rescaling Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialRescalingFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double INITIAL_RESCALING_FACTOR_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getInitialRescalingFactor() <em>Initial Rescaling Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialRescalingFactor()
	 * @generated
	 * @ordered
	 */
	protected double initialRescalingFactor = INITIAL_RESCALING_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimePeriod() <em>Time Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePeriod()
	 * @generated
	 * @ordered
	 */
	protected static final long TIME_PERIOD_EDEFAULT = 86400000L;

	/**
	 * The cached value of the '{@link #getTimePeriod() <em>Time Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePeriod()
	 * @generated
	 * @ordered
	 */
	protected long timePeriod = TIME_PERIOD_EDEFAULT;

	protected Map<Node, List<PipeTransportEdge>> pipeTransportationNodeEdgesMap;

	
	/**
	 * Pool of label values used to reduce object creation. Key'd by the population identifier (different types of label values for different populations are possible)
	 */
	
	protected HashMap<String, STEMObjectPool> labelValueObjectPools = new HashMap<String, STEMObjectPool>();

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PopulationModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.POPULATION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPopulationIdentifier() {
		return populationIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopulationIdentifier(String newPopulationIdentifier) {
		populationIdentifier = newPopulationIdentifier;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetISOKey() {
		return targetISOKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetISOKey(String newTargetISOKey) {
		targetISOKey = newTargetISOKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInitialRescalingFactor() {
		return initialRescalingFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialRescalingFactor(double newInitialRescalingFactor) {
		initialRescalingFactor = newInitialRescalingFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimePeriod() {
		return timePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimePeriod(long newTimePeriod) {
		timePeriod = newTimePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getAllLabelIdentifiers() {
		EList<String> identifiers = new BasicEList<String>();
		
		identifiers.add(getPopulationIdentifier());
		
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopulationModelLabel createPopulationModelLabel(String populationIdentifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopulationModelLabelValue createPopulationModelLabelValue(String populationIdentifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Decorate the graph for a standard population model
	 * 
	 */
	@Override
	public void decorateGraph(STEMTime time) throws ScenarioInitializationException {
		if(this.isGraphDecorated()) return;
		boolean success = false;
		for(PopulationLabel populationLabel:getPopulationLabels(getPopulationIdentifier(), getGraph())) {
		//for (final Iterator<PopulationLabel> populationLabelIter = getPopulationLabels(
		//		getPopulationIdentifier(), getGraph()).iterator(); populationLabelIter
		//		.hasNext();) {
			success = true;
		
			if(this.getPopulationIdentifier().equals(populationLabel.getPopulationIdentifier())) {
				// Make sure the node does not already have a population model label for this population
				// identifier. 
				boolean found = false;
				for(NodeLabel l:populationLabel.getNode().getLabels()) {
					if(l instanceof PopulationModelLabel && 
							((PopulationModelLabel)l).getPopulationIdentifier().equals(this.getPopulationIdentifier()))
						{found = true;break;}
				}
				if(found)continue;
				
				// Okay, another population model has not yet added population model labels
				// for the same population identifier, but it might do so in the future depending
				// upon the order decorateGraph() is called on the decorators. Check if there
				// is another population model with a higher iso level target node URI that the
				// node is contained within.
				
				found = false;
				for(Decorator d:this.getGraph().getDecorators()) {
					 if(!d.equals(this) &&  
							 d instanceof PopulationModel && 
							 ((PopulationModel)d).getPopulationIdentifier().equals(this.getPopulationIdentifier()) &&
							 Utility.keyLevel(((PopulationModel)d).getTargetISOKey()) > Utility.keyLevel(this.getTargetISOKey()) &&
							 isContained(populationLabel.getNode(), (((PopulationModel)d).getTargetISOKey())))
					 {found = true;break;}
				}
				if(found) continue;
				
				// Final check. If this is not a leaf node, we don't add the population model label since there's no reason
				// to do the calculations here since they will be done in the children
				
				if(!isLeaf(populationLabel.getNode())) continue;
				
				// Ok, let's create a population model label to keep the dynamic state of the population
				
				final PopulationModelLabel pl = createPopulationModelLabel(getPopulationIdentifier());
				pl.setPopulationLabel(populationLabel); // Remember the static population label
				pl.setPopulationIdentifier(populationLabel.getPopulationIdentifier());
				// Make a unique URI for the label that's the same across running instances
				URI unique = STEMURI.createURI(Label.URI_TYPE_LABEL_SEGMENT + "/"+populationLabel.getNode().getURI().lastSegment()+"/"+this.getName()+"/"+getPopulationIdentifier()); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				pl.setURI(unique);
				pl.getDublinCore().setIdentifier(unique.toString());
				getLabelsToUpdate().add(pl);
				populationLabel.getNode().getLabels().add(pl);
				pl.setNode(populationLabel.getNode());
				getGraph().putNodeLabel(pl);
			}
		} // for each population label

		if(!success) 
			throw new ScenarioInitializationException(NLS.bind(Messages.POP_MODEL_MISSING_POP_LABELS, new Object[] {this.getURI().toString(), getPopulationIdentifier()}), this, new Exception());
		
		resetLabels();
	} // decorateGraph
	
	/**
	 * Compute additional changes to the deltas for a population model (applies to most population models). This includes considering air transportation
	 * and migration for populations. The methods also creates the Exchanges needed to share information with disease models
	 * 
	 * @param integrationLabel The label to compute additional deltas to and whose delta value will have Exchanges attached 
	*/
	public void computeAdditionalDeltasAndExchanges(IntegrationLabel integrationLabel, STEMTime time, double t, long timeDelta) {
		synchronized(this) {
			if(labelValueObjectPools.size() == 0)
				for(final String pop:this.getAllLabelIdentifiers()) {
					labelValueObjectPools.put(pop, new STEMObjectPool(5, 5) {
						
						@Override
						protected Object createNewObject() {
							return PopulationModelImpl.this.createPopulationModelLabelValue(pop);
						}

						@Override
						protected void resetObject(Object o) {
							// Nothing to do
							
						}
					});
				}
		}
		
		StandardPopulationModelLabelValue delta = (StandardPopulationModelLabelValue)integrationLabel.getDeltaValue();
		
	
		while(delta.getArrivals().size()>0) ExchangePool.POOL.release(delta.getArrivals().remove(0));
		while(delta.getDepartures().size()>0) ExchangePool.POOL.release(delta.getDepartures().remove(0));
	
		
		Exchange birthExchange = (Exchange)ExchangePool.POOL.get();
		Exchange deathExchange = (Exchange)ExchangePool.POOL.get();
		
		birthExchange.setType(ExchangeType.BIRTHS_AND_DEATHS);
		birthExchange.setCount(delta.getBirths());
		deathExchange.setType(ExchangeType.BIRTHS_AND_DEATHS);
		deathExchange.setCount(delta.getDeaths());
		delta.getArrivals().add(birthExchange);
		delta.getDepartures().add(deathExchange);
		
		
		handleMigration(integrationLabel, delta.getArrivals(),delta.getDepartures(), timeDelta, delta, t);
		handlePipeTransport(integrationLabel, delta.getArrivals(),delta.getDepartures(), timeDelta, delta);
		ECollections.sort(delta.getArrivals());
		ECollections.sort(delta.getDepartures());
	}
	
	
	/**
	 * The method checks if the count is < zero (could be if the integrator is asking for it).
	 * If this is the case, set delta to drive it to exactly zero and return true
	 * @param label
	 * @return If the label was negative and 
	 */
	protected boolean checkAndAdjustForNegative(PopulationModelLabel label) {
		if(label instanceof StandardPopulationModelLabel) {
			StandardPopulationModelLabel slabel = (StandardPopulationModelLabel)label;
			StandardPopulationModelLabelValue pval = (StandardPopulationModelLabelValue)slabel.getProbeValue();
			if(pval.getCount() < 0.0) {
				double negPop = pval.getCount();
				StandardPopulationModelLabelValue pdelta = (StandardPopulationModelLabelValue)slabel.getDeltaValue();
				pdelta.setCount(-negPop); // Drive to zero
				pdelta.setBirths(-negPop);
				pdelta.setDeaths(0);
				Exchange birthExchange = (Exchange)ExchangePool.POOL.get();
				Exchange deathExchange = (Exchange)ExchangePool.POOL.get();
				
				birthExchange.setType(ExchangeType.BIRTHS_AND_DEATHS);
				birthExchange.setCount(-negPop);
				deathExchange.setType(ExchangeType.BIRTHS_AND_DEATHS);
				deathExchange.setCount(0);
				
				while(pdelta.getArrivals().size()>0) ExchangePool.POOL.release(pdelta.getArrivals().remove(0));
				while(pdelta.getDepartures().size()>0) ExchangePool.POOL.release(pdelta.getDepartures().remove(0));
			
				pdelta.getArrivals().add(birthExchange);
				pdelta.getDepartures().add(deathExchange);
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Add stochastic noise. For population models we only round off the next value. The noise is added in the same method in the disease models
	 * 
	 * @generated NOT
	 */
	 @Override
	public void doStochasticProcess(IntegrationLabel iLabel, long timeDelta) {
		 // For now, just turn the delta into integers.
			
			IntegrationLabelValue nextVal = (IntegrationLabelValue)iLabel.getNextValue();
			EList<EAttribute> attrs = nextVal.eClass().getEAllAttributes();
			
			for(int i=0;i<attrs.size();++i) {
				EAttribute attr = attrs.get(i);
				if(attr.getEType().getClassifierID() == EcorePackage.EDOUBLE && attr.isChangeable()) {
					nextVal.eSetDouble(attr.getFeatureID(), Math.round(nextVal.eGetDouble(attr.getFeatureID())));
				}
			}
	}
	 
	
	/**
	 * isLeaf. Return true if the passed in node is a leaf
	 * @param n
	 * @return
	 */
	public boolean isLeaf(Node n) {
		for(Edge e:n.getEdges())
			if(e.getLabel() instanceof RelativePhysicalRelationshipLabel &&
					e.getA().equals(n)) 
				return false;
		return true;
	}
	
	/**
	 * Search through the graph and find all of the population labels that have
	 * the same identifier.
	 * 
	 * @param populationIdentifier
	 *            the population being labeled
	 * @param graph
	 *            the graph to search
	 * @return the PopulationLabel instances of the graph that match the
	 *         identifier.
	 */
	protected Collection<PopulationLabel> getPopulationLabels(
			final String populationIdentifier, final Graph graph) {
		final List<PopulationLabel> retValue = new ArrayList<PopulationLabel>();

		// Iterate through all of the population labels in the graph
		EList<NodeLabel> labels = graph.getNodeLabelsByTypeURI(
				PopulationLabel.URI_TYPE_POPULATION_LABEL);
		for (NodeLabel pl:labels) {
			if(getTargetISOKey() != null && !getTargetISOKey().trim().equals("") && pl.getNode() != null &&  //$NON-NLS-1$
					!isContained(pl.getNode(), getTargetISOKey()) &&
					!pl.getNode().getURI().lastSegment().equals("ZZZ")) //$NON-NLS-1$
				continue;
			
			final PopulationLabel populationLabel = (PopulationLabel) pl;
			// Is this label for the population we're looking for?
			if (populationLabel.getPopulationIdentifier().equals(
					populationIdentifier)) {
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
	} // getPopulationLabels
	
	protected boolean isContained(Node node, String targetISOKey) {
		if(node.getURI().lastSegment().equals(targetISOKey)) 
			return true;
		// Check parents
		EList<Edge>edges = node.getEdges();
		
		for(Edge e:edges) {
			if(e.getLabel() instanceof RelativePhysicalRelationshipLabel ||
					e.getLabel() instanceof PipeTransportEdgeLabel) 
				if(e.getA().equals(node)) continue;
				else if(Utility.keyLevel(e.getA().getURI().lastSegment()) 
						> Utility.keyLevel(node.getURI().lastSegment())) continue; // skip air transport edges that goes "down"
				else return isContained(e.getA(), targetISOKey);
		}
		
		return false;
	}

	
	public void applyExternalDeltas(STEMTime time, double t, long timeDelta,
			EList<DynamicLabel> labels) {
		
		for(int i=0;i<labels.size();++i) {
			final StandardPopulationModelLabel plabel = (StandardPopulationModelLabel) labels.get(i);
			
			StandardPopulationModelLabelValue myDelta = (StandardPopulationModelLabelValue)plabel.getDeltaValue();
			Node n = plabel.getNode();
			
			// Find other labels on the node that wants to exchange data
			
			EList<NodeLabel> labs = n.getLabels();
			for(int j=0;j<labs.size();++j) {
				NodeLabel l = labs.get(j);
				if(l instanceof IntegrationLabel && !l.equals(plabel) &&
						((IntegrationLabel)l).getIdentifier().equals(plabel.getIdentifier())) {
					IntegrationLabelValue sdeLabelValue = (IntegrationLabelValue)((IntegrationLabel)l).getDeltaValue();
					EList<Exchange>arrivals = sdeLabelValue.getArrivals();
					EList<Exchange>departures = sdeLabelValue.getDepartures();
					
					// Arrivals are births. Observe that arrivals should be 0 since 
					// other decorators are disease models that don't cause an "increase"
					// in births.
					
					if(arrivals != null) {
						for(int k=0;k<arrivals.size();++k) {
							Exchange entry = arrivals.get(k);
							if(entry.getType() == ExchangeType.BIRTHS_AND_DEATHS) {
								// Only the local node makes sense for disease models
								myDelta.setCount(myDelta.getCount()+entry.getCount());
								myDelta.setBirths(myDelta.getBirths()+entry.getCount());
							}
						}
					}
					// Departures are deaths 
					if(departures != null) {
						for(int k=0;k<departures.size();++k) {
							Exchange entry = departures.get(k);
							if(entry.getType() == ExchangeType.BIRTHS_AND_DEATHS) {// Only the local node makes sense for disease models
								myDelta.setCount(myDelta.getCount() - entry.getCount());
								myDelta.setDeaths(myDelta.getDeaths()+entry.getCount());
								// For stochastic modeling we need to know this
								entry.getOtherLabels().add(plabel);
							}
						}
					}

				}
			}

		}
	}
	
	/**
	 * 
	 * @param label
	 * @param arrivals
	 * @param departures
	 * @param timeDelta
	 * @param idelta
	 * @param timeInCycles
	 */
	protected void handleMigration(IntegrationLabel label, EList<Exchange>arrivals,EList<Exchange>departures, long timeDelta, IntegrationLabelValue idelta, double timeInCycles) {
		Node n = (Node)label.getIdentifiable();
		StandardPopulationModelLabelValue delta = (StandardPopulationModelLabelValue)idelta;
		// double totalRemoved = 0.0; // Keeps track of the total number removed from the node. We use it to display an error when more people are removed than available.
		
		EList<Edge> edges = n.getEdges();
		for(int i=0;i<edges.size();++i) {
			Edge e = edges.get(i);
			if(e instanceof MigrationEdge) {
				MigrationEdge me = (MigrationEdge)e;
				if(!me.getPopulationIdentifier().equals(((PopulationModelLabel)label).getPopulationIdentifier())) continue;
				
				// Migration is FROM A TO B
				Node source = me.getA();
				Node dest = me.getB();
						
				boolean leaving = source.equals(n);
				double rate = me.getLabel().getCurrentValue().getMigrationRate();
				long timeperiod = me.getLabel().getCurrentValue().getTimePeriod();
				if(leaving) {
					StandardPopulationModelLabelValue val = ((StandardPopulationModelLabelValue) label.getTempValue()); // Must be temp value to ensure destination labels gets the same result
					double count = val.getCount();
					double goodbye; // rescale and adjust
					
					if (me.isUseAbsoluteValues()) {
						// rate is absolute
						goodbye = rate*(double)timeDelta/(double)timeperiod;
					} else {
						// rate is relative (fraction of whole population)
						goodbye = count*rate*(double)timeDelta/(double)timeperiod;
					}
					
					delta.setCount(delta.getCount()-goodbye);
					// totalRemoved += goodbye;
					Exchange migrationExchange = (Exchange)ExchangePool.POOL.get(); // released later?
					Label otherLabel = null;
					
					EList<NodeLabel>destLabels = dest.getLabels();
					for(int j=0;j<destLabels.size();++j) {
						Label lab = destLabels.get(j);
						if (lab instanceof StandardPopulationModelLabel && ((StandardPopulationModelLabel)lab).getPopulationIdentifier().equals(((PopulationModelLabel)label).getPopulationIdentifier())) {
							otherLabel = lab;
							break;
						}
					}
					
					if(otherLabel == null) {
						
						Activator.logError(NLS.bind(Messages.EDGE_POP_MODEL_MISSING, new Object[] {dest.getURI().toString(), ((PopulationModelLabel)label).getPopulationIdentifier()}), new Exception());
						return;
					}
					
					migrationExchange.setType(ExchangeType.MIGRATION);
					migrationExchange.getOtherLabels().add(otherLabel);
					migrationExchange.setCount(goodbye);
					delta.getDepartures().add(migrationExchange);
				} else {
					// Find the population model label on the dest node
					StandardPopulationModelLabelValue otherVal = null;
					Label otherLabel = null;
					EList<NodeLabel>sourceLabels = source.getLabels();
					for(int j=0;j<sourceLabels.size();++j) {
						NodeLabel lab = sourceLabels.get(j);
						if(lab instanceof StandardPopulationModelLabel && ((PopulationModelLabel)lab).getPopulationIdentifier().equals(((PopulationModelLabel)label).getPopulationIdentifier())) {
							otherVal = (StandardPopulationModelLabelValue)((StandardPopulationModelLabel)lab).getTempValue();
							otherLabel = lab;
							break;
						}
					}
					if(otherVal == null) {
						Activator.logError(NLS.bind(Messages.EDGE_POP_MODEL_MISSING, new Object[] {dest.getURI().toString(), ((PopulationModelLabel)label).getPopulationIdentifier()}), new Exception());
						return;
					}
					double count = otherVal.getCount();
					double welcome; // rescale and adjust
					
					if (me.isUseAbsoluteValues()) {
						// rate is absolute
						welcome = rate*(double)timeDelta/(double)timeperiod;
					} else {
						// rate is relative (fraction of whole population)
						welcome = count*rate*(double)timeDelta/(double)timeperiod;
					}
					
					delta.setCount(delta.getCount()+welcome);
					
					Exchange migrationExchange = (Exchange)ExchangePool.POOL.get();
					
					migrationExchange.setType(ExchangeType.MIGRATION);
					migrationExchange.getOtherLabels().add(otherLabel);
					migrationExchange.setCount(welcome);
					delta.getArrivals().add(migrationExchange);
				}
			} // Migration edge
		} // For each edge
		// 04/11/2012 Commented out: This is not an error. It can happen in many cases,
		// for example if the time step is huge or if the MigrationEdge has an absolute Value 
		//		StandardPopulationModelLabelValue val = ((StandardPopulationModelLabelValue) label.getTempValue()); 
		//		if(val.getCount() - totalRemoved < 0.0) 
		//		Activator.logError(NLS.bind(Messages.MIGRATION_EXCEEDS_AVAILABLE_POPULATION, new Object[] {label.getIdentifiable().getURI(), label.getPopulationIdentifier(), Double.valueOf(totalRemoved), Double.valueOf(val.getCount())}), new Exception());
	}
	
	protected void handlePipeTransport(IntegrationLabel populationLabel, EList<Exchange>arrivals,EList<Exchange>departures, long timeDelta, IntegrationLabelValue delta) {
		// Get the pipe transport edges to/from the node
		Node node = populationLabel.getNode();
		List<PipeTransportEdge>pedges = pipeTransportationNodeEdgesMap.get(node);
		if(pedges == null) return; // no edges
		
		// Now figure out how many people to actually move between nodes
		
		for(int i=0;i<pedges.size();++i) {
			PipeTransportEdge pedge = pedges.get(i);
			if(!pedge.getPopulationIdentifier().equals(this.getPopulationIdentifier())) continue; // wrong population
			
			boolean incomming = pedge.getB().equals(node);
			if(incomming) {
				EList<NodeLabel>labs = pedge.getA().getLabels();
				for(int j=0;j<labs.size();++j) {
					NodeLabel lab = labs.get(j);
					if(lab instanceof StandardPopulationModelLabel && ((StandardPopulationModelLabel)lab).getPopulationIdentifier().equals(((PopulationModelLabel)populationLabel).getPopulationIdentifier())) {
						StandardPopulationModelLabel otherLabel = (StandardPopulationModelLabel)lab;
						StandardPopulationModelLabelValue otherValue = (StandardPopulationModelLabelValue)otherLabel.getTempValue();
						StandardPopulationModelLabelValue change = (StandardPopulationModelLabelValue)labelValueObjectPools.get(otherLabel.getIdentifier()).get();
						change.set((StandardPopulationModelLabelValue)otherValue);
						PipeTransportEdgeLabelValue edgeLabelValue =  (PipeTransportEdgeLabelValue)pedge.getLabel().getCurrentValue();
						double maxFlow = edgeLabelValue.getMaxFlow();
						double flow = maxFlow;
						double popCount = ((StandardPopulationModelLabelValue)otherLabel.getTempValue()).getCount();
						if(flow > popCount) 
							flow = popCount; // don't move more people than available.
						
						long timePeriod = edgeLabelValue.getTimePeriod();
						double factor = flow / popCount;
						
						factor = factor * timeDelta / timePeriod;
						if(Double.isNaN(factor) || Double.isInfinite(factor)) factor = 0.0;
						change.scale(factor);
						
						delta.add((IntegrationLabelValue)change);
						
						Exchange migrationExchange = (Exchange)ExchangePool.POOL.get();
						
						migrationExchange.setType(ExchangeType.MIGRATION);
						migrationExchange.getOtherLabels().add(otherLabel);
						migrationExchange.setCount(change.getCount());
						delta.getArrivals().add(migrationExchange);
						labelValueObjectPools.get(otherLabel.getIdentifier()).release(change);
						break;
					}
				}
			} else { // outgoing edge
				EList<NodeLabel>labs = pedge.getB().getLabels();
				for(int j=0;j<labs.size();++j) {
					NodeLabel lab = labs.get(j);
					if(lab instanceof StandardPopulationModelLabel && ((StandardPopulationModelLabel)lab).getPopulationIdentifier().equals(((PopulationModelLabel)populationLabel).getPopulationIdentifier())) {
						StandardPopulationModelLabel otherLabel = (StandardPopulationModelLabel)lab;
						StandardPopulationModelLabelValue thisValue = (StandardPopulationModelLabelValue)populationLabel.getTempValue();
						StandardPopulationModelLabelValue change = (StandardPopulationModelLabelValue)labelValueObjectPools.get(otherLabel.getIdentifier()).get();
						change.set((StandardPopulationModelLabelValue)thisValue);
						
						PipeTransportEdgeLabelValue edgeLabelValue =  (PipeTransportEdgeLabelValue)pedge.getLabel().getCurrentValue();
						double maxFlow = edgeLabelValue.getMaxFlow();
						double popCount = ((StandardPopulationModelLabelValue)populationLabel.getTempValue()).getCount();
						double flow = maxFlow;
						if(flow > popCount) 
							flow = popCount;

						long timePeriod = edgeLabelValue.getTimePeriod();
						double factor = flow / popCount;
						factor = factor * timeDelta / timePeriod;
						if(Double.isNaN(factor) || Double.isInfinite(factor)) factor = 0.0;
						change.scale(factor);
						
						delta.sub((IntegrationLabelValue)change);
						
						Exchange migrationExchange = (Exchange)ExchangePool.POOL.get();
						
						migrationExchange.setType(ExchangeType.MIGRATION);
						migrationExchange.getOtherLabels().add(otherLabel);
						migrationExchange.setCount(change.getCount());
						delta.getDepartures().add(migrationExchange);
						labelValueObjectPools.get(otherLabel.getIdentifier()).release(change);
						break;
					}
				}
			}
		} // for each edge		
	}
	
	protected void populatePipeSystemNodes() {
		Graph graph = this.getGraph();
		
		if(pipeTransportationNodeEdgesMap == null)  initPipeTransport(graph);
		
		for(Map.Entry<Node, List<PipeTransportEdge>>entry:pipeTransportationNodeEdgesMap.entrySet()) {
			Node n = entry.getKey();
			if(n instanceof PipeStyleTransportSystem) {
				// We need to create an initial population here. 
				// We do this by looking at all incoming pipe edges to the node and add up the total flow.
				List<PipeTransportEdge>pipeEdges = entry.getValue();
				double totalPop = 0.0;
				for(PipeTransportEdge pedge:pipeEdges) 
					if(pedge.getB().equals(n)) 
						totalPop += ((PipeTransportEdgeLabelValue) pedge.getLabel().getCurrentValue()).getMaxFlow();
			
				for(NodeLabel nlabel:n.getLabels()) {
					if(nlabel instanceof StandardPopulationModelLabel && ((StandardPopulationModelLabel)nlabel).getPopulationIdentifier().equals(this.getPopulationIdentifier())) {
						StandardPopulationModelLabelValue splv = (StandardPopulationModelLabelValue)((StandardPopulationModelLabel)nlabel).getCurrentValue();
						splv.setCount(totalPop);
						PopulationLabelValue plv = (PopulationLabelValue)((StandardPopulationModelLabel)nlabel).getPopulationLabel().getCurrentPopulationValue();
						plv.setCount(totalPop);
					}
				}
			}
		}
	}
	
	/**
	 * initialize pipe transport maps organizing pipes by direction (up/down)
	 * and level
	 * @param graph
	 */
	private void initPipeTransport(Graph graph) {
		pipeTransportationNodeEdgesMap = new HashMap<Node, List<PipeTransportEdge>>();
		// Traverse all pipe transport edges and determine what
		// geographic level their source (A) node is at
		for(URI edgeURI : graph.getEdges().keySet()) {
			Edge edge = graph.getEdges().get(edgeURI);
			
			if(edge instanceof PipeTransportEdge) {
				PipeTransportEdge pedge = (PipeTransportEdge)edge;
								
				
				Node a = edge.getA();
				Node b = edge.getB();
				
				if(a != null)
					if(pipeTransportationNodeEdgesMap.containsKey(a))
						pipeTransportationNodeEdgesMap.get(a).add(pedge);
					else {
						ArrayList<PipeTransportEdge> newList = new ArrayList<PipeTransportEdge>();
						newList.add(pedge);
						pipeTransportationNodeEdgesMap.put(a, newList);
					}	
				
				if(b != null)
					if(pipeTransportationNodeEdgesMap.containsKey(b))
						pipeTransportationNodeEdgesMap.get(b).add(pedge);
					else {
						ArrayList<PipeTransportEdge> newList = new ArrayList<PipeTransportEdge>();
						newList.add(pedge);
						pipeTransportationNodeEdgesMap.put(b, newList);
					}	
			}
		}
	}
	
	@Override
	public void resetLabels() throws ScenarioInitializationException {
		super.resetLabels();
		// Populate the pipe transportation systems
		this.populatePipeSystemNodes();
	}
	
	public List<IItemPropertyDescriptor> getCompartments(String populationIdentifier) {
		PopulationModelLabel label = createPopulationModelLabel(populationIdentifier);
		
		final RelativeValueProviderAdapter rvp = (RelativeValueProviderAdapter)
				RelativeValueProviderAdapterFactory.INSTANCE.adapt(label, RelativeValueProvider.class);

		// Does the label have relative values?
		if (rvp != null) {
			// Yes
			rvp.setTarget(label);
			return rvp.getProperties();
		}
		
		return null;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StandardPackage.POPULATION_MODEL__POPULATION_IDENTIFIER:
				return getPopulationIdentifier();
			case StandardPackage.POPULATION_MODEL__NAME:
				return getName();
			case StandardPackage.POPULATION_MODEL__TARGET_ISO_KEY:
				return getTargetISOKey();
			case StandardPackage.POPULATION_MODEL__INITIAL_RESCALING_FACTOR:
				return getInitialRescalingFactor();
			case StandardPackage.POPULATION_MODEL__TIME_PERIOD:
				return getTimePeriod();
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
			case StandardPackage.POPULATION_MODEL__POPULATION_IDENTIFIER:
				setPopulationIdentifier((String)newValue);
				return;
			case StandardPackage.POPULATION_MODEL__NAME:
				setName((String)newValue);
				return;
			case StandardPackage.POPULATION_MODEL__TARGET_ISO_KEY:
				setTargetISOKey((String)newValue);
				return;
			case StandardPackage.POPULATION_MODEL__INITIAL_RESCALING_FACTOR:
				setInitialRescalingFactor((Double)newValue);
				return;
			case StandardPackage.POPULATION_MODEL__TIME_PERIOD:
				setTimePeriod((Long)newValue);
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
			case StandardPackage.POPULATION_MODEL__POPULATION_IDENTIFIER:
				setPopulationIdentifier(POPULATION_IDENTIFIER_EDEFAULT);
				return;
			case StandardPackage.POPULATION_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StandardPackage.POPULATION_MODEL__TARGET_ISO_KEY:
				setTargetISOKey(TARGET_ISO_KEY_EDEFAULT);
				return;
			case StandardPackage.POPULATION_MODEL__INITIAL_RESCALING_FACTOR:
				setInitialRescalingFactor(INITIAL_RESCALING_FACTOR_EDEFAULT);
				return;
			case StandardPackage.POPULATION_MODEL__TIME_PERIOD:
				setTimePeriod(TIME_PERIOD_EDEFAULT);
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
			case StandardPackage.POPULATION_MODEL__POPULATION_IDENTIFIER:
				return POPULATION_IDENTIFIER_EDEFAULT == null ? populationIdentifier != null : !POPULATION_IDENTIFIER_EDEFAULT.equals(populationIdentifier);
			case StandardPackage.POPULATION_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StandardPackage.POPULATION_MODEL__TARGET_ISO_KEY:
				return TARGET_ISO_KEY_EDEFAULT == null ? targetISOKey != null : !TARGET_ISO_KEY_EDEFAULT.equals(targetISOKey);
			case StandardPackage.POPULATION_MODEL__INITIAL_RESCALING_FACTOR:
				return initialRescalingFactor != INITIAL_RESCALING_FACTOR_EDEFAULT;
			case StandardPackage.POPULATION_MODEL__TIME_PERIOD:
				return timePeriod != TIME_PERIOD_EDEFAULT;
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
		result.append(" (populationIdentifier: ");
		result.append(populationIdentifier);
		result.append(", name: ");
		result.append(name);
		result.append(", targetISOKey: ");
		result.append(targetISOKey);
		result.append(", initialRescalingFactor: ");
		result.append(initialRescalingFactor);
		result.append(", timePeriod: ");
		result.append(timePeriod);
		result.append(')');
		return result.toString();
	}

} //PopulationModelImpl
