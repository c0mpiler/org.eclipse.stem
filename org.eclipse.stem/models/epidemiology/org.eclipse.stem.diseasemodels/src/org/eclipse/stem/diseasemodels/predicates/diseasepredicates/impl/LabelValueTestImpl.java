package org.eclipse.stem.diseasemodels.predicates.diseasepredicates.impl;

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

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.LabelValue;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.predicate.impl.TestImpl;
import org.eclipse.stem.definitions.LocationUtility;
import org.eclipse.stem.diseasemodels.predicates.diseasepredicates.DiseasepredicatesPackage;
import org.eclipse.stem.diseasemodels.predicates.diseasepredicates.LabelValueTest;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.populationmodels.standard.PopulationModel;
import org.eclipse.stem.populationmodels.standard.PopulationModelLabel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Value Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.predicates.diseasepredicates.impl.LabelValueTestImpl#getModelName <em>Model Name</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.predicates.diseasepredicates.impl.LabelValueTestImpl#getTargetURI <em>Target URI</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.predicates.diseasepredicates.impl.LabelValueTestImpl#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.predicates.diseasepredicates.impl.LabelValueTestImpl#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.predicates.diseasepredicates.impl.LabelValueTestImpl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.predicates.diseasepredicates.impl.LabelValueTestImpl#getPopulationIdentifier <em>Population Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelValueTestImpl extends TestImpl implements LabelValueTest {
	/**
	 * The default value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected String modelName = MODEL_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = "incidence"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final double THRESHOLD_EDEFAULT = 100.0;

	/**
	 * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected double threshold = THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPredicate() <em>Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicate()
	 * @generated
	 * @ordered
	 */
	protected static final String PREDICATE_EDEFAULT = ">"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicate()
	 * @generated
	 * @ordered
	 */
	protected String predicate = PREDICATE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelValueTestImpl() {
		super();
	}

	Set<LabelValue> labelValueCache;
	EAttribute attribute;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean evaluate(STEMTime time, long timerPeriod, Graph graph) {
		// First find the region (or set of regions contained) by the targetISOKey
		
		if(labelValueCache == null)
			labelValueCache = this.findLabelValues(graph);
		
		if(labelValueCache == null) return false; // Unable to find the disease or other problem
		double totalCount = 0.0;
		
		for(LabelValue currentValue:labelValueCache) {
			totalCount += ((Double)currentValue.eGet(attribute)).doubleValue();
		}
		
		// Check threshold
		
		if(this.getPredicate().equals("=") && totalCount == this.getThreshold())
			return true;
		else if(this.getPredicate().equals(">") && totalCount > this.getThreshold())
			return true;
		else if(this.getPredicate().equals("<") && totalCount < this.getThreshold())
			return true;
		else if(this.getPredicate().equals(">=") && totalCount >= this.getThreshold())
			return true;
		else if(this.getPredicate().equals("<=") && totalCount <= this.getThreshold())
			return true;
		
		return false;
	}

	Set<LabelValue> findLabelValues(Graph graph) {
		
		HashSet<LabelValue>  returnValue = new HashSet<LabelValue>();
		
		final Node parent = graph.getNode(getTargetURI());
		if(parent == null) return null;
		Set<Node> children = LocationUtility.getAllChildren(parent);
		children.add(parent);
		
		// Find the matching disease/population model
		
		Decorator dec = null;
		
		for(Decorator d:graph.getDecorators()) {
			if(d instanceof org.eclipse.stem.diseasemodels.standard.DiseaseModel && 
					((DiseaseModel)d).getDiseaseName().equals(this.getModelName()) ||
					d instanceof PopulationModel && ((PopulationModel)d).getName().equals(this.getModelName())) { dec = d;break;}
		}
		
		if(dec == null) // Not found
			return null;
		
		// Now find the matching disease label and add up the states 
			
		for(Node region:children) {
			for(NodeLabel label : region.getLabels()) {
				if(!(label instanceof DynamicLabel)) continue;
				DynamicLabel dl = (DynamicLabel)label;
				if(dl.getDecorator().equals(dec) && 
						(dl instanceof DiseaseModelLabel && ((DiseaseModelLabel)dl).getPopulationModelLabel().getPopulationIdentifier().equals(this.getPopulationIdentifier())) ||
						(dl instanceof PopulationModelLabel && ((PopulationModelLabel)dl).getPopulationIdentifier().equals(this.getPopulationIdentifier()))) {
					
					LabelValue currentValue = dl.getCurrentValue();
					// Find the matching state
					for(EAttribute ea:currentValue.eClass().getEAllAttributes()) {
						EDataType esf =ea.getEAttributeType();
						if(!esf.getName().equals("EDouble")) continue;
						if(ea.getName().equals(this.getState())) {
							if(attribute == null) attribute = ea;
							returnValue.add(currentValue);
							break;
						}
					}
				}
			}
		}

		return returnValue;
	}
	
	
	/**
	 * Reset the cache
	 */
	
	@Override
	public void reset() {
		this.attribute = null;
		this.labelValueCache = null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiseasepredicatesPackage.Literals.LABEL_VALUE_TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelName() {
		return modelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelName(String newModelName) {
		modelName = newModelName;
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
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		state = newState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getThreshold() {
		return threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreshold(double newThreshold) {
		threshold = newThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPredicate() {
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredicate(String newPredicate) {
		predicate = newPredicate;
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
	@SuppressWarnings("boxing")
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiseasepredicatesPackage.LABEL_VALUE_TEST__MODEL_NAME:
				return getModelName();
			case DiseasepredicatesPackage.LABEL_VALUE_TEST__TARGET_URI:
				return getTargetURI();
			case DiseasepredicatesPackage.LABEL_VALUE_TEST__STATE:
				return getState();
			case DiseasepredicatesPackage.LABEL_VALUE_TEST__THRESHOLD:
				return getThreshold();
			case DiseasepredicatesPackage.LABEL_VALUE_TEST__PREDICATE:
				return getPredicate();
			case DiseasepredicatesPackage.LABEL_VALUE_TEST__POPULATION_IDENTIFIER:
				return getPopulationIdentifier();
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
			case DiseasepredicatesPackage.LABEL_VALUE_TEST__MODEL_NAME:
				setModelName((String)newValue);
				return;
			case DiseasepredicatesPackage.LABEL_VALUE_TEST__TARGET_URI:
				setTargetURI((URI)newValue);
				return;
			case DiseasepredicatesPackage.LABEL_VALUE_TEST__STATE:
				setState((String)newValue);
				return;
			case DiseasepredicatesPackage.LABEL_VALUE_TEST__THRESHOLD:
				setThreshold((Double)newValue);
				return;
			case DiseasepredicatesPackage.LABEL_VALUE_TEST__PREDICATE:
				setPredicate((String)newValue);
				return;
			case DiseasepredicatesPackage.LABEL_VALUE_TEST__POPULATION_IDENTIFIER:
				setPopulationIdentifier((String)newValue);
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
			case DiseasepredicatesPackage.LABEL_VALUE_TEST__MODEL_NAME:
				setModelName(MODEL_NAME_EDEFAULT);
				return;
			case DiseasepredicatesPackage.LABEL_VALUE_TEST__TARGET_URI:
				setTargetURI(TARGET_URI_EDEFAULT);
				return;
			case DiseasepredicatesPackage.LABEL_VALUE_TEST__STATE:
				setState(STATE_EDEFAULT);
				return;
			case DiseasepredicatesPackage.LABEL_VALUE_TEST__THRESHOLD:
				setThreshold(THRESHOLD_EDEFAULT);
				return;
			case DiseasepredicatesPackage.LABEL_VALUE_TEST__PREDICATE:
				setPredicate(PREDICATE_EDEFAULT);
				return;
			case DiseasepredicatesPackage.LABEL_VALUE_TEST__POPULATION_IDENTIFIER:
				setPopulationIdentifier(POPULATION_IDENTIFIER_EDEFAULT);
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
			case DiseasepredicatesPackage.LABEL_VALUE_TEST__MODEL_NAME:
				return MODEL_NAME_EDEFAULT == null ? modelName != null : !MODEL_NAME_EDEFAULT.equals(modelName);
			case DiseasepredicatesPackage.LABEL_VALUE_TEST__TARGET_URI:
				return TARGET_URI_EDEFAULT == null ? targetURI != null : !TARGET_URI_EDEFAULT.equals(targetURI);
			case DiseasepredicatesPackage.LABEL_VALUE_TEST__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case DiseasepredicatesPackage.LABEL_VALUE_TEST__THRESHOLD:
				return threshold != THRESHOLD_EDEFAULT;
			case DiseasepredicatesPackage.LABEL_VALUE_TEST__PREDICATE:
				return PREDICATE_EDEFAULT == null ? predicate != null : !PREDICATE_EDEFAULT.equals(predicate);
			case DiseasepredicatesPackage.LABEL_VALUE_TEST__POPULATION_IDENTIFIER:
				return POPULATION_IDENTIFIER_EDEFAULT == null ? populationIdentifier != null : !POPULATION_IDENTIFIER_EDEFAULT.equals(populationIdentifier);
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
		result.append(" (modelName: "); //$NON-NLS-1$
		result.append(modelName);
		result.append(", targetURI: "); //$NON-NLS-1$
		result.append(targetURI);
		result.append(", state: "); //$NON-NLS-1$
		result.append(state);
		result.append(", threshold: "); //$NON-NLS-1$
		result.append(threshold);
		result.append(", predicate: "); //$NON-NLS-1$
		result.append(predicate);
		result.append(", populationIdentifier: "); //$NON-NLS-1$
		result.append(populationIdentifier);
		result.append(')');
		return result.toString();
	}

} //LabelValueTestImpl
