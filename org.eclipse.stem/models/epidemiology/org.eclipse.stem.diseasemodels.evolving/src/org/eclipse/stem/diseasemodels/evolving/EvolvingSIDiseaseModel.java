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
package org.eclipse.stem.diseasemodels.evolving;

import org.eclipse.stem.diseasemodels.standard.SI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SI Disease Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.evolving.EvolvingSIDiseaseModel#getCaseMutationRate <em>Case Mutation Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.evolving.EvolvingSIDiseaseModel#getGenomeLength <em>Genome Length</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.evolving.EvolvingSIDiseaseModel#getGeneticDistNonlinExponent <em>Genetic Dist Nonlin Exponent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingPackage#getEvolvingSIDiseaseModel()
 * @model annotation="http:///org/eclipse/stem/modelgen/model/label *='EvolvingSIDiseaseModelLabel'"
 *        annotation="http:///org/eclipse/stem/modelgen/model/labelvalue *='EvolvingSIDiseaseModelLabelValue'"
 *        annotation="http:///org/eclipse/stem/modelgen/model/adapters propertyEditorSuperClass='org.eclipse.stem.ui.wizards.StandardDiseaseModelPropertyEditor' stringProviderSuperClass='org.eclipse.stem.ui.wizards.StandardPropertyStringProviderAdapterFactory.StandardPropertyStringProviderAdapter' labelRelativeValueProviderSuperClass='org.eclipse.stem.diseasemodels.standard.provider.StandardRelativeValueProviderAdapterFactory.DiseaseModelLabelRelativeValueProvider' labelValueRelativeValueProviderSuperClass='org.eclipse.stem.diseasemodels.standard.provider.StandardRelativeValueProviderAdapterFactory.DiseaseModelLabelValueRelativeValueProvider'"
 *        annotation="http:///org/eclipse/stem/modelgen/generated version='1.0'"
 * @generated
 */
public interface EvolvingSIDiseaseModel extends SI, EvolvingDiseaseModel {

	/**
	 * Returns the value of the '<em><b>Case Mutation Rate</b></em>' attribute.
	 * The default value is <code>"0.00001"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Mutation Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Mutation Rate</em>' attribute.
	 * @see #setCaseMutationRate(double)
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingPackage#getEvolvingSIDiseaseModel_CaseMutationRate()
	 * @model default="0.00001"
	 * @generated
	 */
	double getCaseMutationRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingSIDiseaseModel#getCaseMutationRate <em>Case Mutation Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Mutation Rate</em>' attribute.
	 * @see #getCaseMutationRate()
	 * @generated
	 */
	void setCaseMutationRate(double value);

	/**
	 * Returns the value of the '<em><b>Genome Length</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Genome Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genome Length</em>' attribute.
	 * @see #setGenomeLength(int)
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingPackage#getEvolvingSIDiseaseModel_GenomeLength()
	 * @model default="5"
	 * @generated
	 */
	int getGenomeLength();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingSIDiseaseModel#getGenomeLength <em>Genome Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genome Length</em>' attribute.
	 * @see #getGenomeLength()
	 * @generated
	 */
	void setGenomeLength(int value);

	/**
	 * Returns the value of the '<em><b>Genetic Dist Nonlin Exponent</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Genetic Dist Nonlin Exponent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genetic Dist Nonlin Exponent</em>' attribute.
	 * @see #setGeneticDistNonlinExponent(double)
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingPackage#getEvolvingSIDiseaseModel_GeneticDistNonlinExponent()
	 * @model default="1.0"
	 * @generated
	 */
	double getGeneticDistNonlinExponent();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.evolving.EvolvingSIDiseaseModel#getGeneticDistNonlinExponent <em>Genetic Dist Nonlin Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genetic Dist Nonlin Exponent</em>' attribute.
	 * @see #getGeneticDistNonlinExponent()
	 * @generated
	 */
	void setGeneticDistNonlinExponent(double value);

} // EvolvingSIDiseaseModel
