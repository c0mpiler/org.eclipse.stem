package org.eclipse.stem.solvers.rk.impl;

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
import java.util.Iterator;
import java.util.List;

import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.FirstOrderIntegrator;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
import org.eclipse.stem.solvers.rk.ApacheCommonsMathODESolver;
import org.eclipse.stem.solvers.rk.RkPackage;
import org.eclipse.stem.ui.Activator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apache Commons Math ODE Solver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ApacheCommonsMathODESolverImpl extends SolverImpl implements ApacheCommonsMathODESolver {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApacheCommonsMathODESolverImpl() {
		super();
	}

	protected ArrayList<IntegrationDecorator> iDecorators = new ArrayList<IntegrationDecorator>();
	
	protected int[] arraySizes;
	
	protected ApacheCommonsMathODEJob [] jobs = null;
	
	/**
	 * Step one 
	 */
	@Override
	public boolean step(STEMTime time, long timeDelta, int cycle) throws SolverException {
		try {
			EList<TransformationDecorator> transDecorators = new BasicEList<TransformationDecorator>();
					
			for(Decorator decorator:this.getCanonicalGraph().getDecorators())
				if(decorator instanceof TransformationDecorator) transDecorators.add((TransformationDecorator)decorator);
			
									
			short num_threads;
			Activator act = org.eclipse.stem.ui.Activator.getDefault();
			if(act != null) {
				final IPreferenceStore preferenceStore = act.getPreferenceStore();
				num_threads = (short)preferenceStore.getInt(org.eclipse.stem.ui.preferences.PreferenceConstants.SIMULATION_THREADS);
			} else num_threads = 2; // Just so we can run inside junit test
			
			  
			if(arraySizes == null || arraySizes.length != num_threads) {
				arraySizes = new int[num_threads]; // initialized to zero
			}
				
			partitioner.setNumProcesses(num_threads);
			List<Decorator> decoratorsToIterate = new ArrayList<Decorator>(getCanonicalGraph().getDecorators());
			// Find triggers and make sure they are invoked
			for(Decorator decorator:decoratorsToIterate) {
				if(decorator instanceof Trigger || decorator instanceof TransformationDecorator) {
					decorator.updateLabels(time, timeDelta, cycle);
				}
			}		
					
			// First initialize the Y and temp label values from the current
			// label values.
					
			for(Decorator decorator:this.getCanonicalGraph().getDecorators()) {
				if(decorator instanceof IntegrationDecorator) {
					EList<DynamicLabel>allLabels = decorator.getLabelsToUpdate();
					for (final Iterator<DynamicLabel> currentStateLabelIter = allLabels.iterator(); currentStateLabelIter.hasNext();) {
						// It's a standard disease model with a standard disease model label
						final IntegrationLabel iLabel = (IntegrationLabel) currentStateLabelIter.next();
						((IntegrationLabelValue)iLabel.getProbeValue()).set((IntegrationLabelValue)iLabel.getCurrentValue());
						((IntegrationLabelValue)iLabel.getTempValue()).set((IntegrationLabelValue)iLabel.getCurrentValue());
						((IntegrationLabelValue)iLabel.getTempValue()).prepareCycle();
						((IntegrationLabelValue)iLabel.getProbeValue()).prepareCycle();
					}
				}
			}
						
			
			if(iDecorators.isEmpty()) 
				for(Decorator d:getCanonicalGraph().getDecorators()) {
					if(d instanceof IntegrationDecorator)
						iDecorators.add((IntegrationDecorator)d);
				}
			
			// Create jobs to advance one step in simulation
			if(jobs == null || jobs.length != num_threads) {
				jobs = new ApacheCommonsMathODEJob[num_threads];
				for(short n=0;n<num_threads;++n) 
					jobs[n] = new ApacheCommonsMathODEJob("Worker "+n, n, this);
			}
			
			for(int n=0;n<num_threads;++n) {
				jobs[n].setCycle(cycle);
				jobs[n].setTimeDelta(timeDelta);
				jobs[n].setTime(time);
			}
			
			
			for(int n=0;n<num_threads;++n)
				jobs[n].schedule();
			
			for(int n=0;n<num_threads;++n)
				jobs[n].join();
			
		} catch(Throwable t) {
			throw new SolverException(t.getMessage(), null, t);
		}
		return true;
	}

	protected void _step(STEMTime time, long timeDelta, int cycle, short threadnum) throws SolverException {
		// The initial value y0 will be a (potentially very large) array containing the 
		// values for each decorator and each patch. Figure out how large the array needs to be

		double [] y0;
		if(arraySizes[threadnum] == 0) { // need to recompute the array size for this thread
			int size=0;
			for(IntegrationDecorator sdm:iDecorators) {
				// We need to use the partitioner to make sure this works in distributed STEM
				EList<DynamicLabel> list = partitioner.partitionDecoratorLabels(sdm, threadnum);
				// We need to check all since it's not guaranteed that the labels a decorator
				// is updating all are the same size
				for(int j=0;j<list.size();++j)
					size += list.get(j).getCurrentValue().eClass().getEAllAttributes().size();

			}
			arraySizes[threadnum] = size;
		}

		// If there's nothing to do just return
		if(arraySizes[threadnum] == 0)
			return;
		
		y0 = new double[arraySizes[threadnum]];

		int index = 0;
		for(IntegrationDecorator sdm:iDecorators)  {
			EList<DynamicLabel> elist =  partitioner.partitionDecoratorLabels(sdm, threadnum);
			for(int i=0;i<elist.size();++i) {
				DynamicLabel lab = elist.get(i);
				int sz = lab.getCurrentValue().eClass().getEAllAttributes().size();
				double []ytmp = null;
				ytmp = new double[sz];

				// We must use the temp value. It was copied from the current value above 
				// but it's been prepared ensuring that variables such as incidence has been reset.
				getValues(((IntegrationLabel)lab).getTempValue(), ytmp);
				for(int j=0;j<ytmp.length;++j)
					y0[index++]=ytmp[j];
			}
		}

		double t0 = (double)(cycle); // cycle starts at 1, t starts at 0
		STEMDiffEquation sde = new STEMDiffEquation(time, timeDelta, threadnum);

		FirstOrderIntegrator foInt = createIntegrator();

		// Integrate
		try {
			foInt.integrate(sde, t0, y0, t0+1.0, y0);
		} catch(Exception e) {
			throw new SolverException(e.getMessage(), null, e);
		}

		index = 0;
		for(IntegrationDecorator sdm:iDecorators) {
			EList<DynamicLabel> labels = partitioner.partitionDecoratorLabels(sdm, threadnum);
			for(int i=0;i<labels.size();++i) {
				DynamicLabel lab = labels.get(i);
				int sz = lab.getCurrentValue().eClass().getEAllAttributes().size();
				double []ytmp =null;
				ytmp = new double[sz];

				for(int j=0;j<ytmp.length;++j)
					ytmp[j] = y0[index++];
				setValues((IntegrationLabelValue)lab.getNextValue(), ytmp);

				if(sdm.isAddStochasticNoise())
					sdm.doStochasticProcess((IntegrationLabel)lab, timeDelta);

				lab.setNextValueValid(true);
			}
		}
	}
	
	public class STEMDiffEquation implements FirstOrderDifferentialEquations {
		STEMTime time;
		long timeDelta;
		EList<DynamicLabel> labelList = new BasicEList<DynamicLabel>();
		int threadnum;

		public STEMDiffEquation(STEMTime t, long timeDelta, int threadnum) {
			this.time = t;
			this.timeDelta = timeDelta;
			this.threadnum = threadnum;
		}

		public int getDimension() {
			return arraySizes[threadnum];
		}

		public void computeDerivatives(double t, double[] y, double[] yDot) {
			int index = 0;
			double [] ytemp = null;
			for(int i=0;i<iDecorators.size();++i) {
				IntegrationDecorator sdm = iDecorators.get(i);
				EList<DynamicLabel> llist = ApacheCommonsMathODESolverImpl.this.partitioner.partitionDecoratorLabels(sdm, threadnum);
				for(int k=0;k<llist.size();++k) {
					DynamicLabel l = llist.get(k);
					// Set both probe and temp. When (if) we decide to handle multi-threaded code,
					// we need to revisit this and figure out how to set the two values. Temp
					// is supposed to be safe to read by another concurrent thread.
					IntegrationLabelValue probeV = ((IntegrationLabel)l).getProbeValue();
					//IntegrationLabelValue tempV = ((IntegrationLabel)l).getTempValue();
					int dim =  probeV.eClass().getEAllAttributes().size();
					ytemp = new double[dim];

					for(int m=0;m<dim;++m)
						ytemp[m] = y[index++];

					ApacheCommonsMathODESolverImpl.this.setValues(probeV, ytemp);
					//ApacheCommonsMathODESolverImpl.this.setValues(tempV, ytemp);
				}

			}

			// Do the magic
			for(int i=0;i<iDecorators.size();++i) {
				IntegrationDecorator sdm = iDecorators.get(i);
				EList<DynamicLabel> labels = ApacheCommonsMathODESolverImpl.this.partitioner.partitionDecoratorLabels(sdm, threadnum);
				sdm.calculateDeltas(time, t, timeDelta, labels);	
			}
			for(int i=0;i<iDecorators.size();++i) {
				IntegrationDecorator sdm = iDecorators.get(i);
				EList<DynamicLabel> labels = ApacheCommonsMathODESolverImpl.this.partitioner.partitionDecoratorLabels(sdm, threadnum);
				sdm.applyExternalDeltas(time, t, timeDelta, labels);
			}

			// Copy over the deltas to the output

			index = 0;
			for(int i=0;i<iDecorators.size();++i) {
				IntegrationDecorator sdm = iDecorators.get(i); 
				EList<DynamicLabel> llist = ApacheCommonsMathODESolverImpl.this.partitioner.partitionDecoratorLabels(sdm, threadnum);
				for(DynamicLabel l:llist) {
					IntegrationLabelValue deltaV = ((IntegrationLabel)l).getDeltaValue();
					int dim =  deltaV.eClass().getEAllAttributes().size();
					ytemp = new double[dim];

					ApacheCommonsMathODESolverImpl.this.getValues(((IntegrationLabel)l).getDeltaValue(), ytemp);

					for(int k=0;k<dim;++k)
						yDot[index++] = ytemp[k];
				}
			}
		}	
		
	} // STEMDiffEquation
	
	void getValues(IntegrationLabelValue lv, double []result) {
		// Assume order is always same here
		int i=0;
		EList<EAttribute>attrList = lv.eClass().getEAllAttributes();
		for(int j=0;j<attrList.size();++j) {
			EAttribute ea = attrList.get(j);
			result[i++] = lv.eGetDouble(ea.getFeatureID());
		}
	}
	
   void setValues(IntegrationLabelValue ilv, double [] d) {
		int i=0;
		EList<EAttribute>attrList = ilv.eClass().getEAllAttributes();
		for(int j=0;j<attrList.size();++j) {
			EAttribute ea = attrList.get(j);
			if(ea.isChangeable()) ilv.eSetDouble(ea.getFeatureID(), d[i++]);
			else i++;
		}
	}
   
	/**
	 * Reset the solver
	 * @generated NOT
	 */
	@Override
	public void reset() {
		this.setInitialized(false);
		arraySizes = null;
		jobs = null;
		iDecorators.clear();
	}
	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RkPackage.Literals.APACHE_COMMONS_MATH_ODE_SOLVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstOrderIntegrator createIntegrator() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} //ApacheCommonsMathODESolverImpl
