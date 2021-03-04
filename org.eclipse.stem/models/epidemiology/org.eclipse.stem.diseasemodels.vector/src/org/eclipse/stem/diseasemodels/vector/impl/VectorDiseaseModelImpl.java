package org.eclipse.stem.diseasemodels.vector.impl;

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

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.osgi.util.NLS;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.Model;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.scenario.ScenarioInitializationException;
import org.eclipse.stem.diseasemodels.standard.impl.StandardDiseaseModelImpl;
import org.eclipse.stem.diseasemodels.vector.VectorDiseaseModel;
import org.eclipse.stem.diseasemodels.vector.VectorPackage;
import org.eclipse.stem.populationmodels.standard.PopulationModelLabel;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModel;
import org.eclipse.stem.populationmodels.standard.impl.StandardFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disease Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.vector.impl.VectorDiseaseModelImpl#getVectorPopulationIdentifier <em>Vector Population Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VectorDiseaseModelImpl extends StandardDiseaseModelImpl implements VectorDiseaseModel {
	/**
	 * The default value of the '{@link #getVectorPopulationIdentifier() <em>Vector Population Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorPopulationIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String VECTOR_POPULATION_IDENTIFIER_EDEFAULT = "anopheles"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getVectorPopulationIdentifier() <em>Vector Population Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorPopulationIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String vectorPopulationIdentifier = VECTOR_POPULATION_IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VectorDiseaseModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VectorPackage.Literals.VECTOR_DISEASE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVectorPopulationIdentifier() {
		return vectorPopulationIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVectorPopulationIdentifier(String newVectorPopulationIdentifier) {
		vectorPopulationIdentifier = newVectorPopulationIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VectorPackage.VECTOR_DISEASE_MODEL__VECTOR_POPULATION_IDENTIFIER:
				return getVectorPopulationIdentifier();
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
			case VectorPackage.VECTOR_DISEASE_MODEL__VECTOR_POPULATION_IDENTIFIER:
				setVectorPopulationIdentifier((String)newValue);
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
			case VectorPackage.VECTOR_DISEASE_MODEL__VECTOR_POPULATION_IDENTIFIER:
				setVectorPopulationIdentifier(VECTOR_POPULATION_IDENTIFIER_EDEFAULT);
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
			case VectorPackage.VECTOR_DISEASE_MODEL__VECTOR_POPULATION_IDENTIFIER:
				return VECTOR_POPULATION_IDENTIFIER_EDEFAULT == null ? vectorPopulationIdentifier != null : !VECTOR_POPULATION_IDENTIFIER_EDEFAULT.equals(vectorPopulationIdentifier);
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
		result.append(" (vectorPopulationIdentifier: ");
		result.append(vectorPopulationIdentifier);
		result.append(')');
		return result.toString();
	}
	

	/**
	 * We need to override to check all population groups
	 */	
	@Override
	public void prepare(Model model, STEMTime time) {
		super.prepare(model, time);
		
		boolean found = findPopulationModel(model, this.getVectorPopulationIdentifier());
			
		if(!found) {
			// Create a new standard population model
			StandardPopulationModel spm = StandardFactoryImpl.eINSTANCE.createStandardPopulationModel();
			spm.setPopulationIdentifier(this.getVectorPopulationIdentifier());
			String title = "Auto Generated "+this.getVectorPopulationIdentifier()+" population model"; //$NON-NLS-1$ //$NON-NLS-2$
			String name = "auto_gen_"+this.getVectorPopulationIdentifier()+"_population_model"; //$NON-NLS-1$ //$NON-NLS-2$
			spm.setURI(STEMURI.createURI(name+"/"+STEMURI.generateUniquePart())); //$NON-NLS-1$
			spm.setName(name);
			spm.getDublinCore().setTitle(title);
			model.getNodeDecorators().add(0, spm);
		}
	}
	
	/**
	 * We need to override this method to return all population model labels for both humans and the vector
	 * 
	 * @param populationIdentifier
	 *            the population being labeled
	 * @param graph
	 *            the graph to search
	 * @return the PopulationLabel instances of the graph that match the
	 *         identifier.
	 */
	@Override
	public EList<PopulationModelLabel> getPopulationModelLabels(
			String populationIdentifier, Graph graph) throws ScenarioInitializationException {
		final EList<PopulationModelLabel> retValue = new BasicEList<PopulationModelLabel>();

		// Iterate through all of the population labels in the graph
		EList<NodeLabel> labels = graph.getNodeLabelsByTypeURI(
				PopulationModelLabel.URI_TYPE_DYNAMIC_POPULATION_LABEL);
		
		boolean foundHuman = false, foundVector = false;
		for (NodeLabel pl:labels) {
			final PopulationModelLabel populationLabel = (PopulationModelLabel) pl;
			// Is this label for the population we're looking for?
			boolean keep = false;
			if(populationLabel.getPopulationIdentifier().equals(populationIdentifier)) 
				{keep=true;foundHuman = true;}
			else if(populationLabel.getPopulationIdentifier().equals(getVectorPopulationIdentifier())) 
				{keep=true;foundVector = true;}
				
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

		// If we didn't find both humans and the vector, return an empty list.
		// This will force a retry creating disease labels after all population model labels have
		// had time to decorate the graph
		if(!foundHuman) 
			throw new ScenarioInitializationException(NLS.bind(Messages.HOST_POP_MOD_LABEL_NOT_FOUND, new Object[] {this.getURI().toString(), this.getPopulationIdentifier()}), this, new Exception());
		if(!foundVector)
			throw new ScenarioInitializationException(NLS.bind(Messages.VECTOR_POP_MOD_LABEL_NOT_FOUND, new Object[] {this.getURI().toString(), this.getVectorPopulationIdentifier()}),this, new Exception());
		
		return retValue;
	}

	@Override
	public EList<String> getAllLabelIdentifiers() {
		EList<String> identifiers = new BasicEList<String>();
		
		identifiers.add(getPopulationIdentifier());
		identifiers.add(getVectorPopulationIdentifier());
		
		return identifiers;
	}

} //VectorDiseaseModelImpl
