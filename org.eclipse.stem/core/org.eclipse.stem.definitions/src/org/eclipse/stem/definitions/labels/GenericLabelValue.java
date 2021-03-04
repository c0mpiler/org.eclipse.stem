/**
 */
package org.eclipse.stem.definitions.labels;

import org.eclipse.stem.core.graph.LabelValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Label Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.definitions.labels.GenericLabelValue#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.stem.definitions.labels.GenericLabelValue#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.eclipse.stem.definitions.labels.GenericLabelValue#getMeasure <em>Measure</em>}</li>
 * </ul>
 *
 * @see org.eclipse.stem.definitions.labels.LabelsPackage#getGenericLabelValue()
 * @model
 * @generated
 */
public interface GenericLabelValue<T> extends LabelValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see org.eclipse.stem.definitions.labels.LabelsPackage#getGenericLabelValue_Value()
	 * @model
	 * @generated
	 */
	T getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.definitions.labels.GenericLabelValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(T value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see org.eclipse.stem.definitions.labels.LabelsPackage#getGenericLabelValue_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.definitions.labels.GenericLabelValue#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure</em>' attribute.
	 * @see #setMeasure(String)
	 * @see org.eclipse.stem.definitions.labels.LabelsPackage#getGenericLabelValue_Measure()
	 * @model
	 * @generated
	 */
	String getMeasure();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.definitions.labels.GenericLabelValue#getMeasure <em>Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure</em>' attribute.
	 * @see #getMeasure()
	 * @generated
	 */
	void setMeasure(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Class<?> getJavaTypeClass();

} // GenericLabelValue
