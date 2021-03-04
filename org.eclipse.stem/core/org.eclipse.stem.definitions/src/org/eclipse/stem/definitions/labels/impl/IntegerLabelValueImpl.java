/**
 */
package org.eclipse.stem.definitions.labels.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.stem.definitions.labels.IntegerLabelValue;
import org.eclipse.stem.definitions.labels.LabelsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Label Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class IntegerLabelValueImpl extends GenericLabelValueImpl<Integer> implements IntegerLabelValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerLabelValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LabelsPackage.Literals.INTEGER_LABEL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setValue(Integer newValue) {
		super.setValue(newValue);
	}

} //IntegerLabelValueImpl
