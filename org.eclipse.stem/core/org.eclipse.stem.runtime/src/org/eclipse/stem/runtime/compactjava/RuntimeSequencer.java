package org.eclipse.stem.runtime.compactjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Runtime sequencer. Records how many days and simulation step size (in days) 
 * @author edlund
 *
 */
public class RuntimeSequencer implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private double days;
	private double stepSize;
	
	/**
	 * Constructor
	 */
	
	public RuntimeSequencer() {
	}
	
	
	public void setDays(double d) {
		this.days = d;
	}
	public double getDays() {
		return days;
	}
	public void setStepSize(double s) {
		this.stepSize = s;
	}
	public double getStepSize() {
		return stepSize;
	}

}

