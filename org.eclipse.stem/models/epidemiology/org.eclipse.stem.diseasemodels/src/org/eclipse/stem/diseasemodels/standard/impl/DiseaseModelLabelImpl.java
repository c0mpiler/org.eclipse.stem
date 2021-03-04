package org.eclipse.stem.diseasemodels.standard.impl;

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

import java.text.DecimalFormat;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.impl.IntegrationLabelImpl;
import org.eclipse.stem.definitions.labels.PopulationLabel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.populationmodels.standard.PopulationModelLabel;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Disease Model Label</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.impl.DiseaseModelLabelImpl#getPopulationLabel <em>Population Label</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.impl.DiseaseModelLabelImpl#getPopulationModelLabel <em>Population Model Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DiseaseModelLabelImpl extends IntegrationLabelImpl
		implements DiseaseModelLabel {
	/**
	 * The cached value of the '{@link #getPopulationLabel() <em>Population Label</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getPopulationLabel()
	 * @generated
	 * @ordered
	 */
	protected PopulationLabel populationLabel;

	/**
	 * The cached value of the '{@link #getPopulationModelLabel() <em>Population Model Label</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getPopulationModelLabel()
	 * @generated
	 * @ordered
	 */
	protected PopulationModelLabel populationModelLabel;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DiseaseModelLabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.DISEASE_MODEL_LABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @return
	 * 
	 *         <!-- end-user-doc -->
	 * @generated
	 */
	public PopulationLabel getPopulationLabel() {
		if (populationLabel != null && populationLabel.eIsProxy()) {
			InternalEObject oldPopulationLabel = (InternalEObject)populationLabel;
			populationLabel = (PopulationLabel)eResolveProxy(oldPopulationLabel);
			if (populationLabel != oldPopulationLabel) {
			}
		}
		return populationLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @return
	 * 
	 *         <!-- end-user-doc -->
	 * @generated
	 */
	public PopulationLabel basicGetPopulationLabel() {
		return populationLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param newPopulationLabel
	 * 
	 *            <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopulationLabel(PopulationLabel newPopulationLabel) {
		populationLabel = newPopulationLabel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PopulationModelLabel getPopulationModelLabel() {
		if (populationModelLabel != null && populationModelLabel.eIsProxy()) {
			InternalEObject oldPopulationModelLabel = (InternalEObject)populationModelLabel;
			populationModelLabel = (PopulationModelLabel)eResolveProxy(oldPopulationModelLabel);
			if (populationModelLabel != oldPopulationModelLabel) {
			}
		}
		return populationModelLabel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PopulationModelLabel basicGetPopulationModelLabel() {
		return populationModelLabel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopulationModelLabel(
			PopulationModelLabel newPopulationModelLabel) {
		populationModelLabel = newPopulationModelLabel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String toTooltipString() {
		DiseaseModelLabelValue current = (DiseaseModelLabelValue) getCurrentValue();
		double populationCount = current.getPopulationCount();

		if (populationCount == 0) {
			// Avoid divide by 0, all zeros will be
			// displayed for the compartments
			populationCount = 1;
		}

		DecimalFormat formatPercentage = new DecimalFormat("#%");
		EList<EAttribute> attributes = current.eClass().getEAllAttributes();
		StringBuffer result = new StringBuffer();
		int i = 0;

		result.append(getIdentifier() + ": ");

		for (EAttribute attribute : attributes) {
			if (!attribute.getName().startsWith("incidence")
					&& !attribute.getName().startsWith("diseaseDeaths")
					&& !attribute.getName().startsWith("populationCount")) {
				String name = attribute.getName().toUpperCase();
				String value = formatPercentage.format( ((Double)current.eGet(attribute)).doubleValue() / populationCount);

				if (i != 0 && i % 10 == 0) {
					result.append("\n\t");
				}

				result.append(name + ":");
				result.append(value);
				result.append(", ");

				i++;
			}
		}

		result.delete(result.length() - 2, result.length());

		return result.toString();
	}

	/**
	 * Label the node with the disease model label
	 * 
	 * @param dml
	 *            the disease model label
	 * 
	 * @param populationModelLabel
	 *            the dynamic population label affected by the disease (e.g.
	 *            women)
	 * 
	 * @param node
	 *            the node that has the population being affected by the disease
	 */
	public static void labelNode(final DiseaseModelLabel dml,
			final PopulationModelLabel populationModelLabel, final Node node) {
		dml.setPopulationLabel(populationModelLabel.getPopulationLabel());
		dml.setPopulationModelLabel(populationModelLabel);
		node.getLabels().add(dml);
	} // labelNode

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param featureID
	 * @param resolve
	 * @param coreType
	 * 
	 * @return
	 * 
	 *         <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StandardPackage.DISEASE_MODEL_LABEL__POPULATION_LABEL:
				if (resolve) return getPopulationLabel();
				return basicGetPopulationLabel();
			case StandardPackage.DISEASE_MODEL_LABEL__POPULATION_MODEL_LABEL:
				if (resolve) return getPopulationModelLabel();
				return basicGetPopulationModelLabel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param featureID
	 * @param newValue
	 * 
	 *            <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StandardPackage.DISEASE_MODEL_LABEL__POPULATION_LABEL:
				setPopulationLabel((PopulationLabel)newValue);
				return;
			case StandardPackage.DISEASE_MODEL_LABEL__POPULATION_MODEL_LABEL:
				setPopulationModelLabel((PopulationModelLabel)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param featureID
	 * 
	 *            <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StandardPackage.DISEASE_MODEL_LABEL__POPULATION_LABEL:
				setPopulationLabel((PopulationLabel)null);
				return;
			case StandardPackage.DISEASE_MODEL_LABEL__POPULATION_MODEL_LABEL:
				setPopulationModelLabel((PopulationModelLabel)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param featureID
	 * 
	 * @return
	 * 
	 *         <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StandardPackage.DISEASE_MODEL_LABEL__POPULATION_LABEL:
				return populationLabel != null;
			case StandardPackage.DISEASE_MODEL_LABEL__POPULATION_MODEL_LABEL:
				return populationModelLabel != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @see org.eclipse.stem.core.graph.impl.DynamicNodeLabelImpl#sane()
	 */
	@Override
	public boolean sane() {
		boolean retValue = super.sane();

		assert retValue;

		return retValue;
	} // sane

} // DiseaseModelLabelImpl
