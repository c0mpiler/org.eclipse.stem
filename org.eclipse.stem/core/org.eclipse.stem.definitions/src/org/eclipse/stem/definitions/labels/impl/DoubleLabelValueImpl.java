/**
 */
package org.eclipse.stem.definitions.labels.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.stem.definitions.labels.DoubleLabelValue;
import org.eclipse.stem.definitions.labels.LabelsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Double Label Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DoubleLabelValueImpl extends GenericLabelValueImpl<Double> implements DoubleLabelValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoubleLabelValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LabelsPackage.Literals.DOUBLE_LABEL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setValue(Double newValue) {
		super.setValue(newValue);
	}

} //DoubleLabelValueImpl
