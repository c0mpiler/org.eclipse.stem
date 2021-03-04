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
package org.eclipse.stem.core.model.impl;



import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.math.BinomialDistributionUtil;
import org.eclipse.stem.core.model.IntegrationDecorator;
import org.eclipse.stem.core.model.ModelPackage;
import org.eclipse.stem.core.model.STEMTime;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integration Decorator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.core.model.impl.IntegrationDecoratorImpl#isAddStochasticNoise <em>Add Stochastic Noise</em>}</li>
 *   <li>{@link org.eclipse.stem.core.model.impl.IntegrationDecoratorImpl#getRandomSeed <em>Random Seed</em>}</li>
 *   <li>{@link org.eclipse.stem.core.model.impl.IntegrationDecoratorImpl#getBinomialDistribution <em>Binomial Distribution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IntegrationDecoratorImpl extends NodeDecoratorImpl implements IntegrationDecorator {
	/**
	 * The default value of the '{@link #isAddStochasticNoise() <em>Add Stochastic Noise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAddStochasticNoise()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ADD_STOCHASTIC_NOISE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isAddStochasticNoise() <em>Add Stochastic Noise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAddStochasticNoise()
	 * @generated
	 * @ordered
	 */
	protected boolean addStochasticNoise = ADD_STOCHASTIC_NOISE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRandomSeed() <em>Random Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRandomSeed()
	 * @generated
	 * @ordered
	 */
	protected static final long RANDOM_SEED_EDEFAULT = 1L;
	/**
	 * The cached value of the '{@link #getRandomSeed() <em>Random Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRandomSeed()
	 * @generated
	 * @ordered
	 */
	protected long randomSeed = RANDOM_SEED_EDEFAULT;
	/**
	 * The default value of the '{@link #getBinomialDistribution() <em>Binomial Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinomialDistribution()
	 * @generated
	 * @ordered
	 */
	protected static final BinomialDistributionUtil BINOMIAL_DISTRIBUTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBinomialDistribution() <em>Binomial Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinomialDistribution()
	 * @generated
	 * @ordered
	 */
	protected BinomialDistributionUtil binomialDistribution = BINOMIAL_DISTRIBUTION_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegrationDecoratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.INTEGRATION_DECORATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAddStochasticNoise() {
		return addStochasticNoise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddStochasticNoise(boolean newAddStochasticNoise) {
		boolean oldAddStochasticNoise = addStochasticNoise;
		addStochasticNoise = newAddStochasticNoise;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INTEGRATION_DECORATOR__ADD_STOCHASTIC_NOISE, oldAddStochasticNoise, addStochasticNoise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getRandomSeed() {
		return randomSeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setRandomSeed(long newRandomSeed) {
		long oldRandomSeed = randomSeed;
		randomSeed = newRandomSeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INTEGRATION_DECORATOR__RANDOM_SEED, oldRandomSeed, randomSeed));
		setBinomialDistribution(new BinomialDistributionUtil(newRandomSeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinomialDistributionUtil getBinomialDistribution() {
		return binomialDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinomialDistribution(BinomialDistributionUtil newBinomialDistribution) {
		BinomialDistributionUtil oldBinomialDistribution = binomialDistribution;
		binomialDistribution = newBinomialDistribution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INTEGRATION_DECORATOR__BINOMIAL_DISTRIBUTION, oldBinomialDistribution, binomialDistribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void applyExternalDeltas(STEMTime time, double t, long timeDelta, EList<DynamicLabel> labels) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void calculateDeltas(STEMTime time, double t, long timeDelta, EList<DynamicLabel> labels) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void doStochasticProcess(IntegrationLabel label, long timeDelta) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void computeAdditionalDeltasAndExchanges(IntegrationLabel integrationLabel, STEMTime time, double t, long timeDelta) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("boxing")
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.INTEGRATION_DECORATOR__ADD_STOCHASTIC_NOISE:
				return isAddStochasticNoise();
			case ModelPackage.INTEGRATION_DECORATOR__RANDOM_SEED:
				return getRandomSeed();
			case ModelPackage.INTEGRATION_DECORATOR__BINOMIAL_DISTRIBUTION:
				return getBinomialDistribution();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("boxing")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.INTEGRATION_DECORATOR__ADD_STOCHASTIC_NOISE:
				setAddStochasticNoise((Boolean)newValue);
				return;
			case ModelPackage.INTEGRATION_DECORATOR__RANDOM_SEED:
				setRandomSeed((Long)newValue);
				return;
			case ModelPackage.INTEGRATION_DECORATOR__BINOMIAL_DISTRIBUTION:
				setBinomialDistribution((BinomialDistributionUtil)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.INTEGRATION_DECORATOR__ADD_STOCHASTIC_NOISE:
				setAddStochasticNoise(ADD_STOCHASTIC_NOISE_EDEFAULT);
				return;
			case ModelPackage.INTEGRATION_DECORATOR__RANDOM_SEED:
				setRandomSeed(RANDOM_SEED_EDEFAULT);
				return;
			case ModelPackage.INTEGRATION_DECORATOR__BINOMIAL_DISTRIBUTION:
				setBinomialDistribution(BINOMIAL_DISTRIBUTION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.INTEGRATION_DECORATOR__ADD_STOCHASTIC_NOISE:
				return addStochasticNoise != ADD_STOCHASTIC_NOISE_EDEFAULT;
			case ModelPackage.INTEGRATION_DECORATOR__RANDOM_SEED:
				return randomSeed != RANDOM_SEED_EDEFAULT;
			case ModelPackage.INTEGRATION_DECORATOR__BINOMIAL_DISTRIBUTION:
				return BINOMIAL_DISTRIBUTION_EDEFAULT == null ? binomialDistribution != null : !BINOMIAL_DISTRIBUTION_EDEFAULT.equals(binomialDistribution);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (addStochasticNoise: "); //$NON-NLS-1$
		result.append(addStochasticNoise);
		result.append(", randomSeed: "); //$NON-NLS-1$
		result.append(randomSeed);
		result.append(", binomialDistribution: "); //$NON-NLS-1$
		result.append(binomialDistribution);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<IItemPropertyDescriptor> getCompartments(
			String populationIdentifier) {
		//Must implement
		throw new UnsupportedOperationException("Method getCompartments must be implemented");
	}

} //IntegrationDecoratorImpl
