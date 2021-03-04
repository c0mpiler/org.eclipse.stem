/******************************************************************************* 
 * Copyright (c) 2012 Bundesinstitut f�r Risikobewertung. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     Bundesinstitut f�r Risikobewertung - initial API and implementation 
 *******************************************************************************/

package org.eclipse.stem.diseasemodels.standard.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.osgi.util.NLS;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.scenario.ScenarioInitializationException;
import org.eclipse.stem.definitions.nodes.impl.RegionImpl;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.ExternalDataSourceDiseaseInitializer;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>External Data Source Disease Initializer</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.eclipse.stem.diseasemodels.standard.impl.ExternalDataSourceDiseaseInitializerImpl#getDataPath
 * <em>Data Path</em>}</li>
 * <li>
 * {@link org.eclipse.stem.diseasemodels.standard.impl.ExternalDataSourceDiseaseInitializerImpl#getRow
 * <em>Row</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ExternalDataSourceDiseaseInitializerImpl extends
		DiseaseInitializerImpl implements ExternalDataSourceDiseaseInitializer {

	public static final String PLATFORM = "platform:";//$NON-NLS-1$
	public static final String FILE = "file:";//$NON-NLS-1$

	/**
	 * The default value of the '{@link #getDataPath() <em>Data Path</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDataPath()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataPath() <em>Data Path</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDataPath()
	 * @generated
	 * @ordered
	 */
	protected String dataPath = DATA_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getRow() <em>Row</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected static final int ROW_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRow() <em>Row</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected int row = ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #isDoRescaling() <em>Do Rescaling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDoRescaling()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DO_RESCALING_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isDoRescaling() <em>Do Rescaling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDoRescaling()
	 * @generated
	 * @ordered
	 */
	protected boolean doRescaling = DO_RESCALING_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalDataSourceDiseaseInitializerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataPath() {
		return dataPath;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPath(String newDataPath) {
		dataPath = newDataPath;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getRow() {
		return row;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	public boolean isDoRescaling() {
		return doRescaling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoRescaling(boolean newDoRescaling) {
		doRescaling = newDoRescaling;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("boxing")
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StandardPackage.EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER__DATA_PATH:
				return getDataPath();
			case StandardPackage.EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER__ROW:
				return getRow();
			case StandardPackage.EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER__DO_RESCALING:
				return isDoRescaling();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("boxing")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StandardPackage.EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER__DATA_PATH:
				setDataPath((String)newValue);
				return;
			case StandardPackage.EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER__ROW:
				setRow((Integer)newValue);
				return;
			case StandardPackage.EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER__DO_RESCALING:
				setDoRescaling((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StandardPackage.EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER__DATA_PATH:
				setDataPath(DATA_PATH_EDEFAULT);
				return;
			case StandardPackage.EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER__ROW:
				setRow(ROW_EDEFAULT);
				return;
			case StandardPackage.EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER__DO_RESCALING:
				setDoRescaling(DO_RESCALING_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StandardPackage.EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER__DATA_PATH:
				return DATA_PATH_EDEFAULT == null ? dataPath != null : !DATA_PATH_EDEFAULT.equals(dataPath);
			case StandardPackage.EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER__ROW:
				return row != ROW_EDEFAULT;
			case StandardPackage.EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER__DO_RESCALING:
				return doRescaling != DO_RESCALING_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dataPath: "); //$NON-NLS-1$
		result.append(dataPath);
		result.append(", row: "); //$NON-NLS-1$
		result.append(row);
		result.append(", doRescaling: "); //$NON-NLS-1$
		result.append(doRescaling);
		result.append(')');
		return result.toString();
	}

	@Override
	public void decorateGraph(STEMTime time)
			throws ScenarioInitializationException {
		if (isGraphDecorated()) {
			return;
		}

		Graph graph = getGraph();
		DiseaseModel diseaseModel = null;

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
			throw new ScenarioInitializationException(NLS.bind(
					Messages.INITIALIZER_DISEASE_NOT_FOUND, new Object[] {
							getDiseaseName(), this.getURI().toString() }),
					this, new Exception());
		}

		Collection<Node> allNodes = graph.getNodes().values();
		List<String> compartments = getCompartments();
		Map<URI, List<Double>> compartmentValuesMap = null;

		try {
			compartmentValuesMap = getCompartmentValues(compartments);
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (Node node : allNodes) {
			List<Double> compartmentValues = compartmentValuesMap.get(node
					.getURI());

			if (compartmentValues == null) {
				continue;
			}

			// Try to find disease label
			for (NodeLabel nodeLabel : node.getLabels()) {
				if (nodeLabel instanceof DiseaseModelLabel) {
					DiseaseModelLabel diseaseModelLabel = (DiseaseModelLabel) nodeLabel;

					if (diseaseModelLabel.getDecorator() == diseaseModel
							&& diseaseModelLabel.getPopulationModelLabel()
									.getPopulationIdentifier()
									.equals(this.getPopulationIdentifier())) {
						doInitialization(diseaseModelLabel, compartments,
								compartmentValues);
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
		setGraphDecorated(false);
		decorateGraph(null);
	}

	/**
	 * 
	 * @param label
	 * @param compartments
	 * @param compartmentValues
	 */
	private void doInitialization(DiseaseModelLabel label,
			List<String> compartments, List<Double> compartmentValues) {
		DiseaseModelLabelValue current = (DiseaseModelLabelValue) label
				.getCurrentValue();
		DiseaseModelImpl modelImpl = (DiseaseModelImpl) label.getDecorator();
		EList<EAttribute> attributes = current.eClass().getEAllAttributes();
		double sumOfCompartments = 0.0;
		double factor = 0.0;

		for (EAttribute attribute : attributes) {
			for (int i = 0; i < compartments.size(); i++) {
				if (attribute.getName().equalsIgnoreCase(compartments.get(i))
						&& !DiseaseModelImpl.isIncidence(attribute)
						&& !DiseaseModelImpl.isDiseaseDeaths(attribute)) {
					sumOfCompartments += compartmentValues.get(i).doubleValue();
				}
			}
		}		

		if (sumOfCompartments != 0.0) {
			factor = current.getPopulationCount() / sumOfCompartments;
		}

		// Change 10/27/12: User can now choose between rescaling and not
		// rescaling:
		// // SED fix 10/11/12. We don't want to rescale, we set it to the
		// actual numbers in the log file
		if (!isDoRescaling()) {
			factor = 1.0;
		}

		for (EAttribute attribute : attributes) {
			for (int i = 0; i < compartments.size(); i++) {
				if (attribute.getName().equalsIgnoreCase(compartments.get(i))) {
					double dVal = compartmentValues.get(i).doubleValue()
							* factor;
					current.eSet(attribute, Double.valueOf(dVal));
				}
			}
		}
	}

	/**
	 * 
	 * @param compartments
	 * @return
	 * @throws IOException
	 */
	private Map<URI, List<Double>> getCompartmentValues(
			List<String> compartments) throws IOException {
		Map<URI, List<Double>> compartmentValues = new HashMap<URI, List<Double>>();
		File dir = getFileFromDataPath(dataPath);
		BufferedReader reader = null;
		for (File f : dir.listFiles()) {

			int compartmentIndex = compartments.indexOf(getCompartmentName(f
					.getName()));

			try {
				if (compartmentIndex != -1) {
					reader = new BufferedReader(new FileReader(f));
					String firstLine = reader.readLine();
					String[] nodeToks = firstLine.split(",");

					// Skip (row-1) lines
					for (int i = 1; i < row; i++) {
						reader.readLine();
					}

					String line = reader.readLine();
					String[] valToks = line.split(",");

					for (int i = 2; i < nodeToks.length; i++) {
						URI node = null;
						double value = Double.parseDouble(valToks[i]);

						if (nodeToks[i].startsWith("stem")) {
							node = URI.createURI(nodeToks[i]);
						} else {
							node = RegionImpl.createRegionNodeURI(nodeToks[i]);
						}

						List<Double> values = compartmentValues.get(node);

						if (values == null) {
							values = new ArrayList<Double>();
							values.addAll(Collections.nCopies(
									compartments.size(), Double.valueOf(0.0)));
							compartmentValues.put(node, values);
						}

						values.set(compartmentIndex, Double.valueOf(value));
					}
				}
			} finally {
				if (reader != null)
					reader.close();
			}

		}

		return compartmentValues;
	}

	private List<String> getCompartments() {
		List<String> compartments = new ArrayList<String>();
		File dir = getFileFromDataPath(dataPath);

		for (String fName : dir.list()) {
			String compartment = getCompartmentName(fName);

			if (compartment != null && !compartments.contains(compartment)) {
				compartments.add(compartment);
			}
		}

		return compartments;
	}

	private String getCompartmentName(String fName) {
		String prefix = fName.substring(0, fName.indexOf('_'));

		if (prefix != null && !prefix.equals("Population Count")) {
			return prefix.toLowerCase();
		}

		return null;
	}

	private File getFileFromDataPath(String path) {
		if (path.startsWith(PLATFORM) || path.startsWith(FILE)) {
			try {
				URL inURL = new URL(path);

				return new File(FileLocator.toFileURL(inURL).getFile());
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		} else {
			return new File(path);
		}
	}

} // ExternalDataSourceDiseaseInitializerImpl
