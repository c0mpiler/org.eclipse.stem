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
package org.eclipse.stem.model.ctdl.functions.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition;
import org.eclipse.stem.model.ctdl.functions.ExternalFunctionsPackage;
import org.eclipse.stem.model.ctdl.functions.FunctionArgument;
import org.eclipse.stem.model.ctdl.functions.FunctionArgumentReference;
import org.eclipse.stem.model.ctdl.functions.JavaMethodArgument;
import org.eclipse.stem.model.ctdl.functions.SystemArgumentReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionsPackage
 * @generated
 */
public class ExternalFunctionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExternalFunctionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalFunctionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExternalFunctionsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalFunctionsSwitch<Adapter> modelSwitch =
		new ExternalFunctionsSwitch<Adapter>() {
			@Override
			public Adapter caseExternalFunctionDefinition(ExternalFunctionDefinition object) {
				return createExternalFunctionDefinitionAdapter();
			}
			@Override
			public Adapter caseFunctionArgument(FunctionArgument object) {
				return createFunctionArgumentAdapter();
			}
			@Override
			public Adapter caseJavaMethodArgument(JavaMethodArgument object) {
				return createJavaMethodArgumentAdapter();
			}
			@Override
			public Adapter caseSystemArgumentReference(SystemArgumentReference object) {
				return createSystemArgumentReferenceAdapter();
			}
			@Override
			public Adapter caseFunctionArgumentReference(FunctionArgumentReference object) {
				return createFunctionArgumentReferenceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition <em>External Function Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.model.ctdl.functions.ExternalFunctionDefinition
	 * @generated
	 */
	public Adapter createExternalFunctionDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.model.ctdl.functions.FunctionArgument <em>Function Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.model.ctdl.functions.FunctionArgument
	 * @generated
	 */
	public Adapter createFunctionArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.model.ctdl.functions.JavaMethodArgument <em>Java Method Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.model.ctdl.functions.JavaMethodArgument
	 * @generated
	 */
	public Adapter createJavaMethodArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.model.ctdl.functions.SystemArgumentReference <em>System Argument Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.model.ctdl.functions.SystemArgumentReference
	 * @generated
	 */
	public Adapter createSystemArgumentReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.model.ctdl.functions.FunctionArgumentReference <em>Function Argument Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.model.ctdl.functions.FunctionArgumentReference
	 * @generated
	 */
	public Adapter createFunctionArgumentReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ExternalFunctionsAdapterFactory