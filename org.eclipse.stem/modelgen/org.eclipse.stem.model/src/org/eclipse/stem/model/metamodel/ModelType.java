/*******************************************************************************
 * Copyright (c) 2012 Bundesinstitut für Risikobewertung and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *     Bundesinstitut für Risikobewertung - initial API and implementation
 *******************************************************************************/
package org.eclipse.stem.model.metamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Model Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.stem.model.metamodel.MetamodelPackage#getModelType()
 * @model
 * @generated
 */
public enum ModelType implements Enumerator {
	/**
	 * The '<em><b>Disease Model</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISEASE_MODEL_VALUE
	 * @generated
	 * @ordered
	 */
	DISEASE_MODEL(0, "DiseaseModel", "DiseaseModel"),

	/**
	 * The '<em><b>Population Model</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POPULATION_MODEL_VALUE
	 * @generated
	 * @ordered
	 */
	POPULATION_MODEL(1, "PopulationModel", "PopulationModel"),

	/**
	 * The '<em><b>Food Production Model</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOOD_PRODUCTION_MODEL_VALUE
	 * @generated
	 * @ordered
	 */
	FOOD_PRODUCTION_MODEL(2, "FoodProductionModel", "FoodProductionModel");

	/**
	 * The '<em><b>Disease Model</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Disease Model</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISEASE_MODEL
	 * @model name="DiseaseModel"
	 * @generated
	 * @ordered
	 */
	public static final int DISEASE_MODEL_VALUE = 0;

	/**
	 * The '<em><b>Population Model</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Population Model</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POPULATION_MODEL
	 * @model name="PopulationModel"
	 * @generated
	 * @ordered
	 */
	public static final int POPULATION_MODEL_VALUE = 1;

	/**
	 * The '<em><b>Food Production Model</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Food Production Model</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FOOD_PRODUCTION_MODEL
	 * @model name="FoodProductionModel"
	 * @generated
	 * @ordered
	 */
	public static final int FOOD_PRODUCTION_MODEL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Model Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ModelType[] VALUES_ARRAY =
		new ModelType[] {
			DISEASE_MODEL,
			POPULATION_MODEL,
			FOOD_PRODUCTION_MODEL,
		};

	/**
	 * A public read-only list of all the '<em><b>Model Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ModelType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Model Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModelType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Model Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModelType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Model Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelType get(int value) {
		switch (value) {
			case DISEASE_MODEL_VALUE: return DISEASE_MODEL;
			case POPULATION_MODEL_VALUE: return POPULATION_MODEL;
			case FOOD_PRODUCTION_MODEL_VALUE: return FOOD_PRODUCTION_MODEL;
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
	private ModelType(int value, String name, String literal) {
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
	
} //ModelType
