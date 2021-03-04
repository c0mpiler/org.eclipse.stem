/******************************************************************************* 
 * Copyright (c) 2012 Bundesinstitut für Risikobewertung. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     Bundesinstitut für Risikobewertung - initial API and implementation 
 *******************************************************************************/

package org.eclipse.stem.foodproduction.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.Edge;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.model.impl.TransformationDecoratorImpl;
import org.eclipse.stem.core.scenario.ScenarioInitializationException;
import org.eclipse.stem.definitions.labels.PopulationLabel;
import org.eclipse.stem.definitions.labels.RelativePhysicalRelationshipLabel;
import org.eclipse.stem.foodproduction.FoodTransformer;
import org.eclipse.stem.foodproduction.FoodproductionPackage;
import org.eclipse.stem.populationmodels.standard.DemographicPopulationModel;
import org.eclipse.stem.populationmodels.standard.PopulationGroup;
import org.eclipse.stem.populationmodels.standard.PopulationModel;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Food Transformer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.foodproduction.impl.FoodTransformerImpl#getSourcePopulationName <em>Source Population Name</em>}</li>
 *   <li>{@link org.eclipse.stem.foodproduction.impl.FoodTransformerImpl#getTargetPopulationName <em>Target Population Name</em>}</li>
 *   <li>{@link org.eclipse.stem.foodproduction.impl.FoodTransformerImpl#getTargetURI <em>Target URI</em>}</li>
 *   <li>{@link org.eclipse.stem.foodproduction.impl.FoodTransformerImpl#getTimePeriod <em>Time Period</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FoodTransformerImpl extends TransformationDecoratorImpl implements FoodTransformer {
	/**
	 * The default value of the '{@link #getSourcePopulationName() <em>Source Population Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePopulationName()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_POPULATION_NAME_EDEFAULT = "cattle";

	/**
	 * The cached value of the '{@link #getSourcePopulationName() <em>Source Population Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePopulationName()
	 * @generated
	 * @ordered
	 */
	protected String sourcePopulationName = SOURCE_POPULATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetPopulationName() <em>Target Population Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPopulationName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_POPULATION_NAME_EDEFAULT = "beef";

	/**
	 * The cached value of the '{@link #getTargetPopulationName() <em>Target Population Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPopulationName()
	 * @generated
	 * @ordered
	 */
	protected String targetPopulationName = TARGET_POPULATION_NAME_EDEFAULT;

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FoodTransformerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FoodproductionPackage.Literals.FOOD_TRANSFORMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourcePopulationName() {
		return sourcePopulationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePopulationName(String newSourcePopulationName) {
		String oldSourcePopulationName = sourcePopulationName;
		sourcePopulationName = newSourcePopulationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoodproductionPackage.FOOD_TRANSFORMER__SOURCE_POPULATION_NAME, oldSourcePopulationName, sourcePopulationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetPopulationName() {
		return targetPopulationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPopulationName(String newTargetPopulationName) {
		String oldTargetPopulationName = targetPopulationName;
		targetPopulationName = newTargetPopulationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoodproductionPackage.FOOD_TRANSFORMER__TARGET_POPULATION_NAME, oldTargetPopulationName, targetPopulationName));
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
		URI oldTargetURI = targetURI;
		targetURI = newTargetURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoodproductionPackage.FOOD_TRANSFORMER__TARGET_URI, oldTargetURI, targetURI));
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
		long oldTimePeriod = timePeriod;
		timePeriod = newTimePeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoodproductionPackage.FOOD_TRANSFORMER__TIME_PERIOD, oldTimePeriod, timePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FoodproductionPackage.FOOD_TRANSFORMER__SOURCE_POPULATION_NAME:
				return getSourcePopulationName();
			case FoodproductionPackage.FOOD_TRANSFORMER__TARGET_POPULATION_NAME:
				return getTargetPopulationName();
			case FoodproductionPackage.FOOD_TRANSFORMER__TARGET_URI:
				return getTargetURI();
			case FoodproductionPackage.FOOD_TRANSFORMER__TIME_PERIOD:
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
			case FoodproductionPackage.FOOD_TRANSFORMER__SOURCE_POPULATION_NAME:
				setSourcePopulationName((String)newValue);
				return;
			case FoodproductionPackage.FOOD_TRANSFORMER__TARGET_POPULATION_NAME:
				setTargetPopulationName((String)newValue);
				return;
			case FoodproductionPackage.FOOD_TRANSFORMER__TARGET_URI:
				setTargetURI((URI)newValue);
				return;
			case FoodproductionPackage.FOOD_TRANSFORMER__TIME_PERIOD:
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
			case FoodproductionPackage.FOOD_TRANSFORMER__SOURCE_POPULATION_NAME:
				setSourcePopulationName(SOURCE_POPULATION_NAME_EDEFAULT);
				return;
			case FoodproductionPackage.FOOD_TRANSFORMER__TARGET_POPULATION_NAME:
				setTargetPopulationName(TARGET_POPULATION_NAME_EDEFAULT);
				return;
			case FoodproductionPackage.FOOD_TRANSFORMER__TARGET_URI:
				setTargetURI(TARGET_URI_EDEFAULT);
				return;
			case FoodproductionPackage.FOOD_TRANSFORMER__TIME_PERIOD:
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
			case FoodproductionPackage.FOOD_TRANSFORMER__SOURCE_POPULATION_NAME:
				return SOURCE_POPULATION_NAME_EDEFAULT == null ? sourcePopulationName != null : !SOURCE_POPULATION_NAME_EDEFAULT.equals(sourcePopulationName);
			case FoodproductionPackage.FOOD_TRANSFORMER__TARGET_POPULATION_NAME:
				return TARGET_POPULATION_NAME_EDEFAULT == null ? targetPopulationName != null : !TARGET_POPULATION_NAME_EDEFAULT.equals(targetPopulationName);
			case FoodproductionPackage.FOOD_TRANSFORMER__TARGET_URI:
				return TARGET_URI_EDEFAULT == null ? targetURI != null : !TARGET_URI_EDEFAULT.equals(targetURI);
			case FoodproductionPackage.FOOD_TRANSFORMER__TIME_PERIOD:
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
		result.append(" (sourcePopulationName: ");
		result.append(sourcePopulationName);
		result.append(", targetPopulationName: ");
		result.append(targetPopulationName);
		result.append(", targetURI: ");
		result.append(targetURI);
		result.append(", timePeriod: ");
		result.append(timePeriod);
		result.append(')');
		return result.toString();
	}

	/**
	 * Initialize what's needed
	 * @generated NOT
	 */
	@Override
	public void decorateGraph(STEMTime time) throws ScenarioInitializationException {
		// Find the population model and disease model matching the source population identifier and food population identifier and add its labels
		// to the labels this decorator updates.
		String sourcePopulation = this.getSourcePopulationName();
		String foodPopulation = this.getTargetPopulationName();
		
		Graph canonicalGraph = this.getGraph();
		
		EList<Decorator> decorators = canonicalGraph.getDecorators();
		
		for(Decorator d:decorators) {
			if(d instanceof PopulationModel)
				if(d instanceof DemographicPopulationModel) {
					DemographicPopulationModel dpm = (DemographicPopulationModel)d;
					EList<PopulationGroup> groups = dpm.getPopulationGroups();
					for(PopulationGroup g:groups) {
						if(g.getIdentifier().equals(sourcePopulation)) 
							this.addMatchingPopLabels(dpm.getLabelsToUpdate(), sourcePopulation, foodPopulation);		
					}
				} else {
					PopulationModel pm = (PopulationModel)d;
					if(pm.getPopulationIdentifier().equals(sourcePopulation)) {
						this.addMatchingPopLabels(pm.getLabelsToUpdate(), sourcePopulation, foodPopulation);
					}
						
				}
			
		}
		
		// ToDo: Add disease model labels
	}
	
	/**
	 * TODO we need to thing about multiple food producers. Problems if some are global and some have uri
	 * @param sourceLabels
	 * @param sourcePop
	 * @param foodPop
	 */
	private void addMatchingPopLabels(EList<DynamicLabel> sourceLabels,String sourcePop, String foodPop) {
		URI thisTransformersURI = this.targetURI;
		for(DynamicLabel dl:sourceLabels) {
			if(dl instanceof StandardPopulationModelLabel) { // safe
				StandardPopulationModelLabel popLabel = (StandardPopulationModelLabel)dl;
				if(popLabel.getPopulationIdentifier().equals(sourcePop) && existsStaticPopulationLabel(foodPop, (Node)dl.getIdentifiable())) {
					Node node = popLabel.getNode();
					//boolean contained = false;
					
					if(thisTransformersURI==null) {
						// label everything
						this.getSourceLabels().add(popLabel);
					} else {
						// traverse the graph starting from the node up.
						boolean match = isContained(node, thisTransformersURI);
						if(match) {
							this.getSourceLabels().add(popLabel);
						}
					}
					
				}
					
			}// if StandardPopulationModelLabel
		}// for(DynamicLabel dl:sourceLabels)
	}// addMatchingPopLabels
	
	/**
	 * 
	 * @param node
	 * @param uri
	 * @return
	 */
	private boolean isContained(Node node, URI uri) {
		URI labeledURI = node.getURI();
		if(uri.equals(labeledURI)) {
			return true;
		} 
		EList<Edge>edges = node.getEdges();
		for(Edge e: edges) {
			if(e.getLabel() instanceof RelativePhysicalRelationshipLabel) {
				Node nodeA = e.getA();
				Node nodeB = e.getB();				
											
				if(nodeA.equals(node)) {
					return isContained(nodeB,uri);
				}
			}
		}
		return false; // no matches
	}
	
	/**
	 * 
	 * @param foodPop
	 * @param node
	 * @return
	 */
	private boolean existsStaticPopulationLabel(String foodPop, Node node) {
		for(NodeLabel nl:node.getLabels()) 
			if(nl instanceof PopulationLabel && ((PopulationLabel)nl).getPopulationIdentifier().equals(foodPop)) return true;
		return false;
	}
	
} //FoodTransformerImpl
