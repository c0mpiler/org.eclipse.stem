/**
 */
package org.eclipse.stem.definitions.labels.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.stem.definitions.labels.LabelsPackage;
import org.eclipse.stem.definitions.labels.StringLabelValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Label Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StringLabelValueImpl extends GenericLabelValueImpl<String> implements StringLabelValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringLabelValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LabelsPackage.Literals.STRING_LABEL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		super.setValue(newValue);
	}

} //StringLabelValueImpl
