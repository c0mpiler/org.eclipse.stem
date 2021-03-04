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
package org.eclipse.stem.model.ui.editor.vismodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.stem.model.ui.editor.vismodel.VisualMetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface VisualMetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vismodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/stem/model/vmm.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.stem.model.vmm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VisualMetamodelPackage eINSTANCE = org.eclipse.stem.model.ui.editor.vismodel.impl.VisualMetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.stem.model.ui.editor.vismodel.impl.VisualElementImpl <em>Visual Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.model.ui.editor.vismodel.impl.VisualElementImpl
	 * @see org.eclipse.stem.model.ui.editor.vismodel.impl.VisualMetamodelPackageImpl#getVisualElement()
	 * @generated
	 */
	int VISUAL_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Visual Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.model.ui.editor.vismodel.impl.LineElementImpl <em>Line Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.model.ui.editor.vismodel.impl.LineElementImpl
	 * @see org.eclipse.stem.model.ui.editor.vismodel.impl.VisualMetamodelPackageImpl#getLineElement()
	 * @generated
	 */
	int LINE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_ELEMENT__STYLE = VISUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Line Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_ELEMENT_FEATURE_COUNT = VISUAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.model.ui.editor.vismodel.impl.RectangleElementImpl <em>Rectangle Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.model.ui.editor.vismodel.impl.RectangleElementImpl
	 * @see org.eclipse.stem.model.ui.editor.vismodel.impl.VisualMetamodelPackageImpl#getRectangleElement()
	 * @generated
	 */
	int RECTANGLE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_ELEMENT__COLOR = VISUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_ELEMENT__X = VISUAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_ELEMENT__Y = VISUAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_ELEMENT__WIDTH = VISUAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_ELEMENT__HEIGHT = VISUAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Rectangle Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_ELEMENT_FEATURE_COUNT = VISUAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.model.ui.editor.vismodel.impl.ConnectorElementImpl <em>Connector Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.model.ui.editor.vismodel.impl.ConnectorElementImpl
	 * @see org.eclipse.stem.model.ui.editor.vismodel.impl.VisualMetamodelPackageImpl#getConnectorElement()
	 * @generated
	 */
	int CONNECTOR_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_ELEMENT__STYLE = LINE_ELEMENT__STYLE;

	/**
	 * The number of structural features of the '<em>Connector Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_ELEMENT_FEATURE_COUNT = LINE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.model.ui.editor.vismodel.impl.CanvasPackageImpl <em>Canvas Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.model.ui.editor.vismodel.impl.CanvasPackageImpl
	 * @see org.eclipse.stem.model.ui.editor.vismodel.impl.VisualMetamodelPackageImpl#getCanvasPackage()
	 * @generated
	 */
	int CANVAS_PACKAGE = 4;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_PACKAGE__MODEL_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_PACKAGE__METAMODEL = 1;

	/**
	 * The number of structural features of the '<em>Canvas Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_PACKAGE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.model.ui.editor.vismodel.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.model.ui.editor.vismodel.impl.ModelElementImpl
	 * @see org.eclipse.stem.model.ui.editor.vismodel.impl.VisualMetamodelPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__MODEL = VISUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Compartment Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__COMPARTMENT_ELEMENTS = VISUAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transition Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__TRANSITION_ELEMENTS = VISUAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Canvas</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__CANVAS = VISUAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = VISUAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.model.ui.editor.vismodel.impl.CompartmentElementImpl <em>Compartment Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.model.ui.editor.vismodel.impl.CompartmentElementImpl
	 * @see org.eclipse.stem.model.ui.editor.vismodel.impl.VisualMetamodelPackageImpl#getCompartmentElement()
	 * @generated
	 */
	int COMPARTMENT_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_ELEMENT__COLOR = RECTANGLE_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_ELEMENT__X = RECTANGLE_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_ELEMENT__Y = RECTANGLE_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_ELEMENT__WIDTH = RECTANGLE_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_ELEMENT__HEIGHT = RECTANGLE_ELEMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Compartment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_ELEMENT__COMPARTMENT = RECTANGLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_ELEMENT__MODEL_ELEMENT = RECTANGLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Compartment Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_ELEMENT_FEATURE_COUNT = RECTANGLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.stem.model.ui.editor.vismodel.impl.TransitionElementImpl <em>Transition Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.model.ui.editor.vismodel.impl.TransitionElementImpl
	 * @see org.eclipse.stem.model.ui.editor.vismodel.impl.VisualMetamodelPackageImpl#getTransitionElement()
	 * @generated
	 */
	int TRANSITION_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ELEMENT__STYLE = CONNECTOR_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ELEMENT__SOURCE = CONNECTOR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ELEMENT__TARGET = CONNECTOR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ELEMENT__TRANSITION = CONNECTOR_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ELEMENT__MODEL_ELEMENT = CONNECTOR_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Transition Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ELEMENT_FEATURE_COUNT = CONNECTOR_ELEMENT_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.model.ui.editor.vismodel.VisualElement <em>Visual Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visual Element</em>'.
	 * @see org.eclipse.stem.model.ui.editor.vismodel.VisualElement
	 * @generated
	 */
	EClass getVisualElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.model.ui.editor.vismodel.LineElement <em>Line Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Element</em>'.
	 * @see org.eclipse.stem.model.ui.editor.vismodel.LineElement
	 * @generated
	 */
	EClass getLineElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.ui.editor.vismodel.LineElement#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.stem.model.ui.editor.vismodel.LineElement#getStyle()
	 * @see #getLineElement()
	 * @generated
	 */
	EAttribute getLineElement_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.model.ui.editor.vismodel.RectangleElement <em>Rectangle Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangle Element</em>'.
	 * @see org.eclipse.stem.model.ui.editor.vismodel.RectangleElement
	 * @generated
	 */
	EClass getRectangleElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.ui.editor.vismodel.RectangleElement#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.eclipse.stem.model.ui.editor.vismodel.RectangleElement#getColor()
	 * @see #getRectangleElement()
	 * @generated
	 */
	EAttribute getRectangleElement_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.ui.editor.vismodel.RectangleElement#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.eclipse.stem.model.ui.editor.vismodel.RectangleElement#getX()
	 * @see #getRectangleElement()
	 * @generated
	 */
	EAttribute getRectangleElement_X();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.ui.editor.vismodel.RectangleElement#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.eclipse.stem.model.ui.editor.vismodel.RectangleElement#getY()
	 * @see #getRectangleElement()
	 * @generated
	 */
	EAttribute getRectangleElement_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.ui.editor.vismodel.RectangleElement#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.stem.model.ui.editor.vismodel.RectangleElement#getWidth()
	 * @see #getRectangleElement()
	 * @generated
	 */
	EAttribute getRectangleElement_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stem.model.ui.editor.vismodel.RectangleElement#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.eclipse.stem.model.ui.editor.vismodel.RectangleElement#getHeight()
	 * @see #getRectangleElement()
	 * @generated
	 */
	EAttribute getRectangleElement_Height();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.model.ui.editor.vismodel.ConnectorElement <em>Connector Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Element</em>'.
	 * @see org.eclipse.stem.model.ui.editor.vismodel.ConnectorElement
	 * @generated
	 */
	EClass getConnectorElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.model.ui.editor.vismodel.CanvasPackage <em>Canvas Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Canvas Package</em>'.
	 * @see org.eclipse.stem.model.ui.editor.vismodel.CanvasPackage
	 * @generated
	 */
	EClass getCanvasPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.stem.model.ui.editor.vismodel.CanvasPackage#getModelElements <em>Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Elements</em>'.
	 * @see org.eclipse.stem.model.ui.editor.vismodel.CanvasPackage#getModelElements()
	 * @see #getCanvasPackage()
	 * @generated
	 */
	EReference getCanvasPackage_ModelElements();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.model.ui.editor.vismodel.CanvasPackage#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metamodel</em>'.
	 * @see org.eclipse.stem.model.ui.editor.vismodel.CanvasPackage#getMetamodel()
	 * @see #getCanvasPackage()
	 * @generated
	 */
	EReference getCanvasPackage_Metamodel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.model.ui.editor.vismodel.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see org.eclipse.stem.model.ui.editor.vismodel.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.model.ui.editor.vismodel.ModelElement#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see org.eclipse.stem.model.ui.editor.vismodel.ModelElement#getModel()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Model();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.stem.model.ui.editor.vismodel.ModelElement#getCompartmentElements <em>Compartment Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compartment Elements</em>'.
	 * @see org.eclipse.stem.model.ui.editor.vismodel.ModelElement#getCompartmentElements()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_CompartmentElements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.stem.model.ui.editor.vismodel.ModelElement#getTransitionElements <em>Transition Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition Elements</em>'.
	 * @see org.eclipse.stem.model.ui.editor.vismodel.ModelElement#getTransitionElements()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_TransitionElements();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.stem.model.ui.editor.vismodel.ModelElement#getCanvas <em>Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Canvas</em>'.
	 * @see org.eclipse.stem.model.ui.editor.vismodel.ModelElement#getCanvas()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Canvas();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.model.ui.editor.vismodel.CompartmentElement <em>Compartment Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compartment Element</em>'.
	 * @see org.eclipse.stem.model.ui.editor.vismodel.CompartmentElement
	 * @generated
	 */
	EClass getCompartmentElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.model.ui.editor.vismodel.CompartmentElement#getCompartment <em>Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Compartment</em>'.
	 * @see org.eclipse.stem.model.ui.editor.vismodel.CompartmentElement#getCompartment()
	 * @see #getCompartmentElement()
	 * @generated
	 */
	EReference getCompartmentElement_Compartment();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.stem.model.ui.editor.vismodel.CompartmentElement#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model Element</em>'.
	 * @see org.eclipse.stem.model.ui.editor.vismodel.CompartmentElement#getModelElement()
	 * @see #getCompartmentElement()
	 * @generated
	 */
	EReference getCompartmentElement_ModelElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stem.model.ui.editor.vismodel.TransitionElement <em>Transition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Element</em>'.
	 * @see org.eclipse.stem.model.ui.editor.vismodel.TransitionElement
	 * @generated
	 */
	EClass getTransitionElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.model.ui.editor.vismodel.TransitionElement#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.stem.model.ui.editor.vismodel.TransitionElement#getSource()
	 * @see #getTransitionElement()
	 * @generated
	 */
	EReference getTransitionElement_Source();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.model.ui.editor.vismodel.TransitionElement#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.stem.model.ui.editor.vismodel.TransitionElement#getTarget()
	 * @see #getTransitionElement()
	 * @generated
	 */
	EReference getTransitionElement_Target();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stem.model.ui.editor.vismodel.TransitionElement#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition</em>'.
	 * @see org.eclipse.stem.model.ui.editor.vismodel.TransitionElement#getTransition()
	 * @see #getTransitionElement()
	 * @generated
	 */
	EReference getTransitionElement_Transition();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.stem.model.ui.editor.vismodel.TransitionElement#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model Element</em>'.
	 * @see org.eclipse.stem.model.ui.editor.vismodel.TransitionElement#getModelElement()
	 * @see #getTransitionElement()
	 * @generated
	 */
	EReference getTransitionElement_ModelElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VisualMetamodelFactory getVisualMetamodelFactory();

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
		 * The meta object literal for the '{@link org.eclipse.stem.model.ui.editor.vismodel.impl.VisualElementImpl <em>Visual Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.model.ui.editor.vismodel.impl.VisualElementImpl
		 * @see org.eclipse.stem.model.ui.editor.vismodel.impl.VisualMetamodelPackageImpl#getVisualElement()
		 * @generated
		 */
		EClass VISUAL_ELEMENT = eINSTANCE.getVisualElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.model.ui.editor.vismodel.impl.LineElementImpl <em>Line Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.model.ui.editor.vismodel.impl.LineElementImpl
		 * @see org.eclipse.stem.model.ui.editor.vismodel.impl.VisualMetamodelPackageImpl#getLineElement()
		 * @generated
		 */
		EClass LINE_ELEMENT = eINSTANCE.getLineElement();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_ELEMENT__STYLE = eINSTANCE.getLineElement_Style();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.model.ui.editor.vismodel.impl.RectangleElementImpl <em>Rectangle Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.model.ui.editor.vismodel.impl.RectangleElementImpl
		 * @see org.eclipse.stem.model.ui.editor.vismodel.impl.VisualMetamodelPackageImpl#getRectangleElement()
		 * @generated
		 */
		EClass RECTANGLE_ELEMENT = eINSTANCE.getRectangleElement();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE_ELEMENT__COLOR = eINSTANCE.getRectangleElement_Color();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE_ELEMENT__X = eINSTANCE.getRectangleElement_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE_ELEMENT__Y = eINSTANCE.getRectangleElement_Y();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE_ELEMENT__WIDTH = eINSTANCE.getRectangleElement_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE_ELEMENT__HEIGHT = eINSTANCE.getRectangleElement_Height();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.model.ui.editor.vismodel.impl.ConnectorElementImpl <em>Connector Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.model.ui.editor.vismodel.impl.ConnectorElementImpl
		 * @see org.eclipse.stem.model.ui.editor.vismodel.impl.VisualMetamodelPackageImpl#getConnectorElement()
		 * @generated
		 */
		EClass CONNECTOR_ELEMENT = eINSTANCE.getConnectorElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.model.ui.editor.vismodel.impl.CanvasPackageImpl <em>Canvas Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.model.ui.editor.vismodel.impl.CanvasPackageImpl
		 * @see org.eclipse.stem.model.ui.editor.vismodel.impl.VisualMetamodelPackageImpl#getCanvasPackage()
		 * @generated
		 */
		EClass CANVAS_PACKAGE = eINSTANCE.getCanvasPackage();

		/**
		 * The meta object literal for the '<em><b>Model Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANVAS_PACKAGE__MODEL_ELEMENTS = eINSTANCE.getCanvasPackage_ModelElements();

		/**
		 * The meta object literal for the '<em><b>Metamodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANVAS_PACKAGE__METAMODEL = eINSTANCE.getCanvasPackage_Metamodel();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.model.ui.editor.vismodel.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.model.ui.editor.vismodel.impl.ModelElementImpl
		 * @see org.eclipse.stem.model.ui.editor.vismodel.impl.VisualMetamodelPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__MODEL = eINSTANCE.getModelElement_Model();

		/**
		 * The meta object literal for the '<em><b>Compartment Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__COMPARTMENT_ELEMENTS = eINSTANCE.getModelElement_CompartmentElements();

		/**
		 * The meta object literal for the '<em><b>Transition Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__TRANSITION_ELEMENTS = eINSTANCE.getModelElement_TransitionElements();

		/**
		 * The meta object literal for the '<em><b>Canvas</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__CANVAS = eINSTANCE.getModelElement_Canvas();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.model.ui.editor.vismodel.impl.CompartmentElementImpl <em>Compartment Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.model.ui.editor.vismodel.impl.CompartmentElementImpl
		 * @see org.eclipse.stem.model.ui.editor.vismodel.impl.VisualMetamodelPackageImpl#getCompartmentElement()
		 * @generated
		 */
		EClass COMPARTMENT_ELEMENT = eINSTANCE.getCompartmentElement();

		/**
		 * The meta object literal for the '<em><b>Compartment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARTMENT_ELEMENT__COMPARTMENT = eINSTANCE.getCompartmentElement_Compartment();

		/**
		 * The meta object literal for the '<em><b>Model Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARTMENT_ELEMENT__MODEL_ELEMENT = eINSTANCE.getCompartmentElement_ModelElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.stem.model.ui.editor.vismodel.impl.TransitionElementImpl <em>Transition Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stem.model.ui.editor.vismodel.impl.TransitionElementImpl
		 * @see org.eclipse.stem.model.ui.editor.vismodel.impl.VisualMetamodelPackageImpl#getTransitionElement()
		 * @generated
		 */
		EClass TRANSITION_ELEMENT = eINSTANCE.getTransitionElement();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_ELEMENT__SOURCE = eINSTANCE.getTransitionElement_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_ELEMENT__TARGET = eINSTANCE.getTransitionElement_Target();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_ELEMENT__TRANSITION = eINSTANCE.getTransitionElement_Transition();

		/**
		 * The meta object literal for the '<em><b>Model Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_ELEMENT__MODEL_ELEMENT = eINSTANCE.getTransitionElement_ModelElement();

	}

} //VisualMetamodelPackage
