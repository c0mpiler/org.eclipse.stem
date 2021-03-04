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
package org.eclipse.stem.model.ui.editor.vismodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.stem.model.ui.editor.vismodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VisualMetamodelFactoryImpl extends EFactoryImpl implements VisualMetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VisualMetamodelFactory init() {
		try {
			VisualMetamodelFactory theVisualMetamodelFactory = (VisualMetamodelFactory)EPackage.Registry.INSTANCE.getEFactory("http:///org/eclipse/stem/model/vmm.ecore"); 
			if (theVisualMetamodelFactory != null) {
				return theVisualMetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VisualMetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualMetamodelFactoryImpl() {
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
			case VisualMetamodelPackage.LINE_ELEMENT: return createLineElement();
			case VisualMetamodelPackage.CONNECTOR_ELEMENT: return createConnectorElement();
			case VisualMetamodelPackage.CANVAS_PACKAGE: return createCanvasPackage();
			case VisualMetamodelPackage.MODEL_ELEMENT: return createModelElement();
			case VisualMetamodelPackage.COMPARTMENT_ELEMENT: return createCompartmentElement();
			case VisualMetamodelPackage.TRANSITION_ELEMENT: return createTransitionElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineElement createLineElement() {
		LineElementImpl lineElement = new LineElementImpl();
		return lineElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorElement createConnectorElement() {
		ConnectorElementImpl connectorElement = new ConnectorElementImpl();
		return connectorElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanvasPackage createCanvasPackage() {
		CanvasPackageImpl canvasPackage = new CanvasPackageImpl();
		return canvasPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement createModelElement() {
		ModelElementImpl modelElement = new ModelElementImpl();
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentElement createCompartmentElement() {
		CompartmentElementImpl compartmentElement = new CompartmentElementImpl();
		return compartmentElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionElement createTransitionElement() {
		TransitionElementImpl transitionElement = new TransitionElementImpl();
		return transitionElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualMetamodelPackage getVisualMetamodelPackage() {
		return (VisualMetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VisualMetamodelPackage getPackage() {
		return VisualMetamodelPackage.eINSTANCE;
	}

} //VisualMetamodelFactoryImpl
