/**
 */
package org.eclipse.stem.graphgenerators;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Area Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.stem.graphgenerators.GraphgeneratorsPackage#getAreaUnit()
 * @model
 * @generated
 */
public enum AreaUnit implements Enumerator {
	/**
	 * The '<em><b>SQ KM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQ_KM_VALUE
	 * @generated
	 * @ordered
	 */
	SQ_KM(0, "SQ_KM", "km^2"),

	/**
	 * The '<em><b>SQ M</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQ_M_VALUE
	 * @generated
	 * @ordered
	 */
	SQ_M(1, "SQ_M", "m^2"),

	/**
	 * The '<em><b>SQ MILE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQ_MILE_VALUE
	 * @generated
	 * @ordered
	 */
	SQ_MILE(2, "SQ_MILE", "mi^2");

	/**
	 * The '<em><b>SQ KM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SQ KM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SQ_KM
	 * @model literal="km^2"
	 * @generated
	 * @ordered
	 */
	public static final int SQ_KM_VALUE = 0;

	/**
	 * The '<em><b>SQ M</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SQ M</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SQ_M
	 * @model literal="m^2"
	 * @generated
	 * @ordered
	 */
	public static final int SQ_M_VALUE = 1;

	/**
	 * The '<em><b>SQ MILE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SQ MILE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SQ_MILE
	 * @model literal="mi^2"
	 * @generated
	 * @ordered
	 */
	public static final int SQ_MILE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Area Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AreaUnit[] VALUES_ARRAY =
		new AreaUnit[] {
			SQ_KM,
			SQ_M,
			SQ_MILE,
		};

	/**
	 * A public read-only list of all the '<em><b>Area Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AreaUnit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Area Unit</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AreaUnit get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AreaUnit result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Area Unit</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AreaUnit getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AreaUnit result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Area Unit</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AreaUnit get(int value) {
		switch (value) {
			case SQ_KM_VALUE: return SQ_KM;
			case SQ_M_VALUE: return SQ_M;
			case SQ_MILE_VALUE: return SQ_MILE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AreaUnit(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //AreaUnit
