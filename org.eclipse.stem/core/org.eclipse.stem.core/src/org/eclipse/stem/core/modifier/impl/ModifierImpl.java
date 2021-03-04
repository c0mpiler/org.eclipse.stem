package org.eclipse.stem.core.modifier.impl;

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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.stem.core.CorePlugin;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.graph.Edge;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.Label;
import org.eclipse.stem.core.graph.LabelValue;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.model.Model;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.model.impl.DecoratorImpl;
import org.eclipse.stem.core.modifier.FeatureModifier;
import org.eclipse.stem.core.modifier.Modifier;
import org.eclipse.stem.core.modifier.ModifierPackage;
import org.eclipse.stem.core.scenario.Scenario;
import org.eclipse.stem.core.scenario.ScenarioInitializationException;
import org.eclipse.stem.core.trigger.Trigger;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Modifier</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.core.modifier.impl.ModifierImpl#getTargetURI <em>Target URI</em>}</li>
 *   <li>{@link org.eclipse.stem.core.modifier.impl.ModifierImpl#getFeatureModifiers <em>Feature Modifiers</em>}</li>
 *   <li>{@link org.eclipse.stem.core.modifier.impl.ModifierImpl#isComplete <em>Complete</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModifierImpl extends DecoratorImpl implements Modifier {
	/**
	 * The default value of the '{@link #getTargetURI() <em>Target URI</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTargetURI()
	 * @generated
	 * @ordered
	 */
	protected static final URI TARGET_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetURI() <em>Target URI</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTargetURI()
	 * @generated
	 * @ordered
	 */
	protected URI targetURI = TARGET_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeatureModifiers()
	 * <em>Feature Modifiers</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFeatureModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureModifier> featureModifiers;

	// set to true when there's an error
	private boolean complete = false;


	/**
	 * The default value of the '{@link #isComplete() <em>Complete</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isComplete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMPLETE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected ModifierImpl() {
		super();
		setURI(STEMURI.createURI(URI_TYPE_MODIFIER_SEGMENT + "/"
				+  STEMURI.generateUniquePart()));
		setTypeURI(STEMURI.MODIFIER_TYPE_URI);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModifierPackage.Literals.MODIFIER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public URI getTargetURI() {
		return targetURI;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetURI(URI newTargetURI) {
		URI oldTargetURI = targetURI;
		targetURI = newTargetURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModifierPackage.MODIFIER__TARGET_URI, oldTargetURI, targetURI));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureModifier> getFeatureModifiers() {
		if (featureModifiers == null) {
			featureModifiers = new EObjectContainmentEList<FeatureModifier>(FeatureModifier.class, this, ModifierPackage.MODIFIER__FEATURE_MODIFIERS);
		}
		return featureModifiers;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isComplete() {

		if (complete) {
			// Yes
			return true;
		} // if

		boolean retValue = true;

		for (FeatureModifier featureModifier : getFeatureModifiers()) {
			retValue = featureModifier.isComplete();
			// Found one that's false?
			if (!retValue) {
				// Yes
				break;
			} // if
		} // for each FeatureModifier
		return retValue;
	} // isComplete


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void resetTarget(EObject target) {
		for (FeatureModifier featureModifier : getFeatureModifiers()) {
			if (target instanceof Label) {
				// If a node contains the label, and the node has children, we traverse down
				final Label l = (Label)target;
				if(l.getIdentifiable() instanceof Node) {
					resetNodeLabelTarget(featureModifier, (Node)l.getIdentifiable(), l.getClass());
					continue;
				}
			} 
			EObject t = target;
			if(t instanceof Label)
				t = ((Label)t).getCurrentValue();
			featureModifier.setTarget(t);
			featureModifier.reset();
		} // for each FeatureModifier
	}
	

	private void resetNodeLabelTarget(FeatureModifier featureModifier, Node n, Class<?> labelClass) {
		
		Set<Node> children = getChildSet(n);
		if(children.size() == 0) { // No children, we're done
			for(Label lab:n.getLabels()) {
				if(lab.getClass() == labelClass) {// Check if this is okay. I think it is
					featureModifier.setTarget(lab.getCurrentValue());
					featureModifier.reset();
					break;
				}
			}
		} else for(Node child:children)  {
			resetNodeLabelTarget(featureModifier, child, labelClass);
		}
	}
	
	/**
	 * @see org.eclipse.stem.core.model.impl.DecoratorImpl#resetLabels()
	 */
	@Override
	public void resetLabels() {
		Graph g = getGraph();
		if(g != null) {
			EObject target = getTarget(g);
			if(target != null) 
				resetTarget(target);
		} else {
			for (FeatureModifier featureModifier : getFeatureModifiers()) {
				featureModifier.reset();
			} // for each FeatureModifier
		}
	}

	/**
	 * @see org.eclipse.stem.core.model.impl.DecoratorImpl#decorateGraph()
	 */
	@Override
	public void decorateGraph(STEMTime time) throws ScenarioInitializationException{
		// Nothing
	} // decorateGraph

	/**
	 * @see org.eclipse.stem.core.model.impl.DecoratorImpl#updateLabels(org.eclipse.stem.core.model.STEMTime,
	 *      long)
	 *      
	 *  Only invoked by triggers
	 */
	@Override
	public void updateLabels(STEMTime time, long timerPeriod, int cycle) {
		EObject target = getTarget(getGraph());
		if(target != null) {
			modifyTarget(target);
//			Commented out. The code was used to force inoculators to re-inoculate the population. ControlLabels are used to handle this now instead			
//			if(target instanceof Decorator) {
//				((Decorator)target).setGraphDecorated(false);
//				((Decorator)target).decorateGraph(time);
//				((Decorator)target).setGraphDecorated(true);
//			}
		}
	} // updateLabels

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void updateScenario(final Scenario scenario) {
		EObject t = getTarget(scenario);
		if(t == null)
			CorePlugin.logError("Modifier "+this.getURI()+" cannot find target "+getTargetURI()+" in scenario "+scenario.getURI(), new Exception());
		else modifyTarget(t);
	} // updateScenario

	

	private EObject getTarget(final Scenario scenario) {
		EObject retValue = null;
		// Sequencer?
		if (scenario.getSequencer().getURI().equals(getTargetURI())) {
			// Yes
			retValue = scenario.getSequencer();
		} // if
		else {
			
			// No
				// We've done the easy stuff
				retValue = getTarget(scenario.getModel());
	
		} // else not a Scenario decorator
		
		if (retValue == null) {
			// Is this an infector or inoculator or
			// initializer
			for(Decorator d:scenario.getScenarioDecorators()) 
				if(d.getURI().equals(getTargetURI()))
					return d;
				// Is this a FeatureModifier
				else if(d instanceof Trigger) {
					Trigger tg = (Trigger)d;
					// We don't modify triggers. However it's possible to modify feature modifiers inside triggers
					for(Decorator d2:tg.getActions()) 
						if(d2 instanceof Modifier) {
							Modifier m = (Modifier)d2;
							if(m.getURI().equals(getTargetURI().trimQuery())) {
								int index = Integer.parseInt(getTargetURI().query());
								return m.getFeatureModifiers().get(index);
							}
						}
				}
		}
		return retValue;
	} // getIdentifiable

	private EObject getTarget(final Model model) {
		EObject retValue = null;
		for (Decorator decorator : model.getNodeDecorators()) {
			// Our target?
			if (decorator.getURI().equals(getTargetURI())) {
				// Yes
				retValue = decorator;
				break;
			} // if
			
		} // for each Decorator

		if(retValue == null)
			for(Model m:model.getModels()) {
				retValue = getTarget(m);
				if(retValue != null) break;
			}
		
		// A Node label?
		if (retValue == null) {
			for(Graph g:model.getGraphs()) {
				retValue = findNodeLabel(g);
				if(retValue != null) break;
			}
		} // if retValue == null

		// An Edge Label?
		if (retValue == null) {
			for(Graph g:model.getGraphs()) {
				retValue = findEdgeLabel(g);
				if(retValue != null) break;
			}
		} // if retValue == null
		return retValue;
	} 
	
	private EObject getTarget(final Graph graph) {
		EObject retValue = null;
		for (Decorator decorator : graph.getDecorators()) {
			// Our target?
			if (decorator.getURI().equals(getTargetURI())) {
				// Yes
				retValue = decorator;
				break;
			} // if
			
			// A feature modifier
			if(decorator instanceof Trigger) {
				Trigger tg = (Trigger)decorator;
				for(Decorator a:tg.getActions()) {
					if(a.getURI().equals(getTargetURI())) {
						URI tURI = getTargetURI();
						
					}
				}
			}
			
		} // for each Decorator

		// A Node label?
		if(retValue == null) retValue = findNodeLabel(graph);
		if(retValue == null) retValue = findEdgeLabel(graph);
		
		
		
		
		if(retValue == null) 
			CorePlugin.logError("Unable to find target to modify having URI "+getTargetURI(), new Exception());
		return retValue;
	} // getIdentifiable


	private EObject findNodeLabel(Graph g) {
		for (NodeLabel nodeLabel : g.getNodeLabels().values()) {
			// Our target?
			if (nodeLabel.getURI().equals(getTargetURI())) {
				// Yes
				return  nodeLabel;
			} // if
		} // for each Node Label
		return null;
		
	}
	
	private EObject findEdgeLabel(Graph g) {
		for (Edge edge : g.getEdges().values()) {
			// Our target?
			if (edge.getLabel().getURI().equals(getTargetURI())) {
				// Yes
				return edge.getLabel();
			} // if
		} // for each Edge
		return null;
	}
	
	private void modifyTarget(EObject target) {
		// Yes
		for (FeatureModifier featureModifier : getFeatureModifiers()) {
				
			// If the Identifiable is a label, then the feature we
			// are modifying could be in the current label value. If it is
			// we need to adjust the target of the feature modifier.
			// 
			if (target instanceof Label) {
				// If a node contains the label, and the node has children, we traverse down
				final Label l = (Label)target;
				if(l.getIdentifiable() instanceof Node) {
					modifyNodeLabelTarget(featureModifier, (Node)l.getIdentifiable(), l.getClass());
					continue;
				}
				else target = l.getCurrentValue();
			}
			featureModifier.setTarget(target);
			featureModifier.updateFeature();
		} // for each FeatureModifier
	} // modifyIdentifiable

	private void modifyNodeLabelTarget(FeatureModifier featureModifier, Node n, Class<?> labelClass) {
		
		Set<Node> children = getChildSet(n);
		if(children.size() == 0) { // No children, we're done
			for(Label lab:n.getLabels()) {
				if(lab.getClass() == labelClass) {// Check if this is okay. I think it is
					LabelValue target = lab.getCurrentValue();
					featureModifier.setTarget(target);
					featureModifier.updateFeature();
					break;
				}
			}
		} else for(Node child:children)  {
			modifyNodeLabelTarget(featureModifier, child, labelClass);
		}
	}
	
	/**
	 * finds all the direct child nodes of a parent and returns them in a set.
	 * The method is simular to the method in LocationUtility, but we cannot 
	 * check the RelativePhysicalRelationshipLabelValue due to project dependencies.
	 * 
	 * Depend only on the length of the ID of the other URI to establish parent/child
	 * relationship instead
	 * 
	 * @param parent
	 */
	public static Set<Node> getChildSet(Node parent) {
		Set<Node> children = new HashSet<Node>();
		if(parent == null) return children;
		String parentID = parent.getURI().lastSegment();
		//RelativePhysicalRelationshipLabelValue
		EList<Edge> allEdges = parent.getEdges();
		for (int i = 0; i < allEdges.size(); i ++) {
			Edge e = allEdges.get(i);
			
			Node neighborNode = e.getOtherNode(parent);
			String neighborID= neighborNode.getURI().lastSegment();
			// is it really a child
			if(neighborID.length() > parentID.length() || parentID.equals("ZZZ")) {
				//yes
				children.add(neighborNode);
			}// is containment relationship
		}// for all edges
		//just to be sure
		children.remove(parent);
		return children;
	}
	/**
	 * Look inside the decorators for the target. This is to find string values and
	 * double values. 
	 * @param eobj
	 * @param target
	 * @return EObject the target if found, otherwise null
	 */
	public EObject deepFindChildren(EObject eobj, EObject target) {
		if(eobj.equals(target)) return eobj;
		for(EObject eo:eobj.eContents()) {
			deepFindChildren(eo, target);
		}
		return null;
	}
	/**
	 * @see org.eclipse.stem.core.modifier.Modifier#getModificationSummary()
	 */
	public List<String> getModificationSummary() {
		final List<String> retValue = new ArrayList<String>();
		for (FeatureModifier featureModifier : getFeatureModifiers()) {
			retValue.add(featureModifier.getModificationSummary());
		} // for each FeatureModifier
		return retValue;
	} // getModificationSummary

	/**
	 * @see org.eclipse.stem.core.common.impl.IdentifiableImpl#sane()
	 */
	@Override
	public boolean sane() {
		boolean retValue = super.sane();
		assert retValue;

		/*
		 * This is commented out because of the difficulty of dynamically
		 * creating a test object that is derived from Identifable. So the test
		 * object doesn't have a URI. See MonitorTest#createTestPackage()
		 */
		// retValue = retValue && targetURI != null;
		// assert retValue;
		for (FeatureModifier featureModifier : getFeatureModifiers()) {
			retValue = retValue && featureModifier.sane();
			assert retValue;
		} // for each FeatureModifier
		return retValue;
	} // sane

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModifierPackage.MODIFIER__FEATURE_MODIFIERS:
				return ((InternalEList<?>)getFeatureModifiers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("boxing")
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModifierPackage.MODIFIER__TARGET_URI:
				return getTargetURI();
			case ModifierPackage.MODIFIER__FEATURE_MODIFIERS:
				return getFeatureModifiers();
			case ModifierPackage.MODIFIER__COMPLETE:
				return isComplete();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModifierPackage.MODIFIER__TARGET_URI:
				setTargetURI((URI)newValue);
				return;
			case ModifierPackage.MODIFIER__FEATURE_MODIFIERS:
				getFeatureModifiers().clear();
				getFeatureModifiers().addAll((Collection<? extends FeatureModifier>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModifierPackage.MODIFIER__TARGET_URI:
				setTargetURI(TARGET_URI_EDEFAULT);
				return;
			case ModifierPackage.MODIFIER__FEATURE_MODIFIERS:
				getFeatureModifiers().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModifierPackage.MODIFIER__TARGET_URI:
				return TARGET_URI_EDEFAULT == null ? targetURI != null : !TARGET_URI_EDEFAULT.equals(targetURI);
			case ModifierPackage.MODIFIER__FEATURE_MODIFIERS:
				return featureModifiers != null && !featureModifiers.isEmpty();
			case ModifierPackage.MODIFIER__COMPLETE:
				return isComplete() != COMPLETE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (targetURI: "); //$NON-NLS-1$
		result.append(targetURI);
		result.append(')');
		return result.toString();
	}

} // ModifierImpl
