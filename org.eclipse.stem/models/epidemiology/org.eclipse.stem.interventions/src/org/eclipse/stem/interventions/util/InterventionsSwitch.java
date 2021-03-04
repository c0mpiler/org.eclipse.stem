package org.eclipse.stem.interventions.util;

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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.common.SanityChecker;
import org.eclipse.stem.core.graph.Label;
import org.eclipse.stem.core.graph.LabelValue;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.graph.StaticLabel;
import org.eclipse.stem.core.graph.StaticNodeLabel;
import org.eclipse.stem.core.modifier.Modifiable;
import org.eclipse.stem.graphgenerators.GraphGenerator;
import org.eclipse.stem.interventions.ControlGraphGenerator;
import org.eclipse.stem.interventions.InterventionLabel;
import org.eclipse.stem.interventions.InterventionLabelValue;
import org.eclipse.stem.interventions.InterventionsPackage;
import org.eclipse.stem.interventions.PeriodicControlGraphGenerator;
import org.eclipse.stem.interventions.StandardInterventionLabel;
import org.eclipse.stem.interventions.StandardInterventionLabelValue;
import org.eclipse.stem.interventions.StandardPeriodicInterventionLabelValue;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.stem.interventions.InterventionsPackage
 * @generated
 */
public class InterventionsSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InterventionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterventionsSwitch() {
		if (modelPackage == null) {
			modelPackage = InterventionsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case InterventionsPackage.INTERVENTION_LABEL: {
				InterventionLabel interventionLabel = (InterventionLabel)theEObject;
				T1 result = caseInterventionLabel(interventionLabel);
				if (result == null) result = caseStaticNodeLabel(interventionLabel);
				if (result == null) result = caseNodeLabel(interventionLabel);
				if (result == null) result = caseStaticLabel(interventionLabel);
				if (result == null) result = caseLabel(interventionLabel);
				if (result == null) result = caseModifiable(interventionLabel);
				if (result == null) result = caseIdentifiable(interventionLabel);
				if (result == null) result = caseComparable(interventionLabel);
				if (result == null) result = caseSanityChecker(interventionLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterventionsPackage.STANDARD_INTERVENTION_LABEL: {
				StandardInterventionLabel standardInterventionLabel = (StandardInterventionLabel)theEObject;
				T1 result = caseStandardInterventionLabel(standardInterventionLabel);
				if (result == null) result = caseInterventionLabel(standardInterventionLabel);
				if (result == null) result = caseStaticNodeLabel(standardInterventionLabel);
				if (result == null) result = caseNodeLabel(standardInterventionLabel);
				if (result == null) result = caseStaticLabel(standardInterventionLabel);
				if (result == null) result = caseLabel(standardInterventionLabel);
				if (result == null) result = caseModifiable(standardInterventionLabel);
				if (result == null) result = caseIdentifiable(standardInterventionLabel);
				if (result == null) result = caseComparable(standardInterventionLabel);
				if (result == null) result = caseSanityChecker(standardInterventionLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterventionsPackage.CONTROL_GRAPH_GENERATOR: {
				ControlGraphGenerator controlGraphGenerator = (ControlGraphGenerator)theEObject;
				T1 result = caseControlGraphGenerator(controlGraphGenerator);
				if (result == null) result = caseGraphGenerator(controlGraphGenerator);
				if (result == null) result = caseIdentifiable(controlGraphGenerator);
				if (result == null) result = caseComparable(controlGraphGenerator);
				if (result == null) result = caseSanityChecker(controlGraphGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterventionsPackage.INTERVENTION_LABEL_VALUE: {
				InterventionLabelValue interventionLabelValue = (InterventionLabelValue)theEObject;
				T1 result = caseInterventionLabelValue(interventionLabelValue);
				if (result == null) result = caseLabelValue(interventionLabelValue);
				if (result == null) result = caseSanityChecker(interventionLabelValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterventionsPackage.STANDARD_INTERVENTION_LABEL_VALUE: {
				StandardInterventionLabelValue standardInterventionLabelValue = (StandardInterventionLabelValue)theEObject;
				T1 result = caseStandardInterventionLabelValue(standardInterventionLabelValue);
				if (result == null) result = caseInterventionLabelValue(standardInterventionLabelValue);
				if (result == null) result = caseLabelValue(standardInterventionLabelValue);
				if (result == null) result = caseSanityChecker(standardInterventionLabelValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterventionsPackage.STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE: {
				StandardPeriodicInterventionLabelValue standardPeriodicInterventionLabelValue = (StandardPeriodicInterventionLabelValue)theEObject;
				T1 result = caseStandardPeriodicInterventionLabelValue(standardPeriodicInterventionLabelValue);
				if (result == null) result = caseInterventionLabelValue(standardPeriodicInterventionLabelValue);
				if (result == null) result = caseLabelValue(standardPeriodicInterventionLabelValue);
				if (result == null) result = caseSanityChecker(standardPeriodicInterventionLabelValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterventionsPackage.PERIODIC_CONTROL_GRAPH_GENERATOR: {
				PeriodicControlGraphGenerator periodicControlGraphGenerator = (PeriodicControlGraphGenerator)theEObject;
				T1 result = casePeriodicControlGraphGenerator(periodicControlGraphGenerator);
				if (result == null) result = caseGraphGenerator(periodicControlGraphGenerator);
				if (result == null) result = caseIdentifiable(periodicControlGraphGenerator);
				if (result == null) result = caseComparable(periodicControlGraphGenerator);
				if (result == null) result = caseSanityChecker(periodicControlGraphGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intervention Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intervention Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInterventionLabel(InterventionLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard Intervention Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard Intervention Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStandardInterventionLabel(StandardInterventionLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Graph Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Graph Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseControlGraphGenerator(ControlGraphGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intervention Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intervention Label Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInterventionLabelValue(InterventionLabelValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard Intervention Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard Intervention Label Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStandardInterventionLabelValue(StandardInterventionLabelValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard Periodic Intervention Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard Periodic Intervention Label Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStandardPeriodicInterventionLabelValue(StandardPeriodicInterventionLabelValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Periodic Control Graph Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Periodic Control Graph Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePeriodicControlGraphGenerator(PeriodicControlGraphGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sanity Checker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sanity Checker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSanityChecker(SanityChecker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLabelValue(LabelValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseComparable(Comparable<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIdentifiable(Identifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNodeLabel(NodeLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModifiable(Modifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStaticLabel(StaticLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Node Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Node Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStaticNodeLabel(StaticNodeLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGraphGenerator(GraphGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //InterventionsSwitch
