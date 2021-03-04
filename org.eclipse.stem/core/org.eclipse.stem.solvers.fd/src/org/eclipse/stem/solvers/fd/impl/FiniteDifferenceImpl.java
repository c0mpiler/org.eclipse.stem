package org.eclipse.stem.solvers.fd.impl;

import java.util.ArrayList;

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

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.graph.IntegrationLabelValue;
import org.eclipse.stem.core.graph.LabelValue;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.model.IntegrationDecorator;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.model.TransformationDecorator;
import org.eclipse.stem.core.solver.SolverException;
import org.eclipse.stem.core.solver.impl.SolverImpl;
import org.eclipse.stem.core.trigger.Trigger;
import org.eclipse.stem.core.trigger.TriggerList;
import org.eclipse.stem.solvers.fd.FdPackage;
import org.eclipse.stem.solvers.fd.FiniteDifference;
import org.eclipse.stem.ui.Activator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Finite Difference</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.solvers.fd.impl.FiniteDifferenceImpl#getMinStep <em>Min Step</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FiniteDifferenceImpl extends SolverImpl implements
		FiniteDifference {

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
	// The worker jobs
	private FdJob[] jobs;
	// Number of threads
	private short num_threads;

	private final static int MAX_PROGRESS_REPORTS = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public FiniteDifferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public boolean step(STEMTime time, long timeDelta, int cycle) throws SolverException {

		System.currentTimeMillis();
		Activator act = org.eclipse.stem.ui.Activator.getDefault();
		if (act != null) {
			final IPreferenceStore preferenceStore = act.getPreferenceStore();
			num_threads = (short) preferenceStore
					.getInt(org.eclipse.stem.ui.preferences.PreferenceConstants.SIMULATION_THREADS);
		} else
			num_threads = 2; // Just so we can run inside junit test

		partitioner.setNumProcesses(num_threads);

		
		List<Decorator> decoratorsToIterate = new ArrayList<Decorator>(getCanonicalGraph().getDecorators());
		
		// Find triggers and make sure they are invoked
		for (Decorator decorator : decoratorsToIterate) {
			if (decorator instanceof Trigger || decorator instanceof TriggerList || decorator instanceof TransformationDecorator) {
				decorator.updateLabels(time, timeDelta, cycle);
			}
		}

		// First initialize the Y and temp label values from the current
		// label values.

		for (Decorator decorator : this.getCanonicalGraph().getDecorators()) {
			EList<DynamicLabel> allLabels = decorator.getLabelsToUpdate();
			for (final Iterator<DynamicLabel> currentStateLabelIter = allLabels
					.iterator(); currentStateLabelIter.hasNext();) {
				if (decorator instanceof IntegrationDecorator) {
					// It's a standard disease model with a standard disease
					// model label
					final IntegrationLabel iLabel = (IntegrationLabel) currentStateLabelIter
							.next();
					
					// Prepare the current value for the next cycle (i.e. reset incidences)
					((IntegrationLabelValue)iLabel.getCurrentValue()).prepareCycle();
					
					// Set the other values on the label to the current value
					((IntegrationLabelValue) iLabel.getProbeValue())
							.set((IntegrationLabelValue) iLabel
									.getCurrentValue());
					((IntegrationLabelValue) iLabel.getTempValue())
							.set((IntegrationLabelValue) iLabel
									.getCurrentValue());
					
				} else
					currentStateLabelIter.next();
			}
		}

		if (jobs == null || jobs.length != num_threads) {
			// Initialize the jobs if not done yet or of the number of threads
			// changes
			jobs = new FdJob[num_threads];

			for (int i = 0; i < num_threads; ++i) {
				final short threadnum = (short) i;
				jobs[i] = new FdJob("Finite Difference Worker " + i, threadnum,
						this);
				jobs[i].setSystem(true);
			} // For each job
		} // If not initialized

		iterativeStep(time, timeDelta, cycle);
		
		//long t2 = System.currentTimeMillis();
		//System.err.println("==> Step["+cycle+"] CPU Time: "+ (t2-t1));
		
		return true;
	}

	protected void iterativeStep(STEMTime time, long timeDelta, int cycle) throws SolverException{
		double scaling = 1.0;
		double t0 = (cycle == 0)? (double)cycle:(double)cycle-1; // start t at 0, cycle starts at 1.
		double t = t0;
		
		while (true) {
			// Compute deltas
			for (FdJob j : jobs) {
				j.cycle = cycle;
				j.time = time;
				j.timeDelta = timeDelta;
				j.t = t;
				j.step = FdJob.COMPUTE_DELTAS;
				j.schedule();
			}

			for (FdJob j : jobs) {
				try {
					j.join();
					if(j.getResult().getSeverity() == IStatus.CANCEL && j.getResult().getException() != null)
						throw new SolverException(j.getResult().getException().getMessage(), null, j.getResult().getException());
				} catch (InterruptedException ie) {
					Activator.logError(ie.getMessage(), ie);
				}
			}

			// Scale deltas
			scaleAllDeltas(scaling);

			// Check deltas for adjustment
			for (FdJob j : jobs) {
				j.step = FdJob.CHECK_DELTAS;
				j.schedule();
			}

			for (FdJob j : jobs) {
				try {
					j.join();
					if(j.getResult().getSeverity() == IStatus.CANCEL && j.getResult().getException() != null)
						throw new SolverException(j.getResult().getException().getMessage(), null, j.getResult().getException());
				} catch (InterruptedException ie) {
					Activator.logError(ie.getMessage(), ie);
				}
			}

			double factor = 1.0;

			for (FdJob j : jobs) {
				factor = Math.min(factor, j.adjustmentFactor);
			}

			if (factor == 1.0) {
				// Apply deltas
				for (FdJob j : jobs) {
					j.step = FdJob.APPLY_DELTAS;
					j.schedule();
				}

				for (FdJob j : jobs) {
					try {
						j.join();
						if(j.getResult().getSeverity() == IStatus.CANCEL && j.getResult().getException() != null)
							throw new SolverException(j.getResult().getException().getMessage(), null, j.getResult().getException());
					} catch (InterruptedException ie) {
						Activator.logError(ie.getMessage(), ie);
					}
				}

				break;
			} else if (factor > 0) {
				// Scale to avoid going negative
				scaleAllDeltas(factor);

				// Apply deltas
				for (FdJob j : jobs) {
					j.step = FdJob.APPLY_DELTAS;
					j.schedule();
				}

				for (FdJob j : jobs) {
					try {
						j.join();
						if(j.getResult().getSeverity() == IStatus.CANCEL && j.getResult().getException() != null)
							throw new SolverException(j.getResult().getException().getMessage(), null, j.getResult().getException());
					} catch (InterruptedException ie) {
						Activator.logError(ie.getMessage(), ie);
					}
				}

				// Set Probe and Temp Values and do the rest of the timestep.
				for (Decorator decorator : this.getCanonicalGraph().getDecorators()) {
					EList<DynamicLabel> allLabels = decorator
							.getLabelsToUpdate();
					for (final Iterator<DynamicLabel> currentStateLabelIter = allLabels
							.iterator(); currentStateLabelIter.hasNext();) {
						if (decorator instanceof IntegrationDecorator) {
							// It's a standard disease model with a standard
							// disease model label
							final IntegrationLabel iLabel = (IntegrationLabel) currentStateLabelIter
									.next();
							((IntegrationLabelValue) iLabel.getProbeValue())
									.set((IntegrationLabelValue) iLabel
											.getNextValue());
							((IntegrationLabelValue) iLabel.getTempValue())
									.set((IntegrationLabelValue) iLabel
											.getNextValue());
						} else
							currentStateLabelIter.next();
					}
				}

				scaling -= factor * scaling;
				t = t0 + (1-scaling);
			} else {
				System.out.println("factor: "+factor);
				Activator
						.logError(
								"Attempted finite difference step rescaling but the scaling factor was 0",
								new Exception());
				break;
			}
		}
	}

	protected void computeDeltasStep(STEMTime time, double t, long timeDelta,
			short threadnum) {
		// Now give each decorator a chance to update its dynamic
		// labels in the canonical graph, but only if it is enabled. A
		// Decorator might not be enabled if it is the action of a Trigger
		// and the Predicate of the trigger is false.
		EList<IntegrationDecorator> iDecorators = new BasicEList<IntegrationDecorator>();
		EList<TransformationDecorator> transDecorators = new BasicEList<TransformationDecorator>();
		
		
		for (final Iterator<Decorator> decoratorIter = this.getCanonicalGraph().getDecorators()
				.iterator(); decoratorIter.hasNext();) {
			final Decorator decorator = decoratorIter.next();
			// Is the decorator enabled?
			if (decorator.isEnabled()&& decorator instanceof IntegrationDecorator)
				iDecorators.add((IntegrationDecorator) decorator);
			if(decorator instanceof TransformationDecorator) transDecorators.add((TransformationDecorator)decorator);
		}

		for (IntegrationDecorator imodel : iDecorators)
			imodel.calculateDeltas(time, t, timeDelta, partitioner
					.partitionDecoratorLabels((Decorator) imodel, threadnum));
		for (IntegrationDecorator imodel : iDecorators)
			imodel.applyExternalDeltas(time, t, timeDelta, partitioner
					.partitionDecoratorLabels((Decorator) imodel, threadnum));
	}

	protected double checkDeltasStep(short threadnum) throws SolverException {
		EList<IntegrationDecorator> iDecorators = new BasicEList<IntegrationDecorator>();
		for (final Iterator<Decorator> decoratorIter = this.getCanonicalGraph().getDecorators()
				.iterator(); decoratorIter.hasNext();) {
			final Decorator decorator = decoratorIter.next();
			// Is the decorator enabled?
			if (decorator.isEnabled()
					&& decorator instanceof IntegrationDecorator)
				iDecorators.add((IntegrationDecorator) decorator);
		}

		double factor = 1.0;

		for (IntegrationDecorator imodel : iDecorators) {
			factor = Math.min(factor,
					getDeltaAdjustment((Decorator) imodel, threadnum));
		}

		return factor;
	}

	protected void applyDeltasStep(short threadnum, long timeDelta) {
		EList<IntegrationDecorator> iDecorators = new BasicEList<IntegrationDecorator>();
		for (final Iterator<Decorator> decoratorIter = this.getCanonicalGraph().getDecorators()
				.iterator(); decoratorIter.hasNext();) {
			final Decorator decorator = decoratorIter.next();
			// Is the decorator enabled?
			if (decorator.isEnabled()
					&& decorator instanceof IntegrationDecorator)
				iDecorators.add((IntegrationDecorator) decorator);
		}

		for (IntegrationDecorator imodel : iDecorators)
			updateStandardDiseaseModelLabels((Decorator) imodel, threadnum, timeDelta);
	}

	protected void scaleAllDeltas(double scaling) {
		for (Decorator decorator : this.getCanonicalGraph().getDecorators()) {
			EList<DynamicLabel> allLabels = decorator.getLabelsToUpdate();
			for (final Iterator<DynamicLabel> currentStateLabelIter = allLabels
					.iterator(); currentStateLabelIter.hasNext();) {
				if (decorator instanceof IntegrationDecorator) {
					// It's a standard disease model with a standard disease
					// model label
					final IntegrationLabel iLabel = (IntegrationLabel) currentStateLabelIter
							.next();
					((IntegrationLabelValue) iLabel.getDeltaValue())
							.scale(scaling);
				} else
					currentStateLabelIter.next();
			}
		}
	}

	protected double getDeltaAdjustment(Decorator model, short threadnum) throws SolverException {
		EList<DynamicLabel> myLabels = partitioner.partitionDecoratorLabels(
				model, threadnum);
		double factor = 1.0;

		for (final Iterator<DynamicLabel> currentStateLabelIter = myLabels
				.iterator(); currentStateLabelIter.hasNext();) {
			final IntegrationLabel label = (IntegrationLabel) currentStateLabelIter
					.next();

			IntegrationLabelValue delta = (IntegrationLabelValue) label
					.getDeltaValue();
			factor = Math.min(factor, delta
					.computeDeltaAdjustment((IntegrationLabelValue) label
							.getTempValue()));
			 
			if(factor < minStep) {
				String current = ((IntegrationLabelValue) label.getTempValue()).toString();
				String deltaSTR = ((IntegrationLabelValue) label.getDeltaValue()).toString();
				final String msg = "Error: \n FiniteDifferenceImpl.getDeltaAdjustment(): Step size is below minimum!!.\n Probably Error in Disease or Population Model: "+"current label: "+current+" deltaLabel: "+deltaSTR;
				throw new SolverException(msg, null,null);
			}
				
		}
		return factor;
	}

	protected void updateStandardDiseaseModelLabels(Decorator model,
			short threadnum, long timeDelta) {

		EList<DynamicLabel> myLabels = partitioner.partitionDecoratorLabels(
				model, threadnum);

		IntegrationDecorator imodel = (IntegrationDecorator) model;

		int numLabels = myLabels.size();
		int setProgressEveryNthNode = num_threads * numLabels
				/ (MAX_PROGRESS_REPORTS);
		if (setProgressEveryNthNode == 0)
			setProgressEveryNthNode = 1;
		int n = 0;
		// Initialize the next value from the current value and add the delta
		for (final Iterator<DynamicLabel> currentStateLabelIter = myLabels
				.iterator(); currentStateLabelIter.hasNext();) {
			final IntegrationLabel label = (IntegrationLabel) currentStateLabelIter
					.next();
			LabelValue nextState = label.getNextValue();

			LabelValue delta = ((IntegrationLabel) label).getDeltaValue();
			// For finite difference, we need to make sure we don't
			// move too many people from one state to another
			((IntegrationLabelValue) delta)
					.avoidNegative((IntegrationLabelValue) label
							.getProbeValue());
			

			nextState.reset();
			// Add delta, this will also add the incidence
			((IntegrationLabelValue) nextState)
					.add((IntegrationLabelValue) delta);

			// Add the original value. Use the temp value since the incidence
			// has been reset on it in the prepareCycle() call
			((IntegrationLabelValue) nextState)
					.add((IntegrationLabelValue) ((IntegrationLabel) label)
							.getTempValue());


			// Add stochastic noise if needed
			if(imodel.isAddStochasticNoise())
				imodel.doStochasticProcess(label, timeDelta);

			
			// The next value is valid now.
			label.setNextValueValid(true);
			// Now add in the population so we can compute the reciprocal
			// next cycle.
			// addToTotalPopulationCount(nextState.getPopulationCount());

			double progress = (double) n / (double) numLabels;
			jobs[threadnum].setProgress(progress);
			if (n % setProgressEveryNthNode == 0) {
				// Get the progress for all threads
				for (int i = 0; i < num_threads; ++i)
					if (i != threadnum && jobs[i] != null)
						progress += jobs[i].getProgress();
				progress /= num_threads;
				model.setProgress(progress);
			}
			++n;

		}
		// Done
		// this.setProgress(1.0);
	}

	/**
	 * Reset the solver
	 * 
	 * @generated NOT
	 */
	@Override
	public void reset() {
		this.setInitialized(false);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FdPackage.Literals.FINITE_DIFFERENCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FdPackage.FINITE_DIFFERENCE__MIN_STEP, oldMinStep, minStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FdPackage.FINITE_DIFFERENCE__MIN_STEP:
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
			case FdPackage.FINITE_DIFFERENCE__MIN_STEP:
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
			case FdPackage.FINITE_DIFFERENCE__MIN_STEP:
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
			case FdPackage.FINITE_DIFFERENCE__MIN_STEP:
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
		result.append(" (minStep: ");
		result.append(minStep);
		result.append(')');
		return result.toString();
	}

} // FiniteDifferenceImpl
