package org.eclipse.stem.solvers.rk.impl;

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

import org.apache.commons.math3.ode.FirstOrderIntegrator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.stem.core.common.CommonPackage;
import org.eclipse.stem.core.graph.GraphPackage;
import org.eclipse.stem.core.logger.LoggerPackage;
import org.eclipse.stem.core.model.ModelPackage;
import org.eclipse.stem.core.modifier.ModifierPackage;
import org.eclipse.stem.core.scenario.ScenarioPackage;
import org.eclipse.stem.core.sequencer.SequencerPackage;
import org.eclipse.stem.core.solver.SolverPackage;
import org.eclipse.stem.solvers.rk.ApacheCommonsMathODESolver;
import org.eclipse.stem.solvers.rk.DormandPrince54;
import org.eclipse.stem.solvers.rk.DormandPrince853;
import org.eclipse.stem.solvers.rk.FastRungeKutta;
import org.eclipse.stem.solvers.rk.GraggBulirschStoer;
import org.eclipse.stem.solvers.rk.HighamHall54;
import org.eclipse.stem.solvers.rk.RkFactory;
import org.eclipse.stem.solvers.rk.RkPackage;
import org.eclipse.stem.solvers.rk.RungeKutta;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RkPackageImpl extends EPackageImpl implements RkPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rungeKuttaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dormandPrince853EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apacheCommonsMathODESolverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dormandPrince54EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fastRungeKuttaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graggBulirschStoerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass highamHall54EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType firstOrderIntegratorEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.stem.solvers.rk.RkPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RkPackageImpl() {
		super(eNS_URI, RkFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RkPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RkPackage init() {
		if (isInited) return (RkPackage)EPackage.Registry.INSTANCE.getEPackage(RkPackage.eNS_URI);

		// Obtain or create and register package
		RkPackageImpl theRkPackage = (RkPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RkPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RkPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CommonPackage.eINSTANCE.eClass();
		GraphPackage.eINSTANCE.eClass();
		ModelPackage.eINSTANCE.eClass();
		ModifierPackage.eINSTANCE.eClass();
		ScenarioPackage.eINSTANCE.eClass();
		SequencerPackage.eINSTANCE.eClass();
		SolverPackage.eINSTANCE.eClass();
		LoggerPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRkPackage.createPackageContents();

		// Initialize created meta-data
		theRkPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRkPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RkPackage.eNS_URI, theRkPackage);
		return theRkPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRungeKutta() {
		return rungeKuttaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRungeKutta_RelativeTolerance() {
		return (EAttribute)rungeKuttaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRungeKutta_MinStep() {
		return (EAttribute)rungeKuttaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDormandPrince853() {
		return dormandPrince853EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDormandPrince853_RelativeTolerance() {
		return (EAttribute)dormandPrince853EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDormandPrince853_AbsoluteTolerance() {
		return (EAttribute)dormandPrince853EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDormandPrince853_MinStep() {
		return (EAttribute)dormandPrince853EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDormandPrince853_MaxStep() {
		return (EAttribute)dormandPrince853EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApacheCommonsMathODESolver() {
		return apacheCommonsMathODESolverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDormandPrince54() {
		return dormandPrince54EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDormandPrince54_RelativeTolerance() {
		return (EAttribute)dormandPrince54EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDormandPrince54_AbsoluteTolerance() {
		return (EAttribute)dormandPrince54EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDormandPrince54_MinStep() {
		return (EAttribute)dormandPrince54EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDormandPrince54_MaxStep() {
		return (EAttribute)dormandPrince54EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFastRungeKutta() {
		return fastRungeKuttaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFastRungeKutta_RelativeTolerance() {
		return (EAttribute)fastRungeKuttaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFastRungeKutta_MinStep() {
		return (EAttribute)fastRungeKuttaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraggBulirschStoer() {
		return graggBulirschStoerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraggBulirschStoer_RelativeTolerance() {
		return (EAttribute)graggBulirschStoerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraggBulirschStoer_AbsoluteTolerance() {
		return (EAttribute)graggBulirschStoerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraggBulirschStoer_MinStep() {
		return (EAttribute)graggBulirschStoerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraggBulirschStoer_MaxStep() {
		return (EAttribute)graggBulirschStoerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHighamHall54() {
		return highamHall54EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHighamHall54_RelativeTolerance() {
		return (EAttribute)highamHall54EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHighamHall54_AbsoluteTolerance() {
		return (EAttribute)highamHall54EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHighamHall54_MinStep() {
		return (EAttribute)highamHall54EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHighamHall54_MaxStep() {
		return (EAttribute)highamHall54EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFirstOrderIntegrator() {
		return firstOrderIntegratorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RkFactory getRkFactory() {
		return (RkFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		rungeKuttaEClass = createEClass(RUNGE_KUTTA);
		createEAttribute(rungeKuttaEClass, RUNGE_KUTTA__RELATIVE_TOLERANCE);
		createEAttribute(rungeKuttaEClass, RUNGE_KUTTA__MIN_STEP);

		dormandPrince853EClass = createEClass(DORMAND_PRINCE853);
		createEAttribute(dormandPrince853EClass, DORMAND_PRINCE853__RELATIVE_TOLERANCE);
		createEAttribute(dormandPrince853EClass, DORMAND_PRINCE853__ABSOLUTE_TOLERANCE);
		createEAttribute(dormandPrince853EClass, DORMAND_PRINCE853__MIN_STEP);
		createEAttribute(dormandPrince853EClass, DORMAND_PRINCE853__MAX_STEP);

		apacheCommonsMathODESolverEClass = createEClass(APACHE_COMMONS_MATH_ODE_SOLVER);

		dormandPrince54EClass = createEClass(DORMAND_PRINCE54);
		createEAttribute(dormandPrince54EClass, DORMAND_PRINCE54__RELATIVE_TOLERANCE);
		createEAttribute(dormandPrince54EClass, DORMAND_PRINCE54__ABSOLUTE_TOLERANCE);
		createEAttribute(dormandPrince54EClass, DORMAND_PRINCE54__MIN_STEP);
		createEAttribute(dormandPrince54EClass, DORMAND_PRINCE54__MAX_STEP);

		fastRungeKuttaEClass = createEClass(FAST_RUNGE_KUTTA);
		createEAttribute(fastRungeKuttaEClass, FAST_RUNGE_KUTTA__RELATIVE_TOLERANCE);
		createEAttribute(fastRungeKuttaEClass, FAST_RUNGE_KUTTA__MIN_STEP);

		graggBulirschStoerEClass = createEClass(GRAGG_BULIRSCH_STOER);
		createEAttribute(graggBulirschStoerEClass, GRAGG_BULIRSCH_STOER__RELATIVE_TOLERANCE);
		createEAttribute(graggBulirschStoerEClass, GRAGG_BULIRSCH_STOER__ABSOLUTE_TOLERANCE);
		createEAttribute(graggBulirschStoerEClass, GRAGG_BULIRSCH_STOER__MIN_STEP);
		createEAttribute(graggBulirschStoerEClass, GRAGG_BULIRSCH_STOER__MAX_STEP);

		highamHall54EClass = createEClass(HIGHAM_HALL54);
		createEAttribute(highamHall54EClass, HIGHAM_HALL54__RELATIVE_TOLERANCE);
		createEAttribute(highamHall54EClass, HIGHAM_HALL54__ABSOLUTE_TOLERANCE);
		createEAttribute(highamHall54EClass, HIGHAM_HALL54__MIN_STEP);
		createEAttribute(highamHall54EClass, HIGHAM_HALL54__MAX_STEP);

		// Create data types
		firstOrderIntegratorEDataType = createEDataType(FIRST_ORDER_INTEGRATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SolverPackage theSolverPackage = (SolverPackage)EPackage.Registry.INSTANCE.getEPackage(SolverPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rungeKuttaEClass.getESuperTypes().add(theSolverPackage.getSolver());
		dormandPrince853EClass.getESuperTypes().add(this.getApacheCommonsMathODESolver());
		apacheCommonsMathODESolverEClass.getESuperTypes().add(theSolverPackage.getSolver());
		dormandPrince54EClass.getESuperTypes().add(this.getApacheCommonsMathODESolver());
		fastRungeKuttaEClass.getESuperTypes().add(theSolverPackage.getSolver());
		graggBulirschStoerEClass.getESuperTypes().add(this.getApacheCommonsMathODESolver());
		highamHall54EClass.getESuperTypes().add(this.getApacheCommonsMathODESolver());

		// Initialize classes and features; add operations and parameters
		initEClass(rungeKuttaEClass, RungeKutta.class, "RungeKutta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRungeKutta_RelativeTolerance(), theEcorePackage.getEDouble(), "relativeTolerance", "1E-9", 0, 1, RungeKutta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRungeKutta_MinStep(), theEcorePackage.getEDouble(), "minStep", "1E-15", 0, 1, RungeKutta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dormandPrince853EClass, DormandPrince853.class, "DormandPrince853", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDormandPrince853_RelativeTolerance(), theEcorePackage.getEDouble(), "relativeTolerance", "1E-9", 0, 1, DormandPrince853.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDormandPrince853_AbsoluteTolerance(), theEcorePackage.getEDouble(), "absoluteTolerance", "1E-5", 0, 1, DormandPrince853.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDormandPrince853_MinStep(), theEcorePackage.getEDouble(), "minStep", "1E-8", 0, 1, DormandPrince853.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDormandPrince853_MaxStep(), theEcorePackage.getEDouble(), "maxStep", "1.0", 0, 1, DormandPrince853.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apacheCommonsMathODESolverEClass, ApacheCommonsMathODESolver.class, "ApacheCommonsMathODESolver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(apacheCommonsMathODESolverEClass, this.getFirstOrderIntegrator(), "createIntegrator", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dormandPrince54EClass, DormandPrince54.class, "DormandPrince54", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDormandPrince54_RelativeTolerance(), theEcorePackage.getEDouble(), "relativeTolerance", "1E-9", 0, 1, DormandPrince54.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDormandPrince54_AbsoluteTolerance(), theEcorePackage.getEDouble(), "absoluteTolerance", "1E-5", 0, 1, DormandPrince54.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDormandPrince54_MinStep(), theEcorePackage.getEDouble(), "minStep", "1E-8", 0, 1, DormandPrince54.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDormandPrince54_MaxStep(), theEcorePackage.getEDouble(), "maxStep", "1.0", 0, 1, DormandPrince54.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fastRungeKuttaEClass, FastRungeKutta.class, "FastRungeKutta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFastRungeKutta_RelativeTolerance(), theEcorePackage.getEDouble(), "relativeTolerance", "1E-9", 0, 1, FastRungeKutta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFastRungeKutta_MinStep(), theEcorePackage.getEDouble(), "minStep", "1E-15", 0, 1, FastRungeKutta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graggBulirschStoerEClass, GraggBulirschStoer.class, "GraggBulirschStoer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraggBulirschStoer_RelativeTolerance(), theEcorePackage.getEDouble(), "relativeTolerance", "1E-9", 0, 1, GraggBulirschStoer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraggBulirschStoer_AbsoluteTolerance(), theEcorePackage.getEDouble(), "absoluteTolerance", "1E-5", 0, 1, GraggBulirschStoer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraggBulirschStoer_MinStep(), theEcorePackage.getEDouble(), "minStep", "1E-8", 0, 1, GraggBulirschStoer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraggBulirschStoer_MaxStep(), theEcorePackage.getEDouble(), "maxStep", "1.0", 0, 1, GraggBulirschStoer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(highamHall54EClass, HighamHall54.class, "HighamHall54", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHighamHall54_RelativeTolerance(), theEcorePackage.getEDouble(), "relativeTolerance", "1E-9", 0, 1, HighamHall54.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHighamHall54_AbsoluteTolerance(), theEcorePackage.getEDouble(), "absoluteTolerance", "1E-5", 0, 1, HighamHall54.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHighamHall54_MinStep(), theEcorePackage.getEDouble(), "minStep", "1E-8", 0, 1, HighamHall54.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHighamHall54_MaxStep(), theEcorePackage.getEDouble(), "maxStep", "1.0", 0, 1, HighamHall54.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(firstOrderIntegratorEDataType, FirstOrderIntegrator.class, "FirstOrderIntegrator", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //RkPackageImpl
