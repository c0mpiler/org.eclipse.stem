package org.eclipse.stem.diseasemodels.standard.tests;

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

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import junit.framework.TestCase;

import org.eclipse.stem.diseasemodels.standard.impl.SEIRLabelImpl;
import org.eclipse.stem.diseasemodels.standard.impl.SEIRLabelValueImpl;


public abstract class SEIRLabelValueTestUtil extends TestCase{
	
	/**
	 * Number of random values to test with
	 */
	private static final int NUMBER_OF_RANDOMS = 0;

	/**
	 * max double value to be used in the test
	 */
	private static final double TEST_MAX_DOUBLE_VALUE = 1e12d;

	/**
	 * max long value to be used in the test
	 */
	private static final long TEST_MAX_LONG_VALUE = Long.MAX_VALUE;

	/**
	 * if there is a system property with this value then the test will be comperhensive. If not
	 * then the test will check only few cases.
	 */
	private static final String COMPERHANSIVE_TEST = "comperhensive.test";

	private static Boolean comperhensive = null;
	
	/**
	 * This method returns a list of {@link SEIRLabelValueImpl} objects.
	 * Some objects in the list are random and some not random at all.
	 * The ones that are not random represents extreme cases.
	 * The numeric values for the extreme cases are 0.0, MAX_DOUBLE, and I added the number 1.0. 
	 * The number of random numbers to test with is NUMBER_OF_RANDOMS.
	 * Note that with NUMBER_OF_RANDOMS = 0 you will have 4374 permutations of all values of {@SEIRLabelValueImpl}.
	 * If you wish to make NUMBER_OF_RANDOMS higher then 0 then be ready for a long test :-)
	 */
	public static List<SEIRLabelValueImpl> createRandomSEIRLabelValueImpl(){
		Random random = new Random();
		double[] values = new double[3 + NUMBER_OF_RANDOMS];
		values[0] = 0.0d;
		values[1] = TEST_MAX_DOUBLE_VALUE;
	    values[2] = 1.0d;
		for(int i = (values.length + 1); i < values.length; i++){
			values[i] = random.nextDouble() * TEST_MAX_DOUBLE_VALUE;
		}
		List<SEIRLabelValueImpl> modelLevelValues = new LinkedList<SEIRLabelValueImpl>();
		int iteration = 0;
		for(double s : values){
			for(double e : values){
				for(double i : values){
					for(double r : values){
						for(double births : values){
							for(double deaths : values){
								for(double diseaseDeaths : values){
									if(diseaseDeaths > deaths){
										continue;
									}
									if(skipValueSet(iteration++, diseaseDeaths, deaths, s, e, i, r)){
										continue;
									}
									SEIRLabelValueImpl modelLableValue = new SEIRLabelValueImpl(s, e, i, r, diseaseDeaths);
									assertTrue("The SEIRLabelValueImpl: " + modelLableValue + " is insane!", modelLableValue.sane());
									modelLevelValues.add(modelLableValue);
									System.out.println(modelLevelValues.size());
								}
							}
						}
					}
				}
			}
		}
	return modelLevelValues;
	}
	
	private static boolean skipValueSet(double iteration, double diseaseDeaths, double deaths, double s, double e, double i, double r) {
		if(!isComperhensive()){
			if(iteration % 500 > 1){
				//do only one of any 500 permutations
				System.out.print(".");
				return true;
			}
		}
		if(diseaseDeaths > deaths){
			return true;
		}
		double population = s + i + r;
		if(deaths > population){
			return true;
		}
		if(diseaseDeaths > population){
			return true;
		}
		return false;
	}
	
	private static boolean isComperhensive() {
		if(null != comperhensive ){
			return comperhensive.booleanValue();
		}
		String comperhensiveProperty = System.getProperty(COMPERHANSIVE_TEST);
		if(null != comperhensiveProperty){
			comperhensiveProperty = comperhensiveProperty.trim();
			if(comperhensiveProperty.equalsIgnoreCase("yes") || comperhensiveProperty.equalsIgnoreCase("true")){			
				comperhensive = Boolean.valueOf(true);
			}
		}
		if(null == comperhensive ){
			comperhensive = Boolean.valueOf(false);
		}
		return comperhensive.booleanValue();
	}
	/**
	 * Clone the SEIRLabelValueImpl
	 * @param original will not be modefiles
	 * @return a clone of 'original'
	 */
	public static SEIRLabelValueImpl cloneSEIRLabelValueImpl(SEIRLabelValueImpl original){
		SEIRLabelValueImpl value =  new SEIRLabelValueImpl(original.getS(), original.getE(), original.getI(),  
				original.getR(),  original.getDiseaseDeaths());
		return value;
	}

	/**
	 * This method returns a list of {@link SEIRLabelImpl} objects.
	 * Some objects in the list are random and some not random at all.
	 * The ones that are not random represents extreme cases.
	 * The numeric values for the extreme cases are 0.0, MAX_DOUBLE, and I added the number 1.0. 
	 * The number of random numbers to test with is NUMBER_OF_RANDOMS.
	 * Note that with NUMBER_OF_RANDOMS = 0 you will have 4374 permutations of all values of {SEIRLabelImpl}.
	 * If you wish to make NUMBER_OF_RANDOMS higher then 0 then be ready for a long test :-)
	 * 
	 */
	public List<SEIRLabelImpl> createRandomSEIRLabelImpl(){
		Random random = new Random();
		double[] values = new double[3 + NUMBER_OF_RANDOMS];
		values[0] = 0.0d;
		values[1] = TEST_MAX_DOUBLE_VALUE;
		values[2] = 1.0d;
		for(int i = 3; i < values.length; i++){
			values[i] = random.nextDouble() * TEST_MAX_DOUBLE_VALUE;
		}
		List<SEIRLabelImpl> modelLevelValues = new LinkedList<SEIRLabelImpl>();
		int iteration = 0;
		for(double s : values){
			for(double e : values){
				for(double i : values){
					for(double r : values){
						for(double births : values){
							for(double deaths : values){
								for(double diseaseDeaths : values){
									if(skipValueSet(iteration++, diseaseDeaths, deaths, s, e, i, r)){
										continue;
									}
									SEIRLabelValueTest labelValueTest = new SEIRLabelValueTest("SEIRLabelValueTest");
									SEIRLabelValueImpl labelValue = (SEIRLabelValueImpl)labelValueTest.getFixture();
									labelValue.setS(s);
									labelValue.setE(s);
									labelValue.setI(s);
									labelValue.setR(s);
									labelValue.setDiseaseDeaths(diseaseDeaths);
									assertTrue("The SEIRLabelValue: " + labelValue + " is insane!", labelValue.sane());
									// put the value in a label
									SEIRLabelTest labelTest = new SEIRLabelTest("SEIRLabelTest");
									SEIRLabelImpl label = (SEIRLabelImpl)labelTest.getFixture();
									label.setCurrentValue(labelValue);
									modelLevelValues.add(label);
								}
							}
						}
					}
				}
			}
		}
	return modelLevelValues;
	}
	
	public long[] createrandomDeltas() {
		Random random = new Random();
		long[] values = new long[2 + NUMBER_OF_RANDOMS];
		values[0] = TEST_MAX_LONG_VALUE;
		values[1] = 1l;
		for(int i = 3; i < values.length; i++){
			values[i] = random.nextLong() * TEST_MAX_LONG_VALUE;
		}
		return values;
	}
	
}
