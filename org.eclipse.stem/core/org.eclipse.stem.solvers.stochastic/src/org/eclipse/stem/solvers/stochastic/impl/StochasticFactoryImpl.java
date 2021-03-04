/**
 */
package org.eclipse.stem.solvers.stochastic.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.stem.solvers.stochastic.StandardStochastic;
import org.eclipse.stem.solvers.stochastic.Stochastic;
import org.eclipse.stem.solvers.stochastic.StochasticFactory;
import org.eclipse.stem.solvers.stochastic.StochasticPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StochasticFactoryImpl extends EFactoryImpl implements StochasticFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StochasticFactory init() {
		try {
			StochasticFactory theStochasticFactory = (StochasticFactory)EPackage.Registry.INSTANCE.getEFactory(StochasticPackage.eNS_URI);
			if (theStochasticFactory != null) {
				return theStochasticFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StochasticFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StochasticFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StochasticPackage.STOCHASTIC: return createStochastic();
			case StochasticPackage.STANDARD_STOCHASTIC: return createStandardStochastic();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stochastic createStochastic() {
		StochasticImpl stochastic = new StochasticImpl();
		return stochastic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StandardStochastic createStandardStochastic() {
		StandardStochasticImpl standardStochastic = new StandardStochasticImpl();
		return standardStochastic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StochasticPackage getStochasticPackage() {
		return (StochasticPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StochasticPackage getPackage() {
		return StochasticPackage.eINSTANCE;
	}

} //StochasticFactoryImpl
