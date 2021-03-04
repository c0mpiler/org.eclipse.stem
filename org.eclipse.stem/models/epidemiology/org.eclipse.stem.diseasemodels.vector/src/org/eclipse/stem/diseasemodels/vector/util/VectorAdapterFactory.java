package org.eclipse.stem.diseasemodels.vector.util;

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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.common.PrimitiveTypeOperations;
import org.eclipse.stem.core.common.SanityChecker;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.DynamicNodeLabel;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.graph.IntegrationLabelValue;
import org.eclipse.stem.core.graph.Label;
import org.eclipse.stem.core.graph.LabelValue;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.model.IntegrationDecorator;
import org.eclipse.stem.core.model.NodeDecorator;
import org.eclipse.stem.core.modifier.Modifiable;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.vector.AbstractDengueModel;
import org.eclipse.stem.diseasemodels.vector.DengueModel;
import org.eclipse.stem.diseasemodels.vector.DengueModelHostLabel;
import org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue;
import org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabel;
import org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue;
import org.eclipse.stem.diseasemodels.vector.MacdonaldRossDiseaseModel;
import org.eclipse.stem.diseasemodels.vector.SimpleDengueModel;
import org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabel;
import org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue;
import org.eclipse.stem.diseasemodels.vector.VectorDiseaseModel;
import org.eclipse.stem.diseasemodels.vector.VectorPackage;
import org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage
 * @generated
 */
public class VectorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VectorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VectorPackage.eINSTANCE;
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
	protected VectorSwitch<Adapter> modelSwitch =
		new VectorSwitch<Adapter>() {
			@Override
			public Adapter caseMacdonaldRossDiseaseModel(MacdonaldRossDiseaseModel object) {
				return createMacdonaldRossDiseaseModelAdapter();
			}
			@Override
			public Adapter caseVectorDiseaseModel(VectorDiseaseModel object) {
				return createVectorDiseaseModelAdapter();
			}
			@Override
			public Adapter caseDengueModel(DengueModel object) {
				return createDengueModelAdapter();
			}
			@Override
			public Adapter caseSimpleDengueModel(SimpleDengueModel object) {
				return createSimpleDengueModelAdapter();
			}
			@Override
			public Adapter caseVerySimpleDengueModel(VerySimpleDengueModel object) {
				return createVerySimpleDengueModelAdapter();
			}
			@Override
			public Adapter caseDengueModelHostLabel(DengueModelHostLabel object) {
				return createDengueModelHostLabelAdapter();
			}
			@Override
			public Adapter caseDengueModelHostLabelValue(DengueModelHostLabelValue object) {
				return createDengueModelHostLabelValueAdapter();
			}
			@Override
			public Adapter caseDengueModelVectorLabel(DengueModelVectorLabel object) {
				return createDengueModelVectorLabelAdapter();
			}
			@Override
			public Adapter caseDengueModelVectorLabelValue(DengueModelVectorLabelValue object) {
				return createDengueModelVectorLabelValueAdapter();
			}
			@Override
			public Adapter caseAbstractDengueModel(AbstractDengueModel object) {
				return createAbstractDengueModelAdapter();
			}
			@Override
			public Adapter caseSimpleDengueModelHostLabel(SimpleDengueModelHostLabel object) {
				return createSimpleDengueModelHostLabelAdapter();
			}
			@Override
			public Adapter caseSimpleDengueModelHostLabelValue(SimpleDengueModelHostLabelValue object) {
				return createSimpleDengueModelHostLabelValueAdapter();
			}
			@Override
			public <T> Adapter caseComparable(Comparable<T> object) {
				return createComparableAdapter();
			}
			@Override
			public Adapter caseSanityChecker(SanityChecker object) {
				return createSanityCheckerAdapter();
			}
			@Override
			public Adapter caseIdentifiable(Identifiable object) {
				return createIdentifiableAdapter();
			}
			@Override
			public Adapter caseDecorator(Decorator object) {
				return createDecoratorAdapter();
			}
			@Override
			public Adapter caseNodeDecorator(NodeDecorator object) {
				return createNodeDecoratorAdapter();
			}
			@Override
			public Adapter caseIntegrationDecorator(IntegrationDecorator object) {
				return createIntegrationDecoratorAdapter();
			}
			@Override
			public Adapter caseModifiable(Modifiable object) {
				return createModifiableAdapter();
			}
			@Override
			public Adapter caseDiseaseModel(DiseaseModel object) {
				return createDiseaseModelAdapter();
			}
			@Override
			public Adapter caseStandardDiseaseModel(StandardDiseaseModel object) {
				return createStandardDiseaseModelAdapter();
			}
			@Override
			public Adapter caseLabel(Label object) {
				return createLabelAdapter();
			}
			@Override
			public Adapter caseDynamicLabel(DynamicLabel object) {
				return createDynamicLabelAdapter();
			}
			@Override
			public Adapter caseNodeLabel(NodeLabel object) {
				return createNodeLabelAdapter();
			}
			@Override
			public Adapter caseDynamicNodeLabel(DynamicNodeLabel object) {
				return createDynamicNodeLabelAdapter();
			}
			@Override
			public Adapter caseIntegrationLabel(IntegrationLabel object) {
				return createIntegrationLabelAdapter();
			}
			@Override
			public Adapter caseDiseaseModelLabel(DiseaseModelLabel object) {
				return createDiseaseModelLabelAdapter();
			}
			@Override
			public Adapter caseStandardDiseaseModelLabel(StandardDiseaseModelLabel object) {
				return createStandardDiseaseModelLabelAdapter();
			}
			@Override
			public Adapter caseLabelValue(LabelValue object) {
				return createLabelValueAdapter();
			}
			@Override
			public Adapter casePrimitiveTypeOperations(PrimitiveTypeOperations object) {
				return createPrimitiveTypeOperationsAdapter();
			}
			@Override
			public Adapter caseIntegrationLabelValue(IntegrationLabelValue object) {
				return createIntegrationLabelValueAdapter();
			}
			@Override
			public Adapter caseDiseaseModelLabelValue(DiseaseModelLabelValue object) {
				return createDiseaseModelLabelValueAdapter();
			}
			@Override
			public Adapter caseStandardDiseaseModelLabelValue(StandardDiseaseModelLabelValue object) {
				return createStandardDiseaseModelLabelValueAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.diseasemodels.vector.MacdonaldRossDiseaseModel <em>Macdonald Ross Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.diseasemodels.vector.MacdonaldRossDiseaseModel
	 * @generated
	 */
	public Adapter createMacdonaldRossDiseaseModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.diseasemodels.vector.VectorDiseaseModel <em>Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.diseasemodels.vector.VectorDiseaseModel
	 * @generated
	 */
	public Adapter createVectorDiseaseModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.diseasemodels.vector.DengueModel <em>Dengue Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModel
	 * @generated
	 */
	public Adapter createDengueModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModel <em>Simple Dengue Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModel
	 * @generated
	 */
	public Adapter createSimpleDengueModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel <em>Very Simple Dengue Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel
	 * @generated
	 */
	public Adapter createVerySimpleDengueModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLabel <em>Dengue Model Host Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelHostLabel
	 * @generated
	 */
	public Adapter createDengueModelHostLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue <em>Dengue Model Host Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue
	 * @generated
	 */
	public Adapter createDengueModelHostLabelValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabel <em>Dengue Model Vector Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabel
	 * @generated
	 */
	public Adapter createDengueModelVectorLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue <em>Dengue Model Vector Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue
	 * @generated
	 */
	public Adapter createDengueModelVectorLabelValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.diseasemodels.vector.AbstractDengueModel <em>Abstract Dengue Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.diseasemodels.vector.AbstractDengueModel
	 * @generated
	 */
	public Adapter createAbstractDengueModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabel <em>Simple Dengue Model Host Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabel
	 * @generated
	 */
	public Adapter createSimpleDengueModelHostLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue <em>Simple Dengue Model Host Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue
	 * @generated
	 */
	public Adapter createSimpleDengueModelHostLabelValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.lang.Comparable <em>Comparable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.lang.Comparable
	 * @generated
	 */
	public Adapter createComparableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.common.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.common.Identifiable
	 * @generated
	 */
	public Adapter createIdentifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.model.Decorator <em>Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.model.Decorator
	 * @generated
	 */
	public Adapter createDecoratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.model.NodeDecorator <em>Node Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.model.NodeDecorator
	 * @generated
	 */
	public Adapter createNodeDecoratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.common.SanityChecker <em>Sanity Checker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.common.SanityChecker
	 * @generated
	 */
	public Adapter createSanityCheckerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.modifier.Modifiable <em>Modifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.modifier.Modifiable
	 * @generated
	 */
	public Adapter createModifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.diseasemodels.standard.DiseaseModel <em>Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.diseasemodels.standard.DiseaseModel
	 * @generated
	 */
	public Adapter createDiseaseModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.model.IntegrationDecorator <em>Integration Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.model.IntegrationDecorator
	 * @generated
	 */
	public Adapter createIntegrationDecoratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel <em>Disease Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel
	 * @generated
	 */
	public Adapter createStandardDiseaseModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.graph.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.graph.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.graph.DynamicLabel <em>Dynamic Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.graph.DynamicLabel
	 * @generated
	 */
	public Adapter createDynamicLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.graph.NodeLabel <em>Node Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.graph.NodeLabel
	 * @generated
	 */
	public Adapter createNodeLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.graph.DynamicNodeLabel <em>Dynamic Node Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.graph.DynamicNodeLabel
	 * @generated
	 */
	public Adapter createDynamicNodeLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel <em>Disease Model Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel
	 * @generated
	 */
	public Adapter createDiseaseModelLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.graph.IntegrationLabel <em>Integration Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.graph.IntegrationLabel
	 * @generated
	 */
	public Adapter createIntegrationLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel <em>Disease Model Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel
	 * @generated
	 */
	public Adapter createStandardDiseaseModelLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.graph.LabelValue <em>Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.graph.LabelValue
	 * @generated
	 */
	public Adapter createLabelValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.common.PrimitiveTypeOperations <em>Primitive Type Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.common.PrimitiveTypeOperations
	 * @generated
	 */
	public Adapter createPrimitiveTypeOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.graph.IntegrationLabelValue <em>Integration Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.graph.IntegrationLabelValue
	 * @generated
	 */
	public Adapter createIntegrationLabelValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue <em>Disease Model Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue
	 * @generated
	 */
	public Adapter createDiseaseModelLabelValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue <em>Disease Model Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue
	 * @generated
	 */
	public Adapter createStandardDiseaseModelLabelValueAdapter() {
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

} //VectorAdapterFactory
