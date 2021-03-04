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

package org.eclipse.stem.diseasemodels.standard.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.osgi.util.NLS;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.scenario.ScenarioInitializationException;
import org.eclipse.stem.definitions.LocationUtility;
import org.eclipse.stem.definitions.nodes.impl.RegionImpl;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseInitializer;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disease Initializer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseInitializerImpl#getTargetISOKey <em>Target ISO Key</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseInitializerImpl#getTargetURI <em>Target URI</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseInitializerImpl#getCompartments <em>Compartments</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseInitializerImpl#getCompartmentValues <em>Compartment Values</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseInitializerImpl#isUseFractions <em>Use Fractions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StandardDiseaseInitializerImpl extends DiseaseInitializerImpl implements StandardDiseaseInitializer {
	
	/**
	 * All {@link DiseaseModelLabel}s that are initialized by this
	 * {@link Initializer}.
	 */
	private EList<DiseaseModelLabel> labelsToInitialize;
	
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
	 * The cached value of the '{@link #getCompartments() <em>Compartments</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartments()
	 * @generated
	 * @ordered
	 */
	protected EList<String> compartments;

	/**
	 * The cached value of the '{@link #getCompartmentValues() <em>Compartment Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartmentValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> compartmentValues;

	/**
	 * The default value of the '{@link #isUseFractions() <em>Use Fractions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseFractions()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_FRACTIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseFractions() <em>Use Fractions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseFractions()
	 * @generated
	 * @ordered
	 */
	protected boolean useFractions = USE_FRACTIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardDiseaseInitializerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.STANDARD_DISEASE_INITIALIZER;
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
	 * @generated NOT
	 */
	public EList<String> getCompartments() {
		// Temporarily overriding generated code to fix CCE.  See EMF Bug https://bugs.eclipse.org/bugs/show_bug.cgi?id=483703
		if (compartments == null) {
			compartments = new EDataTypeUniqueEList<String>(String.class, this, StandardPackage.STANDARD_DISEASE_INITIALIZER__COMPARTMENTS);
		}
		return compartments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Double> getCompartmentValues() {
		// Temporarily overriding generated code to fix CCE.  See EMF Bug https://bugs.eclipse.org/bugs/show_bug.cgi?id=483703
		if (compartmentValues == null) {
			compartmentValues = new EDataTypeEList<Double>(Double.class, this, StandardPackage.STANDARD_DISEASE_INITIALIZER__COMPARTMENT_VALUES);
		}
		return compartmentValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseFractions() {
		return useFractions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseFractions(boolean newUseFractions) {
		useFractions = newUseFractions;
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
			case StandardPackage.STANDARD_DISEASE_INITIALIZER__TARGET_ISO_KEY:
				return getTargetISOKey();
			case StandardPackage.STANDARD_DISEASE_INITIALIZER__TARGET_URI:
				return getTargetURI();
			case StandardPackage.STANDARD_DISEASE_INITIALIZER__COMPARTMENTS:
				return getCompartments();
			case StandardPackage.STANDARD_DISEASE_INITIALIZER__COMPARTMENT_VALUES:
				return getCompartmentValues();
			case StandardPackage.STANDARD_DISEASE_INITIALIZER__USE_FRACTIONS:
				return isUseFractions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings({ "boxing" })
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StandardPackage.STANDARD_DISEASE_INITIALIZER__TARGET_ISO_KEY:
				setTargetISOKey((String)newValue);
				return;
			case StandardPackage.STANDARD_DISEASE_INITIALIZER__TARGET_URI:
				setTargetURI((URI)newValue);
				return;
			case StandardPackage.STANDARD_DISEASE_INITIALIZER__COMPARTMENTS:
				getCompartments().clear();
				getCompartments().addAll((Collection<? extends String>)newValue);
				return;
			case StandardPackage.STANDARD_DISEASE_INITIALIZER__COMPARTMENT_VALUES:
				getCompartmentValues().clear();
				getCompartmentValues().addAll((Collection<? extends Double>)newValue);
				return;
			case StandardPackage.STANDARD_DISEASE_INITIALIZER__USE_FRACTIONS:
				setUseFractions((Boolean)newValue);
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
			case StandardPackage.STANDARD_DISEASE_INITIALIZER__TARGET_ISO_KEY:
				setTargetISOKey(TARGET_ISO_KEY_EDEFAULT);
				return;
			case StandardPackage.STANDARD_DISEASE_INITIALIZER__TARGET_URI:
				setTargetURI(TARGET_URI_EDEFAULT);
				return;
			case StandardPackage.STANDARD_DISEASE_INITIALIZER__COMPARTMENTS:
				getCompartments().clear();
				return;
			case StandardPackage.STANDARD_DISEASE_INITIALIZER__COMPARTMENT_VALUES:
				getCompartmentValues().clear();
				return;
			case StandardPackage.STANDARD_DISEASE_INITIALIZER__USE_FRACTIONS:
				setUseFractions(USE_FRACTIONS_EDEFAULT);
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
			case StandardPackage.STANDARD_DISEASE_INITIALIZER__TARGET_ISO_KEY:
				return TARGET_ISO_KEY_EDEFAULT == null ? targetISOKey != null : !TARGET_ISO_KEY_EDEFAULT.equals(targetISOKey);
			case StandardPackage.STANDARD_DISEASE_INITIALIZER__TARGET_URI:
				return TARGET_URI_EDEFAULT == null ? targetURI != null : !TARGET_URI_EDEFAULT.equals(targetURI);
			case StandardPackage.STANDARD_DISEASE_INITIALIZER__COMPARTMENTS:
				return compartments != null && !compartments.isEmpty();
			case StandardPackage.STANDARD_DISEASE_INITIALIZER__COMPARTMENT_VALUES:
				return compartmentValues != null && !compartmentValues.isEmpty();
			case StandardPackage.STANDARD_DISEASE_INITIALIZER__USE_FRACTIONS:
				return useFractions != USE_FRACTIONS_EDEFAULT;
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
		result.append(" (targetISOKey: "); //$NON-NLS-1$
		result.append(targetISOKey);
		result.append(", targetURI: "); //$NON-NLS-1$
		result.append(targetURI);
		result.append(", compartments: "); //$NON-NLS-1$
		result.append(compartments);
		result.append(", compartmentValues: "); //$NON-NLS-1$
		result.append(compartmentValues);
		result.append(", useFractions: "); //$NON-NLS-1$
		result.append(useFractions);
		result.append(')');
		return result.toString();
	}

	@Override
	public void decorateGraph(STEMTime time) throws ScenarioInitializationException  {
		if (isGraphDecorated()) {
			return;
		}

		Graph graph = getGraph();
		DiseaseModel diseaseModel = null;
		labelsToInitialize = new BasicEList<DiseaseModelLabel>();

		// Try to find disease model
		for (Decorator decorator : graph.getDecorators()) {
			if (decorator instanceof StandardDiseaseModel) {
				StandardDiseaseModel model = (StandardDiseaseModel) decorator;

				if (model.getDiseaseName().equals(getDiseaseName())) {
					diseaseModel = model;
					break;
				}
			}
		}

		if (diseaseModel == null) {
			throw new ScenarioInitializationException(NLS.bind(Messages.INITIALIZER_DISEASE_NOT_FOUND, new Object[] {getDiseaseName(), this.getURI().toString()}), this, new Exception());
		}

		URI target = null;

		if (getTargetURI() != null) {
			target = getTargetURI();
		} else if (getTargetISOKey() != null && !getTargetISOKey().isEmpty()) {
			target = RegionImpl.createRegionNodeURI(getTargetISOKey());
		}

		Collection<Node> allNodes;
		
		if (target != null) {
			Node parent = graph.getNode(target);
		
			allNodes = LocationUtility.getAllChildren(parent);
			allNodes.add(parent);
		} else {
			// Initialize all nodes since no target is specified
			allNodes = graph.getNodes().values();
		}

		for (Node node : allNodes) {
			if (node == null) {
				throw new ScenarioInitializationException(NLS.bind(Messages.INITIALIZER_NODE_NOT_FOUND, new Object[] {target, this.getURI().toString()}), this, new Exception());
			}

			// Try to find disease label
			for (NodeLabel nodeLabel : node.getLabels()) {
				if (nodeLabel instanceof DiseaseModelLabel) {
					DiseaseModelLabel diseaseModelLabel = (DiseaseModelLabel) nodeLabel;

					if (diseaseModelLabel.getDecorator() == diseaseModel
							&& diseaseModelLabel.getPopulationModelLabel()
									.getPopulationIdentifier()
									.equals(this.getPopulationIdentifier())) {
						doInitialization(diseaseModelLabel);
						labelsToInitialize.add(diseaseModelLabel);
						break;
					}
				}
			}
		}

		setProgress(1.0);
		return;
	}

	@Override
	public void resetLabels() throws ScenarioInitializationException {
		for (DiseaseModelLabel label : labelsToInitialize) {
			doInitialization(label);
		}
	}

	@SuppressWarnings("boxing")
	private void doInitialization(DiseaseModelLabel label) throws ScenarioInitializationException {
		DiseaseModelLabelValue current = (DiseaseModelLabelValue) label
				.getCurrentValue();
		double populationCount = current.getPopulationCount();
		EList<EAttribute> attributes = current.eClass().getEAllAttributes();
		double populationToInitialize = 0.0;

		if (!isUseFractions()) {
			for (double v : getCompartmentValues()) {
				populationToInitialize += v;
			}
		}

		if (populationToInitialize > populationCount) {
			throw new ScenarioInitializationException(NLS.bind(Messages.INITIALIZER_INVALID_POPULATION_COUNT, new Object[] {populationToInitialize, populationCount, this.getURI().toString()}), this, new Exception());
		}

		for (EAttribute attribute : attributes) {
			for (int i = 0; i < getCompartments().size(); i++) {
				if (attribute.getName().equals(getCompartments().get(i))) {
					if (isUseFractions()) {
						current.eSet(attribute, getCompartmentValues().get(i)
								* populationCount);
					} else {
						if (getCompartments().get(i).equals("s")) { //$NON-NLS-1$
							current.eSet(attribute, populationCount
									- populationToInitialize);
						} else {
							current.eSet(attribute,
									getCompartmentValues().get(i));
						}
					}
				}
			}
		}
	}
	
} //StandardDiseaseInitializerImpl
