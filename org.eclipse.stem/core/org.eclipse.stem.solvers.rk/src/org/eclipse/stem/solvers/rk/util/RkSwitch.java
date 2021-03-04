package org.eclipse.stem.solvers.rk.util;


import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.common.SanityChecker;
import org.eclipse.stem.core.solver.Solver;
import org.eclipse.stem.solvers.rk.ApacheCommonsMathODESolver;
import org.eclipse.stem.solvers.rk.DormandPrince54;
import org.eclipse.stem.solvers.rk.DormandPrince853;
import org.eclipse.stem.solvers.rk.FastRungeKutta;
import org.eclipse.stem.solvers.rk.GraggBulirschStoer;
import org.eclipse.stem.solvers.rk.HighamHall54;
import org.eclipse.stem.solvers.rk.RkPackage;
import org.eclipse.stem.solvers.rk.RungeKutta;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.stem.solvers.rk.RkPackage
 * @generated
 */
public class RkSwitch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RkPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RkSwitch() {
		if (modelPackage == null) {
			modelPackage = RkPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T1 doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T1 doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RkPackage.RUNGE_KUTTA: {
				RungeKutta rungeKutta = (RungeKutta)theEObject;
				T1 result = caseRungeKutta(rungeKutta);
				if (result == null) result = caseSolver(rungeKutta);
				if (result == null) result = caseIdentifiable(rungeKutta);
				if (result == null) result = caseComparable(rungeKutta);
				if (result == null) result = caseSanityChecker(rungeKutta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RkPackage.DORMAND_PRINCE853: {
				DormandPrince853 dormandPrince853 = (DormandPrince853)theEObject;
				T1 result = caseDormandPrince853(dormandPrince853);
				if (result == null) result = caseApacheCommonsMathODESolver(dormandPrince853);
				if (result == null) result = caseSolver(dormandPrince853);
				if (result == null) result = caseIdentifiable(dormandPrince853);
				if (result == null) result = caseComparable(dormandPrince853);
				if (result == null) result = caseSanityChecker(dormandPrince853);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RkPackage.APACHE_COMMONS_MATH_ODE_SOLVER: {
				ApacheCommonsMathODESolver apacheCommonsMathODESolver = (ApacheCommonsMathODESolver)theEObject;
				T1 result = caseApacheCommonsMathODESolver(apacheCommonsMathODESolver);
				if (result == null) result = caseSolver(apacheCommonsMathODESolver);
				if (result == null) result = caseIdentifiable(apacheCommonsMathODESolver);
				if (result == null) result = caseComparable(apacheCommonsMathODESolver);
				if (result == null) result = caseSanityChecker(apacheCommonsMathODESolver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RkPackage.DORMAND_PRINCE54: {
				DormandPrince54 dormandPrince54 = (DormandPrince54)theEObject;
				T1 result = caseDormandPrince54(dormandPrince54);
				if (result == null) result = caseApacheCommonsMathODESolver(dormandPrince54);
				if (result == null) result = caseSolver(dormandPrince54);
				if (result == null) result = caseIdentifiable(dormandPrince54);
				if (result == null) result = caseComparable(dormandPrince54);
				if (result == null) result = caseSanityChecker(dormandPrince54);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RkPackage.FAST_RUNGE_KUTTA: {
				FastRungeKutta fastRungeKutta = (FastRungeKutta)theEObject;
				T1 result = caseFastRungeKutta(fastRungeKutta);
				if (result == null) result = caseSolver(fastRungeKutta);
				if (result == null) result = caseIdentifiable(fastRungeKutta);
				if (result == null) result = caseComparable(fastRungeKutta);
				if (result == null) result = caseSanityChecker(fastRungeKutta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RkPackage.GRAGG_BULIRSCH_STOER: {
				GraggBulirschStoer graggBulirschStoer = (GraggBulirschStoer)theEObject;
				T1 result = caseGraggBulirschStoer(graggBulirschStoer);
				if (result == null) result = caseApacheCommonsMathODESolver(graggBulirschStoer);
				if (result == null) result = caseSolver(graggBulirschStoer);
				if (result == null) result = caseIdentifiable(graggBulirschStoer);
				if (result == null) result = caseComparable(graggBulirschStoer);
				if (result == null) result = caseSanityChecker(graggBulirschStoer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RkPackage.HIGHAM_HALL54: {
				HighamHall54 highamHall54 = (HighamHall54)theEObject;
				T1 result = caseHighamHall54(highamHall54);
				if (result == null) result = caseApacheCommonsMathODESolver(highamHall54);
				if (result == null) result = caseSolver(highamHall54);
				if (result == null) result = caseIdentifiable(highamHall54);
				if (result == null) result = caseComparable(highamHall54);
				if (result == null) result = caseSanityChecker(highamHall54);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runge Kutta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runge Kutta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRungeKutta(RungeKutta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dormand Prince853</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dormand Prince853</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDormandPrince853(DormandPrince853 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apache Commons Math ODE Solver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apache Commons Math ODE Solver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseApacheCommonsMathODESolver(ApacheCommonsMathODESolver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dormand Prince54</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dormand Prince54</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDormandPrince54(DormandPrince54 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fast Runge Kutta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fast Runge Kutta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFastRungeKutta(FastRungeKutta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gragg Bulirsch Stoer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gragg Bulirsch Stoer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGraggBulirschStoer(GraggBulirschStoer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Higham Hall54</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Higham Hall54</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseHighamHall54(HighamHall54 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseComparable(Comparable<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sanity Checker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sanity Checker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSanityChecker(SanityChecker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIdentifiable(Identifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSolver(Solver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T1 defaultCase(EObject object) {
		return null;
	}

} //RkSwitch