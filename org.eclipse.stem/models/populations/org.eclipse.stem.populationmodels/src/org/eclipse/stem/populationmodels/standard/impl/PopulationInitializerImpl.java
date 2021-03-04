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

import java.util.Calendar;
import java.util.Date;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.osgi.util.NLS;
import org.eclipse.stem.core.Utility;
import org.eclipse.stem.core.graph.Edge;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.model.impl.NodeDecoratorImpl;
import org.eclipse.stem.core.scenario.ScenarioInitializationException;
import org.eclipse.stem.definitions.labels.PopulationLabel;
import org.eclipse.stem.definitions.labels.impl.PopulationLabelImpl;
import org.eclipse.stem.populationmodels.standard.PopulationInitializer;
import org.eclipse.stem.populationmodels.standard.PopulationModel;
import org.eclipse.stem.populationmodels.standard.StandardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Population Initializer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.populationmodels.standard.impl.PopulationInitializerImpl#getPopulationIdentifier <em>Population Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PopulationInitializerImpl extends NodeDecoratorImpl implements PopulationInitializer {
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
	protected PopulationInitializerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardPackage.Literals.POPULATION_INITIALIZER;
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

	
	protected abstract void initializeLabel(PopulationLabel lab, STEMTime time, boolean zeroValue) throws ScenarioInitializationException;
	
	protected void checkPopulationModels() throws ScenarioInitializationException {
		// Let's validate to make sure there is no population model
		// at the same or lower level that already's been invoked 
		// and that's using the same population. If so, we should bring
		// up a warning and possibly a help link
		
		for(Decorator d:this.getGraph().getDecorators()) {
			if (d instanceof PopulationModel && ((PopulationModel)d).getPopulationIdentifier().equals(this.getPopulationIdentifier())) {
				if(((PopulationModel)d).isGraphDecorated())
					throw new ScenarioInitializationException(NLS.bind(Messages.DUPLICATE_POP_INIT, new Object[]{this.getPopulationIdentifier(), this.getURI().toString(), d.getURI().toString()}), d, new Exception());
			}
		}	
	}
	
	protected int getYear(STEMTime time) {
		Calendar cal = Calendar.getInstance();
		if(time != null)
			cal.setTime(time.getTime());
		else cal.setTime(new Date());
		int year = cal.get(Calendar.YEAR);
		return year;
	}
	
	
	
	protected URI createPopulationLabelURI(Node n, STEMTime time) {
		int adminLevel = Utility.keyLevel(n.getURI().lastSegment());
		String countryCode = this.getCountryCode(n);
		String population = this.getPopulationIdentifier();
		
		// default
		Calendar currentCal = Calendar.getInstance();
		int year = currentCal.get(Calendar.YEAR) + 1900;
		// int year = new Date().getYear()+1900;
		
		// set from STEMTime if possible
		if(time != null) year = getYear(time);
		String code = n.getURI().lastSegment();
		
		return PopulationLabelImpl.createPopulationLabelURI(adminLevel, countryCode, population, year+"", code); //$NON-NLS-1$
	}
	
	protected String getCountryCode(Node n) {
		if(Utility.keyLevel(n.getURI().lastSegment()) == 0) return n.getURI().lastSegment();
		else for(Edge e:n.getEdges()) 
			if(Utility.keyLevel(e.getA().getURI().lastSegment()) < Utility.keyLevel(n.getURI().lastSegment()))
			return getCountryCode(e.getA());
		
		return "ZZZ"; // Not found, but ZZZ is the parent of everything //$NON-NLS-1$
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StandardPackage.POPULATION_INITIALIZER__POPULATION_IDENTIFIER:
				return getPopulationIdentifier();
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
			case StandardPackage.POPULATION_INITIALIZER__POPULATION_IDENTIFIER:
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
			case StandardPackage.POPULATION_INITIALIZER__POPULATION_IDENTIFIER:
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
			case StandardPackage.POPULATION_INITIALIZER__POPULATION_IDENTIFIER:
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
		result.append(" (populationIdentifier: ");
		result.append(populationIdentifier);
		result.append(')');
		return result.toString();
	}

} //PopulationInitializerImpl
