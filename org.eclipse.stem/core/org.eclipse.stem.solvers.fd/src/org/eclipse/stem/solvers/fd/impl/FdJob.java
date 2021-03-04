package org.eclipse.stem.solvers.fd.impl;

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



import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.stem.core.model.STEMTime;

/**
 * A job for the finite difference solver
 *
 */
public class FdJob extends Job {
	
	public static final String JOB_PLUGIN_ID = "org.eclipse.stem.solvers.fd";
	public static final int JOB_ERROR_CODE = 2;
	
	public FdJob(String n, short thread, FiniteDifferenceImpl s) {
		super(n);
		this.threadnum = thread;
		this.solver = s;
	}
	
	public static int COMPUTE_DELTAS = 0;
	public static int CHECK_DELTAS = 1;
	public static int APPLY_DELTAS = 2;
	
	/**
	 * this factor determines any change to the step size. 1.0 means no change (default for FD)
	 */
	protected double adjustmentFactor = 1;

	protected double progress;
	protected double t;
	protected FiniteDifferenceImpl solver;
	
	protected STEMTime time;
	long timeDelta;
	int cycle;
	short threadnum;
	int step;
	
	public double getProgress() {
		return this.progress;
	}
	public void setProgress(double p) {
		this.progress = p;
	}
	protected IStatus run(final IProgressMonitor monitor) {
		IStatus status = Status.CANCEL_STATUS;
		
		try {
			if (step == COMPUTE_DELTAS) {
				solver.computeDeltasStep(time,t,timeDelta,threadnum);
				status = new Status(IStatus.OK, "unknownId", "");
			} else if (step == CHECK_DELTAS) {
				adjustmentFactor = solver.checkDeltasStep(threadnum);
				status = new Status(IStatus.OK, "unknownId", "");
			} else if (step == APPLY_DELTAS) {
				solver.applyDeltasStep(threadnum, timeDelta);
				status = new Status(IStatus.OK, "unknownId", "");
			}
		} catch(Throwable t) {
			 return new Status(IStatus.CANCEL, JOB_PLUGIN_ID, JOB_ERROR_CODE, t.getMessage(), t);
		}
		
		return status;
	}
}
