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
import org.eclipse.stem.diseasemodels.standard.SILabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.StandardFactory;
import org.eclipse.stem.diseasemodels.standard.StochasticSIDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.impl.SILabelValueImpl;
import org.eclipse.stem.diseasemodels.standard.impl.StandardStochasticDiseaseModelImpl;
import org.eclipse.stem.diseasemodels.standard.impl.StochasticSIDiseaseModelImpl;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Stochastic SI Disease Model</b></em>'.
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
public class StochasticSIDiseaseModelTest extends SITest {

	public static final long RANDOM_SEED = 1l;
	public static final double TEST_GAIN = 0.01d;
	private static final String DISEASE_IDENTIFIER = "StochasticSIDiseaseModel";
	public static final URI DISEASE_URI = STEMURI.createURI("diseasemodel" + "/" + DISEASE_IDENTIFIER);
	
	/**
	 * The name of the test disease (an instance of a disease model)
	 */
	public static final String TEST_SI_DISEASE_NAME = "Test Stocastic SI Disease";

	
	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @param args
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StochasticSIDiseaseModelTest.class);
	}

	/**
	 * Constructs a new Stochastic SI Disease Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * 
	 * @param name
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StochasticSIDiseaseModelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Stochastic SI Disease Model test case.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StochasticSIDiseaseModel getFixture() {
		return (StochasticSIDiseaseModel)fixture;
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
	public static StochasticSIDiseaseModel createFixture() {
		return createFixture(StandardStochasticDiseaseModelImpl.GAIN_EDEFAULT);
	} // createFixture
	
	/**
	 * Create disease model instance
	 * 
	 * @return a disease model instance for test purposes
	 */
	public static StochasticSIDiseaseModel createFixture(double newGain) {
		StochasticSIDiseaseModel diseaseModel = StandardFactory.eINSTANCE.createStochasticSIDiseaseModel();
		diseaseModel.setDiseaseName(TEST_SI_DISEASE_NAME);
		diseaseModel.getDublinCore().setTitle(TEST_SI_DISEASE_NAME);
		diseaseModel.setTimePeriod(TEST_TIME_PERIOD);
		diseaseModel.setPopulationIdentifier(TEST_POPULATION_IDENTIFIER);
		diseaseModel.setTransmissionRate(TRANSMISSION_RATE);
		diseaseModel.setRecoveryRate(RECOVERY_RATE);
		diseaseModel.setInfectiousMortalityRate(INFECTIOUS_MORTALITY_RATE);
		diseaseModel.setNonLinearityCoefficient(NON_LINEARITY_COEFFICIENT);
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
		StochasticSIDiseaseModelTesterImpl stochasticSIDiseaseModel = new StochasticSIDiseaseModelTesterImpl();
		SILabelValueImpl currentSI = new SILabelValueImpl(1000d, 40d, 20d, 10d);
		doTest(stochasticSIDiseaseModel, currentSI);
	}

//	private void doTestWithPermutations() {
//		StochasticSIDiseaseModelTesterImpl stochasticSIDiseaseModel = new StochasticSIDiseaseModelTesterImpl();
//		List<SILabelValueImpl> modelLableValues = SILabelValueTestUtil.createRandomSILabelValueImpl();
//		
//		int count1 = 0;
//		int count2 = 0;
//		System.out.println();
//		for(SILabelValueImpl currentSI: modelLableValues){
//			System.out.println(count1++);
//			for(SILabelValueImpl SIAdditions: modelLableValues){
//				System.out.println("	" + count2++);
//				for(SILabelValueImpl SIDeaths: modelLableValues){
//					//SIDeaths and SIAdditions will be modified my the test method, so we better clone them 
//					doTest(stochasticSIDiseaseModel, currentSI,
//							SIAdditions, SIDeaths);
//			 	}
//			}
//		}
//	}

	private void doTest(StochasticSIDiseaseModelTesterImpl stochasticSIDiseaseModel,
			SILabelValueImpl currentSI) {
//		stochasticSIDiseaseModel.doModelSpecificAdjustments(currentSI, RANDOM_SEED, TEST_GAIN);
		
		SILabelValueImpl oldVal = (SILabelValueImpl)EcoreUtil.copy(currentSI);
		doCalculateModelSpecificAdjustments(currentSI, RANDOM_SEED, TEST_GAIN);

		String state = getState(currentSI, oldVal);
		
		validateModelSpecificAdjustments(currentSI, oldVal,
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
			SILabelValueImpl pCurrentSI, long pRandomSeed, double pTestGain) {
		final SILabelValue currentSI = (SILabelValue) pCurrentSI;
		Random random = new Random(pRandomSeed);
		double Inoisy = currentSI.getI()* computeNoise(pTestGain, random);
		currentSI.setI(Inoisy);
		return;
	}

	private void validateModelSpecificAdjustments(SILabelValueImpl currentVal,
			SILabelValueImpl oldVal,
			String state) {

		
		try{
			currentVal.sane();
		}
		catch(Throwable t){
			throw new IllegalStateException("currentVal is insane, state is: " + state, t);
		}
		try{
			oldVal.sane();
		}
		catch(Throwable t){
			throw new IllegalStateException("oldVal is insane, state is: " + state, t);
		}

		
		
		assertTrue(String.format("currentVal has insane values %s", state), mySanityCheck(currentVal));
		assertTrue(String.format("oldVal has insane values %s", state), mySanityCheck(oldVal));
		
	}
	
	private boolean checkEqual(SILabelValueImpl pCalculatedSIAdditions,
			SILabelValueImpl pNewSIAdditions) {
		if((pCalculatedSIAdditions.getDiseaseDeaths() != pNewSIAdditions.getDiseaseDeaths()) ||
				(pCalculatedSIAdditions.getI() != pNewSIAdditions.getI()) ||
				(pCalculatedSIAdditions.getPopulationCount() != pNewSIAdditions.getPopulationCount()) ||
				(pCalculatedSIAdditions.getS() != pNewSIAdditions.getS())){
					return false;
				}
		return true;
	}

	private boolean mySanityCheck(SILabelValueImpl pSI) {
		return assertValidDouble(pSI.getI()) && 
			assertValidDouble(pSI.getS());
		
	}

	private boolean assertValidDouble(double pDouble) {
		return !(Double.isNaN(pDouble) || Double.isInfinite(pDouble));
	}

	private String getState(SILabelValueImpl pCurrentSI,
			SILabelValueImpl oldVal) {
		return String.format("\npresent state is: \nCurrentSI[%s]\n oldSI[%s]\n", 
				pCurrentSI, oldVal);
	}

	
	/**
	 * created just for testings since '{@link org.eclipse.stem.diseasemodels.standard.impl.StochasticDiseaseModelImpl#doModelSpecificAdjustments() <em>doModelSpecificAdjustments</em>}' is protected.
	 * @author eishay
	 *
	 */
	private class StochasticSIDiseaseModelTesterImpl extends StochasticSIDiseaseModelImpl{

	/*	public void doModelSpecificAdjustments(
				StandardDiseaseModelLabelValue pCurrentState,
				long pRandomSeed, double pTestGain) {
			setSeed(pRandomSeed);
			setGain(pTestGain);
			
			SILabelValueImpl oldCurrentState = SILabelValueTestUtil.cloneSILabelValueImpl((SILabelValueImpl)pCurrentState);
			super.doModelSpecificAdjustments(pCurrentState);
		}
	*/
	}
	
} // StochasticSIDiseaseModelTest
