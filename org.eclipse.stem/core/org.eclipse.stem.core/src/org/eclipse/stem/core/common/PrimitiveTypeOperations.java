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
package org.eclipse.stem.core.common;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type Operations</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.stem.core.common.CommonPackage#getPrimitiveTypeOperations()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface PrimitiveTypeOperations extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" featureIdRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='Object value = eGet(featureId,true,false);\nif (value instanceof Double) {\n\treturn ((Double)value).doubleValue();\n}\nthrow new IllegalArgumentException(\"Feature is not type double\");'"
	 * @generated
	 */
	double eGetDouble(int featureId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='eSet(featureId, Double.valueOf(value));'"
	 * @generated
	 */
	void eSetDouble(int featureId, double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" featureIdRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='Object value = eGet(featureId,true,false);\nif (value instanceof Byte) {\n\treturn ((Byte)value).byteValue();\n}\nthrow new IllegalArgumentException(\"Feature is not type byte\");'"
	 * @generated
	 */
	byte eGetByte(int featureId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='eSet(featureId, new Byte(value));'"
	 * @generated
	 */
	void eSetByte(int featureId, byte value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" featureIdRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='Object value = eGet(featureId,true,false);\nif (value instanceof Character) {\n\treturn ((Character)value).charValue();\n}\nthrow new IllegalArgumentException(\"Feature is not type char\");'"
	 * @generated
	 */
	char eGetChar(int featureId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='eSet(featureId, new Character(value));'"
	 * @generated
	 */
	void eSetChar(int featureId, char value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" featureIdRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='Object value = eGet(featureId,true,false);\nif (value instanceof Character) {\n\treturn ((Short)value).shortValue();\n}\nthrow new IllegalArgumentException(\"Feature is not type short\");'"
	 * @generated
	 */
	short eGetShort(int featureId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='eSet(featureId, new Short(value));'"
	 * @generated
	 */
	void eSetShort(int featureId, short value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" featureIdRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='Object value = eGet(featureId,true,false);\nif (value instanceof Integer) {\n\treturn ((Integer)value).intValue();\n}\nthrow new IllegalArgumentException(\"Feature is not type int\");'"
	 * @generated
	 */
	int eGetInt(int featureId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='eSet(featureId, Integer.valueOf(value));'"
	 * @generated
	 */
	void eSetInt(int featureId, int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" featureIdRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='Object value = eGet(featureId,true,false);\nif (value instanceof Long) {\n\treturn ((Long)value).longValue();\n}\nthrow new IllegalArgumentException(\"Feature is not type long\");'"
	 * @generated
	 */
	long eGetLong(int featureId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='eSet(featureId, new Long(value));'"
	 * @generated
	 */
	void eSetLong(int featureId, long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" featureIdRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='Object value = eGet(featureId,true,false);\nif (value instanceof Float) {\n\treturn ((Float)value).floatValue();\n}\nthrow new IllegalArgumentException(\"Feature is not type float\");'"
	 * @generated
	 */
	float eGetFloat(int featureId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='eSet(featureId, Float.valueOf(value));'"
	 * @generated
	 */
	void eSetFloat(int featureId, float value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" featureIdRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='Object value = eGet(featureId,true,false);\nif (value instanceof Boolean) {\n\treturn ((Boolean)value).booleanValue();\n}\nthrow new IllegalArgumentException(\"Feature is not type boolean\");'"
	 * @generated
	 */
	boolean eGetBoolean(int featureId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='eSet(featureId, Boolean.valueOf(value));'"
	 * @generated
	 */
	void eSetBoolean(int featureId, boolean value);

} // PrimitiveTypeOperations
