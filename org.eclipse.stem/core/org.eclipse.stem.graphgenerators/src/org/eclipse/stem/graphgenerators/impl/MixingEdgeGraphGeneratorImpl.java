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
package org.eclipse.stem.graphgenerators.impl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.common.DublinCore;
import org.eclipse.stem.core.graph.Edge;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.GraphFactory;
import org.eclipse.stem.definitions.LocationUtility;
import org.eclipse.stem.definitions.edges.EdgesFactory;
import org.eclipse.stem.definitions.edges.MixingEdge;
import org.eclipse.stem.definitions.edges.MixingEdgeLabel;
import org.eclipse.stem.definitions.edges.MixingEdgeLabelValue;
import org.eclipse.stem.definitions.edges.impl.EdgesFactoryImpl;
import org.eclipse.stem.graphgenerators.GraphgeneratorsPackage;
import org.eclipse.stem.graphgenerators.MixingEdgeGraphGenerator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mixing Edge Graph Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.graphgenerators.impl.MixingEdgeGraphGeneratorImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.stem.graphgenerators.impl.MixingEdgeGraphGeneratorImpl#getMixingRate <em>Mixing Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.graphgenerators.impl.MixingEdgeGraphGeneratorImpl#getPopulation <em>Population</em>}</li>
 *   <li>{@link org.eclipse.stem.graphgenerators.impl.MixingEdgeGraphGeneratorImpl#isUseAbsoluteValues <em>Use Absolute Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MixingEdgeGraphGeneratorImpl extends GraphGeneratorImpl implements MixingEdgeGraphGenerator {
	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final URI LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected URI location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMixingRate() <em>Mixing Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixingRate()
	 * @generated
	 * @ordered
	 */
	protected static final double MIXING_RATE_EDEFAULT = 0.1;

	/**
	 * The cached value of the '{@link #getMixingRate() <em>Mixing Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixingRate()
	 * @generated
	 * @ordered
	 */
	protected double mixingRate = MIXING_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPopulation() <em>Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected static final String POPULATION_EDEFAULT = "human";

	/**
	 * The cached value of the '{@link #getPopulation() <em>Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected String population = POPULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseAbsoluteValues() <em>Use Absolute Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseAbsoluteValues()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_ABSOLUTE_VALUES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseAbsoluteValues() <em>Use Absolute Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseAbsoluteValues()
	 * @generated
	 * @ordered
	 */
	protected boolean useAbsoluteValues = USE_ABSOLUTE_VALUES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public MixingEdgeGraphGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphgeneratorsPackage.Literals.MIXING_EDGE_GRAPH_GENERATOR;
	}
	
	
	
	/**
	 * Generate mixing edges 
	 */
	@Override
	public Graph getGraph() {
		final Graph graph = GraphFactory.eINSTANCE.createGraph();
		final DublinCore dc = graph.getDublinCore();
		dc.populate();
		dc.setTitle(MIXING_EDGE_TYPE);
		dc.setSource(this.getClass().getSimpleName());
		Calendar c = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        String valid = formatter.format(c.getTime());
       	dc.setValid(valid);
       	// TODO for now, just for testing
       	// gets ALL common border edges
       	Set<Edge> commonBorderEdges = LocationUtility.getCommonBorderEdges(project, this.getLocation());
		
		Iterator<Edge> iter = commonBorderEdges.iterator();
		while((iter!=null)&&(iter.hasNext())){
       	 		Edge e = iter.next();
				// int sourceLevel = Utility.keyLevel(e.getNodeAURI().lastSegment());
				// int targetLevel = Utility.keyLevel(e.getNodeBURI().lastSegment());
				URI sourceURI = e.getNodeAURI();
				URI targetURI = e.getNodeBURI();
				
				EdgesFactory ef = EdgesFactoryImpl.init();
				MixingEdge mEdge1 = ef.createMixingEdge();
								
				// The URI of the edge 1 
				URI edgeURI1 = mEdge1.getURI();
				// the autogenerated edge uri is not correct. Need to replace it
				String s1 = edgeURI1.toString();
				int last = s1.lastIndexOf("/");
				String sEdge1 = s1.substring(0,last);
				String sEdge2 = s1.substring(last,s1.length());
				s1 = sEdge1+"/relationship/mixing"+sEdge2;
				URI newURI = URI.createURI(s1);
				mEdge1.setURI(newURI);
				
				
				
				// ADD The URIs of the nodes connected by one NON-directed edges
				// A <=> B
				mEdge1.setNodeAURI(sourceURI);
				mEdge1.setNodeBURI(targetURI);
				
				// now we need to set the uri for the label
				MixingEdgeLabel label1 = mEdge1.getLabel();
				
				//System.out.println("BEFORE: mEdgeLabel1 URI was "+label1.getURI().toString());
				//System.out.println("BEFORE: mEdgeLabel2 URI was "+label2.getURI().toString());
				
				label1.setURI(createEdgeLabelURI(sourceURI, targetURI));
				
				MixingEdgeLabelValue melv1 = label1.getCurrentValue();
				melv1.setMixingRate(this.getMixingRate());
				
				mEdge1.setUseAbsoluteValues(this.useAbsoluteValues);
				mEdge1.setDirected(false); // MIXING edges are NOT Directed
				final DublinCore dc1 = mEdge1.getDublinCore();
				dc1.setTitle(createEdgeTitle(sourceURI, targetURI));
				
				mEdge1.setPopulationIdentifier(this.getPopulation());
				graph.putEdge(mEdge1);
		}

		assert graph.sane();

		return graph;
		}// getGraph
	
	/**
	 * 
	 * @param uriA
	 * @param uriB
	 * @return
	 */
	private static URI createEdgeLabelURI(URI uriA, URI uriB) {
		
		//System.out.println("createEdgeLabelURI() : initially, uriA = "+uriA.toString());
		//System.out.println("createEdgeLabelURI() : initially, uriB = "+uriB.toString());
		
		String sA = uriA.lastSegment();
		String sB = uriB.lastSegment();
		
		// TODO is this still true??
		// MixingEdgeLabelItemProvider
		// uses _ as a special character to separate the two nodes
		// so we need to replace it.
		sA=sA.replace('_','.');
		sB=sB.replace('_','.');
		String uriString = sA+"_"+sB;
		
		//System.out.println("createEdgeLabelURI() : FINALLY, uri = "+uriString);
		
        URI uri = STEMURI.createURI(uriString);
		return uri;
	} // createEdgeLabelURI
	
	/**
	 * @param x
	 *            the x of the node in the lattice
	 * @param y
	 *            the y of the node in the lattice
	 * @return a title for a node
	 */
	public static String createEdgeTitle(URI uriA, URI uriB) {
		String sA = uriA.lastSegment();
		String sB = uriB.lastSegment();
		final StringBuilder sb = new StringBuilder("MixingEdge[(");
		sb.append(sA);
		sb.append(")<-->(");
		sb.append(sB);
		sb.append(")]");
		
		return sb.toString();
	} // createEdgeTitle
	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(URI newLocation) {
		URI oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgeneratorsPackage.MIXING_EDGE_GRAPH_GENERATOR__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMixingRate() {
		return mixingRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMixingRate(double newMixingRate) {
		double oldMixingRate = mixingRate;
		mixingRate = newMixingRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgeneratorsPackage.MIXING_EDGE_GRAPH_GENERATOR__MIXING_RATE, oldMixingRate, mixingRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPopulation() {
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopulation(String newPopulation) {
		String oldPopulation = population;
		population = newPopulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgeneratorsPackage.MIXING_EDGE_GRAPH_GENERATOR__POPULATION, oldPopulation, population));
	}
	
	/**
	 * IProject to create edges in
	 */
	private IProject project;
	
	/**
	 * get the current project
	 */
	public IProject getProject() {
		return project; 
	}
	
	/**
	 * set the current project
	 */
	public void setProject(IProject p) {
		this.project = p;
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseAbsoluteValues() {
		return useAbsoluteValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseAbsoluteValues(boolean newUseAbsoluteValues) {
		boolean oldUseAbsoluteValues = useAbsoluteValues;
		useAbsoluteValues = newUseAbsoluteValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgeneratorsPackage.MIXING_EDGE_GRAPH_GENERATOR__USE_ABSOLUTE_VALUES, oldUseAbsoluteValues, useAbsoluteValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphgeneratorsPackage.MIXING_EDGE_GRAPH_GENERATOR__LOCATION:
				return getLocation();
			case GraphgeneratorsPackage.MIXING_EDGE_GRAPH_GENERATOR__MIXING_RATE:
				return getMixingRate();
			case GraphgeneratorsPackage.MIXING_EDGE_GRAPH_GENERATOR__POPULATION:
				return getPopulation();
			case GraphgeneratorsPackage.MIXING_EDGE_GRAPH_GENERATOR__USE_ABSOLUTE_VALUES:
				return isUseAbsoluteValues();
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
			case GraphgeneratorsPackage.MIXING_EDGE_GRAPH_GENERATOR__LOCATION:
				setLocation((URI)newValue);
				return;
			case GraphgeneratorsPackage.MIXING_EDGE_GRAPH_GENERATOR__MIXING_RATE:
				setMixingRate((Double)newValue);
				return;
			case GraphgeneratorsPackage.MIXING_EDGE_GRAPH_GENERATOR__POPULATION:
				setPopulation((String)newValue);
				return;
			case GraphgeneratorsPackage.MIXING_EDGE_GRAPH_GENERATOR__USE_ABSOLUTE_VALUES:
				setUseAbsoluteValues((Boolean)newValue);
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
			case GraphgeneratorsPackage.MIXING_EDGE_GRAPH_GENERATOR__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case GraphgeneratorsPackage.MIXING_EDGE_GRAPH_GENERATOR__MIXING_RATE:
				setMixingRate(MIXING_RATE_EDEFAULT);
				return;
			case GraphgeneratorsPackage.MIXING_EDGE_GRAPH_GENERATOR__POPULATION:
				setPopulation(POPULATION_EDEFAULT);
				return;
			case GraphgeneratorsPackage.MIXING_EDGE_GRAPH_GENERATOR__USE_ABSOLUTE_VALUES:
				setUseAbsoluteValues(USE_ABSOLUTE_VALUES_EDEFAULT);
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
			case GraphgeneratorsPackage.MIXING_EDGE_GRAPH_GENERATOR__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case GraphgeneratorsPackage.MIXING_EDGE_GRAPH_GENERATOR__MIXING_RATE:
				return mixingRate != MIXING_RATE_EDEFAULT;
			case GraphgeneratorsPackage.MIXING_EDGE_GRAPH_GENERATOR__POPULATION:
				return POPULATION_EDEFAULT == null ? population != null : !POPULATION_EDEFAULT.equals(population);
			case GraphgeneratorsPackage.MIXING_EDGE_GRAPH_GENERATOR__USE_ABSOLUTE_VALUES:
				return useAbsoluteValues != USE_ABSOLUTE_VALUES_EDEFAULT;
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
		result.append(" (location: ");
		result.append(location);
		result.append(", mixingRate: ");
		result.append(mixingRate);
		result.append(", population: ");
		result.append(population);
		result.append(", useAbsoluteValues: ");
		result.append(useAbsoluteValues);
		result.append(')');
		return result.toString();
	}

} //MixingEdgeGraphGeneratorImpl
