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
package org.eclipse.stem.model.ui.editor;

import java.util.Iterator;
import java.util.List;

import org.eclipse.stem.model.common.MetamodelUtils;
import org.eclipse.stem.model.metamodel.Compartment;
import org.eclipse.stem.model.metamodel.Model;
import org.eclipse.stem.model.metamodel.Package;
import org.eclipse.stem.model.metamodel.Transition;
import org.eclipse.stem.model.ui.editor.vismodel.CanvasPackage;
import org.eclipse.stem.model.ui.editor.vismodel.CompartmentElement;
import org.eclipse.stem.model.ui.editor.vismodel.ModelElement;
import org.eclipse.stem.model.ui.editor.vismodel.TransitionElement;
import org.eclipse.stem.model.ui.editor.vismodel.VisualMetamodelFactory;

public class VisualModelReconciler 
{
	final static VisualMetamodelFactory FACTORY = VisualMetamodelFactory.eINSTANCE;
	
	public static int DEFAULT_X_MARGIN = 5;
	public static int DEFAULT_Y_MARGIN = 5;
	public static int DEFAULT_WIDTH = 75;
	public static int DEFAULT_HEIGHT = 75;
	public static int DEFAULT_X_SPACING = DEFAULT_WIDTH + 30;
	public static int DEFAULT_Y_SPACING = 0;
	
	private Package metamodel;
	private CanvasPackage vismodel;
	
	private boolean vismodelChanged = false;
	
	public VisualModelReconciler(Package metamodel, CanvasPackage vismodel)
	{
		this.metamodel = metamodel;
		this.vismodel = vismodel;
	}
	
	private void flagVismodelChange() {
		vismodelChanged = true;
	}
	
	public boolean isVismodelChanged() {
		return vismodelChanged;
	}
	
	public void reconcile() {
		reconcileMetamodel();
		reconcileVismodel();
	}
	
	private ModelElement findElementForModel(Model m) {
		for (ModelElement me : vismodel.getModelElements()) {
			if (me.getModel() == m) {
				return me;
			}
		}
		return null;
	}
	
	private CompartmentElement findElementForCompartment(ModelElement me, Compartment c) {
		for (CompartmentElement ce : me.getCompartmentElements()) {
			if (ce.getCompartment() == c) {
				return ce;
			}
		}
		return null;
	}
	
	private TransitionElement findElementForTransition(ModelElement me, Transition t) {
		for (TransitionElement te : me.getTransitionElements()) {
			if (te.getTransition() == t) {
				return te;
			}
		}
		return null;
	}
	
	private void reconcileVismodel() {
		Iterator<ModelElement> iter = vismodel.getModelElements().iterator();
		while (iter.hasNext()) {
			ModelElement me = iter.next();
			if (me.getModel() != null) {
				reconcileModelElement(me);
			} else {
				iter.remove();
				flagVismodelChange();
			}
		}
	}
	
	private void reconcileModelElement(ModelElement me) {
		reconcileCompartmentElements(me);
		reconcileTransitionElements(me);
	}
	
	private void reconcileCompartmentElements(ModelElement me) {
		Iterator<CompartmentElement> iter = me.getCompartmentElements().iterator();
		while (iter.hasNext()) {
			CompartmentElement ce = iter.next();
			if (ce.getCompartment() == null ||
					ce.getCompartment().eIsProxy()) {
				iter.remove();
				flagVismodelChange();
			}
		}
	}
	
	private void reconcileTransitionElements(ModelElement me) {
		Iterator<TransitionElement> iter = me.getTransitionElements().iterator();
		while (iter.hasNext()) {
			TransitionElement te = iter.next();
			if (te.getTransition() == null) {
				iter.remove();
				flagVismodelChange();
			}
		}
	}
	
	private void reconcileMetamodel() {
		for (Model m : metamodel.getModels()) {
			reconcileModel(m);
		}
	}
	
	private void reconcileModel(Model m) {
		ModelElement me = findElementForModel(m);
		if (me == null) {
			me = initializeModelElement(m);
			vismodel.getModelElements().add(me);
			flagVismodelChange();
		}
		reconcileCompartments(me,m);
		reconcileTransitions(me,m);
	}
	
	private void reconcileCompartments(ModelElement me, Model m) {
		int x = DEFAULT_X_MARGIN;
		int y = DEFAULT_Y_MARGIN;
		
		List<Compartment> compartments = MetamodelUtils.getAllCompartmentsForModel(m);
		for (final Compartment compartment : compartments) {
			CompartmentElement ce = findElementForCompartment(me, compartment);
			if (ce == null) {
				ce = createCompartmentElement(me, compartment, x, y);
				me.getCompartmentElements().add(ce);
				flagVismodelChange();
				x += DEFAULT_X_SPACING;
				y += DEFAULT_Y_SPACING;
				//me.eResource().getContents().add(ce);
			}
		}
	}
	
	private void reconcileTransitions(ModelElement me, Model m) {
		for (final Transition transition : m.getTransitions()) {
			TransitionElement te = findElementForTransition(me, transition);
			if (te == null) {
				te = createTransitionElement(me, transition);
				me.getTransitionElements().add(te);
				flagVismodelChange();
				//me.eResource().getContents().add(te);
			}
		}		
	}
	
	public static CanvasPackage initializeForMetamodel(Package metamodel)
	{
		CanvasPackage canvasPackage = FACTORY.createCanvasPackage();
		canvasPackage.setMetamodel(metamodel);
		
		// create models
		for (Model model : metamodel.getModels()) {
			canvasPackage.getModelElements().add(initializeModelElement(model));
		}
		
		return canvasPackage;
	}
	
	public static ModelElement initializeModelElement(Model model) {
		ModelElement me = FACTORY.createModelElement();
		me.setModel(model);
		
		initializeCompartments(me);
		initializeTransitions(me);
		return me;
	}
	

	private static void initializeCompartments(ModelElement me) {
		int x = DEFAULT_X_MARGIN;
		int y = DEFAULT_Y_MARGIN;
		List<Compartment> compartments = MetamodelUtils.getAllCompartmentsForModel(me.getModel());
		for (Compartment compartment : compartments) {
			CompartmentElement ce = createCompartmentElement(me, compartment, x, y);
			me.getCompartmentElements().add(ce);
			x += DEFAULT_X_SPACING;
			y += DEFAULT_Y_SPACING;
		}
	}
	

	private static void initializeTransitions(ModelElement me) {
		List<Transition> transitions = me.getModel().getTransitions();
		for (Transition transition : transitions) {
			me.getTransitionElements().add(createTransitionElement(me, transition));
		}
	}
	
	private static CompartmentElement createCompartmentElement(ModelElement me, Compartment compartment, int x, int y) {
		CompartmentElement ce = FACTORY.createCompartmentElement();
		ce.setCompartment(compartment);
		ce.setWidth(DEFAULT_WIDTH);
		ce.setHeight(DEFAULT_HEIGHT);
		ce.setX(x);
		ce.setY(y);
		return ce;
	}
	
	private static TransitionElement createTransitionElement(ModelElement me, Transition transition) {
		TransitionElement te = FACTORY.createTransitionElement();
		te.setTransition(transition);
		te.setSource(VisualModelUtils.findCompartmentElementForCompartment(transition.getSource(), me));
		te.setTarget(VisualModelUtils.findCompartmentElementForCompartment(transition.getTarget(), me));			
		if (te.getSource() == null || te.getTarget() == null) {
			System.err.println("Could not find compartment element for source or target in transition "+ me.getModel().getName() +"/"+ transition.getName());
			return null;
		}
		return te;
	}
	
//	private Model findModelForElement(ModelElement me) {
//	for (Model model : metamodel.getModels()) {
//		if (model == me.getModel()) {
//			return model;
//		}
//	}
//	return null;
//}
//
//private Compartment findCompartmentForElement(CompartmentElement ce) {
//	Model model = ce.getModelElement().getModel();
//	for (Compartment  compartment : MetamodelUtils.getAllCompartmentsForModel(model)) {
//		if (ce.getCompartment() == compartment) {
//			return compartment;
//		}
//	}
//
//	return null;
//}
//
//private Transition findTransitionForElement(TransitionElement te) {
//	Model model = te.getModelElement().getModel();
//	for (Transition transition : model.getTransitions()) {
//		if (te.getTransition() == transition) {
//			return transition;
//		}
//	}
//
//	return null;
//}
	
}
