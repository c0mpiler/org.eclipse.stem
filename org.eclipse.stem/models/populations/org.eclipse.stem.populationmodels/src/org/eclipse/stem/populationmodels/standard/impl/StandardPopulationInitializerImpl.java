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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.osgi.util.NLS;
import org.eclipse.stem.core.Utility;
import org.eclipse.stem.core.graph.Edge;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.model.Model;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.scenario.ScenarioInitializationException;
import org.eclipse.stem.definitions.labels.AreaLabel;
import org.eclipse.stem.definitions.labels.LabelsFactory;
import org.eclipse.stem.definitions.labels.PopulationLabel;
import org.eclipse.stem.definitions.labels.PopulationLabelValue;
import org.eclipse.stem.definitions.labels.RelativePhysicalRelationshipLabel;
import org.eclipse.stem.populationmodels.standard.StandardPackage;
import org.eclipse.stem.populationmodels.standard.StandardPopulationInitializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Population Initializer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.StandardPopulationInitializerImpl#getIndividuals <em>Individuals</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.StandardPopulationInitializerImpl#isUseDensity <em>Use Density</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.StandardPopulationInitializerImpl#getTargetISOKey <em>Target ISO Key</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.StandardPopulationInitializerImpl#getTargetURI <em>Target URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StandardPopulationInitializerImpl extends PopulationInitializerImpl implements StandardPopulationInitializer {
	/**
	 * The default value of the '{@link #getIndividuals() <em>Individuals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividuals()
	 * @generated
	 * @ordered
	 */
	protected static final double INDIVIDUALS_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getIndividuals() <em>Individuals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividuals()
	 * @generated
	 * @ordered
	 */
	protected double individuals = INDIVIDUALS_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseDensity() <em>Use Density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseDensity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_DENSITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseDensity() <em>Use Density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseDensity()
	 * @generated
	 * @ordered
	 */
	protected boolean useDensity = USE_DENSITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetISOKey() <em>Target ISO Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetISOKey()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_ISO_KEY_EDEFAULT = null;

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
	 * The default value of the '{@link #getTargetURI() <em>Target URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetURI()
	 * @generated
	 * @ordered
	 */
	protected static final URI TARGET_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetURI() <em>Target URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetURI()
	 * @generated
	 * @ordered
	 */
	protected URI targetURI = TARGET_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public StandardPopulationInitializerImpl() {
		super();
		// Populate the population labels
		
	}
	
	@Override 
	public void prepare(Model model, STEMTime time) {
		// Nothing to do
	}
	
	@Override
	public void decorateGraph(STEMTime time)  throws ScenarioInitializationException {
		if(this.isGraphDecorated()) return;
		checkPopulationModels();
		ArrayList<Node>nodes = new ArrayList<Node>();
		ArrayList<Node>negativeNodes = new ArrayList<Node>();
		
		this.getNodes(this.getGraph(), this.getTargetISOKey(), nodes, negativeNodes);
		
		if(nodes.size() == 0)
			throw new ScenarioInitializationException(NLS.bind(Messages.StandardPopulationInitializerImpl_ERR_POP_INIT_NODE_NOT_FOUND, new Object[] {this.getURI().toString(), this.getTargetISOKey()}), this, new Exception());
			
		for(Node n:nodes) {
			// Check for existing label
			PopulationLabel existingLabel = null;
			for(NodeLabel lab:n.getLabels()) {
				if(lab instanceof PopulationLabel 
						&& ((PopulationLabel)lab).getPopulationIdentifier().equals(this.getPopulationIdentifier())) {
					existingLabel = (PopulationLabel)lab;
				}
			}
			if(existingLabel != null) {				
					// Initialize with new value
					initializeLabel((PopulationLabel)existingLabel, time, false);
			} else {
				// Create a new label
				PopulationLabel newLabel = LabelsFactory.eINSTANCE.createPopulationLabel();
				newLabel.setPopulationIdentifier(this.getPopulationIdentifier());
				newLabel.setURIOfIdentifiableToBeLabeled(n.getURI());
				newLabel.setNode(n);
				Graph g = this.getGraph();
				URI newURI = createPopulationLabelURI(n, time);
				g.getNodeLabels().put(newURI, newLabel);
				initializeLabel((PopulationLabel)newLabel, time, false);				
			}
		}
		
		// Now do the rest of the nodes in the graph
		
		for(Node n:negativeNodes) {
			// Check for existing label
			PopulationLabel existingLabel = null;
			for(NodeLabel lab:n.getLabels()) {
				if(lab instanceof PopulationLabel 
						&& ((PopulationLabel)lab).getPopulationIdentifier().equals(this.getPopulationIdentifier())) {
					existingLabel = (PopulationLabel)lab;
				}
			}
			if(existingLabel == null) {
				// Create a new label. We don't override the existing label
				PopulationLabel newLabel = LabelsFactory.eINSTANCE.createPopulationLabel();
				newLabel.setPopulationIdentifier(this.getPopulationIdentifier());
				newLabel.setURIOfIdentifiableToBeLabeled(n.getURI());
				newLabel.setNode(n);
				Graph g = this.getGraph();
				URI newURI = createPopulationLabelURI(n, time);
				g.getNodeLabels().put(newURI, newLabel);
				initializeLabel((PopulationLabel)newLabel, time, true);				
			}
		}
		
		return;
	}

	protected void getNodes(Graph g, String key, ArrayList<Node>list, ArrayList<Node>negList) {

		// First find other population initializers in the graph that has the same
		// population identifier but a lower level key. Any node in the substree 
		// of that lower level key should not be touched.
		
		ArrayList<StandardPopulationInitializer>lowerLevelInitializers = new ArrayList<StandardPopulationInitializer>();
		
		for(Decorator d:g.getDecorators()) {
			if(d instanceof StandardPopulationInitializer &&
					((StandardPopulationInitializer)d).getPopulationIdentifier().equals(this.getPopulationIdentifier()) &&
					Utility.keyLevel(((StandardPopulationInitializer)d).getTargetISOKey()) > Utility.keyLevel(key))
				lowerLevelInitializers.add((StandardPopulationInitializer)d);
		}
		
		for(Node n:g.getNodes().values()) {
			boolean foundSubInitializer = false;
			for(StandardPopulationInitializer spi:lowerLevelInitializers) 
				if(isSelfOrHasParent(n, spi.getTargetISOKey())) 
					{foundSubInitializer = true;break;}
			if(foundSubInitializer) continue;
			
			if((key == null || key.trim().equals("")) && isLeaf(n)) list.add(n); //$NON-NLS-1$
			else if(n.getURI().lastSegment().equals(key) && isLeaf(n)) list.add(n);
			// Check if any of the parents is the key
			else if(hasParent(n, key) && isLeaf(n)) list.add(n);
			else if(isLeaf(n)) negList.add(n);
		}
	}
	
	public boolean isLeaf(Node n) {
		for(Edge e:n.getEdges())
			if(e.getLabel() instanceof RelativePhysicalRelationshipLabel &&
					e.getA().equals(n)) 
				return false;
		return true;
	}
	
	public boolean hasParent(Node n, String key) {
		for(Edge e:n.getEdges()) {
			// Make sure it's a physical containment edge
			boolean phys = e.getLabel() instanceof RelativePhysicalRelationshipLabel;
			if(!phys) 
				continue;
			if(e.getA().getURI().lastSegment().equals(key)) return true;
			else if(Utility.keyLevel(e.getA().getURI().lastSegment()) < Utility.keyLevel(n.getURI().lastSegment()))
				return hasParent(e.getA(), key);
		}
		return false;
	}
	
	public boolean isSelfOrHasParent(Node n, String key) {
		if(n.getURI().lastSegment().equals(key)) return true;
		return hasParent(n, key);
	}

	
	/**
	 * 
	 */
	
	@Override
	protected void initializeLabel(PopulationLabel lab, STEMTime time, boolean zeroValue) throws ScenarioInitializationException {
		if(this.isUseDensity()) {
			Node n = lab.getNode();
			if(n == null) {
				throw new ScenarioInitializationException(NLS.bind(Messages.StandardPopulationInitializerImpl_CANNOT_INIT_POPULATION, new Object[] {getPopulationIdentifier(), lab.toString()}), this, new Exception());
			}
			double area = 0.0;
			for(NodeLabel l:n.getLabels()) {
				if(l instanceof AreaLabel) {
					area = ((AreaLabel)l).getCurrentAreaValue().getArea();
					break;
				}
			}
			if(area == 0.0) {
				 if(!n.getURI().toString().contains("/transport/pipe")) // No area for transport system nodes is expected. //$NON-NLS-1$
					 	throw new ScenarioInitializationException(NLS.bind(Messages.StandardPopulationInitializerImpl_UNABLE_TO_FIND_AREA, new Object[] {n.getURI().toString(), this.getURI().toString()}),this, new Exception());
				 PopulationLabelValue plv = lab.getCurrentPopulationValue();
				 if(!zeroValue) plv.setCount(this.getIndividuals());
				 else plv.setCount(0.0);
			} else {
				 PopulationLabelValue plv = lab.getCurrentPopulationValue();
				 if(!zeroValue) plv.setCount(this.getIndividuals()*area);
				 else plv.setCount(0.0);
			}
		} else {
			 PopulationLabelValue plv = lab.getCurrentPopulationValue();
			 if(!zeroValue) plv.setCount(this.getIndividuals());
			 else plv.setCount(0.0);
		}
		// Set the valid year to the start year of the sequencer
		
		lab.setValidYear(getYear(time));
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.STANDARD_POPULATION_INITIALIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIndividuals() {
		return individuals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndividuals(double newIndividuals) {
		individuals = newIndividuals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseDensity() {
		return useDensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseDensity(boolean newUseDensity) {
		useDensity = newUseDensity;
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
	public URI getTargetURI() {
		return targetURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetURI(URI newTargetURI) {
		targetURI = newTargetURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StandardPackage.STANDARD_POPULATION_INITIALIZER__INDIVIDUALS:
				return getIndividuals();
			case StandardPackage.STANDARD_POPULATION_INITIALIZER__USE_DENSITY:
				return isUseDensity();
			case StandardPackage.STANDARD_POPULATION_INITIALIZER__TARGET_ISO_KEY:
				return getTargetISOKey();
			case StandardPackage.STANDARD_POPULATION_INITIALIZER__TARGET_URI:
				return getTargetURI();
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
			case StandardPackage.STANDARD_POPULATION_INITIALIZER__INDIVIDUALS:
				setIndividuals((Double)newValue);
				return;
			case StandardPackage.STANDARD_POPULATION_INITIALIZER__USE_DENSITY:
				setUseDensity((Boolean)newValue);
				return;
			case StandardPackage.STANDARD_POPULATION_INITIALIZER__TARGET_ISO_KEY:
				setTargetISOKey((String)newValue);
				return;
			case StandardPackage.STANDARD_POPULATION_INITIALIZER__TARGET_URI:
				setTargetURI((URI)newValue);
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
			case StandardPackage.STANDARD_POPULATION_INITIALIZER__INDIVIDUALS:
				setIndividuals(INDIVIDUALS_EDEFAULT);
				return;
			case StandardPackage.STANDARD_POPULATION_INITIALIZER__USE_DENSITY:
				setUseDensity(USE_DENSITY_EDEFAULT);
				return;
			case StandardPackage.STANDARD_POPULATION_INITIALIZER__TARGET_ISO_KEY:
				setTargetISOKey(TARGET_ISO_KEY_EDEFAULT);
				return;
			case StandardPackage.STANDARD_POPULATION_INITIALIZER__TARGET_URI:
				setTargetURI(TARGET_URI_EDEFAULT);
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
			case StandardPackage.STANDARD_POPULATION_INITIALIZER__INDIVIDUALS:
				return individuals != INDIVIDUALS_EDEFAULT;
			case StandardPackage.STANDARD_POPULATION_INITIALIZER__USE_DENSITY:
				return useDensity != USE_DENSITY_EDEFAULT;
			case StandardPackage.STANDARD_POPULATION_INITIALIZER__TARGET_ISO_KEY:
				return TARGET_ISO_KEY_EDEFAULT == null ? targetISOKey != null : !TARGET_ISO_KEY_EDEFAULT.equals(targetISOKey);
			case StandardPackage.STANDARD_POPULATION_INITIALIZER__TARGET_URI:
				return TARGET_URI_EDEFAULT == null ? targetURI != null : !TARGET_URI_EDEFAULT.equals(targetURI);
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
		result.append(" (individuals: ");
		result.append(individuals);
		result.append(", useDensity: ");
		result.append(useDensity);
		result.append(", targetISOKey: ");
		result.append(targetISOKey);
		result.append(", targetURI: ");
		result.append(targetURI);
		result.append(')');
		return result.toString();
	}

} //StandardPopulationInitializerImpl
