package org.eclipse.stem.interventions.impl;

/******************************************************************************* 
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     IBM Corporation - initial API and implementation 
 *******************************************************************************/

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
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.GraphFactory;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.definitions.LocationUtility;
import org.eclipse.stem.definitions.labels.PopulationLabel;
import org.eclipse.stem.definitions.labels.PopulationLabelValue;
import org.eclipse.stem.graphgenerators.impl.GraphGeneratorImpl;
import org.eclipse.stem.interventions.ControlGraphGenerator;
import org.eclipse.stem.interventions.InterventionsFactory;
import org.eclipse.stem.interventions.InterventionsPackage;
import org.eclipse.stem.interventions.StandardInterventionLabel;
import org.eclipse.stem.interventions.StandardInterventionLabelValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Graph Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.interventions.impl.ControlGraphGeneratorImpl#getVaccinationFraction <em>Vaccination Fraction</em>}</li>
 *   <li>{@link org.eclipse.stem.interventions.impl.ControlGraphGeneratorImpl#getIsolationFraction <em>Isolation Fraction</em>}</li>
 *   <li>{@link org.eclipse.stem.interventions.impl.ControlGraphGeneratorImpl#getPopulationIdentifier <em>Population Identifier</em>}</li>
 *   <li>{@link org.eclipse.stem.interventions.impl.ControlGraphGeneratorImpl#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControlGraphGeneratorImpl extends GraphGeneratorImpl implements ControlGraphGenerator {
	
	/** 
	 * Control graph type
	 */
	public static final String CONTROL_GRAPH_TYPE="Control Graph";

	/**
	 * The URI segment used to identify it as an intervention label
	 */
	
	public static final String INTERVENTION_LABEL_URI_SEGMENT = "intervention";
	
	
	/**
	 * The default value of the '{@link #getVaccinationFraction() <em>Vaccination Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaccinationFraction()
	 * @generated
	 * @ordered
	 */
	protected static final double VACCINATION_FRACTION_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getVaccinationFraction() <em>Vaccination Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaccinationFraction()
	 * @generated
	 * @ordered
	 */
	protected double vaccinationFraction = VACCINATION_FRACTION_EDEFAULT;
	/**
	 * The default value of the '{@link #getIsolationFraction() <em>Isolation Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolationFraction()
	 * @generated
	 * @ordered
	 */
	protected static final double ISOLATION_FRACTION_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getIsolationFraction() <em>Isolation Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolationFraction()
	 * @generated
	 * @ordered
	 */
	protected double isolationFraction = ISOLATION_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPopulationIdentifier() <em>Population Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulationIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String POPULATION_IDENTIFIER_EDEFAULT = "human";
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ControlGraphGeneratorImpl() {
		super();
	}

	
	/**
	 * IProject to create control node labels in
	 */
	private IProject project;
	public IProject getProject() {
		return project; 
	}
	public void setProject(IProject p) {
		this.project = p;
	}
	
	
	/**
	 * Generate control labels
	 * 
	 * @generated NOT
	 */
	
	@Override
	public Graph getGraph() {
		final Graph graph = GraphFactory.eINSTANCE.createGraph();
		final DublinCore dc = graph.getDublinCore();
		dc.populate();
		dc.setTitle(CONTROL_GRAPH_TYPE);
		dc.setSource(this.getClass().getSimpleName());
		Calendar c = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        String valid = formatter.format(c.getTime());
       	dc.setValid(valid);
       	Set<Node> allNodes = LocationUtility.getNodes(project, this.getLocation());
		
		Iterator<Node> iter = allNodes.iterator();
		while((iter!=null)&&(iter.hasNext())){
       	 		Node n = iter.next();
		
       	 		
       	 		StandardInterventionLabel scl = InterventionsFactory.eINSTANCE.createStandardInterventionLabel();
       	 		
			
       	 		scl.setURIOfIdentifiableToBeLabeled(n.getURI());
       	 		scl.setPopulationIdentifier(this.getPopulationIdentifier());
       	 		
       	 		StandardInterventionLabelValue currentValue = InterventionsFactory.eINSTANCE.createStandardInterventionLabelValue();
   	 		
       	 		scl.setCurrentValue(currentValue);
       	 		
       	 		scl.setURI(STEMURI.createURI(INTERVENTION_LABEL_URI_SEGMENT+"/"+n.getURI().lastSegment()));
       	 		
       	 		// We need to find the population label to get the actual initial number of
       	 		// daily isolations/vaccinations
       	 		
       	 		double population = 0.0;
       	 		for(NodeLabel lab:n.getLabels()) {
       	 			if(lab instanceof PopulationLabel) {
       	 				PopulationLabelValue plv = ((PopulationLabel)lab).getCurrentPopulationValue();
       	 				population = plv.getCount();
       	 				break;
       	 			}
       	 		}
       	 		currentValue.setIsolations(this.getIsolationFraction()*population);
       	 		currentValue.setVaccinations(this.getVaccinationFraction()*population);
   	 						
				graph.putNodeLabel(scl);
		}

		assert graph.sane();

		return graph;

	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InterventionsPackage.Literals.CONTROL_GRAPH_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVaccinationFraction() {
		return vaccinationFraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVaccinationFraction(double newVaccinationFraction) {
		double oldVaccinationFraction = vaccinationFraction;
		vaccinationFraction = newVaccinationFraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterventionsPackage.CONTROL_GRAPH_GENERATOR__VACCINATION_FRACTION, oldVaccinationFraction, vaccinationFraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIsolationFraction() {
		return isolationFraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsolationFraction(double newIsolationFraction) {
		double oldIsolationFraction = isolationFraction;
		isolationFraction = newIsolationFraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterventionsPackage.CONTROL_GRAPH_GENERATOR__ISOLATION_FRACTION, oldIsolationFraction, isolationFraction));
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
		String oldPopulationIdentifier = populationIdentifier;
		populationIdentifier = newPopulationIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterventionsPackage.CONTROL_GRAPH_GENERATOR__POPULATION_IDENTIFIER, oldPopulationIdentifier, populationIdentifier));
	}
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
			eNotify(new ENotificationImpl(this, Notification.SET, InterventionsPackage.CONTROL_GRAPH_GENERATOR__LOCATION, oldLocation, location));
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InterventionsPackage.CONTROL_GRAPH_GENERATOR__VACCINATION_FRACTION:
				return getVaccinationFraction();
			case InterventionsPackage.CONTROL_GRAPH_GENERATOR__ISOLATION_FRACTION:
				return getIsolationFraction();
			case InterventionsPackage.CONTROL_GRAPH_GENERATOR__POPULATION_IDENTIFIER:
				return getPopulationIdentifier();
			case InterventionsPackage.CONTROL_GRAPH_GENERATOR__LOCATION:
				return getLocation();
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
			case InterventionsPackage.CONTROL_GRAPH_GENERATOR__VACCINATION_FRACTION:
				setVaccinationFraction((Double)newValue);
				return;
			case InterventionsPackage.CONTROL_GRAPH_GENERATOR__ISOLATION_FRACTION:
				setIsolationFraction((Double)newValue);
				return;
			case InterventionsPackage.CONTROL_GRAPH_GENERATOR__POPULATION_IDENTIFIER:
				setPopulationIdentifier((String)newValue);
				return;
			case InterventionsPackage.CONTROL_GRAPH_GENERATOR__LOCATION:
				setLocation((URI)newValue);
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
			case InterventionsPackage.CONTROL_GRAPH_GENERATOR__VACCINATION_FRACTION:
				setVaccinationFraction(VACCINATION_FRACTION_EDEFAULT);
				return;
			case InterventionsPackage.CONTROL_GRAPH_GENERATOR__ISOLATION_FRACTION:
				setIsolationFraction(ISOLATION_FRACTION_EDEFAULT);
				return;
			case InterventionsPackage.CONTROL_GRAPH_GENERATOR__POPULATION_IDENTIFIER:
				setPopulationIdentifier(POPULATION_IDENTIFIER_EDEFAULT);
				return;
			case InterventionsPackage.CONTROL_GRAPH_GENERATOR__LOCATION:
				setLocation(LOCATION_EDEFAULT);
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
			case InterventionsPackage.CONTROL_GRAPH_GENERATOR__VACCINATION_FRACTION:
				return vaccinationFraction != VACCINATION_FRACTION_EDEFAULT;
			case InterventionsPackage.CONTROL_GRAPH_GENERATOR__ISOLATION_FRACTION:
				return isolationFraction != ISOLATION_FRACTION_EDEFAULT;
			case InterventionsPackage.CONTROL_GRAPH_GENERATOR__POPULATION_IDENTIFIER:
				return POPULATION_IDENTIFIER_EDEFAULT == null ? populationIdentifier != null : !POPULATION_IDENTIFIER_EDEFAULT.equals(populationIdentifier);
			case InterventionsPackage.CONTROL_GRAPH_GENERATOR__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
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
		result.append(" (vaccinationFraction: ");
		result.append(vaccinationFraction);
		result.append(", isolationFraction: ");
		result.append(isolationFraction);
		result.append(", populationIdentifier: ");
		result.append(populationIdentifier);
		result.append(", location: ");
		result.append(location);
		result.append(')');
		return result.toString();
	}

} //ControlGraphGeneratorImpl
