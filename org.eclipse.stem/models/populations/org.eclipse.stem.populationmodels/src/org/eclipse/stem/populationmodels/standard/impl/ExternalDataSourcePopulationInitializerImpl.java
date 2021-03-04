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

import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.osgi.util.NLS;
import org.eclipse.stem.analysis.impl.ReferenceScenarioDataMapImpl;
import org.eclipse.stem.analysis.impl.ReferenceScenarioDataMapImpl.ReferenceScenarioDataInstance;
import org.eclipse.stem.analysis.util.CSVscenarioLoader;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.common.util.LogInitializationException;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.scenario.ScenarioInitializationException;
import org.eclipse.stem.definitions.labels.LabelsFactory;
import org.eclipse.stem.definitions.labels.PopulationLabel;
import org.eclipse.stem.definitions.labels.PopulationLabelValue;
import org.eclipse.stem.definitions.nodes.impl.RegionImpl;
import org.eclipse.stem.populationmodels.standard.ExternalDataSourcePopulationInitializer;
import org.eclipse.stem.populationmodels.standard.StandardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Data Source Population Initializer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.ExternalDataSourcePopulationInitializerImpl#getDataPath <em>Data Path</em>}</li>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.ExternalDataSourcePopulationInitializerImpl#getRow <em>Row</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalDataSourcePopulationInitializerImpl extends PopulationInitializerImpl implements ExternalDataSourcePopulationInitializer {
	
	private final static String COUNT_PARAM = "Count"; //$NON-NLS-1$
	private final static String STEM_URI_PREFIX = "stem:"; //$NON-NLS-1$
	
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

	/**
	 * The default value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected static final int ROW_EDEFAULT = 1;
	/**
	 * The cached value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected int row = ROW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ExternalDataSourcePopulationInitializerImpl() {
		super();
	}

	
	
	@Override
	public void decorateGraph(STEMTime time) throws org.eclipse.stem.core.scenario.ScenarioInitializationException {
		if(this.isGraphDecorated()) return;
		checkPopulationModels();
		
		ReferenceScenarioDataMapImpl ref=null;
		// Load data from the external file and create population labels from it
		try {
			CSVscenarioLoader loader1 = new CSVscenarioLoader(this.getDataPath());
			int res = loader1.getMaxResolution(CSVscenarioLoader.UNKNOWN_POP_IDENTIFIER_KEY);
			ref = loader1.parseAllFiles(CSVscenarioLoader.UNKNOWN_POP_IDENTIFIER_KEY, res);
			
		} catch(LogInitializationException lie) {
			throw new ScenarioInitializationException(NLS.bind(Messages.ERR_LOADING_DATA, new Object[] {this.getURI().toString(), this.getDataPath()}), this, lie);
		}
		
		Set<String>locations = ref.getLocations();
		for(String location:locations) {
			ReferenceScenarioDataInstance instance = ref.getLocation(location);
			List<String> data = instance.getData(COUNT_PARAM);
			
			if(data == null || data.size() == 0) { 
				throw new ScenarioInitializationException(NLS.bind(Messages.NO_DATA_FOUND, new Object[] {this.getURI().toString(),this.getDataPath()}), this, new Exception());
			}
			
			if(data.size() < this.getRow()-1) {
				throw new ScenarioInitializationException(NLS.bind(Messages.ROW_NOT_FOUND, new Object[] {this.getURI().toString(),this.getDataPath(), this.getRow()}), this, new Exception());
			}
			
			// First row
			double count = Double.parseDouble(data.get(getRow()-1));
			
			Graph g = this.getGraph();
			URI uri = null;
			if(location.startsWith(STEM_URI_PREFIX))
				uri = STEMURI.createURI(location);
			else
				uri = RegionImpl.createRegionNodeURI(location);
			
			Node node = g.getNodes().get(uri);
			
			if(node == null) {
				throw new ScenarioInitializationException(NLS.bind(Messages.EXT_DS_INIT_REGION_NOT_FOUND, new Object[] {this.getURI().toString(), location}), this, new Exception());
			
			}
			else { 
				// Check for existing label
				PopulationLabel existingLabel = null;
				for(NodeLabel lab:node.getLabels()) {
					if(lab instanceof PopulationLabel 
							&& ((PopulationLabel)lab).getPopulationIdentifier().equals(this.getPopulationIdentifier())) {
						existingLabel = (PopulationLabel)lab;
					}
				}
				if(existingLabel != null) {				
						// Initialize with new value
						initializeLabelCount((PopulationLabel)existingLabel, time, count);
				} else {
					// Create a new label
					PopulationLabel newLabel = LabelsFactory.eINSTANCE.createPopulationLabel();
					newLabel.setPopulationIdentifier(this.getPopulationIdentifier());
					newLabel.setURIOfIdentifiableToBeLabeled(node.getURI());
					newLabel.setNode(node);
					URI newURI = createPopulationLabelURI(node, time);
					g.getNodeLabels().put(newURI, newLabel);
					initializeLabelCount((PopulationLabel)newLabel, time, count);				
				}
			}
		}
	}
	
	protected void initializeLabelCount(PopulationLabel lab, STEMTime time,
			double count) {
		 PopulationLabelValue plv = lab.getCurrentPopulationValue();
		 plv.setCount(count);
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.EXTERNAL_DATA_SOURCE_POPULATION_INITIALIZER;
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
	public int getRow() {
		return row;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRow(int newRow) {
		row = newRow;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StandardPackage.EXTERNAL_DATA_SOURCE_POPULATION_INITIALIZER__DATA_PATH:
				return getDataPath();
			case StandardPackage.EXTERNAL_DATA_SOURCE_POPULATION_INITIALIZER__ROW:
				return getRow();
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
			case StandardPackage.EXTERNAL_DATA_SOURCE_POPULATION_INITIALIZER__DATA_PATH:
				setDataPath((String)newValue);
				return;
			case StandardPackage.EXTERNAL_DATA_SOURCE_POPULATION_INITIALIZER__ROW:
				setRow((Integer)newValue);
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
			case StandardPackage.EXTERNAL_DATA_SOURCE_POPULATION_INITIALIZER__DATA_PATH:
				setDataPath(DATA_PATH_EDEFAULT);
				return;
			case StandardPackage.EXTERNAL_DATA_SOURCE_POPULATION_INITIALIZER__ROW:
				setRow(ROW_EDEFAULT);
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
			case StandardPackage.EXTERNAL_DATA_SOURCE_POPULATION_INITIALIZER__DATA_PATH:
				return DATA_PATH_EDEFAULT == null ? dataPath != null : !DATA_PATH_EDEFAULT.equals(dataPath);
			case StandardPackage.EXTERNAL_DATA_SOURCE_POPULATION_INITIALIZER__ROW:
				return row != ROW_EDEFAULT;
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
		result.append(" (dataPath: ");
		result.append(dataPath);
		result.append(", row: ");
		result.append(row);
		result.append(')');
		return result.toString();
	}



	/**
	 * Not used 
	 */
	@Override
	protected void initializeLabel(PopulationLabel lab, STEMTime time,
			boolean zeroValue) {
		// Not used
		
	}

} //ExternalDataSourcePopulationInitializerImpl
