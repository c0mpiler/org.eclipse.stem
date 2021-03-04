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



import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.stem.core.model.STEMTime;

/**
 * A job for the finite difference solver
 *
 */
public class RkJob extends Job {
	
	public static final String JOB_PLUGIN_ID = "org.eclipse.stem.solvers.rk";
	public static final int JOB_ERROR_CODE = 2;
	
	
	public RkJob(String n, short thread, RungeKuttaImpl s) {
		super(n);
		this.threadnum = thread;
		this.solver = s;
	}

	protected double progress;
	protected double h;
	protected double t;
	protected double maxerror;
	protected RungeKuttaImpl solver;
	
	protected STEMTime time;
	long timeDelta;
	int cycle;
	short threadnum;
	
	public double getProgress() {
		return this.progress;
	}
	public void setProgress(double p) {
		this.progress = p;
	}
	protected IStatus run(final IProgressMonitor monitor) {
		try {
			solver._step(time,timeDelta,cycle,threadnum);
		} catch(Throwable t) {
			 return new Status(IStatus.CANCEL, JOB_PLUGIN_ID, JOB_ERROR_CODE, t.getMessage(), t);
		}
		return Status.OK_STATUS;
	}
}