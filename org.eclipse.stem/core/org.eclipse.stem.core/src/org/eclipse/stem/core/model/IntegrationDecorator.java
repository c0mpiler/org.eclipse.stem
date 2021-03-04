package org.eclipse.stem.core.model;
/******************************************************************************* 
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     IBM Corporation - initial API and implementation 
 *******************************************************************************/

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.math.BinomialDistributionUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integration Decorator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.core.model.IntegrationDecorator#isAddStochasticNoise <em>Add Stochastic Noise</em>}</li>
 *   <li>{@link org.eclipse.stem.core.model.IntegrationDecorator#getRandomSeed <em>Random Seed</em>}</li>
 *   <li>{@link org.eclipse.stem.core.model.IntegrationDecorator#getBinomialDistribution <em>Binomial Distribution</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.core.model.ModelPackage#getIntegrationDecorator()
 * @model abstract="true"
 * @generated
 */
public interface IntegrationDecorator extends NodeDecorator {
	/**
	 * Returns the value of the '<em><b>Add Stochastic Noise</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Stochastic Noise</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Stochastic Noise</em>' attribute.
	 * @see #setAddStochasticNoise(boolean)
	 * @see org.eclipse.stem.core.model.ModelPackage#getIntegrationDecorator_AddStochasticNoise()
	 * @model default="false"
	 * @generated
	 */
	boolean isAddStochasticNoise();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.model.IntegrationDecorator#isAddStochasticNoise <em>Add Stochastic Noise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Stochastic Noise</em>' attribute.
	 * @see #isAddStochasticNoise()
	 * @generated
	 */
	void setAddStochasticNoise(boolean value);

	/**
	 * Returns the value of the '<em><b>Random Seed</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Random Seed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Random Seed</em>' attribute.
	 * @see #setRandomSeed(long)
	 * @see org.eclipse.stem.core.model.ModelPackage#getIntegrationDecorator_RandomSeed()
	 * @model default="1"
	 * @generated
	 */
	long getRandomSeed();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.model.IntegrationDecorator#getRandomSeed <em>Random Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Random Seed</em>' attribute.
	 * @see #getRandomSeed()
	 * @generated
	 */
	void setRandomSeed(long value);

	/**
	 * Returns the value of the '<em><b>Binomial Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binomial Distribution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binomial Distribution</em>' attribute.
	 * @see #setBinomialDistribution(BinomialDistributionUtil)
	 * @see org.eclipse.stem.core.model.ModelPackage#getIntegrationDecorator_BinomialDistribution()
	 * @model dataType="org.eclipse.stem.core.model.BinomialDistributionUtil" transient="true"
	 * @generated
	 */
	BinomialDistributionUtil getBinomialDistribution();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.model.IntegrationDecorator#getBinomialDistribution <em>Binomial Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binomial Distribution</em>' attribute.
	 * @see #getBinomialDistribution()
	 * @generated
	 */
	void setBinomialDistribution(BinomialDistributionUtil value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model labelsMany="true"
	 * @generated
	 */
	void applyExternalDeltas(STEMTime time, double t, long timeDelta, EList<DynamicLabel> labels);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model labelsMany="true"
	 * @generated
	 */
	void calculateDeltas(STEMTime time, double t, long timeDelta, EList<DynamicLabel> labels);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void doStochasticProcess(IntegrationLabel label, long timeDelta);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void computeAdditionalDeltasAndExchanges(IntegrationLabel integrationLabel, STEMTime time, double t, long timeDelta);

	/**
	 * <!-- begin-user-doc -->
	 * TODO this method does not seem to be modeled in the mode.ecore file
	 * TODO seems like it should be
	 * TODO regeneration makes it disappear so added generated NOT
	 *
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated NOT
	 */
	EList<String> getAllLabelIdentifiers();

	/**
	 * Retrieve the compartments. Not modeled in EMF
	 * 
	 * @param populationIdentifier The population identifier
	 * @return List<IItemPropertyDescriptor> Compartments
	 */
	List<IItemPropertyDescriptor> getCompartments(String populationIdentifier);

	
} // IntegrationDecorator
