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

import java.util.Random;

import junit.textui.TestRunner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.common.DublinCore;
import org.eclipse.stem.diseasemodels.standard.SIRLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.StandardFactory;
import org.eclipse.stem.diseasemodels.standard.StochasticSIRDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.impl.SIRLabelValueImpl;
import org.eclipse.stem.diseasemodels.standard.impl.StandardStochasticDiseaseModelImpl;
import org.eclipse.stem.diseasemodels.standard.impl.StochasticSIRDiseaseModelImpl;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Stochastic SIR Disease Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.standard.StandardStochasticDiseaseModel#computeNoise() <em>Compute Noise</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
@SuppressWarnings("all")
public class StochasticSIRDiseaseModelTest extends SIRTest {

	public static final long RANDOM_SEED = 1l;
	public static final double TEST_GAIN = 0.01d;
	private static final String DISEASE_IDENTIFIER = "StochasticSIRDiseaseModel";
	public static final URI DISEASE_URI = STEMURI.createURI("diseasemodel" + "/" + DISEASE_IDENTIFIER);
	
	/**
	 * The name of the test disease (an instance of a disease model)
	 */
	public static final String TEST_SIR_DISEASE_NAME = "Test Stocastic SIR Disease";

	
	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param args
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StochasticSIRDiseaseModelTest.class);
	}

	/**
	 * Constructs a new Stochastic SIR Disease Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * 
	 * @param name
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StochasticSIRDiseaseModelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Stochastic SIR Disease Model test case.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StochasticSIRDiseaseModel getFixture() {
		return (StochasticSIRDiseaseModel)fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	protected void setUp() throws Exception {
		setFixture(createFixture());
		StandardDiseaseModelLabel dml = createLabelFixture();
		setLabelFixture(dml);
		fixture.setDiseaseName(DISEASE_IDENTIFIER);
		fixture.setURI(DISEASE_URI);
		DublinCore dc = fixture.getDublinCore();
		dc.setIdentifier(fixture.getURI().toString());
	} // setUp

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 * @generated NOT
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	} // tearDown

	/**
	 * Tests the '{@link org.eclipse.stem.diseasemodels.standard.StandardStochasticDiseaseModel#computeNoise() <em>Compute Noise</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stem.diseasemodels.standard.StandardStochasticDiseaseModel#computeNoise()
	 * @generated NOT
	 */
	public void testComputeNoise() {
		StandardStochasticDiseaseModelTest.staticComputeNoiseTest();
	}

	/**
	 * Create disease model instance
	 * 
	 * @return a disease model instance for test purposes
	 */
	public static StochasticSIRDiseaseModel createFixture() {
		return createFixture(StandardStochasticDiseaseModelImpl.GAIN_EDEFAULT);
	} // createFixture
	
	/**
	 * Create disease model instance
	 * 
	 * @return a disease model instance for test purposes
	 */
	public static StochasticSIRDiseaseModel createFixture(double newGain) {
		StochasticSIRDiseaseModel diseaseModel = StandardFactory.eINSTANCE.createStochasticSIRDiseaseModel();
		diseaseModel.setDiseaseName(TEST_SIR_DISEASE_NAME);
		diseaseModel.getDublinCore().setTitle(TEST_SIR_DISEASE_NAME);
		diseaseModel.setTimePeriod(TEST_TIME_PERIOD);
		diseaseModel.setPopulationIdentifier(TEST_POPULATION_IDENTIFIER);
		diseaseModel.setTransmissionRate(TRANSMISSION_RATE);
		diseaseModel.setRecoveryRate(RECOVERY_RATE);
		diseaseModel.setInfectiousMortalityRate(INFECTIOUS_MORTALITY_RATE);
		diseaseModel.setNonLinearityCoefficient(NON_LINEARITY_COEFFICIENT);
		diseaseModel.setImmunityLossRate(IMMUNITY_LOSS_RATE);
		diseaseModel.setGain(newGain);

		final DublinCore dc = diseaseModel.getDublinCore();
		diseaseModel.setURI(DISEASE_URI);
		dc.setIdentifier(diseaseModel.getURI().toString());
		return diseaseModel;
		
		
	} // createFixture

	
	/**
	 * Tests the '{@link org.eclipse.stem.diseasemodels.standard.impl.StochasticDiseaseModelImpl#doModelSpecificAdjustments() <em>doModelSpecificAdjustments</em>}' operation.
	 * @see org.eclipse.stem.diseasemodels.standard.impl.StochasticDiseaseModelImpl#doModelSpecificAdjustments()
	 * @generated NOT
	 */
	@SuppressWarnings("synthetic-access")
	public void testModelSpecificAdjustments(){
		StochasticSIRDiseaseModelTesterImpl stochasticSIRDiseaseModel = new StochasticSIRDiseaseModelTesterImpl();
		SIRLabelValueImpl currentSIR = new SIRLabelValueImpl(1000d, 40d, 30d, 20d, 10d);
		doTest(stochasticSIRDiseaseModel, currentSIR);
	}

//	@SuppressWarnings("synthetic-access")
//	private void doTestWithPermutations() {
//		StochasticSIRDiseaseModelTesterImpl stochasticSIRDiseaseModel = new StochasticSIRDiseaseModelTesterImpl();
//		List<SIRLabelValueImpl> modelLableValues = SIRLabelValueTestUtil.createRandomSIRLabelValueImpl();
//		
//		int count1 = 0;
//		int count2 = 0;
//		System.out.println();
//		for(SIRLabelValueImpl currentSIR: modelLableValues){
//			System.out.println(count1++);
//			for(SIRLabelValueImpl SIRAdditions: modelLableValues){
//				System.out.println("	" + count2++);
//				for(SIRLabelValueImpl SIRDeaths: modelLableValues){
//					//SIRDeaths and SIRAdditions will be modified my the test method, so we better clone them 
//					doTest(stochasticSIRDiseaseModel, currentSIR,
//							SIRAdditions, SIRDeaths);
//			 	}
//			}
//		}
//	}

	private void doTest(StochasticSIRDiseaseModelTesterImpl stochasticSIRDiseaseModel,
			SIRLabelValueImpl currentSIR) {
		
//		stochasticSIRDiseaseModel.doModelSpecificAdjustments(currentSIR, RANDOM_SEED, TEST_GAIN);
		SIRLabelValueImpl oldSIR= (SIRLabelValueImpl)EcoreUtil.copy(currentSIR);
		doCalculateModelSpecificAdjustments(currentSIR, RANDOM_SEED, TEST_GAIN);

		String state = getState(currentSIR, oldSIR);
		
		validateModelSpecificAdjustments(currentSIR,
				oldSIR,
				state);
	}

	/**
	 * This method returns a double precision random noise variable
	 * r between (1.0+x) and (1.0-x)
	 * where x is a product G* Math.rand(), and G is a gain factor 0<G<max noise
	 * 
	 * @param gain
	 * @param rand
	 * @return noise
	 */
	public static double computeNoise(final double gain, final Random rand) {

		double x = (2.0*rand.nextDouble())-1.0; // +/- 1
		x *= gain;
		x += 1.0;
		assert ((x>0.0)&&(x<2.0)) : "random noise should be a small perturbation Gain factor, g,  must 0.0 < g << 1.0 ";
		return x;
		
	} // getNoise
	
	
	private void doCalculateModelSpecificAdjustments(
			SIRLabelValueImpl pCurrentSIR, long pRandomSeed, double pTestGain) {
		
		final SIRLabelValue currentSI = (SIRLabelValue) pCurrentSIR;
		Random random = new Random(pRandomSeed);
		double Inoisy = currentSI.getI()* computeNoise(pTestGain, random);
		currentSI.setI(Inoisy);
		return;
				
	}

	private void validateModelSpecificAdjustments(SIRLabelValueImpl currentSIR,
			SIRLabelValueImpl oldSIR,
			String state) {

		
		try{
			currentSIR.sane();
		}
		catch(Throwable t){
			throw new IllegalStateException("currentSIR is insane, state is: " + state, t);
		}
		try{
			oldSIR.sane();
		}
		catch(Throwable t){
			throw new IllegalStateException("oldSIR is insane, state is: " + state, t);
		}

		
		
		assertTrue(String.format("currentSIR has insane values %s", state), mySanityCheck(currentSIR));
		assertTrue(String.format("oldSIR has insane values %s", state), mySanityCheck(oldSIR));

		
	}
	
	private boolean checkEqual(SIRLabelValueImpl pCalculatedSIRAdditions,
			SIRLabelValueImpl pNewSIRAdditions) {
		if((pCalculatedSIRAdditions.getDiseaseDeaths() != pNewSIRAdditions.getDiseaseDeaths()) ||
				(pCalculatedSIRAdditions.getI() != pNewSIRAdditions.getI()) ||
				(pCalculatedSIRAdditions.getPopulationCount() != pNewSIRAdditions.getPopulationCount()) ||
				(pCalculatedSIRAdditions.getR() != pNewSIRAdditions.getR()) ||
				(pCalculatedSIRAdditions.getS() != pNewSIRAdditions.getS())){
					return false;
				}
		return true;
	}

	private boolean mySanityCheck(SIRLabelValueImpl pSIR) {
		return assertValidDouble(pSIR.getI()) && 
			assertValidDouble(pSIR.getR()) && 
			assertValidDouble(pSIR.getS());
		
	}

	private boolean assertValidDouble(double pDouble) {
		return !(Double.isNaN(pDouble) || Double.isInfinite(pDouble));
	}

	private String getState(SIRLabelValueImpl pCurrentSIR,
			SIRLabelValueImpl oldSIR) {
		return String.format("\npresent state is: \nCurrentSIR[%s]\n OldSIR[%s]\n", 
				pCurrentSIR, pCurrentSIR, oldSIR);
	}

	
	/**
	 * created just for testings since '{@link org.eclipse.stem.diseasemodels.standard.impl.StochasticDiseaseModelImpl#doModelSpecificAdjustments() <em>doModelSpecificAdjustments</em>}' is protected.
	 * @author eishay
	 *
	 */
	private class StochasticSIRDiseaseModelTesterImpl extends StochasticSIRDiseaseModelImpl{

	/*	public void doModelSpecificAdjustments(
				StandardDiseaseModelLabelValue pCurrentState,
				long pRandomSeed, double pTestGain) {
			setSeed(pRandomSeed);
			setGain(pTestGain);
			
			SIRLabelValueImpl oldCurrentState = SIRLabelValueTestUtil.cloneSIRLabelValueImpl((SIRLabelValueImpl)pCurrentState);
			
			super.doModelSpecificAdjustments(pCurrentState);
		}
	*/
	}
	
} // StochasticSIRDiseaseModelTest
