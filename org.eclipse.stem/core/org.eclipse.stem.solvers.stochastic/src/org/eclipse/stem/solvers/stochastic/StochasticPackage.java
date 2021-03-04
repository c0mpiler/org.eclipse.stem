/**
 */
package org.eclipse.stem.solvers.stochastic;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.stem.core.solver.SolverPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.stem.solvers.stochastic.StochasticFactory
 * @model kind="package"
 * @generated
 */
public interface StochasticPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "stochastic";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/stem/solvers/stochastic";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.stem.solvers.stochastic";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StochasticPackage eINSTANCE = org.eclipse.stem.solvers.stochastic.impl.StochasticPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.stem.solvers.stochastic.impl.StochasticImpl <em>Stochastic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.solvers.stochastic.impl.StochasticImpl
	 * @see org.eclipse.stem.solvers.stochastic.impl.StochasticPackageImpl#getStochastic()
	 * @generated
	 */
	int STOCHASTIC = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC__URI = SolverPackage.SOLVER__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC__TYPE_URI = SolverPackage.SOLVER__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC__DUBLIN_CORE = SolverPackage.SOLVER__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Partitioner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC__PARTITIONER = SolverPackage.SOLVER__PARTITIONER;

	/**
	 * The feature id for the '<em><b>Canonical Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC__CANONICAL_GRAPH = SolverPackage.SOLVER__CANONICAL_GRAPH;

	/**
	 * The number of structural features of the '<em>Stochastic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCHASTIC_FEATURE_COUNT = SolverPackage.SOLVER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.solvers.stochastic.impl.StandardStochasticImpl <em>Standard Stochastic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.solvers.stochastic.impl.StandardStochasticImpl
	 * @see org.eclipse.stem.solvers.stochastic.impl.StochasticPackageImpl#getStandardStochastic()
	 * @generated
	 */
	int STANDARD_STOCHASTIC = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_STOCHASTIC__URI = STOCHASTIC__URI;

	/**
	 * The feature id for the '<em><b>Type URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_STOCHASTIC__TYPE_URI = STOCHASTIC__TYPE_URI;

	/**
	 * The feature id for the '<em><b>Dublin Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_STOCHASTIC__DUBLIN_CORE = STOCHASTIC__DUBLIN_CORE;

	/**
	 * The feature id for the '<em><b>Partitioner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_STOCHASTIC__PARTITIONER = STOCHASTIC__PARTITIONER;

	/**
	 * The feature id for the '<em><b>Canonical Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_STOCHASTIC__CANONICAL_GRAPH = STOCHASTIC__CANONICAL_GRAPH;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_STOCHASTIC__SEED = STOCHASTIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Randomize Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_STOCHASTIC__RANDOMIZE_SEED = STOCHASTIC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Standard Stochastic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_STOCHASTIC_FEATURE_COUNT = STOCHASTIC_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.solvers.stochastic.Stochastic <em>Stochastic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stochastic</em>'.
	 * @see org.eclipse.stem.solvers.stochastic.Stochastic
	 * @generated
	 */
	EClass getStochastic();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.solvers.stochastic.StandardStochastic <em>Standard Stochastic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Stochastic</em>'.
	 * @see org.eclipse.stem.solvers.stochastic.StandardStochastic
	 * @generated
	 */
	EClass getStandardStochastic();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.solvers.stochastic.StandardStochastic#getSeed <em>Seed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seed</em>'.
	 * @see org.eclipse.stem.solvers.stochastic.StandardStochastic#getSeed()
	 * @see #getStandardStochastic()
	 * @generated
	 */
	EAttribute getStandardStochastic_Seed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.solvers.stochastic.StandardStochastic#isRandomizeSeed <em>Randomize Seed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Randomize Seed</em>'.
	 * @see org.eclipse.stem.solvers.stochastic.StandardStochastic#isRandomizeSeed()
	 * @see #getStandardStochastic()
	 * @generated
	 */
	EAttribute getStandardStochastic_RandomizeSeed();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StochasticFactory getStochasticFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.stem.solvers.stochastic.impl.StochasticImpl <em>Stochastic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.solvers.stochastic.impl.StochasticImpl
		 * @see org.eclipse.stem.solvers.stochastic.impl.StochasticPackageImpl#getStochastic()
		 * @generated
		 */
		EClass STOCHASTIC = eINSTANCE.getStochastic();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.solvers.stochastic.impl.StandardStochasticImpl <em>Standard Stochastic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.solvers.stochastic.impl.StandardStochasticImpl
		 * @see org.eclipse.stem.solvers.stochastic.impl.StochasticPackageImpl#getStandardStochastic()
		 * @generated
		 */
		EClass STANDARD_STOCHASTIC = eINSTANCE.getStandardStochastic();

		/**
		 * The meta object literal for the '<em><b>Seed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_STOCHASTIC__SEED = eINSTANCE.getStandardStochastic_Seed();

		/**
		 * The meta object literal for the '<em><b>Randomize Seed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_STOCHASTIC__RANDOMIZE_SEED = eINSTANCE.getStandardStochastic_RandomizeSeed();

	}

} //StochasticPackage
