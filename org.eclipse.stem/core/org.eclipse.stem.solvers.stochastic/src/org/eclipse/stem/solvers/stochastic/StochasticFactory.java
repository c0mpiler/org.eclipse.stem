/**
 */
package org.eclipse.stem.solvers.stochastic;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.stem.solvers.stochastic.StochasticPackage
 * @generated
 */
public interface StochasticFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StochasticFactory eINSTANCE = org.eclipse.stem.solvers.stochastic.impl.StochasticFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Stochastic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stochastic</em>'.
	 * @generated
	 */
	Stochastic createStochastic();

	/**
	 * Returns a new object of class '<em>Standard Stochastic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard Stochastic</em>'.
	 * @generated
	 */
	StandardStochastic createStandardStochastic();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StochasticPackage getStochasticPackage();

} //StochasticFactory
