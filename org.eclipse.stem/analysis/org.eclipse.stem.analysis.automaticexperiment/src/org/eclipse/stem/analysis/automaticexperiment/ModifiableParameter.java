package org.eclipse.stem.analysis.automaticexperiment;

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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modifiable Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.analysis.automaticexperiment.ModifiableParameter#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.eclipse.stem.analysis.automaticexperiment.ModifiableParameter#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.stem.analysis.automaticexperiment.ModifiableParameter#getStep <em>Step</em>}</li>
 *   <li>{@link org.eclipse.stem.analysis.automaticexperiment.ModifiableParameter#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.eclipse.stem.analysis.automaticexperiment.ModifiableParameter#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.eclipse.stem.analysis.automaticexperiment.ModifiableParameter#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.eclipse.stem.analysis.automaticexperiment.ModifiableParameter#getTargetURI <em>Target URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.analysis.automaticexperiment.AutomaticexperimentPackage#getModifiableParameter()
 * @model
 * @generated
 */
public interface ModifiableParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(double)
	 * @see org.eclipse.stem.analysis.automaticexperiment.AutomaticexperimentPackage#getModifiableParameter_InitialValue()
	 * @model required="true"
	 * @generated
	 */
	double getInitialValue();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.analysis.automaticexperiment.ModifiableParameter#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(double value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(EStructuralFeature)
	 * @see org.eclipse.stem.analysis.automaticexperiment.AutomaticexperimentPackage#getModifiableParameter_Feature()
	 * @model required="true"
	 * @generated
	 */
	EStructuralFeature getFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.analysis.automaticexperiment.ModifiableParameter#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' attribute.
	 * @see #setStep(double)
	 * @see org.eclipse.stem.analysis.automaticexperiment.AutomaticexperimentPackage#getModifiableParameter_Step()
	 * @model required="true"
	 * @generated
	 */
	double getStep();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.analysis.automaticexperiment.ModifiableParameter#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(double value);

	/**
	 * Returns the value of the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Name</em>' attribute.
	 * @see #setFeatureName(String)
	 * @see org.eclipse.stem.analysis.automaticexperiment.AutomaticexperimentPackage#getModifiableParameter_FeatureName()
	 * @model required="true"
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.analysis.automaticexperiment.ModifiableParameter#getFeatureName <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Name</em>' attribute.
	 * @see #getFeatureName()
	 * @generated
	 */
	void setFeatureName(String value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(double)
	 * @see org.eclipse.stem.analysis.automaticexperiment.AutomaticexperimentPackage#getModifiableParameter_LowerBound()
	 * @model default="-1"
	 * @generated
	 */
	double getLowerBound();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.analysis.automaticexperiment.ModifiableParameter#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(double value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(double)
	 * @see org.eclipse.stem.analysis.automaticexperiment.AutomaticexperimentPackage#getModifiableParameter_UpperBound()
	 * @model default="-1"
	 * @generated
	 */
	double getUpperBound();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.analysis.automaticexperiment.ModifiableParameter#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(double value);

	/**
	 * Returns the value of the '<em><b>Target URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target URI</em>' attribute.
	 * @see #setTargetURI(URI)
	 * @see org.eclipse.stem.analysis.automaticexperiment.AutomaticexperimentPackage#getModifiableParameter_TargetURI()
	 * @model dataType="org.eclipse.stem.core.common.URI"
	 * @generated
	 */
	URI getTargetURI();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.analysis.automaticexperiment.ModifiableParameter#getTargetURI <em>Target URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target URI</em>' attribute.
	 * @see #getTargetURI()
	 * @generated
	 */
	void setTargetURI(URI value);

} // ModifiableParameter
