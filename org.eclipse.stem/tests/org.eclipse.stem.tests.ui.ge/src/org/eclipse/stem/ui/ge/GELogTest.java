package org.eclipse.stem.ui.ge;
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
import org.junit.Assert;
import junit.framework.TestCase;

/**
 * testcase for GELOG
 *
 */
public class GELogTest extends TestCase {

	/**
	 * @param name
	 */
	public GELogTest(String name) {
		super(name);
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * 
	 */
	public void testLogOn() {
		GELog.DEBUG=true;
		GELog.debug(this.getClass(),"DEBUG option turned ON");//$NON-NLS-1$ 
		GELog.debug("test msg");//$NON-NLS-1$ 
		Assert.assertTrue(GELog.DEBUG);
	}
	/**
	 * 
	 */
	public void testLogDebug() {
		GELog.DEBUG=true;
		GELog.debug(this.getClass(),"Verify: GELogTest: ");//$NON-NLS-1$ 
		GELog.debug(this,"Verify: GELogTest: ");//$NON-NLS-1$ 
		GELog.debug("GELogTest.testLog","Verify: GELogTest.testLog: ");//$NON-NLS-1$//$NON-NLS-2$  
		Assert.assertTrue(GELog.DEBUG);
	
	}
	/**
	 * 
	 */
	public void testLogError() {
		GELog.DEBUG=true;
		GELog.error("GELogTest: error ",null);//$NON-NLS-1$ 
		
	}
	/**
	 * 
	 */
	public void testLogInfo() {
		GELog.DEBUG=true;
		GELog.info("GELogTest: info ");//$NON-NLS-1$ 
		
	}

	/**
	 * 
	 */
	public void testLogOFF() {	
		GELog.debug(this,"DEBUG option will be turned OFF");//$NON-NLS-1$ 
		GELog.DEBUG=false;
		GELog.debug(this,"DEBUG option turned OFF");//$NON-NLS-1$ 
		Assert.assertFalse(GELog.DEBUG);
	}
	
}

