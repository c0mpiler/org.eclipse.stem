package org.eclipse.stem.core.solver.impl;

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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.common.impl.IdentifiableImpl;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.GraphPartitioner;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.solver.Solver;
import org.eclipse.stem.core.solver.SolverException;
import org.eclipse.stem.core.solver.SolverPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.core.solver.impl.SolverImpl#getPartitioner <em>Partitioner</em>}</li>
 *   <li>{@link org.eclipse.stem.core.solver.impl.SolverImpl#getCanonicalGraph <em>Canonical Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SolverImpl extends IdentifiableImpl implements Solver {
	/**
	 * The cached value of the '{@link #getPartitioner() <em>Partitioner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitioner()
	 * @generated
	 * @ordered
	 */
	protected GraphPartitioner partitioner;

	/**
	 * The cached value of the '{@link #getCanonicalGraph() <em>Canonical Graph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanonicalGraph()
	 * @generated
	 * @ordered
	 */
	protected Graph canonicalGraph;

	private boolean initialized;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected SolverImpl() {
		super();
		this.setTypeURI(STEMURI.SOLVER_TYPE_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.SOLVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isInitialized() {
		return this.initialized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setInitialized(boolean newInitialized) {
		this.initialized = newInitialized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphPartitioner getPartitioner() {
		if (partitioner != null && partitioner.eIsProxy()) {
			InternalEObject oldPartitioner = (InternalEObject)partitioner;
			partitioner = (GraphPartitioner)eResolveProxy(oldPartitioner);
			if (partitioner != oldPartitioner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolverPackage.SOLVER__PARTITIONER, oldPartitioner, partitioner));
			}
		}
		return partitioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphPartitioner basicGetPartitioner() {
		return partitioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitioner(GraphPartitioner newPartitioner) {
		GraphPartitioner oldPartitioner = partitioner;
		partitioner = newPartitioner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__PARTITIONER, oldPartitioner, partitioner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph getCanonicalGraph() {
		return canonicalGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCanonicalGraph(Graph newCanonicalGraph, NotificationChain msgs) {
		Graph oldCanonicalGraph = canonicalGraph;
		canonicalGraph = newCanonicalGraph;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__CANONICAL_GRAPH, oldCanonicalGraph, newCanonicalGraph);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanonicalGraph(Graph newCanonicalGraph) {
		if (newCanonicalGraph != canonicalGraph) {
			NotificationChain msgs = null;
			if (canonicalGraph != null)
				msgs = ((InternalEObject)canonicalGraph).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SolverPackage.SOLVER__CANONICAL_GRAPH, null, msgs);
			if (newCanonicalGraph != null)
				msgs = ((InternalEObject)newCanonicalGraph).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SolverPackage.SOLVER__CANONICAL_GRAPH, null, msgs);
			msgs = basicSetCanonicalGraph(newCanonicalGraph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLVER__CANONICAL_GRAPH, newCanonicalGraph, newCanonicalGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean step(STEMTime time, long timeDelta, int cycle) throws SolverException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reset() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolverPackage.SOLVER__CANONICAL_GRAPH:
				return basicSetCanonicalGraph(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * initialize before simulation begins. Rewind/forward any population model
	 * values to the start time of the sequencer
	 * @param time
	 */
	/*
	public void initialize(STEMTime time, GraphPartitioner p) {
		this.partitioner = p;
		
		EList<Decorator> redoList = new BasicEList<Decorator>();
		
		boolean redo = false;
		for(Decorator d:this.getCanonicalGraph().getDecorators()) {
			if(d instanceof IntegrationDecorator) {
				EList<DynamicLabel> labels = d.getLabelsToUpdate();
				for(DynamicLabel l:labels) {
					if(l instanceof IntegrationLabel) {
						IntegrationLabel il = (IntegrationLabel)l;
						il.reset(time);
						if(((IntegrationLabelValue)il.getDeltaValue()).getArrivals().size() > 0 ||
								((IntegrationLabelValue)il.getDeltaValue()).getDepartures().size() > 0)
							redo = true;
					}
				}
			}
			if(!redo)redoList.add(d);
		}
		// Fix decorators with unapplied deltas
		if(redo) {
			for(Decorator d:redoList) {
				if(d instanceof IntegrationDecorator) {
					EList<DynamicLabel> labels = d.getLabelsToUpdate();
					for(DynamicLabel l:labels) {
						if(l instanceof IntegrationLabel) {
							IntegrationLabel il = (IntegrationLabel)l;
							il.reset(time);
						}
					}
				}
			}
		}
		
		this.setInitialized(true);
	}
	*/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverPackage.SOLVER__PARTITIONER:
				if (resolve) return getPartitioner();
				return basicGetPartitioner();
			case SolverPackage.SOLVER__CANONICAL_GRAPH:
				return getCanonicalGraph();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SolverPackage.SOLVER__PARTITIONER:
				setPartitioner((GraphPartitioner)newValue);
				return;
			case SolverPackage.SOLVER__CANONICAL_GRAPH:
				setCanonicalGraph((Graph)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SolverPackage.SOLVER__PARTITIONER:
				setPartitioner((GraphPartitioner)null);
				return;
			case SolverPackage.SOLVER__CANONICAL_GRAPH:
				setCanonicalGraph((Graph)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SolverPackage.SOLVER__PARTITIONER:
				return partitioner != null;
			case SolverPackage.SOLVER__CANONICAL_GRAPH:
				return canonicalGraph != null;
		}
		return super.eIsSet(featureID);
	}

} //SolverImpl
