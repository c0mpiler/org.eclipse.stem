package org.eclipse.stem.core.graph;
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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integration Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.core.graph.IntegrationLabel#getDeltaValue <em>Delta Value</em>}</li>
 *   <li>{@link org.eclipse.stem.core.graph.IntegrationLabel#getTempValue <em>Temp Value</em>}</li>
 *   <li>{@link org.eclipse.stem.core.graph.IntegrationLabel#getProbeValue <em>Probe Value</em>}</li>
 *   <li>{@link org.eclipse.stem.core.graph.IntegrationLabel#getErrorScale <em>Error Scale</em>}</li>
 *   <li>{@link org.eclipse.stem.core.graph.IntegrationLabel#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.core.graph.GraphPackage#getIntegrationLabel()
 * @model abstract="true"
 * @generated
 */
public interface IntegrationLabel extends DynamicNodeLabel {
	/**
	 * Returns the value of the '<em><b>Delta Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delta Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delta Value</em>' reference.
	 * @see #setDeltaValue(IntegrationLabelValue)
	 * @see org.eclipse.stem.core.graph.GraphPackage#getIntegrationLabel_DeltaValue()
	 * @model
	 * @generated
	 */
	IntegrationLabelValue getDeltaValue();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.graph.IntegrationLabel#getDeltaValue <em>Delta Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Value</em>' reference.
	 * @see #getDeltaValue()
	 * @generated
	 */
	void setDeltaValue(IntegrationLabelValue value);

	/**
	 * Returns the value of the '<em><b>Temp Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temp Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temp Value</em>' reference.
	 * @see #setTempValue(IntegrationLabelValue)
	 * @see org.eclipse.stem.core.graph.GraphPackage#getIntegrationLabel_TempValue()
	 * @model
	 * @generated
	 */
	IntegrationLabelValue getTempValue();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.graph.IntegrationLabel#getTempValue <em>Temp Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temp Value</em>' reference.
	 * @see #getTempValue()
	 * @generated
	 */
	void setTempValue(IntegrationLabelValue value);

	/**
	 * Returns the value of the '<em><b>Probe Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probe Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probe Value</em>' reference.
	 * @see #setProbeValue(IntegrationLabelValue)
	 * @see org.eclipse.stem.core.graph.GraphPackage#getIntegrationLabel_ProbeValue()
	 * @model
	 * @generated
	 */
	IntegrationLabelValue getProbeValue();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.graph.IntegrationLabel#getProbeValue <em>Probe Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probe Value</em>' reference.
	 * @see #getProbeValue()
	 * @generated
	 */
	void setProbeValue(IntegrationLabelValue value);

	/**
	 * Returns the value of the '<em><b>Error Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Scale</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Scale</em>' reference.
	 * @see #setErrorScale(IntegrationLabelValue)
	 * @see org.eclipse.stem.core.graph.GraphPackage#getIntegrationLabel_ErrorScale()
	 * @model
	 * @generated
	 */
	IntegrationLabelValue getErrorScale();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.graph.IntegrationLabel#getErrorScale <em>Error Scale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Scale</em>' reference.
	 * @see #getErrorScale()
	 * @generated
	 */
	void setErrorScale(IntegrationLabelValue value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see org.eclipse.stem.core.graph.GraphPackage#getIntegrationLabel_Identifier()
	 * @model changeable="false"
	 * @generated
	 */
	String getIdentifier();

} // IntegrationLabel
