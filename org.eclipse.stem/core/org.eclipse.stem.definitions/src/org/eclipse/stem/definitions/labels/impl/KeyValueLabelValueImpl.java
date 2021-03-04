/**
 */
package org.eclipse.stem.definitions.labels.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.stem.definitions.labels.KeyValueLabelValue;
import org.eclipse.stem.definitions.labels.LabelsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Value Label Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class KeyValueLabelValueImpl extends GenericLabelValueImpl<Map<String, Object>> implements KeyValueLabelValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected KeyValueLabelValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LabelsPackage.Literals.KEY_VALUE_LABEL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setValue(Map<String, Object> newValue) {
		super.setValue(newValue);
	}

} //KeyValueLabelValueImpl
