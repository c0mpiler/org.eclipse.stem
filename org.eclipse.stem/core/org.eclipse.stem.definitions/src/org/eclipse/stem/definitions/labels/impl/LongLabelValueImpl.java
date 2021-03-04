/**
 */
package org.eclipse.stem.definitions.labels.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.stem.definitions.labels.LabelsPackage;
import org.eclipse.stem.definitions.labels.LongLabelValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Long Label Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LongLabelValueImpl extends GenericLabelValueImpl<Long> implements LongLabelValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LongLabelValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LabelsPackage.Literals.LONG_LABEL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setValue(Long newValue) {
		super.setValue(newValue);
	}

} //LongLabelValueImpl
