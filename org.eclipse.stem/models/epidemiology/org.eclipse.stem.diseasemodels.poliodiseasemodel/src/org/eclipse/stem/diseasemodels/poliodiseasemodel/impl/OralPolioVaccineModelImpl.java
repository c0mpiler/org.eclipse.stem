package org.eclipse.stem.diseasemodels.poliodiseasemodel.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.graph.IntegrationLabelValue;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.diseasemodels.poliodiseasemodel.OpvLabelValue;
import org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel;
import org.eclipse.stem.diseasemodels.poliodiseasemodel.PolioFactory;
import org.eclipse.stem.diseasemodels.poliodiseasemodel.PolioPackage;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.diseasemodels.standard.impl.SEIRImpl;
import org.eclipse.stem.interventions.StandardInterventionLabel;
import org.eclipse.stem.interventions.StandardInterventionLabelValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Oral Polio Vaccine Model</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.impl.OralPolioVaccineModelImpl#getEfficacyVaccine <em>Efficacy Vaccine</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.impl.OralPolioVaccineModelImpl#getReversionRate <em>Reversion Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.impl.OralPolioVaccineModelImpl#getPartialSusceptibilityVaccine <em>Partial Susceptibility Vaccine</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.impl.OralPolioVaccineModelImpl#getTransRateVaccine <em>Trans Rate Vaccine</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.impl.OralPolioVaccineModelImpl#getIncubRateVaccine <em>Incub Rate Vaccine</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.impl.OralPolioVaccineModelImpl#getInfectRecoveryRateVaccine <em>Infect Recovery Rate Vaccine</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.impl.OralPolioVaccineModelImpl#getParalyticFractionVaccine <em>Paralytic Fraction Vaccine</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.poliodiseasemodel.impl.OralPolioVaccineModelImpl#getParalyticFractionWild <em>Paralytic Fraction Wild</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OralPolioVaccineModelImpl extends
SEIRImpl implements OralPolioVaccineModel {

	/**
	 * The default value of the '{@link #getEfficacyVaccine() <em>Efficacy Vaccine</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getEfficacyVaccine()
	 * @generated
	 * @ordered
	 */
	protected static final double EFFICACY_VACCINE_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getEfficacyVaccine() <em>Efficacy Vaccine</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getEfficacyVaccine()
	 * @generated
	 * @ordered
	 */
	protected double efficacyVaccine = EFFICACY_VACCINE_EDEFAULT;

	/**
	 * To create a user defined (experimental) disease mode, the user may wish
	 * to extend the existing models but simply override two methods.
	 * computeDiseaseDeltas() sets the work flow for the model. The following
	 * example is derived from the standard code for all build in models but in
	 * the line below where we define final "double transmisionRate" we show and
	 * example modification where a periodic forcing factor { sin(freq*t) } is
	 * added to the code as an example modification.
	 * 
	 * @param time
	 *            current time
	 * @param currentState
	 *            the current state of the population
	 * @param diseaseLabel
	 *            the disease label for which the state transitions are being
	 *            computed.
	 * @param timeDelta
	 *            the time period (milliseconds) over which the population
	 *            members transition to new states
	 * @return a disease state label value that contains the number of delta
	 *         changes in each disease state
	 * 
	 *         Users can modify the method below to create their own model.
	 * 
	 * @see org.eclipse.stem.diseasemodels.standard.impl.SIImpl#computeDiseaseDeltas(StandardDiseaseModelLabelValue,
	 *      StandardDiseaseModelLabel, long)
	 * @generated NOT
	 */
	@Override
	public void calculateDeltas(STEMTime time, double t, long timeDelta, EList<DynamicLabel> labels)  {

		// adjust parameter value
		double adjustEfficacyVaccine = getEfficacyVaccine()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustReversionRate = getReversionRate() * (double) timeDelta
				/ (double) getTimePeriod();
		double adjustPatialSusceptibilityVaccine = getPartialSusceptibilityVaccine()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustTransRateVaccine = getTransRateVaccine()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustIncubRateVaccine = getIncubRateVaccine()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustRecoverRateVaccine = getInfectRecoveryRateVaccine()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustParalyticFrationVaccine = getParalyticFractionVaccine()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustParalyticFractionWild = getParalyticFractionWild()
				* (double) timeDelta / (double) getTimePeriod();

		double adjustTransRateWild = getTransmissionRate() * (double) timeDelta
				/ (double) getTimePeriod();
		double adjustIncubRateWild = 1 / (getIncubationRate()
				* (double) timeDelta / (double) getTimePeriod());
		double adjustRecoverRateWild = getRecoveryRate() * (double) timeDelta
				/ (double) getTimePeriod();

		double adjustinfectiousMortalityRate = getInfectiousMortalityRate()
				* (double) timeDelta / (double) getTimePeriod();

		for(int _i=0;_i<labels.size();++_i) {
			final DynamicLabel label =  labels.get(_i);
			IntegrationLabel ilabel = (IntegrationLabel)label;

			StandardDiseaseModelLabel diseaseLabel = (StandardDiseaseModelLabel)ilabel;
			OpvLabelValue currentOPVstate = (OpvLabelValue)ilabel.getProbeValue();
			OpvLabelValue deltaValue = (OpvLabelValue)ilabel.getDeltaValue();

			deltaValue.reset();
			
			// code goes here
			double popCount = currentOPVstate.getPopulationCount();

			// The effective Infectious population  is a dimensionles number normalize by total
			// population used in teh computation of bets*S*i where i = Ieffective/Pop.
			// This includes a correction to the current
			// infectious population (Ieffective) based on the conserved exchange of people (circulation)
			// between regions. Note that this is no the "arrivals" and "departures" which are
			// a different process.
			final double effectiveInfectiousI = getNormalizedEffectiveInfectious(diseaseLabel.getNode(), diseaseLabel, currentOPVstate.getI(), StandardPackage.Literals.SI_LABEL_VALUE__I, 
					StandardPackage.Literals.STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE, 
					StandardPackage.Literals.STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION);
			final double effectiveInfectiousV = getNormalizedEffectiveInfectious(diseaseLabel.getNode(), diseaseLabel, currentOPVstate.getV(), StandardPackage.Literals.SI_LABEL_VALUE__I, 
					StandardPackage.Literals.STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE, 
					StandardPackage.Literals.STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION);


			// rate 1
			double SVtoEV = (1 - adjustReversionRate) * adjustTransRateVaccine
					* adjustPatialSusceptibilityVaccine * currentOPVstate.getSv()
					* effectiveInfectiousV;
			// rate 2
			double SVtoEW = adjustTransRateWild * effectiveInfectiousI
					* adjustPatialSusceptibilityVaccine * currentOPVstate.getSv()
					+ adjustReversionRate * adjustTransRateVaccine
					* adjustPatialSusceptibilityVaccine * currentOPVstate.getSv()
					* effectiveInfectiousV;
			// rate 3
			double S0toEV = (1 - adjustReversionRate) * adjustTransRateVaccine
					* currentOPVstate.getS() * effectiveInfectiousV;

			// rate 4
			double S0toEW = adjustTransRateWild * effectiveInfectiousI
					* currentOPVstate.getS() + adjustReversionRate
					* adjustTransRateVaccine * currentOPVstate.getS()
					* effectiveInfectiousV;
			// rate 5
			double EVtoV = adjustIncubRateVaccine * currentOPVstate.getEv();
			// rate 6
			double EWtoIW = adjustIncubRateWild * currentOPVstate.getE();
			// rate 7
			double VtoSV = (1 - adjustEfficacyVaccine) * adjustRecoverRateVaccine
					* currentOPVstate.getV();
			// rate 8
			double VtoPV = adjustParalyticFrationVaccine * adjustEfficacyVaccine
					* adjustRecoverRateVaccine * currentOPVstate.getV();
			// rate 9
			double VtoR = (1 - adjustParalyticFrationVaccine)
					* adjustEfficacyVaccine * adjustRecoverRateVaccine
					* currentOPVstate.getV();
			// rate 10
			double IWtoR = (1 - adjustParalyticFractionWild)
					* adjustRecoverRateWild * currentOPVstate.getI();
			// rate 11
			double IWtoPW = adjustParalyticFractionWild * adjustRecoverRateWild
					* currentOPVstate.getI();
			//diseaseDeath
			double diseaseDeath = adjustinfectiousMortalityRate * (currentOPVstate.getI()+currentOPVstate.getV());


			double deltaS = -S0toEV - S0toEW;
			double deltaSv = VtoSV - SVtoEV - SVtoEW;
			double deltaE = SVtoEW + S0toEW - EWtoIW;
			double deltaEv = SVtoEV + S0toEV - EVtoV;
			double deltaV = EVtoV - VtoSV - VtoPV - VtoR - adjustinfectiousMortalityRate
					* currentOPVstate.getV();
			double deltaI = EWtoIW - IWtoR - IWtoPW - adjustinfectiousMortalityRate
					* currentOPVstate.getI();
			double deltaPv = VtoPV;
			double deltaPw = IWtoPW;
			double deltaR = VtoR + IWtoR;
			//Wrong in this case: we use # of paralysis case caused by wild polio to trigger the intervention
			//this is what used my Agent-based Model paper as well (Rahmandad & Hu, 2011)
			double deltaIncident = SVtoEW+S0toEW;


			StandardInterventionLabel scl = findInterventionLabel((Node) diseaseLabel
					.getIdentifiable());
			if (scl != null) {
				double vaccinations = ((StandardInterventionLabelValue) scl
						.getCurrentValue()).getVaccinations();
				vaccinations *= ((double) timeDelta / (double) getTimePeriod());
				double availPopVaccine = popCount - currentOPVstate.getPv()
						- currentOPVstate.getPw();

				// calculate the proportion of vaccine that each compartment could
				// be allocated
				double vaccineS = vaccinations * currentOPVstate.getS()
						/ availPopVaccine;
				double vaccineSv = vaccinations * currentOPVstate.getSv()
						/ availPopVaccine;
				double vaccineEv = vaccinations * currentOPVstate.getEv()
						/ availPopVaccine;
				double vaccineEw = vaccinations * currentOPVstate.getE()
						/ availPopVaccine;
				double vaccineV = vaccinations * currentOPVstate.getV()
						/ availPopVaccine;
				double vaccineI = vaccinations * currentOPVstate.getI()
						/ availPopVaccine;
				double vaccineR = vaccinations * currentOPVstate.getR()
						/ availPopVaccine;

				// validate # of vaccine allocated to ppl in each compartment
				if (currentOPVstate.getS() < vaccineS)
					vaccineS = currentOPVstate.getS();
				if (currentOPVstate.getSv() < vaccineSv)
					vaccineSv = currentOPVstate.getSv();
				if (currentOPVstate.getEv() < vaccineEv)
					vaccineEv = currentOPVstate.getEv();
				if (currentOPVstate.getE() < vaccineEw)
					vaccineEw = currentOPVstate.getE();
				if (currentOPVstate.getV() < vaccineV)
					vaccineV = currentOPVstate.getV();
				if (currentOPVstate.getI() < vaccineI)
					vaccineI = currentOPVstate.getI();
				if (currentOPVstate.getR() < vaccineR)
					vaccineR = currentOPVstate.getR();

				// ppl in E, I, R compartment would NOT move even though they got
				// the vaccination,
				// it is waste but hard to tell at which compartment an individual
				// is in reality
				// ppl in V compartment do NOT get any benefit from these immediate
				// vaccination campaign because they did not wait enough time
				// between each dose
				deltaS -= vaccineS;
				deltaSv -= vaccineSv;
				deltaEv += (vaccineS + vaccineSv);

				/*
				 * //if it is the response to a detected outbreak, then we only have
				 * limited vaccine for Sv and So else { deltaS -= vaccinations;
				 * deltaSv -= vaccinations; deltaR += vaccinations;
				 * 
				 * 
				 * }
				 */

			}

			// setDeltaValuetoStates
			deltaValue.setSv(deltaSv);
			deltaValue.setS(deltaS);
			deltaValue.setE(deltaE);
			deltaValue.setEv(deltaEv);
			deltaValue.setV(deltaV);
			deltaValue.setI(deltaI);
			deltaValue.setPv(deltaPv);
			deltaValue.setPw(deltaPw);
			deltaValue.setR(deltaR);
			deltaValue.setIncidence(deltaIncident);
			deltaValue.setDiseaseDeaths(diseaseDeath);

			computeAdditionalDeltasAndExchanges(ilabel, time, t, timeDelta);
		}
	} // computeTransitions

	/**
	 * @see org.eclipse.stem.diseasemodels.standard.impl.DiseaseModelImpl#createDiseaseModelLabel()
	 */
	@Override
	public DiseaseModelLabel createDiseaseModelLabel(String populationIdentifier) {
		return PolioFactory.eINSTANCE.createOpvLabel();
	} // createDiseaseModelLabel

	@Override
	public DiseaseModelLabelValue createDiseaseModelLabelValue(
			String populationIdentifier) {
		return PolioFactory.eINSTANCE.createOpvLabelValue();
	} // createDiseaseModelLabelValue

	/**
	 * Add stochastic noise
	 * 
	 * @generated NOT
	 */
	@Override
	public void doStochasticProcess(IntegrationLabel iLabel, long timeDelta) {
		//Turn next value into integers
		IntegrationLabelValue nextVal = (IntegrationLabelValue)iLabel.getNextValue();
		EList<EAttribute> attrs = nextVal.eClass().getEAllAttributes();

		for(int i=0;i<attrs.size();++i) {
			EAttribute attr = attrs.get(i);
			if(attr.getEType().getClassifierID() == EcorePackage.EDOUBLE && attr.isChangeable()) {
				nextVal.eSetDouble(attr.getFeatureID(), Math.round(nextVal.eGetDouble(attr.getFeatureID())));
			}
		}

		OpvLabelValue previousOPVLabelValue  = (OpvLabelValue)iLabel.getCurrentValue(); // before the last integration step
		double popCount = previousOPVLabelValue.getPopulationCount();
		// adjust parameter value
		double adjustReversionRate = getReversionRate() * (double) timeDelta
				/ (double) getTimePeriod();
		double adjustPatialSusceptibilityVaccine = getPartialSusceptibilityVaccine()
				* (double) timeDelta / (double) getTimePeriod();
		double adjustTransRateVaccine = getTransRateVaccine()
				* (double) timeDelta / (double) getTimePeriod();

		double adjustTransRateWild = getTransmissionRate() * (double) timeDelta
				/ (double) getTimePeriod();


		double incidenceTerm1 = (adjustTransRateWild * previousOPVLabelValue.getI()
				* adjustPatialSusceptibilityVaccine * previousOPVLabelValue.getSv()
				+ adjustReversionRate * adjustTransRateVaccine
				* adjustPatialSusceptibilityVaccine * previousOPVLabelValue.getSv()
				* previousOPVLabelValue.getV()) / popCount;
		// rate 4
		double incidenceTerm2 = (adjustTransRateWild * previousOPVLabelValue.getI()
				* previousOPVLabelValue.getS() + adjustReversionRate
				* adjustTransRateVaccine * previousOPVLabelValue.getS()
				* previousOPVLabelValue.getV()) / popCount;
		// 
		// Add stochastic noise to incidence and adjust the next value	
		OpvLabelValue next = (OpvLabelValue)iLabel.getNextValue();
		OpvLabelValue previous  = (OpvLabelValue)iLabel.getCurrentValue(); // before the last integration step

		addNoise(previous, next, PolioPackage.eINSTANCE.getOpvLabelValue_Sv(), StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_Incidence(), StandardPackage.eINSTANCE.getSEIRLabelValue_E(), incidenceTerm1/(incidenceTerm1+incidenceTerm2));
		addNoise(previous, next, StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_S(), StandardPackage.eINSTANCE.getStandardDiseaseModelLabelValue_Incidence(), StandardPackage.eINSTANCE.getSEIRLabelValue_E(), incidenceTerm2/(incidenceTerm1+incidenceTerm2));

	}

	/**
	 * The default value of the '{@link #getReversionRate() <em>Reversion Rate</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getReversionRate()
	 * @generated
	 * @ordered
	 */
	protected static final double REVERSION_RATE_EDEFAULT = 1.0E-4;

	/**
	 * The cached value of the '{@link #getReversionRate() <em>Reversion Rate</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getReversionRate()
	 * @generated
	 * @ordered
	 */
	protected double reversionRate = REVERSION_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartialSusceptibilityVaccine() <em>Partial Susceptibility Vaccine</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getPartialSusceptibilityVaccine()
	 * @generated
	 * @ordered
	 */
	protected static final double PARTIAL_SUSCEPTIBILITY_VACCINE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPartialSusceptibilityVaccine() <em>Partial Susceptibility Vaccine</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getPartialSusceptibilityVaccine()
	 * @generated
	 * @ordered
	 */
	protected double partialSusceptibilityVaccine = PARTIAL_SUSCEPTIBILITY_VACCINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransRateVaccine() <em>Trans Rate Vaccine</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getTransRateVaccine()
	 * @generated
	 * @ordered
	 */
	protected static final double TRANS_RATE_VACCINE_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getTransRateVaccine() <em>Trans Rate Vaccine</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getTransRateVaccine()
	 * @generated
	 * @ordered
	 */
	protected double transRateVaccine = TRANS_RATE_VACCINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncubRateVaccine() <em>Incub Rate Vaccine</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getIncubRateVaccine()
	 * @generated
	 * @ordered
	 */
	protected static final double INCUB_RATE_VACCINE_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getIncubRateVaccine() <em>Incub Rate Vaccine</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getIncubRateVaccine()
	 * @generated
	 * @ordered
	 */
	protected double incubRateVaccine = INCUB_RATE_VACCINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInfectRecoveryRateVaccine() <em>Infect Recovery Rate Vaccine</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getInfectRecoveryRateVaccine()
	 * @generated
	 * @ordered
	 */
	protected static final double INFECT_RECOVERY_RATE_VACCINE_EDEFAULT = 22.81;

	/**
	 * The cached value of the '{@link #getInfectRecoveryRateVaccine() <em>Infect Recovery Rate Vaccine</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getInfectRecoveryRateVaccine()
	 * @generated
	 * @ordered
	 */
	protected double infectRecoveryRateVaccine = INFECT_RECOVERY_RATE_VACCINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParalyticFractionVaccine() <em>Paralytic Fraction Vaccine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParalyticFractionVaccine()
	 * @generated
	 * @ordered
	 */
	protected static final double PARALYTIC_FRACTION_VACCINE_EDEFAULT = 7.14E-7;

	/**
	 * The cached value of the '{@link #getParalyticFractionVaccine() <em>Paralytic Fraction Vaccine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParalyticFractionVaccine()
	 * @generated
	 * @ordered
	 */
	protected double paralyticFractionVaccine = PARALYTIC_FRACTION_VACCINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParalyticFractionWild() <em>Paralytic Fraction Wild</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParalyticFractionWild()
	 * @generated
	 * @ordered
	 */
	protected static final double PARALYTIC_FRACTION_WILD_EDEFAULT = 0.0050;

	/**
	 * The cached value of the '{@link #getParalyticFractionWild() <em>Paralytic Fraction Wild</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParalyticFractionWild()
	 * @generated
	 * @ordered
	 */
	protected double paralyticFractionWild = PARALYTIC_FRACTION_WILD_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public OralPolioVaccineModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolioPackage.Literals.ORAL_POLIO_VACCINE_MODEL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getEfficacyVaccine() {
		return efficacyVaccine;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEfficacyVaccine(double newEfficacyVaccine) {
		efficacyVaccine = newEfficacyVaccine;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getReversionRate() {
		return reversionRate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setReversionRate(double newReversionRate) {
		reversionRate = newReversionRate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getPartialSusceptibilityVaccine() {
		return partialSusceptibilityVaccine;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartialSusceptibilityVaccine(
			double newPartialSusceptibilityVaccine) {
		partialSusceptibilityVaccine = newPartialSusceptibilityVaccine;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getTransRateVaccine() {
		return transRateVaccine;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransRateVaccine(double newTransRateVaccine) {
		transRateVaccine = newTransRateVaccine;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getIncubRateVaccine() {
		return incubRateVaccine;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncubRateVaccine(double newIncubRateVaccine) {
		incubRateVaccine = newIncubRateVaccine;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getInfectRecoveryRateVaccine() {
		return infectRecoveryRateVaccine;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfectRecoveryRateVaccine(double newInfectRecoveryRateVaccine) {
		infectRecoveryRateVaccine = newInfectRecoveryRateVaccine;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getParalyticFractionVaccine() {
		return paralyticFractionVaccine;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setParalyticFractionVaccine(double newParalyticFractionVaccine) {
		paralyticFractionVaccine = newParalyticFractionVaccine;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getParalyticFractionWild() {
		return paralyticFractionWild;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setParalyticFractionWild(double newParalyticFractionWild) {
		paralyticFractionWild = newParalyticFractionWild;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PolioPackage.ORAL_POLIO_VACCINE_MODEL__EFFICACY_VACCINE:
			return getEfficacyVaccine();
		case PolioPackage.ORAL_POLIO_VACCINE_MODEL__REVERSION_RATE:
			return getReversionRate();
		case PolioPackage.ORAL_POLIO_VACCINE_MODEL__PARTIAL_SUSCEPTIBILITY_VACCINE:
			return getPartialSusceptibilityVaccine();
		case PolioPackage.ORAL_POLIO_VACCINE_MODEL__TRANS_RATE_VACCINE:
			return getTransRateVaccine();
		case PolioPackage.ORAL_POLIO_VACCINE_MODEL__INCUB_RATE_VACCINE:
			return getIncubRateVaccine();
		case PolioPackage.ORAL_POLIO_VACCINE_MODEL__INFECT_RECOVERY_RATE_VACCINE:
			return getInfectRecoveryRateVaccine();
		case PolioPackage.ORAL_POLIO_VACCINE_MODEL__PARALYTIC_FRACTION_VACCINE:
			return getParalyticFractionVaccine();
		case PolioPackage.ORAL_POLIO_VACCINE_MODEL__PARALYTIC_FRACTION_WILD:
			return getParalyticFractionWild();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PolioPackage.ORAL_POLIO_VACCINE_MODEL__EFFICACY_VACCINE:
			setEfficacyVaccine((Double)newValue);
			return;
		case PolioPackage.ORAL_POLIO_VACCINE_MODEL__REVERSION_RATE:
			setReversionRate((Double)newValue);
			return;
		case PolioPackage.ORAL_POLIO_VACCINE_MODEL__PARTIAL_SUSCEPTIBILITY_VACCINE:
			setPartialSusceptibilityVaccine((Double)newValue);
			return;
		case PolioPackage.ORAL_POLIO_VACCINE_MODEL__TRANS_RATE_VACCINE:
			setTransRateVaccine((Double)newValue);
			return;
		case PolioPackage.ORAL_POLIO_VACCINE_MODEL__INCUB_RATE_VACCINE:
			setIncubRateVaccine((Double)newValue);
			return;
		case PolioPackage.ORAL_POLIO_VACCINE_MODEL__INFECT_RECOVERY_RATE_VACCINE:
			setInfectRecoveryRateVaccine((Double)newValue);
			return;
		case PolioPackage.ORAL_POLIO_VACCINE_MODEL__PARALYTIC_FRACTION_VACCINE:
			setParalyticFractionVaccine((Double)newValue);
			return;
		case PolioPackage.ORAL_POLIO_VACCINE_MODEL__PARALYTIC_FRACTION_WILD:
			setParalyticFractionWild((Double)newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PolioPackage.ORAL_POLIO_VACCINE_MODEL__EFFICACY_VACCINE:
			setEfficacyVaccine(EFFICACY_VACCINE_EDEFAULT);
			return;
		case PolioPackage.ORAL_POLIO_VACCINE_MODEL__REVERSION_RATE:
			setReversionRate(REVERSION_RATE_EDEFAULT);
			return;
		case PolioPackage.ORAL_POLIO_VACCINE_MODEL__PARTIAL_SUSCEPTIBILITY_VACCINE:
			setPartialSusceptibilityVaccine(PARTIAL_SUSCEPTIBILITY_VACCINE_EDEFAULT);
			return;
		case PolioPackage.ORAL_POLIO_VACCINE_MODEL__TRANS_RATE_VACCINE:
			setTransRateVaccine(TRANS_RATE_VACCINE_EDEFAULT);
			return;
		case PolioPackage.ORAL_POLIO_VACCINE_MODEL__INCUB_RATE_VACCINE:
			setIncubRateVaccine(INCUB_RATE_VACCINE_EDEFAULT);
			return;
		case PolioPackage.ORAL_POLIO_VACCINE_MODEL__INFECT_RECOVERY_RATE_VACCINE:
			setInfectRecoveryRateVaccine(INFECT_RECOVERY_RATE_VACCINE_EDEFAULT);
			return;
		case PolioPackage.ORAL_POLIO_VACCINE_MODEL__PARALYTIC_FRACTION_VACCINE:
			setParalyticFractionVaccine(PARALYTIC_FRACTION_VACCINE_EDEFAULT);
			return;
		case PolioPackage.ORAL_POLIO_VACCINE_MODEL__PARALYTIC_FRACTION_WILD:
			setParalyticFractionWild(PARALYTIC_FRACTION_WILD_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PolioPackage.ORAL_POLIO_VACCINE_MODEL__EFFICACY_VACCINE:
			return efficacyVaccine != EFFICACY_VACCINE_EDEFAULT;
		case PolioPackage.ORAL_POLIO_VACCINE_MODEL__REVERSION_RATE:
			return reversionRate != REVERSION_RATE_EDEFAULT;
		case PolioPackage.ORAL_POLIO_VACCINE_MODEL__PARTIAL_SUSCEPTIBILITY_VACCINE:
			return partialSusceptibilityVaccine != PARTIAL_SUSCEPTIBILITY_VACCINE_EDEFAULT;
		case PolioPackage.ORAL_POLIO_VACCINE_MODEL__TRANS_RATE_VACCINE:
			return transRateVaccine != TRANS_RATE_VACCINE_EDEFAULT;
		case PolioPackage.ORAL_POLIO_VACCINE_MODEL__INCUB_RATE_VACCINE:
			return incubRateVaccine != INCUB_RATE_VACCINE_EDEFAULT;
		case PolioPackage.ORAL_POLIO_VACCINE_MODEL__INFECT_RECOVERY_RATE_VACCINE:
			return infectRecoveryRateVaccine != INFECT_RECOVERY_RATE_VACCINE_EDEFAULT;
		case PolioPackage.ORAL_POLIO_VACCINE_MODEL__PARALYTIC_FRACTION_VACCINE:
			return paralyticFractionVaccine != PARALYTIC_FRACTION_VACCINE_EDEFAULT;
		case PolioPackage.ORAL_POLIO_VACCINE_MODEL__PARALYTIC_FRACTION_WILD:
			return paralyticFractionWild != PARALYTIC_FRACTION_WILD_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (efficacyVaccine: "); //$NON-NLS-1$
		result.append(efficacyVaccine);
		result.append(", reversionRate: "); //$NON-NLS-1$
		result.append(reversionRate);
		result.append(", partialSusceptibilityVaccine: "); //$NON-NLS-1$
		result.append(partialSusceptibilityVaccine);
		result.append(", transRateVaccine: "); //$NON-NLS-1$
		result.append(transRateVaccine);
		result.append(", incubRateVaccine: "); //$NON-NLS-1$
		result.append(incubRateVaccine);
		result.append(", infectRecoveryRateVaccine: "); //$NON-NLS-1$
		result.append(infectRecoveryRateVaccine);
		result.append(", paralyticFractionVaccine: "); //$NON-NLS-1$
		result.append(paralyticFractionVaccine);
		result.append(", paralyticFractionWild: "); //$NON-NLS-1$
		result.append(paralyticFractionWild);
		result.append(')');
		return result.toString();
	}

} // OralPolioVaccineModelImpl