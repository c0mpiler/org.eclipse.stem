// PopulationModelSpecification.java
package org.eclipse.stem.internal.data.geography.earthscience.models;

/*******************************************************************************
 * Copyright (c) 2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

import java.io.File;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.stem.core.Utility;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.model.Model;
import org.eclipse.stem.core.model.ModelPackage;
import org.eclipse.stem.definitions.labels.LabelsPackage;
import org.eclipse.stem.geography.names.ISOKey;
import org.eclipse.stem.internal.data.generatedplugin.DublinCore;
import org.eclipse.stem.internal.data.geography.specifications.AdminLevelSet;
import org.eclipse.stem.internal.data.geography.specifications.CountryGraphPropertyFileSpecification;
import org.eclipse.stem.internal.data.specifications.GraphPropertyFileSpecification;
import org.eclipse.stem.internal.data.specifications.ModelSpecification;

/**
 * This class represents a {@link ModelSpecification} for a Population model.
 */
public class EarthScienceModelSpecification extends ModelSpecification implements
		Comparable<EarthScienceModelSpecification> {

	/**
	 * This is referenced to cause the {@link ModelPackage} to register itself
	 * as a package.
	 */
	@SuppressWarnings("unused")
	private final ModelPackage modelPackage = ModelPackage.eINSTANCE;
	@SuppressWarnings("unused")
	private final LabelsPackage labelsPackage = LabelsPackage.eINSTANCE;

	private final ISOKey isoKey;
	private final AdminLevelSet adminLevelSet;
	private final DublinCore countryGeographicModelDC;
	private final List<DublinCore> earthScienceGraphsDC;
	private String pluginId = "org.eclipse.stem.data.geography.earthscience.models";
	private String modelName = null;  //if this is set, it will be used in the model name, e.g. "AFG Earth Science Data for <modelName> (Levels: 0,1,2)".

	static {
		// This sets up the mapping between the "platform" URI's and the
		// projects in the file system.

		// CWD is the current working directory
		final String CWD = System.getProperty("user.dir"); //$NON-NLS-1$
		// WORKSPACE is the directory of the parent workspace
		final String WORKSPACE = CWD.substring(0, CWD.lastIndexOf(File.separator));
		
		final Map<String, URI> platformResourceMap = EcorePlugin.getPlatformResourceMap();

		File f = new File(WORKSPACE);
		for (String fn: f.list()) {
			if (fn.startsWith("org.eclipse.stem.data.geography.earthscience.")) {
				// Register the mapping between the project id and the absolute path to
				// the project in the file system. This will be found later when
				// deserializing when the platform URI is mapped.
				platformResourceMap.put(fn, URI.createFileURI(WORKSPACE + File.separator + fn + File.separator));				
			}
		}
	} // static

	/**
	 * @param isoKey
	 *            the {@link ISOKey} of the country the population model is for.
	 * @param adminLevelSet
	 *            the administration levels covered in the model
	 * @param countryGeographicModelDC
	 * @param populationGraphDC
	 */
	public EarthScienceModelSpecification(ISOKey isoKey,
			AdminLevelSet adminLevelSet, DublinCore countryGeographicModelDC,
			List<DublinCore> earthScienceGraphsDC) {
		this.isoKey = isoKey;
		this.adminLevelSet = adminLevelSet;
		this.countryGeographicModelDC = countryGeographicModelDC;
		this.earthScienceGraphsDC = earthScienceGraphsDC;
	} // PopulationModelSpecification
	
	/**
	 * @param isoKey
	 *            the {@link ISOKey} of the country the population model is for.
	 * @param adminLevelSet
	 *            the administration levels covered in the model
	 * @param countryGeographicModelDC
	 * @param populationGraphDC
	 * @param pluginId 
	 */
	public EarthScienceModelSpecification(ISOKey isoKey,
			AdminLevelSet adminLevelSet, DublinCore countryGeographicModelDC,
			List<DublinCore> earthScienceGraphsDC, String pluginId, String modelName) {
		this.isoKey = isoKey;
		this.adminLevelSet = adminLevelSet;
		this.countryGeographicModelDC = countryGeographicModelDC;
		this.earthScienceGraphsDC = earthScienceGraphsDC;
		this.pluginId = pluginId;
		this.modelName = modelName;
	} // PopulationModelSpecification

	/**
	 * @see org.eclipse.stem.internal.data.specifications.ModelSpecification#createIdentifiableInstance()
	 */
	@Override
	protected Model createIdentifiableInstance() {
		final Model retValue = super.createIdentifiableInstance();

//		URI u = getIdentifiableProjectURI(countryGeographicModelDC);
//		Model m = (Model) Utility.getIdentifiable(u);
//		retValue.getModels().add(m);
		
		if (earthScienceGraphsDC != null) {
			for (DublinCore dc : earthScienceGraphsDC) {
				Graph g = (Graph)Utility.getIdentifiable(getIdentifiableProjectURI(dc));
//				if (g != null) {
					retValue.getGraphs().add(g);
//				}
			}	
		}
		


		return retValue;
	} // createIdentifiableInstance

	/**
	 * @see org.eclipse.stem.internal.data.specifications.IdentifiableSpecification#getRelativeSerializationPath()
	 */
	@Override
	protected String getRelativeSerializationPath() {
		final StringBuilder sb = new StringBuilder();
		sb.append(CountryGraphPropertyFileSpecification.COUNTRY_DIR);
		sb.append(File.separatorChar);
		sb.append(getISOKey().toString());
		return sb.toString();
	}

	/**
	 * @see org.eclipse.stem.internal.data.specifications.IdentifiableSpecification#getSerializationFileNameRoot()
	 */
	@Override
	protected String getSerializationFileNameRoot() {
		final StringBuilder sb = new StringBuilder(getISOKey().toString());
		sb.append("_"); //$NON-NLS-1$
		sb.append(adminLevelSet.toString());
		sb.append("_earthscience"); //$NON-NLS-1$
		return sb.toString();
	}

	/**
	 * @see org.eclipse.stem.internal.data.specifications.IdentifiableSpecification#getTargetPluginId()
	 */
	@Override
	protected String getTargetPluginId() {
		return pluginId;
	}

	/**
	 * @see org.eclipse.stem.internal.data.specifications.IdentifiableSpecification#getTitleDescriptor()
	 */
	@Override
	protected String getTitleDescriptor() {
		final StringBuilder sb = new StringBuilder(isoKey.toString());
		sb.append(" Earth Science Data"); //$NON-NLS-1$
		
		if (modelName != null) {  //include model name if it is exists
			sb.append(" for ").append(modelName);
		}
		
		sb.append(adminLevelSet.getNumAdminLevels() > 1 ? " (Levels: " : " (Level: "); //$NON-NLS-1$ //$NON-NLS-2$
		sb.append(adminLevelSet.toString(",")); //$NON-NLS-1$
		sb.append(")"); //$NON-NLS-1$
		return sb.toString();
	} // getTitleDescriptor

	/**
	 * @see org.eclipse.stem.internal.data.specifications.IdentifiableSpecification#createDubinCoreCoverage()
	 */
	@Override
	protected String createDubinCoreCoverage() {
		return countryGeographicModelDC.getCoverage();
	} // createDubinCoreCoverage

	/**
	 * @see org.eclipse.stem.internal.data.specifications.IdentifiableSpecification#createDubinCoreSubject()
	 */
	@Override
	protected String createDubinCoreSubject() {
		return GraphPropertyFileSpecification.createDublinCoreSubjectString(
				ModelPackage.Literals.MODEL.getName(), "earthscience"); //$NON-NLS-1$
	}

	/**
	 * @return the isoKey
	 */
	public ISOKey getISOKey() {
		return isoKey;
	}

	public int compareTo(EarthScienceModelSpecification pms) {
		return adminLevelSet.getNumAdminLevels() > pms.adminLevelSet
				.getNumAdminLevels() ? 1 : -1;

	} // compareTo

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append(isoKey);
		sb.append(":"); //$NON-NLS-1$
		sb.append(adminLevelSet.toString());
		return sb.toString();
	} // toString

} // PopulationModelSpecification