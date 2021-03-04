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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.stem.model.metamodel.MetamodelPackage;

import org.eclipse.stem.model.ui.editor.vismodel.CanvasPackage;
import org.eclipse.stem.model.ui.editor.vismodel.CompartmentElement;
import org.eclipse.stem.model.ui.editor.vismodel.ConnectorElement;
import org.eclipse.stem.model.ui.editor.vismodel.LineElement;
import org.eclipse.stem.model.ui.editor.vismodel.ModelElement;
import org.eclipse.stem.model.ui.editor.vismodel.RectangleElement;
import org.eclipse.stem.model.ui.editor.vismodel.TransitionElement;
import org.eclipse.stem.model.ui.editor.vismodel.VisualElement;
import org.eclipse.stem.model.ui.editor.vismodel.VisualMetamodelFactory;
import org.eclipse.stem.model.ui.editor.vismodel.VisualMetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VisualMetamodelPackageImpl extends EPackageImpl implements VisualMetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visualElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectangleElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass canvasPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compartmentElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionElementEClass = null;

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
	 * @see org.eclipse.stem.model.ui.editor.vismodel.VisualMetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VisualMetamodelPackageImpl() {
		super(eNS_URI, VisualMetamodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VisualMetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VisualMetamodelPackage init() {
		if (isInited) return (VisualMetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(VisualMetamodelPackage.eNS_URI);

		// Obtain or create and register package
		VisualMetamodelPackageImpl theVisualMetamodelPackage = (VisualMetamodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VisualMetamodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VisualMetamodelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MetamodelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theVisualMetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theVisualMetamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVisualMetamodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VisualMetamodelPackage.eNS_URI, theVisualMetamodelPackage);
		return theVisualMetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisualElement() {
		return visualElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineElement() {
		return lineElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineElement_Style() {
		return (EAttribute)lineElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRectangleElement() {
		return rectangleElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangleElement_Color() {
		return (EAttribute)rectangleElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangleElement_X() {
		return (EAttribute)rectangleElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangleElement_Y() {
		return (EAttribute)rectangleElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangleElement_Width() {
		return (EAttribute)rectangleElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangleElement_Height() {
		return (EAttribute)rectangleElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorElement() {
		return connectorElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCanvasPackage() {
		return canvasPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCanvasPackage_ModelElements() {
		return (EReference)canvasPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCanvasPackage_Metamodel() {
		return (EReference)canvasPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_Model() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_CompartmentElements() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_TransitionElements() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_Canvas() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompartmentElement() {
		return compartmentElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentElement_Compartment() {
		return (EReference)compartmentElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentElement_ModelElement() {
		return (EReference)compartmentElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionElement() {
		return transitionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitionElement_Source() {
		return (EReference)transitionElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitionElement_Target() {
		return (EReference)transitionElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitionElement_Transition() {
		return (EReference)transitionElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitionElement_ModelElement() {
		return (EReference)transitionElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualMetamodelFactory getVisualMetamodelFactory() {
		return (VisualMetamodelFactory)getEFactoryInstance();
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
		visualElementEClass = createEClass(VISUAL_ELEMENT);

		lineElementEClass = createEClass(LINE_ELEMENT);
		createEAttribute(lineElementEClass, LINE_ELEMENT__STYLE);

		rectangleElementEClass = createEClass(RECTANGLE_ELEMENT);
		createEAttribute(rectangleElementEClass, RECTANGLE_ELEMENT__COLOR);
		createEAttribute(rectangleElementEClass, RECTANGLE_ELEMENT__X);
		createEAttribute(rectangleElementEClass, RECTANGLE_ELEMENT__Y);
		createEAttribute(rectangleElementEClass, RECTANGLE_ELEMENT__WIDTH);
		createEAttribute(rectangleElementEClass, RECTANGLE_ELEMENT__HEIGHT);

		connectorElementEClass = createEClass(CONNECTOR_ELEMENT);

		canvasPackageEClass = createEClass(CANVAS_PACKAGE);
		createEReference(canvasPackageEClass, CANVAS_PACKAGE__MODEL_ELEMENTS);
		createEReference(canvasPackageEClass, CANVAS_PACKAGE__METAMODEL);

		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEReference(modelElementEClass, MODEL_ELEMENT__MODEL);
		createEReference(modelElementEClass, MODEL_ELEMENT__COMPARTMENT_ELEMENTS);
		createEReference(modelElementEClass, MODEL_ELEMENT__TRANSITION_ELEMENTS);
		createEReference(modelElementEClass, MODEL_ELEMENT__CANVAS);

		compartmentElementEClass = createEClass(COMPARTMENT_ELEMENT);
		createEReference(compartmentElementEClass, COMPARTMENT_ELEMENT__COMPARTMENT);
		createEReference(compartmentElementEClass, COMPARTMENT_ELEMENT__MODEL_ELEMENT);

		transitionElementEClass = createEClass(TRANSITION_ELEMENT);
		createEReference(transitionElementEClass, TRANSITION_ELEMENT__SOURCE);
		createEReference(transitionElementEClass, TRANSITION_ELEMENT__TARGET);
		createEReference(transitionElementEClass, TRANSITION_ELEMENT__TRANSITION);
		createEReference(transitionElementEClass, TRANSITION_ELEMENT__MODEL_ELEMENT);
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
		MetamodelPackage theMetamodelPackage = (MetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(MetamodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		lineElementEClass.getESuperTypes().add(this.getVisualElement());
		rectangleElementEClass.getESuperTypes().add(this.getVisualElement());
		connectorElementEClass.getESuperTypes().add(this.getLineElement());
		modelElementEClass.getESuperTypes().add(this.getVisualElement());
		compartmentElementEClass.getESuperTypes().add(this.getRectangleElement());
		transitionElementEClass.getESuperTypes().add(this.getConnectorElement());

		// Initialize classes and features; add operations and parameters
		initEClass(visualElementEClass, VisualElement.class, "VisualElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lineElementEClass, LineElement.class, "LineElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLineElement_Style(), ecorePackage.getEInt(), "style", "0", 0, 1, LineElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rectangleElementEClass, RectangleElement.class, "RectangleElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRectangleElement_Color(), ecorePackage.getEInt(), "color", "0", 0, 1, RectangleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangleElement_X(), ecorePackage.getEInt(), "x", "0", 0, 1, RectangleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangleElement_Y(), ecorePackage.getEInt(), "y", "0", 0, 1, RectangleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangleElement_Width(), ecorePackage.getEInt(), "width", "0", 0, 1, RectangleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangleElement_Height(), ecorePackage.getEInt(), "height", "0", 0, 1, RectangleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorElementEClass, ConnectorElement.class, "ConnectorElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(canvasPackageEClass, CanvasPackage.class, "CanvasPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCanvasPackage_ModelElements(), this.getModelElement(), this.getModelElement_Canvas(), "modelElements", null, 0, -1, CanvasPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCanvasPackage_Metamodel(), theMetamodelPackage.getPackage(), null, "metamodel", null, 0, 1, CanvasPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementEClass, ModelElement.class, "ModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelElement_Model(), theMetamodelPackage.getModel(), null, "model", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_CompartmentElements(), this.getCompartmentElement(), this.getCompartmentElement_ModelElement(), "compartmentElements", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_TransitionElements(), this.getTransitionElement(), this.getTransitionElement_ModelElement(), "transitionElements", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_Canvas(), this.getCanvasPackage(), this.getCanvasPackage_ModelElements(), "canvas", null, 0, 1, ModelElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(modelElementEClass, null, "addCompartment", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompartmentElement(), "compartment", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(modelElementEClass, null, "removeCompartment", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompartmentElement(), "compartment", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(compartmentElementEClass, CompartmentElement.class, "CompartmentElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompartmentElement_Compartment(), theMetamodelPackage.getCompartment(), null, "compartment", null, 0, 1, CompartmentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompartmentElement_ModelElement(), this.getModelElement(), this.getModelElement_CompartmentElements(), "modelElement", null, 0, 1, CompartmentElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(compartmentElementEClass, this.getTransitionElement(), "getSourceTransitions", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(compartmentElementEClass, this.getTransitionElement(), "getTargetTransitions", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(compartmentElementEClass, ecorePackage.getEBoolean(), "isInherited", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionElementEClass, TransitionElement.class, "TransitionElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransitionElement_Source(), this.getCompartmentElement(), null, "source", null, 0, 1, TransitionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransitionElement_Target(), this.getCompartmentElement(), null, "target", null, 0, 1, TransitionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransitionElement_Transition(), theMetamodelPackage.getTransition(), null, "transition", null, 0, 1, TransitionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransitionElement_ModelElement(), this.getModelElement(), this.getModelElement_TransitionElements(), "modelElement", null, 0, 1, TransitionElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //VisualMetamodelPackageImpl
