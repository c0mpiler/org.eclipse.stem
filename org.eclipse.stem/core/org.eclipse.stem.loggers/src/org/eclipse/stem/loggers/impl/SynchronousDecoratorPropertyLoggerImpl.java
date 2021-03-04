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
package org.eclipse.stem.loggers.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.stem.loggers.SimulationLoggerPackage;
import org.eclipse.stem.loggers.SynchronousDecoratorPropertyLogger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronous Decorator Property Logger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.loggers.impl.SynchronousDecoratorPropertyLoggerImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SynchronousDecoratorPropertyLoggerImpl extends SimulationLoggerImpl implements SynchronousDecoratorPropertyLogger {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2011 IBM Corporation and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    IBM Corporation - initial API and implementation";
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<String> properties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronousDecoratorPropertyLoggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulationLoggerPackage.Literals.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getProperties() {
		if (properties == null) {
			properties = new EDataTypeUniqueEList<String>(String.class, this, SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER__PROPERTIES);
		}
		return properties;
	}

	
	Map<URI, Map<String,EList<String>>> decoratorIdentifierProperties;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Map<String, EList<String>> getDecoratorProperties(URI decoratorURI) {
		
		if (decoratorIdentifierProperties == null) {
			decoratorIdentifierProperties = new HashMap<URI, Map<String,EList<String>>>();
			
			for (String propertyDescription : getProperties()) {
				try {
					String[] tokens = propertyDescription.split("\\#");
					if (tokens.length > 1) {
						URI uri = URI.createURI(tokens[0]);
						String identifierProperty = tokens[1];
			    		  
						String[] propertyElements = identifierProperty.split("\\/");
						if (propertyElements.length > 1) {
							String identifier = propertyElements[0];
							String property = propertyElements[1];

							
							Map<String,EList<String>> decoratorData = decoratorIdentifierProperties.get(uri);
							if (decoratorData == null) {
								decoratorData = new HashMap<String, EList<String>>();
								decoratorIdentifierProperties.put(uri, decoratorData);
							}
							
							EList<String> propertyList = decoratorData.get(identifier);
							if (propertyList == null) {
								propertyList = new BasicEList<String>();
								decoratorData.put(identifier, propertyList);
							}
							
							propertyList.add(property);
						}
					}			
				} catch (Exception e) {
					
				}
			}
		}
		
		return decoratorIdentifierProperties.get(decoratorURI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER__PROPERTIES:
				return getProperties();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends String>)newValue);
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
			case SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER__PROPERTIES:
				getProperties().clear();
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
			case SimulationLoggerPackage.SYNCHRONOUS_DECORATOR_PROPERTY_LOGGER__PROPERTIES:
				return properties != null && !properties.isEmpty();
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
		result.append(" (properties: ");
		result.append(properties);
		result.append(')');
		return result.toString();
	}

} //SynchronousDecoratorPropertyLoggerImpl
