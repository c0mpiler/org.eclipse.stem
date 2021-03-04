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
package org.eclipse.stem.solvers.rk.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.graph.IntegrationLabelValue;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.model.IntegrationDecorator;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.model.TransformationDecorator;
import org.eclipse.stem.core.solver.SolverException;
import org.eclipse.stem.core.solver.impl.SolverImpl;
import org.eclipse.stem.core.trigger.Trigger;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.solvers.rk.FastRungeKutta;
import org.eclipse.stem.solvers.rk.RkPackage;
import org.eclipse.stem.ui.Activator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fast Runge Kutta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.solvers.rk.impl.FastRungeKuttaImpl#getRelativeTolerance <em>Relative Tolerance</em>}</li>
 *   <li>{@link org.eclipse.stem.solvers.rk.impl.FastRungeKuttaImpl#getMinStep <em>Min Step</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FastRungeKuttaImpl extends SolverImpl implements FastRungeKutta {

	// Number of threads
	private short num_threads = 2;// Preferences will override

	// Jobs
	private FastRkJob [] jobs;


	// The step size and the current position (x)
	//private double stepSize = 1.0;

	// Constants used in Runge Kutta Cash Karp 

	static double a2=0.2, a3=0.3, a4=0.6, a5=1.0, a6=0.875;
	static double b21 = 0.2, b31=3.0/40, b32=9.0/40.0, b41=0.3, b42=-0.9, b43=1.2;
	static double b51=-11.0/54.0, b52=2.5, b53=-70.0/27.0, b54=35.0/27.0, b61=1631.0/55296.0, b62=175.0/512.0, b63=575.0/13824.0, b64=44275.0/110592.0, b65=253.0/4096.0;
	static double c1 = 37.0/378.0, c3=250.0/621.0, c4=125.0/594.0, c6=512.0/1771.0;
	static double dc5 = -277.0/14336.0;
	static double dc1 = c1-2825.0/27648.0, dc3=c3-18575.0/48384.0, dc4=c4-13525.0/55296.0, dc6=c6-0.25;

	static double SAFETY=0.9, PGROW=-0.2, PSHRNK=-0.25, ERRCON=1.89E-4;
	static double TINY = 1E-30;

	ArrayList<IntegrationDecorator> iDecorators = new ArrayList<IntegrationDecorator>();

	/**
	 * The default value of the '{@link #getRelativeTolerance() <em>Relative Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeTolerance()
	 * @generated
	 * @ordered
	 */
	protected static final double RELATIVE_TOLERANCE_EDEFAULT = 1.0E-9;

	/**
	 * The cached value of the '{@link #getRelativeTolerance() <em>Relative Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeTolerance()
	 * @generated
	 * @ordered
	 */
	protected double relativeTolerance = RELATIVE_TOLERANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinStep() <em>Min Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinStep()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_STEP_EDEFAULT = 1.0E-15;

	/**
	 * The cached value of the '{@link #getMinStep() <em>Min Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinStep()
	 * @generated
	 * @ordered
	 */
	protected double minStep = MIN_STEP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public FastRungeKuttaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean step(STEMTime time, long timeDelta, int cycle) throws SolverException  {

		Activator act = org.eclipse.stem.ui.Activator.getDefault();
		if(act != null) {
			final IPreferenceStore preferenceStore = act.getPreferenceStore();
			num_threads = (short)preferenceStore.getInt(org.eclipse.stem.ui.preferences.PreferenceConstants.SIMULATION_THREADS);
		} else num_threads = 2; // Just so we can run inside junit test

		partitioner.setNumProcesses(num_threads);

		final int c = cycle;

		// Find triggers and any transformation decorator and make sure they are invoked
		for(Decorator decorator:this.getCanonicalGraph().getDecorators()) {
			if(decorator instanceof Trigger || decorator instanceof TransformationDecorator) {
				decorator.updateLabels(time, timeDelta, cycle);
			}
		}		

		// First initialize the probe and temp label values from the current
		// label values. 

		for(Decorator decorator:this.getCanonicalGraph().getDecorators()) {
			EList<DynamicLabel>allLabels = partitioner.partitionDecoratorLabels(decorator);
			for (final Iterator<DynamicLabel> currentStateLabelIter = allLabels
					.iterator(); currentStateLabelIter.hasNext();) {
				if(decorator instanceof IntegrationDecorator) {
					// It's a standard disease model with a standard disease model label
					final IntegrationLabel iLabel = (IntegrationLabel) currentStateLabelIter.next();
					((IntegrationLabelValue)iLabel.getCurrentValue()).prepareCycle();
					((IntegrationLabelValue)iLabel.getProbeValue()).set((IntegrationLabelValue)iLabel.getCurrentValue());
					((IntegrationLabelValue)iLabel.getTempValue()).set((IntegrationLabelValue)iLabel.getCurrentValue());
					
				} else currentStateLabelIter.next();
			}
		}

		if(jobs == null || jobs.length != num_threads) {
			// Initialize the jobs if not done yet or of the number of threads changes
			jobs = new FastRkJob[num_threads];

			for(short i=0;i<num_threads;++i) {
				final short threadnum = i;
				jobs[i] = new FastRkJob("Worker "+i, threadnum, this);
				jobs[i].setSystem(true);
			} // For each job
		} // If not initialized

		// Initialize
		//int thread = 0;
		for(FastRkJob j:jobs) {
			j.cycle = c;
			j.time = time;
			j.timeDelta = timeDelta;
		}
		// Schedule. Jobs can be rescheduled after finished
		for(FastRkJob j:jobs) 
			j.schedule();

		// Wait until all jobs completed
		for(FastRkJob j : jobs) {
			try {
				j.join();
				if( j.getResult().getException() != null)
					throw new SolverException(j.getResult().getException().getMessage(), null, j.getResult().getException());
			} catch(InterruptedException ie) {
				Activator.logError(ie.getMessage(), ie);
			}
		}

		return true;
	}


	/**
	 * _step Do the step for a single thread
	 * 
	 * @param time
	 * @param timeDelta
	 * @param cycle
	 * @param threadnum
	 * @return double the step size last used
	 */
	protected double _step(STEMTime time, long timeDelta, int cycle, short threadnum, double h) {

		synchronized(iDecorators) {
		if(iDecorators.isEmpty()) {
			ArrayList<Decorator> transDecorators = new ArrayList<Decorator>();

			for(Decorator d:getCanonicalGraph().getDecorators()) {
				if(d instanceof IntegrationDecorator) iDecorators.add((IntegrationDecorator)d);
				if(d instanceof TransformationDecorator) transDecorators.add(d);
			}
		}

			// x is to keep track of how far we have advanced in the solution. It is essentially
			// a double cycle representation

			double x = ((double)cycle - 1.0);

			// When x (or time) is this we're done
			double end = x+1.0;

			// Make sure we actually have labels to update
			boolean workToDo=false;
			for(int i=0;i<iDecorators.size();++i) {
				Decorator sdm = iDecorators.get(i);
				if(partitioner.partitionDecoratorLabels(sdm, threadnum).size() > 0) {workToDo=true;break;}
			}

			if(!workToDo) {
				// Just return the step size passed in
				return h;
			}

			// We use the Runge Kutta Kash Carp method to advance to the next
			// step in the simulation. Two estimates of the disease deltas
			// are calculated and compared to each other. If they differ
			// by more than a maximum error (determined by a parameter for
			// the disease model), we reduce the step size until an acceptable
			// error is reached. 

			// These are used during Runge Kutta calculations:
			Map<IntegrationLabel, IntegrationLabelValue> k1map = new HashMap<IntegrationLabel, IntegrationLabelValue>();
			Map<IntegrationLabel, IntegrationLabelValue> k2map = new HashMap<IntegrationLabel, IntegrationLabelValue>();
			Map<IntegrationLabel, IntegrationLabelValue> k3map = new HashMap<IntegrationLabel, IntegrationLabelValue>();
			Map<IntegrationLabel, IntegrationLabelValue> k4map = new HashMap<IntegrationLabel, IntegrationLabelValue>();
			Map<IntegrationLabel, IntegrationLabelValue> k5map = new HashMap<IntegrationLabel, IntegrationLabelValue>();
			Map<IntegrationLabel, IntegrationLabelValue> k6map = new HashMap<IntegrationLabel, IntegrationLabelValue>();

			// Used below as temporary place holder, one for each decorator
			Map<EClass, IntegrationLabelValue> _k1Placeholdes, _k2Placeholdes, _k3Placeholdes, _k4Placeholdes, _k5Placeholdes, _k6Placeholdes;
			_k1Placeholdes = new HashMap<EClass, IntegrationLabelValue>();
			_k2Placeholdes = new HashMap<EClass, IntegrationLabelValue>();
			_k3Placeholdes = new HashMap<EClass, IntegrationLabelValue>();
			_k4Placeholdes = new HashMap<EClass, IntegrationLabelValue>();
			_k5Placeholdes = new HashMap<EClass, IntegrationLabelValue>();
			_k6Placeholdes = new HashMap<EClass, IntegrationLabelValue>();

			// The final estimates for label values are stored here
			Map<IntegrationLabel, IntegrationLabelValue> finalEstimate = new HashMap<IntegrationLabel, IntegrationLabelValue>();

			// Delta is used to scale the step (h)
			double delta = 0.0;	
			for(int i=0;i<iDecorators.size();++i) {
				Decorator sdm = iDecorators.get(i);		
				Iterator<DynamicLabel> iter = partitioner.partitionDecoratorLabels(sdm, threadnum)
						.iterator();
				if(!iter.hasNext()) {
					Activator.logError("Problem detected: Decorator "+sdm+" had no labels to update. Please check your scenario.", new Exception());
					continue;
				}

				if (sdm instanceof DiseaseModel) {
					DiseaseModel diseaseModel = (DiseaseModel) sdm;

					for (String id : diseaseModel.getAllLabelIdentifiers()) {
						IntegrationLabel label = diseaseModel.createDiseaseModelLabel(id);

						if (!_k1Placeholdes.containsKey(label.eClass())) {
							_k1Placeholdes.put(label.eClass(), diseaseModel.createDiseaseModelLabelValue(id));
						}
						if (!_k2Placeholdes.containsKey(label.eClass())) {
							_k2Placeholdes.put(label.eClass(), diseaseModel.createDiseaseModelLabelValue(id));
						}
						if (!_k3Placeholdes.containsKey(label.eClass())) {
							_k3Placeholdes.put(label.eClass(), diseaseModel.createDiseaseModelLabelValue(id));
						}
						if (!_k4Placeholdes.containsKey(label.eClass())) {
							_k4Placeholdes.put(label.eClass(), diseaseModel.createDiseaseModelLabelValue(id));
						}
						if (!_k5Placeholdes.containsKey(label.eClass())) {
							_k5Placeholdes.put(label.eClass(), diseaseModel.createDiseaseModelLabelValue(id));
						}
						if (!_k6Placeholdes.containsKey(label.eClass())) {
							_k6Placeholdes.put(label.eClass(), diseaseModel.createDiseaseModelLabelValue(id));
						}
					}
				} else {
					IntegrationLabel firstLabel = (IntegrationLabel)iter.next();
					// Initialize temporary place holders just by creating dups of the first label available
					if (!_k1Placeholdes.containsKey(firstLabel.eClass())) {
						_k1Placeholdes.put(firstLabel.eClass(), ((IntegrationLabelValue) firstLabel.getCurrentValue()).copy());
					}
					if (!_k2Placeholdes.containsKey(firstLabel.eClass())) {
						_k2Placeholdes.put(firstLabel.eClass(), ((IntegrationLabelValue) firstLabel.getCurrentValue()).copy());
					}
					if (!_k3Placeholdes.containsKey(firstLabel.eClass())) {
						_k3Placeholdes.put(firstLabel.eClass(), ((IntegrationLabelValue) firstLabel.getCurrentValue()).copy());
					}
					if (!_k4Placeholdes.containsKey(firstLabel.eClass())) {
						_k4Placeholdes.put(firstLabel.eClass(), ((IntegrationLabelValue) firstLabel.getCurrentValue()).copy());
					}
					if (!_k5Placeholdes.containsKey(firstLabel.eClass())) {
						_k5Placeholdes.put(firstLabel.eClass(), ((IntegrationLabelValue) firstLabel.getCurrentValue()).copy());
					}
					if (!_k6Placeholdes.containsKey(firstLabel.eClass())) {
						_k6Placeholdes.put(firstLabel.eClass(), ((IntegrationLabelValue) firstLabel.getCurrentValue()).copy());
					}
				}
			}


			// This is the main loop we keep iterating over until we are done with the step
			while(x < end) {
				k1map.clear();
				k2map.clear();
				k3map.clear();
				k4map.clear();
				k5map.clear();
				k6map.clear();
				finalEstimate.clear();
				


				// ToDo: We should check if a maximum number of iterations have been
				// exceeded here and throw an error. 


				// First, get the delta values at the current state
				for(int i=0;i<iDecorators.size();++i) {
					Decorator sdm = iDecorators.get(i);
					((IntegrationDecorator)sdm).calculateDeltas(time, x, timeDelta, partitioner.partitionDecoratorLabels(sdm, threadnum));
				}
				for(int i=0;i<iDecorators.size();++i) {
					Decorator sdm = iDecorators.get(i);
					((IntegrationDecorator)sdm).applyExternalDeltas(time, x, timeDelta, partitioner.partitionDecoratorLabels(sdm, threadnum));
				}

				// Set the scaling factor for disease parameters for each decorator and location
				for(int i=0;i<iDecorators.size();++i) {
					Decorator sdm = iDecorators.get(i);
					EList<DynamicLabel>labs = partitioner.partitionDecoratorLabels(sdm, threadnum);
					for (int j=0;j<labs.size();++j) {
						final IntegrationLabel diseaseLabel = (IntegrationLabel) labs.get(j);

						IntegrationLabelValue scale = (IntegrationLabelValue)diseaseLabel.getErrorScale();
						scale.set((IntegrationLabelValue)diseaseLabel.getCurrentValue());


						IntegrationLabelValue dt = (IntegrationLabelValue)diseaseLabel.getDeltaValue().copy();
						dt.scale(h);
						dt.abs();
						dt.add(TINY);
						scale.abs();
						scale.add(dt);
					}
				}

				// Step 1 in Runge Kutta Fehlberg. 
				// Get the delta values out of each node label and
				// build a first estimate of the next value'
				for(int i=0;i<iDecorators.size();++i) {
					Decorator sdm = iDecorators.get(i);
					EList<DynamicLabel>labs = partitioner.partitionDecoratorLabels(sdm, threadnum);
					for (int j=0;j<labs.size();++j) {
						final IntegrationLabel diseaseLabel = (IntegrationLabel) labs.get(j);

						IntegrationLabelValue deltaLabel = (IntegrationLabelValue)diseaseLabel.getDeltaValue();
						IntegrationLabelValue copyVal = (IntegrationLabelValue)deltaLabel.copy();
						k1map.put(diseaseLabel, copyVal);
						deltaLabel.scale(h);
						deltaLabel.scale(b21);
						((IntegrationLabelValue)diseaseLabel.getProbeValue()).set(
								deltaLabel.add((IntegrationLabelValue)
										diseaseLabel.
										getCurrentValue()));	
					}
				}

				// Now get the next delta values
				for(int i=0;i<iDecorators.size();++i) {
					Decorator sdm = iDecorators.get(i); 
					((IntegrationDecorator)sdm).calculateDeltas(time, x+a2*h, timeDelta, partitioner.partitionDecoratorLabels(sdm, threadnum));
				}
				for(int i=0;i<iDecorators.size();++i) {
					Decorator sdm = iDecorators.get(i);
					((IntegrationDecorator)sdm).applyExternalDeltas(time, x+a2*h, timeDelta, partitioner.partitionDecoratorLabels(sdm, threadnum));
				}


				// Step 2 in Runge Kutta Fehlberg. 
				// Get the delta values out of each node label and
				// build a second estimate of the next value
				for(int i=0;i<iDecorators.size();++i) {
					Decorator sdm = iDecorators.get(i);
					EList<DynamicLabel>labs = partitioner.partitionDecoratorLabels(sdm, threadnum);
					for (int j=0;j<labs.size();++j) {
						final IntegrationLabel diseaseLabel = (IntegrationLabel) labs.get(j);

						IntegrationLabelValue deltaLabel = (IntegrationLabelValue)diseaseLabel.getDeltaValue();
						k2map.put(diseaseLabel,(IntegrationLabelValue)deltaLabel.copy());
						IntegrationLabelValue k1 = _k1Placeholdes.get(diseaseLabel.eClass());
						IntegrationLabelValue k2 = _k2Placeholdes.get(diseaseLabel.eClass());
						k1.set(k1map.get(diseaseLabel));
						k2.set(deltaLabel);

						IntegrationLabelValue estDelta = k1.scale(b31);
						k2.scale(b32);
						estDelta.add(k2);

						estDelta.scale(h);

						((IntegrationLabelValue)diseaseLabel.getProbeValue()).set(estDelta.add(
								(IntegrationLabelValue)diseaseLabel.
								getCurrentValue()));
					}
				}

				// Now get the next delta values
				for(int i=0;i<iDecorators.size();++i) {
					Decorator sdm = iDecorators.get(i); 
					((IntegrationDecorator)sdm).calculateDeltas(time, x+a3*h, timeDelta, partitioner.partitionDecoratorLabels(sdm, threadnum));
				}
				for(int i=0;i<iDecorators.size();++i) {
					Decorator sdm = iDecorators.get(i);
					((IntegrationDecorator)sdm).applyExternalDeltas(time, x+a3*h, timeDelta, partitioner.partitionDecoratorLabels(sdm, threadnum));
				}


				// Step 3 in Runge Kutta Fehlberg. 
				// Get the delta values out of each node label and
				// build a third estimate of the next value
				for(int i=0;i<iDecorators.size();++i) {
					Decorator sdm = iDecorators.get(i);
					EList<DynamicLabel>labs = partitioner.partitionDecoratorLabels(sdm, threadnum);
					for (int j=0;j<labs.size();++j) {
						final IntegrationLabel diseaseLabel = (IntegrationLabel) labs.get(j);

						IntegrationLabelValue deltaLabel = (IntegrationLabelValue)diseaseLabel.getDeltaValue();
						k3map.put(diseaseLabel, (IntegrationLabelValue)deltaLabel.copy());

						IntegrationLabelValue k1 = _k1Placeholdes.get(diseaseLabel.eClass());
						IntegrationLabelValue k2 = _k2Placeholdes.get(diseaseLabel.eClass());
						IntegrationLabelValue k3 = _k3Placeholdes.get(diseaseLabel.eClass());

						k1.set(k1map.get(diseaseLabel));
						k2.set(k2map.get(diseaseLabel));
						k3.set(deltaLabel);

						k1.scale(b41);
						k2.scale(b42);
						k3.scale(b43);
						IntegrationLabelValue estDelta = k1;
						estDelta.add(k2);
						estDelta.add(k3);

						estDelta.scale(h);

						((IntegrationLabelValue)diseaseLabel.getProbeValue()).set(estDelta.add(
								(IntegrationLabelValue)diseaseLabel.
								getCurrentValue()));
					}	
				}

				// Now get the next delta values
				for(int i=0;i<iDecorators.size();++i) {
					Decorator sdm = iDecorators.get(i); 
					((IntegrationDecorator)sdm).calculateDeltas(time, x+a4*h, timeDelta, partitioner.partitionDecoratorLabels(sdm, threadnum));
				}
				for(int i=0;i<iDecorators.size();++i) {
					Decorator sdm = iDecorators.get(i);
					((IntegrationDecorator)sdm).applyExternalDeltas(time, x+a4*h, timeDelta, partitioner.partitionDecoratorLabels(sdm, threadnum));
				}


				// Step 4 in Runge Kutta Fehlberg. 
				// Get the delta values out of each node label and
				// build a fourth estimate of the next value
				for(int i=0;i<iDecorators.size();++i) {
					Decorator sdm = iDecorators.get(i);
					EList<DynamicLabel>labs = partitioner.partitionDecoratorLabels(sdm, threadnum);
					for (int j=0;j<labs.size();++j) {
						final IntegrationLabel diseaseLabel = (IntegrationLabel) labs.get(j);

						IntegrationLabelValue deltaLabel = (IntegrationLabelValue)diseaseLabel.getDeltaValue();
						k4map.put(diseaseLabel,(IntegrationLabelValue)deltaLabel.copy());

						IntegrationLabelValue k1 = _k1Placeholdes.get(diseaseLabel.eClass());
						IntegrationLabelValue k2 = _k2Placeholdes.get(diseaseLabel.eClass());
						IntegrationLabelValue k3 = _k3Placeholdes.get(diseaseLabel.eClass());
						IntegrationLabelValue k4 = _k4Placeholdes.get(diseaseLabel.eClass());

						k1.set(k1map.get(diseaseLabel));
						k2.set(k2map.get(diseaseLabel));
						k3.set(k3map.get(diseaseLabel));
						k4.set(deltaLabel);

						k1.scale(b51);
						k2.scale(b52);
						k3.scale(b53);
						k4.scale(b54);

						IntegrationLabelValue estDelta = k1;
						estDelta.add(k2);
						estDelta.add(k3);
						estDelta.add(k4);

						estDelta.scale(h);
						((IntegrationLabelValue)diseaseLabel.getProbeValue()).set(estDelta.add(
								(IntegrationLabelValue)diseaseLabel.
								getCurrentValue()));
					}
				}

				// Now get the next delta values
				for(int i=0;i<iDecorators.size();++i) {
					Decorator sdm = iDecorators.get(i); 
					((IntegrationDecorator)sdm).calculateDeltas(time, x+a5*h, timeDelta, partitioner.partitionDecoratorLabels(sdm, threadnum));
				}
				for(int i=0;i<iDecorators.size();++i) {
					Decorator sdm = iDecorators.get(i);
					((IntegrationDecorator)sdm).applyExternalDeltas(time, x+a5*h, timeDelta, partitioner.partitionDecoratorLabels(sdm, threadnum));
				}


				// Step 5 in Runge Kutta Fehlberg. 
				// Get the delta values out of each node label and
				// build a fifth estimate of the next value
				for(int i=0;i<iDecorators.size();++i) {
					Decorator sdm = iDecorators.get(i);
					EList<DynamicLabel>labs = partitioner.partitionDecoratorLabels(sdm, threadnum);
					for (int j=0;j<labs.size();++j) {
						final IntegrationLabel diseaseLabel = (IntegrationLabel) labs.get(j);

						IntegrationLabelValue deltaLabel = (IntegrationLabelValue)diseaseLabel.getDeltaValue();
						k5map.put(diseaseLabel,(IntegrationLabelValue)deltaLabel.copy());

						IntegrationLabelValue k1 = _k1Placeholdes.get(diseaseLabel.eClass());
						IntegrationLabelValue k2 = _k2Placeholdes.get(diseaseLabel.eClass());
						IntegrationLabelValue k3 = _k3Placeholdes.get(diseaseLabel.eClass());
						IntegrationLabelValue k4 = _k4Placeholdes.get(diseaseLabel.eClass());
						IntegrationLabelValue k5 = _k5Placeholdes.get(diseaseLabel.eClass());

						k1.set(k1map.get(diseaseLabel));
						k2.set(k2map.get(diseaseLabel));
						k3.set(k3map.get(diseaseLabel));
						k4.set(k4map.get(diseaseLabel));
						k5.set(deltaLabel);

						k1.scale(b61);
						k2.scale(b62);
						k3.scale(b63);
						k4.scale(b64);
						k5.scale(b65);

						IntegrationLabelValue estDelta = k1;
						estDelta.add(k2);
						estDelta.add(k3);
						estDelta.add(k4);
						estDelta.add(k5);

						estDelta.scale(h);

						((IntegrationLabelValue)diseaseLabel.getProbeValue()).set(estDelta.add(
								(IntegrationLabelValue)diseaseLabel.
								getCurrentValue()));
					}	
				}

				// Now get the next delta values
				for(int i=0;i<iDecorators.size();++i) {
					Decorator sdm = iDecorators.get(i); 
					((IntegrationDecorator)sdm).calculateDeltas(time, x+a6*h, timeDelta, partitioner.partitionDecoratorLabels(sdm, threadnum));
				}
				for(int i=0;i<iDecorators.size();++i) {
					Decorator sdm = iDecorators.get(i);
					((IntegrationDecorator)sdm).applyExternalDeltas(time, x+a6*h, timeDelta, partitioner.partitionDecoratorLabels(sdm, threadnum));
				}


				// Step 6 in Runge Kutta Fehlberg. 
				// Calculate k6
				for(int i=0;i<iDecorators.size();++i) {
					Decorator sdm = iDecorators.get(i);
					EList<DynamicLabel>labs = partitioner.partitionDecoratorLabels(sdm, threadnum);
					for (int j=0;j<labs.size();++j) {
						final IntegrationLabel diseaseLabel = (IntegrationLabel) labs.get(j);

						IntegrationLabelValue deltaLabel = (IntegrationLabelValue)diseaseLabel.getDeltaValue();
						k6map.put(diseaseLabel,(IntegrationLabelValue)deltaLabel.copy());
					}
				}

				// Step 7 in Runge Kutta Fehlberg
				// Calculate the two estimates from k1, .. k6 values
				// and determine the maximum difference (error) between them.

				boolean success = true; // Were we able to update all labels without a large enough error?
				double maxerror = 0.0;
				for(int i=0;i<iDecorators.size();++i) {
					Decorator sdm = iDecorators.get(i);
					EList<DynamicLabel>labs = partitioner.partitionDecoratorLabels(sdm, threadnum);
					for (int j=0;j<labs.size();++j) {
						final IntegrationLabel diseaseLabel = (IntegrationLabel) labs.get(j);


						IntegrationLabelValue currentValue = (IntegrationLabelValue)diseaseLabel.getCurrentValue();

						IntegrationLabelValue k1 = _k1Placeholdes.get(diseaseLabel.eClass());
						IntegrationLabelValue k3 = _k3Placeholdes.get(diseaseLabel.eClass());
						IntegrationLabelValue k4 = _k4Placeholdes.get(diseaseLabel.eClass());
						IntegrationLabelValue k5 = _k5Placeholdes.get(diseaseLabel.eClass());
						IntegrationLabelValue k6 = _k6Placeholdes.get(diseaseLabel.eClass());

						k1.set(k1map.get(diseaseLabel));
						k3.set(k3map.get(diseaseLabel));
						k4.set(k4map.get(diseaseLabel));
						k5.set(k5map.get(diseaseLabel));
						k6.set(k6map.get(diseaseLabel));	

						k1.scale(c1);
						k3.scale(c3);
						k4.scale(c4);
						k6.scale(c6);

						// New Y
						IntegrationLabelValue yout = (IntegrationLabelValue)
								k1.add(k3).add(k4).add(k6).copy();

						yout.scale(h);
						yout.add(currentValue);



						// Get the error
						k1.set(k1map.get(diseaseLabel));
						k3.set(k3map.get(diseaseLabel));
						k4.set(k4map.get(diseaseLabel));
						k5.set(k5map.get(diseaseLabel));
						k6.set(k6map.get(diseaseLabel));	

						k1.scale(dc1);
						k3.scale(dc3);
						k4.scale(dc4);
						k5.scale(dc5);
						k6.scale(dc6);

						IntegrationLabelValue yerror = (IntegrationLabelValue) k1.add(k3).add(k4).add(k5).add(k6).copy();
						yerror.scale(h);

						yerror.divide((IntegrationLabelValue)diseaseLabel.getErrorScale());
						yerror.abs();
						double error = yerror.max();
						error /= getRelativeTolerance();

						// If min step reached, force it to accept the step and increase the step size below
						if(h < getMinStep())
							error = ERRCON;

						if(error > maxerror) {
							maxerror = error;
						}


						if(error <= 1.0) 
							finalEstimate.put(diseaseLabel, 
									(IntegrationLabelValue)yout.copy());
						else success = false;
					}
				}

				jobs[threadnum].h = h;

				// Are we done?
				if(success) {	
					// Yes, hurrah, advance x using the step size h
					x+=h;

					if(maxerror > ERRCON)
						h = SAFETY*h*Math.pow(maxerror, PGROW);
					else
						h = 5.0*h;

					//				Activator.logInformation("Success Step:"+h+" x="+x);

					// Limit to max 1
					if(h > 1.0)  h = 1.0;


					// Make sure we don't overshoot
					if(x < end && x+h > end) h = (end-x);


					// Update the current value to the new position
					for(int i=0;i<iDecorators.size();++i) {
						Decorator sdm = iDecorators.get(i);
						EList<DynamicLabel>labs = partitioner.partitionDecoratorLabels(sdm, threadnum);
						for (int j=0;j<labs.size();++j) {
							final IntegrationLabel diseaseLabel = (IntegrationLabel) labs.get(j);
							((IntegrationLabelValue)diseaseLabel.getCurrentValue()).set(finalEstimate.get(diseaseLabel));
							((IntegrationLabelValue)diseaseLabel.getProbeValue()).set(finalEstimate.get(diseaseLabel));
						}
					}


				} else {
					// At least one thread failed, change the step size
					// Problem, error too big, we need to reduce the step size
					delta = SAFETY*h*Math.pow(maxerror,PSHRNK);
					if(h > 0.0)
						h = (delta > 0.1*h)? delta:0.1*h;
					else
						h = (delta > 0.1*h)? 0.1*h:delta;

					//				Activator.logInformation("Fail h:"+h+" x="+x);

					// We didn't succeed. 

					//Reset the estimated value back to the original, the step size
					// has been reduced so we well try again.
					// Set the estimated value back to the current original value
					for(int i=0;i<iDecorators.size();++i) {
						Decorator sdm = iDecorators.get(i);
						EList<DynamicLabel>labs = partitioner.partitionDecoratorLabels(sdm, threadnum);
						for (int j=0;j<labs.size();++j) {
							final IntegrationLabel diseaseLabel = (IntegrationLabel) labs.get(j);
							((IntegrationLabelValue)diseaseLabel.getProbeValue()).set((IntegrationLabelValue)diseaseLabel.getCurrentValue());
						}
					}

				}
			} // While x < end

			jobs[threadnum].t = x;
			jobs[threadnum].h = h;


			// We're done
			for(int i=0;i<iDecorators.size();++i) {
				IntegrationDecorator sdm = iDecorators.get(i);
				EList<DynamicLabel>labs = partitioner.partitionDecoratorLabels(sdm, threadnum);
				for (int j=0;j<labs.size();++j) {
					final IntegrationLabel diseaseLabel = (IntegrationLabel) labs.get(j);


					// This is the next state for the label
					IntegrationLabelValue nextState = (IntegrationLabelValue)diseaseLabel.getNextValue();
					// This is the final value calculated at position x.
					IntegrationLabelValue newValue =  finalEstimate.get(diseaseLabel);
					// x could be larger than the requested cycle, so we do a linear interpolation
					// to fit it exactly to the requested cycle
					// *** Not needed since we always end exactly at the requested cycle
					//adjustValuesToCycle(originalState, newValue, x, cycle);

					// New value has been modified here to fit the requested cycle
					nextState.set(newValue);
					// Add stochastic noise if needed
					if(sdm.isAddStochasticNoise())
						sdm.doStochasticProcess(diseaseLabel, timeDelta);
					// The next value is valid now.
					diseaseLabel.setNextValueValid(true);
				}
			}
		}
		
		return h;
	}


	/**
	 * Reset the solver
	 * @generated NOT
	 */
	@Override
	public void reset() {
		this.setInitialized(false);
		iDecorators.clear();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RkPackage.Literals.FAST_RUNGE_KUTTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRelativeTolerance() {
		return relativeTolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativeTolerance(double newRelativeTolerance) {
		double oldRelativeTolerance = relativeTolerance;
		relativeTolerance = newRelativeTolerance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RkPackage.FAST_RUNGE_KUTTA__RELATIVE_TOLERANCE, oldRelativeTolerance, relativeTolerance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinStep() {
		return minStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinStep(double newMinStep) {
		double oldMinStep = minStep;
		minStep = newMinStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RkPackage.FAST_RUNGE_KUTTA__MIN_STEP, oldMinStep, minStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RkPackage.FAST_RUNGE_KUTTA__RELATIVE_TOLERANCE:
				return getRelativeTolerance();
			case RkPackage.FAST_RUNGE_KUTTA__MIN_STEP:
				return getMinStep();
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
			case RkPackage.FAST_RUNGE_KUTTA__RELATIVE_TOLERANCE:
				setRelativeTolerance((Double)newValue);
				return;
			case RkPackage.FAST_RUNGE_KUTTA__MIN_STEP:
				setMinStep((Double)newValue);
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
			case RkPackage.FAST_RUNGE_KUTTA__RELATIVE_TOLERANCE:
				setRelativeTolerance(RELATIVE_TOLERANCE_EDEFAULT);
				return;
			case RkPackage.FAST_RUNGE_KUTTA__MIN_STEP:
				setMinStep(MIN_STEP_EDEFAULT);
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
			case RkPackage.FAST_RUNGE_KUTTA__RELATIVE_TOLERANCE:
				return relativeTolerance != RELATIVE_TOLERANCE_EDEFAULT;
			case RkPackage.FAST_RUNGE_KUTTA__MIN_STEP:
				return minStep != MIN_STEP_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (relativeTolerance: ");
		result.append(relativeTolerance);
		result.append(", minStep: ");
		result.append(minStep);
		result.append(')');
		return result.toString();
	}

} //FastRungeKuttaImpl
