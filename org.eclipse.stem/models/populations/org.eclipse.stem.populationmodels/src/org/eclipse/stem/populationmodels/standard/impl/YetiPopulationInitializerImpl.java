package org.eclipse.stem.populationmodels.standard.impl;

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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.definitions.labels.EarthScienceLabel;
import org.eclipse.stem.definitions.labels.PopulationLabel;
import org.eclipse.stem.definitions.labels.PopulationLabelValue;
import org.eclipse.stem.populationmodels.standard.StandardPackage;
import org.eclipse.stem.populationmodels.standard.YetiPopulationInitializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Yeti Population Initializer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class YetiPopulationInitializerImpl extends EarthSciencePopulationInitializerImpl implements YetiPopulationInitializer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public YetiPopulationInitializerImpl() {
		super();
	}

	@Override
	protected void initializeLabel(PopulationLabel lab, STEMTime time, boolean zeroValue) {
		 PopulationLabelValue plv = lab.getCurrentPopulationValue();
		 if(zeroValue)  plv.setCount(0.0);
		 else {
			 // Get the elevation 
			 Node n = lab.getNode();
			 double elevation = -1;
			 for(NodeLabel nl:n.getLabels()) {
				 if(nl instanceof EarthScienceLabel && ((EarthScienceLabel)nl).getCurrentEarthScienceValue().getDataType().equals("elevation")) {
					 elevation = ((EarthScienceLabel)nl).getCurrentEarthScienceValue().getMean().get(0).doubleValue();
					 break;
				 }
			 }
			if(elevation == -1) 
				// no elevation data, so no yeti 
				plv.setCount(0.0);
			else {
				// There's one more yeti for each meter of elevation
				plv.setCount(elevation);
			}
		 }	 
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.YETI_POPULATION_INITIALIZER;
	}

} //YetiPopulationInitializerImpl
